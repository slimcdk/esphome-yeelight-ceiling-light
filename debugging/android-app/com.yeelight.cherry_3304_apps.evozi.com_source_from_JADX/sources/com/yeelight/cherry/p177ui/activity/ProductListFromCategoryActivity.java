package com.yeelight.cherry.p177ui.activity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p177ui.adapter.ProductFromCategoryAdapter;
import com.yeelight.cherry.p177ui.adapter.ProductListAdapter;
import com.yeelight.yeelib.p152f.C4239r;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p153g.C9853v;
import com.yeelight.yeelib.p153g.C9855x;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.utils.C10547m;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.activity.ProductListFromCategoryActivity */
public class ProductListFromCategoryActivity extends BaseActivity {

    /* renamed from: b */
    private BroadcastReceiver f11614b = new C5556a();

    /* renamed from: c */
    private BroadcastReceiver f11615c = new C5557b();

    /* renamed from: d */
    private C10526e f11616d;

    /* renamed from: e */
    private C10526e f11617e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ProgressDialog f11618f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C9855x f11619g;
    @BindView(2131297244)
    RecyclerView mRvProduct;
    @BindView(2131297424)
    CommonTitleBar mTitleBar;

    /* renamed from: com.yeelight.cherry.ui.activity.ProductListFromCategoryActivity$a */
    class C5556a extends BroadcastReceiver {
        C5556a() {
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x01d2, code lost:
            if (r4.equals("yeelink.light.mb2grp") != false) goto L_0x0388;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onReceive(android.content.Context r4, android.content.Intent r5) {
            /*
                r3 = this;
                com.yeelight.cherry.ui.activity.ProductListFromCategoryActivity r4 = com.yeelight.cherry.p177ui.activity.ProductListFromCategoryActivity.this
                com.yeelight.yeelib.g.x r4 = r4.f11619g
                if (r4 != 0) goto L_0x0009
                return
            L_0x0009:
                java.lang.String r4 = r5.getAction()
                java.lang.String r0 = "android.bluetooth.adapter.action.STATE_CHANGED"
                boolean r4 = r4.equals(r0)
                java.lang.String r0 = "android.bluetooth.adapter.extra.STATE"
                r1 = 10
                if (r4 == 0) goto L_0x03a7
                int r4 = r5.getIntExtra(r0, r1)
                r2 = 12
                if (r4 != r2) goto L_0x03a7
                com.yeelight.cherry.ui.activity.ProductListFromCategoryActivity r4 = com.yeelight.cherry.p177ui.activity.ProductListFromCategoryActivity.this
                android.app.ProgressDialog r4 = r4.f11618f
                if (r4 == 0) goto L_0x0032
                com.yeelight.cherry.ui.activity.ProductListFromCategoryActivity r4 = com.yeelight.cherry.p177ui.activity.ProductListFromCategoryActivity.this
                android.app.ProgressDialog r4 = r4.f11618f
                r4.dismiss()
            L_0x0032:
                com.yeelight.cherry.ui.activity.ProductListFromCategoryActivity r4 = com.yeelight.cherry.p177ui.activity.ProductListFromCategoryActivity.this
                com.yeelight.yeelib.g.x r4 = r4.f11619g
                java.lang.String r4 = r4.mo31841c()
                r5 = -1
                int r0 = r4.hashCode()
                switch(r0) {
                    case -1644531059: goto L_0x037c;
                    case -1494338802: goto L_0x0371;
                    case -1462015191: goto L_0x0366;
                    case -1462015190: goto L_0x035b;
                    case -1462015189: goto L_0x0350;
                    case -1462015188: goto L_0x0345;
                    case -1462015187: goto L_0x033a;
                    case -1462015186: goto L_0x032f;
                    case -1462015185: goto L_0x0324;
                    case -1462015184: goto L_0x0318;
                    case -1462015183: goto L_0x030c;
                    case -1462015182: goto L_0x0300;
                    case -1462015160: goto L_0x02f4;
                    case -1462015159: goto L_0x02e8;
                    case -1462015158: goto L_0x02dc;
                    case -1462015157: goto L_0x02d0;
                    case -1462015156: goto L_0x02c4;
                    case -1400275319: goto L_0x02b9;
                    case -1350780909: goto L_0x02ad;
                    case -1317475940: goto L_0x02a1;
                    case -1317475939: goto L_0x0295;
                    case -1317475937: goto L_0x0289;
                    case -1317475915: goto L_0x027d;
                    case -1317475914: goto L_0x0271;
                    case -1317475913: goto L_0x0265;
                    case -1317475912: goto L_0x0259;
                    case -1308146492: goto L_0x024d;
                    case -1308146490: goto L_0x0241;
                    case -1308146488: goto L_0x0235;
                    case -1282176368: goto L_0x0229;
                    case -1235140472: goto L_0x021d;
                    case -1235140471: goto L_0x0211;
                    case -1235140468: goto L_0x0205;
                    case -1235140467: goto L_0x01f9;
                    case -1199119278: goto L_0x01ee;
                    case -1063384685: goto L_0x01e2;
                    case -1035626052: goto L_0x01d6;
                    case -1035596261: goto L_0x01cc;
                    case -888668266: goto L_0x01c0;
                    case -888668265: goto L_0x01b4;
                    case -888668264: goto L_0x01a8;
                    case -850921852: goto L_0x019c;
                    case -845289553: goto L_0x0190;
                    case -845289551: goto L_0x0184;
                    case -845289508: goto L_0x0178;
                    case -458141175: goto L_0x016c;
                    case -458141174: goto L_0x0160;
                    case -458141173: goto L_0x0154;
                    case -458141172: goto L_0x0148;
                    case -443031172: goto L_0x013d;
                    case -190173984: goto L_0x0131;
                    case -190173936: goto L_0x0125;
                    case 174464231: goto L_0x0119;
                    case 674030242: goto L_0x010d;
                    case 922669543: goto L_0x0101;
                    case 922669544: goto L_0x00f5;
                    case 922669545: goto L_0x00e9;
                    case 922669546: goto L_0x00dd;
                    case 922669547: goto L_0x00d1;
                    case 922669548: goto L_0x00c5;
                    case 922669549: goto L_0x00b9;
                    case 922669550: goto L_0x00ad;
                    case 1201766335: goto L_0x00a2;
                    case 1201766336: goto L_0x0097;
                    case 1623724661: goto L_0x008b;
                    case 1623724662: goto L_0x007f;
                    case 1623724663: goto L_0x0073;
                    case 2086270815: goto L_0x0067;
                    case 2102612488: goto L_0x005c;
                    case 2102612489: goto L_0x0051;
                    case 2146130361: goto L_0x0046;
                    default: goto L_0x0044;
                }
            L_0x0044:
                goto L_0x0387
            L_0x0046:
                java.lang.String r0 = "yeelink.light.dnlight2"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 2
                goto L_0x0388
            L_0x0051:
                java.lang.String r0 = "yeelink.light.meshbulb2"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 4
                goto L_0x0388
            L_0x005c:
                java.lang.String r0 = "yeelink.light.meshbulb1"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 3
                goto L_0x0388
            L_0x0067:
                java.lang.String r0 = "virtual.yeelink.light.mijia.ceiling"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 61
                goto L_0x0388
            L_0x0073:
                java.lang.String r0 = "yeelink.light.bslamp3"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 57
                goto L_0x0388
            L_0x007f:
                java.lang.String r0 = "yeelink.light.bslamp2"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 56
                goto L_0x0388
            L_0x008b:
                java.lang.String r0 = "yeelink.light.bslamp1"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 55
                goto L_0x0388
            L_0x0097:
                java.lang.String r0 = "yeelink.light.ml2"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 7
                goto L_0x0388
            L_0x00a2:
                java.lang.String r0 = "yeelink.light.ml1"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 6
                goto L_0x0388
            L_0x00ad:
                java.lang.String r0 = "yeelink.light.ceiling8"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 25
                goto L_0x0388
            L_0x00b9:
                java.lang.String r0 = "yeelink.light.ceiling7"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 24
                goto L_0x0388
            L_0x00c5:
                java.lang.String r0 = "yeelink.light.ceiling6"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 23
                goto L_0x0388
            L_0x00d1:
                java.lang.String r0 = "yeelink.light.ceiling5"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 22
                goto L_0x0388
            L_0x00dd:
                java.lang.String r0 = "yeelink.light.ceiling4"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 21
                goto L_0x0388
            L_0x00e9:
                java.lang.String r0 = "yeelink.light.ceiling3"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 20
                goto L_0x0388
            L_0x00f5:
                java.lang.String r0 = "yeelink.light.ceiling2"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 19
                goto L_0x0388
            L_0x0101:
                java.lang.String r0 = "yeelink.light.ceiling1"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 18
                goto L_0x0388
            L_0x010d:
                java.lang.String r0 = "yeelink.curtain.ctmt1"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 62
                goto L_0x0388
            L_0x0119:
                java.lang.String r0 = "virtual.yeelink.light.ceiling"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 60
                goto L_0x0388
            L_0x0125:
                java.lang.String r0 = "yeelink.gateway.va"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 70
                goto L_0x0388
            L_0x0131:
                java.lang.String r0 = "yeelink.gateway.v1"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 69
                goto L_0x0388
            L_0x013d:
                java.lang.String r0 = "yeelink.light.spot1"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 5
                goto L_0x0388
            L_0x0148:
                java.lang.String r0 = "yeelink.light.ceild"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 51
                goto L_0x0388
            L_0x0154:
                java.lang.String r0 = "yeelink.light.ceilc"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 50
                goto L_0x0388
            L_0x0160:
                java.lang.String r0 = "yeelink.light.ceilb"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 49
                goto L_0x0388
            L_0x016c:
                java.lang.String r0 = "yeelink.light.ceila"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 48
                goto L_0x0388
            L_0x0178:
                java.lang.String r0 = "yeelink.light.stripa"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 17
                goto L_0x0388
            L_0x0184:
                java.lang.String r0 = "yeelink.light.strip6"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 16
                goto L_0x0388
            L_0x0190:
                java.lang.String r0 = "yeelink.light.strip4"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 15
                goto L_0x0388
            L_0x019c:
                java.lang.String r0 = "yeelink.light.sp1grp"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 11
                goto L_0x0388
            L_0x01a8:
                java.lang.String r0 = "yilai.light.ceiling3"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 54
                goto L_0x0388
            L_0x01b4:
                java.lang.String r0 = "yilai.light.ceiling2"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 53
                goto L_0x0388
            L_0x01c0:
                java.lang.String r0 = "yilai.light.ceiling1"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 52
                goto L_0x0388
            L_0x01cc:
                java.lang.String r0 = "yeelink.light.mb2grp"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                goto L_0x0388
            L_0x01d6:
                java.lang.String r0 = "yeelink.light.mb1grp"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 9
                goto L_0x0388
            L_0x01e2:
                java.lang.String r0 = "yeelink.light.lamp19"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 58
                goto L_0x0388
            L_0x01ee:
                java.lang.String r0 = "yeelink.light.gingko"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 1
                goto L_0x0388
            L_0x01f9:
                java.lang.String r0 = "yeelink.light.fancl6"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 68
                goto L_0x0388
            L_0x0205:
                java.lang.String r0 = "yeelink.light.fancl5"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 67
                goto L_0x0388
            L_0x0211:
                java.lang.String r0 = "yeelink.light.fancl2"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 66
                goto L_0x0388
            L_0x021d:
                java.lang.String r0 = "yeelink.light.fancl1"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 65
                goto L_0x0388
            L_0x0229:
                java.lang.String r0 = "yeelink.light.dn2grp"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 8
                goto L_0x0388
            L_0x0235:
                java.lang.String r0 = "yeelink.light.color8"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 14
                goto L_0x0388
            L_0x0241:
                java.lang.String r0 = "yeelink.light.color6"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 13
                goto L_0x0388
            L_0x024d:
                java.lang.String r0 = "yeelink.light.color4"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 12
                goto L_0x0388
            L_0x0259:
                java.lang.String r0 = "yeelink.light.ceil33"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 47
                goto L_0x0388
            L_0x0265:
                java.lang.String r0 = "yeelink.light.ceil32"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 46
                goto L_0x0388
            L_0x0271:
                java.lang.String r0 = "yeelink.light.ceil31"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 45
                goto L_0x0388
            L_0x027d:
                java.lang.String r0 = "yeelink.light.ceil30"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 44
                goto L_0x0388
            L_0x0289:
                java.lang.String r0 = "yeelink.light.ceil29"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 43
                goto L_0x0388
            L_0x0295:
                java.lang.String r0 = "yeelink.light.ceil27"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 42
                goto L_0x0388
            L_0x02a1:
                java.lang.String r0 = "yeelink.light.ceil26"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 41
                goto L_0x0388
            L_0x02ad:
                java.lang.String r0 = "yeelink.plug.plug"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 64
                goto L_0x0388
            L_0x02b9:
                java.lang.String r0 = "yeelink.light.ble1"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 0
                goto L_0x0388
            L_0x02c4:
                java.lang.String r0 = "yeelink.light.ceiling24"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 40
                goto L_0x0388
            L_0x02d0:
                java.lang.String r0 = "yeelink.light.ceiling23"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 39
                goto L_0x0388
            L_0x02dc:
                java.lang.String r0 = "yeelink.light.ceiling22"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 38
                goto L_0x0388
            L_0x02e8:
                java.lang.String r0 = "yeelink.light.ceiling21"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 37
                goto L_0x0388
            L_0x02f4:
                java.lang.String r0 = "yeelink.light.ceiling20"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 36
                goto L_0x0388
            L_0x0300:
                java.lang.String r0 = "yeelink.light.ceiling19"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 35
                goto L_0x0388
            L_0x030c:
                java.lang.String r0 = "yeelink.light.ceiling18"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 34
                goto L_0x0388
            L_0x0318:
                java.lang.String r0 = "yeelink.light.ceiling17"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 33
                goto L_0x0388
            L_0x0324:
                java.lang.String r0 = "yeelink.light.ceiling16"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 32
                goto L_0x0388
            L_0x032f:
                java.lang.String r0 = "yeelink.light.ceiling15"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 31
                goto L_0x0388
            L_0x033a:
                java.lang.String r0 = "yeelink.light.ceiling14"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 30
                goto L_0x0388
            L_0x0345:
                java.lang.String r0 = "yeelink.light.ceiling13"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 29
                goto L_0x0388
            L_0x0350:
                java.lang.String r0 = "yeelink.light.ceiling12"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 28
                goto L_0x0388
            L_0x035b:
                java.lang.String r0 = "yeelink.light.ceiling11"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 27
                goto L_0x0388
            L_0x0366:
                java.lang.String r0 = "yeelink.light.ceiling10"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 26
                goto L_0x0388
            L_0x0371:
                java.lang.String r0 = "yeelink.switch.sw1"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 63
                goto L_0x0388
            L_0x037c:
                java.lang.String r0 = "yeelink.bhf_light.v1"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0387
                r1 = 59
                goto L_0x0388
            L_0x0387:
                r1 = -1
            L_0x0388:
                switch(r1) {
                    case 0: goto L_0x039d;
                    case 1: goto L_0x039d;
                    case 2: goto L_0x039d;
                    case 3: goto L_0x039d;
                    case 4: goto L_0x039d;
                    case 5: goto L_0x039d;
                    case 6: goto L_0x039d;
                    case 7: goto L_0x039d;
                    case 8: goto L_0x039d;
                    case 9: goto L_0x039d;
                    case 10: goto L_0x039d;
                    case 11: goto L_0x039d;
                    case 12: goto L_0x038c;
                    case 13: goto L_0x038c;
                    case 14: goto L_0x038c;
                    case 15: goto L_0x038c;
                    case 16: goto L_0x038c;
                    case 17: goto L_0x038c;
                    case 18: goto L_0x038c;
                    case 19: goto L_0x038c;
                    case 20: goto L_0x038c;
                    case 21: goto L_0x038c;
                    case 22: goto L_0x038c;
                    case 23: goto L_0x038c;
                    case 24: goto L_0x038c;
                    case 25: goto L_0x038c;
                    case 26: goto L_0x038c;
                    case 27: goto L_0x038c;
                    case 28: goto L_0x038c;
                    case 29: goto L_0x038c;
                    case 30: goto L_0x038c;
                    case 31: goto L_0x038c;
                    case 32: goto L_0x038c;
                    case 33: goto L_0x038c;
                    case 34: goto L_0x038c;
                    case 35: goto L_0x038c;
                    case 36: goto L_0x038c;
                    case 37: goto L_0x038c;
                    case 38: goto L_0x038c;
                    case 39: goto L_0x038c;
                    case 40: goto L_0x038c;
                    case 41: goto L_0x038c;
                    case 42: goto L_0x038c;
                    case 43: goto L_0x038c;
                    case 44: goto L_0x038c;
                    case 45: goto L_0x038c;
                    case 46: goto L_0x038c;
                    case 47: goto L_0x038c;
                    case 48: goto L_0x038c;
                    case 49: goto L_0x038c;
                    case 50: goto L_0x038c;
                    case 51: goto L_0x038c;
                    case 52: goto L_0x038c;
                    case 53: goto L_0x038c;
                    case 54: goto L_0x038c;
                    case 55: goto L_0x038c;
                    case 56: goto L_0x038c;
                    case 57: goto L_0x038c;
                    case 58: goto L_0x038c;
                    case 59: goto L_0x038c;
                    case 60: goto L_0x038c;
                    case 61: goto L_0x038c;
                    case 62: goto L_0x038c;
                    case 63: goto L_0x038c;
                    case 64: goto L_0x038c;
                    case 65: goto L_0x038c;
                    case 66: goto L_0x038c;
                    case 67: goto L_0x038c;
                    case 68: goto L_0x038c;
                    case 69: goto L_0x038c;
                    case 70: goto L_0x038c;
                    default: goto L_0x038b;
                }
            L_0x038b:
                goto L_0x03be
            L_0x038c:
                com.yeelight.yeelib.f.e r4 = com.yeelight.yeelib.p152f.C9784e.m23711b()
                boolean r4 = r4.mo31629e()
                if (r4 == 0) goto L_0x0397
                goto L_0x039d
            L_0x0397:
                com.yeelight.cherry.ui.activity.ProductListFromCategoryActivity r4 = com.yeelight.cherry.p177ui.activity.ProductListFromCategoryActivity.this
                r4.m16913e0()
                goto L_0x03be
            L_0x039d:
                com.yeelight.cherry.ui.activity.ProductListFromCategoryActivity r4 = com.yeelight.cherry.p177ui.activity.ProductListFromCategoryActivity.this
                com.yeelight.yeelib.g.x r5 = r4.f11619g
                r4.m16912d0(r5)
                goto L_0x03be
            L_0x03a7:
                int r4 = r5.getIntExtra(r0, r1)
                if (r4 != r1) goto L_0x03be
                com.yeelight.cherry.ui.activity.ProductListFromCategoryActivity r4 = com.yeelight.cherry.p177ui.activity.ProductListFromCategoryActivity.this
                android.app.ProgressDialog r4 = r4.f11618f
                if (r4 == 0) goto L_0x03be
                com.yeelight.cherry.ui.activity.ProductListFromCategoryActivity r4 = com.yeelight.cherry.p177ui.activity.ProductListFromCategoryActivity.this
                android.app.ProgressDialog r4 = r4.f11618f
                r4.dismiss()
            L_0x03be:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.activity.ProductListFromCategoryActivity.C5556a.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ProductListFromCategoryActivity$b */
    class C5557b extends BroadcastReceiver {
        C5557b() {
        }

        public void onReceive(Context context, Intent intent) {
            if (ProductListFromCategoryActivity.this.f11619g != null) {
                int intExtra = intent.getIntExtra("wifi_state", 0);
                if (intExtra == 3) {
                    if (ProductListFromCategoryActivity.this.f11618f != null) {
                        ProductListFromCategoryActivity.this.f11618f.dismiss();
                    }
                    ProductListFromCategoryActivity productListFromCategoryActivity = ProductListFromCategoryActivity.this;
                    productListFromCategoryActivity.m16912d0(productListFromCategoryActivity.f11619g);
                } else if (intExtra == 1 && ProductListFromCategoryActivity.this.f11618f != null) {
                    ProductListFromCategoryActivity.this.f11618f.dismiss();
                }
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ProductListFromCategoryActivity$c */
    class C5558c implements ProductListAdapter.C5837b {
        C5558c() {
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:301:0x04b1, code lost:
            if (com.yeelight.yeelib.p152f.C9784e.m23711b().mo31629e() != false) goto L_0x04cf;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:303:0x04bc, code lost:
            if (com.yeelight.yeelib.p152f.C9784e.m23711b().mo31627c() != false) goto L_0x04cf;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:304:0x04bf, code lost:
            com.yeelight.cherry.p177ui.activity.ProductListFromCategoryActivity.m16910a0(r2.f11622a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:306:0x04cd, code lost:
            if (com.yeelight.yeelib.p152f.C9784e.m23711b().mo31629e() != false) goto L_0x04cf;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:307:0x04cf, code lost:
            com.yeelight.cherry.p177ui.activity.ProductListFromCategoryActivity.m16908Y(r2.f11622a, r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:308:0x04d5, code lost:
            com.yeelight.cherry.p177ui.activity.ProductListFromCategoryActivity.m16909Z(r2.f11622a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:312:0x04fd, code lost:
            r2.f11622a.startActivity(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:313:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:314:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:315:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:316:?, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo26827a(int r3, com.yeelight.yeelib.p153g.C9855x r4) {
            /*
                r2 = this;
                com.yeelight.cherry.ui.activity.ProductListFromCategoryActivity r3 = com.yeelight.cherry.p177ui.activity.ProductListFromCategoryActivity.this
                com.yeelight.yeelib.p153g.C9855x unused = r3.f11619g = r4
                java.lang.String r3 = r4.mo31841c()
                int r0 = r3.hashCode()
                r1 = 1
                switch(r0) {
                    case -1644531059: goto L_0x048f;
                    case -1494338802: goto L_0x0484;
                    case -1462015191: goto L_0x0479;
                    case -1462015190: goto L_0x046e;
                    case -1462015189: goto L_0x0463;
                    case -1462015188: goto L_0x0458;
                    case -1462015187: goto L_0x044d;
                    case -1462015186: goto L_0x0442;
                    case -1462015185: goto L_0x0437;
                    case -1462015184: goto L_0x042b;
                    case -1462015183: goto L_0x041f;
                    case -1462015182: goto L_0x0413;
                    case -1462015160: goto L_0x0407;
                    case -1462015159: goto L_0x03fb;
                    case -1462015158: goto L_0x03ef;
                    case -1462015157: goto L_0x03e3;
                    case -1462015156: goto L_0x03d7;
                    case -1400275319: goto L_0x03cb;
                    case -1350780909: goto L_0x03bf;
                    case -1317475940: goto L_0x03b3;
                    case -1317475939: goto L_0x03a7;
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
                    case -1235140472: goto L_0x02f4;
                    case -1235140471: goto L_0x02e8;
                    case -1235140468: goto L_0x02dc;
                    case -1235140467: goto L_0x02d0;
                    case -1199119278: goto L_0x02c4;
                    case -1119332198: goto L_0x02b8;
                    case -1063384694: goto L_0x02ac;
                    case -1063384689: goto L_0x02a0;
                    case -1063384687: goto L_0x0294;
                    case -1063384685: goto L_0x0288;
                    case -948847040: goto L_0x027c;
                    case -948847038: goto L_0x0270;
                    case -888668266: goto L_0x0264;
                    case -888668265: goto L_0x0258;
                    case -888668264: goto L_0x024c;
                    case -845289556: goto L_0x0240;
                    case -845289555: goto L_0x0234;
                    case -845289553: goto L_0x0228;
                    case -845289551: goto L_0x021c;
                    case -845289508: goto L_0x0210;
                    case -458141175: goto L_0x0204;
                    case -458141172: goto L_0x01f8;
                    case -454053748: goto L_0x01ed;
                    case -449944730: goto L_0x01e2;
                    case -449944729: goto L_0x01d6;
                    case -449944728: goto L_0x01ca;
                    case -449944727: goto L_0x01be;
                    case -449944726: goto L_0x01b2;
                    case -449944724: goto L_0x01a6;
                    case -449944723: goto L_0x019a;
                    case -449944722: goto L_0x018e;
                    case -448603205: goto L_0x0183;
                    case -448603202: goto L_0x0177;
                    case -448603201: goto L_0x016b;
                    case -448603157: goto L_0x0160;
                    case -448603156: goto L_0x0155;
                    case -443031172: goto L_0x0149;
                    case -190173984: goto L_0x013d;
                    case -190173936: goto L_0x0131;
                    case 174464231: goto L_0x0125;
                    case 250266083: goto L_0x011a;
                    case 674030242: goto L_0x010e;
                    case 922669543: goto L_0x0102;
                    case 922669544: goto L_0x00f6;
                    case 922669545: goto L_0x00ea;
                    case 922669546: goto L_0x00de;
                    case 922669547: goto L_0x00d2;
                    case 922669548: goto L_0x00c6;
                    case 922669549: goto L_0x00ba;
                    case 922669550: goto L_0x00ae;
                    case 922669551: goto L_0x00a2;
                    case 1201756974: goto L_0x0096;
                    case 1201757021: goto L_0x008a;
                    case 1201766335: goto L_0x007e;
                    case 1201766336: goto L_0x0072;
                    case 1557976171: goto L_0x0067;
                    case 1623724661: goto L_0x005b;
                    case 1623724662: goto L_0x004f;
                    case 1623724663: goto L_0x0043;
                    case 2086270815: goto L_0x0037;
                    case 2102612488: goto L_0x002b;
                    case 2102612489: goto L_0x001f;
                    case 2146130361: goto L_0x0013;
                    default: goto L_0x0011;
                }
            L_0x0011:
                goto L_0x049a
            L_0x0013:
                java.lang.String r0 = "yeelink.light.dnlight2"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 24
                goto L_0x049b
            L_0x001f:
                java.lang.String r0 = "yeelink.light.meshbulb2"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 26
                goto L_0x049b
            L_0x002b:
                java.lang.String r0 = "yeelink.light.meshbulb1"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 25
                goto L_0x049b
            L_0x0037:
                java.lang.String r0 = "virtual.yeelink.light.mijia.ceiling"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 88
                goto L_0x049b
            L_0x0043:
                java.lang.String r0 = "yeelink.light.bslamp3"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 74
                goto L_0x049b
            L_0x004f:
                java.lang.String r0 = "yeelink.light.bslamp2"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 73
                goto L_0x049b
            L_0x005b:
                java.lang.String r0 = "yeelink.light.bslamp1"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 72
                goto L_0x049b
            L_0x0067:
                java.lang.String r0 = "yeelink.light.glcolor"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 0
                goto L_0x049b
            L_0x0072:
                java.lang.String r0 = "yeelink.light.ml2"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 29
                goto L_0x049b
            L_0x007e:
                java.lang.String r0 = "yeelink.light.ml1"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 28
                goto L_0x049b
            L_0x008a:
                java.lang.String r0 = "yeelink.light.cta"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 19
                goto L_0x049b
            L_0x0096:
                java.lang.String r0 = "yeelink.light.ct2"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 18
                goto L_0x049b
            L_0x00a2:
                java.lang.String r0 = "yeelink.light.ceiling9"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 44
                goto L_0x049b
            L_0x00ae:
                java.lang.String r0 = "yeelink.light.ceiling8"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 43
                goto L_0x049b
            L_0x00ba:
                java.lang.String r0 = "yeelink.light.ceiling7"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 42
                goto L_0x049b
            L_0x00c6:
                java.lang.String r0 = "yeelink.light.ceiling6"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 41
                goto L_0x049b
            L_0x00d2:
                java.lang.String r0 = "yeelink.light.ceiling5"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 40
                goto L_0x049b
            L_0x00de:
                java.lang.String r0 = "yeelink.light.ceiling4"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 39
                goto L_0x049b
            L_0x00ea:
                java.lang.String r0 = "yeelink.light.ceiling3"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 38
                goto L_0x049b
            L_0x00f6:
                java.lang.String r0 = "yeelink.light.ceiling2"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 37
                goto L_0x049b
            L_0x0102:
                java.lang.String r0 = "yeelink.light.ceiling1"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 36
                goto L_0x049b
            L_0x010e:
                java.lang.String r0 = "yeelink.curtain.ctmt1"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 89
                goto L_0x049b
            L_0x011a:
                java.lang.String r0 = "yeelink.light.gingko.group"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 2
                goto L_0x049b
            L_0x0125:
                java.lang.String r0 = "virtual.yeelink.light.ceiling"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 87
                goto L_0x049b
            L_0x0131:
                java.lang.String r0 = "yeelink.gateway.va"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 97
                goto L_0x049b
            L_0x013d:
                java.lang.String r0 = "yeelink.gateway.v1"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 96
                goto L_0x049b
            L_0x0149:
                java.lang.String r0 = "yeelink.light.spot1"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 27
                goto L_0x049b
            L_0x0155:
                java.lang.String r0 = "yeelink.light.monob"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 6
                goto L_0x049b
            L_0x0160:
                java.lang.String r0 = "yeelink.light.monoa"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 5
                goto L_0x049b
            L_0x016b:
                java.lang.String r0 = "yeelink.light.mono5"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 77
                goto L_0x049b
            L_0x0177:
                java.lang.String r0 = "yeelink.light.mono4"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 76
                goto L_0x049b
            L_0x0183:
                java.lang.String r0 = "yeelink.light.mono1"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 4
                goto L_0x049b
            L_0x018e:
                java.lang.String r0 = "yeelink.light.lamp9"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 84
                goto L_0x049b
            L_0x019a:
                java.lang.String r0 = "yeelink.light.lamp8"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 83
                goto L_0x049b
            L_0x01a6:
                java.lang.String r0 = "yeelink.light.lamp7"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 82
                goto L_0x049b
            L_0x01b2:
                java.lang.String r0 = "yeelink.light.lamp5"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 9
                goto L_0x049b
            L_0x01be:
                java.lang.String r0 = "yeelink.light.lamp4"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 81
                goto L_0x049b
            L_0x01ca:
                java.lang.String r0 = "yeelink.light.lamp3"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 8
                goto L_0x049b
            L_0x01d6:
                java.lang.String r0 = "yeelink.light.lamp2"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 80
                goto L_0x049b
            L_0x01e2:
                java.lang.String r0 = "yeelink.light.lamp1"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 7
                goto L_0x049b
            L_0x01ed:
                java.lang.String r0 = "yeelink.light.group"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 1
                goto L_0x049b
            L_0x01f8:
                java.lang.String r0 = "yeelink.light.ceild"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 67
                goto L_0x049b
            L_0x0204:
                java.lang.String r0 = "yeelink.light.ceila"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 66
                goto L_0x049b
            L_0x0210:
                java.lang.String r0 = "yeelink.light.stripa"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 35
                goto L_0x049b
            L_0x021c:
                java.lang.String r0 = "yeelink.light.strip6"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 34
                goto L_0x049b
            L_0x0228:
                java.lang.String r0 = "yeelink.light.strip4"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 33
                goto L_0x049b
            L_0x0234:
                java.lang.String r0 = "yeelink.light.strip2"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 21
                goto L_0x049b
            L_0x0240:
                java.lang.String r0 = "yeelink.light.strip1"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 20
                goto L_0x049b
            L_0x024c:
                java.lang.String r0 = "yilai.light.ceiling3"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 70
                goto L_0x049b
            L_0x0258:
                java.lang.String r0 = "yilai.light.ceiling2"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 69
                goto L_0x049b
            L_0x0264:
                java.lang.String r0 = "yilai.light.ceiling1"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 68
                goto L_0x049b
            L_0x0270:
                java.lang.String r0 = "yeelink.light.panel3"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 79
                goto L_0x049b
            L_0x027c:
                java.lang.String r0 = "yeelink.light.panel1"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 78
                goto L_0x049b
            L_0x0288:
                java.lang.String r0 = "yeelink.light.lamp19"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 86
                goto L_0x049b
            L_0x0294:
                java.lang.String r0 = "yeelink.light.lamp17"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 11
                goto L_0x049b
            L_0x02a0:
                java.lang.String r0 = "yeelink.light.lamp15"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 10
                goto L_0x049b
            L_0x02ac:
                java.lang.String r0 = "yeelink.light.lamp10"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 85
                goto L_0x049b
            L_0x02b8:
                java.lang.String r0 = "yeelink.wifispeaker.v1"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 71
                goto L_0x049b
            L_0x02c4:
                java.lang.String r0 = "yeelink.light.gingko"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 23
                goto L_0x049b
            L_0x02d0:
                java.lang.String r0 = "yeelink.light.fancl6"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 95
                goto L_0x049b
            L_0x02dc:
                java.lang.String r0 = "yeelink.light.fancl5"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 94
                goto L_0x049b
            L_0x02e8:
                java.lang.String r0 = "yeelink.light.fancl2"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 93
                goto L_0x049b
            L_0x02f4:
                java.lang.String r0 = "yeelink.light.fancl1"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 92
                goto L_0x049b
            L_0x0300:
                java.lang.String r0 = "yeelink.light.colorc"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 17
                goto L_0x049b
            L_0x030c:
                java.lang.String r0 = "yeelink.light.colorb"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 16
                goto L_0x049b
            L_0x0318:
                java.lang.String r0 = "yeelink.light.colora"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 15
                goto L_0x049b
            L_0x0324:
                java.lang.String r0 = "yeelink.light.color8"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 32
                goto L_0x049b
            L_0x0330:
                java.lang.String r0 = "yeelink.light.color6"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 31
                goto L_0x049b
            L_0x033c:
                java.lang.String r0 = "yeelink.light.color5"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 14
                goto L_0x049b
            L_0x0348:
                java.lang.String r0 = "yeelink.light.color4"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 30
                goto L_0x049b
            L_0x0354:
                java.lang.String r0 = "yeelink.light.color3"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 13
                goto L_0x049b
            L_0x0360:
                java.lang.String r0 = "yeelink.light.color2"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 12
                goto L_0x049b
            L_0x036c:
                java.lang.String r0 = "yeelink.light.color1"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 3
                goto L_0x049b
            L_0x0377:
                java.lang.String r0 = "yeelink.light.ceil33"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 65
                goto L_0x049b
            L_0x0383:
                java.lang.String r0 = "yeelink.light.ceil32"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 64
                goto L_0x049b
            L_0x038f:
                java.lang.String r0 = "yeelink.light.ceil31"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 63
                goto L_0x049b
            L_0x039b:
                java.lang.String r0 = "yeelink.light.ceil30"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 62
                goto L_0x049b
            L_0x03a7:
                java.lang.String r0 = "yeelink.light.ceil27"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 61
                goto L_0x049b
            L_0x03b3:
                java.lang.String r0 = "yeelink.light.ceil26"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 60
                goto L_0x049b
            L_0x03bf:
                java.lang.String r0 = "yeelink.plug.plug"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 91
                goto L_0x049b
            L_0x03cb:
                java.lang.String r0 = "yeelink.light.ble1"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 22
                goto L_0x049b
            L_0x03d7:
                java.lang.String r0 = "yeelink.light.ceiling24"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 59
                goto L_0x049b
            L_0x03e3:
                java.lang.String r0 = "yeelink.light.ceiling23"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 58
                goto L_0x049b
            L_0x03ef:
                java.lang.String r0 = "yeelink.light.ceiling22"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 57
                goto L_0x049b
            L_0x03fb:
                java.lang.String r0 = "yeelink.light.ceiling21"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 56
                goto L_0x049b
            L_0x0407:
                java.lang.String r0 = "yeelink.light.ceiling20"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 55
                goto L_0x049b
            L_0x0413:
                java.lang.String r0 = "yeelink.light.ceiling19"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 54
                goto L_0x049b
            L_0x041f:
                java.lang.String r0 = "yeelink.light.ceiling18"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 53
                goto L_0x049b
            L_0x042b:
                java.lang.String r0 = "yeelink.light.ceiling17"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 52
                goto L_0x049b
            L_0x0437:
                java.lang.String r0 = "yeelink.light.ceiling16"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 51
                goto L_0x049b
            L_0x0442:
                java.lang.String r0 = "yeelink.light.ceiling15"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 50
                goto L_0x049b
            L_0x044d:
                java.lang.String r0 = "yeelink.light.ceiling14"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 49
                goto L_0x049b
            L_0x0458:
                java.lang.String r0 = "yeelink.light.ceiling13"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 48
                goto L_0x049b
            L_0x0463:
                java.lang.String r0 = "yeelink.light.ceiling12"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 47
                goto L_0x049b
            L_0x046e:
                java.lang.String r0 = "yeelink.light.ceiling11"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 46
                goto L_0x049b
            L_0x0479:
                java.lang.String r0 = "yeelink.light.ceiling10"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 45
                goto L_0x049b
            L_0x0484:
                java.lang.String r0 = "yeelink.switch.sw1"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 90
                goto L_0x049b
            L_0x048f:
                java.lang.String r0 = "yeelink.bhf_light.v1"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x049a
                r3 = 75
                goto L_0x049b
            L_0x049a:
                r3 = -1
            L_0x049b:
                switch(r3) {
                    case 0: goto L_0x04f4;
                    case 1: goto L_0x04ea;
                    case 2: goto L_0x04db;
                    case 3: goto L_0x04c5;
                    case 4: goto L_0x04c5;
                    case 5: goto L_0x04c5;
                    case 6: goto L_0x04c5;
                    case 7: goto L_0x04c5;
                    case 8: goto L_0x04c5;
                    case 9: goto L_0x04c5;
                    case 10: goto L_0x04c5;
                    case 11: goto L_0x04c5;
                    case 12: goto L_0x04c5;
                    case 13: goto L_0x04c5;
                    case 14: goto L_0x04c5;
                    case 15: goto L_0x04c5;
                    case 16: goto L_0x04c5;
                    case 17: goto L_0x04c5;
                    case 18: goto L_0x04c5;
                    case 19: goto L_0x04c5;
                    case 20: goto L_0x04c5;
                    case 21: goto L_0x04c5;
                    case 22: goto L_0x04b4;
                    case 23: goto L_0x04b4;
                    case 24: goto L_0x04b4;
                    case 25: goto L_0x04b4;
                    case 26: goto L_0x04b4;
                    case 27: goto L_0x04b4;
                    case 28: goto L_0x04b4;
                    case 29: goto L_0x04b4;
                    case 30: goto L_0x049f;
                    case 31: goto L_0x049f;
                    case 32: goto L_0x049f;
                    case 33: goto L_0x049f;
                    case 34: goto L_0x049f;
                    case 35: goto L_0x049f;
                    case 36: goto L_0x049f;
                    case 37: goto L_0x049f;
                    case 38: goto L_0x049f;
                    case 39: goto L_0x049f;
                    case 40: goto L_0x049f;
                    case 41: goto L_0x049f;
                    case 42: goto L_0x049f;
                    case 43: goto L_0x049f;
                    case 44: goto L_0x049f;
                    case 45: goto L_0x049f;
                    case 46: goto L_0x049f;
                    case 47: goto L_0x049f;
                    case 48: goto L_0x049f;
                    case 49: goto L_0x049f;
                    case 50: goto L_0x049f;
                    case 51: goto L_0x049f;
                    case 52: goto L_0x049f;
                    case 53: goto L_0x049f;
                    case 54: goto L_0x049f;
                    case 55: goto L_0x049f;
                    case 56: goto L_0x049f;
                    case 57: goto L_0x049f;
                    case 58: goto L_0x049f;
                    case 59: goto L_0x049f;
                    case 60: goto L_0x049f;
                    case 61: goto L_0x049f;
                    case 62: goto L_0x049f;
                    case 63: goto L_0x049f;
                    case 64: goto L_0x049f;
                    case 65: goto L_0x049f;
                    case 66: goto L_0x049f;
                    case 67: goto L_0x049f;
                    case 68: goto L_0x049f;
                    case 69: goto L_0x049f;
                    case 70: goto L_0x049f;
                    case 71: goto L_0x049f;
                    case 72: goto L_0x049f;
                    case 73: goto L_0x049f;
                    case 74: goto L_0x049f;
                    case 75: goto L_0x049f;
                    case 76: goto L_0x049f;
                    case 77: goto L_0x049f;
                    case 78: goto L_0x049f;
                    case 79: goto L_0x049f;
                    case 80: goto L_0x049f;
                    case 81: goto L_0x049f;
                    case 82: goto L_0x049f;
                    case 83: goto L_0x049f;
                    case 84: goto L_0x049f;
                    case 85: goto L_0x049f;
                    case 86: goto L_0x049f;
                    case 87: goto L_0x049f;
                    case 88: goto L_0x049f;
                    case 89: goto L_0x049f;
                    case 90: goto L_0x049f;
                    case 91: goto L_0x049f;
                    case 92: goto L_0x049f;
                    case 93: goto L_0x049f;
                    case 94: goto L_0x049f;
                    case 95: goto L_0x049f;
                    case 96: goto L_0x049f;
                    case 97: goto L_0x049f;
                    default: goto L_0x049e;
                }
            L_0x049e:
                goto L_0x0502
            L_0x049f:
                com.yeelight.yeelib.f.e r3 = com.yeelight.yeelib.p152f.C9784e.m23711b()
                boolean r3 = r3.mo31627c()
                if (r3 == 0) goto L_0x04bf
                com.yeelight.yeelib.f.e r3 = com.yeelight.yeelib.p152f.C9784e.m23711b()
                boolean r3 = r3.mo31629e()
                if (r3 == 0) goto L_0x04d5
                goto L_0x04cf
            L_0x04b4:
                com.yeelight.yeelib.f.e r3 = com.yeelight.yeelib.p152f.C9784e.m23711b()
                boolean r3 = r3.mo31627c()
                if (r3 == 0) goto L_0x04bf
                goto L_0x04cf
            L_0x04bf:
                com.yeelight.cherry.ui.activity.ProductListFromCategoryActivity r3 = com.yeelight.cherry.p177ui.activity.ProductListFromCategoryActivity.this
                r3.m16911c0()
                goto L_0x0502
            L_0x04c5:
                com.yeelight.yeelib.f.e r3 = com.yeelight.yeelib.p152f.C9784e.m23711b()
                boolean r3 = r3.mo31629e()
                if (r3 == 0) goto L_0x04d5
            L_0x04cf:
                com.yeelight.cherry.ui.activity.ProductListFromCategoryActivity r3 = com.yeelight.cherry.p177ui.activity.ProductListFromCategoryActivity.this
                r3.m16912d0(r4)
                goto L_0x0502
            L_0x04d5:
                com.yeelight.cherry.ui.activity.ProductListFromCategoryActivity r3 = com.yeelight.cherry.p177ui.activity.ProductListFromCategoryActivity.this
                r3.m16913e0()
                goto L_0x0502
            L_0x04db:
                android.content.Intent r3 = new android.content.Intent
                com.yeelight.cherry.ui.activity.ProductListFromCategoryActivity r4 = com.yeelight.cherry.p177ui.activity.ProductListFromCategoryActivity.this
                java.lang.Class<com.yeelight.cherry.ui.activity.AddNetworkActivity> r0 = com.yeelight.cherry.p177ui.activity.AddNetworkActivity.class
                r3.<init>(r4, r0)
                java.lang.String r4 = "ADD_MESH_GROUP"
                r3.putExtra(r4, r1)
                goto L_0x04fd
            L_0x04ea:
                android.content.Intent r3 = new android.content.Intent
                com.yeelight.cherry.ui.activity.ProductListFromCategoryActivity r4 = com.yeelight.cherry.p177ui.activity.ProductListFromCategoryActivity.this
                java.lang.Class<com.yeelight.cherry.ui.activity.CreateGroupNameActivity> r0 = com.yeelight.cherry.p177ui.activity.CreateGroupNameActivity.class
                r3.<init>(r4, r0)
                goto L_0x04fd
            L_0x04f4:
                android.content.Intent r3 = new android.content.Intent
                com.yeelight.cherry.ui.activity.ProductListFromCategoryActivity r4 = com.yeelight.cherry.p177ui.activity.ProductListFromCategoryActivity.this
                java.lang.Class<com.yeelight.cherry.ui.activity.GoogleSeamlessActivity> r0 = com.yeelight.cherry.p177ui.activity.GoogleSeamlessActivity.class
                r3.<init>(r4, r0)
            L_0x04fd:
                com.yeelight.cherry.ui.activity.ProductListFromCategoryActivity r4 = com.yeelight.cherry.p177ui.activity.ProductListFromCategoryActivity.this
                r4.startActivity(r3)
            L_0x0502:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.activity.ProductListFromCategoryActivity.C5558c.mo26827a(int, com.yeelight.yeelib.g.x):void");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ProductListFromCategoryActivity$d */
    class C5559d implements DialogInterface.OnClickListener {
        C5559d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C4297y.m12064f().mo23737m(ProductListFromCategoryActivity.this, true);
            dialogInterface.dismiss();
            ProductListFromCategoryActivity.this.f11618f.show();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ProductListFromCategoryActivity$e */
    class C5560e implements DialogInterface.OnClickListener {
        C5560e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C4297y.m12064f().mo23731b().enable();
            dialogInterface.dismiss();
            ProductListFromCategoryActivity.this.f11618f.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public void m16911c0() {
        if (this.f11616d == null) {
            C10526e.C10531e eVar = new C10526e.C10531e(this);
            eVar.mo33357h(2131755192);
            eVar.mo33355f(2131755193);
            eVar.mo33353d(-2, getString(2131755229), (DialogInterface.OnClickListener) null);
            eVar.mo33353d(-1, getString(2131755194), new C5560e());
            this.f11616d = eVar.mo33351b();
            ProgressDialog progressDialog = new ProgressDialog(this, 3);
            this.f11618f = progressDialog;
            progressDialog.setMessage(getString(2131755360));
            this.f11618f.setCancelable(false);
        }
        this.f11616d.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public void m16912d0(C9855x xVar) {
        Intent intent = new Intent(this, DeviceResetActivity.class);
        intent.putExtra("product", xVar);
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public void m16913e0() {
        if (this.f11617e == null) {
            C10526e.C10531e eVar = new C10526e.C10531e(this);
            eVar.mo33357h(2131755197);
            eVar.mo33355f(2131755198);
            eVar.mo33353d(-2, getString(2131755229), (DialogInterface.OnClickListener) null);
            eVar.mo33353d(-1, getString(2131755194), new C5559d());
            this.f11617e = eVar.mo33351b();
            ProgressDialog progressDialog = new ProgressDialog(this, 3);
            this.f11618f = progressDialog;
            progressDialog.setMessage(getString(2131755360));
            this.f11618f.setCancelable(false);
        }
        this.f11617e.show();
    }

    /* renamed from: b0 */
    public /* synthetic */ void mo26830b0(View view) {
        onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C11748R$layout.activity_product_list_from_category);
        C10547m.m25758h(true, this);
        ButterKnife.bind((Activity) this);
        C9853v j = C4239r.m11807g().mo23577j(getIntent().getIntExtra("extra_category_id", 0));
        this.mTitleBar.mo32825a(getString(j.mo31836g()), new C5718h2(this), (View.OnClickListener) null);
        this.mTitleBar.setTitleTextSize(16);
        List<C9855x> c = j.mo31832c();
        this.mRvProduct.setLayoutManager(new LinearLayoutManager(this));
        ProductFromCategoryAdapter productFromCategoryAdapter = new ProductFromCategoryAdapter(this, c);
        registerReceiver(this.f11614b, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        registerReceiver(this.f11615c, new IntentFilter("android.net.wifi.WIFI_STATE_CHANGED"));
        productFromCategoryAdapter.mo27205d(new C5558c());
        this.mRvProduct.setAdapter(productFromCategoryAdapter);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f11614b);
        unregisterReceiver(this.f11615c);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C10526e eVar = this.f11616d;
        if (eVar != null && eVar.isShowing()) {
            this.f11616d.dismiss();
        }
        C10526e eVar2 = this.f11617e;
        if (eVar2 != null && eVar2.isShowing()) {
            this.f11617e.dismiss();
        }
        ProgressDialog progressDialog = this.f11618f;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f11618f.dismiss();
        }
    }
}
