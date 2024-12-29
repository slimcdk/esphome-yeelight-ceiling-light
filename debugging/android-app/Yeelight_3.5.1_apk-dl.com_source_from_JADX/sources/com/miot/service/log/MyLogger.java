package com.miot.service.log;

import android.content.Context;
import android.os.Build;
import com.miot.service.C2875R;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p080p0.C3592a;
import p080p0.C3593b;
import p088r0.C3622a;

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
    private static C3592a sLogger;

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
        StringBuilder sb = new StringBuilder();
        sb.append("MyLogger enable = ");
        sb.append(z);
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
        C3592a a = C3593b.m10182a();
        sLogger = a;
        a.mo25882r(TAG);
        mAsyncProcessor = new SerializedAsyncTaskProcessor(true);
        PACKAGE_NAME = mAppContext.getPackageName();
        C3622a.m10305d(mAppContext).mo25923b(C2875R.raw.microlog);
    }

    public void log(String str) {
    }

    public void log(String str, String str2) {
        log(str + Constants.COLON_SEPARATOR + str2);
    }
}
