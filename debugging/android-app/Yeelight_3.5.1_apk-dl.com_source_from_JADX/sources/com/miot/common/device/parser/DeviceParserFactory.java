package com.miot.common.device.parser;

import com.miot.common.device.parser.json.JsonDeviceParser;
import com.miot.common.device.parser.xml.XmlDeviceParser;

public class DeviceParserFactory {
    private static final String TAG = "DeviceParserFactory";

    public static DeviceParser createParser(String str) {
        if (str == null) {
            return null;
        }
        if (str.endsWith(".json")) {
            return new JsonDeviceParser();
        }
        if (str.endsWith(".xml")) {
            return new XmlDeviceParser();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("retrieveType parser failed, url is illegal: ");
        sb.append(str);
        return null;
    }
}
