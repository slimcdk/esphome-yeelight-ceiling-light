package p215u3;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.C6081a;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C6093d;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.p142ui.activity.DeviceNameEditActivity;
import com.yeelight.yeelib.p142ui.view.RedSpotTipTextView;

/* renamed from: u3.c1 */
public class C10431c1 extends C6093d {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public TextView f19539h;

    /* renamed from: u3.c1$a */
    class C10432a implements View.OnClickListener {
        C10432a() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra("com.yeelight.cherry.device_id", C10431c1.this.f12510f);
            intent.setClass(view.getContext(), DeviceNameEditActivity.class);
            view.getContext().startActivity(intent);
        }
    }

    /* renamed from: u3.c1$b */
    class C10433b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DeviceStatusBase f19541a;

        C10433b(DeviceStatusBase deviceStatusBase) {
            this.f19541a = deviceStatusBase;
        }

        public void run() {
            String A;
            if (C10431c1.this.f19539h != null && (A = this.f19541a.mo31526A()) != null && !A.equals("")) {
                C10431c1.this.f19539h.setText(A);
            }
        }
    }

    /* renamed from: u3.c1$c */
    class C10434c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DeviceStatusBase f19543a;

        C10434c(DeviceStatusBase deviceStatusBase) {
            this.f19543a = deviceStatusBase;
        }

        public void run() {
            String A;
            if (C10431c1.this.f19539h != null && (A = this.f19543a.mo31526A()) != null && !A.equals("")) {
                C10431c1.this.f19539h.setText(A);
            }
        }
    }

    public C10431c1(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    /* renamed from: a */
    public View mo31681a(Activity activity, C3010c cVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12506b);
        ((RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name)).setText(this.f12507c);
        this.f19539h = (TextView) inflate.findViewById(R$id.feature_item_info);
        boolean z = cVar instanceof C6081a;
        String U = cVar.mo23210U();
        if (z && TextUtils.isEmpty(U)) {
            U = activity.getString(R$string.yeelight_device_name_cherry);
        }
        this.f19539h.setText(U);
        relativeLayout.setOnClickListener(new C10432a());
        return relativeLayout;
    }

    /* renamed from: b */
    public void mo31682b() {
        TextView textView = this.f19539h;
        if (textView != null) {
            textView.removeCallbacks((Runnable) null);
            this.f19539h = null;
        }
    }

    /* renamed from: c */
    public void mo31683c(C3010c cVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("RenameFeature, device name: ");
        sb.append(cVar.mo23210U());
        if (cVar instanceof C6081a) {
            cVar.mo23166x(0, (Object) null);
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
        TextView textView;
        Runnable cVar;
        if (i != -1) {
            if (i == 1024) {
                this.f12508d = true;
                textView = this.f19539h;
                if (textView != null) {
                    cVar = new C10433b(deviceStatusBase);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (this.f12508d && (textView = this.f19539h) != null) {
            cVar = new C10434c(deviceStatusBase);
        } else {
            return;
        }
        textView.post(cVar);
    }
}
