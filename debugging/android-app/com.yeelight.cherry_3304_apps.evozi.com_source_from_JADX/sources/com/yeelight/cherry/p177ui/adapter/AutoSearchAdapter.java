package com.yeelight.cherry.p177ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p174b.p175a.C4960c;
import com.yeelight.yeelib.p152f.C4239r;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.adapter.AutoSearchAdapter */
public class AutoSearchAdapter extends RecyclerView.Adapter<DeviceViewHolder> {

    /* renamed from: a */
    private Context f12113a;

    /* renamed from: b */
    private List<C4960c> f12114b;

    /* renamed from: c */
    private C5804a f12115c;

    /* renamed from: d */
    public int f12116d;

    /* renamed from: com.yeelight.cherry.ui.adapter.AutoSearchAdapter$DeviceViewHolder */
    protected static class DeviceViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ImageView f12117a;

        /* renamed from: b */
        TextView f12118b;

        /* renamed from: c */
        TextView f12119c;

        public DeviceViewHolder(@NonNull View view) {
            super(view);
            this.f12117a = (ImageView) view.findViewById(C11745R$id.img_icon);
            this.f12118b = (TextView) view.findViewById(2131297474);
            this.f12119c = (TextView) view.findViewById(C11745R$id.tv_device_count);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.AutoSearchAdapter$a */
    public interface C5804a {
        /* renamed from: a */
        void mo27095a(int i, C4960c cVar);
    }

    public AutoSearchAdapter(Context context, List<C4960c> list, int i) {
        this.f12113a = context;
        this.f12114b = list;
        this.f12116d = i;
    }

    /* renamed from: a */
    private String m17167a(String str) {
        String[] split = str.toLowerCase().split(Constants.COLON_SEPARATOR);
        if (split.length < 2) {
            return "";
        }
        return split[split.length - 2] + Constants.COLON_SEPARATOR + split[split.length - 1];
    }

    /* renamed from: b */
    public String mo27132b(C4960c cVar) {
        return (cVar != null && cVar.mo26057b() == 1) ? m17167a(cVar.mo26058c().get(0).mo23372G()) : "";
    }

    /* renamed from: c */
    public /* synthetic */ void mo27133c(DeviceViewHolder deviceViewHolder, C4960c cVar, View view) {
        C5804a aVar = this.f12115c;
        if (aVar != null) {
            aVar.mo27095a(deviceViewHolder.getAdapterPosition(), cVar);
        }
    }

    /* renamed from: d */
    public void onBindViewHolder(@NonNull DeviceViewHolder deviceViewHolder, int i) {
        C4960c cVar = this.f12114b.get(i);
        String m = C4239r.m11807g().mo23580m(cVar.mo26060e());
        TextView textView = deviceViewHolder.f12118b;
        textView.setText(m + " " + mo27132b(cVar));
        deviceViewHolder.f12117a.setImageResource(cVar.mo26059d());
        int b = cVar.mo26057b();
        deviceViewHolder.f12119c.setVisibility(b > 1 ? 0 : 4);
        deviceViewHolder.f12119c.setText(String.valueOf(b));
        deviceViewHolder.itemView.setOnClickListener(new C5865a(this, deviceViewHolder, cVar));
    }

    @NonNull
    /* renamed from: e */
    public DeviceViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return this.f12116d == 0 ? new DeviceViewHolder(LayoutInflater.from(this.f12113a).inflate(C11748R$layout.item_auto_scan_device, viewGroup, false)) : new DeviceViewHolder(LayoutInflater.from(this.f12113a).inflate(C11748R$layout.item_auto_scan_device_detail, viewGroup, false));
    }

    /* renamed from: f */
    public void mo27136f(C5804a aVar) {
        this.f12115c = aVar;
    }

    public int getItemCount() {
        List<C4960c> list = this.f12114b;
        if (list == null) {
            return 0;
        }
        int i = this.f12116d;
        int size = list.size();
        return i == 0 ? Math.min(size, 3) : size;
    }
}
