package com.miot.common.device.urn;

import com.xiaomi.mipush.sdk.Constants;

public class UrnTypeParser {
    private static final String TAG = "UrnTypeParser";

    public static UrnType parseType(String str) {
        String[] split = str.split(Constants.COLON_SEPARATOR);
        if (split.length == 5) {
            return JsonType.parse(split);
        }
        if (split.length == 6) {
            return XmlType.parse(split);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("length is wrong: ");
        sb.append(str);
        return null;
    }
}
