package p216u4;

import com.google.p017ar.core.ImageMetadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C9424q;
import org.apache.commons.p194io.FilenameUtils;
import org.jetbrains.annotations.NotNull;
import p220v4.C10544a;
import p224w4.C11936a;

/* renamed from: u4.b */
public final class C10532b {
    @NotNull
    @JvmField

    /* renamed from: a */
    public static final C10531a f19696a;

    static {
        C10531a aVar;
        C10544a newInstance;
        C11936a newInstance2;
        Class<C10531a> cls = C10531a.class;
        int a = m26883a();
        if (a >= 65544 || a < 65536) {
            try {
                newInstance2 = C11936a.class.newInstance();
                C9424q.m22995d(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                if (newInstance2 != null) {
                    aVar = newInstance2;
                    f19696a = aVar;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            } catch (ClassCastException e) {
                ClassLoader classLoader = newInstance2.getClass().getClassLoader();
                ClassLoader classLoader2 = cls.getClassLoader();
                if (!C9424q.m22992a(classLoader, classLoader2)) {
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e);
                }
                throw e;
            } catch (ClassNotFoundException unused) {
                try {
                    Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    C9424q.m22995d(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                    if (newInstance3 != null) {
                        try {
                            aVar = (C10531a) newInstance3;
                        } catch (ClassCastException e2) {
                            ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                            ClassLoader classLoader4 = cls.getClassLoader();
                            if (!C9424q.m22992a(classLoader3, classLoader4)) {
                                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e2);
                            }
                            throw e2;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused2) {
                }
            }
        }
        if (a >= 65543 || a < 65536) {
            try {
                newInstance = C10544a.class.newInstance();
                C9424q.m22995d(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
                if (newInstance != null) {
                    aVar = newInstance;
                    f19696a = aVar;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            } catch (ClassCastException e3) {
                ClassLoader classLoader5 = newInstance.getClass().getClassLoader();
                ClassLoader classLoader6 = cls.getClassLoader();
                if (!C9424q.m22992a(classLoader5, classLoader6)) {
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e3);
                }
                throw e3;
            } catch (ClassNotFoundException unused3) {
                try {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    C9424q.m22995d(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                    if (newInstance4 != null) {
                        try {
                            aVar = (C10531a) newInstance4;
                        } catch (ClassCastException e4) {
                            ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                            ClassLoader classLoader8 = cls.getClassLoader();
                            if (!C9424q.m22992a(classLoader7, classLoader8)) {
                                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e4);
                            }
                            throw e4;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused4) {
                }
            }
        }
        aVar = new C10531a();
        f19696a = aVar;
    }

    /* renamed from: a */
    private static final int m26883a() {
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return ImageMetadata.CONTROL_AE_PRECAPTURE_TRIGGER;
        }
        int m = C9515r.m23150m(property, FilenameUtils.EXTENSION_SEPARATOR, 0, false, 6, (Object) null);
        if (m < 0) {
            try {
                return Integer.parseInt(property) * 65536;
            } catch (NumberFormatException unused) {
                return ImageMetadata.CONTROL_AE_PRECAPTURE_TRIGGER;
            }
        } else {
            int i = m + 1;
            int m2 = C9515r.m23150m(property, FilenameUtils.EXTENSION_SEPARATOR, i, false, 4, (Object) null);
            if (m2 < 0) {
                m2 = property.length();
            }
            String substring = property.substring(0, m);
            C9424q.m22995d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring2 = property.substring(i, m2);
            C9424q.m22995d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            try {
                return (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
            } catch (NumberFormatException unused2) {
                return ImageMetadata.CONTROL_AE_PRECAPTURE_TRIGGER;
            }
        }
    }
}
