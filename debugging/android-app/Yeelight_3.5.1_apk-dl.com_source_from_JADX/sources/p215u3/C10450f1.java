package p215u3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.yeelight.cherry.p141ui.activity.DeviceShareActivity;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.device.C6081a;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C6093d;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.p142ui.activity.ShareDeviceActivity;
import com.yeelight.yeelib.p142ui.view.RedSpotTipTextView;

/* renamed from: u3.f1 */
public class C10450f1 extends C6093d {

    /* renamed from: h */
    private C3010c f19564h;

    /* renamed from: u3.f1$a */
    class C10451a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f19565a;

        /* renamed from: b */
        final /* synthetic */ C3010c f19566b;

        C10451a(Activity activity, C3010c cVar) {
            this.f19565a = activity;
            this.f19566b = cVar;
        }

        public void onClick(View view) {
            C10450f1.this.mo31695o(this.f19565a, this.f19566b.mo23185G());
        }
    }

    public C10450f1(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    /* renamed from: a */
    public View mo31681a(Activity activity, C3010c cVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        this.f19564h = cVar;
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12506b);
        ((RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name)).setText(this.f12507c);
        relativeLayout.setOnClickListener(new C10451a(activity, cVar));
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
        if (this.f19564h instanceof C6081a) {
            return ShareDeviceActivity.class;
        }
        Class<DeviceShareActivity> cls = DeviceShareActivity.class;
        try {
            int i = DeviceShareActivity.f10355q;
            return cls;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: j */
    public boolean mo31690j() {
        return false;
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
    }
}
