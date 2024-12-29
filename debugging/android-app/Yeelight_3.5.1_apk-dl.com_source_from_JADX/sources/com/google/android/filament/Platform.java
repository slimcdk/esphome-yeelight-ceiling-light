package com.google.android.filament;

import androidx.annotation.NonNull;

abstract class Platform {
    private static Platform mCurrentPlatform;

    private static class UnknownPlatform extends Platform {
        private UnknownPlatform() {
        }

        /* access modifiers changed from: package-private */
        public long getSharedContextNativeHandle(Object obj) {
            return 0;
        }

        /* access modifiers changed from: package-private */
        public void log(String str) {
            System.out.println(str);
        }

        /* access modifiers changed from: package-private */
        public boolean validateSharedContext(Object obj) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean validateStreamSource(Object obj) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean validateSurface(Object obj) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public void warn(String str) {
            System.out.println(str);
        }
    }

    Platform() {
    }

    @NonNull
    static Platform get() {
        Platform platform;
        if (mCurrentPlatform == null) {
            try {
                if (isAndroid()) {
                    int i = AndroidPlatform.f451a;
                    platform = AndroidPlatform.class.newInstance();
                } else {
                    platform = (Platform) Class.forName("com.google.android.filament.DesktopPlatform").newInstance();
                }
                mCurrentPlatform = platform;
            } catch (Exception unused) {
            }
            if (mCurrentPlatform == null) {
                mCurrentPlatform = new UnknownPlatform();
            }
        }
        return mCurrentPlatform;
    }

    static boolean isAndroid() {
        return "The Android Project".equalsIgnoreCase(System.getProperty("java.vendor"));
    }

    static boolean isLinux() {
        return System.getProperty("os.name").contains("Linux") && !isAndroid();
    }

    static boolean isMacOS() {
        return System.getProperty("os.name").contains("Mac OS X");
    }

    static boolean isWindows() {
        return System.getProperty("os.name").contains("Windows");
    }

    /* access modifiers changed from: package-private */
    public abstract long getSharedContextNativeHandle(Object obj);

    /* access modifiers changed from: package-private */
    public abstract void log(String str);

    /* access modifiers changed from: package-private */
    public abstract boolean validateSharedContext(Object obj);

    /* access modifiers changed from: package-private */
    public abstract boolean validateStreamSource(Object obj);

    /* access modifiers changed from: package-private */
    public abstract boolean validateSurface(Object obj);

    /* access modifiers changed from: package-private */
    public abstract void warn(String str);
}
