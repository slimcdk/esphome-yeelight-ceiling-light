package androidx.core.p005os;

import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.Size;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Locale;

/* renamed from: androidx.core.os.LocaleListCompat */
public final class LocaleListCompat {
    static final LocaleListInterface IMPL = (Build.VERSION.SDK_INT >= 24 ? new LocaleListCompatApi24Impl() : new LocaleListCompatBaseImpl());
    private static final LocaleListCompat sEmptyLocaleList = new LocaleListCompat();

    @RequiresApi(24)
    /* renamed from: androidx.core.os.LocaleListCompat$LocaleListCompatApi24Impl */
    static class LocaleListCompatApi24Impl implements LocaleListInterface {
        private LocaleList mLocaleList = new LocaleList(new Locale[0]);

        LocaleListCompatApi24Impl() {
        }

        public boolean equals(Object obj) {
            return this.mLocaleList.equals(((LocaleListCompat) obj).unwrap());
        }

        public Locale get(int i) {
            return this.mLocaleList.get(i);
        }

        @Nullable
        public Locale getFirstMatch(String[] strArr) {
            LocaleList localeList = this.mLocaleList;
            if (localeList != null) {
                return localeList.getFirstMatch(strArr);
            }
            return null;
        }

        public Object getLocaleList() {
            return this.mLocaleList;
        }

        public int hashCode() {
            return this.mLocaleList.hashCode();
        }

        @IntRange(from = -1)
        public int indexOf(Locale locale) {
            return this.mLocaleList.indexOf(locale);
        }

        public boolean isEmpty() {
            return this.mLocaleList.isEmpty();
        }

        public void setLocaleList(@NonNull Locale... localeArr) {
            this.mLocaleList = new LocaleList(localeArr);
        }

        @IntRange(from = 0)
        public int size() {
            return this.mLocaleList.size();
        }

        public String toLanguageTags() {
            return this.mLocaleList.toLanguageTags();
        }

        public String toString() {
            return this.mLocaleList.toString();
        }
    }

    /* renamed from: androidx.core.os.LocaleListCompat$LocaleListCompatBaseImpl */
    static class LocaleListCompatBaseImpl implements LocaleListInterface {
        private LocaleListHelper mLocaleList = new LocaleListHelper(new Locale[0]);

        LocaleListCompatBaseImpl() {
        }

        public boolean equals(Object obj) {
            return this.mLocaleList.equals(((LocaleListCompat) obj).unwrap());
        }

        public Locale get(int i) {
            return this.mLocaleList.get(i);
        }

        @Nullable
        public Locale getFirstMatch(String[] strArr) {
            LocaleListHelper localeListHelper = this.mLocaleList;
            if (localeListHelper != null) {
                return localeListHelper.getFirstMatch(strArr);
            }
            return null;
        }

        public Object getLocaleList() {
            return this.mLocaleList;
        }

        public int hashCode() {
            return this.mLocaleList.hashCode();
        }

        @IntRange(from = -1)
        public int indexOf(Locale locale) {
            return this.mLocaleList.indexOf(locale);
        }

        public boolean isEmpty() {
            return this.mLocaleList.isEmpty();
        }

        public void setLocaleList(@NonNull Locale... localeArr) {
            this.mLocaleList = new LocaleListHelper(localeArr);
        }

        @IntRange(from = 0)
        public int size() {
            return this.mLocaleList.size();
        }

        public String toLanguageTags() {
            return this.mLocaleList.toLanguageTags();
        }

        public String toString() {
            return this.mLocaleList.toString();
        }
    }

    private LocaleListCompat() {
    }

    public static LocaleListCompat create(@NonNull Locale... localeArr) {
        LocaleListCompat localeListCompat = new LocaleListCompat();
        localeListCompat.setLocaleListArray(localeArr);
        return localeListCompat;
    }

    @NonNull
    public static LocaleListCompat forLanguageTags(@Nullable String str) {
        if (str == null || str.isEmpty()) {
            return getEmptyLocaleList();
        }
        String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP, -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Build.VERSION.SDK_INT >= 21 ? Locale.forLanguageTag(split[i]) : LocaleHelper.forLanguageTag(split[i]);
        }
        LocaleListCompat localeListCompat = new LocaleListCompat();
        localeListCompat.setLocaleListArray(localeArr);
        return localeListCompat;
    }

    @Size(min = 1)
    @NonNull
    public static LocaleListCompat getAdjustedDefault() {
        if (Build.VERSION.SDK_INT >= 24) {
            return wrap(LocaleList.getAdjustedDefault());
        }
        return create(Locale.getDefault());
    }

    @Size(min = 1)
    @NonNull
    public static LocaleListCompat getDefault() {
        if (Build.VERSION.SDK_INT >= 24) {
            return wrap(LocaleList.getDefault());
        }
        return create(Locale.getDefault());
    }

    @NonNull
    public static LocaleListCompat getEmptyLocaleList() {
        return sEmptyLocaleList;
    }

    @RequiresApi(24)
    private void setLocaleList(LocaleList localeList) {
        int size = localeList.size();
        if (size > 0) {
            Locale[] localeArr = new Locale[size];
            for (int i = 0; i < size; i++) {
                localeArr[i] = localeList.get(i);
            }
            IMPL.setLocaleList(localeArr);
        }
    }

    private void setLocaleListArray(Locale... localeArr) {
        IMPL.setLocaleList(localeArr);
    }

    @RequiresApi(24)
    public static LocaleListCompat wrap(Object obj) {
        LocaleListCompat localeListCompat = new LocaleListCompat();
        if (obj instanceof LocaleList) {
            localeListCompat.setLocaleList((LocaleList) obj);
        }
        return localeListCompat;
    }

    public boolean equals(Object obj) {
        return IMPL.equals(obj);
    }

    public Locale get(int i) {
        return IMPL.get(i);
    }

    public Locale getFirstMatch(String[] strArr) {
        return IMPL.getFirstMatch(strArr);
    }

    public int hashCode() {
        return IMPL.hashCode();
    }

    @IntRange(from = -1)
    public int indexOf(Locale locale) {
        return IMPL.indexOf(locale);
    }

    public boolean isEmpty() {
        return IMPL.isEmpty();
    }

    @IntRange(from = 0)
    public int size() {
        return IMPL.size();
    }

    @NonNull
    public String toLanguageTags() {
        return IMPL.toLanguageTags();
    }

    public String toString() {
        return IMPL.toString();
    }

    @Nullable
    public Object unwrap() {
        return IMPL.getLocaleList();
    }
}
