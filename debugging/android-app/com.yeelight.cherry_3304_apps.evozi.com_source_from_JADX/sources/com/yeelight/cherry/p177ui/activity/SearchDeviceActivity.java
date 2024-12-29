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
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.miot.api.CompletionHandler;
import com.miot.api.MiotManager;
import com.miot.api.bluetooth.XmBluetoothManager;
import com.miot.common.exception.MiotException;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p177ui.adapter.AddDeviceCursorAdapter;
import com.yeelight.yeelib.data.C7574b;
import com.yeelight.yeelib.data.C7579c;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.p150c.C6000f;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6039j;
import com.yeelight.yeelib.p150c.p183m.C6459e0;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p153g.C9850s;
import com.yeelight.yeelib.p153g.C9855x;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p186e.C9769d;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C10557u;
import com.yeelight.yeelib.utils.C4308b;
import com.yeelight.yeelib.utils.C4311i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceActivity */
public class SearchDeviceActivity extends BaseActivity implements LoaderManager.LoaderCallbacks<Cursor>, C9769d, C9768c {

    /* renamed from: b */
    private int f11764b = 0;

    /* renamed from: c */
    private Uri f11765c = C7574b.C7575a.f15318a;

    /* renamed from: d */
    private C9855x f11766d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public AddDeviceCursorAdapter f11767e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public List<String> f11768f;

    /* renamed from: g */
    private boolean f11769g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f11770h = true;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C6039j f11771i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f11772j = 0;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f11773k = -1;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public HashMap<String, Integer> f11774l;

    /* renamed from: m */
    private Handler f11775m = new Handler(new C5620d());
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
    @BindView(2131296513)
    FrameLayout mTopLayout;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public Handler f11776n = new Handler(new C5621e());

    /* renamed from: o */
    private ContentObserver f11777o = new C5622f(new Handler());

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceActivity$a */
    class C5617a implements DialogInterface.OnClickListener {
        C5617a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            SearchDeviceActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceActivity$b */
    class C5618b implements DialogInterface.OnClickListener {
        C5618b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SearchDeviceActivity.this.m17013t0();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceActivity$c */
    class C5619c implements DialogInterface.OnClickListener {
        C5619c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            SearchDeviceActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceActivity$d */
    class C5620d implements Handler.Callback {
        C5620d() {
        }

        public boolean handleMessage(Message message) {
            TextView textView;
            int i;
            int i2 = message.what;
            if (i2 == 1) {
                boolean unused = SearchDeviceActivity.this.f11770h = false;
                SearchDeviceActivity.this.mRefreshImg.setVisibility(0);
                SearchDeviceActivity.this.mRefreshProgress.setVisibility(8);
                textView = SearchDeviceActivity.this.mRefreshText;
                i = 2131755083;
            } else if (i2 != 2) {
                if (i2 == 3) {
                    SearchDeviceActivity.this.m17011r0();
                } else if (i2 == 4) {
                    LocationManager locationManager = (LocationManager) SearchDeviceActivity.this.getSystemService("location");
                    if (!locationManager.isProviderEnabled("gps") && !locationManager.isProviderEnabled("network")) {
                        SearchDeviceActivity.this.m17012s0();
                    }
                }
                return false;
            } else {
                boolean unused2 = SearchDeviceActivity.this.f11770h = true;
                SearchDeviceActivity.this.mRefreshImg.setVisibility(8);
                SearchDeviceActivity.this.mRefreshProgress.setVisibility(0);
                textView = SearchDeviceActivity.this.mRefreshText;
                i = 2131755084;
            }
            textView.setText(i);
            return false;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceActivity$e */
    class C5621e implements Handler.Callback {
        C5621e() {
        }

        public boolean handleMessage(Message message) {
            boolean z;
            int i = message.what;
            if (i == 5) {
                SearchDeviceActivity.this.mBtnNext.setEnabled(false);
                int unused = SearchDeviceActivity.this.f11773k = -1;
            } else if (i != 6) {
                if (i == 7) {
                    SearchDeviceActivity.this.f11776n.sendEmptyMessage(6);
                } else if (i == 8) {
                    SearchDeviceActivity.this.f11776n.removeMessages(7);
                    SearchDeviceActivity.this.mTitle.setText(2131755237);
                    SearchDeviceActivity.this.mSubInfo.setText(2131755841);
                    Iterator it = SearchDeviceActivity.this.f11768f.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                            break;
                        }
                        String str = (String) it.next();
                        if (SearchDeviceActivity.this.f11774l != null && SearchDeviceActivity.this.f11774l.containsKey(str) && 2 != ((Integer) SearchDeviceActivity.this.f11774l.get(str)).intValue()) {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        int unused2 = SearchDeviceActivity.this.f11772j = 3;
                    } else {
                        int unused3 = SearchDeviceActivity.this.f11772j = 2;
                        SearchDeviceActivity.this.mBtnRetry.setVisibility(0);
                    }
                    int unused4 = SearchDeviceActivity.this.f11773k = -1;
                    SearchDeviceActivity.this.mBtnNext.setEnabled(true);
                    SearchDeviceActivity.this.f11767e.notifyDataSetChanged();
                }
                return false;
            }
            SearchDeviceActivity.this.mBtnRetry.setVisibility(8);
            if (SearchDeviceActivity.this.f11771i != null) {
                SearchDeviceActivity.this.f11771i.mo23319V0(SearchDeviceActivity.this);
            }
            int c0 = SearchDeviceActivity.this.f11773k + 1;
            while (c0 < SearchDeviceActivity.this.f11768f.size()) {
                C4198d h0 = C4257w.m11945h0((String) SearchDeviceActivity.this.f11768f.get(c0));
                if (!(h0 instanceof C6039j)) {
                    c0++;
                } else {
                    int unused5 = SearchDeviceActivity.this.f11773k = c0;
                    C6039j jVar = (C6039j) h0;
                    C6039j unused6 = SearchDeviceActivity.this.f11771i = jVar;
                    jVar.mo23363A0(SearchDeviceActivity.this, false);
                    if (jVar.mo23331k0()) {
                        SearchDeviceActivity.this.f11776n.sendEmptyMessage(6);
                    } else {
                        jVar.mo23337n();
                    }
                    SearchDeviceActivity.this.f11774l.put(jVar.mo23372G(), 1);
                    SearchDeviceActivity.this.f11776n.removeMessages(7);
                    SearchDeviceActivity.this.f11776n.sendEmptyMessageDelayed(7, 25000);
                    SearchDeviceActivity.this.f11767e.notifyDataSetChanged();
                    SearchDeviceActivity searchDeviceActivity = SearchDeviceActivity.this;
                    searchDeviceActivity.mTitle.setText(searchDeviceActivity.getString(2131755843, new Object[]{Integer.valueOf(searchDeviceActivity.f11773k + 1), Integer.valueOf(SearchDeviceActivity.this.f11768f.size())}));
                    SearchDeviceActivity.this.mSubInfo.setText(2131755842);
                    return false;
                }
            }
            SearchDeviceActivity.this.f11776n.sendEmptyMessage(8);
            return false;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceActivity$f */
    class C5622f extends ContentObserver {
        C5622f(Handler handler) {
            super(handler);
        }

        public void onChange(boolean z) {
            super.onChange(z);
            SearchDeviceActivity.this.getLoaderManager().restartLoader(0, (Bundle) null, SearchDeviceActivity.this);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceActivity$g */
    class C5623g implements View.OnClickListener {
        C5623g() {
        }

        public void onClick(View view) {
            SearchDeviceActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceActivity$h */
    class C5624h implements AddDeviceCursorAdapter.C5803b {
        C5624h() {
        }

        /* renamed from: a */
        public void mo26114a(List<String> list) {
            Button button;
            boolean z;
            List unused = SearchDeviceActivity.this.f11768f = list;
            if (SearchDeviceActivity.this.f11768f == null || SearchDeviceActivity.this.f11768f.isEmpty()) {
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
    class C5625i implements View.OnClickListener {
        C5625i() {
        }

        public void onClick(View view) {
            SearchDeviceActivity.this.f11776n.sendEmptyMessage(5);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceActivity$j */
    class C5626j implements View.OnClickListener {
        C5626j() {
        }

        public void onClick(View view) {
            if (!SearchDeviceActivity.this.f11770h) {
                SearchDeviceActivity.this.m17014u0();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceActivity$k */
    class C5627k implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10526e f11788a;

        /* renamed from: b */
        final /* synthetic */ String f11789b;

        C5627k(C10526e eVar, String str) {
            this.f11788a = eVar;
            this.f11789b = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String obj = this.f11788a.mo33332c().getText().toString();
            C9850s sVar = new C9850s();
            sVar.mo31826f(this.f11789b);
            sVar.mo31828h(obj);
            sVar.mo31827g(this.f11789b);
            int d = DeviceDataProvider.m22398d(sVar);
            sVar.mo31824e(d);
            if (d > 0) {
                C4257w.m11947l0().mo23652P(new C6000f(sVar));
            }
            dialogInterface.dismiss();
            Intent intent = new Intent(SearchDeviceActivity.this, MainActivity.class);
            intent.addFlags(67108864);
            SearchDeviceActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceActivity$l */
    class C5628l implements DialogInterface.OnClickListener {
        C5628l() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            ActivityCompat.requestPermissions(SearchDeviceActivity.this, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 0);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceActivity$m */
    public class C5629m implements CompletionHandler {

        /* renamed from: a */
        private String f11792a;

        /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceActivity$m$a */
        class C5630a implements Runnable {
            C5630a() {
            }

            public void run() {
                if (!SearchDeviceActivity.this.isFinishing()) {
                    SearchDeviceActivity.this.startActivity(new Intent(SearchDeviceActivity.this, QuickConnectRequestProgressActivity.class));
                    SearchDeviceActivity.this.finish();
                }
            }
        }

        public C5629m(String str) {
            this.f11792a = str;
        }

        public void onFailed(int i, String str) {
            C4257w.m11947l0().mo23686r1(this.f11792a);
            C4308b.f7489h = true;
            C4257w.m11947l0().mo23656Y();
            C4311i.m12151b(false);
            if (i == 12321) {
                C4257w.m11947l0().mo23653Q(str);
            }
        }

        public void onSucceed() {
            "connectToCloud, onSucceed, remove device from wifi device map: " + this.f11792a;
            C4257w.m11947l0().mo23686r1(this.f11792a);
            C4308b.f7489h = true;
            C4257w.m11947l0().mo23661c0(true, SearchDeviceActivity.this.m17009n0(), this.f11792a);
            C4311i.m12151b(true);
            new Handler(Looper.getMainLooper()).post(new C5630a());
        }
    }

    /* renamed from: m0 */
    private void m17008m0() {
        int i;
        Handler handler;
        if (C4308b.m12129h()) {
            if (ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_COARSE_LOCATION") == 0 && ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                handler = this.f11775m;
                i = 4;
            } else {
                handler = this.f11775m;
                i = 3;
            }
            handler.removeMessages(i);
            this.f11775m.sendEmptyMessageDelayed(i, 1000);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m17009n0() {
        /*
            r7 = this;
            com.yeelight.yeelib.g.x r0 = r7.f11766d
            java.lang.String r0 = r0.mo31841c()
            int r1 = r0.hashCode()
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r1) {
                case -1235140472: goto L_0x003b;
                case -1235140471: goto L_0x0031;
                case -1235140468: goto L_0x0027;
                case -1235140467: goto L_0x001d;
                case 674030242: goto L_0x0013;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0045
        L_0x0013:
            java.lang.String r1 = "yeelink.curtain.ctmt1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0045
            r0 = 0
            goto L_0x0046
        L_0x001d:
            java.lang.String r1 = "yeelink.light.fancl6"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0045
            r0 = 4
            goto L_0x0046
        L_0x0027:
            java.lang.String r1 = "yeelink.light.fancl5"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0045
            r0 = 3
            goto L_0x0046
        L_0x0031:
            java.lang.String r1 = "yeelink.light.fancl2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0045
            r0 = 2
            goto L_0x0046
        L_0x003b:
            java.lang.String r1 = "yeelink.light.fancl1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0045
            r0 = 1
            goto L_0x0046
        L_0x0045:
            r0 = -1
        L_0x0046:
            if (r0 == 0) goto L_0x0051
            if (r0 == r6) goto L_0x0051
            if (r0 == r5) goto L_0x0051
            if (r0 == r4) goto L_0x0051
            if (r0 == r3) goto L_0x0051
            return r2
        L_0x0051:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.activity.SearchDeviceActivity.m17009n0():boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0600, code lost:
        r8.setImageResource(r0);
        r7.f11765c = com.yeelight.yeelib.data.C7574b.C7575a.f15323f;
        r7.f11764b = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x061f, code lost:
        r8.setImageResource(r0);
        r8 = com.yeelight.yeelib.data.C7574b.C7575a.f15325h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x064f, code lost:
        r8.setImageResource(r0);
        r8 = com.yeelight.yeelib.data.C7574b.C7575a.f15335r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0654, code lost:
        r7.f11765c = r8;
        r7.f11764b = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x066b, code lost:
        r8.setImageResource(r0);
        r8 = com.yeelight.yeelib.data.C7574b.C7575a.f15328k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0695, code lost:
        r8.setImageResource(r0);
        r8 = com.yeelight.yeelib.data.C7574b.C7575a.f15330m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x06a7, code lost:
        r8.setImageResource(r0);
        r8 = com.yeelight.yeelib.data.C7574b.C7575a.f15329l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x06e5, code lost:
        r8.setImageResource(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0705, code lost:
        r8 = com.yeelight.yeelib.data.C7574b.C7575a.f15320c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0707, code lost:
        r7.f11765c = r8;
        r7.f11764b = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0723, code lost:
        r8.setImageResource(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0726, code lost:
        r8 = com.yeelight.yeelib.data.C7574b.C7575a.f15320c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0728, code lost:
        r7.f11765c = r8;
        r7.f11764b = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:?, code lost:
        return;
     */
    /* renamed from: q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m17010q0(com.yeelight.yeelib.p153g.C9855x r8) {
        /*
            r7 = this;
            java.lang.String r8 = r8.mo31841c()
            int r0 = r8.hashCode()
            r1 = 0
            r2 = 3
            r3 = 1
            r4 = 2
            switch(r0) {
                case -1644531059: goto L_0x0499;
                case -1494338802: goto L_0x048e;
                case -1462015191: goto L_0x0483;
                case -1462015190: goto L_0x0478;
                case -1462015189: goto L_0x046d;
                case -1462015188: goto L_0x0462;
                case -1462015187: goto L_0x0457;
                case -1462015186: goto L_0x044c;
                case -1462015185: goto L_0x0441;
                case -1462015184: goto L_0x0435;
                case -1462015183: goto L_0x0429;
                case -1462015182: goto L_0x041d;
                case -1462015160: goto L_0x0411;
                case -1462015159: goto L_0x0405;
                case -1462015158: goto L_0x03f9;
                case -1462015157: goto L_0x03ed;
                case -1462015156: goto L_0x03e1;
                case -1400275319: goto L_0x03d5;
                case -1350780909: goto L_0x03c9;
                case -1317475940: goto L_0x03bd;
                case -1317475939: goto L_0x03b1;
                case -1317475937: goto L_0x03a5;
                case -1317475915: goto L_0x0399;
                case -1317475914: goto L_0x038d;
                case -1317475913: goto L_0x0381;
                case -1317475912: goto L_0x0375;
                case -1308146495: goto L_0x036a;
                case -1308146494: goto L_0x035f;
                case -1308146493: goto L_0x0354;
                case -1308146492: goto L_0x0349;
                case -1308146491: goto L_0x033e;
                case -1308146490: goto L_0x0333;
                case -1308146488: goto L_0x0327;
                case -1308146447: goto L_0x031c;
                case -1308146446: goto L_0x0310;
                case -1308146445: goto L_0x0305;
                case -1235140472: goto L_0x02f9;
                case -1235140471: goto L_0x02ed;
                case -1235140468: goto L_0x02e1;
                case -1235140467: goto L_0x02d5;
                case -1199119278: goto L_0x02c9;
                case -1119332198: goto L_0x02bd;
                case -1063384694: goto L_0x02b1;
                case -1063384689: goto L_0x02a5;
                case -1063384687: goto L_0x0299;
                case -1063384685: goto L_0x028d;
                case -948847040: goto L_0x0281;
                case -948847038: goto L_0x0275;
                case -888668266: goto L_0x0269;
                case -888668265: goto L_0x025d;
                case -888668264: goto L_0x0251;
                case -845289556: goto L_0x0245;
                case -845289555: goto L_0x0239;
                case -845289553: goto L_0x022d;
                case -845289551: goto L_0x0221;
                case -845289508: goto L_0x0215;
                case -458141175: goto L_0x0209;
                case -458141174: goto L_0x01fd;
                case -458141173: goto L_0x01f1;
                case -458141172: goto L_0x01e5;
                case -449944730: goto L_0x01d9;
                case -449944729: goto L_0x01cd;
                case -449944728: goto L_0x01c1;
                case -449944727: goto L_0x01b5;
                case -449944726: goto L_0x01a9;
                case -449944724: goto L_0x019d;
                case -449944723: goto L_0x0191;
                case -449944722: goto L_0x0185;
                case -448603205: goto L_0x0179;
                case -448603202: goto L_0x016d;
                case -448603201: goto L_0x0161;
                case -448603157: goto L_0x0155;
                case -448603156: goto L_0x0149;
                case -443031172: goto L_0x013d;
                case -190173984: goto L_0x0131;
                case -190173936: goto L_0x0125;
                case 174464231: goto L_0x0119;
                case 250266083: goto L_0x010d;
                case 674030242: goto L_0x0101;
                case 922669543: goto L_0x00f5;
                case 922669544: goto L_0x00e9;
                case 922669545: goto L_0x00dd;
                case 922669546: goto L_0x00d1;
                case 922669547: goto L_0x00c5;
                case 922669548: goto L_0x00b9;
                case 922669549: goto L_0x00ad;
                case 922669550: goto L_0x00a1;
                case 922669551: goto L_0x0095;
                case 1201756974: goto L_0x0089;
                case 1201757021: goto L_0x007d;
                case 1201766335: goto L_0x0071;
                case 1201766336: goto L_0x0065;
                case 1623724661: goto L_0x0059;
                case 1623724662: goto L_0x004d;
                case 1623724663: goto L_0x0041;
                case 2086270815: goto L_0x0035;
                case 2102612488: goto L_0x0029;
                case 2102612489: goto L_0x001d;
                case 2146130361: goto L_0x0011;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x04a4
        L_0x0011:
            java.lang.String r0 = "yeelink.light.dnlight2"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 47
            goto L_0x04a5
        L_0x001d:
            java.lang.String r0 = "yeelink.light.meshbulb2"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 49
            goto L_0x04a5
        L_0x0029:
            java.lang.String r0 = "yeelink.light.meshbulb1"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 48
            goto L_0x04a5
        L_0x0035:
            java.lang.String r0 = "virtual.yeelink.light.mijia.ceiling"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 87
            goto L_0x04a5
        L_0x0041:
            java.lang.String r0 = "yeelink.light.bslamp3"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 38
            goto L_0x04a5
        L_0x004d:
            java.lang.String r0 = "yeelink.light.bslamp2"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 37
            goto L_0x04a5
        L_0x0059:
            java.lang.String r0 = "yeelink.light.bslamp1"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 36
            goto L_0x04a5
        L_0x0065:
            java.lang.String r0 = "yeelink.light.ml2"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 52
            goto L_0x04a5
        L_0x0071:
            java.lang.String r0 = "yeelink.light.ml1"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 51
            goto L_0x04a5
        L_0x007d:
            java.lang.String r0 = "yeelink.light.cta"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 11
            goto L_0x04a5
        L_0x0089:
            java.lang.String r0 = "yeelink.light.ct2"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 10
            goto L_0x04a5
        L_0x0095:
            java.lang.String r0 = "yeelink.light.ceiling9"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 44
            goto L_0x04a5
        L_0x00a1:
            java.lang.String r0 = "yeelink.light.ceiling8"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 46
            goto L_0x04a5
        L_0x00ad:
            java.lang.String r0 = "yeelink.light.ceiling7"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 45
            goto L_0x04a5
        L_0x00b9:
            java.lang.String r0 = "yeelink.light.ceiling6"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 43
            goto L_0x04a5
        L_0x00c5:
            java.lang.String r0 = "yeelink.light.ceiling5"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 58
            goto L_0x04a5
        L_0x00d1:
            java.lang.String r0 = "yeelink.light.ceiling4"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 56
            goto L_0x04a5
        L_0x00dd:
            java.lang.String r0 = "yeelink.light.ceiling3"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 55
            goto L_0x04a5
        L_0x00e9:
            java.lang.String r0 = "yeelink.light.ceiling2"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 41
            goto L_0x04a5
        L_0x00f5:
            java.lang.String r0 = "yeelink.light.ceiling1"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 40
            goto L_0x04a5
        L_0x0101:
            java.lang.String r0 = "yeelink.curtain.ctmt1"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 92
            goto L_0x04a5
        L_0x010d:
            java.lang.String r0 = "yeelink.light.gingko.group"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 54
            goto L_0x04a5
        L_0x0119:
            java.lang.String r0 = "virtual.yeelink.light.ceiling"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 86
            goto L_0x04a5
        L_0x0125:
            java.lang.String r0 = "yeelink.gateway.va"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 91
            goto L_0x04a5
        L_0x0131:
            java.lang.String r0 = "yeelink.gateway.v1"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 90
            goto L_0x04a5
        L_0x013d:
            java.lang.String r0 = "yeelink.light.spot1"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 50
            goto L_0x04a5
        L_0x0149:
            java.lang.String r0 = "yeelink.light.monob"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 16
            goto L_0x04a5
        L_0x0155:
            java.lang.String r0 = "yeelink.light.monoa"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 14
            goto L_0x04a5
        L_0x0161:
            java.lang.String r0 = "yeelink.light.mono5"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 17
            goto L_0x04a5
        L_0x016d:
            java.lang.String r0 = "yeelink.light.mono4"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 15
            goto L_0x04a5
        L_0x0179:
            java.lang.String r0 = "yeelink.light.mono1"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 13
            goto L_0x04a5
        L_0x0185:
            java.lang.String r0 = "yeelink.light.lamp9"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 28
            goto L_0x04a5
        L_0x0191:
            java.lang.String r0 = "yeelink.light.lamp8"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 27
            goto L_0x04a5
        L_0x019d:
            java.lang.String r0 = "yeelink.light.lamp7"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 26
            goto L_0x04a5
        L_0x01a9:
            java.lang.String r0 = "yeelink.light.lamp5"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 33
            goto L_0x04a5
        L_0x01b5:
            java.lang.String r0 = "yeelink.light.lamp4"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 25
            goto L_0x04a5
        L_0x01c1:
            java.lang.String r0 = "yeelink.light.lamp3"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 32
            goto L_0x04a5
        L_0x01cd:
            java.lang.String r0 = "yeelink.light.lamp2"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 31
            goto L_0x04a5
        L_0x01d9:
            java.lang.String r0 = "yeelink.light.lamp1"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 24
            goto L_0x04a5
        L_0x01e5:
            java.lang.String r0 = "yeelink.light.ceild"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 70
            goto L_0x04a5
        L_0x01f1:
            java.lang.String r0 = "yeelink.light.ceilc"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 69
            goto L_0x04a5
        L_0x01fd:
            java.lang.String r0 = "yeelink.light.ceilb"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 68
            goto L_0x04a5
        L_0x0209:
            java.lang.String r0 = "yeelink.light.ceila"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 42
            goto L_0x04a5
        L_0x0215:
            java.lang.String r0 = "yeelink.light.stripa"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 23
            goto L_0x04a5
        L_0x0221:
            java.lang.String r0 = "yeelink.light.strip6"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 22
            goto L_0x04a5
        L_0x022d:
            java.lang.String r0 = "yeelink.light.strip4"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 12
            goto L_0x04a5
        L_0x0239:
            java.lang.String r0 = "yeelink.light.strip2"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 21
            goto L_0x04a5
        L_0x0245:
            java.lang.String r0 = "yeelink.light.strip1"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 20
            goto L_0x04a5
        L_0x0251:
            java.lang.String r0 = "yilai.light.ceiling3"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 85
            goto L_0x04a5
        L_0x025d:
            java.lang.String r0 = "yilai.light.ceiling2"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 84
            goto L_0x04a5
        L_0x0269:
            java.lang.String r0 = "yilai.light.ceiling1"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 83
            goto L_0x04a5
        L_0x0275:
            java.lang.String r0 = "yeelink.light.panel3"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 19
            goto L_0x04a5
        L_0x0281:
            java.lang.String r0 = "yeelink.light.panel1"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 18
            goto L_0x04a5
        L_0x028d:
            java.lang.String r0 = "yeelink.light.lamp19"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 39
            goto L_0x04a5
        L_0x0299:
            java.lang.String r0 = "yeelink.light.lamp17"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 34
            goto L_0x04a5
        L_0x02a5:
            java.lang.String r0 = "yeelink.light.lamp15"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 30
            goto L_0x04a5
        L_0x02b1:
            java.lang.String r0 = "yeelink.light.lamp10"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 29
            goto L_0x04a5
        L_0x02bd:
            java.lang.String r0 = "yeelink.wifispeaker.v1"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 88
            goto L_0x04a5
        L_0x02c9:
            java.lang.String r0 = "yeelink.light.gingko"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 35
            goto L_0x04a5
        L_0x02d5:
            java.lang.String r0 = "yeelink.light.fancl6"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 98
            goto L_0x04a5
        L_0x02e1:
            java.lang.String r0 = "yeelink.light.fancl5"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 97
            goto L_0x04a5
        L_0x02ed:
            java.lang.String r0 = "yeelink.light.fancl2"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 96
            goto L_0x04a5
        L_0x02f9:
            java.lang.String r0 = "yeelink.light.fancl1"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 95
            goto L_0x04a5
        L_0x0305:
            java.lang.String r0 = "yeelink.light.colorc"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 4
            goto L_0x04a5
        L_0x0310:
            java.lang.String r0 = "yeelink.light.colorb"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 9
            goto L_0x04a5
        L_0x031c:
            java.lang.String r0 = "yeelink.light.colora"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 3
            goto L_0x04a5
        L_0x0327:
            java.lang.String r0 = "yeelink.light.color8"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 8
            goto L_0x04a5
        L_0x0333:
            java.lang.String r0 = "yeelink.light.color6"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 7
            goto L_0x04a5
        L_0x033e:
            java.lang.String r0 = "yeelink.light.color5"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 2
            goto L_0x04a5
        L_0x0349:
            java.lang.String r0 = "yeelink.light.color4"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 6
            goto L_0x04a5
        L_0x0354:
            java.lang.String r0 = "yeelink.light.color3"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 1
            goto L_0x04a5
        L_0x035f:
            java.lang.String r0 = "yeelink.light.color2"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 5
            goto L_0x04a5
        L_0x036a:
            java.lang.String r0 = "yeelink.light.color1"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 0
            goto L_0x04a5
        L_0x0375:
            java.lang.String r0 = "yeelink.light.ceil33"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 82
            goto L_0x04a5
        L_0x0381:
            java.lang.String r0 = "yeelink.light.ceil32"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 81
            goto L_0x04a5
        L_0x038d:
            java.lang.String r0 = "yeelink.light.ceil31"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 80
            goto L_0x04a5
        L_0x0399:
            java.lang.String r0 = "yeelink.light.ceil30"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 79
            goto L_0x04a5
        L_0x03a5:
            java.lang.String r0 = "yeelink.light.ceil29"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 78
            goto L_0x04a5
        L_0x03b1:
            java.lang.String r0 = "yeelink.light.ceil27"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 77
            goto L_0x04a5
        L_0x03bd:
            java.lang.String r0 = "yeelink.light.ceil26"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 76
            goto L_0x04a5
        L_0x03c9:
            java.lang.String r0 = "yeelink.plug.plug"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 94
            goto L_0x04a5
        L_0x03d5:
            java.lang.String r0 = "yeelink.light.ble1"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 53
            goto L_0x04a5
        L_0x03e1:
            java.lang.String r0 = "yeelink.light.ceiling24"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 75
            goto L_0x04a5
        L_0x03ed:
            java.lang.String r0 = "yeelink.light.ceiling23"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 74
            goto L_0x04a5
        L_0x03f9:
            java.lang.String r0 = "yeelink.light.ceiling22"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 73
            goto L_0x04a5
        L_0x0405:
            java.lang.String r0 = "yeelink.light.ceiling21"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 72
            goto L_0x04a5
        L_0x0411:
            java.lang.String r0 = "yeelink.light.ceiling20"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 71
            goto L_0x04a5
        L_0x041d:
            java.lang.String r0 = "yeelink.light.ceiling19"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 67
            goto L_0x04a5
        L_0x0429:
            java.lang.String r0 = "yeelink.light.ceiling18"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 66
            goto L_0x04a5
        L_0x0435:
            java.lang.String r0 = "yeelink.light.ceiling17"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 65
            goto L_0x04a5
        L_0x0441:
            java.lang.String r0 = "yeelink.light.ceiling16"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 64
            goto L_0x04a5
        L_0x044c:
            java.lang.String r0 = "yeelink.light.ceiling15"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 63
            goto L_0x04a5
        L_0x0457:
            java.lang.String r0 = "yeelink.light.ceiling14"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 62
            goto L_0x04a5
        L_0x0462:
            java.lang.String r0 = "yeelink.light.ceiling13"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 61
            goto L_0x04a5
        L_0x046d:
            java.lang.String r0 = "yeelink.light.ceiling12"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 60
            goto L_0x04a5
        L_0x0478:
            java.lang.String r0 = "yeelink.light.ceiling11"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 59
            goto L_0x04a5
        L_0x0483:
            java.lang.String r0 = "yeelink.light.ceiling10"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 57
            goto L_0x04a5
        L_0x048e:
            java.lang.String r0 = "yeelink.switch.sw1"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 93
            goto L_0x04a5
        L_0x0499:
            java.lang.String r0 = "yeelink.bhf_light.v1"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x04a4
            r8 = 89
            goto L_0x04a5
        L_0x04a4:
            r8 = -1
        L_0x04a5:
            r0 = 2131231392(0x7f0802a0, float:1.8078864E38)
            r5 = 2131231394(0x7f0802a2, float:1.8078868E38)
            r6 = 2131231387(0x7f08029b, float:1.8078854E38)
            switch(r8) {
                case 0: goto L_0x071e;
                case 1: goto L_0x071e;
                case 2: goto L_0x071e;
                case 3: goto L_0x0718;
                case 4: goto L_0x0712;
                case 5: goto L_0x070c;
                case 6: goto L_0x0700;
                case 7: goto L_0x0700;
                case 8: goto L_0x0700;
                case 9: goto L_0x0700;
                case 10: goto L_0x06fa;
                case 11: goto L_0x06fa;
                case 12: goto L_0x06ef;
                case 13: goto L_0x06e9;
                case 14: goto L_0x06e9;
                case 15: goto L_0x06e0;
                case 16: goto L_0x06da;
                case 17: goto L_0x06d4;
                case 18: goto L_0x06c9;
                case 19: goto L_0x06c9;
                case 20: goto L_0x06be;
                case 21: goto L_0x06be;
                case 22: goto L_0x06be;
                case 23: goto L_0x06be;
                case 24: goto L_0x06b5;
                case 25: goto L_0x06ad;
                case 26: goto L_0x06a2;
                case 27: goto L_0x069c;
                case 28: goto L_0x0690;
                case 29: goto L_0x068a;
                case 30: goto L_0x067e;
                case 31: goto L_0x0672;
                case 32: goto L_0x0666;
                case 33: goto L_0x0660;
                case 34: goto L_0x065a;
                case 35: goto L_0x064a;
                case 36: goto L_0x063e;
                case 37: goto L_0x0632;
                case 38: goto L_0x0626;
                case 39: goto L_0x0626;
                case 40: goto L_0x061d;
                case 41: goto L_0x061d;
                case 42: goto L_0x061d;
                case 43: goto L_0x0617;
                case 44: goto L_0x0617;
                case 45: goto L_0x0611;
                case 46: goto L_0x060b;
                case 47: goto L_0x05fb;
                case 48: goto L_0x05f5;
                case 49: goto L_0x05ef;
                case 50: goto L_0x05e9;
                case 51: goto L_0x05e3;
                case 52: goto L_0x05dd;
                case 53: goto L_0x05d1;
                case 54: goto L_0x05ca;
                case 55: goto L_0x05c4;
                case 56: goto L_0x05be;
                case 57: goto L_0x05b8;
                case 58: goto L_0x05b1;
                case 59: goto L_0x061d;
                case 60: goto L_0x061d;
                case 61: goto L_0x061d;
                case 62: goto L_0x061d;
                case 63: goto L_0x061d;
                case 64: goto L_0x05aa;
                case 65: goto L_0x05a3;
                case 66: goto L_0x059c;
                case 67: goto L_0x0595;
                case 68: goto L_0x058e;
                case 69: goto L_0x0587;
                case 70: goto L_0x0587;
                case 71: goto L_0x0580;
                case 72: goto L_0x0579;
                case 73: goto L_0x0572;
                case 74: goto L_0x056b;
                case 75: goto L_0x0564;
                case 76: goto L_0x055d;
                case 77: goto L_0x0556;
                case 78: goto L_0x054f;
                case 79: goto L_0x0548;
                case 80: goto L_0x0541;
                case 81: goto L_0x053a;
                case 82: goto L_0x0533;
                case 83: goto L_0x052c;
                case 84: goto L_0x0525;
                case 85: goto L_0x051e;
                case 86: goto L_0x0517;
                case 87: goto L_0x0510;
                case 88: goto L_0x0504;
                case 89: goto L_0x04f8;
                case 90: goto L_0x04ec;
                case 91: goto L_0x04ec;
                case 92: goto L_0x04e0;
                case 93: goto L_0x04d4;
                case 94: goto L_0x04c8;
                case 95: goto L_0x04c1;
                case 96: goto L_0x04ba;
                case 97: goto L_0x04b3;
                case 98: goto L_0x04b3;
                default: goto L_0x04b1;
            }
        L_0x04b1:
            goto L_0x072c
        L_0x04b3:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231359(0x7f08027f, float:1.8078797E38)
            goto L_0x061f
        L_0x04ba:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231357(0x7f08027d, float:1.8078793E38)
            goto L_0x061f
        L_0x04c1:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231355(0x7f08027b, float:1.8078789E38)
            goto L_0x061f
        L_0x04c8:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231433(0x7f0802c9, float:1.8078947E38)
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.C7574b.C7575a.f15341x
            goto L_0x0707
        L_0x04d4:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231441(0x7f0802d1, float:1.8078963E38)
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.C7574b.C7575a.f15340w
            goto L_0x0707
        L_0x04e0:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231445(0x7f0802d5, float:1.8078971E38)
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.C7574b.C7575a.f15339v
            goto L_0x0707
        L_0x04ec:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231361(0x7f080281, float:1.80788E38)
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.C7574b.C7575a.f15338u
            goto L_0x0707
        L_0x04f8:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231267(0x7f080223, float:1.807861E38)
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.C7574b.C7575a.f15337t
            goto L_0x0707
        L_0x0504:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231343(0x7f08026f, float:1.8078764E38)
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.C7574b.C7575a.f15336s
            goto L_0x0707
        L_0x0510:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231405(0x7f0802ad, float:1.807889E38)
            goto L_0x061f
        L_0x0517:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231319(0x7f080257, float:1.8078716E38)
            goto L_0x061f
        L_0x051e:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231371(0x7f08028b, float:1.8078821E38)
            goto L_0x061f
        L_0x0525:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231369(0x7f080289, float:1.8078817E38)
            goto L_0x061f
        L_0x052c:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231372(0x7f08028c, float:1.8078823E38)
            goto L_0x061f
        L_0x0533:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231317(0x7f080255, float:1.8078712E38)
            goto L_0x061f
        L_0x053a:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231315(0x7f080253, float:1.8078708E38)
            goto L_0x061f
        L_0x0541:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231313(0x7f080251, float:1.8078703E38)
            goto L_0x061f
        L_0x0548:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231311(0x7f08024f, float:1.80787E38)
            goto L_0x061f
        L_0x054f:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231309(0x7f08024d, float:1.8078695E38)
            goto L_0x061f
        L_0x0556:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231307(0x7f08024b, float:1.8078691E38)
            goto L_0x061f
        L_0x055d:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231305(0x7f080249, float:1.8078687E38)
            goto L_0x061f
        L_0x0564:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231303(0x7f080247, float:1.8078683E38)
            goto L_0x061f
        L_0x056b:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231301(0x7f080245, float:1.807868E38)
            goto L_0x061f
        L_0x0572:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231299(0x7f080243, float:1.8078675E38)
            goto L_0x061f
        L_0x0579:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231297(0x7f080241, float:1.8078671E38)
            goto L_0x061f
        L_0x0580:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231295(0x7f08023f, float:1.8078667E38)
            goto L_0x061f
        L_0x0587:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231323(0x7f08025b, float:1.8078724E38)
            goto L_0x061f
        L_0x058e:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231321(0x7f080259, float:1.807872E38)
            goto L_0x061f
        L_0x0595:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231293(0x7f08023d, float:1.8078663E38)
            goto L_0x061f
        L_0x059c:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231291(0x7f08023b, float:1.8078659E38)
            goto L_0x061f
        L_0x05a3:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231289(0x7f080239, float:1.8078655E38)
            goto L_0x061f
        L_0x05aa:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231287(0x7f080237, float:1.807865E38)
            goto L_0x061f
        L_0x05b1:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231335(0x7f080267, float:1.8078748E38)
            goto L_0x061f
        L_0x05b8:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231422(0x7f0802be, float:1.8078925E38)
            goto L_0x061f
        L_0x05be:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231352(0x7f080278, float:1.8078783E38)
            goto L_0x061f
        L_0x05c4:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231353(0x7f080279, float:1.8078785E38)
            goto L_0x061f
        L_0x05ca:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231364(0x7f080284, float:1.8078807E38)
            goto L_0x064f
        L_0x05d1:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231327(0x7f08025f, float:1.8078732E38)
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.C7574b.C7575a.f15324g
            goto L_0x0654
        L_0x05dd:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231409(0x7f0802b1, float:1.8078898E38)
            goto L_0x0600
        L_0x05e3:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231407(0x7f0802af, float:1.8078894E38)
            goto L_0x0600
        L_0x05e9:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231435(0x7f0802cb, float:1.807895E38)
            goto L_0x0600
        L_0x05ef:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231403(0x7f0802ab, float:1.8078886E38)
            goto L_0x0600
        L_0x05f5:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231401(0x7f0802a9, float:1.8078882E38)
            goto L_0x0600
        L_0x05fb:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231339(0x7f08026b, float:1.8078756E38)
        L_0x0600:
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.C7574b.C7575a.f15323f
            r7.f11765c = r8
            r7.f11764b = r2
            goto L_0x072c
        L_0x060b:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231424(0x7f0802c0, float:1.8078929E38)
            goto L_0x061f
        L_0x0611:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231427(0x7f0802c3, float:1.8078935E38)
            goto L_0x061f
        L_0x0617:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231426(0x7f0802c2, float:1.8078933E38)
            goto L_0x061f
        L_0x061d:
            android.widget.ImageView r8 = r7.mProductIcon
        L_0x061f:
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.C7574b.C7575a.f15325h
            goto L_0x0707
        L_0x0626:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231346(0x7f080272, float:1.807877E38)
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.C7574b.C7575a.f15334q
            goto L_0x0707
        L_0x0632:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231347(0x7f080273, float:1.8078772E38)
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.C7574b.C7575a.f15333p
            goto L_0x0707
        L_0x063e:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231325(0x7f08025d, float:1.8078728E38)
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.C7574b.C7575a.f15332o
            goto L_0x0707
        L_0x064a:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231365(0x7f080285, float:1.8078809E38)
        L_0x064f:
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.C7574b.C7575a.f15335r
        L_0x0654:
            r7.f11765c = r8
            r7.f11764b = r1
            goto L_0x072c
        L_0x065a:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231379(0x7f080293, float:1.8078837E38)
            goto L_0x066b
        L_0x0660:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231418(0x7f0802ba, float:1.8078916E38)
            goto L_0x066b
        L_0x0666:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231419(0x7f0802bb, float:1.8078918E38)
        L_0x066b:
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.C7574b.C7575a.f15328k
            goto L_0x0728
        L_0x0672:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231349(0x7f080275, float:1.8078777E38)
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.C7574b.C7575a.f15327j
            goto L_0x0728
        L_0x067e:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231377(0x7f080291, float:1.8078833E38)
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.C7574b.C7575a.f15331n
            goto L_0x0728
        L_0x068a:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231375(0x7f08028f, float:1.807883E38)
            goto L_0x0695
        L_0x0690:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231385(0x7f080299, float:1.807885E38)
        L_0x0695:
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.C7574b.C7575a.f15330m
            goto L_0x0707
        L_0x069c:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231383(0x7f080297, float:1.8078845E38)
            goto L_0x06a7
        L_0x06a2:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231381(0x7f080295, float:1.8078841E38)
        L_0x06a7:
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.C7574b.C7575a.f15329l
            goto L_0x0707
        L_0x06ad:
            android.widget.ImageView r8 = r7.mProductIcon
            r8.setImageResource(r5)
            android.net.Uri r8 = com.yeelight.yeelib.data.C7574b.C7575a.f15326i
            goto L_0x0707
        L_0x06b5:
            android.widget.ImageView r8 = r7.mProductIcon
            r8.setImageResource(r5)
            android.net.Uri r8 = com.yeelight.yeelib.data.C7574b.C7575a.f15326i
            goto L_0x0728
        L_0x06be:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231431(0x7f0802c7, float:1.8078943E38)
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.C7574b.C7575a.f15321d
            goto L_0x0728
        L_0x06c9:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231429(0x7f0802c5, float:1.8078939E38)
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.C7574b.C7575a.f15322e
            goto L_0x0707
        L_0x06d4:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231413(0x7f0802b5, float:1.8078906E38)
            goto L_0x06e5
        L_0x06da:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231415(0x7f0802b7, float:1.807891E38)
            goto L_0x06e5
        L_0x06e0:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231411(0x7f0802b3, float:1.8078902E38)
        L_0x06e5:
            r8.setImageResource(r0)
            goto L_0x0705
        L_0x06e9:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231341(0x7f08026d, float:1.807876E38)
            goto L_0x0723
        L_0x06ef:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231439(0x7f0802cf, float:1.807896E38)
            r8.setImageResource(r0)
            android.net.Uri r8 = com.yeelight.yeelib.data.C7574b.C7575a.f15321d
            goto L_0x0707
        L_0x06fa:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231389(0x7f08029d, float:1.8078858E38)
            goto L_0x0723
        L_0x0700:
            android.widget.ImageView r8 = r7.mProductIcon
            r8.setImageResource(r6)
        L_0x0705:
            android.net.Uri r8 = com.yeelight.yeelib.data.C7574b.C7575a.f15320c
        L_0x0707:
            r7.f11765c = r8
            r7.f11764b = r4
            goto L_0x072c
        L_0x070c:
            android.widget.ImageView r8 = r7.mProductIcon
            r8.setImageResource(r6)
            goto L_0x0726
        L_0x0712:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231333(0x7f080265, float:1.8078744E38)
            goto L_0x0723
        L_0x0718:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231331(0x7f080263, float:1.807874E38)
            goto L_0x0723
        L_0x071e:
            android.widget.ImageView r8 = r7.mProductIcon
            r0 = 2131231443(0x7f0802d3, float:1.8078967E38)
        L_0x0723:
            r8.setImageResource(r0)
        L_0x0726:
            android.net.Uri r8 = com.yeelight.yeelib.data.C7574b.C7575a.f15320c
        L_0x0728:
            r7.f11765c = r8
            r7.f11764b = r3
        L_0x072c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.activity.SearchDeviceActivity.m17010q0(com.yeelight.yeelib.g.x):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public void m17011r0() {
        C10526e.C10531e eVar = new C10526e.C10531e(this);
        eVar.mo33358i(getString(2131755520));
        eVar.mo33355f(2131755518);
        eVar.mo33353d(-2, getString(2131755229), new C5617a());
        eVar.mo33353d(-1, getString(2131755219), new C5628l());
        eVar.mo33359j();
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public void m17012s0() {
        C10526e.C10531e eVar = new C10526e.C10531e(this);
        eVar.mo33358i(getString(2131755519));
        eVar.mo33355f(2131755521);
        eVar.mo33353d(-2, getString(2131755229), new C5619c());
        eVar.mo33353d(-1, getString(2131755219), new C5618b());
        eVar.mo33359j();
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public void m17013t0() {
        startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public void m17014u0() {
        int i = this.f11764b;
        if (i == 0 || i == 3) {
            C4257w.m11947l0().mo23655X(true, false, false);
        } else {
            C4257w.m11947l0().mo23655X(false, true, false);
        }
        m17008m0();
    }

    /* renamed from: v0 */
    private void m17015v0() {
        int i = this.f11764b;
        if (i == 0 || i == 3) {
            C4257w.m11947l0().mo23694w1();
        } else {
            C4257w.m11947l0().mo23696x1();
        }
    }

    /* renamed from: E */
    public void mo26093E(C4200i iVar) {
    }

    /* renamed from: L */
    public void mo26094L() {
    }

    /* renamed from: k */
    public void mo26095k() {
        this.f11775m.sendEmptyMessage(2);
    }

    /* renamed from: m */
    public void mo26096m(C4200i iVar) {
    }

    @OnClick({2131297041})
    public void next(View view) {
        List<String> list = this.f11768f;
        if (list != null && !list.isEmpty()) {
            try {
                MiotManager.getDeviceManager().stopScan();
            } catch (MiotException e) {
                e.printStackTrace();
            }
            if (this.f11769g) {
                String U = C4257w.m11945h0(this.f11768f.get(0)).mo23397U();
                C10526e.C10531e eVar = new C10526e.C10531e(this);
                eVar.mo33357h(2131755848);
                eVar.mo33360k(true);
                eVar.mo33356g(getString(2131755849, new Object[]{U}));
                C10526e b = eVar.mo33351b();
                b.setCancelable(true);
                b.mo33335g(-1, getString(2131755237), new C5627k(b, U));
                b.show();
                return;
            }
            int i = this.f11764b;
            if (i == 0) {
                Intent intent = new Intent(this, BluetoothConnectNewActivity.class);
                intent.putExtra("com.yeelight.cherry.device_id", this.f11768f.get(0));
                startActivity(intent);
            } else if (i == 3) {
                C4257w.m11945h0(this.f11768f.get(0));
                int i2 = this.f11772j;
                if (i2 == 0) {
                    MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_ID", C7579c.C7580a.C7581a.f15372c});
                    int i3 = 0;
                    for (String next : this.f11768f) {
                        matrixCursor.addRow(new String[]{String.valueOf(i3), next});
                        this.f11774l.put(next, 0);
                        i3++;
                    }
                    matrixCursor.moveToPosition(this.f11773k);
                    this.f11772j = 1;
                    this.f11776n.sendEmptyMessage(5);
                    this.f11767e.mo27130n(4);
                    this.f11767e.mo27123b(matrixCursor);
                    this.mBtnNext.setText(2131755237);
                } else if (i2 == 2 || i2 == 3) {
                    startActivity(new Intent(this, MainActivity.class));
                }
            } else {
                C4198d h0 = C4257w.m11945h0(this.f11768f.get(0));
                if (h0 == null) {
                    Toast.makeText(this, "No device found :" + this.f11768f.get(0), 0).show();
                    finish();
                    return;
                }
                XmBluetoothManager.getInstance().setDeviceConfig(C10557u.m25804a(h0.mo23395T()));
                try {
                    MiotManager.getDeviceConnector().connectToCloud(h0.mo23393S(), new C5629m(h0.mo23372G()));
                } catch (MiotException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: o */
    public void mo26097o() {
        int i = this.f11764b;
        if (i == 0 || i == 3) {
            this.f11775m.sendEmptyMessage(1);
        }
    }

    /* renamed from: o0 */
    public /* synthetic */ void mo26908o0(int i) {
        Handler handler;
        int i2;
        if (i == 0) {
            this.f11771i.mo23319V0(this);
            this.f11774l.put(this.f11771i.mo23372G(), 3);
            handler = this.f11776n;
            i2 = 7;
        } else if (i == 11) {
            this.f11771i.mo23319V0(this);
            this.f11774l.put(this.f11771i.mo23372G(), 2);
            handler = this.f11776n;
            i2 = 6;
        } else {
            return;
        }
        handler.sendEmptyMessage(i2);
        this.f11767e.notifyDataSetChanged();
    }

    public void onConnectionStateChanged(int i, int i2) {
        runOnUiThread(new C5753o2(this, i2));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        setContentView(C11748R$layout.activity_search_device);
        C10547m.m25758h(true, this);
        ButterKnife.bind((Activity) this);
        setTitleBarPadding(this.mTitleBar);
        setTitleBarPadding(this.mTopLayout);
        this.mTitleBar.mo32825a("", new C5623g(), (View.OnClickListener) null);
        this.f11766d = (C9855x) getIntent().getSerializableExtra("product");
        this.f11769g = getIntent().getBooleanExtra("ADD_MESH_GROUP", false);
        m17010q0(this.f11766d);
        AddDeviceCursorAdapter addDeviceCursorAdapter = new AddDeviceCursorAdapter(this, (Cursor) null);
        this.f11767e = addDeviceCursorAdapter;
        addDeviceCursorAdapter.mo27129m(this.f11769g);
        if (this.f11764b == 3) {
            this.f11774l = new HashMap<>();
            this.f11767e.mo27130n(3);
            this.mBtnNext.setText(2131755840);
            this.f11767e.mo27128l(this.f11774l);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setAutoMeasureEnabled(false);
        this.mDeviceList.setLayoutManager(linearLayoutManager);
        this.mDeviceList.setAdapter(this.f11767e);
        this.f11767e.mo27127k(new C5624h());
        this.mBtnRetry.setOnClickListener(new C5625i());
        this.mRefreshLayout.setOnClickListener(new C5626j());
    }

    public Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
        CursorLoader cursorLoader;
        Uri uri = this.f11765c;
        Uri uri2 = C7574b.C7575a.f15323f;
        Uri uri3 = this.f11765c;
        if (uri == uri2) {
            String c = this.f11766d.mo31841c();
            return cursorLoader;
        }
        new CursorLoader(this, uri3, (String[]) null, (String) null, (String[]) null, (String) null);
        return cursorLoader;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f11776n.removeCallbacksAndMessages((Object) null);
        C6039j jVar = this.f11771i;
        if (jVar != null) {
            jVar.mo23319V0(this);
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
        getContentResolver().unregisterContentObserver(this.f11777o);
        m17015v0();
        this.f11775m.removeCallbacksAndMessages((Object) null);
        C4257w.m11947l0().mo23646F1(this);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 0) {
            finish();
        } else if (iArr.length <= 0) {
            finish();
        } else if (iArr[0] == 0) {
            LocationManager locationManager = (LocationManager) getSystemService("location");
            if (!locationManager.isProviderEnabled("gps") && !locationManager.isProviderEnabled("network")) {
                m17012s0();
            }
        } else if (iArr[0] == -1) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C4257w.m11947l0().mo23678m1(this);
        getLoaderManager().restartLoader(0, (Bundle) null, this);
        getContentResolver().registerContentObserver(C7574b.C7575a.f15342y, true, this.f11777o);
        m17014u0();
    }

    /* renamed from: p0 */
    public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
        "onLoadFinished! mCurrentStep = " + this.f11772j;
        if (this.f11764b == 3 && this.f11772j != 0) {
            return;
        }
        if (this.f11769g) {
            MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_ID", C7579c.C7580a.C7581a.f15372c});
            ArrayList arrayList = new ArrayList();
            DeviceDataProvider.m22369D();
            int i = 0;
            while (cursor.moveToNext()) {
                C4198d h0 = C4257w.m11945h0(cursor.getString(cursor.getColumnIndex(C7579c.C7580a.C7581a.f15372c)));
                if (h0 instanceof C6459e0) {
                    C6459e0 e0Var = (C6459e0) h0;
                    Cursor J = DeviceDataProvider.m22375J(e0Var.mo23372G());
                    boolean z = J != null && J.moveToFirst();
                    if (e0Var.mo27805V1().mo31822c().equals("yeelight_ms") || z || arrayList.contains(e0Var.mo27805V1().mo31822c())) {
                        "Found mesh network " + e0Var.mo27805V1().mo31822c();
                    } else {
                        matrixCursor.addRow(new String[]{String.valueOf(i), e0Var.mo23372G()});
                        arrayList.add(e0Var.mo27805V1().mo31822c());
                        i++;
                    }
                }
            }
            this.f11767e.mo27123b(matrixCursor);
            return;
        }
        this.f11767e.mo27123b(cursor);
        if (cursor.getCount() == 0) {
            this.mBtnNext.setEnabled(false);
        }
    }

    /* renamed from: t */
    public void mo26104t() {
        int i = this.f11764b;
        if (i != 0 && i != 3) {
            this.f11775m.sendEmptyMessage(1);
        }
    }

    /* renamed from: y */
    public void mo26107y(int i) {
    }
}
