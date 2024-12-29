package p108v2;

import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import p112w2.C3896c;

/* renamed from: v2.d */
public class C3824d extends C3822b {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public float f6438c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f6439d = 0;

    /* renamed from: e */
    private boolean f6440e = false;

    /* renamed from: f */
    private boolean f6441f = false;

    /* renamed from: g */
    private boolean f6442g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Handler f6443h = new C3825a();

    /* renamed from: v2.d$a */
    class C3825a extends Handler {
        C3825a() {
        }

        public void handleMessage(Message message) {
            int v = C3824d.this.f6437b.mo20315v();
            int i = message.what;
            if (i == 0) {
                int unused = C3824d.this.f6439d = -1;
            } else if (i != 1) {
                if (i == 2) {
                    int unused2 = C3824d.this.f6439d = 60;
                    return;
                }
                return;
            }
            C3824d.m10907i(C3824d.this);
            View u = C3824d.this.f6437b.mo20314u();
            if (C3824d.this.f6437b.mo20289b()) {
                if (C3824d.this.f6438c >= 3000.0f) {
                    if (C3896c.m11102h(u, v)) {
                        C3824d.this.f6437b.mo20305l().mo26267F(C3824d.this.f6438c, C3824d.this.f6439d);
                    }
                } else if (C3824d.this.f6438c <= -3000.0f && C3896c.m11101g(u, v)) {
                    C3824d.this.f6437b.mo20305l().mo26266E(C3824d.this.f6438c, C3824d.this.f6439d);
                }
                float unused3 = C3824d.this.f6438c = 0.0f;
                int unused4 = C3824d.this.f6439d = 60;
            }
            if (C3824d.this.f6439d < 60) {
                C3824d.this.f6443h.sendEmptyMessageDelayed(1, 10);
            }
        }
    }

    public C3824d(TwinklingRefreshLayout.C2689d dVar, C3823c cVar) {
        super(dVar, cVar);
    }

    /* renamed from: i */
    static /* synthetic */ int m10907i(C3824d dVar) {
        int i = dVar.f6439d;
        dVar.f6439d = i + 1;
        return i;
    }

    /* renamed from: a */
    public void mo26291a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2, float f3, float f4) {
        C3823c cVar = this.f6436a;
        if (cVar != null) {
            cVar.mo26291a(motionEvent, motionEvent2, f, f2, f3, f4);
        }
    }

    /* renamed from: b */
    public boolean mo26292b(MotionEvent motionEvent) {
        C3823c cVar = this.f6436a;
        return cVar != null && cVar.mo26292b(motionEvent);
    }

    /* renamed from: c */
    public void mo26293c(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C3823c cVar = this.f6436a;
        if (cVar != null) {
            cVar.mo26293c(motionEvent, motionEvent2, f, f2);
        }
        if (this.f6437b.mo20301h()) {
            int y = (int) (motionEvent2.getY() - motionEvent.getY());
            if (y < (-this.f6437b.mo20315v()) && this.f6441f) {
                return;
            }
            if (y <= this.f6437b.mo20315v() || !this.f6440e) {
                this.f6438c = f2;
                if (Math.abs(f2) >= 3000.0f) {
                    this.f6443h.sendEmptyMessage(0);
                    this.f6442g = true;
                    return;
                }
                this.f6438c = 0.0f;
                this.f6439d = 60;
            }
        }
    }

    /* renamed from: d */
    public void mo26294d(MotionEvent motionEvent, boolean z) {
        C3823c cVar = this.f6436a;
        if (cVar != null) {
            cVar.mo26294d(motionEvent, this.f6442g && z);
        }
        this.f6442g = false;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C3823c cVar = this.f6436a;
        return cVar != null && cVar.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public boolean mo26296e(MotionEvent motionEvent) {
        C3823c cVar = this.f6436a;
        return cVar != null && cVar.mo26296e(motionEvent);
    }

    /* renamed from: f */
    public void mo26297f(MotionEvent motionEvent) {
        C3823c cVar = this.f6436a;
        if (cVar != null) {
            cVar.mo26297f(motionEvent);
        }
        this.f6440e = C3896c.m11102h(this.f6437b.mo20314u(), this.f6437b.mo20315v());
        this.f6441f = C3896c.m11101g(this.f6437b.mo20314u(), this.f6437b.mo20315v());
    }
}
