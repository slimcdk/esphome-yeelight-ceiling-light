package com.yeelight.yeelib.p142ui.activity;

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
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p051j4.C9193k;
import p150e4.C8991t;
import p150e4.C8992u;
import p160g4.C9076d;

/* renamed from: com.yeelight.yeelib.ui.activity.LightGradientFeatureActivity */
public class LightGradientFeatureActivity extends BaseActivity {

    /* renamed from: h */
    private static final String f14865h = "LightGradientFeatureActivity";

    /* renamed from: a */
    private CommonTitleBar f14866a;

    /* renamed from: b */
    private RecyclerView f14867b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C8514d f14868c;

    /* renamed from: d */
    private List<C8514d> f14869d;

    /* renamed from: e */
    private C8512c f14870e;

    /* renamed from: f */
    private C9076d f14871f;

    /* renamed from: g */
    private WifiDeviceBase f14872g;

    /* renamed from: com.yeelight.yeelib.ui.activity.LightGradientFeatureActivity$b */
    private class C8511b extends RecyclerView.ItemDecoration {

        /* renamed from: a */
        private int f14873a;

        /* renamed from: b */
        private Paint f14874b;

        /* renamed from: c */
        private int f14875c;

        private C8511b(LightGradientFeatureActivity lightGradientFeatureActivity, Context context) {
            Paint paint = new Paint();
            this.f14874b = paint;
            paint.setColor(context.getResources().getColor(R$color.common_color_ee));
            this.f14873a = 1;
            this.f14875c = C9193k.m22150a(lightGradientFeatureActivity, 20.0f);
        }

        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
            super.getItemOffsets(rect, view, recyclerView, state);
            rect.bottom = this.f14873a;
        }

        public void onDraw(@NonNull Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            int i = 0;
            while (i < childCount) {
                View childAt = recyclerView.getChildAt(i);
                canvas.drawRect((float) (i == childCount + -1 ? 0 : this.f14875c), (float) childAt.getBottom(), (float) width, (float) (childAt.getBottom() + this.f14873a), this.f14874b);
                i++;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightGradientFeatureActivity$c */
    private class C8512c extends RecyclerView.Adapter<C8513a> {

        /* renamed from: a */
        private List<C8514d> f14876a;

        /* renamed from: com.yeelight.yeelib.ui.activity.LightGradientFeatureActivity$c$a */
        private class C8513a extends RecyclerView.ViewHolder {

            /* renamed from: a */
            TextView f14878a;

            /* renamed from: b */
            TextView f14879b;

            /* renamed from: c */
            ImageView f14880c;

            public C8513a(@NonNull C8512c cVar, View view) {
                super(view);
                this.f14878a = (TextView) view.findViewById(R$id.tv_duration);
                this.f14879b = (TextView) view.findViewById(R$id.tv_custom_duration);
                this.f14880c = (ImageView) view.findViewById(R$id.img_select);
            }
        }

        public C8512c(List<C8514d> list) {
            this.f14876a = list;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m20209b(C8514d dVar, View view) {
            if (dVar.mo35827e() == 1) {
                LightGradientFeatureActivity.this.m20207g0(dVar);
                return;
            }
            C8514d unused = LightGradientFeatureActivity.this.f14868c = dVar;
            notifyDataSetChanged();
        }

        /* renamed from: c */
        public void onBindViewHolder(@NonNull C8513a aVar, int i) {
            CharSequence charSequence;
            C8514d dVar = this.f14876a.get(i);
            int i2 = (dVar.mo35826c() > 2000 ? 1 : (dVar.mo35826c() == 2000 ? 0 : -1));
            TextView textView = aVar.f14878a;
            if (i2 == 0) {
                charSequence = Html.fromHtml(dVar.m20213d() + "<font color=\"#F44D55\">(" + LightGradientFeatureActivity.this.getResources().getString(R$string.scene_recommend) + ")</font>");
            } else {
                charSequence = dVar.mo35828f();
            }
            textView.setText(charSequence);
            boolean z = LightGradientFeatureActivity.this.f14868c == dVar;
            aVar.f14880c.setImageResource(z ? R$drawable.icon_yeelight_common_choice_selected : R$drawable.icon_yeelight_common_choice_normal);
            if (!z || dVar.mo35827e() != 1) {
                aVar.f14879b.setVisibility(4);
            } else {
                aVar.f14879b.setVisibility(0);
                aVar.f14879b.setText(dVar.mo35825b());
            }
            aVar.itemView.setOnClickListener(new C8732q(this, dVar));
        }

        @NonNull
        /* renamed from: d */
        public C8513a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return new C8513a(this, LayoutInflater.from(LightGradientFeatureActivity.this).inflate(R$layout.item_light_gradient_duration, viewGroup, false));
        }

        public int getItemCount() {
            List<C8514d> list = this.f14876a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightGradientFeatureActivity$d */
    private class C8514d {

        /* renamed from: a */
        private int f14881a = 0;

        /* renamed from: b */
        private long f14882b;

        public C8514d(int i, long j) {
            this.f14881a = i;
        }

        public C8514d(long j) {
            this.f14882b = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public String m20213d() {
            long j = this.f14882b;
            long j2 = j / 1000;
            long j3 = j % 1000;
            StringBuilder sb = new StringBuilder();
            if (j2 > 0) {
                sb.append(j2);
                sb.append(LightGradientFeatureActivity.this.getResources().getString(R$string.personality_light_duration_second));
            }
            if (this.f14882b == 0 || j3 > 0) {
                sb.append(j3);
                sb.append(LightGradientFeatureActivity.this.getResources().getString(R$string.personality_light_duration_millisecond));
            }
            return sb.toString();
        }

        /* renamed from: b */
        public String mo35825b() {
            return m20213d();
        }

        /* renamed from: c */
        public long mo35826c() {
            return this.f14882b;
        }

        /* renamed from: e */
        public int mo35827e() {
            return this.f14881a;
        }

        /* renamed from: f */
        public String mo35828f() {
            return this.f14881a == 1 ? LightGradientFeatureActivity.this.getResources().getString(R$string.common_text_repeat_custom) : m20213d();
        }

        /* renamed from: g */
        public void mo35829g(long j) {
            this.f14882b = j;
        }
    }

    /* renamed from: b0 */
    private void m20202b0() {
        this.f14869d.add(new C8514d(500));
        this.f14869d.add(new C8514d(1000));
        this.f14869d.add(new C8514d(2000));
        this.f14869d.add(new C8514d(3000));
        this.f14869d.add(new C8514d(4000));
        this.f14869d.add(new C8514d(5000));
        this.f14869d.add(new C8514d(1, 0));
    }

    /* renamed from: c0 */
    private void m20203c0() {
        boolean z;
        long O = this.f14872g.mo23221d0().mo31554O();
        Iterator<C8514d> it = this.f14869d.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            C8514d next = it.next();
            if (next.mo35826c() == O) {
                this.f14868c = next;
                z = true;
                break;
            }
        }
        if (!z) {
            for (C8514d next2 : this.f14869d) {
                if (next2.mo35827e() == 1) {
                    this.f14868c = next2;
                    next2.mo35829g(O);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public /* synthetic */ void m20204d0(View view) {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public /* synthetic */ void m20205e0(View view) {
        C8514d dVar = this.f14868c;
        if (dVar != null) {
            this.f14872g.mo23250y1(dVar.mo35826c());
            finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public /* synthetic */ void m20206f0(C8514d dVar, long j) {
        dVar.mo35829g(j);
        this.f14868c = dVar;
        this.f14870e.notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public void m20207g0(C8514d dVar) {
        if (this.f14871f == null) {
            this.f14871f = new C9076d(this);
        }
        this.f14871f.mo37029d(new C8731p(this, dVar));
        this.f14871f.show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C9193k.m22157h(true, this);
        setContentView(R$layout.activity_light_gradient_feature);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f14866a = commonTitleBar;
        commonTitleBar.mo36195a(getString(R$string.settings_feature_light_gradient), new C8991t(this), new C8992u(this));
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f14865h, "Activity has not device id", false);
            finish();
            return;
        }
        WifiDeviceBase P0 = YeelightDeviceManager.m7800o0().mo23274P0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f14872g = P0;
        if (P0 == null || !P0.mo23145k0()) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        this.f14867b = (RecyclerView) findViewById(R$id.recycle_view);
        this.f14869d = new ArrayList();
        m20202b0();
        m20203c0();
        this.f14870e = new C8512c(this.f14869d);
        this.f14867b.setLayoutManager(new LinearLayoutManager(this));
        this.f14867b.addItemDecoration(new C8511b(this));
        this.f14867b.setAdapter(this.f14870e);
    }
}
