package p232y3;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import java.util.ArrayList;
import java.util.List;

/* renamed from: y3.d */
public class C12039d {

    /* renamed from: a */
    private int f22076a;

    /* renamed from: b */
    private int f22077b;

    /* renamed from: c */
    private int f22078c;

    /* renamed from: d */
    private int f22079d;
    @StringRes

    /* renamed from: e */
    private int f22080e;
    @StringRes

    /* renamed from: f */
    private int f22081f;
    @DrawableRes

    /* renamed from: g */
    private int f22082g;

    /* renamed from: y3.d$a */
    public static class C12040a {
        /* renamed from: a */
        public static List<C12039d> m31077a() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C12039d(1, 30, 0, 1, R$string.vision_default_schedule_kid, R$string.vision_default_schedule_kid_introduce, R$drawable.icon_yeelight_default_schedule_kid));
            arrayList.add(new C12039d(2, 45, 15, 2, R$string.vision_default_schedule_classroom, R$string.vision_default_schedule_classroom_introduce, R$drawable.icon_yeelight_default_schedule_classroom));
            arrayList.add(new C12039d(3, 90, 0, 1, R$string.vision_default_schedule_exam, R$string.vision_default_schedule_exam_introduce, R$drawable.icon_yeelight_default_schedule_exam));
            arrayList.add(new C12039d(4, 25, 5, 4, R$string.vision_default_schedule_tomato, R$string.vision_default_schedule_tomato_introduce, R$drawable.icon_yeelight_default_schedule_tomato));
            arrayList.add(new C12039d(5, 60, 0, 4, R$string.vision_default_schedule_focus, R$string.vision_default_schedule_focus_introduce, R$drawable.icon_yeelight_default_schedule_focus));
            return arrayList;
        }
    }

    public C12039d(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f22076a = i;
        this.f22077b = i2;
        this.f22078c = i3;
        this.f22079d = i4;
        this.f22080e = i5;
        this.f22081f = i6;
        this.f22082g = i7;
    }

    /* renamed from: a */
    public String mo42672a() {
        return this.f22076a + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f22079d + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f22077b + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f22078c + Constants.ACCEPT_TIME_SEPARATOR_SP + "2" + Constants.ACCEPT_TIME_SEPARATOR_SP + "4000";
    }

    /* renamed from: b */
    public int mo42673b() {
        return this.f22082g;
    }

    /* renamed from: c */
    public int mo42674c() {
        return this.f22076a;
    }

    /* renamed from: d */
    public int mo42675d() {
        return this.f22081f;
    }

    /* renamed from: e */
    public int mo42676e() {
        return this.f22080e;
    }
}
