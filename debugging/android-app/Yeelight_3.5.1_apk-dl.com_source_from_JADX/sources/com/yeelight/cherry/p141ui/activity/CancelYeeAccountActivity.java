package com.yeelight.cherry.p141ui.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.managers.C8293t;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.Objects;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p051j4.C9193k;
import p129b4.C3988b;
import p134c4.C4007b;
import p170i4.C9107b;

/* renamed from: com.yeelight.cherry.ui.activity.CancelYeeAccountActivity */
public final class CancelYeeAccountActivity extends BaseActivity {
    @Nullable

    /* renamed from: a */
    private C9107b.C9109b f9982a;

    /* renamed from: com.yeelight.cherry.ui.activity.CancelYeeAccountActivity$a */
    public static final class C5082a implements C4007b<String> {

        /* renamed from: a */
        final /* synthetic */ CancelYeeAccountActivity f9983a;

        C5082a(CancelYeeAccountActivity cancelYeeAccountActivity) {
            this.f9983a = cancelYeeAccountActivity;
        }

        /* renamed from: b */
        public void mo23338a(@Nullable String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    C9424q.m22993b(str);
                    if (TextUtils.equals(new JSONObject(str).optString("code"), "200")) {
                        this.f9983a.m15939c0();
                    } else {
                        this.f9983a.m15942f0();
                    }
                } catch (Exception unused) {
                }
            }
        }

        public void onFailure(int i, @Nullable String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("errorCode：");
            sb.append(i);
            sb.append(", errorMessage: ");
            sb.append(str);
            this.f9983a.m15942f0();
        }
    }

    /* renamed from: b0 */
    private final void m15938b0() {
        m15944h0();
        C3988b.m11565a(C9424q.m23003l(AppUtils.f4987k, "consumer/resources/w/destroy"), String.class, new C5082a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public final void m15939c0() {
        C8293t.m19620n().mo35253k();
        C3051a.m7925r().mo23354D();
        Intent intent = new Intent(this, WelcomeGuideNewActivity.class);
        intent.setFlags(268468224);
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public static final void m15940d0(CancelYeeAccountActivity cancelYeeAccountActivity, View view) {
        C9424q.m22996e(cancelYeeAccountActivity, "this$0");
        cancelYeeAccountActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public static final void m15941e0(CancelYeeAccountActivity cancelYeeAccountActivity, View view) {
        C9424q.m22996e(cancelYeeAccountActivity, "this$0");
        cancelYeeAccountActivity.m15938b0();
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public final void m15942f0() {
        runOnUiThread(new C5850x(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public static final void m15943g0(CancelYeeAccountActivity cancelYeeAccountActivity) {
        C9424q.m22996e(cancelYeeAccountActivity, "this$0");
        cancelYeeAccountActivity.mo35656T(cancelYeeAccountActivity.getResources().getString(2131755646));
    }

    /* renamed from: h0 */
    private final void m15944h0() {
        runOnUiThread(new C5855y(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public static final void m15945i0(CancelYeeAccountActivity cancelYeeAccountActivity) {
        C9424q.m22996e(cancelYeeAccountActivity, "this$0");
        C9107b.C9109b bVar = new C9107b.C9109b(cancelYeeAccountActivity);
        cancelYeeAccountActivity.f9982a = bVar;
        bVar.mo37129c(30000);
        C9107b.C9109b bVar2 = cancelYeeAccountActivity.f9982a;
        if (bVar2 != null) {
            bVar2.mo37128b(0, "");
        }
        C9107b.C9109b bVar3 = cancelYeeAccountActivity.f9982a;
        if (bVar3 != null) {
            bVar3.mo37130d();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        Window window;
        super.onCreate(bundle);
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_account_manage_cancel_yeelight);
        View findViewById = findViewById(2131297591);
        Objects.requireNonNull(findViewById, "null cannot be cast to non-null type com.yeelight.yeelib.ui.view.CommonTitleBar");
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById;
        commonTitleBar.mo36195a(getString(2131755056), new C5845w(this), (View.OnClickListener) null);
        commonTitleBar.setTitleTextSize(16);
        if (Build.VERSION.SDK_INT >= 21 && (window = getWindow()) != null) {
            window.setStatusBarColor(-1);
        }
        commonTitleBar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        findViewById(C12225R$id.tv_cancel_account_confirm).setOnClickListener(new C5840v(this));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C9107b a;
        C9107b.C9109b bVar = this.f9982a;
        if (!(bVar == null || (a = bVar.mo37127a()) == null || !a.isShowing())) {
            a.dismiss();
        }
        super.onDestroy();
    }
}
