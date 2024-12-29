package com.yeelight.yeelib.p142ui.view;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import java.util.Locale;

/* renamed from: com.yeelight.yeelib.ui.view.ColorTemperatureSeekBarView */
public class ColorTemperatureSeekBarView extends LinearLayout {

    /* renamed from: a */
    SeekBar f15669a;

    /* renamed from: b */
    TextView f15670b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f15671c;

    /* renamed from: com.yeelight.yeelib.ui.view.ColorTemperatureSeekBarView$a */
    class C8790a implements SeekBar.OnSeekBarChangeListener {
        C8790a() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                int unused = ColorTemperatureSeekBarView.this.f15671c = i + 1700;
                ColorTemperatureSeekBarView colorTemperatureSeekBarView = ColorTemperatureSeekBarView.this;
                colorTemperatureSeekBarView.m20739f(colorTemperatureSeekBarView.f15671c);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.ColorTemperatureSeekBarView$b */
    class C8791b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f15673a;

        C8791b(int i) {
            this.f15673a = i;
        }

        public void run() {
            ColorTemperatureSeekBarView.this.f15669a.setProgress(this.f15673a - 1700);
            ColorTemperatureSeekBarView.this.m20739f(this.f15673a);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.ColorTemperatureSeekBarView$c */
    class C8792c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f15675a;

        C8792c(int i) {
            this.f15675a = i;
        }

        public void run() {
            ColorTemperatureSeekBarView.this.f15670b.setText(String.format(Locale.US, "%dK", new Object[]{Integer.valueOf(this.f15675a)}));
            int unused = ColorTemperatureSeekBarView.this.f15671c = this.f15675a;
        }
    }

    public ColorTemperatureSeekBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo36183e(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m20739f(int i) {
        this.f15670b.post(new C8792c(i));
    }

    /* renamed from: d */
    public void mo36182d(int i) {
        this.f15669a.post(new C8791b(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo36183e(Context context) {
        LayoutInflater.from(context).inflate(R$layout.widget_adjust_color_temperature_view, this, true);
        this.f15669a = (SeekBar) findViewById(R$id.ct_seek_bar);
        this.f15670b = (TextView) findViewById(R$id.ct_selected);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f15669a.setSplitTrack(false);
        }
        this.f15669a.setProgressDrawable(getResources().getDrawable(R$drawable.color_temperature_picker_corner));
        this.f15669a.setOnSeekBarChangeListener(new C8790a());
        mo36182d(2700);
    }

    public int getCurrentValue() {
        return this.f15671c;
    }
}
