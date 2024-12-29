package com.yeelight.cherry.p141ui.fragment;

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
import com.chauthai.swipereveallayout.C0635a;
import com.chauthai.swipereveallayout.SwipeRevealLayout;
import com.yeelight.cherry.C12224R$drawable;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.adapter.RecyclerViewCursorAdapter;
import com.yeelight.yeelib.device.C6119c;
import com.yeelight.yeelib.device.C6164e;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.C8287q;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.view.BrightnessSeekBarView;
import p170i4.C9113d;
import p237z3.C12143c;
import p237z3.C12145e;

/* renamed from: com.yeelight.cherry.ui.fragment.GroupRecyclerViewAdapter */
public class GroupRecyclerViewAdapter extends RecyclerViewCursorAdapter<ViewHolder> {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C0635a f12015e;

    /* renamed from: com.yeelight.cherry.ui.fragment.GroupRecyclerViewAdapter$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder implements C12143c, C12145e {

        /* renamed from: a */
        public View f12016a;

        /* renamed from: b */
        public ImageView f12017b;

        /* renamed from: c */
        public ImageView f12018c;

        /* renamed from: d */
        private TextView f12019d;

        /* renamed from: e */
        private BrightnessSeekBarView f12020e;

        /* renamed from: f */
        private ImageView f12021f;

        /* renamed from: g */
        public SwipeRevealLayout f12022g;

        /* renamed from: h */
        public FrameLayout f12023h;

        /* renamed from: i */
        ProgressBar f12024i;

        /* renamed from: j */
        private String f12025j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public String f12026k;

        /* renamed from: l */
        private TextView f12027l;

        /* renamed from: m */
        private TextView f12028m;

        /* renamed from: n */
        private TextView f12029n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public C3012e f12030o;

        /* renamed from: com.yeelight.cherry.ui.fragment.GroupRecyclerViewAdapter$ViewHolder$a */
        class C5950a implements View.OnClickListener {

            /* renamed from: com.yeelight.cherry.ui.fragment.GroupRecyclerViewAdapter$ViewHolder$a$a */
            class C5951a implements DialogInterface.OnClickListener {
                C5951a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    GroupRecyclerViewAdapter.this.f12015e.mo11088e(ViewHolder.this.f12026k);
                    ViewHolder.this.f12030o.mo23131U0();
                    dialogInterface.dismiss();
                }
            }

            C5950a() {
            }

            public void onClick(View view) {
                if (C8287q.m19593e().mo35242i()) {
                    Toast.makeText(view.getContext(), view.getResources().getString(2131756170), 0).show();
                    return;
                }
                C9113d.C9118e eVar = new C9113d.C9118e(view.getContext());
                eVar.mo37179i(view.getContext().getString(2131755247)).mo37177g(view.getContext().getString(2131755713)).mo37174d(-2, view.getContext().getString(2131755232), (DialogInterface.OnClickListener) null).mo37174d(-1, view.getContext().getString(2131755281), new C5951a());
                eVar.mo37180j();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.GroupRecyclerViewAdapter$ViewHolder$b */
        class C5952b implements View.OnClickListener {
            C5952b() {
            }

            public void onClick(View view) {
                if (C8287q.m19593e().mo35242i()) {
                    Toast.makeText(view.getContext(), view.getResources().getString(2131756170), 0).show();
                } else {
                    ViewHolder.this.f12030o.mo23161u0(view);
                }
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.GroupRecyclerViewAdapter$ViewHolder$c */
        class C5953c implements View.OnClickListener {
            C5953c() {
            }

            public void onClick(View view) {
                ViewHolder.this.f12030o.mo23140b1();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.GroupRecyclerViewAdapter$ViewHolder$d */
        class C5954d implements View.OnClickListener {
            C5954d() {
            }

            public void onClick(View view) {
                ViewHolder.this.f12030o.mo23148l1();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.GroupRecyclerViewAdapter$ViewHolder$e */
        class C5955e implements View.OnClickListener {
            C5955e() {
            }

            public void onClick(View view) {
                ViewHolder.this.f12030o.mo23151n();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.GroupRecyclerViewAdapter$ViewHolder$f */
        class C5956f implements Runnable {
            C5956f() {
            }

            public void run() {
                ViewHolder.this.m17411e();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.GroupRecyclerViewAdapter$ViewHolder$g */
        class C5957g implements Runnable {
            C5957g() {
            }

            public void run() {
                ViewHolder.this.m17411e();
            }
        }

        public ViewHolder(View view) {
            super(view);
            this.f12016a = view;
            view.getContext();
            this.f12017b = (ImageView) view.findViewById(C12225R$id.group_switch_img);
            this.f12019d = (TextView) view.findViewById(C12225R$id.group_name);
            this.f12020e = (BrightnessSeekBarView) view.findViewById(2131296444);
            this.f12021f = (ImageView) view.findViewById(C12225R$id.btn_item_delete);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(C12225R$id.group_status);
            this.f12022g = (SwipeRevealLayout) view.findViewById(2131297525);
            this.f12023h = (FrameLayout) view.findViewById(C12225R$id.group_device_card);
            this.f12018c = (ImageView) view.findViewById(C12225R$id.group_img);
            this.f12027l = (TextView) view.findViewById(C12225R$id.group_device_on_number);
            this.f12028m = (TextView) view.findViewById(C12225R$id.group_device_off_number);
            this.f12029n = (TextView) view.findViewById(C12225R$id.group_device_offline_number);
            this.f12024i = (ProgressBar) view.findViewById(C12225R$id.group_connecting_progress);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public void m17411e() {
            ImageView imageView;
            View.OnClickListener eVar;
            this.f12019d.setText(this.f12025j);
            m17412f();
            this.f12020e.mo36112k(this.f12030o.mo23221d0().mo31601m());
            this.f12023h.setOnClickListener(new C5952b());
            if (this.f12030o.mo23145k0()) {
                this.f12017b.setVisibility(0);
                this.f12024i.setVisibility(4);
                if (this.f12030o.mo23146k1()) {
                    this.f12017b.setImageResource(C12224R$drawable.icon_yeelight_device_list_on);
                    imageView = this.f12017b;
                    eVar = new C5953c();
                } else {
                    this.f12017b.setImageResource(C12224R$drawable.icon_yeelight_device_list_off);
                    imageView = this.f12017b;
                    eVar = new C5954d();
                }
            } else if (this.f12030o.mo23147l0()) {
                this.f12017b.setVisibility(4);
                this.f12024i.setVisibility(0);
                return;
            } else {
                C3012e eVar2 = this.f12030o;
                if (!(eVar2 instanceof C6164e) || !eVar2.mo23230o0()) {
                    this.f12017b.setVisibility(0);
                    this.f12024i.setVisibility(4);
                    this.f12017b.setImageDrawable((Drawable) null);
                    return;
                }
                this.f12017b.setVisibility(0);
                this.f12024i.setVisibility(4);
                this.f12017b.setImageResource(C12224R$drawable.common_list_side_bind);
                imageView = this.f12017b;
                eVar = new C5955e();
            }
            imageView.setOnClickListener(eVar);
        }

        /* renamed from: f */
        private void m17412f() {
            C3012e eVar = this.f12030o;
            if (eVar instanceof C6119c) {
                C6119c cVar = (C6119c) eVar;
                int[] L1 = cVar.mo31754L1();
                int I1 = cVar.mo31751I1() - (L1[0] + L1[1]);
                this.f12027l.setText(String.valueOf(L1[0]));
                this.f12027l.requestLayout();
                this.f12028m.setText(String.valueOf(L1[1]));
                this.f12028m.requestLayout();
                if (this.f12030o instanceof C6164e) {
                    this.f12029n.setVisibility(4);
                    return;
                }
                this.f12029n.setText(String.valueOf(I1));
                this.f12029n.setVisibility(0);
                this.f12029n.requestLayout();
            }
        }

        /* renamed from: d */
        public void mo31249d(C3012e eVar) {
            C3012e eVar2 = this.f12030o;
            this.f12030o = eVar;
            this.f12025j = eVar.mo23210U();
            this.f12026k = eVar.mo23185G();
            if (eVar2 != null) {
                eVar2.mo23213W0(this);
                eVar2.mo23133V0(this);
            }
            C3012e eVar3 = this.f12030o;
            if (eVar3 != null) {
                eVar3.mo23178B0(this);
                this.f12030o.mo23171z0(this);
            }
            this.f12020e.setDeviceId(this.f12026k);
            this.f12021f.setOnClickListener(new C5950a());
            this.f12018c.setImageResource(this.f12030o.mo23116F());
            m17411e();
        }

        public void onConnectionStateChanged(int i, int i2) {
            this.f12016a.post(new C5956f());
        }

        public void onLocalConnected() {
        }

        public void onLocalDisconnected() {
        }

        public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
            this.f12016a.post(new C5957g());
        }
    }

    public GroupRecyclerViewAdapter(Context context, Cursor cursor) {
        super(context, cursor);
        C0635a aVar = new C0635a();
        this.f12015e = aVar;
        aVar.mo11089h(true);
        setHasStableIds(true);
    }

    /* renamed from: f */
    public void mo31093c(ViewHolder viewHolder, Cursor cursor) {
        String valueOf = String.valueOf(cursor.getString(cursor.getColumnIndex("group_id")));
        C3012e m0 = YeelightDeviceManager.m7800o0().mo23302m0(valueOf);
        if (m0 != null) {
            this.f12015e.mo11087d(viewHolder.f12022g, valueOf);
            viewHolder.mo31249d(m0);
        }
    }

    /* renamed from: g */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C12228R$layout.fragment_group_item, viewGroup, false));
    }
}
