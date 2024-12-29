package com.yeelight.cherry.p141ui.fragment;

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
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.yeelight.cherry.C12224R$drawable;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.activity.ImageModeSelectionActivity;
import com.yeelight.cherry.p141ui.adapter.RoomRecyclerViewAdapter;
import com.yeelight.yeelib.managers.C8272e;
import com.yeelight.yeelib.managers.C8281l;
import com.yeelight.yeelib.managers.C8293t;
import com.yeelight.yeelib.p142ui.view.C8869a;
import com.yeelight.yeelib.p142ui.view.CommonFragmentDefaultView;
import com.yeelight.yeelib.p142ui.view.YeelightScrollView;
import com.yeelight.yeelib.utils.RVEmptyObserver;
import java.util.ArrayList;
import java.util.List;
import p096s2.C3691f;
import p145d4.C8937a;

/* renamed from: com.yeelight.cherry.ui.fragment.RoomFragment */
public class RoomFragment extends Fragment implements C8281l.C3080a, C8272e.C3063a, C8293t.C8300g {

    /* renamed from: j */
    private static final String f12088j = RoomFragment.class.getSimpleName();

    /* renamed from: a */
    private List<C8937a> f12089a = new ArrayList();

    /* renamed from: b */
    private RoomRecyclerViewAdapter f12090b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public TwinklingRefreshLayout f12091c;

    /* renamed from: d */
    private RecyclerView f12092d;

    /* renamed from: e */
    YeelightScrollView f12093e;

    /* renamed from: f */
    private LinearLayout f12094f;

    /* renamed from: g */
    private TextView f12095g;

    /* renamed from: h */
    private boolean f12096h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Handler f12097i = new Handler(new C5978a());

    /* renamed from: com.yeelight.cherry.ui.fragment.RoomFragment$a */
    class C5978a implements Handler.Callback {
        C5978a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 3) {
                    if (i != 4) {
                        return false;
                    }
                } else if (!RoomFragment.this.f12097i.hasMessages(1)) {
                    RoomFragment.this.f12097i.sendEmptyMessageDelayed(4, 2000);
                    return false;
                } else {
                    RoomFragment.this.f12097i.removeMessages(1);
                    RoomFragment.this.f12097i.sendEmptyMessage(1);
                    return false;
                }
            } else if (RoomFragment.this.f12097i.hasMessages(3)) {
                RoomFragment.this.f12097i.sendEmptyMessageDelayed(1, 1000);
                return false;
            } else {
                RoomFragment.this.m17474O();
            }
            RoomFragment.this.f12091c.mo20222A();
            return false;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.RoomFragment$b */
    class C5979b implements View.OnClickListener {
        C5979b() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(RoomFragment.this.getContext(), ImageModeSelectionActivity.class);
            intent.putExtra("image_type", 2);
            RoomFragment.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.RoomFragment$c */
    class C5980c extends C3691f {
        C5980c() {
        }

        /* renamed from: a */
        public void mo20223a(TwinklingRefreshLayout twinklingRefreshLayout) {
        }

        /* renamed from: c */
        public void mo20225c(TwinklingRefreshLayout twinklingRefreshLayout, float f) {
            super.mo20225c(twinklingRefreshLayout, f);
            RoomFragment.this.f12093e.scrollTo(0, 0);
        }

        /* renamed from: e */
        public void mo20228e(TwinklingRefreshLayout twinklingRefreshLayout) {
            C8293t.m19620n().mo35257s();
            RoomFragment.this.f12097i.sendEmptyMessageDelayed(3, 1000);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ void m17468G() {
        this.f12094f.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m17469H() {
        this.f12095g.setText(getResources().getString(2131755640));
        this.f12094f.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ void m17470J() {
        this.f12094f.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void m17471K() {
        this.f12095g.setText(getResources().getString(2131755640));
        this.f12094f.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ void m17472M() {
        this.f12095g.setText(getResources().getString(2131755646));
        this.f12094f.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ void m17473N() {
        this.f12089a.clear();
        this.f12089a.addAll(C8293t.m19620n().mo35255o());
        RoomRecyclerViewAdapter roomRecyclerViewAdapter = this.f12090b;
        if (roomRecyclerViewAdapter != null) {
            roomRecyclerViewAdapter.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public void m17474O() {
        this.f12092d.post(new C6013r(this));
    }

    /* renamed from: I */
    public void mo23265I() {
        getActivity().runOnUiThread(new C6017v(this));
        this.f12096h = true;
    }

    /* renamed from: c */
    public void mo23281c(String str) {
        m17474O();
    }

    /* renamed from: d */
    public void mo31299d() {
        if (!this.f12096h) {
            this.f12094f.post(new C6015t(this));
        }
    }

    /* renamed from: e */
    public void mo31300e() {
        Runnable runnable;
        LinearLayout linearLayout;
        m17474O();
        this.f12097i.sendEmptyMessage(1);
        if (!this.f12096h) {
            linearLayout = this.f12094f;
            runnable = new C6016u(this);
        } else {
            linearLayout = this.f12094f;
            runnable = new C6018w(this);
        }
        linearLayout.post(runnable);
    }

    /* renamed from: i */
    public void mo23294i(int i) {
        this.f12096h = false;
        C8293t.m19620n().mo35257s();
        this.f12094f.post(new C6014s(this));
    }

    /* renamed from: j */
    public void mo23296j() {
    }

    public void onAttach(Context context) {
        super.onAttach(context);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C12228R$layout.fragment_room_list, viewGroup, false);
        CommonFragmentDefaultView commonFragmentDefaultView = (CommonFragmentDefaultView) inflate.findViewById(2131296738);
        commonFragmentDefaultView.mo36194a(C12224R$drawable.icon_yeelight_default_image_room, 2131756240, 2131756239, 2131756235, new C5979b());
        this.f12093e = (YeelightScrollView) inflate.findViewById(C12225R$id.base_layout);
        this.f12094f = (LinearLayout) inflate.findViewById(C12225R$id.layout_alarm);
        this.f12095g = (TextView) inflate.findViewById(C12225R$id.tv_alarm);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C12225R$id.list);
        this.f12092d = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        RoomRecyclerViewAdapter roomRecyclerViewAdapter = new RoomRecyclerViewAdapter(this.f12089a);
        this.f12090b = roomRecyclerViewAdapter;
        this.f12092d.setAdapter(roomRecyclerViewAdapter);
        RoomRecyclerViewAdapter roomRecyclerViewAdapter2 = this.f12090b;
        RecyclerView recyclerView2 = this.f12092d;
        roomRecyclerViewAdapter2.registerAdapterDataObserver(new RVEmptyObserver(recyclerView2, commonFragmentDefaultView, recyclerView2));
        this.f12091c = (TwinklingRefreshLayout) inflate.findViewById(2131297292);
        C8869a aVar = new C8869a(getContext());
        this.f12091c.setOverScrollRefreshShow(false);
        this.f12091c.setHeaderView(aVar);
        this.f12091c.setEnableLoadmore(false);
        this.f12091c.setEnableOverScroll(true);
        this.f12091c.setOnRefreshListener(new C5980c());
        return inflate;
    }

    public void onDetach() {
        super.onDetach();
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            C8293t.m19620n().mo35257s();
        }
    }

    public void onPause() {
        super.onPause();
        C8272e.m19511b().mo35212m(this);
        C8293t.m19620n().mo35263z((C8293t.C8300g) null);
    }

    public void onResume() {
        super.onResume();
        C8272e.m19511b().mo35210j(this);
        C8293t.m19620n().mo35263z(this);
        C8293t.m19620n().mo35257s();
    }

    public void onStart() {
        super.onStart();
        m17474O();
    }

    public void onStop() {
        super.onStop();
        this.f12091c.mo20222A();
    }

    /* renamed from: v */
    public void mo23318v() {
    }
}
