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
import com.yeelight.yeelib.p142ui.activity.SwitchAiProviderActivity;
import com.yeelight.yeelib.p142ui.view.RedSpotTipTextView;

/* renamed from: u3.h1 */
public class C10458h1 extends C6093d {

    /* renamed from: u3.h1$a */
    class C10459a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f19577a;

        /* renamed from: b */
        final /* synthetic */ C3010c f19578b;

        C10459a(Activity activity, C3010c cVar) {
            this.f19577a = activity;
            this.f19578b = cVar;
        }

        public void onClick(View view) {
            C10458h1.this.mo31695o(this.f19577a, this.f19578b.mo23185G());
        }
    }

    public C10458h1(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
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
        relativeLayout.setOnClickListener(new C10459a(activity, cVar));
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
        return SwitchAiProviderActivity.class;
    }

    /* renamed from: j */
    public boolean mo31690j() {
        return false;
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
    }
}
