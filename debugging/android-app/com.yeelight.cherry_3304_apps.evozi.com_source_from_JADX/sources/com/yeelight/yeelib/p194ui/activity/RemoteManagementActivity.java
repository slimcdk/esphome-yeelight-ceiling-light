package com.yeelight.yeelib.p194ui.activity;

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
import com.chauthai.swipereveallayout.C1261a;
import com.chauthai.swipereveallayout.SwipeRevealLayout;
import com.lcodecore.tkrefreshlayout.C3387a;
import com.lcodecore.tkrefreshlayout.C3392f;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.yeelight.yeelib.R$color;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p150c.C5999e;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C6019c;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6029f;
import com.yeelight.yeelib.p150c.p151i.C6033g;
import com.yeelight.yeelib.p150c.p151i.C6067o;
import com.yeelight.yeelib.p150c.p183m.C6922j1;
import com.yeelight.yeelib.p150c.p183m.C7070n;
import com.yeelight.yeelib.p150c.p183m.C7472y;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.view.C10493b;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import java.util.ArrayList;

/* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity */
public class RemoteManagementActivity extends BaseActivity implements C9770e {

    /* renamed from: u */
    private static final String f18816u = RemoteManagementActivity.class.getSimpleName();

    /* renamed from: b */
    private RecyclerView f18817b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C4198d f18818c;

    /* renamed from: d */
    private CommonTitleBar f18819d;

    /* renamed from: e */
    private TextView f18820e;

    /* renamed from: f */
    private C10200s f18821f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C1261a f18822g = new C1261a();

    /* renamed from: h */
    private ImageButton f18823h;

    /* renamed from: i */
    private ImageButton f18824i;

    /* renamed from: j */
    private ImageButton f18825j;

    /* renamed from: k */
    private ImageButton f18826k;

    /* renamed from: l */
    private ImageButton f18827l;

    /* renamed from: m */
    private ImageButton f18828m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public ImageView f18829n;

    /* renamed from: o */
    private LinearLayout f18830o;

    /* renamed from: p */
    private FrameLayout f18831p;

    /* renamed from: q */
    TwinklingRefreshLayout f18832q;

    /* renamed from: r */
    private TextView f18833r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public ArrayList<C5999e> f18834s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public Handler f18835t = new C10188i();

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$FavoriteSceneVH */
    public class FavoriteSceneVH extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f18836a;

        /* renamed from: b */
        public TextView f18837b;

        /* renamed from: c */
        public SwipeRevealLayout f18838c;

        /* renamed from: d */
        public ImageView f18839d;

        /* renamed from: e */
        public LinearLayout f18840e;

        /* renamed from: f */
        public ImageView f18841f;

        public FavoriteSceneVH(RemoteManagementActivity remoteManagementActivity, View view) {
            super(view);
            this.f18838c = (SwipeRevealLayout) view.findViewById(R$id.swipe_reveal_layout);
            this.f18836a = (TextView) view.findViewById(R$id.remote_name);
            this.f18837b = (TextView) view.findViewById(R$id.remote_info);
            this.f18839d = (ImageView) view.findViewById(R$id.img_delete);
            this.f18840e = (LinearLayout) view.findViewById(R$id.item_layout);
            this.f18841f = (ImageView) view.findViewById(R$id.remote_img);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$a */
    class C10180a implements View.OnClickListener {
        C10180a() {
        }

        public void onClick(View view) {
            RemoteManagementActivity.this.f18835t.sendEmptyMessage(0);
            RemoteManagementActivity.this.m24777i0(4);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$b */
    class C10181b implements View.OnLongClickListener {
        C10181b() {
        }

        public boolean onLongClick(View view) {
            RemoteManagementActivity.this.f18835t.sendEmptyMessage(0);
            RemoteManagementActivity.this.m24777i0(131076);
            return true;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$c */
    class C10182c implements View.OnClickListener {
        C10182c() {
        }

        public void onClick(View view) {
            RemoteManagementActivity.this.f18835t.sendEmptyMessage(0);
            RemoteManagementActivity.this.m24777i0(3);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$d */
    class C10183d implements View.OnLongClickListener {
        C10183d() {
        }

        public boolean onLongClick(View view) {
            RemoteManagementActivity.this.f18835t.sendEmptyMessage(0);
            RemoteManagementActivity.this.m24777i0(131075);
            return true;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$e */
    class C10184e implements View.OnClickListener {
        C10184e() {
        }

        public void onClick(View view) {
            RemoteManagementActivity.this.f18835t.sendEmptyMessage(0);
            RemoteManagementActivity.this.m24777i0(5);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$f */
    class C10185f implements View.OnLongClickListener {
        C10185f() {
        }

        public boolean onLongClick(View view) {
            RemoteManagementActivity.this.f18835t.sendEmptyMessage(0);
            RemoteManagementActivity.this.m24777i0(131077);
            return true;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$g */
    class C10186g extends C3392f {
        C10186g() {
        }

        /* renamed from: a */
        public void mo18610a(TwinklingRefreshLayout twinklingRefreshLayout) {
        }

        /* renamed from: e */
        public void mo18615e(TwinklingRefreshLayout twinklingRefreshLayout) {
            RemoteManagementActivity.this.m24776h0();
            RemoteManagementActivity.this.f18835t.sendEmptyMessageDelayed(2, 2000);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$h */
    class C10187h implements Runnable {
        C10187h() {
        }

        public void run() {
            RemoteManagementActivity.this.m24779k0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$i */
    class C10188i extends Handler {

        /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$i$a */
        class C10189a implements Runnable {
            C10189a() {
            }

            public void run() {
                RemoteManagementActivity.this.f18829n.setVisibility(0);
                RemoteManagementActivity.this.f18835t.sendEmptyMessageDelayed(1, 300);
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$i$b */
        class C10190b implements Runnable {
            C10190b() {
            }

            public void run() {
                RemoteManagementActivity.this.f18829n.setVisibility(4);
            }
        }

        C10188i() {
        }

        public void handleMessage(Message message) {
            RemoteManagementActivity remoteManagementActivity;
            Runnable runnable;
            super.handleMessage(message);
            int i = message.what;
            if (i == 0) {
                remoteManagementActivity = RemoteManagementActivity.this;
                runnable = new C10189a();
            } else if (i == 1) {
                remoteManagementActivity = RemoteManagementActivity.this;
                runnable = new C10190b();
            } else if (i == 2) {
                RemoteManagementActivity.this.f18832q.mo18609A();
                return;
            } else {
                return;
            }
            remoteManagementActivity.runOnUiThread(runnable);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$j */
    class C10191j implements View.OnClickListener {
        C10191j() {
        }

        public void onClick(View view) {
            RemoteManagementActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$k */
    class C10192k implements View.OnClickListener {
        C10192k() {
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                android.content.Intent r3 = new android.content.Intent
                com.yeelight.yeelib.ui.activity.RemoteManagementActivity r0 = com.yeelight.yeelib.p194ui.activity.RemoteManagementActivity.this
                java.lang.Class<com.yeelight.yeelib.ui.activity.YeelightWebviewActivity> r1 = com.yeelight.yeelib.p194ui.activity.YeelightWebviewActivity.class
                r3.<init>(r0, r1)
                com.yeelight.yeelib.ui.activity.RemoteManagementActivity r0 = com.yeelight.yeelib.p194ui.activity.RemoteManagementActivity.this
                com.yeelight.yeelib.c.i.d r0 = r0.f18818c
                java.lang.String r0 = r0.mo23395T()
                int r1 = r0.hashCode()
                switch(r1) {
                    case -1644531059: goto L_0x006c;
                    case -1494338802: goto L_0x0062;
                    case -1235140472: goto L_0x0058;
                    case -1235140471: goto L_0x004e;
                    case -1235140468: goto L_0x0044;
                    case -1235140467: goto L_0x003a;
                    case -458141172: goto L_0x002f;
                    case 674030242: goto L_0x0025;
                    case 1623724661: goto L_0x001b;
                    default: goto L_0x001a;
                }
            L_0x001a:
                goto L_0x0076
            L_0x001b:
                java.lang.String r1 = "yeelink.light.bslamp1"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0076
                r0 = 0
                goto L_0x0077
            L_0x0025:
                java.lang.String r1 = "yeelink.curtain.ctmt1"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0076
                r0 = 2
                goto L_0x0077
            L_0x002f:
                java.lang.String r1 = "yeelink.light.ceild"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0076
                r0 = 8
                goto L_0x0077
            L_0x003a:
                java.lang.String r1 = "yeelink.light.fancl6"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0076
                r0 = 7
                goto L_0x0077
            L_0x0044:
                java.lang.String r1 = "yeelink.light.fancl5"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0076
                r0 = 6
                goto L_0x0077
            L_0x004e:
                java.lang.String r1 = "yeelink.light.fancl2"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0076
                r0 = 5
                goto L_0x0077
            L_0x0058:
                java.lang.String r1 = "yeelink.light.fancl1"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0076
                r0 = 4
                goto L_0x0077
            L_0x0062:
                java.lang.String r1 = "yeelink.switch.sw1"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0076
                r0 = 3
                goto L_0x0077
            L_0x006c:
                java.lang.String r1 = "yeelink.bhf_light.v1"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0076
                r0 = 1
                goto L_0x0077
            L_0x0076:
                r0 = -1
            L_0x0077:
                switch(r0) {
                    case 0: goto L_0x008f;
                    case 1: goto L_0x008c;
                    case 2: goto L_0x0089;
                    case 3: goto L_0x0086;
                    case 4: goto L_0x0083;
                    case 5: goto L_0x0080;
                    case 6: goto L_0x0080;
                    case 7: goto L_0x0080;
                    case 8: goto L_0x007d;
                    default: goto L_0x007a;
                }
            L_0x007a:
                r0 = 16
                goto L_0x0091
            L_0x007d:
                r0 = 33
                goto L_0x0091
            L_0x0080:
                r0 = 31
                goto L_0x0091
            L_0x0083:
                r0 = 30
                goto L_0x0091
            L_0x0086:
                r0 = 29
                goto L_0x0091
            L_0x0089:
                r0 = 28
                goto L_0x0091
            L_0x008c:
                r0 = 25
                goto L_0x0091
            L_0x008f:
                r0 = 17
            L_0x0091:
                java.lang.String r1 = "url_index"
                r3.putExtra(r1, r0)
                com.yeelight.yeelib.ui.activity.RemoteManagementActivity r0 = com.yeelight.yeelib.p194ui.activity.RemoteManagementActivity.this
                r0.startActivity(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.activity.RemoteManagementActivity.C10192k.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$l */
    class C10193l extends RecyclerView.ItemDecoration {
        C10193l(RemoteManagementActivity remoteManagementActivity) {
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
                    f3 = (float) (C10547m.m25752b(recyclerView.getContext(), 20.0f) + paddingLeft);
                    f2 = (float) bottom;
                    f = (float) measuredWidth;
                }
                canvas.drawRect(f3, f2, f, (float) i2, paint);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$m */
    class C10194m implements View.OnClickListener {
        C10194m() {
        }

        public void onClick(View view) {
            RemoteManagementActivity.this.f18835t.sendEmptyMessage(0);
            RemoteManagementActivity.this.m24777i0(0);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$n */
    class C10195n implements View.OnLongClickListener {
        C10195n() {
        }

        public boolean onLongClick(View view) {
            RemoteManagementActivity.this.f18835t.sendEmptyMessage(0);
            RemoteManagementActivity.this.m24777i0(131072);
            return true;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$o */
    class C10196o implements View.OnClickListener {
        C10196o() {
        }

        public void onClick(View view) {
            RemoteManagementActivity.this.f18835t.sendEmptyMessage(0);
            RemoteManagementActivity.this.m24777i0(1);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$p */
    class C10197p implements View.OnLongClickListener {
        C10197p() {
        }

        public boolean onLongClick(View view) {
            RemoteManagementActivity.this.f18835t.sendEmptyMessage(0);
            RemoteManagementActivity.this.m24777i0(131073);
            return true;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$q */
    class C10198q implements View.OnClickListener {
        C10198q() {
        }

        public void onClick(View view) {
            RemoteManagementActivity.this.f18835t.sendEmptyMessage(0);
            RemoteManagementActivity.this.m24777i0(2);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$r */
    class C10199r implements View.OnLongClickListener {
        C10199r() {
        }

        public boolean onLongClick(View view) {
            RemoteManagementActivity.this.f18835t.sendEmptyMessage(0);
            RemoteManagementActivity.this.m24777i0(131074);
            return true;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$s */
    private class C10200s extends RecyclerView.Adapter<FavoriteSceneVH> {

        /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$s$a */
        class C10201a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C5999e f18862a;

            /* renamed from: b */
            final /* synthetic */ int f18863b;

            /* renamed from: com.yeelight.yeelib.ui.activity.RemoteManagementActivity$s$a$a */
            class C10202a implements DialogInterface.OnClickListener {
                C10202a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    RemoteManagementActivity.this.f18822g.mo10110e(C10201a.this.f18862a.mo27532a());
                    C10201a aVar = C10201a.this;
                    RemoteManagementActivity.this.m24778j0(aVar.f18862a);
                    RemoteManagementActivity.this.f18834s.remove(C10201a.this.f18863b);
                    C10200s.this.notifyDataSetChanged();
                    dialogInterface.dismiss();
                }
            }

            C10201a(C5999e eVar, int i) {
                this.f18862a = eVar;
                this.f18863b = i;
            }

            public void onClick(View view) {
                C10526e.C10531e eVar = new C10526e.C10531e(view.getContext());
                eVar.mo33358i(view.getContext().getString(R$string.common_text_delete));
                eVar.mo33356g(view.getContext().getString(R$string.delete_remote_confirm_message));
                eVar.mo33353d(-2, view.getContext().getString(R$string.common_text_cancel), (DialogInterface.OnClickListener) null);
                eVar.mo33353d(-1, view.getContext().getString(R$string.common_text_ok), new C10202a());
                eVar.mo33359j();
            }
        }

        C10200s() {
            RemoteManagementActivity.this.f18822g.mo10111h(true);
        }

        /* renamed from: a */
        public /* synthetic */ void mo32495a(View view) {
            if ((RemoteManagementActivity.this.f18818c instanceof C6019c) && RemoteManagementActivity.this.f18818c.mo23415n0(49)) {
                Intent intent = new Intent();
                intent.putExtra("com.yeelight.cherry.device_id", RemoteManagementActivity.this.f18818c.mo23372G());
                intent.setClass(RemoteManagementActivity.this, CurtainRcTypeActivity.class);
                RemoteManagementActivity.this.startActivity(intent);
            }
        }

        /* renamed from: b */
        public void onBindViewHolder(FavoriteSceneVH favoriteSceneVH, int i) {
            int i2;
            ImageView imageView;
            C5999e eVar = (C5999e) RemoteManagementActivity.this.f18834s.get(i);
            favoriteSceneVH.f18836a.setText(eVar.mo27533b());
            favoriteSceneVH.f18837b.setText(RemoteManagementActivity.this.getResources().getText(R$string.common_text_mac_address) + " (" + eVar.mo27532a().toUpperCase() + ")");
            if (eVar.mo27536e() == 339) {
                if (RemoteManagementActivity.this.f18818c == null || !TextUtils.equals("yeelink.light.ceild", RemoteManagementActivity.this.f18818c.mo23395T())) {
                    imageView = favoriteSceneVH.f18841f;
                    i2 = R$drawable.icon_yeelight_remote_image_luna;
                } else {
                    imageView = favoriteSceneVH.f18841f;
                    i2 = R$drawable.icon_yeelight_remote_image_minas;
                }
            } else if (eVar.mo27536e() == 950) {
                imageView = favoriteSceneVH.f18841f;
                i2 = R$drawable.icon_yeelight_remote_image_seesaw;
            } else if (eVar.mo27536e() == 959) {
                imageView = favoriteSceneVH.f18841f;
                i2 = R$drawable.icon_yeelight_remote_image_auster;
            } else if (eVar.mo27536e() == 1678) {
                imageView = favoriteSceneVH.f18841f;
                i2 = R$drawable.icon_yeelight_remote_image_fan;
            } else {
                imageView = favoriteSceneVH.f18841f;
                i2 = R$drawable.icon_yeelight_remote_image_unknown;
            }
            imageView.setImageResource(i2);
            favoriteSceneVH.f18839d.setOnClickListener(new C10201a(eVar, i));
            RemoteManagementActivity.this.f18822g.mo10109d(favoriteSceneVH.f18838c, eVar.mo27532a());
            favoriteSceneVH.f18840e.setClickable(true);
            favoriteSceneVH.f18840e.setOnClickListener(new C10331o0(this));
        }

        /* renamed from: c */
        public FavoriteSceneVH onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new FavoriteSceneVH(RemoteManagementActivity.this, LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.remote_list_item_layout, viewGroup, false));
        }

        public int getItemCount() {
            if (RemoteManagementActivity.this.f18834s != null) {
                return RemoteManagementActivity.this.f18834s.size();
            }
            return 0;
        }
    }

    /* renamed from: e0 */
    private void m24773e0() {
        this.f18817b.setLayoutManager(new LinearLayoutManager(this));
        this.f18817b.setItemAnimator(new DefaultItemAnimator());
        this.f18817b.addItemDecoration(new C10193l(this));
    }

    /* renamed from: f0 */
    private void m24774f0() {
        this.f18832q = (TwinklingRefreshLayout) findViewById(R$id.refresh_layout);
        C10493b bVar = new C10493b(this);
        this.f18832q.setOverScrollRefreshShow(false);
        this.f18832q.setHeaderView(bVar);
        this.f18832q.setBottomView((C3387a) null);
        this.f18832q.setEnableLoadmore(false);
        this.f18832q.setEnableOverScroll(true);
        this.f18832q.setOnRefreshListener(new C10186g());
    }

    /* renamed from: g0 */
    private void m24775g0() {
        this.f18823h.setOnClickListener(new C10194m());
        this.f18823h.setOnLongClickListener(new C10195n());
        this.f18824i.setOnClickListener(new C10196o());
        this.f18824i.setOnLongClickListener(new C10197p());
        this.f18825j.setOnClickListener(new C10198q());
        this.f18825j.setOnLongClickListener(new C10199r());
        this.f18826k.setOnClickListener(new C10180a());
        this.f18826k.setOnLongClickListener(new C10181b());
        this.f18827l.setOnClickListener(new C10182c());
        this.f18827l.setOnLongClickListener(new C10183d());
        this.f18828m.setOnClickListener(new C10184e());
        this.f18828m.setOnLongClickListener(new C10185f());
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public void m24776h0() {
        C4198d dVar = this.f18818c;
        if (dVar != null) {
            if (dVar instanceof C6029f) {
                ((C6029f) dVar).mo27735d2();
            } else if (dVar instanceof C6067o) {
                ((C6067o) dVar).mo27748k2();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public void m24777i0(int i) {
        C4198d dVar = this.f18818c;
        if (dVar != null && (dVar instanceof C6029f)) {
            ((C6029f) dVar).mo27737f2(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public void m24778j0(C5999e eVar) {
        C4198d dVar = this.f18818c;
        if (dVar != null) {
            if (dVar instanceof C6029f) {
                ((C6029f) dVar).mo27738h2(eVar.mo27532a(), eVar.mo27536e(), eVar.mo27534c());
            } else if (dVar instanceof C6067o) {
                C6067o oVar = (C6067o) dVar;
                oVar.mo27749o2(oVar instanceof C6033g ? eVar.mo27532a() : eVar.mo27535d(), eVar.mo27536e(), eVar.mo27534c());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public void m24779k0() {
        ArrayList<C5999e> arrayList = this.f18834s;
        if (arrayList == null || arrayList.size() == 0) {
            C4198d dVar = this.f18818c;
            if ((dVar instanceof C7472y) || (dVar instanceof C6922j1) || (dVar instanceof C7070n) || (dVar instanceof C6033g)) {
                this.f18833r.setVisibility(0);
                this.f18831p.setVisibility(8);
                this.f18830o.setVisibility(8);
                return;
            }
            this.f18831p.setVisibility(0);
            this.f18830o.setVisibility(8);
            this.f18833r.setVisibility(8);
            return;
        }
        this.f18833r.setVisibility(8);
        this.f18831p.setVisibility(8);
        this.f18830o.setVisibility(0);
        this.f18821f.notifyDataSetChanged();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_remote_management);
        this.f18834s = new ArrayList<>();
        this.f18817b = (RecyclerView) findViewById(R$id.remote_list_view);
        this.f18819d = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f18820e = (TextView) findViewById(R$id.btn_add_new_remote);
        this.f18823h = (ImageButton) findViewById(R$id.remote_control_on);
        this.f18824i = (ImageButton) findViewById(R$id.remote_control_off);
        this.f18825j = (ImageButton) findViewById(R$id.remote_control_ct);
        this.f18826k = (ImageButton) findViewById(R$id.remote_control_mode);
        this.f18827l = (ImageButton) findViewById(R$id.remote_control_bright_increase);
        this.f18828m = (ImageButton) findViewById(R$id.remote_control_bright_decrease);
        ImageView imageView = (ImageView) findViewById(R$id.remote_control_light_indicator);
        this.f18829n = imageView;
        imageView.setVisibility(4);
        this.f18819d = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f18830o = (LinearLayout) findViewById(R$id.remote_list_layout);
        this.f18831p = (FrameLayout) findViewById(R$id.remote_control_layout);
        this.f18833r = (TextView) findViewById(R$id.tv_not_bind);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18816u, "Activity has not device id", false);
            finish();
            return;
        }
        C4198d h0 = C4257w.m11945h0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f18818c = h0;
        if (h0 == null) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        this.f18819d.mo32825a(getString(R$string.remote_title), new C10191j(), (View.OnClickListener) null);
        this.f18819d.setTitleTextSize(16);
        this.f18820e.setOnClickListener(new C10192k());
        C10200s sVar = new C10200s();
        this.f18821f = sVar;
        this.f18817b.setAdapter(sVar);
        m24773e0();
        m24775g0();
        m24774f0();
        this.f18834s = this.f18818c.mo23408d0().mo27708q();
        m24779k0();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        this.f18818c.mo23400W0(this);
    }

    public void onResume() {
        super.onResume();
        this.f18818c.mo23365B0(this);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        m24776h0();
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == 4096) {
            this.f18834s = this.f18818c.mo23408d0().mo27708q();
            StringBuilder sb = new StringBuilder();
            sb.append("bound remote size: ");
            ArrayList<C5999e> arrayList = this.f18834s;
            sb.append(arrayList == null ? 0 : arrayList.size());
            sb.toString();
            runOnUiThread(new C10187h());
        }
    }
}
