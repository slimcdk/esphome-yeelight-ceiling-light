package com.yeelight.cherry.p177ui.activity;

import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.HorizontalListView;
import com.yeelight.yeelib.p194ui.widget.C10521d;
import com.yeelight.yeelib.utils.C10533a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yeelight.cherry.ui.activity.LightShareApplicationActivity */
public class LightShareApplicationActivity extends BaseActivity {

    /* renamed from: b */
    private LinkedHashMap<C5301d, Boolean> f11023b = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<C5301d> f11024c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C10521d f11025d;

    /* renamed from: e */
    private C5301d f11026e;

    /* renamed from: f */
    private C5301d f11027f;

    /* renamed from: g */
    private C5301d f11028g;

    /* renamed from: h */
    private C5301d f11029h;

    /* renamed from: i */
    private C5301d f11030i;

    /* renamed from: j */
    private C5301d f11031j;

    /* renamed from: k */
    private C5301d f11032k;

    /* renamed from: com.yeelight.cherry.ui.activity.LightShareApplicationActivity$a */
    class C5298a implements View.OnClickListener {
        C5298a() {
        }

        public void onClick(View view) {
            LightShareApplicationActivity.this.f11025d.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LightShareApplicationActivity$b */
    class C5299b implements DialogInterface.OnDismissListener {
        C5299b() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            LightShareApplicationActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LightShareApplicationActivity$c */
    class C5300c implements AdapterView.OnItemClickListener {
        C5300c() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            LightShareApplicationActivity lightShareApplicationActivity = LightShareApplicationActivity.this;
            lightShareApplicationActivity.mo26508X(lightShareApplicationActivity.getPackageManager(), ((C5301d) LightShareApplicationActivity.this.f11024c.get(i)).mo26513b(), view.getContext());
            LightShareApplicationActivity.this.f11025d.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LightShareApplicationActivity$d */
    class C5301d {

        /* renamed from: a */
        private String f11036a;

        /* renamed from: b */
        private int f11037b;

        /* renamed from: c */
        private String f11038c;

        C5301d(LightShareApplicationActivity lightShareApplicationActivity, String str, int i, String str2) {
            this.f11036a = str;
            this.f11037b = i;
            this.f11038c = str2;
        }

        /* renamed from: a */
        public String mo26512a() {
            return this.f11038c;
        }

        /* renamed from: b */
        public String mo26513b() {
            return this.f11036a;
        }

        /* renamed from: c */
        public int mo26514c() {
            return this.f11037b;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LightShareApplicationActivity$e */
    private class C5302e extends BaseAdapter {
        private C5302e() {
        }

        /* synthetic */ C5302e(LightShareApplicationActivity lightShareApplicationActivity, C5298a aVar) {
            this();
        }

        public int getCount() {
            return LightShareApplicationActivity.this.f11024c.size();
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C5303f fVar;
            if (view == null) {
                fVar = new C5303f(LightShareApplicationActivity.this, (C5298a) null);
                view2 = LayoutInflater.from(LightShareApplicationActivity.this).inflate(C11748R$layout.item_share_app_info, (ViewGroup) null);
                view2.setTag(fVar);
            } else {
                view2 = view;
                fVar = (C5303f) view.getTag();
            }
            fVar.f11040a = (ImageView) view2.findViewById(C11745R$id.app_icon);
            fVar.f11041b = (TextView) view2.findViewById(C11745R$id.app_name);
            fVar.f11040a.setImageResource(((C5301d) LightShareApplicationActivity.this.f11024c.get(i)).mo26514c());
            fVar.f11041b.setText(((C5301d) LightShareApplicationActivity.this.f11024c.get(i)).mo26512a());
            return view2;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LightShareApplicationActivity$f */
    private class C5303f {

        /* renamed from: a */
        public ImageView f11040a;

        /* renamed from: b */
        public TextView f11041b;

        private C5303f(LightShareApplicationActivity lightShareApplicationActivity) {
        }

        /* synthetic */ C5303f(LightShareApplicationActivity lightShareApplicationActivity, C5298a aVar) {
            this(lightShareApplicationActivity);
        }
    }

    /* renamed from: Y */
    private void m16447Y() {
        LinkedHashMap<C5301d, Boolean> linkedHashMap;
        C5301d dVar;
        List<String> a = C10533a.m25656a(getPackageManager());
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).equals("com.tencent.mm")) {
                linkedHashMap = this.f11023b;
                dVar = this.f11026e;
            } else if (a.get(i).equals("com.sina.weibo")) {
                linkedHashMap = this.f11023b;
                dVar = this.f11027f;
            } else if (a.get(i).equals("com.tencent.mobileqq")) {
                linkedHashMap = this.f11023b;
                dVar = this.f11028g;
            } else if (a.get(i).equals("com.facebook.katana")) {
                linkedHashMap = this.f11023b;
                dVar = this.f11029h;
            } else if (a.get(i).equals("com.twitter.android")) {
                linkedHashMap = this.f11023b;
                dVar = this.f11030i;
            } else if (a.get(i).equals("com.whatsapp")) {
                linkedHashMap = this.f11023b;
                dVar = this.f11031j;
            } else if (a.get(i).equals("com.android.mms")) {
                linkedHashMap = this.f11023b;
                dVar = this.f11032k;
            }
            linkedHashMap.put(dVar, Boolean.TRUE);
        }
    }

    /* renamed from: Z */
    private void m16448Z() {
        for (Map.Entry next : this.f11023b.entrySet()) {
            if (((Boolean) next.getValue()).booleanValue()) {
                this.f11024c.add(next.getKey());
            }
        }
    }

    /* renamed from: X */
    public void mo26508X(PackageManager packageManager, String str, Context context) {
        PackageInfo packageInfo;
        try {
            packageInfo = packageManager.getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            packageInfo = null;
        }
        if (packageInfo != null) {
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setPackage(packageInfo.packageName);
            ResolveInfo next = packageManager.queryIntentActivities(intent, 0).iterator().next();
            if (next != null) {
                ActivityInfo activityInfo = next.activityInfo;
                String str2 = activityInfo.packageName;
                String str3 = activityInfo.name;
                Intent intent2 = new Intent("android.intent.action.MAIN");
                intent2.addCategory("android.intent.category.LAUNCHER");
                intent2.addFlags(268435456);
                intent2.setComponent(new ComponentName(str2, str3));
                context.startActivity(intent2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        setContentView(C11748R$layout.activity_light_share_application);
        this.f11023b = new LinkedHashMap<>();
        this.f11024c = new ArrayList();
        this.f11026e = new C5301d(this, "com.tencent.mm", 2131231173, getString(2131755531));
        this.f11027f = new C5301d(this, "com.sina.weibo", 2131231172, getString(2131755532));
        this.f11028g = new C5301d(this, "com.tencent.mobileqq", 2131231170, getString(2131755528));
        this.f11029h = new C5301d(this, "com.facebook.katana", 2131231168, getString(2131755527));
        this.f11030i = new C5301d(this, "com.twitter.android", 2131231171, getString(2131755530));
        this.f11031j = new C5301d(this, "com.whatsapp", 2131231174, getString(2131755533));
        this.f11032k = new C5301d(this, "com.android.mms", 2131231169, getString(2131755529));
        this.f11023b.put(this.f11026e, Boolean.FALSE);
        this.f11023b.put(this.f11027f, Boolean.FALSE);
        this.f11023b.put(this.f11028g, Boolean.FALSE);
        this.f11023b.put(this.f11029h, Boolean.FALSE);
        this.f11023b.put(this.f11030i, Boolean.FALSE);
        this.f11023b.put(this.f11031j, Boolean.FALSE);
        this.f11023b.put(this.f11032k, Boolean.FALSE);
        m16447Y();
        m16448Z();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        getIntent();
        View inflate = View.inflate(this, C11748R$layout.light_share_application_layout, (ViewGroup) null);
        inflate.setLayerType(1, (Paint) null);
        this.f11025d = new C10521d.C10523b(this).mo33316a();
        inflate.findViewById(C11745R$id.cancel_view).setOnClickListener(new C5298a());
        this.f11025d.setOnDismissListener(new C5299b());
        HorizontalListView horizontalListView = (HorizontalListView) inflate.findViewById(C11745R$id.app_list);
        horizontalListView.setAdapter((ListAdapter) new C5302e(this, (C5298a) null));
        horizontalListView.setOnItemClickListener(new C5300c());
        this.f11025d.mo33309e(inflate);
        this.f11025d.show();
    }
}
