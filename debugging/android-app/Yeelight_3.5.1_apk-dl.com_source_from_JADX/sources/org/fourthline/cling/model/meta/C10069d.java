package org.fourthline.cling.model.meta;

import java.util.Collections;
import java.util.List;
import org.fourthline.cling.model.C10023k;
import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.meta.C10070e;

/* renamed from: org.fourthline.cling.model.meta.d */
public class C10069d<S extends C10070e> extends C10066a<S> {
    public C10069d() {
        this((C10070e) null);
    }

    public C10069d(S s) {
        super("QueryStateVariable", new ActionArgument[]{new ActionArgument("varName", "VirtualQueryActionInput", ActionArgument.Direction.IN), new ActionArgument("return", "VirtualQueryActionOutput", ActionArgument.Direction.OUT)});
        mo40480j(s);
    }

    /* renamed from: d */
    public String mo40474d() {
        return "QueryStateVariable";
    }

    /* renamed from: k */
    public List<C10023k> mo40481k() {
        return Collections.EMPTY_LIST;
    }
}
