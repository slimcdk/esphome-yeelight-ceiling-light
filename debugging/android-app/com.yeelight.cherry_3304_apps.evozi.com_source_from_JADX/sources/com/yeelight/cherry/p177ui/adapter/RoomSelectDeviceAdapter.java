package com.yeelight.cherry.p177ui.adapter;

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
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.data.C7579c;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p152f.C9812t;
import com.yeelight.yeelib.p190i.C9875a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter */
public class RoomSelectDeviceAdapter extends RecyclerViewCursorAdapter<C5858c> {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List<String> f12321e = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C5857b f12322f;

    /* renamed from: com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter$a */
    class C5855a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5858c f12323a;

        /* renamed from: b */
        final /* synthetic */ String f12324b;

        /* renamed from: c */
        final /* synthetic */ C4198d f12325c;

        /* renamed from: com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter$a$a */
        class C5856a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f12327a;

            C5856a(int i) {
                this.f12327a = i;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                RoomSelectDeviceAdapter.this.f12321e.add(C5855a.this.f12324b);
                if (RoomSelectDeviceAdapter.this.f12322f != null) {
                    RoomSelectDeviceAdapter.this.f12322f.mo26279a(RoomSelectDeviceAdapter.this.f12321e);
                }
                dialogInterface.dismiss();
                RoomSelectDeviceAdapter.this.notifyItemChanged(this.f12327a);
            }
        }

        C5855a(C5858c cVar, String str, C4198d dVar) {
            this.f12323a = cVar;
            this.f12324b = str;
            this.f12325c = dVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x00bf, code lost:
            if (com.yeelight.cherry.p177ui.adapter.RoomSelectDeviceAdapter.m17290f(r6.f12326d) != null) goto L_0x0027;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
            if (com.yeelight.cherry.p177ui.adapter.RoomSelectDeviceAdapter.m17290f(r6.f12326d) != null) goto L_0x0027;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r7) {
            /*
                r6 = this;
                com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter$c r7 = r6.f12323a
                int r7 = r7.getAdapterPosition()
                com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter r0 = com.yeelight.cherry.p177ui.adapter.RoomSelectDeviceAdapter.this
                java.util.List r0 = r0.f12321e
                java.lang.String r1 = r6.f12324b
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto L_0x0038
                com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter r0 = com.yeelight.cherry.p177ui.adapter.RoomSelectDeviceAdapter.this
                java.util.List r0 = r0.f12321e
                java.lang.String r1 = r6.f12324b
                r0.remove(r1)
                com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter r0 = com.yeelight.cherry.p177ui.adapter.RoomSelectDeviceAdapter.this
                com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter$b r0 = r0.f12322f
                if (r0 == 0) goto L_0x00c3
            L_0x0027:
                com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter r0 = com.yeelight.cherry.p177ui.adapter.RoomSelectDeviceAdapter.this
                com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter$b r0 = r0.f12322f
                com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter r1 = com.yeelight.cherry.p177ui.adapter.RoomSelectDeviceAdapter.this
                java.util.List r1 = r1.f12321e
                r0.mo26279a(r1)
                goto L_0x00c3
            L_0x0038:
                com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter$c r0 = r6.f12323a
                android.view.View r0 = r0.itemView
                android.content.res.Resources r0 = r0.getResources()
                com.yeelight.yeelib.f.t r1 = com.yeelight.yeelib.p152f.C9812t.m23832j()
                com.yeelight.yeelib.c.i.d r2 = r6.f12325c
                java.lang.String r2 = r2.mo23404Z()
                com.yeelight.yeelib.i.a r1 = r1.mo31686m(r2)
                if (r1 == 0) goto L_0x00ae
                boolean r2 = r1.mo31959t()
                if (r2 != 0) goto L_0x00ae
                com.yeelight.yeelib.ui.widget.e$e r2 = new com.yeelight.yeelib.ui.widget.e$e
                com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter$c r3 = r6.f12323a
                android.view.View r3 = r3.itemView
                android.content.Context r3 = r3.getContext()
                r2.<init>(r3)
                com.yeelight.yeelib.c.i.d r3 = r6.f12325c
                int r3 = r3.mo23306H()
                r2.mo33352c(r3)
                r3 = 2131756161(0x7f100481, float:1.9143222E38)
                java.lang.String r3 = r0.getString(r3)
                r2.mo33358i(r3)
                r3 = 2131756162(0x7f100482, float:1.9143224E38)
                r4 = 1
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r5 = 0
                java.lang.String r1 = r1.mo31954o()
                r4[r5] = r1
                java.lang.String r1 = r0.getString(r3, r4)
                r2.mo33356g(r1)
                r1 = -2
                r3 = 2131755229(0x7f1000dd, float:1.9141331E38)
                java.lang.String r3 = r0.getString(r3)
                r4 = 0
                r2.mo33353d(r1, r3, r4)
                r1 = -1
                r3 = 2131755277(0x7f10010d, float:1.9141429E38)
                java.lang.String r0 = r0.getString(r3)
                com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter$a$a r3 = new com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter$a$a
                r3.<init>(r7)
                r2.mo33353d(r1, r0, r3)
                com.yeelight.yeelib.ui.widget.e r7 = r2.mo33351b()
                r7.show()
                return
            L_0x00ae:
                com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter r0 = com.yeelight.cherry.p177ui.adapter.RoomSelectDeviceAdapter.this
                java.util.List r0 = r0.f12321e
                java.lang.String r1 = r6.f12324b
                r0.add(r1)
                com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter r0 = com.yeelight.cherry.p177ui.adapter.RoomSelectDeviceAdapter.this
                com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter$b r0 = r0.f12322f
                if (r0 == 0) goto L_0x00c3
                goto L_0x0027
            L_0x00c3:
                com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter r0 = com.yeelight.cherry.p177ui.adapter.RoomSelectDeviceAdapter.this
                r0.notifyItemChanged(r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.adapter.RoomSelectDeviceAdapter.C5855a.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter$b */
    public interface C5857b {
        /* renamed from: a */
        void mo26279a(List<String> list);
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.RoomSelectDeviceAdapter$c */
    class C5858c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ImageView f12329a;

        /* renamed from: b */
        TextView f12330b;

        /* renamed from: c */
        TextView f12331c;

        /* renamed from: d */
        CheckBox f12332d;

        public C5858c(View view) {
            super(view);
            this.f12329a = (ImageView) view.findViewById(2131296581);
            this.f12330b = (TextView) view.findViewById(2131296596);
            this.f12331c = (TextView) view.findViewById(2131297362);
            CheckBox checkBox = (CheckBox) view.findViewById(2131296471);
            this.f12332d = checkBox;
            checkBox.setClickable(false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo27238a(C4198d dVar) {
            int i;
            Resources resources;
            TextView textView;
            TextView textView2;
            int color;
            this.f12329a.setImageResource(dVar.mo23306H());
            this.f12330b.setText(dVar.mo23397U());
            if (dVar.mo23416o0()) {
                textView = this.f12330b;
                resources = C4297y.f7456e.getResources();
                i = 2131099837;
            } else {
                textView = this.f12330b;
                resources = C4297y.f7456e.getResources();
                i = 2131099836;
            }
            textView.setTextColor(resources.getColor(i));
            this.f12332d.setChecked(RoomSelectDeviceAdapter.this.f12321e.contains(dVar.mo23372G()));
            Resources resources2 = this.f12331c.getResources();
            if (RoomSelectDeviceAdapter.this.f12321e.contains(dVar.mo23372G())) {
                this.f12331c.setText(2131756155);
            } else {
                C9875a m = C9812t.m23832j().mo31686m(dVar.mo23404Z());
                if (m == null || m.mo31959t()) {
                    this.f12331c.setText(resources2.getString(2131756163));
                    textView2 = this.f12331c;
                    color = textView2.getResources().getColor(2131099839);
                    textView2.setTextColor(color);
                }
                String o = m.mo31954o();
                this.f12331c.setText(resources2.getString(2131756160, new Object[]{o}));
            }
            textView2 = this.f12331c;
            color = textView2.getResources().getColor(2131099838);
            textView2.setTextColor(color);
        }
    }

    public RoomSelectDeviceAdapter(Context context, Cursor cursor) {
        super(context, cursor);
    }

    /* renamed from: g */
    public List<String> mo27232g() {
        return this.f12321e;
    }

    /* renamed from: h */
    public void mo27124c(C5858c cVar, Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndex(C7579c.C7580a.C7581a.f15372c));
        C4198d h0 = C4257w.m11945h0(string);
        if (h0 != null) {
            cVar.mo27238a(h0);
        }
        cVar.itemView.setOnClickListener(new C5855a(cVar, string, h0));
    }

    /* renamed from: i */
    public C5858c onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C5858c(LayoutInflater.from(viewGroup.getContext()).inflate(C11748R$layout.item_create_room_select_device, viewGroup, false));
    }

    /* renamed from: j */
    public void mo27235j(C5857b bVar) {
        this.f12322f = bVar;
    }
}
