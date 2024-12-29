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
import com.yeelight.yeelib.device.base.C6093d;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.status.TimerModel;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.WakeUpActivity;
import com.yeelight.yeelib.p142ui.view.RedSpotTipTextView;
import java.util.Calendar;

/* renamed from: u3.a */
public class C10416a extends C6093d {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public TextView f19512h;

    /* renamed from: u3.a$a */
    class C10417a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f19513a;

        /* renamed from: b */
        final /* synthetic */ C3010c f19514b;

        C10417a(Activity activity, C3010c cVar) {
            this.f19513a = activity;
            this.f19514b = cVar;
        }

        public void onClick(View view) {
            C10416a.this.mo31695o(this.f19513a, this.f19514b.mo23185G());
        }
    }

    /* renamed from: u3.a$b */
    class C10418b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TimerModel f19516a;

        C10418b(TimerModel timerModel) {
            this.f19516a = timerModel;
        }

        public void run() {
            if (C10416a.this.f19512h != null) {
                C10416a.this.m26435s(this.f19516a);
            }
        }
    }

    /* renamed from: u3.a$c */
    class C10419c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TimerModel f19518a;

        C10419c(TimerModel timerModel) {
            this.f19518a = timerModel;
        }

        public void run() {
            if (C10416a.this.f19512h != null) {
                C10416a.this.m26435s(this.f19518a);
            }
        }
    }

    public C10416a(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    public C10416a(int i, String str, int i2, String str2, boolean z) {
        super(i, str, i2, str2, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m26435s(TimerModel timerModel) {
        if (!timerModel.isEnable()) {
            this.f19512h.setText(R$string.common_text_disabled);
            return;
        }
        Calendar instance = Calendar.getInstance();
        instance.set(11, timerModel.getHour());
        instance.set(12, timerModel.getMinute());
        instance.add(12, 30);
        int i = instance.get(11);
        int i2 = instance.get(12);
        this.f19512h.setText(String.format("%02d", new Object[]{Integer.valueOf(i)}) + Constants.COLON_SEPARATOR + String.format("%02d", new Object[]{Integer.valueOf(i2)}));
    }

    /* renamed from: a */
    public View mo31681a(Activity activity, C3010c cVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12506b);
        ((RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name)).setText(this.f12507c);
        this.f19512h = (TextView) inflate.findViewById(R$id.feature_item_info);
        relativeLayout.setOnClickListener(new C10417a(activity, cVar));
        if (this.f12508d) {
            m26435s((TimerModel) cVar.mo23221d0().mo31611r(4));
        }
        return relativeLayout;
    }

    /* renamed from: b */
    public void mo31682b() {
        TextView textView = this.f19512h;
        if (textView != null) {
            textView.removeCallbacks((Runnable) null);
            this.f19512h = null;
        }
    }

    /* renamed from: c */
    public void mo31683c(C3010c cVar) {
        if (!this.f12508d) {
            cVar.mo23166x(4, (Object) null);
        }
    }

    /* renamed from: h */
    public Class mo31688h() {
        return WakeUpActivity.class;
    }

    /* renamed from: j */
    public boolean mo31690j() {
        TimerModel timerModel;
        C3010c j0 = YeelightDeviceManager.m7794j0(this.f12510f);
        if (j0 == null || (timerModel = (TimerModel) j0.mo23221d0().mo31611r(4)) == null) {
            return false;
        }
        return timerModel.isEnable();
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        TextView textView;
        Runnable cVar;
        TimerModel timerModel;
        if (i != -1) {
            if (i == 4096 && (timerModel = (TimerModel) deviceStatusBase.mo31611r(4)) != null) {
                this.f12508d = true;
                textView = this.f19512h;
                if (textView != null) {
                    cVar = new C10418b(timerModel);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (this.f12508d) {
            TimerModel timerModel2 = (TimerModel) deviceStatusBase.mo31611r(4);
            textView = this.f19512h;
            if (textView != null && timerModel2 != null) {
                cVar = new C10419c(timerModel2);
            } else {
                return;
            }
        } else {
            return;
        }
        textView.post(cVar);
    }
}
