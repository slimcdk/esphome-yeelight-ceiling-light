package com.yeelight.cherry.p141ui.activity;

import android.app.LoaderManager;
import android.content.CursorLoader;
import android.content.Intent;
import android.content.Loader;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.miot.api.IConfigHandler;
import com.miot.api.MiotManager;
import com.miot.api.bluetooth.XmBluetoothManager;
import com.miot.common.exception.MiotException;
import com.yeelight.yeelib.data.C6043b;
import com.yeelight.yeelib.data.DeviceBrowserContract;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.managers.C3088r;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p051j4.C3279g;
import p051j4.C9203s;
import p197p3.C10267c;

/* renamed from: com.yeelight.cherry.ui.activity.ScanDeviceBaseActivity */
public abstract class ScanDeviceBaseActivity extends BaseActivity implements LoaderManager.LoaderCallbacks<Cursor> {

    /* renamed from: a */
    private String f11287a = getClass().getSimpleName();

    /* renamed from: b */
    private Uri f11288b = DeviceBrowserContract.DeviceBrowser.f12257a;

    /* renamed from: c */
    private ContentObserver f11289c = new C5639a(new Handler());

    /* renamed from: com.yeelight.cherry.ui.activity.ScanDeviceBaseActivity$a */
    class C5639a extends ContentObserver {
        C5639a(Handler handler) {
            super(handler);
        }

        public void onChange(boolean z) {
            super.onChange(z);
            ScanDeviceBaseActivity.this.getLoaderManager().restartLoader(0, (Bundle) null, ScanDeviceBaseActivity.this);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ScanDeviceBaseActivity$b */
    public class C5640b extends IConfigHandler.Stub {

        /* renamed from: a */
        private final C3010c f11291a;

        /* renamed from: b */
        private final String f11292b;

        public C5640b(C3010c cVar) {
            this.f11292b = cVar.mo23185G();
            this.f11291a = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m16963e() {
            if (!ScanDeviceBaseActivity.this.isFinishing()) {
                ScanDeviceBaseActivity.this.startActivity(new Intent(ScanDeviceBaseActivity.this, QuickConnectRequestProgressActivity.class));
                ScanDeviceBaseActivity.this.finish();
            }
        }

        public void onFailed(int i, String str) {
            YeelightDeviceManager.m7800o0().mo23320v1(this.f11292b);
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
            sb.append(this.f11292b);
            YeelightDeviceManager.m7800o0().mo23320v1(this.f11292b);
            AppUtils.f4986j = true;
            YeelightDeviceManager.m7800o0().mo23286e0(true, ScanDeviceBaseActivity.this.m16958X(this.f11291a.mo23208T()), this.f11292b);
            C3279g.m8802b(true);
            new Handler(Looper.getMainLooper()).post(new C5756f3(this));
        }
    }

    /* renamed from: W */
    private boolean m16957W(String str) {
        return new ArrayList<String>() {
            {
                add("yeelink.light.dnlight2");
                add("yeelink.light.spot1");
                add("yeelink.light.meshbulb1");
                add("yeelink.light.meshbulb2");
                add("yeelink.light.ml1");
                add("yeelink.light.ml2");
            }
        }.contains(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public boolean m16958X(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1235140472:
                if (str.equals("yeelink.light.fancl1")) {
                    c = 0;
                    break;
                }
                break;
            case -1235140471:
                if (str.equals("yeelink.light.fancl2")) {
                    c = 1;
                    break;
                }
                break;
            case -1235140468:
                if (str.equals("yeelink.light.fancl5")) {
                    c = 2;
                    break;
                }
                break;
            case -1235140467:
                if (str.equals("yeelink.light.fancl6")) {
                    c = 3;
                    break;
                }
                break;
            case 674030242:
                if (str.equals("yeelink.curtain.ctmt1")) {
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

    /* renamed from: Y */
    public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
        C10267c cVar;
        StringBuilder sb = new StringBuilder();
        sb.append("onLoadFinished! device count = ");
        sb.append(cursor.getCount());
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        while (cursor.moveToNext()) {
            String string = cursor.getString(cursor.getColumnIndex(C6043b.C6044a.C6045a.f12331c));
            C3010c j0 = YeelightDeviceManager.m7794j0(string);
            if (j0 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onLoadFinished device is null: ");
                sb2.append(string);
            } else if (!C3088r.m8117g().mo23474o(j0.mo23208T())) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("searched a deivce, but the server not support it. Model:  ");
                sb3.append(j0.mo23208T());
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("onLoadFinished model: ");
                sb4.append(j0.mo23208T());
                if (!m16957W(j0.mo23208T())) {
                    cVar = new C10267c();
                    cVar.mo41744a(j0);
                } else if (hashMap.containsKey(j0.mo23208T())) {
                    ((C10267c) hashMap.get(j0.mo23208T())).mo41744a(j0);
                } else {
                    cVar = new C10267c();
                    cVar.mo41744a(j0);
                    hashMap.put(j0.mo23208T(), cVar);
                }
                arrayList.add(cVar);
            }
        }
        mo30860a0(arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public void mo30859Z(C10267c cVar) {
        String e = cVar.mo41748e();
        if (YeelightDeviceManager.m7773T0(e)) {
            Intent intent = new Intent(this, SearchDeviceActivity.class);
            intent.putExtra("product", C3088r.m8117g().mo23468h(e));
            startActivity(intent);
        } else if (TextUtils.equals(e, "yeelink.light.ble1") || TextUtils.equals("yeelink.light.gingko", e)) {
            List<C3010c> c = cVar.mo41746c();
            if (c.size() == 1) {
                Intent intent2 = new Intent(this, BluetoothConnectNewActivity.class);
                intent2.putExtra("com.yeelight.cherry.device_id", c.get(0).mo23185G());
                startActivity(intent2);
            }
        } else {
            List<C3010c> c2 = cVar.mo41746c();
            if (c2.size() == 1) {
                C3010c cVar2 = c2.get(0);
                XmBluetoothManager.getInstance().setDeviceConfig(C9203s.m22203a(cVar2.mo23208T()));
                try {
                    MiotManager.getDeviceConnector().connectToCloud(cVar2.mo23206S(), new C5640b(cVar2));
                } catch (MiotException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public abstract void mo30860a0(List<C10267c> list);

    public Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
        return new CursorLoader(this, this.f11288b, (String[]) null, (String) null, (String[]) null, (String) null);
    }

    public void onLoaderReset(Loader<Cursor> loader) {
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        getContentResolver().unregisterContentObserver(this.f11289c);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        getLoaderManager().restartLoader(0, (Bundle) null, this);
        getContentResolver().registerContentObserver(DeviceBrowserContract.DeviceBrowser.f12281y, true, this.f11289c);
    }
}
