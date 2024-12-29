package com.yeelight.cherry.p141ui.activity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.adapter.ProductFromCategoryAdapter;
import com.yeelight.yeelib.managers.C3088r;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.managers.C8272e;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.C8325q;
import com.yeelight.yeelib.models.ProductInfo;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import java.util.List;
import p051j4.C9193k;
import p170i4.C9113d;

/* renamed from: com.yeelight.cherry.ui.activity.ProductListFromCategoryActivity */
public class ProductListFromCategoryActivity extends BaseActivity {

    /* renamed from: a */
    private BroadcastReceiver f11179a = new C5599a();

    /* renamed from: b */
    private BroadcastReceiver f11180b = new C5600b();

    /* renamed from: c */
    private C9113d f11181c;

    /* renamed from: d */
    private C9113d f11182d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ProgressDialog f11183e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ProductInfo f11184f;
    @BindView(2131297386)
    RecyclerView mRvProduct;
    @BindView(2131297591)
    CommonTitleBar mTitleBar;

    /* renamed from: com.yeelight.cherry.ui.activity.ProductListFromCategoryActivity$a */
    class C5599a extends BroadcastReceiver {
        C5599a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (ProductListFromCategoryActivity.this.f11184f != null) {
                if (intent.getAction().equals("android.bluetooth.adapter.action.STATE_CHANGED") && intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10) == 12) {
                    if (ProductListFromCategoryActivity.this.f11183e != null) {
                        ProductListFromCategoryActivity.this.f11183e.dismiss();
                    }
                    int i = C5601c.f11187a[YeelightDeviceManager.m7796l0(ProductListFromCategoryActivity.this.f11184f.getProductModel()).ordinal()];
                    if (!(i == 1 || i == 2 || i == 3)) {
                        if (i != 4 && i != 5) {
                            return;
                        }
                        if (!C8272e.m19511b().mo35205e()) {
                            ProductListFromCategoryActivity.this.m16910k0();
                            return;
                        }
                    }
                    ProductListFromCategoryActivity productListFromCategoryActivity = ProductListFromCategoryActivity.this;
                    productListFromCategoryActivity.m16909j0(productListFromCategoryActivity.f11184f);
                } else if (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10) == 10 && ProductListFromCategoryActivity.this.f11183e != null) {
                    ProductListFromCategoryActivity.this.f11183e.dismiss();
                }
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ProductListFromCategoryActivity$b */
    class C5600b extends BroadcastReceiver {
        C5600b() {
        }

        public void onReceive(Context context, Intent intent) {
            if (ProductListFromCategoryActivity.this.f11184f != null) {
                int intExtra = intent.getIntExtra("wifi_state", 0);
                if (intExtra == 3) {
                    if (ProductListFromCategoryActivity.this.f11183e != null) {
                        ProductListFromCategoryActivity.this.f11183e.dismiss();
                    }
                    ProductListFromCategoryActivity productListFromCategoryActivity = ProductListFromCategoryActivity.this;
                    productListFromCategoryActivity.m16909j0(productListFromCategoryActivity.f11184f);
                } else if (intExtra == 1 && ProductListFromCategoryActivity.this.f11183e != null) {
                    ProductListFromCategoryActivity.this.f11183e.dismiss();
                }
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ProductListFromCategoryActivity$c */
    static /* synthetic */ class C5601c {

        /* renamed from: a */
        static final /* synthetic */ int[] f11187a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.yeelight.yeelib.device.DeviceType[] r0 = com.yeelight.yeelib.device.DeviceType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11187a = r0
                com.yeelight.yeelib.device.DeviceType r1 = com.yeelight.yeelib.device.DeviceType.YEELIGHT_BLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11187a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.DeviceType r1 = com.yeelight.yeelib.device.DeviceType.YEELIGHT_BLE_MESH     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11187a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yeelight.yeelib.device.DeviceType r1 = com.yeelight.yeelib.device.DeviceType.MI_BLE_MESH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f11187a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.yeelight.yeelib.device.DeviceType r1 = com.yeelight.yeelib.device.DeviceType.MI_WIFI_BLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f11187a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.yeelight.yeelib.device.DeviceType r1 = com.yeelight.yeelib.device.DeviceType.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f11187a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.yeelight.yeelib.device.DeviceType r1 = com.yeelight.yeelib.device.DeviceType.MI_WIFI     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.activity.ProductListFromCategoryActivity.C5601c.<clinit>():void");
        }
    }

    /* renamed from: d0 */
    private boolean m16903d0() {
        if (Build.VERSION.SDK_INT < 31) {
            return true;
        }
        return ContextCompat.checkSelfPermission(this, "android.permission.BLUETOOTH_SCAN") == 0 && ContextCompat.checkSelfPermission(this, "android.permission.BLUETOOTH_CONNECT") == 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public /* synthetic */ void m16904e0(View view) {
        onBackPressed();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0060, code lost:
        if (com.yeelight.yeelib.managers.C8272e.m19511b().mo35205e() != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0062, code lost:
        m16909j0(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0067, code lost:
        m16910k0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0084, code lost:
        if (com.yeelight.yeelib.managers.C8272e.m19511b().mo35205e() != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a8, code lost:
        if (com.yeelight.yeelib.managers.C8272e.m19511b().mo35203c() != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ab, code lost:
        m16908i0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b9, code lost:
        mo35655S(2131755993);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void m16905f0(int r6, com.yeelight.yeelib.models.ProductInfo r7) {
        /*
            r5 = this;
            r5.f11184f = r7
            java.lang.String r6 = r7.getProductModel()
            r6.hashCode()
            int r0 = r6.hashCode()
            r1 = 1
            r2 = -1
            switch(r0) {
                case -454053748: goto L_0x0029;
                case 250266083: goto L_0x001e;
                case 1557976171: goto L_0x0013;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0033
        L_0x0013:
            java.lang.String r0 = "yeelink.light.glcolor"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x001c
            goto L_0x0033
        L_0x001c:
            r2 = 2
            goto L_0x0033
        L_0x001e:
            java.lang.String r0 = "yeelink.light.gingko.group"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0027
            goto L_0x0033
        L_0x0027:
            r2 = 1
            goto L_0x0033
        L_0x0029:
            java.lang.String r0 = "yeelink.light.group"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0032
            goto L_0x0033
        L_0x0032:
            r2 = 0
        L_0x0033:
            switch(r2) {
                case 0: goto L_0x00dd;
                case 1: goto L_0x00d0;
                case 2: goto L_0x00c5;
                default: goto L_0x0036;
            }
        L_0x0036:
            int[] r6 = com.yeelight.cherry.p141ui.activity.ProductListFromCategoryActivity.C5601c.f11187a
            com.yeelight.yeelib.models.ProductInfo r0 = r5.f11184f
            java.lang.String r0 = r0.getProductModel()
            com.yeelight.yeelib.device.DeviceType r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.m7796l0(r0)
            int r0 = r0.ordinal()
            r6 = r6[r0]
            r0 = 2131755993(0x7f1003d9, float:1.914288E38)
            r1 = 1001(0x3e9, float:1.403E-42)
            java.lang.String r2 = "android.permission.BLUETOOTH_CONNECT"
            r3 = 31
            java.lang.String r4 = "android.permission.BLUETOOTH_SCAN"
            switch(r6) {
                case 1: goto L_0x009a;
                case 2: goto L_0x009a;
                case 3: goto L_0x009a;
                case 4: goto L_0x006c;
                case 5: goto L_0x006c;
                case 6: goto L_0x0058;
                default: goto L_0x0056;
            }
        L_0x0056:
            goto L_0x00e5
        L_0x0058:
            com.yeelight.yeelib.managers.e r6 = com.yeelight.yeelib.managers.C8272e.m19511b()
            boolean r6 = r6.mo35205e()
            if (r6 == 0) goto L_0x0067
        L_0x0062:
            r5.m16909j0(r7)
            goto L_0x00e5
        L_0x0067:
            r5.m16910k0()
            goto L_0x00e5
        L_0x006c:
            boolean r6 = r5.m16903d0()
            if (r6 == 0) goto L_0x0087
            com.yeelight.yeelib.managers.e r6 = com.yeelight.yeelib.managers.C8272e.m19511b()
            boolean r6 = r6.mo35203c()
            if (r6 == 0) goto L_0x00ab
            com.yeelight.yeelib.managers.e r6 = com.yeelight.yeelib.managers.C8272e.m19511b()
            boolean r6 = r6.mo35205e()
            if (r6 == 0) goto L_0x0067
            goto L_0x0062
        L_0x0087:
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r3) goto L_0x00e5
            boolean r6 = androidx.core.app.ActivityCompat.shouldShowRequestPermissionRationale(r5, r4)
            if (r6 == 0) goto L_0x0092
            goto L_0x00b9
        L_0x0092:
            java.lang.String[] r6 = new java.lang.String[]{r4, r2}
            androidx.core.app.ActivityCompat.requestPermissions(r5, r6, r1)
            goto L_0x00e5
        L_0x009a:
            boolean r6 = r5.m16903d0()
            if (r6 == 0) goto L_0x00af
            com.yeelight.yeelib.managers.e r6 = com.yeelight.yeelib.managers.C8272e.m19511b()
            boolean r6 = r6.mo35203c()
            if (r6 == 0) goto L_0x00ab
            goto L_0x0062
        L_0x00ab:
            r5.m16908i0()
            goto L_0x00e5
        L_0x00af:
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r3) goto L_0x00e5
            boolean r6 = androidx.core.app.ActivityCompat.shouldShowRequestPermissionRationale(r5, r4)
            if (r6 == 0) goto L_0x00bd
        L_0x00b9:
            r5.mo35655S(r0)
            goto L_0x00e5
        L_0x00bd:
            java.lang.String[] r6 = new java.lang.String[]{r4, r2}
            androidx.core.app.ActivityCompat.requestPermissions(r5, r6, r1)
            goto L_0x00e5
        L_0x00c5:
            android.content.Intent r6 = new android.content.Intent
            java.lang.Class<com.yeelight.cherry.ui.activity.GoogleSeamlessActivity> r7 = com.yeelight.cherry.p141ui.activity.GoogleSeamlessActivity.class
            r6.<init>(r5, r7)
        L_0x00cc:
            r5.startActivity(r6)
            goto L_0x00e5
        L_0x00d0:
            android.content.Intent r6 = new android.content.Intent
            java.lang.Class<com.yeelight.cherry.ui.activity.AddNetworkActivity> r7 = com.yeelight.cherry.p141ui.activity.AddNetworkActivity.class
            r6.<init>(r5, r7)
            java.lang.String r7 = "ADD_MESH_GROUP"
            r6.putExtra(r7, r1)
            goto L_0x00cc
        L_0x00dd:
            android.content.Intent r6 = new android.content.Intent
            java.lang.Class<com.yeelight.cherry.ui.activity.CreateGroupNameActivity> r7 = com.yeelight.cherry.p141ui.activity.CreateGroupNameActivity.class
            r6.<init>(r5, r7)
            goto L_0x00cc
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.activity.ProductListFromCategoryActivity.m16905f0(int, com.yeelight.yeelib.models.ProductInfo):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public /* synthetic */ void m16906g0(DialogInterface dialogInterface, int i) {
        C3108x.m8223f().mo23541b().enable();
        dialogInterface.dismiss();
        this.f11183e.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public /* synthetic */ void m16907h0(DialogInterface dialogInterface, int i) {
        C3108x.m8223f().mo23547m(this, true);
        dialogInterface.dismiss();
        this.f11183e.show();
    }

    /* renamed from: i0 */
    private void m16908i0() {
        if (this.f11181c == null) {
            this.f11181c = new C9113d.C9118e(this).mo37178h(2131755195).mo37176f(2131755196).mo37174d(-2, getString(2131755232), (DialogInterface.OnClickListener) null).mo37174d(-1, getString(2131755197), new C5863z2(this)).mo37172b();
            ProgressDialog progressDialog = new ProgressDialog(this, 3);
            this.f11183e = progressDialog;
            progressDialog.setMessage(getString(2131755364));
            this.f11183e.setCancelable(false);
        }
        this.f11181c.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public void m16909j0(ProductInfo productInfo) {
        Intent intent = new Intent(this, DeviceResetActivity.class);
        intent.putExtra("product", productInfo);
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public void m16910k0() {
        if (this.f11182d == null) {
            this.f11182d = new C9113d.C9118e(this).mo37178h(2131755200).mo37176f(2131755201).mo37174d(-2, getString(2131755232), (DialogInterface.OnClickListener) null).mo37174d(-1, getString(2131755197), new C5858y2(this)).mo37172b();
            ProgressDialog progressDialog = new ProgressDialog(this, 3);
            this.f11183e = progressDialog;
            progressDialog.setMessage(getString(2131755364));
            this.f11183e.setCancelable(false);
        }
        this.f11182d.show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C12228R$layout.activity_product_list_from_category);
        C9193k.m22157h(true, this);
        ButterKnife.bind((Activity) this);
        C8325q j = C3088r.m8117g().mo23470j(getIntent().getIntExtra("extra_category_id", 0));
        this.mTitleBar.mo36195a(getString(j.mo35413g()), new C5726a3(this), (View.OnClickListener) null);
        this.mTitleBar.setTitleTextSize(16);
        List<ProductInfo> c = j.mo35409c();
        this.mRvProduct.setLayoutManager(new LinearLayoutManager(this));
        ProductFromCategoryAdapter productFromCategoryAdapter = new ProductFromCategoryAdapter(this, c);
        registerReceiver(this.f11179a, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        registerReceiver(this.f11180b, new IntentFilter("android.net.wifi.WIFI_STATE_CHANGED"));
        productFromCategoryAdapter.mo31171e(new C5732b3(this));
        this.mRvProduct.setAdapter(productFromCategoryAdapter);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f11179a);
        unregisterReceiver(this.f11180b);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C9113d dVar = this.f11181c;
        if (dVar != null && dVar.isShowing()) {
            this.f11181c.dismiss();
        }
        C9113d dVar2 = this.f11182d;
        if (dVar2 != null && dVar2.isShowing()) {
            this.f11182d.dismiss();
        }
        ProgressDialog progressDialog = this.f11183e;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f11183e.dismiss();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
        if (com.yeelight.yeelib.managers.C8272e.m19511b().mo35203c() != false) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRequestPermissionsResult(int r1, @androidx.annotation.NonNull java.lang.String[] r2, @androidx.annotation.NonNull int[] r3) {
        /*
            r0 = this;
            super.onRequestPermissionsResult(r1, r2, r3)
            r2 = 1001(0x3e9, float:1.403E-42)
            if (r1 != r2) goto L_0x0060
            int r1 = r3.length
            if (r1 <= 0) goto L_0x0060
            r1 = 0
            r1 = r3[r1]
            if (r1 != 0) goto L_0x0060
            com.yeelight.yeelib.models.ProductInfo r1 = r0.f11184f
            if (r1 != 0) goto L_0x0014
            return
        L_0x0014:
            int[] r2 = com.yeelight.cherry.p141ui.activity.ProductListFromCategoryActivity.C5601c.f11187a
            java.lang.String r1 = r1.getProductModel()
            com.yeelight.yeelib.device.DeviceType r1 = com.yeelight.yeelib.managers.YeelightDeviceManager.m7796l0(r1)
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            if (r1 == r2) goto L_0x004d
            r2 = 2
            if (r1 == r2) goto L_0x004d
            r2 = 3
            if (r1 == r2) goto L_0x004d
            r2 = 4
            if (r1 == r2) goto L_0x0034
            r2 = 5
            if (r1 == r2) goto L_0x0034
            goto L_0x0060
        L_0x0034:
            com.yeelight.yeelib.managers.e r1 = com.yeelight.yeelib.managers.C8272e.m19511b()
            boolean r1 = r1.mo35203c()
            if (r1 == 0) goto L_0x005d
            com.yeelight.yeelib.managers.e r1 = com.yeelight.yeelib.managers.C8272e.m19511b()
            boolean r1 = r1.mo35205e()
            if (r1 == 0) goto L_0x0049
            goto L_0x0057
        L_0x0049:
            r0.m16910k0()
            goto L_0x0060
        L_0x004d:
            com.yeelight.yeelib.managers.e r1 = com.yeelight.yeelib.managers.C8272e.m19511b()
            boolean r1 = r1.mo35203c()
            if (r1 == 0) goto L_0x005d
        L_0x0057:
            com.yeelight.yeelib.models.ProductInfo r1 = r0.f11184f
            r0.m16909j0(r1)
            goto L_0x0060
        L_0x005d:
            r0.m16908i0()
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.activity.ProductListFromCategoryActivity.onRequestPermissionsResult(int, java.lang.String[], int[]):void");
    }
}
