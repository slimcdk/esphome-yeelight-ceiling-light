package com.xiaomi.account.openauth;

import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.xiaomi.account.auth.AuthorizeApi;
import com.xiaomi.account.auth.OAuthConfig;
import com.xiaomi.account.auth.OAuthFactory;
import com.xiaomi.account.auth.XiaomiOAuthFutureImpl;
import com.xiaomi.account.openauth.internal.MiAccountPhoneInfo;
import com.xiaomi.phonenum.PhoneNumKeeper;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class XiaomiOAuthorize {
    /* access modifiers changed from: private */
    public static final Class<? extends AuthorizeActivityBase> DEFAULT_AUTHORIZE_ACTIVITY_CLASS = AuthorizeActivity.class;
    private static final String TAG = "XiaomiOAuthorize";
    public static final String TYPE_CODE = "code";
    public static final String TYPE_TOKEN = "token";
    /* access modifiers changed from: private */
    public OAuthConfig.Builder mConfigBuilder = new OAuthConfig.Builder();

    private XiaomiOAuthFuture<XiaomiOAuthResults> oauth(Activity activity) {
        if (this.mConfigBuilder.getContext() == null) {
            if (activity != null) {
                this.mConfigBuilder.context(activity.getApplicationContext());
            } else {
                throw new IllegalArgumentException("please set Context or Activity!!!");
            }
        }
        final WeakReference weakReference = new WeakReference(activity);
        XiaomiOAuthFutureImpl xiaomiOAuthFutureImpl = new XiaomiOAuthFutureImpl(new Callable<XiaomiOAuthResults>() {
            public XiaomiOAuthResults call() {
                OAuthConfig build = new OAuthConfig.Builder(XiaomiOAuthorize.this.mConfigBuilder).build();
                return OAuthFactory.createOAuth(build).startOAuth((Activity) weakReference.get(), build);
            }
        });
        AsyncTask.THREAD_POOL_EXECUTOR.execute(xiaomiOAuthFutureImpl);
        return xiaomiOAuthFutureImpl;
    }

    @Deprecated
    private static int[] scopeStringToIntArray(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            for (String valueOf : str.split(" ")) {
                try {
                    arrayList.add(Integer.valueOf(valueOf));
                } catch (NumberFormatException unused) {
                }
            }
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        return iArr;
    }

    @Deprecated
    public static void startGetAccessToken(Activity activity, long j, String str, Bundle bundle, int i) {
        startGetOAuthorize(activity, j, str, "token", bundle, i);
    }

    @Deprecated
    public static void startGetOAuthCode(Activity activity, long j, String str, Bundle bundle, int i) {
        startGetOAuthorize(activity, j, str, "code", bundle, i);
    }

    @Deprecated
    private static void startGetOAuthorize(final Activity activity, long j, String str, final String str2, Bundle bundle, final int i) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        XiaomiOAuthorize state = new XiaomiOAuthorize().setAppId(j).setRedirectUrl(str).setScope(scopeStringToIntArray(bundle.getString(XiaomiOAuthConstants.EXTRA_SCOPE))).setState(bundle.getString(XiaomiOAuthConstants.EXTRA_STATE));
        if (bundle.containsKey(XiaomiOAuthConstants.EXTRA_SKIP_CONFIRM)) {
            state.setSkipConfirm(bundle.getBoolean(XiaomiOAuthConstants.EXTRA_SKIP_CONFIRM));
        }
        final XiaomiOAuthFuture<XiaomiOAuthResults> startGetOAuthCode = "code".equalsIgnoreCase(str2) ? state.startGetOAuthCode(activity) : state.startGetAccessToken(activity);
        new AsyncTask<Void, Void, XiaomiOAuthResults>() {

            /* renamed from: e */
            Exception f7350e;

            /* access modifiers changed from: protected */
            public XiaomiOAuthResults doInBackground(Void... voidArr) {
                try {
                    return (XiaomiOAuthResults) startGetOAuthCode.getResult();
                } catch (OperationCanceledException e) {
                    e.printStackTrace();
                    return null;
                } catch (XMAuthericationException | IOException e2) {
                    this.f7350e = e2;
                    return null;
                }
            }

            /* access modifiers changed from: protected */
            public void onPostExecute(XiaomiOAuthResults xiaomiOAuthResults) {
                int i;
                String str;
                String str2;
                Bundle bundle = new Bundle();
                if (xiaomiOAuthResults == null) {
                    if (this.f7350e == null) {
                        i = AuthorizeActivityBase.RESULT_CANCEL;
                        bundle.putInt(XiaomiOAuthConstants.EXTRA_ERROR_CODE_2, i);
                        str2 = "canceled";
                    } else {
                        i = AuthorizeActivityBase.RESULT_FAIL;
                        bundle.putInt(XiaomiOAuthConstants.EXTRA_ERROR_CODE_2, i);
                        str2 = this.f7350e.getMessage();
                    }
                    bundle.putString(XiaomiOAuthConstants.EXTRA_ERROR_DESCRIPTION_2, str2);
                } else if (xiaomiOAuthResults.hasError()) {
                    int i2 = AuthorizeActivityBase.RESULT_FAIL;
                    bundle.putInt(XiaomiOAuthConstants.EXTRA_ERROR_CODE_2, xiaomiOAuthResults.getErrorCode());
                    bundle.putString(XiaomiOAuthConstants.EXTRA_ERROR_DESCRIPTION_2, xiaomiOAuthResults.getErrorMessage());
                    i = i2;
                } else {
                    int i3 = AuthorizeActivityBase.RESULT_SUCCESS;
                    String str3 = "code";
                    if (str3.equalsIgnoreCase(str2)) {
                        str = xiaomiOAuthResults.getCode();
                    } else {
                        bundle.putString(XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2, xiaomiOAuthResults.getAccessToken());
                        bundle.putString(XiaomiOAuthConstants.EXTRA_EXPIRES_IN_2, xiaomiOAuthResults.getExpiresIn());
                        str = xiaomiOAuthResults.getScopes();
                        str3 = XiaomiOAuthConstants.EXTRA_SCOPE_2;
                    }
                    bundle.putString(str3, str);
                    bundle.putString("state", xiaomiOAuthResults.getState());
                    bundle.putString(XiaomiOAuthConstants.EXTRA_TOKEN_TYPE_2, xiaomiOAuthResults.getTokenType());
                    bundle.putString(XiaomiOAuthConstants.EXTRA_MAC_KEY_2, xiaomiOAuthResults.getMacKey());
                    bundle.putString(XiaomiOAuthConstants.EXTRA_MAC_ALGORITHM_2, xiaomiOAuthResults.getMacAlgorithm());
                    i = i3;
                }
                Activity activity = activity;
                activity.startActivityForResult(AuthorizeActivityBase.asMiddleActivity((Context) activity, i, bundle, (Class<? extends AuthorizeActivityBase>) XiaomiOAuthorize.DEFAULT_AUTHORIZE_ACTIVITY_CLASS), i);
            }
        }.execute(new Void[0]);
    }

    public XiaomiOAuthFuture<String> callOpenApi(Context context, long j, String str, String str2, String str3, String str4) {
        final Context context2 = context;
        final String str5 = str;
        final long j2 = j;
        final String str6 = str2;
        final String str7 = str3;
        final String str8 = str4;
        final FutureTask futureTask = new FutureTask(new Callable<String>() {
            public String call() {
                return AuthorizeApi.doHttpGet(context2, str5, j2, str6, str7, str8);
            }
        });
        AsyncTask.THREAD_POOL_EXECUTOR.execute(futureTask);
        return new XiaomiOAuthFuture<String>() {
            public String getResult() {
                try {
                    return (String) futureTask.get();
                } catch (InterruptedException e) {
                    throw new XMAuthericationException((Throwable) e);
                } catch (ExecutionException e2) {
                    throw new XMAuthericationException(e2.getCause());
                }
            }

            public String getResult(long j, TimeUnit timeUnit) {
                try {
                    return (String) futureTask.get(j, timeUnit);
                } catch (InterruptedException e) {
                    throw new XMAuthericationException((Throwable) e);
                } catch (ExecutionException e2) {
                    throw new XMAuthericationException(e2.getCause());
                } catch (TimeoutException e3) {
                    throw new XMAuthericationException((Throwable) e3);
                }
            }
        };
    }

    public XiaomiOAuthFuture<XiaomiOAuthResults> fastOAuth(Activity activity, @NonNull String str) {
        this.mConfigBuilder.fastOAuth(true);
        this.mConfigBuilder.responseType(str);
        return oauth(activity);
    }

    public XiaomiOAuthorize setAccountAuth(AccountAuth accountAuth) {
        this.mConfigBuilder.accountAuth(accountAuth);
        return this;
    }

    public XiaomiOAuthorize setAppId(long j) {
        this.mConfigBuilder.appId(j);
        return this;
    }

    public XiaomiOAuthorize setContext(Context context) {
        this.mConfigBuilder.context(context);
        return this;
    }

    public XiaomiOAuthorize setCustomizedAuthorizeActivityClass(Class<? extends AuthorizeActivityBase> cls) {
        this.mConfigBuilder.authorizeActivityClazz(cls);
        return this;
    }

    public XiaomiOAuthorize setDeviceID(String str) {
        this.mConfigBuilder.deviceID(str);
        return this;
    }

    public XiaomiOAuthorize setDisplay(String str) {
        this.mConfigBuilder.display(str);
        return this;
    }

    public XiaomiOAuthorize setHideSwitch(boolean z) {
        this.mConfigBuilder.hideSwitch(z);
        return this;
    }

    public XiaomiOAuthorize setKeepCookies(boolean z) {
        this.mConfigBuilder.keepCookies(z);
        return this;
    }

    public XiaomiOAuthorize setLoginType(String str) {
        this.mConfigBuilder.loginType(str);
        return this;
    }

    public XiaomiOAuthorize setNoMiui(boolean z) {
        this.mConfigBuilder.notUseMiui(z);
        return this;
    }

    public XiaomiOAuthorize setPhoneNumAutoFill(Context context, boolean z) {
        return setPhoneNumAutoFill(context, z, 2000);
    }

    public XiaomiOAuthorize setPhoneNumAutoFill(Context context, boolean z, long j) {
        if (z) {
            Class<PhoneNumKeeper> cls = PhoneNumKeeper.class;
            try {
                this.mConfigBuilder.phoneInfo(new MiAccountPhoneInfo(context, j));
            } catch (NoClassDefFoundError unused) {
            }
        }
        return this;
    }

    public XiaomiOAuthorize setPlatform(int i) {
        this.mConfigBuilder.platform(i);
        return this;
    }

    public XiaomiOAuthorize setRedirectUrl(String str) {
        this.mConfigBuilder.redirectUrl(str);
        return this;
    }

    public XiaomiOAuthorize setScope(int[] iArr) {
        this.mConfigBuilder.scopes(iArr);
        return this;
    }

    public XiaomiOAuthorize setSkipConfirm(boolean z) {
        this.mConfigBuilder.skipConfirm(z);
        return this;
    }

    public XiaomiOAuthorize setState(String str) {
        this.mConfigBuilder.state(str);
        return this;
    }

    public XiaomiOAuthorize setUseSystemAccountLogin(boolean z) {
        this.mConfigBuilder.useSystemAccountLogin(z);
        return this;
    }

    public XiaomiOAuthFuture<XiaomiOAuthResults> startGetAccessToken(Activity activity) {
        this.mConfigBuilder.responseType("token");
        return oauth(activity);
    }

    public XiaomiOAuthFuture<XiaomiOAuthResults> startGetOAuthCode(Activity activity) {
        this.mConfigBuilder.responseType("code");
        return oauth(activity);
    }
}
