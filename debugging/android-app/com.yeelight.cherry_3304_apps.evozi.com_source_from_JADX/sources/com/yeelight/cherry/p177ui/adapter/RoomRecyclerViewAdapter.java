package com.yeelight.cherry.p177ui.adapter;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.chauthai.swipereveallayout.C1261a;
import com.chauthai.swipereveallayout.SwipeRevealLayout;
import com.yeelight.cherry.C11744R$drawable;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p150c.C6005g;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C9807q;
import com.yeelight.yeelib.p152f.C9812t;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p190i.C9875a;
import com.yeelight.yeelib.p194ui.activity.DelaySetNewActivity;
import com.yeelight.yeelib.p194ui.view.BrightnessSeekBarView;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.adapter.RoomRecyclerViewAdapter */
public class RoomRecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    private final List<C9875a> f12294a;

    /* renamed from: b */
    private C1261a f12295b;

    /* renamed from: com.yeelight.cherry.ui.adapter.RoomRecyclerViewAdapter$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ImageView f12296a;

        /* renamed from: b */
        TextView f12297b;

        /* renamed from: c */
        TextView f12298c;

        /* renamed from: d */
        TextView f12299d;

        /* renamed from: e */
        TextView f12300e;

        /* renamed from: f */
        ImageView f12301f;

        /* renamed from: g */
        BrightnessSeekBarView f12302g;

        /* renamed from: h */
        FrameLayout f12303h;

        /* renamed from: i */
        ImageView f12304i;

        /* renamed from: j */
        ImageView f12305j;

        /* renamed from: k */
        SwipeRevealLayout f12306k;

        /* renamed from: l */
        C6005g f12307l;

        /* renamed from: m */
        private C9768c f12308m = new C5845a();

        /* renamed from: n */
        private C9770e f12309n = new C5847b();

        /* renamed from: com.yeelight.cherry.ui.adapter.RoomRecyclerViewAdapter$ViewHolder$a */
        class C5845a implements C9768c {

            /* renamed from: com.yeelight.cherry.ui.adapter.RoomRecyclerViewAdapter$ViewHolder$a$a */
            class C5846a implements Runnable {
                C5846a() {
                }

                public void run() {
                    ViewHolder.this.m17285d();
                }
            }

            C5845a() {
            }

            public void onConnectionStateChanged(int i, int i2) {
                if (i2 == 11) {
                    ViewHolder.this.f12301f.post(new C5846a());
                }
            }

            public void onLocalConnected() {
            }

            public void onLocalDisconnected() {
            }
        }

        /* renamed from: com.yeelight.cherry.ui.adapter.RoomRecyclerViewAdapter$ViewHolder$b */
        class C5847b implements C9770e {

            /* renamed from: com.yeelight.cherry.ui.adapter.RoomRecyclerViewAdapter$ViewHolder$b$a */
            class C5848a implements Runnable {
                C5848a() {
                }

                public void run() {
                    ViewHolder.this.m17285d();
                }
            }

            C5847b() {
            }

            public void onStatusChange(int i, C6024e eVar) {
                if (i == 0 || i == 1 || i == 2) {
                    ViewHolder.this.f12301f.post(new C5848a());
                }
            }
        }

        /* renamed from: com.yeelight.cherry.ui.adapter.RoomRecyclerViewAdapter$ViewHolder$c */
        class C5849c implements View.OnClickListener {
            C5849c() {
            }

            public void onClick(View view) {
                ViewHolder.this.f12307l.mo23326b1();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.adapter.RoomRecyclerViewAdapter$ViewHolder$d */
        class C5850d implements View.OnClickListener {
            C5850d() {
            }

            public void onClick(View view) {
                ViewHolder.this.f12307l.mo23334l1();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.adapter.RoomRecyclerViewAdapter$ViewHolder$e */
        class C5851e implements View.OnClickListener {
            C5851e() {
            }

            public void onClick(View view) {
                if (C9807q.m23812c().mo31675e()) {
                    Toast.makeText(view.getContext(), view.getResources().getString(2131756146), 0).show();
                } else {
                    ViewHolder.this.f12307l.mo23347u0(view);
                }
            }
        }

        /* renamed from: com.yeelight.cherry.ui.adapter.RoomRecyclerViewAdapter$ViewHolder$f */
        class C5852f implements View.OnClickListener {

            /* renamed from: com.yeelight.cherry.ui.adapter.RoomRecyclerViewAdapter$ViewHolder$f$a */
            class C5853a implements DialogInterface.OnClickListener {
                C5853a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    ViewHolder.this.f12307l.mo27553c2().mo31942C(System.currentTimeMillis());
                    C9812t.m23832j().mo31692v(ViewHolder.this.f12307l.mo27553c2());
                    ViewHolder viewHolder = ViewHolder.this;
                    RoomRecyclerViewAdapter.this.notifyItemRemoved(viewHolder.getAdapterPosition());
                    ViewHolder.this.f12306k.mo10084B(false);
                    dialogInterface.dismiss();
                }
            }

            C5852f() {
            }

            public void onClick(View view) {
                if (C9807q.m23812c().mo31675e()) {
                    Toast.makeText(view.getContext(), view.getResources().getString(2131756146), 0).show();
                    return;
                }
                C10526e.C10531e eVar = new C10526e.C10531e(view.getContext());
                eVar.mo33358i(view.getContext().getString(2131755244));
                eVar.mo33356g(view.getContext().getResources().getString(2131756171));
                eVar.mo33353d(-2, view.getContext().getString(2131755229), (DialogInterface.OnClickListener) null);
                eVar.mo33353d(-1, view.getContext().getString(2131755277), new C5853a());
                eVar.mo33359j();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.adapter.RoomRecyclerViewAdapter$ViewHolder$g */
        class C5854g implements View.OnClickListener {
            C5854g() {
            }

            public void onClick(View view) {
                if (C9807q.m23812c().mo31675e()) {
                    Toast.makeText(view.getContext(), view.getResources().getString(2131756146), 0).show();
                    return;
                }
                Intent intent = new Intent();
                intent.setClass(view.getContext(), DelaySetNewActivity.class);
                intent.putExtra("com.yeelight.cherry.device_id", ViewHolder.this.f12307l.mo23372G());
                view.getContext().startActivity(intent);
                ViewHolder.this.f12306k.mo10084B(false);
            }
        }

        public ViewHolder(View view) {
            super(view);
            this.f12296a = (ImageView) view.findViewById(C11745R$id.room_img);
            this.f12297b = (TextView) view.findViewById(C11745R$id.room_name);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(C11745R$id.room_tip_on_layout);
            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(C11745R$id.room_tip_off_layout);
            LinearLayout linearLayout3 = (LinearLayout) view.findViewById(C11745R$id.room_tip_offline_layout);
            this.f12298c = (TextView) view.findViewById(C11745R$id.room_device_on_number);
            this.f12299d = (TextView) view.findViewById(C11745R$id.room_device_off_number);
            this.f12300e = (TextView) view.findViewById(C11745R$id.room_device_offline_number);
            this.f12301f = (ImageView) view.findViewById(C11745R$id.room_switch_img);
            this.f12302g = (BrightnessSeekBarView) view.findViewById(2131296386);
            this.f12303h = (FrameLayout) view.findViewById(C11745R$id.room_card);
            this.f12304i = (ImageView) view.findViewById(C11745R$id.btn_item_delete);
            this.f12305j = (ImageView) view.findViewById(C11745R$id.btn_item_delay);
            this.f12306k = (SwipeRevealLayout) view.findViewById(2131297369);
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void m17285d() {
            View.OnClickListener onClickListener;
            ImageView imageView;
            this.f12297b.setText(this.f12307l.mo23397U());
            TextView textView = this.f12297b;
            textView.setTextColor(textView.getResources().getColor(2131099837));
            m17286e();
            this.f12302g.mo32742k(this.f12307l.mo23408d0().mo27700m());
            this.f12296a.setImageResource(this.f12307l.mo27551a2());
            if (!this.f12307l.mo23331k0()) {
                onClickListener = null;
                this.f12301f.setImageDrawable((Drawable) null);
                imageView = this.f12301f;
            } else if (this.f12307l.mo23332k1()) {
                this.f12301f.setImageResource(C11744R$drawable.icon_yeelight_device_list_on);
                imageView = this.f12301f;
                onClickListener = new C5849c();
            } else {
                this.f12301f.setImageResource(C11744R$drawable.icon_yeelight_device_list_off);
                imageView = this.f12301f;
                onClickListener = new C5850d();
            }
            imageView.setOnClickListener(onClickListener);
            this.f12303h.setOnClickListener(new C5851e());
            this.f12304i.setOnClickListener(new C5852f());
            this.f12305j.setOnClickListener(new C5854g());
        }

        /* renamed from: e */
        private void m17286e() {
            int[] L1 = this.f12307l.mo27499L1();
            int I1 = this.f12307l.mo27496I1() - (L1[0] + L1[1]);
            this.f12298c.setText(String.valueOf(L1[0]));
            this.f12299d.setText(String.valueOf(L1[1]));
            this.f12300e.setText(String.valueOf(I1));
        }

        /* renamed from: a */
        public void mo27222a(C6005g gVar) {
            C6005g gVar2 = this.f12307l;
            this.f12307l = gVar;
            if (gVar == null || gVar != gVar2) {
                if (gVar2 != null) {
                    gVar2.mo23400W0(this.f12309n);
                    gVar2.mo23319V0(this.f12308m);
                }
                mo27223c();
                this.f12302g.setDeviceId(gVar.mo23372G());
                if (this.f12307l != null) {
                    m17285d();
                    return;
                }
                return;
            }
            m17285d();
        }

        /* renamed from: c */
        public void mo27223c() {
            C6005g gVar = this.f12307l;
            if (gVar != null) {
                gVar.mo23365B0(this.f12309n);
                this.f12307l.mo23358z0(this.f12308m);
            }
        }

        public String toString() {
            return super.toString() + " '" + this.f12297b.getText() + "'";
        }
    }

    public RoomRecyclerViewAdapter(List<C9875a> list) {
        this.f12294a = list;
        C1261a aVar = new C1261a();
        this.f12295b = aVar;
        aVar.mo10111h(true);
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        C9875a aVar = this.f12294a.get(i);
        this.f12295b.mo10109d(viewHolder.f12306k, aVar.mo31953n());
        C6005g G0 = C4257w.m11947l0().mo23647G0(aVar.mo31953n());
        if (G0 != null) {
            viewHolder.mo27222a(G0);
        }
    }

    /* renamed from: b */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C11748R$layout.fragment_room_item, viewGroup, false));
    }

    public int getItemCount() {
        return this.f12294a.size();
    }
}
