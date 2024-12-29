package com.miot.service.manipulator.channel;

import com.miot.common.device.invocation.InvokeInfo;
import com.miot.common.people.People;
import com.miot.service.common.miotcloud.HttpResponse;
import org.json.JSONObject;

public abstract class Channel {
    public abstract HttpResponse doInvoke(People people, InvokeInfo invokeInfo, JSONObject jSONObject);
}
