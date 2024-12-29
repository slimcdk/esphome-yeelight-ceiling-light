package com.yeelight.cherry.p141ui.adapter;

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
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.managers.C8293t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p051j4.C9193k;
import p145d4.C8937a;
import p170i4.C9113d;

/* renamed from: com.yeelight.cherry.ui.adapter.RoomDeviceModifyAdapter */
public class RoomDeviceModifyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    private int f11877a;

    /* renamed from: b */
    private int f11878b;

    /* renamed from: c */
    private List<C3012e> f11879c = new ArrayList();

    /* renamed from: d */
    private List<HashMap<String, Object>> f11880d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f11881e;

    /* renamed from: com.yeelight.cherry.ui.adapter.RoomDeviceModifyAdapter$a */
    class C5903a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.ViewHolder f11882a;

        C5903a(RecyclerView.ViewHolder viewHolder) {
            this.f11882a = viewHolder;
        }

        public void onClick(View view) {
            RoomDeviceModifyAdapter.this.m17316f(this.f11882a.getAdapterPosition());
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.RoomDeviceModifyAdapter$b */
    class C5904b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8937a f11884a;

        /* renamed from: b */
        final /* synthetic */ RecyclerView.ViewHolder f11885b;

        /* renamed from: c */
        final /* synthetic */ C3010c f11886c;

        /* renamed from: com.yeelight.cherry.ui.adapter.RoomDeviceModifyAdapter$b$a */
        class C5905a implements DialogInterface.OnClickListener {
            C5905a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C5904b bVar = C5904b.this;
                RoomDeviceModifyAdapter.this.m17315e(bVar.f11885b.getAdapterPosition());
                dialogInterface.dismiss();
            }
        }

        C5904b(C8937a aVar, RecyclerView.ViewHolder viewHolder, C3010c cVar) {
            this.f11884a = aVar;
            this.f11885b = viewHolder;
            this.f11886c = cVar;
        }

        public void onClick(View view) {
            C8937a aVar = this.f11884a;
            if (aVar == null || aVar.mo36723o().equals(RoomDeviceModifyAdapter.this.f11881e)) {
                RoomDeviceModifyAdapter.this.m17315e(this.f11885b.getAdapterPosition());
                return;
            }
            Context context = this.f11885b.itemView.getContext();
            new C9113d.C9118e(context).mo37173c(this.f11886c.mo23119H()).mo37179i(context.getString(2131756185)).mo37177g(context.getString(2131756186, new Object[]{this.f11884a.mo36723o()})).mo37174d(-2, context.getString(2131755232), (DialogInterface.OnClickListener) null).mo37174d(-1, context.getString(2131755281), new C5905a()).mo37172b().show();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.RoomDeviceModifyAdapter$c */
    class C5906c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ImageView f11889a;

        /* renamed from: b */
        TextView f11890b;

        /* renamed from: c */
        TextView f11891c;

        /* renamed from: d */
        TextView f11892d;

        public C5906c(RoomDeviceModifyAdapter roomDeviceModifyAdapter, View view) {
            super(view);
            this.f11889a = (ImageView) view.findViewById(2131296659);
            this.f11890b = (TextView) view.findViewById(2131296674);
            this.f11891c = (TextView) view.findViewById(2131297517);
            this.f11892d = (TextView) view.findViewById(C12225R$id.device_operate);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.RoomDeviceModifyAdapter$d */
    class C5907d extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f11893a;

        public C5907d(RoomDeviceModifyAdapter roomDeviceModifyAdapter, View view) {
            super(view);
            this.f11893a = (TextView) view;
        }
    }

    public RoomDeviceModifyAdapter(List<HashMap<String, Object>> list, String str) {
        this.f11880d = list;
        this.f11881e = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m17315e(int i) {
        if (this.f11877a == 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("type", 3);
            hashMap.put(ScanBarcodeActivity.TITLE, C3108x.f4951e.getResources().getString(2131756182));
            this.f11880d.add(0, hashMap);
            HashMap remove = this.f11880d.remove(i + 1);
            remove.put("type", 1);
            remove.put("name", this.f11881e);
            this.f11880d.add(1, remove);
            this.f11877a = 1;
            this.f11878b = 3;
            notifyDataSetChanged();
            C3012e eVar = (C3012e) remove.get(DddTag.DEVICE);
            if (this.f11879c.contains(eVar)) {
                this.f11879c.remove(eVar);
            } else {
                this.f11879c.add(eVar);
            }
        } else {
            HashMap remove2 = this.f11880d.remove(i);
            remove2.put("type", 1);
            remove2.put("name", this.f11881e);
            int i2 = this.f11877a + 1;
            this.f11877a = i2;
            this.f11878b++;
            this.f11880d.add(i2, remove2);
            List<HashMap<String, Object>> list = this.f11880d;
            if (((Integer) list.get(list.size() - 1).get("type")).intValue() == 3) {
                this.f11877a = this.f11880d.size() - 1;
                List<HashMap<String, Object>> list2 = this.f11880d;
                list2.remove(list2.size() - 1);
                notifyItemRemoved(this.f11877a);
            } else {
                notifyItemMoved(i, this.f11877a);
            }
            C3012e eVar2 = (C3012e) remove2.get(DddTag.DEVICE);
            if (this.f11879c.contains(eVar2)) {
                this.f11879c.remove(eVar2);
            } else {
                this.f11879c.add(eVar2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m17316f(int i) {
        List<HashMap<String, Object>> list = this.f11880d;
        if (((Integer) list.get(list.size() - 1).get("type")).intValue() == 1) {
            HashMap hashMap = new HashMap();
            hashMap.put("type", 3);
            hashMap.put(ScanBarcodeActivity.TITLE, C3108x.f4951e.getResources().getString(2131756183));
            this.f11880d.add(hashMap);
            HashMap remove = this.f11880d.remove(i);
            remove.put("type", 2);
            remove.remove("name");
            this.f11880d.add(remove);
            notifyDataSetChanged();
            this.f11878b = this.f11880d.size() - 1;
            this.f11877a = this.f11880d.size() - 3;
            C3012e eVar = (C3012e) remove.get(DddTag.DEVICE);
            if (this.f11879c.contains(eVar)) {
                this.f11879c.remove(eVar);
            } else {
                this.f11879c.add(eVar);
            }
        } else {
            HashMap remove2 = this.f11880d.remove(i);
            remove2.put("type", 2);
            remove2.remove("name");
            this.f11877a--;
            int i2 = this.f11878b - 1;
            this.f11878b = i2;
            this.f11880d.add(i2, remove2);
            int i3 = this.f11878b;
            if (i3 == 2) {
                this.f11880d.remove(0);
                notifyItemRemoved(0);
                this.f11877a = 0;
                this.f11878b = 1;
            } else {
                notifyItemMoved(i, i3);
            }
            C3012e eVar2 = (C3012e) remove2.get(DddTag.DEVICE);
            if (this.f11879c.contains(eVar2)) {
                this.f11879c.remove(eVar2);
            } else {
                this.f11879c.add(eVar2);
            }
        }
    }

    /* renamed from: d */
    public List<C3012e> mo31179d() {
        return this.f11879c;
    }

    /* renamed from: g */
    public void mo31180g(int i) {
        this.f11877a = i;
        this.f11878b = i + 2;
    }

    public int getItemCount() {
        List<HashMap<String, Object>> list = this.f11880d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getItemViewType(int i) {
        return ((Integer) this.f11880d.get(i).get("type")).intValue();
    }

    /* renamed from: h */
    public void mo31181h(int i) {
    }

    /* renamed from: i */
    public void mo31182i(int i) {
        this.f11878b = i;
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        HashMap hashMap = this.f11880d.get(i);
        int itemViewType = viewHolder.getItemViewType();
        if (itemViewType == 3) {
            ((C5907d) viewHolder).f11893a.setText(hashMap.get(ScanBarcodeActivity.TITLE).toString());
            return;
        }
        C3010c cVar = (C3010c) hashMap.get(DddTag.DEVICE);
        C5906c cVar2 = (C5906c) viewHolder;
        cVar2.f11890b.setText(cVar.mo23210U());
        cVar2.f11889a.setImageResource(cVar.mo23116F());
        if (itemViewType == 1) {
            String obj = hashMap.get("name").toString();
            cVar2.f11891c.setText(String.format(cVar2.f11891c.getResources().getString(2131756184), new Object[]{obj}));
            TextView textView = cVar2.f11891c;
            textView.setTextColor(textView.getResources().getColor(2131099841));
            cVar2.f11892d.setBackgroundResource(2131231984);
            TextView textView2 = cVar2.f11892d;
            textView2.setTextColor(textView2.getResources().getColor(2131099841));
            cVar2.f11892d.setText(2131756188);
            cVar2.f11892d.setOnClickListener(new C5903a(viewHolder));
            return;
        }
        C8937a p = C8293t.m19620n().mo35256p(cVar.mo23217Z());
        if (p != null && !p.mo36723o().equals(this.f11881e)) {
            String format = String.format(cVar2.f11891c.getResources().getString(2131756184), new Object[]{p.mo36723o()});
            TextView textView3 = cVar2.f11891c;
            textView3.setTextColor(textView3.getResources().getColor(2131099841));
            cVar2.f11891c.setText(format);
        } else {
            cVar2.f11891c.setText(2131756187);
            TextView textView4 = cVar2.f11891c;
            textView4.setTextColor(textView4.getResources().getColor(2131099842));
        }
        cVar2.f11892d.setBackgroundResource(2131231983);
        TextView textView5 = cVar2.f11892d;
        textView5.setTextColor(textView5.getResources().getColor(2131099842));
        cVar2.f11892d.setText(2131756181);
        cVar2.f11892d.setOnClickListener(new C5904b(p, viewHolder, cVar));
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1 || i == 2) {
            return new C5906c(this, LayoutInflater.from(viewGroup.getContext()).inflate(C12228R$layout.item_room_device_manage, viewGroup, false));
        }
        if (i != 3) {
            return null;
        }
        TextView textView = new TextView(viewGroup.getContext());
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, C9193k.m22151b(viewGroup.getContext(), 38.0f)));
        textView.setTextColor(viewGroup.getContext().getResources().getColor(2131099840));
        textView.setGravity(16);
        textView.setPadding(C9193k.m22151b(viewGroup.getContext(), 21.0f), 0, 0, 0);
        textView.setBackgroundColor(viewGroup.getContext().getResources().getColor(2131099808));
        return new C5907d(this, textView);
    }
}
