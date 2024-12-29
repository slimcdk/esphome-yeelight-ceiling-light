package com.yeelight.yeelib.p150c.p181l;

import android.app.Activity;
import android.view.View;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6038h;

/* renamed from: com.yeelight.yeelib.c.l.n0 */
public class C6177n0 extends C6038h {
    public C6177n0(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    /* renamed from: a */
    public View mo27771a(Activity activity, C4198d dVar) {
        return null;
    }

    /* renamed from: b */
    public void mo27772b() {
    }

    /* renamed from: c */
    public void mo27773c(C4198d dVar) {
    }

    /* renamed from: h */
    public Class mo27778h() {
        try {
            return Class.forName("com.yeelight.cherry.ui.activity.GroupRhythmActivity");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: j */
    public boolean mo27780j() {
        return false;
    }

    public void onStatusChange(int i, C6024e eVar) {
    }
}
