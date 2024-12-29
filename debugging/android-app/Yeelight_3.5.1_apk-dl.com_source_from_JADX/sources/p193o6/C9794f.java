package p193o6;

import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.meta.C10069d;
import org.fourthline.cling.model.meta.C10071f;
import org.fourthline.cling.model.types.ErrorCode;
import p214t6.C10404d;
import p226w6.C11957c;

/* renamed from: o6.f */
public class C9794f extends C9788a {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo38960b(C9792d<C10404d> dVar, Object obj) {
        if (!(dVar.mo38967a() instanceof C10069d)) {
            throw new IllegalStateException("This class can only execute QueryStateVariableAction's, not: " + dVar.mo38967a());
        } else if (!dVar.mo38967a().mo40477g().mo42079u()) {
            dVar.mo38976j(new ActionException(ErrorCode.INVALID_ACTION, "This service does not support querying state variables"));
        } else {
            mo38985f(dVar, obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo38985f(C9792d<C10404d> dVar, Object obj) {
        C10404d g = dVar.mo38967a().mo40477g();
        String lVar = dVar.mo38970d("varName").toString();
        C10071f h = g.mo40535h(lVar);
        if (h != null) {
            C11957c n = g.mo42072n(h.mo40543b());
            if (n != null) {
                try {
                    mo38963e(dVar, dVar.mo38967a().mo40475e("return"), n.mo42507c(h, obj).toString());
                } catch (Exception e) {
                    throw new ActionException(ErrorCode.ACTION_FAILED, e.getMessage());
                }
            } else {
                ErrorCode errorCode = ErrorCode.ARGUMENT_VALUE_INVALID;
                throw new ActionException(errorCode, "No accessor for state variable, can't read state: " + lVar);
            }
        } else {
            ErrorCode errorCode2 = ErrorCode.ARGUMENT_VALUE_INVALID;
            throw new ActionException(errorCode2, "No state variable found: " + lVar);
        }
    }
}
