package p215u3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.device.C6081a;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C6093d;
import com.yeelight.yeelib.device.base.C6100g;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.models.YeelightTimer;
import com.yeelight.yeelib.device.status.TimerModel;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.LightAlarmActivity;
import com.yeelight.yeelib.p142ui.activity.WifiLightAlarmActivity;
import com.yeelight.yeelib.p142ui.view.RedSpotTipTextView;
import java.util.List;
import p232y3.C12036a;

/* renamed from: u3.i1 */
public class C10463i1 extends C6093d {

    /* renamed from: u3.i1$a */
    class C10464a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f19588a;

        /* renamed from: b */
        final /* synthetic */ C3010c f19589b;

        C10464a(Activity activity, C3010c cVar) {
            this.f19588a = activity;
            this.f19589b = cVar;
        }

        public void onClick(View view) {
            C10463i1.this.mo31695o(this.f19588a, this.f19589b.mo23185G());
        }
    }

    public C10463i1(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    /* renamed from: a */
    public View mo31681a(Activity activity, C3010c cVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12506b);
        ((RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name)).setText(this.f12507c);
        relativeLayout.setOnClickListener(new C10464a(activity, cVar));
        return relativeLayout;
    }

    /* renamed from: b */
    public void mo31682b() {
    }

    /* renamed from: c */
    public void mo31683c(C3010c cVar) {
        if (!this.f12508d) {
            cVar.mo23166x(8, (Object) null);
        }
    }

    /* renamed from: h */
    public Class mo31688h() {
        if ((YeelightDeviceManager.m7794j0(this.f12510f) instanceof WifiDeviceBase) || (YeelightDeviceManager.m7794j0(this.f12510f) instanceof C6100g)) {
            return WifiLightAlarmActivity.class;
        }
        if (YeelightDeviceManager.m7794j0(this.f12510f) instanceof C6081a) {
            return LightAlarmActivity.class;
        }
        return null;
    }

    /* renamed from: j */
    public boolean mo31690j() {
        List<TimerModel> list;
        C3010c j0 = YeelightDeviceManager.m7794j0(this.f12510f);
        if (j0 instanceof WifiDeviceBase) {
            List<YeelightTimer> list2 = (List) j0.mo23221d0().mo31611r(1);
            if (list2 != null) {
                for (YeelightTimer isTimerEnabled : list2) {
                    if (isTimerEnabled.isTimerEnabled()) {
                        return true;
                    }
                }
            }
        } else if (!(j0 == null || (list = (List) j0.mo23221d0().mo31611r(1)) == null)) {
            for (TimerModel isEnable : list) {
                if (isEnable.isEnable()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        List<TimerModel> list;
        if (i == 4096 && (deviceStatusBase instanceof C12036a) && (list = (List) deviceStatusBase.mo31611r(1)) != null) {
            for (TimerModel timerModel : list) {
                if (timerModel != null) {
                    this.f12508d = true;
                    return;
                }
            }
        }
    }
}
