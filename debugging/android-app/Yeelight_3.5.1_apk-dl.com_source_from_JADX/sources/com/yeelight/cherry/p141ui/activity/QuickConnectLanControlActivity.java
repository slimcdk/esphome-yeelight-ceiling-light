package com.yeelight.cherry.p141ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.yeelight.cherry.C12224R$drawable;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.managers.C8293t;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.activity.YeelightWebviewActivity;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.List;
import p051j4.C9193k;
import p145d4.C8937a;
import p223w3.C10916f1;
import p223w3.C11571p0;

/* renamed from: com.yeelight.cherry.ui.activity.QuickConnectLanControlActivity */
public class QuickConnectLanControlActivity extends BaseActivity {

    /* renamed from: g */
    private static String f11189g = "QuickConnectLanControlActivity";

    /* renamed from: a */
    private ImageView f11190a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public WifiDeviceBase f11191b;

    /* renamed from: c */
    private Button f11192c;

    /* renamed from: d */
    private TextView f11193d;

    /* renamed from: e */
    private TextView f11194e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f11195f = true;

    /* renamed from: com.yeelight.cherry.ui.activity.QuickConnectLanControlActivity$a */
    class C5602a implements View.OnClickListener {
        C5602a() {
        }

        public void onClick(View view) {
            QuickConnectLanControlActivity quickConnectLanControlActivity = QuickConnectLanControlActivity.this;
            boolean unused = quickConnectLanControlActivity.f11195f = !quickConnectLanControlActivity.f11195f;
            QuickConnectLanControlActivity.this.m16918c0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.QuickConnectLanControlActivity$b */
    class C5603b implements View.OnClickListener {
        C5603b() {
        }

        public void onClick(View view) {
            QuickConnectLanControlActivity.this.f11191b.mo31484M1(QuickConnectLanControlActivity.this.f11195f);
            Intent intent = new Intent();
            intent.setClass(QuickConnectLanControlActivity.this, MainActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", QuickConnectLanControlActivity.this.f11191b.mo23185G());
            intent.addFlags(67108864);
            QuickConnectLanControlActivity.this.startActivity(intent);
            QuickConnectLanControlActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.QuickConnectLanControlActivity$c */
    class C5604c implements View.OnClickListener {
        C5604c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(view.getContext(), YeelightWebviewActivity.class);
            intent.putExtra("url_index", 14);
            QuickConnectLanControlActivity.this.startActivity(intent);
        }
    }

    /* renamed from: a0 */
    private void m16916a0() {
        List<C8937a> o;
        View findViewById = findViewById(C12225R$id.two_view);
        WifiDeviceBase wifiDeviceBase = this.f11191b;
        if ((wifiDeviceBase instanceof C11571p0) || (wifiDeviceBase instanceof C10916f1) || (o = C8293t.m19620n().mo35255o()) == null || o.size() <= 0) {
            findViewById.setVisibility(8);
        } else {
            findViewById.setVisibility(0);
            findViewById.setBackgroundColor(ContextCompat.getColor(this, 2131099805));
        }
        findViewById(C12225R$id.three_view).setBackgroundColor(ContextCompat.getColor(this, 2131099805));
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public /* synthetic */ void m16917b0(View view) {
        Intent intent = new Intent(this, YeelightWebviewActivity.class);
        intent.putExtra("url_index", 26);
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public void m16918c0() {
        int i;
        ImageView imageView;
        if (this.f11195f) {
            imageView = this.f11190a;
            i = C12224R$drawable.icon_quickconnect_lan_control_checked;
        } else {
            imageView = this.f11190a;
            i = C12224R$drawable.icon_quickconnect_lan_control_check;
        }
        imageView.setImageResource(i);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_quickconnect_lan_control);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f11189g, "Activity has not device id", false);
            finish();
            return;
        }
        WifiDeviceBase P0 = YeelightDeviceManager.m7800o0().mo23274P0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f11191b = P0;
        if (P0 == null) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        ImageView imageView = (ImageView) findViewById(C12225R$id.lan_control_switch);
        this.f11190a = imageView;
        imageView.setOnClickListener(new C5602a());
        Button button = (Button) findViewById(2131296462);
        this.f11192c = button;
        button.setOnClickListener(new C5603b());
        m16916a0();
        this.f11193d = (TextView) findViewById(C12225R$id.tv_google_home_hint);
        this.f11194e = (TextView) findViewById(C12225R$id.tv_google_lan);
        TextView textView = (TextView) findViewById(2131297683);
        if (!YeelightDeviceManager.m7777V0(this.f11191b.mo23208T())) {
            this.f11193d.setVisibility(0);
            this.f11194e.setVisibility(0);
            TextView textView2 = this.f11194e;
            textView2.setText(Html.fromHtml("<u>" + this.f11194e.getText().toString() + "</u>"));
            this.f11194e.setOnClickListener(new C5738c3(this));
        }
        textView.setText(Html.fromHtml("<u>" + textView.getText().toString() + "</u>"));
        textView.setOnClickListener(new C5604c());
        m16918c0();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }
}
