package javax.servlet.http;

import java.util.EventListener;

/* renamed from: javax.servlet.http.h */
public interface C9284h extends EventListener {
    void valueBound(HttpSessionBindingEvent httpSessionBindingEvent);

    void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent);
}
