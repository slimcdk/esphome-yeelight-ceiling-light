package com.google.android.material.resources;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class MaterialResources {
    private MaterialResources() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r1, (r0 = r2.getResourceId(r3, 0)));
     */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList getColorStateList(android.content.Context r1, android.content.res.TypedArray r2, @androidx.annotation.StyleableRes int r3) {
        /*
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.content.res.ColorStateList r1 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r1, r0)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            android.content.res.ColorStateList r1 = r2.getColorStateList(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.resources.MaterialResources.getColorStateList(android.content.Context, android.content.res.TypedArray, int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r1, (r0 = r2.getResourceId(r3, 0)));
     */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable getDrawable(android.content.Context r1, android.content.res.TypedArray r2, @androidx.annotation.StyleableRes int r3) {
        /*
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.graphics.drawable.Drawable r1 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r1, r0)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.resources.MaterialResources.getDrawable(android.content.Context, android.content.res.TypedArray, int):android.graphics.drawable.Drawable");
    }

    @StyleableRes
    static int getIndexWithValue(TypedArray typedArray, @StyleableRes int i, @StyleableRes int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    @Nullable
    public static TextAppearance getTextAppearance(Context context, TypedArray typedArray, @StyleableRes int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new TextAppearance(context, resourceId);
    }
}
