package com.xiaomi.push.service;

import com.xiaomi.push.C4773hw;
import java.util.Map;

/* renamed from: com.xiaomi.push.service.br */
public class C4925br {
    /* renamed from: a */
    public static C4773hw m15458a(C4773hw hwVar) {
        Map<String, String> map;
        if (!(hwVar == null || (map = hwVar.f8795b) == null)) {
            map.remove("score_info");
        }
        return hwVar;
    }
}
