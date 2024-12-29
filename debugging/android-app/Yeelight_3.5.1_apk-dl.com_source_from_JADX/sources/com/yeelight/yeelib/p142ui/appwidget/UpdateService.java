package com.yeelight.yeelib.p142ui.appwidget;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.data.C6043b;
import com.yeelight.yeelib.data.C6065f;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.device.C6119c;
import com.yeelight.yeelib.device.C6169f;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.managers.YeelightDeviceManager;

/* renamed from: com.yeelight.yeelib.ui.appwidget.UpdateService */
public class UpdateService extends RemoteViewsService {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f15505a = UpdateService.class.getSimpleName();

    /* renamed from: b */
    public static String f15506b;

    /* renamed from: com.yeelight.yeelib.ui.appwidget.UpdateService$a */
    class C8751a implements RemoteViewsService.RemoteViewsFactory {

        /* renamed from: a */
        private C6065f f15507a;

        /* renamed from: b */
        private Context f15508b;

        /* renamed from: c */
        private int f15509c;

        /* renamed from: d */
        private final String f15510d;

        /* renamed from: e */
        private final String f15511e;

        /* renamed from: f */
        private final String f15512f;

        /* renamed from: g */
        private final String f15513g;

        /* renamed from: h */
        private final String f15514h;

        /* renamed from: i */
        private final String f15515i;

        /* renamed from: j */
        private final String f15516j;

        /* renamed from: k */
        private final String f15517k;

        /* renamed from: l */
        private final String f15518l;

        /* renamed from: m */
        private final String f15519m;

        /* renamed from: n */
        private final String f15520n;

        /* renamed from: o */
        private final String f15521o;

        public C8751a(UpdateService updateService, Context context, Intent intent) {
            this.f15508b = context;
            if (intent != null) {
                this.f15509c = intent.getIntExtra("appWidgetId", 0);
                String unused = UpdateService.f15505a;
                StringBuilder sb = new StringBuilder();
                sb.append("onGetViewFactory widgetId = ");
                sb.append(this.f15509c);
            }
            this.f15507a = new C6065f(DeviceDataProvider.m17589B());
            String unused2 = UpdateService.f15505a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ListRemoteViewsFactory , count = ");
            sb2.append(this.f15507a.getCount());
            this.f15510d = this.f15508b.getString(R$string.common_text_status_on);
            this.f15511e = this.f15508b.getString(R$string.common_text_status_off);
            this.f15512f = this.f15508b.getString(R$string.common_text_status_offline);
            this.f15513g = this.f15508b.getString(R$string.common_text_status_online);
            this.f15508b.getString(R$string.common_text_refresh);
            this.f15508b.getString(R$string.common_text_status_disconnect);
            this.f15508b.getString(R$string.common_text_connect);
            this.f15521o = this.f15508b.getString(R$string.common_text_status_connecting);
            this.f15508b.getString(R$string.common_text_status_upgrade);
            this.f15517k = this.f15508b.getString(R$string.common_text_status_all_on);
            this.f15518l = this.f15508b.getString(R$string.common_text_status_all_off);
            this.f15519m = this.f15508b.getString(R$string.common_text_status_all_offline);
            this.f15520n = this.f15508b.getString(R$string.common_text_status_all_online);
            this.f15514h = this.f15508b.getString(R$string.common_text_status_some_on);
            this.f15515i = this.f15508b.getString(R$string.common_text_status_some_off);
            this.f15516j = this.f15508b.getString(R$string.common_text_status_some_offline);
        }

        /* renamed from: a */
        private void m20610a(C3010c cVar, RemoteViews remoteViews) {
            if (cVar != null) {
                remoteViews.setImageViewResource(R$id.widget_device_card_view_icon, cVar.mo23116F());
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:324:0x05eb, code lost:
            r9.setViewVisibility(r8, 4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:378:0x07d9, code lost:
            r8 = com.yeelight.yeelib.R$id.widget_device_status_switch;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:412:0x0899, code lost:
            r9.setViewVisibility(com.yeelight.yeelib.R$id.widget_device_status_switch, 4);
            r9.setViewVisibility(com.yeelight.yeelib.R$id.widget_device_connect, 4);
            r8 = com.yeelight.yeelib.R$id.widget_device_connect_progress_bar;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:413:0x08a5, code lost:
            r9.setViewVisibility(r8, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:421:0x08cd, code lost:
            r8 = com.yeelight.yeelib.R$id.widget_device_status_switch;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:423:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:426:?, code lost:
            return;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m20611b(com.yeelight.yeelib.device.base.C3010c r8, android.widget.RemoteViews r9) {
            /*
                r7 = this;
                if (r8 != 0) goto L_0x0003
                return
            L_0x0003:
                int r0 = com.yeelight.yeelib.R$id.widget_device_name
                java.lang.String r1 = r8.mo23210U()
                r9.setTextViewText(r0, r1)
                java.lang.String r0 = r8.mo23208T()
                r0.hashCode()
                r1 = -1
                int r2 = r0.hashCode()
                r3 = 8
                r4 = 1
                r5 = 4
                r6 = 0
                switch(r2) {
                    case -1644531059: goto L_0x05bd;
                    case -1494338802: goto L_0x05b2;
                    case -1462015191: goto L_0x05a7;
                    case -1462015190: goto L_0x059c;
                    case -1462015189: goto L_0x0591;
                    case -1462015188: goto L_0x0586;
                    case -1462015187: goto L_0x057b;
                    case -1462015186: goto L_0x0570;
                    case -1462015185: goto L_0x0562;
                    case -1462015184: goto L_0x0554;
                    case -1462015183: goto L_0x0546;
                    case -1462015182: goto L_0x0538;
                    case -1462015160: goto L_0x052a;
                    case -1462015159: goto L_0x051c;
                    case -1462015158: goto L_0x050e;
                    case -1462015157: goto L_0x0500;
                    case -1462015156: goto L_0x04f2;
                    case -1400275319: goto L_0x04e4;
                    case -1399953856: goto L_0x04d6;
                    case -1350780909: goto L_0x04c8;
                    case -1317475940: goto L_0x04ba;
                    case -1317475939: goto L_0x04ac;
                    case -1317475937: goto L_0x049e;
                    case -1317475915: goto L_0x0490;
                    case -1317475914: goto L_0x0482;
                    case -1317475913: goto L_0x0474;
                    case -1317475912: goto L_0x0466;
                    case -1317475910: goto L_0x0458;
                    case -1308146495: goto L_0x044a;
                    case -1308146494: goto L_0x043c;
                    case -1308146493: goto L_0x042e;
                    case -1308146492: goto L_0x0420;
                    case -1308146491: goto L_0x0412;
                    case -1308146490: goto L_0x0404;
                    case -1308146488: goto L_0x03f6;
                    case -1308146447: goto L_0x03e8;
                    case -1308146446: goto L_0x03da;
                    case -1308146445: goto L_0x03cc;
                    case -1308146443: goto L_0x03be;
                    case -1282176368: goto L_0x03b0;
                    case -1235140472: goto L_0x03a2;
                    case -1235140471: goto L_0x0394;
                    case -1235140468: goto L_0x0386;
                    case -1235140467: goto L_0x0378;
                    case -1119332198: goto L_0x036a;
                    case -1063384694: goto L_0x035c;
                    case -1063384689: goto L_0x034e;
                    case -1063384685: goto L_0x0340;
                    case -1035626052: goto L_0x0332;
                    case -1035596261: goto L_0x0324;
                    case -948847040: goto L_0x0316;
                    case -948847038: goto L_0x0308;
                    case -939061393: goto L_0x02fa;
                    case -888668266: goto L_0x02ec;
                    case -888668265: goto L_0x02de;
                    case -888668264: goto L_0x02d0;
                    case -850921852: goto L_0x02c2;
                    case -845289556: goto L_0x02b4;
                    case -845289555: goto L_0x02a6;
                    case -845289553: goto L_0x0298;
                    case -845289551: goto L_0x028a;
                    case -845289549: goto L_0x027c;
                    case -845289508: goto L_0x026e;
                    case -458141175: goto L_0x0260;
                    case -458141174: goto L_0x0252;
                    case -458141173: goto L_0x0244;
                    case -458141172: goto L_0x0236;
                    case -458141171: goto L_0x0228;
                    case -454053748: goto L_0x021a;
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
                    case -443031172: goto L_0x0156;
                    case -190173984: goto L_0x0148;
                    case -190173936: goto L_0x013a;
                    case 674030242: goto L_0x012c;
                    case 922669543: goto L_0x011e;
                    case 922669544: goto L_0x0110;
                    case 922669545: goto L_0x0102;
                    case 922669546: goto L_0x00f4;
                    case 922669547: goto L_0x00e6;
                    case 922669548: goto L_0x00d8;
                    case 922669549: goto L_0x00ca;
                    case 922669550: goto L_0x00bc;
                    case 1201756974: goto L_0x00ae;
                    case 1201757021: goto L_0x00a0;
                    case 1201757023: goto L_0x0092;
                    case 1201766335: goto L_0x0084;
                    case 1201766336: goto L_0x0076;
                    case 1623724661: goto L_0x0068;
                    case 1623724662: goto L_0x005a;
                    case 1623724663: goto L_0x004c;
                    case 2102612488: goto L_0x003e;
                    case 2102612489: goto L_0x0030;
                    case 2146130361: goto L_0x0022;
                    default: goto L_0x0020;
                }
            L_0x0020:
                goto L_0x05c7
            L_0x0022:
                java.lang.String r2 = "yeelink.light.dnlight2"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x002c
                goto L_0x05c7
            L_0x002c:
                r1 = 104(0x68, float:1.46E-43)
                goto L_0x05c7
            L_0x0030:
                java.lang.String r2 = "yeelink.light.meshbulb2"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x003a
                goto L_0x05c7
            L_0x003a:
                r1 = 103(0x67, float:1.44E-43)
                goto L_0x05c7
            L_0x003e:
                java.lang.String r2 = "yeelink.light.meshbulb1"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0048
                goto L_0x05c7
            L_0x0048:
                r1 = 102(0x66, float:1.43E-43)
                goto L_0x05c7
            L_0x004c:
                java.lang.String r2 = "yeelink.light.bslamp3"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0056
                goto L_0x05c7
            L_0x0056:
                r1 = 101(0x65, float:1.42E-43)
                goto L_0x05c7
            L_0x005a:
                java.lang.String r2 = "yeelink.light.bslamp2"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0064
                goto L_0x05c7
            L_0x0064:
                r1 = 100
                goto L_0x05c7
            L_0x0068:
                java.lang.String r2 = "yeelink.light.bslamp1"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0072
                goto L_0x05c7
            L_0x0072:
                r1 = 99
                goto L_0x05c7
            L_0x0076:
                java.lang.String r2 = "yeelink.light.ml2"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0080
                goto L_0x05c7
            L_0x0080:
                r1 = 98
                goto L_0x05c7
            L_0x0084:
                java.lang.String r2 = "yeelink.light.ml1"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x008e
                goto L_0x05c7
            L_0x008e:
                r1 = 97
                goto L_0x05c7
            L_0x0092:
                java.lang.String r2 = "yeelink.light.ctc"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x009c
                goto L_0x05c7
            L_0x009c:
                r1 = 96
                goto L_0x05c7
            L_0x00a0:
                java.lang.String r2 = "yeelink.light.cta"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x00aa
                goto L_0x05c7
            L_0x00aa:
                r1 = 95
                goto L_0x05c7
            L_0x00ae:
                java.lang.String r2 = "yeelink.light.ct2"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x00b8
                goto L_0x05c7
            L_0x00b8:
                r1 = 94
                goto L_0x05c7
            L_0x00bc:
                java.lang.String r2 = "yeelink.light.ceiling8"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x00c6
                goto L_0x05c7
            L_0x00c6:
                r1 = 93
                goto L_0x05c7
            L_0x00ca:
                java.lang.String r2 = "yeelink.light.ceiling7"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x00d4
                goto L_0x05c7
            L_0x00d4:
                r1 = 92
                goto L_0x05c7
            L_0x00d8:
                java.lang.String r2 = "yeelink.light.ceiling6"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x00e2
                goto L_0x05c7
            L_0x00e2:
                r1 = 91
                goto L_0x05c7
            L_0x00e6:
                java.lang.String r2 = "yeelink.light.ceiling5"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x00f0
                goto L_0x05c7
            L_0x00f0:
                r1 = 90
                goto L_0x05c7
            L_0x00f4:
                java.lang.String r2 = "yeelink.light.ceiling4"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x00fe
                goto L_0x05c7
            L_0x00fe:
                r1 = 89
                goto L_0x05c7
            L_0x0102:
                java.lang.String r2 = "yeelink.light.ceiling3"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x010c
                goto L_0x05c7
            L_0x010c:
                r1 = 88
                goto L_0x05c7
            L_0x0110:
                java.lang.String r2 = "yeelink.light.ceiling2"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x011a
                goto L_0x05c7
            L_0x011a:
                r1 = 87
                goto L_0x05c7
            L_0x011e:
                java.lang.String r2 = "yeelink.light.ceiling1"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0128
                goto L_0x05c7
            L_0x0128:
                r1 = 86
                goto L_0x05c7
            L_0x012c:
                java.lang.String r2 = "yeelink.curtain.ctmt1"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0136
                goto L_0x05c7
            L_0x0136:
                r1 = 85
                goto L_0x05c7
            L_0x013a:
                java.lang.String r2 = "yeelink.gateway.va"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0144
                goto L_0x05c7
            L_0x0144:
                r1 = 84
                goto L_0x05c7
            L_0x0148:
                java.lang.String r2 = "yeelink.gateway.v1"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0152
                goto L_0x05c7
            L_0x0152:
                r1 = 83
                goto L_0x05c7
            L_0x0156:
                java.lang.String r2 = "yeelink.light.spot1"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0160
                goto L_0x05c7
            L_0x0160:
                r1 = 82
                goto L_0x05c7
            L_0x0164:
                java.lang.String r2 = "yeelink.light.monob"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x016e
                goto L_0x05c7
            L_0x016e:
                r1 = 81
                goto L_0x05c7
            L_0x0172:
                java.lang.String r2 = "yeelink.light.monoa"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x017c
                goto L_0x05c7
            L_0x017c:
                r1 = 80
                goto L_0x05c7
            L_0x0180:
                java.lang.String r2 = "yeelink.light.mono5"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x018a
                goto L_0x05c7
            L_0x018a:
                r1 = 79
                goto L_0x05c7
            L_0x018e:
                java.lang.String r2 = "yeelink.light.mono4"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0198
                goto L_0x05c7
            L_0x0198:
                r1 = 78
                goto L_0x05c7
            L_0x019c:
                java.lang.String r2 = "yeelink.light.mono2"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x01a6
                goto L_0x05c7
            L_0x01a6:
                r1 = 77
                goto L_0x05c7
            L_0x01aa:
                java.lang.String r2 = "yeelink.light.mono1"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x01b4
                goto L_0x05c7
            L_0x01b4:
                r1 = 76
                goto L_0x05c7
            L_0x01b8:
                java.lang.String r2 = "yeelink.light.lamp9"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x01c2
                goto L_0x05c7
            L_0x01c2:
                r1 = 75
                goto L_0x05c7
            L_0x01c6:
                java.lang.String r2 = "yeelink.light.lamp8"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x01d0
                goto L_0x05c7
            L_0x01d0:
                r1 = 74
                goto L_0x05c7
            L_0x01d4:
                java.lang.String r2 = "yeelink.light.lamp7"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x01de
                goto L_0x05c7
            L_0x01de:
                r1 = 73
                goto L_0x05c7
            L_0x01e2:
                java.lang.String r2 = "yeelink.light.lamp4"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x01ec
                goto L_0x05c7
            L_0x01ec:
                r1 = 72
                goto L_0x05c7
            L_0x01f0:
                java.lang.String r2 = "yeelink.light.lamp3"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x01fa
                goto L_0x05c7
            L_0x01fa:
                r1 = 71
                goto L_0x05c7
            L_0x01fe:
                java.lang.String r2 = "yeelink.light.lamp2"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0208
                goto L_0x05c7
            L_0x0208:
                r1 = 70
                goto L_0x05c7
            L_0x020c:
                java.lang.String r2 = "yeelink.light.lamp1"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0216
                goto L_0x05c7
            L_0x0216:
                r1 = 69
                goto L_0x05c7
            L_0x021a:
                java.lang.String r2 = "yeelink.light.group"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0224
                goto L_0x05c7
            L_0x0224:
                r1 = 68
                goto L_0x05c7
            L_0x0228:
                java.lang.String r2 = "yeelink.light.ceile"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0232
                goto L_0x05c7
            L_0x0232:
                r1 = 67
                goto L_0x05c7
            L_0x0236:
                java.lang.String r2 = "yeelink.light.ceild"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0240
                goto L_0x05c7
            L_0x0240:
                r1 = 66
                goto L_0x05c7
            L_0x0244:
                java.lang.String r2 = "yeelink.light.ceilc"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x024e
                goto L_0x05c7
            L_0x024e:
                r1 = 65
                goto L_0x05c7
            L_0x0252:
                java.lang.String r2 = "yeelink.light.ceilb"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x025c
                goto L_0x05c7
            L_0x025c:
                r1 = 64
                goto L_0x05c7
            L_0x0260:
                java.lang.String r2 = "yeelink.light.ceila"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x026a
                goto L_0x05c7
            L_0x026a:
                r1 = 63
                goto L_0x05c7
            L_0x026e:
                java.lang.String r2 = "yeelink.light.stripa"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0278
                goto L_0x05c7
            L_0x0278:
                r1 = 62
                goto L_0x05c7
            L_0x027c:
                java.lang.String r2 = "yeelink.light.strip8"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0286
                goto L_0x05c7
            L_0x0286:
                r1 = 61
                goto L_0x05c7
            L_0x028a:
                java.lang.String r2 = "yeelink.light.strip6"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0294
                goto L_0x05c7
            L_0x0294:
                r1 = 60
                goto L_0x05c7
            L_0x0298:
                java.lang.String r2 = "yeelink.light.strip4"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x02a2
                goto L_0x05c7
            L_0x02a2:
                r1 = 59
                goto L_0x05c7
            L_0x02a6:
                java.lang.String r2 = "yeelink.light.strip2"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x02b0
                goto L_0x05c7
            L_0x02b0:
                r1 = 58
                goto L_0x05c7
            L_0x02b4:
                java.lang.String r2 = "yeelink.light.strip1"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x02be
                goto L_0x05c7
            L_0x02be:
                r1 = 57
                goto L_0x05c7
            L_0x02c2:
                java.lang.String r2 = "yeelink.light.sp1grp"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x02cc
                goto L_0x05c7
            L_0x02cc:
                r1 = 56
                goto L_0x05c7
            L_0x02d0:
                java.lang.String r2 = "yilai.light.ceiling3"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x02da
                goto L_0x05c7
            L_0x02da:
                r1 = 55
                goto L_0x05c7
            L_0x02de:
                java.lang.String r2 = "yilai.light.ceiling2"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x02e8
                goto L_0x05c7
            L_0x02e8:
                r1 = 54
                goto L_0x05c7
            L_0x02ec:
                java.lang.String r2 = "yilai.light.ceiling1"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x02f6
                goto L_0x05c7
            L_0x02f6:
                r1 = 53
                goto L_0x05c7
            L_0x02fa:
                java.lang.String r2 = "yeelink.light.plate2"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0304
                goto L_0x05c7
            L_0x0304:
                r1 = 52
                goto L_0x05c7
            L_0x0308:
                java.lang.String r2 = "yeelink.light.panel3"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0312
                goto L_0x05c7
            L_0x0312:
                r1 = 51
                goto L_0x05c7
            L_0x0316:
                java.lang.String r2 = "yeelink.light.panel1"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0320
                goto L_0x05c7
            L_0x0320:
                r1 = 50
                goto L_0x05c7
            L_0x0324:
                java.lang.String r2 = "yeelink.light.mb2grp"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x032e
                goto L_0x05c7
            L_0x032e:
                r1 = 49
                goto L_0x05c7
            L_0x0332:
                java.lang.String r2 = "yeelink.light.mb1grp"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x033c
                goto L_0x05c7
            L_0x033c:
                r1 = 48
                goto L_0x05c7
            L_0x0340:
                java.lang.String r2 = "yeelink.light.lamp19"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x034a
                goto L_0x05c7
            L_0x034a:
                r1 = 47
                goto L_0x05c7
            L_0x034e:
                java.lang.String r2 = "yeelink.light.lamp15"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0358
                goto L_0x05c7
            L_0x0358:
                r1 = 46
                goto L_0x05c7
            L_0x035c:
                java.lang.String r2 = "yeelink.light.lamp10"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0366
                goto L_0x05c7
            L_0x0366:
                r1 = 45
                goto L_0x05c7
            L_0x036a:
                java.lang.String r2 = "yeelink.wifispeaker.v1"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0374
                goto L_0x05c7
            L_0x0374:
                r1 = 44
                goto L_0x05c7
            L_0x0378:
                java.lang.String r2 = "yeelink.light.fancl6"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0382
                goto L_0x05c7
            L_0x0382:
                r1 = 43
                goto L_0x05c7
            L_0x0386:
                java.lang.String r2 = "yeelink.light.fancl5"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0390
                goto L_0x05c7
            L_0x0390:
                r1 = 42
                goto L_0x05c7
            L_0x0394:
                java.lang.String r2 = "yeelink.light.fancl2"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x039e
                goto L_0x05c7
            L_0x039e:
                r1 = 41
                goto L_0x05c7
            L_0x03a2:
                java.lang.String r2 = "yeelink.light.fancl1"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x03ac
                goto L_0x05c7
            L_0x03ac:
                r1 = 40
                goto L_0x05c7
            L_0x03b0:
                java.lang.String r2 = "yeelink.light.dn2grp"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x03ba
                goto L_0x05c7
            L_0x03ba:
                r1 = 39
                goto L_0x05c7
            L_0x03be:
                java.lang.String r2 = "yeelink.light.colore"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x03c8
                goto L_0x05c7
            L_0x03c8:
                r1 = 38
                goto L_0x05c7
            L_0x03cc:
                java.lang.String r2 = "yeelink.light.colorc"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x03d6
                goto L_0x05c7
            L_0x03d6:
                r1 = 37
                goto L_0x05c7
            L_0x03da:
                java.lang.String r2 = "yeelink.light.colorb"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x03e4
                goto L_0x05c7
            L_0x03e4:
                r1 = 36
                goto L_0x05c7
            L_0x03e8:
                java.lang.String r2 = "yeelink.light.colora"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x03f2
                goto L_0x05c7
            L_0x03f2:
                r1 = 35
                goto L_0x05c7
            L_0x03f6:
                java.lang.String r2 = "yeelink.light.color8"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0400
                goto L_0x05c7
            L_0x0400:
                r1 = 34
                goto L_0x05c7
            L_0x0404:
                java.lang.String r2 = "yeelink.light.color6"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x040e
                goto L_0x05c7
            L_0x040e:
                r1 = 33
                goto L_0x05c7
            L_0x0412:
                java.lang.String r2 = "yeelink.light.color5"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x041c
                goto L_0x05c7
            L_0x041c:
                r1 = 32
                goto L_0x05c7
            L_0x0420:
                java.lang.String r2 = "yeelink.light.color4"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x042a
                goto L_0x05c7
            L_0x042a:
                r1 = 31
                goto L_0x05c7
            L_0x042e:
                java.lang.String r2 = "yeelink.light.color3"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0438
                goto L_0x05c7
            L_0x0438:
                r1 = 30
                goto L_0x05c7
            L_0x043c:
                java.lang.String r2 = "yeelink.light.color2"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0446
                goto L_0x05c7
            L_0x0446:
                r1 = 29
                goto L_0x05c7
            L_0x044a:
                java.lang.String r2 = "yeelink.light.color1"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0454
                goto L_0x05c7
            L_0x0454:
                r1 = 28
                goto L_0x05c7
            L_0x0458:
                java.lang.String r2 = "yeelink.light.ceil35"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0462
                goto L_0x05c7
            L_0x0462:
                r1 = 27
                goto L_0x05c7
            L_0x0466:
                java.lang.String r2 = "yeelink.light.ceil33"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0470
                goto L_0x05c7
            L_0x0470:
                r1 = 26
                goto L_0x05c7
            L_0x0474:
                java.lang.String r2 = "yeelink.light.ceil32"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x047e
                goto L_0x05c7
            L_0x047e:
                r1 = 25
                goto L_0x05c7
            L_0x0482:
                java.lang.String r2 = "yeelink.light.ceil31"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x048c
                goto L_0x05c7
            L_0x048c:
                r1 = 24
                goto L_0x05c7
            L_0x0490:
                java.lang.String r2 = "yeelink.light.ceil30"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x049a
                goto L_0x05c7
            L_0x049a:
                r1 = 23
                goto L_0x05c7
            L_0x049e:
                java.lang.String r2 = "yeelink.light.ceil29"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x04a8
                goto L_0x05c7
            L_0x04a8:
                r1 = 22
                goto L_0x05c7
            L_0x04ac:
                java.lang.String r2 = "yeelink.light.ceil27"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x04b6
                goto L_0x05c7
            L_0x04b6:
                r1 = 21
                goto L_0x05c7
            L_0x04ba:
                java.lang.String r2 = "yeelink.light.ceil26"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x04c4
                goto L_0x05c7
            L_0x04c4:
                r1 = 20
                goto L_0x05c7
            L_0x04c8:
                java.lang.String r2 = "yeelink.plug.plug"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x04d2
                goto L_0x05c7
            L_0x04d2:
                r1 = 19
                goto L_0x05c7
            L_0x04d6:
                java.lang.String r2 = "yeelink.light.mesh"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x04e0
                goto L_0x05c7
            L_0x04e0:
                r1 = 18
                goto L_0x05c7
            L_0x04e4:
                java.lang.String r2 = "yeelink.light.ble1"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x04ee
                goto L_0x05c7
            L_0x04ee:
                r1 = 17
                goto L_0x05c7
            L_0x04f2:
                java.lang.String r2 = "yeelink.light.ceiling24"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x04fc
                goto L_0x05c7
            L_0x04fc:
                r1 = 16
                goto L_0x05c7
            L_0x0500:
                java.lang.String r2 = "yeelink.light.ceiling23"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x050a
                goto L_0x05c7
            L_0x050a:
                r1 = 15
                goto L_0x05c7
            L_0x050e:
                java.lang.String r2 = "yeelink.light.ceiling22"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0518
                goto L_0x05c7
            L_0x0518:
                r1 = 14
                goto L_0x05c7
            L_0x051c:
                java.lang.String r2 = "yeelink.light.ceiling21"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0526
                goto L_0x05c7
            L_0x0526:
                r1 = 13
                goto L_0x05c7
            L_0x052a:
                java.lang.String r2 = "yeelink.light.ceiling20"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0534
                goto L_0x05c7
            L_0x0534:
                r1 = 12
                goto L_0x05c7
            L_0x0538:
                java.lang.String r2 = "yeelink.light.ceiling19"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0542
                goto L_0x05c7
            L_0x0542:
                r1 = 11
                goto L_0x05c7
            L_0x0546:
                java.lang.String r2 = "yeelink.light.ceiling18"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0550
                goto L_0x05c7
            L_0x0550:
                r1 = 10
                goto L_0x05c7
            L_0x0554:
                java.lang.String r2 = "yeelink.light.ceiling17"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x055e
                goto L_0x05c7
            L_0x055e:
                r1 = 9
                goto L_0x05c7
            L_0x0562:
                java.lang.String r2 = "yeelink.light.ceiling16"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x056c
                goto L_0x05c7
            L_0x056c:
                r1 = 8
                goto L_0x05c7
            L_0x0570:
                java.lang.String r2 = "yeelink.light.ceiling15"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0579
                goto L_0x05c7
            L_0x0579:
                r1 = 7
                goto L_0x05c7
            L_0x057b:
                java.lang.String r2 = "yeelink.light.ceiling14"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0584
                goto L_0x05c7
            L_0x0584:
                r1 = 6
                goto L_0x05c7
            L_0x0586:
                java.lang.String r2 = "yeelink.light.ceiling13"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x058f
                goto L_0x05c7
            L_0x058f:
                r1 = 5
                goto L_0x05c7
            L_0x0591:
                java.lang.String r2 = "yeelink.light.ceiling12"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x059a
                goto L_0x05c7
            L_0x059a:
                r1 = 4
                goto L_0x05c7
            L_0x059c:
                java.lang.String r2 = "yeelink.light.ceiling11"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x05a5
                goto L_0x05c7
            L_0x05a5:
                r1 = 3
                goto L_0x05c7
            L_0x05a7:
                java.lang.String r2 = "yeelink.light.ceiling10"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x05b0
                goto L_0x05c7
            L_0x05b0:
                r1 = 2
                goto L_0x05c7
            L_0x05b2:
                java.lang.String r2 = "yeelink.switch.sw1"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x05bb
                goto L_0x05c7
            L_0x05bb:
                r1 = 1
                goto L_0x05c7
            L_0x05bd:
                java.lang.String r2 = "yeelink.bhf_light.v1"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x05c6
                goto L_0x05c7
            L_0x05c6:
                r1 = 0
            L_0x05c7:
                switch(r1) {
                    case 0: goto L_0x0883;
                    case 1: goto L_0x0866;
                    case 2: goto L_0x0883;
                    case 3: goto L_0x0883;
                    case 4: goto L_0x0883;
                    case 5: goto L_0x0883;
                    case 6: goto L_0x0883;
                    case 7: goto L_0x0883;
                    case 8: goto L_0x0883;
                    case 9: goto L_0x0883;
                    case 10: goto L_0x0883;
                    case 11: goto L_0x0883;
                    case 12: goto L_0x0883;
                    case 13: goto L_0x0883;
                    case 14: goto L_0x0883;
                    case 15: goto L_0x0883;
                    case 16: goto L_0x0883;
                    case 17: goto L_0x07dd;
                    case 18: goto L_0x0883;
                    case 19: goto L_0x0883;
                    case 20: goto L_0x0883;
                    case 21: goto L_0x0883;
                    case 22: goto L_0x0883;
                    case 23: goto L_0x0883;
                    case 24: goto L_0x0883;
                    case 25: goto L_0x0883;
                    case 26: goto L_0x0883;
                    case 27: goto L_0x0883;
                    case 28: goto L_0x0883;
                    case 29: goto L_0x0883;
                    case 30: goto L_0x0883;
                    case 31: goto L_0x0883;
                    case 32: goto L_0x0883;
                    case 33: goto L_0x0883;
                    case 34: goto L_0x0883;
                    case 35: goto L_0x0883;
                    case 36: goto L_0x0883;
                    case 37: goto L_0x0883;
                    case 38: goto L_0x0883;
                    case 39: goto L_0x0883;
                    case 40: goto L_0x0883;
                    case 41: goto L_0x0883;
                    case 42: goto L_0x0883;
                    case 43: goto L_0x0883;
                    case 44: goto L_0x0866;
                    case 45: goto L_0x0883;
                    case 46: goto L_0x0883;
                    case 47: goto L_0x0883;
                    case 48: goto L_0x0883;
                    case 49: goto L_0x0883;
                    case 50: goto L_0x0883;
                    case 51: goto L_0x0883;
                    case 52: goto L_0x0883;
                    case 53: goto L_0x0883;
                    case 54: goto L_0x0883;
                    case 55: goto L_0x0883;
                    case 56: goto L_0x0883;
                    case 57: goto L_0x0883;
                    case 58: goto L_0x0883;
                    case 59: goto L_0x0883;
                    case 60: goto L_0x0883;
                    case 61: goto L_0x0883;
                    case 62: goto L_0x0883;
                    case 63: goto L_0x0883;
                    case 64: goto L_0x0883;
                    case 65: goto L_0x0883;
                    case 66: goto L_0x0883;
                    case 67: goto L_0x0883;
                    case 68: goto L_0x05f0;
                    case 69: goto L_0x0883;
                    case 70: goto L_0x0883;
                    case 71: goto L_0x0883;
                    case 72: goto L_0x0883;
                    case 73: goto L_0x0883;
                    case 74: goto L_0x0883;
                    case 75: goto L_0x0883;
                    case 76: goto L_0x0883;
                    case 77: goto L_0x0883;
                    case 78: goto L_0x0883;
                    case 79: goto L_0x0883;
                    case 80: goto L_0x0883;
                    case 81: goto L_0x0883;
                    case 82: goto L_0x0883;
                    case 83: goto L_0x0866;
                    case 84: goto L_0x0866;
                    case 85: goto L_0x05cc;
                    case 86: goto L_0x0883;
                    case 87: goto L_0x0883;
                    case 88: goto L_0x0883;
                    case 89: goto L_0x0883;
                    case 90: goto L_0x0883;
                    case 91: goto L_0x0883;
                    case 92: goto L_0x0883;
                    case 93: goto L_0x0883;
                    case 94: goto L_0x0883;
                    case 95: goto L_0x0883;
                    case 96: goto L_0x0883;
                    case 97: goto L_0x0883;
                    case 98: goto L_0x0883;
                    case 99: goto L_0x0883;
                    case 100: goto L_0x0883;
                    case 101: goto L_0x0883;
                    case 102: goto L_0x0883;
                    case 103: goto L_0x0883;
                    case 104: goto L_0x0883;
                    default: goto L_0x05ca;
                }
            L_0x05ca:
                goto L_0x08d9
            L_0x05cc:
                int r0 = com.yeelight.yeelib.R$id.fl_common_device_switch
                r9.setViewVisibility(r0, r3)
                boolean r8 = r8.mo23230o0()
                if (r8 == 0) goto L_0x05e2
                int r8 = com.yeelight.yeelib.R$id.widget_device_status
                java.lang.String r0 = r7.f15513g
                r9.setTextViewText(r8, r0)
                int r8 = com.yeelight.yeelib.R$id.ll_curtain_switch
                goto L_0x08a5
            L_0x05e2:
                int r8 = com.yeelight.yeelib.R$id.widget_device_status
                java.lang.String r0 = r7.f15512f
                r9.setTextViewText(r8, r0)
                int r8 = com.yeelight.yeelib.R$id.ll_curtain_switch
            L_0x05eb:
                r9.setViewVisibility(r8, r5)
                goto L_0x08d9
            L_0x05f0:
                int r0 = com.yeelight.yeelib.R$id.ll_curtain_switch
                r9.setViewVisibility(r0, r3)
                int r0 = com.yeelight.yeelib.R$id.fl_common_device_switch
                r9.setViewVisibility(r0, r6)
                int r0 = com.yeelight.yeelib.R$id.widget_device_connect
                r9.setViewVisibility(r0, r5)
                int r0 = com.yeelight.yeelib.R$id.widget_device_connect_progress_bar
                r9.setViewVisibility(r0, r5)
                boolean r0 = r8.mo23230o0()
                if (r0 == 0) goto L_0x07d2
                com.yeelight.yeelib.device.c r8 = (com.yeelight.yeelib.device.C6119c) r8
                int r0 = r8.mo31755M1()
                int[] r1 = r8.mo31754L1()
                int r8 = r8.mo31757O1()
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
                java.lang.String r2 = ", "
                if (r0 != 0) goto L_0x06e2
                if (r8 != 0) goto L_0x0680
                r8 = r1[r6]
                if (r8 != 0) goto L_0x0655
                java.lang.String r8 = r7.f15518l
                goto L_0x07cb
            L_0x0655:
                r8 = r1[r4]
                if (r8 != 0) goto L_0x065d
                java.lang.String r8 = r7.f15517k
                goto L_0x07cb
            L_0x065d:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r0 = r1[r6]
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r8.append(r0)
                java.lang.String r0 = r7.f15514h
                r8.append(r0)
                r8.append(r2)
                r0 = r1[r4]
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r8.append(r0)
                java.lang.String r0 = r7.f15515i
                goto L_0x0707
            L_0x0680:
                r0 = r1[r6]
                if (r0 != 0) goto L_0x068c
                r0 = r1[r4]
                if (r0 != 0) goto L_0x068c
                java.lang.String r8 = r7.f15520n
                goto L_0x07cb
            L_0x068c:
                r0 = r1[r6]
                if (r0 != 0) goto L_0x06b4
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = r1[r4]
            L_0x0697:
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r0.append(r1)
                java.lang.String r1 = r7.f15515i
            L_0x06a0:
                r0.append(r1)
                r0.append(r2)
                r0.append(r8)
                java.lang.String r8 = r7.f15513g
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                goto L_0x07cb
            L_0x06b4:
                r0 = r1[r4]
                if (r0 != 0) goto L_0x06c9
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = r1[r6]
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r0.append(r1)
                java.lang.String r1 = r7.f15514h
                goto L_0x06a0
            L_0x06c9:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r3 = r1[r6]
                java.lang.String r3 = java.lang.String.valueOf(r3)
                r0.append(r3)
                java.lang.String r3 = r7.f15514h
                r0.append(r3)
                r0.append(r2)
                r1 = r1[r4]
                goto L_0x0697
            L_0x06e2:
                if (r8 != 0) goto L_0x073e
                r8 = r1[r6]
                if (r8 != 0) goto L_0x0710
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r1 = r1[r4]
            L_0x06ef:
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r8.append(r1)
                java.lang.String r1 = r7.f15515i
            L_0x06f8:
                r8.append(r1)
                r8.append(r2)
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r8.append(r0)
                java.lang.String r0 = r7.f15516j
            L_0x0707:
                r8.append(r0)
                java.lang.String r8 = r8.toString()
                goto L_0x07cb
            L_0x0710:
                r8 = r1[r4]
                if (r8 != 0) goto L_0x0725
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r1 = r1[r6]
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r8.append(r1)
                java.lang.String r1 = r7.f15514h
                goto L_0x06f8
            L_0x0725:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r3 = r1[r6]
                java.lang.String r3 = java.lang.String.valueOf(r3)
                r8.append(r3)
                java.lang.String r3 = r7.f15514h
                r8.append(r3)
                r8.append(r2)
                r1 = r1[r4]
                goto L_0x06ef
            L_0x073e:
                r3 = r1[r6]
                if (r3 != 0) goto L_0x0767
                r3 = r1[r4]
                if (r3 != 0) goto L_0x0767
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r8)
                java.lang.String r8 = r7.f15513g
                r1.append(r8)
                r1.append(r2)
                java.lang.String r8 = java.lang.String.valueOf(r0)
                r1.append(r8)
                java.lang.String r8 = r7.f15516j
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                goto L_0x07cb
            L_0x0767:
                r3 = r1[r6]
                if (r3 != 0) goto L_0x079d
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r1 = r1[r4]
            L_0x0772:
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r3.append(r1)
                java.lang.String r1 = r7.f15515i
            L_0x077b:
                r3.append(r1)
                r3.append(r2)
                r3.append(r8)
                java.lang.String r8 = r7.f15513g
                r3.append(r8)
                r3.append(r2)
                java.lang.String r8 = java.lang.String.valueOf(r0)
                r3.append(r8)
                java.lang.String r8 = r7.f15516j
                r3.append(r8)
                java.lang.String r8 = r3.toString()
                goto L_0x07cb
            L_0x079d:
                r3 = r1[r4]
                if (r3 != 0) goto L_0x07b2
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r1 = r1[r6]
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r3.append(r1)
                java.lang.String r1 = r7.f15514h
                goto L_0x077b
            L_0x07b2:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r5 = r1[r6]
                java.lang.String r5 = java.lang.String.valueOf(r5)
                r3.append(r5)
                java.lang.String r5 = r7.f15514h
                r3.append(r5)
                r3.append(r2)
                r1 = r1[r4]
                goto L_0x0772
            L_0x07cb:
                int r0 = com.yeelight.yeelib.R$id.widget_device_status
                r9.setTextViewText(r0, r8)
                goto L_0x08cd
            L_0x07d2:
                java.lang.String r8 = r7.f15519m
                int r0 = com.yeelight.yeelib.R$id.widget_device_status
                r9.setTextViewText(r0, r8)
            L_0x07d9:
                int r8 = com.yeelight.yeelib.R$id.widget_device_status_switch
                goto L_0x05eb
            L_0x07dd:
                int r0 = com.yeelight.yeelib.R$id.ll_curtain_switch
                r9.setViewVisibility(r0, r3)
                int r0 = com.yeelight.yeelib.R$id.fl_common_device_switch
                r9.setViewVisibility(r0, r6)
                boolean r0 = r8.mo23230o0()
                if (r0 == 0) goto L_0x0831
                boolean r0 = r8.mo23234r0()
                if (r0 != 0) goto L_0x0831
                boolean r0 = r8.mo23145k0()
                if (r0 == 0) goto L_0x080b
                com.yeelight.yeelib.device.base.e r8 = (com.yeelight.yeelib.device.base.C3012e) r8
                boolean r8 = r8.mo23146k1()
                if (r8 == 0) goto L_0x0806
                int r8 = com.yeelight.yeelib.R$id.widget_device_status
                java.lang.String r0 = r7.f15510d
                goto L_0x0848
            L_0x0806:
                int r8 = com.yeelight.yeelib.R$id.widget_device_status
                java.lang.String r0 = r7.f15511e
                goto L_0x0848
            L_0x080b:
                boolean r0 = r8.mo23149m0()
                if (r0 == 0) goto L_0x0823
                int r8 = com.yeelight.yeelib.R$id.widget_device_status
                java.lang.String r0 = r7.f15513g
                r9.setTextViewText(r8, r0)
                int r8 = com.yeelight.yeelib.R$id.widget_device_status_switch
                r9.setViewVisibility(r8, r5)
                int r8 = com.yeelight.yeelib.R$id.widget_device_connect
                r9.setViewVisibility(r8, r6)
                goto L_0x0862
            L_0x0823:
                boolean r8 = r8.mo23147l0()
                if (r8 == 0) goto L_0x08d9
                int r8 = com.yeelight.yeelib.R$id.widget_device_status
                java.lang.String r0 = r7.f15521o
                r9.setTextViewText(r8, r0)
                goto L_0x0899
            L_0x0831:
                boolean r0 = r8.mo23234r0()
                if (r0 == 0) goto L_0x0851
                com.yeelight.yeelib.device.base.e r8 = (com.yeelight.yeelib.device.base.C3012e) r8
                boolean r8 = r8.mo23146k1()
                if (r8 == 0) goto L_0x0844
                int r8 = com.yeelight.yeelib.R$id.widget_device_status
                java.lang.String r0 = r7.f15510d
                goto L_0x0848
            L_0x0844:
                int r8 = com.yeelight.yeelib.R$id.widget_device_status
                java.lang.String r0 = r7.f15511e
            L_0x0848:
                r9.setTextViewText(r8, r0)
                int r8 = com.yeelight.yeelib.R$id.widget_device_status_switch
                r9.setViewVisibility(r8, r6)
                goto L_0x085d
            L_0x0851:
                int r8 = com.yeelight.yeelib.R$id.widget_device_status
                java.lang.String r0 = r7.f15512f
                r9.setTextViewText(r8, r0)
                int r8 = com.yeelight.yeelib.R$id.widget_device_status_switch
                r9.setViewVisibility(r8, r5)
            L_0x085d:
                int r8 = com.yeelight.yeelib.R$id.widget_device_connect
                r9.setViewVisibility(r8, r5)
            L_0x0862:
                int r8 = com.yeelight.yeelib.R$id.widget_device_connect_progress_bar
                goto L_0x05eb
            L_0x0866:
                int r0 = com.yeelight.yeelib.R$id.ll_curtain_switch
                r9.setViewVisibility(r0, r3)
                int r0 = com.yeelight.yeelib.R$id.fl_common_device_switch
                r9.setViewVisibility(r0, r3)
                boolean r8 = r8.mo23230o0()
                if (r8 == 0) goto L_0x087b
                int r8 = com.yeelight.yeelib.R$id.widget_device_status
                java.lang.String r0 = r7.f15513g
                goto L_0x087f
            L_0x087b:
                int r8 = com.yeelight.yeelib.R$id.widget_device_status
                java.lang.String r0 = r7.f15512f
            L_0x087f:
                r9.setTextViewText(r8, r0)
                goto L_0x08d9
            L_0x0883:
                int r0 = com.yeelight.yeelib.R$id.ll_curtain_switch
                r9.setViewVisibility(r0, r3)
                int r0 = com.yeelight.yeelib.R$id.fl_common_device_switch
                r9.setViewVisibility(r0, r6)
                java.lang.String r0 = r8.mo23185G()
                java.lang.String r1 = com.yeelight.yeelib.p142ui.appwidget.UpdateService.f15506b
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x08a9
            L_0x0899:
                int r8 = com.yeelight.yeelib.R$id.widget_device_status_switch
                r9.setViewVisibility(r8, r5)
                int r8 = com.yeelight.yeelib.R$id.widget_device_connect
                r9.setViewVisibility(r8, r5)
                int r8 = com.yeelight.yeelib.R$id.widget_device_connect_progress_bar
            L_0x08a5:
                r9.setViewVisibility(r8, r6)
                goto L_0x08d9
            L_0x08a9:
                int r0 = com.yeelight.yeelib.R$id.widget_device_connect
                r9.setViewVisibility(r0, r5)
                int r0 = com.yeelight.yeelib.R$id.widget_device_connect_progress_bar
                r9.setViewVisibility(r0, r5)
                boolean r0 = r8.mo23230o0()
                if (r0 == 0) goto L_0x08d0
                com.yeelight.yeelib.device.base.e r8 = (com.yeelight.yeelib.device.base.C3012e) r8
                boolean r8 = r8.mo23146k1()
                if (r8 == 0) goto L_0x08c6
                int r8 = com.yeelight.yeelib.R$id.widget_device_status
                java.lang.String r0 = r7.f15510d
                goto L_0x08ca
            L_0x08c6:
                int r8 = com.yeelight.yeelib.R$id.widget_device_status
                java.lang.String r0 = r7.f15511e
            L_0x08ca:
                r9.setTextViewText(r8, r0)
            L_0x08cd:
                int r8 = com.yeelight.yeelib.R$id.widget_device_status_switch
                goto L_0x08a5
            L_0x08d0:
                int r8 = com.yeelight.yeelib.R$id.widget_device_status
                java.lang.String r0 = r7.f15512f
                r9.setTextViewText(r8, r0)
                goto L_0x07d9
            L_0x08d9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p142ui.appwidget.UpdateService.C8751a.m20611b(com.yeelight.yeelib.device.base.c, android.widget.RemoteViews):void");
        }

        public int getCount() {
            return this.f15507a.getCount();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public RemoteViews getLoadingView() {
            return null;
        }

        public RemoteViews getViewAt(int i) {
            String unused = UpdateService.f15505a;
            StringBuilder sb = new StringBuilder();
            sb.append("getViewAt , position = ");
            sb.append(i);
            String str = null;
            if (i >= this.f15507a.getCount() || this.f15507a.isClosed()) {
                return null;
            }
            this.f15507a.moveToPosition(i);
            RemoteViews remoteViews = new RemoteViews(this.f15508b.getPackageName(), R$layout.list_item_device_widget);
            C6065f fVar = this.f15507a;
            String string = fVar.getString(fVar.getColumnIndex(C6043b.C6044a.C6045a.f12331c));
            C3010c j0 = YeelightDeviceManager.m7794j0(string);
            m20610a(j0, remoteViews);
            m20611b(j0, remoteViews);
            if (j0 != null) {
                str = j0 instanceof C6169f ? "type_room" : j0 instanceof C6119c ? "type_group" : "type_device";
            }
            Intent intent = new Intent();
            intent.setAction("widget_on_click");
            intent.setClass(this.f15508b, YeelightDeviceWidgetProvider.class);
            intent.putExtra("com.yeelight.cherry.device_id", string);
            intent.putExtra("com.yeelight.cherry.type", str);
            intent.putExtra("extra_name_widget_id", this.f15509c);
            intent.putExtra("extra_name_widget_action", "toggle_on_click");
            remoteViews.setOnClickFillInIntent(R$id.widget_device_status_switch, intent);
            Intent intent2 = new Intent();
            intent2.setAction("widget_on_click");
            intent2.setClass(this.f15508b, YeelightDeviceWidgetProvider.class);
            intent2.putExtra("com.yeelight.cherry.device_id", string);
            intent2.putExtra("com.yeelight.cherry.type", str);
            intent2.putExtra("extra_name_widget_id", this.f15509c);
            intent2.putExtra("extra_name_widget_action", "toggle_curtain_open");
            remoteViews.setOnClickFillInIntent(R$id.widget_curtain_open, intent2);
            Intent intent3 = new Intent();
            intent3.setAction("widget_on_click");
            intent3.setClass(this.f15508b, YeelightDeviceWidgetProvider.class);
            intent3.putExtra("com.yeelight.cherry.device_id", string);
            intent3.putExtra("com.yeelight.cherry.type", str);
            intent3.putExtra("extra_name_widget_id", this.f15509c);
            intent3.putExtra("extra_name_widget_action", "toggle_curtain_close");
            remoteViews.setOnClickFillInIntent(R$id.widget_curtain_close, intent3);
            Intent intent4 = new Intent();
            intent4.setAction("widget_on_click");
            intent4.setClass(this.f15508b, YeelightDeviceWidgetProvider.class);
            intent4.putExtra("com.yeelight.cherry.type", str);
            intent4.putExtra("com.yeelight.cherry.device_id", string);
            intent4.putExtra("extra_name_widget_id", this.f15509c);
            intent4.putExtra("extra_name_widget_action", "launch_on_click");
            remoteViews.setOnClickFillInIntent(R$id.widget_list_view_item, intent4);
            Intent intent5 = new Intent();
            intent5.setAction("widget_on_click");
            intent5.setClass(this.f15508b, YeelightDeviceWidgetProvider.class);
            intent5.putExtra("com.yeelight.cherry.type", str);
            intent5.putExtra("com.yeelight.cherry.device_id", string);
            intent5.putExtra("extra_name_widget_id", this.f15509c);
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
            String unused = UpdateService.f15505a;
        }

        public void onDataSetChanged() {
            C6065f fVar = this.f15507a;
            if (fVar != null) {
                fVar.close();
            }
            this.f15507a = new C6065f(DeviceDataProvider.m17588A());
            String unused = UpdateService.f15505a;
            StringBuilder sb = new StringBuilder();
            sb.append("onDataSetChanged , count = ");
            sb.append(this.f15507a.getCount());
        }

        public void onDestroy() {
            C6065f fVar = this.f15507a;
            if (fVar != null) {
                fVar.close();
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new C8751a(this, this, intent);
    }
}
