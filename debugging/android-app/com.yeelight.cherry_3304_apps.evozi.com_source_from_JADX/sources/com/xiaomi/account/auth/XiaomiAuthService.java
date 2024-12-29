package com.xiaomi.account.auth;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.xiaomi.account.IXiaomiAuthResponse;
import com.xiaomi.account.IXiaomiAuthService;
import com.xiaomi.account.openauth.AuthorizeActivityBase;
import com.xiaomi.account.openauth.XMAuthericationException;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import java.io.IOException;
import p205e.p206a.C10745a;

public class XiaomiAuthService implements IXiaomiAuthService {
    private final String TAG = "XiaomiAuthService";
    private IXiaomiAuthService mAuthService;
    private C10745a mMiuiV5AuthService;

    XiaomiAuthService(IBinder iBinder) {
        try {
            this.mAuthService = IXiaomiAuthService.Stub.asInterface(iBinder);
        } catch (SecurityException unused) {
            this.mMiuiV5AuthService = C10745a.C10746a.m26607a(iBinder);
        }
    }

    @SuppressLint({"MissingPermission"})
    private Intent addXiaomiAccount(Context context) {
        try {
            Bundle result = AccountManager.get(context).addAccount("com.xiaomi", (String) null, (String[]) null, (Bundle) null, (Activity) null, (AccountManagerCallback) null, (Handler) null).getResult();
            if (result == null || !result.containsKey("intent")) {
                return null;
            }
            return (Intent) result.getParcelable("intent");
        } catch (SecurityException e) {
            e.printStackTrace();
            return null;
        } catch (AuthenticatorException e2) {
            e2.printStackTrace();
            return null;
        } catch (IOException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    @SuppressLint({"MissingPermission"})
    private Account getXiaomiAccount(Context context) {
        try {
            Account[] accountsByType = AccountManager.get(context).getAccountsByType("com.xiaomi");
            if (accountsByType.length == 0) {
                return null;
            }
            return accountsByType[0];
        } catch (SecurityException e) {
            e.printStackTrace();
            return null;
        }
    }

    private void miuiv5(Context context, IXiaomiAuthResponse iXiaomiAuthResponse, OAuthConfig oAuthConfig, Bundle bundle) {
        Account xiaomiAccount = getXiaomiAccount(context);
        if (xiaomiAccount == null) {
            Intent addXiaomiAccount = addXiaomiAccount(context);
            if (addXiaomiAccount != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(XiaomiOAuthConstants.EXTRA_INTENT, addXiaomiAccount);
                iXiaomiAuthResponse.onResult(bundle2);
            }
            xiaomiAccount = getXiaomiAccount(context);
        }
        if (xiaomiAccount != null) {
            C10745a aVar = this.mMiuiV5AuthService;
            if (aVar != null) {
                Bundle miCloudAccessToken = aVar.getMiCloudAccessToken(xiaomiAccount, bundle);
                if (miCloudAccessToken == null) {
                    throw new XMAuthericationException("getMiCloudAccessToken return null");
                } else if (!miCloudAccessToken.containsKey(XiaomiOAuthConstants.EXTRA_INTENT)) {
                    iXiaomiAuthResponse.onResult(miCloudAccessToken);
                } else {
                    Intent intent = (Intent) miCloudAccessToken.getParcelable(XiaomiOAuthConstants.EXTRA_INTENT);
                    if (intent != null) {
                        Intent asMiddleActivity = AuthorizeActivityBase.asMiddleActivity(context, intent, iXiaomiAuthResponse, oAuthConfig.authorizeActivityClazz);
                        Bundle bundle3 = (Bundle) miCloudAccessToken.clone();
                        bundle3.putParcelable(XiaomiOAuthConstants.EXTRA_INTENT, asMiddleActivity);
                        iXiaomiAuthResponse.onResult(bundle3);
                        return;
                    }
                    throw new XMAuthericationException("intent == null");
                }
            } else {
                throw new XMAuthericationException("mMiuiV5AuthService return null");
            }
        } else {
            throw new XMAuthericationException("Xiaomi Account not Login");
        }
    }

    private void onCancel(IXiaomiAuthResponse iXiaomiAuthResponse) {
        try {
            iXiaomiAuthResponse.onCancel();
        } catch (RemoteException unused) {
        }
    }

    private boolean supportNativeOAuth() {
        return getVersionNum() >= 1;
    }

    public IBinder asBinder() {
        throw new IllegalStateException();
    }

    public void getAccessTokenInResponse(IXiaomiAuthResponse iXiaomiAuthResponse, Bundle bundle, int i, int i2) {
        IXiaomiAuthService iXiaomiAuthService = this.mAuthService;
        if (iXiaomiAuthService != null) {
            iXiaomiAuthService.getAccessTokenInResponse(iXiaomiAuthResponse, bundle, i, i2);
        }
    }

    public Bundle getMiCloudAccessToken(Account account, Bundle bundle) {
        IXiaomiAuthService iXiaomiAuthService = this.mAuthService;
        if (iXiaomiAuthService != null) {
            return iXiaomiAuthService.getMiCloudAccessToken(account, bundle);
        }
        C10745a aVar = this.mMiuiV5AuthService;
        if (aVar == null) {
            return null;
        }
        aVar.invalidateAccessToken(account, bundle);
        return this.mMiuiV5AuthService.getMiCloudAccessToken(account, bundle);
    }

    public Bundle getMiCloudUserInfo(Account account, Bundle bundle) {
        return null;
    }

    public Bundle getSnsAccessToken(Account account, Bundle bundle) {
        return null;
    }

    public int getVersionNum() {
        IXiaomiAuthService iXiaomiAuthService = this.mAuthService;
        if (iXiaomiAuthService != null) {
            return iXiaomiAuthService.getVersionNum();
        }
        return 0;
    }

    public void invalidateAccessToken(Account account, Bundle bundle) {
        C10745a aVar = this.mMiuiV5AuthService;
        if (aVar != null) {
            aVar.invalidateAccessToken(account, bundle);
        }
    }

    public boolean isSupport(String str) {
        IXiaomiAuthService iXiaomiAuthService = this.mAuthService;
        if (iXiaomiAuthService != null) {
            return iXiaomiAuthService.isSupport(str);
        }
        return false;
    }

    public void oauthInResponse(Context context, IXiaomiAuthResponse iXiaomiAuthResponse, OAuthConfig oAuthConfig) {
        Bundle makeOptions = oAuthConfig.makeOptions();
        makeOptions.putString(XiaomiOAuthConstants.EXTRA_CLIENT_ID, String.valueOf(oAuthConfig.appId));
        makeOptions.putString(XiaomiOAuthConstants.EXTRA_REDIRECT_URI, oAuthConfig.redirectUrl);
        if (!oAuthConfig.useSystemAccountLogin.booleanValue() && !isSupport(XiaomiOAuthConstants.FEATURE_NOT_USE_SYSTEM_ACCOUNT_LOGIN)) {
            throw new FallBackWebOAuthException();
        } else if (!oAuthConfig.fastOAuth || supportNativeOAuth()) {
            String str = oAuthConfig.deviceID;
            if (oAuthConfig.platform == 1 && !isSupport(XiaomiOAuthConstants.FEATURE_SHUIDI)) {
                throw new FallBackWebOAuthException();
            } else if (oAuthConfig.platform == 0 && !isSupport(XiaomiOAuthConstants.FEATURE_DEV_DEVICEID) && !TextUtils.isEmpty(str)) {
                throw new FallBackWebOAuthException();
            } else if (supportResponseWay()) {
                this.mAuthService.getAccessTokenInResponse(iXiaomiAuthResponse, makeOptions, 1, 1);
            } else {
                throw new FallBackWebOAuthException();
            }
        } else {
            throw new FallBackWebOAuthException();
        }
    }

    public boolean supportResponseWay() {
        IXiaomiAuthService iXiaomiAuthService = this.mAuthService;
        if (iXiaomiAuthService != null) {
            return iXiaomiAuthService.supportResponseWay();
        }
        return false;
    }
}
