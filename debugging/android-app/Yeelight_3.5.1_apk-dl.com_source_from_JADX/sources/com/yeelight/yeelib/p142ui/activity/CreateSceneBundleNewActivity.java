package com.yeelight.yeelib.p142ui.activity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import com.miot.api.Constants;
import com.yeelight.cherry.p141ui.activity.MainActivity;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.data.C6065f;
import com.yeelight.yeelib.data.DeviceBrowserContract;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.managers.C3096u;
import com.yeelight.yeelib.models.C8309b;
import com.yeelight.yeelib.models.C8311d;
import com.yeelight.yeelib.models.C8313f;
import com.yeelight.yeelib.models.C8314g;
import com.yeelight.yeelib.models.C8322n;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.models.C8329t;
import com.yeelight.yeelib.models.C8330u;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p051j4.C9193k;
import p134c4.C4007b;
import p155f4.C9031a;
import p237z3.C12146f;

/* renamed from: com.yeelight.yeelib.ui.activity.CreateSceneBundleNewActivity */
public class CreateSceneBundleNewActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static String f14493l = "CreateSceneBundleNewActivity";

    /* renamed from: a */
    CommonTitleBar f14494a;

    /* renamed from: b */
    ListView f14495b;

    /* renamed from: c */
    Button f14496c;

    /* renamed from: d */
    C9031a f14497d;

    /* renamed from: e */
    Cursor f14498e;

    /* renamed from: f */
    C8329t f14499f = null;

    /* renamed from: g */
    List<Integer> f14500g = new ArrayList();

    /* renamed from: h */
    List<C8330u> f14501h = new ArrayList();

    /* renamed from: i */
    private String f14502i;

    /* renamed from: j */
    private int f14503j;

    /* renamed from: k */
    private C12146f f14504k = new C8386a();

    /* renamed from: com.yeelight.yeelib.ui.activity.CreateSceneBundleNewActivity$a */
    class C8386a implements C12146f {
        C8386a() {
        }

        /* renamed from: a */
        public List<C8330u> mo30878a() {
            return CreateSceneBundleNewActivity.this.f14501h;
        }

        /* renamed from: b */
        public void mo30879b(int i, String str) {
            Intent intent = new Intent();
            intent.putExtra("com.yeelight.cherry.device_id", str);
            intent.putExtra("position", i);
            intent.setClass(CreateSceneBundleNewActivity.this, SceneActionSelectActivity.class);
            CreateSceneBundleNewActivity.this.startActivityForResult(intent, 0);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.CreateSceneBundleNewActivity$b */
    class C8387b implements View.OnClickListener {
        C8387b() {
        }

        public void onClick(View view) {
            CreateSceneBundleNewActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.CreateSceneBundleNewActivity$c */
    class C8388c implements View.OnClickListener {
        C8388c() {
        }

        public void onClick(View view) {
            CreateSceneBundleNewActivity.this.m19984c0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.CreateSceneBundleNewActivity$d */
    class C8389d implements View.OnClickListener {
        C8389d() {
        }

        public void onClick(View view) {
            try {
                int i = MainActivity.f10688y;
                Intent intent = new Intent(CreateSceneBundleNewActivity.this, MainActivity.class);
                intent.addFlags(67108864);
                CreateSceneBundleNewActivity.this.startActivity(intent);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            CreateSceneBundleNewActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.CreateSceneBundleNewActivity$e */
    class C8390e implements View.OnClickListener {
        C8390e() {
        }

        public void onClick(View view) {
            CreateSceneBundleNewActivity.this.mo35682Z();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.CreateSceneBundleNewActivity$f */
    class C8391f implements C4007b<String> {
        C8391f() {
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m19992f() {
            CreateSceneBundleNewActivity.this.f14496c.setEnabled(true);
            Toast.makeText(CreateSceneBundleNewActivity.this, R$string.common_text_save_failed, 0).show();
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m19993g() {
            Toast.makeText(CreateSceneBundleNewActivity.this, R$string.common_text_save_succeed, 0).show();
            try {
                int i = MainActivity.f10688y;
                Intent intent = new Intent(CreateSceneBundleNewActivity.this, MainActivity.class);
                intent.addFlags(67108864);
                CreateSceneBundleNewActivity.this.startActivity(intent);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            CreateSceneBundleNewActivity.this.finish();
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m19994h() {
            Toast.makeText(CreateSceneBundleNewActivity.this, R$string.scene_cache_save_repeat, 0).show();
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m19995i() {
            Toast.makeText(CreateSceneBundleNewActivity.this, R$string.common_text_save_failed, 0).show();
        }

        /* renamed from: j */
        public void mo23338a(String str) {
            CreateSceneBundleNewActivity createSceneBundleNewActivity;
            Runnable cVar;
            String unused = CreateSceneBundleNewActivity.f14493l;
            StringBuilder sb = new StringBuilder();
            sb.append("scene bundle save onSuccess ");
            sb.append(str);
            try {
                int i = new JSONObject(str).getInt("code");
                if (i == 1) {
                    C3096u.m8175n().mo23508D();
                    CreateSceneBundleNewActivity.this.runOnUiThread(new C8716a(this));
                    return;
                }
                if (i == 3002) {
                    createSceneBundleNewActivity = CreateSceneBundleNewActivity.this;
                    cVar = new C8717b(this);
                } else {
                    createSceneBundleNewActivity = CreateSceneBundleNewActivity.this;
                    cVar = new C8718c(this);
                }
                createSceneBundleNewActivity.runOnUiThread(cVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            String unused = CreateSceneBundleNewActivity.f14493l;
            StringBuilder sb = new StringBuilder();
            sb.append("scene bundle save onFailure msg = ");
            sb.append(str);
            CreateSceneBundleNewActivity.this.f14496c.post(new C8719d(this));
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.CreateSceneBundleNewActivity$g */
    class C8392g implements C4007b<String> {
        C8392g() {
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m20001e() {
            Toast.makeText(CreateSceneBundleNewActivity.this, R$string.common_text_save_failed, 0).show();
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m20002f() {
            Toast.makeText(CreateSceneBundleNewActivity.this, R$string.common_text_save_succeed, 0).show();
            CreateSceneBundleNewActivity.this.finish();
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m20003g() {
            Toast.makeText(CreateSceneBundleNewActivity.this, R$string.common_text_save_failed, 0).show();
        }

        /* renamed from: h */
        public void mo23338a(String str) {
            CreateSceneBundleNewActivity createSceneBundleNewActivity;
            Runnable fVar;
            String unused = CreateSceneBundleNewActivity.f14493l;
            StringBuilder sb = new StringBuilder();
            sb.append("scene bundle save onSuccess ");
            sb.append(str);
            try {
                if (new JSONObject(str).getInt("code") == 1) {
                    createSceneBundleNewActivity = CreateSceneBundleNewActivity.this;
                    fVar = new C8722g(this);
                } else {
                    createSceneBundleNewActivity = CreateSceneBundleNewActivity.this;
                    fVar = new C8721f(this);
                }
                createSceneBundleNewActivity.runOnUiThread(fVar);
            } catch (Exception unused2) {
            }
        }

        public void onFailure(int i, String str) {
            String unused = CreateSceneBundleNewActivity.f14493l;
            StringBuilder sb = new StringBuilder();
            sb.append("scene bundle save onFailure msg = ");
            sb.append(str);
            CreateSceneBundleNewActivity.this.runOnUiThread(new C8720e(this));
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.CreateSceneBundleNewActivity$h */
    class C8393h implements C4007b<String> {
        C8393h() {
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m20009e() {
            Toast.makeText(CreateSceneBundleNewActivity.this, R$string.common_text_save_failed, 0).show();
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m20010f() {
            Toast.makeText(CreateSceneBundleNewActivity.this, R$string.common_text_save_succeed, 0).show();
            CreateSceneBundleNewActivity.this.finish();
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m20011g() {
            Toast.makeText(CreateSceneBundleNewActivity.this, R$string.common_text_save_failed, 0).show();
        }

        /* renamed from: h */
        public void mo23338a(String str) {
            CreateSceneBundleNewActivity createSceneBundleNewActivity;
            Runnable hVar;
            String unused = CreateSceneBundleNewActivity.f14493l;
            StringBuilder sb = new StringBuilder();
            sb.append("scene bundle update onSuccess ");
            sb.append(str);
            try {
                if (new JSONObject(str).getInt("code") == 1) {
                    createSceneBundleNewActivity = CreateSceneBundleNewActivity.this;
                    hVar = new C8725j(this);
                } else {
                    createSceneBundleNewActivity = CreateSceneBundleNewActivity.this;
                    hVar = new C8723h(this);
                }
                createSceneBundleNewActivity.runOnUiThread(hVar);
            } catch (Exception unused2) {
            }
        }

        public void onFailure(int i, String str) {
            String unused = CreateSceneBundleNewActivity.f14493l;
            StringBuilder sb = new StringBuilder();
            sb.append("scene bundle update onFailure msg = ");
            sb.append(str);
            CreateSceneBundleNewActivity.this.runOnUiThread(new C8724i(this));
        }
    }

    /* renamed from: X */
    private C8327s m19980X(int i, int i2, int i3, int i4, String str) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (r3 == null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        if (r3 == null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        com.yeelight.yeelib.p142ui.activity.BaseActivity.m19947U(r2);
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
    private com.yeelight.yeelib.models.C8327s m19981Y(int r3, int r4, java.lang.String r5) {
        /*
            r2 = this;
            com.yeelight.yeelib.managers.YeelightDeviceManager r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.m7800o0()
            com.yeelight.yeelib.device.WifiDeviceBase r5 = r0.mo23274P0(r5)
            r0 = 0
            if (r3 == 0) goto L_0x0037
            r1 = 1
            if (r3 == r1) goto L_0x0028
            r1 = 2
            if (r3 == r1) goto L_0x0012
            return r0
        L_0x0012:
            com.yeelight.yeelib.models.v r3 = com.yeelight.yeelib.models.C3112v.m8242u()
            java.lang.String r5 = r5.mo23144i1()
            java.util.List r3 = r3.mo23564p(r5)
            if (r3 != 0) goto L_0x0021
            goto L_0x0045
        L_0x0021:
            java.lang.Object r3 = r3.get(r4)
            com.yeelight.yeelib.models.s r3 = (com.yeelight.yeelib.models.C8327s) r3
            return r3
        L_0x0028:
            com.yeelight.yeelib.models.v r3 = com.yeelight.yeelib.models.C3112v.m8242u()
            java.lang.String r5 = r5.mo23144i1()
            java.util.List r3 = r3.mo23559j(r5)
            if (r3 != 0) goto L_0x0021
            goto L_0x0045
        L_0x0037:
            com.yeelight.yeelib.models.v r3 = com.yeelight.yeelib.models.C3112v.m8242u()
            java.lang.String r5 = r5.mo23144i1()
            java.util.List r3 = r3.mo23560k(r5)
            if (r3 != 0) goto L_0x0021
        L_0x0045:
            com.yeelight.yeelib.p142ui.activity.BaseActivity.m19947U(r2)
            r2.finish()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p142ui.activity.CreateSceneBundleNewActivity.m19981Y(int, int, java.lang.String):com.yeelight.yeelib.models.s");
    }

    /* renamed from: a0 */
    private void m19982a0(String str) {
        if (str == null) {
            AppUtils.m8300u(f14493l, "Invalid deviceId in clearCurrentSceneItem");
            return;
        }
        for (C8330u next : this.f14501h) {
            if (str.equals(next.mo35482e())) {
                this.f14501h.remove(next);
                return;
            }
        }
    }

    /* renamed from: b0 */
    private void m19983b0(String str) {
        C3096u.m8175n().mo23507B(C8329t.m19854d(this.f14501h, str, this.f14503j, ""), new C8391f());
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public void m19984c0() {
        if (this.f14499f.mo35469j().isEmpty() || !this.f14499f.mo35471l().equals(this.f14499f.mo35469j())) {
            C3096u.m8175n().mo23510F(C8329t.m19853c(this.f14501h, this.f14499f.mo35471l()), new C8393h());
            return;
        }
        C3096u.m8175n().mo23507B(C8329t.m19854d(this.f14501h, this.f14499f.mo35472m(), 0, this.f14499f.mo35469j()), new C8392g());
    }

    /* renamed from: Z */
    public void mo35682Z() {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.f14497d.getCount()) {
                z = false;
                break;
            } else if (this.f14497d.mo36891b(i)) {
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
        this.f14496c.setEnabled(false);
        m19983b0(this.f14502i);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        C8330u uVar;
        int i3;
        int i4 = i2;
        Intent intent2 = intent;
        StringBuilder sb = new StringBuilder();
        sb.append("CreateSceneBundle on Activity result called!!! resultCode = ");
        sb.append(i2);
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
                m19982a0(stringExtra);
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
                m19982a0(stringExtra2);
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
                C8327s X = m19980X(intExtra, intExtra2, intExtra4, intExtra3, stringExtra3);
                if (X != null) {
                    m19982a0(stringExtra4);
                    C8330u uVar2 = new C8330u(stringExtra4, Constants.EXTRA_PUSH_COMMAND);
                    uVar2.mo35485h(X.mo35294a());
                    this.f14501h.add(uVar2);
                    this.f14497d.mo36895d(intExtra5, true);
                    break;
                } else {
                    return;
                }
            case 1003:
                int intExtra6 = intent2.getIntExtra("scene_select_mode", -1);
                int intExtra7 = intent2.getIntExtra("position", -1);
                String stringExtra5 = intent2.getStringExtra("com.yeelight.cherry.device_id");
                C8327s Y = m19981Y(intExtra6, intent2.getIntExtra("scene_select_position", -1), stringExtra5);
                if (Y != null) {
                    m19982a0(stringExtra5);
                    C8330u uVar3 = new C8330u(stringExtra5, "scene");
                    C8330u.C8331a aVar = new C8330u.C8331a(Y.mo35451r(), intExtra6);
                    aVar.mo35491c(Y.mo35450q());
                    uVar3.mo35486i(aVar);
                    this.f14501h.add(uVar3);
                    this.f14497d.mo36895d(intExtra7, true);
                    break;
                } else {
                    return;
                }
            default:
                return;
        }
        this.f14501h.add(uVar);
        this.f14497d.mo36895d(i3, true);
        this.f14497d.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        View.OnClickListener onClickListener;
        CommonTitleBar commonTitleBar;
        super.onCreate(bundle);
        mo35653P();
        setContentView(R$layout.activity_add_scene_bundle_new);
        C9193k.m22157h(true, this);
        this.f14494a = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f14495b = (ListView) findViewById(R$id.device_list);
        this.f14496c = (Button) findViewById(R$id.next_step);
        Intent intent = getIntent();
        if (intent.hasExtra("com.yeelight.cherry.scene_bundle_id")) {
            C8329t o = C3096u.m8175n().mo23512o(intent.getStringExtra("com.yeelight.cherry.scene_bundle_id"));
            this.f14499f = o;
            for (C8330u add : o.mo35473n()) {
                this.f14501h.add(add);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("CreateSceneBundleActivity, edit mode, found scene bundle: ");
            sb.append(this.f14499f);
        }
        this.f14494a.mo36195a(getString(this.f14499f == null ? R$string.common_text_select_device : R$string.scene_bundle_edit), new C8387b(), (View.OnClickListener) null);
        this.f14494a.setTitleTextSize(16);
        C8329t tVar = this.f14499f;
        this.f14497d = new C9031a(this, (Cursor) null, tVar == null ? "" : tVar.mo35471l(), this.f14504k);
        this.f14498e = new C6065f(DeviceDataProvider.m17593F());
        this.f14495b.setAdapter(this.f14497d);
        this.f14497d.changeCursor(this.f14498e);
        if (this.f14499f != null) {
            if (this.f14498e.moveToFirst()) {
                do {
                    Cursor cursor = this.f14498e;
                    if (this.f14499f.mo35467h(cursor.getString(cursor.getColumnIndex(DeviceBrowserContract.DeviceBrowser.C6034a.f12285c)))) {
                        this.f14500g.add(Integer.valueOf(this.f14498e.getPosition()));
                    }
                } while (this.f14498e.moveToNext());
            }
            this.f14494a.setRightButtonVisibility(8);
            this.f14494a.setRightTextVisible(true);
            this.f14494a.setRightTextStr(getString(R$string.common_text_save));
            commonTitleBar = this.f14494a;
            onClickListener = new C8388c();
        } else {
            this.f14494a.setRightButtonResource(R$drawable.icon_yeelight_common_close);
            this.f14494a.setRightButtonVisibility(0);
            this.f14494a.setRightTextVisible(false);
            commonTitleBar = this.f14494a;
            onClickListener = new C8389d();
        }
        commonTitleBar.setRightButtonClickListener(onClickListener);
        this.f14502i = getIntent().getStringExtra("room_name");
        this.f14503j = getIntent().getIntExtra("create_res_index", 0);
        this.f14496c.setOnClickListener(new C8390e());
        this.f14496c.setEnabled(true);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        Cursor cursor = this.f14498e;
        if (cursor != null) {
            cursor.close();
        }
        super.onDestroy();
        mo35652M(this);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f14497d.notifyDataSetChanged();
    }
}
