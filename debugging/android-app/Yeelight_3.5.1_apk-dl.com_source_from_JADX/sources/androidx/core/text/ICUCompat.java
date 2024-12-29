package androidx.core.text;

import android.annotation.SuppressLint;
import android.icu.util.ULocale;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public final class ICUCompat {
    private static final String TAG = "ICUCompat";
    private static Method sAddLikelySubtagsMethod;
    private static Method sGetScriptMethod;

    @RequiresApi(21)
    static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        static String getScript(Locale locale) {
            return locale.getScript();
        }
    }

    @RequiresApi(24)
    static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        static ULocale addLikelySubtags(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        @DoNotInline
        static ULocale forLocale(Locale locale) {
            return ULocale.forLocale(locale);
        }

        @DoNotInline
        static String getScript(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    static {
        Class<String> cls = String.class;
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            try {
                Class<?> cls2 = Class.forName("libcore.icu.ICU");
                sGetScriptMethod = cls2.getMethod("getScript", new Class[]{cls});
                sAddLikelySubtagsMethod = cls2.getMethod("addLikelySubtags", new Class[]{cls});
            } catch (Exception unused) {
                sGetScriptMethod = null;
                sAddLikelySubtagsMethod = null;
            }
        } else if (i < 24) {
            try {
                sAddLikelySubtagsMethod = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    private ICUCompat() {
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static String addLikelySubtagsBelowApi21(Locale locale) {
        String locale2 = locale.toString();
        try {
            Method method = sAddLikelySubtagsMethod;
            if (method != null) {
                return (String) method.invoke((Object) null, new Object[]{locale2});
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return locale2;
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static String getScriptBelowApi21(String str) {
        try {
            Method method = sGetScriptMethod;
            if (method != null) {
                return (String) method.invoke((Object) null, new Object[]{str});
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return null;
    }

    @Nullable
    public static String maximizeAndGetScript(@NonNull Locale locale) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return Api24Impl.getScript(Api24Impl.addLikelySubtags(Api24Impl.forLocale(locale)));
        }
        if (i >= 21) {
            try {
                return Api21Impl.getScript((Locale) sAddLikelySubtagsMethod.invoke((Object) null, new Object[]{locale}));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return Api21Impl.getScript(locale);
            }
        } else {
            String addLikelySubtagsBelowApi21 = addLikelySubtagsBelowApi21(locale);
            if (addLikelySubtagsBelowApi21 != null) {
                return getScriptBelowApi21(addLikelySubtagsBelowApi21);
            }
            return null;
        }
    }
}
