package com.yeelight.cherry.p141ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.managers.C3108x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p051j4.C9193k;

/* renamed from: com.yeelight.cherry.ui.adapter.GroupDeviceModifyAdapter */
public class GroupDeviceModifyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    private int f11741a;

    /* renamed from: b */
    private int f11742b;

    /* renamed from: c */
    private List<HashMap<String, Object>> f11743c = new ArrayList();

    /* renamed from: com.yeelight.cherry.ui.adapter.GroupDeviceModifyAdapter$a */
    class C5873a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.ViewHolder f11744a;

        C5873a(RecyclerView.ViewHolder viewHolder) {
            this.f11744a = viewHolder;
        }

        public void onClick(View view) {
            GroupDeviceModifyAdapter.this.m17238d(this.f11744a.getAdapterPosition());
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.GroupDeviceModifyAdapter$b */
    class C5874b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.ViewHolder f11746a;

        C5874b(RecyclerView.ViewHolder viewHolder) {
            this.f11746a = viewHolder;
        }

        public void onClick(View view) {
            GroupDeviceModifyAdapter.this.m17237c(this.f11746a.getAdapterPosition());
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.GroupDeviceModifyAdapter$c */
    class C5875c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ImageView f11748a;

        /* renamed from: b */
        TextView f11749b;

        /* renamed from: c */
        TextView f11750c;

        /* renamed from: d */
        TextView f11751d;

        public C5875c(GroupDeviceModifyAdapter groupDeviceModifyAdapter, View view) {
            super(view);
            this.f11748a = (ImageView) view.findViewById(2131296659);
            this.f11749b = (TextView) view.findViewById(2131296674);
            this.f11750c = (TextView) view.findViewById(2131297517);
            this.f11751d = (TextView) view.findViewById(C12225R$id.device_operate);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.GroupDeviceModifyAdapter$d */
    class C5876d extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f11752a;

        public C5876d(GroupDeviceModifyAdapter groupDeviceModifyAdapter, View view) {
            super(view);
            this.f11752a = (TextView) view;
        }
    }

    public GroupDeviceModifyAdapter(List<HashMap<String, Object>> list, String str) {
        this.f11743c = list;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m17237c(int i) {
        if (this.f11741a == 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("type", 3);
            hashMap.put(ScanBarcodeActivity.TITLE, C3108x.f4951e.getResources().getString(2131756182));
            this.f11743c.add(0, hashMap);
            HashMap remove = this.f11743c.remove(i + 1);
            remove.put("type", 1);
            this.f11743c.add(1, remove);
            this.f11741a = 1;
            this.f11742b = 3;
            notifyDataSetChanged();
            return;
        }
        HashMap remove2 = this.f11743c.remove(i);
        remove2.put("type", 1);
        int i2 = this.f11741a + 1;
        this.f11741a = i2;
        this.f11742b++;
        this.f11743c.add(i2, remove2);
        List<HashMap<String, Object>> list = this.f11743c;
        if (((Integer) list.get(list.size() - 1).get("type")).intValue() == 3) {
            this.f11741a = this.f11743c.size() - 1;
            List<HashMap<String, Object>> list2 = this.f11743c;
            list2.remove(list2.size() - 1);
            notifyItemRemoved(this.f11741a);
            return;
        }
        notifyItemMoved(i, this.f11741a);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m17238d(int i) {
        List<HashMap<String, Object>> list = this.f11743c;
        if (((Integer) list.get(list.size() - 1).get("type")).intValue() == 1) {
            HashMap hashMap = new HashMap();
            hashMap.put("type", 3);
            hashMap.put(ScanBarcodeActivity.TITLE, C3108x.f4951e.getResources().getString(2131756183));
            this.f11743c.add(hashMap);
            HashMap remove = this.f11743c.remove(i);
            remove.put("type", 2);
            this.f11743c.add(remove);
            notifyDataSetChanged();
            this.f11742b = this.f11743c.size() - 1;
            this.f11741a = this.f11743c.size() - 3;
            return;
        }
        HashMap remove2 = this.f11743c.remove(i);
        remove2.put("type", 2);
        this.f11741a--;
        int i2 = this.f11742b - 1;
        this.f11742b = i2;
        this.f11743c.add(i2, remove2);
        int i3 = this.f11742b;
        if (i3 == 2) {
            this.f11743c.remove(0);
            notifyItemRemoved(0);
            this.f11741a = 0;
            this.f11742b = 1;
            return;
        }
        notifyItemMoved(i, i3);
    }

    /* renamed from: e */
    public void mo31127e(int i) {
        this.f11741a = i;
        this.f11742b = i + 2;
    }

    /* renamed from: f */
    public void mo31128f(int i) {
    }

    /* renamed from: g */
    public void mo31129g(int i) {
        this.f11742b = i;
    }

    public int getItemCount() {
        List<HashMap<String, Object>> list = this.f11743c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getItemViewType(int i) {
        return ((Integer) this.f11743c.get(i).get("type")).intValue();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0064, code lost:
        if (r3.equals("yeelink.light.meshbulb1") == false) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r8, int r9) {
        /*
            r7 = this;
            java.util.List<java.util.HashMap<java.lang.String, java.lang.Object>> r0 = r7.f11743c
            java.lang.Object r9 = r0.get(r9)
            java.util.HashMap r9 = (java.util.HashMap) r9
            int r0 = r8.getItemViewType()
            r1 = 3
            if (r0 != r1) goto L_0x0022
            com.yeelight.cherry.ui.adapter.GroupDeviceModifyAdapter$d r8 = (com.yeelight.cherry.p141ui.adapter.GroupDeviceModifyAdapter.C5876d) r8
            android.widget.TextView r8 = r8.f11752a
            java.lang.String r0 = "title"
            java.lang.Object r9 = r9.get(r0)
            java.lang.String r9 = r9.toString()
            r8.setText(r9)
            goto L_0x011d
        L_0x0022:
            java.lang.String r2 = "device"
            java.lang.Object r9 = r9.get(r2)
            com.yeelight.yeelib.device.base.c r9 = (com.yeelight.yeelib.device.base.C3010c) r9
            r2 = r8
            com.yeelight.cherry.ui.adapter.GroupDeviceModifyAdapter$c r2 = (com.yeelight.cherry.p141ui.adapter.GroupDeviceModifyAdapter.C5875c) r2
            android.widget.TextView r3 = r2.f11749b
            java.lang.String r4 = r9.mo23210U()
            r3.setText(r4)
            java.lang.String r3 = r9.mo23208T()
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            r6 = 1
            switch(r5) {
                case -443031172: goto L_0x007d;
                case 1201766335: goto L_0x0072;
                case 1201766336: goto L_0x0067;
                case 2102612488: goto L_0x005e;
                case 2102612489: goto L_0x0053;
                case 2146130361: goto L_0x0048;
                default: goto L_0x0046;
            }
        L_0x0046:
            r1 = -1
            goto L_0x0087
        L_0x0048:
            java.lang.String r1 = "yeelink.light.dnlight2"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0051
            goto L_0x0046
        L_0x0051:
            r1 = 5
            goto L_0x0087
        L_0x0053:
            java.lang.String r1 = "yeelink.light.meshbulb2"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x005c
            goto L_0x0046
        L_0x005c:
            r1 = 4
            goto L_0x0087
        L_0x005e:
            java.lang.String r5 = "yeelink.light.meshbulb1"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0087
            goto L_0x0046
        L_0x0067:
            java.lang.String r1 = "yeelink.light.ml2"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0070
            goto L_0x0046
        L_0x0070:
            r1 = 2
            goto L_0x0087
        L_0x0072:
            java.lang.String r1 = "yeelink.light.ml1"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x007b
            goto L_0x0046
        L_0x007b:
            r1 = 1
            goto L_0x0087
        L_0x007d:
            java.lang.String r1 = "yeelink.light.spot1"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0086
            goto L_0x0046
        L_0x0086:
            r1 = 0
        L_0x0087:
            switch(r1) {
                case 0: goto L_0x00b5;
                case 1: goto L_0x00af;
                case 2: goto L_0x00a9;
                case 3: goto L_0x00a3;
                case 4: goto L_0x009d;
                case 5: goto L_0x0094;
                default: goto L_0x008a;
            }
        L_0x008a:
            android.widget.ImageView r1 = r2.f11748a
            int r9 = r9.mo23116F()
            r1.setImageResource(r9)
            goto L_0x00bb
        L_0x0094:
            android.widget.ImageView r9 = r2.f11748a
            r1 = 2131231355(0x7f08027b, float:1.8078789E38)
        L_0x0099:
            r9.setImageResource(r1)
            goto L_0x00bb
        L_0x009d:
            android.widget.ImageView r9 = r2.f11748a
            r1 = 2131231423(0x7f0802bf, float:1.8078927E38)
            goto L_0x0099
        L_0x00a3:
            android.widget.ImageView r9 = r2.f11748a
            r1 = 2131231421(0x7f0802bd, float:1.8078923E38)
            goto L_0x0099
        L_0x00a9:
            android.widget.ImageView r9 = r2.f11748a
            r1 = 2131231429(0x7f0802c5, float:1.8078939E38)
            goto L_0x0099
        L_0x00af:
            android.widget.ImageView r9 = r2.f11748a
            r1 = 2131231427(0x7f0802c3, float:1.8078935E38)
            goto L_0x0099
        L_0x00b5:
            android.widget.ImageView r9 = r2.f11748a
            r1 = 2131231457(0x7f0802e1, float:1.8078996E38)
            goto L_0x0099
        L_0x00bb:
            android.widget.TextView r9 = r2.f11750c
            if (r0 != r6) goto L_0x00ed
            r0 = 2131756179(0x7f100493, float:1.9143258E38)
            r9.setText(r0)
            android.widget.TextView r9 = r2.f11751d
            r0 = 2131231984(0x7f0804f0, float:1.8080064E38)
            r9.setBackgroundResource(r0)
            android.widget.TextView r9 = r2.f11751d
            android.content.res.Resources r0 = r9.getResources()
            r1 = 2131099841(0x7f0600c1, float:1.7812047E38)
            int r0 = r0.getColor(r1)
            r9.setTextColor(r0)
            android.widget.TextView r9 = r2.f11751d
            r0 = 2131756188(0x7f10049c, float:1.9143276E38)
            r9.setText(r0)
            android.widget.TextView r9 = r2.f11751d
            com.yeelight.cherry.ui.adapter.GroupDeviceModifyAdapter$a r0 = new com.yeelight.cherry.ui.adapter.GroupDeviceModifyAdapter$a
            r0.<init>(r8)
            goto L_0x011a
        L_0x00ed:
            r0 = 2131756187(0x7f10049b, float:1.9143274E38)
            r9.setText(r0)
            android.widget.TextView r9 = r2.f11751d
            r0 = 2131231983(0x7f0804ef, float:1.8080062E38)
            r9.setBackgroundResource(r0)
            android.widget.TextView r9 = r2.f11751d
            android.content.res.Resources r0 = r9.getResources()
            r1 = 2131099842(0x7f0600c2, float:1.7812049E38)
            int r0 = r0.getColor(r1)
            r9.setTextColor(r0)
            android.widget.TextView r9 = r2.f11751d
            r0 = 2131756181(0x7f100495, float:1.9143262E38)
            r9.setText(r0)
            android.widget.TextView r9 = r2.f11751d
            com.yeelight.cherry.ui.adapter.GroupDeviceModifyAdapter$b r0 = new com.yeelight.cherry.ui.adapter.GroupDeviceModifyAdapter$b
            r0.<init>(r8)
        L_0x011a:
            r9.setOnClickListener(r0)
        L_0x011d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.adapter.GroupDeviceModifyAdapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1 || i == 2) {
            return new C5875c(this, LayoutInflater.from(viewGroup.getContext()).inflate(C12228R$layout.item_room_device_manage, viewGroup, false));
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
        return new C5876d(this, textView);
    }
}
