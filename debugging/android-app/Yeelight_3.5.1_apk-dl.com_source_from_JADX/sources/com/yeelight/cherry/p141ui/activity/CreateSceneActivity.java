package com.yeelight.cherry.p141ui.activity;

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
import com.yeelight.cherry.C12224R$drawable;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.managers.C3096u;
import com.yeelight.yeelib.models.SceneTemplateBean;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import java.util.List;
import p051j4.C9193k;
import p051j4.C9195n;

/* renamed from: com.yeelight.cherry.ui.activity.CreateSceneActivity */
public class CreateSceneActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C5165e f10146a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public RecyclerView f10147b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f10148c = 2;

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneActivity$a */
    class C5161a implements View.OnClickListener {
        C5161a() {
        }

        public void onClick(View view) {
            CreateSceneActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneActivity$b */
    class C5162b implements View.OnClickListener {
        C5162b() {
        }

        public void onClick(View view) {
            CreateSceneActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneActivity$c */
    class C5163c implements View.OnClickListener {
        C5163c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(CreateSceneActivity.this, ImageModeSelectionActivity.class);
            intent.putExtra("image_type", 3);
            CreateSceneActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneActivity$d */
    class C5164d implements C3096u.C3105e {
        C5164d() {
        }

        /* renamed from: a */
        public void mo23529a() {
            List<SceneTemplateBean> t = C3096u.m8175n().mo23515t();
            if (t.size() > 0) {
                CreateSceneActivity.this.f10146a.mo30337d(t);
                CreateSceneActivity.this.f10147b.addItemDecoration(new GridDividerItemDecoration(CreateSceneActivity.this.getResources().getDrawable(C12224R$drawable.line_divider), CreateSceneActivity.this.getResources().getDrawable(C12224R$drawable.line_divider), CreateSceneActivity.this.f10148c));
            }
        }

        /* renamed from: b */
        public void mo23530b() {
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneActivity$e */
    class C5165e extends RecyclerView.Adapter<C5166a> {

        /* renamed from: a */
        private LayoutInflater f10153a;

        /* renamed from: b */
        private List<SceneTemplateBean> f10154b;

        /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneActivity$e$a */
        class C5166a extends RecyclerView.ViewHolder implements View.OnClickListener {

            /* renamed from: a */
            TextView f10156a;

            /* renamed from: b */
            ImageView f10157b;

            public C5166a(View view) {
                super(view);
                this.f10156a = (TextView) view.findViewById(2131296674);
                this.f10157b = (ImageView) view.findViewById(2131296661);
                view.setOnClickListener(this);
            }

            public void onClick(View view) {
                SceneTemplateBean a = C5165e.this.mo30334a(getAdapterPosition());
                if (a != null) {
                    Intent intent = new Intent(CreateSceneActivity.this, CreateSceneSelectDeviceActivity.class);
                    intent.putExtra("data_template", a);
                    CreateSceneActivity.this.startActivityForResult(intent, 100);
                }
            }
        }

        public C5165e(Context context) {
            this.f10153a = LayoutInflater.from(context);
        }

        /* renamed from: a */
        public SceneTemplateBean mo30334a(int i) {
            List<SceneTemplateBean> list = this.f10154b;
            if (list == null || list.size() <= i || i < 0) {
                return null;
            }
            return this.f10154b.get(i);
        }

        /* renamed from: b */
        public void onBindViewHolder(C5166a aVar, int i) {
            SceneTemplateBean a = mo30334a(i);
            if (a != null) {
                aVar.f10156a.setText(a.getTitle());
                aVar.f10157b.setImageResource(C9195n.m22164a(3, a.getIconId()));
            }
        }

        /* renamed from: c */
        public C5166a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C5166a(this.f10153a.inflate(C12228R$layout.list_item_template, viewGroup, false));
        }

        /* renamed from: d */
        public void mo30337d(List<SceneTemplateBean> list) {
            this.f10154b = list;
            notifyDataSetChanged();
        }

        public int getItemCount() {
            List<SceneTemplateBean> list = this.f10154b;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
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
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_create_scene);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297591);
        commonTitleBar.mo36195a(getText(2131756236).toString(), new C5161a(), new C5162b());
        commonTitleBar.setTitleTextSize(17);
        ((LinearLayout) findViewById(C12225R$id.layout_create_scene)).setOnClickListener(new C5163c());
        this.f10147b = (RecyclerView) findViewById(C12225R$id.template_list);
        C5165e eVar = new C5165e(this);
        this.f10146a = eVar;
        this.f10147b.setAdapter(eVar);
        this.f10147b.setLayoutManager(new GridLayoutManager(this, this.f10148c));
        C3096u.m8175n().mo23517v(new C5164d());
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }
}
