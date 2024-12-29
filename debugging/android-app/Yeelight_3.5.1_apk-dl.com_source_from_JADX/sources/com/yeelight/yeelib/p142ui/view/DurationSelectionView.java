package com.yeelight.yeelib.p142ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.p142ui.view.NumberPickerView;
import java.util.Locale;

/* renamed from: com.yeelight.yeelib.ui.view.DurationSelectionView */
public class DurationSelectionView extends LinearLayout {

    /* renamed from: a */
    TextView f15702a;

    /* renamed from: b */
    NumberPickerView f15703b;

    /* renamed from: c */
    NumberPickerView f15704c;

    /* renamed from: d */
    NumberPickerView f15705d;

    /* renamed from: e */
    TextView f15706e;

    /* renamed from: f */
    int f15707f = 0;

    /* renamed from: g */
    int f15708g = 3;

    /* renamed from: h */
    int f15709h = 0;

    /* renamed from: com.yeelight.yeelib.ui.view.DurationSelectionView$a */
    class C8795a implements NumberPickerView.C8852d {
        C8795a() {
        }

        /* renamed from: a */
        public void mo36230a(NumberPickerView numberPickerView, int i, int i2) {
            DurationSelectionView durationSelectionView = DurationSelectionView.this;
            durationSelectionView.f15707f = i2;
            durationSelectionView.m20752d();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.DurationSelectionView$b */
    class C8796b implements NumberPickerView.C8853e {
        C8796b() {
        }

        /* renamed from: a */
        public void mo36231a(NumberPickerView numberPickerView, int i, int i2) {
            DurationSelectionView durationSelectionView = DurationSelectionView.this;
            durationSelectionView.f15707f = i2;
            durationSelectionView.m20752d();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.DurationSelectionView$c */
    class C8797c implements NumberPickerView.C8852d {
        C8797c() {
        }

        /* renamed from: a */
        public void mo36230a(NumberPickerView numberPickerView, int i, int i2) {
            DurationSelectionView durationSelectionView = DurationSelectionView.this;
            durationSelectionView.f15708g = i2;
            durationSelectionView.m20752d();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.DurationSelectionView$d */
    class C8798d implements NumberPickerView.C8853e {
        C8798d() {
        }

        /* renamed from: a */
        public void mo36231a(NumberPickerView numberPickerView, int i, int i2) {
            DurationSelectionView durationSelectionView = DurationSelectionView.this;
            durationSelectionView.f15708g = i2;
            durationSelectionView.m20752d();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.DurationSelectionView$e */
    class C8799e implements NumberPickerView.C8852d {
        C8799e() {
        }

        /* renamed from: a */
        public void mo36230a(NumberPickerView numberPickerView, int i, int i2) {
            DurationSelectionView durationSelectionView = DurationSelectionView.this;
            durationSelectionView.f15709h = i2;
            durationSelectionView.m20752d();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.DurationSelectionView$f */
    class C8800f implements NumberPickerView.C8853e {
        C8800f() {
        }

        /* renamed from: a */
        public void mo36231a(NumberPickerView numberPickerView, int i, int i2) {
            DurationSelectionView durationSelectionView = DurationSelectionView.this;
            durationSelectionView.f15709h = i2;
            durationSelectionView.m20752d();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.DurationSelectionView$g */
    class C8801g implements Runnable {
        C8801g() {
        }

        public void run() {
            DurationSelectionView.this.f15702a.setText(String.format(Locale.US, "%02d:%02d.%d", new Object[]{Integer.valueOf(DurationSelectionView.this.f15707f), Integer.valueOf(DurationSelectionView.this.f15708g), Integer.valueOf(DurationSelectionView.this.f15709h)}));
        }
    }

    public DurationSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo36227c(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m20752d() {
        this.f15702a.post(new C8801g());
    }

    /* renamed from: b */
    public void mo36226b(int i, int i2, int i3) {
        this.f15707f = i;
        this.f15708g = i2;
        this.f15709h = i3;
        this.f15705d.setValue(i3);
        this.f15703b.setValue(this.f15707f);
        this.f15704c.setValue(this.f15708g);
        m20752d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo36227c(Context context) {
        LayoutInflater.from(context).inflate(R$layout.widget_adjust_duration_view, this, true);
        this.f15702a = (TextView) findViewById(R$id.action_duration);
        this.f15703b = (NumberPickerView) findViewById(R$id.minute);
        this.f15704c = (NumberPickerView) findViewById(R$id.second);
        this.f15705d = (NumberPickerView) findViewById(R$id.millisecond);
        this.f15706e = (TextView) findViewById(R$id.duration_title);
        this.f15704c.setMaxValue(59);
        this.f15703b.setMaxValue(59);
        this.f15705d.setMaxValue(9);
        this.f15703b.setValue(this.f15707f);
        this.f15704c.setValue(this.f15708g);
        this.f15705d.setValue(this.f15709h);
        this.f15703b.setOnValueChangedListener(new C8795a());
        this.f15703b.setOnValueChangeListenerInScrolling(new C8796b());
        this.f15704c.setOnValueChangedListener(new C8797c());
        this.f15704c.setOnValueChangeListenerInScrolling(new C8798d());
        this.f15705d.setOnValueChangedListener(new C8799e());
        this.f15705d.setOnValueChangeListenerInScrolling(new C8800f());
        m20752d();
    }

    public int getCurrentValue() {
        return (this.f15707f * 60 * 1000) + (this.f15708g * 1000) + (this.f15709h * 100);
    }

    public void setTitle(int i) {
        this.f15706e.setText(i);
    }
}
