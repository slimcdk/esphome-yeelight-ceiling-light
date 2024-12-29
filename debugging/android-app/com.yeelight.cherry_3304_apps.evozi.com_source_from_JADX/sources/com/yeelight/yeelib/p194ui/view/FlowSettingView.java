package com.yeelight.yeelib.p194ui.view;

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
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p183m.C7186q;
import com.yeelight.yeelib.p150c.p184n.C7556g;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p153g.C9827a;
import com.yeelight.yeelib.p153g.C9830b;
import com.yeelight.yeelib.p153g.C9844m;
import com.yeelight.yeelib.p194ui.view.FlowSpeedSeekBarView;
import com.yeelight.yeelib.utils.C10547m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.yeelib.ui.view.FlowSettingView */
public class FlowSettingView extends LinearLayout implements View.OnClickListener, FlowSpeedSeekBarView.C10428b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C4198d f19491a;

    /* renamed from: b */
    private Context f19492b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public float[] f19493c = {1.0f, 1.0f, 1.0f};

    /* renamed from: d */
    private List<C7556g.C7557a> f19494d = new ArrayList();

    /* renamed from: e */
    private C9827a f19495e;

    /* renamed from: f */
    private int f19496f;

    /* renamed from: g */
    private boolean f19497g = false;

    /* renamed from: h */
    FlowCircleView f19498h;

    /* renamed from: i */
    FlowCircleView f19499i;

    /* renamed from: j */
    FlowCircleView f19500j;

    /* renamed from: k */
    FlowCircleView f19501k;

    /* renamed from: l */
    SeekBar f19502l;

    /* renamed from: m */
    ImageView f19503m;

    /* renamed from: n */
    FlowSpeedSeekBarView f19504n;

    /* renamed from: com.yeelight.yeelib.ui.view.FlowSettingView$a */
    class C10425a implements SeekBar.OnSeekBarChangeListener {
        C10425a() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                if (i < 1) {
                    i = 1;
                }
                FlowSettingView.this.f19493c[0] = FlowSettingView.this.m25188n(i);
                FlowSettingView.this.f19493c[1] = 1.0f;
                FlowSettingView.this.f19493c[2] = 1.0f;
                int HSVToColor = Color.HSVToColor(FlowSettingView.this.f19493c);
                if (FlowSettingView.this.f19491a instanceof C7186q) {
                    FlowSettingView.this.mo32895q(HSVToColor);
                } else {
                    FlowSettingView.this.mo32896r(HSVToColor);
                }
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            FlowSettingView.this.m25189p();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.FlowSettingView$b */
    class C10426b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f19506a;

        C10426b(int i) {
            this.f19506a = i;
        }

        public void run() {
            FlowSettingView flowSettingView = FlowSettingView.this;
            flowSettingView.f19502l.setProgress(flowSettingView.m25185h(this.f19506a));
        }
    }

    static {
        Class<FlowSettingView> cls = FlowSettingView.class;
    }

    public FlowSettingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R$layout.flow_settings_layout, this);
        this.f19498h = (FlowCircleView) findViewById(R$id.flow_circle_color_1);
        this.f19499i = (FlowCircleView) findViewById(R$id.flow_circle_color_2);
        this.f19500j = (FlowCircleView) findViewById(R$id.flow_circle_color_3);
        this.f19501k = (FlowCircleView) findViewById(R$id.flow_circle_color_4);
        this.f19502l = (SeekBar) findViewById(R$id.color_seek_bar);
        this.f19503m = (ImageView) findViewById(R$id.arrow_indicator);
        this.f19504n = (FlowSpeedSeekBarView) findViewById(R$id.flow_speed_bar);
        this.f19492b = context;
        m25179b();
    }

    /* renamed from: b */
    private void m25179b() {
        this.f19504n.mo32904e(this);
        this.f19502l.setMax(500);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f19502l.setSplitTrack(false);
        }
        this.f19502l.setThumbOffset(C10547m.m25752b(this.f19492b, 10.0f));
        this.f19502l.setProgressDrawable(getResources().getDrawable(R$drawable.color_picker_corner));
        this.f19502l.setOnSeekBarChangeListener(new C10425a());
        this.f19498h.setOnClickListener(this);
        this.f19499i.setOnClickListener(this);
        this.f19500j.setOnClickListener(this);
        this.f19501k.setOnClickListener(this);
        this.f19498h.setSelected(true);
        setArrowLayout(0);
    }

    private int[] getColorArray() {
        int[] iArr = new int[this.f19494d.size()];
        for (int i = 0; i < this.f19494d.size(); i++) {
            iArr[i] = this.f19494d.get(i).mo28914a();
        }
        return iArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public int m25185h(int i) {
        Color.colorToHSV(i, this.f19493c);
        return (int) ((this.f19493c[0] * 500.0f) / 360.0f);
    }

    /* renamed from: i */
    private void m25186i() {
        this.f19498h.setColor(this.f19494d.get(0).mo28914a());
        this.f19499i.setColor(this.f19494d.get(1).mo28914a());
        this.f19500j.setColor(this.f19494d.get(2).mo28914a());
        this.f19501k.setColor(this.f19494d.get(3).mo28914a());
        mo32889j(this.f19494d.get(0).mo28914a());
        this.f19504n.mo32902c(this.f19494d.get(0).mo28915b() / 1000);
    }

    /* renamed from: k */
    private void m25187k() {
        this.f19498h.setColor(this.f19495e.mo31723h().get(0).mo31790e());
        this.f19499i.setColor(this.f19495e.mo31723h().get(1).mo31790e());
        this.f19500j.setColor(this.f19495e.mo31723h().get(2).mo31790e());
        this.f19501k.setColor(this.f19495e.mo31723h().get(3).mo31790e());
        mo32889j(this.f19495e.mo31723h().get(0).mo31790e());
        this.f19504n.mo32902c(this.f19495e.mo31723h().get(0).mo31788c() / 1000);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public float m25188n(int i) {
        if (i == 500) {
            i = 498;
        }
        return (((float) i) * 360.0f) / 500.0f;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m25189p() {
        if (!this.f19497g) {
            C4198d dVar = this.f19491a;
            if (!(dVar instanceof C7186q)) {
                ((C4200i) dVar).mo23355x1(getFlowScene());
            } else if (dVar.mo23408d0().mo27726z() == C6024e.C6028d.DEVICE_MODE_FLOW) {
                ((C7186q) this.f19491a).mo23343r1(this.f19494d.get(0).mo28915b(), getColorArray(), this.f19496f);
                ((C7186q) this.f19491a).mo23340p1((long) this.f19496f);
            } else {
                C6024e.C6028d z = this.f19491a.mo23408d0().mo27726z();
                ((C7186q) this.f19491a).mo23352w1(C6024e.C6028d.DEVICE_MODE_FLOW);
                ((C7186q) this.f19491a).mo23338o1(z);
            }
        }
    }

    private void setArrowLayout(int i) {
        Point d = C10547m.m25754d(getContext());
        int b = C10547m.m25752b(getContext(), 12.0f);
        int b2 = C10547m.m25752b(getContext(), 6.0f);
        int b3 = (d.x - (C10547m.m25752b(getContext(), 14.0f) * 2)) / 4;
        int b4 = ((i * b3) + ((b3 - b) / 2)) - C10547m.m25752b(getContext(), 6.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b, b2);
        layoutParams.setMargins(b4, 0, 0, 0);
        this.f19503m.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public void mo32887a(int i) {
        if (this.f19491a instanceof C7186q) {
            for (C7556g.C7557a d : this.f19494d) {
                d.mo28917d(i * 1000);
            }
            this.f19491a.mo23408d0().mo27701m0(this.f19494d);
        } else {
            for (C9844m g : this.f19495e.mo31723h()) {
                g.mo31792g(i * 1000);
            }
            if (!this.f19497g) {
                this.f19491a.mo23408d0().mo27718v().mo28905r(this.f19495e);
            }
        }
        m25189p();
    }

    public C9830b getFlowScene() {
        C9830b bVar = new C9830b("", -1, 5);
        C9827a aVar = new C9827a();
        for (C9844m next : this.f19495e.mo31723h()) {
            aVar.mo31723h().add(new C9844m(next.mo31788c(), next.mo31789d(), next.mo31790e() & ViewCompat.MEASURED_SIZE_MASK, this.f19496f));
        }
        aVar.mo31726k(this.f19495e.mo31721f());
        aVar.mo31727l(this.f19495e.mo31724i());
        bVar.mo31860I(aVar);
        return bVar;
    }

    /* renamed from: j */
    public void mo32889j(int i) {
        this.f19502l.post(new C10426b(i));
    }

    /* renamed from: l */
    public void mo32890l(int i) {
        this.f19496f = i;
        m25189p();
    }

    /* renamed from: m */
    public void mo32891m(int i) {
        this.f19496f = i;
        m25189p();
    }

    /* renamed from: o */
    public void mo32892o() {
        this.f19497g = true;
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R$id.flow_circle_color_1) {
            this.f19498h.setSelected(true);
            this.f19499i.setSelected(false);
            this.f19500j.setSelected(false);
            this.f19501k.setSelected(false);
            if (this.f19491a instanceof C7186q) {
                mo32895q(this.f19494d.get(0).mo28914a());
            } else {
                mo32896r(this.f19495e.mo31723h().get(0).mo31790e());
            }
            setArrowLayout(0);
        }
        if (id == R$id.flow_circle_color_2) {
            this.f19498h.setSelected(false);
            this.f19499i.setSelected(true);
            this.f19500j.setSelected(false);
            this.f19501k.setSelected(false);
            if (this.f19491a instanceof C7186q) {
                mo32895q(this.f19494d.get(1).mo28914a());
            } else {
                mo32896r(this.f19495e.mo31723h().get(1).mo31790e());
            }
            setArrowLayout(1);
        }
        if (id == R$id.flow_circle_color_3) {
            this.f19498h.setSelected(false);
            this.f19499i.setSelected(false);
            this.f19500j.setSelected(true);
            this.f19501k.setSelected(false);
            if (this.f19491a instanceof C7186q) {
                mo32895q(this.f19494d.get(2).mo28914a());
            } else {
                mo32896r(this.f19495e.mo31723h().get(2).mo31790e());
            }
            setArrowLayout(2);
        }
        if (id == R$id.flow_circle_color_4) {
            this.f19498h.setSelected(false);
            this.f19499i.setSelected(false);
            this.f19500j.setSelected(false);
            this.f19501k.setSelected(true);
            if (this.f19491a instanceof C7186q) {
                mo32895q(this.f19494d.get(3).mo28914a());
            } else {
                mo32896r(this.f19495e.mo31723h().get(3).mo31790e());
            }
            setArrowLayout(3);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C6024e.C6028d dVar;
        super.onDetachedFromWindow();
        this.f19504n.mo32905f();
        C4198d dVar2 = this.f19491a;
        if ((dVar2 instanceof C7186q) && dVar2.mo23408d0().mo27726z() == (dVar = C6024e.C6028d.DEVICE_MODE_FLOW)) {
            ((C7186q) this.f19491a).mo23338o1(dVar);
        }
    }

    /* renamed from: q */
    public void mo32895q(int i) {
        if (this.f19498h.mo32881a()) {
            this.f19498h.setColor(i);
            this.f19494d.get(0).mo28916c(i);
        }
        if (this.f19499i.mo32881a()) {
            this.f19499i.setColor(i);
            this.f19494d.get(1).mo28916c(i);
        }
        if (this.f19500j.mo32881a()) {
            this.f19500j.setColor(i);
            this.f19494d.get(2).mo28916c(i);
        }
        if (this.f19501k.mo32881a()) {
            this.f19501k.setColor(i);
            this.f19494d.get(3).mo28916c(i);
        }
        mo32889j(i);
        this.f19491a.mo23408d0().mo27701m0(this.f19494d);
    }

    /* renamed from: r */
    public void mo32896r(int i) {
        if (this.f19498h.mo32881a()) {
            this.f19498h.setColor(i);
            this.f19495e.mo31723h().get(0).mo31793h(i);
        }
        if (this.f19499i.mo32881a()) {
            this.f19499i.setColor(i);
            this.f19495e.mo31723h().get(1).mo31793h(i);
        }
        if (this.f19500j.mo32881a()) {
            this.f19500j.setColor(i);
            this.f19495e.mo31723h().get(2).mo31793h(i);
        }
        if (this.f19501k.mo32881a()) {
            this.f19501k.setColor(i);
            this.f19495e.mo31723h().get(3).mo31793h(i);
        }
        mo32889j(i);
        if (!this.f19497g) {
            this.f19491a.mo23408d0().mo27718v().mo28905r(this.f19495e);
        }
    }

    public void setDevice(String str) {
        this.f19494d.clear();
        C4200i o0 = C4257w.m11953o0(str);
        this.f19491a = o0;
        this.f19496f = o0.mo23408d0().mo27700m();
        C4198d dVar = this.f19491a;
        boolean z = dVar instanceof C7186q;
        C7556g v = dVar.mo23408d0().mo27718v();
        if (z) {
            for (C7556g.C7557a next : v.mo28890c()) {
                this.f19494d.add(new C7556g.C7557a(next.mo28914a(), next.mo28915b()));
            }
            int i = 0;
            while (this.f19494d.size() < 4) {
                List<C7556g.C7557a> list = this.f19494d;
                list.add(new C7556g.C7557a(list.get(i).mo28914a(), this.f19494d.get(i).mo28915b()));
                i++;
            }
            m25186i();
            return;
        }
        this.f19495e = v.mo28891d();
        m25187k();
    }
}
