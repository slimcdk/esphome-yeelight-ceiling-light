package com.xiaomi.account.http;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

public class Request {
    public final boolean followRedirects;
    public final Map<String, String> formBody;
    public final Map<String, String> headers;
    public final URI uri;
    public final String url;

    public static class Builder {
        boolean followRedirects = true;
        Map<String, String> formBody;
        Map<String, String> headers;
        URI uri;

        public Builder appendQuery(@Nullable String str) {
            String str2;
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            URI uri2 = this.uri;
            String query = uri2.getQuery();
            if (query == null) {
                str2 = str;
            } else {
                str2 = query + "&" + str;
            }
            try {
                this.uri = new URI(uri2.getScheme(), uri2.getAuthority(), uri2.getPath(), str2, uri2.getFragment());
                return this;
            } catch (URISyntaxException unused) {
                throw new IllegalArgumentException("unexpected newQuery: " + str);
            }
        }

        public Request build() {
            return new Request(this);
        }

        public Builder followRedirects(boolean z) {
            this.followRedirects = z;
            return this;
        }

        public Builder formBody(@Nullable Map<String, String> map) {
            this.formBody = map;
            return this;
        }

        public Builder headers(@Nullable Map<String, String> map) {
            this.headers = map;
            return this;
        }

        public Builder url(String str) {
            try {
                this.uri = new URI(str);
                return this;
            } catch (URISyntaxException unused) {
                throw new IllegalArgumentException("unexpected url: " + str);
            }
        }
    }

    private Request(Builder builder) {
        URI uri2 = builder.uri;
        this.uri = uri2;
        this.url = uri2.toString();
        this.headers = builder.headers;
        this.formBody = builder.formBody;
        this.followRedirects = builder.followRedirects;
    }
}
