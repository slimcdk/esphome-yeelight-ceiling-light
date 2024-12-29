package p215u3;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C6093d;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.p142ui.view.RedSpotTipTextView;
import p170i4.C9113d;

/* renamed from: u3.d1 */
public class C10437d1 extends C6093d {

    /* renamed from: u3.d1$a */
    class C10438a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f19545a;

        /* renamed from: b */
        final /* synthetic */ C3010c f19546b;

        /* renamed from: u3.d1$a$a */
        class C10439a implements DialogInterface.OnClickListener {
            C10439a(C10438a aVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }

        /* renamed from: u3.d1$a$b */
        class C10440b implements DialogInterface.OnClickListener {
            C10440b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C10438a.this.f19546b.mo23166x(7, (Object) null);
                dialogInterface.dismiss();
            }
        }

        C10438a(C10437d1 d1Var, Activity activity, C3010c cVar) {
            this.f19545a = activity;
            this.f19546b = cVar;
        }

        public void onClick(View view) {
            C9113d b = new C9113d.C9118e(this.f19545a).mo37179i(this.f19545a.getString(R$string.feature_restore)).mo37177g(this.f19545a.getString(R$string.recovery_info)).mo37172b();
            b.mo37156g(-2, this.f19545a.getString(R$string.cancel).toString(), new C10439a(this));
            b.mo37156g(-1, this.f19545a.getString(R$string.common_text_ok).toString(), new C10440b());
            b.setCancelable(true);
            b.show();
        }
    }

    public C10437d1(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    /* renamed from: a */
    public View mo31681a(Activity activity, C3010c cVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        TextView textView = (TextView) inflate.findViewById(R$id.feature_item_info);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12506b);
        ((RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name)).setText(this.f12507c);
        relativeLayout.setOnClickListener(new C10438a(this, activity, cVar));
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
        return null;
    }

    /* renamed from: j */
    public boolean mo31690j() {
        return false;
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
    }
}
