package com.yeelight.cherry.p177ui.adapter;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.miot.common.device.parser.xml.DddTag;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p152f.C9812t;
import com.yeelight.yeelib.p190i.C9875a;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.utils.C10547m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.adapter.RoomDeviceModifyAdapter */
public class RoomDeviceModifyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    private int f12277a;

    /* renamed from: b */
    private int f12278b;

    /* renamed from: c */
    private List<C4200i> f12279c = new ArrayList();

    /* renamed from: d */
    private List<HashMap<String, Object>> f12280d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f12281e;

    /* renamed from: com.yeelight.cherry.ui.adapter.RoomDeviceModifyAdapter$a */
    class C5840a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.ViewHolder f12282a;

        C5840a(RecyclerView.ViewHolder viewHolder) {
            this.f12282a = viewHolder;
        }

        public void onClick(View view) {
            RoomDeviceModifyAdapter.this.m17277f(this.f12282a.getAdapterPosition());
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.RoomDeviceModifyAdapter$b */
    class C5841b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C9875a f12284a;

        /* renamed from: b */
        final /* synthetic */ RecyclerView.ViewHolder f12285b;

        /* renamed from: c */
        final /* synthetic */ C4198d f12286c;

        /* renamed from: com.yeelight.cherry.ui.adapter.RoomDeviceModifyAdapter$b$a */
        class C5842a implements DialogInterface.OnClickListener {
            C5842a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C5841b bVar = C5841b.this;
                RoomDeviceModifyAdapter.this.m17276e(bVar.f12285b.getAdapterPosition());
                dialogInterface.dismiss();
            }
        }

        C5841b(C9875a aVar, RecyclerView.ViewHolder viewHolder, C4198d dVar) {
            this.f12284a = aVar;
            this.f12285b = viewHolder;
            this.f12286c = dVar;
        }

        public void onClick(View view) {
            C9875a aVar = this.f12284a;
            if (aVar == null || aVar.mo31954o().equals(RoomDeviceModifyAdapter.this.f12281e)) {
                RoomDeviceModifyAdapter.this.m17276e(this.f12285b.getAdapterPosition());
                return;
            }
            Context context = this.f12285b.itemView.getContext();
            String string = context.getString(2131756162, new Object[]{this.f12284a.mo31954o()});
            C10526e.C10531e eVar = new C10526e.C10531e(context);
            eVar.mo33352c(this.f12286c.mo23306H());
            eVar.mo33358i(context.getString(2131756161));
            eVar.mo33356g(string);
            eVar.mo33353d(-2, context.getString(2131755229), (DialogInterface.OnClickListener) null);
            eVar.mo33353d(-1, context.getString(2131755277), new C5842a());
            eVar.mo33351b().show();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.RoomDeviceModifyAdapter$c */
    class C5843c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ImageView f12289a;

        /* renamed from: b */
        TextView f12290b;

        /* renamed from: c */
        TextView f12291c;

        /* renamed from: d */
        TextView f12292d;

        public C5843c(RoomDeviceModifyAdapter roomDeviceModifyAdapter, View view) {
            super(view);
            this.f12289a = (ImageView) view.findViewById(2131296581);
            this.f12290b = (TextView) view.findViewById(2131296596);
            this.f12291c = (TextView) view.findViewById(2131297362);
            this.f12292d = (TextView) view.findViewById(C11745R$id.device_operate);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.RoomDeviceModifyAdapter$d */
    class C5844d extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f12293a;

        public C5844d(RoomDeviceModifyAdapter roomDeviceModifyAdapter, View view) {
            super(view);
            this.f12293a = (TextView) view;
        }
    }

    public RoomDeviceModifyAdapter(List<HashMap<String, Object>> list, String str) {
        this.f12280d = list;
        this.f12281e = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m17276e(int i) {
        if (this.f12277a == 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("type", 3);
            hashMap.put(ScanBarcodeActivity.TITLE, C4297y.f7456e.getResources().getString(2131756158));
            this.f12280d.add(0, hashMap);
            HashMap remove = this.f12280d.remove(i + 1);
            remove.put("type", 1);
            remove.put("name", this.f12281e);
            this.f12280d.add(1, remove);
            this.f12277a = 1;
            this.f12278b = 3;
            notifyDataSetChanged();
            C4200i iVar = (C4200i) remove.get(DddTag.DEVICE);
            if (this.f12279c.contains(iVar)) {
                this.f12279c.remove(iVar);
            } else {
                this.f12279c.add(iVar);
            }
        } else {
            HashMap remove2 = this.f12280d.remove(i);
            remove2.put("type", 1);
            remove2.put("name", this.f12281e);
            int i2 = this.f12277a + 1;
            this.f12277a = i2;
            this.f12278b++;
            this.f12280d.add(i2, remove2);
            List<HashMap<String, Object>> list = this.f12280d;
            if (((Integer) list.get(list.size() - 1).get("type")).intValue() == 3) {
                this.f12277a = this.f12280d.size() - 1;
                List<HashMap<String, Object>> list2 = this.f12280d;
                list2.remove(list2.size() - 1);
                notifyItemRemoved(this.f12277a);
            } else {
                notifyItemMoved(i, this.f12277a);
            }
            C4200i iVar2 = (C4200i) remove2.get(DddTag.DEVICE);
            if (this.f12279c.contains(iVar2)) {
                this.f12279c.remove(iVar2);
            } else {
                this.f12279c.add(iVar2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m17277f(int i) {
        List<HashMap<String, Object>> list = this.f12280d;
        if (((Integer) list.get(list.size() - 1).get("type")).intValue() == 1) {
            HashMap hashMap = new HashMap();
            hashMap.put("type", 3);
            hashMap.put(ScanBarcodeActivity.TITLE, C4297y.f7456e.getResources().getString(2131756159));
            this.f12280d.add(hashMap);
            HashMap remove = this.f12280d.remove(i);
            remove.put("type", 2);
            remove.remove("name");
            this.f12280d.add(remove);
            notifyDataSetChanged();
            this.f12278b = this.f12280d.size() - 1;
            this.f12277a = this.f12280d.size() - 3;
            C4200i iVar = (C4200i) remove.get(DddTag.DEVICE);
            if (this.f12279c.contains(iVar)) {
                this.f12279c.remove(iVar);
            } else {
                this.f12279c.add(iVar);
            }
        } else {
            HashMap remove2 = this.f12280d.remove(i);
            remove2.put("type", 2);
            remove2.remove("name");
            this.f12277a--;
            int i2 = this.f12278b - 1;
            this.f12278b = i2;
            this.f12280d.add(i2, remove2);
            int i3 = this.f12278b;
            if (i3 == 2) {
                this.f12280d.remove(0);
                notifyItemRemoved(0);
                this.f12277a = 0;
                this.f12278b = 1;
            } else {
                notifyItemMoved(i, i3);
            }
            C4200i iVar2 = (C4200i) remove2.get(DddTag.DEVICE);
            if (this.f12279c.contains(iVar2)) {
                this.f12279c.remove(iVar2);
            } else {
                this.f12279c.add(iVar2);
            }
        }
    }

    /* renamed from: d */
    public List<C4200i> mo27213d() {
        return this.f12279c;
    }

    /* renamed from: g */
    public void mo27214g(int i) {
        this.f12277a = i;
        this.f12278b = i + 2;
    }

    public int getItemCount() {
        List<HashMap<String, Object>> list = this.f12280d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getItemViewType(int i) {
        return ((Integer) this.f12280d.get(i).get("type")).intValue();
    }

    /* renamed from: h */
    public void mo27215h(int i) {
    }

    /* renamed from: i */
    public void mo27216i(int i) {
        this.f12278b = i;
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        HashMap hashMap = this.f12280d.get(i);
        int itemViewType = viewHolder.getItemViewType();
        if (itemViewType == 3) {
            ((C5844d) viewHolder).f12293a.setText(hashMap.get(ScanBarcodeActivity.TITLE).toString());
            return;
        }
        C4198d dVar = (C4198d) hashMap.get(DddTag.DEVICE);
        C5843c cVar = (C5843c) viewHolder;
        cVar.f12290b.setText(dVar.mo23397U());
        cVar.f12289a.setImageResource(dVar.mo23303F());
        if (itemViewType == 1) {
            String obj = hashMap.get("name").toString();
            cVar.f12291c.setText(String.format(cVar.f12291c.getResources().getString(2131756160), new Object[]{obj}));
            TextView textView = cVar.f12291c;
            textView.setTextColor(textView.getResources().getColor(2131099838));
            cVar.f12292d.setBackgroundResource(2131231958);
            TextView textView2 = cVar.f12292d;
            textView2.setTextColor(textView2.getResources().getColor(2131099838));
            cVar.f12292d.setText(2131756164);
            cVar.f12292d.setOnClickListener(new C5840a(viewHolder));
            return;
        }
        C9875a m = C9812t.m23832j().mo31686m(dVar.mo23404Z());
        if (m != null && !m.mo31954o().equals(this.f12281e)) {
            String format = String.format(cVar.f12291c.getResources().getString(2131756160), new Object[]{m.mo31954o()});
            TextView textView3 = cVar.f12291c;
            textView3.setTextColor(textView3.getResources().getColor(2131099838));
            cVar.f12291c.setText(format);
        } else {
            cVar.f12291c.setText(2131756163);
            TextView textView4 = cVar.f12291c;
            textView4.setTextColor(textView4.getResources().getColor(2131099839));
        }
        cVar.f12292d.setBackgroundResource(2131231957);
        TextView textView5 = cVar.f12292d;
        textView5.setTextColor(textView5.getResources().getColor(2131099839));
        cVar.f12292d.setText(2131756157);
        cVar.f12292d.setOnClickListener(new C5841b(m, viewHolder, dVar));
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1 || i == 2) {
            return new C5843c(this, LayoutInflater.from(viewGroup.getContext()).inflate(C11748R$layout.item_room_device_manage, viewGroup, false));
        }
        if (i != 3) {
            return null;
        }
        TextView textView = new TextView(viewGroup.getContext());
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, C10547m.m25752b(viewGroup.getContext(), 38.0f)));
        textView.setTextColor(viewGroup.getContext().getResources().getColor(2131099837));
        textView.setGravity(16);
        textView.setPadding(C10547m.m25752b(viewGroup.getContext(), 21.0f), 0, 0, 0);
        textView.setBackgroundColor(viewGroup.getContext().getResources().getColor(2131099805));
        return new C5844d(this, textView);
    }
}
