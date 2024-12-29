package com.yeelight.cherry.p177ui.activity;

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
import com.yeelight.cherry.C11744R$drawable;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p150c.C6000f;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.RVEmptyObserver;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.activity.MeshGroupMainActivity */
public class MeshGroupMainActivity extends BaseActivity implements C9770e {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C6000f f11220b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<C6000f.C6004d> f11221c = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C5384d f11222d;
    @BindView(2131296998)
    ImageView mArrow;
    @BindView(2131296395)
    Button mBtnAddDevice;
    @BindView(2131296591)
    RecyclerView mDeviceList;
    @BindView(2131296598)
    TextView mDeviceNum;
    @BindView(2131296644)
    LinearLayout mEmptyView;
    @BindView(2131296740)
    TextView mGroupName;
    @BindView(2131297424)
    CommonTitleBar mTitleBar;

    /* renamed from: com.yeelight.cherry.ui.activity.MeshGroupMainActivity$a */
    class C5381a implements View.OnClickListener {
        C5381a() {
        }

        public void onClick(View view) {
            MeshGroupMainActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshGroupMainActivity$b */
    class C5382b implements View.OnClickListener {
        C5382b() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(MeshGroupMainActivity.this, DeviceSettingActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", MeshGroupMainActivity.this.f11220b.mo23372G());
            MeshGroupMainActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshGroupMainActivity$c */
    class C5383c implements Runnable {
        C5383c() {
        }

        public void run() {
            MeshGroupMainActivity.this.f11221c.clear();
            MeshGroupMainActivity.this.f11221c.addAll(MeshGroupMainActivity.this.f11220b.mo27542f2());
            MeshGroupMainActivity.this.f11222d.notifyDataSetChanged();
            MeshGroupMainActivity.this.m16633a0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshGroupMainActivity$d */
    class C5384d extends RecyclerView.Adapter<C5386b> {

        /* renamed from: com.yeelight.cherry.ui.activity.MeshGroupMainActivity$d$a */
        class C5385a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C6000f.C6004d f11227a;

            C5385a(C6000f.C6004d dVar) {
                this.f11227a = dVar;
            }

            public void onClick(View view) {
                if (this.f11227a.f12719a) {
                    MeshGroupMainActivity.this.f11220b.mo27539d2(this.f11227a.f12720b);
                } else {
                    MeshGroupMainActivity.this.f11220b.mo27544h2(this.f11227a.f12720b);
                }
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.MeshGroupMainActivity$d$b */
        class C5386b extends RecyclerView.ViewHolder {

            /* renamed from: a */
            TextView f11229a;

            /* renamed from: b */
            TextView f11230b;

            /* renamed from: c */
            ImageView f11231c;

            public C5386b(C5384d dVar, View view) {
                super(view);
                this.f11229a = (TextView) view.findViewById(2131296596);
                this.f11230b = (TextView) view.findViewById(2131296603);
                this.f11231c = (ImageView) view.findViewById(2131296604);
            }
        }

        C5384d() {
        }

        /* renamed from: a */
        public void onBindViewHolder(C5386b bVar, int i) {
            C6000f.C6004d dVar = (C6000f.C6004d) MeshGroupMainActivity.this.f11221c.get(i);
            TextView textView = bVar.f11229a;
            textView.setText(MeshGroupMainActivity.this.f11220b.mo23397U() + Constants.COLON_SEPARATOR + Integer.toHexString(dVar.f12720b));
            bVar.f11230b.setText(MeshGroupMainActivity.this.getResources().getString(dVar.f12719a ? 2131755838 : 2131755837));
            bVar.f11231c.setImageResource(dVar.f12719a ? C11744R$drawable.icon_yeelight_device_list_on : C11744R$drawable.icon_yeelight_device_list_off);
            bVar.f11231c.setOnClickListener(new C5385a(dVar));
        }

        /* renamed from: b */
        public C5386b onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C5386b(this, LayoutInflater.from(viewGroup.getContext()).inflate(2131493110, viewGroup, false));
        }

        public int getItemCount() {
            return MeshGroupMainActivity.this.f11221c.size();
        }
    }

    /* renamed from: Z */
    private void m16632Z() {
        new Handler(Looper.getMainLooper()).post(new C5383c());
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m16633a0() {
        this.mGroupName.setText(this.f11220b.mo23397U());
        int i = 0;
        this.mDeviceNum.setText(getString(2131755847, new Object[]{Integer.valueOf(this.f11220b.mo27496I1())}));
        ImageView imageView = this.mArrow;
        if (this.f11220b.mo27496I1() <= 0) {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    @OnClick({2131296395})
    public void addMeshDevice() {
        Intent intent = new Intent(this, AddMeshDeviceActivity.class);
        intent.putExtra("mesh_network", this.f11220b.mo27543g2());
        startActivity(intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_mesh_group_main);
        ButterKnife.bind((Activity) this);
        try {
            this.f11220b = (C6000f) C4257w.m11945h0(getIntent().getStringExtra("com.yeelight.cherry.device_id"));
            this.mTitleBar.mo32825a("", new C5381a(), new C5382b());
            this.f11222d = new C5384d();
            this.mDeviceList.setLayoutManager(new LinearLayoutManager(this));
            this.mDeviceList.setAdapter(this.f11222d);
            this.f11222d.registerAdapterDataObserver(new RVEmptyObserver(this.mTitleBar.getRightButton(), this.mEmptyView, this.mDeviceList));
            m16633a0();
            m16632Z();
        } catch (Exception e) {
            e.printStackTrace();
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C6000f fVar = this.f11220b;
        if (fVar != null) {
            fVar.mo23400W0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C6000f fVar = this.f11220b;
        if (fVar == null || !fVar.mo23331k0()) {
            finish();
        } else {
            this.f11220b.mo23365B0(this);
        }
    }

    public void onStatusChange(int i, C6024e eVar) {
        m16632Z();
    }

    @OnClick({2131296584})
    public void toDeviceControl() {
        if (this.f11220b.mo27496I1() > 0) {
            Intent intent = new Intent();
            intent.setClass(this, DemoControlViewActivity.class);
            intent.putExtra("mesh_group_flag", true);
            intent.putExtra("com.yeelight.cherry.device_id", this.f11220b.mo23372G());
            startActivity(intent);
        }
    }
}
