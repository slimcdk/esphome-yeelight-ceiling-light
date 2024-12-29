package com.yeelight.yeelib.p194ui.view;

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
    SeekBar f19407a;

    /* renamed from: b */
    TextView f19408b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f19409c;

    /* renamed from: com.yeelight.yeelib.ui.view.ColorTemperatureSeekBarView$a */
    class C10411a implements SeekBar.OnSeekBarChangeListener {
        C10411a() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                int unused = ColorTemperatureSeekBarView.this.f19409c = i + 1700;
                ColorTemperatureSeekBarView colorTemperatureSeekBarView = ColorTemperatureSeekBarView.this;
                colorTemperatureSeekBarView.m25128f(colorTemperatureSeekBarView.f19409c);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.ColorTemperatureSeekBarView$b */
    class C10412b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f19411a;

        C10412b(int i) {
            this.f19411a = i;
        }

        public void run() {
            ColorTemperatureSeekBarView.this.f19407a.setProgress(this.f19411a - 1700);
            ColorTemperatureSeekBarView.this.m25128f(this.f19411a);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.ColorTemperatureSeekBarView$c */
    class C10413c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f19413a;

        C10413c(int i) {
            this.f19413a = i;
        }

        public void run() {
            ColorTemperatureSeekBarView.this.f19408b.setText(String.format(Locale.US, "%dK", new Object[]{Integer.valueOf(this.f19413a)}));
            int unused = ColorTemperatureSeekBarView.this.f19409c = this.f19413a;
        }
    }

    public ColorTemperatureSeekBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo32813e(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m25128f(int i) {
        this.f19408b.post(new C10413c(i));
    }

    /* renamed from: d */
    public void mo32812d(int i) {
        this.f19407a.post(new C10412b(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo32813e(Context context) {
        LayoutInflater.from(context).inflate(R$layout.widget_adjust_color_temperature_view, this, true);
        this.f19407a = (SeekBar) findViewById(R$id.ct_seek_bar);
        this.f19408b = (TextView) findViewById(R$id.ct_selected);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f19407a.setSplitTrack(false);
        }
        this.f19407a.setProgressDrawable(getResources().getDrawable(R$drawable.color_temperature_picker_corner));
        this.f19407a.setOnSeekBarChangeListener(new C10411a());
        mo32812d(2700);
    }

    public int getCurrentValue() {
        return this.f19409c;
    }
}
