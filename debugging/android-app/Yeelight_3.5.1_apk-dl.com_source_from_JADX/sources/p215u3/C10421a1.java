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
import com.yeelight.yeelib.p142ui.activity.PomodoroNewActivity;
import com.yeelight.yeelib.p142ui.view.RedSpotTipTextView;
import p232y3.C12046i;

/* renamed from: u3.a1 */
public class C10421a1 extends C6093d {

    /* renamed from: h */
    private TextView f19520h;

    /* renamed from: u3.a1$a */
    class C10422a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f19521a;

        /* renamed from: b */
        final /* synthetic */ C3010c f19522b;

        C10422a(Activity activity, C3010c cVar) {
            this.f19521a = activity;
            this.f19522b = cVar;
        }

        public void onClick(View view) {
            C10421a1.this.mo31695o(this.f19521a, this.f19522b.mo23185G());
        }
    }

    public C10421a1(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    public C10421a1(int i, String str, int i2, String str2, boolean z) {
        super(i, str, i2, str2, z);
    }

    /* renamed from: q */
    private void m26448q(C12046i iVar) {
    }

    /* renamed from: a */
    public View mo31681a(Activity activity, C3010c cVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12506b);
        ((RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name)).setText(this.f12507c);
        this.f12510f = cVar.mo23185G();
        ((RelativeLayout) inflate.findViewById(R$id.feature_item_root)).setOnClickListener(new C10422a(activity, cVar));
        C12046i iVar = (C12046i) cVar.mo23221d0().mo31611r(11);
        if (iVar != null) {
            m26448q(iVar);
        }
        return null;
    }

    /* renamed from: b */
    public void mo31682b() {
        TextView textView = this.f19520h;
        if (textView != null) {
            textView.removeCallbacks((Runnable) null);
            this.f19520h = null;
        }
    }

    /* renamed from: c */
    public void mo31683c(C3010c cVar) {
        if (cVar.mo23221d0().mo31611r(11) == null) {
            cVar.mo23166x(15, (Object) null);
        }
    }

    /* renamed from: h */
    public Class mo31688h() {
        return PomodoroNewActivity.class;
    }

    /* renamed from: j */
    public boolean mo31690j() {
        C12046i iVar;
        C3010c j0 = YeelightDeviceManager.m7794j0(this.f12510f);
        if (j0 == null || (iVar = (C12046i) j0.mo23221d0().mo31611r(11)) == null) {
            return false;
        }
        return iVar.mo42726e();
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == -1 || i == 4096) {
            m26448q((C12046i) deviceStatusBase.mo31611r(11));
        }
    }
}
