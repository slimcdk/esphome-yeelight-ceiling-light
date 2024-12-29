package com.yeelight.cherry.p177ui.activity;

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
import com.yeelight.cherry.C11744R$drawable;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.data.AppConfigurationProvider;
import com.yeelight.yeelib.data.C7569a;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p152f.C4201a;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CircleImageView;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.view.HorizontalListView;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import java.util.ArrayList;
import java.util.Locale;
import p011c.p083d.p090b.C1203t;
import p011c.p083d.p090b.C1219x;

/* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity */
public class DeviceShareActivity extends BaseActivity implements C4201a.C4202i {
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final String f10791q = DeviceShareActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ArrayList<C4201a.C4212k> f10792b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public EditText f10793c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public LinearLayout f10794d;

    /* renamed from: e */
    private LinearLayout f10795e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public FrameLayout f10796f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public CircleImageView f10797g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public ImageView f10798h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public TextView f10799i;

    /* renamed from: j */
    private C4200i f10800j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public TextView f10801k;

    /* renamed from: l */
    private CommonTitleBar f10802l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public LinearLayout f10803m;

    /* renamed from: n */
    HorizontalListView f10804n;

    /* renamed from: o */
    C5223n f10805o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public Handler f10806p = new C5210c();

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$a */
    class C5207a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C4201a.C4212k f10807a;

        /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$a$a */
        class C5208a implements View.OnClickListener {
            C5208a() {
            }

            public void onClick(View view) {
                C5207a aVar = C5207a.this;
                DeviceShareActivity.this.m16287o0(aVar.f10807a);
            }
        }

        C5207a(C4201a.C4212k kVar) {
            this.f10807a = kVar;
        }

        public void run() {
            if ("-1".equals(this.f10807a.mo23486c()) || "-1".equals(this.f10807a.mo23485b())) {
                DeviceShareActivity.this.f10799i.setText(2131755506);
                DeviceShareActivity.this.f10799i.setTextColor(DeviceShareActivity.this.getResources().getColor(2131099835));
                DeviceShareActivity.this.f10798h.setVisibility(0);
                DeviceShareActivity.this.f10797g.setVisibility(4);
                return;
            }
            DeviceShareActivity.this.f10798h.setVisibility(4);
            DeviceShareActivity.this.f10797g.setVisibility(0);
            DeviceShareActivity.this.f10799i.setText(this.f10807a.mo23486c());
            DeviceShareActivity.this.f10799i.setTextColor(DeviceShareActivity.this.getResources().getColor(2131099837));
            if (this.f10807a.mo23484a() == null || this.f10807a.mo23484a().isEmpty()) {
                DeviceShareActivity.this.f10797g.setImageResource(2131231752);
            } else {
                C1219x j = C1203t.m3106o(C4297y.f7456e).mo10003j(this.f10807a.mo23484a());
                j.mo10038f(2131231752);
                j.mo10036d(DeviceShareActivity.this.f10797g);
            }
            DeviceShareActivity.this.f10797g.setOnClickListener(new C5208a());
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$b */
    class C5209b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C4201a.C4212k f10810a;

        C5209b(C4201a.C4212k kVar) {
            this.f10810a = kVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Message message = new Message();
            Bundle bundle = new Bundle();
            bundle.putString("mid", this.f10810a.mo23485b());
            bundle.putString(WebShellActivity.ARGS_KEY_URL, this.f10810a.mo23484a());
            bundle.putString("name", this.f10810a.mo23486c());
            message.setData(bundle);
            message.what = 0;
            DeviceShareActivity.this.f10806p.removeMessages(0);
            DeviceShareActivity.this.f10806p.sendMessageDelayed(message, 500);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$c */
    class C5210c extends Handler {
        C5210c() {
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
                    C4201a r = C4201a.m11607r();
                    r.getClass();
                    deviceShareActivity2.m16288p0(new C4201a.C4212k(r, string, string2, string3));
                }
            } else if (i2 == 1 && (data = message.getData()) != null) {
                int i3 = data.getInt("errCode");
                if (i3 == -8) {
                    deviceShareActivity = DeviceShareActivity.this;
                    i = 2131755506;
                } else if (i3 == -11) {
                    deviceShareActivity = DeviceShareActivity.this;
                    i = 2131755489;
                } else if (i3 == -1) {
                    deviceShareActivity = DeviceShareActivity.this;
                    i = 2131755505;
                } else if (i3 == -12) {
                    deviceShareActivity = DeviceShareActivity.this;
                    i = 2131755498;
                } else {
                    deviceShareActivity = DeviceShareActivity.this;
                    i = 2131755494;
                }
                Toast.makeText(DeviceShareActivity.this, deviceShareActivity.getString(i), 0).show();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$d */
    class C5211d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C4201a.C4212k f10813a;

        /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$d$a */
        class C5212a implements Runnable {

            /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$d$a$a */
            class C5213a implements DialogInterface.OnClickListener {
                C5213a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    if (DeviceShareActivity.this.f10803m.getVisibility() == 4) {
                        DeviceShareActivity.this.m16284l0();
                    }
                    C5211d dVar = C5211d.this;
                    DeviceShareActivity.this.m16290r0(dVar.f10813a);
                    dialogInterface.dismiss();
                }
            }

            C5212a() {
            }

            public void run() {
                if (!DeviceShareActivity.this.isFinishing()) {
                    C10526e.C10531e eVar = new C10526e.C10531e(DeviceShareActivity.this);
                    eVar.mo33357h(2131755503);
                    eVar.mo33355f(2131755488);
                    eVar.mo33354e(C11744R$drawable.icon_yeelight_share_device_success);
                    eVar.mo33353d(-1, DeviceShareActivity.this.getString(2131755237), new C5213a());
                    eVar.mo33351b().show();
                }
            }
        }

        C5211d(C4201a.C4212k kVar) {
            this.f10813a = kVar;
        }

        public void onFailed(int i, String str) {
            String unused = DeviceShareActivity.f10791q;
            "shareDevice onFailed: " + i + " " + str;
            Message message = new Message();
            Bundle bundle = new Bundle();
            bundle.putInt("errCode", i);
            message.setData(bundle);
            message.what = 1;
            DeviceShareActivity.this.f10806p.sendMessage(message);
        }

        public void onSucceed() {
            String unused = DeviceShareActivity.f10791q;
            DeviceShareActivity.this.runOnUiThread(new C5212a());
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$e */
    class C5214e implements View.OnClickListener {
        C5214e() {
        }

        public void onClick(View view) {
            DeviceShareActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$f */
    class C5215f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f10818a;

        C5215f(String str) {
            this.f10818a = str;
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra("com.yeelight.cherry.device_id", this.f10818a);
            intent.setClass(DeviceShareActivity.this, DeviceShareManagermentActivity.class);
            DeviceShareActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$g */
    class C5216g implements View.OnClickListener {
        C5216g() {
        }

        public void onClick(View view) {
            if (DeviceShareActivity.this.f10803m.getVisibility() == 0) {
                DeviceShareActivity.this.m16285m0();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$h */
    class C5217h implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ ImageView f10821a;

        C5217h(DeviceShareActivity deviceShareActivity, ImageView imageView) {
            this.f10821a = imageView;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4;
            ImageView imageView;
            if (charSequence.length() > 0) {
                imageView = this.f10821a;
                i4 = 0;
            } else {
                imageView = this.f10821a;
                i4 = 4;
            }
            imageView.setVisibility(i4);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$i */
    class C5218i implements View.OnClickListener {
        C5218i() {
        }

        public void onClick(View view) {
            DeviceShareActivity.this.f10793c.setText("");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$j */
    class C5219j implements TextView.OnEditorActionListener {
        C5219j() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i == 3) {
                C4201a.m11607r().mo23451u(DeviceShareActivity.this.f10793c.getText().toString());
                DeviceShareActivity.this.f10794d.setVisibility(0);
                DeviceShareActivity.this.f10796f.setVisibility(4);
                ((InputMethodManager) DeviceShareActivity.this.getSystemService("input_method")).hideSoftInputFromWindow(textView.getWindowToken(), 0);
            }
            return false;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$k */
    class C5220k implements Animator.AnimatorListener {
        C5220k() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            DeviceShareActivity.this.f10803m.setLayoutParams(new LinearLayout.LayoutParams(-1, C10547m.m25751a(DeviceShareActivity.this, 252.0f)));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            DeviceShareActivity.this.f10799i.setLayoutParams(layoutParams);
            layoutParams.setMargins(0, C10547m.m25751a(DeviceShareActivity.this, 10.0f), 0, C10547m.m25751a(DeviceShareActivity.this, 62.0f));
            DeviceShareActivity.this.f10803m.setVisibility(4);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$l */
    class C5221l implements Animator.AnimatorListener {
        C5221l() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            DeviceShareActivity.this.f10803m.setVisibility(0);
            DeviceShareActivity.this.f10794d.setVisibility(4);
            DeviceShareActivity.this.f10796f.setVisibility(0);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            DeviceShareActivity.this.f10803m.setLayoutParams(new LinearLayout.LayoutParams(-1, C10547m.m25751a(DeviceShareActivity.this, 314.0f)));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$m */
    class C5222m implements Runnable {
        C5222m() {
        }

        public void run() {
            if (DeviceShareActivity.this.f10792b.size() == 0) {
                DeviceShareActivity.this.f10801k.setVisibility(0);
                DeviceShareActivity.this.f10804n.setVisibility(4);
                return;
            }
            DeviceShareActivity.this.f10801k.setVisibility(4);
            DeviceShareActivity.this.f10804n.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$n */
    private class C5223n extends BaseAdapter {

        /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$n$a */
        class C5224a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f10828a;

            C5224a(int i) {
                this.f10828a = i;
            }

            public void onClick(View view) {
                DeviceShareActivity deviceShareActivity = DeviceShareActivity.this;
                deviceShareActivity.m16287o0((C4201a.C4212k) deviceShareActivity.f10792b.get(this.f10828a));
            }
        }

        private C5223n() {
        }

        /* synthetic */ C5223n(DeviceShareActivity deviceShareActivity, C5214e eVar) {
            this();
        }

        public int getCount() {
            if (DeviceShareActivity.this.f10792b.size() > 4) {
                return 4;
            }
            return DeviceShareActivity.this.f10792b.size();
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C5225o oVar;
            if (view == null) {
                oVar = new C5225o(DeviceShareActivity.this, (C5214e) null);
                view2 = LayoutInflater.from(DeviceShareActivity.this).inflate(C11748R$layout.item_share_device_profile, (ViewGroup) null);
                view2.setTag(oVar);
            } else {
                view2 = view;
                oVar = (C5225o) view.getTag();
            }
            oVar.f10830a = (ImageView) view2.findViewById(C11745R$id.user_profile_image);
            oVar.f10831b = (TextView) view2.findViewById(C11745R$id.user_profile_name);
            oVar.f10830a.setOnClickListener(new C5224a(i));
            if (((C4201a.C4212k) DeviceShareActivity.this.f10792b.get(i)).mo23484a() == null || ((C4201a.C4212k) DeviceShareActivity.this.f10792b.get(i)).mo23484a().isEmpty()) {
                oVar.f10830a.setImageResource(2131231752);
            } else {
                C1219x j = C1203t.m3106o(C4297y.f7456e).mo10003j(((C4201a.C4212k) DeviceShareActivity.this.f10792b.get(i)).mo23484a());
                j.mo10038f(2131231752);
                j.mo10036d(oVar.f10830a);
            }
            oVar.f10831b.setText(((C4201a.C4212k) DeviceShareActivity.this.f10792b.get(i)).mo23486c());
            return view2;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareActivity$o */
    private class C5225o {

        /* renamed from: a */
        public ImageView f10830a;

        /* renamed from: b */
        public TextView f10831b;

        private C5225o(DeviceShareActivity deviceShareActivity) {
        }

        /* synthetic */ C5225o(DeviceShareActivity deviceShareActivity, C5214e eVar) {
            this(deviceShareActivity);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public void m16284l0() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f10795e, "translationY", new float[]{0.0f});
        ofFloat.setDuration(300);
        ofFloat.addListener(new C5221l());
        ofFloat.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public void m16285m0() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f10795e, "translationY", new float[]{(float) ((-this.f10803m.getHeight()) + C10547m.m25753c(this, 62.0f))});
        ofFloat.setDuration(300);
        ofFloat.addListener(new C5220k());
        ofFloat.start();
    }

    /* renamed from: n0 */
    private void m16286n0() {
        this.f10792b = new ArrayList<>();
        Cursor i = AppConfigurationProvider.m22356i();
        if (i.moveToFirst()) {
            do {
                String string = i.getString(i.getColumnIndex(C7569a.C7572b.C7573a.f15312b));
                String string2 = i.getString(i.getColumnIndex(C7569a.C7572b.C7573a.f15313c));
                String string3 = i.getString(i.getColumnIndex(C7569a.C7572b.C7573a.f15314d));
                C4201a r = C4201a.m11607r();
                r.getClass();
                this.f10792b.add(new C4201a.C4212k(r, string, string2, string3));
            } while (i.moveToNext());
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: o0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m16287o0(com.yeelight.yeelib.p152f.C4201a.C4212k r7) {
        /*
            r6 = this;
            com.yeelight.yeelib.c.i.i r0 = r6.f10800j
            java.lang.String r0 = r0.mo23395T()
            int r1 = r0.hashCode()
            r2 = 1
            r3 = 0
            r4 = -1
            switch(r1) {
                case -1644531059: goto L_0x048e;
                case -1494338802: goto L_0x0483;
                case -1462015191: goto L_0x0478;
                case -1462015190: goto L_0x046d;
                case -1462015189: goto L_0x0462;
                case -1462015188: goto L_0x0457;
                case -1462015187: goto L_0x044c;
                case -1462015186: goto L_0x0441;
                case -1462015185: goto L_0x0436;
                case -1462015184: goto L_0x042a;
                case -1462015183: goto L_0x041e;
                case -1462015182: goto L_0x0412;
                case -1462015160: goto L_0x0406;
                case -1462015159: goto L_0x03fa;
                case -1462015158: goto L_0x03ee;
                case -1462015157: goto L_0x03e2;
                case -1462015156: goto L_0x03d6;
                case -1400275319: goto L_0x03cb;
                case -1350780909: goto L_0x03bf;
                case -1317475940: goto L_0x03b3;
                case -1317475939: goto L_0x03a7;
                case -1317475937: goto L_0x039b;
                case -1317475915: goto L_0x038f;
                case -1317475914: goto L_0x0383;
                case -1317475913: goto L_0x0377;
                case -1317475912: goto L_0x036b;
                case -1308146495: goto L_0x035f;
                case -1308146494: goto L_0x0353;
                case -1308146493: goto L_0x0347;
                case -1308146492: goto L_0x033b;
                case -1308146491: goto L_0x032f;
                case -1308146490: goto L_0x0323;
                case -1308146488: goto L_0x0317;
                case -1308146447: goto L_0x030b;
                case -1308146446: goto L_0x02ff;
                case -1308146445: goto L_0x02f3;
                case -1282176368: goto L_0x02e7;
                case -1235140472: goto L_0x02db;
                case -1235140471: goto L_0x02cf;
                case -1235140468: goto L_0x02c3;
                case -1235140467: goto L_0x02b7;
                case -1119332198: goto L_0x02ab;
                case -1063384694: goto L_0x029f;
                case -1063384689: goto L_0x0293;
                case -1063384687: goto L_0x0287;
                case -1063384685: goto L_0x027b;
                case -1035626052: goto L_0x026f;
                case -1035596261: goto L_0x0263;
                case -948847040: goto L_0x0257;
                case -948847038: goto L_0x024b;
                case -888668266: goto L_0x023f;
                case -888668265: goto L_0x0233;
                case -888668264: goto L_0x0227;
                case -850921852: goto L_0x021b;
                case -845289556: goto L_0x020f;
                case -845289555: goto L_0x0203;
                case -845289553: goto L_0x01f7;
                case -845289551: goto L_0x01eb;
                case -845289508: goto L_0x01df;
                case -458141175: goto L_0x01d3;
                case -458141174: goto L_0x01c7;
                case -458141173: goto L_0x01bb;
                case -458141172: goto L_0x01af;
                case -449944730: goto L_0x01a3;
                case -449944729: goto L_0x0197;
                case -449944728: goto L_0x018b;
                case -449944727: goto L_0x017f;
                case -449944726: goto L_0x0173;
                case -449944724: goto L_0x0167;
                case -449944723: goto L_0x015b;
                case -449944722: goto L_0x014f;
                case -448603205: goto L_0x0144;
                case -448603204: goto L_0x0139;
                case -448603202: goto L_0x012e;
                case -448603201: goto L_0x0123;
                case -448603157: goto L_0x0118;
                case -448603156: goto L_0x010d;
                case -443031172: goto L_0x0101;
                case -190173984: goto L_0x00f5;
                case -190173936: goto L_0x00e9;
                case 674030242: goto L_0x00dd;
                case 922669543: goto L_0x00d1;
                case 922669544: goto L_0x00c5;
                case 922669545: goto L_0x00b9;
                case 922669546: goto L_0x00ad;
                case 922669547: goto L_0x00a1;
                case 922669548: goto L_0x0095;
                case 922669549: goto L_0x0089;
                case 922669550: goto L_0x007d;
                case 1201756974: goto L_0x0072;
                case 1201757021: goto L_0x0066;
                case 1201766335: goto L_0x005a;
                case 1201766336: goto L_0x004e;
                case 1623724661: goto L_0x0042;
                case 1623724663: goto L_0x0036;
                case 2102612488: goto L_0x002a;
                case 2102612489: goto L_0x001e;
                case 2146130361: goto L_0x0012;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0499
        L_0x0012:
            java.lang.String r1 = "yeelink.light.dnlight2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 81
            goto L_0x049a
        L_0x001e:
            java.lang.String r1 = "yeelink.light.meshbulb2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 83
            goto L_0x049a
        L_0x002a:
            java.lang.String r1 = "yeelink.light.meshbulb1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 82
            goto L_0x049a
        L_0x0036:
            java.lang.String r1 = "yeelink.light.bslamp3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 38
            goto L_0x049a
        L_0x0042:
            java.lang.String r1 = "yeelink.light.bslamp1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 37
            goto L_0x049a
        L_0x004e:
            java.lang.String r1 = "yeelink.light.ml2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 86
            goto L_0x049a
        L_0x005a:
            java.lang.String r1 = "yeelink.light.ml1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 85
            goto L_0x049a
        L_0x0066:
            java.lang.String r1 = "yeelink.light.cta"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 8
            goto L_0x049a
        L_0x0072:
            java.lang.String r1 = "yeelink.light.ct2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 7
            goto L_0x049a
        L_0x007d:
            java.lang.String r1 = "yeelink.light.ceiling8"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 45
            goto L_0x049a
        L_0x0089:
            java.lang.String r1 = "yeelink.light.ceiling7"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 44
            goto L_0x049a
        L_0x0095:
            java.lang.String r1 = "yeelink.light.ceiling6"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 43
            goto L_0x049a
        L_0x00a1:
            java.lang.String r1 = "yeelink.light.ceiling5"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 76
            goto L_0x049a
        L_0x00ad:
            java.lang.String r1 = "yeelink.light.ceiling4"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 47
            goto L_0x049a
        L_0x00b9:
            java.lang.String r1 = "yeelink.light.ceiling3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 46
            goto L_0x049a
        L_0x00c5:
            java.lang.String r1 = "yeelink.light.ceiling2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 41
            goto L_0x049a
        L_0x00d1:
            java.lang.String r1 = "yeelink.light.ceiling1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 40
            goto L_0x049a
        L_0x00dd:
            java.lang.String r1 = "yeelink.curtain.ctmt1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 91
            goto L_0x049a
        L_0x00e9:
            java.lang.String r1 = "yeelink.gateway.va"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 80
            goto L_0x049a
        L_0x00f5:
            java.lang.String r1 = "yeelink.gateway.v1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 79
            goto L_0x049a
        L_0x0101:
            java.lang.String r1 = "yeelink.light.spot1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 84
            goto L_0x049a
        L_0x010d:
            java.lang.String r1 = "yeelink.light.monob"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 5
            goto L_0x049a
        L_0x0118:
            java.lang.String r1 = "yeelink.light.monoa"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 2
            goto L_0x049a
        L_0x0123:
            java.lang.String r1 = "yeelink.light.mono5"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 6
            goto L_0x049a
        L_0x012e:
            java.lang.String r1 = "yeelink.light.mono4"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 4
            goto L_0x049a
        L_0x0139:
            java.lang.String r1 = "yeelink.light.mono2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 3
            goto L_0x049a
        L_0x0144:
            java.lang.String r1 = "yeelink.light.mono1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 1
            goto L_0x049a
        L_0x014f:
            java.lang.String r1 = "yeelink.light.lamp9"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 30
            goto L_0x049a
        L_0x015b:
            java.lang.String r1 = "yeelink.light.lamp8"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 29
            goto L_0x049a
        L_0x0167:
            java.lang.String r1 = "yeelink.light.lamp7"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 28
            goto L_0x049a
        L_0x0173:
            java.lang.String r1 = "yeelink.light.lamp5"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 35
            goto L_0x049a
        L_0x017f:
            java.lang.String r1 = "yeelink.light.lamp4"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 27
            goto L_0x049a
        L_0x018b:
            java.lang.String r1 = "yeelink.light.lamp3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 34
            goto L_0x049a
        L_0x0197:
            java.lang.String r1 = "yeelink.light.lamp2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 33
            goto L_0x049a
        L_0x01a3:
            java.lang.String r1 = "yeelink.light.lamp1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 26
            goto L_0x049a
        L_0x01af:
            java.lang.String r1 = "yeelink.light.ceild"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 72
            goto L_0x049a
        L_0x01bb:
            java.lang.String r1 = "yeelink.light.ceilc"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 71
            goto L_0x049a
        L_0x01c7:
            java.lang.String r1 = "yeelink.light.ceilb"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 70
            goto L_0x049a
        L_0x01d3:
            java.lang.String r1 = "yeelink.light.ceila"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 42
            goto L_0x049a
        L_0x01df:
            java.lang.String r1 = "yeelink.light.stripa"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 25
            goto L_0x049a
        L_0x01eb:
            java.lang.String r1 = "yeelink.light.strip6"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 24
            goto L_0x049a
        L_0x01f7:
            java.lang.String r1 = "yeelink.light.strip4"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 9
            goto L_0x049a
        L_0x0203:
            java.lang.String r1 = "yeelink.light.strip2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 23
            goto L_0x049a
        L_0x020f:
            java.lang.String r1 = "yeelink.light.strip1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 22
            goto L_0x049a
        L_0x021b:
            java.lang.String r1 = "yeelink.light.sp1grp"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 90
            goto L_0x049a
        L_0x0227:
            java.lang.String r1 = "yilai.light.ceiling3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 75
            goto L_0x049a
        L_0x0233:
            java.lang.String r1 = "yilai.light.ceiling2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 74
            goto L_0x049a
        L_0x023f:
            java.lang.String r1 = "yilai.light.ceiling1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 73
            goto L_0x049a
        L_0x024b:
            java.lang.String r1 = "yeelink.light.panel3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 11
            goto L_0x049a
        L_0x0257:
            java.lang.String r1 = "yeelink.light.panel1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 10
            goto L_0x049a
        L_0x0263:
            java.lang.String r1 = "yeelink.light.mb2grp"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 89
            goto L_0x049a
        L_0x026f:
            java.lang.String r1 = "yeelink.light.mb1grp"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 88
            goto L_0x049a
        L_0x027b:
            java.lang.String r1 = "yeelink.light.lamp19"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 39
            goto L_0x049a
        L_0x0287:
            java.lang.String r1 = "yeelink.light.lamp17"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 36
            goto L_0x049a
        L_0x0293:
            java.lang.String r1 = "yeelink.light.lamp15"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 31
            goto L_0x049a
        L_0x029f:
            java.lang.String r1 = "yeelink.light.lamp10"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 32
            goto L_0x049a
        L_0x02ab:
            java.lang.String r1 = "yeelink.wifispeaker.v1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 77
            goto L_0x049a
        L_0x02b7:
            java.lang.String r1 = "yeelink.light.fancl6"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 97
            goto L_0x049a
        L_0x02c3:
            java.lang.String r1 = "yeelink.light.fancl5"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 96
            goto L_0x049a
        L_0x02cf:
            java.lang.String r1 = "yeelink.light.fancl2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 95
            goto L_0x049a
        L_0x02db:
            java.lang.String r1 = "yeelink.light.fancl1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 94
            goto L_0x049a
        L_0x02e7:
            java.lang.String r1 = "yeelink.light.dn2grp"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 87
            goto L_0x049a
        L_0x02f3:
            java.lang.String r1 = "yeelink.light.colorc"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 21
            goto L_0x049a
        L_0x02ff:
            java.lang.String r1 = "yeelink.light.colorb"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 14
            goto L_0x049a
        L_0x030b:
            java.lang.String r1 = "yeelink.light.colora"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 20
            goto L_0x049a
        L_0x0317:
            java.lang.String r1 = "yeelink.light.color8"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 16
            goto L_0x049a
        L_0x0323:
            java.lang.String r1 = "yeelink.light.color6"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 15
            goto L_0x049a
        L_0x032f:
            java.lang.String r1 = "yeelink.light.color5"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 19
            goto L_0x049a
        L_0x033b:
            java.lang.String r1 = "yeelink.light.color4"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 13
            goto L_0x049a
        L_0x0347:
            java.lang.String r1 = "yeelink.light.color3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 17
            goto L_0x049a
        L_0x0353:
            java.lang.String r1 = "yeelink.light.color2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 12
            goto L_0x049a
        L_0x035f:
            java.lang.String r1 = "yeelink.light.color1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 18
            goto L_0x049a
        L_0x036b:
            java.lang.String r1 = "yeelink.light.ceil33"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 69
            goto L_0x049a
        L_0x0377:
            java.lang.String r1 = "yeelink.light.ceil32"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 68
            goto L_0x049a
        L_0x0383:
            java.lang.String r1 = "yeelink.light.ceil31"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 67
            goto L_0x049a
        L_0x038f:
            java.lang.String r1 = "yeelink.light.ceil30"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 66
            goto L_0x049a
        L_0x039b:
            java.lang.String r1 = "yeelink.light.ceil29"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 65
            goto L_0x049a
        L_0x03a7:
            java.lang.String r1 = "yeelink.light.ceil27"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 64
            goto L_0x049a
        L_0x03b3:
            java.lang.String r1 = "yeelink.light.ceil26"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 63
            goto L_0x049a
        L_0x03bf:
            java.lang.String r1 = "yeelink.plug.plug"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 93
            goto L_0x049a
        L_0x03cb:
            java.lang.String r1 = "yeelink.light.ble1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 0
            goto L_0x049a
        L_0x03d6:
            java.lang.String r1 = "yeelink.light.ceiling24"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 62
            goto L_0x049a
        L_0x03e2:
            java.lang.String r1 = "yeelink.light.ceiling23"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 61
            goto L_0x049a
        L_0x03ee:
            java.lang.String r1 = "yeelink.light.ceiling22"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 60
            goto L_0x049a
        L_0x03fa:
            java.lang.String r1 = "yeelink.light.ceiling21"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 59
            goto L_0x049a
        L_0x0406:
            java.lang.String r1 = "yeelink.light.ceiling20"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 58
            goto L_0x049a
        L_0x0412:
            java.lang.String r1 = "yeelink.light.ceiling19"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 57
            goto L_0x049a
        L_0x041e:
            java.lang.String r1 = "yeelink.light.ceiling18"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 56
            goto L_0x049a
        L_0x042a:
            java.lang.String r1 = "yeelink.light.ceiling17"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 55
            goto L_0x049a
        L_0x0436:
            java.lang.String r1 = "yeelink.light.ceiling16"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 54
            goto L_0x049a
        L_0x0441:
            java.lang.String r1 = "yeelink.light.ceiling15"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 53
            goto L_0x049a
        L_0x044c:
            java.lang.String r1 = "yeelink.light.ceiling14"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 52
            goto L_0x049a
        L_0x0457:
            java.lang.String r1 = "yeelink.light.ceiling13"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 51
            goto L_0x049a
        L_0x0462:
            java.lang.String r1 = "yeelink.light.ceiling12"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 50
            goto L_0x049a
        L_0x046d:
            java.lang.String r1 = "yeelink.light.ceiling11"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 49
            goto L_0x049a
        L_0x0478:
            java.lang.String r1 = "yeelink.light.ceiling10"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 48
            goto L_0x049a
        L_0x0483:
            java.lang.String r1 = "yeelink.switch.sw1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 92
            goto L_0x049a
        L_0x048e:
            java.lang.String r1 = "yeelink.bhf_light.v1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0499
            r0 = 78
            goto L_0x049a
        L_0x0499:
            r0 = -1
        L_0x049a:
            r1 = 2131231267(0x7f080223, float:1.807861E38)
            r5 = 2131231392(0x7f0802a0, float:1.8078864E38)
            switch(r0) {
                case 0: goto L_0x05fd;
                case 1: goto L_0x05f9;
                case 2: goto L_0x05f9;
                case 3: goto L_0x05f9;
                case 4: goto L_0x05f5;
                case 5: goto L_0x05f1;
                case 6: goto L_0x05ed;
                case 7: goto L_0x05e9;
                case 8: goto L_0x05e9;
                case 9: goto L_0x05e5;
                case 10: goto L_0x05e1;
                case 11: goto L_0x05e1;
                case 12: goto L_0x05dd;
                case 13: goto L_0x05dd;
                case 14: goto L_0x05dd;
                case 15: goto L_0x05dd;
                case 16: goto L_0x05dd;
                case 17: goto L_0x05d9;
                case 18: goto L_0x05d5;
                case 19: goto L_0x05d5;
                case 20: goto L_0x05d1;
                case 21: goto L_0x05cd;
                case 22: goto L_0x05c9;
                case 23: goto L_0x05c9;
                case 24: goto L_0x05c9;
                case 25: goto L_0x05c9;
                case 26: goto L_0x05c5;
                case 27: goto L_0x05c5;
                case 28: goto L_0x05c1;
                case 29: goto L_0x05bd;
                case 30: goto L_0x05b9;
                case 31: goto L_0x05b5;
                case 32: goto L_0x05b1;
                case 33: goto L_0x05ad;
                case 34: goto L_0x05a9;
                case 35: goto L_0x05a4;
                case 36: goto L_0x059f;
                case 37: goto L_0x059a;
                case 38: goto L_0x0595;
                case 39: goto L_0x0595;
                case 40: goto L_0x0590;
                case 41: goto L_0x0590;
                case 42: goto L_0x0590;
                case 43: goto L_0x058b;
                case 44: goto L_0x058b;
                case 45: goto L_0x058b;
                case 46: goto L_0x0586;
                case 47: goto L_0x0581;
                case 48: goto L_0x057c;
                case 49: goto L_0x0577;
                case 50: goto L_0x0572;
                case 51: goto L_0x056d;
                case 52: goto L_0x056d;
                case 53: goto L_0x0590;
                case 54: goto L_0x0568;
                case 55: goto L_0x0563;
                case 56: goto L_0x055e;
                case 57: goto L_0x0559;
                case 58: goto L_0x0554;
                case 59: goto L_0x054f;
                case 60: goto L_0x054a;
                case 61: goto L_0x0545;
                case 62: goto L_0x0540;
                case 63: goto L_0x053b;
                case 64: goto L_0x0536;
                case 65: goto L_0x0531;
                case 66: goto L_0x052c;
                case 67: goto L_0x0527;
                case 68: goto L_0x0522;
                case 69: goto L_0x051d;
                case 70: goto L_0x0518;
                case 71: goto L_0x0513;
                case 72: goto L_0x0513;
                case 73: goto L_0x050e;
                case 74: goto L_0x0509;
                case 75: goto L_0x0504;
                case 76: goto L_0x04ff;
                case 77: goto L_0x04fa;
                case 78: goto L_0x0600;
                case 79: goto L_0x04f5;
                case 80: goto L_0x04f5;
                case 81: goto L_0x04f0;
                case 82: goto L_0x04eb;
                case 83: goto L_0x04e6;
                case 84: goto L_0x04e1;
                case 85: goto L_0x04dc;
                case 86: goto L_0x04d7;
                case 87: goto L_0x04d2;
                case 88: goto L_0x04cd;
                case 89: goto L_0x04c8;
                case 90: goto L_0x04c3;
                case 91: goto L_0x04be;
                case 92: goto L_0x04b9;
                case 93: goto L_0x04b4;
                case 94: goto L_0x04af;
                case 95: goto L_0x04aa;
                case 96: goto L_0x04a5;
                case 97: goto L_0x04a5;
                default: goto L_0x04a3;
            }
        L_0x04a3:
            goto L_0x0600
        L_0x04a5:
            r1 = 2131231359(0x7f08027f, float:1.8078797E38)
            goto L_0x0600
        L_0x04aa:
            r1 = 2131231357(0x7f08027d, float:1.8078793E38)
            goto L_0x0600
        L_0x04af:
            r1 = 2131231355(0x7f08027b, float:1.8078789E38)
            goto L_0x0600
        L_0x04b4:
            r1 = 2131231433(0x7f0802c9, float:1.8078947E38)
            goto L_0x0600
        L_0x04b9:
            r1 = 2131231441(0x7f0802d1, float:1.8078963E38)
            goto L_0x0600
        L_0x04be:
            r1 = 2131231445(0x7f0802d5, float:1.8078971E38)
            goto L_0x0600
        L_0x04c3:
            r1 = 2131231437(0x7f0802cd, float:1.8078955E38)
            goto L_0x0600
        L_0x04c8:
            r1 = 2131231399(0x7f0802a7, float:1.8078878E38)
            goto L_0x0600
        L_0x04cd:
            r1 = 2131231397(0x7f0802a5, float:1.8078874E38)
            goto L_0x0600
        L_0x04d2:
            r1 = 2131231337(0x7f080269, float:1.8078752E38)
            goto L_0x0600
        L_0x04d7:
            r1 = 2131231409(0x7f0802b1, float:1.8078898E38)
            goto L_0x0600
        L_0x04dc:
            r1 = 2131231407(0x7f0802af, float:1.8078894E38)
            goto L_0x0600
        L_0x04e1:
            r1 = 2131231435(0x7f0802cb, float:1.807895E38)
            goto L_0x0600
        L_0x04e6:
            r1 = 2131231403(0x7f0802ab, float:1.8078886E38)
            goto L_0x0600
        L_0x04eb:
            r1 = 2131231401(0x7f0802a9, float:1.8078882E38)
            goto L_0x0600
        L_0x04f0:
            r1 = 2131231339(0x7f08026b, float:1.8078756E38)
            goto L_0x0600
        L_0x04f5:
            r1 = 2131231361(0x7f080281, float:1.80788E38)
            goto L_0x0600
        L_0x04fa:
            r1 = 2131231343(0x7f08026f, float:1.8078764E38)
            goto L_0x0600
        L_0x04ff:
            r1 = 2131231335(0x7f080267, float:1.8078748E38)
            goto L_0x0600
        L_0x0504:
            r1 = 2131231371(0x7f08028b, float:1.8078821E38)
            goto L_0x0600
        L_0x0509:
            r1 = 2131231369(0x7f080289, float:1.8078817E38)
            goto L_0x0600
        L_0x050e:
            r1 = 2131231372(0x7f08028c, float:1.8078823E38)
            goto L_0x0600
        L_0x0513:
            r1 = 2131231323(0x7f08025b, float:1.8078724E38)
            goto L_0x0600
        L_0x0518:
            r1 = 2131231321(0x7f080259, float:1.807872E38)
            goto L_0x0600
        L_0x051d:
            r1 = 2131231317(0x7f080255, float:1.8078712E38)
            goto L_0x0600
        L_0x0522:
            r1 = 2131231315(0x7f080253, float:1.8078708E38)
            goto L_0x0600
        L_0x0527:
            r1 = 2131231313(0x7f080251, float:1.8078703E38)
            goto L_0x0600
        L_0x052c:
            r1 = 2131231311(0x7f08024f, float:1.80787E38)
            goto L_0x0600
        L_0x0531:
            r1 = 2131231309(0x7f08024d, float:1.8078695E38)
            goto L_0x0600
        L_0x0536:
            r1 = 2131231307(0x7f08024b, float:1.8078691E38)
            goto L_0x0600
        L_0x053b:
            r1 = 2131231305(0x7f080249, float:1.8078687E38)
            goto L_0x0600
        L_0x0540:
            r1 = 2131231303(0x7f080247, float:1.8078683E38)
            goto L_0x0600
        L_0x0545:
            r1 = 2131231301(0x7f080245, float:1.807868E38)
            goto L_0x0600
        L_0x054a:
            r1 = 2131231299(0x7f080243, float:1.8078675E38)
            goto L_0x0600
        L_0x054f:
            r1 = 2131231297(0x7f080241, float:1.8078671E38)
            goto L_0x0600
        L_0x0554:
            r1 = 2131231295(0x7f08023f, float:1.8078667E38)
            goto L_0x0600
        L_0x0559:
            r1 = 2131231293(0x7f08023d, float:1.8078663E38)
            goto L_0x0600
        L_0x055e:
            r1 = 2131231291(0x7f08023b, float:1.8078659E38)
            goto L_0x0600
        L_0x0563:
            r1 = 2131231289(0x7f080239, float:1.8078655E38)
            goto L_0x0600
        L_0x0568:
            r1 = 2131231287(0x7f080237, float:1.807865E38)
            goto L_0x0600
        L_0x056d:
            r1 = 2131231285(0x7f080235, float:1.8078647E38)
            goto L_0x0600
        L_0x0572:
            r1 = 2131231283(0x7f080233, float:1.8078643E38)
            goto L_0x0600
        L_0x0577:
            r1 = 2131231281(0x7f080231, float:1.8078639E38)
            goto L_0x0600
        L_0x057c:
            r1 = 2131231422(0x7f0802be, float:1.8078925E38)
            goto L_0x0600
        L_0x0581:
            r1 = 2131231352(0x7f080278, float:1.8078783E38)
            goto L_0x0600
        L_0x0586:
            r1 = 2131231353(0x7f080279, float:1.8078785E38)
            goto L_0x0600
        L_0x058b:
            r1 = 2131231426(0x7f0802c2, float:1.8078933E38)
            goto L_0x0600
        L_0x0590:
            r1 = 2131231392(0x7f0802a0, float:1.8078864E38)
            goto L_0x0600
        L_0x0595:
            r1 = 2131231346(0x7f080272, float:1.807877E38)
            goto L_0x0600
        L_0x059a:
            r1 = 2131231325(0x7f08025d, float:1.8078728E38)
            goto L_0x0600
        L_0x059f:
            r1 = 2131231379(0x7f080293, float:1.8078837E38)
            goto L_0x0600
        L_0x05a4:
            r1 = 2131231418(0x7f0802ba, float:1.8078916E38)
            goto L_0x0600
        L_0x05a9:
            r1 = 2131231419(0x7f0802bb, float:1.8078918E38)
            goto L_0x0600
        L_0x05ad:
            r1 = 2131231349(0x7f080275, float:1.8078777E38)
            goto L_0x0600
        L_0x05b1:
            r1 = 2131231375(0x7f08028f, float:1.807883E38)
            goto L_0x0600
        L_0x05b5:
            r1 = 2131231377(0x7f080291, float:1.8078833E38)
            goto L_0x0600
        L_0x05b9:
            r1 = 2131231385(0x7f080299, float:1.807885E38)
            goto L_0x0600
        L_0x05bd:
            r1 = 2131231383(0x7f080297, float:1.8078845E38)
            goto L_0x0600
        L_0x05c1:
            r1 = 2131231381(0x7f080295, float:1.8078841E38)
            goto L_0x0600
        L_0x05c5:
            r1 = 2131231395(0x7f0802a3, float:1.807887E38)
            goto L_0x0600
        L_0x05c9:
            r1 = 2131231431(0x7f0802c7, float:1.8078943E38)
            goto L_0x0600
        L_0x05cd:
            r1 = 2131231333(0x7f080265, float:1.8078744E38)
            goto L_0x0600
        L_0x05d1:
            r1 = 2131231331(0x7f080263, float:1.807874E38)
            goto L_0x0600
        L_0x05d5:
            r1 = 2131231443(0x7f0802d3, float:1.8078967E38)
            goto L_0x0600
        L_0x05d9:
            r1 = 2131231329(0x7f080261, float:1.8078736E38)
            goto L_0x0600
        L_0x05dd:
            r1 = 2131231387(0x7f08029b, float:1.8078854E38)
            goto L_0x0600
        L_0x05e1:
            r1 = 2131231429(0x7f0802c5, float:1.8078939E38)
            goto L_0x0600
        L_0x05e5:
            r1 = 2131231439(0x7f0802cf, float:1.807896E38)
            goto L_0x0600
        L_0x05e9:
            r1 = 2131231389(0x7f08029d, float:1.8078858E38)
            goto L_0x0600
        L_0x05ed:
            r1 = 2131231413(0x7f0802b5, float:1.8078906E38)
            goto L_0x0600
        L_0x05f1:
            r1 = 2131231415(0x7f0802b7, float:1.807891E38)
            goto L_0x0600
        L_0x05f5:
            r1 = 2131231411(0x7f0802b3, float:1.8078902E38)
            goto L_0x0600
        L_0x05f9:
            r1 = 2131231341(0x7f08026d, float:1.807876E38)
            goto L_0x0600
        L_0x05fd:
            r1 = 2131231327(0x7f08025f, float:1.8078732E38)
        L_0x0600:
            r0 = 2131755485(0x7f1001dd, float:1.914185E38)
            java.lang.CharSequence r0 = r6.getText(r0)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r5 = r7.mo23486c()
            r2[r3] = r5
            java.lang.String r0 = java.lang.String.format(r0, r2)
            com.yeelight.yeelib.ui.widget.e$e r2 = new com.yeelight.yeelib.ui.widget.e$e
            r2.<init>(r6)
            r3 = 2131755503(0x7f1001ef, float:1.9141887E38)
            java.lang.CharSequence r3 = r6.getText(r3)
            java.lang.String r3 = r3.toString()
            r2.mo33358i(r3)
            r2.mo33356g(r0)
            r0 = -2
            r3 = 2131755146(0x7f10008a, float:1.9141163E38)
            java.lang.CharSequence r3 = r6.getText(r3)
            java.lang.String r3 = r3.toString()
            r5 = 0
            r2.mo33353d(r0, r3, r5)
            r0 = 2131755277(0x7f10010d, float:1.9141429E38)
            java.lang.CharSequence r0 = r6.getText(r0)
            java.lang.String r0 = r0.toString()
            com.yeelight.cherry.ui.activity.DeviceShareActivity$b r3 = new com.yeelight.cherry.ui.activity.DeviceShareActivity$b
            r3.<init>(r7)
            r2.mo33353d(r4, r0, r3)
            android.content.res.Resources r0 = r6.getResources()
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r0, r1)
            java.lang.String r7 = r7.mo23484a()
            r2.mo33350a(r0, r7)
            com.yeelight.yeelib.ui.widget.e r7 = r2.mo33351b()
            r7.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.activity.DeviceShareActivity.m16287o0(com.yeelight.yeelib.f.a$k):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: p0 */
    public void m16288p0(C4201a.C4212k kVar) {
        try {
            MiotManager.getDeviceManager().shareDevice(this.f10800j.mo23393S(), kVar.mo23485b(), new C5211d(kVar));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: q0 */
    private void m16289q0() {
        this.f10801k.post(new C5222m());
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public void m16290r0(C4201a.C4212k kVar) {
        AppConfigurationProvider.m22362o(kVar);
        m16286n0();
        this.f10805o.notifyDataSetChanged();
        m16289q0();
    }

    /* renamed from: C */
    public void mo23456C(C4201a.C4212k kVar) {
        runOnUiThread(new C5207a(kVar));
    }

    /* renamed from: H */
    public void mo23457H() {
    }

    /* renamed from: d */
    public void mo23458d() {
    }

    /* renamed from: g */
    public void mo23459g() {
    }

    /* renamed from: i */
    public void mo23460i() {
    }

    /* renamed from: l */
    public void mo23461l() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_device_share);
        this.f10804n = (HorizontalListView) findViewById(C11745R$id.share_list);
        C5223n nVar = new C5223n(this, (C5214e) null);
        this.f10805o = nVar;
        this.f10804n.setAdapter((ListAdapter) nVar);
        this.f10802l = (CommonTitleBar) findViewById(2131297424);
        this.f10803m = (LinearLayout) findViewById(C11745R$id.device_share_img);
        this.f10794d = (LinearLayout) findViewById(C11745R$id.search_result_layout);
        this.f10796f = (FrameLayout) findViewById(C11745R$id.search_history);
        this.f10797g = (CircleImageView) findViewById(C11745R$id.search_result_profile);
        this.f10798h = (ImageView) findViewById(C11745R$id.search_no_result);
        this.f10799i = (TextView) findViewById(C11745R$id.search_result_name);
        this.f10801k = (TextView) findViewById(C11745R$id.no_share_history_tips);
        this.f10795e = (LinearLayout) findViewById(C11745R$id.layout_search);
        ImageView imageView = (ImageView) findViewById(2131296639);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f10791q, "Activity has not device id", false);
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("com.yeelight.cherry.device_id");
        C4200i o0 = C4257w.m11953o0(stringExtra);
        this.f10800j = o0;
        if (o0 == null) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        this.f10802l.mo32825a(String.format(Locale.US, getText(2131755502).toString(), new Object[]{this.f10800j.mo23397U()}), new C5214e(), new C5215f(stringExtra));
        this.f10802l.setTitleTextSize(16);
        EditText editText = (EditText) findViewById(2131296640);
        this.f10793c = editText;
        editText.setOnClickListener(new C5216g());
        this.f10793c.addTextChangedListener(new C5217h(this, imageView));
        imageView.setOnClickListener(new C5218i());
        this.f10793c.setOnEditorActionListener(new C5219j());
        m16286n0();
        m16289q0();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C4201a.m11607r().mo23444M(this);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C4201a.m11607r().mo23445N(this);
    }

    /* renamed from: q */
    public void mo23462q(String str) {
    }

    /* renamed from: r */
    public void mo23463r(String str) {
        this.f10799i.setText(2131755506);
        this.f10798h.setVisibility(0);
        this.f10797g.setVisibility(4);
    }
}
