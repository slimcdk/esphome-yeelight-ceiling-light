package com.yeelight.cherry.p141ui.adapter;

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
import com.chauthai.swipereveallayout.C0635a;
import com.chauthai.swipereveallayout.SwipeRevealLayout;
import com.yeelight.cherry.C12224R$drawable;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.device.C6169f;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.C8287q;
import com.yeelight.yeelib.managers.C8293t;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.DelaySetNewActivity;
import com.yeelight.yeelib.p142ui.view.BrightnessSeekBarView;
import java.util.List;
import p145d4.C8937a;
import p170i4.C9113d;
import p237z3.C12143c;
import p237z3.C12145e;

/* renamed from: com.yeelight.cherry.ui.adapter.RoomRecyclerViewAdapter */
public class RoomRecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    private final List<C8937a> f11894a;

    /* renamed from: b */
    private C0635a f11895b;

    /* renamed from: com.yeelight.cherry.ui.adapter.RoomRecyclerViewAdapter$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ImageView f11896a;

        /* renamed from: b */
        TextView f11897b;

        /* renamed from: c */
        TextView f11898c;

        /* renamed from: d */
        TextView f11899d;

        /* renamed from: e */
        TextView f11900e;

        /* renamed from: f */
        ImageView f11901f;

        /* renamed from: g */
        BrightnessSeekBarView f11902g;

        /* renamed from: h */
        FrameLayout f11903h;

        /* renamed from: i */
        ImageView f11904i;

        /* renamed from: j */
        ImageView f11905j;

        /* renamed from: k */
        SwipeRevealLayout f11906k;

        /* renamed from: l */
        C6169f f11907l;

        /* renamed from: m */
        private C12143c f11908m = new C5908a();

        /* renamed from: n */
        private C12145e f11909n = new C5910b();

        /* renamed from: com.yeelight.cherry.ui.adapter.RoomRecyclerViewAdapter$ViewHolder$a */
        class C5908a implements C12143c {

            /* renamed from: com.yeelight.cherry.ui.adapter.RoomRecyclerViewAdapter$ViewHolder$a$a */
            class C5909a implements Runnable {
                C5909a() {
                }

                public void run() {
                    ViewHolder.this.m17324d();
                }
            }

            C5908a() {
            }

            public void onConnectionStateChanged(int i, int i2) {
                if (i2 == 11) {
                    ViewHolder.this.f11901f.post(new C5909a());
                }
            }

            public void onLocalConnected() {
            }

            public void onLocalDisconnected() {
            }
        }

        /* renamed from: com.yeelight.cherry.ui.adapter.RoomRecyclerViewAdapter$ViewHolder$b */
        class C5910b implements C12145e {

            /* renamed from: com.yeelight.cherry.ui.adapter.RoomRecyclerViewAdapter$ViewHolder$b$a */
            class C5911a implements Runnable {
                C5911a() {
                }

                public void run() {
                    ViewHolder.this.m17324d();
                }
            }

            C5910b() {
            }

            public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
                if (i == 0 || i == 1 || i == 2) {
                    ViewHolder.this.f11901f.post(new C5911a());
                }
            }
        }

        /* renamed from: com.yeelight.cherry.ui.adapter.RoomRecyclerViewAdapter$ViewHolder$c */
        class C5912c implements View.OnClickListener {
            C5912c() {
            }

            public void onClick(View view) {
                ViewHolder.this.f11907l.mo23140b1();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.adapter.RoomRecyclerViewAdapter$ViewHolder$d */
        class C5913d implements View.OnClickListener {
            C5913d() {
            }

            public void onClick(View view) {
                ViewHolder.this.f11907l.mo23148l1();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.adapter.RoomRecyclerViewAdapter$ViewHolder$e */
        class C5914e implements View.OnClickListener {
            C5914e() {
            }

            public void onClick(View view) {
                if (C8287q.m19593e().mo35242i()) {
                    Toast.makeText(view.getContext(), view.getResources().getString(2131756170), 0).show();
                } else {
                    ViewHolder.this.f11907l.mo23161u0(view);
                }
            }
        }

        /* renamed from: com.yeelight.cherry.ui.adapter.RoomRecyclerViewAdapter$ViewHolder$f */
        class C5915f implements View.OnClickListener {

            /* renamed from: com.yeelight.cherry.ui.adapter.RoomRecyclerViewAdapter$ViewHolder$f$a */
            class C5916a implements C8293t.C8299f {

                /* renamed from: a */
                final /* synthetic */ DialogInterface f11919a;

                C5916a(DialogInterface dialogInterface) {
                    this.f11919a = dialogInterface;
                }

                /* renamed from: a */
                public void mo30328a() {
                }

                /* renamed from: b */
                public void mo30329b() {
                    ViewHolder viewHolder = ViewHolder.this;
                    RoomRecyclerViewAdapter.this.notifyItemRemoved(viewHolder.getAdapterPosition());
                    ViewHolder.this.f11906k.mo11062B(false);
                    this.f11919a.dismiss();
                }
            }

            C5915f() {
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m17329b(DialogInterface dialogInterface, int i) {
                ViewHolder.this.f11907l.mo31875c2().mo36711C(System.currentTimeMillis());
                C8293t.m19620n().mo35262y(ViewHolder.this.f11907l.mo31875c2(), new C5916a(dialogInterface));
            }

            public void onClick(View view) {
                if (C8287q.m19593e().mo35242i()) {
                    Toast.makeText(view.getContext(), view.getResources().getString(2131756170), 0).show();
                    return;
                }
                C9113d.C9118e eVar = new C9113d.C9118e(view.getContext());
                eVar.mo37179i(view.getContext().getString(2131755247)).mo37177g(view.getContext().getResources().getString(2131756195)).mo37174d(-2, view.getContext().getString(2131755232), (DialogInterface.OnClickListener) null).mo37174d(-1, view.getContext().getString(2131755281), new C5928a(this));
                eVar.mo37180j();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.adapter.RoomRecyclerViewAdapter$ViewHolder$g */
        class C5917g implements View.OnClickListener {
            C5917g() {
            }

            public void onClick(View view) {
                if (C8287q.m19593e().mo35242i()) {
                    Toast.makeText(view.getContext(), view.getResources().getString(2131756170), 0).show();
                    return;
                }
                Intent intent = new Intent();
                intent.setClass(view.getContext(), DelaySetNewActivity.class);
                intent.putExtra("com.yeelight.cherry.device_id", ViewHolder.this.f11907l.mo23185G());
                view.getContext().startActivity(intent);
                ViewHolder.this.f11906k.mo11062B(false);
            }
        }

        public ViewHolder(View view) {
            super(view);
            this.f11896a = (ImageView) view.findViewById(C12225R$id.room_img);
            this.f11897b = (TextView) view.findViewById(C12225R$id.room_name);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(C12225R$id.room_tip_on_layout);
            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(C12225R$id.room_tip_off_layout);
            LinearLayout linearLayout3 = (LinearLayout) view.findViewById(C12225R$id.room_tip_offline_layout);
            this.f11898c = (TextView) view.findViewById(C12225R$id.room_device_on_number);
            this.f11899d = (TextView) view.findViewById(C12225R$id.room_device_off_number);
            this.f11900e = (TextView) view.findViewById(C12225R$id.room_device_offline_number);
            this.f11901f = (ImageView) view.findViewById(C12225R$id.room_switch_img);
            this.f11902g = (BrightnessSeekBarView) view.findViewById(2131296444);
            this.f11903h = (FrameLayout) view.findViewById(C12225R$id.room_card);
            this.f11904i = (ImageView) view.findViewById(C12225R$id.btn_item_delete);
            this.f11905j = (ImageView) view.findViewById(C12225R$id.btn_item_delay);
            this.f11906k = (SwipeRevealLayout) view.findViewById(2131297525);
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void m17324d() {
            View.OnClickListener onClickListener;
            ImageView imageView;
            this.f11897b.setText(this.f11907l.mo23210U());
            TextView textView = this.f11897b;
            textView.setTextColor(textView.getResources().getColor(2131099840));
            m17325e();
            this.f11902g.mo36112k(this.f11907l.mo23221d0().mo31601m());
            this.f11896a.setImageResource(this.f11907l.mo31873a2());
            if (!this.f11907l.mo23145k0()) {
                onClickListener = null;
                this.f11901f.setImageDrawable((Drawable) null);
                imageView = this.f11901f;
            } else if (this.f11907l.mo23146k1()) {
                this.f11901f.setImageResource(C12224R$drawable.icon_yeelight_device_list_on);
                imageView = this.f11901f;
                onClickListener = new C5912c();
            } else {
                this.f11901f.setImageResource(C12224R$drawable.icon_yeelight_device_list_off);
                imageView = this.f11901f;
                onClickListener = new C5913d();
            }
            imageView.setOnClickListener(onClickListener);
            this.f11903h.setOnClickListener(new C5914e());
            this.f11904i.setOnClickListener(new C5915f());
            this.f11905j.setOnClickListener(new C5917g());
        }

        /* renamed from: e */
        private void m17325e() {
            int[] L1 = this.f11907l.mo31754L1();
            int I1 = this.f11907l.mo31751I1() - (L1[0] + L1[1]);
            this.f11898c.setText(String.valueOf(L1[0]));
            this.f11899d.setText(String.valueOf(L1[1]));
            this.f11900e.setText(String.valueOf(I1));
        }

        /* renamed from: a */
        public void mo31188a(C6169f fVar) {
            C6169f fVar2 = this.f11907l;
            this.f11907l = fVar;
            if (fVar == null || fVar != fVar2) {
                if (fVar2 != null) {
                    fVar2.mo23213W0(this.f11909n);
                    fVar2.mo23133V0(this.f11908m);
                }
                mo31189c();
                this.f11902g.setDeviceId(fVar.mo23185G());
                if (this.f11907l != null) {
                    m17324d();
                    return;
                }
                return;
            }
            m17324d();
        }

        /* renamed from: c */
        public void mo31189c() {
            C6169f fVar = this.f11907l;
            if (fVar != null) {
                fVar.mo23178B0(this.f11909n);
                this.f11907l.mo23171z0(this.f11908m);
            }
        }

        public String toString() {
            return super.toString() + " '" + this.f11897b.getText() + "'";
        }
    }

    public RoomRecyclerViewAdapter(List<C8937a> list) {
        this.f11894a = list;
        C0635a aVar = new C0635a();
        this.f11895b = aVar;
        aVar.mo11089h(true);
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        C8937a aVar = this.f11894a.get(i);
        this.f11895b.mo11087d(viewHolder.f11906k, aVar.mo36722n());
        C6169f J0 = YeelightDeviceManager.m7800o0().mo23268J0(aVar.mo36722n());
        if (J0 != null) {
            viewHolder.mo31188a(J0);
        }
    }

    /* renamed from: b */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C12228R$layout.fragment_room_item, viewGroup, false));
    }

    public int getItemCount() {
        return this.f11894a.size();
    }
}
