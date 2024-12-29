package com.yeelight.yeelib.p142ui.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;

/* renamed from: com.yeelight.yeelib.ui.view.ColorSeekBarView */
public class ColorSeekBarView extends LinearLayout {

    /* renamed from: a */
    SeekBar f15643a;

    /* renamed from: b */
    ImageView f15644b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public float[] f15645c = {1.0f, 1.0f, 1.0f};
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f15646d;

    /* renamed from: com.yeelight.yeelib.ui.view.ColorSeekBarView$a */
    class C8787a implements SeekBar.OnSeekBarChangeListener {
        C8787a() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                if (i < 1) {
                    i = 1;
                }
                ColorSeekBarView.this.f15645c[0] = ColorSeekBarView.this.m20729j(i);
                ColorSeekBarView.this.f15645c[1] = 1.0f;
                ColorSeekBarView.this.f15645c[2] = 1.0f;
                ColorSeekBarView colorSeekBarView = ColorSeekBarView.this;
                int unused = colorSeekBarView.f15646d = Color.HSVToColor(colorSeekBarView.f15645c);
                ColorSeekBarView colorSeekBarView2 = ColorSeekBarView.this;
                colorSeekBarView2.m20730k(colorSeekBarView2.f15646d);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.ColorSeekBarView$b */
    class C8788b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f15648a;

        C8788b(int i) {
            this.f15648a = i;
        }

        public void run() {
            ColorSeekBarView colorSeekBarView = ColorSeekBarView.this;
            colorSeekBarView.f15643a.setProgress(colorSeekBarView.m20728g(this.f15648a));
            ColorSeekBarView.this.m20730k(this.f15648a);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.ColorSeekBarView$c */
    class C8789c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f15650a;

        C8789c(int i) {
            this.f15650a = i;
        }

        public void run() {
            Drawable drawable = ColorSeekBarView.this.f15644b.getDrawable();
            ((GradientDrawable) drawable).setColor(this.f15650a);
            ColorSeekBarView.this.f15644b.setImageDrawable(drawable);
            int unused = ColorSeekBarView.this.f15646d = this.f15650a;
        }
    }

    public ColorSeekBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo36173i(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public int m20728g(int i) {
        Color.colorToHSV(i, this.f15645c);
        return (int) ((this.f15645c[0] * 500.0f) / 360.0f);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public float m20729j(int i) {
        if (i == 500) {
            i = 498;
        }
        return (((float) i) * 360.0f) / 500.0f;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m20730k(int i) {
        this.f15644b.post(new C8789c(i));
    }

    public int getCurrentValue() {
        return this.f15646d & ViewCompat.MEASURED_SIZE_MASK;
    }

    /* renamed from: h */
    public void mo36172h(int i) {
        this.f15643a.post(new C8788b(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo36173i(Context context) {
        LayoutInflater.from(context).inflate(R$layout.widget_adjust_color_view, this, true);
        this.f15643a = (SeekBar) findViewById(R$id.color_seek_bar);
        this.f15644b = (ImageView) findViewById(R$id.color_selected);
        this.f15643a.setMax(500);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f15643a.setSplitTrack(false);
        }
        this.f15643a.setProgressDrawable(getResources().getDrawable(R$drawable.color_picker_corner));
        this.f15643a.setOnSeekBarChangeListener(new C8787a());
        mo36172h(SupportMenu.CATEGORY_MASK);
    }
}
