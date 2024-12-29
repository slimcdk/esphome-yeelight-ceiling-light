package com.yeelight.cherry.p141ui.activity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.adapter.NetworkListAdapter;
import com.yeelight.yeelib.data.C6043b;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.device.C6081a;
import com.yeelight.yeelib.device.C6164e;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.MeshNetWork;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import java.util.List;
import p051j4.C9193k;
import p170i4.C9113d;
import p223w3.C10898f0;
import p237z3.C12145e;

/* renamed from: com.yeelight.cherry.ui.activity.SelectNetworkActivity */
public class SelectNetworkActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f11425a = SelectNetworkActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public NetworkListAdapter f11426b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<MeshNetWork> f11427c = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C10898f0 f11428d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f11429e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f11430f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public MeshNetWork f11431g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public MeshNetWork f11432h = null;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C9113d f11433i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f11434j = -1;

    /* renamed from: k */
    private C12145e f11435k = new C5695a();
    @BindView(2131297163)
    Button mBtnNext;
    @BindView(2131297157)
    RecyclerView mNetworkList;
    @BindView(2131297591)
    CommonTitleBar mTitleBar;

    /* renamed from: com.yeelight.cherry.ui.activity.SelectNetworkActivity$a */
    class C5695a implements C12145e {

        /* renamed from: com.yeelight.cherry.ui.activity.SelectNetworkActivity$a$a */
        class C5696a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f11437a;

            /* renamed from: com.yeelight.cherry.ui.activity.SelectNetworkActivity$a$a$a */
            class C5697a implements Runnable {
                C5697a() {
                }

                public void run() {
                    C6164e eVar = (C6164e) YeelightDeviceManager.m7794j0(SelectNetworkActivity.this.f11432h.getNetworkName() + "_" + SelectNetworkActivity.this.f11432h.getId());
                    if (eVar != null) {
                        eVar.mo31758P1();
                    }
                    ((C6164e) YeelightDeviceManager.m7794j0(SelectNetworkActivity.this.f11428d.mo31635V1().getNetworkName() + "_" + SelectNetworkActivity.this.f11431g.getId())).mo31758P1();
                    SelectNetworkActivity.this.finish();
                }
            }

            C5696a(int i) {
                this.f11437a = i;
            }

            public void run() {
                int i = this.f11437a;
                if (i == 536870914 || i == 805306370) {
                    String unused = SelectNetworkActivity.this.f11425a;
                    if (SelectNetworkActivity.this.f11431g != null) {
                        SelectNetworkActivity selectNetworkActivity = SelectNetworkActivity.this;
                        Toast.makeText(selectNetworkActivity, selectNetworkActivity.getResources().getString(2131755864, new Object[]{SelectNetworkActivity.this.f11431g.getName()}), 0).show();
                        SelectNetworkActivity.this.f11428d.mo31647i2(SelectNetworkActivity.this.f11431g);
                        SelectNetworkActivity.this.f11428d.mo31648j2("ADV_MESH_NAME", SelectNetworkActivity.this.f11431g.getName().getBytes());
                        DeviceDataProvider.m17619c0(SelectNetworkActivity.this.f11430f, SelectNetworkActivity.this.f11431g.getId());
                        new Handler().postDelayed(new C5697a(), 1000);
                    }
                } else if (i == 536870916) {
                    if (SelectNetworkActivity.this.f11434j != -1 && !SelectNetworkActivity.this.f11428d.mo31635V1().getNetworkName().equals("yeelight_ms")) {
                        String unused2 = SelectNetworkActivity.this.f11425a;
                        StringBuilder sb = new StringBuilder();
                        sb.append("update id1 = ");
                        sb.append(SelectNetworkActivity.this.f11434j);
                        if ((SelectNetworkActivity.this.f11434j >> 30) == 1) {
                            SelectNetworkActivity.m17097e0(SelectNetworkActivity.this, 268435455);
                            ((C6164e) YeelightDeviceManager.m7794j0(SelectNetworkActivity.this.f11428d.mo31635V1().getNetworkName() + "_" + SelectNetworkActivity.this.f11434j)).mo31758P1();
                            SelectNetworkActivity.this.f11428d.mo31643d2();
                            SelectNetworkActivity.this.f11428d.mo31644f2();
                        }
                        String unused3 = SelectNetworkActivity.this.f11425a;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("update id2 = ");
                        sb2.append(SelectNetworkActivity.this.f11434j);
                        DeviceDataProvider.m17619c0(SelectNetworkActivity.this.f11430f, SelectNetworkActivity.this.f11434j);
                    }
                    String unused4 = SelectNetworkActivity.this.f11425a;
                } else if (i == 805306372) {
                    SelectNetworkActivity.this.f11433i.show();
                    String unused5 = SelectNetworkActivity.this.f11425a;
                    if (SelectNetworkActivity.this.f11434j != -1 && (SelectNetworkActivity.this.f11434j >> 30) != 1) {
                        String unused6 = SelectNetworkActivity.this.f11425a;
                        DeviceDataProvider.m17630l(SelectNetworkActivity.this.f11434j);
                        SelectNetworkActivity.this.m17103k0();
                        SelectNetworkActivity.this.f11426b.notifyDataSetChanged();
                    }
                }
            }
        }

        C5695a() {
        }

        public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
            SelectNetworkActivity.this.runOnUiThread(new C5696a(i));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectNetworkActivity$b */
    class C5698b implements View.OnClickListener {
        C5698b() {
        }

        public void onClick(View view) {
            SelectNetworkActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectNetworkActivity$c */
    class C5699c implements View.OnClickListener {
        C5699c() {
        }

        public void onClick(View view) {
            SelectNetworkActivity.this.startActivityForResult(new Intent(SelectNetworkActivity.this, AddNetworkActivity.class), 1);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectNetworkActivity$d */
    class C5700d implements NetworkListAdapter.C5882c {
        C5700d() {
        }

        /* renamed from: a */
        public void mo30922a(int i) {
            Button button;
            boolean z;
            int unused = SelectNetworkActivity.this.f11429e = i;
            if (i == -1) {
                button = SelectNetworkActivity.this.mBtnNext;
                z = false;
            } else {
                button = SelectNetworkActivity.this.mBtnNext;
                z = true;
            }
            button.setEnabled(z);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectNetworkActivity$e */
    class C5701e implements View.OnClickListener {
        C5701e() {
        }

        public void onClick(View view) {
            MeshNetWork meshNetWork = (MeshNetWork) SelectNetworkActivity.this.f11427c.get(SelectNetworkActivity.this.f11429e);
            MeshNetWork unused = SelectNetworkActivity.this.f11431g = meshNetWork;
            SelectNetworkActivity selectNetworkActivity = SelectNetworkActivity.this;
            MeshNetWork unused2 = selectNetworkActivity.f11432h = selectNetworkActivity.f11428d.mo31635V1();
            if (SelectNetworkActivity.this.f11431g.getId() != SelectNetworkActivity.this.f11432h.getId()) {
                SelectNetworkActivity.this.f11428d.mo31650l2(meshNetWork.getNetworkName(), meshNetWork.getPassword());
                return;
            }
            SelectNetworkActivity selectNetworkActivity2 = SelectNetworkActivity.this;
            Toast.makeText(selectNetworkActivity2, selectNetworkActivity2.getResources().getString(2131755864, new Object[]{SelectNetworkActivity.this.f11431g.getName()}), 0).show();
            SelectNetworkActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectNetworkActivity$f */
    class C5702f implements DialogInterface.OnClickListener {
        C5702f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent(SelectNetworkActivity.this, AddNetworkActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", SelectNetworkActivity.this.f11430f);
            intent.putExtra("updateMesh", (byte[]) SelectNetworkActivity.this.f11428d.mo31634U1("ADV_MESH_NAME"));
            SelectNetworkActivity.this.startActivityForResult(intent, 1);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectNetworkActivity$g */
    class C5703g implements DialogInterface.OnClickListener {
        C5703g() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SelectNetworkActivity.this.finish();
        }
    }

    /* renamed from: e0 */
    static /* synthetic */ int m17097e0(SelectNetworkActivity selectNetworkActivity, int i) {
        int i2 = i & selectNetworkActivity.f11434j;
        selectNetworkActivity.f11434j = i2;
        return i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public void m17103k0() {
        Cursor D = DeviceDataProvider.m17591D();
        this.f11427c.clear();
        while (D.moveToNext()) {
            this.f11427c.add(m17104l0(D));
        }
    }

    /* renamed from: l0 */
    private MeshNetWork m17104l0(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(C6043b.C6054f.C6055a.f12380a);
        int columnIndex2 = cursor.getColumnIndex(C6043b.C6054f.C6055a.f12382c);
        int columnIndex3 = cursor.getColumnIndex(C6043b.C6054f.C6055a.f12381b);
        int columnIndex4 = cursor.getColumnIndex(C6043b.C6054f.C6055a.f12383d);
        MeshNetWork meshNetWork = new MeshNetWork();
        meshNetWork.setId(cursor.getInt(columnIndex));
        meshNetWork.setName(cursor.getString(columnIndex2));
        meshNetWork.setNetworkName(cursor.getString(columnIndex3));
        meshNetWork.setPassword(cursor.getString(columnIndex4));
        StringBuilder sb = new StringBuilder();
        sb.append("mesh name = ");
        sb.append(meshNetWork.getNetworkName());
        sb.append(", pwd = ");
        sb.append(meshNetWork.getPassword());
        return meshNetWork;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1 && intent != null) {
            this.f11434j = intent.getIntExtra("id", -1);
            StringBuilder sb = new StringBuilder();
            sb.append("Update device mesh, id = ");
            sb.append(this.f11434j);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(this.f11425a, "Activity has not device id", false);
            finish();
            return;
        }
        this.f11430f = intent.getStringExtra("com.yeelight.cherry.device_id");
        this.f11434j = intent.getIntExtra("id", -1);
        C6081a i0 = YeelightDeviceManager.m7800o0().mo23295i0(this.f11430f);
        if (i0 instanceof C10898f0) {
            this.f11428d = (C10898f0) i0;
            mo35653P();
            setContentView(C12228R$layout.activity_select_network);
            ButterKnife.bind((Activity) this);
            C9193k.m22157h(true, this);
            setTitleBarPadding(this.mTitleBar);
            this.mTitleBar.mo36195a("", new C5698b(), new C5699c());
            this.mTitleBar.setRightTextColor(ViewCompat.MEASURED_STATE_MASK);
            this.mTitleBar.setRightTextStr(getString(2131755842));
            this.f11426b = new NetworkListAdapter(this, this.f11427c, this.f11428d.mo31635V1().getId());
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            linearLayoutManager.setAutoMeasureEnabled(false);
            this.mNetworkList.setLayoutManager(linearLayoutManager);
            this.mNetworkList.setAdapter(this.f11426b);
            this.f11426b.mo31141g(new C5700d());
            this.mBtnNext.setOnClickListener(new C5701e());
            this.mBtnNext.setEnabled(false);
            this.f11433i = new C9113d.C9118e(this).mo37179i(getString(2131755860)).mo37177g(getString(2131755861)).mo37174d(-2, getString(2131755232), new C5703g()).mo37174d(-1, getString(2131755281), new C5702f()).mo37172b();
            return;
        }
        AppUtils.m8302w(this.f11425a, "Select network activity accept Gingko device only", false);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f11428d.mo23213W0(this.f11435k);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m17103k0();
        this.f11426b.notifyDataSetChanged();
        this.f11428d.mo23178B0(this.f11435k);
        if (!this.f11428d.mo31636W1()) {
            C10898f0 f0Var = this.f11428d;
            f0Var.mo31638Y1(f0Var.mo31635V1().getNetworkName(), this.f11428d.mo31635V1().getPassword());
        }
    }
}
