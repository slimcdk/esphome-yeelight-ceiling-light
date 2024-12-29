package com.google.android.gms.internal.measurement;

import org.apache.commons.p271io.IOUtils;

/* renamed from: com.google.android.gms.internal.measurement.a7 */
final class C1707a7 {
    /* renamed from: a */
    static String m4717a(C1779f3 f3Var) {
        String str;
        C1753d7 d7Var = new C1753d7(f3Var);
        StringBuilder sb = new StringBuilder(d7Var.mo11553C());
        for (int i = 0; i < d7Var.mo11553C(); i++) {
            int a = d7Var.mo11554a(i);
            if (a == 34) {
                str = "\\\"";
            } else if (a == 39) {
                str = "\\'";
            } else if (a != 92) {
                switch (a) {
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
                        if (a < 32 || a > 126) {
                            sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                            sb.append((char) (((a >>> 6) & 3) + 48));
                            sb.append((char) (((a >>> 3) & 7) + 48));
                            a = (a & 7) + 48;
                        }
                        sb.append((char) a);
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
