package com.yeelight.cherry.p177ui.activity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p177ui.adapter.NetworkListAdapter;
import com.yeelight.yeelib.data.C7579c;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.p150c.C5972a;
import com.yeelight.yeelib.p150c.C6000f;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p183m.C6459e0;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p153g.C9850s;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.activity.SelectNetworkActivity */
public class SelectNetworkActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f11854b = SelectNetworkActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public NetworkListAdapter f11855c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public List<C9850s> f11856d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C6459e0 f11857e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f11858f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f11859g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C9850s f11860h = null;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C9850s f11861i = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C10526e f11862j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f11863k = -1;

    /* renamed from: l */
    private C9770e f11864l = new C5654a();
    @BindView(2131297041)
    Button mBtnNext;
    @BindView(2131297037)
    RecyclerView mNetworkList;
    @BindView(2131297424)
    CommonTitleBar mTitleBar;

    /* renamed from: com.yeelight.cherry.ui.activity.SelectNetworkActivity$a */
    class C5654a implements C9770e {

        /* renamed from: com.yeelight.cherry.ui.activity.SelectNetworkActivity$a$a */
        class C5655a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f11866a;

            /* renamed from: com.yeelight.cherry.ui.activity.SelectNetworkActivity$a$a$a */
            class C5656a implements Runnable {
                C5656a() {
                }

                public void run() {
                    C6000f fVar = (C6000f) C4257w.m11945h0(SelectNetworkActivity.this.f11861i.mo31822c() + "_" + SelectNetworkActivity.this.f11861i.mo31820a());
                    if (fVar != null) {
                        fVar.mo27503P1();
                    }
                    ((C6000f) C4257w.m11945h0(SelectNetworkActivity.this.f11857e.mo27805V1().mo31822c() + "_" + SelectNetworkActivity.this.f11860h.mo31820a())).mo27503P1();
                    SelectNetworkActivity.this.finish();
                }
            }

            C5655a(int i) {
                this.f11866a = i;
            }

            public void run() {
                int i = this.f11866a;
                if (i == 536870914 || i == 805306370) {
                    String unused = SelectNetworkActivity.this.f11854b;
                    if (SelectNetworkActivity.this.f11860h != null) {
                        SelectNetworkActivity selectNetworkActivity = SelectNetworkActivity.this;
                        Toast.makeText(selectNetworkActivity, selectNetworkActivity.getResources().getString(2131755854, new Object[]{SelectNetworkActivity.this.f11860h.mo31821b()}), 0).show();
                        SelectNetworkActivity.this.f11857e.mo27817i2(SelectNetworkActivity.this.f11860h);
                        SelectNetworkActivity.this.f11857e.mo27818j2("ADV_MESH_NAME", SelectNetworkActivity.this.f11860h.mo31821b().getBytes());
                        DeviceDataProvider.m22397c0(SelectNetworkActivity.this.f11859g, SelectNetworkActivity.this.f11860h.mo31820a());
                        new Handler().postDelayed(new C5656a(), 1000);
                    }
                } else if (i == 536870916) {
                    if (SelectNetworkActivity.this.f11863k != -1 && !SelectNetworkActivity.this.f11857e.mo27805V1().mo31822c().equals("yeelight_ms")) {
                        String unused2 = SelectNetworkActivity.this.f11854b;
                        "update id1 = " + SelectNetworkActivity.this.f11863k;
                        if ((SelectNetworkActivity.this.f11863k >> 30) == 1) {
                            SelectNetworkActivity selectNetworkActivity2 = SelectNetworkActivity.this;
                            int unused3 = selectNetworkActivity2.f11863k = selectNetworkActivity2.f11863k & 268435455;
                            ((C6000f) C4257w.m11945h0(SelectNetworkActivity.this.f11857e.mo27805V1().mo31822c() + "_" + SelectNetworkActivity.this.f11863k)).mo27503P1();
                            SelectNetworkActivity.this.f11857e.mo27813d2();
                            SelectNetworkActivity.this.f11857e.mo27814f2();
                        }
                        String unused4 = SelectNetworkActivity.this.f11854b;
                        "update id2 = " + SelectNetworkActivity.this.f11863k;
                        DeviceDataProvider.m22397c0(SelectNetworkActivity.this.f11859g, SelectNetworkActivity.this.f11863k);
                    }
                    String unused5 = SelectNetworkActivity.this.f11854b;
                } else if (i == 805306372) {
                    SelectNetworkActivity.this.f11862j.show();
                    String unused6 = SelectNetworkActivity.this.f11854b;
                    if (SelectNetworkActivity.this.f11863k != -1 && (SelectNetworkActivity.this.f11863k >> 30) != 1) {
                        String unused7 = SelectNetworkActivity.this.f11854b;
                        DeviceDataProvider.m22408l(SelectNetworkActivity.this.f11863k);
                        SelectNetworkActivity.this.m17086k0();
                        SelectNetworkActivity.this.f11855c.notifyDataSetChanged();
                    }
                }
            }
        }

        C5654a() {
        }

        public void onStatusChange(int i, C6024e eVar) {
            SelectNetworkActivity.this.runOnUiThread(new C5655a(i));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectNetworkActivity$b */
    class C5657b implements View.OnClickListener {
        C5657b() {
        }

        public void onClick(View view) {
            SelectNetworkActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectNetworkActivity$c */
    class C5658c implements View.OnClickListener {
        C5658c() {
        }

        public void onClick(View view) {
            SelectNetworkActivity.this.startActivityForResult(new Intent(SelectNetworkActivity.this, AddNetworkActivity.class), 1);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectNetworkActivity$d */
    class C5659d implements NetworkListAdapter.C5819c {
        C5659d() {
        }

        /* renamed from: a */
        public void mo26957a(int i) {
            Button button;
            boolean z;
            int unused = SelectNetworkActivity.this.f11858f = i;
            if (i == -1) {
                button = SelectNetworkActivity.this.mBtnNext;
                z = false;
            } else {
                button = SelectNetworkActivity.this.mBtnNext;
                z = true;
            }
            button.setEnabled(z);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectNetworkActivity$e */
    class C5660e implements View.OnClickListener {
        C5660e() {
        }

        public void onClick(View view) {
            C9850s sVar = (C9850s) SelectNetworkActivity.this.f11856d.get(SelectNetworkActivity.this.f11858f);
            C9850s unused = SelectNetworkActivity.this.f11860h = sVar;
            SelectNetworkActivity selectNetworkActivity = SelectNetworkActivity.this;
            C9850s unused2 = selectNetworkActivity.f11861i = selectNetworkActivity.f11857e.mo27805V1();
            if (SelectNetworkActivity.this.f11860h.mo31820a() != SelectNetworkActivity.this.f11861i.mo31820a()) {
                SelectNetworkActivity.this.f11857e.mo27820l2(sVar.mo31822c(), sVar.mo31823d());
                return;
            }
            SelectNetworkActivity selectNetworkActivity2 = SelectNetworkActivity.this;
            Toast.makeText(selectNetworkActivity2, selectNetworkActivity2.getResources().getString(2131755854, new Object[]{SelectNetworkActivity.this.f11860h.mo31821b()}), 0).show();
            SelectNetworkActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectNetworkActivity$f */
    class C5661f implements DialogInterface.OnClickListener {
        C5661f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent(SelectNetworkActivity.this, AddNetworkActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", SelectNetworkActivity.this.f11859g);
            intent.putExtra("updateMesh", (byte[]) SelectNetworkActivity.this.f11857e.mo27804U1("ADV_MESH_NAME"));
            SelectNetworkActivity.this.startActivityForResult(intent, 1);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectNetworkActivity$g */
    class C5662g implements DialogInterface.OnClickListener {
        C5662g() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SelectNetworkActivity.this.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public void m17086k0() {
        Cursor D = DeviceDataProvider.m22369D();
        this.f11856d.clear();
        while (D.moveToNext()) {
            this.f11856d.add(m17087l0(D));
        }
    }

    /* renamed from: l0 */
    private C9850s m17087l0(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(C7579c.C7590f.C7591a.f15421a);
        int columnIndex2 = cursor.getColumnIndex(C7579c.C7590f.C7591a.f15423c);
        int columnIndex3 = cursor.getColumnIndex(C7579c.C7590f.C7591a.f15422b);
        int columnIndex4 = cursor.getColumnIndex(C7579c.C7590f.C7591a.f15424d);
        C9850s sVar = new C9850s();
        sVar.mo31824e(cursor.getInt(columnIndex));
        sVar.mo31826f(cursor.getString(columnIndex2));
        sVar.mo31827g(cursor.getString(columnIndex3));
        sVar.mo31828h(cursor.getString(columnIndex4));
        "mesh name = " + sVar.mo31822c() + ", pwd = " + sVar.mo31823d();
        return sVar;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1 && intent != null) {
            this.f11863k = intent.getIntExtra("id", -1);
            "Update device mesh, id = " + this.f11863k;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(this.f11854b, "Activity has not device id", false);
            finish();
            return;
        }
        this.f11859g = intent.getStringExtra("com.yeelight.cherry.device_id");
        this.f11863k = intent.getIntExtra("id", -1);
        C5972a g0 = C4257w.m11947l0().mo23668g0(this.f11859g);
        if (g0 instanceof C6459e0) {
            this.f11857e = (C6459e0) g0;
            mo32193P();
            setContentView(C11748R$layout.activity_select_network);
            ButterKnife.bind((Activity) this);
            C10547m.m25758h(true, this);
            setTitleBarPadding(this.mTitleBar);
            this.mTitleBar.mo32825a("", new C5657b(), new C5658c());
            this.mTitleBar.setRightTextColor(ViewCompat.MEASURED_STATE_MASK);
            this.mTitleBar.setRightTextStr(getString(2131755832));
            this.f11855c = new NetworkListAdapter(this, this.f11856d, this.f11857e.mo27805V1().mo31820a());
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            linearLayoutManager.setAutoMeasureEnabled(false);
            this.mNetworkList.setLayoutManager(linearLayoutManager);
            this.mNetworkList.setAdapter(this.f11855c);
            this.f11855c.mo27174g(new C5659d());
            this.mBtnNext.setOnClickListener(new C5660e());
            this.mBtnNext.setEnabled(false);
            C10526e.C10531e eVar = new C10526e.C10531e(this);
            eVar.mo33358i(getString(2131755850));
            eVar.mo33356g(getString(2131755851));
            eVar.mo33353d(-2, getString(2131755229), new C5662g());
            eVar.mo33353d(-1, getString(2131755277), new C5661f());
            this.f11862j = eVar.mo33351b();
            return;
        }
        C4308b.m12141t(this.f11854b, "Select network activity accept Gingko device only", false);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f11857e.mo23400W0(this.f11864l);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m17086k0();
        this.f11855c.notifyDataSetChanged();
        this.f11857e.mo23365B0(this.f11864l);
        if (!this.f11857e.mo27806W1()) {
            C6459e0 e0Var = this.f11857e;
            e0Var.mo27808Y1(e0Var.mo27805V1().mo31822c(), this.f11857e.mo27805V1().mo31823d());
        }
    }
}
