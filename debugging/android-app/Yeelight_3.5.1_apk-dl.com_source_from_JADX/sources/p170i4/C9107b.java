package p170i4;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$style;
import p051j4.C9193k;

/* renamed from: i4.b */
public class C9107b extends Dialog {

    /* renamed from: a */
    private ProgressBar f16795a;

    /* renamed from: b */
    private ImageView f16796b;

    /* renamed from: c */
    private TextView f16797c;

    /* renamed from: d */
    private LayoutInflater f16798d;

    /* renamed from: e */
    private View f16799e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Activity f16800f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public long f16801g = 10000;

    /* renamed from: h */
    private Handler f16802h = new Handler(new C9108a());

    /* renamed from: i4.b$a */
    class C9108a implements Handler.Callback {
        C9108a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0 || C9107b.this.f16800f == null || C9107b.this.f16800f.isFinishing() || !C9107b.this.isShowing() || C9107b.this.getWindow() == null) {
                return false;
            }
            C9107b.this.dismiss();
            return false;
        }
    }

    /* renamed from: i4.b$b */
    public static class C9109b {

        /* renamed from: a */
        private C9107b f16804a;

        public C9109b(Activity activity) {
            this.f16804a = new C9107b(activity);
        }

        /* renamed from: a */
        public C9107b mo37127a() {
            return this.f16804a;
        }

        /* renamed from: b */
        public C9109b mo37128b(int i, String str) {
            this.f16804a.m21865e(i, str);
            return this;
        }

        /* renamed from: c */
        public C9109b mo37129c(long j) {
            long unused = this.f16804a.f16801g = j;
            return this;
        }

        /* renamed from: d */
        public C9109b mo37130d() {
            this.f16804a.show();
            return this;
        }
    }

    protected C9107b(Activity activity) {
        super(activity, R$style.block_dialog_style);
        this.f16800f = activity;
        LayoutInflater from = LayoutInflater.from(activity);
        this.f16798d = from;
        this.f16799e = from.inflate(R$layout.common_blocking_dialog, (ViewGroup) null, false);
        int c = C9193k.m22152c(getContext(), 109.0f);
        if (getWindow() != null) {
            getWindow().requestFeature(1);
        }
        setContentView(this.f16799e);
        getWindow().setLayout(c, c);
        getWindow().getDecorView().setBackground((Drawable) null);
        m21864d();
    }

    /* renamed from: d */
    private void m21864d() {
        this.f16795a = (ProgressBar) this.f16799e.findViewById(R$id.block_waiting);
        this.f16796b = (ImageView) this.f16799e.findViewById(R$id.block_complete);
        this.f16797c = (TextView) this.f16799e.findViewById(R$id.block_text);
        setCancelable(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m21865e(int i, String str) {
        ImageView imageView;
        int i2;
        if (TextUtils.isEmpty(str)) {
            this.f16797c.setVisibility(8);
        } else {
            this.f16797c.setVisibility(0);
        }
        if (i != 0) {
            if (i == 1) {
                this.f16795a.setVisibility(8);
                this.f16796b.setVisibility(0);
                imageView = this.f16796b;
                i2 = R$drawable.icon_yeelight_block_complete;
            } else if (i == 2) {
                this.f16795a.setVisibility(8);
                this.f16796b.setVisibility(0);
                imageView = this.f16796b;
                i2 = R$drawable.icon_yeelight_block_failed;
            } else {
                return;
            }
            imageView.setImageResource(i2);
            this.f16797c.setText(str);
            this.f16802h.removeMessages(0);
            this.f16802h.sendEmptyMessageDelayed(0, 1000);
            return;
        }
        this.f16795a.setVisibility(0);
        this.f16796b.setVisibility(8);
        this.f16797c.setText(str);
        this.f16802h.sendEmptyMessageDelayed(0, this.f16801g);
    }
}
