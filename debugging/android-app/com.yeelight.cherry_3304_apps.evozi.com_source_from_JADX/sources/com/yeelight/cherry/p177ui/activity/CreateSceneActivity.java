package com.yeelight.cherry.p177ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dgreenhalgh.android.simpleitemdecoration.grid.GridDividerItemDecoration;
import com.yeelight.cherry.C11744R$drawable;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p152f.C4247u;
import com.yeelight.yeelib.p153g.C9832c0;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C10549p;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.activity.CreateSceneActivity */
public class CreateSceneActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C5117e f10593b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public RecyclerView f10594c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f10595d = 2;

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneActivity$a */
    class C5113a implements View.OnClickListener {
        C5113a() {
        }

        public void onClick(View view) {
            CreateSceneActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneActivity$b */
    class C5114b implements View.OnClickListener {
        C5114b() {
        }

        public void onClick(View view) {
            CreateSceneActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneActivity$c */
    class C5115c implements View.OnClickListener {
        C5115c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(CreateSceneActivity.this, ImageModeSelectionActivity.class);
            intent.putExtra("image_type", 3);
            CreateSceneActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneActivity$d */
    class C5116d implements C4247u.C4256e {
        C5116d() {
        }

        /* renamed from: a */
        public void mo23636a() {
            List<C9832c0> t = C4247u.m11865n().mo23622t();
            if (t.size() > 0) {
                CreateSceneActivity.this.f10593b.mo26289d(t);
                CreateSceneActivity.this.f10594c.addItemDecoration(new GridDividerItemDecoration(CreateSceneActivity.this.getResources().getDrawable(C11744R$drawable.line_divider), CreateSceneActivity.this.getResources().getDrawable(C11744R$drawable.line_divider), CreateSceneActivity.this.f10595d));
            }
        }

        /* renamed from: b */
        public void mo23637b() {
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneActivity$e */
    class C5117e extends RecyclerView.Adapter<C5118a> {

        /* renamed from: a */
        private LayoutInflater f10600a;

        /* renamed from: b */
        private List<C9832c0> f10601b;

        /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneActivity$e$a */
        class C5118a extends RecyclerView.ViewHolder implements View.OnClickListener {

            /* renamed from: a */
            TextView f10603a;

            /* renamed from: b */
            ImageView f10604b;

            public C5118a(View view) {
                super(view);
                this.f10603a = (TextView) view.findViewById(2131296596);
                this.f10604b = (ImageView) view.findViewById(2131296583);
                view.setOnClickListener(this);
            }

            public void onClick(View view) {
                C9832c0 a = C5117e.this.mo26286a(getAdapterPosition());
                if (a != null) {
                    Intent intent = new Intent(CreateSceneActivity.this, CreateSceneSelectDeviceActivity.class);
                    intent.putExtra("data_template", a);
                    CreateSceneActivity.this.startActivityForResult(intent, 100);
                }
            }
        }

        public C5117e(Context context) {
            this.f10600a = LayoutInflater.from(context);
        }

        /* renamed from: a */
        public C9832c0 mo26286a(int i) {
            List<C9832c0> list = this.f10601b;
            if (list == null || list.size() <= i || i < 0) {
                return null;
            }
            return this.f10601b.get(i);
        }

        /* renamed from: b */
        public void onBindViewHolder(C5118a aVar, int i) {
            C9832c0 a = mo26286a(i);
            if (a != null) {
                aVar.f10603a.setText(a.mo31755j());
                aVar.f10604b.setImageResource(C10549p.m25765a(3, a.mo31751f()));
            }
        }

        /* renamed from: c */
        public C5118a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C5118a(this.f10600a.inflate(C11748R$layout.list_item_template, viewGroup, false));
        }

        /* renamed from: d */
        public void mo26289d(List<C9832c0> list) {
            this.f10601b = list;
            notifyDataSetChanged();
        }

        public int getItemCount() {
            List<C9832c0> list = this.f10601b;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
    }

    static {
        Class<CreateSceneActivity> cls = CreateSceneActivity.class;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100 && i2 == -1) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_create_scene);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297424);
        commonTitleBar.mo32825a(getText(2131756211).toString(), new C5113a(), new C5114b());
        commonTitleBar.setTitleTextSize(17);
        ((LinearLayout) findViewById(C11745R$id.layout_create_scene)).setOnClickListener(new C5115c());
        this.f10594c = (RecyclerView) findViewById(C11745R$id.template_list);
        C5117e eVar = new C5117e(this);
        this.f10593b = eVar;
        this.f10594c.setAdapter(eVar);
        this.f10594c.setLayoutManager(new GridLayoutManager(this, this.f10595d));
        C4247u.m11865n().mo23624v(new C5116d());
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }
}
