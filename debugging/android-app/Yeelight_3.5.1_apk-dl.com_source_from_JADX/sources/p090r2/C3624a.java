package p090r2;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.jeremyfeinstein.slidingmenu.lib.R$layout;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

/* renamed from: r2.a */
public class C3624a {

    /* renamed from: a */
    private Activity f6042a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public SlidingMenu f6043b;

    /* renamed from: c */
    private View f6044c;

    /* renamed from: d */
    private View f6045d;

    /* renamed from: e */
    private boolean f6046e = false;

    /* renamed from: f */
    private boolean f6047f = true;

    /* renamed from: r2.a$a */
    class C3625a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f6048a;

        /* renamed from: b */
        final /* synthetic */ boolean f6049b;

        C3625a(boolean z, boolean z2) {
            this.f6048a = z;
            this.f6049b = z2;
        }

        public void run() {
            if (!this.f6048a) {
                C3624a.this.f6043b.mo20044k(false);
            } else if (this.f6049b) {
                C3624a.this.f6043b.mo20046m(false);
            } else {
                C3624a.this.f6043b.mo20045l(false);
            }
        }
    }

    public C3624a(Activity activity) {
        this.f6042a = activity;
    }

    /* renamed from: b */
    public View mo25926b(int i) {
        View findViewById;
        SlidingMenu slidingMenu = this.f6043b;
        if (slidingMenu == null || (findViewById = slidingMenu.findViewById(i)) == null) {
            return null;
        }
        return findViewById;
    }

    /* renamed from: c */
    public void mo25927c(Bundle bundle) {
        this.f6043b = (SlidingMenu) LayoutInflater.from(this.f6042a).inflate(R$layout.slidingmenumain, (ViewGroup) null);
    }

    /* renamed from: d */
    public boolean mo25928d(int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f6043b.mo20032g()) {
            return false;
        }
        mo25933i();
        return true;
    }

    /* renamed from: e */
    public void mo25929e(Bundle bundle) {
        boolean z;
        if (this.f6045d == null || this.f6044c == null) {
            throw new IllegalStateException("Both setBehindContentView must be called in onCreate in addition to setContentView.");
        }
        this.f6043b.mo20029e(this.f6042a, this.f6047f ^ true ? 1 : 0);
        boolean z2 = false;
        if (bundle != null) {
            z2 = bundle.getBoolean("SlidingActivityHelper.open");
            z = bundle.getBoolean("SlidingActivityHelper.secondary");
        } else {
            z = false;
        }
        new Handler().post(new C3625a(z2, z));
    }

    /* renamed from: f */
    public void mo25930f(Bundle bundle) {
        bundle.putBoolean("SlidingActivityHelper.open", this.f6043b.mo20032g());
        bundle.putBoolean("SlidingActivityHelper.secondary", this.f6043b.mo20041h());
    }

    /* renamed from: g */
    public void mo25931g(View view, ViewGroup.LayoutParams layoutParams) {
        if (!this.f6046e) {
            this.f6044c = view;
        }
    }

    /* renamed from: h */
    public void mo25932h(View view, ViewGroup.LayoutParams layoutParams) {
        this.f6045d = view;
        this.f6043b.setMenu(view);
    }

    /* renamed from: i */
    public void mo25933i() {
        this.f6043b.mo20043j();
    }
}
