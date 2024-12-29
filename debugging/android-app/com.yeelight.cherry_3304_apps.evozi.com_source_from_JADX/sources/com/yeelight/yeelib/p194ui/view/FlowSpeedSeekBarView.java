package com.yeelight.yeelib.p194ui.view;

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
    SeekBar f19508a;

    /* renamed from: b */
    private C10428b f19509b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f19510c;

    /* renamed from: com.yeelight.yeelib.ui.view.FlowSpeedSeekBarView$a */
    class C10427a implements SeekBar.OnSeekBarChangeListener {
        C10427a() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            int unused = FlowSpeedSeekBarView.this.f19510c = seekBar.getProgress();
            FlowSpeedSeekBarView.this.m25199g();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.FlowSpeedSeekBarView$b */
    public interface C10428b {
        /* renamed from: a */
        void mo32887a(int i);
    }

    public FlowSpeedSeekBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo32903d(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m25199g() {
        int i = (6 - this.f19510c) + 1;
        C10428b bVar = this.f19509b;
        if (bVar != null) {
            bVar.mo32887a(i);
        }
    }

    /* renamed from: c */
    public void mo32902c(int i) {
        int i2 = (6 - i) + 1;
        this.f19510c = i2;
        this.f19508a.setProgress(i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo32903d(Context context) {
        LayoutInflater.from(context).inflate(R$layout.widget_flow_speed_view, this, true);
        SeekBar seekBar = (SeekBar) findViewById(R$id.bright_seek_bar);
        this.f19508a = seekBar;
        if (Build.VERSION.SDK_INT >= 21) {
            seekBar.setSplitTrack(false);
        }
        this.f19508a.setMax(6);
        this.f19508a.setOnSeekBarChangeListener(new C10427a());
    }

    /* renamed from: e */
    public void mo32904e(C10428b bVar) {
        this.f19509b = bVar;
    }

    /* renamed from: f */
    public void mo32905f() {
        this.f19509b = null;
    }
}
