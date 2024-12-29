package com.yeelight.yeelib.p194ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.p194ui.view.NumberPickerView;
import java.util.Locale;

/* renamed from: com.yeelight.yeelib.ui.view.DurationSelectionView */
public class DurationSelectionView extends LinearLayout {

    /* renamed from: a */
    TextView f19440a;

    /* renamed from: b */
    NumberPickerView f19441b;

    /* renamed from: c */
    NumberPickerView f19442c;

    /* renamed from: d */
    NumberPickerView f19443d;

    /* renamed from: e */
    TextView f19444e;

    /* renamed from: f */
    int f19445f = 0;

    /* renamed from: g */
    int f19446g = 3;

    /* renamed from: h */
    int f19447h = 0;

    /* renamed from: com.yeelight.yeelib.ui.view.DurationSelectionView$a */
    class C10416a implements NumberPickerView.C10475d {
        C10416a() {
        }

        /* renamed from: a */
        public void mo32860a(NumberPickerView numberPickerView, int i, int i2) {
            DurationSelectionView durationSelectionView = DurationSelectionView.this;
            durationSelectionView.f19445f = i2;
            durationSelectionView.m25141d();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.DurationSelectionView$b */
    class C10417b implements NumberPickerView.C10476e {
        C10417b() {
        }

        /* renamed from: a */
        public void mo32861a(NumberPickerView numberPickerView, int i, int i2) {
            DurationSelectionView durationSelectionView = DurationSelectionView.this;
            durationSelectionView.f19445f = i2;
            durationSelectionView.m25141d();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.DurationSelectionView$c */
    class C10418c implements NumberPickerView.C10475d {
        C10418c() {
        }

        /* renamed from: a */
        public void mo32860a(NumberPickerView numberPickerView, int i, int i2) {
            DurationSelectionView durationSelectionView = DurationSelectionView.this;
            durationSelectionView.f19446g = i2;
            durationSelectionView.m25141d();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.DurationSelectionView$d */
    class C10419d implements NumberPickerView.C10476e {
        C10419d() {
        }

        /* renamed from: a */
        public void mo32861a(NumberPickerView numberPickerView, int i, int i2) {
            DurationSelectionView durationSelectionView = DurationSelectionView.this;
            durationSelectionView.f19446g = i2;
            durationSelectionView.m25141d();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.DurationSelectionView$e */
    class C10420e implements NumberPickerView.C10475d {
        C10420e() {
        }

        /* renamed from: a */
        public void mo32860a(NumberPickerView numberPickerView, int i, int i2) {
            DurationSelectionView durationSelectionView = DurationSelectionView.this;
            durationSelectionView.f19447h = i2;
            durationSelectionView.m25141d();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.DurationSelectionView$f */
    class C10421f implements NumberPickerView.C10476e {
        C10421f() {
        }

        /* renamed from: a */
        public void mo32861a(NumberPickerView numberPickerView, int i, int i2) {
            DurationSelectionView durationSelectionView = DurationSelectionView.this;
            durationSelectionView.f19447h = i2;
            durationSelectionView.m25141d();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.DurationSelectionView$g */
    class C10422g implements Runnable {
        C10422g() {
        }

        public void run() {
            DurationSelectionView.this.f19440a.setText(String.format(Locale.US, "%02d:%02d.%d", new Object[]{Integer.valueOf(DurationSelectionView.this.f19445f), Integer.valueOf(DurationSelectionView.this.f19446g), Integer.valueOf(DurationSelectionView.this.f19447h)}));
        }
    }

    public DurationSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo32857c(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m25141d() {
        this.f19440a.post(new C10422g());
    }

    /* renamed from: b */
    public void mo32856b(int i, int i2, int i3) {
        this.f19445f = i;
        this.f19446g = i2;
        this.f19447h = i3;
        this.f19443d.setValue(i3);
        this.f19441b.setValue(this.f19445f);
        this.f19442c.setValue(this.f19446g);
        m25141d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo32857c(Context context) {
        LayoutInflater.from(context).inflate(R$layout.widget_adjust_duration_view, this, true);
        this.f19440a = (TextView) findViewById(R$id.action_duration);
        this.f19441b = (NumberPickerView) findViewById(R$id.minute);
        this.f19442c = (NumberPickerView) findViewById(R$id.second);
        this.f19443d = (NumberPickerView) findViewById(R$id.millisecond);
        this.f19444e = (TextView) findViewById(R$id.duration_title);
        this.f19442c.setMaxValue(59);
        this.f19441b.setMaxValue(59);
        this.f19443d.setMaxValue(9);
        this.f19441b.setValue(this.f19445f);
        this.f19442c.setValue(this.f19446g);
        this.f19443d.setValue(this.f19447h);
        this.f19441b.setOnValueChangedListener(new C10416a());
        this.f19441b.setOnValueChangeListenerInScrolling(new C10417b());
        this.f19442c.setOnValueChangedListener(new C10418c());
        this.f19442c.setOnValueChangeListenerInScrolling(new C10419d());
        this.f19443d.setOnValueChangedListener(new C10420e());
        this.f19443d.setOnValueChangeListenerInScrolling(new C10421f());
        m25141d();
    }

    public int getCurrentValue() {
        return (this.f19445f * 60 * 1000) + (this.f19446g * 1000) + (this.f19447h * 100);
    }

    public void setTitle(int i) {
        this.f19444e.setText(i);
    }
}
