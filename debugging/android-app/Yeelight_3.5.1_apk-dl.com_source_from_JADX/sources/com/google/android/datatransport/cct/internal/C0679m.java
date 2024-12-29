package com.google.android.datatransport.cct.internal;

import android.util.JsonReader;
import android.util.JsonToken;
import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import java.io.IOException;
import java.io.Reader;

@AutoValue
/* renamed from: com.google.android.datatransport.cct.internal.m */
public abstract class C0679m {
    /* renamed from: a */
    static C0679m m500a(long j) {
        return new C0670h(j);
    }

    @NonNull
    /* renamed from: b */
    public static C0679m m501b(@NonNull Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (!jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    jsonReader.skipValue();
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    return m500a(Long.parseLong(jsonReader.nextString()));
                } else {
                    C0679m a = m500a(jsonReader.nextLong());
                    jsonReader.close();
                    return a;
                }
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    /* renamed from: c */
    public abstract long mo11200c();
}
