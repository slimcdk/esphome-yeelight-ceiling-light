package com.yeelight.cherry.p141ui.adapter;

import android.content.Context;
import android.content.res.Resources;
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
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.models.C8330u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p051j4.C9193k;
import p237z3.C12146f;

/* renamed from: com.yeelight.cherry.ui.adapter.SceneItemModifyAdapter */
public class SceneItemModifyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    private int f11940a;

    /* renamed from: b */
    private int f11941b;

    /* renamed from: c */
    private int f11942c;

    /* renamed from: d */
    private List<HashMap<String, Object>> f11943d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C12146f f11944e;

    /* renamed from: f */
    private Context f11945f;

    /* renamed from: com.yeelight.cherry.ui.adapter.SceneItemModifyAdapter$a */
    class C5924a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.ViewHolder f11946a;

        C5924a(RecyclerView.ViewHolder viewHolder) {
            this.f11946a = viewHolder;
        }

        public void onClick(View view) {
            SceneItemModifyAdapter.this.m17348e(this.f11946a.getAdapterPosition());
            SceneItemModifyAdapter.this.notifyDataSetChanged();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.SceneItemModifyAdapter$b */
    class C5925b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.ViewHolder f11948a;

        /* renamed from: b */
        final /* synthetic */ C3010c f11949b;

        C5925b(RecyclerView.ViewHolder viewHolder, C3010c cVar) {
            this.f11948a = viewHolder;
            this.f11949b = cVar;
        }

        public void onClick(View view) {
            SceneItemModifyAdapter.this.f11944e.mo30879b(this.f11948a.getAdapterPosition(), this.f11949b.mo23185G());
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.SceneItemModifyAdapter$c */
    class C5926c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ImageView f11951a;

        /* renamed from: b */
        TextView f11952b;

        /* renamed from: c */
        TextView f11953c;

        /* renamed from: d */
        TextView f11954d;

        public C5926c(SceneItemModifyAdapter sceneItemModifyAdapter, View view) {
            super(view);
            this.f11951a = (ImageView) view.findViewById(2131296659);
            this.f11952b = (TextView) view.findViewById(2131296674);
            this.f11953c = (TextView) view.findViewById(2131297517);
            this.f11954d = (TextView) view.findViewById(C12225R$id.device_operate);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.SceneItemModifyAdapter$d */
    class C5927d extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f11955a;

        public C5927d(SceneItemModifyAdapter sceneItemModifyAdapter, View view) {
            super(view);
            this.f11955a = (TextView) view;
        }
    }

    public SceneItemModifyAdapter(List<HashMap<String, Object>> list) {
        this.f11943d = list;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m17348e(int i) {
        HashMap remove = this.f11943d.remove(i);
        if (this.f11943d.size() > 1) {
            if (((Integer) this.f11943d.get(1).get("type")).intValue() == 3) {
                List<HashMap<String, Object>> list = this.f11943d;
                if (((Integer) list.get(list.size() - 1).get("type")).intValue() == 2) {
                    this.f11943d.remove(0);
                    if (remove.get(DddTag.DEVICE) != null) {
                        remove.put("type", 2);
                        remove.remove("scene_bundle_item");
                        this.f11943d.add(1, remove);
                    }
                    notifyDataSetChanged();
                    this.f11941b = 1;
                    this.f11940a = 0;
                    return;
                }
            }
            List<HashMap<String, Object>> list2 = this.f11943d;
            if (((Integer) list2.get(list2.size() - 1).get("type")).intValue() == 1) {
                if (remove.get(DddTag.DEVICE) != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("type", 3);
                    hashMap.put(ScanBarcodeActivity.TITLE, C3108x.f4951e.getResources().getString(2131756183));
                    this.f11943d.add(hashMap);
                    remove.put("type", 2);
                    remove.remove("scene_bundle_item");
                    this.f11943d.add(remove);
                }
                notifyDataSetChanged();
                this.f11940a = this.f11943d.size() - 2;
                this.f11941b = this.f11943d.size() - 1;
            } else if (remove.get(DddTag.DEVICE) == null) {
                this.f11940a--;
                this.f11941b--;
                this.f11942c--;
                notifyItemRemoved(i);
            } else {
                remove.put("type", 2);
                remove.remove("scene_bundle_item");
                this.f11940a--;
                int i2 = this.f11941b - 1;
                this.f11941b = i2;
                this.f11943d.add(i2, remove);
                notifyItemMoved(i, this.f11941b);
            }
        } else {
            if (this.f11943d.size() != 0) {
                this.f11943d.clear();
                if (remove.get(DddTag.DEVICE) != null) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("type", 3);
                    hashMap2.put(ScanBarcodeActivity.TITLE, C3108x.f4951e.getResources().getString(2131756183));
                    this.f11943d.add(hashMap2);
                    remove.put("type", 2);
                    remove.remove("scene_bundle_item");
                    this.f11943d.add(remove);
                }
            }
            notifyDataSetChanged();
        }
    }

    /* renamed from: c */
    public HashMap<String, Object> mo31208c(int i) {
        List<HashMap<String, Object>> list = this.f11943d;
        if (list == null || list.size() <= i || i < 0) {
            return null;
        }
        return this.f11943d.get(i);
    }

    /* renamed from: d */
    public void mo31209d(int i) {
        HashMap remove = this.f11943d.remove(i);
        remove.put("type", 1);
        if (this.f11943d.size() > 1) {
            List<HashMap<String, Object>> list = this.f11943d;
            if (((Integer) list.get(list.size() - 1).get("type")).intValue() == 3) {
                List<HashMap<String, Object>> list2 = this.f11943d;
                list2.remove(list2.size() - 1);
                this.f11943d.add(remove);
                notifyDataSetChanged();
                this.f11940a = this.f11943d.size() - 1;
                this.f11941b = this.f11943d.size() - 1;
                return;
            } else if (((Integer) this.f11943d.get(1).get("type")).intValue() == 2) {
                HashMap hashMap = new HashMap();
                hashMap.put("type", 3);
                hashMap.put(ScanBarcodeActivity.TITLE, C3108x.f4951e.getResources().getString(2131756182));
                this.f11943d.add(0, hashMap);
                this.f11943d.add(1, remove);
                this.f11940a = 1;
                this.f11941b = 3;
            } else {
                int i2 = this.f11940a + 1;
                this.f11940a = i2;
                this.f11941b++;
                notifyItemMoved(i, i2);
                this.f11943d.add(this.f11940a, remove);
                return;
            }
        } else {
            this.f11943d.clear();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("type", 3);
            hashMap2.put(ScanBarcodeActivity.TITLE, C3108x.f4951e.getResources().getString(2131756183));
            this.f11943d.add(hashMap2);
            remove.put("type", 1);
            this.f11943d.add(remove);
        }
        notifyDataSetChanged();
    }

    /* renamed from: f */
    public void mo31210f(int i) {
        this.f11940a = i;
    }

    /* renamed from: g */
    public void mo31211g(int i) {
        this.f11942c = i;
    }

    public int getItemCount() {
        List<HashMap<String, Object>> list = this.f11943d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getItemViewType(int i) {
        HashMap<String, Object> c = mo31208c(i);
        if (c != null) {
            return ((Integer) c.get("type")).intValue();
        }
        return 0;
    }

    /* renamed from: h */
    public void mo31212h(int i) {
        this.f11941b = i;
    }

    /* renamed from: i */
    public void mo31213i(C12146f fVar) {
        this.f11944e = fVar;
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        ImageView imageView;
        TextView textView;
        View.OnClickListener onClickListener;
        HashMap<String, Object> c = mo31208c(i);
        if (c != null) {
            int itemViewType = viewHolder.getItemViewType();
            Resources resources = viewHolder.itemView.getResources();
            if (itemViewType == 3) {
                ((C5927d) viewHolder).f11955a.setText(c.get(ScanBarcodeActivity.TITLE).toString());
                return;
            }
            C3010c cVar = (C3010c) c.get(DddTag.DEVICE);
            C5926c cVar2 = (C5926c) viewHolder;
            TextView textView2 = cVar2.f11952b;
            if (cVar == null) {
                textView2.setText(2131756224);
                imageView = cVar2.f11951a;
                i2 = 2131231281;
            } else {
                textView2.setText(cVar.mo23210U());
                imageView = cVar2.f11951a;
                i2 = cVar.mo23116F();
            }
            imageView.setImageResource(i2);
            if (itemViewType == 1) {
                cVar2.f11953c.setText(String.format(cVar2.f11953c.getResources().getString(2131756211), new Object[]{((C8330u) c.get("scene_bundle_item")).mo35484g()}));
                TextView textView3 = cVar2.f11953c;
                textView3.setTextColor(textView3.getResources().getColor(2131099841));
                cVar2.f11954d.setBackgroundResource(2131231984);
                TextView textView4 = cVar2.f11954d;
                textView4.setTextColor(textView4.getResources().getColor(2131099841));
                cVar2.f11954d.setText(resources.getString(2131756188));
                textView = cVar2.f11954d;
                onClickListener = new C5924a(viewHolder);
            } else {
                cVar2.f11953c.setText(resources.getString(2131756187));
                TextView textView5 = cVar2.f11953c;
                textView5.setTextColor(textView5.getResources().getColor(2131099842));
                cVar2.f11954d.setBackgroundResource(2131231983);
                TextView textView6 = cVar2.f11954d;
                textView6.setTextColor(textView6.getResources().getColor(2131099842));
                cVar2.f11954d.setText(resources.getString(2131756181));
                textView = cVar2.f11954d;
                onClickListener = new C5925b(viewHolder, cVar);
            }
            textView.setOnClickListener(onClickListener);
        }
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (this.f11945f == null) {
            this.f11945f = viewGroup.getContext();
        }
        if (i == 1 || i == 2) {
            return new C5926c(this, LayoutInflater.from(viewGroup.getContext()).inflate(C12228R$layout.item_room_device_manage, viewGroup, false));
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
        return new C5927d(this, textView);
    }
}
