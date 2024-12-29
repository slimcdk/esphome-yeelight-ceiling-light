package p204q6;

import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.message.C10030d;
import org.fourthline.cling.model.message.header.C10063x;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.meta.C10066a;
import org.fourthline.cling.model.types.C10100u;
import org.fourthline.cling.model.types.ErrorCode;
import p214t6.C10404d;

/* renamed from: q6.d */
public class C10288d extends C10030d implements C10286b {

    /* renamed from: h */
    private final C10066a f19370h;

    /* renamed from: i */
    private final String f19371i;

    public C10288d(C10030d dVar, C10404d dVar2) {
        super(dVar);
        C10063x xVar = (C10063x) mo40403j().mo40443q(UpnpHeader.Type.SOAPACTION, C10063x.class);
        if (xVar != null) {
            C10100u uVar = (C10100u) xVar.mo40449b();
            C10066a a = dVar2.mo40528a(uVar.mo40651a());
            this.f19370h = a;
            if (a == null) {
                ErrorCode errorCode = ErrorCode.INVALID_ACTION;
                throw new ActionException(errorCode, "Service doesn't implement action: " + uVar.mo40651a());
            } else if ("QueryStateVariable".equals(uVar.mo40651a()) || dVar2.mo40534g().mo40646d(uVar.mo40653c())) {
                this.f19371i = uVar.mo40655e();
            } else {
                throw new ActionException(ErrorCode.INVALID_ACTION, "Service doesn't support the requested service version");
            }
        } else {
            throw new ActionException(ErrorCode.INVALID_ACTION, "Missing SOAP action header");
        }
    }

    /* renamed from: d */
    public String mo41806d() {
        return this.f19371i;
    }

    /* renamed from: y */
    public C10066a mo41807y() {
        return this.f19370h;
    }
}
