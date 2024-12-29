package p108v2;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import java.util.Objects;

/* renamed from: v2.e */
public class C3826e implements C3823c {

    /* renamed from: a */
    protected TwinklingRefreshLayout.C2689d f6445a;

    /* renamed from: b */
    private float f6446b;

    /* renamed from: c */
    private float f6447c;

    /* renamed from: d */
    private boolean f6448d = false;

    /* renamed from: e */
    private boolean f6449e = false;

    /* renamed from: f */
    private boolean f6450f = false;

    /* renamed from: g */
    private boolean f6451g = false;

    /* renamed from: h */
    private MotionEvent f6452h;

    public C3826e(TwinklingRefreshLayout.C2689d dVar) {
        Objects.requireNonNull(dVar, "The coprocessor can not be null.");
        this.f6445a = dVar;
    }

    /* renamed from: g */
    private void m10917g() {
        MotionEvent motionEvent = this.f6452h;
        if (motionEvent != null) {
            this.f6445a.mo20297f(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime() + ((long) ViewConfiguration.getLongPressTimeout()), 3, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()));
        }
    }

    /* renamed from: h */
    private void m10918h() {
        MotionEvent motionEvent = this.f6452h;
        this.f6445a.mo20297f(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 0, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()));
    }

    /* renamed from: a */
    public void mo26291a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2, float f3, float f4) {
        int v = this.f6445a.mo20315v();
        if (this.f6445a.mo20269H() && f2 >= ((float) v) && !this.f6445a.mo20263B()) {
            this.f6445a.mo20305l().mo26262A((int) f4);
        }
        if (this.f6445a.mo20262A() && f2 <= ((float) (-v))) {
            this.f6445a.mo20305l().mo26273x((int) f4);
        }
    }

    /* renamed from: b */
    public boolean mo26292b(MotionEvent motionEvent) {
        return false;
    }

    /* renamed from: c */
    public void mo26293c(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
    }

    /* renamed from: d */
    public void mo26294d(MotionEvent motionEvent, boolean z) {
        if (!z && this.f6449e) {
            this.f6445a.mo20305l().mo26268G();
        }
        if (!z && this.f6450f) {
            this.f6445a.mo20305l().mo26269H();
        }
        this.f6449e = false;
        this.f6450f = false;
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
            r6.f6452h = r7
            float r0 = r7.getX()
            float r1 = r6.f6446b
            float r0 = r0 - r1
            float r1 = r7.getY()
            float r4 = r6.f6447c
            float r1 = r1 - r4
            boolean r4 = r6.f6448d
            r5 = 0
            if (r4 != 0) goto L_0x00ac
            float r0 = java.lang.Math.abs(r0)
            float r4 = java.lang.Math.abs(r1)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x00ac
            float r0 = java.lang.Math.abs(r1)
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r6.f6445a
            int r4 = r4.mo20315v()
            float r4 = (float) r4
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ac
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0077
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6445a
            android.view.View r0 = r0.mo20314u()
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r6.f6445a
            int r4 = r4.mo20315v()
            boolean r0 = p112w2.C3896c.m11102h(r0, r4)
            if (r0 == 0) goto L_0x0077
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6445a
            boolean r0 = r0.mo20291c()
            if (r0 == 0) goto L_0x0077
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6445a
            r0.mo20294d0()
            float r0 = r7.getX()
            r6.f6446b = r0
            float r7 = r7.getY()
            r6.f6447c = r7
            r6.m10917g()
            r6.f6448d = r2
            return r2
        L_0x0077:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ac
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6445a
            android.view.View r0 = r0.mo20314u()
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r6.f6445a
            int r4 = r4.mo20315v()
            boolean r0 = p112w2.C3896c.m11101g(r0, r4)
            if (r0 == 0) goto L_0x00ac
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6445a
            boolean r0 = r0.mo20293d()
            if (r0 == 0) goto L_0x00ac
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6445a
            r0.mo20292c0()
            float r0 = r7.getX()
            r6.f6446b = r0
            float r7 = r7.getY()
            r6.f6447c = r7
            r6.f6448d = r2
            r6.m10917g()
            return r2
        L_0x00ac:
            boolean r0 = r6.f6448d
            if (r0 == 0) goto L_0x0170
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6445a
            boolean r0 = r0.mo20269H()
            if (r0 != 0) goto L_0x0170
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6445a
            boolean r0 = r0.mo20262A()
            if (r0 == 0) goto L_0x00c2
            goto L_0x0170
        L_0x00c2:
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6445a
            boolean r0 = r0.mo20267F()
            if (r0 != 0) goto L_0x0111
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6445a
            boolean r0 = r0.mo20272K()
            if (r0 == 0) goto L_0x0111
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6445a
            int r0 = r0.mo20315v()
            int r0 = -r0
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00f0
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6445a
            android.view.View r0 = r0.mo20314u()
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r3 = r6.f6445a
            int r3 = r3.mo20315v()
            boolean r0 = p112w2.C3896c.m11102h(r0, r3)
            if (r0 != 0) goto L_0x00f5
        L_0x00f0:
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6445a
            r0.mo20297f(r7)
        L_0x00f5:
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r7 = r6.f6445a
            float r7 = r7.mo20312s()
            r0 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 * r0
            float r7 = java.lang.Math.min(r7, r1)
            float r1 = java.lang.Math.max(r5, r7)
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r7 = r6.f6445a
            v2.a r7 = r7.mo20305l()
            r7.mo26271L(r1)
            goto L_0x0162
        L_0x0111:
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6445a
            boolean r0 = r0.mo20266E()
            if (r0 != 0) goto L_0x0162
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6445a
            boolean r0 = r0.mo20271J()
            if (r0 == 0) goto L_0x0162
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6445a
            int r0 = r0.mo20315v()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x013e
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6445a
            android.view.View r0 = r0.mo20314u()
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r6.f6445a
            int r4 = r4.mo20315v()
            boolean r0 = p112w2.C3896c.m11101g(r0, r4)
            if (r0 != 0) goto L_0x0143
        L_0x013e:
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6445a
            r0.mo20297f(r7)
        L_0x0143:
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r7 = r6.f6445a
            int r7 = r7.mo20311r()
            int r7 = -r7
            int r7 = r7 * 2
            float r7 = (float) r7
            float r7 = java.lang.Math.max(r7, r1)
            float r1 = java.lang.Math.min(r5, r7)
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r7 = r6.f6445a
            v2.a r7 = r7.mo20305l()
            float r0 = java.lang.Math.abs(r1)
            r7.mo26270K(r0)
        L_0x0162:
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x016f
            boolean r7 = r6.f6451g
            if (r7 != 0) goto L_0x016f
            r6.f6451g = r2
            r6.m10918h()
        L_0x016f:
            return r2
        L_0x0170:
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6445a
            boolean r7 = r0.mo20297f(r7)
            return r7
        L_0x0177:
            boolean r0 = r6.f6448d
            if (r0 == 0) goto L_0x0170
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r7 = r6.f6445a
            boolean r7 = r7.mo20272K()
            if (r7 == 0) goto L_0x0186
            r6.f6449e = r2
            goto L_0x0190
        L_0x0186:
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r7 = r6.f6445a
            boolean r7 = r7.mo20271J()
            if (r7 == 0) goto L_0x0190
            r6.f6450f = r2
        L_0x0190:
            r6.f6448d = r1
            return r2
        L_0x0193:
            r6.f6451g = r1
            r6.f6448d = r1
            float r0 = r7.getX()
            r6.f6446b = r0
            float r0 = r7.getY()
            r6.f6447c = r0
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6445a
            boolean r0 = r0.mo20317x()
            if (r0 == 0) goto L_0x01c5
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6445a
            boolean r0 = r0.mo20270I()
            if (r0 != 0) goto L_0x01b8
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6445a
            r0.mo20287Z(r1)
        L_0x01b8:
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6445a
            boolean r0 = r0.mo20319z()
            if (r0 != 0) goto L_0x01c5
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6445a
            r0.mo20286Y(r1)
        L_0x01c5:
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r6.f6445a
            r0.mo20297f(r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p108v2.C3826e.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: e */
    public boolean mo26296e(MotionEvent motionEvent) {
        return false;
    }

    /* renamed from: f */
    public void mo26297f(MotionEvent motionEvent) {
    }
}
