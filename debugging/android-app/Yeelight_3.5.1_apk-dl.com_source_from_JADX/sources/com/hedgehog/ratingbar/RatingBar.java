package com.hedgehog.ratingbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.math.BigDecimal;

public class RatingBar extends LinearLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f4509a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f4510b;

    /* renamed from: c */
    private int f4511c;

    /* renamed from: d */
    private int f4512d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C2637b f4513e;

    /* renamed from: f */
    private float f4514f;

    /* renamed from: g */
    private float f4515g;

    /* renamed from: h */
    private float f4516h;

    /* renamed from: i */
    private Drawable f4517i;

    /* renamed from: j */
    private Drawable f4518j;

    /* renamed from: k */
    private Drawable f4519k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f4520l = 1;

    /* renamed from: m */
    private boolean f4521m = true;

    /* renamed from: com.hedgehog.ratingbar.RatingBar$a */
    class C2636a implements View.OnClickListener {
        C2636a() {
        }

        public void onClick(View view) {
            float f;
            RatingBar ratingBar;
            float f2;
            C2637b bVar;
            if (!RatingBar.this.f4509a) {
                return;
            }
            if (RatingBar.this.f4510b) {
                if (RatingBar.this.f4520l % 2 == 0) {
                    ratingBar = RatingBar.this;
                    f = ((float) ratingBar.indexOfChild(view)) + 1.0f;
                } else {
                    ratingBar = RatingBar.this;
                    f = ((float) ratingBar.indexOfChild(view)) + 0.5f;
                }
                ratingBar.setStar(f);
                if (RatingBar.this.f4513e != null) {
                    if (RatingBar.this.f4520l % 2 == 0) {
                        bVar = RatingBar.this.f4513e;
                        f2 = ((float) RatingBar.this.indexOfChild(view)) + 1.0f;
                    } else {
                        bVar = RatingBar.this.f4513e;
                        f2 = ((float) RatingBar.this.indexOfChild(view)) + 0.5f;
                    }
                    bVar.mo19708a(f2);
                    RatingBar.m7324d(RatingBar.this);
                    return;
                }
                return;
            }
            RatingBar ratingBar2 = RatingBar.this;
            ratingBar2.setStar(((float) ratingBar2.indexOfChild(view)) + 1.0f);
            if (RatingBar.this.f4513e != null) {
                RatingBar.this.f4513e.mo19708a(((float) RatingBar.this.indexOfChild(view)) + 1.0f);
            }
        }
    }

    /* renamed from: com.hedgehog.ratingbar.RatingBar$b */
    public interface C2637b {
        /* renamed from: a */
        void mo19708a(float f);
    }

    public RatingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RatingBar);
        this.f4519k = obtainStyledAttributes.getDrawable(R$styleable.RatingBar_starHalf);
        this.f4517i = obtainStyledAttributes.getDrawable(R$styleable.RatingBar_starEmpty);
        this.f4518j = obtainStyledAttributes.getDrawable(R$styleable.RatingBar_starFill);
        obtainStyledAttributes.getDimension(R$styleable.RatingBar_starImageSize, 120.0f);
        this.f4514f = obtainStyledAttributes.getDimension(R$styleable.RatingBar_starImageWidth, 60.0f);
        this.f4515g = obtainStyledAttributes.getDimension(R$styleable.RatingBar_starImageHeight, 120.0f);
        this.f4516h = obtainStyledAttributes.getDimension(R$styleable.RatingBar_starImagePadding, 15.0f);
        this.f4511c = obtainStyledAttributes.getInteger(R$styleable.RatingBar_starCount, 5);
        this.f4512d = obtainStyledAttributes.getInteger(R$styleable.RatingBar_starNum, 0);
        this.f4509a = obtainStyledAttributes.getBoolean(R$styleable.RatingBar_clickable, true);
        this.f4510b = obtainStyledAttributes.getBoolean(R$styleable.RatingBar_halfstart, false);
        for (int i = 0; i < this.f4512d; i++) {
            addView(m7326f(context, false));
        }
        for (int i2 = 0; i2 < this.f4511c; i2++) {
            ImageView f = m7326f(context, this.f4521m);
            f.setOnClickListener(new C2636a());
            addView(f);
        }
    }

    /* renamed from: d */
    static /* synthetic */ int m7324d(RatingBar ratingBar) {
        int i = ratingBar.f4520l;
        ratingBar.f4520l = i + 1;
        return i;
    }

    /* renamed from: f */
    private ImageView m7326f(Context context, boolean z) {
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(Math.round(this.f4514f), Math.round(this.f4515g)));
        imageView.setPadding(0, 0, Math.round(this.f4516h), 0);
        imageView.setImageDrawable(z ? this.f4517i : this.f4518j);
        return imageView;
    }

    public void setImagePadding(float f) {
        this.f4516h = f;
    }

    public void setOnRatingChangeListener(C2637b bVar) {
        this.f4513e = bVar;
    }

    public void setStar(float f) {
        int i = (int) f;
        float floatValue = new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Integer.toString(i))).floatValue();
        int i2 = this.f4511c;
        float f2 = i > i2 ? (float) i2 : (float) i;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        for (int i3 = 0; ((float) i3) < f2; i3++) {
            ((ImageView) getChildAt(i3)).setImageDrawable(this.f4518j);
        }
        if (floatValue > 0.0f) {
            ((ImageView) getChildAt(i)).setImageDrawable(this.f4519k);
            int i4 = this.f4511c;
            while (true) {
                i4--;
                if (((float) i4) >= 1.0f + f2) {
                    ((ImageView) getChildAt(i4)).setImageDrawable(this.f4517i);
                } else {
                    return;
                }
            }
        } else {
            int i5 = this.f4511c;
            while (true) {
                i5--;
                if (((float) i5) >= f2) {
                    ((ImageView) getChildAt(i5)).setImageDrawable(this.f4517i);
                } else {
                    return;
                }
            }
        }
    }

    public void setStarCount(int i) {
        this.f4511c = i;
    }

    public void setStarEmptyDrawable(Drawable drawable) {
        this.f4517i = drawable;
    }

    public void setStarFillDrawable(Drawable drawable) {
        this.f4518j = drawable;
    }

    public void setStarHalfDrawable(Drawable drawable) {
        this.f4519k = drawable;
    }

    public void setStarImageHeight(float f) {
        this.f4515g = f;
    }

    public void setStarImageSize(float f) {
    }

    public void setStarImageWidth(float f) {
        this.f4514f = f;
    }

    public void setmClickable(boolean z) {
        this.f4509a = z;
    }
}
