package javax.servlet;

import p208s4.C10359k;

public class ServletContextAttributeEvent extends ServletContextEvent {
    private String name;
    private Object value;

    public ServletContextAttributeEvent(C10359k kVar, String str, Object obj) {
        super(kVar);
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
