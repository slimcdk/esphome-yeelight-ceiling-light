package com.xiaomi.push;

import java.util.Comparator;
import org.apache.http.NameValuePair;

/* renamed from: com.xiaomi.push.cs */
final class C4579cs implements Comparator<NameValuePair> {
    C4579cs() {
    }

    /* renamed from: a */
    public int compare(NameValuePair nameValuePair, NameValuePair nameValuePair2) {
        return nameValuePair.getName().compareTo(nameValuePair2.getName());
    }
}
