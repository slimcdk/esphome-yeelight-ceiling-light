package com.xiaomi.clientreport.processor;

import com.xiaomi.clientreport.data.C3990a;
import java.util.ArrayList;
import java.util.HashMap;

public interface IEventProcessor extends C4003c, C4004d {
    String bytesToString(byte[] bArr);

    void setEventMap(HashMap<String, ArrayList<C3990a>> hashMap);

    byte[] stringToBytes(String str);
}
