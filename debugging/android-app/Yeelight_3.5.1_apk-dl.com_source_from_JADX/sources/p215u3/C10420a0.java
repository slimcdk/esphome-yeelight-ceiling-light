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
import com.yeelight.yeelib.p142ui.activity.FanclFlexSwitchSettingActivity;
import com.yeelight.yeelib.p142ui.activity.FlexSwitchSettingActivity;
import com.yeelight.yeelib.p142ui.view.RedSpotTipTextView;
import p207s3.C10337c;

/* renamed from: u3.a0 */
public class C10420a0 extends C6093d {
    public C10420a0(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m26442r(Activity activity, C3010c cVar, View view) {
        mo31695o(activity, cVar.mo23185G());
    }

    /* renamed from: a */
    public View mo31681a(Activity activity, C3010c cVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        RedSpotTipTextView redSpotTipTextView = (RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name);
        this.f12505a = redSpotTipTextView;
        redSpotTipTextView.setText(this.f12507c);
        if (mo31691k((C3010c) null)) {
            mo31694n(true);
        }
        relativeLayout.setOnClickListener(new C10529z(this, activity, cVar));
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
        return mo31689i() instanceof C10337c ? FanclFlexSwitchSettingActivity.class : FlexSwitchSettingActivity.class;
    }

    /* renamed from: j */
    public boolean mo31690j() {
        return false;
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
    }
}