package com.yeelight.cherry.p141ui.activity;

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
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.adapter.ProductListAdapter;
import com.yeelight.yeelib.managers.C3088r;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.models.ProductInfo;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import java.util.ArrayList;
import java.util.List;
import p051j4.C9193k;
import p170i4.C9113d;

/* renamed from: com.yeelight.cherry.ui.activity.ProductListActivity */
public class ProductListActivity extends BaseActivity implements C3088r.C3091b {

    /* renamed from: a */
    private C9113d f11162a;

    /* renamed from: b */
    private C9113d f11163b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ProgressDialog f11164c;

    /* renamed from: d */
    private ProductListAdapter f11165d;

    /* renamed from: e */
    private List<ProductInfo> f11166e = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ProductInfo f11167f;

    /* renamed from: g */
    private int f11168g;

    /* renamed from: h */
    private BroadcastReceiver f11169h = new C5593a();

    /* renamed from: i */
    private BroadcastReceiver f11170i = new C5594b();
    @BindView(2131296647)
    RecyclerView mDeviceList;
    @BindView(2131297591)
    CommonTitleBar mTitleBar;

    /* renamed from: com.yeelight.cherry.ui.activity.ProductListActivity$ProductItemDecoration */
    public class ProductItemDecoration extends RecyclerView.ItemDecoration {

        /* renamed from: a */
        Paint f11171a;

        public ProductItemDecoration(ProductListActivity productListActivity) {
            Paint paint = new Paint();
            this.f11171a = paint;
            paint.setColor(Color.parseColor("#e8e8e8"));
            this.f11171a.setStrokeWidth(1.0f);
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
                    canvas.drawLine(f2, y, f4, f5, this.f11171a);
                    paint = this.f11171a;
                    canvas2 = canvas;
                    f3 = f5;
                    f = f5;
                } else {
                    f = y + ((float) height);
                    f2 = x + ((float) width);
                    paint = this.f11171a;
                    canvas2 = canvas;
                    f3 = f;
                }
                canvas2.drawLine(x, f3, f2, f, paint);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ProductListActivity$a */
    class C5593a extends BroadcastReceiver {
        C5593a() {
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:182:0x0357, code lost:
            if (r4.equals("yeelink.light.ceiling18") == false) goto L_0x0047;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onReceive(android.content.Context r4, android.content.Intent r5) {
            /*
                r3 = this;
                com.yeelight.cherry.ui.activity.ProductListActivity r4 = com.yeelight.cherry.p141ui.activity.ProductListActivity.this
                com.yeelight.yeelib.models.ProductInfo r4 = r4.f11167f
                if (r4 != 0) goto L_0x0009
                return
            L_0x0009:
                java.lang.String r4 = r5.getAction()
                java.lang.String r0 = "android.bluetooth.adapter.action.STATE_CHANGED"
                boolean r4 = r4.equals(r0)
                java.lang.String r0 = "android.bluetooth.adapter.extra.STATE"
                r1 = 10
                if (r4 == 0) goto L_0x03fe
                int r4 = r5.getIntExtra(r0, r1)
                r2 = 12
                if (r4 != r2) goto L_0x03fe
                com.yeelight.cherry.ui.activity.ProductListActivity r4 = com.yeelight.cherry.p141ui.activity.ProductListActivity.this
                android.app.ProgressDialog r4 = r4.f11164c
                if (r4 == 0) goto L_0x0032
                com.yeelight.cherry.ui.activity.ProductListActivity r4 = com.yeelight.cherry.p141ui.activity.ProductListActivity.this
                android.app.ProgressDialog r4 = r4.f11164c
                r4.dismiss()
            L_0x0032:
                com.yeelight.cherry.ui.activity.ProductListActivity r4 = com.yeelight.cherry.p141ui.activity.ProductListActivity.this
                com.yeelight.yeelib.models.ProductInfo r4 = r4.f11167f
                java.lang.String r4 = r4.getProductModel()
                r4.hashCode()
                r5 = -1
                int r0 = r4.hashCode()
                switch(r0) {
                    case -1644531059: goto L_0x03cb;
                    case -1494338802: goto L_0x03bf;
                    case -1462015191: goto L_0x03b3;
                    case -1462015190: goto L_0x03a7;
                    case -1462015189: goto L_0x039b;
                    case -1462015188: goto L_0x038f;
                    case -1462015187: goto L_0x0383;
                    case -1462015186: goto L_0x0377;
                    case -1462015185: goto L_0x0369;
                    case -1462015184: goto L_0x035b;
                    case -1462015183: goto L_0x0351;
                    case -1462015182: goto L_0x0343;
                    case -1462015160: goto L_0x0335;
                    case -1462015159: goto L_0x0327;
                    case -1462015158: goto L_0x0319;
                    case -1462015157: goto L_0x030b;
                    case -1462015156: goto L_0x02fd;
                    case -1400275319: goto L_0x02ef;
                    case -1350780909: goto L_0x02e1;
                    case -1317475940: goto L_0x02d3;
                    case -1317475939: goto L_0x02c5;
                    case -1317475937: goto L_0x02b7;
                    case -1317475915: goto L_0x02a9;
                    case -1317475914: goto L_0x029b;
                    case -1317475913: goto L_0x028d;
                    case -1317475912: goto L_0x027f;
                    case -1317475910: goto L_0x0271;
                    case -1282176368: goto L_0x0263;
                    case -1235140472: goto L_0x0255;
                    case -1235140471: goto L_0x0247;
                    case -1235140468: goto L_0x0239;
                    case -1235140467: goto L_0x022b;
                    case -1199119278: goto L_0x021d;
                    case -1063384685: goto L_0x020f;
                    case -1035626052: goto L_0x0201;
                    case -1035596261: goto L_0x01f3;
                    case -888668266: goto L_0x01e5;
                    case -888668265: goto L_0x01d7;
                    case -888668264: goto L_0x01c9;
                    case -850921852: goto L_0x01bb;
                    case -458141175: goto L_0x01ad;
                    case -458141174: goto L_0x019f;
                    case -458141173: goto L_0x0191;
                    case -458141172: goto L_0x0183;
                    case -458141171: goto L_0x0175;
                    case -443031172: goto L_0x0167;
                    case -190173984: goto L_0x0159;
                    case -190173936: goto L_0x014b;
                    case 174464231: goto L_0x013d;
                    case 674030242: goto L_0x012f;
                    case 922669543: goto L_0x0121;
                    case 922669544: goto L_0x0113;
                    case 922669545: goto L_0x0105;
                    case 922669546: goto L_0x00f7;
                    case 922669547: goto L_0x00e9;
                    case 922669548: goto L_0x00db;
                    case 922669549: goto L_0x00cd;
                    case 922669550: goto L_0x00bf;
                    case 1201766335: goto L_0x00b2;
                    case 1201766336: goto L_0x00a5;
                    case 1623724661: goto L_0x0098;
                    case 1623724662: goto L_0x008b;
                    case 1623724663: goto L_0x007e;
                    case 2086270815: goto L_0x0071;
                    case 2102612488: goto L_0x0064;
                    case 2102612489: goto L_0x0057;
                    case 2146130361: goto L_0x004a;
                    default: goto L_0x0047;
                }
            L_0x0047:
                r1 = -1
                goto L_0x03d6
            L_0x004a:
                java.lang.String r0 = "yeelink.light.dnlight2"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0053
                goto L_0x0047
            L_0x0053:
                r1 = 66
                goto L_0x03d6
            L_0x0057:
                java.lang.String r0 = "yeelink.light.meshbulb2"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0060
                goto L_0x0047
            L_0x0060:
                r1 = 65
                goto L_0x03d6
            L_0x0064:
                java.lang.String r0 = "yeelink.light.meshbulb1"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x006d
                goto L_0x0047
            L_0x006d:
                r1 = 64
                goto L_0x03d6
            L_0x0071:
                java.lang.String r0 = "virtual.yeelink.light.mijia.ceiling"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x007a
                goto L_0x0047
            L_0x007a:
                r1 = 63
                goto L_0x03d6
            L_0x007e:
                java.lang.String r0 = "yeelink.light.bslamp3"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0087
                goto L_0x0047
            L_0x0087:
                r1 = 62
                goto L_0x03d6
            L_0x008b:
                java.lang.String r0 = "yeelink.light.bslamp2"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0094
                goto L_0x0047
            L_0x0094:
                r1 = 61
                goto L_0x03d6
            L_0x0098:
                java.lang.String r0 = "yeelink.light.bslamp1"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x00a1
                goto L_0x0047
            L_0x00a1:
                r1 = 60
                goto L_0x03d6
            L_0x00a5:
                java.lang.String r0 = "yeelink.light.ml2"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x00ae
                goto L_0x0047
            L_0x00ae:
                r1 = 59
                goto L_0x03d6
            L_0x00b2:
                java.lang.String r0 = "yeelink.light.ml1"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x00bb
                goto L_0x0047
            L_0x00bb:
                r1 = 58
                goto L_0x03d6
            L_0x00bf:
                java.lang.String r0 = "yeelink.light.ceiling8"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x00c9
                goto L_0x0047
            L_0x00c9:
                r1 = 57
                goto L_0x03d6
            L_0x00cd:
                java.lang.String r0 = "yeelink.light.ceiling7"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x00d7
                goto L_0x0047
            L_0x00d7:
                r1 = 56
                goto L_0x03d6
            L_0x00db:
                java.lang.String r0 = "yeelink.light.ceiling6"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x00e5
                goto L_0x0047
            L_0x00e5:
                r1 = 55
                goto L_0x03d6
            L_0x00e9:
                java.lang.String r0 = "yeelink.light.ceiling5"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x00f3
                goto L_0x0047
            L_0x00f3:
                r1 = 54
                goto L_0x03d6
            L_0x00f7:
                java.lang.String r0 = "yeelink.light.ceiling4"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0101
                goto L_0x0047
            L_0x0101:
                r1 = 53
                goto L_0x03d6
            L_0x0105:
                java.lang.String r0 = "yeelink.light.ceiling3"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x010f
                goto L_0x0047
            L_0x010f:
                r1 = 52
                goto L_0x03d6
            L_0x0113:
                java.lang.String r0 = "yeelink.light.ceiling2"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x011d
                goto L_0x0047
            L_0x011d:
                r1 = 51
                goto L_0x03d6
            L_0x0121:
                java.lang.String r0 = "yeelink.light.ceiling1"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x012b
                goto L_0x0047
            L_0x012b:
                r1 = 50
                goto L_0x03d6
            L_0x012f:
                java.lang.String r0 = "yeelink.curtain.ctmt1"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0139
                goto L_0x0047
            L_0x0139:
                r1 = 49
                goto L_0x03d6
            L_0x013d:
                java.lang.String r0 = "virtual.yeelink.light.ceiling"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0147
                goto L_0x0047
            L_0x0147:
                r1 = 48
                goto L_0x03d6
            L_0x014b:
                java.lang.String r0 = "yeelink.gateway.va"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0155
                goto L_0x0047
            L_0x0155:
                r1 = 47
                goto L_0x03d6
            L_0x0159:
                java.lang.String r0 = "yeelink.gateway.v1"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0163
                goto L_0x0047
            L_0x0163:
                r1 = 46
                goto L_0x03d6
            L_0x0167:
                java.lang.String r0 = "yeelink.light.spot1"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0171
                goto L_0x0047
            L_0x0171:
                r1 = 45
                goto L_0x03d6
            L_0x0175:
                java.lang.String r0 = "yeelink.light.ceile"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x017f
                goto L_0x0047
            L_0x017f:
                r1 = 44
                goto L_0x03d6
            L_0x0183:
                java.lang.String r0 = "yeelink.light.ceild"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x018d
                goto L_0x0047
            L_0x018d:
                r1 = 43
                goto L_0x03d6
            L_0x0191:
                java.lang.String r0 = "yeelink.light.ceilc"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x019b
                goto L_0x0047
            L_0x019b:
                r1 = 42
                goto L_0x03d6
            L_0x019f:
                java.lang.String r0 = "yeelink.light.ceilb"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x01a9
                goto L_0x0047
            L_0x01a9:
                r1 = 41
                goto L_0x03d6
            L_0x01ad:
                java.lang.String r0 = "yeelink.light.ceila"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x01b7
                goto L_0x0047
            L_0x01b7:
                r1 = 40
                goto L_0x03d6
            L_0x01bb:
                java.lang.String r0 = "yeelink.light.sp1grp"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x01c5
                goto L_0x0047
            L_0x01c5:
                r1 = 39
                goto L_0x03d6
            L_0x01c9:
                java.lang.String r0 = "yilai.light.ceiling3"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x01d3
                goto L_0x0047
            L_0x01d3:
                r1 = 38
                goto L_0x03d6
            L_0x01d7:
                java.lang.String r0 = "yilai.light.ceiling2"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x01e1
                goto L_0x0047
            L_0x01e1:
                r1 = 37
                goto L_0x03d6
            L_0x01e5:
                java.lang.String r0 = "yilai.light.ceiling1"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x01ef
                goto L_0x0047
            L_0x01ef:
                r1 = 36
                goto L_0x03d6
            L_0x01f3:
                java.lang.String r0 = "yeelink.light.mb2grp"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x01fd
                goto L_0x0047
            L_0x01fd:
                r1 = 35
                goto L_0x03d6
            L_0x0201:
                java.lang.String r0 = "yeelink.light.mb1grp"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x020b
                goto L_0x0047
            L_0x020b:
                r1 = 34
                goto L_0x03d6
            L_0x020f:
                java.lang.String r0 = "yeelink.light.lamp19"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0219
                goto L_0x0047
            L_0x0219:
                r1 = 33
                goto L_0x03d6
            L_0x021d:
                java.lang.String r0 = "yeelink.light.gingko"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0227
                goto L_0x0047
            L_0x0227:
                r1 = 32
                goto L_0x03d6
            L_0x022b:
                java.lang.String r0 = "yeelink.light.fancl6"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0235
                goto L_0x0047
            L_0x0235:
                r1 = 31
                goto L_0x03d6
            L_0x0239:
                java.lang.String r0 = "yeelink.light.fancl5"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0243
                goto L_0x0047
            L_0x0243:
                r1 = 30
                goto L_0x03d6
            L_0x0247:
                java.lang.String r0 = "yeelink.light.fancl2"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0251
                goto L_0x0047
            L_0x0251:
                r1 = 29
                goto L_0x03d6
            L_0x0255:
                java.lang.String r0 = "yeelink.light.fancl1"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x025f
                goto L_0x0047
            L_0x025f:
                r1 = 28
                goto L_0x03d6
            L_0x0263:
                java.lang.String r0 = "yeelink.light.dn2grp"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x026d
                goto L_0x0047
            L_0x026d:
                r1 = 27
                goto L_0x03d6
            L_0x0271:
                java.lang.String r0 = "yeelink.light.ceil35"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x027b
                goto L_0x0047
            L_0x027b:
                r1 = 26
                goto L_0x03d6
            L_0x027f:
                java.lang.String r0 = "yeelink.light.ceil33"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0289
                goto L_0x0047
            L_0x0289:
                r1 = 25
                goto L_0x03d6
            L_0x028d:
                java.lang.String r0 = "yeelink.light.ceil32"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0297
                goto L_0x0047
            L_0x0297:
                r1 = 24
                goto L_0x03d6
            L_0x029b:
                java.lang.String r0 = "yeelink.light.ceil31"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x02a5
                goto L_0x0047
            L_0x02a5:
                r1 = 23
                goto L_0x03d6
            L_0x02a9:
                java.lang.String r0 = "yeelink.light.ceil30"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x02b3
                goto L_0x0047
            L_0x02b3:
                r1 = 22
                goto L_0x03d6
            L_0x02b7:
                java.lang.String r0 = "yeelink.light.ceil29"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x02c1
                goto L_0x0047
            L_0x02c1:
                r1 = 21
                goto L_0x03d6
            L_0x02c5:
                java.lang.String r0 = "yeelink.light.ceil27"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x02cf
                goto L_0x0047
            L_0x02cf:
                r1 = 20
                goto L_0x03d6
            L_0x02d3:
                java.lang.String r0 = "yeelink.light.ceil26"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x02dd
                goto L_0x0047
            L_0x02dd:
                r1 = 19
                goto L_0x03d6
            L_0x02e1:
                java.lang.String r0 = "yeelink.plug.plug"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x02eb
                goto L_0x0047
            L_0x02eb:
                r1 = 18
                goto L_0x03d6
            L_0x02ef:
                java.lang.String r0 = "yeelink.light.ble1"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x02f9
                goto L_0x0047
            L_0x02f9:
                r1 = 17
                goto L_0x03d6
            L_0x02fd:
                java.lang.String r0 = "yeelink.light.ceiling24"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0307
                goto L_0x0047
            L_0x0307:
                r1 = 16
                goto L_0x03d6
            L_0x030b:
                java.lang.String r0 = "yeelink.light.ceiling23"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0315
                goto L_0x0047
            L_0x0315:
                r1 = 15
                goto L_0x03d6
            L_0x0319:
                java.lang.String r0 = "yeelink.light.ceiling22"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0323
                goto L_0x0047
            L_0x0323:
                r1 = 14
                goto L_0x03d6
            L_0x0327:
                java.lang.String r0 = "yeelink.light.ceiling21"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0331
                goto L_0x0047
            L_0x0331:
                r1 = 13
                goto L_0x03d6
            L_0x0335:
                java.lang.String r0 = "yeelink.light.ceiling20"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x033f
                goto L_0x0047
            L_0x033f:
                r1 = 12
                goto L_0x03d6
            L_0x0343:
                java.lang.String r0 = "yeelink.light.ceiling19"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x034d
                goto L_0x0047
            L_0x034d:
                r1 = 11
                goto L_0x03d6
            L_0x0351:
                java.lang.String r0 = "yeelink.light.ceiling18"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x03d6
                goto L_0x0047
            L_0x035b:
                java.lang.String r0 = "yeelink.light.ceiling17"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0365
                goto L_0x0047
            L_0x0365:
                r1 = 9
                goto L_0x03d6
            L_0x0369:
                java.lang.String r0 = "yeelink.light.ceiling16"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0373
                goto L_0x0047
            L_0x0373:
                r1 = 8
                goto L_0x03d6
            L_0x0377:
                java.lang.String r0 = "yeelink.light.ceiling15"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0381
                goto L_0x0047
            L_0x0381:
                r1 = 7
                goto L_0x03d6
            L_0x0383:
                java.lang.String r0 = "yeelink.light.ceiling14"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x038d
                goto L_0x0047
            L_0x038d:
                r1 = 6
                goto L_0x03d6
            L_0x038f:
                java.lang.String r0 = "yeelink.light.ceiling13"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0399
                goto L_0x0047
            L_0x0399:
                r1 = 5
                goto L_0x03d6
            L_0x039b:
                java.lang.String r0 = "yeelink.light.ceiling12"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x03a5
                goto L_0x0047
            L_0x03a5:
                r1 = 4
                goto L_0x03d6
            L_0x03a7:
                java.lang.String r0 = "yeelink.light.ceiling11"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x03b1
                goto L_0x0047
            L_0x03b1:
                r1 = 3
                goto L_0x03d6
            L_0x03b3:
                java.lang.String r0 = "yeelink.light.ceiling10"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x03bd
                goto L_0x0047
            L_0x03bd:
                r1 = 2
                goto L_0x03d6
            L_0x03bf:
                java.lang.String r0 = "yeelink.switch.sw1"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x03c9
                goto L_0x0047
            L_0x03c9:
                r1 = 1
                goto L_0x03d6
            L_0x03cb:
                java.lang.String r0 = "yeelink.bhf_light.v1"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x03d5
                goto L_0x0047
            L_0x03d5:
                r1 = 0
            L_0x03d6:
                switch(r1) {
                    case 0: goto L_0x03e4;
                    case 1: goto L_0x03e4;
                    case 2: goto L_0x03e4;
                    case 3: goto L_0x03e4;
                    case 4: goto L_0x03e4;
                    case 5: goto L_0x03e4;
                    case 6: goto L_0x03e4;
                    case 7: goto L_0x03e4;
                    case 8: goto L_0x03e4;
                    case 9: goto L_0x03e4;
                    case 10: goto L_0x03e4;
                    case 11: goto L_0x03e4;
                    case 12: goto L_0x03e4;
                    case 13: goto L_0x03e4;
                    case 14: goto L_0x03e4;
                    case 15: goto L_0x03e4;
                    case 16: goto L_0x03e4;
                    case 17: goto L_0x03da;
                    case 18: goto L_0x03e4;
                    case 19: goto L_0x03e4;
                    case 20: goto L_0x03e4;
                    case 21: goto L_0x03e4;
                    case 22: goto L_0x03e4;
                    case 23: goto L_0x03e4;
                    case 24: goto L_0x03e4;
                    case 25: goto L_0x03e4;
                    case 26: goto L_0x03e4;
                    case 27: goto L_0x03da;
                    case 28: goto L_0x03e4;
                    case 29: goto L_0x03e4;
                    case 30: goto L_0x03e4;
                    case 31: goto L_0x03e4;
                    case 32: goto L_0x03da;
                    case 33: goto L_0x03e4;
                    case 34: goto L_0x03da;
                    case 35: goto L_0x03da;
                    case 36: goto L_0x03e4;
                    case 37: goto L_0x03e4;
                    case 38: goto L_0x03e4;
                    case 39: goto L_0x03da;
                    case 40: goto L_0x03e4;
                    case 41: goto L_0x03e4;
                    case 42: goto L_0x03e4;
                    case 43: goto L_0x03e4;
                    case 44: goto L_0x03e4;
                    case 45: goto L_0x03da;
                    case 46: goto L_0x03e4;
                    case 47: goto L_0x03e4;
                    case 48: goto L_0x03e4;
                    case 49: goto L_0x03e4;
                    case 50: goto L_0x03e4;
                    case 51: goto L_0x03e4;
                    case 52: goto L_0x03e4;
                    case 53: goto L_0x03e4;
                    case 54: goto L_0x03e4;
                    case 55: goto L_0x03e4;
                    case 56: goto L_0x03e4;
                    case 57: goto L_0x03e4;
                    case 58: goto L_0x03da;
                    case 59: goto L_0x03da;
                    case 60: goto L_0x03e4;
                    case 61: goto L_0x03e4;
                    case 62: goto L_0x03e4;
                    case 63: goto L_0x03e4;
                    case 64: goto L_0x03da;
                    case 65: goto L_0x03da;
                    case 66: goto L_0x03da;
                    default: goto L_0x03d9;
                }
            L_0x03d9:
                goto L_0x0415
            L_0x03da:
                com.yeelight.cherry.ui.activity.ProductListActivity r4 = com.yeelight.cherry.p141ui.activity.ProductListActivity.this
                com.yeelight.yeelib.models.ProductInfo r5 = r4.f11167f
                r4.m16889d0(r5)
                goto L_0x0415
            L_0x03e4:
                com.yeelight.yeelib.managers.e r4 = com.yeelight.yeelib.managers.C8272e.m19511b()
                boolean r4 = r4.mo35205e()
                if (r4 == 0) goto L_0x03f8
                com.yeelight.cherry.ui.activity.ProductListActivity r4 = com.yeelight.cherry.p141ui.activity.ProductListActivity.this
                com.yeelight.yeelib.models.ProductInfo r5 = r4.f11167f
                r4.m16891f0(r5)
                goto L_0x0415
            L_0x03f8:
                com.yeelight.cherry.ui.activity.ProductListActivity r4 = com.yeelight.cherry.p141ui.activity.ProductListActivity.this
                r4.m16892g0()
                goto L_0x0415
            L_0x03fe:
                int r4 = r5.getIntExtra(r0, r1)
                if (r4 != r1) goto L_0x0415
                com.yeelight.cherry.ui.activity.ProductListActivity r4 = com.yeelight.cherry.p141ui.activity.ProductListActivity.this
                android.app.ProgressDialog r4 = r4.f11164c
                if (r4 == 0) goto L_0x0415
                com.yeelight.cherry.ui.activity.ProductListActivity r4 = com.yeelight.cherry.p141ui.activity.ProductListActivity.this
                android.app.ProgressDialog r4 = r4.f11164c
                r4.dismiss()
            L_0x0415:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.activity.ProductListActivity.C5593a.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ProductListActivity$b */
    class C5594b extends BroadcastReceiver {
        C5594b() {
        }

        public void onReceive(Context context, Intent intent) {
            if (ProductListActivity.this.f11167f != null) {
                int intExtra = intent.getIntExtra("wifi_state", 0);
                if (intExtra == 3) {
                    if (ProductListActivity.this.f11164c != null) {
                        ProductListActivity.this.f11164c.dismiss();
                    }
                    ProductListActivity productListActivity = ProductListActivity.this;
                    productListActivity.m16891f0(productListActivity.f11167f);
                } else if (intExtra == 1 && ProductListActivity.this.f11164c != null) {
                    ProductListActivity.this.f11164c.dismiss();
                }
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ProductListActivity$c */
    class C5595c implements View.OnClickListener {
        C5595c() {
        }

        public void onClick(View view) {
            ProductListActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ProductListActivity$d */
    class C5596d implements ProductListAdapter.C5900b {
        C5596d() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:329:0x05f8, code lost:
            r8.f11175a.startActivity(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:332:0x0615, code lost:
            r8.f11175a.startActivity(r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:338:0x0650, code lost:
            if (com.yeelight.yeelib.managers.C8272e.m19511b().mo35205e() != false) goto L_0x0652;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:339:0x0652, code lost:
            com.yeelight.cherry.p141ui.activity.ProductListActivity.m16885Z(r8.f11175a, r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:340:0x0658, code lost:
            com.yeelight.cherry.p141ui.activity.ProductListActivity.m16886a0(r8.f11175a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:342:0x0666, code lost:
            if (com.yeelight.yeelib.managers.C8272e.m19511b().mo35203c() != false) goto L_0x0652;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:343:0x0669, code lost:
            com.yeelight.cherry.p141ui.activity.ProductListActivity.m16887b0(r8.f11175a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:347:0x0681, code lost:
            if (com.yeelight.yeelib.managers.C8272e.m19511b().mo35205e() != false) goto L_0x0652;
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
        /* JADX WARNING: Code restructure failed: missing block: B:352:?, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo30812a(int r9, com.yeelight.yeelib.models.ProductInfo r10) {
            /*
                r8 = this;
                java.lang.Class<com.yeelight.cherry.ui.activity.CreateGroupNameActivity> r9 = com.yeelight.cherry.p141ui.activity.CreateGroupNameActivity.class
                com.yeelight.cherry.ui.activity.ProductListActivity r0 = com.yeelight.cherry.p141ui.activity.ProductListActivity.this
                com.yeelight.yeelib.models.ProductInfo unused = r0.f11167f = r10
                java.lang.String r0 = r10.getProductModel()
                r0.hashCode()
                int r1 = r0.hashCode()
                java.lang.String r2 = "yeelink.light.sp1grp"
                java.lang.String r3 = "yeelink.light.mb2grp"
                java.lang.String r4 = "yeelink.light.mb1grp"
                java.lang.String r5 = "yeelink.light.dn2grp"
                r6 = 1
                r7 = -1
                switch(r1) {
                    case -1644531059: goto L_0x05de;
                    case -1494338802: goto L_0x05d3;
                    case -1462015191: goto L_0x05c8;
                    case -1462015190: goto L_0x05bd;
                    case -1462015189: goto L_0x05b2;
                    case -1462015188: goto L_0x05a7;
                    case -1462015187: goto L_0x059c;
                    case -1462015186: goto L_0x0591;
                    case -1462015185: goto L_0x0583;
                    case -1462015184: goto L_0x0575;
                    case -1462015183: goto L_0x0567;
                    case -1462015182: goto L_0x0559;
                    case -1462015160: goto L_0x054b;
                    case -1462015159: goto L_0x053d;
                    case -1462015158: goto L_0x052f;
                    case -1462015157: goto L_0x0521;
                    case -1462015156: goto L_0x0513;
                    case -1400275319: goto L_0x0505;
                    case -1350780909: goto L_0x04f7;
                    case -1317475940: goto L_0x04e9;
                    case -1317475939: goto L_0x04db;
                    case -1317475915: goto L_0x04cd;
                    case -1317475914: goto L_0x04bf;
                    case -1317475913: goto L_0x04b1;
                    case -1317475912: goto L_0x04a3;
                    case -1317475910: goto L_0x0495;
                    case -1308146495: goto L_0x0487;
                    case -1308146494: goto L_0x0479;
                    case -1308146493: goto L_0x046b;
                    case -1308146492: goto L_0x045d;
                    case -1308146491: goto L_0x044f;
                    case -1308146490: goto L_0x0441;
                    case -1308146488: goto L_0x0433;
                    case -1308146447: goto L_0x0425;
                    case -1308146446: goto L_0x0417;
                    case -1308146445: goto L_0x0409;
                    case -1308146443: goto L_0x03fb;
                    case -1282176368: goto L_0x03ef;
                    case -1235140472: goto L_0x03e1;
                    case -1235140471: goto L_0x03d3;
                    case -1235140468: goto L_0x03c5;
                    case -1235140467: goto L_0x03b7;
                    case -1199119278: goto L_0x03a9;
                    case -1119332198: goto L_0x039b;
                    case -1063384694: goto L_0x038d;
                    case -1063384689: goto L_0x037f;
                    case -1063384687: goto L_0x0371;
                    case -1063384685: goto L_0x0363;
                    case -1035626052: goto L_0x0357;
                    case -1035596261: goto L_0x034b;
                    case -948847040: goto L_0x033d;
                    case -948847038: goto L_0x032f;
                    case -939061393: goto L_0x0321;
                    case -888668266: goto L_0x0313;
                    case -888668265: goto L_0x0305;
                    case -888668264: goto L_0x02f7;
                    case -850921852: goto L_0x02eb;
                    case -845289556: goto L_0x02dd;
                    case -845289555: goto L_0x02cf;
                    case -845289553: goto L_0x02c1;
                    case -845289551: goto L_0x02b3;
                    case -845289549: goto L_0x02a5;
                    case -845289508: goto L_0x0297;
                    case -458141175: goto L_0x0289;
                    case -458141172: goto L_0x027b;
                    case -458141171: goto L_0x026d;
                    case -454053748: goto L_0x025f;
                    case -449944730: goto L_0x0251;
                    case -449944729: goto L_0x0243;
                    case -449944728: goto L_0x0235;
                    case -449944727: goto L_0x0227;
                    case -449944726: goto L_0x0219;
                    case -449944724: goto L_0x020b;
                    case -449944723: goto L_0x01fd;
                    case -449944722: goto L_0x01ef;
                    case -448603205: goto L_0x01e1;
                    case -448603202: goto L_0x01d3;
                    case -448603201: goto L_0x01c5;
                    case -448603157: goto L_0x01b7;
                    case -448603156: goto L_0x01a9;
                    case -443031172: goto L_0x019b;
                    case -190173984: goto L_0x018d;
                    case -190173936: goto L_0x017f;
                    case 174464231: goto L_0x0171;
                    case 250266083: goto L_0x0163;
                    case 674030242: goto L_0x0155;
                    case 922669543: goto L_0x0147;
                    case 922669544: goto L_0x0139;
                    case 922669545: goto L_0x012b;
                    case 922669546: goto L_0x011d;
                    case 922669547: goto L_0x010f;
                    case 922669548: goto L_0x0101;
                    case 922669549: goto L_0x00f3;
                    case 922669550: goto L_0x00e5;
                    case 922669551: goto L_0x00d7;
                    case 1201756974: goto L_0x00c9;
                    case 1201757021: goto L_0x00bb;
                    case 1201757023: goto L_0x00ad;
                    case 1201766335: goto L_0x009f;
                    case 1201766336: goto L_0x0091;
                    case 1557976171: goto L_0x0083;
                    case 1623724661: goto L_0x0075;
                    case 1623724662: goto L_0x0067;
                    case 1623724663: goto L_0x0059;
                    case 2086270815: goto L_0x004b;
                    case 2102612488: goto L_0x003d;
                    case 2102612489: goto L_0x002f;
                    case 2146130361: goto L_0x0021;
                    default: goto L_0x001f;
                }
            L_0x001f:
                goto L_0x05e8
            L_0x0021:
                java.lang.String r1 = "yeelink.light.dnlight2"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x002b
                goto L_0x05e8
            L_0x002b:
                r7 = 107(0x6b, float:1.5E-43)
                goto L_0x05e8
            L_0x002f:
                java.lang.String r1 = "yeelink.light.meshbulb2"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0039
                goto L_0x05e8
            L_0x0039:
                r7 = 106(0x6a, float:1.49E-43)
                goto L_0x05e8
            L_0x003d:
                java.lang.String r1 = "yeelink.light.meshbulb1"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0047
                goto L_0x05e8
            L_0x0047:
                r7 = 105(0x69, float:1.47E-43)
                goto L_0x05e8
            L_0x004b:
                java.lang.String r1 = "virtual.yeelink.light.mijia.ceiling"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0055
                goto L_0x05e8
            L_0x0055:
                r7 = 104(0x68, float:1.46E-43)
                goto L_0x05e8
            L_0x0059:
                java.lang.String r1 = "yeelink.light.bslamp3"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0063
                goto L_0x05e8
            L_0x0063:
                r7 = 103(0x67, float:1.44E-43)
                goto L_0x05e8
            L_0x0067:
                java.lang.String r1 = "yeelink.light.bslamp2"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0071
                goto L_0x05e8
            L_0x0071:
                r7 = 102(0x66, float:1.43E-43)
                goto L_0x05e8
            L_0x0075:
                java.lang.String r1 = "yeelink.light.bslamp1"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x007f
                goto L_0x05e8
            L_0x007f:
                r7 = 101(0x65, float:1.42E-43)
                goto L_0x05e8
            L_0x0083:
                java.lang.String r1 = "yeelink.light.glcolor"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x008d
                goto L_0x05e8
            L_0x008d:
                r7 = 100
                goto L_0x05e8
            L_0x0091:
                java.lang.String r1 = "yeelink.light.ml2"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x009b
                goto L_0x05e8
            L_0x009b:
                r7 = 99
                goto L_0x05e8
            L_0x009f:
                java.lang.String r1 = "yeelink.light.ml1"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x00a9
                goto L_0x05e8
            L_0x00a9:
                r7 = 98
                goto L_0x05e8
            L_0x00ad:
                java.lang.String r1 = "yeelink.light.ctc"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x00b7
                goto L_0x05e8
            L_0x00b7:
                r7 = 97
                goto L_0x05e8
            L_0x00bb:
                java.lang.String r1 = "yeelink.light.cta"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x00c5
                goto L_0x05e8
            L_0x00c5:
                r7 = 96
                goto L_0x05e8
            L_0x00c9:
                java.lang.String r1 = "yeelink.light.ct2"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x00d3
                goto L_0x05e8
            L_0x00d3:
                r7 = 95
                goto L_0x05e8
            L_0x00d7:
                java.lang.String r1 = "yeelink.light.ceiling9"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x00e1
                goto L_0x05e8
            L_0x00e1:
                r7 = 94
                goto L_0x05e8
            L_0x00e5:
                java.lang.String r1 = "yeelink.light.ceiling8"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x00ef
                goto L_0x05e8
            L_0x00ef:
                r7 = 93
                goto L_0x05e8
            L_0x00f3:
                java.lang.String r1 = "yeelink.light.ceiling7"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x00fd
                goto L_0x05e8
            L_0x00fd:
                r7 = 92
                goto L_0x05e8
            L_0x0101:
                java.lang.String r1 = "yeelink.light.ceiling6"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x010b
                goto L_0x05e8
            L_0x010b:
                r7 = 91
                goto L_0x05e8
            L_0x010f:
                java.lang.String r1 = "yeelink.light.ceiling5"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0119
                goto L_0x05e8
            L_0x0119:
                r7 = 90
                goto L_0x05e8
            L_0x011d:
                java.lang.String r1 = "yeelink.light.ceiling4"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0127
                goto L_0x05e8
            L_0x0127:
                r7 = 89
                goto L_0x05e8
            L_0x012b:
                java.lang.String r1 = "yeelink.light.ceiling3"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0135
                goto L_0x05e8
            L_0x0135:
                r7 = 88
                goto L_0x05e8
            L_0x0139:
                java.lang.String r1 = "yeelink.light.ceiling2"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0143
                goto L_0x05e8
            L_0x0143:
                r7 = 87
                goto L_0x05e8
            L_0x0147:
                java.lang.String r1 = "yeelink.light.ceiling1"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0151
                goto L_0x05e8
            L_0x0151:
                r7 = 86
                goto L_0x05e8
            L_0x0155:
                java.lang.String r1 = "yeelink.curtain.ctmt1"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x015f
                goto L_0x05e8
            L_0x015f:
                r7 = 85
                goto L_0x05e8
            L_0x0163:
                java.lang.String r1 = "yeelink.light.gingko.group"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x016d
                goto L_0x05e8
            L_0x016d:
                r7 = 84
                goto L_0x05e8
            L_0x0171:
                java.lang.String r1 = "virtual.yeelink.light.ceiling"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x017b
                goto L_0x05e8
            L_0x017b:
                r7 = 83
                goto L_0x05e8
            L_0x017f:
                java.lang.String r1 = "yeelink.gateway.va"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0189
                goto L_0x05e8
            L_0x0189:
                r7 = 82
                goto L_0x05e8
            L_0x018d:
                java.lang.String r1 = "yeelink.gateway.v1"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0197
                goto L_0x05e8
            L_0x0197:
                r7 = 81
                goto L_0x05e8
            L_0x019b:
                java.lang.String r1 = "yeelink.light.spot1"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x01a5
                goto L_0x05e8
            L_0x01a5:
                r7 = 80
                goto L_0x05e8
            L_0x01a9:
                java.lang.String r1 = "yeelink.light.monob"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x01b3
                goto L_0x05e8
            L_0x01b3:
                r7 = 79
                goto L_0x05e8
            L_0x01b7:
                java.lang.String r1 = "yeelink.light.monoa"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x01c1
                goto L_0x05e8
            L_0x01c1:
                r7 = 78
                goto L_0x05e8
            L_0x01c5:
                java.lang.String r1 = "yeelink.light.mono5"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x01cf
                goto L_0x05e8
            L_0x01cf:
                r7 = 77
                goto L_0x05e8
            L_0x01d3:
                java.lang.String r1 = "yeelink.light.mono4"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x01dd
                goto L_0x05e8
            L_0x01dd:
                r7 = 76
                goto L_0x05e8
            L_0x01e1:
                java.lang.String r1 = "yeelink.light.mono1"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x01eb
                goto L_0x05e8
            L_0x01eb:
                r7 = 75
                goto L_0x05e8
            L_0x01ef:
                java.lang.String r1 = "yeelink.light.lamp9"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x01f9
                goto L_0x05e8
            L_0x01f9:
                r7 = 74
                goto L_0x05e8
            L_0x01fd:
                java.lang.String r1 = "yeelink.light.lamp8"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0207
                goto L_0x05e8
            L_0x0207:
                r7 = 73
                goto L_0x05e8
            L_0x020b:
                java.lang.String r1 = "yeelink.light.lamp7"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0215
                goto L_0x05e8
            L_0x0215:
                r7 = 72
                goto L_0x05e8
            L_0x0219:
                java.lang.String r1 = "yeelink.light.lamp5"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0223
                goto L_0x05e8
            L_0x0223:
                r7 = 71
                goto L_0x05e8
            L_0x0227:
                java.lang.String r1 = "yeelink.light.lamp4"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0231
                goto L_0x05e8
            L_0x0231:
                r7 = 70
                goto L_0x05e8
            L_0x0235:
                java.lang.String r1 = "yeelink.light.lamp3"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x023f
                goto L_0x05e8
            L_0x023f:
                r7 = 69
                goto L_0x05e8
            L_0x0243:
                java.lang.String r1 = "yeelink.light.lamp2"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x024d
                goto L_0x05e8
            L_0x024d:
                r7 = 68
                goto L_0x05e8
            L_0x0251:
                java.lang.String r1 = "yeelink.light.lamp1"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x025b
                goto L_0x05e8
            L_0x025b:
                r7 = 67
                goto L_0x05e8
            L_0x025f:
                java.lang.String r1 = "yeelink.light.group"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0269
                goto L_0x05e8
            L_0x0269:
                r7 = 66
                goto L_0x05e8
            L_0x026d:
                java.lang.String r1 = "yeelink.light.ceile"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0277
                goto L_0x05e8
            L_0x0277:
                r7 = 65
                goto L_0x05e8
            L_0x027b:
                java.lang.String r1 = "yeelink.light.ceild"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0285
                goto L_0x05e8
            L_0x0285:
                r7 = 64
                goto L_0x05e8
            L_0x0289:
                java.lang.String r1 = "yeelink.light.ceila"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0293
                goto L_0x05e8
            L_0x0293:
                r7 = 63
                goto L_0x05e8
            L_0x0297:
                java.lang.String r1 = "yeelink.light.stripa"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x02a1
                goto L_0x05e8
            L_0x02a1:
                r7 = 62
                goto L_0x05e8
            L_0x02a5:
                java.lang.String r1 = "yeelink.light.strip8"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x02af
                goto L_0x05e8
            L_0x02af:
                r7 = 61
                goto L_0x05e8
            L_0x02b3:
                java.lang.String r1 = "yeelink.light.strip6"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x02bd
                goto L_0x05e8
            L_0x02bd:
                r7 = 60
                goto L_0x05e8
            L_0x02c1:
                java.lang.String r1 = "yeelink.light.strip4"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x02cb
                goto L_0x05e8
            L_0x02cb:
                r7 = 59
                goto L_0x05e8
            L_0x02cf:
                java.lang.String r1 = "yeelink.light.strip2"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x02d9
                goto L_0x05e8
            L_0x02d9:
                r7 = 58
                goto L_0x05e8
            L_0x02dd:
                java.lang.String r1 = "yeelink.light.strip1"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x02e7
                goto L_0x05e8
            L_0x02e7:
                r7 = 57
                goto L_0x05e8
            L_0x02eb:
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x02f3
                goto L_0x05e8
            L_0x02f3:
                r7 = 56
                goto L_0x05e8
            L_0x02f7:
                java.lang.String r1 = "yilai.light.ceiling3"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0301
                goto L_0x05e8
            L_0x0301:
                r7 = 55
                goto L_0x05e8
            L_0x0305:
                java.lang.String r1 = "yilai.light.ceiling2"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x030f
                goto L_0x05e8
            L_0x030f:
                r7 = 54
                goto L_0x05e8
            L_0x0313:
                java.lang.String r1 = "yilai.light.ceiling1"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x031d
                goto L_0x05e8
            L_0x031d:
                r7 = 53
                goto L_0x05e8
            L_0x0321:
                java.lang.String r1 = "yeelink.light.plate2"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x032b
                goto L_0x05e8
            L_0x032b:
                r7 = 52
                goto L_0x05e8
            L_0x032f:
                java.lang.String r1 = "yeelink.light.panel3"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0339
                goto L_0x05e8
            L_0x0339:
                r7 = 51
                goto L_0x05e8
            L_0x033d:
                java.lang.String r1 = "yeelink.light.panel1"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0347
                goto L_0x05e8
            L_0x0347:
                r7 = 50
                goto L_0x05e8
            L_0x034b:
                boolean r0 = r0.equals(r3)
                if (r0 != 0) goto L_0x0353
                goto L_0x05e8
            L_0x0353:
                r7 = 49
                goto L_0x05e8
            L_0x0357:
                boolean r0 = r0.equals(r4)
                if (r0 != 0) goto L_0x035f
                goto L_0x05e8
            L_0x035f:
                r7 = 48
                goto L_0x05e8
            L_0x0363:
                java.lang.String r1 = "yeelink.light.lamp19"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x036d
                goto L_0x05e8
            L_0x036d:
                r7 = 47
                goto L_0x05e8
            L_0x0371:
                java.lang.String r1 = "yeelink.light.lamp17"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x037b
                goto L_0x05e8
            L_0x037b:
                r7 = 46
                goto L_0x05e8
            L_0x037f:
                java.lang.String r1 = "yeelink.light.lamp15"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0389
                goto L_0x05e8
            L_0x0389:
                r7 = 45
                goto L_0x05e8
            L_0x038d:
                java.lang.String r1 = "yeelink.light.lamp10"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0397
                goto L_0x05e8
            L_0x0397:
                r7 = 44
                goto L_0x05e8
            L_0x039b:
                java.lang.String r1 = "yeelink.wifispeaker.v1"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x03a5
                goto L_0x05e8
            L_0x03a5:
                r7 = 43
                goto L_0x05e8
            L_0x03a9:
                java.lang.String r1 = "yeelink.light.gingko"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x03b3
                goto L_0x05e8
            L_0x03b3:
                r7 = 42
                goto L_0x05e8
            L_0x03b7:
                java.lang.String r1 = "yeelink.light.fancl6"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x03c1
                goto L_0x05e8
            L_0x03c1:
                r7 = 41
                goto L_0x05e8
            L_0x03c5:
                java.lang.String r1 = "yeelink.light.fancl5"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x03cf
                goto L_0x05e8
            L_0x03cf:
                r7 = 40
                goto L_0x05e8
            L_0x03d3:
                java.lang.String r1 = "yeelink.light.fancl2"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x03dd
                goto L_0x05e8
            L_0x03dd:
                r7 = 39
                goto L_0x05e8
            L_0x03e1:
                java.lang.String r1 = "yeelink.light.fancl1"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x03eb
                goto L_0x05e8
            L_0x03eb:
                r7 = 38
                goto L_0x05e8
            L_0x03ef:
                boolean r0 = r0.equals(r5)
                if (r0 != 0) goto L_0x03f7
                goto L_0x05e8
            L_0x03f7:
                r7 = 37
                goto L_0x05e8
            L_0x03fb:
                java.lang.String r1 = "yeelink.light.colore"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0405
                goto L_0x05e8
            L_0x0405:
                r7 = 36
                goto L_0x05e8
            L_0x0409:
                java.lang.String r1 = "yeelink.light.colorc"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0413
                goto L_0x05e8
            L_0x0413:
                r7 = 35
                goto L_0x05e8
            L_0x0417:
                java.lang.String r1 = "yeelink.light.colorb"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0421
                goto L_0x05e8
            L_0x0421:
                r7 = 34
                goto L_0x05e8
            L_0x0425:
                java.lang.String r1 = "yeelink.light.colora"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x042f
                goto L_0x05e8
            L_0x042f:
                r7 = 33
                goto L_0x05e8
            L_0x0433:
                java.lang.String r1 = "yeelink.light.color8"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x043d
                goto L_0x05e8
            L_0x043d:
                r7 = 32
                goto L_0x05e8
            L_0x0441:
                java.lang.String r1 = "yeelink.light.color6"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x044b
                goto L_0x05e8
            L_0x044b:
                r7 = 31
                goto L_0x05e8
            L_0x044f:
                java.lang.String r1 = "yeelink.light.color5"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0459
                goto L_0x05e8
            L_0x0459:
                r7 = 30
                goto L_0x05e8
            L_0x045d:
                java.lang.String r1 = "yeelink.light.color4"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0467
                goto L_0x05e8
            L_0x0467:
                r7 = 29
                goto L_0x05e8
            L_0x046b:
                java.lang.String r1 = "yeelink.light.color3"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0475
                goto L_0x05e8
            L_0x0475:
                r7 = 28
                goto L_0x05e8
            L_0x0479:
                java.lang.String r1 = "yeelink.light.color2"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0483
                goto L_0x05e8
            L_0x0483:
                r7 = 27
                goto L_0x05e8
            L_0x0487:
                java.lang.String r1 = "yeelink.light.color1"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0491
                goto L_0x05e8
            L_0x0491:
                r7 = 26
                goto L_0x05e8
            L_0x0495:
                java.lang.String r1 = "yeelink.light.ceil35"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x049f
                goto L_0x05e8
            L_0x049f:
                r7 = 25
                goto L_0x05e8
            L_0x04a3:
                java.lang.String r1 = "yeelink.light.ceil33"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x04ad
                goto L_0x05e8
            L_0x04ad:
                r7 = 24
                goto L_0x05e8
            L_0x04b1:
                java.lang.String r1 = "yeelink.light.ceil32"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x04bb
                goto L_0x05e8
            L_0x04bb:
                r7 = 23
                goto L_0x05e8
            L_0x04bf:
                java.lang.String r1 = "yeelink.light.ceil31"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x04c9
                goto L_0x05e8
            L_0x04c9:
                r7 = 22
                goto L_0x05e8
            L_0x04cd:
                java.lang.String r1 = "yeelink.light.ceil30"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x04d7
                goto L_0x05e8
            L_0x04d7:
                r7 = 21
                goto L_0x05e8
            L_0x04db:
                java.lang.String r1 = "yeelink.light.ceil27"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x04e5
                goto L_0x05e8
            L_0x04e5:
                r7 = 20
                goto L_0x05e8
            L_0x04e9:
                java.lang.String r1 = "yeelink.light.ceil26"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x04f3
                goto L_0x05e8
            L_0x04f3:
                r7 = 19
                goto L_0x05e8
            L_0x04f7:
                java.lang.String r1 = "yeelink.plug.plug"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0501
                goto L_0x05e8
            L_0x0501:
                r7 = 18
                goto L_0x05e8
            L_0x0505:
                java.lang.String r1 = "yeelink.light.ble1"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x050f
                goto L_0x05e8
            L_0x050f:
                r7 = 17
                goto L_0x05e8
            L_0x0513:
                java.lang.String r1 = "yeelink.light.ceiling24"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x051d
                goto L_0x05e8
            L_0x051d:
                r7 = 16
                goto L_0x05e8
            L_0x0521:
                java.lang.String r1 = "yeelink.light.ceiling23"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x052b
                goto L_0x05e8
            L_0x052b:
                r7 = 15
                goto L_0x05e8
            L_0x052f:
                java.lang.String r1 = "yeelink.light.ceiling22"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0539
                goto L_0x05e8
            L_0x0539:
                r7 = 14
                goto L_0x05e8
            L_0x053d:
                java.lang.String r1 = "yeelink.light.ceiling21"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0547
                goto L_0x05e8
            L_0x0547:
                r7 = 13
                goto L_0x05e8
            L_0x054b:
                java.lang.String r1 = "yeelink.light.ceiling20"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0555
                goto L_0x05e8
            L_0x0555:
                r7 = 12
                goto L_0x05e8
            L_0x0559:
                java.lang.String r1 = "yeelink.light.ceiling19"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0563
                goto L_0x05e8
            L_0x0563:
                r7 = 11
                goto L_0x05e8
            L_0x0567:
                java.lang.String r1 = "yeelink.light.ceiling18"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0571
                goto L_0x05e8
            L_0x0571:
                r7 = 10
                goto L_0x05e8
            L_0x0575:
                java.lang.String r1 = "yeelink.light.ceiling17"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x057f
                goto L_0x05e8
            L_0x057f:
                r7 = 9
                goto L_0x05e8
            L_0x0583:
                java.lang.String r1 = "yeelink.light.ceiling16"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x058d
                goto L_0x05e8
            L_0x058d:
                r7 = 8
                goto L_0x05e8
            L_0x0591:
                java.lang.String r1 = "yeelink.light.ceiling15"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x059a
                goto L_0x05e8
            L_0x059a:
                r7 = 7
                goto L_0x05e8
            L_0x059c:
                java.lang.String r1 = "yeelink.light.ceiling14"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x05a5
                goto L_0x05e8
            L_0x05a5:
                r7 = 6
                goto L_0x05e8
            L_0x05a7:
                java.lang.String r1 = "yeelink.light.ceiling13"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x05b0
                goto L_0x05e8
            L_0x05b0:
                r7 = 5
                goto L_0x05e8
            L_0x05b2:
                java.lang.String r1 = "yeelink.light.ceiling12"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x05bb
                goto L_0x05e8
            L_0x05bb:
                r7 = 4
                goto L_0x05e8
            L_0x05bd:
                java.lang.String r1 = "yeelink.light.ceiling11"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x05c6
                goto L_0x05e8
            L_0x05c6:
                r7 = 3
                goto L_0x05e8
            L_0x05c8:
                java.lang.String r1 = "yeelink.light.ceiling10"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x05d1
                goto L_0x05e8
            L_0x05d1:
                r7 = 2
                goto L_0x05e8
            L_0x05d3:
                java.lang.String r1 = "yeelink.switch.sw1"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x05dc
                goto L_0x05e8
            L_0x05dc:
                r7 = 1
                goto L_0x05e8
            L_0x05de:
                java.lang.String r1 = "yeelink.bhf_light.v1"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x05e7
                goto L_0x05e8
            L_0x05e7:
                r7 = 0
            L_0x05e8:
                java.lang.String r0 = "type_group"
                switch(r7) {
                    case 0: goto L_0x066f;
                    case 1: goto L_0x066f;
                    case 2: goto L_0x066f;
                    case 3: goto L_0x066f;
                    case 4: goto L_0x066f;
                    case 5: goto L_0x066f;
                    case 6: goto L_0x066f;
                    case 7: goto L_0x066f;
                    case 8: goto L_0x066f;
                    case 9: goto L_0x066f;
                    case 10: goto L_0x066f;
                    case 11: goto L_0x066f;
                    case 12: goto L_0x066f;
                    case 13: goto L_0x066f;
                    case 14: goto L_0x066f;
                    case 15: goto L_0x066f;
                    case 16: goto L_0x066f;
                    case 17: goto L_0x065e;
                    case 18: goto L_0x066f;
                    case 19: goto L_0x066f;
                    case 20: goto L_0x066f;
                    case 21: goto L_0x066f;
                    case 22: goto L_0x066f;
                    case 23: goto L_0x066f;
                    case 24: goto L_0x066f;
                    case 25: goto L_0x066f;
                    case 26: goto L_0x0648;
                    case 27: goto L_0x0648;
                    case 28: goto L_0x0648;
                    case 29: goto L_0x0648;
                    case 30: goto L_0x0648;
                    case 31: goto L_0x0648;
                    case 32: goto L_0x0648;
                    case 33: goto L_0x0648;
                    case 34: goto L_0x0648;
                    case 35: goto L_0x0648;
                    case 36: goto L_0x0648;
                    case 37: goto L_0x063d;
                    case 38: goto L_0x066f;
                    case 39: goto L_0x066f;
                    case 40: goto L_0x066f;
                    case 41: goto L_0x066f;
                    case 42: goto L_0x065e;
                    case 43: goto L_0x066f;
                    case 44: goto L_0x066f;
                    case 45: goto L_0x0648;
                    case 46: goto L_0x0648;
                    case 47: goto L_0x066f;
                    case 48: goto L_0x0632;
                    case 49: goto L_0x0627;
                    case 50: goto L_0x066f;
                    case 51: goto L_0x066f;
                    case 52: goto L_0x0648;
                    case 53: goto L_0x066f;
                    case 54: goto L_0x066f;
                    case 55: goto L_0x066f;
                    case 56: goto L_0x061c;
                    case 57: goto L_0x0648;
                    case 58: goto L_0x0648;
                    case 59: goto L_0x066f;
                    case 60: goto L_0x0648;
                    case 61: goto L_0x0648;
                    case 62: goto L_0x0648;
                    case 63: goto L_0x066f;
                    case 64: goto L_0x066f;
                    case 65: goto L_0x066f;
                    case 66: goto L_0x060e;
                    case 67: goto L_0x0648;
                    case 68: goto L_0x066f;
                    case 69: goto L_0x0648;
                    case 70: goto L_0x066f;
                    case 71: goto L_0x0648;
                    case 72: goto L_0x066f;
                    case 73: goto L_0x066f;
                    case 74: goto L_0x066f;
                    case 75: goto L_0x0648;
                    case 76: goto L_0x066f;
                    case 77: goto L_0x066f;
                    case 78: goto L_0x0648;
                    case 79: goto L_0x066f;
                    case 80: goto L_0x066f;
                    case 81: goto L_0x0648;
                    case 82: goto L_0x0648;
                    case 83: goto L_0x066f;
                    case 84: goto L_0x05ff;
                    case 85: goto L_0x066f;
                    case 86: goto L_0x066f;
                    case 87: goto L_0x066f;
                    case 88: goto L_0x066f;
                    case 89: goto L_0x066f;
                    case 90: goto L_0x066f;
                    case 91: goto L_0x066f;
                    case 92: goto L_0x066f;
                    case 93: goto L_0x066f;
                    case 94: goto L_0x066f;
                    case 95: goto L_0x0648;
                    case 96: goto L_0x0648;
                    case 97: goto L_0x0648;
                    case 98: goto L_0x066f;
                    case 99: goto L_0x066f;
                    case 100: goto L_0x05ef;
                    case 101: goto L_0x066f;
                    case 102: goto L_0x066f;
                    case 103: goto L_0x066f;
                    case 104: goto L_0x066f;
                    case 105: goto L_0x066f;
                    case 106: goto L_0x066f;
                    case 107: goto L_0x066f;
                    default: goto L_0x05ed;
                }
            L_0x05ed:
                goto L_0x0684
            L_0x05ef:
                android.content.Intent r9 = new android.content.Intent
                com.yeelight.cherry.ui.activity.ProductListActivity r10 = com.yeelight.cherry.p141ui.activity.ProductListActivity.this
                java.lang.Class<com.yeelight.cherry.ui.activity.GoogleSeamlessActivity> r0 = com.yeelight.cherry.p141ui.activity.GoogleSeamlessActivity.class
                r9.<init>(r10, r0)
            L_0x05f8:
                com.yeelight.cherry.ui.activity.ProductListActivity r10 = com.yeelight.cherry.p141ui.activity.ProductListActivity.this
                r10.startActivity(r9)
                goto L_0x0684
            L_0x05ff:
                android.content.Intent r9 = new android.content.Intent
                com.yeelight.cherry.ui.activity.ProductListActivity r10 = com.yeelight.cherry.p141ui.activity.ProductListActivity.this
                java.lang.Class<com.yeelight.cherry.ui.activity.AddNetworkActivity> r0 = com.yeelight.cherry.p141ui.activity.AddNetworkActivity.class
                r9.<init>(r10, r0)
                java.lang.String r10 = "ADD_MESH_GROUP"
                r9.putExtra(r10, r6)
                goto L_0x05f8
            L_0x060e:
                android.content.Intent r10 = new android.content.Intent
                com.yeelight.cherry.ui.activity.ProductListActivity r0 = com.yeelight.cherry.p141ui.activity.ProductListActivity.this
                r10.<init>(r0, r9)
            L_0x0615:
                com.yeelight.cherry.ui.activity.ProductListActivity r9 = com.yeelight.cherry.p141ui.activity.ProductListActivity.this
                r9.startActivity(r10)
                goto L_0x0684
            L_0x061c:
                android.content.Intent r10 = new android.content.Intent
                com.yeelight.cherry.ui.activity.ProductListActivity r1 = com.yeelight.cherry.p141ui.activity.ProductListActivity.this
                r10.<init>(r1, r9)
                r10.putExtra(r0, r2)
                goto L_0x0615
            L_0x0627:
                android.content.Intent r10 = new android.content.Intent
                com.yeelight.cherry.ui.activity.ProductListActivity r1 = com.yeelight.cherry.p141ui.activity.ProductListActivity.this
                r10.<init>(r1, r9)
                r10.putExtra(r0, r3)
                goto L_0x0615
            L_0x0632:
                android.content.Intent r10 = new android.content.Intent
                com.yeelight.cherry.ui.activity.ProductListActivity r1 = com.yeelight.cherry.p141ui.activity.ProductListActivity.this
                r10.<init>(r1, r9)
                r10.putExtra(r0, r4)
                goto L_0x0615
            L_0x063d:
                android.content.Intent r10 = new android.content.Intent
                com.yeelight.cherry.ui.activity.ProductListActivity r1 = com.yeelight.cherry.p141ui.activity.ProductListActivity.this
                r10.<init>(r1, r9)
                r10.putExtra(r0, r5)
                goto L_0x0615
            L_0x0648:
                com.yeelight.yeelib.managers.e r9 = com.yeelight.yeelib.managers.C8272e.m19511b()
                boolean r9 = r9.mo35205e()
                if (r9 == 0) goto L_0x0658
            L_0x0652:
                com.yeelight.cherry.ui.activity.ProductListActivity r9 = com.yeelight.cherry.p141ui.activity.ProductListActivity.this
                r9.m16891f0(r10)
                goto L_0x0684
            L_0x0658:
                com.yeelight.cherry.ui.activity.ProductListActivity r9 = com.yeelight.cherry.p141ui.activity.ProductListActivity.this
                r9.m16892g0()
                goto L_0x0684
            L_0x065e:
                com.yeelight.yeelib.managers.e r9 = com.yeelight.yeelib.managers.C8272e.m19511b()
                boolean r9 = r9.mo35203c()
                if (r9 == 0) goto L_0x0669
                goto L_0x0652
            L_0x0669:
                com.yeelight.cherry.ui.activity.ProductListActivity r9 = com.yeelight.cherry.p141ui.activity.ProductListActivity.this
                r9.m16890e0()
                goto L_0x0684
            L_0x066f:
                com.yeelight.yeelib.managers.e r9 = com.yeelight.yeelib.managers.C8272e.m19511b()
                boolean r9 = r9.mo35203c()
                if (r9 == 0) goto L_0x0669
                com.yeelight.yeelib.managers.e r9 = com.yeelight.yeelib.managers.C8272e.m19511b()
                boolean r9 = r9.mo35205e()
                if (r9 == 0) goto L_0x0658
                goto L_0x0652
            L_0x0684:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.activity.ProductListActivity.C5596d.mo30812a(int, com.yeelight.yeelib.models.ProductInfo):void");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ProductListActivity$e */
    class C5597e implements DialogInterface.OnClickListener {
        C5597e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C3108x.m8223f().mo23547m(ProductListActivity.this, true);
            dialogInterface.dismiss();
            ProductListActivity.this.f11164c.show();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ProductListActivity$f */
    class C5598f implements DialogInterface.OnClickListener {
        C5598f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C3108x.m8223f().mo23541b().enable();
            dialogInterface.dismiss();
            ProductListActivity.this.f11164c.show();
        }
    }

    /* renamed from: c0 */
    private void m16888c0() {
        this.mDeviceList.setLayoutManager(new GridLayoutManager(this, 2));
        ProductListAdapter productListAdapter = new ProductListAdapter(this, this.f11166e);
        this.f11165d = productListAdapter;
        productListAdapter.mo31174d(new C5596d());
        this.mDeviceList.setAdapter(this.f11165d);
        this.mDeviceList.addItemDecoration(new ProductItemDecoration(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public void m16889d0(ProductInfo productInfo) {
        Intent intent = new Intent(this, SearchDeviceActivity.class);
        intent.putExtra("product", productInfo);
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public void m16890e0() {
        if (this.f11162a == null) {
            this.f11162a = new C9113d.C9118e(this).mo37178h(2131755195).mo37176f(2131755196).mo37174d(-2, getString(2131755232), (DialogInterface.OnClickListener) null).mo37174d(-1, getString(2131755197), new C5598f()).mo37172b();
            ProgressDialog progressDialog = new ProgressDialog(this, 3);
            this.f11164c = progressDialog;
            progressDialog.setMessage(getString(2131755364));
            this.f11164c.setCancelable(false);
        }
        this.f11162a.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public void m16891f0(ProductInfo productInfo) {
        Intent intent = new Intent(this, DeviceResetActivity.class);
        intent.putExtra("product", productInfo);
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public void m16892g0() {
        if (this.f11163b == null) {
            this.f11163b = new C9113d.C9118e(this).mo37178h(2131755200).mo37176f(2131755201).mo37174d(-2, getString(2131755232), (DialogInterface.OnClickListener) null).mo37174d(-1, getString(2131755197), new C5597e()).mo37172b();
            ProgressDialog progressDialog = new ProgressDialog(this, 3);
            this.f11164c = progressDialog;
            progressDialog.setMessage(getString(2131755364));
            this.f11164c.setCancelable(false);
        }
        this.f11163b.show();
    }

    /* renamed from: A */
    public void mo23481A() {
        List<ProductInfo> list;
        List<ProductInfo> list2;
        this.f11166e.clear();
        int i = this.f11168g;
        if (i != 1) {
            if (i == 2) {
                list2 = this.f11166e;
                list = C3088r.m8117g().mo23466e();
            }
            this.f11165d.notifyDataSetChanged();
        }
        list2 = this.f11166e;
        list = C3088r.m8117g().mo23467f();
        list2.addAll(list);
        this.f11165d.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        setContentView(C12228R$layout.activity_product_list);
        C9193k.m22157h(true, this);
        ButterKnife.bind((Activity) this);
        if (getIntent() != null) {
            this.f11168g = getIntent().getIntExtra("key_add_device", 0);
        }
        m16888c0();
        this.mTitleBar.mo36195a(getString(2131755216), new C5595c(), (View.OnClickListener) null);
        this.mTitleBar.setTitleTextSize(16);
        registerReceiver(this.f11169h, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        registerReceiver(this.f11170i, new IntentFilter("android.net.wifi.WIFI_STATE_CHANGED"));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f11169h);
        unregisterReceiver(this.f11170i);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C3088r.m8117g().mo23477s(this);
        C9113d dVar = this.f11162a;
        if (dVar != null && dVar.isShowing()) {
            this.f11162a.dismiss();
        }
        C9113d dVar2 = this.f11163b;
        if (dVar2 != null && dVar2.isShowing()) {
            this.f11163b.dismiss();
        }
        ProgressDialog progressDialog = this.f11164c;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f11164c.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        List<ProductInfo> list;
        List<ProductInfo> list2;
        super.onResume();
        this.f11166e.clear();
        int i = this.f11168g;
        if (i != 1) {
            if (i == 2) {
                list2 = this.f11166e;
                list = C3088r.m8117g().mo23466e();
            }
            this.f11165d.notifyDataSetChanged();
            C3088r.m8117g().mo23475p(this);
        }
        list2 = this.f11166e;
        list = C3088r.m8117g().mo23467f();
        list2.addAll(list);
        this.f11165d.notifyDataSetChanged();
        C3088r.m8117g().mo23475p(this);
    }
}
