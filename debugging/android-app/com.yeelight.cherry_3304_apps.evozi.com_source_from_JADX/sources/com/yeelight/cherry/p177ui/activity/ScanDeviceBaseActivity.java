package com.yeelight.cherry.p177ui.activity;

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
import com.miot.api.CompletionHandler;
import com.miot.api.MiotManager;
import com.miot.api.bluetooth.XmBluetoothManager;
import com.miot.common.exception.MiotException;
import com.yeelight.cherry.p174b.p175a.C4960c;
import com.yeelight.yeelib.data.C7574b;
import com.yeelight.yeelib.data.C7579c;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p152f.C4239r;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.utils.C10557u;
import com.yeelight.yeelib.utils.C4308b;
import com.yeelight.yeelib.utils.C4311i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.activity.ScanDeviceBaseActivity */
public abstract class ScanDeviceBaseActivity extends BaseActivity implements LoaderManager.LoaderCallbacks<Cursor> {

    /* renamed from: b */
    private String f11717b = getClass().getSimpleName();

    /* renamed from: c */
    private Uri f11718c = C7574b.C7575a.f15318a;

    /* renamed from: d */
    private ContentObserver f11719d = new C5597a(new Handler());

    /* renamed from: com.yeelight.cherry.ui.activity.ScanDeviceBaseActivity$a */
    class C5597a extends ContentObserver {
        C5597a(Handler handler) {
            super(handler);
        }

        public void onChange(boolean z) {
            super.onChange(z);
            ScanDeviceBaseActivity.this.getLoaderManager().restartLoader(0, (Bundle) null, ScanDeviceBaseActivity.this);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ScanDeviceBaseActivity$b */
    class C5598b extends ArrayList<String> {
        C5598b(ScanDeviceBaseActivity scanDeviceBaseActivity) {
            add("yeelink.light.dnlight2");
            add("yeelink.light.spot1");
            add("yeelink.light.meshbulb1");
            add("yeelink.light.meshbulb2");
            add("yeelink.light.ml1");
            add("yeelink.light.ml2");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ScanDeviceBaseActivity$c */
    public class C5599c implements CompletionHandler {

        /* renamed from: a */
        private final C4198d f11721a;

        /* renamed from: b */
        private final String f11722b;

        public C5599c(C4198d dVar) {
            this.f11722b = dVar.mo23372G();
            this.f11721a = dVar;
        }

        /* renamed from: a */
        public /* synthetic */ void mo26885a() {
            if (!ScanDeviceBaseActivity.this.isFinishing()) {
                ScanDeviceBaseActivity.this.startActivity(new Intent(ScanDeviceBaseActivity.this, QuickConnectRequestProgressActivity.class));
                ScanDeviceBaseActivity.this.finish();
            }
        }

        public void onFailed(int i, String str) {
            C4257w.m11947l0().mo23686r1(this.f11722b);
            C4308b.f7489h = true;
            C4257w.m11947l0().mo23656Y();
            C4311i.m12151b(false);
            if (i == 12321) {
                C4257w.m11947l0().mo23653Q(str);
            }
        }

        public void onSucceed() {
            "connectToCloud, onSucceed, remove device from wifi device map: " + this.f11722b;
            C4257w.m11947l0().mo23686r1(this.f11722b);
            C4308b.f7489h = true;
            C4257w.m11947l0().mo23661c0(true, ScanDeviceBaseActivity.this.m16957X(this.f11721a.mo23395T()), this.f11722b);
            C4311i.m12151b(true);
            new Handler(Looper.getMainLooper()).post(new C5728j2(this));
        }
    }

    /* renamed from: W */
    private boolean m16956W(String str) {
        return new C5598b(this).contains(str);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m16957X(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = r7.hashCode()
            r1 = 0
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r0) {
                case -1235140472: goto L_0x0035;
                case -1235140471: goto L_0x002b;
                case -1235140468: goto L_0x0021;
                case -1235140467: goto L_0x0017;
                case 674030242: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x003f
        L_0x000d:
            java.lang.String r0 = "yeelink.curtain.ctmt1"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x003f
            r7 = 0
            goto L_0x0040
        L_0x0017:
            java.lang.String r0 = "yeelink.light.fancl6"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x003f
            r7 = 4
            goto L_0x0040
        L_0x0021:
            java.lang.String r0 = "yeelink.light.fancl5"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x003f
            r7 = 3
            goto L_0x0040
        L_0x002b:
            java.lang.String r0 = "yeelink.light.fancl2"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x003f
            r7 = 2
            goto L_0x0040
        L_0x0035:
            java.lang.String r0 = "yeelink.light.fancl1"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x003f
            r7 = 1
            goto L_0x0040
        L_0x003f:
            r7 = -1
        L_0x0040:
            if (r7 == 0) goto L_0x004b
            if (r7 == r5) goto L_0x004b
            if (r7 == r4) goto L_0x004b
            if (r7 == r3) goto L_0x004b
            if (r7 == r2) goto L_0x004b
            return r1
        L_0x004b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.activity.ScanDeviceBaseActivity.m16957X(java.lang.String):boolean");
    }

    /* renamed from: Y */
    public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
        C4960c cVar;
        "onLoadFinished! device count = " + cursor.getCount();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        while (cursor.moveToNext()) {
            String string = cursor.getString(cursor.getColumnIndex(C7579c.C7580a.C7581a.f15372c));
            C4198d h0 = C4257w.m11945h0(string);
            if (h0 == null) {
                "onLoadFinished device is null: " + string;
            } else {
                "onLoadFinished model: " + h0.mo23395T();
                if (!m16956W(h0.mo23395T())) {
                    cVar = new C4960c();
                    cVar.mo26056a(h0);
                } else if (hashMap.containsKey(h0.mo23395T())) {
                    ((C4960c) hashMap.get(h0.mo23395T())).mo26056a(h0);
                } else {
                    cVar = new C4960c();
                    cVar.mo26056a(h0);
                    hashMap.put(h0.mo23395T(), cVar);
                }
                arrayList.add(cVar);
            }
        }
        mo26880a0(arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public void mo26879Z(C4960c cVar) {
        String e = cVar.mo26060e();
        if (C4257w.m11923P0(e)) {
            Intent intent = new Intent(this, SearchDeviceActivity.class);
            intent.putExtra("product", C4239r.m11807g().mo23575h(e));
            startActivity(intent);
        } else if (TextUtils.equals(e, "yeelink.light.ble1") || TextUtils.equals("yeelink.light.gingko", e)) {
            List<C4198d> c = cVar.mo26058c();
            if (c.size() == 1) {
                Intent intent2 = new Intent(this, BluetoothConnectNewActivity.class);
                intent2.putExtra("com.yeelight.cherry.device_id", c.get(0).mo23372G());
                startActivity(intent2);
            }
        } else {
            List<C4198d> c2 = cVar.mo26058c();
            if (c2.size() == 1) {
                C4198d dVar = c2.get(0);
                XmBluetoothManager.getInstance().setDeviceConfig(C10557u.m25804a(dVar.mo23395T()));
                try {
                    MiotManager.getDeviceConnector().connectToCloud(dVar.mo23393S(), new C5599c(dVar));
                } catch (MiotException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public abstract void mo26880a0(List<C4960c> list);

    public Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
        return new CursorLoader(this, this.f11718c, (String[]) null, (String) null, (String[]) null, (String) null);
    }

    public void onLoaderReset(Loader<Cursor> loader) {
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        getContentResolver().unregisterContentObserver(this.f11719d);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        getLoaderManager().restartLoader(0, (Bundle) null, this);
        getContentResolver().registerContentObserver(C7574b.C7575a.f15342y, true, this.f11719d);
    }
}
