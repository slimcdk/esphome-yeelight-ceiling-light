package com.yeelight.cherry.p141ui.activity;

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
import com.chauthai.swipereveallayout.C0635a;
import com.chauthai.swipereveallayout.SwipeRevealLayout;
import com.miot.api.CommonHandler;
import com.miot.api.CompletionHandler;
import com.miot.api.MiotManager;
import com.miot.common.exception.MiotException;
import com.miot.common.share.SharedUser;
import com.squareup.picasso.Picasso;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CircleImageView;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p051j4.C9193k;

/* renamed from: com.yeelight.cherry.ui.activity.DeviceShareManagermentActivity */
public class DeviceShareManagermentActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final String f10396g = "DeviceShareManagermentActivity";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C0635a f10397a = new C0635a();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<SharedUser> f10398b;

    /* renamed from: c */
    C3012e f10399c;

    /* renamed from: d */
    ShareListViewAdapter f10400d;

    /* renamed from: e */
    LinearLayout f10401e;

    /* renamed from: f */
    LinearLayout f10402f;

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareManagermentActivity$ShareListViewAdapter */
    private class ShareListViewAdapter extends RecyclerView.Adapter<ViewHolder> {

        /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareManagermentActivity$ShareListViewAdapter$ViewHolder */
        public class ViewHolder extends RecyclerView.ViewHolder {

            /* renamed from: a */
            public CircleImageView f10404a;

            /* renamed from: b */
            public TextView f10405b;

            /* renamed from: c */
            public TextView f10406c;

            /* renamed from: d */
            public ImageView f10407d;

            /* renamed from: e */
            public SwipeRevealLayout f10408e;

            public ViewHolder(ShareListViewAdapter shareListViewAdapter, View view) {
                super(view);
                this.f10404a = (CircleImageView) view.findViewById(C12225R$id.share_user_img);
                this.f10405b = (TextView) view.findViewById(C12225R$id.share_user_name);
                this.f10406c = (TextView) view.findViewById(C12225R$id.share_info);
                this.f10407d = (ImageView) view.findViewById(C12225R$id.btn_item_delete);
                this.f10408e = (SwipeRevealLayout) view.findViewById(2131297525);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareManagermentActivity$ShareListViewAdapter$a */
        class C5275a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f10409a;

            C5275a(int i) {
                this.f10409a = i;
            }

            public void onClick(View view) {
                ShareListViewAdapter shareListViewAdapter = ShareListViewAdapter.this;
                shareListViewAdapter.m16229b(this.f10409a, ((SharedUser) DeviceShareManagermentActivity.this.f10398b.get(this.f10409a)).getUserId());
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareManagermentActivity$ShareListViewAdapter$b */
        class C5276b implements CompletionHandler {

            /* renamed from: a */
            final /* synthetic */ int f10411a;

            /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareManagermentActivity$ShareListViewAdapter$b$a */
            class C5277a implements Runnable {
                C5277a() {
                }

                public void run() {
                    DeviceShareManagermentActivity.this.f10400d.notifyDataSetChanged();
                    DeviceShareManagermentActivity.this.m16227b0();
                }
            }

            C5276b(int i) {
                this.f10411a = i;
            }

            public void onFailed(int i, String str) {
                String unused = DeviceShareManagermentActivity.f10396g;
                StringBuilder sb = new StringBuilder();
                sb.append("cancelShare onFailed: ");
                sb.append(i);
                sb.append(" ");
                sb.append(str);
            }

            public void onSucceed() {
                String unused = DeviceShareManagermentActivity.f10396g;
                DeviceShareManagermentActivity.this.f10398b.remove(this.f10411a);
                DeviceShareManagermentActivity.this.runOnUiThread(new C5277a());
            }
        }

        public ShareListViewAdapter() {
            DeviceShareManagermentActivity.this.f10397a.mo11089h(true);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m16229b(int i, String str) {
            try {
                MiotManager.getDeviceManager().cancelShare(DeviceShareManagermentActivity.this.f10399c.mo23206S(), str, new C5276b(i));
            } catch (MiotException e) {
                e.printStackTrace();
            }
        }

        /* renamed from: c */
        private String m16230c(long j) {
            return new SimpleDateFormat("yyyy.MM.dd", Locale.US).format(new Date(j * 1000));
        }

        /* renamed from: d */
        private String m16231d(int i) {
            DeviceShareManagermentActivity deviceShareManagermentActivity;
            int i2;
            if (i == 0) {
                deviceShareManagermentActivity = DeviceShareManagermentActivity.this;
                i2 = 2131755499;
            } else if (i != 1) {
                deviceShareManagermentActivity = DeviceShareManagermentActivity.this;
                i2 = 2131755501;
            } else {
                deviceShareManagermentActivity = DeviceShareManagermentActivity.this;
                i2 = 2131755487;
            }
            return deviceShareManagermentActivity.getString(i2);
        }

        /* renamed from: e */
        public void onBindViewHolder(ViewHolder viewHolder, int i) {
            DeviceShareManagermentActivity.this.f10397a.mo11087d(viewHolder.f10408e, ((SharedUser) DeviceShareManagermentActivity.this.f10398b.get(i)).getUserName());
            viewHolder.f10405b.setText(((SharedUser) DeviceShareManagermentActivity.this.f10398b.get(i)).getUserName());
            Picasso.m12253o(C3108x.f4951e).mo28111j(((SharedUser) DeviceShareManagermentActivity.this.f10398b.get(i)).getIcon()).mo28225f(2131231774).mo28223d(viewHolder.f10404a);
            viewHolder.f10406c.setText(m16230c(((SharedUser) DeviceShareManagermentActivity.this.f10398b.get(i)).getShareTime()) + " " + m16231d(((SharedUser) DeviceShareManagermentActivity.this.f10398b.get(i)).getStatus().getCode()));
            viewHolder.f10407d.setOnClickListener(new C5275a(i));
        }

        /* renamed from: f */
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new ViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(C12228R$layout.device_share_managerment_item, viewGroup, false));
        }

        public int getItemCount() {
            return DeviceShareManagermentActivity.this.f10398b.size();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareManagermentActivity$a */
    class C5278a implements View.OnClickListener {
        C5278a() {
        }

        public void onClick(View view) {
            DeviceShareManagermentActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareManagermentActivity$b */
    class C5279b implements Runnable {
        C5279b() {
        }

        public void run() {
            if (DeviceShareManagermentActivity.this.f10398b.size() > 0) {
                DeviceShareManagermentActivity.this.f10401e.setVisibility(4);
                DeviceShareManagermentActivity.this.f10402f.setVisibility(0);
                return;
            }
            DeviceShareManagermentActivity.this.f10401e.setVisibility(0);
            DeviceShareManagermentActivity.this.f10402f.setVisibility(4);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareManagermentActivity$c */
    class C5280c implements CommonHandler<List<SharedUser>> {

        /* renamed from: com.yeelight.cherry.ui.activity.DeviceShareManagermentActivity$c$a */
        class C5281a implements Runnable {
            C5281a() {
            }

            public void run() {
                DeviceShareManagermentActivity.this.f10400d.notifyDataSetChanged();
                DeviceShareManagermentActivity.this.m16227b0();
            }
        }

        C5280c() {
        }

        /* renamed from: a */
        public void onSucceed(List<SharedUser> list) {
            String unused = DeviceShareManagermentActivity.f10396g;
            List unused2 = DeviceShareManagermentActivity.this.f10398b = list;
            DeviceShareManagermentActivity.this.runOnUiThread(new C5281a());
        }

        public void onFailed(int i, String str) {
            String unused = DeviceShareManagermentActivity.f10396g;
            StringBuilder sb = new StringBuilder();
            sb.append("querySharedUsers onFailed: ");
            sb.append(i);
            sb.append(" ");
            sb.append(str);
            DeviceShareManagermentActivity.this.m16227b0();
        }
    }

    /* renamed from: a0 */
    private void m16226a0() {
        try {
            MiotManager.getDeviceManager().querySharedUsers(this.f10399c.mo23206S(), new C5280c());
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m16227b0() {
        this.f10401e.post(new C5279b());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_device_share_managerment);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297591);
        commonTitleBar.mo36195a(getString(2131755497), new C5278a(), (View.OnClickListener) null);
        commonTitleBar.setTitleTextSize(16);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f10396g, "Activity has not device id", false);
            finish();
            return;
        }
        this.f10399c = YeelightDeviceManager.m7804r0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f10401e = (LinearLayout) findViewById(2131297176);
        this.f10402f = (LinearLayout) findViewById(C12225R$id.share_list_layout);
        RecyclerView recyclerView = (RecyclerView) findViewById(C12225R$id.share_list);
        this.f10400d = new ShareListViewAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(this.f10400d);
        this.f10398b = new ArrayList();
        m16226a0();
    }
}
