package com.yeelight.cherry.p141ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.cherry.C12224R$drawable;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.device.C6164e;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.RVEmptyObserver;
import java.util.ArrayList;
import java.util.List;
import p051j4.C9193k;
import p237z3.C12145e;

/* renamed from: com.yeelight.cherry.ui.activity.MeshGroupMainActivity */
public class MeshGroupMainActivity extends BaseActivity implements C12145e {

    /* renamed from: d */
    public static final /* synthetic */ int f10788d = 0;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C6164e f10789a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<C6164e.C6168d> f10790b = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C5430d f10791c;
    @BindView(2131297117)
    ImageView mArrow;
    @BindView(2131296453)
    Button mBtnAddDevice;
    @BindView(2131296669)
    RecyclerView mDeviceList;
    @BindView(2131296676)
    TextView mDeviceNum;
    @BindView(2131296738)
    LinearLayout mEmptyView;
    @BindView(2131296839)
    TextView mGroupName;
    @BindView(2131297591)
    CommonTitleBar mTitleBar;

    /* renamed from: com.yeelight.cherry.ui.activity.MeshGroupMainActivity$a */
    class C5427a implements View.OnClickListener {
        C5427a() {
        }

        public void onClick(View view) {
            MeshGroupMainActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshGroupMainActivity$b */
    class C5428b implements View.OnClickListener {
        C5428b() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(MeshGroupMainActivity.this, DeviceSettingActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", MeshGroupMainActivity.this.f10789a.mo23185G());
            MeshGroupMainActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshGroupMainActivity$c */
    class C5429c implements Runnable {
        C5429c() {
        }

        public void run() {
            MeshGroupMainActivity.this.f10790b.clear();
            MeshGroupMainActivity.this.f10790b.addAll(MeshGroupMainActivity.this.f10789a.mo31865f2());
            MeshGroupMainActivity.this.f10791c.notifyDataSetChanged();
            MeshGroupMainActivity.this.m16593a0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshGroupMainActivity$d */
    class C5430d extends RecyclerView.Adapter<C5432b> {

        /* renamed from: com.yeelight.cherry.ui.activity.MeshGroupMainActivity$d$a */
        class C5431a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C6164e.C6168d f10796a;

            C5431a(C6164e.C6168d dVar) {
                this.f10796a = dVar;
            }

            public void onClick(View view) {
                if (this.f10796a.f12697a) {
                    MeshGroupMainActivity.this.f10789a.mo31864d2(this.f10796a.f12698b);
                } else {
                    MeshGroupMainActivity.this.f10789a.mo31867h2(this.f10796a.f12698b);
                }
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.MeshGroupMainActivity$d$b */
        class C5432b extends RecyclerView.ViewHolder {

            /* renamed from: a */
            TextView f10798a;

            /* renamed from: b */
            TextView f10799b;

            /* renamed from: c */
            ImageView f10800c;

            public C5432b(C5430d dVar, View view) {
                super(view);
                this.f10798a = (TextView) view.findViewById(2131296674);
                this.f10799b = (TextView) view.findViewById(2131296681);
                this.f10800c = (ImageView) view.findViewById(2131296682);
            }
        }

        C5430d() {
        }

        /* renamed from: a */
        public void onBindViewHolder(C5432b bVar, int i) {
            C6164e.C6168d dVar = (C6164e.C6168d) MeshGroupMainActivity.this.f10790b.get(i);
            TextView textView = bVar.f10798a;
            textView.setText(MeshGroupMainActivity.this.f10789a.mo23210U() + Constants.COLON_SEPARATOR + Integer.toHexString(dVar.f12698b));
            bVar.f10799b.setText(MeshGroupMainActivity.this.getResources().getString(dVar.f12697a ? 2131755848 : 2131755847));
            bVar.f10800c.setImageResource(dVar.f12697a ? C12224R$drawable.icon_yeelight_device_list_on : C12224R$drawable.icon_yeelight_device_list_off);
            bVar.f10800c.setOnClickListener(new C5431a(dVar));
        }

        /* renamed from: b */
        public C5432b onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C5432b(this, LayoutInflater.from(viewGroup.getContext()).inflate(2131493114, viewGroup, false));
        }

        public int getItemCount() {
            return MeshGroupMainActivity.this.f10790b.size();
        }
    }

    /* renamed from: Z */
    private void m16592Z() {
        new Handler(Looper.getMainLooper()).post(new C5429c());
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m16593a0() {
        this.mGroupName.setText(this.f10789a.mo23210U());
        int i = 0;
        this.mDeviceNum.setText(getString(2131755857, new Object[]{Integer.valueOf(this.f10789a.mo31751I1())}));
        ImageView imageView = this.mArrow;
        if (this.f10789a.mo31751I1() <= 0) {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    @OnClick({2131296453})
    public void addMeshDevice() {
        Intent intent = new Intent(this, AddMeshDeviceActivity.class);
        intent.putExtra("mesh_network", this.f10789a.mo31866g2());
        startActivity(intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_mesh_group_main);
        ButterKnife.bind((Activity) this);
        try {
            this.f10789a = (C6164e) YeelightDeviceManager.m7794j0(getIntent().getStringExtra("com.yeelight.cherry.device_id"));
            this.mTitleBar.mo36195a("", new C5427a(), new C5428b());
            this.f10791c = new C5430d();
            this.mDeviceList.setLayoutManager(new LinearLayoutManager(this));
            this.mDeviceList.setAdapter(this.f10791c);
            this.f10791c.registerAdapterDataObserver(new RVEmptyObserver(this.mTitleBar.getRightButton(), this.mEmptyView, this.mDeviceList));
            m16593a0();
            m16592Z();
        } catch (Exception e) {
            e.printStackTrace();
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C6164e eVar = this.f10789a;
        if (eVar != null) {
            eVar.mo23213W0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C6164e eVar = this.f10789a;
        if (eVar == null || !eVar.mo23145k0()) {
            finish();
        } else {
            this.f10789a.mo23178B0(this);
        }
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        m16592Z();
    }

    @OnClick({2131296662})
    public void toDeviceControl() {
        if (this.f10789a.mo31751I1() > 0) {
            Intent intent = new Intent();
            intent.setClass(this, DemoControlViewActivity.class);
            intent.putExtra("mesh_group_flag", true);
            intent.putExtra("com.yeelight.cherry.device_id", this.f10789a.mo23185G());
            startActivity(intent);
        }
    }
}
