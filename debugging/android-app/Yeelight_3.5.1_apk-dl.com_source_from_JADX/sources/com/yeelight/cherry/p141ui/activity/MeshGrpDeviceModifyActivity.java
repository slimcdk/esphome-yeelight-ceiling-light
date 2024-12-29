package com.yeelight.cherry.p141ui.activity;

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
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.adapter.GroupDeviceModifyAdapter;
import com.yeelight.yeelib.device.C6088b;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.C6094f;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p051j4.C9193k;
import p170i4.C9113d;

/* renamed from: com.yeelight.cherry.ui.activity.MeshGrpDeviceModifyActivity */
public class MeshGrpDeviceModifyActivity extends BaseActivity {

    /* renamed from: g */
    public static final /* synthetic */ int f10806g = 0;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public GroupDeviceModifyAdapter f10807a;

    /* renamed from: b */
    private List<HashMap<String, Object>> f10808b = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<String> f10809c = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C6094f f10810d;

    /* renamed from: e */
    private C9113d f10811e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Handler f10812f = new Handler(new C5435a());
    @BindView(2131296669)
    RecyclerView mDeviceList;
    @BindView(2131297591)
    CommonTitleBar mTitleBar;

    /* renamed from: com.yeelight.cherry.ui.activity.MeshGrpDeviceModifyActivity$a */
    class C5435a implements Handler.Callback {
        C5435a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                MeshGrpDeviceModifyActivity.this.mo35655S(2131755312);
                MeshGrpDeviceModifyActivity.this.finish();
                return false;
            } else if (i == 2) {
                MeshGrpDeviceModifyActivity.this.mo35655S(2131755311);
                return false;
            } else if (i != 3 || MeshGrpDeviceModifyActivity.this.f10807a == null) {
                return false;
            } else {
                MeshGrpDeviceModifyActivity.this.f10807a.notifyDataSetChanged();
                return false;
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshGrpDeviceModifyActivity$b */
    class C5436b implements View.OnClickListener {
        C5436b() {
        }

        public void onClick(View view) {
            MeshGrpDeviceModifyActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshGrpDeviceModifyActivity$c */
    class C5437c implements View.OnClickListener {
        C5437c() {
        }

        public void onClick(View view) {
            List Y = MeshGrpDeviceModifyActivity.this.m16608h0();
            if (Y.size() == 0) {
                C9113d.C9118e eVar = new C9113d.C9118e(MeshGrpDeviceModifyActivity.this);
                eVar.mo37179i("" + MeshGrpDeviceModifyActivity.this.getString(2131755277)).mo37177g(MeshGrpDeviceModifyActivity.this.getString(2131755716)).mo37174d(-1, MeshGrpDeviceModifyActivity.this.getString(2131755313), (DialogInterface.OnClickListener) null).mo37172b().show();
                return;
            }
            MeshGrpDeviceModifyActivity.this.m16605e0(Y);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshGrpDeviceModifyActivity$d */
    class C5438d extends MiotBleResponse {
        C5438d() {
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
                        if (TextUtils.equals(string, MeshGrpDeviceModifyActivity.this.f10810d.mo31698M1()) && (jSONObject2 = jSONObject.getJSONObject("member_ship")) != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("groupDid = ");
                            sb.append(string);
                            sb.append(" ,memberShip = ");
                            sb.append(jSONObject2);
                            ArrayList arrayList = new ArrayList();
                            Iterator<String> keys = jSONObject2.keys();
                            while (keys.hasNext()) {
                                try {
                                    AbstractDevice device = MiotManager.getDeviceManager().getDevice(keys.next());
                                    if (device != null) {
                                        C3010c a = C6088b.m17785a(device);
                                        a.mo23196M0(device);
                                        arrayList.add((C3012e) a);
                                        MeshGrpDeviceModifyActivity.this.f10809c.add(a.mo23185G());
                                    }
                                } catch (MiotException e) {
                                    e.printStackTrace();
                                }
                            }
                            MeshGrpDeviceModifyActivity.this.m16609i0(arrayList);
                        }
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshGrpDeviceModifyActivity$e */
    class C5439e extends MiotBleResponse {
        C5439e() {
        }

        public void onResponse(int i, Bundle bundle) {
            if (bundle != null) {
                try {
                    JSONObject jSONObject = new JSONObject(bundle.getString(Constants.EXTRA_DATA_JSON));
                    if (TextUtils.equals(jSONObject.getString("code"), TimerCodec.DISENABLE)) {
                        jSONObject.getJSONObject("result");
                        MeshGrpDeviceModifyActivity.this.f10812f.sendEmptyMessage(1);
                        return;
                    }
                    MeshGrpDeviceModifyActivity.this.f10812f.sendEmptyMessage(2);
                } catch (Exception unused) {
                    MeshGrpDeviceModifyActivity.this.f10812f.sendEmptyMessage(2);
                }
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshGrpDeviceModifyActivity$f */
    class C5440f implements DialogInterface.OnClickListener {
        C5440f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            MeshGrpDeviceModifyActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshGrpDeviceModifyActivity$g */
    class C5441g extends RecyclerView.ItemDecoration {

        /* renamed from: a */
        private int f10819a;

        /* renamed from: b */
        private Paint f10820b;

        public C5441g(MeshGrpDeviceModifyActivity meshGrpDeviceModifyActivity) {
            Paint paint = new Paint();
            this.f10820b = paint;
            paint.setColor(meshGrpDeviceModifyActivity.getResources().getColor(2131099800));
            this.f10819a = C9193k.m22150a(meshGrpDeviceModifyActivity, 20.0f);
            this.f10820b.setStrokeWidth(2.0f);
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
                    canvas.drawLine(x, y, childViewHolder.getAdapterPosition() == 0 ? x + ((float) width) : (float) this.f10819a, y, this.f10820b);
                    f = ((float) height) + y;
                    f2 = x + ((float) width);
                    paint = this.f10820b;
                    canvas2 = canvas;
                    f3 = x;
                } else {
                    f3 = x + ((float) this.f10819a);
                    f = y + ((float) height);
                    f2 = x + ((float) width);
                    paint = this.f10820b;
                    canvas2 = canvas;
                }
                canvas2.drawLine(f3, f, f2, f, paint);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public void m16605e0(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String next : this.f10809c) {
            if (!list.contains(next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (String next2 : list) {
            if (!this.f10809c.contains(next2)) {
                arrayList2.add(next2);
            }
        }
        XmBluetoothManager.getInstance().modLightGroup(this.f10810d.mo31698M1(), arrayList2, arrayList, new C5439e());
    }

    /* renamed from: f0 */
    private void m16606f0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f10810d.mo31698M1());
        XmBluetoothManager.getInstance().queryLightGroup(arrayList, new C5438d());
    }

    /* renamed from: g0 */
    private C9113d m16607g0() {
        if (this.f10811e == null) {
            C9113d.C9118e eVar = new C9113d.C9118e(this);
            eVar.mo37179i(getString(2131755233));
            eVar.mo37177g(getString(2131755288));
            eVar.mo37174d(-1, getString(2131755281), new C5440f()).mo37174d(-2, getString(2131755232), (DialogInterface.OnClickListener) null);
            this.f10811e = eVar.mo37172b();
        }
        return this.f10811e;
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public List<String> m16608h0() {
        C3010c cVar;
        ArrayList arrayList = new ArrayList();
        for (HashMap next : this.f10808b) {
            if (1 == ((Integer) next.get("type")).intValue() && (next.get(DddTag.DEVICE) instanceof C3010c) && (cVar = (C3010c) next.get(DddTag.DEVICE)) != null) {
                arrayList.add(cVar.mo23206S().getDevice().getDeviceId());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cc A[LOOP:1: B:27:0x00c6->B:29:0x00cc, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0137  */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m16609i0(java.util.List<com.yeelight.yeelib.device.base.C3012e> r12) {
        /*
            r11 = this;
            java.util.List<java.util.HashMap<java.lang.String, java.lang.Object>> r0 = r11.f10808b
            r0.clear()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r12.size()
            java.lang.String r2 = "device"
            java.lang.String r3 = "title"
            java.lang.String r4 = "type"
            r5 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r7 = 1
            if (r1 <= 0) goto L_0x005e
            r0.put(r4, r6)
            r1 = 2131756182(0x7f100496, float:1.9143264E38)
            java.lang.String r1 = r11.getString(r1)
            r0.put(r3, r1)
            java.util.List<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r11.f10808b
            r1.add(r0)
            java.util.Iterator r0 = r12.iterator()
        L_0x0032:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005e
            java.lang.Object r1 = r0.next()
            com.yeelight.yeelib.device.base.e r1 = (com.yeelight.yeelib.device.base.C3012e) r1
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r8.put(r4, r9)
            r8.put(r2, r1)
            com.yeelight.yeelib.device.base.f r1 = r11.f10810d
            java.lang.String r1 = r1.mo23210U()
            java.lang.String r9 = "name"
            r8.put(r9, r1)
            java.util.List<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r11.f10808b
            r1.add(r8)
            goto L_0x0032
        L_0x005e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.yeelight.yeelib.device.base.f r1 = r11.f10810d
            java.lang.String r1 = r1.mo23208T()
            r1.hashCode()
            r8 = -1
            int r9 = r1.hashCode()
            r10 = 2
            switch(r9) {
                case -1282176368: goto L_0x0097;
                case -1035626052: goto L_0x008c;
                case -1035596261: goto L_0x0081;
                case -850921852: goto L_0x0076;
                default: goto L_0x0075;
            }
        L_0x0075:
            goto L_0x00a1
        L_0x0076:
            java.lang.String r9 = "yeelink.light.sp1grp"
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x007f
            goto L_0x00a1
        L_0x007f:
            r8 = 3
            goto L_0x00a1
        L_0x0081:
            java.lang.String r9 = "yeelink.light.mb2grp"
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x008a
            goto L_0x00a1
        L_0x008a:
            r8 = 2
            goto L_0x00a1
        L_0x008c:
            java.lang.String r9 = "yeelink.light.mb1grp"
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x0095
            goto L_0x00a1
        L_0x0095:
            r8 = 1
            goto L_0x00a1
        L_0x0097:
            java.lang.String r9 = "yeelink.light.dn2grp"
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x00a0
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            switch(r8) {
                case 0: goto L_0x00b3;
                case 1: goto L_0x00ab;
                case 2: goto L_0x00a8;
                case 3: goto L_0x00a5;
                default: goto L_0x00a4;
            }
        L_0x00a4:
            goto L_0x00bd
        L_0x00a5:
            java.lang.String r1 = "yeelink.light.spot1"
            goto L_0x00ba
        L_0x00a8:
            java.lang.String r1 = "yeelink.light.meshbulb2"
            goto L_0x00ba
        L_0x00ab:
            java.lang.String r1 = "yeelink.light.meshbulb1"
            r0.add(r1)
            java.lang.String r1 = "yeelink.light.ml2"
            goto L_0x00ba
        L_0x00b3:
            java.lang.String r1 = "yeelink.light.dnlight2"
            r0.add(r1)
            java.lang.String r1 = "yeelink.light.ml1"
        L_0x00ba:
            r0.add(r1)
        L_0x00bd:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x00c6:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x00de
            java.lang.Object r8 = r0.next()
            java.lang.String r8 = (java.lang.String) r8
            com.yeelight.yeelib.managers.YeelightDeviceManager r9 = com.yeelight.yeelib.managers.YeelightDeviceManager.m7800o0()
            java.util.List r8 = r9.mo23326z0(r8)
            r1.addAll(r8)
            goto L_0x00c6
        L_0x00de:
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x0120
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r0.put(r4, r6)
            r6 = 2131756183(0x7f100497, float:1.9143266E38)
            java.lang.String r6 = r11.getString(r6)
            r0.put(r3, r6)
            java.util.List<java.util.HashMap<java.lang.String, java.lang.Object>> r3 = r11.f10808b
            r3.add(r0)
            java.util.Iterator r0 = r1.iterator()
        L_0x00ff:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0120
            java.lang.Object r1 = r0.next()
            com.yeelight.yeelib.device.base.f r1 = (com.yeelight.yeelib.device.base.C6094f) r1
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            r3.put(r4, r6)
            r3.put(r2, r1)
            java.util.List<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r11.f10808b
            r1.add(r3)
            goto L_0x00ff
        L_0x0120:
            com.yeelight.cherry.ui.adapter.GroupDeviceModifyAdapter r0 = r11.f10807a
            int r1 = r12.size()
            r0.mo31127e(r1)
            com.yeelight.cherry.ui.adapter.GroupDeviceModifyAdapter r0 = r11.f10807a
            int r1 = r12.size()
            if (r1 <= 0) goto L_0x0137
            int r12 = r12.size()
            int r12 = r12 + r10
            goto L_0x0138
        L_0x0137:
            r12 = 1
        L_0x0138:
            r0.mo31129g(r12)
            com.yeelight.cherry.ui.adapter.GroupDeviceModifyAdapter r12 = r11.f10807a
            java.util.List<java.util.HashMap<java.lang.String, java.lang.Object>> r0 = r11.f10808b
            int r0 = r0.size()
            int r0 = r0 - r7
            r12.mo31128f(r0)
            android.os.Handler r12 = r11.f10812f
            r12.sendEmptyMessage(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.activity.MeshGrpDeviceModifyActivity.m16609i0(java.util.List):void");
    }

    public void onBackPressed() {
        List<String> list = this.f10809c;
        if (list != null && list.size() > 0) {
            boolean z = false;
            List<String> h0 = m16608h0();
            boolean z2 = true;
            if (this.f10809c.size() == h0.size()) {
                Iterator<String> it = this.f10809c.iterator();
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
                m16607g0().show();
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
            AppUtils.m8300u("ROOM_DEBUG", "No Group id!");
            finish();
            return;
        }
        C6094f t0 = YeelightDeviceManager.m7800o0().mo23314t0(stringExtra);
        this.f10810d = t0;
        if (t0 == null) {
            AppUtils.m8300u("ROOM_DEBUG", "Group device is null!!!");
            finish();
            return;
        }
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_meshgrp_device_modify);
        ButterKnife.bind((Activity) this);
        this.mTitleBar.mo36195a(getString(2131755715), new C5436b(), new C5437c());
        this.mTitleBar.setRightTextColor(getResources().getColor(2131099842));
        this.f10807a = new GroupDeviceModifyAdapter(this.f10808b, this.f10810d.mo23210U());
        this.mDeviceList.setLayoutManager(new LinearLayoutManager(this));
        this.mDeviceList.setAdapter(this.f10807a);
        this.mDeviceList.addItemDecoration(new C5441g(this));
        m16606f0();
    }
}
