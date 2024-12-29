package com.yeelight.yeelib.p150c.p151i;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.yeelight.yeelib.device.models.C7622g;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.activity.BlankActivity;
import com.yeelight.yeelib.p194ui.view.RedSpotTipTextView;

/* renamed from: com.yeelight.yeelib.c.i.h */
public abstract class C6038h implements C9770e {

    /* renamed from: a */
    protected RedSpotTipTextView f12834a;

    /* renamed from: b */
    protected int f12835b;

    /* renamed from: c */
    protected String f12836c;

    /* renamed from: d */
    protected boolean f12837d = false;

    /* renamed from: e */
    protected boolean f12838e = false;

    /* renamed from: f */
    protected String f12839f;

    /* renamed from: g */
    protected final int f12840g;

    public C6038h(int i, String str, int i2, String str2) {
        this.f12835b = i;
        this.f12836c = str;
        this.f12840g = i2;
        this.f12839f = str2;
        this.f12838e = false;
    }

    public C6038h(int i, String str, int i2, String str2, boolean z) {
        this.f12835b = i;
        this.f12836c = str;
        this.f12840g = i2;
        this.f12839f = str2;
        this.f12838e = z;
    }

    /* renamed from: a */
    public abstract View mo27771a(Activity activity, C4198d dVar);

    /* renamed from: b */
    public abstract void mo27772b();

    /* renamed from: c */
    public abstract void mo27773c(C4198d dVar);

    /* renamed from: d */
    public int mo27774d() {
        return this.f12840g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C7622g mo27775e(C6024e eVar) {
        return eVar.mo27712s();
    }

    /* renamed from: f */
    public int mo27776f() {
        return this.f12835b;
    }

    /* renamed from: g */
    public String mo27777g() {
        return this.f12836c;
    }

    /* renamed from: h */
    public abstract Class mo27778h();

    /* renamed from: i */
    public C4198d mo27779i() {
        return C4257w.m11945h0(this.f12839f);
    }

    /* renamed from: j */
    public abstract boolean mo27780j();

    /* renamed from: k */
    public boolean mo27781k(C4198d dVar) {
        return false;
    }

    /* renamed from: l */
    public boolean mo27782l() {
        return this.f12838e;
    }

    /* renamed from: m */
    public void mo27783m() {
        this.f12837d = false;
    }

    /* renamed from: n */
    public void mo27784n(boolean z) {
        this.f12834a.mo33120a(z);
    }

    /* renamed from: o */
    public void mo27785o(Activity activity, String str) {
        Class<BlankActivity> h = mo27778h();
        if (h == null) {
            h = BlankActivity.class;
        }
        Intent intent = new Intent();
        intent.setClass(activity, h);
        intent.putExtra("com.yeelight.cherry.device_id", str);
        activity.startActivity(intent);
    }

    /* renamed from: p */
    public void mo27786p(Activity activity, String str, int i) {
        Class<BlankActivity> h = mo27778h();
        if (h == null) {
            h = BlankActivity.class;
        }
        Intent intent = new Intent();
        intent.setClass(activity, h);
        intent.putExtra("com.yeelight.cherry.device_id", str);
        intent.putExtra("device_lamp_mode", i);
        activity.startActivity(intent);
    }
}
