package com.yeelight.yeelib.p194ui.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yeelight.yeelib.R$color;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p191j.p192a.C9902d;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yeelight.yeelib.ui.activity.LightGradientFeatureActivity */
public class LightGradientFeatureActivity extends BaseActivity {

    /* renamed from: i */
    private static final String f18557i = LightGradientFeatureActivity.class.getSimpleName();

    /* renamed from: b */
    private CommonTitleBar f18558b;

    /* renamed from: c */
    private RecyclerView f18559c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C10096d f18560d;

    /* renamed from: e */
    private List<C10096d> f18561e;

    /* renamed from: f */
    private C10094c f18562f;

    /* renamed from: g */
    private C9902d f18563g;

    /* renamed from: h */
    private C6006h f18564h;

    /* renamed from: com.yeelight.yeelib.ui.activity.LightGradientFeatureActivity$b */
    private class C10093b extends RecyclerView.ItemDecoration {

        /* renamed from: a */
        private int f18565a;

        /* renamed from: b */
        private Paint f18566b;

        /* renamed from: c */
        private int f18567c;

        private C10093b(LightGradientFeatureActivity lightGradientFeatureActivity, Context context) {
            Paint paint = new Paint();
            this.f18566b = paint;
            paint.setColor(context.getResources().getColor(R$color.common_color_ee));
            this.f18565a = 1;
            this.f18567c = C10547m.m25751a(lightGradientFeatureActivity, 20.0f);
        }

        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
            super.getItemOffsets(rect, view, recyclerView, state);
            rect.bottom = this.f18565a;
        }

        public void onDraw(@NonNull Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            int i = 0;
            while (i < childCount) {
                View childAt = recyclerView.getChildAt(i);
                canvas.drawRect((float) (i == childCount + -1 ? 0 : this.f18567c), (float) childAt.getBottom(), (float) width, (float) (childAt.getBottom() + this.f18565a), this.f18566b);
                i++;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightGradientFeatureActivity$c */
    private class C10094c extends RecyclerView.Adapter<C10095a> {

        /* renamed from: a */
        private List<C10096d> f18568a;

        /* renamed from: com.yeelight.yeelib.ui.activity.LightGradientFeatureActivity$c$a */
        private class C10095a extends RecyclerView.ViewHolder {

            /* renamed from: a */
            TextView f18570a;

            /* renamed from: b */
            TextView f18571b;

            /* renamed from: c */
            ImageView f18572c;

            public C10095a(@NonNull C10094c cVar, View view) {
                super(view);
                this.f18570a = (TextView) view.findViewById(R$id.tv_duration);
                this.f18571b = (TextView) view.findViewById(R$id.tv_custom_duration);
                this.f18572c = (ImageView) view.findViewById(R$id.img_select);
            }
        }

        public C10094c(List<C10096d> list) {
            this.f18568a = list;
        }

        /* renamed from: a */
        public /* synthetic */ void mo32392a(C10096d dVar, View view) {
            if (dVar.mo32397e() == 1) {
                LightGradientFeatureActivity.this.m24601d0(dVar);
                return;
            }
            C10096d unused = LightGradientFeatureActivity.this.f18560d = dVar;
            notifyDataSetChanged();
        }

        /* renamed from: b */
        public void onBindViewHolder(@NonNull C10095a aVar, int i) {
            CharSequence charSequence;
            C10096d dVar = this.f18568a.get(i);
            int i2 = (dVar.mo32396c() > 2000 ? 1 : (dVar.mo32396c() == 2000 ? 0 : -1));
            TextView textView = aVar.f18570a;
            if (i2 == 0) {
                charSequence = Html.fromHtml(dVar.m24609d() + "<font color=\"#F44D55\">(" + LightGradientFeatureActivity.this.getResources().getString(R$string.scene_recommend) + ")</font>");
            } else {
                charSequence = dVar.mo32398f();
            }
            textView.setText(charSequence);
            boolean z = LightGradientFeatureActivity.this.f18560d == dVar;
            aVar.f18572c.setImageResource(z ? R$drawable.icon_yeelight_common_choice_selected : R$drawable.icon_yeelight_common_choice_normal);
            if (!z || dVar.mo32397e() != 1) {
                aVar.f18571b.setVisibility(4);
            } else {
                aVar.f18571b.setVisibility(0);
                aVar.f18571b.setText(dVar.mo32395b());
            }
            aVar.itemView.setOnClickListener(new C10317h0(this, dVar));
        }

        @NonNull
        /* renamed from: c */
        public C10095a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return new C10095a(this, LayoutInflater.from(LightGradientFeatureActivity.this).inflate(R$layout.item_light_gradient_duration, viewGroup, false));
        }

        public int getItemCount() {
            List<C10096d> list = this.f18568a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightGradientFeatureActivity$d */
    private class C10096d {

        /* renamed from: a */
        private int f18573a = 0;

        /* renamed from: b */
        private long f18574b;

        public C10096d(int i, long j) {
            this.f18573a = i;
        }

        public C10096d(long j) {
            this.f18574b = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public String m24609d() {
            long j = this.f18574b;
            long j2 = j / 1000;
            long j3 = j % 1000;
            StringBuilder sb = new StringBuilder();
            if (j2 > 0) {
                sb.append(j2);
                sb.append(LightGradientFeatureActivity.this.getResources().getString(R$string.personality_light_duration_second));
            }
            if (this.f18574b == 0 || j3 > 0) {
                sb.append(j3);
                sb.append(LightGradientFeatureActivity.this.getResources().getString(R$string.personality_light_duration_millisecond));
            }
            return sb.toString();
        }

        /* renamed from: b */
        public String mo32395b() {
            return m24609d();
        }

        /* renamed from: c */
        public long mo32396c() {
            return this.f18574b;
        }

        /* renamed from: e */
        public int mo32397e() {
            return this.f18573a;
        }

        /* renamed from: f */
        public String mo32398f() {
            return this.f18573a == 1 ? LightGradientFeatureActivity.this.getResources().getString(R$string.common_text_repeat_custom) : m24609d();
        }

        /* renamed from: g */
        public void mo32399g(long j) {
            this.f18574b = j;
        }
    }

    /* renamed from: Y */
    private void m24599Y() {
        this.f18561e.add(new C10096d(500));
        this.f18561e.add(new C10096d(1000));
        this.f18561e.add(new C10096d(2000));
        this.f18561e.add(new C10096d(3000));
        this.f18561e.add(new C10096d(4000));
        this.f18561e.add(new C10096d(5000));
        this.f18561e.add(new C10096d(1, 0));
    }

    /* renamed from: Z */
    private void m24600Z() {
        boolean z;
        long N = this.f18564h.mo23408d0().mo27653N();
        Iterator<C10096d> it = this.f18561e.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            C10096d next = it.next();
            if (next.mo32396c() == N) {
                this.f18560d = next;
                z = true;
                break;
            }
        }
        if (!z) {
            for (C10096d next2 : this.f18561e) {
                if (next2.mo32397e() == 1) {
                    this.f18560d = next2;
                    next2.mo32399g(N);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public void m24601d0(C10096d dVar) {
        if (this.f18563g == null) {
            this.f18563g = new C9902d(this);
        }
        this.f18563g.mo32017d(new C10321j0(this, dVar));
        this.f18563g.show();
    }

    /* renamed from: a0 */
    public /* synthetic */ void mo32389a0(View view) {
        finish();
    }

    /* renamed from: b0 */
    public /* synthetic */ void mo32390b0(View view) {
        C10096d dVar = this.f18560d;
        if (dVar != null) {
            this.f18564h.mo23435y1(dVar.mo32396c());
            finish();
        }
    }

    /* renamed from: c0 */
    public /* synthetic */ void mo32391c0(C10096d dVar, long j) {
        dVar.mo32399g(j);
        this.f18560d = dVar;
        this.f18562f.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_light_gradient_feature);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f18558b = commonTitleBar;
        commonTitleBar.mo32825a(getString(R$string.settings_feature_light_gradient), new C10319i0(this), new C10323k0(this));
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18557i, "Activity has not device id", false);
            finish();
            return;
        }
        C6006h L0 = C4257w.m11947l0().mo23651L0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f18564h = L0;
        if (L0 == null || !L0.mo23331k0()) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        this.f18559c = (RecyclerView) findViewById(R$id.recycle_view);
        this.f18561e = new ArrayList();
        m24599Y();
        m24600Z();
        this.f18562f = new C10094c(this.f18561e);
        this.f18559c.setLayoutManager(new LinearLayoutManager(this));
        this.f18559c.addItemDecoration(new C10093b(this));
        this.f18559c.setAdapter(this.f18562f);
    }
}
