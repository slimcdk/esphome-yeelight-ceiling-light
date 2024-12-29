package com.xiaomi.account.auth;

import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.text.TextUtils;
import com.miot.service.connection.wifi.WebShellActivity;
import com.xiaomi.account.IXiaomiAuthResponse;
import com.xiaomi.account.XiaomiOAuthResponse;
import com.xiaomi.account.http.HttpClient;
import com.xiaomi.account.http.Request;
import com.xiaomi.account.http.Response;
import com.xiaomi.account.http.UrlConnHttpFactory;
import com.xiaomi.account.openauth.AccountAuth;
import com.xiaomi.account.openauth.AuthorizeActivityBase;
import com.xiaomi.account.openauth.BuildConfig;
import com.xiaomi.account.openauth.XMAuthericationException;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.account.openauth.XiaomiOAuthResults;
import com.xiaomi.account.utils.OAuthUrlPaser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

public class WebViewOauth implements XiaomiOAuth {
    private static final String AUTHORIZE_PATH = (XiaomiOAuthConstants.OAUTH2_HOST + "/oauth2/authorize");
    private static final String LOCALE_KEY_IN_URL = "_locale";
    private static final String TAG = "WebViewOauth";
    private String mAppId;
    private Context mContext;
    private String mRedirectUrl;

    public WebViewOauth(Context context, String str, String str2) {
        this.mContext = context;
        this.mAppId = str;
        this.mRedirectUrl = str2;
    }

    private void addLocaleIfNeeded(Bundle bundle) {
        if (bundle != null && !bundle.containsKey(LOCALE_KEY_IN_URL)) {
            String localeString = getLocaleString(Locale.getDefault());
            if (!TextUtils.isEmpty(localeString)) {
                bundle.putString(LOCALE_KEY_IN_URL, localeString);
            }
        }
    }

    private String getCookie(String str, String str2) {
        return str + "=" + str2;
    }

    private int getDefaultSmsSlotId() {
        if (Build.VERSION.SDK_INT < 24) {
            return 0;
        }
        try {
            int defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId();
            List<SubscriptionInfo> activeSubscriptionInfoList = SubscriptionManager.from(this.mContext).getActiveSubscriptionInfoList();
            if (activeSubscriptionInfoList == null) {
                return 0;
            }
            for (SubscriptionInfo next : activeSubscriptionInfoList) {
                if (next.getSubscriptionId() == defaultDataSubscriptionId) {
                    return next.getSimSlotIndex();
                }
            }
            return 0;
        } catch (SecurityException e) {
            e.toString();
            return 0;
        }
    }

    private Intent getIntent(Activity activity, OAuthConfig oAuthConfig, IXiaomiAuthResponse iXiaomiAuthResponse) {
        Intent intent = new Intent(activity, oAuthConfig.authorizeActivityClazz);
        intent.putExtra(WebShellActivity.ARGS_KEY_URL, getUrl(oAuthConfig));
        intent.putExtra(AuthorizeActivityBase.KEY_REDIRECT_URI, this.mRedirectUrl);
        intent.putExtra(AuthorizeActivityBase.KEY_KEEP_COOKIES, oAuthConfig.keepCookies);
        intent.putExtra("extra_response", new XiaomiOAuthResponse(iXiaomiAuthResponse));
        AccountAuth accountAuth = oAuthConfig.accountAuth;
        if (accountAuth != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("userId", accountAuth.getUserId());
            hashMap.put(AuthorizeActivityBase.KEY_SERVICETOKEN, accountAuth.getServiceToken());
            intent.putExtra(AuthorizeActivityBase.KEY_USERID, "userId=" + accountAuth.getUserId());
            intent.putExtra(AuthorizeActivityBase.KEY_SERVICETOKEN, "serviceToken=" + accountAuth.getServiceToken());
        }
        PhoneInfo phoneInfo = oAuthConfig.phoneInfo;
        if (phoneInfo != null) {
            intent.putExtras(phoneInfo.blokingGetPhoneInfo(getDefaultSmsSlotId()));
        }
        return intent;
    }

    private static String getLocaleString(Locale locale) {
        if (locale == null) {
            return null;
        }
        String language = locale.getLanguage();
        String country = locale.getCountry();
        if (TextUtils.isEmpty(country)) {
            return language;
        }
        return String.format("%s_%s", new Object[]{language, country});
    }

    private String getUrl(OAuthConfig oAuthConfig) {
        Bundle bundle = new Bundle();
        bundle.putString("client_id", this.mAppId);
        bundle.putString(AuthorizeActivityBase.KEY_REDIRECT_URI, this.mRedirectUrl);
        bundle.putString("response_type", oAuthConfig.responseType);
        bundle.putString(XiaomiOAuthConstants.EXTRA_SCOPE_2, oAuthConfig.scopes);
        bundle.putString("state", oAuthConfig.state);
        Boolean bool = oAuthConfig.skipConfirm;
        if (bool != null) {
            bundle.putString("skip_confirm", String.valueOf(bool));
        }
        String str = oAuthConfig.loginType;
        if (str != null) {
            bundle.putString(XiaomiOAuthConstants.EXTRA_LOGIN_TYPE, str);
        }
        if (oAuthConfig.hideSwitch != null) {
            bundle.putString("_hideSwitch", "true");
        }
        bundle.putString("pt", "" + oAuthConfig.platform);
        bundle.putString("device_id", oAuthConfig.deviceID);
        bundle.putString("display", oAuthConfig.display);
        addLocaleIfNeeded(bundle);
        return AUTHORIZE_PATH + "?" + parseBundle(bundle);
    }

    protected static String joinMap(Map<String, String> map, String str) {
        if (map == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Map.Entry next : map.entrySet()) {
            if (i > 0) {
                sb.append(str);
            }
            sb.append((String) next.getKey());
            sb.append("=");
            sb.append((String) next.getValue());
            i++;
        }
        return sb.toString();
    }

    private String parseBundle(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (String str : bundle.keySet()) {
            String string = bundle.getString(str);
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(string)) {
                arrayList.add(new BasicNameValuePair(str, string));
            }
        }
        return URLEncodedUtils.format(arrayList, "UTF-8");
    }

    private XiaomiOAuthResults quietOAuth(OAuthConfig oAuthConfig) {
        AccountAuth accountAuth = oAuthConfig.accountAuth;
        if (accountAuth != null) {
            int i = 0;
            while (i < 2) {
                HttpClient createHttpClient = new UrlConnHttpFactory().createHttpClient();
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("userId", accountAuth.getUserId());
                hashMap2.put(AuthorizeActivityBase.KEY_SERVICETOKEN, accountAuth.getServiceToken());
                hashMap.put("Cookie", joinMap(hashMap2, "; "));
                hashMap.put("User-Agent", (System.getProperty("http.agent") + " Passport/OAuthSDK/" + BuildConfig.VERSION_NAME) + " mi/OAuthSDK/VersionCode/" + 1);
                Response excute = createHttpClient.excute(new Request.Builder().url(getUrl(oAuthConfig)).followRedirects(false).headers(hashMap).build());
                String str = excute.location;
                if (str == null) {
                    throw new AuthenticatorException();
                } else if (str.startsWith(this.mRedirectUrl)) {
                    Bundle parse = OAuthUrlPaser.parse(excute.location);
                    if (parse != null) {
                        return XiaomiOAuthResults.parseBundle(parse);
                    }
                    throw new XMAuthericationException("parse url fail:" + excute.location);
                } else {
                    accountAuth.invalideServiceToken();
                    i++;
                }
            }
            throw new AuthenticatorException();
        }
        throw new AuthenticatorException();
    }

    public XiaomiOAuthResults startOAuth(Activity activity, OAuthConfig oAuthConfig) {
        try {
            return quietOAuth(oAuthConfig);
        } catch (AuthenticatorException unused) {
            if (activity == null || activity.isFinishing()) {
                Bundle bundle = new Bundle();
                bundle.putInt(XiaomiOAuthConstants.EXTRA_ERROR_CODE, XiaomiOAuthConstants.ERROR_NEED_AUTHORIZE);
                bundle.putString(XiaomiOAuthConstants.EXTRA_ERROR_DESCRIPTION, "activity is null");
                return XiaomiOAuthResults.parseBundle(bundle);
            }
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final ArrayList arrayList = new ArrayList();
            activity.startActivity(getIntent(activity, oAuthConfig, new IXiaomiAuthResponse.Stub() {
                public void onCancel() {
                    countDownLatch.countDown();
                }

                public void onResult(Bundle bundle) {
                    arrayList.add(XiaomiOAuthResults.parseBundle(bundle));
                    countDownLatch.countDown();
                }
            }));
            countDownLatch.await();
            if (arrayList.size() > 0) {
                return (XiaomiOAuthResults) arrayList.get(0);
            }
            throw new OperationCanceledException();
        }
    }
}
