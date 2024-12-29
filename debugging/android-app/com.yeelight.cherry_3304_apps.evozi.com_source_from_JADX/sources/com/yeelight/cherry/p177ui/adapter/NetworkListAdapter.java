package com.yeelight.cherry.p177ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p177ui.deviceViewHolder.NetworkViewHolder;
import com.yeelight.yeelib.p153g.C9850s;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.adapter.NetworkListAdapter */
public class NetworkListAdapter extends RecyclerView.Adapter<NetworkViewHolder> {

    /* renamed from: a */
    private LayoutInflater f12163a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C5818b f12164b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C5819c f12165c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f12166d = -1;

    /* renamed from: e */
    private List<C9850s> f12167e = null;

    /* renamed from: f */
    private int f12168f;

    /* renamed from: com.yeelight.cherry.ui.adapter.NetworkListAdapter$a */
    class C5817a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ NetworkViewHolder f12169a;

        C5817a(NetworkViewHolder networkViewHolder) {
            this.f12169a = networkViewHolder;
        }

        public void onClick(View view) {
            if (this.f12169a.getAdapterPosition() == NetworkListAdapter.this.f12166d) {
                this.f12169a.f12365a.setChecked(false);
                int unused = NetworkListAdapter.this.f12166d = -1;
            } else {
                this.f12169a.f12365a.setChecked(true);
                int a = NetworkListAdapter.this.f12166d;
                int unused2 = NetworkListAdapter.this.f12166d = this.f12169a.getAdapterPosition();
                NetworkListAdapter.this.notifyItemChanged(a);
            }
            if (NetworkListAdapter.this.f12165c != null) {
                NetworkListAdapter.this.f12165c.mo26957a(NetworkListAdapter.this.f12166d);
            }
            if (NetworkListAdapter.this.f12164b != null) {
                NetworkListAdapter.this.f12164b.mo27176a(this.f12169a.getAdapterPosition());
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.NetworkListAdapter$b */
    public interface C5818b {
        /* renamed from: a */
        void mo27176a(int i);
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.NetworkListAdapter$c */
    public interface C5819c {
        /* renamed from: a */
        void mo26957a(int i);
    }

    public NetworkListAdapter(Context context, List<C9850s> list, int i) {
        this.f12163a = LayoutInflater.from(context);
        this.f12167e = list;
        this.f12168f = i;
    }

    /* renamed from: e */
    public void onBindViewHolder(NetworkViewHolder networkViewHolder, int i) {
        C9850s sVar = this.f12167e.get(i);
        networkViewHolder.f12366b.setText(sVar.mo31821b());
        if (sVar.mo31820a() == this.f12168f && this.f12166d == -1) {
            networkViewHolder.f12365a.setChecked(true);
            this.f12166d = i;
            C5819c cVar = this.f12165c;
            if (cVar != null) {
                cVar.mo26957a(i);
            }
        }
        networkViewHolder.itemView.setOnClickListener(new C5817a(networkViewHolder));
        if (i == this.f12166d) {
            networkViewHolder.f12365a.setChecked(true);
        } else {
            networkViewHolder.f12365a.setChecked(false);
        }
        networkViewHolder.f12365a.setClickable(false);
    }

    /* renamed from: f */
    public NetworkViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new NetworkViewHolder(this.f12163a.inflate(C11748R$layout.list_item_select_network, viewGroup, false));
    }

    /* renamed from: g */
    public void mo27174g(C5819c cVar) {
        this.f12165c = cVar;
    }

    public int getItemCount() {
        List<C9850s> list = this.f12167e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
