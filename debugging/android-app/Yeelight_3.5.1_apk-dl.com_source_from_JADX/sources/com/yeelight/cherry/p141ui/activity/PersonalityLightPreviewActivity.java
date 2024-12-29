package com.yeelight.cherry.p141ui.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.models.C3112v;
import com.yeelight.yeelib.models.CustomAdvancedFlowScene;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p051j4.C9193k;
import p170i4.C9113d;
import p237z3.C12145e;

/* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity */
public class PersonalityLightPreviewActivity extends BaseActivity implements C12145e {

    /* renamed from: a */
    C5529e f11007a;

    /* renamed from: b */
    List<WifiDeviceBase> f11008b = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public CustomAdvancedFlowScene f11009c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public CustomAdvancedFlowScene.LightMode f11010d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f11011e;

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity$a */
    class C5525a implements View.OnClickListener {
        C5525a() {
        }

        public void onClick(View view) {
            PersonalityLightPreviewActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity$b */
    class C5526b implements Runnable {
        C5526b() {
        }

        public void run() {
            PersonalityLightPreviewActivity.this.f11007a.notifyDataSetChanged();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity$c */
    class C5527c implements Runnable {
        C5527c() {
        }

        public void run() {
            PersonalityLightPreviewActivity.this.f11007a.notifyDataSetChanged();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity$d */
    static /* synthetic */ class C5528d {

        /* renamed from: a */
        static final /* synthetic */ int[] f11015a;

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
                f11015a = r0
                com.yeelight.yeelib.models.CustomAdvancedFlowScene$LightMode r1 = com.yeelight.yeelib.models.CustomAdvancedFlowScene.LightMode.MODE_BRIGHT_ONLY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11015a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.models.CustomAdvancedFlowScene$LightMode r1 = com.yeelight.yeelib.models.CustomAdvancedFlowScene.LightMode.MODE_CT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11015a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yeelight.yeelib.models.CustomAdvancedFlowScene$LightMode r1 = com.yeelight.yeelib.models.CustomAdvancedFlowScene.LightMode.MODE_COLOR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f11015a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.yeelight.yeelib.models.CustomAdvancedFlowScene$LightMode r1 = com.yeelight.yeelib.models.CustomAdvancedFlowScene.LightMode.MODE_SUSPEND     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.activity.PersonalityLightPreviewActivity.C5528d.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity$e */
    private class C5529e extends BaseAdapter {

        /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity$e$a */
        class C5530a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C5532f f11017a;

            /* renamed from: b */
            final /* synthetic */ WifiDeviceBase f11018b;

            /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity$e$a$a */
            class C5531a implements DialogInterface.OnClickListener {
                C5531a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    C5530a aVar = C5530a.this;
                    aVar.f11017a.f11025e = true;
                    aVar.f11018b.mo23168x1(PersonalityLightPreviewActivity.this.f11009c);
                    dialogInterface.dismiss();
                }
            }

            C5530a(C5532f fVar, WifiDeviceBase wifiDeviceBase) {
                this.f11017a = fVar;
                this.f11018b = wifiDeviceBase;
            }

            public void onClick(View view) {
                String str;
                String str2;
                if (this.f11017a.f11024d.isEnabled()) {
                    if (PersonalityLightPreviewActivity.this.f11011e) {
                        str = PersonalityLightPreviewActivity.this.getResources().getString(2131756044);
                        str2 = String.format(Locale.US, PersonalityLightPreviewActivity.this.getResources().getString(2131756042), new Object[]{this.f11018b.mo23210U()});
                    } else {
                        str = PersonalityLightPreviewActivity.this.getResources().getString(2131756009);
                        str2 = String.format(Locale.US, PersonalityLightPreviewActivity.this.getResources().getString(2131756007), new Object[]{this.f11018b.mo23210U()});
                    }
                    new C9113d.C9118e(PersonalityLightPreviewActivity.this).mo37179i(str).mo37177g(str2).mo37173c(this.f11018b.mo23116F()).mo37174d(-2, PersonalityLightPreviewActivity.this.getResources().getString(2131755232), (DialogInterface.OnClickListener) null).mo37174d(-1, PersonalityLightPreviewActivity.this.getResources().getString(2131755281), new C5531a()).mo37172b().show();
                }
            }
        }

        private C5529e() {
        }

        /* synthetic */ C5529e(PersonalityLightPreviewActivity personalityLightPreviewActivity, C5525a aVar) {
            this();
        }

        /* renamed from: a */
        private void m16754a(C5532f fVar) {
            fVar.f11022b.setTextColor(PersonalityLightPreviewActivity.this.getResources().getColor(2131099839));
            fVar.f11023c.setTextColor(PersonalityLightPreviewActivity.this.getResources().getColor(2131099839));
            fVar.f11023c.setText(2131756041);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0059, code lost:
            if (r4.mo23146k1() != false) goto L_0x0068;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0062, code lost:
            if (r4.mo23146k1() != false) goto L_0x0068;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m16755b(com.yeelight.yeelib.device.WifiDeviceBase r4, com.yeelight.cherry.p141ui.activity.PersonalityLightPreviewActivity.C5532f r5) {
            /*
                r3 = this;
                android.widget.TextView r0 = r5.f11022b
                com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity r1 = com.yeelight.cherry.p141ui.activity.PersonalityLightPreviewActivity.this
                android.content.res.Resources r1 = r1.getResources()
                r2 = 2131099840(0x7f0600c0, float:1.7812045E38)
                int r1 = r1.getColor(r2)
                r0.setTextColor(r1)
                android.widget.TextView r0 = r5.f11023c
                com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity r1 = com.yeelight.cherry.p141ui.activity.PersonalityLightPreviewActivity.this
                android.content.res.Resources r1 = r1.getResources()
                r2 = 2131099841(0x7f0600c1, float:1.7812047E38)
                int r1 = r1.getColor(r2)
                r0.setTextColor(r1)
                boolean r0 = r5.f11025e
                r1 = 2131755328(0x7f100140, float:1.9141532E38)
                r2 = 2131755326(0x7f10013e, float:1.9141528E38)
                if (r0 == 0) goto L_0x005c
                com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r4.mo23221d0()
                boolean r0 = r0.mo31562S()
                if (r0 == 0) goto L_0x0053
                android.widget.TextView r4 = r5.f11023c
                r0 = 2131756034(0x7f100402, float:1.9142964E38)
                r4.setText(r0)
                android.widget.TextView r4 = r5.f11023c
                com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity r0 = com.yeelight.cherry.p141ui.activity.PersonalityLightPreviewActivity.this
                android.content.res.Resources r0 = r0.getResources()
                r1 = 2131099805(0x7f06009d, float:1.7811974E38)
                int r0 = r0.getColor(r1)
                r4.setTextColor(r0)
                goto L_0x006b
            L_0x0053:
                android.widget.TextView r0 = r5.f11023c
                boolean r4 = r4.mo23146k1()
                if (r4 == 0) goto L_0x0065
                goto L_0x0068
            L_0x005c:
                android.widget.TextView r0 = r5.f11023c
                boolean r4 = r4.mo23146k1()
                if (r4 == 0) goto L_0x0065
                goto L_0x0068
            L_0x0065:
                r1 = 2131755326(0x7f10013e, float:1.9141528E38)
            L_0x0068:
                r0.setText(r1)
            L_0x006b:
                android.widget.LinearLayout r4 = r5.f11024d
                r5 = 1
                r4.setEnabled(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.activity.PersonalityLightPreviewActivity.C5529e.m16755b(com.yeelight.yeelib.device.WifiDeviceBase, com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity$f):void");
        }

        /* renamed from: c */
        private void m16756c(WifiDeviceBase wifiDeviceBase, C5532f fVar) {
            fVar.f11022b.setTextColor(PersonalityLightPreviewActivity.this.getResources().getColor(2131099839));
            fVar.f11023c.setTextColor(PersonalityLightPreviewActivity.this.getResources().getColor(2131099839));
            fVar.f11023c.setText(2131756046);
        }

        public int getCount() {
            return PersonalityLightPreviewActivity.this.f11008b.size();
        }

        public Object getItem(int i) {
            return PersonalityLightPreviewActivity.this.f11008b.get(i);
        }

        public long getItemId(int i) {
            return 0;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:253:0x0505, code lost:
            if (r1.equals("yeelink.bhf_light.v1") == false) goto L_0x00a6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:255:0x050c, code lost:
            m16756c(r11, r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:259:0x0525, code lost:
            if (r11.mo23229n0(31) == false) goto L_0x050c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:263:0x053d, code lost:
            if (r11.mo23229n0(31) != false) goto L_0x055b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:270:0x055b, code lost:
            m16755b(r11, r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:272:0x0563, code lost:
            if (r11.mo23229n0(31) != false) goto L_0x055b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r11, android.view.View r12, android.view.ViewGroup r13) {
            /*
                r10 = this;
                r0 = 0
                if (r12 == 0) goto L_0x000a
                java.lang.Object r13 = r12.getTag()
                com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity$f r13 = (com.yeelight.cherry.p141ui.activity.PersonalityLightPreviewActivity.C5532f) r13
                goto L_0x0050
            L_0x000a:
                com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity$f r12 = new com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity$f
                r12.<init>()
                android.content.Context r1 = r13.getContext()
                android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
                r2 = 2131493141(0x7f0c0115, float:1.8609754E38)
                android.view.View r13 = r1.inflate(r2, r13, r0)
                r1 = 2131296666(0x7f09019a, float:1.8211255E38)
                android.view.View r1 = r13.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r12.f11021a = r1
                r1 = 2131296667(0x7f09019b, float:1.8211257E38)
                android.view.View r1 = r13.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r12.f11022b = r1
                r1 = 2131296668(0x7f09019c, float:1.821126E38)
                android.view.View r1 = r13.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r12.f11023c = r1
                r1 = 2131297239(0x7f0903d7, float:1.8212417E38)
                android.view.View r1 = r13.findViewById(r1)
                android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
                r12.f11024d = r1
                r13.setTag(r12)
                r9 = r13
                r13 = r12
                r12 = r9
            L_0x0050:
                com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity r1 = com.yeelight.cherry.p141ui.activity.PersonalityLightPreviewActivity.this
                java.util.List<com.yeelight.yeelib.device.WifiDeviceBase> r1 = r1.f11008b
                java.lang.Object r11 = r1.get(r11)
                com.yeelight.yeelib.device.WifiDeviceBase r11 = (com.yeelight.yeelib.device.WifiDeviceBase) r11
                android.widget.ImageView r1 = r13.f11021a
                android.content.Context r2 = r12.getContext()
                int r3 = r11.mo23116F()
                android.graphics.drawable.Drawable r2 = androidx.core.content.ContextCompat.getDrawable(r2, r3)
                r1.setBackground(r2)
                android.widget.TextView r1 = r13.f11023c
                com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity r2 = com.yeelight.cherry.p141ui.activity.PersonalityLightPreviewActivity.this
                android.content.res.Resources r2 = r2.getResources()
                r3 = 2131099841(0x7f0600c1, float:1.7812047E38)
                int r2 = r2.getColor(r3)
                r1.setTextColor(r2)
                android.widget.TextView r1 = r13.f11022b
                java.lang.String r2 = r11.mo23210U()
                r1.setText(r2)
                android.widget.LinearLayout r1 = r13.f11024d
                r1.setEnabled(r0)
                boolean r1 = r11.mo23230o0()
                if (r1 == 0) goto L_0x0566
                java.lang.String r1 = r11.mo23208T()
                r1.hashCode()
                r2 = -1
                int r3 = r1.hashCode()
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 31
                r8 = 1
                switch(r3) {
                    case -1644531059: goto L_0x04ff;
                    case -1462015191: goto L_0x04f3;
                    case -1462015190: goto L_0x04e7;
                    case -1462015189: goto L_0x04db;
                    case -1462015188: goto L_0x04cf;
                    case -1462015187: goto L_0x04c3;
                    case -1462015186: goto L_0x04b7;
                    case -1462015185: goto L_0x04ab;
                    case -1462015184: goto L_0x049e;
                    case -1462015183: goto L_0x0490;
                    case -1462015182: goto L_0x0482;
                    case -1462015160: goto L_0x0474;
                    case -1462015159: goto L_0x0466;
                    case -1462015158: goto L_0x0458;
                    case -1462015157: goto L_0x044a;
                    case -1462015156: goto L_0x043c;
                    case -1317475940: goto L_0x042e;
                    case -1317475939: goto L_0x0420;
                    case -1317475937: goto L_0x0412;
                    case -1317475915: goto L_0x0404;
                    case -1317475914: goto L_0x03f6;
                    case -1317475913: goto L_0x03e8;
                    case -1317475912: goto L_0x03da;
                    case -1317475910: goto L_0x03cc;
                    case -1308146495: goto L_0x03be;
                    case -1308146494: goto L_0x03b0;
                    case -1308146493: goto L_0x03a2;
                    case -1308146492: goto L_0x0394;
                    case -1308146491: goto L_0x0386;
                    case -1308146490: goto L_0x0378;
                    case -1308146488: goto L_0x036a;
                    case -1308146447: goto L_0x035c;
                    case -1308146446: goto L_0x034e;
                    case -1308146445: goto L_0x0340;
                    case -1308146443: goto L_0x0332;
                    case -1063384694: goto L_0x0324;
                    case -1063384689: goto L_0x0316;
                    case -1063384687: goto L_0x0308;
                    case -1063384685: goto L_0x02fa;
                    case -948847040: goto L_0x02ec;
                    case -948847038: goto L_0x02de;
                    case -888668266: goto L_0x02d0;
                    case -888668265: goto L_0x02c2;
                    case -888668264: goto L_0x02b4;
                    case -845289556: goto L_0x02a6;
                    case -845289555: goto L_0x0298;
                    case -845289553: goto L_0x028a;
                    case -845289551: goto L_0x027c;
                    case -845289549: goto L_0x026e;
                    case -845289508: goto L_0x0260;
                    case -458141175: goto L_0x0252;
                    case -458141174: goto L_0x0244;
                    case -458141173: goto L_0x0236;
                    case -458141172: goto L_0x0228;
                    case -458141171: goto L_0x021a;
                    case -449944730: goto L_0x020c;
                    case -449944729: goto L_0x01fe;
                    case -449944728: goto L_0x01f0;
                    case -449944727: goto L_0x01e2;
                    case -449944724: goto L_0x01d4;
                    case -449944723: goto L_0x01c6;
                    case -449944722: goto L_0x01b8;
                    case -448603205: goto L_0x01aa;
                    case -448603204: goto L_0x019c;
                    case -448603202: goto L_0x018e;
                    case -448603201: goto L_0x0180;
                    case -448603157: goto L_0x0172;
                    case -448603156: goto L_0x0164;
                    case 922669543: goto L_0x0156;
                    case 922669544: goto L_0x0148;
                    case 922669545: goto L_0x013a;
                    case 922669546: goto L_0x012c;
                    case 922669547: goto L_0x011e;
                    case 922669548: goto L_0x0111;
                    case 922669549: goto L_0x0104;
                    case 922669550: goto L_0x00f7;
                    case 1201756974: goto L_0x00ea;
                    case 1201757021: goto L_0x00dd;
                    case 1201757023: goto L_0x00d0;
                    case 1623724661: goto L_0x00c3;
                    case 1623724662: goto L_0x00b6;
                    case 1623724663: goto L_0x00a9;
                    default: goto L_0x00a6;
                }
            L_0x00a6:
                r0 = -1
                goto L_0x0509
            L_0x00a9:
                java.lang.String r0 = "yeelink.light.bslamp3"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x00b2
                goto L_0x00a6
            L_0x00b2:
                r0 = 81
                goto L_0x0509
            L_0x00b6:
                java.lang.String r0 = "yeelink.light.bslamp2"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x00bf
                goto L_0x00a6
            L_0x00bf:
                r0 = 80
                goto L_0x0509
            L_0x00c3:
                java.lang.String r0 = "yeelink.light.bslamp1"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x00cc
                goto L_0x00a6
            L_0x00cc:
                r0 = 79
                goto L_0x0509
            L_0x00d0:
                java.lang.String r0 = "yeelink.light.ctc"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x00d9
                goto L_0x00a6
            L_0x00d9:
                r0 = 78
                goto L_0x0509
            L_0x00dd:
                java.lang.String r0 = "yeelink.light.cta"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x00e6
                goto L_0x00a6
            L_0x00e6:
                r0 = 77
                goto L_0x0509
            L_0x00ea:
                java.lang.String r0 = "yeelink.light.ct2"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x00f3
                goto L_0x00a6
            L_0x00f3:
                r0 = 76
                goto L_0x0509
            L_0x00f7:
                java.lang.String r0 = "yeelink.light.ceiling8"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0100
                goto L_0x00a6
            L_0x0100:
                r0 = 75
                goto L_0x0509
            L_0x0104:
                java.lang.String r0 = "yeelink.light.ceiling7"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x010d
                goto L_0x00a6
            L_0x010d:
                r0 = 74
                goto L_0x0509
            L_0x0111:
                java.lang.String r0 = "yeelink.light.ceiling6"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x011a
                goto L_0x00a6
            L_0x011a:
                r0 = 73
                goto L_0x0509
            L_0x011e:
                java.lang.String r0 = "yeelink.light.ceiling5"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0128
                goto L_0x00a6
            L_0x0128:
                r0 = 72
                goto L_0x0509
            L_0x012c:
                java.lang.String r0 = "yeelink.light.ceiling4"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0136
                goto L_0x00a6
            L_0x0136:
                r0 = 71
                goto L_0x0509
            L_0x013a:
                java.lang.String r0 = "yeelink.light.ceiling3"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0144
                goto L_0x00a6
            L_0x0144:
                r0 = 70
                goto L_0x0509
            L_0x0148:
                java.lang.String r0 = "yeelink.light.ceiling2"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0152
                goto L_0x00a6
            L_0x0152:
                r0 = 69
                goto L_0x0509
            L_0x0156:
                java.lang.String r0 = "yeelink.light.ceiling1"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0160
                goto L_0x00a6
            L_0x0160:
                r0 = 68
                goto L_0x0509
            L_0x0164:
                java.lang.String r0 = "yeelink.light.monob"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x016e
                goto L_0x00a6
            L_0x016e:
                r0 = 67
                goto L_0x0509
            L_0x0172:
                java.lang.String r0 = "yeelink.light.monoa"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x017c
                goto L_0x00a6
            L_0x017c:
                r0 = 66
                goto L_0x0509
            L_0x0180:
                java.lang.String r0 = "yeelink.light.mono5"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x018a
                goto L_0x00a6
            L_0x018a:
                r0 = 65
                goto L_0x0509
            L_0x018e:
                java.lang.String r0 = "yeelink.light.mono4"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0198
                goto L_0x00a6
            L_0x0198:
                r0 = 64
                goto L_0x0509
            L_0x019c:
                java.lang.String r0 = "yeelink.light.mono2"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x01a6
                goto L_0x00a6
            L_0x01a6:
                r0 = 63
                goto L_0x0509
            L_0x01aa:
                java.lang.String r0 = "yeelink.light.mono1"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x01b4
                goto L_0x00a6
            L_0x01b4:
                r0 = 62
                goto L_0x0509
            L_0x01b8:
                java.lang.String r0 = "yeelink.light.lamp9"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x01c2
                goto L_0x00a6
            L_0x01c2:
                r0 = 61
                goto L_0x0509
            L_0x01c6:
                java.lang.String r0 = "yeelink.light.lamp8"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x01d0
                goto L_0x00a6
            L_0x01d0:
                r0 = 60
                goto L_0x0509
            L_0x01d4:
                java.lang.String r0 = "yeelink.light.lamp7"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x01de
                goto L_0x00a6
            L_0x01de:
                r0 = 59
                goto L_0x0509
            L_0x01e2:
                java.lang.String r0 = "yeelink.light.lamp4"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x01ec
                goto L_0x00a6
            L_0x01ec:
                r0 = 58
                goto L_0x0509
            L_0x01f0:
                java.lang.String r0 = "yeelink.light.lamp3"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x01fa
                goto L_0x00a6
            L_0x01fa:
                r0 = 57
                goto L_0x0509
            L_0x01fe:
                java.lang.String r0 = "yeelink.light.lamp2"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0208
                goto L_0x00a6
            L_0x0208:
                r0 = 56
                goto L_0x0509
            L_0x020c:
                java.lang.String r0 = "yeelink.light.lamp1"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0216
                goto L_0x00a6
            L_0x0216:
                r0 = 55
                goto L_0x0509
            L_0x021a:
                java.lang.String r0 = "yeelink.light.ceile"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0224
                goto L_0x00a6
            L_0x0224:
                r0 = 54
                goto L_0x0509
            L_0x0228:
                java.lang.String r0 = "yeelink.light.ceild"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0232
                goto L_0x00a6
            L_0x0232:
                r0 = 53
                goto L_0x0509
            L_0x0236:
                java.lang.String r0 = "yeelink.light.ceilc"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0240
                goto L_0x00a6
            L_0x0240:
                r0 = 52
                goto L_0x0509
            L_0x0244:
                java.lang.String r0 = "yeelink.light.ceilb"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x024e
                goto L_0x00a6
            L_0x024e:
                r0 = 51
                goto L_0x0509
            L_0x0252:
                java.lang.String r0 = "yeelink.light.ceila"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x025c
                goto L_0x00a6
            L_0x025c:
                r0 = 50
                goto L_0x0509
            L_0x0260:
                java.lang.String r0 = "yeelink.light.stripa"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x026a
                goto L_0x00a6
            L_0x026a:
                r0 = 49
                goto L_0x0509
            L_0x026e:
                java.lang.String r0 = "yeelink.light.strip8"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0278
                goto L_0x00a6
            L_0x0278:
                r0 = 48
                goto L_0x0509
            L_0x027c:
                java.lang.String r0 = "yeelink.light.strip6"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0286
                goto L_0x00a6
            L_0x0286:
                r0 = 47
                goto L_0x0509
            L_0x028a:
                java.lang.String r0 = "yeelink.light.strip4"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0294
                goto L_0x00a6
            L_0x0294:
                r0 = 46
                goto L_0x0509
            L_0x0298:
                java.lang.String r0 = "yeelink.light.strip2"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x02a2
                goto L_0x00a6
            L_0x02a2:
                r0 = 45
                goto L_0x0509
            L_0x02a6:
                java.lang.String r0 = "yeelink.light.strip1"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x02b0
                goto L_0x00a6
            L_0x02b0:
                r0 = 44
                goto L_0x0509
            L_0x02b4:
                java.lang.String r0 = "yilai.light.ceiling3"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x02be
                goto L_0x00a6
            L_0x02be:
                r0 = 43
                goto L_0x0509
            L_0x02c2:
                java.lang.String r0 = "yilai.light.ceiling2"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x02cc
                goto L_0x00a6
            L_0x02cc:
                r0 = 42
                goto L_0x0509
            L_0x02d0:
                java.lang.String r0 = "yilai.light.ceiling1"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x02da
                goto L_0x00a6
            L_0x02da:
                r0 = 41
                goto L_0x0509
            L_0x02de:
                java.lang.String r0 = "yeelink.light.panel3"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x02e8
                goto L_0x00a6
            L_0x02e8:
                r0 = 40
                goto L_0x0509
            L_0x02ec:
                java.lang.String r0 = "yeelink.light.panel1"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x02f6
                goto L_0x00a6
            L_0x02f6:
                r0 = 39
                goto L_0x0509
            L_0x02fa:
                java.lang.String r0 = "yeelink.light.lamp19"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0304
                goto L_0x00a6
            L_0x0304:
                r0 = 38
                goto L_0x0509
            L_0x0308:
                java.lang.String r0 = "yeelink.light.lamp17"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0312
                goto L_0x00a6
            L_0x0312:
                r0 = 37
                goto L_0x0509
            L_0x0316:
                java.lang.String r0 = "yeelink.light.lamp15"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0320
                goto L_0x00a6
            L_0x0320:
                r0 = 36
                goto L_0x0509
            L_0x0324:
                java.lang.String r0 = "yeelink.light.lamp10"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x032e
                goto L_0x00a6
            L_0x032e:
                r0 = 35
                goto L_0x0509
            L_0x0332:
                java.lang.String r0 = "yeelink.light.colore"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x033c
                goto L_0x00a6
            L_0x033c:
                r0 = 34
                goto L_0x0509
            L_0x0340:
                java.lang.String r0 = "yeelink.light.colorc"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x034a
                goto L_0x00a6
            L_0x034a:
                r0 = 33
                goto L_0x0509
            L_0x034e:
                java.lang.String r0 = "yeelink.light.colorb"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0358
                goto L_0x00a6
            L_0x0358:
                r0 = 32
                goto L_0x0509
            L_0x035c:
                java.lang.String r0 = "yeelink.light.colora"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0366
                goto L_0x00a6
            L_0x0366:
                r0 = 31
                goto L_0x0509
            L_0x036a:
                java.lang.String r0 = "yeelink.light.color8"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0374
                goto L_0x00a6
            L_0x0374:
                r0 = 30
                goto L_0x0509
            L_0x0378:
                java.lang.String r0 = "yeelink.light.color6"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0382
                goto L_0x00a6
            L_0x0382:
                r0 = 29
                goto L_0x0509
            L_0x0386:
                java.lang.String r0 = "yeelink.light.color5"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0390
                goto L_0x00a6
            L_0x0390:
                r0 = 28
                goto L_0x0509
            L_0x0394:
                java.lang.String r0 = "yeelink.light.color4"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x039e
                goto L_0x00a6
            L_0x039e:
                r0 = 27
                goto L_0x0509
            L_0x03a2:
                java.lang.String r0 = "yeelink.light.color3"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x03ac
                goto L_0x00a6
            L_0x03ac:
                r0 = 26
                goto L_0x0509
            L_0x03b0:
                java.lang.String r0 = "yeelink.light.color2"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x03ba
                goto L_0x00a6
            L_0x03ba:
                r0 = 25
                goto L_0x0509
            L_0x03be:
                java.lang.String r0 = "yeelink.light.color1"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x03c8
                goto L_0x00a6
            L_0x03c8:
                r0 = 24
                goto L_0x0509
            L_0x03cc:
                java.lang.String r0 = "yeelink.light.ceil35"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x03d6
                goto L_0x00a6
            L_0x03d6:
                r0 = 23
                goto L_0x0509
            L_0x03da:
                java.lang.String r0 = "yeelink.light.ceil33"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x03e4
                goto L_0x00a6
            L_0x03e4:
                r0 = 22
                goto L_0x0509
            L_0x03e8:
                java.lang.String r0 = "yeelink.light.ceil32"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x03f2
                goto L_0x00a6
            L_0x03f2:
                r0 = 21
                goto L_0x0509
            L_0x03f6:
                java.lang.String r0 = "yeelink.light.ceil31"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0400
                goto L_0x00a6
            L_0x0400:
                r0 = 20
                goto L_0x0509
            L_0x0404:
                java.lang.String r0 = "yeelink.light.ceil30"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x040e
                goto L_0x00a6
            L_0x040e:
                r0 = 19
                goto L_0x0509
            L_0x0412:
                java.lang.String r0 = "yeelink.light.ceil29"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x041c
                goto L_0x00a6
            L_0x041c:
                r0 = 18
                goto L_0x0509
            L_0x0420:
                java.lang.String r0 = "yeelink.light.ceil27"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x042a
                goto L_0x00a6
            L_0x042a:
                r0 = 17
                goto L_0x0509
            L_0x042e:
                java.lang.String r0 = "yeelink.light.ceil26"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0438
                goto L_0x00a6
            L_0x0438:
                r0 = 16
                goto L_0x0509
            L_0x043c:
                java.lang.String r0 = "yeelink.light.ceiling24"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0446
                goto L_0x00a6
            L_0x0446:
                r0 = 15
                goto L_0x0509
            L_0x044a:
                java.lang.String r0 = "yeelink.light.ceiling23"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0454
                goto L_0x00a6
            L_0x0454:
                r0 = 14
                goto L_0x0509
            L_0x0458:
                java.lang.String r0 = "yeelink.light.ceiling22"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0462
                goto L_0x00a6
            L_0x0462:
                r0 = 13
                goto L_0x0509
            L_0x0466:
                java.lang.String r0 = "yeelink.light.ceiling21"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0470
                goto L_0x00a6
            L_0x0470:
                r0 = 12
                goto L_0x0509
            L_0x0474:
                java.lang.String r0 = "yeelink.light.ceiling20"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x047e
                goto L_0x00a6
            L_0x047e:
                r0 = 11
                goto L_0x0509
            L_0x0482:
                java.lang.String r0 = "yeelink.light.ceiling19"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x048c
                goto L_0x00a6
            L_0x048c:
                r0 = 10
                goto L_0x0509
            L_0x0490:
                java.lang.String r0 = "yeelink.light.ceiling18"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x049a
                goto L_0x00a6
            L_0x049a:
                r0 = 9
                goto L_0x0509
            L_0x049e:
                java.lang.String r0 = "yeelink.light.ceiling17"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x04a8
                goto L_0x00a6
            L_0x04a8:
                r0 = 8
                goto L_0x0509
            L_0x04ab:
                java.lang.String r0 = "yeelink.light.ceiling16"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x04b5
                goto L_0x00a6
            L_0x04b5:
                r0 = 7
                goto L_0x0509
            L_0x04b7:
                java.lang.String r0 = "yeelink.light.ceiling15"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x04c1
                goto L_0x00a6
            L_0x04c1:
                r0 = 6
                goto L_0x0509
            L_0x04c3:
                java.lang.String r0 = "yeelink.light.ceiling14"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x04cd
                goto L_0x00a6
            L_0x04cd:
                r0 = 5
                goto L_0x0509
            L_0x04cf:
                java.lang.String r0 = "yeelink.light.ceiling13"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x04d9
                goto L_0x00a6
            L_0x04d9:
                r0 = 4
                goto L_0x0509
            L_0x04db:
                java.lang.String r0 = "yeelink.light.ceiling12"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x04e5
                goto L_0x00a6
            L_0x04e5:
                r0 = 3
                goto L_0x0509
            L_0x04e7:
                java.lang.String r0 = "yeelink.light.ceiling11"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x04f1
                goto L_0x00a6
            L_0x04f1:
                r0 = 2
                goto L_0x0509
            L_0x04f3:
                java.lang.String r0 = "yeelink.light.ceiling10"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x04fd
                goto L_0x00a6
            L_0x04fd:
                r0 = 1
                goto L_0x0509
            L_0x04ff:
                java.lang.String r3 = "yeelink.bhf_light.v1"
                boolean r1 = r1.equals(r3)
                if (r1 != 0) goto L_0x0509
                goto L_0x00a6
            L_0x0509:
                switch(r0) {
                    case 0: goto L_0x0540;
                    case 1: goto L_0x0540;
                    case 2: goto L_0x0540;
                    case 3: goto L_0x0540;
                    case 4: goto L_0x0540;
                    case 5: goto L_0x0540;
                    case 6: goto L_0x0540;
                    case 7: goto L_0x0540;
                    case 8: goto L_0x0540;
                    case 9: goto L_0x0540;
                    case 10: goto L_0x0540;
                    case 11: goto L_0x0540;
                    case 12: goto L_0x0540;
                    case 13: goto L_0x0540;
                    case 14: goto L_0x0540;
                    case 15: goto L_0x0540;
                    case 16: goto L_0x0540;
                    case 17: goto L_0x0540;
                    case 18: goto L_0x0540;
                    case 19: goto L_0x0540;
                    case 20: goto L_0x0540;
                    case 21: goto L_0x0540;
                    case 22: goto L_0x0540;
                    case 23: goto L_0x0540;
                    case 24: goto L_0x0528;
                    case 25: goto L_0x0528;
                    case 26: goto L_0x0528;
                    case 27: goto L_0x0528;
                    case 28: goto L_0x0528;
                    case 29: goto L_0x0528;
                    case 30: goto L_0x0528;
                    case 31: goto L_0x0528;
                    case 32: goto L_0x0528;
                    case 33: goto L_0x0528;
                    case 34: goto L_0x0528;
                    case 35: goto L_0x0528;
                    case 36: goto L_0x0540;
                    case 37: goto L_0x0510;
                    case 38: goto L_0x0528;
                    case 39: goto L_0x0510;
                    case 40: goto L_0x0540;
                    case 41: goto L_0x0540;
                    case 42: goto L_0x0540;
                    case 43: goto L_0x0540;
                    case 44: goto L_0x0528;
                    case 45: goto L_0x0528;
                    case 46: goto L_0x0540;
                    case 47: goto L_0x0528;
                    case 48: goto L_0x0528;
                    case 49: goto L_0x0528;
                    case 50: goto L_0x0540;
                    case 51: goto L_0x0540;
                    case 52: goto L_0x0540;
                    case 53: goto L_0x0540;
                    case 54: goto L_0x0540;
                    case 55: goto L_0x0540;
                    case 56: goto L_0x0540;
                    case 57: goto L_0x0510;
                    case 58: goto L_0x0540;
                    case 59: goto L_0x0540;
                    case 60: goto L_0x0540;
                    case 61: goto L_0x0540;
                    case 62: goto L_0x0510;
                    case 63: goto L_0x0510;
                    case 64: goto L_0x0510;
                    case 65: goto L_0x0510;
                    case 66: goto L_0x0510;
                    case 67: goto L_0x0510;
                    case 68: goto L_0x0540;
                    case 69: goto L_0x0510;
                    case 70: goto L_0x0540;
                    case 71: goto L_0x0540;
                    case 72: goto L_0x0540;
                    case 73: goto L_0x0540;
                    case 74: goto L_0x0540;
                    case 75: goto L_0x0540;
                    case 76: goto L_0x0540;
                    case 77: goto L_0x0540;
                    case 78: goto L_0x0540;
                    case 79: goto L_0x0528;
                    case 80: goto L_0x0528;
                    case 81: goto L_0x0528;
                    default: goto L_0x050c;
                }
            L_0x050c:
                r10.m16756c(r11, r13)
                goto L_0x0569
            L_0x0510:
                int[] r0 = com.yeelight.cherry.p141ui.activity.PersonalityLightPreviewActivity.C5528d.f11015a
                com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity r1 = com.yeelight.cherry.p141ui.activity.PersonalityLightPreviewActivity.this
                com.yeelight.yeelib.models.CustomAdvancedFlowScene$LightMode r1 = r1.f11010d
                int r1 = r1.ordinal()
                r0 = r0[r1]
                if (r0 == r8) goto L_0x0521
                goto L_0x050c
            L_0x0521:
                boolean r0 = r11.mo23229n0(r7)
                if (r0 == 0) goto L_0x050c
                goto L_0x0538
            L_0x0528:
                int[] r0 = com.yeelight.cherry.p141ui.activity.PersonalityLightPreviewActivity.C5528d.f11015a
                com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity r1 = com.yeelight.cherry.p141ui.activity.PersonalityLightPreviewActivity.this
                com.yeelight.yeelib.models.CustomAdvancedFlowScene$LightMode r1 = r1.f11010d
                int r1 = r1.ordinal()
                r0 = r0[r1]
                if (r0 == r8) goto L_0x0539
            L_0x0538:
                goto L_0x055b
            L_0x0539:
                boolean r0 = r11.mo23229n0(r7)
                if (r0 == 0) goto L_0x050c
                goto L_0x0538
            L_0x0540:
                int[] r0 = com.yeelight.cherry.p141ui.activity.PersonalityLightPreviewActivity.C5528d.f11015a
                com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity r1 = com.yeelight.cherry.p141ui.activity.PersonalityLightPreviewActivity.this
                com.yeelight.yeelib.models.CustomAdvancedFlowScene$LightMode r1 = r1.f11010d
                int r1 = r1.ordinal()
                r0 = r0[r1]
                if (r0 == r8) goto L_0x055f
                if (r0 == r6) goto L_0x055b
                if (r0 == r5) goto L_0x050c
                if (r0 == r4) goto L_0x0557
                goto L_0x050c
            L_0x0557:
                r10.m16755b(r11, r13)
                goto L_0x050c
            L_0x055b:
                r10.m16755b(r11, r13)
                goto L_0x0569
            L_0x055f:
                boolean r0 = r11.mo23229n0(r7)
                if (r0 == 0) goto L_0x050c
                goto L_0x055b
            L_0x0566:
                r10.m16754a(r13)
            L_0x0569:
                android.widget.LinearLayout r0 = r13.f11024d
                com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity$e$a r1 = new com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity$e$a
                r1.<init>(r13, r11)
                r0.setOnClickListener(r1)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.activity.PersonalityLightPreviewActivity.C5529e.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightPreviewActivity$f */
    static class C5532f {

        /* renamed from: a */
        public ImageView f11021a;

        /* renamed from: b */
        public TextView f11022b;

        /* renamed from: c */
        public TextView f11023c;

        /* renamed from: d */
        public LinearLayout f11024d;

        /* renamed from: e */
        public boolean f11025e = false;

        C5532f() {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:258:0x04b6, code lost:
        if (r2.mo23229n0(31) == false) goto L_0x04a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x04ca, code lost:
        if (r2.mo23229n0(31) != false) goto L_0x04e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x04e0, code lost:
        r11.f11008b.add(r2);
     */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m16753Y() {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.yeelight.yeelib.managers.YeelightDeviceManager r1 = com.yeelight.yeelib.managers.YeelightDeviceManager.m7800o0()
            java.util.List r1 = r1.mo23258D0()
            java.util.Iterator r1 = r1.iterator()
        L_0x0011:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x04ee
            java.lang.Object r2 = r1.next()
            com.yeelight.yeelib.device.WifiDeviceBase r2 = (com.yeelight.yeelib.device.WifiDeviceBase) r2
            boolean r3 = r2.mo23230o0()
            if (r3 == 0) goto L_0x04a0
            java.lang.String r3 = r2.mo23208T()
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 31
            r10 = 1
            switch(r5) {
                case -1644531059: goto L_0x0493;
                case -1462015191: goto L_0x0488;
                case -1462015190: goto L_0x047d;
                case -1462015189: goto L_0x0472;
                case -1462015188: goto L_0x0467;
                case -1462015187: goto L_0x045c;
                case -1462015186: goto L_0x0451;
                case -1462015185: goto L_0x0446;
                case -1462015184: goto L_0x0438;
                case -1462015183: goto L_0x042a;
                case -1462015182: goto L_0x041c;
                case -1462015160: goto L_0x040e;
                case -1462015159: goto L_0x0400;
                case -1462015158: goto L_0x03f2;
                case -1462015157: goto L_0x03e4;
                case -1462015156: goto L_0x03d6;
                case -1317475940: goto L_0x03c8;
                case -1317475939: goto L_0x03ba;
                case -1317475937: goto L_0x03ac;
                case -1317475915: goto L_0x039e;
                case -1317475914: goto L_0x0390;
                case -1317475913: goto L_0x0382;
                case -1317475912: goto L_0x0374;
                case -1317475910: goto L_0x0366;
                case -1308146495: goto L_0x0358;
                case -1308146494: goto L_0x034a;
                case -1308146493: goto L_0x033c;
                case -1308146492: goto L_0x032e;
                case -1308146491: goto L_0x0320;
                case -1308146490: goto L_0x0312;
                case -1308146488: goto L_0x0304;
                case -1308146447: goto L_0x02f6;
                case -1308146446: goto L_0x02e8;
                case -1308146445: goto L_0x02da;
                case -1308146443: goto L_0x02cc;
                case -1063384694: goto L_0x02be;
                case -1063384689: goto L_0x02b0;
                case -1063384687: goto L_0x02a2;
                case -1063384685: goto L_0x0294;
                case -948847040: goto L_0x0286;
                case -948847038: goto L_0x0278;
                case -888668266: goto L_0x026a;
                case -888668265: goto L_0x025c;
                case -888668264: goto L_0x024e;
                case -845289556: goto L_0x0240;
                case -845289555: goto L_0x0232;
                case -845289553: goto L_0x0224;
                case -845289551: goto L_0x0216;
                case -845289549: goto L_0x0208;
                case -845289508: goto L_0x01fa;
                case -458141175: goto L_0x01ec;
                case -458141174: goto L_0x01de;
                case -458141173: goto L_0x01d0;
                case -458141172: goto L_0x01c2;
                case -458141171: goto L_0x01b4;
                case -449944730: goto L_0x01a6;
                case -449944729: goto L_0x0198;
                case -449944728: goto L_0x018a;
                case -449944727: goto L_0x017c;
                case -449944724: goto L_0x016e;
                case -449944723: goto L_0x0160;
                case -449944722: goto L_0x0152;
                case -448603205: goto L_0x0144;
                case -448603204: goto L_0x0136;
                case -448603202: goto L_0x0128;
                case -448603201: goto L_0x011a;
                case -448603157: goto L_0x010c;
                case -448603156: goto L_0x00fe;
                case 922669543: goto L_0x00f0;
                case 922669544: goto L_0x00e2;
                case 922669545: goto L_0x00d4;
                case 922669546: goto L_0x00c6;
                case 922669547: goto L_0x00b8;
                case 922669548: goto L_0x00aa;
                case 922669549: goto L_0x009c;
                case 922669550: goto L_0x008e;
                case 1201756974: goto L_0x0080;
                case 1201757021: goto L_0x0072;
                case 1201757023: goto L_0x0064;
                case 1623724661: goto L_0x0056;
                case 1623724662: goto L_0x0048;
                case 1623724663: goto L_0x003a;
                default: goto L_0x0038;
            }
        L_0x0038:
            goto L_0x049d
        L_0x003a:
            java.lang.String r5 = "yeelink.light.bslamp3"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0044
            goto L_0x049d
        L_0x0044:
            r4 = 81
            goto L_0x049d
        L_0x0048:
            java.lang.String r5 = "yeelink.light.bslamp2"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0052
            goto L_0x049d
        L_0x0052:
            r4 = 80
            goto L_0x049d
        L_0x0056:
            java.lang.String r5 = "yeelink.light.bslamp1"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0060
            goto L_0x049d
        L_0x0060:
            r4 = 79
            goto L_0x049d
        L_0x0064:
            java.lang.String r5 = "yeelink.light.ctc"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x006e
            goto L_0x049d
        L_0x006e:
            r4 = 78
            goto L_0x049d
        L_0x0072:
            java.lang.String r5 = "yeelink.light.cta"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x007c
            goto L_0x049d
        L_0x007c:
            r4 = 77
            goto L_0x049d
        L_0x0080:
            java.lang.String r5 = "yeelink.light.ct2"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x008a
            goto L_0x049d
        L_0x008a:
            r4 = 76
            goto L_0x049d
        L_0x008e:
            java.lang.String r5 = "yeelink.light.ceiling8"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0098
            goto L_0x049d
        L_0x0098:
            r4 = 75
            goto L_0x049d
        L_0x009c:
            java.lang.String r5 = "yeelink.light.ceiling7"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x00a6
            goto L_0x049d
        L_0x00a6:
            r4 = 74
            goto L_0x049d
        L_0x00aa:
            java.lang.String r5 = "yeelink.light.ceiling6"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x00b4
            goto L_0x049d
        L_0x00b4:
            r4 = 73
            goto L_0x049d
        L_0x00b8:
            java.lang.String r5 = "yeelink.light.ceiling5"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x00c2
            goto L_0x049d
        L_0x00c2:
            r4 = 72
            goto L_0x049d
        L_0x00c6:
            java.lang.String r5 = "yeelink.light.ceiling4"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x00d0
            goto L_0x049d
        L_0x00d0:
            r4 = 71
            goto L_0x049d
        L_0x00d4:
            java.lang.String r5 = "yeelink.light.ceiling3"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x00de
            goto L_0x049d
        L_0x00de:
            r4 = 70
            goto L_0x049d
        L_0x00e2:
            java.lang.String r5 = "yeelink.light.ceiling2"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x00ec
            goto L_0x049d
        L_0x00ec:
            r4 = 69
            goto L_0x049d
        L_0x00f0:
            java.lang.String r5 = "yeelink.light.ceiling1"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x00fa
            goto L_0x049d
        L_0x00fa:
            r4 = 68
            goto L_0x049d
        L_0x00fe:
            java.lang.String r5 = "yeelink.light.monob"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0108
            goto L_0x049d
        L_0x0108:
            r4 = 67
            goto L_0x049d
        L_0x010c:
            java.lang.String r5 = "yeelink.light.monoa"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0116
            goto L_0x049d
        L_0x0116:
            r4 = 66
            goto L_0x049d
        L_0x011a:
            java.lang.String r5 = "yeelink.light.mono5"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0124
            goto L_0x049d
        L_0x0124:
            r4 = 65
            goto L_0x049d
        L_0x0128:
            java.lang.String r5 = "yeelink.light.mono4"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0132
            goto L_0x049d
        L_0x0132:
            r4 = 64
            goto L_0x049d
        L_0x0136:
            java.lang.String r5 = "yeelink.light.mono2"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0140
            goto L_0x049d
        L_0x0140:
            r4 = 63
            goto L_0x049d
        L_0x0144:
            java.lang.String r5 = "yeelink.light.mono1"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x014e
            goto L_0x049d
        L_0x014e:
            r4 = 62
            goto L_0x049d
        L_0x0152:
            java.lang.String r5 = "yeelink.light.lamp9"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x015c
            goto L_0x049d
        L_0x015c:
            r4 = 61
            goto L_0x049d
        L_0x0160:
            java.lang.String r5 = "yeelink.light.lamp8"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x016a
            goto L_0x049d
        L_0x016a:
            r4 = 60
            goto L_0x049d
        L_0x016e:
            java.lang.String r5 = "yeelink.light.lamp7"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0178
            goto L_0x049d
        L_0x0178:
            r4 = 59
            goto L_0x049d
        L_0x017c:
            java.lang.String r5 = "yeelink.light.lamp4"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0186
            goto L_0x049d
        L_0x0186:
            r4 = 58
            goto L_0x049d
        L_0x018a:
            java.lang.String r5 = "yeelink.light.lamp3"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0194
            goto L_0x049d
        L_0x0194:
            r4 = 57
            goto L_0x049d
        L_0x0198:
            java.lang.String r5 = "yeelink.light.lamp2"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x01a2
            goto L_0x049d
        L_0x01a2:
            r4 = 56
            goto L_0x049d
        L_0x01a6:
            java.lang.String r5 = "yeelink.light.lamp1"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x01b0
            goto L_0x049d
        L_0x01b0:
            r4 = 55
            goto L_0x049d
        L_0x01b4:
            java.lang.String r5 = "yeelink.light.ceile"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x01be
            goto L_0x049d
        L_0x01be:
            r4 = 54
            goto L_0x049d
        L_0x01c2:
            java.lang.String r5 = "yeelink.light.ceild"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x01cc
            goto L_0x049d
        L_0x01cc:
            r4 = 53
            goto L_0x049d
        L_0x01d0:
            java.lang.String r5 = "yeelink.light.ceilc"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x01da
            goto L_0x049d
        L_0x01da:
            r4 = 52
            goto L_0x049d
        L_0x01de:
            java.lang.String r5 = "yeelink.light.ceilb"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x01e8
            goto L_0x049d
        L_0x01e8:
            r4 = 51
            goto L_0x049d
        L_0x01ec:
            java.lang.String r5 = "yeelink.light.ceila"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x01f6
            goto L_0x049d
        L_0x01f6:
            r4 = 50
            goto L_0x049d
        L_0x01fa:
            java.lang.String r5 = "yeelink.light.stripa"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0204
            goto L_0x049d
        L_0x0204:
            r4 = 49
            goto L_0x049d
        L_0x0208:
            java.lang.String r5 = "yeelink.light.strip8"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0212
            goto L_0x049d
        L_0x0212:
            r4 = 48
            goto L_0x049d
        L_0x0216:
            java.lang.String r5 = "yeelink.light.strip6"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0220
            goto L_0x049d
        L_0x0220:
            r4 = 47
            goto L_0x049d
        L_0x0224:
            java.lang.String r5 = "yeelink.light.strip4"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x022e
            goto L_0x049d
        L_0x022e:
            r4 = 46
            goto L_0x049d
        L_0x0232:
            java.lang.String r5 = "yeelink.light.strip2"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x023c
            goto L_0x049d
        L_0x023c:
            r4 = 45
            goto L_0x049d
        L_0x0240:
            java.lang.String r5 = "yeelink.light.strip1"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x024a
            goto L_0x049d
        L_0x024a:
            r4 = 44
            goto L_0x049d
        L_0x024e:
            java.lang.String r5 = "yilai.light.ceiling3"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0258
            goto L_0x049d
        L_0x0258:
            r4 = 43
            goto L_0x049d
        L_0x025c:
            java.lang.String r5 = "yilai.light.ceiling2"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0266
            goto L_0x049d
        L_0x0266:
            r4 = 42
            goto L_0x049d
        L_0x026a:
            java.lang.String r5 = "yilai.light.ceiling1"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0274
            goto L_0x049d
        L_0x0274:
            r4 = 41
            goto L_0x049d
        L_0x0278:
            java.lang.String r5 = "yeelink.light.panel3"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0282
            goto L_0x049d
        L_0x0282:
            r4 = 40
            goto L_0x049d
        L_0x0286:
            java.lang.String r5 = "yeelink.light.panel1"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0290
            goto L_0x049d
        L_0x0290:
            r4 = 39
            goto L_0x049d
        L_0x0294:
            java.lang.String r5 = "yeelink.light.lamp19"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x029e
            goto L_0x049d
        L_0x029e:
            r4 = 38
            goto L_0x049d
        L_0x02a2:
            java.lang.String r5 = "yeelink.light.lamp17"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x02ac
            goto L_0x049d
        L_0x02ac:
            r4 = 37
            goto L_0x049d
        L_0x02b0:
            java.lang.String r5 = "yeelink.light.lamp15"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x02ba
            goto L_0x049d
        L_0x02ba:
            r4 = 36
            goto L_0x049d
        L_0x02be:
            java.lang.String r5 = "yeelink.light.lamp10"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x02c8
            goto L_0x049d
        L_0x02c8:
            r4 = 35
            goto L_0x049d
        L_0x02cc:
            java.lang.String r5 = "yeelink.light.colore"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x02d6
            goto L_0x049d
        L_0x02d6:
            r4 = 34
            goto L_0x049d
        L_0x02da:
            java.lang.String r5 = "yeelink.light.colorc"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x02e4
            goto L_0x049d
        L_0x02e4:
            r4 = 33
            goto L_0x049d
        L_0x02e8:
            java.lang.String r5 = "yeelink.light.colorb"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x02f2
            goto L_0x049d
        L_0x02f2:
            r4 = 32
            goto L_0x049d
        L_0x02f6:
            java.lang.String r5 = "yeelink.light.colora"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0300
            goto L_0x049d
        L_0x0300:
            r4 = 31
            goto L_0x049d
        L_0x0304:
            java.lang.String r5 = "yeelink.light.color8"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x030e
            goto L_0x049d
        L_0x030e:
            r4 = 30
            goto L_0x049d
        L_0x0312:
            java.lang.String r5 = "yeelink.light.color6"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x031c
            goto L_0x049d
        L_0x031c:
            r4 = 29
            goto L_0x049d
        L_0x0320:
            java.lang.String r5 = "yeelink.light.color5"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x032a
            goto L_0x049d
        L_0x032a:
            r4 = 28
            goto L_0x049d
        L_0x032e:
            java.lang.String r5 = "yeelink.light.color4"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0338
            goto L_0x049d
        L_0x0338:
            r4 = 27
            goto L_0x049d
        L_0x033c:
            java.lang.String r5 = "yeelink.light.color3"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0346
            goto L_0x049d
        L_0x0346:
            r4 = 26
            goto L_0x049d
        L_0x034a:
            java.lang.String r5 = "yeelink.light.color2"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0354
            goto L_0x049d
        L_0x0354:
            r4 = 25
            goto L_0x049d
        L_0x0358:
            java.lang.String r5 = "yeelink.light.color1"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0362
            goto L_0x049d
        L_0x0362:
            r4 = 24
            goto L_0x049d
        L_0x0366:
            java.lang.String r5 = "yeelink.light.ceil35"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0370
            goto L_0x049d
        L_0x0370:
            r4 = 23
            goto L_0x049d
        L_0x0374:
            java.lang.String r5 = "yeelink.light.ceil33"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x037e
            goto L_0x049d
        L_0x037e:
            r4 = 22
            goto L_0x049d
        L_0x0382:
            java.lang.String r5 = "yeelink.light.ceil32"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x038c
            goto L_0x049d
        L_0x038c:
            r4 = 21
            goto L_0x049d
        L_0x0390:
            java.lang.String r5 = "yeelink.light.ceil31"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x039a
            goto L_0x049d
        L_0x039a:
            r4 = 20
            goto L_0x049d
        L_0x039e:
            java.lang.String r5 = "yeelink.light.ceil30"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x03a8
            goto L_0x049d
        L_0x03a8:
            r4 = 19
            goto L_0x049d
        L_0x03ac:
            java.lang.String r5 = "yeelink.light.ceil29"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x03b6
            goto L_0x049d
        L_0x03b6:
            r4 = 18
            goto L_0x049d
        L_0x03ba:
            java.lang.String r5 = "yeelink.light.ceil27"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x03c4
            goto L_0x049d
        L_0x03c4:
            r4 = 17
            goto L_0x049d
        L_0x03c8:
            java.lang.String r5 = "yeelink.light.ceil26"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x03d2
            goto L_0x049d
        L_0x03d2:
            r4 = 16
            goto L_0x049d
        L_0x03d6:
            java.lang.String r5 = "yeelink.light.ceiling24"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x03e0
            goto L_0x049d
        L_0x03e0:
            r4 = 15
            goto L_0x049d
        L_0x03e4:
            java.lang.String r5 = "yeelink.light.ceiling23"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x03ee
            goto L_0x049d
        L_0x03ee:
            r4 = 14
            goto L_0x049d
        L_0x03f2:
            java.lang.String r5 = "yeelink.light.ceiling22"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x03fc
            goto L_0x049d
        L_0x03fc:
            r4 = 13
            goto L_0x049d
        L_0x0400:
            java.lang.String r5 = "yeelink.light.ceiling21"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x040a
            goto L_0x049d
        L_0x040a:
            r4 = 12
            goto L_0x049d
        L_0x040e:
            java.lang.String r5 = "yeelink.light.ceiling20"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0418
            goto L_0x049d
        L_0x0418:
            r4 = 11
            goto L_0x049d
        L_0x041c:
            java.lang.String r5 = "yeelink.light.ceiling19"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0426
            goto L_0x049d
        L_0x0426:
            r4 = 10
            goto L_0x049d
        L_0x042a:
            java.lang.String r5 = "yeelink.light.ceiling18"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0434
            goto L_0x049d
        L_0x0434:
            r4 = 9
            goto L_0x049d
        L_0x0438:
            java.lang.String r5 = "yeelink.light.ceiling17"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0442
            goto L_0x049d
        L_0x0442:
            r4 = 8
            goto L_0x049d
        L_0x0446:
            java.lang.String r5 = "yeelink.light.ceiling16"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x044f
            goto L_0x049d
        L_0x044f:
            r4 = 7
            goto L_0x049d
        L_0x0451:
            java.lang.String r5 = "yeelink.light.ceiling15"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x045a
            goto L_0x049d
        L_0x045a:
            r4 = 6
            goto L_0x049d
        L_0x045c:
            java.lang.String r5 = "yeelink.light.ceiling14"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0465
            goto L_0x049d
        L_0x0465:
            r4 = 5
            goto L_0x049d
        L_0x0467:
            java.lang.String r5 = "yeelink.light.ceiling13"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0470
            goto L_0x049d
        L_0x0470:
            r4 = 4
            goto L_0x049d
        L_0x0472:
            java.lang.String r5 = "yeelink.light.ceiling12"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x047b
            goto L_0x049d
        L_0x047b:
            r4 = 3
            goto L_0x049d
        L_0x047d:
            java.lang.String r5 = "yeelink.light.ceiling11"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0486
            goto L_0x049d
        L_0x0486:
            r4 = 2
            goto L_0x049d
        L_0x0488:
            java.lang.String r5 = "yeelink.light.ceiling10"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0491
            goto L_0x049d
        L_0x0491:
            r4 = 1
            goto L_0x049d
        L_0x0493:
            java.lang.String r5 = "yeelink.bhf_light.v1"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x049c
            goto L_0x049d
        L_0x049c:
            r4 = 0
        L_0x049d:
            switch(r4) {
                case 0: goto L_0x04cd;
                case 1: goto L_0x04cd;
                case 2: goto L_0x04cd;
                case 3: goto L_0x04cd;
                case 4: goto L_0x04cd;
                case 5: goto L_0x04cd;
                case 6: goto L_0x04cd;
                case 7: goto L_0x04cd;
                case 8: goto L_0x04cd;
                case 9: goto L_0x04cd;
                case 10: goto L_0x04cd;
                case 11: goto L_0x04cd;
                case 12: goto L_0x04cd;
                case 13: goto L_0x04cd;
                case 14: goto L_0x04cd;
                case 15: goto L_0x04cd;
                case 16: goto L_0x04cd;
                case 17: goto L_0x04cd;
                case 18: goto L_0x04cd;
                case 19: goto L_0x04cd;
                case 20: goto L_0x04cd;
                case 21: goto L_0x04cd;
                case 22: goto L_0x04cd;
                case 23: goto L_0x04cd;
                case 24: goto L_0x04b9;
                case 25: goto L_0x04b9;
                case 26: goto L_0x04b9;
                case 27: goto L_0x04b9;
                case 28: goto L_0x04b9;
                case 29: goto L_0x04b9;
                case 30: goto L_0x04b9;
                case 31: goto L_0x04b9;
                case 32: goto L_0x04b9;
                case 33: goto L_0x04b9;
                case 34: goto L_0x04b9;
                case 35: goto L_0x04b9;
                case 36: goto L_0x04cd;
                case 37: goto L_0x04a5;
                case 38: goto L_0x04b9;
                case 39: goto L_0x04a5;
                case 40: goto L_0x04cd;
                case 41: goto L_0x04cd;
                case 42: goto L_0x04cd;
                case 43: goto L_0x04cd;
                case 44: goto L_0x04b9;
                case 45: goto L_0x04b9;
                case 46: goto L_0x04cd;
                case 47: goto L_0x04b9;
                case 48: goto L_0x04b9;
                case 49: goto L_0x04b9;
                case 50: goto L_0x04cd;
                case 51: goto L_0x04cd;
                case 52: goto L_0x04cd;
                case 53: goto L_0x04cd;
                case 54: goto L_0x04cd;
                case 55: goto L_0x04cd;
                case 56: goto L_0x04cd;
                case 57: goto L_0x04a5;
                case 58: goto L_0x04cd;
                case 59: goto L_0x04cd;
                case 60: goto L_0x04cd;
                case 61: goto L_0x04cd;
                case 62: goto L_0x04a5;
                case 63: goto L_0x04a5;
                case 64: goto L_0x04a5;
                case 65: goto L_0x04a5;
                case 66: goto L_0x04a5;
                case 67: goto L_0x04a5;
                case 68: goto L_0x04cd;
                case 69: goto L_0x04a5;
                case 70: goto L_0x04cd;
                case 71: goto L_0x04cd;
                case 72: goto L_0x04cd;
                case 73: goto L_0x04cd;
                case 74: goto L_0x04cd;
                case 75: goto L_0x04cd;
                case 76: goto L_0x04cd;
                case 77: goto L_0x04cd;
                case 78: goto L_0x04cd;
                case 79: goto L_0x04b9;
                case 80: goto L_0x04b9;
                case 81: goto L_0x04b9;
                default: goto L_0x04a0;
            }
        L_0x04a0:
            r0.add(r2)
            goto L_0x0011
        L_0x04a5:
            int[] r3 = com.yeelight.cherry.p141ui.activity.PersonalityLightPreviewActivity.C5528d.f11015a
            com.yeelight.yeelib.models.CustomAdvancedFlowScene$LightMode r4 = r11.f11010d
            int r4 = r4.ordinal()
            r3 = r3[r4]
            if (r3 == r10) goto L_0x04b2
            goto L_0x04a0
        L_0x04b2:
            boolean r3 = r2.mo23229n0(r9)
            if (r3 == 0) goto L_0x04a0
            goto L_0x04e0
        L_0x04b9:
            int[] r3 = com.yeelight.cherry.p141ui.activity.PersonalityLightPreviewActivity.C5528d.f11015a
            com.yeelight.yeelib.models.CustomAdvancedFlowScene$LightMode r4 = r11.f11010d
            int r4 = r4.ordinal()
            r3 = r3[r4]
            if (r3 == r10) goto L_0x04c6
            goto L_0x04e0
        L_0x04c6:
            boolean r3 = r2.mo23229n0(r9)
            if (r3 == 0) goto L_0x04a0
            goto L_0x04e0
        L_0x04cd:
            int[] r3 = com.yeelight.cherry.p141ui.activity.PersonalityLightPreviewActivity.C5528d.f11015a
            com.yeelight.yeelib.models.CustomAdvancedFlowScene$LightMode r4 = r11.f11010d
            int r4 = r4.ordinal()
            r3 = r3[r4]
            if (r3 == r10) goto L_0x04e7
            if (r3 == r8) goto L_0x04e0
            if (r3 == r7) goto L_0x04a0
            if (r3 == r6) goto L_0x04e0
            goto L_0x04a0
        L_0x04e0:
            java.util.List<com.yeelight.yeelib.device.WifiDeviceBase> r3 = r11.f11008b
            r3.add(r2)
            goto L_0x0011
        L_0x04e7:
            boolean r3 = r2.mo23229n0(r9)
            if (r3 == 0) goto L_0x04a0
            goto L_0x04e0
        L_0x04ee:
            java.util.List<com.yeelight.yeelib.device.WifiDeviceBase> r1 = r11.f11008b
            r1.addAll(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.activity.PersonalityLightPreviewActivity.m16753Y():void");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        boolean z = true;
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_personality_light_preview);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297591);
        commonTitleBar.mo36195a(getText(2131755315).toString(), new C5525a(), (View.OnClickListener) null);
        commonTitleBar.setTitleTextSize(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("custom_scene_index", -1);
        this.f11011e = intent.getBooleanExtra("custom_scene_preview", false);
        if (intExtra == -1 || intExtra == -2) {
            z = false;
        }
        if (!z) {
            this.f11009c = C3112v.m8242u().mo23566r();
        } else if (C3112v.m8242u().mo23558i() == null || C3112v.m8242u().mo23558i().size() == 0) {
            finish();
            return;
        } else {
            CustomAdvancedFlowScene customAdvancedFlowScene = C3112v.m8242u().mo23558i().get(intExtra);
            this.f11009c = customAdvancedFlowScene;
            customAdvancedFlowScene.mo35436c().mo35342l(this.f11009c.mo35436c().mo35340j() * this.f11009c.mo35436c().mo35338h().size());
        }
        this.f11010d = this.f11009c.mo35295c0();
        C5529e eVar = new C5529e(this, (C5525a) null);
        this.f11007a = eVar;
        ((ListView) findViewById(2131296669)).setAdapter(eVar);
        m16753Y();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        for (WifiDeviceBase W0 : this.f11008b) {
            W0.mo23213W0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        for (WifiDeviceBase B0 : this.f11008b) {
            B0.mo23178B0(this);
        }
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        Runnable runnable;
        if (!(i == 1 || i == 2)) {
            if (i == 2048) {
                m16753Y();
                runnable = new C5527c();
                runOnUiThread(runnable);
            } else if (i != 262144) {
                return;
            }
        }
        runnable = new C5526b();
        runOnUiThread(runnable);
    }
}
