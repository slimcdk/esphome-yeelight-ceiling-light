package p215u3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.yeelight.cherry.p141ui.activity.BleMiBandBindActivity;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C6093d;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.p142ui.view.RedSpotTipTextView;

/* renamed from: u3.v0 */
public class C10511v0 extends C6093d {

    /* renamed from: u3.v0$a */
    class C10512a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f19658a;

        /* renamed from: b */
        final /* synthetic */ C3010c f19659b;

        C10512a(Activity activity, C3010c cVar) {
            this.f19658a = activity;
            this.f19659b = cVar;
        }

        public void onClick(View view) {
            C10511v0.this.mo31695o(this.f19658a, this.f19659b.mo23185G());
        }
    }

    public C10511v0(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    public C10511v0(int i, String str, int i2, String str2, boolean z) {
        super(i, str, i2, str2, z);
    }

    /* renamed from: a */
    public View mo31681a(Activity activity, C3010c cVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        TextView textView = (TextView) inflate.findViewById(R$id.feature_item_info);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12506b);
        ((RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name)).setText(this.f12507c);
        relativeLayout.setOnClickListener(new C10512a(activity, cVar));
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
        Class<BleMiBandBindActivity> cls = BleMiBandBindActivity.class;
        try {
            int i = BleMiBandBindActivity.f9905f;
            return cls;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = ((p232y3.C12038c) r0.mo23221d0()).mo42667Z0();
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo31690j() {
        /*
            r3 = this;
            java.lang.String r0 = r3.f12510f
            com.yeelight.yeelib.device.base.c r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.m7794j0(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0022
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r0.mo23221d0()
            y3.c r0 = (p232y3.C12038c) r0
            x3.c r0 = r0.mo42667Z0()
            if (r0 == 0) goto L_0x0022
            java.lang.String r2 = r0.mo42532a()
            if (r2 == 0) goto L_0x0022
            boolean r0 = r0.mo42533b()
            if (r0 == 0) goto L_0x0022
            r1 = 1
        L_0x0022:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p215u3.C10511v0.mo31690j():boolean");
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
    }
}
