package com.yeelight.cherry.p177ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p174b.p175a.C4960c;
import com.yeelight.cherry.p177ui.adapter.AutoSearchAdapter;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceDetailActivity */
public class SearchDeviceDetailActivity extends ScanDeviceBaseActivity {

    /* renamed from: g */
    private static final String f11817g = SearchDeviceDetailActivity.class.getSimpleName();

    /* renamed from: e */
    private List<C4960c> f11818e = new ArrayList();

    /* renamed from: f */
    private AutoSearchAdapter f11819f;
    @BindView(2131297243)
    RecyclerView mRvDevice;
    @BindView(2131297424)
    CommonTitleBar mTitleBar;

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public void mo26880a0(List<C4960c> list) {
        this.f11818e.clear();
        this.f11818e.addAll(list);
        this.f11819f.notifyDataSetChanged();
    }

    /* renamed from: b0 */
    public /* synthetic */ void mo26936b0(View view) {
        onBackPressed();
    }

    /* renamed from: c0 */
    public /* synthetic */ void mo26937c0(View view) {
        startActivity(new Intent(this, ScanHelpCenterActivity.class));
    }

    /* renamed from: d0 */
    public /* synthetic */ void mo26938d0(int i, C4960c cVar) {
        mo26879Z(cVar);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C11748R$layout.activity_search_device_detail);
        C10547m.m25758h(true, this);
        ButterKnife.bind((Activity) this);
        this.mTitleBar.mo32825a(getString(2131755480), new C5797y2(this), new C5793x2(this));
        this.mTitleBar.setTitleTextSize(16);
        this.mTitleBar.setTitleTextColor(2131099837);
        AutoSearchAdapter autoSearchAdapter = new AutoSearchAdapter(this, this.f11818e, 1);
        this.f11819f = autoSearchAdapter;
        autoSearchAdapter.mo27136f(new C5789w2(this));
        this.mRvDevice.setLayoutManager(new LinearLayoutManager(this));
        this.mRvDevice.setAdapter(this.f11819f);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }
}
