package com.yeelight.cherry.p177ui.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableStringBuilder;
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
import com.yeelight.yeelib.p152f.C9807q;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.activity.YeelightWebviewActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C10559w;
import com.yeelight.yeelib.utils.C4308b;
import com.yeelight.yeelib.utils.C4311i;
import java.util.ArrayList;

/* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionActivity */
public class LocaleSelectionActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static ArrayList<C5320k> f11055e;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f11056b = -1;

    /* renamed from: c */
    private C5321l f11057c;

    /* renamed from: d */
    private Handler f11058d = new C5313d();
    @BindView(2131296964)
    ListView mLocaleListView;
    @BindView(2131297424)
    CommonTitleBar mTitleBar;

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionActivity$a */
    class C5310a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f11059a;

        /* renamed from: b */
        final /* synthetic */ AlertDialog f11060b;

        C5310a(int i, AlertDialog alertDialog) {
            this.f11059a = i;
            this.f11060b = alertDialog;
        }

        public void onClick(View view) {
            LocaleSelectionActivity.this.m16466b0(this.f11059a);
            C9807q.m23812c().mo31678h(true);
            this.f11060b.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionActivity$b */
    class C5311b implements View.OnClickListener {
        C5311b() {
        }

        public void onClick(View view) {
            LocaleSelectionActivity.this.onBackPressed();
            LocaleSelectionActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionActivity$c */
    class C5312c implements View.OnClickListener {
        C5312c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(LocaleSelectionActivity.this, YeelightWebviewActivity.class);
            intent.putExtra("url_index", 21);
            LocaleSelectionActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionActivity$d */
    class C5313d extends Handler {
        C5313d() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0) {
                LocaleSelectionActivity localeSelectionActivity = LocaleSelectionActivity.this;
                Object obj = message.obj;
                Toast.makeText(localeSelectionActivity, localeSelectionActivity.getText(obj == AppConfiguration.Locale.cn ? 2131755150 : obj == AppConfiguration.Locale.sg ? 2131755154 : obj == AppConfiguration.Locale.us ? 2131755155 : obj == AppConfiguration.Locale.de ? 2131755151 : obj == AppConfiguration.Locale.ru ? 2131755153 : 2131755152), 0).show();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionActivity$e */
    class C5314e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImageView f11065a;

        /* renamed from: b */
        final /* synthetic */ Button f11066b;

        C5314e(LocaleSelectionActivity localeSelectionActivity, ImageView imageView, Button button) {
            this.f11065a = imageView;
            this.f11066b = button;
        }

        public void onClick(View view) {
            ImageView imageView = this.f11065a;
            imageView.setEnabled(!imageView.isEnabled());
            this.f11066b.setEnabled(this.f11065a.isEnabled());
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionActivity$f */
    class C5315f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f11067a;

        C5315f(LocaleSelectionActivity localeSelectionActivity, AlertDialog alertDialog) {
            this.f11067a = alertDialog;
        }

        public void onClick(View view) {
            this.f11067a.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionActivity$g */
    class C5316g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f11068a;

        /* renamed from: b */
        final /* synthetic */ AlertDialog f11069b;

        C5316g(int i, AlertDialog alertDialog) {
            this.f11068a = i;
            this.f11069b = alertDialog;
        }

        public void onClick(View view) {
            LocaleSelectionActivity.this.m16468d0(this.f11068a);
            this.f11069b.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionActivity$h */
    class C5317h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImageView f11071a;

        /* renamed from: b */
        final /* synthetic */ Button f11072b;

        C5317h(LocaleSelectionActivity localeSelectionActivity, ImageView imageView, Button button) {
            this.f11071a = imageView;
            this.f11072b = button;
        }

        public void onClick(View view) {
            ImageView imageView = this.f11071a;
            imageView.setEnabled(!imageView.isEnabled());
            this.f11072b.setEnabled(this.f11071a.isEnabled());
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionActivity$i */
    class C5318i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f11073a;

        C5318i(int i) {
            this.f11073a = i;
        }

        public void onClick(View view) {
            Intent intent = new Intent(LocaleSelectionActivity.this, YeelightWebviewActivity.class);
            intent.putExtra("url_index", 23);
            intent.putExtra("server_index", ((C5320k) LocaleSelectionActivity.f11055e.get(this.f11073a)).mo26541b());
            LocaleSelectionActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionActivity$j */
    class C5319j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f11075a;

        C5319j(LocaleSelectionActivity localeSelectionActivity, AlertDialog alertDialog) {
            this.f11075a = alertDialog;
        }

        public void onClick(View view) {
            this.f11075a.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionActivity$k */
    public static class C5320k {

        /* renamed from: a */
        private String f11076a;

        /* renamed from: b */
        private String f11077b;

        /* renamed from: c */
        private boolean f11078c = false;

        C5320k(int i, String str, String str2) {
            this.f11076a = str;
            this.f11077b = str2;
        }

        /* renamed from: a */
        public String mo26540a() {
            return this.f11076a;
        }

        /* renamed from: b */
        public String mo26541b() {
            return this.f11077b;
        }

        /* renamed from: c */
        public boolean mo26542c() {
            return this.f11078c;
        }

        /* renamed from: d */
        public void mo26543d(String str) {
            this.f11076a = str;
        }

        /* renamed from: e */
        public void mo26544e(boolean z) {
            this.f11078c = z;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionActivity$l */
    private class C5321l extends BaseAdapter {

        /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionActivity$l$a */
        class C5322a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f11080a;

            C5322a(int i) {
                this.f11080a = i;
            }

            public void onClick(View view) {
                if (this.f11080a == LocaleSelectionActivity.this.f11056b) {
                    return;
                }
                if (!((C5320k) LocaleSelectionActivity.f11055e.get(this.f11080a)).mo26542c()) {
                    LocaleSelectionActivity.this.m16467c0(this.f11080a);
                } else {
                    LocaleSelectionActivity.this.m16466b0(this.f11080a);
                }
            }
        }

        private C5321l() {
        }

        /* synthetic */ C5321l(LocaleSelectionActivity localeSelectionActivity, C5311b bVar) {
            this();
        }

        public int getCount() {
            return LocaleSelectionActivity.f11055e.size();
        }

        public Object getItem(int i) {
            return LocaleSelectionActivity.f11055e.get(i);
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
                com.yeelight.cherry.ui.activity.LocaleSelectionActivity$m r8 = new com.yeelight.cherry.ui.activity.LocaleSelectionActivity$m
                r8.<init>()
                com.yeelight.cherry.ui.activity.LocaleSelectionActivity r9 = com.yeelight.cherry.p177ui.activity.LocaleSelectionActivity.this
                android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
                r0 = 2131493161(0x7f0c0129, float:1.8609794E38)
                r1 = 0
                android.view.View r9 = r9.inflate(r0, r1)
                r9.setTag(r8)
                goto L_0x0022
            L_0x0019:
                java.lang.Object r9 = r8.getTag()
                com.yeelight.cherry.ui.activity.LocaleSelectionActivity$m r9 = (com.yeelight.cherry.p177ui.activity.LocaleSelectionActivity.C5323m) r9
                r5 = r9
                r9 = r8
                r8 = r5
            L_0x0022:
                r0 = 2131296983(0x7f0902d7, float:1.8211898E38)
                android.view.View r0 = r9.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r8.f11082a = r0
                r0 = 2131296982(0x7f0902d6, float:1.8211896E38)
                android.view.View r0 = r9.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r8.f11083b = r0
                r0 = 2131296517(0x7f090105, float:1.8210953E38)
                android.view.View r0 = r9.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r8.f11084c = r0
                java.util.ArrayList r0 = com.yeelight.cherry.p177ui.activity.LocaleSelectionActivity.f11055e
                java.lang.Object r0 = r0.get(r7)
                com.yeelight.cherry.ui.activity.LocaleSelectionActivity$k r0 = (com.yeelight.cherry.p177ui.activity.LocaleSelectionActivity.C5320k) r0
                boolean r0 = r0.mo26542c()
                if (r0 == 0) goto L_0x0083
                java.util.ArrayList r0 = com.yeelight.cherry.p177ui.activity.LocaleSelectionActivity.f11055e
                java.lang.Object r0 = r0.get(r7)
                com.yeelight.cherry.ui.activity.LocaleSelectionActivity$k r0 = (com.yeelight.cherry.p177ui.activity.LocaleSelectionActivity.C5320k) r0
                java.lang.String r0 = r0.mo26540a()
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
                android.widget.TextView r0 = r8.f11082a
                goto L_0x0093
            L_0x0083:
                android.widget.TextView r0 = r8.f11082a
                java.util.ArrayList r1 = com.yeelight.cherry.p177ui.activity.LocaleSelectionActivity.f11055e
                java.lang.Object r1 = r1.get(r7)
                com.yeelight.cherry.ui.activity.LocaleSelectionActivity$k r1 = (com.yeelight.cherry.p177ui.activity.LocaleSelectionActivity.C5320k) r1
                java.lang.String r1 = r1.mo26540a()
            L_0x0093:
                r0.setText(r1)
                com.yeelight.cherry.ui.activity.LocaleSelectionActivity r0 = com.yeelight.cherry.p177ui.activity.LocaleSelectionActivity.this
                int r0 = r0.f11056b
                if (r7 != r0) goto L_0x00a2
                android.widget.ImageView r0 = r8.f11083b
                r1 = 0
                goto L_0x00a6
            L_0x00a2:
                android.widget.ImageView r0 = r8.f11083b
                r1 = 8
            L_0x00a6:
                r0.setVisibility(r1)
                android.widget.TextView r8 = r8.f11082a
                com.yeelight.cherry.ui.activity.LocaleSelectionActivity$l$a r0 = new com.yeelight.cherry.ui.activity.LocaleSelectionActivity$l$a
                r0.<init>(r7)
                r8.setOnClickListener(r0)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.activity.LocaleSelectionActivity.C5321l.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionActivity$m */
    public static class C5323m {

        /* renamed from: a */
        public TextView f11082a;

        /* renamed from: b */
        public ImageView f11083b;

        /* renamed from: c */
        public ImageView f11084c;
    }

    static {
        Class<LocaleSelectionActivity> cls = LocaleSelectionActivity.class;
    }

    /* renamed from: a0 */
    private void m16465a0() {
        if (C4201a.m11610z()) {
            Intent intent = new Intent();
            intent.setClass(this, MainActivity.class);
            intent.setFlags(67108864);
            startActivity(intent);
            return;
        }
        setResult(-1);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m16466b0(int i) {
        if (i >= 0 && i <= AppConfiguration.Locale.values().length) {
            AppConfiguration.Locale locale = AppConfiguration.Locale.values()[i];
            if (locale != null) {
                this.f11056b = i;
                C4230l.m11766b().mo23555f(locale);
                C10559w.m25816l("RECOMMEND_SERVER", C4230l.m11766b().mo23552a());
                Message message = new Message();
                message.what = 0;
                message.obj = locale;
                this.f11058d.sendMessageDelayed(message, 500);
                this.f11057c.notifyDataSetChanged();
                if (!C4308b.f7482a) {
                    C4311i.m12152c(locale.name());
                }
            }
            m16465a0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public void m16467c0(int i) {
        View inflate = View.inflate(this, C11748R$layout.switch_locale_attation_layout, (ViewGroup) null);
        inflate.setLayerType(1, (Paint) null);
        AlertDialog create = new AlertDialog.Builder(this, 2131820937).create();
        ImageView imageView = (ImageView) inflate.findViewById(C11745R$id.items_and_conditions_agree);
        Button button = (Button) inflate.findViewById(C11745R$id.dialog_btn_reselect);
        Button button2 = (Button) inflate.findViewById(C11745R$id.dialog_btn_continue);
        button2.setEnabled(false);
        imageView.setEnabled(false);
        button.setText(2131755229);
        ((LinearLayout) inflate.findViewById(C11745R$id.items_and_conditions_layout)).setOnClickListener(new C5314e(this, imageView, button2));
        button.setOnClickListener(new C5315f(this, create));
        button2.setOnClickListener(new C5316g(i, create));
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

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public void m16468d0(int i) {
        View inflate = View.inflate(this, C11748R$layout.switch_locale_confirm_dialog_layout, (ViewGroup) null);
        inflate.setLayerType(1, (Paint) null);
        AlertDialog create = new AlertDialog.Builder(this, 2131820937).create();
        ImageView imageView = (ImageView) inflate.findViewById(C11745R$id.items_and_conditions_agree);
        TextView textView = (TextView) inflate.findViewById(C11745R$id.text_view_privacy);
        Button button = (Button) inflate.findViewById(C11745R$id.dialog_btn_reselect);
        Button button2 = (Button) inflate.findViewById(C11745R$id.dialog_btn_continue);
        button2.setEnabled(false);
        imageView.setEnabled(false);
        button.setText(2131755146);
        String string = getString(2131756076);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(2131099842)), string.indexOf(getString(2131756077)), string.length(), 34);
        textView.setText(spannableStringBuilder);
        ((LinearLayout) inflate.findViewById(C11745R$id.items_and_conditions_layout)).setOnClickListener(new C5317h(this, imageView, button2));
        textView.setOnClickListener(new C5318i(i));
        button.setOnClickListener(new C5319j(this, create));
        button2.setOnClickListener(new C5310a(i, create));
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

    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("locale_position", -1);
        setResult(-1, intent);
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_select_locale_new);
        ButterKnife.bind((Activity) this);
        this.mTitleBar.mo32825a(getString(2131755121), new C5311b(), (View.OnClickListener) null);
        this.mTitleBar.setTitleTextSize(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.mTitleBar.setLayoutParams(layoutParams);
        int i2 = 0;
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        String a = C4230l.m11766b().mo23552a();
        if (a.equals(AppConfiguration.Locale.cn.name())) {
            this.f11056b = 0;
        } else if (a.equals(AppConfiguration.Locale.sg.name())) {
            this.f11056b = 1;
        } else {
            if (a.equals(AppConfiguration.Locale.us.name())) {
                i = 2;
            } else if (a.equals(AppConfiguration.Locale.de.name())) {
                i = 3;
            } else if (a.equals(AppConfiguration.Locale.ru.name())) {
                i = 4;
            } else if (a.equals(AppConfiguration.Locale.i2.name())) {
                i = 5;
            } else {
                this.f11056b = -1;
            }
            this.f11056b = i;
        }
        ArrayList<C5320k> arrayList = new ArrayList<>();
        f11055e = arrayList;
        arrayList.add(new C5320k(2131231795, getString(2131755115), "cn"));
        f11055e.add(new C5320k(2131231799, getString(2131755120), "sg"));
        f11055e.add(new C5320k(2131231794, getString(2131755122), "us"));
        f11055e.add(new C5320k(2131231796, getString(2131755117), "de"));
        f11055e.add(new C5320k(2131231798, getString(2131755119), "ru"));
        f11055e.add(new C5320k(2131231797, getString(2131755118), "in"));
        while (true) {
            if (i2 >= f11055e.size()) {
                break;
            } else if (f11055e.get(i2).mo26541b().equals(C4235o.m11786k().mo23567q())) {
                f11055e.get(i2).mo26543d(f11055e.get(i2).mo26540a() + " (" + getString(2131756218) + ")");
                f11055e.get(i2).mo26544e(true);
                break;
            } else {
                i2++;
            }
        }
        C5321l lVar = new C5321l(this, (C5311b) null);
        this.f11057c = lVar;
        this.mLocaleListView.setAdapter(lVar);
        findViewById(2131297056).setOnClickListener(new C5312c());
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }
}
