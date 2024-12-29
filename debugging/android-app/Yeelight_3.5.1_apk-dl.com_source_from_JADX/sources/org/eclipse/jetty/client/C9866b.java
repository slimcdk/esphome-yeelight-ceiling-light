package org.eclipse.jetty.client;

import com.xiaomi.mipush.sdk.Constants;
import java.net.InetSocketAddress;

/* renamed from: org.eclipse.jetty.client.b */
public class C9866b {

    /* renamed from: a */
    private final String f17900a;

    /* renamed from: b */
    private final int f17901b;

    public C9866b(String str, int i) {
        if (str != null) {
            this.f17900a = str.trim();
            this.f17901b = i;
            return;
        }
        throw new IllegalArgumentException("Host is null");
    }

    /* renamed from: a */
    public String mo39550a() {
        return this.f17900a;
    }

    /* renamed from: b */
    public int mo39551b() {
        return this.f17901b;
    }

    /* renamed from: c */
    public InetSocketAddress mo39552c() {
        return new InetSocketAddress(mo39550a(), mo39551b());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9866b.class != obj.getClass()) {
            return false;
        }
        C9866b bVar = (C9866b) obj;
        return this.f17900a.equals(bVar.f17900a) && this.f17901b == bVar.f17901b;
    }

    public int hashCode() {
        return (this.f17900a.hashCode() * 31) + this.f17901b;
    }

    public String toString() {
        return this.f17900a + Constants.COLON_SEPARATOR + this.f17901b;
    }
}
