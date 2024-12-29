package p215u3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.C6093d;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.p142ui.view.RedSpotTipTextView;
import p232y3.C12037b;

/* renamed from: u3.f */
public class C10446f extends C6093d {

    /* renamed from: h */
    private TextView f19558h;

    /* renamed from: u3.f$a */
    class C10447a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f19559a;

        /* renamed from: b */
        final /* synthetic */ C3010c f19560b;

        C10447a(Activity activity, C3010c cVar) {
            this.f19559a = activity;
            this.f19560b = cVar;
        }

        public void onClick(View view) {
            C10446f.this.mo31695o(this.f19559a, this.f19560b.mo23185G());
        }
    }

    /* renamed from: u3.f$b */
    class C10448b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12037b f19562a;

        C10448b(C12037b bVar) {
            this.f19562a = bVar;
        }

        public void run() {
            C10446f.this.m26509r(this.f19562a);
        }
    }

    public C10446f(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m26509r(C12037b bVar) {
        if (bVar.mo42666e()) {
            int a = bVar.mo42662a();
            int b = bVar.mo42663b();
            int c = bVar.mo42664c();
            int d = bVar.mo42665d();
            this.f19558h.setText(String.format("%02d", new Object[]{Integer.valueOf(a)}) + Constants.COLON_SEPARATOR + String.format("%02d", new Object[]{Integer.valueOf(b)}) + Constants.WAVE_SEPARATOR + String.format("%02d", new Object[]{Integer.valueOf(c)}) + Constants.COLON_SEPARATOR + String.format("%02d", new Object[]{Integer.valueOf(d)}));
            return;
        }
        this.f19558h.setText(C3108x.f4951e.getString(R$string.common_text_disabled));
    }

    /* renamed from: a */
    public View mo31681a(Activity activity, C3010c cVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12506b);
        ((RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name)).setText(this.f12507c);
        this.f19558h = (TextView) inflate.findViewById(R$id.feature_item_info);
        C12037b bVar = (C12037b) cVar.mo23221d0().mo31611r(14);
        if (bVar != null) {
            m26509r(bVar);
            if (bVar.mo42666e()) {
                ((C3012e) cVar).mo23248n1();
            } else {
                ((C3012e) cVar).mo23240B1();
            }
        }
        relativeLayout.setOnClickListener(new C10447a(activity, cVar));
        return relativeLayout;
    }

    /* renamed from: b */
    public void mo31682b() {
        TextView textView = this.f19558h;
        if (textView != null) {
            textView.removeCallbacks((Runnable) null);
            this.f19558h = null;
        }
    }

    /* renamed from: c */
    public void mo31683c(C3010c cVar) {
        C12037b bVar = (C12037b) cVar.mo23221d0().mo31611r(14);
        if (bVar != null) {
            TextView textView = this.f19558h;
            if (textView != null) {
                textView.post(new C10448b(bVar));
            }
            C3012e eVar = (C3012e) cVar;
            if (bVar.mo42666e()) {
                eVar.mo23248n1();
            } else {
                eVar.mo23240B1();
            }
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
    }
}
