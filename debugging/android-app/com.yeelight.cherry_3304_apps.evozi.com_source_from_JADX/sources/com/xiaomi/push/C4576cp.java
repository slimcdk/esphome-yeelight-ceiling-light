package com.xiaomi.push;

import android.os.AsyncTask;

/* renamed from: com.xiaomi.push.cp */
class C4576cp extends AsyncTask<String, Integer, Integer> {

    /* renamed from: a */
    C4573cm f8327a;

    /* renamed from: a */
    C4580ct f8328a;

    /* renamed from: a */
    String f8329a;

    /* renamed from: b */
    String f8330b;

    public C4576cp(C4580ct ctVar, String str, String str2, C4573cm cmVar) {
        this.f8329a = str;
        this.f8330b = str2;
        this.f8328a = ctVar;
        this.f8327a = cmVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Integer doInBackground(String... strArr) {
        return Integer.valueOf(C4577cq.m13605a(this.f8329a, this.f8330b, this.f8327a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(Integer num) {
        super.onPostExecute(num);
        C4580ct ctVar = this.f8328a;
        if (ctVar != null) {
            ctVar.mo24850a(num, this.f8327a);
        }
    }

    /* access modifiers changed from: protected */
    public void onCancelled() {
        super.onCancelled();
        C4580ct ctVar = this.f8328a;
        if (ctVar != null) {
            ctVar.mo24850a(1, this.f8327a);
        }
    }
}
