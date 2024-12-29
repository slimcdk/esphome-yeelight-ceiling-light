package p215u3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C6093d;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.p142ui.activity.GoogleHomeLinkingActivity;
import com.yeelight.yeelib.p142ui.view.RedSpotTipTextView;

/* renamed from: u3.h0 */
public class C10457h0 extends C6093d {
    public C10457h0(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m26541r(Activity activity, C3010c cVar, View view) {
        mo31695o(activity, cVar.mo23185G());
    }

    /* renamed from: a */
    public View mo31681a(Activity activity, C3010c cVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        this.f12505a = (RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name);
        inflate.findViewById(R$id.feature_item_more).setVisibility(8);
        this.f12505a.setText(this.f12507c);
        ((RelativeLayout) inflate.findViewById(R$id.feature_item_root)).setOnClickListener(new C10453g0(this, activity, cVar));
        return inflate;
    }

    /* renamed from: b */
    public void mo31682b() {
    }

    /* renamed from: c */
    public void mo31683c(C3010c cVar) {
    }

    /* renamed from: h */
    public Class mo31688h() {
        return GoogleHomeLinkingActivity.class;
    }

    /* renamed from: j */
    public boolean mo31690j() {
        return false;
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
    }
}
