package com.miot.common.device.urn;

import com.miot.common.device.urn.Urn;

public class DeviceType extends Urn {
    public static final String DOMAIN_XIAOMI = "schemas-mi-com";

    public static DeviceType create(String str) {
        DeviceType deviceType = new DeviceType();
        if (!deviceType.parse(str)) {
            return null;
        }
        return deviceType;
    }

    public String getName() {
        return getClassType() + getSubType();
    }

    public boolean parse(String str) {
        boolean parse = super.parse(str);
        if (parse && super.getDomain().equals("schemas-mi-com") && getType() == Urn.Type.DEVICE) {
            return true;
        }
        return parse;
    }
}
