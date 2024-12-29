package com.yeelight.yeelib.p194ui.activity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p187h.C9862d;
import com.yeelight.yeelib.p187h.p189h.C9874b;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C10559w;
import org.json.JSONObject;
import p011c.p091e.p092a.p093a.p097c.C1229a;
import p011c.p091e.p092a.p093a.p099e.C1242a;

/* renamed from: com.yeelight.yeelib.ui.activity.DialogActivity */
public class DialogActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C1242a f18295b;

    /* renamed from: c */
    private String f18296c;

    /* renamed from: com.yeelight.yeelib.ui.activity.DialogActivity$a */
    class C10005a implements C9874b<String> {

        /* renamed from: com.yeelight.yeelib.ui.activity.DialogActivity$a$a */
        class C10006a implements Runnable {
            C10006a() {
            }

            public void run() {
                DialogActivity.this.finish();
            }
        }

        C10005a() {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str.replace("\\", ""));
                if (jSONObject.getInt("code") == 1) {
                    String string = jSONObject.getString("qrticket");
                    if (string == null) {
                        string = C10559w.m25810f("qrStr", (String) null);
                    } else {
                        C10559w.m25816l("qrStr", string);
                    }
                    C1229a aVar = new C1229a();
                    aVar.f2168d = string;
                    aVar.f2169e = 1;
                    aVar.f2167c = "gh_a26e949d9a71";
                    if (DialogActivity.this.f18295b != null) {
                        DialogActivity.this.f18295b.mo10057c(aVar);
                        DialogActivity.this.getWindow().getDecorView().postDelayed(new C10006a(), 5000);
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

    public DialogActivity() {
        Class<DialogActivity> cls = DialogActivity.class;
    }

    /* renamed from: W */
    private void m24476W() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        int a = C10547m.m25751a(this, 5.0f);
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
        m24476W();
        this.f18295b = C4297y.m12064f().mo23735h();
        String stringExtra = getIntent().getStringExtra("com.yeelight.cherry.device_id");
        this.f18296c = stringExtra;
        C1242a aVar = this.f18295b;
        if (aVar == null || stringExtra == null || !aVar.mo10055a()) {
            Toast.makeText(this, getString(R$string.wechat_not_available), 0).show();
            finish();
            return;
        }
        C9862d.m24138h("https://weixin.yeelight.com/index.php?s=/Home/device/deviceAuth", new String("{\"mac\":\"" + this.f18296c.toLowerCase() + "\"}"), String.class, new C10005a());
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        finish();
    }
}
