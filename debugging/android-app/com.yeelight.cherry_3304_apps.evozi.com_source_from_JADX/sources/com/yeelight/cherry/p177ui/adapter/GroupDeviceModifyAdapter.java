package com.yeelight.cherry.p177ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.utils.C10547m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.adapter.GroupDeviceModifyAdapter */
public class GroupDeviceModifyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    private int f12141a;

    /* renamed from: b */
    private int f12142b;

    /* renamed from: c */
    private List<HashMap<String, Object>> f12143c = new ArrayList();

    /* renamed from: com.yeelight.cherry.ui.adapter.GroupDeviceModifyAdapter$a */
    class C5810a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.ViewHolder f12144a;

        C5810a(RecyclerView.ViewHolder viewHolder) {
            this.f12144a = viewHolder;
        }

        public void onClick(View view) {
            GroupDeviceModifyAdapter.this.m17200d(this.f12144a.getAdapterPosition());
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.GroupDeviceModifyAdapter$b */
    class C5811b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.ViewHolder f12146a;

        C5811b(RecyclerView.ViewHolder viewHolder) {
            this.f12146a = viewHolder;
        }

        public void onClick(View view) {
            GroupDeviceModifyAdapter.this.m17199c(this.f12146a.getAdapterPosition());
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.GroupDeviceModifyAdapter$c */
    class C5812c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ImageView f12148a;

        /* renamed from: b */
        TextView f12149b;

        /* renamed from: c */
        TextView f12150c;

        /* renamed from: d */
        TextView f12151d;

        public C5812c(GroupDeviceModifyAdapter groupDeviceModifyAdapter, View view) {
            super(view);
            this.f12148a = (ImageView) view.findViewById(2131296581);
            this.f12149b = (TextView) view.findViewById(2131296596);
            this.f12150c = (TextView) view.findViewById(2131297362);
            this.f12151d = (TextView) view.findViewById(C11745R$id.device_operate);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.GroupDeviceModifyAdapter$d */
    class C5813d extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f12152a;

        public C5813d(GroupDeviceModifyAdapter groupDeviceModifyAdapter, View view) {
            super(view);
            this.f12152a = (TextView) view;
        }
    }

    public GroupDeviceModifyAdapter(List<HashMap<String, Object>> list, String str) {
        this.f12143c = list;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m17199c(int i) {
        if (this.f12141a == 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("type", 3);
            hashMap.put(ScanBarcodeActivity.TITLE, C4297y.f7456e.getResources().getString(2131756158));
            this.f12143c.add(0, hashMap);
            HashMap remove = this.f12143c.remove(i + 1);
            remove.put("type", 1);
            this.f12143c.add(1, remove);
            this.f12141a = 1;
            this.f12142b = 3;
            notifyDataSetChanged();
            return;
        }
        HashMap remove2 = this.f12143c.remove(i);
        remove2.put("type", 1);
        int i2 = this.f12141a + 1;
        this.f12141a = i2;
        this.f12142b++;
        this.f12143c.add(i2, remove2);
        List<HashMap<String, Object>> list = this.f12143c;
        if (((Integer) list.get(list.size() - 1).get("type")).intValue() == 3) {
            this.f12141a = this.f12143c.size() - 1;
            List<HashMap<String, Object>> list2 = this.f12143c;
            list2.remove(list2.size() - 1);
            notifyItemRemoved(this.f12141a);
            return;
        }
        notifyItemMoved(i, this.f12141a);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m17200d(int i) {
        List<HashMap<String, Object>> list = this.f12143c;
        if (((Integer) list.get(list.size() - 1).get("type")).intValue() == 1) {
            HashMap hashMap = new HashMap();
            hashMap.put("type", 3);
            hashMap.put(ScanBarcodeActivity.TITLE, C4297y.f7456e.getResources().getString(2131756159));
            this.f12143c.add(hashMap);
            HashMap remove = this.f12143c.remove(i);
            remove.put("type", 2);
            this.f12143c.add(remove);
            notifyDataSetChanged();
            this.f12142b = this.f12143c.size() - 1;
            this.f12141a = this.f12143c.size() - 3;
            return;
        }
        HashMap remove2 = this.f12143c.remove(i);
        remove2.put("type", 2);
        this.f12141a--;
        int i2 = this.f12142b - 1;
        this.f12142b = i2;
        this.f12143c.add(i2, remove2);
        int i3 = this.f12142b;
        if (i3 == 2) {
            this.f12143c.remove(0);
            notifyItemRemoved(0);
            this.f12141a = 0;
            this.f12142b = 1;
            return;
        }
        notifyItemMoved(i, i3);
    }

    /* renamed from: e */
    public void mo27160e(int i) {
        this.f12141a = i;
        this.f12142b = i + 2;
    }

    /* renamed from: f */
    public void mo27161f(int i) {
    }

    /* renamed from: g */
    public void mo27162g(int i) {
        this.f12142b = i;
    }

    public int getItemCount() {
        List<HashMap<String, Object>> list = this.f12143c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getItemViewType(int i) {
        return ((Integer) this.f12143c.get(i).get("type")).intValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r11, int r12) {
        /*
            r10 = this;
            java.util.List<java.util.HashMap<java.lang.String, java.lang.Object>> r0 = r10.f12143c
            java.lang.Object r12 = r0.get(r12)
            java.util.HashMap r12 = (java.util.HashMap) r12
            int r0 = r11.getItemViewType()
            r1 = 3
            if (r0 != r1) goto L_0x0022
            com.yeelight.cherry.ui.adapter.GroupDeviceModifyAdapter$d r11 = (com.yeelight.cherry.p177ui.adapter.GroupDeviceModifyAdapter.C5813d) r11
            android.widget.TextView r11 = r11.f12152a
            java.lang.String r0 = "title"
            java.lang.Object r12 = r12.get(r0)
            java.lang.String r12 = r12.toString()
            r11.setText(r12)
            goto L_0x0120
        L_0x0022:
            java.lang.String r2 = "device"
            java.lang.Object r12 = r12.get(r2)
            com.yeelight.yeelib.c.i.d r12 = (com.yeelight.yeelib.p150c.p151i.C4198d) r12
            r2 = r11
            com.yeelight.cherry.ui.adapter.GroupDeviceModifyAdapter$c r2 = (com.yeelight.cherry.p177ui.adapter.GroupDeviceModifyAdapter.C5812c) r2
            android.widget.TextView r3 = r2.f12149b
            java.lang.String r4 = r12.mo23397U()
            r3.setText(r4)
            java.lang.String r3 = r12.mo23395T()
            r4 = -1
            int r5 = r3.hashCode()
            r6 = 5
            r7 = 4
            r8 = 2
            r9 = 1
            switch(r5) {
                case -443031172: goto L_0x0079;
                case 1201766335: goto L_0x006f;
                case 1201766336: goto L_0x0065;
                case 2102612488: goto L_0x005b;
                case 2102612489: goto L_0x0051;
                case 2146130361: goto L_0x0047;
                default: goto L_0x0046;
            }
        L_0x0046:
            goto L_0x0082
        L_0x0047:
            java.lang.String r5 = "yeelink.light.dnlight2"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0082
            r4 = 0
            goto L_0x0082
        L_0x0051:
            java.lang.String r5 = "yeelink.light.meshbulb2"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0082
            r4 = 2
            goto L_0x0082
        L_0x005b:
            java.lang.String r5 = "yeelink.light.meshbulb1"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0082
            r4 = 1
            goto L_0x0082
        L_0x0065:
            java.lang.String r5 = "yeelink.light.ml2"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0082
            r4 = 5
            goto L_0x0082
        L_0x006f:
            java.lang.String r5 = "yeelink.light.ml1"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0082
            r4 = 4
            goto L_0x0082
        L_0x0079:
            java.lang.String r5 = "yeelink.light.spot1"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0082
            r4 = 3
        L_0x0082:
            if (r4 == 0) goto L_0x00b6
            if (r4 == r9) goto L_0x00b0
            if (r4 == r8) goto L_0x00aa
            if (r4 == r1) goto L_0x00a4
            if (r4 == r7) goto L_0x009e
            if (r4 == r6) goto L_0x0098
            android.widget.ImageView r1 = r2.f12148a
            int r12 = r12.mo23303F()
            r1.setImageResource(r12)
            goto L_0x00be
        L_0x0098:
            android.widget.ImageView r12 = r2.f12148a
            r1 = 2131231409(0x7f0802b1, float:1.8078898E38)
            goto L_0x00bb
        L_0x009e:
            android.widget.ImageView r12 = r2.f12148a
            r1 = 2131231407(0x7f0802af, float:1.8078894E38)
            goto L_0x00bb
        L_0x00a4:
            android.widget.ImageView r12 = r2.f12148a
            r1 = 2131231435(0x7f0802cb, float:1.807895E38)
            goto L_0x00bb
        L_0x00aa:
            android.widget.ImageView r12 = r2.f12148a
            r1 = 2131231403(0x7f0802ab, float:1.8078886E38)
            goto L_0x00bb
        L_0x00b0:
            android.widget.ImageView r12 = r2.f12148a
            r1 = 2131231401(0x7f0802a9, float:1.8078882E38)
            goto L_0x00bb
        L_0x00b6:
            android.widget.ImageView r12 = r2.f12148a
            r1 = 2131231339(0x7f08026b, float:1.8078756E38)
        L_0x00bb:
            r12.setImageResource(r1)
        L_0x00be:
            android.widget.TextView r12 = r2.f12150c
            if (r0 != r9) goto L_0x00f0
            r0 = 2131756155(0x7f10047b, float:1.914321E38)
            r12.setText(r0)
            android.widget.TextView r12 = r2.f12151d
            r0 = 2131231958(0x7f0804d6, float:1.8080012E38)
            r12.setBackgroundResource(r0)
            android.widget.TextView r12 = r2.f12151d
            android.content.res.Resources r0 = r12.getResources()
            r1 = 2131099838(0x7f0600be, float:1.781204E38)
            int r0 = r0.getColor(r1)
            r12.setTextColor(r0)
            android.widget.TextView r12 = r2.f12151d
            r0 = 2131756164(0x7f100484, float:1.9143228E38)
            r12.setText(r0)
            android.widget.TextView r12 = r2.f12151d
            com.yeelight.cherry.ui.adapter.GroupDeviceModifyAdapter$a r0 = new com.yeelight.cherry.ui.adapter.GroupDeviceModifyAdapter$a
            r0.<init>(r11)
            goto L_0x011d
        L_0x00f0:
            r0 = 2131756163(0x7f100483, float:1.9143226E38)
            r12.setText(r0)
            android.widget.TextView r12 = r2.f12151d
            r0 = 2131231957(0x7f0804d5, float:1.808001E38)
            r12.setBackgroundResource(r0)
            android.widget.TextView r12 = r2.f12151d
            android.content.res.Resources r0 = r12.getResources()
            r1 = 2131099839(0x7f0600bf, float:1.7812043E38)
            int r0 = r0.getColor(r1)
            r12.setTextColor(r0)
            android.widget.TextView r12 = r2.f12151d
            r0 = 2131756157(0x7f10047d, float:1.9143214E38)
            r12.setText(r0)
            android.widget.TextView r12 = r2.f12151d
            com.yeelight.cherry.ui.adapter.GroupDeviceModifyAdapter$b r0 = new com.yeelight.cherry.ui.adapter.GroupDeviceModifyAdapter$b
            r0.<init>(r11)
        L_0x011d:
            r12.setOnClickListener(r0)
        L_0x0120:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.adapter.GroupDeviceModifyAdapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1 || i == 2) {
            return new C5812c(this, LayoutInflater.from(viewGroup.getContext()).inflate(C11748R$layout.item_room_device_manage, viewGroup, false));
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
        return new C5813d(this, textView);
    }
}
