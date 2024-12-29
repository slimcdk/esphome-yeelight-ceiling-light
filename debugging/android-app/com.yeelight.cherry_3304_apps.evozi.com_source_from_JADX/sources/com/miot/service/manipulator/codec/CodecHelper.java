package com.miot.service.manipulator.codec;

import android.text.TextUtils;
import com.miot.common.device.invocation.ActionInfo;
import com.miot.common.device.invocation.InvokeInfo;
import com.miot.common.device.invocation.PropertyInfo;
import com.miot.service.manipulator.codec.get.CommonGetCodec;
import com.miot.service.manipulator.codec.get.GatewayGetCodec;
import com.miot.service.manipulator.codec.get.GetCodec;
import com.miot.service.manipulator.codec.get.OneToManyTypeGetCodec;
import com.miot.service.manipulator.codec.get.WaterPurifierGetCodec;
import com.miot.service.manipulator.codec.invoke.CommonInvokeCodec;
import com.miot.service.manipulator.codec.invoke.GatewayInvokeCodec;
import com.miot.service.manipulator.codec.invoke.InvokeCodec;

public class CodecHelper {
    public static final String CHUANGMI_RADIO_V1 = "chuangmi.radio.v1";
    public static final String YUNMI_WATER_PURI = "yunmi.waterpuri";

    public static GetCodec getGetCodec(PropertyInfo propertyInfo) {
        InvokeInfo invokeInfo = propertyInfo.getInvokeInfo();
        String model = invokeInfo.getModel();
        return (model == null || !model.startsWith(YUNMI_WATER_PURI)) ? (model == null || !model.startsWith("ksmb.treadmill")) ? !TextUtils.isEmpty(invokeInfo.getParentDeviceId()) ? new GatewayGetCodec() : new CommonGetCodec() : new OneToManyTypeGetCodec() : new WaterPurifierGetCodec();
    }

    public static InvokeCodec getInvokeCodec(ActionInfo actionInfo) {
        return !TextUtils.isEmpty(actionInfo.getInvokeInfo().getParentDeviceId()) ? new GatewayInvokeCodec() : new CommonInvokeCodec();
    }
}
