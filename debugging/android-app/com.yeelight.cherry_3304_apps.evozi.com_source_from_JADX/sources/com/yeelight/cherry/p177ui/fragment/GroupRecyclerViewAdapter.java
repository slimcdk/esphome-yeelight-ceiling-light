package com.yeelight.cherry.p177ui.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.chauthai.swipereveallayout.C1261a;
import com.chauthai.swipereveallayout.SwipeRevealLayout;
import com.yeelight.cherry.C11744R$drawable;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p177ui.adapter.RecyclerViewCursorAdapter;
import com.yeelight.yeelib.p150c.C5980c;
import com.yeelight.yeelib.p150c.C6000f;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C9807q;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.view.BrightnessSeekBarView;
import com.yeelight.yeelib.p194ui.widget.C10526e;

/* renamed from: com.yeelight.cherry.ui.fragment.GroupRecyclerViewAdapter */
public class GroupRecyclerViewAdapter extends RecyclerViewCursorAdapter<ViewHolder> {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1261a f12421e;

    /* renamed from: com.yeelight.cherry.ui.fragment.GroupRecyclerViewAdapter$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder implements C9768c, C9770e {

        /* renamed from: a */
        public View f12422a;

        /* renamed from: b */
        public ImageView f12423b;

        /* renamed from: c */
        public ImageView f12424c;

        /* renamed from: d */
        private TextView f12425d;

        /* renamed from: e */
        private BrightnessSeekBarView f12426e;

        /* renamed from: f */
        private ImageView f12427f;

        /* renamed from: g */
        public SwipeRevealLayout f12428g;

        /* renamed from: h */
        public FrameLayout f12429h;

        /* renamed from: i */
        ProgressBar f12430i;

        /* renamed from: j */
        private String f12431j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public String f12432k;

        /* renamed from: l */
        private TextView f12433l;

        /* renamed from: m */
        private TextView f12434m;

        /* renamed from: n */
        private TextView f12435n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public C4200i f12436o;

        /* renamed from: com.yeelight.cherry.ui.fragment.GroupRecyclerViewAdapter$ViewHolder$a */
        class C5890a implements View.OnClickListener {

            /* renamed from: com.yeelight.cherry.ui.fragment.GroupRecyclerViewAdapter$ViewHolder$a$a */
            class C5891a implements DialogInterface.OnClickListener {
                C5891a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    GroupRecyclerViewAdapter.this.f12421e.mo10110e(ViewHolder.this.f12432k);
                    ViewHolder.this.f12436o.mo23317U0();
                    dialogInterface.dismiss();
                }
            }

            C5890a() {
            }

            public void onClick(View view) {
                if (C9807q.m23812c().mo31675e()) {
                    Toast.makeText(view.getContext(), view.getResources().getString(2131756146), 0).show();
                    return;
                }
                C10526e.C10531e eVar = new C10526e.C10531e(view.getContext());
                eVar.mo33358i(view.getContext().getString(2131755244));
                eVar.mo33356g(view.getContext().getString(2131755705));
                eVar.mo33353d(-2, view.getContext().getString(2131755229), (DialogInterface.OnClickListener) null);
                eVar.mo33353d(-1, view.getContext().getString(2131755277), new C5891a());
                eVar.mo33359j();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.GroupRecyclerViewAdapter$ViewHolder$b */
        class C5892b implements View.OnClickListener {
            C5892b() {
            }

            public void onClick(View view) {
                if (C9807q.m23812c().mo31675e()) {
                    Toast.makeText(view.getContext(), view.getResources().getString(2131756146), 0).show();
                } else {
                    ViewHolder.this.f12436o.mo23347u0(view);
                }
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.GroupRecyclerViewAdapter$ViewHolder$c */
        class C5893c implements View.OnClickListener {
            C5893c() {
            }

            public void onClick(View view) {
                ViewHolder.this.f12436o.mo23326b1();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.GroupRecyclerViewAdapter$ViewHolder$d */
        class C5894d implements View.OnClickListener {
            C5894d() {
            }

            public void onClick(View view) {
                ViewHolder.this.f12436o.mo23334l1();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.GroupRecyclerViewAdapter$ViewHolder$e */
        class C5895e implements View.OnClickListener {
            C5895e() {
            }

            public void onClick(View view) {
                ViewHolder.this.f12436o.mo23337n();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.GroupRecyclerViewAdapter$ViewHolder$f */
        class C5896f implements Runnable {
            C5896f() {
            }

            public void run() {
                ViewHolder.this.m17357e();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.GroupRecyclerViewAdapter$ViewHolder$g */
        class C5897g implements Runnable {
            C5897g() {
            }

            public void run() {
                ViewHolder.this.m17357e();
            }
        }

        public ViewHolder(View view) {
            super(view);
            this.f12422a = view;
            view.getContext();
            this.f12423b = (ImageView) view.findViewById(C11745R$id.group_switch_img);
            this.f12425d = (TextView) view.findViewById(C11745R$id.group_name);
            this.f12426e = (BrightnessSeekBarView) view.findViewById(2131296386);
            this.f12427f = (ImageView) view.findViewById(C11745R$id.btn_item_delete);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(C11745R$id.group_status);
            this.f12428g = (SwipeRevealLayout) view.findViewById(2131297369);
            this.f12429h = (FrameLayout) view.findViewById(C11745R$id.group_device_card);
            this.f12424c = (ImageView) view.findViewById(C11745R$id.group_img);
            this.f12433l = (TextView) view.findViewById(C11745R$id.group_device_on_number);
            this.f12434m = (TextView) view.findViewById(C11745R$id.group_device_off_number);
            this.f12435n = (TextView) view.findViewById(C11745R$id.group_device_offline_number);
            this.f12430i = (ProgressBar) view.findViewById(C11745R$id.group_connecting_progress);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public void m17357e() {
            ImageView imageView;
            View.OnClickListener eVar;
            this.f12425d.setText(this.f12431j);
            m17358f();
            this.f12426e.mo32742k(this.f12436o.mo23408d0().mo27700m());
            this.f12429h.setOnClickListener(new C5892b());
            if (this.f12436o.mo23331k0()) {
                this.f12423b.setVisibility(0);
                this.f12430i.setVisibility(4);
                if (this.f12436o.mo23332k1()) {
                    this.f12423b.setImageResource(C11744R$drawable.icon_yeelight_device_list_on);
                    imageView = this.f12423b;
                    eVar = new C5893c();
                } else {
                    this.f12423b.setImageResource(C11744R$drawable.icon_yeelight_device_list_off);
                    imageView = this.f12423b;
                    eVar = new C5894d();
                }
            } else if (this.f12436o.mo23333l0()) {
                this.f12423b.setVisibility(4);
                this.f12430i.setVisibility(0);
                return;
            } else {
                C4200i iVar = this.f12436o;
                if (!(iVar instanceof C6000f) || !iVar.mo23416o0()) {
                    this.f12423b.setVisibility(0);
                    this.f12430i.setVisibility(4);
                    this.f12423b.setImageDrawable((Drawable) null);
                    return;
                }
                this.f12423b.setVisibility(0);
                this.f12430i.setVisibility(4);
                this.f12423b.setImageResource(C11744R$drawable.common_list_side_bind);
                imageView = this.f12423b;
                eVar = new C5895e();
            }
            imageView.setOnClickListener(eVar);
        }

        /* renamed from: f */
        private void m17358f() {
            C4200i iVar = this.f12436o;
            if (iVar instanceof C5980c) {
                C5980c cVar = (C5980c) iVar;
                int[] L1 = cVar.mo27499L1();
                int I1 = cVar.mo27496I1() - (L1[0] + L1[1]);
                this.f12433l.setText(String.valueOf(L1[0]));
                this.f12433l.requestLayout();
                this.f12434m.setText(String.valueOf(L1[1]));
                this.f12434m.requestLayout();
                if (this.f12436o instanceof C6000f) {
                    this.f12435n.setVisibility(4);
                    return;
                }
                this.f12435n.setText(String.valueOf(I1));
                this.f12435n.setVisibility(0);
                this.f12435n.requestLayout();
            }
        }

        /* renamed from: d */
        public void mo27290d(C4200i iVar) {
            C4200i iVar2 = this.f12436o;
            this.f12436o = iVar;
            this.f12431j = iVar.mo23397U();
            this.f12432k = iVar.mo23372G();
            if (iVar2 != null) {
                iVar2.mo23400W0(this);
                iVar2.mo23319V0(this);
            }
            C4200i iVar3 = this.f12436o;
            if (iVar3 != null) {
                iVar3.mo23365B0(this);
                this.f12436o.mo23358z0(this);
            }
            this.f12426e.setDeviceId(this.f12432k);
            this.f12427f.setOnClickListener(new C5890a());
            this.f12424c.setImageResource(this.f12436o.mo23303F());
            m17357e();
        }

        public void onConnectionStateChanged(int i, int i2) {
            this.f12422a.post(new C5896f());
        }

        public void onLocalConnected() {
        }

        public void onLocalDisconnected() {
        }

        public void onStatusChange(int i, C6024e eVar) {
            this.f12422a.post(new C5897g());
        }
    }

    public GroupRecyclerViewAdapter(Context context, Cursor cursor) {
        super(context, cursor);
        C1261a aVar = new C1261a();
        this.f12421e = aVar;
        aVar.mo10111h(true);
        setHasStableIds(true);
    }

    /* renamed from: f */
    public void mo27124c(ViewHolder viewHolder, Cursor cursor) {
        String valueOf = String.valueOf(cursor.getString(cursor.getColumnIndex("group_id")));
        C4200i j0 = C4257w.m11947l0().mo23673j0(valueOf);
        if (j0 != null) {
            this.f12421e.mo10109d(viewHolder.f12428g, valueOf);
            viewHolder.mo27290d(j0);
        }
    }

    /* renamed from: g */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C11748R$layout.fragment_group_item, viewGroup, false));
    }
}
