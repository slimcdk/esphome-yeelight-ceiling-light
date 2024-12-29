package com.miot.service.qrcode;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.zxing.DecodeHintType;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

final class DecodeHintManager {
    private static final Pattern COMMA = Pattern.compile(Constants.ACCEPT_TIME_SEPARATOR_SP);
    private static final String TAG = "DecodeHintManager";

    private DecodeHintManager() {
    }

    static Map<DecodeHintType, Object> parseDecodeHints(Intent intent) {
        Object obj;
        Bundle extras = intent.getExtras();
        if (extras == null || extras.isEmpty()) {
            return null;
        }
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        for (DecodeHintType decodeHintType : DecodeHintType.values()) {
            if (!(decodeHintType == DecodeHintType.CHARACTER_SET || decodeHintType == DecodeHintType.NEED_RESULT_POINT_CALLBACK || decodeHintType == DecodeHintType.POSSIBLE_FORMATS)) {
                String name = decodeHintType.name();
                if (extras.containsKey(name)) {
                    if (decodeHintType.getValueType().equals(Void.class)) {
                        obj = Boolean.TRUE;
                    } else {
                        obj = extras.get(name);
                        if (!decodeHintType.getValueType().isInstance(obj)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Ignoring hint ");
                            sb.append(decodeHintType);
                            sb.append(" because it is not assignable from ");
                            sb.append(obj);
                        }
                    }
                    enumMap.put(decodeHintType, obj);
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Hints from the Intent: ");
        sb2.append(enumMap);
        return enumMap;
    }

    static Map<DecodeHintType, ?> parseDecodeHints(Uri uri) {
        String str;
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null || encodedQuery.isEmpty()) {
            return null;
        }
        Map<String, String> splitQuery = splitQuery(encodedQuery);
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        for (DecodeHintType decodeHintType : DecodeHintType.values()) {
            if (!(decodeHintType == DecodeHintType.CHARACTER_SET || decodeHintType == DecodeHintType.NEED_RESULT_POINT_CALLBACK || decodeHintType == DecodeHintType.POSSIBLE_FORMATS || (str = splitQuery.get(decodeHintType.name())) == null)) {
                Object obj = str;
                if (!decodeHintType.getValueType().equals(Object.class)) {
                    if (!decodeHintType.getValueType().equals(Void.class)) {
                        obj = str;
                        if (!decodeHintType.getValueType().equals(String.class)) {
                            if (decodeHintType.getValueType().equals(Boolean.class)) {
                                if (!str.isEmpty() && (TimerCodec.DISENABLE.equals(str) || "false".equalsIgnoreCase(str) || "no".equalsIgnoreCase(str))) {
                                    obj = Boolean.FALSE;
                                }
                            } else if (decodeHintType.getValueType().equals(int[].class)) {
                                boolean isEmpty = str.isEmpty();
                                String str2 = str;
                                if (!isEmpty) {
                                    char charAt = str.charAt(str.length() - 1);
                                    str2 = str;
                                    if (charAt == ',') {
                                        str2 = str.substring(0, str.length() - 1);
                                    }
                                }
                                String[] split = COMMA.split(str2);
                                int[] iArr = new int[split.length];
                                int i = 0;
                                while (i < split.length) {
                                    try {
                                        iArr[i] = Integer.parseInt(split[i]);
                                        i++;
                                    } catch (NumberFormatException unused) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("Skipping array of integers hint ");
                                        sb.append(decodeHintType);
                                        sb.append(" due to invalid numeric value: '");
                                        sb.append(split[i]);
                                        sb.append('\'');
                                        iArr = null;
                                    }
                                }
                                if (iArr != null) {
                                    enumMap.put(decodeHintType, iArr);
                                }
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Unsupported hint type '");
                                sb2.append(decodeHintType);
                                sb2.append("' of type ");
                                sb2.append(decodeHintType.getValueType());
                            }
                        }
                    }
                    obj = Boolean.TRUE;
                }
                enumMap.put(decodeHintType, obj);
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Hints from the URI: ");
        sb3.append(enumMap);
        return enumMap;
    }

    private static Map<String, String> splitQuery(String str) {
        String str2;
        HashMap hashMap = new HashMap();
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                break;
            } else if (str.charAt(i) == '&') {
                i++;
            } else {
                int indexOf = str.indexOf(38, i);
                int indexOf2 = str.indexOf(61, i);
                String str3 = "";
                if (indexOf < 0) {
                    if (indexOf2 < 0) {
                        str2 = Uri.decode(str.substring(i).replace('+', ' '));
                    } else {
                        String decode = Uri.decode(str.substring(i, indexOf2).replace('+', ' '));
                        str3 = Uri.decode(str.substring(indexOf2 + 1).replace('+', ' '));
                        str2 = decode;
                    }
                    if (!hashMap.containsKey(str2)) {
                        hashMap.put(str2, str3);
                    }
                } else {
                    if (indexOf2 < 0 || indexOf2 > indexOf) {
                        String decode2 = Uri.decode(str.substring(i, indexOf).replace('+', ' '));
                        if (!hashMap.containsKey(decode2)) {
                            hashMap.put(decode2, str3);
                        }
                    } else {
                        String decode3 = Uri.decode(str.substring(i, indexOf2).replace('+', ' '));
                        String decode4 = Uri.decode(str.substring(indexOf2 + 1, indexOf).replace('+', ' '));
                        if (!hashMap.containsKey(decode3)) {
                            hashMap.put(decode3, decode4);
                        }
                    }
                    i = indexOf + 1;
                }
            }
        }
        return hashMap;
    }
}
