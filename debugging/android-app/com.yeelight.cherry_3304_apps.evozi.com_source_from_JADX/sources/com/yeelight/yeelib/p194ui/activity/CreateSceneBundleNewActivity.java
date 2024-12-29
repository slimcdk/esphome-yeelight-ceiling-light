package com.yeelight.yeelib.p194ui.activity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import com.miot.api.Constants;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.data.C7574b;
import com.yeelight.yeelib.data.C7601g;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.p152f.C4247u;
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
import com.yeelight.yeelib.p194ui.adapter.C10359a;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.ui.activity.CreateSceneBundleNewActivity */
public class CreateSceneBundleNewActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static String f18187m = CreateSceneBundleNewActivity.class.getSimpleName();

    /* renamed from: b */
    CommonTitleBar f18188b;

    /* renamed from: c */
    ListView f18189c;

    /* renamed from: d */
    Button f18190d;

    /* renamed from: e */
    C10359a f18191e;

    /* renamed from: f */
    Cursor f18192f;

    /* renamed from: g */
    C9858z f18193g = null;

    /* renamed from: h */
    List<Integer> f18194h = new ArrayList();

    /* renamed from: i */
    List<C9828a0> f18195i = new ArrayList();

    /* renamed from: j */
    private String f18196j;

    /* renamed from: k */
    private int f18197k;

    /* renamed from: l */
    private C9771f f18198l = new C9969a();

    /* renamed from: com.yeelight.yeelib.ui.activity.CreateSceneBundleNewActivity$a */
    class C9969a implements C9771f {
        C9969a() {
        }

        /* renamed from: a */
        public List<C9828a0> mo26901a() {
            return CreateSceneBundleNewActivity.this.f18195i;
        }

        /* renamed from: b */
        public void mo26902b(int i, String str) {
            Intent intent = new Intent();
            intent.putExtra("com.yeelight.cherry.device_id", str);
            intent.putExtra("position", i);
            intent.setClass(CreateSceneBundleNewActivity.this, SceneActionSelectActivity.class);
            CreateSceneBundleNewActivity.this.startActivityForResult(intent, 0);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.CreateSceneBundleNewActivity$b */
    class C9970b implements View.OnClickListener {
        C9970b() {
        }

        public void onClick(View view) {
            CreateSceneBundleNewActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.CreateSceneBundleNewActivity$c */
    class C9971c implements View.OnClickListener {
        C9971c() {
        }

        public void onClick(View view) {
            CreateSceneBundleNewActivity.this.m24419c0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.CreateSceneBundleNewActivity$d */
    class C9972d implements View.OnClickListener {
        C9972d() {
        }

        public void onClick(View view) {
            try {
                Intent intent = new Intent(CreateSceneBundleNewActivity.this, Class.forName("com.yeelight.cherry.ui.activity.MainActivity"));
                intent.addFlags(67108864);
                CreateSceneBundleNewActivity.this.startActivity(intent);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            CreateSceneBundleNewActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.CreateSceneBundleNewActivity$e */
    class C9973e implements View.OnClickListener {
        C9973e() {
        }

        public void onClick(View view) {
            CreateSceneBundleNewActivity.this.mo32224Z();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.CreateSceneBundleNewActivity$f */
    class C9974f implements C9874b<String> {
        C9974f() {
        }

        /* renamed from: b */
        public /* synthetic */ void mo32229b() {
            CreateSceneBundleNewActivity.this.f18190d.setEnabled(true);
            Toast.makeText(CreateSceneBundleNewActivity.this, R$string.common_text_save_failed, 0).show();
        }

        /* renamed from: c */
        public /* synthetic */ void mo32230c() {
            Toast.makeText(CreateSceneBundleNewActivity.this, R$string.common_text_save_succeed, 0).show();
            try {
                Intent intent = new Intent(CreateSceneBundleNewActivity.this, Class.forName("com.yeelight.cherry.ui.activity.MainActivity"));
                intent.addFlags(67108864);
                CreateSceneBundleNewActivity.this.startActivity(intent);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            CreateSceneBundleNewActivity.this.finish();
        }

        /* renamed from: d */
        public /* synthetic */ void mo32231d() {
            Toast.makeText(CreateSceneBundleNewActivity.this, R$string.scene_cache_save_repeat, 0).show();
        }

        /* renamed from: e */
        public /* synthetic */ void mo32232e() {
            Toast.makeText(CreateSceneBundleNewActivity.this, R$string.common_text_save_failed, 0).show();
        }

        /* renamed from: f */
        public void mo23475a(String str) {
            CreateSceneBundleNewActivity createSceneBundleNewActivity;
            Runnable fVar;
            String unused = CreateSceneBundleNewActivity.f18187m;
            "scene bundle save onSuccess " + str;
            try {
                int i = new JSONObject(str).getInt("code");
                if (i == 1) {
                    C4247u.m11865n().mo23615D();
                    CreateSceneBundleNewActivity.this.runOnUiThread(new C10306c(this));
                    return;
                }
                if (i == 3002) {
                    createSceneBundleNewActivity = CreateSceneBundleNewActivity.this;
                    fVar = new C10310e(this);
                } else {
                    createSceneBundleNewActivity = CreateSceneBundleNewActivity.this;
                    fVar = new C10312f(this);
                }
                createSceneBundleNewActivity.runOnUiThread(fVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            String unused = CreateSceneBundleNewActivity.f18187m;
            "scene bundle save onFailure msg = " + str;
            CreateSceneBundleNewActivity.this.f18190d.post(new C10308d(this));
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.CreateSceneBundleNewActivity$g */
    class C9975g implements C9874b<String> {
        C9975g() {
        }

        /* renamed from: b */
        public /* synthetic */ void mo32234b() {
            Toast.makeText(CreateSceneBundleNewActivity.this, R$string.common_text_save_failed, 0).show();
        }

        /* renamed from: c */
        public /* synthetic */ void mo32235c() {
            Toast.makeText(CreateSceneBundleNewActivity.this, R$string.common_text_save_succeed, 0).show();
            CreateSceneBundleNewActivity.this.finish();
        }

        /* renamed from: d */
        public /* synthetic */ void mo32236d() {
            Toast.makeText(CreateSceneBundleNewActivity.this, R$string.common_text_save_failed, 0).show();
        }

        /* renamed from: e */
        public void mo23475a(String str) {
            CreateSceneBundleNewActivity createSceneBundleNewActivity;
            Runnable hVar;
            String unused = CreateSceneBundleNewActivity.f18187m;
            "scene bundle save onSuccess " + str;
            try {
                if (new JSONObject(str).getInt("code") == 1) {
                    createSceneBundleNewActivity = CreateSceneBundleNewActivity.this;
                    hVar = new C10318i(this);
                } else {
                    createSceneBundleNewActivity = CreateSceneBundleNewActivity.this;
                    hVar = new C10316h(this);
                }
                createSceneBundleNewActivity.runOnUiThread(hVar);
            } catch (Exception unused2) {
            }
        }

        public void onFailure(int i, String str) {
            String unused = CreateSceneBundleNewActivity.f18187m;
            "scene bundle save onFailure msg = " + str;
            CreateSceneBundleNewActivity.this.runOnUiThread(new C10314g(this));
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.CreateSceneBundleNewActivity$h */
    class C9976h implements C9874b<String> {
        C9976h() {
        }

        /* renamed from: b */
        public /* synthetic */ void mo32238b() {
            Toast.makeText(CreateSceneBundleNewActivity.this, R$string.common_text_save_failed, 0).show();
        }

        /* renamed from: c */
        public /* synthetic */ void mo32239c() {
            Toast.makeText(CreateSceneBundleNewActivity.this, R$string.common_text_save_succeed, 0).show();
            CreateSceneBundleNewActivity.this.finish();
        }

        /* renamed from: d */
        public /* synthetic */ void mo32240d() {
            Toast.makeText(CreateSceneBundleNewActivity.this, R$string.common_text_save_failed, 0).show();
        }

        /* renamed from: e */
        public void mo23475a(String str) {
            CreateSceneBundleNewActivity createSceneBundleNewActivity;
            Runnable jVar;
            String unused = CreateSceneBundleNewActivity.f18187m;
            "scene bundle update onSuccess " + str;
            try {
                if (new JSONObject(str).getInt("code") == 1) {
                    createSceneBundleNewActivity = CreateSceneBundleNewActivity.this;
                    jVar = new C10324l(this);
                } else {
                    createSceneBundleNewActivity = CreateSceneBundleNewActivity.this;
                    jVar = new C10320j(this);
                }
                createSceneBundleNewActivity.runOnUiThread(jVar);
            } catch (Exception unused2) {
            }
        }

        public void onFailure(int i, String str) {
            String unused = CreateSceneBundleNewActivity.f18187m;
            "scene bundle update onFailure msg = " + str;
            CreateSceneBundleNewActivity.this.runOnUiThread(new C10322k(this));
        }
    }

    /* renamed from: X */
    private C9856y m24415X(int i, int i2, int i3, int i4, String str) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (r3 == null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        if (r3 == null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        com.yeelight.yeelib.p194ui.activity.BaseActivity.m24384U(r2);
        finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r3 == null) goto L_0x0045;
     */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.yeelight.yeelib.p153g.C9856y m24416Y(int r3, int r4, java.lang.String r5) {
        /*
            r2 = this;
            com.yeelight.yeelib.f.w r0 = com.yeelight.yeelib.p152f.C4257w.m11947l0()
            com.yeelight.yeelib.c.h r5 = r0.mo23651L0(r5)
            r0 = 0
            if (r3 == 0) goto L_0x0037
            r1 = 1
            if (r3 == r1) goto L_0x0028
            r1 = 2
            if (r3 == r1) goto L_0x0012
            return r0
        L_0x0012:
            com.yeelight.yeelib.g.b0 r3 = com.yeelight.yeelib.p153g.C4300b0.m12083u()
            java.lang.String r5 = r5.mo23330i1()
            java.util.List r3 = r3.mo23751p(r5)
            if (r3 != 0) goto L_0x0021
            goto L_0x0045
        L_0x0021:
            java.lang.Object r3 = r3.get(r4)
            com.yeelight.yeelib.g.y r3 = (com.yeelight.yeelib.p153g.C9856y) r3
            return r3
        L_0x0028:
            com.yeelight.yeelib.g.b0 r3 = com.yeelight.yeelib.p153g.C4300b0.m12083u()
            java.lang.String r5 = r5.mo23330i1()
            java.util.List r3 = r3.mo23746j(r5)
            if (r3 != 0) goto L_0x0021
            goto L_0x0045
        L_0x0037:
            com.yeelight.yeelib.g.b0 r3 = com.yeelight.yeelib.p153g.C4300b0.m12083u()
            java.lang.String r5 = r5.mo23330i1()
            java.util.List r3 = r3.mo23747k(r5)
            if (r3 != 0) goto L_0x0021
        L_0x0045:
            com.yeelight.yeelib.p194ui.activity.BaseActivity.m24384U(r2)
            r2.finish()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.activity.CreateSceneBundleNewActivity.m24416Y(int, int, java.lang.String):com.yeelight.yeelib.g.y");
    }

    /* renamed from: a0 */
    private void m24417a0(String str) {
        if (str == null) {
            C4308b.m12139r(f18187m, "Invalid deviceId in clearCurrentSceneItem");
            return;
        }
        for (C9828a0 next : this.f18195i) {
            if (str.equals(next.mo31732e())) {
                this.f18195i.remove(next);
                return;
            }
        }
    }

    /* renamed from: b0 */
    private void m24418b0(String str) {
        C4247u.m11865n().mo23614B(C9858z.m24108d(this.f18195i, str, this.f18197k, ""), new C9974f());
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public void m24419c0() {
        if (this.f18193g.mo31904j().isEmpty() || !this.f18193g.mo31906l().equals(this.f18193g.mo31904j())) {
            C4247u.m11865n().mo23617F(C9858z.m24107c(this.f18195i, this.f18193g.mo31906l()), new C9976h());
            return;
        }
        C4247u.m11865n().mo23614B(C9858z.m24108d(this.f18195i, this.f18193g.mo31907m(), 0, this.f18193g.mo31904j()), new C9975g());
    }

    /* renamed from: Z */
    public void mo32224Z() {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.f18191e.getCount()) {
                z = false;
                break;
            } else if (this.f18191e.mo32667b(i)) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            Toast.makeText(this, R$string.scene_bundle_no_device_select, 0).show();
            return;
        }
        this.f18190d.setEnabled(false);
        m24418b0(this.f18196j);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        C9828a0 a0Var;
        int i3;
        int i4 = i2;
        Intent intent2 = intent;
        "CreateSceneBundle on Activity result called!!! resultCode = " + i2;
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
                m24417a0(stringExtra);
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
                m24417a0(stringExtra2);
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
                C9856y X = m24415X(intExtra, intExtra2, intExtra4, intExtra3, stringExtra3);
                if (X != null) {
                    m24417a0(stringExtra4);
                    C9828a0 a0Var2 = new C9828a0(stringExtra4, Constants.EXTRA_PUSH_COMMAND);
                    a0Var2.mo31735h(X.mo31743a());
                    this.f18195i.add(a0Var2);
                    this.f18191e.mo32671d(intExtra5, true);
                    break;
                } else {
                    return;
                }
            case 1003:
                int intExtra6 = intent2.getIntExtra("scene_select_mode", -1);
                int intExtra7 = intent2.getIntExtra("position", -1);
                String stringExtra5 = intent2.getStringExtra("com.yeelight.cherry.device_id");
                C9856y Y = m24416Y(intExtra6, intent2.getIntExtra("scene_select_position", -1), stringExtra5);
                if (Y != null) {
                    m24417a0(stringExtra5);
                    C9828a0 a0Var3 = new C9828a0(stringExtra5, "scene");
                    C9828a0.C9829a aVar = new C9828a0.C9829a(Y.mo31886r(), intExtra6);
                    aVar.mo31741c(Y.mo31885q());
                    a0Var3.mo31736i(aVar);
                    this.f18195i.add(a0Var3);
                    this.f18191e.mo32671d(intExtra7, true);
                    break;
                } else {
                    return;
                }
            default:
                return;
        }
        this.f18195i.add(a0Var);
        this.f18191e.mo32671d(i3, true);
        this.f18191e.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        View.OnClickListener onClickListener;
        CommonTitleBar commonTitleBar;
        super.onCreate(bundle);
        mo32193P();
        setContentView(R$layout.activity_add_scene_bundle_new);
        C10547m.m25758h(true, this);
        this.f18188b = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f18189c = (ListView) findViewById(R$id.device_list);
        this.f18190d = (Button) findViewById(R$id.next_step);
        Intent intent = getIntent();
        if (intent.hasExtra("com.yeelight.cherry.scene_bundle_id")) {
            C9858z o = C4247u.m11865n().mo23619o(intent.getStringExtra("com.yeelight.cherry.scene_bundle_id"));
            this.f18193g = o;
            for (C9828a0 add : o.mo31908n()) {
                this.f18195i.add(add);
            }
            "CreateSceneBundleActivity, edit mode, found scene bundle: " + this.f18193g;
        }
        this.f18188b.mo32825a(getString(this.f18193g == null ? R$string.common_text_select_device : R$string.scene_bundle_edit), new C9970b(), (View.OnClickListener) null);
        this.f18188b.setTitleTextSize(16);
        C9858z zVar = this.f18193g;
        this.f18191e = new C10359a(this, (Cursor) null, zVar == null ? "" : zVar.mo31906l(), this.f18198l);
        this.f18192f = new C7601g(DeviceDataProvider.m22371F());
        this.f18189c.setAdapter(this.f18191e);
        this.f18191e.changeCursor(this.f18192f);
        if (this.f18193g != null) {
            if (this.f18192f.moveToFirst()) {
                do {
                    Cursor cursor = this.f18192f;
                    if (this.f18193g.mo31902h(cursor.getString(cursor.getColumnIndex(C7574b.C7575a.C7577b.f15346c)))) {
                        this.f18194h.add(Integer.valueOf(this.f18192f.getPosition()));
                    }
                } while (this.f18192f.moveToNext());
            }
            this.f18188b.setRightButtonVisibility(8);
            this.f18188b.setRightTextVisible(true);
            this.f18188b.setRightTextStr(getString(R$string.common_text_save));
            commonTitleBar = this.f18188b;
            onClickListener = new C9971c();
        } else {
            this.f18188b.setRightButtonResource(R$drawable.icon_yeelight_common_close);
            this.f18188b.setRightButtonVisibility(0);
            this.f18188b.setRightTextVisible(false);
            commonTitleBar = this.f18188b;
            onClickListener = new C9972d();
        }
        commonTitleBar.setRightButtonClickListener(onClickListener);
        this.f18196j = getIntent().getStringExtra("room_name");
        this.f18197k = getIntent().getIntExtra("create_res_index", 0);
        this.f18190d.setOnClickListener(new C9973e());
        this.f18190d.setEnabled(true);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        Cursor cursor = this.f18192f;
        if (cursor != null) {
            cursor.close();
        }
        super.onDestroy();
        mo32192M(this);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f18191e.notifyDataSetChanged();
    }
}
