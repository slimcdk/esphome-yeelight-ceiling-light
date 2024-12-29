package com.miot.service.manager.discovery.impl.bonjour.impl.setter;

import android.net.nsd.NsdServiceInfo;
import java.util.Map;

public interface ExtraInfoSetter {
    boolean set(NsdServiceInfo nsdServiceInfo, Map<String, String> map);
}
