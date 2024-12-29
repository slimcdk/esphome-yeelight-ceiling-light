package com.yeelight.yeelib.p194ui.activity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.yeelib.ui.activity.LanControlListActivity */
public class LanControlListActivity extends BaseActivity implements C9770e, View.OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<C6006h> f18476b;

    /* renamed from: c */
    private C10072c f18477c;

    /* renamed from: d */
    private Handler f18478d;

    /* renamed from: e */
    private boolean f18479e;

    /* renamed from: com.yeelight.yeelib.ui.activity.LanControlListActivity$b */
    private class C10071b extends RecyclerView.ItemDecoration {

        /* renamed from: a */
        private int f18480a;

        /* renamed from: b */
        private Paint f18481b;

        /* renamed from: c */
        private int f18482c;

        private C10071b(LanControlListActivity lanControlListActivity, Context context) {
            Paint paint = new Paint();
            this.f18481b = paint;
            paint.setColor(context.getResources().getColor(R$color.common_color_ee));
            this.f18480a = 1;
            this.f18482c = C10547m.m25751a(lanControlListActivity, 20.0f);
        }

        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
            super.getItemOffsets(rect, view, recyclerView, state);
            rect.bottom = this.f18480a;
        }

        public void onDraw(@NonNull Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            int i = 0;
            while (i < childCount) {
                View childAt = recyclerView.getChildAt(i);
                canvas.drawRect((float) (i == childCount + -1 ? 0 : this.f18482c), (float) childAt.getBottom(), (float) width, (float) (childAt.getBottom() + this.f18480a), this.f18481b);
                i++;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LanControlListActivity$c */
    private class C10072c extends RecyclerView.Adapter<C10073d> {
        private C10072c() {
        }

        /* renamed from: b */
        public void onBindViewHolder(@NonNull C10073d dVar, int i) {
            C6006h hVar = (C6006h) LanControlListActivity.this.f18476b.get(i);
            dVar.f18484a.setImageResource(hVar.mo23303F());
            dVar.f18485b.setText(hVar.mo23397U());
            String b0 = hVar.mo23406b0();
            TextView textView = dVar.f18486c;
            if (TextUtils.isEmpty(b0)) {
                b0 = LanControlListActivity.this.getResources().getString(R$string.create_scene_unallocated_room);
            }
            textView.setText(b0);
            dVar.f18487d.setImageResource(hVar.mo23408d0().mo27663S() ? R$drawable.icon_yeelight_lan_switch_on : R$drawable.icon_yeelight_lan_switch_off);
            dVar.f18487d.setOnClickListener(new C10313f0(hVar));
        }

        @NonNull
        /* renamed from: c */
        public C10073d onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            LanControlListActivity lanControlListActivity = LanControlListActivity.this;
            return new C10073d(LayoutInflater.from(lanControlListActivity).inflate(R$layout.item_lan_control, viewGroup, false));
        }

        public int getItemCount() {
            if (LanControlListActivity.this.f18476b == null) {
                return 0;
            }
            return LanControlListActivity.this.f18476b.size();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LanControlListActivity$d */
    private class C10073d extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ImageView f18484a;

        /* renamed from: b */
        TextView f18485b;

        /* renamed from: c */
        TextView f18486c;

        /* renamed from: d */
        ImageView f18487d;

        private C10073d(@NonNull LanControlListActivity lanControlListActivity, View view) {
            super(view);
            this.f18484a = (ImageView) view.findViewById(R$id.img_device);
            this.f18485b = (TextView) view.findViewById(R$id.tv_device_name);
            this.f18486c = (TextView) view.findViewById(R$id.tv_room);
            this.f18487d = (ImageView) view.findViewById(R$id.img_switch);
        }
    }

    /* renamed from: W */
    private void m24561W(List<C6006h> list) {
        if (list != null) {
            for (C6006h next : list) {
                if (next.mo23415n0(18)) {
                    this.f18476b.add(next);
                }
            }
        }
    }

    /* renamed from: X */
    public /* synthetic */ void mo32366X(View view) {
        onBackPressed();
    }

    /* renamed from: Y */
    public /* synthetic */ void mo32367Y() {
        C10072c cVar = this.f18477c;
        if (cVar != null) {
            cVar.notifyDataSetChanged();
        }
        this.f18479e = false;
    }

    public void onClick(View view) {
        int id = view.getId();
        List<C6006h> list = this.f18476b;
        if (list != null && !list.isEmpty()) {
            if (id == R$id.tv_all_open) {
                for (C6006h next : this.f18476b) {
                    if (!next.mo23408d0().mo27663S()) {
                        next.mo27567M1(true);
                    }
                }
            } else if (id == R$id.tv_all_close) {
                for (C6006h next2 : this.f18476b) {
                    if (next2.mo23408d0().mo27663S()) {
                        next2.mo27567M1(false);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f18478d = new Handler();
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_lan_control_list);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(R$id.title_bar);
        RecyclerView recyclerView = (RecyclerView) findViewById(R$id.rv_device);
        findViewById(R$id.tv_all_open).setOnClickListener(this);
        findViewById(R$id.tv_all_close).setOnClickListener(this);
        commonTitleBar.mo32825a(getText(R$string.feature_geek_mode).toString(), new C10315g0(this), (View.OnClickListener) null);
        commonTitleBar.setTitleTextSize(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        this.f18476b = new ArrayList();
        m24561W(C4257w.m11947l0().mo23645F0());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new C10071b(this));
        C10072c cVar = new C10072c();
        this.f18477c = cVar;
        recyclerView.setAdapter(cVar);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f18478d.removeCallbacksAndMessages((Object) null);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        List<C6006h> list = this.f18476b;
        if (list != null && !list.isEmpty()) {
            for (C6006h W0 : this.f18476b) {
                W0.mo23400W0(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        List<C6006h> list = this.f18476b;
        if (list != null && !list.isEmpty()) {
            for (C6006h B0 : this.f18476b) {
                B0.mo23365B0(this);
            }
        }
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == 4096 && !this.f18479e) {
            this.f18479e = true;
            this.f18478d.postDelayed(new C10311e0(this), 500);
        }
    }
}
