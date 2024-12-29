package p215u3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.yeelight.cherry.p141ui.activity.MiBandBindActivity;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C6093d;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.view.RedSpotTipTextView;

/* renamed from: u3.w0 */
public class C10515w0 extends C6093d {

    /* renamed from: u3.w0$a */
    class C10516a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f19664a;

        /* renamed from: b */
        final /* synthetic */ C3010c f19665b;

        C10516a(Activity activity, C3010c cVar) {
            this.f19664a = activity;
            this.f19665b = cVar;
        }

        public void onClick(View view) {
            C10515w0.this.mo31695o(this.f19664a, this.f19665b.mo23185G());
        }
    }

    public C10515w0(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    public C10515w0(int i, String str, int i2, String str2, boolean z) {
        super(i, str, i2, str2, z);
    }

    /* renamed from: a */
    public View mo31681a(Activity activity, C3010c cVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        TextView textView = (TextView) inflate.findViewById(R$id.feature_item_info);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12506b);
        ((RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name)).setText(this.f12507c);
        relativeLayout.setOnClickListener(new C10516a(activity, cVar));
        return relativeLayout;
    }

    /* renamed from: b */
    public void mo31682b() {
    }

    /* renamed from: c */
    public void mo31683c(C3010c cVar) {
    }

    /* renamed from: h */
    public Class mo31688h() {
        Class<MiBandBindActivity> cls = MiBandBindActivity.class;
        try {
            String str = MiBandBindActivity.f10884d;
            return cls;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: j */
    public boolean mo31690j() {
        C3010c j0 = YeelightDeviceManager.m7794j0(this.f12510f);
        if (j0 != null) {
            return j0.mo23221d0().mo31578a0();
        }
        return false;
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
    }
}
