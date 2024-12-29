package com.miot.common.device.invocation;

import com.miot.common.device.Service;
import com.miot.common.property.Property;

public class PropertyInfoFactory {
    public static PropertyInfo create(Service service) {
        String config = service.getConfig("getProperty");
        PropertyInfo propertyInfo = new PropertyInfo();
        propertyInfo.setInvokeInfo(InvokeInfoFactory.create(service));
        propertyInfo.setServiceType(service.getType().toString());
        propertyInfo.setPropertyMethod(config);
        return propertyInfo;
    }

    public static PropertyInfo create(Service service, String str) {
        PropertyInfo create = create(service);
        Property property = service.getProperty(str);
        if (property != null) {
            create.addProperty(property);
            return create;
        }
        throw new IllegalStateException(String.format("no property %s in service %s", new Object[]{str, service.getType().toString()}));
    }
}
