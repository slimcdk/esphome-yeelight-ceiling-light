package p215u3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.yeelight.cherry.p141ui.activity.GroupDeviceModifyActivity;
import com.yeelight.cherry.p141ui.activity.MeshGrpDeviceModifyActivity;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C6093d;
import com.yeelight.yeelib.device.base.C6094f;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.p142ui.view.RedSpotTipTextView;

/* renamed from: u3.i0 */
public class C10461i0 extends C6093d {

    /* renamed from: h */
    private TextView f19583h;

    /* renamed from: i */
    private C3010c f19584i;

    /* renamed from: u3.i0$a */
    class C10462a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f19585a;

        /* renamed from: b */
        final /* synthetic */ C3010c f19586b;

        C10462a(Activity activity, C3010c cVar) {
            this.f19585a = activity;
            this.f19586b = cVar;
        }

        public void onClick(View view) {
            C10461i0.this.mo31695o(this.f19585a, this.f19586b.mo23185G());
        }
    }

    public C10461i0(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    /* renamed from: a */
    public View mo31681a(Activity activity, C3010c cVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        this.f19584i = cVar;
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12506b);
        ((RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name)).setText(this.f12507c);
        this.f19583h = (TextView) inflate.findViewById(R$id.feature_item_info);
        relativeLayout.setOnClickListener(new C10462a(activity, cVar));
        return relativeLayout;
    }

    /* renamed from: b */
    public void mo31682b() {
        TextView textView = this.f19583h;
        if (textView != null) {
            textView.removeCallbacks((Runnable) null);
            this.f19583h = null;
        }
    }

    /* renamed from: c */
    public void mo31683c(C3010c cVar) {
    }

    /* renamed from: h */
    public Class mo31688h() {
        try {
            if (this.f19584i instanceof C6094f) {
                Class<MeshGrpDeviceModifyActivity> cls = MeshGrpDeviceModifyActivity.class;
                int i = MeshGrpDeviceModifyActivity.f10806g;
                return cls;
            }
            Class<GroupDeviceModifyActivity> cls2 = GroupDeviceModifyActivity.class;
            int i2 = GroupDeviceModifyActivity.f10534f;
            return cls2;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: j */
    public boolean mo31690j() {
        return false;
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
    }
}
