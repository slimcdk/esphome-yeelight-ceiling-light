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
import com.yeelight.cherry.p177ui.adapter.GroupDeviceModifyAdapter;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.p150c.C5980c;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.activity.GroupDeviceModifyActivity */
public class GroupDeviceModifyActivity extends BaseActivity {

    /* renamed from: b */
    private GroupDeviceModifyAdapter f10969b;

    /* renamed from: c */
    private List<HashMap<String, Object>> f10970c = new ArrayList();

    /* renamed from: d */
    private List<C4200i> f10971d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C5980c f10972e;

    /* renamed from: f */
    private C10526e f10973f;
    @BindView(2131296591)
    RecyclerView mDeviceList;
    @BindView(2131297424)
    CommonTitleBar mTitleBar;

    /* renamed from: com.yeelight.cherry.ui.activity.GroupDeviceModifyActivity$a */
    class C5279a implements View.OnClickListener {
        C5279a() {
        }

        public void onClick(View view) {
            GroupDeviceModifyActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.GroupDeviceModifyActivity$b */
    class C5280b implements View.OnClickListener {
        C5280b() {
        }

        public void onClick(View view) {
            if (GroupDeviceModifyActivity.this.m16412Y().size() == 0) {
                C10526e.C10531e eVar = new C10526e.C10531e(GroupDeviceModifyActivity.this);
                eVar.mo33358i("" + GroupDeviceModifyActivity.this.getString(2131755273));
                eVar.mo33356g(GroupDeviceModifyActivity.this.getString(2131755708));
                eVar.mo33353d(-1, GroupDeviceModifyActivity.this.getString(2131755309), (DialogInterface.OnClickListener) null);
                eVar.mo33351b().show();
                return;
            }
            DeviceDataProvider.m22421y(GroupDeviceModifyActivity.this.f10972e.mo23372G(), GroupDeviceModifyActivity.this.m16412Y());
            GroupDeviceModifyActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.GroupDeviceModifyActivity$c */
    class C5281c implements DialogInterface.OnClickListener {
        C5281c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            GroupDeviceModifyActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.GroupDeviceModifyActivity$d */
    class C5282d extends RecyclerView.ItemDecoration {

        /* renamed from: a */
        private int f10977a;

        /* renamed from: b */
        private Paint f10978b;

        public C5282d(GroupDeviceModifyActivity groupDeviceModifyActivity) {
            Paint paint = new Paint();
            this.f10978b = paint;
            paint.setColor(groupDeviceModifyActivity.getResources().getColor(2131099797));
            this.f10977a = C10547m.m25751a(groupDeviceModifyActivity, 20.0f);
            this.f10978b.setStrokeWidth(2.0f);
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
                    canvas.drawLine(x, y, childViewHolder.getAdapterPosition() == 0 ? x + ((float) width) : (float) this.f10977a, y, this.f10978b);
                    f = ((float) height) + y;
                    f2 = x + ((float) width);
                    paint = this.f10978b;
                    canvas2 = canvas;
                    f3 = x;
                } else {
                    f3 = x + ((float) this.f10977a);
                    f = y + ((float) height);
                    f2 = x + ((float) width);
                    paint = this.f10978b;
                    canvas2 = canvas;
                }
                canvas2.drawLine(f3, f, f2, f, paint);
            }
        }
    }

    /* renamed from: X */
    private C10526e m16411X() {
        if (this.f10973f == null) {
            C10526e.C10531e eVar = new C10526e.C10531e(this);
            eVar.mo33358i(getString(2131755230));
            eVar.mo33356g(getString(2131755284));
            eVar.mo33353d(-1, getString(2131755277), new C5281c());
            eVar.mo33353d(-2, getString(2131755229), (DialogInterface.OnClickListener) null);
            this.f10973f = eVar.mo33351b();
        }
        return this.f10973f;
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public List<String> m16412Y() {
        ArrayList arrayList = new ArrayList();
        for (HashMap next : this.f10970c) {
            if (1 == ((Integer) next.get("type")).intValue()) {
                arrayList.add(((C4198d) next.get(DddTag.DEVICE)).mo23372G());
            }
        }
        return arrayList;
    }

    /* renamed from: Z */
    private void m16413Z() {
        this.f10970c.clear();
        List<C4200i> s0 = C4257w.m11947l0().mo23687s0();
        ArrayList<C4200i> arrayList = new ArrayList<>();
        ArrayList<C4200i> arrayList2 = new ArrayList<>();
        for (C4200i next : s0) {
            if (DeviceDataProvider.m22385T(this.f10972e.mo23372G(), next.mo23372G())) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        HashMap hashMap = new HashMap();
        if (arrayList.size() > 0) {
            hashMap.put("type", 3);
            hashMap.put(ScanBarcodeActivity.TITLE, getString(2131756158));
            this.f10970c.add(hashMap);
            for (C4200i put : arrayList) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("type", 1);
                hashMap2.put(DddTag.DEVICE, put);
                hashMap2.put("name", this.f10972e.mo23397U());
                this.f10970c.add(hashMap2);
            }
        }
        if (arrayList2.size() > 0) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("type", 3);
            hashMap3.put(ScanBarcodeActivity.TITLE, getString(2131756159));
            this.f10970c.add(hashMap3);
            for (C4200i put2 : arrayList2) {
                HashMap hashMap4 = new HashMap();
                hashMap4.put("type", 2);
                hashMap4.put(DddTag.DEVICE, put2);
                this.f10970c.add(hashMap4);
            }
        }
        this.f10969b.mo27160e(arrayList.size());
        this.f10969b.mo27162g(arrayList.size() > 0 ? arrayList.size() + 2 : 1);
        this.f10969b.mo27161f(this.f10970c.size() - 1);
    }

    public void onBackPressed() {
        List<String> Y = m16412Y();
        boolean z = true;
        if (this.f10971d.size() == Y.size()) {
            Iterator<C4200i> it = this.f10971d.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!Y.contains(it.next().mo23372G())) {
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
        }
        if (z) {
            m16411X().show();
        } else {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("com.yeelight.cherry.device_id");
        if (stringExtra == null) {
            C4308b.m12139r("ROOM_DEBUG", "No Group id!");
            finish();
            return;
        }
        C5980c k0 = C4257w.m11947l0().mo23675k0(stringExtra);
        this.f10972e = k0;
        if (k0 == null) {
            C4308b.m12139r("ROOM_DEBUG", "Group device is null!!!");
            finish();
            return;
        }
        this.f10971d = k0.mo27498K1();
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_room_device_modify);
        ButterKnife.bind((Activity) this);
        this.mTitleBar.mo32825a(getString(2131755707), new C5279a(), new C5280b());
        this.mTitleBar.setRightTextColor(getResources().getColor(2131099839));
        this.f10969b = new GroupDeviceModifyAdapter(this.f10970c, this.f10972e.mo23397U());
        this.mDeviceList.setLayoutManager(new LinearLayoutManager(this));
        this.mDeviceList.setAdapter(this.f10969b);
        this.mDeviceList.addItemDecoration(new C5282d(this));
        m16413Z();
    }
}
