package com.yeelight.cherry.p141ui.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.miot.common.config.AppConfiguration;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.managers.C3084o;
import com.yeelight.yeelib.managers.C8281l;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.activity.YeelightWebviewActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.service.MiotPrivacyService;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import p051j4.C3278f;
import p051j4.C3283v;
import p051j4.C9193k;
import p170i4.C9107b;

/* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity */
public class LocaleSelectionLoginActivity extends BaseActivity implements C3051a.C3052i {

    /* renamed from: g */
    private static final String f10653g = "LocaleSelectionLoginActivity";
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static ArrayList<C5384m> f10654h;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f10655a = -1;

    /* renamed from: b */
    private C5385n f10656b;

    /* renamed from: c */
    private LinearLayout f10657c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ImageView f10658d;

    /* renamed from: e */
    private Button f10659e;

    /* renamed from: f */
    C9107b.C9109b f10660f = null;
    @BindView(2131297077)
    ListView mLocaleListView;
    @BindView(2131297591)
    CommonTitleBar mTitleBar;

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$a */
    class C5372a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImageView f10661a;

        /* renamed from: b */
        final /* synthetic */ Button f10662b;

        C5372a(LocaleSelectionLoginActivity localeSelectionLoginActivity, ImageView imageView, Button button) {
            this.f10661a = imageView;
            this.f10662b = button;
        }

        public void onClick(View view) {
            ImageView imageView = this.f10661a;
            imageView.setEnabled(!imageView.isEnabled());
            this.f10662b.setEnabled(this.f10661a.isEnabled());
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$b */
    class C5373b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f10663a;

        C5373b(LocaleSelectionLoginActivity localeSelectionLoginActivity, AlertDialog alertDialog) {
            this.f10663a = alertDialog;
        }

        public void onClick(View view) {
            this.f10663a.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$c */
    class C5374c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f10664a;

        /* renamed from: b */
        final /* synthetic */ AlertDialog f10665b;

        C5374c(int i, AlertDialog alertDialog) {
            this.f10664a = i;
            this.f10665b = alertDialog;
        }

        public void onClick(View view) {
            LocaleSelectionLoginActivity.this.m16421d0(this.f10664a);
            this.f10665b.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$d */
    class C5375d implements View.OnClickListener {
        C5375d() {
        }

        public void onClick(View view) {
            LocaleSelectionLoginActivity.this.onBackPressed();
            LocaleSelectionLoginActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$e */
    class C5376e implements View.OnClickListener {
        C5376e() {
        }

        public void onClick(View view) {
            if (!C3283v.m8836b("PRIVACY_GRANTED", false)) {
                C3283v.m8844j("PRIVACY_GRANTED", true);
            }
            LocaleSelectionLoginActivity.this.m16422e0();
            if (C3051a.m7928z()) {
                LocaleSelectionLoginActivity.this.m16427j0();
                return;
            }
            C3283v.m8846l("REFRESH_TOKEN_BASE_URL", AppUtils.f4987k);
            C3051a.m7925r().mo23352B(LocaleSelectionLoginActivity.this);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$f */
    class C5377f implements View.OnClickListener {
        C5377f() {
        }

        public void onClick(View view) {
            LocaleSelectionLoginActivity.this.m16424g0(!LocaleSelectionLoginActivity.this.f10658d.isEnabled());
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$g */
    class C5378g extends ClickableSpan {
        C5378g() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(LocaleSelectionLoginActivity.this, YeelightWebviewActivity.class);
            intent.putExtra("url_index", 22);
            intent.putExtra("server_index", ((C5384m) LocaleSelectionLoginActivity.f10654h.get(LocaleSelectionLoginActivity.this.f10655a)).mo30586b());
            LocaleSelectionLoginActivity.this.startActivity(intent);
        }

        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$h */
    class C5379h extends ClickableSpan {
        C5379h() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(LocaleSelectionLoginActivity.this, YeelightWebviewActivity.class);
            intent.putExtra("url_index", 23);
            intent.putExtra("server_index", ((C5384m) LocaleSelectionLoginActivity.f10654h.get(LocaleSelectionLoginActivity.this.f10655a)).mo30586b());
            LocaleSelectionLoginActivity.this.startActivity(intent);
        }

        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$i */
    class C5380i implements Runnable {
        C5380i() {
        }

        public void run() {
            LocaleSelectionLoginActivity localeSelectionLoginActivity = LocaleSelectionLoginActivity.this;
            localeSelectionLoginActivity.f10660f = new C9107b.C9109b(localeSelectionLoginActivity);
            LocaleSelectionLoginActivity.this.f10660f.mo37129c(25000);
            LocaleSelectionLoginActivity localeSelectionLoginActivity2 = LocaleSelectionLoginActivity.this;
            localeSelectionLoginActivity2.f10660f.mo37128b(0, localeSelectionLoginActivity2.getString(2131755044));
            LocaleSelectionLoginActivity.this.f10660f.mo37130d();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$j */
    class C5381j implements Runnable {
        C5381j() {
        }

        public void run() {
            LocaleSelectionLoginActivity localeSelectionLoginActivity = LocaleSelectionLoginActivity.this;
            C9107b.C9109b bVar = localeSelectionLoginActivity.f10660f;
            if (bVar == null) {
                localeSelectionLoginActivity.f10660f = new C9107b.C9109b(localeSelectionLoginActivity);
                LocaleSelectionLoginActivity localeSelectionLoginActivity2 = LocaleSelectionLoginActivity.this;
                localeSelectionLoginActivity2.f10660f.mo37128b(1, localeSelectionLoginActivity2.getString(2131755046));
                LocaleSelectionLoginActivity.this.f10660f.mo37130d();
                return;
            }
            bVar.mo37128b(1, localeSelectionLoginActivity.getString(2131755046));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$k */
    class C5382k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f10674a;

        C5382k(String str) {
            this.f10674a = str;
        }

        public void run() {
            if (!TextUtils.isEmpty(this.f10674a)) {
                LocaleSelectionLoginActivity localeSelectionLoginActivity = LocaleSelectionLoginActivity.this;
                Toast.makeText(localeSelectionLoginActivity, "LoginFailed: " + this.f10674a, 0).show();
            }
            LocaleSelectionLoginActivity localeSelectionLoginActivity2 = LocaleSelectionLoginActivity.this;
            C9107b.C9109b bVar = localeSelectionLoginActivity2.f10660f;
            if (bVar == null) {
                localeSelectionLoginActivity2.f10660f = new C9107b.C9109b(localeSelectionLoginActivity2);
                LocaleSelectionLoginActivity localeSelectionLoginActivity3 = LocaleSelectionLoginActivity.this;
                localeSelectionLoginActivity3.f10660f.mo37128b(2, localeSelectionLoginActivity3.getString(2131755043));
                LocaleSelectionLoginActivity.this.f10660f.mo37130d();
                return;
            }
            bVar.mo37128b(2, localeSelectionLoginActivity2.getString(2131755043));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$l */
    class C5383l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f10676a;

        C5383l(String str) {
            this.f10676a = str;
        }

        public void run() {
            LocaleSelectionLoginActivity localeSelectionLoginActivity = LocaleSelectionLoginActivity.this;
            Toast.makeText(localeSelectionLoginActivity, "UserInfoFailed: " + this.f10676a, 0).show();
            LocaleSelectionLoginActivity localeSelectionLoginActivity2 = LocaleSelectionLoginActivity.this;
            C9107b.C9109b bVar = localeSelectionLoginActivity2.f10660f;
            if (bVar == null) {
                localeSelectionLoginActivity2.f10660f = new C9107b.C9109b(localeSelectionLoginActivity2);
                LocaleSelectionLoginActivity localeSelectionLoginActivity3 = LocaleSelectionLoginActivity.this;
                localeSelectionLoginActivity3.f10660f.mo37128b(2, localeSelectionLoginActivity3.getString(2131755043));
                LocaleSelectionLoginActivity.this.f10660f.mo37130d();
                return;
            }
            bVar.mo37128b(2, localeSelectionLoginActivity2.getString(2131755043));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$m */
    public static class C5384m {

        /* renamed from: a */
        private String f10678a;

        /* renamed from: b */
        private String f10679b;

        /* renamed from: c */
        private boolean f10680c = false;

        C5384m(int i, String str, String str2) {
            this.f10678a = str;
            this.f10679b = str2;
        }

        /* renamed from: a */
        public String mo30585a() {
            return this.f10678a;
        }

        /* renamed from: b */
        public String mo30586b() {
            return this.f10679b;
        }

        /* renamed from: c */
        public boolean mo30587c() {
            return this.f10680c;
        }

        /* renamed from: d */
        public void mo30588d(String str) {
            this.f10678a = str;
        }

        /* renamed from: e */
        public void mo30589e(boolean z) {
            this.f10680c = z;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$n */
    private class C5385n extends BaseAdapter {

        /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$n$a */
        class C5386a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f10682a;

            C5386a(int i) {
                this.f10682a = i;
            }

            public void onClick(View view) {
                if (this.f10682a == LocaleSelectionLoginActivity.this.f10655a) {
                    return;
                }
                if (!((C5384m) LocaleSelectionLoginActivity.f10654h.get(this.f10682a)).mo30587c()) {
                    LocaleSelectionLoginActivity.this.m16425h0(this.f10682a);
                } else {
                    LocaleSelectionLoginActivity.this.m16421d0(this.f10682a);
                }
            }
        }

        private C5385n() {
        }

        /* synthetic */ C5385n(LocaleSelectionLoginActivity localeSelectionLoginActivity, C5375d dVar) {
            this();
        }

        public int getCount() {
            return LocaleSelectionLoginActivity.f10654h.size();
        }

        public Object getItem(int i) {
            return LocaleSelectionLoginActivity.f10654h.get(i);
        }

        public long getItemId(int i) {
            return 0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: android.text.SpannableStringBuilder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
            /*
                r6 = this;
                if (r8 != 0) goto L_0x0019
                com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$o r8 = new com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$o
                r8.<init>()
                com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity r9 = com.yeelight.cherry.p141ui.activity.LocaleSelectionLoginActivity.this
                android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
                r0 = 2131493165(0x7f0c012d, float:1.8609802E38)
                r1 = 0
                android.view.View r9 = r9.inflate(r0, r1)
                r9.setTag(r8)
                goto L_0x0022
            L_0x0019:
                java.lang.Object r9 = r8.getTag()
                com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$o r9 = (com.yeelight.cherry.p141ui.activity.LocaleSelectionLoginActivity.C5387o) r9
                r5 = r9
                r9 = r8
                r8 = r5
            L_0x0022:
                r0 = 2131297100(0x7f09034c, float:1.8212135E38)
                android.view.View r0 = r9.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r8.f10684a = r0
                r0 = 2131297099(0x7f09034b, float:1.8212133E38)
                android.view.View r0 = r9.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r8.f10685b = r0
                r0 = 2131296590(0x7f09014e, float:1.82111E38)
                android.view.View r0 = r9.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                java.util.ArrayList r0 = com.yeelight.cherry.p141ui.activity.LocaleSelectionLoginActivity.f10654h
                java.lang.Object r0 = r0.get(r7)
                com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$m r0 = (com.yeelight.cherry.p141ui.activity.LocaleSelectionLoginActivity.C5384m) r0
                boolean r0 = r0.mo30587c()
                if (r0 == 0) goto L_0x0081
                java.util.ArrayList r0 = com.yeelight.cherry.p141ui.activity.LocaleSelectionLoginActivity.f10654h
                java.lang.Object r0 = r0.get(r7)
                com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$m r0 = (com.yeelight.cherry.p141ui.activity.LocaleSelectionLoginActivity.C5384m) r0
                java.lang.String r0 = r0.mo30585a()
                android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
                r1.<init>(r0)
                android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
                r3 = -65536(0xffffffffffff0000, float:NaN)
                r2.<init>(r3)
                java.lang.String r3 = "("
                int r3 = r0.lastIndexOf(r3)
                java.lang.String r4 = ")"
                int r0 = r0.lastIndexOf(r4)
                int r0 = r0 + 1
                r4 = 34
                r1.setSpan(r2, r3, r0, r4)
                android.widget.TextView r0 = r8.f10684a
                goto L_0x0091
            L_0x0081:
                android.widget.TextView r0 = r8.f10684a
                java.util.ArrayList r1 = com.yeelight.cherry.p141ui.activity.LocaleSelectionLoginActivity.f10654h
                java.lang.Object r1 = r1.get(r7)
                com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$m r1 = (com.yeelight.cherry.p141ui.activity.LocaleSelectionLoginActivity.C5384m) r1
                java.lang.String r1 = r1.mo30585a()
            L_0x0091:
                r0.setText(r1)
                com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity r0 = com.yeelight.cherry.p141ui.activity.LocaleSelectionLoginActivity.this
                int r0 = r0.f10655a
                if (r7 != r0) goto L_0x00a0
                android.widget.ImageView r0 = r8.f10685b
                r1 = 0
                goto L_0x00a3
            L_0x00a0:
                android.widget.ImageView r0 = r8.f10685b
                r1 = 4
            L_0x00a3:
                r0.setVisibility(r1)
                android.widget.TextView r8 = r8.f10684a
                com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$n$a r0 = new com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$n$a
                r0.<init>(r7)
                r8.setOnClickListener(r0)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.activity.LocaleSelectionLoginActivity.C5385n.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$o */
    public static class C5387o {

        /* renamed from: a */
        public TextView f10684a;

        /* renamed from: b */
        public ImageView f10685b;
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public void m16421d0(int i) {
        AppConfiguration.Locale locale;
        if (i >= 0 && i <= AppConfiguration.Locale.values().length && (locale = AppConfiguration.Locale.values()[i]) != null) {
            this.f10655a = i;
            C8281l.m19542b().mo35226f(locale);
            this.f10656b.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public void m16422e0() {
        if (AppUtils.f4978b || !AppUtils.f4977a) {
            C3278f.m8796a(this, "Main");
            startService(new Intent(this, MiotPrivacyService.class));
        }
    }

    /* renamed from: f0 */
    private void m16423f0(TextView textView, String str, String str2, String str3) {
        int indexOf = str.indexOf(str2);
        int i = 0;
        if (indexOf == -1) {
            String str4 = f10653g;
            C3278f.m8797b(new AppUtils.SuicideException(str4, "Invalid start index 1. terms: " + str2));
            indexOf = 0;
        }
        int indexOf2 = str.indexOf(str3);
        if (indexOf2 == -1) {
            String str5 = f10653g;
            C3278f.m8797b(new AppUtils.SuicideException(str5, "Invalid start index 2. privacy: " + str3));
        } else {
            i = indexOf2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        C5378g gVar = new C5378g();
        C5379h hVar = new C5379h();
        spannableStringBuilder.setSpan(gVar, indexOf, str2.length() + indexOf, 34);
        spannableStringBuilder.setSpan(hVar, i, str3.length() + i, 34);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(2131099845)), indexOf, str2.length() + indexOf, 34);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(2131099845)), i, str3.length() + i, 34);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableStringBuilder);
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public void m16424g0(boolean z) {
        this.f10658d.setEnabled(z);
        this.f10659e.setEnabled(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public void m16425h0(int i) {
        View inflate = View.inflate(this, C12228R$layout.switch_locale_attation_layout, (ViewGroup) null);
        inflate.setLayerType(1, (Paint) null);
        AlertDialog create = new AlertDialog.Builder(this, 2131820942).create();
        ImageView imageView = (ImageView) inflate.findViewById(C12225R$id.items_and_conditions_agree);
        Button button = (Button) inflate.findViewById(C12225R$id.dialog_btn_continue);
        button.setEnabled(false);
        imageView.setEnabled(false);
        ((LinearLayout) inflate.findViewById(C12225R$id.items_and_conditions_layout)).setOnClickListener(new C5372a(this, imageView, button));
        ((Button) inflate.findViewById(C12225R$id.dialog_btn_reselect)).setOnClickListener(new C5373b(this, create));
        button.setOnClickListener(new C5374c(i, create));
        create.requestWindowFeature(1);
        create.setCancelable(false);
        create.show();
        create.setContentView(inflate);
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        WindowManager.LayoutParams attributes = create.getWindow().getAttributes();
        attributes.height = -2;
        double width = (double) defaultDisplay.getWidth();
        Double.isNaN(width);
        attributes.width = (int) (width * 0.78d);
        create.getWindow().setAttributes(attributes);
    }

    /* renamed from: i0 */
    private void m16426i0() {
        runOnUiThread(new C5380i());
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public void m16427j0() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(67108864);
        intent.putExtra("report_privacy", true);
        startActivity(intent);
    }

    /* renamed from: C */
    public void mo23255C(C3051a.C3062k kVar) {
    }

    /* renamed from: H */
    public void mo23262H() {
        if (!isFinishing()) {
            C3051a.m7925r().mo23352B(this);
        }
    }

    /* renamed from: d */
    public void mo23283d() {
        m16426i0();
    }

    /* renamed from: g */
    public void mo23288g() {
    }

    /* renamed from: h */
    public void mo23291h() {
        runOnUiThread(new C5381j());
        C3283v.m8846l("RECOMMEND_SERVER", C8281l.m19542b().mo35223a());
        m16427j0();
    }

    /* renamed from: l */
    public void mo23300l() {
    }

    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("locale_position", -1);
        setResult(-1, intent);
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        Button button;
        int i;
        super.onCreate(bundle);
        mo35653P();
        int i2 = 1;
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_select_locale_login);
        ButterKnife.bind((Activity) this);
        this.f10657c = (LinearLayout) findViewById(C12225R$id.items_and_conditions_layout);
        this.f10658d = (ImageView) findViewById(C12225R$id.items_and_conditions_image);
        this.f10659e = (Button) findViewById(C12225R$id.account_login);
        TextView textView = (TextView) findViewById(C12225R$id.terms_privacy_text);
        this.mTitleBar.mo36195a(getString(2131755120), new C5375d(), (View.OnClickListener) null);
        this.mTitleBar.setTitleTextSize(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.mTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        ArrayList<C5384m> arrayList = new ArrayList<>();
        f10654h = arrayList;
        arrayList.add(new C5384m(2131231817, getString(2131755114), "cn"));
        f10654h.add(new C5384m(2131231821, getString(2131755119), "sg"));
        f10654h.add(new C5384m(2131231816, getString(2131755121), "us"));
        f10654h.add(new C5384m(2131231818, getString(2131755116), "de"));
        f10654h.add(new C5384m(2131231820, getString(2131755118), "ru"));
        f10654h.add(new C5384m(2131231819, getString(2131755117), "in"));
        int i3 = 0;
        while (true) {
            if (i3 >= f10654h.size()) {
                break;
            } else if (f10654h.get(i3).mo30586b().equals(C3084o.m8096k().mo23460q())) {
                f10654h.get(i3).mo30588d(f10654h.get(i3).mo30585a() + " (" + getString(2131756243) + ")");
                f10654h.get(i3).mo30589e(true);
                break;
            } else {
                i3++;
            }
        }
        String a = C8281l.m19542b().mo35223a();
        if (a.equals(AppConfiguration.Locale.cn.name())) {
            this.f10655a = 0;
        } else {
            if (!a.equals(AppConfiguration.Locale.sg.name())) {
                if (a.equals(AppConfiguration.Locale.us.name())) {
                    i2 = 2;
                } else if (a.equals(AppConfiguration.Locale.de.name())) {
                    i2 = 3;
                } else if (a.equals(AppConfiguration.Locale.ru.name())) {
                    i2 = 4;
                } else if (a.equals(AppConfiguration.Locale.i2.name())) {
                    i2 = 5;
                } else {
                    this.f10655a = -1;
                }
            }
            this.f10655a = i2;
        }
        if (this.f10655a == -1) {
            if (TextUtils.isEmpty(C3084o.m8096k().mo23460q())) {
                AppConfiguration.Locale locale = AppConfiguration.Locale.values()[0];
                if (locale != null) {
                    this.f10655a = 0;
                    C8281l.m19542b().mo35226f(locale);
                }
            } else {
                int i4 = 0;
                while (true) {
                    if (i4 >= f10654h.size()) {
                        break;
                    } else if (f10654h.get(i4).mo30586b().equals(C3084o.m8096k().mo23460q())) {
                        AppConfiguration.Locale locale2 = AppConfiguration.Locale.values()[i4];
                        if (locale2 != null) {
                            this.f10655a = i4;
                            C8281l.m19542b().mo35226f(locale2);
                        }
                    } else {
                        i4++;
                    }
                }
            }
        }
        C5385n nVar = new C5385n(this, (C5375d) null);
        this.f10656b = nVar;
        this.mLocaleListView.setAdapter(nVar);
        m16423f0(textView, getString(2131756093), getString(2131756097), getString(2131756096));
        if (C3051a.m7928z()) {
            button = this.f10659e;
            i = 2131755113;
        } else {
            button = this.f10659e;
            i = 2131755265;
        }
        button.setText(i);
        this.f10659e.setOnClickListener(new C5376e());
        this.f10658d.setEnabled(false);
        this.f10659e.setEnabled(false);
        this.f10657c.setOnClickListener(new C5377f());
        C3051a.m7925r().mo23358M(this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C3051a.m7925r().mo23359N(this);
        C9107b.C9109b bVar = this.f10660f;
        if (!(bVar == null || bVar.mo37127a() == null)) {
            C9107b a = this.f10660f.mo37127a();
            if (a.isShowing()) {
                a.dismiss();
            }
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f10656b.notifyDataSetChanged();
    }

    /* renamed from: q */
    public void mo23308q(String str) {
        runOnUiThread(new C5382k(str));
    }

    /* renamed from: r */
    public void mo23310r(String str) {
        runOnUiThread(new C5383l(str));
    }
}
