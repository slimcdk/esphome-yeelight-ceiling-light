package com.yeelight.cherry.p141ui.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.adapter.PersonalityLightFlowItemAdapter;
import com.yeelight.yeelib.models.C3112v;
import com.yeelight.yeelib.models.C8319k;
import com.yeelight.yeelib.models.C8321m;
import com.yeelight.yeelib.models.CustomAdvancedFlowScene;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import java.util.List;
import java.util.Locale;
import p051j4.C9193k;
import p051j4.C9195n;
import p170i4.C9113d;

/* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightEditActivity */
public class PersonalityLightEditActivity extends BaseActivity implements PersonalityLightFlowItemAdapter.C5894b {

    /* renamed from: a */
    private TextView f10950a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public TextView f10951b;

    /* renamed from: c */
    private TextView f10952c;

    /* renamed from: d */
    private ImageView f10953d;

    /* renamed from: e */
    private TextView f10954e;

    /* renamed from: f */
    private RecyclerView f10955f;

    /* renamed from: g */
    PersonalityLightFlowItemAdapter f10956g;

    /* renamed from: h */
    CustomAdvancedFlowScene f10957h;

    /* renamed from: i */
    private boolean f10958i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f10959j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f10960k;

    /* renamed from: l */
    private ImageView f10961l;

    /* renamed from: m */
    private LinearLayout f10962m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public Handler f10963n = new C5507f();

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightEditActivity$a */
    class C5500a implements View.OnClickListener {
        C5500a() {
        }

        public void onClick(View view) {
            PersonalityLightEditActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightEditActivity$b */
    class C5501b implements View.OnClickListener {
        C5501b() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClass(PersonalityLightEditActivity.this, PersonalityLightProfileEditActivity.class);
            intent.putExtra("custom_scene_index", PersonalityLightEditActivity.this.f10960k);
            PersonalityLightEditActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightEditActivity$c */
    class C5502c implements View.OnClickListener {
        C5502c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(PersonalityLightEditActivity.this, PersonalityLightingActivity.class);
            intent.addFlags(71303168);
            PersonalityLightEditActivity.this.startActivity(intent);
            PersonalityLightEditActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightEditActivity$d */
    class C5503d implements View.OnClickListener {
        C5503d() {
        }

        public void onClick(View view) {
            if (PersonalityLightEditActivity.this.f10957h.mo35436c().mo35338h().size() == 0) {
                PersonalityLightEditActivity.this.f10963n.removeMessages(0);
                PersonalityLightEditActivity.this.f10963n.sendEmptyMessageDelayed(0, 500);
                return;
            }
            Intent intent = new Intent(PersonalityLightEditActivity.this, PersonalityLightPreviewActivity.class);
            intent.putExtra("custom_scene_index", PersonalityLightEditActivity.this.f10960k);
            intent.putExtra("custom_scene_preview", true);
            PersonalityLightEditActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightEditActivity$e */
    class C5504e implements View.OnClickListener {

        /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightEditActivity$e$a */
        class C5505a implements C3112v.C3119g {
            C5505a() {
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public /* synthetic */ void m16717c() {
                PersonalityLightEditActivity.this.f10951b.setEnabled(true);
            }

            /* renamed from: a */
            public void mo23579a(String str) {
                PersonalityLightEditActivity.this.f10951b.post(new C5749e2(this));
                Message message = new Message();
                message.what = 1;
                Bundle bundle = new Bundle();
                bundle.putString(XiaomiOAuthConstants.EXTRA_ERROR_CODE_2, str);
                message.setData(bundle);
                PersonalityLightEditActivity.this.f10963n.sendMessage(message);
            }

            /* renamed from: g */
            public void mo23580g() {
            }

            public void onRefresh() {
                PersonalityLightEditActivity.this.m16713c0();
            }

            /* renamed from: r */
            public void mo23582r(boolean z, List<C8321m> list) {
            }

            /* renamed from: s */
            public void mo23583s(String str) {
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightEditActivity$e$b */
        class C5506b implements C3112v.C3119g {
            C5506b() {
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public /* synthetic */ void m16723c() {
                PersonalityLightEditActivity.this.f10951b.setEnabled(true);
            }

            /* renamed from: a */
            public void mo23579a(String str) {
                PersonalityLightEditActivity.this.f10951b.post(new C5755f2(this));
                Message message = new Message();
                message.what = 1;
                Bundle bundle = new Bundle();
                bundle.putString(XiaomiOAuthConstants.EXTRA_ERROR_CODE_2, str);
                message.setData(bundle);
                PersonalityLightEditActivity.this.f10963n.sendMessage(message);
            }

            /* renamed from: g */
            public void mo23580g() {
            }

            public void onRefresh() {
                PersonalityLightEditActivity.this.m16713c0();
            }

            /* renamed from: r */
            public void mo23582r(boolean z, List<C8321m> list) {
            }

            /* renamed from: s */
            public void mo23583s(String str) {
            }
        }

        C5504e() {
        }

        public void onClick(View view) {
            if (PersonalityLightEditActivity.this.f10957h.mo35436c().mo35338h().size() == 0) {
                PersonalityLightEditActivity.this.m16714d0();
                return;
            }
            PersonalityLightEditActivity.this.f10951b.setEnabled(false);
            if (PersonalityLightEditActivity.this.f10959j) {
                C3112v.m8242u().mo23553B(PersonalityLightEditActivity.this.f10957h, new C5505a());
            } else if (PersonalityLightEditActivity.this.f10957h.mo35436c().mo35338h().size() > 0) {
                C3112v.m8242u().mo23552A(PersonalityLightEditActivity.this.f10957h, new C5506b());
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightEditActivity$f */
    class C5507f extends Handler {
        C5507f() {
        }

        public void handleMessage(Message message) {
            Toast toast;
            PersonalityLightEditActivity personalityLightEditActivity;
            int i;
            super.handleMessage(message);
            int i2 = message.what;
            if (i2 == 0) {
                personalityLightEditActivity = PersonalityLightEditActivity.this;
                i = 2131756045;
            } else if (i2 == 1) {
                String string = message.getData().getString(XiaomiOAuthConstants.EXTRA_ERROR_CODE_2);
                if (string == null || string.isEmpty()) {
                    personalityLightEditActivity = PersonalityLightEditActivity.this;
                    i = 2131755310;
                } else {
                    toast = Toast.makeText(PersonalityLightEditActivity.this, string, 0);
                    toast.show();
                }
            } else {
                return;
            }
            toast = Toast.makeText(personalityLightEditActivity, personalityLightEditActivity.getText(i), 0);
            toast.show();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightEditActivity$g */
    class C5508g implements DialogInterface.OnClickListener {

        /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightEditActivity$g$a */
        class C5509a implements C3112v.C3119g {
            C5509a() {
            }

            /* renamed from: a */
            public void mo23579a(String str) {
                Message message = new Message();
                message.what = 1;
                Bundle bundle = new Bundle();
                bundle.putString(XiaomiOAuthConstants.EXTRA_ERROR_CODE_2, str);
                message.setData(bundle);
                PersonalityLightEditActivity.this.f10963n.sendMessage(message);
            }

            /* renamed from: g */
            public void mo23580g() {
                PersonalityLightEditActivity.this.m16713c0();
            }

            public void onRefresh() {
            }

            /* renamed from: r */
            public void mo23582r(boolean z, List<C8321m> list) {
            }

            /* renamed from: s */
            public void mo23583s(String str) {
            }
        }

        C5508g() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (PersonalityLightEditActivity.this.f10959j) {
                C3112v.m8242u().mo23555f(PersonalityLightEditActivity.this.f10957h, new C5509a());
            } else {
                PersonalityLightEditActivity.this.m16713c0();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightEditActivity$h */
    class C5510h implements DialogInterface.OnClickListener {
        C5510h(PersonalityLightEditActivity personalityLightEditActivity) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: b0 */
    private String m16712b0() {
        int i = 0;
        for (C8319k c : this.f10957h.mo35436c().mo35338h()) {
            i += c.mo35375c();
        }
        int i2 = i / 86400000;
        return String.format(Locale.US, "%02d:%02d:%02d.%d", new Object[]{Integer.valueOf((i % 86400000) / 3600000), Integer.valueOf((i % 3600000) / 60000), Integer.valueOf((i % 60000) / 1000), Integer.valueOf((i % 1000) / 100)});
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public void m16713c0() {
        Intent intent = new Intent();
        intent.setFlags(67108864);
        intent.setClass(this, PersonalityLightingActivity.class);
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public void m16714d0() {
        new C9113d.C9118e(this).mo37178h(2131755248).mo37176f(2131756047).mo37174d(-2, getString(2131755232), new C5510h(this)).mo37174d(-1, getString(2131755281), new C5508g()).mo37172b().show();
    }

    /* renamed from: J */
    public void mo30715J() {
        this.f10958i = true;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        View.OnClickListener onClickListener;
        ImageView imageView;
        super.onCreate(bundle);
        if (!isFinishing()) {
            mo35653P();
            C9193k.m22157h(true, this);
            setContentView(C12228R$layout.activity_create_personality_light);
            this.f10961l = (ImageView) findViewById(C12225R$id.btn_add);
            this.f10962m = (LinearLayout) findViewById(C12225R$id.layout_top_right);
            findViewById(C12225R$id.btn_back).setOnClickListener(new C5500a());
            this.f10950a = (TextView) findViewById(2131297240);
            this.f10951b = (TextView) findViewById(C12225R$id.save_view);
            this.f10952c = (TextView) findViewById(C12225R$id.light_duration);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            ((LinearLayout) findViewById(C12225R$id.title_bar_view)).setLayoutParams(layoutParams);
            layoutParams.setMargins(0, C9193k.m22154e(this), 0, C9193k.m22150a(this, 30.0f));
            int intExtra = getIntent().getIntExtra("custom_scene_index", -1);
            this.f10960k = intExtra;
            if (intExtra == -1 || intExtra == -2) {
                if (intExtra == -2) {
                    this.f10962m.setVisibility(8);
                }
                this.f10957h = C3112v.m8242u().mo23566r();
                this.f10961l.setImageResource(2131231214);
                imageView = this.f10961l;
                onClickListener = new C5502c();
            } else {
                this.f10959j = true;
                this.f10957h = C3112v.m8242u().mo23558i().get(this.f10960k);
                this.f10961l.setImageResource(2131231245);
                imageView = this.f10961l;
                onClickListener = new C5501b();
            }
            imageView.setOnClickListener(onClickListener);
            this.f10953d = (ImageView) findViewById(C12225R$id.light_type_view);
            this.f10954e = (TextView) findViewById(C12225R$id.light_name);
            RecyclerView recyclerView = (RecyclerView) findViewById(C12225R$id.flow_item_list);
            this.f10955f = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            PersonalityLightFlowItemAdapter personalityLightFlowItemAdapter = new PersonalityLightFlowItemAdapter(this, this.f10960k);
            this.f10956g = personalityLightFlowItemAdapter;
            this.f10955f.setAdapter(personalityLightFlowItemAdapter);
            this.f10950a.setOnClickListener(new C5503d());
            this.f10951b.setEnabled(true);
            this.f10951b.setOnClickListener(new C5504e());
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f10956g.mo31146i();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f10956g.notifyDataSetChanged();
        this.f10952c.setText(m16712b0());
        this.f10953d.setImageResource(C9195n.f17011a.get(this.f10957h.mo35296d0() > 0 ? this.f10957h.mo35296d0() : 0).intValue());
        this.f10954e.setText(this.f10957h.mo35453t());
        this.f10956g.mo31145h(this);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (this.f10958i) {
            this.f10955f.scrollToPosition(this.f10956g.getItemCount() - 1);
            this.f10958i = false;
        }
    }
}
