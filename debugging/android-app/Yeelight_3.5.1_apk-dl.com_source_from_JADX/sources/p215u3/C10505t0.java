package p215u3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C6093d;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.p142ui.activity.MangoShortKeyNewActivity;
import com.yeelight.yeelib.p142ui.view.RedSpotTipTextView;

/* renamed from: u3.t0 */
public class C10505t0 extends C6093d {

    /* renamed from: h */
    private TextView f19649h;

    /* renamed from: u3.t0$a */
    class C10506a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f19650a;

        /* renamed from: b */
        final /* synthetic */ C3010c f19651b;

        C10506a(Activity activity, C3010c cVar) {
            this.f19650a = activity;
            this.f19651b = cVar;
        }

        public void onClick(View view) {
            C10505t0.this.mo31695o(this.f19650a, this.f19651b.mo23185G());
        }
    }

    public C10505t0(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    /* renamed from: q */
    private void m26673q() {
    }

    /* renamed from: a */
    public View mo31681a(Activity activity, C3010c cVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12506b);
        ((RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name)).setText(this.f12507c);
        this.f12510f = cVar.mo23185G();
        relativeLayout.setOnClickListener(new C10506a(activity, cVar));
        m26673q();
        return relativeLayout;
    }

    /* renamed from: b */
    public void mo31682b() {
        TextView textView = this.f19649h;
        if (textView != null) {
            textView.removeCallbacks((Runnable) null);
            this.f19649h = null;
        }
    }

    /* renamed from: c */
    public void mo31683c(C3010c cVar) {
    }

    /* renamed from: h */
    public Class mo31688h() {
        return MangoShortKeyNewActivity.class;
    }

    /* renamed from: j */
    public boolean mo31690j() {
        return false;
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == -1 || i == 4096) {
            m26673q();
        }
    }
}
