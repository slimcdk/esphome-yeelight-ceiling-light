package com.yeelight.cherry.p141ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.fragment.DeviceRecyclerViewAdapter;
import com.yeelight.yeelib.data.C6043b;
import com.yeelight.yeelib.data.C6065f;
import com.yeelight.yeelib.device.C6169f;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import com.yeelight.yeelib.utils.RVEmptyObserver;
import java.util.ArrayList;
import java.util.Collections;
import p051j4.C9192j;
import p051j4.C9193k;
import p237z3.C12145e;

/* renamed from: com.yeelight.cherry.ui.activity.RoomMainActivity */
public class RoomMainActivity extends BaseActivity implements C12145e {

    /* renamed from: d */
    public static final /* synthetic */ int f11243d = 0;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C6169f f11244a;

    /* renamed from: b */
    DeviceRecyclerViewAdapter f11245b;

    /* renamed from: c */
    private ContentObserver f11246c = new C5620a(new Handler());
    @BindView(2131297354)
    View mArrowView;
    @BindView(2131296487)
    Button mBtnQuickAddDevice;
    @BindView(2131296671)
    View mContentView;
    @BindView(2131296669)
    RecyclerView mDeviceList;
    @BindView(2131296738)
    View mEmptyView;
    @BindView(2131297356)
    TextView mOffNum;
    @BindView(2131297357)
    TextView mOfflineNum;
    @BindView(2131297358)
    TextView mOnNum;
    @BindView(2131297361)
    TextView mRoomName;
    @BindView(2131297591)
    CommonTitleBar mTitleBar;

    /* renamed from: com.yeelight.cherry.ui.activity.RoomMainActivity$a */
    class C5620a extends ContentObserver {

        /* renamed from: com.yeelight.cherry.ui.activity.RoomMainActivity$a$a */
        class C5621a implements Runnable {
            C5621a() {
            }

            public void run() {
                RoomMainActivity.this.m16942Z();
            }
        }

        C5620a(Handler handler) {
            super(handler);
        }

        public void onChange(boolean z) {
            RoomMainActivity.this.runOnUiThread(new C5621a());
            RoomMainActivity.this.m16941Y();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.RoomMainActivity$b */
    class C5622b implements View.OnClickListener {
        C5622b() {
        }

        public void onClick(View view) {
            RoomMainActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.RoomMainActivity$c */
    class C5623c implements View.OnClickListener {
        C5623c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(RoomMainActivity.this, RoomSettingActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", RoomMainActivity.this.f11244a.mo23185G());
            RoomMainActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.RoomMainActivity$d */
    class C5624d implements View.OnClickListener {
        C5624d() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(RoomMainActivity.this, RoomDeviceModifyActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", RoomMainActivity.this.f11244a.mo23185G());
            RoomMainActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.RoomMainActivity$e */
    class C5625e implements Runnable {
        C5625e() {
        }

        public void run() {
            RoomMainActivity.this.m16942Z();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m16941Y() {
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{C6043b.C6044a.C6045a.f12329a, C6043b.C6044a.C6045a.f12331c});
        ArrayList<C3010c> arrayList = new ArrayList<>(this.f11244a.mo31753K1());
        Collections.sort(arrayList, new C9192j());
        int i = 0;
        for (C3010c G : arrayList) {
            matrixCursor.addRow(new Object[]{Integer.valueOf(i), G.mo23185G()});
            i++;
        }
        this.f11245b.mo31092b(new C6065f(matrixCursor));
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public void m16942Z() {
        this.mRoomName.setText(this.f11244a.mo23210U());
        int[] L1 = this.f11244a.mo31754L1();
        this.mOnNum.setText(String.valueOf(L1[0]));
        this.mOffNum.setText(String.valueOf(L1[1]));
        this.mOfflineNum.setText(String.valueOf((this.f11244a.mo31751I1() - L1[0]) - L1[1]));
        if (!this.f11244a.mo23145k0()) {
            this.mArrowView.setVisibility(4);
        } else {
            this.mArrowView.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_room_device_main);
        ButterKnife.bind((Activity) this);
        String stringExtra = getIntent().getStringExtra("com.yeelight.cherry.device_id");
        if (stringExtra == null) {
            AppUtils.m8300u("ROOM_DEBUG", "No room id!");
            finish();
            return;
        }
        C6169f J0 = YeelightDeviceManager.m7800o0().mo23268J0(stringExtra);
        this.f11244a = J0;
        if (J0 == null) {
            AppUtils.m8300u("ROOM_DEBUG", "Room device is null!!!");
            finish();
            return;
        }
        this.mTitleBar.mo36195a("", new C5622b(), new C5623c());
        this.f11245b = new DeviceRecyclerViewAdapter(this, (Cursor) null, true);
        this.mDeviceList.setLayoutManager(new LinearLayoutManager(this));
        this.mDeviceList.setAdapter(this.f11245b);
        this.f11245b.registerAdapterDataObserver(new RVEmptyObserver(this.mContentView, this.mEmptyView, this.mDeviceList));
        this.mBtnQuickAddDevice.setOnClickListener(new C5624d());
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        getContentResolver().unregisterContentObserver(this.f11246c);
        this.f11244a.mo23213W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m16942Z();
        getContentResolver().registerContentObserver(C6043b.C6044a.f12327a, true, this.f11246c);
        this.f11244a.mo23178B0(this);
        m16941Y();
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        runOnUiThread(new C5625e());
    }

    @OnClick({2131296662})
    public void toDeviceControl() {
        if (this.f11244a.mo31751I1() != 0 && this.f11244a.mo23145k0()) {
            Intent intent = new Intent();
            intent.setClass(this, DemoControlViewActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", this.f11244a.mo23185G());
            intent.putExtra("room_flag", true);
            startActivity(intent);
        }
    }
}
