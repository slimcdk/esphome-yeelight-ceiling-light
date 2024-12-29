package com.miot.service.manager.discovery.impl;

import android.content.Context;
import com.miot.common.device.Device;
import com.miot.common.device.parser.DeviceParser;
import com.miot.common.device.parser.DeviceParserFactory;

public class DeviceLoader {
    public static Device loadFromAssets(Context context, String str, String str2) {
        if (str == null) {
            throw new NullPointerException("model is null");
        } else if (str2 != null) {
            try {
                DeviceParser createParser = DeviceParserFactory.createParser(str2);
                if (createParser != null) {
                    return createParser.parse(context.getAssets().open(str2));
                }
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } else {
            throw new NullPointerException("url is null");
        }
    }
}
