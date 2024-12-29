package p215u3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C6093d;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.p142ui.activity.RemoteManagementActivity;
import com.yeelight.yeelib.p142ui.view.RedSpotTipTextView;

/* renamed from: u3.b1 */
public class C10427b1 extends C6093d {

    /* renamed from: u3.b1$a */
    class C10428a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f19530a;

        /* renamed from: b */
        final /* synthetic */ C3010c f19531b;

        C10428a(Activity activity, C3010c cVar) {
            this.f19530a = activity;
            this.f19531b = cVar;
        }

        public void onClick(View view) {
            C10427b1.this.mo31695o(this.f19530a, this.f19531b.mo23185G());
        }
    }

    public C10427b1(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    /* renamed from: a */
    public View mo31681a(Activity activity, C3010c cVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12506b);
        ((RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name)).setText(this.f12507c);
        this.f12510f = cVar.mo23185G();
        relativeLayout.setOnClickListener(new C10428a(activity, cVar));
        return relativeLayout;
    }

    /* renamed from: b */
    public void mo31682b() {
    }

    /* renamed from: c */
    public void mo31683c(C3010c cVar) {
        if (!this.f12508d) {
            cVar.mo23166x(18, (Object) null);
        }
    }

    /* renamed from: h */
    public Class mo31688h() {
        return RemoteManagementActivity.class;
    }

    /* renamed from: j */
    public boolean mo31690j() {
        return false;
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == 4096 && deviceStatusBase.mo31609q() != null) {
            this.f12508d = true;
        }
    }
}
