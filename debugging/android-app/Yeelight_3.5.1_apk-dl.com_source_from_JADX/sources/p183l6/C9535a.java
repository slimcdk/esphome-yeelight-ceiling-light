package p183l6;

import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.meta.C10066a;

/* renamed from: l6.a */
public class C9535a {

    /* renamed from: a */
    public String f17369a;

    /* renamed from: b */
    public List<C9536b> f17370b = new ArrayList();

    /* renamed from: a */
    public C10066a mo38494a() {
        return new C10066a(this.f17369a, mo38495b());
    }

    /* renamed from: b */
    public ActionArgument[] mo38495b() {
        ActionArgument[] actionArgumentArr = new ActionArgument[this.f17370b.size()];
        int i = 0;
        for (C9536b a : this.f17370b) {
            actionArgumentArr[i] = a.mo38496a();
            i++;
        }
        return actionArgumentArr;
    }
}
