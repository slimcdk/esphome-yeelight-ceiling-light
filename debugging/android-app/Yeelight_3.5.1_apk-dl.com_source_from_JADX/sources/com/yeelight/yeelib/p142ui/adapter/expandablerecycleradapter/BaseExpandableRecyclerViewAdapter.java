package com.yeelight.yeelib.p142ui.adapter.expandablerecycleradapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.yeelight.yeelib.p142ui.adapter.expandablerecycleradapter.BaseExpandableRecyclerViewAdapter.BaseGroupViewHolder;
import com.yeelight.yeelib.p142ui.adapter.expandablerecycleradapter.BaseExpandableRecyclerViewAdapter.C8749f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.yeelight.yeelib.ui.adapter.expandablerecycleradapter.BaseExpandableRecyclerViewAdapter */
public abstract class BaseExpandableRecyclerViewAdapter<GroupBean extends C8749f<ChildBean>, ChildBean, GroupViewHolder extends BaseGroupViewHolder, ChildViewHolder extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: g */
    private static final Object f15487g = new Object();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Set<GroupBean> f15488a = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C8750g<GroupBean, ChildBean> f15489b;

    /* renamed from: c */
    private boolean f15490c;

    /* renamed from: d */
    private boolean f15491d;

    /* renamed from: e */
    private ViewProducer f15492e;

    /* renamed from: f */
    private ViewProducer f15493f;

    /* renamed from: com.yeelight.yeelib.ui.adapter.expandablerecycleradapter.BaseExpandableRecyclerViewAdapter$BaseGroupViewHolder */
    public static abstract class BaseGroupViewHolder extends RecyclerView.ViewHolder {
        public BaseGroupViewHolder(View view) {
            super(view);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo31124a(RecyclerView.Adapter adapter, boolean z);
    }

    /* renamed from: com.yeelight.yeelib.ui.adapter.expandablerecycleradapter.BaseExpandableRecyclerViewAdapter$a */
    class C8744a extends RecyclerView.AdapterDataObserver {
        C8744a() {
        }

        public void onChanged() {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < BaseExpandableRecyclerViewAdapter.this.mo31109f(); i++) {
                C8749f h = BaseExpandableRecyclerViewAdapter.this.mo31110h(i);
                if (BaseExpandableRecyclerViewAdapter.this.f15488a.contains(h)) {
                    arrayList.add(h);
                }
            }
            BaseExpandableRecyclerViewAdapter.this.f15488a.clear();
            BaseExpandableRecyclerViewAdapter.this.f15488a.addAll(arrayList);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.adapter.expandablerecycleradapter.BaseExpandableRecyclerViewAdapter$b */
    class C8745b implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ C8749f f15495a;

        C8745b(C8749f fVar) {
            this.f15495a = fVar;
        }

        public boolean onLongClick(View view) {
            if (BaseExpandableRecyclerViewAdapter.this.f15489b != null) {
                return BaseExpandableRecyclerViewAdapter.this.f15489b.mo36067a(this.f15495a);
            }
            return false;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.adapter.expandablerecycleradapter.BaseExpandableRecyclerViewAdapter$c */
    class C8746c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8749f f15497a;

        C8746c(C8749f fVar) {
            this.f15497a = fVar;
        }

        public void onClick(View view) {
            if (BaseExpandableRecyclerViewAdapter.this.f15489b != null) {
                BaseExpandableRecyclerViewAdapter.this.f15489b.mo36069c(this.f15497a);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.adapter.expandablerecycleradapter.BaseExpandableRecyclerViewAdapter$d */
    class C8747d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8749f f15499a;

        /* renamed from: b */
        final /* synthetic */ BaseGroupViewHolder f15500b;

        C8747d(C8749f fVar, BaseGroupViewHolder baseGroupViewHolder) {
            this.f15499a = fVar;
            this.f15500b = baseGroupViewHolder;
        }

        public void onClick(View view) {
            boolean contains = BaseExpandableRecyclerViewAdapter.this.f15488a.contains(this.f15499a);
            if (BaseExpandableRecyclerViewAdapter.this.f15489b == null || !BaseExpandableRecyclerViewAdapter.this.f15489b.mo36068b(this.f15499a, contains)) {
                int adapterPosition = this.f15500b.getAdapterPosition();
                this.f15500b.mo31124a(BaseExpandableRecyclerViewAdapter.this, !contains);
                if (contains) {
                    BaseExpandableRecyclerViewAdapter.this.f15488a.remove(this.f15499a);
                    BaseExpandableRecyclerViewAdapter.this.notifyItemRangeRemoved(adapterPosition + 1, this.f15499a.getChildCount());
                    return;
                }
                BaseExpandableRecyclerViewAdapter.this.f15488a.add(this.f15499a);
                BaseExpandableRecyclerViewAdapter.this.notifyItemRangeInserted(adapterPosition + 1, this.f15499a.getChildCount());
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.adapter.expandablerecycleradapter.BaseExpandableRecyclerViewAdapter$e */
    class C8748e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8749f f15502a;

        /* renamed from: b */
        final /* synthetic */ Object f15503b;

        C8748e(C8749f fVar, Object obj) {
            this.f15502a = fVar;
            this.f15503b = obj;
        }

        public void onClick(View view) {
            if (BaseExpandableRecyclerViewAdapter.this.f15489b != null) {
                BaseExpandableRecyclerViewAdapter.this.f15489b.mo36070d(this.f15502a, this.f15503b);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.adapter.expandablerecycleradapter.BaseExpandableRecyclerViewAdapter$f */
    public interface C8749f<ChildBean> {
        /* renamed from: a */
        boolean mo36064a();

        ChildBean getChildAt(int i);

        int getChildCount();
    }

    /* renamed from: com.yeelight.yeelib.ui.adapter.expandablerecycleradapter.BaseExpandableRecyclerViewAdapter$g */
    public interface C8750g<GroupBean extends C8749f, ChildBean> {
        /* renamed from: a */
        boolean mo36067a(GroupBean groupbean);

        /* renamed from: b */
        boolean mo36068b(GroupBean groupbean, boolean z);

        /* renamed from: c */
        void mo36069c(GroupBean groupbean);

        /* renamed from: d */
        void mo36070d(GroupBean groupbean, ChildBean childbean);
    }

    public BaseExpandableRecyclerViewAdapter() {
        registerAdapterDataObserver(new C8744a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo36050c(ChildViewHolder childviewholder, GroupBean groupbean, ChildBean childbean, List<Object> list) {
        childviewholder.itemView.setOnClickListener(new C8748e(groupbean, childbean));
        mo36056l(childviewholder, groupbean, childbean, list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo36051d(GroupViewHolder groupviewholder, GroupBean groupbean, List<Object> list) {
        View view;
        View.OnClickListener onClickListener;
        if (list == null || list.size() == 0) {
            groupviewholder.itemView.setOnLongClickListener(new C8745b(groupbean));
            if (!groupbean.mo36064a()) {
                view = groupviewholder.itemView;
                onClickListener = new C8746c(groupbean);
            } else {
                view = groupviewholder.itemView;
                onClickListener = new C8747d(groupbean, groupviewholder);
            }
            view.setOnClickListener(onClickListener);
            mo31112m(groupviewholder, groupbean, mo36055j(groupbean));
            return;
        }
        if (list.contains(f15487g)) {
            groupviewholder.mo31124a(this, mo36055j(groupbean));
            if (list.size() == 1) {
                return;
            }
        }
        mo36057n(groupviewholder, groupbean, mo36055j(groupbean), list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo36052e(GroupBean groupbean, ChildBean childbean) {
        return 0;
    }

    /* renamed from: f */
    public abstract int mo31109f();

    /* renamed from: g */
    public final int mo36053g(@NonNull GroupBean groupbean) {
        for (int i = 0; i < mo31109f(); i++) {
            if (groupbean.equals(mo31110h(i))) {
                return i;
            }
        }
        return -1;
    }

    public final int getItemCount() {
        int f = mo31109f();
        if (f != 0 || this.f15492e == null) {
            this.f15490c = false;
            for (GroupBean groupbean : this.f15488a) {
                if (mo36053g(groupbean) < 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("invalid index in expandgroupList : ");
                    sb.append(groupbean);
                } else {
                    f += groupbean.getChildCount();
                }
            }
            return this.f15493f != null ? f + 1 : f;
        }
        this.f15490c = true;
        return (this.f15493f == null || !this.f15491d) ? 1 : 2;
    }

    public final int getItemViewType(int i) {
        int e;
        int i2;
        if (this.f15490c) {
            if (i != 0 || !this.f15491d || this.f15493f == null) {
                return BasicMeasure.EXACTLY;
            }
            return 536870912;
        } else if (i == 0 && this.f15493f != null) {
            return 536870912;
        } else {
            int[] r = mo36059r(i);
            C8749f h = mo31110h(r[0]);
            if (r[1] < 0) {
                e = mo36054i(h);
                if ((e & 2013265920) == 0) {
                    i2 = 268435456;
                } else {
                    throw new IllegalStateException(String.format(Locale.getDefault(), "GroupType [%d] conflits with MASK [%d]", new Object[]{Integer.valueOf(e), 2013265920}));
                }
            } else {
                e = mo36052e(h, h.getChildAt(r[1]));
                if ((e & 2013265920) == 0) {
                    i2 = 134217728;
                } else {
                    throw new IllegalStateException(String.format(Locale.getDefault(), "ChildType [%d] conflits with MASK [%d]", new Object[]{Integer.valueOf(e), 2013265920}));
                }
            }
            return e | i2;
        }
    }

    /* renamed from: h */
    public abstract GroupBean mo31110h(int i);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo36054i(GroupBean groupbean) {
        return 0;
    }

    /* renamed from: j */
    public final boolean mo36055j(GroupBean groupbean) {
        return this.f15488a.contains(groupbean);
    }

    /* renamed from: k */
    public abstract void mo31111k(ChildViewHolder childviewholder, GroupBean groupbean, ChildBean childbean);

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo36056l(ChildViewHolder childviewholder, GroupBean groupbean, ChildBean childbean, List<Object> list) {
        mo31111k(childviewholder, groupbean, childbean);
    }

    /* renamed from: m */
    public abstract void mo31112m(GroupViewHolder groupviewholder, GroupBean groupbean, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo36057n(GroupViewHolder groupviewholder, GroupBean groupbean, boolean z, List<Object> list) {
        mo31112m(groupviewholder, groupbean, z);
    }

    /* renamed from: o */
    public abstract ChildViewHolder mo31113o(ViewGroup viewGroup, int i);

    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        onBindViewHolder(viewHolder, i, (List<Object>) null);
    }

    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        ViewProducer viewProducer;
        int itemViewType = viewHolder.getItemViewType() & 2013265920;
        if (itemViewType == 134217728) {
            int[] r = mo36059r(i);
            C8749f h = mo31110h(r[0]);
            mo36050c(viewHolder, h, h.getChildAt(r[1]), list);
        } else if (itemViewType != 268435456) {
            if (itemViewType == 536870912) {
                viewProducer = this.f15493f;
            } else if (itemViewType == 1073741824) {
                viewProducer = this.f15492e;
            } else {
                throw new IllegalStateException(String.format(Locale.getDefault(), "Illegal view type : position [%d] ,itemViewType[%d]", new Object[]{Integer.valueOf(i), Integer.valueOf(viewHolder.getItemViewType())}));
            }
            viewProducer.mo36072b(viewHolder);
        } else {
            mo36051d((BaseGroupViewHolder) viewHolder, mo31110h(mo36059r(i)[0]), list);
        }
    }

    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = 2013265920 & i;
        if (i2 == 134217728) {
            return mo31113o(viewGroup, i ^ 134217728);
        }
        if (i2 == 268435456) {
            return mo31114p(viewGroup, i ^ 268435456);
        }
        if (i2 == 536870912) {
            return this.f15493f.mo36071a(viewGroup);
        }
        if (i2 == 1073741824) {
            return this.f15492e.mo36071a(viewGroup);
        }
        throw new IllegalStateException(String.format(Locale.getDefault(), "Illegal view type : viewType[%d]", new Object[]{Integer.valueOf(i)}));
    }

    /* renamed from: p */
    public abstract GroupViewHolder mo31114p(ViewGroup viewGroup, int i);

    /* renamed from: q */
    public void mo36058q(Set<GroupBean> set) {
        this.f15488a = set;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final int[] mo36059r(int i) {
        if (this.f15493f != null) {
            i--;
        }
        int[] iArr = {-1, -1};
        int f = mo31109f();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= f) {
                break;
            } else if (i3 == i) {
                iArr[0] = i2;
                iArr[1] = -1;
                break;
            } else {
                C8749f h = mo31110h(i2);
                if (this.f15488a.contains(h)) {
                    int childCount = h.getChildCount();
                    int i4 = i - i3;
                    if (childCount >= i4) {
                        iArr[0] = i2;
                        iArr[1] = i4 - 1;
                        break;
                    }
                    i3 += childCount;
                }
                i3++;
                i2++;
            }
        }
        return iArr;
    }
}
