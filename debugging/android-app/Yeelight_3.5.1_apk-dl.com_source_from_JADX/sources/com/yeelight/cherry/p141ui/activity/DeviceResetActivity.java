package com.yeelight.cherry.p141ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.models.ProductInfo;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C9193k;

/* renamed from: com.yeelight.cherry.ui.activity.DeviceResetActivity */
public class DeviceResetActivity extends BaseActivity {

    /* renamed from: a */
    private ProductInfo f10336a;
    @BindView(2131297242)
    ImageView mProductIcon;
    @BindView(2131297516)
    TextView mSubInfo;
    @BindView(2131297591)
    CommonTitleBar mTitle;
    @BindView(2131297589)
    TextView mTitleView;

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceResetActivity$a */
    class C5248a implements View.OnClickListener {
        C5248a() {
        }

        public void onClick(View view) {
            DeviceResetActivity.this.onBackPressed();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:307:0x05fd, code lost:
        r0.mProductIcon.setImageResource(2131231940);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x06bc, code lost:
        r0.mProductIcon.setImageResource(com.yeelight.cherry.C12224R$drawable.reset_guide_mango);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x06c8, code lost:
        r0.mProductIcon.setImageResource(com.yeelight.cherry.C12224R$drawable.reset_guide_luna);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x07b6, code lost:
        r0.mProductIcon.setImageResource(com.yeelight.cherry.C12224R$drawable.reset_guide_monob);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x07dc, code lost:
        r0.mProductIcon.setImageResource(com.yeelight.cherry.C12224R$drawable.reset_guide_lemon);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x07ed, code lost:
        r1.setImageResource(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:?, code lost:
        return;
     */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m16179V(com.yeelight.yeelib.models.ProductInfo r17) {
        /*
            r16 = this;
            r0 = r16
            java.lang.String r1 = r17.getProductModel()
            r1.hashCode()
            int r2 = r1.hashCode()
            r3 = -1
            switch(r2) {
                case -1644531059: goto L_0x053e;
                case -1494338802: goto L_0x0533;
                case -1462015191: goto L_0x0528;
                case -1462015190: goto L_0x051d;
                case -1462015189: goto L_0x0512;
                case -1462015188: goto L_0x0507;
                case -1462015187: goto L_0x04fc;
                case -1462015186: goto L_0x04f1;
                case -1462015185: goto L_0x04e3;
                case -1462015184: goto L_0x04d5;
                case -1462015183: goto L_0x04c7;
                case -1462015182: goto L_0x04b9;
                case -1462015160: goto L_0x04ab;
                case -1462015159: goto L_0x049d;
                case -1462015158: goto L_0x048f;
                case -1462015157: goto L_0x0481;
                case -1462015156: goto L_0x0473;
                case -1400275319: goto L_0x0465;
                case -1350780909: goto L_0x0457;
                case -1317475915: goto L_0x0449;
                case -1317475914: goto L_0x043b;
                case -1317475913: goto L_0x042d;
                case -1317475910: goto L_0x041f;
                case -1308146495: goto L_0x0411;
                case -1308146494: goto L_0x0403;
                case -1308146493: goto L_0x03f5;
                case -1308146492: goto L_0x03e7;
                case -1308146491: goto L_0x03d9;
                case -1308146490: goto L_0x03cb;
                case -1308146488: goto L_0x03bd;
                case -1308146447: goto L_0x03af;
                case -1308146446: goto L_0x03a1;
                case -1308146445: goto L_0x0393;
                case -1308146443: goto L_0x0385;
                case -1235140472: goto L_0x0377;
                case -1235140471: goto L_0x0369;
                case -1235140468: goto L_0x035b;
                case -1235140467: goto L_0x034d;
                case -1199119278: goto L_0x033f;
                case -1119332198: goto L_0x0331;
                case -1063384694: goto L_0x0323;
                case -1063384689: goto L_0x0315;
                case -1063384687: goto L_0x0307;
                case -1063384685: goto L_0x02f9;
                case -948847040: goto L_0x02eb;
                case -948847038: goto L_0x02dd;
                case -939061393: goto L_0x02cf;
                case -888668266: goto L_0x02c1;
                case -888668265: goto L_0x02b3;
                case -888668264: goto L_0x02a5;
                case -845289556: goto L_0x0297;
                case -845289555: goto L_0x0289;
                case -845289553: goto L_0x027b;
                case -845289551: goto L_0x026d;
                case -845289549: goto L_0x025f;
                case -845289508: goto L_0x0251;
                case -458141175: goto L_0x0243;
                case -458141171: goto L_0x0235;
                case -449944730: goto L_0x0227;
                case -449944729: goto L_0x0219;
                case -449944728: goto L_0x020b;
                case -449944727: goto L_0x01fd;
                case -449944726: goto L_0x01ef;
                case -449944724: goto L_0x01e1;
                case -449944723: goto L_0x01d3;
                case -449944722: goto L_0x01c5;
                case -448603205: goto L_0x01b7;
                case -448603202: goto L_0x01a9;
                case -448603201: goto L_0x019b;
                case -448603157: goto L_0x018d;
                case -448603156: goto L_0x017f;
                case -443031172: goto L_0x0171;
                case -190173984: goto L_0x0163;
                case -190173936: goto L_0x0155;
                case 174464231: goto L_0x0147;
                case 674030242: goto L_0x0139;
                case 922669543: goto L_0x012b;
                case 922669544: goto L_0x011d;
                case 922669545: goto L_0x010f;
                case 922669546: goto L_0x0101;
                case 922669547: goto L_0x00f3;
                case 922669548: goto L_0x00e5;
                case 922669549: goto L_0x00d7;
                case 922669550: goto L_0x00c9;
                case 922669551: goto L_0x00bb;
                case 1201756974: goto L_0x00ad;
                case 1201757021: goto L_0x009f;
                case 1201757023: goto L_0x0091;
                case 1201766335: goto L_0x0083;
                case 1201766336: goto L_0x0075;
                case 1623724661: goto L_0x0067;
                case 1623724662: goto L_0x0059;
                case 1623724663: goto L_0x004b;
                case 2086270815: goto L_0x003d;
                case 2102612488: goto L_0x002f;
                case 2102612489: goto L_0x0021;
                case 2146130361: goto L_0x0013;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x0548
        L_0x0013:
            java.lang.String r2 = "yeelink.light.dnlight2"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x001d
            goto L_0x0548
        L_0x001d:
            r3 = 96
            goto L_0x0548
        L_0x0021:
            java.lang.String r2 = "yeelink.light.meshbulb2"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x002b
            goto L_0x0548
        L_0x002b:
            r3 = 95
            goto L_0x0548
        L_0x002f:
            java.lang.String r2 = "yeelink.light.meshbulb1"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0039
            goto L_0x0548
        L_0x0039:
            r3 = 94
            goto L_0x0548
        L_0x003d:
            java.lang.String r2 = "virtual.yeelink.light.mijia.ceiling"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0047
            goto L_0x0548
        L_0x0047:
            r3 = 93
            goto L_0x0548
        L_0x004b:
            java.lang.String r2 = "yeelink.light.bslamp3"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0055
            goto L_0x0548
        L_0x0055:
            r3 = 92
            goto L_0x0548
        L_0x0059:
            java.lang.String r2 = "yeelink.light.bslamp2"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0063
            goto L_0x0548
        L_0x0063:
            r3 = 91
            goto L_0x0548
        L_0x0067:
            java.lang.String r2 = "yeelink.light.bslamp1"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0071
            goto L_0x0548
        L_0x0071:
            r3 = 90
            goto L_0x0548
        L_0x0075:
            java.lang.String r2 = "yeelink.light.ml2"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x007f
            goto L_0x0548
        L_0x007f:
            r3 = 89
            goto L_0x0548
        L_0x0083:
            java.lang.String r2 = "yeelink.light.ml1"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x008d
            goto L_0x0548
        L_0x008d:
            r3 = 88
            goto L_0x0548
        L_0x0091:
            java.lang.String r2 = "yeelink.light.ctc"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x009b
            goto L_0x0548
        L_0x009b:
            r3 = 87
            goto L_0x0548
        L_0x009f:
            java.lang.String r2 = "yeelink.light.cta"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00a9
            goto L_0x0548
        L_0x00a9:
            r3 = 86
            goto L_0x0548
        L_0x00ad:
            java.lang.String r2 = "yeelink.light.ct2"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00b7
            goto L_0x0548
        L_0x00b7:
            r3 = 85
            goto L_0x0548
        L_0x00bb:
            java.lang.String r2 = "yeelink.light.ceiling9"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00c5
            goto L_0x0548
        L_0x00c5:
            r3 = 84
            goto L_0x0548
        L_0x00c9:
            java.lang.String r2 = "yeelink.light.ceiling8"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00d3
            goto L_0x0548
        L_0x00d3:
            r3 = 83
            goto L_0x0548
        L_0x00d7:
            java.lang.String r2 = "yeelink.light.ceiling7"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00e1
            goto L_0x0548
        L_0x00e1:
            r3 = 82
            goto L_0x0548
        L_0x00e5:
            java.lang.String r2 = "yeelink.light.ceiling6"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00ef
            goto L_0x0548
        L_0x00ef:
            r3 = 81
            goto L_0x0548
        L_0x00f3:
            java.lang.String r2 = "yeelink.light.ceiling5"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00fd
            goto L_0x0548
        L_0x00fd:
            r3 = 80
            goto L_0x0548
        L_0x0101:
            java.lang.String r2 = "yeelink.light.ceiling4"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x010b
            goto L_0x0548
        L_0x010b:
            r3 = 79
            goto L_0x0548
        L_0x010f:
            java.lang.String r2 = "yeelink.light.ceiling3"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0119
            goto L_0x0548
        L_0x0119:
            r3 = 78
            goto L_0x0548
        L_0x011d:
            java.lang.String r2 = "yeelink.light.ceiling2"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0127
            goto L_0x0548
        L_0x0127:
            r3 = 77
            goto L_0x0548
        L_0x012b:
            java.lang.String r2 = "yeelink.light.ceiling1"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0135
            goto L_0x0548
        L_0x0135:
            r3 = 76
            goto L_0x0548
        L_0x0139:
            java.lang.String r2 = "yeelink.curtain.ctmt1"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0143
            goto L_0x0548
        L_0x0143:
            r3 = 75
            goto L_0x0548
        L_0x0147:
            java.lang.String r2 = "virtual.yeelink.light.ceiling"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0151
            goto L_0x0548
        L_0x0151:
            r3 = 74
            goto L_0x0548
        L_0x0155:
            java.lang.String r2 = "yeelink.gateway.va"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x015f
            goto L_0x0548
        L_0x015f:
            r3 = 73
            goto L_0x0548
        L_0x0163:
            java.lang.String r2 = "yeelink.gateway.v1"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x016d
            goto L_0x0548
        L_0x016d:
            r3 = 72
            goto L_0x0548
        L_0x0171:
            java.lang.String r2 = "yeelink.light.spot1"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x017b
            goto L_0x0548
        L_0x017b:
            r3 = 71
            goto L_0x0548
        L_0x017f:
            java.lang.String r2 = "yeelink.light.monob"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0189
            goto L_0x0548
        L_0x0189:
            r3 = 70
            goto L_0x0548
        L_0x018d:
            java.lang.String r2 = "yeelink.light.monoa"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0197
            goto L_0x0548
        L_0x0197:
            r3 = 69
            goto L_0x0548
        L_0x019b:
            java.lang.String r2 = "yeelink.light.mono5"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x01a5
            goto L_0x0548
        L_0x01a5:
            r3 = 68
            goto L_0x0548
        L_0x01a9:
            java.lang.String r2 = "yeelink.light.mono4"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x01b3
            goto L_0x0548
        L_0x01b3:
            r3 = 67
            goto L_0x0548
        L_0x01b7:
            java.lang.String r2 = "yeelink.light.mono1"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x01c1
            goto L_0x0548
        L_0x01c1:
            r3 = 66
            goto L_0x0548
        L_0x01c5:
            java.lang.String r2 = "yeelink.light.lamp9"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x01cf
            goto L_0x0548
        L_0x01cf:
            r3 = 65
            goto L_0x0548
        L_0x01d3:
            java.lang.String r2 = "yeelink.light.lamp8"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x01dd
            goto L_0x0548
        L_0x01dd:
            r3 = 64
            goto L_0x0548
        L_0x01e1:
            java.lang.String r2 = "yeelink.light.lamp7"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x01eb
            goto L_0x0548
        L_0x01eb:
            r3 = 63
            goto L_0x0548
        L_0x01ef:
            java.lang.String r2 = "yeelink.light.lamp5"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x01f9
            goto L_0x0548
        L_0x01f9:
            r3 = 62
            goto L_0x0548
        L_0x01fd:
            java.lang.String r2 = "yeelink.light.lamp4"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0207
            goto L_0x0548
        L_0x0207:
            r3 = 61
            goto L_0x0548
        L_0x020b:
            java.lang.String r2 = "yeelink.light.lamp3"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0215
            goto L_0x0548
        L_0x0215:
            r3 = 60
            goto L_0x0548
        L_0x0219:
            java.lang.String r2 = "yeelink.light.lamp2"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0223
            goto L_0x0548
        L_0x0223:
            r3 = 59
            goto L_0x0548
        L_0x0227:
            java.lang.String r2 = "yeelink.light.lamp1"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0231
            goto L_0x0548
        L_0x0231:
            r3 = 58
            goto L_0x0548
        L_0x0235:
            java.lang.String r2 = "yeelink.light.ceile"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x023f
            goto L_0x0548
        L_0x023f:
            r3 = 57
            goto L_0x0548
        L_0x0243:
            java.lang.String r2 = "yeelink.light.ceila"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x024d
            goto L_0x0548
        L_0x024d:
            r3 = 56
            goto L_0x0548
        L_0x0251:
            java.lang.String r2 = "yeelink.light.stripa"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x025b
            goto L_0x0548
        L_0x025b:
            r3 = 55
            goto L_0x0548
        L_0x025f:
            java.lang.String r2 = "yeelink.light.strip8"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0269
            goto L_0x0548
        L_0x0269:
            r3 = 54
            goto L_0x0548
        L_0x026d:
            java.lang.String r2 = "yeelink.light.strip6"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0277
            goto L_0x0548
        L_0x0277:
            r3 = 53
            goto L_0x0548
        L_0x027b:
            java.lang.String r2 = "yeelink.light.strip4"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0285
            goto L_0x0548
        L_0x0285:
            r3 = 52
            goto L_0x0548
        L_0x0289:
            java.lang.String r2 = "yeelink.light.strip2"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0293
            goto L_0x0548
        L_0x0293:
            r3 = 51
            goto L_0x0548
        L_0x0297:
            java.lang.String r2 = "yeelink.light.strip1"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x02a1
            goto L_0x0548
        L_0x02a1:
            r3 = 50
            goto L_0x0548
        L_0x02a5:
            java.lang.String r2 = "yilai.light.ceiling3"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x02af
            goto L_0x0548
        L_0x02af:
            r3 = 49
            goto L_0x0548
        L_0x02b3:
            java.lang.String r2 = "yilai.light.ceiling2"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x02bd
            goto L_0x0548
        L_0x02bd:
            r3 = 48
            goto L_0x0548
        L_0x02c1:
            java.lang.String r2 = "yilai.light.ceiling1"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x02cb
            goto L_0x0548
        L_0x02cb:
            r3 = 47
            goto L_0x0548
        L_0x02cf:
            java.lang.String r2 = "yeelink.light.plate2"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x02d9
            goto L_0x0548
        L_0x02d9:
            r3 = 46
            goto L_0x0548
        L_0x02dd:
            java.lang.String r2 = "yeelink.light.panel3"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x02e7
            goto L_0x0548
        L_0x02e7:
            r3 = 45
            goto L_0x0548
        L_0x02eb:
            java.lang.String r2 = "yeelink.light.panel1"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x02f5
            goto L_0x0548
        L_0x02f5:
            r3 = 44
            goto L_0x0548
        L_0x02f9:
            java.lang.String r2 = "yeelink.light.lamp19"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0303
            goto L_0x0548
        L_0x0303:
            r3 = 43
            goto L_0x0548
        L_0x0307:
            java.lang.String r2 = "yeelink.light.lamp17"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0311
            goto L_0x0548
        L_0x0311:
            r3 = 42
            goto L_0x0548
        L_0x0315:
            java.lang.String r2 = "yeelink.light.lamp15"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x031f
            goto L_0x0548
        L_0x031f:
            r3 = 41
            goto L_0x0548
        L_0x0323:
            java.lang.String r2 = "yeelink.light.lamp10"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x032d
            goto L_0x0548
        L_0x032d:
            r3 = 40
            goto L_0x0548
        L_0x0331:
            java.lang.String r2 = "yeelink.wifispeaker.v1"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x033b
            goto L_0x0548
        L_0x033b:
            r3 = 39
            goto L_0x0548
        L_0x033f:
            java.lang.String r2 = "yeelink.light.gingko"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0349
            goto L_0x0548
        L_0x0349:
            r3 = 38
            goto L_0x0548
        L_0x034d:
            java.lang.String r2 = "yeelink.light.fancl6"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0357
            goto L_0x0548
        L_0x0357:
            r3 = 37
            goto L_0x0548
        L_0x035b:
            java.lang.String r2 = "yeelink.light.fancl5"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0365
            goto L_0x0548
        L_0x0365:
            r3 = 36
            goto L_0x0548
        L_0x0369:
            java.lang.String r2 = "yeelink.light.fancl2"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0373
            goto L_0x0548
        L_0x0373:
            r3 = 35
            goto L_0x0548
        L_0x0377:
            java.lang.String r2 = "yeelink.light.fancl1"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0381
            goto L_0x0548
        L_0x0381:
            r3 = 34
            goto L_0x0548
        L_0x0385:
            java.lang.String r2 = "yeelink.light.colore"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x038f
            goto L_0x0548
        L_0x038f:
            r3 = 33
            goto L_0x0548
        L_0x0393:
            java.lang.String r2 = "yeelink.light.colorc"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x039d
            goto L_0x0548
        L_0x039d:
            r3 = 32
            goto L_0x0548
        L_0x03a1:
            java.lang.String r2 = "yeelink.light.colorb"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x03ab
            goto L_0x0548
        L_0x03ab:
            r3 = 31
            goto L_0x0548
        L_0x03af:
            java.lang.String r2 = "yeelink.light.colora"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x03b9
            goto L_0x0548
        L_0x03b9:
            r3 = 30
            goto L_0x0548
        L_0x03bd:
            java.lang.String r2 = "yeelink.light.color8"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x03c7
            goto L_0x0548
        L_0x03c7:
            r3 = 29
            goto L_0x0548
        L_0x03cb:
            java.lang.String r2 = "yeelink.light.color6"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x03d5
            goto L_0x0548
        L_0x03d5:
            r3 = 28
            goto L_0x0548
        L_0x03d9:
            java.lang.String r2 = "yeelink.light.color5"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x03e3
            goto L_0x0548
        L_0x03e3:
            r3 = 27
            goto L_0x0548
        L_0x03e7:
            java.lang.String r2 = "yeelink.light.color4"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x03f1
            goto L_0x0548
        L_0x03f1:
            r3 = 26
            goto L_0x0548
        L_0x03f5:
            java.lang.String r2 = "yeelink.light.color3"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x03ff
            goto L_0x0548
        L_0x03ff:
            r3 = 25
            goto L_0x0548
        L_0x0403:
            java.lang.String r2 = "yeelink.light.color2"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x040d
            goto L_0x0548
        L_0x040d:
            r3 = 24
            goto L_0x0548
        L_0x0411:
            java.lang.String r2 = "yeelink.light.color1"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x041b
            goto L_0x0548
        L_0x041b:
            r3 = 23
            goto L_0x0548
        L_0x041f:
            java.lang.String r2 = "yeelink.light.ceil35"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0429
            goto L_0x0548
        L_0x0429:
            r3 = 22
            goto L_0x0548
        L_0x042d:
            java.lang.String r2 = "yeelink.light.ceil32"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0437
            goto L_0x0548
        L_0x0437:
            r3 = 21
            goto L_0x0548
        L_0x043b:
            java.lang.String r2 = "yeelink.light.ceil31"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0445
            goto L_0x0548
        L_0x0445:
            r3 = 20
            goto L_0x0548
        L_0x0449:
            java.lang.String r2 = "yeelink.light.ceil30"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0453
            goto L_0x0548
        L_0x0453:
            r3 = 19
            goto L_0x0548
        L_0x0457:
            java.lang.String r2 = "yeelink.plug.plug"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0461
            goto L_0x0548
        L_0x0461:
            r3 = 18
            goto L_0x0548
        L_0x0465:
            java.lang.String r2 = "yeelink.light.ble1"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x046f
            goto L_0x0548
        L_0x046f:
            r3 = 17
            goto L_0x0548
        L_0x0473:
            java.lang.String r2 = "yeelink.light.ceiling24"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x047d
            goto L_0x0548
        L_0x047d:
            r3 = 16
            goto L_0x0548
        L_0x0481:
            java.lang.String r2 = "yeelink.light.ceiling23"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x048b
            goto L_0x0548
        L_0x048b:
            r3 = 15
            goto L_0x0548
        L_0x048f:
            java.lang.String r2 = "yeelink.light.ceiling22"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0499
            goto L_0x0548
        L_0x0499:
            r3 = 14
            goto L_0x0548
        L_0x049d:
            java.lang.String r2 = "yeelink.light.ceiling21"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x04a7
            goto L_0x0548
        L_0x04a7:
            r3 = 13
            goto L_0x0548
        L_0x04ab:
            java.lang.String r2 = "yeelink.light.ceiling20"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x04b5
            goto L_0x0548
        L_0x04b5:
            r3 = 12
            goto L_0x0548
        L_0x04b9:
            java.lang.String r2 = "yeelink.light.ceiling19"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x04c3
            goto L_0x0548
        L_0x04c3:
            r3 = 11
            goto L_0x0548
        L_0x04c7:
            java.lang.String r2 = "yeelink.light.ceiling18"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x04d1
            goto L_0x0548
        L_0x04d1:
            r3 = 10
            goto L_0x0548
        L_0x04d5:
            java.lang.String r2 = "yeelink.light.ceiling17"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x04df
            goto L_0x0548
        L_0x04df:
            r3 = 9
            goto L_0x0548
        L_0x04e3:
            java.lang.String r2 = "yeelink.light.ceiling16"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x04ed
            goto L_0x0548
        L_0x04ed:
            r3 = 8
            goto L_0x0548
        L_0x04f1:
            java.lang.String r2 = "yeelink.light.ceiling15"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x04fa
            goto L_0x0548
        L_0x04fa:
            r3 = 7
            goto L_0x0548
        L_0x04fc:
            java.lang.String r2 = "yeelink.light.ceiling14"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0505
            goto L_0x0548
        L_0x0505:
            r3 = 6
            goto L_0x0548
        L_0x0507:
            java.lang.String r2 = "yeelink.light.ceiling13"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0510
            goto L_0x0548
        L_0x0510:
            r3 = 5
            goto L_0x0548
        L_0x0512:
            java.lang.String r2 = "yeelink.light.ceiling12"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x051b
            goto L_0x0548
        L_0x051b:
            r3 = 4
            goto L_0x0548
        L_0x051d:
            java.lang.String r2 = "yeelink.light.ceiling11"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0526
            goto L_0x0548
        L_0x0526:
            r3 = 3
            goto L_0x0548
        L_0x0528:
            java.lang.String r2 = "yeelink.light.ceiling10"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0531
            goto L_0x0548
        L_0x0531:
            r3 = 2
            goto L_0x0548
        L_0x0533:
            java.lang.String r2 = "yeelink.switch.sw1"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x053c
            goto L_0x0548
        L_0x053c:
            r3 = 1
            goto L_0x0548
        L_0x053e:
            java.lang.String r2 = "yeelink.bhf_light.v1"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0547
            goto L_0x0548
        L_0x0547:
            r3 = 0
        L_0x0548:
            r1 = 2131755562(0x7f10022a, float:1.9142007E38)
            r2 = 2131756147(0x7f100473, float:1.9143193E38)
            r4 = 2131231940(0x7f0804c4, float:1.8079975E38)
            r6 = 2131756145(0x7f100471, float:1.914319E38)
            r7 = 2131756161(0x7f100481, float:1.9143222E38)
            r8 = 2131756155(0x7f10047b, float:1.914321E38)
            r9 = 2131231958(0x7f0804d6, float:1.8080012E38)
            r10 = 2131231966(0x7f0804de, float:1.8080028E38)
            r11 = 2131756158(0x7f10047e, float:1.9143216E38)
            r12 = 2131231954(0x7f0804d2, float:1.8080004E38)
            r13 = 2131231957(0x7f0804d5, float:1.808001E38)
            r14 = 2131756168(0x7f100488, float:1.9143236E38)
            r15 = 2131756150(0x7f100476, float:1.91432E38)
            r5 = 2131755728(0x7f1002d0, float:1.9142343E38)
            switch(r3) {
                case 0: goto L_0x06c3;
                case 1: goto L_0x08b4;
                case 2: goto L_0x08a8;
                case 3: goto L_0x06c3;
                case 4: goto L_0x06c3;
                case 5: goto L_0x06c3;
                case 6: goto L_0x06c3;
                case 7: goto L_0x06c3;
                case 8: goto L_0x089c;
                case 9: goto L_0x0890;
                case 10: goto L_0x0884;
                case 11: goto L_0x0878;
                case 12: goto L_0x086c;
                case 13: goto L_0x0861;
                case 14: goto L_0x0856;
                case 15: goto L_0x084b;
                case 16: goto L_0x0840;
                case 17: goto L_0x0832;
                case 18: goto L_0x0824;
                case 19: goto L_0x0816;
                case 20: goto L_0x080b;
                case 21: goto L_0x0800;
                case 22: goto L_0x07f2;
                case 23: goto L_0x07e3;
                case 24: goto L_0x07d7;
                case 25: goto L_0x07e3;
                case 26: goto L_0x07d1;
                case 27: goto L_0x07e3;
                case 28: goto L_0x07c8;
                case 29: goto L_0x07d1;
                case 30: goto L_0x07bd;
                case 31: goto L_0x07d1;
                case 32: goto L_0x07b1;
                case 33: goto L_0x07a6;
                case 34: goto L_0x079b;
                case 35: goto L_0x078d;
                case 36: goto L_0x0782;
                case 37: goto L_0x0782;
                case 38: goto L_0x0777;
                case 39: goto L_0x0768;
                case 40: goto L_0x0759;
                case 41: goto L_0x074a;
                case 42: goto L_0x073e;
                case 43: goto L_0x072f;
                case 44: goto L_0x0720;
                case 45: goto L_0x0720;
                case 46: goto L_0x0711;
                case 47: goto L_0x0705;
                case 48: goto L_0x06f9;
                case 49: goto L_0x06ed;
                case 50: goto L_0x06de;
                case 51: goto L_0x06de;
                case 52: goto L_0x06cf;
                case 53: goto L_0x06de;
                case 54: goto L_0x06de;
                case 55: goto L_0x06de;
                case 56: goto L_0x06c3;
                case 57: goto L_0x06c3;
                case 58: goto L_0x06b7;
                case 59: goto L_0x06a8;
                case 60: goto L_0x069c;
                case 61: goto L_0x0693;
                case 62: goto L_0x0687;
                case 63: goto L_0x067b;
                case 64: goto L_0x066f;
                case 65: goto L_0x0660;
                case 66: goto L_0x0654;
                case 67: goto L_0x0648;
                case 68: goto L_0x063c;
                case 69: goto L_0x0654;
                case 70: goto L_0x0635;
                case 71: goto L_0x0629;
                case 72: goto L_0x061a;
                case 73: goto L_0x061a;
                case 74: goto L_0x0613;
                case 75: goto L_0x0604;
                case 76: goto L_0x06c3;
                case 77: goto L_0x06c3;
                case 78: goto L_0x05f8;
                case 79: goto L_0x05f8;
                case 80: goto L_0x05f8;
                case 81: goto L_0x05ec;
                case 82: goto L_0x05e0;
                case 83: goto L_0x05ec;
                case 84: goto L_0x05ec;
                case 85: goto L_0x07d1;
                case 86: goto L_0x07d1;
                case 87: goto L_0x05d4;
                case 88: goto L_0x05c8;
                case 89: goto L_0x05bc;
                case 90: goto L_0x05b0;
                case 91: goto L_0x05a4;
                case 92: goto L_0x072f;
                case 93: goto L_0x059b;
                case 94: goto L_0x058f;
                case 95: goto L_0x0583;
                case 96: goto L_0x0577;
                default: goto L_0x0575;
            }
        L_0x0575:
            goto L_0x08c3
        L_0x0577:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r15)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231935(0x7f0804bf, float:1.8079965E38)
            goto L_0x07ed
        L_0x0583:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r15)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231960(0x7f0804d8, float:1.8080016E38)
            goto L_0x07ed
        L_0x058f:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r15)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231959(0x7f0804d7, float:1.8080014E38)
            goto L_0x07ed
        L_0x059b:
            android.widget.TextView r1 = r0.mSubInfo
            r2 = 2131756160(0x7f100480, float:1.914322E38)
            r1.setText(r2)
            goto L_0x05fd
        L_0x05a4:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r6)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231937(0x7f0804c1, float:1.807997E38)
            goto L_0x07ed
        L_0x05b0:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r6)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231917(0x7f0804ad, float:1.8079929E38)
            goto L_0x07ed
        L_0x05bc:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r15)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231963(0x7f0804db, float:1.8080022E38)
            goto L_0x07ed
        L_0x05c8:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r15)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231962(0x7f0804da, float:1.808002E38)
            goto L_0x07ed
        L_0x05d4:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r15)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231956(0x7f0804d4, float:1.8080008E38)
            goto L_0x07ed
        L_0x05e0:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r5)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231969(0x7f0804e1, float:1.8080034E38)
            goto L_0x07ed
        L_0x05ec:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r5)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231971(0x7f0804e3, float:1.8080038E38)
            goto L_0x07ed
        L_0x05f8:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r5)
        L_0x05fd:
            android.widget.ImageView r1 = r0.mProductIcon
            r1.setImageResource(r4)
            goto L_0x08c3
        L_0x0604:
            android.widget.TextView r1 = r0.mSubInfo
            r2 = 2131755409(0x7f100191, float:1.9141696E38)
            r1.setText(r2)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231934(0x7f0804be, float:1.8079963E38)
            goto L_0x07ed
        L_0x0613:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r2)
            goto L_0x06c8
        L_0x061a:
            android.widget.TextView r1 = r0.mSubInfo
            r2 = 2131756159(0x7f10047f, float:1.9143218E38)
            r1.setText(r2)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231961(0x7f0804d9, float:1.8080018E38)
            goto L_0x07ed
        L_0x0629:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r15)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231977(0x7f0804e9, float:1.808005E38)
            goto L_0x07ed
        L_0x0635:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r15)
            goto L_0x07b6
        L_0x063c:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r15)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231965(0x7f0804dd, float:1.8080026E38)
            goto L_0x07ed
        L_0x0648:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r15)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231964(0x7f0804dc, float:1.8080024E38)
            goto L_0x07ed
        L_0x0654:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r15)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231936(0x7f0804c0, float:1.8079967E38)
            goto L_0x07ed
        L_0x0660:
            android.widget.TextView r1 = r0.mSubInfo
            r2 = 2131756154(0x7f10047a, float:1.9143208E38)
            r1.setText(r2)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231953(0x7f0804d1, float:1.8080002E38)
            goto L_0x07ed
        L_0x066f:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r8)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231952(0x7f0804d0, float:1.808E38)
            goto L_0x07ed
        L_0x067b:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r8)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231951(0x7f0804cf, float:1.8079998E38)
            goto L_0x07ed
        L_0x0687:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r7)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231968(0x7f0804e0, float:1.8080032E38)
            goto L_0x07ed
        L_0x0693:
            android.widget.TextView r1 = r0.mSubInfo
            r2 = 2131756157(0x7f10047d, float:1.9143214E38)
            r1.setText(r2)
            goto L_0x06bc
        L_0x069c:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r11)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231967(0x7f0804df, float:1.808003E38)
            goto L_0x07ed
        L_0x06a8:
            android.widget.TextView r1 = r0.mSubInfo
            r2 = 2131756151(0x7f100477, float:1.9143201E38)
            r1.setText(r2)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231939(0x7f0804c3, float:1.8079973E38)
            goto L_0x07ed
        L_0x06b7:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r11)
        L_0x06bc:
            android.widget.ImageView r1 = r0.mProductIcon
            r1.setImageResource(r9)
            goto L_0x08c3
        L_0x06c3:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r5)
        L_0x06c8:
            android.widget.ImageView r1 = r0.mProductIcon
            r1.setImageResource(r13)
            goto L_0x08c3
        L_0x06cf:
            android.widget.TextView r1 = r0.mSubInfo
            r2 = 2131756166(0x7f100486, float:1.9143232E38)
            r1.setText(r2)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231978(0x7f0804ea, float:1.8080052E38)
            goto L_0x07ed
        L_0x06de:
            android.widget.TextView r1 = r0.mSubInfo
            r2 = 2131756163(0x7f100483, float:1.9143226E38)
            r1.setText(r2)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231973(0x7f0804e5, float:1.8080042E38)
            goto L_0x07ed
        L_0x06ed:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r5)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231946(0x7f0804ca, float:1.8079987E38)
            goto L_0x07ed
        L_0x06f9:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r5)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231945(0x7f0804c9, float:1.8079985E38)
            goto L_0x07ed
        L_0x0705:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r5)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231947(0x7f0804cb, float:1.807999E38)
            goto L_0x07ed
        L_0x0711:
            android.widget.TextView r1 = r0.mSubInfo
            r2 = 2131756164(0x7f100484, float:1.9143228E38)
            r1.setText(r2)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231974(0x7f0804e6, float:1.8080044E38)
            goto L_0x07ed
        L_0x0720:
            android.widget.TextView r1 = r0.mSubInfo
            r2 = 2131756162(0x7f100482, float:1.9143224E38)
            r1.setText(r2)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231972(0x7f0804e4, float:1.808004E38)
            goto L_0x07ed
        L_0x072f:
            android.widget.TextView r1 = r0.mSubInfo
            r2 = 2131756144(0x7f100470, float:1.9143187E38)
            r1.setText(r2)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231938(0x7f0804c2, float:1.8079971E38)
            goto L_0x07ed
        L_0x073e:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r7)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231950(0x7f0804ce, float:1.8079995E38)
            goto L_0x07ed
        L_0x074a:
            android.widget.TextView r1 = r0.mSubInfo
            r2 = 2131756153(0x7f100479, float:1.9143205E38)
            r1.setText(r2)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231949(0x7f0804cd, float:1.8079993E38)
            goto L_0x07ed
        L_0x0759:
            android.widget.TextView r1 = r0.mSubInfo
            r2 = 2131756152(0x7f100478, float:1.9143203E38)
            r1.setText(r2)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231948(0x7f0804cc, float:1.8079991E38)
            goto L_0x07ed
        L_0x0768:
            android.widget.TextView r1 = r0.mSubInfo
            r2 = 2131756165(0x7f100485, float:1.914323E38)
            r1.setText(r2)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231976(0x7f0804e8, float:1.8080048E38)
            goto L_0x07ed
        L_0x0777:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r11)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231944(0x7f0804c8, float:1.8079983E38)
            goto L_0x07ed
        L_0x0782:
            android.widget.TextView r2 = r0.mSubInfo
            r2.setText(r1)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231943(0x7f0804c7, float:1.8079981E38)
            goto L_0x07ed
        L_0x078d:
            android.widget.TextView r1 = r0.mSubInfo
            r2 = 2131755563(0x7f10022b, float:1.9142009E38)
            r1.setText(r2)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231942(0x7f0804c6, float:1.807998E38)
            goto L_0x07ed
        L_0x079b:
            android.widget.TextView r2 = r0.mSubInfo
            r2.setText(r1)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231941(0x7f0804c5, float:1.8079977E38)
            goto L_0x07ed
        L_0x07a6:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r15)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231955(0x7f0804d3, float:1.8080006E38)
            goto L_0x07ed
        L_0x07b1:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r14)
        L_0x07b6:
            android.widget.ImageView r1 = r0.mProductIcon
            r1.setImageResource(r10)
            goto L_0x08c3
        L_0x07bd:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r14)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231933(0x7f0804bd, float:1.807996E38)
            goto L_0x07ed
        L_0x07c8:
            android.widget.TextView r1 = r0.mSubInfo
            r2 = 2131756149(0x7f100475, float:1.9143197E38)
            r1.setText(r2)
            goto L_0x07dc
        L_0x07d1:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r15)
            goto L_0x07dc
        L_0x07d7:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r14)
        L_0x07dc:
            android.widget.ImageView r1 = r0.mProductIcon
            r1.setImageResource(r12)
            goto L_0x08c3
        L_0x07e3:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r14)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231980(0x7f0804ec, float:1.8080056E38)
        L_0x07ed:
            r1.setImageResource(r2)
            goto L_0x08c3
        L_0x07f2:
            android.widget.TextView r1 = r0.mSubInfo
            r2 = 2131756146(0x7f100472, float:1.9143191E38)
            r1.setText(r2)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231931(0x7f0804bb, float:1.8079957E38)
            goto L_0x07ed
        L_0x0800:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r5)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231929(0x7f0804b9, float:1.8079953E38)
            goto L_0x07ed
        L_0x080b:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r5)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231928(0x7f0804b8, float:1.807995E38)
            goto L_0x07ed
        L_0x0816:
            android.widget.TextView r1 = r0.mSubInfo
            r2 = 2131756146(0x7f100472, float:1.9143191E38)
            r1.setText(r2)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231927(0x7f0804b7, float:1.8079949E38)
            goto L_0x07ed
        L_0x0824:
            android.widget.TextView r1 = r0.mSubInfo
            r2 = 2131756063(0x7f10041f, float:1.9143023E38)
            r1.setText(r2)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231975(0x7f0804e7, float:1.8080046E38)
            goto L_0x07ed
        L_0x0832:
            android.widget.TextView r1 = r0.mSubInfo
            r2 = 2131756148(0x7f100474, float:1.9143195E38)
            r1.setText(r2)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231932(0x7f0804bc, float:1.8079959E38)
            goto L_0x07ed
        L_0x0840:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r5)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231926(0x7f0804b6, float:1.8079947E38)
            goto L_0x07ed
        L_0x084b:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r5)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231925(0x7f0804b5, float:1.8079945E38)
            goto L_0x07ed
        L_0x0856:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r5)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231924(0x7f0804b4, float:1.8079943E38)
            goto L_0x07ed
        L_0x0861:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r5)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231923(0x7f0804b3, float:1.807994E38)
            goto L_0x07ed
        L_0x086c:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r5)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231922(0x7f0804b2, float:1.8079939E38)
            goto L_0x07ed
        L_0x0878:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r5)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231921(0x7f0804b1, float:1.8079937E38)
            goto L_0x07ed
        L_0x0884:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r5)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231920(0x7f0804b0, float:1.8079935E38)
            goto L_0x07ed
        L_0x0890:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r5)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231919(0x7f0804af, float:1.8079933E38)
            goto L_0x07ed
        L_0x089c:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r5)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231918(0x7f0804ae, float:1.807993E38)
            goto L_0x07ed
        L_0x08a8:
            android.widget.TextView r1 = r0.mSubInfo
            r1.setText(r2)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231970(0x7f0804e2, float:1.8080036E38)
            goto L_0x07ed
        L_0x08b4:
            android.widget.TextView r1 = r0.mSubInfo
            r2 = 2131756353(0x7f100541, float:1.9143611E38)
            r1.setText(r2)
            android.widget.ImageView r1 = r0.mProductIcon
            r2 = 2131231979(0x7f0804eb, float:1.8080054E38)
            goto L_0x07ed
        L_0x08c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.activity.DeviceResetActivity.m16179V(com.yeelight.yeelib.models.ProductInfo):void");
    }

    @OnClick({2131297163})
    public void next(View view) {
        Intent intent = new Intent(this, SearchDeviceActivity.class);
        intent.putExtra("product", this.f10336a);
        startActivity(intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        setContentView(C12228R$layout.activity_device_reset);
        ButterKnife.bind((Activity) this);
        C9193k.m22157h(true, this);
        this.mTitle.mo36195a("", new C5248a(), (View.OnClickListener) null);
        setTitleBarPadding(this.mTitle);
        ProductInfo productInfo = (ProductInfo) getIntent().getSerializableExtra("product");
        this.f10336a = productInfo;
        if (productInfo != null) {
            m16179V(productInfo);
        } else {
            AppUtils.m8300u("DEVICE_SCAN", "Add new device, show reset info error! No product info");
        }
    }
}
