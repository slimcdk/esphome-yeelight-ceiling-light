package p051j4;

import android.os.Build;
import android.os.LocaleList;
import com.yeelight.yeelib.managers.C3108x;
import java.util.Locale;

/* renamed from: j4.o */
public class C9196o {

    /* renamed from: c */
    private static C9196o f17014c;

    /* renamed from: a */
    private Locale f17015a;

    /* renamed from: b */
    private LocaleList f17016b;

    private C9196o() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f17016b = LocaleList.getDefault();
        }
    }

    /* renamed from: b */
    public static C9196o m22165b() {
        synchronized (C9196o.class) {
            if (f17014c == null) {
                f17014c = new C9196o();
            }
        }
        return f17014c;
    }

    /* renamed from: a */
    public Locale mo37277a() {
        Locale locale;
        LocaleList localeList;
        Locale locale2 = this.f17015a;
        if (locale2 != null) {
            return locale2;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList localeList2 = this.f17016b;
            if (localeList2 == null || localeList2.size() <= 0) {
                this.f17016b = LocaleList.getDefault();
                localeList = C3108x.f4951e.getResources().getConfiguration().getLocales();
            } else {
                localeList = this.f17016b;
            }
            locale = localeList.get(0);
        } else {
            locale = Locale.getDefault();
        }
        this.f17015a = locale;
        return locale;
    }

    /* renamed from: c */
    public String mo37278c() {
        return mo37277a().getLanguage() + "_" + mo37277a().getCountry();
    }
}
