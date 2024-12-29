package com.yeelight.cherry.p177ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.lcodecore.tkrefreshlayout.C3392f;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.yeelight.cherry.C11744R$drawable;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p177ui.activity.ImageModeSelectionActivity;
import com.yeelight.cherry.p177ui.adapter.RoomRecyclerViewAdapter;
import com.yeelight.yeelib.p152f.C4230l;
import com.yeelight.yeelib.p152f.C9784e;
import com.yeelight.yeelib.p152f.C9812t;
import com.yeelight.yeelib.p190i.C9875a;
import com.yeelight.yeelib.p194ui.view.C10493b;
import com.yeelight.yeelib.p194ui.view.CommonFragmentDefaultView;
import com.yeelight.yeelib.p194ui.view.YeelightScrollView;
import com.yeelight.yeelib.utils.RVEmptyObserver;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.fragment.RoomFragment */
public class RoomFragment extends Fragment implements C4230l.C4231a, C9784e.C4213a, C9812t.C9819g {

    /* renamed from: j */
    private static final String f12495j = RoomFragment.class.getSimpleName();

    /* renamed from: a */
    private List<C9875a> f12496a = new ArrayList();

    /* renamed from: b */
    private RoomRecyclerViewAdapter f12497b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public TwinklingRefreshLayout f12498c;

    /* renamed from: d */
    private RecyclerView f12499d;

    /* renamed from: e */
    YeelightScrollView f12500e;

    /* renamed from: f */
    private LinearLayout f12501f;

    /* renamed from: g */
    private TextView f12502g;

    /* renamed from: h */
    private boolean f12503h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Handler f12504i = new Handler(new C5918a());

    /* renamed from: com.yeelight.cherry.ui.fragment.RoomFragment$a */
    class C5918a implements Handler.Callback {
        C5918a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 3) {
                    if (i != 4) {
                        return false;
                    }
                } else if (!RoomFragment.this.f12504i.hasMessages(1)) {
                    RoomFragment.this.f12504i.sendEmptyMessageDelayed(4, 2000);
                    return false;
                } else {
                    RoomFragment.this.f12504i.removeMessages(1);
                    RoomFragment.this.f12504i.sendEmptyMessage(1);
                    return false;
                }
            } else if (RoomFragment.this.f12504i.hasMessages(3)) {
                RoomFragment.this.f12504i.sendEmptyMessageDelayed(1, 1000);
                return false;
            } else {
                RoomFragment.this.m17402C();
            }
            RoomFragment.this.f12498c.mo18609A();
            return false;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.RoomFragment$b */
    class C5919b implements View.OnClickListener {
        C5919b() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(RoomFragment.this.getContext(), ImageModeSelectionActivity.class);
            intent.putExtra("image_type", 2);
            RoomFragment.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.RoomFragment$c */
    class C5920c extends C3392f {
        C5920c() {
        }

        /* renamed from: a */
        public void mo18610a(TwinklingRefreshLayout twinklingRefreshLayout) {
        }

        /* renamed from: c */
        public void mo18612c(TwinklingRefreshLayout twinklingRefreshLayout, float f) {
            super.mo18612c(twinklingRefreshLayout, f);
            RoomFragment.this.f12500e.scrollTo(0, 0);
        }

        /* renamed from: e */
        public void mo18615e(TwinklingRefreshLayout twinklingRefreshLayout) {
            C9812t.m23832j().mo31687n();
            RoomFragment.this.f12504i.sendEmptyMessageDelayed(3, 1000);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m17402C() {
        this.f12499d.post(new C5940m(this));
    }

    /* renamed from: A */
    public /* synthetic */ void mo27345A() {
        this.f12502g.setText(getResources().getString(2131755640));
        this.f12501f.setVisibility(0);
    }

    /* renamed from: B */
    public /* synthetic */ void mo27346B() {
        this.f12496a.clear();
        this.f12496a.addAll(C9812t.m23832j().mo31685k());
        RoomRecyclerViewAdapter roomRecyclerViewAdapter = this.f12497b;
        if (roomRecyclerViewAdapter != null) {
            roomRecyclerViewAdapter.notifyDataSetChanged();
        }
    }

    /* renamed from: I */
    public void mo23487I() {
        getActivity().runOnUiThread(new C5938k(this));
        this.f12503h = true;
    }

    /* renamed from: b */
    public void mo27347b() {
        if (!this.f12503h) {
            this.f12501f.post(new C5941n(this));
        }
    }

    /* renamed from: c */
    public void mo23557c(String str) {
        m17402C();
    }

    /* renamed from: d */
    public void mo27348d() {
        Runnable runnable;
        LinearLayout linearLayout;
        m17402C();
        this.f12504i.sendEmptyMessage(1);
        if (!this.f12503h) {
            linearLayout = this.f12501f;
            runnable = new C5939l(this);
        } else {
            linearLayout = this.f12501f;
            runnable = new C5943p(this);
        }
        linearLayout.post(runnable);
    }

    /* renamed from: h */
    public void mo23488h(int i) {
        this.f12503h = false;
        C9812t.m23832j().mo31687n();
        this.f12501f.post(new C5942o(this));
    }

    /* renamed from: j */
    public void mo23489j() {
    }

    public void onAttach(Context context) {
        super.onAttach(context);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C11748R$layout.fragment_room_list, viewGroup, false);
        CommonFragmentDefaultView commonFragmentDefaultView = (CommonFragmentDefaultView) inflate.findViewById(2131296644);
        commonFragmentDefaultView.mo32824a(C11744R$drawable.icon_yeelight_default_image_room, 2131756215, 2131756214, 2131756210, new C5919b());
        this.f12500e = (YeelightScrollView) inflate.findViewById(C11745R$id.base_layout);
        this.f12501f = (LinearLayout) inflate.findViewById(C11745R$id.layout_alarm);
        this.f12502g = (TextView) inflate.findViewById(C11745R$id.tv_alarm);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C11745R$id.list);
        this.f12499d = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        RoomRecyclerViewAdapter roomRecyclerViewAdapter = new RoomRecyclerViewAdapter(this.f12496a);
        this.f12497b = roomRecyclerViewAdapter;
        this.f12499d.setAdapter(roomRecyclerViewAdapter);
        RoomRecyclerViewAdapter roomRecyclerViewAdapter2 = this.f12497b;
        RecyclerView recyclerView2 = this.f12499d;
        roomRecyclerViewAdapter2.registerAdapterDataObserver(new RVEmptyObserver(recyclerView2, commonFragmentDefaultView, recyclerView2));
        this.f12498c = (TwinklingRefreshLayout) inflate.findViewById(2131297152);
        C10493b bVar = new C10493b(getContext());
        this.f12498c.setOverScrollRefreshShow(false);
        this.f12498c.setHeaderView(bVar);
        this.f12498c.setEnableLoadmore(false);
        this.f12498c.setEnableOverScroll(true);
        this.f12498c.setOnRefreshListener(new C5920c());
        return inflate;
    }

    public void onDetach() {
        super.onDetach();
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            C9812t.m23832j().mo31687n();
        }
    }

    public void onPause() {
        super.onPause();
        C9784e.m23711b().mo31636m(this);
        C9812t.m23832j().mo31693w((C9812t.C9819g) null);
    }

    public void onResume() {
        super.onResume();
        C9784e.m23711b().mo31634j(this);
        C9812t.m23832j().mo31693w(this);
        C9812t.m23832j().mo31687n();
    }

    public void onStart() {
        super.onStart();
        m17402C();
    }

    public void onStop() {
        super.onStop();
        this.f12498c.mo18609A();
    }

    /* renamed from: u */
    public /* synthetic */ void mo27349u() {
        this.f12501f.setVisibility(8);
    }

    /* renamed from: v */
    public void mo23490v() {
    }

    /* renamed from: w */
    public /* synthetic */ void mo27350w() {
        this.f12502g.setText(getResources().getString(2131755634));
        this.f12501f.setVisibility(0);
    }

    /* renamed from: x */
    public /* synthetic */ void mo27351x() {
        this.f12501f.setVisibility(8);
    }

    /* renamed from: z */
    public /* synthetic */ void mo27352z() {
        this.f12502g.setText(getResources().getString(2131755634));
        this.f12501f.setVisibility(0);
    }
}
