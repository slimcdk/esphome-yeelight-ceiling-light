package p215u3;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C6093d;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.p142ui.view.RedSpotTipTextView;
import p170i4.C9113d;

/* renamed from: u3.s */
public class C10499s extends C6093d {

    /* renamed from: u3.s$a */
    class C10500a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f19646a;

        /* renamed from: b */
        final /* synthetic */ C3010c f19647b;

        /* renamed from: u3.s$a$a */
        class C10501a implements DialogInterface.OnClickListener {
            C10501a(C10500a aVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }

        /* renamed from: u3.s$a$b */
        class C10502b implements DialogInterface.OnClickListener {
            C10502b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C10500a.this.f19647b.mo23156r();
                C10500a.this.f19646a.finish();
            }
        }

        C10500a(C10499s sVar, Activity activity, C3010c cVar) {
            this.f19646a = activity;
            this.f19647b = cVar;
        }

        public void onClick(View view) {
            C9113d b = new C9113d.C9118e(this.f19646a).mo37179i(this.f19646a.getString(R$string.feature_disconnect_bt)).mo37177g(this.f19646a.getString(R$string.setting_disconnect_text_1)).mo37172b();
            b.mo37156g(-2, this.f19646a.getString(R$string.cancel).toString(), new C10501a(this));
            b.mo37156g(-1, this.f19646a.getString(R$string.common_text_ok).toString(), new C10502b());
            b.setCancelable(true);
            b.show();
        }
    }

    public C10499s(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    /* renamed from: a */
    public View mo31681a(Activity activity, C3010c cVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12506b);
        ((RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name)).setText(this.f12507c);
        relativeLayout.setOnClickListener(new C10500a(this, activity, cVar));
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
