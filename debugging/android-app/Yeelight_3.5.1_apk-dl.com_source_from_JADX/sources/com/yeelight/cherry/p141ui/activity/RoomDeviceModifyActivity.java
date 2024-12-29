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
import butterknife.OnClick;
import com.miot.common.device.parser.xml.DddTag;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.adapter.RoomDeviceModifyAdapter;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.device.C6169f;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.managers.C8293t;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p051j4.C9193k;
import p145d4.C8937a;
import p170i4.C9113d;

/* renamed from: com.yeelight.cherry.ui.activity.RoomDeviceModifyActivity */
public class RoomDeviceModifyActivity extends BaseActivity {

    /* renamed from: a */
    private RoomDeviceModifyAdapter f11231a;

    /* renamed from: b */
    private List<HashMap<String, Object>> f11232b = new ArrayList();

    /* renamed from: c */
    private C6169f f11233c;

    /* renamed from: d */
    private C9113d f11234d;
    @BindView(2131296669)
    RecyclerView mDeviceList;

    /* renamed from: com.yeelight.cherry.ui.activity.RoomDeviceModifyActivity$a */
    class C5616a implements DialogInterface.OnClickListener {
        C5616a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            RoomDeviceModifyActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.RoomDeviceModifyActivity$b */
    class C5617b extends RecyclerView.ItemDecoration {

        /* renamed from: a */
        private int f11236a;

        /* renamed from: b */
        private Paint f11237b;

        public C5617b(RoomDeviceModifyActivity roomDeviceModifyActivity) {
            Paint paint = new Paint();
            this.f11237b = paint;
            paint.setColor(roomDeviceModifyActivity.getResources().getColor(2131099800));
            this.f11236a = C9193k.m22150a(roomDeviceModifyActivity, 20.0f);
            this.f11237b.setStrokeWidth(2.0f);
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
                    canvas.drawLine(x, y, childViewHolder.getAdapterPosition() == 0 ? x + ((float) width) : (float) this.f11236a, y, this.f11237b);
                    f = ((float) height) + y;
                    f2 = x + ((float) width);
                    paint = this.f11237b;
                    canvas2 = canvas;
                    f3 = x;
                } else {
                    f3 = x + ((float) this.f11236a);
                    f = y + ((float) height);
                    f2 = x + ((float) width);
                    paint = this.f11237b;
                    canvas2 = canvas;
                }
                canvas2.drawLine(f3, f, f2, f, paint);
            }
        }
    }

    /* renamed from: V */
    private C9113d m16936V() {
        if (this.f11234d == null) {
            C9113d.C9118e eVar = new C9113d.C9118e(this);
            eVar.mo37179i(getString(2131755233));
            eVar.mo37177g(getString(2131755288));
            eVar.mo37174d(-1, getString(2131755281), new C5616a()).mo37174d(-2, getString(2131755232), (DialogInterface.OnClickListener) null);
            this.f11234d = eVar.mo37172b();
        }
        return this.f11234d;
    }

    /* renamed from: W */
    private void m16937W() {
        this.f11232b.clear();
        List<C3012e> w0 = YeelightDeviceManager.m7800o0().mo23321w0();
        ArrayList<C3012e> arrayList = new ArrayList<>();
        ArrayList<C3012e> arrayList2 = new ArrayList<>();
        for (C3012e next : w0) {
            if (next.mo23217Z() == null || !next.mo23217Z().equals(this.f11233c.mo23185G())) {
                arrayList2.add(next);
            } else {
                arrayList.add(next);
            }
        }
        HashMap hashMap = new HashMap();
        if (arrayList.size() > 0) {
            hashMap.put("type", 3);
            hashMap.put(ScanBarcodeActivity.TITLE, getString(2131756182));
            this.f11232b.add(hashMap);
            for (C3012e put : arrayList) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("type", 1);
                hashMap2.put(DddTag.DEVICE, put);
                hashMap2.put("name", this.f11233c.mo23210U());
                this.f11232b.add(hashMap2);
            }
        }
        if (arrayList2.size() > 0) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("type", 3);
            hashMap3.put(ScanBarcodeActivity.TITLE, getString(2131756183));
            this.f11232b.add(hashMap3);
            for (C3012e put2 : arrayList2) {
                HashMap hashMap4 = new HashMap();
                hashMap4.put("type", 2);
                hashMap4.put(DddTag.DEVICE, put2);
                this.f11232b.add(hashMap4);
            }
        }
        this.f11231a.mo31180g(arrayList.size());
        this.f11231a.mo31182i(arrayList.size() > 0 ? arrayList.size() + 2 : 1);
        this.f11231a.mo31181h(this.f11232b.size() - 1);
    }

    @OnClick({2131296926})
    public void back() {
        onBackPressed();
    }

    public void onBackPressed() {
        if (this.f11231a.mo31179d().isEmpty()) {
            finish();
        } else {
            m16936V().show();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("com.yeelight.cherry.device_id");
        if (stringExtra == null) {
            AppUtils.m8300u("ROOM_DEBUG", "No room id!");
            finish();
            return;
        }
        C6169f J0 = YeelightDeviceManager.m7800o0().mo23268J0(stringExtra);
        this.f11233c = J0;
        if (J0 == null) {
            AppUtils.m8300u("ROOM_DEBUG", "Room device is null!!!");
            finish();
            return;
        }
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_room_device_modify);
        ButterKnife.bind((Activity) this);
        this.f11231a = new RoomDeviceModifyAdapter(this.f11232b, this.f11233c.mo23210U());
        this.mDeviceList.setLayoutManager(new LinearLayoutManager(this));
        this.mDeviceList.setAdapter(this.f11231a);
        this.mDeviceList.addItemDecoration(new C5617b(this));
        m16937W();
    }

    @OnClick({2131297689})
    public void save() {
        for (C3012e next : this.f11231a.mo31179d()) {
            if (this.f11233c.mo23185G().equals(next.mo23217Z())) {
                DeviceDataProvider.m17616b(next.mo23185G(), (String) null);
                next.mo23203Q0((String) null);
                this.f11233c.mo31877e2(next);
            } else {
                C8937a p = C8293t.m19620n().mo35256p(next.mo23217Z());
                if (p != null) {
                    p.mo36718i().remove(next);
                    p.mo36711C(System.currentTimeMillis());
                    C8293t.m19620n().mo35251A(p);
                }
                next.mo23203Q0(this.f11233c.mo23185G());
                this.f11233c.mo31872Z1(next);
            }
        }
        this.f11233c.mo31875c2().mo36711C(System.currentTimeMillis());
        C8293t.m19620n().mo35251A(this.f11233c.mo31875c2());
        this.f11233c.mo31759Q1();
        finish();
    }
}
