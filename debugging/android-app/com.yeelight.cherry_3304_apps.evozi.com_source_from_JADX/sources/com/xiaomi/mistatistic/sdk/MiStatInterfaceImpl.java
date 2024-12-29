package com.xiaomi.mistatistic.sdk;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class MiStatInterfaceImpl extends MiStatInterface {
    private static MiStatInterfaceImpl mInstance;

    public static synchronized MiStatInterfaceImpl getInstance() {
        MiStatInterfaceImpl miStatInterfaceImpl;
        synchronized (MiStatInterfaceImpl.class) {
            if (mInstance == null) {
                mInstance = new MiStatInterfaceImpl();
            }
            miStatInterfaceImpl = mInstance;
        }
        return miStatInterfaceImpl;
    }

    public void addJavascriptInterface(WebView webView, String str) {
        webView.addJavascriptInterface(this, str);
    }

    @JavascriptInterface
    public void trackCalculateEvent(String str, String str2, long j) {
        MiStatInterface.recordCalculateEvent(str, str2, j, (Map<String, String>) null);
    }

    @JavascriptInterface
    public void trackCountEvent(String str, String str2) {
        MiStatInterface.recordCountEvent(str, str2, (Map<String, String>) null);
    }

    @JavascriptInterface
    public void trackCountEvent(String str, String str2, String str3) {
        HashMap hashMap = null;
        if (!TextUtils.isEmpty(str3)) {
            try {
                JSONObject jSONObject = new JSONObject(str3);
                HashMap hashMap2 = new HashMap();
                try {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        hashMap2.put(next, jSONObject.optString(next));
                    }
                    hashMap = hashMap2;
                } catch (JSONException e) {
                    e = e;
                    hashMap = hashMap2;
                    e.printStackTrace();
                    MiStatInterface.recordCountEvent(str, str2, hashMap);
                }
            } catch (JSONException e2) {
                e = e2;
                e.printStackTrace();
                MiStatInterface.recordCountEvent(str, str2, hashMap);
            }
        }
        MiStatInterface.recordCountEvent(str, str2, hashMap);
    }

    @JavascriptInterface
    public void trackNumericPropertyEvent(String str, String str2, long j) {
        MiStatInterface.recordNumericPropertyEvent(str, str2, j);
    }

    @JavascriptInterface
    public void trackStringPropertyEvent(String str, String str2, String str3) {
        MiStatInterface.recordStringPropertyEvent(str, str2, str3);
    }
}
