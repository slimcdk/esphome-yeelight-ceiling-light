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
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.miot.api.IConfigHandler;
import com.miot.api.MiotManager;
import com.miot.api.bluetooth.XmBluetoothManager;
import com.miot.common.exception.MiotException;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.adapter.AddDeviceCursorAdapter;
import com.yeelight.yeelib.data.C6043b;
import com.yeelight.yeelib.data.DeviceBrowserContract;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.device.C6164e;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.C6094f;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.MeshNetWork;
import com.yeelight.yeelib.models.ProductInfo;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p051j4.C3279g;
import p051j4.C9193k;
import p051j4.C9203s;
import p170i4.C9113d;
import p223w3.C10898f0;
import p237z3.C12143c;
import p237z3.C12144d;

/* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceActivity */
public class SearchDeviceActivity extends BaseActivity implements LoaderManager.LoaderCallbacks<Cursor>, C12144d, C12143c {

    /* renamed from: a */
    private int f11335a = 0;

    /* renamed from: b */
    private Uri f11336b = DeviceBrowserContract.DeviceBrowser.f12257a;

    /* renamed from: c */
    private ProductInfo f11337c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public AddDeviceCursorAdapter f11338d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List<String> f11339e;

    /* renamed from: f */
    private boolean f11340f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f11341g = true;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C6094f f11342h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f11343i = 0;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f11344j = -1;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public HashMap<String, Integer> f11345k;

    /* renamed from: l */
    private Handler f11346l = new Handler(new C5661d());
    /* access modifiers changed from: private */

    /* renamed from: m */
    public Handler f11347m = new Handler(new C5662e());
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
    @BindView(2131296584)
    FrameLayout mTopLayout;

    /* renamed from: n */
    private ContentObserver f11348n = new C5663f(new Handler());

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceActivity$a */
    class C5658a implements DialogInterface.OnClickListener {
        C5658a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            SearchDeviceActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceActivity$b */
    class C5659b implements DialogInterface.OnClickListener {
        C5659b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SearchDeviceActivity.this.m17021w0();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceActivity$c */
    class C5660c implements DialogInterface.OnClickListener {
        C5660c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            SearchDeviceActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceActivity$d */
    class C5661d implements Handler.Callback {
        C5661d() {
        }

        public boolean handleMessage(Message message) {
            TextView textView;
            int i;
            int i2 = message.what;
            if (i2 == 1) {
                boolean unused = SearchDeviceActivity.this.f11341g = false;
                SearchDeviceActivity.this.mRefreshImg.setVisibility(0);
                SearchDeviceActivity.this.mRefreshProgress.setVisibility(8);
                textView = SearchDeviceActivity.this.mRefreshText;
                i = 2131755082;
            } else if (i2 != 2) {
                if (i2 == 3) {
                    SearchDeviceActivity.this.m17019u0();
                } else if (i2 == 4) {
                    LocationManager locationManager = (LocationManager) SearchDeviceActivity.this.getSystemService("location");
                    if (!locationManager.isProviderEnabled("gps") && !locationManager.isProviderEnabled("network")) {
                        SearchDeviceActivity.this.m17020v0();
                    }
                }
                return false;
            } else {
                boolean unused2 = SearchDeviceActivity.this.f11341g = true;
                SearchDeviceActivity.this.mRefreshImg.setVisibility(8);
                SearchDeviceActivity.this.mRefreshProgress.setVisibility(0);
                textView = SearchDeviceActivity.this.mRefreshText;
                i = 2131755083;
            }
            textView.setText(i);
            return false;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceActivity$e */
    class C5662e implements Handler.Callback {
        C5662e() {
        }

        public boolean handleMessage(Message message) {
            boolean z;
            int i = message.what;
            if (i == 5) {
                SearchDeviceActivity.this.mBtnNext.setEnabled(false);
                int unused = SearchDeviceActivity.this.f11344j = -1;
            } else if (i != 6) {
                if (i == 7) {
                    SearchDeviceActivity.this.f11347m.sendEmptyMessage(6);
                } else if (i == 8) {
                    SearchDeviceActivity.this.f11347m.removeMessages(7);
                    SearchDeviceActivity.this.mTitle.setText(2131755240);
                    SearchDeviceActivity.this.mSubInfo.setText(2131755851);
                    Iterator it = SearchDeviceActivity.this.f11339e.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                            break;
                        }
                        String str = (String) it.next();
                        if (SearchDeviceActivity.this.f11345k != null && SearchDeviceActivity.this.f11345k.containsKey(str) && 2 != ((Integer) SearchDeviceActivity.this.f11345k.get(str)).intValue()) {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        int unused2 = SearchDeviceActivity.this.f11343i = 3;
                    } else {
                        int unused3 = SearchDeviceActivity.this.f11343i = 2;
                        SearchDeviceActivity.this.mBtnRetry.setVisibility(0);
                    }
                    int unused4 = SearchDeviceActivity.this.f11344j = -1;
                    SearchDeviceActivity.this.mBtnNext.setEnabled(true);
                    SearchDeviceActivity.this.f11338d.notifyDataSetChanged();
                }
                return false;
            }
            SearchDeviceActivity.this.mBtnRetry.setVisibility(8);
            if (SearchDeviceActivity.this.f11342h != null) {
                SearchDeviceActivity.this.f11342h.mo23133V0(SearchDeviceActivity.this);
            }
            int e0 = SearchDeviceActivity.this.f11344j + 1;
            while (e0 < SearchDeviceActivity.this.f11339e.size()) {
                C3010c j0 = YeelightDeviceManager.m7794j0((String) SearchDeviceActivity.this.f11339e.get(e0));
                if (!(j0 instanceof C6094f)) {
                    e0++;
                } else {
                    int unused5 = SearchDeviceActivity.this.f11344j = e0;
                    C6094f fVar = (C6094f) j0;
                    C6094f unused6 = SearchDeviceActivity.this.f11342h = fVar;
                    fVar.mo23176A0(SearchDeviceActivity.this, false);
                    if (fVar.mo23145k0()) {
                        SearchDeviceActivity.this.f11347m.sendEmptyMessage(6);
                    } else {
                        fVar.mo23151n();
                    }
                    SearchDeviceActivity.this.f11345k.put(fVar.mo23185G(), 1);
                    SearchDeviceActivity.this.f11347m.removeMessages(7);
                    SearchDeviceActivity.this.f11347m.sendEmptyMessageDelayed(7, 25000);
                    SearchDeviceActivity.this.f11338d.notifyDataSetChanged();
                    SearchDeviceActivity searchDeviceActivity = SearchDeviceActivity.this;
                    searchDeviceActivity.mTitle.setText(searchDeviceActivity.getString(2131755853, new Object[]{Integer.valueOf(searchDeviceActivity.f11344j + 1), Integer.valueOf(SearchDeviceActivity.this.f11339e.size())}));
                    SearchDeviceActivity.this.mSubInfo.setText(2131755852);
                    return false;
                }
            }
            SearchDeviceActivity.this.f11347m.sendEmptyMessage(8);
            return false;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceActivity$f */
    class C5663f extends ContentObserver {
        C5663f(Handler handler) {
            super(handler);
        }

        public void onChange(boolean z) {
            super.onChange(z);
            SearchDeviceActivity.this.getLoaderManager().restartLoader(0, (Bundle) null, SearchDeviceActivity.this);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceActivity$g */
    class C5664g implements View.OnClickListener {
        C5664g() {
        }

        public void onClick(View view) {
            SearchDeviceActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceActivity$h */
    class C5665h implements AddDeviceCursorAdapter.C5866b {
        C5665h() {
        }

        /* renamed from: a */
        public void mo30170a(List<String> list) {
            Button button;
            boolean z;
            List unused = SearchDeviceActivity.this.f11339e = list;
            if (SearchDeviceActivity.this.f11339e == null || SearchDeviceActivity.this.f11339e.isEmpty()) {
                button = SearchDeviceActivity.this.mBtnNext;
                z = false;
            } else {
                button = SearchDeviceActivity.this.mBtnNext;
                z = true;
            }
            button.setEnabled(z);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceActivity$i */
    class C5666i implements View.OnClickListener {
        C5666i() {
        }

        public void onClick(View view) {
            SearchDeviceActivity.this.f11347m.sendEmptyMessage(5);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceActivity$j */
    class C5667j implements View.OnClickListener {
        C5667j() {
        }

        public void onClick(View view) {
            if (!SearchDeviceActivity.this.f11341g) {
                SearchDeviceActivity.this.m17022x0();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceActivity$k */
    class C5668k implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C9113d f11359a;

        /* renamed from: b */
        final /* synthetic */ String f11360b;

        C5668k(C9113d dVar, String str) {
            this.f11359a = dVar;
            this.f11360b = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String obj = this.f11359a.mo37153c().getText().toString();
            MeshNetWork meshNetWork = new MeshNetWork();
            meshNetWork.setName(this.f11360b);
            meshNetWork.setPassword(obj);
            meshNetWork.setNetworkName(this.f11360b);
            int d = DeviceDataProvider.m17620d(meshNetWork);
            meshNetWork.setId(d);
            if (d > 0) {
                YeelightDeviceManager.m7800o0().mo23275Q(new C6164e(meshNetWork));
            }
            dialogInterface.dismiss();
            Intent intent = new Intent(SearchDeviceActivity.this, MainActivity.class);
            intent.addFlags(67108864);
            SearchDeviceActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceActivity$l */
    class C5669l implements DialogInterface.OnClickListener {
        C5669l() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            if (ActivityCompat.shouldShowRequestPermissionRationale(SearchDeviceActivity.this, "android.permission.ACCESS_FINE_LOCATION")) {
                SearchDeviceActivity.this.mo35655S(2131755993);
                SearchDeviceActivity.this.finish();
                return;
            }
            ActivityCompat.requestPermissions(SearchDeviceActivity.this, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 0);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceActivity$m */
    public class C5670m extends IConfigHandler.Stub {

        /* renamed from: a */
        private String f11363a;

        /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceActivity$m$a */
        class C5671a implements Runnable {
            C5671a() {
            }

            public void run() {
                if (!SearchDeviceActivity.this.isFinishing()) {
                    SearchDeviceActivity.this.startActivity(new Intent(SearchDeviceActivity.this, QuickConnectRequestProgressActivity.class));
                    SearchDeviceActivity.this.finish();
                }
            }
        }

        public C5670m(String str) {
            this.f11363a = str;
        }

        public void onFailed(int i, String str) {
            YeelightDeviceManager.m7800o0().mo23320v1(this.f11363a);
            AppUtils.f4986j = true;
            YeelightDeviceManager.m7800o0().mo23279a0();
            C3279g.m8802b(false);
            if (i == 12321) {
                YeelightDeviceManager.m7800o0().mo23276R(str);
            }
        }

        public void onSucceed(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("connectToCloud, onSucceed, remove device from wifi device map: ");
            sb.append(this.f11363a);
            YeelightDeviceManager.m7800o0().mo23320v1(this.f11363a);
            AppUtils.f4986j = true;
            YeelightDeviceManager.m7800o0().mo23286e0(true, SearchDeviceActivity.this.m17016q0(), this.f11363a);
            C3279g.m8802b(true);
            new Handler(Looper.getMainLooper()).post(new C5671a());
        }
    }

    /* renamed from: o0 */
    private void m17014o0() {
        if (this.f11340f) {
            String U = YeelightDeviceManager.m7794j0(this.f11339e.get(0)).mo23210U();
            C9113d b = new C9113d.C9118e(this).mo37178h(2131755858).mo37181k(true).mo37177g(getString(2131755859, new Object[]{U})).mo37172b();
            b.setCancelable(true);
            b.mo37156g(-1, getString(2131755240), new C5668k(b, U));
            b.show();
            return;
        }
        int i = this.f11335a;
        if (i == 0) {
            Intent intent = new Intent(this, BluetoothConnectNewActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", this.f11339e.get(0));
            startActivity(intent);
        } else if (i == 3) {
            YeelightDeviceManager.m7794j0(this.f11339e.get(0));
            int i2 = this.f11343i;
            if (i2 == 0) {
                MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_ID", C6043b.C6044a.C6045a.f12331c});
                int i3 = 0;
                for (String next : this.f11339e) {
                    matrixCursor.addRow(new String[]{String.valueOf(i3), next});
                    this.f11345k.put(next, 0);
                    i3++;
                }
                matrixCursor.moveToPosition(this.f11344j);
                this.f11343i = 1;
                this.f11347m.sendEmptyMessage(5);
                this.f11338d.mo31099n(4);
                this.f11338d.mo31092b(matrixCursor);
                this.mBtnNext.setText(2131755240);
            } else if (i2 == 2 || i2 == 3) {
                startActivity(new Intent(this, MainActivity.class));
            }
        } else {
            C3010c j0 = YeelightDeviceManager.m7794j0(this.f11339e.get(0));
            if (j0 == null) {
                Toast.makeText(this, "No device found :" + this.f11339e.get(0), 0).show();
                finish();
                return;
            }
            XmBluetoothManager.getInstance().setDeviceConfig(C9203s.m22203a(j0.mo23208T()));
            try {
                MiotManager.getDeviceConnector().connectToCloud(j0.mo23206S(), new C5670m(j0.mo23185G()));
            } catch (MiotException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: p0 */
    private void m17015p0() {
        int i;
        Handler handler;
        if (AppUtils.m8288i()) {
            if (ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_COARSE_LOCATION") == 0 && ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                handler = this.f11346l;
                i = 4;
            } else {
                handler = this.f11346l;
                i = 3;
            }
            handler.removeMessages(i);
            this.f11346l.sendEmptyMessageDelayed(i, 1000);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q0 */
    public boolean m17016q0() {
        String productModel = this.f11337c.getProductModel();
        productModel.hashCode();
        char c = 65535;
        switch (productModel.hashCode()) {
            case -1235140472:
                if (productModel.equals("yeelink.light.fancl1")) {
                    c = 0;
                    break;
                }
                break;
            case -1235140471:
                if (productModel.equals("yeelink.light.fancl2")) {
                    c = 1;
                    break;
                }
                break;
            case -1235140468:
                if (productModel.equals("yeelink.light.fancl5")) {
                    c = 2;
                    break;
                }
                break;
            case -1235140467:
                if (productModel.equals("yeelink.light.fancl6")) {
                    c = 3;
                    break;
                }
                break;
            case 674030242:
                if (productModel.equals("yeelink.curtain.ctmt1")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return true;
            default:
                return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public /* synthetic */ void m17017r0(int i) {
        Handler handler;
        int i2;
        if (i == 0) {
            this.f11342h.mo23133V0(this);
            this.f11345k.put(this.f11342h.mo23185G(), 3);
            handler = this.f11347m;
            i2 = 7;
        } else if (i == 11) {
            this.f11342h.mo23133V0(this);
            this.f11345k.put(this.f11342h.mo23185G(), 2);
            handler = this.f11347m;
            i2 = 6;
        } else {
            return;
        }
        handler.sendEmptyMessage(i2);
        this.f11338d.notifyDataSetChanged();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:320:0x05cd, code lost:
        r8.setImageResource(r0);
        r7.f11336b = com.yeelight.yeelib.data.DeviceBrowserContract.DeviceBrowser.f12262f;
        r7.f11335a = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x062d, code lost:
        r8.setImageResource(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0691, code lost:
        r8.setImageResource(r0);
        r8 = com.yeelight.yeelib.data.DeviceBrowserContract.DeviceBrowser.f12269m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x06a3, code lost:
        r8.setImageResource(r0);
        r8 = com.yeelight.yeelib.data.DeviceBrowserContract.DeviceBrowser.f12268l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x06be, code lost:
        r8.setImageResource(r0);
        r8 = com.yeelight.yeelib.data.DeviceBrowserContract.DeviceBrowser.f12267k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x06ed, code lost:
        r8 = com.yeelight.yeelib.data.DeviceBrowserContract.DeviceBrowser.f12264h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x076a, code lost:
        r8.setImageResource(r0);
        r8 = com.yeelight.yeelib.data.DeviceBrowserContract.DeviceBrowser.f12274r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x076f, code lost:
        r7.f11336b = r8;
        r7.f11335a = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x078f, code lost:
        r8.setImageResource(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x07a4, code lost:
        r8 = com.yeelight.yeelib.data.DeviceBrowserContract.DeviceBrowser.f12258b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x07a6, code lost:
        r7.f11336b = r8;
        r7.f11335a = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x07b7, code lost:
        r8.setImageResource(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x07ba, code lost:
        r8 = com.yeelight.yeelib.data.DeviceBrowserContract.DeviceBrowser.f12258b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x07bc, code lost:
        r7.f11336b = r8;
        r7.f11335a = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:?, code lost:
        return;
     */
    /* renamed from: t0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m17018t0(com.yeelight.yeelib.models.ProductInfo r8) {
        /*
            r7 = this;
            java.lang.String r8 = r8.getProductModel()
            r8.hashCode()
            int r0 = r8.hashCode()
            r1 = 0
            r2 = 3
            r3 = 1
            r4 = 2
            r5 = -1
            switch(r0) {
                case -1644531059: goto L_0x05b0;
                case -1494338802: goto L_0x05a5;
                case -1462015191: goto L_0x059a;
                case -1462015190: goto L_0x058f;
                case -1462015189: goto L_0x0584;
                case -1462015188: goto L_0x0579;
                case -1462015187: goto L_0x056e;
                case -1462015186: goto L_0x0563;
                case -1462015185: goto L_0x0555;
                case -1462015184: goto L_0x0547;
                case -1462015183: goto L_0x0539;
                case -1462015182: goto L_0x052b;
                case -1462015160: goto L_0x051d;
                case -1462015159: goto L_0x050f;
                case -1462015158: goto L_0x0501;
                case -1462015157: goto L_0x04f3;
                case -1462015156: goto L_0x04e5;
                case -1400275319: goto L_0x04d7;
                case -1350780909: goto L_0x04c9;
                case -1317475940: goto L_0x04bb;
                case -1317475939: goto L_0x04ad;
                case -1317475937: goto L_0x049f;
                case -1317475915: goto L_0x0491;
                case -1317475914: goto L_0x0483;
                case -1317475913: goto L_0x0475;
                case -1317475912: goto L_0x0467;
                case -1317475910: goto L_0x0459;
                case -1308146495: goto L_0x044b;
                case -1308146494: goto L_0x043d;
                case -1308146493: goto L_0x042f;
                case -1308146492: goto L_0x0421;
                case -1308146491: goto L_0x0413;
                case -1308146490: goto L_0x0405;
                case -1308146488: goto L_0x03f7;
                case -1308146447: goto L_0x03e9;
                case -1308146446: goto L_0x03db;
                case -1308146445: goto L_0x03cd;
                case -1308146443: goto L_0x03bf;
                case -1235140472: goto L_0x03b1;
                case -1235140471: goto L_0x03a3;
                case -1235140468: goto L_0x0395;
                case -1235140467: goto L_0x0387;
                case -1199119278: goto L_0x0379;
                case -1119332198: goto L_0x036b;
                case -1063384694: goto L_0x035d;
                case -1063384689: goto L_0x034f;
                case -1063384687: goto L_0x0341;
                case -1063384685: goto L_0x0333;
                case -948847040: goto L_0x0325;
                case -948847038: goto L_0x0317;
                case -939061393: goto L_0x0309;
                case -888668266: goto L_0x02fb;
                case -888668265: goto L_0x02ed;
                case -888668264: goto L_0x02df;
                case -845289556: goto L_0x02d1;
                case -845289555: goto L_0x02c3;
                case -845289553: goto L_0x02b5;
                case -845289551: goto L_0x02a7;
                case -845289549: goto L_0x0299;
                case -845289508: goto L_0x028b;
                case -458141175: goto L_0x027d;
                case -458141174: goto L_0x026f;
                case -458141173: goto L_0x0261;
                case -458141172: goto L_0x0253;
                case -458141171: goto L_0x0245;
                case -449944730: goto L_0x0237;
                case -449944729: goto L_0x0229;
                case -449944728: goto L_0x021b;
                case -449944727: goto L_0x020d;
                case -449944726: goto L_0x01ff;
                case -449944724: goto L_0x01f1;
                case -449944723: goto L_0x01e3;
                case -449944722: goto L_0x01d5;
                case -448603205: goto L_0x01c7;
                case -448603202: goto L_0x01b9;
                case -448603201: goto L_0x01ab;
                case -448603157: goto L_0x019d;
                case -448603156: goto L_0x018f;
                case -443031172: goto L_0x0181;
                case -190173984: goto L_0x0173;
                case -190173936: goto L_0x0165;
                case 174464231: goto L_0x0157;
                case 250266083: goto L_0x0149;
                case 674030242: goto L_0x013b;
                case 922669543: goto L_0x012d;
                case 922669544: goto L_0x011f;
                case 922669545: goto L_0x0111;
                case 922669546: goto L_0x0103;
                case 922669547: goto L_0x00f5;
                case 922669548: goto L_0x00e7;
                case 922669549: goto L_0x00d9;
                case 922669550: goto L_0x00cb;
                case 922669551: goto L_0x00bd;
                case 1201756974: goto L_0x00af;
                case 1201757021: goto L_0x00a1;
                case 1201757023: goto L_0x0093;
                case 1201766335: goto L_0x0085;
                case 1201766336: goto L_0x0077;
                case 1623724661: goto L_0x0069;
                case 1623724662: goto L_0x005b;
                case 1623724663: goto L_0x004d;
                case 2086270815: goto L_0x003f;
                case 2102612488: goto L_0x0031;
                case 2102612489: goto L_0x0023;
                case 2146130361: goto L_0x0015;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x05ba
        L_0x0015:
            java.lang.String r0 = "yeelink.light.dnlight2"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x001f
            goto L_0x05ba
        L_0x001f:
            r5 = 104(0x68, float:1.46E-43)
            goto L_0x05ba
        L_0x0023:
            java.lang.String r0 = "yeelink.light.meshbulb2"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x002d
            goto L_0x05ba
        L_0x002d:
            r5 = 103(0x67, float:1.44E-43)
            goto L_0x05ba
        L_0x0031:
            java.lang.String r0 = "yeelink.light.meshbulb1"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x003b
            goto L_0x05ba
        L_0x003b:
            r5 = 102(0x66, float:1.43E-43)
            goto L_0x05ba
        L_0x003f:
            java.lang.String r0 = "virtual.yeelink.light.mijia.ceiling"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0049
            goto L_0x05ba
        L_0x0049:
            r5 = 101(0x65, float:1.42E-43)
            goto L_0x05ba
        L_0x004d:
            java.lang.String r0 = "yeelink.light.bslamp3"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0057
            goto L_0x05ba
        L_0x0057:
            r5 = 100
            goto L_0x05ba
        L_0x005b:
            java.lang.String r0 = "yeelink.light.bslamp2"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0065
            goto L_0x05ba
        L_0x0065:
            r5 = 99
            goto L_0x05ba
        L_0x0069:
            java.lang.String r0 = "yeelink.light.bslamp1"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0073
            goto L_0x05ba
        L_0x0073:
            r5 = 98
            goto L_0x05ba
        L_0x0077:
            java.lang.String r0 = "yeelink.light.ml2"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0081
            goto L_0x05ba
        L_0x0081:
            r5 = 97
            goto L_0x05ba
        L_0x0085:
            java.lang.String r0 = "yeelink.light.ml1"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x008f
            goto L_0x05ba
        L_0x008f:
            r5 = 96
            goto L_0x05ba
        L_0x0093:
            java.lang.String r0 = "yeelink.light.ctc"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x009d
            goto L_0x05ba
        L_0x009d:
            r5 = 95
            goto L_0x05ba
        L_0x00a1:
            java.lang.String r0 = "yeelink.light.cta"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x00ab
            goto L_0x05ba
        L_0x00ab:
            r5 = 94
            goto L_0x05ba
        L_0x00af:
            java.lang.String r0 = "yeelink.light.ct2"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x00b9
            goto L_0x05ba
        L_0x00b9:
            r5 = 93
            goto L_0x05ba
        L_0x00bd:
            java.lang.String r0 = "yeelink.light.ceiling9"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x00c7
            goto L_0x05ba
        L_0x00c7:
            r5 = 92
            goto L_0x05ba
        L_0x00cb:
            java.lang.String r0 = "yeelink.light.ceiling8"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x00d5
            goto L_0x05ba
        L_0x00d5:
            r5 = 91
            goto L_0x05ba
        L_0x00d9:
            java.lang.String r0 = "yeelink.light.ceiling7"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x00e3
            goto L_0x05ba
        L_0x00e3:
            r5 = 90
            goto L_0x05ba
        L_0x00e7:
            java.lang.String r0 = "yeelink.light.ceiling6"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x00f1
            goto L_0x05ba
        L_0x00f1:
            r5 = 89
            goto L_0x05ba
        L_0x00f5:
            java.lang.String r0 = "yeelink.light.ceiling5"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x00ff
            goto L_0x05ba
        L_0x00ff:
            r5 = 88
            goto L_0x05ba
        L_0x0103:
            java.lang.String r0 = "yeelink.light.ceiling4"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x010d
            goto L_0x05ba
        L_0x010d:
            r5 = 87
            goto L_0x05ba
        L_0x0111:
            java.lang.String r0 = "yeelink.light.ceiling3"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x011b
            goto L_0x05ba
        L_0x011b:
            r5 = 86
            goto L_0x05ba
        L_0x011f:
            java.lang.String r0 = "yeelink.light.ceiling2"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0129
            goto L_0x05ba
        L_0x0129:
            r5 = 85
            goto L_0x05ba
        L_0x012d:
            java.lang.String r0 = "yeelink.light.ceiling1"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0137
            goto L_0x05ba
        L_0x0137:
            r5 = 84
            goto L_0x05ba
        L_0x013b:
            java.lang.String r0 = "yeelink.curtain.ctmt1"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0145
            goto L_0x05ba
        L_0x0145:
            r5 = 83
            goto L_0x05ba
        L_0x0149:
            java.lang.String r0 = "yeelink.light.gingko.group"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0153
            goto L_0x05ba
        L_0x0153:
            r5 = 82
            goto L_0x05ba
        L_0x0157:
            java.lang.String r0 = "virtual.yeelink.light.ceiling"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0161
            goto L_0x05ba
        L_0x0161:
            r5 = 81
            goto L_0x05ba
        L_0x0165:
            java.lang.String r0 = "yeelink.gateway.va"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x016f
            goto L_0x05ba
        L_0x016f:
            r5 = 80
            goto L_0x05ba
        L_0x0173:
            java.lang.String r0 = "yeelink.gateway.v1"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x017d
            goto L_0x05ba
        L_0x017d:
            r5 = 79
            goto L_0x05ba
        L_0x0181:
            java.lang.String r0 = "yeelink.light.spot1"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x018b
            goto L_0x05ba
        L_0x018b:
            r5 = 78
            goto L_0x05ba
        L_0x018f:
            java.lang.String r0 = "yeelink.light.monob"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0199
            goto L_0x05ba
        L_0x0199:
            r5 = 77
            goto L_0x05ba
        L_0x019d:
            java.lang.String r0 = "yeelink.light.monoa"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x01a7
            goto L_0x05ba
        L_0x01a7:
            r5 = 76
            goto L_0x05ba
        L_0x01ab:
            java.lang.String r0 = "yeelink.light.mono5"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x01b5
            goto L_0x05ba
        L_0x01b5:
            r5 = 75
            goto L_0x05ba
        L_0x01b9:
            java.lang.String r0 = "yeelink.light.mono4"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x01c3
            goto L_0x05ba
        L_0x01c3:
            r5 = 74
            goto L_0x05ba
        L_0x01c7:
            java.lang.String r0 = "yeelink.light.mono1"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x01d1
            goto L_0x05ba
        L_0x01d1:
            r5 = 73
            goto L_0x05ba
        L_0x01d5:
            java.lang.String r0 = "yeelink.light.lamp9"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x01df
            goto L_0x05ba
        L_0x01df:
            r5 = 72
            goto L_0x05ba
        L_0x01e3:
            java.lang.String r0 = "yeelink.light.lamp8"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x01ed
            goto L_0x05ba
        L_0x01ed:
            r5 = 71
            goto L_0x05ba
        L_0x01f1:
            java.lang.String r0 = "yeelink.light.lamp7"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x01fb
            goto L_0x05ba
        L_0x01fb:
            r5 = 70
            goto L_0x05ba
        L_0x01ff:
            java.lang.String r0 = "yeelink.light.lamp5"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0209
            goto L_0x05ba
        L_0x0209:
            r5 = 69
            goto L_0x05ba
        L_0x020d:
            java.lang.String r0 = "yeelink.light.lamp4"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0217
            goto L_0x05ba
        L_0x0217:
            r5 = 68
            goto L_0x05ba
        L_0x021b:
            java.lang.String r0 = "yeelink.light.lamp3"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0225
            goto L_0x05ba
        L_0x0225:
            r5 = 67
            goto L_0x05ba
        L_0x0229:
            java.lang.String r0 = "yeelink.light.lamp2"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0233
            goto L_0x05ba
        L_0x0233:
            r5 = 66
            goto L_0x05ba
        L_0x0237:
            java.lang.String r0 = "yeelink.light.lamp1"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0241
            goto L_0x05ba
        L_0x0241:
            r5 = 65
            goto L_0x05ba
        L_0x0245:
            java.lang.String r0 = "yeelink.light.ceile"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x024f
            goto L_0x05ba
        L_0x024f:
            r5 = 64
            goto L_0x05ba
        L_0x0253:
            java.lang.String r0 = "yeelink.light.ceild"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x025d
            goto L_0x05ba
        L_0x025d:
            r5 = 63
            goto L_0x05ba
        L_0x0261:
            java.lang.String r0 = "yeelink.light.ceilc"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x026b
            goto L_0x05ba
        L_0x026b:
            r5 = 62
            goto L_0x05ba
        L_0x026f:
            java.lang.String r0 = "yeelink.light.ceilb"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0279
            goto L_0x05ba
        L_0x0279:
            r5 = 61
            goto L_0x05ba
        L_0x027d:
            java.lang.String r0 = "yeelink.light.ceila"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0287
            goto L_0x05ba
        L_0x0287:
            r5 = 60
            goto L_0x05ba
        L_0x028b:
            java.lang.String r0 = "yeelink.light.stripa"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0295
            goto L_0x05ba
        L_0x0295:
            r5 = 59
            goto L_0x05ba
        L_0x0299:
            java.lang.String r0 = "yeelink.light.strip8"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x02a3
            goto L_0x05ba
        L_0x02a3:
            r5 = 58
            goto L_0x05ba
        L_0x02a7:
            java.lang.String r0 = "yeelink.light.strip6"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x02b1
            goto L_0x05ba
        L_0x02b1:
            r5 = 57
            goto L_0x05ba
        L_0x02b5:
            java.lang.String r0 = "yeelink.light.strip4"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x02bf
            goto L_0x05ba
        L_0x02bf:
            r5 = 56
            goto L_0x05ba
        L_0x02c3:
            java.lang.String r0 = "yeelink.light.strip2"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x02cd
            goto L_0x05ba
        L_0x02cd:
            r5 = 55
            goto L_0x05ba
        L_0x02d1:
            java.lang.String r0 = "yeelink.light.strip1"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x02db
            goto L_0x05ba
        L_0x02db:
            r5 = 54
            goto L_0x05ba
        L_0x02df:
            java.lang.String r0 = "yilai.light.ceiling3"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x02e9
            goto L_0x05ba
        L_0x02e9:
            r5 = 53
            goto L_0x05ba
        L_0x02ed:
            java.lang.String r0 = "yilai.light.ceiling2"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x02f7
            goto L_0x05ba
        L_0x02f7:
            r5 = 52
            goto L_0x05ba
        L_0x02fb:
            java.lang.String r0 = "yilai.light.ceiling1"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0305
            goto L_0x05ba
        L_0x0305:
            r5 = 51
            goto L_0x05ba
        L_0x0309:
            java.lang.String r0 = "yeelink.light.plate2"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0313
            goto L_0x05ba
        L_0x0313:
            r5 = 50
            goto L_0x05ba
        L_0x0317:
            java.lang.String r0 = "yeelink.light.panel3"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0321
            goto L_0x05ba
        L_0x0321:
            r5 = 49
            goto L_0x05ba
        L_0x0325:
            java.lang.String r0 = "yeelink.light.panel1"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x032f
            goto L_0x05ba
        L_0x032f:
            r5 = 48
            goto L_0x05ba
        L_0x0333:
            java.lang.String r0 = "yeelink.light.lamp19"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x033d
            goto L_0x05ba
        L_0x033d:
            r5 = 47
            goto L_0x05ba
        L_0x0341:
            java.lang.String r0 = "yeelink.light.lamp17"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x034b
            goto L_0x05ba
        L_0x034b:
            r5 = 46
            goto L_0x05ba
        L_0x034f:
            java.lang.String r0 = "yeelink.light.lamp15"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0359
            goto L_0x05ba
        L_0x0359:
            r5 = 45
            goto L_0x05ba
        L_0x035d:
            java.lang.String r0 = "yeelink.light.lamp10"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0367
            goto L_0x05ba
        L_0x0367:
            r5 = 44
            goto L_0x05ba
        L_0x036b:
            java.lang.String r0 = "yeelink.wifispeaker.v1"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0375
            goto L_0x05ba
        L_0x0375:
            r5 = 43
            goto L_0x05ba
        L_0x0379:
            java.lang.String r0 = "yeelink.light.gingko"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0383
            goto L_0x05ba
        L_0x0383:
            r5 = 42
            goto L_0x05ba
        L_0x0387:
            java.lang.String r0 = "yeelink.light.fancl6"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0391
            goto L_0x05ba
        L_0x0391:
            r5 = 41
            goto L_0x05ba
        L_0x0395:
            java.lang.String r0 = "yeelink.light.fancl5"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x039f
            goto L_0x05ba
        L_0x039f:
            r5 = 40
            goto L_0x05ba
        L_0x03a3:
            java.lang.String r0 = "yeelink.light.fancl2"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x03ad
            goto L_0x05ba
        L_0x03ad:
            r5 = 39
            goto L_0x05ba
        L_0x03b1:
            java.lang.String r0 = "yeelink.light.fancl1"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x03bb
            goto L_0x05ba
        L_0x03bb:
            r5 = 38
            goto L_0x05ba
        L_0x03bf:
            java.lang.String r0 = "yeelink.light.colore"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x03c9
            goto L_0x05ba
        L_0x03c9:
            r5 = 37
            goto L_0x05ba
        L_0x03cd:
            java.lang.String r0 = "yeelink.light.colorc"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x03d7
            goto L_0x05ba
        L_0x03d7:
            r5 = 36
            goto L_0x05ba
        L_0x03db:
            java.lang.String r0 = "yeelink.light.colorb"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x03e5
            goto L_0x05ba
        L_0x03e5:
            r5 = 35
            goto L_0x05ba
        L_0x03e9:
            java.lang.String r0 = "yeelink.light.colora"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x03f3
            goto L_0x05ba
        L_0x03f3:
            r5 = 34
            goto L_0x05ba
        L_0x03f7:
            java.lang.String r0 = "yeelink.light.color8"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0401
            goto L_0x05ba
        L_0x0401:
            r5 = 33
            goto L_0x05ba
        L_0x0405:
            java.lang.String r0 = "yeelink.light.color6"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x040f
            goto L_0x05ba
        L_0x040f:
            r5 = 32
            goto L_0x05ba
        L_0x0413:
            java.lang.String r0 = "yeelink.light.color5"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x041d
            goto L_0x05ba
        L_0x041d:
            r5 = 31
            goto L_0x05ba
        L_0x0421:
            java.lang.String r0 = "yeelink.light.color4"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x042b
            goto L_0x05ba
        L_0x042b:
            r5 = 30
            goto L_0x05ba
        L_0x042f:
            java.lang.String r0 = "yeelink.light.color3"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0439
            goto L_0x05ba
        L_0x0439:
            r5 = 29
            goto L_0x05ba
        L_0x043d:
            java.lang.String r0 = "yeelink.light.color2"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0447
            goto L_0x05ba
        L_0x0447:
            r5 = 28
            goto L_0x05ba
        L_0x044b:
            java.lang.String r0 = "yeelink.light.color1"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0455
            goto L_0x05ba
        L_0x0455:
            r5 = 27
            goto L_0x05ba
        L_0x0459:
            java.lang.String r0 = "yeelink.light.ceil35"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0463
            goto L_0x05ba
        L_0x0463:
            r5 = 26
            goto L_0x05ba
        L_0x0467:
            java.lang.String r0 = "yeelink.light.ceil33"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0471
            goto L_0x05ba
        L_0x0471:
            r5 = 25
            goto L_0x05ba
        L_0x0475:
            java.lang.String r0 = "yeelink.light.ceil32"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x047f
            goto L_0x05ba
        L_0x047f:
            r5 = 24
            goto L_0x05ba
        L_0x0483:
            java.lang.String r0 = "yeelink.light.ceil31"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x048d
            goto L_0x05ba
        L_0x048d:
            r5 = 23
            goto L_0x05ba
        L_0x0491:
            java.lang.String r0 = "yeelink.light.ceil30"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x049b
            goto L_0x05ba
        L_0x049b:
            r5 = 22
            goto L_0x05ba
        L_0x049f:
            java.lang.String r0 = "yeelink.light.ceil29"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x04a9
            goto L_0x05ba
        L_0x04a9:
            r5 = 21
            goto L_0x05ba
        L_0x04ad:
            java.lang.String r0 = "yeelink.light.ceil27"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x04b7
            goto L_0x05ba
        L_0x04b7:
            r5 = 20
            goto L_0x05ba
        L_0x04bb:
            java.lang.String r0 = "yeelink.light.ceil26"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x04c5
            goto L_0x05ba
        L_0x04c5:
            r5 = 19
            goto L_0x05ba
        L_0x04c9:
            java.lang.String r0 = "yeelink.plug.plug"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x04d3
            goto L_0x05ba
        L_0x04d3:
            r5 = 18
            goto L_0x05ba
        L_0x04d7:
            java.lang.String r0 = "yeelink.light.ble1"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x04e1
            goto L_0x05ba
        L_0x04e1:
            r5 = 17
            goto L_0x05ba
        L_0x04e5:
            java.lang.String r0 = "yeelink.light.ceiling24"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x04ef
            goto L_0x05ba
        L_0x04ef:
            r5 = 16
            goto L_0x05ba
        L_0x04f3:
            java.lang.String r0 = "yeelink.light.ceiling23"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x04fd
            goto L_0x05ba
        L_0x04fd:
            r5 = 15
            goto L_0x05ba
        L_0x0501:
            java.lang.String r0 = "yeelink.light.ceiling22"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x050b
            goto L_0x05ba
        L_0x050b:
            r5 = 14
            goto L_0x05ba
        L_0x050f:
            java.lang.String r0 = "yeelink.light.ceiling21"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0519
            goto L_0x05ba
        L_0x0519:
            r5 = 13
            goto L_0x05ba
        L_0x051d:
            java.lang.String r0 = "yeelink.light.ceiling20"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0527
            goto L_0x05ba
        L_0x0527:
            r5 = 12
            goto L_0x05ba
        L_0x052b:
            java.lang.String r0 = "yeelink.light.ceiling19"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0535
            goto L_0x05ba
        L_0x0535:
            r5 = 11
            goto L_0x05ba
        L_0x0539:
            java.lang.String r0 = "yeelink.light.ceiling18"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0543
            goto L_0x05ba
        L_0x0543:
            r5 = 10
            goto L_0x05ba
        L_0x0547:
            java.lang.String r0 = "yeelink.light.ceiling17"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0551
            goto L_0x05ba
        L_0x0551:
            r5 = 9
            goto L_0x05ba
        L_0x0555:
            java.lang.String r0 = "yeelink.light.ceiling16"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x055f
            goto L_0x05ba
        L_0x055f:
            r5 = 8
            goto L_0x05ba
        L_0x0563:
            java.lang.String r0 = "yeelink.light.ceiling15"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x056c
            goto L_0x05ba
        L_0x056c:
            r5 = 7
            goto L_0x05ba
        L_0x056e:
            java.lang.String r0 = "yeelink.light.ceiling14"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0577
            goto L_0x05ba
        L_0x0577:
            r5 = 6
            goto L_0x05ba
        L_0x0579:
            java.lang.String r0 = "yeelink.light.ceiling13"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0582
            goto L_0x05ba
        L_0x0582:
            r5 = 5
            goto L_0x05ba
        L_0x0584:
            java.lang.String r0 = "yeelink.light.ceiling12"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x058d
            goto L_0x05ba
        L_0x058d:
            r5 = 4
            goto L_0x05ba
        L_0x058f:
            java.lang.String r0 = "yeelink.light.ceiling11"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0598
            goto L_0x05ba
        L_0x0598:
            r5 = 3
            goto L_0x05ba
        L_0x059a:
            java.lang.String r0 = "yeelink.light.ceiling10"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x05a3
            goto L_0x05ba
        L_0x05a3:
            r5 = 2
            goto L_0x05ba
        L_0x05a5:
            java.lang.String r0 = "yeelink.switch.sw1"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x05ae
            goto L_0x05ba
        L_0x05ae:
            r5 = 1
            goto L_0x05ba
        L_0x05b0:
            java.lang.String r0 = "yeelink.bhf_light.v1"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x05b9
            goto L_0x05ba
        L_0x05b9:
            r5 = 0
        L_0x05ba:
            r8 = 2131231412(0x7f0802b4, float:1.8078904E38)
            r0 = 2131231414(0x7f0802b6, float:1.8078908E38)
            r6 = 2131231407(0x7f0802af, float:1.8078894E38)
            switch(r5) {
                case 0: goto L_0x0863;
                case 1: goto L_0x0857;
                case 2: goto L_0x0850;
                case 3: goto L_0x06e8;
                case 4: goto L_0x06e8;
                case 5: goto L_0x06e8;
                case 6: goto L_0x06e8;
                case 7: goto L_0x06e8;
                case 8: goto L_0x0849;
                case 9: goto L_0x0842;
                case 10: goto L_0x083b;
                case 11: goto L_0x0834;
                case 12: goto L_0x082d;
                case 13: goto L_0x0826;
                case 14: goto L_0x081f;
                case 15: goto L_0x0818;
                case 16: goto L_0x0811;
                case 17: goto L_0x0805;
                case 18: goto L_0x07fa;
                case 19: goto L_0x07f3;
                case 20: goto L_0x07ec;
                case 21: goto L_0x07e5;
                case 22: goto L_0x07de;
                case 23: goto L_0x07d7;
                case 24: goto L_0x07d0;
                case 25: goto L_0x07c9;
                case 26: goto L_0x07c2;
                case 27: goto L_0x07b2;
                case 28: goto L_0x07ac;
                case 29: goto L_0x07b2;
                case 30: goto L_0x079f;
                case 31: goto L_0x07b2;
                case 32: goto L_0x079f;
                case 33: goto L_0x079f;
                case 34: goto L_0x0799;
                case 35: goto L_0x079f;
                case 36: goto L_0x0793;
                case 37: goto L_0x078a;
                case 38: goto L_0x0783;
                case 39: goto L_0x077c;
                case 40: goto L_0x0775;
                case 41: goto L_0x0775;
                case 42: goto L_0x0765;
                case 43: goto L_0x075a;
                case 44: goto L_0x0753;
                case 45: goto L_0x0748;
                case 46: goto L_0x0741;
                case 47: goto L_0x0736;
                case 48: goto L_0x072a;
                case 49: goto L_0x072a;
                case 50: goto L_0x071e;
                case 51: goto L_0x0717;
                case 52: goto L_0x0710;
                case 53: goto L_0x0709;
                case 54: goto L_0x06fd;
                case 55: goto L_0x06fd;
                case 56: goto L_0x06f1;
                case 57: goto L_0x06fd;
                case 58: goto L_0x06fd;
                case 59: goto L_0x06fd;
                case 60: goto L_0x06e8;
                case 61: goto L_0x06e1;
                case 62: goto L_0x06da;
                case 63: goto L_0x06da;
                case 64: goto L_0x06e8;
                case 65: goto L_0x06d1;
                case 66: goto L_0x06c5;
                case 67: goto L_0x06b9;
                case 68: goto L_0x06b0;
                case 69: goto L_0x06aa;
                case 70: goto L_0x069e;
                case 71: goto L_0x0698;
                case 72: goto L_0x068c;
                case 73: goto L_0x0685;
                case 74: goto L_0x067e;
                case 75: goto L_0x0677;
                case 76: goto L_0x0685;
                case 77: goto L_0x0670;
                case 78: goto L_0x0669;
                case 79: goto L_0x065d;
                case 80: goto L_0x065d;
                case 81: goto L_0x0657;
                case 82: goto L_0x0650;
                case 83: goto L_0x0644;
                case 84: goto L_0x06e8;
                case 85: goto L_0x06e8;
                case 86: goto L_0x063e;
                case 87: goto L_0x0638;
                case 88: goto L_0x0632;
                case 89: goto L_0x0628;
                case 90: goto L_0x0622;
                case 91: goto L_0x061c;
                case 92: goto L_0x0628;
                case 93: goto L_0x0615;
                case 94: goto L_0x0615;
                case 95: goto L_0x060e;
                case 96: goto L_0x0608;
                case 97: goto L_0x0602;
                case 98: goto L_0x05f6;
                case 99: goto L_0x05ea;
                case 100: goto L_0x0736;
                case 101: goto L_0x05e4;
                case 102: goto L_0x05de;
                case 103: goto L_0x05d8;
                case 104: goto L_0x05c8;
                default: goto L_0x05c6;
            }
        L_0x05c6:
            goto L_0x086f
        L_0x05c8:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231355(0x7f08027b, float:1.8078789E38)
        L_0x05cd:
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.DeviceBrowserContract.DeviceBrowser.f12262f
            r7.f11336b = r8
            r7.f11335a = r2
            goto L_0x086f
        L_0x05d8:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231423(0x7f0802bf, float:1.8078927E38)
            goto L_0x05cd
        L_0x05de:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231421(0x7f0802bd, float:1.8078923E38)
            goto L_0x05cd
        L_0x05e4:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231425(0x7f0802c1, float:1.807893E38)
            goto L_0x062d
        L_0x05ea:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231363(0x7f080283, float:1.8078805E38)
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.DeviceBrowserContract.DeviceBrowser.f12272p
            goto L_0x07a6
        L_0x05f6:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231341(0x7f08026d, float:1.807876E38)
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.DeviceBrowserContract.DeviceBrowser.f12271o
            goto L_0x07a6
        L_0x0602:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231429(0x7f0802c5, float:1.8078939E38)
            goto L_0x05cd
        L_0x0608:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231427(0x7f0802c3, float:1.8078935E38)
            goto L_0x05cd
        L_0x060e:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231405(0x7f0802ad, float:1.807889E38)
            goto L_0x07b7
        L_0x0615:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231409(0x7f0802b1, float:1.8078898E38)
            goto L_0x07b7
        L_0x061c:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231444(0x7f0802d4, float:1.807897E38)
            goto L_0x062d
        L_0x0622:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231447(0x7f0802d7, float:1.8078975E38)
            goto L_0x062d
        L_0x0628:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231446(0x7f0802d6, float:1.8078973E38)
        L_0x062d:
            r8.setImageResource(r0)
            goto L_0x06ed
        L_0x0632:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231351(0x7f080277, float:1.807878E38)
            goto L_0x062d
        L_0x0638:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231368(0x7f080288, float:1.8078815E38)
            goto L_0x062d
        L_0x063e:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231369(0x7f080289, float:1.8078817E38)
            goto L_0x062d
        L_0x0644:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231467(0x7f0802eb, float:1.8079016E38)
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.DeviceBrowserContract.DeviceBrowser.f12278v
            goto L_0x07a6
        L_0x0650:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231380(0x7f080294, float:1.807884E38)
            goto L_0x076a
        L_0x0657:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231335(0x7f080267, float:1.8078748E38)
            goto L_0x062d
        L_0x065d:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231377(0x7f080291, float:1.8078833E38)
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.DeviceBrowserContract.DeviceBrowser.f12277u
            goto L_0x07a6
        L_0x0669:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231457(0x7f0802e1, float:1.8078996E38)
            goto L_0x05cd
        L_0x0670:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231435(0x7f0802cb, float:1.807895E38)
            goto L_0x078f
        L_0x0677:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231433(0x7f0802c9, float:1.8078947E38)
            goto L_0x078f
        L_0x067e:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231431(0x7f0802c7, float:1.8078943E38)
            goto L_0x078f
        L_0x0685:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231357(0x7f08027d, float:1.8078793E38)
            goto L_0x07b7
        L_0x068c:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231401(0x7f0802a9, float:1.8078882E38)
        L_0x0691:
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.DeviceBrowserContract.DeviceBrowser.f12269m
            goto L_0x07a6
        L_0x0698:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231399(0x7f0802a7, float:1.8078878E38)
            goto L_0x06a3
        L_0x069e:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231397(0x7f0802a5, float:1.8078874E38)
        L_0x06a3:
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.DeviceBrowserContract.DeviceBrowser.f12268l
            goto L_0x07a6
        L_0x06aa:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231438(0x7f0802ce, float:1.8078957E38)
            goto L_0x06be
        L_0x06b0:
            android.widget.ImageView r8 = r7.mProductIcon
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.DeviceBrowserContract.DeviceBrowser.f12265i
            goto L_0x07a6
        L_0x06b9:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231439(0x7f0802cf, float:1.807896E38)
        L_0x06be:
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.DeviceBrowserContract.DeviceBrowser.f12267k
            goto L_0x07bc
        L_0x06c5:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231365(0x7f080285, float:1.8078809E38)
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.DeviceBrowserContract.DeviceBrowser.f12266j
            goto L_0x07bc
        L_0x06d1:
            android.widget.ImageView r8 = r7.mProductIcon
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.DeviceBrowserContract.DeviceBrowser.f12265i
            goto L_0x07bc
        L_0x06da:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231339(0x7f08026b, float:1.8078756E38)
            goto L_0x062d
        L_0x06e1:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231337(0x7f080269, float:1.8078752E38)
            goto L_0x062d
        L_0x06e8:
            android.widget.ImageView r0 = r7.mProductIcon
            r0.setImageResource(r8)
        L_0x06ed:
            android.net.Uri r8 = com.yeelight.yeelib.data.DeviceBrowserContract.DeviceBrowser.f12264h
            goto L_0x07a6
        L_0x06f1:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231461(0x7f0802e5, float:1.8079004E38)
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.DeviceBrowserContract.DeviceBrowser.f12259c
            goto L_0x07a6
        L_0x06fd:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231451(0x7f0802db, float:1.8078983E38)
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.DeviceBrowserContract.DeviceBrowser.f12259c
            goto L_0x07bc
        L_0x0709:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231387(0x7f08029b, float:1.8078854E38)
            goto L_0x062d
        L_0x0710:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231385(0x7f080299, float:1.807885E38)
            goto L_0x062d
        L_0x0717:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231388(0x7f08029c, float:1.8078856E38)
            goto L_0x062d
        L_0x071e:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231453(0x7f0802dd, float:1.8078987E38)
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.DeviceBrowserContract.DeviceBrowser.f12261e
            goto L_0x07a6
        L_0x072a:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231449(0x7f0802d9, float:1.807898E38)
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.DeviceBrowserContract.DeviceBrowser.f12260d
            goto L_0x07a6
        L_0x0736:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231362(0x7f080282, float:1.8078803E38)
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.DeviceBrowserContract.DeviceBrowser.f12273q
            goto L_0x07a6
        L_0x0741:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231395(0x7f0802a3, float:1.807887E38)
            goto L_0x06be
        L_0x0748:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231393(0x7f0802a1, float:1.8078866E38)
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.DeviceBrowserContract.DeviceBrowser.f12270n
            goto L_0x07bc
        L_0x0753:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231391(0x7f08029f, float:1.8078862E38)
            goto L_0x0691
        L_0x075a:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231359(0x7f08027f, float:1.8078797E38)
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.DeviceBrowserContract.DeviceBrowser.f12275s
            goto L_0x07a6
        L_0x0765:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231381(0x7f080295, float:1.8078841E38)
        L_0x076a:
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.DeviceBrowserContract.DeviceBrowser.f12274r
        L_0x076f:
            r7.f11336b = r8
            r7.f11335a = r1
            goto L_0x086f
        L_0x0775:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231375(0x7f08028f, float:1.807883E38)
            goto L_0x062d
        L_0x077c:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231373(0x7f08028d, float:1.8078825E38)
            goto L_0x062d
        L_0x0783:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231371(0x7f08028b, float:1.8078821E38)
            goto L_0x062d
        L_0x078a:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231403(0x7f0802ab, float:1.8078886E38)
        L_0x078f:
            r8.setImageResource(r0)
            goto L_0x07a4
        L_0x0793:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231349(0x7f080275, float:1.8078777E38)
            goto L_0x07b7
        L_0x0799:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231347(0x7f080273, float:1.8078772E38)
            goto L_0x07b7
        L_0x079f:
            android.widget.ImageView r8 = r7.mProductIcon
            r8.setImageResource(r6)
        L_0x07a4:
            android.net.Uri r8 = com.yeelight.yeelib.data.DeviceBrowserContract.DeviceBrowser.f12258b
        L_0x07a6:
            r7.f11336b = r8
            r7.f11335a = r4
            goto L_0x086f
        L_0x07ac:
            android.widget.ImageView r8 = r7.mProductIcon
            r8.setImageResource(r6)
            goto L_0x07ba
        L_0x07b2:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231465(0x7f0802e9, float:1.8079012E38)
        L_0x07b7:
            r8.setImageResource(r0)
        L_0x07ba:
            android.net.Uri r8 = com.yeelight.yeelib.data.DeviceBrowserContract.DeviceBrowser.f12258b
        L_0x07bc:
            r7.f11336b = r8
            r7.f11335a = r3
            goto L_0x086f
        L_0x07c2:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231333(0x7f080265, float:1.8078744E38)
            goto L_0x062d
        L_0x07c9:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231331(0x7f080263, float:1.807874E38)
            goto L_0x062d
        L_0x07d0:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231329(0x7f080261, float:1.8078736E38)
            goto L_0x062d
        L_0x07d7:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231327(0x7f08025f, float:1.8078732E38)
            goto L_0x062d
        L_0x07de:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231325(0x7f08025d, float:1.8078728E38)
            goto L_0x062d
        L_0x07e5:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231323(0x7f08025b, float:1.8078724E38)
            goto L_0x062d
        L_0x07ec:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231321(0x7f080259, float:1.807872E38)
            goto L_0x062d
        L_0x07f3:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231319(0x7f080257, float:1.8078716E38)
            goto L_0x062d
        L_0x07fa:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231455(0x7f0802df, float:1.8078991E38)
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.DeviceBrowserContract.DeviceBrowser.f12280x
            goto L_0x07a6
        L_0x0805:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231343(0x7f08026f, float:1.8078764E38)
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.DeviceBrowserContract.DeviceBrowser.f12263g
            goto L_0x076f
        L_0x0811:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231317(0x7f080255, float:1.8078712E38)
            goto L_0x062d
        L_0x0818:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231315(0x7f080253, float:1.8078708E38)
            goto L_0x062d
        L_0x081f:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231313(0x7f080251, float:1.8078703E38)
            goto L_0x062d
        L_0x0826:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231311(0x7f08024f, float:1.80787E38)
            goto L_0x062d
        L_0x082d:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231309(0x7f08024d, float:1.8078695E38)
            goto L_0x062d
        L_0x0834:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231307(0x7f08024b, float:1.8078691E38)
            goto L_0x062d
        L_0x083b:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231305(0x7f080249, float:1.8078687E38)
            goto L_0x062d
        L_0x0842:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231303(0x7f080247, float:1.8078683E38)
            goto L_0x062d
        L_0x0849:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231301(0x7f080245, float:1.807868E38)
            goto L_0x062d
        L_0x0850:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231442(0x7f0802d2, float:1.8078965E38)
            goto L_0x062d
        L_0x0857:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231463(0x7f0802e7, float:1.8079008E38)
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.DeviceBrowserContract.DeviceBrowser.f12279w
            goto L_0x07a6
        L_0x0863:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231281(0x7f080231, float:1.8078639E38)
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.DeviceBrowserContract.DeviceBrowser.f12276t
            goto L_0x07a6
        L_0x086f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.activity.SearchDeviceActivity.m17018t0(com.yeelight.yeelib.models.ProductInfo):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public void m17019u0() {
        C9113d.C9118e eVar = new C9113d.C9118e(this);
        eVar.mo37179i(getString(2131755524)).mo37176f(2131755522).mo37174d(-2, getString(2131755232), new C5658a()).mo37174d(-1, getString(2131755222), new C5669l());
        eVar.mo37180j();
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public void m17020v0() {
        C9113d.C9118e eVar = new C9113d.C9118e(this);
        eVar.mo37179i(getString(2131755523)).mo37176f(2131755525).mo37174d(-2, getString(2131755232), new C5660c()).mo37174d(-1, getString(2131755222), new C5659b());
        eVar.mo37180j();
    }

    /* access modifiers changed from: private */
    /* renamed from: w0 */
    public void m17021w0() {
        startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public void m17022x0() {
        int i = this.f11335a;
        if (i == 0 || i == 3) {
            YeelightDeviceManager.m7800o0().mo23278Z(true, false, false);
        } else {
            YeelightDeviceManager.m7800o0().mo23278Z(false, true, false);
        }
        int i2 = this.f11335a;
        if ((i2 != 0 && i2 != 3) || Build.VERSION.SDK_INT < 31) {
            m17015p0();
        }
    }

    /* renamed from: y0 */
    private void m17023y0() {
        int i = this.f11335a;
        if (i == 0 || i == 3) {
            YeelightDeviceManager.m7800o0().mo23254B1();
        } else {
            YeelightDeviceManager.m7800o0().mo23257C1();
        }
    }

    /* renamed from: E */
    public void mo30149E(C3012e eVar) {
    }

    /* renamed from: L */
    public void mo30150L() {
    }

    /* renamed from: k */
    public void mo30151k() {
        this.f11346l.sendEmptyMessage(2);
    }

    /* renamed from: m */
    public void mo30152m(C3012e eVar) {
    }

    @OnClick({2131297163})
    public void next(View view) {
        List<String> list = this.f11339e;
        if (list != null && !list.isEmpty()) {
            try {
                MiotManager.getDeviceManager().stopScan();
            } catch (MiotException e) {
                e.printStackTrace();
            }
            if (Build.VERSION.SDK_INT < 33 || ContextCompat.checkSelfPermission(this, "android.permission.NEARBY_WIFI_DEVICES") == 0) {
                m17014o0();
            } else if (shouldShowRequestPermissionRationale("android.permission.NEARBY_WIFI_DEVICES")) {
                mo35655S(2131755993);
            } else {
                requestPermissions(new String[]{"android.permission.NEARBY_WIFI_DEVICES"}, 1);
            }
        }
    }

    /* renamed from: o */
    public void mo30153o() {
        int i = this.f11335a;
        if (i == 0 || i == 3) {
            this.f11346l.sendEmptyMessage(1);
        }
    }

    public void onConnectionStateChanged(int i, int i2) {
        runOnUiThread(new C5786k3(this, i2));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        setContentView(C12228R$layout.activity_search_device);
        C9193k.m22157h(true, this);
        ButterKnife.bind((Activity) this);
        setTitleBarPadding(this.mTitleBar);
        setTitleBarPadding(this.mTopLayout);
        this.mTitleBar.mo36195a("", new C5664g(), (View.OnClickListener) null);
        this.f11337c = (ProductInfo) getIntent().getSerializableExtra("product");
        this.f11340f = getIntent().getBooleanExtra("ADD_MESH_GROUP", false);
        m17018t0(this.f11337c);
        AddDeviceCursorAdapter addDeviceCursorAdapter = new AddDeviceCursorAdapter(this, (Cursor) null);
        this.f11338d = addDeviceCursorAdapter;
        addDeviceCursorAdapter.mo31098m(this.f11340f);
        if (this.f11335a == 3) {
            this.f11345k = new HashMap<>();
            this.f11338d.mo31099n(3);
            this.mBtnNext.setText(2131755850);
            this.f11338d.mo31097l(this.f11345k);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setAutoMeasureEnabled(false);
        this.mDeviceList.setLayoutManager(linearLayoutManager);
        this.mDeviceList.setAdapter(this.f11338d);
        this.f11338d.mo31096k(new C5665h());
        this.mBtnRetry.setOnClickListener(new C5666i());
        this.mRefreshLayout.setOnClickListener(new C5667j());
    }

    public Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
        CursorLoader cursorLoader;
        Uri uri = this.f11336b;
        Uri uri2 = DeviceBrowserContract.DeviceBrowser.f12262f;
        Uri uri3 = this.f11336b;
        if (uri == uri2) {
            String productModel = this.f11337c.getProductModel();
            return cursorLoader;
        }
        new CursorLoader(this, uri3, (String[]) null, (String) null, (String[]) null, (String) null);
        return cursorLoader;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f11347m.removeCallbacksAndMessages((Object) null);
        C6094f fVar = this.f11342h;
        if (fVar != null) {
            fVar.mo23133V0(this);
        }
        super.onDestroy();
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
        getContentResolver().unregisterContentObserver(this.f11348n);
        m17023y0();
        this.f11346l.removeCallbacksAndMessages((Object) null);
        YeelightDeviceManager.m7800o0().mo23271L1(this);
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 0) {
            if (i != 1) {
                finish();
            } else if (iArr.length <= 0 || iArr[0] != 0) {
                mo35655S(2131755993);
            } else {
                m17014o0();
            }
        } else if (iArr.length <= 0) {
            finish();
        } else if (iArr[0] == 0) {
            LocationManager locationManager = (LocationManager) getSystemService("location");
            if (!locationManager.isProviderEnabled("gps") && !locationManager.isProviderEnabled("network")) {
                m17020v0();
            }
        } else if (iArr[0] == -1) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        YeelightDeviceManager.m7800o0().mo23309q1(this);
        getLoaderManager().restartLoader(0, (Bundle) null, this);
        getContentResolver().registerContentObserver(DeviceBrowserContract.DeviceBrowser.f12281y, true, this.f11348n);
        m17022x0();
    }

    /* renamed from: s0 */
    public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
        StringBuilder sb = new StringBuilder();
        sb.append("onLoadFinished! mCurrentStep = ");
        sb.append(this.f11343i);
        if (this.f11335a == 3 && this.f11343i != 0) {
            return;
        }
        if (this.f11340f) {
            MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_ID", C6043b.C6044a.C6045a.f12331c});
            ArrayList arrayList = new ArrayList();
            DeviceDataProvider.m17591D();
            int i = 0;
            while (cursor.moveToNext()) {
                C3010c j0 = YeelightDeviceManager.m7794j0(cursor.getString(cursor.getColumnIndex(C6043b.C6044a.C6045a.f12331c)));
                if (j0 instanceof C10898f0) {
                    C10898f0 f0Var = (C10898f0) j0;
                    Cursor J = DeviceDataProvider.m17597J(f0Var.mo23185G());
                    boolean z = J != null && J.moveToFirst();
                    if (f0Var.mo31635V1().getNetworkName().equals("yeelight_ms") || z || arrayList.contains(f0Var.mo31635V1().getNetworkName())) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Found mesh network ");
                        sb2.append(f0Var.mo31635V1().getNetworkName());
                    } else {
                        matrixCursor.addRow(new String[]{String.valueOf(i), f0Var.mo23185G()});
                        arrayList.add(f0Var.mo31635V1().getNetworkName());
                        i++;
                    }
                }
            }
            this.f11338d.mo31092b(matrixCursor);
            return;
        }
        this.f11338d.mo31092b(cursor);
        if (cursor.getCount() == 0) {
            this.mBtnNext.setEnabled(false);
        }
    }

    /* renamed from: t */
    public void mo30160t() {
        int i = this.f11335a;
        if (i != 0 && i != 3) {
            this.f11346l.sendEmptyMessage(1);
        }
    }

    /* renamed from: y */
    public void mo30163y(int i) {
    }
}
