package com.yeelight.cherry.p141ui.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import com.miot.api.CommonHandler;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.activity.YeelightWebviewActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import java.util.Objects;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p051j4.C9193k;
import p223w3.C11641s;

/* renamed from: com.yeelight.cherry.ui.activity.AccountManageActivity */
public final class AccountManageActivity extends BaseActivity {

    /* renamed from: a */
    private boolean f9798a;

    /* renamed from: com.yeelight.cherry.ui.activity.AccountManageActivity$a */
    public static final class C5012a implements CommonHandler<String> {

        /* renamed from: a */
        final /* synthetic */ AccountManageActivity f9799a;

        C5012a(AccountManageActivity accountManageActivity) {
            this.f9799a = accountManageActivity;
        }

        /* renamed from: a */
        public void onSucceed(@NotNull String str) {
            C9424q.m22996e(str, C11641s.f21397C);
            C9424q.m23003l("Xiaomi user profile: ", str);
        }

        public void onFailed(int i, @NotNull String str) {
            C9424q.m22996e(str, C11641s.f21397C);
            StringBuilder sb = new StringBuilder();
            sb.append("onFailed: error: ");
            sb.append(str);
            sb.append(", error code: ");
            sb.append(i);
            Intent intent = new Intent(this.f9799a, WelcomeGuideNewActivity.class);
            intent.setFlags(268468224);
            this.f9799a.startActivity(intent);
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m15784Y() {
        /*
            r5 = this;
            java.lang.String r0 = "/user/get_user_profile"
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "uid"
            com.yeelight.yeelib.managers.a r3 = com.yeelight.yeelib.managers.C3051a.m7925r()     // Catch:{ JSONException -> 0x002e }
            java.lang.String r3 = r3.mo23366v()     // Catch:{ JSONException -> 0x002e }
            java.lang.String r4 = "getInstance().userId"
            kotlin.jvm.internal.C9424q.m22995d(r3, r4)     // Catch:{ JSONException -> 0x002e }
            long r3 = java.lang.Long.parseLong(r3)     // Catch:{ JSONException -> 0x002e }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x002e }
            java.lang.String r2 = "request params: "
            kotlin.jvm.internal.C9424q.m23003l(r2, r1)
            com.miot.api.DeviceManager r2 = com.miot.api.MiotManager.getDeviceManager()     // Catch:{  }
            com.yeelight.cherry.ui.activity.AccountManageActivity$a r3 = new com.yeelight.cherry.ui.activity.AccountManageActivity$a     // Catch:{  }
            r3.<init>(r5)     // Catch:{  }
            r2.callSmarthomeApi(r0, r1, r3)     // Catch:{  }
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.activity.AccountManageActivity.m15784Y():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public static final void m15785Z(AccountManageActivity accountManageActivity, View view) {
        C9424q.m22996e(accountManageActivity, "this$0");
        accountManageActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public static final void m15786a0(AccountManageActivity accountManageActivity, View view) {
        C9424q.m22996e(accountManageActivity, "this$0");
        accountManageActivity.startActivity(new Intent(accountManageActivity, CancelYeeAccountActivity.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public static final void m15787b0(AccountManageActivity accountManageActivity, View view) {
        C9424q.m22996e(accountManageActivity, "this$0");
        accountManageActivity.f9798a = true;
        Intent intent = new Intent(accountManageActivity, YeelightWebviewActivity.class);
        intent.putExtra("url_index", 34);
        accountManageActivity.startActivity(intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        Window window;
        super.onCreate(bundle);
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_account_manage);
        View findViewById = findViewById(2131297591);
        Objects.requireNonNull(findViewById, "null cannot be cast to non-null type com.yeelight.yeelib.ui.view.CommonTitleBar");
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById;
        commonTitleBar.mo36195a(getString(2131755047), new C5782k(this), (View.OnClickListener) null);
        commonTitleBar.setTitleTextSize(16);
        if (Build.VERSION.SDK_INT >= 21 && (window = getWindow()) != null) {
            window.setStatusBarColor(-1);
        }
        commonTitleBar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        findViewById(C12225R$id.tv_cancel_yeelight_app).setOnClickListener(new C5770i(this));
        findViewById(C12225R$id.tv_cancel_xiaomi).setOnClickListener(new C5776j(this));
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f9798a) {
            this.f9798a = false;
            m15784Y();
        }
    }
}
