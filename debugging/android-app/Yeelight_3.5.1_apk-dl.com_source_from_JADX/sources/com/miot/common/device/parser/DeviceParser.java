package com.miot.common.device.parser;

import com.miot.common.device.Device;
import java.io.InputStream;

public interface DeviceParser {
    Device parse(InputStream inputStream);
}
