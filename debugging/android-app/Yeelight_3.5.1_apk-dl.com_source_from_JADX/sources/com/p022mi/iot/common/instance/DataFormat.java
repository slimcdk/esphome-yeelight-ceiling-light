package com.p022mi.iot.common.instance;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* renamed from: com.mi.iot.common.instance.DataFormat */
public enum DataFormat {
    BOOL,
    UINT8,
    UINT16,
    UINT32,
    INT8,
    INT16,
    INT32,
    INT64,
    FLOAT,
    STRING;

    /* renamed from: com.mi.iot.common.instance.DataFormat$1 */
    static /* synthetic */ class C27071 {
        static final /* synthetic */ int[] $SwitchMap$com$mi$iot$common$instance$DataFormat = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.mi.iot.common.instance.DataFormat[] r0 = com.p022mi.iot.common.instance.DataFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$mi$iot$common$instance$DataFormat = r0
                com.mi.iot.common.instance.DataFormat r1 = com.p022mi.iot.common.instance.DataFormat.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$mi$iot$common$instance$DataFormat     // Catch:{ NoSuchFieldError -> 0x001d }
                com.mi.iot.common.instance.DataFormat r1 = com.p022mi.iot.common.instance.DataFormat.UINT8     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$mi$iot$common$instance$DataFormat     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.mi.iot.common.instance.DataFormat r1 = com.p022mi.iot.common.instance.DataFormat.UINT16     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$mi$iot$common$instance$DataFormat     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.mi.iot.common.instance.DataFormat r1 = com.p022mi.iot.common.instance.DataFormat.UINT32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$mi$iot$common$instance$DataFormat     // Catch:{ NoSuchFieldError -> 0x003e }
                com.mi.iot.common.instance.DataFormat r1 = com.p022mi.iot.common.instance.DataFormat.INT8     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$mi$iot$common$instance$DataFormat     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.mi.iot.common.instance.DataFormat r1 = com.p022mi.iot.common.instance.DataFormat.INT16     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$mi$iot$common$instance$DataFormat     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.mi.iot.common.instance.DataFormat r1 = com.p022mi.iot.common.instance.DataFormat.INT32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$com$mi$iot$common$instance$DataFormat     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.mi.iot.common.instance.DataFormat r1 = com.p022mi.iot.common.instance.DataFormat.INT64     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$com$mi$iot$common$instance$DataFormat     // Catch:{ NoSuchFieldError -> 0x006c }
                com.mi.iot.common.instance.DataFormat r1 = com.p022mi.iot.common.instance.DataFormat.FLOAT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = $SwitchMap$com$mi$iot$common$instance$DataFormat     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.mi.iot.common.instance.DataFormat r1 = com.p022mi.iot.common.instance.DataFormat.STRING     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p022mi.iot.common.instance.DataFormat.C27071.<clinit>():void");
        }
    }

    public static DataFormat retrieveType(String str) {
        try {
            return valueOf(str.toUpperCase());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Object createObjectValue() {
        switch (C27071.$SwitchMap$com$mi$iot$common$instance$DataFormat[ordinal()]) {
            case 1:
                return Boolean.FALSE;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return 0;
            case 8:
                return 0L;
            case 9:
                return Double.valueOf(0.0d);
            case 10:
                return "";
            default:
                return null;
        }
    }

    public Class<?> getJavaClass() {
        switch (C27071.$SwitchMap$com$mi$iot$common$instance$DataFormat[ordinal()]) {
            case 1:
                return Boolean.class;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return Integer.class;
            case 8:
                return Long.class;
            case 9:
                return Double.class;
            case 10:
                return String.class;
            default:
                return null;
        }
    }

    public String getObjectType() {
        return getJavaClass().getSimpleName();
    }

    public String getPrimitiveType() {
        switch (C27071.$SwitchMap$com$mi$iot$common$instance$DataFormat[ordinal()]) {
            case 1:
                return TypedValues.Custom.S_BOOLEAN;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return "int";
            case 8:
                return "long";
            case 9:
                return "double";
            case 10:
                return "String";
            default:
                return null;
        }
    }

    public boolean isTypeValid(Object obj) {
        switch (C27071.$SwitchMap$com$mi$iot$common$instance$DataFormat[ordinal()]) {
            case 1:
                return obj instanceof Boolean;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return obj instanceof Number;
            case 10:
                return obj instanceof String;
            default:
                return true;
        }
    }

    public boolean isValueValid(Object obj) {
        return true;
    }

    public Object toObjectValue(String str) {
        if (str == null) {
            return null;
        }
        try {
            Object obj = str;
            switch (C27071.$SwitchMap$com$mi$iot$common$instance$DataFormat[ordinal()]) {
                case 1:
                    obj = Boolean.valueOf(str);
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    obj = Integer.valueOf(str);
                    break;
                case 8:
                    obj = Long.valueOf(str);
                    break;
                case 9:
                    obj = Double.valueOf(str);
                    break;
                case 10:
                    break;
                default:
                    obj = null;
                    break;
            }
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean validate(Object obj) {
        return isTypeValid(obj) && isValueValid(obj);
    }
}
