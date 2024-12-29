package androidx.constraintlayout.core.parser;

public class CLParser {
    static boolean DEBUG = false;
    private boolean hasComment = false;
    private int lineNumber;
    private String mContent;

    /* renamed from: androidx.constraintlayout.core.parser.CLParser$1 */
    static /* synthetic */ class C01711 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.core.parser.CLParser$TYPE[] r0 = androidx.constraintlayout.core.parser.CLParser.TYPE.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE = r0
                androidx.constraintlayout.core.parser.CLParser$TYPE r1 = androidx.constraintlayout.core.parser.CLParser.TYPE.OBJECT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.parser.CLParser$TYPE r1 = androidx.constraintlayout.core.parser.CLParser.TYPE.ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.parser.CLParser$TYPE r1 = androidx.constraintlayout.core.parser.CLParser.TYPE.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.parser.CLParser$TYPE r1 = androidx.constraintlayout.core.parser.CLParser.TYPE.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.core.parser.CLParser$TYPE r1 = androidx.constraintlayout.core.parser.CLParser.TYPE.KEY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.core.parser.CLParser$TYPE r1 = androidx.constraintlayout.core.parser.CLParser.TYPE.TOKEN     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.parser.CLParser.C01711.<clinit>():void");
        }
    }

    enum TYPE {
        UNKNOWN,
        OBJECT,
        ARRAY,
        NUMBER,
        STRING,
        KEY,
        TOKEN
    }

    public CLParser(String str) {
        this.mContent = str;
    }

    private CLElement createElement(CLElement cLElement, int i, TYPE type, boolean z, char[] cArr) {
        CLElement cLElement2;
        if (DEBUG) {
            System.out.println("CREATE " + type + " at " + cArr[i]);
        }
        switch (C01711.$SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[type.ordinal()]) {
            case 1:
                cLElement2 = CLObject.allocate(cArr);
                break;
            case 2:
                cLElement2 = CLArray.allocate(cArr);
                break;
            case 3:
                cLElement2 = CLString.allocate(cArr);
                break;
            case 4:
                cLElement2 = CLNumber.allocate(cArr);
                break;
            case 5:
                cLElement2 = CLKey.allocate(cArr);
                break;
            case 6:
                cLElement2 = CLToken.allocate(cArr);
                break;
            default:
                cLElement2 = null;
                break;
        }
        i++;
        if (cLElement2 == null) {
            return null;
        }
        cLElement2.setLine(this.lineNumber);
        if (z) {
            cLElement2.setStart((long) i);
        }
        if (cLElement instanceof CLContainer) {
            cLElement2.setContainer((CLContainer) cLElement);
        }
        return cLElement2;
    }

    private CLElement getNextJsonElement(int i, char c, CLElement cLElement, char[] cArr) {
        if (c == 9 || c == 10 || c == 13 || c == ' ') {
            return cLElement;
        }
        if (c == '\"' || c == '\'') {
            if (cLElement instanceof CLObject) {
                return createElement(cLElement, i, TYPE.KEY, true, cArr);
            }
            return createElement(cLElement, i, TYPE.STRING, true, cArr);
        } else if (c != '[') {
            if (c != ']') {
                if (c == '{') {
                    return createElement(cLElement, i, TYPE.OBJECT, true, cArr);
                } else if (c != '}') {
                    switch (c) {
                        case '+':
                        case '-':
                        case '.':
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            return createElement(cLElement, i, TYPE.NUMBER, true, cArr);
                        case ',':
                        case ':':
                            return cLElement;
                        case '/':
                            int i2 = i + 1;
                            if (i2 >= cArr.length || cArr[i2] != '/') {
                                return cLElement;
                            }
                            this.hasComment = true;
                            return cLElement;
                        default:
                            if (!(cLElement instanceof CLContainer) || (cLElement instanceof CLObject)) {
                                return createElement(cLElement, i, TYPE.KEY, true, cArr);
                            }
                            CLElement createElement = createElement(cLElement, i, TYPE.TOKEN, true, cArr);
                            CLToken cLToken = (CLToken) createElement;
                            if (cLToken.validate(c, (long) i)) {
                                return createElement;
                            }
                            throw new CLParsingException("incorrect token <" + c + "> at line " + this.lineNumber, cLToken);
                    }
                }
            }
            cLElement.setEnd((long) (i - 1));
            CLElement container = cLElement.getContainer();
            container.setEnd((long) i);
            return container;
        } else {
            return createElement(cLElement, i, TYPE.ARRAY, true, cArr);
        }
    }

    public static CLObject parse(String str) {
        return new CLParser(str).parse();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005f, code lost:
        if (r9 == '}') goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0068, code lost:
        if (r9 == ']') goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.constraintlayout.core.parser.CLObject parse() {
        /*
            r16 = this;
            r0 = r16
            java.lang.String r1 = r0.mContent
            char[] r1 = r1.toCharArray()
            int r2 = r1.length
            r3 = 1
            r0.lineNumber = r3
            r4 = 0
            r5 = 0
        L_0x000e:
            r6 = -1
            r7 = 10
            if (r5 >= r2) goto L_0x0024
            char r8 = r1[r5]
            r9 = 123(0x7b, float:1.72E-43)
            if (r8 != r9) goto L_0x001a
            goto L_0x0025
        L_0x001a:
            if (r8 != r7) goto L_0x0021
            int r6 = r0.lineNumber
            int r6 = r6 + r3
            r0.lineNumber = r6
        L_0x0021:
            int r5 = r5 + 1
            goto L_0x000e
        L_0x0024:
            r5 = -1
        L_0x0025:
            if (r5 == r6) goto L_0x0173
            androidx.constraintlayout.core.parser.CLObject r6 = androidx.constraintlayout.core.parser.CLObject.allocate(r1)
            int r8 = r0.lineNumber
            r6.setLine(r8)
            long r8 = (long) r5
            r6.setStart(r8)
            int r5 = r5 + r3
            r8 = r6
        L_0x0036:
            if (r5 >= r2) goto L_0x0132
            char r9 = r1[r5]
            if (r9 != r7) goto L_0x0041
            int r10 = r0.lineNumber
            int r10 = r10 + r3
            r0.lineNumber = r10
        L_0x0041:
            boolean r10 = r0.hasComment
            if (r10 == 0) goto L_0x0049
            if (r9 != r7) goto L_0x012c
            r0.hasComment = r4
        L_0x0049:
            if (r8 != 0) goto L_0x004d
            goto L_0x0132
        L_0x004d:
            boolean r10 = r8.isDone()
            if (r10 == 0) goto L_0x0059
        L_0x0053:
            androidx.constraintlayout.core.parser.CLElement r8 = r0.getNextJsonElement(r5, r9, r8, r1)
            goto L_0x0113
        L_0x0059:
            boolean r10 = r8 instanceof androidx.constraintlayout.core.parser.CLObject
            r11 = 125(0x7d, float:1.75E-43)
            if (r10 == 0) goto L_0x0062
            if (r9 != r11) goto L_0x0053
        L_0x0061:
            goto L_0x007c
        L_0x0062:
            boolean r10 = r8 instanceof androidx.constraintlayout.core.parser.CLArray
            r12 = 93
            if (r10 == 0) goto L_0x006b
            if (r9 != r12) goto L_0x0053
            goto L_0x0061
        L_0x006b:
            boolean r10 = r8 instanceof androidx.constraintlayout.core.parser.CLString
            r13 = 1
            if (r10 == 0) goto L_0x0084
            long r10 = r8.start
            int r12 = (int) r10
            char r12 = r1[r12]
            if (r12 != r9) goto L_0x0113
            long r10 = r10 + r13
            r8.setStart(r10)
        L_0x007c:
            int r9 = r5 + -1
            long r9 = (long) r9
            r8.setEnd(r9)
            goto L_0x0113
        L_0x0084:
            boolean r15 = r8 instanceof androidx.constraintlayout.core.parser.CLToken
            if (r15 == 0) goto L_0x00b8
            r15 = r8
            androidx.constraintlayout.core.parser.CLToken r15 = (androidx.constraintlayout.core.parser.CLToken) r15
            long r3 = (long) r5
            boolean r3 = r15.validate(r9, r3)
            if (r3 == 0) goto L_0x0093
            goto L_0x00b8
        L_0x0093:
            androidx.constraintlayout.core.parser.CLParsingException r1 = new androidx.constraintlayout.core.parser.CLParsingException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "parsing incorrect token "
            r2.append(r3)
            java.lang.String r3 = r15.content()
            r2.append(r3)
            java.lang.String r3 = " at line "
            r2.append(r3)
            int r3 = r0.lineNumber
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r15)
            throw r1
        L_0x00b8:
            boolean r3 = r8 instanceof androidx.constraintlayout.core.parser.CLKey
            if (r3 != 0) goto L_0x00be
            if (r10 == 0) goto L_0x00d7
        L_0x00be:
            long r3 = r8.start
            int r10 = (int) r3
            char r10 = r1[r10]
            r15 = 39
            if (r10 == r15) goto L_0x00cb
            r15 = 34
            if (r10 != r15) goto L_0x00d7
        L_0x00cb:
            if (r10 != r9) goto L_0x00d7
            long r3 = r3 + r13
            r8.setStart(r3)
            int r3 = r5 + -1
            long r3 = (long) r3
            r8.setEnd(r3)
        L_0x00d7:
            boolean r3 = r8.isDone()
            if (r3 != 0) goto L_0x0113
            if (r9 == r11) goto L_0x00f7
            if (r9 == r12) goto L_0x00f7
            r3 = 44
            if (r9 == r3) goto L_0x00f7
            r3 = 32
            if (r9 == r3) goto L_0x00f7
            r3 = 9
            if (r9 == r3) goto L_0x00f7
            r3 = 13
            if (r9 == r3) goto L_0x00f7
            if (r9 == r7) goto L_0x00f7
            r3 = 58
            if (r9 != r3) goto L_0x0113
        L_0x00f7:
            int r3 = r5 + -1
            long r3 = (long) r3
            r8.setEnd(r3)
            if (r9 == r11) goto L_0x0101
            if (r9 != r12) goto L_0x0113
        L_0x0101:
            androidx.constraintlayout.core.parser.CLElement r8 = r8.getContainer()
            r8.setEnd(r3)
            boolean r9 = r8 instanceof androidx.constraintlayout.core.parser.CLKey
            if (r9 == 0) goto L_0x0113
            androidx.constraintlayout.core.parser.CLElement r8 = r8.getContainer()
            r8.setEnd(r3)
        L_0x0113:
            boolean r3 = r8.isDone()
            if (r3 == 0) goto L_0x012c
            boolean r3 = r8 instanceof androidx.constraintlayout.core.parser.CLKey
            if (r3 == 0) goto L_0x0128
            r3 = r8
            androidx.constraintlayout.core.parser.CLKey r3 = (androidx.constraintlayout.core.parser.CLKey) r3
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r3 = r3.mElements
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x012c
        L_0x0128:
            androidx.constraintlayout.core.parser.CLElement r8 = r8.getContainer()
        L_0x012c:
            int r5 = r5 + 1
            r3 = 1
            r4 = 0
            goto L_0x0036
        L_0x0132:
            if (r8 == 0) goto L_0x0154
            boolean r1 = r8.isDone()
            if (r1 != 0) goto L_0x0154
            boolean r1 = r8 instanceof androidx.constraintlayout.core.parser.CLString
            if (r1 == 0) goto L_0x0148
            long r3 = r8.start
            int r1 = (int) r3
            r3 = 1
            int r1 = r1 + r3
            long r4 = (long) r1
            r8.setStart(r4)
            goto L_0x0149
        L_0x0148:
            r3 = 1
        L_0x0149:
            int r1 = r2 + -1
            long r4 = (long) r1
            r8.setEnd(r4)
            androidx.constraintlayout.core.parser.CLElement r8 = r8.getContainer()
            goto L_0x0132
        L_0x0154:
            boolean r1 = DEBUG
            if (r1 == 0) goto L_0x0172
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Root: "
            r2.append(r3)
            java.lang.String r3 = r6.toJSON()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.println(r2)
        L_0x0172:
            return r6
        L_0x0173:
            androidx.constraintlayout.core.parser.CLParsingException r1 = new androidx.constraintlayout.core.parser.CLParsingException
            r2 = 0
            java.lang.String r3 = "invalid json content"
            r1.<init>(r3, r2)
            goto L_0x017d
        L_0x017c:
            throw r1
        L_0x017d:
            goto L_0x017c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.parser.CLParser.parse():androidx.constraintlayout.core.parser.CLObject");
    }
}
