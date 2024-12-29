package com.yeelight.yeelib.p194ui.activity;

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
import android.widget.Toast;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p152f.C4201a;
import com.yeelight.yeelib.p152f.C9786f;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.widget.C10515b;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.utils.C4308b;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.ui.activity.YeelightWebviewActivity */
public class YeelightWebviewActivity extends BaseActivity implements C4201a.C4202i, C9786f.C9788b {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final String f19103j = YeelightWebviewActivity.class.getSimpleName();

    /* renamed from: k */
    public static final String f19104k = (C4308b.f7490i + "license/");

    /* renamed from: l */
    public static final String f19105l = (C4308b.f7490i + "privacy/");

    /* renamed from: b */
    CommonTitleBar f19106b;

    /* renamed from: c */
    ProgressBar f19107c;

    /* renamed from: d */
    WebView f19108d;

    /* renamed from: e */
    private WebSettings f19109e;

    /* renamed from: f */
    private List<String> f19110f = new ArrayList();

    /* renamed from: g */
    private boolean f19111g = true;

    /* renamed from: h */
    C10515b.C10517b f19112h = null;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Handler f19113i = new C10298f(this);

    /* renamed from: com.yeelight.yeelib.ui.activity.YeelightWebviewActivity$a */
    class C10291a implements View.OnClickListener {
        C10291a() {
        }

        public void onClick(View view) {
            YeelightWebviewActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.YeelightWebviewActivity$b */
    class C10292b implements View.OnClickListener {

        /* renamed from: com.yeelight.yeelib.ui.activity.YeelightWebviewActivity$b$a */
        class C10293a implements DialogInterface.OnClickListener {
            C10293a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                C9786f.m23727d().mo31639c();
                YeelightWebviewActivity yeelightWebviewActivity = YeelightWebviewActivity.this;
                yeelightWebviewActivity.f19112h = new C10515b.C10517b(yeelightWebviewActivity);
                YeelightWebviewActivity yeelightWebviewActivity2 = YeelightWebviewActivity.this;
                yeelightWebviewActivity2.f19112h.mo33281b(0, yeelightWebviewActivity2.getString(R$string.privacy_policy_data_destroy_ing));
                YeelightWebviewActivity.this.f19112h.mo33283d();
            }
        }

        C10292b() {
        }

        public void onClick(View view) {
            C10526e.C10531e eVar = new C10526e.C10531e(view.getContext());
            eVar.mo33357h(R$string.user_agreement_withdraw_agreement);
            eVar.mo33355f(R$string.user_agreement_withdraw_agreement_warning);
            eVar.mo33353d(-2, view.getContext().getString(R$string.common_text_cancel), (DialogInterface.OnClickListener) null);
            eVar.mo33353d(-1, view.getContext().getString(R$string.common_text_ok), new C10293a());
            eVar.mo33359j();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.YeelightWebviewActivity$c */
    class C10294c extends WebViewClient {
        C10294c() {
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

    /* renamed from: com.yeelight.yeelib.ui.activity.YeelightWebviewActivity$d */
    class C10295d extends WebChromeClient {
        C10295d() {
        }

        public void onHideCustomView() {
            super.onHideCustomView();
        }

        public void onProgressChanged(WebView webView, int i) {
            if (i < 100 && YeelightWebviewActivity.this.f19107c.getVisibility() == 8) {
                YeelightWebviewActivity.this.f19107c.setVisibility(0);
            }
            YeelightWebviewActivity.this.f19107c.setProgress(i);
            if (i == 100) {
                YeelightWebviewActivity.this.f19107c.setVisibility(8);
            }
        }

        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            super.onShowCustomView(view, customViewCallback);
            "onShowCustomView view is " + view.getClass().getSimpleName();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.YeelightWebviewActivity$e */
    class C10296e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f19119a;

        /* renamed from: com.yeelight.yeelib.ui.activity.YeelightWebviewActivity$e$a */
        class C10297a implements DialogInterface.OnDismissListener {
            C10297a() {
            }

            public void onDismiss(DialogInterface dialogInterface) {
                YeelightWebviewActivity.this.f19113i.sendEmptyMessageDelayed(0, 500);
            }
        }

        C10296e(boolean z) {
            this.f19119a = z;
        }

        public void run() {
            YeelightWebviewActivity yeelightWebviewActivity = YeelightWebviewActivity.this;
            C10515b.C10517b bVar = yeelightWebviewActivity.f19112h;
            if (bVar == null) {
                return;
            }
            if (this.f19119a) {
                bVar.mo33281b(1, yeelightWebviewActivity.getString(R$string.privacy_policy_data_destroy_success));
                YeelightWebviewActivity.this.f19112h.mo33280a().setOnDismissListener(new C10297a());
                return;
            }
            bVar.mo33281b(2, yeelightWebviewActivity.getString(R$string.privacy_policy_data_destroy_failed));
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.YeelightWebviewActivity$f */
    class C10298f extends Handler {
        C10298f(YeelightWebviewActivity yeelightWebviewActivity) {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0) {
                C4201a.m11607r().mo23440D();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.YeelightWebviewActivity$g */
    private class C10299g {
        private C10299g() {
        }

        /* synthetic */ C10299g(YeelightWebviewActivity yeelightWebviewActivity, C10291a aVar) {
            this();
        }

        /* renamed from: a */
        public /* synthetic */ void mo32599a(String str) {
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
                String unused = YeelightWebviewActivity.f19103j;
                "sendJson: " + str;
                YeelightWebviewActivity.this.f19113i.post(new C10353z0(this, str));
            }
        }
    }

    static {
        C4308b.f7490i + "faq/app/introduce/%s";
    }

    /* renamed from: X */
    private String m24932X() {
        return new SimpleDateFormat("yyyyMMdd").format(new Date());
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0055 A[RETURN] */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m24933Y(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = r6.hashCode()
            r1 = 3179(0xc6b, float:4.455E-42)
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 == r1) goto L_0x0036
            r1 = 3201(0xc81, float:4.486E-42)
            if (r0 == r1) goto L_0x002c
            r1 = 3668(0xe54, float:5.14E-42)
            if (r0 == r1) goto L_0x0022
            r1 = 3742(0xe9e, float:5.244E-42)
            if (r0 == r1) goto L_0x0018
            goto L_0x0040
        L_0x0018:
            java.lang.String r0 = "us"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0040
            r6 = 2
            goto L_0x0041
        L_0x0022:
            java.lang.String r0 = "sg"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0040
            r6 = 1
            goto L_0x0041
        L_0x002c:
            java.lang.String r0 = "de"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0040
            r6 = 3
            goto L_0x0041
        L_0x0036:
            java.lang.String r0 = "cn"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0040
            r6 = 0
            goto L_0x0041
        L_0x0040:
            r6 = -1
        L_0x0041:
            if (r6 == 0) goto L_0x0055
            if (r6 == r4) goto L_0x0052
            if (r6 == r3) goto L_0x004f
            if (r6 == r2) goto L_0x004c
            java.lang.String r6 = f19104k
            return r6
        L_0x004c:
            java.lang.String r6 = "https://cloud-de.yeelight.com/license/"
            return r6
        L_0x004f:
            java.lang.String r6 = "https://cloud-us.yeelight.com/license/"
            return r6
        L_0x0052:
            java.lang.String r6 = "https://cloud-sg.yeelight.com/license/"
            return r6
        L_0x0055:
            java.lang.String r6 = "https://cloud-bj.yeelight.com/license/"
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.activity.YeelightWebviewActivity.m24933Y(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0055 A[RETURN] */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m24934Z(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = r6.hashCode()
            r1 = 3179(0xc6b, float:4.455E-42)
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 == r1) goto L_0x0036
            r1 = 3201(0xc81, float:4.486E-42)
            if (r0 == r1) goto L_0x002c
            r1 = 3668(0xe54, float:5.14E-42)
            if (r0 == r1) goto L_0x0022
            r1 = 3742(0xe9e, float:5.244E-42)
            if (r0 == r1) goto L_0x0018
            goto L_0x0040
        L_0x0018:
            java.lang.String r0 = "us"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0040
            r6 = 2
            goto L_0x0041
        L_0x0022:
            java.lang.String r0 = "sg"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0040
            r6 = 1
            goto L_0x0041
        L_0x002c:
            java.lang.String r0 = "de"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0040
            r6 = 3
            goto L_0x0041
        L_0x0036:
            java.lang.String r0 = "cn"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0040
            r6 = 0
            goto L_0x0041
        L_0x0040:
            r6 = -1
        L_0x0041:
            if (r6 == 0) goto L_0x0055
            if (r6 == r4) goto L_0x0052
            if (r6 == r3) goto L_0x004f
            if (r6 == r2) goto L_0x004c
            java.lang.String r6 = f19105l
            return r6
        L_0x004c:
            java.lang.String r6 = "https://cloud-de.yeelight.com/privacy/"
            return r6
        L_0x004f:
            java.lang.String r6 = "https://cloud-us.yeelight.com/privacy/"
            return r6
        L_0x0052:
            java.lang.String r6 = "https://cloud-sg.yeelight.com/privacy/"
            return r6
        L_0x0055:
            java.lang.String r6 = "https://cloud-bj.yeelight.com/privacy/"
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.activity.YeelightWebviewActivity.m24934Z(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0059, code lost:
        if (r0 == 213) goto L_0x0038;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void initWebView() {
        /*
            r4 = this;
            android.webkit.WebSettings r0 = r4.f19109e
            r1 = 1
            r0.setJavaScriptEnabled(r1)
            android.webkit.WebSettings r0 = r4.f19109e
            r2 = 0
            r0.setBuiltInZoomControls(r2)
            android.webkit.WebSettings r0 = r4.f19109e
            android.webkit.WebSettings$LayoutAlgorithm r3 = android.webkit.WebSettings.LayoutAlgorithm.SINGLE_COLUMN
            r0.setLayoutAlgorithm(r3)
            android.webkit.WebSettings r0 = r4.f19109e
            r0.setUseWideViewPort(r1)
            android.webkit.WebSettings r0 = r4.f19109e
            r0.setLoadWithOverviewMode(r1)
            android.webkit.WebSettings r0 = r4.f19109e
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
            android.webkit.WebSettings r0 = r4.f19109e
            android.webkit.WebSettings$ZoomDensity r1 = android.webkit.WebSettings.ZoomDensity.FAR
        L_0x003c:
            r0.setDefaultZoom(r1)
            goto L_0x005c
        L_0x0040:
            r1 = 160(0xa0, float:2.24E-43)
            if (r0 != r1) goto L_0x0049
            android.webkit.WebSettings r0 = r4.f19109e
            android.webkit.WebSettings$ZoomDensity r1 = android.webkit.WebSettings.ZoomDensity.MEDIUM
            goto L_0x003c
        L_0x0049:
            r1 = 120(0x78, float:1.68E-43)
            if (r0 != r1) goto L_0x0052
            android.webkit.WebSettings r0 = r4.f19109e
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
            android.webkit.WebSettings r0 = r4.f19109e
            r0.setMixedContentMode(r2)
        L_0x0067:
            android.webkit.WebView r0 = r4.f19108d
            com.yeelight.yeelib.ui.activity.YeelightWebviewActivity$c r1 = new com.yeelight.yeelib.ui.activity.YeelightWebviewActivity$c
            r1.<init>()
            r0.setWebViewClient(r1)
            android.webkit.WebView r0 = r4.f19108d
            com.yeelight.yeelib.ui.activity.YeelightWebviewActivity$d r1 = new com.yeelight.yeelib.ui.activity.YeelightWebviewActivity$d
            r1.<init>()
            r0.setWebChromeClient(r1)
            android.webkit.WebView r0 = r4.f19108d
            com.yeelight.yeelib.ui.activity.YeelightWebviewActivity$g r1 = new com.yeelight.yeelib.ui.activity.YeelightWebviewActivity$g
            r2 = 0
            r1.<init>(r4, r2)
            java.lang.String r2 = "yeelightApp"
            r0.addJavascriptInterface(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.activity.YeelightWebviewActivity.initWebView():void");
    }

    /* renamed from: C */
    public void mo23456C(C4201a.C4212k kVar) {
    }

    /* renamed from: H */
    public void mo23457H() {
    }

    /* renamed from: d */
    public void mo23458d() {
    }

    /* renamed from: g */
    public void mo23459g() {
        try {
            Intent intent = new Intent(this, Class.forName("com.yeelight.cherry.ui.activity.WelcomeGuideNewActivity"));
            intent.setFlags(67108864);
            startActivity(intent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: i */
    public void mo23460i() {
    }

    /* renamed from: l */
    public void mo23461l() {
    }

    public void onBackPressed() {
        if (!this.f19108d.canGoBack() || this.f19110f.contains(this.f19108d.getUrl()) || !this.f19111g) {
            finish();
        } else {
            this.f19108d.goBack();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0255, code lost:
        if (r2 != false) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x02a5, code lost:
        if (r2 != false) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x02a7, code lost:
        r9 = getString(com.yeelight.yeelib.R$string.user_agreement_withdraw);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x038d, code lost:
        r0 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x03c1, code lost:
        r3.append(r1);
        r1 = r3.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x04c1, code lost:
        r1.append(r3);
        r3 = com.yeelight.yeelib.p152f.C4230l.m11766b().mo23553c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x04cc, code lost:
        r1.append(r3);
        r1 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x04d3, code lost:
        r13 = r9;
        r9 = r0;
        r0 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x04ed, code lost:
        "Url = " + r1;
        r14.f19106b.mo32825a(r9, new com.yeelight.yeelib.p194ui.activity.YeelightWebviewActivity.C10291a(r14), (android.view.View.OnClickListener) null);
        r14.f19106b.setTitleTextSize(16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x050e, code lost:
        if (r2 == false) goto L_0x0524;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0510, code lost:
        r14.f19106b.setRightTextStr(r0);
        r14.f19106b.setRightTextVisible(true);
        r14.f19106b.setRightButtonClickListener(new com.yeelight.yeelib.p194ui.activity.YeelightWebviewActivity.C10292b(r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0524, code lost:
        r14.f19109e = r14.f19108d.getSettings();
        initWebView();
        r14.f19108d.requestFocusFromTouch();
        r14.f19108d.loadUrl(r1);
        r14.f19110f.add("https://www.miui.com/res/doc/privacy/cn.html");
        r14.f19110f.add("https://www.miui.com/res/doc/privacy/en.html");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0547, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            super.onCreate(r15)
            r14.mo32193P()
            r15 = 1
            r14.mo32194R(r15)
            int r0 = com.yeelight.yeelib.R$layout.activity_common_webview
            r14.setContentView(r0)
            com.yeelight.yeelib.utils.C10547m.m25758h(r15, r14)
            int r0 = com.yeelight.yeelib.R$id.title_bar
            android.view.View r0 = r14.findViewById(r0)
            com.yeelight.yeelib.ui.view.CommonTitleBar r0 = (com.yeelight.yeelib.p194ui.view.CommonTitleBar) r0
            r14.f19106b = r0
            int r0 = com.yeelight.yeelib.R$id.pb_loading
            android.view.View r0 = r14.findViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r14.f19107c = r0
            int r0 = com.yeelight.yeelib.R$id.layout_webview
            android.view.View r0 = r14.findViewById(r0)
            android.webkit.WebView r0 = (android.webkit.WebView) r0
            r14.f19108d = r0
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            com.yeelight.yeelib.ui.view.CommonTitleBar r1 = r14.f19106b
            r1.setLayoutParams(r0)
            int r1 = com.yeelight.yeelib.utils.C10547m.m25755e(r14)
            r2 = 0
            r0.setMargins(r2, r1, r2, r2)
            android.content.Intent r0 = r14.getIntent()
            java.lang.String r1 = "url_index"
            int r0 = r0.getIntExtra(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "index: "
            r1.append(r3)
            r1.append(r0)
            r1.toString()
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r3 = "server_index"
            java.lang.String r1 = r1.getStringExtra(r3)
            java.lang.String r3 = "with_draw"
            java.lang.String r4 = "zh_TW"
            java.lang.String r5 = "_"
            java.lang.String r6 = "host_url"
            java.lang.String r7 = "zh_CN"
            r8 = 0
            java.lang.String r9 = ""
            java.lang.String r10 = "https://www.yeelight.com/faq/app/reset/"
            java.lang.String r11 = "&type="
            java.lang.String r12 = "faq/app/introduce/index.php?lang="
            switch(r0) {
                case -1: goto L_0x04d7;
                case 0: goto L_0x04b4;
                case 1: goto L_0x04a6;
                case 2: goto L_0x048a;
                case 3: goto L_0x046e;
                case 4: goto L_0x0452;
                case 5: goto L_0x0435;
                case 6: goto L_0x0418;
                case 7: goto L_0x03fb;
                case 8: goto L_0x03de;
                case 9: goto L_0x03d4;
                case 10: goto L_0x03ca;
                case 11: goto L_0x007e;
                case 12: goto L_0x007e;
                case 13: goto L_0x007e;
                case 14: goto L_0x0390;
                case 15: goto L_0x0385;
                case 16: goto L_0x035c;
                case 17: goto L_0x0333;
                case 18: goto L_0x0309;
                case 19: goto L_0x02df;
                case 20: goto L_0x02c2;
                case 21: goto L_0x02af;
                case 22: goto L_0x0258;
                case 23: goto L_0x0208;
                case 24: goto L_0x01f9;
                case 25: goto L_0x01d0;
                case 26: goto L_0x0195;
                case 27: goto L_0x0154;
                case 28: goto L_0x012b;
                case 29: goto L_0x0102;
                case 30: goto L_0x00d9;
                case 31: goto L_0x00b0;
                case 32: goto L_0x00ac;
                case 33: goto L_0x0083;
                default: goto L_0x007e;
            }
        L_0x007e:
            r1 = r8
            r0 = r9
            r9 = r1
            goto L_0x04ed
        L_0x0083:
            android.content.res.Resources r0 = r14.getResources()
            int r1 = com.yeelight.yeelib.R$string.remote_connection_new_device_how
            java.lang.String r0 = r0.getString(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = com.yeelight.yeelib.utils.C4308b.f7490i
            r1.append(r3)
            r1.append(r12)
            com.yeelight.yeelib.f.l r3 = com.yeelight.yeelib.p152f.C4230l.m11766b()
            java.lang.String r3 = r3.mo23553c()
            r1.append(r3)
            r1.append(r11)
            java.lang.String r3 = "rc-minas"
            goto L_0x04cc
        L_0x00ac:
            java.lang.String r1 = "https://www.yeelight.com/pages/google-activity.html"
            goto L_0x038d
        L_0x00b0:
            android.content.res.Resources r0 = r14.getResources()
            int r1 = com.yeelight.yeelib.R$string.remote_connection_new_device_how
            java.lang.String r0 = r0.getString(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = com.yeelight.yeelib.utils.C4308b.f7490i
            r1.append(r3)
            r1.append(r12)
            com.yeelight.yeelib.f.l r3 = com.yeelight.yeelib.p152f.C4230l.m11766b()
            java.lang.String r3 = r3.mo23553c()
            r1.append(r3)
            r1.append(r11)
            java.lang.String r3 = "list-fancl"
            goto L_0x04cc
        L_0x00d9:
            android.content.res.Resources r0 = r14.getResources()
            int r1 = com.yeelight.yeelib.R$string.remote_connection_new_device_how
            java.lang.String r0 = r0.getString(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = com.yeelight.yeelib.utils.C4308b.f7490i
            r1.append(r3)
            r1.append(r12)
            com.yeelight.yeelib.f.l r3 = com.yeelight.yeelib.p152f.C4230l.m11766b()
            java.lang.String r3 = r3.mo23553c()
            r1.append(r3)
            r1.append(r11)
            java.lang.String r3 = "rc-fancl2"
            goto L_0x04cc
        L_0x0102:
            android.content.res.Resources r0 = r14.getResources()
            int r1 = com.yeelight.yeelib.R$string.remote_connection_new_device_how
            java.lang.String r0 = r0.getString(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = com.yeelight.yeelib.utils.C4308b.f7490i
            r1.append(r3)
            r1.append(r12)
            com.yeelight.yeelib.f.l r3 = com.yeelight.yeelib.p152f.C4230l.m11766b()
            java.lang.String r3 = r3.mo23553c()
            r1.append(r3)
            r1.append(r11)
            java.lang.String r3 = "list-control"
            goto L_0x04cc
        L_0x012b:
            android.content.res.Resources r0 = r14.getResources()
            int r1 = com.yeelight.yeelib.R$string.remote_connection_new_device_how
            java.lang.String r0 = r0.getString(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = com.yeelight.yeelib.utils.C4308b.f7490i
            r1.append(r3)
            r1.append(r12)
            com.yeelight.yeelib.f.l r3 = com.yeelight.yeelib.p152f.C4230l.m11766b()
            java.lang.String r3 = r3.mo23553c()
            r1.append(r3)
            r1.append(r11)
            java.lang.String r3 = "rc-motor"
            goto L_0x04cc
        L_0x0154:
            int r0 = com.yeelight.yeelib.R$string.settings_google_custom_connect
            java.lang.String r0 = r14.getString(r0)
            java.lang.String r1 = "https://thirdparty.yeelight.com/page/app/google-home/link"
            com.yeelight.yeelib.f.l r3 = com.yeelight.yeelib.p152f.C4230l.m11766b()
            java.lang.String r3 = r3.mo23553c()
            boolean r6 = r7.equals(r3)
            if (r6 != 0) goto L_0x0170
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L_0x0182
        L_0x0170:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r5)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
        L_0x0182:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = ".html?date="
            r3.append(r1)
            java.lang.String r1 = r14.m24932X()
            goto L_0x03c1
        L_0x0195:
            java.lang.String r0 = "https://thirdparty.yeelight.com/page/app/google-home/local"
            com.yeelight.yeelib.f.l r1 = com.yeelight.yeelib.p152f.C4230l.m11766b()
            java.lang.String r1 = r1.mo23553c()
            boolean r3 = r7.equals(r1)
            if (r3 != 0) goto L_0x01ab
            boolean r3 = r4.equals(r1)
            if (r3 == 0) goto L_0x01bd
        L_0x01ab:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r5)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
        L_0x01bd:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ".html"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            goto L_0x038d
        L_0x01d0:
            android.content.res.Resources r0 = r14.getResources()
            int r1 = com.yeelight.yeelib.R$string.remote_connection_new_device_how
            java.lang.String r0 = r0.getString(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = com.yeelight.yeelib.utils.C4308b.f7490i
            r1.append(r3)
            r1.append(r12)
            com.yeelight.yeelib.f.l r3 = com.yeelight.yeelib.p152f.C4230l.m11766b()
            java.lang.String r3 = r3.mo23553c()
            r1.append(r3)
            r1.append(r11)
            java.lang.String r3 = "rc-auster"
            goto L_0x04cc
        L_0x01f9:
            int r0 = com.yeelight.yeelib.R$string.slide_item_forum
            java.lang.String r0 = r14.getString(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "https://forum.yeelight.com?lang="
            goto L_0x04c1
        L_0x0208:
            android.content.res.Resources r0 = r14.getResources()
            int r4 = com.yeelight.yeelib.R$string.application_priavcy_policy
            java.lang.String r0 = r0.getString(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L_0x0232
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = f19105l
            r1.append(r4)
            com.yeelight.yeelib.f.l r4 = com.yeelight.yeelib.p152f.C4230l.m11766b()
            java.lang.String r4 = r4.mo23553c()
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            goto L_0x024d
        L_0x0232:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = r14.m24934Z(r1)
            r4.append(r1)
            com.yeelight.yeelib.f.l r1 = com.yeelight.yeelib.p152f.C4230l.m11766b()
            java.lang.String r1 = r1.mo23553c()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
        L_0x024d:
            android.content.Intent r4 = r14.getIntent()
            boolean r2 = r4.getBooleanExtra(r3, r2)
            if (r2 == 0) goto L_0x04d3
            goto L_0x02a7
        L_0x0258:
            android.content.res.Resources r0 = r14.getResources()
            int r4 = com.yeelight.yeelib.R$string.application_user_agreement
            java.lang.String r0 = r0.getString(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L_0x0282
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = f19104k
            r1.append(r4)
            com.yeelight.yeelib.f.l r4 = com.yeelight.yeelib.p152f.C4230l.m11766b()
            java.lang.String r4 = r4.mo23553c()
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            goto L_0x029d
        L_0x0282:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = r14.m24933Y(r1)
            r4.append(r1)
            com.yeelight.yeelib.f.l r1 = com.yeelight.yeelib.p152f.C4230l.m11766b()
            java.lang.String r1 = r1.mo23553c()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
        L_0x029d:
            android.content.Intent r4 = r14.getIntent()
            boolean r2 = r4.getBooleanExtra(r3, r2)
            if (r2 == 0) goto L_0x04d3
        L_0x02a7:
            int r3 = com.yeelight.yeelib.R$string.user_agreement_withdraw
            java.lang.String r9 = r14.getString(r3)
            goto L_0x04d3
        L_0x02af:
            android.content.res.Resources r0 = r14.getResources()
            int r1 = com.yeelight.yeelib.R$string.common_text_notice_item
            java.lang.String r0 = r0.getString(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "https://www.yeelight.com/faq/app/answer/switch_server.php?lang="
            goto L_0x04c1
        L_0x02c2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "https://account.xiaomi.com?passtoken="
            r0.append(r1)
            com.yeelight.yeelib.f.a r1 = com.yeelight.yeelib.p152f.C4201a.m11607r()
            java.lang.String r1 = r1.mo23448o()
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "Personal Center"
            goto L_0x04d3
        L_0x02df:
            android.content.res.Resources r0 = r14.getResources()
            int r1 = com.yeelight.yeelib.R$string.slide_item_third_party
            java.lang.String r0 = r0.getString(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "https://thirdparty.yeelight.com/page/app/index.php?lang="
            r1.append(r3)
            com.yeelight.yeelib.f.l r3 = com.yeelight.yeelib.p152f.C4230l.m11766b()
            java.lang.String r3 = r3.mo23553c()
            r1.append(r3)
            java.lang.String r3 = "&date="
            r1.append(r3)
            java.lang.String r3 = r14.m24932X()
            goto L_0x04cc
        L_0x0309:
            r14.f19111g = r2
            android.content.res.Resources r0 = r14.getResources()
            int r1 = com.yeelight.yeelib.R$string.my_pomodoro_statistic
            java.lang.String r0 = r0.getString(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = com.yeelight.yeelib.utils.C4308b.f7492k
            r1.append(r3)
            java.lang.String r3 = "pomodoro-ranking/"
            r1.append(r3)
            com.yeelight.yeelib.f.a r3 = com.yeelight.yeelib.p152f.C4201a.m11607r()
            java.lang.String r3 = r3.mo23452v()
            r1.append(r3)
            java.lang.String r3 = "/"
            goto L_0x04c1
        L_0x0333:
            android.content.res.Resources r0 = r14.getResources()
            int r1 = com.yeelight.yeelib.R$string.remote_connection_new_device_how
            java.lang.String r0 = r0.getString(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = com.yeelight.yeelib.utils.C4308b.f7490i
            r1.append(r3)
            r1.append(r12)
            com.yeelight.yeelib.f.l r3 = com.yeelight.yeelib.p152f.C4230l.m11766b()
            java.lang.String r3 = r3.mo23553c()
            r1.append(r3)
            r1.append(r11)
            java.lang.String r3 = "rc-cycle"
            goto L_0x04cc
        L_0x035c:
            android.content.res.Resources r0 = r14.getResources()
            int r1 = com.yeelight.yeelib.R$string.remote_connection_new_device_how
            java.lang.String r0 = r0.getString(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = com.yeelight.yeelib.utils.C4308b.f7490i
            r1.append(r3)
            r1.append(r12)
            com.yeelight.yeelib.f.l r3 = com.yeelight.yeelib.p152f.C4230l.m11766b()
            java.lang.String r3 = r3.mo23553c()
            r1.append(r3)
            r1.append(r11)
            java.lang.String r3 = "list-cycle"
            goto L_0x04cc
        L_0x0385:
            android.content.Intent r0 = r14.getIntent()
            java.lang.String r1 = r0.getStringExtra(r6)
        L_0x038d:
            r0 = r9
            goto L_0x04ed
        L_0x0390:
            android.content.res.Resources r0 = r14.getResources()
            int r1 = com.yeelight.yeelib.R$string.feature_geek_mode
            java.lang.String r0 = r0.getString(r1)
            com.yeelight.yeelib.f.l r1 = com.yeelight.yeelib.p152f.C4230l.m11766b()
            java.lang.String r1 = r1.mo23553c()
            boolean r3 = r7.equals(r1)
            if (r3 != 0) goto L_0x03b2
            java.lang.String r3 = "de_DE"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x03b2
            java.lang.String r1 = "en_US"
        L_0x03b2:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "https://www.yeelight.com/"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = "/developer"
        L_0x03c1:
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            goto L_0x04d3
        L_0x03ca:
            int r0 = com.yeelight.yeelib.R$string.yeelight_website
            java.lang.String r0 = r14.getString(r0)
            java.lang.String r1 = "https://www.yeelight.com"
            goto L_0x04d3
        L_0x03d4:
            int r0 = com.yeelight.yeelib.R$string.yeelight_weibo
            java.lang.String r0 = r14.getString(r0)
            java.lang.String r1 = "https://m.weibo.cn/d/yeelight"
            goto L_0x04d3
        L_0x03de:
            int r0 = com.yeelight.yeelib.R$string.add_device_how_to_reset
            java.lang.String r0 = r14.getString(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            com.yeelight.yeelib.f.l r3 = com.yeelight.yeelib.p152f.C4230l.m11766b()
            java.lang.String r3 = r3.mo23553c()
            r1.append(r3)
            java.lang.String r3 = "/reset-cherry1s.html"
            goto L_0x04cc
        L_0x03fb:
            int r0 = com.yeelight.yeelib.R$string.add_device_how_to_reset
            java.lang.String r0 = r14.getString(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            com.yeelight.yeelib.f.l r3 = com.yeelight.yeelib.p152f.C4230l.m11766b()
            java.lang.String r3 = r3.mo23553c()
            r1.append(r3)
            java.lang.String r3 = "/reset-luna.html"
            goto L_0x04cc
        L_0x0418:
            int r0 = com.yeelight.yeelib.R$string.add_device_how_to_reset
            java.lang.String r0 = r14.getString(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            com.yeelight.yeelib.f.l r3 = com.yeelight.yeelib.p152f.C4230l.m11766b()
            java.lang.String r3 = r3.mo23553c()
            r1.append(r3)
            java.lang.String r3 = "/reset-pitaya.html"
            goto L_0x04cc
        L_0x0435:
            int r0 = com.yeelight.yeelib.R$string.add_device_how_to_reset
            java.lang.String r0 = r14.getString(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            com.yeelight.yeelib.f.l r3 = com.yeelight.yeelib.p152f.C4230l.m11766b()
            java.lang.String r3 = r3.mo23553c()
            r1.append(r3)
            java.lang.String r3 = "/reset-mango.html"
            goto L_0x04cc
        L_0x0452:
            int r0 = com.yeelight.yeelib.R$string.add_device_how_to_reset
            java.lang.String r0 = r14.getString(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            com.yeelight.yeelib.f.l r3 = com.yeelight.yeelib.p152f.C4230l.m11766b()
            java.lang.String r3 = r3.mo23553c()
            r1.append(r3)
            java.lang.String r3 = "/reset-color.html"
            goto L_0x04cc
        L_0x046e:
            int r0 = com.yeelight.yeelib.R$string.add_device_how_to_reset
            java.lang.String r0 = r14.getString(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            com.yeelight.yeelib.f.l r3 = com.yeelight.yeelib.p152f.C4230l.m11766b()
            java.lang.String r3 = r3.mo23553c()
            r1.append(r3)
            java.lang.String r3 = "/reset-white.html"
            goto L_0x04cc
        L_0x048a:
            int r0 = com.yeelight.yeelib.R$string.add_device_how_to_reset
            java.lang.String r0 = r14.getString(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            com.yeelight.yeelib.f.l r3 = com.yeelight.yeelib.p152f.C4230l.m11766b()
            java.lang.String r3 = r3.mo23553c()
            r1.append(r3)
            java.lang.String r3 = "/reset-cherry.html"
            goto L_0x04cc
        L_0x04a6:
            int r0 = com.yeelight.yeelib.R$string.title_reset_device
            java.lang.String r0 = r14.getString(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "https://www.yeelight.com/faq/app/reset/index.php?lang="
            goto L_0x04c1
        L_0x04b4:
            int r0 = com.yeelight.yeelib.R$string.common_text_faq
            java.lang.String r0 = r14.getString(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "https://www.yeelight.com/faq/app/answer/v3.php?lang="
        L_0x04c1:
            r1.append(r3)
            com.yeelight.yeelib.f.l r3 = com.yeelight.yeelib.p152f.C4230l.m11766b()
            java.lang.String r3 = r3.mo23553c()
        L_0x04cc:
            r1.append(r3)
            java.lang.String r1 = r1.toString()
        L_0x04d3:
            r13 = r9
            r9 = r0
            r0 = r13
            goto L_0x04ed
        L_0x04d7:
            android.content.Intent r0 = r14.getIntent()
            java.lang.String r1 = "host_title"
            java.lang.String r0 = r0.getStringExtra(r1)
            if (r0 != 0) goto L_0x04e4
            r0 = r9
        L_0x04e4:
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r1 = r1.getStringExtra(r6)
            goto L_0x04d3
        L_0x04ed:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Url = "
            r3.append(r4)
            r3.append(r1)
            r3.toString()
            com.yeelight.yeelib.ui.view.CommonTitleBar r3 = r14.f19106b
            com.yeelight.yeelib.ui.activity.YeelightWebviewActivity$a r4 = new com.yeelight.yeelib.ui.activity.YeelightWebviewActivity$a
            r4.<init>()
            r3.mo32825a(r9, r4, r8)
            com.yeelight.yeelib.ui.view.CommonTitleBar r3 = r14.f19106b
            r4 = 16
            r3.setTitleTextSize(r4)
            if (r2 == 0) goto L_0x0524
            com.yeelight.yeelib.ui.view.CommonTitleBar r2 = r14.f19106b
            r2.setRightTextStr(r0)
            com.yeelight.yeelib.ui.view.CommonTitleBar r0 = r14.f19106b
            r0.setRightTextVisible(r15)
            com.yeelight.yeelib.ui.view.CommonTitleBar r15 = r14.f19106b
            com.yeelight.yeelib.ui.activity.YeelightWebviewActivity$b r0 = new com.yeelight.yeelib.ui.activity.YeelightWebviewActivity$b
            r0.<init>()
            r15.setRightButtonClickListener(r0)
        L_0x0524:
            android.webkit.WebView r15 = r14.f19108d
            android.webkit.WebSettings r15 = r15.getSettings()
            r14.f19109e = r15
            r14.initWebView()
            android.webkit.WebView r15 = r14.f19108d
            r15.requestFocusFromTouch()
            android.webkit.WebView r15 = r14.f19108d
            r15.loadUrl(r1)
            java.util.List<java.lang.String> r15 = r14.f19110f
            java.lang.String r0 = "https://www.miui.com/res/doc/privacy/cn.html"
            r15.add(r0)
            java.util.List<java.lang.String> r15 = r14.f19110f
            java.lang.String r0 = "https://www.miui.com/res/doc/privacy/en.html"
            r15.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.activity.YeelightWebviewActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        WebView webView = this.f19108d;
        if (webView != null) {
            webView.removeAllViews();
            this.f19108d.destroy();
        }
        this.f19108d = null;
        mo32192M(this);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C4201a.m11607r().mo23444M(this);
        C9786f.m23727d().mo31640e(this);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C4201a.m11607r().mo23445N(this);
        C9786f.m23727d().mo31641f();
    }

    /* renamed from: q */
    public void mo23462q(String str) {
    }

    /* renamed from: r */
    public void mo23463r(String str) {
    }

    /* renamed from: x */
    public void mo31643x(boolean z) {
        runOnUiThread(new C10296e(z));
    }
}
