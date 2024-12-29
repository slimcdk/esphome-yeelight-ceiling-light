package com.yeelight.yeelib.p142ui.activity;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.yeelight.cherry.p141ui.activity.WelcomeGuideNewActivity;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.managers.C8274f;
import com.yeelight.yeelib.managers.C8281l;
import com.yeelight.yeelib.managers.C8287q;
import com.yeelight.yeelib.utils.AppUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p150e4.C8975e0;
import p170i4.C9107b;
import p170i4.C9113d;

/* renamed from: com.yeelight.yeelib.ui.activity.YeelightWebviewActivity */
public class YeelightWebviewActivity extends BaseActivity implements C3051a.C3052i, C8274f.C8276b {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final String f15411j = "YeelightWebviewActivity";

    /* renamed from: k */
    public static final String f15412k = (AppUtils.f4987k + "license/");

    /* renamed from: l */
    public static final String f15413l = (AppUtils.f4992p + "apis/account/public/license?themes=white&app=3&language=2&country=CN");

    /* renamed from: m */
    public static final String f15414m = (AppUtils.f4987k + "privacy/");

    /* renamed from: n */
    public static final String f15415n = (AppUtils.f4991o + "privacy.html?app=3&language=2&country=CN");

    /* renamed from: a */
    TextView f15416a;

    /* renamed from: b */
    TextView f15417b;

    /* renamed from: c */
    ProgressBar f15418c;

    /* renamed from: d */
    WebView f15419d;

    /* renamed from: e */
    private WebSettings f15420e;

    /* renamed from: f */
    private List<String> f15421f = new ArrayList();

    /* renamed from: g */
    private boolean f15422g = true;

    /* renamed from: h */
    C9107b.C9109b f15423h = null;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Handler f15424i = new C8714e(this);

    /* renamed from: com.yeelight.yeelib.ui.activity.YeelightWebviewActivity$a */
    class C8709a implements DialogInterface.OnClickListener {
        C8709a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            C8274f.m19527d().mo35215c();
            YeelightWebviewActivity yeelightWebviewActivity = YeelightWebviewActivity.this;
            yeelightWebviewActivity.f15423h = new C9107b.C9109b(yeelightWebviewActivity);
            YeelightWebviewActivity yeelightWebviewActivity2 = YeelightWebviewActivity.this;
            yeelightWebviewActivity2.f15423h.mo37128b(0, yeelightWebviewActivity2.getString(R$string.privacy_policy_data_destroy_ing));
            YeelightWebviewActivity.this.f15423h.mo37130d();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.YeelightWebviewActivity$b */
    class C8710b extends WebViewClient {
        C8710b() {
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            YeelightWebviewActivity yeelightWebviewActivity = YeelightWebviewActivity.this;
            Toast.makeText(yeelightWebviewActivity, yeelightWebviewActivity.getString(R$string.error_network_error), 0).show();
            YeelightWebviewActivity.this.finish();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str.startsWith("https://madeby.google.com/home-app/")) {
                YeelightWebviewActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return true;
            } else if (str.startsWith("http:") || str.startsWith("https:")) {
                webView.loadUrl(str);
                return false;
            } else if (str.startsWith("browser://")) {
                YeelightWebviewActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str.replace("browser://", ""))));
                return true;
            } else {
                try {
                    YeelightWebviewActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                } catch (ActivityNotFoundException unused) {
                }
                return true;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.YeelightWebviewActivity$c */
    class C8711c extends WebChromeClient {
        C8711c() {
        }

        public void onHideCustomView() {
            super.onHideCustomView();
        }

        public void onProgressChanged(WebView webView, int i) {
            if (i < 100 && YeelightWebviewActivity.this.f15418c.getVisibility() == 8) {
                YeelightWebviewActivity.this.f15418c.setVisibility(0);
            }
            YeelightWebviewActivity.this.f15418c.setProgress(i);
            if (i == 100) {
                YeelightWebviewActivity.this.f15418c.setVisibility(8);
            }
        }

        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            super.onShowCustomView(view, customViewCallback);
            StringBuilder sb = new StringBuilder();
            sb.append("onShowCustomView view is ");
            sb.append(view.getClass().getSimpleName());
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.YeelightWebviewActivity$d */
    class C8712d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f15428a;

        /* renamed from: com.yeelight.yeelib.ui.activity.YeelightWebviewActivity$d$a */
        class C8713a implements DialogInterface.OnDismissListener {
            C8713a() {
            }

            public void onDismiss(DialogInterface dialogInterface) {
                YeelightWebviewActivity.this.f15424i.sendEmptyMessageDelayed(0, 500);
            }
        }

        C8712d(boolean z) {
            this.f15428a = z;
        }

        public void run() {
            YeelightWebviewActivity yeelightWebviewActivity = YeelightWebviewActivity.this;
            C9107b.C9109b bVar = yeelightWebviewActivity.f15423h;
            if (bVar == null) {
                return;
            }
            if (this.f15428a) {
                bVar.mo37128b(1, yeelightWebviewActivity.getString(R$string.privacy_policy_data_destroy_success));
                YeelightWebviewActivity.this.f15423h.mo37127a().setOnDismissListener(new C8713a());
                return;
            }
            bVar.mo37128b(2, yeelightWebviewActivity.getString(R$string.privacy_policy_data_destroy_failed));
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.YeelightWebviewActivity$e */
    class C8714e extends Handler {
        C8714e(YeelightWebviewActivity yeelightWebviewActivity) {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0) {
                C3051a.m7925r().mo23354D();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.YeelightWebviewActivity$f */
    private class C8715f {
        private C8715f() {
        }

        /* synthetic */ C8715f(YeelightWebviewActivity yeelightWebviewActivity, C8709a aVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m20568b(String str) {
            try {
                if (new JSONObject(str).getInt("type") == 1) {
                    YeelightWebviewActivity.this.startActivity(new Intent(YeelightWebviewActivity.this, LanControlListActivity.class));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void sendJson(String str) {
            if (!TextUtils.isEmpty(str)) {
                String unused = YeelightWebviewActivity.f15411j;
                StringBuilder sb = new StringBuilder();
                sb.append("sendJson: ");
                sb.append(str);
                YeelightWebviewActivity.this.f15424i.post(new C8738w(this, str));
            }
        }
    }

    /* renamed from: Z */
    private String m20552Z() {
        return new SimpleDateFormat("yyyyMMdd").format(new Date());
    }

    /* renamed from: a0 */
    private String m20553a0(String str) {
        StringBuilder sb;
        String str2;
        String c = C8281l.m19542b().mo35224c();
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case 3179:
                if (str.equals("cn")) {
                    c2 = 0;
                    break;
                }
                break;
            case 3201:
                if (str.equals("de")) {
                    c2 = 1;
                    break;
                }
                break;
            case 3668:
                if (str.equals("sg")) {
                    c2 = 2;
                    break;
                }
                break;
            case 3742:
                if (str.equals("us")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                if (!C8287q.m19593e().mo35241h(str)) {
                    sb = new StringBuilder();
                    str2 = "https://api-bj.yeelight.com/license/";
                    break;
                } else {
                    return f15413l;
                }
            case 1:
                sb = new StringBuilder();
                str2 = "https://api-de.yeelight.com/license/";
                break;
            case 2:
                sb = new StringBuilder();
                str2 = "https://api-sg.yeelight.com/license/";
                break;
            case 3:
                sb = new StringBuilder();
                str2 = "https://api-us.yeelight.com/license/";
                break;
            default:
                sb = new StringBuilder();
                str2 = f15412k;
                break;
        }
        sb.append(str2);
        sb.append(c);
        return sb.toString();
    }

    /* renamed from: b0 */
    private String m20554b0(String str) {
        StringBuilder sb;
        String str2;
        String c = C8281l.m19542b().mo35224c();
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case 3179:
                if (str.equals("cn")) {
                    c2 = 0;
                    break;
                }
                break;
            case 3201:
                if (str.equals("de")) {
                    c2 = 1;
                    break;
                }
                break;
            case 3668:
                if (str.equals("sg")) {
                    c2 = 2;
                    break;
                }
                break;
            case 3742:
                if (str.equals("us")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                if (!C8287q.m19593e().mo35241h(str)) {
                    sb = new StringBuilder();
                    str2 = "https://api-bj.yeelight.com/privacy/";
                    break;
                } else {
                    return f15415n;
                }
            case 1:
                sb = new StringBuilder();
                str2 = "https://api-de.yeelight.com/privacy/";
                break;
            case 2:
                sb = new StringBuilder();
                str2 = "https://api-sg.yeelight.com/privacy/";
                break;
            case 3:
                sb = new StringBuilder();
                str2 = "https://api-us.yeelight.com/privacy/";
                break;
            default:
                sb = new StringBuilder();
                str2 = f15414m;
                break;
        }
        sb.append(str2);
        sb.append(c);
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public /* synthetic */ void m20555c0(View view) {
        onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public /* synthetic */ void m20556d0(View view) {
        C9113d.C9118e eVar = new C9113d.C9118e(view.getContext());
        eVar.mo37178h(R$string.user_agreement_withdraw_agreement).mo37176f(R$string.user_agreement_withdraw_agreement_warning_new).mo37174d(-2, view.getContext().getString(R$string.common_text_cancel), (DialogInterface.OnClickListener) null).mo37174d(-1, view.getContext().getString(R$string.common_text_ok), new C8709a());
        eVar.mo37180j();
    }

    /* renamed from: e0 */
    private void m20557e0() {
        int i = 0;
        boolean booleanExtra = getIntent().getBooleanExtra("with_draw", false);
        TextView textView = this.f15417b;
        if (!booleanExtra) {
            i = 8;
        }
        textView.setVisibility(i);
        if (booleanExtra) {
            this.f15417b.setText(R$string.user_agreement_withdraw);
            this.f15417b.setOnClickListener(new C8975e0(this));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0059, code lost:
        if (r0 == 213) goto L_0x0038;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void initWebView() {
        /*
            r4 = this;
            android.webkit.WebSettings r0 = r4.f15420e
            r1 = 1
            r0.setJavaScriptEnabled(r1)
            android.webkit.WebSettings r0 = r4.f15420e
            r2 = 0
            r0.setBuiltInZoomControls(r2)
            android.webkit.WebSettings r0 = r4.f15420e
            android.webkit.WebSettings$LayoutAlgorithm r3 = android.webkit.WebSettings.LayoutAlgorithm.SINGLE_COLUMN
            r0.setLayoutAlgorithm(r3)
            android.webkit.WebSettings r0 = r4.f15420e
            r0.setUseWideViewPort(r1)
            android.webkit.WebSettings r0 = r4.f15420e
            r0.setLoadWithOverviewMode(r1)
            android.webkit.WebSettings r0 = r4.f15420e
            r0.setDomStorageEnabled(r1)
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            android.view.WindowManager r1 = r4.getWindowManager()
            android.view.Display r1 = r1.getDefaultDisplay()
            r1.getMetrics(r0)
            int r0 = r0.densityDpi
            r1 = 240(0xf0, float:3.36E-43)
            if (r0 != r1) goto L_0x0040
        L_0x0038:
            android.webkit.WebSettings r0 = r4.f15420e
            android.webkit.WebSettings$ZoomDensity r1 = android.webkit.WebSettings.ZoomDensity.FAR
        L_0x003c:
            r0.setDefaultZoom(r1)
            goto L_0x005c
        L_0x0040:
            r1 = 160(0xa0, float:2.24E-43)
            if (r0 != r1) goto L_0x0049
            android.webkit.WebSettings r0 = r4.f15420e
            android.webkit.WebSettings$ZoomDensity r1 = android.webkit.WebSettings.ZoomDensity.MEDIUM
            goto L_0x003c
        L_0x0049:
            r1 = 120(0x78, float:1.68E-43)
            if (r0 != r1) goto L_0x0052
            android.webkit.WebSettings r0 = r4.f15420e
            android.webkit.WebSettings$ZoomDensity r1 = android.webkit.WebSettings.ZoomDensity.CLOSE
            goto L_0x003c
        L_0x0052:
            r1 = 320(0x140, float:4.48E-43)
            if (r0 != r1) goto L_0x0057
            goto L_0x0038
        L_0x0057:
            r1 = 213(0xd5, float:2.98E-43)
            if (r0 != r1) goto L_0x005c
            goto L_0x0038
        L_0x005c:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x0067
            android.webkit.WebSettings r0 = r4.f15420e
            r0.setMixedContentMode(r2)
        L_0x0067:
            android.webkit.WebView r0 = r4.f15419d
            com.yeelight.yeelib.ui.activity.YeelightWebviewActivity$b r1 = new com.yeelight.yeelib.ui.activity.YeelightWebviewActivity$b
            r1.<init>()
            r0.setWebViewClient(r1)
            android.webkit.WebView r0 = r4.f15419d
            com.yeelight.yeelib.ui.activity.YeelightWebviewActivity$c r1 = new com.yeelight.yeelib.ui.activity.YeelightWebviewActivity$c
            r1.<init>()
            r0.setWebChromeClient(r1)
            android.webkit.WebView r0 = r4.f15419d
            com.yeelight.yeelib.ui.activity.YeelightWebviewActivity$f r1 = new com.yeelight.yeelib.ui.activity.YeelightWebviewActivity$f
            r2 = 0
            r1.<init>(r4, r2)
            java.lang.String r2 = "yeelightApp"
            r0.addJavascriptInterface(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p142ui.activity.YeelightWebviewActivity.initWebView():void");
    }

    /* renamed from: C */
    public void mo23255C(C3051a.C3062k kVar) {
    }

    /* renamed from: H */
    public void mo23262H() {
    }

    /* renamed from: d */
    public void mo23283d() {
    }

    /* renamed from: g */
    public void mo23288g() {
        Class<WelcomeGuideNewActivity> cls = WelcomeGuideNewActivity.class;
        try {
            int i = WelcomeGuideNewActivity.f11479h;
            Intent intent = new Intent(this, cls);
            intent.setFlags(67108864);
            startActivity(intent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: h */
    public void mo23291h() {
    }

    /* renamed from: l */
    public void mo23300l() {
    }

    public void onBackPressed() {
        if (!this.f15419d.canGoBack() || this.f15421f.contains(this.f15419d.getUrl()) || !this.f15422g) {
            finish();
        } else {
            this.f15419d.goBack();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0268, code lost:
        r12.append(r0);
        r12.append(com.yeelight.yeelib.managers.C8281l.m19542b().mo35224c());
        r12 = r12.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x027f, code lost:
        m20557e0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x039b, code lost:
        r0.append(r12);
        r12 = r0.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x04a5, code lost:
        r12.append(r0);
        r0 = com.yeelight.yeelib.managers.C8281l.m19542b().mo35224c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x04b0, code lost:
        r12.append(r0);
        r12 = r12.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x04b7, code lost:
        r7 = r5;
        r5 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x04d2, code lost:
        r12 = new java.lang.StringBuilder();
        r12.append("Url = ");
        r12.append(r5);
        r11.f15416a.setText(r7);
        r11.f15420e = r11.f15419d.getSettings();
        initWebView();
        r11.f15419d.requestFocusFromTouch();
        r11.f15419d.loadUrl(r5);
        r11.f15421f.add("https://www.miui.com/res/doc/privacy/cn.html");
        r11.f15421f.add("https://www.miui.com/res/doc/privacy/en.html");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0507, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            super.onCreate(r12)
            r11.mo35653P()
            r12 = 1
            r11.mo35654R(r12)
            int r0 = com.yeelight.yeelib.R$layout.activity_common_webview
            r11.setContentView(r0)
            p051j4.C9193k.m22157h(r12, r11)
            int r12 = com.yeelight.yeelib.R$id.text_title
            android.view.View r12 = r11.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r11.f15416a = r12
            int r12 = com.yeelight.yeelib.R$id.btn_title_bar_left
            android.view.View r12 = r11.findViewById(r12)
            e4.f0 r0 = new e4.f0
            r0.<init>(r11)
            r12.setOnClickListener(r0)
            int r12 = com.yeelight.yeelib.R$id.tile_bar_right_text1
            android.view.View r12 = r11.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r11.f15417b = r12
            int r12 = com.yeelight.yeelib.R$id.pb_loading
            android.view.View r12 = r11.findViewById(r12)
            android.widget.ProgressBar r12 = (android.widget.ProgressBar) r12
            r11.f15418c = r12
            int r12 = com.yeelight.yeelib.R$id.layout_webview
            android.view.View r12 = r11.findViewById(r12)
            android.webkit.WebView r12 = (android.webkit.WebView) r12
            r11.f15419d = r12
            android.content.Intent r12 = r11.getIntent()
            java.lang.String r0 = "url_index"
            r1 = 0
            int r12 = r12.getIntExtra(r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "index: "
            r0.append(r2)
            r0.append(r12)
            android.content.Intent r0 = r11.getIntent()
            java.lang.String r2 = "server_index"
            java.lang.String r0 = r0.getStringExtra(r2)
            java.lang.String r2 = "zh_TW"
            java.lang.String r3 = "_"
            java.lang.String r4 = "host_url"
            r5 = 0
            java.lang.String r6 = "zh_CN"
            java.lang.String r7 = ""
            java.lang.String r8 = "https://www.yeelight.com/faq/app/reset/"
            java.lang.String r9 = "&type="
            java.lang.String r10 = "introduce?lang="
            switch(r12) {
                case -1: goto L_0x04ba;
                case 0: goto L_0x0493;
                case 1: goto L_0x0480;
                case 2: goto L_0x0464;
                case 3: goto L_0x0448;
                case 4: goto L_0x042c;
                case 5: goto L_0x040f;
                case 6: goto L_0x03f2;
                case 7: goto L_0x03d5;
                case 8: goto L_0x03b8;
                case 9: goto L_0x03ae;
                case 10: goto L_0x03a4;
                case 11: goto L_0x007e;
                case 12: goto L_0x007e;
                case 13: goto L_0x007e;
                case 14: goto L_0x036a;
                case 15: goto L_0x0360;
                case 16: goto L_0x0337;
                case 17: goto L_0x030e;
                case 18: goto L_0x02e4;
                case 19: goto L_0x02ba;
                case 20: goto L_0x029c;
                case 21: goto L_0x0284;
                case 22: goto L_0x023c;
                case 23: goto L_0x020a;
                case 24: goto L_0x01fb;
                case 25: goto L_0x01d2;
                case 26: goto L_0x0197;
                case 27: goto L_0x0156;
                case 28: goto L_0x012d;
                case 29: goto L_0x0104;
                case 30: goto L_0x00db;
                case 31: goto L_0x00b2;
                case 32: goto L_0x00ae;
                case 33: goto L_0x0085;
                case 34: goto L_0x0081;
                default: goto L_0x007e;
            }
        L_0x007e:
            r7 = r5
            goto L_0x04d2
        L_0x0081:
            java.lang.String r12 = "https://account.xiaomi.com/helpcenter"
            goto L_0x04b7
        L_0x0085:
            android.content.res.Resources r12 = r11.getResources()
            int r0 = com.yeelight.yeelib.R$string.remote_connection_new_device_how
            java.lang.String r5 = r12.getString(r0)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = com.yeelight.yeelib.utils.AppUtils.f4990n
            r12.append(r0)
            r12.append(r10)
            com.yeelight.yeelib.managers.l r0 = com.yeelight.yeelib.managers.C8281l.m19542b()
            java.lang.String r0 = r0.mo35224c()
            r12.append(r0)
            r12.append(r9)
            java.lang.String r0 = "rc-minas"
            goto L_0x04b0
        L_0x00ae:
            java.lang.String r5 = "https://www.yeelight.com/pages/google-activity.html"
            goto L_0x04d2
        L_0x00b2:
            android.content.res.Resources r12 = r11.getResources()
            int r0 = com.yeelight.yeelib.R$string.remote_connection_new_device_how
            java.lang.String r5 = r12.getString(r0)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = com.yeelight.yeelib.utils.AppUtils.f4990n
            r12.append(r0)
            r12.append(r10)
            com.yeelight.yeelib.managers.l r0 = com.yeelight.yeelib.managers.C8281l.m19542b()
            java.lang.String r0 = r0.mo35224c()
            r12.append(r0)
            r12.append(r9)
            java.lang.String r0 = "list-fancl"
            goto L_0x04b0
        L_0x00db:
            android.content.res.Resources r12 = r11.getResources()
            int r0 = com.yeelight.yeelib.R$string.remote_connection_new_device_how
            java.lang.String r5 = r12.getString(r0)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = com.yeelight.yeelib.utils.AppUtils.f4990n
            r12.append(r0)
            r12.append(r10)
            com.yeelight.yeelib.managers.l r0 = com.yeelight.yeelib.managers.C8281l.m19542b()
            java.lang.String r0 = r0.mo35224c()
            r12.append(r0)
            r12.append(r9)
            java.lang.String r0 = "rc-fancl2"
            goto L_0x04b0
        L_0x0104:
            android.content.res.Resources r12 = r11.getResources()
            int r0 = com.yeelight.yeelib.R$string.remote_connection_new_device_how
            java.lang.String r5 = r12.getString(r0)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = com.yeelight.yeelib.utils.AppUtils.f4990n
            r12.append(r0)
            r12.append(r10)
            com.yeelight.yeelib.managers.l r0 = com.yeelight.yeelib.managers.C8281l.m19542b()
            java.lang.String r0 = r0.mo35224c()
            r12.append(r0)
            r12.append(r9)
            java.lang.String r0 = "list-control"
            goto L_0x04b0
        L_0x012d:
            android.content.res.Resources r12 = r11.getResources()
            int r0 = com.yeelight.yeelib.R$string.remote_connection_new_device_how
            java.lang.String r5 = r12.getString(r0)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = com.yeelight.yeelib.utils.AppUtils.f4990n
            r12.append(r0)
            r12.append(r10)
            com.yeelight.yeelib.managers.l r0 = com.yeelight.yeelib.managers.C8281l.m19542b()
            java.lang.String r0 = r0.mo35224c()
            r12.append(r0)
            r12.append(r9)
            java.lang.String r0 = "rc-motor"
            goto L_0x04b0
        L_0x0156:
            int r12 = com.yeelight.yeelib.R$string.settings_google_custom_connect
            java.lang.String r5 = r11.getString(r12)
            java.lang.String r12 = "https://thirdparty.yeelight.com/page/app/google-home/link"
            com.yeelight.yeelib.managers.l r0 = com.yeelight.yeelib.managers.C8281l.m19542b()
            java.lang.String r0 = r0.mo35224c()
            boolean r1 = r6.equals(r0)
            if (r1 != 0) goto L_0x0172
            boolean r1 = r2.equals(r0)
            if (r1 == 0) goto L_0x0184
        L_0x0172:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            r1.append(r3)
            r1.append(r0)
            java.lang.String r12 = r1.toString()
        L_0x0184:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            java.lang.String r12 = ".html?date="
            r0.append(r12)
            java.lang.String r12 = r11.m20552Z()
            goto L_0x039b
        L_0x0197:
            java.lang.String r12 = "https://thirdparty.yeelight.com/page/app/google-home/local"
            com.yeelight.yeelib.managers.l r0 = com.yeelight.yeelib.managers.C8281l.m19542b()
            java.lang.String r0 = r0.mo35224c()
            boolean r1 = r6.equals(r0)
            if (r1 != 0) goto L_0x01ad
            boolean r1 = r2.equals(r0)
            if (r1 == 0) goto L_0x01bf
        L_0x01ad:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            r1.append(r3)
            r1.append(r0)
            java.lang.String r12 = r1.toString()
        L_0x01bf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            java.lang.String r12 = ".html"
            r0.append(r12)
            java.lang.String r5 = r0.toString()
            goto L_0x04d2
        L_0x01d2:
            android.content.res.Resources r12 = r11.getResources()
            int r0 = com.yeelight.yeelib.R$string.remote_connection_new_device_how
            java.lang.String r5 = r12.getString(r0)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = com.yeelight.yeelib.utils.AppUtils.f4990n
            r12.append(r0)
            r12.append(r10)
            com.yeelight.yeelib.managers.l r0 = com.yeelight.yeelib.managers.C8281l.m19542b()
            java.lang.String r0 = r0.mo35224c()
            r12.append(r0)
            r12.append(r9)
            java.lang.String r0 = "rc-auster"
            goto L_0x04b0
        L_0x01fb:
            int r12 = com.yeelight.yeelib.R$string.slide_item_forum
            java.lang.String r5 = r11.getString(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "https://forum.yeelight.com?lang="
            goto L_0x04a5
        L_0x020a:
            android.content.res.Resources r12 = r11.getResources()
            int r1 = com.yeelight.yeelib.R$string.application_priavcy_policy
            java.lang.String r5 = r12.getString(r1)
            boolean r12 = android.text.TextUtils.isEmpty(r0)
            if (r12 == 0) goto L_0x0237
            com.yeelight.yeelib.managers.q r12 = com.yeelight.yeelib.managers.C8287q.m19593e()
            com.yeelight.yeelib.managers.l r0 = com.yeelight.yeelib.managers.C8281l.m19542b()
            java.lang.String r0 = r0.mo35223a()
            boolean r12 = r12.mo35241h(r0)
            if (r12 == 0) goto L_0x022f
            java.lang.String r12 = f15415n
            goto L_0x027f
        L_0x022f:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = f15414m
            goto L_0x0268
        L_0x0237:
            java.lang.String r12 = r11.m20554b0(r0)
            goto L_0x027f
        L_0x023c:
            android.content.res.Resources r12 = r11.getResources()
            int r1 = com.yeelight.yeelib.R$string.application_user_agreement
            java.lang.String r5 = r12.getString(r1)
            boolean r12 = android.text.TextUtils.isEmpty(r0)
            if (r12 == 0) goto L_0x027b
            com.yeelight.yeelib.managers.q r12 = com.yeelight.yeelib.managers.C8287q.m19593e()
            com.yeelight.yeelib.managers.l r0 = com.yeelight.yeelib.managers.C8281l.m19542b()
            java.lang.String r0 = r0.mo35223a()
            boolean r12 = r12.mo35241h(r0)
            if (r12 == 0) goto L_0x0261
            java.lang.String r12 = f15413l
            goto L_0x027f
        L_0x0261:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = f15412k
        L_0x0268:
            r12.append(r0)
            com.yeelight.yeelib.managers.l r0 = com.yeelight.yeelib.managers.C8281l.m19542b()
            java.lang.String r0 = r0.mo35224c()
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            goto L_0x027f
        L_0x027b:
            java.lang.String r12 = r11.m20553a0(r0)
        L_0x027f:
            r11.m20557e0()
            goto L_0x04b7
        L_0x0284:
            android.content.res.Resources r12 = r11.getResources()
            int r0 = com.yeelight.yeelib.R$string.common_text_notice_item
            java.lang.String r5 = r12.getString(r0)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = com.yeelight.yeelib.utils.AppUtils.f4990n
            r12.append(r0)
            java.lang.String r0 = "faq/notice?lang="
            goto L_0x04a5
        L_0x029c:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "https://account.xiaomi.com?passtoken="
            r12.append(r0)
            com.yeelight.yeelib.managers.a r0 = com.yeelight.yeelib.managers.C3051a.m7925r()
            java.lang.String r0 = r0.mo23362o()
            r12.append(r0)
            java.lang.String r5 = r12.toString()
            java.lang.String r12 = "Personal Center"
            r7 = r12
            goto L_0x04d2
        L_0x02ba:
            android.content.res.Resources r12 = r11.getResources()
            int r0 = com.yeelight.yeelib.R$string.slide_item_third_party
            java.lang.String r5 = r12.getString(r0)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "https://thirdparty.yeelight.com/page/app/index.php?lang="
            r12.append(r0)
            com.yeelight.yeelib.managers.l r0 = com.yeelight.yeelib.managers.C8281l.m19542b()
            java.lang.String r0 = r0.mo35224c()
            r12.append(r0)
            java.lang.String r0 = "&date="
            r12.append(r0)
            java.lang.String r0 = r11.m20552Z()
            goto L_0x04b0
        L_0x02e4:
            r11.f15422g = r1
            android.content.res.Resources r12 = r11.getResources()
            int r0 = com.yeelight.yeelib.R$string.my_pomodoro_statistic
            java.lang.String r5 = r12.getString(r0)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = com.yeelight.yeelib.utils.AppUtils.f4993q
            r12.append(r0)
            java.lang.String r0 = "pomodoro-ranking/"
            r12.append(r0)
            com.yeelight.yeelib.managers.a r0 = com.yeelight.yeelib.managers.C3051a.m7925r()
            java.lang.String r0 = r0.mo23366v()
            r12.append(r0)
            java.lang.String r0 = "/"
            goto L_0x04a5
        L_0x030e:
            android.content.res.Resources r12 = r11.getResources()
            int r0 = com.yeelight.yeelib.R$string.remote_connection_new_device_how
            java.lang.String r5 = r12.getString(r0)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = com.yeelight.yeelib.utils.AppUtils.f4990n
            r12.append(r0)
            r12.append(r10)
            com.yeelight.yeelib.managers.l r0 = com.yeelight.yeelib.managers.C8281l.m19542b()
            java.lang.String r0 = r0.mo35224c()
            r12.append(r0)
            r12.append(r9)
            java.lang.String r0 = "rc-cycle"
            goto L_0x04b0
        L_0x0337:
            android.content.res.Resources r12 = r11.getResources()
            int r0 = com.yeelight.yeelib.R$string.remote_connection_new_device_how
            java.lang.String r5 = r12.getString(r0)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = com.yeelight.yeelib.utils.AppUtils.f4990n
            r12.append(r0)
            r12.append(r10)
            com.yeelight.yeelib.managers.l r0 = com.yeelight.yeelib.managers.C8281l.m19542b()
            java.lang.String r0 = r0.mo35224c()
            r12.append(r0)
            r12.append(r9)
            java.lang.String r0 = "list-cycle"
            goto L_0x04b0
        L_0x0360:
            android.content.Intent r12 = r11.getIntent()
            java.lang.String r5 = r12.getStringExtra(r4)
            goto L_0x04d2
        L_0x036a:
            android.content.res.Resources r12 = r11.getResources()
            int r0 = com.yeelight.yeelib.R$string.feature_geek_mode
            java.lang.String r5 = r12.getString(r0)
            com.yeelight.yeelib.managers.l r12 = com.yeelight.yeelib.managers.C8281l.m19542b()
            java.lang.String r12 = r12.mo35224c()
            boolean r0 = r6.equals(r12)
            if (r0 != 0) goto L_0x038c
            java.lang.String r0 = "de_DE"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x038c
            java.lang.String r12 = "en_US"
        L_0x038c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "https://www.yeelight.com/"
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = "/developer"
        L_0x039b:
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            goto L_0x04b7
        L_0x03a4:
            int r12 = com.yeelight.yeelib.R$string.yeelight_website
            java.lang.String r5 = r11.getString(r12)
            java.lang.String r12 = "https://www.yeelight.com"
            goto L_0x04b7
        L_0x03ae:
            int r12 = com.yeelight.yeelib.R$string.yeelight_weibo
            java.lang.String r5 = r11.getString(r12)
            java.lang.String r12 = "https://m.weibo.cn/d/yeelight"
            goto L_0x04b7
        L_0x03b8:
            int r12 = com.yeelight.yeelib.R$string.add_device_how_to_reset
            java.lang.String r5 = r11.getString(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r8)
            com.yeelight.yeelib.managers.l r0 = com.yeelight.yeelib.managers.C8281l.m19542b()
            java.lang.String r0 = r0.mo35224c()
            r12.append(r0)
            java.lang.String r0 = "/reset-cherry1s.html"
            goto L_0x04b0
        L_0x03d5:
            int r12 = com.yeelight.yeelib.R$string.add_device_how_to_reset
            java.lang.String r5 = r11.getString(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r8)
            com.yeelight.yeelib.managers.l r0 = com.yeelight.yeelib.managers.C8281l.m19542b()
            java.lang.String r0 = r0.mo35224c()
            r12.append(r0)
            java.lang.String r0 = "/reset-luna.html"
            goto L_0x04b0
        L_0x03f2:
            int r12 = com.yeelight.yeelib.R$string.add_device_how_to_reset
            java.lang.String r5 = r11.getString(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r8)
            com.yeelight.yeelib.managers.l r0 = com.yeelight.yeelib.managers.C8281l.m19542b()
            java.lang.String r0 = r0.mo35224c()
            r12.append(r0)
            java.lang.String r0 = "/reset-pitaya.html"
            goto L_0x04b0
        L_0x040f:
            int r12 = com.yeelight.yeelib.R$string.add_device_how_to_reset
            java.lang.String r5 = r11.getString(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r8)
            com.yeelight.yeelib.managers.l r0 = com.yeelight.yeelib.managers.C8281l.m19542b()
            java.lang.String r0 = r0.mo35224c()
            r12.append(r0)
            java.lang.String r0 = "/reset-mango.html"
            goto L_0x04b0
        L_0x042c:
            int r12 = com.yeelight.yeelib.R$string.add_device_how_to_reset
            java.lang.String r5 = r11.getString(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r8)
            com.yeelight.yeelib.managers.l r0 = com.yeelight.yeelib.managers.C8281l.m19542b()
            java.lang.String r0 = r0.mo35224c()
            r12.append(r0)
            java.lang.String r0 = "/reset-color.html"
            goto L_0x04b0
        L_0x0448:
            int r12 = com.yeelight.yeelib.R$string.add_device_how_to_reset
            java.lang.String r5 = r11.getString(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r8)
            com.yeelight.yeelib.managers.l r0 = com.yeelight.yeelib.managers.C8281l.m19542b()
            java.lang.String r0 = r0.mo35224c()
            r12.append(r0)
            java.lang.String r0 = "/reset-white.html"
            goto L_0x04b0
        L_0x0464:
            int r12 = com.yeelight.yeelib.R$string.add_device_how_to_reset
            java.lang.String r5 = r11.getString(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r8)
            com.yeelight.yeelib.managers.l r0 = com.yeelight.yeelib.managers.C8281l.m19542b()
            java.lang.String r0 = r0.mo35224c()
            r12.append(r0)
            java.lang.String r0 = "/reset-cherry.html"
            goto L_0x04b0
        L_0x0480:
            int r12 = com.yeelight.yeelib.R$string.title_reset_device
            java.lang.String r5 = r11.getString(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = com.yeelight.yeelib.utils.AppUtils.f4990n
            r12.append(r0)
            java.lang.String r0 = "?lang="
            goto L_0x04a5
        L_0x0493:
            int r12 = com.yeelight.yeelib.R$string.common_text_faq
            java.lang.String r5 = r11.getString(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = com.yeelight.yeelib.utils.AppUtils.f4990n
            r12.append(r0)
            java.lang.String r0 = "faq?lang="
        L_0x04a5:
            r12.append(r0)
            com.yeelight.yeelib.managers.l r0 = com.yeelight.yeelib.managers.C8281l.m19542b()
            java.lang.String r0 = r0.mo35224c()
        L_0x04b0:
            r12.append(r0)
            java.lang.String r12 = r12.toString()
        L_0x04b7:
            r7 = r5
            r5 = r12
            goto L_0x04d2
        L_0x04ba:
            android.content.Intent r12 = r11.getIntent()
            java.lang.String r0 = "host_title"
            java.lang.String r12 = r12.getStringExtra(r0)
            if (r12 != 0) goto L_0x04c8
            r5 = r7
            goto L_0x04c9
        L_0x04c8:
            r5 = r12
        L_0x04c9:
            android.content.Intent r12 = r11.getIntent()
            java.lang.String r12 = r12.getStringExtra(r4)
            goto L_0x04b7
        L_0x04d2:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Url = "
            r12.append(r0)
            r12.append(r5)
            android.widget.TextView r12 = r11.f15416a
            r12.setText(r7)
            android.webkit.WebView r12 = r11.f15419d
            android.webkit.WebSettings r12 = r12.getSettings()
            r11.f15420e = r12
            r11.initWebView()
            android.webkit.WebView r12 = r11.f15419d
            r12.requestFocusFromTouch()
            android.webkit.WebView r12 = r11.f15419d
            r12.loadUrl(r5)
            java.util.List<java.lang.String> r12 = r11.f15421f
            java.lang.String r0 = "https://www.miui.com/res/doc/privacy/cn.html"
            r12.add(r0)
            java.util.List<java.lang.String> r12 = r11.f15421f
            java.lang.String r0 = "https://www.miui.com/res/doc/privacy/en.html"
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p142ui.activity.YeelightWebviewActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        WebView webView = this.f15419d;
        if (webView != null) {
            webView.removeAllViews();
            this.f15419d.destroy();
        }
        this.f15419d = null;
        mo35652M(this);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C3051a.m7925r().mo23358M(this);
        C8274f.m19527d().mo35216e(this);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C3051a.m7925r().mo23359N(this);
        C8274f.m19527d().mo35217f();
    }

    /* renamed from: q */
    public void mo23308q(String str) {
    }

    /* renamed from: r */
    public void mo23310r(String str) {
    }

    /* renamed from: x */
    public void mo35219x(boolean z) {
        runOnUiThread(new C8712d(z));
    }
}
