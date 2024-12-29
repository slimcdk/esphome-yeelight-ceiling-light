package com.google.android.datatransport.cct;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p031f.C3150a;
import p035g.C3186g;

/* renamed from: com.google.android.datatransport.cct.a */
public final class C0639a implements C3186g {

    /* renamed from: c */
    static final String f301c;

    /* renamed from: d */
    static final String f302d;

    /* renamed from: e */
    private static final String f303e;

    /* renamed from: f */
    private static final Set<C3150a> f304f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C3150a[]{C3150a.m8421b("proto"), C3150a.m8421b("json")})));
    @NonNull

    /* renamed from: a */
    private final String f305a;
    @Nullable

    /* renamed from: b */
    private final String f306b;

    static {
        String a = C0645e.m342a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f301c = a;
        String a2 = C0645e.m342a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f302d = a2;
        String a3 = C0645e.m342a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f303e = a3;
        new C0639a(a, (String) null);
        new C0639a(a2, a3);
    }

    public C0639a(@NonNull String str, @Nullable String str2) {
        this.f305a = str;
        this.f306b = str2;
    }

    @NonNull
    /* renamed from: c */
    public static C0639a m321c(@NonNull byte[] bArr) {
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
                    return new C0639a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    /* renamed from: a */
    public Set<C3150a> mo11097a() {
        return f304f;
    }

    @Nullable
    /* renamed from: b */
    public byte[] mo11098b() {
        String str = this.f306b;
        if (str == null && this.f305a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f305a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    @Nullable
    /* renamed from: d */
    public String mo11099d() {
        return this.f306b;
    }

    @NonNull
    /* renamed from: e */
    public String mo11100e() {
        return this.f305a;
    }

    @Nullable
    public byte[] getExtras() {
        return mo11098b();
    }

    @NonNull
    public String getName() {
        return "cct";
    }
}
