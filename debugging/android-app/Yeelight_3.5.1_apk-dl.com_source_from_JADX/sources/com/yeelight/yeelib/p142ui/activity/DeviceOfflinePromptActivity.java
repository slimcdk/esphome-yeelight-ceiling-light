package com.yeelight.yeelib.p142ui.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.managers.C3084o;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import p051j4.C9193k;
import p051j4.C9197p;
import p134c4.C4007b;
import p170i4.C9107b;
import p170i4.C9113d;

/* renamed from: com.yeelight.yeelib.ui.activity.DeviceOfflinePromptActivity */
public class DeviceOfflinePromptActivity extends BaseActivity {

    /* renamed from: com.yeelight.yeelib.ui.activity.DeviceOfflinePromptActivity$a */
    class C8418a implements C4007b<String> {
        C8418a(DeviceOfflinePromptActivity deviceOfflinePromptActivity) {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
        }

        public void onFailure(int i, String str) {
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DeviceOfflinePromptActivity$b */
    class C8419b implements View.OnClickListener {
        C8419b() {
        }

        public void onClick(View view) {
            DeviceOfflinePromptActivity.this.onBackPressed();
            DeviceOfflinePromptActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DeviceOfflinePromptActivity$c */
    class C8420c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f14598a;

        /* renamed from: com.yeelight.yeelib.ui.activity.DeviceOfflinePromptActivity$c$a */
        class C8421a implements DialogInterface.OnClickListener {

            /* renamed from: com.yeelight.yeelib.ui.activity.DeviceOfflinePromptActivity$c$a$a */
            class C8422a implements C4007b<String> {

                /* renamed from: a */
                final /* synthetic */ C9107b.C9109b f14601a;

                C8422a(C9107b.C9109b bVar) {
                    this.f14601a = bVar;
                }

                /* access modifiers changed from: private */
                /* renamed from: d */
                public /* synthetic */ void m20061d(C9107b.C9109b bVar) {
                    bVar.mo37128b(2, DeviceOfflinePromptActivity.this.getString(R$string.err_report_upload_failure));
                }

                /* access modifiers changed from: private */
                /* renamed from: e */
                public /* synthetic */ void m20062e(C9107b.C9109b bVar) {
                    bVar.mo37128b(1, DeviceOfflinePromptActivity.this.getString(R$string.err_report_upload_success));
                }

                /* renamed from: f */
                public void mo23338a(String str) {
                    DeviceOfflinePromptActivity.this.runOnUiThread(new C8729n(this, this.f14601a));
                }

                public void onFailure(int i, String str) {
                    DeviceOfflinePromptActivity.this.runOnUiThread(new C8728m(this, this.f14601a));
                }
            }

            C8421a() {
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m20058b(C9107b.C9109b bVar, String str) {
                C3084o.m8096k().mo23454j();
                C3084o.m8096k().mo23453i();
                C3084o.m8096k().mo23461s();
                C9197p.m22178k(new C8422a(bVar), YeelightDeviceManager.m7794j0(str));
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C9107b.C9109b b = new C9107b.C9109b(DeviceOfflinePromptActivity.this).mo37128b(0, DeviceOfflinePromptActivity.this.getString(R$string.err_report_uploading));
                b.mo37127a().show();
                new Thread(new C8727l(this, b, C8420c.this.f14598a)).start();
                dialogInterface.dismiss();
            }
        }

        C8420c(String str) {
            this.f14598a = str;
        }

        public void onClick(View view) {
            C9113d.C9118e eVar = new C9113d.C9118e(DeviceOfflinePromptActivity.this);
            eVar.mo37179i(DeviceOfflinePromptActivity.this.getString(R$string.common_submit_err_report)).mo37177g(DeviceOfflinePromptActivity.this.getString(R$string.err_report_tip_content)).mo37174d(-2, DeviceOfflinePromptActivity.this.getString(R$string.common_text_cancel), (DialogInterface.OnClickListener) null).mo37174d(-1, DeviceOfflinePromptActivity.this.getString(R$string.common_text_ok), new C8421a());
            eVar.mo37180j();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(R$layout.activity_device_offline_prompt);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(R$id.title_bar);
        TextView textView = (TextView) findViewById(R$id.notice_item);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("com.yeelight.cherry.device_id");
        C3010c j0 = YeelightDeviceManager.m7794j0(stringExtra);
        if (j0 == null) {
            C9197p.m22176i(new C8418a(this), stringExtra);
            finish();
            return;
        }
        commonTitleBar.mo36195a(j0.mo23210U(), new C8419b(), (View.OnClickListener) null);
        commonTitleBar.setTitleTextSize(16);
        textView.setOnClickListener(new C8420c(stringExtra));
    }
}
