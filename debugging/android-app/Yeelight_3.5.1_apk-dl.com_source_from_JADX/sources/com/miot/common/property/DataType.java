package com.miot.common.property;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Locale;

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
    static /* synthetic */ class C28591 {
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
            throw new UnsupportedOperationException("Method not decompiled: com.miot.common.property.DataType.C28591.<clinit>():void");
        }
    }

    private Class<?> getJavaDataType() {
        switch (C28591.$SwitchMap$com$miot$common$property$DataType[ordinal()]) {
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

    public static DataType retrieveType(String str) {
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        upperCase.hashCode();
        char c = 65535;
        switch (upperCase.hashCode()) {
            case -1838656495:
                if (upperCase.equals("STRING")) {
                    c = 0;
                    break;
                }
                break;
            case -1791666433:
                if (upperCase.equals("UINT16")) {
                    c = 1;
                    break;
                }
                break;
            case -1791666375:
                if (upperCase.equals("UINT32")) {
                    c = 2;
                    break;
                }
                break;
            case -1791666280:
                if (upperCase.equals("UINT64")) {
                    c = 3;
                    break;
                }
                break;
            case -1618932450:
                if (upperCase.equals("INTEGER")) {
                    c = 4;
                    break;
                }
                break;
            case 72655:
                if (upperCase.equals("INT")) {
                    c = 5;
                    break;
                }
                break;
            case 84000:
                if (upperCase.equals("UI4")) {
                    c = 6;
                    break;
                }
                break;
            case 2044650:
                if (upperCase.equals("BOOL")) {
                    c = 7;
                    break;
                }
                break;
            case 2342524:
                if (upperCase.equals("LONG")) {
                    c = 8;
                    break;
                }
                break;
            case 66988604:
                if (upperCase.equals("FLOAT")) {
                    c = 9;
                    break;
                }
                break;
            case 80751646:
                if (upperCase.equals("UINT8")) {
                    c = 10;
                    break;
                }
                break;
            case 782694408:
                if (upperCase.equals("BOOLEAN")) {
                    c = 11;
                    break;
                }
                break;
            case 2022338513:
                if (upperCase.equals("DOUBLE")) {
                    c = 12;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return STRING;
            case 1:
                return UINT16;
            case 2:
            case 6:
                return UINT32;
            case 3:
            case 8:
                return UINT64;
            case 4:
            case 5:
                return INT;
            case 7:
            case 11:
                return BOOL;
            case 9:
            case 12:
                return FLOAT;
            case 10:
                return UINT8;
            default:
                throw new IllegalArgumentException("not support dataType: " + str);
        }
    }

    public Object createObjectValue() {
        switch (C28591.$SwitchMap$com$miot$common$property$DataType[ordinal()]) {
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
        switch (C28591.$SwitchMap$com$miot$common$property$DataType[ordinal()]) {
            case 1:
                return TypedValues.Custom.S_BOOLEAN;
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
            switch (C28591.$SwitchMap$com$miot$common$property$DataType[ordinal()]) {
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
            int[] r0 = com.miot.common.property.DataType.C28591.$SwitchMap$com$miot$common$property$DataType
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
