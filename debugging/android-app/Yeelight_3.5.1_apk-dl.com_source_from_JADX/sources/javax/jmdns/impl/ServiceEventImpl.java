package javax.jmdns.impl;

import javax.jmdns.C9218a;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;

public class ServiceEventImpl extends ServiceEvent {
    private static final long serialVersionUID = 7107973622016897488L;
    private final ServiceInfo _info;
    private final String _name;
    private final String _type;

    public ServiceEventImpl(JmDNSImpl jmDNSImpl, String str, String str2, ServiceInfo serviceInfo) {
        super(jmDNSImpl);
        this._type = str;
        this._name = str2;
        this._info = serviceInfo;
    }

    public ServiceEventImpl clone() {
        return new ServiceEventImpl((JmDNSImpl) getDNS(), getType(), getName(), new ServiceInfoImpl(getInfo()));
    }

    public C9218a getDNS() {
        return (C9218a) getSource();
    }

    public ServiceInfo getInfo() {
        return this._info;
    }

    public String getName() {
        return this._name;
    }

    public String getType() {
        return this._type;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + getClass().getSimpleName() + "@" + System.identityHashCode(this) + " ");
        sb.append("\n\tname: '");
        sb.append(getName());
        sb.append("' type: '");
        sb.append(getType());
        sb.append("' info: '");
        sb.append(getInfo());
        sb.append("']");
        return sb.toString();
    }
}
