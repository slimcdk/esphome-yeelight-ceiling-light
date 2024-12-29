package com.xiaomi.account.openauth;

import android.os.Bundle;
import android.text.TextUtils;

public class XiaomiOAuthResults {
    private static final String TAG = "XiaomiOAuthResults";
    private final Bundle contentBundle;
    private final Error errorResult;
    private final Success successResult;

    public static class Error {
        public final int errorCode;
        public final String errorMessage;

        public Error(int i, String str) {
            this.errorCode = i;
            this.errorMessage = str;
        }

        /* access modifiers changed from: private */
        public static Error parseBundle(Bundle bundle) {
            return new Error(XiaomiOAuthResults.getIntCompatibly(bundle, XiaomiOAuthConstants.EXTRA_ERROR_CODE, XiaomiOAuthConstants.EXTRA_ERROR_CODE_2), XiaomiOAuthResults.getStringCompatibly(bundle, XiaomiOAuthConstants.EXTRA_ERROR_DESCRIPTION, XiaomiOAuthConstants.EXTRA_ERROR_DESCRIPTION_2));
        }

        public String toString() {
            return "errorCode=" + this.errorCode + ",errorMessage=" + this.errorMessage;
        }
    }

    private static class Success {
        public final String accessToken;
        public final String code;
        public final String expiresIn;
        public final String info;
        public final String macAlgorithm;
        public final String macKey;
        public final String scopes;
        public final String state;
        public final String tokenType;

        public Success(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.accessToken = str;
            this.expiresIn = str2;
            this.scopes = str3;
            this.state = str4;
            this.tokenType = str5;
            this.macKey = str6;
            this.macAlgorithm = str7;
            this.code = str8;
            this.info = str9;
        }

        /* access modifiers changed from: private */
        public static Success parseBundle(Bundle bundle) {
            return new Success(XiaomiOAuthResults.getStringCompatibly(bundle, XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2, XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN), XiaomiOAuthResults.getIntOrStringCompatibly(bundle, XiaomiOAuthConstants.EXTRA_EXPIRES_IN_2, XiaomiOAuthConstants.EXTRA_EXPIRES_IN), XiaomiOAuthResults.getStringCompatibly(bundle, XiaomiOAuthConstants.EXTRA_SCOPE_2, XiaomiOAuthConstants.EXTRA_SCOPE), XiaomiOAuthResults.getStringCompatibly(bundle, "state", XiaomiOAuthConstants.EXTRA_STATE), XiaomiOAuthResults.getStringCompatibly(bundle, XiaomiOAuthConstants.EXTRA_TOKEN_TYPE_2, XiaomiOAuthConstants.EXTRA_TOKEN_TYPE), XiaomiOAuthResults.getStringCompatibly(bundle, XiaomiOAuthConstants.EXTRA_MAC_KEY_2, XiaomiOAuthConstants.EXTRA_MAC_KEY), XiaomiOAuthResults.getStringCompatibly(bundle, XiaomiOAuthConstants.EXTRA_MAC_ALGORITHM_2, XiaomiOAuthConstants.EXTRA_MAC_ALGORITHM), XiaomiOAuthResults.getStringCompatibly(bundle, "code", XiaomiOAuthConstants.EXTRA_CODE), XiaomiOAuthResults.getStringCompatibly(bundle, XiaomiOAuthConstants.EXTRA_INFO, XiaomiOAuthConstants.EXTRA_INFO));
        }

        public String toString() {
            return "accessToken=" + this.accessToken + ",expiresIn=" + this.expiresIn + ",scope=" + this.scopes + ",state=" + this.state + ",tokenType=" + this.tokenType + ",macKey=" + this.macKey + ",macAlogorithm=" + this.macAlgorithm + ",code=" + this.code + ",info=" + this.info;
        }
    }

    private XiaomiOAuthResults(Bundle bundle, Error error) {
        this.contentBundle = bundle;
        this.successResult = null;
        this.errorResult = error;
    }

    private XiaomiOAuthResults(Bundle bundle, Success success) {
        this.contentBundle = bundle;
        this.successResult = success;
        this.errorResult = null;
    }

    /* access modifiers changed from: private */
    public static int getIntCompatibly(Bundle bundle, String str, String str2) {
        try {
            return Integer.parseInt(getIntOrStringCompatibly(bundle, str, str2));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* access modifiers changed from: private */
    public static String getIntOrStringCompatibly(Bundle bundle, String str, String str2) {
        Object obj;
        String[] strArr = {str, str2};
        for (int i = 0; i < 2; i++) {
            String str3 = strArr[i];
            if (!TextUtils.isEmpty(str3) && bundle.containsKey(str3) && (obj = bundle.get(str3)) != null) {
                return obj instanceof Integer ? ((Integer) obj).toString() : obj.toString();
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static String getStringCompatibly(Bundle bundle, String str, String str2) {
        return bundle.containsKey(str) ? bundle.getString(str) : bundle.getString(str2);
    }

    public static XiaomiOAuthResults parseBundle(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return getIntCompatibly(bundle, XiaomiOAuthConstants.EXTRA_ERROR_CODE, XiaomiOAuthConstants.EXTRA_ERROR_CODE_2) != 0 ? new XiaomiOAuthResults(bundle, Error.parseBundle(bundle)) : new XiaomiOAuthResults(bundle, Success.parseBundle(bundle));
    }

    public String getAccessToken() {
        Success success = this.successResult;
        if (success != null) {
            return success.accessToken;
        }
        return null;
    }

    public String getCode() {
        Success success = this.successResult;
        if (success != null) {
            return success.code;
        }
        return null;
    }

    public Bundle getContentBundle() {
        return this.contentBundle;
    }

    public int getErrorCode() {
        Error error = this.errorResult;
        if (error != null) {
            return error.errorCode;
        }
        return 0;
    }

    public String getErrorMessage() {
        Error error = this.errorResult;
        if (error != null) {
            return error.errorMessage;
        }
        return null;
    }

    public String getExpiresIn() {
        Success success = this.successResult;
        if (success != null) {
            return success.expiresIn;
        }
        return null;
    }

    public String getMacAlgorithm() {
        Success success = this.successResult;
        if (success != null) {
            return success.macAlgorithm;
        }
        return null;
    }

    public String getMacKey() {
        Success success = this.successResult;
        if (success != null) {
            return success.macKey;
        }
        return null;
    }

    public String getScopes() {
        Success success = this.successResult;
        if (success != null) {
            return success.scopes;
        }
        return null;
    }

    public String getState() {
        Success success = this.successResult;
        if (success != null) {
            return success.state;
        }
        return null;
    }

    public String getTokenType() {
        Success success = this.successResult;
        if (success != null) {
            return success.tokenType;
        }
        return null;
    }

    public boolean hasError() {
        return this.errorResult != null;
    }

    public String toString() {
        Success success = this.successResult;
        if (success != null) {
            return success.toString();
        }
        Error error = this.errorResult;
        if (error != null) {
            return error.toString();
        }
        throw new IllegalStateException("should not be here.");
    }
}
