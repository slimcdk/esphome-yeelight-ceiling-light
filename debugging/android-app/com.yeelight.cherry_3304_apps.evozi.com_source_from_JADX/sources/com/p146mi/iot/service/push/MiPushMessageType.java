package com.p146mi.iot.service.push;

/* renamed from: com.mi.iot.service.push.MiPushMessageType */
public enum MiPushMessageType {
    PROPERTY,
    EVENT,
    DEVICE,
    HOME;
    
    static final String TYPE_EVENT = "events-occured";
    static final String TYPE_ROPERTY = "properties-changed";

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p146mi.iot.service.push.MiPushMessageType create(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r1 = 1028133079(0x3d4810d7, float:0.048844185)
            r2 = 1
            if (r0 == r1) goto L_0x001a
            r1 = 1429401626(0x5532f01a, float:1.22965186E13)
            if (r0 == r1) goto L_0x0010
            goto L_0x0024
        L_0x0010:
            java.lang.String r0 = "properties-changed"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0024
            r3 = 0
            goto L_0x0025
        L_0x001a:
            java.lang.String r0 = "events-occured"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0024
            r3 = 1
            goto L_0x0025
        L_0x0024:
            r3 = -1
        L_0x0025:
            if (r3 == 0) goto L_0x002e
            if (r3 == r2) goto L_0x002b
            r3 = 0
            goto L_0x0030
        L_0x002b:
            com.mi.iot.service.push.MiPushMessageType r3 = EVENT
            goto L_0x0030
        L_0x002e:
            com.mi.iot.service.push.MiPushMessageType r3 = PROPERTY
        L_0x0030:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p146mi.iot.service.push.MiPushMessageType.create(java.lang.String):com.mi.iot.service.push.MiPushMessageType");
    }
}
