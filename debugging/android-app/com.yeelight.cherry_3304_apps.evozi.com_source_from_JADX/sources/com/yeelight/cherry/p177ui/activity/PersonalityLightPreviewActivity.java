package com.yeelight.cherry.p177ui.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p153g.C4300b0;
import com.yeelight.yeelib.p153g.C9838i;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.utils.C10547m;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity */
public class PersonalityLightPreviewActivity extends BaseActivity implements C9770e {

    /* renamed from: b */
    C5486e f11443b;

    /* renamed from: c */
    List<C6006h> f11444c = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C9838i f11445d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C9838i.C9839a f11446e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f11447f;

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity$a */
    class C5482a implements View.OnClickListener {
        C5482a() {
        }

        public void onClick(View view) {
            PersonalityLightPreviewActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity$b */
    class C5483b implements Runnable {
        C5483b() {
        }

        public void run() {
            PersonalityLightPreviewActivity.this.f11443b.notifyDataSetChanged();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity$c */
    class C5484c implements Runnable {
        C5484c() {
        }

        public void run() {
            PersonalityLightPreviewActivity.this.f11443b.notifyDataSetChanged();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity$d */
    static /* synthetic */ class C5485d {

        /* renamed from: a */
        static final /* synthetic */ int[] f11451a;

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
                f11451a = r0
                com.yeelight.yeelib.g.i$a r1 = com.yeelight.yeelib.p153g.C9838i.C9839a.MODE_BRIGHT_ONLY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11451a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.g.i$a r1 = com.yeelight.yeelib.p153g.C9838i.C9839a.MODE_CT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11451a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yeelight.yeelib.g.i$a r1 = com.yeelight.yeelib.p153g.C9838i.C9839a.MODE_COLOR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f11451a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.yeelight.yeelib.g.i$a r1 = com.yeelight.yeelib.p153g.C9838i.C9839a.MODE_SUSPEND     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.activity.PersonalityLightPreviewActivity.C5485d.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity$e */
    private class C5486e extends BaseAdapter {

        /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity$e$a */
        class C5487a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C5489f f11453a;

            /* renamed from: b */
            final /* synthetic */ C6006h f11454b;

            /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity$e$a$a */
            class C5488a implements DialogInterface.OnClickListener {
                C5488a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    C5487a aVar = C5487a.this;
                    aVar.f11453a.f11461e = true;
                    aVar.f11454b.mo23355x1(PersonalityLightPreviewActivity.this.f11445d);
                    dialogInterface.dismiss();
                }
            }

            C5487a(C5489f fVar, C6006h hVar) {
                this.f11453a = fVar;
                this.f11454b = hVar;
            }

            public void onClick(View view) {
                String str;
                String str2;
                if (this.f11453a.f11460d.isEnabled()) {
                    if (PersonalityLightPreviewActivity.this.f11447f) {
                        str = PersonalityLightPreviewActivity.this.getResources().getString(2131756032);
                        str2 = String.format(Locale.US, PersonalityLightPreviewActivity.this.getResources().getString(2131756030), new Object[]{this.f11454b.mo23397U()});
                    } else {
                        str = PersonalityLightPreviewActivity.this.getResources().getString(2131755997);
                        str2 = String.format(Locale.US, PersonalityLightPreviewActivity.this.getResources().getString(2131755995), new Object[]{this.f11454b.mo23397U()});
                    }
                    C10526e.C10531e eVar = new C10526e.C10531e(PersonalityLightPreviewActivity.this);
                    eVar.mo33358i(str);
                    eVar.mo33356g(str2);
                    eVar.mo33352c(this.f11454b.mo23303F());
                    eVar.mo33353d(-2, PersonalityLightPreviewActivity.this.getResources().getString(2131755229), (DialogInterface.OnClickListener) null);
                    eVar.mo33353d(-1, PersonalityLightPreviewActivity.this.getResources().getString(2131755277), new C5488a());
                    eVar.mo33351b().show();
                }
            }
        }

        private C5486e() {
        }

        /* synthetic */ C5486e(PersonalityLightPreviewActivity personalityLightPreviewActivity, C5482a aVar) {
            this();
        }

        /* renamed from: a */
        private void m16781a(C5489f fVar) {
            fVar.f11458b.setTextColor(PersonalityLightPreviewActivity.this.getResources().getColor(2131099836));
            fVar.f11459c.setTextColor(PersonalityLightPreviewActivity.this.getResources().getColor(2131099836));
            fVar.f11459c.setText(2131756029);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0059, code lost:
            if (r4.mo23332k1() != false) goto L_0x0068;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0062, code lost:
            if (r4.mo23332k1() != false) goto L_0x0068;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m16782b(com.yeelight.yeelib.p150c.C6006h r4, com.yeelight.cherry.p177ui.activity.PersonalityLightPreviewActivity.C5489f r5) {
            /*
                r3 = this;
                android.widget.TextView r0 = r5.f11458b
                com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity r1 = com.yeelight.cherry.p177ui.activity.PersonalityLightPreviewActivity.this
                android.content.res.Resources r1 = r1.getResources()
                r2 = 2131099837(0x7f0600bd, float:1.7812038E38)
                int r1 = r1.getColor(r2)
                r0.setTextColor(r1)
                android.widget.TextView r0 = r5.f11459c
                com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity r1 = com.yeelight.cherry.p177ui.activity.PersonalityLightPreviewActivity.this
                android.content.res.Resources r1 = r1.getResources()
                r2 = 2131099838(0x7f0600be, float:1.781204E38)
                int r1 = r1.getColor(r2)
                r0.setTextColor(r1)
                boolean r0 = r5.f11461e
                r1 = 2131755324(0x7f10013c, float:1.9141524E38)
                r2 = 2131755322(0x7f10013a, float:1.914152E38)
                if (r0 == 0) goto L_0x005c
                com.yeelight.yeelib.c.i.e r0 = r4.mo23408d0()
                boolean r0 = r0.mo27661R()
                if (r0 == 0) goto L_0x0053
                android.widget.TextView r4 = r5.f11459c
                r0 = 2131756022(0x7f1003f6, float:1.914294E38)
                r4.setText(r0)
                android.widget.TextView r4 = r5.f11459c
                com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity r0 = com.yeelight.cherry.p177ui.activity.PersonalityLightPreviewActivity.this
                android.content.res.Resources r0 = r0.getResources()
                r1 = 2131099802(0x7f06009a, float:1.7811967E38)
                int r0 = r0.getColor(r1)
                r4.setTextColor(r0)
                goto L_0x006b
            L_0x0053:
                android.widget.TextView r0 = r5.f11459c
                boolean r4 = r4.mo23332k1()
                if (r4 == 0) goto L_0x0065
                goto L_0x0068
            L_0x005c:
                android.widget.TextView r0 = r5.f11459c
                boolean r4 = r4.mo23332k1()
                if (r4 == 0) goto L_0x0065
                goto L_0x0068
            L_0x0065:
                r1 = 2131755322(0x7f10013a, float:1.914152E38)
            L_0x0068:
                r0.setText(r1)
            L_0x006b:
                android.widget.LinearLayout r4 = r5.f11460d
                r5 = 1
                r4.setEnabled(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.activity.PersonalityLightPreviewActivity.C5486e.m16782b(com.yeelight.yeelib.c.h, com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity$f):void");
        }

        /* renamed from: c */
        private void m16783c(C6006h hVar, C5489f fVar) {
            fVar.f11458b.setTextColor(PersonalityLightPreviewActivity.this.getResources().getColor(2131099836));
            fVar.f11459c.setTextColor(PersonalityLightPreviewActivity.this.getResources().getColor(2131099836));
            fVar.f11459c.setText(2131756034);
        }

        public int getCount() {
            return PersonalityLightPreviewActivity.this.f11444c.size();
        }

        public Object getItem(int i) {
            return PersonalityLightPreviewActivity.this.f11444c.get(i);
        }

        public long getItemId(int i) {
            return 0;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:171:0x0324, code lost:
            if (r1.equals("yeelink.light.mono1") != false) goto L_0x044b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:249:0x044e, code lost:
            m16783c(r11, r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:253:0x0467, code lost:
            if (r11.mo23415n0(31) != false) goto L_0x0485;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:260:0x0485, code lost:
            m16782b(r11, r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:262:0x048d, code lost:
            if (r11.mo23415n0(31) != false) goto L_0x0485;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:266:0x04a5, code lost:
            if (r11.mo23415n0(31) == false) goto L_0x044e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r11, android.view.View r12, android.view.ViewGroup r13) {
            /*
                r10 = this;
                r0 = 0
                if (r12 == 0) goto L_0x000a
                java.lang.Object r13 = r12.getTag()
                com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity$f r13 = (com.yeelight.cherry.p177ui.activity.PersonalityLightPreviewActivity.C5489f) r13
                goto L_0x0050
            L_0x000a:
                com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity$f r12 = new com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity$f
                r12.<init>()
                android.content.Context r1 = r13.getContext()
                android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
                r2 = 2131493137(0x7f0c0111, float:1.8609746E38)
                android.view.View r13 = r1.inflate(r2, r13, r0)
                r1 = 2131296588(0x7f09014c, float:1.8211097E38)
                android.view.View r1 = r13.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r12.f11457a = r1
                r1 = 2131296589(0x7f09014d, float:1.8211099E38)
                android.view.View r1 = r13.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r12.f11458b = r1
                r1 = 2131296590(0x7f09014e, float:1.82111E38)
                android.view.View r1 = r13.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r12.f11459c = r1
                r1 = 2131297106(0x7f090352, float:1.8212148E38)
                android.view.View r1 = r13.findViewById(r1)
                android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
                r12.f11460d = r1
                r13.setTag(r12)
                r9 = r13
                r13 = r12
                r12 = r9
            L_0x0050:
                com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity r1 = com.yeelight.cherry.p177ui.activity.PersonalityLightPreviewActivity.this
                java.util.List<com.yeelight.yeelib.c.h> r1 = r1.f11444c
                java.lang.Object r11 = r1.get(r11)
                com.yeelight.yeelib.c.h r11 = (com.yeelight.yeelib.p150c.C6006h) r11
                android.widget.ImageView r1 = r13.f11457a
                android.content.Context r2 = r12.getContext()
                int r3 = r11.mo23303F()
                android.graphics.drawable.Drawable r2 = androidx.core.content.ContextCompat.getDrawable(r2, r3)
                r1.setBackground(r2)
                android.widget.TextView r1 = r13.f11459c
                com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity r2 = com.yeelight.cherry.p177ui.activity.PersonalityLightPreviewActivity.this
                android.content.res.Resources r2 = r2.getResources()
                r3 = 2131099838(0x7f0600be, float:1.781204E38)
                int r2 = r2.getColor(r3)
                r1.setTextColor(r2)
                android.widget.TextView r1 = r13.f11458b
                java.lang.String r2 = r11.mo23397U()
                r1.setText(r2)
                android.widget.LinearLayout r1 = r13.f11460d
                r1.setEnabled(r0)
                boolean r1 = r11.mo23416o0()
                if (r1 == 0) goto L_0x04a8
                java.lang.String r1 = r11.mo23395T()
                r2 = -1
                int r3 = r1.hashCode()
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 31
                r8 = 1
                switch(r3) {
                    case -1644531059: goto L_0x043f;
                    case -1462015191: goto L_0x0434;
                    case -1462015190: goto L_0x0429;
                    case -1462015189: goto L_0x041e;
                    case -1462015188: goto L_0x0413;
                    case -1462015187: goto L_0x0408;
                    case -1462015186: goto L_0x03fd;
                    case -1462015185: goto L_0x03f2;
                    case -1462015184: goto L_0x03e7;
                    case -1462015183: goto L_0x03db;
                    case -1462015182: goto L_0x03cf;
                    case -1317475937: goto L_0x03c3;
                    case -1308146488: goto L_0x03b7;
                    case -1063384694: goto L_0x03ab;
                    case -1063384689: goto L_0x039f;
                    case -1063384687: goto L_0x0393;
                    case -1063384685: goto L_0x0387;
                    case -948847040: goto L_0x037c;
                    case -948847038: goto L_0x0370;
                    case -845289553: goto L_0x0364;
                    case -845289551: goto L_0x0358;
                    case -845289508: goto L_0x034c;
                    case -449944724: goto L_0x0340;
                    case -449944723: goto L_0x0334;
                    case -449944722: goto L_0x0328;
                    case -448603205: goto L_0x031e;
                    case -448603204: goto L_0x0313;
                    case -448603202: goto L_0x0308;
                    case -448603201: goto L_0x02fd;
                    case -448603157: goto L_0x02f2;
                    case -448603156: goto L_0x02e7;
                    case 922669543: goto L_0x02db;
                    case 922669544: goto L_0x02d0;
                    case 922669545: goto L_0x02c4;
                    case 922669546: goto L_0x02b8;
                    case 922669547: goto L_0x02ac;
                    case 922669548: goto L_0x02a0;
                    case 922669549: goto L_0x0294;
                    case 922669550: goto L_0x0288;
                    case 1201756974: goto L_0x027c;
                    case 1201757021: goto L_0x0270;
                    case 1623724661: goto L_0x0264;
                    case 1623724662: goto L_0x0258;
                    case 1623724663: goto L_0x024c;
                    default: goto L_0x00a3;
                }
            L_0x00a3:
                switch(r3) {
                    case -1462015160: goto L_0x0240;
                    case -1462015159: goto L_0x0234;
                    case -1462015158: goto L_0x0228;
                    case -1462015157: goto L_0x021c;
                    case -1462015156: goto L_0x0210;
                    default: goto L_0x00a6;
                }
            L_0x00a6:
                switch(r3) {
                    case -1317475940: goto L_0x0204;
                    case -1317475939: goto L_0x01f8;
                    default: goto L_0x00a9;
                }
            L_0x00a9:
                switch(r3) {
                    case -1317475915: goto L_0x01ec;
                    case -1317475914: goto L_0x01e0;
                    case -1317475913: goto L_0x01d4;
                    case -1317475912: goto L_0x01c8;
                    default: goto L_0x00ac;
                }
            L_0x00ac:
                switch(r3) {
                    case -1308146495: goto L_0x01bc;
                    case -1308146494: goto L_0x01b0;
                    case -1308146493: goto L_0x01a4;
                    case -1308146492: goto L_0x0198;
                    case -1308146491: goto L_0x018c;
                    case -1308146490: goto L_0x0180;
                    default: goto L_0x00af;
                }
            L_0x00af:
                switch(r3) {
                    case -1308146447: goto L_0x0174;
                    case -1308146446: goto L_0x0168;
                    case -1308146445: goto L_0x015c;
                    default: goto L_0x00b2;
                }
            L_0x00b2:
                switch(r3) {
                    case -888668266: goto L_0x0150;
                    case -888668265: goto L_0x0144;
                    case -888668264: goto L_0x0138;
                    default: goto L_0x00b5;
                }
            L_0x00b5:
                switch(r3) {
                    case -845289556: goto L_0x012c;
                    case -845289555: goto L_0x0120;
                    default: goto L_0x00b8;
                }
            L_0x00b8:
                switch(r3) {
                    case -458141175: goto L_0x0114;
                    case -458141174: goto L_0x0108;
                    case -458141173: goto L_0x00fc;
                    case -458141172: goto L_0x00f0;
                    default: goto L_0x00bb;
                }
            L_0x00bb:
                switch(r3) {
                    case -449944730: goto L_0x00e4;
                    case -449944729: goto L_0x00d8;
                    case -449944728: goto L_0x00cc;
                    case -449944727: goto L_0x00c0;
                    default: goto L_0x00be;
                }
            L_0x00be:
                goto L_0x044a
            L_0x00c0:
                java.lang.String r0 = "yeelink.light.lamp4"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 51
                goto L_0x044b
            L_0x00cc:
                java.lang.String r0 = "yeelink.light.lamp3"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 8
                goto L_0x044b
            L_0x00d8:
                java.lang.String r0 = "yeelink.light.lamp2"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 56
                goto L_0x044b
            L_0x00e4:
                java.lang.String r0 = "yeelink.light.lamp1"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 50
                goto L_0x044b
            L_0x00f0:
                java.lang.String r0 = "yeelink.light.ceild"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 46
                goto L_0x044b
            L_0x00fc:
                java.lang.String r0 = "yeelink.light.ceilc"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 45
                goto L_0x044b
            L_0x0108:
                java.lang.String r0 = "yeelink.light.ceilb"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 44
                goto L_0x044b
            L_0x0114:
                java.lang.String r0 = "yeelink.light.ceila"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 43
                goto L_0x044b
            L_0x0120:
                java.lang.String r0 = "yeelink.light.strip2"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 69
                goto L_0x044b
            L_0x012c:
                java.lang.String r0 = "yeelink.light.strip1"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 68
                goto L_0x044b
            L_0x0138:
                java.lang.String r0 = "yilai.light.ceiling3"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 49
                goto L_0x044b
            L_0x0144:
                java.lang.String r0 = "yilai.light.ceiling2"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 48
                goto L_0x044b
            L_0x0150:
                java.lang.String r0 = "yilai.light.ceiling1"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 47
                goto L_0x044b
            L_0x015c:
                java.lang.String r0 = "yeelink.light.colorc"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 67
                goto L_0x044b
            L_0x0168:
                java.lang.String r0 = "yeelink.light.colorb"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 66
                goto L_0x044b
            L_0x0174:
                java.lang.String r0 = "yeelink.light.colora"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 65
                goto L_0x044b
            L_0x0180:
                java.lang.String r0 = "yeelink.light.color6"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 63
                goto L_0x044b
            L_0x018c:
                java.lang.String r0 = "yeelink.light.color5"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 62
                goto L_0x044b
            L_0x0198:
                java.lang.String r0 = "yeelink.light.color4"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 61
                goto L_0x044b
            L_0x01a4:
                java.lang.String r0 = "yeelink.light.color3"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 60
                goto L_0x044b
            L_0x01b0:
                java.lang.String r0 = "yeelink.light.color2"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 59
                goto L_0x044b
            L_0x01bc:
                java.lang.String r0 = "yeelink.light.color1"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 58
                goto L_0x044b
            L_0x01c8:
                java.lang.String r0 = "yeelink.light.ceil33"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 42
                goto L_0x044b
            L_0x01d4:
                java.lang.String r0 = "yeelink.light.ceil32"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 41
                goto L_0x044b
            L_0x01e0:
                java.lang.String r0 = "yeelink.light.ceil31"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 40
                goto L_0x044b
            L_0x01ec:
                java.lang.String r0 = "yeelink.light.ceil30"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 39
                goto L_0x044b
            L_0x01f8:
                java.lang.String r0 = "yeelink.light.ceil27"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 37
                goto L_0x044b
            L_0x0204:
                java.lang.String r0 = "yeelink.light.ceil26"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 36
                goto L_0x044b
            L_0x0210:
                java.lang.String r0 = "yeelink.light.ceiling24"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 35
                goto L_0x044b
            L_0x021c:
                java.lang.String r0 = "yeelink.light.ceiling23"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 34
                goto L_0x044b
            L_0x0228:
                java.lang.String r0 = "yeelink.light.ceiling22"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 33
                goto L_0x044b
            L_0x0234:
                java.lang.String r0 = "yeelink.light.ceiling21"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 32
                goto L_0x044b
            L_0x0240:
                java.lang.String r0 = "yeelink.light.ceiling20"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 31
                goto L_0x044b
            L_0x024c:
                java.lang.String r0 = "yeelink.light.bslamp3"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 74
                goto L_0x044b
            L_0x0258:
                java.lang.String r0 = "yeelink.light.bslamp2"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 73
                goto L_0x044b
            L_0x0264:
                java.lang.String r0 = "yeelink.light.bslamp1"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 72
                goto L_0x044b
            L_0x0270:
                java.lang.String r0 = "yeelink.light.cta"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 11
                goto L_0x044b
            L_0x027c:
                java.lang.String r0 = "yeelink.light.ct2"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 10
                goto L_0x044b
            L_0x0288:
                java.lang.String r0 = "yeelink.light.ceiling8"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 20
                goto L_0x044b
            L_0x0294:
                java.lang.String r0 = "yeelink.light.ceiling7"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 19
                goto L_0x044b
            L_0x02a0:
                java.lang.String r0 = "yeelink.light.ceiling6"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 18
                goto L_0x044b
            L_0x02ac:
                java.lang.String r0 = "yeelink.light.ceiling5"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 17
                goto L_0x044b
            L_0x02b8:
                java.lang.String r0 = "yeelink.light.ceiling4"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 16
                goto L_0x044b
            L_0x02c4:
                java.lang.String r0 = "yeelink.light.ceiling3"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 15
                goto L_0x044b
            L_0x02d0:
                java.lang.String r0 = "yeelink.light.ceiling2"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 7
                goto L_0x044b
            L_0x02db:
                java.lang.String r0 = "yeelink.light.ceiling1"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 14
                goto L_0x044b
            L_0x02e7:
                java.lang.String r0 = "yeelink.light.monob"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 5
                goto L_0x044b
            L_0x02f2:
                java.lang.String r0 = "yeelink.light.monoa"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 4
                goto L_0x044b
            L_0x02fd:
                java.lang.String r0 = "yeelink.light.mono5"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 3
                goto L_0x044b
            L_0x0308:
                java.lang.String r0 = "yeelink.light.mono4"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 2
                goto L_0x044b
            L_0x0313:
                java.lang.String r0 = "yeelink.light.mono2"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 1
                goto L_0x044b
            L_0x031e:
                java.lang.String r3 = "yeelink.light.mono1"
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L_0x044a
                goto L_0x044b
            L_0x0328:
                java.lang.String r0 = "yeelink.light.lamp9"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 54
                goto L_0x044b
            L_0x0334:
                java.lang.String r0 = "yeelink.light.lamp8"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 53
                goto L_0x044b
            L_0x0340:
                java.lang.String r0 = "yeelink.light.lamp7"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 52
                goto L_0x044b
            L_0x034c:
                java.lang.String r0 = "yeelink.light.stripa"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 71
                goto L_0x044b
            L_0x0358:
                java.lang.String r0 = "yeelink.light.strip6"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 70
                goto L_0x044b
            L_0x0364:
                java.lang.String r0 = "yeelink.light.strip4"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 12
                goto L_0x044b
            L_0x0370:
                java.lang.String r0 = "yeelink.light.panel3"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 13
                goto L_0x044b
            L_0x037c:
                java.lang.String r0 = "yeelink.light.panel1"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 6
                goto L_0x044b
            L_0x0387:
                java.lang.String r0 = "yeelink.light.lamp19"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 75
                goto L_0x044b
            L_0x0393:
                java.lang.String r0 = "yeelink.light.lamp17"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 9
                goto L_0x044b
            L_0x039f:
                java.lang.String r0 = "yeelink.light.lamp15"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 55
                goto L_0x044b
            L_0x03ab:
                java.lang.String r0 = "yeelink.light.lamp10"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 76
                goto L_0x044b
            L_0x03b7:
                java.lang.String r0 = "yeelink.light.color8"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 64
                goto L_0x044b
            L_0x03c3:
                java.lang.String r0 = "yeelink.light.ceil29"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 38
                goto L_0x044b
            L_0x03cf:
                java.lang.String r0 = "yeelink.light.ceiling19"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 30
                goto L_0x044b
            L_0x03db:
                java.lang.String r0 = "yeelink.light.ceiling18"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 29
                goto L_0x044b
            L_0x03e7:
                java.lang.String r0 = "yeelink.light.ceiling17"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 28
                goto L_0x044b
            L_0x03f2:
                java.lang.String r0 = "yeelink.light.ceiling16"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 27
                goto L_0x044b
            L_0x03fd:
                java.lang.String r0 = "yeelink.light.ceiling15"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 26
                goto L_0x044b
            L_0x0408:
                java.lang.String r0 = "yeelink.light.ceiling14"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 25
                goto L_0x044b
            L_0x0413:
                java.lang.String r0 = "yeelink.light.ceiling13"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 24
                goto L_0x044b
            L_0x041e:
                java.lang.String r0 = "yeelink.light.ceiling12"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 23
                goto L_0x044b
            L_0x0429:
                java.lang.String r0 = "yeelink.light.ceiling11"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 22
                goto L_0x044b
            L_0x0434:
                java.lang.String r0 = "yeelink.light.ceiling10"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 21
                goto L_0x044b
            L_0x043f:
                java.lang.String r0 = "yeelink.bhf_light.v1"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x044a
                r0 = 57
                goto L_0x044b
            L_0x044a:
                r0 = -1
            L_0x044b:
                switch(r0) {
                    case 0: goto L_0x0490;
                    case 1: goto L_0x0490;
                    case 2: goto L_0x0490;
                    case 3: goto L_0x0490;
                    case 4: goto L_0x0490;
                    case 5: goto L_0x0490;
                    case 6: goto L_0x0490;
                    case 7: goto L_0x0490;
                    case 8: goto L_0x0490;
                    case 9: goto L_0x0490;
                    case 10: goto L_0x046a;
                    case 11: goto L_0x046a;
                    case 12: goto L_0x046a;
                    case 13: goto L_0x046a;
                    case 14: goto L_0x046a;
                    case 15: goto L_0x046a;
                    case 16: goto L_0x046a;
                    case 17: goto L_0x046a;
                    case 18: goto L_0x046a;
                    case 19: goto L_0x046a;
                    case 20: goto L_0x046a;
                    case 21: goto L_0x046a;
                    case 22: goto L_0x046a;
                    case 23: goto L_0x046a;
                    case 24: goto L_0x046a;
                    case 25: goto L_0x046a;
                    case 26: goto L_0x046a;
                    case 27: goto L_0x046a;
                    case 28: goto L_0x046a;
                    case 29: goto L_0x046a;
                    case 30: goto L_0x046a;
                    case 31: goto L_0x046a;
                    case 32: goto L_0x046a;
                    case 33: goto L_0x046a;
                    case 34: goto L_0x046a;
                    case 35: goto L_0x046a;
                    case 36: goto L_0x046a;
                    case 37: goto L_0x046a;
                    case 38: goto L_0x046a;
                    case 39: goto L_0x046a;
                    case 40: goto L_0x046a;
                    case 41: goto L_0x046a;
                    case 42: goto L_0x046a;
                    case 43: goto L_0x046a;
                    case 44: goto L_0x046a;
                    case 45: goto L_0x046a;
                    case 46: goto L_0x046a;
                    case 47: goto L_0x046a;
                    case 48: goto L_0x046a;
                    case 49: goto L_0x046a;
                    case 50: goto L_0x046a;
                    case 51: goto L_0x046a;
                    case 52: goto L_0x046a;
                    case 53: goto L_0x046a;
                    case 54: goto L_0x046a;
                    case 55: goto L_0x046a;
                    case 56: goto L_0x046a;
                    case 57: goto L_0x046a;
                    case 58: goto L_0x0452;
                    case 59: goto L_0x0452;
                    case 60: goto L_0x0452;
                    case 61: goto L_0x0452;
                    case 62: goto L_0x0452;
                    case 63: goto L_0x0452;
                    case 64: goto L_0x0452;
                    case 65: goto L_0x0452;
                    case 66: goto L_0x0452;
                    case 67: goto L_0x0452;
                    case 68: goto L_0x0452;
                    case 69: goto L_0x0452;
                    case 70: goto L_0x0452;
                    case 71: goto L_0x0452;
                    case 72: goto L_0x0452;
                    case 73: goto L_0x0452;
                    case 74: goto L_0x0452;
                    case 75: goto L_0x0452;
                    case 76: goto L_0x0452;
                    default: goto L_0x044e;
                }
            L_0x044e:
                r10.m16783c(r11, r13)
                goto L_0x04ab
            L_0x0452:
                int[] r0 = com.yeelight.cherry.p177ui.activity.PersonalityLightPreviewActivity.C5485d.f11451a
                com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity r1 = com.yeelight.cherry.p177ui.activity.PersonalityLightPreviewActivity.this
                com.yeelight.yeelib.g.i$a r1 = r1.f11446e
                int r1 = r1.ordinal()
                r0 = r0[r1]
                if (r0 == r8) goto L_0x0463
            L_0x0462:
                goto L_0x0485
            L_0x0463:
                boolean r0 = r11.mo23415n0(r7)
                if (r0 == 0) goto L_0x044e
                goto L_0x0462
            L_0x046a:
                int[] r0 = com.yeelight.cherry.p177ui.activity.PersonalityLightPreviewActivity.C5485d.f11451a
                com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity r1 = com.yeelight.cherry.p177ui.activity.PersonalityLightPreviewActivity.this
                com.yeelight.yeelib.g.i$a r1 = r1.f11446e
                int r1 = r1.ordinal()
                r0 = r0[r1]
                if (r0 == r8) goto L_0x0489
                if (r0 == r6) goto L_0x0485
                if (r0 == r5) goto L_0x044e
                if (r0 == r4) goto L_0x0481
                goto L_0x044e
            L_0x0481:
                r10.m16782b(r11, r13)
                goto L_0x044e
            L_0x0485:
                r10.m16782b(r11, r13)
                goto L_0x04ab
            L_0x0489:
                boolean r0 = r11.mo23415n0(r7)
                if (r0 == 0) goto L_0x044e
                goto L_0x0485
            L_0x0490:
                int[] r0 = com.yeelight.cherry.p177ui.activity.PersonalityLightPreviewActivity.C5485d.f11451a
                com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity r1 = com.yeelight.cherry.p177ui.activity.PersonalityLightPreviewActivity.this
                com.yeelight.yeelib.g.i$a r1 = r1.f11446e
                int r1 = r1.ordinal()
                r0 = r0[r1]
                if (r0 == r8) goto L_0x04a1
                goto L_0x044e
            L_0x04a1:
                boolean r0 = r11.mo23415n0(r7)
                if (r0 == 0) goto L_0x044e
                goto L_0x0462
            L_0x04a8:
                r10.m16781a(r13)
            L_0x04ab:
                android.widget.LinearLayout r0 = r13.f11460d
                com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity$e$a r1 = new com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity$e$a
                r1.<init>(r13, r11)
                r0.setOnClickListener(r1)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.activity.PersonalityLightPreviewActivity.C5486e.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity$f */
    static class C5489f {

        /* renamed from: a */
        public ImageView f11457a;

        /* renamed from: b */
        public TextView f11458b;

        /* renamed from: c */
        public TextView f11459c;

        /* renamed from: d */
        public LinearLayout f11460d;

        /* renamed from: e */
        public boolean f11461e = false;

        C5489f() {
        }
    }

    static {
        Class<PersonalityLightPreviewActivity> cls = PersonalityLightPreviewActivity.class;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:252:0x03f4, code lost:
        if (r2.mo23415n0(31) != false) goto L_0x040a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x040a, code lost:
        r11.f11444c.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0429, code lost:
        if (r2.mo23415n0(31) == false) goto L_0x03de;
     */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m16780Y() {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.yeelight.yeelib.f.w r1 = com.yeelight.yeelib.p152f.C4257w.m11947l0()
            java.util.List r1 = r1.mo23638A0()
            java.util.Iterator r1 = r1.iterator()
        L_0x0011:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x042c
            java.lang.Object r2 = r1.next()
            com.yeelight.yeelib.c.h r2 = (com.yeelight.yeelib.p150c.C6006h) r2
            boolean r3 = r2.mo23416o0()
            if (r3 == 0) goto L_0x03de
            java.lang.String r3 = r2.mo23395T()
            r4 = -1
            int r5 = r3.hashCode()
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 31
            r10 = 1
            switch(r5) {
                case -1644531059: goto L_0x03d1;
                case -1462015191: goto L_0x03c6;
                case -1462015190: goto L_0x03bb;
                case -1462015189: goto L_0x03b0;
                case -1462015188: goto L_0x03a5;
                case -1462015187: goto L_0x039a;
                case -1462015186: goto L_0x038f;
                case -1462015185: goto L_0x0384;
                case -1462015184: goto L_0x0379;
                case -1462015183: goto L_0x036e;
                case -1462015182: goto L_0x0362;
                case -1317475937: goto L_0x0356;
                case -1308146488: goto L_0x034a;
                case -1063384694: goto L_0x033e;
                case -1063384689: goto L_0x0332;
                case -1063384687: goto L_0x0326;
                case -1063384685: goto L_0x031a;
                case -948847040: goto L_0x030f;
                case -948847038: goto L_0x0303;
                case -845289553: goto L_0x02f7;
                case -845289551: goto L_0x02eb;
                case -845289508: goto L_0x02df;
                case -449944724: goto L_0x02d3;
                case -449944723: goto L_0x02c7;
                case -449944722: goto L_0x02bb;
                case -448603205: goto L_0x02b0;
                case -448603204: goto L_0x02a5;
                case -448603202: goto L_0x029a;
                case -448603201: goto L_0x028f;
                case -448603157: goto L_0x0284;
                case -448603156: goto L_0x0279;
                case 922669543: goto L_0x026d;
                case 922669544: goto L_0x0262;
                case 922669545: goto L_0x0256;
                case 922669546: goto L_0x024a;
                case 922669547: goto L_0x023e;
                case 922669548: goto L_0x0232;
                case 922669549: goto L_0x0226;
                case 922669550: goto L_0x021a;
                case 1201756974: goto L_0x020e;
                case 1201757021: goto L_0x0202;
                case 1623724661: goto L_0x01f6;
                case 1623724662: goto L_0x01ea;
                case 1623724663: goto L_0x01de;
                default: goto L_0x0035;
            }
        L_0x0035:
            switch(r5) {
                case -1462015160: goto L_0x01d2;
                case -1462015159: goto L_0x01c6;
                case -1462015158: goto L_0x01ba;
                case -1462015157: goto L_0x01ae;
                case -1462015156: goto L_0x01a2;
                default: goto L_0x0038;
            }
        L_0x0038:
            switch(r5) {
                case -1317475940: goto L_0x0196;
                case -1317475939: goto L_0x018a;
                default: goto L_0x003b;
            }
        L_0x003b:
            switch(r5) {
                case -1317475915: goto L_0x017e;
                case -1317475914: goto L_0x0172;
                case -1317475913: goto L_0x0166;
                case -1317475912: goto L_0x015a;
                default: goto L_0x003e;
            }
        L_0x003e:
            switch(r5) {
                case -1308146495: goto L_0x014e;
                case -1308146494: goto L_0x0142;
                case -1308146493: goto L_0x0136;
                case -1308146492: goto L_0x012a;
                case -1308146491: goto L_0x011e;
                case -1308146490: goto L_0x0112;
                default: goto L_0x0041;
            }
        L_0x0041:
            switch(r5) {
                case -1308146447: goto L_0x0106;
                case -1308146446: goto L_0x00fa;
                case -1308146445: goto L_0x00ee;
                default: goto L_0x0044;
            }
        L_0x0044:
            switch(r5) {
                case -888668266: goto L_0x00e2;
                case -888668265: goto L_0x00d6;
                case -888668264: goto L_0x00ca;
                default: goto L_0x0047;
            }
        L_0x0047:
            switch(r5) {
                case -845289556: goto L_0x00be;
                case -845289555: goto L_0x00b2;
                default: goto L_0x004a;
            }
        L_0x004a:
            switch(r5) {
                case -458141175: goto L_0x00a6;
                case -458141174: goto L_0x009a;
                case -458141173: goto L_0x008e;
                case -458141172: goto L_0x0082;
                default: goto L_0x004d;
            }
        L_0x004d:
            switch(r5) {
                case -449944730: goto L_0x0076;
                case -449944729: goto L_0x006a;
                case -449944728: goto L_0x005e;
                case -449944727: goto L_0x0052;
                default: goto L_0x0050;
            }
        L_0x0050:
            goto L_0x03db
        L_0x0052:
            java.lang.String r5 = "yeelink.light.lamp4"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 51
            goto L_0x03db
        L_0x005e:
            java.lang.String r5 = "yeelink.light.lamp3"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 8
            goto L_0x03db
        L_0x006a:
            java.lang.String r5 = "yeelink.light.lamp2"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 56
            goto L_0x03db
        L_0x0076:
            java.lang.String r5 = "yeelink.light.lamp1"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 50
            goto L_0x03db
        L_0x0082:
            java.lang.String r5 = "yeelink.light.ceild"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 46
            goto L_0x03db
        L_0x008e:
            java.lang.String r5 = "yeelink.light.ceilc"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 45
            goto L_0x03db
        L_0x009a:
            java.lang.String r5 = "yeelink.light.ceilb"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 44
            goto L_0x03db
        L_0x00a6:
            java.lang.String r5 = "yeelink.light.ceila"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 43
            goto L_0x03db
        L_0x00b2:
            java.lang.String r5 = "yeelink.light.strip2"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 69
            goto L_0x03db
        L_0x00be:
            java.lang.String r5 = "yeelink.light.strip1"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 68
            goto L_0x03db
        L_0x00ca:
            java.lang.String r5 = "yilai.light.ceiling3"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 49
            goto L_0x03db
        L_0x00d6:
            java.lang.String r5 = "yilai.light.ceiling2"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 48
            goto L_0x03db
        L_0x00e2:
            java.lang.String r5 = "yilai.light.ceiling1"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 47
            goto L_0x03db
        L_0x00ee:
            java.lang.String r5 = "yeelink.light.colorc"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 67
            goto L_0x03db
        L_0x00fa:
            java.lang.String r5 = "yeelink.light.colorb"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 66
            goto L_0x03db
        L_0x0106:
            java.lang.String r5 = "yeelink.light.colora"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 65
            goto L_0x03db
        L_0x0112:
            java.lang.String r5 = "yeelink.light.color6"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 63
            goto L_0x03db
        L_0x011e:
            java.lang.String r5 = "yeelink.light.color5"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 62
            goto L_0x03db
        L_0x012a:
            java.lang.String r5 = "yeelink.light.color4"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 61
            goto L_0x03db
        L_0x0136:
            java.lang.String r5 = "yeelink.light.color3"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 60
            goto L_0x03db
        L_0x0142:
            java.lang.String r5 = "yeelink.light.color2"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 59
            goto L_0x03db
        L_0x014e:
            java.lang.String r5 = "yeelink.light.color1"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 58
            goto L_0x03db
        L_0x015a:
            java.lang.String r5 = "yeelink.light.ceil33"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 42
            goto L_0x03db
        L_0x0166:
            java.lang.String r5 = "yeelink.light.ceil32"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 41
            goto L_0x03db
        L_0x0172:
            java.lang.String r5 = "yeelink.light.ceil31"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 40
            goto L_0x03db
        L_0x017e:
            java.lang.String r5 = "yeelink.light.ceil30"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 39
            goto L_0x03db
        L_0x018a:
            java.lang.String r5 = "yeelink.light.ceil27"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 37
            goto L_0x03db
        L_0x0196:
            java.lang.String r5 = "yeelink.light.ceil26"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 36
            goto L_0x03db
        L_0x01a2:
            java.lang.String r5 = "yeelink.light.ceiling24"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 35
            goto L_0x03db
        L_0x01ae:
            java.lang.String r5 = "yeelink.light.ceiling23"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 34
            goto L_0x03db
        L_0x01ba:
            java.lang.String r5 = "yeelink.light.ceiling22"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 33
            goto L_0x03db
        L_0x01c6:
            java.lang.String r5 = "yeelink.light.ceiling21"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 32
            goto L_0x03db
        L_0x01d2:
            java.lang.String r5 = "yeelink.light.ceiling20"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 31
            goto L_0x03db
        L_0x01de:
            java.lang.String r5 = "yeelink.light.bslamp3"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 74
            goto L_0x03db
        L_0x01ea:
            java.lang.String r5 = "yeelink.light.bslamp2"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 73
            goto L_0x03db
        L_0x01f6:
            java.lang.String r5 = "yeelink.light.bslamp1"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 72
            goto L_0x03db
        L_0x0202:
            java.lang.String r5 = "yeelink.light.cta"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 11
            goto L_0x03db
        L_0x020e:
            java.lang.String r5 = "yeelink.light.ct2"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 10
            goto L_0x03db
        L_0x021a:
            java.lang.String r5 = "yeelink.light.ceiling8"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 20
            goto L_0x03db
        L_0x0226:
            java.lang.String r5 = "yeelink.light.ceiling7"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 19
            goto L_0x03db
        L_0x0232:
            java.lang.String r5 = "yeelink.light.ceiling6"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 18
            goto L_0x03db
        L_0x023e:
            java.lang.String r5 = "yeelink.light.ceiling5"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 17
            goto L_0x03db
        L_0x024a:
            java.lang.String r5 = "yeelink.light.ceiling4"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 16
            goto L_0x03db
        L_0x0256:
            java.lang.String r5 = "yeelink.light.ceiling3"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 15
            goto L_0x03db
        L_0x0262:
            java.lang.String r5 = "yeelink.light.ceiling2"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 7
            goto L_0x03db
        L_0x026d:
            java.lang.String r5 = "yeelink.light.ceiling1"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 14
            goto L_0x03db
        L_0x0279:
            java.lang.String r5 = "yeelink.light.monob"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 4
            goto L_0x03db
        L_0x0284:
            java.lang.String r5 = "yeelink.light.monoa"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 3
            goto L_0x03db
        L_0x028f:
            java.lang.String r5 = "yeelink.light.mono5"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 5
            goto L_0x03db
        L_0x029a:
            java.lang.String r5 = "yeelink.light.mono4"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 2
            goto L_0x03db
        L_0x02a5:
            java.lang.String r5 = "yeelink.light.mono2"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 1
            goto L_0x03db
        L_0x02b0:
            java.lang.String r5 = "yeelink.light.mono1"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 0
            goto L_0x03db
        L_0x02bb:
            java.lang.String r5 = "yeelink.light.lamp9"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 54
            goto L_0x03db
        L_0x02c7:
            java.lang.String r5 = "yeelink.light.lamp8"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 53
            goto L_0x03db
        L_0x02d3:
            java.lang.String r5 = "yeelink.light.lamp7"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 52
            goto L_0x03db
        L_0x02df:
            java.lang.String r5 = "yeelink.light.stripa"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 71
            goto L_0x03db
        L_0x02eb:
            java.lang.String r5 = "yeelink.light.strip6"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 70
            goto L_0x03db
        L_0x02f7:
            java.lang.String r5 = "yeelink.light.strip4"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 12
            goto L_0x03db
        L_0x0303:
            java.lang.String r5 = "yeelink.light.panel3"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 13
            goto L_0x03db
        L_0x030f:
            java.lang.String r5 = "yeelink.light.panel1"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 6
            goto L_0x03db
        L_0x031a:
            java.lang.String r5 = "yeelink.light.lamp19"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 75
            goto L_0x03db
        L_0x0326:
            java.lang.String r5 = "yeelink.light.lamp17"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 9
            goto L_0x03db
        L_0x0332:
            java.lang.String r5 = "yeelink.light.lamp15"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 55
            goto L_0x03db
        L_0x033e:
            java.lang.String r5 = "yeelink.light.lamp10"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 76
            goto L_0x03db
        L_0x034a:
            java.lang.String r5 = "yeelink.light.color8"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 64
            goto L_0x03db
        L_0x0356:
            java.lang.String r5 = "yeelink.light.ceil29"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 38
            goto L_0x03db
        L_0x0362:
            java.lang.String r5 = "yeelink.light.ceiling19"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 30
            goto L_0x03db
        L_0x036e:
            java.lang.String r5 = "yeelink.light.ceiling18"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 29
            goto L_0x03db
        L_0x0379:
            java.lang.String r5 = "yeelink.light.ceiling17"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 28
            goto L_0x03db
        L_0x0384:
            java.lang.String r5 = "yeelink.light.ceiling16"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 27
            goto L_0x03db
        L_0x038f:
            java.lang.String r5 = "yeelink.light.ceiling15"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 26
            goto L_0x03db
        L_0x039a:
            java.lang.String r5 = "yeelink.light.ceiling14"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 25
            goto L_0x03db
        L_0x03a5:
            java.lang.String r5 = "yeelink.light.ceiling13"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 24
            goto L_0x03db
        L_0x03b0:
            java.lang.String r5 = "yeelink.light.ceiling12"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 23
            goto L_0x03db
        L_0x03bb:
            java.lang.String r5 = "yeelink.light.ceiling11"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 22
            goto L_0x03db
        L_0x03c6:
            java.lang.String r5 = "yeelink.light.ceiling10"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 21
            goto L_0x03db
        L_0x03d1:
            java.lang.String r5 = "yeelink.bhf_light.v1"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03db
            r4 = 57
        L_0x03db:
            switch(r4) {
                case 0: goto L_0x0418;
                case 1: goto L_0x0418;
                case 2: goto L_0x0418;
                case 3: goto L_0x0418;
                case 4: goto L_0x0418;
                case 5: goto L_0x0418;
                case 6: goto L_0x0418;
                case 7: goto L_0x0418;
                case 8: goto L_0x0418;
                case 9: goto L_0x0418;
                case 10: goto L_0x03f7;
                case 11: goto L_0x03f7;
                case 12: goto L_0x03f7;
                case 13: goto L_0x03f7;
                case 14: goto L_0x03f7;
                case 15: goto L_0x03f7;
                case 16: goto L_0x03f7;
                case 17: goto L_0x03f7;
                case 18: goto L_0x03f7;
                case 19: goto L_0x03f7;
                case 20: goto L_0x03f7;
                case 21: goto L_0x03f7;
                case 22: goto L_0x03f7;
                case 23: goto L_0x03f7;
                case 24: goto L_0x03f7;
                case 25: goto L_0x03f7;
                case 26: goto L_0x03f7;
                case 27: goto L_0x03f7;
                case 28: goto L_0x03f7;
                case 29: goto L_0x03f7;
                case 30: goto L_0x03f7;
                case 31: goto L_0x03f7;
                case 32: goto L_0x03f7;
                case 33: goto L_0x03f7;
                case 34: goto L_0x03f7;
                case 35: goto L_0x03f7;
                case 36: goto L_0x03f7;
                case 37: goto L_0x03f7;
                case 38: goto L_0x03f7;
                case 39: goto L_0x03f7;
                case 40: goto L_0x03f7;
                case 41: goto L_0x03f7;
                case 42: goto L_0x03f7;
                case 43: goto L_0x03f7;
                case 44: goto L_0x03f7;
                case 45: goto L_0x03f7;
                case 46: goto L_0x03f7;
                case 47: goto L_0x03f7;
                case 48: goto L_0x03f7;
                case 49: goto L_0x03f7;
                case 50: goto L_0x03f7;
                case 51: goto L_0x03f7;
                case 52: goto L_0x03f7;
                case 53: goto L_0x03f7;
                case 54: goto L_0x03f7;
                case 55: goto L_0x03f7;
                case 56: goto L_0x03f7;
                case 57: goto L_0x03f7;
                case 58: goto L_0x03e3;
                case 59: goto L_0x03e3;
                case 60: goto L_0x03e3;
                case 61: goto L_0x03e3;
                case 62: goto L_0x03e3;
                case 63: goto L_0x03e3;
                case 64: goto L_0x03e3;
                case 65: goto L_0x03e3;
                case 66: goto L_0x03e3;
                case 67: goto L_0x03e3;
                case 68: goto L_0x03e3;
                case 69: goto L_0x03e3;
                case 70: goto L_0x03e3;
                case 71: goto L_0x03e3;
                case 72: goto L_0x03e3;
                case 73: goto L_0x03e3;
                case 74: goto L_0x03e3;
                case 75: goto L_0x03e3;
                case 76: goto L_0x03e3;
                default: goto L_0x03de;
            }
        L_0x03de:
            r0.add(r2)
            goto L_0x0011
        L_0x03e3:
            int[] r3 = com.yeelight.cherry.p177ui.activity.PersonalityLightPreviewActivity.C5485d.f11451a
            com.yeelight.yeelib.g.i$a r4 = r11.f11446e
            int r4 = r4.ordinal()
            r3 = r3[r4]
            if (r3 == r10) goto L_0x03f0
            goto L_0x040a
        L_0x03f0:
            boolean r3 = r2.mo23415n0(r9)
            if (r3 == 0) goto L_0x03de
            goto L_0x040a
        L_0x03f7:
            int[] r3 = com.yeelight.cherry.p177ui.activity.PersonalityLightPreviewActivity.C5485d.f11451a
            com.yeelight.yeelib.g.i$a r4 = r11.f11446e
            int r4 = r4.ordinal()
            r3 = r3[r4]
            if (r3 == r10) goto L_0x0411
            if (r3 == r8) goto L_0x040a
            if (r3 == r7) goto L_0x03de
            if (r3 == r6) goto L_0x040a
            goto L_0x03de
        L_0x040a:
            java.util.List<com.yeelight.yeelib.c.h> r3 = r11.f11444c
            r3.add(r2)
            goto L_0x0011
        L_0x0411:
            boolean r3 = r2.mo23415n0(r9)
            if (r3 == 0) goto L_0x03de
            goto L_0x040a
        L_0x0418:
            int[] r3 = com.yeelight.cherry.p177ui.activity.PersonalityLightPreviewActivity.C5485d.f11451a
            com.yeelight.yeelib.g.i$a r4 = r11.f11446e
            int r4 = r4.ordinal()
            r3 = r3[r4]
            if (r3 == r10) goto L_0x0425
            goto L_0x03de
        L_0x0425:
            boolean r3 = r2.mo23415n0(r9)
            if (r3 == 0) goto L_0x03de
            goto L_0x040a
        L_0x042c:
            java.util.List<com.yeelight.yeelib.c.h> r1 = r11.f11444c
            r1.addAll(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.activity.PersonalityLightPreviewActivity.m16780Y():void");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        boolean z = true;
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_personality_light_preview);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297424);
        commonTitleBar.mo32825a(getText(2131755311).toString(), new C5482a(), (View.OnClickListener) null);
        commonTitleBar.setTitleTextSize(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("custom_scene_index", -1);
        this.f11447f = intent.getBooleanExtra("custom_scene_preview", false);
        if (intExtra == -1 || intExtra == -2) {
            z = false;
        }
        if (!z) {
            this.f11445d = C4300b0.m12083u().mo23753r();
        } else if (C4300b0.m12083u().mo23745i() == null || C4300b0.m12083u().mo23745i().size() == 0) {
            finish();
            return;
        } else {
            C9838i iVar = C4300b0.m12083u().mo23745i().get(intExtra);
            this.f11445d = iVar;
            iVar.mo31871c().mo31727l(this.f11445d.mo31871c().mo31725j() * this.f11445d.mo31871c().mo31723h().size());
        }
        this.f11446e = this.f11445d.mo31760c0();
        C5486e eVar = new C5486e(this, (C5482a) null);
        this.f11443b = eVar;
        ((ListView) findViewById(2131296591)).setAdapter(eVar);
        m16780Y();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        for (C6006h W0 : this.f11444c) {
            W0.mo23400W0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        for (C6006h B0 : this.f11444c) {
            B0.mo23365B0(this);
        }
    }

    public void onStatusChange(int i, C6024e eVar) {
        Runnable runnable;
        if (!(i == 1 || i == 2)) {
            if (i == 2048) {
                m16780Y();
                runnable = new C5484c();
                runOnUiThread(runnable);
            } else if (i != 262144) {
                return;
            }
        }
        runnable = new C5483b();
        runOnUiThread(runnable);
    }
}
