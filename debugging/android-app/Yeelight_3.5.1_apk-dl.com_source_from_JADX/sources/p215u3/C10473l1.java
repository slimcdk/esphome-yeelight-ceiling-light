package p215u3;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C6093d;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.p142ui.view.RedSpotTipTextView;
import com.yeelight.yeelib.p142ui.widget.C8891a;
import p223w3.C11627r;

/* renamed from: u3.l1 */
public class C10473l1 extends C6093d {

    /* renamed from: u3.l1$a */
    class C10474a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f19601a;

        /* renamed from: b */
        final /* synthetic */ C3010c f19602b;

        /* renamed from: u3.l1$a$a */
        class C10475a implements DialogInterface.OnClickListener {
            C10475a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C10474a.this.f19602b.mo23131U0();
                C10474a.this.f19601a.finish();
            }
        }

        C10474a(C10473l1 l1Var, Activity activity, C3010c cVar) {
            this.f19601a = activity;
            this.f19602b = cVar;
        }

        public void onClick(View view) {
            ImageView imageView = new ImageView(this.f19601a);
            imageView.setImageDrawable(ContextCompat.getDrawable(this.f19601a, R$drawable.setting_unbind_info));
            C8891a.C8893b i = new C8891a.C8893b(this.f19601a).mo36664j(C3108x.f4951e.getString(R$string.common_text_notice)).mo36659e(this.f19601a.getString(R$string.recovery_info)).mo36665k(imageView).mo36661g(this.f19601a.getString(R$string.common_text_cancel), (DialogInterface.OnClickListener) null).mo36663i(this.f19601a.getString(R$string.common_text_unbind_sure), new C10475a());
            if (this.f19602b instanceof C11627r) {
                i.mo36659e(this.f19601a.getString(R$string.setting_unbind_text_1));
            }
            i.mo36655a().show();
        }
    }

    public C10473l1(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    /* renamed from: a */
    public View mo31681a(Activity activity, C3010c cVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        TextView textView = (TextView) inflate.findViewById(R$id.feature_item_info);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12506b);
        ((RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name)).setText(this.f12507c);
        relativeLayout.setOnClickListener(new C10474a(this, activity, cVar));
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
