package com.yeelight.cherry.p177ui.activity;

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
import com.chauthai.swipereveallayout.C1261a;
import com.chauthai.swipereveallayout.SwipeRevealLayout;
import com.lcodecore.tkrefreshlayout.C3392f;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.miot.api.Constants;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p152f.C4201a;
import com.yeelight.yeelib.p152f.C4247u;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C9784e;
import com.yeelight.yeelib.p152f.C9789j;
import com.yeelight.yeelib.p153g.C4300b0;
import com.yeelight.yeelib.p153g.C9830b;
import com.yeelight.yeelib.p153g.C9838i;
import com.yeelight.yeelib.p153g.C9844m;
import com.yeelight.yeelib.p153g.C9849r;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.C10493b;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.widget.C10515b;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.utils.C10547m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity */
public class PersonalityLightingActivity extends BaseActivity {

    /* renamed from: b */
    RecyclerView f11522b;

    /* renamed from: c */
    C5525h f11523c;

    /* renamed from: d */
    List<C9838i> f11524d = new ArrayList();

    /* renamed from: e */
    LinearLayout f11525e;

    /* renamed from: f */
    CommonTitleBar f11526f;

    /* renamed from: g */
    TwinklingRefreshLayout f11527g;

    /* renamed from: h */
    int f11528h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C4198d f11529i;

    /* renamed from: j */
    C10515b.C10517b f11530j = null;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Handler f11531k = new C5522e();

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$a */
    class C5518a implements View.OnClickListener {
        C5518a() {
        }

        public void onClick(View view) {
            PersonalityLightingActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$b */
    class C5519b implements View.OnClickListener {
        C5519b() {
        }

        public void onClick(View view) {
            PersonalityLightingActivity.this.m16825b0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$c */
    class C5520c implements View.OnClickListener {
        C5520c() {
        }

        public void onClick(View view) {
            PersonalityLightingActivity.this.m16825b0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$d */
    class C5521d extends C3392f {
        C5521d() {
        }

        /* renamed from: a */
        public void mo18610a(TwinklingRefreshLayout twinklingRefreshLayout) {
        }

        /* renamed from: e */
        public void mo18615e(TwinklingRefreshLayout twinklingRefreshLayout) {
            PersonalityLightingActivity personalityLightingActivity;
            boolean z;
            if (C9784e.m23711b().mo31628d()) {
                personalityLightingActivity = PersonalityLightingActivity.this;
                z = false;
            } else {
                personalityLightingActivity = PersonalityLightingActivity.this;
                z = true;
            }
            personalityLightingActivity.m16824a0(z);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$e */
    class C5522e extends Handler {
        C5522e() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0) {
                PersonalityLightingActivity.this.f11523c.notifyDataSetChanged();
                PersonalityLightingActivity.this.f11527g.mo18609A();
                PersonalityLightingActivity.this.m16826c0();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$f */
    class C5523f implements C4300b0.C4307g {
        C5523f() {
        }

        /* renamed from: a */
        public void mo23766a(String str) {
        }

        /* renamed from: b */
        public /* synthetic */ void mo26778b() {
            synchronized (PersonalityLightingActivity.this.f11524d) {
                PersonalityLightingActivity.this.f11524d.clear();
                PersonalityLightingActivity.this.f11524d.addAll(C4300b0.m12083u().mo23745i());
                PersonalityLightingActivity.this.f11523c.notifyDataSetChanged();
            }
        }

        /* renamed from: f */
        public void mo23767f() {
        }

        /* renamed from: n */
        public void mo23768n(boolean z, List<C9849r> list) {
        }

        public void onRefresh() {
            long j;
            Handler handler;
            PersonalityLightingActivity.this.runOnUiThread(new C5776t1(this));
            if (PersonalityLightingActivity.this.f11531k.hasMessages(0)) {
                PersonalityLightingActivity.this.f11531k.removeMessages(0);
                handler = PersonalityLightingActivity.this.f11531k;
                j = 200;
            } else {
                handler = PersonalityLightingActivity.this.f11531k;
                j = 1000;
            }
            handler.sendEmptyMessageDelayed(0, j);
        }

        /* renamed from: p */
        public void mo23770p(String str) {
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$g */
    static /* synthetic */ class C5524g {

        /* renamed from: a */
        static final /* synthetic */ int[] f11538a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.yeelight.yeelib.g.i$a[] r0 = com.yeelight.yeelib.p153g.C9838i.C9839a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11538a = r0
                com.yeelight.yeelib.g.i$a r1 = com.yeelight.yeelib.p153g.C9838i.C9839a.MODE_COLOR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11538a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.g.i$a r1 = com.yeelight.yeelib.p153g.C9838i.C9839a.MODE_CT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11538a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yeelight.yeelib.g.i$a r1 = com.yeelight.yeelib.p153g.C9838i.C9839a.MODE_BRIGHT_ONLY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f11538a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.yeelight.yeelib.g.i$a r1 = com.yeelight.yeelib.p153g.C9838i.C9839a.MODE_SUSPEND     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.activity.PersonalityLightingActivity.C5524g.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h */
    private class C5525h extends RecyclerView.Adapter<C5536i> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C1261a f11539a;

        /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h$a */
        class C5526a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C9838i f11541a;

            /* renamed from: b */
            final /* synthetic */ C5536i f11542b;

            C5526a(C9838i iVar, C5536i iVar2) {
                this.f11541a = iVar;
                this.f11542b = iVar2;
            }

            public void onClick(View view) {
                if (PersonalityLightingActivity.this.f11528h == 1) {
                    HashMap<String, Object> hashMap = new HashMap<>();
                    hashMap.put("com.yeelight.cherry.device_id", PersonalityLightingActivity.this.getIntent().getStringExtra("com.yeelight.cherry.device_id"));
                    hashMap.put("position", Integer.valueOf(PersonalityLightingActivity.this.getIntent().getIntExtra("position", -1)));
                    hashMap.put("scene", Integer.valueOf(this.f11541a.mo31886r()));
                    hashMap.put("scene_name", this.f11541a.mo31885q());
                    hashMap.put(Constants.EXTRA_PUSH_COMMAND, this.f11541a.mo31743a().toString());
                    C4247u.f7379i = hashMap;
                    PersonalityLightingActivity.this.finish();
                    return;
                }
                Intent intent = new Intent(PersonalityLightingActivity.this, PersonalityLightPreviewActivity.class);
                intent.putExtra("custom_scene_index", this.f11542b.getAdapterPosition());
                PersonalityLightingActivity.this.startActivity(intent);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h$b */
        class C5527b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C5536i f11544a;

            C5527b(C5536i iVar) {
                this.f11544a = iVar;
            }

            public void onClick(View view) {
                if (PersonalityLightingActivity.this.f11528h == 0) {
                    Intent intent = new Intent(PersonalityLightingActivity.this, PersonalityLightEditActivity.class);
                    intent.putExtra("custom_scene_index", this.f11544a.getAdapterPosition());
                    PersonalityLightingActivity.this.startActivity(intent);
                }
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h$c */
        class C5528c implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C9838i f11546a;

            /* renamed from: b */
            final /* synthetic */ C5536i f11547b;

            /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h$c$a */
            class C5529a implements DialogInterface.OnClickListener {

                /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h$c$a$a */
                class C5530a implements C4300b0.C4307g {
                    C5530a(C5529a aVar) {
                    }

                    /* renamed from: a */
                    public void mo23766a(String str) {
                    }

                    /* renamed from: f */
                    public void mo23767f() {
                    }

                    /* renamed from: n */
                    public void mo23768n(boolean z, List<C9849r> list) {
                    }

                    public void onRefresh() {
                    }

                    /* renamed from: p */
                    public void mo23770p(String str) {
                    }
                }

                C5529a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    C4300b0.m12083u().mo23742f(C5528c.this.f11546a, new C5530a(this));
                    dialogInterface.dismiss();
                    C5525h.this.f11539a.mo10110e(String.valueOf(C5528c.this.f11546a.mo31886r()));
                    int adapterPosition = C5528c.this.f11547b.getAdapterPosition();
                    if (adapterPosition > 0) {
                        PersonalityLightingActivity.this.f11524d.remove(adapterPosition);
                    }
                    C5525h.this.notifyDataSetChanged();
                    PersonalityLightingActivity.this.m16826c0();
                }
            }

            C5528c(C9838i iVar, C5536i iVar2) {
                this.f11546a = iVar;
                this.f11547b = iVar2;
            }

            public void onClick(View view) {
                C10526e.C10531e eVar = new C10526e.C10531e(view.getContext());
                eVar.mo33358i(PersonalityLightingActivity.this.getString(2131755244));
                eVar.mo33356g(PersonalityLightingActivity.this.getString(2131756016));
                eVar.mo33353d(-2, PersonalityLightingActivity.this.getString(2131755229), (DialogInterface.OnClickListener) null);
                eVar.mo33353d(-1, PersonalityLightingActivity.this.getString(2131755277), new C5529a());
                eVar.mo33359j();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h$d */
        class C5531d implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C9838i f11550a;

            /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h$d$a */
            class C5532a implements Runnable {
                C5532a() {
                }

                public void run() {
                    C5525h.this.m16839h();
                }
            }

            /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h$d$b */
            class C5533b implements C9789j.C9792c {
                C5533b() {
                }

                /* renamed from: a */
                public void mo26711a(String str) {
                    PersonalityLightingActivity.this.runOnUiThread(new C5784v1(this));
                }

                /* renamed from: b */
                public void mo26712b(String str) {
                    PersonalityLightingActivity.this.runOnUiThread(new C5780u1(this, str));
                }

                /* renamed from: c */
                public /* synthetic */ void mo26787c() {
                    PersonalityLightingActivity.this.f11530j.mo33281b(2, "");
                }

                /* renamed from: d */
                public /* synthetic */ void mo26788d(String str) {
                    PersonalityLightingActivity.this.f11530j.mo33281b(1, "");
                    C5525h.this.m16838g(str);
                }
            }

            C5531d(C9838i iVar) {
                this.f11550a = iVar;
            }

            public void onClick(View view) {
                PersonalityLightingActivity.this.runOnUiThread(new C5532a());
                C9789j.m23734b().mo31645c(this.f11550a.mo31886r(), new C5533b());
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h$e */
        class C5534e implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ String f11554a;

            /* renamed from: b */
            final /* synthetic */ AlertDialog f11555b;

            C5534e(String str, AlertDialog alertDialog) {
                this.f11554a = str;
                this.f11555b = alertDialog;
            }

            public void onClick(View view) {
                C9789j.m23734b().mo31644a(view.getContext(), String.format(PersonalityLightingActivity.this.getString(2131755809), new Object[]{this.f11554a}));
                Intent intent = new Intent();
                intent.setClass(PersonalityLightingActivity.this, LightShareApplicationActivity.class);
                PersonalityLightingActivity.this.startActivity(intent);
                this.f11555b.dismiss();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h$f */
        class C5535f implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f11557a;

            C5535f(C5525h hVar, AlertDialog alertDialog) {
                this.f11557a = alertDialog;
            }

            public void onClick(View view) {
                this.f11557a.dismiss();
            }
        }

        C5525h() {
            C1261a aVar = new C1261a();
            this.f11539a = aVar;
            aVar.mo10111h(true);
        }

        /* renamed from: d */
        private String m16837d(C9830b bVar) {
            int i = 0;
            for (C9844m c : bVar.mo31871c().mo31723h()) {
                i += c.mo31788c();
            }
            int i2 = i / 86400000;
            return String.format(Locale.US, "%02d:%02d:%02d.%d", new Object[]{Integer.valueOf((i % 86400000) / 3600000), Integer.valueOf((i % 3600000) / 60000), Integer.valueOf((i % 60000) / 1000), Integer.valueOf((i % 1000) / 100)});
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public void m16838g(String str) {
            View inflate = View.inflate(PersonalityLightingActivity.this, C11748R$layout.light_share_tag_dialog_layout, (ViewGroup) null);
            inflate.setLayerType(1, (Paint) null);
            ((TextView) inflate.findViewById(C11745R$id.view_share_text)).setText(str);
            AlertDialog create = new AlertDialog.Builder(PersonalityLightingActivity.this, 2131820937).create();
            inflate.findViewById(C11745R$id.dialog_btn_down).setOnClickListener(new C5534e(str, create));
            inflate.findViewById(C11745R$id.view_close_dialog).setOnClickListener(new C5535f(this, create));
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
        public void m16839h() {
            PersonalityLightingActivity personalityLightingActivity = PersonalityLightingActivity.this;
            personalityLightingActivity.f11530j = new C10515b.C10517b(personalityLightingActivity);
            PersonalityLightingActivity personalityLightingActivity2 = PersonalityLightingActivity.this;
            personalityLightingActivity2.f11530j.mo33281b(0, personalityLightingActivity2.getString(2131755513));
            PersonalityLightingActivity.this.f11530j.mo33283d();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0108, code lost:
            if (com.yeelight.cherry.p177ui.activity.PersonalityLightingActivity.m16823Z(r11.f11540b).mo23375I().mo29076b(com.yeelight.yeelib.device.models.C7628j.C7630b.CUSTOM_SCENE_COLOR) == false) goto L_0x010a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x010f  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x012c  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0168  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x017d  */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onBindViewHolder(com.yeelight.cherry.p177ui.activity.PersonalityLightingActivity.C5536i r12, int r13) {
            /*
                r11 = this;
                com.yeelight.cherry.ui.activity.PersonalityLightingActivity r0 = com.yeelight.cherry.p177ui.activity.PersonalityLightingActivity.this
                java.util.List<com.yeelight.yeelib.g.i> r0 = r0.f11524d
                monitor-enter(r0)
                com.yeelight.cherry.ui.activity.PersonalityLightingActivity r1 = com.yeelight.cherry.p177ui.activity.PersonalityLightingActivity.this     // Catch:{ all -> 0x0184 }
                java.util.List<com.yeelight.yeelib.g.i> r1 = r1.f11524d     // Catch:{ all -> 0x0184 }
                java.lang.Object r1 = r1.get(r13)     // Catch:{ all -> 0x0184 }
                com.yeelight.yeelib.g.i r1 = (com.yeelight.yeelib.p153g.C9838i) r1     // Catch:{ all -> 0x0184 }
                int r2 = r1.mo31761d0()     // Catch:{ all -> 0x0184 }
                r3 = 0
                if (r2 <= 0) goto L_0x001b
                int r2 = r1.mo31761d0()     // Catch:{ all -> 0x0184 }
                goto L_0x001c
            L_0x001b:
                r2 = 0
            L_0x001c:
                android.widget.ImageView r4 = r12.f11558a     // Catch:{ all -> 0x0184 }
                java.util.List<java.lang.Integer> r5 = com.yeelight.yeelib.utils.C10549p.f20166a     // Catch:{ all -> 0x0184 }
                java.lang.Object r2 = r5.get(r2)     // Catch:{ all -> 0x0184 }
                java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0184 }
                int r2 = r2.intValue()     // Catch:{ all -> 0x0184 }
                r4.setImageResource(r2)     // Catch:{ all -> 0x0184 }
                android.widget.TextView r2 = r12.f11559b     // Catch:{ all -> 0x0184 }
                java.lang.String r4 = r1.mo31888t()     // Catch:{ all -> 0x0184 }
                r2.setText(r4)     // Catch:{ all -> 0x0184 }
                java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x0184 }
                java.lang.String r4 = "%s：%s"
                r5 = 2
                java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0184 }
                com.yeelight.cherry.ui.activity.PersonalityLightingActivity r7 = com.yeelight.cherry.p177ui.activity.PersonalityLightingActivity.this     // Catch:{ all -> 0x0184 }
                r8 = 2131756023(0x7f1003f7, float:1.9142942E38)
                java.lang.CharSequence r7 = r7.getText(r8)     // Catch:{ all -> 0x0184 }
                java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0184 }
                r6[r3] = r7     // Catch:{ all -> 0x0184 }
                com.yeelight.yeelib.g.a r7 = r1.mo31871c()     // Catch:{ all -> 0x0184 }
                java.util.List r7 = r7.mo31723h()     // Catch:{ all -> 0x0184 }
                int r7 = r7.size()     // Catch:{ all -> 0x0184 }
                java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0184 }
                r8 = 1
                r6[r8] = r7     // Catch:{ all -> 0x0184 }
                java.lang.String r2 = java.lang.String.format(r2, r4, r6)     // Catch:{ all -> 0x0184 }
                java.util.Locale r4 = java.util.Locale.US     // Catch:{ all -> 0x0184 }
                java.lang.String r6 = "%s：%s"
                java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x0184 }
                com.yeelight.cherry.ui.activity.PersonalityLightingActivity r9 = com.yeelight.cherry.p177ui.activity.PersonalityLightingActivity.this     // Catch:{ all -> 0x0184 }
                r10 = 2131755985(0x7f1003d1, float:1.9142865E38)
                java.lang.CharSequence r9 = r9.getText(r10)     // Catch:{ all -> 0x0184 }
                java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0184 }
                r7[r3] = r9     // Catch:{ all -> 0x0184 }
                java.lang.String r9 = r11.m16837d(r1)     // Catch:{ all -> 0x0184 }
                r7[r8] = r9     // Catch:{ all -> 0x0184 }
                java.lang.String r4 = java.lang.String.format(r4, r6, r7)     // Catch:{ all -> 0x0184 }
                android.widget.TextView r6 = r12.f11560c     // Catch:{ all -> 0x0184 }
                r6.setText(r2)     // Catch:{ all -> 0x0184 }
                android.widget.TextView r2 = r12.f11561d     // Catch:{ all -> 0x0184 }
                r2.setText(r4)     // Catch:{ all -> 0x0184 }
                com.yeelight.cherry.ui.activity.PersonalityLightingActivity r2 = com.yeelight.cherry.p177ui.activity.PersonalityLightingActivity.this     // Catch:{ all -> 0x0184 }
                java.util.List<com.yeelight.yeelib.g.i> r2 = r2.f11524d     // Catch:{ all -> 0x0184 }
                int r2 = r2.size()     // Catch:{ all -> 0x0184 }
                int r2 = r2 - r8
                r4 = 4
                if (r13 != r2) goto L_0x009e
                android.widget.TextView r13 = r12.f11567j     // Catch:{ all -> 0x0184 }
                r13.setVisibility(r4)     // Catch:{ all -> 0x0184 }
                goto L_0x00a3
            L_0x009e:
                android.widget.TextView r13 = r12.f11567j     // Catch:{ all -> 0x0184 }
                r13.setVisibility(r3)     // Catch:{ all -> 0x0184 }
            L_0x00a3:
                com.yeelight.cherry.ui.activity.PersonalityLightingActivity r13 = com.yeelight.cherry.p177ui.activity.PersonalityLightingActivity.this     // Catch:{ all -> 0x0184 }
                int r13 = r13.f11528h     // Catch:{ all -> 0x0184 }
                if (r13 != r8) goto L_0x010c
                int[] r13 = com.yeelight.cherry.p177ui.activity.PersonalityLightingActivity.C5524g.f11538a     // Catch:{ all -> 0x0184 }
                com.yeelight.yeelib.g.i$a r2 = r1.mo31760c0()     // Catch:{ all -> 0x0184 }
                int r2 = r2.ordinal()     // Catch:{ all -> 0x0184 }
                r13 = r13[r2]     // Catch:{ all -> 0x0184 }
                if (r13 == r8) goto L_0x00f8
                if (r13 == r5) goto L_0x00e5
                r2 = 3
                if (r13 == r2) goto L_0x00d2
                if (r13 == r4) goto L_0x00bf
                goto L_0x010c
            L_0x00bf:
                com.yeelight.cherry.ui.activity.PersonalityLightingActivity r13 = com.yeelight.cherry.p177ui.activity.PersonalityLightingActivity.this     // Catch:{ all -> 0x0184 }
                com.yeelight.yeelib.c.i.d r13 = r13.f11529i     // Catch:{ all -> 0x0184 }
                com.yeelight.yeelib.device.models.j r13 = r13.mo23375I()     // Catch:{ all -> 0x0184 }
                com.yeelight.yeelib.device.models.j$b r2 = com.yeelight.yeelib.device.models.C7628j.C7630b.CUSTOM_SCENE_SUSPEND     // Catch:{ all -> 0x0184 }
                boolean r13 = r13.mo29076b(r2)     // Catch:{ all -> 0x0184 }
                if (r13 != 0) goto L_0x010c
                goto L_0x010a
            L_0x00d2:
                com.yeelight.cherry.ui.activity.PersonalityLightingActivity r13 = com.yeelight.cherry.p177ui.activity.PersonalityLightingActivity.this     // Catch:{ all -> 0x0184 }
                com.yeelight.yeelib.c.i.d r13 = r13.f11529i     // Catch:{ all -> 0x0184 }
                com.yeelight.yeelib.device.models.j r13 = r13.mo23375I()     // Catch:{ all -> 0x0184 }
                com.yeelight.yeelib.device.models.j$b r2 = com.yeelight.yeelib.device.models.C7628j.C7630b.CUSTOM_SCENE_BRIGHT     // Catch:{ all -> 0x0184 }
                boolean r13 = r13.mo29076b(r2)     // Catch:{ all -> 0x0184 }
                if (r13 != 0) goto L_0x010c
                goto L_0x010a
            L_0x00e5:
                com.yeelight.cherry.ui.activity.PersonalityLightingActivity r13 = com.yeelight.cherry.p177ui.activity.PersonalityLightingActivity.this     // Catch:{ all -> 0x0184 }
                com.yeelight.yeelib.c.i.d r13 = r13.f11529i     // Catch:{ all -> 0x0184 }
                com.yeelight.yeelib.device.models.j r13 = r13.mo23375I()     // Catch:{ all -> 0x0184 }
                com.yeelight.yeelib.device.models.j$b r2 = com.yeelight.yeelib.device.models.C7628j.C7630b.CUSTOM_SCENE_CT     // Catch:{ all -> 0x0184 }
                boolean r13 = r13.mo29076b(r2)     // Catch:{ all -> 0x0184 }
                if (r13 != 0) goto L_0x010c
                goto L_0x010a
            L_0x00f8:
                com.yeelight.cherry.ui.activity.PersonalityLightingActivity r13 = com.yeelight.cherry.p177ui.activity.PersonalityLightingActivity.this     // Catch:{ all -> 0x0184 }
                com.yeelight.yeelib.c.i.d r13 = r13.f11529i     // Catch:{ all -> 0x0184 }
                com.yeelight.yeelib.device.models.j r13 = r13.mo23375I()     // Catch:{ all -> 0x0184 }
                com.yeelight.yeelib.device.models.j$b r2 = com.yeelight.yeelib.device.models.C7628j.C7630b.CUSTOM_SCENE_COLOR     // Catch:{ all -> 0x0184 }
                boolean r13 = r13.mo29076b(r2)     // Catch:{ all -> 0x0184 }
                if (r13 != 0) goto L_0x010c
            L_0x010a:
                r13 = 0
                goto L_0x010d
            L_0x010c:
                r13 = 1
            L_0x010d:
                if (r13 == 0) goto L_0x012c
                android.widget.TextView r13 = r12.f11562e     // Catch:{ all -> 0x0184 }
                com.yeelight.cherry.ui.activity.PersonalityLightingActivity r2 = com.yeelight.cherry.p177ui.activity.PersonalityLightingActivity.this     // Catch:{ all -> 0x0184 }
                android.content.res.Resources r2 = r2.getResources()     // Catch:{ all -> 0x0184 }
                r4 = 2131230930(0x7f0800d2, float:1.8077927E38)
                android.graphics.drawable.Drawable r2 = r2.getDrawable(r4)     // Catch:{ all -> 0x0184 }
                r13.setBackground(r2)     // Catch:{ all -> 0x0184 }
                android.widget.TextView r13 = r12.f11562e     // Catch:{ all -> 0x0184 }
                com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h$a r2 = new com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h$a     // Catch:{ all -> 0x0184 }
                r2.<init>(r1, r12)     // Catch:{ all -> 0x0184 }
                r13.setOnClickListener(r2)     // Catch:{ all -> 0x0184 }
                goto L_0x0144
            L_0x012c:
                android.widget.TextView r13 = r12.f11562e     // Catch:{ all -> 0x0184 }
                com.yeelight.cherry.ui.activity.PersonalityLightingActivity r2 = com.yeelight.cherry.p177ui.activity.PersonalityLightingActivity.this     // Catch:{ all -> 0x0184 }
                android.content.res.Resources r2 = r2.getResources()     // Catch:{ all -> 0x0184 }
                r4 = 2131230929(0x7f0800d1, float:1.8077925E38)
                android.graphics.drawable.Drawable r2 = r2.getDrawable(r4)     // Catch:{ all -> 0x0184 }
                r13.setBackground(r2)     // Catch:{ all -> 0x0184 }
                android.widget.TextView r13 = r12.f11562e     // Catch:{ all -> 0x0184 }
                r2 = 0
                r13.setOnClickListener(r2)     // Catch:{ all -> 0x0184 }
            L_0x0144:
                android.widget.LinearLayout r13 = r12.f11563f     // Catch:{ all -> 0x0184 }
                com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h$b r2 = new com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h$b     // Catch:{ all -> 0x0184 }
                r2.<init>(r12)     // Catch:{ all -> 0x0184 }
                r13.setOnClickListener(r2)     // Catch:{ all -> 0x0184 }
                android.widget.ImageView r13 = r12.f11564g     // Catch:{ all -> 0x0184 }
                com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h$c r2 = new com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h$c     // Catch:{ all -> 0x0184 }
                r2.<init>(r1, r12)     // Catch:{ all -> 0x0184 }
                r13.setOnClickListener(r2)     // Catch:{ all -> 0x0184 }
                android.widget.ImageView r13 = r12.f11565h     // Catch:{ all -> 0x0184 }
                com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h$d r2 = new com.yeelight.cherry.ui.activity.PersonalityLightingActivity$h$d     // Catch:{ all -> 0x0184 }
                r2.<init>(r1)     // Catch:{ all -> 0x0184 }
                r13.setOnClickListener(r2)     // Catch:{ all -> 0x0184 }
                com.yeelight.cherry.ui.activity.PersonalityLightingActivity r13 = com.yeelight.cherry.p177ui.activity.PersonalityLightingActivity.this     // Catch:{ all -> 0x0184 }
                int r13 = r13.f11528h     // Catch:{ all -> 0x0184 }
                if (r13 != 0) goto L_0x017d
                com.chauthai.swipereveallayout.a r13 = r11.f11539a     // Catch:{ all -> 0x0184 }
                com.chauthai.swipereveallayout.SwipeRevealLayout r2 = r12.f11566i     // Catch:{ all -> 0x0184 }
                int r1 = r1.mo31886r()     // Catch:{ all -> 0x0184 }
                java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0184 }
                r13.mo10109d(r2, r1)     // Catch:{ all -> 0x0184 }
                com.chauthai.swipereveallayout.SwipeRevealLayout r12 = r12.f11566i     // Catch:{ all -> 0x0184 }
                r12.mo10084B(r3)     // Catch:{ all -> 0x0184 }
                goto L_0x0182
            L_0x017d:
                com.chauthai.swipereveallayout.SwipeRevealLayout r12 = r12.f11566i     // Catch:{ all -> 0x0184 }
                r12.setLockDrag(r8)     // Catch:{ all -> 0x0184 }
            L_0x0182:
                monitor-exit(r0)     // Catch:{ all -> 0x0184 }
                return
            L_0x0184:
                r12 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0184 }
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.activity.PersonalityLightingActivity.C5525h.onBindViewHolder(com.yeelight.cherry.ui.activity.PersonalityLightingActivity$i, int):void");
        }

        /* renamed from: f */
        public C5536i onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C5536i(PersonalityLightingActivity.this, LayoutInflater.from(viewGroup.getContext()).inflate(2131493150, viewGroup, false));
        }

        public int getItemCount() {
            return PersonalityLightingActivity.this.f11524d.size();
        }

        public long getItemId(int i) {
            return 0;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightingActivity$i */
    class C5536i extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public ImageView f11558a;

        /* renamed from: b */
        public TextView f11559b;

        /* renamed from: c */
        public TextView f11560c;

        /* renamed from: d */
        public TextView f11561d;

        /* renamed from: e */
        public TextView f11562e;

        /* renamed from: f */
        public LinearLayout f11563f;

        /* renamed from: g */
        public ImageView f11564g;

        /* renamed from: h */
        public ImageView f11565h;

        /* renamed from: i */
        public SwipeRevealLayout f11566i;

        /* renamed from: j */
        public TextView f11567j;

        public C5536i(PersonalityLightingActivity personalityLightingActivity, View view) {
            super(view);
            this.f11558a = (ImageView) view.findViewById(2131297091);
            this.f11559b = (TextView) view.findViewById(2131297090);
            this.f11560c = (TextView) view.findViewById(2131297087);
            this.f11561d = (TextView) view.findViewById(2131297086);
            this.f11562e = (TextView) view.findViewById(2131296943);
            this.f11563f = (LinearLayout) view.findViewById(2131297088);
            this.f11566i = (SwipeRevealLayout) view.findViewById(2131297369);
            this.f11564g = (ImageView) view.findViewById(2131296794);
            this.f11565h = (ImageView) view.findViewById(2131296793);
            this.f11567j = (TextView) view.findViewById(2131296630);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m16824a0(boolean z) {
        C4300b0.m12083u().mo23756w(new C5523f(), z);
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m16825b0() {
        Intent intent = new Intent();
        intent.putExtra("image_type", 1);
        intent.setClass(this, ImageModeSelectionActivity.class);
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public void m16826c0() {
        if (this.f11524d.size() <= 0 || !C4201a.m11610z()) {
            this.f11525e.setVisibility(0);
            this.f11526f.setRightButtonVisibility(4);
            this.f11527g.setVisibility(8);
            return;
        }
        this.f11525e.setVisibility(8);
        this.f11527g.setVisibility(0);
        if (this.f11528h == 0) {
            this.f11526f.setRightButtonVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_personality_light);
        this.f11528h = getIntent().getIntExtra("extra_type", 0);
        if (getIntent().hasExtra("com.yeelight.cherry.device_id")) {
            this.f11529i = C4257w.m11953o0(getIntent().getStringExtra("com.yeelight.cherry.device_id"));
        }
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297424);
        this.f11526f = commonTitleBar;
        commonTitleBar.mo32825a(getText(2131756275).toString(), new C5518a(), new C5519b());
        this.f11526f.setTitleTextSize(16);
        if (this.f11528h == 1) {
            this.f11526f.setRightButtonVisibility(8);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.f11526f.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        this.f11525e = (LinearLayout) findViewById(C11745R$id.no_personality_light_layout);
        ((Button) findViewById(C11745R$id.create_light)).setOnClickListener(new C5520c());
        RecyclerView recyclerView = (RecyclerView) findViewById(2131297089);
        this.f11522b = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        C5525h hVar = new C5525h();
        this.f11523c = hVar;
        this.f11522b.setAdapter(hVar);
        this.f11522b.setNestedScrollingEnabled(false);
        this.f11525e.setVisibility(4);
        this.f11527g = (TwinklingRefreshLayout) findViewById(2131297152);
        C10493b bVar = new C10493b(this);
        this.f11527g.setOverScrollRefreshShow(false);
        this.f11527g.setHeaderView(bVar);
        this.f11527g.setEnableLoadmore(false);
        this.f11527g.setEnableOverScroll(true);
        this.f11527g.setOnRefreshListener(new C5521d());
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m16824a0(true);
        C4300b0.m12083u().mo23759z();
    }
}
