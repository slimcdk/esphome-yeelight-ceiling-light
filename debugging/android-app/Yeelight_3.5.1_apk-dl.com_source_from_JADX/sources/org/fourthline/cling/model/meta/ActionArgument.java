package org.fourthline.cling.model.meta;

import com.miot.common.device.parser.xml.DddTag;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.fourthline.cling.model.C10018f;
import org.fourthline.cling.model.C10023k;
import org.fourthline.cling.model.meta.C10070e;
import org.fourthline.cling.model.types.Datatype;

public class ActionArgument<S extends C10070e> {

    /* renamed from: g */
    private static final Logger f18550g = Logger.getLogger(ActionArgument.class.getName());

    /* renamed from: a */
    private final String f18551a;

    /* renamed from: b */
    private final String[] f18552b;

    /* renamed from: c */
    private final String f18553c;

    /* renamed from: d */
    private final Direction f18554d;

    /* renamed from: e */
    private final boolean f18555e;

    /* renamed from: f */
    private C10066a<S> f18556f;

    public enum Direction {
        IN,
        OUT
    }

    public ActionArgument(String str, String str2, Direction direction) {
        this(str, new String[0], str2, direction, false);
    }

    public ActionArgument(String str, String str2, Direction direction, boolean z) {
        this(str, new String[0], str2, direction, z);
    }

    public ActionArgument(String str, String[] strArr, String str2, Direction direction) {
        this(str, strArr, str2, direction, false);
    }

    public ActionArgument(String str, String[] strArr, String str2, Direction direction, boolean z) {
        this.f18551a = str;
        this.f18552b = strArr;
        this.f18553c = str2;
        this.f18554d = direction;
        this.f18555e = z;
    }

    /* renamed from: a */
    public C10066a<S> mo40460a() {
        return this.f18556f;
    }

    /* renamed from: b */
    public String[] mo40461b() {
        return this.f18552b;
    }

    /* renamed from: c */
    public Datatype mo40462c() {
        return mo40460a().mo40477g().mo40530c(this);
    }

    /* renamed from: d */
    public Direction mo40463d() {
        return this.f18554d;
    }

    /* renamed from: e */
    public String mo40464e() {
        return this.f18551a;
    }

    /* renamed from: f */
    public String mo40465f() {
        return this.f18553c;
    }

    /* renamed from: g */
    public boolean mo40466g(String str) {
        if (mo40464e().equalsIgnoreCase(str)) {
            return true;
        }
        for (String equalsIgnoreCase : this.f18552b) {
            if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public boolean mo40467h() {
        return this.f18555e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo40468i(C10066a<S> aVar) {
        if (this.f18556f == null) {
            this.f18556f = aVar;
            return;
        }
        throw new IllegalStateException("Final value has been set already, model is immutable");
    }

    /* renamed from: j */
    public List<C10023k> mo40469j() {
        Logger logger;
        StringBuilder sb;
        String str;
        Class<ActionArgument> cls = ActionArgument.class;
        ArrayList arrayList = new ArrayList();
        if (mo40464e() == null || mo40464e().length() == 0) {
            arrayList.add(new C10023k(cls, "name", "Argument without name of: " + mo40460a()));
        } else {
            if (!C10018f.m24806e(mo40464e())) {
                logger = f18550g;
                logger.warning("UPnP specification violation of: " + mo40460a().mo40477g().mo40531d());
                sb = new StringBuilder();
                str = "Invalid argument name: ";
            } else if (mo40464e().length() > 32) {
                logger = f18550g;
                logger.warning("UPnP specification violation of: " + mo40460a().mo40477g().mo40531d());
                sb = new StringBuilder();
                str = "Argument name should be less than 32 characters: ";
            }
            sb.append(str);
            sb.append(this);
            logger.warning(sb.toString());
        }
        if (mo40463d() == null) {
            arrayList.add(new C10023k(cls, DddTag.ARGS_ARG_DIRECTION, "Argument '" + mo40464e() + "' requires a direction, either IN or OUT"));
        }
        if (mo40467h() && mo40463d() != Direction.OUT) {
            arrayList.add(new C10023k(cls, DddTag.ARGS_ARG_DIRECTION, "Return value argument '" + mo40464e() + "' must be direction OUT"));
        }
        return arrayList;
    }

    public String toString() {
        return "(" + ActionArgument.class.getSimpleName() + ", " + mo40463d() + ") " + mo40464e();
    }
}
