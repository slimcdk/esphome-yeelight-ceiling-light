package com.yeelight.cherry.p177ui.adapter;

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
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p153g.C9828a0;
import com.yeelight.yeelib.p186e.C9771f;
import com.yeelight.yeelib.utils.C10547m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.adapter.SceneItemModifyAdapter */
public class SceneItemModifyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    private int f12339a;

    /* renamed from: b */
    private int f12340b;

    /* renamed from: c */
    private int f12341c;

    /* renamed from: d */
    private List<HashMap<String, Object>> f12342d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C9771f f12343e;

    /* renamed from: f */
    private Context f12344f;

    /* renamed from: com.yeelight.cherry.ui.adapter.SceneItemModifyAdapter$a */
    class C5861a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.ViewHolder f12345a;

        C5861a(RecyclerView.ViewHolder viewHolder) {
            this.f12345a = viewHolder;
        }

        public void onClick(View view) {
            SceneItemModifyAdapter.this.m17305e(this.f12345a.getAdapterPosition());
            SceneItemModifyAdapter.this.notifyDataSetChanged();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.SceneItemModifyAdapter$b */
    class C5862b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.ViewHolder f12347a;

        /* renamed from: b */
        final /* synthetic */ C4198d f12348b;

        C5862b(RecyclerView.ViewHolder viewHolder, C4198d dVar) {
            this.f12347a = viewHolder;
            this.f12348b = dVar;
        }

        public void onClick(View view) {
            SceneItemModifyAdapter.this.f12343e.mo26902b(this.f12347a.getAdapterPosition(), this.f12348b.mo23372G());
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.SceneItemModifyAdapter$c */
    class C5863c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ImageView f12350a;

        /* renamed from: b */
        TextView f12351b;

        /* renamed from: c */
        TextView f12352c;

        /* renamed from: d */
        TextView f12353d;

        public C5863c(SceneItemModifyAdapter sceneItemModifyAdapter, View view) {
            super(view);
            this.f12350a = (ImageView) view.findViewById(2131296581);
            this.f12351b = (TextView) view.findViewById(2131296596);
            this.f12352c = (TextView) view.findViewById(2131297362);
            this.f12353d = (TextView) view.findViewById(C11745R$id.device_operate);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.SceneItemModifyAdapter$d */
    class C5864d extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f12354a;

        public C5864d(SceneItemModifyAdapter sceneItemModifyAdapter, View view) {
            super(view);
            this.f12354a = (TextView) view;
        }
    }

    public SceneItemModifyAdapter(List<HashMap<String, Object>> list) {
        this.f12342d = list;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m17305e(int i) {
        HashMap remove = this.f12342d.remove(i);
        if (this.f12342d.size() > 1) {
            if (((Integer) this.f12342d.get(1).get("type")).intValue() == 3) {
                List<HashMap<String, Object>> list = this.f12342d;
                if (((Integer) list.get(list.size() - 1).get("type")).intValue() == 2) {
                    this.f12342d.remove(0);
                    if (remove.get(DddTag.DEVICE) != null) {
                        remove.put("type", 2);
                        remove.remove("scene_bundle_item");
                        this.f12342d.add(1, remove);
                    }
                    notifyDataSetChanged();
                    this.f12340b = 1;
                    this.f12339a = 0;
                    return;
                }
            }
            List<HashMap<String, Object>> list2 = this.f12342d;
            if (((Integer) list2.get(list2.size() - 1).get("type")).intValue() == 1) {
                if (remove.get(DddTag.DEVICE) != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("type", 3);
                    hashMap.put(ScanBarcodeActivity.TITLE, C4297y.f7456e.getResources().getString(2131756159));
                    this.f12342d.add(hashMap);
                    remove.put("type", 2);
                    remove.remove("scene_bundle_item");
                    this.f12342d.add(remove);
                }
                notifyDataSetChanged();
                this.f12339a = this.f12342d.size() - 2;
                this.f12340b = this.f12342d.size() - 1;
            } else if (remove.get(DddTag.DEVICE) == null) {
                this.f12339a--;
                this.f12340b--;
                this.f12341c--;
                notifyItemRemoved(i);
            } else {
                remove.put("type", 2);
                remove.remove("scene_bundle_item");
                this.f12339a--;
                int i2 = this.f12340b - 1;
                this.f12340b = i2;
                this.f12342d.add(i2, remove);
                notifyItemMoved(i, this.f12340b);
            }
        } else {
            if (this.f12342d.size() != 0) {
                this.f12342d.clear();
                if (remove.get(DddTag.DEVICE) != null) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("type", 3);
                    hashMap2.put(ScanBarcodeActivity.TITLE, C4297y.f7456e.getResources().getString(2131756159));
                    this.f12342d.add(hashMap2);
                    remove.put("type", 2);
                    remove.remove("scene_bundle_item");
                    this.f12342d.add(remove);
                }
            }
            notifyDataSetChanged();
        }
    }

    /* renamed from: c */
    public HashMap<String, Object> mo27243c(int i) {
        List<HashMap<String, Object>> list = this.f12342d;
        if (list == null || list.size() <= i || i < 0) {
            return null;
        }
        return this.f12342d.get(i);
    }

    /* renamed from: d */
    public void mo27244d(int i) {
        HashMap remove = this.f12342d.remove(i);
        remove.put("type", 1);
        if (this.f12342d.size() > 1) {
            List<HashMap<String, Object>> list = this.f12342d;
            if (((Integer) list.get(list.size() - 1).get("type")).intValue() == 3) {
                List<HashMap<String, Object>> list2 = this.f12342d;
                list2.remove(list2.size() - 1);
                this.f12342d.add(remove);
                notifyDataSetChanged();
                this.f12339a = this.f12342d.size() - 1;
                this.f12340b = this.f12342d.size() - 1;
                return;
            } else if (((Integer) this.f12342d.get(1).get("type")).intValue() == 2) {
                HashMap hashMap = new HashMap();
                hashMap.put("type", 3);
                hashMap.put(ScanBarcodeActivity.TITLE, C4297y.f7456e.getResources().getString(2131756158));
                this.f12342d.add(0, hashMap);
                this.f12342d.add(1, remove);
                this.f12339a = 1;
                this.f12340b = 3;
            } else {
                int i2 = this.f12339a + 1;
                this.f12339a = i2;
                this.f12340b++;
                notifyItemMoved(i, i2);
                this.f12342d.add(this.f12339a, remove);
                return;
            }
        } else {
            this.f12342d.clear();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("type", 3);
            hashMap2.put(ScanBarcodeActivity.TITLE, C4297y.f7456e.getResources().getString(2131756159));
            this.f12342d.add(hashMap2);
            remove.put("type", 1);
            this.f12342d.add(remove);
        }
        notifyDataSetChanged();
    }

    /* renamed from: f */
    public void mo27245f(int i) {
        this.f12339a = i;
    }

    /* renamed from: g */
    public void mo27246g(int i) {
        this.f12341c = i;
    }

    public int getItemCount() {
        List<HashMap<String, Object>> list = this.f12342d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getItemViewType(int i) {
        HashMap<String, Object> c = mo27243c(i);
        if (c != null) {
            return ((Integer) c.get("type")).intValue();
        }
        return 0;
    }

    /* renamed from: h */
    public void mo27247h(int i) {
        this.f12340b = i;
    }

    /* renamed from: i */
    public void mo27248i(C9771f fVar) {
        this.f12343e = fVar;
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        ImageView imageView;
        TextView textView;
        View.OnClickListener onClickListener;
        HashMap<String, Object> c = mo27243c(i);
        if (c != null) {
            int itemViewType = viewHolder.getItemViewType();
            Resources resources = viewHolder.itemView.getResources();
            if (itemViewType == 3) {
                ((C5864d) viewHolder).f12354a.setText(c.get(ScanBarcodeActivity.TITLE).toString());
                return;
            }
            C4198d dVar = (C4198d) c.get(DddTag.DEVICE);
            C5863c cVar = (C5863c) viewHolder;
            TextView textView2 = cVar.f12351b;
            if (dVar == null) {
                textView2.setText(2131756199);
                imageView = cVar.f12350a;
                i2 = 2131231267;
            } else {
                textView2.setText(dVar.mo23397U());
                imageView = cVar.f12350a;
                i2 = dVar.mo23303F();
            }
            imageView.setImageResource(i2);
            if (itemViewType == 1) {
                cVar.f12352c.setText(String.format(cVar.f12352c.getResources().getString(2131756186), new Object[]{((C9828a0) c.get("scene_bundle_item")).mo31734g()}));
                TextView textView3 = cVar.f12352c;
                textView3.setTextColor(textView3.getResources().getColor(2131099838));
                cVar.f12353d.setBackgroundResource(2131231958);
                TextView textView4 = cVar.f12353d;
                textView4.setTextColor(textView4.getResources().getColor(2131099838));
                cVar.f12353d.setText(resources.getString(2131756164));
                textView = cVar.f12353d;
                onClickListener = new C5861a(viewHolder);
            } else {
                cVar.f12352c.setText(resources.getString(2131756163));
                TextView textView5 = cVar.f12352c;
                textView5.setTextColor(textView5.getResources().getColor(2131099839));
                cVar.f12353d.setBackgroundResource(2131231957);
                TextView textView6 = cVar.f12353d;
                textView6.setTextColor(textView6.getResources().getColor(2131099839));
                cVar.f12353d.setText(resources.getString(2131756157));
                textView = cVar.f12353d;
                onClickListener = new C5862b(viewHolder, dVar);
            }
            textView.setOnClickListener(onClickListener);
        }
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (this.f12344f == null) {
            this.f12344f = viewGroup.getContext();
        }
        if (i == 1 || i == 2) {
            return new C5863c(this, LayoutInflater.from(viewGroup.getContext()).inflate(C11748R$layout.item_room_device_manage, viewGroup, false));
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
        return new C5864d(this, textView);
    }
}
