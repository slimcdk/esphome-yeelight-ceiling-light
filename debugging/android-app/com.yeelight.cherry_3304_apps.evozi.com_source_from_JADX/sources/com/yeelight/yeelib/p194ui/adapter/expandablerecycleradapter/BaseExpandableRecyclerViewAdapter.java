package com.yeelight.yeelib.p194ui.adapter.expandablerecycleradapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.yeelight.yeelib.p194ui.adapter.expandablerecycleradapter.BaseExpandableRecyclerViewAdapter.BaseGroupViewHolder;
import com.yeelight.yeelib.p194ui.adapter.expandablerecycleradapter.BaseExpandableRecyclerViewAdapter.C10368f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.yeelight.yeelib.ui.adapter.expandablerecycleradapter.BaseExpandableRecyclerViewAdapter */
public abstract class BaseExpandableRecyclerViewAdapter<GroupBean extends C10368f<ChildBean>, ChildBean, GroupViewHolder extends BaseGroupViewHolder, ChildViewHolder extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: g */
    private static final Object f19222g = new Object();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Set<GroupBean> f19223a = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C10369g<GroupBean, ChildBean> f19224b;

    /* renamed from: c */
    private boolean f19225c;

    /* renamed from: d */
    private boolean f19226d;

    /* renamed from: e */
    private ViewProducer f19227e;

    /* renamed from: f */
    private ViewProducer f19228f;

    /* renamed from: com.yeelight.yeelib.ui.adapter.expandablerecycleradapter.BaseExpandableRecyclerViewAdapter$BaseGroupViewHolder */
    public static abstract class BaseGroupViewHolder extends RecyclerView.ViewHolder {
        public BaseGroupViewHolder(View view) {
            super(view);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo27156a(RecyclerView.Adapter adapter, boolean z);
    }

    /* renamed from: com.yeelight.yeelib.ui.adapter.expandablerecycleradapter.BaseExpandableRecyclerViewAdapter$a */
    class C10363a extends RecyclerView.AdapterDataObserver {
        C10363a() {
        }

        public void onChanged() {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < BaseExpandableRecyclerViewAdapter.this.mo27141f(); i++) {
                C10368f h = BaseExpandableRecyclerViewAdapter.this.mo27142h(i);
                if (BaseExpandableRecyclerViewAdapter.this.f19223a.contains(h)) {
                    arrayList.add(h);
                }
            }
            BaseExpandableRecyclerViewAdapter.this.f19223a.clear();
            BaseExpandableRecyclerViewAdapter.this.f19223a.addAll(arrayList);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.adapter.expandablerecycleradapter.BaseExpandableRecyclerViewAdapter$b */
    class C10364b implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ C10368f f19230a;

        C10364b(C10368f fVar) {
            this.f19230a = fVar;
        }

        public boolean onLongClick(View view) {
            if (BaseExpandableRecyclerViewAdapter.this.f19224b != null) {
                return BaseExpandableRecyclerViewAdapter.this.f19224b.mo32689a(this.f19230a);
            }
            return false;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.adapter.expandablerecycleradapter.BaseExpandableRecyclerViewAdapter$c */
    class C10365c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10368f f19232a;

        C10365c(C10368f fVar) {
            this.f19232a = fVar;
        }

        public void onClick(View view) {
            if (BaseExpandableRecyclerViewAdapter.this.f19224b != null) {
                BaseExpandableRecyclerViewAdapter.this.f19224b.mo32691c(this.f19232a);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.adapter.expandablerecycleradapter.BaseExpandableRecyclerViewAdapter$d */
    class C10366d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10368f f19234a;

        /* renamed from: b */
        final /* synthetic */ BaseGroupViewHolder f19235b;

        C10366d(C10368f fVar, BaseGroupViewHolder baseGroupViewHolder) {
            this.f19234a = fVar;
            this.f19235b = baseGroupViewHolder;
        }

        public void onClick(View view) {
            boolean contains = BaseExpandableRecyclerViewAdapter.this.f19223a.contains(this.f19234a);
            if (BaseExpandableRecyclerViewAdapter.this.f19224b == null || !BaseExpandableRecyclerViewAdapter.this.f19224b.mo32690b(this.f19234a, contains)) {
                int adapterPosition = this.f19235b.getAdapterPosition();
                this.f19235b.mo27156a(BaseExpandableRecyclerViewAdapter.this, !contains);
                if (contains) {
                    BaseExpandableRecyclerViewAdapter.this.f19223a.remove(this.f19234a);
                    BaseExpandableRecyclerViewAdapter.this.notifyItemRangeRemoved(adapterPosition + 1, this.f19234a.getChildCount());
                    return;
                }
                BaseExpandableRecyclerViewAdapter.this.f19223a.add(this.f19234a);
                BaseExpandableRecyclerViewAdapter.this.notifyItemRangeInserted(adapterPosition + 1, this.f19234a.getChildCount());
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.adapter.expandablerecycleradapter.BaseExpandableRecyclerViewAdapter$e */
    class C10367e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10368f f19237a;

        /* renamed from: b */
        final /* synthetic */ Object f19238b;

        C10367e(C10368f fVar, Object obj) {
            this.f19237a = fVar;
            this.f19238b = obj;
        }

        public void onClick(View view) {
            if (BaseExpandableRecyclerViewAdapter.this.f19224b != null) {
                BaseExpandableRecyclerViewAdapter.this.f19224b.mo32692d(this.f19237a, this.f19238b);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.adapter.expandablerecycleradapter.BaseExpandableRecyclerViewAdapter$f */
    public interface C10368f<ChildBean> {
        /* renamed from: a */
        boolean mo26046a();

        ChildBean getChildAt(int i);

        int getChildCount();
    }

    /* renamed from: com.yeelight.yeelib.ui.adapter.expandablerecycleradapter.BaseExpandableRecyclerViewAdapter$g */
    public interface C10369g<GroupBean extends C10368f, ChildBean> {
        /* renamed from: a */
        boolean mo32689a(GroupBean groupbean);

        /* renamed from: b */
        boolean mo32690b(GroupBean groupbean, boolean z);

        /* renamed from: c */
        void mo32691c(GroupBean groupbean);

        /* renamed from: d */
        void mo32692d(GroupBean groupbean, ChildBean childbean);
    }

    public BaseExpandableRecyclerViewAdapter() {
        registerAdapterDataObserver(new C10363a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo32675c(ChildViewHolder childviewholder, GroupBean groupbean, ChildBean childbean, List<Object> list) {
        childviewholder.itemView.setOnClickListener(new C10367e(groupbean, childbean));
        mo32681l(childviewholder, groupbean, childbean, list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo32676d(GroupViewHolder groupviewholder, GroupBean groupbean, List<Object> list) {
        View view;
        View.OnClickListener onClickListener;
        if (list == null || list.size() == 0) {
            groupviewholder.itemView.setOnLongClickListener(new C10364b(groupbean));
            if (!groupbean.mo26046a()) {
                view = groupviewholder.itemView;
                onClickListener = new C10365c(groupbean);
            } else {
                view = groupviewholder.itemView;
                onClickListener = new C10366d(groupbean, groupviewholder);
            }
            view.setOnClickListener(onClickListener);
            mo27144m(groupviewholder, groupbean, mo32680j(groupbean));
            return;
        }
        if (list.contains(f19222g)) {
            groupviewholder.mo27156a(this, mo32680j(groupbean));
            if (list.size() == 1) {
                return;
            }
        }
        mo32682n(groupviewholder, groupbean, mo32680j(groupbean), list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo32677e(GroupBean groupbean, ChildBean childbean) {
        return 0;
    }

    /* renamed from: f */
    public abstract int mo27141f();

    /* renamed from: g */
    public final int mo32678g(@NonNull GroupBean groupbean) {
        for (int i = 0; i < mo27141f(); i++) {
            if (groupbean.equals(mo27142h(i))) {
                return i;
            }
        }
        return -1;
    }

    public final int getItemCount() {
        int f = mo27141f();
        if (f != 0 || this.f19227e == null) {
            this.f19225c = false;
            for (GroupBean groupbean : this.f19223a) {
                if (mo32678g(groupbean) < 0) {
                    "invalid index in expandgroupList : " + groupbean;
                } else {
                    f += groupbean.getChildCount();
                }
            }
            return this.f19228f != null ? f + 1 : f;
        }
        this.f19225c = true;
        return (this.f19228f == null || !this.f19226d) ? 1 : 2;
    }

    public final int getItemViewType(int i) {
        int e;
        int i2;
        if (this.f19225c) {
            return (i != 0 || !this.f19226d || this.f19228f == null) ? 1073741824 : 536870912;
        }
        if (i == 0 && this.f19228f != null) {
            return 536870912;
        }
        int[] r = mo32684r(i);
        C10368f h = mo27142h(r[0]);
        if (r[1] < 0) {
            e = mo32679i(h);
            if ((e & 2013265920) == 0) {
                i2 = 268435456;
            } else {
                throw new IllegalStateException(String.format(Locale.getDefault(), "GroupType [%d] conflits with MASK [%d]", new Object[]{Integer.valueOf(e), 2013265920}));
            }
        } else {
            e = mo32677e(h, h.getChildAt(r[1]));
            if ((e & 2013265920) == 0) {
                i2 = 134217728;
            } else {
                throw new IllegalStateException(String.format(Locale.getDefault(), "ChildType [%d] conflits with MASK [%d]", new Object[]{Integer.valueOf(e), 2013265920}));
            }
        }
        return e | i2;
    }

    /* renamed from: h */
    public abstract GroupBean mo27142h(int i);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo32679i(GroupBean groupbean) {
        return 0;
    }

    /* renamed from: j */
    public final boolean mo32680j(GroupBean groupbean) {
        return this.f19223a.contains(groupbean);
    }

    /* renamed from: k */
    public abstract void mo27143k(ChildViewHolder childviewholder, GroupBean groupbean, ChildBean childbean);

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo32681l(ChildViewHolder childviewholder, GroupBean groupbean, ChildBean childbean, List<Object> list) {
        mo27143k(childviewholder, groupbean, childbean);
    }

    /* renamed from: m */
    public abstract void mo27144m(GroupViewHolder groupviewholder, GroupBean groupbean, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo32682n(GroupViewHolder groupviewholder, GroupBean groupbean, boolean z, List<Object> list) {
        mo27144m(groupviewholder, groupbean, z);
    }

    /* renamed from: o */
    public abstract ChildViewHolder mo27145o(ViewGroup viewGroup, int i);

    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        onBindViewHolder(viewHolder, i, (List<Object>) null);
    }

    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        ViewProducer viewProducer;
        int itemViewType = viewHolder.getItemViewType() & 2013265920;
        if (itemViewType == 134217728) {
            int[] r = mo32684r(i);
            C10368f h = mo27142h(r[0]);
            mo32675c(viewHolder, h, h.getChildAt(r[1]), list);
        } else if (itemViewType != 268435456) {
            if (itemViewType == 536870912) {
                viewProducer = this.f19228f;
            } else if (itemViewType == 1073741824) {
                viewProducer = this.f19227e;
            } else {
                throw new IllegalStateException(String.format(Locale.getDefault(), "Illegal view type : position [%d] ,itemViewType[%d]", new Object[]{Integer.valueOf(i), Integer.valueOf(viewHolder.getItemViewType())}));
            }
            viewProducer.mo32694b(viewHolder);
        } else {
            mo32676d((BaseGroupViewHolder) viewHolder, mo27142h(mo32684r(i)[0]), list);
        }
    }

    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = 2013265920 & i;
        if (i2 == 134217728) {
            return mo27145o(viewGroup, i ^ 134217728);
        }
        if (i2 == 268435456) {
            return mo27146p(viewGroup, i ^ 268435456);
        }
        if (i2 == 536870912) {
            return this.f19228f.mo32693a(viewGroup);
        }
        if (i2 == 1073741824) {
            return this.f19227e.mo32693a(viewGroup);
        }
        throw new IllegalStateException(String.format(Locale.getDefault(), "Illegal view type : viewType[%d]", new Object[]{Integer.valueOf(i)}));
    }

    /* renamed from: p */
    public abstract GroupViewHolder mo27146p(ViewGroup viewGroup, int i);

    /* renamed from: q */
    public void mo32683q(Set<GroupBean> set) {
        this.f19223a = set;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final int[] mo32684r(int i) {
        if (this.f19228f != null) {
            i--;
        }
        int[] iArr = {-1, -1};
        int f = mo27141f();
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
                C10368f h = mo27142h(i2);
                if (this.f19223a.contains(h)) {
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
