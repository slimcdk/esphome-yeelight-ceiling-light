package com.yeelight.yeelib.pickcolor;

import com.xiaomi.mipush.sdk.Constants;
import java.util.EnumSet;
import java.util.Set;
import java.util.regex.Pattern;
import p011c.p012a.p053e.C0814a;

/* renamed from: com.yeelight.yeelib.pickcolor.c */
final class C9917c {

    /* renamed from: a */
    static final Set<C0814a> f18067a = EnumSet.of(C0814a.UPC_A, new C0814a[]{C0814a.UPC_E, C0814a.EAN_13, C0814a.EAN_8, C0814a.RSS_14, C0814a.RSS_EXPANDED});

    /* renamed from: b */
    static final Set<C0814a> f18068b = EnumSet.of(C0814a.CODE_39, C0814a.CODE_93, C0814a.CODE_128, C0814a.ITF, C0814a.CODABAR);

    /* renamed from: c */
    private static final Set<C0814a> f18069c;

    /* renamed from: d */
    static final Set<C0814a> f18070d = EnumSet.of(C0814a.QR_CODE);

    /* renamed from: e */
    static final Set<C0814a> f18071e = EnumSet.of(C0814a.DATA_MATRIX);

    /* renamed from: f */
    static final Set<C0814a> f18072f = EnumSet.of(C0814a.AZTEC);

    /* renamed from: g */
    static final Set<C0814a> f18073g = EnumSet.of(C0814a.PDF_417);

    static {
        Pattern.compile(Constants.ACCEPT_TIME_SEPARATOR_SP);
        EnumSet<C0814a> copyOf = EnumSet.copyOf(f18067a);
        f18069c = copyOf;
        copyOf.addAll(f18068b);
    }
}
