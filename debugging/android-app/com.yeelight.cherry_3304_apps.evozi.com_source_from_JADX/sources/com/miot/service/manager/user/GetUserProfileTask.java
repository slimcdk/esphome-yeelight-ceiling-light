package com.miot.service.manager.user;

import android.os.RemoteException;
import com.miot.api.IGetUserProfileHandler;
import com.miot.common.exception.MiotException;
import com.miot.common.people.People;
import com.miot.common.people.UserInfo;
import com.miot.service.common.miotcloud.HttpResponse;
import com.miot.service.common.miotcloud.JsonResponse;
import com.miot.service.common.miotcloud.MiotCloudApi;
import com.miot.service.common.task.MiotError;
import com.miot.service.common.task.MiotTask;
import org.json.JSONException;
import org.json.JSONObject;

public class GetUserProfileTask extends MiotTask<String> {
    private IGetUserProfileHandler mHandler;
    private String mUserId;

    public GetUserProfileTask(People people, String str, IGetUserProfileHandler iGetUserProfileHandler) {
        super(people);
        this.mUserId = str;
        this.mHandler = iGetUserProfileHandler;
    }

    public void deliveryResult(MiotError miotError, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11 = "";
        try {
            if (miotError.equals(MiotError.f6706OK)) {
                try {
                    JSONObject optJSONObject = new JSONObject(str).optJSONObject("result");
                    if (optJSONObject != null) {
                        str9 = optJSONObject.optString("miId");
                        try {
                            str8 = optJSONObject.optString("nickname");
                            try {
                                str7 = optJSONObject.optString("icon");
                            } catch (JSONException e) {
                                e = e;
                                str7 = str11;
                                str6 = str7;
                                str5 = str6;
                                str4 = str5;
                                e.printStackTrace();
                                str2 = str11;
                                str3 = str9;
                                this.mHandler.onSucceed(new UserInfo(str3, str8, str7, str6, str5, str4, str2));
                                return;
                            }
                        } catch (JSONException e2) {
                            e = e2;
                            str8 = str11;
                            str7 = str8;
                            str6 = str7;
                            str5 = str6;
                            str4 = str5;
                            e.printStackTrace();
                            str2 = str11;
                            str3 = str9;
                            this.mHandler.onSucceed(new UserInfo(str3, str8, str7, str6, str5, str4, str2));
                            return;
                        }
                        try {
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("avatarUrl");
                            if (optJSONObject2 != null) {
                                str6 = optJSONObject2.optString("size_75");
                                try {
                                    str5 = optJSONObject2.optString("size_90");
                                } catch (JSONException e3) {
                                    e = e3;
                                    str5 = str11;
                                    str4 = str5;
                                    e.printStackTrace();
                                    str2 = str11;
                                    str3 = str9;
                                    this.mHandler.onSucceed(new UserInfo(str3, str8, str7, str6, str5, str4, str2));
                                    return;
                                }
                                try {
                                    str4 = optJSONObject2.optString("size_120");
                                    try {
                                        str10 = optJSONObject2.optString("size_320");
                                    } catch (JSONException e4) {
                                        e = e4;
                                        e.printStackTrace();
                                        str2 = str11;
                                        str3 = str9;
                                        this.mHandler.onSucceed(new UserInfo(str3, str8, str7, str6, str5, str4, str2));
                                        return;
                                    }
                                } catch (JSONException e5) {
                                    e = e5;
                                    str4 = str11;
                                    e.printStackTrace();
                                    str2 = str11;
                                    str3 = str9;
                                    this.mHandler.onSucceed(new UserInfo(str3, str8, str7, str6, str5, str4, str2));
                                    return;
                                }
                            } else {
                                str10 = str11;
                                str6 = str10;
                                str5 = str6;
                                str4 = str5;
                            }
                            str11 = str9;
                        } catch (JSONException e6) {
                            e = e6;
                            str6 = str11;
                            str5 = str6;
                            str4 = str5;
                            e.printStackTrace();
                            str2 = str11;
                            str3 = str9;
                            this.mHandler.onSucceed(new UserInfo(str3, str8, str7, str6, str5, str4, str2));
                            return;
                        }
                    } else {
                        str10 = str11;
                        str8 = str10;
                        str7 = str8;
                        str6 = str7;
                        str5 = str6;
                        str4 = str5;
                    }
                    str2 = str10;
                    str3 = str11;
                } catch (JSONException e7) {
                    e = e7;
                    str9 = str11;
                    str8 = str9;
                    str7 = str8;
                    str6 = str7;
                    str5 = str6;
                    str4 = str5;
                    e.printStackTrace();
                    str2 = str11;
                    str3 = str9;
                    this.mHandler.onSucceed(new UserInfo(str3, str8, str7, str6, str5, str4, str2));
                    return;
                }
                this.mHandler.onSucceed(new UserInfo(str3, str8, str7, str6, str5, str4, str2));
                return;
            }
            this.mHandler.onFailed(miotError.getCode(), miotError.getMessage());
        } catch (RemoteException e8) {
            e8.printStackTrace();
        }
    }

    public HttpResponse executeRequest() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uid", this.mUserId);
            return MiotCloudApi.getUserProfile(this.mPeople, jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
            throw new MiotException((Throwable) e);
        }
    }

    public String parseResult(JsonResponse jsonResponse) {
        return jsonResponse.toString();
    }
}
