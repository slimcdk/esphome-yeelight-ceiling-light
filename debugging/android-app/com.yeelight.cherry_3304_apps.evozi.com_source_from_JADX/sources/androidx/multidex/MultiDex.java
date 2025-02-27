package androidx.multidex;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

public final class MultiDex {
    private static final String CODE_CACHE_NAME = "code_cache";
    private static final String CODE_CACHE_SECONDARY_FOLDER_NAME = "secondary-dexes";
    private static final boolean IS_VM_MULTIDEX_CAPABLE = isVMMultidexCapable(System.getProperty("java.vm.version"));
    private static final int MAX_SUPPORTED_SDK_VERSION = 20;
    private static final int MIN_SDK_VERSION = 4;
    private static final String NO_KEY_PREFIX = "";
    private static final String OLD_SECONDARY_FOLDER_NAME = "secondary-dexes";
    static final String TAG = "MultiDex";
    private static final int VM_WITH_MULTIDEX_VERSION_MAJOR = 2;
    private static final int VM_WITH_MULTIDEX_VERSION_MINOR = 1;
    private static final Set<File> installedApk = new HashSet();

    private static final class V14 {
        private static final int EXTRACTED_SUFFIX_LENGTH = 4;
        private final ElementConstructor elementConstructor;

        private interface ElementConstructor {
            Object newInstance(File file, DexFile dexFile);
        }

        private static class ICSElementConstructor implements ElementConstructor {
            private final Constructor<?> elementConstructor;

            ICSElementConstructor(Class<?> cls) {
                Constructor<?> constructor = cls.getConstructor(new Class[]{File.class, ZipFile.class, DexFile.class});
                this.elementConstructor = constructor;
                constructor.setAccessible(true);
            }

            public Object newInstance(File file, DexFile dexFile) {
                return this.elementConstructor.newInstance(new Object[]{file, new ZipFile(file), dexFile});
            }
        }

        private static class JBMR11ElementConstructor implements ElementConstructor {
            private final Constructor<?> elementConstructor;

            JBMR11ElementConstructor(Class<?> cls) {
                Constructor<?> constructor = cls.getConstructor(new Class[]{File.class, File.class, DexFile.class});
                this.elementConstructor = constructor;
                constructor.setAccessible(true);
            }

            public Object newInstance(File file, DexFile dexFile) {
                return this.elementConstructor.newInstance(new Object[]{file, file, dexFile});
            }
        }

        private static class JBMR2ElementConstructor implements ElementConstructor {
            private final Constructor<?> elementConstructor;

            JBMR2ElementConstructor(Class<?> cls) {
                Constructor<?> constructor = cls.getConstructor(new Class[]{File.class, Boolean.TYPE, File.class, DexFile.class});
                this.elementConstructor = constructor;
                constructor.setAccessible(true);
            }

            public Object newInstance(File file, DexFile dexFile) {
                return this.elementConstructor.newInstance(new Object[]{file, Boolean.FALSE, file, dexFile});
            }
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private V14() {
            /*
                r2 = this;
                r2.<init>()
                java.lang.String r0 = "dalvik.system.DexPathList$Element"
                java.lang.Class r0 = java.lang.Class.forName(r0)
                androidx.multidex.MultiDex$V14$ICSElementConstructor r1 = new androidx.multidex.MultiDex$V14$ICSElementConstructor     // Catch:{ NoSuchMethodException -> 0x000f }
                r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x000f }
                goto L_0x001a
            L_0x000f:
                androidx.multidex.MultiDex$V14$JBMR11ElementConstructor r1 = new androidx.multidex.MultiDex$V14$JBMR11ElementConstructor     // Catch:{ NoSuchMethodException -> 0x0015 }
                r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x0015 }
                goto L_0x001a
            L_0x0015:
                androidx.multidex.MultiDex$V14$JBMR2ElementConstructor r1 = new androidx.multidex.MultiDex$V14$JBMR2ElementConstructor
                r1.<init>(r0)
            L_0x001a:
                r2.elementConstructor = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.multidex.MultiDex.V14.<init>():void");
        }

        static void install(ClassLoader classLoader, List<? extends File> list) {
            Object obj = MultiDex.findField(classLoader, "pathList").get(classLoader);
            Object[] makeDexElements = new V14().makeDexElements(list);
            try {
                MultiDex.expandFieldArray(obj, "dexElements", makeDexElements);
            } catch (NoSuchFieldException unused) {
                MultiDex.expandFieldArray(obj, "pathElements", makeDexElements);
            }
        }

        private Object[] makeDexElements(List<? extends File> list) {
            int size = list.size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                File file = (File) list.get(i);
                objArr[i] = this.elementConstructor.newInstance(file, DexFile.loadDex(file.getPath(), optimizedPathFor(file), 0));
            }
            return objArr;
        }

        private static String optimizedPathFor(File file) {
            File parentFile = file.getParentFile();
            String name = file.getName();
            return new File(parentFile, name.substring(0, name.length() - EXTRACTED_SUFFIX_LENGTH) + ".dex").getPath();
        }
    }

    private static final class V19 {
        private V19() {
        }

        static void install(ClassLoader classLoader, List<? extends File> list, File file) {
            IOException[] iOExceptionArr;
            Object obj = MultiDex.findField(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            MultiDex.expandFieldArray(obj, "dexElements", makeDexElements(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    IOException iOException = (IOException) it.next();
                }
                Field access$000 = MultiDex.findField(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) access$000.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[(arrayList.size() + iOExceptionArr2.length)];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                access$000.set(obj, iOExceptionArr);
                IOException iOException2 = new IOException("I/O exception during makeDexElement");
                iOException2.initCause((Throwable) arrayList.get(0));
                throw iOException2;
            }
        }

        private static Object[] makeDexElements(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) {
            return (Object[]) MultiDex.findMethod(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, new Object[]{arrayList, file, arrayList2});
        }
    }

    /* renamed from: androidx.multidex.MultiDex$V4 */
    private static final class C0299V4 {
        private C0299V4() {
        }

        static void install(ClassLoader classLoader, List<? extends File> list) {
            int size = list.size();
            Field access$000 = MultiDex.findField(classLoader, "path");
            StringBuilder sb = new StringBuilder((String) access$000.get(classLoader));
            String[] strArr = new String[size];
            File[] fileArr = new File[size];
            ZipFile[] zipFileArr = new ZipFile[size];
            DexFile[] dexFileArr = new DexFile[size];
            ListIterator<? extends File> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                File file = (File) listIterator.next();
                String absolutePath = file.getAbsolutePath();
                sb.append(':');
                sb.append(absolutePath);
                int previousIndex = listIterator.previousIndex();
                strArr[previousIndex] = absolutePath;
                fileArr[previousIndex] = file;
                zipFileArr[previousIndex] = new ZipFile(file);
                dexFileArr[previousIndex] = DexFile.loadDex(absolutePath, absolutePath + ".dex", 0);
            }
            access$000.set(classLoader, sb.toString());
            MultiDex.expandFieldArray(classLoader, "mPaths", strArr);
            MultiDex.expandFieldArray(classLoader, "mFiles", fileArr);
            MultiDex.expandFieldArray(classLoader, "mZips", zipFileArr);
            MultiDex.expandFieldArray(classLoader, "mDexs", dexFileArr);
        }
    }

    private MultiDex() {
    }

    private static void clearOldDexDir(Context context) {
        StringBuilder sb;
        String str;
        String str2;
        StringBuilder sb2;
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            "Clearing old secondary dex dir (" + file.getPath() + ").";
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                "Failed to list secondary dex dir content (" + file.getPath() + ").";
                return;
            }
            for (File file2 : listFiles) {
                "Trying to delete old file " + file2.getPath() + " of size " + file2.length();
                if (!file2.delete()) {
                    sb2 = new StringBuilder();
                    str2 = "Failed to delete old file ";
                } else {
                    sb2 = new StringBuilder();
                    str2 = "Deleted old file ";
                }
                sb2.append(str2);
                sb2.append(file2.getPath());
                sb2.toString();
            }
            if (!file.delete()) {
                sb = new StringBuilder();
                str = "Failed to delete secondary dex dir ";
            } else {
                sb = new StringBuilder();
                str = "Deleted old secondary dex dir ";
            }
            sb.append(str);
            sb.append(file.getPath());
            sb.toString();
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x005a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0087 */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007f A[SYNTHETIC, Splitter:B:34:0x007f] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0081 A[Catch:{ RuntimeException -> 0x0088 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void doInstallation(android.content.Context r4, java.io.File r5, java.io.File r6, java.lang.String r7, java.lang.String r8, boolean r9) {
        /*
            java.util.Set<java.io.File> r0 = installedApk
            monitor-enter(r0)
            java.util.Set<java.io.File> r1 = installedApk     // Catch:{ all -> 0x008a }
            boolean r1 = r1.contains(r5)     // Catch:{ all -> 0x008a }
            if (r1 == 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x008a }
            return
        L_0x000d:
            java.util.Set<java.io.File> r1 = installedApk     // Catch:{ all -> 0x008a }
            r1.add(r5)     // Catch:{ all -> 0x008a }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x008a }
            r2 = 20
            if (r1 <= r2) goto L_0x004f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            r1.<init>()     // Catch:{ all -> 0x008a }
            java.lang.String r3 = "MultiDex is not guaranteed to work in SDK version "
            r1.append(r3)     // Catch:{ all -> 0x008a }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x008a }
            r1.append(r3)     // Catch:{ all -> 0x008a }
            java.lang.String r3 = ": SDK version higher than "
            r1.append(r3)     // Catch:{ all -> 0x008a }
            r1.append(r2)     // Catch:{ all -> 0x008a }
            java.lang.String r2 = " should be backed by "
            r1.append(r2)     // Catch:{ all -> 0x008a }
            java.lang.String r2 = "runtime with built-in multidex capabilty but it's not the "
            r1.append(r2)     // Catch:{ all -> 0x008a }
            java.lang.String r2 = "case here: java.vm.version=\""
            r1.append(r2)     // Catch:{ all -> 0x008a }
            java.lang.String r2 = "java.vm.version"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch:{ all -> 0x008a }
            r1.append(r2)     // Catch:{ all -> 0x008a }
            java.lang.String r2 = "\""
            r1.append(r2)     // Catch:{ all -> 0x008a }
            r1.toString()     // Catch:{ all -> 0x008a }
        L_0x004f:
            java.lang.ClassLoader r1 = r4.getClassLoader()     // Catch:{ RuntimeException -> 0x0088 }
            if (r1 != 0) goto L_0x0057
            monitor-exit(r0)     // Catch:{ all -> 0x008a }
            return
        L_0x0057:
            clearOldDexDir(r4)     // Catch:{ all -> 0x005a }
        L_0x005a:
            java.io.File r6 = getDexDir(r4, r6, r7)     // Catch:{ all -> 0x008a }
            androidx.multidex.MultiDexExtractor r7 = new androidx.multidex.MultiDexExtractor     // Catch:{ all -> 0x008a }
            r7.<init>(r5, r6)     // Catch:{ all -> 0x008a }
            r5 = 0
            r2 = 0
            java.util.List r2 = r7.load(r4, r8, r2)     // Catch:{ all -> 0x0083 }
            installSecondaryDexes(r1, r6, r2)     // Catch:{ IOException -> 0x006d }
            goto L_0x0078
        L_0x006d:
            r2 = move-exception
            if (r9 == 0) goto L_0x0082
            r9 = 1
            java.util.List r4 = r7.load(r4, r8, r9)     // Catch:{ all -> 0x0083 }
            installSecondaryDexes(r1, r6, r4)     // Catch:{ all -> 0x0083 }
        L_0x0078:
            r7.close()     // Catch:{ IOException -> 0x007c }
            goto L_0x007d
        L_0x007c:
            r5 = move-exception
        L_0x007d:
            if (r5 != 0) goto L_0x0081
            monitor-exit(r0)     // Catch:{ all -> 0x008a }
            return
        L_0x0081:
            throw r5     // Catch:{ all -> 0x008a }
        L_0x0082:
            throw r2     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r4 = move-exception
            r7.close()     // Catch:{ IOException -> 0x0087 }
        L_0x0087:
            throw r4     // Catch:{ all -> 0x008a }
        L_0x0088:
            monitor-exit(r0)     // Catch:{ all -> 0x008a }
            return
        L_0x008a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.multidex.MultiDex.doInstallation(android.content.Context, java.io.File, java.io.File, java.lang.String, java.lang.String, boolean):void");
    }

    /* access modifiers changed from: private */
    public static void expandFieldArray(Object obj, String str, Object[] objArr) {
        Field findField = findField(obj, str);
        Object[] objArr2 = (Object[]) findField.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        findField.set(obj, objArr3);
    }

    /* access modifiers changed from: private */
    public static Field findField(Object obj, String str) {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    /* access modifiers changed from: private */
    public static Method findMethod(Object obj, String str, Class<?>... clsArr) {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    private static ApplicationInfo getApplicationInfo(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    private static File getDexDir(Context context, File file, String str) {
        File file2 = new File(file, CODE_CACHE_NAME);
        try {
            mkdirChecked(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), CODE_CACHE_NAME);
            mkdirChecked(file2);
        }
        File file3 = new File(file2, str);
        mkdirChecked(file3);
        return file3;
    }

    public static void install(Context context) {
        if (!IS_VM_MULTIDEX_CAPABLE) {
            if (Build.VERSION.SDK_INT >= 4) {
                try {
                    ApplicationInfo applicationInfo = getApplicationInfo(context);
                    if (applicationInfo != null) {
                        doInstallation(context, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir), "secondary-dexes", "", true);
                    }
                } catch (Exception e) {
                    throw new RuntimeException("MultiDex installation failed (" + e.getMessage() + ").");
                }
            } else {
                throw new RuntimeException("MultiDex installation failed. SDK " + Build.VERSION.SDK_INT + " is unsupported. Min SDK version is " + 4 + ".");
            }
        }
    }

    public static void installInstrumentation(Context context, Context context2) {
        ApplicationInfo applicationInfo;
        if (!IS_VM_MULTIDEX_CAPABLE) {
            if (Build.VERSION.SDK_INT >= 4) {
                try {
                    ApplicationInfo applicationInfo2 = getApplicationInfo(context);
                    if (applicationInfo2 != null && (applicationInfo = getApplicationInfo(context2)) != null) {
                        String str = context.getPackageName() + ".";
                        File file = new File(applicationInfo.dataDir);
                        doInstallation(context2, new File(applicationInfo2.sourceDir), file, str + "secondary-dexes", str, false);
                        doInstallation(context2, new File(applicationInfo.sourceDir), file, "secondary-dexes", "", false);
                    }
                } catch (Exception e) {
                    throw new RuntimeException("MultiDex installation failed (" + e.getMessage() + ").");
                }
            } else {
                throw new RuntimeException("MultiDex installation failed. SDK " + Build.VERSION.SDK_INT + " is unsupported. Min SDK version is " + 4 + ".");
            }
        }
    }

    private static void installSecondaryDexes(ClassLoader classLoader, File file, List<? extends File> list) {
        if (!list.isEmpty()) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 19) {
                V19.install(classLoader, list, file);
            } else if (i >= 14) {
                V14.install(classLoader, list);
            } else {
                C0299V4.install(classLoader, list);
            }
        }
    }

    static boolean isVMMultidexCapable(String str) {
        boolean z = false;
        if (str != null) {
            Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(str);
            if (matcher.matches()) {
                try {
                    int parseInt = Integer.parseInt(matcher.group(1));
                    int parseInt2 = Integer.parseInt(matcher.group(2));
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("VM with version ");
        sb.append(str);
        sb.append(z ? " has multidex support" : " does not have multidex support");
        sb.toString();
        return z;
    }

    private static void mkdirChecked(File file) {
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                "Failed to create dir " + file.getPath() + ". Parent file is null.";
            } else {
                "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite();
            }
            throw new IOException("Failed to create directory " + file.getPath());
        }
    }
}
