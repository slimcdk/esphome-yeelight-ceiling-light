package com.yeelight.cherry.p141ui.activity;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.miot.common.device.parser.xml.DddTag;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.adapter.GroupDeviceModifyAdapter;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.device.C6119c;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p051j4.C9193k;
import p170i4.C9113d;

/* renamed from: com.yeelight.cherry.ui.activity.GroupDeviceModifyActivity */
public class GroupDeviceModifyActivity extends BaseActivity {

    /* renamed from: f */
    public static final /* synthetic */ int f10534f = 0;

    /* renamed from: a */
    private GroupDeviceModifyAdapter f10535a;

    /* renamed from: b */
    private List<HashMap<String, Object>> f10536b = new ArrayList();

    /* renamed from: c */
    private List<C3012e> f10537c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C6119c f10538d;

    /* renamed from: e */
    private C9113d f10539e;
    @BindView(2131296669)
    RecyclerView mDeviceList;
    @BindView(2131297591)
    CommonTitleBar mTitleBar;

    /* renamed from: com.yeelight.cherry.ui.activity.GroupDeviceModifyActivity$a */
    class C5327a implements View.OnClickListener {
        C5327a() {
        }

        public void onClick(View view) {
            GroupDeviceModifyActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.GroupDeviceModifyActivity$b */
    class C5328b implements View.OnClickListener {
        C5328b() {
        }

        public void onClick(View view) {
            if (GroupDeviceModifyActivity.this.m16350Y().size() == 0) {
                C9113d.C9118e eVar = new C9113d.C9118e(GroupDeviceModifyActivity.this);
                eVar.mo37179i("" + GroupDeviceModifyActivity.this.getString(2131755277)).mo37177g(GroupDeviceModifyActivity.this.getString(2131755716)).mo37174d(-1, GroupDeviceModifyActivity.this.getString(2131755313), (DialogInterface.OnClickListener) null).mo37172b().show();
                return;
            }
            DeviceDataProvider.m17643y(GroupDeviceModifyActivity.this.f10538d.mo23185G(), GroupDeviceModifyActivity.this.m16350Y());
            GroupDeviceModifyActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.GroupDeviceModifyActivity$c */
    class C5329c implements DialogInterface.OnClickListener {
        C5329c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            GroupDeviceModifyActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.GroupDeviceModifyActivity$d */
    class C5330d extends RecyclerView.ItemDecoration {

        /* renamed from: a */
        private int f10543a;

        /* renamed from: b */
        private Paint f10544b;

        public C5330d(GroupDeviceModifyActivity groupDeviceModifyActivity) {
            Paint paint = new Paint();
            this.f10544b = paint;
            paint.setColor(groupDeviceModifyActivity.getResources().getColor(2131099800));
            this.f10543a = C9193k.m22150a(groupDeviceModifyActivity, 20.0f);
            this.f10544b.setStrokeWidth(2.0f);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            Paint paint;
            float f;
            float f2;
            float f3;
            Canvas canvas2;
            super.onDrawOver(canvas, recyclerView, state);
            for (int i = 0; i < recyclerView.getChildCount(); i++) {
                View childAt = recyclerView.getChildAt(i);
                int width = childAt.getWidth();
                int height = childAt.getHeight();
                float x = childAt.getX();
                float y = childAt.getY();
                RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(childAt);
                if (childViewHolder.getItemViewType() == 3) {
                    canvas.drawLine(x, y, childViewHolder.getAdapterPosition() == 0 ? x + ((float) width) : (float) this.f10543a, y, this.f10544b);
                    f = ((float) height) + y;
                    f2 = x + ((float) width);
                    paint = this.f10544b;
                    canvas2 = canvas;
                    f3 = x;
                } else {
                    f3 = x + ((float) this.f10543a);
                    f = y + ((float) height);
                    f2 = x + ((float) width);
                    paint = this.f10544b;
                    canvas2 = canvas;
                }
                canvas2.drawLine(f3, f, f2, f, paint);
            }
        }
    }

    /* renamed from: X */
    private C9113d m16349X() {
        if (this.f10539e == null) {
            C9113d.C9118e eVar = new C9113d.C9118e(this);
            eVar.mo37179i(getString(2131755233));
            eVar.mo37177g(getString(2131755288));
            eVar.mo37174d(-1, getString(2131755281), new C5329c()).mo37174d(-2, getString(2131755232), (DialogInterface.OnClickListener) null);
            this.f10539e = eVar.mo37172b();
        }
        return this.f10539e;
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public List<String> m16350Y() {
        ArrayList arrayList = new ArrayList();
        for (HashMap next : this.f10536b) {
            if (1 == ((Integer) next.get("type")).intValue()) {
                arrayList.add(((C3010c) next.get(DddTag.DEVICE)).mo23185G());
            }
        }
        return arrayList;
    }

    /* renamed from: Z */
    private void m16351Z() {
        this.f10536b.clear();
        List<C3012e> v0 = YeelightDeviceManager.m7800o0().mo23319v0();
        ArrayList<C3012e> arrayList = new ArrayList<>();
        ArrayList<C3012e> arrayList2 = new ArrayList<>();
        for (C3012e next : v0) {
            if (DeviceDataProvider.m17607T(this.f10538d.mo23185G(), next.mo23185G())) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        HashMap hashMap = new HashMap();
        if (arrayList.size() > 0) {
            hashMap.put("type", 3);
            hashMap.put(ScanBarcodeActivity.TITLE, getString(2131756182));
            this.f10536b.add(hashMap);
            for (C3012e put : arrayList) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("type", 1);
                hashMap2.put(DddTag.DEVICE, put);
                hashMap2.put("name", this.f10538d.mo23210U());
                this.f10536b.add(hashMap2);
            }
        }
        if (arrayList2.size() > 0) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("type", 3);
            hashMap3.put(ScanBarcodeActivity.TITLE, getString(2131756183));
            this.f10536b.add(hashMap3);
            for (C3012e put2 : arrayList2) {
                HashMap hashMap4 = new HashMap();
                hashMap4.put("type", 2);
                hashMap4.put(DddTag.DEVICE, put2);
                this.f10536b.add(hashMap4);
            }
        }
        this.f10535a.mo31127e(arrayList.size());
        this.f10535a.mo31129g(arrayList.size() > 0 ? arrayList.size() + 2 : 1);
        this.f10535a.mo31128f(this.f10536b.size() - 1);
    }

    public void onBackPressed() {
        List<String> Y = m16350Y();
        boolean z = true;
        if (this.f10537c.size() == Y.size()) {
            Iterator<C3012e> it = this.f10537c.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!Y.contains(it.next().mo23185G())) {
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
        }
        if (z) {
            m16349X().show();
        } else {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("com.yeelight.cherry.device_id");
        if (stringExtra == null) {
            AppUtils.m8300u("ROOM_DEBUG", "No Group id!");
            finish();
            return;
        }
        C6119c n0 = YeelightDeviceManager.m7800o0().mo23304n0(stringExtra);
        this.f10538d = n0;
        if (n0 == null) {
            AppUtils.m8300u("ROOM_DEBUG", "Group device is null!!!");
            finish();
            return;
        }
        this.f10537c = n0.mo31753K1();
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_room_device_modify);
        ButterKnife.bind((Activity) this);
        this.mTitleBar.mo36195a(getString(2131755715), new C5327a(), new C5328b());
        this.mTitleBar.setRightTextColor(getResources().getColor(2131099842));
        this.f10535a = new GroupDeviceModifyAdapter(this.f10536b, this.f10538d.mo23210U());
        this.mDeviceList.setLayoutManager(new LinearLayoutManager(this));
        this.mDeviceList.setAdapter(this.f10535a);
        this.mDeviceList.addItemDecoration(new C5330d(this));
        m16351Z();
    }
}
