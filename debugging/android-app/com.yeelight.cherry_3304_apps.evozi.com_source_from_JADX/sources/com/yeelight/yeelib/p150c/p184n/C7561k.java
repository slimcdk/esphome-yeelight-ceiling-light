package com.yeelight.yeelib.p150c.p184n;

import android.content.Context;
import android.content.res.Resources;
import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.utils.C10543g;
import java.io.Serializable;
import java.util.Calendar;

/* renamed from: com.yeelight.yeelib.c.n.k */
public class C7561k implements Serializable {

    /* renamed from: a */
    private String f15240a;

    /* renamed from: b */
    private int f15241b;

    /* renamed from: c */
    private int f15242c;

    /* renamed from: d */
    private int f15243d;

    /* renamed from: e */
    private int f15244e;

    /* renamed from: f */
    private String f15245f;

    /* renamed from: g */
    private int f15246g;

    /* renamed from: h */
    private boolean f15247h;

    /* renamed from: i */
    private int f15248i;

    /* renamed from: j */
    private int f15249j;

    /* renamed from: k */
    private String[] f15250k;

    /* renamed from: l */
    private boolean f15251l = false;

    /* renamed from: b */
    public static String m22309b(Context context, String str) {
        Resources resources;
        int i;
        char[] charArray = str.toCharArray();
        String[] strArr = {context.getString(R$string.common_text_repeat_7), context.getString(R$string.common_text_repeat_1), context.getString(R$string.common_text_repeat_2), context.getString(R$string.common_text_repeat_3), context.getString(R$string.common_text_repeat_4), context.getString(R$string.common_text_repeat_5), context.getString(R$string.common_text_repeat_6)};
        String str2 = "";
        for (int i2 = 0; i2 < charArray.length; i2++) {
            char c = charArray[i2];
            C10543g.m25740a("timer", "getdays:" + c + " =>" + strArr[i2]);
            if (c == '1') {
                str2 = str2 + strArr[i2] + " ";
            }
        }
        if (str.equals("0111110")) {
            resources = context.getResources();
            i = R$string.common_text_repeat_weekday;
        } else if (!str.equals("1000001")) {
            return str2;
        } else {
            resources = context.getResources();
            i = R$string.common_text_repeat_weekend;
        }
        return resources.getString(i);
    }

    /* renamed from: r */
    public static String m22310r(String str) {
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            str2 = str.charAt(i) + str2;
        }
        return str2;
    }

    /* renamed from: A */
    public void mo28935A(String[] strArr) {
        this.f15250k = strArr;
    }

    /* renamed from: B */
    public void mo28936B(int i) {
        this.f15243d = i;
    }

    /* renamed from: C */
    public void mo28937C() {
        this.f15251l = true;
    }

    /* renamed from: D */
    public void mo28938D(int i) {
        this.f15249j = i;
    }

    /* renamed from: E */
    public void mo28939E(int i) {
    }

    /* renamed from: a */
    public long mo28940a(boolean z) {
        if (!this.f15247h) {
            return -1;
        }
        if (this.f15248i != (z ? 3 : 4)) {
            return -1;
        }
        Calendar instance = Calendar.getInstance();
        instance.set(11, this.f15241b);
        instance.set(12, this.f15242c);
        instance.set(13, this.f15243d);
        int i = this.f15244e;
        if (i == 1) {
            instance.set(5, Integer.parseInt(this.f15245f));
            if (instance.getTimeInMillis() - System.currentTimeMillis() > 43200000) {
                return -1;
            }
            return instance.getTimeInMillis();
        } else if (i == 2) {
            if (instance.getTimeInMillis() < System.currentTimeMillis()) {
                instance.add(5, 1);
            }
            if (instance.getTimeInMillis() - System.currentTimeMillis() > 43200000) {
                return -1;
            }
            return instance.getTimeInMillis();
        } else if (i != 3) {
            return -1;
        } else {
            String k = mo28950k();
            int i2 = instance.get(7) - 1;
            int i3 = 0;
            while (true) {
                if (i3 >= 7) {
                    break;
                } else if (k.codePointAt((i3 + i2) % 7) == 49) {
                    instance.add(5, i3);
                    break;
                } else {
                    i3++;
                }
            }
            if (instance.getTimeInMillis() - System.currentTimeMillis() > 43200000) {
                return -1;
            }
            return instance.getTimeInMillis();
        }
    }

    /* renamed from: c */
    public int mo28941c() {
        return this.f15246g;
    }

    /* renamed from: d */
    public int mo28942d() {
        return this.f15241b;
    }

    /* renamed from: e */
    public int mo28943e() {
        return this.f15242c;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C7561k)) {
            return false;
        }
        C7561k kVar = (C7561k) obj;
        return kVar.f15249j == this.f15249j && kVar.f15247h == this.f15247h && kVar.f15248i == this.f15248i && kVar.f15241b == this.f15241b && kVar.f15242c == this.f15242c && kVar.f15246g == this.f15246g && kVar.f15244e == this.f15244e && kVar.f15245f.equals(this.f15245f);
    }

    /* renamed from: f */
    public int mo28945f() {
        return this.f15244e;
    }

    /* renamed from: g */
    public String mo28946g() {
        return this.f15240a;
    }

    /* renamed from: h */
    public long mo28947h() {
        return mo28940a(false);
    }

    /* renamed from: i */
    public long mo28948i() {
        return mo28940a(true);
    }

    /* renamed from: j */
    public int mo28949j() {
        return this.f15248i;
    }

    /* renamed from: k */
    public String mo28950k() {
        while (this.f15245f.length() < 7) {
            this.f15245f = TimerCodec.DISENABLE + this.f15245f;
        }
        return m22310r(this.f15245f);
    }

    /* renamed from: l */
    public String[] mo28951l() {
        return this.f15250k;
    }

    /* renamed from: m */
    public String mo28952m(Context context) {
        int i;
        if (mo28945f() == 1) {
            i = R$string.common_text_repeat_once;
        } else if (mo28945f() != 2) {
            return m22309b(context, mo28950k());
        } else {
            i = R$string.common_text_repeat_everyday;
        }
        return context.getString(i);
    }

    /* renamed from: n */
    public int mo28953n() {
        return this.f15243d;
    }

    /* renamed from: o */
    public int mo28954o() {
        return this.f15249j;
    }

    /* renamed from: p */
    public boolean mo28955p() {
        return this.f15247h;
    }

    /* renamed from: q */
    public boolean mo28956q() {
        return this.f15251l;
    }

    /* renamed from: s */
    public void mo28957s(boolean z) {
        this.f15247h = z;
    }

    /* renamed from: t */
    public void mo28958t(int i) {
        this.f15246g = i;
    }

    /* renamed from: u */
    public void mo28959u(int i) {
        this.f15241b = i;
    }

    /* renamed from: v */
    public void mo28960v(int i) {
        this.f15242c = i;
    }

    /* renamed from: w */
    public void mo28961w(int i) {
        this.f15244e = i;
    }

    /* renamed from: x */
    public void mo28962x(String str) {
        this.f15240a = str;
    }

    /* renamed from: y */
    public void mo28963y(int i) {
        this.f15248i = i;
    }

    /* renamed from: z */
    public void mo28964z(String str) {
        this.f15245f = str;
    }
}
