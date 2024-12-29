package com.yeelight.cherry.p141ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.miot.common.config.AppConfiguration;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.managers.C3084o;
import com.yeelight.yeelib.managers.C8281l;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.widget.C8891a;
import java.util.ArrayList;

/* renamed from: com.yeelight.cherry.ui.activity.LocaleQuickSelectActivity */
public class LocaleQuickSelectActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static ArrayList<C5354c> f10610b;

    /* renamed from: a */
    private C5355d f10611a;

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleQuickSelectActivity$a */
    class C5352a implements C8891a.C8895c {
        C5352a() {
        }

        public void afterDismissCallBack() {
        }

        public void beforeDismissCallBack() {
            LocaleQuickSelectActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleQuickSelectActivity$b */
    class C5353b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8891a f10613a;

        C5353b(LocaleQuickSelectActivity localeQuickSelectActivity, C8891a aVar) {
            this.f10613a = aVar;
        }

        public void onClick(View view) {
            this.f10613a.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleQuickSelectActivity$c */
    public static class C5354c {

        /* renamed from: a */
        private int f10614a;

        /* renamed from: b */
        private String f10615b;

        /* renamed from: c */
        private String f10616c;

        C5354c(int i, String str, String str2) {
            this.f10614a = i;
            this.f10615b = str;
            this.f10616c = str2;
        }

        /* renamed from: a */
        public String mo30542a() {
            return this.f10615b;
        }

        /* renamed from: b */
        public int mo30543b() {
            return this.f10614a;
        }

        /* renamed from: c */
        public String mo30544c() {
            return this.f10616c;
        }

        /* renamed from: d */
        public void mo30545d(String str) {
            this.f10615b = str;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleQuickSelectActivity$d */
    private class C5355d extends BaseAdapter {

        /* renamed from: com.yeelight.cherry.ui.activity.LocaleQuickSelectActivity$d$a */
        class C5356a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f10618a;

            C5356a(int i) {
                this.f10618a = i;
            }

            public void onClick(View view) {
                LocaleQuickSelectActivity.this.m16394X(this.f10618a);
                Intent intent = new Intent();
                intent.putExtra("locale_position", this.f10618a);
                LocaleQuickSelectActivity.this.setResult(-1, intent);
                LocaleQuickSelectActivity.this.finish();
            }
        }

        private C5355d() {
        }

        /* synthetic */ C5355d(LocaleQuickSelectActivity localeQuickSelectActivity, C5352a aVar) {
            this();
        }

        public int getCount() {
            return LocaleQuickSelectActivity.f10610b.size();
        }

        public Object getItem(int i) {
            return LocaleQuickSelectActivity.f10610b.get(i);
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C5357e eVar;
            if (view == null) {
                eVar = new C5357e();
                view2 = LayoutInflater.from(LocaleQuickSelectActivity.this).inflate(C12228R$layout.locale_candidate_layout_new, (ViewGroup) null);
                view2.setTag(eVar);
            } else {
                view2 = view;
                eVar = (C5357e) view.getTag();
            }
            eVar.f10620a = (TextView) view2.findViewById(C12225R$id.locale_value);
            ImageView imageView = (ImageView) view2.findViewById(C12225R$id.locale_checked);
            ImageView imageView2 = (ImageView) view2.findViewById(C12225R$id.county_img_view);
            eVar.f10621b = imageView2;
            imageView2.setImageResource(((C5354c) LocaleQuickSelectActivity.f10610b.get(i)).mo30543b());
            eVar.f10620a.setText(((C5354c) LocaleQuickSelectActivity.f10610b.get(i)).mo30542a());
            view2.setOnClickListener(new C5356a(i));
            return view2;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleQuickSelectActivity$e */
    public static class C5357e {

        /* renamed from: a */
        public TextView f10620a;

        /* renamed from: b */
        public ImageView f10621b;
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public void m16394X(int i) {
        AppConfiguration.Locale locale;
        if (i >= 0 && i <= AppConfiguration.Locale.values().length && (locale = AppConfiguration.Locale.values()[i]) != null) {
            C8281l.m19542b().mo35226f(locale);
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 2130772000);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        setContentView(2131493037);
        ArrayList<C5354c> arrayList = new ArrayList<>();
        f10610b = arrayList;
        arrayList.add(new C5354c(2131231817, getString(2131755114), "cn"));
        f10610b.add(new C5354c(2131231821, getString(2131755119), "sg"));
        f10610b.add(new C5354c(2131231816, getString(2131755121), "us"));
        f10610b.add(new C5354c(2131231818, getString(2131755116), "de"));
        f10610b.add(new C5354c(2131231820, getString(2131755118), "ru"));
        int i = 0;
        while (true) {
            if (i >= f10610b.size()) {
                break;
            } else if (f10610b.get(i).mo30544c().equals(C3084o.m8096k().mo23460q())) {
                f10610b.get(i).mo30545d(f10610b.get(i).mo30542a() + " (" + getString(2131756243) + ")");
                break;
            } else {
                i++;
            }
        }
        View inflate = View.inflate(this, 2131493166, (ViewGroup) null);
        if (inflate != null) {
            C8891a a = new C8891a.C8893b(this).mo36655a();
            a.mo36646d(new C5352a());
            ((TextView) inflate.findViewById(2131296513)).setOnClickListener(new C5353b(this, a));
            C5355d dVar = new C5355d(this, (C5352a) null);
            this.f10611a = dVar;
            ((ListView) inflate.findViewById(2131297077)).setAdapter(dVar);
            a.mo36648e(inflate);
            a.show();
            return;
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        finish();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }
}
