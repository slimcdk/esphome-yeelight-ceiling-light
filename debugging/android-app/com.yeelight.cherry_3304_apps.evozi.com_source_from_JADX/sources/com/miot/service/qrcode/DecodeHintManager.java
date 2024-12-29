package com.miot.service.qrcode;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import p011c.p012a.p053e.C0818e;

final class DecodeHintManager {
    private static final Pattern COMMA = Pattern.compile(Constants.ACCEPT_TIME_SEPARATOR_SP);
    private static final String TAG = "DecodeHintManager";

    private DecodeHintManager() {
    }

    static Map<C0818e, Object> parseDecodeHints(Intent intent) {
        Object obj;
        Bundle extras = intent.getExtras();
        if (extras == null || extras.isEmpty()) {
            return null;
        }
        EnumMap enumMap = new EnumMap(C0818e.class);
        for (C0818e eVar : C0818e.values()) {
            if (!(eVar == C0818e.CHARACTER_SET || eVar == C0818e.NEED_RESULT_POINT_CALLBACK || eVar == C0818e.POSSIBLE_FORMATS)) {
                String name = eVar.name();
                if (extras.containsKey(name)) {
                    if (eVar.mo8995a().equals(Void.class)) {
                        obj = Boolean.TRUE;
                    } else {
                        obj = extras.get(name);
                        if (!eVar.mo8995a().isInstance(obj)) {
                            "Ignoring hint " + eVar + " because it is not assignable from " + obj;
                        }
                    }
                    enumMap.put(eVar, obj);
                }
            }
        }
        "Hints from the Intent: " + enumMap;
        return enumMap;
    }

    static Map<C0818e, ?> parseDecodeHints(Uri uri) {
        String str;
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null || encodedQuery.isEmpty()) {
            return null;
        }
        Map<String, String> splitQuery = splitQuery(encodedQuery);
        EnumMap enumMap = new EnumMap(C0818e.class);
        for (C0818e eVar : C0818e.values()) {
            if (!(eVar == C0818e.CHARACTER_SET || eVar == C0818e.NEED_RESULT_POINT_CALLBACK || eVar == C0818e.POSSIBLE_FORMATS || (str = splitQuery.get(eVar.name())) == null)) {
                Object obj = str;
                if (!eVar.mo8995a().equals(Object.class)) {
                    if (!eVar.mo8995a().equals(Void.class)) {
                        obj = str;
                        if (!eVar.mo8995a().equals(String.class)) {
                            if (eVar.mo8995a().equals(Boolean.class)) {
                                if (!str.isEmpty() && (TimerCodec.DISENABLE.equals(str) || "false".equalsIgnoreCase(str) || "no".equalsIgnoreCase(str))) {
                                    obj = Boolean.FALSE;
                                }
                            } else if (eVar.mo8995a().equals(int[].class)) {
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
                                        "Skipping array of integers hint " + eVar + " due to invalid numeric value: '" + split[i] + '\'';
                                        iArr = null;
                                    }
                                }
                                if (iArr != null) {
                                    enumMap.put(eVar, iArr);
                                }
                            } else {
                                "Unsupported hint type '" + eVar + "' of type " + eVar.mo8995a();
                            }
                        }
                    }
                    obj = Boolean.TRUE;
                }
                enumMap.put(eVar, obj);
            }
        }
        "Hints from the URI: " + enumMap;
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
