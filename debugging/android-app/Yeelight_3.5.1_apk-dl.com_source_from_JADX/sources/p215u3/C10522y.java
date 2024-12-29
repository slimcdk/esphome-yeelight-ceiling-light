package p215u3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.internal.view.SupportMenu;
import com.yeelight.yeelib.R$color;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C6093d;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.p142ui.view.RedSpotTipTextView;
import p227x3.C11969f;

/* renamed from: u3.y */
public class C10522y extends C6093d {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public TextView f19678h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ImageView f19679i;

    /* renamed from: u3.y$a */
    class C10523a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11969f f19680a;

        C10523a(C11969f fVar) {
            this.f19680a = fVar;
        }

        public void run() {
            int i;
            ImageView imageView;
            if (C10522y.this.f19678h != null) {
                if (this.f19680a.mo42513g()) {
                    C10522y.this.f19678h.setTextColor(SupportMenu.CATEGORY_MASK);
                    C10522y.this.f19678h.setText(this.f19680a.mo42512d());
                    imageView = C10522y.this.f19679i;
                    i = 0;
                } else {
                    C10522y.this.f19678h.setTextColor(ContextCompat.getColor(C10522y.this.f19678h.getContext(), R$color.setting_item_info_text_color));
                    C10522y.this.f19678h.setText(this.f19680a.mo42511c());
                    imageView = C10522y.this.f19679i;
                    i = 4;
                }
                imageView.setVisibility(i);
            }
        }
    }

    public C10522y(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    /* renamed from: a */
    public View mo31681a(Activity activity, C3010c cVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        this.f12505a = (RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name);
        this.f19678h = (TextView) inflate.findViewById(R$id.feature_item_info);
        this.f19679i = (ImageView) inflate.findViewById(R$id.feature_item_more);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12506b);
        this.f12505a.setText(this.f12507c);
        if (cVar.mo23197N() != null) {
            this.f19678h.setTextColor(ContextCompat.getColor(activity, R$color.setting_item_info_text_color));
            this.f19678h.setText(cVar.mo23197N().mo42511c());
            this.f19679i.setVisibility(4);
        }
        return relativeLayout;
    }

    /* renamed from: b */
    public void mo31682b() {
        TextView textView = this.f19678h;
        if (textView != null) {
            textView.removeCallbacks((Runnable) null);
            this.f19678h = null;
        }
        ImageView imageView = this.f19679i;
        if (imageView != null) {
            imageView.removeCallbacks((Runnable) null);
            this.f19679i = null;
        }
        this.f12505a = null;
    }

    /* renamed from: c */
    public void mo31683c(C3010c cVar) {
        if (cVar.mo23197N() == null || (cVar instanceof WifiDeviceBase)) {
            cVar.mo23166x(5, (Object) null);
        }
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
        if (i == 256) {
            C11969f e = mo31685e(deviceStatusBase);
            TextView textView = this.f19678h;
            if (textView != null && e != null) {
                textView.post(new C10523a(e));
            }
        }
    }
}
