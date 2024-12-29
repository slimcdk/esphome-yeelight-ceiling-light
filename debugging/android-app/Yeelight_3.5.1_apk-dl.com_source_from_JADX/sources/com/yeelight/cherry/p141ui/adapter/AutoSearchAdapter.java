package com.yeelight.cherry.p141ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.managers.C3088r;
import java.util.List;
import p190o3.C9775a;
import p197p3.C10267c;

/* renamed from: com.yeelight.cherry.ui.adapter.AutoSearchAdapter */
public class AutoSearchAdapter extends RecyclerView.Adapter<DeviceViewHolder> {

    /* renamed from: a */
    private Context f11713a;

    /* renamed from: b */
    private List<C10267c> f11714b;

    /* renamed from: c */
    private C5867a f11715c;

    /* renamed from: d */
    public int f11716d;

    /* renamed from: com.yeelight.cherry.ui.adapter.AutoSearchAdapter$DeviceViewHolder */
    protected static class DeviceViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ImageView f11717a;

        /* renamed from: b */
        TextView f11718b;

        /* renamed from: c */
        TextView f11719c;

        public DeviceViewHolder(@NonNull View view) {
            super(view);
            this.f11717a = (ImageView) view.findViewById(C12225R$id.img_icon);
            this.f11718b = (TextView) view.findViewById(2131297649);
            this.f11719c = (TextView) view.findViewById(C12225R$id.tv_device_count);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.AutoSearchAdapter$a */
    public interface C5867a {
        /* renamed from: a */
        void mo31047a(int i, C10267c cVar);
    }

    public AutoSearchAdapter(Context context, List<C10267c> list, int i) {
        this.f11713a = context;
        this.f11714b = list;
        this.f11716d = i;
    }

    /* renamed from: b */
    private String m17204b(String str) {
        String[] split = str.toLowerCase().split(Constants.COLON_SEPARATOR);
        if (split.length < 2) {
            return "";
        }
        return split[split.length - 2] + Constants.COLON_SEPARATOR + split[split.length - 1];
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m17205d(DeviceViewHolder deviceViewHolder, C10267c cVar, View view) {
        C5867a aVar = this.f11715c;
        if (aVar != null) {
            aVar.mo31047a(deviceViewHolder.getAdapterPosition(), cVar);
        }
    }

    /* renamed from: c */
    public String mo31101c(C10267c cVar) {
        return (cVar != null && cVar.mo41745b() == 1) ? m17204b(cVar.mo41746c().get(0).mo23185G()) : "";
    }

    /* renamed from: e */
    public void onBindViewHolder(@NonNull DeviceViewHolder deviceViewHolder, int i) {
        C10267c cVar = this.f11714b.get(i);
        String m = C3088r.m8117g().mo23473m(cVar.mo41748e());
        TextView textView = deviceViewHolder.f11718b;
        textView.setText(m + " " + mo31101c(cVar));
        deviceViewHolder.f11717a.setImageResource(cVar.mo41747d());
        int b = cVar.mo41745b();
        deviceViewHolder.f11719c.setVisibility(b > 1 ? 0 : 4);
        deviceViewHolder.f11719c.setText(String.valueOf(b));
        deviceViewHolder.itemView.setOnClickListener(new C9775a(this, deviceViewHolder, cVar));
    }

    @NonNull
    /* renamed from: f */
    public DeviceViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return this.f11716d == 0 ? new DeviceViewHolder(LayoutInflater.from(this.f11713a).inflate(C12228R$layout.item_auto_scan_device, viewGroup, false)) : new DeviceViewHolder(LayoutInflater.from(this.f11713a).inflate(C12228R$layout.item_auto_scan_device_detail, viewGroup, false));
    }

    /* renamed from: g */
    public void mo31104g(C5867a aVar) {
        this.f11715c = aVar;
    }

    public int getItemCount() {
        List<C10267c> list = this.f11714b;
        if (list == null) {
            return 0;
        }
        int i = this.f11716d;
        int size = list.size();
        return i == 0 ? Math.min(size, 3) : size;
    }
}
