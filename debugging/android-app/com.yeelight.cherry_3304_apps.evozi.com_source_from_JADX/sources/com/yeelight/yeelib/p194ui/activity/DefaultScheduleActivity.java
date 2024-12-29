package com.yeelight.yeelib.p194ui.activity;

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
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p183m.C6727h0;
import com.yeelight.yeelib.p150c.p184n.C7552d;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import java.util.List;

/* renamed from: com.yeelight.yeelib.ui.activity.DefaultScheduleActivity */
public class DefaultScheduleActivity extends BaseActivity implements C9770e {

    /* renamed from: e */
    private static final String f18220e = DefaultScheduleActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<C7552d> f18221b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C6727h0 f18222c;

    /* renamed from: d */
    private C9978b f18223d;

    /* renamed from: com.yeelight.yeelib.ui.activity.DefaultScheduleActivity$b */
    private class C9978b extends RecyclerView.Adapter<C9979a> {

        /* renamed from: com.yeelight.yeelib.ui.activity.DefaultScheduleActivity$b$a */
        class C9979a extends RecyclerView.ViewHolder {

            /* renamed from: a */
            ImageView f18225a;

            /* renamed from: b */
            TextView f18226b;

            /* renamed from: c */
            TextView f18227c;

            /* renamed from: d */
            ImageView f18228d;

            /* renamed from: e */
            View f18229e;

            private C9979a(C9978b bVar, View view) {
                super(view);
                this.f18225a = (ImageView) view.findViewById(R$id.img_schedule);
                this.f18226b = (TextView) view.findViewById(R$id.tv_schedule_name);
                this.f18227c = (TextView) view.findViewById(R$id.tv_schedule_introduce);
                this.f18228d = (ImageView) view.findViewById(R$id.img_select);
                this.f18229e = view.findViewById(R$id.line);
            }
        }

        private C9978b() {
        }

        /* renamed from: a */
        public /* synthetic */ void mo32247a(C7552d dVar, View view) {
            if (dVar.mo28877c() != DefaultScheduleActivity.this.f18222c.mo28355b2()) {
                DefaultScheduleActivity.this.f18222c.mo28356d2(dVar);
            }
        }

        /* renamed from: b */
        public void onBindViewHolder(@NonNull C9979a aVar, int i) {
            C7552d dVar = (C7552d) DefaultScheduleActivity.this.f18221b.get(i);
            aVar.f18225a.setImageResource(dVar.mo28876b());
            aVar.f18226b.setText(dVar.mo28879e());
            aVar.f18227c.setText(dVar.mo28878d());
            aVar.f18228d.setImageResource(dVar.mo28877c() == DefaultScheduleActivity.this.f18222c.mo28355b2() ? R$drawable.icon_yeelight_default_schedule_choice_selected : R$drawable.icon_yeelight_default_schedule_choice_normal);
            aVar.f18229e.setVisibility(i == getItemCount() + -1 ? 8 : 0);
            aVar.itemView.setOnClickListener(new C10332p(this, dVar));
        }

        @NonNull
        /* renamed from: c */
        public C9979a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return new C9979a(LayoutInflater.from(DefaultScheduleActivity.this).inflate(R$layout.item_default_schedule, viewGroup, false));
        }

        public int getItemCount() {
            if (DefaultScheduleActivity.this.f18221b == null) {
                return 0;
            }
            return DefaultScheduleActivity.this.f18221b.size();
        }
    }

    /* renamed from: X */
    public /* synthetic */ void mo32245X(View view) {
        onBackPressed();
    }

    /* renamed from: Y */
    public /* synthetic */ void mo32246Y() {
        this.f18223d.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_default_schedule);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18220e, "Activity has not device id", false);
            finish();
            return;
        }
        C4198d h0 = C4257w.m11945h0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        if (h0 == null || !h0.mo23331k0()) {
            BaseActivity.m24384U(this);
            finish();
        } else if (h0 instanceof C6727h0) {
            this.f18222c = (C6727h0) h0;
            RecyclerView recyclerView = (RecyclerView) findViewById(R$id.recycle_view);
            ((CommonTitleBar) findViewById(R$id.title_bar)).mo32825a(getString(R$string.vision_default_schedule_title), new C10330o(this), (View.OnClickListener) null);
            this.f18221b = C7552d.C7553a.m22253a();
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setNestedScrollingEnabled(false);
            C9978b bVar = new C9978b();
            this.f18223d = bVar;
            recyclerView.setAdapter(bVar);
        } else {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f18222c.mo23400W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f18222c.mo23365B0(this);
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == 4096) {
            runOnUiThread(new C10334q(this));
        }
    }
}
