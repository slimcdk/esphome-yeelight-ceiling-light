package com.miot.service.log;

import android.content.Context;
import android.os.Build;
import com.miot.service.C3602R;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p011c.p012a.p039c.p040a.C0642b;
import p011c.p012a.p039c.p040a.C0643c;
import p011c.p012a.p039c.p040a.p042e.C0645a;

public class MyLogger {
    public static String LOG_ROOT = null;
    private static final int MAX_LOG_SIZE_ONE_MODEL = 10485760;
    public static final long MAX_UPLOAD_LOG_FILE_SIZE = 104857600;
    public static final String OLD_FILENAME_PATTERN = "[0-9]{1,2}\\.txt";
    private static String PACKAGE_NAME = null;
    private static final String PLUG_LOG_DIR_START = "plug_";
    private static String TAG = "SmartHome";
    public static String UPLOAD_LOG_FILE_NAME = "log.zip";
    private static SimpleDateFormat dateFormatter = new SimpleDateFormat("MM-dd HH:mm:ss.SSS");
    private static List<LogData> logs = Collections.synchronizedList(new ArrayList());
    private static Context mAppContext;
    private static SerializedAsyncTaskProcessor mAsyncProcessor;
    private static SimpleDateFormat mFormatter = new SimpleDateFormat("yyyy-MM-dd");
    private static boolean mIsLogEnable;
    private static MyLogger sInstance;
    private static Object sLock = new Object();
    private static C0642b sLogger;

    private static class LogData {
        public String dateTime;
        public String message;

        private LogData() {
        }
    }

    private MyLogger() {
    }

    public static MyLogger getInstance() {
        if (sInstance == null) {
            synchronized (sLock) {
                if (sInstance == null) {
                    sInstance = new MyLogger();
                }
            }
        }
        return sInstance;
    }

    private boolean hasStoragePermission() {
        String[] strArr = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
        if (Build.VERSION.SDK_INT >= 23) {
            return mAppContext.checkSelfPermission(strArr[0]) == 0 && mAppContext.checkSelfPermission(strArr[1]) == 0;
        }
        return true;
    }

    public static boolean isLogFileIllegal(File file) {
        if (!file.isFile() || !file.getName().endsWith(".txt")) {
            return true;
        }
        String name = file.getName();
        try {
            mFormatter.parse(name.substring(0, name.length() - 4)).getTime();
            return false;
        } catch (ParseException e) {
            e.printStackTrace();
            return true;
        }
    }

    public static boolean isPluginLogDirIllegal(File file) {
        if (!file.isDirectory() || !file.getName().startsWith(PLUG_LOG_DIR_START)) {
            return true;
        }
        for (File isLogFileIllegal : file.listFiles()) {
            if (isLogFileIllegal(isLogFileIllegal)) {
                return true;
            }
        }
        return false;
    }

    public void destory() {
        mAsyncProcessor.destroy();
    }

    public void enableLog(boolean z) {
        "MyLogger enable = " + z;
        if (!hasStoragePermission()) {
            mIsLogEnable = false;
        } else {
            mIsLogEnable = z;
        }
    }

    public String getLogFolderPath() {
        return LOG_ROOT;
    }

    public void init(Context context) {
        if (context == null) {
            mIsLogEnable = false;
            return;
        }
        mAppContext = context.getApplicationContext();
        LOG_ROOT = MiotCloudImpl.COOKIE_PATH + TAG + "/3rd-logs/";
        C0642b a = C0643c.m579a();
        sLogger = a;
        a.mo8687e(TAG);
        mAsyncProcessor = new SerializedAsyncTaskProcessor(true);
        PACKAGE_NAME = mAppContext.getPackageName();
        C0645a.m583d(mAppContext).mo8691b(C3602R.raw.microlog);
    }

    public void log(String str) {
    }

    public void log(String str, String str2) {
        log(str + Constants.COLON_SEPARATOR + str2);
    }
}
