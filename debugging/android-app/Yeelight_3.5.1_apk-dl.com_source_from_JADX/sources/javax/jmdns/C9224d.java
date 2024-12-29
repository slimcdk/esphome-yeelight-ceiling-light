package javax.jmdns;

import java.util.EventListener;

/* renamed from: javax.jmdns.d */
public interface C9224d extends EventListener {
    void serviceAdded(ServiceEvent serviceEvent);

    void serviceRemoved(ServiceEvent serviceEvent);

    void serviceResolved(ServiceEvent serviceEvent);
}
