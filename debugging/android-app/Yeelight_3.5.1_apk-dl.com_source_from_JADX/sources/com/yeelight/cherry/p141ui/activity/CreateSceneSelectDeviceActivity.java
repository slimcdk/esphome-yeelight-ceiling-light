package com.yeelight.cherry.p141ui.activity;

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
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.adapter.CreateSceneSelectDeviceAdapter;
import com.yeelight.yeelib.managers.C8293t;
import com.yeelight.yeelib.models.SceneTemplateBean;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.List;
import java.util.Set;
import p051j4.C9193k;
import p051j4.C9195n;
import p197p3.C10265a;
import p197p3.C10266b;

/* renamed from: com.yeelight.cherry.ui.activity.CreateSceneSelectDeviceActivity */
public class CreateSceneSelectDeviceActivity extends AppCompatActivity implements CreateSceneSelectDeviceAdapter.C5872e {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static String f10186k = "CreateSceneSelectDeviceActivity";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public CreateSceneSelectDeviceAdapter f10187a;

    /* renamed from: b */
    private RecyclerView f10188b;

    /* renamed from: c */
    private AppBarLayout f10189c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ImageView f10190d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public TextView f10191e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public TextView f10192f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public TextView f10193g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f10194h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public SceneTemplateBean f10195i;

    /* renamed from: j */
    private Button f10196j;

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneSelectDeviceActivity$a */
    class C5179a implements View.OnClickListener {
        C5179a() {
        }

        public void onClick(View view) {
            CreateSceneSelectDeviceActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneSelectDeviceActivity$b */
    class C5180b implements View.OnClickListener {
        C5180b() {
        }

        public void onClick(View view) {
            CreateSceneSelectDeviceActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneSelectDeviceActivity$c */
    class C5181c implements AppBarLayout.OnOffsetChangedListener {

        /* renamed from: a */
        final /* synthetic */ int f10199a;

        /* renamed from: b */
        final /* synthetic */ int f10200b;

        /* renamed from: c */
        final /* synthetic */ int f10201c;

        C5181c(int i, int i2, int i3) {
            this.f10199a = i;
            this.f10200b = i2;
            this.f10201c = i3;
        }

        public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            int i2 = -i;
            float f = (float) i2;
            CreateSceneSelectDeviceActivity.this.f10190d.setTranslationY(0.8f * f);
            float f2 = 0.09f * f;
            CreateSceneSelectDeviceActivity.this.f10191e.setTranslationY(f2);
            CreateSceneSelectDeviceActivity.this.f10192f.setTranslationY(f2);
            float f3 = (f * 1.0f) / ((float) this.f10199a);
            String unused = CreateSceneSelectDeviceActivity.f10186k;
            StringBuilder sb = new StringBuilder();
            sb.append("fraction = ");
            sb.append(f3);
            sb.append(", verticalOffset = ");
            sb.append(i);
            float f4 = -f3;
            CreateSceneSelectDeviceActivity.this.f10190d.setTranslationX(((float) (CreateSceneSelectDeviceActivity.this.f10190d.getLeft() - this.f10200b)) * f4);
            CreateSceneSelectDeviceActivity.this.f10191e.setTranslationX(((float) (CreateSceneSelectDeviceActivity.this.f10191e.getLeft() - this.f10201c)) * f4);
            CreateSceneSelectDeviceActivity.this.f10192f.setTranslationX(f4 * ((float) (CreateSceneSelectDeviceActivity.this.f10192f.getLeft() - this.f10201c)));
            if (this.f10199a >= i2 && i != 0) {
                CreateSceneSelectDeviceActivity.this.f10187a.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneSelectDeviceActivity$d */
    class C5182d implements View.OnClickListener {
        C5182d() {
        }

        public void onClick(View view) {
            TextView T;
            String string;
            try {
                CreateSceneSelectDeviceActivity createSceneSelectDeviceActivity = CreateSceneSelectDeviceActivity.this;
                boolean unused = createSceneSelectDeviceActivity.f10194h = !createSceneSelectDeviceActivity.f10194h;
                for (C10266b next : CreateSceneSelectDeviceActivity.this.f10187a.mo31119x()) {
                    List<C10265a> c = next.mo41738c();
                    if (CreateSceneSelectDeviceActivity.this.f10194h) {
                        next.mo41741f(true);
                        for (C10265a next2 : c) {
                            next2.mo41733c(true);
                            CreateSceneSelectDeviceActivity.this.f10187a.mo31115t(next2);
                        }
                    } else {
                        next.mo41741f(false);
                        CreateSceneSelectDeviceActivity.this.f10187a.mo31116u();
                        for (C10265a c2 : c) {
                            c2.mo41733c(false);
                        }
                    }
                }
                CreateSceneSelectDeviceActivity.this.f10187a.notifyDataSetChanged();
                if (CreateSceneSelectDeviceActivity.this.f10194h) {
                    T = CreateSceneSelectDeviceActivity.this.f10193g;
                    string = CreateSceneSelectDeviceActivity.this.getString(2131755404);
                } else {
                    T = CreateSceneSelectDeviceActivity.this.f10193g;
                    string = CreateSceneSelectDeviceActivity.this.getString(2131755402);
                }
                T.setText(string);
                CreateSceneSelectDeviceActivity.this.mo30355F();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneSelectDeviceActivity$e */
    class C5183e implements View.OnClickListener {
        C5183e() {
        }

        public void onClick(View view) {
            Set<String> v = CreateSceneSelectDeviceActivity.this.f10187a.mo31117v();
            if (v.size() != 0) {
                CreateSceneSelectDeviceActivity.this.f10195i.setDeviceIds(v);
                Intent intent = new Intent(CreateSceneSelectDeviceActivity.this, CreateSceneNameActivity.class);
                intent.putExtra("data_template", CreateSceneSelectDeviceActivity.this.f10195i);
                CreateSceneSelectDeviceActivity.this.startActivityForResult(intent, 100);
            }
        }
    }

    /* renamed from: F */
    public void mo30355F() {
        boolean z;
        Button button;
        if (this.f10187a.mo31117v().size() > 0) {
            button = this.f10196j;
            z = true;
        } else {
            button = this.f10196j;
            z = false;
        }
        button.setEnabled(z);
    }

    /* access modifiers changed from: protected */
    @TargetApi(19)
    /* renamed from: V */
    public void mo30356V(boolean z) {
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
        mo30356V(true);
        C9193k.m22157h(true, this);
        setContentView((int) C12228R$layout.activity_create_scene_select_device);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297591);
        commonTitleBar.mo36195a(getText(2131756236).toString(), new C5179a(), new C5180b());
        commonTitleBar.setTitleTextSize(17);
        if (getIntent() != null) {
            this.f10195i = (SceneTemplateBean) getIntent().getSerializableExtra("data_template");
        }
        if (this.f10195i == null) {
            AppUtils.m8300u("NoDataFound", "No selected device data found!");
            finish();
            return;
        }
        this.f10188b = (RecyclerView) findViewById(2131296669);
        CreateSceneSelectDeviceAdapter createSceneSelectDeviceAdapter = new CreateSceneSelectDeviceAdapter(this, this);
        this.f10187a = createSceneSelectDeviceAdapter;
        this.f10188b.setAdapter(createSceneSelectDeviceAdapter);
        this.f10188b.setLayoutManager(new LinearLayoutManager(this));
        this.f10187a.mo31108D(C8293t.m19620n().mo35255o());
        this.f10189c = (AppBarLayout) findViewById(C12225R$id.app_bar);
        LinearLayout linearLayout = (LinearLayout) findViewById(C12225R$id.layout_header_title);
        this.f10190d = (ImageView) findViewById(C12225R$id.template_icon);
        this.f10191e = (TextView) findViewById(C12225R$id.template_name);
        this.f10192f = (TextView) findViewById(C12225R$id.template_des);
        this.f10193g = (TextView) findViewById(C12225R$id.tv_select_all);
        this.f10196j = (Button) findViewById(C12225R$id.btn_next);
        SceneTemplateBean sceneTemplateBean = this.f10195i;
        if (sceneTemplateBean != null) {
            this.f10191e.setText(sceneTemplateBean.getTitle());
            this.f10192f.setText(this.f10195i.getDescription());
            this.f10190d.setImageResource(C9195n.m22164a(3, this.f10195i.getIconId()));
        }
        this.f10196j.setEnabled(false);
        this.f10189c.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new C5181c(C9193k.m22150a(this, 89.0f), C9193k.m22150a(this, 20.0f), C9193k.m22150a(this, 102.0f)));
        this.f10193g.setOnClickListener(new C5182d());
        this.f10196j.setOnClickListener(new C5183e());
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }
}
