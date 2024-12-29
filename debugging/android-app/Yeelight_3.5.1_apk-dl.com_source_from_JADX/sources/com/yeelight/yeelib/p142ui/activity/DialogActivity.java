package com.yeelight.yeelib.p142ui.activity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.managers.C3108x;
import org.json.JSONObject;
import p051j4.C3283v;
import p051j4.C9193k;
import p129b4.C3988b;
import p134c4.C4007b;
import p169i3.C9100a;
import p178k3.C9289a;

/* renamed from: com.yeelight.yeelib.ui.activity.DialogActivity */
public class DialogActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C9289a f14603a;

    /* renamed from: b */
    private String f14604b;

    /* renamed from: com.yeelight.yeelib.ui.activity.DialogActivity$a */
    class C8423a implements C4007b<String> {

        /* renamed from: com.yeelight.yeelib.ui.activity.DialogActivity$a$a */
        class C8424a implements Runnable {
            C8424a() {
            }

            public void run() {
                DialogActivity.this.finish();
            }
        }

        C8423a() {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str.replace("\\", ""));
                if (jSONObject.getInt("code") == 1) {
                    String string = jSONObject.getString("qrticket");
                    if (string == null) {
                        string = C3283v.m8840f("qrStr", (String) null);
                    } else {
                        C3283v.m8846l("qrStr", string);
                    }
                    C9100a aVar = new C9100a();
                    aVar.f16778d = string;
                    aVar.f16779e = 1;
                    aVar.f16777c = "gh_a26e949d9a71";
                    if (DialogActivity.this.f14603a != null) {
                        DialogActivity.this.f14603a.mo37800a(aVar);
                        DialogActivity.this.getWindow().getDecorView().postDelayed(new C8424a(), 5000);
                        return;
                    }
                    DialogActivity.this.finish();
                }
            } catch (Exception e) {
                DialogActivity.this.finish();
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            DialogActivity.this.finish();
        }
    }

    /* renamed from: W */
    private void m20066W() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        int a = C9193k.m22150a(this, 5.0f);
        linearLayout.setPadding(a, a, a, a);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        ProgressBar progressBar = new ProgressBar(this);
        TextView textView = new TextView(this);
        textView.setText(R$string.wechat_progressing);
        textView.setPadding(a, 0, 0, 0);
        textView.getLayoutParams();
        linearLayout.addView(progressBar);
        linearLayout.addView(textView);
        linearLayout.setBackground(ContextCompat.getDrawable(this, R$drawable.dialog_bg_black));
        setContentView(linearLayout);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m20066W();
        this.f14603a = C3108x.m8223f().mo23545h();
        String stringExtra = getIntent().getStringExtra("com.yeelight.cherry.device_id");
        this.f14604b = stringExtra;
        C9289a aVar = this.f14603a;
        if (aVar == null || stringExtra == null || !aVar.mo37801b()) {
            Toast.makeText(this, getString(R$string.wechat_not_available), 0).show();
            finish();
            return;
        }
        C3988b.m11572h("https://weixin.yeelight.com/index.php?s=/Home/device/deviceAuth", new String("{\"mac\":\"" + this.f14604b.toLowerCase() + "\"}"), String.class, new C8423a());
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        finish();
    }
}
