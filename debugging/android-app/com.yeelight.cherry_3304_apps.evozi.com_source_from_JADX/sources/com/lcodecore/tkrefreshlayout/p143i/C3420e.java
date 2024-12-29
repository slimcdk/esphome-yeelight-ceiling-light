package com.lcodecore.tkrefreshlayout.p143i;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;

/* renamed from: com.lcodecore.tkrefreshlayout.i.e */
public class C3420e implements C3417c {

    /* renamed from: a */
    protected TwinklingRefreshLayout.C3385d f6679a;

    /* renamed from: b */
    private float f6680b;

    /* renamed from: c */
    private float f6681c;

    /* renamed from: d */
    private boolean f6682d = false;

    /* renamed from: e */
    private boolean f6683e = false;

    /* renamed from: f */
    private boolean f6684f = false;

    /* renamed from: g */
    private boolean f6685g = false;

    /* renamed from: h */
    private MotionEvent f6686h;

    public C3420e(TwinklingRefreshLayout.C3385d dVar) {
        if (dVar != null) {
            this.f6679a = dVar;
            return;
        }
        throw new NullPointerException("The coprocessor can not be null.");
    }

    /* renamed from: g */
    private void m10608g() {
        MotionEvent motionEvent = this.f6686h;
        if (motionEvent != null) {
            this.f6679a.mo18684f(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime() + ((long) ViewConfiguration.getLongPressTimeout()), 3, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()));
        }
    }

    /* renamed from: h */
    private void m10609h() {
        MotionEvent motionEvent = this.f6686h;
        this.f6679a.mo18684f(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 0, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()));
    }

    /* renamed from: a */
    public void mo18779a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2, float f3, float f4) {
        int v = this.f6679a.mo18702v();
        if (this.f6679a.mo18656H() && f2 >= ((float) v) && !this.f6679a.mo18650B()) {
            this.f6679a.mo18692l().mo18750A((int) f4);
        }
        if (this.f6679a.mo18649A() && f2 <= ((float) (-v))) {
            this.f6679a.mo18692l().mo18761x((int) f4);
        }
    }

    /* renamed from: b */
    public boolean mo18780b(MotionEvent motionEvent) {
        return false;
    }

    /* renamed from: c */
    public void mo18781c(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
    }

    /* renamed from: d */
    public void mo18782d(MotionEvent motionEvent, boolean z) {
        if (!z && this.f6683e) {
            this.f6679a.mo18692l().mo18756G();
        }
        if (!z && this.f6684f) {
            this.f6679a.mo18692l().mo18757H();
        }
        this.f6683e = false;
        this.f6684f = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r0 != 3) goto L_0x0170;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getAction()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0193
            if (r0 == r2) goto L_0x0177
            r3 = 2
            if (r0 == r3) goto L_0x0012
            r3 = 3
            if (r0 == r3) goto L_0x0177
            goto L_0x0170
        L_0x0012:
            r6.f6686h = r7
            float r0 = r7.getX()
            float r1 = r6.f6680b
            float r0 = r0 - r1
            float r1 = r7.getY()
            float r4 = r6.f6681c
            float r1 = r1 - r4
            boolean r4 = r6.f6682d
            r5 = 0
            if (r4 != 0) goto L_0x00ac
            float r0 = java.lang.Math.abs(r0)
            float r4 = java.lang.Math.abs(r1)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x00ac
            float r0 = java.lang.Math.abs(r1)
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r6.f6679a
            int r4 = r4.mo18702v()
            float r4 = (float) r4
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ac
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0077
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6679a
            android.view.View r0 = r0.mo18701u()
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r6.f6679a
            int r4 = r4.mo18702v()
            boolean r0 = com.lcodecore.tkrefreshlayout.p144j.C3423c.m10625h(r0, r4)
            if (r0 == 0) goto L_0x0077
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6679a
            boolean r0 = r0.mo18678c()
            if (r0 == 0) goto L_0x0077
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6679a
            r0.mo18681d0()
            float r0 = r7.getX()
            r6.f6680b = r0
            float r7 = r7.getY()
            r6.f6681c = r7
            r6.m10608g()
            r6.f6682d = r2
            return r2
        L_0x0077:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ac
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6679a
            android.view.View r0 = r0.mo18701u()
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r6.f6679a
            int r4 = r4.mo18702v()
            boolean r0 = com.lcodecore.tkrefreshlayout.p144j.C3423c.m10624g(r0, r4)
            if (r0 == 0) goto L_0x00ac
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6679a
            boolean r0 = r0.mo18680d()
            if (r0 == 0) goto L_0x00ac
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6679a
            r0.mo18679c0()
            float r0 = r7.getX()
            r6.f6680b = r0
            float r7 = r7.getY()
            r6.f6681c = r7
            r6.f6682d = r2
            r6.m10608g()
            return r2
        L_0x00ac:
            boolean r0 = r6.f6682d
            if (r0 == 0) goto L_0x0170
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6679a
            boolean r0 = r0.mo18656H()
            if (r0 != 0) goto L_0x0170
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6679a
            boolean r0 = r0.mo18649A()
            if (r0 == 0) goto L_0x00c2
            goto L_0x0170
        L_0x00c2:
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6679a
            boolean r0 = r0.mo18654F()
            if (r0 != 0) goto L_0x0111
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6679a
            boolean r0 = r0.mo18659K()
            if (r0 == 0) goto L_0x0111
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6679a
            int r0 = r0.mo18702v()
            int r0 = -r0
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00f0
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6679a
            android.view.View r0 = r0.mo18701u()
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r3 = r6.f6679a
            int r3 = r3.mo18702v()
            boolean r0 = com.lcodecore.tkrefreshlayout.p144j.C3423c.m10625h(r0, r3)
            if (r0 != 0) goto L_0x00f5
        L_0x00f0:
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6679a
            r0.mo18684f(r7)
        L_0x00f5:
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r7 = r6.f6679a
            float r7 = r7.mo18699s()
            r0 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 * r0
            float r7 = java.lang.Math.min(r7, r1)
            float r1 = java.lang.Math.max(r5, r7)
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r7 = r6.f6679a
            com.lcodecore.tkrefreshlayout.i.a r7 = r7.mo18692l()
            r7.mo18759L(r1)
            goto L_0x0162
        L_0x0111:
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6679a
            boolean r0 = r0.mo18653E()
            if (r0 != 0) goto L_0x0162
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6679a
            boolean r0 = r0.mo18658J()
            if (r0 == 0) goto L_0x0162
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6679a
            int r0 = r0.mo18702v()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x013e
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6679a
            android.view.View r0 = r0.mo18701u()
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r6.f6679a
            int r4 = r4.mo18702v()
            boolean r0 = com.lcodecore.tkrefreshlayout.p144j.C3423c.m10624g(r0, r4)
            if (r0 != 0) goto L_0x0143
        L_0x013e:
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6679a
            r0.mo18684f(r7)
        L_0x0143:
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r7 = r6.f6679a
            int r7 = r7.mo18698r()
            int r7 = -r7
            int r7 = r7 * 2
            float r7 = (float) r7
            float r7 = java.lang.Math.max(r7, r1)
            float r1 = java.lang.Math.min(r5, r7)
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r7 = r6.f6679a
            com.lcodecore.tkrefreshlayout.i.a r7 = r7.mo18692l()
            float r0 = java.lang.Math.abs(r1)
            r7.mo18758K(r0)
        L_0x0162:
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x016f
            boolean r7 = r6.f6685g
            if (r7 != 0) goto L_0x016f
            r6.f6685g = r2
            r6.m10609h()
        L_0x016f:
            return r2
        L_0x0170:
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6679a
            boolean r7 = r0.mo18684f(r7)
            return r7
        L_0x0177:
            boolean r0 = r6.f6682d
            if (r0 == 0) goto L_0x0170
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r7 = r6.f6679a
            boolean r7 = r7.mo18659K()
            if (r7 == 0) goto L_0x0186
            r6.f6683e = r2
            goto L_0x0190
        L_0x0186:
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r7 = r6.f6679a
            boolean r7 = r7.mo18658J()
            if (r7 == 0) goto L_0x0190
            r6.f6684f = r2
        L_0x0190:
            r6.f6682d = r1
            return r2
        L_0x0193:
            r6.f6685g = r1
            r6.f6682d = r1
            float r0 = r7.getX()
            r6.f6680b = r0
            float r0 = r7.getY()
            r6.f6681c = r0
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6679a
            boolean r0 = r0.mo18704x()
            if (r0 == 0) goto L_0x01c5
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6679a
            boolean r0 = r0.mo18657I()
            if (r0 != 0) goto L_0x01b8
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6679a
            r0.mo18674Z(r1)
        L_0x01b8:
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6679a
            boolean r0 = r0.mo18706z()
            if (r0 != 0) goto L_0x01c5
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6679a
            r0.mo18673Y(r1)
        L_0x01c5:
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6679a
            r0.mo18684f(r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lcodecore.tkrefreshlayout.p143i.C3420e.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: e */
    public boolean mo18784e(MotionEvent motionEvent) {
        return false;
    }

    /* renamed from: f */
    public void mo18785f(MotionEvent motionEvent) {
    }
}
