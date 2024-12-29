package p183l6;

import java.util.List;
import org.fourthline.cling.model.meta.C10071f;
import org.fourthline.cling.model.types.Datatype;
import p214t6.C10410j;
import p214t6.C10411k;
import p214t6.C10412l;

/* renamed from: l6.g */
public class C9541g {

    /* renamed from: a */
    public String f17409a;

    /* renamed from: b */
    public Datatype f17410b;

    /* renamed from: c */
    public String f17411c;

    /* renamed from: d */
    public List<String> f17412d;

    /* renamed from: e */
    public C9537c f17413e;

    /* renamed from: f */
    public C10411k f17414f;

    /* renamed from: a */
    public C10071f mo38508a() {
        String[] strArr;
        String str = this.f17409a;
        Datatype datatype = this.f17410b;
        String str2 = this.f17411c;
        List<String> list = this.f17412d;
        C10410j jVar = null;
        if (list == null || list.size() == 0) {
            strArr = null;
        } else {
            List<String> list2 = this.f17412d;
            strArr = (String[]) list2.toArray(new String[list2.size()]);
        }
        if (this.f17413e != null) {
            jVar = new C10410j(this.f17413e.f17375a.longValue(), this.f17413e.f17376b.longValue(), this.f17413e.f17377c.longValue());
        }
        return new C10071f(str, new C10412l(datatype, str2, strArr, jVar), this.f17414f);
    }
}
