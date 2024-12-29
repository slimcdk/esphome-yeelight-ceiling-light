package com.miot.common.property;

public enum DataType {
    BOOL,
    UINT8,
    UINT16,
    INT,
    UINT32,
    UINT64,
    FLOAT,
    STRING;

    /* renamed from: com.miot.common.property.DataType$1 */
    static /* synthetic */ class C35861 {
        static final /* synthetic */ int[] $SwitchMap$com$miot$common$property$DataType = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.miot.common.property.DataType[] r0 = com.miot.common.property.DataType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$miot$common$property$DataType = r0
                com.miot.common.property.DataType r1 = com.miot.common.property.DataType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$miot$common$property$DataType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.miot.common.property.DataType r1 = com.miot.common.property.DataType.UINT8     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$miot$common$property$DataType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.miot.common.property.DataType r1 = com.miot.common.property.DataType.UINT16     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$miot$common$property$DataType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.miot.common.property.DataType r1 = com.miot.common.property.DataType.INT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$miot$common$property$DataType     // Catch:{ NoSuchFieldError -> 0x003e }
                com.miot.common.property.DataType r1 = com.miot.common.property.DataType.UINT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$miot$common$property$DataType     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.miot.common.property.DataType r1 = com.miot.common.property.DataType.UINT64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$miot$common$property$DataType     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.miot.common.property.DataType r1 = com.miot.common.property.DataType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$com$miot$common$property$DataType     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.miot.common.property.DataType r1 = com.miot.common.property.DataType.STRING     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.miot.common.property.DataType.C35861.<clinit>():void");
        }
    }

    private Class<?> getJavaDataType() {
        switch (C35861.$SwitchMap$com$miot$common$property$DataType[ordinal()]) {
            case 1:
                return Boolean.class;
            case 2:
            case 3:
            case 4:
                return Integer.class;
            case 5:
            case 6:
                return Long.class;
            case 7:
                return Double.class;
            case 8:
                return String.class;
            default:
                return null;
        }
    }

    public static DataType retrieveType(Class<?> cls) {
        return retrieveType(cls.getSimpleName());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.miot.common.property.DataType retrieveType(java.lang.String r3) {
        /*
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r0 = r3.toUpperCase(r0)
            int r1 = r0.hashCode()
            switch(r1) {
                case -1838656495: goto L_0x008e;
                case -1791666433: goto L_0x0084;
                case -1791666375: goto L_0x007a;
                case -1791666280: goto L_0x006f;
                case -1618932450: goto L_0x0065;
                case 72655: goto L_0x005b;
                case 84000: goto L_0x0051;
                case 2044650: goto L_0x0047;
                case 2342524: goto L_0x003c;
                case 66988604: goto L_0x0031;
                case 80751646: goto L_0x0026;
                case 782694408: goto L_0x001b;
                case 2022338513: goto L_0x000f;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0099
        L_0x000f:
            java.lang.String r1 = "DOUBLE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0099
            r0 = 11
            goto L_0x009a
        L_0x001b:
            java.lang.String r1 = "BOOLEAN"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0099
            r0 = 1
            goto L_0x009a
        L_0x0026:
            java.lang.String r1 = "UINT8"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0099
            r0 = 2
            goto L_0x009a
        L_0x0031:
            java.lang.String r1 = "FLOAT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0099
            r0 = 10
            goto L_0x009a
        L_0x003c:
            java.lang.String r1 = "LONG"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0099
            r0 = 9
            goto L_0x009a
        L_0x0047:
            java.lang.String r1 = "BOOL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0099
            r0 = 0
            goto L_0x009a
        L_0x0051:
            java.lang.String r1 = "UI4"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0099
            r0 = 7
            goto L_0x009a
        L_0x005b:
            java.lang.String r1 = "INT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0099
            r0 = 4
            goto L_0x009a
        L_0x0065:
            java.lang.String r1 = "INTEGER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0099
            r0 = 5
            goto L_0x009a
        L_0x006f:
            java.lang.String r1 = "UINT64"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0099
            r0 = 8
            goto L_0x009a
        L_0x007a:
            java.lang.String r1 = "UINT32"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0099
            r0 = 6
            goto L_0x009a
        L_0x0084:
            java.lang.String r1 = "UINT16"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0099
            r0 = 3
            goto L_0x009a
        L_0x008e:
            java.lang.String r1 = "STRING"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0099
            r0 = 12
            goto L_0x009a
        L_0x0099:
            r0 = -1
        L_0x009a:
            switch(r0) {
                case 0: goto L_0x00c9;
                case 1: goto L_0x00c9;
                case 2: goto L_0x00c6;
                case 3: goto L_0x00c3;
                case 4: goto L_0x00c0;
                case 5: goto L_0x00c0;
                case 6: goto L_0x00bd;
                case 7: goto L_0x00bd;
                case 8: goto L_0x00ba;
                case 9: goto L_0x00ba;
                case 10: goto L_0x00b7;
                case 11: goto L_0x00b7;
                case 12: goto L_0x00b4;
                default: goto L_0x009d;
            }
        L_0x009d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "not support dataType: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L_0x00b4:
            com.miot.common.property.DataType r3 = STRING
            goto L_0x00cb
        L_0x00b7:
            com.miot.common.property.DataType r3 = FLOAT
            goto L_0x00cb
        L_0x00ba:
            com.miot.common.property.DataType r3 = UINT64
            goto L_0x00cb
        L_0x00bd:
            com.miot.common.property.DataType r3 = UINT32
            goto L_0x00cb
        L_0x00c0:
            com.miot.common.property.DataType r3 = INT
            goto L_0x00cb
        L_0x00c3:
            com.miot.common.property.DataType r3 = UINT16
            goto L_0x00cb
        L_0x00c6:
            com.miot.common.property.DataType r3 = UINT8
            goto L_0x00cb
        L_0x00c9:
            com.miot.common.property.DataType r3 = BOOL
        L_0x00cb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.common.property.DataType.retrieveType(java.lang.String):com.miot.common.property.DataType");
    }

    public Object createObjectValue() {
        switch (C35861.$SwitchMap$com$miot$common$property$DataType[ordinal()]) {
            case 1:
                return Boolean.FALSE;
            case 2:
            case 3:
            case 4:
                return 0;
            case 5:
            case 6:
                return 0L;
            case 7:
                return Double.valueOf(0.0d);
            case 8:
                return "";
            default:
                return null;
        }
    }

    public String getObjectType() {
        return getJavaDataType().getSimpleName();
    }

    public String getPrimitiveType() {
        switch (C35861.$SwitchMap$com$miot$common$property$DataType[ordinal()]) {
            case 1:
                return "boolean";
            case 2:
            case 3:
            case 4:
                return "int";
            case 5:
            case 6:
                return "long";
            case 7:
                return "double";
            case 8:
                return "String";
            default:
                return null;
        }
    }

    public Object toObjectValue(String str) {
        if (str == null) {
            return null;
        }
        try {
            Object obj = str;
            switch (C35861.$SwitchMap$com$miot$common$property$DataType[ordinal()]) {
                case 1:
                    obj = Boolean.valueOf(str);
                    break;
                case 2:
                case 3:
                case 4:
                    obj = Integer.valueOf(str);
                    break;
                case 5:
                case 6:
                    obj = Long.valueOf(str);
                    break;
                case 7:
                    obj = Double.valueOf(str);
                    break;
                case 8:
                    break;
                default:
                    obj = null;
                    break;
            }
            return obj;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        if ((r4 instanceof java.lang.Long) == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if ((r4 instanceof java.lang.Double) == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean validate(java.lang.Object r4) {
        /*
            r3 = this;
            int[] r0 = com.miot.common.property.DataType.C35861.$SwitchMap$com$miot$common$property$DataType
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 0
            r2 = 1
            switch(r0) {
                case 1: goto L_0x0028;
                case 2: goto L_0x0025;
                case 3: goto L_0x0025;
                case 4: goto L_0x0025;
                case 5: goto L_0x001a;
                case 6: goto L_0x001a;
                case 7: goto L_0x0011;
                case 8: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x002a
        L_0x000e:
            boolean r2 = r4 instanceof java.lang.String
            goto L_0x002a
        L_0x0011:
            boolean r0 = r4 instanceof java.lang.Float
            if (r0 != 0) goto L_0x0022
            boolean r4 = r4 instanceof java.lang.Double
            if (r4 == 0) goto L_0x0023
            goto L_0x0022
        L_0x001a:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x0022
            boolean r4 = r4 instanceof java.lang.Long
            if (r4 == 0) goto L_0x0023
        L_0x0022:
            r1 = 1
        L_0x0023:
            r2 = r1
            goto L_0x002a
        L_0x0025:
            boolean r2 = r4 instanceof java.lang.Integer
            goto L_0x002a
        L_0x0028:
            boolean r2 = r4 instanceof java.lang.Boolean
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.common.property.DataType.validate(java.lang.Object):boolean");
    }
}
