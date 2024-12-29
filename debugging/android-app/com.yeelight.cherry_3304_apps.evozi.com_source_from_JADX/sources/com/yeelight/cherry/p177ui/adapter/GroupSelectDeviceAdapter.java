package com.yeelight.cherry.p177ui.adapter;

import android.content.Context;
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
import com.yeelight.yeelib.p150c.p151i.C6039j;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C4297y;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.adapter.GroupSelectDeviceAdapter */
public class GroupSelectDeviceAdapter extends RecyclerViewCursorAdapter<C5816c> {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List<String> f12153e = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C5815b f12154f;

    /* renamed from: com.yeelight.cherry.ui.adapter.GroupSelectDeviceAdapter$a */
    class C5814a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5816c f12155a;

        /* renamed from: b */
        final /* synthetic */ String f12156b;

        C5814a(C5816c cVar, String str) {
            this.f12155a = cVar;
            this.f12156b = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
            if (com.yeelight.cherry.p177ui.adapter.GroupSelectDeviceAdapter.m17205f(r2.f12157c) != null) goto L_0x003b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0039, code lost:
            if (com.yeelight.cherry.p177ui.adapter.GroupSelectDeviceAdapter.m17205f(r2.f12157c) != null) goto L_0x003b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                com.yeelight.cherry.ui.adapter.GroupSelectDeviceAdapter$c r3 = r2.f12155a
                int r3 = r3.getAdapterPosition()
                com.yeelight.cherry.ui.adapter.GroupSelectDeviceAdapter r0 = com.yeelight.cherry.p177ui.adapter.GroupSelectDeviceAdapter.this
                java.util.List r0 = r0.f12153e
                java.lang.String r1 = r2.f12156b
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto L_0x0028
                com.yeelight.cherry.ui.adapter.GroupSelectDeviceAdapter r0 = com.yeelight.cherry.p177ui.adapter.GroupSelectDeviceAdapter.this
                java.util.List r0 = r0.f12153e
                java.lang.String r1 = r2.f12156b
                r0.remove(r1)
                com.yeelight.cherry.ui.adapter.GroupSelectDeviceAdapter r0 = com.yeelight.cherry.p177ui.adapter.GroupSelectDeviceAdapter.this
                com.yeelight.cherry.ui.adapter.GroupSelectDeviceAdapter$b r0 = r0.f12154f
                if (r0 == 0) goto L_0x004a
                goto L_0x003b
            L_0x0028:
                com.yeelight.cherry.ui.adapter.GroupSelectDeviceAdapter r0 = com.yeelight.cherry.p177ui.adapter.GroupSelectDeviceAdapter.this
                java.util.List r0 = r0.f12153e
                java.lang.String r1 = r2.f12156b
                r0.add(r1)
                com.yeelight.cherry.ui.adapter.GroupSelectDeviceAdapter r0 = com.yeelight.cherry.p177ui.adapter.GroupSelectDeviceAdapter.this
                com.yeelight.cherry.ui.adapter.GroupSelectDeviceAdapter$b r0 = r0.f12154f
                if (r0 == 0) goto L_0x004a
            L_0x003b:
                com.yeelight.cherry.ui.adapter.GroupSelectDeviceAdapter r0 = com.yeelight.cherry.p177ui.adapter.GroupSelectDeviceAdapter.this
                com.yeelight.cherry.ui.adapter.GroupSelectDeviceAdapter$b r0 = r0.f12154f
                com.yeelight.cherry.ui.adapter.GroupSelectDeviceAdapter r1 = com.yeelight.cherry.p177ui.adapter.GroupSelectDeviceAdapter.this
                java.util.List r1 = r1.f12153e
                r0.mo26253a(r1)
            L_0x004a:
                com.yeelight.cherry.ui.adapter.GroupSelectDeviceAdapter r0 = com.yeelight.cherry.p177ui.adapter.GroupSelectDeviceAdapter.this
                r0.notifyItemChanged(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.adapter.GroupSelectDeviceAdapter.C5814a.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.GroupSelectDeviceAdapter$b */
    public interface C5815b {
        /* renamed from: a */
        void mo26253a(List<String> list);
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.GroupSelectDeviceAdapter$c */
    class C5816c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ImageView f12158a;

        /* renamed from: b */
        TextView f12159b;

        /* renamed from: c */
        TextView f12160c;

        /* renamed from: d */
        CheckBox f12161d;

        public C5816c(View view) {
            super(view);
            this.f12158a = (ImageView) view.findViewById(2131296581);
            this.f12159b = (TextView) view.findViewById(2131296596);
            this.f12160c = (TextView) view.findViewById(2131297362);
            CheckBox checkBox = (CheckBox) view.findViewById(2131296471);
            this.f12161d = checkBox;
            checkBox.setClickable(false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo27171a(C4198d dVar) {
            int i;
            Resources resources;
            TextView textView;
            TextView textView2;
            int i2;
            Resources resources2;
            this.f12158a.setImageResource(dVar.mo23306H());
            this.f12159b.setText(dVar.mo23397U());
            if (dVar.mo23416o0()) {
                textView = this.f12159b;
                resources = C4297y.f7456e.getResources();
                i = 2131099837;
            } else {
                textView = this.f12159b;
                resources = C4297y.f7456e.getResources();
                i = 2131099836;
            }
            textView.setTextColor(resources.getColor(i));
            this.f12161d.setChecked(GroupSelectDeviceAdapter.this.f12153e.contains(dVar.mo23372G()));
            if (GroupSelectDeviceAdapter.this.f12153e.contains(dVar.mo23372G())) {
                this.f12160c.setText(2131756155);
                textView2 = this.f12160c;
                resources2 = textView2.getResources();
                i2 = 2131099838;
            } else {
                this.f12160c.setText(2131756163);
                textView2 = this.f12160c;
                resources2 = textView2.getResources();
                i2 = 2131099839;
            }
            textView2.setTextColor(resources2.getColor(i2));
        }
    }

    public GroupSelectDeviceAdapter(Context context, Cursor cursor) {
        super(context, cursor);
    }

    /* renamed from: g */
    public List<C4198d> mo27165g() {
        ArrayList arrayList = new ArrayList();
        for (String h0 : this.f12153e) {
            arrayList.add(C4257w.m11945h0(h0));
        }
        return arrayList;
    }

    /* renamed from: h */
    public List<String> mo27166h() {
        ArrayList arrayList = new ArrayList();
        try {
            for (String h0 : this.f12153e) {
                arrayList.add(((C6039j) C4257w.m11945h0(h0)).mo27788M1());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: i */
    public void mo27124c(C5816c cVar, Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndex(C7579c.C7580a.C7581a.f15372c));
        C4198d h0 = C4257w.m11945h0(string);
        if (h0 != null) {
            cVar.mo27171a(h0);
        }
        cVar.itemView.setOnClickListener(new C5814a(cVar, string));
    }

    /* renamed from: j */
    public C5816c onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C5816c(LayoutInflater.from(viewGroup.getContext()).inflate(C11748R$layout.item_create_room_select_device, viewGroup, false));
    }

    /* renamed from: k */
    public void mo27169k(C5815b bVar) {
        this.f12154f = bVar;
    }
}
