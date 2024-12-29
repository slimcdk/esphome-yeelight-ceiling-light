package com.yeelight.cherry.p177ui.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p177ui.adapter.PersonalityLightFlowItemAdapter;
import com.yeelight.yeelib.p152f.C9789j;
import com.yeelight.yeelib.p153g.C4300b0;
import com.yeelight.yeelib.p153g.C9838i;
import com.yeelight.yeelib.p153g.C9844m;
import com.yeelight.yeelib.p153g.C9849r;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.widget.C10515b;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C10549p;
import java.util.List;
import java.util.Locale;

/* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightEditActivity */
public class PersonalityLightEditActivity extends BaseActivity implements PersonalityLightFlowItemAdapter.C5831b {

    /* renamed from: b */
    private TextView f11378b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public TextView f11379c;

    /* renamed from: d */
    private TextView f11380d;

    /* renamed from: e */
    private ImageView f11381e;

    /* renamed from: f */
    private TextView f11382f;

    /* renamed from: g */
    private RecyclerView f11383g;

    /* renamed from: h */
    PersonalityLightFlowItemAdapter f11384h;

    /* renamed from: i */
    C9838i f11385i;

    /* renamed from: j */
    private boolean f11386j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f11387k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f11388l;

    /* renamed from: m */
    private ImageView f11389m;

    /* renamed from: n */
    private ImageView f11390n;

    /* renamed from: o */
    private LinearLayout f11391o;

    /* renamed from: p */
    C10515b.C10517b f11392p = null;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public Handler f11393q = new C5464i();

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightEditActivity$a */
    class C5453a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f11394a;

        /* renamed from: b */
        final /* synthetic */ AlertDialog f11395b;

        C5453a(String str, AlertDialog alertDialog) {
            this.f11394a = str;
            this.f11395b = alertDialog;
        }

        public void onClick(View view) {
            C9789j.m23734b().mo31644a(view.getContext(), String.format(PersonalityLightEditActivity.this.getString(2131755809), new Object[]{this.f11394a}));
            Intent intent = new Intent();
            intent.setClass(PersonalityLightEditActivity.this, LightShareApplicationActivity.class);
            PersonalityLightEditActivity.this.startActivity(intent);
            this.f11395b.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightEditActivity$b */
    class C5454b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f11397a;

        C5454b(PersonalityLightEditActivity personalityLightEditActivity, AlertDialog alertDialog) {
            this.f11397a = alertDialog;
        }

        public void onClick(View view) {
            this.f11397a.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightEditActivity$c */
    class C5455c implements View.OnClickListener {
        C5455c() {
        }

        public void onClick(View view) {
            PersonalityLightEditActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightEditActivity$d */
    class C5456d implements View.OnClickListener {
        C5456d() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClass(PersonalityLightEditActivity.this, PersonalityLightProfileEditActivity.class);
            intent.putExtra("custom_scene_index", PersonalityLightEditActivity.this.f11388l);
            PersonalityLightEditActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightEditActivity$e */
    class C5457e implements View.OnClickListener {

        /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightEditActivity$e$a */
        class C5458a implements C9789j.C9792c {
            C5458a() {
            }

            /* renamed from: a */
            public void mo26711a(String str) {
                PersonalityLightEditActivity.this.runOnUiThread(new C5737l1(this));
            }

            /* renamed from: b */
            public void mo26712b(String str) {
                PersonalityLightEditActivity.this.runOnUiThread(new C5742m1(this, str));
            }

            /* renamed from: c */
            public /* synthetic */ void mo26713c() {
                PersonalityLightEditActivity personalityLightEditActivity = PersonalityLightEditActivity.this;
                personalityLightEditActivity.f11392p.mo33281b(2, personalityLightEditActivity.getString(2131756059));
            }

            /* renamed from: d */
            public /* synthetic */ void mo26714d(String str) {
                PersonalityLightEditActivity personalityLightEditActivity = PersonalityLightEditActivity.this;
                personalityLightEditActivity.f11392p.mo33281b(1, personalityLightEditActivity.getString(2131756061));
                PersonalityLightEditActivity.this.m16739g0(str);
            }
        }

        C5457e() {
        }

        public void onClick(View view) {
            PersonalityLightEditActivity.this.m16740h0();
            C9789j.m23734b().mo31645c(PersonalityLightEditActivity.this.f11385i.mo31886r(), new C5458a());
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightEditActivity$f */
    class C5459f implements View.OnClickListener {
        C5459f() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(PersonalityLightEditActivity.this, PersonalityLightingActivity.class);
            intent.addFlags(71303168);
            PersonalityLightEditActivity.this.startActivity(intent);
            PersonalityLightEditActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightEditActivity$g */
    class C5460g implements View.OnClickListener {
        C5460g() {
        }

        public void onClick(View view) {
            if (PersonalityLightEditActivity.this.f11385i.mo31871c().mo31723h().size() == 0) {
                PersonalityLightEditActivity.this.f11393q.removeMessages(0);
                PersonalityLightEditActivity.this.f11393q.sendEmptyMessageDelayed(0, 500);
                return;
            }
            Intent intent = new Intent(PersonalityLightEditActivity.this, PersonalityLightPreviewActivity.class);
            intent.putExtra("custom_scene_index", PersonalityLightEditActivity.this.f11388l);
            intent.putExtra("custom_scene_preview", true);
            PersonalityLightEditActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightEditActivity$h */
    class C5461h implements View.OnClickListener {

        /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightEditActivity$h$a */
        class C5462a implements C4300b0.C4307g {
            C5462a() {
            }

            /* renamed from: a */
            public void mo23766a(String str) {
                PersonalityLightEditActivity.this.f11379c.post(new C5747n1(this));
                Message message = new Message();
                message.what = 1;
                Bundle bundle = new Bundle();
                bundle.putString(XiaomiOAuthConstants.EXTRA_ERROR_CODE_2, str);
                message.setData(bundle);
                PersonalityLightEditActivity.this.f11393q.sendMessage(message);
            }

            /* renamed from: b */
            public /* synthetic */ void mo26718b() {
                PersonalityLightEditActivity.this.f11379c.setEnabled(true);
            }

            /* renamed from: f */
            public void mo23767f() {
            }

            /* renamed from: n */
            public void mo23768n(boolean z, List<C9849r> list) {
            }

            public void onRefresh() {
                PersonalityLightEditActivity.this.m16737e0();
            }

            /* renamed from: p */
            public void mo23770p(String str) {
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightEditActivity$h$b */
        class C5463b implements C4300b0.C4307g {
            C5463b() {
            }

            /* renamed from: a */
            public void mo23766a(String str) {
                PersonalityLightEditActivity.this.f11379c.post(new C5752o1(this));
                Message message = new Message();
                message.what = 1;
                Bundle bundle = new Bundle();
                bundle.putString(XiaomiOAuthConstants.EXTRA_ERROR_CODE_2, str);
                message.setData(bundle);
                PersonalityLightEditActivity.this.f11393q.sendMessage(message);
            }

            /* renamed from: b */
            public /* synthetic */ void mo26719b() {
                PersonalityLightEditActivity.this.f11379c.setEnabled(true);
            }

            /* renamed from: f */
            public void mo23767f() {
            }

            /* renamed from: n */
            public void mo23768n(boolean z, List<C9849r> list) {
            }

            public void onRefresh() {
                PersonalityLightEditActivity.this.m16737e0();
            }

            /* renamed from: p */
            public void mo23770p(String str) {
            }
        }

        C5461h() {
        }

        public void onClick(View view) {
            if (PersonalityLightEditActivity.this.f11385i.mo31871c().mo31723h().size() == 0) {
                PersonalityLightEditActivity.this.m16738f0();
                return;
            }
            PersonalityLightEditActivity.this.f11379c.setEnabled(false);
            if (PersonalityLightEditActivity.this.f11387k) {
                C4300b0.m12083u().mo23740C(PersonalityLightEditActivity.this.f11385i, new C5462a());
            } else if (PersonalityLightEditActivity.this.f11385i.mo31871c().mo31723h().size() > 0) {
                C4300b0.m12083u().mo23738A(PersonalityLightEditActivity.this.f11385i, new C5463b());
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightEditActivity$i */
    class C5464i extends Handler {
        C5464i() {
        }

        public void handleMessage(Message message) {
            Toast toast;
            PersonalityLightEditActivity personalityLightEditActivity;
            int i;
            super.handleMessage(message);
            int i2 = message.what;
            if (i2 == 0) {
                personalityLightEditActivity = PersonalityLightEditActivity.this;
                i = 2131756033;
            } else if (i2 == 1) {
                String string = message.getData().getString(XiaomiOAuthConstants.EXTRA_ERROR_CODE_2);
                if (string == null || string.isEmpty()) {
                    personalityLightEditActivity = PersonalityLightEditActivity.this;
                    i = 2131755306;
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

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightEditActivity$j */
    class C5465j implements DialogInterface.OnClickListener {

        /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightEditActivity$j$a */
        class C5466a implements C4300b0.C4307g {
            C5466a() {
            }

            /* renamed from: a */
            public void mo23766a(String str) {
                Message message = new Message();
                message.what = 1;
                Bundle bundle = new Bundle();
                bundle.putString(XiaomiOAuthConstants.EXTRA_ERROR_CODE_2, str);
                message.setData(bundle);
                PersonalityLightEditActivity.this.f11393q.sendMessage(message);
            }

            /* renamed from: f */
            public void mo23767f() {
                PersonalityLightEditActivity.this.m16737e0();
            }

            /* renamed from: n */
            public void mo23768n(boolean z, List<C9849r> list) {
            }

            public void onRefresh() {
            }

            /* renamed from: p */
            public void mo23770p(String str) {
            }
        }

        C5465j() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (PersonalityLightEditActivity.this.f11387k) {
                C4300b0.m12083u().mo23742f(PersonalityLightEditActivity.this.f11385i, new C5466a());
            } else {
                PersonalityLightEditActivity.this.m16737e0();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightEditActivity$k */
    class C5467k implements DialogInterface.OnClickListener {
        C5467k(PersonalityLightEditActivity personalityLightEditActivity) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    static {
        Class<PersonalityLightEditActivity> cls = PersonalityLightEditActivity.class;
    }

    /* renamed from: d0 */
    private String m16736d0() {
        int i = 0;
        for (C9844m c : this.f11385i.mo31871c().mo31723h()) {
            i += c.mo31788c();
        }
        int i2 = i / 86400000;
        return String.format(Locale.US, "%02d:%02d:%02d.%d", new Object[]{Integer.valueOf((i % 86400000) / 3600000), Integer.valueOf((i % 3600000) / 60000), Integer.valueOf((i % 60000) / 1000), Integer.valueOf((i % 1000) / 100)});
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public void m16737e0() {
        Intent intent = new Intent();
        intent.setFlags(67108864);
        intent.setClass(this, PersonalityLightingActivity.class);
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public void m16738f0() {
        C10526e.C10531e eVar = new C10526e.C10531e(this);
        eVar.mo33357h(2131755245);
        eVar.mo33355f(2131756035);
        eVar.mo33353d(-2, getString(2131755229), new C5467k(this));
        eVar.mo33353d(-1, getString(2131755277), new C5465j());
        eVar.mo33351b().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public void m16739g0(String str) {
        View inflate = View.inflate(this, C11748R$layout.light_share_tag_dialog_layout, (ViewGroup) null);
        inflate.setLayerType(1, (Paint) null);
        ((TextView) inflate.findViewById(C11745R$id.view_share_text)).setText(str);
        AlertDialog create = new AlertDialog.Builder(this, 2131820937).create();
        inflate.findViewById(C11745R$id.dialog_btn_down).setOnClickListener(new C5453a(str, create));
        inflate.findViewById(C11745R$id.view_close_dialog).setOnClickListener(new C5454b(this, create));
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
    /* renamed from: h0 */
    public void m16740h0() {
        C10515b.C10517b bVar = new C10515b.C10517b(this);
        this.f11392p = bVar;
        bVar.mo33281b(0, getString(2131755513));
        this.f11392p.mo33283d();
    }

    /* renamed from: J */
    public void mo26705J() {
        this.f11386j = true;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        View.OnClickListener onClickListener;
        ImageView imageView;
        super.onCreate(bundle);
        if (!isFinishing()) {
            mo32193P();
            C10547m.m25758h(true, this);
            setContentView(C11748R$layout.activity_create_personality_light);
            this.f11389m = (ImageView) findViewById(C11745R$id.btn_add);
            this.f11390n = (ImageView) findViewById(C11745R$id.share_light);
            this.f11391o = (LinearLayout) findViewById(C11745R$id.layout_top_right);
            findViewById(C11745R$id.btn_back).setOnClickListener(new C5455c());
            this.f11378b = (TextView) findViewById(2131297107);
            this.f11379c = (TextView) findViewById(C11745R$id.save_view);
            this.f11380d = (TextView) findViewById(C11745R$id.light_duration);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            ((LinearLayout) findViewById(C11745R$id.title_bar_view)).setLayoutParams(layoutParams);
            layoutParams.setMargins(0, C10547m.m25755e(this), 0, C10547m.m25751a(this, 30.0f));
            int intExtra = getIntent().getIntExtra("custom_scene_index", -1);
            this.f11388l = intExtra;
            if (intExtra == -1 || intExtra == -2) {
                if (this.f11388l == -2) {
                    this.f11391o.setVisibility(8);
                }
                this.f11385i = C4300b0.m12083u().mo23753r();
                this.f11389m.setImageResource(2131231200);
                imageView = this.f11389m;
                onClickListener = new C5459f();
            } else {
                this.f11387k = true;
                this.f11390n.setVisibility(0);
                this.f11385i = C4300b0.m12083u().mo23745i().get(this.f11388l);
                this.f11389m.setImageResource(2131231231);
                this.f11389m.setOnClickListener(new C5456d());
                imageView = this.f11390n;
                onClickListener = new C5457e();
            }
            imageView.setOnClickListener(onClickListener);
            this.f11381e = (ImageView) findViewById(C11745R$id.light_type_view);
            this.f11382f = (TextView) findViewById(C11745R$id.light_name);
            RecyclerView recyclerView = (RecyclerView) findViewById(C11745R$id.flow_item_list);
            this.f11383g = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            PersonalityLightFlowItemAdapter personalityLightFlowItemAdapter = new PersonalityLightFlowItemAdapter(this, this.f11388l);
            this.f11384h = personalityLightFlowItemAdapter;
            this.f11383g.setAdapter(personalityLightFlowItemAdapter);
            this.f11378b.setOnClickListener(new C5460g());
            this.f11379c.setEnabled(true);
            this.f11379c.setOnClickListener(new C5461h());
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f11384h.mo27179i();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f11384h.notifyDataSetChanged();
        this.f11380d.setText(m16736d0());
        this.f11381e.setImageResource(C10549p.f20166a.get(this.f11385i.mo31761d0() > 0 ? this.f11385i.mo31761d0() : 0).intValue());
        this.f11382f.setText(this.f11385i.mo31888t());
        this.f11384h.mo27178h(this);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (this.f11386j) {
            this.f11383g.scrollToPosition(this.f11384h.getItemCount() - 1);
            this.f11386j = false;
        }
    }
}
