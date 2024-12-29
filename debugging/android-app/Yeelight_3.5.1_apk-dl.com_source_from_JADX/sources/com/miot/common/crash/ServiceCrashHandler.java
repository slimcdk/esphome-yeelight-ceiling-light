package com.miot.common.crash;

import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import com.miot.common.utils.SdCardUtils;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ServiceCrashHandler implements Thread.UncaughtExceptionHandler {
    private Context mAppContext;
    private Thread.UncaughtExceptionHandler mDefaultHandler = Thread.getDefaultUncaughtExceptionHandler();

    public ServiceCrashHandler(Context context) {
        this.mAppContext = context;
    }

    public static String getStringDate() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

    public static String getThrowableStrRep(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        do {
            th.printStackTrace(printWriter);
            th = th.getCause();
        } while (th != null);
        printWriter.close();
        return stringWriter.toString();
    }

    private void saveCrashLog(String str) {
        if (SdCardUtils.isSDCardUseful()) {
            String str2 = Environment.getExternalStorageDirectory().getPath() + "/auxgroup";
            File file = new File(str2);
            if (!file.exists()) {
                file.mkdirs();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(str2 + MiotCloudImpl.COOKIE_PATH + ("service_crash_" + getStringDate() + ".log"));
            fileOutputStream.write(str.getBytes());
            fileOutputStream.close();
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        String throwableStrRep = getThrowableStrRep(th);
        StringBuilder sb = new StringBuilder();
        sb.append("throwable = ");
        sb.append(getThrowableStrRep(th));
        try {
            saveCrashLog(throwableStrRep);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Intent intent = new Intent(this.mAppContext, CrashShowActivity.class);
        intent.putExtra("crash", getThrowableStrRep(th));
        this.mAppContext.startActivity(intent);
    }
}
