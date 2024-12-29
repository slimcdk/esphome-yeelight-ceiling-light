package com.google.p107ar.sceneform.utilities;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.net.http.HttpResponseCache;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: com.google.ar.sceneform.utilities.LoadHelper */
public class LoadHelper {
    private static final String ANDROID_ASSET = "/android_asset/";
    private static final long DEFAULT_CACHE_SIZE_BYTES = 536870912;
    private static final String DRAWABLE_RESOURCE_TYPE = "drawable";
    public static final int INVALID_RESOURCE_IDENTIFIER = 0;
    private static final String RAW_RESOURCE_TYPE = "raw";
    private static final char SLASH_DELIMETER = '/';
    private static final String TAG = "com.google.ar.sceneform.utilities.LoadHelper";

    private LoadHelper() {
    }

    private static Callable<InputStream> androidResourceUriToInputStreamCreator(Context context, Uri uri) {
        String path = uri.getPath();
        String substring = path.substring(1, path.lastIndexOf(47));
        if (substring.equals(RAW_RESOURCE_TYPE) || substring.equals(DRAWABLE_RESOURCE_TYPE)) {
            return new C2785b(context, uri);
        }
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 71 + String.valueOf(valueOf).length());
        sb.append("Unknown resource resourceType '");
        sb.append(substring);
        sb.append("' in uri '");
        sb.append(valueOf);
        sb.append("'. Resource will not be loaded");
        throw new IllegalArgumentException(sb.toString());
    }

    private static boolean assetExists(AssetManager assetManager, String str) {
        String[] strArr;
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf != -1) {
            String substring = str.substring(lastIndexOf + 1);
            strArr = assetManager.list(str.substring(0, lastIndexOf));
            str = substring;
        } else {
            strArr = assetManager.list("");
        }
        if (strArr != null) {
            for (String equals : strArr) {
                if (str.equals(equals)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void enableCaching(long j, File file, String str) {
        if (HttpResponseCache.getInstalled() == null) {
            try {
                File file2 = new File(file, str);
                if (Build.VERSION.SDK_INT >= 14) {
                    HttpResponseCache.install(file2, j);
                }
            } catch (IOException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
                sb.append("HTTP response cache installation failed:");
                sb.append(valueOf);
                sb.toString();
            }
        }
    }

    public static void enableCaching(Context context) {
        enableCaching(DEFAULT_CACHE_SIZE_BYTES, context.getCacheDir(), "http_cache");
    }

    private static Callable<InputStream> fileUriToInputStreamCreator(Context context, Uri uri) {
        String str;
        AssetManager assets = context.getAssets();
        if (uri.getAuthority() == null) {
            str = uri.getPath();
        } else if (uri.getPath().isEmpty()) {
            str = uri.getAuthority();
        } else {
            String valueOf = String.valueOf(uri.getAuthority());
            String valueOf2 = String.valueOf(uri.getPath());
            str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        return new C2786c(assets, removeAndroidAssetPath(str), str);
    }

    public static void flushHttpCache() {
        HttpResponseCache installed = HttpResponseCache.getInstalled();
        if (installed != null) {
            installed.flush();
        }
    }

    public static Callable<InputStream> fromResource(Context context, int i) {
        Preconditions.checkNotNull(context, "Parameter \"context\" was null.");
        String resourceTypeName = context.getResources().getResourceTypeName(i);
        if (resourceTypeName.equals(RAW_RESOURCE_TYPE) || resourceTypeName.equals(DRAWABLE_RESOURCE_TYPE)) {
            return new C2784a(context, i);
        }
        String resourceName = context.getResources().getResourceName(i);
        StringBuilder sb = new StringBuilder(String.valueOf(resourceTypeName).length() + 73 + String.valueOf(resourceName).length());
        sb.append("Unknown resource resourceType '");
        sb.append(resourceTypeName);
        sb.append("' in resId '");
        sb.append(resourceName);
        sb.append("'. Resource will not be loaded");
        throw new IllegalArgumentException(sb.toString());
    }

    public static Callable<InputStream> fromUri(Context context, Uri uri) {
        return fromUri(context, uri, (Map<String, String>) null);
    }

    public static Callable<InputStream> fromUri(Context context, Uri uri, @Nullable Map<String, String> map) {
        Preconditions.checkNotNull(uri, "Parameter \"sourceUri\" was null.");
        Preconditions.checkNotNull(context, "Parameter \"context\" was null.");
        return isFileAsset(uri).booleanValue() ? fileUriToInputStreamCreator(context, uri) : isAndroidResource(uri).booleanValue() ? androidResourceUriToInputStreamCreator(context, uri) : remoteUriToInputStreamCreator(uri, map);
    }

    public static Boolean isAndroidResource(Uri uri) {
        Preconditions.checkNotNull(uri, "Parameter \"sourceUri\" was null.");
        return Boolean.valueOf(TextUtils.equals("android.resource", uri.getScheme()));
    }

    public static Boolean isFileAsset(Uri uri) {
        Preconditions.checkNotNull(uri, "Parameter \"sourceUri\" was null.");
        String scheme = uri.getScheme();
        return Boolean.valueOf(TextUtils.isEmpty(scheme) || Objects.equals("file", scheme));
    }

    static final /* synthetic */ InputStream lambda$fileUriToInputStreamCreator$1$LoadHelper(AssetManager assetManager, String str, String str2) {
        return assetExists(assetManager, str) ? assetManager.open(str) : new FileInputStream(new File(str2));
    }

    public static int rawResourceNameToIdentifier(Context context, String str) {
        return context.getResources().getIdentifier(str, RAW_RESOURCE_TYPE, context.getPackageName());
    }

    private static Callable<InputStream> remoteUriToInputStreamCreator(Uri uri, @Nullable Map<String, String> map) {
        try {
            URLConnection openConnection = new URL(uri.toString()).openConnection();
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    openConnection.addRequestProperty((String) next.getKey(), (String) next.getValue());
                }
            }
            return new C2787d(openConnection);
        } catch (MalformedURLException e) {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Unable to parse url: '");
            sb.append(valueOf);
            sb.append("'");
            throw new IllegalArgumentException(sb.toString(), e);
        } catch (IOException e2) {
            String valueOf2 = String.valueOf(uri);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
            sb2.append("Error opening url connection: '");
            sb2.append(valueOf2);
            sb2.append("'");
            throw new AssertionError(sb2.toString(), e2);
        }
    }

    private static String removeAndroidAssetPath(String str) {
        return str.startsWith(ANDROID_ASSET) ? str.substring(15) : str;
    }

    private static Uri resolve(Uri uri, Uri uri2) {
        try {
            return Uri.parse(new URI(uri.toString()).resolve(new URI(uri2.toString())).toString());
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Unable to parse Uri.", e);
        }
    }

    public static Uri resolveUri(Uri uri, @Nullable Uri uri2) {
        return uri2 == null ? uri : resolve(uri2, uri);
    }

    public static Uri resourceToUri(Context context, int i) {
        Resources resources = context.getResources();
        return new Uri.Builder().scheme("android.resource").authority(resources.getResourcePackageName(i)).appendPath(resources.getResourceTypeName(i)).appendPath(resources.getResourceEntryName(i)).build();
    }
}
