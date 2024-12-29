package com.yeelight.cherry.p141ui.fragment;

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
import com.chauthai.swipereveallayout.C0635a;
import com.chauthai.swipereveallayout.SwipeRevealLayout;
import com.miot.common.device.Device;
import com.yeelight.cherry.C12224R$drawable;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity;
import com.yeelight.cherry.p141ui.activity.DeviceShareActivity;
import com.yeelight.cherry.p141ui.adapter.RecyclerViewCursorAdapter;
import com.yeelight.yeelib.data.C6043b;
import com.yeelight.yeelib.device.C6081a;
import com.yeelight.yeelib.device.C6164e;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.models.ProductModelBase;
import com.yeelight.yeelib.managers.C8287q;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C3284x;
import p170i4.C9113d;
import p223w3.C11911z;
import p237z3.C12143c;
import p237z3.C12145e;

/* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter */
public class DeviceRecyclerViewAdapter extends RecyclerViewCursorAdapter<ViewHolder> {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C0635a f11963e;

    /* renamed from: f */
    private boolean f11964f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f11965g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C5945a f11966h;

    /* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder implements C12143c, C12145e {

        /* renamed from: a */
        public final View f11967a;

        /* renamed from: b */
        public TextView f11968b;

        /* renamed from: c */
        public TextView f11969c;

        /* renamed from: d */
        public ImageView f11970d;

        /* renamed from: e */
        public ImageView f11971e;

        /* renamed from: f */
        public ImageView f11972f;

        /* renamed from: g */
        public ImageView f11973g;

        /* renamed from: h */
        public SwipeRevealLayout f11974h;

        /* renamed from: i */
        public FrameLayout f11975i;

        /* renamed from: j */
        public LinearLayout f11976j;

        /* renamed from: k */
        public View f11977k;

        /* renamed from: l */
        public View f11978l;

        /* renamed from: m */
        public ImageView f11979m;

        /* renamed from: n */
        public ImageView f11980n;

        /* renamed from: o */
        ProgressBar f11981o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public String f11982p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public Context f11983q;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public C3010c f11984r;

        /* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter$ViewHolder$a */
        class C5929a implements View.OnClickListener {
            C5929a() {
            }

            public void onClick(View view) {
                if (C8287q.m19593e().mo35242i()) {
                    Toast.makeText(view.getContext(), view.getResources().getString(2131756170), 0).show();
                    return;
                }
                Intent intent = new Intent();
                intent.setClass(ViewHolder.this.f11983q, DeviceShareActivity.class);
                intent.putExtra("com.yeelight.cherry.device_id", ViewHolder.this.f11982p);
                ViewHolder.this.f11983q.startActivity(intent);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter$ViewHolder$b */
        class C5930b implements View.OnClickListener {
            C5930b() {
            }

            public void onClick(View view) {
                if (C8287q.m19593e().mo35242i()) {
                    Toast.makeText(view.getContext(), view.getResources().getString(2131756170), 0).show();
                    return;
                }
                Intent intent = new Intent();
                intent.setClass(ViewHolder.this.f11983q, DeviceShareActivity.class);
                intent.putExtra("com.yeelight.cherry.device_id", ViewHolder.this.f11982p);
                ViewHolder.this.f11983q.startActivity(intent);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter$ViewHolder$c */
        class C5931c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f11988a;

            C5931c(int i) {
                this.f11988a = i;
            }

            public void run() {
                ViewHolder.this.m17376m();
                if (this.f11988a == 5 && DeviceRecyclerViewAdapter.this.f11965g) {
                    Intent intent = new Intent(ViewHolder.this.f11983q, BluetoothConnectNewActivity.class);
                    intent.putExtra("com.yeelight.cherry.device_id", ViewHolder.this.f11982p);
                    ViewHolder.this.f11983q.startActivity(intent);
                }
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter$ViewHolder$d */
        class C5932d implements Runnable {
            C5932d() {
            }

            public void run() {
                ViewHolder.this.m17376m();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter$ViewHolder$e */
        class C5933e implements Runnable {
            C5933e() {
            }

            public void run() {
                ViewHolder.this.m17376m();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter$ViewHolder$f */
        class C5934f implements Runnable {
            C5934f() {
            }

            public void run() {
                ViewHolder.this.m17376m();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter$ViewHolder$g */
        class C5935g implements View.OnClickListener {
            C5935g() {
            }

            public void onClick(View view) {
                if (C8287q.m19593e().mo35242i()) {
                    Toast.makeText(view.getContext(), view.getResources().getString(2131756170), 0).show();
                } else if ((!(ViewHolder.this.f11984r instanceof C6081a) && !(ViewHolder.this.f11984r instanceof C6164e)) || (DeviceRecyclerViewAdapter.this.f11966h != null && DeviceRecyclerViewAdapter.this.f11966h.mo31241a())) {
                    ViewHolder.this.f11984r.mo23161u0(view);
                }
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter$ViewHolder$h */
        class C5936h implements View.OnClickListener {

            /* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter$ViewHolder$h$a */
            class C5937a implements DialogInterface.OnClickListener {
                C5937a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    DeviceRecyclerViewAdapter.this.f11963e.mo11088e(ViewHolder.this.f11982p);
                    ViewHolder.this.f11984r.mo23131U0();
                    dialogInterface.dismiss();
                }
            }

            C5936h() {
            }

            public void onClick(View view) {
                if (C8287q.m19593e().mo35242i()) {
                    Toast.makeText(view.getContext(), view.getResources().getString(2131756170), 0).show();
                    return;
                }
                C9113d.C9118e eVar = new C9113d.C9118e(view.getContext());
                eVar.mo37179i(view.getContext().getString(2131755247)).mo37177g(view.getContext().getString(2131755439)).mo37174d(-2, view.getContext().getString(2131755232), (DialogInterface.OnClickListener) null).mo37174d(-1, view.getContext().getString(2131755281), new C5937a());
                eVar.mo37180j();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter$ViewHolder$i */
        class C5938i implements View.OnClickListener {
            C5938i() {
            }

            public void onClick(View view) {
                ViewHolder.this.f11984r.mo23156r();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter$ViewHolder$j */
        class C5939j implements View.OnClickListener {
            C5939j() {
            }

            public void onClick(View view) {
                ((C6081a) ViewHolder.this.f11984r).mo23140b1();
                C3284x.m8852b();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter$ViewHolder$k */
        class C5940k implements View.OnClickListener {
            C5940k() {
            }

            public void onClick(View view) {
                ((C6081a) ViewHolder.this.f11984r).mo23148l1();
                C3284x.m8852b();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter$ViewHolder$l */
        class C5941l implements View.OnClickListener {
            C5941l() {
            }

            public void onClick(View view) {
                ViewHolder.this.f11974h.mo11062B(true);
                if (ViewHolder.this.f11984r.mo23145k0()) {
                    ViewHolder.this.f11984r.mo23156r();
                }
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter$ViewHolder$m */
        class C5942m implements View.OnClickListener {
            C5942m() {
            }

            public void onClick(View view) {
                ViewHolder.this.f11984r.mo23151n();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter$ViewHolder$n */
        class C5943n implements View.OnClickListener {
            C5943n() {
            }

            public void onClick(View view) {
                ((C3012e) ViewHolder.this.f11984r).mo23140b1();
                C3284x.m8852b();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter$ViewHolder$o */
        class C5944o implements View.OnClickListener {
            C5944o() {
            }

            public void onClick(View view) {
                ((C3012e) ViewHolder.this.f11984r).mo23148l1();
                C3284x.m8852b();
            }
        }

        public ViewHolder(View view) {
            super(view);
            this.f11967a = view;
            this.f11983q = view.getContext();
            this.f11971e = (ImageView) view.findViewById(2131296682);
            this.f11970d = (ImageView) view.findViewById(2131296661);
            this.f11968b = (TextView) view.findViewById(2131296674);
            this.f11969c = (TextView) view.findViewById(2131296681);
            this.f11972f = (ImageView) view.findViewById(2131296897);
            this.f11973g = (ImageView) view.findViewById(2131296898);
            this.f11974h = (SwipeRevealLayout) view.findViewById(2131297525);
            this.f11975i = (FrameLayout) view.findViewById(C12225R$id.device_card_view);
            this.f11976j = (LinearLayout) view.findViewById(2131297026);
            this.f11977k = view.findViewById(C12225R$id.fl_switch);
            this.f11978l = view.findViewById(C12225R$id.ll_curtain);
            this.f11979m = (ImageView) view.findViewById(C12225R$id.btn_curtain_open);
            this.f11980n = (ImageView) view.findViewById(C12225R$id.btn_curtain_close);
            this.f11981o = (ProgressBar) view.findViewById(C12225R$id.device_connecting_progress);
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m17372h(View view) {
            C3010c cVar = this.f11984r;
            if (cVar instanceof C11911z) {
                ((C11911z) cVar).mo41877x2(1);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m17373i(View view) {
            ((C11911z) this.f11984r).mo41877x2(2);
        }

        /* renamed from: k */
        private void m17374k() {
            View.OnClickListener onClickListener;
            ImageView imageView;
            View.OnClickListener onClickListener2;
            ImageView imageView2;
            this.f11977k.setVisibility(0);
            this.f11978l.setVisibility(8);
            this.f11972f.setImageResource(C12224R$drawable.common_list_side_unbind);
            this.f11972f.setOnClickListener(new C5938i());
            this.f11971e.setOnClickListener((View.OnClickListener) null);
            if (this.f11984r.mo23230o0() || this.f11984r.mo23234r0()) {
                if (this.f11984r.mo23145k0() || this.f11984r.mo23234r0()) {
                    this.f11972f.setEnabled(true);
                    this.f11971e.setVisibility(0);
                    if (this.f11984r.mo23221d0().mo31584d0()) {
                        this.f11971e.setImageResource(C12224R$drawable.control_view_state_on_bg);
                        imageView2 = this.f11971e;
                        onClickListener2 = new C5939j();
                    } else {
                        this.f11971e.setImageResource(C12224R$drawable.control_view_state_off_bg);
                        imageView2 = this.f11971e;
                        onClickListener2 = new C5940k();
                    }
                    imageView2.setOnClickListener(onClickListener2);
                    imageView = this.f11972f;
                    onClickListener = new C5941l();
                } else if (this.f11984r.mo23149m0()) {
                    this.f11972f.setEnabled(false);
                    this.f11971e.setVisibility(0);
                    this.f11971e.setImageResource(C12224R$drawable.common_list_side_bind);
                    imageView = this.f11971e;
                    onClickListener = new C5942m();
                } else if (this.f11984r.mo23147l0()) {
                    this.f11971e.setVisibility(4);
                    this.f11981o.setVisibility(0);
                    return;
                } else {
                    return;
                }
                imageView.setOnClickListener(onClickListener);
                return;
            }
            this.f11972f.setEnabled(false);
            this.f11971e.setVisibility(4);
        }

        /* renamed from: l */
        private void m17375l() {
            C5990b bVar;
            ImageView imageView;
            this.f11972f.setImageResource(2131230988);
            if (this.f11984r.mo23212W() == Device.Ownership.OTHERS) {
                this.f11976j.setVisibility(8);
            }
            if (this.f11984r.mo23145k0()) {
                this.f11977k.setVisibility(8);
                this.f11978l.setVisibility(0);
                this.f11979m.setOnClickListener(new C5988a(this));
                imageView = this.f11980n;
                bVar = new C5990b(this);
            } else {
                this.f11977k.setVisibility(0);
                this.f11978l.setVisibility(8);
                this.f11971e.setVisibility(4);
                imageView = this.f11971e;
                bVar = null;
            }
            imageView.setOnClickListener(bVar);
            this.f11972f.setOnClickListener(new C5930b());
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public void m17376m() {
            String str;
            TextView textView;
            int i;
            Resources resources;
            TextView textView2;
            if (AppUtils.f4977a) {
                textView = this.f11968b;
                str = this.f11984r.mo23210U() + " : " + this.f11984r.mo23221d0().mo31546K() + ", " + this.f11984r.mo23221d0().mo31550M() + this.f11983q.getString(2131755150);
            } else {
                textView = this.f11968b;
                str = this.f11984r.mo23210U();
            }
            textView.setText(str);
            this.f11969c.setText(this.f11984r.mo23222e0());
            this.f11981o.setVisibility(8);
            if (this.f11984r.mo23230o0()) {
                this.f11968b.setTextColor(this.f11983q.getResources().getColor(2131099840));
                textView2 = this.f11969c;
                resources = this.f11983q.getResources();
                i = 2131099838;
            } else {
                i = 2131099839;
                this.f11968b.setTextColor(this.f11983q.getResources().getColor(2131099839));
                textView2 = this.f11969c;
                resources = this.f11983q.getResources();
            }
            textView2.setTextColor(resources.getColor(i));
            C3010c cVar = this.f11984r;
            if (cVar instanceof C6081a) {
                m17374k();
            } else if (cVar instanceof C11911z) {
                m17375l();
            } else {
                m17377n();
            }
            this.f11975i.setOnClickListener(new C5935g());
            this.f11973g.setImageResource(2131230987);
            this.f11973g.setOnClickListener(new C5936h());
        }

        /* renamed from: n */
        private void m17377n() {
            View.OnClickListener onClickListener;
            ImageView imageView;
            this.f11977k.setVisibility(0);
            this.f11978l.setVisibility(8);
            this.f11972f.setImageResource(2131230988);
            if (this.f11984r.mo23212W() == Device.Ownership.OTHERS) {
                this.f11976j.setVisibility(8);
            }
            if (this.f11984r.mo23145k0()) {
                this.f11971e.setVisibility(0);
                if (this.f11984r.mo23188I().mo31881b(ProductModelBase.CapabilityType.BTN_POWER)) {
                    if (((C3012e) this.f11984r).mo23146k1()) {
                        this.f11971e.setImageResource(C12224R$drawable.control_view_state_on_bg);
                        imageView = this.f11971e;
                        onClickListener = new C5943n();
                    } else {
                        this.f11971e.setImageResource(C12224R$drawable.control_view_state_off_bg);
                        imageView = this.f11971e;
                        onClickListener = new C5944o();
                    }
                }
                this.f11972f.setOnClickListener(new C5929a());
            }
            this.f11971e.setVisibility(4);
            imageView = this.f11971e;
            onClickListener = null;
            imageView.setOnClickListener(onClickListener);
            this.f11972f.setOnClickListener(new C5929a());
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo31223g() {
            this.f11970d.setImageResource(this.f11984r.mo23116F());
            m17376m();
        }

        /* renamed from: j */
        public void mo31224j(C3010c cVar) {
            C3010c cVar2 = this.f11984r;
            this.f11984r = cVar;
            this.f11982p = cVar.mo23185G();
            if (cVar2 != null) {
                cVar2.mo23213W0(this);
                cVar2.mo23133V0(this);
            }
            C3010c cVar3 = this.f11984r;
            if (cVar3 != null) {
                cVar3.mo23178B0(this);
                this.f11984r.mo23171z0(this);
                mo31223g();
            }
        }

        public void onConnectionStateChanged(int i, int i2) {
            this.f11971e.post(new C5931c(i2));
        }

        public void onLocalConnected() {
            this.f11967a.post(new C5932d());
        }

        public void onLocalDisconnected() {
            this.f11967a.post(new C5933e());
        }

        public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
            if (i == 1 || i == 2 || i == 2048 || i == 4096 || i == 262144 || i == 8388608) {
                this.f11971e.post(new C5934f());
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.DeviceRecyclerViewAdapter$a */
    public interface C5945a {
        /* renamed from: a */
        boolean mo31241a();
    }

    public DeviceRecyclerViewAdapter(Context context, Cursor cursor) {
        this(context, cursor, false);
    }

    public DeviceRecyclerViewAdapter(Context context, Cursor cursor, boolean z) {
        super(context, cursor);
        C0635a aVar = new C0635a();
        this.f11963e = aVar;
        this.f11964f = false;
        this.f11965g = false;
        aVar.mo11089h(true);
        setHasStableIds(true);
        this.f11964f = z;
    }

    /* renamed from: h */
    public void mo31093c(ViewHolder viewHolder, Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndex(C6043b.C6044a.C6045a.f12331c));
        C3010c j0 = YeelightDeviceManager.m7794j0(string);
        viewHolder.f11974h.setLockDrag(this.f11964f);
        if (j0 != null) {
            viewHolder.mo31224j(j0);
            if (!this.f11964f) {
                viewHolder.f11974h.requestLayout();
                this.f11963e.mo11087d(viewHolder.f11974h, string);
            }
        }
    }

    /* renamed from: i */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C12228R$layout.fragment_device_item, viewGroup, false));
    }

    /* renamed from: j */
    public void mo31221j(C5945a aVar) {
        this.f11966h = aVar;
    }

    /* renamed from: k */
    public void mo31222k(boolean z) {
        this.f11965g = z;
    }
}
