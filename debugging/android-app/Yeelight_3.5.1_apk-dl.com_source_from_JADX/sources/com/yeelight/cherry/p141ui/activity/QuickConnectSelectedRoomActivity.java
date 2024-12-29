package com.yeelight.cherry.p141ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.device.C6169f;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.managers.C8293t;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.List;
import p051j4.C9193k;
import p145d4.C8937a;

/* renamed from: com.yeelight.cherry.ui.activity.QuickConnectSelectedRoomActivity */
public class QuickConnectSelectedRoomActivity extends BaseActivity {

    /* renamed from: f */
    private static String f11217f = "QuickConnectSelectedRoomActivity";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C3012e f11218a;

    /* renamed from: b */
    private RecyclerView f11219b;

    /* renamed from: c */
    private C5614b f11220c;

    /* renamed from: d */
    private Button f11221d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f11222e = -1;

    /* renamed from: com.yeelight.cherry.ui.activity.QuickConnectSelectedRoomActivity$a */
    class C5613a implements View.OnClickListener {
        C5613a() {
        }

        public void onClick(View view) {
            Intent intent;
            QuickConnectSelectedRoomActivity.this.m16932a0();
            if (QuickConnectSelectedRoomActivity.this.f11218a.mo23229n0(18)) {
                intent = new Intent(QuickConnectSelectedRoomActivity.this, QuickConnectLanControlActivity.class);
                intent.putExtra("com.yeelight.cherry.device_id", QuickConnectSelectedRoomActivity.this.f11218a.mo23185G());
            } else {
                intent = new Intent();
                intent.setClass(QuickConnectSelectedRoomActivity.this, MainActivity.class);
                intent.putExtra("com.yeelight.cherry.device_id", QuickConnectSelectedRoomActivity.this.f11218a.mo23185G());
                intent.addFlags(67108864);
            }
            QuickConnectSelectedRoomActivity.this.startActivity(intent);
            QuickConnectSelectedRoomActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.QuickConnectSelectedRoomActivity$b */
    class C5614b extends RecyclerView.Adapter<C5615a> {

        /* renamed from: a */
        private LayoutInflater f11224a;

        /* renamed from: b */
        private List<C8937a> f11225b;

        /* renamed from: com.yeelight.cherry.ui.activity.QuickConnectSelectedRoomActivity$b$a */
        class C5615a extends RecyclerView.ViewHolder implements View.OnClickListener {

            /* renamed from: a */
            CheckBox f11227a;

            /* renamed from: b */
            TextView f11228b;

            /* renamed from: c */
            ImageView f11229c;

            public C5615a(View view) {
                super(view);
                this.f11227a = (CheckBox) view.findViewById(C12225R$id.room_checkbox);
                this.f11228b = (TextView) view.findViewById(C12225R$id.name);
                this.f11229c = (ImageView) view.findViewById(C12225R$id.icon_room);
                view.setOnClickListener(this);
            }

            public void onClick(View view) {
                if (getAdapterPosition() == QuickConnectSelectedRoomActivity.this.f11222e) {
                    this.f11227a.setChecked(false);
                    int unused = QuickConnectSelectedRoomActivity.this.f11222e = -1;
                    return;
                }
                this.f11227a.setChecked(true);
                int X = QuickConnectSelectedRoomActivity.this.f11222e;
                int unused2 = QuickConnectSelectedRoomActivity.this.f11222e = getAdapterPosition();
                C5614b.this.notifyItemChanged(X);
            }
        }

        public C5614b(Context context, List<C8937a> list) {
            this.f11225b = list;
            this.f11224a = LayoutInflater.from(context);
        }

        /* renamed from: a */
        public C8937a mo30831a(int i) {
            List<C8937a> list = this.f11225b;
            if (list == null || list.size() <= i || i < 0) {
                return null;
            }
            return this.f11225b.get(i);
        }

        /* renamed from: b */
        public void onBindViewHolder(C5615a aVar, int i) {
            C8937a a = mo30831a(i);
            if (a != null) {
                aVar.f11228b.setText(a.mo36723o());
                C6169f J0 = YeelightDeviceManager.m7800o0().mo23268J0(a.mo36722n());
                if (J0 != null) {
                    aVar.f11229c.setImageResource(J0.mo31873a2());
                }
            }
            if (i == QuickConnectSelectedRoomActivity.this.f11222e) {
                aVar.f11227a.setChecked(true);
            } else {
                aVar.f11227a.setChecked(false);
            }
            aVar.f11227a.setClickable(false);
        }

        /* renamed from: c */
        public C5615a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C5615a(this.f11224a.inflate(C12228R$layout.list_item_select_room, viewGroup, false));
        }

        public int getItemCount() {
            List<C8937a> list = this.f11225b;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
    }

    /* renamed from: Z */
    private void m16931Z() {
        findViewById(C12225R$id.two_view).setBackgroundColor(ContextCompat.getColor(this, 2131099805));
        if (!this.f11218a.mo23229n0(18)) {
            this.f11221d.setText(getString(2131755240));
            findViewById(C12225R$id.three_view).setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m16932a0() {
        C6169f J0;
        C8937a a = this.f11220c.mo30831a(this.f11222e);
        if (a != null && (J0 = YeelightDeviceManager.m7800o0().mo23268J0(a.mo36722n())) != null) {
            this.f11218a.mo23203Q0(J0.mo23185G());
            J0.mo31872Z1(this.f11218a);
            J0.mo31875c2().mo36711C(System.currentTimeMillis());
            C8293t.m19620n().mo35251A(J0.mo31875c2());
            J0.mo31759Q1();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_quickconnect_selected_room);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f11217f, "Activity has not device id", false);
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("com.yeelight.cherry.device_id");
        C3012e r0 = YeelightDeviceManager.m7804r0(stringExtra);
        this.f11218a = r0;
        if (r0 == null) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        List<C8937a> o = C8293t.m19620n().mo35255o();
        if (o != null) {
            for (C8937a next : o) {
                if (next.mo36730u(stringExtra)) {
                    next.mo36731v(stringExtra);
                    C8293t.m19620n().mo35251A(next);
                }
            }
        }
        this.f11219b = (RecyclerView) findViewById(C12225R$id.room_list);
        this.f11220c = new C5614b(this, o);
        this.f11219b.setLayoutManager(new LinearLayoutManager(this));
        this.f11219b.setAdapter(this.f11220c);
        Button button = (Button) findViewById(C12225R$id.next);
        this.f11221d = button;
        button.setOnClickListener(new C5613a());
        m16931Z();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }
}
