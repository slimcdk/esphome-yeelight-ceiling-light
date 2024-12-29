package com.yeelight.yeelib.p142ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.C3112v;
import com.yeelight.yeelib.models.C8321m;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.nativelib.NativeLightMix;
import com.yeelight.yeelib.p142ui.adapter.RecommendSceneAdapter;
import com.yeelight.yeelib.p142ui.widget.C8891a;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.List;
import p051j4.C9193k;
import p223w3.C11627r;
import p227x3.C11972i;

/* renamed from: com.yeelight.yeelib.ui.fragment.RecommendSceneFragment */
public class RecommendSceneFragment extends Fragment {

    /* renamed from: a */
    RecyclerView f15558a;

    /* renamed from: b */
    private View f15559b;

    /* renamed from: c */
    private LinearLayoutManager f15560c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public RecommendSceneAdapter f15561d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C3012e f15562e;

    /* renamed from: f */
    private boolean f15563f;

    /* renamed from: g */
    private String f15564g;

    /* renamed from: h */
    private int f15565h = -1;

    /* renamed from: com.yeelight.yeelib.ui.fragment.RecommendSceneFragment$a */
    class C8764a extends RecyclerView.ItemDecoration {
        C8764a(RecommendSceneFragment recommendSceneFragment) {
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            super.getItemOffsets(rect, view, recyclerView, state);
            rect.set(0, 0, 0, C9193k.m22151b(recyclerView.getContext(), 1.0f));
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            super.onDraw(canvas, recyclerView, state);
            int childCount = recyclerView.getChildCount();
            int paddingLeft = recyclerView.getPaddingLeft();
            int measuredWidth = recyclerView.getMeasuredWidth() - recyclerView.getPaddingRight();
            Paint paint = new Paint();
            paint.setColor(Color.parseColor("#EEEEEE"));
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                int bottom = childAt.getBottom() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                canvas.drawRect((float) paddingLeft, (float) bottom, (float) measuredWidth, (float) (C9193k.m22151b(recyclerView.getContext(), 1.0f) + bottom), paint);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.fragment.RecommendSceneFragment$b */
    class C8765b implements RecommendSceneAdapter.C8743b {

        /* renamed from: com.yeelight.yeelib.ui.fragment.RecommendSceneFragment$b$a */
        class C8766a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C8891a f15567a;

            C8766a(C8765b bVar, C8891a aVar) {
                this.f15567a = aVar;
            }

            public void onClick(View view) {
                this.f15567a.dismiss();
            }
        }

        C8765b() {
        }

        /* renamed from: a */
        public void mo36049a(int i, C8321m mVar) {
            if (RecommendSceneFragment.this.f15562e.mo23221d0().mo31572X()) {
                int b = C11972i.m30708f(RecommendSceneFragment.this.f15562e.mo23144i1()).mo42547b();
                int a = C11972i.m30708f(RecommendSceneFragment.this.f15562e.mo23144i1()).mo42546a();
                if (mVar.mo35419D() && (mVar.mo35441h() > a || mVar.mo35441h() < b)) {
                    View inflate = View.inflate(RecommendSceneFragment.this.getActivity(), R$layout.kid_mode_not_support_layout, (ViewGroup) null);
                    if (inflate != null) {
                        C8891a a2 = new C8891a.C8893b(RecommendSceneFragment.this.getContext()).mo36655a();
                        ((TextView) inflate.findViewById(R$id.msg_kid_mode_no_support)).setText(String.format(RecommendSceneFragment.this.getResources().getString(R$string.custom_knob_custom_kidmode_notice), new Object[]{Integer.valueOf(mVar.mo35441h())}));
                        ((Button) inflate.findViewById(R$id.btn_kid_mode_no_cancel)).setOnClickListener(new C8766a(this, a2));
                        a2.mo36648e(inflate);
                        a2.show();
                        return;
                    }
                    return;
                }
            }
            RecommendSceneFragment.this.m20677z(mVar);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.fragment.RecommendSceneFragment$c */
    class C8767c implements C3112v.C3119g {
        C8767c() {
        }

        /* renamed from: a */
        public void mo23579a(String str) {
        }

        /* renamed from: g */
        public void mo23580g() {
        }

        public void onRefresh() {
        }

        /* renamed from: r */
        public void mo23582r(boolean z, List<C8321m> list) {
            RecommendSceneFragment.this.f15561d.mo36046d(list);
        }

        /* renamed from: s */
        public void mo23583s(String str) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m20677z(C8321m mVar) {
        if (this.f15563f) {
            Intent intent = new Intent();
            intent.putExtra("scene", mVar.mo35451r());
            intent.putExtra("com.yeelight.cherry.device_id", this.f15562e.mo23185G());
            intent.putExtra("scene_type", 0);
            intent.putExtra("scene_name", mVar.mo35450q());
            intent.putExtra("position", this.f15565h);
            getActivity().setResult(-1, intent);
            getActivity().finish();
            return;
        }
        C3012e eVar = this.f15562e;
        if (eVar instanceof C11627r) {
            C8327s b = C8327s.m19803b(mVar);
            int g = mVar.mo35440g();
            if (g != -1) {
                b.mo35427L(NativeLightMix.color_rgb_trans((char) Color.red(g), (char) Color.green(g), (char) Color.blue(g)));
                this.f15562e.mo23168x1(b);
                Toast.makeText(getActivity(), R$string.common_text_apply_success, 0).show();
            }
            eVar = this.f15562e;
        }
        eVar.mo23168x1(mVar);
        Toast.makeText(getActivity(), R$string.common_text_apply_success, 0).show();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(R$layout.fragment_scene, viewGroup, false);
        this.f15559b = inflate;
        this.f15558a = (RecyclerView) inflate.findViewById(R$id.recycle_view);
        C3012e r0 = YeelightDeviceManager.m7804r0(getArguments().getString("com.yeelight.cherry.device_id"));
        this.f15562e = r0;
        if (r0 == null) {
            AppUtils.m8300u("RecommendSceneFragment", "Device shouldn't be null!!!");
        }
        this.f15564g = this.f15562e.mo23144i1();
        this.f15563f = getArguments().getBoolean("start_for_result", false);
        this.f15565h = getArguments().getInt("position", -1);
        return this.f15559b;
    }

    public void onResume() {
        super.onResume();
        C3112v.m8242u().mo23562m(this.f15564g, new C8767c(), true);
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        this.f15560c = linearLayoutManager;
        this.f15558a.setLayoutManager(linearLayoutManager);
        this.f15558a.setItemAnimator(new DefaultItemAnimator());
        RecommendSceneAdapter recommendSceneAdapter = new RecommendSceneAdapter();
        this.f15561d = recommendSceneAdapter;
        this.f15558a.setAdapter(recommendSceneAdapter);
        this.f15558a.addItemDecoration(new C8764a(this));
        this.f15561d.mo36047e(new C8765b());
    }
}
