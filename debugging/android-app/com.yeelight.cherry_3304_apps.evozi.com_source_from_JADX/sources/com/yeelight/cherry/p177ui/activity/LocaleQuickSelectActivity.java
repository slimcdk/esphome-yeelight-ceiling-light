package com.yeelight.cherry.p177ui.activity;

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
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p152f.C4230l;
import com.yeelight.yeelib.p152f.C4235o;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.widget.C10521d;
import java.util.ArrayList;

/* renamed from: com.yeelight.cherry.ui.activity.LocaleQuickSelectActivity */
public class LocaleQuickSelectActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static ArrayList<C5306c> f11042c;

    /* renamed from: b */
    private C5307d f11043b;

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleQuickSelectActivity$a */
    class C5304a implements C10521d.C10525c {
        C5304a() {
        }

        public void afterDismissCallBack() {
        }

        public void beforeDismissCallBack() {
            LocaleQuickSelectActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleQuickSelectActivity$b */
    class C5305b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10521d f11045a;

        C5305b(LocaleQuickSelectActivity localeQuickSelectActivity, C10521d dVar) {
            this.f11045a = dVar;
        }

        public void onClick(View view) {
            this.f11045a.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleQuickSelectActivity$c */
    public static class C5306c {

        /* renamed from: a */
        private int f11046a;

        /* renamed from: b */
        private String f11047b;

        /* renamed from: c */
        private String f11048c;

        C5306c(int i, String str, String str2) {
            this.f11046a = i;
            this.f11047b = str;
            this.f11048c = str2;
        }

        /* renamed from: a */
        public String mo26521a() {
            return this.f11047b;
        }

        /* renamed from: b */
        public int mo26522b() {
            return this.f11046a;
        }

        /* renamed from: c */
        public String mo26523c() {
            return this.f11048c;
        }

        /* renamed from: d */
        public void mo26524d(String str) {
            this.f11047b = str;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleQuickSelectActivity$d */
    private class C5307d extends BaseAdapter {

        /* renamed from: com.yeelight.cherry.ui.activity.LocaleQuickSelectActivity$d$a */
        class C5308a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f11050a;

            C5308a(int i) {
                this.f11050a = i;
            }

            public void onClick(View view) {
                LocaleQuickSelectActivity.this.m16455X(this.f11050a);
                Intent intent = new Intent();
                intent.putExtra("locale_position", this.f11050a);
                LocaleQuickSelectActivity.this.setResult(-1, intent);
                LocaleQuickSelectActivity.this.finish();
            }
        }

        private C5307d() {
        }

        /* synthetic */ C5307d(LocaleQuickSelectActivity localeQuickSelectActivity, C5304a aVar) {
            this();
        }

        public int getCount() {
            return LocaleQuickSelectActivity.f11042c.size();
        }

        public Object getItem(int i) {
            return LocaleQuickSelectActivity.f11042c.get(i);
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C5309e eVar;
            if (view == null) {
                eVar = new C5309e();
                view2 = LayoutInflater.from(LocaleQuickSelectActivity.this).inflate(C11748R$layout.locale_candidate_layout_new, (ViewGroup) null);
                view2.setTag(eVar);
            } else {
                view2 = view;
                eVar = (C5309e) view.getTag();
            }
            eVar.f11052a = (TextView) view2.findViewById(C11745R$id.locale_value);
            eVar.f11053b = (ImageView) view2.findViewById(C11745R$id.locale_checked);
            ImageView imageView = (ImageView) view2.findViewById(C11745R$id.county_img_view);
            eVar.f11054c = imageView;
            imageView.setImageResource(((C5306c) LocaleQuickSelectActivity.f11042c.get(i)).mo26522b());
            eVar.f11052a.setText(((C5306c) LocaleQuickSelectActivity.f11042c.get(i)).mo26521a());
            view2.setOnClickListener(new C5308a(i));
            return view2;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LocaleQuickSelectActivity$e */
    public static class C5309e {

        /* renamed from: a */
        public TextView f11052a;

        /* renamed from: b */
        public ImageView f11053b;

        /* renamed from: c */
        public ImageView f11054c;
    }

    static {
        Class<LocaleQuickSelectActivity> cls = LocaleQuickSelectActivity.class;
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public void m16455X(int i) {
        AppConfiguration.Locale locale;
        if (i >= 0 && i <= AppConfiguration.Locale.values().length && (locale = AppConfiguration.Locale.values()[i]) != null) {
            C4230l.m11766b().mo23555f(locale);
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 2130771988);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        setContentView(2131493035);
        ArrayList<C5306c> arrayList = new ArrayList<>();
        f11042c = arrayList;
        arrayList.add(new C5306c(2131231795, getString(2131755115), "cn"));
        f11042c.add(new C5306c(2131231799, getString(2131755120), "sg"));
        f11042c.add(new C5306c(2131231794, getString(2131755122), "us"));
        f11042c.add(new C5306c(2131231796, getString(2131755117), "de"));
        f11042c.add(new C5306c(2131231798, getString(2131755119), "ru"));
        int i = 0;
        while (true) {
            if (i >= f11042c.size()) {
                break;
            } else if (f11042c.get(i).mo26523c().equals(C4235o.m11786k().mo23567q())) {
                f11042c.get(i).mo26524d(f11042c.get(i).mo26521a() + " (" + getString(2131756218) + ")");
                break;
            } else {
                i++;
            }
        }
        View inflate = View.inflate(this, 2131493162, (ViewGroup) null);
        if (inflate != null) {
            C10521d a = new C10521d.C10523b(this).mo33316a();
            a.mo33307d(new C5304a());
            ((TextView) inflate.findViewById(2131296452)).setOnClickListener(new C5305b(this, a));
            C5307d dVar = new C5307d(this, (C5304a) null);
            this.f11043b = dVar;
            ((ListView) inflate.findViewById(2131296964)).setAdapter(dVar);
            a.mo33309e(inflate);
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
