package com.xiaomi.account.auth;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.xiaomi.account.openauth.AccountAuth;
import com.xiaomi.account.openauth.AuthorizeActivity;
import com.xiaomi.account.openauth.AuthorizeActivityBase;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;

public class OAuthConfig {
    private static final char SCOPE_SPLITTOR = ' ';
    final AccountAuth accountAuth;
    final String appId;
    final Class<? extends AuthorizeActivityBase> authorizeActivityClazz;
    final Context context;
    final String deviceID;
    final String display;
    final boolean fastOAuth;
    final Boolean hideSwitch;
    final boolean keepCookies;
    final String loginType;
    final boolean notUseMiui;
    final PhoneInfo phoneInfo;
    final int platform;
    final String redirectUrl;
    final String responseType;
    final String scopes;
    final Boolean skipConfirm;
    final String state;
    final Boolean useSystemAccountLogin;

    public static class Builder {
        private static final Class<? extends AuthorizeActivityBase> DEFAULT_AUTHORIZE_ACTIVITY_CLASS = AuthorizeActivity.class;
        /* access modifiers changed from: private */
        public AccountAuth accountAuth;
        /* access modifiers changed from: private */
        public String appId = null;
        /* access modifiers changed from: private */
        public Class<? extends AuthorizeActivityBase> authorizeActivityClazz = DEFAULT_AUTHORIZE_ACTIVITY_CLASS;
        /* access modifiers changed from: private */
        public Context context;
        /* access modifiers changed from: private */
        public String deviceID = null;
        /* access modifiers changed from: private */
        public String display;
        /* access modifiers changed from: private */
        public boolean fastOAuth = false;
        /* access modifiers changed from: private */
        public Boolean hideSwitch;
        /* access modifiers changed from: private */
        public boolean keepCookies = false;
        /* access modifiers changed from: private */
        public String loginType;
        /* access modifiers changed from: private */
        public boolean notUseMiui = false;
        /* access modifiers changed from: private */
        public PhoneInfo phoneInfo;
        /* access modifiers changed from: private */
        public int platform = 0;
        /* access modifiers changed from: private */
        public String redirectUrl = null;
        /* access modifiers changed from: private */
        public String responseType = "code";
        /* access modifiers changed from: private */
        public int[] scopes = null;
        /* access modifiers changed from: private */
        public Boolean skipConfirm = Boolean.FALSE;
        /* access modifiers changed from: private */
        public String state = null;
        /* access modifiers changed from: private */
        public Boolean useSystemAccountLogin = Boolean.TRUE;

        public Builder() {
        }

        public Builder(Builder builder) {
            this.notUseMiui = builder.notUseMiui;
            this.scopes = builder.scopes;
            this.appId = builder.appId;
            this.redirectUrl = builder.redirectUrl;
            this.skipConfirm = builder.skipConfirm;
            this.state = builder.state;
            this.keepCookies = builder.keepCookies;
            this.authorizeActivityClazz = builder.authorizeActivityClazz;
            this.accountAuth = builder.accountAuth;
            this.platform = builder.platform;
            this.phoneInfo = builder.phoneInfo;
            this.deviceID = builder.deviceID;
            this.responseType = builder.responseType;
            this.fastOAuth = builder.fastOAuth;
            this.context = builder.context;
            this.loginType = builder.loginType;
            this.display = builder.display;
            this.hideSwitch = builder.hideSwitch;
            this.useSystemAccountLogin = builder.useSystemAccountLogin;
        }

        public Builder accountAuth(AccountAuth accountAuth2) {
            this.accountAuth = accountAuth2;
            return this;
        }

        public Builder appId(long j) {
            this.appId = String.valueOf(j);
            return this;
        }

        public Builder authorizeActivityClazz(Class<? extends AuthorizeActivityBase> cls) {
            this.authorizeActivityClazz = cls;
            return this;
        }

        public OAuthConfig build() {
            return new OAuthConfig(this);
        }

        public Builder context(Context context2) {
            this.context = context2.getApplicationContext();
            return this;
        }

        public Builder deviceID(String str) {
            this.deviceID = str;
            return this;
        }

        public Builder display(String str) {
            this.display = str;
            return this;
        }

        public Builder fastOAuth(boolean z) {
            this.fastOAuth = z;
            return this;
        }

        public String getAppId() {
            return this.appId;
        }

        public Context getContext() {
            return this.context;
        }

        public Builder hideSwitch(boolean z) {
            this.hideSwitch = Boolean.valueOf(z);
            return this;
        }

        public Builder keepCookies(boolean z) {
            this.keepCookies = z;
            return this;
        }

        public Builder loginType(String str) {
            this.loginType = str;
            return this;
        }

        public Builder notUseMiui(boolean z) {
            this.notUseMiui = z;
            return this;
        }

        public Builder phoneInfo(PhoneInfo phoneInfo2) {
            this.phoneInfo = phoneInfo2;
            return this;
        }

        public Builder platform(int i) {
            this.platform = i;
            return this;
        }

        public Builder redirectUrl(String str) {
            this.redirectUrl = str;
            return this;
        }

        public Builder responseType(String str) {
            this.responseType = str;
            return this;
        }

        public Builder scopes(int[] iArr) {
            this.scopes = iArr;
            return this;
        }

        public Builder skipConfirm(boolean z) {
            this.skipConfirm = Boolean.valueOf(z);
            return this;
        }

        public Builder state(String str) {
            this.state = str;
            return this;
        }

        public Builder useSystemAccountLogin(boolean z) {
            this.useSystemAccountLogin = Boolean.valueOf(z);
            return this;
        }
    }

    public OAuthConfig(Builder builder) {
        this.scopes = makeScopeString(builder.scopes);
        this.notUseMiui = builder.notUseMiui;
        this.appId = builder.appId;
        this.redirectUrl = builder.redirectUrl;
        this.skipConfirm = builder.skipConfirm;
        this.state = builder.state;
        this.keepCookies = builder.keepCookies;
        this.authorizeActivityClazz = builder.authorizeActivityClazz;
        this.accountAuth = builder.accountAuth;
        this.platform = builder.platform;
        this.deviceID = builder.deviceID;
        this.display = builder.display;
        this.responseType = builder.responseType;
        this.phoneInfo = builder.phoneInfo;
        this.fastOAuth = builder.fastOAuth;
        this.context = builder.context;
        this.loginType = builder.loginType;
        this.hideSwitch = builder.hideSwitch;
        this.useSystemAccountLogin = builder.useSystemAccountLogin;
    }

    private static String makeScopeString(int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr[i];
            int i4 = i2 + 1;
            if (i2 > 0) {
                sb.append(SCOPE_SPLITTOR);
            }
            sb.append(i3);
            i++;
            i2 = i4;
        }
        return sb.toString();
    }

    public Bundle makeOptions() {
        Bundle bundle = new Bundle();
        bundle.putString(XiaomiOAuthConstants.EXTRA_RESPONSE_TYPE, this.responseType);
        Boolean bool = this.skipConfirm;
        if (bool != null) {
            bundle.putBoolean(XiaomiOAuthConstants.EXTRA_SKIP_CONFIRM, bool.booleanValue());
        }
        if (!TextUtils.isEmpty(this.state)) {
            bundle.putString(XiaomiOAuthConstants.EXTRA_STATE, this.state);
        }
        if (!TextUtils.isEmpty(this.scopes)) {
            bundle.putString(XiaomiOAuthConstants.EXTRA_SCOPE, this.scopes);
        }
        if (!TextUtils.isEmpty(this.deviceID)) {
            bundle.putString(XiaomiOAuthConstants.EXTRA_DEVICEID, this.deviceID);
        }
        if (!TextUtils.isEmpty(this.display)) {
            bundle.putString(XiaomiOAuthConstants.EXTRA_DISPLAY, this.display);
        }
        bundle.putInt(XiaomiOAuthConstants.EXTRA_PLATFORM, this.platform);
        bundle.putBoolean(XiaomiOAuthConstants.EXTRA_NATIVE_OAUTH, this.fastOAuth);
        Boolean bool2 = this.hideSwitch;
        if (bool2 != null) {
            bundle.putBoolean(XiaomiOAuthConstants.EXTRA_HIDE_SWITCH, bool2.booleanValue());
        }
        Boolean bool3 = this.useSystemAccountLogin;
        if (bool3 != null) {
            bundle.putBoolean(XiaomiOAuthConstants.EXTRA_USE_SYSTEM_ACCOUNT_LOGIN, bool3.booleanValue());
        }
        if (!TextUtils.isEmpty(this.loginType)) {
            bundle.putString(XiaomiOAuthConstants.EXTRA_LOGIN_TYPE, this.loginType);
        }
        return bundle;
    }
}
