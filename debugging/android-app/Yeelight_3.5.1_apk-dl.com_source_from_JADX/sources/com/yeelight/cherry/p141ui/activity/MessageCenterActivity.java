package com.yeelight.cherry.p141ui.activity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
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
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chauthai.swipereveallayout.C0635a;
import com.chauthai.swipereveallayout.SwipeRevealLayout;
import com.google.android.material.tabs.TabLayout;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.miot.api.CommonHandler;
import com.miot.api.CompletionHandler;
import com.miot.api.MiotManager;
import com.miot.common.exception.MiotException;
import com.miot.common.share.ShareStatus;
import com.miot.common.share.SharedRequest;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.models.C8318j;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.activity.FeedbackV3Activity;
import com.yeelight.yeelib.p142ui.activity.YeelightWebviewActivity;
import com.yeelight.yeelib.p142ui.view.C8869a;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.apache.commons.p194io.FilenameUtils;
import org.apache.commons.p194io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p051j4.C3280l;
import p051j4.C9193k;
import p096s2.C3691f;
import p129b4.C3988b;
import p134c4.C4007b;

/* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity */
public class MessageCenterActivity extends BaseActivity implements C3280l.C3282b {
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static String f10822s = "MessageCenterActivity";

    /* renamed from: a */
    C5459p f10823a;

    /* renamed from: b */
    C5458o f10824b;

    /* renamed from: c */
    LinearLayout f10825c;

    /* renamed from: d */
    LinearLayout f10826d;

    /* renamed from: e */
    TabLayout f10827e;

    /* renamed from: f */
    LinearLayout f10828f;

    /* renamed from: g */
    List<SharedRequest> f10829g = new ArrayList();

    /* renamed from: h */
    TwinklingRefreshLayout f10830h;

    /* renamed from: i */
    TwinklingRefreshLayout f10831i;

    /* renamed from: j */
    ProgressBar f10832j;

    /* renamed from: k */
    WebView f10833k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public ArrayList<C5470u> f10834l = new ArrayList<>();

    /* renamed from: m */
    RecyclerView f10835m;

    /* renamed from: n */
    RecyclerView f10836n;

    /* renamed from: o */
    LinearLayoutManager f10837o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public List<C5457n> f10838p = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f10839q = 1;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public Handler f10840r = new C5455m();

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$a */
    class C5442a implements TabLayout.OnTabSelectedListener {
        C5442a() {
        }

        public void onTabReselected(TabLayout.Tab tab) {
        }

        public void onTabSelected(TabLayout.Tab tab) {
            MessageCenterActivity.this.m16624l0(((C5470u) MessageCenterActivity.this.f10834l.get(tab.getPosition())).f10881a);
            tab.getCustomView().findViewById(C12225R$id.red_spot).setVisibility(8);
        }

        public void onTabUnselected(TabLayout.Tab tab) {
            String unused = MessageCenterActivity.f10822s;
            StringBuilder sb = new StringBuilder();
            sb.append("onTabUnselected position: ");
            sb.append(tab.getPosition());
            if (tab.getPosition() == 0) {
                tab.getCustomView().findViewById(C12225R$id.red_spot).setVisibility(8);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$b */
    class C5443b implements CommonHandler<List<SharedRequest>> {

        /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$b$a */
        class C5444a implements Runnable {
            C5444a() {
            }

            public void run() {
                MessageCenterActivity.this.f10830h.mo20222A();
                if (MessageCenterActivity.this.f10829g.size() > 0) {
                    MessageCenterActivity.this.f10827e.getTabAt(2).getCustomView().findViewById(C12225R$id.red_spot).setVisibility(0);
                }
            }
        }

        C5443b() {
        }

        /* renamed from: a */
        public void onSucceed(List<SharedRequest> list) {
            String unused = MessageCenterActivity.f10822s;
            MessageCenterActivity.this.f10829g.clear();
            for (int i = 0; i < list.size(); i++) {
                String unused2 = MessageCenterActivity.f10822s;
                StringBuilder sb = new StringBuilder();
                sb.append("share device : ");
                sb.append(list.get(i).getSharedDevice().getName());
                sb.append(" , share status : ");
                sb.append(list.get(i).getShareStatus());
                sb.append(" , time : ");
                sb.append(list.get(i).getShareTime());
                if (list.get(i).getShareStatus().equals(ShareStatus.pending)) {
                    MessageCenterActivity.this.f10829g.add(list.get(i));
                }
            }
            MessageCenterActivity.this.runOnUiThread(new C5444a());
            MessageCenterActivity.this.m16625m0();
        }

        public void onFailed(int i, String str) {
            String unused = MessageCenterActivity.f10822s;
            StringBuilder sb = new StringBuilder();
            sb.append("querySharedRequests onFailed: ");
            sb.append(i);
            sb.append(" ");
            sb.append(str);
            MessageCenterActivity.this.m16625m0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$c */
    class C5445c implements Runnable {
        C5445c() {
        }

        public void run() {
            if (MessageCenterActivity.this.f10839q == 0) {
                WebView webView = MessageCenterActivity.this.f10833k;
                if (webView != null) {
                    webView.setVisibility(0);
                }
                MessageCenterActivity.this.f10825c.setVisibility(8);
                MessageCenterActivity.this.f10828f.setVisibility(8);
                MessageCenterActivity.this.f10830h.setVisibility(8);
                MessageCenterActivity.this.f10836n.setVisibility(8);
                MessageCenterActivity.this.f10835m.setVisibility(8);
                MessageCenterActivity.this.f10826d.setVisibility(8);
                MessageCenterActivity.this.f10831i.setVisibility(8);
                return;
            }
            if (MessageCenterActivity.this.f10839q == 1) {
                MessageCenterActivity.this.f10833k.setVisibility(8);
                if (C3280l.m8817c().mo23856e().size() == 0) {
                    MessageCenterActivity.this.f10825c.setVisibility(0);
                    MessageCenterActivity.this.f10828f.setVisibility(0);
                    MessageCenterActivity.this.f10830h.setVisibility(8);
                    MessageCenterActivity.this.f10831i.setVisibility(8);
                    MessageCenterActivity.this.f10836n.setVisibility(8);
                    MessageCenterActivity.this.f10835m.setVisibility(8);
                } else {
                    MessageCenterActivity.this.f10825c.setVisibility(8);
                    MessageCenterActivity.this.f10828f.setVisibility(8);
                    MessageCenterActivity.this.f10824b.notifyDataSetChanged();
                    MessageCenterActivity.this.f10830h.setVisibility(8);
                    MessageCenterActivity.this.f10836n.setVisibility(4);
                    MessageCenterActivity.this.f10835m.setVisibility(0);
                    MessageCenterActivity.this.f10826d.setVisibility(0);
                    MessageCenterActivity.this.f10831i.setVisibility(0);
                    return;
                }
            } else {
                MessageCenterActivity.this.f10833k.setVisibility(8);
                if (MessageCenterActivity.this.f10829g.size() == 0) {
                    MessageCenterActivity.this.f10825c.setVisibility(0);
                    MessageCenterActivity.this.f10828f.setVisibility(8);
                    MessageCenterActivity.this.f10830h.setVisibility(8);
                    MessageCenterActivity.this.f10831i.setVisibility(8);
                    MessageCenterActivity.this.f10836n.setVisibility(8);
                    MessageCenterActivity.this.f10826d.setVisibility(8);
                    MessageCenterActivity.this.f10835m.setVisibility(8);
                    return;
                }
                MessageCenterActivity.this.f10825c.setVisibility(8);
                MessageCenterActivity.this.f10828f.setVisibility(8);
                MessageCenterActivity.this.f10823a.notifyDataSetChanged();
                MessageCenterActivity.this.f10830h.setVisibility(0);
                MessageCenterActivity.this.f10836n.setVisibility(0);
                MessageCenterActivity.this.f10835m.setVisibility(8);
                MessageCenterActivity.this.f10831i.setVisibility(8);
            }
            MessageCenterActivity.this.f10826d.setVisibility(8);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$d */
    class C5446d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TabLayout f10845a;

        /* renamed from: b */
        final /* synthetic */ int f10846b;

        C5446d(MessageCenterActivity messageCenterActivity, TabLayout tabLayout, int i) {
            this.f10845a = tabLayout;
            this.f10846b = i;
        }

        public void run() {
            LinearLayout linearLayout = (LinearLayout) this.f10845a.getChildAt(0);
            int b = C9193k.m22151b(this.f10845a.getContext(), (float) this.f10846b);
            for (int i = 0; i < linearLayout.getChildCount(); i++) {
                View childAt = linearLayout.getChildAt(i);
                TextView textView = (TextView) this.f10845a.getTabAt(i).getCustomView().findViewById(C12225R$id.tv_tab_title);
                int width = textView.getWidth() + C9193k.m22151b(this.f10845a.getContext(), 7.0f);
                if (width == 0) {
                    textView.measure(0, 0);
                    width = textView.getMeasuredWidth();
                }
                int width2 = childAt.getWidth();
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                layoutParams.width = width;
                if (this.f10846b == 0) {
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
    class C5447e implements View.OnClickListener {
        C5447e() {
        }

        public void onClick(View view) {
            MessageCenterActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$f */
    class C5448f extends C3691f {
        C5448f() {
        }

        /* renamed from: e */
        public void mo20228e(TwinklingRefreshLayout twinklingRefreshLayout) {
            Handler handler;
            long j;
            C3280l.m8817c().mo23857f();
            if (MessageCenterActivity.this.f10840r.hasMessages(0)) {
                MessageCenterActivity.this.f10840r.removeMessages(0);
                handler = MessageCenterActivity.this.f10840r;
                j = 200;
            } else {
                handler = MessageCenterActivity.this.f10840r;
                j = 1500;
            }
            handler.sendEmptyMessageDelayed(0, j);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$g */
    class C5449g implements View.OnClickListener {
        C5449g() {
        }

        public void onClick(View view) {
            MessageCenterActivity.this.startActivity(new Intent(MessageCenterActivity.this, FeedbackV3Activity.class));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$h */
    class C5450h implements View.OnClickListener {
        C5450h() {
        }

        public void onClick(View view) {
            MessageCenterActivity.this.startActivity(new Intent(MessageCenterActivity.this, FeedbackV3Activity.class));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$i */
    class C5451i extends WebViewClient {
        C5451i() {
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
            Toast.makeText(messageCenterActivity, messageCenterActivity.getString(2131755558), 0).show();
            MessageCenterActivity.this.finish();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str.startsWith("http:") || str.startsWith("https:")) {
                Intent intent = new Intent(MessageCenterActivity.this, YeelightWebviewActivity.class);
                intent.putExtra("url_index", -1);
                intent.putExtra("host_url", str);
                intent.putExtra("host_title", MessageCenterActivity.this.getString(2131756302));
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
    class C5452j extends WebChromeClient {
        C5452j() {
        }

        public void onHideCustomView() {
            super.onHideCustomView();
        }

        public void onProgressChanged(WebView webView, int i) {
            if (i < 100 && MessageCenterActivity.this.f10832j.getVisibility() == 8) {
                MessageCenterActivity.this.f10832j.setVisibility(0);
            }
            MessageCenterActivity.this.f10832j.setProgress(i);
            if (i == 100) {
                MessageCenterActivity.this.f10832j.setVisibility(8);
            }
        }

        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            super.onShowCustomView(view, customViewCallback);
            StringBuilder sb = new StringBuilder();
            sb.append("onShowCustomView view is ");
            sb.append(view.getClass().getSimpleName());
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$k */
    class C5453k implements C4007b<String> {
        C5453k() {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            String unused = MessageCenterActivity.f10822s;
            StringBuilder sb = new StringBuilder();
            sb.append("query news onSuccess: ");
            sb.append(str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("code") && jSONObject.getInt("code") == 1) {
                    MessageCenterActivity.this.f10827e.getTabAt(0).getCustomView().findViewById(C12225R$id.red_spot).setVisibility(0);
                }
                MessageCenterActivity.this.m16623k0();
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            String unused = MessageCenterActivity.f10822s;
            StringBuilder sb = new StringBuilder();
            sb.append("query news onFailure: ");
            sb.append(str);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$l */
    class C5454l implements C4007b<String> {
        C5454l(MessageCenterActivity messageCenterActivity) {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            String unused = MessageCenterActivity.f10822s;
            StringBuilder sb = new StringBuilder();
            sb.append("read_notice onSuccess: ");
            sb.append(str);
        }

        public void onFailure(int i, String str) {
            String unused = MessageCenterActivity.f10822s;
            StringBuilder sb = new StringBuilder();
            sb.append("read_notice onFailure: ");
            sb.append(str);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$m */
    class C5455m extends Handler {

        /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$m$a */
        class C5456a implements Runnable {
            C5456a() {
            }

            public void run() {
                MessageCenterActivity.this.f10831i.mo20222A();
            }
        }

        C5455m() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 0) {
                MessageCenterActivity.this.runOnUiThread(new C5456a());
            } else if (i == 1) {
                C3280l.f5290j = false;
                ((C5470u) MessageCenterActivity.this.f10834l.get(1)).mo30685c(false);
                MessageCenterActivity.this.f10827e.getTabAt(1).getCustomView().findViewById(C12225R$id.red_spot).setVisibility(8);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$n */
    class C5457n {

        /* renamed from: a */
        public int f10856a;

        /* renamed from: b */
        public String f10857b;

        C5457n(MessageCenterActivity messageCenterActivity, int i, String str) {
            this.f10856a = i;
            this.f10857b = str;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$o */
    private class C5458o extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        C5458o() {
        }

        public int getItemCount() {
            return MessageCenterActivity.this.f10838p.size();
        }

        public int getItemViewType(int i) {
            return ((C5457n) MessageCenterActivity.this.f10838p.get(i)).f10856a;
        }

        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TextView textView;
            C5457n nVar = (C5457n) MessageCenterActivity.this.f10838p.get(i);
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                textView = ((C5469t) viewHolder).f10880a;
            } else if (itemViewType == 1) {
                textView = ((C5467r) viewHolder).f10878a;
            } else if (itemViewType == 2) {
                textView = ((C5468s) viewHolder).f10879a;
            } else {
                return;
            }
            textView.setText(nVar.f10857b);
        }

        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                return new C5469t(MessageCenterActivity.this, LayoutInflater.from(viewGroup.getContext()).inflate(2131493164, viewGroup, false));
            } else if (i == 1) {
                return new C5467r(MessageCenterActivity.this, LayoutInflater.from(viewGroup.getContext()).inflate(2131493179, viewGroup, false));
            } else {
                return new C5468s(MessageCenterActivity.this, LayoutInflater.from(viewGroup.getContext()).inflate(2131493180, viewGroup, false));
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$p */
    private class C5459p extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* renamed from: a */
        private final C0635a f10859a;

        /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$p$a */
        class C5460a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ SharedRequest f10861a;

            /* renamed from: b */
            final /* synthetic */ RecyclerView.ViewHolder f10862b;

            /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$p$a$a */
            class C5461a implements CompletionHandler {

                /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$p$a$a$a */
                class C5462a implements Runnable {
                    C5462a() {
                    }

                    public void run() {
                        C5459p.this.notifyDataSetChanged();
                    }
                }

                C5461a() {
                }

                public void onFailed(int i, String str) {
                    String unused = MessageCenterActivity.f10822s;
                    StringBuilder sb = new StringBuilder();
                    sb.append("replySharedRequest accept onFailed : ");
                    sb.append(i);
                    sb.append(" ");
                    sb.append(str);
                }

                public void onSucceed() {
                    String unused = MessageCenterActivity.f10822s;
                    C5460a.this.f10861a.setShareStatus(ShareStatus.accept);
                    ((C5466q) C5460a.this.f10862b).f10871a.post(new C5462a());
                }
            }

            C5460a(SharedRequest sharedRequest, RecyclerView.ViewHolder viewHolder) {
                this.f10861a = sharedRequest;
                this.f10862b = viewHolder;
            }

            public void onClick(View view) {
                this.f10861a.setShareStatus(ShareStatus.accept);
                ((C5466q) this.f10862b).f10872b.setVisibility(4);
                ((C5466q) this.f10862b).f10876f.setVisibility(0);
                try {
                    MiotManager.getDeviceManager().replySharedRequest(this.f10861a, new C5461a());
                } catch (MiotException e) {
                    e.printStackTrace();
                }
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$p$b */
        class C5463b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ SharedRequest f10866a;

            /* renamed from: b */
            final /* synthetic */ RecyclerView.ViewHolder f10867b;

            /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$p$b$a */
            class C5464a implements CompletionHandler {

                /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$p$b$a$a */
                class C5465a implements Runnable {
                    C5465a() {
                    }

                    public void run() {
                        C5459p.this.notifyDataSetChanged();
                    }
                }

                C5464a() {
                }

                public void onFailed(int i, String str) {
                    String unused = MessageCenterActivity.f10822s;
                    StringBuilder sb = new StringBuilder();
                    sb.append("replySharedRequest reject onSucceed : ");
                    sb.append(i);
                    sb.append(" ");
                    sb.append(str);
                }

                public void onSucceed() {
                    String unused = MessageCenterActivity.f10822s;
                    C5463b bVar = C5463b.this;
                    MessageCenterActivity.this.f10829g.remove(bVar.f10866a);
                    ((C5466q) C5463b.this.f10867b).f10871a.post(new C5465a());
                    MessageCenterActivity.this.m16625m0();
                }
            }

            C5463b(SharedRequest sharedRequest, RecyclerView.ViewHolder viewHolder) {
                this.f10866a = sharedRequest;
                this.f10867b = viewHolder;
            }

            public void onClick(View view) {
                if (this.f10866a.getShareStatus() == ShareStatus.accept) {
                    MessageCenterActivity.this.f10829g.remove(this.f10866a);
                    C5459p.this.notifyDataSetChanged();
                    MessageCenterActivity.this.m16625m0();
                    return;
                }
                this.f10866a.setShareStatus(ShareStatus.reject);
                ((C5466q) this.f10867b).f10872b.setVisibility(4);
                ((C5466q) this.f10867b).f10876f.setVisibility(0);
                try {
                    MiotManager.getDeviceManager().replySharedRequest(this.f10866a, new C5464a());
                } catch (MiotException e) {
                    e.printStackTrace();
                }
            }
        }

        C5459p() {
            C0635a aVar = new C0635a();
            this.f10859a = aVar;
            aVar.mo11089h(true);
        }

        /* renamed from: a */
        private String m16636a(long j) {
            return new SimpleDateFormat("yyyy.MM.dd", Locale.US).format(new Date(j * 1000));
        }

        public int getItemCount() {
            return MessageCenterActivity.this.f10829g.size();
        }

        public long getItemId(int i) {
            return 0;
        }

        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            Drawable drawable;
            C5460a aVar;
            TextView textView;
            MessageCenterActivity messageCenterActivity;
            SharedRequest sharedRequest = MessageCenterActivity.this.f10829g.get(i);
            String deviceModel = sharedRequest.getSharedDevice().getDeviceModel();
            deviceModel.hashCode();
            char c = 65535;
            switch (deviceModel.hashCode()) {
                case -1644531059:
                    if (deviceModel.equals("yeelink.bhf_light.v1")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1494338802:
                    if (deviceModel.equals("yeelink.switch.sw1")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1462015191:
                    if (deviceModel.equals("yeelink.light.ceiling10")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1462015190:
                    if (deviceModel.equals("yeelink.light.ceiling11")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1462015189:
                    if (deviceModel.equals("yeelink.light.ceiling12")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1462015188:
                    if (deviceModel.equals("yeelink.light.ceiling13")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1462015187:
                    if (deviceModel.equals("yeelink.light.ceiling14")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1462015186:
                    if (deviceModel.equals("yeelink.light.ceiling15")) {
                        c = 7;
                        break;
                    }
                    break;
                case -1462015185:
                    if (deviceModel.equals("yeelink.light.ceiling16")) {
                        c = 8;
                        break;
                    }
                    break;
                case -1462015184:
                    if (deviceModel.equals("yeelink.light.ceiling17")) {
                        c = 9;
                        break;
                    }
                    break;
                case -1462015183:
                    if (deviceModel.equals("yeelink.light.ceiling18")) {
                        c = 10;
                        break;
                    }
                    break;
                case -1462015182:
                    if (deviceModel.equals("yeelink.light.ceiling19")) {
                        c = 11;
                        break;
                    }
                    break;
                case -1462015160:
                    if (deviceModel.equals("yeelink.light.ceiling20")) {
                        c = 12;
                        break;
                    }
                    break;
                case -1462015159:
                    if (deviceModel.equals("yeelink.light.ceiling21")) {
                        c = 13;
                        break;
                    }
                    break;
                case -1462015158:
                    if (deviceModel.equals("yeelink.light.ceiling22")) {
                        c = 14;
                        break;
                    }
                    break;
                case -1462015157:
                    if (deviceModel.equals("yeelink.light.ceiling23")) {
                        c = 15;
                        break;
                    }
                    break;
                case -1462015156:
                    if (deviceModel.equals("yeelink.light.ceiling24")) {
                        c = 16;
                        break;
                    }
                    break;
                case -1400275319:
                    if (deviceModel.equals("yeelink.light.ble1")) {
                        c = 17;
                        break;
                    }
                    break;
                case -1399953856:
                    if (deviceModel.equals("yeelink.light.mesh")) {
                        c = 18;
                        break;
                    }
                    break;
                case -1350780909:
                    if (deviceModel.equals("yeelink.plug.plug")) {
                        c = 19;
                        break;
                    }
                    break;
                case -1317475940:
                    if (deviceModel.equals("yeelink.light.ceil26")) {
                        c = 20;
                        break;
                    }
                    break;
                case -1317475939:
                    if (deviceModel.equals("yeelink.light.ceil27")) {
                        c = 21;
                        break;
                    }
                    break;
                case -1317475937:
                    if (deviceModel.equals("yeelink.light.ceil29")) {
                        c = 22;
                        break;
                    }
                    break;
                case -1317475915:
                    if (deviceModel.equals("yeelink.light.ceil30")) {
                        c = 23;
                        break;
                    }
                    break;
                case -1317475914:
                    if (deviceModel.equals("yeelink.light.ceil31")) {
                        c = 24;
                        break;
                    }
                    break;
                case -1317475913:
                    if (deviceModel.equals("yeelink.light.ceil32")) {
                        c = 25;
                        break;
                    }
                    break;
                case -1317475912:
                    if (deviceModel.equals("yeelink.light.ceil33")) {
                        c = 26;
                        break;
                    }
                    break;
                case -1317475910:
                    if (deviceModel.equals("yeelink.light.ceil35")) {
                        c = 27;
                        break;
                    }
                    break;
                case -1308146495:
                    if (deviceModel.equals("yeelink.light.color1")) {
                        c = 28;
                        break;
                    }
                    break;
                case -1308146494:
                    if (deviceModel.equals("yeelink.light.color2")) {
                        c = 29;
                        break;
                    }
                    break;
                case -1308146493:
                    if (deviceModel.equals("yeelink.light.color3")) {
                        c = 30;
                        break;
                    }
                    break;
                case -1308146492:
                    if (deviceModel.equals("yeelink.light.color4")) {
                        c = 31;
                        break;
                    }
                    break;
                case -1308146491:
                    if (deviceModel.equals("yeelink.light.color5")) {
                        c = ' ';
                        break;
                    }
                    break;
                case -1308146490:
                    if (deviceModel.equals("yeelink.light.color6")) {
                        c = '!';
                        break;
                    }
                    break;
                case -1308146488:
                    if (deviceModel.equals("yeelink.light.color8")) {
                        c = '\"';
                        break;
                    }
                    break;
                case -1308146447:
                    if (deviceModel.equals("yeelink.light.colora")) {
                        c = '#';
                        break;
                    }
                    break;
                case -1308146446:
                    if (deviceModel.equals("yeelink.light.colorb")) {
                        c = '$';
                        break;
                    }
                    break;
                case -1308146445:
                    if (deviceModel.equals("yeelink.light.colorc")) {
                        c = '%';
                        break;
                    }
                    break;
                case -1308146443:
                    if (deviceModel.equals("yeelink.light.colore")) {
                        c = '&';
                        break;
                    }
                    break;
                case -1282176368:
                    if (deviceModel.equals("yeelink.light.dn2grp")) {
                        c = '\'';
                        break;
                    }
                    break;
                case -1235140472:
                    if (deviceModel.equals("yeelink.light.fancl1")) {
                        c = '(';
                        break;
                    }
                    break;
                case -1235140471:
                    if (deviceModel.equals("yeelink.light.fancl2")) {
                        c = ')';
                        break;
                    }
                    break;
                case -1235140468:
                    if (deviceModel.equals("yeelink.light.fancl5")) {
                        c = '*';
                        break;
                    }
                    break;
                case -1235140467:
                    if (deviceModel.equals("yeelink.light.fancl6")) {
                        c = '+';
                        break;
                    }
                    break;
                case -1119332198:
                    if (deviceModel.equals("yeelink.wifispeaker.v1")) {
                        c = ',';
                        break;
                    }
                    break;
                case -1063384694:
                    if (deviceModel.equals("yeelink.light.lamp10")) {
                        c = '-';
                        break;
                    }
                    break;
                case -1063384689:
                    if (deviceModel.equals("yeelink.light.lamp15")) {
                        c = FilenameUtils.EXTENSION_SEPARATOR;
                        break;
                    }
                    break;
                case -1063384687:
                    if (deviceModel.equals("yeelink.light.lamp17")) {
                        c = IOUtils.DIR_SEPARATOR_UNIX;
                        break;
                    }
                    break;
                case -1063384685:
                    if (deviceModel.equals("yeelink.light.lamp19")) {
                        c = '0';
                        break;
                    }
                    break;
                case -1035626052:
                    if (deviceModel.equals("yeelink.light.mb1grp")) {
                        c = '1';
                        break;
                    }
                    break;
                case -1035596261:
                    if (deviceModel.equals("yeelink.light.mb2grp")) {
                        c = '2';
                        break;
                    }
                    break;
                case -948847040:
                    if (deviceModel.equals("yeelink.light.panel1")) {
                        c = '3';
                        break;
                    }
                    break;
                case -948847038:
                    if (deviceModel.equals("yeelink.light.panel3")) {
                        c = '4';
                        break;
                    }
                    break;
                case -939061393:
                    if (deviceModel.equals("yeelink.light.plate2")) {
                        c = '5';
                        break;
                    }
                    break;
                case -888668266:
                    if (deviceModel.equals("yilai.light.ceiling1")) {
                        c = '6';
                        break;
                    }
                    break;
                case -888668265:
                    if (deviceModel.equals("yilai.light.ceiling2")) {
                        c = '7';
                        break;
                    }
                    break;
                case -888668264:
                    if (deviceModel.equals("yilai.light.ceiling3")) {
                        c = '8';
                        break;
                    }
                    break;
                case -850921852:
                    if (deviceModel.equals("yeelink.light.sp1grp")) {
                        c = '9';
                        break;
                    }
                    break;
                case -845289556:
                    if (deviceModel.equals("yeelink.light.strip1")) {
                        c = ':';
                        break;
                    }
                    break;
                case -845289555:
                    if (deviceModel.equals("yeelink.light.strip2")) {
                        c = ';';
                        break;
                    }
                    break;
                case -845289553:
                    if (deviceModel.equals("yeelink.light.strip4")) {
                        c = '<';
                        break;
                    }
                    break;
                case -845289551:
                    if (deviceModel.equals("yeelink.light.strip6")) {
                        c = '=';
                        break;
                    }
                    break;
                case -845289549:
                    if (deviceModel.equals("yeelink.light.strip8")) {
                        c = '>';
                        break;
                    }
                    break;
                case -845289508:
                    if (deviceModel.equals("yeelink.light.stripa")) {
                        c = '?';
                        break;
                    }
                    break;
                case -458141175:
                    if (deviceModel.equals("yeelink.light.ceila")) {
                        c = '@';
                        break;
                    }
                    break;
                case -458141174:
                    if (deviceModel.equals("yeelink.light.ceilb")) {
                        c = 'A';
                        break;
                    }
                    break;
                case -458141173:
                    if (deviceModel.equals("yeelink.light.ceilc")) {
                        c = 'B';
                        break;
                    }
                    break;
                case -458141172:
                    if (deviceModel.equals("yeelink.light.ceild")) {
                        c = 'C';
                        break;
                    }
                    break;
                case -458141171:
                    if (deviceModel.equals("yeelink.light.ceile")) {
                        c = 'D';
                        break;
                    }
                    break;
                case -449944730:
                    if (deviceModel.equals("yeelink.light.lamp1")) {
                        c = 'E';
                        break;
                    }
                    break;
                case -449944729:
                    if (deviceModel.equals("yeelink.light.lamp2")) {
                        c = 'F';
                        break;
                    }
                    break;
                case -449944728:
                    if (deviceModel.equals("yeelink.light.lamp3")) {
                        c = 'G';
                        break;
                    }
                    break;
                case -449944727:
                    if (deviceModel.equals("yeelink.light.lamp4")) {
                        c = 'H';
                        break;
                    }
                    break;
                case -449944726:
                    if (deviceModel.equals("yeelink.light.lamp5")) {
                        c = 'I';
                        break;
                    }
                    break;
                case -449944724:
                    if (deviceModel.equals("yeelink.light.lamp7")) {
                        c = 'J';
                        break;
                    }
                    break;
                case -449944723:
                    if (deviceModel.equals("yeelink.light.lamp8")) {
                        c = 'K';
                        break;
                    }
                    break;
                case -449944722:
                    if (deviceModel.equals("yeelink.light.lamp9")) {
                        c = 'L';
                        break;
                    }
                    break;
                case -448603205:
                    if (deviceModel.equals("yeelink.light.mono1")) {
                        c = 'M';
                        break;
                    }
                    break;
                case -448603204:
                    if (deviceModel.equals("yeelink.light.mono2")) {
                        c = 'N';
                        break;
                    }
                    break;
                case -448603202:
                    if (deviceModel.equals("yeelink.light.mono4")) {
                        c = 'O';
                        break;
                    }
                    break;
                case -448603201:
                    if (deviceModel.equals("yeelink.light.mono5")) {
                        c = 'P';
                        break;
                    }
                    break;
                case -448603157:
                    if (deviceModel.equals("yeelink.light.monoa")) {
                        c = 'Q';
                        break;
                    }
                    break;
                case -448603156:
                    if (deviceModel.equals("yeelink.light.monob")) {
                        c = 'R';
                        break;
                    }
                    break;
                case -443031172:
                    if (deviceModel.equals("yeelink.light.spot1")) {
                        c = 'S';
                        break;
                    }
                    break;
                case -190173984:
                    if (deviceModel.equals("yeelink.gateway.v1")) {
                        c = 'T';
                        break;
                    }
                    break;
                case -190173936:
                    if (deviceModel.equals("yeelink.gateway.va")) {
                        c = 'U';
                        break;
                    }
                    break;
                case 674030242:
                    if (deviceModel.equals("yeelink.curtain.ctmt1")) {
                        c = 'V';
                        break;
                    }
                    break;
                case 922669543:
                    if (deviceModel.equals("yeelink.light.ceiling1")) {
                        c = 'W';
                        break;
                    }
                    break;
                case 922669544:
                    if (deviceModel.equals("yeelink.light.ceiling2")) {
                        c = 'X';
                        break;
                    }
                    break;
                case 922669545:
                    if (deviceModel.equals("yeelink.light.ceiling3")) {
                        c = 'Y';
                        break;
                    }
                    break;
                case 922669546:
                    if (deviceModel.equals("yeelink.light.ceiling4")) {
                        c = 'Z';
                        break;
                    }
                    break;
                case 922669547:
                    if (deviceModel.equals("yeelink.light.ceiling5")) {
                        c = '[';
                        break;
                    }
                    break;
                case 922669548:
                    if (deviceModel.equals("yeelink.light.ceiling6")) {
                        c = IOUtils.DIR_SEPARATOR_WINDOWS;
                        break;
                    }
                    break;
                case 922669549:
                    if (deviceModel.equals("yeelink.light.ceiling7")) {
                        c = ']';
                        break;
                    }
                    break;
                case 922669550:
                    if (deviceModel.equals("yeelink.light.ceiling8")) {
                        c = '^';
                        break;
                    }
                    break;
                case 1201756974:
                    if (deviceModel.equals("yeelink.light.ct2")) {
                        c = '_';
                        break;
                    }
                    break;
                case 1201757021:
                    if (deviceModel.equals("yeelink.light.cta")) {
                        c = '`';
                        break;
                    }
                    break;
                case 1201757023:
                    if (deviceModel.equals("yeelink.light.ctc")) {
                        c = 'a';
                        break;
                    }
                    break;
                case 1201766335:
                    if (deviceModel.equals("yeelink.light.ml1")) {
                        c = 'b';
                        break;
                    }
                    break;
                case 1201766336:
                    if (deviceModel.equals("yeelink.light.ml2")) {
                        c = 'c';
                        break;
                    }
                    break;
                case 1623724661:
                    if (deviceModel.equals("yeelink.light.bslamp1")) {
                        c = 'd';
                        break;
                    }
                    break;
                case 1623724662:
                    if (deviceModel.equals("yeelink.light.bslamp2")) {
                        c = 'e';
                        break;
                    }
                    break;
                case 1623724663:
                    if (deviceModel.equals("yeelink.light.bslamp3")) {
                        c = 'f';
                        break;
                    }
                    break;
                case 2102612488:
                    if (deviceModel.equals("yeelink.light.meshbulb1")) {
                        c = 'g';
                        break;
                    }
                    break;
                case 2102612489:
                    if (deviceModel.equals("yeelink.light.meshbulb2")) {
                        c = 'h';
                        break;
                    }
                    break;
                case 2146130361:
                    if (deviceModel.equals("yeelink.light.dnlight2")) {
                        c = 'i';
                        break;
                    }
                    break;
            }
            int i2 = 2131231343;
            switch (c) {
                case 0:
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231281;
                    break;
                case 1:
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231463;
                    break;
                case 2:
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231442;
                    break;
                case 3:
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231295;
                    break;
                case 4:
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231297;
                    break;
                case 5:
                case 6:
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231299;
                    break;
                case 7:
                case '@':
                case 'D':
                case 'W':
                case 'X':
                    drawable = ContextCompat.getDrawable(MessageCenterActivity.this, 2131231412);
                    break;
                case 8:
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231301;
                    break;
                case 9:
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231303;
                    break;
                case 10:
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231305;
                    break;
                case 11:
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231307;
                    break;
                case 12:
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231309;
                    break;
                case 13:
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231311;
                    break;
                case 14:
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231313;
                    break;
                case 15:
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231315;
                    break;
                case 16:
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231317;
                    break;
                case 18:
                case ':':
                case ';':
                case '=':
                case '>':
                case '?':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231451;
                    break;
                case 19:
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231455;
                    break;
                case 20:
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231319;
                    break;
                case 21:
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231321;
                    break;
                case 22:
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231323;
                    break;
                case 23:
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231325;
                    break;
                case 24:
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231327;
                    break;
                case 25:
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231329;
                    break;
                case 26:
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231331;
                    break;
                case 27:
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231333;
                    break;
                case 28:
                case ' ':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231465;
                    break;
                case 29:
                case 31:
                case '!':
                case '\"':
                case '$':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231407;
                    break;
                case 30:
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231345;
                    break;
                case '#':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231347;
                    break;
                case '%':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231349;
                    break;
                case '&':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231403;
                    break;
                case '\'':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231353;
                    break;
                case '(':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231371;
                    break;
                case ')':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231373;
                    break;
                case '*':
                case '+':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231375;
                    break;
                case ',':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231359;
                    break;
                case '-':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231391;
                    break;
                case '.':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231393;
                    break;
                case '/':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231395;
                    break;
                case '0':
                case 'f':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231362;
                    break;
                case '1':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231417;
                    break;
                case '2':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231419;
                    break;
                case '3':
                case '4':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231449;
                    break;
                case '5':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231453;
                    break;
                case '6':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231388;
                    break;
                case '7':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231385;
                    break;
                case '8':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231387;
                    break;
                case '9':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231459;
                    break;
                case '<':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231461;
                    break;
                case 'A':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231337;
                    break;
                case 'B':
                case 'C':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231339;
                    break;
                case 'E':
                case 'H':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231414;
                    break;
                case 'F':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231365;
                    break;
                case 'G':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231439;
                    break;
                case 'I':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231438;
                    break;
                case 'J':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231397;
                    break;
                case 'K':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231399;
                    break;
                case 'L':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231401;
                    break;
                case 'M':
                case 'N':
                case 'Q':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231357;
                    break;
                case 'O':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231431;
                    break;
                case 'P':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231433;
                    break;
                case 'R':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231435;
                    break;
                case 'S':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231457;
                    break;
                case 'T':
                case 'U':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231377;
                    break;
                case 'V':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231467;
                    break;
                case 'Y':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231369;
                    break;
                case 'Z':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231368;
                    break;
                case '[':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231351;
                    break;
                case '\\':
                case ']':
                case '^':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231446;
                    break;
                case '_':
                case '`':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231409;
                    break;
                case 'a':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231405;
                    break;
                case 'b':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231427;
                    break;
                case 'c':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231429;
                    break;
                case 'd':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231341;
                    break;
                case 'e':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231363;
                    break;
                case 'g':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231421;
                    break;
                case 'h':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231423;
                    break;
                case 'i':
                    messageCenterActivity = MessageCenterActivity.this;
                    i2 = 2131231355;
                    break;
                default:
                    messageCenterActivity = MessageCenterActivity.this;
                    break;
            }
            drawable = ContextCompat.getDrawable(messageCenterActivity, i2);
            C5466q qVar = (C5466q) viewHolder;
            qVar.f10871a.setBackground(drawable);
            qVar.f10872b.setVisibility(0);
            qVar.f10876f.setVisibility(4);
            if (sharedRequest.getShareStatus().equals(ShareStatus.pending)) {
                qVar.f10872b.setTextColor(MessageCenterActivity.this.getResources().getColor(2131099843));
                qVar.f10872b.setBackgroundResource(2131230944);
                qVar.f10872b.setText(2131755871);
                textView = qVar.f10872b;
                aVar = new C5460a(sharedRequest, viewHolder);
            } else {
                qVar.f10872b.setTextColor(MessageCenterActivity.this.getResources().getColor(2131099839));
                aVar = null;
                qVar.f10872b.setBackground((Drawable) null);
                qVar.f10872b.setText(2131755870);
                textView = qVar.f10872b;
            }
            textView.setOnClickListener(aVar);
            qVar.f10875e.setOnClickListener(new C5463b(sharedRequest, viewHolder));
            qVar.f10874d.setText(String.format(Locale.US, MessageCenterActivity.this.getText(2131755872).toString(), new Object[]{sharedRequest.getSenderName()}));
            qVar.f10873c.setText(m16636a(sharedRequest.getShareTime()));
            this.f10859a.mo11087d(qVar.f10877g, String.valueOf(sharedRequest.getMessageId()));
        }

        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C5466q(MessageCenterActivity.this, LayoutInflater.from(viewGroup.getContext()).inflate(2131493145, viewGroup, false));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$q */
    class C5466q extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public ImageView f10871a;

        /* renamed from: b */
        public TextView f10872b;

        /* renamed from: c */
        public TextView f10873c;

        /* renamed from: d */
        public TextView f10874d;

        /* renamed from: e */
        public ImageView f10875e;

        /* renamed from: f */
        ProgressBar f10876f;

        /* renamed from: g */
        SwipeRevealLayout f10877g;

        public C5466q(MessageCenterActivity messageCenterActivity, View view) {
            super(view);
            this.f10871a = (ImageView) view.findViewById(2131296666);
            this.f10873c = (TextView) view.findViewById(2131296668);
            this.f10872b = (TextView) view.findViewById(2131296665);
            this.f10877g = (SwipeRevealLayout) view.findViewById(2131297525);
            this.f10875e = (ImageView) view.findViewById(2131296898);
            this.f10874d = (TextView) view.findViewById(2131296667);
            this.f10876f = (ProgressBar) view.findViewById(2131296664);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$r */
    class C5467r extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f10878a;

        public C5467r(MessageCenterActivity messageCenterActivity, View view) {
            super(view);
            this.f10878a = (TextView) view.findViewById(2131297644);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$s */
    class C5468s extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f10879a;

        public C5468s(MessageCenterActivity messageCenterActivity, View view) {
            super(view);
            this.f10879a = (TextView) view.findViewById(2131297644);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$t */
    class C5469t extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f10880a;

        public C5469t(MessageCenterActivity messageCenterActivity, View view) {
            super(view);
            this.f10880a = (TextView) view.findViewById(2131297664);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MessageCenterActivity$u */
    public class C5470u {

        /* renamed from: a */
        int f10881a;

        /* renamed from: b */
        String f10882b;

        /* renamed from: c */
        boolean f10883c = false;

        C5470u(MessageCenterActivity messageCenterActivity, int i, String str, boolean z) {
            this.f10881a = i;
            this.f10882b = str;
            this.f10883c = z;
        }

        /* renamed from: a */
        public boolean mo30683a() {
            return this.f10883c;
        }

        /* renamed from: b */
        public String mo30684b() {
            return this.f10882b;
        }

        /* renamed from: c */
        public void mo30685c(boolean z) {
            this.f10883c = z;
        }
    }

    /* renamed from: V */
    private void m16610V(TabLayout tabLayout, int i, int i2) {
        tabLayout.setTabMode(i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C9193k.m22150a(this, 44.0f));
        int a = C9193k.m22150a(this, (float) i2);
        layoutParams.setMargins(a, 0, a, 0);
        tabLayout.setLayoutParams(layoutParams);
    }

    /* renamed from: f0 */
    private void m16619f0() {
        try {
            MiotManager.getDeviceManager().querySharedRequests(new C5443b());
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: g0 */
    private void m16620g0() {
        this.f10827e.setOnTabSelectedListener(new C5442a());
    }

    /* renamed from: h0 */
    private void m16621h0() {
        C5457n nVar;
        List<C5457n> list;
        this.f10838p.clear();
        List<C8318j> e = C3280l.m8817c().mo23856e();
        StringBuilder sb = new StringBuilder();
        sb.append("reAssembleFeedbackList, list count = ");
        sb.append(e.size());
        if (e.size() != 0) {
            m16625m0();
            ArrayList<C8318j> arrayList = new ArrayList<>();
            Collections.addAll(arrayList, new C8318j[e.size()]);
            Collections.copy(arrayList, e);
            Collections.reverse(arrayList);
            C8318j jVar = (C8318j) arrayList.get(0);
            this.f10838p.add(new C5457n(this, 0, jVar.mo35369b().split(" ")[0]));
            for (C8318j jVar2 : arrayList) {
                if (!jVar2.mo35369b().split(" ")[0].equals(jVar.mo35369b().split(" ")[0])) {
                    this.f10838p.add(new C5457n(this, 0, jVar2.mo35369b().split(" ")[0]));
                }
                if (jVar2.mo35370c() == 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("record1 context = ");
                    sb2.append(jVar2.mo35368a());
                    list = this.f10838p;
                    nVar = new C5457n(this, 2, jVar2.mo35368a());
                } else {
                    list = this.f10838p;
                    nVar = new C5457n(this, 1, jVar2.mo35368a());
                }
                list.add(nVar);
                jVar = jVar2;
            }
            this.f10824b.notifyDataSetChanged();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0087, code lost:
        if (r1 == 213) goto L_0x006c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void initWebView() {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.yeelight.yeelib.utils.AppUtils.f4989m
            r0.append(r1)
            java.lang.String r1 = "message_center.html"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            boolean r1 = com.yeelight.yeelib.utils.AppUtils.f4977a
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
            android.webkit.WebView r1 = r4.f10833k
            r1.loadUrl(r0)
            android.webkit.WebView r0 = r4.f10833k
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
            if (r1 != r3) goto L_0x0072
        L_0x006c:
            android.webkit.WebSettings$ZoomDensity r1 = android.webkit.WebSettings.ZoomDensity.FAR
        L_0x006e:
            r0.setDefaultZoom(r1)
            goto L_0x008a
        L_0x0072:
            r3 = 160(0xa0, float:2.24E-43)
            if (r1 != r3) goto L_0x0079
            android.webkit.WebSettings$ZoomDensity r1 = android.webkit.WebSettings.ZoomDensity.MEDIUM
            goto L_0x006e
        L_0x0079:
            r3 = 120(0x78, float:1.68E-43)
            if (r1 != r3) goto L_0x0080
            android.webkit.WebSettings$ZoomDensity r1 = android.webkit.WebSettings.ZoomDensity.CLOSE
            goto L_0x006e
        L_0x0080:
            r3 = 320(0x140, float:4.48E-43)
            if (r1 != r3) goto L_0x0085
            goto L_0x006c
        L_0x0085:
            r3 = 213(0xd5, float:2.98E-43)
            if (r1 != r3) goto L_0x008a
            goto L_0x006c
        L_0x008a:
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r1 < r3) goto L_0x0093
            r0.setMixedContentMode(r2)
        L_0x0093:
            android.webkit.WebView r0 = r4.f10833k
            com.yeelight.cherry.ui.activity.MessageCenterActivity$i r1 = new com.yeelight.cherry.ui.activity.MessageCenterActivity$i
            r1.<init>()
            r0.setWebViewClient(r1)
            android.webkit.WebView r0 = r4.f10833k
            com.yeelight.cherry.ui.activity.MessageCenterActivity$j r1 = new com.yeelight.cherry.ui.activity.MessageCenterActivity$j
            r1.<init>()
            r0.setWebChromeClient(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.activity.MessageCenterActivity.initWebView():void");
    }

    /* renamed from: j0 */
    private void m16622j0() {
        C3988b.m11567c(AppUtils.f4993q + "notice/has_new_notice/" + C3051a.m7925r().mo23366v(), String.class, new C5453k());
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public void m16623k0() {
        C3988b.m11567c(AppUtils.f4993q + "notice/read_notice/" + C3051a.m7925r().mo23366v(), String.class, new C5454l(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public void m16624l0(int i) {
        this.f10839q = i;
        m16625m0();
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public void m16625m0() {
        this.f10825c.post(new C5445c());
    }

    /* renamed from: B */
    public void mo23862B() {
        m16621h0();
        this.f10840r.sendEmptyMessage(0);
    }

    /* renamed from: G */
    public void mo23863G(String str) {
        this.f10840r.sendEmptyMessage(0);
    }

    /* renamed from: e0 */
    public View mo30659e0(int i) {
        View inflate = LayoutInflater.from(this).inflate(C12228R$layout.item_tab_layout, (ViewGroup) null);
        ((TextView) inflate.findViewById(C12225R$id.tv_tab_title)).setText(this.f10834l.get(i).mo30684b());
        ((ImageView) inflate.findViewById(C12225R$id.red_spot)).setVisibility(this.f10834l.get(i).mo30683a() ? 0 : 4);
        return inflate;
    }

    /* renamed from: i0 */
    public void mo30660i0(TabLayout tabLayout, int i) {
        tabLayout.post(new C5446d(this, tabLayout, i));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_message_center);
        if (MiotManager.getDeviceManager() == null) {
            finish();
            return;
        }
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297591);
        commonTitleBar.mo36195a(getText(2131756302).toString(), new C5447e(), (View.OnClickListener) null);
        commonTitleBar.setTitleTextSize(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        this.f10826d = (LinearLayout) findViewById(C12225R$id.feedback_layout);
        this.f10836n = (RecyclerView) findViewById(C12225R$id.device_share_message_list);
        this.f10827e = (TabLayout) findViewById(2131297530);
        this.f10836n.setLayoutManager(new LinearLayoutManager(this));
        C5459p pVar = new C5459p();
        this.f10823a = pVar;
        this.f10836n.setAdapter(pVar);
        this.f10835m = (RecyclerView) findViewById(C12225R$id.feedback_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        this.f10837o = linearLayoutManager;
        linearLayoutManager.setStackFromEnd(true);
        this.f10835m.setLayoutManager(this.f10837o);
        C5458o oVar = new C5458o();
        this.f10824b = oVar;
        this.f10835m.setAdapter(oVar);
        this.f10828f = (LinearLayout) findViewById(C12225R$id.new_feedback_layout);
        this.f10825c = (LinearLayout) findViewById(2131297176);
        this.f10832j = (ProgressBar) findViewById(C12225R$id.web_loading);
        this.f10833k = (WebView) findViewById(2131297754);
        m16619f0();
        TwinklingRefreshLayout twinklingRefreshLayout = (TwinklingRefreshLayout) findViewById(C12225R$id.refresh_layout_device_share);
        this.f10830h = twinklingRefreshLayout;
        twinklingRefreshLayout.setOverScrollRefreshShow(false);
        this.f10830h.setEnableLoadmore(false);
        this.f10830h.setEnableOverScroll(true);
        this.f10830h.setEnableRefresh(false);
        TwinklingRefreshLayout twinklingRefreshLayout2 = (TwinklingRefreshLayout) findViewById(C12225R$id.refresh_layout_feedback);
        this.f10831i = twinklingRefreshLayout2;
        twinklingRefreshLayout2.setOverScrollRefreshShow(false);
        this.f10831i.setHeaderView(new C8869a(this));
        this.f10831i.setEnableLoadmore(false);
        this.f10831i.setEnableOverScroll(true);
        this.f10831i.setOnRefreshListener(new C5448f());
        findViewById(C12225R$id.new_feedback).setOnClickListener(new C5449g());
        this.f10828f.setOnClickListener(new C5450h());
        this.f10834l.add(new C5470u(this, 0, getResources().getString(2131755868), false));
        this.f10834l.add(new C5470u(this, 1, getResources().getString(2131755876), C3280l.f5290j));
        this.f10834l.add(new C5470u(this, 2, getResources().getString(2131755875), this.f10829g.size() > 0));
        m16610V(this.f10827e, 1, 50);
        mo30660i0(this.f10827e, 0);
        TabLayout.Tab newTab = this.f10827e.newTab();
        newTab.setCustomView(mo30659e0(0));
        this.f10827e.addTab(newTab);
        TabLayout.Tab newTab2 = this.f10827e.newTab();
        newTab2.setCustomView(mo30659e0(1));
        this.f10827e.addTab(newTab2);
        TabLayout.Tab newTab3 = this.f10827e.newTab();
        newTab3.setCustomView(mo30659e0(2));
        this.f10827e.addTab(newTab3);
        m16620g0();
        m16624l0(0);
        if (C3280l.f5290j) {
            this.f10840r.sendEmptyMessageDelayed(1, 500);
        }
        initWebView();
        m16622j0();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        WebView webView = this.f10833k;
        if (webView != null) {
            webView.removeAllViews();
            this.f10833k.destroy();
        }
        this.f10833k = null;
        mo35652M(this);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C3280l.m8817c().mo23860k(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C3280l.m8817c().mo23858i(this);
        m16621h0();
    }
}
