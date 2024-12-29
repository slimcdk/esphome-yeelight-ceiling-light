package com.yeelight.yeelib.p142ui.view;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import java.util.Locale;

/* renamed from: com.yeelight.yeelib.ui.view.BrightnessSeekBarView2 */
public class BrightnessSeekBarView2 extends LinearLayout {

    /* renamed from: a */
    SeekBar f15595a;

    /* renamed from: b */
    TextView f15596b;

    /* renamed from: c */
    int f15597c = 50;

    /* renamed from: com.yeelight.yeelib.ui.view.BrightnessSeekBarView2$a */
    class C8783a implements SeekBar.OnSeekBarChangeListener {
        C8783a() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                if (i < 1) {
                    i = 1;
                }
                BrightnessSeekBarView2 brightnessSeekBarView2 = BrightnessSeekBarView2.this;
                brightnessSeekBarView2.f15597c = i;
                brightnessSeekBarView2.m20698d(i);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            BrightnessSeekBarView2 brightnessSeekBarView2 = BrightnessSeekBarView2.this;
            int i = 1;
            if (seekBar.getProgress() >= 1) {
                i = seekBar.getProgress();
            }
            brightnessSeekBarView2.f15597c = i;
            BrightnessSeekBarView2 brightnessSeekBarView22 = BrightnessSeekBarView2.this;
            brightnessSeekBarView22.m20698d(brightnessSeekBarView22.f15597c);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.BrightnessSeekBarView2$b */
    class C8784b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f15599a;

        C8784b(int i) {
            this.f15599a = i;
        }

        public void run() {
            BrightnessSeekBarView2 brightnessSeekBarView2 = BrightnessSeekBarView2.this;
            int i = this.f15599a;
            brightnessSeekBarView2.f15597c = i;
            brightnessSeekBarView2.f15595a.setProgress(i);
            BrightnessSeekBarView2.this.f15596b.setText(String.format(Locale.US, "%d%%", new Object[]{Integer.valueOf(this.f15599a)}));
        }
    }

    public BrightnessSeekBarView2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo36132c(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m20698d(int i) {
        this.f15595a.post(new C8784b(i));
    }

    /* renamed from: b */
    public void mo36131b(int i) {
        m20698d(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo36132c(Context context) {
        LayoutInflater.from(context).inflate(R$layout.widget_adjust_bright_view2, this, true);
        this.f15595a = (SeekBar) findViewById(R$id.bright_seek_bar);
        this.f15596b = (TextView) findViewById(R$id.seek_bar_bright_value);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f15595a.setSplitTrack(false);
        }
        m20698d(this.f15597c);
        this.f15595a.setOnSeekBarChangeListener(new C8783a());
    }

    public int getCurrentValue() {
        return this.f15597c;
    }
}
