package com.google.zxing.oned;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.zxing.oned.g */
final class C2574g {

    /* renamed from: a */
    private final List<int[]> f4375a = new ArrayList();

    /* renamed from: b */
    private final List<String> f4376b = new ArrayList();

    C2574g() {
    }

    /* renamed from: a */
    private void m7034a(int[] iArr, String str) {
        this.f4375a.add(iArr);
        this.f4376b.add(str);
    }

    /* renamed from: b */
    private synchronized void m7035b() {
        if (this.f4375a.isEmpty()) {
            m7034a(new int[]{0, 19}, "US/CA");
            m7034a(new int[]{30, 39}, "US");
            m7034a(new int[]{60, 139}, "US/CA");
            m7034a(new int[]{300, 379}, "FR");
            m7034a(new int[]{380}, "BG");
            m7034a(new int[]{383}, "SI");
            m7034a(new int[]{385}, "HR");
            m7034a(new int[]{387}, "BA");
            m7034a(new int[]{400, 440}, "DE");
            m7034a(new int[]{450, 459}, "JP");
            m7034a(new int[]{460, 469}, "RU");
            m7034a(new int[]{471}, "TW");
            m7034a(new int[]{474}, "EE");
            m7034a(new int[]{475}, "LV");
            m7034a(new int[]{476}, "AZ");
            m7034a(new int[]{477}, "LT");
            m7034a(new int[]{478}, "UZ");
            m7034a(new int[]{479}, "LK");
            m7034a(new int[]{480}, "PH");
            m7034a(new int[]{481}, "BY");
            m7034a(new int[]{482}, "UA");
            m7034a(new int[]{484}, "MD");
            m7034a(new int[]{485}, "AM");
            m7034a(new int[]{486}, "GE");
            m7034a(new int[]{487}, "KZ");
            m7034a(new int[]{489}, "HK");
            m7034a(new int[]{490, 499}, "JP");
            m7034a(new int[]{500, 509}, "GB");
            m7034a(new int[]{520}, "GR");
            m7034a(new int[]{528}, "LB");
            m7034a(new int[]{529}, "CY");
            m7034a(new int[]{531}, "MK");
            m7034a(new int[]{535}, "MT");
            m7034a(new int[]{539}, "IE");
            m7034a(new int[]{540, 549}, "BE/LU");
            m7034a(new int[]{560}, "PT");
            m7034a(new int[]{569}, "IS");
            m7034a(new int[]{570, 579}, "DK");
            m7034a(new int[]{590}, "PL");
            m7034a(new int[]{594}, "RO");
            m7034a(new int[]{599}, "HU");
            m7034a(new int[]{600, 601}, "ZA");
            m7034a(new int[]{603}, "GH");
            m7034a(new int[]{608}, "BH");
            m7034a(new int[]{609}, "MU");
            m7034a(new int[]{611}, "MA");
            m7034a(new int[]{613}, "DZ");
            m7034a(new int[]{616}, "KE");
            m7034a(new int[]{618}, "CI");
            m7034a(new int[]{619}, "TN");
            m7034a(new int[]{621}, "SY");
            m7034a(new int[]{622}, "EG");
            m7034a(new int[]{624}, "LY");
            m7034a(new int[]{625}, "JO");
            m7034a(new int[]{626}, "IR");
            m7034a(new int[]{627}, "KW");
            m7034a(new int[]{628}, "SA");
            m7034a(new int[]{629}, "AE");
            m7034a(new int[]{640, 649}, "FI");
            m7034a(new int[]{690, 695}, "CN");
            m7034a(new int[]{700, 709}, "NO");
            m7034a(new int[]{729}, "IL");
            m7034a(new int[]{730, 739}, "SE");
            m7034a(new int[]{740}, "GT");
            m7034a(new int[]{741}, "SV");
            m7034a(new int[]{742}, "HN");
            m7034a(new int[]{743}, "NI");
            m7034a(new int[]{744}, "CR");
            m7034a(new int[]{745}, "PA");
            m7034a(new int[]{746}, "DO");
            m7034a(new int[]{750}, "MX");
            m7034a(new int[]{754, 755}, "CA");
            m7034a(new int[]{759}, "VE");
            m7034a(new int[]{760, 769}, "CH");
            m7034a(new int[]{770}, "CO");
            m7034a(new int[]{773}, "UY");
            m7034a(new int[]{775}, "PE");
            m7034a(new int[]{777}, "BO");
            m7034a(new int[]{779}, "AR");
            m7034a(new int[]{780}, "CL");
            m7034a(new int[]{784}, "PY");
            m7034a(new int[]{785}, "PE");
            m7034a(new int[]{786}, "EC");
            m7034a(new int[]{789, 790}, "BR");
            m7034a(new int[]{800, 839}, "IT");
            m7034a(new int[]{840, 849}, "ES");
            m7034a(new int[]{850}, "CU");
            m7034a(new int[]{858}, "SK");
            m7034a(new int[]{859}, "CZ");
            m7034a(new int[]{860}, "YU");
            m7034a(new int[]{865}, "MN");
            m7034a(new int[]{867}, "KP");
            m7034a(new int[]{868, 869}, "TR");
            m7034a(new int[]{870, 879}, "NL");
            m7034a(new int[]{880}, "KR");
            m7034a(new int[]{885}, "TH");
            m7034a(new int[]{888}, "SG");
            m7034a(new int[]{890}, "IN");
            m7034a(new int[]{893}, "VN");
            m7034a(new int[]{896}, "PK");
            m7034a(new int[]{899}, "ID");
            m7034a(new int[]{900, 919}, "AT");
            m7034a(new int[]{930, 939}, "AU");
            m7034a(new int[]{940, 949}, "AZ");
            m7034a(new int[]{955}, "MY");
            m7034a(new int[]{958}, "MO");
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        r4 = r7.f4375a.get(r2);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo19559c(java.lang.String r8) {
        /*
            r7 = this;
            r7.m7035b()
            r0 = 0
            r1 = 3
            java.lang.String r8 = r8.substring(r0, r1)
            int r8 = java.lang.Integer.parseInt(r8)
            java.util.List<int[]> r1 = r7.f4375a
            int r1 = r1.size()
            r2 = 0
        L_0x0014:
            r3 = 0
            if (r2 >= r1) goto L_0x0039
            java.util.List<int[]> r4 = r7.f4375a
            java.lang.Object r4 = r4.get(r2)
            int[] r4 = (int[]) r4
            r5 = r4[r0]
            if (r8 >= r5) goto L_0x0024
            return r3
        L_0x0024:
            int r3 = r4.length
            r6 = 1
            if (r3 != r6) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r5 = r4[r6]
        L_0x002b:
            if (r8 > r5) goto L_0x0036
            java.util.List<java.lang.String> r8 = r7.f4376b
            java.lang.Object r8 = r8.get(r2)
            java.lang.String r8 = (java.lang.String) r8
            return r8
        L_0x0036:
            int r2 = r2 + 1
            goto L_0x0014
        L_0x0039:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.C2574g.mo19559c(java.lang.String):java.lang.String");
    }
}
