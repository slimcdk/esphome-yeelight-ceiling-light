package p193o6;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.model.C10012a;
import org.fourthline.cling.model.C10022j;
import org.fourthline.cling.model.action.ActionCancelledException;
import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.meta.C10066a;
import org.fourthline.cling.model.types.ErrorCode;
import org.fourthline.cling.model.types.InvalidValueException;
import org.seamless.util.C10243a;
import p214t6.C10404d;
import p226w6.C11957c;

/* renamed from: o6.a */
public abstract class C9788a implements C9791c {

    /* renamed from: b */
    private static Logger f17659b = Logger.getLogger(C9788a.class.getName());

    /* renamed from: a */
    protected Map<ActionArgument<C10404d>, C11957c> f17660a = new HashMap();

    /* renamed from: o6.a$a */
    class C9789a implements C10012a {

        /* renamed from: a */
        final /* synthetic */ C9792d f17661a;

        C9789a(C9792d dVar) {
            this.f17661a = dVar;
        }

        /* renamed from: a */
        public void mo38964a(C10022j jVar) {
            C9788a.this.mo38960b(this.f17661a, jVar.mo40321b());
        }

        public String toString() {
            return "Action invocation: " + this.f17661a.mo38967a();
        }
    }

    protected C9788a() {
    }

    protected C9788a(Map<ActionArgument<C10404d>, C11957c> map) {
        this.f17660a = map;
    }

    /* renamed from: a */
    public void mo38959a(C9792d<C10404d> dVar) {
        ActionException actionException;
        Logger logger = f17659b;
        logger.fine("Invoking on local service: " + dVar);
        C10404d g = dVar.mo38967a().mo40477g();
        try {
            if (g.mo42075q() != null) {
                g.mo42075q().mo40323d(new C9789a(dVar));
                return;
            }
            throw new IllegalStateException("Service has no implementation factory, can't get service instance");
        } catch (ActionException e) {
            Logger logger2 = f17659b;
            Level level = Level.FINE;
            if (logger2.isLoggable(level)) {
                Logger logger3 = f17659b;
                logger3.fine("ActionException thrown by service, wrapping in invocation and returning: " + e);
                f17659b.log(level, "Exception root cause: ", C10243a.m25753a(e));
            }
            dVar.mo38976j(e);
        } catch (InterruptedException e2) {
            Logger logger4 = f17659b;
            Level level2 = Level.FINE;
            if (logger4.isLoggable(level2)) {
                Logger logger5 = f17659b;
                logger5.fine("InterruptedException thrown by service, wrapping in invocation and returning: " + e2);
                f17659b.log(level2, "Exception root cause: ", C10243a.m25753a(e2));
            }
            actionException = new ActionCancelledException(e2);
            dVar.mo38976j(actionException);
        } catch (Throwable th) {
            Throwable a = C10243a.m25753a(th);
            Logger logger6 = f17659b;
            Level level3 = Level.FINE;
            if (logger6.isLoggable(level3)) {
                Logger logger7 = f17659b;
                logger7.fine("Execution has thrown, wrapping root cause in ActionException and returning: " + th);
                f17659b.log(level3, "Exception root cause: ", a);
            }
            actionException = new ActionException(ErrorCode.ACTION_FAILED, a.getMessage() != null ? a.getMessage() : a.toString(), a);
            dVar.mo38976j(actionException);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo38960b(C9792d<C10404d> dVar, Object obj);

    /* renamed from: c */
    public Map<ActionArgument<C10404d>, C11957c> mo38961c() {
        return this.f17660a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Object mo38962d(C10066a<C10404d> aVar, Object obj) {
        int length = aVar.mo40476f().length;
        Object[] objArr = new Object[length];
        Logger logger = f17659b;
        logger.fine("Attempting to retrieve output argument values using accessor: " + length);
        ActionArgument[] f = aVar.mo40476f();
        int length2 = f.length;
        int i = 0;
        int i2 = 0;
        while (i < length2) {
            ActionArgument actionArgument = f[i];
            Logger logger2 = f17659b;
            logger2.finer("Calling acccessor method for: " + actionArgument);
            C11957c cVar = mo38961c().get(actionArgument);
            if (cVar != null) {
                Logger logger3 = f17659b;
                logger3.fine("Calling accessor to read output argument value: " + cVar);
                objArr[i2] = cVar.mo42503b(obj);
                i++;
                i2++;
            } else {
                throw new IllegalStateException("No accessor bound for: " + actionArgument);
            }
        }
        if (length == 1) {
            return objArr[0];
        }
        if (length > 0) {
            return objArr;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo38963e(C9792d<C10404d> dVar, ActionArgument<C10404d> actionArgument, Object obj) {
        C9790b bVar;
        C10404d g = dVar.mo38967a().mo40477g();
        if (obj != null) {
            try {
                if (g.mo42078t(obj)) {
                    f17659b.fine("Result of invocation matches convertible type, setting toString() single output argument value");
                    bVar = new C9790b(actionArgument, obj.toString());
                } else {
                    f17659b.fine("Result of invocation is Object, setting single output argument value");
                    bVar = new C9790b(actionArgument, obj);
                }
                dVar.mo38980n(bVar);
            } catch (InvalidValueException e) {
                ErrorCode errorCode = ErrorCode.ARGUMENT_VALUE_INVALID;
                throw new ActionException(errorCode, "Wrong type or invalid value for '" + actionArgument.mo40464e() + "': " + e.getMessage(), (Throwable) e);
            }
        } else {
            f17659b.fine("Result of invocation is null, not setting any output argument value(s)");
        }
    }
}
