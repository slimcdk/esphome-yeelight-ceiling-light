package com.yeelight.cherry.p177ui.activity;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.inuker.bluetooth.library.Constants;
import com.miot.api.MiotManager;
import com.miot.api.bluetooth.XmBluetoothManager;
import com.miot.api.bluetooth.response.MiotBleResponse;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.parser.xml.DddTag;
import com.miot.common.exception.MiotException;
import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p177ui.adapter.GroupDeviceModifyAdapter;
import com.yeelight.yeelib.p150c.C5979b;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6039j;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.cherry.ui.activity.MeshGrpDeviceModifyActivity */
public class MeshGrpDeviceModifyActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public GroupDeviceModifyAdapter f11237b;

    /* renamed from: c */
    private List<HashMap<String, Object>> f11238c = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public List<String> f11239d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C6039j f11240e;

    /* renamed from: f */
    private C10526e f11241f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Handler f11242g = new Handler(new C5389a());
    @BindView(2131296591)
    RecyclerView mDeviceList;
    @BindView(2131297424)
    CommonTitleBar mTitleBar;

    /* renamed from: com.yeelight.cherry.ui.activity.MeshGrpDeviceModifyActivity$a */
    class C5389a implements Handler.Callback {
        C5389a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                MeshGrpDeviceModifyActivity.this.mo32195S(2131755308);
                MeshGrpDeviceModifyActivity.this.finish();
                return false;
            } else if (i == 2) {
                MeshGrpDeviceModifyActivity.this.mo32195S(2131755307);
                return false;
            } else if (i != 3 || MeshGrpDeviceModifyActivity.this.f11237b == null) {
                return false;
            } else {
                MeshGrpDeviceModifyActivity.this.f11237b.notifyDataSetChanged();
                return false;
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshGrpDeviceModifyActivity$b */
    class C5390b implements View.OnClickListener {
        C5390b() {
        }

        public void onClick(View view) {
            MeshGrpDeviceModifyActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshGrpDeviceModifyActivity$c */
    class C5391c implements View.OnClickListener {
        C5391c() {
        }

        public void onClick(View view) {
            List Y = MeshGrpDeviceModifyActivity.this.m16648h0();
            if (Y.size() == 0) {
                C10526e.C10531e eVar = new C10526e.C10531e(MeshGrpDeviceModifyActivity.this);
                eVar.mo33358i("" + MeshGrpDeviceModifyActivity.this.getString(2131755273));
                eVar.mo33356g(MeshGrpDeviceModifyActivity.this.getString(2131755708));
                eVar.mo33353d(-1, MeshGrpDeviceModifyActivity.this.getString(2131755309), (DialogInterface.OnClickListener) null);
                eVar.mo33351b().show();
                return;
            }
            MeshGrpDeviceModifyActivity.this.m16645e0(Y);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshGrpDeviceModifyActivity$d */
    class C5392d extends MiotBleResponse {
        C5392d() {
        }

        public void onResponse(int i, Bundle bundle) {
            JSONArray jSONArray;
            JSONObject jSONObject;
            JSONObject jSONObject2;
            if (bundle != null) {
                try {
                    JSONObject jSONObject3 = new JSONObject(bundle.getString(Constants.EXTRA_DATA_JSON));
                    if (TextUtils.equals(jSONObject3.getString("code"), TimerCodec.DISENABLE) && (jSONArray = jSONObject3.getJSONArray("result")) != null && jSONArray.length() > 0 && (jSONObject = jSONArray.getJSONObject(0)) != null) {
                        String string = jSONObject.getString("group_did");
                        if (TextUtils.equals(string, MeshGrpDeviceModifyActivity.this.f11240e.mo27788M1()) && (jSONObject2 = jSONObject.getJSONObject("member_ship")) != null) {
                            "groupDid = " + string + " ,memberShip = " + jSONObject2;
                            ArrayList arrayList = new ArrayList();
                            Iterator<String> keys = jSONObject2.keys();
                            while (keys.hasNext()) {
                                try {
                                    AbstractDevice device = MiotManager.getDeviceManager().getDevice(keys.next());
                                    if (device != null) {
                                        C4198d a = C5979b.m17534a(device);
                                        a.mo23383M0(device);
                                        arrayList.add((C4200i) a);
                                        MeshGrpDeviceModifyActivity.this.f11239d.add(a.mo23372G());
                                    }
                                } catch (MiotException e) {
                                    e.printStackTrace();
                                }
                            }
                            MeshGrpDeviceModifyActivity.this.m16649i0(arrayList);
                        }
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshGrpDeviceModifyActivity$e */
    class C5393e extends MiotBleResponse {
        C5393e() {
        }

        public void onResponse(int i, Bundle bundle) {
            if (bundle != null) {
                try {
                    JSONObject jSONObject = new JSONObject(bundle.getString(Constants.EXTRA_DATA_JSON));
                    if (TextUtils.equals(jSONObject.getString("code"), TimerCodec.DISENABLE)) {
                        jSONObject.getJSONObject("result");
                        MeshGrpDeviceModifyActivity.this.f11242g.sendEmptyMessage(1);
                        return;
                    }
                    MeshGrpDeviceModifyActivity.this.f11242g.sendEmptyMessage(2);
                } catch (Exception unused) {
                    MeshGrpDeviceModifyActivity.this.f11242g.sendEmptyMessage(2);
                }
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshGrpDeviceModifyActivity$f */
    class C5394f implements DialogInterface.OnClickListener {
        C5394f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            MeshGrpDeviceModifyActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshGrpDeviceModifyActivity$g */
    class C5395g extends RecyclerView.ItemDecoration {

        /* renamed from: a */
        private int f11249a;

        /* renamed from: b */
        private Paint f11250b;

        public C5395g(MeshGrpDeviceModifyActivity meshGrpDeviceModifyActivity) {
            Paint paint = new Paint();
            this.f11250b = paint;
            paint.setColor(meshGrpDeviceModifyActivity.getResources().getColor(2131099797));
            this.f11249a = C10547m.m25751a(meshGrpDeviceModifyActivity, 20.0f);
            this.f11250b.setStrokeWidth(2.0f);
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
                    canvas.drawLine(x, y, childViewHolder.getAdapterPosition() == 0 ? x + ((float) width) : (float) this.f11249a, y, this.f11250b);
                    f = ((float) height) + y;
                    f2 = x + ((float) width);
                    paint = this.f11250b;
                    canvas2 = canvas;
                    f3 = x;
                } else {
                    f3 = x + ((float) this.f11249a);
                    f = y + ((float) height);
                    f2 = x + ((float) width);
                    paint = this.f11250b;
                    canvas2 = canvas;
                }
                canvas2.drawLine(f3, f, f2, f, paint);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public void m16645e0(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String next : this.f11239d) {
            if (!list.contains(next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (String next2 : list) {
            if (!this.f11239d.contains(next2)) {
                arrayList2.add(next2);
            }
        }
        XmBluetoothManager.getInstance().modLightGroup(this.f11240e.mo27788M1(), arrayList2, arrayList, new C5393e());
    }

    /* renamed from: f0 */
    private void m16646f0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f11240e.mo27788M1());
        XmBluetoothManager.getInstance().queryLightGroup(arrayList, new C5392d());
    }

    /* renamed from: g0 */
    private C10526e m16647g0() {
        if (this.f11241f == null) {
            C10526e.C10531e eVar = new C10526e.C10531e(this);
            eVar.mo33358i(getString(2131755230));
            eVar.mo33356g(getString(2131755284));
            eVar.mo33353d(-1, getString(2131755277), new C5394f());
            eVar.mo33353d(-2, getString(2131755229), (DialogInterface.OnClickListener) null);
            this.f11241f = eVar.mo33351b();
        }
        return this.f11241f;
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public List<String> m16648h0() {
        C4198d dVar;
        ArrayList arrayList = new ArrayList();
        for (HashMap next : this.f11238c) {
            if (1 == ((Integer) next.get("type")).intValue() && (next.get(DddTag.DEVICE) instanceof C4198d) && (dVar = (C4198d) next.get(DddTag.DEVICE)) != null) {
                arrayList.add(dVar.mo23393S().getDevice().getDeviceId());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca A[LOOP:1: B:30:0x00c4->B:32:0x00ca, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0135  */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m16649i0(java.util.List<com.yeelight.yeelib.p150c.p151i.C4200i> r12) {
        /*
            r11 = this;
            java.util.List<java.util.HashMap<java.lang.String, java.lang.Object>> r0 = r11.f11238c
            r0.clear()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r12.size()
            java.lang.String r2 = "device"
            java.lang.String r3 = "title"
            java.lang.String r4 = "type"
            r5 = 1
            r6 = 3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            if (r1 <= 0) goto L_0x005e
            r0.put(r4, r7)
            r1 = 2131756158(0x7f10047e, float:1.9143216E38)
            java.lang.String r1 = r11.getString(r1)
            r0.put(r3, r1)
            java.util.List<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r11.f11238c
            r1.add(r0)
            java.util.Iterator r0 = r12.iterator()
        L_0x0032:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005e
            java.lang.Object r1 = r0.next()
            com.yeelight.yeelib.c.i.i r1 = (com.yeelight.yeelib.p150c.p151i.C4200i) r1
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r8.put(r4, r9)
            r8.put(r2, r1)
            com.yeelight.yeelib.c.i.j r1 = r11.f11240e
            java.lang.String r1 = r1.mo23397U()
            java.lang.String r9 = "name"
            r8.put(r9, r1)
            java.util.List<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r11.f11238c
            r1.add(r8)
            goto L_0x0032
        L_0x005e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.yeelight.yeelib.c.i.j r1 = r11.f11240e
            java.lang.String r1 = r1.mo23395T()
            r8 = -1
            int r9 = r1.hashCode()
            r10 = 2
            switch(r9) {
                case -1282176368: goto L_0x0091;
                case -1035626052: goto L_0x0087;
                case -1035596261: goto L_0x007d;
                case -850921852: goto L_0x0073;
                default: goto L_0x0072;
            }
        L_0x0072:
            goto L_0x009a
        L_0x0073:
            java.lang.String r9 = "yeelink.light.sp1grp"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x009a
            r8 = 3
            goto L_0x009a
        L_0x007d:
            java.lang.String r9 = "yeelink.light.mb2grp"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x009a
            r8 = 2
            goto L_0x009a
        L_0x0087:
            java.lang.String r9 = "yeelink.light.mb1grp"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x009a
            r8 = 1
            goto L_0x009a
        L_0x0091:
            java.lang.String r9 = "yeelink.light.dn2grp"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x009a
            r8 = 0
        L_0x009a:
            if (r8 == 0) goto L_0x00b1
            if (r8 == r5) goto L_0x00a9
            if (r8 == r10) goto L_0x00a6
            if (r8 == r6) goto L_0x00a3
            goto L_0x00bb
        L_0x00a3:
            java.lang.String r1 = "yeelink.light.spot1"
            goto L_0x00b8
        L_0x00a6:
            java.lang.String r1 = "yeelink.light.meshbulb2"
            goto L_0x00b8
        L_0x00a9:
            java.lang.String r1 = "yeelink.light.meshbulb1"
            r0.add(r1)
            java.lang.String r1 = "yeelink.light.ml2"
            goto L_0x00b8
        L_0x00b1:
            java.lang.String r1 = "yeelink.light.dnlight2"
            r0.add(r1)
            java.lang.String r1 = "yeelink.light.ml1"
        L_0x00b8:
            r0.add(r1)
        L_0x00bb:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x00c4:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x00dc
            java.lang.Object r8 = r0.next()
            java.lang.String r8 = (java.lang.String) r8
            com.yeelight.yeelib.f.w r9 = com.yeelight.yeelib.p152f.C4257w.m11947l0()
            java.util.List r8 = r9.mo23693w0(r8)
            r1.addAll(r8)
            goto L_0x00c4
        L_0x00dc:
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x011e
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r0.put(r4, r7)
            r7 = 2131756159(0x7f10047f, float:1.9143218E38)
            java.lang.String r7 = r11.getString(r7)
            r0.put(r3, r7)
            java.util.List<java.util.HashMap<java.lang.String, java.lang.Object>> r3 = r11.f11238c
            r3.add(r0)
            java.util.Iterator r0 = r1.iterator()
        L_0x00fd:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x011e
            java.lang.Object r1 = r0.next()
            com.yeelight.yeelib.c.i.j r1 = (com.yeelight.yeelib.p150c.p151i.C6039j) r1
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            r3.put(r4, r7)
            r3.put(r2, r1)
            java.util.List<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r11.f11238c
            r1.add(r3)
            goto L_0x00fd
        L_0x011e:
            com.yeelight.cherry.ui.adapter.GroupDeviceModifyAdapter r0 = r11.f11237b
            int r1 = r12.size()
            r0.mo27160e(r1)
            com.yeelight.cherry.ui.adapter.GroupDeviceModifyAdapter r0 = r11.f11237b
            int r1 = r12.size()
            if (r1 <= 0) goto L_0x0135
            int r12 = r12.size()
            int r12 = r12 + r10
            goto L_0x0136
        L_0x0135:
            r12 = 1
        L_0x0136:
            r0.mo27162g(r12)
            com.yeelight.cherry.ui.adapter.GroupDeviceModifyAdapter r12 = r11.f11237b
            java.util.List<java.util.HashMap<java.lang.String, java.lang.Object>> r0 = r11.f11238c
            int r0 = r0.size()
            int r0 = r0 - r5
            r12.mo27161f(r0)
            android.os.Handler r12 = r11.f11242g
            r12.sendEmptyMessage(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.activity.MeshGrpDeviceModifyActivity.m16649i0(java.util.List):void");
    }

    public void onBackPressed() {
        List<String> list = this.f11239d;
        if (list != null && list.size() > 0) {
            boolean z = false;
            List<String> h0 = m16648h0();
            boolean z2 = true;
            if (this.f11239d.size() == h0.size()) {
                Iterator<String> it = this.f11239d.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!h0.contains(it.next())) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                z2 = z;
            }
            if (z2) {
                m16647g0().show();
                return;
            }
        }
        finish();
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
        C6039j q0 = C4257w.m11947l0().mo23683q0(stringExtra);
        this.f11240e = q0;
        if (q0 == null) {
            C4308b.m12139r("ROOM_DEBUG", "Group device is null!!!");
            finish();
            return;
        }
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_meshgrp_device_modify);
        ButterKnife.bind((Activity) this);
        this.mTitleBar.mo32825a(getString(2131755707), new C5390b(), new C5391c());
        this.mTitleBar.setRightTextColor(getResources().getColor(2131099839));
        this.f11237b = new GroupDeviceModifyAdapter(this.f11238c, this.f11240e.mo23397U());
        this.mDeviceList.setLayoutManager(new LinearLayoutManager(this));
        this.mDeviceList.setAdapter(this.f11237b);
        this.mDeviceList.addItemDecoration(new C5395g(this));
        m16646f0();
    }
}
