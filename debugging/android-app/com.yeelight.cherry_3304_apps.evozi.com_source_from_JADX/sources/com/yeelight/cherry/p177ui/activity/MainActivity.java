package com.yeelight.cherry.p177ui.activity;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.hedgehog.ratingbar.RatingBar;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.miot.api.CommonHandler;
import com.miot.api.MiotManager;
import com.miot.bluetooth.channel.packet.Packet;
import com.miot.common.exception.MiotException;
import com.miot.common.share.ShareStatus;
import com.miot.common.share.SharedRequest;
import com.yeelight.cherry.C11744R$drawable;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p177ui.fragment.NewDeviceListFragment;
import com.yeelight.cherry.p177ui.fragment.RoomFragment;
import com.yeelight.cherry.p177ui.fragment.SceneFragment;
import com.yeelight.cherry.p177ui.view.BottomTabView;
import com.yeelight.yeelib.data.AppConfigurationProvider;
import com.yeelight.yeelib.p150c.C5980c;
import com.yeelight.yeelib.p150c.C6005g;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6017a;
import com.yeelight.yeelib.p150c.p151i.C6033g;
import com.yeelight.yeelib.p150c.p183m.C6318b1;
import com.yeelight.yeelib.p150c.p183m.C6418d1;
import com.yeelight.yeelib.p150c.p183m.C6922j1;
import com.yeelight.yeelib.p150c.p183m.C7130o0;
import com.yeelight.yeelib.p150c.p183m.C7472y;
import com.yeelight.yeelib.p152f.C4201a;
import com.yeelight.yeelib.p152f.C4230l;
import com.yeelight.yeelib.p152f.C4239r;
import com.yeelight.yeelib.p152f.C4243s;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p152f.C9789j;
import com.yeelight.yeelib.p152f.C9807q;
import com.yeelight.yeelib.p153g.C4300b0;
import com.yeelight.yeelib.p153g.C9838i;
import com.yeelight.yeelib.p187h.C9859a;
import com.yeelight.yeelib.p187h.C9862d;
import com.yeelight.yeelib.p187h.p189h.C9874b;
import com.yeelight.yeelib.p191j.p192a.C9891b;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.activity.FeedbackV3Activity;
import com.yeelight.yeelib.p194ui.activity.LanControlListActivity;
import com.yeelight.yeelib.p194ui.view.CircleImageView;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.widget.C10515b;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C10549p;
import com.yeelight.yeelib.utils.C10551r;
import com.yeelight.yeelib.utils.C10559w;
import com.yeelight.yeelib.utils.C4308b;
import com.yeelight.yeelib.utils.C4311i;
import com.yeelight.yeelib.utils.C4312n;
import com.yeelight.yeelib.wear.WearService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p011c.p083d.p090b.C1203t;
import p011c.p083d.p090b.C1219x;

/* renamed from: com.yeelight.cherry.ui.activity.MainActivity */
public class MainActivity extends BaseActivity implements C4201a.C4202i, BottomTabView.C5960a, C4312n.C4314b, C9807q.C9811d, C4230l.C4231a, C4243s.C4246c {
    /* access modifiers changed from: private */

    /* renamed from: v */
    public static final String f11121v = MainActivity.class.getSimpleName();

    /* renamed from: b */
    CommonTitleBar f11122b;

    /* renamed from: c */
    ArrayList<String> f11123c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f11124d;

    /* renamed from: e */
    SlidingMenu f11125e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public CircleImageView f11126f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public TextView f11127g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public TextView f11128h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f11129i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C5365y f11130j;

    /* renamed from: k */
    BottomTabView f11131k;

    /* renamed from: l */
    C10515b.C10517b f11132l = null;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C9891b f11133m;

    /* renamed from: n */
    ArrayList<C5364x> f11134n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f11135o;

    /* renamed from: p */
    private FragmentManager f11136p;

    /* renamed from: q */
    private String f11137q = "";

    /* renamed from: r */
    private boolean f11138r = true;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f11139s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f11140t;

    /* renamed from: u */
    private Handler f11141u = new C5346g();

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$a */
    class C5340a implements C9874b<String> {
        C5340a() {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            String unused = MainActivity.f11121v;
            "query news onSuccess: " + str;
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("code")) {
                        int i = jSONObject.getInt("code");
                        MainActivity mainActivity = MainActivity.this;
                        boolean z = true;
                        if (i != 1) {
                            z = false;
                        }
                        boolean unused2 = mainActivity.f11140t = z;
                        MainActivity.this.m16538s0();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }

        public void onFailure(int i, String str) {
            String unused = MainActivity.f11121v;
            "query news onFailure: " + str;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$b */
    class C5341b implements Runnable {
        C5341b() {
        }

        public void run() {
            boolean z;
            CommonTitleBar commonTitleBar;
            if (!MainActivity.this.f11129i) {
                z = true;
                if (MainActivity.this.f11134n.get(1).mo26609f() || MainActivity.this.f11134n.get(2).mo26609f()) {
                    commonTitleBar = MainActivity.this.f11122b;
                    commonTitleBar.setLeftButtonRedSpot(z);
                }
            }
            commonTitleBar = MainActivity.this.f11122b;
            z = false;
            commonTitleBar.setLeftButtonRedSpot(z);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$c */
    class C5342c implements C9789j.C9793d {
        C5342c() {
        }

        /* renamed from: a */
        public void mo26581a(int i, C9838i iVar) {
            MainActivity.this.runOnUiThread(new C5787w0(this, i, iVar));
        }

        /* renamed from: b */
        public void mo26582b() {
        }

        /* renamed from: c */
        public /* synthetic */ void mo26583c(int i, C9838i iVar) {
            MainActivity.this.m16506J0(i, iVar);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$d */
    class C5343d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C9838i f11145a;

        /* renamed from: b */
        final /* synthetic */ AlertDialog f11146b;

        C5343d(C9838i iVar, AlertDialog alertDialog) {
            this.f11145a = iVar;
            this.f11146b = alertDialog;
        }

        public void onClick(View view) {
            C4300b0.m12083u().mo23759z();
            C4300b0.m12083u().mo23739B(this.f11145a);
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, PersonalityLightEditActivity.class);
            intent.putExtra("custom_scene_index", -2);
            MainActivity.this.startActivity(intent);
            this.f11146b.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$e */
    class C5344e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f11148a;

        C5344e(MainActivity mainActivity, AlertDialog alertDialog) {
            this.f11148a = alertDialog;
        }

        public void onClick(View view) {
            this.f11148a.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$f */
    class C5345f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f11149a;

        C5345f(MainActivity mainActivity, AlertDialog alertDialog) {
            this.f11149a = alertDialog;
        }

        public void onClick(View view) {
            this.f11149a.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$g */
    class C5346g extends Handler {
        C5346g() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 0) {
                MainActivity.this.m16499C0();
            } else if (i == 1) {
                C4243s.m11829f().mo23597o();
            } else if (i == 2) {
                MainActivity.this.m16539t0();
            } else if (i == 3) {
                try {
                    MainActivity.this.startService(new Intent(MainActivity.this, WearService.class));
                } catch (IllegalStateException e) {
                    C10551r.m25782n(e);
                }
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$h */
    class C5347h implements Runnable {
        C5347h() {
        }

        public void run() {
            MainActivity mainActivity = MainActivity.this;
            mainActivity.f11132l = new C10515b.C10517b(mainActivity);
            MainActivity mainActivity2 = MainActivity.this;
            mainActivity2.f11132l.mo33281b(0, mainActivity2.getString(2131755107));
            MainActivity.this.f11132l.mo33283d();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$i */
    class C5348i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f11152a;

        C5348i(MainActivity mainActivity, AlertDialog alertDialog) {
            this.f11152a = alertDialog;
        }

        public void onClick(View view) {
            C4243s.m11829f().mo23607y(C4243s.m11829f().mo23594j() * 2);
            C4243s.m11829f().mo23600r();
            this.f11152a.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$j */
    class C5349j implements RatingBar.C3331b {

        /* renamed from: a */
        final /* synthetic */ int[] f11153a;

        /* renamed from: b */
        final /* synthetic */ Button f11154b;

        C5349j(MainActivity mainActivity, int[] iArr, Button button) {
            this.f11153a = iArr;
            this.f11154b = button;
        }

        /* renamed from: a */
        public void mo18089a(float f) {
            this.f11153a[0] = (int) f;
            this.f11154b.setEnabled(true);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$k */
    class C5350k implements View.OnClickListener {
        C5350k() {
        }

        public void onClick(View view) {
            boolean unused = MainActivity.this.f11129i = true;
            MainActivity.this.f11125e.mo18425n();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$l */
    class C5351l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ boolean f11156a;

        /* renamed from: b */
        final /* synthetic */ int[] f11157b;

        /* renamed from: c */
        final /* synthetic */ AlertDialog f11158c;

        C5351l(boolean z, int[] iArr, AlertDialog alertDialog) {
            this.f11156a = z;
            this.f11157b = iArr;
            this.f11158c = alertDialog;
        }

        public void onClick(View view) {
            if (this.f11156a) {
                C4243s.m11829f().mo23598p(this.f11157b[0]);
                MainActivity.this.m16507K0();
            } else {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("market://details?id=com.yeelight.cherry"));
                MainActivity.this.startActivity(intent);
            }
            C4243s.m11829f().mo23604v();
            C4243s.m11829f().mo23600r();
            C4243s.m11829f().mo23607y(10);
            this.f11158c.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$m */
    class C5352m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f11160a;

        C5352m(boolean z) {
            this.f11160a = z;
        }

        public void run() {
            MainActivity.this.m16504H0(this.f11160a);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$n */
    class C5353n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f11162a;

        C5353n(int i) {
            this.f11162a = i;
        }

        public void run() {
            MainActivity mainActivity = MainActivity.this;
            mainActivity.f11132l.mo33281b(1, mainActivity.getString(2131755108));
            if (this.f11162a < 4) {
                MainActivity.this.m16508L0();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$o */
    class C5354o implements Runnable {
        C5354o() {
        }

        public void run() {
            MainActivity mainActivity = MainActivity.this;
            mainActivity.f11132l.mo33281b(2, mainActivity.getString(2131756059));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$p */
    class C5355p implements View.OnClickListener {
        C5355p() {
        }

        /* renamed from: a */
        public /* synthetic */ void mo26595a(AdapterView adapterView, View view, int i, long j) {
            Class cls;
            MainActivity mainActivity;
            Intent intent = new Intent();
            if (i == 0) {
                mainActivity = MainActivity.this;
                cls = SearchDeviceAutoActivity.class;
            } else if (i == 1) {
                mainActivity = MainActivity.this;
                cls = CreateGroupNameActivity.class;
            } else if (i == 2) {
                intent.setClass(MainActivity.this, ProductListActivity.class);
                intent.putExtra("key_add_device", 2);
                MainActivity.this.startActivity(intent);
            } else {
                return;
            }
            intent.setClass(mainActivity, cls);
            MainActivity.this.startActivity(intent);
        }

        public void onClick(View view) {
            Intent intent;
            if (C9807q.m23812c().mo31675e()) {
                MainActivity.this.m16505I0();
                return;
            }
            int h0 = MainActivity.this.f11124d;
            if (h0 == 0) {
                intent = new Intent(MainActivity.this, CreateSceneActivity.class);
            } else if (h0 == 1) {
                intent = new Intent(MainActivity.this, ImageModeSelectionActivity.class);
                intent.putExtra("image_type", 2);
            } else if (h0 == 2) {
                if (MainActivity.this.f11133m == null) {
                    MainActivity mainActivity = MainActivity.this;
                    C9891b.C9893b bVar = new C9891b.C9893b(mainActivity);
                    bVar.mo31994d(new int[]{2131756209, 2131755572, 2131755573});
                    bVar.mo31996f(new C5791x0(this));
                    C9891b unused = mainActivity.f11133m = bVar.mo31992b();
                }
                MainActivity.this.f11133m.show();
                return;
            } else {
                return;
            }
            MainActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$q */
    class C5356q implements C9874b<String> {
        C5356q() {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            JSONObject optJSONObject;
            String unused = MainActivity.f11121v;
            "is_alexa_local_control_user onSuccess: " + str;
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("code")) {
                        String optString = jSONObject.optString("code");
                        String unused2 = MainActivity.f11121v;
                        "is_local_control_user code: " + optString;
                        if (TextUtils.equals(optString, "200") && (optJSONObject = jSONObject.optJSONObject(Packet.DATA)) != null && optJSONObject.optBoolean("alexaUser")) {
                            C10559w.m25814j(C4201a.m11607r().mo23452v() + "ALEXA_LOCAL_USER_HAD_SHOW", true);
                            MainActivity.this.m16502F0();
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }

        public void onFailure(int i, String str) {
            String unused = MainActivity.f11121v;
            "is_local_control_user onFailure: " + str;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$r */
    class C5357r implements SlidingMenu.C3373g {
        C5357r() {
        }

        /* renamed from: a */
        public void mo18479a() {
            boolean unused = MainActivity.this.f11129i = true;
            MainActivity.this.m16513Q0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$s */
    class C5358s implements View.OnClickListener {
        C5358s() {
        }

        public void onClick(View view) {
            boolean unused = MainActivity.this.f11135o = true;
            if (C4201a.m11610z()) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, AccountCenterActivity.class));
                return;
            }
            C4201a.m11607r().mo23438B(MainActivity.this);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$t */
    class C5359t implements Runnable {

        /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$t$a */
        class C5360a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f11170a;

            C5360a(String str) {
                this.f11170a = str;
            }

            public void run() {
                C1219x j = C1203t.m3106o(C4297y.f7456e).mo10003j(this.f11170a);
                j.mo10038f(2131231267);
                j.mo10036d(MainActivity.this.f11126f);
            }
        }

        C5359t() {
        }

        public void run() {
            MainActivity.this.f11127g.setText(C4201a.m11607r().mo23453w());
            TextView Y = MainActivity.this.f11128h;
            Y.setText("MI ID : " + C4201a.m11607r().mo23452v());
            String p = C4201a.m11607r().mo23449p();
            if (!TextUtils.isEmpty(p)) {
                MainActivity.this.f11126f.post(new C5360a(p));
            } else {
                MainActivity.this.f11126f.setImageResource(2131231267);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$u */
    class C5361u implements Runnable {
        C5361u() {
        }

        public void run() {
            MainActivity.this.f11126f.setImageResource(2131231267);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$v */
    class C5362v implements Runnable {
        C5362v() {
        }

        public void run() {
            MainActivity.this.f11130j.notifyDataSetChanged();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$w */
    class C5363w implements CommonHandler<List<SharedRequest>> {
        C5363w() {
        }

        /* renamed from: a */
        public void onSucceed(List<SharedRequest> list) {
            String unused = MainActivity.f11121v;
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getShareStatus().equals(ShareStatus.pending)) {
                    arrayList.add(list.get(i));
                }
            }
            int size = arrayList.size();
            if (C4312n.f7502j) {
                size++;
            }
            int unused2 = MainActivity.this.f11139s = size;
            MainActivity.this.m16538s0();
        }

        public void onFailed(int i, String str) {
            String unused = MainActivity.f11121v;
            "querySharedRequests onFailed: " + i + " " + str;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$x */
    private class C5364x {

        /* renamed from: a */
        private int f11175a;

        /* renamed from: b */
        private int f11176b;

        /* renamed from: c */
        private Class f11177c;

        /* renamed from: d */
        private boolean f11178d = false;

        /* renamed from: e */
        private int f11179e;

        /* renamed from: f */
        private boolean f11180f = false;

        C5364x(MainActivity mainActivity, int i, int i2, Class cls, boolean z) {
            this.f11175a = i;
            this.f11176b = i2;
            this.f11177c = cls;
            this.f11180f = z;
        }

        /* renamed from: a */
        public int mo26604a() {
            return this.f11179e;
        }

        /* renamed from: b */
        public int mo26605b() {
            return this.f11175a;
        }

        /* renamed from: c */
        public int mo26606c() {
            return this.f11176b;
        }

        /* renamed from: d */
        public Class mo26607d() {
            return this.f11177c;
        }

        /* renamed from: e */
        public boolean mo26608e() {
            return this.f11180f;
        }

        /* renamed from: f */
        public boolean mo26609f() {
            return this.f11178d;
        }

        /* renamed from: g */
        public void mo26610g(int i) {
            this.f11179e = i;
        }

        /* renamed from: h */
        public void mo26611h(boolean z) {
            this.f11178d = z;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$y */
    private class C5365y extends BaseAdapter {

        /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$y$a */
        class C5366a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f11182a;

            C5366a(int i) {
                this.f11182a = i;
            }

            public void onClick(View view) {
                C4311i.m12161l(this.f11182a);
                if (MainActivity.this.f11134n.get(this.f11182a).mo26608e() || !C9807q.m23812c().mo31675e()) {
                    Class d = MainActivity.this.f11134n.get(this.f11182a).mo26607d();
                    if (d != null) {
                        boolean unused = MainActivity.this.f11135o = true;
                        Intent intent = new Intent();
                        intent.setClass(view.getContext(), d);
                        MainActivity.this.startActivity(intent);
                        return;
                    }
                    return;
                }
                MainActivity.this.m16505I0();
            }
        }

        private C5365y() {
        }

        /* synthetic */ C5365y(MainActivity mainActivity, C5350k kVar) {
            this();
        }

        public int getCount() {
            return MainActivity.this.f11134n.size();
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C5367z zVar;
            if (view == null) {
                zVar = new C5367z(MainActivity.this, (C5350k) null);
                view2 = LayoutInflater.from(MainActivity.this).inflate(C11748R$layout.slide_menu_item_layout, (ViewGroup) null);
                view2.setTag(zVar);
            } else {
                view2 = view;
                zVar = (C5367z) view.getTag();
            }
            zVar.f11184a = (ImageView) view2.findViewById(C11745R$id.slide_item_badge_view);
            zVar.f11185b = (TextView) view2.findViewById(C11745R$id.slide_item_title_view);
            zVar.f11186c = (TextView) view2.findViewById(C11745R$id.message_tips_view);
            zVar.f11184a.setImageResource(MainActivity.this.f11134n.get(i).mo26605b());
            zVar.f11185b.setText(MainActivity.this.f11134n.get(i).mo26606c());
            if (MainActivity.this.f11134n.get(i).mo26609f()) {
                zVar.f11186c.setVisibility(0);
                zVar.f11186c.setText(String.valueOf(MainActivity.this.f11134n.get(i).mo26604a()));
            } else {
                zVar.f11186c.setVisibility(8);
            }
            view2.setOnClickListener(new C5366a(i));
            return view2;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$z */
    private class C5367z {

        /* renamed from: a */
        public ImageView f11184a;

        /* renamed from: b */
        public TextView f11185b;

        /* renamed from: c */
        public TextView f11186c;

        private C5367z(MainActivity mainActivity) {
        }

        /* synthetic */ C5367z(MainActivity mainActivity, C5350k kVar) {
            this(mainActivity);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C0 */
    public void m16499C0() {
        String d = C9789j.m23734b().mo31646d(this);
        if (!TextUtils.isEmpty(d)) {
            C9789j.m23734b().mo31647e(d, new C5342c());
        }
    }

    /* renamed from: D0 */
    private void m16500D0() {
        boolean b = C10559w.m25806b(C4201a.m11607r().mo23452v() + "ALEXA_LOCAL_USER_HAD_SHOW", false);
        "requestIsGoogleHomeLocalUser: " + b;
        if (!b) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("userId", C4201a.m11607r().mo23452v());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C9862d.m24141k(C4308b.f7491j + "third/r/alexauser", (Map<String, String>) null, (Map<String, String>) null, jSONObject.toString(), String.class, new C5356q(), true, C9859a.JSON);
        }
    }

    /* renamed from: E0 */
    private void m16501E0() {
        C9862d.m24133c(C4308b.f7492k + "notice/has_new_notice/" + C4201a.m11607r().mo23452v(), String.class, new C5340a());
    }

    /* access modifiers changed from: private */
    /* renamed from: F0 */
    public void m16502F0() {
        View inflate = View.inflate(this, C11748R$layout.dialog_alexa_user_hint, (ViewGroup) null);
        inflate.setLayerType(1, (Paint) null);
        AlertDialog create = new AlertDialog.Builder(this, 2131820937).create();
        create.requestWindowFeature(1);
        create.setCancelable(false);
        create.show();
        create.setContentView(inflate);
        ((ImageView) inflate.findViewById(C11745R$id.view_close_dialog)).setOnClickListener(new C5682a1(create));
        ((Button) inflate.findViewById(C11745R$id.dialog_btn_down)).setOnClickListener(new C5795y0(this, create));
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        WindowManager.LayoutParams attributes = create.getWindow().getAttributes();
        attributes.height = -2;
        double width = (double) defaultDisplay.getWidth();
        Double.isNaN(width);
        attributes.width = (int) (width * 0.78d);
        create.getWindow().setAttributes(attributes);
    }

    /* renamed from: G0 */
    private void m16503G0(int i) {
        if (!C4308b.f7482a) {
            C4311i.m12157h(i);
        }
        FragmentTransaction beginTransaction = this.f11136p.beginTransaction();
        SceneFragment sceneFragment = (SceneFragment) this.f11136p.findFragmentByTag(SceneFragment.class.getSimpleName());
        if (sceneFragment == null) {
            sceneFragment = new SceneFragment();
            beginTransaction.add(C11745R$id.layout_fragment, sceneFragment, SceneFragment.class.getSimpleName());
        }
        RoomFragment roomFragment = (RoomFragment) this.f11136p.findFragmentByTag(RoomFragment.class.getSimpleName());
        if (roomFragment == null) {
            roomFragment = new RoomFragment();
            beginTransaction.add(C11745R$id.layout_fragment, roomFragment, RoomFragment.class.getSimpleName());
        }
        NewDeviceListFragment newDeviceListFragment = (NewDeviceListFragment) this.f11136p.findFragmentByTag(NewDeviceListFragment.class.getSimpleName());
        if (newDeviceListFragment == null) {
            newDeviceListFragment = new NewDeviceListFragment();
            beginTransaction.add(C11745R$id.layout_fragment, newDeviceListFragment, NewDeviceListFragment.class.getSimpleName());
        }
        if (i == 0) {
            beginTransaction.show(sceneFragment);
            beginTransaction.hide(roomFragment);
        } else if (i != 1) {
            beginTransaction.hide(sceneFragment);
            beginTransaction.hide(roomFragment);
            beginTransaction.show(newDeviceListFragment);
            beginTransaction.commitAllowingStateLoss();
            m16512P0(i);
        } else {
            beginTransaction.hide(sceneFragment);
            beginTransaction.show(roomFragment);
        }
        beginTransaction.hide(newDeviceListFragment);
        beginTransaction.commitAllowingStateLoss();
        m16512P0(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: H0 */
    public void m16504H0(boolean z) {
        int i;
        View inflate = View.inflate(this, C11748R$layout.rating_application_dialog_layout, (ViewGroup) null);
        inflate.setLayerType(1, (Paint) null);
        ImageView imageView = (ImageView) inflate.findViewById(C11745R$id.share_tag_icon);
        Button button = (Button) inflate.findViewById(C11745R$id.dialog_btn_down);
        TextView textView = (TextView) inflate.findViewById(C11745R$id.share_light_info);
        AlertDialog create = new AlertDialog.Builder(this, 2131820937).create();
        RatingBar ratingBar = (RatingBar) inflate.findViewById(C11745R$id.rating_bar);
        ((ImageView) inflate.findViewById(C11745R$id.view_close_dialog)).setOnClickListener(new C5348i(this, create));
        Button button2 = (Button) inflate.findViewById(C11745R$id.dialog_btn_down);
        if (z) {
            button2.setEnabled(false);
            ratingBar.setVisibility(0);
            i = 2131755107;
        } else {
            button2.setEnabled(true);
            ratingBar.setVisibility(8);
            i = 2131755105;
        }
        button2.setText(i);
        int[] iArr = {0};
        ratingBar.setOnRatingChangeListener(new C5349j(this, iArr, button2));
        button2.setOnClickListener(new C5351l(z, iArr, create));
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
    /* renamed from: I0 */
    public void m16505I0() {
        Toast.makeText(this, getString(2131756146), 0).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: J0 */
    public void m16506J0(int i, C9838i iVar) {
        int i2;
        View inflate = View.inflate(this, C11748R$layout.light_new_share_light_dialog_layout, (ViewGroup) null);
        inflate.setLayerType(1, (Paint) null);
        ImageView imageView = (ImageView) inflate.findViewById(C11745R$id.share_tag_icon);
        Button button = (Button) inflate.findViewById(C11745R$id.dialog_btn_down);
        TextView textView = (TextView) inflate.findViewById(C11745R$id.share_light_info);
        AlertDialog create = new AlertDialog.Builder(this, 2131820937).create();
        if (i == 1) {
            imageView.setImageResource(C10549p.m25765a(4, iVar.mo31761d0()));
            button.setText(2131755509);
            inflate.findViewById(C11745R$id.dialog_btn_down).setOnClickListener(new C5343d(iVar, create));
            inflate.findViewById(C11745R$id.view_close_dialog).setOnClickListener(new C5344e(this, create));
            i2 = 2131755510;
        } else {
            imageView.setImageResource(2131231552);
            button.setText(2131755277);
            inflate.findViewById(C11745R$id.dialog_btn_down).setOnClickListener(new C5345f(this, create));
            inflate.findViewById(C11745R$id.view_close_dialog).setVisibility(4);
            if (i == 3004) {
                i2 = 2131755511;
            } else {
                if (i == 7002) {
                    i2 = 2131755512;
                }
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
                C9789j.m23734b().mo31644a(inflate.getContext(), "");
            }
        }
        textView.setText(i2);
        create.requestWindowFeature(1);
        create.setCancelable(false);
        create.show();
        create.setContentView(inflate);
        Display defaultDisplay2 = getWindowManager().getDefaultDisplay();
        WindowManager.LayoutParams attributes2 = create.getWindow().getAttributes();
        attributes2.height = -2;
        double width2 = (double) defaultDisplay2.getWidth();
        Double.isNaN(width2);
        attributes2.width = (int) (width2 * 0.78d);
        create.getWindow().setAttributes(attributes2);
        C9789j.m23734b().mo31644a(inflate.getContext(), "");
    }

    /* access modifiers changed from: private */
    /* renamed from: K0 */
    public void m16507K0() {
        runOnUiThread(new C5347h());
    }

    /* access modifiers changed from: private */
    /* renamed from: L0 */
    public void m16508L0() {
        Intent intent = new Intent();
        intent.setClass(this, FeedbackV3Activity.class);
        startActivity(intent);
    }

    /* renamed from: M0 */
    private void m16509M0() {
        Intent intent = new Intent();
        intent.setClass(this, PrivacyUpdateActivity.class);
        startActivity(intent);
    }

    /* renamed from: N0 */
    private void m16510N0() {
        Intent intent = new Intent();
        intent.setClass(this, PrivacyWithdrawActivity.class);
        startActivity(intent);
    }

    /* renamed from: O0 */
    private void m16511O0() {
        Runnable runnable;
        TextView textView;
        if (C4201a.m11610z()) {
            textView = this.f11128h;
            runnable = new C5359t();
        } else {
            textView = this.f11128h;
            runnable = new C5361u();
        }
        textView.post(runnable);
    }

    /* renamed from: P0 */
    private void m16512P0(int i) {
        AppConfigurationProvider.m22361n("current_tab", String.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: Q0 */
    public void m16513Q0() {
        if (MiotManager.getDeviceManager() != null) {
            int i = 0;
            for (C6006h next : C4257w.m11947l0().mo23697y0()) {
                if (next.mo23416o0() && next.mo23384N() != null && next.mo23384N().mo29042g()) {
                    i++;
                }
            }
            "updateSlideMenuRedSpotView, update avail: " + i;
            if (i > 0) {
                this.f11134n.get(1).mo26611h(true);
                this.f11134n.get(1).mo26610g(i);
            } else {
                this.f11134n.get(1).mo26611h(false);
                this.f11134n.get(1).mo26610g(0);
            }
            this.f11130j.notifyDataSetChanged();
            try {
                MiotManager.getDeviceManager().querySharedRequests(new C5363w());
            } catch (MiotException e) {
                e.printStackTrace();
            }
            m16501E0();
        }
    }

    /* renamed from: R0 */
    private void m16514R0() {
        this.f11122b.post(new C5341b());
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public void m16538s0() {
        if (this.f11139s > 0 || this.f11140t) {
            this.f11134n.get(2).mo26611h(true);
            this.f11134n.get(2).mo26610g(this.f11139s + (this.f11140t ? 1 : 0));
        } else {
            this.f11134n.get(2).mo26611h(false);
            this.f11134n.get(2).mo26610g(0);
        }
        m16514R0();
        runOnUiThread(new C5799z0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public void m16539t0() {
        if (ContextCompat.checkSelfPermission(this, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 1);
        }
    }

    /* renamed from: v0 */
    private int m16540v0() {
        String f = AppConfigurationProvider.m22353f("current_tab");
        if (f.isEmpty()) {
            return 2;
        }
        return Integer.valueOf(f).intValue();
    }

    /* renamed from: w0 */
    private void m16541w0(int i) {
        if (!C4308b.f7482a) {
            C4311i.m12157h(i);
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        this.f11136p = supportFragmentManager;
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        SceneFragment sceneFragment = new SceneFragment();
        RoomFragment roomFragment = new RoomFragment();
        NewDeviceListFragment newDeviceListFragment = new NewDeviceListFragment();
        beginTransaction.add(C11745R$id.layout_fragment, sceneFragment, SceneFragment.class.getSimpleName());
        beginTransaction.add(C11745R$id.layout_fragment, roomFragment, RoomFragment.class.getSimpleName());
        beginTransaction.add(C11745R$id.layout_fragment, newDeviceListFragment, NewDeviceListFragment.class.getSimpleName());
        if (i == 0) {
            beginTransaction.hide(roomFragment);
        } else if (i != 1) {
            beginTransaction.hide(sceneFragment);
            beginTransaction.hide(roomFragment);
            beginTransaction.commit();
        } else {
            beginTransaction.hide(sceneFragment);
        }
        beginTransaction.hide(newDeviceListFragment);
        beginTransaction.commit();
    }

    /* renamed from: x0 */
    private void m16542x0() {
        ArrayList<C5364x> arrayList = new ArrayList<>();
        this.f11134n = arrayList;
        arrayList.clear();
        this.f11134n.add(new C5364x(this, C11744R$drawable.icon_yeelight_slide_personality, 2131756275, PersonalityLightingActivity.class, false));
        this.f11134n.add(new C5364x(this, C11744R$drawable.icon_yeelight_slide_firmware_upgrade, 2131756271, FirmwareCenterActivity.class, true));
        this.f11134n.add(new C5364x(this, C11744R$drawable.icon_yeelight_slide_mail, 2131756273, MessageCenterActivity.class, false));
        if (C4308b.f7482a) {
            this.f11134n.add(new C5364x(this, C11744R$drawable.icon_yeelight_slide_dev_center, 2131756268, DeveloperCenterActivity.class, false));
        }
        this.f11134n.add(new C5364x(this, C11744R$drawable.icon_yeelight_slide_third_party, 2131756276, ThirdPartyIntegrationActivity.class, false));
        this.f11134n.add(new C5364x(this, C11744R$drawable.icon_yeelight_slide_lan, 2131755595, LanControlListActivity.class, false));
        this.f11134n.add(new C5364x(this, C11744R$drawable.icon_yeelight_slide_forum, 2131756272, ForumActivity.class, false));
        this.f11134n.add(new C5364x(this, C11744R$drawable.icon_yeelight_slide_support, 2131756270, FaqActivity.class, false));
        this.f11134n.add(new C5364x(this, C11744R$drawable.icon_yeelight_slide_more, 2131756274, MoreActivity.class, true));
    }

    /* renamed from: y0 */
    private void m16543y0() {
        int width = ((WindowManager) getApplicationContext().getSystemService("window")).getDefaultDisplay().getWidth();
        SlidingMenu slidingMenu = new SlidingMenu(this);
        this.f11125e = slidingMenu;
        slidingMenu.setMode(0);
        this.f11125e.setTouchModeAbove(0);
        this.f11125e.setShadowWidthRes(2131165591);
        this.f11125e.setBehindOffset((width * 13) / 50);
        this.f11125e.setFadeDegree(0.35f);
        this.f11125e.mo18408f(this, 1, true);
        this.f11125e.setMenu((int) C11748R$layout.slide_menu_layout);
        this.f11125e.setOnOpenedListener(new C5357r());
        this.f11126f = (CircleImageView) findViewById(C11745R$id.user_profile_image);
        this.f11127g = (TextView) findViewById(C11745R$id.user_profile_name);
        this.f11128h = (TextView) findViewById(C11745R$id.user_profile_info);
        ((LinearLayout) findViewById(C11745R$id.user_account_info)).setOnClickListener(new C5358s());
        C5365y yVar = new C5365y(this, (C5350k) null);
        this.f11130j = yVar;
        ((ListView) findViewById(C11745R$id.slide_view_list)).setAdapter(yVar);
    }

    /* renamed from: B */
    public void mo23778B() {
        if (C4312n.f7502j) {
            this.f11134n.get(2).mo26611h(true);
            m16514R0();
        }
    }

    /* renamed from: B0 */
    public /* synthetic */ void mo26572B0(AlertDialog alertDialog, View view) {
        alertDialog.dismiss();
        startActivity(new Intent(this, LanControlListActivity.class));
    }

    /* renamed from: C */
    public void mo23456C(C4201a.C4212k kVar) {
    }

    /* renamed from: D */
    public void mo23610D() {
        if (C4243s.m11829f().mo23596m()) {
            boolean z = true;
            if (C4243s.m11829f().mo23595k() != 1) {
                z = false;
            }
            runOnUiThread(new C5352m(z));
        }
    }

    /* renamed from: G */
    public void mo23779G(String str) {
    }

    /* renamed from: H */
    public void mo23457H() {
        C4201a.m11607r().mo23438B(this);
    }

    /* renamed from: K */
    public void mo26573K() {
    }

    /* renamed from: b */
    public void mo26574b(int i) {
        this.f11122b.setTitle(this.f11123c.get(i));
        this.f11124d = i;
        m16503G0(i);
    }

    /* renamed from: c */
    public void mo23557c(String str) {
        if (!this.f11137q.equals(str)) {
            this.f11137q = str;
            C9807q.m23812c().mo31676f();
            m16542x0();
            runOnUiThread(new C5362v());
        }
    }

    /* renamed from: d */
    public void mo23458d() {
    }

    /* renamed from: e */
    public void mo26575e() {
        m16509M0();
    }

    /* renamed from: g */
    public void mo23459g() {
        m16511O0();
        Intent intent = new Intent(this, WelcomeGuideNewActivity.class);
        intent.setFlags(268468224);
        startActivity(intent);
    }

    /* renamed from: i */
    public void mo23460i() {
        m16511O0();
        C4239r.m11807g().mo23583r();
        if (this.f11138r) {
            C4243s.m11829f().mo23605w();
            this.f11141u.removeMessages(1);
            this.f11141u.sendEmptyMessageDelayed(1, 1000);
            this.f11138r = false;
        }
    }

    /* renamed from: l */
    public void mo23461l() {
    }

    /* renamed from: n */
    public void mo26576n() {
        m16510N0();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0) {
            C4201a.m11607r().mo23438B(this);
        }
    }

    public void onBackPressed() {
        if (this.f11125e.mo18410g()) {
            this.f11125e.mo18421j();
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            startActivity(intent);
            overridePendingTransition(0, 0);
        } catch (Exception unused) {
            System.exit(0);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_main_new);
        ArrayList<String> arrayList = new ArrayList<>();
        this.f11123c = arrayList;
        arrayList.add(getString(2131755728));
        this.f11123c.add(getString(2131755727));
        this.f11123c.add(getString(2131755726));
        this.f11131k = (BottomTabView) findViewById(C11745R$id.bottom_tab_layout);
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        if (fragments != null) {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            for (int i = 0; i < fragments.size(); i++) {
                beginTransaction.remove(fragments.get(i));
            }
            beginTransaction.commit();
        }
        m16542x0();
        m16543y0();
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(C11745R$id.common_tile_bar);
        this.f11122b = commonTitleBar;
        commonTitleBar.setTitleTextColor(2131100134);
        CommonTitleBar commonTitleBar2 = this.f11122b;
        if (C4308b.f7482a) {
            str = this.f11123c.get(this.f11124d) + getString(2131755439);
        } else {
            str = this.f11123c.get(this.f11124d);
        }
        commonTitleBar2.mo32825a(str, new C5350k(), new C5355p());
        this.f11122b.setTitleTextSize(16);
        this.f11122b.setBackgroundColor(getResources().getColor(2131099805));
        this.f11122b.mo32827c(C10547m.m25751a(this, 7.0f), C10547m.m25751a(this, 3.0f), C10547m.m25751a(this, 14.0f), C10547m.m25751a(this, 3.0f));
        setTitleBarPadding(this.f11122b);
        m16513Q0();
        m16514R0();
        int v0 = m16540v0();
        this.f11124d = v0;
        m16541w0(v0);
        if (getIntent().getBooleanExtra("report_privacy", false)) {
            C9807q.m23812c().mo31678h(true);
        } else {
            C9807q.m23812c().mo31674d();
        }
        C9807q.m23812c().mo31676f();
        this.f11141u.sendEmptyMessageDelayed(2, 1000);
        this.f11141u.sendEmptyMessageDelayed(3, 1500);
        m16500D0();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C9891b bVar = this.f11133m;
        if (bVar != null && bVar.isShowing()) {
            this.f11133m.dismiss();
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        String str;
        Class cls;
        super.onNewIntent(intent);
        setIntent(intent);
        mo26577u0();
        "On New Intent :" + intent.toString();
        if (intent.hasExtra("com.yeelight.cherry.device_id")) {
            String stringExtra = intent.getStringExtra("com.yeelight.cherry.device_id");
            C4200i o0 = C4257w.m11953o0(stringExtra);
            if (o0 != null) {
                Intent intent2 = new Intent();
                intent2.putExtra("com.yeelight.cherry.device_id", stringExtra);
                if (!(o0 instanceof C6005g)) {
                    if (o0 instanceof C5980c) {
                        if (o0.mo23331k0()) {
                            intent2.setClass(this, DemoControlViewActivity.class);
                            intent2.setFlags(603979776);
                            str = "group_flag";
                        } else {
                            return;
                        }
                    } else if (o0 instanceof C6017a) {
                        if (o0.mo23331k0()) {
                            cls = ComboDeviceControlActivity.class;
                        } else {
                            return;
                        }
                    } else if (o0 instanceof C6418d1) {
                        if (o0.mo23331k0()) {
                            cls = SpeakerDeviceControlActivity.class;
                        } else {
                            return;
                        }
                    } else if (o0 instanceof C7130o0) {
                        if (o0.mo23331k0()) {
                            cls = MeshGatewayControlActivity.class;
                        } else {
                            return;
                        }
                    } else if (o0 instanceof C7472y) {
                        if (o0.mo23331k0()) {
                            cls = intent.getBooleanExtra("CURTAIN_CONFIG", false) ? CurtainGuideActivity.class : CurtainControlActivity.class;
                        } else {
                            return;
                        }
                    } else if (o0 instanceof C6922j1) {
                        if (o0.mo23331k0()) {
                            cls = SwitchControlActivity.class;
                        } else {
                            return;
                        }
                    } else if (o0 instanceof C6318b1) {
                        if (o0.mo23331k0()) {
                            cls = PlugControlActivity.class;
                        } else {
                            return;
                        }
                    } else if (!(o0 instanceof C6033g)) {
                        intent2.setClass(this, DemoControlViewActivity.class);
                        intent2.setFlags(603979776);
                        if ("yeelink.light.color6".equals(o0.mo23395T())) {
                            str = "google_home_hint_key";
                        }
                        startActivity(intent2);
                    } else if (o0.mo23331k0()) {
                        cls = FanclControlViewActivity.class;
                    } else {
                        return;
                    }
                    intent2.putExtra(str, true);
                    startActivity(intent2);
                } else if (o0.mo23331k0()) {
                    intent2.setClass(this, DemoControlViewActivity.class);
                    intent2.putExtra("room_flag", true);
                    intent2.setFlags(603979776);
                    startActivity(intent2);
                } else {
                    cls = RoomMainActivity.class;
                }
                intent2.setClass(this, cls);
                intent2.setFlags(603979776);
                startActivity(intent2);
            }
        } else if (intent.hasExtra("com.yeelight.cherry.fragment")) {
            this.f11124d = intent.getIntExtra("com.yeelight.cherry.fragment", 0);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f11131k.mo27415h();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f11135o = false;
        this.f11141u.removeMessages(0);
        this.f11141u.sendEmptyMessageDelayed(0, 3000);
        this.f11131k.mo27414f(this);
        this.f11131k.setSelected(this.f11124d);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        CharSequence charSequence;
        super.onStart();
        CommonTitleBar commonTitleBar = this.f11122b;
        if (C4308b.f7482a) {
            charSequence = this.f11123c.get(this.f11124d) + getString(2131755439);
        } else {
            charSequence = this.f11123c.get(this.f11124d);
        }
        commonTitleBar.setTitle(charSequence);
        C4201a.m11607r().mo23444M(this);
        m16511O0();
        C9807q.m23812c().mo31677g(this);
        C4230l.m11766b().mo23554e(this);
        C4243s.m11829f().mo23599q(this);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C4201a.m11607r().mo23445N(this);
        C9807q.m23812c().mo31679i();
        C4230l.m11766b().mo23556g(this);
        C4243s.m11829f().mo23601s();
        this.f11141u.removeMessages(0);
        if (this.f11135o) {
            this.f11125e.mo18422k(false);
        }
    }

    /* renamed from: q */
    public void mo23462q(String str) {
    }

    /* renamed from: r */
    public void mo23463r(String str) {
    }

    /* renamed from: u */
    public void mo23611u() {
        runOnUiThread(new C5354o());
    }

    /* renamed from: u0 */
    public void mo26577u0() {
        try {
            Object systemService = getSystemService("statusbar");
            systemService.getClass().getMethod("collapsePanels", new Class[0]).invoke(systemService, new Object[0]);
        } catch (Exception unused) {
        }
    }

    /* renamed from: z */
    public void mo23612z(int i) {
        runOnUiThread(new C5353n(i));
    }

    /* renamed from: z0 */
    public /* synthetic */ void mo26578z0() {
        this.f11130j.notifyDataSetChanged();
    }
}
