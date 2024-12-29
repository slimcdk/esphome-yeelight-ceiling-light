package javax.servlet;

import p208s4.C10359k;
import p208s4.C10364p;

public class ServletRequestAttributeEvent extends ServletRequestEvent {
    private String name;
    private Object value;

    public ServletRequestAttributeEvent(C10359k kVar, C10364p pVar, String str, Object obj) {
        super(kVar, pVar);
        this.name = str;
        this.value = obj;
    }

    public String getName() {
        return this.name;
    }

    public Object getValue() {
        return this.value;
    }
}
