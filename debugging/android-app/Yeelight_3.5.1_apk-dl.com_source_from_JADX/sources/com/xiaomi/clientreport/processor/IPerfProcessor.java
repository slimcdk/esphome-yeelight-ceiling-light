package com.xiaomi.clientreport.processor;

import com.xiaomi.clientreport.data.C4410a;
import java.util.HashMap;

public interface IPerfProcessor extends C4423c, C4424d {
    void setPerfMap(HashMap<String, HashMap<String, C4410a>> hashMap);
}
