package com.miot.service.qrcode;

import java.util.Arrays;
import java.util.Comparator;

public class QrCodeParser {
    private static final Comparator<? super ValueSetter> COMPARATOR = new Comparator<ValueSetter>() {
        public int compare(ValueSetter valueSetter, ValueSetter valueSetter2) {
            return valueSetter.startIndex - valueSetter2.startIndex;
        }
    };
    private ValueSetter did;
    private ValueSetter idKey;
    private ValueSetter imei;
    private ValueSetter pid;

    /* renamed from: qr */
    private final String f6711qr;

    /* renamed from: sn */
    private ValueSetter f6712sn;
    private QrCodeType type;

    public enum QrCodeType {
        WIFI("W"),
        NBIOT("N"),
        ZIGBEE_30("Z");
        
        public final String type;

        private QrCodeType(String str) {
            this.type = str;
        }
    }

    public static class ValueSetter {
        final String prefix;
        /* access modifiers changed from: private */
        public int startIndex;
        /* access modifiers changed from: private */
        public String value;

        public ValueSetter(String str) {
            this.prefix = str;
        }

        public ValueSetter setStartIndex(int i) {
            this.startIndex = i;
            return this;
        }

        public void setValue(String str) {
            this.value = str;
        }
    }

    public QrCodeParser(String str) {
        this(str, (String) null);
    }

    public QrCodeParser(String str, String str2) {
        this.did = new ValueSetter("$D:");
        this.pid = new ValueSetter("$M:");
        this.f6712sn = new ValueSetter("$S:");
        this.imei = new ValueSetter("$A:");
        this.idKey = new ValueSetter("$I:");
        this.pid.setValue(str2);
        parse(str);
        this.f6711qr = str;
    }

    private void parse(String str) {
        QrCodeType qrCodeType;
        if (str != null && str.startsWith("G") && str.length() > 2) {
            String substring = str.substring(1);
            String[] split = substring.split("%Z");
            if (split.length == 2) {
                setValue(split[0], this.pid, this.did, this.f6712sn);
                setValue(split[1], this.imei, this.idKey);
                if (this.imei != null && this.idKey != null && this.did != null && this.pid != null) {
                    qrCodeType = QrCodeType.ZIGBEE_30;
                } else {
                    return;
                }
            } else {
                String[] split2 = substring.split("%N");
                if (split2.length == 2) {
                    setValue(split2[0], this.pid, this.did, this.f6712sn);
                    setValue(split2[1], this.imei, this.idKey);
                    if (this.imei != null && this.idKey != null && this.did != null && this.pid != null) {
                        qrCodeType = QrCodeType.NBIOT;
                    } else {
                        return;
                    }
                } else {
                    String[] split3 = substring.split("%W");
                    if (split3.length == 2) {
                        setValue(split3[0], this.pid, this.did, this.f6712sn);
                        setValue(split3[1], this.imei, this.idKey);
                        if (this.imei != null && this.idKey != null && this.did != null && this.pid != null) {
                            qrCodeType = QrCodeType.WIFI;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            this.type = qrCodeType;
        }
    }

    private void setValue(String str, ValueSetter... valueSetterArr) {
        if (str != null) {
            int i = 0;
            for (ValueSetter valueSetter : valueSetterArr) {
                valueSetter.setStartIndex(str.indexOf(valueSetter.prefix));
            }
            Arrays.sort(valueSetterArr, COMPARATOR);
            int length = valueSetterArr.length;
            while (i < length) {
                ValueSetter valueSetter2 = valueSetterArr[i];
                valueSetter2.setValue(str.substring(valueSetter2.startIndex + valueSetter2.prefix.length(), i == length + -1 ? str.length() : valueSetterArr[i + 1].startIndex));
                i++;
            }
        }
    }

    public String getDid() {
        return this.did.value;
    }

    public String getIdKey() {
        return this.idKey.value;
    }

    public String getImei() {
        return this.imei.value;
    }

    public String getPid() {
        return this.pid.value;
    }

    public String getSn() {
        return this.f6712sn.value;
    }

    public QrCodeType getType() {
        return this.type;
    }

    public String toString() {
        return this.f6711qr;
    }
}
