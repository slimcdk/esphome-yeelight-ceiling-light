package com.xiaomi.clientreport.data;

import com.xiaomi.channel.commonutils.logger.C4408b;
import org.json.JSONException;
import org.json.JSONObject;

public class EventClientReport extends C4410a {
    public String eventContent;
    public String eventId;
    public long eventTime;
    public int eventType;

    public static EventClientReport getBlankInstance() {
        return new EventClientReport();
    }

    public JSONObject toJson() {
        try {
            JSONObject json = super.toJson();
            if (json == null) {
                return null;
            }
            json.put("eventId", this.eventId);
            json.put("eventType", this.eventType);
            json.put("eventTime", this.eventTime);
            String str = this.eventContent;
            if (str == null) {
                str = "";
            }
            json.put("eventContent", str);
            return json;
        } catch (JSONException e) {
            C4408b.m12478a((Throwable) e);
            return null;
        }
    }

    public String toJsonString() {
        return super.toJsonString();
    }
}
