package javax.servlet.http;

public class HttpSessionBindingEvent extends HttpSessionEvent {
    private String name;
    private Object value;

    public HttpSessionBindingEvent(C9281e eVar, String str) {
        super(eVar);
        this.name = str;
    }

    public HttpSessionBindingEvent(C9281e eVar, String str, Object obj) {
        super(eVar);
        this.name = str;
        this.value = obj;
    }

    public String getName() {
        return this.name;
    }

    public C9281e getSession() {
        return super.getSession();
    }

    public Object getValue() {
        return this.value;
    }
}
