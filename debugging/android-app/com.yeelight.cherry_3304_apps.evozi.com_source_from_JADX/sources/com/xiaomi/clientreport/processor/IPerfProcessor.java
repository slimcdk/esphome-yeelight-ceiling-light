package com.xiaomi.clientreport.processor;

import com.xiaomi.clientreport.data.C3990a;
import java.util.HashMap;

public interface IPerfProcessor extends C4003c, C4004d {
    void setPerfMap(HashMap<String, HashMap<String, C3990a>> hashMap);
}
