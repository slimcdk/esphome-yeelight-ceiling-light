package p215u3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C6093d;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.KidModeNewActivity;
import com.yeelight.yeelib.p142ui.view.RedSpotTipTextView;

/* renamed from: u3.n0 */
public class C10482n0 extends C6093d {

    /* renamed from: h */
    private TextView f19614h;

    /* renamed from: u3.n0$a */
    class C10483a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f19615a;

        /* renamed from: b */
        final /* synthetic */ C3010c f19616b;

        C10483a(Activity activity, C3010c cVar) {
            this.f19615a = activity;
            this.f19616b = cVar;
        }

        public void onClick(View view) {
            C10482n0.this.mo31695o(this.f19615a, this.f19616b.mo23185G());
        }
    }

    public C10482n0(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    public C10482n0(int i, String str, int i2, String str2, boolean z) {
        super(i, str, i2, str2, z);
    }

    /* renamed from: q */
    private void m26616q() {
    }

    /* renamed from: a */
    public View mo31681a(Activity activity, C3010c cVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12506b);
        ((RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name)).setText(this.f12507c);
        this.f12510f = cVar.mo23185G();
        relativeLayout.setOnClickListener(new C10483a(activity, cVar));
        m26616q();
        return relativeLayout;
    }

    /* renamed from: b */
    public void mo31682b() {
        TextView textView = this.f19614h;
        if (textView != null) {
            textView.removeCallbacks((Runnable) null);
            this.f19614h = null;
        }
    }

    /* renamed from: c */
    public void mo31683c(C3010c cVar) {
        if (cVar.mo23221d0().mo31611r(17) == null) {
            cVar.mo23166x(16, (Object) null);
        }
    }

    /* renamed from: h */
    public Class mo31688h() {
        return KidModeNewActivity.class;
    }

    /* renamed from: j */
    public boolean mo31690j() {
        C3010c j0 = YeelightDeviceManager.m7794j0(this.f12510f);
        if (j0 != null) {
            return j0.mo23221d0().mo31572X();
        }
        return false;
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == -1 || i == 4096) {
            m26616q();
        }
    }
}
