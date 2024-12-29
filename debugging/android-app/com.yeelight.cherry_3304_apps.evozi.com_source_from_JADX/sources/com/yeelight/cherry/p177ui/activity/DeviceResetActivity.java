package com.yeelight.cherry.p177ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p153g.C9855x;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.cherry.ui.activity.DeviceResetActivity */
public class DeviceResetActivity extends BaseActivity {

    /* renamed from: b */
    private C9855x f10774b;
    @BindView(2131297109)
    ImageView mProductIcon;
    @BindView(2131297361)
    TextView mSubInfo;
    @BindView(2131297424)
    CommonTitleBar mTitle;
    @BindView(2131297422)
    TextView mTitleView;

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceResetActivity$a */
    class C5199a implements View.OnClickListener {
        C5199a() {
        }

        public void onClick(View view) {
            DeviceResetActivity.this.onBackPressed();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x053f, code lost:
        r14.mProductIcon.setImageResource(2131231917);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0617, code lost:
        r14.mProductIcon.setImageResource(com.yeelight.cherry.C11744R$drawable.reset_guide_luna);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x06e6, code lost:
        r14.mProductIcon.setImageResource(com.yeelight.cherry.C11744R$drawable.reset_guide_mango);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x071f, code lost:
        r14.mProductIcon.setImageResource(com.yeelight.cherry.C11744R$drawable.reset_guide_lemon);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x075f, code lost:
        r14.mProductIcon.setImageResource(com.yeelight.cherry.C11744R$drawable.reset_guide_monob);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x077a, code lost:
        r15.setImageResource(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:?, code lost:
        return;
     */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m16257V(com.yeelight.yeelib.p153g.C9855x r15) {
        /*
            r14 = this;
            java.lang.String r15 = r15.mo31841c()
            int r0 = r15.hashCode()
            switch(r0) {
                case -1644531059: goto L_0x0429;
                case -1494338802: goto L_0x041e;
                case -1462015191: goto L_0x0413;
                case -1462015190: goto L_0x0408;
                case -1462015189: goto L_0x03fd;
                case -1462015188: goto L_0x03f2;
                case -1462015187: goto L_0x03e7;
                case -1462015186: goto L_0x03dc;
                case -1462015185: goto L_0x03d1;
                case -1462015184: goto L_0x03c5;
                case -1462015183: goto L_0x03b9;
                case -1462015182: goto L_0x03ad;
                case -1462015160: goto L_0x03a1;
                case -1462015159: goto L_0x0395;
                case -1462015158: goto L_0x0389;
                case -1462015157: goto L_0x037d;
                case -1462015156: goto L_0x0371;
                case -1400275319: goto L_0x0365;
                case -1350780909: goto L_0x0359;
                case -1317475915: goto L_0x034d;
                case -1317475914: goto L_0x0341;
                case -1317475913: goto L_0x0335;
                case -1308146495: goto L_0x032a;
                case -1308146494: goto L_0x031e;
                case -1308146493: goto L_0x0313;
                case -1308146492: goto L_0x0307;
                case -1308146491: goto L_0x02fc;
                case -1308146490: goto L_0x02f0;
                case -1308146488: goto L_0x02e4;
                case -1308146447: goto L_0x02d9;
                case -1308146446: goto L_0x02cd;
                case -1308146445: goto L_0x02c2;
                case -1235140472: goto L_0x02b6;
                case -1235140471: goto L_0x02aa;
                case -1235140468: goto L_0x029e;
                case -1235140467: goto L_0x0292;
                case -1199119278: goto L_0x0286;
                case -1119332198: goto L_0x027a;
                case -1063384694: goto L_0x026e;
                case -1063384689: goto L_0x0262;
                case -1063384687: goto L_0x0256;
                case -1063384685: goto L_0x024a;
                case -948847040: goto L_0x023e;
                case -948847038: goto L_0x0232;
                case -888668266: goto L_0x0226;
                case -888668265: goto L_0x021a;
                case -888668264: goto L_0x020e;
                case -845289556: goto L_0x0202;
                case -845289555: goto L_0x01f6;
                case -845289553: goto L_0x01ea;
                case -845289551: goto L_0x01de;
                case -845289508: goto L_0x01d2;
                case -449944730: goto L_0x01c6;
                case -449944729: goto L_0x01ba;
                case -449944728: goto L_0x01ae;
                case -449944727: goto L_0x01a2;
                case -449944726: goto L_0x0196;
                case -449944724: goto L_0x018a;
                case -449944723: goto L_0x017e;
                case -449944722: goto L_0x0172;
                case -448603205: goto L_0x0167;
                case -448603202: goto L_0x015c;
                case -448603201: goto L_0x0150;
                case -448603157: goto L_0x0145;
                case -448603156: goto L_0x0139;
                case -443031172: goto L_0x012d;
                case -190173984: goto L_0x0121;
                case -190173936: goto L_0x0115;
                case 174464231: goto L_0x0109;
                case 674030242: goto L_0x00fd;
                case 922669543: goto L_0x00f1;
                case 922669544: goto L_0x00e5;
                case 922669545: goto L_0x00d9;
                case 922669546: goto L_0x00cd;
                case 922669547: goto L_0x00c1;
                case 922669548: goto L_0x00b5;
                case 922669549: goto L_0x00a9;
                case 922669550: goto L_0x009d;
                case 922669551: goto L_0x0091;
                case 1201756974: goto L_0x0085;
                case 1201757021: goto L_0x0079;
                case 1201766335: goto L_0x006d;
                case 1201766336: goto L_0x0061;
                case 1623724661: goto L_0x0055;
                case 1623724662: goto L_0x0049;
                case 1623724663: goto L_0x003d;
                case 2086270815: goto L_0x0031;
                case 2102612488: goto L_0x0025;
                case 2102612489: goto L_0x0019;
                case 2146130361: goto L_0x000d;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0434
        L_0x000d:
            java.lang.String r0 = "yeelink.light.dnlight2"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 77
            goto L_0x0435
        L_0x0019:
            java.lang.String r0 = "yeelink.light.meshbulb2"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 79
            goto L_0x0435
        L_0x0025:
            java.lang.String r0 = "yeelink.light.meshbulb1"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 78
            goto L_0x0435
        L_0x0031:
            java.lang.String r0 = "virtual.yeelink.light.mijia.ceiling"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 72
            goto L_0x0435
        L_0x003d:
            java.lang.String r0 = "yeelink.light.bslamp3"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 39
            goto L_0x0435
        L_0x0049:
            java.lang.String r0 = "yeelink.light.bslamp2"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 38
            goto L_0x0435
        L_0x0055:
            java.lang.String r0 = "yeelink.light.bslamp1"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 37
            goto L_0x0435
        L_0x0061:
            java.lang.String r0 = "yeelink.light.ml2"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 82
            goto L_0x0435
        L_0x006d:
            java.lang.String r0 = "yeelink.light.ml1"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 81
            goto L_0x0435
        L_0x0079:
            java.lang.String r0 = "yeelink.light.cta"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 14
            goto L_0x0435
        L_0x0085:
            java.lang.String r0 = "yeelink.light.ct2"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 13
            goto L_0x0435
        L_0x0091:
            java.lang.String r0 = "yeelink.light.ceiling9"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 45
            goto L_0x0435
        L_0x009d:
            java.lang.String r0 = "yeelink.light.ceiling8"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 44
            goto L_0x0435
        L_0x00a9:
            java.lang.String r0 = "yeelink.light.ceiling7"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 66
            goto L_0x0435
        L_0x00b5:
            java.lang.String r0 = "yeelink.light.ceiling6"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 43
            goto L_0x0435
        L_0x00c1:
            java.lang.String r0 = "yeelink.light.ceiling5"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 69
            goto L_0x0435
        L_0x00cd:
            java.lang.String r0 = "yeelink.light.ceiling4"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 68
            goto L_0x0435
        L_0x00d9:
            java.lang.String r0 = "yeelink.light.ceiling3"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 67
            goto L_0x0435
        L_0x00e5:
            java.lang.String r0 = "yeelink.light.ceiling2"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 42
            goto L_0x0435
        L_0x00f1:
            java.lang.String r0 = "yeelink.light.ceiling1"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 41
            goto L_0x0435
        L_0x00fd:
            java.lang.String r0 = "yeelink.curtain.ctmt1"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 83
            goto L_0x0435
        L_0x0109:
            java.lang.String r0 = "virtual.yeelink.light.ceiling"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 71
            goto L_0x0435
        L_0x0115:
            java.lang.String r0 = "yeelink.gateway.va"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 76
            goto L_0x0435
        L_0x0121:
            java.lang.String r0 = "yeelink.gateway.v1"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 75
            goto L_0x0435
        L_0x012d:
            java.lang.String r0 = "yeelink.light.spot1"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 80
            goto L_0x0435
        L_0x0139:
            java.lang.String r0 = "yeelink.light.monob"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 8
            goto L_0x0435
        L_0x0145:
            java.lang.String r0 = "yeelink.light.monoa"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 6
            goto L_0x0435
        L_0x0150:
            java.lang.String r0 = "yeelink.light.mono5"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 11
            goto L_0x0435
        L_0x015c:
            java.lang.String r0 = "yeelink.light.mono4"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 7
            goto L_0x0435
        L_0x0167:
            java.lang.String r0 = "yeelink.light.mono1"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 5
            goto L_0x0435
        L_0x0172:
            java.lang.String r0 = "yeelink.light.lamp9"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 28
            goto L_0x0435
        L_0x017e:
            java.lang.String r0 = "yeelink.light.lamp8"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 27
            goto L_0x0435
        L_0x018a:
            java.lang.String r0 = "yeelink.light.lamp7"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 26
            goto L_0x0435
        L_0x0196:
            java.lang.String r0 = "yeelink.light.lamp5"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 33
            goto L_0x0435
        L_0x01a2:
            java.lang.String r0 = "yeelink.light.lamp4"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 25
            goto L_0x0435
        L_0x01ae:
            java.lang.String r0 = "yeelink.light.lamp3"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 32
            goto L_0x0435
        L_0x01ba:
            java.lang.String r0 = "yeelink.light.lamp2"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 31
            goto L_0x0435
        L_0x01c6:
            java.lang.String r0 = "yeelink.light.lamp1"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 24
            goto L_0x0435
        L_0x01d2:
            java.lang.String r0 = "yeelink.light.stripa"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 22
            goto L_0x0435
        L_0x01de:
            java.lang.String r0 = "yeelink.light.strip6"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 21
            goto L_0x0435
        L_0x01ea:
            java.lang.String r0 = "yeelink.light.strip4"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 23
            goto L_0x0435
        L_0x01f6:
            java.lang.String r0 = "yeelink.light.strip2"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 20
            goto L_0x0435
        L_0x0202:
            java.lang.String r0 = "yeelink.light.strip1"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 19
            goto L_0x0435
        L_0x020e:
            java.lang.String r0 = "yilai.light.ceiling3"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 65
            goto L_0x0435
        L_0x021a:
            java.lang.String r0 = "yilai.light.ceiling2"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 64
            goto L_0x0435
        L_0x0226:
            java.lang.String r0 = "yilai.light.ceiling1"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 63
            goto L_0x0435
        L_0x0232:
            java.lang.String r0 = "yeelink.light.panel3"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 10
            goto L_0x0435
        L_0x023e:
            java.lang.String r0 = "yeelink.light.panel1"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 9
            goto L_0x0435
        L_0x024a:
            java.lang.String r0 = "yeelink.light.lamp19"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 40
            goto L_0x0435
        L_0x0256:
            java.lang.String r0 = "yeelink.light.lamp17"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 34
            goto L_0x0435
        L_0x0262:
            java.lang.String r0 = "yeelink.light.lamp15"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 29
            goto L_0x0435
        L_0x026e:
            java.lang.String r0 = "yeelink.light.lamp10"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 30
            goto L_0x0435
        L_0x027a:
            java.lang.String r0 = "yeelink.wifispeaker.v1"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 74
            goto L_0x0435
        L_0x0286:
            java.lang.String r0 = "yeelink.light.gingko"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 35
            goto L_0x0435
        L_0x0292:
            java.lang.String r0 = "yeelink.light.fancl6"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 88
            goto L_0x0435
        L_0x029e:
            java.lang.String r0 = "yeelink.light.fancl5"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 87
            goto L_0x0435
        L_0x02aa:
            java.lang.String r0 = "yeelink.light.fancl2"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 89
            goto L_0x0435
        L_0x02b6:
            java.lang.String r0 = "yeelink.light.fancl1"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 86
            goto L_0x0435
        L_0x02c2:
            java.lang.String r0 = "yeelink.light.colorc"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 4
            goto L_0x0435
        L_0x02cd:
            java.lang.String r0 = "yeelink.light.colorb"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 17
            goto L_0x0435
        L_0x02d9:
            java.lang.String r0 = "yeelink.light.colora"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 3
            goto L_0x0435
        L_0x02e4:
            java.lang.String r0 = "yeelink.light.color8"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 16
            goto L_0x0435
        L_0x02f0:
            java.lang.String r0 = "yeelink.light.color6"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 18
            goto L_0x0435
        L_0x02fc:
            java.lang.String r0 = "yeelink.light.color5"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 2
            goto L_0x0435
        L_0x0307:
            java.lang.String r0 = "yeelink.light.color4"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 15
            goto L_0x0435
        L_0x0313:
            java.lang.String r0 = "yeelink.light.color3"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 1
            goto L_0x0435
        L_0x031e:
            java.lang.String r0 = "yeelink.light.color2"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 12
            goto L_0x0435
        L_0x032a:
            java.lang.String r0 = "yeelink.light.color1"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 0
            goto L_0x0435
        L_0x0335:
            java.lang.String r0 = "yeelink.light.ceil32"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 62
            goto L_0x0435
        L_0x0341:
            java.lang.String r0 = "yeelink.light.ceil31"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 61
            goto L_0x0435
        L_0x034d:
            java.lang.String r0 = "yeelink.light.ceil30"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 60
            goto L_0x0435
        L_0x0359:
            java.lang.String r0 = "yeelink.plug.plug"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 85
            goto L_0x0435
        L_0x0365:
            java.lang.String r0 = "yeelink.light.ble1"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 36
            goto L_0x0435
        L_0x0371:
            java.lang.String r0 = "yeelink.light.ceiling24"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 59
            goto L_0x0435
        L_0x037d:
            java.lang.String r0 = "yeelink.light.ceiling23"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 58
            goto L_0x0435
        L_0x0389:
            java.lang.String r0 = "yeelink.light.ceiling22"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 57
            goto L_0x0435
        L_0x0395:
            java.lang.String r0 = "yeelink.light.ceiling21"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 56
            goto L_0x0435
        L_0x03a1:
            java.lang.String r0 = "yeelink.light.ceiling20"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 55
            goto L_0x0435
        L_0x03ad:
            java.lang.String r0 = "yeelink.light.ceiling19"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 54
            goto L_0x0435
        L_0x03b9:
            java.lang.String r0 = "yeelink.light.ceiling18"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 53
            goto L_0x0435
        L_0x03c5:
            java.lang.String r0 = "yeelink.light.ceiling17"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 52
            goto L_0x0435
        L_0x03d1:
            java.lang.String r0 = "yeelink.light.ceiling16"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 51
            goto L_0x0435
        L_0x03dc:
            java.lang.String r0 = "yeelink.light.ceiling15"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 50
            goto L_0x0435
        L_0x03e7:
            java.lang.String r0 = "yeelink.light.ceiling14"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 49
            goto L_0x0435
        L_0x03f2:
            java.lang.String r0 = "yeelink.light.ceiling13"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 48
            goto L_0x0435
        L_0x03fd:
            java.lang.String r0 = "yeelink.light.ceiling12"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 47
            goto L_0x0435
        L_0x0408:
            java.lang.String r0 = "yeelink.light.ceiling11"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 46
            goto L_0x0435
        L_0x0413:
            java.lang.String r0 = "yeelink.light.ceiling10"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 70
            goto L_0x0435
        L_0x041e:
            java.lang.String r0 = "yeelink.switch.sw1"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 84
            goto L_0x0435
        L_0x0429:
            java.lang.String r0 = "yeelink.bhf_light.v1"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0434
            r15 = 73
            goto L_0x0435
        L_0x0434:
            r15 = -1
        L_0x0435:
            r0 = 2131755558(0x7f100226, float:1.9141999E38)
            r1 = 2131231917(0x7f0804ad, float:1.8079929E38)
            r2 = 2131756124(0x7f10045c, float:1.9143147E38)
            r3 = 2131756138(0x7f10046a, float:1.9143175E38)
            r4 = 2131756133(0x7f100465, float:1.9143165E38)
            r5 = 2131231933(0x7f0804bd, float:1.807996E38)
            r6 = 2131231941(0x7f0804c5, float:1.8079977E38)
            r7 = 2131756125(0x7f10045d, float:1.9143149E38)
            r8 = 2131756135(0x7f100467, float:1.9143169E38)
            r9 = 2131231931(0x7f0804bb, float:1.8079957E38)
            r10 = 2131231932(0x7f0804bc, float:1.8079959E38)
            r11 = 2131756144(0x7f100470, float:1.9143187E38)
            r12 = 2131756128(0x7f100460, float:1.9143155E38)
            r13 = 2131755719(0x7f1002c7, float:1.9142325E38)
            switch(r15) {
                case 0: goto L_0x0770;
                case 1: goto L_0x0770;
                case 2: goto L_0x0770;
                case 3: goto L_0x0765;
                case 4: goto L_0x075a;
                case 5: goto L_0x074f;
                case 6: goto L_0x074f;
                case 7: goto L_0x0744;
                case 8: goto L_0x073e;
                case 9: goto L_0x0730;
                case 10: goto L_0x0730;
                case 11: goto L_0x0725;
                case 12: goto L_0x071a;
                case 13: goto L_0x0714;
                case 14: goto L_0x0714;
                case 15: goto L_0x0714;
                case 16: goto L_0x0714;
                case 17: goto L_0x0714;
                case 18: goto L_0x070b;
                case 19: goto L_0x06fc;
                case 20: goto L_0x06fc;
                case 21: goto L_0x06fc;
                case 22: goto L_0x06fc;
                case 23: goto L_0x06ed;
                case 24: goto L_0x06e1;
                case 25: goto L_0x06d8;
                case 26: goto L_0x06cc;
                case 27: goto L_0x06c0;
                case 28: goto L_0x06b1;
                case 29: goto L_0x06a2;
                case 30: goto L_0x0693;
                case 31: goto L_0x0684;
                case 32: goto L_0x0678;
                case 33: goto L_0x066c;
                case 34: goto L_0x0660;
                case 35: goto L_0x0654;
                case 36: goto L_0x0645;
                case 37: goto L_0x0639;
                case 38: goto L_0x062d;
                case 39: goto L_0x061e;
                case 40: goto L_0x061e;
                case 41: goto L_0x0612;
                case 42: goto L_0x0612;
                case 43: goto L_0x0606;
                case 44: goto L_0x0606;
                case 45: goto L_0x0606;
                case 46: goto L_0x0612;
                case 47: goto L_0x0612;
                case 48: goto L_0x0612;
                case 49: goto L_0x0612;
                case 50: goto L_0x0612;
                case 51: goto L_0x05fa;
                case 52: goto L_0x05ee;
                case 53: goto L_0x05e2;
                case 54: goto L_0x05d6;
                case 55: goto L_0x05ca;
                case 56: goto L_0x05be;
                case 57: goto L_0x05b2;
                case 58: goto L_0x05a6;
                case 59: goto L_0x059a;
                case 60: goto L_0x058e;
                case 61: goto L_0x0582;
                case 62: goto L_0x0576;
                case 63: goto L_0x056a;
                case 64: goto L_0x055e;
                case 65: goto L_0x0552;
                case 66: goto L_0x0546;
                case 67: goto L_0x053a;
                case 68: goto L_0x053a;
                case 69: goto L_0x053a;
                case 70: goto L_0x052e;
                case 71: goto L_0x0527;
                case 72: goto L_0x051e;
                case 73: goto L_0x0612;
                case 74: goto L_0x050f;
                case 75: goto L_0x0500;
                case 76: goto L_0x0500;
                case 77: goto L_0x04f4;
                case 78: goto L_0x04e8;
                case 79: goto L_0x04dc;
                case 80: goto L_0x04d0;
                case 81: goto L_0x04c4;
                case 82: goto L_0x04b8;
                case 83: goto L_0x04a9;
                case 84: goto L_0x049a;
                case 85: goto L_0x048b;
                case 86: goto L_0x047f;
                case 87: goto L_0x0473;
                case 88: goto L_0x0473;
                case 89: goto L_0x0464;
                default: goto L_0x0462;
            }
        L_0x0462:
            goto L_0x077d
        L_0x0464:
            android.widget.TextView r15 = r14.mSubInfo
            r0 = 2131755559(0x7f100227, float:1.9142E38)
            r15.setText(r0)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231919(0x7f0804af, float:1.8079933E38)
            goto L_0x077a
        L_0x0473:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r0)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231920(0x7f0804b0, float:1.8079935E38)
            goto L_0x077a
        L_0x047f:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r0)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231918(0x7f0804ae, float:1.807993E38)
            goto L_0x077a
        L_0x048b:
            android.widget.TextView r15 = r14.mSubInfo
            r0 = 2131756051(0x7f100413, float:1.9142999E38)
            r15.setText(r0)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231949(0x7f0804cd, float:1.8079993E38)
            goto L_0x077a
        L_0x049a:
            android.widget.TextView r15 = r14.mSubInfo
            r0 = 2131756324(0x7f100524, float:1.9143552E38)
            r15.setText(r0)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231953(0x7f0804d1, float:1.8080002E38)
            goto L_0x077a
        L_0x04a9:
            android.widget.TextView r15 = r14.mSubInfo
            r0 = 2131755405(0x7f10018d, float:1.9141688E38)
            r15.setText(r0)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231911(0x7f0804a7, float:1.8079916E38)
            goto L_0x077a
        L_0x04b8:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r12)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231938(0x7f0804c2, float:1.8079971E38)
            goto L_0x077a
        L_0x04c4:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r12)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231937(0x7f0804c1, float:1.807997E38)
            goto L_0x077a
        L_0x04d0:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r12)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231951(0x7f0804cf, float:1.8079998E38)
            goto L_0x077a
        L_0x04dc:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r12)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231935(0x7f0804bf, float:1.8079965E38)
            goto L_0x077a
        L_0x04e8:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r12)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231934(0x7f0804be, float:1.8079963E38)
            goto L_0x077a
        L_0x04f4:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r12)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231912(0x7f0804a8, float:1.8079918E38)
            goto L_0x077a
        L_0x0500:
            android.widget.TextView r15 = r14.mSubInfo
            r0 = 2131756136(0x7f100468, float:1.914317E38)
            r15.setText(r0)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231936(0x7f0804c0, float:1.8079967E38)
            goto L_0x077a
        L_0x050f:
            android.widget.TextView r15 = r14.mSubInfo
            r0 = 2131756141(0x7f10046d, float:1.9143181E38)
            r15.setText(r0)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231950(0x7f0804ce, float:1.8079995E38)
            goto L_0x077a
        L_0x051e:
            android.widget.TextView r15 = r14.mSubInfo
            r0 = 2131756137(0x7f100469, float:1.9143173E38)
            r15.setText(r0)
            goto L_0x053f
        L_0x0527:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r7)
            goto L_0x0617
        L_0x052e:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r7)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231945(0x7f0804c9, float:1.8079985E38)
            goto L_0x077a
        L_0x053a:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r13)
        L_0x053f:
            android.widget.ImageView r15 = r14.mProductIcon
            r15.setImageResource(r1)
            goto L_0x077d
        L_0x0546:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r13)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231944(0x7f0804c8, float:1.8079983E38)
            goto L_0x077a
        L_0x0552:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r13)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231923(0x7f0804b3, float:1.807994E38)
            goto L_0x077a
        L_0x055e:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r13)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231922(0x7f0804b2, float:1.8079939E38)
            goto L_0x077a
        L_0x056a:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r13)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231924(0x7f0804b4, float:1.8079943E38)
            goto L_0x077a
        L_0x0576:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r13)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231907(0x7f0804a3, float:1.8079908E38)
            goto L_0x077a
        L_0x0582:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r13)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231906(0x7f0804a2, float:1.8079906E38)
            goto L_0x077a
        L_0x058e:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r7)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231905(0x7f0804a1, float:1.8079904E38)
            goto L_0x077a
        L_0x059a:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r13)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231904(0x7f0804a0, float:1.8079902E38)
            goto L_0x077a
        L_0x05a6:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r13)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231903(0x7f08049f, float:1.80799E38)
            goto L_0x077a
        L_0x05b2:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r13)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231902(0x7f08049e, float:1.8079898E38)
            goto L_0x077a
        L_0x05be:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r13)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231901(0x7f08049d, float:1.8079896E38)
            goto L_0x077a
        L_0x05ca:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r13)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231900(0x7f08049c, float:1.8079894E38)
            goto L_0x077a
        L_0x05d6:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r13)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231899(0x7f08049b, float:1.8079892E38)
            goto L_0x077a
        L_0x05e2:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r13)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231898(0x7f08049a, float:1.807989E38)
            goto L_0x077a
        L_0x05ee:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r13)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231897(0x7f080499, float:1.8079888E38)
            goto L_0x077a
        L_0x05fa:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r13)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231896(0x7f080498, float:1.8079886E38)
            goto L_0x077a
        L_0x0606:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r13)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231946(0x7f0804ca, float:1.8079987E38)
            goto L_0x077a
        L_0x0612:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r13)
        L_0x0617:
            android.widget.ImageView r15 = r14.mProductIcon
            r15.setImageResource(r10)
            goto L_0x077d
        L_0x061e:
            android.widget.TextView r15 = r14.mSubInfo
            r0 = 2131756123(0x7f10045b, float:1.9143145E38)
            r15.setText(r0)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231915(0x7f0804ab, float:1.8079924E38)
            goto L_0x077a
        L_0x062d:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r2)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231914(0x7f0804aa, float:1.8079922E38)
            goto L_0x077a
        L_0x0639:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r2)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231895(0x7f080497, float:1.8079884E38)
            goto L_0x077a
        L_0x0645:
            android.widget.TextView r15 = r14.mSubInfo
            r0 = 2131756126(0x7f10045e, float:1.914315E38)
            r15.setText(r0)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231909(0x7f0804a5, float:1.8079912E38)
            goto L_0x077a
        L_0x0654:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r8)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231921(0x7f0804b1, float:1.8079937E38)
            goto L_0x077a
        L_0x0660:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r3)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231927(0x7f0804b7, float:1.8079949E38)
            goto L_0x077a
        L_0x066c:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r3)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231943(0x7f0804c7, float:1.8079981E38)
            goto L_0x077a
        L_0x0678:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r8)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231942(0x7f0804c6, float:1.807998E38)
            goto L_0x077a
        L_0x0684:
            android.widget.TextView r15 = r14.mSubInfo
            r0 = 2131756129(0x7f100461, float:1.9143157E38)
            r15.setText(r0)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231916(0x7f0804ac, float:1.8079927E38)
            goto L_0x077a
        L_0x0693:
            android.widget.TextView r15 = r14.mSubInfo
            r0 = 2131756130(0x7f100462, float:1.9143159E38)
            r15.setText(r0)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231925(0x7f0804b5, float:1.8079945E38)
            goto L_0x077a
        L_0x06a2:
            android.widget.TextView r15 = r14.mSubInfo
            r0 = 2131756131(0x7f100463, float:1.914316E38)
            r15.setText(r0)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231926(0x7f0804b6, float:1.8079947E38)
            goto L_0x077a
        L_0x06b1:
            android.widget.TextView r15 = r14.mSubInfo
            r0 = 2131756132(0x7f100464, float:1.9143163E38)
            r15.setText(r0)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231930(0x7f0804ba, float:1.8079955E38)
            goto L_0x077a
        L_0x06c0:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r4)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231929(0x7f0804b9, float:1.8079953E38)
            goto L_0x077a
        L_0x06cc:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r4)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231928(0x7f0804b8, float:1.807995E38)
            goto L_0x077a
        L_0x06d8:
            android.widget.TextView r15 = r14.mSubInfo
            r0 = 2131756134(0x7f100466, float:1.9143167E38)
            r15.setText(r0)
            goto L_0x06e6
        L_0x06e1:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r8)
        L_0x06e6:
            android.widget.ImageView r15 = r14.mProductIcon
            r15.setImageResource(r5)
            goto L_0x077d
        L_0x06ed:
            android.widget.TextView r15 = r14.mSubInfo
            r0 = 2131756142(0x7f10046e, float:1.9143183E38)
            r15.setText(r0)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231952(0x7f0804d0, float:1.808E38)
            goto L_0x077a
        L_0x06fc:
            android.widget.TextView r15 = r14.mSubInfo
            r0 = 2131756140(0x7f10046c, float:1.914318E38)
            r15.setText(r0)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231948(0x7f0804cc, float:1.8079991E38)
            goto L_0x077a
        L_0x070b:
            android.widget.TextView r15 = r14.mSubInfo
            r0 = 2131756127(0x7f10045f, float:1.9143153E38)
            r15.setText(r0)
            goto L_0x071f
        L_0x0714:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r12)
            goto L_0x071f
        L_0x071a:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r11)
        L_0x071f:
            android.widget.ImageView r15 = r14.mProductIcon
            r15.setImageResource(r9)
            goto L_0x077d
        L_0x0725:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r12)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231940(0x7f0804c4, float:1.8079975E38)
            goto L_0x077a
        L_0x0730:
            android.widget.TextView r15 = r14.mSubInfo
            r0 = 2131756139(0x7f10046b, float:1.9143177E38)
            r15.setText(r0)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231947(0x7f0804cb, float:1.807999E38)
            goto L_0x077a
        L_0x073e:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r12)
            goto L_0x075f
        L_0x0744:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r12)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231939(0x7f0804c3, float:1.8079973E38)
            goto L_0x077a
        L_0x074f:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r12)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231913(0x7f0804a9, float:1.807992E38)
            goto L_0x077a
        L_0x075a:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r11)
        L_0x075f:
            android.widget.ImageView r15 = r14.mProductIcon
            r15.setImageResource(r6)
            goto L_0x077d
        L_0x0765:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r11)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231910(0x7f0804a6, float:1.8079914E38)
            goto L_0x077a
        L_0x0770:
            android.widget.TextView r15 = r14.mSubInfo
            r15.setText(r11)
            android.widget.ImageView r15 = r14.mProductIcon
            r0 = 2131231954(0x7f0804d2, float:1.8080004E38)
        L_0x077a:
            r15.setImageResource(r0)
        L_0x077d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.activity.DeviceResetActivity.m16257V(com.yeelight.yeelib.g.x):void");
    }

    @OnClick({2131297041})
    public void next(View view) {
        Intent intent = new Intent(this, SearchDeviceActivity.class);
        intent.putExtra("product", this.f10774b);
        startActivity(intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        setContentView(C11748R$layout.activity_device_reset);
        ButterKnife.bind((Activity) this);
        C10547m.m25758h(true, this);
        this.mTitle.mo32825a("", new C5199a(), (View.OnClickListener) null);
        setTitleBarPadding(this.mTitle);
        C9855x xVar = (C9855x) getIntent().getSerializableExtra("product");
        this.f10774b = xVar;
        if (xVar != null) {
            m16257V(xVar);
        } else {
            C4308b.m12139r("DEVICE_SCAN", "Add new device, show reset info error! No product info");
        }
    }
}
