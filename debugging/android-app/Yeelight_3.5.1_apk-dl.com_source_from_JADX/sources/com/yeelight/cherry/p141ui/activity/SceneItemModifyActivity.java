package com.yeelight.cherry.p141ui.activity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.miot.api.Constants;
import com.miot.common.device.parser.xml.DddTag;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.adapter.SceneItemModifyAdapter;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.managers.C3096u;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.C3112v;
import com.yeelight.yeelib.models.C8309b;
import com.yeelight.yeelib.models.C8311d;
import com.yeelight.yeelib.models.C8313f;
import com.yeelight.yeelib.models.C8314g;
import com.yeelight.yeelib.models.C8322n;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.models.C8329t;
import com.yeelight.yeelib.models.C8330u;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.activity.SceneActionSelectActivity;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p051j4.C3278f;
import p051j4.C9193k;
import p134c4.C4007b;
import p170i4.C9113d;
import p237z3.C12146f;

/* renamed from: com.yeelight.cherry.ui.activity.SceneItemModifyActivity */
public class SceneItemModifyActivity extends BaseActivity {

    /* renamed from: a */
    private SceneItemModifyAdapter f11319a;

    /* renamed from: b */
    private List<HashMap<String, Object>> f11320b = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C8329t f11321c;

    /* renamed from: d */
    private C9113d f11322d;

    /* renamed from: e */
    private List<C8330u> f11323e = new ArrayList();

    /* renamed from: f */
    private C12146f f11324f = new C5652a();
    @BindView(2131296669)
    RecyclerView mDeviceList;

    /* renamed from: com.yeelight.cherry.ui.activity.SceneItemModifyActivity$a */
    class C5652a implements C12146f {
        C5652a() {
        }

        /* renamed from: a */
        public List<C8330u> mo30878a() {
            return SceneItemModifyActivity.this.f11321c.mo35473n();
        }

        /* renamed from: b */
        public void mo30879b(int i, String str) {
            Intent intent = new Intent();
            intent.putExtra("com.yeelight.cherry.device_id", str);
            intent.putExtra("position", i);
            SceneItemModifyActivity sceneItemModifyActivity = SceneItemModifyActivity.this;
            intent.putExtra("recommend_template_enable", sceneItemModifyActivity.m16986c0(sceneItemModifyActivity.f11321c));
            intent.setClass(SceneItemModifyActivity.this, SceneActionSelectActivity.class);
            SceneItemModifyActivity.this.startActivityForResult(intent, 0);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SceneItemModifyActivity$b */
    class C5653b implements C4007b<String> {
        C5653b() {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("updateSceneBundle onSuccess : ");
            sb.append(str);
            try {
                if (new JSONObject(str).getInt("code") == 1) {
                    SceneItemModifyActivity.this.setResult(-1);
                    SceneItemModifyActivity.this.finish();
                    return;
                }
                SceneItemModifyActivity.this.m16990g0();
            } catch (JSONException e) {
                e.printStackTrace();
                SceneItemModifyActivity.this.m16990g0();
            }
        }

        public void onFailure(int i, String str) {
            SceneItemModifyActivity.this.m16990g0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SceneItemModifyActivity$c */
    class C5654c implements DialogInterface.OnClickListener {
        C5654c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            SceneItemModifyActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SceneItemModifyActivity$d */
    class C5655d extends RecyclerView.ItemDecoration {

        /* renamed from: a */
        private int f11328a;

        /* renamed from: b */
        private Paint f11329b;

        public C5655d(SceneItemModifyActivity sceneItemModifyActivity) {
            Paint paint = new Paint();
            this.f11329b = paint;
            paint.setColor(sceneItemModifyActivity.getResources().getColor(2131099800));
            this.f11328a = C9193k.m22150a(sceneItemModifyActivity, 20.0f);
            this.f11329b.setStrokeWidth(2.0f);
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
                    canvas.drawLine(x, y, childViewHolder.getAdapterPosition() == 0 ? x + ((float) width) : (float) this.f11328a, y, this.f11329b);
                    f = ((float) height) + y;
                    f2 = x + ((float) width);
                    paint = this.f11329b;
                    canvas2 = canvas;
                    f3 = x;
                } else {
                    f3 = x + ((float) this.f11328a);
                    f = y + ((float) height);
                    f2 = x + ((float) width);
                    paint = this.f11329b;
                    canvas2 = canvas;
                }
                canvas2.drawLine(f3, f, f2, f, paint);
            }
        }
    }

    /* renamed from: Z */
    private C8327s m16983Z(int i, int i2, int i3, int i4, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("mode = ");
        sb.append(i);
        sb.append(" , bright = ");
        sb.append(i2);
        sb.append(" , color = ");
        sb.append(i3);
        sb.append(" , ct = ");
        sb.append(i4);
        sb.append(" , flowJson = ");
        sb.append(str);
        if (i == 0) {
            return new C8314g("", -1, 3, i2, i4);
        }
        if (i == 1) {
            return new C8313f("", -1, 2, i2, i3);
        }
        if (i == 2) {
            try {
                return C8309b.m19702a0(new JSONObject(str));
            } catch (Exception unused) {
            }
        } else if (i != 3) {
            if (i == 4) {
                return new C8322n("", -1, 6, i2);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No reason to run here! ");
            sb2.append(new Exception());
            return null;
        }
        return new C8311d("", -1, 3, i2);
    }

    /* renamed from: a0 */
    private C8327s m16984a0(int i, int i2, String str) {
        List k;
        WifiDeviceBase P0 = YeelightDeviceManager.m7800o0().mo23274P0(str);
        if (i == 0) {
            k = C3112v.m8242u().mo23560k(P0.mo23144i1());
            if (k == null) {
                C3278f.m8797b(new AppUtils.SuicideException("RecommendSceneListNullException", "recommendSceneList is null, device model: " + P0.mo23144i1()));
                return null;
            }
        } else if (i == 1) {
            k = C3112v.m8242u().mo23559j(P0.mo23144i1());
        } else if (i != 2) {
            return null;
        } else {
            k = C3112v.m8242u().mo23564p(P0.mo23144i1());
        }
        return (C8327s) k.get(i2);
    }

    /* renamed from: b0 */
    private C9113d m16985b0() {
        if (this.f11322d == null) {
            C9113d.C9118e eVar = new C9113d.C9118e(this);
            eVar.mo37179i(getString(2131755233));
            eVar.mo37177g(getString(2131755288));
            eVar.mo37174d(-1, getString(2131755281), new C5654c()).mo37174d(-2, getString(2131755232), (DialogInterface.OnClickListener) null);
            this.f11322d = eVar.mo37172b();
        }
        return this.f11322d;
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public boolean m16986c0(C8329t tVar) {
        return (tVar == null || !TextUtils.equals("2", tVar.mo35470k()) || C3096u.m8175n().mo23514s(tVar.mo35474o()) == null) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m16987d0() {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r5.f11320b
            java.util.Iterator r1 = r1.iterator()
        L_0x000b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0029
            java.lang.Object r2 = r1.next()
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.String r3 = "scene_bundle_item"
            boolean r4 = r2.containsKey(r3)
            if (r4 == 0) goto L_0x000b
            java.lang.Object r2 = r2.get(r3)
            com.yeelight.yeelib.models.u r2 = (com.yeelight.yeelib.models.C8330u) r2
            r0.add(r2)
            goto L_0x000b
        L_0x0029:
            int r1 = r0.size()
            com.yeelight.yeelib.models.t r2 = r5.f11321c
            java.util.List r2 = r2.mo35473n()
            int r2 = r2.size()
            r3 = 1
            if (r1 == r2) goto L_0x003b
            return r3
        L_0x003b:
            java.util.Iterator r0 = r0.iterator()
        L_0x003f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0065
            java.lang.Object r1 = r0.next()
            com.yeelight.yeelib.models.u r1 = (com.yeelight.yeelib.models.C8330u) r1
            com.yeelight.yeelib.models.t r2 = r5.f11321c
            java.lang.String r4 = r1.mo35482e()
            boolean r2 = r2.mo35467h(r4)
            if (r2 != 0) goto L_0x0058
            return r3
        L_0x0058:
            com.yeelight.yeelib.models.t r2 = r5.f11321c
            java.lang.String r1 = r1.mo35482e()
            com.yeelight.yeelib.models.u r1 = r2.mo35468i(r1)
            if (r1 != 0) goto L_0x003f
            return r3
        L_0x0065:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.activity.SceneItemModifyActivity.m16987d0():boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public /* synthetic */ void m16988e0() {
        Toast.makeText(this, getString(2131756231), 0).show();
    }

    /* renamed from: f0 */
    private void m16989f0() {
        HashMap hashMap;
        this.f11320b.clear();
        YeelightDeviceManager o0 = YeelightDeviceManager.m7800o0();
        List<WifiDeviceBase> D0 = o0.mo23258D0();
        List<C8330u> n = this.f11321c.mo35473n();
        if (!n.isEmpty()) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("type", 3);
            hashMap2.put(ScanBarcodeActivity.TITLE, getString(2131756182));
            this.f11320b.add(hashMap2);
            for (C8330u next : n) {
                try {
                    WifiDeviceBase P0 = o0.mo23274P0(next.mo35482e());
                    StringBuilder sb = new StringBuilder();
                    sb.append("deviceBase = ");
                    sb.append(P0);
                    hashMap = new HashMap();
                    hashMap.put("type", 1);
                    hashMap.put(DddTag.DEVICE, P0);
                    hashMap.put("scene_bundle_item", next);
                    if (P0 != null) {
                        D0.remove(P0);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    hashMap = new HashMap();
                    hashMap.put("type", 1);
                    hashMap.put(DddTag.DEVICE, (Object) null);
                    hashMap.put("scene_bundle_item", next);
                }
                this.f11320b.add(hashMap);
            }
            this.f11319a.mo31212h(n.size());
        }
        if (!D0.isEmpty()) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("type", 3);
            hashMap3.put(ScanBarcodeActivity.TITLE, getString(2131756183));
            this.f11320b.add(hashMap3);
            this.f11319a.mo31212h(this.f11320b.size());
            for (WifiDeviceBase put : D0) {
                HashMap hashMap4 = new HashMap();
                hashMap4.put("type", 2);
                hashMap4.put(DddTag.DEVICE, put);
                this.f11320b.add(hashMap4);
            }
        }
        this.f11319a.mo31210f(n.size());
        this.f11319a.mo31211g(this.f11320b.size() - 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public void m16990g0() {
        runOnUiThread(new C5780j3(this));
        this.f11321c.mo35477r(this.f11323e);
    }

    @OnClick({2131296926})
    public void back() {
        onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        C8330u uVar;
        int i3;
        int i4 = i2;
        Intent intent2 = intent;
        StringBuilder sb = new StringBuilder();
        sb.append("CreateSceneBundle on Activity result called!!! resultCode = ");
        sb.append(i4);
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        switch (i4) {
            case 1000:
                i3 = intent2.getIntExtra("position", -1);
                String stringExtra = intent2.getStringExtra("com.yeelight.cherry.device_id");
                try {
                    jSONObject.put("method", "set_power");
                    jSONArray.put("on");
                    jSONObject.put("params", jSONArray);
                } catch (Exception unused) {
                }
                uVar = new C8330u(stringExtra, Constants.EXTRA_PUSH_COMMAND);
                uVar.mo35485h(jSONObject);
                break;
            case 1001:
                i3 = intent2.getIntExtra("position", -1);
                String stringExtra2 = intent2.getStringExtra("com.yeelight.cherry.device_id");
                try {
                    jSONObject.put("method", "set_power");
                    jSONArray.put("off");
                    jSONObject.put("params", jSONArray);
                } catch (Exception unused2) {
                }
                uVar = new C8330u(stringExtra2, Constants.EXTRA_PUSH_COMMAND);
                uVar.mo35485h(jSONObject);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("device postion = ");
                sb2.append(i3);
                break;
            case 1002:
                int intExtra = intent2.getIntExtra("light_adjust_mode", -1);
                int intExtra2 = intent2.getIntExtra("light_adjust_bright", -1);
                int intExtra3 = intent2.getIntExtra("light_adjust_ct", -1);
                int intExtra4 = intent2.getIntExtra("light_adjust_color", -1);
                String stringExtra3 = intent2.getStringExtra("light_adjust_json");
                int intExtra5 = intent2.getIntExtra("position", -1);
                String stringExtra4 = intent2.getStringExtra("com.yeelight.cherry.device_id");
                C8327s Z = m16983Z(intExtra, intExtra2, intExtra4, intExtra3, stringExtra3);
                if (Z != null) {
                    C8330u uVar2 = new C8330u(stringExtra4, Constants.EXTRA_PUSH_COMMAND);
                    uVar2.mo35485h(Z.mo35294a());
                    this.f11320b.get(intExtra5).put("scene_bundle_item", uVar2);
                    this.f11319a.mo31209d(intExtra5);
                    break;
                } else {
                    return;
                }
            case 1003:
                int intExtra6 = intent2.getIntExtra("scene_select_mode", -1);
                int intExtra7 = intent2.getIntExtra("position", -1);
                String stringExtra5 = intent2.getStringExtra("com.yeelight.cherry.device_id");
                C8327s a0 = m16984a0(intExtra6, intent2.getIntExtra("scene_select_position", -1), stringExtra5);
                if (a0 != null) {
                    C8330u uVar3 = new C8330u(stringExtra5, "scene");
                    C8330u.C8331a aVar = new C8330u.C8331a(a0.mo35451r(), intExtra6);
                    aVar.mo35491c(a0.mo35450q());
                    uVar3.mo35486i(aVar);
                    this.f11320b.get(intExtra7).put("scene_bundle_item", uVar3);
                    this.f11319a.mo31209d(intExtra7);
                    break;
                } else {
                    return;
                }
            case 1004:
                i3 = intent2.getIntExtra("position", -1);
                C8330u Y = CreateSceneNameActivity.m16076Y(intent2.getStringExtra("com.yeelight.cherry.device_id"), C3096u.m8175n().mo23514s(this.f11321c.mo35474o()));
                StringBuilder sb3 = new StringBuilder();
                sb3.append("device postion = ");
                sb3.append(i3);
                this.f11320b.get(i3).put("scene_bundle_item", Y);
                break;
            default:
                return;
        }
        this.f11320b.get(i3).put("scene_bundle_item", uVar);
        this.f11319a.mo31209d(i3);
        this.f11319a.notifyDataSetChanged();
    }

    public void onBackPressed() {
        if (m16987d0()) {
            m16985b0().show();
        } else {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("com.yeelight.cherry.scene_bundle_id");
        if (stringExtra == null) {
            AppUtils.m8300u("SCENE_BUNDLE", "No SCENE_BUNDLE id!");
            finish();
            return;
        }
        C8329t o = C3096u.m8175n().mo23512o(stringExtra);
        this.f11321c = o;
        if (o == null) {
            AppUtils.m8300u("SCENE_BUNDLE", "SCENE_BUNDLE is null!!!");
            finish();
            return;
        }
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_scene_bundle_device_modify);
        ButterKnife.bind((Activity) this);
        SceneItemModifyAdapter sceneItemModifyAdapter = new SceneItemModifyAdapter(this.f11320b);
        this.f11319a = sceneItemModifyAdapter;
        sceneItemModifyAdapter.mo31213i(this.f11324f);
        this.mDeviceList.setLayoutManager(new LinearLayoutManager(this));
        this.mDeviceList.setAdapter(this.f11319a);
        this.mDeviceList.addItemDecoration(new C5655d(this));
        m16989f0();
    }

    @OnClick({2131297689})
    public void save() {
        ArrayList arrayList = new ArrayList();
        for (HashMap next : this.f11320b) {
            if (next.containsKey("scene_bundle_item")) {
                arrayList.add((C8330u) next.get("scene_bundle_item"));
            }
        }
        if (arrayList.isEmpty()) {
            Toast.makeText(this, getString(2131756218), 0).show();
            return;
        }
        this.f11323e = this.f11321c.mo35473n();
        this.f11321c.mo35477r(arrayList);
        C3096u.m8175n().mo23510F(this.f11321c, new C5653b());
    }
}
