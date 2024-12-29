package p215u3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.yeelight.cherry.p141ui.activity.MusicActivity;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C6093d;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.view.RedSpotTipTextView;

/* renamed from: u3.x0 */
public class C10521x0 extends C6093d {

    /* renamed from: h */
    private TextView f19677h;

    public C10521x0(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    public C10521x0(int i, String str, int i2, String str2, boolean z) {
        super(i, str, i2, str2, z);
    }

    /* renamed from: a */
    public View mo31681a(Activity activity, C3010c cVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12506b);
        ((RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name)).setText(this.f12507c);
        this.f12510f = cVar.mo23185G();
        return relativeLayout;
    }

    /* renamed from: b */
    public void mo31682b() {
        TextView textView = this.f19677h;
        if (textView != null) {
            textView.removeCallbacks((Runnable) null);
            this.f19677h = null;
        }
    }

    /* renamed from: c */
    public void mo31683c(C3010c cVar) {
    }

    /* renamed from: h */
    public Class mo31688h() {
        Class<MusicActivity> cls = MusicActivity.class;
        try {
            int i = MusicActivity.f10946a;
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
            return j0.mo23221d0().mo31580b0();
        }
        return false;
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
    }
}
