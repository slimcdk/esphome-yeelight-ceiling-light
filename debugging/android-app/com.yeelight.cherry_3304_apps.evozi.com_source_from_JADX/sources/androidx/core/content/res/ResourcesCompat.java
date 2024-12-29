package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FontRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;

public final class ResourcesCompat {
    private static final String TAG = "ResourcesCompat";

    public static abstract class FontCallback {
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void callbackFailAsync(final int i, @Nullable Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() {
                public void run() {
                    FontCallback.this.onFontRetrievalFailed(i);
                }
            });
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void callbackSuccessAsync(final Typeface typeface, @Nullable Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() {
                public void run() {
                    FontCallback.this.onFontRetrieved(typeface);
                }
            });
        }

        public abstract void onFontRetrievalFailed(int i);

        public abstract void onFontRetrieved(@NonNull Typeface typeface);
    }

    private ResourcesCompat() {
    }

    @ColorInt
    public static int getColor(@NonNull Resources resources, @ColorRes int i, @Nullable Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 23 ? resources.getColor(i, theme) : resources.getColor(i);
    }

    @Nullable
    public static ColorStateList getColorStateList(@NonNull Resources resources, @ColorRes int i, @Nullable Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 23 ? resources.getColorStateList(i, theme) : resources.getColorStateList(i);
    }

    @Nullable
    public static Drawable getDrawable(@NonNull Resources resources, @DrawableRes int i, @Nullable Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 21 ? resources.getDrawable(i, theme) : resources.getDrawable(i);
    }

    @Nullable
    public static Drawable getDrawableForDensity(@NonNull Resources resources, @DrawableRes int i, int i2, @Nullable Resources.Theme theme) {
        int i3 = Build.VERSION.SDK_INT;
        return i3 >= 21 ? resources.getDrawableForDensity(i, i2, theme) : i3 >= 15 ? resources.getDrawableForDensity(i, i2) : resources.getDrawable(i);
    }

    @Nullable
    public static Typeface getFont(@NonNull Context context, @FontRes int i) {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i, new TypedValue(), 0, (FontCallback) null, (Handler) null, false);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Typeface getFont(@NonNull Context context, @FontRes int i, TypedValue typedValue, int i2, @Nullable FontCallback fontCallback) {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i, typedValue, i2, fontCallback, (Handler) null, true);
    }

    public static void getFont(@NonNull Context context, @FontRes int i, @NonNull FontCallback fontCallback, @Nullable Handler handler) {
        Preconditions.checkNotNull(fontCallback);
        if (context.isRestricted()) {
            fontCallback.callbackFailAsync(-4, handler);
            return;
        }
        loadFont(context, i, new TypedValue(), 0, fontCallback, handler, false);
    }

    private static Typeface loadFont(@NonNull Context context, int i, TypedValue typedValue, int i2, @Nullable FontCallback fontCallback, @Nullable Handler handler, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface loadFont = loadFont(context, resources, typedValue, i, i2, fontCallback, handler, z);
        if (loadFont != null || fontCallback != null) {
            return loadFont;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface loadFont(@androidx.annotation.NonNull android.content.Context r13, android.content.res.Resources r14, android.util.TypedValue r15, int r16, int r17, @androidx.annotation.Nullable androidx.core.content.res.ResourcesCompat.FontCallback r18, @androidx.annotation.Nullable android.os.Handler r19, boolean r20) {
        /*
            r2 = r14
            r0 = r15
            r3 = r16
            r4 = r17
            r8 = r18
            r9 = r19
            java.lang.CharSequence r1 = r0.string
            if (r1 == 0) goto L_0x008a
            java.lang.String r10 = r1.toString()
            java.lang.String r0 = "res/"
            boolean r0 = r10.startsWith(r0)
            r11 = 0
            r12 = -3
            if (r0 != 0) goto L_0x0022
            if (r8 == 0) goto L_0x0021
            r8.callbackFailAsync(r12, r9)
        L_0x0021:
            return r11
        L_0x0022:
            android.graphics.Typeface r0 = androidx.core.graphics.TypefaceCompat.findFromCache(r14, r3, r4)
            if (r0 == 0) goto L_0x002e
            if (r8 == 0) goto L_0x002d
            r8.callbackSuccessAsync(r0, r9)
        L_0x002d:
            return r0
        L_0x002e:
            java.lang.String r0 = r10.toLowerCase()     // Catch:{ XmlPullParserException -> 0x0074, IOException -> 0x006c }
            java.lang.String r1 = ".xml"
            boolean r0 = r0.endsWith(r1)     // Catch:{ XmlPullParserException -> 0x0074, IOException -> 0x006c }
            if (r0 == 0) goto L_0x005b
            android.content.res.XmlResourceParser r0 = r14.getXml(r3)     // Catch:{ XmlPullParserException -> 0x0074, IOException -> 0x006c }
            androidx.core.content.res.FontResourcesParserCompat$FamilyResourceEntry r1 = androidx.core.content.res.FontResourcesParserCompat.parse(r0, r14)     // Catch:{ XmlPullParserException -> 0x0074, IOException -> 0x006c }
            if (r1 != 0) goto L_0x004a
            if (r8 == 0) goto L_0x0049
            r8.callbackFailAsync(r12, r9)     // Catch:{ XmlPullParserException -> 0x0074, IOException -> 0x006c }
        L_0x0049:
            return r11
        L_0x004a:
            r0 = r13
            r2 = r14
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            android.graphics.Typeface r0 = androidx.core.graphics.TypefaceCompat.createFromResourcesFamilyXml(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch:{ XmlPullParserException -> 0x0074, IOException -> 0x006c }
            return r0
        L_0x005b:
            r0 = r13
            android.graphics.Typeface r0 = androidx.core.graphics.TypefaceCompat.createFromResourcesFontFile(r13, r14, r3, r10, r4)     // Catch:{ XmlPullParserException -> 0x0074, IOException -> 0x006c }
            if (r8 == 0) goto L_0x006b
            if (r0 == 0) goto L_0x0068
            r8.callbackSuccessAsync(r0, r9)     // Catch:{ XmlPullParserException -> 0x0074, IOException -> 0x006c }
            goto L_0x006b
        L_0x0068:
            r8.callbackFailAsync(r12, r9)     // Catch:{ XmlPullParserException -> 0x0074, IOException -> 0x006c }
        L_0x006b:
            return r0
        L_0x006c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to read xml resource "
            goto L_0x007b
        L_0x0074:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to parse xml resource "
        L_0x007b:
            r0.append(r1)
            r0.append(r10)
            r0.toString()
            if (r8 == 0) goto L_0x0089
            r8.callbackFailAsync(r12, r9)
        L_0x0089:
            return r11
        L_0x008a:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Resource \""
            r4.append(r5)
            java.lang.String r2 = r14.getResourceName(r3)
            r4.append(r2)
            java.lang.String r2 = "\" ("
            r4.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r16)
            r4.append(r2)
            java.lang.String r2 = ") is not a Font: "
            r4.append(r2)
            r4.append(r15)
            java.lang.String r0 = r4.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.ResourcesCompat.loadFont(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.res.ResourcesCompat$FontCallback, android.os.Handler, boolean):android.graphics.Typeface");
    }
}
