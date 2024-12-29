package com.google.p107ar.core;

import android.app.Activity;
import android.content.Context;
import com.google.p107ar.core.exceptions.FatalException;

/* renamed from: com.google.ar.core.ArCoreApk */
public class ArCoreApk {

    /* renamed from: com.google.ar.core.ArCoreApk$Availability */
    public enum Availability {
        UNKNOWN_ERROR(0),
        UNKNOWN_CHECKING(1),
        UNKNOWN_TIMED_OUT(2),
        UNSUPPORTED_DEVICE_NOT_CAPABLE(100),
        SUPPORTED_NOT_INSTALLED(201),
        SUPPORTED_APK_TOO_OLD(202),
        SUPPORTED_INSTALLED(203);
        
        final int nativeCode;

        private Availability(int i) {
            this.nativeCode = i;
        }

        static Availability forNumber(int i) {
            for (Availability availability : values()) {
                if (availability.nativeCode == i) {
                    return availability;
                }
            }
            StringBuilder sb = new StringBuilder(59);
            sb.append("Unexpected value for native Availability, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        public boolean isSupported() {
            return false;
        }

        public boolean isTransient() {
            return false;
        }

        public boolean isUnknown() {
            return false;
        }

        public boolean isUnsupported() {
            return false;
        }
    }

    /* renamed from: com.google.ar.core.ArCoreApk$InstallBehavior */
    public enum InstallBehavior {
        REQUIRED(0),
        OPTIONAL(1);
        
        final int nativeCode;

        private InstallBehavior(int i) {
            this.nativeCode = i;
        }

        static InstallBehavior forNumber(int i) {
            for (InstallBehavior installBehavior : values()) {
                if (installBehavior.nativeCode == i) {
                    return installBehavior;
                }
            }
            StringBuilder sb = new StringBuilder(62);
            sb.append("Unexpected value for native InstallBehavior, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }
    }

    /* renamed from: com.google.ar.core.ArCoreApk$InstallStatus */
    public enum InstallStatus {
        INSTALLED(0),
        INSTALL_REQUESTED(1);
        
        final int nativeCode;

        private InstallStatus(int i) {
            this.nativeCode = i;
        }

        static InstallStatus forNumber(int i) {
            for (InstallStatus installStatus : values()) {
                if (installStatus.nativeCode == i) {
                    return installStatus;
                }
            }
            StringBuilder sb = new StringBuilder(60);
            sb.append("Unexpected value for native InstallStatus, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }
    }

    /* renamed from: com.google.ar.core.ArCoreApk$UserMessageType */
    public enum UserMessageType {
        APPLICATION(0),
        FEATURE(1),
        USER_ALREADY_INFORMED(2);
        
        final int nativeCode;

        private UserMessageType(int i) {
            this.nativeCode = i;
        }

        static UserMessageType forNumber(int i) {
            for (UserMessageType userMessageType : values()) {
                if (userMessageType.nativeCode == i) {
                    return userMessageType;
                }
            }
            StringBuilder sb = new StringBuilder(62);
            sb.append("Unexpected value for native UserMessageType, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }
    }

    /* renamed from: com.google.ar.core.ArCoreApk$a */
    interface C2618a {
        /* renamed from: a */
        void mo14945a(Availability availability);
    }

    protected ArCoreApk() {
    }

    public static ArCoreApk getInstance() {
        return C2636e0.m8169c();
    }

    public Availability checkAvailability(Context context) {
        throw new UnsupportedOperationException("Stub");
    }

    public InstallStatus requestInstall(Activity activity, boolean z) {
        throw new UnsupportedOperationException("Stub");
    }

    public InstallStatus requestInstall(Activity activity, boolean z, InstallBehavior installBehavior, UserMessageType userMessageType) {
        throw new UnsupportedOperationException("Stub");
    }
}
