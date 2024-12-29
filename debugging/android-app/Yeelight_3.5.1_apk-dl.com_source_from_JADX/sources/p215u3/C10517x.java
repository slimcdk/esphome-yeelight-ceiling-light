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
import com.yeelight.cherry.p141ui.activity.BluetoothDeviceUpgradeActivity;
import com.yeelight.cherry.p141ui.activity.FirmwareUpgradeActivity;
import com.yeelight.cherry.p141ui.activity.MeshDeviceFirmwareUpgradeActivity;
import com.yeelight.yeelib.R$color;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.device.C6081a;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C6093d;
import com.yeelight.yeelib.device.base.C6094f;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BlankActivity;
import com.yeelight.yeelib.p142ui.view.RedSpotTipTextView;
import p207s3.C10344f;
import p227x3.C11969f;

/* renamed from: u3.x */
public class C10517x extends C6093d {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public TextView f19667h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ImageView f19668i;

    /* renamed from: j */
    private int f19669j = -1;

    /* renamed from: u3.x$a */
    class C10518a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f19670a;

        /* renamed from: b */
        final /* synthetic */ C3010c f19671b;

        C10518a(Activity activity, C3010c cVar) {
            this.f19670a = activity;
            this.f19671b = cVar;
        }

        public void onClick(View view) {
            C10517x.this.mo31695o(this.f19670a, this.f19671b.mo23185G());
        }
    }

    /* renamed from: u3.x$b */
    class C10519b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11969f f19673a;

        C10519b(C11969f fVar) {
            this.f19673a = fVar;
        }

        public void run() {
            int i;
            ImageView imageView;
            if (C10517x.this.f19667h != null) {
                if (this.f19673a.mo42513g()) {
                    C10517x.this.f19667h.setTextColor(SupportMenu.CATEGORY_MASK);
                    C10517x.this.f19667h.setText(this.f19673a.mo42512d());
                    imageView = C10517x.this.f19668i;
                    i = 0;
                } else {
                    C10517x.this.f19667h.setTextColor(ContextCompat.getColor(C10517x.this.f19667h.getContext(), R$color.setting_item_info_text_color));
                    C10517x.this.f19667h.setText(this.f19673a.mo42511c());
                    imageView = C10517x.this.f19668i;
                    i = 4;
                }
                imageView.setVisibility(i);
            }
        }
    }

    /* renamed from: u3.x$c */
    class C10520c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11969f f19675a;

        C10520c(C11969f fVar) {
            this.f19675a = fVar;
        }

        public void run() {
            int i;
            ImageView imageView;
            if (C10517x.this.f19667h != null) {
                C10517x.this.f19667h.setTextColor(ContextCompat.getColor(C10517x.this.f19667h.getContext(), R$color.setting_item_info_text_color));
                if (this.f19675a.mo42513g()) {
                    C10517x.this.f19667h.setText(this.f19675a.mo42512d());
                    imageView = C10517x.this.f19668i;
                    i = 0;
                } else {
                    C10517x.this.f19667h.setText(this.f19675a.mo42511c());
                    imageView = C10517x.this.f19668i;
                    i = 4;
                }
                imageView.setVisibility(i);
            }
        }
    }

    public C10517x(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
        int i3;
        C3010c j0 = YeelightDeviceManager.m7794j0(str2);
        if ((j0 instanceof WifiDeviceBase) || (j0 instanceof C10344f)) {
            i3 = 0;
        } else if (j0 instanceof C6081a) {
            i3 = 1;
        } else if (j0 instanceof C6094f) {
            i3 = 2;
        } else {
            return;
        }
        this.f19669j = i3;
    }

    /* renamed from: a */
    public View mo31681a(Activity activity, C3010c cVar) {
        String str;
        TextView textView;
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        this.f12505a = (RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name);
        this.f19667h = (TextView) inflate.findViewById(R$id.feature_item_info);
        this.f19668i = (ImageView) inflate.findViewById(R$id.feature_item_more);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12506b);
        this.f12505a.setText(this.f12507c);
        if (cVar.mo23197N() != null) {
            if (cVar.mo23197N().mo42513g()) {
                this.f19667h.setTextColor(SupportMenu.CATEGORY_MASK);
                textView = this.f19667h;
                str = cVar.mo23197N().mo42512d();
            } else {
                this.f19667h.setTextColor(ContextCompat.getColor(activity, R$color.setting_item_info_text_color));
                textView = this.f19667h;
                str = cVar.mo23197N().mo42511c();
            }
            textView.setText(str);
        }
        relativeLayout.setOnClickListener(new C10518a(activity, cVar));
        return relativeLayout;
    }

    /* renamed from: b */
    public void mo31682b() {
        TextView textView = this.f19667h;
        if (textView != null) {
            textView.removeCallbacks((Runnable) null);
            this.f19667h = null;
        }
        ImageView imageView = this.f19668i;
        if (imageView != null) {
            imageView.removeCallbacks((Runnable) null);
            this.f19668i = null;
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
        try {
            int i = this.f19669j;
            if (i == 0) {
                Class<FirmwareUpgradeActivity> cls = FirmwareUpgradeActivity.class;
                int i2 = FirmwareUpgradeActivity.f10500f;
                return cls;
            } else if (i == 1) {
                Class<BluetoothDeviceUpgradeActivity> cls2 = BluetoothDeviceUpgradeActivity.class;
                int i3 = BluetoothDeviceUpgradeActivity.f9963l;
                return cls2;
            } else if (i != 2) {
                return BlankActivity.class;
            } else {
                Class<MeshDeviceFirmwareUpgradeActivity> cls3 = MeshDeviceFirmwareUpgradeActivity.class;
                int i4 = MeshDeviceFirmwareUpgradeActivity.f10754h;
                return cls3;
            }
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
        TextView textView;
        Runnable runnable;
        if (i == 256) {
            C11969f e = mo31685e(deviceStatusBase);
            textView = this.f19667h;
            if (textView != null && e != null) {
                runnable = new C10519b(e);
            } else {
                return;
            }
        } else if (i == 512) {
            C11969f e2 = mo31685e(deviceStatusBase);
            textView = this.f19667h;
            if (textView != null && e2 != null) {
                runnable = new C10520c(e2);
            } else {
                return;
            }
        } else {
            return;
        }
        textView.post(runnable);
    }
}
