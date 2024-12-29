package androidx.core.graphics.drawable;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {
    private static final float ADAPTIVE_ICON_INSET_FACTOR = 0.25f;
    private static final int AMBIENT_SHADOW_ALPHA = 30;
    private static final float BLUR_FACTOR = 0.010416667f;
    static final PorterDuff.Mode DEFAULT_TINT_MODE = PorterDuff.Mode.SRC_IN;
    private static final float DEFAULT_VIEW_PORT_SCALE = 0.6666667f;
    private static final String EXTRA_INT1 = "int1";
    private static final String EXTRA_INT2 = "int2";
    private static final String EXTRA_OBJ = "obj";
    private static final String EXTRA_TINT_LIST = "tint_list";
    private static final String EXTRA_TINT_MODE = "tint_mode";
    private static final String EXTRA_TYPE = "type";
    private static final float ICON_DIAMETER_FACTOR = 0.9166667f;
    private static final int KEY_SHADOW_ALPHA = 61;
    private static final float KEY_SHADOW_OFFSET_FACTOR = 0.020833334f;
    private static final String TAG = "IconCompat";
    public static final int TYPE_UNKNOWN = -1;
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public byte[] mData;
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int mInt1;
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int mInt2;
    Object mObj1;
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Parcelable mParcelable;
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public ColorStateList mTintList = null;
    PorterDuff.Mode mTintMode = DEFAULT_TINT_MODE;
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String mTintModeStr;
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int mType;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface IconType {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public IconCompat() {
    }

    private IconCompat(int i) {
        this.mType = i;
    }

    @Nullable
    public static IconCompat createFromBundle(@NonNull Bundle bundle) {
        Object obj;
        int i = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i);
        iconCompat.mInt1 = bundle.getInt(EXTRA_INT1);
        iconCompat.mInt2 = bundle.getInt(EXTRA_INT2);
        if (bundle.containsKey(EXTRA_TINT_LIST)) {
            iconCompat.mTintList = (ColorStateList) bundle.getParcelable(EXTRA_TINT_LIST);
        }
        if (bundle.containsKey(EXTRA_TINT_MODE)) {
            iconCompat.mTintMode = PorterDuff.Mode.valueOf(bundle.getString(EXTRA_TINT_MODE));
        }
        if (!(i == -1 || i == 1)) {
            if (i != 2) {
                if (i == 3) {
                    iconCompat.mObj1 = bundle.getByteArray(EXTRA_OBJ);
                    return iconCompat;
                } else if (i != 4) {
                    if (i != 5) {
                        "Unknown type " + i;
                        return null;
                    }
                }
            }
            obj = bundle.getString(EXTRA_OBJ);
            iconCompat.mObj1 = obj;
            return iconCompat;
        }
        obj = bundle.getParcelable(EXTRA_OBJ);
        iconCompat.mObj1 = obj;
        return iconCompat;
    }

    @RequiresApi(23)
    @Nullable
    public static IconCompat createFromIcon(@NonNull Context context, @NonNull Icon icon) {
        Preconditions.checkNotNull(icon);
        int type = getType(icon);
        if (type == 2) {
            String resPackage = getResPackage(icon);
            try {
                return createWithResource(getResources(context, resPackage), resPackage, getResId(icon));
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else if (type == 4) {
            return createWithContentUri(getUri(icon));
        } else {
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.mObj1 = icon;
            return iconCompat;
        }
    }

    @RequiresApi(23)
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static IconCompat createFromIcon(@NonNull Icon icon) {
        Preconditions.checkNotNull(icon);
        int type = getType(icon);
        if (type == 2) {
            return createWithResource((Resources) null, getResPackage(icon), getResId(icon));
        }
        if (type == 4) {
            return createWithContentUri(getUri(icon));
        }
        IconCompat iconCompat = new IconCompat(-1);
        iconCompat.mObj1 = icon;
        return iconCompat;
    }

    @VisibleForTesting
    static Bitmap createLegacyIconFromAdaptiveIcon(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * DEFAULT_VIEW_PORT_SCALE);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = (float) min;
        float f2 = 0.5f * f;
        float f3 = ICON_DIAMETER_FACTOR * f2;
        if (z) {
            float f4 = BLUR_FACTOR * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * KEY_SHADOW_OFFSET_FACTOR, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) ((-(bitmap.getWidth() - min)) / 2), (float) ((-(bitmap.getHeight() - min)) / 2));
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    public static IconCompat createWithAdaptiveBitmap(Bitmap bitmap) {
        if (bitmap != null) {
            IconCompat iconCompat = new IconCompat(5);
            iconCompat.mObj1 = bitmap;
            return iconCompat;
        }
        throw new IllegalArgumentException("Bitmap must not be null.");
    }

    public static IconCompat createWithBitmap(Bitmap bitmap) {
        if (bitmap != null) {
            IconCompat iconCompat = new IconCompat(1);
            iconCompat.mObj1 = bitmap;
            return iconCompat;
        }
        throw new IllegalArgumentException("Bitmap must not be null.");
    }

    public static IconCompat createWithContentUri(Uri uri) {
        if (uri != null) {
            return createWithContentUri(uri.toString());
        }
        throw new IllegalArgumentException("Uri must not be null.");
    }

    public static IconCompat createWithContentUri(String str) {
        if (str != null) {
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.mObj1 = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Uri must not be null.");
    }

    public static IconCompat createWithData(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            IconCompat iconCompat = new IconCompat(3);
            iconCompat.mObj1 = bArr;
            iconCompat.mInt1 = i;
            iconCompat.mInt2 = i2;
            return iconCompat;
        }
        throw new IllegalArgumentException("Data must not be null.");
    }

    public static IconCompat createWithResource(Context context, @DrawableRes int i) {
        if (context != null) {
            return createWithResource(context.getResources(), context.getPackageName(), i);
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static IconCompat createWithResource(Resources resources, String str, @DrawableRes int i) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        } else if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.mInt1 = i;
            if (resources != null) {
                try {
                    iconCompat.mObj1 = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.mObj1 = str;
            }
            return iconCompat;
        } else {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
    }

    @RequiresApi(23)
    @IdRes
    @DrawableRes
    private static int getResId(@NonNull Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    @RequiresApi(23)
    @Nullable
    private static String getResPackage(@NonNull Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    private static Resources getResources(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            String.format("Unable to find pkg=%s for icon", new Object[]{str});
            return null;
        }
    }

    @RequiresApi(23)
    private static int getType(@NonNull Icon icon) {
        StringBuilder sb;
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException unused) {
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            sb.toString();
            return -1;
        } catch (InvocationTargetException unused2) {
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            sb.toString();
            return -1;
        } catch (NoSuchMethodException unused3) {
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            sb.toString();
            return -1;
        }
    }

    @RequiresApi(23)
    @Nullable
    private static Uri getUri(@NonNull Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable loadDrawableInner(android.content.Context r7) {
        /*
            r6 = this;
            int r0 = r6.mType
            r1 = 1
            if (r0 == r1) goto L_0x00cc
            r2 = 0
            r3 = 0
            r4 = 2
            if (r0 == r4) goto L_0x009b
            r1 = 3
            if (r0 == r1) goto L_0x0085
            r1 = 4
            if (r0 == r1) goto L_0x0027
            r1 = 5
            if (r0 == r1) goto L_0x0015
            goto L_0x00cb
        L_0x0015:
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r7 = r7.getResources()
            java.lang.Object r1 = r6.mObj1
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            android.graphics.Bitmap r1 = createLegacyIconFromAdaptiveIcon(r1, r2)
            r0.<init>(r7, r1)
            return r0
        L_0x0027:
            java.lang.Object r0 = r6.mObj1
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r1 = r0.getScheme()
            java.lang.String r2 = "content"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x005b
            java.lang.String r2 = "file"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0044
            goto L_0x005b
        L_0x0044:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0053 }
            java.io.File r2 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0053 }
            java.lang.Object r4 = r6.mObj1     // Catch:{ FileNotFoundException -> 0x0053 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ FileNotFoundException -> 0x0053 }
            r2.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0053 }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0053 }
            goto L_0x0075
        L_0x0053:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to load image from path: "
            goto L_0x006b
        L_0x005b:
            android.content.ContentResolver r1 = r7.getContentResolver()     // Catch:{ Exception -> 0x0064 }
            java.io.InputStream r1 = r1.openInputStream(r0)     // Catch:{ Exception -> 0x0064 }
            goto L_0x0075
        L_0x0064:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to load image from URI: "
        L_0x006b:
            r1.append(r2)
            r1.append(r0)
            r1.toString()
            r1 = r3
        L_0x0075:
            if (r1 == 0) goto L_0x00cb
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r7 = r7.getResources()
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r1)
            r0.<init>(r7, r1)
            return r0
        L_0x0085:
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r7 = r7.getResources()
            java.lang.Object r1 = r6.mObj1
            byte[] r1 = (byte[]) r1
            int r2 = r6.mInt1
            int r3 = r6.mInt2
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r1, r2, r3)
            r0.<init>(r7, r1)
            return r0
        L_0x009b:
            java.lang.String r0 = r6.getResPackage()
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 == 0) goto L_0x00a9
            java.lang.String r0 = r7.getPackageName()
        L_0x00a9:
            android.content.res.Resources r0 = getResources(r7, r0)
            int r5 = r6.mInt1     // Catch:{ RuntimeException -> 0x00b8 }
            android.content.res.Resources$Theme r7 = r7.getTheme()     // Catch:{ RuntimeException -> 0x00b8 }
            android.graphics.drawable.Drawable r7 = androidx.core.content.res.ResourcesCompat.getDrawable(r0, r5, r7)     // Catch:{ RuntimeException -> 0x00b8 }
            return r7
        L_0x00b8:
            java.lang.Object[] r7 = new java.lang.Object[r4]
            int r0 = r6.mInt1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7[r2] = r0
            java.lang.Object r0 = r6.mObj1
            r7[r1] = r0
            java.lang.String r0 = "Unable to load resource 0x%08x from pkg=%s"
            java.lang.String.format(r0, r7)
        L_0x00cb:
            return r3
        L_0x00cc:
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r7 = r7.getResources()
            java.lang.Object r1 = r6.mObj1
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r0.<init>(r7, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.loadDrawableInner(android.content.Context):android.graphics.drawable.Drawable");
    }

    private static String typeToString(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN" : "BITMAP_MASKABLE" : "URI" : "DATA" : "RESOURCE" : "BITMAP";
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void addToShortcutIntent(@NonNull Intent intent, @Nullable Drawable drawable, @NonNull Context context) {
        Bitmap bitmap;
        checkResource(context);
        int i = this.mType;
        if (i == 1) {
            bitmap = (Bitmap) this.mObj1;
            if (drawable != null) {
                bitmap = bitmap.copy(bitmap.getConfig(), true);
            }
        } else if (i == 2) {
            try {
                Context createPackageContext = context.createPackageContext(getResPackage(), 0);
                if (drawable == null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(createPackageContext, this.mInt1));
                    return;
                }
                Drawable drawable2 = ContextCompat.getDrawable(createPackageContext, this.mInt1);
                if (drawable2.getIntrinsicWidth() > 0) {
                    if (drawable2.getIntrinsicHeight() > 0) {
                        bitmap = Bitmap.createBitmap(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                        drawable2.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                        drawable2.draw(new Canvas(bitmap));
                    }
                }
                int launcherLargeIconSize = ((ActivityManager) createPackageContext.getSystemService("activity")).getLauncherLargeIconSize();
                bitmap = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
                drawable2.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                drawable2.draw(new Canvas(bitmap));
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException("Can't find package " + this.mObj1, e);
            }
        } else if (i == 5) {
            bitmap = createLegacyIconFromAdaptiveIcon((Bitmap) this.mObj1, true);
        } else {
            throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
        }
        if (drawable != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            drawable.setBounds(width / 2, height / 2, width, height);
            drawable.draw(new Canvas(bitmap));
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void checkResource(Context context) {
        if (this.mType == 2) {
            String str = (String) this.mObj1;
            if (str.contains(Constants.COLON_SEPARATOR)) {
                String str2 = str.split(Constants.COLON_SEPARATOR, -1)[1];
                String str3 = str2.split(MiotCloudImpl.COOKIE_PATH, -1)[0];
                String str4 = str2.split(MiotCloudImpl.COOKIE_PATH, -1)[1];
                String str5 = str.split(Constants.COLON_SEPARATOR, -1)[0];
                int identifier = getResources(context, str5).getIdentifier(str4, str3, str5);
                if (this.mInt1 != identifier) {
                    "Id has changed for " + str5 + MiotCloudImpl.COOKIE_PATH + str4;
                    this.mInt1 = identifier;
                }
            }
        }
    }

    @IdRes
    public int getResId() {
        if (this.mType == -1 && Build.VERSION.SDK_INT >= 23) {
            return getResId((Icon) this.mObj1);
        }
        if (this.mType == 2) {
            return this.mInt1;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    @NonNull
    public String getResPackage() {
        if (this.mType == -1 && Build.VERSION.SDK_INT >= 23) {
            return getResPackage((Icon) this.mObj1);
        }
        if (this.mType == 2) {
            return ((String) this.mObj1).split(Constants.COLON_SEPARATOR, -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int getType() {
        return (this.mType != -1 || Build.VERSION.SDK_INT < 23) ? this.mType : getType((Icon) this.mObj1);
    }

    @NonNull
    public Uri getUri() {
        return (this.mType != -1 || Build.VERSION.SDK_INT < 23) ? Uri.parse((String) this.mObj1) : getUri((Icon) this.mObj1);
    }

    public Drawable loadDrawable(Context context) {
        checkResource(context);
        if (Build.VERSION.SDK_INT >= 23) {
            return toIcon().loadDrawable(context);
        }
        Drawable loadDrawableInner = loadDrawableInner(context);
        if (!(loadDrawableInner == null || (this.mTintList == null && this.mTintMode == DEFAULT_TINT_MODE))) {
            loadDrawableInner.mutate();
            DrawableCompat.setTintList(loadDrawableInner, this.mTintList);
            DrawableCompat.setTintMode(loadDrawableInner, this.mTintMode);
        }
        return loadDrawableInner;
    }

    public void onPostParceling() {
        Parcelable parcelable;
        this.mTintMode = PorterDuff.Mode.valueOf(this.mTintModeStr);
        int i = this.mType;
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.mObj1 = this.mData;
                        return;
                    } else if (i != 4) {
                        if (i != 5) {
                            return;
                        }
                    }
                }
                this.mObj1 = new String(this.mData, Charset.forName("UTF-16"));
                return;
            }
            parcelable = this.mParcelable;
            if (parcelable == null) {
                byte[] bArr = this.mData;
                this.mObj1 = bArr;
                this.mType = 3;
                this.mInt1 = 0;
                this.mInt2 = bArr.length;
                return;
            }
        } else {
            parcelable = this.mParcelable;
            if (parcelable == null) {
                throw new IllegalArgumentException("Invalid icon");
            }
        }
        this.mObj1 = parcelable;
    }

    public void onPreParceling(boolean z) {
        this.mTintModeStr = this.mTintMode.name();
        int i = this.mType;
        if (i != -1) {
            if (i != 1) {
                if (i == 2) {
                    this.mData = ((String) this.mObj1).getBytes(Charset.forName("UTF-16"));
                    return;
                } else if (i == 3) {
                    this.mData = (byte[]) this.mObj1;
                    return;
                } else if (i == 4) {
                    this.mData = this.mObj1.toString().getBytes(Charset.forName("UTF-16"));
                    return;
                } else if (i != 5) {
                    return;
                }
            }
            if (z) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ((Bitmap) this.mObj1).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.mData = byteArrayOutputStream.toByteArray();
                return;
            }
        } else if (z) {
            throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
        }
        this.mParcelable = (Parcelable) this.mObj1;
    }

    public IconCompat setTint(@ColorInt int i) {
        return setTintList(ColorStateList.valueOf(i));
    }

    public IconCompat setTintList(ColorStateList colorStateList) {
        this.mTintList = colorStateList;
        return this;
    }

    public IconCompat setTintMode(PorterDuff.Mode mode) {
        this.mTintMode = mode;
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Bundle toBundle() {
        /*
            r4 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            int r1 = r4.mType
            r2 = -1
            java.lang.String r3 = "obj"
            if (r1 == r2) goto L_0x0039
            r2 = 1
            if (r1 == r2) goto L_0x0034
            r2 = 2
            if (r1 == r2) goto L_0x002c
            r2 = 3
            if (r1 == r2) goto L_0x0024
            r2 = 4
            if (r1 == r2) goto L_0x002c
            r2 = 5
            if (r1 != r2) goto L_0x001c
            goto L_0x0034
        L_0x001c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid icon"
            r0.<init>(r1)
            throw r0
        L_0x0024:
            java.lang.Object r1 = r4.mObj1
            byte[] r1 = (byte[]) r1
            r0.putByteArray(r3, r1)
            goto L_0x0040
        L_0x002c:
            java.lang.Object r1 = r4.mObj1
            java.lang.String r1 = (java.lang.String) r1
            r0.putString(r3, r1)
            goto L_0x0040
        L_0x0034:
            java.lang.Object r1 = r4.mObj1
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            goto L_0x003d
        L_0x0039:
            java.lang.Object r1 = r4.mObj1
            android.os.Parcelable r1 = (android.os.Parcelable) r1
        L_0x003d:
            r0.putParcelable(r3, r1)
        L_0x0040:
            int r1 = r4.mType
            java.lang.String r2 = "type"
            r0.putInt(r2, r1)
            int r1 = r4.mInt1
            java.lang.String r2 = "int1"
            r0.putInt(r2, r1)
            int r1 = r4.mInt2
            java.lang.String r2 = "int2"
            r0.putInt(r2, r1)
            android.content.res.ColorStateList r1 = r4.mTintList
            if (r1 == 0) goto L_0x005e
            java.lang.String r2 = "tint_list"
            r0.putParcelable(r2, r1)
        L_0x005e:
            android.graphics.PorterDuff$Mode r1 = r4.mTintMode
            android.graphics.PorterDuff$Mode r2 = DEFAULT_TINT_MODE
            if (r1 == r2) goto L_0x006d
            java.lang.String r1 = r1.name()
            java.lang.String r2 = "tint_mode"
            r0.putString(r2, r1)
        L_0x006d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toBundle():android.os.Bundle");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006b  */
    @androidx.annotation.RequiresApi(23)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Icon toIcon() {
        /*
            r3 = this;
            int r0 = r3.mType
            r1 = -1
            if (r0 == r1) goto L_0x006f
            r1 = 1
            if (r0 == r1) goto L_0x0056
            r1 = 2
            if (r0 == r1) goto L_0x004b
            r1 = 3
            if (r0 == r1) goto L_0x003e
            r1 = 4
            if (r0 == r1) goto L_0x0035
            r1 = 5
            if (r0 != r1) goto L_0x002d
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L_0x0023
            java.lang.Object r0 = r3.mObj1
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r0)
            goto L_0x005e
        L_0x0023:
            java.lang.Object r0 = r3.mObj1
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r1 = 0
            android.graphics.Bitmap r0 = createLegacyIconFromAdaptiveIcon(r0, r1)
            goto L_0x005a
        L_0x002d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown type"
            r0.<init>(r1)
            throw r0
        L_0x0035:
            java.lang.Object r0 = r3.mObj1
            java.lang.String r0 = (java.lang.String) r0
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithContentUri(r0)
            goto L_0x005e
        L_0x003e:
            java.lang.Object r0 = r3.mObj1
            byte[] r0 = (byte[]) r0
            int r1 = r3.mInt1
            int r2 = r3.mInt2
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithData(r0, r1, r2)
            goto L_0x005e
        L_0x004b:
            java.lang.String r0 = r3.getResPackage()
            int r1 = r3.mInt1
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithResource(r0, r1)
            goto L_0x005e
        L_0x0056:
            java.lang.Object r0 = r3.mObj1
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
        L_0x005a:
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithBitmap(r0)
        L_0x005e:
            android.content.res.ColorStateList r1 = r3.mTintList
            if (r1 == 0) goto L_0x0065
            r0.setTintList(r1)
        L_0x0065:
            android.graphics.PorterDuff$Mode r1 = r3.mTintMode
            android.graphics.PorterDuff$Mode r2 = DEFAULT_TINT_MODE
            if (r1 == r2) goto L_0x006e
            r0.setTintMode(r1)
        L_0x006e:
            return r0
        L_0x006f:
            java.lang.Object r0 = r3.mObj1
            android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toIcon():android.graphics.drawable.Icon");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1 != 5) goto L_0x0097;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r4 = this;
            int r0 = r4.mType
            r1 = -1
            if (r0 != r1) goto L_0x000c
            java.lang.Object r0 = r4.mObj1
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x000c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r4.mType
            java.lang.String r1 = typeToString(r1)
            r0.append(r1)
            int r1 = r4.mType
            r2 = 1
            if (r1 == r2) goto L_0x0077
            r3 = 2
            if (r1 == r3) goto L_0x004f
            r2 = 3
            if (r1 == r2) goto L_0x0039
            r2 = 4
            if (r1 == r2) goto L_0x002e
            r2 = 5
            if (r1 == r2) goto L_0x0077
            goto L_0x0097
        L_0x002e:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r4.mObj1
            r0.append(r1)
            goto L_0x0097
        L_0x0039:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r4.mInt1
            r0.append(r1)
            int r1 = r4.mInt2
            if (r1 == 0) goto L_0x0097
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r4.mInt2
            goto L_0x0094
        L_0x004f:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r4.getResPackage()
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            int r3 = r4.getResId()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L_0x0097
        L_0x0077:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r4.mObj1
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r4.mObj1
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
        L_0x0094:
            r0.append(r1)
        L_0x0097:
            android.content.res.ColorStateList r1 = r4.mTintList
            if (r1 == 0) goto L_0x00a5
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r4.mTintList
            r0.append(r1)
        L_0x00a5:
            android.graphics.PorterDuff$Mode r1 = r4.mTintMode
            android.graphics.PorterDuff$Mode r2 = DEFAULT_TINT_MODE
            if (r1 == r2) goto L_0x00b5
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r4.mTintMode
            r0.append(r1)
        L_0x00b5:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }
}
