package com.yeelight.cherry.p177ui.activity;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p174b.p175a.C4958a;
import com.yeelight.cherry.p174b.p175a.C4959b;
import com.yeelight.cherry.p177ui.adapter.CreateSceneSelectDeviceAdapter;
import com.yeelight.yeelib.p152f.C9812t;
import com.yeelight.yeelib.p153g.C9832c0;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C10549p;
import com.yeelight.yeelib.utils.C4308b;
import java.util.List;
import java.util.Set;

/* renamed from: com.yeelight.cherry.ui.activity.CreateSceneSelectDeviceActivity */
public class CreateSceneSelectDeviceActivity extends AppCompatActivity implements CreateSceneSelectDeviceAdapter.C5809e {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static String f10633k = CreateSceneSelectDeviceActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public CreateSceneSelectDeviceAdapter f10634a;

    /* renamed from: b */
    private RecyclerView f10635b;

    /* renamed from: c */
    private AppBarLayout f10636c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ImageView f10637d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public TextView f10638e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public TextView f10639f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public TextView f10640g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f10641h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C9832c0 f10642i;

    /* renamed from: j */
    private Button f10643j;

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneSelectDeviceActivity$a */
    class C5131a implements View.OnClickListener {
        C5131a() {
        }

        public void onClick(View view) {
            CreateSceneSelectDeviceActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneSelectDeviceActivity$b */
    class C5132b implements View.OnClickListener {
        C5132b() {
        }

        public void onClick(View view) {
            CreateSceneSelectDeviceActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneSelectDeviceActivity$c */
    class C5133c implements AppBarLayout.OnOffsetChangedListener {

        /* renamed from: a */
        final /* synthetic */ int f10646a;

        /* renamed from: b */
        final /* synthetic */ int f10647b;

        /* renamed from: c */
        final /* synthetic */ int f10648c;

        C5133c(int i, int i2, int i3) {
            this.f10646a = i;
            this.f10647b = i2;
            this.f10648c = i3;
        }

        public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            int i2 = -i;
            float f = (float) i2;
            CreateSceneSelectDeviceActivity.this.f10637d.setTranslationY(0.8f * f);
            float f2 = 0.09f * f;
            CreateSceneSelectDeviceActivity.this.f10638e.setTranslationY(f2);
            CreateSceneSelectDeviceActivity.this.f10639f.setTranslationY(f2);
            float f3 = (f * 1.0f) / ((float) this.f10646a);
            String unused = CreateSceneSelectDeviceActivity.f10633k;
            "fraction = " + f3 + ", verticalOffset = " + i;
            float f4 = -f3;
            CreateSceneSelectDeviceActivity.this.f10637d.setTranslationX(((float) (CreateSceneSelectDeviceActivity.this.f10637d.getLeft() - this.f10647b)) * f4);
            CreateSceneSelectDeviceActivity.this.f10638e.setTranslationX(((float) (CreateSceneSelectDeviceActivity.this.f10638e.getLeft() - this.f10648c)) * f4);
            CreateSceneSelectDeviceActivity.this.f10639f.setTranslationX(f4 * ((float) (CreateSceneSelectDeviceActivity.this.f10639f.getLeft() - this.f10648c)));
            if (this.f10646a >= i2 && i != 0) {
                CreateSceneSelectDeviceActivity.this.f10634a.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneSelectDeviceActivity$d */
    class C5134d implements View.OnClickListener {
        C5134d() {
        }

        public void onClick(View view) {
            TextView T;
            String string;
            try {
                boolean unused = CreateSceneSelectDeviceActivity.this.f10641h = !CreateSceneSelectDeviceActivity.this.f10641h;
                for (C4959b next : CreateSceneSelectDeviceActivity.this.f10634a.mo27151x()) {
                    List<C4958a> c = next.mo26048c();
                    if (CreateSceneSelectDeviceActivity.this.f10641h) {
                        next.mo26051f(true);
                        for (C4958a next2 : c) {
                            next2.mo26044c(true);
                            CreateSceneSelectDeviceActivity.this.f10634a.mo27147t(next2);
                        }
                    } else {
                        next.mo26051f(false);
                        CreateSceneSelectDeviceActivity.this.f10634a.mo27148u();
                        for (C4958a c2 : c) {
                            c2.mo26044c(false);
                        }
                    }
                }
                CreateSceneSelectDeviceActivity.this.f10634a.notifyDataSetChanged();
                if (CreateSceneSelectDeviceActivity.this.f10641h) {
                    T = CreateSceneSelectDeviceActivity.this.f10640g;
                    string = CreateSceneSelectDeviceActivity.this.getString(2131755400);
                } else {
                    T = CreateSceneSelectDeviceActivity.this.f10640g;
                    string = CreateSceneSelectDeviceActivity.this.getString(2131755398);
                }
                T.setText(string);
                CreateSceneSelectDeviceActivity.this.mo26311F();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneSelectDeviceActivity$e */
    class C5135e implements View.OnClickListener {
        C5135e() {
        }

        public void onClick(View view) {
            Set<String> v = CreateSceneSelectDeviceActivity.this.f10634a.mo27149v();
            if (v.size() != 0) {
                CreateSceneSelectDeviceActivity.this.f10642i.mo31756k(v);
                Intent intent = new Intent(CreateSceneSelectDeviceActivity.this, CreateSceneNameActivity.class);
                intent.putExtra("data_template", CreateSceneSelectDeviceActivity.this.f10642i);
                CreateSceneSelectDeviceActivity.this.startActivityForResult(intent, 100);
            }
        }
    }

    /* renamed from: F */
    public void mo26311F() {
        boolean z;
        Button button;
        if (this.f10634a.mo27149v().size() > 0) {
            button = this.f10643j;
            z = true;
        } else {
            button = this.f10643j;
            z = false;
        }
        button.setEnabled(z);
    }

    /* access modifiers changed from: protected */
    @TargetApi(19)
    /* renamed from: V */
    public void mo26312V(boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.clearFlags(67108864);
            window.getDecorView().setSystemUiVisibility(1280);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
            return;
        }
        Window window2 = getWindow();
        WindowManager.LayoutParams attributes = window2.getAttributes();
        attributes.flags = z ? attributes.flags | 67108864 : attributes.flags & -67108865;
        window2.setAttributes(attributes);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100 && i2 == -1) {
            setResult(-1);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        mo26312V(true);
        C10547m.m25758h(true, this);
        setContentView((int) C11748R$layout.activity_create_scene_select_device);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297424);
        commonTitleBar.mo32825a(getText(2131756211).toString(), new C5131a(), new C5132b());
        commonTitleBar.setTitleTextSize(17);
        if (getIntent() != null) {
            this.f10642i = (C9832c0) getIntent().getSerializableExtra("data_template");
        }
        if (this.f10642i == null) {
            C4308b.m12139r("NoDataFound", "No selected device data found!");
            finish();
            return;
        }
        this.f10635b = (RecyclerView) findViewById(2131296591);
        CreateSceneSelectDeviceAdapter createSceneSelectDeviceAdapter = new CreateSceneSelectDeviceAdapter(this, this);
        this.f10634a = createSceneSelectDeviceAdapter;
        this.f10635b.setAdapter(createSceneSelectDeviceAdapter);
        this.f10635b.setLayoutManager(new LinearLayoutManager(this));
        this.f10634a.mo27140D(C9812t.m23832j().mo31685k());
        this.f10636c = (AppBarLayout) findViewById(C11745R$id.app_bar);
        LinearLayout linearLayout = (LinearLayout) findViewById(C11745R$id.layout_header_title);
        this.f10637d = (ImageView) findViewById(C11745R$id.template_icon);
        this.f10638e = (TextView) findViewById(C11745R$id.template_name);
        this.f10639f = (TextView) findViewById(C11745R$id.template_des);
        this.f10640g = (TextView) findViewById(C11745R$id.tv_select_all);
        this.f10643j = (Button) findViewById(C11745R$id.btn_next);
        C9832c0 c0Var = this.f10642i;
        if (c0Var != null) {
            this.f10638e.setText(c0Var.mo31755j());
            this.f10639f.setText(this.f10642i.mo31749d());
            this.f10637d.setImageResource(C10549p.m25765a(3, this.f10642i.mo31751f()));
        }
        this.f10643j.setEnabled(false);
        this.f10636c.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new C5133c(C10547m.m25751a(this, 89.0f), C10547m.m25751a(this, 20.0f), C10547m.m25751a(this, 102.0f)));
        this.f10640g.setOnClickListener(new C5134d());
        this.f10643j.setOnClickListener(new C5135e());
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }
}
