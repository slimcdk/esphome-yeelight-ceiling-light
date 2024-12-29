package com.miot.service.common.miotcloud.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.miot.common.ReturnCode;
import com.miot.common.config.AppConfiguration;
import com.miot.common.people.People;
import com.miot.common.utils.Logger;
import com.miot.service.common.crypto.CloudCoder;
import com.miot.service.common.crypto.rc4coder.Coder;
import com.miot.service.common.crypto.rc4coder.RC4DropCoder;
import com.miot.service.common.manager.ServiceManager;
import com.miot.service.common.miotcloud.CloudUrlBuilder;
import com.miot.service.common.miotcloud.HttpCallback;
import com.miot.service.common.miotcloud.HttpResponse;
import com.miot.service.common.miotcloud.MiotCloud;
import com.miot.service.common.miotcloud.OkHttpManager;
import com.miot.service.log.MyLogger;
import com.squareup.okhttp.C4297n;
import com.squareup.okhttp.C4312v;
import com.squareup.okhttp.C4315w;
import com.squareup.okhttp.C4318x;
import com.xiaomi.account.openauth.AuthorizeActivityBase;
import java.net.HttpCookie;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.NameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

public class MiotCloudImpl implements MiotCloud {
    private static final String CLOUD_URL = "http://api.io.mi.com/app";
    public static final String COOKIE_DOMAIN = ".io.mi.com";
    public static final String COOKIE_PATH = "/";
    public static final String COOKIE_URL = "http://api.io.mi.com";
    private static final String HTTP_POST = "POST";
    private static final String TAG = "MiotCloudImpl";
    private static volatile MiotCloudImpl sInstance;
    private People mPeople;

    private MiotCloudImpl() {
    }

    private void addCookie() {
        clearCookie();
        String userId = this.mPeople.getUserId();
        if (userId != null) {
            HttpCookie httpCookie = new HttpCookie("userId", userId);
            httpCookie.setDomain(COOKIE_DOMAIN);
            httpCookie.setPath(COOKIE_PATH);
            OkHttpManager.getInstance().addCookie(COOKIE_URL, httpCookie);
        }
        String accessToken = this.mPeople.getAccessToken();
        if (accessToken != null) {
            HttpCookie httpCookie2 = new HttpCookie(AuthorizeActivityBase.KEY_SERVICETOKEN, accessToken);
            httpCookie2.setDomain(COOKIE_DOMAIN);
            httpCookie2.setPath(COOKIE_PATH);
            OkHttpManager.getInstance().addCookie(COOKIE_URL, httpCookie2);
        }
    }

    private byte[] bytecat(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[(bArr.length + bArr2.length)];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    private void clearCookie() {
        OkHttpManager.getInstance().removeCookies();
    }

    /* access modifiers changed from: private */
    public String decryptResponse(String str, String str2, String str3) {
        try {
            return new RC4DropCoder(Coder.encryptBASE64(Coder.sha256Hash(bytecat(Coder.decryptBASE64(str3), Coder.decryptBASE64(str2))))).decrypt(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private C4297n encryptParams(String str, String str2, @NonNull List<NameValuePair> list, String str3, String str4) {
        String str5;
        try {
            str5 = Coder.encryptBASE64(Coder.sha256Hash(bytecat(Coder.decryptBASE64(str4), Coder.decryptBASE64(str3))));
        } catch (Exception e) {
            e.printStackTrace();
            str5 = null;
        }
        if (str5 == null) {
            return null;
        }
        TreeMap treeMap = new TreeMap();
        TreeMap treeMap2 = new TreeMap();
        for (NameValuePair next : list) {
            if (!TextUtils.isEmpty(next.getName()) && !TextUtils.isEmpty(next.getValue())) {
                treeMap2.put(next.getName(), next.getValue());
            }
        }
        treeMap2.put("rc4_hash__", CloudCoder.generateSignature(str, str2, treeMap2, str5));
        C4297n nVar = new C4297n();
        RC4DropCoder rC4DropCoder = new RC4DropCoder(str5);
        for (Map.Entry entry : treeMap2.entrySet()) {
            String encrypt = rC4DropCoder.encrypt((String) entry.getValue());
            treeMap.put(entry.getKey(), encrypt);
            nVar.mo27923a((String) entry.getKey(), encrypt);
        }
        nVar.mo27923a("signature", CloudCoder.generateSignature(str, str2, treeMap, str5));
        nVar.mo27923a("_nonce", str3);
        return nVar;
    }

    private C4315w genRequestBody(String str, String str2, List<NameValuePair> list) {
        String str3;
        if (this.mPeople.getUserId() == null) {
            str3 = "userId is null";
        } else {
            String serviceSecurity = this.mPeople.getServiceSecurity();
            if (serviceSecurity == null) {
                str3 = "serviceSecurity is null";
            } else if (this.mPeople.getAccessToken() == null) {
                str3 = "serviceToken is null";
            } else {
                C4297n encryptParams = encryptParams(HTTP_POST, str, list, str2, serviceSecurity);
                if (encryptParams != null) {
                    return encryptParams.mo27925c();
                }
                str3 = "build params failed";
            }
        }
        Logger.m7500e(TAG, str3);
        return null;
    }

    public static MiotCloudImpl getInstance() {
        if (sInstance == null) {
            synchronized (MiotCloudImpl.class) {
                if (sInstance == null) {
                    sInstance = new MiotCloudImpl();
                }
            }
        }
        return sInstance;
    }

    private String getUrl() {
        AppConfiguration appConfig = ServiceManager.getInstance().getAppConfig();
        if (appConfig == null) {
            return CLOUD_URL;
        }
        return new CloudUrlBuilder().setLocale(appConfig.getLocale()).setServer(CloudUrlBuilder.Server.api).build();
    }

    public synchronized int post(String str, List<NameValuePair> list, final MiotCloud.ResponseHandler responseHandler) {
        int i;
        i = 0;
        Long timeDiff = this.mPeople.getTimeDiff();
        if (timeDiff == null) {
            i = ReturnCode.E_ACCOUNT_TIMEDIFF;
        } else {
            final String generateNonce = CloudCoder.generateNonce(timeDiff.longValue());
            C4315w genRequestBody = genRequestBody(str, generateNonce, list);
            if (genRequestBody == null) {
                i = ReturnCode.E_ACCOUNT_NOT_LOGIN;
            } else {
                String str2 = getUrl() + str;
                MyLogger.getInstance().log(TAG, "post url: " + str2);
                C4312v g = new C4312v.C4314b().mo28055o(str2).mo28052l(genRequestBody).mo28047g();
                addCookie();
                final String serviceSecurity = this.mPeople.getServiceSecurity();
                OkHttpManager.getInstance().enqueue(g, new HttpCallback<String>() {
                    public void onFailed(int i, String str) {
                        MyLogger instance = MyLogger.getInstance();
                        instance.log(MiotCloudImpl.TAG, "onFailed " + i + str);
                        responseHandler.onFailure(i, str);
                    }

                    public void onSucceed(String str) {
                        String access$000 = MiotCloudImpl.this.decryptResponse(str, generateNonce, serviceSecurity);
                        MyLogger instance = MyLogger.getInstance();
                        instance.log(MiotCloudImpl.TAG, "response: " + access$000);
                        if (access$000 == null) {
                            responseHandler.onFailure(1012, "decryptResponse error");
                            return;
                        }
                        try {
                            responseHandler.onSuccess(new JSONObject(access$000));
                        } catch (JSONException e) {
                            e.printStackTrace();
                            responseHandler.onFailure(1012, e.toString());
                        }
                    }
                });
            }
        }
        return i;
    }

    public synchronized HttpResponse post(String str, List<NameValuePair> list) {
        int i;
        String str2;
        JSONObject jSONObject;
        String str3;
        String exc;
        Logger.m7499d(TAG, "MiotccImpl post");
        People people = this.mPeople;
        i = 1012;
        str2 = null;
        if (people == null) {
            str3 = String.format("%s Not allow, Login required!", new Object[]{str});
        } else {
            Long timeDiff = people.getTimeDiff();
            if (timeDiff == null) {
                i = ReturnCode.E_ACCOUNT_TIMEDIFF;
                jSONObject = null;
            } else {
                String generateNonce = CloudCoder.generateNonce(timeDiff.longValue());
                C4315w genRequestBody = genRequestBody(str, generateNonce, list);
                if (genRequestBody == null) {
                    str3 = "genRequestBody failed";
                } else {
                    String str4 = getUrl() + str;
                    MyLogger.getInstance().log(TAG, "post url: " + str4);
                    C4312v g = new C4312v.C4314b().mo28055o(str4).mo28052l(genRequestBody).mo28047g();
                    addCookie();
                    try {
                        C4318x execute = OkHttpManager.getInstance().execute(g);
                        if (!execute.mo28065t()) {
                            i = execute.mo28060o();
                            exc = execute.mo28067u();
                        } else {
                            try {
                                String decryptResponse = decryptResponse(execute.mo28056k().mo28089n(), generateNonce, this.mPeople.getServiceSecurity());
                                if (decryptResponse == null) {
                                    exc = "decryptResponse failed";
                                } else {
                                    String str5 = "";
                                    for (NameValuePair value : list) {
                                        str5 = str5 + value.getValue();
                                    }
                                    MyLogger.getInstance().log(TAG, "Post request: " + str5 + "response: " + decryptResponse);
                                    jSONObject = new JSONObject(decryptResponse);
                                    i = 0;
                                }
                            } catch (Exception e) {
                                String exc2 = e.toString();
                                e.printStackTrace();
                                str2 = exc2;
                                jSONObject = null;
                            }
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        i = 1011;
                        exc = e2.toString();
                    }
                    jSONObject = null;
                    str2 = str3;
                }
            }
        }
        jSONObject = null;
        i = ReturnCode.E_ACCOUNT_NOT_LOGIN;
        str2 = str3;
        return new HttpResponse(i, str2, jSONObject);
    }

    public void setPeople(People people) {
        this.mPeople = people;
    }
}
