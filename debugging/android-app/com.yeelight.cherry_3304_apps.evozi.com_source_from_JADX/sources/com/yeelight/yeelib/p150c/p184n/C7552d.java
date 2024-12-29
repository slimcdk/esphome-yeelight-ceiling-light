package com.yeelight.yeelib.p150c.p184n;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.yeelib.c.n.d */
public class C7552d {

    /* renamed from: a */
    private int f15203a;

    /* renamed from: b */
    private int f15204b;

    /* renamed from: c */
    private int f15205c;

    /* renamed from: d */
    private int f15206d;
    @StringRes

    /* renamed from: e */
    private int f15207e;
    @StringRes

    /* renamed from: f */
    private int f15208f;
    @DrawableRes

    /* renamed from: g */
    private int f15209g;

    /* renamed from: com.yeelight.yeelib.c.n.d$a */
    public static class C7553a {
        /* renamed from: a */
        public static List<C7552d> m22253a() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C7552d(1, 30, 0, 1, R$string.vision_default_schedule_kid, R$string.vision_default_schedule_kid_introduce, R$drawable.icon_yeelight_default_schedule_kid));
            arrayList.add(new C7552d(2, 45, 15, 2, R$string.vision_default_schedule_classroom, R$string.vision_default_schedule_classroom_introduce, R$drawable.icon_yeelight_default_schedule_classroom));
            arrayList.add(new C7552d(3, 90, 0, 1, R$string.vision_default_schedule_exam, R$string.vision_default_schedule_exam_introduce, R$drawable.icon_yeelight_default_schedule_exam));
            arrayList.add(new C7552d(4, 25, 5, 4, R$string.vision_default_schedule_tomato, R$string.vision_default_schedule_tomato_introduce, R$drawable.icon_yeelight_default_schedule_tomato));
            arrayList.add(new C7552d(5, 60, 0, 4, R$string.vision_default_schedule_focus, R$string.vision_default_schedule_focus_introduce, R$drawable.icon_yeelight_default_schedule_focus));
            return arrayList;
        }
    }

    public C7552d(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f15203a = i;
        this.f15204b = i2;
        this.f15205c = i3;
        this.f15206d = i4;
        this.f15207e = i5;
        this.f15208f = i6;
        this.f15209g = i7;
    }

    /* renamed from: a */
    public String mo28875a() {
        return this.f15203a + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f15206d + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f15204b + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f15205c + Constants.ACCEPT_TIME_SEPARATOR_SP + "2" + Constants.ACCEPT_TIME_SEPARATOR_SP + "4000";
    }

    /* renamed from: b */
    public int mo28876b() {
        return this.f15209g;
    }

    /* renamed from: c */
    public int mo28877c() {
        return this.f15203a;
    }

    /* renamed from: d */
    public int mo28878d() {
        return this.f15208f;
    }

    /* renamed from: e */
    public int mo28879e() {
        return this.f15207e;
    }
}
