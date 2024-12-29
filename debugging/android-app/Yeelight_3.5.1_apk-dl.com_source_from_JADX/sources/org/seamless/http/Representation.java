package org.seamless.http;

import java.io.Serializable;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import p158f7.C9045a;

public class Representation<E> implements Serializable {
    private C9045a cacheControl;
    private Integer contentLength;
    private String contentType;
    private E entity;
    private String entityTag;
    private Long lastModified;
    private URL url;

    public Representation(C9045a aVar, Integer num, String str, Long l, String str2, E e) {
        this((URL) null, aVar, num, str, l, str2, e);
    }

    public Representation(URL url2, C9045a aVar, Integer num, String str, Long l, String str2, E e) {
        this.url = url2;
        this.cacheControl = aVar;
        this.contentLength = num;
        this.contentType = str;
        this.lastModified = l;
        this.entityTag = str2;
        this.entity = e;
    }

    public Representation(URLConnection uRLConnection, E e) {
        this(uRLConnection.getURL(), C9045a.m21648u(uRLConnection.getHeaderField("Cache-Control")), Integer.valueOf(uRLConnection.getContentLength()), uRLConnection.getContentType(), Long.valueOf(uRLConnection.getLastModified()), uRLConnection.getHeaderField("Etag"), e);
    }

    public C9045a getCacheControl() {
        return this.cacheControl;
    }

    public Integer getContentLength() {
        Integer num = this.contentLength;
        if (num == null || num.intValue() == -1) {
            return null;
        }
        return this.contentLength;
    }

    public String getContentType() {
        return this.contentType;
    }

    public E getEntity() {
        return this.entity;
    }

    public String getEntityTag() {
        return this.entityTag;
    }

    public Long getLastModified() {
        if (this.lastModified.longValue() == 0) {
            return null;
        }
        return this.lastModified;
    }

    public Long getMaxAgeOrNull() {
        if (getCacheControl() == null || getCacheControl().mo36942c() == -1 || getCacheControl().mo36942c() == 0) {
            return null;
        }
        return Long.valueOf((long) getCacheControl().mo36942c());
    }

    public URL getUrl() {
        return this.url;
    }

    public boolean hasBeenModified(long j) {
        return getLastModified() == null || getLastModified().longValue() < j;
    }

    public boolean hasEntityTagChanged(String str) {
        return getEntityTag() != null && !getEntityTag().equals(str);
    }

    public boolean isExpired(long j) {
        return getMaxAgeOrNull() == null || isExpired(j, getMaxAgeOrNull().longValue());
    }

    public boolean isExpired(long j, long j2) {
        return j + (j2 * 1000) < new Date().getTime();
    }

    public boolean isNoCache() {
        return getCacheControl() != null && getCacheControl().mo36948h();
    }

    public boolean isNoStore() {
        return getCacheControl() != null && getCacheControl().mo36950i();
    }

    public boolean mustRevalidate() {
        return getCacheControl() != null && getCacheControl().mo36953l();
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") CT: " + getContentType();
    }
}
