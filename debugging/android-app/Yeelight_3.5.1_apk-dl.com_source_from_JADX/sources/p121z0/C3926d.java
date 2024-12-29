package p121z0;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p002a1.C0004a;
import p002a1.C0005b;
import p118y0.C3916f;

/* renamed from: z0.d */
public class C3926d implements C3924b, C0005b {
    @Nullable

    /* renamed from: a */
    private C0004a f6567a;

    @NonNull
    /* renamed from: b */
    private static String m11214b(@NonNull String str, @NonNull Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    /* renamed from: a */
    public void mo5a(@Nullable C0004a aVar) {
        this.f6567a = aVar;
        C3916f.m11190f().mo26399b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    public void onEvent(@NonNull String str, @NonNull Bundle bundle) {
        C0004a aVar = this.f6567a;
        if (aVar != null) {
            try {
                aVar.mo4a("$A$:" + m11214b(str, bundle));
            } catch (JSONException unused) {
                C3916f.m11190f().mo26407k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
