package com.yeelight.yeelib.p142ui.view;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;

/* renamed from: com.yeelight.yeelib.ui.view.FlowSpeedSeekBarView */
public class FlowSpeedSeekBarView extends LinearLayout {

    /* renamed from: a */
    SeekBar f15770a;

    /* renamed from: b */
    private C8807b f15771b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f15772c;

    /* renamed from: com.yeelight.yeelib.ui.view.FlowSpeedSeekBarView$a */
    class C8806a implements SeekBar.OnSeekBarChangeListener {
        C8806a() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            int unused = FlowSpeedSeekBarView.this.f15772c = seekBar.getProgress();
            FlowSpeedSeekBarView.this.m20810g();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.FlowSpeedSeekBarView$b */
    public interface C8807b {
        /* renamed from: a */
        void mo36257a(int i);
    }

    public FlowSpeedSeekBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo36273d(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m20810g() {
        int i = (6 - this.f15772c) + 1;
        C8807b bVar = this.f15771b;
        if (bVar != null) {
            bVar.mo36257a(i);
        }
    }

    /* renamed from: c */
    public void mo36272c(int i) {
        int i2 = (6 - i) + 1;
        this.f15772c = i2;
        this.f15770a.setProgress(i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo36273d(Context context) {
        LayoutInflater.from(context).inflate(R$layout.widget_flow_speed_view, this, true);
        SeekBar seekBar = (SeekBar) findViewById(R$id.bright_seek_bar);
        this.f15770a = seekBar;
        if (Build.VERSION.SDK_INT >= 21) {
            seekBar.setSplitTrack(false);
        }
        this.f15770a.setMax(6);
        this.f15770a.setOnSeekBarChangeListener(new C8806a());
    }

    /* renamed from: e */
    public void mo36274e(C8807b bVar) {
        this.f15771b = bVar;
    }

    /* renamed from: f */
    public void mo36275f() {
        this.f15771b = null;
    }
}
