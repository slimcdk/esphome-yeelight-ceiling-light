package org.fourthline.cling.model;

import java.util.logging.Logger;
import org.fourthline.cling.model.types.Datatype;
import org.fourthline.cling.model.types.InvalidValueException;

/* renamed from: org.fourthline.cling.model.l */
public class C10024l {

    /* renamed from: c */
    private static final Logger f18509c = Logger.getLogger(C10024l.class.getName());

    /* renamed from: a */
    private final Datatype f18510a;

    /* renamed from: b */
    private final Object f18511b;

    public C10024l(Datatype datatype, Object obj) {
        this.f18510a = datatype;
        this.f18511b = obj instanceof String ? datatype.mo40561f((String) obj) : obj;
        if (!C10018f.f18492a) {
            if (mo40391a().mo40558c(mo40392b())) {
                mo40393c(toString());
                return;
            }
            throw new InvalidValueException("Invalid value for " + mo40391a() + ": " + mo40392b());
        }
    }

    /* renamed from: a */
    public Datatype mo40391a() {
        return this.f18510a;
    }

    /* renamed from: b */
    public Object mo40392b() {
        return this.f18511b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo40393c(String str) {
        int i = 0;
        while (i < str.length()) {
            int codePointAt = str.codePointAt(i);
            if (!(codePointAt == 9 || codePointAt == 10 || codePointAt == 13 || ((codePointAt >= 32 && codePointAt <= 55295) || ((codePointAt >= 57344 && codePointAt <= 65533) || (codePointAt >= 65536 && codePointAt <= 1114111))))) {
                Logger logger = f18509c;
                logger.warning("Found invalid XML char code: " + codePointAt);
            }
            i += Character.charCount(codePointAt);
        }
    }

    public String toString() {
        return mo40391a().mo40556a(mo40392b());
    }
}
