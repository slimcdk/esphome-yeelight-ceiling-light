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
    public boolean f6438a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f6439b;

    /* renamed from: c */
    private int f6440c;

    /* renamed from: d */
    private int f6441d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C3331b f6442e;

    /* renamed from: f */
    private float f6443f;

    /* renamed from: g */
    private float f6444g;

    /* renamed from: h */
    private float f6445h;

    /* renamed from: i */
    private Drawable f6446i;

    /* renamed from: j */
    private Drawable f6447j;

    /* renamed from: k */
    private Drawable f6448k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f6449l = 1;

    /* renamed from: m */
    private boolean f6450m = true;

    /* renamed from: com.hedgehog.ratingbar.RatingBar$a */
    class C3330a implements View.OnClickListener {
        C3330a() {
        }

        public void onClick(View view) {
            float f;
            RatingBar ratingBar;
            float f2;
            C3331b bVar;
            if (!RatingBar.this.f6438a) {
                return;
            }
            if (RatingBar.this.f6439b) {
                if (RatingBar.this.f6449l % 2 == 0) {
                    ratingBar = RatingBar.this;
                    f = ((float) ratingBar.indexOfChild(view)) + 1.0f;
                } else {
                    ratingBar = RatingBar.this;
                    f = ((float) ratingBar.indexOfChild(view)) + 0.5f;
                }
                ratingBar.setStar(f);
                if (RatingBar.this.f6442e != null) {
                    if (RatingBar.this.f6449l % 2 == 0) {
                        bVar = RatingBar.this.f6442e;
                        f2 = ((float) RatingBar.this.indexOfChild(view)) + 1.0f;
                    } else {
                        bVar = RatingBar.this.f6442e;
                        f2 = ((float) RatingBar.this.indexOfChild(view)) + 0.5f;
                    }
                    bVar.mo18089a(f2);
                    RatingBar.m10330d(RatingBar.this);
                    return;
                }
                return;
            }
            RatingBar ratingBar2 = RatingBar.this;
            ratingBar2.setStar(((float) ratingBar2.indexOfChild(view)) + 1.0f);
            if (RatingBar.this.f6442e != null) {
                RatingBar.this.f6442e.mo18089a(((float) RatingBar.this.indexOfChild(view)) + 1.0f);
            }
        }
    }

    /* renamed from: com.hedgehog.ratingbar.RatingBar$b */
    public interface C3331b {
        /* renamed from: a */
        void mo18089a(float f);
    }

    public RatingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RatingBar);
        this.f6448k = obtainStyledAttributes.getDrawable(R$styleable.RatingBar_starHalf);
        this.f6446i = obtainStyledAttributes.getDrawable(R$styleable.RatingBar_starEmpty);
        this.f6447j = obtainStyledAttributes.getDrawable(R$styleable.RatingBar_starFill);
        obtainStyledAttributes.getDimension(R$styleable.RatingBar_starImageSize, 120.0f);
        this.f6443f = obtainStyledAttributes.getDimension(R$styleable.RatingBar_starImageWidth, 60.0f);
        this.f6444g = obtainStyledAttributes.getDimension(R$styleable.RatingBar_starImageHeight, 120.0f);
        this.f6445h = obtainStyledAttributes.getDimension(R$styleable.RatingBar_starImagePadding, 15.0f);
        this.f6440c = obtainStyledAttributes.getInteger(R$styleable.RatingBar_starCount, 5);
        this.f6441d = obtainStyledAttributes.getInteger(R$styleable.RatingBar_starNum, 0);
        this.f6438a = obtainStyledAttributes.getBoolean(R$styleable.RatingBar_clickable, true);
        this.f6439b = obtainStyledAttributes.getBoolean(R$styleable.RatingBar_halfstart, false);
        for (int i = 0; i < this.f6441d; i++) {
            addView(m10332f(context, false));
        }
        for (int i2 = 0; i2 < this.f6440c; i2++) {
            ImageView f = m10332f(context, this.f6450m);
            f.setOnClickListener(new C3330a());
            addView(f);
        }
    }

    /* renamed from: d */
    static /* synthetic */ int m10330d(RatingBar ratingBar) {
        int i = ratingBar.f6449l;
        ratingBar.f6449l = i + 1;
        return i;
    }

    /* renamed from: f */
    private ImageView m10332f(Context context, boolean z) {
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(Math.round(this.f6443f), Math.round(this.f6444g)));
        imageView.setPadding(0, 0, Math.round(this.f6445h), 0);
        imageView.setImageDrawable(z ? this.f6446i : this.f6447j);
        return imageView;
    }

    public void setImagePadding(float f) {
        this.f6445h = f;
    }

    public void setOnRatingChangeListener(C3331b bVar) {
        this.f6442e = bVar;
    }

    public void setStar(float f) {
        int i = (int) f;
        float floatValue = new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Integer.toString(i))).floatValue();
        int i2 = this.f6440c;
        float f2 = i > i2 ? (float) i2 : (float) i;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        for (int i3 = 0; ((float) i3) < f2; i3++) {
            ((ImageView) getChildAt(i3)).setImageDrawable(this.f6447j);
        }
        if (floatValue > 0.0f) {
            ((ImageView) getChildAt(i)).setImageDrawable(this.f6448k);
            int i4 = this.f6440c;
            while (true) {
                i4--;
                if (((float) i4) >= 1.0f + f2) {
                    ((ImageView) getChildAt(i4)).setImageDrawable(this.f6446i);
                } else {
                    return;
                }
            }
        } else {
            int i5 = this.f6440c;
            while (true) {
                i5--;
                if (((float) i5) >= f2) {
                    ((ImageView) getChildAt(i5)).setImageDrawable(this.f6446i);
                } else {
                    return;
                }
            }
        }
    }

    public void setStarCount(int i) {
        this.f6440c = i;
    }

    public void setStarEmptyDrawable(Drawable drawable) {
        this.f6446i = drawable;
    }

    public void setStarFillDrawable(Drawable drawable) {
        this.f6447j = drawable;
    }

    public void setStarHalfDrawable(Drawable drawable) {
        this.f6448k = drawable;
    }

    public void setStarImageHeight(float f) {
        this.f6444g = f;
    }

    public void setStarImageSize(float f) {
    }

    public void setStarImageWidth(float f) {
        this.f6443f = f;
    }

    public void setmClickable(boolean z) {
        this.f6438a = z;
    }
}
