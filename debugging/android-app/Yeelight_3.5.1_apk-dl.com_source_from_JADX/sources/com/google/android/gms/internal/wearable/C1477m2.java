package com.google.android.gms.internal.wearable;

import org.apache.commons.p194io.IOUtils;

/* renamed from: com.google.android.gms.internal.wearable.m2 */
final class C1477m2 {
    /* renamed from: a */
    static String m3618a(zzau zzau) {
        String str;
        StringBuilder sb = new StringBuilder(zzau.zzc());
        for (int i = 0; i < zzau.zzc(); i++) {
            int zza = zzau.zza(i);
            if (zza == 34) {
                str = "\\\"";
            } else if (zza == 39) {
                str = "\\'";
            } else if (zza != 92) {
                switch (zza) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (zza < 32 || zza > 126) {
                            sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                            sb.append((char) (((zza >>> 6) & 3) + 48));
                            sb.append((char) (((zza >>> 3) & 7) + 48));
                            zza = (zza & 7) + 48;
                        }
                        sb.append((char) zza);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
