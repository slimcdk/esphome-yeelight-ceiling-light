package com.miot.service.common.mipush;

import com.miot.common.device.parser.xml.DddTag;

public enum MiotpnMessageType {
    DeviceEvent,
    UserEvent,
    SceneEvent,
    AdvEvent,
    Notification;

    /* renamed from: com.miot.service.common.mipush.MiotpnMessageType$1 */
    static /* synthetic */ class C36331 {
        static final /* synthetic */ int[] $SwitchMap$com$miot$service$common$mipush$MiotpnMessageType = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.miot.service.common.mipush.MiotpnMessageType[] r0 = com.miot.service.common.mipush.MiotpnMessageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$miot$service$common$mipush$MiotpnMessageType = r0
                com.miot.service.common.mipush.MiotpnMessageType r1 = com.miot.service.common.mipush.MiotpnMessageType.DeviceEvent     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$miot$service$common$mipush$MiotpnMessageType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.miot.service.common.mipush.MiotpnMessageType r1 = com.miot.service.common.mipush.MiotpnMessageType.UserEvent     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$miot$service$common$mipush$MiotpnMessageType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.miot.service.common.mipush.MiotpnMessageType r1 = com.miot.service.common.mipush.MiotpnMessageType.SceneEvent     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$miot$service$common$mipush$MiotpnMessageType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.miot.service.common.mipush.MiotpnMessageType r1 = com.miot.service.common.mipush.MiotpnMessageType.AdvEvent     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$miot$service$common$mipush$MiotpnMessageType     // Catch:{ NoSuchFieldError -> 0x003e }
                com.miot.service.common.mipush.MiotpnMessageType r1 = com.miot.service.common.mipush.MiotpnMessageType.Notification     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.miot.service.common.mipush.MiotpnMessageType.C36331.<clinit>():void");
        }
    }

    public static MiotpnMessageType create(String str) {
        if (DddTag.DEVICE.equalsIgnoreCase(str)) {
            return DeviceEvent;
        }
        if ("share".equalsIgnoreCase(str)) {
            return UserEvent;
        }
        if ("scene".equalsIgnoreCase(str)) {
            return SceneEvent;
        }
        if ("adv".equalsIgnoreCase(str)) {
            return AdvEvent;
        }
        if ("notification".equalsIgnoreCase(str)) {
            return Notification;
        }
        return null;
    }

    public String toString() {
        int i = C36331.$SwitchMap$com$miot$service$common$mipush$MiotpnMessageType[ordinal()];
        if (i == 1) {
            return DddTag.DEVICE;
        }
        if (i == 2) {
            return "share";
        }
        if (i == 3) {
            return "scene";
        }
        if (i == 4) {
            return "adv";
        }
        if (i != 5) {
            return null;
        }
        return "notification";
    }
}
