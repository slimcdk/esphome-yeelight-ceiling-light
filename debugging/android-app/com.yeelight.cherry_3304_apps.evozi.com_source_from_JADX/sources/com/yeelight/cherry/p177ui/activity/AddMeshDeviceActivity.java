package com.yeelight.cherry.p177ui.activity;

import android.app.Activity;
import android.app.LoaderManager;
import android.content.CursorLoader;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.Loader;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p177ui.adapter.AddDeviceCursorAdapter;
import com.yeelight.yeelib.data.C7574b;
import com.yeelight.yeelib.data.C7579c;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6047m;
import com.yeelight.yeelib.p150c.p183m.C6459e0;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p153g.C9850s;
import com.yeelight.yeelib.p178b.C5969b;
import com.yeelight.yeelib.p186e.C9766a;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p186e.C9769d;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.widget.C10514a;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.activity.AddMeshDeviceActivity */
public class AddMeshDeviceActivity extends BaseActivity implements LoaderManager.LoaderCallbacks<Cursor>, C9768c, C9770e, C9766a, C9769d {
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final String f10294p = AddMeshDeviceActivity.class.getSimpleName();

    /* renamed from: b */
    private Uri f10295b = C7574b.C7575a.f15335r;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public AddDeviceCursorAdapter f10296c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f10297d = 0;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f10298e = -1;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f10299f = true;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C6047m f10300g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C9850s f10301h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public List<String> f10302i = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public List<String> f10303j = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public HashMap<String, Integer> f10304k = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public MatrixCursor f10305l = null;

    /* renamed from: m */
    private ContentObserver f10306m = new C4986d(new Handler());
    @BindView(2131297041)
    Button mBtnNext;
    @BindView(2131296432)
    TextView mBtnRetry;
    @BindView(2131296591)
    RecyclerView mDeviceList;
    @BindView(2131297109)
    ImageView mProductIcon;
    @BindView(2131297156)
    ImageView mRefreshImg;
    @BindView(2131297152)
    View mRefreshLayout;
    @BindView(2131297155)
    ProgressBar mRefreshProgress;
    @BindView(2131297157)
    TextView mRefreshText;
    @BindView(2131297361)
    TextView mSubInfo;
    @BindView(2131297422)
    TextView mTitle;
    @BindView(2131297424)
    CommonTitleBar mTitleBar;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C10514a f10307n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Handler f10308o = new C4987e();

    /* renamed from: com.yeelight.cherry.ui.activity.AddMeshDeviceActivity$a */
    class C4983a implements DialogInterface.OnClickListener {
        C4983a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            AddMeshDeviceActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddMeshDeviceActivity$b */
    class C4984b implements DialogInterface.OnClickListener {
        C4984b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AddMeshDeviceActivity.this.m15969w0();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddMeshDeviceActivity$c */
    class C4985c implements DialogInterface.OnClickListener {
        C4985c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            AddMeshDeviceActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddMeshDeviceActivity$d */
    class C4986d extends ContentObserver {
        C4986d(Handler handler) {
            super(handler);
        }

        public void onChange(boolean z) {
            super.onChange(z);
            AddMeshDeviceActivity.this.getLoaderManager().restartLoader(0, (Bundle) null, AddMeshDeviceActivity.this);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddMeshDeviceActivity$e */
    class C4987e extends Handler {
        C4987e() {
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00af, code lost:
            r10.setText(r0);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r10) {
            /*
                r9 = this;
                super.handleMessage(r10)
                java.lang.String unused = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.f10294p
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Receive msg = "
                r0.append(r1)
                int r1 = r10.what
                r0.append(r1)
                java.lang.String r1 = " current Device = "
                r0.append(r1)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r1 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.c.i.m r1 = r1.f10300g
                if (r1 != 0) goto L_0x0025
                java.lang.String r1 = "null"
                goto L_0x002f
            L_0x0025:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r1 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.c.i.m r1 = r1.f10300g
                java.lang.String r1 = r1.mo23372G()
            L_0x002f:
                r0.append(r1)
                r0.toString()
                int r10 = r10.what
                java.lang.String r0 = "yeelight_ms"
                r1 = -1
                r2 = 8
                r3 = 100
                r4 = 2
                r5 = 0
                r6 = 1
                if (r10 == 0) goto L_0x0249
                r7 = 6
                if (r10 == r6) goto L_0x0211
                if (r10 == r4) goto L_0x01c4
                r8 = 3
                if (r10 == r8) goto L_0x018f
                if (r10 == r3) goto L_0x017c
                switch(r10) {
                    case 5: goto L_0x0155;
                    case 6: goto L_0x0255;
                    case 7: goto L_0x00b4;
                    case 8: goto L_0x0095;
                    case 9: goto L_0x007a;
                    case 10: goto L_0x0073;
                    case 11: goto L_0x0052;
                    default: goto L_0x0050;
                }
            L_0x0050:
                goto L_0x03e1
            L_0x0052:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                java.lang.String r0 = "location"
                java.lang.Object r10 = r10.getSystemService(r0)
                android.location.LocationManager r10 = (android.location.LocationManager) r10
                java.lang.String r0 = "gps"
                boolean r0 = r10.isProviderEnabled(r0)
                if (r0 != 0) goto L_0x03e1
                java.lang.String r0 = "network"
                boolean r10 = r10.isProviderEnabled(r0)
                if (r10 != 0) goto L_0x03e1
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                r10.m15968v0()
                goto L_0x03e1
            L_0x0073:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                r10.m15967u0()
                goto L_0x03e1
            L_0x007a:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                boolean unused = r10.f10299f = r6
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                android.widget.ImageView r10 = r10.mRefreshImg
                r10.setVisibility(r2)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                android.widget.ProgressBar r10 = r10.mRefreshProgress
                r10.setVisibility(r5)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                android.widget.TextView r10 = r10.mRefreshText
                r0 = 2131755084(0x7f10004c, float:1.9141037E38)
                goto L_0x00af
            L_0x0095:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                boolean unused = r10.f10299f = r5
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                android.widget.ImageView r10 = r10.mRefreshImg
                r10.setVisibility(r5)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                android.widget.ProgressBar r10 = r10.mRefreshProgress
                r10.setVisibility(r2)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                android.widget.TextView r10 = r10.mRefreshText
                r0 = 2131755083(0x7f10004b, float:1.9141035E38)
            L_0x00af:
                r10.setText(r0)
                goto L_0x03e1
            L_0x00b4:
                r9.removeMessages(r3)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                android.widget.TextView r10 = r10.mTitle
                r0 = 2131755237(0x7f1000e5, float:1.9141348E38)
                r10.setText(r0)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                android.widget.TextView r10 = r10.mSubInfo
                r0 = 2131755841(0x7f100341, float:1.9142573E38)
                r10.setText(r0)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                java.util.List r10 = r10.f10302i
                java.util.Iterator r10 = r10.iterator()
            L_0x00d5:
                boolean r0 = r10.hasNext()
                if (r0 == 0) goto L_0x0101
                java.lang.Object r0 = r10.next()
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.c.i.d r0 = com.yeelight.yeelib.p152f.C4257w.m11945h0(r0)
                com.yeelight.yeelib.c.i.m r0 = (com.yeelight.yeelib.p150c.p151i.C6047m) r0
                boolean r2 = r0.mo27806W1()
                if (r2 != 0) goto L_0x00ef
                r10 = 0
                goto L_0x0102
            L_0x00ef:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r2 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                java.util.HashMap r2 = r2.f10304k
                java.lang.String r0 = r0.mo23372G()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
                r2.put(r0, r3)
                goto L_0x00d5
            L_0x0101:
                r10 = 1
            L_0x0102:
                if (r10 == 0) goto L_0x010a
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                int unused = r10.f10297d = r8
                goto L_0x0116
            L_0x010a:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                int unused = r10.f10297d = r4
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                android.widget.TextView r10 = r10.mBtnRetry
                r10.setVisibility(r5)
            L_0x0116:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                int unused = r10.f10298e = r1
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r0 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.g.s r0 = r0.f10301h
                java.lang.String r0 = r0.mo31821b()
                r10.append(r0)
                java.lang.String r0 = "_"
                r10.append(r0)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r0 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.g.s r0 = r0.f10301h
                int r0 = r0.mo31820a()
                r10.append(r0)
                java.lang.String r10 = r10.toString()
                com.yeelight.yeelib.c.i.d r10 = com.yeelight.yeelib.p152f.C4257w.m11945h0(r10)
                com.yeelight.yeelib.c.f r10 = (com.yeelight.yeelib.p150c.C6000f) r10
                r10.mo27503P1()
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                android.widget.Button r10 = r10.mBtnNext
                r10.setEnabled(r6)
                goto L_0x03e1
            L_0x0155:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.c.i.m r10 = r10.f10300g
                if (r10 == 0) goto L_0x0244
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.c.i.m r10 = r10.f10300g
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r0 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.g.s r0 = r0.f10301h
                java.lang.String r0 = r0.mo31822c()
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r1 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.g.s r1 = r1.f10301h
                java.lang.String r1 = r1.mo31823d()
                r10.mo27820l2(r0, r1)
                goto L_0x03e1
            L_0x017c:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.c.i.m r10 = r10.f10300g
                if (r10 == 0) goto L_0x0244
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.c.i.m r10 = r10.f10300g
                r10.mo23342r()
                goto L_0x0244
            L_0x018f:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                java.lang.String r0 = "auth failed"
                android.widget.Toast r10 = android.widget.Toast.makeText(r10, r0, r5)
                r10.show()
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.c.i.m r10 = r10.f10300g
                if (r10 == 0) goto L_0x03e1
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.c.i.m r10 = r10.f10300g
                r10.mo23342r()
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                java.util.HashMap r10 = r10.f10304k
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r0 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.c.i.m r0 = r0.f10300g
                java.lang.String r0 = r0.mo23372G()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
                r10.put(r0, r1)
                goto L_0x03e1
            L_0x01c4:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                boolean r10 = r10.isFinishing()
                if (r10 == 0) goto L_0x01ce
                goto L_0x03e1
            L_0x01ce:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.ui.widget.a r10 = r10.f10307n
                if (r10 != 0) goto L_0x0206
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.ui.widget.a r0 = new com.yeelight.yeelib.ui.widget.a
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r1 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                r0.<init>(r1)
                com.yeelight.yeelib.p194ui.widget.C10514a unused = r10.f10307n = r0
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.ui.widget.a r10 = r10.f10307n
                r0 = 2131231068(0x7f08015c, float:1.8078207E38)
                r10.mo33276c(r0)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.ui.widget.a r10 = r10.f10307n
                r0 = 2131755133(0x7f10007d, float:1.9141137E38)
                r10.setTitle(r0)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.ui.widget.a r10 = r10.f10307n
                r0 = 2131755132(0x7f10007c, float:1.9141135E38)
                r10.mo33277d(r0)
            L_0x0206:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.ui.widget.a r10 = r10.f10307n
                r10.show()
                goto L_0x03e1
            L_0x0211:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.c.i.m r10 = r10.f10300g
                java.lang.String unused = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.f10294p
                if (r10 == 0) goto L_0x0244
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r1 = "mCurrentDevice = "
                r10.append(r1)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r1 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.c.i.m r1 = r1.f10300g
                r10.append(r1)
                java.lang.String r1 = ", connect success"
                r10.append(r1)
                r10.toString()
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.c.i.m r10 = r10.f10300g
                java.lang.String r1 = "YLu2M80aE"
                r10.mo27808Y1(r0, r1)
                goto L_0x03e1
            L_0x0244:
                r9.sendEmptyMessage(r7)
                goto L_0x03e1
            L_0x0249:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                android.widget.Button r10 = r10.mBtnNext
                r10.setEnabled(r5)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                int unused = r10.f10298e = r1
            L_0x0255:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                android.widget.TextView r10 = r10.mBtnRetry
                r10.setVisibility(r2)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.ui.widget.a r10 = r10.f10307n
                if (r10 == 0) goto L_0x0279
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.ui.widget.a r10 = r10.f10307n
                boolean r10 = r10.isShowing()
                if (r10 == 0) goto L_0x0279
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.ui.widget.a r10 = r10.f10307n
                r10.dismiss()
            L_0x0279:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.c.i.m r10 = r10.f10300g
                if (r10 == 0) goto L_0x02c3
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.c.i.m r10 = r10.f10300g
                int r10 = r10.mo23299A()
                if (r10 == 0) goto L_0x02c3
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.c.i.m r10 = r10.f10300g
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r1 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                r10.mo23400W0(r1)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.c.i.m r10 = r10.f10300g
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r1 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                r10.mo23319V0(r1)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.c.i.m r10 = r10.f10300g
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r1 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                r10.mo27489R1(r1)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.c.i.m r10 = r10.f10300g
                boolean r10 = r10.mo27806W1()
                if (r10 != 0) goto L_0x02c3
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.c.i.m r10 = r10.f10300g
                r10.mo23342r()
            L_0x02c3:
                java.lang.String unused = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.f10294p
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                int r10 = r10.f10298e
                int r10 = r10 + r6
            L_0x02cd:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r1 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                java.util.List r1 = r1.f10302i
                int r1 = r1.size()
                if (r10 >= r1) goto L_0x03da
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r1 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                java.util.List r1 = r1.f10302i
                java.lang.Object r1 = r1.get(r10)
                java.lang.String r1 = (java.lang.String) r1
                com.yeelight.yeelib.c.i.d r1 = com.yeelight.yeelib.p152f.C4257w.m11945h0(r1)
                com.yeelight.yeelib.c.i.m r1 = (com.yeelight.yeelib.p150c.p151i.C6047m) r1
                if (r1 == 0) goto L_0x0315
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r2 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                java.util.HashMap r2 = r2.f10304k
                java.lang.String r7 = r1.mo23372G()
                boolean r2 = r2.containsKey(r7)
                if (r2 == 0) goto L_0x0315
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r2 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                java.util.HashMap r2 = r2.f10304k
                java.lang.String r7 = r1.mo23372G()
                java.lang.Object r2 = r2.get(r7)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                if (r2 != r4) goto L_0x0315
                goto L_0x03d6
            L_0x0315:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r2 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                int unused = r2.f10298e = r10
                if (r1 == 0) goto L_0x03d3
                boolean r2 = r1.mo27806W1()
                if (r2 == 0) goto L_0x0330
                com.yeelight.yeelib.g.s r2 = r1.mo27805V1()
                java.lang.String r2 = r2.mo31822c()
                boolean r2 = r0.equals(r2)
                if (r2 == 0) goto L_0x03d3
            L_0x0330:
                java.lang.String unused = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.f10294p
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r0 = " Find a device to update:"
                r10.append(r0)
                java.lang.String r0 = r1.mo23372G()
                r10.append(r0)
                r10.toString()
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                r1.mo23358z0(r10)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                r1.mo23365B0(r10)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                r1.mo27486O1(r10)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.p150c.p151i.C6047m unused = r10.f10300g = r1
                boolean r10 = r1.mo23331k0()
                if (r10 == 0) goto L_0x036b
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                android.os.Handler r10 = r10.f10308o
                r10.sendEmptyMessage(r6)
                goto L_0x036e
            L_0x036b:
                r1.mo23337n()
            L_0x036e:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                java.util.List r10 = r10.f10303j
                java.lang.String r0 = r1.mo23372G()
                r10.add(r0)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                java.util.HashMap r10 = r10.f10304k
                java.lang.String r0 = r1.mo23372G()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
                r10.put(r0, r1)
                r9.removeMessages(r3)
                r0 = 25000(0x61a8, double:1.23516E-319)
                r9.sendEmptyMessageDelayed(r3, r0)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                com.yeelight.cherry.ui.adapter.AddDeviceCursorAdapter r10 = r10.f10296c
                r10.notifyDataSetChanged()
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                android.widget.TextView r0 = r10.mTitle
                r1 = 2131755843(0x7f100343, float:1.9142577E38)
                java.lang.Object[] r2 = new java.lang.Object[r4]
                int r3 = r10.f10298e
                int r3 = r3 + r6
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2[r5] = r3
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r3 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                java.util.List r3 = r3.f10302i
                int r3 = r3.size()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2[r6] = r3
                java.lang.String r10 = r10.getString(r1, r2)
                r0.setText(r10)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                android.widget.TextView r10 = r10.mSubInfo
                r0 = 2131755842(0x7f100342, float:1.9142575E38)
                r10.setText(r0)
                return
            L_0x03d3:
                java.lang.String unused = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.f10294p
            L_0x03d6:
                int r10 = r10 + 1
                goto L_0x02cd
            L_0x03da:
                java.lang.String unused = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.f10294p
                r10 = 7
                r9.sendEmptyMessage(r10)
            L_0x03e1:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.this
                com.yeelight.cherry.ui.adapter.AddDeviceCursorAdapter r10 = r10.f10296c
                r10.notifyDataSetChanged()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.activity.AddMeshDeviceActivity.C4987e.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddMeshDeviceActivity$f */
    class C4988f implements View.OnClickListener {
        C4988f() {
        }

        public void onClick(View view) {
            AddMeshDeviceActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddMeshDeviceActivity$g */
    class C4989g implements AddDeviceCursorAdapter.C5803b {
        C4989g() {
        }

        /* renamed from: a */
        public void mo26114a(List<String> list) {
            if (list.isEmpty()) {
                AddMeshDeviceActivity.this.mBtnNext.setEnabled(false);
                return;
            }
            AddMeshDeviceActivity.this.mBtnNext.setEnabled(true);
            AddMeshDeviceActivity.this.f10302i.clear();
            AddMeshDeviceActivity.this.f10302i.addAll(list);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddMeshDeviceActivity$h */
    class C4990h implements View.OnClickListener {
        C4990h() {
        }

        public void onClick(View view) {
            if (AddMeshDeviceActivity.this.f10297d == 0) {
                MatrixCursor unused = AddMeshDeviceActivity.this.f10305l = new MatrixCursor(new String[]{"_ID", C7579c.C7580a.C7581a.f15372c});
                int i = 0;
                for (String str : AddMeshDeviceActivity.this.f10302i) {
                    String unused2 = AddMeshDeviceActivity.f10294p;
                    "Add connect device :" + str;
                    AddMeshDeviceActivity.this.f10305l.addRow(new String[]{String.valueOf(i), str});
                    AddMeshDeviceActivity.this.f10304k.put(str, 0);
                    i++;
                }
                AddMeshDeviceActivity.this.f10305l.moveToPosition(AddMeshDeviceActivity.this.f10298e);
                int unused3 = AddMeshDeviceActivity.this.f10297d = 1;
                AddMeshDeviceActivity.this.f10308o.sendEmptyMessage(0);
                AddMeshDeviceActivity.this.f10296c.mo27130n(2);
                AddMeshDeviceActivity.this.f10296c.mo27123b(AddMeshDeviceActivity.this.f10305l);
                AddMeshDeviceActivity.this.mBtnNext.setText(2131755237);
            } else if (AddMeshDeviceActivity.this.f10297d == 2 || AddMeshDeviceActivity.this.f10297d == 3) {
                AddMeshDeviceActivity.this.finish();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddMeshDeviceActivity$i */
    class C4991i implements View.OnClickListener {
        C4991i() {
        }

        public void onClick(View view) {
            AddMeshDeviceActivity.this.f10308o.sendEmptyMessage(0);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddMeshDeviceActivity$j */
    class C4992j implements View.OnClickListener {
        C4992j() {
        }

        public void onClick(View view) {
            if (!AddMeshDeviceActivity.this.f10299f) {
                AddMeshDeviceActivity.this.m15970x0();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddMeshDeviceActivity$k */
    class C4993k implements Runnable {
        C4993k() {
        }

        public void run() {
            String unused = AddMeshDeviceActivity.f10294p;
            AddMeshDeviceActivity.this.f10300g.mo23372G() + " update mesh success";
            AddMeshDeviceActivity.this.f10300g.mo27813d2();
            AddMeshDeviceActivity.this.f10300g.mo27489R1(AddMeshDeviceActivity.this);
            AddMeshDeviceActivity.this.f10300g.mo23319V0(AddMeshDeviceActivity.this);
            AddMeshDeviceActivity.this.f10300g.mo23400W0(AddMeshDeviceActivity.this);
            AddMeshDeviceActivity.this.f10300g.mo27817i2(AddMeshDeviceActivity.this.f10301h);
            AddMeshDeviceActivity.this.f10304k.put(AddMeshDeviceActivity.this.f10300g.mo23372G(), 2);
            DeviceDataProvider.m22397c0(AddMeshDeviceActivity.this.f10300g.mo23372G(), AddMeshDeviceActivity.this.f10301h.mo31820a());
            AddMeshDeviceActivity.this.f10308o.sendEmptyMessage(6);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddMeshDeviceActivity$l */
    class C4994l implements DialogInterface.OnClickListener {
        C4994l() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            ActivityCompat.requestPermissions(AddMeshDeviceActivity.this, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, 0);
        }
    }

    /* renamed from: s0 */
    private void m15966s0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public void m15967u0() {
        C10526e.C10531e eVar = new C10526e.C10531e(this);
        eVar.mo33358i(getString(2131755520));
        eVar.mo33355f(2131755518);
        eVar.mo33353d(-2, getString(2131755229), new C4983a());
        eVar.mo33353d(-1, getString(2131755219), new C4994l());
        eVar.mo33359j();
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public void m15968v0() {
        C10526e.C10531e eVar = new C10526e.C10531e(this);
        eVar.mo33358i(getString(2131755519));
        eVar.mo33355f(2131755521);
        eVar.mo33353d(-2, getString(2131755229), new C4985c());
        eVar.mo33353d(-1, getString(2131755219), new C4984b());
        eVar.mo33359j();
    }

    /* access modifiers changed from: private */
    /* renamed from: w0 */
    public void m15969w0() {
        startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public void m15970x0() {
        C4257w.m11947l0().mo23655X(true, false, false);
        m15966s0();
    }

    /* renamed from: y0 */
    private void m15971y0() {
        C4257w.m11947l0().mo23694w1();
    }

    /* renamed from: E */
    public void mo26093E(C4200i iVar) {
    }

    /* renamed from: L */
    public void mo26094L() {
    }

    /* renamed from: k */
    public void mo26095k() {
        this.f10308o.sendEmptyMessage(9);
    }

    /* renamed from: m */
    public void mo26096m(C4200i iVar) {
    }

    /* renamed from: o */
    public void mo26097o() {
        this.f10308o.sendEmptyMessage(8);
    }

    public void onConnectionStateChanged(int i, int i2) {
        C6047m mVar = this.f10300g;
        if (!(mVar == null || i2 != 11 || mVar.mo23403Y() == 11)) {
            this.f10300g.mo23372G() + " onConnectionStateChanged oldState= " + i + " , newState = " + i2;
            this.f10308o.sendEmptyMessage(1);
        }
        C6047m mVar2 = this.f10300g;
        if (mVar2 != null && mVar2.mo23299A() == 0) {
            this.f10308o.sendEmptyMessage(100);
            this.f10304k.put(this.f10300g.mo23372G(), 3);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C9850s sVar = (C9850s) getIntent().getSerializableExtra("mesh_network");
        this.f10301h = sVar;
        if (sVar == null) {
            C4308b.m12139r(f10294p, "No mesh network found!");
            finish();
            return;
        }
        mo32193P();
        setContentView(C11748R$layout.activity_add_mesh_device);
        C10547m.m25758h(true, this);
        ButterKnife.bind((Activity) this);
        setTitleBarPadding(this.mTitleBar);
        this.mTitleBar.mo32825a("", new C4988f(), (View.OnClickListener) null);
        this.mProductIcon.setImageResource(2131231365);
        AddDeviceCursorAdapter addDeviceCursorAdapter = new AddDeviceCursorAdapter(this, (Cursor) null);
        this.f10296c = addDeviceCursorAdapter;
        addDeviceCursorAdapter.mo27128l(this.f10304k);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setAutoMeasureEnabled(false);
        this.mDeviceList.setLayoutManager(linearLayoutManager);
        this.mDeviceList.setAdapter(this.f10296c);
        this.f10296c.mo27130n(3);
        this.f10296c.mo27127k(new C4989g());
        this.mBtnNext.setOnClickListener(new C4990h());
        this.mBtnRetry.setOnClickListener(new C4991i());
        this.mRefreshLayout.setOnClickListener(new C4992j());
        this.mTitle.setText(2131755844);
        this.mSubInfo.setText(2131755845);
        this.mBtnNext.setText(2131755840);
    }

    public Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
        return new CursorLoader(this, this.f10295b, (String[]) null, (String) null, (String[]) null, (String) null);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f10308o.removeCallbacksAndMessages((Object) null);
        C6047m mVar = this.f10300g;
        if (mVar != null) {
            mVar.mo27489R1(this);
            this.f10300g.mo23319V0(this);
            this.f10300g.mo23400W0(this);
        }
    }

    public void onLoaderReset(Loader<Cursor> loader) {
    }

    public void onLocalConnected() {
    }

    public void onLocalDisconnected() {
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        getContentResolver().unregisterContentObserver(this.f10306m);
        m15971y0();
        this.f10308o.removeCallbacksAndMessages((Object) null);
        C4257w.m11947l0().mo23646F1(this);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 0 && iArr.length > 0) {
            if (iArr[0] == 0) {
                LocationManager locationManager = (LocationManager) getSystemService("location");
                if (!locationManager.isProviderEnabled("gps") && !locationManager.isProviderEnabled("network")) {
                    m15968v0();
                    return;
                }
                return;
            } else if (iArr[0] != -1) {
                return;
            }
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C4257w.m11947l0().mo23678m1(this);
        getLoaderManager().restartLoader(0, (Bundle) null, this);
        getContentResolver().registerContentObserver(C7574b.C7575a.f15342y, true, this.f10306m);
        m15970x0();
    }

    public void onStatusChange(int i, C6024e eVar) {
        String str;
        StringBuilder sb;
        switch (i) {
            case 536870914:
            case 805306370:
                if (this.f10300g != null) {
                    this.f10308o.post(new C4993k());
                    return;
                } else {
                    this.f10308o.sendEmptyMessage(6);
                    return;
                }
            case 536870916:
                this.f10308o.sendEmptyMessage(5);
                sb = new StringBuilder();
                sb.append(this.f10300g.mo23372G());
                str = " login success";
                break;
            case 805306372:
                this.f10308o.sendEmptyMessage(4);
                sb = new StringBuilder();
                sb.append(this.f10300g.mo23372G());
                str = " login FAILED";
                break;
            default:
                return;
        }
        sb.append(str);
        sb.toString();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C6047m mVar = this.f10300g;
        if (mVar != null && mVar.mo23299A() != 0) {
            this.f10300g.mo23400W0(this);
            this.f10300g.mo23319V0(this);
            this.f10300g.mo27489R1(this);
            if (!this.f10300g.mo27806W1()) {
                this.f10300g.mo23342r();
            }
        }
    }

    /* renamed from: t */
    public void mo26104t() {
    }

    /* renamed from: t0 */
    public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
        "onLoadFinished! mCurrentStep = " + this.f10297d;
        if (this.f10297d == 0) {
            MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_ID", C7579c.C7580a.C7581a.f15372c});
            int i = 0;
            while (cursor.moveToNext()) {
                C4198d h0 = C4257w.m11945h0(cursor.getString(cursor.getColumnIndex(C7579c.C7580a.C7581a.f15372c)));
                if (h0 instanceof C6459e0) {
                    C6459e0 e0Var = (C6459e0) h0;
                    if ("yeelight_ms".equals(e0Var.mo27805V1().mo31822c())) {
                        matrixCursor.addRow(new String[]{String.valueOf(i), e0Var.mo23372G()});
                        i++;
                    } else {
                        "Found mesh network " + e0Var.mo27805V1().mo31822c() + " device = " + e0Var.mo23397U();
                    }
                }
            }
            for (C4198d next : C4257w.m11947l0().mo23690u0()) {
                if (next.mo23395T().equals("yeelink.light.gingko")) {
                    C6047m mVar = (C6047m) next;
                    if (mVar.mo27805V1().mo31822c().equals("yeelight_ms")) {
                        matrixCursor.addRow(new String[]{String.valueOf(i), mVar.mo23372G()});
                        i++;
                    }
                }
            }
            this.f10296c.mo27123b(matrixCursor);
        }
    }

    /* renamed from: w */
    public void mo26106w(C5969b.C5970a aVar) {
        Handler handler;
        int i;
        if (aVar == C5969b.C5970a.AUTH_IP) {
            handler = this.f10308o;
            i = 2;
        } else if (aVar == C5969b.C5970a.AUTH_SUC || aVar == C5969b.C5970a.AUTH_NO_NEED) {
            C10514a aVar2 = this.f10307n;
            if (aVar2 != null) {
                aVar2.dismiss();
                return;
            }
            return;
        } else if (aVar == C5969b.C5970a.AUTH_FAIL) {
            handler = this.f10308o;
            i = 3;
        } else {
            return;
        }
        handler.sendEmptyMessage(i);
    }

    /* renamed from: y */
    public void mo26107y(int i) {
    }
}
