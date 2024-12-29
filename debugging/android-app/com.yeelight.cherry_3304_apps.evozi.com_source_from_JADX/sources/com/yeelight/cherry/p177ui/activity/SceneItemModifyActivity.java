package com.yeelight.cherry.p177ui.activity;

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
import com.miot.api.Constants;
import com.miot.common.device.parser.xml.DddTag;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p177ui.adapter.SceneItemModifyAdapter;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p152f.C4247u;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p153g.C4300b0;
import com.yeelight.yeelib.p153g.C9828a0;
import com.yeelight.yeelib.p153g.C9830b;
import com.yeelight.yeelib.p153g.C9833d;
import com.yeelight.yeelib.p153g.C9835f;
import com.yeelight.yeelib.p153g.C9836g;
import com.yeelight.yeelib.p153g.C9851t;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.p153g.C9858z;
import com.yeelight.yeelib.p186e.C9771f;
import com.yeelight.yeelib.p187h.p189h.C9874b;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.activity.SceneActionSelectActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import com.yeelight.yeelib.utils.C4310h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.cherry.ui.activity.SceneItemModifyActivity */
public class SceneItemModifyActivity extends BaseActivity {

    /* renamed from: h */
    private static final String f11749h = SceneItemModifyActivity.class.getSimpleName();

    /* renamed from: b */
    private SceneItemModifyAdapter f11750b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<HashMap<String, Object>> f11751c = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C9858z f11752d;

    /* renamed from: e */
    private C10526e f11753e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public List<C9828a0> f11754f = new ArrayList();

    /* renamed from: g */
    private C9771f f11755g = new C5611a();
    @BindView(2131296591)
    RecyclerView mDeviceList;
    @BindView(2131297424)
    CommonTitleBar mTitleBar;

    /* renamed from: com.yeelight.cherry.ui.activity.SceneItemModifyActivity$a */
    class C5611a implements C9771f {
        C5611a() {
        }

        /* renamed from: a */
        public List<C9828a0> mo26901a() {
            return SceneItemModifyActivity.this.f11752d.mo31908n();
        }

        /* renamed from: b */
        public void mo26902b(int i, String str) {
            Intent intent = new Intent();
            intent.putExtra("com.yeelight.cherry.device_id", str);
            intent.putExtra("position", i);
            SceneItemModifyActivity sceneItemModifyActivity = SceneItemModifyActivity.this;
            intent.putExtra("recommend_template_enable", sceneItemModifyActivity.m16982d0(sceneItemModifyActivity.f11752d));
            intent.setClass(SceneItemModifyActivity.this, SceneActionSelectActivity.class);
            SceneItemModifyActivity.this.startActivityForResult(intent, 0);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SceneItemModifyActivity$b */
    class C5612b implements View.OnClickListener {
        C5612b() {
        }

        public void onClick(View view) {
            SceneItemModifyActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SceneItemModifyActivity$c */
    class C5613c implements View.OnClickListener {

        /* renamed from: com.yeelight.cherry.ui.activity.SceneItemModifyActivity$c$a */
        class C5614a implements C9874b<String> {
            C5614a() {
            }

            /* renamed from: b */
            public void mo23475a(String str) {
                "updateSceneBundle onSuccess : " + str;
                try {
                    if (new JSONObject(str).getInt("code") == 1) {
                        SceneItemModifyActivity.this.setResult(-1);
                        SceneItemModifyActivity.this.finish();
                        return;
                    }
                    SceneItemModifyActivity.this.m16985h0();
                } catch (JSONException e) {
                    e.printStackTrace();
                    SceneItemModifyActivity.this.m16985h0();
                }
            }

            public void onFailure(int i, String str) {
                SceneItemModifyActivity.this.m16985h0();
            }
        }

        C5613c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            for (HashMap hashMap : SceneItemModifyActivity.this.f11751c) {
                if (hashMap.containsKey("scene_bundle_item")) {
                    arrayList.add((C9828a0) hashMap.get("scene_bundle_item"));
                }
            }
            if (arrayList.isEmpty()) {
                SceneItemModifyActivity sceneItemModifyActivity = SceneItemModifyActivity.this;
                Toast.makeText(sceneItemModifyActivity, sceneItemModifyActivity.getString(2131756193), 0).show();
                return;
            }
            SceneItemModifyActivity sceneItemModifyActivity2 = SceneItemModifyActivity.this;
            List unused = sceneItemModifyActivity2.f11754f = sceneItemModifyActivity2.f11752d.mo31908n();
            SceneItemModifyActivity.this.f11752d.mo31912r(arrayList);
            C4247u.m11865n().mo23617F(SceneItemModifyActivity.this.f11752d, new C5614a());
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SceneItemModifyActivity$d */
    class C5615d implements DialogInterface.OnClickListener {
        C5615d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            SceneItemModifyActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SceneItemModifyActivity$e */
    class C5616e extends RecyclerView.ItemDecoration {

        /* renamed from: a */
        private int f11761a;

        /* renamed from: b */
        private Paint f11762b;

        public C5616e(SceneItemModifyActivity sceneItemModifyActivity) {
            Paint paint = new Paint();
            this.f11762b = paint;
            paint.setColor(sceneItemModifyActivity.getResources().getColor(2131099797));
            this.f11761a = C10547m.m25751a(sceneItemModifyActivity, 20.0f);
            this.f11762b.setStrokeWidth(2.0f);
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
                    canvas.drawLine(x, y, childViewHolder.getAdapterPosition() == 0 ? x + ((float) width) : (float) this.f11761a, y, this.f11762b);
                    f = ((float) height) + y;
                    f2 = x + ((float) width);
                    paint = this.f11762b;
                    canvas2 = canvas;
                    f3 = x;
                } else {
                    f3 = x + ((float) this.f11761a);
                    f = y + ((float) height);
                    f2 = x + ((float) width);
                    paint = this.f11762b;
                    canvas2 = canvas;
                }
                canvas2.drawLine(f3, f, f2, f, paint);
            }
        }
    }

    /* renamed from: a0 */
    private C9856y m16979a0(int i, int i2, int i3, int i4, String str) {
        "mode = " + i + " , bright = " + i2 + " , color = " + i3 + " , ct = " + i4 + " , flowJson = " + str;
        if (i == 0) {
            return new C9836g("", -1, 3, i2, i4);
        }
        if (i == 1) {
            return new C9835f("", -1, 2, i2, i3);
        }
        if (i == 2) {
            try {
                return C9830b.m23922Z(new JSONObject(str));
            } catch (Exception unused) {
            }
        } else if (i != 3) {
            if (i == 4) {
                return new C9851t("", -1, 6, i2);
            }
            "No reason to run here! " + new Exception();
            return null;
        }
        return new C9833d("", -1, 3, i2);
    }

    /* renamed from: b0 */
    private C9856y m16980b0(int i, int i2, String str) {
        List k;
        C6006h L0 = C4257w.m11947l0().mo23651L0(str);
        if (i == 0) {
            k = C4300b0.m12083u().mo23747k(L0.mo23330i1());
            if (k == null) {
                C4310h.m12146b(new C4308b.C4309a("RecommendSceneListNullException", "recommendSceneList is null, device model: " + L0.mo23330i1()));
                return null;
            }
        } else if (i == 1) {
            k = C4300b0.m12083u().mo23746j(L0.mo23330i1());
        } else if (i != 2) {
            return null;
        } else {
            k = C4300b0.m12083u().mo23751p(L0.mo23330i1());
        }
        return (C9856y) k.get(i2);
    }

    /* renamed from: c0 */
    private C10526e m16981c0() {
        if (this.f11753e == null) {
            C10526e.C10531e eVar = new C10526e.C10531e(this);
            eVar.mo33358i(getString(2131755230));
            eVar.mo33356g(getString(2131755284));
            eVar.mo33353d(-1, getString(2131755277), new C5615d());
            eVar.mo33353d(-2, getString(2131755229), (DialogInterface.OnClickListener) null);
            this.f11753e = eVar.mo33351b();
        }
        return this.f11753e;
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public boolean m16982d0(C9858z zVar) {
        return (zVar == null || !TextUtils.equals("2", zVar.mo31905k()) || C4247u.m11865n().mo23621s(zVar.mo31909o()) == null) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m16983e0() {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r5.f11751c
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
            com.yeelight.yeelib.g.a0 r2 = (com.yeelight.yeelib.p153g.C9828a0) r2
            r0.add(r2)
            goto L_0x000b
        L_0x0029:
            int r1 = r0.size()
            com.yeelight.yeelib.g.z r2 = r5.f11752d
            java.util.List r2 = r2.mo31908n()
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
            com.yeelight.yeelib.g.a0 r1 = (com.yeelight.yeelib.p153g.C9828a0) r1
            com.yeelight.yeelib.g.z r2 = r5.f11752d
            java.lang.String r4 = r1.mo31732e()
            boolean r2 = r2.mo31902h(r4)
            if (r2 != 0) goto L_0x0058
            return r3
        L_0x0058:
            com.yeelight.yeelib.g.z r2 = r5.f11752d
            java.lang.String r1 = r1.mo31732e()
            com.yeelight.yeelib.g.a0 r1 = r2.mo31903i(r1)
            if (r1 != 0) goto L_0x003f
            return r3
        L_0x0065:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.activity.SceneItemModifyActivity.m16983e0():boolean");
    }

    /* renamed from: g0 */
    private void m16984g0() {
        HashMap hashMap;
        this.f11751c.clear();
        C4257w l0 = C4257w.m11947l0();
        List<C6006h> A0 = l0.mo23638A0();
        List<C9828a0> n = this.f11752d.mo31908n();
        if (!n.isEmpty()) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("type", 3);
            hashMap2.put(ScanBarcodeActivity.TITLE, getString(2131756158));
            this.f11751c.add(hashMap2);
            for (C9828a0 next : n) {
                try {
                    C6006h L0 = l0.mo23651L0(next.mo31732e());
                    "deviceBase = " + L0;
                    hashMap = new HashMap();
                    hashMap.put("type", 1);
                    hashMap.put(DddTag.DEVICE, L0);
                    hashMap.put("scene_bundle_item", next);
                    if (L0 != null) {
                        A0.remove(L0);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    hashMap = new HashMap();
                    hashMap.put("type", 1);
                    hashMap.put(DddTag.DEVICE, (Object) null);
                    hashMap.put("scene_bundle_item", next);
                }
                this.f11751c.add(hashMap);
            }
            this.f11750b.mo27247h(n.size());
        }
        if (!A0.isEmpty()) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("type", 3);
            hashMap3.put(ScanBarcodeActivity.TITLE, getString(2131756159));
            this.f11751c.add(hashMap3);
            this.f11750b.mo27247h(this.f11751c.size());
            for (C6006h put : A0) {
                HashMap hashMap4 = new HashMap();
                hashMap4.put("type", 2);
                hashMap4.put(DddTag.DEVICE, put);
                this.f11751c.add(hashMap4);
            }
        }
        this.f11750b.mo27245f(n.size());
        this.f11750b.mo27246g(this.f11751c.size() - 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public void m16985h0() {
        runOnUiThread(new C5748n2(this));
        this.f11752d.mo31912r(this.f11754f);
    }

    /* renamed from: f0 */
    public /* synthetic */ void mo26900f0() {
        Toast.makeText(this, getString(2131756206), 0).show();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        C9828a0 a0Var;
        int i3;
        int i4 = i2;
        Intent intent2 = intent;
        "CreateSceneBundle on Activity result called!!! resultCode = " + i4;
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
                a0Var = new C9828a0(stringExtra, Constants.EXTRA_PUSH_COMMAND);
                a0Var.mo31735h(jSONObject);
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
                a0Var = new C9828a0(stringExtra2, Constants.EXTRA_PUSH_COMMAND);
                a0Var.mo31735h(jSONObject);
                "device postion = " + i3;
                break;
            case 1002:
                int intExtra = intent2.getIntExtra("light_adjust_mode", -1);
                int intExtra2 = intent2.getIntExtra("light_adjust_bright", -1);
                int intExtra3 = intent2.getIntExtra("light_adjust_ct", -1);
                int intExtra4 = intent2.getIntExtra("light_adjust_color", -1);
                String stringExtra3 = intent2.getStringExtra("light_adjust_json");
                int intExtra5 = intent2.getIntExtra("position", -1);
                String stringExtra4 = intent2.getStringExtra("com.yeelight.cherry.device_id");
                C9856y a0 = m16979a0(intExtra, intExtra2, intExtra4, intExtra3, stringExtra3);
                if (a0 != null) {
                    C9828a0 a0Var2 = new C9828a0(stringExtra4, Constants.EXTRA_PUSH_COMMAND);
                    a0Var2.mo31735h(a0.mo31743a());
                    this.f11751c.get(intExtra5).put("scene_bundle_item", a0Var2);
                    this.f11750b.mo27244d(intExtra5);
                    break;
                } else {
                    return;
                }
            case 1003:
                int intExtra6 = intent2.getIntExtra("scene_select_mode", -1);
                int intExtra7 = intent2.getIntExtra("position", -1);
                String stringExtra5 = intent2.getStringExtra("com.yeelight.cherry.device_id");
                C9856y b0 = m16980b0(intExtra6, intent2.getIntExtra("scene_select_position", -1), stringExtra5);
                if (b0 != null) {
                    C9828a0 a0Var3 = new C9828a0(stringExtra5, "scene");
                    C9828a0.C9829a aVar = new C9828a0.C9829a(b0.mo31886r(), intExtra6);
                    aVar.mo31741c(b0.mo31885q());
                    a0Var3.mo31736i(aVar);
                    this.f11751c.get(intExtra7).put("scene_bundle_item", a0Var3);
                    this.f11750b.mo27244d(intExtra7);
                    break;
                } else {
                    return;
                }
            case 1004:
                i3 = intent2.getIntExtra("position", -1);
                "device postion = " + i3;
                this.f11751c.get(i3).put("scene_bundle_item", CreateSceneNameActivity.m16172Y(intent2.getStringExtra("com.yeelight.cherry.device_id"), C4247u.m11865n().mo23621s(this.f11752d.mo31909o())));
                break;
            default:
                return;
        }
        this.f11751c.get(i3).put("scene_bundle_item", a0Var);
        this.f11750b.mo27244d(i3);
        this.f11750b.notifyDataSetChanged();
    }

    public void onBackPressed() {
        if (m16983e0()) {
            m16981c0().show();
        } else {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("com.yeelight.cherry.scene_bundle_id");
        if (stringExtra == null) {
            C4308b.m12139r("SCENE_BUNDLE", "No SCENE_BUNDLE id!");
            finish();
            return;
        }
        C9858z o = C4247u.m11865n().mo23619o(stringExtra);
        this.f11752d = o;
        if (o == null) {
            C4308b.m12139r("SCENE_BUNDLE", "SCENE_BUNDLE is null!!!");
            finish();
            return;
        }
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_scene_bundle_device_modify);
        ButterKnife.bind((Activity) this);
        this.mTitleBar.mo32825a(getString(2131756198), new C5612b(), new C5613c());
        this.mTitleBar.setRightTextColor(getResources().getColor(2131099839));
        SceneItemModifyAdapter sceneItemModifyAdapter = new SceneItemModifyAdapter(this.f11751c);
        this.f11750b = sceneItemModifyAdapter;
        sceneItemModifyAdapter.mo27248i(this.f11755g);
        this.mDeviceList.setLayoutManager(new LinearLayoutManager(this));
        this.mDeviceList.setAdapter(this.f11750b);
        this.mDeviceList.addItemDecoration(new C5616e(this));
        m16984g0();
    }
}
