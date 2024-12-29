package com.miot.service.common.miotcloud;

import com.miot.common.people.People;
import java.util.List;
import org.apache.http.NameValuePair;
import org.json.JSONObject;

public interface MiotCloud {

    public interface ResponseHandler {
        void onFailure(int i, String str);

        void onSuccess(JSONObject jSONObject);
    }

    int post(String str, List<NameValuePair> list, ResponseHandler responseHandler);

    HttpResponse post(String str, List<NameValuePair> list);

    void setPeople(People people);
}
