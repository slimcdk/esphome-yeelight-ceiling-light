package com.miot.service.manipulator;

import android.content.Context;
import android.os.RemoteException;
import com.miot.api.IReadPropertyCompletionHandler;
import com.miot.common.device.invocation.InvokeInfo;
import com.miot.common.device.invocation.PropertyInfo;
import com.miot.common.exception.MiotException;
import com.miot.common.people.People;
import com.miot.service.common.miotcloud.HttpResponse;
import com.miot.service.common.miotcloud.JsonResponse;
import com.miot.service.common.task.MiotError;
import com.miot.service.common.task.MiotTask;
import com.miot.service.manipulator.channel.ChannelHelper;
import com.miot.service.manipulator.codec.CodecHelper;
import com.miot.service.manipulator.codec.get.GetCodec;
import org.json.JSONObject;

public class GetPropertyTask extends MiotTask<PropertyInfo> {
    private Context mContext;
    private GetCodec mGetCodec;
    private IReadPropertyCompletionHandler mHandler;
    private PropertyInfo mPropertyInfo;

    public GetPropertyTask(People people, Context context, PropertyInfo propertyInfo, IReadPropertyCompletionHandler iReadPropertyCompletionHandler) {
        super(people);
        this.mContext = context;
        this.mPropertyInfo = propertyInfo;
        this.mGetCodec = CodecHelper.getGetCodec(propertyInfo);
        this.mHandler = iReadPropertyCompletionHandler;
    }

    public void deliveryResult(MiotError miotError, PropertyInfo propertyInfo) {
        try {
            if (miotError.equals(MiotError.f6706OK)) {
                this.mHandler.onSucceed(propertyInfo);
            } else {
                this.mHandler.onFailed(miotError.getCode(), miotError.getMessage());
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public HttpResponse executeRequest() {
        JSONObject encode = this.mGetCodec.encode(this.mPropertyInfo);
        if (encode != null) {
            InvokeInfo invokeInfo = this.mPropertyInfo.getInvokeInfo();
            return ChannelHelper.getChannel(this.mContext, invokeInfo).doInvoke(this.mPeople, invokeInfo, encode);
        }
        throw new MiotException("encode action failed");
    }

    public PropertyInfo parseResult(JsonResponse jsonResponse) {
        this.mGetCodec.decode(this.mPropertyInfo, jsonResponse);
        return this.mPropertyInfo;
    }
}
