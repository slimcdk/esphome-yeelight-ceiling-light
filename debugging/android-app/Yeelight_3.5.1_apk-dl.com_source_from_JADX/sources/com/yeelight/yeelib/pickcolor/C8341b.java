package com.yeelight.yeelib.pickcolor;

import com.google.zxing.BarcodeFormat;
import com.xiaomi.mipush.sdk.Constants;
import java.util.EnumSet;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: com.yeelight.yeelib.pickcolor.b */
final class C8341b {

    /* renamed from: a */
    static final Set<BarcodeFormat> f14396a;

    /* renamed from: b */
    static final Set<BarcodeFormat> f14397b;

    /* renamed from: c */
    private static final Set<BarcodeFormat> f14398c;

    /* renamed from: d */
    static final Set<BarcodeFormat> f14399d = EnumSet.of(BarcodeFormat.QR_CODE);

    /* renamed from: e */
    static final Set<BarcodeFormat> f14400e = EnumSet.of(BarcodeFormat.DATA_MATRIX);

    /* renamed from: f */
    static final Set<BarcodeFormat> f14401f = EnumSet.of(BarcodeFormat.AZTEC);

    /* renamed from: g */
    static final Set<BarcodeFormat> f14402g = EnumSet.of(BarcodeFormat.PDF_417);

    static {
        Pattern.compile(Constants.ACCEPT_TIME_SEPARATOR_SP);
        EnumSet of = EnumSet.of(BarcodeFormat.UPC_A, new BarcodeFormat[]{BarcodeFormat.UPC_E, BarcodeFormat.EAN_13, BarcodeFormat.EAN_8, BarcodeFormat.RSS_14, BarcodeFormat.RSS_EXPANDED});
        f14396a = of;
        EnumSet of2 = EnumSet.of(BarcodeFormat.CODE_39, BarcodeFormat.CODE_93, BarcodeFormat.CODE_128, BarcodeFormat.ITF, BarcodeFormat.CODABAR);
        f14397b = of2;
        EnumSet copyOf = EnumSet.copyOf(of);
        f14398c = copyOf;
        copyOf.addAll(of2);
    }
}
