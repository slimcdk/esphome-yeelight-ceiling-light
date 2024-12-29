package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.C0050R;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.math.MathUtils;
import androidx.core.text.TextDirectionHeuristicsCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.animation.AnimationUtils;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class CollapsingTextHelper {
    private static final boolean DEBUG_DRAW = false;
    private static final Paint DEBUG_DRAW_PAINT = null;
    private static final boolean USE_SCALING_TEXTURE = (Build.VERSION.SDK_INT < 18);
    private boolean boundsChanged;
    private final Rect collapsedBounds;
    private float collapsedDrawX;
    private float collapsedDrawY;
    private int collapsedShadowColor;
    private float collapsedShadowDx;
    private float collapsedShadowDy;
    private float collapsedShadowRadius;
    private ColorStateList collapsedTextColor;
    private int collapsedTextGravity = 16;
    private float collapsedTextSize = 15.0f;
    private Typeface collapsedTypeface;
    private final RectF currentBounds;
    private float currentDrawX;
    private float currentDrawY;
    private float currentTextSize;
    private Typeface currentTypeface;
    private boolean drawTitle;
    private final Rect expandedBounds;
    private float expandedDrawX;
    private float expandedDrawY;
    private float expandedFraction;
    private int expandedShadowColor;
    private float expandedShadowDx;
    private float expandedShadowDy;
    private float expandedShadowRadius;
    private ColorStateList expandedTextColor;
    private int expandedTextGravity = 16;
    private float expandedTextSize = 15.0f;
    private Bitmap expandedTitleTexture;
    private Typeface expandedTypeface;
    private boolean isRtl;
    private TimeInterpolator positionInterpolator;
    private float scale;
    private int[] state;
    private CharSequence text;
    private final TextPaint textPaint;
    private TimeInterpolator textSizeInterpolator;
    private CharSequence textToDraw;
    private float textureAscent;
    private float textureDescent;
    private Paint texturePaint;
    private final TextPaint tmpPaint;
    private boolean useTexture;
    private final View view;

    public CollapsingTextHelper(View view2) {
        this.view = view2;
        TextPaint textPaint2 = new TextPaint(129);
        this.textPaint = textPaint2;
        this.tmpPaint = new TextPaint(textPaint2);
        this.collapsedBounds = new Rect();
        this.expandedBounds = new Rect();
        this.currentBounds = new RectF();
    }

    private static int blendColors(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void calculateBaseOffsets() {
        /*
            r11 = this;
            float r0 = r11.currentTextSize
            float r1 = r11.collapsedTextSize
            r11.calculateUsingTextSize(r1)
            java.lang.CharSequence r1 = r11.textToDraw
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x0018
            android.text.TextPaint r4 = r11.textPaint
            int r5 = r1.length()
            float r1 = r4.measureText(r1, r2, r5)
            goto L_0x0019
        L_0x0018:
            r1 = 0
        L_0x0019:
            int r4 = r11.collapsedTextGravity
            boolean r5 = r11.isRtl
            int r4 = androidx.core.view.GravityCompat.getAbsoluteGravity(r4, r5)
            r5 = r4 & 112(0x70, float:1.57E-43)
            r6 = 80
            r7 = 48
            r8 = 1073741824(0x40000000, float:2.0)
            if (r5 == r7) goto L_0x0053
            if (r5 == r6) goto L_0x004d
            android.text.TextPaint r5 = r11.textPaint
            float r5 = r5.descent()
            android.text.TextPaint r9 = r11.textPaint
            float r9 = r9.ascent()
            float r5 = r5 - r9
            float r5 = r5 / r8
            android.text.TextPaint r9 = r11.textPaint
            float r9 = r9.descent()
            float r5 = r5 - r9
            android.graphics.Rect r9 = r11.collapsedBounds
            int r9 = r9.centerY()
            float r9 = (float) r9
            float r9 = r9 + r5
            r11.collapsedDrawY = r9
            goto L_0x0061
        L_0x004d:
            android.graphics.Rect r5 = r11.collapsedBounds
            int r5 = r5.bottom
            float r5 = (float) r5
            goto L_0x005f
        L_0x0053:
            android.graphics.Rect r5 = r11.collapsedBounds
            int r5 = r5.top
            float r5 = (float) r5
            android.text.TextPaint r9 = r11.textPaint
            float r9 = r9.ascent()
            float r5 = r5 - r9
        L_0x005f:
            r11.collapsedDrawY = r5
        L_0x0061:
            r5 = 8388615(0x800007, float:1.1754953E-38)
            r4 = r4 & r5
            r9 = 5
            r10 = 1
            if (r4 == r10) goto L_0x0079
            if (r4 == r9) goto L_0x0073
            android.graphics.Rect r1 = r11.collapsedBounds
            int r1 = r1.left
            float r1 = (float) r1
            r11.collapsedDrawX = r1
            goto L_0x0084
        L_0x0073:
            android.graphics.Rect r4 = r11.collapsedBounds
            int r4 = r4.right
            float r4 = (float) r4
            goto L_0x0081
        L_0x0079:
            android.graphics.Rect r4 = r11.collapsedBounds
            int r4 = r4.centerX()
            float r4 = (float) r4
            float r1 = r1 / r8
        L_0x0081:
            float r4 = r4 - r1
            r11.collapsedDrawX = r4
        L_0x0084:
            float r1 = r11.expandedTextSize
            r11.calculateUsingTextSize(r1)
            java.lang.CharSequence r1 = r11.textToDraw
            if (r1 == 0) goto L_0x0097
            android.text.TextPaint r3 = r11.textPaint
            int r4 = r1.length()
            float r3 = r3.measureText(r1, r2, r4)
        L_0x0097:
            int r1 = r11.expandedTextGravity
            boolean r2 = r11.isRtl
            int r1 = androidx.core.view.GravityCompat.getAbsoluteGravity(r1, r2)
            r2 = r1 & 112(0x70, float:1.57E-43)
            if (r2 == r7) goto L_0x00cb
            if (r2 == r6) goto L_0x00c5
            android.text.TextPaint r2 = r11.textPaint
            float r2 = r2.descent()
            android.text.TextPaint r4 = r11.textPaint
            float r4 = r4.ascent()
            float r2 = r2 - r4
            float r2 = r2 / r8
            android.text.TextPaint r4 = r11.textPaint
            float r4 = r4.descent()
            float r2 = r2 - r4
            android.graphics.Rect r4 = r11.expandedBounds
            int r4 = r4.centerY()
            float r4 = (float) r4
            float r4 = r4 + r2
            r11.expandedDrawY = r4
            goto L_0x00d9
        L_0x00c5:
            android.graphics.Rect r2 = r11.expandedBounds
            int r2 = r2.bottom
            float r2 = (float) r2
            goto L_0x00d7
        L_0x00cb:
            android.graphics.Rect r2 = r11.expandedBounds
            int r2 = r2.top
            float r2 = (float) r2
            android.text.TextPaint r4 = r11.textPaint
            float r4 = r4.ascent()
            float r2 = r2 - r4
        L_0x00d7:
            r11.expandedDrawY = r2
        L_0x00d9:
            r1 = r1 & r5
            if (r1 == r10) goto L_0x00ea
            if (r1 == r9) goto L_0x00e4
            android.graphics.Rect r1 = r11.expandedBounds
            int r1 = r1.left
            float r1 = (float) r1
            goto L_0x00f3
        L_0x00e4:
            android.graphics.Rect r1 = r11.expandedBounds
            int r1 = r1.right
            float r1 = (float) r1
            goto L_0x00f2
        L_0x00ea:
            android.graphics.Rect r1 = r11.expandedBounds
            int r1 = r1.centerX()
            float r1 = (float) r1
            float r3 = r3 / r8
        L_0x00f2:
            float r1 = r1 - r3
        L_0x00f3:
            r11.expandedDrawX = r1
            r11.clearTexture()
            r11.setInterpolatedTextSize(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.CollapsingTextHelper.calculateBaseOffsets():void");
    }

    private void calculateCurrentOffsets() {
        calculateOffsets(this.expandedFraction);
    }

    private boolean calculateIsRtl(CharSequence charSequence) {
        boolean z = true;
        if (ViewCompat.getLayoutDirection(this.view) != 1) {
            z = false;
        }
        return (z ? TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL : TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR).isRtl(charSequence, 0, charSequence.length());
    }

    private void calculateOffsets(float f) {
        int i;
        TextPaint textPaint2;
        interpolateBounds(f);
        this.currentDrawX = lerp(this.expandedDrawX, this.collapsedDrawX, f, this.positionInterpolator);
        this.currentDrawY = lerp(this.expandedDrawY, this.collapsedDrawY, f, this.positionInterpolator);
        setInterpolatedTextSize(lerp(this.expandedTextSize, this.collapsedTextSize, f, this.textSizeInterpolator));
        if (this.collapsedTextColor != this.expandedTextColor) {
            textPaint2 = this.textPaint;
            i = blendColors(getCurrentExpandedTextColor(), getCurrentCollapsedTextColor(), f);
        } else {
            textPaint2 = this.textPaint;
            i = getCurrentCollapsedTextColor();
        }
        textPaint2.setColor(i);
        this.textPaint.setShadowLayer(lerp(this.expandedShadowRadius, this.collapsedShadowRadius, f, (TimeInterpolator) null), lerp(this.expandedShadowDx, this.collapsedShadowDx, f, (TimeInterpolator) null), lerp(this.expandedShadowDy, this.collapsedShadowDy, f, (TimeInterpolator) null), blendColors(this.expandedShadowColor, this.collapsedShadowColor, f));
        ViewCompat.postInvalidateOnAnimation(this.view);
    }

    private void calculateUsingTextSize(float f) {
        float f2;
        boolean z;
        boolean z2;
        if (this.text != null) {
            float width = (float) this.collapsedBounds.width();
            float width2 = (float) this.expandedBounds.width();
            boolean z3 = true;
            if (isClose(f, this.collapsedTextSize)) {
                f2 = this.collapsedTextSize;
                this.scale = 1.0f;
                Typeface typeface = this.currentTypeface;
                Typeface typeface2 = this.collapsedTypeface;
                if (typeface != typeface2) {
                    this.currentTypeface = typeface2;
                    z = true;
                } else {
                    z = false;
                }
            } else {
                float f3 = this.expandedTextSize;
                Typeface typeface3 = this.currentTypeface;
                Typeface typeface4 = this.expandedTypeface;
                if (typeface3 != typeface4) {
                    this.currentTypeface = typeface4;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (isClose(f, f3)) {
                    this.scale = 1.0f;
                } else {
                    this.scale = f / this.expandedTextSize;
                }
                float f4 = this.collapsedTextSize / this.expandedTextSize;
                width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
                f2 = f3;
                z = z2;
            }
            if (width > 0.0f) {
                z = this.currentTextSize != f2 || this.boundsChanged || z;
                this.currentTextSize = f2;
                this.boundsChanged = false;
            }
            if (this.textToDraw == null || z) {
                this.textPaint.setTextSize(this.currentTextSize);
                this.textPaint.setTypeface(this.currentTypeface);
                TextPaint textPaint2 = this.textPaint;
                if (this.scale == 1.0f) {
                    z3 = false;
                }
                textPaint2.setLinearText(z3);
                CharSequence ellipsize = TextUtils.ellipsize(this.text, this.textPaint, width, TextUtils.TruncateAt.END);
                if (!TextUtils.equals(ellipsize, this.textToDraw)) {
                    this.textToDraw = ellipsize;
                    this.isRtl = calculateIsRtl(ellipsize);
                }
            }
        }
    }

    private void clearTexture() {
        Bitmap bitmap = this.expandedTitleTexture;
        if (bitmap != null) {
            bitmap.recycle();
            this.expandedTitleTexture = null;
        }
    }

    private void ensureExpandedTexture() {
        if (this.expandedTitleTexture == null && !this.expandedBounds.isEmpty() && !TextUtils.isEmpty(this.textToDraw)) {
            calculateOffsets(0.0f);
            this.textureAscent = this.textPaint.ascent();
            this.textureDescent = this.textPaint.descent();
            TextPaint textPaint2 = this.textPaint;
            CharSequence charSequence = this.textToDraw;
            int round = Math.round(textPaint2.measureText(charSequence, 0, charSequence.length()));
            int round2 = Math.round(this.textureDescent - this.textureAscent);
            if (round > 0 && round2 > 0) {
                this.expandedTitleTexture = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(this.expandedTitleTexture);
                CharSequence charSequence2 = this.textToDraw;
                canvas.drawText(charSequence2, 0, charSequence2.length(), 0.0f, ((float) round2) - this.textPaint.descent(), this.textPaint);
                if (this.texturePaint == null) {
                    this.texturePaint = new Paint(3);
                }
            }
        }
    }

    @ColorInt
    private int getCurrentExpandedTextColor() {
        int[] iArr = this.state;
        return iArr != null ? this.expandedTextColor.getColorForState(iArr, 0) : this.expandedTextColor.getDefaultColor();
    }

    private void getTextPaintCollapsed(TextPaint textPaint2) {
        textPaint2.setTextSize(this.collapsedTextSize);
        textPaint2.setTypeface(this.collapsedTypeface);
    }

    private void interpolateBounds(float f) {
        this.currentBounds.left = lerp((float) this.expandedBounds.left, (float) this.collapsedBounds.left, f, this.positionInterpolator);
        this.currentBounds.top = lerp(this.expandedDrawY, this.collapsedDrawY, f, this.positionInterpolator);
        this.currentBounds.right = lerp((float) this.expandedBounds.right, (float) this.collapsedBounds.right, f, this.positionInterpolator);
        this.currentBounds.bottom = lerp((float) this.expandedBounds.bottom, (float) this.collapsedBounds.bottom, f, this.positionInterpolator);
    }

    private static boolean isClose(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    private static float lerp(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return AnimationUtils.lerp(f, f2, f3);
    }

    private Typeface readFontFamilyTypeface(int i) {
        TypedArray obtainStyledAttributes = this.view.getContext().obtainStyledAttributes(i, new int[]{16843692});
        try {
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                return Typeface.create(string, 0);
            }
            obtainStyledAttributes.recycle();
            return null;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private static boolean rectEquals(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    private void setInterpolatedTextSize(float f) {
        calculateUsingTextSize(f);
        boolean z = USE_SCALING_TEXTURE && this.scale != 1.0f;
        this.useTexture = z;
        if (z) {
            ensureExpandedTexture();
        }
        ViewCompat.postInvalidateOnAnimation(this.view);
    }

    public float calculateCollapsedTextWidth() {
        if (this.text == null) {
            return 0.0f;
        }
        getTextPaintCollapsed(this.tmpPaint);
        TextPaint textPaint2 = this.tmpPaint;
        CharSequence charSequence = this.text;
        return textPaint2.measureText(charSequence, 0, charSequence.length());
    }

    public void draw(Canvas canvas) {
        float f;
        int save = canvas.save();
        if (this.textToDraw != null && this.drawTitle) {
            float f2 = this.currentDrawX;
            float f3 = this.currentDrawY;
            boolean z = this.useTexture && this.expandedTitleTexture != null;
            if (z) {
                f = this.textureAscent * this.scale;
            } else {
                f = this.textPaint.ascent() * this.scale;
                this.textPaint.descent();
            }
            if (z) {
                f3 += f;
            }
            float f4 = f3;
            float f5 = this.scale;
            if (f5 != 1.0f) {
                canvas.scale(f5, f5, f2, f4);
            }
            if (z) {
                canvas.drawBitmap(this.expandedTitleTexture, f2, f4, this.texturePaint);
            } else {
                CharSequence charSequence = this.textToDraw;
                canvas.drawText(charSequence, 0, charSequence.length(), f2, f4, this.textPaint);
            }
        }
        canvas.restoreToCount(save);
    }

    public void getCollapsedTextActualBounds(RectF rectF) {
        boolean calculateIsRtl = calculateIsRtl(this.text);
        Rect rect = this.collapsedBounds;
        float calculateCollapsedTextWidth = !calculateIsRtl ? (float) rect.left : ((float) rect.right) - calculateCollapsedTextWidth();
        rectF.left = calculateCollapsedTextWidth;
        Rect rect2 = this.collapsedBounds;
        rectF.top = (float) rect2.top;
        rectF.right = !calculateIsRtl ? calculateCollapsedTextWidth + calculateCollapsedTextWidth() : (float) rect2.right;
        rectF.bottom = ((float) this.collapsedBounds.top) + getCollapsedTextHeight();
    }

    public ColorStateList getCollapsedTextColor() {
        return this.collapsedTextColor;
    }

    public int getCollapsedTextGravity() {
        return this.collapsedTextGravity;
    }

    public float getCollapsedTextHeight() {
        getTextPaintCollapsed(this.tmpPaint);
        return -this.tmpPaint.ascent();
    }

    public float getCollapsedTextSize() {
        return this.collapsedTextSize;
    }

    public Typeface getCollapsedTypeface() {
        Typeface typeface = this.collapsedTypeface;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    @VisibleForTesting
    @ColorInt
    public int getCurrentCollapsedTextColor() {
        int[] iArr = this.state;
        return iArr != null ? this.collapsedTextColor.getColorForState(iArr, 0) : this.collapsedTextColor.getDefaultColor();
    }

    public ColorStateList getExpandedTextColor() {
        return this.expandedTextColor;
    }

    public int getExpandedTextGravity() {
        return this.expandedTextGravity;
    }

    public float getExpandedTextSize() {
        return this.expandedTextSize;
    }

    public Typeface getExpandedTypeface() {
        Typeface typeface = this.expandedTypeface;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public float getExpansionFraction() {
        return this.expandedFraction;
    }

    public CharSequence getText() {
        return this.text;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.expandedTextColor;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.collapsedTextColor
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0014
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.expandedTextColor
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0016
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.CollapsingTextHelper.isStateful():boolean");
    }

    /* access modifiers changed from: package-private */
    public void onBoundsChanged() {
        this.drawTitle = this.collapsedBounds.width() > 0 && this.collapsedBounds.height() > 0 && this.expandedBounds.width() > 0 && this.expandedBounds.height() > 0;
    }

    public void recalculate() {
        if (this.view.getHeight() > 0 && this.view.getWidth() > 0) {
            calculateBaseOffsets();
            calculateCurrentOffsets();
        }
    }

    public void setCollapsedBounds(int i, int i2, int i3, int i4) {
        if (!rectEquals(this.collapsedBounds, i, i2, i3, i4)) {
            this.collapsedBounds.set(i, i2, i3, i4);
            this.boundsChanged = true;
            onBoundsChanged();
        }
    }

    public void setCollapsedTextAppearance(int i) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.view.getContext(), i, C0050R.styleable.TextAppearance);
        int i2 = C0050R.styleable.TextAppearance_android_textColor;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.collapsedTextColor = obtainStyledAttributes.getColorStateList(i2);
        }
        int i3 = C0050R.styleable.TextAppearance_android_textSize;
        if (obtainStyledAttributes.hasValue(i3)) {
            this.collapsedTextSize = (float) obtainStyledAttributes.getDimensionPixelSize(i3, (int) this.collapsedTextSize);
        }
        this.collapsedShadowColor = obtainStyledAttributes.getInt(C0050R.styleable.TextAppearance_android_shadowColor, 0);
        this.collapsedShadowDx = obtainStyledAttributes.getFloat(C0050R.styleable.TextAppearance_android_shadowDx, 0.0f);
        this.collapsedShadowDy = obtainStyledAttributes.getFloat(C0050R.styleable.TextAppearance_android_shadowDy, 0.0f);
        this.collapsedShadowRadius = obtainStyledAttributes.getFloat(C0050R.styleable.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 16) {
            this.collapsedTypeface = readFontFamilyTypeface(i);
        }
        recalculate();
    }

    public void setCollapsedTextColor(ColorStateList colorStateList) {
        if (this.collapsedTextColor != colorStateList) {
            this.collapsedTextColor = colorStateList;
            recalculate();
        }
    }

    public void setCollapsedTextGravity(int i) {
        if (this.collapsedTextGravity != i) {
            this.collapsedTextGravity = i;
            recalculate();
        }
    }

    public void setCollapsedTextSize(float f) {
        if (this.collapsedTextSize != f) {
            this.collapsedTextSize = f;
            recalculate();
        }
    }

    public void setCollapsedTypeface(Typeface typeface) {
        if (this.collapsedTypeface != typeface) {
            this.collapsedTypeface = typeface;
            recalculate();
        }
    }

    public void setExpandedBounds(int i, int i2, int i3, int i4) {
        if (!rectEquals(this.expandedBounds, i, i2, i3, i4)) {
            this.expandedBounds.set(i, i2, i3, i4);
            this.boundsChanged = true;
            onBoundsChanged();
        }
    }

    public void setExpandedTextAppearance(int i) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.view.getContext(), i, C0050R.styleable.TextAppearance);
        int i2 = C0050R.styleable.TextAppearance_android_textColor;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.expandedTextColor = obtainStyledAttributes.getColorStateList(i2);
        }
        int i3 = C0050R.styleable.TextAppearance_android_textSize;
        if (obtainStyledAttributes.hasValue(i3)) {
            this.expandedTextSize = (float) obtainStyledAttributes.getDimensionPixelSize(i3, (int) this.expandedTextSize);
        }
        this.expandedShadowColor = obtainStyledAttributes.getInt(C0050R.styleable.TextAppearance_android_shadowColor, 0);
        this.expandedShadowDx = obtainStyledAttributes.getFloat(C0050R.styleable.TextAppearance_android_shadowDx, 0.0f);
        this.expandedShadowDy = obtainStyledAttributes.getFloat(C0050R.styleable.TextAppearance_android_shadowDy, 0.0f);
        this.expandedShadowRadius = obtainStyledAttributes.getFloat(C0050R.styleable.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 16) {
            this.expandedTypeface = readFontFamilyTypeface(i);
        }
        recalculate();
    }

    public void setExpandedTextColor(ColorStateList colorStateList) {
        if (this.expandedTextColor != colorStateList) {
            this.expandedTextColor = colorStateList;
            recalculate();
        }
    }

    public void setExpandedTextGravity(int i) {
        if (this.expandedTextGravity != i) {
            this.expandedTextGravity = i;
            recalculate();
        }
    }

    public void setExpandedTextSize(float f) {
        if (this.expandedTextSize != f) {
            this.expandedTextSize = f;
            recalculate();
        }
    }

    public void setExpandedTypeface(Typeface typeface) {
        if (this.expandedTypeface != typeface) {
            this.expandedTypeface = typeface;
            recalculate();
        }
    }

    public void setExpansionFraction(float f) {
        float clamp = MathUtils.clamp(f, 0.0f, 1.0f);
        if (clamp != this.expandedFraction) {
            this.expandedFraction = clamp;
            calculateCurrentOffsets();
        }
    }

    public void setPositionInterpolator(TimeInterpolator timeInterpolator) {
        this.positionInterpolator = timeInterpolator;
        recalculate();
    }

    public final boolean setState(int[] iArr) {
        this.state = iArr;
        if (!isStateful()) {
            return false;
        }
        recalculate();
        return true;
    }

    public void setText(CharSequence charSequence) {
        if (charSequence == null || !charSequence.equals(this.text)) {
            this.text = charSequence;
            this.textToDraw = null;
            clearTexture();
            recalculate();
        }
    }

    public void setTextSizeInterpolator(TimeInterpolator timeInterpolator) {
        this.textSizeInterpolator = timeInterpolator;
        recalculate();
    }

    public void setTypefaces(Typeface typeface) {
        this.expandedTypeface = typeface;
        this.collapsedTypeface = typeface;
        recalculate();
    }
}
