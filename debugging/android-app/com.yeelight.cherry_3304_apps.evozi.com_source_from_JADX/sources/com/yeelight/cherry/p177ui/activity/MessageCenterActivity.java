package com.yeelight.cherry.p177ui.activity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chauthai.swipereveallayout.C1261a;
import com.chauthai.swipereveallayout.SwipeRevealLayout;
import com.google.android.material.tabs.TabLayout;
import com.lcodecore.tkrefreshlayout.C3392f;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.miot.api.CommonHandler;
import com.miot.api.CompletionHandler;
import com.miot.api.MiotManager;
import com.miot.common.exception.MiotException;
import com.miot.common.share.ShareStatus;
import com.miot.common.share.SharedRequest;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p152f.C4201a;
import com.yeelight.yeelib.p153g.C9842k;
import com.yeelight.yeelib.p187h.C9862d;
import com.yeelight.yeelib.p187h.p189h.C9874b;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.activity.FeedbackV3Activity;
import com.yeelight.yeelib.p194ui.activity.YeelightWebviewActivity;
import com.yeelight.yeelib.p194ui.view.C10493b;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import com.yeelight.yeelib.utils.C4312n;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity */
public class MessageCenterActivity extends BaseActivity implements C4312n.C4314b {
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static String f11252t = MessageCenterActivity.class.getSimpleName();

    /* renamed from: b */
    C5413p f11253b;

    /* renamed from: c */
    C5412o f11254c;

    /* renamed from: d */
    LinearLayout f11255d;

    /* renamed from: e */
    LinearLayout f11256e;

    /* renamed from: f */
    TabLayout f11257f;

    /* renamed from: g */
    LinearLayout f11258g;

    /* renamed from: h */
    List<SharedRequest> f11259h = new ArrayList();

    /* renamed from: i */
    TwinklingRefreshLayout f11260i;

    /* renamed from: j */
    TwinklingRefreshLayout f11261j;

    /* renamed from: k */
    ProgressBar f11262k;

    /* renamed from: l */
    WebView f11263l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public ArrayList<C5424u> f11264m = new ArrayList<>();

    /* renamed from: n */
    RecyclerView f11265n;

    /* renamed from: o */
    RecyclerView f11266o;

    /* renamed from: p */
    LinearLayoutManager f11267p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public List<C5411n> f11268q = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f11269r = 1;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public Handler f11270s = new C5409m();

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$a */
    class C5396a implements TabLayout.OnTabSelectedListener {
        C5396a() {
        }

        public void onTabReselected(TabLayout.Tab tab) {
        }

        public void onTabSelected(TabLayout.Tab tab) {
            MessageCenterActivity.this.m16664l0(((C5424u) MessageCenterActivity.this.f11264m.get(tab.getPosition())).f11311a);
            tab.getCustomView().findViewById(C11745R$id.red_spot).setVisibility(8);
        }

        public void onTabUnselected(TabLayout.Tab tab) {
            String unused = MessageCenterActivity.f11252t;
            "onTabUnselected position: " + tab.getPosition();
            if (tab.getPosition() == 0) {
                tab.getCustomView().findViewById(C11745R$id.red_spot).setVisibility(8);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$b */
    class C5397b implements CommonHandler<List<SharedRequest>> {

        /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$b$a */
        class C5398a implements Runnable {
            C5398a() {
            }

            public void run() {
                MessageCenterActivity.this.f11260i.mo18609A();
                if (MessageCenterActivity.this.f11259h.size() > 0) {
                    MessageCenterActivity.this.f11257f.getTabAt(2).getCustomView().findViewById(C11745R$id.red_spot).setVisibility(0);
                }
            }
        }

        C5397b() {
        }

        /* renamed from: a */
        public void onSucceed(List<SharedRequest> list) {
            String unused = MessageCenterActivity.f11252t;
            MessageCenterActivity.this.f11259h.clear();
            for (int i = 0; i < list.size(); i++) {
                String unused2 = MessageCenterActivity.f11252t;
                "share device : " + list.get(i).getSharedDevice().getName() + " , share status : " + list.get(i).getShareStatus() + " , time : " + list.get(i).getShareTime();
                if (list.get(i).getShareStatus().equals(ShareStatus.pending)) {
                    MessageCenterActivity.this.f11259h.add(list.get(i));
                }
            }
            MessageCenterActivity.this.runOnUiThread(new C5398a());
            MessageCenterActivity.this.m16665m0();
        }

        public void onFailed(int i, String str) {
            String unused = MessageCenterActivity.f11252t;
            "querySharedRequests onFailed: " + i + " " + str;
            MessageCenterActivity.this.m16665m0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$c */
    class C5399c implements Runnable {
        C5399c() {
        }

        public void run() {
            if (MessageCenterActivity.this.f11269r == 0) {
                WebView webView = MessageCenterActivity.this.f11263l;
                if (webView != null) {
                    webView.setVisibility(0);
                }
                MessageCenterActivity.this.f11255d.setVisibility(8);
                MessageCenterActivity.this.f11258g.setVisibility(8);
                MessageCenterActivity.this.f11260i.setVisibility(8);
                MessageCenterActivity.this.f11266o.setVisibility(8);
                MessageCenterActivity.this.f11265n.setVisibility(8);
                MessageCenterActivity.this.f11256e.setVisibility(8);
                MessageCenterActivity.this.f11261j.setVisibility(8);
                return;
            }
            if (MessageCenterActivity.this.f11269r == 1) {
                MessageCenterActivity.this.f11263l.setVisibility(8);
                if (C4312n.m12166c().mo23772e().size() == 0) {
                    MessageCenterActivity.this.f11255d.setVisibility(0);
                    MessageCenterActivity.this.f11258g.setVisibility(0);
                    MessageCenterActivity.this.f11260i.setVisibility(8);
                    MessageCenterActivity.this.f11261j.setVisibility(8);
                    MessageCenterActivity.this.f11266o.setVisibility(8);
                    MessageCenterActivity.this.f11265n.setVisibility(8);
                } else {
                    MessageCenterActivity.this.f11255d.setVisibility(8);
                    MessageCenterActivity.this.f11258g.setVisibility(8);
                    MessageCenterActivity.this.f11254c.notifyDataSetChanged();
                    MessageCenterActivity.this.f11260i.setVisibility(8);
                    MessageCenterActivity.this.f11266o.setVisibility(4);
                    MessageCenterActivity.this.f11265n.setVisibility(0);
                    MessageCenterActivity.this.f11256e.setVisibility(0);
                    MessageCenterActivity.this.f11261j.setVisibility(0);
                    return;
                }
            } else {
                MessageCenterActivity.this.f11263l.setVisibility(8);
                if (MessageCenterActivity.this.f11259h.size() == 0) {
                    MessageCenterActivity.this.f11255d.setVisibility(0);
                    MessageCenterActivity.this.f11258g.setVisibility(8);
                    MessageCenterActivity.this.f11260i.setVisibility(8);
                    MessageCenterActivity.this.f11261j.setVisibility(8);
                    MessageCenterActivity.this.f11266o.setVisibility(8);
                    MessageCenterActivity.this.f11256e.setVisibility(8);
                    MessageCenterActivity.this.f11265n.setVisibility(8);
                    return;
                }
                MessageCenterActivity.this.f11255d.setVisibility(8);
                MessageCenterActivity.this.f11258g.setVisibility(8);
                MessageCenterActivity.this.f11253b.notifyDataSetChanged();
                MessageCenterActivity.this.f11260i.setVisibility(0);
                MessageCenterActivity.this.f11266o.setVisibility(0);
                MessageCenterActivity.this.f11265n.setVisibility(8);
                MessageCenterActivity.this.f11261j.setVisibility(8);
            }
            MessageCenterActivity.this.f11256e.setVisibility(8);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$d */
    class C5400d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TabLayout f11275a;

        /* renamed from: b */
        final /* synthetic */ int f11276b;

        C5400d(MessageCenterActivity messageCenterActivity, TabLayout tabLayout, int i) {
            this.f11275a = tabLayout;
            this.f11276b = i;
        }

        public void run() {
            LinearLayout linearLayout = (LinearLayout) this.f11275a.getChildAt(0);
            int b = C10547m.m25752b(this.f11275a.getContext(), (float) this.f11276b);
            for (int i = 0; i < linearLayout.getChildCount(); i++) {
                View childAt = linearLayout.getChildAt(i);
                TextView textView = (TextView) this.f11275a.getTabAt(i).getCustomView().findViewById(C11745R$id.tv_tab_title);
                int width = textView.getWidth() + C10547m.m25752b(this.f11275a.getContext(), 7.0f);
                if (width == 0) {
                    textView.measure(0, 0);
                    width = textView.getMeasuredWidth();
                }
                int width2 = childAt.getWidth();
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                layoutParams.width = width;
                if (this.f11276b == 0) {
                    int i2 = (width2 - width) / 2;
                    layoutParams.leftMargin = i2;
                    layoutParams.rightMargin = i2;
                } else {
                    layoutParams.leftMargin = b;
                    layoutParams.rightMargin = b;
                }
                childAt.setLayoutParams(layoutParams);
                childAt.invalidate();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$e */
    class C5401e implements View.OnClickListener {
        C5401e() {
        }

        public void onClick(View view) {
            MessageCenterActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$f */
    class C5402f extends C3392f {
        C5402f() {
        }

        /* renamed from: e */
        public void mo18615e(TwinklingRefreshLayout twinklingRefreshLayout) {
            Handler handler;
            long j;
            C4312n.m12166c().mo23773f();
            if (MessageCenterActivity.this.f11270s.hasMessages(0)) {
                MessageCenterActivity.this.f11270s.removeMessages(0);
                handler = MessageCenterActivity.this.f11270s;
                j = 200;
            } else {
                handler = MessageCenterActivity.this.f11270s;
                j = 1500;
            }
            handler.sendEmptyMessageDelayed(0, j);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$g */
    class C5403g implements View.OnClickListener {
        C5403g() {
        }

        public void onClick(View view) {
            MessageCenterActivity.this.startActivity(new Intent(MessageCenterActivity.this, FeedbackV3Activity.class));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$h */
    class C5404h implements View.OnClickListener {
        C5404h() {
        }

        public void onClick(View view) {
            MessageCenterActivity.this.startActivity(new Intent(MessageCenterActivity.this, FeedbackV3Activity.class));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$i */
    class C5405i extends WebViewClient {
        C5405i() {
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            MessageCenterActivity messageCenterActivity = MessageCenterActivity.this;
            Toast.makeText(messageCenterActivity, messageCenterActivity.getString(2131755554), 0).show();
            MessageCenterActivity.this.finish();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str.startsWith("http:") || str.startsWith("https:")) {
                Intent intent = new Intent(MessageCenterActivity.this, YeelightWebviewActivity.class);
                intent.putExtra("url_index", -1);
                intent.putExtra("host_url", str);
                intent.putExtra("host_title", MessageCenterActivity.this.getString(2131756273));
                MessageCenterActivity.this.startActivity(intent);
                return true;
            }
            try {
                MessageCenterActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            } catch (ActivityNotFoundException unused) {
            }
            return true;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$j */
    class C5406j extends WebChromeClient {
        C5406j() {
        }

        public void onHideCustomView() {
            super.onHideCustomView();
        }

        public void onProgressChanged(WebView webView, int i) {
            if (i < 100 && MessageCenterActivity.this.f11262k.getVisibility() == 8) {
                MessageCenterActivity.this.f11262k.setVisibility(0);
            }
            MessageCenterActivity.this.f11262k.setProgress(i);
            if (i == 100) {
                MessageCenterActivity.this.f11262k.setVisibility(8);
            }
        }

        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            super.onShowCustomView(view, customViewCallback);
            "onShowCustomView view is " + view.getClass().getSimpleName();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$k */
    class C5407k implements C9874b<String> {
        C5407k() {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            String unused = MessageCenterActivity.f11252t;
            "query news onSuccess: " + str;
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("code") && jSONObject.getInt("code") == 1) {
                    MessageCenterActivity.this.f11257f.getTabAt(0).getCustomView().findViewById(C11745R$id.red_spot).setVisibility(0);
                }
                MessageCenterActivity.this.m16663k0();
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            String unused = MessageCenterActivity.f11252t;
            "query news onFailure: " + str;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$l */
    class C5408l implements C9874b<String> {
        C5408l(MessageCenterActivity messageCenterActivity) {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            String unused = MessageCenterActivity.f11252t;
            "read_notice onSuccess: " + str;
        }

        public void onFailure(int i, String str) {
            String unused = MessageCenterActivity.f11252t;
            "read_notice onFailure: " + str;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$m */
    class C5409m extends Handler {

        /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$m$a */
        class C5410a implements Runnable {
            C5410a() {
            }

            public void run() {
                MessageCenterActivity.this.f11261j.mo18609A();
            }
        }

        C5409m() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 0) {
                MessageCenterActivity.this.runOnUiThread(new C5410a());
            } else if (i == 1) {
                C4312n.f7502j = false;
                ((C5424u) MessageCenterActivity.this.f11264m.get(1)).mo26670c(false);
                MessageCenterActivity.this.f11257f.getTabAt(1).getCustomView().findViewById(C11745R$id.red_spot).setVisibility(8);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$n */
    class C5411n {

        /* renamed from: a */
        public int f11286a;

        /* renamed from: b */
        public String f11287b;

        C5411n(MessageCenterActivity messageCenterActivity, int i, String str) {
            this.f11286a = i;
            this.f11287b = str;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$o */
    private class C5412o extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        C5412o() {
        }

        public int getItemCount() {
            return MessageCenterActivity.this.f11268q.size();
        }

        public int getItemViewType(int i) {
            return ((C5411n) MessageCenterActivity.this.f11268q.get(i)).f11286a;
        }

        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TextView textView;
            C5411n nVar = (C5411n) MessageCenterActivity.this.f11268q.get(i);
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                textView = ((C5423t) viewHolder).f11310a;
            } else if (itemViewType == 1) {
                textView = ((C5421r) viewHolder).f11308a;
            } else if (itemViewType == 2) {
                textView = ((C5422s) viewHolder).f11309a;
            } else {
                return;
            }
            textView.setText(nVar.f11287b);
        }

        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                return new C5423t(MessageCenterActivity.this, LayoutInflater.from(viewGroup.getContext()).inflate(2131493160, viewGroup, false));
            } else if (i == 1) {
                return new C5421r(MessageCenterActivity.this, LayoutInflater.from(viewGroup.getContext()).inflate(2131493175, viewGroup, false));
            } else {
                return new C5422s(MessageCenterActivity.this, LayoutInflater.from(viewGroup.getContext()).inflate(2131493176, viewGroup, false));
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$p */
    private class C5413p extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* renamed from: a */
        private final C1261a f11289a;

        /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$p$a */
        class C5414a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ SharedRequest f11291a;

            /* renamed from: b */
            final /* synthetic */ RecyclerView.ViewHolder f11292b;

            /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$p$a$a */
            class C5415a implements CompletionHandler {

                /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$p$a$a$a */
                class C5416a implements Runnable {
                    C5416a() {
                    }

                    public void run() {
                        C5413p.this.notifyDataSetChanged();
                    }
                }

                C5415a() {
                }

                public void onFailed(int i, String str) {
                    String unused = MessageCenterActivity.f11252t;
                    "replySharedRequest accept onFailed : " + i + " " + str;
                }

                public void onSucceed() {
                    String unused = MessageCenterActivity.f11252t;
                    C5414a.this.f11291a.setShareStatus(ShareStatus.accept);
                    ((C5420q) C5414a.this.f11292b).f11301a.post(new C5416a());
                }
            }

            C5414a(SharedRequest sharedRequest, RecyclerView.ViewHolder viewHolder) {
                this.f11291a = sharedRequest;
                this.f11292b = viewHolder;
            }

            public void onClick(View view) {
                this.f11291a.setShareStatus(ShareStatus.accept);
                ((C5420q) this.f11292b).f11302b.setVisibility(4);
                ((C5420q) this.f11292b).f11306f.setVisibility(0);
                try {
                    MiotManager.getDeviceManager().replySharedRequest(this.f11291a, new C5415a());
                } catch (MiotException e) {
                    e.printStackTrace();
                }
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$p$b */
        class C5417b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ SharedRequest f11296a;

            /* renamed from: b */
            final /* synthetic */ RecyclerView.ViewHolder f11297b;

            /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$p$b$a */
            class C5418a implements CompletionHandler {

                /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$p$b$a$a */
                class C5419a implements Runnable {
                    C5419a() {
                    }

                    public void run() {
                        C5413p.this.notifyDataSetChanged();
                    }
                }

                C5418a() {
                }

                public void onFailed(int i, String str) {
                    String unused = MessageCenterActivity.f11252t;
                    "replySharedRequest reject onSucceed : " + i + " " + str;
                }

                public void onSucceed() {
                    String unused = MessageCenterActivity.f11252t;
                    C5417b bVar = C5417b.this;
                    MessageCenterActivity.this.f11259h.remove(bVar.f11296a);
                    ((C5420q) C5417b.this.f11297b).f11301a.post(new C5419a());
                    MessageCenterActivity.this.m16665m0();
                }
            }

            C5417b(SharedRequest sharedRequest, RecyclerView.ViewHolder viewHolder) {
                this.f11296a = sharedRequest;
                this.f11297b = viewHolder;
            }

            public void onClick(View view) {
                if (this.f11296a.getShareStatus() == ShareStatus.accept) {
                    MessageCenterActivity.this.f11259h.remove(this.f11296a);
                    C5413p.this.notifyDataSetChanged();
                    MessageCenterActivity.this.m16665m0();
                    return;
                }
                this.f11296a.setShareStatus(ShareStatus.reject);
                ((C5420q) this.f11297b).f11302b.setVisibility(4);
                ((C5420q) this.f11297b).f11306f.setVisibility(0);
                try {
                    MiotManager.getDeviceManager().replySharedRequest(this.f11296a, new C5418a());
                } catch (MiotException e) {
                    e.printStackTrace();
                }
            }
        }

        C5413p() {
            C1261a aVar = new C1261a();
            this.f11289a = aVar;
            aVar.mo10111h(true);
        }

        /* renamed from: a */
        private String m16676a(long j) {
            return new SimpleDateFormat("yyyy.MM.dd", Locale.US).format(new Date(j * 1000));
        }

        public int getItemCount() {
            return MessageCenterActivity.this.f11259h.size();
        }

        public long getItemId(int i) {
            return 0;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r7, int r8) {
            /*
                r6 = this;
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                java.util.List<com.miot.common.share.SharedRequest> r0 = r0.f11259h
                java.lang.Object r8 = r0.get(r8)
                com.miot.common.share.SharedRequest r8 = (com.miot.common.share.SharedRequest) r8
                com.miot.common.device.Device r0 = r8.getSharedDevice()
                java.lang.String r0 = r0.getDeviceModel()
                int r1 = r0.hashCode()
                r2 = 4
                r3 = 1
                r4 = 0
                switch(r1) {
                    case -1644531059: goto L_0x04b2;
                    case -1494338802: goto L_0x04a7;
                    case -1462015191: goto L_0x049c;
                    case -1462015190: goto L_0x0491;
                    case -1462015189: goto L_0x0486;
                    case -1462015188: goto L_0x047b;
                    case -1462015187: goto L_0x0470;
                    case -1462015186: goto L_0x0465;
                    case -1462015185: goto L_0x045a;
                    case -1462015184: goto L_0x044e;
                    case -1462015183: goto L_0x0442;
                    case -1462015182: goto L_0x0436;
                    case -1462015160: goto L_0x042a;
                    case -1462015159: goto L_0x041e;
                    case -1462015158: goto L_0x0412;
                    case -1462015157: goto L_0x0406;
                    case -1462015156: goto L_0x03fa;
                    case -1400275319: goto L_0x03ef;
                    case -1399953856: goto L_0x03e3;
                    case -1350780909: goto L_0x03d7;
                    case -1317475940: goto L_0x03cb;
                    case -1317475939: goto L_0x03bf;
                    case -1317475937: goto L_0x03b3;
                    case -1317475915: goto L_0x03a7;
                    case -1317475914: goto L_0x039b;
                    case -1317475913: goto L_0x038f;
                    case -1317475912: goto L_0x0383;
                    case -1308146495: goto L_0x0377;
                    case -1308146494: goto L_0x036b;
                    case -1308146493: goto L_0x035f;
                    case -1308146492: goto L_0x0353;
                    case -1308146491: goto L_0x0347;
                    case -1308146490: goto L_0x033b;
                    case -1308146488: goto L_0x032f;
                    case -1308146447: goto L_0x0323;
                    case -1308146446: goto L_0x0317;
                    case -1308146445: goto L_0x030b;
                    case -1282176368: goto L_0x02ff;
                    case -1235140472: goto L_0x02f3;
                    case -1235140471: goto L_0x02e7;
                    case -1235140468: goto L_0x02db;
                    case -1235140467: goto L_0x02cf;
                    case -1119332198: goto L_0x02c3;
                    case -1063384694: goto L_0x02b7;
                    case -1063384689: goto L_0x02ab;
                    case -1063384687: goto L_0x029f;
                    case -1063384685: goto L_0x0293;
                    case -1035626052: goto L_0x0287;
                    case -1035596261: goto L_0x027b;
                    case -948847040: goto L_0x026f;
                    case -948847038: goto L_0x0263;
                    case -888668266: goto L_0x0257;
                    case -888668265: goto L_0x024b;
                    case -888668264: goto L_0x023f;
                    case -850921852: goto L_0x0233;
                    case -845289556: goto L_0x0227;
                    case -845289555: goto L_0x021b;
                    case -845289553: goto L_0x020f;
                    case -845289551: goto L_0x0203;
                    case -845289508: goto L_0x01f7;
                    case -458141175: goto L_0x01eb;
                    case -458141174: goto L_0x01df;
                    case -458141173: goto L_0x01d3;
                    case -458141172: goto L_0x01c7;
                    case -449944730: goto L_0x01bb;
                    case -449944729: goto L_0x01af;
                    case -449944728: goto L_0x01a3;
                    case -449944727: goto L_0x0197;
                    case -449944726: goto L_0x018b;
                    case -449944724: goto L_0x017f;
                    case -449944723: goto L_0x0173;
                    case -449944722: goto L_0x0167;
                    case -448603205: goto L_0x015c;
                    case -448603204: goto L_0x0151;
                    case -448603202: goto L_0x0146;
                    case -448603201: goto L_0x013b;
                    case -448603157: goto L_0x0130;
                    case -448603156: goto L_0x0125;
                    case -443031172: goto L_0x0119;
                    case -190173984: goto L_0x010d;
                    case -190173936: goto L_0x0101;
                    case 674030242: goto L_0x00f5;
                    case 922669543: goto L_0x00e9;
                    case 922669544: goto L_0x00dd;
                    case 922669545: goto L_0x00d1;
                    case 922669546: goto L_0x00c5;
                    case 922669547: goto L_0x00b9;
                    case 922669548: goto L_0x00ad;
                    case 922669549: goto L_0x00a1;
                    case 922669550: goto L_0x0095;
                    case 1201756974: goto L_0x008a;
                    case 1201757021: goto L_0x007e;
                    case 1201766335: goto L_0x0072;
                    case 1201766336: goto L_0x0066;
                    case 1623724661: goto L_0x005a;
                    case 1623724662: goto L_0x004e;
                    case 1623724663: goto L_0x0042;
                    case 2102612488: goto L_0x0036;
                    case 2102612489: goto L_0x002a;
                    case 2146130361: goto L_0x001e;
                    default: goto L_0x001c;
                }
            L_0x001c:
                goto L_0x04bd
            L_0x001e:
                java.lang.String r1 = "yeelink.light.dnlight2"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 82
                goto L_0x04be
            L_0x002a:
                java.lang.String r1 = "yeelink.light.meshbulb2"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 84
                goto L_0x04be
            L_0x0036:
                java.lang.String r1 = "yeelink.light.meshbulb1"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 83
                goto L_0x04be
            L_0x0042:
                java.lang.String r1 = "yeelink.light.bslamp3"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 40
                goto L_0x04be
            L_0x004e:
                java.lang.String r1 = "yeelink.light.bslamp2"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 39
                goto L_0x04be
            L_0x005a:
                java.lang.String r1 = "yeelink.light.bslamp1"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 38
                goto L_0x04be
            L_0x0066:
                java.lang.String r1 = "yeelink.light.ml2"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 87
                goto L_0x04be
            L_0x0072:
                java.lang.String r1 = "yeelink.light.ml1"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 86
                goto L_0x04be
            L_0x007e:
                java.lang.String r1 = "yeelink.light.cta"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 8
                goto L_0x04be
            L_0x008a:
                java.lang.String r1 = "yeelink.light.ct2"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 7
                goto L_0x04be
            L_0x0095:
                java.lang.String r1 = "yeelink.light.ceiling8"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 51
                goto L_0x04be
            L_0x00a1:
                java.lang.String r1 = "yeelink.light.ceiling7"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 50
                goto L_0x04be
            L_0x00ad:
                java.lang.String r1 = "yeelink.light.ceiling6"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 49
                goto L_0x04be
            L_0x00b9:
                java.lang.String r1 = "yeelink.light.ceiling5"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 48
                goto L_0x04be
            L_0x00c5:
                java.lang.String r1 = "yeelink.light.ceiling4"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 46
                goto L_0x04be
            L_0x00d1:
                java.lang.String r1 = "yeelink.light.ceiling3"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 45
                goto L_0x04be
            L_0x00dd:
                java.lang.String r1 = "yeelink.light.ceiling2"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 43
                goto L_0x04be
            L_0x00e9:
                java.lang.String r1 = "yeelink.light.ceiling1"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 42
                goto L_0x04be
            L_0x00f5:
                java.lang.String r1 = "yeelink.curtain.ctmt1"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 93
                goto L_0x04be
            L_0x0101:
                java.lang.String r1 = "yeelink.gateway.va"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 81
                goto L_0x04be
            L_0x010d:
                java.lang.String r1 = "yeelink.gateway.v1"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 80
                goto L_0x04be
            L_0x0119:
                java.lang.String r1 = "yeelink.light.spot1"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 85
                goto L_0x04be
            L_0x0125:
                java.lang.String r1 = "yeelink.light.monob"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 5
                goto L_0x04be
            L_0x0130:
                java.lang.String r1 = "yeelink.light.monoa"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 3
                goto L_0x04be
            L_0x013b:
                java.lang.String r1 = "yeelink.light.mono5"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 6
                goto L_0x04be
            L_0x0146:
                java.lang.String r1 = "yeelink.light.mono4"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 4
                goto L_0x04be
            L_0x0151:
                java.lang.String r1 = "yeelink.light.mono2"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 2
                goto L_0x04be
            L_0x015c:
                java.lang.String r1 = "yeelink.light.mono1"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 1
                goto L_0x04be
            L_0x0167:
                java.lang.String r1 = "yeelink.light.lamp9"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 31
                goto L_0x04be
            L_0x0173:
                java.lang.String r1 = "yeelink.light.lamp8"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 30
                goto L_0x04be
            L_0x017f:
                java.lang.String r1 = "yeelink.light.lamp7"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 29
                goto L_0x04be
            L_0x018b:
                java.lang.String r1 = "yeelink.light.lamp5"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 36
                goto L_0x04be
            L_0x0197:
                java.lang.String r1 = "yeelink.light.lamp4"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 28
                goto L_0x04be
            L_0x01a3:
                java.lang.String r1 = "yeelink.light.lamp3"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 35
                goto L_0x04be
            L_0x01af:
                java.lang.String r1 = "yeelink.light.lamp2"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 34
                goto L_0x04be
            L_0x01bb:
                java.lang.String r1 = "yeelink.light.lamp1"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 27
                goto L_0x04be
            L_0x01c7:
                java.lang.String r1 = "yeelink.light.ceild"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 75
                goto L_0x04be
            L_0x01d3:
                java.lang.String r1 = "yeelink.light.ceilc"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 74
                goto L_0x04be
            L_0x01df:
                java.lang.String r1 = "yeelink.light.ceilb"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 73
                goto L_0x04be
            L_0x01eb:
                java.lang.String r1 = "yeelink.light.ceila"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 44
                goto L_0x04be
            L_0x01f7:
                java.lang.String r1 = "yeelink.light.stripa"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 24
                goto L_0x04be
            L_0x0203:
                java.lang.String r1 = "yeelink.light.strip6"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 23
                goto L_0x04be
            L_0x020f:
                java.lang.String r1 = "yeelink.light.strip4"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 26
                goto L_0x04be
            L_0x021b:
                java.lang.String r1 = "yeelink.light.strip2"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 22
                goto L_0x04be
            L_0x0227:
                java.lang.String r1 = "yeelink.light.strip1"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 21
                goto L_0x04be
            L_0x0233:
                java.lang.String r1 = "yeelink.light.sp1grp"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 91
                goto L_0x04be
            L_0x023f:
                java.lang.String r1 = "yilai.light.ceiling3"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 78
                goto L_0x04be
            L_0x024b:
                java.lang.String r1 = "yilai.light.ceiling2"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 77
                goto L_0x04be
            L_0x0257:
                java.lang.String r1 = "yilai.light.ceiling1"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 76
                goto L_0x04be
            L_0x0263:
                java.lang.String r1 = "yeelink.light.panel3"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 10
                goto L_0x04be
            L_0x026f:
                java.lang.String r1 = "yeelink.light.panel1"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 9
                goto L_0x04be
            L_0x027b:
                java.lang.String r1 = "yeelink.light.mb2grp"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 90
                goto L_0x04be
            L_0x0287:
                java.lang.String r1 = "yeelink.light.mb1grp"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 89
                goto L_0x04be
            L_0x0293:
                java.lang.String r1 = "yeelink.light.lamp19"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 41
                goto L_0x04be
            L_0x029f:
                java.lang.String r1 = "yeelink.light.lamp17"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 37
                goto L_0x04be
            L_0x02ab:
                java.lang.String r1 = "yeelink.light.lamp15"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 33
                goto L_0x04be
            L_0x02b7:
                java.lang.String r1 = "yeelink.light.lamp10"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 32
                goto L_0x04be
            L_0x02c3:
                java.lang.String r1 = "yeelink.wifispeaker.v1"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 92
                goto L_0x04be
            L_0x02cf:
                java.lang.String r1 = "yeelink.light.fancl6"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 99
                goto L_0x04be
            L_0x02db:
                java.lang.String r1 = "yeelink.light.fancl5"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 98
                goto L_0x04be
            L_0x02e7:
                java.lang.String r1 = "yeelink.light.fancl2"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 97
                goto L_0x04be
            L_0x02f3:
                java.lang.String r1 = "yeelink.light.fancl1"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 96
                goto L_0x04be
            L_0x02ff:
                java.lang.String r1 = "yeelink.light.dn2grp"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 88
                goto L_0x04be
            L_0x030b:
                java.lang.String r1 = "yeelink.light.colorc"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 15
                goto L_0x04be
            L_0x0317:
                java.lang.String r1 = "yeelink.light.colorb"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 20
                goto L_0x04be
            L_0x0323:
                java.lang.String r1 = "yeelink.light.colora"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 14
                goto L_0x04be
            L_0x032f:
                java.lang.String r1 = "yeelink.light.color8"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 19
                goto L_0x04be
            L_0x033b:
                java.lang.String r1 = "yeelink.light.color6"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 18
                goto L_0x04be
            L_0x0347:
                java.lang.String r1 = "yeelink.light.color5"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 13
                goto L_0x04be
            L_0x0353:
                java.lang.String r1 = "yeelink.light.color4"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 17
                goto L_0x04be
            L_0x035f:
                java.lang.String r1 = "yeelink.light.color3"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 11
                goto L_0x04be
            L_0x036b:
                java.lang.String r1 = "yeelink.light.color2"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 16
                goto L_0x04be
            L_0x0377:
                java.lang.String r1 = "yeelink.light.color1"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 12
                goto L_0x04be
            L_0x0383:
                java.lang.String r1 = "yeelink.light.ceil33"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 72
                goto L_0x04be
            L_0x038f:
                java.lang.String r1 = "yeelink.light.ceil32"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 71
                goto L_0x04be
            L_0x039b:
                java.lang.String r1 = "yeelink.light.ceil31"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 70
                goto L_0x04be
            L_0x03a7:
                java.lang.String r1 = "yeelink.light.ceil30"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 69
                goto L_0x04be
            L_0x03b3:
                java.lang.String r1 = "yeelink.light.ceil29"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 68
                goto L_0x04be
            L_0x03bf:
                java.lang.String r1 = "yeelink.light.ceil27"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 67
                goto L_0x04be
            L_0x03cb:
                java.lang.String r1 = "yeelink.light.ceil26"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 66
                goto L_0x04be
            L_0x03d7:
                java.lang.String r1 = "yeelink.plug.plug"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 95
                goto L_0x04be
            L_0x03e3:
                java.lang.String r1 = "yeelink.light.mesh"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 25
                goto L_0x04be
            L_0x03ef:
                java.lang.String r1 = "yeelink.light.ble1"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 0
                goto L_0x04be
            L_0x03fa:
                java.lang.String r1 = "yeelink.light.ceiling24"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 65
                goto L_0x04be
            L_0x0406:
                java.lang.String r1 = "yeelink.light.ceiling23"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 64
                goto L_0x04be
            L_0x0412:
                java.lang.String r1 = "yeelink.light.ceiling22"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 63
                goto L_0x04be
            L_0x041e:
                java.lang.String r1 = "yeelink.light.ceiling21"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 62
                goto L_0x04be
            L_0x042a:
                java.lang.String r1 = "yeelink.light.ceiling20"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 61
                goto L_0x04be
            L_0x0436:
                java.lang.String r1 = "yeelink.light.ceiling19"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 60
                goto L_0x04be
            L_0x0442:
                java.lang.String r1 = "yeelink.light.ceiling18"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 59
                goto L_0x04be
            L_0x044e:
                java.lang.String r1 = "yeelink.light.ceiling17"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 58
                goto L_0x04be
            L_0x045a:
                java.lang.String r1 = "yeelink.light.ceiling16"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 57
                goto L_0x04be
            L_0x0465:
                java.lang.String r1 = "yeelink.light.ceiling15"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 56
                goto L_0x04be
            L_0x0470:
                java.lang.String r1 = "yeelink.light.ceiling14"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 55
                goto L_0x04be
            L_0x047b:
                java.lang.String r1 = "yeelink.light.ceiling13"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 54
                goto L_0x04be
            L_0x0486:
                java.lang.String r1 = "yeelink.light.ceiling12"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 53
                goto L_0x04be
            L_0x0491:
                java.lang.String r1 = "yeelink.light.ceiling11"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 52
                goto L_0x04be
            L_0x049c:
                java.lang.String r1 = "yeelink.light.ceiling10"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 47
                goto L_0x04be
            L_0x04a7:
                java.lang.String r1 = "yeelink.switch.sw1"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 94
                goto L_0x04be
            L_0x04b2:
                java.lang.String r1 = "yeelink.bhf_light.v1"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x04bd
                r0 = 79
                goto L_0x04be
            L_0x04bd:
                r0 = -1
            L_0x04be:
                r1 = 2131231392(0x7f0802a0, float:1.8078864E38)
                r5 = 2131231327(0x7f08025f, float:1.8078732E38)
                switch(r0) {
                    case 0: goto L_0x06c7;
                    case 1: goto L_0x06bd;
                    case 2: goto L_0x06bd;
                    case 3: goto L_0x06bd;
                    case 4: goto L_0x06b7;
                    case 5: goto L_0x06b1;
                    case 6: goto L_0x06ab;
                    case 7: goto L_0x06a5;
                    case 8: goto L_0x06a5;
                    case 9: goto L_0x069f;
                    case 10: goto L_0x069f;
                    case 11: goto L_0x0699;
                    case 12: goto L_0x0693;
                    case 13: goto L_0x0693;
                    case 14: goto L_0x068d;
                    case 15: goto L_0x0687;
                    case 16: goto L_0x0681;
                    case 17: goto L_0x0681;
                    case 18: goto L_0x0681;
                    case 19: goto L_0x0681;
                    case 20: goto L_0x0681;
                    case 21: goto L_0x067b;
                    case 22: goto L_0x067b;
                    case 23: goto L_0x067b;
                    case 24: goto L_0x067b;
                    case 25: goto L_0x067b;
                    case 26: goto L_0x0675;
                    case 27: goto L_0x066f;
                    case 28: goto L_0x066f;
                    case 29: goto L_0x0669;
                    case 30: goto L_0x0663;
                    case 31: goto L_0x065c;
                    case 32: goto L_0x0655;
                    case 33: goto L_0x064e;
                    case 34: goto L_0x0647;
                    case 35: goto L_0x0640;
                    case 36: goto L_0x0639;
                    case 37: goto L_0x0632;
                    case 38: goto L_0x062b;
                    case 39: goto L_0x0624;
                    case 40: goto L_0x061d;
                    case 41: goto L_0x061d;
                    case 42: goto L_0x0619;
                    case 43: goto L_0x0619;
                    case 44: goto L_0x0619;
                    case 45: goto L_0x0612;
                    case 46: goto L_0x060b;
                    case 47: goto L_0x0604;
                    case 48: goto L_0x05fd;
                    case 49: goto L_0x05f6;
                    case 50: goto L_0x05f6;
                    case 51: goto L_0x05f6;
                    case 52: goto L_0x05ef;
                    case 53: goto L_0x05e8;
                    case 54: goto L_0x05e1;
                    case 55: goto L_0x05e1;
                    case 56: goto L_0x0619;
                    case 57: goto L_0x05da;
                    case 58: goto L_0x05d3;
                    case 59: goto L_0x05cc;
                    case 60: goto L_0x05c5;
                    case 61: goto L_0x05be;
                    case 62: goto L_0x05b7;
                    case 63: goto L_0x05b0;
                    case 64: goto L_0x05a9;
                    case 65: goto L_0x05a2;
                    case 66: goto L_0x059b;
                    case 67: goto L_0x0594;
                    case 68: goto L_0x058d;
                    case 69: goto L_0x0586;
                    case 70: goto L_0x057f;
                    case 71: goto L_0x0578;
                    case 72: goto L_0x0571;
                    case 73: goto L_0x056a;
                    case 74: goto L_0x0563;
                    case 75: goto L_0x0563;
                    case 76: goto L_0x055c;
                    case 77: goto L_0x0555;
                    case 78: goto L_0x054e;
                    case 79: goto L_0x0547;
                    case 80: goto L_0x0540;
                    case 81: goto L_0x0540;
                    case 82: goto L_0x0539;
                    case 83: goto L_0x0532;
                    case 84: goto L_0x052b;
                    case 85: goto L_0x0524;
                    case 86: goto L_0x051d;
                    case 87: goto L_0x0516;
                    case 88: goto L_0x050f;
                    case 89: goto L_0x0508;
                    case 90: goto L_0x0501;
                    case 91: goto L_0x04fa;
                    case 92: goto L_0x04f3;
                    case 93: goto L_0x04ec;
                    case 94: goto L_0x04e5;
                    case 95: goto L_0x04de;
                    case 96: goto L_0x04d7;
                    case 97: goto L_0x04d0;
                    case 98: goto L_0x04c9;
                    case 99: goto L_0x04c9;
                    default: goto L_0x04c7;
                }
            L_0x04c7:
                goto L_0x06c7
            L_0x04c9:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231359(0x7f08027f, float:1.8078797E38)
                goto L_0x06c2
            L_0x04d0:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231357(0x7f08027d, float:1.8078793E38)
                goto L_0x06c2
            L_0x04d7:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231355(0x7f08027b, float:1.8078789E38)
                goto L_0x06c2
            L_0x04de:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231433(0x7f0802c9, float:1.8078947E38)
                goto L_0x06c2
            L_0x04e5:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231441(0x7f0802d1, float:1.8078963E38)
                goto L_0x06c2
            L_0x04ec:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231445(0x7f0802d5, float:1.8078971E38)
                goto L_0x06c2
            L_0x04f3:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231343(0x7f08026f, float:1.8078764E38)
                goto L_0x06c2
            L_0x04fa:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231437(0x7f0802cd, float:1.8078955E38)
                goto L_0x06c2
            L_0x0501:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231399(0x7f0802a7, float:1.8078878E38)
                goto L_0x06c2
            L_0x0508:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231397(0x7f0802a5, float:1.8078874E38)
                goto L_0x06c2
            L_0x050f:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231337(0x7f080269, float:1.8078752E38)
                goto L_0x06c2
            L_0x0516:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231409(0x7f0802b1, float:1.8078898E38)
                goto L_0x06c2
            L_0x051d:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231407(0x7f0802af, float:1.8078894E38)
                goto L_0x06c2
            L_0x0524:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231435(0x7f0802cb, float:1.807895E38)
                goto L_0x06c2
            L_0x052b:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231403(0x7f0802ab, float:1.8078886E38)
                goto L_0x06c2
            L_0x0532:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231401(0x7f0802a9, float:1.8078882E38)
                goto L_0x06c2
            L_0x0539:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231339(0x7f08026b, float:1.8078756E38)
                goto L_0x06c2
            L_0x0540:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231361(0x7f080281, float:1.80788E38)
                goto L_0x06c2
            L_0x0547:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231267(0x7f080223, float:1.807861E38)
                goto L_0x06c2
            L_0x054e:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231371(0x7f08028b, float:1.8078821E38)
                goto L_0x06c2
            L_0x0555:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231369(0x7f080289, float:1.8078817E38)
                goto L_0x06c2
            L_0x055c:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231372(0x7f08028c, float:1.8078823E38)
                goto L_0x06c2
            L_0x0563:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231323(0x7f08025b, float:1.8078724E38)
                goto L_0x06c2
            L_0x056a:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231321(0x7f080259, float:1.807872E38)
                goto L_0x06c2
            L_0x0571:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231317(0x7f080255, float:1.8078712E38)
                goto L_0x06c2
            L_0x0578:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231315(0x7f080253, float:1.8078708E38)
                goto L_0x06c2
            L_0x057f:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231313(0x7f080251, float:1.8078703E38)
                goto L_0x06c2
            L_0x0586:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231311(0x7f08024f, float:1.80787E38)
                goto L_0x06c2
            L_0x058d:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231309(0x7f08024d, float:1.8078695E38)
                goto L_0x06c2
            L_0x0594:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231307(0x7f08024b, float:1.8078691E38)
                goto L_0x06c2
            L_0x059b:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231305(0x7f080249, float:1.8078687E38)
                goto L_0x06c2
            L_0x05a2:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231303(0x7f080247, float:1.8078683E38)
                goto L_0x06c2
            L_0x05a9:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231301(0x7f080245, float:1.807868E38)
                goto L_0x06c2
            L_0x05b0:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231299(0x7f080243, float:1.8078675E38)
                goto L_0x06c2
            L_0x05b7:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231297(0x7f080241, float:1.8078671E38)
                goto L_0x06c2
            L_0x05be:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231295(0x7f08023f, float:1.8078667E38)
                goto L_0x06c2
            L_0x05c5:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231293(0x7f08023d, float:1.8078663E38)
                goto L_0x06c2
            L_0x05cc:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231291(0x7f08023b, float:1.8078659E38)
                goto L_0x06c2
            L_0x05d3:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231289(0x7f080239, float:1.8078655E38)
                goto L_0x06c2
            L_0x05da:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231287(0x7f080237, float:1.807865E38)
                goto L_0x06c2
            L_0x05e1:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231285(0x7f080235, float:1.8078647E38)
                goto L_0x06c2
            L_0x05e8:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231283(0x7f080233, float:1.8078643E38)
                goto L_0x06c2
            L_0x05ef:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231281(0x7f080231, float:1.8078639E38)
                goto L_0x06c2
            L_0x05f6:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231426(0x7f0802c2, float:1.8078933E38)
                goto L_0x06c2
            L_0x05fd:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231335(0x7f080267, float:1.8078748E38)
                goto L_0x06c2
            L_0x0604:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231422(0x7f0802be, float:1.8078925E38)
                goto L_0x06c2
            L_0x060b:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231352(0x7f080278, float:1.8078783E38)
                goto L_0x06c2
            L_0x0612:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231353(0x7f080279, float:1.8078785E38)
                goto L_0x06c2
            L_0x0619:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                goto L_0x06c2
            L_0x061d:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231346(0x7f080272, float:1.807877E38)
                goto L_0x06c2
            L_0x0624:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231347(0x7f080273, float:1.8078772E38)
                goto L_0x06c2
            L_0x062b:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231325(0x7f08025d, float:1.8078728E38)
                goto L_0x06c2
            L_0x0632:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231379(0x7f080293, float:1.8078837E38)
                goto L_0x06c2
            L_0x0639:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231418(0x7f0802ba, float:1.8078916E38)
                goto L_0x06c2
            L_0x0640:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231419(0x7f0802bb, float:1.8078918E38)
                goto L_0x06c2
            L_0x0647:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231349(0x7f080275, float:1.8078777E38)
                goto L_0x06c2
            L_0x064e:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231377(0x7f080291, float:1.8078833E38)
                goto L_0x06c2
            L_0x0655:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231375(0x7f08028f, float:1.807883E38)
                goto L_0x06c2
            L_0x065c:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231385(0x7f080299, float:1.807885E38)
                goto L_0x06c2
            L_0x0663:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231383(0x7f080297, float:1.8078845E38)
                goto L_0x06c2
            L_0x0669:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231381(0x7f080295, float:1.8078841E38)
                goto L_0x06c2
            L_0x066f:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231394(0x7f0802a2, float:1.8078868E38)
                goto L_0x06c2
            L_0x0675:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231439(0x7f0802cf, float:1.807896E38)
                goto L_0x06c2
            L_0x067b:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231431(0x7f0802c7, float:1.8078943E38)
                goto L_0x06c2
            L_0x0681:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231387(0x7f08029b, float:1.8078854E38)
                goto L_0x06c2
            L_0x0687:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231333(0x7f080265, float:1.8078744E38)
                goto L_0x06c2
            L_0x068d:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231331(0x7f080263, float:1.807874E38)
                goto L_0x06c2
            L_0x0693:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231443(0x7f0802d3, float:1.8078967E38)
                goto L_0x06c2
            L_0x0699:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231329(0x7f080261, float:1.8078736E38)
                goto L_0x06c2
            L_0x069f:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231429(0x7f0802c5, float:1.8078939E38)
                goto L_0x06c2
            L_0x06a5:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231389(0x7f08029d, float:1.8078858E38)
                goto L_0x06c2
            L_0x06ab:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231413(0x7f0802b5, float:1.8078906E38)
                goto L_0x06c2
            L_0x06b1:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231415(0x7f0802b7, float:1.807891E38)
                goto L_0x06c2
            L_0x06b7:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231411(0x7f0802b3, float:1.8078902E38)
                goto L_0x06c2
            L_0x06bd:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r1 = 2131231341(0x7f08026d, float:1.807876E38)
            L_0x06c2:
                android.graphics.drawable.Drawable r0 = androidx.core.content.ContextCompat.getDrawable(r0, r1)
                goto L_0x06cd
            L_0x06c7:
                com.yeelight.cherry.ui.activity.MessageCenterActivity r0 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                android.graphics.drawable.Drawable r0 = androidx.core.content.ContextCompat.getDrawable(r0, r5)
            L_0x06cd:
                r1 = r7
                com.yeelight.cherry.ui.activity.MessageCenterActivity$q r1 = (com.yeelight.cherry.p177ui.activity.MessageCenterActivity.C5420q) r1
                android.widget.ImageView r5 = r1.f11301a
                r5.setBackground(r0)
                android.widget.TextView r0 = r1.f11302b
                r0.setVisibility(r4)
                android.widget.ProgressBar r0 = r1.f11306f
                r0.setVisibility(r2)
                com.miot.common.share.ShareStatus r0 = r8.getShareStatus()
                com.miot.common.share.ShareStatus r2 = com.miot.common.share.ShareStatus.pending
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0715
                android.widget.TextView r0 = r1.f11302b
                com.yeelight.cherry.ui.activity.MessageCenterActivity r2 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                android.content.res.Resources r2 = r2.getResources()
                r5 = 2131099840(0x7f0600c0, float:1.7812045E38)
                int r2 = r2.getColor(r5)
                r0.setTextColor(r2)
                android.widget.TextView r0 = r1.f11302b
                r2 = 2131230930(0x7f0800d2, float:1.8077927E38)
                r0.setBackgroundResource(r2)
                android.widget.TextView r0 = r1.f11302b
                r2 = 2131755861(0x7f100355, float:1.9142613E38)
                r0.setText(r2)
                android.widget.TextView r0 = r1.f11302b
                com.yeelight.cherry.ui.activity.MessageCenterActivity$p$a r2 = new com.yeelight.cherry.ui.activity.MessageCenterActivity$p$a
                r2.<init>(r8, r7)
                goto L_0x0737
            L_0x0715:
                android.widget.TextView r0 = r1.f11302b
                com.yeelight.cherry.ui.activity.MessageCenterActivity r2 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                android.content.res.Resources r2 = r2.getResources()
                r5 = 2131099836(0x7f0600bc, float:1.7812036E38)
                int r2 = r2.getColor(r5)
                r0.setTextColor(r2)
                android.widget.TextView r0 = r1.f11302b
                r2 = 0
                r0.setBackground(r2)
                android.widget.TextView r0 = r1.f11302b
                r5 = 2131755860(0x7f100354, float:1.9142611E38)
                r0.setText(r5)
                android.widget.TextView r0 = r1.f11302b
            L_0x0737:
                r0.setOnClickListener(r2)
                android.widget.ImageView r0 = r1.f11305e
                com.yeelight.cherry.ui.activity.MessageCenterActivity$p$b r2 = new com.yeelight.cherry.ui.activity.MessageCenterActivity$p$b
                r2.<init>(r8, r7)
                r0.setOnClickListener(r2)
                android.widget.TextView r7 = r1.f11304d
                java.util.Locale r0 = java.util.Locale.US
                com.yeelight.cherry.ui.activity.MessageCenterActivity r2 = com.yeelight.cherry.p177ui.activity.MessageCenterActivity.this
                r5 = 2131755862(0x7f100356, float:1.9142615E38)
                java.lang.CharSequence r2 = r2.getText(r5)
                java.lang.String r2 = r2.toString()
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r5 = r8.getSenderName()
                r3[r4] = r5
                java.lang.String r0 = java.lang.String.format(r0, r2, r3)
                r7.setText(r0)
                android.widget.TextView r7 = r1.f11303c
                long r2 = r8.getShareTime()
                java.lang.String r0 = r6.m16676a(r2)
                r7.setText(r0)
                com.chauthai.swipereveallayout.a r7 = r6.f11289a
                com.chauthai.swipereveallayout.SwipeRevealLayout r0 = r1.f11307g
                java.lang.String r8 = r8.getMessageId()
                java.lang.String r8 = java.lang.String.valueOf(r8)
                r7.mo10109d(r0, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.activity.MessageCenterActivity.C5413p.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C5420q(MessageCenterActivity.this, LayoutInflater.from(viewGroup.getContext()).inflate(2131493141, viewGroup, false));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$q */
    class C5420q extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public ImageView f11301a;

        /* renamed from: b */
        public TextView f11302b;

        /* renamed from: c */
        public TextView f11303c;

        /* renamed from: d */
        public TextView f11304d;

        /* renamed from: e */
        public ImageView f11305e;

        /* renamed from: f */
        ProgressBar f11306f;

        /* renamed from: g */
        SwipeRevealLayout f11307g;

        public C5420q(MessageCenterActivity messageCenterActivity, View view) {
            super(view);
            this.f11301a = (ImageView) view.findViewById(2131296588);
            this.f11303c = (TextView) view.findViewById(2131296590);
            this.f11302b = (TextView) view.findViewById(2131296587);
            this.f11307g = (SwipeRevealLayout) view.findViewById(2131297369);
            this.f11305e = (ImageView) view.findViewById(2131296794);
            this.f11304d = (TextView) view.findViewById(2131296589);
            this.f11306f = (ProgressBar) view.findViewById(2131296586);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$r */
    class C5421r extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f11308a;

        public C5421r(MessageCenterActivity messageCenterActivity, View view) {
            super(view);
            this.f11308a = (TextView) view.findViewById(2131297469);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$s */
    class C5422s extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f11309a;

        public C5422s(MessageCenterActivity messageCenterActivity, View view) {
            super(view);
            this.f11309a = (TextView) view.findViewById(2131297469);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$t */
    class C5423t extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f11310a;

        public C5423t(MessageCenterActivity messageCenterActivity, View view) {
            super(view);
            this.f11310a = (TextView) view.findViewById(2131297489);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$u */
    public class C5424u {

        /* renamed from: a */
        int f11311a;

        /* renamed from: b */
        String f11312b;

        /* renamed from: c */
        boolean f11313c = false;

        C5424u(MessageCenterActivity messageCenterActivity, int i, String str, boolean z) {
            this.f11311a = i;
            this.f11312b = str;
            this.f11313c = z;
        }

        /* renamed from: a */
        public boolean mo26668a() {
            return this.f11313c;
        }

        /* renamed from: b */
        public String mo26669b() {
            return this.f11312b;
        }

        /* renamed from: c */
        public void mo26670c(boolean z) {
            this.f11313c = z;
        }
    }

    /* renamed from: V */
    private void m16650V(TabLayout tabLayout, int i, int i2) {
        tabLayout.setTabMode(i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C10547m.m25751a(this, 44.0f));
        int a = C10547m.m25751a(this, (float) i2);
        layoutParams.setMargins(a, 0, a, 0);
        tabLayout.setLayoutParams(layoutParams);
    }

    /* renamed from: f0 */
    private void m16659f0() {
        try {
            MiotManager.getDeviceManager().querySharedRequests(new C5397b());
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: g0 */
    private void m16660g0() {
        this.f11257f.setOnTabSelectedListener(new C5396a());
    }

    /* renamed from: h0 */
    private void m16661h0() {
        C5411n nVar;
        List<C5411n> list;
        this.f11268q.clear();
        List<C9842k> e = C4312n.m12166c().mo23772e();
        "reAssembleFeedbackList, list count = " + e.size();
        if (e.size() != 0) {
            m16665m0();
            ArrayList<C9842k> arrayList = new ArrayList<>();
            Collections.addAll(arrayList, new C9842k[e.size()]);
            Collections.copy(arrayList, e);
            Collections.reverse(arrayList);
            C9842k kVar = (C9842k) arrayList.get(0);
            this.f11268q.add(new C5411n(this, 0, kVar.mo31782b().split(" ")[0]));
            for (C9842k kVar2 : arrayList) {
                if (!kVar2.mo31782b().split(" ")[0].equals(kVar.mo31782b().split(" ")[0])) {
                    this.f11268q.add(new C5411n(this, 0, kVar2.mo31782b().split(" ")[0]));
                }
                if (kVar2.mo31783c() == 0) {
                    "record1 context = " + kVar2.mo31781a();
                    list = this.f11268q;
                    nVar = new C5411n(this, 2, kVar2.mo31781a());
                } else {
                    list = this.f11268q;
                    nVar = new C5411n(this, 1, kVar2.mo31781a());
                }
                list.add(nVar);
                kVar = kVar2;
            }
            this.f11254c.notifyDataSetChanged();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008a, code lost:
        if (r1 == 213) goto L_0x006f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void initWebView() {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.yeelight.yeelib.utils.C4308b.f7490i
            r0.append(r1)
            java.lang.String r1 = "notice/message_center.html"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            boolean r1 = com.yeelight.yeelib.utils.C4308b.f7482a
            if (r1 == 0) goto L_0x0028
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "?debug=1"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x0028:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "initWebView url: "
            r1.append(r2)
            r1.append(r0)
            r1.toString()
            android.webkit.WebView r1 = r4.f11263l
            r1.loadUrl(r0)
            android.webkit.WebView r0 = r4.f11263l
            android.webkit.WebSettings r0 = r0.getSettings()
            r1 = 1
            r0.setJavaScriptEnabled(r1)
            r2 = 0
            r0.setBuiltInZoomControls(r2)
            android.webkit.WebSettings$LayoutAlgorithm r3 = android.webkit.WebSettings.LayoutAlgorithm.SINGLE_COLUMN
            r0.setLayoutAlgorithm(r3)
            r0.setUseWideViewPort(r1)
            r0.setLoadWithOverviewMode(r1)
            r0.setDomStorageEnabled(r1)
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics
            r1.<init>()
            android.view.WindowManager r3 = r4.getWindowManager()
            android.view.Display r3 = r3.getDefaultDisplay()
            r3.getMetrics(r1)
            int r1 = r1.densityDpi
            r3 = 240(0xf0, float:3.36E-43)
            if (r1 != r3) goto L_0x0075
        L_0x006f:
            android.webkit.WebSettings$ZoomDensity r1 = android.webkit.WebSettings.ZoomDensity.FAR
        L_0x0071:
            r0.setDefaultZoom(r1)
            goto L_0x008d
        L_0x0075:
            r3 = 160(0xa0, float:2.24E-43)
            if (r1 != r3) goto L_0x007c
            android.webkit.WebSettings$ZoomDensity r1 = android.webkit.WebSettings.ZoomDensity.MEDIUM
            goto L_0x0071
        L_0x007c:
            r3 = 120(0x78, float:1.68E-43)
            if (r1 != r3) goto L_0x0083
            android.webkit.WebSettings$ZoomDensity r1 = android.webkit.WebSettings.ZoomDensity.CLOSE
            goto L_0x0071
        L_0x0083:
            r3 = 320(0x140, float:4.48E-43)
            if (r1 != r3) goto L_0x0088
            goto L_0x006f
        L_0x0088:
            r3 = 213(0xd5, float:2.98E-43)
            if (r1 != r3) goto L_0x008d
            goto L_0x006f
        L_0x008d:
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r1 < r3) goto L_0x0096
            r0.setMixedContentMode(r2)
        L_0x0096:
            android.webkit.WebView r0 = r4.f11263l
            com.yeelight.cherry.ui.activity.MessageCenterActivity$i r1 = new com.yeelight.cherry.ui.activity.MessageCenterActivity$i
            r1.<init>()
            r0.setWebViewClient(r1)
            android.webkit.WebView r0 = r4.f11263l
            com.yeelight.cherry.ui.activity.MessageCenterActivity$j r1 = new com.yeelight.cherry.ui.activity.MessageCenterActivity$j
            r1.<init>()
            r0.setWebChromeClient(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.activity.MessageCenterActivity.initWebView():void");
    }

    /* renamed from: j0 */
    private void m16662j0() {
        C9862d.m24133c(C4308b.f7492k + "notice/has_new_notice/" + C4201a.m11607r().mo23452v(), String.class, new C5407k());
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public void m16663k0() {
        C9862d.m24133c(C4308b.f7492k + "notice/read_notice/" + C4201a.m11607r().mo23452v(), String.class, new C5408l(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public void m16664l0(int i) {
        this.f11269r = i;
        m16665m0();
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public void m16665m0() {
        this.f11255d.post(new C5399c());
    }

    /* renamed from: B */
    public void mo23778B() {
        m16661h0();
        this.f11270s.sendEmptyMessage(0);
    }

    /* renamed from: G */
    public void mo23779G(String str) {
        this.f11270s.sendEmptyMessage(0);
    }

    /* renamed from: e0 */
    public View mo26644e0(int i) {
        View inflate = LayoutInflater.from(this).inflate(C11748R$layout.item_tab_layout, (ViewGroup) null);
        ((TextView) inflate.findViewById(C11745R$id.tv_tab_title)).setText(this.f11264m.get(i).mo26669b());
        ((ImageView) inflate.findViewById(C11745R$id.red_spot)).setVisibility(this.f11264m.get(i).mo26668a() ? 0 : 4);
        return inflate;
    }

    /* renamed from: i0 */
    public void mo26645i0(TabLayout tabLayout, int i) {
        tabLayout.post(new C5400d(this, tabLayout, i));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_message_center);
        if (MiotManager.getDeviceManager() == null) {
            finish();
            return;
        }
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297424);
        commonTitleBar.mo32825a(getText(2131756273).toString(), new C5401e(), (View.OnClickListener) null);
        commonTitleBar.setTitleTextSize(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        this.f11256e = (LinearLayout) findViewById(C11745R$id.feedback_layout);
        this.f11266o = (RecyclerView) findViewById(C11745R$id.device_share_message_list);
        this.f11257f = (TabLayout) findViewById(2131297374);
        this.f11266o.setLayoutManager(new LinearLayoutManager(this));
        C5413p pVar = new C5413p();
        this.f11253b = pVar;
        this.f11266o.setAdapter(pVar);
        this.f11265n = (RecyclerView) findViewById(C11745R$id.feedback_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        this.f11267p = linearLayoutManager;
        linearLayoutManager.setStackFromEnd(true);
        this.f11265n.setLayoutManager(this.f11267p);
        C5412o oVar = new C5412o();
        this.f11254c = oVar;
        this.f11265n.setAdapter(oVar);
        this.f11258g = (LinearLayout) findViewById(C11745R$id.new_feedback_layout);
        this.f11255d = (LinearLayout) findViewById(2131297053);
        this.f11262k = (ProgressBar) findViewById(C11745R$id.web_loading);
        this.f11263l = (WebView) findViewById(2131297569);
        m16659f0();
        TwinklingRefreshLayout twinklingRefreshLayout = (TwinklingRefreshLayout) findViewById(C11745R$id.refresh_layout_device_share);
        this.f11260i = twinklingRefreshLayout;
        twinklingRefreshLayout.setOverScrollRefreshShow(false);
        this.f11260i.setEnableLoadmore(false);
        this.f11260i.setEnableOverScroll(true);
        this.f11260i.setEnableRefresh(false);
        TwinklingRefreshLayout twinklingRefreshLayout2 = (TwinklingRefreshLayout) findViewById(C11745R$id.refresh_layout_feedback);
        this.f11261j = twinklingRefreshLayout2;
        twinklingRefreshLayout2.setOverScrollRefreshShow(false);
        this.f11261j.setHeaderView(new C10493b(this));
        this.f11261j.setEnableLoadmore(false);
        this.f11261j.setEnableOverScroll(true);
        this.f11261j.setOnRefreshListener(new C5402f());
        findViewById(C11745R$id.new_feedback).setOnClickListener(new C5403g());
        this.f11258g.setOnClickListener(new C5404h());
        this.f11264m.add(new C5424u(this, 0, getResources().getString(2131755858), false));
        this.f11264m.add(new C5424u(this, 1, getResources().getString(2131755866), C4312n.f7502j));
        this.f11264m.add(new C5424u(this, 2, getResources().getString(2131755865), this.f11259h.size() > 0));
        m16650V(this.f11257f, 1, 50);
        mo26645i0(this.f11257f, 0);
        TabLayout.Tab newTab = this.f11257f.newTab();
        newTab.setCustomView(mo26644e0(0));
        this.f11257f.addTab(newTab);
        TabLayout.Tab newTab2 = this.f11257f.newTab();
        newTab2.setCustomView(mo26644e0(1));
        this.f11257f.addTab(newTab2);
        TabLayout.Tab newTab3 = this.f11257f.newTab();
        newTab3.setCustomView(mo26644e0(2));
        this.f11257f.addTab(newTab3);
        m16660g0();
        m16664l0(0);
        if (C4312n.f7502j) {
            this.f11270s.sendEmptyMessageDelayed(1, 500);
        }
        initWebView();
        m16662j0();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        WebView webView = this.f11263l;
        if (webView != null) {
            webView.removeAllViews();
            this.f11263l.destroy();
        }
        this.f11263l = null;
        mo32192M(this);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C4312n.m12166c().mo23776k(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C4312n.m12166c().mo23774h(this);
        m16661h0();
    }
}
