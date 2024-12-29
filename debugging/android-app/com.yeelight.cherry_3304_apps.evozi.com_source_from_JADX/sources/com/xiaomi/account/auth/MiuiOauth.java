package com.xiaomi.account.auth;

import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.xiaomi.account.IXiaomiAuthResponse;
import com.xiaomi.account.openauth.XMAuthericationException;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.account.openauth.XiaomiOAuthResults;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class MiuiOauth implements XiaomiOAuth {
    private static final long DEFAULT_TIMEOUT_MINUTE = 10;
    private static final String TAG = "MiuiOauth";
    private String mAppId;
    /* access modifiers changed from: private */
    public Context mContext;
    private String mRedirectUrl;

    private class MiuiOAuthSession extends FutureTask<Bundle> implements ServiceConnection {
        private WeakReference<Activity> mActivity;
        XiaomiAuthService mAuthService;
        OAuthConfig mOAuthConfig;
        IXiaomiAuthResponse mResponse;

        MiuiOAuthSession(Activity activity, OAuthConfig oAuthConfig) {
            super(new Callable<Bundle>() {
                public Bundle call() {
                    throw new IllegalStateException("this should never be called");
                }
            });
            this.mActivity = new WeakReference<>(activity);
            this.mOAuthConfig = oAuthConfig;
            this.mResponse = new IXiaomiAuthResponse.Stub(MiuiOauth.this) {
                public void onCancel() {
                    MiuiOAuthSession.this.setException(new OperationCanceledException());
                }

                public void onResult(Bundle bundle) {
                    MiuiOAuthSession.this.set(bundle);
                }
            };
        }

        private void close() {
            unbind();
        }

        private Bundle internalGetResult() {
            try {
                return (Bundle) get(MiuiOauth.DEFAULT_TIMEOUT_MINUTE, TimeUnit.MINUTES);
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause instanceof Exception) {
                    throw ((Exception) cause);
                }
                throw ((Error) cause);
            }
        }

        private void unbind() {
            if (this.mAuthService != null) {
                this.mAuthService = null;
                MiuiOauth.this.mContext.unbindService(this);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean bind() {
            Intent blockGetDefaultIntent = new OAuthServiceManager(MiuiOauth.this.mContext).blockGetDefaultIntent();
            if (blockGetDefaultIntent == null) {
                return false;
            }
            return MiuiOauth.this.mContext.bindService(blockGetDefaultIntent, this, 1);
        }

        /* access modifiers changed from: package-private */
        public XiaomiOAuthResults getResult() {
            return XiaomiOAuthResults.parseBundle(internalGetResult());
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            XiaomiAuthService xiaomiAuthService = new XiaomiAuthService(iBinder);
            this.mAuthService = xiaomiAuthService;
            try {
                xiaomiAuthService.oauthInResponse(MiuiOauth.this.mContext, this.mResponse, this.mOAuthConfig);
            } catch (RemoteException | FallBackWebOAuthException | XMAuthericationException e) {
                setException(e);
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            this.mAuthService = null;
            setException(Build.VERSION.SDK_INT >= 15 ? new RemoteException("onServiceDisconnected") : new XMAuthericationException("onServiceDisconnected"));
        }

        /* access modifiers changed from: protected */
        public void set(Bundle bundle) {
            if (bundle == null || !bundle.containsKey(XiaomiOAuthConstants.EXTRA_INTENT)) {
                close();
                super.set(bundle);
                return;
            }
            Intent intent = (Intent) bundle.getParcelable(XiaomiOAuthConstants.EXTRA_INTENT);
            if (intent == null) {
                setException(new XMAuthericationException("intent == null"));
            } else if (this.mActivity.get() == null || (this.mActivity.get() != null && ((Activity) this.mActivity.get()).isFinishing())) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt(XiaomiOAuthConstants.EXTRA_ERROR_CODE, XiaomiOAuthConstants.ERROR_NEED_AUTHORIZE);
                bundle2.putString(XiaomiOAuthConstants.EXTRA_ERROR_DESCRIPTION, "activity is null");
                super.set(bundle2);
            } else if (this.mActivity.get() != null) {
                ((Activity) this.mActivity.get()).startActivity(intent);
            }
        }

        /* access modifiers changed from: protected */
        public void setException(Throwable th) {
            close();
            super.setException(th);
        }
    }

    MiuiOauth(Context context, String str, String str2) {
        this.mContext = context;
        this.mAppId = str;
        this.mRedirectUrl = str2;
    }

    public XiaomiOAuthResults startOAuth(Activity activity, OAuthConfig oAuthConfig) {
        MiuiOAuthSession miuiOAuthSession = new MiuiOAuthSession(activity, oAuthConfig);
        try {
            if (miuiOAuthSession.bind()) {
                return miuiOAuthSession.getResult();
            }
        } catch (FallBackWebOAuthException unused) {
        }
        return new WebViewOauth(this.mContext, this.mAppId, this.mRedirectUrl).startOAuth(activity, oAuthConfig);
    }
}
