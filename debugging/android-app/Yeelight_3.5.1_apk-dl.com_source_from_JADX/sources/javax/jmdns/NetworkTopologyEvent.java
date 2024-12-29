package javax.jmdns;

import java.net.InetAddress;
import java.util.EventObject;

public abstract class NetworkTopologyEvent extends EventObject {
    private static final long serialVersionUID = -8630033521752540987L;

    protected NetworkTopologyEvent(Object obj) {
        super(obj);
    }

    public abstract C9218a getDNS();

    public abstract InetAddress getInetAddress();
}
