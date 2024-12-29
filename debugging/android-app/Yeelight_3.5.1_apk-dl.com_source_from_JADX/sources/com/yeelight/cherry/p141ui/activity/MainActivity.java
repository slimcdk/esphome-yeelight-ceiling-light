package com.yeelight.cherry.p141ui.activity;

import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.database.ContentObserver;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
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
import com.squareup.picasso.Picasso;
import com.yeelight.cherry.C12224R$drawable;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.fragment.NewDeviceListFragment;
import com.yeelight.cherry.p141ui.fragment.RoomFragment;
import com.yeelight.cherry.p141ui.fragment.SceneFragment;
import com.yeelight.cherry.p141ui.view.BottomTabView;
import com.yeelight.yeelib.data.AppConfigurationProvider;
import com.yeelight.yeelib.data.C6043b;
import com.yeelight.yeelib.device.C6119c;
import com.yeelight.yeelib.device.C6169f;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.C6091a;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.managers.C3088r;
import com.yeelight.yeelib.managers.C3092s;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.managers.C8281l;
import com.yeelight.yeelib.managers.C8287q;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.activity.FeedbackV3Activity;
import com.yeelight.yeelib.p142ui.activity.LanControlListActivity;
import com.yeelight.yeelib.p142ui.view.CircleImageView;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.retrofit.ContentType;
import com.yeelight.yeelib.service.MiotPrivacyService;
import com.yeelight.yeelib.utils.AppUtils;
import com.yeelight.yeelib.wear.WearService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p051j4.C3278f;
import p051j4.C3279g;
import p051j4.C3280l;
import p051j4.C3283v;
import p051j4.C9193k;
import p051j4.C9197p;
import p129b4.C3988b;
import p134c4.C4007b;
import p160g4.C9065b;
import p170i4.C9107b;
import p207s3.C10337c;
import p223w3.C10797d1;
import p223w3.C10916f1;
import p223w3.C11406l1;
import p223w3.C11571p0;
import p223w3.C11911z;

/* renamed from: com.yeelight.cherry.ui.activity.MainActivity */
public class MainActivity extends BaseActivity implements C3051a.C3052i, BottomTabView.C6022a, C3280l.C3282b, C8287q.C8292e, C8281l.C3080a, C3092s.C3095c {
    /* access modifiers changed from: private */

    /* renamed from: x */
    public static final String f10687x = "MainActivity";

    /* renamed from: y */
    public static final /* synthetic */ int f10688y = 0;

    /* renamed from: a */
    CommonTitleBar f10689a;

    /* renamed from: b */
    ArrayList<String> f10690b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f10691c;

    /* renamed from: d */
    SlidingMenu f10692d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public CircleImageView f10693e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public TextView f10694f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public TextView f10695g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f10696h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C5412x f10697i;

    /* renamed from: j */
    BottomTabView f10698j;

    /* renamed from: k */
    C9107b.C9109b f10699k = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C9065b f10700l;

    /* renamed from: m */
    ArrayList<C5411w> f10701m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f10702n;

    /* renamed from: o */
    private FragmentManager f10703o;

    /* renamed from: p */
    private String f10704p = "";

    /* renamed from: q */
    private boolean f10705q = true;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f10706r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f10707s;

    /* renamed from: t */
    private boolean f10708t = false;

    /* renamed from: u */
    private ContentObserver f10709u = new C5398k(new Handler(Looper.getMainLooper()));

    /* renamed from: v */
    private ServiceConnection f10710v = new C5402o(this);
    /* access modifiers changed from: private */

    /* renamed from: w */
    public Handler f10711w = new C5393f();

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$a */
    class C5388a implements Runnable {
        C5388a() {
        }

        public void run() {
            MainActivity.this.f10693e.setImageResource(2131231281);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$b */
    class C5389b implements Runnable {
        C5389b() {
        }

        public void run() {
            MainActivity.this.f10697i.notifyDataSetChanged();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$c */
    class C5390c implements CommonHandler<List<SharedRequest>> {
        C5390c() {
        }

        /* renamed from: a */
        public void onSucceed(List<SharedRequest> list) {
            String unused = MainActivity.f10687x;
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getShareStatus().equals(ShareStatus.pending)) {
                    arrayList.add(list.get(i));
                }
            }
            int size = arrayList.size();
            if (C3280l.f5290j) {
                size++;
            }
            int unused2 = MainActivity.this.f10706r = size;
            MainActivity.this.m16482t0();
        }

        public void onFailed(int i, String str) {
            String unused = MainActivity.f10687x;
            StringBuilder sb = new StringBuilder();
            sb.append("querySharedRequests onFailed: ");
            sb.append(i);
            sb.append(" ");
            sb.append(str);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$d */
    class C5391d implements C4007b<String> {
        C5391d() {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            String unused = MainActivity.f10687x;
            StringBuilder sb = new StringBuilder();
            sb.append("query news onSuccess: ");
            sb.append(str);
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
                        boolean unused2 = mainActivity.f10707s = z;
                        MainActivity.this.m16482t0();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }

        public void onFailure(int i, String str) {
            String unused = MainActivity.f10687x;
            StringBuilder sb = new StringBuilder();
            sb.append("query news onFailure: ");
            sb.append(str);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$e */
    class C5392e implements Runnable {
        C5392e() {
        }

        public void run() {
            boolean z;
            CommonTitleBar commonTitleBar;
            if (!MainActivity.this.f10696h) {
                z = true;
                if (MainActivity.this.f10701m.get(1).mo30629f() || MainActivity.this.f10701m.get(2).mo30629f()) {
                    commonTitleBar = MainActivity.this.f10689a;
                    commonTitleBar.setLeftButtonRedSpot(z);
                }
            }
            commonTitleBar = MainActivity.this.f10689a;
            z = false;
            commonTitleBar.setLeftButtonRedSpot(z);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$f */
    class C5393f extends Handler {
        C5393f() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                C3092s.m8139f().mo23490o();
            } else if (i == 3) {
                try {
                    MainActivity.this.startService(new Intent(MainActivity.this, WearService.class));
                } catch (IllegalStateException e) {
                    C9197p.m22181n(e);
                }
            } else if (i == 4) {
                YeelightDeviceManager.m7747A1(false);
                YeelightDeviceManager.m7754F1();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$g */
    class C5394g implements Runnable {
        C5394g() {
        }

        public void run() {
            MainActivity mainActivity = MainActivity.this;
            mainActivity.f10699k = new C9107b.C9109b(mainActivity);
            MainActivity mainActivity2 = MainActivity.this;
            mainActivity2.f10699k.mo37128b(0, mainActivity2.getString(2131755106));
            MainActivity.this.f10699k.mo37130d();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$h */
    class C5395h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f10719a;

        C5395h(MainActivity mainActivity, AlertDialog alertDialog) {
            this.f10719a = alertDialog;
        }

        public void onClick(View view) {
            C3092s.m8139f().mo23500y(C3092s.m8139f().mo23487j() * 2);
            C3092s.m8139f().mo23493r();
            this.f10719a.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$i */
    class C5396i implements RatingBar.C2637b {

        /* renamed from: a */
        final /* synthetic */ int[] f10720a;

        /* renamed from: b */
        final /* synthetic */ Button f10721b;

        C5396i(MainActivity mainActivity, int[] iArr, Button button) {
            this.f10720a = iArr;
            this.f10721b = button;
        }

        /* renamed from: a */
        public void mo19708a(float f) {
            this.f10720a[0] = (int) f;
            this.f10721b.setEnabled(true);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$j */
    class C5397j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ boolean f10722a;

        /* renamed from: b */
        final /* synthetic */ int[] f10723b;

        /* renamed from: c */
        final /* synthetic */ AlertDialog f10724c;

        C5397j(boolean z, int[] iArr, AlertDialog alertDialog) {
            this.f10722a = z;
            this.f10723b = iArr;
            this.f10724c = alertDialog;
        }

        public void onClick(View view) {
            if (this.f10722a) {
                C3092s.m8139f().mo23491p(this.f10723b[0]);
                MainActivity.this.m16450K0();
            } else {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("market://details?id=com.yeelight.cherry"));
                MainActivity.this.startActivity(intent);
            }
            C3092s.m8139f().mo23497v();
            C3092s.m8139f().mo23493r();
            C3092s.m8139f().mo23500y(10);
            this.f10724c.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$k */
    class C5398k extends ContentObserver {
        C5398k(Handler handler) {
            super(handler);
        }

        public void onChange(boolean z) {
            super.onChange(z);
            String unused = MainActivity.f10687x;
            MainActivity.this.f10711w.removeMessages(4);
            MainActivity.this.f10711w.sendEmptyMessageDelayed(4, 1500);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$l */
    class C5399l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f10727a;

        C5399l(boolean z) {
            this.f10727a = z;
        }

        public void run() {
            MainActivity.this.m16448I0(this.f10727a);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$m */
    class C5400m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f10729a;

        C5400m(int i) {
            this.f10729a = i;
        }

        public void run() {
            MainActivity mainActivity = MainActivity.this;
            mainActivity.f10699k.mo37128b(1, mainActivity.getString(2131755107));
            if (this.f10729a < 4) {
                MainActivity.this.m16451L0();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$n */
    class C5401n implements Runnable {
        C5401n() {
        }

        public void run() {
            MainActivity mainActivity = MainActivity.this;
            mainActivity.f10699k.mo37128b(2, mainActivity.getString(2131756078));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$o */
    class C5402o implements ServiceConnection {
        C5402o(MainActivity mainActivity) {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            String unused = MainActivity.f10687x;
        }

        public void onServiceDisconnected(ComponentName componentName) {
            String unused = MainActivity.f10687x;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$p */
    class C5403p implements View.OnClickListener {
        C5403p() {
        }

        public void onClick(View view) {
            boolean unused = MainActivity.this.f10696h = true;
            MainActivity.this.f10692d.mo20047n();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$q */
    class C5404q implements View.OnClickListener {
        C5404q() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m16514b(AdapterView adapterView, View view, int i, long j) {
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
            if (C8287q.m19593e().mo35242i()) {
                MainActivity.this.m16449J0();
                return;
            }
            int n0 = MainActivity.this.f10691c;
            if (n0 == 0) {
                intent = new Intent(MainActivity.this, CreateSceneActivity.class);
            } else if (n0 == 1) {
                intent = new Intent(MainActivity.this, ImageModeSelectionActivity.class);
                intent.putExtra("image_type", 2);
            } else if (n0 == 2) {
                if (MainActivity.this.f10700l == null) {
                    MainActivity mainActivity = MainActivity.this;
                    C9065b unused = mainActivity.f10700l = new C9065b.C9067b(mainActivity).mo37006d(new int[]{2131756234, 2131755576, 2131755577}).mo37008f(new C5807o1(this)).mo37004b();
                }
                MainActivity.this.f10700l.show();
                return;
            } else {
                return;
            }
            MainActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$r */
    class C5405r implements C4007b<String> {
        C5405r() {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            JSONObject optJSONObject;
            String unused = MainActivity.f10687x;
            StringBuilder sb = new StringBuilder();
            sb.append("is_alexa_local_control_user onSuccess: ");
            sb.append(str);
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("code")) {
                        String optString = jSONObject.optString("code");
                        String unused2 = MainActivity.f10687x;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("is_local_control_user code: ");
                        sb2.append(optString);
                        if (TextUtils.equals(optString, "200") && (optJSONObject = jSONObject.optJSONObject(Packet.DATA)) != null && optJSONObject.optBoolean("alexaUser")) {
                            C3283v.m8844j(C3051a.m7925r().mo23366v() + "ALEXA_LOCAL_USER_HAD_SHOW", true);
                            MainActivity.this.m16446G0();
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }

        public void onFailure(int i, String str) {
            String unused = MainActivity.f10687x;
            StringBuilder sb = new StringBuilder();
            sb.append("is_local_control_user onFailure: ");
            sb.append(str);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$s */
    class C5406s implements SlidingMenu.C2679g {
        C5406s() {
        }

        /* renamed from: a */
        public void mo20101a() {
            boolean unused = MainActivity.this.f10696h = true;
            MainActivity.this.m16456R0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$t */
    class C5407t implements View.OnApplyWindowInsetsListener {
        C5407t() {
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            MainActivity.this.f10689a.setPadding(0, windowInsets.getSystemWindowInsetTop(), 0, 0);
            windowInsets.consumeSystemWindowInsets();
            return windowInsets;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$u */
    class C5408u implements View.OnClickListener {
        C5408u() {
        }

        public void onClick(View view) {
            boolean unused = MainActivity.this.f10702n = true;
            if (C3051a.m7928z()) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, AccountCenterActivity.class));
                return;
            }
            C3051a.m7925r().mo23352B(MainActivity.this);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$v */
    class C5409v implements Runnable {

        /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$v$a */
        class C5410a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f10739a;

            C5410a(String str) {
                this.f10739a = str;
            }

            public void run() {
                Picasso.m12253o(C3108x.f4951e).mo28111j(this.f10739a).mo28225f(2131231281).mo28223d(MainActivity.this.f10693e);
            }
        }

        C5409v() {
        }

        public void run() {
            MainActivity.this.f10694f.setText(C3051a.m7925r().mo23367w());
            TextView b0 = MainActivity.this.f10695g;
            b0.setText("MI ID : " + C3051a.m7925r().mo23366v());
            String p = C3051a.m7925r().mo23363p();
            if (!TextUtils.isEmpty(p)) {
                MainActivity.this.f10693e.post(new C5410a(p));
            } else {
                MainActivity.this.f10693e.setImageResource(2131231281);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$w */
    private class C5411w {

        /* renamed from: a */
        private int f10741a;

        /* renamed from: b */
        private int f10742b;

        /* renamed from: c */
        private Class f10743c;

        /* renamed from: d */
        private boolean f10744d = false;

        /* renamed from: e */
        private int f10745e;

        /* renamed from: f */
        private boolean f10746f = false;

        C5411w(MainActivity mainActivity, int i, int i2, Class cls, boolean z) {
            this.f10741a = i;
            this.f10742b = i2;
            this.f10743c = cls;
            this.f10746f = z;
        }

        /* renamed from: a */
        public int mo30624a() {
            return this.f10745e;
        }

        /* renamed from: b */
        public int mo30625b() {
            return this.f10741a;
        }

        /* renamed from: c */
        public int mo30626c() {
            return this.f10742b;
        }

        /* renamed from: d */
        public Class mo30627d() {
            return this.f10743c;
        }

        /* renamed from: e */
        public boolean mo30628e() {
            return this.f10746f;
        }

        /* renamed from: f */
        public boolean mo30629f() {
            return this.f10744d;
        }

        /* renamed from: g */
        public void mo30630g(int i) {
            this.f10745e = i;
        }

        /* renamed from: h */
        public void mo30631h(boolean z) {
            this.f10744d = z;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$x */
    private class C5412x extends BaseAdapter {

        /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$x$a */
        class C5413a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f10748a;

            C5413a(int i) {
                this.f10748a = i;
            }

            public void onClick(View view) {
                C3279g.m8812l(this.f10748a);
                if (MainActivity.this.f10701m.get(this.f10748a).mo30628e() || !C8287q.m19593e().mo35242i()) {
                    Class d = MainActivity.this.f10701m.get(this.f10748a).mo30627d();
                    if (d != null) {
                        boolean unused = MainActivity.this.f10702n = true;
                        Intent intent = new Intent();
                        intent.setClass(view.getContext(), d);
                        MainActivity.this.startActivity(intent);
                        return;
                    }
                    return;
                }
                MainActivity.this.m16449J0();
            }
        }

        private C5412x() {
        }

        /* synthetic */ C5412x(MainActivity mainActivity, C5398k kVar) {
            this();
        }

        public int getCount() {
            return MainActivity.this.f10701m.size();
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C5414y yVar;
            if (view == null) {
                yVar = new C5414y(MainActivity.this, (C5398k) null);
                view2 = LayoutInflater.from(MainActivity.this).inflate(C12228R$layout.slide_menu_item_layout, (ViewGroup) null);
                view2.setTag(yVar);
            } else {
                view2 = view;
                yVar = (C5414y) view.getTag();
            }
            yVar.f10750a = (ImageView) view2.findViewById(C12225R$id.slide_item_badge_view);
            yVar.f10751b = (TextView) view2.findViewById(C12225R$id.slide_item_title_view);
            yVar.f10752c = (TextView) view2.findViewById(C12225R$id.message_tips_view);
            yVar.f10750a.setImageResource(MainActivity.this.f10701m.get(i).mo30625b());
            yVar.f10751b.setText(MainActivity.this.f10701m.get(i).mo30626c());
            if (MainActivity.this.f10701m.get(i).mo30629f()) {
                yVar.f10752c.setVisibility(0);
                yVar.f10752c.setText(String.valueOf(MainActivity.this.f10701m.get(i).mo30624a()));
            } else {
                yVar.f10752c.setVisibility(8);
            }
            view2.setOnClickListener(new C5413a(i));
            return view2;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MainActivity$y */
    private class C5414y {

        /* renamed from: a */
        public ImageView f10750a;

        /* renamed from: b */
        public TextView f10751b;

        /* renamed from: c */
        public TextView f10752c;

        private C5414y(MainActivity mainActivity) {
        }

        /* synthetic */ C5414y(MainActivity mainActivity, C5398k kVar) {
            this(mainActivity);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public /* synthetic */ void m16441A0() {
        this.f10697i.notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    /* renamed from: C0 */
    public /* synthetic */ void m16443C0(AlertDialog alertDialog, View view) {
        alertDialog.dismiss();
        startActivity(new Intent(this, LanControlListActivity.class));
    }

    /* renamed from: E0 */
    private void m16444E0() {
        boolean b = C3283v.m8836b(C3051a.m7925r().mo23366v() + "ALEXA_LOCAL_USER_HAD_SHOW", false);
        StringBuilder sb = new StringBuilder();
        sb.append("requestIsGoogleHomeLocalUser: ");
        sb.append(b);
        if (!b) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("userId", C3051a.m7925r().mo23366v());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C3988b.m11575k(AppUtils.f4988l + "third/r/alexauser", (Map<String, String>) null, (Map<String, String>) null, jSONObject.toString(), String.class, new C5405r(), true, ContentType.JSON);
        }
    }

    /* renamed from: F0 */
    private void m16445F0() {
        C3988b.m11567c(AppUtils.f4993q + "notice/has_new_notice/" + C3051a.m7925r().mo23366v(), String.class, new C5391d());
    }

    /* access modifiers changed from: private */
    /* renamed from: G0 */
    public void m16446G0() {
        View inflate = View.inflate(this, C12228R$layout.dialog_alexa_user_hint, (ViewGroup) null);
        inflate.setLayerType(1, (Paint) null);
        AlertDialog create = new AlertDialog.Builder(this, 2131820942).create();
        create.requestWindowFeature(1);
        create.setCancelable(false);
        create.show();
        create.setContentView(inflate);
        ((ImageView) inflate.findViewById(C12225R$id.view_close_dialog)).setOnClickListener(new C5784k1(create));
        ((Button) inflate.findViewById(C12225R$id.dialog_btn_down)).setOnClickListener(new C5790l1(this, create));
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        WindowManager.LayoutParams attributes = create.getWindow().getAttributes();
        attributes.height = -2;
        double width = (double) defaultDisplay.getWidth();
        Double.isNaN(width);
        attributes.width = (int) (width * 0.78d);
        create.getWindow().setAttributes(attributes);
    }

    /* renamed from: H0 */
    private void m16447H0(int i) {
        if (!AppUtils.f4977a) {
            C3279g.m8808h(i);
        }
        FragmentTransaction beginTransaction = this.f10703o.beginTransaction();
        SceneFragment sceneFragment = (SceneFragment) this.f10703o.findFragmentByTag(SceneFragment.class.getSimpleName());
        if (sceneFragment == null) {
            sceneFragment = new SceneFragment();
            beginTransaction.add(C12225R$id.layout_fragment, sceneFragment, SceneFragment.class.getSimpleName());
        }
        RoomFragment roomFragment = (RoomFragment) this.f10703o.findFragmentByTag(RoomFragment.class.getSimpleName());
        if (roomFragment == null) {
            roomFragment = new RoomFragment();
            beginTransaction.add(C12225R$id.layout_fragment, roomFragment, RoomFragment.class.getSimpleName());
        }
        NewDeviceListFragment newDeviceListFragment = (NewDeviceListFragment) this.f10703o.findFragmentByTag(NewDeviceListFragment.class.getSimpleName());
        if (newDeviceListFragment == null) {
            newDeviceListFragment = new NewDeviceListFragment();
            beginTransaction.add(C12225R$id.layout_fragment, newDeviceListFragment, NewDeviceListFragment.class.getSimpleName());
        }
        if (i == 0) {
            beginTransaction.show(sceneFragment);
            beginTransaction.hide(roomFragment);
        } else if (i != 1) {
            beginTransaction.hide(sceneFragment);
            beginTransaction.hide(roomFragment);
            beginTransaction.show(newDeviceListFragment);
            beginTransaction.commitAllowingStateLoss();
            m16455Q0(i);
        } else {
            beginTransaction.hide(sceneFragment);
            beginTransaction.show(roomFragment);
        }
        beginTransaction.hide(newDeviceListFragment);
        beginTransaction.commitAllowingStateLoss();
        m16455Q0(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: I0 */
    public void m16448I0(boolean z) {
        int i;
        View inflate = View.inflate(this, C12228R$layout.rating_application_dialog_layout, (ViewGroup) null);
        inflate.setLayerType(1, (Paint) null);
        ImageView imageView = (ImageView) inflate.findViewById(C12225R$id.share_tag_icon);
        Button button = (Button) inflate.findViewById(C12225R$id.dialog_btn_down);
        TextView textView = (TextView) inflate.findViewById(C12225R$id.share_light_info);
        AlertDialog create = new AlertDialog.Builder(this, 2131820942).create();
        RatingBar ratingBar = (RatingBar) inflate.findViewById(C12225R$id.rating_bar);
        ((ImageView) inflate.findViewById(C12225R$id.view_close_dialog)).setOnClickListener(new C5395h(this, create));
        Button button2 = (Button) inflate.findViewById(C12225R$id.dialog_btn_down);
        if (z) {
            button2.setEnabled(false);
            ratingBar.setVisibility(0);
            i = 2131755106;
        } else {
            button2.setEnabled(true);
            ratingBar.setVisibility(8);
            i = 2131755104;
        }
        button2.setText(i);
        int[] iArr = {0};
        ratingBar.setOnRatingChangeListener(new C5396i(this, iArr, button2));
        button2.setOnClickListener(new C5397j(z, iArr, create));
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
    /* renamed from: J0 */
    public void m16449J0() {
        Toast.makeText(this, getString(2131756170), 0).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: K0 */
    public void m16450K0() {
        runOnUiThread(new C5394g());
    }

    /* access modifiers changed from: private */
    /* renamed from: L0 */
    public void m16451L0() {
        Intent intent = new Intent();
        intent.setClass(this, FeedbackV3Activity.class);
        startActivity(intent);
    }

    /* renamed from: M0 */
    private void m16452M0() {
        Intent intent = new Intent();
        intent.setClass(this, PrivacyUpdateActivity.class);
        startActivity(intent);
    }

    /* renamed from: N0 */
    private void m16453N0() {
        Intent intent = new Intent();
        intent.setClass(this, PrivacyWithdrawActivity.class);
        startActivity(intent);
    }

    /* renamed from: P0 */
    private void m16454P0() {
        Runnable runnable;
        TextView textView;
        if (C3051a.m7928z()) {
            textView = this.f10695g;
            runnable = new C5409v();
        } else {
            textView = this.f10695g;
            runnable = new C5388a();
        }
        textView.post(runnable);
    }

    /* renamed from: Q0 */
    private void m16455Q0(int i) {
        AppConfigurationProvider.m17582n("current_tab", String.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: R0 */
    public void m16456R0() {
        if (MiotManager.getDeviceManager() != null) {
            int i = 0;
            for (WifiDeviceBase next : YeelightDeviceManager.m7800o0().mo23253B0()) {
                if (next.mo23230o0() && next.mo23197N() != null && next.mo23197N().mo42513g()) {
                    i++;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("updateSlideMenuRedSpotView, update avail: ");
            sb.append(i);
            if (i > 0) {
                this.f10701m.get(1).mo30631h(true);
                this.f10701m.get(1).mo30630g(i);
            } else {
                this.f10701m.get(1).mo30631h(false);
                this.f10701m.get(1).mo30630g(0);
            }
            this.f10697i.notifyDataSetChanged();
            try {
                MiotManager.getDeviceManager().querySharedRequests(new C5390c());
            } catch (MiotException e) {
                e.printStackTrace();
            }
            m16445F0();
        }
    }

    /* renamed from: S0 */
    private void m16457S0() {
        this.f10689a.post(new C5392e());
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public void m16482t0() {
        if (this.f10706r > 0 || this.f10707s) {
            this.f10701m.get(2).mo30631h(true);
            this.f10701m.get(2).mo30630g(this.f10706r + (this.f10707s ? 1 : 0));
        } else {
            this.f10701m.get(2).mo30631h(false);
            this.f10701m.get(2).mo30630g(0);
        }
        m16457S0();
        runOnUiThread(new C5796m1(this));
    }

    /* renamed from: v0 */
    private int m16483v0() {
        String f = AppConfigurationProvider.m17574f("current_tab");
        if (f.isEmpty()) {
            return 2;
        }
        return Integer.valueOf(f).intValue();
    }

    /* renamed from: w0 */
    private void m16484w0() {
        if (AppUtils.f4978b || !AppUtils.f4977a) {
            C3278f.m8796a(this, "Main");
            this.f10708t = true;
            bindService(new Intent(this, MiotPrivacyService.class), this.f10710v, 1);
        }
    }

    /* renamed from: x0 */
    private void m16485x0(int i) {
        if (!AppUtils.f4977a) {
            C3279g.m8808h(i);
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        this.f10703o = supportFragmentManager;
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        SceneFragment sceneFragment = new SceneFragment();
        RoomFragment roomFragment = new RoomFragment();
        NewDeviceListFragment newDeviceListFragment = new NewDeviceListFragment();
        beginTransaction.add(C12225R$id.layout_fragment, sceneFragment, SceneFragment.class.getSimpleName());
        beginTransaction.add(C12225R$id.layout_fragment, roomFragment, RoomFragment.class.getSimpleName());
        beginTransaction.add(C12225R$id.layout_fragment, newDeviceListFragment, NewDeviceListFragment.class.getSimpleName());
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

    /* renamed from: y0 */
    private void m16486y0() {
        ArrayList<C5411w> arrayList = new ArrayList<>();
        this.f10701m = arrayList;
        arrayList.clear();
        this.f10701m.add(new C5411w(this, C12224R$drawable.icon_yeelight_slide_personality, 2131756304, PersonalityLightingActivity.class, false));
        this.f10701m.add(new C5411w(this, C12224R$drawable.icon_yeelight_slide_firmware_upgrade, 2131756300, FirmwareCenterActivity.class, true));
        this.f10701m.add(new C5411w(this, C12224R$drawable.icon_yeelight_slide_mail, 2131756302, MessageCenterActivity.class, false));
        if (AppUtils.f4977a) {
            this.f10701m.add(new C5411w(this, C12224R$drawable.icon_yeelight_slide_dev_center, 2131756297, DeveloperCenterActivity.class, false));
        }
        this.f10701m.add(new C5411w(this, C12224R$drawable.icon_yeelight_slide_third_party, 2131756305, ThirdPartyIntegrationActivity.class, false));
        this.f10701m.add(new C5411w(this, C12224R$drawable.icon_yeelight_slide_lan, 2131755598, LanControlListActivity.class, false));
        this.f10701m.add(new C5411w(this, C12224R$drawable.icon_yeelight_slide_forum, 2131756301, ForumActivity.class, false));
        this.f10701m.add(new C5411w(this, C12224R$drawable.icon_yeelight_slide_support, 2131756299, FaqActivity.class, false));
        this.f10701m.add(new C5411w(this, C12224R$drawable.icon_yeelight_slide_more, 2131756303, MoreActivity.class, true));
    }

    /* renamed from: z0 */
    private void m16487z0() {
        int width = ((WindowManager) getApplicationContext().getSystemService("window")).getDefaultDisplay().getWidth();
        SlidingMenu slidingMenu = new SlidingMenu(this);
        this.f10692d = slidingMenu;
        slidingMenu.setMode(0);
        this.f10692d.setTouchModeAbove(0);
        this.f10692d.setShadowWidthRes(2131165594);
        this.f10692d.setBehindOffset((width * 13) / 50);
        this.f10692d.setFadeDegree(0.35f);
        this.f10692d.mo20030f(this, 1, true);
        this.f10692d.setMenu((int) C12228R$layout.slide_menu_layout);
        this.f10692d.setOnOpenedListener(new C5406s());
        if (Build.VERSION.SDK_INT >= 20) {
            this.f10692d.setOnApplyWindowInsetsListener(new C5407t());
        }
        this.f10693e = (CircleImageView) findViewById(C12225R$id.user_profile_image);
        this.f10694f = (TextView) findViewById(C12225R$id.user_profile_name);
        this.f10695g = (TextView) findViewById(C12225R$id.user_profile_info);
        ((LinearLayout) findViewById(C12225R$id.user_account_info)).setOnClickListener(new C5408u());
        C5412x xVar = new C5412x(this, (C5398k) null);
        this.f10697i = xVar;
        ((ListView) findViewById(C12225R$id.slide_view_list)).setAdapter(xVar);
    }

    /* renamed from: B */
    public void mo23862B() {
        if (C3280l.f5290j) {
            this.f10701m.get(2).mo30631h(true);
            m16457S0();
        }
    }

    /* renamed from: C */
    public void mo23255C(C3051a.C3062k kVar) {
    }

    /* renamed from: D */
    public void mo23503D() {
        if (C3092s.m8139f().mo23489m()) {
            boolean z = true;
            if (C3092s.m8139f().mo23488k() != 1) {
                z = false;
            }
            runOnUiThread(new C5399l(z));
        }
    }

    /* renamed from: D0 */
    public void mo30595D0() {
        C3108x.f4951e.getContentResolver().registerContentObserver(C6043b.C6052e.f12375a, true, this.f10709u);
    }

    /* renamed from: G */
    public void mo23863G(String str) {
    }

    /* renamed from: H */
    public void mo23262H() {
        C3051a.m7925r().mo23352B(this);
    }

    /* renamed from: K */
    public void mo30596K() {
    }

    /* renamed from: O0 */
    public void mo30597O0() {
        C3108x.f4951e.getContentResolver().unregisterContentObserver(this.f10709u);
    }

    /* renamed from: b */
    public void mo30598b(int i) {
        this.f10689a.setTitle(this.f10690b.get(i));
        this.f10691c = i;
        m16447H0(i);
    }

    /* renamed from: c */
    public void mo23281c(String str) {
        if (!this.f10704p.equals(str)) {
            this.f10704p = str;
            C8287q.m19593e().mo35243j();
            m16486y0();
            runOnUiThread(new C5389b());
        }
    }

    /* renamed from: d */
    public void mo23283d() {
    }

    /* renamed from: e */
    public void mo30599e() {
        m16452M0();
    }

    /* renamed from: g */
    public void mo23288g() {
        m16454P0();
        Intent intent = new Intent(this, WelcomeGuideNewActivity.class);
        intent.setFlags(268468224);
        startActivity(intent);
    }

    /* renamed from: h */
    public void mo23291h() {
        m16454P0();
        C3088r.m8117g().mo23476r();
        if (this.f10705q) {
            C3092s.m8139f().mo23498w();
            this.f10711w.removeMessages(1);
            this.f10711w.sendEmptyMessageDelayed(1, 1000);
            this.f10705q = false;
        }
    }

    /* renamed from: l */
    public void mo23300l() {
    }

    /* renamed from: n */
    public void mo30600n() {
        m16453N0();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0) {
            C3051a.m7925r().mo23352B(this);
        }
    }

    public void onBackPressed() {
        if (this.f10692d.mo20032g()) {
            this.f10692d.mo20043j();
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
        if (!C3283v.m8836b("PRIVACY_GRANTED", false)) {
            C3283v.m8844j("PRIVACY_GRANTED", true);
        }
        m16484w0();
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_main_new);
        ArrayList<String> arrayList = new ArrayList<>();
        this.f10690b = arrayList;
        arrayList.add(getString(2131755737));
        this.f10690b.add(getString(2131755736));
        this.f10690b.add(getString(2131755735));
        this.f10698j = (BottomTabView) findViewById(C12225R$id.bottom_tab_layout);
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        if (fragments != null) {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            for (int i = 0; i < fragments.size(); i++) {
                beginTransaction.remove(fragments.get(i));
            }
            beginTransaction.commit();
        }
        m16486y0();
        m16487z0();
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(C12225R$id.common_tile_bar);
        this.f10689a = commonTitleBar;
        commonTitleBar.setTitleTextColor(2131100137);
        CommonTitleBar commonTitleBar2 = this.f10689a;
        if (AppUtils.f4977a) {
            str = this.f10690b.get(this.f10691c) + getString(2131755443);
        } else {
            str = this.f10690b.get(this.f10691c);
        }
        commonTitleBar2.mo36195a(str, new C5403p(), new C5404q());
        this.f10689a.setTitleTextSize(16);
        this.f10689a.setBackgroundColor(getResources().getColor(2131099808));
        this.f10689a.mo36197c(C9193k.m22150a(this, 7.0f), C9193k.m22150a(this, 3.0f), C9193k.m22150a(this, 14.0f), C9193k.m22150a(this, 3.0f));
        setTitleBarPadding(this.f10689a);
        m16456R0();
        m16457S0();
        int v0 = m16483v0();
        this.f10691c = v0;
        m16485x0(v0);
        if (getIntent().getBooleanExtra("report_privacy", false)) {
            C8287q.m19593e().mo35245l(true);
        } else {
            C8287q.m19593e().mo35240g();
        }
        C8287q.m19593e().mo35243j();
        this.f10711w.sendEmptyMessageDelayed(3, 1500);
        m16444E0();
        mo30595D0();
        this.f10711w.postDelayed(C5802n1.f11627a, 1000);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C9065b bVar = this.f10700l;
        if (bVar != null && bVar.isShowing()) {
            this.f10700l.dismiss();
        }
        mo30597O0();
        if (this.f10708t) {
            unbindService(this.f10710v);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        String str;
        Class cls;
        Class<DemoControlViewActivity> cls2 = DemoControlViewActivity.class;
        super.onNewIntent(intent);
        setIntent(intent);
        mo30601u0();
        StringBuilder sb = new StringBuilder();
        sb.append("On New Intent :");
        sb.append(intent.toString());
        if (intent.hasExtra("com.yeelight.cherry.device_id")) {
            String stringExtra = intent.getStringExtra("com.yeelight.cherry.device_id");
            C3012e r0 = YeelightDeviceManager.m7804r0(stringExtra);
            if (r0 != null) {
                Intent intent2 = new Intent();
                intent2.putExtra("com.yeelight.cherry.device_id", stringExtra);
                if (!(r0 instanceof C6169f)) {
                    if (r0 instanceof C6119c) {
                        if (r0.mo23145k0()) {
                            intent2.setClass(this, cls2);
                            intent2.setFlags(603979776);
                            str = "group_flag";
                        } else {
                            return;
                        }
                    } else if (r0 instanceof C6091a) {
                        if (r0.mo23145k0()) {
                            cls = ComboDeviceControlActivity.class;
                        } else {
                            return;
                        }
                    } else if (r0 instanceof C10916f1) {
                        if (r0.mo23145k0()) {
                            cls = SpeakerDeviceControlActivity.class;
                        } else {
                            return;
                        }
                    } else if (r0 instanceof C11571p0) {
                        if (r0.mo23145k0()) {
                            cls = MeshGatewayControlActivity.class;
                        } else {
                            return;
                        }
                    } else if (r0 instanceof C11911z) {
                        if (r0.mo23145k0()) {
                            cls = intent.getBooleanExtra("CURTAIN_CONFIG", false) ? CurtainGuideActivity.class : CurtainControlActivity.class;
                        } else {
                            return;
                        }
                    } else if (r0 instanceof C11406l1) {
                        if (r0.mo23145k0()) {
                            cls = SwitchControlActivity.class;
                        } else {
                            return;
                        }
                    } else if (r0 instanceof C10797d1) {
                        if (r0.mo23145k0()) {
                            cls = PlugControlActivity.class;
                        } else {
                            return;
                        }
                    } else if (!(r0 instanceof C10337c)) {
                        intent2.setClass(this, cls2);
                        intent2.setFlags(603979776);
                        if ("yeelink.light.color6".equals(r0.mo23208T())) {
                            str = "google_home_hint_key";
                        }
                        startActivity(intent2);
                    } else if (r0.mo23145k0()) {
                        cls = FanclControlViewActivity.class;
                    } else {
                        return;
                    }
                    intent2.putExtra(str, true);
                    startActivity(intent2);
                } else if (r0.mo23145k0()) {
                    intent2.setClass(this, cls2);
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
            this.f10691c = intent.getIntExtra("com.yeelight.cherry.fragment", 0);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f10698j.mo31359h();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f10702n = false;
        this.f10698j.mo31358f(this);
        this.f10698j.setSelected(this.f10691c);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        CharSequence charSequence;
        super.onStart();
        CommonTitleBar commonTitleBar = this.f10689a;
        if (AppUtils.f4977a) {
            charSequence = this.f10690b.get(this.f10691c) + getString(2131755443);
        } else {
            charSequence = this.f10690b.get(this.f10691c);
        }
        commonTitleBar.setTitle(charSequence);
        C3051a.m7925r().mo23358M(this);
        m16454P0();
        C8287q.m19593e().mo35244k(this);
        C8281l.m19542b().mo35225e(this);
        C3092s.m8139f().mo23492q(this);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C3051a.m7925r().mo23359N(this);
        C8287q.m19593e().mo35246n();
        C8281l.m19542b().mo35227g(this);
        C3092s.m8139f().mo23494s();
        if (this.f10702n) {
            this.f10692d.mo20044k(false);
        }
    }

    /* renamed from: q */
    public void mo23308q(String str) {
    }

    /* renamed from: r */
    public void mo23310r(String str) {
    }

    /* renamed from: u */
    public void mo23504u() {
        runOnUiThread(new C5401n());
    }

    /* renamed from: u0 */
    public void mo30601u0() {
        try {
            Object systemService = getSystemService("statusbar");
            systemService.getClass().getMethod("collapsePanels", new Class[0]).invoke(systemService, new Object[0]);
        } catch (Exception unused) {
        }
    }

    /* renamed from: z */
    public void mo23505z(int i) {
        runOnUiThread(new C5400m(i));
    }
}
