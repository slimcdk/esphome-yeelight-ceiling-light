package com.yeelight.cherry.p177ui.activity;

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
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p177ui.fragment.DeviceRecyclerViewAdapter;
import com.yeelight.yeelib.data.C7579c;
import com.yeelight.yeelib.data.C7601g;
import com.yeelight.yeelib.p150c.C6005g;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10546l;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import com.yeelight.yeelib.utils.RVEmptyObserver;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.yeelight.cherry.ui.activity.RoomMainActivity */
public class RoomMainActivity extends BaseActivity implements C9770e {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C6005g f11677b;

    /* renamed from: c */
    DeviceRecyclerViewAdapter f11678c;

    /* renamed from: d */
    private ContentObserver f11679d = new C5579a(new Handler());
    @BindView(2131297212)
    View mArrowView;
    @BindView(2131296429)
    Button mBtnQuickAddDevice;
    @BindView(2131296593)
    View mContentView;
    @BindView(2131296591)
    RecyclerView mDeviceList;
    @BindView(2131296644)
    View mEmptyView;
    @BindView(2131297214)
    TextView mOffNum;
    @BindView(2131297215)
    TextView mOfflineNum;
    @BindView(2131297216)
    TextView mOnNum;
    @BindView(2131297219)
    TextView mRoomName;
    @BindView(2131297424)
    CommonTitleBar mTitleBar;

    /* renamed from: com.yeelight.cherry.ui.activity.RoomMainActivity$a */
    class C5579a extends ContentObserver {

        /* renamed from: com.yeelight.cherry.ui.activity.RoomMainActivity$a$a */
        class C5580a implements Runnable {
            C5580a() {
            }

            public void run() {
                RoomMainActivity.this.m16948Z();
            }
        }

        C5579a(Handler handler) {
            super(handler);
        }

        public void onChange(boolean z) {
            RoomMainActivity.this.runOnUiThread(new C5580a());
            RoomMainActivity.this.m16947Y();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.RoomMainActivity$b */
    class C5581b implements View.OnClickListener {
        C5581b() {
        }

        public void onClick(View view) {
            RoomMainActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.RoomMainActivity$c */
    class C5582c implements View.OnClickListener {
        C5582c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(RoomMainActivity.this, RoomSettingActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", RoomMainActivity.this.f11677b.mo23372G());
            RoomMainActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.RoomMainActivity$d */
    class C5583d implements View.OnClickListener {
        C5583d() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(RoomMainActivity.this, RoomDeviceModifyActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", RoomMainActivity.this.f11677b.mo23372G());
            RoomMainActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.RoomMainActivity$e */
    class C5584e implements Runnable {
        C5584e() {
        }

        public void run() {
            RoomMainActivity.this.m16948Z();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m16947Y() {
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{C7579c.C7580a.C7581a.f15370a, C7579c.C7580a.C7581a.f15372c});
        ArrayList<C4198d> arrayList = new ArrayList<>(this.f11677b.mo27498K1());
        Collections.sort(arrayList, new C10546l());
        int i = 0;
        for (C4198d G : arrayList) {
            matrixCursor.addRow(new Object[]{Integer.valueOf(i), G.mo23372G()});
            i++;
        }
        this.f11678c.mo27123b(new C7601g(matrixCursor));
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public void m16948Z() {
        this.mRoomName.setText(this.f11677b.mo23397U());
        int[] L1 = this.f11677b.mo27499L1();
        this.mOnNum.setText(String.valueOf(L1[0]));
        this.mOffNum.setText(String.valueOf(L1[1]));
        this.mOfflineNum.setText(String.valueOf((this.f11677b.mo27496I1() - L1[0]) - L1[1]));
        if (!this.f11677b.mo23331k0()) {
            this.mArrowView.setVisibility(4);
        } else {
            this.mArrowView.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_room_device_main);
        ButterKnife.bind((Activity) this);
        String stringExtra = getIntent().getStringExtra("com.yeelight.cherry.device_id");
        if (stringExtra == null) {
            C4308b.m12139r("ROOM_DEBUG", "No room id!");
            finish();
            return;
        }
        C6005g G0 = C4257w.m11947l0().mo23647G0(stringExtra);
        this.f11677b = G0;
        if (G0 == null) {
            C4308b.m12139r("ROOM_DEBUG", "Room device is null!!!");
            finish();
            return;
        }
        this.mTitleBar.mo32825a("", new C5581b(), new C5582c());
        this.f11678c = new DeviceRecyclerViewAdapter(this, (Cursor) null, true);
        this.mDeviceList.setLayoutManager(new LinearLayoutManager(this));
        this.mDeviceList.setAdapter(this.f11678c);
        this.f11678c.registerAdapterDataObserver(new RVEmptyObserver(this.mContentView, this.mEmptyView, this.mDeviceList));
        this.mBtnQuickAddDevice.setOnClickListener(new C5583d());
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        getContentResolver().unregisterContentObserver(this.f11679d);
        this.f11677b.mo23400W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m16948Z();
        getContentResolver().registerContentObserver(C7579c.C7580a.f15368a, true, this.f11679d);
        this.f11677b.mo23365B0(this);
        m16947Y();
    }

    public void onStatusChange(int i, C6024e eVar) {
        runOnUiThread(new C5584e());
    }

    @OnClick({2131296584})
    public void toDeviceControl() {
        if (this.f11677b.mo27496I1() != 0 && this.f11677b.mo23331k0()) {
            Intent intent = new Intent();
            intent.setClass(this, DemoControlViewActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", this.f11677b.mo23372G());
            intent.putExtra("room_flag", true);
            startActivity(intent);
        }
    }
}
