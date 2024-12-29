package com.yeelight.cherry.p177ui.activity;

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
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p177ui.adapter.RoomDeviceModifyAdapter;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.p150c.C6005g;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C9812t;
import com.yeelight.yeelib.p190i.C9875a;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.activity.RoomDeviceModifyActivity */
public class RoomDeviceModifyActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public RoomDeviceModifyAdapter f11667b;

    /* renamed from: c */
    private List<HashMap<String, Object>> f11668c = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C6005g f11669d;

    /* renamed from: e */
    private C10526e f11670e;
    @BindView(2131296591)
    RecyclerView mDeviceList;
    @BindView(2131297424)
    CommonTitleBar mTitleBar;

    /* renamed from: com.yeelight.cherry.ui.activity.RoomDeviceModifyActivity$a */
    class C5575a implements View.OnClickListener {
        C5575a() {
        }

        public void onClick(View view) {
            RoomDeviceModifyActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.RoomDeviceModifyActivity$b */
    class C5576b implements View.OnClickListener {
        C5576b() {
        }

        public void onClick(View view) {
            for (C4200i next : RoomDeviceModifyActivity.this.f11667b.mo27213d()) {
                if (RoomDeviceModifyActivity.this.f11669d.mo23372G().equals(next.mo23404Z())) {
                    DeviceDataProvider.m22394b(next.mo23372G(), (String) null);
                    next.mo23390Q0((String) null);
                    RoomDeviceModifyActivity.this.f11669d.mo27555e2(next);
                } else {
                    C9875a m = C9812t.m23832j().mo31686m(next.mo23404Z());
                    if (m != null) {
                        m.mo31949i().remove(next);
                        m.mo31942C(System.currentTimeMillis());
                        C9812t.m23832j().mo31694x(m);
                    }
                    next.mo23390Q0(RoomDeviceModifyActivity.this.f11669d.mo23372G());
                    RoomDeviceModifyActivity.this.f11669d.mo27550Z1(next);
                }
            }
            RoomDeviceModifyActivity.this.f11669d.mo27553c2().mo31942C(System.currentTimeMillis());
            C9812t.m23832j().mo31694x(RoomDeviceModifyActivity.this.f11669d.mo27553c2());
            RoomDeviceModifyActivity.this.f11669d.mo27504Q1();
            RoomDeviceModifyActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.RoomDeviceModifyActivity$c */
    class C5577c implements DialogInterface.OnClickListener {
        C5577c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            RoomDeviceModifyActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.RoomDeviceModifyActivity$d */
    class C5578d extends RecyclerView.ItemDecoration {

        /* renamed from: a */
        private int f11674a;

        /* renamed from: b */
        private Paint f11675b;

        public C5578d(RoomDeviceModifyActivity roomDeviceModifyActivity) {
            Paint paint = new Paint();
            this.f11675b = paint;
            paint.setColor(roomDeviceModifyActivity.getResources().getColor(2131099797));
            this.f11674a = C10547m.m25751a(roomDeviceModifyActivity, 20.0f);
            this.f11675b.setStrokeWidth(2.0f);
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
                    canvas.drawLine(x, y, childViewHolder.getAdapterPosition() == 0 ? x + ((float) width) : (float) this.f11674a, y, this.f11675b);
                    f = ((float) height) + y;
                    f2 = x + ((float) width);
                    paint = this.f11675b;
                    canvas2 = canvas;
                    f3 = x;
                } else {
                    f3 = x + ((float) this.f11674a);
                    f = y + ((float) height);
                    f2 = x + ((float) width);
                    paint = this.f11675b;
                    canvas2 = canvas;
                }
                canvas2.drawLine(f3, f, f2, f, paint);
            }
        }
    }

    /* renamed from: X */
    private C10526e m16942X() {
        if (this.f11670e == null) {
            C10526e.C10531e eVar = new C10526e.C10531e(this);
            eVar.mo33358i(getString(2131755230));
            eVar.mo33356g(getString(2131755284));
            eVar.mo33353d(-1, getString(2131755277), new C5577c());
            eVar.mo33353d(-2, getString(2131755229), (DialogInterface.OnClickListener) null);
            this.f11670e = eVar.mo33351b();
        }
        return this.f11670e;
    }

    /* renamed from: Y */
    private void m16943Y() {
        this.f11668c.clear();
        List<C4200i> t0 = C4257w.m11947l0().mo23688t0();
        ArrayList<C4200i> arrayList = new ArrayList<>();
        ArrayList<C4200i> arrayList2 = new ArrayList<>();
        for (C4200i next : t0) {
            if (next.mo23404Z() == null || !next.mo23404Z().equals(this.f11669d.mo23372G())) {
                arrayList2.add(next);
            } else {
                arrayList.add(next);
            }
        }
        HashMap hashMap = new HashMap();
        if (arrayList.size() > 0) {
            hashMap.put("type", 3);
            hashMap.put(ScanBarcodeActivity.TITLE, getString(2131756158));
            this.f11668c.add(hashMap);
            for (C4200i put : arrayList) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("type", 1);
                hashMap2.put(DddTag.DEVICE, put);
                hashMap2.put("name", this.f11669d.mo23397U());
                this.f11668c.add(hashMap2);
            }
        }
        if (arrayList2.size() > 0) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("type", 3);
            hashMap3.put(ScanBarcodeActivity.TITLE, getString(2131756159));
            this.f11668c.add(hashMap3);
            for (C4200i put2 : arrayList2) {
                HashMap hashMap4 = new HashMap();
                hashMap4.put("type", 2);
                hashMap4.put(DddTag.DEVICE, put2);
                this.f11668c.add(hashMap4);
            }
        }
        this.f11667b.mo27214g(arrayList.size());
        this.f11667b.mo27216i(arrayList.size() > 0 ? arrayList.size() + 2 : 1);
        this.f11667b.mo27215h(this.f11668c.size() - 1);
    }

    public void onBackPressed() {
        if (this.f11667b.mo27213d().isEmpty()) {
            finish();
        } else {
            m16942X().show();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("com.yeelight.cherry.device_id");
        if (stringExtra == null) {
            C4308b.m12139r("ROOM_DEBUG", "No room id!");
            finish();
            return;
        }
        C6005g G0 = C4257w.m11947l0().mo23647G0(stringExtra);
        this.f11669d = G0;
        if (G0 == null) {
            C4308b.m12139r("ROOM_DEBUG", "Room device is null!!!");
            finish();
            return;
        }
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_room_device_modify);
        ButterKnife.bind((Activity) this);
        this.mTitleBar.mo32825a(getString(2131756156), new C5575a(), new C5576b());
        this.mTitleBar.setRightTextColor(getResources().getColor(2131099839));
        this.f11667b = new RoomDeviceModifyAdapter(this.f11668c, this.f11669d.mo23397U());
        this.mDeviceList.setLayoutManager(new LinearLayoutManager(this));
        this.mDeviceList.setAdapter(this.f11667b);
        this.mDeviceList.addItemDecoration(new C5578d(this));
        m16943Y();
    }
}
