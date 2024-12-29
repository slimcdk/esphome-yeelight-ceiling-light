package com.p146mi.iot.common.handler;

import com.p146mi.iot.common.instance.Property;
import java.util.List;

/* renamed from: com.mi.iot.common.handler.PropertiesChangedListener */
public interface PropertiesChangedListener {
    void onChanged(List<Property> list);
}
