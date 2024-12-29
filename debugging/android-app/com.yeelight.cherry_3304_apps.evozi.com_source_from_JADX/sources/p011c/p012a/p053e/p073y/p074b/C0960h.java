package p011c.p012a.p053e.p073y.p074b;

/* renamed from: c.a.e.y.b.h */
public enum C0960h {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);
    

    /* renamed from: a */
    private final int[] f1123a;

    /* renamed from: b */
    private final int f1124b;

    private C0960h(int[] iArr, int i) {
        this.f1123a = iArr;
        this.f1124b = i;
    }

    /* renamed from: a */
    public static C0960h m1738a(int i) {
        if (i == 0) {
            return TERMINATOR;
        }
        if (i == 1) {
            return NUMERIC;
        }
        if (i == 2) {
            return ALPHANUMERIC;
        }
        if (i == 3) {
            return STRUCTURED_APPEND;
        }
        if (i == 4) {
            return BYTE;
        }
        if (i == 5) {
            return FNC1_FIRST_POSITION;
        }
        if (i == 7) {
            return ECI;
        }
        if (i == 8) {
            return KANJI;
        }
        if (i == 9) {
            return FNC1_SECOND_POSITION;
        }
        if (i == 13) {
            return HANZI;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public int mo9316b() {
        return this.f1124b;
    }

    /* renamed from: c */
    public int mo9317c(C0962j jVar) {
        int j = jVar.mo9324j();
        return this.f1123a[j <= 9 ? 0 : j <= 26 ? (char) 1 : 2];
    }
}
