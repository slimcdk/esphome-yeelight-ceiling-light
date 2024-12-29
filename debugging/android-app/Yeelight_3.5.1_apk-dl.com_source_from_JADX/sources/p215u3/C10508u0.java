package p215u3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.yeelight.cherry.p141ui.activity.MeshDeviceLoginActivity;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C6093d;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.p142ui.view.RedSpotTipTextView;

/* renamed from: u3.u0 */
public class C10508u0 extends C6093d {

    /* renamed from: h */
    private TextView f19654h;

    /* renamed from: u3.u0$a */
    class C10509a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3010c f19655a;

        /* renamed from: b */
        final /* synthetic */ Activity f19656b;

        C10509a(C3010c cVar, Activity activity) {
            this.f19655a = cVar;
            this.f19656b = activity;
        }

        public void onClick(View view) {
            StringBuilder sb = new StringBuilder();
            sb.append("MeshGroupFeature deviceId = ");
            sb.append(this.f19655a.mo23185G());
            C10508u0.this.mo31695o(this.f19656b, this.f19655a.mo23185G());
        }
    }

    public C10508u0(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    /* renamed from: q */
    private void m26682q() {
    }

    /* renamed from: a */
    public View mo31681a(Activity activity, C3010c cVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12506b);
        ((RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name)).setText(this.f12507c);
        this.f12510f = cVar.mo23185G();
        relativeLayout.setOnClickListener(new C10509a(cVar, activity));
        m26682q();
        return relativeLayout;
    }

    /* renamed from: b */
    public void mo31682b() {
        TextView textView = this.f19654h;
        if (textView != null) {
            textView.removeCallbacks((Runnable) null);
            this.f19654h = null;
        }
    }

    /* renamed from: c */
    public void mo31683c(C3010c cVar) {
    }

    /* renamed from: h */
    public Class mo31688h() {
        Class<MeshDeviceLoginActivity> cls = MeshDeviceLoginActivity.class;
        try {
            int i = MeshDeviceLoginActivity.f10770g;
            return cls;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: j */
    public boolean mo31690j() {
        return false;
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == -1 || i == 4096) {
            m26682q();
        }
    }
}
