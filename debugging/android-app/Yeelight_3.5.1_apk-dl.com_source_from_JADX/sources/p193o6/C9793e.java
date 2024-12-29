package p193o6;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Logger;
import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.types.ErrorCode;
import p214t6.C10404d;
import p218u6.C10542c;
import p226w6.C11957c;

/* renamed from: o6.e */
public class C9793e extends C9788a {

    /* renamed from: d */
    private static Logger f17669d = Logger.getLogger(C9793e.class.getName());

    /* renamed from: c */
    protected Method f17670c;

    public C9793e(Map<ActionArgument<C10404d>, C11957c> map, Method method) {
        super(map);
        this.f17670c = method;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c2  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo38960b(p193o6.C9792d<p214t6.C10404d> r6, java.lang.Object r7) {
        /*
            r5 = this;
            java.lang.reflect.Method r0 = r5.f17670c
            java.lang.Object[] r0 = r5.mo38983f(r6, r0)
            org.fourthline.cling.model.meta.a r1 = r6.mo38967a()
            boolean r1 = r1.mo40479i()
            if (r1 != 0) goto L_0x002e
            java.util.logging.Logger r6 = f17669d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Calling local service method with no output arguments: "
            r1.append(r2)
            java.lang.reflect.Method r2 = r5.f17670c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r6.fine(r1)
            java.lang.reflect.Method r6 = r5.f17670c
            org.seamless.util.C10247d.m25773k(r6, r7, r0)
            return
        L_0x002e:
            java.lang.reflect.Method r1 = r5.f17670c
            java.lang.Class r1 = r1.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            boolean r1 = r1.equals(r2)
            java.util.logging.Logger r2 = f17669d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Calling local service method with output arguments: "
            r3.append(r4)
            java.lang.reflect.Method r4 = r5.f17670c
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.fine(r3)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x006c
            java.util.logging.Logger r1 = f17669d
            java.lang.String r4 = "Action method is void, calling declared accessors(s) on service instance to retrieve ouput argument(s)"
            r1.fine(r4)
            java.lang.reflect.Method r1 = r5.f17670c
            org.seamless.util.C10247d.m25773k(r1, r7, r0)
        L_0x0062:
            org.fourthline.cling.model.meta.a r0 = r6.mo38967a()
            java.lang.Object r7 = r5.mo38962d(r0, r7)
            r0 = 1
            goto L_0x008e
        L_0x006c:
            boolean r1 = r5.mo38984g(r6)
            if (r1 == 0) goto L_0x0080
            java.util.logging.Logger r1 = f17669d
            java.lang.String r4 = "Action method is not void, calling declared accessor(s) on returned instance to retrieve ouput argument(s)"
            r1.fine(r4)
            java.lang.reflect.Method r1 = r5.f17670c
            java.lang.Object r7 = org.seamless.util.C10247d.m25773k(r1, r7, r0)
            goto L_0x0062
        L_0x0080:
            java.util.logging.Logger r1 = f17669d
            java.lang.String r4 = "Action method is not void, using returned value as (single) output argument"
            r1.fine(r4)
            java.lang.reflect.Method r1 = r5.f17670c
            java.lang.Object r7 = org.seamless.util.C10247d.m25773k(r1, r7, r0)
            r0 = 0
        L_0x008e:
            org.fourthline.cling.model.meta.a r1 = r6.mo38967a()
            org.fourthline.cling.model.meta.ActionArgument[] r1 = r1.mo40476f()
            if (r0 == 0) goto L_0x00c2
            boolean r0 = r7 instanceof java.lang.Object[]
            if (r0 == 0) goto L_0x00c2
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            java.util.logging.Logger r0 = f17669d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Accessors returned Object[], setting output argument values: "
            r3.append(r4)
            int r4 = r7.length
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.fine(r3)
        L_0x00b5:
            int r0 = r1.length
            if (r2 >= r0) goto L_0x00ca
            r0 = r1[r2]
            r3 = r7[r2]
            r5.mo38963e(r6, r0, r3)
            int r2 = r2 + 1
            goto L_0x00b5
        L_0x00c2:
            int r0 = r1.length
            if (r0 != r3) goto L_0x00cb
            r0 = r1[r2]
            r5.mo38963e(r6, r0, r7)
        L_0x00ca:
            return
        L_0x00cb:
            org.fourthline.cling.model.action.ActionException r6 = new org.fourthline.cling.model.action.ActionException
            org.fourthline.cling.model.types.ErrorCode r7 = org.fourthline.cling.model.types.ErrorCode.ACTION_FAILED
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Method return does not match required number of output arguments: "
            r0.append(r2)
            int r1 = r1.length
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>((org.fourthline.cling.model.types.ErrorCode) r7, (java.lang.String) r0)
            goto L_0x00e6
        L_0x00e5:
            throw r6
        L_0x00e6:
            goto L_0x00e5
        */
        throw new UnsupportedOperationException("Method not decompiled: p193o6.C9793e.mo38960b(o6.d, java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Object[] mo38983f(C9792d<C10404d> dVar, Method method) {
        C9792d<C10404d> dVar2 = dVar;
        Method method2 = method;
        C10404d g = dVar.mo38967a().mo40477g();
        ArrayList arrayList = new ArrayList();
        ActionArgument[] c = dVar.mo38967a().mo40473c();
        int length = c.length;
        char c2 = 0;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            ActionArgument actionArgument = c[i];
            Class cls = method.getParameterTypes()[i2];
            C9790b<C10404d> e = dVar2.mo38971e(actionArgument);
            if (!cls.isPrimitive() || !(e == null || e.toString().length() == 0)) {
                if (e == null) {
                    arrayList.add(i2, (Object) null);
                    i2++;
                } else {
                    String lVar = e.toString();
                    if (lVar.length() <= 0 || !g.mo42077s(cls) || cls.isEnum()) {
                        arrayList.add(i2, e.mo40392b());
                        i2++;
                    } else {
                        try {
                            Class[] clsArr = new Class[1];
                            clsArr[c2] = String.class;
                            Constructor constructor = cls.getConstructor(clsArr);
                            Logger logger = f17669d;
                            logger.finer("Creating new input argument value instance with String.class constructor of type: " + cls);
                            Object[] objArr = {lVar};
                            int i3 = i2 + 1;
                            arrayList.add(i2, constructor.newInstance(objArr));
                            i2 = i3;
                        } catch (Exception e2) {
                            Logger logger2 = f17669d;
                            logger2.warning("Error preparing action method call: " + method2);
                            Logger logger3 = f17669d;
                            logger3.warning("Can't convert input argument string to desired type of '" + actionArgument.mo40464e() + "': " + e2);
                            ErrorCode errorCode = ErrorCode.ARGUMENT_VALUE_INVALID;
                            throw new ActionException(errorCode, "Can't convert input argument string to desired type of '" + actionArgument.mo40464e() + "': " + e2);
                        }
                    }
                }
                i++;
                c2 = 0;
            } else {
                ErrorCode errorCode2 = ErrorCode.ARGUMENT_VALUE_INVALID;
                throw new ActionException(errorCode2, "Primitive action method argument '" + actionArgument.mo40464e() + "' requires input value, can't be null or empty string");
            }
        }
        if (method.getParameterTypes().length > 0 && C10542c.class.isAssignableFrom(method.getParameterTypes()[method.getParameterTypes().length - 1])) {
            if (dVar2 instanceof C9795g) {
                C9795g gVar = (C9795g) dVar2;
                if (gVar.mo38986p() != null) {
                    Logger logger4 = f17669d;
                    logger4.finer("Providing remote client info as last action method input argument: " + method2);
                    arrayList.add(i2, gVar.mo38986p());
                }
            }
            arrayList.add(i2, (Object) null);
        }
        return arrayList.toArray(new Object[arrayList.size()]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo38984g(C9792d<C10404d> dVar) {
        for (ActionArgument actionArgument : dVar.mo38967a().mo40476f()) {
            if (mo38961c().get(actionArgument) != null) {
                return true;
            }
        }
        return false;
    }
}
