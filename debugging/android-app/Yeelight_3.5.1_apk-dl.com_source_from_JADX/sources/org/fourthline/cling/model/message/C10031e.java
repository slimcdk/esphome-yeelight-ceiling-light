package org.fourthline.cling.model.message;

import org.fourthline.cling.model.message.UpnpMessage;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.header.C10041d;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.seamless.util.C10245c;

/* renamed from: org.fourthline.cling.model.message.e */
public class C10031e extends UpnpMessage<UpnpResponse> {
    public C10031e(String str) {
        super(new UpnpResponse(UpnpResponse.Status.OK), UpnpMessage.BodyType.STRING, str);
    }

    public C10031e(String str, C10041d dVar) {
        this(str);
        mo40403j().mo40438l(UpnpHeader.Type.CONTENT_TYPE, dVar);
    }

    public C10031e(UpnpResponse.Status status) {
        super(new UpnpResponse(status));
    }

    public C10031e(UpnpResponse upnpResponse) {
        super(upnpResponse);
    }

    public C10031e(C10031e eVar) {
        super(eVar);
    }

    public C10031e(byte[] bArr) {
        super(new UpnpResponse(UpnpResponse.Status.OK), UpnpMessage.BodyType.BYTES, bArr);
    }

    public C10031e(byte[] bArr, C10041d dVar) {
        this(bArr);
        mo40403j().mo40438l(UpnpHeader.Type.CONTENT_TYPE, dVar);
    }

    public C10031e(byte[] bArr, C10245c cVar) {
        this(bArr, new C10041d(cVar));
    }
}
