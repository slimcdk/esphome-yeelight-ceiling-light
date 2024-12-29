package com.miot.service.file;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.p271io.IOUtils;

public class FileUtils {
    public static void copyAsserts(Context context, String str, String str2) {
        InputStream open = context.getResources().getAssets().open(str);
        FileOutputStream fileOutputStream = new FileOutputStream(createFileWhetherExists(str2));
        byte[] bArr = new byte[2048];
        while (true) {
            int read = open.read(bArr);
            if (read != -1) {
                fileOutputStream.write(bArr, 0, read);
            } else {
                fileOutputStream.flush();
                open.close();
                fileOutputStream.close();
                return;
            }
        }
    }

    public static boolean copyFileToFile(String str, String str2) {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            FileOutputStream fileOutputStream = new FileOutputStream(createFileWhetherExists(str2));
            byte[] bArr = new byte[2048];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileInputStream.close();
                    fileOutputStream.close();
                    return true;
                }
            }
        } catch (IOException unused) {
            return false;
        }
    }

    public static void createDirIfNotExists(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public static File createFileIfNotExists(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        File parentFile = file.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException unused) {
        }
        return file;
    }

    public static File createFileWhetherExists(String str) {
        File file = new File(str);
        File parentFile = file.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        return file;
    }

    public static void deleteDirectory(String str) {
        File[] listFiles;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists()) {
                if (file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length > 0) {
                    for (File file2 : file.listFiles()) {
                        if (file2 != null && file2.exists()) {
                            deleteDirectory(file2.getAbsolutePath());
                        }
                    }
                }
                file.delete();
            }
        }
    }

    public static boolean deleteFile(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        return file.exists() && !file.isDirectory() && file.delete();
    }

    public static boolean deleteFileOrDir(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (file.isFile()) {
            return file.exists() && file.delete();
        }
        if (!file.isDirectory()) {
            return false;
        }
        deleteDirectory(str);
        return true;
    }

    public static boolean fileExists(String str) {
        return !TextUtils.isEmpty(str) && new File(str).exists();
    }

    public static long getLastModifiedTime(String str) {
        if (!TextUtils.isEmpty(str)) {
            return new File(str).lastModified();
        }
        return 0;
    }

    public static long getSDCardAvailableBytes() {
        if (isSDCardBusy()) {
            return 0;
        }
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return ((long) statFs.getBlockSize()) * (((long) statFs.getAvailableBlocks()) - 4);
    }

    public static boolean isSDCardBusy() {
        return !Environment.getExternalStorageState().equals("mounted");
    }

    public static boolean isSDCardFull() {
        return getSDCardAvailableBytes() <= 102400;
    }

    public static boolean isSDCardUnavailable() {
        return Environment.getExternalStorageState().equals("removed");
    }

    public static String loadJSONFromAsset(Context context, String str) {
        try {
            InputStream open = context.getAssets().open(str);
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            open.close();
            return new String(bArr, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static void makeFileDirectories(String str) {
        File parentFile;
        if (!TextUtils.isEmpty(str) && (parentFile = new File(str).getParentFile()) != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
    }

    public static byte[] readFile(String str) {
        byte[] bArr = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            return bArr;
        } catch (FileNotFoundException | IOException unused) {
            return bArr;
        }
    }

    public static String readTxtFromFile(String str) {
        File file = new File(str);
        String str2 = "";
        if (file.isFile()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    str2 = str2 + readLine + IOUtils.LINE_SEPARATOR_UNIX;
                }
                fileInputStream.close();
            } catch (FileNotFoundException | IOException unused) {
            }
        }
        return str2;
    }

    public static void trimFilesToSize(File[] fileArr, long j, Comparator<File> comparator) {
        long j2 = 0;
        for (File length : fileArr) {
            j2 += length.length();
        }
        if (j2 >= j) {
            List asList = Arrays.asList(fileArr);
            if (comparator == null) {
                comparator = new Comparator<File>() {
                    public int compare(File file, File file2) {
                        return (int) (file2.length() - file.length());
                    }
                };
            }
            Collections.sort(asList, comparator);
            Iterator it = asList.iterator();
            while (j2 > j && it.hasNext()) {
                File file = (File) it.next();
                j2 -= file.length();
                deleteFileOrDir(file.getPath());
            }
        }
    }
}
