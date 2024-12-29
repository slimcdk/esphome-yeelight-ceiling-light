package com.yeelight.cherry.p141ui.adapter;

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
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.data.C6043b;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C6094f;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.adapter.GroupSelectDeviceAdapter */
public class GroupSelectDeviceAdapter extends RecyclerViewCursorAdapter<C5879c> {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List<String> f11753e = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C5878b f11754f;

    /* renamed from: com.yeelight.cherry.ui.adapter.GroupSelectDeviceAdapter$a */
    class C5877a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5879c f11755a;

        /* renamed from: b */
        final /* synthetic */ String f11756b;

        C5877a(C5879c cVar, String str) {
            this.f11755a = cVar;
            this.f11756b = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
            if (com.yeelight.cherry.p141ui.adapter.GroupSelectDeviceAdapter.m17243f(r2.f11757c) != null) goto L_0x003b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0039, code lost:
            if (com.yeelight.cherry.p141ui.adapter.GroupSelectDeviceAdapter.m17243f(r2.f11757c) != null) goto L_0x003b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                com.yeelight.cherry.ui.adapter.GroupSelectDeviceAdapter$c r3 = r2.f11755a
                int r3 = r3.getAdapterPosition()
                com.yeelight.cherry.ui.adapter.GroupSelectDeviceAdapter r0 = com.yeelight.cherry.p141ui.adapter.GroupSelectDeviceAdapter.this
                java.util.List r0 = r0.f11753e
                java.lang.String r1 = r2.f11756b
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto L_0x0028
                com.yeelight.cherry.ui.adapter.GroupSelectDeviceAdapter r0 = com.yeelight.cherry.p141ui.adapter.GroupSelectDeviceAdapter.this
                java.util.List r0 = r0.f11753e
                java.lang.String r1 = r2.f11756b
                r0.remove(r1)
                com.yeelight.cherry.ui.adapter.GroupSelectDeviceAdapter r0 = com.yeelight.cherry.p141ui.adapter.GroupSelectDeviceAdapter.this
                com.yeelight.cherry.ui.adapter.GroupSelectDeviceAdapter$b r0 = r0.f11754f
                if (r0 == 0) goto L_0x004a
                goto L_0x003b
            L_0x0028:
                com.yeelight.cherry.ui.adapter.GroupSelectDeviceAdapter r0 = com.yeelight.cherry.p141ui.adapter.GroupSelectDeviceAdapter.this
                java.util.List r0 = r0.f11753e
                java.lang.String r1 = r2.f11756b
                r0.add(r1)
                com.yeelight.cherry.ui.adapter.GroupSelectDeviceAdapter r0 = com.yeelight.cherry.p141ui.adapter.GroupSelectDeviceAdapter.this
                com.yeelight.cherry.ui.adapter.GroupSelectDeviceAdapter$b r0 = r0.f11754f
                if (r0 == 0) goto L_0x004a
            L_0x003b:
                com.yeelight.cherry.ui.adapter.GroupSelectDeviceAdapter r0 = com.yeelight.cherry.p141ui.adapter.GroupSelectDeviceAdapter.this
                com.yeelight.cherry.ui.adapter.GroupSelectDeviceAdapter$b r0 = r0.f11754f
                com.yeelight.cherry.ui.adapter.GroupSelectDeviceAdapter r1 = com.yeelight.cherry.p141ui.adapter.GroupSelectDeviceAdapter.this
                java.util.List r1 = r1.f11753e
                r0.mo30299a(r1)
            L_0x004a:
                com.yeelight.cherry.ui.adapter.GroupSelectDeviceAdapter r0 = com.yeelight.cherry.p141ui.adapter.GroupSelectDeviceAdapter.this
                r0.notifyItemChanged(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.adapter.GroupSelectDeviceAdapter.C5877a.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.GroupSelectDeviceAdapter$b */
    public interface C5878b {
        /* renamed from: a */
        void mo30299a(List<String> list);
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.GroupSelectDeviceAdapter$c */
    class C5879c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ImageView f11758a;

        /* renamed from: b */
        TextView f11759b;

        /* renamed from: c */
        TextView f11760c;

        /* renamed from: d */
        CheckBox f11761d;

        public C5879c(View view) {
            super(view);
            this.f11758a = (ImageView) view.findViewById(2131296659);
            this.f11759b = (TextView) view.findViewById(2131296674);
            this.f11760c = (TextView) view.findViewById(2131297517);
            CheckBox checkBox = (CheckBox) view.findViewById(2131296536);
            this.f11761d = checkBox;
            checkBox.setClickable(false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo31138a(C3010c cVar) {
            int i;
            Resources resources;
            TextView textView;
            TextView textView2;
            int i2;
            Resources resources2;
            this.f11758a.setImageResource(cVar.mo23119H());
            this.f11759b.setText(cVar.mo23210U());
            if (cVar.mo23230o0()) {
                textView = this.f11759b;
                resources = C3108x.f4951e.getResources();
                i = 2131099840;
            } else {
                textView = this.f11759b;
                resources = C3108x.f4951e.getResources();
                i = 2131099839;
            }
            textView.setTextColor(resources.getColor(i));
            this.f11761d.setChecked(GroupSelectDeviceAdapter.this.f11753e.contains(cVar.mo23185G()));
            if (GroupSelectDeviceAdapter.this.f11753e.contains(cVar.mo23185G())) {
                this.f11760c.setText(2131756179);
                textView2 = this.f11760c;
                resources2 = textView2.getResources();
                i2 = 2131099841;
            } else {
                this.f11760c.setText(2131756187);
                textView2 = this.f11760c;
                resources2 = textView2.getResources();
                i2 = 2131099842;
            }
            textView2.setTextColor(resources2.getColor(i2));
        }
    }

    public GroupSelectDeviceAdapter(Context context, Cursor cursor) {
        super(context, cursor);
    }

    /* renamed from: g */
    public List<C3010c> mo31132g() {
        ArrayList arrayList = new ArrayList();
        for (String j0 : this.f11753e) {
            arrayList.add(YeelightDeviceManager.m7794j0(j0));
        }
        return arrayList;
    }

    /* renamed from: h */
    public List<String> mo31133h() {
        ArrayList arrayList = new ArrayList();
        try {
            for (String j0 : this.f11753e) {
                arrayList.add(((C6094f) YeelightDeviceManager.m7794j0(j0)).mo31698M1());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: i */
    public void mo31093c(C5879c cVar, Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndex(C6043b.C6044a.C6045a.f12331c));
        C3010c j0 = YeelightDeviceManager.m7794j0(string);
        if (j0 != null) {
            cVar.mo31138a(j0);
        }
        cVar.itemView.setOnClickListener(new C5877a(cVar, string));
    }

    /* renamed from: j */
    public C5879c onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C5879c(LayoutInflater.from(viewGroup.getContext()).inflate(C12228R$layout.item_create_room_select_device, viewGroup, false));
    }

    /* renamed from: k */
    public void mo31136k(C5878b bVar) {
        this.f11754f = bVar;
    }
}
