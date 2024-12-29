package p011c.p083d.p084a.p085d0.p086m;

/* renamed from: c.d.a.d0.m.g */
public enum C1049g {
    SPDY_SYN_STREAM,
    SPDY_REPLY,
    SPDY_HEADERS,
    HTTP_20_HEADERS;

    /* renamed from: a */
    public boolean mo9550a() {
        return this == SPDY_HEADERS;
    }

    /* renamed from: b */
    public boolean mo9551b() {
        return this == SPDY_REPLY;
    }

    /* renamed from: c */
    public boolean mo9552c() {
        return this == SPDY_REPLY || this == SPDY_HEADERS;
    }

    /* renamed from: d */
    public boolean mo9553d() {
        return this == SPDY_SYN_STREAM;
    }
}
