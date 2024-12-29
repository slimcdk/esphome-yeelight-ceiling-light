package com.miot.service.qrcode;

import android.content.Intent;
import android.net.Uri;
import com.miot.service.qrcode.Intents;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import p011c.p012a.p053e.C0814a;

final class DecodeFormatManager {
    static final Set<C0814a> AZTEC_FORMATS = EnumSet.of(C0814a.AZTEC);
    private static final Pattern COMMA_PATTERN = Pattern.compile(Constants.ACCEPT_TIME_SEPARATOR_SP);
    static final Set<C0814a> DATA_MATRIX_FORMATS = EnumSet.of(C0814a.DATA_MATRIX);
    private static final Map<String, Set<C0814a>> FORMATS_FOR_MODE;
    static final Set<C0814a> INDUSTRIAL_FORMATS = EnumSet.of(C0814a.CODE_39, C0814a.CODE_93, C0814a.CODE_128, C0814a.ITF, C0814a.CODABAR);
    private static final Set<C0814a> ONE_D_FORMATS;
    static final Set<C0814a> PDF417_FORMATS = EnumSet.of(C0814a.PDF_417);
    static final Set<C0814a> PRODUCT_FORMATS = EnumSet.of(C0814a.UPC_A, new C0814a[]{C0814a.UPC_E, C0814a.EAN_13, C0814a.EAN_8, C0814a.RSS_14, C0814a.RSS_EXPANDED});
    static final Set<C0814a> QR_CODE_FORMATS = EnumSet.of(C0814a.QR_CODE);

    static {
        EnumSet<C0814a> copyOf = EnumSet.copyOf(PRODUCT_FORMATS);
        ONE_D_FORMATS = copyOf;
        copyOf.addAll(INDUSTRIAL_FORMATS);
        HashMap hashMap = new HashMap();
        FORMATS_FOR_MODE = hashMap;
        hashMap.put(Intents.Scan.ONE_D_MODE, ONE_D_FORMATS);
        FORMATS_FOR_MODE.put(Intents.Scan.PRODUCT_MODE, PRODUCT_FORMATS);
        FORMATS_FOR_MODE.put(Intents.Scan.QR_CODE_MODE, QR_CODE_FORMATS);
        FORMATS_FOR_MODE.put(Intents.Scan.DATA_MATRIX_MODE, DATA_MATRIX_FORMATS);
        FORMATS_FOR_MODE.put(Intents.Scan.AZTEC_MODE, AZTEC_FORMATS);
        FORMATS_FOR_MODE.put(Intents.Scan.PDF417_MODE, PDF417_FORMATS);
    }

    private DecodeFormatManager() {
    }

    static Set<C0814a> parseDecodeFormats(Intent intent) {
        String stringExtra = intent.getStringExtra(Intents.Scan.FORMATS);
        return parseDecodeFormats(stringExtra != null ? Arrays.asList(COMMA_PATTERN.split(stringExtra)) : null, intent.getStringExtra(Intents.Scan.MODE));
    }

    static Set<C0814a> parseDecodeFormats(Uri uri) {
        List<String> queryParameters = uri.getQueryParameters(Intents.Scan.FORMATS);
        if (!(queryParameters == null || queryParameters.size() != 1 || queryParameters.get(0) == null)) {
            queryParameters = Arrays.asList(COMMA_PATTERN.split(queryParameters.get(0)));
        }
        return parseDecodeFormats(queryParameters, uri.getQueryParameter(Intents.Scan.MODE));
    }

    private static Set<C0814a> parseDecodeFormats(Iterable<String> iterable, String str) {
        if (iterable != null) {
            EnumSet<E> noneOf = EnumSet.noneOf(C0814a.class);
            try {
                for (String valueOf : iterable) {
                    noneOf.add(C0814a.valueOf(valueOf));
                }
                return noneOf;
            } catch (IllegalArgumentException unused) {
            }
        }
        if (str != null) {
            return FORMATS_FOR_MODE.get(str);
        }
        return null;
    }
}
