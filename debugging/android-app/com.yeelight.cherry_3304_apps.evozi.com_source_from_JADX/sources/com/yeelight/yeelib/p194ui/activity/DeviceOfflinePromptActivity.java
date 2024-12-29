package com.yeelight.yeelib.p194ui.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p152f.C4235o;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p187h.p189h.C9874b;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.widget.C10515b;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C10551r;

/* renamed from: com.yeelight.yeelib.ui.activity.DeviceOfflinePromptActivity */
public class DeviceOfflinePromptActivity extends BaseActivity {

    /* renamed from: com.yeelight.yeelib.ui.activity.DeviceOfflinePromptActivity$a */
    class C10001a implements C9874b<String> {
        C10001a(DeviceOfflinePromptActivity deviceOfflinePromptActivity) {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
        }

        public void onFailure(int i, String str) {
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DeviceOfflinePromptActivity$b */
    class C10002b implements View.OnClickListener {
        C10002b() {
        }

        public void onClick(View view) {
            DeviceOfflinePromptActivity.this.onBackPressed();
            DeviceOfflinePromptActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DeviceOfflinePromptActivity$c */
    class C10003c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f18292a;

        /* renamed from: com.yeelight.yeelib.ui.activity.DeviceOfflinePromptActivity$c$a */
        class C10004a implements DialogInterface.OnClickListener {
            C10004a() {
            }

            /* renamed from: a */
            public /* synthetic */ void mo32279a(C10515b.C10517b bVar, String str) {
                C4235o.m11786k().mo23561j();
                C4235o.m11786k().mo23560i();
                C4235o.m11786k().mo23568s();
                C10551r.m25779k(new C10305b1(this, bVar), C4257w.m11945h0(str));
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C10515b.C10517b bVar = new C10515b.C10517b(DeviceOfflinePromptActivity.this);
                bVar.mo33281b(0, DeviceOfflinePromptActivity.this.getString(R$string.err_report_uploading));
                bVar.mo33280a().show();
                new Thread(new C10346w(this, bVar, C10003c.this.f18292a)).start();
                dialogInterface.dismiss();
            }
        }

        C10003c(String str) {
            this.f18292a = str;
        }

        public void onClick(View view) {
            C10526e.C10531e eVar = new C10526e.C10531e(DeviceOfflinePromptActivity.this);
            eVar.mo33358i(DeviceOfflinePromptActivity.this.getString(R$string.common_submit_err_report));
            eVar.mo33356g(DeviceOfflinePromptActivity.this.getString(R$string.err_report_tip_content));
            eVar.mo33353d(-2, DeviceOfflinePromptActivity.this.getString(R$string.common_text_cancel), (DialogInterface.OnClickListener) null);
            eVar.mo33353d(-1, DeviceOfflinePromptActivity.this.getString(R$string.common_text_ok), new C10004a());
            eVar.mo33359j();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_device_offline_prompt);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(R$id.title_bar);
        TextView textView = (TextView) findViewById(R$id.notice_item);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("com.yeelight.cherry.device_id");
        C4198d h0 = C4257w.m11945h0(stringExtra);
        if (h0 == null) {
            C10551r.m25777i(new C10001a(this), stringExtra);
            finish();
            return;
        }
        commonTitleBar.mo32825a(h0.mo23397U(), new C10002b(), (View.OnClickListener) null);
        commonTitleBar.setTitleTextSize(16);
        textView.setOnClickListener(new C10003c(stringExtra));
    }
}
