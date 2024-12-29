package com.yeelight.yeelib.p194ui.appwidget;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.data.C7579c;
import com.yeelight.yeelib.data.C7601g;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.p150c.C5980c;
import com.yeelight.yeelib.p150c.C6005g;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p152f.C4257w;

/* renamed from: com.yeelight.yeelib.ui.appwidget.UpdateService */
public class UpdateService extends RemoteViewsService {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f19240a = UpdateService.class.getSimpleName();

    /* renamed from: b */
    public static String f19241b;

    /* renamed from: com.yeelight.yeelib.ui.appwidget.UpdateService$a */
    class C10370a implements RemoteViewsService.RemoteViewsFactory {

        /* renamed from: a */
        private C7601g f19242a;

        /* renamed from: b */
        private Context f19243b;

        /* renamed from: c */
        private int f19244c;

        /* renamed from: d */
        private final String f19245d;

        /* renamed from: e */
        private final String f19246e;

        /* renamed from: f */
        private final String f19247f;

        /* renamed from: g */
        private final String f19248g;

        /* renamed from: h */
        private final String f19249h;

        /* renamed from: i */
        private final String f19250i;

        /* renamed from: j */
        private final String f19251j;

        /* renamed from: k */
        private final String f19252k;

        /* renamed from: l */
        private final String f19253l;

        /* renamed from: m */
        private final String f19254m;

        /* renamed from: n */
        private final String f19255n;

        /* renamed from: o */
        private final String f19256o;

        public C10370a(UpdateService updateService, Context context, Intent intent) {
            this.f19243b = context;
            if (intent != null) {
                this.f19244c = intent.getIntExtra("appWidgetId", 0);
                String unused = UpdateService.f19240a;
                "onGetViewFactory widgetId = " + this.f19244c;
            }
            this.f19242a = new C7601g(DeviceDataProvider.m22367B());
            String unused2 = UpdateService.f19240a;
            "ListRemoteViewsFactory , count = " + this.f19242a.getCount();
            this.f19245d = this.f19243b.getString(R$string.common_text_status_on);
            this.f19246e = this.f19243b.getString(R$string.common_text_status_off);
            this.f19247f = this.f19243b.getString(R$string.common_text_status_offline);
            this.f19248g = this.f19243b.getString(R$string.common_text_status_online);
            this.f19243b.getString(R$string.common_text_refresh);
            this.f19243b.getString(R$string.common_text_status_disconnect);
            this.f19243b.getString(R$string.common_text_connect);
            this.f19256o = this.f19243b.getString(R$string.common_text_status_connecting);
            this.f19243b.getString(R$string.common_text_status_upgrade);
            this.f19252k = this.f19243b.getString(R$string.common_text_status_all_on);
            this.f19253l = this.f19243b.getString(R$string.common_text_status_all_off);
            this.f19254m = this.f19243b.getString(R$string.common_text_status_all_offline);
            this.f19255n = this.f19243b.getString(R$string.common_text_status_all_online);
            this.f19249h = this.f19243b.getString(R$string.common_text_status_some_on);
            this.f19250i = this.f19243b.getString(R$string.common_text_status_some_off);
            this.f19251j = this.f19243b.getString(R$string.common_text_status_some_offline);
        }

        /* renamed from: a */
        private void m25004a(C4198d dVar, RemoteViews remoteViews) {
            if (dVar != null) {
                remoteViews.setImageViewResource(R$id.widget_device_card_view_icon, dVar.mo23303F());
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:355:0x06a1, code lost:
            r8 = com.yeelight.yeelib.R$id.widget_device_status_switch;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:391:0x076a, code lost:
            r9.setViewVisibility(r8, 4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:394:0x0784, code lost:
            r9.setViewVisibility(com.yeelight.yeelib.R$id.widget_device_status_switch, 4);
            r9.setViewVisibility(com.yeelight.yeelib.R$id.widget_device_connect, 4);
            r8 = com.yeelight.yeelib.R$id.widget_device_connect_progress_bar;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:395:0x0790, code lost:
            r9.setViewVisibility(r8, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:403:0x07b8, code lost:
            r8 = com.yeelight.yeelib.R$id.widget_device_status_switch;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:407:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:408:?, code lost:
            return;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m25005b(com.yeelight.yeelib.p150c.p151i.C4198d r8, android.widget.RemoteViews r9) {
            /*
                r7 = this;
                if (r8 != 0) goto L_0x0003
                return
            L_0x0003:
                int r0 = com.yeelight.yeelib.R$id.widget_device_name
                java.lang.String r1 = r8.mo23397U()
                r9.setTextViewText(r0, r1)
                java.lang.String r0 = r8.mo23395T()
                r1 = -1
                int r2 = r0.hashCode()
                r3 = 8
                r4 = 1
                r5 = 4
                r6 = 0
                switch(r2) {
                    case -1644531059: goto L_0x04a6;
                    case -1494338802: goto L_0x049b;
                    case -1462015191: goto L_0x0490;
                    case -1462015190: goto L_0x0485;
                    case -1462015189: goto L_0x047a;
                    case -1462015188: goto L_0x046f;
                    case -1462015187: goto L_0x0464;
                    case -1462015186: goto L_0x0459;
                    case -1462015185: goto L_0x044e;
                    case -1462015184: goto L_0x0443;
                    case -1462015183: goto L_0x0437;
                    case -1462015182: goto L_0x042b;
                    case -1462015160: goto L_0x041f;
                    case -1462015159: goto L_0x0413;
                    case -1462015158: goto L_0x0407;
                    case -1462015157: goto L_0x03fb;
                    case -1462015156: goto L_0x03ef;
                    case -1400275319: goto L_0x03e3;
                    case -1399953856: goto L_0x03d7;
                    case -1350780909: goto L_0x03cb;
                    case -1317475940: goto L_0x03bf;
                    case -1317475939: goto L_0x03b3;
                    case -1317475937: goto L_0x03a7;
                    case -1317475915: goto L_0x039b;
                    case -1317475914: goto L_0x038f;
                    case -1317475913: goto L_0x0383;
                    case -1317475912: goto L_0x0377;
                    case -1308146495: goto L_0x036c;
                    case -1308146494: goto L_0x0360;
                    case -1308146493: goto L_0x0354;
                    case -1308146492: goto L_0x0348;
                    case -1308146491: goto L_0x033c;
                    case -1308146490: goto L_0x0330;
                    case -1308146488: goto L_0x0324;
                    case -1308146447: goto L_0x0318;
                    case -1308146446: goto L_0x030c;
                    case -1308146445: goto L_0x0300;
                    case -1282176368: goto L_0x02f4;
                    case -1235140472: goto L_0x02e8;
                    case -1235140471: goto L_0x02dc;
                    case -1235140468: goto L_0x02d0;
                    case -1235140467: goto L_0x02c4;
                    case -1119332198: goto L_0x02b8;
                    case -1063384694: goto L_0x02ac;
                    case -1063384689: goto L_0x02a0;
                    case -1063384685: goto L_0x0294;
                    case -1035626052: goto L_0x0288;
                    case -1035596261: goto L_0x027c;
                    case -948847040: goto L_0x0271;
                    case -948847038: goto L_0x0265;
                    case -888668266: goto L_0x0259;
                    case -888668265: goto L_0x024d;
                    case -888668264: goto L_0x0241;
                    case -850921852: goto L_0x0235;
                    case -845289556: goto L_0x0229;
                    case -845289555: goto L_0x021d;
                    case -845289553: goto L_0x0211;
                    case -845289551: goto L_0x0205;
                    case -845289508: goto L_0x01f9;
                    case -458141175: goto L_0x01ed;
                    case -458141174: goto L_0x01e1;
                    case -458141173: goto L_0x01d5;
                    case -458141172: goto L_0x01c9;
                    case -454053748: goto L_0x01bd;
                    case -449944730: goto L_0x01b1;
                    case -449944729: goto L_0x01a5;
                    case -449944728: goto L_0x0199;
                    case -449944727: goto L_0x018d;
                    case -449944724: goto L_0x0181;
                    case -449944723: goto L_0x0175;
                    case -449944722: goto L_0x0169;
                    case -448603205: goto L_0x015e;
                    case -448603204: goto L_0x0153;
                    case -448603202: goto L_0x0148;
                    case -448603201: goto L_0x013d;
                    case -448603157: goto L_0x0132;
                    case -448603156: goto L_0x0127;
                    case -443031172: goto L_0x011b;
                    case -190173984: goto L_0x010f;
                    case -190173936: goto L_0x0103;
                    case 674030242: goto L_0x00f7;
                    case 922669543: goto L_0x00eb;
                    case 922669544: goto L_0x00df;
                    case 922669545: goto L_0x00d3;
                    case 922669546: goto L_0x00c7;
                    case 922669547: goto L_0x00bb;
                    case 922669548: goto L_0x00af;
                    case 922669549: goto L_0x00a3;
                    case 922669550: goto L_0x0097;
                    case 1201756974: goto L_0x008b;
                    case 1201757021: goto L_0x007f;
                    case 1201766335: goto L_0x0073;
                    case 1201766336: goto L_0x0067;
                    case 1623724661: goto L_0x005b;
                    case 1623724662: goto L_0x004f;
                    case 1623724663: goto L_0x0043;
                    case 2102612488: goto L_0x0037;
                    case 2102612489: goto L_0x002b;
                    case 2146130361: goto L_0x001f;
                    default: goto L_0x001d;
                }
            L_0x001d:
                goto L_0x04b0
            L_0x001f:
                java.lang.String r2 = "yeelink.light.dnlight2"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 77
                goto L_0x04b0
            L_0x002b:
                java.lang.String r2 = "yeelink.light.meshbulb2"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 79
                goto L_0x04b0
            L_0x0037:
                java.lang.String r2 = "yeelink.light.meshbulb1"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 78
                goto L_0x04b0
            L_0x0043:
                java.lang.String r2 = "yeelink.light.bslamp3"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 37
                goto L_0x04b0
            L_0x004f:
                java.lang.String r2 = "yeelink.light.bslamp2"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 36
                goto L_0x04b0
            L_0x005b:
                java.lang.String r2 = "yeelink.light.bslamp1"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 35
                goto L_0x04b0
            L_0x0067:
                java.lang.String r2 = "yeelink.light.ml2"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 82
                goto L_0x04b0
            L_0x0073:
                java.lang.String r2 = "yeelink.light.ml1"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 81
                goto L_0x04b0
            L_0x007f:
                java.lang.String r2 = "yeelink.light.cta"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 18
                goto L_0x04b0
            L_0x008b:
                java.lang.String r2 = "yeelink.light.ct2"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 17
                goto L_0x04b0
            L_0x0097:
                java.lang.String r2 = "yeelink.light.ceiling8"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 46
                goto L_0x04b0
            L_0x00a3:
                java.lang.String r2 = "yeelink.light.ceiling7"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 45
                goto L_0x04b0
            L_0x00af:
                java.lang.String r2 = "yeelink.light.ceiling6"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 44
                goto L_0x04b0
            L_0x00bb:
                java.lang.String r2 = "yeelink.light.ceiling5"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 43
                goto L_0x04b0
            L_0x00c7:
                java.lang.String r2 = "yeelink.light.ceiling4"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 42
                goto L_0x04b0
            L_0x00d3:
                java.lang.String r2 = "yeelink.light.ceiling3"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 41
                goto L_0x04b0
            L_0x00df:
                java.lang.String r2 = "yeelink.light.ceiling2"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 40
                goto L_0x04b0
            L_0x00eb:
                java.lang.String r2 = "yeelink.light.ceiling1"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 39
                goto L_0x04b0
            L_0x00f7:
                java.lang.String r2 = "yeelink.curtain.ctmt1"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 92
                goto L_0x04b0
            L_0x0103:
                java.lang.String r2 = "yeelink.gateway.va"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 96
                goto L_0x04b0
            L_0x010f:
                java.lang.String r2 = "yeelink.gateway.v1"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 95
                goto L_0x04b0
            L_0x011b:
                java.lang.String r2 = "yeelink.light.spot1"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 80
                goto L_0x04b0
            L_0x0127:
                java.lang.String r2 = "yeelink.light.monob"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 4
                goto L_0x04b0
            L_0x0132:
                java.lang.String r2 = "yeelink.light.monoa"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 3
                goto L_0x04b0
            L_0x013d:
                java.lang.String r2 = "yeelink.light.mono5"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 6
                goto L_0x04b0
            L_0x0148:
                java.lang.String r2 = "yeelink.light.mono4"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 2
                goto L_0x04b0
            L_0x0153:
                java.lang.String r2 = "yeelink.light.mono2"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 1
                goto L_0x04b0
            L_0x015e:
                java.lang.String r2 = "yeelink.light.mono1"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 0
                goto L_0x04b0
            L_0x0169:
                java.lang.String r2 = "yeelink.light.lamp9"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 30
                goto L_0x04b0
            L_0x0175:
                java.lang.String r2 = "yeelink.light.lamp8"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 29
                goto L_0x04b0
            L_0x0181:
                java.lang.String r2 = "yeelink.light.lamp7"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 28
                goto L_0x04b0
            L_0x018d:
                java.lang.String r2 = "yeelink.light.lamp4"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 27
                goto L_0x04b0
            L_0x0199:
                java.lang.String r2 = "yeelink.light.lamp3"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 34
                goto L_0x04b0
            L_0x01a5:
                java.lang.String r2 = "yeelink.light.lamp2"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 33
                goto L_0x04b0
            L_0x01b1:
                java.lang.String r2 = "yeelink.light.lamp1"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 26
                goto L_0x04b0
            L_0x01bd:
                java.lang.String r2 = "yeelink.light.group"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 98
                goto L_0x04b0
            L_0x01c9:
                java.lang.String r2 = "yeelink.light.ceild"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 72
                goto L_0x04b0
            L_0x01d5:
                java.lang.String r2 = "yeelink.light.ceilc"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 71
                goto L_0x04b0
            L_0x01e1:
                java.lang.String r2 = "yeelink.light.ceilb"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 70
                goto L_0x04b0
            L_0x01ed:
                java.lang.String r2 = "yeelink.light.ceila"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 69
                goto L_0x04b0
            L_0x01f9:
                java.lang.String r2 = "yeelink.light.stripa"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 24
                goto L_0x04b0
            L_0x0205:
                java.lang.String r2 = "yeelink.light.strip6"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 23
                goto L_0x04b0
            L_0x0211:
                java.lang.String r2 = "yeelink.light.strip4"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 19
                goto L_0x04b0
            L_0x021d:
                java.lang.String r2 = "yeelink.light.strip2"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 22
                goto L_0x04b0
            L_0x0229:
                java.lang.String r2 = "yeelink.light.strip1"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 21
                goto L_0x04b0
            L_0x0235:
                java.lang.String r2 = "yeelink.light.sp1grp"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 86
                goto L_0x04b0
            L_0x0241:
                java.lang.String r2 = "yilai.light.ceiling3"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 75
                goto L_0x04b0
            L_0x024d:
                java.lang.String r2 = "yilai.light.ceiling2"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 74
                goto L_0x04b0
            L_0x0259:
                java.lang.String r2 = "yilai.light.ceiling1"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 73
                goto L_0x04b0
            L_0x0265:
                java.lang.String r2 = "yeelink.light.panel3"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 20
                goto L_0x04b0
            L_0x0271:
                java.lang.String r2 = "yeelink.light.panel1"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 5
                goto L_0x04b0
            L_0x027c:
                java.lang.String r2 = "yeelink.light.mb2grp"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 85
                goto L_0x04b0
            L_0x0288:
                java.lang.String r2 = "yeelink.light.mb1grp"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 84
                goto L_0x04b0
            L_0x0294:
                java.lang.String r2 = "yeelink.light.lamp19"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 38
                goto L_0x04b0
            L_0x02a0:
                java.lang.String r2 = "yeelink.light.lamp15"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 32
                goto L_0x04b0
            L_0x02ac:
                java.lang.String r2 = "yeelink.light.lamp10"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 31
                goto L_0x04b0
            L_0x02b8:
                java.lang.String r2 = "yeelink.wifispeaker.v1"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 94
                goto L_0x04b0
            L_0x02c4:
                java.lang.String r2 = "yeelink.light.fancl6"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 91
                goto L_0x04b0
            L_0x02d0:
                java.lang.String r2 = "yeelink.light.fancl5"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 90
                goto L_0x04b0
            L_0x02dc:
                java.lang.String r2 = "yeelink.light.fancl2"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 89
                goto L_0x04b0
            L_0x02e8:
                java.lang.String r2 = "yeelink.light.fancl1"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 88
                goto L_0x04b0
            L_0x02f4:
                java.lang.String r2 = "yeelink.light.dn2grp"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 83
                goto L_0x04b0
            L_0x0300:
                java.lang.String r2 = "yeelink.light.colorc"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 16
                goto L_0x04b0
            L_0x030c:
                java.lang.String r2 = "yeelink.light.colorb"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 15
                goto L_0x04b0
            L_0x0318:
                java.lang.String r2 = "yeelink.light.colora"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 14
                goto L_0x04b0
            L_0x0324:
                java.lang.String r2 = "yeelink.light.color8"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 13
                goto L_0x04b0
            L_0x0330:
                java.lang.String r2 = "yeelink.light.color6"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 12
                goto L_0x04b0
            L_0x033c:
                java.lang.String r2 = "yeelink.light.color5"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 11
                goto L_0x04b0
            L_0x0348:
                java.lang.String r2 = "yeelink.light.color4"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 10
                goto L_0x04b0
            L_0x0354:
                java.lang.String r2 = "yeelink.light.color3"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 9
                goto L_0x04b0
            L_0x0360:
                java.lang.String r2 = "yeelink.light.color2"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 8
                goto L_0x04b0
            L_0x036c:
                java.lang.String r2 = "yeelink.light.color1"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 7
                goto L_0x04b0
            L_0x0377:
                java.lang.String r2 = "yeelink.light.ceil33"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 68
                goto L_0x04b0
            L_0x0383:
                java.lang.String r2 = "yeelink.light.ceil32"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 67
                goto L_0x04b0
            L_0x038f:
                java.lang.String r2 = "yeelink.light.ceil31"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 66
                goto L_0x04b0
            L_0x039b:
                java.lang.String r2 = "yeelink.light.ceil30"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 65
                goto L_0x04b0
            L_0x03a7:
                java.lang.String r2 = "yeelink.light.ceil29"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 64
                goto L_0x04b0
            L_0x03b3:
                java.lang.String r2 = "yeelink.light.ceil27"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 63
                goto L_0x04b0
            L_0x03bf:
                java.lang.String r2 = "yeelink.light.ceil26"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 62
                goto L_0x04b0
            L_0x03cb:
                java.lang.String r2 = "yeelink.plug.plug"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 87
                goto L_0x04b0
            L_0x03d7:
                java.lang.String r2 = "yeelink.light.mesh"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 25
                goto L_0x04b0
            L_0x03e3:
                java.lang.String r2 = "yeelink.light.ble1"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 97
                goto L_0x04b0
            L_0x03ef:
                java.lang.String r2 = "yeelink.light.ceiling24"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 61
                goto L_0x04b0
            L_0x03fb:
                java.lang.String r2 = "yeelink.light.ceiling23"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 60
                goto L_0x04b0
            L_0x0407:
                java.lang.String r2 = "yeelink.light.ceiling22"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 59
                goto L_0x04b0
            L_0x0413:
                java.lang.String r2 = "yeelink.light.ceiling21"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 58
                goto L_0x04b0
            L_0x041f:
                java.lang.String r2 = "yeelink.light.ceiling20"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 57
                goto L_0x04b0
            L_0x042b:
                java.lang.String r2 = "yeelink.light.ceiling19"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 56
                goto L_0x04b0
            L_0x0437:
                java.lang.String r2 = "yeelink.light.ceiling18"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 55
                goto L_0x04b0
            L_0x0443:
                java.lang.String r2 = "yeelink.light.ceiling17"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 54
                goto L_0x04b0
            L_0x044e:
                java.lang.String r2 = "yeelink.light.ceiling16"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 53
                goto L_0x04b0
            L_0x0459:
                java.lang.String r2 = "yeelink.light.ceiling15"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 52
                goto L_0x04b0
            L_0x0464:
                java.lang.String r2 = "yeelink.light.ceiling14"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 51
                goto L_0x04b0
            L_0x046f:
                java.lang.String r2 = "yeelink.light.ceiling13"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 50
                goto L_0x04b0
            L_0x047a:
                java.lang.String r2 = "yeelink.light.ceiling12"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 49
                goto L_0x04b0
            L_0x0485:
                java.lang.String r2 = "yeelink.light.ceiling11"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 48
                goto L_0x04b0
            L_0x0490:
                java.lang.String r2 = "yeelink.light.ceiling10"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 47
                goto L_0x04b0
            L_0x049b:
                java.lang.String r2 = "yeelink.switch.sw1"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 93
                goto L_0x04b0
            L_0x04a6:
                java.lang.String r2 = "yeelink.bhf_light.v1"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x04b0
                r1 = 76
            L_0x04b0:
                switch(r1) {
                    case 0: goto L_0x076e;
                    case 1: goto L_0x076e;
                    case 2: goto L_0x076e;
                    case 3: goto L_0x076e;
                    case 4: goto L_0x076e;
                    case 5: goto L_0x076e;
                    case 6: goto L_0x076e;
                    case 7: goto L_0x076e;
                    case 8: goto L_0x076e;
                    case 9: goto L_0x076e;
                    case 10: goto L_0x076e;
                    case 11: goto L_0x076e;
                    case 12: goto L_0x076e;
                    case 13: goto L_0x076e;
                    case 14: goto L_0x076e;
                    case 15: goto L_0x076e;
                    case 16: goto L_0x076e;
                    case 17: goto L_0x076e;
                    case 18: goto L_0x076e;
                    case 19: goto L_0x076e;
                    case 20: goto L_0x076e;
                    case 21: goto L_0x076e;
                    case 22: goto L_0x076e;
                    case 23: goto L_0x076e;
                    case 24: goto L_0x076e;
                    case 25: goto L_0x076e;
                    case 26: goto L_0x076e;
                    case 27: goto L_0x076e;
                    case 28: goto L_0x076e;
                    case 29: goto L_0x076e;
                    case 30: goto L_0x076e;
                    case 31: goto L_0x076e;
                    case 32: goto L_0x076e;
                    case 33: goto L_0x076e;
                    case 34: goto L_0x076e;
                    case 35: goto L_0x076e;
                    case 36: goto L_0x076e;
                    case 37: goto L_0x076e;
                    case 38: goto L_0x076e;
                    case 39: goto L_0x076e;
                    case 40: goto L_0x076e;
                    case 41: goto L_0x076e;
                    case 42: goto L_0x076e;
                    case 43: goto L_0x076e;
                    case 44: goto L_0x076e;
                    case 45: goto L_0x076e;
                    case 46: goto L_0x076e;
                    case 47: goto L_0x076e;
                    case 48: goto L_0x076e;
                    case 49: goto L_0x076e;
                    case 50: goto L_0x076e;
                    case 51: goto L_0x076e;
                    case 52: goto L_0x076e;
                    case 53: goto L_0x076e;
                    case 54: goto L_0x076e;
                    case 55: goto L_0x076e;
                    case 56: goto L_0x076e;
                    case 57: goto L_0x076e;
                    case 58: goto L_0x076e;
                    case 59: goto L_0x076e;
                    case 60: goto L_0x076e;
                    case 61: goto L_0x076e;
                    case 62: goto L_0x076e;
                    case 63: goto L_0x076e;
                    case 64: goto L_0x076e;
                    case 65: goto L_0x076e;
                    case 66: goto L_0x076e;
                    case 67: goto L_0x076e;
                    case 68: goto L_0x076e;
                    case 69: goto L_0x076e;
                    case 70: goto L_0x076e;
                    case 71: goto L_0x076e;
                    case 72: goto L_0x076e;
                    case 73: goto L_0x076e;
                    case 74: goto L_0x076e;
                    case 75: goto L_0x076e;
                    case 76: goto L_0x076e;
                    case 77: goto L_0x076e;
                    case 78: goto L_0x076e;
                    case 79: goto L_0x076e;
                    case 80: goto L_0x076e;
                    case 81: goto L_0x076e;
                    case 82: goto L_0x076e;
                    case 83: goto L_0x076e;
                    case 84: goto L_0x076e;
                    case 85: goto L_0x076e;
                    case 86: goto L_0x076e;
                    case 87: goto L_0x076e;
                    case 88: goto L_0x076e;
                    case 89: goto L_0x076e;
                    case 90: goto L_0x076e;
                    case 91: goto L_0x076e;
                    case 92: goto L_0x074c;
                    case 93: goto L_0x072e;
                    case 94: goto L_0x072e;
                    case 95: goto L_0x072e;
                    case 96: goto L_0x072e;
                    case 97: goto L_0x06a5;
                    case 98: goto L_0x04b5;
                    default: goto L_0x04b3;
                }
            L_0x04b3:
                goto L_0x07c4
            L_0x04b5:
                int r0 = com.yeelight.yeelib.R$id.ll_curtain_switch
                r9.setViewVisibility(r0, r3)
                int r0 = com.yeelight.yeelib.R$id.fl_common_device_switch
                r9.setViewVisibility(r0, r6)
                int r0 = com.yeelight.yeelib.R$id.widget_device_connect
                r9.setViewVisibility(r0, r5)
                int r0 = com.yeelight.yeelib.R$id.widget_device_connect_progress_bar
                r9.setViewVisibility(r0, r5)
                boolean r0 = r8.mo23416o0()
                if (r0 == 0) goto L_0x069a
                com.yeelight.yeelib.c.c r8 = (com.yeelight.yeelib.p150c.C5980c) r8
                int r0 = r8.mo27500M1()
                int[] r1 = r8.mo27499L1()
                int r8 = r8.mo27502O1()
                r2 = r1[r6]
                r3 = r1[r4]
                int r2 = r2 + r3
                int r8 = r8 - r2
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "offlineNum = "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r3 = " , onlineNum = "
                r2.append(r3)
                r2.append(r8)
                java.lang.String r3 = ", on = "
                r2.append(r3)
                r3 = r1[r6]
                r2.append(r3)
                java.lang.String r3 = ", off = "
                r2.append(r3)
                r3 = r1[r4]
                r2.append(r3)
                r2.toString()
                java.lang.String r2 = ", "
                if (r0 != 0) goto L_0x05aa
                if (r8 != 0) goto L_0x0548
                r8 = r1[r6]
                if (r8 != 0) goto L_0x051d
                java.lang.String r8 = r7.f19253l
                goto L_0x0693
            L_0x051d:
                r8 = r1[r4]
                if (r8 != 0) goto L_0x0525
                java.lang.String r8 = r7.f19252k
                goto L_0x0693
            L_0x0525:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r0 = r1[r6]
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r8.append(r0)
                java.lang.String r0 = r7.f19249h
                r8.append(r0)
                r8.append(r2)
                r0 = r1[r4]
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r8.append(r0)
                java.lang.String r0 = r7.f19250i
                goto L_0x05cf
            L_0x0548:
                r0 = r1[r6]
                if (r0 != 0) goto L_0x0554
                r0 = r1[r4]
                if (r0 != 0) goto L_0x0554
                java.lang.String r8 = r7.f19255n
                goto L_0x0693
            L_0x0554:
                r0 = r1[r6]
                if (r0 != 0) goto L_0x057c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = r1[r4]
            L_0x055f:
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r0.append(r1)
                java.lang.String r1 = r7.f19250i
            L_0x0568:
                r0.append(r1)
                r0.append(r2)
                r0.append(r8)
                java.lang.String r8 = r7.f19248g
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                goto L_0x0693
            L_0x057c:
                r0 = r1[r4]
                if (r0 != 0) goto L_0x0591
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = r1[r6]
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r0.append(r1)
                java.lang.String r1 = r7.f19249h
                goto L_0x0568
            L_0x0591:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r3 = r1[r6]
                java.lang.String r3 = java.lang.String.valueOf(r3)
                r0.append(r3)
                java.lang.String r3 = r7.f19249h
                r0.append(r3)
                r0.append(r2)
                r1 = r1[r4]
                goto L_0x055f
            L_0x05aa:
                if (r8 != 0) goto L_0x0606
                r8 = r1[r6]
                if (r8 != 0) goto L_0x05d8
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r1 = r1[r4]
            L_0x05b7:
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r8.append(r1)
                java.lang.String r1 = r7.f19250i
            L_0x05c0:
                r8.append(r1)
                r8.append(r2)
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r8.append(r0)
                java.lang.String r0 = r7.f19251j
            L_0x05cf:
                r8.append(r0)
                java.lang.String r8 = r8.toString()
                goto L_0x0693
            L_0x05d8:
                r8 = r1[r4]
                if (r8 != 0) goto L_0x05ed
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r1 = r1[r6]
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r8.append(r1)
                java.lang.String r1 = r7.f19249h
                goto L_0x05c0
            L_0x05ed:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r3 = r1[r6]
                java.lang.String r3 = java.lang.String.valueOf(r3)
                r8.append(r3)
                java.lang.String r3 = r7.f19249h
                r8.append(r3)
                r8.append(r2)
                r1 = r1[r4]
                goto L_0x05b7
            L_0x0606:
                r3 = r1[r6]
                if (r3 != 0) goto L_0x062f
                r3 = r1[r4]
                if (r3 != 0) goto L_0x062f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r8)
                java.lang.String r8 = r7.f19248g
                r1.append(r8)
                r1.append(r2)
                java.lang.String r8 = java.lang.String.valueOf(r0)
                r1.append(r8)
                java.lang.String r8 = r7.f19251j
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                goto L_0x0693
            L_0x062f:
                r3 = r1[r6]
                if (r3 != 0) goto L_0x0665
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r1 = r1[r4]
            L_0x063a:
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r3.append(r1)
                java.lang.String r1 = r7.f19250i
            L_0x0643:
                r3.append(r1)
                r3.append(r2)
                r3.append(r8)
                java.lang.String r8 = r7.f19248g
                r3.append(r8)
                r3.append(r2)
                java.lang.String r8 = java.lang.String.valueOf(r0)
                r3.append(r8)
                java.lang.String r8 = r7.f19251j
                r3.append(r8)
                java.lang.String r8 = r3.toString()
                goto L_0x0693
            L_0x0665:
                r3 = r1[r4]
                if (r3 != 0) goto L_0x067a
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r1 = r1[r6]
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r3.append(r1)
                java.lang.String r1 = r7.f19249h
                goto L_0x0643
            L_0x067a:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r5 = r1[r6]
                java.lang.String r5 = java.lang.String.valueOf(r5)
                r3.append(r5)
                java.lang.String r5 = r7.f19249h
                r3.append(r5)
                r3.append(r2)
                r1 = r1[r4]
                goto L_0x063a
            L_0x0693:
                int r0 = com.yeelight.yeelib.R$id.widget_device_status
                r9.setTextViewText(r0, r8)
                goto L_0x07b8
            L_0x069a:
                java.lang.String r8 = r7.f19254m
                int r0 = com.yeelight.yeelib.R$id.widget_device_status
                r9.setTextViewText(r0, r8)
            L_0x06a1:
                int r8 = com.yeelight.yeelib.R$id.widget_device_status_switch
                goto L_0x076a
            L_0x06a5:
                int r0 = com.yeelight.yeelib.R$id.ll_curtain_switch
                r9.setViewVisibility(r0, r3)
                int r0 = com.yeelight.yeelib.R$id.fl_common_device_switch
                r9.setViewVisibility(r0, r6)
                boolean r0 = r8.mo23416o0()
                if (r0 == 0) goto L_0x06fa
                boolean r0 = r8.mo23420r0()
                if (r0 != 0) goto L_0x06fa
                boolean r0 = r8.mo23331k0()
                if (r0 == 0) goto L_0x06d3
                com.yeelight.yeelib.c.i.i r8 = (com.yeelight.yeelib.p150c.p151i.C4200i) r8
                boolean r8 = r8.mo23332k1()
                if (r8 == 0) goto L_0x06ce
                int r8 = com.yeelight.yeelib.R$id.widget_device_status
                java.lang.String r0 = r7.f19245d
                goto L_0x0711
            L_0x06ce:
                int r8 = com.yeelight.yeelib.R$id.widget_device_status
                java.lang.String r0 = r7.f19246e
                goto L_0x0711
            L_0x06d3:
                boolean r0 = r8.mo23335m0()
                if (r0 == 0) goto L_0x06eb
                int r8 = com.yeelight.yeelib.R$id.widget_device_status
                java.lang.String r0 = r7.f19248g
                r9.setTextViewText(r8, r0)
                int r8 = com.yeelight.yeelib.R$id.widget_device_status_switch
                r9.setViewVisibility(r8, r5)
                int r8 = com.yeelight.yeelib.R$id.widget_device_connect
                r9.setViewVisibility(r8, r6)
                goto L_0x072b
            L_0x06eb:
                boolean r8 = r8.mo23333l0()
                if (r8 == 0) goto L_0x07c4
                int r8 = com.yeelight.yeelib.R$id.widget_device_status
                java.lang.String r0 = r7.f19256o
                r9.setTextViewText(r8, r0)
                goto L_0x0784
            L_0x06fa:
                boolean r0 = r8.mo23420r0()
                if (r0 == 0) goto L_0x071a
                com.yeelight.yeelib.c.i.i r8 = (com.yeelight.yeelib.p150c.p151i.C4200i) r8
                boolean r8 = r8.mo23332k1()
                if (r8 == 0) goto L_0x070d
                int r8 = com.yeelight.yeelib.R$id.widget_device_status
                java.lang.String r0 = r7.f19245d
                goto L_0x0711
            L_0x070d:
                int r8 = com.yeelight.yeelib.R$id.widget_device_status
                java.lang.String r0 = r7.f19246e
            L_0x0711:
                r9.setTextViewText(r8, r0)
                int r8 = com.yeelight.yeelib.R$id.widget_device_status_switch
                r9.setViewVisibility(r8, r6)
                goto L_0x0726
            L_0x071a:
                int r8 = com.yeelight.yeelib.R$id.widget_device_status
                java.lang.String r0 = r7.f19247f
                r9.setTextViewText(r8, r0)
                int r8 = com.yeelight.yeelib.R$id.widget_device_status_switch
                r9.setViewVisibility(r8, r5)
            L_0x0726:
                int r8 = com.yeelight.yeelib.R$id.widget_device_connect
                r9.setViewVisibility(r8, r5)
            L_0x072b:
                int r8 = com.yeelight.yeelib.R$id.widget_device_connect_progress_bar
                goto L_0x076a
            L_0x072e:
                int r0 = com.yeelight.yeelib.R$id.ll_curtain_switch
                r9.setViewVisibility(r0, r3)
                int r0 = com.yeelight.yeelib.R$id.fl_common_device_switch
                r9.setViewVisibility(r0, r3)
                boolean r8 = r8.mo23416o0()
                if (r8 == 0) goto L_0x0743
                int r8 = com.yeelight.yeelib.R$id.widget_device_status
                java.lang.String r0 = r7.f19248g
                goto L_0x0747
            L_0x0743:
                int r8 = com.yeelight.yeelib.R$id.widget_device_status
                java.lang.String r0 = r7.f19247f
            L_0x0747:
                r9.setTextViewText(r8, r0)
                goto L_0x07c4
            L_0x074c:
                int r0 = com.yeelight.yeelib.R$id.fl_common_device_switch
                r9.setViewVisibility(r0, r3)
                boolean r8 = r8.mo23416o0()
                if (r8 == 0) goto L_0x0761
                int r8 = com.yeelight.yeelib.R$id.widget_device_status
                java.lang.String r0 = r7.f19248g
                r9.setTextViewText(r8, r0)
                int r8 = com.yeelight.yeelib.R$id.ll_curtain_switch
                goto L_0x0790
            L_0x0761:
                int r8 = com.yeelight.yeelib.R$id.widget_device_status
                java.lang.String r0 = r7.f19247f
                r9.setTextViewText(r8, r0)
                int r8 = com.yeelight.yeelib.R$id.ll_curtain_switch
            L_0x076a:
                r9.setViewVisibility(r8, r5)
                goto L_0x07c4
            L_0x076e:
                int r0 = com.yeelight.yeelib.R$id.ll_curtain_switch
                r9.setViewVisibility(r0, r3)
                int r0 = com.yeelight.yeelib.R$id.fl_common_device_switch
                r9.setViewVisibility(r0, r6)
                java.lang.String r0 = r8.mo23372G()
                java.lang.String r1 = com.yeelight.yeelib.p194ui.appwidget.UpdateService.f19241b
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0794
            L_0x0784:
                int r8 = com.yeelight.yeelib.R$id.widget_device_status_switch
                r9.setViewVisibility(r8, r5)
                int r8 = com.yeelight.yeelib.R$id.widget_device_connect
                r9.setViewVisibility(r8, r5)
                int r8 = com.yeelight.yeelib.R$id.widget_device_connect_progress_bar
            L_0x0790:
                r9.setViewVisibility(r8, r6)
                goto L_0x07c4
            L_0x0794:
                int r0 = com.yeelight.yeelib.R$id.widget_device_connect
                r9.setViewVisibility(r0, r5)
                int r0 = com.yeelight.yeelib.R$id.widget_device_connect_progress_bar
                r9.setViewVisibility(r0, r5)
                boolean r0 = r8.mo23416o0()
                if (r0 == 0) goto L_0x07bb
                com.yeelight.yeelib.c.i.i r8 = (com.yeelight.yeelib.p150c.p151i.C4200i) r8
                boolean r8 = r8.mo23332k1()
                if (r8 == 0) goto L_0x07b1
                int r8 = com.yeelight.yeelib.R$id.widget_device_status
                java.lang.String r0 = r7.f19245d
                goto L_0x07b5
            L_0x07b1:
                int r8 = com.yeelight.yeelib.R$id.widget_device_status
                java.lang.String r0 = r7.f19246e
            L_0x07b5:
                r9.setTextViewText(r8, r0)
            L_0x07b8:
                int r8 = com.yeelight.yeelib.R$id.widget_device_status_switch
                goto L_0x0790
            L_0x07bb:
                int r8 = com.yeelight.yeelib.R$id.widget_device_status
                java.lang.String r0 = r7.f19247f
                r9.setTextViewText(r8, r0)
                goto L_0x06a1
            L_0x07c4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.appwidget.UpdateService.C10370a.m25005b(com.yeelight.yeelib.c.i.d, android.widget.RemoteViews):void");
        }

        public int getCount() {
            return this.f19242a.getCount();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public RemoteViews getLoadingView() {
            return null;
        }

        public RemoteViews getViewAt(int i) {
            String unused = UpdateService.f19240a;
            "getViewAt , position = " + i;
            String str = null;
            if (i >= this.f19242a.getCount() || this.f19242a.isClosed()) {
                return null;
            }
            this.f19242a.moveToPosition(i);
            RemoteViews remoteViews = new RemoteViews(this.f19243b.getPackageName(), R$layout.list_item_device_widget);
            C7601g gVar = this.f19242a;
            String string = gVar.getString(gVar.getColumnIndex(C7579c.C7580a.C7581a.f15372c));
            C4198d h0 = C4257w.m11945h0(string);
            m25004a(h0, remoteViews);
            m25005b(h0, remoteViews);
            if (h0 != null) {
                str = h0 instanceof C6005g ? "type_room" : h0 instanceof C5980c ? "type_group" : "type_device";
            }
            Intent intent = new Intent();
            intent.setAction("widget_on_click");
            intent.setClass(this.f19243b, YeelightDeviceWidgetProvider.class);
            intent.putExtra("com.yeelight.cherry.device_id", string);
            intent.putExtra("com.yeelight.cherry.type", str);
            intent.putExtra("extra_name_widget_id", this.f19244c);
            intent.putExtra("extra_name_widget_action", "toggle_on_click");
            remoteViews.setOnClickFillInIntent(R$id.widget_device_status_switch, intent);
            Intent intent2 = new Intent();
            intent2.setAction("widget_on_click");
            intent2.setClass(this.f19243b, YeelightDeviceWidgetProvider.class);
            intent2.putExtra("com.yeelight.cherry.device_id", string);
            intent2.putExtra("com.yeelight.cherry.type", str);
            intent2.putExtra("extra_name_widget_id", this.f19244c);
            intent2.putExtra("extra_name_widget_action", "toggle_curtain_open");
            remoteViews.setOnClickFillInIntent(R$id.widget_curtain_open, intent2);
            Intent intent3 = new Intent();
            intent3.setAction("widget_on_click");
            intent3.setClass(this.f19243b, YeelightDeviceWidgetProvider.class);
            intent3.putExtra("com.yeelight.cherry.device_id", string);
            intent3.putExtra("com.yeelight.cherry.type", str);
            intent3.putExtra("extra_name_widget_id", this.f19244c);
            intent3.putExtra("extra_name_widget_action", "toggle_curtain_close");
            remoteViews.setOnClickFillInIntent(R$id.widget_curtain_close, intent3);
            Intent intent4 = new Intent();
            intent4.setAction("widget_on_click");
            intent4.setClass(this.f19243b, YeelightDeviceWidgetProvider.class);
            intent4.putExtra("com.yeelight.cherry.type", str);
            intent4.putExtra("com.yeelight.cherry.device_id", string);
            intent4.putExtra("extra_name_widget_id", this.f19244c);
            intent4.putExtra("extra_name_widget_action", "launch_on_click");
            remoteViews.setOnClickFillInIntent(R$id.widget_list_view_item, intent4);
            Intent intent5 = new Intent();
            intent5.setAction("widget_on_click");
            intent5.setClass(this.f19243b, YeelightDeviceWidgetProvider.class);
            intent5.putExtra("com.yeelight.cherry.type", str);
            intent5.putExtra("com.yeelight.cherry.device_id", string);
            intent5.putExtra("extra_name_widget_id", this.f19244c);
            intent5.putExtra("extra_name_widget_action", "connect_on_click");
            remoteViews.setOnClickFillInIntent(R$id.widget_device_connect, intent5);
            return remoteViews;
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            return false;
        }

        public void onCreate() {
            String unused = UpdateService.f19240a;
        }

        public void onDataSetChanged() {
            C7601g gVar = this.f19242a;
            if (gVar != null) {
                gVar.close();
            }
            this.f19242a = new C7601g(DeviceDataProvider.m22366A());
            String unused = UpdateService.f19240a;
            "onDataSetChanged , count = " + this.f19242a.getCount();
        }

        public void onDestroy() {
            C7601g gVar = this.f19242a;
            if (gVar != null) {
                gVar.close();
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new C10370a(this, this, intent);
    }
}
