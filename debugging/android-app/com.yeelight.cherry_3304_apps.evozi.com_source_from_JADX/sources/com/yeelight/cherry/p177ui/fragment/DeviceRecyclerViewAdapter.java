package com.yeelight.cherry.p177ui.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
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
import com.miot.common.device.Device;
import com.yeelight.cherry.C11744R$drawable;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity;
import com.yeelight.cherry.p177ui.activity.DeviceShareActivity;
import com.yeelight.cherry.p177ui.adapter.RecyclerViewCursorAdapter;
import com.yeelight.yeelib.data.C7579c;
import com.yeelight.yeelib.device.models.C7628j;
import com.yeelight.yeelib.p150c.C5972a;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p183m.C7472y;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C9807q;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.utils.C4308b;
import com.yeelight.yeelib.utils.C4315y;

/* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter */
public class DeviceRecyclerViewAdapter extends RecyclerViewCursorAdapter<ViewHolder> {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1261a f12369e;

    /* renamed from: f */
    private boolean f12370f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f12371g;

    /* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder implements C9768c, C9770e {

        /* renamed from: a */
        public final View f12372a;

        /* renamed from: b */
        public TextView f12373b;

        /* renamed from: c */
        public TextView f12374c;

        /* renamed from: d */
        public ImageView f12375d;

        /* renamed from: e */
        public ImageView f12376e;

        /* renamed from: f */
        public ImageView f12377f;

        /* renamed from: g */
        public ImageView f12378g;

        /* renamed from: h */
        public SwipeRevealLayout f12379h;

        /* renamed from: i */
        public FrameLayout f12380i;

        /* renamed from: j */
        public LinearLayout f12381j;

        /* renamed from: k */
        public View f12382k;

        /* renamed from: l */
        public View f12383l;

        /* renamed from: m */
        public ImageView f12384m;

        /* renamed from: n */
        public ImageView f12385n;

        /* renamed from: o */
        ProgressBar f12386o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public String f12387p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public Context f12388q;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public C4198d f12389r;

        /* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter$ViewHolder$a */
        class C5869a implements View.OnClickListener {
            C5869a() {
            }

            public void onClick(View view) {
                if (C9807q.m23812c().mo31675e()) {
                    Toast.makeText(view.getContext(), view.getResources().getString(2131756146), 0).show();
                    return;
                }
                Intent intent = new Intent();
                intent.setClass(ViewHolder.this.f12388q, DeviceShareActivity.class);
                intent.putExtra("com.yeelight.cherry.device_id", ViewHolder.this.f12387p);
                ViewHolder.this.f12388q.startActivity(intent);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter$ViewHolder$b */
        class C5870b implements View.OnClickListener {
            C5870b() {
            }

            public void onClick(View view) {
                if (C9807q.m23812c().mo31675e()) {
                    Toast.makeText(view.getContext(), view.getResources().getString(2131756146), 0).show();
                    return;
                }
                Intent intent = new Intent();
                intent.setClass(ViewHolder.this.f12388q, DeviceShareActivity.class);
                intent.putExtra("com.yeelight.cherry.device_id", ViewHolder.this.f12387p);
                ViewHolder.this.f12388q.startActivity(intent);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter$ViewHolder$c */
        class C5871c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f12393a;

            C5871c(int i) {
                this.f12393a = i;
            }

            public void run() {
                ViewHolder.this.m17327k();
                if (this.f12393a == 5 && DeviceRecyclerViewAdapter.this.f12371g) {
                    Intent intent = new Intent(ViewHolder.this.f12388q, BluetoothConnectNewActivity.class);
                    intent.putExtra("com.yeelight.cherry.device_id", ViewHolder.this.f12387p);
                    ViewHolder.this.f12388q.startActivity(intent);
                }
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter$ViewHolder$d */
        class C5872d implements Runnable {
            C5872d() {
            }

            public void run() {
                ViewHolder.this.m17327k();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter$ViewHolder$e */
        class C5873e implements Runnable {
            C5873e() {
            }

            public void run() {
                ViewHolder.this.m17327k();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter$ViewHolder$f */
        class C5874f implements Runnable {
            C5874f() {
            }

            public void run() {
                ViewHolder.this.m17327k();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter$ViewHolder$g */
        class C5875g implements View.OnClickListener {
            C5875g() {
            }

            public void onClick(View view) {
                if (C9807q.m23812c().mo31675e()) {
                    Toast.makeText(view.getContext(), view.getResources().getString(2131756146), 0).show();
                } else {
                    ViewHolder.this.f12389r.mo23347u0(view);
                }
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter$ViewHolder$h */
        class C5876h implements View.OnClickListener {

            /* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter$ViewHolder$h$a */
            class C5877a implements DialogInterface.OnClickListener {
                C5877a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    DeviceRecyclerViewAdapter.this.f12369e.mo10110e(ViewHolder.this.f12387p);
                    ViewHolder.this.f12389r.mo23317U0();
                    dialogInterface.dismiss();
                }
            }

            C5876h() {
            }

            public void onClick(View view) {
                if (C9807q.m23812c().mo31675e()) {
                    Toast.makeText(view.getContext(), view.getResources().getString(2131756146), 0).show();
                    return;
                }
                C10526e.C10531e eVar = new C10526e.C10531e(view.getContext());
                eVar.mo33358i(view.getContext().getString(2131755244));
                eVar.mo33356g(view.getContext().getString(2131755435));
                eVar.mo33353d(-2, view.getContext().getString(2131755229), (DialogInterface.OnClickListener) null);
                eVar.mo33353d(-1, view.getContext().getString(2131755277), new C5877a());
                eVar.mo33359j();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter$ViewHolder$i */
        class C5878i implements View.OnClickListener {
            C5878i() {
            }

            public void onClick(View view) {
                ViewHolder.this.f12389r.mo23342r();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter$ViewHolder$j */
        class C5879j implements View.OnClickListener {
            C5879j() {
            }

            public void onClick(View view) {
                ((C5972a) ViewHolder.this.f12389r).mo23326b1();
                C4315y.m12185b();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter$ViewHolder$k */
        class C5880k implements View.OnClickListener {
            C5880k() {
            }

            public void onClick(View view) {
                ((C5972a) ViewHolder.this.f12389r).mo23334l1();
                C4315y.m12185b();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter$ViewHolder$l */
        class C5881l implements View.OnClickListener {
            C5881l() {
            }

            public void onClick(View view) {
                ViewHolder.this.f12379h.mo10084B(true);
                if (ViewHolder.this.f12389r.mo23331k0()) {
                    ViewHolder.this.f12389r.mo23342r();
                }
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter$ViewHolder$m */
        class C5882m implements View.OnClickListener {
            C5882m() {
            }

            public void onClick(View view) {
                ViewHolder.this.f12389r.mo23337n();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter$ViewHolder$n */
        class C5883n implements View.OnClickListener {
            C5883n() {
            }

            public void onClick(View view) {
                ((C4200i) ViewHolder.this.f12389r).mo23326b1();
                C4315y.m12185b();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter$ViewHolder$o */
        class C5884o implements View.OnClickListener {
            C5884o() {
            }

            public void onClick(View view) {
                ((C4200i) ViewHolder.this.f12389r).mo23334l1();
                C4315y.m12185b();
            }
        }

        public ViewHolder(View view) {
            super(view);
            this.f12372a = view;
            this.f12388q = view.getContext();
            this.f12376e = (ImageView) view.findViewById(2131296604);
            this.f12375d = (ImageView) view.findViewById(2131296583);
            this.f12373b = (TextView) view.findViewById(2131296596);
            this.f12374c = (TextView) view.findViewById(2131296603);
            this.f12377f = (ImageView) view.findViewById(2131296793);
            this.f12378g = (ImageView) view.findViewById(2131296794);
            this.f12379h = (SwipeRevealLayout) view.findViewById(2131297369);
            this.f12380i = (FrameLayout) view.findViewById(C11745R$id.device_card_view);
            this.f12381j = (LinearLayout) view.findViewById(2131296915);
            this.f12382k = view.findViewById(C11745R$id.fl_switch);
            this.f12383l = view.findViewById(C11745R$id.ll_curtain);
            this.f12384m = (ImageView) view.findViewById(C11745R$id.btn_curtain_open);
            this.f12385n = (ImageView) view.findViewById(C11745R$id.btn_curtain_close);
            this.f12386o = (ProgressBar) view.findViewById(C11745R$id.device_connecting_progress);
        }

        /* renamed from: i */
        private void m17325i() {
            View.OnClickListener onClickListener;
            ImageView imageView;
            View.OnClickListener onClickListener2;
            ImageView imageView2;
            this.f12382k.setVisibility(0);
            this.f12383l.setVisibility(8);
            this.f12377f.setImageResource(C11744R$drawable.common_list_side_unbind);
            this.f12377f.setOnClickListener(new C5878i());
            this.f12376e.setOnClickListener((View.OnClickListener) null);
            if (this.f12389r.mo23416o0() || this.f12389r.mo23420r0()) {
                if (this.f12389r.mo23331k0() || this.f12389r.mo23420r0()) {
                    this.f12377f.setEnabled(true);
                    this.f12376e.setVisibility(0);
                    if (this.f12389r.mo23408d0().mo27681c0()) {
                        this.f12376e.setImageResource(C11744R$drawable.control_view_state_on_bg);
                        imageView2 = this.f12376e;
                        onClickListener2 = new C5879j();
                    } else {
                        this.f12376e.setImageResource(C11744R$drawable.control_view_state_off_bg);
                        imageView2 = this.f12376e;
                        onClickListener2 = new C5880k();
                    }
                    imageView2.setOnClickListener(onClickListener2);
                    imageView = this.f12377f;
                    onClickListener = new C5881l();
                } else if (this.f12389r.mo23335m0()) {
                    this.f12377f.setEnabled(false);
                    this.f12376e.setVisibility(0);
                    this.f12376e.setImageResource(C11744R$drawable.common_list_side_bind);
                    imageView = this.f12376e;
                    onClickListener = new C5882m();
                } else if (this.f12389r.mo23333l0()) {
                    this.f12376e.setVisibility(4);
                    this.f12386o.setVisibility(0);
                    return;
                } else {
                    return;
                }
                imageView.setOnClickListener(onClickListener);
                return;
            }
            this.f12377f.setEnabled(false);
            this.f12376e.setVisibility(4);
        }

        /* renamed from: j */
        private void m17326j() {
            C5928a aVar;
            ImageView imageView;
            this.f12377f.setImageResource(2131230974);
            if (this.f12389r.mo23399W() == Device.Ownership.OTHERS) {
                this.f12381j.setVisibility(8);
            }
            if (this.f12389r.mo23331k0()) {
                this.f12382k.setVisibility(8);
                this.f12383l.setVisibility(0);
                this.f12384m.setOnClickListener(new C5929b(this));
                imageView = this.f12385n;
                aVar = new C5928a(this);
            } else {
                this.f12382k.setVisibility(0);
                this.f12383l.setVisibility(8);
                this.f12376e.setVisibility(4);
                imageView = this.f12376e;
                aVar = null;
            }
            imageView.setOnClickListener(aVar);
            this.f12377f.setOnClickListener(new C5870b());
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public void m17327k() {
            String str;
            TextView textView;
            int i;
            Resources resources;
            TextView textView2;
            if (C4308b.f7482a) {
                textView = this.f12373b;
                str = this.f12389r.mo23397U() + " : " + this.f12389r.mo23408d0().mo27645J() + ", " + this.f12389r.mo23408d0().mo27649L() + this.f12388q.getString(2131755149);
            } else {
                textView = this.f12373b;
                str = this.f12389r.mo23397U();
            }
            textView.setText(str);
            this.f12374c.setText(this.f12389r.mo23409e0());
            this.f12386o.setVisibility(8);
            if (this.f12389r.mo23416o0()) {
                this.f12373b.setTextColor(this.f12388q.getResources().getColor(2131099837));
                textView2 = this.f12374c;
                resources = this.f12388q.getResources();
                i = 2131099835;
            } else {
                i = 2131099836;
                this.f12373b.setTextColor(this.f12388q.getResources().getColor(2131099836));
                textView2 = this.f12374c;
                resources = this.f12388q.getResources();
            }
            textView2.setTextColor(resources.getColor(i));
            C4198d dVar = this.f12389r;
            if (dVar instanceof C5972a) {
                m17325i();
            } else if (dVar instanceof C7472y) {
                m17326j();
            } else {
                m17328l();
            }
            this.f12380i.setOnClickListener(new C5875g());
            this.f12378g.setImageResource(2131230973);
            this.f12378g.setOnClickListener(new C5876h());
        }

        /* renamed from: l */
        private void m17328l() {
            View.OnClickListener onClickListener;
            ImageView imageView;
            this.f12382k.setVisibility(0);
            this.f12383l.setVisibility(8);
            this.f12377f.setImageResource(2131230974);
            if (this.f12389r.mo23399W() == Device.Ownership.OTHERS) {
                this.f12381j.setVisibility(8);
            }
            if (this.f12389r.mo23331k0()) {
                this.f12376e.setVisibility(0);
                if (this.f12389r.mo23375I().mo29076b(C7628j.C7630b.BTN_POWER)) {
                    if (((C4200i) this.f12389r).mo23332k1()) {
                        this.f12376e.setImageResource(C11744R$drawable.control_view_state_on_bg);
                        imageView = this.f12376e;
                        onClickListener = new C5883n();
                    } else {
                        this.f12376e.setImageResource(C11744R$drawable.control_view_state_off_bg);
                        imageView = this.f12376e;
                        onClickListener = new C5884o();
                    }
                }
                this.f12377f.setOnClickListener(new C5869a());
            }
            this.f12376e.setVisibility(4);
            imageView = this.f12376e;
            onClickListener = null;
            imageView.setOnClickListener(onClickListener);
            this.f12377f.setOnClickListener(new C5869a());
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo27259e() {
            this.f12375d.setImageResource(this.f12389r.mo23303F());
            m17327k();
        }

        /* renamed from: f */
        public /* synthetic */ void mo27260f(View view) {
            C4198d dVar = this.f12389r;
            if (dVar instanceof C7472y) {
                ((C7472y) dVar).mo27624x2(1);
            }
        }

        /* renamed from: g */
        public /* synthetic */ void mo27261g(View view) {
            ((C7472y) this.f12389r).mo27624x2(2);
        }

        /* renamed from: h */
        public void mo27262h(C4198d dVar) {
            C4198d dVar2 = this.f12389r;
            this.f12389r = dVar;
            this.f12387p = dVar.mo23372G();
            if (dVar2 != null) {
                dVar2.mo23400W0(this);
                dVar2.mo23319V0(this);
            }
            C4198d dVar3 = this.f12389r;
            if (dVar3 != null) {
                dVar3.mo23365B0(this);
                this.f12389r.mo23358z0(this);
                mo27259e();
            }
        }

        public void onConnectionStateChanged(int i, int i2) {
            this.f12376e.post(new C5871c(i2));
        }

        public void onLocalConnected() {
            this.f12372a.post(new C5872d());
        }

        public void onLocalDisconnected() {
            this.f12372a.post(new C5873e());
        }

        public void onStatusChange(int i, C6024e eVar) {
            if (i == 1 || i == 2 || i == 2048 || i == 4096 || i == 262144 || i == 8388608) {
                this.f12376e.post(new C5874f());
            }
        }
    }

    public DeviceRecyclerViewAdapter(Context context, Cursor cursor) {
        this(context, cursor, false);
    }

    public DeviceRecyclerViewAdapter(Context context, Cursor cursor, boolean z) {
        super(context, cursor);
        C1261a aVar = new C1261a();
        this.f12369e = aVar;
        this.f12370f = false;
        this.f12371g = false;
        aVar.mo10111h(true);
        setHasStableIds(true);
        this.f12370f = z;
    }

    /* renamed from: g */
    public void mo27124c(ViewHolder viewHolder, Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndex(C7579c.C7580a.C7581a.f15372c));
        C4198d h0 = C4257w.m11945h0(string);
        viewHolder.f12379h.setLockDrag(this.f12370f);
        if (h0 != null) {
            viewHolder.mo27262h(h0);
            if (!this.f12370f) {
                viewHolder.f12379h.requestLayout();
                this.f12369e.mo10109d(viewHolder.f12379h, string);
            }
        }
    }

    /* renamed from: h */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C11748R$layout.fragment_device_item, viewGroup, false));
    }

    /* renamed from: i */
    public void mo27258i(boolean z) {
        this.f12371g = z;
    }
}
