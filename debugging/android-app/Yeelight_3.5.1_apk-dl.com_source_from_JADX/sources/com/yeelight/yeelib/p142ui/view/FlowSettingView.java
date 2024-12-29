package com.yeelight.yeelib.p142ui.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.core.view.ViewCompat;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.C8308a;
import com.yeelight.yeelib.models.C8309b;
import com.yeelight.yeelib.models.C8319k;
import com.yeelight.yeelib.p142ui.view.FlowSpeedSeekBarView;
import java.util.ArrayList;
import java.util.List;
import p051j4.C9193k;
import p223w3.C11627r;
import p232y3.C12043g;

/* renamed from: com.yeelight.yeelib.ui.view.FlowSettingView */
public class FlowSettingView extends LinearLayout implements View.OnClickListener, FlowSpeedSeekBarView.C8807b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C3010c f15753a;

    /* renamed from: b */
    private Context f15754b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public float[] f15755c = {1.0f, 1.0f, 1.0f};

    /* renamed from: d */
    private List<C12043g.C12044a> f15756d = new ArrayList();

    /* renamed from: e */
    private C8308a f15757e;

    /* renamed from: f */
    private int f15758f;

    /* renamed from: g */
    private boolean f15759g = false;

    /* renamed from: h */
    FlowCircleView f15760h;

    /* renamed from: i */
    FlowCircleView f15761i;

    /* renamed from: j */
    FlowCircleView f15762j;

    /* renamed from: k */
    FlowCircleView f15763k;

    /* renamed from: l */
    SeekBar f15764l;

    /* renamed from: m */
    ImageView f15765m;

    /* renamed from: n */
    FlowSpeedSeekBarView f15766n;

    /* renamed from: com.yeelight.yeelib.ui.view.FlowSettingView$a */
    class C8804a implements SeekBar.OnSeekBarChangeListener {
        C8804a() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                if (i < 1) {
                    i = 1;
                }
                FlowSettingView.this.f15755c[0] = FlowSettingView.this.m20799n(i);
                FlowSettingView.this.f15755c[1] = 1.0f;
                FlowSettingView.this.f15755c[2] = 1.0f;
                int HSVToColor = Color.HSVToColor(FlowSettingView.this.f15755c);
                if (FlowSettingView.this.f15753a instanceof C11627r) {
                    FlowSettingView.this.mo36265q(HSVToColor);
                } else {
                    FlowSettingView.this.mo36266r(HSVToColor);
                }
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            FlowSettingView.this.m20800p();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.FlowSettingView$b */
    class C8805b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f15768a;

        C8805b(int i) {
            this.f15768a = i;
        }

        public void run() {
            FlowSettingView flowSettingView = FlowSettingView.this;
            flowSettingView.f15764l.setProgress(flowSettingView.m20796h(this.f15768a));
        }
    }

    static {
        Class<FlowSettingView> cls = FlowSettingView.class;
    }

    public FlowSettingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R$layout.flow_settings_layout, this);
        this.f15760h = (FlowCircleView) findViewById(R$id.flow_circle_color_1);
        this.f15761i = (FlowCircleView) findViewById(R$id.flow_circle_color_2);
        this.f15762j = (FlowCircleView) findViewById(R$id.flow_circle_color_3);
        this.f15763k = (FlowCircleView) findViewById(R$id.flow_circle_color_4);
        this.f15764l = (SeekBar) findViewById(R$id.color_seek_bar);
        this.f15765m = (ImageView) findViewById(R$id.arrow_indicator);
        this.f15766n = (FlowSpeedSeekBarView) findViewById(R$id.flow_speed_bar);
        this.f15754b = context;
        m20790b();
    }

    /* renamed from: b */
    private void m20790b() {
        this.f15766n.mo36274e(this);
        this.f15764l.setMax(500);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f15764l.setSplitTrack(false);
        }
        this.f15764l.setThumbOffset(C9193k.m22151b(this.f15754b, 10.0f));
        this.f15764l.setProgressDrawable(getResources().getDrawable(R$drawable.color_picker_corner));
        this.f15764l.setOnSeekBarChangeListener(new C8804a());
        this.f15760h.setOnClickListener(this);
        this.f15761i.setOnClickListener(this);
        this.f15762j.setOnClickListener(this);
        this.f15763k.setOnClickListener(this);
        this.f15760h.setSelected(true);
        setArrowLayout(0);
    }

    private int[] getColorArray() {
        int[] iArr = new int[this.f15756d.size()];
        for (int i = 0; i < this.f15756d.size(); i++) {
            iArr[i] = this.f15756d.get(i).mo42713a();
        }
        return iArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public int m20796h(int i) {
        Color.colorToHSV(i, this.f15755c);
        return (int) ((this.f15755c[0] * 500.0f) / 360.0f);
    }

    /* renamed from: i */
    private void m20797i() {
        this.f15760h.setColor(this.f15756d.get(0).mo42713a());
        this.f15761i.setColor(this.f15756d.get(1).mo42713a());
        this.f15762j.setColor(this.f15756d.get(2).mo42713a());
        this.f15763k.setColor(this.f15756d.get(3).mo42713a());
        mo36259j(this.f15756d.get(0).mo42713a());
        this.f15766n.mo36272c(this.f15756d.get(0).mo42714b() / 1000);
    }

    /* renamed from: k */
    private void m20798k() {
        this.f15760h.setColor(this.f15757e.mo35338h().get(0).mo35377e());
        this.f15761i.setColor(this.f15757e.mo35338h().get(1).mo35377e());
        this.f15762j.setColor(this.f15757e.mo35338h().get(2).mo35377e());
        this.f15763k.setColor(this.f15757e.mo35338h().get(3).mo35377e());
        mo36259j(this.f15757e.mo35338h().get(0).mo35377e());
        this.f15766n.mo36272c(this.f15757e.mo35338h().get(0).mo35375c() / 1000);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public float m20799n(int i) {
        if (i == 500) {
            i = 498;
        }
        return (((float) i) * 360.0f) / 500.0f;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m20800p() {
        if (!this.f15759g) {
            C3010c cVar = this.f15753a;
            if (cVar instanceof C11627r) {
                DeviceStatusBase.DeviceMode z = cVar.mo23221d0().mo31627z();
                DeviceStatusBase.DeviceMode deviceMode = DeviceStatusBase.DeviceMode.DEVICE_MODE_FLOW;
                if (z == deviceMode) {
                    ((C11627r) this.f15753a).mo23157r1(this.f15756d.get(0).mo42714b(), getColorArray(), this.f15758f);
                    ((C11627r) this.f15753a).mo23154p1((long) this.f15758f);
                    return;
                }
                DeviceStatusBase.DeviceMode z2 = this.f15753a.mo23221d0().mo31627z();
                ((C11627r) this.f15753a).mo23165w1(deviceMode);
                ((C11627r) this.f15753a).mo23152o1(z2);
                return;
            }
            ((C3012e) cVar).mo23168x1(getFlowScene());
        }
    }

    private void setArrowLayout(int i) {
        Point d = C9193k.m22153d(getContext());
        int b = C9193k.m22151b(getContext(), 12.0f);
        int b2 = C9193k.m22151b(getContext(), 6.0f);
        int b3 = (d.x - (C9193k.m22151b(getContext(), 14.0f) * 2)) / 4;
        int b4 = ((i * b3) + ((b3 - b) / 2)) - C9193k.m22151b(getContext(), 6.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b, b2);
        layoutParams.setMargins(b4, 0, 0, 0);
        this.f15765m.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public void mo36257a(int i) {
        if (this.f15753a instanceof C11627r) {
            for (C12043g.C12044a d : this.f15756d) {
                d.mo42716d(i * 1000);
            }
            this.f15753a.mo23221d0().mo31604n0(this.f15756d);
        } else {
            for (C8319k g : this.f15757e.mo35338h()) {
                g.mo35379g(i * 1000);
            }
            if (!this.f15759g) {
                this.f15753a.mo23221d0().mo31619v().mo42705s(this.f15757e);
            }
        }
        m20800p();
    }

    public C8309b getFlowScene() {
        C8309b bVar = new C8309b("", -1, 5);
        C8308a aVar = new C8308a();
        for (C8319k next : this.f15757e.mo35338h()) {
            aVar.mo35338h().add(new C8319k(next.mo35375c(), next.mo35376d(), next.mo35377e() & ViewCompat.MEASURED_SIZE_MASK, this.f15758f));
        }
        aVar.mo35341k(this.f15757e.mo35336f());
        aVar.mo35342l(this.f15757e.mo35339i());
        bVar.mo35425J(aVar);
        return bVar;
    }

    /* renamed from: j */
    public void mo36259j(int i) {
        this.f15764l.post(new C8805b(i));
    }

    /* renamed from: l */
    public void mo36260l(int i) {
        this.f15758f = i;
        m20800p();
    }

    /* renamed from: m */
    public void mo36261m(int i) {
        this.f15758f = i;
        m20800p();
    }

    /* renamed from: o */
    public void mo36262o() {
        this.f15759g = true;
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R$id.flow_circle_color_1) {
            this.f15760h.setSelected(true);
            this.f15761i.setSelected(false);
            this.f15762j.setSelected(false);
            this.f15763k.setSelected(false);
            if (this.f15753a instanceof C11627r) {
                mo36265q(this.f15756d.get(0).mo42713a());
            } else {
                mo36266r(this.f15757e.mo35338h().get(0).mo35377e());
            }
            setArrowLayout(0);
        }
        if (id == R$id.flow_circle_color_2) {
            this.f15760h.setSelected(false);
            this.f15761i.setSelected(true);
            this.f15762j.setSelected(false);
            this.f15763k.setSelected(false);
            if (this.f15753a instanceof C11627r) {
                mo36265q(this.f15756d.get(1).mo42713a());
            } else {
                mo36266r(this.f15757e.mo35338h().get(1).mo35377e());
            }
            setArrowLayout(1);
        }
        if (id == R$id.flow_circle_color_3) {
            this.f15760h.setSelected(false);
            this.f15761i.setSelected(false);
            this.f15762j.setSelected(true);
            this.f15763k.setSelected(false);
            if (this.f15753a instanceof C11627r) {
                mo36265q(this.f15756d.get(2).mo42713a());
            } else {
                mo36266r(this.f15757e.mo35338h().get(2).mo35377e());
            }
            setArrowLayout(2);
        }
        if (id == R$id.flow_circle_color_4) {
            this.f15760h.setSelected(false);
            this.f15761i.setSelected(false);
            this.f15762j.setSelected(false);
            this.f15763k.setSelected(true);
            if (this.f15753a instanceof C11627r) {
                mo36265q(this.f15756d.get(3).mo42713a());
            } else {
                mo36266r(this.f15757e.mo35338h().get(3).mo35377e());
            }
            setArrowLayout(3);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        DeviceStatusBase.DeviceMode deviceMode;
        super.onDetachedFromWindow();
        this.f15766n.mo36275f();
        C3010c cVar = this.f15753a;
        if ((cVar instanceof C11627r) && cVar.mo23221d0().mo31627z() == (deviceMode = DeviceStatusBase.DeviceMode.DEVICE_MODE_FLOW)) {
            ((C11627r) this.f15753a).mo23152o1(deviceMode);
        }
    }

    /* renamed from: q */
    public void mo36265q(int i) {
        if (this.f15760h.mo36251a()) {
            this.f15760h.setColor(i);
            this.f15756d.get(0).mo42715c(i);
        }
        if (this.f15761i.mo36251a()) {
            this.f15761i.setColor(i);
            this.f15756d.get(1).mo42715c(i);
        }
        if (this.f15762j.mo36251a()) {
            this.f15762j.setColor(i);
            this.f15756d.get(2).mo42715c(i);
        }
        if (this.f15763k.mo36251a()) {
            this.f15763k.setColor(i);
            this.f15756d.get(3).mo42715c(i);
        }
        mo36259j(i);
        this.f15753a.mo23221d0().mo31604n0(this.f15756d);
    }

    /* renamed from: r */
    public void mo36266r(int i) {
        if (this.f15760h.mo36251a()) {
            this.f15760h.setColor(i);
            this.f15757e.mo35338h().get(0).mo35380h(i);
        }
        if (this.f15761i.mo36251a()) {
            this.f15761i.setColor(i);
            this.f15757e.mo35338h().get(1).mo35380h(i);
        }
        if (this.f15762j.mo36251a()) {
            this.f15762j.setColor(i);
            this.f15757e.mo35338h().get(2).mo35380h(i);
        }
        if (this.f15763k.mo36251a()) {
            this.f15763k.setColor(i);
            this.f15757e.mo35338h().get(3).mo35380h(i);
        }
        mo36259j(i);
        if (!this.f15759g) {
            this.f15753a.mo23221d0().mo31619v().mo42705s(this.f15757e);
        }
    }

    public void setDevice(String str) {
        this.f15756d.clear();
        C3012e r0 = YeelightDeviceManager.m7804r0(str);
        this.f15753a = r0;
        this.f15758f = r0.mo23221d0().mo31601m();
        C3010c cVar = this.f15753a;
        boolean z = cVar instanceof C11627r;
        C12043g v = cVar.mo23221d0().mo31619v();
        if (z) {
            for (C12043g.C12044a next : v.mo42689c()) {
                this.f15756d.add(new C12043g.C12044a(next.mo42713a(), next.mo42714b()));
            }
            int i = 0;
            while (this.f15756d.size() < 4) {
                List<C12043g.C12044a> list = this.f15756d;
                list.add(new C12043g.C12044a(list.get(i).mo42713a(), this.f15756d.get(i).mo42714b()));
                i++;
            }
            m20797i();
            return;
        }
        this.f15757e = v.mo42690d();
        m20798k();
    }
}
