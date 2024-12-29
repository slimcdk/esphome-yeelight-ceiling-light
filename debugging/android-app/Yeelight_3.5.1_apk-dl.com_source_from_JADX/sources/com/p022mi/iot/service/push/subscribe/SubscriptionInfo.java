package com.p022mi.iot.service.push.subscribe;

import android.text.TextUtils;
import com.p022mi.iot.common.instance.Property;
import com.p022mi.iot.common.util.SpecUtil;
import com.p022mi.iot.manager.listener.IPropertiesChangedListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.mi.iot.service.push.subscribe.SubscriptionInfo */
public class SubscriptionInfo {
    private IPropertiesChangedListener mListener;
    private Map<String, Property> mProperties = new HashMap();
    private String mTag;

    public void addProperties(List<Property> list) {
        for (Property next : list) {
            addProperty(next.getPid(), next);
        }
    }

    public void addProperty(String str, Property property) {
        if (TextUtils.isEmpty(this.mTag)) {
            this.mTag = SpecUtil.getDeviceId(str);
        }
        this.mProperties.put(str, property);
    }

    public void clearProperty() {
        this.mProperties.clear();
    }

    public boolean contain(String str) {
        return this.mProperties.containsKey(str);
    }

    public IPropertiesChangedListener getListener() {
        return this.mListener;
    }

    public List<Property> getProperties() {
        return new ArrayList(this.mProperties.values());
    }

    public Property getProperty(String str) {
        return this.mProperties.get(str);
    }

    public String getTag() {
        return this.mTag;
    }

    public boolean isEmpty() {
        return this.mProperties.isEmpty();
    }

    public void removeProperty(String str) {
        this.mProperties.remove(str);
    }

    public void setListener(IPropertiesChangedListener iPropertiesChangedListener) {
        this.mListener = iPropertiesChangedListener;
    }
}
