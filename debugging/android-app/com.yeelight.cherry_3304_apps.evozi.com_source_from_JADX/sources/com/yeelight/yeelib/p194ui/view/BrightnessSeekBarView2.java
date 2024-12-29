package com.yeelight.yeelib.p194ui.view;

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
    SeekBar f19333a;

    /* renamed from: b */
    TextView f19334b;

    /* renamed from: c */
    int f19335c = 50;

    /* renamed from: com.yeelight.yeelib.ui.view.BrightnessSeekBarView2$a */
    class C10404a implements SeekBar.OnSeekBarChangeListener {
        C10404a() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                if (i < 1) {
                    i = 1;
                }
                BrightnessSeekBarView2 brightnessSeekBarView2 = BrightnessSeekBarView2.this;
                brightnessSeekBarView2.f19335c = i;
                brightnessSeekBarView2.m25087d(i);
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
            brightnessSeekBarView2.f19335c = i;
            BrightnessSeekBarView2 brightnessSeekBarView22 = BrightnessSeekBarView2.this;
            brightnessSeekBarView22.m25087d(brightnessSeekBarView22.f19335c);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.BrightnessSeekBarView2$b */
    class C10405b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f19337a;

        C10405b(int i) {
            this.f19337a = i;
        }

        public void run() {
            BrightnessSeekBarView2 brightnessSeekBarView2 = BrightnessSeekBarView2.this;
            int i = this.f19337a;
            brightnessSeekBarView2.f19335c = i;
            brightnessSeekBarView2.f19333a.setProgress(i);
            BrightnessSeekBarView2.this.f19334b.setText(String.format(Locale.US, "%d%%", new Object[]{Integer.valueOf(this.f19337a)}));
        }
    }

    public BrightnessSeekBarView2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo32762c(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m25087d(int i) {
        this.f19333a.post(new C10405b(i));
    }

    /* renamed from: b */
    public void mo32761b(int i) {
        m25087d(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo32762c(Context context) {
        LayoutInflater.from(context).inflate(R$layout.widget_adjust_bright_view2, this, true);
        this.f19333a = (SeekBar) findViewById(R$id.bright_seek_bar);
        this.f19334b = (TextView) findViewById(R$id.seek_bar_bright_value);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f19333a.setSplitTrack(false);
        }
        m25087d(this.f19335c);
        this.f19333a.setOnSeekBarChangeListener(new C10404a());
    }

    public int getCurrentValue() {
        return this.f19335c;
    }
}
