package com.miot.service.manager.discovery.impl;

import android.content.Context;
import com.miot.common.device.Device;
import com.miot.common.device.parser.DeviceParser;
import com.miot.common.device.parser.DeviceParserFactory;
import java.util.Objects;

public class DeviceLoader {
    public static Device loadFromAssets(Context context, String str, String str2) {
        Objects.requireNonNull(str, "model is null");
        Objects.requireNonNull(str2, "url is null");
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
    }
}
