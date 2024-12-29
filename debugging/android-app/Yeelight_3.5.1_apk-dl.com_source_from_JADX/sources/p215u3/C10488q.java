package p215u3;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.C6081a;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.C6093d;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.DelaySetNewActivity;
import com.yeelight.yeelib.p142ui.view.RedSpotTipTextView;
import com.yeelight.yeelib.p142ui.view.YeelightSwitchButton;
import p232y3.C12041e;

/* renamed from: u3.q */
public class C10488q extends C6093d {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public TextView f19624h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public YeelightSwitchButton f19625i;

    /* renamed from: j */
    Handler f19626j = new C10489a(Looper.getMainLooper());

    /* renamed from: u3.q$a */
    class C10489a extends Handler {
        C10489a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            C3010c i;
            if (message.what == 1 && (i = C10488q.this.mo31689i()) != null) {
                i.mo23166x(2, (Object) null);
            }
        }
    }

    /* renamed from: u3.q$b */
    class C10490b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f19628a;

        /* renamed from: b */
        final /* synthetic */ C3010c f19629b;

        C10490b(Activity activity, C3010c cVar) {
            this.f19628a = activity;
            this.f19629b = cVar;
        }

        public void onClick(View view) {
            C10488q.this.mo31695o(this.f19628a, this.f19629b.mo23185G());
        }
    }

    /* renamed from: u3.q$c */
    class C10491c implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C3010c f19631a;

        /* renamed from: b */
        final /* synthetic */ Activity f19632b;

        C10491c(C3010c cVar, Activity activity) {
            this.f19631a = cVar;
            this.f19632b = activity;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Activity activity;
            int i;
            Resources resources;
            C12041e eVar;
            int i2;
            C3010c cVar;
            if (z) {
                eVar = new C12041e(this.f19631a.mo23181D(), this.f19631a.mo23181D());
                if (((C3012e) this.f19631a).mo23146k1()) {
                    cVar = this.f19631a;
                    i2 = 10;
                } else {
                    C10488q.this.f19625i.setChecked(false);
                    activity = this.f19632b;
                    resources = activity.getResources();
                    i = R$string.feature_delay_not_available;
                    Toast.makeText(activity, resources.getString(i), 0).show();
                    C10488q.this.f19626j.removeMessages(1);
                    C10488q.this.f19626j.sendEmptyMessageDelayed(1, 2000);
                }
            } else {
                eVar = new C12041e(-1, -1);
                cVar = this.f19631a;
                i2 = 14;
            }
            cVar.mo23166x(i2, eVar);
            activity = this.f19632b;
            resources = activity.getResources();
            i = R$string.common_text_set_complete;
            Toast.makeText(activity, resources.getString(i), 0).show();
            C10488q.this.f19626j.removeMessages(1);
            C10488q.this.f19626j.sendEmptyMessageDelayed(1, 2000);
        }
    }

    /* renamed from: u3.q$d */
    class C10492d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12041e f19634a;

        C10492d(C12041e eVar) {
            this.f19634a = eVar;
        }

        public void run() {
            if (C10488q.this.f19624h != null) {
                C10488q.this.m26639t(this.f19634a);
            }
        }
    }

    /* renamed from: u3.q$e */
    class C10493e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12041e f19636a;

        C10493e(C12041e eVar) {
            this.f19636a = eVar;
        }

        public void run() {
            if (C10488q.this.f19624h != null) {
                C10488q.this.m26639t(this.f19636a);
            }
        }
    }

    public C10488q(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    public C10488q(int i, String str, int i2, String str2, boolean z) {
        super(i, str, i2, str2, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m26639t(C12041e eVar) {
        YeelightSwitchButton yeelightSwitchButton = this.f19625i;
        if (yeelightSwitchButton != null) {
            yeelightSwitchButton.setChecked(eVar.mo42679c());
        }
    }

    /* renamed from: a */
    public View mo31681a(Activity activity, C3010c cVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        TextView textView = (TextView) inflate.findViewById(R$id.feature_item_info);
        this.f19624h = textView;
        textView.setVisibility(8);
        YeelightSwitchButton yeelightSwitchButton = (YeelightSwitchButton) inflate.findViewById(R$id.feature_item_switch_view);
        this.f19625i = yeelightSwitchButton;
        yeelightSwitchButton.setVisibility(0);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12506b);
        ((RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name)).setText(this.f12507c);
        relativeLayout.setOnClickListener(new C10490b(activity, cVar));
        C3012e eVar = (C3012e) cVar;
        this.f19625i.setOnPerformCheckedChangeListener(new C10491c(cVar, activity));
        C12041e eVar2 = (C12041e) cVar.mo23221d0().mo31611r(2);
        if (eVar2 != null) {
            m26639t(eVar2);
        }
        return relativeLayout;
    }

    /* renamed from: b */
    public void mo31682b() {
        TextView textView = this.f19624h;
        if (textView != null) {
            textView.removeCallbacks((Runnable) null);
            this.f19624h = null;
        }
        this.f19625i = null;
    }

    /* renamed from: c */
    public void mo31683c(C3010c cVar) {
        if (!this.f12508d || (YeelightDeviceManager.m7794j0(this.f12510f) instanceof C6081a)) {
            cVar.mo23166x(2, (Object) null);
        }
    }

    /* renamed from: h */
    public Class mo31688h() {
        return DelaySetNewActivity.class;
    }

    /* renamed from: j */
    public boolean mo31690j() {
        C12041e eVar;
        C3010c j0 = YeelightDeviceManager.m7794j0(this.f12510f);
        if (j0 == null || (eVar = (C12041e) j0.mo23221d0().mo31611r(2)) == null) {
            return false;
        }
        return eVar.mo42679c();
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        TextView textView;
        Runnable eVar;
        C12041e eVar2;
        if (i != -1) {
            if (i == 4096 && (eVar2 = (C12041e) deviceStatusBase.mo31611r(2)) != null) {
                this.f12508d = true;
                textView = this.f19624h;
                if (textView != null) {
                    eVar = new C10492d(eVar2);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (this.f12508d) {
            C12041e eVar3 = (C12041e) deviceStatusBase.mo31611r(2);
            textView = this.f19624h;
            if (textView != null && eVar3 != null) {
                eVar = new C10493e(eVar3);
            } else {
                return;
            }
        } else {
            return;
        }
        textView.post(eVar);
    }
}
