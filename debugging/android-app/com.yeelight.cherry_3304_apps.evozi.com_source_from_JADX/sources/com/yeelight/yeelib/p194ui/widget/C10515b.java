package com.yeelight.yeelib.p194ui.widget;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
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
import com.yeelight.yeelib.utils.C10547m;

/* renamed from: com.yeelight.yeelib.ui.widget.b */
public class C10515b extends Dialog {

    /* renamed from: a */
    private ProgressBar f20071a;

    /* renamed from: b */
    private ImageView f20072b;

    /* renamed from: c */
    private TextView f20073c;

    /* renamed from: d */
    private LayoutInflater f20074d;

    /* renamed from: e */
    private View f20075e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Activity f20076f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public long f20077g = 10000;

    /* renamed from: h */
    private Handler f20078h = new Handler(new C10516a());

    /* renamed from: com.yeelight.yeelib.ui.widget.b$a */
    class C10516a implements Handler.Callback {
        C10516a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0 || C10515b.this.f20076f == null || C10515b.this.f20076f.isFinishing() || !C10515b.this.isShowing() || C10515b.this.getWindow() == null) {
                return false;
            }
            C10515b.this.dismiss();
            return false;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.widget.b$b */
    public static class C10517b {

        /* renamed from: a */
        private C10515b f20080a;

        public C10517b(Activity activity) {
            this.f20080a = new C10515b(activity);
        }

        /* renamed from: a */
        public C10515b mo33280a() {
            return this.f20080a;
        }

        /* renamed from: b */
        public C10517b mo33281b(int i, String str) {
            this.f20080a.m25598e(i, str);
            return this;
        }

        /* renamed from: c */
        public C10517b mo33282c(long j) {
            long unused = this.f20080a.f20077g = j;
            return this;
        }

        /* renamed from: d */
        public C10517b mo33283d() {
            this.f20080a.show();
            return this;
        }
    }

    protected C10515b(Activity activity) {
        super(activity, R$style.block_dialog_style);
        this.f20076f = activity;
        LayoutInflater from = LayoutInflater.from(activity);
        this.f20074d = from;
        this.f20075e = from.inflate(R$layout.common_blocking_dialog, (ViewGroup) null, false);
        int c = C10547m.m25753c(getContext(), 109.0f);
        if (getWindow() != null) {
            getWindow().requestFeature(1);
        }
        setContentView(this.f20075e);
        getWindow().setLayout(c, c);
        getWindow().getDecorView().setBackground((Drawable) null);
        m25597d();
    }

    /* renamed from: d */
    private void m25597d() {
        this.f20071a = (ProgressBar) this.f20075e.findViewById(R$id.block_waiting);
        this.f20072b = (ImageView) this.f20075e.findViewById(R$id.block_complete);
        this.f20073c = (TextView) this.f20075e.findViewById(R$id.block_text);
        setCancelable(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m25598e(int i, String str) {
        ImageView imageView;
        int i2;
        if (i != 0) {
            if (i == 1) {
                this.f20071a.setVisibility(8);
                this.f20072b.setVisibility(0);
                imageView = this.f20072b;
                i2 = R$drawable.icon_yeelight_block_complete;
            } else if (i == 2) {
                this.f20071a.setVisibility(8);
                this.f20072b.setVisibility(0);
                imageView = this.f20072b;
                i2 = R$drawable.icon_yeelight_block_failed;
            } else {
                return;
            }
            imageView.setImageResource(i2);
            this.f20073c.setText(str);
            this.f20078h.removeMessages(0);
            this.f20078h.sendEmptyMessageDelayed(0, 1000);
            return;
        }
        this.f20071a.setVisibility(0);
        this.f20072b.setVisibility(8);
        this.f20073c.setText(str);
        this.f20078h.sendEmptyMessageDelayed(0, this.f20077g);
    }
}
