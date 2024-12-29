package com.yeelight.yeelib.p194ui.activity;

import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p187h.p189h.C9874b;
import com.yeelight.yeelib.p194ui.activity.DeviceOfflinePromptActivity;
import com.yeelight.yeelib.p194ui.widget.C10515b;

/* renamed from: com.yeelight.yeelib.ui.activity.b1 */
class C10305b1 implements C9874b<String> {

    /* renamed from: a */
    final /* synthetic */ C10515b.C10517b f19128a;

    /* renamed from: b */
    final /* synthetic */ DeviceOfflinePromptActivity.C10003c.C10004a f19129b;

    C10305b1(DeviceOfflinePromptActivity.C10003c.C10004a aVar, C10515b.C10517b bVar) {
        this.f19129b = aVar;
        this.f19128a = bVar;
    }

    /* renamed from: b */
    public /* synthetic */ void mo32606b(C10515b.C10517b bVar) {
        bVar.mo33281b(2, DeviceOfflinePromptActivity.this.getString(R$string.err_report_upload_failure));
    }

    /* renamed from: c */
    public /* synthetic */ void mo32607c(C10515b.C10517b bVar) {
        bVar.mo33281b(1, DeviceOfflinePromptActivity.this.getString(R$string.err_report_upload_success));
    }

    /* renamed from: d */
    public void mo23475a(String str) {
        DeviceOfflinePromptActivity.this.runOnUiThread(new C10344v(this, this.f19128a));
    }

    public void onFailure(int i, String str) {
        DeviceOfflinePromptActivity.this.runOnUiThread(new C10342u(this, this.f19128a));
    }
}
