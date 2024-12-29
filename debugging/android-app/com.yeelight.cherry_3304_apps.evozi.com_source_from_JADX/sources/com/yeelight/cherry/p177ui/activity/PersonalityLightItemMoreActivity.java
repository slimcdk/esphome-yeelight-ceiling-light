package com.yeelight.cherry.p177ui.activity;

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
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p177ui.adapter.PersonalityFlowItemTouchCallback;
import com.yeelight.cherry.p177ui.adapter.PersonalityLightFlowItemEditAdapter;
import com.yeelight.yeelib.p153g.C4300b0;
import com.yeelight.yeelib.p153g.C9838i;
import com.yeelight.yeelib.p153g.C9844m;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightItemMoreActivity */
public class PersonalityLightItemMoreActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public CommonTitleBar f11410b;

    /* renamed from: c */
    private RecyclerView f11411c;

    /* renamed from: d */
    PersonalityLightFlowItemEditAdapter f11412d;

    /* renamed from: e */
    LinearLayout f11413e;

    /* renamed from: f */
    LinearLayout f11414f;

    /* renamed from: g */
    LinearLayout f11415g;

    /* renamed from: h */
    PersonalityFlowItemTouchCallback f11416h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f11417i = false;

    /* renamed from: j */
    boolean f11418j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C9838i f11419k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Handler f11420l = new C5473f();

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightItemMoreActivity$a */
    class C5468a implements View.OnClickListener {
        C5468a() {
        }

        public void onClick(View view) {
            PersonalityLightItemMoreActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightItemMoreActivity$b */
    class C5469b implements View.OnClickListener {
        C5469b() {
        }

        public void onClick(View view) {
            PersonalityLightItemMoreActivity personalityLightItemMoreActivity = PersonalityLightItemMoreActivity.this;
            boolean unused = personalityLightItemMoreActivity.f11417i = !personalityLightItemMoreActivity.f11417i;
            PersonalityLightItemMoreActivity.this.m16766b0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightItemMoreActivity$c */
    class C5470c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LinearLayoutManager f11423a;

        C5470c(LinearLayoutManager linearLayoutManager) {
            this.f11423a = linearLayoutManager;
        }

        public void onClick(View view) {
            List<C9844m> h = PersonalityLightItemMoreActivity.this.f11419k.mo31871c().mo31723h();
            if (h.size() >= 10) {
                PersonalityLightItemMoreActivity.this.f11420l.removeMessages(0);
                PersonalityLightItemMoreActivity.this.f11420l.sendEmptyMessageDelayed(0, 500);
            } else if (PersonalityLightItemMoreActivity.this.f11412d.mo27192f() >= 0) {
                C9844m mVar = h.get(PersonalityLightItemMoreActivity.this.f11412d.mo27192f());
                h.add(new C9844m(mVar.mo31788c(), mVar.mo31789d(), mVar.mo31790e(), mVar.mo31787b()));
                PersonalityLightItemMoreActivity.this.f11412d.notifyDataSetChanged();
                this.f11423a.scrollToPosition(PersonalityLightItemMoreActivity.this.f11412d.getItemCount() - 1);
            } else {
                PersonalityLightItemMoreActivity.this.f11420l.removeMessages(1);
                PersonalityLightItemMoreActivity.this.f11420l.sendEmptyMessageDelayed(1, 500);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightItemMoreActivity$d */
    class C5471d implements View.OnClickListener {
        C5471d() {
        }

        public void onClick(View view) {
            List<C9844m> h = PersonalityLightItemMoreActivity.this.f11419k.mo31871c().mo31723h();
            if (PersonalityLightItemMoreActivity.this.f11412d.mo27192f() >= 0) {
                h.remove(PersonalityLightItemMoreActivity.this.f11412d.mo27192f());
                PersonalityLightItemMoreActivity.this.f11412d.mo27193g(-1);
                PersonalityLightItemMoreActivity.this.f11412d.notifyDataSetChanged();
                return;
            }
            PersonalityLightItemMoreActivity.this.f11420l.removeMessages(2);
            PersonalityLightItemMoreActivity.this.f11420l.sendEmptyMessageDelayed(2, 500);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightItemMoreActivity$e */
    class C5472e implements Runnable {
        C5472e() {
        }

        public void run() {
            int i;
            Resources resources;
            PersonalityLightItemMoreActivity personalityLightItemMoreActivity = PersonalityLightItemMoreActivity.this;
            personalityLightItemMoreActivity.f11416h.mo27177a(personalityLightItemMoreActivity.f11417i);
            PersonalityLightItemMoreActivity personalityLightItemMoreActivity2 = PersonalityLightItemMoreActivity.this;
            personalityLightItemMoreActivity2.f11412d.mo27194h(personalityLightItemMoreActivity2.f11417i);
            PersonalityLightItemMoreActivity.this.f11412d.notifyDataSetChanged();
            CommonTitleBar a0 = PersonalityLightItemMoreActivity.this.f11410b;
            if (PersonalityLightItemMoreActivity.this.f11417i) {
                resources = PersonalityLightItemMoreActivity.this.getResources();
                i = 2131756027;
            } else {
                resources = PersonalityLightItemMoreActivity.this.getResources();
                i = 2131756026;
            }
            a0.setRightTextStr(resources.getText(i).toString());
            PersonalityLightItemMoreActivity personalityLightItemMoreActivity3 = PersonalityLightItemMoreActivity.this;
            personalityLightItemMoreActivity3.f11415g.setVisibility(personalityLightItemMoreActivity3.f11417i ? 8 : 0);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightItemMoreActivity$f */
    class C5473f extends Handler {
        C5473f() {
        }

        public void handleMessage(Message message) {
            PersonalityLightItemMoreActivity personalityLightItemMoreActivity;
            int i;
            super.handleMessage(message);
            int i2 = message.what;
            if (i2 == 0) {
                personalityLightItemMoreActivity = PersonalityLightItemMoreActivity.this;
                i = 2131755999;
            } else if (i2 == 1) {
                personalityLightItemMoreActivity = PersonalityLightItemMoreActivity.this;
                i = 2131756000;
            } else if (i2 == 2) {
                personalityLightItemMoreActivity = PersonalityLightItemMoreActivity.this;
                i = 2131756017;
            } else {
                return;
            }
            Toast.makeText(personalityLightItemMoreActivity, personalityLightItemMoreActivity.getText(i), 0).show();
        }
    }

    static {
        Class<PersonalityLightItemMoreActivity> cls = PersonalityLightItemMoreActivity.class;
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m16766b0() {
        this.f11410b.post(new C5472e());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        boolean z = true;
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_personality_light_item_sort);
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("custom_scene_index", -1);
        if (intExtra == -1) {
            z = false;
        }
        this.f11418j = z;
        this.f11419k = z ? C4300b0.m12083u().mo23745i().get(intExtra) : C4300b0.m12083u().mo23753r();
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297424);
        this.f11410b = commonTitleBar;
        commonTitleBar.mo32825a(this.f11419k.mo31888t(), new C5468a(), new C5469b());
        this.f11410b.setTitleTextSize(16);
        this.f11410b.setRightTextStr(getResources().getText(2131756026).toString());
        this.f11410b.setRightTextColor(getResources().getColor(2131099802));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.f11410b.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        this.f11413e = (LinearLayout) findViewById(C11745R$id.layout_item_copy);
        this.f11414f = (LinearLayout) findViewById(C11745R$id.layout_item_delete);
        this.f11415g = (LinearLayout) findViewById(C11745R$id.bottom_layout);
        this.f11411c = (RecyclerView) findViewById(C11745R$id.flow_item_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        this.f11411c.setLayoutManager(linearLayoutManager);
        this.f11412d = new PersonalityLightFlowItemEditAdapter(this, intExtra);
        PersonalityFlowItemTouchCallback personalityFlowItemTouchCallback = new PersonalityFlowItemTouchCallback(intExtra);
        this.f11416h = personalityFlowItemTouchCallback;
        new ItemTouchHelper(personalityFlowItemTouchCallback).attachToRecyclerView(this.f11411c);
        this.f11411c.setAdapter(this.f11412d);
        int intExtra2 = intent.getIntExtra("scene_edit_index", 0);
        this.f11412d.mo27193g(intExtra2);
        linearLayoutManager.scrollToPosition(intExtra2);
        this.f11413e.setOnClickListener(new C5470c(linearLayoutManager));
        this.f11414f.setOnClickListener(new C5471d());
    }
}
