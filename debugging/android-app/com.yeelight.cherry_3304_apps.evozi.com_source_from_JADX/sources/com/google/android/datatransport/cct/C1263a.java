package com.google.android.datatransport.cct;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p011c.p012a.p019b.p020a.C0459b;
import p011c.p012a.p019b.p020a.p021i.C0479f;

/* renamed from: com.google.android.datatransport.cct.a */
public final class C1263a implements C0479f {

    /* renamed from: c */
    static final String f2264c = C1309f.m3451a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");

    /* renamed from: d */
    static final String f2265d = C1309f.m3451a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");

    /* renamed from: e */
    private static final String f2266e = C1309f.m3451a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");

    /* renamed from: f */
    private static final Set<C0459b> f2267f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C0459b[]{C0459b.m41b("proto"), C0459b.m41b("json")})));
    @NonNull

    /* renamed from: a */
    private final String f2268a;
    @Nullable

    /* renamed from: b */
    private final String f2269b;

    public C1263a(@NonNull String str, @Nullable String str2) {
        this.f2268a = str;
        this.f2269b = str2;
    }

    @NonNull
    /* renamed from: c */
    public static C1263a m3298c(@NonNull byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new C1263a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    /* renamed from: a */
    public Set<C0459b> mo8452a() {
        return f2267f;
    }

    @Nullable
    /* renamed from: b */
    public byte[] mo10113b() {
        if (this.f2269b == null && this.f2268a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f2268a;
        objArr[2] = "\\";
        String str = this.f2269b;
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    @Nullable
    /* renamed from: d */
    public String mo10114d() {
        return this.f2269b;
    }

    @NonNull
    /* renamed from: e */
    public String mo10115e() {
        return this.f2268a;
    }

    @Nullable
    public byte[] getExtras() {
        return mo10113b();
    }

    @NonNull
    public String getName() {
        return "cct";
    }
}
