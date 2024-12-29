package com.yeelight.yeelib.p142ui.activity;

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
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import java.util.ArrayList;
import java.util.List;
import p051j4.C9193k;
import p150e4.C8989r;
import p150e4.C8990s;
import p237z3.C12145e;

/* renamed from: com.yeelight.yeelib.ui.activity.LanControlListActivity */
public class LanControlListActivity extends BaseActivity implements C12145e, View.OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public List<WifiDeviceBase> f14784a;

    /* renamed from: b */
    private C8490c f14785b;

    /* renamed from: c */
    private Handler f14786c;

    /* renamed from: d */
    private boolean f14787d;

    /* renamed from: com.yeelight.yeelib.ui.activity.LanControlListActivity$b */
    private class C8489b extends RecyclerView.ItemDecoration {

        /* renamed from: a */
        private int f14788a;

        /* renamed from: b */
        private Paint f14789b;

        /* renamed from: c */
        private int f14790c;

        private C8489b(LanControlListActivity lanControlListActivity, Context context) {
            Paint paint = new Paint();
            this.f14789b = paint;
            paint.setColor(context.getResources().getColor(R$color.common_color_ee));
            this.f14788a = 1;
            this.f14790c = C9193k.m22150a(lanControlListActivity, 20.0f);
        }

        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
            super.getItemOffsets(rect, view, recyclerView, state);
            rect.bottom = this.f14788a;
        }

        public void onDraw(@NonNull Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            int i = 0;
            while (i < childCount) {
                View childAt = recyclerView.getChildAt(i);
                canvas.drawRect((float) (i == childCount + -1 ? 0 : this.f14790c), (float) childAt.getBottom(), (float) width, (float) (childAt.getBottom() + this.f14788a), this.f14789b);
                i++;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LanControlListActivity$c */
    private class C8490c extends RecyclerView.Adapter<C8491d> {
        private C8490c() {
        }

        /* renamed from: c */
        public void onBindViewHolder(@NonNull C8491d dVar, int i) {
            WifiDeviceBase wifiDeviceBase = (WifiDeviceBase) LanControlListActivity.this.f14784a.get(i);
            dVar.f14792a.setImageResource(wifiDeviceBase.mo23116F());
            dVar.f14793b.setText(wifiDeviceBase.mo23210U());
            String b0 = wifiDeviceBase.mo23219b0();
            TextView textView = dVar.f14794c;
            if (TextUtils.isEmpty(b0)) {
                b0 = LanControlListActivity.this.getResources().getString(R$string.create_scene_unallocated_room);
            }
            textView.setText(b0);
            dVar.f14795d.setImageResource(wifiDeviceBase.mo23221d0().mo31564T() ? R$drawable.icon_yeelight_lan_switch_on : R$drawable.icon_yeelight_lan_switch_off);
            dVar.f14795d.setOnClickListener(new C8730o(wifiDeviceBase));
        }

        @NonNull
        /* renamed from: d */
        public C8491d onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            LanControlListActivity lanControlListActivity = LanControlListActivity.this;
            return new C8491d(LayoutInflater.from(lanControlListActivity).inflate(R$layout.item_lan_control, viewGroup, false));
        }

        public int getItemCount() {
            if (LanControlListActivity.this.f14784a == null) {
                return 0;
            }
            return LanControlListActivity.this.f14784a.size();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LanControlListActivity$d */
    private class C8491d extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ImageView f14792a;

        /* renamed from: b */
        TextView f14793b;

        /* renamed from: c */
        TextView f14794c;

        /* renamed from: d */
        ImageView f14795d;

        private C8491d(@NonNull LanControlListActivity lanControlListActivity, View view) {
            super(view);
            this.f14792a = (ImageView) view.findViewById(R$id.img_device);
            this.f14793b = (TextView) view.findViewById(R$id.tv_device_name);
            this.f14794c = (TextView) view.findViewById(R$id.tv_room);
            this.f14795d = (ImageView) view.findViewById(R$id.img_switch);
        }
    }

    /* renamed from: Y */
    private void m20160Y(List<WifiDeviceBase> list) {
        if (list != null) {
            for (WifiDeviceBase next : list) {
                if (next.mo23229n0(18)) {
                    this.f14784a.add(next);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public /* synthetic */ void m20161Z(View view) {
        onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public /* synthetic */ void m20162a0() {
        C8490c cVar = this.f14785b;
        if (cVar != null) {
            cVar.notifyDataSetChanged();
        }
        this.f14787d = false;
    }

    public void onClick(View view) {
        int id = view.getId();
        List<WifiDeviceBase> list = this.f14784a;
        if (list != null && !list.isEmpty()) {
            if (id == R$id.tv_all_open) {
                for (WifiDeviceBase next : this.f14784a) {
                    if (!next.mo23221d0().mo31564T()) {
                        next.mo31484M1(true);
                    }
                }
            } else if (id == R$id.tv_all_close) {
                for (WifiDeviceBase next2 : this.f14784a) {
                    if (next2.mo23221d0().mo31564T()) {
                        next2.mo31484M1(false);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f14786c = new Handler();
        C9193k.m22157h(true, this);
        setContentView(R$layout.activity_lan_control_list);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(R$id.title_bar);
        RecyclerView recyclerView = (RecyclerView) findViewById(R$id.rv_device);
        findViewById(R$id.tv_all_open).setOnClickListener(this);
        findViewById(R$id.tv_all_close).setOnClickListener(this);
        commonTitleBar.mo36195a(getText(R$string.feature_geek_mode).toString(), new C8989r(this), (View.OnClickListener) null);
        commonTitleBar.setTitleTextSize(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        this.f14784a = new ArrayList();
        m20160Y(YeelightDeviceManager.m7800o0().mo23266I0());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new C8489b(this));
        C8490c cVar = new C8490c();
        this.f14785b = cVar;
        recyclerView.setAdapter(cVar);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f14786c.removeCallbacksAndMessages((Object) null);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        List<WifiDeviceBase> list = this.f14784a;
        if (list != null && !list.isEmpty()) {
            for (WifiDeviceBase W0 : this.f14784a) {
                W0.mo23213W0(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        List<WifiDeviceBase> list = this.f14784a;
        if (list != null && !list.isEmpty()) {
            for (WifiDeviceBase B0 : this.f14784a) {
                B0.mo23178B0(this);
            }
        }
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == 4096 && !this.f14787d) {
            this.f14787d = true;
            this.f14786c.postDelayed(new C8990s(this), 500);
        }
    }
}
