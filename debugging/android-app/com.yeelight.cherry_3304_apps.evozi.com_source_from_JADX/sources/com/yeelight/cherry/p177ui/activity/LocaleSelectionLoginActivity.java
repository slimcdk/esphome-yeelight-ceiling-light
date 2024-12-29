package com.yeelight.cherry.p177ui.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
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
import butterknife.BindView;
import butterknife.ButterKnife;
import com.miot.common.config.AppConfiguration;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p152f.C4201a;
import com.yeelight.yeelib.p152f.C4230l;
import com.yeelight.yeelib.p152f.C4235o;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.activity.YeelightWebviewActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.widget.C10515b;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C10559w;
import com.yeelight.yeelib.utils.C4308b;
import com.yeelight.yeelib.utils.C4310h;
import java.util.ArrayList;

/* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity */
public class LocaleSelectionLoginActivity extends BaseActivity implements C4201a.C4202i {

    /* renamed from: h */
    private static final String f11086h = LocaleSelectionLoginActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static ArrayList<C5336m> f11087i;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f11088b = -1;

    /* renamed from: c */
    private C5337n f11089c;

    /* renamed from: d */
    private LinearLayout f11090d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ImageView f11091e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Button f11092f;

    /* renamed from: g */
    C10515b.C10517b f11093g = null;
    @BindView(2131296964)
    ListView mLocaleListView;
    @BindView(2131297424)
    CommonTitleBar mTitleBar;

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$a */
    class C5324a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImageView f11094a;

        /* renamed from: b */
        final /* synthetic */ Button f11095b;

        C5324a(LocaleSelectionLoginActivity localeSelectionLoginActivity, ImageView imageView, Button button) {
            this.f11094a = imageView;
            this.f11095b = button;
        }

        public void onClick(View view) {
            ImageView imageView = this.f11094a;
            imageView.setEnabled(!imageView.isEnabled());
            this.f11095b.setEnabled(this.f11094a.isEnabled());
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$b */
    class C5325b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f11096a;

        C5325b(LocaleSelectionLoginActivity localeSelectionLoginActivity, AlertDialog alertDialog) {
            this.f11096a = alertDialog;
        }

        public void onClick(View view) {
            this.f11096a.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$c */
    class C5326c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f11097a;

        /* renamed from: b */
        final /* synthetic */ AlertDialog f11098b;

        C5326c(int i, AlertDialog alertDialog) {
            this.f11097a = i;
            this.f11098b = alertDialog;
        }

        public void onClick(View view) {
            LocaleSelectionLoginActivity.this.m16481c0(this.f11097a);
            this.f11098b.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$d */
    class C5327d implements View.OnClickListener {
        C5327d() {
        }

        public void onClick(View view) {
            LocaleSelectionLoginActivity.this.onBackPressed();
            LocaleSelectionLoginActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$e */
    class C5328e extends ClickableSpan {
        C5328e() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(LocaleSelectionLoginActivity.this, YeelightWebviewActivity.class);
            intent.putExtra("url_index", 22);
            intent.putExtra("server_index", ((C5336m) LocaleSelectionLoginActivity.f11087i.get(LocaleSelectionLoginActivity.this.f11088b)).mo26563b());
            LocaleSelectionLoginActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$f */
    class C5329f extends ClickableSpan {
        C5329f() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(LocaleSelectionLoginActivity.this, YeelightWebviewActivity.class);
            intent.putExtra("url_index", 23);
            intent.putExtra("server_index", ((C5336m) LocaleSelectionLoginActivity.f11087i.get(LocaleSelectionLoginActivity.this.f11088b)).mo26563b());
            LocaleSelectionLoginActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$g */
    class C5330g implements View.OnClickListener {
        C5330g() {
        }

        public void onClick(View view) {
            if (C4201a.m11610z()) {
                LocaleSelectionLoginActivity.this.m16484f0();
                return;
            }
            C10559w.m25816l("REFRESH_TOKEN_BASE_URL", C4308b.f7490i);
            C4201a.m11607r().mo23438B(LocaleSelectionLoginActivity.this);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$h */
    class C5331h implements View.OnClickListener {
        C5331h() {
        }

        public void onClick(View view) {
            LocaleSelectionLoginActivity.this.f11091e.setEnabled(!LocaleSelectionLoginActivity.this.f11091e.isEnabled());
            if (LocaleSelectionLoginActivity.this.f11091e.isEnabled()) {
                LocaleSelectionLoginActivity.this.f11092f.setEnabled(true);
            } else {
                LocaleSelectionLoginActivity.this.f11092f.setEnabled(false);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$i */
    class C5332i implements Runnable {
        C5332i() {
        }

        public void run() {
            LocaleSelectionLoginActivity localeSelectionLoginActivity = LocaleSelectionLoginActivity.this;
            localeSelectionLoginActivity.f11093g = new C10515b.C10517b(localeSelectionLoginActivity);
            LocaleSelectionLoginActivity.this.f11093g.mo33282c(25000);
            LocaleSelectionLoginActivity localeSelectionLoginActivity2 = LocaleSelectionLoginActivity.this;
            localeSelectionLoginActivity2.f11093g.mo33281b(0, localeSelectionLoginActivity2.getString(2131755056));
            LocaleSelectionLoginActivity.this.f11093g.mo33283d();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$j */
    class C5333j implements Runnable {
        C5333j() {
        }

        public void run() {
            LocaleSelectionLoginActivity localeSelectionLoginActivity = LocaleSelectionLoginActivity.this;
            C10515b.C10517b bVar = localeSelectionLoginActivity.f11093g;
            if (bVar == null) {
                localeSelectionLoginActivity.f11093g = new C10515b.C10517b(localeSelectionLoginActivity);
                LocaleSelectionLoginActivity localeSelectionLoginActivity2 = LocaleSelectionLoginActivity.this;
                localeSelectionLoginActivity2.f11093g.mo33281b(1, localeSelectionLoginActivity2.getString(2131755058));
                LocaleSelectionLoginActivity.this.f11093g.mo33283d();
                return;
            }
            bVar.mo33281b(1, localeSelectionLoginActivity.getString(2131755058));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$k */
    class C5334k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f11107a;

        C5334k(String str) {
            this.f11107a = str;
        }

        public void run() {
            if (!TextUtils.isEmpty(this.f11107a)) {
                LocaleSelectionLoginActivity localeSelectionLoginActivity = LocaleSelectionLoginActivity.this;
                Toast.makeText(localeSelectionLoginActivity, "LoginFailed: " + this.f11107a, 0).show();
            }
            LocaleSelectionLoginActivity localeSelectionLoginActivity2 = LocaleSelectionLoginActivity.this;
            C10515b.C10517b bVar = localeSelectionLoginActivity2.f11093g;
            if (bVar == null) {
                localeSelectionLoginActivity2.f11093g = new C10515b.C10517b(localeSelectionLoginActivity2);
                LocaleSelectionLoginActivity localeSelectionLoginActivity3 = LocaleSelectionLoginActivity.this;
                localeSelectionLoginActivity3.f11093g.mo33281b(2, localeSelectionLoginActivity3.getString(2131755055));
                LocaleSelectionLoginActivity.this.f11093g.mo33283d();
                return;
            }
            bVar.mo33281b(2, localeSelectionLoginActivity2.getString(2131755055));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$l */
    class C5335l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f11109a;

        C5335l(String str) {
            this.f11109a = str;
        }

        public void run() {
            LocaleSelectionLoginActivity localeSelectionLoginActivity = LocaleSelectionLoginActivity.this;
            Toast.makeText(localeSelectionLoginActivity, "UserInfoFailed: " + this.f11109a, 0).show();
            LocaleSelectionLoginActivity localeSelectionLoginActivity2 = LocaleSelectionLoginActivity.this;
            C10515b.C10517b bVar = localeSelectionLoginActivity2.f11093g;
            if (bVar == null) {
                localeSelectionLoginActivity2.f11093g = new C10515b.C10517b(localeSelectionLoginActivity2);
                LocaleSelectionLoginActivity localeSelectionLoginActivity3 = LocaleSelectionLoginActivity.this;
                localeSelectionLoginActivity3.f11093g.mo33281b(2, localeSelectionLoginActivity3.getString(2131755055));
                LocaleSelectionLoginActivity.this.f11093g.mo33283d();
                return;
            }
            bVar.mo33281b(2, localeSelectionLoginActivity2.getString(2131755055));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$m */
    public static class C5336m {

        /* renamed from: a */
        private String f11111a;

        /* renamed from: b */
        private String f11112b;

        /* renamed from: c */
        private boolean f11113c = false;

        C5336m(int i, String str, String str2) {
            this.f11111a = str;
            this.f11112b = str2;
        }

        /* renamed from: a */
        public String mo26562a() {
            return this.f11111a;
        }

        /* renamed from: b */
        public String mo26563b() {
            return this.f11112b;
        }

        /* renamed from: c */
        public boolean mo26564c() {
            return this.f11113c;
        }

        /* renamed from: d */
        public void mo26565d(String str) {
            this.f11111a = str;
        }

        /* renamed from: e */
        public void mo26566e(boolean z) {
            this.f11113c = z;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$n */
    private class C5337n extends BaseAdapter {

        /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$n$a */
        class C5338a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f11115a;

            C5338a(int i) {
                this.f11115a = i;
            }

            public void onClick(View view) {
                if (this.f11115a == LocaleSelectionLoginActivity.this.f11088b) {
                    return;
                }
                if (!((C5336m) LocaleSelectionLoginActivity.f11087i.get(this.f11115a)).mo26564c()) {
                    LocaleSelectionLoginActivity.this.m16482d0(this.f11115a);
                } else {
                    LocaleSelectionLoginActivity.this.m16481c0(this.f11115a);
                }
            }
        }

        private C5337n() {
        }

        /* synthetic */ C5337n(LocaleSelectionLoginActivity localeSelectionLoginActivity, C5327d dVar) {
            this();
        }

        public int getCount() {
            return LocaleSelectionLoginActivity.f11087i.size();
        }

        public Object getItem(int i) {
            return LocaleSelectionLoginActivity.f11087i.get(i);
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
                com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity r9 = com.yeelight.cherry.p177ui.activity.LocaleSelectionLoginActivity.this
                android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
                r0 = 2131493161(0x7f0c0129, float:1.8609794E38)
                r1 = 0
                android.view.View r9 = r9.inflate(r0, r1)
                r9.setTag(r8)
                goto L_0x0022
            L_0x0019:
                java.lang.Object r9 = r8.getTag()
                com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$o r9 = (com.yeelight.cherry.p177ui.activity.LocaleSelectionLoginActivity.C5339o) r9
                r5 = r9
                r9 = r8
                r8 = r5
            L_0x0022:
                r0 = 2131296983(0x7f0902d7, float:1.8211898E38)
                android.view.View r0 = r9.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r8.f11117a = r0
                r0 = 2131296982(0x7f0902d6, float:1.8211896E38)
                android.view.View r0 = r9.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r8.f11118b = r0
                r0 = 2131296517(0x7f090105, float:1.8210953E38)
                android.view.View r0 = r9.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r8.f11119c = r0
                java.util.ArrayList r0 = com.yeelight.cherry.p177ui.activity.LocaleSelectionLoginActivity.f11087i
                java.lang.Object r0 = r0.get(r7)
                com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$m r0 = (com.yeelight.cherry.p177ui.activity.LocaleSelectionLoginActivity.C5336m) r0
                boolean r0 = r0.mo26564c()
                if (r0 == 0) goto L_0x0083
                java.util.ArrayList r0 = com.yeelight.cherry.p177ui.activity.LocaleSelectionLoginActivity.f11087i
                java.lang.Object r0 = r0.get(r7)
                com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$m r0 = (com.yeelight.cherry.p177ui.activity.LocaleSelectionLoginActivity.C5336m) r0
                java.lang.String r0 = r0.mo26562a()
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
                android.widget.TextView r0 = r8.f11117a
                goto L_0x0093
            L_0x0083:
                android.widget.TextView r0 = r8.f11117a
                java.util.ArrayList r1 = com.yeelight.cherry.p177ui.activity.LocaleSelectionLoginActivity.f11087i
                java.lang.Object r1 = r1.get(r7)
                com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$m r1 = (com.yeelight.cherry.p177ui.activity.LocaleSelectionLoginActivity.C5336m) r1
                java.lang.String r1 = r1.mo26562a()
            L_0x0093:
                r0.setText(r1)
                com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity r0 = com.yeelight.cherry.p177ui.activity.LocaleSelectionLoginActivity.this
                int r0 = r0.f11088b
                if (r7 != r0) goto L_0x00a2
                android.widget.ImageView r0 = r8.f11118b
                r1 = 0
                goto L_0x00a5
            L_0x00a2:
                android.widget.ImageView r0 = r8.f11118b
                r1 = 4
            L_0x00a5:
                r0.setVisibility(r1)
                android.widget.TextView r8 = r8.f11117a
                com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$n$a r0 = new com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$n$a
                r0.<init>(r7)
                r8.setOnClickListener(r0)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.activity.LocaleSelectionLoginActivity.C5337n.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity$o */
    public static class C5339o {

        /* renamed from: a */
        public TextView f11117a;

        /* renamed from: b */
        public ImageView f11118b;

        /* renamed from: c */
        public ImageView f11119c;
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public void m16481c0(int i) {
        AppConfiguration.Locale locale;
        if (i >= 0 && i <= AppConfiguration.Locale.values().length && (locale = AppConfiguration.Locale.values()[i]) != null) {
            this.f11088b = i;
            C4230l.m11766b().mo23555f(locale);
            this.f11089c.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public void m16482d0(int i) {
        View inflate = View.inflate(this, C11748R$layout.switch_locale_attation_layout, (ViewGroup) null);
        inflate.setLayerType(1, (Paint) null);
        AlertDialog create = new AlertDialog.Builder(this, 2131820937).create();
        ImageView imageView = (ImageView) inflate.findViewById(C11745R$id.items_and_conditions_agree);
        Button button = (Button) inflate.findViewById(C11745R$id.dialog_btn_continue);
        button.setEnabled(false);
        imageView.setEnabled(false);
        ((LinearLayout) inflate.findViewById(C11745R$id.items_and_conditions_layout)).setOnClickListener(new C5324a(this, imageView, button));
        ((Button) inflate.findViewById(C11745R$id.dialog_btn_reselect)).setOnClickListener(new C5325b(this, create));
        button.setOnClickListener(new C5326c(i, create));
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

    /* renamed from: e0 */
    private void m16483e0() {
        runOnUiThread(new C5332i());
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public void m16484f0() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(67108864);
        intent.putExtra("report_privacy", true);
        startActivity(intent);
    }

    /* renamed from: C */
    public void mo23456C(C4201a.C4212k kVar) {
    }

    /* renamed from: H */
    public void mo23457H() {
        if (!isFinishing()) {
            C4201a.m11607r().mo23438B(this);
        }
    }

    /* renamed from: d */
    public void mo23458d() {
        m16483e0();
    }

    /* renamed from: g */
    public void mo23459g() {
    }

    /* renamed from: i */
    public void mo23460i() {
        runOnUiThread(new C5333j());
        C10559w.m25816l("RECOMMEND_SERVER", C4230l.m11766b().mo23552a());
        m16484f0();
    }

    /* renamed from: l */
    public void mo23461l() {
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
        mo32193P();
        int i2 = 1;
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_select_locale_login);
        ButterKnife.bind((Activity) this);
        this.f11090d = (LinearLayout) findViewById(C11745R$id.items_and_conditions_layout);
        this.f11091e = (ImageView) findViewById(C11745R$id.items_and_conditions_image);
        this.f11092f = (Button) findViewById(C11745R$id.account_login);
        TextView textView = (TextView) findViewById(C11745R$id.terms_privacy_text);
        this.mTitleBar.mo32825a(getString(2131755121), new C5327d(), (View.OnClickListener) null);
        this.mTitleBar.setTitleTextSize(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.mTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        ArrayList<C5336m> arrayList = new ArrayList<>();
        f11087i = arrayList;
        arrayList.add(new C5336m(2131231795, getString(2131755115), "cn"));
        f11087i.add(new C5336m(2131231799, getString(2131755120), "sg"));
        f11087i.add(new C5336m(2131231794, getString(2131755122), "us"));
        f11087i.add(new C5336m(2131231796, getString(2131755117), "de"));
        f11087i.add(new C5336m(2131231798, getString(2131755119), "ru"));
        f11087i.add(new C5336m(2131231797, getString(2131755118), "in"));
        int i3 = 0;
        while (true) {
            if (i3 >= f11087i.size()) {
                break;
            } else if (f11087i.get(i3).mo26563b().equals(C4235o.m11786k().mo23567q())) {
                f11087i.get(i3).mo26565d(f11087i.get(i3).mo26562a() + " (" + getString(2131756218) + ")");
                f11087i.get(i3).mo26566e(true);
                break;
            } else {
                i3++;
            }
        }
        String a = C4230l.m11766b().mo23552a();
        if (a.equals(AppConfiguration.Locale.cn.name())) {
            this.f11088b = 0;
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
                    this.f11088b = -1;
                }
            }
            this.f11088b = i2;
        }
        if (this.f11088b == -1) {
            if (TextUtils.isEmpty(C4235o.m11786k().mo23567q())) {
                AppConfiguration.Locale locale = AppConfiguration.Locale.values()[0];
                if (locale != null) {
                    this.f11088b = 0;
                    C4230l.m11766b().mo23555f(locale);
                }
            } else {
                int i4 = 0;
                while (true) {
                    if (i4 >= f11087i.size()) {
                        break;
                    } else if (f11087i.get(i4).mo26563b().equals(C4235o.m11786k().mo23567q())) {
                        AppConfiguration.Locale locale2 = AppConfiguration.Locale.values()[i4];
                        if (locale2 != null) {
                            this.f11088b = i4;
                            C4230l.m11766b().mo23555f(locale2);
                        }
                    } else {
                        i4++;
                    }
                }
            }
        }
        C5337n nVar = new C5337n(this, (C5327d) null);
        this.f11089c = nVar;
        this.mLocaleListView.setAdapter(nVar);
        String string = getString(2131756074);
        String string2 = getString(2131756078);
        String string3 = getString(2131756077);
        int indexOf = string.indexOf(string2);
        if (indexOf == -1) {
            String str = f11086h;
            C4310h.m12146b(new C4308b.C4309a(str, "Invalid start index 1. terms: " + string2));
            indexOf = 0;
        }
        int indexOf2 = string.indexOf(string3);
        if (indexOf2 == -1) {
            String str2 = f11086h;
            C4310h.m12146b(new C4308b.C4309a(str2, "Invalid start index 2. privacy: " + string3));
            indexOf2 = 0;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        C5328e eVar = new C5328e();
        C5329f fVar = new C5329f();
        spannableStringBuilder.setSpan(eVar, indexOf, string2.length() + indexOf, 34);
        spannableStringBuilder.setSpan(fVar, indexOf2, string3.length() + indexOf2, 34);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(2131099842)), indexOf, string2.length() + indexOf, 34);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(2131099842)), indexOf2, string3.length() + indexOf2, 34);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableStringBuilder);
        if (C4201a.m11610z()) {
            button = this.f11092f;
            i = 2131755114;
        } else {
            button = this.f11092f;
            i = 2131755261;
        }
        button.setText(i);
        this.f11092f.setOnClickListener(new C5330g());
        this.f11091e.setEnabled(false);
        this.f11092f.setEnabled(false);
        this.f11090d.setOnClickListener(new C5331h());
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C10515b.C10517b bVar = this.f11093g;
        if (!(bVar == null || bVar.mo33280a() == null)) {
            C10515b a = this.f11093g.mo33280a();
            if (a.isShowing()) {
                a.dismiss();
            }
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f11089c.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C4201a.m11607r().mo23444M(this);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        C4201a.m11607r().mo23445N(this);
        super.onStop();
    }

    /* renamed from: q */
    public void mo23462q(String str) {
        runOnUiThread(new C5334k(str));
    }

    /* renamed from: r */
    public void mo23463r(String str) {
        runOnUiThread(new C5335l(str));
    }
}
