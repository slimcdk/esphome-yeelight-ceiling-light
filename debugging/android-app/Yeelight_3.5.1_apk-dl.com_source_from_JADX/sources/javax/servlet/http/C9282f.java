package javax.servlet.http;

import java.util.EventListener;

/* renamed from: javax.servlet.http.f */
public interface C9282f extends EventListener {
    void sessionDidActivate(HttpSessionEvent httpSessionEvent);

    void sessionWillPassivate(HttpSessionEvent httpSessionEvent);
}
