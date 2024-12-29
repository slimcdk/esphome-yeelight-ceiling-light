package androidx.constraintlayout.core.parser;

public class CLToken extends CLElement {
    int index = 0;
    char[] tokenFalse = "false".toCharArray();
    char[] tokenNull = "null".toCharArray();
    char[] tokenTrue = "true".toCharArray();
    Type type = Type.UNKNOWN;

    /* renamed from: androidx.constraintlayout.core.parser.CLToken$1 */
    static /* synthetic */ class C01721 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$parser$CLToken$Type;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.constraintlayout.core.parser.CLToken$Type[] r0 = androidx.constraintlayout.core.parser.CLToken.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$androidx$constraintlayout$core$parser$CLToken$Type = r0
                androidx.constraintlayout.core.parser.CLToken$Type r1 = androidx.constraintlayout.core.parser.CLToken.Type.TRUE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$androidx$constraintlayout$core$parser$CLToken$Type     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.parser.CLToken$Type r1 = androidx.constraintlayout.core.parser.CLToken.Type.FALSE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$androidx$constraintlayout$core$parser$CLToken$Type     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.parser.CLToken$Type r1 = androidx.constraintlayout.core.parser.CLToken.Type.NULL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$androidx$constraintlayout$core$parser$CLToken$Type     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.parser.CLToken$Type r1 = androidx.constraintlayout.core.parser.CLToken.Type.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.parser.CLToken.C01721.<clinit>():void");
        }
    }

    enum Type {
        UNKNOWN,
        TRUE,
        FALSE,
        NULL
    }

    public CLToken(char[] cArr) {
        super(cArr);
    }

    public static CLElement allocate(char[] cArr) {
        return new CLToken(cArr);
    }

    public boolean getBoolean() {
        Type type2 = this.type;
        if (type2 == Type.TRUE) {
            return true;
        }
        if (type2 == Type.FALSE) {
            return false;
        }
        throw new CLParsingException("this token is not a boolean: <" + content() + ">", this);
    }

    public Type getType() {
        return this.type;
    }

    public boolean isNull() {
        if (this.type == Type.NULL) {
            return true;
        }
        throw new CLParsingException("this token is not a null: <" + content() + ">", this);
    }

    /* access modifiers changed from: protected */
    public String toFormattedJSON(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        addIndent(sb, i);
        sb.append(content());
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public String toJSON() {
        if (!CLParser.DEBUG) {
            return content();
        }
        return "<" + content() + ">";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        if ((r3 + 1) == r0.length) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0058, code lost:
        if ((r3 + 1) == r0.length) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0068, code lost:
        if ((r3 + 1) == r0.length) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean validate(char r6, long r7) {
        /*
            r5 = this;
            int[] r0 = androidx.constraintlayout.core.parser.CLToken.C01721.$SwitchMap$androidx$constraintlayout$core$parser$CLToken$Type
            androidx.constraintlayout.core.parser.CLToken$Type r1 = r5.type
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x005b
            r3 = 2
            if (r0 == r3) goto L_0x004b
            r3 = 3
            if (r0 == r3) goto L_0x0038
            r7 = 4
            if (r0 == r7) goto L_0x0018
            goto L_0x006b
        L_0x0018:
            char[] r7 = r5.tokenTrue
            int r8 = r5.index
            char r7 = r7[r8]
            if (r7 != r6) goto L_0x0026
            androidx.constraintlayout.core.parser.CLToken$Type r6 = androidx.constraintlayout.core.parser.CLToken.Type.TRUE
        L_0x0022:
            r5.type = r6
            r1 = 1
            goto L_0x006b
        L_0x0026:
            char[] r7 = r5.tokenFalse
            char r7 = r7[r8]
            if (r7 != r6) goto L_0x002f
            androidx.constraintlayout.core.parser.CLToken$Type r6 = androidx.constraintlayout.core.parser.CLToken.Type.FALSE
            goto L_0x0022
        L_0x002f:
            char[] r7 = r5.tokenNull
            char r7 = r7[r8]
            if (r7 != r6) goto L_0x006b
            androidx.constraintlayout.core.parser.CLToken$Type r6 = androidx.constraintlayout.core.parser.CLToken.Type.NULL
            goto L_0x0022
        L_0x0038:
            char[] r0 = r5.tokenNull
            int r3 = r5.index
            char r4 = r0[r3]
            if (r4 != r6) goto L_0x0041
            r1 = 1
        L_0x0041:
            if (r1 == 0) goto L_0x006b
            int r3 = r3 + r2
            int r6 = r0.length
            if (r3 != r6) goto L_0x006b
        L_0x0047:
            r5.setEnd(r7)
            goto L_0x006b
        L_0x004b:
            char[] r0 = r5.tokenFalse
            int r3 = r5.index
            char r4 = r0[r3]
            if (r4 != r6) goto L_0x0054
            r1 = 1
        L_0x0054:
            if (r1 == 0) goto L_0x006b
            int r3 = r3 + r2
            int r6 = r0.length
            if (r3 != r6) goto L_0x006b
            goto L_0x0047
        L_0x005b:
            char[] r0 = r5.tokenTrue
            int r3 = r5.index
            char r4 = r0[r3]
            if (r4 != r6) goto L_0x0064
            r1 = 1
        L_0x0064:
            if (r1 == 0) goto L_0x006b
            int r3 = r3 + r2
            int r6 = r0.length
            if (r3 != r6) goto L_0x006b
            goto L_0x0047
        L_0x006b:
            int r6 = r5.index
            int r6 = r6 + r2
            r5.index = r6
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.parser.CLToken.validate(char, long):boolean");
    }
}
