package com.yeelight.cherry.p141ui.adapter;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.data.C6043b;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.managers.C8293t;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import java.util.ArrayList;
import java.util.List;
import p145d4.C8937a;

/* renamed from: com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter */
public class RoomSelectDeviceAdapter extends RecyclerViewCursorAdapter<C5921c> {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List<String> f11922e = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C5920b f11923f;

    /* renamed from: com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter$a */
    class C5918a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5921c f11924a;

        /* renamed from: b */
        final /* synthetic */ String f11925b;

        /* renamed from: c */
        final /* synthetic */ C3010c f11926c;

        /* renamed from: com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter$a$a */
        class C5919a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f11928a;

            C5919a(int i) {
                this.f11928a = i;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                RoomSelectDeviceAdapter.this.f11922e.add(C5918a.this.f11925b);
                if (RoomSelectDeviceAdapter.this.f11923f != null) {
                    RoomSelectDeviceAdapter.this.f11923f.mo30325a(RoomSelectDeviceAdapter.this.f11922e);
                }
                dialogInterface.dismiss();
                RoomSelectDeviceAdapter.this.notifyItemChanged(this.f11928a);
            }
        }

        C5918a(C5921c cVar, String str, C3010c cVar2) {
            this.f11924a = cVar;
            this.f11925b = str;
            this.f11926c = cVar2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x00c4, code lost:
            if (com.yeelight.cherry.p141ui.adapter.RoomSelectDeviceAdapter.m17333f(r6.f11927d) != null) goto L_0x0027;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
            if (com.yeelight.cherry.p141ui.adapter.RoomSelectDeviceAdapter.m17333f(r6.f11927d) != null) goto L_0x0027;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r7) {
            /*
                r6 = this;
                com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter$c r7 = r6.f11924a
                int r7 = r7.getAdapterPosition()
                com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter r0 = com.yeelight.cherry.p141ui.adapter.RoomSelectDeviceAdapter.this
                java.util.List r0 = r0.f11922e
                java.lang.String r1 = r6.f11925b
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto L_0x0038
                com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter r0 = com.yeelight.cherry.p141ui.adapter.RoomSelectDeviceAdapter.this
                java.util.List r0 = r0.f11922e
                java.lang.String r1 = r6.f11925b
                r0.remove(r1)
                com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter r0 = com.yeelight.cherry.p141ui.adapter.RoomSelectDeviceAdapter.this
                com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter$b r0 = r0.f11923f
                if (r0 == 0) goto L_0x00c8
            L_0x0027:
                com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter r0 = com.yeelight.cherry.p141ui.adapter.RoomSelectDeviceAdapter.this
                com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter$b r0 = r0.f11923f
                com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter r1 = com.yeelight.cherry.p141ui.adapter.RoomSelectDeviceAdapter.this
                java.util.List r1 = r1.f11922e
                r0.mo30325a(r1)
                goto L_0x00c8
            L_0x0038:
                com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter$c r0 = r6.f11924a
                android.view.View r0 = r0.itemView
                android.content.res.Resources r0 = r0.getResources()
                com.yeelight.yeelib.managers.t r1 = com.yeelight.yeelib.managers.C8293t.m19620n()
                com.yeelight.yeelib.device.base.c r2 = r6.f11926c
                java.lang.String r2 = r2.mo23217Z()
                d4.a r1 = r1.mo35256p(r2)
                if (r1 == 0) goto L_0x00b3
                boolean r2 = r1.mo36728t()
                if (r2 != 0) goto L_0x00b3
                i4.d$e r2 = new i4.d$e
                com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter$c r3 = r6.f11924a
                android.view.View r3 = r3.itemView
                android.content.Context r3 = r3.getContext()
                r2.<init>(r3)
                com.yeelight.yeelib.device.base.c r3 = r6.f11926c
                int r3 = r3.mo23119H()
                i4.d$e r2 = r2.mo37173c(r3)
                r3 = 2131756185(0x7f100499, float:1.914327E38)
                java.lang.String r3 = r0.getString(r3)
                i4.d$e r2 = r2.mo37179i(r3)
                r3 = 2131756186(0x7f10049a, float:1.9143272E38)
                r4 = 1
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r5 = 0
                java.lang.String r1 = r1.mo36723o()
                r4[r5] = r1
                java.lang.String r1 = r0.getString(r3, r4)
                i4.d$e r1 = r2.mo37177g(r1)
                r2 = -2
                r3 = 2131755232(0x7f1000e0, float:1.9141337E38)
                java.lang.String r3 = r0.getString(r3)
                r4 = 0
                i4.d$e r1 = r1.mo37174d(r2, r3, r4)
                r2 = -1
                r3 = 2131755281(0x7f100111, float:1.9141437E38)
                java.lang.String r0 = r0.getString(r3)
                com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter$a$a r3 = new com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter$a$a
                r3.<init>(r7)
                i4.d$e r7 = r1.mo37174d(r2, r0, r3)
                i4.d r7 = r7.mo37172b()
                r7.show()
                return
            L_0x00b3:
                com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter r0 = com.yeelight.cherry.p141ui.adapter.RoomSelectDeviceAdapter.this
                java.util.List r0 = r0.f11922e
                java.lang.String r1 = r6.f11925b
                r0.add(r1)
                com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter r0 = com.yeelight.cherry.p141ui.adapter.RoomSelectDeviceAdapter.this
                com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter$b r0 = r0.f11923f
                if (r0 == 0) goto L_0x00c8
                goto L_0x0027
            L_0x00c8:
                com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter r0 = com.yeelight.cherry.p141ui.adapter.RoomSelectDeviceAdapter.this
                r0.notifyItemChanged(r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.adapter.RoomSelectDeviceAdapter.C5918a.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter$b */
    public interface C5920b {
        /* renamed from: a */
        void mo30325a(List<String> list);
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter$c */
    class C5921c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ImageView f11930a;

        /* renamed from: b */
        TextView f11931b;

        /* renamed from: c */
        TextView f11932c;

        /* renamed from: d */
        CheckBox f11933d;

        public C5921c(View view) {
            super(view);
            this.f11930a = (ImageView) view.findViewById(2131296659);
            this.f11931b = (TextView) view.findViewById(2131296674);
            this.f11932c = (TextView) view.findViewById(2131297517);
            CheckBox checkBox = (CheckBox) view.findViewById(2131296536);
            this.f11933d = checkBox;
            checkBox.setClickable(false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo31203a(C3010c cVar) {
            int i;
            Resources resources;
            TextView textView;
            TextView textView2;
            int color;
            this.f11930a.setImageResource(cVar.mo23119H());
            this.f11931b.setText(cVar.mo23210U());
            if (cVar.mo23230o0()) {
                textView = this.f11931b;
                resources = C3108x.f4951e.getResources();
                i = 2131099840;
            } else {
                textView = this.f11931b;
                resources = C3108x.f4951e.getResources();
                i = 2131099839;
            }
            textView.setTextColor(resources.getColor(i));
            this.f11933d.setChecked(RoomSelectDeviceAdapter.this.f11922e.contains(cVar.mo23185G()));
            Resources resources2 = this.f11932c.getResources();
            if (RoomSelectDeviceAdapter.this.f11922e.contains(cVar.mo23185G())) {
                this.f11932c.setText(2131756179);
            } else {
                C8937a p = C8293t.m19620n().mo35256p(cVar.mo23217Z());
                if (p == null || p.mo36728t()) {
                    this.f11932c.setText(resources2.getString(2131756187));
                    textView2 = this.f11932c;
                    color = textView2.getResources().getColor(2131099842);
                    textView2.setTextColor(color);
                }
                String o = p.mo36723o();
                this.f11932c.setText(resources2.getString(2131756184, new Object[]{o}));
            }
            textView2 = this.f11932c;
            color = textView2.getResources().getColor(2131099841);
            textView2.setTextColor(color);
        }
    }

    public RoomSelectDeviceAdapter(Context context, Cursor cursor) {
        super(context, cursor);
    }

    /* renamed from: g */
    public List<String> mo31197g() {
        return this.f11922e;
    }

    /* renamed from: h */
    public void mo31093c(C5921c cVar, Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndex(C6043b.C6044a.C6045a.f12331c));
        C3010c j0 = YeelightDeviceManager.m7794j0(string);
        if (j0 != null) {
            cVar.mo31203a(j0);
        }
        cVar.itemView.setOnClickListener(new C5918a(cVar, string, j0));
    }

    /* renamed from: i */
    public C5921c onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C5921c(LayoutInflater.from(viewGroup.getContext()).inflate(C12228R$layout.item_create_room_select_device, viewGroup, false));
    }

    /* renamed from: j */
    public void mo31200j(C5920b bVar) {
        this.f11923f = bVar;
    }
}
