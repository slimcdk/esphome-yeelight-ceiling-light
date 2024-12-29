package com.yeelight.cherry.p141ui.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chauthai.swipereveallayout.C0635a;
import com.chauthai.swipereveallayout.SwipeRevealLayout;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.miot.api.Constants;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.managers.C3096u;
import com.yeelight.yeelib.managers.C8272e;
import com.yeelight.yeelib.managers.C8278k;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.C3112v;
import com.yeelight.yeelib.models.C8309b;
import com.yeelight.yeelib.models.C8319k;
import com.yeelight.yeelib.models.C8321m;
import com.yeelight.yeelib.models.CustomAdvancedFlowScene;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.C8869a;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import p051j4.C9193k;
import p096s2.C3691f;
import p170i4.C9107b;
import p170i4.C9113d;

/* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity */
public class PersonalityLightingActivity extends BaseActivity {

    /* renamed from: a */
    RecyclerView f11086a;

    /* renamed from: b */
    C5568h f11087b;

    /* renamed from: c */
    List<CustomAdvancedFlowScene> f11088c = new ArrayList();

    /* renamed from: d */
    LinearLayout f11089d;

    /* renamed from: e */
    CommonTitleBar f11090e;

    /* renamed from: f */
    TwinklingRefreshLayout f11091f;

    /* renamed from: g */
    int f11092g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C3010c f11093h;

    /* renamed from: i */
    C9107b.C9109b f11094i = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Handler f11095j = new C5565e();

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$a */
    class C5561a implements View.OnClickListener {
        C5561a() {
        }

        public void onClick(View view) {
            PersonalityLightingActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$b */
    class C5562b implements View.OnClickListener {
        C5562b() {
        }

        public void onClick(View view) {
            PersonalityLightingActivity.this.m16801b0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$c */
    class C5563c implements View.OnClickListener {
        C5563c() {
        }

        public void onClick(View view) {
            PersonalityLightingActivity.this.m16801b0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$d */
    class C5564d extends C3691f {
        C5564d() {
        }

        /* renamed from: a */
        public void mo20223a(TwinklingRefreshLayout twinklingRefreshLayout) {
        }

        /* renamed from: e */
        public void mo20228e(TwinklingRefreshLayout twinklingRefreshLayout) {
            PersonalityLightingActivity personalityLightingActivity;
            boolean z;
            if (C8272e.m19511b().mo35204d()) {
                personalityLightingActivity = PersonalityLightingActivity.this;
                z = false;
            } else {
                personalityLightingActivity = PersonalityLightingActivity.this;
                z = true;
            }
            personalityLightingActivity.m16800a0(z);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$e */
    class C5565e extends Handler {
        C5565e() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0) {
                PersonalityLightingActivity.this.f11087b.notifyDataSetChanged();
                PersonalityLightingActivity.this.f11091f.mo20222A();
                PersonalityLightingActivity.this.m16802c0();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$f */
    class C5566f implements C3112v.C3119g {
        C5566f() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m16806c() {
            synchronized (PersonalityLightingActivity.this.f11088c) {
                PersonalityLightingActivity.this.f11088c.clear();
                PersonalityLightingActivity.this.f11088c.addAll(C3112v.m8242u().mo23558i());
                PersonalityLightingActivity.this.f11087b.notifyDataSetChanged();
            }
        }

        /* renamed from: a */
        public void mo23579a(String str) {
        }

        /* renamed from: g */
        public void mo23580g() {
        }

        public void onRefresh() {
            long j;
            Handler handler;
            PersonalityLightingActivity.this.runOnUiThread(new C5785k2(this));
            if (PersonalityLightingActivity.this.f11095j.hasMessages(0)) {
                PersonalityLightingActivity.this.f11095j.removeMessages(0);
                handler = PersonalityLightingActivity.this.f11095j;
                j = 200;
            } else {
                handler = PersonalityLightingActivity.this.f11095j;
                j = 1000;
            }
            handler.sendEmptyMessageDelayed(0, j);
        }

        /* renamed from: r */
        public void mo23582r(boolean z, List<C8321m> list) {
        }

        /* renamed from: s */
        public void mo23583s(String str) {
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$g */
    static /* synthetic */ class C5567g {

        /* renamed from: a */
        static final /* synthetic */ int[] f11102a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.yeelight.yeelib.models.CustomAdvancedFlowScene$LightMode[] r0 = com.yeelight.yeelib.models.CustomAdvancedFlowScene.LightMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11102a = r0
                com.yeelight.yeelib.models.CustomAdvancedFlowScene$LightMode r1 = com.yeelight.yeelib.models.CustomAdvancedFlowScene.LightMode.MODE_COLOR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11102a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.models.CustomAdvancedFlowScene$LightMode r1 = com.yeelight.yeelib.models.CustomAdvancedFlowScene.LightMode.MODE_CT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11102a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yeelight.yeelib.models.CustomAdvancedFlowScene$LightMode r1 = com.yeelight.yeelib.models.CustomAdvancedFlowScene.LightMode.MODE_BRIGHT_ONLY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f11102a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.yeelight.yeelib.models.CustomAdvancedFlowScene$LightMode r1 = com.yeelight.yeelib.models.CustomAdvancedFlowScene.LightMode.MODE_SUSPEND     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.activity.PersonalityLightingActivity.C5567g.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h */
    private class C5568h extends RecyclerView.Adapter<C5579i> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C0635a f11103a;

        /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h$a */
        class C5569a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ CustomAdvancedFlowScene f11105a;

            /* renamed from: b */
            final /* synthetic */ C5579i f11106b;

            C5569a(CustomAdvancedFlowScene customAdvancedFlowScene, C5579i iVar) {
                this.f11105a = customAdvancedFlowScene;
                this.f11106b = iVar;
            }

            public void onClick(View view) {
                if (PersonalityLightingActivity.this.f11092g == 1) {
                    HashMap<String, Object> hashMap = new HashMap<>();
                    hashMap.put("com.yeelight.cherry.device_id", PersonalityLightingActivity.this.getIntent().getStringExtra("com.yeelight.cherry.device_id"));
                    hashMap.put("position", Integer.valueOf(PersonalityLightingActivity.this.getIntent().getIntExtra("position", -1)));
                    hashMap.put("scene", Integer.valueOf(this.f11105a.mo35451r()));
                    hashMap.put("scene_name", this.f11105a.mo35450q());
                    hashMap.put(Constants.EXTRA_PUSH_COMMAND, this.f11105a.mo35294a().toString());
                    C3096u.f4935i = hashMap;
                    PersonalityLightingActivity.this.finish();
                    return;
                }
                Intent intent = new Intent(PersonalityLightingActivity.this, PersonalityLightPreviewActivity.class);
                intent.putExtra("custom_scene_index", this.f11106b.getAdapterPosition());
                PersonalityLightingActivity.this.startActivity(intent);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h$b */
        class C5570b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C5579i f11108a;

            C5570b(C5579i iVar) {
                this.f11108a = iVar;
            }

            public void onClick(View view) {
                if (PersonalityLightingActivity.this.f11092g == 0) {
                    Intent intent = new Intent(PersonalityLightingActivity.this, PersonalityLightEditActivity.class);
                    intent.putExtra("custom_scene_index", this.f11108a.getAdapterPosition());
                    PersonalityLightingActivity.this.startActivity(intent);
                }
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h$c */
        class C5571c implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ CustomAdvancedFlowScene f11110a;

            /* renamed from: b */
            final /* synthetic */ C5579i f11111b;

            /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h$c$a */
            class C5572a implements DialogInterface.OnClickListener {

                /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h$c$a$a */
                class C5573a implements C3112v.C3119g {
                    C5573a(C5572a aVar) {
                    }

                    /* renamed from: a */
                    public void mo23579a(String str) {
                    }

                    /* renamed from: g */
                    public void mo23580g() {
                    }

                    public void onRefresh() {
                    }

                    /* renamed from: r */
                    public void mo23582r(boolean z, List<C8321m> list) {
                    }

                    /* renamed from: s */
                    public void mo23583s(String str) {
                    }
                }

                C5572a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    C3112v.m8242u().mo23555f(C5571c.this.f11110a, new C5573a(this));
                    dialogInterface.dismiss();
                    C5568h.this.f11103a.mo11088e(String.valueOf(C5571c.this.f11110a.mo35451r()));
                    int adapterPosition = C5571c.this.f11111b.getAdapterPosition();
                    if (adapterPosition > 0) {
                        PersonalityLightingActivity.this.f11088c.remove(adapterPosition);
                    }
                    C5568h.this.notifyDataSetChanged();
                    PersonalityLightingActivity.this.m16802c0();
                }
            }

            C5571c(CustomAdvancedFlowScene customAdvancedFlowScene, C5579i iVar) {
                this.f11110a = customAdvancedFlowScene;
                this.f11111b = iVar;
            }

            public void onClick(View view) {
                C9113d.C9118e eVar = new C9113d.C9118e(view.getContext());
                eVar.mo37179i(PersonalityLightingActivity.this.getString(2131755247)).mo37177g(PersonalityLightingActivity.this.getString(2131756028)).mo37174d(-2, PersonalityLightingActivity.this.getString(2131755232), (DialogInterface.OnClickListener) null).mo37174d(-1, PersonalityLightingActivity.this.getString(2131755281), new C5572a());
                eVar.mo37180j();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h$d */
        class C5574d implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ CustomAdvancedFlowScene f11114a;

            /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h$d$a */
            class C5575a implements Runnable {
                C5575a() {
                }

                public void run() {
                    C5568h.this.m16816h();
                }
            }

            /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h$d$b */
            class C5576b implements C8278k.C8280b {
                C5576b() {
                }

                /* access modifiers changed from: private */
                /* renamed from: e */
                public /* synthetic */ void m16825e() {
                    PersonalityLightingActivity.this.f11094i.mo37128b(2, "");
                }

                /* access modifiers changed from: private */
                /* renamed from: f */
                public /* synthetic */ void m16826f(String str) {
                    PersonalityLightingActivity.this.f11094i.mo37128b(1, "");
                    C5568h.this.m16815g(str);
                }

                /* renamed from: a */
                public void mo30783a(String str) {
                    PersonalityLightingActivity.this.runOnUiThread(new C5791l2(this));
                }

                /* renamed from: b */
                public void mo30784b(String str) {
                    PersonalityLightingActivity.this.runOnUiThread(new C5797m2(this, str));
                }
            }

            C5574d(CustomAdvancedFlowScene customAdvancedFlowScene) {
                this.f11114a = customAdvancedFlowScene;
            }

            public void onClick(View view) {
                PersonalityLightingActivity.this.runOnUiThread(new C5575a());
                C8278k.m19535b().mo35221c(this.f11114a.mo35451r(), new C5576b());
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h$e */
        class C5577e implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ String f11118a;

            /* renamed from: b */
            final /* synthetic */ AlertDialog f11119b;

            C5577e(String str, AlertDialog alertDialog) {
                this.f11118a = str;
                this.f11119b = alertDialog;
            }

            public void onClick(View view) {
                C8278k.m19535b().mo35220a(view.getContext(), String.format(PersonalityLightingActivity.this.getString(2131755818), new Object[]{this.f11118a}));
                Intent intent = new Intent();
                intent.setClass(PersonalityLightingActivity.this, LightShareApplicationActivity.class);
                PersonalityLightingActivity.this.startActivity(intent);
                this.f11119b.dismiss();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h$f */
        class C5578f implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f11121a;

            C5578f(C5568h hVar, AlertDialog alertDialog) {
                this.f11121a = alertDialog;
            }

            public void onClick(View view) {
                this.f11121a.dismiss();
            }
        }

        C5568h() {
            C0635a aVar = new C0635a();
            this.f11103a = aVar;
            aVar.mo11089h(true);
        }

        /* renamed from: d */
        private String m16814d(C8309b bVar) {
            int i = 0;
            for (C8319k c : bVar.mo35436c().mo35338h()) {
                i += c.mo35375c();
            }
            int i2 = i / 86400000;
            return String.format(Locale.US, "%02d:%02d:%02d.%d", new Object[]{Integer.valueOf((i % 86400000) / 3600000), Integer.valueOf((i % 3600000) / 60000), Integer.valueOf((i % 60000) / 1000), Integer.valueOf((i % 1000) / 100)});
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public void m16815g(String str) {
            View inflate = View.inflate(PersonalityLightingActivity.this, C12228R$layout.light_share_tag_dialog_layout, (ViewGroup) null);
            inflate.setLayerType(1, (Paint) null);
            ((TextView) inflate.findViewById(C12225R$id.view_share_text)).setText(str);
            AlertDialog create = new AlertDialog.Builder(PersonalityLightingActivity.this, 2131820942).create();
            inflate.findViewById(C12225R$id.dialog_btn_down).setOnClickListener(new C5577e(str, create));
            inflate.findViewById(C12225R$id.view_close_dialog).setOnClickListener(new C5578f(this, create));
            create.requestWindowFeature(1);
            create.setCancelable(false);
            create.show();
            create.setContentView(inflate);
            Display defaultDisplay = PersonalityLightingActivity.this.getWindowManager().getDefaultDisplay();
            WindowManager.LayoutParams attributes = create.getWindow().getAttributes();
            attributes.height = -2;
            double width = (double) defaultDisplay.getWidth();
            Double.isNaN(width);
            attributes.width = (int) (width * 0.78d);
            create.getWindow().setAttributes(attributes);
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public void m16816h() {
            PersonalityLightingActivity personalityLightingActivity = PersonalityLightingActivity.this;
            personalityLightingActivity.f11094i = new C9107b.C9109b(personalityLightingActivity);
            PersonalityLightingActivity personalityLightingActivity2 = PersonalityLightingActivity.this;
            personalityLightingActivity2.f11094i.mo37128b(0, personalityLightingActivity2.getString(2131755517));
            PersonalityLightingActivity.this.f11094i.mo37130d();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0106, code lost:
            if (com.yeelight.cherry.p141ui.activity.PersonalityLightingActivity.m16799Z(r11.f11104b).mo23188I().mo31881b(com.yeelight.yeelib.device.models.ProductModelBase.CapabilityType.CUSTOM_SCENE_COLOR) == false) goto L_0x0108;
         */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x010d  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x012a  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0166  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x017b  */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onBindViewHolder(com.yeelight.cherry.p141ui.activity.PersonalityLightingActivity.C5579i r12, int r13) {
            /*
                r11 = this;
                com.yeelight.cherry.ui.activity.PersonalityLightingActivity r0 = com.yeelight.cherry.p141ui.activity.PersonalityLightingActivity.this
                java.util.List<com.yeelight.yeelib.models.CustomAdvancedFlowScene> r0 = r0.f11088c
                monitor-enter(r0)
                com.yeelight.cherry.ui.activity.PersonalityLightingActivity r1 = com.yeelight.cherry.p141ui.activity.PersonalityLightingActivity.this     // Catch:{ all -> 0x0182 }
                java.util.List<com.yeelight.yeelib.models.CustomAdvancedFlowScene> r1 = r1.f11088c     // Catch:{ all -> 0x0182 }
                java.lang.Object r1 = r1.get(r13)     // Catch:{ all -> 0x0182 }
                com.yeelight.yeelib.models.CustomAdvancedFlowScene r1 = (com.yeelight.yeelib.models.CustomAdvancedFlowScene) r1     // Catch:{ all -> 0x0182 }
                int r2 = r1.mo35296d0()     // Catch:{ all -> 0x0182 }
                r3 = 0
                if (r2 <= 0) goto L_0x001b
                int r2 = r1.mo35296d0()     // Catch:{ all -> 0x0182 }
                goto L_0x001c
            L_0x001b:
                r2 = 0
            L_0x001c:
                android.widget.ImageView r4 = r12.f11122a     // Catch:{ all -> 0x0182 }
                java.util.List<java.lang.Integer> r5 = p051j4.C9195n.f17011a     // Catch:{ all -> 0x0182 }
                java.lang.Object r2 = r5.get(r2)     // Catch:{ all -> 0x0182 }
                java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0182 }
                int r2 = r2.intValue()     // Catch:{ all -> 0x0182 }
                r4.setImageResource(r2)     // Catch:{ all -> 0x0182 }
                android.widget.TextView r2 = r12.f11123b     // Catch:{ all -> 0x0182 }
                java.lang.String r4 = r1.mo35453t()     // Catch:{ all -> 0x0182 }
                r2.setText(r4)     // Catch:{ all -> 0x0182 }
                java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x0182 }
                java.lang.String r4 = "%s：%s"
                r5 = 2
                java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0182 }
                com.yeelight.cherry.ui.activity.PersonalityLightingActivity r7 = com.yeelight.cherry.p141ui.activity.PersonalityLightingActivity.this     // Catch:{ all -> 0x0182 }
                r8 = 2131756035(0x7f100403, float:1.9142966E38)
                java.lang.CharSequence r7 = r7.getText(r8)     // Catch:{ all -> 0x0182 }
                java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0182 }
                r6[r3] = r7     // Catch:{ all -> 0x0182 }
                com.yeelight.yeelib.models.a r7 = r1.mo35436c()     // Catch:{ all -> 0x0182 }
                java.util.List r7 = r7.mo35338h()     // Catch:{ all -> 0x0182 }
                int r7 = r7.size()     // Catch:{ all -> 0x0182 }
                java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0182 }
                r8 = 1
                r6[r8] = r7     // Catch:{ all -> 0x0182 }
                java.lang.String r4 = java.lang.String.format(r2, r4, r6)     // Catch:{ all -> 0x0182 }
                java.lang.String r6 = "%s：%s"
                java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x0182 }
                com.yeelight.cherry.ui.activity.PersonalityLightingActivity r9 = com.yeelight.cherry.p141ui.activity.PersonalityLightingActivity.this     // Catch:{ all -> 0x0182 }
                r10 = 2131755997(0x7f1003dd, float:1.914289E38)
                java.lang.CharSequence r9 = r9.getText(r10)     // Catch:{ all -> 0x0182 }
                java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0182 }
                r7[r3] = r9     // Catch:{ all -> 0x0182 }
                java.lang.String r9 = r11.m16814d(r1)     // Catch:{ all -> 0x0182 }
                r7[r8] = r9     // Catch:{ all -> 0x0182 }
                java.lang.String r2 = java.lang.String.format(r2, r6, r7)     // Catch:{ all -> 0x0182 }
                android.widget.TextView r6 = r12.f11124c     // Catch:{ all -> 0x0182 }
                r6.setText(r4)     // Catch:{ all -> 0x0182 }
                android.widget.TextView r4 = r12.f11125d     // Catch:{ all -> 0x0182 }
                r4.setText(r2)     // Catch:{ all -> 0x0182 }
                com.yeelight.cherry.ui.activity.PersonalityLightingActivity r2 = com.yeelight.cherry.p141ui.activity.PersonalityLightingActivity.this     // Catch:{ all -> 0x0182 }
                java.util.List<com.yeelight.yeelib.models.CustomAdvancedFlowScene> r2 = r2.f11088c     // Catch:{ all -> 0x0182 }
                int r2 = r2.size()     // Catch:{ all -> 0x0182 }
                int r2 = r2 - r8
                r4 = 4
                if (r13 != r2) goto L_0x009c
                android.widget.TextView r13 = r12.f11131j     // Catch:{ all -> 0x0182 }
                r13.setVisibility(r4)     // Catch:{ all -> 0x0182 }
                goto L_0x00a1
            L_0x009c:
                android.widget.TextView r13 = r12.f11131j     // Catch:{ all -> 0x0182 }
                r13.setVisibility(r3)     // Catch:{ all -> 0x0182 }
            L_0x00a1:
                com.yeelight.cherry.ui.activity.PersonalityLightingActivity r13 = com.yeelight.cherry.p141ui.activity.PersonalityLightingActivity.this     // Catch:{ all -> 0x0182 }
                int r13 = r13.f11092g     // Catch:{ all -> 0x0182 }
                if (r13 != r8) goto L_0x010a
                int[] r13 = com.yeelight.cherry.p141ui.activity.PersonalityLightingActivity.C5567g.f11102a     // Catch:{ all -> 0x0182 }
                com.yeelight.yeelib.models.CustomAdvancedFlowScene$LightMode r2 = r1.mo35295c0()     // Catch:{ all -> 0x0182 }
                int r2 = r2.ordinal()     // Catch:{ all -> 0x0182 }
                r13 = r13[r2]     // Catch:{ all -> 0x0182 }
                if (r13 == r8) goto L_0x00f6
                if (r13 == r5) goto L_0x00e3
                r2 = 3
                if (r13 == r2) goto L_0x00d0
                if (r13 == r4) goto L_0x00bd
                goto L_0x010a
            L_0x00bd:
                com.yeelight.cherry.ui.activity.PersonalityLightingActivity r13 = com.yeelight.cherry.p141ui.activity.PersonalityLightingActivity.this     // Catch:{ all -> 0x0182 }
                com.yeelight.yeelib.device.base.c r13 = r13.f11093h     // Catch:{ all -> 0x0182 }
                com.yeelight.yeelib.device.models.ProductModelBase r13 = r13.mo23188I()     // Catch:{ all -> 0x0182 }
                com.yeelight.yeelib.device.models.ProductModelBase$CapabilityType r2 = com.yeelight.yeelib.device.models.ProductModelBase.CapabilityType.CUSTOM_SCENE_SUSPEND     // Catch:{ all -> 0x0182 }
                boolean r13 = r13.mo31881b(r2)     // Catch:{ all -> 0x0182 }
                if (r13 != 0) goto L_0x010a
                goto L_0x0108
            L_0x00d0:
                com.yeelight.cherry.ui.activity.PersonalityLightingActivity r13 = com.yeelight.cherry.p141ui.activity.PersonalityLightingActivity.this     // Catch:{ all -> 0x0182 }
                com.yeelight.yeelib.device.base.c r13 = r13.f11093h     // Catch:{ all -> 0x0182 }
                com.yeelight.yeelib.device.models.ProductModelBase r13 = r13.mo23188I()     // Catch:{ all -> 0x0182 }
                com.yeelight.yeelib.device.models.ProductModelBase$CapabilityType r2 = com.yeelight.yeelib.device.models.ProductModelBase.CapabilityType.CUSTOM_SCENE_BRIGHT     // Catch:{ all -> 0x0182 }
                boolean r13 = r13.mo31881b(r2)     // Catch:{ all -> 0x0182 }
                if (r13 != 0) goto L_0x010a
                goto L_0x0108
            L_0x00e3:
                com.yeelight.cherry.ui.activity.PersonalityLightingActivity r13 = com.yeelight.cherry.p141ui.activity.PersonalityLightingActivity.this     // Catch:{ all -> 0x0182 }
                com.yeelight.yeelib.device.base.c r13 = r13.f11093h     // Catch:{ all -> 0x0182 }
                com.yeelight.yeelib.device.models.ProductModelBase r13 = r13.mo23188I()     // Catch:{ all -> 0x0182 }
                com.yeelight.yeelib.device.models.ProductModelBase$CapabilityType r2 = com.yeelight.yeelib.device.models.ProductModelBase.CapabilityType.CUSTOM_SCENE_CT     // Catch:{ all -> 0x0182 }
                boolean r13 = r13.mo31881b(r2)     // Catch:{ all -> 0x0182 }
                if (r13 != 0) goto L_0x010a
                goto L_0x0108
            L_0x00f6:
                com.yeelight.cherry.ui.activity.PersonalityLightingActivity r13 = com.yeelight.cherry.p141ui.activity.PersonalityLightingActivity.this     // Catch:{ all -> 0x0182 }
                com.yeelight.yeelib.device.base.c r13 = r13.f11093h     // Catch:{ all -> 0x0182 }
                com.yeelight.yeelib.device.models.ProductModelBase r13 = r13.mo23188I()     // Catch:{ all -> 0x0182 }
                com.yeelight.yeelib.device.models.ProductModelBase$CapabilityType r2 = com.yeelight.yeelib.device.models.ProductModelBase.CapabilityType.CUSTOM_SCENE_COLOR     // Catch:{ all -> 0x0182 }
                boolean r13 = r13.mo31881b(r2)     // Catch:{ all -> 0x0182 }
                if (r13 != 0) goto L_0x010a
            L_0x0108:
                r13 = 0
                goto L_0x010b
            L_0x010a:
                r13 = 1
            L_0x010b:
                if (r13 == 0) goto L_0x012a
                android.widget.TextView r13 = r12.f11126e     // Catch:{ all -> 0x0182 }
                com.yeelight.cherry.ui.activity.PersonalityLightingActivity r2 = com.yeelight.cherry.p141ui.activity.PersonalityLightingActivity.this     // Catch:{ all -> 0x0182 }
                android.content.res.Resources r2 = r2.getResources()     // Catch:{ all -> 0x0182 }
                r4 = 2131230944(0x7f0800e0, float:1.8077955E38)
                android.graphics.drawable.Drawable r2 = r2.getDrawable(r4)     // Catch:{ all -> 0x0182 }
                r13.setBackground(r2)     // Catch:{ all -> 0x0182 }
                android.widget.TextView r13 = r12.f11126e     // Catch:{ all -> 0x0182 }
                com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h$a r2 = new com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h$a     // Catch:{ all -> 0x0182 }
                r2.<init>(r1, r12)     // Catch:{ all -> 0x0182 }
                r13.setOnClickListener(r2)     // Catch:{ all -> 0x0182 }
                goto L_0x0142
            L_0x012a:
                android.widget.TextView r13 = r12.f11126e     // Catch:{ all -> 0x0182 }
                com.yeelight.cherry.ui.activity.PersonalityLightingActivity r2 = com.yeelight.cherry.p141ui.activity.PersonalityLightingActivity.this     // Catch:{ all -> 0x0182 }
                android.content.res.Resources r2 = r2.getResources()     // Catch:{ all -> 0x0182 }
                r4 = 2131230943(0x7f0800df, float:1.8077953E38)
                android.graphics.drawable.Drawable r2 = r2.getDrawable(r4)     // Catch:{ all -> 0x0182 }
                r13.setBackground(r2)     // Catch:{ all -> 0x0182 }
                android.widget.TextView r13 = r12.f11126e     // Catch:{ all -> 0x0182 }
                r2 = 0
                r13.setOnClickListener(r2)     // Catch:{ all -> 0x0182 }
            L_0x0142:
                android.widget.LinearLayout r13 = r12.f11127f     // Catch:{ all -> 0x0182 }
                com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h$b r2 = new com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h$b     // Catch:{ all -> 0x0182 }
                r2.<init>(r12)     // Catch:{ all -> 0x0182 }
                r13.setOnClickListener(r2)     // Catch:{ all -> 0x0182 }
                android.widget.ImageView r13 = r12.f11128g     // Catch:{ all -> 0x0182 }
                com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h$c r2 = new com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h$c     // Catch:{ all -> 0x0182 }
                r2.<init>(r1, r12)     // Catch:{ all -> 0x0182 }
                r13.setOnClickListener(r2)     // Catch:{ all -> 0x0182 }
                android.widget.ImageView r13 = r12.f11129h     // Catch:{ all -> 0x0182 }
                com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h$d r2 = new com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h$d     // Catch:{ all -> 0x0182 }
                r2.<init>(r1)     // Catch:{ all -> 0x0182 }
                r13.setOnClickListener(r2)     // Catch:{ all -> 0x0182 }
                com.yeelight.cherry.ui.activity.PersonalityLightingActivity r13 = com.yeelight.cherry.p141ui.activity.PersonalityLightingActivity.this     // Catch:{ all -> 0x0182 }
                int r13 = r13.f11092g     // Catch:{ all -> 0x0182 }
                if (r13 != 0) goto L_0x017b
                com.chauthai.swipereveallayout.a r13 = r11.f11103a     // Catch:{ all -> 0x0182 }
                com.chauthai.swipereveallayout.SwipeRevealLayout r2 = r12.f11130i     // Catch:{ all -> 0x0182 }
                int r1 = r1.mo35451r()     // Catch:{ all -> 0x0182 }
                java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0182 }
                r13.mo11087d(r2, r1)     // Catch:{ all -> 0x0182 }
                com.chauthai.swipereveallayout.SwipeRevealLayout r12 = r12.f11130i     // Catch:{ all -> 0x0182 }
                r12.mo11062B(r3)     // Catch:{ all -> 0x0182 }
                goto L_0x0180
            L_0x017b:
                com.chauthai.swipereveallayout.SwipeRevealLayout r12 = r12.f11130i     // Catch:{ all -> 0x0182 }
                r12.setLockDrag(r8)     // Catch:{ all -> 0x0182 }
            L_0x0180:
                monitor-exit(r0)     // Catch:{ all -> 0x0182 }
                return
            L_0x0182:
                r12 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0182 }
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.activity.PersonalityLightingActivity.C5568h.onBindViewHolder(com.yeelight.cherry.ui.activity.PersonalityLightingActivity$i, int):void");
        }

        /* renamed from: f */
        public C5579i onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C5579i(PersonalityLightingActivity.this, LayoutInflater.from(viewGroup.getContext()).inflate(2131493154, viewGroup, false));
        }

        public int getItemCount() {
            return PersonalityLightingActivity.this.f11088c.size();
        }

        public long getItemId(int i) {
            return 0;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$i */
    class C5579i extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public ImageView f11122a;

        /* renamed from: b */
        public TextView f11123b;

        /* renamed from: c */
        public TextView f11124c;

        /* renamed from: d */
        public TextView f11125d;

        /* renamed from: e */
        public TextView f11126e;

        /* renamed from: f */
        public LinearLayout f11127f;

        /* renamed from: g */
        public ImageView f11128g;

        /* renamed from: h */
        public ImageView f11129h;

        /* renamed from: i */
        public SwipeRevealLayout f11130i;

        /* renamed from: j */
        public TextView f11131j;

        public C5579i(PersonalityLightingActivity personalityLightingActivity, View view) {
            super(view);
            this.f11122a = (ImageView) view.findViewById(2131297222);
            this.f11123b = (TextView) view.findViewById(2131297221);
            this.f11124c = (TextView) view.findViewById(2131297218);
            this.f11125d = (TextView) view.findViewById(2131297217);
            this.f11126e = (TextView) view.findViewById(2131297055);
            this.f11127f = (LinearLayout) view.findViewById(2131297219);
            this.f11130i = (SwipeRevealLayout) view.findViewById(2131297525);
            this.f11128g = (ImageView) view.findViewById(2131296898);
            this.f11129h = (ImageView) view.findViewById(2131296897);
            this.f11131j = (TextView) view.findViewById(2131296712);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m16800a0(boolean z) {
        C3112v.m8242u().mo23569w(new C5566f(), z);
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m16801b0() {
        Intent intent = new Intent();
        intent.putExtra("image_type", 1);
        intent.setClass(this, ImageModeSelectionActivity.class);
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public void m16802c0() {
        if (this.f11088c.size() <= 0 || !C3051a.m7928z()) {
            this.f11089d.setVisibility(0);
            this.f11090e.setRightButtonVisibility(4);
            this.f11091f.setVisibility(8);
            return;
        }
        this.f11089d.setVisibility(8);
        this.f11091f.setVisibility(0);
        if (this.f11092g == 0) {
            this.f11090e.setRightButtonVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_personality_light);
        this.f11092g = getIntent().getIntExtra("extra_type", 0);
        if (getIntent().hasExtra("com.yeelight.cherry.device_id")) {
            this.f11093h = YeelightDeviceManager.m7804r0(getIntent().getStringExtra("com.yeelight.cherry.device_id"));
        }
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297591);
        this.f11090e = commonTitleBar;
        commonTitleBar.mo36195a(getText(2131756304).toString(), new C5561a(), new C5562b());
        this.f11090e.setTitleTextSize(16);
        if (this.f11092g == 1) {
            this.f11090e.setRightButtonVisibility(8);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.f11090e.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        this.f11089d = (LinearLayout) findViewById(C12225R$id.no_personality_light_layout);
        ((Button) findViewById(C12225R$id.create_light)).setOnClickListener(new C5563c());
        RecyclerView recyclerView = (RecyclerView) findViewById(2131297220);
        this.f11086a = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        C5568h hVar = new C5568h();
        this.f11087b = hVar;
        this.f11086a.setAdapter(hVar);
        this.f11086a.setNestedScrollingEnabled(false);
        this.f11089d.setVisibility(4);
        this.f11091f = (TwinklingRefreshLayout) findViewById(2131297292);
        C8869a aVar = new C8869a(this);
        this.f11091f.setOverScrollRefreshShow(false);
        this.f11091f.setHeaderView(aVar);
        this.f11091f.setEnableLoadmore(false);
        this.f11091f.setEnableOverScroll(true);
        this.f11091f.setOnRefreshListener(new C5564d());
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m16800a0(true);
        C3112v.m8242u().mo23572z();
    }
}
