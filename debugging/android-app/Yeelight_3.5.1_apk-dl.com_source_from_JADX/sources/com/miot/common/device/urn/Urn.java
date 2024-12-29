package com.miot.common.device.urn;

import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;

public class Urn implements Serializable {
    private static final String URN = "urn";
    private String classType;
    private String domain;
    private String subType;
    private Type type = Type.UNDEFINED;
    private int version;

    /* renamed from: com.miot.common.device.urn.Urn$1 */
    static /* synthetic */ class C28441 {
        static final /* synthetic */ int[] $SwitchMap$com$miot$common$device$urn$Urn$Type;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.miot.common.device.urn.Urn$Type[] r0 = com.miot.common.device.urn.Urn.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$miot$common$device$urn$Urn$Type = r0
                com.miot.common.device.urn.Urn$Type r1 = com.miot.common.device.urn.Urn.Type.DEVICE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$miot$common$device$urn$Urn$Type     // Catch:{ NoSuchFieldError -> 0x001d }
                com.miot.common.device.urn.Urn$Type r1 = com.miot.common.device.urn.Urn.Type.SERVICE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.miot.common.device.urn.Urn.C28441.<clinit>():void");
        }
    }

    public enum Type {
        UNDEFINED,
        DEVICE,
        SERVICE;
        
        private static final String STR_DEVICE = "device";
        private static final String STR_SERVICE = "service";
        private static final String STR_UNDEFINED = "undefined";

        public static Type retrieveType(String str) {
            return str.equals(STR_UNDEFINED) ? UNDEFINED : str.equals("device") ? DEVICE : str.equals("service") ? SERVICE : UNDEFINED;
        }

        public String toString() {
            int i = C28441.$SwitchMap$com$miot$common$device$urn$Urn$Type[ordinal()];
            return i != 1 ? i != 2 ? STR_UNDEFINED : "service" : "device";
        }
    }

    public static Urn create(String str, Type type2, String str2, int i) {
        Urn urn = new Urn();
        urn.domain = str;
        urn.type = type2;
        urn.subType = str2;
        urn.version = i;
        return urn;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Urn)) {
            return false;
        }
        Urn urn = (Urn) obj;
        String str = this.domain;
        if (str == null) {
            if (urn.domain != null) {
                return false;
            }
        } else if (!str.equals(urn.domain)) {
            return false;
        }
        if (this.type != urn.type) {
            return false;
        }
        String str2 = this.classType;
        if (str2 == null) {
            if (urn.classType != null) {
                return false;
            }
        } else if (!str2.equals(urn.classType)) {
            return false;
        }
        String str3 = this.subType;
        if (str3 == null) {
            if (urn.subType != null) {
                return false;
            }
        } else if (!str3.equals(urn.subType)) {
            return false;
        }
        return this.version == urn.version;
    }

    public String getClassType() {
        return this.classType;
    }

    public String getDomain() {
        return this.domain;
    }

    public String getSubType() {
        return this.subType;
    }

    public Type getType() {
        return this.type;
    }

    public int getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.domain;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        Type type2 = this.type;
        int hashCode2 = (hashCode + (type2 == null ? 0 : type2.hashCode())) * 31;
        String str2 = this.classType;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subType;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode3 + i) * 31) + this.version;
    }

    public boolean parse(String str) {
        String[] split = str.split(Constants.COLON_SEPARATOR);
        if (split.length == 6 && split[0].equals(URN)) {
            this.domain = split[1];
            this.type = Type.retrieveType(split[2]);
            this.classType = split[3];
            this.subType = split[4];
            try {
                this.version = Integer.valueOf(split[5]).intValue();
                return true;
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    public void setClassType(String str) {
        this.classType = str;
    }

    public void setDomain(String str) {
        this.domain = str;
    }

    public void setSubType(String str) {
        this.subType = str;
    }

    public void setType(Type type2) {
        this.type = type2;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    public String toString() {
        return String.format("%s:%s:%s:%s:%s:%d", new Object[]{URN, this.domain, this.type.toString(), this.classType, this.subType, Integer.valueOf(this.version)});
    }
}
