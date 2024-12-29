package com.yeelight.cherry.p141ui.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.adapter.PersonalityFlowItemTouchCallback;
import com.yeelight.cherry.p141ui.adapter.PersonalityLightFlowItemEditAdapter;
import com.yeelight.yeelib.models.C3112v;
import com.yeelight.yeelib.models.C8319k;
import com.yeelight.yeelib.models.CustomAdvancedFlowScene;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import java.util.List;
import p051j4.C9193k;

/* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightItemMoreActivity */
public class PersonalityLightItemMoreActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public CommonTitleBar f10974a;

    /* renamed from: b */
    private RecyclerView f10975b;

    /* renamed from: c */
    PersonalityLightFlowItemEditAdapter f10976c;

    /* renamed from: d */
    LinearLayout f10977d;

    /* renamed from: e */
    LinearLayout f10978e;

    /* renamed from: f */
    LinearLayout f10979f;

    /* renamed from: g */
    PersonalityFlowItemTouchCallback f10980g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f10981h = false;

    /* renamed from: i */
    boolean f10982i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public CustomAdvancedFlowScene f10983j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Handler f10984k = new C5516f();

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightItemMoreActivity$a */
    class C5511a implements View.OnClickListener {
        C5511a() {
        }

        public void onClick(View view) {
            PersonalityLightItemMoreActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightItemMoreActivity$b */
    class C5512b implements View.OnClickListener {
        C5512b() {
        }

        public void onClick(View view) {
            PersonalityLightItemMoreActivity personalityLightItemMoreActivity = PersonalityLightItemMoreActivity.this;
            boolean unused = personalityLightItemMoreActivity.f10981h = !personalityLightItemMoreActivity.f10981h;
            PersonalityLightItemMoreActivity.this.m16738b0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightItemMoreActivity$c */
    class C5513c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LinearLayoutManager f10987a;

        C5513c(LinearLayoutManager linearLayoutManager) {
            this.f10987a = linearLayoutManager;
        }

        public void onClick(View view) {
            List<C8319k> h = PersonalityLightItemMoreActivity.this.f10983j.mo35436c().mo35338h();
            if (h.size() >= 10) {
                PersonalityLightItemMoreActivity.this.f10984k.removeMessages(0);
                PersonalityLightItemMoreActivity.this.f10984k.sendEmptyMessageDelayed(0, 500);
            } else if (PersonalityLightItemMoreActivity.this.f10976c.mo31159f() >= 0) {
                C8319k kVar = h.get(PersonalityLightItemMoreActivity.this.f10976c.mo31159f());
                h.add(new C8319k(kVar.mo35375c(), kVar.mo35376d(), kVar.mo35377e(), kVar.mo35374b()));
                PersonalityLightItemMoreActivity.this.f10976c.notifyDataSetChanged();
                this.f10987a.scrollToPosition(PersonalityLightItemMoreActivity.this.f10976c.getItemCount() - 1);
            } else {
                PersonalityLightItemMoreActivity.this.f10984k.removeMessages(1);
                PersonalityLightItemMoreActivity.this.f10984k.sendEmptyMessageDelayed(1, 500);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightItemMoreActivity$d */
    class C5514d implements View.OnClickListener {
        C5514d() {
        }

        public void onClick(View view) {
            List<C8319k> h = PersonalityLightItemMoreActivity.this.f10983j.mo35436c().mo35338h();
            if (PersonalityLightItemMoreActivity.this.f10976c.mo31159f() >= 0) {
                h.remove(PersonalityLightItemMoreActivity.this.f10976c.mo31159f());
                PersonalityLightItemMoreActivity.this.f10976c.mo31160g(-1);
                PersonalityLightItemMoreActivity.this.f10976c.notifyDataSetChanged();
                return;
            }
            PersonalityLightItemMoreActivity.this.f10984k.removeMessages(2);
            PersonalityLightItemMoreActivity.this.f10984k.sendEmptyMessageDelayed(2, 500);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightItemMoreActivity$e */
    class C5515e implements Runnable {
        C5515e() {
        }

        public void run() {
            int i;
            Resources resources;
            PersonalityLightItemMoreActivity personalityLightItemMoreActivity = PersonalityLightItemMoreActivity.this;
            personalityLightItemMoreActivity.f10980g.mo31144a(personalityLightItemMoreActivity.f10981h);
            PersonalityLightItemMoreActivity personalityLightItemMoreActivity2 = PersonalityLightItemMoreActivity.this;
            personalityLightItemMoreActivity2.f10976c.mo31161h(personalityLightItemMoreActivity2.f10981h);
            PersonalityLightItemMoreActivity.this.f10976c.notifyDataSetChanged();
            CommonTitleBar a0 = PersonalityLightItemMoreActivity.this.f10974a;
            if (PersonalityLightItemMoreActivity.this.f10981h) {
                resources = PersonalityLightItemMoreActivity.this.getResources();
                i = 2131756039;
            } else {
                resources = PersonalityLightItemMoreActivity.this.getResources();
                i = 2131756038;
            }
            a0.setRightTextStr(resources.getText(i).toString());
            PersonalityLightItemMoreActivity personalityLightItemMoreActivity3 = PersonalityLightItemMoreActivity.this;
            personalityLightItemMoreActivity3.f10979f.setVisibility(personalityLightItemMoreActivity3.f10981h ? 8 : 0);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightItemMoreActivity$f */
    class C5516f extends Handler {
        C5516f() {
        }

        public void handleMessage(Message message) {
            PersonalityLightItemMoreActivity personalityLightItemMoreActivity;
            int i;
            super.handleMessage(message);
            int i2 = message.what;
            if (i2 == 0) {
                personalityLightItemMoreActivity = PersonalityLightItemMoreActivity.this;
                i = 2131756011;
            } else if (i2 == 1) {
                personalityLightItemMoreActivity = PersonalityLightItemMoreActivity.this;
                i = 2131756012;
            } else if (i2 == 2) {
                personalityLightItemMoreActivity = PersonalityLightItemMoreActivity.this;
                i = 2131756029;
            } else {
                return;
            }
            Toast.makeText(personalityLightItemMoreActivity, personalityLightItemMoreActivity.getText(i), 0).show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m16738b0() {
        this.f10974a.post(new C5515e());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        boolean z = true;
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_personality_light_item_sort);
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("custom_scene_index", -1);
        if (intExtra == -1) {
            z = false;
        }
        this.f10982i = z;
        this.f10983j = z ? C3112v.m8242u().mo23558i().get(intExtra) : C3112v.m8242u().mo23566r();
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297591);
        this.f10974a = commonTitleBar;
        commonTitleBar.mo36195a(this.f10983j.mo35453t(), new C5511a(), new C5512b());
        this.f10974a.setTitleTextSize(16);
        this.f10974a.setRightTextStr(getResources().getText(2131756038).toString());
        this.f10974a.setRightTextColor(getResources().getColor(2131099805));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.f10974a.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        this.f10977d = (LinearLayout) findViewById(C12225R$id.layout_item_copy);
        this.f10978e = (LinearLayout) findViewById(C12225R$id.layout_item_delete);
        this.f10979f = (LinearLayout) findViewById(C12225R$id.bottom_layout);
        this.f10975b = (RecyclerView) findViewById(C12225R$id.flow_item_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        this.f10975b.setLayoutManager(linearLayoutManager);
        this.f10976c = new PersonalityLightFlowItemEditAdapter(this, intExtra);
        PersonalityFlowItemTouchCallback personalityFlowItemTouchCallback = new PersonalityFlowItemTouchCallback(intExtra);
        this.f10980g = personalityFlowItemTouchCallback;
        new ItemTouchHelper(personalityFlowItemTouchCallback).attachToRecyclerView(this.f10975b);
        this.f10975b.setAdapter(this.f10976c);
        int intExtra2 = intent.getIntExtra("scene_edit_index", 0);
        this.f10976c.mo31160g(intExtra2);
        linearLayoutManager.scrollToPosition(intExtra2);
        this.f10977d.setOnClickListener(new C5513c(linearLayoutManager));
        this.f10978e.setOnClickListener(new C5514d());
    }
}
