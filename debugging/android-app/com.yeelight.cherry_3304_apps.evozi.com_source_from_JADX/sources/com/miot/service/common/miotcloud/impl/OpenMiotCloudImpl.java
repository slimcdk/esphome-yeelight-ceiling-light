package com.miot.service.common.miotcloud.impl;

import com.miot.bluetooth.channel.packet.Packet;
import com.miot.common.ReturnCode;
import com.miot.common.config.AppConfiguration;
import com.miot.common.people.People;
import com.miot.common.utils.Logger;
import com.miot.service.common.crypto.Base64Coder;
import com.miot.service.common.manager.ServiceManager;
import com.miot.service.common.miotcloud.CloudUrlBuilder;
import com.miot.service.common.miotcloud.HttpCallback;
import com.miot.service.common.miotcloud.HttpResponse;
import com.miot.service.common.miotcloud.MiotCloud;
import com.miot.service.common.miotcloud.OkHttpManager;
import com.miot.service.log.MyLogger;
import com.xiaomi.mipush.sdk.Constants;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.List;
import java.util.Locale;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.apache.http.NameValuePair;
import org.json.JSONException;
import org.json.JSONObject;
import p011c.p083d.p084a.C1128o;
import p011c.p083d.p084a.C1144x;
import p011c.p083d.p084a.C1147y;
import p011c.p083d.p084a.C1150z;

public class OpenMiotCloudImpl implements MiotCloud {
    public static final String COOKIE_URL = "http://openapp.io.mi.com";
    private static final String DEFAULT_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuCwxCZuvH8oOpmG7td3F\nYchcSgorVcw8wf9K0F58ES7/M0JFsRjQLFWruHqE/sICKSIMYmdpqk0yG9ZtkXBh\nfHKcKbKVL7nlwqp0fxW3Ck9Ci144z8dproSrHywLb1CtI+NZybug1xJh63l/pX6H\n0gmuGrsS5pEFvjGrSS162g2u0aawXgAEnTxLUzjoSSoqATWPCZdTOA7VWcIojUC0\nrGXWT3vYMNRQny3EHSo2YVT4YUQ5qiJLSOFSzrqupd4R+1Q+58ZIWd/bPkcZtTrG\nb5v+wUO8Qmh8u0toB7esztR3olQ6YR2MtDGHPVjdQPk0pd6IxLnzGgH/9d2ocvq4\nDQIDAQAB\n";
    private static final String OPEN_CLOUD_URL = "https://openapp.io.mi.com/openapp";
    private static final String OPEN_CLOUD_URL_PV = "https://pv.openapp.io.mi.com/openapp";
    private static final String TAG = "OpenMiotCloudImpl";
    private static volatile OpenMiotCloudImpl sInstance;
    private People mPeople;

    private OpenMiotCloudImpl() {
    }

    private static byte[] RSADecrypt(byte[] bArr) {
        RSAPublicKey rSAPublicKey;
        try {
            rSAPublicKey = loadPublicKey(DEFAULT_PUBLIC_KEY);
        } catch (Exception e) {
            e.printStackTrace();
            rSAPublicKey = null;
        }
        try {
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance.init(2, rSAPublicKey);
            return instance.doFinal(bArr);
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return new byte[0];
        } catch (NoSuchPaddingException e3) {
            e3.printStackTrace();
            return new byte[0];
        } catch (InvalidKeyException e4) {
            e4.printStackTrace();
            return new byte[0];
        } catch (BadPaddingException e5) {
            e5.printStackTrace();
            return new byte[0];
        } catch (IllegalBlockSizeException e6) {
            e6.printStackTrace();
            return new byte[0];
        } catch (Exception e7) {
            e7.printStackTrace();
            return new byte[0];
        }
    }

    private static byte[] RSAEncrypt(String str) {
        RSAPublicKey rSAPublicKey;
        try {
            rSAPublicKey = loadPublicKey(DEFAULT_PUBLIC_KEY);
        } catch (Exception e) {
            e.printStackTrace();
            rSAPublicKey = null;
        }
        try {
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance.init(1, rSAPublicKey);
            return instance.doFinal(str.getBytes());
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return new byte[0];
        } catch (NoSuchPaddingException e3) {
            e3.printStackTrace();
            return new byte[0];
        } catch (InvalidKeyException e4) {
            e4.printStackTrace();
            return new byte[0];
        } catch (BadPaddingException e5) {
            e5.printStackTrace();
            return new byte[0];
        } catch (IllegalBlockSizeException e6) {
            e6.printStackTrace();
            return new byte[0];
        } catch (Exception e7) {
            e7.printStackTrace();
            return new byte[0];
        }
    }

    private void addHeadForBody(C1128o oVar) {
        if (oVar == null) {
            Logger.m10630e(TAG, "builder is null");
            return;
        }
        AppConfiguration appConfig = ServiceManager.getInstance().getAppConfig();
        if (appConfig == null) {
            Logger.m10630e(TAG, "appConfig is null");
            return;
        }
        long longValue = appConfig.getAppId().longValue();
        if (longValue == 0) {
            Logger.m10630e(TAG, "appId is null");
            return;
        }
        String accessToken = this.mPeople.getAccessToken();
        if (accessToken == null) {
            Logger.m10630e(TAG, "accessToken is null");
            return;
        }
        oVar.mo9736a("clientId", Long.toString(longValue));
        oVar.mo9736a("accessToken", accessToken);
        if (this.mPeople.getMacKey() != null) {
            oVar.mo9736a("macKey", this.mPeople.getMacKey());
        }
        if (this.mPeople.getMacAlgorithm() != null) {
            oVar.mo9736a("macAlgorithm", this.mPeople.getMacAlgorithm());
        }
        oVar.mo9736a("locale", Locale.getDefault().toString().replace("_", Constants.ACCEPT_TIME_SEPARATOR_SERVER));
    }

    private C1147y genRequestBody(List<NameValuePair> list) {
        C1128o oVar = new C1128o();
        addHeadForBody(oVar);
        if (list != null) {
            for (NameValuePair next : list) {
                oVar.mo9736a(next.getName(), next.getValue());
            }
        }
        return oVar.mo9738c();
    }

    private String getCloudUrl() {
        AppConfiguration appConfig = ServiceManager.getInstance().getAppConfig();
        if (appConfig == null) {
            return OPEN_CLOUD_URL;
        }
        return new CloudUrlBuilder().setLocale(appConfig.getLocale()).setServer(CloudUrlBuilder.Server.openapp).setPreview(appConfig.isPreview()).build();
    }

    public static OpenMiotCloudImpl getInstance() {
        if (sInstance == null) {
            synchronized (OpenMiotCloudImpl.class) {
                if (sInstance == null) {
                    sInstance = new OpenMiotCloudImpl();
                }
            }
        }
        return sInstance;
    }

    private static RSAPublicKey loadPublicKey(String str) {
        try {
            return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64Coder.decode(str)));
        } catch (NoSuchAlgorithmException unused) {
            throw new Exception("无此算法");
        } catch (InvalidKeySpecException unused2) {
            throw new Exception("公钥非法");
        } catch (NullPointerException unused3) {
            throw new Exception("公钥数据为空");
        }
    }

    public static String specialClientIdDecrypt(String str) {
        byte[] bArr;
        byte[] decode = Base64Coder.decode(str);
        byte[] bArr2 = new byte[decode.length];
        int i = 0;
        int i2 = 0;
        while (i < decode.length) {
            int i3 = i + 256;
            if (i3 < decode.length) {
                bArr = new byte[256];
                System.arraycopy(decode, i, bArr, 0, 256);
                i = i3;
            } else {
                int length = decode.length - i;
                bArr = new byte[length];
                System.arraycopy(decode, i, bArr, 0, length);
                i = decode.length;
            }
            byte[] RSADecrypt = RSADecrypt(bArr);
            System.arraycopy(RSADecrypt, 0, bArr2, i2, RSADecrypt.length);
            i2 += RSADecrypt.length;
        }
        byte[] bArr3 = new byte[i2];
        System.arraycopy(bArr2, 0, bArr3, 0, i2);
        return new String(bArr3);
    }

    public static String specialClientIdEncrypt(JSONObject jSONObject) {
        String str;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("sign", Base64Coder.encode(RSAEncrypt("com.mijiasdk.demo")));
            jSONObject2.put(Packet.DATA, jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String jSONObject3 = jSONObject2.toString();
        int length = jSONObject3.length();
        byte[] bArr = new byte[(length * 2)];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 200;
            if (i3 < length) {
                str = jSONObject3.substring(i, i3);
            } else {
                str = jSONObject3.substring(i, length);
                i3 = length;
            }
            byte[] RSAEncrypt = RSAEncrypt(str);
            System.arraycopy(RSAEncrypt, 0, bArr, i2, RSAEncrypt.length);
            i2 += RSAEncrypt.length;
            i = i3;
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        return Base64Coder.encode(bArr2);
    }

    public int post(final String str, List<NameValuePair> list, final MiotCloud.ResponseHandler responseHandler) {
        C1147y genRequestBody = genRequestBody(list);
        if (genRequestBody == null) {
            return ReturnCode.E_ACCOUNT_NOT_LOGIN;
        }
        String str2 = getCloudUrl() + str;
        String str3 = "";
        for (NameValuePair value : list) {
            str3 = str3 + value.getValue();
        }
        MyLogger.getInstance().log(TAG, "post url: " + str2 + ", body: " + str3);
        C1144x.C1146b bVar = new C1144x.C1146b();
        bVar.mo9856o(str2);
        bVar.mo9853l(genRequestBody);
        OkHttpManager.getInstance().enqueue(bVar.mo9848g(), new HttpCallback<String>() {
            public void onFailed(int i, String str) {
                MyLogger instance = MyLogger.getInstance();
                instance.log(OpenMiotCloudImpl.TAG, "post url: " + str + " onFailed: " + i + " " + str);
                responseHandler.onFailure(i, str);
            }

            public void onSucceed(String str) {
                if (ServiceManager.getInstance().isDemoApp()) {
                    str = OpenMiotCloudImpl.specialClientIdDecrypt(str);
                }
                MyLogger instance = MyLogger.getInstance();
                instance.log(OpenMiotCloudImpl.TAG, "post url: " + str + " onSucceed: " + str);
                try {
                    responseHandler.onSuccess(new JSONObject(str));
                } catch (JSONException e) {
                    e.printStackTrace();
                    responseHandler.onFailure(1012, e.toString());
                }
            }
        });
        return 0;
    }

    public HttpResponse post(String str, List<NameValuePair> list) {
        JSONObject jSONObject;
        String exc;
        People people = this.mPeople;
        int i = ReturnCode.E_ACCOUNT_NOT_LOGIN;
        String str2 = null;
        if (people == null) {
            exc = String.format("%s Not allow, Login required!", new Object[]{str});
        } else {
            C1147y genRequestBody = genRequestBody(list);
            if (genRequestBody == null) {
                exc = "people genRequestBody failed";
            } else {
                String str3 = getCloudUrl() + str;
                String str4 = "";
                if (list != null) {
                    for (NameValuePair value : list) {
                        str4 = str4 + value.getValue();
                    }
                }
                MyLogger.getInstance().log(TAG, "post url: " + str3 + ", body: " + genRequestBody + "\n requestBody: " + str4);
                C1144x.C1146b bVar = new C1144x.C1146b();
                bVar.mo9856o(str3);
                bVar.mo9853l(genRequestBody);
                try {
                    C1150z execute = OkHttpManager.getInstance().execute(bVar.mo9848g());
                    if (!execute.mo9866t()) {
                        i = execute.mo9861o();
                        exc = execute.mo9868u();
                    } else {
                        String t = execute.mo9857k().mo9391t();
                        if (ServiceManager.getInstance().isDemoApp()) {
                            t = specialClientIdDecrypt(t);
                        }
                        MyLogger.getInstance().log(TAG, "Post  request:" + str4 + "  response:" + t);
                        jSONObject = new JSONObject(t);
                        i = 0;
                        return new HttpResponse(i, str2, jSONObject);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    i = 1011;
                    exc = e.toString();
                }
            }
        }
        jSONObject = null;
        str2 = exc;
        return new HttpResponse(i, str2, jSONObject);
    }

    public void setPeople(People people) {
        this.mPeople = people;
    }
}
