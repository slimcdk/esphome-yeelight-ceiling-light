package com.yeelight.cherry.p141ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.adapter.AutoSearchAdapter;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import java.util.ArrayList;
import java.util.List;
import p051j4.C9193k;
import p197p3.C10267c;

/* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceDetailActivity */
public class SearchDeviceDetailActivity extends ScanDeviceBaseActivity {

    /* renamed from: f */
    private static final String f11388f = SearchDeviceDetailActivity.class.getSimpleName();

    /* renamed from: d */
    private List<C10267c> f11389d = new ArrayList();

    /* renamed from: e */
    private AutoSearchAdapter f11390e;
    @BindView(2131297385)
    RecyclerView mRvDevice;
    @BindView(2131297591)
    CommonTitleBar mTitleBar;

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public /* synthetic */ void m17066e0(View view) {
        onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public /* synthetic */ void m17067f0(View view) {
        startActivity(new Intent(this, ScanHelpCenterActivity.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public /* synthetic */ void m17068g0(int i, C10267c cVar) {
        mo30859Z(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public void mo30860a0(List<C10267c> list) {
        this.f11389d.clear();
        this.f11389d.addAll(list);
        this.f11390e.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C12228R$layout.activity_search_device_detail);
        C9193k.m22157h(true, this);
        ButterKnife.bind((Activity) this);
        this.mTitleBar.mo36195a(getString(2131755484), new C5829s3(this), new C5834t3(this));
        this.mTitleBar.setTitleTextSize(16);
        this.mTitleBar.setTitleTextColor(2131099840);
        AutoSearchAdapter autoSearchAdapter = new AutoSearchAdapter(this, this.f11389d, 1);
        this.f11390e = autoSearchAdapter;
        autoSearchAdapter.mo31104g(new C5839u3(this));
        this.mRvDevice.setLayoutManager(new LinearLayoutManager(this));
        this.mRvDevice.setAdapter(this.f11390e);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }
}
