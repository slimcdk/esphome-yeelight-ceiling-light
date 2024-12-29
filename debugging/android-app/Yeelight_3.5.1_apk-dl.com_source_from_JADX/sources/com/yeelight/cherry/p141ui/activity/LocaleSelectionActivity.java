package com.yeelight.cherry.p141ui.activity;

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
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.managers.C3084o;
import com.yeelight.yeelib.managers.C8281l;
import com.yeelight.yeelib.managers.C8287q;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.activity.YeelightWebviewActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import p051j4.C3278f;
import p051j4.C3279g;
import p051j4.C3283v;
import p051j4.C9193k;

/* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionActivity */
public class LocaleSelectionActivity extends BaseActivity {

    /* renamed from: d */
    private static final String f10622d = "LocaleSelectionActivity";
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static ArrayList<C5368k> f10623e;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f10624a = -1;

    /* renamed from: b */
    private C5369l f10625b;

    /* renamed from: c */
    private Handler f10626c = new C5361d();
    @BindView(2131297077)
    ListView mLocaleListView;
    @BindView(2131297591)
    CommonTitleBar mTitleBar;

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionActivity$a */
    class C5358a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f10627a;

        /* renamed from: b */
        final /* synthetic */ AlertDialog f10628b;

        C5358a(int i, AlertDialog alertDialog) {
            this.f10627a = i;
            this.f10628b = alertDialog;
        }

        public void onClick(View view) {
            LocaleSelectionActivity.this.m16405b0(this.f10627a);
            C8287q.m19593e().mo35245l(true);
            this.f10628b.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionActivity$b */
    class C5359b implements View.OnClickListener {
        C5359b() {
        }

        public void onClick(View view) {
            LocaleSelectionActivity.this.onBackPressed();
            LocaleSelectionActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionActivity$c */
    class C5360c implements View.OnClickListener {
        C5360c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(LocaleSelectionActivity.this, YeelightWebviewActivity.class);
            intent.putExtra("url_index", 21);
            LocaleSelectionActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionActivity$d */
    class C5361d extends Handler {
        C5361d() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0) {
                LocaleSelectionActivity localeSelectionActivity = LocaleSelectionActivity.this;
                Object obj = message.obj;
                Toast.makeText(localeSelectionActivity, localeSelectionActivity.getText(obj == AppConfiguration.Locale.cn ? 2131755151 : obj == AppConfiguration.Locale.sg ? 2131755155 : obj == AppConfiguration.Locale.us ? 2131755156 : obj == AppConfiguration.Locale.de ? 2131755152 : obj == AppConfiguration.Locale.ru ? 2131755154 : 2131755153), 0).show();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionActivity$e */
    class C5362e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImageView f10633a;

        /* renamed from: b */
        final /* synthetic */ Button f10634b;

        C5362e(LocaleSelectionActivity localeSelectionActivity, ImageView imageView, Button button) {
            this.f10633a = imageView;
            this.f10634b = button;
        }

        public void onClick(View view) {
            ImageView imageView = this.f10633a;
            imageView.setEnabled(!imageView.isEnabled());
            this.f10634b.setEnabled(this.f10633a.isEnabled());
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionActivity$f */
    class C5363f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f10635a;

        C5363f(LocaleSelectionActivity localeSelectionActivity, AlertDialog alertDialog) {
            this.f10635a = alertDialog;
        }

        public void onClick(View view) {
            this.f10635a.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionActivity$g */
    class C5364g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f10636a;

        /* renamed from: b */
        final /* synthetic */ AlertDialog f10637b;

        C5364g(int i, AlertDialog alertDialog) {
            this.f10636a = i;
            this.f10637b = alertDialog;
        }

        public void onClick(View view) {
            LocaleSelectionActivity.this.m16407d0(this.f10636a);
            this.f10637b.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionActivity$h */
    class C5365h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImageView f10639a;

        /* renamed from: b */
        final /* synthetic */ Button f10640b;

        C5365h(LocaleSelectionActivity localeSelectionActivity, ImageView imageView, Button button) {
            this.f10639a = imageView;
            this.f10640b = button;
        }

        public void onClick(View view) {
            ImageView imageView = this.f10639a;
            imageView.setEnabled(!imageView.isEnabled());
            this.f10640b.setEnabled(this.f10639a.isEnabled());
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionActivity$i */
    class C5366i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f10641a;

        C5366i(int i) {
            this.f10641a = i;
        }

        public void onClick(View view) {
            Intent intent = new Intent(LocaleSelectionActivity.this, YeelightWebviewActivity.class);
            intent.putExtra("url_index", 23);
            intent.putExtra("server_index", ((C5368k) LocaleSelectionActivity.f10623e.get(this.f10641a)).mo30562b());
            LocaleSelectionActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionActivity$j */
    class C5367j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f10643a;

        C5367j(LocaleSelectionActivity localeSelectionActivity, AlertDialog alertDialog) {
            this.f10643a = alertDialog;
        }

        public void onClick(View view) {
            this.f10643a.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionActivity$k */
    public static class C5368k {

        /* renamed from: a */
        private String f10644a;

        /* renamed from: b */
        private String f10645b;

        /* renamed from: c */
        private boolean f10646c = false;

        C5368k(int i, String str, String str2) {
            this.f10644a = str;
            this.f10645b = str2;
        }

        /* renamed from: a */
        public String mo30561a() {
            return this.f10644a;
        }

        /* renamed from: b */
        public String mo30562b() {
            return this.f10645b;
        }

        /* renamed from: c */
        public boolean mo30563c() {
            return this.f10646c;
        }

        /* renamed from: d */
        public void mo30564d(String str) {
            this.f10644a = str;
        }

        /* renamed from: e */
        public void mo30565e(boolean z) {
            this.f10646c = z;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionActivity$l */
    private class C5369l extends BaseAdapter {

        /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionActivity$l$a */
        class C5370a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f10648a;

            C5370a(int i) {
                this.f10648a = i;
            }

            public void onClick(View view) {
                if (this.f10648a == LocaleSelectionActivity.this.f10624a) {
                    return;
                }
                if (!((C5368k) LocaleSelectionActivity.f10623e.get(this.f10648a)).mo30563c()) {
                    LocaleSelectionActivity.this.m16406c0(this.f10648a);
                } else {
                    LocaleSelectionActivity.this.m16405b0(this.f10648a);
                }
            }
        }

        private C5369l() {
        }

        /* synthetic */ C5369l(LocaleSelectionActivity localeSelectionActivity, C5359b bVar) {
            this();
        }

        public int getCount() {
            return LocaleSelectionActivity.f10623e.size();
        }

        public Object getItem(int i) {
            return LocaleSelectionActivity.f10623e.get(i);
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
                com.yeelight.cherry.ui.activity.LocaleSelectionActivity r9 = com.yeelight.cherry.p141ui.activity.LocaleSelectionActivity.this
                android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
                r0 = 2131493165(0x7f0c012d, float:1.8609802E38)
                r1 = 0
                android.view.View r9 = r9.inflate(r0, r1)
                r9.setTag(r8)
                goto L_0x0022
            L_0x0019:
                java.lang.Object r9 = r8.getTag()
                com.yeelight.cherry.ui.activity.LocaleSelectionActivity$m r9 = (com.yeelight.cherry.p141ui.activity.LocaleSelectionActivity.C5371m) r9
                r5 = r9
                r9 = r8
                r8 = r5
            L_0x0022:
                r0 = 2131297100(0x7f09034c, float:1.8212135E38)
                android.view.View r0 = r9.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r8.f10650a = r0
                r0 = 2131297099(0x7f09034b, float:1.8212133E38)
                android.view.View r0 = r9.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r8.f10651b = r0
                r0 = 2131296590(0x7f09014e, float:1.82111E38)
                android.view.View r0 = r9.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                java.util.ArrayList r0 = com.yeelight.cherry.p141ui.activity.LocaleSelectionActivity.f10623e
                java.lang.Object r0 = r0.get(r7)
                com.yeelight.cherry.ui.activity.LocaleSelectionActivity$k r0 = (com.yeelight.cherry.p141ui.activity.LocaleSelectionActivity.C5368k) r0
                boolean r0 = r0.mo30563c()
                if (r0 == 0) goto L_0x0081
                java.util.ArrayList r0 = com.yeelight.cherry.p141ui.activity.LocaleSelectionActivity.f10623e
                java.lang.Object r0 = r0.get(r7)
                com.yeelight.cherry.ui.activity.LocaleSelectionActivity$k r0 = (com.yeelight.cherry.p141ui.activity.LocaleSelectionActivity.C5368k) r0
                java.lang.String r0 = r0.mo30561a()
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
                android.widget.TextView r0 = r8.f10650a
                goto L_0x0091
            L_0x0081:
                android.widget.TextView r0 = r8.f10650a
                java.util.ArrayList r1 = com.yeelight.cherry.p141ui.activity.LocaleSelectionActivity.f10623e
                java.lang.Object r1 = r1.get(r7)
                com.yeelight.cherry.ui.activity.LocaleSelectionActivity$k r1 = (com.yeelight.cherry.p141ui.activity.LocaleSelectionActivity.C5368k) r1
                java.lang.String r1 = r1.mo30561a()
            L_0x0091:
                r0.setText(r1)
                com.yeelight.cherry.ui.activity.LocaleSelectionActivity r0 = com.yeelight.cherry.p141ui.activity.LocaleSelectionActivity.this
                int r0 = r0.f10624a
                if (r7 != r0) goto L_0x00a0
                android.widget.ImageView r0 = r8.f10651b
                r1 = 0
                goto L_0x00a4
            L_0x00a0:
                android.widget.ImageView r0 = r8.f10651b
                r1 = 8
            L_0x00a4:
                r0.setVisibility(r1)
                android.widget.TextView r8 = r8.f10650a
                com.yeelight.cherry.ui.activity.LocaleSelectionActivity$l$a r0 = new com.yeelight.cherry.ui.activity.LocaleSelectionActivity$l$a
                r0.<init>(r7)
                r8.setOnClickListener(r0)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.activity.LocaleSelectionActivity.C5369l.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionActivity$m */
    public static class C5371m {

        /* renamed from: a */
        public TextView f10650a;

        /* renamed from: b */
        public ImageView f10651b;
    }

    /* renamed from: a0 */
    private void m16404a0() {
        if (C3051a.m7928z()) {
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
    public void m16405b0(int i) {
        if (i >= 0 && i <= AppConfiguration.Locale.values().length) {
            AppConfiguration.Locale locale = AppConfiguration.Locale.values()[i];
            if (locale != null) {
                this.f10624a = i;
                C8281l.m19542b().mo35226f(locale);
                C3283v.m8846l("RECOMMEND_SERVER", C8281l.m19542b().mo35223a());
                Message message = new Message();
                message.what = 0;
                message.obj = locale;
                this.f10626c.sendMessageDelayed(message, 500);
                this.f10625b.notifyDataSetChanged();
                if (!AppUtils.f4977a) {
                    C3279g.m8803c(locale.name());
                }
            }
            m16404a0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public void m16406c0(int i) {
        View inflate = View.inflate(this, C12228R$layout.switch_locale_attation_layout, (ViewGroup) null);
        inflate.setLayerType(1, (Paint) null);
        AlertDialog create = new AlertDialog.Builder(this, 2131820942).create();
        ImageView imageView = (ImageView) inflate.findViewById(C12225R$id.items_and_conditions_agree);
        Button button = (Button) inflate.findViewById(C12225R$id.dialog_btn_reselect);
        Button button2 = (Button) inflate.findViewById(C12225R$id.dialog_btn_continue);
        button2.setEnabled(false);
        imageView.setEnabled(false);
        button.setText(2131755232);
        ((LinearLayout) inflate.findViewById(C12225R$id.items_and_conditions_layout)).setOnClickListener(new C5362e(this, imageView, button2));
        button.setOnClickListener(new C5363f(this, create));
        button2.setOnClickListener(new C5364g(i, create));
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
    public void m16407d0(int i) {
        int i2 = i;
        View inflate = View.inflate(this, C12228R$layout.switch_locale_confirm_dialog_layout, (ViewGroup) null);
        inflate.setLayerType(1, (Paint) null);
        AlertDialog create = new AlertDialog.Builder(this, 2131820942).create();
        ImageView imageView = (ImageView) inflate.findViewById(C12225R$id.items_and_conditions_agree);
        TextView textView = (TextView) inflate.findViewById(C12225R$id.text_view_privacy);
        Button button = (Button) inflate.findViewById(C12225R$id.dialog_btn_reselect);
        Button button2 = (Button) inflate.findViewById(C12225R$id.dialog_btn_continue);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C12225R$id.items_and_conditions_layout);
        button2.setEnabled(false);
        imageView.setEnabled(false);
        button.setText(2131755147);
        String string = getString(2131756095);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int indexOf = string.indexOf(getString(2131756096));
        if (indexOf < 0) {
            C3278f.m8797b(new AppUtils.SuicideException(f10622d, "Invalid start index -1"));
            indexOf = 0;
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(2131099845)), indexOf, string.length(), 34);
        textView.setText(spannableStringBuilder);
        linearLayout.setOnClickListener(new C5365h(this, imageView, button2));
        textView.setOnClickListener(new C5366i(i2));
        button.setOnClickListener(new C5367j(this, create));
        button2.setOnClickListener(new C5358a(i2, create));
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
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_select_locale_new);
        ButterKnife.bind((Activity) this);
        this.mTitleBar.mo36195a(getString(2131755120), new C5359b(), (View.OnClickListener) null);
        this.mTitleBar.setTitleTextSize(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.mTitleBar.setLayoutParams(layoutParams);
        int i2 = 0;
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        String a = C8281l.m19542b().mo35223a();
        if (a.equals(AppConfiguration.Locale.cn.name())) {
            this.f10624a = 0;
        } else if (a.equals(AppConfiguration.Locale.sg.name())) {
            this.f10624a = 1;
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
                this.f10624a = -1;
            }
            this.f10624a = i;
        }
        ArrayList<C5368k> arrayList = new ArrayList<>();
        f10623e = arrayList;
        arrayList.add(new C5368k(2131231817, getString(2131755114), "cn"));
        f10623e.add(new C5368k(2131231821, getString(2131755119), "sg"));
        f10623e.add(new C5368k(2131231816, getString(2131755121), "us"));
        f10623e.add(new C5368k(2131231818, getString(2131755116), "de"));
        f10623e.add(new C5368k(2131231820, getString(2131755118), "ru"));
        f10623e.add(new C5368k(2131231819, getString(2131755117), "in"));
        while (true) {
            if (i2 >= f10623e.size()) {
                break;
            } else if (f10623e.get(i2).mo30562b().equals(C3084o.m8096k().mo23460q())) {
                f10623e.get(i2).mo30564d(f10623e.get(i2).mo30561a() + " (" + getString(2131756243) + ")");
                f10623e.get(i2).mo30565e(true);
                break;
            } else {
                i2++;
            }
        }
        C5369l lVar = new C5369l(this, (C5359b) null);
        this.f10625b = lVar;
        this.mLocaleListView.setAdapter(lVar);
        findViewById(2131297180).setOnClickListener(new C5360c());
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }
}
