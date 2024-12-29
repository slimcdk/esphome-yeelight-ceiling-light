package com.miot.service.manipulator;

import android.content.Context;
import android.os.RemoteException;
import com.miot.api.IInvokeCompletionHandler;
import com.miot.common.device.invocation.ActionInfo;
import com.miot.common.device.invocation.InvokeInfo;
import com.miot.common.exception.MiotException;
import com.miot.common.people.People;
import com.miot.service.common.miotcloud.HttpResponse;
import com.miot.service.common.miotcloud.JsonResponse;
import com.miot.service.common.task.MiotError;
import com.miot.service.common.task.MiotTask;
import com.miot.service.manipulator.channel.ChannelHelper;
import com.miot.service.manipulator.codec.CodecHelper;
import com.miot.service.manipulator.codec.invoke.InvokeCodec;
import org.json.JSONObject;

public class InvokeActionTask extends MiotTask<ActionInfo> {
    private ActionInfo mActionInfo;
    private Context mContext;
    private IInvokeCompletionHandler mHandler;
    private InvokeCodec mInvokeCodec;

    public InvokeActionTask(People people, Context context, ActionInfo actionInfo, IInvokeCompletionHandler iInvokeCompletionHandler) {
        super(people);
        this.mContext = context;
        this.mActionInfo = actionInfo;
        this.mInvokeCodec = CodecHelper.getInvokeCodec(actionInfo);
        this.mHandler = iInvokeCompletionHandler;
    }

    public void deliveryResult(MiotError miotError, ActionInfo actionInfo) {
        try {
            if (miotError.equals(MiotError.f6706OK)) {
                this.mHandler.onSucceed(actionInfo);
            } else {
                this.mHandler.onFailed(miotError.getCode(), miotError.getMessage());
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public HttpResponse executeRequest() {
        JSONObject encode = this.mInvokeCodec.encode(this.mActionInfo);
        if (encode != null) {
            InvokeInfo invokeInfo = this.mActionInfo.getInvokeInfo();
            return ChannelHelper.getChannel(this.mContext, invokeInfo).doInvoke(this.mPeople, invokeInfo, encode);
        }
        throw new MiotException("encode action failed");
    }

    public ActionInfo parseResult(JsonResponse jsonResponse) {
        if (this.mActionInfo.getResults().size() > 0) {
            this.mInvokeCodec.decode(this.mActionInfo, jsonResponse);
        }
        return this.mActionInfo;
    }
}
