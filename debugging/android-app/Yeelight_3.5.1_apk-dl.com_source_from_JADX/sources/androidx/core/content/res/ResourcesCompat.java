package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.annotation.AnyRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.FontRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.WeakHashMap;

public final class ResourcesCompat {
    @AnyRes
    public static final int ID_NULL = 0;
    private static final String TAG = "ResourcesCompat";
    private static final Object sColorStateCacheLock = new Object();
    @GuardedBy("sColorStateCacheLock")
    private static final WeakHashMap<ColorStateListCacheKey, SparseArray<ColorStateListCacheEntry>> sColorStateCaches = new WeakHashMap<>(0);
    private static final ThreadLocal<TypedValue> sTempTypedValue = new ThreadLocal<>();

    @RequiresApi(15)
    static class Api15Impl {
        private Api15Impl() {
        }

        @DoNotInline
        static Drawable getDrawableForDensity(Resources resources, int i, int i2) {
            return resources.getDrawableForDensity(i, i2);
        }
    }

    @RequiresApi(21)
    static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        static Drawable getDrawable(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }

        @DoNotInline
        static Drawable getDrawableForDensity(Resources resources, int i, int i2, Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
    }

    @RequiresApi(23)
    static class Api23Impl {
        private Api23Impl() {
        }

        @DoNotInline
        static int getColor(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }

        @DoNotInline
        @NonNull
        static ColorStateList getColorStateList(@NonNull Resources resources, @ColorRes int i, @Nullable Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    @RequiresApi(29)
    static class Api29Impl {
        private Api29Impl() {
        }

        @DoNotInline
        static float getFloat(@NonNull Resources resources, @DimenRes int i) {
            return resources.getFloat(i);
        }
    }

    private static class ColorStateListCacheEntry {
        final Configuration mConfiguration;
        final int mThemeHash;
        final ColorStateList mValue;

        ColorStateListCacheEntry(@NonNull ColorStateList colorStateList, @NonNull Configuration configuration, @Nullable Resources.Theme theme) {
            this.mValue = colorStateList;
            this.mConfiguration = configuration;
            this.mThemeHash = theme == null ? 0 : theme.hashCode();
        }
    }

    private static final class ColorStateListCacheKey {
        final Resources mResources;
        final Resources.Theme mTheme;

        ColorStateListCacheKey(@NonNull Resources resources, @Nullable Resources.Theme theme) {
            this.mResources = resources;
            this.mTheme = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ColorStateListCacheKey.class != obj.getClass()) {
                return false;
            }
            ColorStateListCacheKey colorStateListCacheKey = (ColorStateListCacheKey) obj;
            return this.mResources.equals(colorStateListCacheKey.mResources) && ObjectsCompat.equals(this.mTheme, colorStateListCacheKey.mTheme);
        }

        public int hashCode() {
            return ObjectsCompat.hash(this.mResources, this.mTheme);
        }
    }

    public static abstract class FontCallback {
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public static Handler getHandler(@Nullable Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final void callbackFailAsync(int i, @Nullable Handler handler) {
            getHandler(handler).post(new C0242a(this, i));
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final void callbackSuccessAsync(@NonNull Typeface typeface, @Nullable Handler handler) {
            getHandler(handler).post(new C0243b(this, typeface));
        }

        /* renamed from: onFontRetrievalFailed */
        public abstract void lambda$callbackFailAsync$1(int i);

        /* renamed from: onFontRetrieved */
        public abstract void lambda$callbackSuccessAsync$0(@NonNull Typeface typeface);
    }

    public static final class ThemeCompat {

        @RequiresApi(23)
        static class Api23Impl {
            private static Method sRebaseMethod;
            private static boolean sRebaseMethodFetched;
            private static final Object sRebaseMethodLock = new Object();

            private Api23Impl() {
            }

            /* JADX WARNING: Can't wrap try/catch for region: R(5:6|7|8|9|10) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0018 */
            @android.annotation.SuppressLint({"BanUncheckedReflection"})
            /* Code decompiled incorrectly, please refer to instructions dump. */
            static void rebase(@androidx.annotation.NonNull android.content.res.Resources.Theme r6) {
                /*
                    java.lang.Object r0 = sRebaseMethodLock
                    monitor-enter(r0)
                    boolean r1 = sRebaseMethodFetched     // Catch:{ all -> 0x0029 }
                    r2 = 0
                    if (r1 != 0) goto L_0x001a
                    r1 = 1
                    java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
                    java.lang.String r4 = "rebase"
                    java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0018 }
                    java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x0018 }
                    sRebaseMethod = r3     // Catch:{ NoSuchMethodException -> 0x0018 }
                    r3.setAccessible(r1)     // Catch:{ NoSuchMethodException -> 0x0018 }
                L_0x0018:
                    sRebaseMethodFetched = r1     // Catch:{ all -> 0x0029 }
                L_0x001a:
                    java.lang.reflect.Method r1 = sRebaseMethod     // Catch:{ all -> 0x0029 }
                    if (r1 == 0) goto L_0x0027
                    java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0024 }
                    r1.invoke(r6, r2)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0024 }
                    goto L_0x0027
                L_0x0024:
                    r6 = 0
                    sRebaseMethod = r6     // Catch:{ all -> 0x0029 }
                L_0x0027:
                    monitor-exit(r0)     // Catch:{ all -> 0x0029 }
                    return
                L_0x0029:
                    r6 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0029 }
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.rebase(android.content.res.Resources$Theme):void");
            }
        }

        @RequiresApi(29)
        static class Api29Impl {
            private Api29Impl() {
            }

            @DoNotInline
            static void rebase(@NonNull Resources.Theme theme) {
                theme.rebase();
            }
        }

        private ThemeCompat() {
        }

        public static void rebase(@NonNull Resources.Theme theme) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                Api29Impl.rebase(theme);
            } else if (i >= 23) {
                Api23Impl.rebase(theme);
            }
        }
    }

    private ResourcesCompat() {
    }

    private static void addColorStateListToCache(@NonNull ColorStateListCacheKey colorStateListCacheKey, @ColorRes int i, @NonNull ColorStateList colorStateList, @Nullable Resources.Theme theme) {
        synchronized (sColorStateCacheLock) {
            WeakHashMap<ColorStateListCacheKey, SparseArray<ColorStateListCacheEntry>> weakHashMap = sColorStateCaches;
            SparseArray sparseArray = weakHashMap.get(colorStateListCacheKey);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(colorStateListCacheKey, sparseArray);
            }
            sparseArray.append(i, new ColorStateListCacheEntry(colorStateList, colorStateListCacheKey.mResources.getConfiguration(), theme));
        }
    }

    public static void clearCachesForTheme(@NonNull Resources.Theme theme) {
        synchronized (sColorStateCacheLock) {
            Iterator<ColorStateListCacheKey> it = sColorStateCaches.keySet().iterator();
            while (it.hasNext()) {
                ColorStateListCacheKey next = it.next();
                if (next != null && theme.equals(next.mTheme)) {
                    it.remove();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        return null;
     */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList getCachedColorStateList(@androidx.annotation.NonNull androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey r5, @androidx.annotation.ColorRes int r6) {
        /*
            java.lang.Object r0 = sColorStateCacheLock
            monitor-enter(r0)
            java.util.WeakHashMap<androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey, android.util.SparseArray<androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry>> r1 = sColorStateCaches     // Catch:{ all -> 0x0045 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0045 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0042
            int r2 = r1.size()     // Catch:{ all -> 0x0045 }
            if (r2 <= 0) goto L_0x0042
            java.lang.Object r2 = r1.get(r6)     // Catch:{ all -> 0x0045 }
            androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry r2 = (androidx.core.content.res.ResourcesCompat.ColorStateListCacheEntry) r2     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0042
            android.content.res.Configuration r3 = r2.mConfiguration     // Catch:{ all -> 0x0045 }
            android.content.res.Resources r4 = r5.mResources     // Catch:{ all -> 0x0045 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0045 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0045 }
            if (r3 == 0) goto L_0x003f
            android.content.res.Resources$Theme r5 = r5.mTheme     // Catch:{ all -> 0x0045 }
            if (r5 != 0) goto L_0x0031
            int r3 = r2.mThemeHash     // Catch:{ all -> 0x0045 }
            if (r3 == 0) goto L_0x003b
        L_0x0031:
            if (r5 == 0) goto L_0x003f
            int r3 = r2.mThemeHash     // Catch:{ all -> 0x0045 }
            int r5 = r5.hashCode()     // Catch:{ all -> 0x0045 }
            if (r3 != r5) goto L_0x003f
        L_0x003b:
            android.content.res.ColorStateList r5 = r2.mValue     // Catch:{ all -> 0x0045 }
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return r5
        L_0x003f:
            r1.remove(r6)     // Catch:{ all -> 0x0045 }
        L_0x0042:
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            r5 = 0
            return r5
        L_0x0045:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.ResourcesCompat.getCachedColorStateList(androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey, int):android.content.res.ColorStateList");
    }

    @Nullable
    public static Typeface getCachedFont(@NonNull Context context, @FontRes int i) {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i, new TypedValue(), 0, (FontCallback) null, (Handler) null, false, true);
    }

    @ColorInt
    public static int getColor(@NonNull Resources resources, @ColorRes int i, @Nullable Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 23 ? Api23Impl.getColor(resources, i, theme) : resources.getColor(i);
    }

    @Nullable
    public static ColorStateList getColorStateList(@NonNull Resources resources, @ColorRes int i, @Nullable Resources.Theme theme) {
        ColorStateListCacheKey colorStateListCacheKey = new ColorStateListCacheKey(resources, theme);
        ColorStateList cachedColorStateList = getCachedColorStateList(colorStateListCacheKey, i);
        if (cachedColorStateList != null) {
            return cachedColorStateList;
        }
        ColorStateList inflateColorStateList = inflateColorStateList(resources, i, theme);
        if (inflateColorStateList == null) {
            return Build.VERSION.SDK_INT >= 23 ? Api23Impl.getColorStateList(resources, i, theme) : resources.getColorStateList(i);
        }
        addColorStateListToCache(colorStateListCacheKey, i, inflateColorStateList, theme);
        return inflateColorStateList;
    }

    @Nullable
    public static Drawable getDrawable(@NonNull Resources resources, @DrawableRes int i, @Nullable Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 21 ? Api21Impl.getDrawable(resources, i, theme) : resources.getDrawable(i);
    }

    @Nullable
    public static Drawable getDrawableForDensity(@NonNull Resources resources, @DrawableRes int i, int i2, @Nullable Resources.Theme theme) {
        int i3 = Build.VERSION.SDK_INT;
        return i3 >= 21 ? Api21Impl.getDrawableForDensity(resources, i, i2, theme) : i3 >= 15 ? Api15Impl.getDrawableForDensity(resources, i, i2) : resources.getDrawable(i);
    }

    public static float getFloat(@NonNull Resources resources, @DimenRes int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return Api29Impl.getFloat(resources, i);
        }
        TypedValue typedValue = getTypedValue();
        resources.getValue(i, typedValue, true);
        if (typedValue.type == 4) {
            return typedValue.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i) + " type #0x" + Integer.toHexString(typedValue.type) + " is not valid");
    }

    @Nullable
    public static Typeface getFont(@NonNull Context context, @FontRes int i) {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i, new TypedValue(), 0, (FontCallback) null, (Handler) null, false, false);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Typeface getFont(@NonNull Context context, @FontRes int i, @NonNull TypedValue typedValue, int i2, @Nullable FontCallback fontCallback) {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i, typedValue, i2, fontCallback, (Handler) null, true, false);
    }

    public static void getFont(@NonNull Context context, @FontRes int i, @NonNull FontCallback fontCallback, @Nullable Handler handler) {
        Preconditions.checkNotNull(fontCallback);
        if (context.isRestricted()) {
            fontCallback.callbackFailAsync(-4, handler);
            return;
        }
        loadFont(context, i, new TypedValue(), 0, fontCallback, handler, false, false);
    }

    @NonNull
    private static TypedValue getTypedValue() {
        ThreadLocal<TypedValue> threadLocal = sTempTypedValue;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    @Nullable
    private static ColorStateList inflateColorStateList(Resources resources, int i, @Nullable Resources.Theme theme) {
        if (isColorInt(resources, i)) {
            return null;
        }
        try {
            return ColorStateListInflaterCompat.createFromXml(resources, resources.getXml(i), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean isColorInt(@NonNull Resources resources, @ColorRes int i) {
        TypedValue typedValue = getTypedValue();
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        return i2 >= 28 && i2 <= 31;
    }

    private static Typeface loadFont(@NonNull Context context, int i, @NonNull TypedValue typedValue, int i2, @Nullable FontCallback fontCallback, @Nullable Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        int i3 = i;
        resources.getValue(i, typedValue, true);
        Typeface loadFont = loadFont(context, resources, typedValue, i, i2, fontCallback, handler, z, z2);
        if (loadFont != null || fontCallback != null || z2) {
            return loadFont;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface loadFont(@androidx.annotation.NonNull android.content.Context r15, android.content.res.Resources r16, @androidx.annotation.NonNull android.util.TypedValue r17, int r18, int r19, @androidx.annotation.Nullable androidx.core.content.res.ResourcesCompat.FontCallback r20, @androidx.annotation.Nullable android.os.Handler r21, boolean r22, boolean r23) {
        /*
            r2 = r16
            r0 = r17
            r3 = r18
            r10 = r20
            r11 = r21
            java.lang.CharSequence r1 = r0.string
            if (r1 == 0) goto L_0x009b
            java.lang.String r12 = r1.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r12.startsWith(r1)
            r13 = -3
            r14 = 0
            if (r1 != 0) goto L_0x0022
            if (r10 == 0) goto L_0x0021
            r10.callbackFailAsync(r13, r11)
        L_0x0021:
            return r14
        L_0x0022:
            int r1 = r0.assetCookie
            r6 = r19
            android.graphics.Typeface r1 = androidx.core.graphics.TypefaceCompat.findFromCache(r2, r3, r12, r1, r6)
            if (r1 == 0) goto L_0x0032
            if (r10 == 0) goto L_0x0031
            r10.callbackSuccessAsync(r1, r11)
        L_0x0031:
            return r1
        L_0x0032:
            if (r23 == 0) goto L_0x0035
            return r14
        L_0x0035:
            java.lang.String r1 = r12.toLowerCase()     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0080 }
            java.lang.String r4 = ".xml"
            boolean r1 = r1.endsWith(r4)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0080 }
            if (r1 == 0) goto L_0x0066
            android.content.res.XmlResourceParser r1 = r2.getXml(r3)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0080 }
            androidx.core.content.res.FontResourcesParserCompat$FamilyResourceEntry r1 = androidx.core.content.res.FontResourcesParserCompat.parse(r1, r2)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0080 }
            if (r1 != 0) goto L_0x0051
            if (r10 == 0) goto L_0x0050
            r10.callbackFailAsync(r13, r11)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0080 }
        L_0x0050:
            return r14
        L_0x0051:
            int r5 = r0.assetCookie     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0080 }
            r0 = r15
            r2 = r16
            r3 = r18
            r4 = r12
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            android.graphics.Typeface r0 = androidx.core.graphics.TypefaceCompat.createFromResourcesFamilyXml(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0080 }
            return r0
        L_0x0066:
            int r4 = r0.assetCookie     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0080 }
            r0 = r15
            r1 = r16
            r2 = r18
            r3 = r12
            r5 = r19
            android.graphics.Typeface r0 = androidx.core.graphics.TypefaceCompat.createFromResourcesFontFile(r0, r1, r2, r3, r4, r5)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0080 }
            if (r10 == 0) goto L_0x007f
            if (r0 == 0) goto L_0x007c
            r10.callbackSuccessAsync(r0, r11)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0080 }
            goto L_0x007f
        L_0x007c:
            r10.callbackFailAsync(r13, r11)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0080 }
        L_0x007f:
            return r0
        L_0x0080:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to read xml resource "
            goto L_0x008f
        L_0x0088:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to parse xml resource "
        L_0x008f:
            r0.append(r1)
            r0.append(r12)
            if (r10 == 0) goto L_0x009a
            r10.callbackFailAsync(r13, r11)
        L_0x009a:
            return r14
        L_0x009b:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Resource \""
            r4.append(r5)
            java.lang.String r2 = r2.getResourceName(r3)
            r4.append(r2)
            java.lang.String r2 = "\" ("
            r4.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r18)
            r4.append(r2)
            java.lang.String r2 = ") is not a Font: "
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.ResourcesCompat.loadFont(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.res.ResourcesCompat$FontCallback, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
