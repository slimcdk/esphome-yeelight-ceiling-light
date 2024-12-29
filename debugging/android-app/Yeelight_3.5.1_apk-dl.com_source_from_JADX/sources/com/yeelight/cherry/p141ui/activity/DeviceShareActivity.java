package com.yeelight.cherry.p141ui.activity;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.miot.api.CompletionHandler;
import com.miot.api.MiotManager;
import com.miot.common.exception.MiotException;
import com.miot.service.connection.wifi.WebShellActivity;
import com.squareup.picasso.Picasso;
import com.yeelight.cherry.C12224R$drawable;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.data.AppConfigurationProvider;
import com.yeelight.yeelib.data.C6038a;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CircleImageView;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.p142ui.view.HorizontalListView;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import p051j4.C9193k;
import p170i4.C9113d;

/* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity */
public class DeviceShareActivity extends BaseActivity implements C3051a.C3052i {
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final String f10354p = "DeviceShareActivity";

    /* renamed from: q */
    public static final /* synthetic */ int f10355q = 0;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public ArrayList<C3051a.C3062k> f10356a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public EditText f10357b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public LinearLayout f10358c;

    /* renamed from: d */
    private LinearLayout f10359d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public FrameLayout f10360e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public CircleImageView f10361f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ImageView f10362g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public TextView f10363h;

    /* renamed from: i */
    private C3012e f10364i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public TextView f10365j;

    /* renamed from: k */
    private CommonTitleBar f10366k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public LinearLayout f10367l;

    /* renamed from: m */
    HorizontalListView f10368m;

    /* renamed from: n */
    C5272n f10369n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Handler f10370o = new C5259c();

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$a */
    class C5256a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3051a.C3062k f10371a;

        /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$a$a */
        class C5257a implements View.OnClickListener {
            C5257a() {
            }

            public void onClick(View view) {
                C5256a aVar = C5256a.this;
                DeviceShareActivity.this.m16209o0(aVar.f10371a);
            }
        }

        C5256a(C3051a.C3062k kVar) {
            this.f10371a = kVar;
        }

        public void run() {
            if ("-1".equals(this.f10371a.mo23389c()) || "-1".equals(this.f10371a.mo23388b())) {
                DeviceShareActivity.this.f10363h.setText(2131755510);
                DeviceShareActivity.this.f10363h.setTextColor(DeviceShareActivity.this.getResources().getColor(2131099838));
                DeviceShareActivity.this.f10362g.setVisibility(0);
                DeviceShareActivity.this.f10361f.setVisibility(4);
                return;
            }
            DeviceShareActivity.this.f10362g.setVisibility(4);
            DeviceShareActivity.this.f10361f.setVisibility(0);
            DeviceShareActivity.this.f10363h.setText(this.f10371a.mo23389c());
            DeviceShareActivity.this.f10363h.setTextColor(DeviceShareActivity.this.getResources().getColor(2131099840));
            if (this.f10371a.mo23387a() == null || this.f10371a.mo23387a().isEmpty()) {
                DeviceShareActivity.this.f10361f.setImageResource(2131231774);
            } else {
                Picasso.m12253o(C3108x.f4951e).mo28111j(this.f10371a.mo23387a()).mo28225f(2131231774).mo28223d(DeviceShareActivity.this.f10361f);
            }
            DeviceShareActivity.this.f10361f.setOnClickListener(new C5257a());
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$b */
    class C5258b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3051a.C3062k f10374a;

        C5258b(C3051a.C3062k kVar) {
            this.f10374a = kVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Message message = new Message();
            Bundle bundle = new Bundle();
            bundle.putString("mid", this.f10374a.mo23388b());
            bundle.putString(WebShellActivity.ARGS_KEY_URL, this.f10374a.mo23387a());
            bundle.putString("name", this.f10374a.mo23389c());
            message.setData(bundle);
            message.what = 0;
            DeviceShareActivity.this.f10370o.removeMessages(0);
            DeviceShareActivity.this.f10370o.sendMessageDelayed(message, 500);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$c */
    class C5259c extends Handler {
        C5259c() {
        }

        public void handleMessage(Message message) {
            Bundle data;
            DeviceShareActivity deviceShareActivity;
            int i;
            int i2 = message.what;
            if (i2 == 0) {
                Bundle data2 = message.getData();
                if (data2 != null) {
                    String string = data2.getString("mid");
                    String string2 = data2.getString("name");
                    String string3 = data2.getString(WebShellActivity.ARGS_KEY_URL);
                    DeviceShareActivity deviceShareActivity2 = DeviceShareActivity.this;
                    C3051a r = C3051a.m7925r();
                    Objects.requireNonNull(r);
                    deviceShareActivity2.m16210p0(new C3051a.C3062k(r, string, string2, string3));
                }
            } else if (i2 == 1 && (data = message.getData()) != null) {
                int i3 = data.getInt("errCode");
                if (i3 == -8) {
                    deviceShareActivity = DeviceShareActivity.this;
                    i = 2131755510;
                } else if (i3 == -11) {
                    deviceShareActivity = DeviceShareActivity.this;
                    i = 2131755493;
                } else if (i3 == -1) {
                    deviceShareActivity = DeviceShareActivity.this;
                    i = 2131755509;
                } else if (i3 == -12) {
                    deviceShareActivity = DeviceShareActivity.this;
                    i = 2131755502;
                } else {
                    deviceShareActivity = DeviceShareActivity.this;
                    i = 2131755498;
                }
                Toast.makeText(DeviceShareActivity.this, deviceShareActivity.getString(i), 0).show();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$d */
    class C5260d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C3051a.C3062k f10377a;

        /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$d$a */
        class C5261a implements Runnable {

            /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$d$a$a */
            class C5262a implements DialogInterface.OnClickListener {
                C5262a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    if (DeviceShareActivity.this.f10367l.getVisibility() == 4) {
                        DeviceShareActivity.this.m16206l0();
                    }
                    C5260d dVar = C5260d.this;
                    DeviceShareActivity.this.m16212r0(dVar.f10377a);
                    dialogInterface.dismiss();
                }
            }

            C5261a() {
            }

            public void run() {
                if (!DeviceShareActivity.this.isFinishing()) {
                    new C9113d.C9118e(DeviceShareActivity.this).mo37178h(2131755507).mo37176f(2131755492).mo37175e(C12224R$drawable.icon_yeelight_share_device_success).mo37174d(-1, DeviceShareActivity.this.getString(2131755240), new C5262a()).mo37172b().show();
                }
            }
        }

        C5260d(C3051a.C3062k kVar) {
            this.f10377a = kVar;
        }

        public void onFailed(int i, String str) {
            String unused = DeviceShareActivity.f10354p;
            StringBuilder sb = new StringBuilder();
            sb.append("shareDevice onFailed: ");
            sb.append(i);
            sb.append(" ");
            sb.append(str);
            Message message = new Message();
            Bundle bundle = new Bundle();
            bundle.putInt("errCode", i);
            message.setData(bundle);
            message.what = 1;
            DeviceShareActivity.this.f10370o.sendMessage(message);
        }

        public void onSucceed() {
            String unused = DeviceShareActivity.f10354p;
            DeviceShareActivity.this.runOnUiThread(new C5261a());
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$e */
    class C5263e implements View.OnClickListener {
        C5263e() {
        }

        public void onClick(View view) {
            DeviceShareActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$f */
    class C5264f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f10382a;

        C5264f(String str) {
            this.f10382a = str;
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra("com.yeelight.cherry.device_id", this.f10382a);
            intent.setClass(DeviceShareActivity.this, DeviceShareManagermentActivity.class);
            DeviceShareActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$g */
    class C5265g implements View.OnClickListener {
        C5265g() {
        }

        public void onClick(View view) {
            if (DeviceShareActivity.this.f10367l.getVisibility() == 0) {
                DeviceShareActivity.this.m16207m0();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$h */
    class C5266h implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ ImageView f10385a;

        C5266h(DeviceShareActivity deviceShareActivity, ImageView imageView) {
            this.f10385a = imageView;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4;
            ImageView imageView;
            if (charSequence.length() > 0) {
                imageView = this.f10385a;
                i4 = 0;
            } else {
                imageView = this.f10385a;
                i4 = 4;
            }
            imageView.setVisibility(i4);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$i */
    class C5267i implements View.OnClickListener {
        C5267i() {
        }

        public void onClick(View view) {
            DeviceShareActivity.this.f10357b.setText("");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$j */
    class C5268j implements TextView.OnEditorActionListener {
        C5268j() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i == 3) {
                C3051a.m7925r().mo23365u(DeviceShareActivity.this.f10357b.getText().toString());
                DeviceShareActivity.this.f10358c.setVisibility(0);
                DeviceShareActivity.this.f10360e.setVisibility(4);
                ((InputMethodManager) DeviceShareActivity.this.getSystemService("input_method")).hideSoftInputFromWindow(textView.getWindowToken(), 0);
            }
            return false;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$k */
    class C5269k implements Animator.AnimatorListener {
        C5269k() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            DeviceShareActivity.this.f10367l.setLayoutParams(new LinearLayout.LayoutParams(-1, C9193k.m22150a(DeviceShareActivity.this, 252.0f)));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            DeviceShareActivity.this.f10363h.setLayoutParams(layoutParams);
            layoutParams.setMargins(0, C9193k.m22150a(DeviceShareActivity.this, 10.0f), 0, C9193k.m22150a(DeviceShareActivity.this, 62.0f));
            DeviceShareActivity.this.f10367l.setVisibility(4);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$l */
    class C5270l implements Animator.AnimatorListener {
        C5270l() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            DeviceShareActivity.this.f10367l.setVisibility(0);
            DeviceShareActivity.this.f10358c.setVisibility(4);
            DeviceShareActivity.this.f10360e.setVisibility(0);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            DeviceShareActivity.this.f10367l.setLayoutParams(new LinearLayout.LayoutParams(-1, C9193k.m22150a(DeviceShareActivity.this, 314.0f)));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$m */
    class C5271m implements Runnable {
        C5271m() {
        }

        public void run() {
            if (DeviceShareActivity.this.f10356a.size() == 0) {
                DeviceShareActivity.this.f10365j.setVisibility(0);
                DeviceShareActivity.this.f10368m.setVisibility(4);
                return;
            }
            DeviceShareActivity.this.f10365j.setVisibility(4);
            DeviceShareActivity.this.f10368m.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$n */
    private class C5272n extends BaseAdapter {

        /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$n$a */
        class C5273a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f10392a;

            C5273a(int i) {
                this.f10392a = i;
            }

            public void onClick(View view) {
                DeviceShareActivity deviceShareActivity = DeviceShareActivity.this;
                deviceShareActivity.m16209o0((C3051a.C3062k) deviceShareActivity.f10356a.get(this.f10392a));
            }
        }

        private C5272n() {
        }

        /* synthetic */ C5272n(DeviceShareActivity deviceShareActivity, C5263e eVar) {
            this();
        }

        public int getCount() {
            if (DeviceShareActivity.this.f10356a.size() > 4) {
                return 4;
            }
            return DeviceShareActivity.this.f10356a.size();
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C5274o oVar;
            if (view == null) {
                oVar = new C5274o(DeviceShareActivity.this, (C5263e) null);
                view2 = LayoutInflater.from(DeviceShareActivity.this).inflate(C12228R$layout.item_share_device_profile, (ViewGroup) null);
                view2.setTag(oVar);
            } else {
                view2 = view;
                oVar = (C5274o) view.getTag();
            }
            oVar.f10394a = (ImageView) view2.findViewById(C12225R$id.user_profile_image);
            oVar.f10395b = (TextView) view2.findViewById(C12225R$id.user_profile_name);
            oVar.f10394a.setOnClickListener(new C5273a(i));
            if (((C3051a.C3062k) DeviceShareActivity.this.f10356a.get(i)).mo23387a() == null || ((C3051a.C3062k) DeviceShareActivity.this.f10356a.get(i)).mo23387a().isEmpty()) {
                oVar.f10394a.setImageResource(2131231774);
            } else {
                Picasso.m12253o(C3108x.f4951e).mo28111j(((C3051a.C3062k) DeviceShareActivity.this.f10356a.get(i)).mo23387a()).mo28225f(2131231774).mo28223d(oVar.f10394a);
            }
            oVar.f10395b.setText(((C3051a.C3062k) DeviceShareActivity.this.f10356a.get(i)).mo23389c());
            return view2;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$o */
    private class C5274o {

        /* renamed from: a */
        public ImageView f10394a;

        /* renamed from: b */
        public TextView f10395b;

        private C5274o(DeviceShareActivity deviceShareActivity) {
        }

        /* synthetic */ C5274o(DeviceShareActivity deviceShareActivity, C5263e eVar) {
            this(deviceShareActivity);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public void m16206l0() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f10359d, "translationY", new float[]{0.0f});
        ofFloat.setDuration(300);
        ofFloat.addListener(new C5270l());
        ofFloat.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public void m16207m0() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f10359d, "translationY", new float[]{(float) ((-this.f10367l.getHeight()) + C9193k.m22152c(this, 62.0f))});
        ofFloat.setDuration(300);
        ofFloat.addListener(new C5269k());
        ofFloat.start();
    }

    /* renamed from: n0 */
    private void m16208n0() {
        this.f10356a = new ArrayList<>();
        Cursor i = AppConfigurationProvider.m17577i();
        if (i.moveToFirst()) {
            do {
                String string = i.getString(i.getColumnIndex(C6038a.C6041b.C6042a.f12315b));
                String string2 = i.getString(i.getColumnIndex(C6038a.C6041b.C6042a.f12316c));
                String string3 = i.getString(i.getColumnIndex(C6038a.C6041b.C6042a.f12317d));
                C3051a r = C3051a.m7925r();
                Objects.requireNonNull(r);
                this.f10356a.add(new C3051a.C3062k(r, string, string2, string3));
            } while (i.moveToNext());
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: o0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m16209o0(com.yeelight.yeelib.managers.C3051a.C3062k r7) {
        /*
            r6 = this;
            com.yeelight.yeelib.device.base.e r0 = r6.f10364i
            java.lang.String r0 = r0.mo23208T()
            r0.hashCode()
            int r1 = r0.hashCode()
            r2 = 1
            r3 = 0
            r4 = -1
            switch(r1) {
                case -1644531059: goto L_0x05a1;
                case -1494338802: goto L_0x0595;
                case -1462015191: goto L_0x0589;
                case -1462015190: goto L_0x057d;
                case -1462015189: goto L_0x0571;
                case -1462015188: goto L_0x0565;
                case -1462015187: goto L_0x0559;
                case -1462015186: goto L_0x054d;
                case -1462015185: goto L_0x053f;
                case -1462015184: goto L_0x0531;
                case -1462015183: goto L_0x0523;
                case -1462015182: goto L_0x0515;
                case -1462015160: goto L_0x0507;
                case -1462015159: goto L_0x04f9;
                case -1462015158: goto L_0x04eb;
                case -1462015157: goto L_0x04dd;
                case -1462015156: goto L_0x04cf;
                case -1400275319: goto L_0x04c1;
                case -1350780909: goto L_0x04b3;
                case -1317475940: goto L_0x04a5;
                case -1317475939: goto L_0x0497;
                case -1317475937: goto L_0x0489;
                case -1317475915: goto L_0x047b;
                case -1317475914: goto L_0x046d;
                case -1317475913: goto L_0x045f;
                case -1317475912: goto L_0x0451;
                case -1317475910: goto L_0x0443;
                case -1308146495: goto L_0x0435;
                case -1308146494: goto L_0x0427;
                case -1308146493: goto L_0x0419;
                case -1308146492: goto L_0x040b;
                case -1308146491: goto L_0x03fd;
                case -1308146490: goto L_0x03ef;
                case -1308146488: goto L_0x03e1;
                case -1308146447: goto L_0x03d3;
                case -1308146446: goto L_0x03c5;
                case -1308146445: goto L_0x03b7;
                case -1308146443: goto L_0x03a9;
                case -1282176368: goto L_0x039b;
                case -1235140472: goto L_0x038d;
                case -1235140471: goto L_0x037f;
                case -1235140468: goto L_0x0371;
                case -1235140467: goto L_0x0363;
                case -1119332198: goto L_0x0355;
                case -1063384694: goto L_0x0347;
                case -1063384689: goto L_0x0339;
                case -1063384687: goto L_0x032b;
                case -1063384685: goto L_0x031d;
                case -1035626052: goto L_0x030f;
                case -1035596261: goto L_0x0301;
                case -948847040: goto L_0x02f3;
                case -948847038: goto L_0x02e5;
                case -939061393: goto L_0x02d7;
                case -888668266: goto L_0x02c9;
                case -888668265: goto L_0x02bb;
                case -888668264: goto L_0x02ad;
                case -850921852: goto L_0x029f;
                case -845289556: goto L_0x0291;
                case -845289555: goto L_0x0283;
                case -845289553: goto L_0x0275;
                case -845289551: goto L_0x0267;
                case -845289549: goto L_0x0259;
                case -845289508: goto L_0x024b;
                case -458141175: goto L_0x023d;
                case -458141174: goto L_0x022f;
                case -458141173: goto L_0x0221;
                case -458141172: goto L_0x0213;
                case -458141171: goto L_0x0205;
                case -449944730: goto L_0x01f7;
                case -449944729: goto L_0x01e9;
                case -449944728: goto L_0x01db;
                case -449944727: goto L_0x01cd;
                case -449944726: goto L_0x01bf;
                case -449944724: goto L_0x01b1;
                case -449944723: goto L_0x01a3;
                case -449944722: goto L_0x0195;
                case -448603205: goto L_0x0187;
                case -448603204: goto L_0x0179;
                case -448603202: goto L_0x016b;
                case -448603201: goto L_0x015d;
                case -448603157: goto L_0x014f;
                case -448603156: goto L_0x0141;
                case -443031172: goto L_0x0133;
                case -190173984: goto L_0x0125;
                case -190173936: goto L_0x0117;
                case 674030242: goto L_0x0109;
                case 922669543: goto L_0x00fb;
                case 922669544: goto L_0x00ed;
                case 922669545: goto L_0x00df;
                case 922669546: goto L_0x00d1;
                case 922669547: goto L_0x00c3;
                case 922669548: goto L_0x00b5;
                case 922669549: goto L_0x00a7;
                case 922669550: goto L_0x0099;
                case 1201756974: goto L_0x008b;
                case 1201757021: goto L_0x007e;
                case 1201757023: goto L_0x0071;
                case 1201766335: goto L_0x0064;
                case 1201766336: goto L_0x0057;
                case 1623724661: goto L_0x004a;
                case 1623724663: goto L_0x003d;
                case 2102612488: goto L_0x0030;
                case 2102612489: goto L_0x0023;
                case 2146130361: goto L_0x0016;
                default: goto L_0x0013;
            }
        L_0x0013:
            r0 = -1
            goto L_0x05ac
        L_0x0016:
            java.lang.String r1 = "yeelink.light.dnlight2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001f
            goto L_0x0013
        L_0x001f:
            r0 = 103(0x67, float:1.44E-43)
            goto L_0x05ac
        L_0x0023:
            java.lang.String r1 = "yeelink.light.meshbulb2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002c
            goto L_0x0013
        L_0x002c:
            r0 = 102(0x66, float:1.43E-43)
            goto L_0x05ac
        L_0x0030:
            java.lang.String r1 = "yeelink.light.meshbulb1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0039
            goto L_0x0013
        L_0x0039:
            r0 = 101(0x65, float:1.42E-43)
            goto L_0x05ac
        L_0x003d:
            java.lang.String r1 = "yeelink.light.bslamp3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0046
            goto L_0x0013
        L_0x0046:
            r0 = 100
            goto L_0x05ac
        L_0x004a:
            java.lang.String r1 = "yeelink.light.bslamp1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0053
            goto L_0x0013
        L_0x0053:
            r0 = 99
            goto L_0x05ac
        L_0x0057:
            java.lang.String r1 = "yeelink.light.ml2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0060
            goto L_0x0013
        L_0x0060:
            r0 = 98
            goto L_0x05ac
        L_0x0064:
            java.lang.String r1 = "yeelink.light.ml1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x006d
            goto L_0x0013
        L_0x006d:
            r0 = 97
            goto L_0x05ac
        L_0x0071:
            java.lang.String r1 = "yeelink.light.ctc"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x007a
            goto L_0x0013
        L_0x007a:
            r0 = 96
            goto L_0x05ac
        L_0x007e:
            java.lang.String r1 = "yeelink.light.cta"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0087
            goto L_0x0013
        L_0x0087:
            r0 = 95
            goto L_0x05ac
        L_0x008b:
            java.lang.String r1 = "yeelink.light.ct2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0095
            goto L_0x0013
        L_0x0095:
            r0 = 94
            goto L_0x05ac
        L_0x0099:
            java.lang.String r1 = "yeelink.light.ceiling8"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00a3
            goto L_0x0013
        L_0x00a3:
            r0 = 93
            goto L_0x05ac
        L_0x00a7:
            java.lang.String r1 = "yeelink.light.ceiling7"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00b1
            goto L_0x0013
        L_0x00b1:
            r0 = 92
            goto L_0x05ac
        L_0x00b5:
            java.lang.String r1 = "yeelink.light.ceiling6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00bf
            goto L_0x0013
        L_0x00bf:
            r0 = 91
            goto L_0x05ac
        L_0x00c3:
            java.lang.String r1 = "yeelink.light.ceiling5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00cd
            goto L_0x0013
        L_0x00cd:
            r0 = 90
            goto L_0x05ac
        L_0x00d1:
            java.lang.String r1 = "yeelink.light.ceiling4"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00db
            goto L_0x0013
        L_0x00db:
            r0 = 89
            goto L_0x05ac
        L_0x00df:
            java.lang.String r1 = "yeelink.light.ceiling3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00e9
            goto L_0x0013
        L_0x00e9:
            r0 = 88
            goto L_0x05ac
        L_0x00ed:
            java.lang.String r1 = "yeelink.light.ceiling2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00f7
            goto L_0x0013
        L_0x00f7:
            r0 = 87
            goto L_0x05ac
        L_0x00fb:
            java.lang.String r1 = "yeelink.light.ceiling1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0105
            goto L_0x0013
        L_0x0105:
            r0 = 86
            goto L_0x05ac
        L_0x0109:
            java.lang.String r1 = "yeelink.curtain.ctmt1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0113
            goto L_0x0013
        L_0x0113:
            r0 = 85
            goto L_0x05ac
        L_0x0117:
            java.lang.String r1 = "yeelink.gateway.va"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0121
            goto L_0x0013
        L_0x0121:
            r0 = 84
            goto L_0x05ac
        L_0x0125:
            java.lang.String r1 = "yeelink.gateway.v1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x012f
            goto L_0x0013
        L_0x012f:
            r0 = 83
            goto L_0x05ac
        L_0x0133:
            java.lang.String r1 = "yeelink.light.spot1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x013d
            goto L_0x0013
        L_0x013d:
            r0 = 82
            goto L_0x05ac
        L_0x0141:
            java.lang.String r1 = "yeelink.light.monob"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x014b
            goto L_0x0013
        L_0x014b:
            r0 = 81
            goto L_0x05ac
        L_0x014f:
            java.lang.String r1 = "yeelink.light.monoa"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0159
            goto L_0x0013
        L_0x0159:
            r0 = 80
            goto L_0x05ac
        L_0x015d:
            java.lang.String r1 = "yeelink.light.mono5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0167
            goto L_0x0013
        L_0x0167:
            r0 = 79
            goto L_0x05ac
        L_0x016b:
            java.lang.String r1 = "yeelink.light.mono4"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0175
            goto L_0x0013
        L_0x0175:
            r0 = 78
            goto L_0x05ac
        L_0x0179:
            java.lang.String r1 = "yeelink.light.mono2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0183
            goto L_0x0013
        L_0x0183:
            r0 = 77
            goto L_0x05ac
        L_0x0187:
            java.lang.String r1 = "yeelink.light.mono1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0191
            goto L_0x0013
        L_0x0191:
            r0 = 76
            goto L_0x05ac
        L_0x0195:
            java.lang.String r1 = "yeelink.light.lamp9"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x019f
            goto L_0x0013
        L_0x019f:
            r0 = 75
            goto L_0x05ac
        L_0x01a3:
            java.lang.String r1 = "yeelink.light.lamp8"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01ad
            goto L_0x0013
        L_0x01ad:
            r0 = 74
            goto L_0x05ac
        L_0x01b1:
            java.lang.String r1 = "yeelink.light.lamp7"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01bb
            goto L_0x0013
        L_0x01bb:
            r0 = 73
            goto L_0x05ac
        L_0x01bf:
            java.lang.String r1 = "yeelink.light.lamp5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01c9
            goto L_0x0013
        L_0x01c9:
            r0 = 72
            goto L_0x05ac
        L_0x01cd:
            java.lang.String r1 = "yeelink.light.lamp4"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01d7
            goto L_0x0013
        L_0x01d7:
            r0 = 71
            goto L_0x05ac
        L_0x01db:
            java.lang.String r1 = "yeelink.light.lamp3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01e5
            goto L_0x0013
        L_0x01e5:
            r0 = 70
            goto L_0x05ac
        L_0x01e9:
            java.lang.String r1 = "yeelink.light.lamp2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01f3
            goto L_0x0013
        L_0x01f3:
            r0 = 69
            goto L_0x05ac
        L_0x01f7:
            java.lang.String r1 = "yeelink.light.lamp1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0201
            goto L_0x0013
        L_0x0201:
            r0 = 68
            goto L_0x05ac
        L_0x0205:
            java.lang.String r1 = "yeelink.light.ceile"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x020f
            goto L_0x0013
        L_0x020f:
            r0 = 67
            goto L_0x05ac
        L_0x0213:
            java.lang.String r1 = "yeelink.light.ceild"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x021d
            goto L_0x0013
        L_0x021d:
            r0 = 66
            goto L_0x05ac
        L_0x0221:
            java.lang.String r1 = "yeelink.light.ceilc"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x022b
            goto L_0x0013
        L_0x022b:
            r0 = 65
            goto L_0x05ac
        L_0x022f:
            java.lang.String r1 = "yeelink.light.ceilb"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0239
            goto L_0x0013
        L_0x0239:
            r0 = 64
            goto L_0x05ac
        L_0x023d:
            java.lang.String r1 = "yeelink.light.ceila"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0247
            goto L_0x0013
        L_0x0247:
            r0 = 63
            goto L_0x05ac
        L_0x024b:
            java.lang.String r1 = "yeelink.light.stripa"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0255
            goto L_0x0013
        L_0x0255:
            r0 = 62
            goto L_0x05ac
        L_0x0259:
            java.lang.String r1 = "yeelink.light.strip8"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0263
            goto L_0x0013
        L_0x0263:
            r0 = 61
            goto L_0x05ac
        L_0x0267:
            java.lang.String r1 = "yeelink.light.strip6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0271
            goto L_0x0013
        L_0x0271:
            r0 = 60
            goto L_0x05ac
        L_0x0275:
            java.lang.String r1 = "yeelink.light.strip4"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x027f
            goto L_0x0013
        L_0x027f:
            r0 = 59
            goto L_0x05ac
        L_0x0283:
            java.lang.String r1 = "yeelink.light.strip2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x028d
            goto L_0x0013
        L_0x028d:
            r0 = 58
            goto L_0x05ac
        L_0x0291:
            java.lang.String r1 = "yeelink.light.strip1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x029b
            goto L_0x0013
        L_0x029b:
            r0 = 57
            goto L_0x05ac
        L_0x029f:
            java.lang.String r1 = "yeelink.light.sp1grp"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02a9
            goto L_0x0013
        L_0x02a9:
            r0 = 56
            goto L_0x05ac
        L_0x02ad:
            java.lang.String r1 = "yilai.light.ceiling3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02b7
            goto L_0x0013
        L_0x02b7:
            r0 = 55
            goto L_0x05ac
        L_0x02bb:
            java.lang.String r1 = "yilai.light.ceiling2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02c5
            goto L_0x0013
        L_0x02c5:
            r0 = 54
            goto L_0x05ac
        L_0x02c9:
            java.lang.String r1 = "yilai.light.ceiling1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02d3
            goto L_0x0013
        L_0x02d3:
            r0 = 53
            goto L_0x05ac
        L_0x02d7:
            java.lang.String r1 = "yeelink.light.plate2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02e1
            goto L_0x0013
        L_0x02e1:
            r0 = 52
            goto L_0x05ac
        L_0x02e5:
            java.lang.String r1 = "yeelink.light.panel3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02ef
            goto L_0x0013
        L_0x02ef:
            r0 = 51
            goto L_0x05ac
        L_0x02f3:
            java.lang.String r1 = "yeelink.light.panel1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02fd
            goto L_0x0013
        L_0x02fd:
            r0 = 50
            goto L_0x05ac
        L_0x0301:
            java.lang.String r1 = "yeelink.light.mb2grp"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x030b
            goto L_0x0013
        L_0x030b:
            r0 = 49
            goto L_0x05ac
        L_0x030f:
            java.lang.String r1 = "yeelink.light.mb1grp"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0319
            goto L_0x0013
        L_0x0319:
            r0 = 48
            goto L_0x05ac
        L_0x031d:
            java.lang.String r1 = "yeelink.light.lamp19"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0327
            goto L_0x0013
        L_0x0327:
            r0 = 47
            goto L_0x05ac
        L_0x032b:
            java.lang.String r1 = "yeelink.light.lamp17"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0335
            goto L_0x0013
        L_0x0335:
            r0 = 46
            goto L_0x05ac
        L_0x0339:
            java.lang.String r1 = "yeelink.light.lamp15"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0343
            goto L_0x0013
        L_0x0343:
            r0 = 45
            goto L_0x05ac
        L_0x0347:
            java.lang.String r1 = "yeelink.light.lamp10"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0351
            goto L_0x0013
        L_0x0351:
            r0 = 44
            goto L_0x05ac
        L_0x0355:
            java.lang.String r1 = "yeelink.wifispeaker.v1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x035f
            goto L_0x0013
        L_0x035f:
            r0 = 43
            goto L_0x05ac
        L_0x0363:
            java.lang.String r1 = "yeelink.light.fancl6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x036d
            goto L_0x0013
        L_0x036d:
            r0 = 42
            goto L_0x05ac
        L_0x0371:
            java.lang.String r1 = "yeelink.light.fancl5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x037b
            goto L_0x0013
        L_0x037b:
            r0 = 41
            goto L_0x05ac
        L_0x037f:
            java.lang.String r1 = "yeelink.light.fancl2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0389
            goto L_0x0013
        L_0x0389:
            r0 = 40
            goto L_0x05ac
        L_0x038d:
            java.lang.String r1 = "yeelink.light.fancl1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0397
            goto L_0x0013
        L_0x0397:
            r0 = 39
            goto L_0x05ac
        L_0x039b:
            java.lang.String r1 = "yeelink.light.dn2grp"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03a5
            goto L_0x0013
        L_0x03a5:
            r0 = 38
            goto L_0x05ac
        L_0x03a9:
            java.lang.String r1 = "yeelink.light.colore"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03b3
            goto L_0x0013
        L_0x03b3:
            r0 = 37
            goto L_0x05ac
        L_0x03b7:
            java.lang.String r1 = "yeelink.light.colorc"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03c1
            goto L_0x0013
        L_0x03c1:
            r0 = 36
            goto L_0x05ac
        L_0x03c5:
            java.lang.String r1 = "yeelink.light.colorb"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03cf
            goto L_0x0013
        L_0x03cf:
            r0 = 35
            goto L_0x05ac
        L_0x03d3:
            java.lang.String r1 = "yeelink.light.colora"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03dd
            goto L_0x0013
        L_0x03dd:
            r0 = 34
            goto L_0x05ac
        L_0x03e1:
            java.lang.String r1 = "yeelink.light.color8"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03eb
            goto L_0x0013
        L_0x03eb:
            r0 = 33
            goto L_0x05ac
        L_0x03ef:
            java.lang.String r1 = "yeelink.light.color6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03f9
            goto L_0x0013
        L_0x03f9:
            r0 = 32
            goto L_0x05ac
        L_0x03fd:
            java.lang.String r1 = "yeelink.light.color5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0407
            goto L_0x0013
        L_0x0407:
            r0 = 31
            goto L_0x05ac
        L_0x040b:
            java.lang.String r1 = "yeelink.light.color4"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0415
            goto L_0x0013
        L_0x0415:
            r0 = 30
            goto L_0x05ac
        L_0x0419:
            java.lang.String r1 = "yeelink.light.color3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0423
            goto L_0x0013
        L_0x0423:
            r0 = 29
            goto L_0x05ac
        L_0x0427:
            java.lang.String r1 = "yeelink.light.color2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0431
            goto L_0x0013
        L_0x0431:
            r0 = 28
            goto L_0x05ac
        L_0x0435:
            java.lang.String r1 = "yeelink.light.color1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x043f
            goto L_0x0013
        L_0x043f:
            r0 = 27
            goto L_0x05ac
        L_0x0443:
            java.lang.String r1 = "yeelink.light.ceil35"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x044d
            goto L_0x0013
        L_0x044d:
            r0 = 26
            goto L_0x05ac
        L_0x0451:
            java.lang.String r1 = "yeelink.light.ceil33"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x045b
            goto L_0x0013
        L_0x045b:
            r0 = 25
            goto L_0x05ac
        L_0x045f:
            java.lang.String r1 = "yeelink.light.ceil32"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0469
            goto L_0x0013
        L_0x0469:
            r0 = 24
            goto L_0x05ac
        L_0x046d:
            java.lang.String r1 = "yeelink.light.ceil31"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0477
            goto L_0x0013
        L_0x0477:
            r0 = 23
            goto L_0x05ac
        L_0x047b:
            java.lang.String r1 = "yeelink.light.ceil30"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0485
            goto L_0x0013
        L_0x0485:
            r0 = 22
            goto L_0x05ac
        L_0x0489:
            java.lang.String r1 = "yeelink.light.ceil29"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0493
            goto L_0x0013
        L_0x0493:
            r0 = 21
            goto L_0x05ac
        L_0x0497:
            java.lang.String r1 = "yeelink.light.ceil27"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04a1
            goto L_0x0013
        L_0x04a1:
            r0 = 20
            goto L_0x05ac
        L_0x04a5:
            java.lang.String r1 = "yeelink.light.ceil26"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04af
            goto L_0x0013
        L_0x04af:
            r0 = 19
            goto L_0x05ac
        L_0x04b3:
            java.lang.String r1 = "yeelink.plug.plug"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04bd
            goto L_0x0013
        L_0x04bd:
            r0 = 18
            goto L_0x05ac
        L_0x04c1:
            java.lang.String r1 = "yeelink.light.ble1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04cb
            goto L_0x0013
        L_0x04cb:
            r0 = 17
            goto L_0x05ac
        L_0x04cf:
            java.lang.String r1 = "yeelink.light.ceiling24"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04d9
            goto L_0x0013
        L_0x04d9:
            r0 = 16
            goto L_0x05ac
        L_0x04dd:
            java.lang.String r1 = "yeelink.light.ceiling23"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04e7
            goto L_0x0013
        L_0x04e7:
            r0 = 15
            goto L_0x05ac
        L_0x04eb:
            java.lang.String r1 = "yeelink.light.ceiling22"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04f5
            goto L_0x0013
        L_0x04f5:
            r0 = 14
            goto L_0x05ac
        L_0x04f9:
            java.lang.String r1 = "yeelink.light.ceiling21"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0503
            goto L_0x0013
        L_0x0503:
            r0 = 13
            goto L_0x05ac
        L_0x0507:
            java.lang.String r1 = "yeelink.light.ceiling20"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0511
            goto L_0x0013
        L_0x0511:
            r0 = 12
            goto L_0x05ac
        L_0x0515:
            java.lang.String r1 = "yeelink.light.ceiling19"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x051f
            goto L_0x0013
        L_0x051f:
            r0 = 11
            goto L_0x05ac
        L_0x0523:
            java.lang.String r1 = "yeelink.light.ceiling18"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x052d
            goto L_0x0013
        L_0x052d:
            r0 = 10
            goto L_0x05ac
        L_0x0531:
            java.lang.String r1 = "yeelink.light.ceiling17"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x053b
            goto L_0x0013
        L_0x053b:
            r0 = 9
            goto L_0x05ac
        L_0x053f:
            java.lang.String r1 = "yeelink.light.ceiling16"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0549
            goto L_0x0013
        L_0x0549:
            r0 = 8
            goto L_0x05ac
        L_0x054d:
            java.lang.String r1 = "yeelink.light.ceiling15"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0557
            goto L_0x0013
        L_0x0557:
            r0 = 7
            goto L_0x05ac
        L_0x0559:
            java.lang.String r1 = "yeelink.light.ceiling14"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0563
            goto L_0x0013
        L_0x0563:
            r0 = 6
            goto L_0x05ac
        L_0x0565:
            java.lang.String r1 = "yeelink.light.ceiling13"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x056f
            goto L_0x0013
        L_0x056f:
            r0 = 5
            goto L_0x05ac
        L_0x0571:
            java.lang.String r1 = "yeelink.light.ceiling12"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x057b
            goto L_0x0013
        L_0x057b:
            r0 = 4
            goto L_0x05ac
        L_0x057d:
            java.lang.String r1 = "yeelink.light.ceiling11"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0587
            goto L_0x0013
        L_0x0587:
            r0 = 3
            goto L_0x05ac
        L_0x0589:
            java.lang.String r1 = "yeelink.light.ceiling10"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0593
            goto L_0x0013
        L_0x0593:
            r0 = 2
            goto L_0x05ac
        L_0x0595:
            java.lang.String r1 = "yeelink.switch.sw1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x059f
            goto L_0x0013
        L_0x059f:
            r0 = 1
            goto L_0x05ac
        L_0x05a1:
            java.lang.String r1 = "yeelink.bhf_light.v1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05ab
            goto L_0x0013
        L_0x05ab:
            r0 = 0
        L_0x05ac:
            r1 = 2131231281(0x7f080231, float:1.8078639E38)
            r5 = 2131231412(0x7f0802b4, float:1.8078904E38)
            switch(r0) {
                case 0: goto L_0x0726;
                case 1: goto L_0x0723;
                case 2: goto L_0x071f;
                case 3: goto L_0x071b;
                case 4: goto L_0x0717;
                case 5: goto L_0x0713;
                case 6: goto L_0x0713;
                case 7: goto L_0x0643;
                case 8: goto L_0x070f;
                case 9: goto L_0x070b;
                case 10: goto L_0x0707;
                case 11: goto L_0x0703;
                case 12: goto L_0x06ff;
                case 13: goto L_0x06fb;
                case 14: goto L_0x06f7;
                case 15: goto L_0x06f3;
                case 16: goto L_0x06ef;
                case 17: goto L_0x06eb;
                case 18: goto L_0x06e7;
                case 19: goto L_0x06e3;
                case 20: goto L_0x06df;
                case 21: goto L_0x06db;
                case 22: goto L_0x06d7;
                case 23: goto L_0x06d3;
                case 24: goto L_0x06cf;
                case 25: goto L_0x06ca;
                case 26: goto L_0x06c5;
                case 27: goto L_0x06c0;
                case 28: goto L_0x06bb;
                case 29: goto L_0x06b6;
                case 30: goto L_0x06bb;
                case 31: goto L_0x06c0;
                case 32: goto L_0x06bb;
                case 33: goto L_0x06bb;
                case 34: goto L_0x06b1;
                case 35: goto L_0x06bb;
                case 36: goto L_0x06ac;
                case 37: goto L_0x06a7;
                case 38: goto L_0x06a2;
                case 39: goto L_0x069d;
                case 40: goto L_0x0698;
                case 41: goto L_0x0693;
                case 42: goto L_0x0693;
                case 43: goto L_0x068e;
                case 44: goto L_0x0689;
                case 45: goto L_0x0684;
                case 46: goto L_0x067f;
                case 47: goto L_0x067a;
                case 48: goto L_0x0675;
                case 49: goto L_0x0670;
                case 50: goto L_0x066b;
                case 51: goto L_0x066b;
                case 52: goto L_0x0666;
                case 53: goto L_0x0661;
                case 54: goto L_0x065c;
                case 55: goto L_0x0657;
                case 56: goto L_0x0652;
                case 57: goto L_0x064d;
                case 58: goto L_0x064d;
                case 59: goto L_0x0648;
                case 60: goto L_0x064d;
                case 61: goto L_0x064d;
                case 62: goto L_0x064d;
                case 63: goto L_0x0643;
                case 64: goto L_0x063e;
                case 65: goto L_0x0639;
                case 66: goto L_0x0639;
                case 67: goto L_0x0643;
                case 68: goto L_0x0634;
                case 69: goto L_0x062f;
                case 70: goto L_0x062a;
                case 71: goto L_0x0634;
                case 72: goto L_0x0625;
                case 73: goto L_0x0620;
                case 74: goto L_0x061b;
                case 75: goto L_0x0616;
                case 76: goto L_0x0611;
                case 77: goto L_0x0611;
                case 78: goto L_0x060c;
                case 79: goto L_0x0607;
                case 80: goto L_0x0611;
                case 81: goto L_0x0602;
                case 82: goto L_0x05fd;
                case 83: goto L_0x05f8;
                case 84: goto L_0x05f8;
                case 85: goto L_0x05f3;
                case 86: goto L_0x0643;
                case 87: goto L_0x0643;
                case 88: goto L_0x05ee;
                case 89: goto L_0x05e9;
                case 90: goto L_0x05e4;
                case 91: goto L_0x05df;
                case 92: goto L_0x05df;
                case 93: goto L_0x05df;
                case 94: goto L_0x05da;
                case 95: goto L_0x05da;
                case 96: goto L_0x05d5;
                case 97: goto L_0x05d0;
                case 98: goto L_0x05cb;
                case 99: goto L_0x05c6;
                case 100: goto L_0x067a;
                case 101: goto L_0x05c1;
                case 102: goto L_0x05bc;
                case 103: goto L_0x05b7;
                default: goto L_0x05b5;
            }
        L_0x05b5:
            goto L_0x0726
        L_0x05b7:
            r1 = 2131231355(0x7f08027b, float:1.8078789E38)
            goto L_0x0726
        L_0x05bc:
            r1 = 2131231423(0x7f0802bf, float:1.8078927E38)
            goto L_0x0726
        L_0x05c1:
            r1 = 2131231421(0x7f0802bd, float:1.8078923E38)
            goto L_0x0726
        L_0x05c6:
            r1 = 2131231341(0x7f08026d, float:1.807876E38)
            goto L_0x0726
        L_0x05cb:
            r1 = 2131231429(0x7f0802c5, float:1.8078939E38)
            goto L_0x0726
        L_0x05d0:
            r1 = 2131231427(0x7f0802c3, float:1.8078935E38)
            goto L_0x0726
        L_0x05d5:
            r1 = 2131231405(0x7f0802ad, float:1.807889E38)
            goto L_0x0726
        L_0x05da:
            r1 = 2131231409(0x7f0802b1, float:1.8078898E38)
            goto L_0x0726
        L_0x05df:
            r1 = 2131231446(0x7f0802d6, float:1.8078973E38)
            goto L_0x0726
        L_0x05e4:
            r1 = 2131231351(0x7f080277, float:1.807878E38)
            goto L_0x0726
        L_0x05e9:
            r1 = 2131231368(0x7f080288, float:1.8078815E38)
            goto L_0x0726
        L_0x05ee:
            r1 = 2131231369(0x7f080289, float:1.8078817E38)
            goto L_0x0726
        L_0x05f3:
            r1 = 2131231467(0x7f0802eb, float:1.8079016E38)
            goto L_0x0726
        L_0x05f8:
            r1 = 2131231377(0x7f080291, float:1.8078833E38)
            goto L_0x0726
        L_0x05fd:
            r1 = 2131231457(0x7f0802e1, float:1.8078996E38)
            goto L_0x0726
        L_0x0602:
            r1 = 2131231435(0x7f0802cb, float:1.807895E38)
            goto L_0x0726
        L_0x0607:
            r1 = 2131231433(0x7f0802c9, float:1.8078947E38)
            goto L_0x0726
        L_0x060c:
            r1 = 2131231431(0x7f0802c7, float:1.8078943E38)
            goto L_0x0726
        L_0x0611:
            r1 = 2131231357(0x7f08027d, float:1.8078793E38)
            goto L_0x0726
        L_0x0616:
            r1 = 2131231401(0x7f0802a9, float:1.8078882E38)
            goto L_0x0726
        L_0x061b:
            r1 = 2131231399(0x7f0802a7, float:1.8078878E38)
            goto L_0x0726
        L_0x0620:
            r1 = 2131231397(0x7f0802a5, float:1.8078874E38)
            goto L_0x0726
        L_0x0625:
            r1 = 2131231438(0x7f0802ce, float:1.8078957E38)
            goto L_0x0726
        L_0x062a:
            r1 = 2131231439(0x7f0802cf, float:1.807896E38)
            goto L_0x0726
        L_0x062f:
            r1 = 2131231365(0x7f080285, float:1.8078809E38)
            goto L_0x0726
        L_0x0634:
            r1 = 2131231415(0x7f0802b7, float:1.807891E38)
            goto L_0x0726
        L_0x0639:
            r1 = 2131231339(0x7f08026b, float:1.8078756E38)
            goto L_0x0726
        L_0x063e:
            r1 = 2131231337(0x7f080269, float:1.8078752E38)
            goto L_0x0726
        L_0x0643:
            r1 = 2131231412(0x7f0802b4, float:1.8078904E38)
            goto L_0x0726
        L_0x0648:
            r1 = 2131231461(0x7f0802e5, float:1.8079004E38)
            goto L_0x0726
        L_0x064d:
            r1 = 2131231451(0x7f0802db, float:1.8078983E38)
            goto L_0x0726
        L_0x0652:
            r1 = 2131231459(0x7f0802e3, float:1.8079E38)
            goto L_0x0726
        L_0x0657:
            r1 = 2131231387(0x7f08029b, float:1.8078854E38)
            goto L_0x0726
        L_0x065c:
            r1 = 2131231385(0x7f080299, float:1.807885E38)
            goto L_0x0726
        L_0x0661:
            r1 = 2131231388(0x7f08029c, float:1.8078856E38)
            goto L_0x0726
        L_0x0666:
            r1 = 2131231453(0x7f0802dd, float:1.8078987E38)
            goto L_0x0726
        L_0x066b:
            r1 = 2131231449(0x7f0802d9, float:1.807898E38)
            goto L_0x0726
        L_0x0670:
            r1 = 2131231419(0x7f0802bb, float:1.8078918E38)
            goto L_0x0726
        L_0x0675:
            r1 = 2131231417(0x7f0802b9, float:1.8078914E38)
            goto L_0x0726
        L_0x067a:
            r1 = 2131231362(0x7f080282, float:1.8078803E38)
            goto L_0x0726
        L_0x067f:
            r1 = 2131231395(0x7f0802a3, float:1.807887E38)
            goto L_0x0726
        L_0x0684:
            r1 = 2131231393(0x7f0802a1, float:1.8078866E38)
            goto L_0x0726
        L_0x0689:
            r1 = 2131231391(0x7f08029f, float:1.8078862E38)
            goto L_0x0726
        L_0x068e:
            r1 = 2131231359(0x7f08027f, float:1.8078797E38)
            goto L_0x0726
        L_0x0693:
            r1 = 2131231375(0x7f08028f, float:1.807883E38)
            goto L_0x0726
        L_0x0698:
            r1 = 2131231373(0x7f08028d, float:1.8078825E38)
            goto L_0x0726
        L_0x069d:
            r1 = 2131231371(0x7f08028b, float:1.8078821E38)
            goto L_0x0726
        L_0x06a2:
            r1 = 2131231353(0x7f080279, float:1.8078785E38)
            goto L_0x0726
        L_0x06a7:
            r1 = 2131231403(0x7f0802ab, float:1.8078886E38)
            goto L_0x0726
        L_0x06ac:
            r1 = 2131231349(0x7f080275, float:1.8078777E38)
            goto L_0x0726
        L_0x06b1:
            r1 = 2131231347(0x7f080273, float:1.8078772E38)
            goto L_0x0726
        L_0x06b6:
            r1 = 2131231345(0x7f080271, float:1.8078768E38)
            goto L_0x0726
        L_0x06bb:
            r1 = 2131231407(0x7f0802af, float:1.8078894E38)
            goto L_0x0726
        L_0x06c0:
            r1 = 2131231465(0x7f0802e9, float:1.8079012E38)
            goto L_0x0726
        L_0x06c5:
            r1 = 2131231333(0x7f080265, float:1.8078744E38)
            goto L_0x0726
        L_0x06ca:
            r1 = 2131231331(0x7f080263, float:1.807874E38)
            goto L_0x0726
        L_0x06cf:
            r1 = 2131231329(0x7f080261, float:1.8078736E38)
            goto L_0x0726
        L_0x06d3:
            r1 = 2131231327(0x7f08025f, float:1.8078732E38)
            goto L_0x0726
        L_0x06d7:
            r1 = 2131231325(0x7f08025d, float:1.8078728E38)
            goto L_0x0726
        L_0x06db:
            r1 = 2131231323(0x7f08025b, float:1.8078724E38)
            goto L_0x0726
        L_0x06df:
            r1 = 2131231321(0x7f080259, float:1.807872E38)
            goto L_0x0726
        L_0x06e3:
            r1 = 2131231319(0x7f080257, float:1.8078716E38)
            goto L_0x0726
        L_0x06e7:
            r1 = 2131231455(0x7f0802df, float:1.8078991E38)
            goto L_0x0726
        L_0x06eb:
            r1 = 2131231343(0x7f08026f, float:1.8078764E38)
            goto L_0x0726
        L_0x06ef:
            r1 = 2131231317(0x7f080255, float:1.8078712E38)
            goto L_0x0726
        L_0x06f3:
            r1 = 2131231315(0x7f080253, float:1.8078708E38)
            goto L_0x0726
        L_0x06f7:
            r1 = 2131231313(0x7f080251, float:1.8078703E38)
            goto L_0x0726
        L_0x06fb:
            r1 = 2131231311(0x7f08024f, float:1.80787E38)
            goto L_0x0726
        L_0x06ff:
            r1 = 2131231309(0x7f08024d, float:1.8078695E38)
            goto L_0x0726
        L_0x0703:
            r1 = 2131231307(0x7f08024b, float:1.8078691E38)
            goto L_0x0726
        L_0x0707:
            r1 = 2131231305(0x7f080249, float:1.8078687E38)
            goto L_0x0726
        L_0x070b:
            r1 = 2131231303(0x7f080247, float:1.8078683E38)
            goto L_0x0726
        L_0x070f:
            r1 = 2131231301(0x7f080245, float:1.807868E38)
            goto L_0x0726
        L_0x0713:
            r1 = 2131231299(0x7f080243, float:1.8078675E38)
            goto L_0x0726
        L_0x0717:
            r1 = 2131231297(0x7f080241, float:1.8078671E38)
            goto L_0x0726
        L_0x071b:
            r1 = 2131231295(0x7f08023f, float:1.8078667E38)
            goto L_0x0726
        L_0x071f:
            r1 = 2131231442(0x7f0802d2, float:1.8078965E38)
            goto L_0x0726
        L_0x0723:
            r1 = 2131231463(0x7f0802e7, float:1.8079008E38)
        L_0x0726:
            r0 = 2131755489(0x7f1001e1, float:1.9141859E38)
            java.lang.CharSequence r0 = r6.getText(r0)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r5 = r7.mo23389c()
            r2[r3] = r5
            java.lang.String r0 = java.lang.String.format(r0, r2)
            i4.d$e r2 = new i4.d$e
            r2.<init>(r6)
            r3 = 2131755507(0x7f1001f3, float:1.9141895E38)
            java.lang.CharSequence r3 = r6.getText(r3)
            java.lang.String r3 = r3.toString()
            i4.d$e r2 = r2.mo37179i(r3)
            i4.d$e r0 = r2.mo37177g(r0)
            r2 = -2
            r3 = 2131755147(0x7f10008b, float:1.9141165E38)
            java.lang.CharSequence r3 = r6.getText(r3)
            java.lang.String r3 = r3.toString()
            r5 = 0
            i4.d$e r0 = r0.mo37174d(r2, r3, r5)
            r2 = 2131755281(0x7f100111, float:1.9141437E38)
            java.lang.CharSequence r2 = r6.getText(r2)
            java.lang.String r2 = r2.toString()
            com.yeelight.cherry.ui.activity.DeviceShareActivity$b r3 = new com.yeelight.cherry.ui.activity.DeviceShareActivity$b
            r3.<init>(r7)
            i4.d$e r0 = r0.mo37174d(r4, r2, r3)
            android.content.res.Resources r2 = r6.getResources()
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeResource(r2, r1)
            java.lang.String r7 = r7.mo23387a()
            i4.d$e r7 = r0.mo37171a(r1, r7)
            i4.d r7 = r7.mo37172b()
            r7.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.activity.DeviceShareActivity.m16209o0(com.yeelight.yeelib.managers.a$k):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: p0 */
    public void m16210p0(C3051a.C3062k kVar) {
        try {
            MiotManager.getDeviceManager().shareDevice(this.f10364i.mo23206S(), kVar.mo23388b(), new C5260d(kVar));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: q0 */
    private void m16211q0() {
        this.f10365j.post(new C5271m());
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public void m16212r0(C3051a.C3062k kVar) {
        AppConfigurationProvider.m17583o(kVar);
        m16208n0();
        this.f10369n.notifyDataSetChanged();
        m16211q0();
    }

    /* renamed from: C */
    public void mo23255C(C3051a.C3062k kVar) {
        runOnUiThread(new C5256a(kVar));
    }

    /* renamed from: H */
    public void mo23262H() {
    }

    /* renamed from: d */
    public void mo23283d() {
    }

    /* renamed from: g */
    public void mo23288g() {
    }

    /* renamed from: h */
    public void mo23291h() {
    }

    /* renamed from: l */
    public void mo23300l() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_device_share);
        this.f10368m = (HorizontalListView) findViewById(C12225R$id.share_list);
        C5272n nVar = new C5272n(this, (C5263e) null);
        this.f10369n = nVar;
        this.f10368m.setAdapter((ListAdapter) nVar);
        this.f10366k = (CommonTitleBar) findViewById(2131297591);
        this.f10367l = (LinearLayout) findViewById(C12225R$id.device_share_img);
        this.f10358c = (LinearLayout) findViewById(C12225R$id.search_result_layout);
        this.f10360e = (FrameLayout) findViewById(C12225R$id.search_history);
        this.f10361f = (CircleImageView) findViewById(C12225R$id.search_result_profile);
        this.f10362g = (ImageView) findViewById(C12225R$id.search_no_result);
        this.f10363h = (TextView) findViewById(C12225R$id.search_result_name);
        this.f10365j = (TextView) findViewById(C12225R$id.no_share_history_tips);
        this.f10359d = (LinearLayout) findViewById(C12225R$id.layout_search);
        ImageView imageView = (ImageView) findViewById(2131296733);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f10354p, "Activity has not device id", false);
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("com.yeelight.cherry.device_id");
        C3012e r0 = YeelightDeviceManager.m7804r0(stringExtra);
        this.f10364i = r0;
        if (r0 == null) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        this.f10366k.mo36195a(String.format(Locale.US, getText(2131755506).toString(), new Object[]{this.f10364i.mo23210U()}), new C5263e(), new C5264f(stringExtra));
        this.f10366k.setTitleTextSize(16);
        EditText editText = (EditText) findViewById(2131296734);
        this.f10357b = editText;
        editText.setOnClickListener(new C5265g());
        this.f10357b.addTextChangedListener(new C5266h(this, imageView));
        imageView.setOnClickListener(new C5267i());
        this.f10357b.setOnEditorActionListener(new C5268j());
        m16208n0();
        m16211q0();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C3051a.m7925r().mo23358M(this);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C3051a.m7925r().mo23359N(this);
    }

    /* renamed from: q */
    public void mo23308q(String str) {
    }

    /* renamed from: r */
    public void mo23310r(String str) {
        this.f10363h.setText(2131755510);
        this.f10362g.setVisibility(0);
        this.f10361f.setVisibility(4);
    }
}
