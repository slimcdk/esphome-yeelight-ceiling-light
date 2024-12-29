package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.cct.internal.C0648a;
import com.google.android.datatransport.cct.internal.C0674j;
import com.google.android.datatransport.cct.internal.C0675k;
import com.google.android.datatransport.cct.internal.C0677l;
import com.google.android.datatransport.cct.internal.C0679m;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.C0685d;
import com.google.firebase.encoders.EncodingException;
import com.miot.common.device.parser.xml.DddTag;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p031f.C3150a;
import p035g.C3187h;
import p035g.C3188i;
import p039h.C3229h;
import p049j1.C3264a;
import p052k.C3285a;
import p059l.C3304b;
import p083q.C3604a;

/* renamed from: com.google.android.datatransport.cct.d */
final class C0642d implements C3229h {

    /* renamed from: a */
    private final C3264a f309a;

    /* renamed from: b */
    private final ConnectivityManager f310b;

    /* renamed from: c */
    private final Context f311c;

    /* renamed from: d */
    final URL f312d;

    /* renamed from: e */
    private final C3604a f313e;

    /* renamed from: f */
    private final C3604a f314f;

    /* renamed from: g */
    private final int f315g;

    /* renamed from: com.google.android.datatransport.cct.d$a */
    static final class C0643a {

        /* renamed from: a */
        final URL f316a;

        /* renamed from: b */
        final C0674j f317b;
        @Nullable

        /* renamed from: c */
        final String f318c;

        C0643a(URL url, C0674j jVar, @Nullable String str) {
            this.f316a = url;
            this.f317b = jVar;
            this.f318c = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0643a mo11107a(URL url) {
            return new C0643a(url, this.f317b, this.f318c);
        }
    }

    /* renamed from: com.google.android.datatransport.cct.d$b */
    static final class C0644b {

        /* renamed from: a */
        final int f319a;
        @Nullable

        /* renamed from: b */
        final URL f320b;

        /* renamed from: c */
        final long f321c;

        C0644b(int i, @Nullable URL url, long j) {
            this.f319a = i;
            this.f320b = url;
            this.f321c = j;
        }
    }

    C0642d(Context context, C3604a aVar, C3604a aVar2) {
        this(context, aVar, aVar2, 40000);
    }

    C0642d(Context context, C3604a aVar, C3604a aVar2, int i) {
        this.f309a = C0674j.m462b();
        this.f311c = context;
        this.f310b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f312d = m338n(C0639a.f301c);
        this.f313e = aVar2;
        this.f314f = aVar;
        this.f315g = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public C0644b m329e(C0643a aVar) {
        GZIPOutputStream gZIPOutputStream;
        InputStream m;
        C3285a.m8858f("CctTransportBackend", "Making request to: %s", aVar.f316a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f316a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f315g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", new Object[]{"3.1.5"}));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f318c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.f309a.mo23827a(aVar.f317b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                C3285a.m8858f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                C3285a.m8854b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                C3285a.m8854b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new C0644b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0);
                }
                if (responseCode != 200) {
                    return new C0644b(responseCode, (URL) null, 0);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    m = m337m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                    C0644b bVar = new C0644b(responseCode, (URL) null, C0679m.m501b(new BufferedReader(new InputStreamReader(m))).mo11200c());
                    if (m != null) {
                        m.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return bVar;
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
                throw th;
                throw th;
            } catch (Throwable th3) {
                if (outputStream != null) {
                    outputStream.close();
                }
                throw th3;
            }
        } catch (ConnectException | UnknownHostException e) {
            C3285a.m8856d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C0644b(500, (URL) null, 0);
        } catch (EncodingException | IOException e2) {
            C3285a.m8856d("CctTransportBackend", "Couldn't encode request, returning with 400", e2);
            return new C0644b(400, (URL) null, 0);
        } catch (Throwable th4) {
            th3.addSuppressed(th4);
        }
    }

    /* renamed from: f */
    private static int m330f(NetworkInfo networkInfo) {
        NetworkConnectionInfo.MobileSubtype mobileSubtype;
        if (networkInfo == null) {
            mobileSubtype = NetworkConnectionInfo.MobileSubtype.UNKNOWN_MOBILE_SUBTYPE;
        } else {
            int subtype = networkInfo.getSubtype();
            if (subtype == -1) {
                mobileSubtype = NetworkConnectionInfo.MobileSubtype.COMBINED;
            } else if (NetworkConnectionInfo.MobileSubtype.forNumber(subtype) != null) {
                return subtype;
            } else {
                return 0;
            }
        }
        return mobileSubtype.getValue();
    }

    /* renamed from: g */
    private static int m331g(NetworkInfo networkInfo) {
        return networkInfo == null ? NetworkConnectionInfo.NetworkType.NONE.getValue() : networkInfo.getType();
    }

    /* renamed from: h */
    private static int m332h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            C3285a.m8856d("CctTransportBackend", "Unable to find version code for package", e);
            return -1;
        }
    }

    /* renamed from: i */
    private C0674j m333i(C0685d dVar) {
        C0675k.C0676a aVar;
        HashMap hashMap = new HashMap();
        for (C3188i next : dVar.mo11212b()) {
            String j = next.mo23706j();
            if (!hashMap.containsKey(j)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                hashMap.put(j, arrayList);
            } else {
                ((List) hashMap.get(j)).add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            C3188i iVar = (C3188i) ((List) entry.getValue()).get(0);
            C0677l.C0678a b = C0677l.m482a().mo11197f(QosTier.DEFAULT).mo11198g(this.f314f.mo25913a()).mo11199h(this.f313e.mo25913a()).mo11193b(ClientInfo.m343a().mo11112c(ClientInfo.ClientType.ANDROID_FIREBASE).mo11111b(C0648a.m355a().mo11145m(Integer.valueOf(iVar.mo23751g("sdk-version"))).mo11142j(iVar.mo23750b("model")).mo11138f(iVar.mo23750b("hardware")).mo11136d(iVar.mo23750b(DddTag.DEVICE)).mo11144l(iVar.mo23750b("product")).mo11143k(iVar.mo23750b("os-uild")).mo11140h(iVar.mo23750b(DddTag.DEVICE_MANUFACTURER)).mo11137e(iVar.mo23750b("fingerprint")).mo11135c(iVar.mo23750b("country")).mo11139g(iVar.mo23750b("locale")).mo11141i(iVar.mo23750b("mcc_mnc")).mo11134b(iVar.mo23750b("application_build")).mo11133a()).mo11110a());
            try {
                b.mo11207i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b.mo11208j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (C3188i iVar2 : (List) entry.getValue()) {
                C3187h e = iVar2.mo23702e();
                C3150a b2 = e.mo23746b();
                if (b2.equals(C3150a.m8421b("proto"))) {
                    aVar = C0675k.m466j(e.mo23745a());
                } else if (b2.equals(C3150a.m8421b("json"))) {
                    aVar = C0675k.m465i(new String(e.mo23745a(), Charset.forName("UTF-8")));
                } else {
                    C3285a.m8859g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b2);
                }
                aVar.mo11176c(iVar2.mo23704f()).mo11177d(iVar2.mo23707k()).mo11181h(iVar2.mo23752h("tz-offset")).mo11178e(NetworkConnectionInfo.m349a().mo11119c(NetworkConnectionInfo.NetworkType.forNumber(iVar2.mo23751g("net-type"))).mo11118b(NetworkConnectionInfo.MobileSubtype.forNumber(iVar2.mo23751g("mobile-subtype"))).mo11117a());
                if (iVar2.mo23701d() != null) {
                    aVar.mo11175b(iVar2.mo23701d());
                }
                arrayList3.add(aVar.mo11174a());
            }
            b.mo11194c(arrayList3);
            arrayList2.add(b.mo11192a());
        }
        return C0674j.m461a(arrayList2);
    }

    /* renamed from: j */
    private static TelephonyManager m334j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    @VisibleForTesting
    /* renamed from: k */
    static long m335k() {
        Calendar.getInstance();
        return (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ C0643a m336l(C0643a aVar, C0644b bVar) {
        URL url = bVar.f320b;
        if (url == null) {
            return null;
        }
        C3285a.m8854b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.mo11107a(bVar.f320b);
    }

    /* renamed from: m */
    private static InputStream m337m(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    /* renamed from: n */
    private static URL m338n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    /* renamed from: a */
    public BackendResponse mo11105a(C0685d dVar) {
        C0674j i = m333i(dVar);
        URL url = this.f312d;
        String str = null;
        if (dVar.mo11213c() != null) {
            try {
                C0639a c = C0639a.m321c(dVar.mo11213c());
                if (c.mo11099d() != null) {
                    str = c.mo11099d();
                }
                if (c.mo11100e() != null) {
                    url = m338n(c.mo11100e());
                }
            } catch (IllegalArgumentException unused) {
                return BackendResponse.m503a();
            }
        }
        try {
            C0644b bVar = (C0644b) C3304b.m8960a(5, new C0643a(url, i, str), new C0640b(this), C0641c.f308a);
            int i2 = bVar.f319a;
            if (i2 == 200) {
                return BackendResponse.m505e(bVar.f321c);
            }
            if (i2 < 500) {
                if (i2 != 404) {
                    return i2 == 400 ? BackendResponse.m504d() : BackendResponse.m503a();
                }
            }
            return BackendResponse.m506f();
        } catch (IOException e) {
            C3285a.m8856d("CctTransportBackend", "Could not make request to the backend", e);
            return BackendResponse.m506f();
        }
    }

    /* renamed from: b */
    public C3188i mo11106b(C3188i iVar) {
        NetworkInfo activeNetworkInfo = this.f310b.getActiveNetworkInfo();
        return iVar.mo23754l().mo23755a("sdk-version", Build.VERSION.SDK_INT).mo23757c("model", Build.MODEL).mo23757c("hardware", Build.HARDWARE).mo23757c(DddTag.DEVICE, Build.DEVICE).mo23757c("product", Build.PRODUCT).mo23757c("os-uild", Build.ID).mo23757c(DddTag.DEVICE_MANUFACTURER, Build.MANUFACTURER).mo23757c("fingerprint", Build.FINGERPRINT).mo23756b("tz-offset", m335k()).mo23755a("net-type", m331g(activeNetworkInfo)).mo23755a("mobile-subtype", m330f(activeNetworkInfo)).mo23757c("country", Locale.getDefault().getCountry()).mo23757c("locale", Locale.getDefault().getLanguage()).mo23757c("mcc_mnc", m334j(this.f311c).getSimOperator()).mo23757c("application_build", Integer.toString(m332h(this.f311c))).mo23709d();
    }
}
