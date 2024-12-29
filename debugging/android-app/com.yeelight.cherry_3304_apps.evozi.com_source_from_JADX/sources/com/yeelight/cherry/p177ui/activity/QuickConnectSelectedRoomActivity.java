package com.yeelight.cherry.p177ui.activity;

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
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p150c.C6005g;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C9812t;
import com.yeelight.yeelib.p190i.C9875a;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.activity.QuickConnectSelectedRoomActivity */
public class QuickConnectSelectedRoomActivity extends BaseActivity {

    /* renamed from: g */
    private static String f11653g = QuickConnectSelectedRoomActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4200i f11654b;

    /* renamed from: c */
    private RecyclerView f11655c;

    /* renamed from: d */
    private C5573b f11656d;

    /* renamed from: e */
    private Button f11657e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f11658f = -1;

    /* renamed from: com.yeelight.cherry.ui.activity.QuickConnectSelectedRoomActivity$a */
    class C5572a implements View.OnClickListener {
        C5572a() {
        }

        public void onClick(View view) {
            Intent intent;
            QuickConnectSelectedRoomActivity.this.m16936a0();
            if (QuickConnectSelectedRoomActivity.this.f11654b.mo23415n0(18)) {
                intent = new Intent(QuickConnectSelectedRoomActivity.this, QuickConnectLanControlActivity.class);
                intent.putExtra("com.yeelight.cherry.device_id", QuickConnectSelectedRoomActivity.this.f11654b.mo23372G());
            } else {
                intent = new Intent();
                intent.setClass(QuickConnectSelectedRoomActivity.this, MainActivity.class);
                intent.putExtra("com.yeelight.cherry.device_id", QuickConnectSelectedRoomActivity.this.f11654b.mo23372G());
                intent.addFlags(67108864);
            }
            QuickConnectSelectedRoomActivity.this.startActivity(intent);
            QuickConnectSelectedRoomActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.QuickConnectSelectedRoomActivity$b */
    class C5573b extends RecyclerView.Adapter<C5574a> {

        /* renamed from: a */
        private LayoutInflater f11660a;

        /* renamed from: b */
        private List<C9875a> f11661b;

        /* renamed from: com.yeelight.cherry.ui.activity.QuickConnectSelectedRoomActivity$b$a */
        class C5574a extends RecyclerView.ViewHolder implements View.OnClickListener {

            /* renamed from: a */
            CheckBox f11663a;

            /* renamed from: b */
            TextView f11664b;

            /* renamed from: c */
            ImageView f11665c;

            public C5574a(View view) {
                super(view);
                this.f11663a = (CheckBox) view.findViewById(C11745R$id.room_checkbox);
                this.f11664b = (TextView) view.findViewById(C11745R$id.name);
                this.f11665c = (ImageView) view.findViewById(C11745R$id.icon_room);
                view.setOnClickListener(this);
            }

            public void onClick(View view) {
                if (getAdapterPosition() == QuickConnectSelectedRoomActivity.this.f11658f) {
                    this.f11663a.setChecked(false);
                    int unused = QuickConnectSelectedRoomActivity.this.f11658f = -1;
                    return;
                }
                this.f11663a.setChecked(true);
                int X = QuickConnectSelectedRoomActivity.this.f11658f;
                int unused2 = QuickConnectSelectedRoomActivity.this.f11658f = getAdapterPosition();
                C5573b.this.notifyItemChanged(X);
            }
        }

        public C5573b(Context context, List<C9875a> list) {
            this.f11661b = list;
            this.f11660a = LayoutInflater.from(context);
        }

        /* renamed from: a */
        public C9875a mo26850a(int i) {
            List<C9875a> list = this.f11661b;
            if (list == null || list.size() <= i || i < 0) {
                return null;
            }
            return this.f11661b.get(i);
        }

        /* renamed from: b */
        public void onBindViewHolder(C5574a aVar, int i) {
            C9875a a = mo26850a(i);
            if (a != null) {
                aVar.f11664b.setText(a.mo31954o());
                C6005g G0 = C4257w.m11947l0().mo23647G0(a.mo31953n());
                if (G0 != null) {
                    aVar.f11665c.setImageResource(G0.mo27551a2());
                }
            }
            if (i == QuickConnectSelectedRoomActivity.this.f11658f) {
                aVar.f11663a.setChecked(true);
            } else {
                aVar.f11663a.setChecked(false);
            }
            aVar.f11663a.setClickable(false);
        }

        /* renamed from: c */
        public C5574a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C5574a(this.f11660a.inflate(C11748R$layout.list_item_select_room, viewGroup, false));
        }

        public int getItemCount() {
            List<C9875a> list = this.f11661b;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
    }

    /* renamed from: Z */
    private void m16935Z() {
        findViewById(C11745R$id.two_view).setBackgroundColor(ContextCompat.getColor(this, 2131099802));
        if (!this.f11654b.mo23415n0(18)) {
            this.f11657e.setText(getString(2131755237));
            findViewById(C11745R$id.three_view).setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m16936a0() {
        C6005g G0;
        C9875a a = this.f11656d.mo26850a(this.f11658f);
        if (a != null && (G0 = C4257w.m11947l0().mo23647G0(a.mo31953n())) != null) {
            this.f11654b.mo23390Q0(G0.mo23372G());
            G0.mo27550Z1(this.f11654b);
            G0.mo27553c2().mo31942C(System.currentTimeMillis());
            C9812t.m23832j().mo31694x(G0.mo27553c2());
            G0.mo27504Q1();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_quickconnect_selected_room);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f11653g, "Activity has not device id", false);
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("com.yeelight.cherry.device_id");
        C4200i o0 = C4257w.m11953o0(stringExtra);
        this.f11654b = o0;
        if (o0 == null) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        List<C9875a> k = C9812t.m23832j().mo31685k();
        if (k != null) {
            for (C9875a next : k) {
                if (next.mo31961u(stringExtra)) {
                    next.mo31962v(stringExtra);
                    C9812t.m23832j().mo31694x(next);
                }
            }
        }
        this.f11655c = (RecyclerView) findViewById(C11745R$id.room_list);
        this.f11656d = new C5573b(this, k);
        this.f11655c.setLayoutManager(new LinearLayoutManager(this));
        this.f11655c.setAdapter(this.f11656d);
        Button button = (Button) findViewById(C11745R$id.next);
        this.f11657e = button;
        button.setOnClickListener(new C5572a());
        m16935Z();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }
}
