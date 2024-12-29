package com.yeelight.yeelib.p194ui.view;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.p150c.C5972a;
import com.yeelight.yeelib.p150c.C6000f;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6017a;
import com.yeelight.yeelib.p150c.p151i.C6018b;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6039j;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.p186e.C9767b;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.utils.C10555s;

/* renamed from: com.yeelight.yeelib.ui.view.BrightnessSeekBarView */
public class BrightnessSeekBarView extends LinearLayout implements C9770e, C9767b {

    /* renamed from: a */
    SeekBar f19311a;

    /* renamed from: b */
    TextView f19312b;

    /* renamed from: c */
    ImageView f19313c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4200i f19314d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f19315e = true;

    /* renamed from: f */
    private boolean f19316f = false;

    /* renamed from: g */
    private int f19317g = -1;

    /* renamed from: h */
    private boolean f19318h = false;

    /* renamed from: i */
    private int f19319i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Handler f19320j = new C10394b();

    /* renamed from: k */
    C10403k f19321k;

    /* renamed from: com.yeelight.yeelib.ui.view.BrightnessSeekBarView$a */
    class C10393a implements Runnable {
        C10393a() {
        }

        public void run() {
            BrightnessSeekBarView.this.f19313c.setImageResource(R$drawable.icon_yeelight_control_view_brightness_day);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.BrightnessSeekBarView$b */
    class C10394b extends Handler {
        C10394b() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                boolean unused = BrightnessSeekBarView.this.f19315e = true;
            } else if (i == 1) {
                BrightnessSeekBarView.this.m25076f(message.arg1);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.BrightnessSeekBarView$c */
    class C10395c implements SeekBar.OnSeekBarChangeListener {
        C10395c() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                Message obtain = Message.obtain(BrightnessSeekBarView.this.f19320j, 1);
                obtain.arg1 = seekBar.getProgress();
                BrightnessSeekBarView.this.f19320j.removeMessages(1);
                BrightnessSeekBarView.this.f19320j.sendMessageDelayed(obtain, 500);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            BrightnessSeekBarView brightnessSeekBarView;
            boolean z;
            if (BrightnessSeekBarView.this.f19314d == null || (!(BrightnessSeekBarView.this.f19314d instanceof C5972a) && !(BrightnessSeekBarView.this.f19314d instanceof C6000f))) {
                brightnessSeekBarView = BrightnessSeekBarView.this;
                z = false;
            } else {
                brightnessSeekBarView = BrightnessSeekBarView.this;
                z = true;
            }
            boolean unused = brightnessSeekBarView.f19315e = z;
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            BrightnessSeekBarView.this.f19320j.sendEmptyMessageDelayed(0, 5000);
            Message obtain = Message.obtain(BrightnessSeekBarView.this.f19320j, 1);
            obtain.arg1 = seekBar.getProgress();
            BrightnessSeekBarView.this.f19320j.removeMessages(1);
            BrightnessSeekBarView.this.f19320j.sendMessageDelayed(obtain, 500);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.BrightnessSeekBarView$d */
    class C10396d implements Runnable {
        C10396d() {
        }

        public void run() {
            BrightnessSeekBarView.this.f19313c.setImageResource(R$drawable.icon_yeelight_control_view_brightness_moon);
            BrightnessSeekBarView.this.setSeekBarColor(-9856305);
            BrightnessSeekBarView brightnessSeekBarView = BrightnessSeekBarView.this;
            brightnessSeekBarView.mo32742k(brightnessSeekBarView.f19314d.mo23408d0().mo27635E());
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.BrightnessSeekBarView$e */
    class C10397e implements Runnable {
        C10397e() {
        }

        public void run() {
            BrightnessSeekBarView.this.f19313c.setImageResource(R$drawable.icon_yeelight_control_view_brightness_day);
            BrightnessSeekBarView brightnessSeekBarView = BrightnessSeekBarView.this;
            brightnessSeekBarView.mo32742k(brightnessSeekBarView.f19314d.mo23408d0().mo27700m());
            BrightnessSeekBarView.this.setSeekBarColor(-147128);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.BrightnessSeekBarView$f */
    class C10398f implements Runnable {
        C10398f() {
        }

        public void run() {
            BrightnessSeekBarView.this.f19311a.setProgress(100);
            BrightnessSeekBarView.this.f19312b.setText(String.valueOf(100));
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.BrightnessSeekBarView$g */
    class C10399g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f19328a;

        C10399g(int i) {
            this.f19328a = i;
        }

        public void run() {
            if (BrightnessSeekBarView.this.f19314d instanceof C6039j) {
                int e = C10555s.m25794e(this.f19328a);
                BrightnessSeekBarView.this.f19311a.setProgress(e);
                BrightnessSeekBarView.this.f19312b.setText(String.valueOf(e));
                return;
            }
            BrightnessSeekBarView.this.f19311a.setProgress(this.f19328a);
            BrightnessSeekBarView.this.f19312b.setText(String.valueOf(this.f19328a));
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.BrightnessSeekBarView$h */
    class C10400h implements Runnable {
        C10400h() {
        }

        public void run() {
            BrightnessSeekBarView.this.f19313c.setImageResource(R$drawable.icon_yeelight_control_view_brightness_moon);
            BrightnessSeekBarView brightnessSeekBarView = BrightnessSeekBarView.this;
            brightnessSeekBarView.mo32742k(brightnessSeekBarView.f19314d.mo23408d0().mo27635E());
            BrightnessSeekBarView.this.setSeekBarColor(-9856305);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.BrightnessSeekBarView$i */
    class C10401i implements Runnable {
        C10401i() {
        }

        public void run() {
            BrightnessSeekBarView.this.f19313c.setImageResource(R$drawable.icon_yeelight_control_view_brightness_day);
            BrightnessSeekBarView brightnessSeekBarView = BrightnessSeekBarView.this;
            brightnessSeekBarView.mo32742k(brightnessSeekBarView.f19314d.mo23408d0().mo27700m());
            BrightnessSeekBarView.this.setSeekBarColor(-147128);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.BrightnessSeekBarView$j */
    class C10402j implements Runnable {
        C10402j() {
        }

        public void run() {
            BrightnessSeekBarView.this.f19313c.setImageResource(R$drawable.icon_yeelight_control_view_brightness_moon);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.BrightnessSeekBarView$k */
    public interface C10403k {
        /* renamed from: a */
        void mo32760a(int i);
    }

    static {
        Class<BrightnessSeekBarView> cls = BrightnessSeekBarView.class;
    }

    public BrightnessSeekBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo32736e(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m25076f(int i) {
        int i2 = i < 1 ? 1 : i;
        this.f19312b.setText(String.valueOf(i2));
        if (this.f19318h) {
            this.f19319i = i2;
            this.f19321k.mo32760a(i2);
        } else if (this.f19316f) {
            this.f19321k.mo32760a(i2);
        } else if (this.f19317g == 2) {
            ((C6017a) this.f19314d).mo27595o2(new C9856y(1, i2, 0, 0, ""));
        } else {
            C4200i iVar = this.f19314d;
            if (iVar instanceof C6039j) {
                this.f19314d.mo23340p1((long) C10555s.m25795f(i2));
            } else {
                iVar.mo23355x1(new C9856y(1, i2, 0, 0, ""));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo32736e(Context context) {
        LayoutInflater.from(context).inflate(R$layout.widget_adjust_bright_view, this, true);
        this.f19311a = (SeekBar) findViewById(R$id.bright_seek_bar);
        this.f19312b = (TextView) findViewById(R$id.bright_seek_value);
        this.f19313c = (ImageView) findViewById(R$id.brightness_bar_img);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f19311a.setSplitTrack(false);
        }
        this.f19311a.setOnSeekBarChangeListener(new C10395c());
    }

    /* renamed from: g */
    public void mo32737g(C10403k kVar) {
        this.f19321k = kVar;
    }

    public int getBright() {
        return this.f19319i;
    }

    /* renamed from: h */
    public void mo32739h() {
        this.f19318h = true;
    }

    /* renamed from: i */
    public void mo32740i() {
        C4200i iVar = this.f19314d;
        if (iVar != null) {
            iVar.mo23400W0(this);
            C4200i iVar2 = this.f19314d;
            if (iVar2 instanceof C6017a) {
                ((C6017a) iVar2).mo27591k2().mo27614s(this);
            }
        }
    }

    /* renamed from: j */
    public void mo32741j(boolean z) {
        ImageView imageView;
        Runnable runnable;
        if (z) {
            imageView = this.f19313c;
            runnable = new C10402j();
        } else {
            imageView = this.f19313c;
            runnable = new C10393a();
        }
        imageView.post(runnable);
    }

    /* renamed from: k */
    public void mo32742k(int i) {
        mo32743l(i, false);
    }

    /* renamed from: l */
    public void mo32743l(int i, boolean z) {
        this.f19319i = i;
        if (!this.f19315e && !z) {
            return;
        }
        if (!this.f19314d.mo23331k0()) {
            this.f19311a.post(new C10398f());
        } else {
            this.f19311a.post(new C10399g(i));
        }
    }

    public void onStatusChange(int i, C6024e eVar) {
        Runnable runnable;
        ImageView imageView;
        int i2;
        if (i == 4) {
            if (this.f19314d.mo23408d0().mo27726z() == C6024e.C6028d.DEVICE_MODE_NIGHT_LIGHT) {
                imageView = this.f19313c;
                runnable = new C10400h();
            } else {
                imageView = this.f19313c;
                runnable = new C10401i();
            }
            imageView.post(runnable);
        } else if (i == 8) {
            if (this.f19314d.mo23408d0().mo27726z() == C6024e.C6028d.DEVICE_MODE_NIGHT_LIGHT) {
                i2 = this.f19314d.mo23408d0().mo27635E();
            } else if (this.f19317g != 2) {
                i2 = this.f19314d.mo23408d0().mo27700m();
            } else {
                return;
            }
            mo32742k(i2);
        }
    }

    /* renamed from: p */
    public void mo26189p(int i, C6018b bVar) {
        if (i == 8 && this.f19317g == 2) {
            mo32742k(((C6017a) this.f19314d).mo27591k2().mo27596a());
        }
    }

    public void setDeviceId(String str) {
        ImageView imageView;
        Runnable runnable;
        C4200i o0 = C4257w.m11953o0(str);
        this.f19314d = o0;
        if (o0 != null) {
            if (this.f19317g != 2) {
                if (o0.mo23408d0().mo27726z() == C6024e.C6028d.DEVICE_MODE_NIGHT_LIGHT) {
                    imageView = this.f19313c;
                    runnable = new C10396d();
                } else {
                    imageView = this.f19313c;
                    runnable = new C10397e();
                }
                imageView.post(runnable);
            }
            this.f19314d.mo23365B0(this);
            C4200i iVar = this.f19314d;
            if (iVar instanceof C6017a) {
                ((C6017a) iVar).mo27591k2().mo27604i(this);
            }
        }
    }

    public void setEosProLampMode(int i) {
        int i2;
        this.f19317g = i;
        if (i == 2) {
            mo32743l(((C6017a) this.f19314d).mo27591k2().mo27596a(), true);
            this.f19313c.setImageResource(R$drawable.icon_yeelight_control_view_brightness_day);
            return;
        }
        if (this.f19314d.mo23408d0().mo27726z() == C6024e.C6028d.DEVICE_MODE_NIGHT_LIGHT) {
            this.f19313c.setImageResource(R$drawable.icon_yeelight_control_view_brightness_moon);
            i2 = this.f19314d.mo23408d0().mo27635E();
        } else {
            this.f19313c.setImageResource(R$drawable.icon_yeelight_control_view_brightness_day);
            i2 = this.f19314d.mo23408d0().mo27700m();
        }
        mo32743l(i2, true);
    }

    public void setSeekBarColor(int i) {
        ((LayerDrawable) this.f19311a.getProgressDrawable()).getDrawable(1).setColorFilter(i, PorterDuff.Mode.SRC);
        this.f19311a.invalidate();
    }

    public void setTabChecked(int i) {
        this.f19316f = i == 4;
    }
}
