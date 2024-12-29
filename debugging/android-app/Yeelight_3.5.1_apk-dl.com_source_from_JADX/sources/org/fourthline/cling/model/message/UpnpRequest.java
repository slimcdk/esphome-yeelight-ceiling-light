package org.fourthline.cling.model.message;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class UpnpRequest extends C10033g {

    /* renamed from: b */
    private Method f18518b;

    /* renamed from: c */
    private URI f18519c;

    public enum Method {
        GET("GET"),
        POST("POST"),
        NOTIFY("NOTIFY"),
        MSEARCH("M-SEARCH"),
        SUBSCRIBE("SUBSCRIBE"),
        UNSUBSCRIBE("UNSUBSCRIBE"),
        UNKNOWN("UNKNOWN");
        
        private static Map<String, Method> byName;
        private String httpName;

        static {
            byName = new HashMap<String, Method>() {
                {
                    for (Method method : Method.values()) {
                        put(method.getHttpName(), method);
                    }
                }
            };
        }

        private Method(String str) {
            this.httpName = str;
        }

        public static Method getByHttpName(String str) {
            if (str == null) {
                return UNKNOWN;
            }
            Method method = byName.get(str.toUpperCase(Locale.ROOT));
            return method != null ? method : UNKNOWN;
        }

        public String getHttpName() {
            return this.httpName;
        }
    }

    public UpnpRequest(Method method) {
        this.f18518b = method;
    }

    public UpnpRequest(Method method, URI uri) {
        this.f18518b = method;
        this.f18519c = uri;
    }

    public UpnpRequest(Method method, URL url) {
        this.f18518b = method;
        if (url != null) {
            try {
                this.f18519c = url.toURI();
            } catch (URISyntaxException e) {
                throw new IllegalArgumentException(e);
            }
        }
    }

    /* renamed from: c */
    public String mo40415c() {
        return this.f18518b.getHttpName();
    }

    /* renamed from: d */
    public Method mo40416d() {
        return this.f18518b;
    }

    /* renamed from: e */
    public URI mo40417e() {
        return this.f18519c;
    }

    /* renamed from: f */
    public void mo40418f(URI uri) {
        this.f18519c = uri;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(mo40415c());
        if (mo40417e() != null) {
            str = " " + mo40417e();
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }
}
