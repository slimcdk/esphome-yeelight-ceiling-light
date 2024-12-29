package com.miot.common.device.urn;

import com.miot.common.device.urn.Urn;

public class ServiceType extends Urn {
    public static final String DOMAIN_XIAOMI = "schemas-mi-com";

    public static ServiceType create(String str) {
        ServiceType serviceType = new ServiceType();
        if (!serviceType.parse(str)) {
            return null;
        }
        return serviceType;
    }

    public String getName() {
        return getClassType() + getSubType();
    }

    public boolean parse(String str) {
        boolean parse = super.parse(str);
        if (parse && super.getDomain().equals("schemas-mi-com") && getType() == Urn.Type.SERVICE) {
            return true;
        }
        return parse;
    }
}
