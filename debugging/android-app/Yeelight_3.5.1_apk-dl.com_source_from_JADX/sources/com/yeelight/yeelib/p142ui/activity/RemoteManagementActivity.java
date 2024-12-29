package com.yeelight.yeelib.p142ui.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chauthai.swipereveallayout.C0635a;
import com.chauthai.swipereveallayout.SwipeRevealLayout;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.yeelight.yeelib.R$color;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.C6163d;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.view.C8869a;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import p051j4.C9193k;
import p096s2.C3686a;
import p096s2.C3691f;
import p170i4.C9113d;
import p207s3.C10328a;
import p207s3.C10333b;
import p207s3.C10337c;
import p207s3.C10344f;
import p223w3.C11406l1;
import p223w3.C11511o;
import p223w3.C11911z;
import p237z3.C12145e;

/* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity */
public class RemoteManagementActivity extends BaseActivity implements C12145e {

    /* renamed from: t */
    private static final String f15124t = "RemoteManagementActivity";

    /* renamed from: a */
    private RecyclerView f15125a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C3010c f15126b;

    /* renamed from: c */
    private CommonTitleBar f15127c;

    /* renamed from: d */
    private TextView f15128d;

    /* renamed from: e */
    private C8618s f15129e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C0635a f15130f = new C0635a();

    /* renamed from: g */
    private ImageButton f15131g;

    /* renamed from: h */
    private ImageButton f15132h;

    /* renamed from: i */
    private ImageButton f15133i;

    /* renamed from: j */
    private ImageButton f15134j;

    /* renamed from: k */
    private ImageButton f15135k;

    /* renamed from: l */
    private ImageButton f15136l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public ImageView f15137m;

    /* renamed from: n */
    private LinearLayout f15138n;

    /* renamed from: o */
    private FrameLayout f15139o;

    /* renamed from: p */
    TwinklingRefreshLayout f15140p;

    /* renamed from: q */
    private TextView f15141q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public ArrayList<C6163d> f15142r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public Handler f15143s = new C8606i();

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$FavoriteSceneVH */
    public class FavoriteSceneVH extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f15144a;

        /* renamed from: b */
        public TextView f15145b;

        /* renamed from: c */
        public SwipeRevealLayout f15146c;

        /* renamed from: d */
        public ImageView f15147d;

        /* renamed from: e */
        public LinearLayout f15148e;

        /* renamed from: f */
        public ImageView f15149f;

        public FavoriteSceneVH(RemoteManagementActivity remoteManagementActivity, View view) {
            super(view);
            this.f15146c = (SwipeRevealLayout) view.findViewById(R$id.swipe_reveal_layout);
            this.f15144a = (TextView) view.findViewById(R$id.remote_name);
            this.f15145b = (TextView) view.findViewById(R$id.remote_info);
            this.f15147d = (ImageView) view.findViewById(R$id.img_delete);
            this.f15148e = (LinearLayout) view.findViewById(R$id.item_layout);
            this.f15149f = (ImageView) view.findViewById(R$id.remote_img);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$a */
    class C8598a implements View.OnClickListener {
        C8598a() {
        }

        public void onClick(View view) {
            RemoteManagementActivity.this.f15143s.sendEmptyMessage(0);
            RemoteManagementActivity.this.m20384i0(4);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$b */
    class C8599b implements View.OnLongClickListener {
        C8599b() {
        }

        public boolean onLongClick(View view) {
            RemoteManagementActivity.this.f15143s.sendEmptyMessage(0);
            RemoteManagementActivity.this.m20384i0(131076);
            return true;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$c */
    class C8600c implements View.OnClickListener {
        C8600c() {
        }

        public void onClick(View view) {
            RemoteManagementActivity.this.f15143s.sendEmptyMessage(0);
            RemoteManagementActivity.this.m20384i0(3);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$d */
    class C8601d implements View.OnLongClickListener {
        C8601d() {
        }

        public boolean onLongClick(View view) {
            RemoteManagementActivity.this.f15143s.sendEmptyMessage(0);
            RemoteManagementActivity.this.m20384i0(131075);
            return true;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$e */
    class C8602e implements View.OnClickListener {
        C8602e() {
        }

        public void onClick(View view) {
            RemoteManagementActivity.this.f15143s.sendEmptyMessage(0);
            RemoteManagementActivity.this.m20384i0(5);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$f */
    class C8603f implements View.OnLongClickListener {
        C8603f() {
        }

        public boolean onLongClick(View view) {
            RemoteManagementActivity.this.f15143s.sendEmptyMessage(0);
            RemoteManagementActivity.this.m20384i0(131077);
            return true;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$g */
    class C8604g extends C3691f {
        C8604g() {
        }

        /* renamed from: a */
        public void mo20223a(TwinklingRefreshLayout twinklingRefreshLayout) {
        }

        /* renamed from: e */
        public void mo20228e(TwinklingRefreshLayout twinklingRefreshLayout) {
            RemoteManagementActivity.this.m20383h0();
            RemoteManagementActivity.this.f15143s.sendEmptyMessageDelayed(2, 2000);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$h */
    class C8605h implements Runnable {
        C8605h() {
        }

        public void run() {
            RemoteManagementActivity.this.m20386k0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$i */
    class C8606i extends Handler {

        /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$i$a */
        class C8607a implements Runnable {
            C8607a() {
            }

            public void run() {
                RemoteManagementActivity.this.f15137m.setVisibility(0);
                RemoteManagementActivity.this.f15143s.sendEmptyMessageDelayed(1, 300);
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$i$b */
        class C8608b implements Runnable {
            C8608b() {
            }

            public void run() {
                RemoteManagementActivity.this.f15137m.setVisibility(4);
            }
        }

        C8606i() {
        }

        public void handleMessage(Message message) {
            RemoteManagementActivity remoteManagementActivity;
            Runnable runnable;
            super.handleMessage(message);
            int i = message.what;
            if (i == 0) {
                remoteManagementActivity = RemoteManagementActivity.this;
                runnable = new C8607a();
            } else if (i == 1) {
                remoteManagementActivity = RemoteManagementActivity.this;
                runnable = new C8608b();
            } else if (i == 2) {
                RemoteManagementActivity.this.f15140p.mo20222A();
                return;
            } else {
                return;
            }
            remoteManagementActivity.runOnUiThread(runnable);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$j */
    class C8609j implements View.OnClickListener {
        C8609j() {
        }

        public void onClick(View view) {
            RemoteManagementActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$k */
    class C8610k implements View.OnClickListener {
        C8610k() {
        }

        public void onClick(View view) {
            int i;
            Intent intent = new Intent(RemoteManagementActivity.this, YeelightWebviewActivity.class);
            String T = RemoteManagementActivity.this.f15126b.mo23208T();
            T.hashCode();
            char c = 65535;
            switch (T.hashCode()) {
                case -1644531059:
                    if (T.equals("yeelink.bhf_light.v1")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1494338802:
                    if (T.equals("yeelink.switch.sw1")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1235140472:
                    if (T.equals("yeelink.light.fancl1")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1235140471:
                    if (T.equals("yeelink.light.fancl2")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1235140468:
                    if (T.equals("yeelink.light.fancl5")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1235140467:
                    if (T.equals("yeelink.light.fancl6")) {
                        c = 5;
                        break;
                    }
                    break;
                case -458141172:
                    if (T.equals("yeelink.light.ceild")) {
                        c = 6;
                        break;
                    }
                    break;
                case 674030242:
                    if (T.equals("yeelink.curtain.ctmt1")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1623724661:
                    if (T.equals("yeelink.light.bslamp1")) {
                        c = 8;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    i = 25;
                    break;
                case 1:
                    i = 29;
                    break;
                case 2:
                    i = 30;
                    break;
                case 3:
                case 4:
                case 5:
                    i = 31;
                    break;
                case 6:
                    i = 33;
                    break;
                case 7:
                    i = 28;
                    break;
                case 8:
                    i = 17;
                    break;
                default:
                    i = 16;
                    break;
            }
            intent.putExtra("url_index", i);
            RemoteManagementActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$l */
    class C8611l extends RecyclerView.ItemDecoration {
        C8611l(RemoteManagementActivity remoteManagementActivity) {
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            super.getItemOffsets(rect, view, recyclerView, state);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            float f;
            float f2;
            float f3;
            super.onDrawOver(canvas, recyclerView, state);
            int childCount = recyclerView.getChildCount();
            int paddingLeft = recyclerView.getPaddingLeft();
            int measuredWidth = recyclerView.getMeasuredWidth() - recyclerView.getPaddingRight();
            Paint paint = new Paint();
            paint.setColor(recyclerView.getContext().getResources().getColor(R$color.common_color_divider_line));
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                int bottom = childAt.getBottom() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                int i2 = bottom + 1;
                if (i == childCount - 1) {
                    f3 = (float) paddingLeft;
                    f2 = (float) bottom;
                    f = (float) measuredWidth;
                    i2 -= 2;
                } else {
                    f3 = (float) (C9193k.m22151b(recyclerView.getContext(), 20.0f) + paddingLeft);
                    f2 = (float) bottom;
                    f = (float) measuredWidth;
                }
                canvas.drawRect(f3, f2, f, (float) i2, paint);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$m */
    class C8612m implements View.OnClickListener {
        C8612m() {
        }

        public void onClick(View view) {
            RemoteManagementActivity.this.f15143s.sendEmptyMessage(0);
            RemoteManagementActivity.this.m20384i0(0);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$n */
    class C8613n implements View.OnLongClickListener {
        C8613n() {
        }

        public boolean onLongClick(View view) {
            RemoteManagementActivity.this.f15143s.sendEmptyMessage(0);
            RemoteManagementActivity.this.m20384i0(131072);
            return true;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$o */
    class C8614o implements View.OnClickListener {
        C8614o() {
        }

        public void onClick(View view) {
            RemoteManagementActivity.this.f15143s.sendEmptyMessage(0);
            RemoteManagementActivity.this.m20384i0(1);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$p */
    class C8615p implements View.OnLongClickListener {
        C8615p() {
        }

        public boolean onLongClick(View view) {
            RemoteManagementActivity.this.f15143s.sendEmptyMessage(0);
            RemoteManagementActivity.this.m20384i0(131073);
            return true;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$q */
    class C8616q implements View.OnClickListener {
        C8616q() {
        }

        public void onClick(View view) {
            RemoteManagementActivity.this.f15143s.sendEmptyMessage(0);
            RemoteManagementActivity.this.m20384i0(2);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$r */
    class C8617r implements View.OnLongClickListener {
        C8617r() {
        }

        public boolean onLongClick(View view) {
            RemoteManagementActivity.this.f15143s.sendEmptyMessage(0);
            RemoteManagementActivity.this.m20384i0(131074);
            return true;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$s */
    private class C8618s extends RecyclerView.Adapter<FavoriteSceneVH> {

        /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$s$a */
        class C8619a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C6163d f15170a;

            /* renamed from: b */
            final /* synthetic */ int f15171b;

            /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$s$a$a */
            class C8620a implements DialogInterface.OnClickListener {
                C8620a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    RemoteManagementActivity.this.f15130f.mo11088e(C8619a.this.f15170a.mo31858a());
                    C8619a aVar = C8619a.this;
                    RemoteManagementActivity.this.m20385j0(aVar.f15170a);
                    RemoteManagementActivity.this.f15142r.remove(C8619a.this.f15171b);
                    C8618s.this.notifyDataSetChanged();
                    dialogInterface.dismiss();
                }
            }

            C8619a(C6163d dVar, int i) {
                this.f15170a = dVar;
                this.f15171b = i;
            }

            public void onClick(View view) {
                C9113d.C9118e eVar = new C9113d.C9118e(view.getContext());
                eVar.mo37179i(view.getContext().getString(R$string.common_text_delete)).mo37177g(view.getContext().getString(R$string.delete_remote_confirm_message)).mo37174d(-2, view.getContext().getString(R$string.common_text_cancel), (DialogInterface.OnClickListener) null).mo37174d(-1, view.getContext().getString(R$string.common_text_ok), new C8620a());
                eVar.mo37180j();
            }
        }

        C8618s() {
            RemoteManagementActivity.this.f15130f.mo11089h(true);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m20390b(View view) {
            if ((RemoteManagementActivity.this.f15126b instanceof C10328a) && RemoteManagementActivity.this.f15126b.mo23229n0(49)) {
                Intent intent = new Intent();
                intent.putExtra("com.yeelight.cherry.device_id", RemoteManagementActivity.this.f15126b.mo23185G());
                intent.setClass(RemoteManagementActivity.this, CurtainRcTypeActivity.class);
                RemoteManagementActivity.this.startActivity(intent);
            }
        }

        /* renamed from: c */
        public void onBindViewHolder(FavoriteSceneVH favoriteSceneVH, int i) {
            int i2;
            ImageView imageView;
            C6163d dVar = (C6163d) RemoteManagementActivity.this.f15142r.get(i);
            favoriteSceneVH.f15144a.setText(dVar.mo31859b());
            favoriteSceneVH.f15145b.setText(RemoteManagementActivity.this.getResources().getText(R$string.common_text_mac_address) + " (" + dVar.mo31858a().toUpperCase() + ")");
            if (dVar.mo31862e() == 339) {
                if (RemoteManagementActivity.this.f15126b == null || !TextUtils.equals("yeelink.light.ceild", RemoteManagementActivity.this.f15126b.mo23208T())) {
                    imageView = favoriteSceneVH.f15149f;
                    i2 = R$drawable.icon_yeelight_remote_image_luna;
                } else {
                    imageView = favoriteSceneVH.f15149f;
                    i2 = R$drawable.icon_yeelight_remote_image_minas;
                }
            } else if (dVar.mo31862e() == 950) {
                imageView = favoriteSceneVH.f15149f;
                i2 = R$drawable.icon_yeelight_remote_image_seesaw;
            } else if (dVar.mo31862e() == 959) {
                imageView = favoriteSceneVH.f15149f;
                i2 = R$drawable.icon_yeelight_remote_image_auster;
            } else if (dVar.mo31862e() == 1678) {
                imageView = favoriteSceneVH.f15149f;
                i2 = R$drawable.icon_yeelight_remote_image_fan;
            } else {
                imageView = favoriteSceneVH.f15149f;
                i2 = R$drawable.icon_yeelight_remote_image_unknown;
            }
            imageView.setImageResource(i2);
            favoriteSceneVH.f15147d.setOnClickListener(new C8619a(dVar, i));
            RemoteManagementActivity.this.f15130f.mo11087d(favoriteSceneVH.f15146c, dVar.mo31858a());
            favoriteSceneVH.f15148e.setClickable(true);
            favoriteSceneVH.f15148e.setOnClickListener(new C8736u(this));
        }

        /* renamed from: d */
        public FavoriteSceneVH onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new FavoriteSceneVH(RemoteManagementActivity.this, LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.remote_list_item_layout, viewGroup, false));
        }

        public int getItemCount() {
            if (RemoteManagementActivity.this.f15142r != null) {
                return RemoteManagementActivity.this.f15142r.size();
            }
            return 0;
        }
    }

    /* renamed from: e0 */
    private void m20380e0() {
        this.f15125a.setLayoutManager(new LinearLayoutManager(this));
        this.f15125a.setItemAnimator(new DefaultItemAnimator());
        this.f15125a.addItemDecoration(new C8611l(this));
    }

    /* renamed from: f0 */
    private void m20381f0() {
        this.f15140p = (TwinklingRefreshLayout) findViewById(R$id.refresh_layout);
        C8869a aVar = new C8869a(this);
        this.f15140p.setOverScrollRefreshShow(false);
        this.f15140p.setHeaderView(aVar);
        this.f15140p.setBottomView((C3686a) null);
        this.f15140p.setEnableLoadmore(false);
        this.f15140p.setEnableOverScroll(true);
        this.f15140p.setOnRefreshListener(new C8604g());
    }

    /* renamed from: g0 */
    private void m20382g0() {
        this.f15131g.setOnClickListener(new C8612m());
        this.f15131g.setOnLongClickListener(new C8613n());
        this.f15132h.setOnClickListener(new C8614o());
        this.f15132h.setOnLongClickListener(new C8615p());
        this.f15133i.setOnClickListener(new C8616q());
        this.f15133i.setOnLongClickListener(new C8617r());
        this.f15134j.setOnClickListener(new C8598a());
        this.f15134j.setOnLongClickListener(new C8599b());
        this.f15135k.setOnClickListener(new C8600c());
        this.f15135k.setOnLongClickListener(new C8601d());
        this.f15136l.setOnClickListener(new C8602e());
        this.f15136l.setOnLongClickListener(new C8603f());
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public void m20383h0() {
        C3010c cVar = this.f15126b;
        if (cVar != null) {
            if (cVar instanceof C10333b) {
                ((C10333b) cVar).mo41883d2();
            } else if (cVar instanceof C10344f) {
                ((C10344f) cVar).mo41896k2();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public void m20384i0(int i) {
        C3010c cVar = this.f15126b;
        if (cVar != null && (cVar instanceof C10333b)) {
            ((C10333b) cVar).mo41885f2(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public void m20385j0(C6163d dVar) {
        C3010c cVar = this.f15126b;
        if (cVar != null) {
            if (cVar instanceof C10333b) {
                ((C10333b) cVar).mo41886h2(dVar.mo31858a(), dVar.mo31862e(), dVar.mo31860c());
            } else if (cVar instanceof C10344f) {
                C10344f fVar = (C10344f) cVar;
                fVar.mo41897o2(fVar instanceof C10337c ? dVar.mo31858a() : dVar.mo31861d(), dVar.mo31862e(), dVar.mo31860c());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public void m20386k0() {
        ArrayList<C6163d> arrayList = this.f15142r;
        if (arrayList == null || arrayList.size() == 0) {
            C3010c cVar = this.f15126b;
            if ((cVar instanceof C11911z) || (cVar instanceof C11406l1) || (cVar instanceof C11511o) || (cVar instanceof C10337c)) {
                this.f15141q.setVisibility(0);
                this.f15139o.setVisibility(8);
                this.f15138n.setVisibility(8);
                return;
            }
            this.f15139o.setVisibility(0);
            this.f15138n.setVisibility(8);
            this.f15141q.setVisibility(8);
            return;
        }
        this.f15141q.setVisibility(8);
        this.f15139o.setVisibility(8);
        this.f15138n.setVisibility(0);
        this.f15129e.notifyDataSetChanged();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(R$layout.activity_remote_management);
        this.f15142r = new ArrayList<>();
        this.f15125a = (RecyclerView) findViewById(R$id.remote_list_view);
        int i = R$id.title_bar;
        this.f15127c = (CommonTitleBar) findViewById(i);
        this.f15128d = (TextView) findViewById(R$id.btn_add_new_remote);
        this.f15131g = (ImageButton) findViewById(R$id.remote_control_on);
        this.f15132h = (ImageButton) findViewById(R$id.remote_control_off);
        this.f15133i = (ImageButton) findViewById(R$id.remote_control_ct);
        this.f15134j = (ImageButton) findViewById(R$id.remote_control_mode);
        this.f15135k = (ImageButton) findViewById(R$id.remote_control_bright_increase);
        this.f15136l = (ImageButton) findViewById(R$id.remote_control_bright_decrease);
        ImageView imageView = (ImageView) findViewById(R$id.remote_control_light_indicator);
        this.f15137m = imageView;
        imageView.setVisibility(4);
        this.f15127c = (CommonTitleBar) findViewById(i);
        this.f15138n = (LinearLayout) findViewById(R$id.remote_list_layout);
        this.f15139o = (FrameLayout) findViewById(R$id.remote_control_layout);
        this.f15141q = (TextView) findViewById(R$id.tv_not_bind);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f15124t, "Activity has not device id", false);
            finish();
            return;
        }
        C3010c j0 = YeelightDeviceManager.m7794j0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f15126b = j0;
        if (j0 == null) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        this.f15127c.mo36195a(getString(R$string.remote_title), new C8609j(), (View.OnClickListener) null);
        this.f15127c.setTitleTextSize(16);
        this.f15128d.setOnClickListener(new C8610k());
        C8618s sVar = new C8618s();
        this.f15129e = sVar;
        this.f15125a.setAdapter(sVar);
        m20380e0();
        m20382g0();
        m20381f0();
        this.f15142r = this.f15126b.mo23221d0().mo31609q();
        m20386k0();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        this.f15126b.mo23213W0(this);
    }

    public void onResume() {
        super.onResume();
        this.f15126b.mo23178B0(this);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        m20383h0();
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == 4096) {
            this.f15142r = this.f15126b.mo23221d0().mo31609q();
            StringBuilder sb = new StringBuilder();
            sb.append("bound remote size: ");
            ArrayList<C6163d> arrayList = this.f15142r;
            sb.append(arrayList == null ? 0 : arrayList.size());
            runOnUiThread(new C8605h());
        }
    }
}
