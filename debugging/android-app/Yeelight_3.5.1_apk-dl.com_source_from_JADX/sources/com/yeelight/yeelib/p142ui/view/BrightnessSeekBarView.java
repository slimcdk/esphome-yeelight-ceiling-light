package com.yeelight.yeelib.p142ui.view;

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
import com.yeelight.yeelib.device.C6081a;
import com.yeelight.yeelib.device.C6164e;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.C6091a;
import com.yeelight.yeelib.device.base.C6092b;
import com.yeelight.yeelib.device.base.C6094f;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.C8327s;
import p051j4.C9201q;
import p237z3.C12142b;
import p237z3.C12145e;

/* renamed from: com.yeelight.yeelib.ui.view.BrightnessSeekBarView */
public class BrightnessSeekBarView extends LinearLayout implements C12145e, C12142b {

    /* renamed from: a */
    SeekBar f15573a;

    /* renamed from: b */
    TextView f15574b;

    /* renamed from: c */
    ImageView f15575c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C3012e f15576d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f15577e = true;

    /* renamed from: f */
    private boolean f15578f = false;

    /* renamed from: g */
    private int f15579g = -1;

    /* renamed from: h */
    private boolean f15580h = false;

    /* renamed from: i */
    private int f15581i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Handler f15582j = new C8773b();

    /* renamed from: k */
    C8782k f15583k;

    /* renamed from: com.yeelight.yeelib.ui.view.BrightnessSeekBarView$a */
    class C8772a implements Runnable {
        C8772a() {
        }

        public void run() {
            BrightnessSeekBarView.this.f15575c.setImageResource(R$drawable.icon_yeelight_control_view_brightness_day);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.BrightnessSeekBarView$b */
    class C8773b extends Handler {
        C8773b() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                boolean unused = BrightnessSeekBarView.this.f15577e = true;
            } else if (i == 1) {
                BrightnessSeekBarView.this.m20687f(message.arg1);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.BrightnessSeekBarView$c */
    class C8774c implements SeekBar.OnSeekBarChangeListener {
        C8774c() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                Message obtain = Message.obtain(BrightnessSeekBarView.this.f15582j, 1);
                obtain.arg1 = seekBar.getProgress();
                BrightnessSeekBarView.this.f15582j.removeMessages(1);
                BrightnessSeekBarView.this.f15582j.sendMessageDelayed(obtain, 500);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            BrightnessSeekBarView brightnessSeekBarView;
            boolean z;
            if (BrightnessSeekBarView.this.f15576d == null || (!(BrightnessSeekBarView.this.f15576d instanceof C6081a) && !(BrightnessSeekBarView.this.f15576d instanceof C6164e))) {
                brightnessSeekBarView = BrightnessSeekBarView.this;
                z = false;
            } else {
                brightnessSeekBarView = BrightnessSeekBarView.this;
                z = true;
            }
            boolean unused = brightnessSeekBarView.f15577e = z;
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            BrightnessSeekBarView.this.f15582j.sendEmptyMessageDelayed(0, 5000);
            Message obtain = Message.obtain(BrightnessSeekBarView.this.f15582j, 1);
            obtain.arg1 = seekBar.getProgress();
            BrightnessSeekBarView.this.f15582j.removeMessages(1);
            BrightnessSeekBarView.this.f15582j.sendMessageDelayed(obtain, 500);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.BrightnessSeekBarView$d */
    class C8775d implements Runnable {
        C8775d() {
        }

        public void run() {
            BrightnessSeekBarView.this.f15575c.setImageResource(R$drawable.icon_yeelight_control_view_brightness_moon);
            BrightnessSeekBarView.this.setSeekBarColor(-9856305);
            BrightnessSeekBarView brightnessSeekBarView = BrightnessSeekBarView.this;
            brightnessSeekBarView.mo36112k(brightnessSeekBarView.f15576d.mo23221d0().mo31536F());
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.BrightnessSeekBarView$e */
    class C8776e implements Runnable {
        C8776e() {
        }

        public void run() {
            BrightnessSeekBarView.this.f15575c.setImageResource(R$drawable.icon_yeelight_control_view_brightness_day);
            BrightnessSeekBarView brightnessSeekBarView = BrightnessSeekBarView.this;
            brightnessSeekBarView.mo36112k(brightnessSeekBarView.f15576d.mo23221d0().mo31601m());
            BrightnessSeekBarView.this.setSeekBarColor(-147128);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.BrightnessSeekBarView$f */
    class C8777f implements Runnable {
        C8777f() {
        }

        public void run() {
            BrightnessSeekBarView.this.f15573a.setProgress(100);
            BrightnessSeekBarView.this.f15574b.setText(String.valueOf(100));
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.BrightnessSeekBarView$g */
    class C8778g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f15590a;

        C8778g(int i) {
            this.f15590a = i;
        }

        public void run() {
            if (BrightnessSeekBarView.this.f15576d instanceof C6094f) {
                int e = C9201q.m22193e(this.f15590a);
                BrightnessSeekBarView.this.f15573a.setProgress(e);
                BrightnessSeekBarView.this.f15574b.setText(String.valueOf(e));
                return;
            }
            BrightnessSeekBarView.this.f15573a.setProgress(this.f15590a);
            BrightnessSeekBarView.this.f15574b.setText(String.valueOf(this.f15590a));
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.BrightnessSeekBarView$h */
    class C8779h implements Runnable {
        C8779h() {
        }

        public void run() {
            BrightnessSeekBarView.this.f15575c.setImageResource(R$drawable.icon_yeelight_control_view_brightness_moon);
            BrightnessSeekBarView brightnessSeekBarView = BrightnessSeekBarView.this;
            brightnessSeekBarView.mo36112k(brightnessSeekBarView.f15576d.mo23221d0().mo31536F());
            BrightnessSeekBarView.this.setSeekBarColor(-9856305);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.BrightnessSeekBarView$i */
    class C8780i implements Runnable {
        C8780i() {
        }

        public void run() {
            BrightnessSeekBarView.this.f15575c.setImageResource(R$drawable.icon_yeelight_control_view_brightness_day);
            BrightnessSeekBarView brightnessSeekBarView = BrightnessSeekBarView.this;
            brightnessSeekBarView.mo36112k(brightnessSeekBarView.f15576d.mo23221d0().mo31601m());
            BrightnessSeekBarView.this.setSeekBarColor(-147128);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.BrightnessSeekBarView$j */
    class C8781j implements Runnable {
        C8781j() {
        }

        public void run() {
            BrightnessSeekBarView.this.f15575c.setImageResource(R$drawable.icon_yeelight_control_view_brightness_moon);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.BrightnessSeekBarView$k */
    public interface C8782k {
        /* renamed from: a */
        void mo36130a(int i);
    }

    static {
        Class<BrightnessSeekBarView> cls = BrightnessSeekBarView.class;
    }

    public BrightnessSeekBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo36106e(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m20687f(int i) {
        int i2 = i < 1 ? 1 : i;
        this.f15574b.setText(String.valueOf(i2));
        if (this.f15580h) {
            this.f15581i = i2;
            this.f15583k.mo36130a(i2);
        } else if (this.f15578f) {
            this.f15583k.mo36130a(i2);
        } else if (this.f15579g == 2) {
            ((C6091a) this.f15576d).mo31661o2(new C8327s(1, i2, 0, 0, ""));
        } else {
            C3012e eVar = this.f15576d;
            if (eVar instanceof C6094f) {
                this.f15576d.mo23154p1((long) C9201q.m22194f(i2));
            } else {
                eVar.mo23168x1(new C8327s(1, i2, 0, 0, ""));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo36106e(Context context) {
        LayoutInflater.from(context).inflate(R$layout.widget_adjust_bright_view, this, true);
        this.f15573a = (SeekBar) findViewById(R$id.bright_seek_bar);
        this.f15574b = (TextView) findViewById(R$id.bright_seek_value);
        this.f15575c = (ImageView) findViewById(R$id.brightness_bar_img);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f15573a.setSplitTrack(false);
        }
        this.f15573a.setOnSeekBarChangeListener(new C8774c());
    }

    /* renamed from: g */
    public void mo36107g(C8782k kVar) {
        this.f15583k = kVar;
    }

    public int getBright() {
        return this.f15581i;
    }

    /* renamed from: h */
    public void mo36109h() {
        this.f15580h = true;
    }

    /* renamed from: i */
    public void mo36110i() {
        C3012e eVar = this.f15576d;
        if (eVar != null) {
            eVar.mo23213W0(this);
            C3012e eVar2 = this.f15576d;
            if (eVar2 instanceof C6091a) {
                ((C6091a) eVar2).mo31657k2().mo31680s(this);
            }
        }
    }

    /* renamed from: j */
    public void mo36111j(boolean z) {
        ImageView imageView;
        Runnable runnable;
        if (z) {
            imageView = this.f15575c;
            runnable = new C8781j();
        } else {
            imageView = this.f15575c;
            runnable = new C8772a();
        }
        imageView.post(runnable);
    }

    /* renamed from: k */
    public void mo36112k(int i) {
        mo36113l(i, false);
    }

    /* renamed from: l */
    public void mo36113l(int i, boolean z) {
        this.f15581i = i;
        if (!this.f15577e && !z) {
            return;
        }
        if (!this.f15576d.mo23145k0()) {
            this.f15573a.post(new C8777f());
        } else {
            this.f15573a.post(new C8778g(i));
        }
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        Runnable runnable;
        ImageView imageView;
        int i2;
        if (i == 4) {
            if (this.f15576d.mo23221d0().mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT) {
                imageView = this.f15575c;
                runnable = new C8779h();
            } else {
                imageView = this.f15575c;
                runnable = new C8780i();
            }
            imageView.post(runnable);
        } else if (i == 8) {
            if (this.f15576d.mo23221d0().mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT) {
                i2 = this.f15576d.mo23221d0().mo31536F();
            } else if (this.f15579g != 2) {
                i2 = this.f15576d.mo23221d0().mo31601m();
            } else {
                return;
            }
            mo36112k(i2);
        }
    }

    /* renamed from: p */
    public void mo30241p(int i, C6092b bVar) {
        if (i == 8 && this.f15579g == 2) {
            mo36112k(((C6091a) this.f15576d).mo31657k2().mo31662a());
        }
    }

    public void setDeviceId(String str) {
        ImageView imageView;
        Runnable runnable;
        C3012e r0 = YeelightDeviceManager.m7804r0(str);
        this.f15576d = r0;
        if (r0 != null) {
            if (this.f15579g != 2) {
                if (r0.mo23221d0().mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT) {
                    imageView = this.f15575c;
                    runnable = new C8775d();
                } else {
                    imageView = this.f15575c;
                    runnable = new C8776e();
                }
                imageView.post(runnable);
            }
            this.f15576d.mo23178B0(this);
            C3012e eVar = this.f15576d;
            if (eVar instanceof C6091a) {
                ((C6091a) eVar).mo31657k2().mo31670i(this);
            }
        }
    }

    public void setEosProLampMode(int i) {
        int i2;
        this.f15579g = i;
        if (i == 2) {
            mo36113l(((C6091a) this.f15576d).mo31657k2().mo31662a(), true);
            this.f15575c.setImageResource(R$drawable.icon_yeelight_control_view_brightness_day);
            return;
        }
        if (this.f15576d.mo23221d0().mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT) {
            this.f15575c.setImageResource(R$drawable.icon_yeelight_control_view_brightness_moon);
            i2 = this.f15576d.mo23221d0().mo31536F();
        } else {
            this.f15575c.setImageResource(R$drawable.icon_yeelight_control_view_brightness_day);
            i2 = this.f15576d.mo23221d0().mo31601m();
        }
        mo36113l(i2, true);
    }

    public void setSeekBarColor(int i) {
        ((LayerDrawable) this.f15573a.getProgressDrawable()).getDrawable(1).setColorFilter(i, PorterDuff.Mode.SRC);
        this.f15573a.invalidate();
    }

    public void setTabChecked(int i) {
        this.f15578f = i == 4;
    }
}
