package com.miot.service.log;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.MainThread;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class SerializedAsyncTaskProcessor {
    private static final int MSG_AFTER_EXECUTE = 1;
    private static final int MSG_BEFORE_EXECUTE = 0;
    private final boolean mIsDaemon;
    /* access modifiers changed from: private */
    public Handler mMainThreadHandler;
    private ProcessPackageThread mProcessThread;
    /* access modifiers changed from: private */
    public volatile boolean threadQuit;

    private class ProcessPackageThread extends Thread {
        private static final String THREAD_NAME = "PackageProcessor";
        /* access modifiers changed from: private */
        public final LinkedBlockingQueue<SerializedAsyncTask> mTasks = new LinkedBlockingQueue<>();

        public ProcessPackageThread() {
            super(THREAD_NAME);
        }

        public void insertTask(SerializedAsyncTask serializedAsyncTask) {
            this.mTasks.add(serializedAsyncTask);
        }

        public void run() {
            while (!SerializedAsyncTaskProcessor.this.threadQuit) {
                try {
                    SerializedAsyncTask poll = this.mTasks.poll(1, TimeUnit.HOURS);
                    if (poll != null && !SerializedAsyncTaskProcessor.this.threadQuit) {
                        SerializedAsyncTaskProcessor.this.mMainThreadHandler.sendMessage(SerializedAsyncTaskProcessor.this.mMainThreadHandler.obtainMessage(0, poll));
                        poll.process();
                        SerializedAsyncTaskProcessor.this.mMainThreadHandler.sendMessage(SerializedAsyncTaskProcessor.this.mMainThreadHandler.obtainMessage(1, poll));
                    }
                } catch (InterruptedException e) {
                    MyLogger.getInstance().log(e.getMessage());
                }
            }
        }
    }

    public static abstract class SerializedAsyncTask {
        public void postProcess() {
        }

        public void preProcess() {
        }

        public abstract void process();
    }

    public SerializedAsyncTaskProcessor() {
        this(false);
    }

    public SerializedAsyncTaskProcessor(boolean z) {
        this.mMainThreadHandler = null;
        this.threadQuit = false;
        this.mMainThreadHandler = new Handler(Looper.getMainLooper()) {
            public void handleMessage(Message message) {
                SerializedAsyncTask serializedAsyncTask = (SerializedAsyncTask) message.obj;
                int i = message.what;
                if (i == 0) {
                    serializedAsyncTask.preProcess();
                } else if (i == 1) {
                    serializedAsyncTask.postProcess();
                }
                super.handleMessage(message);
            }
        };
        this.mIsDaemon = z;
    }

    @MainThread
    public void addNewTask(SerializedAsyncTask serializedAsyncTask) {
        if (this.mProcessThread == null) {
            ProcessPackageThread processPackageThread = new ProcessPackageThread();
            this.mProcessThread = processPackageThread;
            processPackageThread.setDaemon(this.mIsDaemon);
            this.mProcessThread.start();
        }
        this.mProcessThread.insertTask(serializedAsyncTask);
    }

    public void addNewTaskWithDelayed(final SerializedAsyncTask serializedAsyncTask, long j) {
        this.mMainThreadHandler.postDelayed(new Runnable() {
            public void run() {
                SerializedAsyncTaskProcessor.this.addNewTask(serializedAsyncTask);
            }
        }, j);
    }

    public void clearTask() {
        ProcessPackageThread processPackageThread = this.mProcessThread;
        if (processPackageThread != null) {
            processPackageThread.mTasks.clear();
        }
    }

    public void destroy() {
        this.threadQuit = true;
        addNewTask(new SerializedAsyncTask() {
            public void process() {
            }
        });
    }
}
