package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.miui.pushads.sdk.f;
import com.xiaomi.miui.pushads.sdk.k;
import com.yeelight.yeelib.p150c.p183m.C7230s;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: com.xiaomi.push.cq */
class C4577cq {
    /* renamed from: a */
    public static int m13605a(String str, String str2, C4573cm cmVar) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(new BasicNameValuePair("logValue", cmVar.f8312a));
        linkedList.add(new BasicNameValuePair("appId", str));
        linkedList.add(new BasicNameValuePair("showType", cmVar.f8311a + ""));
        linkedList.add(new BasicNameValuePair(C7230s.f14753G, C4578cr.m13608a(linkedList, str2)));
        try {
            HttpPost httpPost = new HttpPost("http://new.api.ad.xiaomi.com/logNotificationAdActions");
            httpPost.setEntity(new UrlEncodedFormEntity(linkedList, "UTF-8"));
            return 200 == new DefaultHttpClient().execute(httpPost).getStatusLine().getStatusCode() ? 0 : 1;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return 1;
        } catch (ClientProtocolException e2) {
            e2.printStackTrace();
            return 1;
        } catch (IOException e3) {
            e3.printStackTrace();
            return 1;
        }
    }

    /* renamed from: a */
    public static boolean m13606a(Context context) {
        return k.a.a != f.a(context);
    }
}
