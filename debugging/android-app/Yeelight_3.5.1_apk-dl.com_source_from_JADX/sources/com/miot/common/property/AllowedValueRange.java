package com.miot.common.property;

import android.os.Parcel;
import android.os.Parcelable;

public class AllowedValueRange extends AllowedValue implements Parcelable {
    public static final Parcelable.Creator<AllowedValueRange> CREATOR = new Parcelable.Creator<AllowedValueRange>() {
        public AllowedValueRange createFromParcel(Parcel parcel) {
            return new AllowedValueRange(parcel);
        }

        public AllowedValueRange[] newArray(int i) {
            return new AllowedValueRange[i];
        }
    };
    private static final String TAG = "AllowedValueRange";
    private Object mMaxValue;
    private Object mMinValue;

    /* renamed from: com.miot.common.property.AllowedValueRange$2 */
    static /* synthetic */ class C28582 {
        static final /* synthetic */ int[] $SwitchMap$com$miot$common$property$DataType;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
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
                com.miot.common.property.DataType r1 = com.miot.common.property.DataType.UINT8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$miot$common$property$DataType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.miot.common.property.DataType r1 = com.miot.common.property.DataType.UINT16     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$miot$common$property$DataType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.miot.common.property.DataType r1 = com.miot.common.property.DataType.INT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$miot$common$property$DataType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.miot.common.property.DataType r1 = com.miot.common.property.DataType.UINT32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$miot$common$property$DataType     // Catch:{ NoSuchFieldError -> 0x003e }
                com.miot.common.property.DataType r1 = com.miot.common.property.DataType.UINT64     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$miot$common$property$DataType     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.miot.common.property.DataType r1 = com.miot.common.property.DataType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.miot.common.property.AllowedValueRange.C28582.<clinit>():void");
        }
    }

    private AllowedValueRange() {
    }

    public AllowedValueRange(Parcel parcel) {
        readFromParcel(parcel);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0059, code lost:
        if (java.lang.Integer.compare(((java.lang.Integer) r9).intValue(), ((java.lang.Integer) r8).intValue()) >= 0) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005c, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002f, code lost:
        if (java.lang.Double.compare(((java.lang.Double) r9).doubleValue(), ((java.lang.Double) r8).doubleValue()) >= 0) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0044, code lost:
        if (java.lang.Long.compare(((java.lang.Long) r9).longValue(), ((java.lang.Long) r8).longValue()) >= 0) goto L_0x005d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AllowedValueRange(com.miot.common.property.DataType r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            r6 = this;
            r6.<init>(r7)
            boolean r0 = r6.isTypeValid(r9)
            if (r0 == 0) goto L_0x0075
            boolean r0 = r6.isTypeValid(r8)
            if (r0 == 0) goto L_0x006d
            int[] r0 = com.miot.common.property.AllowedValueRange.C28582.$SwitchMap$com$miot$common$property$DataType
            int r7 = r7.ordinal()
            r7 = r0[r7]
            r0 = 1
            r1 = 0
            switch(r7) {
                case 1: goto L_0x0047;
                case 2: goto L_0x0047;
                case 3: goto L_0x0047;
                case 4: goto L_0x0032;
                case 5: goto L_0x0032;
                case 6: goto L_0x001d;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x005e
        L_0x001d:
            r7 = r9
            java.lang.Double r7 = (java.lang.Double) r7
            double r2 = r7.doubleValue()
            r7 = r8
            java.lang.Double r7 = (java.lang.Double) r7
            double r4 = r7.doubleValue()
            int r7 = java.lang.Double.compare(r2, r4)
            if (r7 < 0) goto L_0x005c
            goto L_0x005d
        L_0x0032:
            r7 = r9
            java.lang.Long r7 = (java.lang.Long) r7
            long r2 = r7.longValue()
            r7 = r8
            java.lang.Long r7 = (java.lang.Long) r7
            long r4 = r7.longValue()
            int r7 = java.lang.Long.compare(r2, r4)
            if (r7 < 0) goto L_0x005c
            goto L_0x005d
        L_0x0047:
            r7 = r9
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r2 = r8
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r7 = java.lang.Integer.compare(r7, r2)
            if (r7 < 0) goto L_0x005c
            goto L_0x005d
        L_0x005c:
            r0 = 0
        L_0x005d:
            r1 = r0
        L_0x005e:
            if (r1 == 0) goto L_0x0065
            r6.mMinValue = r8
            r6.mMaxValue = r9
            return
        L_0x0065:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "min >= max"
            r7.<init>(r8)
            throw r7
        L_0x006d:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "min dataType invalid"
            r7.<init>(r8)
            throw r7
        L_0x0075:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "max dataType invalid"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.common.property.AllowedValueRange.<init>(com.miot.common.property.DataType, java.lang.Object, java.lang.Object):void");
    }

    public int describeContents() {
        return 0;
    }

    public Object getMaxValue() {
        return this.mMaxValue;
    }

    public Object getMinValue() {
        return this.mMinValue;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0083, code lost:
        if (java.lang.Integer.compare(((java.lang.Integer) r7.mMaxValue).intValue(), r8.intValue()) >= 0) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0086, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0035, code lost:
        if (java.lang.Double.compare(((java.lang.Double) r7.mMaxValue).doubleValue(), r8.doubleValue()) >= 0) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x005c, code lost:
        if (java.lang.Long.compare(((java.lang.Long) r7.mMaxValue).longValue(), r8.longValue()) >= 0) goto L_0x0087;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isValueValid(java.lang.Object r8) {
        /*
            r7 = this;
            int[] r0 = com.miot.common.property.AllowedValueRange.C28582.$SwitchMap$com$miot$common$property$DataType
            com.miot.common.property.DataType r1 = r7.mDataType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L_0x005f;
                case 2: goto L_0x005f;
                case 3: goto L_0x005f;
                case 4: goto L_0x0038;
                case 5: goto L_0x0038;
                case 6: goto L_0x0011;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x0088
        L_0x0011:
            java.lang.Double r8 = (java.lang.Double) r8
            double r3 = r8.doubleValue()
            java.lang.Object r0 = r7.mMinValue
            java.lang.Double r0 = (java.lang.Double) r0
            double r5 = r0.doubleValue()
            int r0 = java.lang.Double.compare(r3, r5)
            if (r0 < 0) goto L_0x0086
            java.lang.Object r0 = r7.mMaxValue
            java.lang.Double r0 = (java.lang.Double) r0
            double r3 = r0.doubleValue()
            double r5 = r8.doubleValue()
            int r8 = java.lang.Double.compare(r3, r5)
            if (r8 < 0) goto L_0x0086
            goto L_0x0087
        L_0x0038:
            java.lang.Long r8 = (java.lang.Long) r8
            long r3 = r8.longValue()
            java.lang.Object r0 = r7.mMinValue
            java.lang.Long r0 = (java.lang.Long) r0
            long r5 = r0.longValue()
            int r0 = java.lang.Long.compare(r3, r5)
            if (r0 < 0) goto L_0x0086
            java.lang.Object r0 = r7.mMaxValue
            java.lang.Long r0 = (java.lang.Long) r0
            long r3 = r0.longValue()
            long r5 = r8.longValue()
            int r8 = java.lang.Long.compare(r3, r5)
            if (r8 < 0) goto L_0x0086
            goto L_0x0087
        L_0x005f:
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r0 = r8.intValue()
            java.lang.Object r3 = r7.mMinValue
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r0 = java.lang.Integer.compare(r0, r3)
            if (r0 < 0) goto L_0x0086
            java.lang.Object r0 = r7.mMaxValue
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r8 = r8.intValue()
            int r8 = java.lang.Integer.compare(r0, r8)
            if (r8 < 0) goto L_0x0086
            goto L_0x0087
        L_0x0086:
            r1 = 0
        L_0x0087:
            r2 = r1
        L_0x0088:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.common.property.AllowedValueRange.isValueValid(java.lang.Object):boolean");
    }

    public void readFromParcel(Parcel parcel) {
        Object obj;
        DataType retrieveType = DataType.retrieveType(parcel.readString());
        this.mDataType = retrieveType;
        switch (C28582.$SwitchMap$com$miot$common$property$DataType[retrieveType.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.mMinValue = Integer.valueOf(parcel.readInt());
                obj = Integer.valueOf(parcel.readInt());
                break;
            case 4:
            case 5:
                this.mMinValue = Long.valueOf(parcel.readLong());
                obj = Long.valueOf(parcel.readLong());
                break;
            case 6:
                this.mMinValue = Double.valueOf(parcel.readDouble());
                obj = Double.valueOf(parcel.readDouble());
                break;
            default:
                return;
        }
        this.mMaxValue = obj;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mDataType.toString());
        switch (C28582.$SwitchMap$com$miot$common$property$DataType[this.mDataType.ordinal()]) {
            case 1:
            case 2:
            case 3:
                parcel.writeInt(((Integer) this.mMinValue).intValue());
                parcel.writeInt(((Integer) this.mMaxValue).intValue());
                return;
            case 4:
            case 5:
                parcel.writeLong(((Long) this.mMinValue).longValue());
                parcel.writeLong(((Long) this.mMaxValue).longValue());
                return;
            case 6:
                parcel.writeDouble(((Double) this.mMinValue).doubleValue());
                parcel.writeDouble(((Double) this.mMaxValue).doubleValue());
                return;
            default:
                return;
        }
    }
}
