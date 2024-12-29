package org.fourthline.cling.model.message;

import java.io.ByteArrayInputStream;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.model.message.header.UpnpHeader;
import p158f7.C9046b;

/* renamed from: org.fourthline.cling.model.message.f */
public class C10032f extends C9046b {

    /* renamed from: d */
    private static final Logger f18530d = Logger.getLogger(C10032f.class.getName());

    /* renamed from: c */
    protected Map<UpnpHeader.Type, List<UpnpHeader>> f18531c;

    public C10032f() {
    }

    public C10032f(ByteArrayInputStream byteArrayInputStream) {
        super(byteArrayInputStream);
    }

    public C10032f(Map<String, List<String>> map) {
        super(map);
    }

    public C10032f(boolean z) {
        super(z);
    }

    /* renamed from: a */
    public void mo36963a(String str, String str2) {
        this.f18531c = null;
        super.mo36963a(str, str2);
    }

    public void clear() {
        this.f18531c = null;
        super.clear();
    }

    /* renamed from: g */
    public List<String> put(String str, List<String> list) {
        this.f18531c = null;
        return super.put(str, list);
    }

    /* renamed from: j */
    public List<String> remove(Object obj) {
        this.f18531c = null;
        return super.remove(obj);
    }

    /* renamed from: l */
    public void mo40438l(UpnpHeader.Type type, UpnpHeader upnpHeader) {
        super.mo36963a(type.getHttpName(), upnpHeader.mo40448a());
        if (this.f18531c != null) {
            mo40439m(type, upnpHeader);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo40439m(UpnpHeader.Type type, UpnpHeader upnpHeader) {
        Logger logger = f18530d;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine("Adding parsed header: " + upnpHeader);
        }
        List list = this.f18531c.get(type);
        if (list == null) {
            list = new LinkedList();
            this.f18531c.put(type, list);
        }
        list.add(upnpHeader);
    }

    /* renamed from: n */
    public boolean mo40440n(UpnpHeader.Type type) {
        if (this.f18531c == null) {
            mo40445s();
        }
        return this.f18531c.containsKey(type);
    }

    /* renamed from: o */
    public UpnpHeader[] mo40441o(UpnpHeader.Type type) {
        if (this.f18531c == null) {
            mo40445s();
        }
        return this.f18531c.get(type) != null ? (UpnpHeader[]) this.f18531c.get(type).toArray(new UpnpHeader[this.f18531c.get(type).size()]) : new UpnpHeader[0];
    }

    /* renamed from: p */
    public UpnpHeader mo40442p(UpnpHeader.Type type) {
        if (mo40441o(type).length > 0) {
            return mo40441o(type)[0];
        }
        return null;
    }

    /* renamed from: q */
    public <H extends UpnpHeader> H mo40443q(UpnpHeader.Type type, Class<H> cls) {
        H[] o = mo40441o(type);
        if (o.length == 0) {
            return null;
        }
        for (H h : o) {
            if (cls.isAssignableFrom(h.getClass())) {
                return h;
            }
        }
        return null;
    }

    /* renamed from: r */
    public String mo40444r(UpnpHeader.Type type) {
        UpnpHeader p = mo40442p(type);
        if (p != null) {
            return p.mo40448a();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo40445s() {
        this.f18531c = new LinkedHashMap();
        Logger logger = f18530d;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine("Parsing all HTTP headers for known UPnP headers: " + size());
        }
        for (Map.Entry next : entrySet()) {
            if (next.getKey() != null) {
                UpnpHeader.Type byHttpName = UpnpHeader.Type.getByHttpName((String) next.getKey());
                if (byHttpName == null) {
                    Logger logger2 = f18530d;
                    if (logger2.isLoggable(Level.FINE)) {
                        logger2.fine("Ignoring non-UPNP HTTP header: " + ((String) next.getKey()));
                    }
                } else {
                    for (String str : (List) next.getValue()) {
                        UpnpHeader c = UpnpHeader.m24914c(byHttpName, str);
                        if (c == null || c.mo40449b() == null) {
                            Logger logger3 = f18530d;
                            if (logger3.isLoggable(Level.FINE)) {
                                logger3.fine("Ignoring known but irrelevant header (value violates the UDA specification?) '" + byHttpName.getHttpName() + "': " + str);
                            }
                        } else {
                            mo40439m(byHttpName, c);
                        }
                    }
                }
            }
        }
    }
}
