package com.miot.service.manager.discovery.impl.bonjour.impl.getter;

import android.net.nsd.NsdServiceInfo;
import java.util.Map;

public interface ExtraInfoGetter {
    Map<String, String> get(NsdServiceInfo nsdServiceInfo);
}
