package com.google.firebase.crashlytics.internal.model.p127w;

import android.util.Base64;
import android.util.JsonReader;
import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.C3086a;
import com.google.firebase.crashlytics.internal.model.C3165v;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.p128f.C3177a;
import com.google.firebase.p128f.p130h.C3188d;
import com.miot.common.device.parser.xml.DddTag;
import com.xiaomi.mistatistic.sdk.BaseService;
import java.util.ArrayList;

/* renamed from: com.google.firebase.crashlytics.internal.model.w.h */
public class C3173h {

    /* renamed from: a */
    private static final C3177a f6137a;

    /* renamed from: com.google.firebase.crashlytics.internal.model.w.h$a */
    private interface C3174a<T> {
        /* renamed from: a */
        T mo17736a(@NonNull JsonReader jsonReader);
    }

    static {
        C3188d dVar = new C3188d();
        dVar.mo17761g(C3086a.f5939a);
        dVar.mo17762h(true);
        f6137a = dVar.mo17760f();
    }

    @NonNull
    /* renamed from: A */
    private static CrashlyticsReport.C3054d.C3081e m9878A(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C3054d.C3081e.C3082a a = CrashlyticsReport.C3054d.C3081e.m9616a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 2;
                        break;
                    }
                    break;
                case -293026577:
                    if (nextName.equals("jailbroken")) {
                        c = 3;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                a.mo17626d(jsonReader.nextInt());
            } else if (c == 1) {
                a.mo17627e(jsonReader.nextString());
            } else if (c == 2) {
                a.mo17624b(jsonReader.nextString());
            } else if (c != 3) {
                jsonReader.skipValue();
            } else {
                a.mo17625c(jsonReader.nextBoolean());
            }
        }
        jsonReader.endObject();
        return a.mo17623a();
    }

    @NonNull
    /* renamed from: B */
    private static CrashlyticsReport m9879B(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C3047a b = CrashlyticsReport.m9410b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c = 7;
                        break;
                    }
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c = 0;
                        break;
                    }
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 4;
                        break;
                    }
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c = 1;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    b.mo17450h(jsonReader.nextString());
                    break;
                case 1:
                    b.mo17446d(jsonReader.nextString());
                    break;
                case 2:
                    b.mo17449g(jsonReader.nextInt());
                    break;
                case 3:
                    b.mo17447e(jsonReader.nextString());
                    break;
                case 4:
                    b.mo17444b(jsonReader.nextString());
                    break;
                case 5:
                    b.mo17445c(jsonReader.nextString());
                    break;
                case 6:
                    b.mo17451i(m9880C(jsonReader));
                    break;
                case 7:
                    b.mo17448f(m9905z(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return b.mo17443a();
    }

    @NonNull
    /* renamed from: C */
    private static CrashlyticsReport.C3054d m9880C(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C3054d.C3058b a = CrashlyticsReport.C3054d.m9451a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -2128794476:
                    if (nextName.equals("startedAt")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1606742899:
                    if (nextName.equals("endedAt")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1335157162:
                    if (nextName.equals(DddTag.DEVICE)) {
                        c = 8;
                        break;
                    }
                    break;
                case -1291329255:
                    if (nextName.equals("events")) {
                        c = 9;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        c = 7;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3599307:
                    if (nextName.equals("user")) {
                        c = 5;
                        break;
                    }
                    break;
                case 286956243:
                    if (nextName.equals("generator")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1025385094:
                    if (nextName.equals("crashed")) {
                        c = 4;
                        break;
                    }
                    break;
                case 2047016109:
                    if (nextName.equals("generatorType")) {
                        c = 10;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo17499g(jsonReader.nextString());
                    break;
                case 1:
                    a.mo17502j(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 2:
                    a.mo17504l(jsonReader.nextLong());
                    break;
                case 3:
                    a.mo17497e(Long.valueOf(jsonReader.nextLong()));
                    break;
                case 4:
                    a.mo17495c(jsonReader.nextBoolean());
                    break;
                case 5:
                    a.mo17505m(m9881D(jsonReader));
                    break;
                case 6:
                    a.mo17494b(m9890k(jsonReader));
                    break;
                case 7:
                    a.mo17503k(m9878A(jsonReader));
                    break;
                case 8:
                    a.mo17496d(m9893n(jsonReader));
                    break;
                case 9:
                    a.mo17498f(m9891l(jsonReader, C3166a.m9864b()));
                    break;
                case 10:
                    a.mo17500h(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo17493a();
    }

    @NonNull
    /* renamed from: D */
    private static CrashlyticsReport.C3054d.C3083f m9881D(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C3054d.C3083f.C3084a a = CrashlyticsReport.C3054d.C3083f.m9626a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            if (nextName.hashCode() == -1618432855 && nextName.equals("identifier")) {
                c = 0;
            }
            if (c != 0) {
                jsonReader.skipValue();
            } else {
                a.mo17630b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo17629a();
    }

    /* renamed from: a */
    private static /* synthetic */ void m9882a(Throwable th, AutoCloseable autoCloseable) {
        if (th != null) {
            try {
                autoCloseable.close();
            } catch (Throwable unused) {
            }
        } else {
            autoCloseable.close();
        }
    }

    @NonNull
    /* renamed from: k */
    private static CrashlyticsReport.C3054d.C3055a m9890k(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C3054d.C3055a.C3056a a = CrashlyticsReport.C3054d.C3055a.m9467a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c = 0;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c = 1;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                a.mo17489c(jsonReader.nextString());
            } else if (c == 1) {
                a.mo17491e(jsonReader.nextString());
            } else if (c == 2) {
                a.mo17488b(jsonReader.nextString());
            } else if (c != 3) {
                jsonReader.skipValue();
            } else {
                a.mo17490d(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo17487a();
    }

    @NonNull
    /* renamed from: l */
    private static <T> C3165v<T> m9891l(@NonNull JsonReader jsonReader, @NonNull C3174a<T> aVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.mo17736a(jsonReader));
        }
        jsonReader.endArray();
        return C3165v.m9862c(arrayList);
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: m */
    public static CrashlyticsReport.C3048b m9892m(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C3048b.C3049a a = CrashlyticsReport.C3048b.m9433a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 106079) {
                if (hashCode == 111972721 && nextName.equals("value")) {
                    c = 1;
                }
            } else if (nextName.equals(BaseService.KEY)) {
                c = 0;
            }
            if (c == 0) {
                a.mo17455b(jsonReader.nextString());
            } else if (c != 1) {
                jsonReader.skipValue();
            } else {
                a.mo17456c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo17454a();
    }

    @NonNull
    /* renamed from: n */
    private static CrashlyticsReport.C3054d.C3059c m9893n(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C3054d.C3059c.C3060a a = CrashlyticsReport.C3054d.C3059c.m9492a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1981332476:
                    if (nextName.equals("simulator")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1969347631:
                    if (nextName.equals(DddTag.DEVICE_MANUFACTURER)) {
                        c = 7;
                        break;
                    }
                    break;
                case 112670:
                    if (nextName.equals("ram")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c = 0;
                        break;
                    }
                    break;
                case 81784169:
                    if (nextName.equals("diskSpace")) {
                        c = 4;
                        break;
                    }
                    break;
                case 94848180:
                    if (nextName.equals("cores")) {
                        c = 2;
                        break;
                    }
                    break;
                case 104069929:
                    if (nextName.equals("model")) {
                        c = 1;
                        break;
                    }
                    break;
                case 109757585:
                    if (nextName.equals("state")) {
                        c = 6;
                        break;
                    }
                    break;
                case 2078953423:
                    if (nextName.equals("modelClass")) {
                        c = 8;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo17516b(jsonReader.nextInt());
                    break;
                case 1:
                    a.mo17520f(jsonReader.nextString());
                    break;
                case 2:
                    a.mo17517c(jsonReader.nextInt());
                    break;
                case 3:
                    a.mo17522h(jsonReader.nextLong());
                    break;
                case 4:
                    a.mo17518d(jsonReader.nextLong());
                    break;
                case 5:
                    a.mo17523i(jsonReader.nextBoolean());
                    break;
                case 6:
                    a.mo17524j(jsonReader.nextInt());
                    break;
                case 7:
                    a.mo17519e(jsonReader.nextString());
                    break;
                case 8:
                    a.mo17521g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo17515a();
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: o */
    public static CrashlyticsReport.C3054d.C3061d m9894o(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C3054d.C3061d.C3076b a = CrashlyticsReport.C3054d.C3061d.m9512a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals(DddTag.DEVICE)) {
                        c = 3;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c = 2;
                        break;
                    }
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 1;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                a.mo17601e(jsonReader.nextLong());
            } else if (c == 1) {
                a.mo17602f(jsonReader.nextString());
            } else if (c == 2) {
                a.mo17598b(m9895p(jsonReader));
            } else if (c == 3) {
                a.mo17599c(m9897r(jsonReader));
            } else if (c != 4) {
                jsonReader.skipValue();
            } else {
                a.mo17600d(m9901v(jsonReader));
            }
        }
        jsonReader.endObject();
        return a.mo17597a();
    }

    @NonNull
    /* renamed from: p */
    private static CrashlyticsReport.C3054d.C3061d.C3062a m9895p(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C3054d.C3061d.C3062a.C3063a a = CrashlyticsReport.C3054d.C3061d.C3062a.m9519a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1332194002:
                    if (nextName.equals("background")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1090974952:
                    if (nextName.equals("execution")) {
                        c = 2;
                        break;
                    }
                    break;
                case 555169704:
                    if (nextName.equals("customAttributes")) {
                        c = 3;
                        break;
                    }
                    break;
                case 928737948:
                    if (nextName.equals("uiOrientation")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                a.mo17537b(Boolean.valueOf(jsonReader.nextBoolean()));
            } else if (c == 1) {
                a.mo17540e(jsonReader.nextInt());
            } else if (c == 2) {
                a.mo17539d(m9898s(jsonReader));
            } else if (c != 3) {
                jsonReader.skipValue();
            } else {
                a.mo17538c(m9891l(jsonReader, C3168c.m9868b()));
            }
        }
        jsonReader.endObject();
        return a.mo17536a();
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: q */
    public static CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3065a m9896q(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3065a.C3066a a = CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3065a.m9535a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals("size")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals("uuid")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals("baseAddress")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                a.mo17552c(jsonReader.nextString());
            } else if (c == 1) {
                a.mo17551b(jsonReader.nextLong());
            } else if (c == 2) {
                a.mo17553d(jsonReader.nextLong());
            } else if (c != 3) {
                jsonReader.skipValue();
            } else {
                a.mo17555f(Base64.decode(jsonReader.nextString(), 2));
            }
        }
        jsonReader.endObject();
        return a.mo17550a();
    }

    @NonNull
    /* renamed from: r */
    private static CrashlyticsReport.C3054d.C3061d.C3077c m9897r(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C3054d.C3061d.C3077c.C3078a a = CrashlyticsReport.C3054d.C3061d.C3077c.m9598a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1708606089:
                    if (nextName.equals("batteryLevel")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1455558134:
                    if (nextName.equals("batteryVelocity")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1439500848:
                    if (nextName.equals("orientation")) {
                        c = 4;
                        break;
                    }
                    break;
                case 279795450:
                    if (nextName.equals("diskUsed")) {
                        c = 2;
                        break;
                    }
                    break;
                case 976541947:
                    if (nextName.equals("ramUsed")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1516795582:
                    if (nextName.equals("proximityOn")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                a.mo17610b(Double.valueOf(jsonReader.nextDouble()));
            } else if (c == 1) {
                a.mo17611c(jsonReader.nextInt());
            } else if (c == 2) {
                a.mo17612d(jsonReader.nextLong());
            } else if (c == 3) {
                a.mo17614f(jsonReader.nextBoolean());
            } else if (c == 4) {
                a.mo17613e(jsonReader.nextInt());
            } else if (c != 5) {
                jsonReader.skipValue();
            } else {
                a.mo17615g(jsonReader.nextLong());
            }
        }
        jsonReader.endObject();
        return a.mo17609a();
    }

    @NonNull
    /* renamed from: s */
    private static CrashlyticsReport.C3054d.C3061d.C3062a.C3064b m9898s(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3067b a = CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.m9530a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1337936983:
                    if (nextName.equals("threads")) {
                        c = 0;
                        break;
                    }
                    break;
                case -902467928:
                    if (nextName.equals("signal")) {
                        c = 2;
                        break;
                    }
                    break;
                case 937615455:
                    if (nextName.equals("binaries")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1481625679:
                    if (nextName.equals("exception")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                a.mo17560e(m9891l(jsonReader, C3169d.m9870b()));
            } else if (c == 1) {
                a.mo17558c(m9899t(jsonReader));
            } else if (c == 2) {
                a.mo17559d(m9902w(jsonReader));
            } else if (c != 3) {
                jsonReader.skipValue();
            } else {
                a.mo17557b(m9891l(jsonReader, C3170e.m9872b()));
            }
        }
        jsonReader.endObject();
        return a.mo17556a();
    }

    @NonNull
    /* renamed from: t */
    private static CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3068c m9899t(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3068c.C3069a a = CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3068c.m9552a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 1;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 3;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c = 0;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                a.mo17567b(m9899t(jsonReader));
            } else if (c == 1) {
                a.mo17568c(m9891l(jsonReader, C3171f.m9874b()));
            } else if (c == 2) {
                a.mo17569d(jsonReader.nextInt());
            } else if (c == 3) {
                a.mo17571f(jsonReader.nextString());
            } else if (c != 4) {
                jsonReader.skipValue();
            } else {
                a.mo17570e(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo17566a();
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: u */
    public static CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3074b m9900u(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3074b.C3075a a = CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3074b.m9580a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c = 2;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                a.mo17593c(jsonReader.nextInt());
            } else if (c == 1) {
                a.mo17592b(jsonReader.nextString());
            } else if (c == 2) {
                a.mo17594d(jsonReader.nextLong());
            } else if (c == 3) {
                a.mo17595e(jsonReader.nextLong());
            } else if (c != 4) {
                jsonReader.skipValue();
            } else {
                a.mo17596f(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo17591a();
    }

    @NonNull
    /* renamed from: v */
    private static CrashlyticsReport.C3054d.C3061d.C3079d m9901v(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C3054d.C3061d.C3079d.C3080a a = CrashlyticsReport.C3054d.C3061d.C3079d.m9612a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            if (nextName.hashCode() == 951530617 && nextName.equals("content")) {
                c = 0;
            }
            if (c != 0) {
                jsonReader.skipValue();
            } else {
                a.mo17618b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo17617a();
    }

    @NonNull
    /* renamed from: w */
    private static CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3070d m9902w(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3070d.C3071a a = CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3070d.m9564a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -1147692044) {
                if (hashCode != 3059181) {
                    if (hashCode == 3373707 && nextName.equals("name")) {
                        c = 0;
                    }
                } else if (nextName.equals("code")) {
                    c = 1;
                }
            } else if (nextName.equals("address")) {
                c = 2;
            }
            if (c == 0) {
                a.mo17578d(jsonReader.nextString());
            } else if (c == 1) {
                a.mo17577c(jsonReader.nextString());
            } else if (c != 2) {
                jsonReader.skipValue();
            } else {
                a.mo17576b(jsonReader.nextLong());
            }
        }
        jsonReader.endObject();
        return a.mo17575a();
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: x */
    public static CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e m9903x(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3073a a = CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.m9572a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -1266514778) {
                if (hashCode != 3373707) {
                    if (hashCode == 2125650548 && nextName.equals("importance")) {
                        c = 0;
                    }
                } else if (nextName.equals("name")) {
                    c = 1;
                }
            } else if (nextName.equals("frames")) {
                c = 2;
            }
            if (c == 0) {
                a.mo17584c(jsonReader.nextInt());
            } else if (c == 1) {
                a.mo17585d(jsonReader.nextString());
            } else if (c != 2) {
                jsonReader.skipValue();
            } else {
                a.mo17583b(m9891l(jsonReader, C3172g.m9876b()));
            }
        }
        jsonReader.endObject();
        return a.mo17582a();
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: y */
    public static CrashlyticsReport.C3050c.C3052b m9904y(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C3050c.C3052b.C3053a a = CrashlyticsReport.C3050c.C3052b.m9445a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -734768633) {
                if (hashCode == -567321830 && nextName.equals("contents")) {
                    c = 1;
                }
            } else if (nextName.equals("filename")) {
                c = 0;
            }
            if (c == 0) {
                a.mo17466c(jsonReader.nextString());
            } else if (c != 1) {
                jsonReader.skipValue();
            } else {
                a.mo17465b(Base64.decode(jsonReader.nextString(), 2));
            }
        }
        jsonReader.endObject();
        return a.mo17464a();
    }

    @NonNull
    /* renamed from: z */
    private static CrashlyticsReport.C3050c m9905z(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C3050c.C3051a a = CrashlyticsReport.C3050c.m9439a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 97434231) {
                if (hashCode == 106008351 && nextName.equals("orgId")) {
                    c = 1;
                }
            } else if (nextName.equals("files")) {
                c = 0;
            }
            if (c == 0) {
                a.mo17460b(m9891l(jsonReader, C3167b.m9866b()));
            } else if (c != 1) {
                jsonReader.skipValue();
            } else {
                a.mo17461c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo17459a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        m9882a(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0019, code lost:
        throw r1;
     */
    @androidx.annotation.NonNull
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport mo17737E(@androidx.annotation.NonNull java.lang.String r3) {
        /*
            r2 = this;
            android.util.JsonReader r0 = new android.util.JsonReader     // Catch:{ IllegalStateException -> 0x001a }
            java.io.StringReader r1 = new java.io.StringReader     // Catch:{ IllegalStateException -> 0x001a }
            r1.<init>(r3)     // Catch:{ IllegalStateException -> 0x001a }
            r0.<init>(r1)     // Catch:{ IllegalStateException -> 0x001a }
            r3 = 0
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport r1 = m9879B(r0)     // Catch:{ all -> 0x0013 }
            m9882a(r3, r0)     // Catch:{ IllegalStateException -> 0x001a }
            return r1
        L_0x0013:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0015 }
        L_0x0015:
            r1 = move-exception
            m9882a(r3, r0)     // Catch:{ IllegalStateException -> 0x001a }
            throw r1     // Catch:{ IllegalStateException -> 0x001a }
        L_0x001a:
            r3 = move-exception
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.p127w.C3173h.mo17737E(java.lang.String):com.google.firebase.crashlytics.internal.model.CrashlyticsReport");
    }

    @NonNull
    /* renamed from: F */
    public String mo17738F(@NonNull CrashlyticsReport crashlyticsReport) {
        return f6137a.mo17751b(crashlyticsReport);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        m9882a(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0019, code lost:
        throw r1;
     */
    @androidx.annotation.NonNull
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.C3054d.C3061d mo17739i(@androidx.annotation.NonNull java.lang.String r3) {
        /*
            r2 = this;
            android.util.JsonReader r0 = new android.util.JsonReader     // Catch:{ IllegalStateException -> 0x001a }
            java.io.StringReader r1 = new java.io.StringReader     // Catch:{ IllegalStateException -> 0x001a }
            r1.<init>(r3)     // Catch:{ IllegalStateException -> 0x001a }
            r0.<init>(r1)     // Catch:{ IllegalStateException -> 0x001a }
            r3 = 0
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d r1 = m9894o(r0)     // Catch:{ all -> 0x0013 }
            m9882a(r3, r0)     // Catch:{ IllegalStateException -> 0x001a }
            return r1
        L_0x0013:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0015 }
        L_0x0015:
            r1 = move-exception
            m9882a(r3, r0)     // Catch:{ IllegalStateException -> 0x001a }
            throw r1     // Catch:{ IllegalStateException -> 0x001a }
        L_0x001a:
            r3 = move-exception
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.p127w.C3173h.mo17739i(java.lang.String):com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d");
    }

    @NonNull
    /* renamed from: j */
    public String mo17740j(@NonNull CrashlyticsReport.C3054d.C3061d dVar) {
        return f6137a.mo17751b(dVar);
    }
}
