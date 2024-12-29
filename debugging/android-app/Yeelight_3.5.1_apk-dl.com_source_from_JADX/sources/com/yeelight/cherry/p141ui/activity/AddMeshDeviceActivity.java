package com.yeelight.cherry.p141ui.activity;

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
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.adapter.AddDeviceCursorAdapter;
import com.yeelight.yeelib.authority.DeviceAuthorityBase;
import com.yeelight.yeelib.data.C6043b;
import com.yeelight.yeelib.data.DeviceBrowserContract;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.base.PrivateMeshDeviceBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.MeshNetWork;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p051j4.C9193k;
import p170i4.C9106a;
import p170i4.C9113d;
import p223w3.C10898f0;
import p237z3.C12141a;
import p237z3.C12143c;
import p237z3.C12144d;
import p237z3.C12145e;

/* renamed from: com.yeelight.cherry.ui.activity.AddMeshDeviceActivity */
public class AddMeshDeviceActivity extends BaseActivity implements LoaderManager.LoaderCallbacks<Cursor>, C12143c, C12145e, C12141a, C12144d {
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final String f9838o = AddMeshDeviceActivity.class.getSimpleName();

    /* renamed from: a */
    private Uri f9839a = DeviceBrowserContract.DeviceBrowser.f12274r;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public AddDeviceCursorAdapter f9840b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f9841c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f9842d = -1;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f9843e = true;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public PrivateMeshDeviceBase f9844f = null;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public MeshNetWork f9845g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public List<String> f9846h = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public List<String> f9847i = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public HashMap<String, Integer> f9848j = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public MatrixCursor f9849k = null;

    /* renamed from: l */
    private ContentObserver f9850l = new C5031d(new Handler());
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C9106a f9851m;
    @BindView(2131297163)
    Button mBtnNext;
    @BindView(2131296490)
    TextView mBtnRetry;
    @BindView(2131296669)
    RecyclerView mDeviceList;
    @BindView(2131297242)
    ImageView mProductIcon;
    @BindView(2131297296)
    ImageView mRefreshImg;
    @BindView(2131297292)
    View mRefreshLayout;
    @BindView(2131297295)
    ProgressBar mRefreshProgress;
    @BindView(2131297297)
    TextView mRefreshText;
    @BindView(2131297516)
    TextView mSubInfo;
    @BindView(2131297589)
    TextView mTitle;
    @BindView(2131297591)
    CommonTitleBar mTitleBar;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public Handler f9852n = new C5032e();

    /* renamed from: com.yeelight.cherry.ui.activity.AddMeshDeviceActivity$a */
    class C5028a implements DialogInterface.OnClickListener {
        C5028a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            AddMeshDeviceActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddMeshDeviceActivity$b */
    class C5029b implements DialogInterface.OnClickListener {
        C5029b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AddMeshDeviceActivity.this.m15823w0();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddMeshDeviceActivity$c */
    class C5030c implements DialogInterface.OnClickListener {
        C5030c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            AddMeshDeviceActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddMeshDeviceActivity$d */
    class C5031d extends ContentObserver {
        C5031d(Handler handler) {
            super(handler);
        }

        public void onChange(boolean z) {
            super.onChange(z);
            AddMeshDeviceActivity.this.getLoaderManager().restartLoader(0, (Bundle) null, AddMeshDeviceActivity.this);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddMeshDeviceActivity$e */
    class C5032e extends Handler {
        C5032e() {
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ac, code lost:
            r10.setText(r0);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r10) {
            /*
                r9 = this;
                super.handleMessage(r10)
                java.lang.String unused = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.f9838o
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Receive msg = "
                r0.append(r1)
                int r1 = r10.what
                r0.append(r1)
                java.lang.String r1 = " current Device = "
                r0.append(r1)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r1 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.device.base.PrivateMeshDeviceBase r1 = r1.f9844f
                if (r1 != 0) goto L_0x0025
                java.lang.String r1 = "null"
                goto L_0x002f
            L_0x0025:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r1 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.device.base.PrivateMeshDeviceBase r1 = r1.f9844f
                java.lang.String r1 = r1.mo23185G()
            L_0x002f:
                r0.append(r1)
                int r10 = r10.what
                java.lang.String r0 = "yeelight_ms"
                r1 = -1
                r2 = 8
                r3 = 100
                r4 = 2
                r5 = 0
                r6 = 1
                if (r10 == 0) goto L_0x0243
                r7 = 6
                if (r10 == r6) goto L_0x020e
                if (r10 == r4) goto L_0x01c1
                r8 = 3
                if (r10 == r8) goto L_0x018c
                if (r10 == r3) goto L_0x0179
                switch(r10) {
                    case 5: goto L_0x0152;
                    case 6: goto L_0x024f;
                    case 7: goto L_0x00b1;
                    case 8: goto L_0x0092;
                    case 9: goto L_0x0077;
                    case 10: goto L_0x0070;
                    case 11: goto L_0x004f;
                    default: goto L_0x004d;
                }
            L_0x004d:
                goto L_0x03d8
            L_0x004f:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                java.lang.String r0 = "location"
                java.lang.Object r10 = r10.getSystemService(r0)
                android.location.LocationManager r10 = (android.location.LocationManager) r10
                java.lang.String r0 = "gps"
                boolean r0 = r10.isProviderEnabled(r0)
                if (r0 != 0) goto L_0x03d8
                java.lang.String r0 = "network"
                boolean r10 = r10.isProviderEnabled(r0)
                if (r10 != 0) goto L_0x03d8
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                r10.m15822v0()
                goto L_0x03d8
            L_0x0070:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                r10.m15821u0()
                goto L_0x03d8
            L_0x0077:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                boolean unused = r10.f9843e = r6
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                android.widget.ImageView r10 = r10.mRefreshImg
                r10.setVisibility(r2)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                android.widget.ProgressBar r10 = r10.mRefreshProgress
                r10.setVisibility(r5)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                android.widget.TextView r10 = r10.mRefreshText
                r0 = 2131755083(0x7f10004b, float:1.9141035E38)
                goto L_0x00ac
            L_0x0092:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                boolean unused = r10.f9843e = r5
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                android.widget.ImageView r10 = r10.mRefreshImg
                r10.setVisibility(r5)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                android.widget.ProgressBar r10 = r10.mRefreshProgress
                r10.setVisibility(r2)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                android.widget.TextView r10 = r10.mRefreshText
                r0 = 2131755082(0x7f10004a, float:1.9141033E38)
            L_0x00ac:
                r10.setText(r0)
                goto L_0x03d8
            L_0x00b1:
                r9.removeMessages(r3)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                android.widget.TextView r10 = r10.mTitle
                r0 = 2131755240(0x7f1000e8, float:1.9141354E38)
                r10.setText(r0)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                android.widget.TextView r10 = r10.mSubInfo
                r0 = 2131755851(0x7f10034b, float:1.9142593E38)
                r10.setText(r0)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                java.util.List r10 = r10.f9846h
                java.util.Iterator r10 = r10.iterator()
            L_0x00d2:
                boolean r0 = r10.hasNext()
                if (r0 == 0) goto L_0x00fe
                java.lang.Object r0 = r10.next()
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.base.c r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.m7794j0(r0)
                com.yeelight.yeelib.device.base.PrivateMeshDeviceBase r0 = (com.yeelight.yeelib.device.base.PrivateMeshDeviceBase) r0
                boolean r2 = r0.mo31636W1()
                if (r2 != 0) goto L_0x00ec
                r10 = 0
                goto L_0x00ff
            L_0x00ec:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r2 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                java.util.HashMap r2 = r2.f9848j
                java.lang.String r0 = r0.mo23185G()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
                r2.put(r0, r3)
                goto L_0x00d2
            L_0x00fe:
                r10 = 1
            L_0x00ff:
                if (r10 == 0) goto L_0x0107
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                int unused = r10.f9841c = r8
                goto L_0x0113
            L_0x0107:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                int unused = r10.f9841c = r4
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                android.widget.TextView r10 = r10.mBtnRetry
                r10.setVisibility(r5)
            L_0x0113:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                int unused = r10.f9842d = r1
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r0 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.models.MeshNetWork r0 = r0.f9845g
                java.lang.String r0 = r0.getName()
                r10.append(r0)
                java.lang.String r0 = "_"
                r10.append(r0)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r0 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.models.MeshNetWork r0 = r0.f9845g
                int r0 = r0.getId()
                r10.append(r0)
                java.lang.String r10 = r10.toString()
                com.yeelight.yeelib.device.base.c r10 = com.yeelight.yeelib.managers.YeelightDeviceManager.m7794j0(r10)
                com.yeelight.yeelib.device.e r10 = (com.yeelight.yeelib.device.C6164e) r10
                r10.mo31758P1()
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                android.widget.Button r10 = r10.mBtnNext
                r10.setEnabled(r6)
                goto L_0x03d8
            L_0x0152:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.device.base.PrivateMeshDeviceBase r10 = r10.f9844f
                if (r10 == 0) goto L_0x023e
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.device.base.PrivateMeshDeviceBase r10 = r10.f9844f
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r0 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.models.MeshNetWork r0 = r0.f9845g
                java.lang.String r0 = r0.getNetworkName()
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r1 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.models.MeshNetWork r1 = r1.f9845g
                java.lang.String r1 = r1.getPassword()
                r10.mo31650l2(r0, r1)
                goto L_0x03d8
            L_0x0179:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.device.base.PrivateMeshDeviceBase r10 = r10.f9844f
                if (r10 == 0) goto L_0x023e
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.device.base.PrivateMeshDeviceBase r10 = r10.f9844f
                r10.mo23156r()
                goto L_0x023e
            L_0x018c:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                java.lang.String r0 = "auth failed"
                android.widget.Toast r10 = android.widget.Toast.makeText(r10, r0, r5)
                r10.show()
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.device.base.PrivateMeshDeviceBase r10 = r10.f9844f
                if (r10 == 0) goto L_0x03d8
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.device.base.PrivateMeshDeviceBase r10 = r10.f9844f
                r10.mo23156r()
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                java.util.HashMap r10 = r10.f9848j
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r0 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.device.base.PrivateMeshDeviceBase r0 = r0.f9844f
                java.lang.String r0 = r0.mo23185G()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
                r10.put(r0, r1)
                goto L_0x03d8
            L_0x01c1:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                boolean r10 = r10.isFinishing()
                if (r10 == 0) goto L_0x01cb
                goto L_0x03d8
            L_0x01cb:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                i4.a r10 = r10.f9851m
                if (r10 != 0) goto L_0x0203
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                i4.a r0 = new i4.a
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r1 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                r0.<init>(r1)
                p170i4.C9106a unused = r10.f9851m = r0
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                i4.a r10 = r10.f9851m
                r0 = 2131231082(0x7f08016a, float:1.8078235E38)
                r10.mo37123c(r0)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                i4.a r10 = r10.f9851m
                r0 = 2131755134(0x7f10007e, float:1.9141139E38)
                r10.setTitle(r0)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                i4.a r10 = r10.f9851m
                r0 = 2131755133(0x7f10007d, float:1.9141137E38)
                r10.mo37124d(r0)
            L_0x0203:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                i4.a r10 = r10.f9851m
                r10.show()
                goto L_0x03d8
            L_0x020e:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.device.base.PrivateMeshDeviceBase r10 = r10.f9844f
                java.lang.String unused = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.f9838o
                if (r10 == 0) goto L_0x023e
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r1 = "mCurrentDevice = "
                r10.append(r1)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r1 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.device.base.PrivateMeshDeviceBase r1 = r1.f9844f
                r10.append(r1)
                java.lang.String r1 = ", connect success"
                r10.append(r1)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.device.base.PrivateMeshDeviceBase r10 = r10.f9844f
                java.lang.String r1 = "YLu2M80aE"
                r10.mo31638Y1(r0, r1)
                goto L_0x03d8
            L_0x023e:
                r9.sendEmptyMessage(r7)
                goto L_0x03d8
            L_0x0243:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                android.widget.Button r10 = r10.mBtnNext
                r10.setEnabled(r5)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                int unused = r10.f9842d = r1
            L_0x024f:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                android.widget.TextView r10 = r10.mBtnRetry
                r10.setVisibility(r2)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                i4.a r10 = r10.f9851m
                if (r10 == 0) goto L_0x0273
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                i4.a r10 = r10.f9851m
                boolean r10 = r10.isShowing()
                if (r10 == 0) goto L_0x0273
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                i4.a r10 = r10.f9851m
                r10.dismiss()
            L_0x0273:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.device.base.PrivateMeshDeviceBase r10 = r10.f9844f
                if (r10 == 0) goto L_0x02bd
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.device.base.PrivateMeshDeviceBase r10 = r10.f9844f
                int r10 = r10.mo23113A()
                if (r10 == 0) goto L_0x02bd
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.device.base.PrivateMeshDeviceBase r10 = r10.f9844f
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r1 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                r10.mo23213W0(r1)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.device.base.PrivateMeshDeviceBase r10 = r10.f9844f
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r1 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                r10.mo23133V0(r1)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.device.base.PrivateMeshDeviceBase r10 = r10.f9844f
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r1 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                r10.mo31521R1(r1)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.device.base.PrivateMeshDeviceBase r10 = r10.f9844f
                boolean r10 = r10.mo31636W1()
                if (r10 != 0) goto L_0x02bd
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.device.base.PrivateMeshDeviceBase r10 = r10.f9844f
                r10.mo23156r()
            L_0x02bd:
                java.lang.String unused = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.f9838o
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                int r10 = r10.f9842d
                int r10 = r10 + r6
            L_0x02c7:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r1 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                java.util.List r1 = r1.f9846h
                int r1 = r1.size()
                if (r10 >= r1) goto L_0x03d1
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r1 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                java.util.List r1 = r1.f9846h
                java.lang.Object r1 = r1.get(r10)
                java.lang.String r1 = (java.lang.String) r1
                com.yeelight.yeelib.device.base.c r1 = com.yeelight.yeelib.managers.YeelightDeviceManager.m7794j0(r1)
                com.yeelight.yeelib.device.base.PrivateMeshDeviceBase r1 = (com.yeelight.yeelib.device.base.PrivateMeshDeviceBase) r1
                if (r1 == 0) goto L_0x030f
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r2 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                java.util.HashMap r2 = r2.f9848j
                java.lang.String r7 = r1.mo23185G()
                boolean r2 = r2.containsKey(r7)
                if (r2 == 0) goto L_0x030f
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r2 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                java.util.HashMap r2 = r2.f9848j
                java.lang.String r7 = r1.mo23185G()
                java.lang.Object r2 = r2.get(r7)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                if (r2 != r4) goto L_0x030f
                goto L_0x03cd
            L_0x030f:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r2 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                int unused = r2.f9842d = r10
                if (r1 == 0) goto L_0x03ca
                boolean r2 = r1.mo31636W1()
                if (r2 == 0) goto L_0x032a
                com.yeelight.yeelib.models.MeshNetWork r2 = r1.mo31635V1()
                java.lang.String r2 = r2.getNetworkName()
                boolean r2 = r0.equals(r2)
                if (r2 == 0) goto L_0x03ca
            L_0x032a:
                java.lang.String unused = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.f9838o
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r0 = " Find a device to update:"
                r10.append(r0)
                java.lang.String r0 = r1.mo23185G()
                r10.append(r0)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                r1.mo23171z0(r10)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                r1.mo23178B0(r10)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                r1.mo31518O1(r10)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                com.yeelight.yeelib.device.base.PrivateMeshDeviceBase unused = r10.f9844f = r1
                boolean r10 = r1.mo23145k0()
                if (r10 == 0) goto L_0x0362
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                android.os.Handler r10 = r10.f9852n
                r10.sendEmptyMessage(r6)
                goto L_0x0365
            L_0x0362:
                r1.mo23151n()
            L_0x0365:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                java.util.List r10 = r10.f9847i
                java.lang.String r0 = r1.mo23185G()
                r10.add(r0)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                java.util.HashMap r10 = r10.f9848j
                java.lang.String r0 = r1.mo23185G()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
                r10.put(r0, r1)
                r9.removeMessages(r3)
                r0 = 25000(0x61a8, double:1.23516E-319)
                r9.sendEmptyMessageDelayed(r3, r0)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                com.yeelight.cherry.ui.adapter.AddDeviceCursorAdapter r10 = r10.f9840b
                r10.notifyDataSetChanged()
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                android.widget.TextView r0 = r10.mTitle
                r1 = 2131755853(0x7f10034d, float:1.9142597E38)
                java.lang.Object[] r2 = new java.lang.Object[r4]
                int r3 = r10.f9842d
                int r3 = r3 + r6
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2[r5] = r3
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r3 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                java.util.List r3 = r3.f9846h
                int r3 = r3.size()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2[r6] = r3
                java.lang.String r10 = r10.getString(r1, r2)
                r0.setText(r10)
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                android.widget.TextView r10 = r10.mSubInfo
                r0 = 2131755852(0x7f10034c, float:1.9142595E38)
                r10.setText(r0)
                return
            L_0x03ca:
                java.lang.String unused = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.f9838o
            L_0x03cd:
                int r10 = r10 + 1
                goto L_0x02c7
            L_0x03d1:
                java.lang.String unused = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.f9838o
                r10 = 7
                r9.sendEmptyMessage(r10)
            L_0x03d8:
                com.yeelight.cherry.ui.activity.AddMeshDeviceActivity r10 = com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.this
                com.yeelight.cherry.ui.adapter.AddDeviceCursorAdapter r10 = r10.f9840b
                r10.notifyDataSetChanged()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.activity.AddMeshDeviceActivity.C5032e.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddMeshDeviceActivity$f */
    class C5033f implements View.OnClickListener {
        C5033f() {
        }

        public void onClick(View view) {
            AddMeshDeviceActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddMeshDeviceActivity$g */
    class C5034g implements AddDeviceCursorAdapter.C5866b {
        C5034g() {
        }

        /* renamed from: a */
        public void mo30170a(List<String> list) {
            if (list.isEmpty()) {
                AddMeshDeviceActivity.this.mBtnNext.setEnabled(false);
                return;
            }
            AddMeshDeviceActivity.this.mBtnNext.setEnabled(true);
            AddMeshDeviceActivity.this.f9846h.clear();
            AddMeshDeviceActivity.this.f9846h.addAll(list);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddMeshDeviceActivity$h */
    class C5035h implements View.OnClickListener {
        C5035h() {
        }

        public void onClick(View view) {
            if (AddMeshDeviceActivity.this.f9841c == 0) {
                MatrixCursor unused = AddMeshDeviceActivity.this.f9849k = new MatrixCursor(new String[]{"_ID", C6043b.C6044a.C6045a.f12331c});
                int i = 0;
                for (String str : AddMeshDeviceActivity.this.f9846h) {
                    String unused2 = AddMeshDeviceActivity.f9838o;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Add connect device :");
                    sb.append(str);
                    AddMeshDeviceActivity.this.f9849k.addRow(new String[]{String.valueOf(i), str});
                    AddMeshDeviceActivity.this.f9848j.put(str, 0);
                    i++;
                }
                AddMeshDeviceActivity.this.f9849k.moveToPosition(AddMeshDeviceActivity.this.f9842d);
                int unused3 = AddMeshDeviceActivity.this.f9841c = 1;
                AddMeshDeviceActivity.this.f9852n.sendEmptyMessage(0);
                AddMeshDeviceActivity.this.f9840b.mo31099n(2);
                AddMeshDeviceActivity.this.f9840b.mo31092b(AddMeshDeviceActivity.this.f9849k);
                AddMeshDeviceActivity.this.mBtnNext.setText(2131755240);
            } else if (AddMeshDeviceActivity.this.f9841c == 2 || AddMeshDeviceActivity.this.f9841c == 3) {
                AddMeshDeviceActivity.this.finish();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddMeshDeviceActivity$i */
    class C5036i implements View.OnClickListener {
        C5036i() {
        }

        public void onClick(View view) {
            AddMeshDeviceActivity.this.f9852n.sendEmptyMessage(0);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddMeshDeviceActivity$j */
    class C5037j implements View.OnClickListener {
        C5037j() {
        }

        public void onClick(View view) {
            if (!AddMeshDeviceActivity.this.f9843e) {
                AddMeshDeviceActivity.this.m15824x0();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddMeshDeviceActivity$k */
    class C5038k implements Runnable {
        C5038k() {
        }

        public void run() {
            String unused = AddMeshDeviceActivity.f9838o;
            StringBuilder sb = new StringBuilder();
            sb.append(AddMeshDeviceActivity.this.f9844f.mo23185G());
            sb.append(" update mesh success");
            AddMeshDeviceActivity.this.f9844f.mo31643d2();
            AddMeshDeviceActivity.this.f9844f.mo31521R1(AddMeshDeviceActivity.this);
            AddMeshDeviceActivity.this.f9844f.mo23133V0(AddMeshDeviceActivity.this);
            AddMeshDeviceActivity.this.f9844f.mo23213W0(AddMeshDeviceActivity.this);
            AddMeshDeviceActivity.this.f9844f.mo31647i2(AddMeshDeviceActivity.this.f9845g);
            AddMeshDeviceActivity.this.f9848j.put(AddMeshDeviceActivity.this.f9844f.mo23185G(), 2);
            DeviceDataProvider.m17619c0(AddMeshDeviceActivity.this.f9844f.mo23185G(), AddMeshDeviceActivity.this.f9845g.getId());
            AddMeshDeviceActivity.this.f9852n.sendEmptyMessage(6);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddMeshDeviceActivity$l */
    class C5039l implements DialogInterface.OnClickListener {
        C5039l() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            ActivityCompat.requestPermissions(AddMeshDeviceActivity.this, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, 0);
        }
    }

    /* renamed from: s0 */
    private void m15820s0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public void m15821u0() {
        C9113d.C9118e eVar = new C9113d.C9118e(this);
        eVar.mo37179i(getString(2131755524)).mo37176f(2131755522).mo37174d(-2, getString(2131755232), new C5028a()).mo37174d(-1, getString(2131755222), new C5039l());
        eVar.mo37180j();
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public void m15822v0() {
        C9113d.C9118e eVar = new C9113d.C9118e(this);
        eVar.mo37179i(getString(2131755523)).mo37176f(2131755525).mo37174d(-2, getString(2131755232), new C5030c()).mo37174d(-1, getString(2131755222), new C5029b());
        eVar.mo37180j();
    }

    /* access modifiers changed from: private */
    /* renamed from: w0 */
    public void m15823w0() {
        startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public void m15824x0() {
        YeelightDeviceManager.m7800o0().mo23278Z(true, false, false);
        m15820s0();
    }

    /* renamed from: y0 */
    private void m15825y0() {
        YeelightDeviceManager.m7800o0().mo23254B1();
    }

    /* renamed from: E */
    public void mo30149E(C3012e eVar) {
    }

    /* renamed from: L */
    public void mo30150L() {
    }

    /* renamed from: k */
    public void mo30151k() {
        this.f9852n.sendEmptyMessage(9);
    }

    /* renamed from: m */
    public void mo30152m(C3012e eVar) {
    }

    /* renamed from: o */
    public void mo30153o() {
        this.f9852n.sendEmptyMessage(8);
    }

    public void onConnectionStateChanged(int i, int i2) {
        PrivateMeshDeviceBase privateMeshDeviceBase = this.f9844f;
        if (!(privateMeshDeviceBase == null || i2 != 11 || privateMeshDeviceBase.mo23216Y() == 11)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f9844f.mo23185G());
            sb.append(" onConnectionStateChanged oldState= ");
            sb.append(i);
            sb.append(" , newState = ");
            sb.append(i2);
            this.f9852n.sendEmptyMessage(1);
        }
        PrivateMeshDeviceBase privateMeshDeviceBase2 = this.f9844f;
        if (privateMeshDeviceBase2 != null && privateMeshDeviceBase2.mo23113A() == 0) {
            this.f9852n.sendEmptyMessage(100);
            this.f9848j.put(this.f9844f.mo23185G(), 3);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        MeshNetWork meshNetWork = (MeshNetWork) getIntent().getSerializableExtra("mesh_network");
        this.f9845g = meshNetWork;
        if (meshNetWork == null) {
            AppUtils.m8300u(f9838o, "No mesh network found!");
            finish();
            return;
        }
        mo35653P();
        setContentView(C12228R$layout.activity_add_mesh_device);
        C9193k.m22157h(true, this);
        ButterKnife.bind((Activity) this);
        setTitleBarPadding(this.mTitleBar);
        this.mTitleBar.mo36195a("", new C5033f(), (View.OnClickListener) null);
        this.mProductIcon.setImageResource(2131231381);
        AddDeviceCursorAdapter addDeviceCursorAdapter = new AddDeviceCursorAdapter(this, (Cursor) null);
        this.f9840b = addDeviceCursorAdapter;
        addDeviceCursorAdapter.mo31097l(this.f9848j);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setAutoMeasureEnabled(false);
        this.mDeviceList.setLayoutManager(linearLayoutManager);
        this.mDeviceList.setAdapter(this.f9840b);
        this.f9840b.mo31099n(3);
        this.f9840b.mo31096k(new C5034g());
        this.mBtnNext.setOnClickListener(new C5035h());
        this.mBtnRetry.setOnClickListener(new C5036i());
        this.mRefreshLayout.setOnClickListener(new C5037j());
        this.mTitle.setText(2131755854);
        this.mSubInfo.setText(2131755855);
        this.mBtnNext.setText(2131755850);
    }

    public Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
        return new CursorLoader(this, this.f9839a, (String[]) null, (String) null, (String[]) null, (String) null);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f9852n.removeCallbacksAndMessages((Object) null);
        PrivateMeshDeviceBase privateMeshDeviceBase = this.f9844f;
        if (privateMeshDeviceBase != null) {
            privateMeshDeviceBase.mo31521R1(this);
            this.f9844f.mo23133V0(this);
            this.f9844f.mo23213W0(this);
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
        getContentResolver().unregisterContentObserver(this.f9850l);
        m15825y0();
        this.f9852n.removeCallbacksAndMessages((Object) null);
        YeelightDeviceManager.m7800o0().mo23271L1(this);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 0 && iArr.length > 0) {
            if (iArr[0] == 0) {
                LocationManager locationManager = (LocationManager) getSystemService("location");
                if (!locationManager.isProviderEnabled("gps") && !locationManager.isProviderEnabled("network")) {
                    m15822v0();
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
        YeelightDeviceManager.m7800o0().mo23309q1(this);
        getLoaderManager().restartLoader(0, (Bundle) null, this);
        getContentResolver().registerContentObserver(DeviceBrowserContract.DeviceBrowser.f12281y, true, this.f9850l);
        m15824x0();
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        String str;
        StringBuilder sb;
        switch (i) {
            case 536870914:
            case 805306370:
                if (this.f9844f != null) {
                    this.f9852n.post(new C5038k());
                    return;
                } else {
                    this.f9852n.sendEmptyMessage(6);
                    return;
                }
            case 536870916:
                this.f9852n.sendEmptyMessage(5);
                sb = new StringBuilder();
                sb.append(this.f9844f.mo23185G());
                str = " login success";
                break;
            case 805306372:
                this.f9852n.sendEmptyMessage(4);
                sb = new StringBuilder();
                sb.append(this.f9844f.mo23185G());
                str = " login FAILED";
                break;
            default:
                return;
        }
        sb.append(str);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        PrivateMeshDeviceBase privateMeshDeviceBase = this.f9844f;
        if (privateMeshDeviceBase != null && privateMeshDeviceBase.mo23113A() != 0) {
            this.f9844f.mo23213W0(this);
            this.f9844f.mo23133V0(this);
            this.f9844f.mo31521R1(this);
            if (!this.f9844f.mo31636W1()) {
                this.f9844f.mo23156r();
            }
        }
    }

    /* renamed from: t */
    public void mo30160t() {
    }

    /* renamed from: t0 */
    public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
        StringBuilder sb = new StringBuilder();
        sb.append("onLoadFinished! mCurrentStep = ");
        sb.append(this.f9841c);
        if (this.f9841c == 0) {
            MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_ID", C6043b.C6044a.C6045a.f12331c});
            int i = 0;
            while (cursor.moveToNext()) {
                C3010c j0 = YeelightDeviceManager.m7794j0(cursor.getString(cursor.getColumnIndex(C6043b.C6044a.C6045a.f12331c)));
                if (j0 instanceof C10898f0) {
                    C10898f0 f0Var = (C10898f0) j0;
                    if ("yeelight_ms".equals(f0Var.mo31635V1().getNetworkName())) {
                        matrixCursor.addRow(new String[]{String.valueOf(i), f0Var.mo23185G()});
                        i++;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Found mesh network ");
                        sb2.append(f0Var.mo31635V1().getNetworkName());
                        sb2.append(" device = ");
                        sb2.append(f0Var.mo23210U());
                    }
                }
            }
            for (C3010c next : YeelightDeviceManager.m7800o0().mo23322x0()) {
                if (next.mo23208T().equals("yeelink.light.gingko")) {
                    PrivateMeshDeviceBase privateMeshDeviceBase = (PrivateMeshDeviceBase) next;
                    if (privateMeshDeviceBase.mo31635V1().getNetworkName().equals("yeelight_ms")) {
                        matrixCursor.addRow(new String[]{String.valueOf(i), privateMeshDeviceBase.mo23185G()});
                        i++;
                    }
                }
            }
            this.f9840b.mo31092b(matrixCursor);
        }
    }

    /* renamed from: w */
    public void mo30162w(DeviceAuthorityBase.AuthState authState) {
        Handler handler;
        int i;
        if (authState == DeviceAuthorityBase.AuthState.AUTH_IP) {
            handler = this.f9852n;
            i = 2;
        } else if (authState == DeviceAuthorityBase.AuthState.AUTH_SUC || authState == DeviceAuthorityBase.AuthState.AUTH_NO_NEED) {
            C9106a aVar = this.f9851m;
            if (aVar != null) {
                aVar.dismiss();
                return;
            }
            return;
        } else if (authState == DeviceAuthorityBase.AuthState.AUTH_FAIL) {
            handler = this.f9852n;
            i = 3;
        } else {
            return;
        }
        handler.sendEmptyMessage(i);
    }

    /* renamed from: y */
    public void mo30163y(int i) {
    }
}
