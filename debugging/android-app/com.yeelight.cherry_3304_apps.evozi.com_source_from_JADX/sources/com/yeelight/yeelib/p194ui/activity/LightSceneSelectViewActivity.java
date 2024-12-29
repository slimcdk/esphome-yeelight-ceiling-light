package com.yeelight.yeelib.p194ui.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.yeelight.yeelib.R$color;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.models.C7632k;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p153g.C4300b0;
import com.yeelight.yeelib.p153g.C9830b;
import com.yeelight.yeelib.p153g.C9838i;
import com.yeelight.yeelib.p153g.C9844m;
import com.yeelight.yeelib.p153g.C9849r;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.view.LightView;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C10549p;
import com.yeelight.yeelib.utils.C4308b;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity */
public class LightSceneSelectViewActivity extends BaseActivity {

    /* renamed from: v */
    private static final String f18576v = LightSceneSelectViewActivity.class.getSimpleName();

    /* renamed from: b */
    CommonTitleBar f18577b;

    /* renamed from: c */
    LinearLayout f18578c;

    /* renamed from: d */
    LinearLayout f18579d;

    /* renamed from: e */
    TabLayout f18580e;

    /* renamed from: f */
    GridView f18581f;

    /* renamed from: g */
    RecyclerView f18582g;

    /* renamed from: h */
    RecyclerView f18583h;

    /* renamed from: i */
    LinearLayout f18584i;

    /* renamed from: j */
    TextView f18585j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public List<C10112n> f18586k = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public List<C10112n> f18587l = new ArrayList();

    /* renamed from: m */
    List<C10113o> f18588m = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C10114p f18589n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C10107k f18590o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C10110m f18591p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C4200i f18592q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f18593r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public ArrayList<C10116q> f18594s = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: t */
    public int f18595t = -1;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public int f18596u = -1;

    /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$FavoriteSceneVH */
    public class FavoriteSceneVH extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public LightView f18597a;

        /* renamed from: b */
        public TextView f18598b;

        /* renamed from: c */
        public TextView f18599c;

        /* renamed from: d */
        public CheckBox f18600d;

        /* renamed from: e */
        public LinearLayout f18601e;

        public FavoriteSceneVH(LightSceneSelectViewActivity lightSceneSelectViewActivity, View view) {
            super(view);
            this.f18597a = (LightView) view.findViewById(R$id.fav_img);
            this.f18598b = (TextView) view.findViewById(R$id.fav_name);
            this.f18599c = (TextView) view.findViewById(R$id.fav_value);
            this.f18600d = (CheckBox) view.findViewById(R$id.checkbox);
            this.f18601e = (LinearLayout) view.findViewById(R$id.item_layout);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$a */
    class C10097a implements View.OnClickListener {
        C10097a() {
        }

        public void onClick(View view) {
            LightSceneSelectViewActivity.this.onBackPressed();
            LightSceneSelectViewActivity.this.setResult(0);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$b */
    class C10098b implements View.OnClickListener {
        C10098b() {
        }

        public void onClick(View view) {
            if (!LightSceneSelectViewActivity.this.f18592q.mo23331k0()) {
                Toast.makeText(LightSceneSelectViewActivity.this, R$string.create_scene_preview_error_offline, 0).show();
                return;
            }
            C9856y X = LightSceneSelectViewActivity.this.m24630k0();
            if (X != null) {
                LightSceneSelectViewActivity.this.f18592q.mo23355x1(X);
            } else {
                Toast.makeText(LightSceneSelectViewActivity.this, R$string.create_scene_preview_error_no_item, 0).show();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$c */
    class C10099c implements View.OnClickListener {
        C10099c() {
        }

        public void onClick(View view) {
            if (LightSceneSelectViewActivity.this.f18595t != -1) {
                Intent intent = new Intent();
                intent.putExtra("scene_select_mode", LightSceneSelectViewActivity.this.f18595t);
                intent.putExtra("scene_select_position", LightSceneSelectViewActivity.this.f18596u);
                intent.putExtra("com.yeelight.cherry.device_id", LightSceneSelectViewActivity.this.f18592q.mo23372G());
                intent.putExtra("position", LightSceneSelectViewActivity.this.f18593r);
                LightSceneSelectViewActivity.this.setResult(-1, intent);
                LightSceneSelectViewActivity.this.finish();
                return;
            }
            Toast.makeText(LightSceneSelectViewActivity.this, R$string.create_scene_preview_error_no_item, 0).show();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$d */
    class C10100d extends RecyclerView.ItemDecoration {
        C10100d(LightSceneSelectViewActivity lightSceneSelectViewActivity) {
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            super.getItemOffsets(rect, view, recyclerView, state);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            float f;
            float f2;
            float f3;
            super.onDrawOver(canvas, recyclerView, state);
            int childCount = recyclerView.getChildCount();
            int paddingLeft = recyclerView.getPaddingLeft();
            int measuredWidth = recyclerView.getMeasuredWidth() - recyclerView.getPaddingRight();
            Paint paint = new Paint();
            paint.setColor(recyclerView.getContext().getResources().getColor(R$color.common_color_divider_line));
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                int bottom = childAt.getBottom() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                int i2 = bottom + 1;
                if (i == childCount - 1) {
                    f3 = (float) paddingLeft;
                    f2 = (float) bottom;
                    f = (float) measuredWidth;
                    i2 -= 2;
                } else {
                    f3 = (float) (C10547m.m25752b(recyclerView.getContext(), 20.0f) + paddingLeft);
                    f2 = (float) bottom;
                    f = (float) measuredWidth;
                }
                canvas.drawRect(f3, f2, f, (float) i2, paint);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$e */
    class C10101e implements C4300b0.C4307g {
        C10101e() {
        }

        /* renamed from: a */
        public void mo23766a(String str) {
        }

        /* renamed from: b */
        public /* synthetic */ void mo32404b() {
            LightSceneSelectViewActivity.this.f18590o.notifyDataSetChanged();
        }

        /* renamed from: f */
        public void mo23767f() {
        }

        /* renamed from: n */
        public void mo23768n(boolean z, List<C9849r> list) {
            "onRefreshRecommend, list number = " + list.size();
            LightSceneSelectViewActivity.this.f18586k.clear();
            for (C9849r nVar : list) {
                LightSceneSelectViewActivity.this.f18586k.add(new C10112n(LightSceneSelectViewActivity.this, nVar, false));
            }
            LightSceneSelectViewActivity.this.runOnUiThread(new C10325l0(this));
        }

        public void onRefresh() {
        }

        /* renamed from: p */
        public void mo23770p(String str) {
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$f */
    class C10102f implements C4300b0.C4307g {
        C10102f() {
        }

        /* renamed from: a */
        public void mo23766a(String str) {
        }

        /* renamed from: b */
        public /* synthetic */ void mo32405b() {
            LightSceneSelectViewActivity.this.f18589n.notifyDataSetChanged();
        }

        /* renamed from: f */
        public void mo23767f() {
        }

        /* renamed from: n */
        public void mo23768n(boolean z, List<C9849r> list) {
        }

        public void onRefresh() {
            LightSceneSelectViewActivity.this.f18587l.clear();
            List<C9849r> p = C4300b0.m12083u().mo23751p(LightSceneSelectViewActivity.this.f18592q.mo23330i1());
            if (p != null) {
                for (C9849r nVar : p) {
                    LightSceneSelectViewActivity.this.f18587l.add(new C10112n(LightSceneSelectViewActivity.this, nVar, false));
                }
            }
            LightSceneSelectViewActivity.this.runOnUiThread(new C10327m0(this));
        }

        /* renamed from: p */
        public void mo23770p(String str) {
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$g */
    class C10103g implements C4300b0.C4307g {
        C10103g() {
        }

        /* renamed from: a */
        public void mo23766a(String str) {
        }

        /* renamed from: b */
        public /* synthetic */ void mo32406b() {
            LightSceneSelectViewActivity.this.f18591p.notifyDataSetChanged();
        }

        /* renamed from: f */
        public void mo23767f() {
        }

        /* renamed from: n */
        public void mo23768n(boolean z, List<C9849r> list) {
        }

        public void onRefresh() {
            LightSceneSelectViewActivity.this.f18588m.clear();
            List<C9838i> j = C4300b0.m12083u().mo23746j(LightSceneSelectViewActivity.this.f18592q.mo23330i1());
            if (j != null) {
                for (C9838i oVar : j) {
                    LightSceneSelectViewActivity lightSceneSelectViewActivity = LightSceneSelectViewActivity.this;
                    lightSceneSelectViewActivity.f18588m.add(new C10113o(lightSceneSelectViewActivity, oVar, false));
                }
            }
            LightSceneSelectViewActivity.this.runOnUiThread(new C10329n0(this));
        }

        /* renamed from: p */
        public void mo23770p(String str) {
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$h */
    class C10104h implements TabLayout.OnTabSelectedListener {
        C10104h() {
        }

        public void onTabReselected(TabLayout.Tab tab) {
        }

        public void onTabSelected(TabLayout.Tab tab) {
            TextView textView;
            int i;
            int i2 = ((C10116q) LightSceneSelectViewActivity.this.f18594s.get(tab.getPosition())).f18636a;
            if (i2 != 0) {
                if (i2 == 1) {
                    LightSceneSelectViewActivity.this.f18581f.setVisibility(4);
                    LightSceneSelectViewActivity.this.f18582g.setVisibility(0);
                    LightSceneSelectViewActivity.this.f18583h.setVisibility(4);
                    LightSceneSelectViewActivity.this.f18591p.notifyDataSetChanged();
                    if (LightSceneSelectViewActivity.this.f18588m.size() == 0) {
                        LightSceneSelectViewActivity.this.f18584i.setVisibility(0);
                        textView = LightSceneSelectViewActivity.this.f18585j;
                        i = R$string.common_text_no_customization;
                    }
                    LightSceneSelectViewActivity.this.f18584i.setVisibility(4);
                    return;
                } else if (i2 == 2) {
                    LightSceneSelectViewActivity.this.f18581f.setVisibility(4);
                    LightSceneSelectViewActivity.this.f18582g.setVisibility(4);
                    LightSceneSelectViewActivity.this.f18583h.setVisibility(0);
                    LightSceneSelectViewActivity.this.f18589n.notifyDataSetChanged();
                    if (LightSceneSelectViewActivity.this.f18587l.size() == 0) {
                        LightSceneSelectViewActivity.this.f18584i.setVisibility(0);
                        textView = LightSceneSelectViewActivity.this.f18585j;
                        i = R$string.common_text_no_favorite;
                    }
                    LightSceneSelectViewActivity.this.f18584i.setVisibility(4);
                    return;
                } else {
                    return;
                }
                textView.setText(i);
                return;
            }
            LightSceneSelectViewActivity.this.f18581f.setVisibility(0);
            LightSceneSelectViewActivity.this.f18582g.setVisibility(4);
            LightSceneSelectViewActivity.this.f18583h.setVisibility(4);
            LightSceneSelectViewActivity.this.f18584i.setVisibility(4);
            LightSceneSelectViewActivity.this.f18590o.notifyDataSetChanged();
        }

        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$i */
    class C10105i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TabLayout f18609a;

        /* renamed from: b */
        final /* synthetic */ int f18610b;

        C10105i(LightSceneSelectViewActivity lightSceneSelectViewActivity, TabLayout tabLayout, int i) {
            this.f18609a = tabLayout;
            this.f18610b = i;
        }

        public void run() {
            try {
                LinearLayout linearLayout = (LinearLayout) this.f18609a.getChildAt(0);
                int b = C10547m.m25752b(this.f18609a.getContext(), (float) this.f18610b);
                for (int i = 0; i < linearLayout.getChildCount(); i++) {
                    View childAt = linearLayout.getChildAt(i);
                    Field declaredField = childAt.getClass().getDeclaredField("textView");
                    declaredField.setAccessible(true);
                    TextView textView = (TextView) declaredField.get(childAt);
                    childAt.setPadding(0, 0, 0, 0);
                    int width = textView.getWidth();
                    if (width == 0) {
                        textView.measure(0, 0);
                        width = textView.getMeasuredWidth();
                    }
                    int width2 = childAt.getWidth();
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                    layoutParams.width = width;
                    if (this.f18610b == 0) {
                        int i2 = width2 - width;
                        layoutParams.leftMargin = i2 / 2;
                        layoutParams.rightMargin = i2 / 2;
                    } else {
                        layoutParams.leftMargin = b;
                        layoutParams.rightMargin = b;
                    }
                    childAt.setLayoutParams(layoutParams);
                    childAt.invalidate();
                }
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$j */
    class C10106j extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public ImageView f18611a;

        /* renamed from: b */
        public TextView f18612b;

        /* renamed from: c */
        public TextView f18613c;

        /* renamed from: d */
        public TextView f18614d;

        /* renamed from: e */
        public LinearLayout f18615e;

        /* renamed from: f */
        public CheckBox f18616f;

        public C10106j(LightSceneSelectViewActivity lightSceneSelectViewActivity, View view) {
            super(view);
            this.f18611a = (ImageView) view.findViewById(R$id.personality_light_type_view);
            this.f18612b = (TextView) view.findViewById(R$id.personality_light_name);
            this.f18613c = (TextView) view.findViewById(R$id.personality_light_frame_count);
            this.f18614d = (TextView) view.findViewById(R$id.personality_light_duration);
            this.f18615e = (LinearLayout) view.findViewById(R$id.personality_light_item_layout);
            this.f18616f = (CheckBox) view.findViewById(R$id.checkbox);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$k */
    private class C10107k extends BaseAdapter {

        /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$k$a */
        class C10108a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f18618a;

            /* renamed from: b */
            final /* synthetic */ C10112n f18619b;

            C10108a(int i, C10112n nVar) {
                this.f18618a = i;
                this.f18619b = nVar;
            }

            public void onClick(View view) {
                int unused = LightSceneSelectViewActivity.this.f18595t = 0;
                int unused2 = LightSceneSelectViewActivity.this.f18596u = this.f18618a;
                LightSceneSelectViewActivity.this.m24638t0();
                this.f18619b.f18629b = true;
                C10107k.this.notifyDataSetChanged();
            }
        }

        private C10107k() {
        }

        /* synthetic */ C10107k(LightSceneSelectViewActivity lightSceneSelectViewActivity, C10097a aVar) {
            this();
        }

        /* renamed from: a */
        private C10112n m24655a(int i) {
            if (LightSceneSelectViewActivity.this.f18586k == null || LightSceneSelectViewActivity.this.f18586k.size() <= i || i < 0) {
                return null;
            }
            return (C10112n) LightSceneSelectViewActivity.this.f18586k.get(i);
        }

        public int getCount() {
            return LightSceneSelectViewActivity.this.f18586k.size();
        }

        public Object getItem(int i) {
            return LightSceneSelectViewActivity.this.f18586k.get(i);
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C10109l lVar;
            int i2;
            Resources resources;
            if (view == null) {
                lVar = new C10109l(LightSceneSelectViewActivity.this, (C10097a) null);
                view2 = LayoutInflater.from(LightSceneSelectViewActivity.this).inflate(R$layout.recommend_scene_checked_layout, (ViewGroup) null);
                view2.setTag(lVar);
            } else {
                view2 = view;
                lVar = (C10109l) view.getTag();
            }
            lVar.f18623c = (ImageView) view2.findViewById(R$id.scene_img);
            lVar.f18624d = (TextView) view2.findViewById(R$id.scene_name);
            lVar.f18621a = (FrameLayout) view2.findViewById(R$id.scene_item_layout);
            lVar.f18622b = (CheckBox) view2.findViewById(R$id.checkbox);
            C10112n a = m24655a(i);
            if (a != null) {
                C9849r a2 = a.mo32416a();
                if (a2 != null) {
                    lVar.f18624d.setText(a2.mo31885q());
                    lVar.f18623c.setBackgroundResource(C10549p.m25765a(4, a2.mo31887s()));
                }
                FrameLayout frameLayout = lVar.f18621a;
                if (a.mo32417b()) {
                    resources = LightSceneSelectViewActivity.this.getResources();
                    i2 = R$color.common_text_click_bg;
                } else {
                    resources = LightSceneSelectViewActivity.this.getResources();
                    i2 = R$color.white;
                }
                frameLayout.setBackgroundColor(resources.getColor(i2));
                lVar.f18622b.setChecked(a.mo32417b());
                view2.setOnClickListener(new C10108a(i, a));
            }
            return view2;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$l */
    private class C10109l {

        /* renamed from: a */
        public FrameLayout f18621a;

        /* renamed from: b */
        public CheckBox f18622b;

        /* renamed from: c */
        public ImageView f18623c;

        /* renamed from: d */
        public TextView f18624d;

        private C10109l(LightSceneSelectViewActivity lightSceneSelectViewActivity) {
        }

        /* synthetic */ C10109l(LightSceneSelectViewActivity lightSceneSelectViewActivity, C10097a aVar) {
            this(lightSceneSelectViewActivity);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$m */
    private class C10110m extends RecyclerView.Adapter<C10106j> {

        /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$m$a */
        class C10111a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C10106j f18626a;

            C10111a(C10106j jVar) {
                this.f18626a = jVar;
            }

            public void onClick(View view) {
                int unused = LightSceneSelectViewActivity.this.f18595t = 1;
                int unused2 = LightSceneSelectViewActivity.this.f18596u = this.f18626a.getAdapterPosition();
                LightSceneSelectViewActivity.this.m24638t0();
                LightSceneSelectViewActivity.this.f18588m.get(this.f18626a.getAdapterPosition()).f18631b = true;
                C10110m.this.notifyDataSetChanged();
            }
        }

        private C10110m() {
        }

        /* synthetic */ C10110m(LightSceneSelectViewActivity lightSceneSelectViewActivity, C10097a aVar) {
            this();
        }

        /* renamed from: a */
        private String m24656a(C9830b bVar) {
            int i = 0;
            for (C9844m c : bVar.mo31871c().mo31723h()) {
                i += c.mo31788c();
            }
            int i2 = i / 86400000;
            return String.format(Locale.US, "%02d:%02d:%02d.%d", new Object[]{Integer.valueOf((i % 86400000) / 3600000), Integer.valueOf((i % 3600000) / 60000), Integer.valueOf((i % 60000) / 1000), Integer.valueOf((i % 1000) / 100)});
        }

        /* renamed from: d */
        private void m24657d(boolean z, C10106j jVar) {
            if (z) {
                jVar.f18615e.setEnabled(true);
                jVar.f18612b.setTextColor(LightSceneSelectViewActivity.this.getResources().getColor(R$color.common_text_color_primary_33));
                jVar.f18613c.setTextColor(LightSceneSelectViewActivity.this.getResources().getColor(R$color.common_text_color_description_99));
                jVar.f18614d.setTextColor(LightSceneSelectViewActivity.this.getResources().getColor(R$color.common_text_color_description_99));
                jVar.f18616f.setVisibility(0);
                return;
            }
            jVar.f18615e.setEnabled(false);
            jVar.f18612b.setTextColor(LightSceneSelectViewActivity.this.getResources().getColor(R$color.common_text_color_not_clickable_cc));
            jVar.f18613c.setTextColor(LightSceneSelectViewActivity.this.getResources().getColor(R$color.common_text_color_not_clickable_cc));
            jVar.f18614d.setTextColor(LightSceneSelectViewActivity.this.getResources().getColor(R$color.common_text_color_not_clickable_cc));
            jVar.f18616f.setVisibility(8);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x01af, code lost:
            if (r12.equals("yeelink.light.color3") != false) goto L_0x0448;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onBindViewHolder(com.yeelight.yeelib.p194ui.activity.LightSceneSelectViewActivity.C10106j r11, int r12) {
            /*
                r10 = this;
                com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity r0 = com.yeelight.yeelib.p194ui.activity.LightSceneSelectViewActivity.this
                java.util.List<com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$o> r0 = r0.f18588m
                java.lang.Object r0 = r0.get(r12)
                com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$o r0 = (com.yeelight.yeelib.p194ui.activity.LightSceneSelectViewActivity.C10113o) r0
                com.yeelight.yeelib.g.i r0 = r0.mo32418a()
                int r1 = r0.mo31761d0()
                r2 = 0
                if (r1 <= 0) goto L_0x001a
                int r1 = r0.mo31761d0()
                goto L_0x001b
            L_0x001a:
                r1 = 0
            L_0x001b:
                android.widget.ImageView r3 = r11.f18611a
                java.util.List<java.lang.Integer> r4 = com.yeelight.yeelib.utils.C10549p.f20166a
                java.lang.Object r1 = r4.get(r1)
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                r3.setImageResource(r1)
                android.widget.TextView r1 = r11.f18612b
                java.lang.String r3 = r0.mo31888t()
                r1.setText(r3)
                java.util.Locale r1 = java.util.Locale.US
                r3 = 2
                java.lang.Object[] r4 = new java.lang.Object[r3]
                com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity r5 = com.yeelight.yeelib.p194ui.activity.LightSceneSelectViewActivity.this
                int r6 = com.yeelight.yeelib.R$string.personality_light_frame_count
                java.lang.CharSequence r5 = r5.getText(r6)
                java.lang.String r5 = r5.toString()
                r4[r2] = r5
                com.yeelight.yeelib.g.a r5 = r0.mo31871c()
                java.util.List r5 = r5.mo31723h()
                int r5 = r5.size()
                java.lang.String r5 = java.lang.String.valueOf(r5)
                r6 = 1
                r4[r6] = r5
                java.lang.String r5 = "%s：%s"
                java.lang.String r1 = java.lang.String.format(r1, r5, r4)
                java.util.Locale r4 = java.util.Locale.US
                java.lang.Object[] r7 = new java.lang.Object[r3]
                com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity r8 = com.yeelight.yeelib.p194ui.activity.LightSceneSelectViewActivity.this
                int r9 = com.yeelight.yeelib.R$string.personality_light_add_duration
                java.lang.CharSequence r8 = r8.getText(r9)
                java.lang.String r8 = r8.toString()
                r7[r2] = r8
                java.lang.String r8 = r10.m24656a(r0)
                r7[r6] = r8
                java.lang.String r4 = java.lang.String.format(r4, r5, r7)
                android.widget.TextView r5 = r11.f18613c
                r5.setText(r1)
                android.widget.TextView r1 = r11.f18614d
                r1.setText(r4)
                android.widget.CheckBox r1 = r11.f18616f
                com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity r4 = com.yeelight.yeelib.p194ui.activity.LightSceneSelectViewActivity.this
                java.util.List<com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$o> r4 = r4.f18588m
                java.lang.Object r12 = r4.get(r12)
                com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$o r12 = (com.yeelight.yeelib.p194ui.activity.LightSceneSelectViewActivity.C10113o) r12
                boolean r12 = r12.mo32419b()
                r1.setChecked(r12)
                com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity r12 = com.yeelight.yeelib.p194ui.activity.LightSceneSelectViewActivity.this
                com.yeelight.yeelib.c.i.i r12 = r12.f18592q
                java.lang.String r12 = r12.mo23330i1()
                r1 = -1
                int r4 = r12.hashCode()
                switch(r4) {
                    case -1644531059: goto L_0x043c;
                    case -1462015191: goto L_0x0431;
                    case -1462015190: goto L_0x0426;
                    case -1462015189: goto L_0x041b;
                    case -1462015188: goto L_0x0410;
                    case -1462015187: goto L_0x0405;
                    case -1462015186: goto L_0x03fa;
                    case -1462015185: goto L_0x03ef;
                    case -1462015184: goto L_0x03e4;
                    case -1462015183: goto L_0x03d8;
                    case -1462015182: goto L_0x03cc;
                    case -1317475937: goto L_0x03c0;
                    case -1308146488: goto L_0x03b5;
                    case -1063384694: goto L_0x03a9;
                    case -1063384689: goto L_0x039d;
                    case -1063384687: goto L_0x0391;
                    case -1063384685: goto L_0x0385;
                    case -948847040: goto L_0x0379;
                    case -948847038: goto L_0x036d;
                    case -845289553: goto L_0x0361;
                    case -845289551: goto L_0x0355;
                    case -845289508: goto L_0x0349;
                    case -449944724: goto L_0x033d;
                    case -449944723: goto L_0x0331;
                    case -449944722: goto L_0x0325;
                    case -448603205: goto L_0x0319;
                    case -448603202: goto L_0x030d;
                    case -448603201: goto L_0x0301;
                    case -448603157: goto L_0x02f5;
                    case -448603156: goto L_0x02e9;
                    case 922669543: goto L_0x02dd;
                    case 922669544: goto L_0x02d1;
                    case 922669545: goto L_0x02c5;
                    case 922669546: goto L_0x02b9;
                    case 922669547: goto L_0x02ad;
                    case 922669548: goto L_0x02a1;
                    case 922669549: goto L_0x0295;
                    case 922669550: goto L_0x0289;
                    case 1201756974: goto L_0x027d;
                    case 1201757021: goto L_0x0271;
                    case 1623724661: goto L_0x0265;
                    case 1623724662: goto L_0x0259;
                    case 1623724663: goto L_0x024d;
                    default: goto L_0x00ac;
                }
            L_0x00ac:
                switch(r4) {
                    case -1462015160: goto L_0x0241;
                    case -1462015159: goto L_0x0235;
                    case -1462015158: goto L_0x0229;
                    case -1462015157: goto L_0x021d;
                    case -1462015156: goto L_0x0211;
                    default: goto L_0x00af;
                }
            L_0x00af:
                switch(r4) {
                    case -1317475940: goto L_0x0205;
                    case -1317475939: goto L_0x01f9;
                    default: goto L_0x00b2;
                }
            L_0x00b2:
                switch(r4) {
                    case -1317475915: goto L_0x01ed;
                    case -1317475914: goto L_0x01e1;
                    case -1317475913: goto L_0x01d5;
                    case -1317475912: goto L_0x01c9;
                    default: goto L_0x00b5;
                }
            L_0x00b5:
                switch(r4) {
                    case -1308146495: goto L_0x01be;
                    case -1308146494: goto L_0x01b3;
                    case -1308146493: goto L_0x01a9;
                    case -1308146492: goto L_0x019e;
                    case -1308146491: goto L_0x0193;
                    case -1308146490: goto L_0x0188;
                    default: goto L_0x00b8;
                }
            L_0x00b8:
                switch(r4) {
                    case -1308146447: goto L_0x017d;
                    case -1308146446: goto L_0x0171;
                    case -1308146445: goto L_0x0165;
                    default: goto L_0x00bb;
                }
            L_0x00bb:
                switch(r4) {
                    case -888668266: goto L_0x0159;
                    case -888668265: goto L_0x014d;
                    case -888668264: goto L_0x0141;
                    default: goto L_0x00be;
                }
            L_0x00be:
                switch(r4) {
                    case -845289556: goto L_0x0135;
                    case -845289555: goto L_0x0129;
                    default: goto L_0x00c1;
                }
            L_0x00c1:
                switch(r4) {
                    case -458141175: goto L_0x011d;
                    case -458141174: goto L_0x0111;
                    case -458141173: goto L_0x0105;
                    case -458141172: goto L_0x00f9;
                    default: goto L_0x00c4;
                }
            L_0x00c4:
                switch(r4) {
                    case -449944730: goto L_0x00ed;
                    case -449944729: goto L_0x00e1;
                    case -449944728: goto L_0x00d5;
                    case -449944727: goto L_0x00c9;
                    default: goto L_0x00c7;
                }
            L_0x00c7:
                goto L_0x0447
            L_0x00c9:
                java.lang.String r3 = "yeelink.light.lamp4"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 32
                goto L_0x0448
            L_0x00d5:
                java.lang.String r3 = "yeelink.light.lamp3"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 74
                goto L_0x0448
            L_0x00e1:
                java.lang.String r3 = "yeelink.light.lamp2"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 73
                goto L_0x0448
            L_0x00ed:
                java.lang.String r3 = "yeelink.light.lamp1"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 31
                goto L_0x0448
            L_0x00f9:
                java.lang.String r3 = "yeelink.light.ceild"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 69
                goto L_0x0448
            L_0x0105:
                java.lang.String r3 = "yeelink.light.ceilc"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 68
                goto L_0x0448
            L_0x0111:
                java.lang.String r3 = "yeelink.light.ceilb"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 67
                goto L_0x0448
            L_0x011d:
                java.lang.String r3 = "yeelink.light.ceila"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 66
                goto L_0x0448
            L_0x0129:
                java.lang.String r3 = "yeelink.light.strip2"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 15
                goto L_0x0448
            L_0x0135:
                java.lang.String r3 = "yeelink.light.strip1"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 14
                goto L_0x0448
            L_0x0141:
                java.lang.String r3 = "yilai.light.ceiling3"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 72
                goto L_0x0448
            L_0x014d:
                java.lang.String r3 = "yilai.light.ceiling2"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 71
                goto L_0x0448
            L_0x0159:
                java.lang.String r3 = "yilai.light.ceiling1"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 70
                goto L_0x0448
            L_0x0165:
                java.lang.String r3 = "yeelink.light.colorc"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 9
                goto L_0x0448
            L_0x0171:
                java.lang.String r3 = "yeelink.light.colorb"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 8
                goto L_0x0448
            L_0x017d:
                java.lang.String r3 = "yeelink.light.colora"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 7
                goto L_0x0448
            L_0x0188:
                java.lang.String r3 = "yeelink.light.color6"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 5
                goto L_0x0448
            L_0x0193:
                java.lang.String r3 = "yeelink.light.color5"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 4
                goto L_0x0448
            L_0x019e:
                java.lang.String r3 = "yeelink.light.color4"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 3
                goto L_0x0448
            L_0x01a9:
                java.lang.String r4 = "yeelink.light.color3"
                boolean r12 = r12.equals(r4)
                if (r12 == 0) goto L_0x0447
                goto L_0x0448
            L_0x01b3:
                java.lang.String r3 = "yeelink.light.color2"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 1
                goto L_0x0448
            L_0x01be:
                java.lang.String r3 = "yeelink.light.color1"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 0
                goto L_0x0448
            L_0x01c9:
                java.lang.String r3 = "yeelink.light.ceil33"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 65
                goto L_0x0448
            L_0x01d5:
                java.lang.String r3 = "yeelink.light.ceil32"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 64
                goto L_0x0448
            L_0x01e1:
                java.lang.String r3 = "yeelink.light.ceil31"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 63
                goto L_0x0448
            L_0x01ed:
                java.lang.String r3 = "yeelink.light.ceil30"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 62
                goto L_0x0448
            L_0x01f9:
                java.lang.String r3 = "yeelink.light.ceil27"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 60
                goto L_0x0448
            L_0x0205:
                java.lang.String r3 = "yeelink.light.ceil26"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 59
                goto L_0x0448
            L_0x0211:
                java.lang.String r3 = "yeelink.light.ceiling24"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 58
                goto L_0x0448
            L_0x021d:
                java.lang.String r3 = "yeelink.light.ceiling23"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 57
                goto L_0x0448
            L_0x0229:
                java.lang.String r3 = "yeelink.light.ceiling22"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 56
                goto L_0x0448
            L_0x0235:
                java.lang.String r3 = "yeelink.light.ceiling21"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 55
                goto L_0x0448
            L_0x0241:
                java.lang.String r3 = "yeelink.light.ceiling20"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 54
                goto L_0x0448
            L_0x024d:
                java.lang.String r3 = "yeelink.light.bslamp3"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 12
                goto L_0x0448
            L_0x0259:
                java.lang.String r3 = "yeelink.light.bslamp2"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 11
                goto L_0x0448
            L_0x0265:
                java.lang.String r3 = "yeelink.light.bslamp1"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 10
                goto L_0x0448
            L_0x0271:
                java.lang.String r3 = "yeelink.light.cta"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 28
                goto L_0x0448
            L_0x027d:
                java.lang.String r3 = "yeelink.light.ct2"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 27
                goto L_0x0448
            L_0x0289:
                java.lang.String r3 = "yeelink.light.ceiling8"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 43
                goto L_0x0448
            L_0x0295:
                java.lang.String r3 = "yeelink.light.ceiling7"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 42
                goto L_0x0448
            L_0x02a1:
                java.lang.String r3 = "yeelink.light.ceiling6"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 41
                goto L_0x0448
            L_0x02ad:
                java.lang.String r3 = "yeelink.light.ceiling5"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 40
                goto L_0x0448
            L_0x02b9:
                java.lang.String r3 = "yeelink.light.ceiling4"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 39
                goto L_0x0448
            L_0x02c5:
                java.lang.String r3 = "yeelink.light.ceiling3"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 38
                goto L_0x0448
            L_0x02d1:
                java.lang.String r3 = "yeelink.light.ceiling2"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 26
                goto L_0x0448
            L_0x02dd:
                java.lang.String r3 = "yeelink.light.ceiling1"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 37
                goto L_0x0448
            L_0x02e9:
                java.lang.String r3 = "yeelink.light.monob"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 23
                goto L_0x0448
            L_0x02f5:
                java.lang.String r3 = "yeelink.light.monoa"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 22
                goto L_0x0448
            L_0x0301:
                java.lang.String r3 = "yeelink.light.mono5"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 21
                goto L_0x0448
            L_0x030d:
                java.lang.String r3 = "yeelink.light.mono4"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 20
                goto L_0x0448
            L_0x0319:
                java.lang.String r3 = "yeelink.light.mono1"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 19
                goto L_0x0448
            L_0x0325:
                java.lang.String r3 = "yeelink.light.lamp9"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 35
                goto L_0x0448
            L_0x0331:
                java.lang.String r3 = "yeelink.light.lamp8"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 34
                goto L_0x0448
            L_0x033d:
                java.lang.String r3 = "yeelink.light.lamp7"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 33
                goto L_0x0448
            L_0x0349:
                java.lang.String r3 = "yeelink.light.stripa"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 17
                goto L_0x0448
            L_0x0355:
                java.lang.String r3 = "yeelink.light.strip6"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 16
                goto L_0x0448
            L_0x0361:
                java.lang.String r3 = "yeelink.light.strip4"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 29
                goto L_0x0448
            L_0x036d:
                java.lang.String r3 = "yeelink.light.panel3"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 30
                goto L_0x0448
            L_0x0379:
                java.lang.String r3 = "yeelink.light.panel1"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 24
                goto L_0x0448
            L_0x0385:
                java.lang.String r3 = "yeelink.light.lamp19"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 13
                goto L_0x0448
            L_0x0391:
                java.lang.String r3 = "yeelink.light.lamp17"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 25
                goto L_0x0448
            L_0x039d:
                java.lang.String r3 = "yeelink.light.lamp15"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 36
                goto L_0x0448
            L_0x03a9:
                java.lang.String r3 = "yeelink.light.lamp10"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 18
                goto L_0x0448
            L_0x03b5:
                java.lang.String r3 = "yeelink.light.color8"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 6
                goto L_0x0448
            L_0x03c0:
                java.lang.String r3 = "yeelink.light.ceil29"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 61
                goto L_0x0448
            L_0x03cc:
                java.lang.String r3 = "yeelink.light.ceiling19"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 53
                goto L_0x0448
            L_0x03d8:
                java.lang.String r3 = "yeelink.light.ceiling18"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 52
                goto L_0x0448
            L_0x03e4:
                java.lang.String r3 = "yeelink.light.ceiling17"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 51
                goto L_0x0448
            L_0x03ef:
                java.lang.String r3 = "yeelink.light.ceiling16"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 50
                goto L_0x0448
            L_0x03fa:
                java.lang.String r3 = "yeelink.light.ceiling15"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 49
                goto L_0x0448
            L_0x0405:
                java.lang.String r3 = "yeelink.light.ceiling14"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 48
                goto L_0x0448
            L_0x0410:
                java.lang.String r3 = "yeelink.light.ceiling13"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 47
                goto L_0x0448
            L_0x041b:
                java.lang.String r3 = "yeelink.light.ceiling12"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 46
                goto L_0x0448
            L_0x0426:
                java.lang.String r3 = "yeelink.light.ceiling11"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 45
                goto L_0x0448
            L_0x0431:
                java.lang.String r3 = "yeelink.light.ceiling10"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 44
                goto L_0x0448
            L_0x043c:
                java.lang.String r3 = "yeelink.bhf_light.v1"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0447
                r3 = 75
                goto L_0x0448
            L_0x0447:
                r3 = -1
            L_0x0448:
                switch(r3) {
                    case 0: goto L_0x04b5;
                    case 1: goto L_0x04b5;
                    case 2: goto L_0x04b5;
                    case 3: goto L_0x04b5;
                    case 4: goto L_0x04b5;
                    case 5: goto L_0x04b5;
                    case 6: goto L_0x04b5;
                    case 7: goto L_0x04b5;
                    case 8: goto L_0x04b5;
                    case 9: goto L_0x04b5;
                    case 10: goto L_0x04b5;
                    case 11: goto L_0x04b5;
                    case 12: goto L_0x04b5;
                    case 13: goto L_0x04b5;
                    case 14: goto L_0x04b5;
                    case 15: goto L_0x04b5;
                    case 16: goto L_0x04b5;
                    case 17: goto L_0x04b5;
                    case 18: goto L_0x04b5;
                    case 19: goto L_0x0487;
                    case 20: goto L_0x0487;
                    case 21: goto L_0x0487;
                    case 22: goto L_0x0487;
                    case 23: goto L_0x0487;
                    case 24: goto L_0x0487;
                    case 25: goto L_0x0487;
                    case 26: goto L_0x0487;
                    case 27: goto L_0x044d;
                    case 28: goto L_0x044d;
                    case 29: goto L_0x044d;
                    case 30: goto L_0x044d;
                    case 31: goto L_0x044d;
                    case 32: goto L_0x044d;
                    case 33: goto L_0x044d;
                    case 34: goto L_0x044d;
                    case 35: goto L_0x044d;
                    case 36: goto L_0x044d;
                    case 37: goto L_0x044d;
                    case 38: goto L_0x044d;
                    case 39: goto L_0x044d;
                    case 40: goto L_0x044d;
                    case 41: goto L_0x044d;
                    case 42: goto L_0x044d;
                    case 43: goto L_0x044d;
                    case 44: goto L_0x044d;
                    case 45: goto L_0x044d;
                    case 46: goto L_0x044d;
                    case 47: goto L_0x044d;
                    case 48: goto L_0x044d;
                    case 49: goto L_0x044d;
                    case 50: goto L_0x044d;
                    case 51: goto L_0x044d;
                    case 52: goto L_0x044d;
                    case 53: goto L_0x044d;
                    case 54: goto L_0x044d;
                    case 55: goto L_0x044d;
                    case 56: goto L_0x044d;
                    case 57: goto L_0x044d;
                    case 58: goto L_0x044d;
                    case 59: goto L_0x044d;
                    case 60: goto L_0x044d;
                    case 61: goto L_0x044d;
                    case 62: goto L_0x044d;
                    case 63: goto L_0x044d;
                    case 64: goto L_0x044d;
                    case 65: goto L_0x044d;
                    case 66: goto L_0x044d;
                    case 67: goto L_0x044d;
                    case 68: goto L_0x044d;
                    case 69: goto L_0x044d;
                    case 70: goto L_0x044d;
                    case 71: goto L_0x044d;
                    case 72: goto L_0x044d;
                    case 73: goto L_0x044d;
                    case 74: goto L_0x044d;
                    case 75: goto L_0x044d;
                    default: goto L_0x044b;
                }
            L_0x044b:
                goto L_0x04b8
            L_0x044d:
                r12 = 0
            L_0x044e:
                com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity r1 = com.yeelight.yeelib.p194ui.activity.LightSceneSelectViewActivity.this
                java.util.List<com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$o> r1 = r1.f18588m
                int r1 = r1.size()
                if (r12 >= r1) goto L_0x04b8
                com.yeelight.yeelib.g.i$a r1 = r0.mo31760c0()
                com.yeelight.yeelib.g.i$a r3 = com.yeelight.yeelib.p153g.C9838i.C9839a.MODE_BRIGHT_ONLY
                boolean r1 = r1.equals(r3)
                if (r1 != 0) goto L_0x0481
                com.yeelight.yeelib.g.i$a r1 = r0.mo31760c0()
                com.yeelight.yeelib.g.i$a r3 = com.yeelight.yeelib.p153g.C9838i.C9839a.MODE_SUSPEND
                boolean r1 = r1.equals(r3)
                if (r1 != 0) goto L_0x0481
                com.yeelight.yeelib.g.i$a r1 = r0.mo31760c0()
                com.yeelight.yeelib.g.i$a r3 = com.yeelight.yeelib.p153g.C9838i.C9839a.MODE_CT
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L_0x047d
                goto L_0x0481
            L_0x047d:
                r10.m24657d(r2, r11)
                goto L_0x0484
            L_0x0481:
                r10.m24657d(r6, r11)
            L_0x0484:
                int r12 = r12 + 1
                goto L_0x044e
            L_0x0487:
                r12 = 0
            L_0x0488:
                com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity r1 = com.yeelight.yeelib.p194ui.activity.LightSceneSelectViewActivity.this
                java.util.List<com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$o> r1 = r1.f18588m
                int r1 = r1.size()
                if (r12 >= r1) goto L_0x04b8
                com.yeelight.yeelib.g.i$a r1 = r0.mo31760c0()
                com.yeelight.yeelib.g.i$a r3 = com.yeelight.yeelib.p153g.C9838i.C9839a.MODE_BRIGHT_ONLY
                boolean r1 = r1.equals(r3)
                if (r1 != 0) goto L_0x04af
                com.yeelight.yeelib.g.i$a r1 = r0.mo31760c0()
                com.yeelight.yeelib.g.i$a r3 = com.yeelight.yeelib.p153g.C9838i.C9839a.MODE_SUSPEND
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L_0x04ab
                goto L_0x04af
            L_0x04ab:
                r10.m24657d(r2, r11)
                goto L_0x04b2
            L_0x04af:
                r10.m24657d(r6, r11)
            L_0x04b2:
                int r12 = r12 + 1
                goto L_0x0488
            L_0x04b5:
                r10.m24657d(r6, r11)
            L_0x04b8:
                android.widget.LinearLayout r12 = r11.f18615e
                com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$m$a r0 = new com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$m$a
                r0.<init>(r11)
                r12.setOnClickListener(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.activity.LightSceneSelectViewActivity.C10110m.onBindViewHolder(com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$j, int):void");
        }

        /* renamed from: c */
        public C10106j onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C10106j(LightSceneSelectViewActivity.this, LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.list_item_personality_light_checked, viewGroup, false));
        }

        public int getItemCount() {
            return LightSceneSelectViewActivity.this.f18588m.size();
        }

        public long getItemId(int i) {
            return 0;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$n */
    class C10112n {

        /* renamed from: a */
        C9849r f18628a;

        /* renamed from: b */
        boolean f18629b;

        C10112n(LightSceneSelectViewActivity lightSceneSelectViewActivity, C9849r rVar, boolean z) {
            this.f18628a = rVar;
            this.f18629b = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C9849r mo32416a() {
            return this.f18628a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo32417b() {
            return this.f18629b;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$o */
    class C10113o {

        /* renamed from: a */
        C9838i f18630a;

        /* renamed from: b */
        boolean f18631b;

        C10113o(LightSceneSelectViewActivity lightSceneSelectViewActivity, C9838i iVar, boolean z) {
            this.f18630a = iVar;
            this.f18631b = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C9838i mo32418a() {
            return this.f18630a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo32419b() {
            return this.f18631b;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$p */
    class C10114p extends RecyclerView.Adapter<FavoriteSceneVH> {

        /* renamed from: a */
        private final String f18632a;

        /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$p$a */
        class C10115a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f18634a;

            C10115a(int i) {
                this.f18634a = i;
            }

            public void onClick(View view) {
                int unused = LightSceneSelectViewActivity.this.f18595t = 2;
                int unused2 = LightSceneSelectViewActivity.this.f18596u = this.f18634a;
                LightSceneSelectViewActivity.this.m24638t0();
                ((C10112n) LightSceneSelectViewActivity.this.f18587l.get(this.f18634a)).f18629b = true;
                C10114p.this.notifyDataSetChanged();
            }
        }

        public C10114p(String str) {
            this.f18632a = str;
        }

        /* renamed from: a */
        public void onBindViewHolder(FavoriteSceneVH favoriteSceneVH, int i) {
            TextView textView;
            String string;
            StringBuilder sb;
            int h;
            C9849r a = ((C10112n) LightSceneSelectViewActivity.this.f18587l.get(i)).mo32416a();
            favoriteSceneVH.f18598b.setText(a.mo31885q());
            if (a.mo31893y()) {
                textView = favoriteSceneVH.f18599c;
                sb = new StringBuilder();
                sb.append(favoriteSceneVH.f18599c.getContext().getResources().getString(R$string.common_text_bright));
                sb.append("：");
                h = a.mo31874f();
            } else if (a.mo31853B()) {
                textView = favoriteSceneVH.f18599c;
                sb = new StringBuilder();
                sb.append(favoriteSceneVH.f18599c.getContext().getResources().getString(R$string.common_text_color));
                sb.append("：");
                sb.append(Color.red(a.mo31875g()));
                sb.append(", ");
                sb.append(Color.green(a.mo31875g()));
                sb.append(", ");
                h = Color.blue(a.mo31875g());
            } else if (a.mo31855D()) {
                textView = favoriteSceneVH.f18599c;
                sb = new StringBuilder();
                sb.append(favoriteSceneVH.f18599c.getContext().getResources().getString(R$string.personality_light_add_ct));
                sb.append("：");
                h = a.mo31876h();
            } else {
                if (a.mo31856E()) {
                    favoriteSceneVH.f18599c.setText(favoriteSceneVH.f18599c.getContext().getResources().getString(R$string.common_text_flow));
                } else if (a.mo31857F()) {
                    textView = favoriteSceneVH.f18599c;
                    string = textView.getContext().getResources().getString(R$string.common_text_night_light);
                    textView.setText(string);
                }
                favoriteSceneVH.f18597a.setColors(a.mo31873e(this.f18632a));
                favoriteSceneVH.f18600d.setChecked(((C10112n) LightSceneSelectViewActivity.this.f18587l.get(i)).mo32417b());
                favoriteSceneVH.f18601e.setOnClickListener(new C10115a(i));
            }
            sb.append(h);
            string = sb.toString();
            textView.setText(string);
            favoriteSceneVH.f18597a.setColors(a.mo31873e(this.f18632a));
            favoriteSceneVH.f18600d.setChecked(((C10112n) LightSceneSelectViewActivity.this.f18587l.get(i)).mo32417b());
            favoriteSceneVH.f18601e.setOnClickListener(new C10115a(i));
        }

        /* renamed from: b */
        public FavoriteSceneVH onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new FavoriteSceneVH(LightSceneSelectViewActivity.this, LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.item_scene_favorite_checked, viewGroup, false));
        }

        public int getItemCount() {
            return LightSceneSelectViewActivity.this.f18587l.size();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$q */
    public class C10116q {

        /* renamed from: a */
        int f18636a;

        /* renamed from: b */
        String f18637b;

        C10116q(LightSceneSelectViewActivity lightSceneSelectViewActivity, int i, String str) {
            this.f18636a = i;
            this.f18637b = str;
        }

        /* renamed from: a */
        public String mo32423a() {
            return this.f18637b;
        }
    }

    /* renamed from: V */
    private void m24615V(TabLayout tabLayout, int i, int i2) {
        tabLayout.setTabMode(i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C10547m.m25751a(this, 44.0f));
        int a = C10547m.m25751a(this, (float) i2);
        layoutParams.setMargins(a, 0, a, 0);
        tabLayout.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public C9856y m24630k0() {
        int i = this.f18595t;
        if (i == 0) {
            return this.f18586k.get(this.f18596u).mo32416a();
        }
        if (i == 1) {
            return this.f18588m.get(this.f18596u).mo32418a();
        }
        if (i != 2) {
            return null;
        }
        return this.f18587l.get(this.f18596u).mo32416a();
    }

    /* renamed from: l0 */
    private void m24631l0() {
        C4300b0.m12083u().mo23755v(new C10103g());
    }

    /* renamed from: m0 */
    private void m24632m0() {
        C4300b0.m12083u().mo23752q(this.f18592q.mo23330i1(), new C10102f());
    }

    /* renamed from: n0 */
    private void m24633n0() {
        this.f18590o = new C10107k(this, (C10097a) null);
        this.f18591p = new C10110m(this, (C10097a) null);
        this.f18589n = new C10114p(this.f18592q.mo23330i1());
        this.f18581f.setAdapter(this.f18590o);
        this.f18582g.setAdapter(this.f18591p);
        this.f18583h.setAdapter(this.f18589n);
        m24634o0();
        m24632m0();
        m24631l0();
    }

    /* renamed from: o0 */
    private void m24634o0() {
        String i1 = this.f18592q.mo23330i1();
        if (TextUtils.isEmpty(i1)) {
            C4308b.m12139r(f18576v, "model can't be null!");
            return;
        }
        char c = 65535;
        int hashCode = i1.hashCode();
        if (hashCode != -1462015191) {
            if (hashCode == 922669546 && i1.equals("yeelink.light.ceiling4")) {
                c = 0;
            }
        } else if (i1.equals("yeelink.light.ceiling10")) {
            c = 1;
        }
        if (c == 0) {
            i1 = "yeelink.light.ceiling4x";
        } else if (c == 1) {
            i1 = "yeelink.light.ceiling10x";
        }
        C4300b0.m12083u().mo23748l(i1, new C10101e());
    }

    /* renamed from: p0 */
    private void m24635p0(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new C10100d(this));
    }

    /* renamed from: q0 */
    private void m24636q0() {
        this.f18594s.add(new C10116q(this, 0, getResources().getString(R$string.scene_recommend)));
        if (C7632k.m22548i(this.f18592q.mo23330i1(), 256) || C7632k.m22548i(this.f18592q.mo23330i1(), 16) || C7632k.m22548i(this.f18592q.mo23330i1(), 32)) {
            this.f18594s.add(new C10116q(this, 1, getResources().getString(R$string.slide_item_personality)));
        }
        this.f18594s.add(new C10116q(this, 2, getResources().getString(R$string.scene_favorite)));
        m24615V(this.f18580e, 1, 25);
        mo32400s0(this.f18580e, 0);
        for (int i = 0; i < this.f18594s.size(); i++) {
            TabLayout.Tab newTab = this.f18580e.newTab();
            newTab.setText((CharSequence) this.f18594s.get(i).mo32423a());
            this.f18580e.addTab(newTab);
        }
        m24637r0();
    }

    /* renamed from: r0 */
    private void m24637r0() {
        this.f18580e.setOnTabSelectedListener(new C10104h());
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public void m24638t0() {
        for (C10112n nVar : this.f18587l) {
            nVar.f18629b = false;
        }
        for (C10113o oVar : this.f18588m) {
            oVar.f18631b = false;
        }
        for (C10112n nVar2 : this.f18586k) {
            nVar2.f18629b = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_light_scene_select_view);
        this.f18577b = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f18578c = (LinearLayout) findViewById(R$id.layout_left);
        this.f18579d = (LinearLayout) findViewById(R$id.layout_right);
        this.f18580e = (TabLayout) findViewById(R$id.tabLayout_view);
        this.f18581f = (GridView) findViewById(R$id.recommend_scene_grid_view);
        this.f18582g = (RecyclerView) findViewById(R$id.personality_light_list);
        this.f18583h = (RecyclerView) findViewById(R$id.favorite_list_view);
        this.f18584i = (LinearLayout) findViewById(R$id.no_update_layout);
        this.f18585j = (TextView) findViewById(R$id.no_data_tips);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18576v, "Activity has not device id", false);
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("com.yeelight.cherry.device_id");
        this.f18593r = intent.getIntExtra("position", -1);
        C4200i o0 = C4257w.m11953o0(stringExtra);
        this.f18592q = o0;
        if (o0 == null) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        this.f18577b.mo32825a(o0.mo23397U(), new C10097a(), (View.OnClickListener) null);
        this.f18577b.setTitleTextSize(16);
        this.f18578c.setOnClickListener(new C10098b());
        this.f18579d.setOnClickListener(new C10099c());
        m24635p0(this.f18583h);
        m24635p0(this.f18582g);
        m24636q0();
        m24633n0();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f18577b.setTitle(this.f18592q.mo23397U());
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (!C4257w.m11933V(this.f18592q.mo23372G())) {
            finish();
        }
    }

    /* renamed from: s0 */
    public void mo32400s0(TabLayout tabLayout, int i) {
        tabLayout.post(new C10105i(this, tabLayout, i));
    }
}
