package com.yeelight.cherry.p141ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.deviceViewHolder.NetworkViewHolder;
import com.yeelight.yeelib.models.MeshNetWork;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.adapter.NetworkListAdapter */
public class NetworkListAdapter extends RecyclerView.Adapter<NetworkViewHolder> {

    /* renamed from: a */
    private LayoutInflater f11763a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C5881b f11764b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C5882c f11765c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f11766d = -1;

    /* renamed from: e */
    private List<MeshNetWork> f11767e = null;

    /* renamed from: f */
    private int f11768f;

    /* renamed from: com.yeelight.cherry.ui.adapter.NetworkListAdapter$a */
    class C5880a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ NetworkViewHolder f11769a;

        C5880a(NetworkViewHolder networkViewHolder) {
            this.f11769a = networkViewHolder;
        }

        public void onClick(View view) {
            if (this.f11769a.getAdapterPosition() == NetworkListAdapter.this.f11766d) {
                this.f11769a.f11959a.setChecked(false);
                int unused = NetworkListAdapter.this.f11766d = -1;
            } else {
                this.f11769a.f11959a.setChecked(true);
                int a = NetworkListAdapter.this.f11766d;
                int unused2 = NetworkListAdapter.this.f11766d = this.f11769a.getAdapterPosition();
                NetworkListAdapter.this.notifyItemChanged(a);
            }
            if (NetworkListAdapter.this.f11765c != null) {
                NetworkListAdapter.this.f11765c.mo30922a(NetworkListAdapter.this.f11766d);
            }
            if (NetworkListAdapter.this.f11764b != null) {
                NetworkListAdapter.this.f11764b.mo31143a(this.f11769a.getAdapterPosition());
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.NetworkListAdapter$b */
    public interface C5881b {
        /* renamed from: a */
        void mo31143a(int i);
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.NetworkListAdapter$c */
    public interface C5882c {
        /* renamed from: a */
        void mo30922a(int i);
    }

    public NetworkListAdapter(Context context, List<MeshNetWork> list, int i) {
        this.f11763a = LayoutInflater.from(context);
        this.f11767e = list;
        this.f11768f = i;
    }

    /* renamed from: e */
    public void onBindViewHolder(NetworkViewHolder networkViewHolder, int i) {
        MeshNetWork meshNetWork = this.f11767e.get(i);
        networkViewHolder.f11960b.setText(meshNetWork.getName());
        if (meshNetWork.getId() == this.f11768f && this.f11766d == -1) {
            networkViewHolder.f11959a.setChecked(true);
            this.f11766d = i;
            C5882c cVar = this.f11765c;
            if (cVar != null) {
                cVar.mo30922a(i);
            }
        }
        networkViewHolder.itemView.setOnClickListener(new C5880a(networkViewHolder));
        if (i == this.f11766d) {
            networkViewHolder.f11959a.setChecked(true);
        } else {
            networkViewHolder.f11959a.setChecked(false);
        }
        networkViewHolder.f11959a.setClickable(false);
    }

    /* renamed from: f */
    public NetworkViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new NetworkViewHolder(this.f11763a.inflate(C12228R$layout.list_item_select_network, viewGroup, false));
    }

    /* renamed from: g */
    public void mo31141g(C5882c cVar) {
        this.f11765c = cVar;
    }

    public int getItemCount() {
        List<MeshNetWork> list = this.f11767e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
