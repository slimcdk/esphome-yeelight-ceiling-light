package com.yeelight.yeelib.p194ui.view;

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
    SeekBar f19381a;

    /* renamed from: b */
    ImageView f19382b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public float[] f19383c = {1.0f, 1.0f, 1.0f};
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f19384d;

    /* renamed from: com.yeelight.yeelib.ui.view.ColorSeekBarView$a */
    class C10408a implements SeekBar.OnSeekBarChangeListener {
        C10408a() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                if (i < 1) {
                    i = 1;
                }
                ColorSeekBarView.this.f19383c[0] = ColorSeekBarView.this.m25118j(i);
                ColorSeekBarView.this.f19383c[1] = 1.0f;
                ColorSeekBarView.this.f19383c[2] = 1.0f;
                ColorSeekBarView colorSeekBarView = ColorSeekBarView.this;
                int unused = colorSeekBarView.f19384d = Color.HSVToColor(colorSeekBarView.f19383c);
                ColorSeekBarView colorSeekBarView2 = ColorSeekBarView.this;
                colorSeekBarView2.m25119k(colorSeekBarView2.f19384d);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.ColorSeekBarView$b */
    class C10409b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f19386a;

        C10409b(int i) {
            this.f19386a = i;
        }

        public void run() {
            ColorSeekBarView colorSeekBarView = ColorSeekBarView.this;
            colorSeekBarView.f19381a.setProgress(colorSeekBarView.m25117g(this.f19386a));
            ColorSeekBarView.this.m25119k(this.f19386a);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.ColorSeekBarView$c */
    class C10410c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f19388a;

        C10410c(int i) {
            this.f19388a = i;
        }

        public void run() {
            Drawable drawable = ColorSeekBarView.this.f19382b.getDrawable();
            ((GradientDrawable) drawable).setColor(this.f19388a);
            ColorSeekBarView.this.f19382b.setImageDrawable(drawable);
            int unused = ColorSeekBarView.this.f19384d = this.f19388a;
        }
    }

    public ColorSeekBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo32803i(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public int m25117g(int i) {
        Color.colorToHSV(i, this.f19383c);
        return (int) ((this.f19383c[0] * 500.0f) / 360.0f);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public float m25118j(int i) {
        if (i == 500) {
            i = 498;
        }
        return (((float) i) * 360.0f) / 500.0f;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m25119k(int i) {
        this.f19382b.post(new C10410c(i));
    }

    public int getCurrentValue() {
        return this.f19384d & ViewCompat.MEASURED_SIZE_MASK;
    }

    /* renamed from: h */
    public void mo32802h(int i) {
        this.f19381a.post(new C10409b(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo32803i(Context context) {
        LayoutInflater.from(context).inflate(R$layout.widget_adjust_color_view, this, true);
        this.f19381a = (SeekBar) findViewById(R$id.color_seek_bar);
        this.f19382b = (ImageView) findViewById(R$id.color_selected);
        this.f19381a.setMax(500);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f19381a.setSplitTrack(false);
        }
        this.f19381a.setProgressDrawable(getResources().getDrawable(R$drawable.color_picker_corner));
        this.f19381a.setOnSeekBarChangeListener(new C10408a());
        mo32802h(SupportMenu.CATEGORY_MASK);
    }
}
