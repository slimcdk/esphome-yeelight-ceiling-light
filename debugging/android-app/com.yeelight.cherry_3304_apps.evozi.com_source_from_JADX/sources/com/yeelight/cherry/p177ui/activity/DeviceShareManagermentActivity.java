package com.yeelight.cherry.p177ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chauthai.swipereveallayout.C1261a;
import com.chauthai.swipereveallayout.SwipeRevealLayout;
import com.miot.api.CommonHandler;
import com.miot.api.CompletionHandler;
import com.miot.api.MiotManager;
import com.miot.common.exception.MiotException;
import com.miot.common.share.SharedUser;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CircleImageView;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p011c.p083d.p090b.C1203t;
import p011c.p083d.p090b.C1219x;

/* renamed from: com.yeelight.cherry.ui.activity.DeviceShareManagermentActivity */
public class DeviceShareManagermentActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final String f10832h = DeviceShareManagermentActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1261a f10833b = new C1261a();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<SharedUser> f10834c;

    /* renamed from: d */
    C4200i f10835d;

    /* renamed from: e */
    ShareListViewAdapter f10836e;

    /* renamed from: f */
    LinearLayout f10837f;

    /* renamed from: g */
    LinearLayout f10838g;

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareManagermentActivity$ShareListViewAdapter */
    private class ShareListViewAdapter extends RecyclerView.Adapter<ViewHolder> {

        /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareManagermentActivity$ShareListViewAdapter$ViewHolder */
        public class ViewHolder extends RecyclerView.ViewHolder {

            /* renamed from: a */
            public CircleImageView f10840a;

            /* renamed from: b */
            public TextView f10841b;

            /* renamed from: c */
            public TextView f10842c;

            /* renamed from: d */
            public ImageView f10843d;

            /* renamed from: e */
            public SwipeRevealLayout f10844e;

            public ViewHolder(ShareListViewAdapter shareListViewAdapter, View view) {
                super(view);
                this.f10840a = (CircleImageView) view.findViewById(C11745R$id.share_user_img);
                this.f10841b = (TextView) view.findViewById(C11745R$id.share_user_name);
                this.f10842c = (TextView) view.findViewById(C11745R$id.share_info);
                this.f10843d = (ImageView) view.findViewById(C11745R$id.btn_item_delete);
                this.f10844e = (SwipeRevealLayout) view.findViewById(2131297369);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareManagermentActivity$ShareListViewAdapter$a */
        class C5226a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f10845a;

            C5226a(int i) {
                this.f10845a = i;
            }

            public void onClick(View view) {
                ShareListViewAdapter shareListViewAdapter = ShareListViewAdapter.this;
                shareListViewAdapter.m16307b(this.f10845a, ((SharedUser) DeviceShareManagermentActivity.this.f10834c.get(this.f10845a)).getUserId());
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareManagermentActivity$ShareListViewAdapter$b */
        class C5227b implements CompletionHandler {

            /* renamed from: a */
            final /* synthetic */ int f10847a;

            /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareManagermentActivity$ShareListViewAdapter$b$a */
            class C5228a implements Runnable {
                C5228a() {
                }

                public void run() {
                    DeviceShareManagermentActivity.this.f10836e.notifyDataSetChanged();
                    DeviceShareManagermentActivity.this.m16305b0();
                }
            }

            C5227b(int i) {
                this.f10847a = i;
            }

            public void onFailed(int i, String str) {
                String unused = DeviceShareManagermentActivity.f10832h;
                "cancelShare onFailed: " + i + " " + str;
            }

            public void onSucceed() {
                String unused = DeviceShareManagermentActivity.f10832h;
                DeviceShareManagermentActivity.this.f10834c.remove(this.f10847a);
                DeviceShareManagermentActivity.this.runOnUiThread(new C5228a());
            }
        }

        public ShareListViewAdapter() {
            DeviceShareManagermentActivity.this.f10833b.mo10111h(true);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m16307b(int i, String str) {
            try {
                MiotManager.getDeviceManager().cancelShare(DeviceShareManagermentActivity.this.f10835d.mo23393S(), str, new C5227b(i));
            } catch (MiotException e) {
                e.printStackTrace();
            }
        }

        /* renamed from: c */
        private String m16308c(long j) {
            return new SimpleDateFormat("yyyy.MM.dd", Locale.US).format(new Date(j * 1000));
        }

        /* renamed from: d */
        private String m16309d(int i) {
            DeviceShareManagermentActivity deviceShareManagermentActivity;
            int i2;
            if (i == 0) {
                deviceShareManagermentActivity = DeviceShareManagermentActivity.this;
                i2 = 2131755495;
            } else if (i != 1) {
                deviceShareManagermentActivity = DeviceShareManagermentActivity.this;
                i2 = 2131755497;
            } else {
                deviceShareManagermentActivity = DeviceShareManagermentActivity.this;
                i2 = 2131755483;
            }
            return deviceShareManagermentActivity.getString(i2);
        }

        /* renamed from: e */
        public void onBindViewHolder(ViewHolder viewHolder, int i) {
            DeviceShareManagermentActivity.this.f10833b.mo10109d(viewHolder.f10844e, ((SharedUser) DeviceShareManagermentActivity.this.f10834c.get(i)).getUserName());
            viewHolder.f10841b.setText(((SharedUser) DeviceShareManagermentActivity.this.f10834c.get(i)).getUserName());
            C1219x j = C1203t.m3106o(C4297y.f7456e).mo10003j(((SharedUser) DeviceShareManagermentActivity.this.f10834c.get(i)).getIcon());
            j.mo10038f(2131231752);
            j.mo10036d(viewHolder.f10840a);
            viewHolder.f10842c.setText(m16308c(((SharedUser) DeviceShareManagermentActivity.this.f10834c.get(i)).getShareTime()) + " " + m16309d(((SharedUser) DeviceShareManagermentActivity.this.f10834c.get(i)).getStatus().getCode()));
            viewHolder.f10843d.setOnClickListener(new C5226a(i));
        }

        /* renamed from: f */
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new ViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(C11748R$layout.device_share_managerment_item, viewGroup, false));
        }

        public int getItemCount() {
            return DeviceShareManagermentActivity.this.f10834c.size();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareManagermentActivity$a */
    class C5229a implements View.OnClickListener {
        C5229a() {
        }

        public void onClick(View view) {
            DeviceShareManagermentActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareManagermentActivity$b */
    class C5230b implements Runnable {
        C5230b() {
        }

        public void run() {
            if (DeviceShareManagermentActivity.this.f10834c.size() > 0) {
                DeviceShareManagermentActivity.this.f10837f.setVisibility(4);
                DeviceShareManagermentActivity.this.f10838g.setVisibility(0);
                return;
            }
            DeviceShareManagermentActivity.this.f10837f.setVisibility(0);
            DeviceShareManagermentActivity.this.f10838g.setVisibility(4);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareManagermentActivity$c */
    class C5231c implements CommonHandler<List<SharedUser>> {

        /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareManagermentActivity$c$a */
        class C5232a implements Runnable {
            C5232a() {
            }

            public void run() {
                DeviceShareManagermentActivity.this.f10836e.notifyDataSetChanged();
                DeviceShareManagermentActivity.this.m16305b0();
            }
        }

        C5231c() {
        }

        /* renamed from: a */
        public void onSucceed(List<SharedUser> list) {
            String unused = DeviceShareManagermentActivity.f10832h;
            List unused2 = DeviceShareManagermentActivity.this.f10834c = list;
            DeviceShareManagermentActivity.this.runOnUiThread(new C5232a());
        }

        public void onFailed(int i, String str) {
            String unused = DeviceShareManagermentActivity.f10832h;
            "querySharedUsers onFailed: " + i + " " + str;
            DeviceShareManagermentActivity.this.m16305b0();
        }
    }

    /* renamed from: a0 */
    private void m16304a0() {
        try {
            MiotManager.getDeviceManager().querySharedUsers(this.f10835d.mo23393S(), new C5231c());
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m16305b0() {
        this.f10837f.post(new C5230b());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_device_share_managerment);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297424);
        commonTitleBar.mo32825a(getString(2131755493), new C5229a(), (View.OnClickListener) null);
        commonTitleBar.setTitleTextSize(16);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f10832h, "Activity has not device id", false);
            finish();
            return;
        }
        this.f10835d = C4257w.m11953o0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f10837f = (LinearLayout) findViewById(2131297053);
        this.f10838g = (LinearLayout) findViewById(C11745R$id.share_list_layout);
        RecyclerView recyclerView = (RecyclerView) findViewById(C11745R$id.share_list);
        this.f10836e = new ShareListViewAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(this.f10836e);
        this.f10834c = new ArrayList();
        m16304a0();
    }
}
