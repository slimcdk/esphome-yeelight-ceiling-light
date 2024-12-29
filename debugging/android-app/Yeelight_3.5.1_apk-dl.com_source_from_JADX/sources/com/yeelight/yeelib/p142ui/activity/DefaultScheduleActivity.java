package com.yeelight.yeelib.p142ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.List;
import p051j4.C9193k;
import p150e4.C8976f;
import p150e4.C8978g;
import p223w3.C11138i0;
import p232y3.C12039d;
import p237z3.C12145e;

/* renamed from: com.yeelight.yeelib.ui.activity.DefaultScheduleActivity */
public class DefaultScheduleActivity extends BaseActivity implements C12145e {

    /* renamed from: d */
    private static final String f14526d = "DefaultScheduleActivity";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public List<C12039d> f14527a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C11138i0 f14528b;

    /* renamed from: c */
    private C8395b f14529c;

    /* renamed from: com.yeelight.yeelib.ui.activity.DefaultScheduleActivity$b */
    private class C8395b extends RecyclerView.Adapter<C8396a> {

        /* renamed from: com.yeelight.yeelib.ui.activity.DefaultScheduleActivity$b$a */
        class C8396a extends RecyclerView.ViewHolder {

            /* renamed from: a */
            ImageView f14531a;

            /* renamed from: b */
            TextView f14532b;

            /* renamed from: c */
            TextView f14533c;

            /* renamed from: d */
            ImageView f14534d;

            /* renamed from: e */
            View f14535e;

            private C8396a(C8395b bVar, View view) {
                super(view);
                this.f14531a = (ImageView) view.findViewById(R$id.img_schedule);
                this.f14532b = (TextView) view.findViewById(R$id.tv_schedule_name);
                this.f14533c = (TextView) view.findViewById(R$id.tv_schedule_introduce);
                this.f14534d = (ImageView) view.findViewById(R$id.img_select);
                this.f14535e = view.findViewById(R$id.line);
            }
        }

        private C8395b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m20026b(C12039d dVar, View view) {
            if (dVar.mo42674c() != DefaultScheduleActivity.this.f14528b.mo42296b2()) {
                DefaultScheduleActivity.this.f14528b.mo42297d2(dVar);
            }
        }

        /* renamed from: c */
        public void onBindViewHolder(@NonNull C8396a aVar, int i) {
            C12039d dVar = (C12039d) DefaultScheduleActivity.this.f14527a.get(i);
            aVar.f14531a.setImageResource(dVar.mo42673b());
            aVar.f14532b.setText(dVar.mo42676e());
            aVar.f14533c.setText(dVar.mo42675d());
            aVar.f14534d.setImageResource(dVar.mo42674c() == DefaultScheduleActivity.this.f14528b.mo42296b2() ? R$drawable.icon_yeelight_default_schedule_choice_selected : R$drawable.icon_yeelight_default_schedule_choice_normal);
            aVar.f14535e.setVisibility(i == getItemCount() + -1 ? 8 : 0);
            aVar.itemView.setOnClickListener(new C8726k(this, dVar));
        }

        @NonNull
        /* renamed from: d */
        public C8396a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return new C8396a(LayoutInflater.from(DefaultScheduleActivity.this).inflate(R$layout.item_default_schedule, viewGroup, false));
        }

        public int getItemCount() {
            if (DefaultScheduleActivity.this.f14527a == null) {
                return 0;
            }
            return DefaultScheduleActivity.this.f14527a.size();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public /* synthetic */ void m20023Z(View view) {
        onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public /* synthetic */ void m20024a0() {
        this.f14529c.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C9193k.m22157h(true, this);
        setContentView(R$layout.activity_default_schedule);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f14526d, "Activity has not device id", false);
            finish();
            return;
        }
        C3010c j0 = YeelightDeviceManager.m7794j0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        if (j0 == null || !j0.mo23145k0()) {
            BaseActivity.m19947U(this);
            finish();
        } else if (j0 instanceof C11138i0) {
            this.f14528b = (C11138i0) j0;
            RecyclerView recyclerView = (RecyclerView) findViewById(R$id.recycle_view);
            ((CommonTitleBar) findViewById(R$id.title_bar)).mo36195a(getString(R$string.vision_default_schedule_title), new C8976f(this), (View.OnClickListener) null);
            this.f14527a = C12039d.C12040a.m31077a();
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setNestedScrollingEnabled(false);
            C8395b bVar = new C8395b();
            this.f14529c = bVar;
            recyclerView.setAdapter(bVar);
        } else {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f14528b.mo23213W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f14528b.mo23178B0(this);
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == 4096) {
            runOnUiThread(new C8978g(this));
        }
    }
}
