package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import androidx.annotation.FontRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.C1920R;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class TextAppearance {
    private static final String TAG = "TextAppearance";
    private static final int TYPEFACE_MONOSPACE = 3;
    private static final int TYPEFACE_SANS = 1;
    private static final int TYPEFACE_SERIF = 2;
    /* access modifiers changed from: private */
    @Nullable
    public Typeface font;
    @Nullable
    public final String fontFamily;
    @FontRes
    private final int fontFamilyResourceId;
    /* access modifiers changed from: private */
    public boolean fontResolved = false;
    @Nullable
    public final ColorStateList shadowColor;
    public final float shadowDx;
    public final float shadowDy;
    public final float shadowRadius;
    public final boolean textAllCaps;
    @Nullable
    public final ColorStateList textColor;
    @Nullable
    public final ColorStateList textColorHint;
    @Nullable
    public final ColorStateList textColorLink;
    public final float textSize;
    public final int textStyle;
    public final int typeface;

    public TextAppearance(Context context, @StyleRes int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C1920R.styleable.TextAppearance);
        this.textSize = obtainStyledAttributes.getDimension(C1920R.styleable.TextAppearance_android_textSize, 0.0f);
        this.textColor = MaterialResources.getColorStateList(context, obtainStyledAttributes, C1920R.styleable.TextAppearance_android_textColor);
        this.textColorHint = MaterialResources.getColorStateList(context, obtainStyledAttributes, C1920R.styleable.TextAppearance_android_textColorHint);
        this.textColorLink = MaterialResources.getColorStateList(context, obtainStyledAttributes, C1920R.styleable.TextAppearance_android_textColorLink);
        this.textStyle = obtainStyledAttributes.getInt(C1920R.styleable.TextAppearance_android_textStyle, 0);
        this.typeface = obtainStyledAttributes.getInt(C1920R.styleable.TextAppearance_android_typeface, 1);
        int indexWithValue = MaterialResources.getIndexWithValue(obtainStyledAttributes, C1920R.styleable.TextAppearance_fontFamily, C1920R.styleable.TextAppearance_android_fontFamily);
        this.fontFamilyResourceId = obtainStyledAttributes.getResourceId(indexWithValue, 0);
        this.fontFamily = obtainStyledAttributes.getString(indexWithValue);
        this.textAllCaps = obtainStyledAttributes.getBoolean(C1920R.styleable.TextAppearance_textAllCaps, false);
        this.shadowColor = MaterialResources.getColorStateList(context, obtainStyledAttributes, C1920R.styleable.TextAppearance_android_shadowColor);
        this.shadowDx = obtainStyledAttributes.getFloat(C1920R.styleable.TextAppearance_android_shadowDx, 0.0f);
        this.shadowDy = obtainStyledAttributes.getFloat(C1920R.styleable.TextAppearance_android_shadowDy, 0.0f);
        this.shadowRadius = obtainStyledAttributes.getFloat(C1920R.styleable.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: private */
    public void createFallbackTypeface() {
        if (this.font == null) {
            this.font = Typeface.create(this.fontFamily, this.textStyle);
        }
        if (this.font == null) {
            int i = this.typeface;
            this.font = i != 1 ? i != 2 ? i != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            Typeface typeface2 = this.font;
            if (typeface2 != null) {
                this.font = Typeface.create(typeface2, this.textStyle);
            }
        }
    }

    @VisibleForTesting
    @NonNull
    public Typeface getFont(Context context) {
        if (this.fontResolved) {
            return this.font;
        }
        if (!context.isRestricted()) {
            try {
                Typeface font2 = ResourcesCompat.getFont(context, this.fontFamilyResourceId);
                this.font = font2;
                if (font2 != null) {
                    this.font = Typeface.create(font2, this.textStyle);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception unused2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error loading font ");
                sb.append(this.fontFamily);
            }
        }
        createFallbackTypeface();
        this.fontResolved = true;
        return this.font;
    }

    public void getFontAsync(Context context, final TextPaint textPaint, @NonNull final ResourcesCompat.FontCallback fontCallback) {
        if (!this.fontResolved) {
            createFallbackTypeface();
            if (context.isRestricted()) {
                this.fontResolved = true;
            } else {
                try {
                    ResourcesCompat.getFont(context, this.fontFamilyResourceId, new ResourcesCompat.FontCallback() {
                        public void onFontRetrievalFailed(int i) {
                            TextAppearance.this.createFallbackTypeface();
                            boolean unused = TextAppearance.this.fontResolved = true;
                            fontCallback.lambda$callbackFailAsync$1(i);
                        }

                        public void onFontRetrieved(@NonNull Typeface typeface) {
                            TextAppearance textAppearance = TextAppearance.this;
                            Typeface unused = textAppearance.font = Typeface.create(typeface, textAppearance.textStyle);
                            TextAppearance.this.updateTextPaintMeasureState(textPaint, typeface);
                            boolean unused2 = TextAppearance.this.fontResolved = true;
                            fontCallback.lambda$callbackSuccessAsync$0(typeface);
                        }
                    }, (Handler) null);
                    return;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                    return;
                } catch (Exception unused2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error loading font ");
                    sb.append(this.fontFamily);
                    return;
                }
            }
        }
        updateTextPaintMeasureState(textPaint, this.font);
    }

    public void updateDrawState(Context context, TextPaint textPaint, ResourcesCompat.FontCallback fontCallback) {
        updateMeasureState(context, textPaint, fontCallback);
        ColorStateList colorStateList = this.textColor;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : ViewCompat.MEASURED_STATE_MASK);
        float f = this.shadowRadius;
        float f2 = this.shadowDx;
        float f3 = this.shadowDy;
        ColorStateList colorStateList2 = this.shadowColor;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void updateMeasureState(Context context, TextPaint textPaint, @Nullable ResourcesCompat.FontCallback fontCallback) {
        Typeface typeface2;
        if (TextAppearanceConfig.shouldLoadFontSynchronously()) {
            typeface2 = getFont(context);
        } else {
            getFontAsync(context, textPaint, fontCallback);
            if (!this.fontResolved) {
                typeface2 = this.font;
            } else {
                return;
            }
        }
        updateTextPaintMeasureState(textPaint, typeface2);
    }

    public void updateTextPaintMeasureState(@NonNull TextPaint textPaint, @NonNull Typeface typeface2) {
        textPaint.setTypeface(typeface2);
        int style = (typeface2.getStyle() ^ -1) & this.textStyle;
        textPaint.setFakeBoldText((style & 1) != 0);
        textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.textSize);
    }
}
