package javax.servlet.http;

import java.util.EventObject;

public class HttpSessionEvent extends EventObject {
    public HttpSessionEvent(C9281e eVar) {
        super(eVar);
    }

    public C9281e getSession() {
        return (C9281e) super.getSource();
    }
}
