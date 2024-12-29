package com.xiaomi.clientreport.processor;

import com.xiaomi.clientreport.data.C4410a;
import java.util.ArrayList;
import java.util.HashMap;

public interface IEventProcessor extends C4423c, C4424d {
    String bytesToString(byte[] bArr);

    void setEventMap(HashMap<String, ArrayList<C4410a>> hashMap);

    byte[] stringToBytes(String str);
}
