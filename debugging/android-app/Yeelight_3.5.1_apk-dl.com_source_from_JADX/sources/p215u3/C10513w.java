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
import com.yeelight.yeelib.p142ui.activity.FeedbackV3Activity;
import com.yeelight.yeelib.p142ui.view.RedSpotTipTextView;

/* renamed from: u3.w */
public class C10513w extends C6093d {

    /* renamed from: u3.w$a */
    class C10514a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f19661a;

        /* renamed from: b */
        final /* synthetic */ C3010c f19662b;

        C10514a(Activity activity, C3010c cVar) {
            this.f19661a = activity;
            this.f19662b = cVar;
        }

        public void onClick(View view) {
            C10513w.this.mo31695o(this.f19661a, this.f19662b.mo23185G());
        }
    }

    public C10513w(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    /* renamed from: a */
    public View mo31681a(Activity activity, C3010c cVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        this.f12505a = (RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12506b);
        this.f12505a.setText(this.f12507c);
        if (mo31691k((C3010c) null)) {
            mo31694n(true);
        }
        relativeLayout.setOnClickListener(new C10514a(activity, cVar));
        return relativeLayout;
    }

    /* renamed from: b */
    public void mo31682b() {
        this.f12505a = null;
    }

    /* renamed from: c */
    public void mo31683c(C3010c cVar) {
    }

    /* renamed from: h */
    public Class mo31688h() {
        return FeedbackV3Activity.class;
    }

    /* renamed from: j */
    public boolean mo31690j() {
        return false;
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
    }
}
