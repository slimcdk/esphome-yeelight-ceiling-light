package com.lcodecore.tkrefreshlayout.p143i;

import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.lcodecore.tkrefreshlayout.p144j.C3423c;

/* renamed from: com.lcodecore.tkrefreshlayout.i.d */
public class C3418d extends C3416b {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public float f6672c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f6673d = 0;

    /* renamed from: e */
    private boolean f6674e = false;

    /* renamed from: f */
    private boolean f6675f = false;

    /* renamed from: g */
    private boolean f6676g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Handler f6677h = new C3419a();

    /* renamed from: com.lcodecore.tkrefreshlayout.i.d$a */
    class C3419a extends Handler {
        C3419a() {
        }

        public void handleMessage(Message message) {
            int v = C3418d.this.f6671b.mo18702v();
            int i = message.what;
            if (i == 0) {
                int unused = C3418d.this.f6673d = -1;
            } else if (i != 1) {
                if (i == 2) {
                    int unused2 = C3418d.this.f6673d = 60;
                    return;
                }
                return;
            }
            C3418d.m10598i(C3418d.this);
            View u = C3418d.this.f6671b.mo18701u();
            if (C3418d.this.f6671b.mo18676b()) {
                if (C3418d.this.f6672c >= 3000.0f) {
                    if (C3423c.m10625h(u, v)) {
                        C3418d.this.f6671b.mo18692l().mo18755F(C3418d.this.f6672c, C3418d.this.f6673d);
                    }
                } else if (C3418d.this.f6672c <= -3000.0f && C3423c.m10624g(u, v)) {
                    C3418d.this.f6671b.mo18692l().mo18754E(C3418d.this.f6672c, C3418d.this.f6673d);
                }
                float unused3 = C3418d.this.f6672c = 0.0f;
                int unused4 = C3418d.this.f6673d = 60;
            }
            if (C3418d.this.f6673d < 60) {
                C3418d.this.f6677h.sendEmptyMessageDelayed(1, 10);
            }
        }
    }

    public C3418d(TwinklingRefreshLayout.C3385d dVar, C3417c cVar) {
        super(dVar, cVar);
    }

    /* renamed from: i */
    static /* synthetic */ int m10598i(C3418d dVar) {
        int i = dVar.f6673d;
        dVar.f6673d = i + 1;
        return i;
    }

    /* renamed from: a */
    public void mo18779a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2, float f3, float f4) {
        C3417c cVar = this.f6670a;
        if (cVar != null) {
            cVar.mo18779a(motionEvent, motionEvent2, f, f2, f3, f4);
        }
    }

    /* renamed from: b */
    public boolean mo18780b(MotionEvent motionEvent) {
        C3417c cVar = this.f6670a;
        return cVar != null && cVar.mo18780b(motionEvent);
    }

    /* renamed from: c */
    public void mo18781c(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C3417c cVar = this.f6670a;
        if (cVar != null) {
            cVar.mo18781c(motionEvent, motionEvent2, f, f2);
        }
        if (this.f6671b.mo18688h()) {
            int y = (int) (motionEvent2.getY() - motionEvent.getY());
            if (y < (-this.f6671b.mo18702v()) && this.f6675f) {
                return;
            }
            if (y <= this.f6671b.mo18702v() || !this.f6674e) {
                this.f6672c = f2;
                if (Math.abs(f2) >= 3000.0f) {
                    this.f6677h.sendEmptyMessage(0);
                    this.f6676g = true;
                    return;
                }
                this.f6672c = 0.0f;
                this.f6673d = 60;
            }
        }
    }

    /* renamed from: d */
    public void mo18782d(MotionEvent motionEvent, boolean z) {
        C3417c cVar = this.f6670a;
        if (cVar != null) {
            cVar.mo18782d(motionEvent, this.f6676g && z);
        }
        this.f6676g = false;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C3417c cVar = this.f6670a;
        return cVar != null && cVar.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public boolean mo18784e(MotionEvent motionEvent) {
        C3417c cVar = this.f6670a;
        return cVar != null && cVar.mo18784e(motionEvent);
    }

    /* renamed from: f */
    public void mo18785f(MotionEvent motionEvent) {
        C3417c cVar = this.f6670a;
        if (cVar != null) {
            cVar.mo18785f(motionEvent);
        }
        this.f6674e = C3423c.m10625h(this.f6671b.mo18701u(), this.f6671b.mo18702v());
        this.f6675f = C3423c.m10624g(this.f6671b.mo18701u(), this.f6671b.mo18702v());
    }
}
