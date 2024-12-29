package p215u3;

import android.app.Activity;
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
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.C6093d;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.NightLightNewActivity;
import com.yeelight.yeelib.p142ui.view.RedSpotTipTextView;
import com.yeelight.yeelib.p142ui.view.YeelightSwitchButton;

/* renamed from: u3.y0 */
public class C10524y0 extends C6093d {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public TextView f19682h;

    /* renamed from: i */
    private YeelightSwitchButton f19683i;

    /* renamed from: u3.y0$a */
    class C10525a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f19684a;

        /* renamed from: b */
        final /* synthetic */ C3010c f19685b;

        C10525a(Activity activity, C3010c cVar) {
            this.f19684a = activity;
            this.f19685b = cVar;
        }

        public void onClick(View view) {
            C10524y0.this.mo31695o(this.f19684a, this.f19685b.mo23185G());
        }
    }

    /* renamed from: u3.y0$b */
    class C10526b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C3010c f19687a;

        /* renamed from: b */
        final /* synthetic */ Activity f19688b;

        C10526b(C10524y0 y0Var, C3010c cVar, Activity activity) {
            this.f19687a = cVar;
            this.f19688b = activity;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ((C3012e) this.f19687a).mo23142f1(z);
            Activity activity = this.f19688b;
            Toast.makeText(activity, activity.getResources().getString(R$string.common_text_set_complete), 0).show();
            this.f19687a.mo23166x(3, (Object) null);
        }
    }

    /* renamed from: u3.y0$c */
    class C10527c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DeviceStatusBase f19689a;

        C10527c(DeviceStatusBase deviceStatusBase) {
            this.f19689a = deviceStatusBase;
        }

        public void run() {
            if (C10524y0.this.f19682h != null) {
                C10524y0.this.m26871s(this.f19689a);
            }
        }
    }

    /* renamed from: u3.y0$d */
    class C10528d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DeviceStatusBase f19691a;

        C10528d(DeviceStatusBase deviceStatusBase) {
            this.f19691a = deviceStatusBase;
        }

        public void run() {
            if (C10524y0.this.f19682h != null) {
                C10524y0.this.m26871s(this.f19691a);
            }
        }
    }

    public C10524y0(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    public C10524y0(int i, String str, int i2, String str2, boolean z) {
        super(i, str, i2, str2, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m26871s(DeviceStatusBase deviceStatusBase) {
        YeelightSwitchButton yeelightSwitchButton = this.f19683i;
        if (yeelightSwitchButton != null) {
            yeelightSwitchButton.setChecked(deviceStatusBase.mo31582c0());
        }
    }

    /* renamed from: a */
    public View mo31681a(Activity activity, C3010c cVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        TextView textView = (TextView) inflate.findViewById(R$id.feature_item_info);
        this.f19682h = textView;
        textView.setVisibility(8);
        YeelightSwitchButton yeelightSwitchButton = (YeelightSwitchButton) inflate.findViewById(R$id.feature_item_switch_view);
        this.f19683i = yeelightSwitchButton;
        yeelightSwitchButton.setVisibility(0);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12506b);
        ((RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name)).setText(this.f12507c);
        relativeLayout.setOnClickListener(new C10525a(activity, cVar));
        this.f19683i.setChecked(((C3012e) cVar).mo23221d0().mo31582c0());
        this.f19683i.setOnPerformCheckedChangeListener(new C10526b(this, cVar, activity));
        m26871s(cVar.mo23221d0());
        return relativeLayout;
    }

    /* renamed from: b */
    public void mo31682b() {
        TextView textView = this.f19682h;
        if (textView != null) {
            textView.removeCallbacks((Runnable) null);
            this.f19682h = null;
        }
        this.f19683i = null;
    }

    /* renamed from: c */
    public void mo31683c(C3010c cVar) {
        if (!this.f12508d) {
            cVar.mo23166x(3, (Object) null);
        }
    }

    /* renamed from: h */
    public Class mo31688h() {
        return NightLightNewActivity.class;
    }

    /* renamed from: j */
    public boolean mo31690j() {
        C3010c j0 = YeelightDeviceManager.m7794j0(this.f12510f);
        if (j0 != null) {
            return j0.mo23221d0().mo31582c0();
        }
        return false;
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        TextView textView;
        Runnable dVar;
        if (i != -1) {
            if (i == 4096) {
                this.f12508d = true;
                textView = this.f19682h;
                if (textView != null) {
                    dVar = new C10527c(deviceStatusBase);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (this.f12508d && (textView = this.f19682h) != null) {
            dVar = new C10528d(deviceStatusBase);
        } else {
            return;
        }
        textView.post(dVar);
    }
}
