package org.fourthline.cling.model.message;

import java.net.URI;
import java.net.URL;
import org.fourthline.cling.model.message.UpnpRequest;

/* renamed from: org.fourthline.cling.model.message.d */
public class C10030d extends UpnpMessage<UpnpRequest> {

    /* renamed from: g */
    protected C10027a f18529g;

    public C10030d(UpnpRequest.Method method, URI uri) {
        super(new UpnpRequest(method, uri));
    }

    public C10030d(UpnpRequest.Method method, URL url) {
        super(new UpnpRequest(method, url));
    }

    public C10030d(UpnpRequest upnpRequest) {
        super(upnpRequest);
    }

    public C10030d(C10030d dVar) {
        super(dVar);
        this.f18529g = dVar.mo40434u();
    }

    /* renamed from: u */
    public C10027a mo40434u() {
        return this.f18529g;
    }

    /* renamed from: v */
    public URI mo40435v() {
        return ((UpnpRequest) mo40404k()).mo40417e();
    }

    /* renamed from: w */
    public void mo40436w(C10027a aVar) {
        this.f18529g = aVar;
    }

    /* renamed from: x */
    public void mo40437x(URI uri) {
        ((UpnpRequest) mo40404k()).mo40418f(uri);
    }
}
