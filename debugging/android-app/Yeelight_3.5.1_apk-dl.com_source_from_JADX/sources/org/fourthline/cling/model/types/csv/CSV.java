package org.fourthline.cling.model.types.csv;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.fourthline.cling.model.C10018f;
import org.fourthline.cling.model.types.Datatype;
import org.fourthline.cling.model.types.InvalidValueException;
import org.seamless.util.C10247d;

public abstract class CSV<T> extends ArrayList<T> {
    protected final Datatype.Builtin datatype = getBuiltinDatatype();

    public CSV() {
    }

    public CSV(String str) {
        addAll(parseString(str));
    }

    /* access modifiers changed from: protected */
    public Datatype.Builtin getBuiltinDatatype() {
        Class cls = C10247d.m25772j(ArrayList.class, getClass()).get(0);
        Datatype.Default byJavaType = Datatype.Default.getByJavaType(cls);
        if (byJavaType != null) {
            return byJavaType.getBuiltinType();
        }
        throw new InvalidValueException("No built-in UPnP datatype for Java type of CSV: " + cls);
    }

    /* access modifiers changed from: protected */
    public List parseString(String str) {
        String[] a = C10018f.m24802a(str);
        ArrayList arrayList = new ArrayList();
        for (String f : a) {
            arrayList.add(this.datatype.getDatatype().mo40561f(f));
        }
        return arrayList;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(this.datatype.getDatatype().mo40556a(it.next()));
        }
        return C10018f.m24807f(arrayList.toArray(new Object[arrayList.size()]));
    }
}
