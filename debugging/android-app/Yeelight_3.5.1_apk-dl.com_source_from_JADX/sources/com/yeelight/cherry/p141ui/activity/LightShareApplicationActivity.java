package com.yeelight.cherry.p141ui.activity;

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
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.HorizontalListView;
import com.yeelight.yeelib.p142ui.widget.C8891a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p051j4.C9182a;

/* renamed from: com.yeelight.cherry.ui.activity.LightShareApplicationActivity */
public class LightShareApplicationActivity extends BaseActivity {

    /* renamed from: a */
    private LinkedHashMap<C5349d, Boolean> f10591a = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<C5349d> f10592b = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C8891a f10593c;

    /* renamed from: d */
    private C5349d f10594d;

    /* renamed from: e */
    private C5349d f10595e;

    /* renamed from: f */
    private C5349d f10596f;

    /* renamed from: g */
    private C5349d f10597g;

    /* renamed from: h */
    private C5349d f10598h;

    /* renamed from: i */
    private C5349d f10599i;

    /* renamed from: j */
    private C5349d f10600j;

    /* renamed from: com.yeelight.cherry.ui.activity.LightShareApplicationActivity$a */
    class C5346a implements View.OnClickListener {
        C5346a() {
        }

        public void onClick(View view) {
            LightShareApplicationActivity.this.f10593c.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LightShareApplicationActivity$b */
    class C5347b implements DialogInterface.OnDismissListener {
        C5347b() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            LightShareApplicationActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LightShareApplicationActivity$c */
    class C5348c implements AdapterView.OnItemClickListener {
        C5348c() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            LightShareApplicationActivity lightShareApplicationActivity = LightShareApplicationActivity.this;
            lightShareApplicationActivity.mo30529X(lightShareApplicationActivity.getPackageManager(), ((C5349d) LightShareApplicationActivity.this.f10592b.get(i)).mo30534b(), view.getContext());
            LightShareApplicationActivity.this.f10593c.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LightShareApplicationActivity$d */
    class C5349d {

        /* renamed from: a */
        private String f10604a;

        /* renamed from: b */
        private int f10605b;

        /* renamed from: c */
        private String f10606c;

        C5349d(LightShareApplicationActivity lightShareApplicationActivity, String str, int i, String str2) {
            this.f10604a = str;
            this.f10605b = i;
            this.f10606c = str2;
        }

        /* renamed from: a */
        public String mo30533a() {
            return this.f10606c;
        }

        /* renamed from: b */
        public String mo30534b() {
            return this.f10604a;
        }

        /* renamed from: c */
        public int mo30535c() {
            return this.f10605b;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LightShareApplicationActivity$e */
    private class C5350e extends BaseAdapter {
        private C5350e() {
        }

        /* synthetic */ C5350e(LightShareApplicationActivity lightShareApplicationActivity, C5346a aVar) {
            this();
        }

        public int getCount() {
            return LightShareApplicationActivity.this.f10592b.size();
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C5351f fVar;
            if (view == null) {
                fVar = new C5351f(LightShareApplicationActivity.this, (C5346a) null);
                view2 = LayoutInflater.from(LightShareApplicationActivity.this).inflate(C12228R$layout.item_share_app_info, (ViewGroup) null);
                view2.setTag(fVar);
            } else {
                view2 = view;
                fVar = (C5351f) view.getTag();
            }
            fVar.f10608a = (ImageView) view2.findViewById(C12225R$id.app_icon);
            fVar.f10609b = (TextView) view2.findViewById(C12225R$id.app_name);
            fVar.f10608a.setImageResource(((C5349d) LightShareApplicationActivity.this.f10592b.get(i)).mo30535c());
            fVar.f10609b.setText(((C5349d) LightShareApplicationActivity.this.f10592b.get(i)).mo30533a());
            return view2;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LightShareApplicationActivity$f */
    private class C5351f {

        /* renamed from: a */
        public ImageView f10608a;

        /* renamed from: b */
        public TextView f10609b;

        private C5351f(LightShareApplicationActivity lightShareApplicationActivity) {
        }

        /* synthetic */ C5351f(LightShareApplicationActivity lightShareApplicationActivity, C5346a aVar) {
            this(lightShareApplicationActivity);
        }
    }

    /* renamed from: Y */
    private void m16386Y() {
        LinkedHashMap<C5349d, Boolean> linkedHashMap;
        C5349d dVar;
        List<String> a = C9182a.m22075a(getPackageManager());
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).equals("com.tencent.mm")) {
                linkedHashMap = this.f10591a;
                dVar = this.f10594d;
            } else if (a.get(i).equals("com.sina.weibo")) {
                linkedHashMap = this.f10591a;
                dVar = this.f10595e;
            } else if (a.get(i).equals("com.tencent.mobileqq")) {
                linkedHashMap = this.f10591a;
                dVar = this.f10596f;
            } else if (a.get(i).equals("com.facebook.katana")) {
                linkedHashMap = this.f10591a;
                dVar = this.f10597g;
            } else if (a.get(i).equals("com.twitter.android")) {
                linkedHashMap = this.f10591a;
                dVar = this.f10598h;
            } else if (a.get(i).equals("com.whatsapp")) {
                linkedHashMap = this.f10591a;
                dVar = this.f10599i;
            } else if (a.get(i).equals("com.android.mms")) {
                linkedHashMap = this.f10591a;
                dVar = this.f10600j;
            }
            linkedHashMap.put(dVar, Boolean.TRUE);
        }
    }

    /* renamed from: Z */
    private void m16387Z() {
        for (Map.Entry next : this.f10591a.entrySet()) {
            if (((Boolean) next.getValue()).booleanValue()) {
                this.f10592b.add((C5349d) next.getKey());
            }
        }
    }

    /* renamed from: X */
    public void mo30529X(PackageManager packageManager, String str, Context context) {
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
        mo35653P();
        setContentView(C12228R$layout.activity_light_share_application);
        this.f10591a = new LinkedHashMap<>();
        this.f10592b = new ArrayList();
        this.f10594d = new C5349d(this, "com.tencent.mm", 2131231187, getString(2131755535));
        this.f10595e = new C5349d(this, "com.sina.weibo", 2131231186, getString(2131755536));
        this.f10596f = new C5349d(this, "com.tencent.mobileqq", 2131231184, getString(2131755532));
        this.f10597g = new C5349d(this, "com.facebook.katana", 2131231182, getString(2131755531));
        this.f10598h = new C5349d(this, "com.twitter.android", 2131231185, getString(2131755534));
        this.f10599i = new C5349d(this, "com.whatsapp", 2131231188, getString(2131755537));
        this.f10600j = new C5349d(this, "com.android.mms", 2131231183, getString(2131755533));
        LinkedHashMap<C5349d, Boolean> linkedHashMap = this.f10591a;
        C5349d dVar = this.f10594d;
        Boolean bool = Boolean.FALSE;
        linkedHashMap.put(dVar, bool);
        this.f10591a.put(this.f10595e, bool);
        this.f10591a.put(this.f10596f, bool);
        this.f10591a.put(this.f10597g, bool);
        this.f10591a.put(this.f10598h, bool);
        this.f10591a.put(this.f10599i, bool);
        this.f10591a.put(this.f10600j, bool);
        m16386Y();
        m16387Z();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        getIntent();
        View inflate = View.inflate(this, C12228R$layout.light_share_application_layout, (ViewGroup) null);
        inflate.setLayerType(1, (Paint) null);
        this.f10593c = new C8891a.C8893b(this).mo36655a();
        inflate.findViewById(C12225R$id.cancel_view).setOnClickListener(new C5346a());
        this.f10593c.setOnDismissListener(new C5347b());
        HorizontalListView horizontalListView = (HorizontalListView) inflate.findViewById(C12225R$id.app_list);
        horizontalListView.setAdapter((ListAdapter) new C5350e(this, (C5346a) null));
        horizontalListView.setOnItemClickListener(new C5348c());
        this.f10593c.mo36648e(inflate);
        this.f10593c.show();
    }
}
