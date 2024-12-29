package p025d1;

import android.util.Base64;
import android.util.JsonReader;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.crashlytics.internal.model.C2301a;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.miot.common.device.parser.xml.DddTag;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import p015c1.C0628a;
import p049j1.C3264a;
import p061l1.C3310d;

/* renamed from: d1.g */
public class C3126g {

    /* renamed from: a */
    private static final C3264a f5006a = new C3310d().mo24014j(C2301a.f3660a).mo24015k(true).mo24013i();

    /* renamed from: d1.g$a */
    private interface C3127a<T> {
        /* renamed from: a */
        T mo23599a(@NonNull JsonReader jsonReader);
    }

    @NonNull
    /* renamed from: A */
    private static CrashlyticsReport m8313A(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C2263b b = CrashlyticsReport.m5793b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c = 1;
                        break;
                    }
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 2;
                        break;
                    }
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    b.mo18656f(m8338y(jsonReader));
                    break;
                case 1:
                    b.mo18658h(jsonReader.nextString());
                    break;
                case 2:
                    b.mo18652b(jsonReader.nextString());
                    break;
                case 3:
                    b.mo18654d(jsonReader.nextString());
                    break;
                case 4:
                    b.mo18655e(jsonReader.nextString());
                    break;
                case 5:
                    b.mo18657g(jsonReader.nextInt());
                    break;
                case 6:
                    b.mo18653c(jsonReader.nextString());
                    break;
                case 7:
                    b.mo18659i(m8314B(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return b.mo18651a();
    }

    @NonNull
    /* renamed from: B */
    private static CrashlyticsReport.C2270e m8314B(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C2270e.C2274b a = CrashlyticsReport.C2270e.m5851a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -2128794476:
                    if (nextName.equals("startedAt")) {
                        c = 0;
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
                        c = 2;
                        break;
                    }
                    break;
                case -1335157162:
                    if (nextName.equals(DddTag.DEVICE)) {
                        c = 3;
                        break;
                    }
                    break;
                case -1291329255:
                    if (nextName.equals("events")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        c = 5;
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
                        c = 7;
                        break;
                    }
                    break;
                case 286956243:
                    if (nextName.equals("generator")) {
                        c = 8;
                        break;
                    }
                    break;
                case 1025385094:
                    if (nextName.equals("crashed")) {
                        c = 9;
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
                    a.mo18716l(jsonReader.nextLong());
                    break;
                case 1:
                    a.mo18714j(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 2:
                    a.mo18709e(Long.valueOf(jsonReader.nextLong()));
                    break;
                case 3:
                    a.mo18708d(m8326m(jsonReader));
                    break;
                case 4:
                    a.mo18710f(m8324k(jsonReader, C8930a.f16424a));
                    break;
                case 5:
                    a.mo18715k(m8339z(jsonReader));
                    break;
                case 6:
                    a.mo18706b(m8322i(jsonReader));
                    break;
                case 7:
                    a.mo18717m(m8315C(jsonReader));
                    break;
                case 8:
                    a.mo18711g(jsonReader.nextString());
                    break;
                case 9:
                    a.mo18707c(jsonReader.nextBoolean());
                    break;
                case 10:
                    a.mo18712h(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo18705a();
    }

    @NonNull
    /* renamed from: C */
    private static CrashlyticsReport.C2270e.C2299f m8315C(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C2270e.C2299f.C2300a a = CrashlyticsReport.C2270e.C2299f.m6034a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("identifier")) {
                jsonReader.skipValue();
            } else {
                a.mo18846b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo18845a();
    }

    @NonNull
    /* renamed from: i */
    private static CrashlyticsReport.C2270e.C2271a m8322i(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C2270e.C2271a.C2272a a = CrashlyticsReport.C2270e.C2271a.m5867a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c = 0;
                        break;
                    }
                    break;
                case -519438642:
                    if (nextName.equals("developmentPlatform")) {
                        c = 1;
                        break;
                    }
                    break;
                case 213652010:
                    if (nextName.equals("developmentPlatformVersion")) {
                        c = 2;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals(Constants.VERSION)) {
                        c = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo18701e(jsonReader.nextString());
                    break;
                case 1:
                    a.mo18698b(jsonReader.nextString());
                    break;
                case 2:
                    a.mo18699c(jsonReader.nextString());
                    break;
                case 3:
                    a.mo18703g(jsonReader.nextString());
                    break;
                case 4:
                    a.mo18702f(jsonReader.nextString());
                    break;
                case 5:
                    a.mo18700d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo18697a();
    }

    @NonNull
    /* renamed from: j */
    private static CrashlyticsReport.C2261a m8323j(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C2261a.C2262a a = CrashlyticsReport.C2261a.m5806a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 110987:
                    if (nextName.equals(ScanBarcodeActivity.PID)) {
                        c = 0;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c = 1;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c = 2;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 3;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c = 4;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c = 5;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c = 6;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo18644c(jsonReader.nextInt());
                    break;
                case 1:
                    a.mo18646e(jsonReader.nextLong());
                    break;
                case 2:
                    a.mo18648g(jsonReader.nextLong());
                    break;
                case 3:
                    a.mo18649h(jsonReader.nextLong());
                    break;
                case 4:
                    a.mo18645d(jsonReader.nextString());
                    break;
                case 5:
                    a.mo18647f(jsonReader.nextInt());
                    break;
                case 6:
                    a.mo18650i(jsonReader.nextString());
                    break;
                case 7:
                    a.mo18643b(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo18642a();
    }

    @NonNull
    /* renamed from: k */
    private static <T> C0628a<T> m8324k(@NonNull JsonReader jsonReader, @NonNull C3127a<T> aVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.mo23599a(jsonReader));
        }
        jsonReader.endArray();
        return C0628a.m237b(arrayList);
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: l */
    public static CrashlyticsReport.C2264c m8325l(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C2264c.C2265a a = CrashlyticsReport.C2264c.m5833a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("key")) {
                a.mo18663b(jsonReader.nextString());
            } else if (!nextName.equals("value")) {
                jsonReader.skipValue();
            } else {
                a.mo18664c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo18662a();
    }

    @NonNull
    /* renamed from: m */
    private static CrashlyticsReport.C2270e.C2275c m8326m(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C2270e.C2275c.C2276a a = CrashlyticsReport.C2270e.C2275c.m5896a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1981332476:
                    if (nextName.equals("simulator")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1969347631:
                    if (nextName.equals(DddTag.DEVICE_MANUFACTURER)) {
                        c = 1;
                        break;
                    }
                    break;
                case 112670:
                    if (nextName.equals("ram")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c = 3;
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
                        c = 5;
                        break;
                    }
                    break;
                case 104069929:
                    if (nextName.equals("model")) {
                        c = 6;
                        break;
                    }
                    break;
                case 109757585:
                    if (nextName.equals("state")) {
                        c = 7;
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
                    a.mo18735i(jsonReader.nextBoolean());
                    break;
                case 1:
                    a.mo18731e(jsonReader.nextString());
                    break;
                case 2:
                    a.mo18734h(jsonReader.nextLong());
                    break;
                case 3:
                    a.mo18728b(jsonReader.nextInt());
                    break;
                case 4:
                    a.mo18730d(jsonReader.nextLong());
                    break;
                case 5:
                    a.mo18729c(jsonReader.nextInt());
                    break;
                case 6:
                    a.mo18732f(jsonReader.nextString());
                    break;
                case 7:
                    a.mo18736j(jsonReader.nextInt());
                    break;
                case 8:
                    a.mo18733g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo18727a();
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: n */
    public static CrashlyticsReport.C2270e.C2277d m8327n(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C2270e.C2277d.C2292b a = CrashlyticsReport.C2270e.C2277d.m5916a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals(DddTag.DEVICE)) {
                        c = 0;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c = 1;
                        break;
                    }
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo18815c(m8330q(jsonReader));
                    break;
                case 1:
                    a.mo18814b(m8328o(jsonReader));
                    break;
                case 2:
                    a.mo18816d(m8334u(jsonReader));
                    break;
                case 3:
                    a.mo18818f(jsonReader.nextString());
                    break;
                case 4:
                    a.mo18817e(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo18813a();
    }

    @NonNull
    /* renamed from: o */
    private static CrashlyticsReport.C2270e.C2277d.C2278a m8328o(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C2270e.C2277d.C2278a.C2279a a = CrashlyticsReport.C2270e.C2277d.C2278a.m5923a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
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
                        c = 1;
                        break;
                    }
                    break;
                case -80231855:
                    if (nextName.equals("internalKeys")) {
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
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo18750b(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case 1:
                    a.mo18752d(m8331r(jsonReader));
                    break;
                case 2:
                    a.mo18753e(m8324k(jsonReader, C8935f.f16429a));
                    break;
                case 3:
                    a.mo18751c(m8324k(jsonReader, C8935f.f16429a));
                    break;
                case 4:
                    a.mo18754f(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo18749a();
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: p */
    public static CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2281a m8329p(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2281a.C2282a a = CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2281a.m5942a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
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
                        c = 1;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals("uuid")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals("baseAddress")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo18767c(jsonReader.nextString());
                    break;
                case 1:
                    a.mo18768d(jsonReader.nextLong());
                    break;
                case 2:
                    a.mo18770f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 3:
                    a.mo18766b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo18765a();
    }

    @NonNull
    /* renamed from: q */
    private static CrashlyticsReport.C2270e.C2277d.C2293c m8330q(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C2270e.C2277d.C2293c.C2294a a = CrashlyticsReport.C2270e.C2277d.C2293c.m6006a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
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
                        c = 2;
                        break;
                    }
                    break;
                case 279795450:
                    if (nextName.equals("diskUsed")) {
                        c = 3;
                        break;
                    }
                    break;
                case 976541947:
                    if (nextName.equals("ramUsed")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1516795582:
                    if (nextName.equals("proximityOn")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo18826b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case 1:
                    a.mo18827c(jsonReader.nextInt());
                    break;
                case 2:
                    a.mo18829e(jsonReader.nextInt());
                    break;
                case 3:
                    a.mo18828d(jsonReader.nextLong());
                    break;
                case 4:
                    a.mo18831g(jsonReader.nextLong());
                    break;
                case 5:
                    a.mo18830f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo18825a();
    }

    @NonNull
    /* renamed from: r */
    private static CrashlyticsReport.C2270e.C2277d.C2278a.C2280b m8331r(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2283b a = CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.m5936a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1337936983:
                    if (nextName.equals("threads")) {
                        c = 1;
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
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo18772b(m8323j(jsonReader));
                    break;
                case 1:
                    a.mo18776f(m8324k(jsonReader, C8932c.f16426a));
                    break;
                case 2:
                    a.mo18775e(m8335v(jsonReader));
                    break;
                case 3:
                    a.mo18773c(m8324k(jsonReader, C8934e.f16428a));
                    break;
                case 4:
                    a.mo18774d(m8332s(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo18771a();
    }

    @NonNull
    /* renamed from: s */
    private static CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2284c m8332s(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2284c.C2285a a = CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2284c.m5960a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo18784c(m8324k(jsonReader, C8931b.f16425a));
                    break;
                case 1:
                    a.mo18786e(jsonReader.nextString());
                    break;
                case 2:
                    a.mo18787f(jsonReader.nextString());
                    break;
                case 3:
                    a.mo18783b(m8332s(jsonReader));
                    break;
                case 4:
                    a.mo18785d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo18782a();
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: t */
    public static CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.C2290b m8333t(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.C2290b.C2291a a = CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.C2290b.m5988a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals(TypedValues.CycleType.S_WAVE_OFFSET)) {
                        c = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo18810d(jsonReader.nextLong());
                    break;
                case 1:
                    a.mo18812f(jsonReader.nextString());
                    break;
                case 2:
                    a.mo18811e(jsonReader.nextLong());
                    break;
                case 3:
                    a.mo18808b(jsonReader.nextString());
                    break;
                case 4:
                    a.mo18809c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo18807a();
    }

    @NonNull
    /* renamed from: u */
    private static CrashlyticsReport.C2270e.C2277d.C2295d m8334u(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C2270e.C2277d.C2295d.C2296a a = CrashlyticsReport.C2270e.C2277d.C2295d.m6020a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("content")) {
                jsonReader.skipValue();
            } else {
                a.mo18834b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo18833a();
    }

    @NonNull
    /* renamed from: v */
    private static CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2286d m8335v(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2286d.C2287a a = CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2286d.m5972a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1147692044:
                    if (nextName.equals("address")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3059181:
                    if (nextName.equals("code")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo18792b(jsonReader.nextLong());
                    break;
                case 1:
                    a.mo18793c(jsonReader.nextString());
                    break;
                case 2:
                    a.mo18794d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo18791a();
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: w */
    public static CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e m8336w(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.C2289a a = CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.m5980a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo18799b(m8324k(jsonReader, C8931b.f16425a));
                    break;
                case 1:
                    a.mo18801d(jsonReader.nextString());
                    break;
                case 2:
                    a.mo18800c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo18798a();
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: x */
    public static CrashlyticsReport.C2266d.C2268b m8337x(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C2266d.C2268b.C2269a a = CrashlyticsReport.C2266d.C2268b.m5845a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("filename")) {
                a.mo18674c(jsonReader.nextString());
            } else if (!nextName.equals("contents")) {
                jsonReader.skipValue();
            } else {
                a.mo18673b(Base64.decode(jsonReader.nextString(), 2));
            }
        }
        jsonReader.endObject();
        return a.mo18672a();
    }

    @NonNull
    /* renamed from: y */
    private static CrashlyticsReport.C2266d m8338y(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C2266d.C2267a a = CrashlyticsReport.C2266d.m5839a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("files")) {
                a.mo18668b(m8324k(jsonReader, C8933d.f16427a));
            } else if (!nextName.equals("orgId")) {
                jsonReader.skipValue();
            } else {
                a.mo18669c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo18667a();
    }

    @NonNull
    /* renamed from: z */
    private static CrashlyticsReport.C2270e.C2297e m8339z(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C2270e.C2297e.C2298a a = CrashlyticsReport.C2270e.C2297e.m6024a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 0;
                        break;
                    }
                    break;
                case -293026577:
                    if (nextName.equals("jailbroken")) {
                        c = 1;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals(Constants.VERSION)) {
                        c = 2;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo18840b(jsonReader.nextString());
                    break;
                case 1:
                    a.mo18841c(jsonReader.nextBoolean());
                    break;
                case 2:
                    a.mo18843e(jsonReader.nextString());
                    break;
                case 3:
                    a.mo18842d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo18839a();
    }

    @NonNull
    /* renamed from: D */
    public CrashlyticsReport mo23595D(@NonNull String str) {
        JsonReader jsonReader;
        try {
            jsonReader = new JsonReader(new StringReader(str));
            CrashlyticsReport A = m8313A(jsonReader);
            jsonReader.close();
            return A;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @NonNull
    /* renamed from: E */
    public String mo23596E(@NonNull CrashlyticsReport crashlyticsReport) {
        return f5006a.mo23828b(crashlyticsReport);
    }

    @NonNull
    /* renamed from: g */
    public CrashlyticsReport.C2270e.C2277d mo23597g(@NonNull String str) {
        JsonReader jsonReader;
        try {
            jsonReader = new JsonReader(new StringReader(str));
            CrashlyticsReport.C2270e.C2277d n = m8327n(jsonReader);
            jsonReader.close();
            return n;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @NonNull
    /* renamed from: h */
    public String mo23598h(@NonNull CrashlyticsReport.C2270e.C2277d dVar) {
        return f5006a.mo23828b(dVar);
    }
}
