package com.miot.service.common.workexecutor;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class WorkExecutor implements Runnable {
    private static final int MAX_ACTIONS = 128;
    private static final String TAG = "WorkExecutor";
    private BlockingQueue<Job> mJobsQueue;
    private Thread mThread;
    private Map<Class<?>, Worker> mWorkers;

    public WorkExecutor() {
        this.mThread = null;
        this.mJobsQueue = null;
        this.mWorkers = new HashMap();
        this.mJobsQueue = new ArrayBlockingQueue(128);
    }

    private void destroyWorkers() {
        for (Worker destory : this.mWorkers.values()) {
            destory.destory();
        }
    }

    private void initWorkers() {
        for (Worker init : this.mWorkers.values()) {
            init.init();
        }
    }

    public void addWorker(Class<?> cls, Worker worker) {
        this.mWorkers.put(cls, worker);
    }

    public synchronized void clear() {
        this.mJobsQueue.clear();
    }

    public synchronized int put(Job job) {
        this.mJobsQueue.add(job);
        return 0;
    }

    public void run() {
        initWorkers();
        while (true) {
            try {
                Job take = this.mJobsQueue.take();
                if (take instanceof JobStop) {
                    break;
                }
                Worker worker = this.mWorkers.get(take.getClass());
                if (worker == null) {
                    String.format("worker not found, %s job not execute!", new Object[]{take.getClass().getSimpleName()});
                } else {
                    worker.execute(take);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.mJobsQueue.clear();
        destroyWorkers();
    }

    public void start() {
        if (this.mThread == null) {
            Thread thread = new Thread(this);
            this.mThread = thread;
            thread.start();
        }
    }

    public void stop() {
        if (this.mThread != null) {
            clear();
            put(new JobStop());
            this.mThread = null;
        }
    }
}
