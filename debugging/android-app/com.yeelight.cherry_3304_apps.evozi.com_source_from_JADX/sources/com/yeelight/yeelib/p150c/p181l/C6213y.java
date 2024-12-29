package com.yeelight.yeelib.p150c.p181l;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p150c.C5972a;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6038h;
import com.yeelight.yeelib.p150c.p184n.C7554e;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p194ui.activity.DelaySetNewActivity;
import com.yeelight.yeelib.p194ui.view.RedSpotTipTextView;
import com.yeelight.yeelib.p194ui.view.YeelightSwitchButton;

/* renamed from: com.yeelight.yeelib.c.l.y */
public class C6213y extends C6038h {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public TextView f13171h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public YeelightSwitchButton f13172i;

    /* renamed from: j */
    Handler f13173j = new C6214a(Looper.getMainLooper());

    /* renamed from: com.yeelight.yeelib.c.l.y$a */
    class C6214a extends Handler {
        C6214a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            C4198d i;
            if (message.what == 1 && (i = C6213y.this.mo27779i()) != null) {
                i.mo23353x(2, (Object) null);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.c.l.y$b */
    class C6215b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f13175a;

        /* renamed from: b */
        final /* synthetic */ C4198d f13176b;

        C6215b(Activity activity, C4198d dVar) {
            this.f13175a = activity;
            this.f13176b = dVar;
        }

        public void onClick(View view) {
            C6213y.this.mo27785o(this.f13175a, this.f13176b.mo23372G());
        }
    }

    /* renamed from: com.yeelight.yeelib.c.l.y$c */
    class C6216c implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C4198d f13178a;

        /* renamed from: b */
        final /* synthetic */ Activity f13179b;

        C6216c(C4198d dVar, Activity activity) {
            this.f13178a = dVar;
            this.f13179b = activity;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Activity activity;
            int i;
            Resources resources;
            C7554e eVar;
            int i2;
            C4198d dVar;
            if (z) {
                eVar = new C7554e(this.f13178a.mo23368D(), this.f13178a.mo23368D());
                if (((C4200i) this.f13178a).mo23332k1()) {
                    dVar = this.f13178a;
                    i2 = 10;
                } else {
                    C6213y.this.f13172i.setChecked(false);
                    activity = this.f13179b;
                    resources = activity.getResources();
                    i = R$string.feature_delay_not_available;
                    Toast.makeText(activity, resources.getString(i), 0).show();
                    C6213y.this.f13173j.removeMessages(1);
                    C6213y.this.f13173j.sendEmptyMessageDelayed(1, 2000);
                }
            } else {
                eVar = new C7554e(-1, -1);
                dVar = this.f13178a;
                i2 = 14;
            }
            dVar.mo23353x(i2, eVar);
            activity = this.f13179b;
            resources = activity.getResources();
            i = R$string.common_text_set_complete;
            Toast.makeText(activity, resources.getString(i), 0).show();
            C6213y.this.f13173j.removeMessages(1);
            C6213y.this.f13173j.sendEmptyMessageDelayed(1, 2000);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.l.y$d */
    class C6217d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C7554e f13181a;

        C6217d(C7554e eVar) {
            this.f13181a = eVar;
        }

        public void run() {
            if (C6213y.this.f13171h != null) {
                C6213y.this.m18749t(this.f13181a);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.c.l.y$e */
    class C6218e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C7554e f13183a;

        C6218e(C7554e eVar) {
            this.f13183a = eVar;
        }

        public void run() {
            if (C6213y.this.f13171h != null) {
                C6213y.this.m18749t(this.f13183a);
            }
        }
    }

    public C6213y(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    public C6213y(int i, String str, int i2, String str2, boolean z) {
        super(i, str, i2, str2, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m18749t(C7554e eVar) {
        YeelightSwitchButton yeelightSwitchButton = this.f13172i;
        if (yeelightSwitchButton != null) {
            yeelightSwitchButton.setChecked(eVar.mo28882c());
        }
    }

    /* renamed from: a */
    public View mo27771a(Activity activity, C4198d dVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        TextView textView = (TextView) inflate.findViewById(R$id.feature_item_info);
        this.f13171h = textView;
        textView.setVisibility(8);
        YeelightSwitchButton yeelightSwitchButton = (YeelightSwitchButton) inflate.findViewById(R$id.feature_item_switch_view);
        this.f13172i = yeelightSwitchButton;
        yeelightSwitchButton.setVisibility(0);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12835b);
        ((RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name)).setText(this.f12836c);
        relativeLayout.setOnClickListener(new C6215b(activity, dVar));
        C4200i iVar = (C4200i) dVar;
        this.f13172i.setOnPerformCheckedChangeListener(new C6216c(dVar, activity));
        C7554e eVar = (C7554e) dVar.mo23408d0().mo27710r(2);
        if (eVar != null) {
            m18749t(eVar);
        }
        return relativeLayout;
    }

    /* renamed from: b */
    public void mo27772b() {
        TextView textView = this.f13171h;
        if (textView != null) {
            textView.removeCallbacks((Runnable) null);
            this.f13171h = null;
        }
        this.f13172i = null;
    }

    /* renamed from: c */
    public void mo27773c(C4198d dVar) {
        if (!this.f12837d || (C4257w.m11945h0(this.f12839f) instanceof C5972a)) {
            dVar.mo23353x(2, (Object) null);
        }
    }

    /* renamed from: h */
    public Class mo27778h() {
        return DelaySetNewActivity.class;
    }

    /* renamed from: j */
    public boolean mo27780j() {
        C7554e eVar;
        C4198d h0 = C4257w.m11945h0(this.f12839f);
        if (h0 == null || (eVar = (C7554e) h0.mo23408d0().mo27710r(2)) == null) {
            return false;
        }
        return eVar.mo28882c();
    }

    public void onStatusChange(int i, C6024e eVar) {
        TextView textView;
        Runnable eVar2;
        C7554e eVar3;
        if (i != -1) {
            if (i == 4096 && (eVar3 = (C7554e) eVar.mo27710r(2)) != null) {
                this.f12837d = true;
                textView = this.f13171h;
                if (textView != null) {
                    eVar2 = new C6217d(eVar3);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (this.f12837d) {
            C7554e eVar4 = (C7554e) eVar.mo27710r(2);
            textView = this.f13171h;
            if (textView != null && eVar4 != null) {
                eVar2 = new C6218e(eVar4);
            } else {
                return;
            }
        } else {
            return;
        }
        textView.post(eVar2);
    }
}
