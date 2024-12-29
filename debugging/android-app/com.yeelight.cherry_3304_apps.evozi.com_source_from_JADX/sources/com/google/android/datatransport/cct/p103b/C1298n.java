package com.google.android.datatransport.cct.p103b;

import android.util.JsonReader;
import android.util.JsonToken;
import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import java.io.IOException;
import java.io.Reader;

@AutoValue
/* renamed from: com.google.android.datatransport.cct.b.n */
public abstract class C1298n {
    @NonNull
    /* renamed from: b */
    public static C1298n m3428b(@NonNull Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (!jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    jsonReader.skipValue();
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    return new C1286h(Long.parseLong(jsonReader.nextString()));
                } else {
                    C1286h hVar = new C1286h(jsonReader.nextLong());
                    jsonReader.close();
                    return hVar;
                }
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    /* renamed from: a */
    public abstract long mo10186a();
}
