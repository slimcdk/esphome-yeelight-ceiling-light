package com.miot.common.device.invocation;

import com.miot.common.device.Action;
import com.miot.common.device.Service;

public class ActionInfoFactory {
    public static ActionInfo create(Service service, Action action) {
        ActionInfo actionInfo = new ActionInfo();
        actionInfo.setAction((Action) action.clone());
        actionInfo.setInvokeInfo(InvokeInfoFactory.create(service));
        return actionInfo;
    }

    public static ActionInfo create(Service service, String str) {
        Action action = service.getAction(str);
        if (action != null) {
            return create(service, action);
        }
        throw new IllegalStateException(String.format("no action %s in service %s", new Object[]{str, service.getType().toString()}));
    }
}
