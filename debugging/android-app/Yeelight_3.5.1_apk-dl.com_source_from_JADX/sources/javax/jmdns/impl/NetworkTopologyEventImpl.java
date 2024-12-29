package javax.jmdns.impl;

import java.net.InetAddress;
import javax.jmdns.C9218a;
import javax.jmdns.C9223c;
import javax.jmdns.NetworkTopologyEvent;

public class NetworkTopologyEventImpl extends NetworkTopologyEvent implements Cloneable {
    private static final long serialVersionUID = 1445606146153550463L;
    private final InetAddress _inetAddress;

    public NetworkTopologyEventImpl(C9218a aVar, InetAddress inetAddress) {
        super(aVar);
        this._inetAddress = inetAddress;
    }

    NetworkTopologyEventImpl(C9223c cVar, InetAddress inetAddress) {
        super(cVar);
        this._inetAddress = inetAddress;
    }

    public NetworkTopologyEventImpl clone() {
        return new NetworkTopologyEventImpl(getDNS(), getInetAddress());
    }

    public C9218a getDNS() {
        if (getSource() instanceof C9218a) {
            return (C9218a) getSource();
        }
        return null;
    }

    public InetAddress getInetAddress() {
        return this._inetAddress;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + getClass().getSimpleName() + "@" + System.identityHashCode(this) + " ");
        sb.append("\n\tinetAddress: '");
        sb.append(getInetAddress());
        sb.append("']");
        return sb.toString();
    }
}
