package com.yeelight.cherry.p177ui.activity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p177ui.adapter.ProductListAdapter;
import com.yeelight.yeelib.p152f.C4239r;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p153g.C9855x;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.utils.C10547m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.activity.ProductListActivity */
public class ProductListActivity extends BaseActivity implements C4239r.C4242b {

    /* renamed from: b */
    private C10526e f11597b;

    /* renamed from: c */
    private C10526e f11598c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ProgressDialog f11599d;

    /* renamed from: e */
    private ProductListAdapter f11600e;

    /* renamed from: f */
    private List<C9855x> f11601f = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C9855x f11602g;

    /* renamed from: h */
    private int f11603h;

    /* renamed from: i */
    private BroadcastReceiver f11604i = new C5550a();

    /* renamed from: j */
    private BroadcastReceiver f11605j = new C5551b();
    @BindView(2131296569)
    RecyclerView mDeviceList;
    @BindView(2131297424)
    CommonTitleBar mTitleBar;

    /* renamed from: com.yeelight.cherry.ui.activity.ProductListActivity$ProductItemDecoration */
    public class ProductItemDecoration extends RecyclerView.ItemDecoration {

        /* renamed from: a */
        Paint f11606a;

        public ProductItemDecoration(ProductListActivity productListActivity) {
            Paint paint = new Paint();
            this.f11606a = paint;
            paint.setColor(Color.parseColor("#e8e8e8"));
            this.f11606a.setStrokeWidth(1.0f);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            Paint paint;
            float f;
            float f2;
            float f3;
            Canvas canvas2;
            super.onDraw(canvas, recyclerView, state);
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                float x = childAt.getX();
                float y = childAt.getY();
                int width = childAt.getWidth();
                int height = childAt.getHeight();
                if (i % 2 == 0) {
                    float f4 = x + ((float) width);
                    float f5 = ((float) height) + y;
                    f2 = f4;
                    canvas.drawLine(f2, y, f4, f5, this.f11606a);
                    paint = this.f11606a;
                    canvas2 = canvas;
                    f3 = f5;
                    f = f5;
                } else {
                    f = y + ((float) height);
                    f2 = x + ((float) width);
                    paint = this.f11606a;
                    canvas2 = canvas;
                    f3 = f;
                }
                canvas2.drawLine(x, f3, f2, f, paint);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ProductListActivity$a */
    class C5550a extends BroadcastReceiver {
        C5550a() {
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:103:0x01ae, code lost:
            if (r4.equals("yeelink.light.mb2grp") != false) goto L_0x0340;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onReceive(android.content.Context r4, android.content.Intent r5) {
            /*
                r3 = this;
                com.yeelight.cherry.ui.activity.ProductListActivity r4 = com.yeelight.cherry.p177ui.activity.ProductListActivity.this
                com.yeelight.yeelib.g.x r4 = r4.f11602g
                if (r4 != 0) goto L_0x0009
                return
            L_0x0009:
                java.lang.String r4 = r5.getAction()
                java.lang.String r0 = "android.bluetooth.adapter.action.STATE_CHANGED"
                boolean r4 = r4.equals(r0)
                java.lang.String r0 = "android.bluetooth.adapter.extra.STATE"
                r1 = 10
                if (r4 == 0) goto L_0x0368
                int r4 = r5.getIntExtra(r0, r1)
                r2 = 12
                if (r4 != r2) goto L_0x0368
                com.yeelight.cherry.ui.activity.ProductListActivity r4 = com.yeelight.cherry.p177ui.activity.ProductListActivity.this
                android.app.ProgressDialog r4 = r4.f11599d
                if (r4 == 0) goto L_0x0032
                com.yeelight.cherry.ui.activity.ProductListActivity r4 = com.yeelight.cherry.p177ui.activity.ProductListActivity.this
                android.app.ProgressDialog r4 = r4.f11599d
                r4.dismiss()
            L_0x0032:
                com.yeelight.cherry.ui.activity.ProductListActivity r4 = com.yeelight.cherry.p177ui.activity.ProductListActivity.this
                com.yeelight.yeelib.g.x r4 = r4.f11602g
                java.lang.String r4 = r4.mo31841c()
                r5 = -1
                int r0 = r4.hashCode()
                switch(r0) {
                    case -1644531059: goto L_0x0334;
                    case -1494338802: goto L_0x0329;
                    case -1462015191: goto L_0x031e;
                    case -1462015190: goto L_0x0313;
                    case -1462015189: goto L_0x0308;
                    case -1462015188: goto L_0x02fd;
                    case -1462015187: goto L_0x02f2;
                    case -1462015186: goto L_0x02e7;
                    case -1462015185: goto L_0x02dc;
                    case -1462015184: goto L_0x02d0;
                    case -1462015183: goto L_0x02c4;
                    case -1462015182: goto L_0x02b8;
                    case -1462015160: goto L_0x02ac;
                    case -1462015159: goto L_0x02a0;
                    case -1462015158: goto L_0x0294;
                    case -1462015157: goto L_0x0288;
                    case -1462015156: goto L_0x027c;
                    case -1400275319: goto L_0x0271;
                    case -1350780909: goto L_0x0265;
                    case -1317475940: goto L_0x0259;
                    case -1317475939: goto L_0x024d;
                    case -1317475937: goto L_0x0241;
                    case -1317475915: goto L_0x0235;
                    case -1317475914: goto L_0x0229;
                    case -1317475913: goto L_0x021d;
                    case -1317475912: goto L_0x0211;
                    case -1282176368: goto L_0x0205;
                    case -1235140472: goto L_0x01f9;
                    case -1235140471: goto L_0x01ed;
                    case -1235140468: goto L_0x01e1;
                    case -1235140467: goto L_0x01d5;
                    case -1199119278: goto L_0x01ca;
                    case -1063384685: goto L_0x01be;
                    case -1035626052: goto L_0x01b2;
                    case -1035596261: goto L_0x01a8;
                    case -888668266: goto L_0x019c;
                    case -888668265: goto L_0x0190;
                    case -888668264: goto L_0x0184;
                    case -850921852: goto L_0x0178;
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
                goto L_0x033f
            L_0x0046:
                java.lang.String r0 = "yeelink.light.dnlight2"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 2
                goto L_0x0340
            L_0x0051:
                java.lang.String r0 = "yeelink.light.meshbulb2"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 4
                goto L_0x0340
            L_0x005c:
                java.lang.String r0 = "yeelink.light.meshbulb1"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 3
                goto L_0x0340
            L_0x0067:
                java.lang.String r0 = "virtual.yeelink.light.mijia.ceiling"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 57
                goto L_0x0340
            L_0x0073:
                java.lang.String r0 = "yeelink.light.bslamp3"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 51
                goto L_0x0340
            L_0x007f:
                java.lang.String r0 = "yeelink.light.bslamp2"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 50
                goto L_0x0340
            L_0x008b:
                java.lang.String r0 = "yeelink.light.bslamp1"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 49
                goto L_0x0340
            L_0x0097:
                java.lang.String r0 = "yeelink.light.ml2"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 7
                goto L_0x0340
            L_0x00a2:
                java.lang.String r0 = "yeelink.light.ml1"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 6
                goto L_0x0340
            L_0x00ad:
                java.lang.String r0 = "yeelink.light.ceiling8"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 19
                goto L_0x0340
            L_0x00b9:
                java.lang.String r0 = "yeelink.light.ceiling7"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 18
                goto L_0x0340
            L_0x00c5:
                java.lang.String r0 = "yeelink.light.ceiling6"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 17
                goto L_0x0340
            L_0x00d1:
                java.lang.String r0 = "yeelink.light.ceiling5"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 16
                goto L_0x0340
            L_0x00dd:
                java.lang.String r0 = "yeelink.light.ceiling4"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 15
                goto L_0x0340
            L_0x00e9:
                java.lang.String r0 = "yeelink.light.ceiling3"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 14
                goto L_0x0340
            L_0x00f5:
                java.lang.String r0 = "yeelink.light.ceiling2"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 13
                goto L_0x0340
            L_0x0101:
                java.lang.String r0 = "yeelink.light.ceiling1"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 12
                goto L_0x0340
            L_0x010d:
                java.lang.String r0 = "yeelink.curtain.ctmt1"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 58
                goto L_0x0340
            L_0x0119:
                java.lang.String r0 = "virtual.yeelink.light.ceiling"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 56
                goto L_0x0340
            L_0x0125:
                java.lang.String r0 = "yeelink.gateway.va"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 55
                goto L_0x0340
            L_0x0131:
                java.lang.String r0 = "yeelink.gateway.v1"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 54
                goto L_0x0340
            L_0x013d:
                java.lang.String r0 = "yeelink.light.spot1"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 5
                goto L_0x0340
            L_0x0148:
                java.lang.String r0 = "yeelink.light.ceild"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 45
                goto L_0x0340
            L_0x0154:
                java.lang.String r0 = "yeelink.light.ceilc"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 44
                goto L_0x0340
            L_0x0160:
                java.lang.String r0 = "yeelink.light.ceilb"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 43
                goto L_0x0340
            L_0x016c:
                java.lang.String r0 = "yeelink.light.ceila"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 42
                goto L_0x0340
            L_0x0178:
                java.lang.String r0 = "yeelink.light.sp1grp"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 11
                goto L_0x0340
            L_0x0184:
                java.lang.String r0 = "yilai.light.ceiling3"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 48
                goto L_0x0340
            L_0x0190:
                java.lang.String r0 = "yilai.light.ceiling2"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 47
                goto L_0x0340
            L_0x019c:
                java.lang.String r0 = "yilai.light.ceiling1"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 46
                goto L_0x0340
            L_0x01a8:
                java.lang.String r0 = "yeelink.light.mb2grp"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                goto L_0x0340
            L_0x01b2:
                java.lang.String r0 = "yeelink.light.mb1grp"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 9
                goto L_0x0340
            L_0x01be:
                java.lang.String r0 = "yeelink.light.lamp19"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 52
                goto L_0x0340
            L_0x01ca:
                java.lang.String r0 = "yeelink.light.gingko"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 1
                goto L_0x0340
            L_0x01d5:
                java.lang.String r0 = "yeelink.light.fancl6"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 64
                goto L_0x0340
            L_0x01e1:
                java.lang.String r0 = "yeelink.light.fancl5"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 63
                goto L_0x0340
            L_0x01ed:
                java.lang.String r0 = "yeelink.light.fancl2"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 62
                goto L_0x0340
            L_0x01f9:
                java.lang.String r0 = "yeelink.light.fancl1"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 61
                goto L_0x0340
            L_0x0205:
                java.lang.String r0 = "yeelink.light.dn2grp"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 8
                goto L_0x0340
            L_0x0211:
                java.lang.String r0 = "yeelink.light.ceil33"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 41
                goto L_0x0340
            L_0x021d:
                java.lang.String r0 = "yeelink.light.ceil32"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 40
                goto L_0x0340
            L_0x0229:
                java.lang.String r0 = "yeelink.light.ceil31"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 39
                goto L_0x0340
            L_0x0235:
                java.lang.String r0 = "yeelink.light.ceil30"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 38
                goto L_0x0340
            L_0x0241:
                java.lang.String r0 = "yeelink.light.ceil29"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 37
                goto L_0x0340
            L_0x024d:
                java.lang.String r0 = "yeelink.light.ceil27"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 36
                goto L_0x0340
            L_0x0259:
                java.lang.String r0 = "yeelink.light.ceil26"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 35
                goto L_0x0340
            L_0x0265:
                java.lang.String r0 = "yeelink.plug.plug"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 60
                goto L_0x0340
            L_0x0271:
                java.lang.String r0 = "yeelink.light.ble1"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 0
                goto L_0x0340
            L_0x027c:
                java.lang.String r0 = "yeelink.light.ceiling24"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 34
                goto L_0x0340
            L_0x0288:
                java.lang.String r0 = "yeelink.light.ceiling23"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 33
                goto L_0x0340
            L_0x0294:
                java.lang.String r0 = "yeelink.light.ceiling22"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 32
                goto L_0x0340
            L_0x02a0:
                java.lang.String r0 = "yeelink.light.ceiling21"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 31
                goto L_0x0340
            L_0x02ac:
                java.lang.String r0 = "yeelink.light.ceiling20"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 30
                goto L_0x0340
            L_0x02b8:
                java.lang.String r0 = "yeelink.light.ceiling19"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 29
                goto L_0x0340
            L_0x02c4:
                java.lang.String r0 = "yeelink.light.ceiling18"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 28
                goto L_0x0340
            L_0x02d0:
                java.lang.String r0 = "yeelink.light.ceiling17"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 27
                goto L_0x0340
            L_0x02dc:
                java.lang.String r0 = "yeelink.light.ceiling16"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 26
                goto L_0x0340
            L_0x02e7:
                java.lang.String r0 = "yeelink.light.ceiling15"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 25
                goto L_0x0340
            L_0x02f2:
                java.lang.String r0 = "yeelink.light.ceiling14"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 24
                goto L_0x0340
            L_0x02fd:
                java.lang.String r0 = "yeelink.light.ceiling13"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 23
                goto L_0x0340
            L_0x0308:
                java.lang.String r0 = "yeelink.light.ceiling12"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 22
                goto L_0x0340
            L_0x0313:
                java.lang.String r0 = "yeelink.light.ceiling11"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 21
                goto L_0x0340
            L_0x031e:
                java.lang.String r0 = "yeelink.light.ceiling10"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 20
                goto L_0x0340
            L_0x0329:
                java.lang.String r0 = "yeelink.switch.sw1"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 59
                goto L_0x0340
            L_0x0334:
                java.lang.String r0 = "yeelink.bhf_light.v1"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x033f
                r1 = 53
                goto L_0x0340
            L_0x033f:
                r1 = -1
            L_0x0340:
                switch(r1) {
                    case 0: goto L_0x035e;
                    case 1: goto L_0x035e;
                    case 2: goto L_0x035e;
                    case 3: goto L_0x035e;
                    case 4: goto L_0x035e;
                    case 5: goto L_0x035e;
                    case 6: goto L_0x035e;
                    case 7: goto L_0x035e;
                    case 8: goto L_0x035e;
                    case 9: goto L_0x035e;
                    case 10: goto L_0x035e;
                    case 11: goto L_0x035e;
                    case 12: goto L_0x0344;
                    case 13: goto L_0x0344;
                    case 14: goto L_0x0344;
                    case 15: goto L_0x0344;
                    case 16: goto L_0x0344;
                    case 17: goto L_0x0344;
                    case 18: goto L_0x0344;
                    case 19: goto L_0x0344;
                    case 20: goto L_0x0344;
                    case 21: goto L_0x0344;
                    case 22: goto L_0x0344;
                    case 23: goto L_0x0344;
                    case 24: goto L_0x0344;
                    case 25: goto L_0x0344;
                    case 26: goto L_0x0344;
                    case 27: goto L_0x0344;
                    case 28: goto L_0x0344;
                    case 29: goto L_0x0344;
                    case 30: goto L_0x0344;
                    case 31: goto L_0x0344;
                    case 32: goto L_0x0344;
                    case 33: goto L_0x0344;
                    case 34: goto L_0x0344;
                    case 35: goto L_0x0344;
                    case 36: goto L_0x0344;
                    case 37: goto L_0x0344;
                    case 38: goto L_0x0344;
                    case 39: goto L_0x0344;
                    case 40: goto L_0x0344;
                    case 41: goto L_0x0344;
                    case 42: goto L_0x0344;
                    case 43: goto L_0x0344;
                    case 44: goto L_0x0344;
                    case 45: goto L_0x0344;
                    case 46: goto L_0x0344;
                    case 47: goto L_0x0344;
                    case 48: goto L_0x0344;
                    case 49: goto L_0x0344;
                    case 50: goto L_0x0344;
                    case 51: goto L_0x0344;
                    case 52: goto L_0x0344;
                    case 53: goto L_0x0344;
                    case 54: goto L_0x0344;
                    case 55: goto L_0x0344;
                    case 56: goto L_0x0344;
                    case 57: goto L_0x0344;
                    case 58: goto L_0x0344;
                    case 59: goto L_0x0344;
                    case 60: goto L_0x0344;
                    case 61: goto L_0x0344;
                    case 62: goto L_0x0344;
                    case 63: goto L_0x0344;
                    case 64: goto L_0x0344;
                    default: goto L_0x0343;
                }
            L_0x0343:
                goto L_0x037f
            L_0x0344:
                com.yeelight.yeelib.f.e r4 = com.yeelight.yeelib.p152f.C9784e.m23711b()
                boolean r4 = r4.mo31629e()
                if (r4 == 0) goto L_0x0358
                com.yeelight.cherry.ui.activity.ProductListActivity r4 = com.yeelight.cherry.p177ui.activity.ProductListActivity.this
                com.yeelight.yeelib.g.x r5 = r4.f11602g
                r4.m16901f0(r5)
                goto L_0x037f
            L_0x0358:
                com.yeelight.cherry.ui.activity.ProductListActivity r4 = com.yeelight.cherry.p177ui.activity.ProductListActivity.this
                r4.m16902g0()
                goto L_0x037f
            L_0x035e:
                com.yeelight.cherry.ui.activity.ProductListActivity r4 = com.yeelight.cherry.p177ui.activity.ProductListActivity.this
                com.yeelight.yeelib.g.x r5 = r4.f11602g
                r4.m16899d0(r5)
                goto L_0x037f
            L_0x0368:
                int r4 = r5.getIntExtra(r0, r1)
                if (r4 != r1) goto L_0x037f
                com.yeelight.cherry.ui.activity.ProductListActivity r4 = com.yeelight.cherry.p177ui.activity.ProductListActivity.this
                android.app.ProgressDialog r4 = r4.f11599d
                if (r4 == 0) goto L_0x037f
                com.yeelight.cherry.ui.activity.ProductListActivity r4 = com.yeelight.cherry.p177ui.activity.ProductListActivity.this
                android.app.ProgressDialog r4 = r4.f11599d
                r4.dismiss()
            L_0x037f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.activity.ProductListActivity.C5550a.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ProductListActivity$b */
    class C5551b extends BroadcastReceiver {
        C5551b() {
        }

        public void onReceive(Context context, Intent intent) {
            if (ProductListActivity.this.f11602g != null) {
                int intExtra = intent.getIntExtra("wifi_state", 0);
                if (intExtra == 3) {
                    if (ProductListActivity.this.f11599d != null) {
                        ProductListActivity.this.f11599d.dismiss();
                    }
                    ProductListActivity productListActivity = ProductListActivity.this;
                    productListActivity.m16901f0(productListActivity.f11602g);
                } else if (intExtra == 1 && ProductListActivity.this.f11599d != null) {
                    ProductListActivity.this.f11599d.dismiss();
                }
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ProductListActivity$c */
    class C5552c implements View.OnClickListener {
        C5552c() {
        }

        public void onClick(View view) {
            ProductListActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ProductListActivity$d */
    class C5553d implements ProductListAdapter.C5837b {
        C5553d() {
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:314:0x04e4, code lost:
            if (com.yeelight.yeelib.p152f.C9784e.m23711b().mo31629e() != false) goto L_0x0503;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:316:0x04ef, code lost:
            if (com.yeelight.yeelib.p152f.C9784e.m23711b().mo31627c() != false) goto L_0x0503;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:317:0x04f2, code lost:
            com.yeelight.cherry.p177ui.activity.ProductListActivity.m16897b0(r6.f11610a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:319:0x0501, code lost:
            if (com.yeelight.yeelib.p152f.C9784e.m23711b().mo31629e() != false) goto L_0x0503;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:320:0x0503, code lost:
            com.yeelight.cherry.p177ui.activity.ProductListActivity.m16895Z(r6.f11610a, r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:321:0x0509, code lost:
            com.yeelight.cherry.p177ui.activity.ProductListActivity.m16896a0(r6.f11610a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:329:0x0565, code lost:
            r6.f11610a.startActivity(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:330:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:331:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:332:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:333:?, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo26827a(int r7, com.yeelight.yeelib.p153g.C9855x r8) {
            /*
                r6 = this;
                com.yeelight.cherry.ui.activity.ProductListActivity r7 = com.yeelight.cherry.p177ui.activity.ProductListActivity.this
                com.yeelight.yeelib.p153g.C9855x unused = r7.f11602g = r8
                java.lang.String r7 = r8.mo31841c()
                int r0 = r7.hashCode()
                r1 = 1
                java.lang.String r2 = "yeelink.light.sp1grp"
                java.lang.String r3 = "yeelink.light.mb2grp"
                java.lang.String r4 = "yeelink.light.mb1grp"
                java.lang.String r5 = "yeelink.light.dn2grp"
                switch(r0) {
                    case -1644531059: goto L_0x04bf;
                    case -1494338802: goto L_0x04b4;
                    case -1462015191: goto L_0x04a9;
                    case -1462015190: goto L_0x049e;
                    case -1462015189: goto L_0x0493;
                    case -1462015188: goto L_0x0488;
                    case -1462015187: goto L_0x047d;
                    case -1462015186: goto L_0x0472;
                    case -1462015185: goto L_0x0467;
                    case -1462015184: goto L_0x045b;
                    case -1462015183: goto L_0x044f;
                    case -1462015182: goto L_0x0443;
                    case -1462015160: goto L_0x0437;
                    case -1462015159: goto L_0x042b;
                    case -1462015158: goto L_0x041f;
                    case -1462015157: goto L_0x0413;
                    case -1462015156: goto L_0x0407;
                    case -1400275319: goto L_0x03fb;
                    case -1350780909: goto L_0x03ef;
                    case -1317475940: goto L_0x03e3;
                    case -1317475939: goto L_0x03d7;
                    case -1317475915: goto L_0x03cb;
                    case -1317475914: goto L_0x03bf;
                    case -1317475913: goto L_0x03b3;
                    case -1317475912: goto L_0x03a7;
                    case -1308146495: goto L_0x039c;
                    case -1308146494: goto L_0x0390;
                    case -1308146493: goto L_0x0384;
                    case -1308146492: goto L_0x0378;
                    case -1308146491: goto L_0x036c;
                    case -1308146490: goto L_0x0360;
                    case -1308146488: goto L_0x0354;
                    case -1308146447: goto L_0x0348;
                    case -1308146446: goto L_0x033c;
                    case -1308146445: goto L_0x0330;
                    case -1282176368: goto L_0x0327;
                    case -1235140472: goto L_0x031b;
                    case -1235140471: goto L_0x030f;
                    case -1235140468: goto L_0x0303;
                    case -1235140467: goto L_0x02f7;
                    case -1199119278: goto L_0x02eb;
                    case -1119332198: goto L_0x02df;
                    case -1063384694: goto L_0x02d3;
                    case -1063384689: goto L_0x02c7;
                    case -1063384687: goto L_0x02bb;
                    case -1063384685: goto L_0x02af;
                    case -1035626052: goto L_0x02a6;
                    case -1035596261: goto L_0x029d;
                    case -948847040: goto L_0x0291;
                    case -948847038: goto L_0x0285;
                    case -888668266: goto L_0x0279;
                    case -888668265: goto L_0x026d;
                    case -888668264: goto L_0x0261;
                    case -850921852: goto L_0x0258;
                    case -845289556: goto L_0x024c;
                    case -845289555: goto L_0x0240;
                    case -845289553: goto L_0x0234;
                    case -845289551: goto L_0x0228;
                    case -845289508: goto L_0x021c;
                    case -458141175: goto L_0x0210;
                    case -458141172: goto L_0x0204;
                    case -454053748: goto L_0x01f9;
                    case -449944730: goto L_0x01ed;
                    case -449944729: goto L_0x01e1;
                    case -449944728: goto L_0x01d5;
                    case -449944727: goto L_0x01c9;
                    case -449944726: goto L_0x01bd;
                    case -449944724: goto L_0x01b1;
                    case -449944723: goto L_0x01a5;
                    case -449944722: goto L_0x0199;
                    case -448603205: goto L_0x018d;
                    case -448603202: goto L_0x0181;
                    case -448603201: goto L_0x0175;
                    case -448603157: goto L_0x0169;
                    case -448603156: goto L_0x015d;
                    case -443031172: goto L_0x0151;
                    case -190173984: goto L_0x0145;
                    case -190173936: goto L_0x0139;
                    case 174464231: goto L_0x012d;
                    case 250266083: goto L_0x0122;
                    case 674030242: goto L_0x0116;
                    case 922669543: goto L_0x010a;
                    case 922669544: goto L_0x00fe;
                    case 922669545: goto L_0x00f2;
                    case 922669546: goto L_0x00e6;
                    case 922669547: goto L_0x00da;
                    case 922669548: goto L_0x00ce;
                    case 922669549: goto L_0x00c2;
                    case 922669550: goto L_0x00b6;
                    case 922669551: goto L_0x00aa;
                    case 1201756974: goto L_0x009e;
                    case 1201757021: goto L_0x0092;
                    case 1201766335: goto L_0x0086;
                    case 1201766336: goto L_0x007a;
                    case 1557976171: goto L_0x006f;
                    case 1623724661: goto L_0x0063;
                    case 1623724662: goto L_0x0057;
                    case 1623724663: goto L_0x004b;
                    case 2086270815: goto L_0x003f;
                    case 2102612488: goto L_0x0033;
                    case 2102612489: goto L_0x0027;
                    case 2146130361: goto L_0x001b;
                    default: goto L_0x0019;
                }
            L_0x0019:
                goto L_0x04ca
            L_0x001b:
                java.lang.String r0 = "yeelink.light.dnlight2"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 87
                goto L_0x04cb
            L_0x0027:
                java.lang.String r0 = "yeelink.light.meshbulb2"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 89
                goto L_0x04cb
            L_0x0033:
                java.lang.String r0 = "yeelink.light.meshbulb1"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 88
                goto L_0x04cb
            L_0x003f:
                java.lang.String r0 = "virtual.yeelink.light.mijia.ceiling"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 94
                goto L_0x04cb
            L_0x004b:
                java.lang.String r0 = "yeelink.light.bslamp3"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 72
                goto L_0x04cb
            L_0x0057:
                java.lang.String r0 = "yeelink.light.bslamp2"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 71
                goto L_0x04cb
            L_0x0063:
                java.lang.String r0 = "yeelink.light.bslamp1"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 70
                goto L_0x04cb
            L_0x006f:
                java.lang.String r0 = "yeelink.light.glcolor"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 0
                goto L_0x04cb
            L_0x007a:
                java.lang.String r0 = "yeelink.light.ml2"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 92
                goto L_0x04cb
            L_0x0086:
                java.lang.String r0 = "yeelink.light.ml1"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 91
                goto L_0x04cb
            L_0x0092:
                java.lang.String r0 = "yeelink.light.cta"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 29
                goto L_0x04cb
            L_0x009e:
                java.lang.String r0 = "yeelink.light.ct2"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 28
                goto L_0x04cb
            L_0x00aa:
                java.lang.String r0 = "yeelink.light.ceiling9"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 42
                goto L_0x04cb
            L_0x00b6:
                java.lang.String r0 = "yeelink.light.ceiling8"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 41
                goto L_0x04cb
            L_0x00c2:
                java.lang.String r0 = "yeelink.light.ceiling7"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 40
                goto L_0x04cb
            L_0x00ce:
                java.lang.String r0 = "yeelink.light.ceiling6"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 39
                goto L_0x04cb
            L_0x00da:
                java.lang.String r0 = "yeelink.light.ceiling5"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 38
                goto L_0x04cb
            L_0x00e6:
                java.lang.String r0 = "yeelink.light.ceiling4"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 37
                goto L_0x04cb
            L_0x00f2:
                java.lang.String r0 = "yeelink.light.ceiling3"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 36
                goto L_0x04cb
            L_0x00fe:
                java.lang.String r0 = "yeelink.light.ceiling2"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 35
                goto L_0x04cb
            L_0x010a:
                java.lang.String r0 = "yeelink.light.ceiling1"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 34
                goto L_0x04cb
            L_0x0116:
                java.lang.String r0 = "yeelink.curtain.ctmt1"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 95
                goto L_0x04cb
            L_0x0122:
                java.lang.String r0 = "yeelink.light.gingko.group"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 2
                goto L_0x04cb
            L_0x012d:
                java.lang.String r0 = "virtual.yeelink.light.ceiling"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 93
                goto L_0x04cb
            L_0x0139:
                java.lang.String r0 = "yeelink.gateway.va"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 31
                goto L_0x04cb
            L_0x0145:
                java.lang.String r0 = "yeelink.gateway.v1"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 30
                goto L_0x04cb
            L_0x0151:
                java.lang.String r0 = "yeelink.light.spot1"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 90
                goto L_0x04cb
            L_0x015d:
                java.lang.String r0 = "yeelink.light.monob"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 78
                goto L_0x04cb
            L_0x0169:
                java.lang.String r0 = "yeelink.light.monoa"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 9
                goto L_0x04cb
            L_0x0175:
                java.lang.String r0 = "yeelink.light.mono5"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 77
                goto L_0x04cb
            L_0x0181:
                java.lang.String r0 = "yeelink.light.mono4"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 76
                goto L_0x04cb
            L_0x018d:
                java.lang.String r0 = "yeelink.light.mono1"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 8
                goto L_0x04cb
            L_0x0199:
                java.lang.String r0 = "yeelink.light.lamp9"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 85
                goto L_0x04cb
            L_0x01a5:
                java.lang.String r0 = "yeelink.light.lamp8"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 84
                goto L_0x04cb
            L_0x01b1:
                java.lang.String r0 = "yeelink.light.lamp7"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 83
                goto L_0x04cb
            L_0x01bd:
                java.lang.String r0 = "yeelink.light.lamp5"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 12
                goto L_0x04cb
            L_0x01c9:
                java.lang.String r0 = "yeelink.light.lamp4"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 82
                goto L_0x04cb
            L_0x01d5:
                java.lang.String r0 = "yeelink.light.lamp3"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 11
                goto L_0x04cb
            L_0x01e1:
                java.lang.String r0 = "yeelink.light.lamp2"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 74
                goto L_0x04cb
            L_0x01ed:
                java.lang.String r0 = "yeelink.light.lamp1"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 10
                goto L_0x04cb
            L_0x01f9:
                java.lang.String r0 = "yeelink.light.group"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 1
                goto L_0x04cb
            L_0x0204:
                java.lang.String r0 = "yeelink.light.ceild"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 65
                goto L_0x04cb
            L_0x0210:
                java.lang.String r0 = "yeelink.light.ceila"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 64
                goto L_0x04cb
            L_0x021c:
                java.lang.String r0 = "yeelink.light.stripa"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 18
                goto L_0x04cb
            L_0x0228:
                java.lang.String r0 = "yeelink.light.strip6"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 17
                goto L_0x04cb
            L_0x0234:
                java.lang.String r0 = "yeelink.light.strip4"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 81
                goto L_0x04cb
            L_0x0240:
                java.lang.String r0 = "yeelink.light.strip2"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 16
                goto L_0x04cb
            L_0x024c:
                java.lang.String r0 = "yeelink.light.strip1"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 15
                goto L_0x04cb
            L_0x0258:
                boolean r7 = r7.equals(r2)
                if (r7 == 0) goto L_0x04ca
                r7 = 6
                goto L_0x04cb
            L_0x0261:
                java.lang.String r0 = "yilai.light.ceiling3"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 68
                goto L_0x04cb
            L_0x026d:
                java.lang.String r0 = "yilai.light.ceiling2"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 67
                goto L_0x04cb
            L_0x0279:
                java.lang.String r0 = "yilai.light.ceiling1"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 66
                goto L_0x04cb
            L_0x0285:
                java.lang.String r0 = "yeelink.light.panel3"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 80
                goto L_0x04cb
            L_0x0291:
                java.lang.String r0 = "yeelink.light.panel1"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 79
                goto L_0x04cb
            L_0x029d:
                boolean r7 = r7.equals(r3)
                if (r7 == 0) goto L_0x04ca
                r7 = 5
                goto L_0x04cb
            L_0x02a6:
                boolean r7 = r7.equals(r4)
                if (r7 == 0) goto L_0x04ca
                r7 = 4
                goto L_0x04cb
            L_0x02af:
                java.lang.String r0 = "yeelink.light.lamp19"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 73
                goto L_0x04cb
            L_0x02bb:
                java.lang.String r0 = "yeelink.light.lamp17"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 14
                goto L_0x04cb
            L_0x02c7:
                java.lang.String r0 = "yeelink.light.lamp15"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 13
                goto L_0x04cb
            L_0x02d3:
                java.lang.String r0 = "yeelink.light.lamp10"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 86
                goto L_0x04cb
            L_0x02df:
                java.lang.String r0 = "yeelink.wifispeaker.v1"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 69
                goto L_0x04cb
            L_0x02eb:
                java.lang.String r0 = "yeelink.light.gingko"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 33
                goto L_0x04cb
            L_0x02f7:
                java.lang.String r0 = "yeelink.light.fancl6"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 101(0x65, float:1.42E-43)
                goto L_0x04cb
            L_0x0303:
                java.lang.String r0 = "yeelink.light.fancl5"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 100
                goto L_0x04cb
            L_0x030f:
                java.lang.String r0 = "yeelink.light.fancl2"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 99
                goto L_0x04cb
            L_0x031b:
                java.lang.String r0 = "yeelink.light.fancl1"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 98
                goto L_0x04cb
            L_0x0327:
                boolean r7 = r7.equals(r5)
                if (r7 == 0) goto L_0x04ca
                r7 = 3
                goto L_0x04cb
            L_0x0330:
                java.lang.String r0 = "yeelink.light.colorc"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 27
                goto L_0x04cb
            L_0x033c:
                java.lang.String r0 = "yeelink.light.colorb"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 26
                goto L_0x04cb
            L_0x0348:
                java.lang.String r0 = "yeelink.light.colora"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 25
                goto L_0x04cb
            L_0x0354:
                java.lang.String r0 = "yeelink.light.color8"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 24
                goto L_0x04cb
            L_0x0360:
                java.lang.String r0 = "yeelink.light.color6"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 23
                goto L_0x04cb
            L_0x036c:
                java.lang.String r0 = "yeelink.light.color5"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 22
                goto L_0x04cb
            L_0x0378:
                java.lang.String r0 = "yeelink.light.color4"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 21
                goto L_0x04cb
            L_0x0384:
                java.lang.String r0 = "yeelink.light.color3"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 20
                goto L_0x04cb
            L_0x0390:
                java.lang.String r0 = "yeelink.light.color2"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 19
                goto L_0x04cb
            L_0x039c:
                java.lang.String r0 = "yeelink.light.color1"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 7
                goto L_0x04cb
            L_0x03a7:
                java.lang.String r0 = "yeelink.light.ceil33"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 63
                goto L_0x04cb
            L_0x03b3:
                java.lang.String r0 = "yeelink.light.ceil32"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 62
                goto L_0x04cb
            L_0x03bf:
                java.lang.String r0 = "yeelink.light.ceil31"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 61
                goto L_0x04cb
            L_0x03cb:
                java.lang.String r0 = "yeelink.light.ceil30"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 60
                goto L_0x04cb
            L_0x03d7:
                java.lang.String r0 = "yeelink.light.ceil27"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 59
                goto L_0x04cb
            L_0x03e3:
                java.lang.String r0 = "yeelink.light.ceil26"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 58
                goto L_0x04cb
            L_0x03ef:
                java.lang.String r0 = "yeelink.plug.plug"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 97
                goto L_0x04cb
            L_0x03fb:
                java.lang.String r0 = "yeelink.light.ble1"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 32
                goto L_0x04cb
            L_0x0407:
                java.lang.String r0 = "yeelink.light.ceiling24"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 57
                goto L_0x04cb
            L_0x0413:
                java.lang.String r0 = "yeelink.light.ceiling23"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 56
                goto L_0x04cb
            L_0x041f:
                java.lang.String r0 = "yeelink.light.ceiling22"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 55
                goto L_0x04cb
            L_0x042b:
                java.lang.String r0 = "yeelink.light.ceiling21"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 54
                goto L_0x04cb
            L_0x0437:
                java.lang.String r0 = "yeelink.light.ceiling20"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 53
                goto L_0x04cb
            L_0x0443:
                java.lang.String r0 = "yeelink.light.ceiling19"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 52
                goto L_0x04cb
            L_0x044f:
                java.lang.String r0 = "yeelink.light.ceiling18"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 51
                goto L_0x04cb
            L_0x045b:
                java.lang.String r0 = "yeelink.light.ceiling17"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 50
                goto L_0x04cb
            L_0x0467:
                java.lang.String r0 = "yeelink.light.ceiling16"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 49
                goto L_0x04cb
            L_0x0472:
                java.lang.String r0 = "yeelink.light.ceiling15"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 48
                goto L_0x04cb
            L_0x047d:
                java.lang.String r0 = "yeelink.light.ceiling14"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 47
                goto L_0x04cb
            L_0x0488:
                java.lang.String r0 = "yeelink.light.ceiling13"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 46
                goto L_0x04cb
            L_0x0493:
                java.lang.String r0 = "yeelink.light.ceiling12"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 45
                goto L_0x04cb
            L_0x049e:
                java.lang.String r0 = "yeelink.light.ceiling11"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 44
                goto L_0x04cb
            L_0x04a9:
                java.lang.String r0 = "yeelink.light.ceiling10"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 43
                goto L_0x04cb
            L_0x04b4:
                java.lang.String r0 = "yeelink.switch.sw1"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 96
                goto L_0x04cb
            L_0x04bf:
                java.lang.String r0 = "yeelink.bhf_light.v1"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x04ca
                r7 = 75
                goto L_0x04cb
            L_0x04ca:
                r7 = -1
            L_0x04cb:
                java.lang.String r0 = "type_group"
                switch(r7) {
                    case 0: goto L_0x055c;
                    case 1: goto L_0x0552;
                    case 2: goto L_0x0543;
                    case 3: goto L_0x0536;
                    case 4: goto L_0x0529;
                    case 5: goto L_0x051c;
                    case 6: goto L_0x050f;
                    case 7: goto L_0x04f9;
                    case 8: goto L_0x04f9;
                    case 9: goto L_0x04f9;
                    case 10: goto L_0x04f9;
                    case 11: goto L_0x04f9;
                    case 12: goto L_0x04f9;
                    case 13: goto L_0x04f9;
                    case 14: goto L_0x04f9;
                    case 15: goto L_0x04f9;
                    case 16: goto L_0x04f9;
                    case 17: goto L_0x04f9;
                    case 18: goto L_0x04f9;
                    case 19: goto L_0x04f9;
                    case 20: goto L_0x04f9;
                    case 21: goto L_0x04f9;
                    case 22: goto L_0x04f9;
                    case 23: goto L_0x04f9;
                    case 24: goto L_0x04f9;
                    case 25: goto L_0x04f9;
                    case 26: goto L_0x04f9;
                    case 27: goto L_0x04f9;
                    case 28: goto L_0x04f9;
                    case 29: goto L_0x04f9;
                    case 30: goto L_0x04f9;
                    case 31: goto L_0x04f9;
                    case 32: goto L_0x04e7;
                    case 33: goto L_0x04e7;
                    case 34: goto L_0x04d2;
                    case 35: goto L_0x04d2;
                    case 36: goto L_0x04d2;
                    case 37: goto L_0x04d2;
                    case 38: goto L_0x04d2;
                    case 39: goto L_0x04d2;
                    case 40: goto L_0x04d2;
                    case 41: goto L_0x04d2;
                    case 42: goto L_0x04d2;
                    case 43: goto L_0x04d2;
                    case 44: goto L_0x04d2;
                    case 45: goto L_0x04d2;
                    case 46: goto L_0x04d2;
                    case 47: goto L_0x04d2;
                    case 48: goto L_0x04d2;
                    case 49: goto L_0x04d2;
                    case 50: goto L_0x04d2;
                    case 51: goto L_0x04d2;
                    case 52: goto L_0x04d2;
                    case 53: goto L_0x04d2;
                    case 54: goto L_0x04d2;
                    case 55: goto L_0x04d2;
                    case 56: goto L_0x04d2;
                    case 57: goto L_0x04d2;
                    case 58: goto L_0x04d2;
                    case 59: goto L_0x04d2;
                    case 60: goto L_0x04d2;
                    case 61: goto L_0x04d2;
                    case 62: goto L_0x04d2;
                    case 63: goto L_0x04d2;
                    case 64: goto L_0x04d2;
                    case 65: goto L_0x04d2;
                    case 66: goto L_0x04d2;
                    case 67: goto L_0x04d2;
                    case 68: goto L_0x04d2;
                    case 69: goto L_0x04d2;
                    case 70: goto L_0x04d2;
                    case 71: goto L_0x04d2;
                    case 72: goto L_0x04d2;
                    case 73: goto L_0x04d2;
                    case 74: goto L_0x04d2;
                    case 75: goto L_0x04d2;
                    case 76: goto L_0x04d2;
                    case 77: goto L_0x04d2;
                    case 78: goto L_0x04d2;
                    case 79: goto L_0x04d2;
                    case 80: goto L_0x04d2;
                    case 81: goto L_0x04d2;
                    case 82: goto L_0x04d2;
                    case 83: goto L_0x04d2;
                    case 84: goto L_0x04d2;
                    case 85: goto L_0x04d2;
                    case 86: goto L_0x04d2;
                    case 87: goto L_0x04d2;
                    case 88: goto L_0x04d2;
                    case 89: goto L_0x04d2;
                    case 90: goto L_0x04d2;
                    case 91: goto L_0x04d2;
                    case 92: goto L_0x04d2;
                    case 93: goto L_0x04d2;
                    case 94: goto L_0x04d2;
                    case 95: goto L_0x04d2;
                    case 96: goto L_0x04d2;
                    case 97: goto L_0x04d2;
                    case 98: goto L_0x04d2;
                    case 99: goto L_0x04d2;
                    case 100: goto L_0x04d2;
                    case 101: goto L_0x04d2;
                    default: goto L_0x04d0;
                }
            L_0x04d0:
                goto L_0x056a
            L_0x04d2:
                com.yeelight.yeelib.f.e r7 = com.yeelight.yeelib.p152f.C9784e.m23711b()
                boolean r7 = r7.mo31627c()
                if (r7 == 0) goto L_0x04f2
                com.yeelight.yeelib.f.e r7 = com.yeelight.yeelib.p152f.C9784e.m23711b()
                boolean r7 = r7.mo31629e()
                if (r7 == 0) goto L_0x0509
                goto L_0x0503
            L_0x04e7:
                com.yeelight.yeelib.f.e r7 = com.yeelight.yeelib.p152f.C9784e.m23711b()
                boolean r7 = r7.mo31627c()
                if (r7 == 0) goto L_0x04f2
                goto L_0x0503
            L_0x04f2:
                com.yeelight.cherry.ui.activity.ProductListActivity r7 = com.yeelight.cherry.p177ui.activity.ProductListActivity.this
                r7.m16900e0()
                goto L_0x056a
            L_0x04f9:
                com.yeelight.yeelib.f.e r7 = com.yeelight.yeelib.p152f.C9784e.m23711b()
                boolean r7 = r7.mo31629e()
                if (r7 == 0) goto L_0x0509
            L_0x0503:
                com.yeelight.cherry.ui.activity.ProductListActivity r7 = com.yeelight.cherry.p177ui.activity.ProductListActivity.this
                r7.m16901f0(r8)
                goto L_0x056a
            L_0x0509:
                com.yeelight.cherry.ui.activity.ProductListActivity r7 = com.yeelight.cherry.p177ui.activity.ProductListActivity.this
                r7.m16902g0()
                goto L_0x056a
            L_0x050f:
                android.content.Intent r7 = new android.content.Intent
                com.yeelight.cherry.ui.activity.ProductListActivity r8 = com.yeelight.cherry.p177ui.activity.ProductListActivity.this
                java.lang.Class<com.yeelight.cherry.ui.activity.CreateGroupNameActivity> r1 = com.yeelight.cherry.p177ui.activity.CreateGroupNameActivity.class
                r7.<init>(r8, r1)
                r7.putExtra(r0, r2)
                goto L_0x0565
            L_0x051c:
                android.content.Intent r7 = new android.content.Intent
                com.yeelight.cherry.ui.activity.ProductListActivity r8 = com.yeelight.cherry.p177ui.activity.ProductListActivity.this
                java.lang.Class<com.yeelight.cherry.ui.activity.CreateGroupNameActivity> r1 = com.yeelight.cherry.p177ui.activity.CreateGroupNameActivity.class
                r7.<init>(r8, r1)
                r7.putExtra(r0, r3)
                goto L_0x0565
            L_0x0529:
                android.content.Intent r7 = new android.content.Intent
                com.yeelight.cherry.ui.activity.ProductListActivity r8 = com.yeelight.cherry.p177ui.activity.ProductListActivity.this
                java.lang.Class<com.yeelight.cherry.ui.activity.CreateGroupNameActivity> r1 = com.yeelight.cherry.p177ui.activity.CreateGroupNameActivity.class
                r7.<init>(r8, r1)
                r7.putExtra(r0, r4)
                goto L_0x0565
            L_0x0536:
                android.content.Intent r7 = new android.content.Intent
                com.yeelight.cherry.ui.activity.ProductListActivity r8 = com.yeelight.cherry.p177ui.activity.ProductListActivity.this
                java.lang.Class<com.yeelight.cherry.ui.activity.CreateGroupNameActivity> r1 = com.yeelight.cherry.p177ui.activity.CreateGroupNameActivity.class
                r7.<init>(r8, r1)
                r7.putExtra(r0, r5)
                goto L_0x0565
            L_0x0543:
                android.content.Intent r7 = new android.content.Intent
                com.yeelight.cherry.ui.activity.ProductListActivity r8 = com.yeelight.cherry.p177ui.activity.ProductListActivity.this
                java.lang.Class<com.yeelight.cherry.ui.activity.AddNetworkActivity> r0 = com.yeelight.cherry.p177ui.activity.AddNetworkActivity.class
                r7.<init>(r8, r0)
                java.lang.String r8 = "ADD_MESH_GROUP"
                r7.putExtra(r8, r1)
                goto L_0x0565
            L_0x0552:
                android.content.Intent r7 = new android.content.Intent
                com.yeelight.cherry.ui.activity.ProductListActivity r8 = com.yeelight.cherry.p177ui.activity.ProductListActivity.this
                java.lang.Class<com.yeelight.cherry.ui.activity.CreateGroupNameActivity> r0 = com.yeelight.cherry.p177ui.activity.CreateGroupNameActivity.class
                r7.<init>(r8, r0)
                goto L_0x0565
            L_0x055c:
                android.content.Intent r7 = new android.content.Intent
                com.yeelight.cherry.ui.activity.ProductListActivity r8 = com.yeelight.cherry.p177ui.activity.ProductListActivity.this
                java.lang.Class<com.yeelight.cherry.ui.activity.GoogleSeamlessActivity> r0 = com.yeelight.cherry.p177ui.activity.GoogleSeamlessActivity.class
                r7.<init>(r8, r0)
            L_0x0565:
                com.yeelight.cherry.ui.activity.ProductListActivity r8 = com.yeelight.cherry.p177ui.activity.ProductListActivity.this
                r8.startActivity(r7)
            L_0x056a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.activity.ProductListActivity.C5553d.mo26827a(int, com.yeelight.yeelib.g.x):void");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ProductListActivity$e */
    class C5554e implements DialogInterface.OnClickListener {
        C5554e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C4297y.m12064f().mo23737m(ProductListActivity.this, true);
            dialogInterface.dismiss();
            ProductListActivity.this.f11599d.show();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ProductListActivity$f */
    class C5555f implements DialogInterface.OnClickListener {
        C5555f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C4297y.m12064f().mo23731b().enable();
            dialogInterface.dismiss();
            ProductListActivity.this.f11599d.show();
        }
    }

    /* renamed from: c0 */
    private void m16898c0() {
        this.mDeviceList.setLayoutManager(new GridLayoutManager(this, 2));
        ProductListAdapter productListAdapter = new ProductListAdapter(this, this.f11601f);
        this.f11600e = productListAdapter;
        productListAdapter.mo27208d(new C5553d());
        this.mDeviceList.setAdapter(this.f11600e);
        this.mDeviceList.addItemDecoration(new ProductItemDecoration(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public void m16899d0(C9855x xVar) {
        Intent intent = new Intent(this, SearchDeviceActivity.class);
        intent.putExtra("product", xVar);
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public void m16900e0() {
        if (this.f11597b == null) {
            C10526e.C10531e eVar = new C10526e.C10531e(this);
            eVar.mo33357h(2131755192);
            eVar.mo33355f(2131755193);
            eVar.mo33353d(-2, getString(2131755229), (DialogInterface.OnClickListener) null);
            eVar.mo33353d(-1, getString(2131755194), new C5555f());
            this.f11597b = eVar.mo33351b();
            ProgressDialog progressDialog = new ProgressDialog(this, 3);
            this.f11599d = progressDialog;
            progressDialog.setMessage(getString(2131755360));
            this.f11599d.setCancelable(false);
        }
        this.f11597b.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public void m16901f0(C9855x xVar) {
        Intent intent = new Intent(this, DeviceResetActivity.class);
        intent.putExtra("product", xVar);
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public void m16902g0() {
        if (this.f11598c == null) {
            C10526e.C10531e eVar = new C10526e.C10531e(this);
            eVar.mo33357h(2131755197);
            eVar.mo33355f(2131755198);
            eVar.mo33353d(-2, getString(2131755229), (DialogInterface.OnClickListener) null);
            eVar.mo33353d(-1, getString(2131755194), new C5554e());
            this.f11598c = eVar.mo33351b();
            ProgressDialog progressDialog = new ProgressDialog(this, 3);
            this.f11599d = progressDialog;
            progressDialog.setMessage(getString(2131755360));
            this.f11599d.setCancelable(false);
        }
        this.f11598c.show();
    }

    /* renamed from: A */
    public void mo23588A() {
        List<C9855x> list;
        List<C9855x> list2;
        this.f11601f.clear();
        int i = this.f11603h;
        if (i != 1) {
            if (i == 2) {
                list2 = this.f11601f;
                list = C4239r.m11807g().mo23573e();
            }
            this.f11600e.notifyDataSetChanged();
        }
        list2 = this.f11601f;
        list = C4239r.m11807g().mo23574f();
        list2.addAll(list);
        this.f11600e.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        setContentView(C11748R$layout.activity_product_list);
        C10547m.m25758h(true, this);
        ButterKnife.bind((Activity) this);
        if (getIntent() != null) {
            this.f11603h = getIntent().getIntExtra("key_add_device", 0);
        }
        m16898c0();
        this.mTitleBar.mo32825a(getString(2131755213), new C5552c(), (View.OnClickListener) null);
        this.mTitleBar.setTitleTextSize(16);
        registerReceiver(this.f11604i, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        registerReceiver(this.f11605j, new IntentFilter("android.net.wifi.WIFI_STATE_CHANGED"));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f11604i);
        unregisterReceiver(this.f11605j);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C4239r.m11807g().mo23584s(this);
        C10526e eVar = this.f11597b;
        if (eVar != null && eVar.isShowing()) {
            this.f11597b.dismiss();
        }
        C10526e eVar2 = this.f11598c;
        if (eVar2 != null && eVar2.isShowing()) {
            this.f11598c.dismiss();
        }
        ProgressDialog progressDialog = this.f11599d;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f11599d.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        List<C9855x> list;
        List<C9855x> list2;
        super.onResume();
        this.f11601f.clear();
        int i = this.f11603h;
        if (i != 1) {
            if (i == 2) {
                list2 = this.f11601f;
                list = C4239r.m11807g().mo23573e();
            }
            this.f11600e.notifyDataSetChanged();
            C4239r.m11807g().mo23582p(this);
        }
        list2 = this.f11601f;
        list = C4239r.m11807g().mo23574f();
        list2.addAll(list);
        this.f11600e.notifyDataSetChanged();
        C4239r.m11807g().mo23582p(this);
    }
}
