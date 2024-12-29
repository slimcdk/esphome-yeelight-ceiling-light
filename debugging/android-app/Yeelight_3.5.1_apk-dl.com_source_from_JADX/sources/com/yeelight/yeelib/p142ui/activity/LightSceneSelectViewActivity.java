package com.yeelight.yeelib.p142ui.activity;

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
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.C3112v;
import com.yeelight.yeelib.models.C8309b;
import com.yeelight.yeelib.models.C8319k;
import com.yeelight.yeelib.models.C8321m;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.models.CustomAdvancedFlowScene;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.p142ui.view.LightView;
import com.yeelight.yeelib.utils.AppUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p051j4.C9193k;
import p051j4.C9195n;
import p227x3.C11972i;

/* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity */
public class LightSceneSelectViewActivity extends BaseActivity {

    /* renamed from: u */
    private static final String f14884u = "LightSceneSelectViewActivity";

    /* renamed from: a */
    CommonTitleBar f14885a;

    /* renamed from: b */
    LinearLayout f14886b;

    /* renamed from: c */
    LinearLayout f14887c;

    /* renamed from: d */
    TabLayout f14888d;

    /* renamed from: e */
    GridView f14889e;

    /* renamed from: f */
    RecyclerView f14890f;

    /* renamed from: g */
    RecyclerView f14891g;

    /* renamed from: h */
    LinearLayout f14892h;

    /* renamed from: i */
    TextView f14893i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public List<C8530n> f14894j = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public List<C8530n> f14895k = new ArrayList();

    /* renamed from: l */
    List<C8531o> f14896l = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C8532p f14897m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C8525k f14898n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C8528m f14899o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C3012e f14900p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f14901q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public ArrayList<C8534q> f14902r = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f14903s = -1;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public int f14904t = -1;

    /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$FavoriteSceneVH */
    public class FavoriteSceneVH extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public LightView f14905a;

        /* renamed from: b */
        public TextView f14906b;

        /* renamed from: c */
        public TextView f14907c;

        /* renamed from: d */
        public CheckBox f14908d;

        /* renamed from: e */
        public LinearLayout f14909e;

        public FavoriteSceneVH(LightSceneSelectViewActivity lightSceneSelectViewActivity, View view) {
            super(view);
            this.f14905a = (LightView) view.findViewById(R$id.fav_img);
            this.f14906b = (TextView) view.findViewById(R$id.fav_name);
            this.f14907c = (TextView) view.findViewById(R$id.fav_value);
            this.f14908d = (CheckBox) view.findViewById(R$id.checkbox);
            this.f14909e = (LinearLayout) view.findViewById(R$id.item_layout);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$a */
    class C8515a implements View.OnClickListener {
        C8515a() {
        }

        public void onClick(View view) {
            LightSceneSelectViewActivity.this.onBackPressed();
            LightSceneSelectViewActivity.this.setResult(0);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$b */
    class C8516b implements View.OnClickListener {
        C8516b() {
        }

        public void onClick(View view) {
            if (!LightSceneSelectViewActivity.this.f14900p.mo23145k0()) {
                Toast.makeText(LightSceneSelectViewActivity.this, R$string.create_scene_preview_error_offline, 0).show();
                return;
            }
            C8327s X = LightSceneSelectViewActivity.this.m20234k0();
            if (X != null) {
                LightSceneSelectViewActivity.this.f14900p.mo23168x1(X);
            } else {
                Toast.makeText(LightSceneSelectViewActivity.this, R$string.create_scene_preview_error_no_item, 0).show();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$c */
    class C8517c implements View.OnClickListener {
        C8517c() {
        }

        public void onClick(View view) {
            if (LightSceneSelectViewActivity.this.f14903s != -1) {
                Intent intent = new Intent();
                intent.putExtra("scene_select_mode", LightSceneSelectViewActivity.this.f14903s);
                intent.putExtra("scene_select_position", LightSceneSelectViewActivity.this.f14904t);
                intent.putExtra("com.yeelight.cherry.device_id", LightSceneSelectViewActivity.this.f14900p.mo23185G());
                intent.putExtra("position", LightSceneSelectViewActivity.this.f14901q);
                LightSceneSelectViewActivity.this.setResult(-1, intent);
                LightSceneSelectViewActivity.this.finish();
                return;
            }
            Toast.makeText(LightSceneSelectViewActivity.this, R$string.create_scene_preview_error_no_item, 0).show();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$d */
    class C8518d extends RecyclerView.ItemDecoration {
        C8518d(LightSceneSelectViewActivity lightSceneSelectViewActivity) {
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
                    f3 = (float) (C9193k.m22151b(recyclerView.getContext(), 20.0f) + paddingLeft);
                    f2 = (float) bottom;
                    f = (float) measuredWidth;
                }
                canvas.drawRect(f3, f2, f, (float) i2, paint);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$e */
    class C8519e implements C3112v.C3119g {
        C8519e() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m20245c() {
            LightSceneSelectViewActivity.this.f14898n.notifyDataSetChanged();
        }

        /* renamed from: a */
        public void mo23579a(String str) {
        }

        /* renamed from: g */
        public void mo23580g() {
        }

        public void onRefresh() {
        }

        /* renamed from: r */
        public void mo23582r(boolean z, List<C8321m> list) {
            StringBuilder sb = new StringBuilder();
            sb.append("onRefreshRecommend, list number = ");
            sb.append(list.size());
            LightSceneSelectViewActivity.this.f14894j.clear();
            for (C8321m nVar : list) {
                LightSceneSelectViewActivity.this.f14894j.add(new C8530n(LightSceneSelectViewActivity.this, nVar, false));
            }
            LightSceneSelectViewActivity.this.runOnUiThread(new C8733r(this));
        }

        /* renamed from: s */
        public void mo23583s(String str) {
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$f */
    class C8520f implements C3112v.C3119g {
        C8520f() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m20251c() {
            LightSceneSelectViewActivity.this.f14897m.notifyDataSetChanged();
        }

        /* renamed from: a */
        public void mo23579a(String str) {
        }

        /* renamed from: g */
        public void mo23580g() {
        }

        public void onRefresh() {
            LightSceneSelectViewActivity.this.f14895k.clear();
            List<C8321m> p = C3112v.m8242u().mo23564p(LightSceneSelectViewActivity.this.f14900p.mo23144i1());
            if (p != null) {
                for (C8321m nVar : p) {
                    LightSceneSelectViewActivity.this.f14895k.add(new C8530n(LightSceneSelectViewActivity.this, nVar, false));
                }
            }
            LightSceneSelectViewActivity.this.runOnUiThread(new C8734s(this));
        }

        /* renamed from: r */
        public void mo23582r(boolean z, List<C8321m> list) {
        }

        /* renamed from: s */
        public void mo23583s(String str) {
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$g */
    class C8521g implements C3112v.C3119g {
        C8521g() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m20257c() {
            LightSceneSelectViewActivity.this.f14899o.notifyDataSetChanged();
        }

        /* renamed from: a */
        public void mo23579a(String str) {
        }

        /* renamed from: g */
        public void mo23580g() {
        }

        public void onRefresh() {
            LightSceneSelectViewActivity.this.f14896l.clear();
            List<CustomAdvancedFlowScene> j = C3112v.m8242u().mo23559j(LightSceneSelectViewActivity.this.f14900p.mo23144i1());
            if (j != null) {
                for (CustomAdvancedFlowScene oVar : j) {
                    LightSceneSelectViewActivity lightSceneSelectViewActivity = LightSceneSelectViewActivity.this;
                    lightSceneSelectViewActivity.f14896l.add(new C8531o(lightSceneSelectViewActivity, oVar, false));
                }
            }
            LightSceneSelectViewActivity.this.runOnUiThread(new C8735t(this));
        }

        /* renamed from: r */
        public void mo23582r(boolean z, List<C8321m> list) {
        }

        /* renamed from: s */
        public void mo23583s(String str) {
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$h */
    class C8522h implements TabLayout.OnTabSelectedListener {
        C8522h() {
        }

        public void onTabReselected(TabLayout.Tab tab) {
        }

        public void onTabSelected(TabLayout.Tab tab) {
            TextView textView;
            int i;
            int i2 = ((C8534q) LightSceneSelectViewActivity.this.f14902r.get(tab.getPosition())).f14944a;
            if (i2 != 0) {
                if (i2 == 1) {
                    LightSceneSelectViewActivity.this.f14889e.setVisibility(4);
                    LightSceneSelectViewActivity.this.f14890f.setVisibility(0);
                    LightSceneSelectViewActivity.this.f14891g.setVisibility(4);
                    LightSceneSelectViewActivity.this.f14899o.notifyDataSetChanged();
                    if (LightSceneSelectViewActivity.this.f14896l.size() == 0) {
                        LightSceneSelectViewActivity.this.f14892h.setVisibility(0);
                        textView = LightSceneSelectViewActivity.this.f14893i;
                        i = R$string.common_text_no_customization;
                    }
                    LightSceneSelectViewActivity.this.f14892h.setVisibility(4);
                    return;
                } else if (i2 == 2) {
                    LightSceneSelectViewActivity.this.f14889e.setVisibility(4);
                    LightSceneSelectViewActivity.this.f14890f.setVisibility(4);
                    LightSceneSelectViewActivity.this.f14891g.setVisibility(0);
                    LightSceneSelectViewActivity.this.f14897m.notifyDataSetChanged();
                    if (LightSceneSelectViewActivity.this.f14895k.size() == 0) {
                        LightSceneSelectViewActivity.this.f14892h.setVisibility(0);
                        textView = LightSceneSelectViewActivity.this.f14893i;
                        i = R$string.common_text_no_favorite;
                    }
                    LightSceneSelectViewActivity.this.f14892h.setVisibility(4);
                    return;
                } else {
                    return;
                }
                textView.setText(i);
                return;
            }
            LightSceneSelectViewActivity.this.f14889e.setVisibility(0);
            LightSceneSelectViewActivity.this.f14890f.setVisibility(4);
            LightSceneSelectViewActivity.this.f14891g.setVisibility(4);
            LightSceneSelectViewActivity.this.f14892h.setVisibility(4);
            LightSceneSelectViewActivity.this.f14898n.notifyDataSetChanged();
        }

        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$i */
    class C8523i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TabLayout f14917a;

        /* renamed from: b */
        final /* synthetic */ int f14918b;

        C8523i(LightSceneSelectViewActivity lightSceneSelectViewActivity, TabLayout tabLayout, int i) {
            this.f14917a = tabLayout;
            this.f14918b = i;
        }

        public void run() {
            try {
                LinearLayout linearLayout = (LinearLayout) this.f14917a.getChildAt(0);
                int b = C9193k.m22151b(this.f14917a.getContext(), (float) this.f14918b);
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
                    if (this.f14918b == 0) {
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
    class C8524j extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public ImageView f14919a;

        /* renamed from: b */
        public TextView f14920b;

        /* renamed from: c */
        public TextView f14921c;

        /* renamed from: d */
        public TextView f14922d;

        /* renamed from: e */
        public LinearLayout f14923e;

        /* renamed from: f */
        public CheckBox f14924f;

        public C8524j(LightSceneSelectViewActivity lightSceneSelectViewActivity, View view) {
            super(view);
            this.f14919a = (ImageView) view.findViewById(R$id.personality_light_type_view);
            this.f14920b = (TextView) view.findViewById(R$id.personality_light_name);
            this.f14921c = (TextView) view.findViewById(R$id.personality_light_frame_count);
            this.f14922d = (TextView) view.findViewById(R$id.personality_light_duration);
            this.f14923e = (LinearLayout) view.findViewById(R$id.personality_light_item_layout);
            this.f14924f = (CheckBox) view.findViewById(R$id.checkbox);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$k */
    private class C8525k extends BaseAdapter {

        /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$k$a */
        class C8526a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f14926a;

            /* renamed from: b */
            final /* synthetic */ C8530n f14927b;

            C8526a(int i, C8530n nVar) {
                this.f14926a = i;
                this.f14927b = nVar;
            }

            public void onClick(View view) {
                int unused = LightSceneSelectViewActivity.this.f14903s = 0;
                int unused2 = LightSceneSelectViewActivity.this.f14904t = this.f14926a;
                LightSceneSelectViewActivity.this.m20242t0();
                this.f14927b.f14937b = true;
                C8525k.this.notifyDataSetChanged();
            }
        }

        private C8525k() {
        }

        /* synthetic */ C8525k(LightSceneSelectViewActivity lightSceneSelectViewActivity, C8515a aVar) {
            this();
        }

        /* renamed from: a */
        private C8530n m20262a(int i) {
            if (LightSceneSelectViewActivity.this.f14894j == null || LightSceneSelectViewActivity.this.f14894j.size() <= i || i < 0) {
                return null;
            }
            return (C8530n) LightSceneSelectViewActivity.this.f14894j.get(i);
        }

        public int getCount() {
            return LightSceneSelectViewActivity.this.f14894j.size();
        }

        public Object getItem(int i) {
            return LightSceneSelectViewActivity.this.f14894j.get(i);
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C8527l lVar;
            int i2;
            Resources resources;
            if (view == null) {
                lVar = new C8527l(LightSceneSelectViewActivity.this, (C8515a) null);
                view2 = LayoutInflater.from(LightSceneSelectViewActivity.this).inflate(R$layout.recommend_scene_checked_layout, (ViewGroup) null);
                view2.setTag(lVar);
            } else {
                view2 = view;
                lVar = (C8527l) view.getTag();
            }
            lVar.f14931c = (ImageView) view2.findViewById(R$id.scene_img);
            lVar.f14932d = (TextView) view2.findViewById(R$id.scene_name);
            lVar.f14929a = (FrameLayout) view2.findViewById(R$id.scene_item_layout);
            lVar.f14930b = (CheckBox) view2.findViewById(R$id.checkbox);
            C8530n a = m20262a(i);
            if (a != null) {
                C8321m a2 = a.mo35843a();
                if (a2 != null) {
                    lVar.f14932d.setText(a2.mo35450q());
                    lVar.f14931c.setBackgroundResource(C9195n.m22164a(4, a2.mo35452s()));
                }
                FrameLayout frameLayout = lVar.f14929a;
                if (a.mo35844b()) {
                    resources = LightSceneSelectViewActivity.this.getResources();
                    i2 = R$color.common_text_click_bg;
                } else {
                    resources = LightSceneSelectViewActivity.this.getResources();
                    i2 = R$color.white;
                }
                frameLayout.setBackgroundColor(resources.getColor(i2));
                lVar.f14930b.setChecked(a.mo35844b());
                view2.setOnClickListener(new C8526a(i, a));
            }
            return view2;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$l */
    private class C8527l {

        /* renamed from: a */
        public FrameLayout f14929a;

        /* renamed from: b */
        public CheckBox f14930b;

        /* renamed from: c */
        public ImageView f14931c;

        /* renamed from: d */
        public TextView f14932d;

        private C8527l(LightSceneSelectViewActivity lightSceneSelectViewActivity) {
        }

        /* synthetic */ C8527l(LightSceneSelectViewActivity lightSceneSelectViewActivity, C8515a aVar) {
            this(lightSceneSelectViewActivity);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$m */
    private class C8528m extends RecyclerView.Adapter<C8524j> {

        /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$m$a */
        class C8529a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C8524j f14934a;

            C8529a(C8524j jVar) {
                this.f14934a = jVar;
            }

            public void onClick(View view) {
                int unused = LightSceneSelectViewActivity.this.f14903s = 1;
                int unused2 = LightSceneSelectViewActivity.this.f14904t = this.f14934a.getAdapterPosition();
                LightSceneSelectViewActivity.this.m20242t0();
                LightSceneSelectViewActivity.this.f14896l.get(this.f14934a.getAdapterPosition()).f14939b = true;
                C8528m.this.notifyDataSetChanged();
            }
        }

        private C8528m() {
        }

        /* synthetic */ C8528m(LightSceneSelectViewActivity lightSceneSelectViewActivity, C8515a aVar) {
            this();
        }

        /* renamed from: a */
        private String m20263a(C8309b bVar) {
            int i = 0;
            for (C8319k c : bVar.mo35436c().mo35338h()) {
                i += c.mo35375c();
            }
            int i2 = i / 86400000;
            return String.format(Locale.US, "%02d:%02d:%02d.%d", new Object[]{Integer.valueOf((i % 86400000) / 3600000), Integer.valueOf((i % 3600000) / 60000), Integer.valueOf((i % 60000) / 1000), Integer.valueOf((i % 1000) / 100)});
        }

        /* renamed from: d */
        private void m20264d(boolean z, C8524j jVar) {
            if (z) {
                jVar.f14923e.setEnabled(true);
                jVar.f14920b.setTextColor(LightSceneSelectViewActivity.this.getResources().getColor(R$color.common_text_color_primary_33));
                TextView textView = jVar.f14921c;
                Resources resources = LightSceneSelectViewActivity.this.getResources();
                int i = R$color.common_text_color_description_99;
                textView.setTextColor(resources.getColor(i));
                jVar.f14922d.setTextColor(LightSceneSelectViewActivity.this.getResources().getColor(i));
                jVar.f14924f.setVisibility(0);
                return;
            }
            jVar.f14923e.setEnabled(false);
            TextView textView2 = jVar.f14920b;
            Resources resources2 = LightSceneSelectViewActivity.this.getResources();
            int i2 = R$color.common_text_color_not_clickable_cc;
            textView2.setTextColor(resources2.getColor(i2));
            jVar.f14921c.setTextColor(LightSceneSelectViewActivity.this.getResources().getColor(i2));
            jVar.f14922d.setTextColor(LightSceneSelectViewActivity.this.getResources().getColor(i2));
            jVar.f14924f.setVisibility(8);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:242:0x04e6, code lost:
            if (r12.equals("yeelink.light.ceiling11") == false) goto L_0x00ad;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onBindViewHolder(com.yeelight.yeelib.p142ui.activity.LightSceneSelectViewActivity.C8524j r11, int r12) {
            /*
                r10 = this;
                com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity r0 = com.yeelight.yeelib.p142ui.activity.LightSceneSelectViewActivity.this
                java.util.List<com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$o> r0 = r0.f14896l
                java.lang.Object r0 = r0.get(r12)
                com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$o r0 = (com.yeelight.yeelib.p142ui.activity.LightSceneSelectViewActivity.C8531o) r0
                com.yeelight.yeelib.models.CustomAdvancedFlowScene r0 = r0.mo35845a()
                int r1 = r0.mo35296d0()
                r2 = 0
                if (r1 <= 0) goto L_0x001a
                int r1 = r0.mo35296d0()
                goto L_0x001b
            L_0x001a:
                r1 = 0
            L_0x001b:
                android.widget.ImageView r3 = r11.f14919a
                java.util.List<java.lang.Integer> r4 = p051j4.C9195n.f17011a
                java.lang.Object r1 = r4.get(r1)
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                r3.setImageResource(r1)
                android.widget.TextView r1 = r11.f14920b
                java.lang.String r3 = r0.mo35453t()
                r1.setText(r3)
                java.util.Locale r1 = java.util.Locale.US
                r3 = 2
                java.lang.Object[] r4 = new java.lang.Object[r3]
                com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity r5 = com.yeelight.yeelib.p142ui.activity.LightSceneSelectViewActivity.this
                int r6 = com.yeelight.yeelib.R$string.personality_light_frame_count
                java.lang.CharSequence r5 = r5.getText(r6)
                java.lang.String r5 = r5.toString()
                r4[r2] = r5
                com.yeelight.yeelib.models.a r5 = r0.mo35436c()
                java.util.List r5 = r5.mo35338h()
                int r5 = r5.size()
                java.lang.String r5 = java.lang.String.valueOf(r5)
                r6 = 1
                r4[r6] = r5
                java.lang.String r5 = "%s：%s"
                java.lang.String r4 = java.lang.String.format(r1, r5, r4)
                java.lang.Object[] r7 = new java.lang.Object[r3]
                com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity r8 = com.yeelight.yeelib.p142ui.activity.LightSceneSelectViewActivity.this
                int r9 = com.yeelight.yeelib.R$string.personality_light_add_duration
                java.lang.CharSequence r8 = r8.getText(r9)
                java.lang.String r8 = r8.toString()
                r7[r2] = r8
                java.lang.String r8 = r10.m20263a(r0)
                r7[r6] = r8
                java.lang.String r1 = java.lang.String.format(r1, r5, r7)
                android.widget.TextView r5 = r11.f14921c
                r5.setText(r4)
                android.widget.TextView r4 = r11.f14922d
                r4.setText(r1)
                android.widget.CheckBox r1 = r11.f14924f
                com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity r4 = com.yeelight.yeelib.p142ui.activity.LightSceneSelectViewActivity.this
                java.util.List<com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$o> r4 = r4.f14896l
                java.lang.Object r12 = r4.get(r12)
                com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$o r12 = (com.yeelight.yeelib.p142ui.activity.LightSceneSelectViewActivity.C8531o) r12
                boolean r12 = r12.mo35846b()
                r1.setChecked(r12)
                com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity r12 = com.yeelight.yeelib.p142ui.activity.LightSceneSelectViewActivity.this
                com.yeelight.yeelib.device.base.e r12 = r12.f14900p
                java.lang.String r12 = r12.mo23144i1()
                r12.hashCode()
                r1 = -1
                int r4 = r12.hashCode()
                switch(r4) {
                    case -1644531059: goto L_0x04f6;
                    case -1462015191: goto L_0x04ea;
                    case -1462015190: goto L_0x04e0;
                    case -1462015189: goto L_0x04d4;
                    case -1462015188: goto L_0x04c8;
                    case -1462015187: goto L_0x04bc;
                    case -1462015186: goto L_0x04b0;
                    case -1462015185: goto L_0x04a4;
                    case -1462015184: goto L_0x0497;
                    case -1462015183: goto L_0x0489;
                    case -1462015182: goto L_0x047b;
                    case -1462015160: goto L_0x046d;
                    case -1462015159: goto L_0x045f;
                    case -1462015158: goto L_0x0451;
                    case -1462015157: goto L_0x0443;
                    case -1462015156: goto L_0x0435;
                    case -1317475940: goto L_0x0427;
                    case -1317475939: goto L_0x0419;
                    case -1317475937: goto L_0x040b;
                    case -1317475915: goto L_0x03fd;
                    case -1317475914: goto L_0x03ef;
                    case -1317475913: goto L_0x03e1;
                    case -1317475912: goto L_0x03d3;
                    case -1317475910: goto L_0x03c5;
                    case -1308146495: goto L_0x03b7;
                    case -1308146494: goto L_0x03a9;
                    case -1308146493: goto L_0x039b;
                    case -1308146492: goto L_0x038d;
                    case -1308146491: goto L_0x037f;
                    case -1308146490: goto L_0x0371;
                    case -1308146488: goto L_0x0363;
                    case -1308146447: goto L_0x0355;
                    case -1308146446: goto L_0x0347;
                    case -1308146445: goto L_0x0339;
                    case -1308146443: goto L_0x032b;
                    case -1063384694: goto L_0x031d;
                    case -1063384689: goto L_0x030f;
                    case -1063384687: goto L_0x0301;
                    case -1063384685: goto L_0x02f3;
                    case -948847040: goto L_0x02e5;
                    case -948847038: goto L_0x02d7;
                    case -888668266: goto L_0x02c9;
                    case -888668265: goto L_0x02bb;
                    case -888668264: goto L_0x02ad;
                    case -845289556: goto L_0x029f;
                    case -845289555: goto L_0x0291;
                    case -845289553: goto L_0x0283;
                    case -845289551: goto L_0x0275;
                    case -845289549: goto L_0x0267;
                    case -845289508: goto L_0x0259;
                    case -458141175: goto L_0x024b;
                    case -458141174: goto L_0x023d;
                    case -458141173: goto L_0x022f;
                    case -458141172: goto L_0x0221;
                    case -458141171: goto L_0x0213;
                    case -449944730: goto L_0x0205;
                    case -449944729: goto L_0x01f7;
                    case -449944728: goto L_0x01e9;
                    case -449944727: goto L_0x01db;
                    case -449944724: goto L_0x01cd;
                    case -449944723: goto L_0x01bf;
                    case -449944722: goto L_0x01b1;
                    case -448603205: goto L_0x01a3;
                    case -448603202: goto L_0x0195;
                    case -448603201: goto L_0x0187;
                    case -448603157: goto L_0x0179;
                    case -448603156: goto L_0x016b;
                    case 922669543: goto L_0x015d;
                    case 922669544: goto L_0x014f;
                    case 922669545: goto L_0x0141;
                    case 922669546: goto L_0x0133;
                    case 922669547: goto L_0x0125;
                    case 922669548: goto L_0x0118;
                    case 922669549: goto L_0x010b;
                    case 922669550: goto L_0x00fe;
                    case 1201756974: goto L_0x00f1;
                    case 1201757021: goto L_0x00e4;
                    case 1201757023: goto L_0x00d7;
                    case 1623724661: goto L_0x00ca;
                    case 1623724662: goto L_0x00bd;
                    case 1623724663: goto L_0x00b0;
                    default: goto L_0x00ad;
                }
            L_0x00ad:
                r3 = -1
                goto L_0x0501
            L_0x00b0:
                java.lang.String r3 = "yeelink.light.bslamp3"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x00b9
                goto L_0x00ad
            L_0x00b9:
                r3 = 80
                goto L_0x0501
            L_0x00bd:
                java.lang.String r3 = "yeelink.light.bslamp2"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x00c6
                goto L_0x00ad
            L_0x00c6:
                r3 = 79
                goto L_0x0501
            L_0x00ca:
                java.lang.String r3 = "yeelink.light.bslamp1"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x00d3
                goto L_0x00ad
            L_0x00d3:
                r3 = 78
                goto L_0x0501
            L_0x00d7:
                java.lang.String r3 = "yeelink.light.ctc"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x00e0
                goto L_0x00ad
            L_0x00e0:
                r3 = 77
                goto L_0x0501
            L_0x00e4:
                java.lang.String r3 = "yeelink.light.cta"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x00ed
                goto L_0x00ad
            L_0x00ed:
                r3 = 76
                goto L_0x0501
            L_0x00f1:
                java.lang.String r3 = "yeelink.light.ct2"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x00fa
                goto L_0x00ad
            L_0x00fa:
                r3 = 75
                goto L_0x0501
            L_0x00fe:
                java.lang.String r3 = "yeelink.light.ceiling8"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x0107
                goto L_0x00ad
            L_0x0107:
                r3 = 74
                goto L_0x0501
            L_0x010b:
                java.lang.String r3 = "yeelink.light.ceiling7"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x0114
                goto L_0x00ad
            L_0x0114:
                r3 = 73
                goto L_0x0501
            L_0x0118:
                java.lang.String r3 = "yeelink.light.ceiling6"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x0121
                goto L_0x00ad
            L_0x0121:
                r3 = 72
                goto L_0x0501
            L_0x0125:
                java.lang.String r3 = "yeelink.light.ceiling5"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x012f
                goto L_0x00ad
            L_0x012f:
                r3 = 71
                goto L_0x0501
            L_0x0133:
                java.lang.String r3 = "yeelink.light.ceiling4"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x013d
                goto L_0x00ad
            L_0x013d:
                r3 = 70
                goto L_0x0501
            L_0x0141:
                java.lang.String r3 = "yeelink.light.ceiling3"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x014b
                goto L_0x00ad
            L_0x014b:
                r3 = 69
                goto L_0x0501
            L_0x014f:
                java.lang.String r3 = "yeelink.light.ceiling2"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x0159
                goto L_0x00ad
            L_0x0159:
                r3 = 68
                goto L_0x0501
            L_0x015d:
                java.lang.String r3 = "yeelink.light.ceiling1"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x0167
                goto L_0x00ad
            L_0x0167:
                r3 = 67
                goto L_0x0501
            L_0x016b:
                java.lang.String r3 = "yeelink.light.monob"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x0175
                goto L_0x00ad
            L_0x0175:
                r3 = 66
                goto L_0x0501
            L_0x0179:
                java.lang.String r3 = "yeelink.light.monoa"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x0183
                goto L_0x00ad
            L_0x0183:
                r3 = 65
                goto L_0x0501
            L_0x0187:
                java.lang.String r3 = "yeelink.light.mono5"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x0191
                goto L_0x00ad
            L_0x0191:
                r3 = 64
                goto L_0x0501
            L_0x0195:
                java.lang.String r3 = "yeelink.light.mono4"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x019f
                goto L_0x00ad
            L_0x019f:
                r3 = 63
                goto L_0x0501
            L_0x01a3:
                java.lang.String r3 = "yeelink.light.mono1"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x01ad
                goto L_0x00ad
            L_0x01ad:
                r3 = 62
                goto L_0x0501
            L_0x01b1:
                java.lang.String r3 = "yeelink.light.lamp9"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x01bb
                goto L_0x00ad
            L_0x01bb:
                r3 = 61
                goto L_0x0501
            L_0x01bf:
                java.lang.String r3 = "yeelink.light.lamp8"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x01c9
                goto L_0x00ad
            L_0x01c9:
                r3 = 60
                goto L_0x0501
            L_0x01cd:
                java.lang.String r3 = "yeelink.light.lamp7"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x01d7
                goto L_0x00ad
            L_0x01d7:
                r3 = 59
                goto L_0x0501
            L_0x01db:
                java.lang.String r3 = "yeelink.light.lamp4"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x01e5
                goto L_0x00ad
            L_0x01e5:
                r3 = 58
                goto L_0x0501
            L_0x01e9:
                java.lang.String r3 = "yeelink.light.lamp3"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x01f3
                goto L_0x00ad
            L_0x01f3:
                r3 = 57
                goto L_0x0501
            L_0x01f7:
                java.lang.String r3 = "yeelink.light.lamp2"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x0201
                goto L_0x00ad
            L_0x0201:
                r3 = 56
                goto L_0x0501
            L_0x0205:
                java.lang.String r3 = "yeelink.light.lamp1"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x020f
                goto L_0x00ad
            L_0x020f:
                r3 = 55
                goto L_0x0501
            L_0x0213:
                java.lang.String r3 = "yeelink.light.ceile"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x021d
                goto L_0x00ad
            L_0x021d:
                r3 = 54
                goto L_0x0501
            L_0x0221:
                java.lang.String r3 = "yeelink.light.ceild"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x022b
                goto L_0x00ad
            L_0x022b:
                r3 = 53
                goto L_0x0501
            L_0x022f:
                java.lang.String r3 = "yeelink.light.ceilc"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x0239
                goto L_0x00ad
            L_0x0239:
                r3 = 52
                goto L_0x0501
            L_0x023d:
                java.lang.String r3 = "yeelink.light.ceilb"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x0247
                goto L_0x00ad
            L_0x0247:
                r3 = 51
                goto L_0x0501
            L_0x024b:
                java.lang.String r3 = "yeelink.light.ceila"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x0255
                goto L_0x00ad
            L_0x0255:
                r3 = 50
                goto L_0x0501
            L_0x0259:
                java.lang.String r3 = "yeelink.light.stripa"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x0263
                goto L_0x00ad
            L_0x0263:
                r3 = 49
                goto L_0x0501
            L_0x0267:
                java.lang.String r3 = "yeelink.light.strip8"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x0271
                goto L_0x00ad
            L_0x0271:
                r3 = 48
                goto L_0x0501
            L_0x0275:
                java.lang.String r3 = "yeelink.light.strip6"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x027f
                goto L_0x00ad
            L_0x027f:
                r3 = 47
                goto L_0x0501
            L_0x0283:
                java.lang.String r3 = "yeelink.light.strip4"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x028d
                goto L_0x00ad
            L_0x028d:
                r3 = 46
                goto L_0x0501
            L_0x0291:
                java.lang.String r3 = "yeelink.light.strip2"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x029b
                goto L_0x00ad
            L_0x029b:
                r3 = 45
                goto L_0x0501
            L_0x029f:
                java.lang.String r3 = "yeelink.light.strip1"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x02a9
                goto L_0x00ad
            L_0x02a9:
                r3 = 44
                goto L_0x0501
            L_0x02ad:
                java.lang.String r3 = "yilai.light.ceiling3"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x02b7
                goto L_0x00ad
            L_0x02b7:
                r3 = 43
                goto L_0x0501
            L_0x02bb:
                java.lang.String r3 = "yilai.light.ceiling2"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x02c5
                goto L_0x00ad
            L_0x02c5:
                r3 = 42
                goto L_0x0501
            L_0x02c9:
                java.lang.String r3 = "yilai.light.ceiling1"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x02d3
                goto L_0x00ad
            L_0x02d3:
                r3 = 41
                goto L_0x0501
            L_0x02d7:
                java.lang.String r3 = "yeelink.light.panel3"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x02e1
                goto L_0x00ad
            L_0x02e1:
                r3 = 40
                goto L_0x0501
            L_0x02e5:
                java.lang.String r3 = "yeelink.light.panel1"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x02ef
                goto L_0x00ad
            L_0x02ef:
                r3 = 39
                goto L_0x0501
            L_0x02f3:
                java.lang.String r3 = "yeelink.light.lamp19"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x02fd
                goto L_0x00ad
            L_0x02fd:
                r3 = 38
                goto L_0x0501
            L_0x0301:
                java.lang.String r3 = "yeelink.light.lamp17"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x030b
                goto L_0x00ad
            L_0x030b:
                r3 = 37
                goto L_0x0501
            L_0x030f:
                java.lang.String r3 = "yeelink.light.lamp15"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x0319
                goto L_0x00ad
            L_0x0319:
                r3 = 36
                goto L_0x0501
            L_0x031d:
                java.lang.String r3 = "yeelink.light.lamp10"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x0327
                goto L_0x00ad
            L_0x0327:
                r3 = 35
                goto L_0x0501
            L_0x032b:
                java.lang.String r3 = "yeelink.light.colore"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x0335
                goto L_0x00ad
            L_0x0335:
                r3 = 34
                goto L_0x0501
            L_0x0339:
                java.lang.String r3 = "yeelink.light.colorc"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x0343
                goto L_0x00ad
            L_0x0343:
                r3 = 33
                goto L_0x0501
            L_0x0347:
                java.lang.String r3 = "yeelink.light.colorb"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x0351
                goto L_0x00ad
            L_0x0351:
                r3 = 32
                goto L_0x0501
            L_0x0355:
                java.lang.String r3 = "yeelink.light.colora"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x035f
                goto L_0x00ad
            L_0x035f:
                r3 = 31
                goto L_0x0501
            L_0x0363:
                java.lang.String r3 = "yeelink.light.color8"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x036d
                goto L_0x00ad
            L_0x036d:
                r3 = 30
                goto L_0x0501
            L_0x0371:
                java.lang.String r3 = "yeelink.light.color6"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x037b
                goto L_0x00ad
            L_0x037b:
                r3 = 29
                goto L_0x0501
            L_0x037f:
                java.lang.String r3 = "yeelink.light.color5"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x0389
                goto L_0x00ad
            L_0x0389:
                r3 = 28
                goto L_0x0501
            L_0x038d:
                java.lang.String r3 = "yeelink.light.color4"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x0397
                goto L_0x00ad
            L_0x0397:
                r3 = 27
                goto L_0x0501
            L_0x039b:
                java.lang.String r3 = "yeelink.light.color3"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x03a5
                goto L_0x00ad
            L_0x03a5:
                r3 = 26
                goto L_0x0501
            L_0x03a9:
                java.lang.String r3 = "yeelink.light.color2"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x03b3
                goto L_0x00ad
            L_0x03b3:
                r3 = 25
                goto L_0x0501
            L_0x03b7:
                java.lang.String r3 = "yeelink.light.color1"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x03c1
                goto L_0x00ad
            L_0x03c1:
                r3 = 24
                goto L_0x0501
            L_0x03c5:
                java.lang.String r3 = "yeelink.light.ceil35"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x03cf
                goto L_0x00ad
            L_0x03cf:
                r3 = 23
                goto L_0x0501
            L_0x03d3:
                java.lang.String r3 = "yeelink.light.ceil33"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x03dd
                goto L_0x00ad
            L_0x03dd:
                r3 = 22
                goto L_0x0501
            L_0x03e1:
                java.lang.String r3 = "yeelink.light.ceil32"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x03eb
                goto L_0x00ad
            L_0x03eb:
                r3 = 21
                goto L_0x0501
            L_0x03ef:
                java.lang.String r3 = "yeelink.light.ceil31"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x03f9
                goto L_0x00ad
            L_0x03f9:
                r3 = 20
                goto L_0x0501
            L_0x03fd:
                java.lang.String r3 = "yeelink.light.ceil30"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x0407
                goto L_0x00ad
            L_0x0407:
                r3 = 19
                goto L_0x0501
            L_0x040b:
                java.lang.String r3 = "yeelink.light.ceil29"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x0415
                goto L_0x00ad
            L_0x0415:
                r3 = 18
                goto L_0x0501
            L_0x0419:
                java.lang.String r3 = "yeelink.light.ceil27"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x0423
                goto L_0x00ad
            L_0x0423:
                r3 = 17
                goto L_0x0501
            L_0x0427:
                java.lang.String r3 = "yeelink.light.ceil26"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x0431
                goto L_0x00ad
            L_0x0431:
                r3 = 16
                goto L_0x0501
            L_0x0435:
                java.lang.String r3 = "yeelink.light.ceiling24"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x043f
                goto L_0x00ad
            L_0x043f:
                r3 = 15
                goto L_0x0501
            L_0x0443:
                java.lang.String r3 = "yeelink.light.ceiling23"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x044d
                goto L_0x00ad
            L_0x044d:
                r3 = 14
                goto L_0x0501
            L_0x0451:
                java.lang.String r3 = "yeelink.light.ceiling22"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x045b
                goto L_0x00ad
            L_0x045b:
                r3 = 13
                goto L_0x0501
            L_0x045f:
                java.lang.String r3 = "yeelink.light.ceiling21"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x0469
                goto L_0x00ad
            L_0x0469:
                r3 = 12
                goto L_0x0501
            L_0x046d:
                java.lang.String r3 = "yeelink.light.ceiling20"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x0477
                goto L_0x00ad
            L_0x0477:
                r3 = 11
                goto L_0x0501
            L_0x047b:
                java.lang.String r3 = "yeelink.light.ceiling19"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x0485
                goto L_0x00ad
            L_0x0485:
                r3 = 10
                goto L_0x0501
            L_0x0489:
                java.lang.String r3 = "yeelink.light.ceiling18"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x0493
                goto L_0x00ad
            L_0x0493:
                r3 = 9
                goto L_0x0501
            L_0x0497:
                java.lang.String r3 = "yeelink.light.ceiling17"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x04a1
                goto L_0x00ad
            L_0x04a1:
                r3 = 8
                goto L_0x0501
            L_0x04a4:
                java.lang.String r3 = "yeelink.light.ceiling16"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x04ae
                goto L_0x00ad
            L_0x04ae:
                r3 = 7
                goto L_0x0501
            L_0x04b0:
                java.lang.String r3 = "yeelink.light.ceiling15"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x04ba
                goto L_0x00ad
            L_0x04ba:
                r3 = 6
                goto L_0x0501
            L_0x04bc:
                java.lang.String r3 = "yeelink.light.ceiling14"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x04c6
                goto L_0x00ad
            L_0x04c6:
                r3 = 5
                goto L_0x0501
            L_0x04c8:
                java.lang.String r3 = "yeelink.light.ceiling13"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x04d2
                goto L_0x00ad
            L_0x04d2:
                r3 = 4
                goto L_0x0501
            L_0x04d4:
                java.lang.String r3 = "yeelink.light.ceiling12"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x04de
                goto L_0x00ad
            L_0x04de:
                r3 = 3
                goto L_0x0501
            L_0x04e0:
                java.lang.String r4 = "yeelink.light.ceiling11"
                boolean r12 = r12.equals(r4)
                if (r12 != 0) goto L_0x0501
                goto L_0x00ad
            L_0x04ea:
                java.lang.String r3 = "yeelink.light.ceiling10"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x04f4
                goto L_0x00ad
            L_0x04f4:
                r3 = 1
                goto L_0x0501
            L_0x04f6:
                java.lang.String r3 = "yeelink.bhf_light.v1"
                boolean r12 = r12.equals(r3)
                if (r12 != 0) goto L_0x0500
                goto L_0x00ad
            L_0x0500:
                r3 = 0
            L_0x0501:
                switch(r3) {
                    case 0: goto L_0x0538;
                    case 1: goto L_0x0538;
                    case 2: goto L_0x0538;
                    case 3: goto L_0x0538;
                    case 4: goto L_0x0538;
                    case 5: goto L_0x0538;
                    case 6: goto L_0x0538;
                    case 7: goto L_0x0538;
                    case 8: goto L_0x0538;
                    case 9: goto L_0x0538;
                    case 10: goto L_0x0538;
                    case 11: goto L_0x0538;
                    case 12: goto L_0x0538;
                    case 13: goto L_0x0538;
                    case 14: goto L_0x0538;
                    case 15: goto L_0x0538;
                    case 16: goto L_0x0538;
                    case 17: goto L_0x0538;
                    case 18: goto L_0x0538;
                    case 19: goto L_0x0538;
                    case 20: goto L_0x0538;
                    case 21: goto L_0x0538;
                    case 22: goto L_0x0538;
                    case 23: goto L_0x0538;
                    case 24: goto L_0x0534;
                    case 25: goto L_0x0534;
                    case 26: goto L_0x0534;
                    case 27: goto L_0x0534;
                    case 28: goto L_0x0534;
                    case 29: goto L_0x0534;
                    case 30: goto L_0x0534;
                    case 31: goto L_0x0534;
                    case 32: goto L_0x0534;
                    case 33: goto L_0x0534;
                    case 34: goto L_0x0534;
                    case 35: goto L_0x0534;
                    case 36: goto L_0x0538;
                    case 37: goto L_0x0506;
                    case 38: goto L_0x0534;
                    case 39: goto L_0x0506;
                    case 40: goto L_0x0538;
                    case 41: goto L_0x0538;
                    case 42: goto L_0x0538;
                    case 43: goto L_0x0538;
                    case 44: goto L_0x0534;
                    case 45: goto L_0x0534;
                    case 46: goto L_0x0538;
                    case 47: goto L_0x0534;
                    case 48: goto L_0x0534;
                    case 49: goto L_0x0534;
                    case 50: goto L_0x0538;
                    case 51: goto L_0x0538;
                    case 52: goto L_0x0538;
                    case 53: goto L_0x0538;
                    case 54: goto L_0x0538;
                    case 55: goto L_0x0538;
                    case 56: goto L_0x0538;
                    case 57: goto L_0x0538;
                    case 58: goto L_0x0538;
                    case 59: goto L_0x0538;
                    case 60: goto L_0x0538;
                    case 61: goto L_0x0538;
                    case 62: goto L_0x0506;
                    case 63: goto L_0x0506;
                    case 64: goto L_0x0506;
                    case 65: goto L_0x0506;
                    case 66: goto L_0x0506;
                    case 67: goto L_0x0538;
                    case 68: goto L_0x0506;
                    case 69: goto L_0x0538;
                    case 70: goto L_0x0538;
                    case 71: goto L_0x0538;
                    case 72: goto L_0x0538;
                    case 73: goto L_0x0538;
                    case 74: goto L_0x0538;
                    case 75: goto L_0x0538;
                    case 76: goto L_0x0538;
                    case 77: goto L_0x0538;
                    case 78: goto L_0x0534;
                    case 79: goto L_0x0534;
                    case 80: goto L_0x0534;
                    default: goto L_0x0504;
                }
            L_0x0504:
                goto L_0x0572
            L_0x0506:
                r12 = 0
            L_0x0507:
                com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity r1 = com.yeelight.yeelib.p142ui.activity.LightSceneSelectViewActivity.this
                java.util.List<com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$o> r1 = r1.f14896l
                int r1 = r1.size()
                if (r12 >= r1) goto L_0x0572
                com.yeelight.yeelib.models.CustomAdvancedFlowScene$LightMode r1 = r0.mo35295c0()
                com.yeelight.yeelib.models.CustomAdvancedFlowScene$LightMode r3 = com.yeelight.yeelib.models.CustomAdvancedFlowScene.LightMode.MODE_BRIGHT_ONLY
                boolean r1 = r1.equals(r3)
                if (r1 != 0) goto L_0x052e
                com.yeelight.yeelib.models.CustomAdvancedFlowScene$LightMode r1 = r0.mo35295c0()
                com.yeelight.yeelib.models.CustomAdvancedFlowScene$LightMode r3 = com.yeelight.yeelib.models.CustomAdvancedFlowScene.LightMode.MODE_SUSPEND
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L_0x052a
                goto L_0x052e
            L_0x052a:
                r10.m20264d(r2, r11)
                goto L_0x0531
            L_0x052e:
                r10.m20264d(r6, r11)
            L_0x0531:
                int r12 = r12 + 1
                goto L_0x0507
            L_0x0534:
                r10.m20264d(r6, r11)
                goto L_0x0572
            L_0x0538:
                r12 = 0
            L_0x0539:
                com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity r1 = com.yeelight.yeelib.p142ui.activity.LightSceneSelectViewActivity.this
                java.util.List<com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$o> r1 = r1.f14896l
                int r1 = r1.size()
                if (r12 >= r1) goto L_0x0572
                com.yeelight.yeelib.models.CustomAdvancedFlowScene$LightMode r1 = r0.mo35295c0()
                com.yeelight.yeelib.models.CustomAdvancedFlowScene$LightMode r3 = com.yeelight.yeelib.models.CustomAdvancedFlowScene.LightMode.MODE_BRIGHT_ONLY
                boolean r1 = r1.equals(r3)
                if (r1 != 0) goto L_0x056c
                com.yeelight.yeelib.models.CustomAdvancedFlowScene$LightMode r1 = r0.mo35295c0()
                com.yeelight.yeelib.models.CustomAdvancedFlowScene$LightMode r3 = com.yeelight.yeelib.models.CustomAdvancedFlowScene.LightMode.MODE_SUSPEND
                boolean r1 = r1.equals(r3)
                if (r1 != 0) goto L_0x056c
                com.yeelight.yeelib.models.CustomAdvancedFlowScene$LightMode r1 = r0.mo35295c0()
                com.yeelight.yeelib.models.CustomAdvancedFlowScene$LightMode r3 = com.yeelight.yeelib.models.CustomAdvancedFlowScene.LightMode.MODE_CT
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L_0x0568
                goto L_0x056c
            L_0x0568:
                r10.m20264d(r2, r11)
                goto L_0x056f
            L_0x056c:
                r10.m20264d(r6, r11)
            L_0x056f:
                int r12 = r12 + 1
                goto L_0x0539
            L_0x0572:
                android.widget.LinearLayout r12 = r11.f14923e
                com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$m$a r0 = new com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$m$a
                r0.<init>(r11)
                r12.setOnClickListener(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p142ui.activity.LightSceneSelectViewActivity.C8528m.onBindViewHolder(com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$j, int):void");
        }

        /* renamed from: c */
        public C8524j onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C8524j(LightSceneSelectViewActivity.this, LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.list_item_personality_light_checked, viewGroup, false));
        }

        public int getItemCount() {
            return LightSceneSelectViewActivity.this.f14896l.size();
        }

        public long getItemId(int i) {
            return 0;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$n */
    class C8530n {

        /* renamed from: a */
        C8321m f14936a;

        /* renamed from: b */
        boolean f14937b;

        C8530n(LightSceneSelectViewActivity lightSceneSelectViewActivity, C8321m mVar, boolean z) {
            this.f14936a = mVar;
            this.f14937b = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C8321m mo35843a() {
            return this.f14936a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo35844b() {
            return this.f14937b;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$o */
    class C8531o {

        /* renamed from: a */
        CustomAdvancedFlowScene f14938a;

        /* renamed from: b */
        boolean f14939b;

        C8531o(LightSceneSelectViewActivity lightSceneSelectViewActivity, CustomAdvancedFlowScene customAdvancedFlowScene, boolean z) {
            this.f14938a = customAdvancedFlowScene;
            this.f14939b = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public CustomAdvancedFlowScene mo35845a() {
            return this.f14938a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo35846b() {
            return this.f14939b;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$p */
    class C8532p extends RecyclerView.Adapter<FavoriteSceneVH> {

        /* renamed from: a */
        private final String f14940a;

        /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$p$a */
        class C8533a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f14942a;

            C8533a(int i) {
                this.f14942a = i;
            }

            public void onClick(View view) {
                int unused = LightSceneSelectViewActivity.this.f14903s = 2;
                int unused2 = LightSceneSelectViewActivity.this.f14904t = this.f14942a;
                LightSceneSelectViewActivity.this.m20242t0();
                ((C8530n) LightSceneSelectViewActivity.this.f14895k.get(this.f14942a)).f14937b = true;
                C8532p.this.notifyDataSetChanged();
            }
        }

        public C8532p(String str) {
            this.f14940a = str;
        }

        /* renamed from: a */
        public void onBindViewHolder(FavoriteSceneVH favoriteSceneVH, int i) {
            TextView textView;
            String string;
            StringBuilder sb;
            int h;
            C8321m a = ((C8530n) LightSceneSelectViewActivity.this.f14895k.get(i)).mo35843a();
            favoriteSceneVH.f14906b.setText(a.mo35450q());
            if (a.mo35458y()) {
                textView = favoriteSceneVH.f14907c;
                sb = new StringBuilder();
                sb.append(favoriteSceneVH.f14907c.getContext().getResources().getString(R$string.common_text_bright));
                sb.append("：");
                h = a.mo35439f();
            } else if (a.mo35417B()) {
                textView = favoriteSceneVH.f14907c;
                sb = new StringBuilder();
                sb.append(favoriteSceneVH.f14907c.getContext().getResources().getString(R$string.common_text_color));
                sb.append("：");
                sb.append(Color.red(a.mo35440g()));
                sb.append(", ");
                sb.append(Color.green(a.mo35440g()));
                sb.append(", ");
                h = Color.blue(a.mo35440g());
            } else if (a.mo35419D()) {
                textView = favoriteSceneVH.f14907c;
                sb = new StringBuilder();
                sb.append(favoriteSceneVH.f14907c.getContext().getResources().getString(R$string.personality_light_add_ct));
                sb.append("：");
                h = a.mo35441h();
            } else {
                if (a.mo35420E()) {
                    favoriteSceneVH.f14907c.setText(favoriteSceneVH.f14907c.getContext().getResources().getString(R$string.common_text_flow));
                } else if (a.mo35421F()) {
                    textView = favoriteSceneVH.f14907c;
                    string = textView.getContext().getResources().getString(R$string.common_text_night_light);
                    textView.setText(string);
                }
                favoriteSceneVH.f14905a.setColors(a.mo35438e(this.f14940a));
                favoriteSceneVH.f14908d.setChecked(((C8530n) LightSceneSelectViewActivity.this.f14895k.get(i)).mo35844b());
                favoriteSceneVH.f14909e.setOnClickListener(new C8533a(i));
            }
            sb.append(h);
            string = sb.toString();
            textView.setText(string);
            favoriteSceneVH.f14905a.setColors(a.mo35438e(this.f14940a));
            favoriteSceneVH.f14908d.setChecked(((C8530n) LightSceneSelectViewActivity.this.f14895k.get(i)).mo35844b());
            favoriteSceneVH.f14909e.setOnClickListener(new C8533a(i));
        }

        /* renamed from: b */
        public FavoriteSceneVH onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new FavoriteSceneVH(LightSceneSelectViewActivity.this, LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.item_scene_favorite_checked, viewGroup, false));
        }

        public int getItemCount() {
            return LightSceneSelectViewActivity.this.f14895k.size();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightSceneSelectViewActivity$q */
    public class C8534q {

        /* renamed from: a */
        int f14944a;

        /* renamed from: b */
        String f14945b;

        C8534q(LightSceneSelectViewActivity lightSceneSelectViewActivity, int i, String str) {
            this.f14944a = i;
            this.f14945b = str;
        }

        /* renamed from: a */
        public String mo35850a() {
            return this.f14945b;
        }
    }

    /* renamed from: V */
    private void m20219V(TabLayout tabLayout, int i, int i2) {
        tabLayout.setTabMode(i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C9193k.m22150a(this, 44.0f));
        int a = C9193k.m22150a(this, (float) i2);
        layoutParams.setMargins(a, 0, a, 0);
        tabLayout.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public C8327s m20234k0() {
        int i = this.f14903s;
        if (i == 0) {
            return this.f14894j.get(this.f14904t).mo35843a();
        }
        if (i == 1) {
            return this.f14896l.get(this.f14904t).mo35845a();
        }
        if (i != 2) {
            return null;
        }
        return this.f14895k.get(this.f14904t).mo35843a();
    }

    /* renamed from: l0 */
    private void m20235l0() {
        C3112v.m8242u().mo23568v(new C8521g());
    }

    /* renamed from: m0 */
    private void m20236m0() {
        C3112v.m8242u().mo23565q(this.f14900p.mo23144i1(), new C8520f());
    }

    /* renamed from: n0 */
    private void m20237n0() {
        this.f14898n = new C8525k(this, (C8515a) null);
        this.f14899o = new C8528m(this, (C8515a) null);
        this.f14897m = new C8532p(this.f14900p.mo23144i1());
        this.f14889e.setAdapter(this.f14898n);
        this.f14890f.setAdapter(this.f14899o);
        this.f14891g.setAdapter(this.f14897m);
        m20238o0();
        m20236m0();
        m20235l0();
    }

    /* renamed from: o0 */
    private void m20238o0() {
        String i1 = this.f14900p.mo23144i1();
        if (TextUtils.isEmpty(i1)) {
            AppUtils.m8300u(f14884u, "model can't be null!");
            return;
        }
        i1.hashCode();
        if (i1.equals("yeelink.light.ceiling10")) {
            i1 = "yeelink.light.ceiling10x";
        } else if (i1.equals("yeelink.light.ceiling4")) {
            i1 = "yeelink.light.ceiling4x";
        }
        C3112v.m8242u().mo23561l(i1, new C8519e());
    }

    /* renamed from: p0 */
    private void m20239p0(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new C8518d(this));
    }

    /* renamed from: q0 */
    private void m20240q0() {
        this.f14902r.add(new C8534q(this, 0, getResources().getString(R$string.scene_recommend)));
        if (C11972i.m30711i(this.f14900p.mo23144i1(), 256) || C11972i.m30711i(this.f14900p.mo23144i1(), 16) || C11972i.m30711i(this.f14900p.mo23144i1(), 32)) {
            this.f14902r.add(new C8534q(this, 1, getResources().getString(R$string.slide_item_personality)));
        }
        this.f14902r.add(new C8534q(this, 2, getResources().getString(R$string.scene_favorite)));
        m20219V(this.f14888d, 1, 25);
        mo35830s0(this.f14888d, 0);
        for (int i = 0; i < this.f14902r.size(); i++) {
            TabLayout.Tab newTab = this.f14888d.newTab();
            newTab.setText((CharSequence) this.f14902r.get(i).mo35850a());
            this.f14888d.addTab(newTab);
        }
        m20241r0();
    }

    /* renamed from: r0 */
    private void m20241r0() {
        this.f14888d.setOnTabSelectedListener(new C8522h());
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public void m20242t0() {
        for (C8530n nVar : this.f14895k) {
            nVar.f14937b = false;
        }
        for (C8531o oVar : this.f14896l) {
            oVar.f14939b = false;
        }
        for (C8530n nVar2 : this.f14894j) {
            nVar2.f14937b = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(R$layout.activity_light_scene_select_view);
        this.f14885a = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f14886b = (LinearLayout) findViewById(R$id.layout_left);
        this.f14887c = (LinearLayout) findViewById(R$id.layout_right);
        this.f14888d = (TabLayout) findViewById(R$id.tabLayout_view);
        this.f14889e = (GridView) findViewById(R$id.recommend_scene_grid_view);
        this.f14890f = (RecyclerView) findViewById(R$id.personality_light_list);
        this.f14891g = (RecyclerView) findViewById(R$id.favorite_list_view);
        this.f14892h = (LinearLayout) findViewById(R$id.no_update_layout);
        this.f14893i = (TextView) findViewById(R$id.no_data_tips);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f14884u, "Activity has not device id", false);
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("com.yeelight.cherry.device_id");
        this.f14901q = intent.getIntExtra("position", -1);
        C3012e r0 = YeelightDeviceManager.m7804r0(stringExtra);
        this.f14900p = r0;
        if (r0 == null) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        this.f14885a.mo36195a(r0.mo23210U(), new C8515a(), (View.OnClickListener) null);
        this.f14885a.setTitleTextSize(16);
        this.f14886b.setOnClickListener(new C8516b());
        this.f14887c.setOnClickListener(new C8517c());
        m20239p0(this.f14891g);
        m20239p0(this.f14890f);
        m20240q0();
        m20237n0();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f14885a.setTitle(this.f14900p.mo23210U());
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (!YeelightDeviceManager.m7780X(this.f14900p.mo23185G())) {
            finish();
        }
    }

    /* renamed from: s0 */
    public void mo35830s0(TabLayout tabLayout, int i) {
        tabLayout.post(new C8523i(this, tabLayout, i));
    }
}
