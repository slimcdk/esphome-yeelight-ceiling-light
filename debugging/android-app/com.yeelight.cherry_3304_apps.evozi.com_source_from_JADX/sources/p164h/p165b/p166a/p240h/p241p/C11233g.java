package p164h.p165b.p166a.p240h.p241p;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Logger;
import p164h.p165b.p166a.p240h.p248s.C11321b;
import p164h.p165b.p166a.p240h.p248s.C11328h;
import p164h.p165b.p166a.p240h.p249t.C11343c;
import p164h.p165b.p166a.p240h.p251v.C11353c;
import p164h.p165b.p166a.p240h.p252w.C11386n;

/* renamed from: h.b.a.h.p.g */
public class C11233g extends C11226a {

    /* renamed from: d */
    private static Logger f22327d = Logger.getLogger(C11233g.class.getName());

    /* renamed from: c */
    protected Method f22328c;

    public C11233g(Map<C11321b<C11328h>, C11353c> map, Method method) {
        super(map);
        this.f22328c = method;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c2  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35693b(p164h.p165b.p166a.p240h.p241p.C11232f<p164h.p165b.p166a.p240h.p248s.C11328h> r6, java.lang.Object r7) {
        /*
            r5 = this;
            java.lang.reflect.Method r0 = r5.f22328c
            java.lang.Object[] r0 = r5.mo35716f(r6, r0)
            h.b.a.h.s.a r1 = r6.mo35700a()
            boolean r1 = r1.mo35861i()
            if (r1 != 0) goto L_0x002e
            java.util.logging.Logger r6 = f22327d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Calling local service method with no output arguments: "
            r1.append(r2)
            java.lang.reflect.Method r2 = r5.f22328c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r6.fine(r1)
            java.lang.reflect.Method r6 = r5.f22328c
            p164h.p257c.p259b.C11499d.m30193k(r6, r7, r0)
            return
        L_0x002e:
            java.lang.reflect.Method r1 = r5.f22328c
            java.lang.Class r1 = r1.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            boolean r1 = r1.equals(r2)
            java.util.logging.Logger r2 = f22327d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Calling local service method with output arguments: "
            r3.append(r4)
            java.lang.reflect.Method r4 = r5.f22328c
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.fine(r3)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x006c
            java.util.logging.Logger r1 = f22327d
            java.lang.String r4 = "Action method is void, calling declared accessors(s) on service instance to retrieve ouput argument(s)"
            r1.fine(r4)
            java.lang.reflect.Method r1 = r5.f22328c
            p164h.p257c.p259b.C11499d.m30193k(r1, r7, r0)
        L_0x0062:
            h.b.a.h.s.a r0 = r6.mo35700a()
            java.lang.Object r7 = r5.mo35695d(r0, r7)
            r0 = 1
            goto L_0x008e
        L_0x006c:
            boolean r1 = r5.mo35717g(r6)
            if (r1 == 0) goto L_0x0080
            java.util.logging.Logger r1 = f22327d
            java.lang.String r4 = "Action method is not void, calling declared accessor(s) on returned instance to retrieve ouput argument(s)"
            r1.fine(r4)
            java.lang.reflect.Method r1 = r5.f22328c
            java.lang.Object r7 = p164h.p257c.p259b.C11499d.m30193k(r1, r7, r0)
            goto L_0x0062
        L_0x0080:
            java.util.logging.Logger r1 = f22327d
            java.lang.String r4 = "Action method is not void, using returned value as (single) output argument"
            r1.fine(r4)
            java.lang.reflect.Method r1 = r5.f22328c
            java.lang.Object r7 = p164h.p257c.p259b.C11499d.m30193k(r1, r7, r0)
            r0 = 0
        L_0x008e:
            h.b.a.h.s.a r1 = r6.mo35700a()
            h.b.a.h.s.b[] r1 = r1.mo35858f()
            if (r0 == 0) goto L_0x00c2
            boolean r0 = r7 instanceof java.lang.Object[]
            if (r0 == 0) goto L_0x00c2
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            java.util.logging.Logger r0 = f22327d
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
            r5.mo35696e(r6, r0, r3)
            int r2 = r2 + 1
            goto L_0x00b5
        L_0x00c2:
            int r0 = r1.length
            if (r0 != r3) goto L_0x00cb
            r0 = r1[r2]
            r5.mo35696e(r6, r0, r7)
        L_0x00ca:
            return
        L_0x00cb:
            h.b.a.h.p.d r6 = new h.b.a.h.p.d
            h.b.a.h.w.n r7 = p164h.p165b.p166a.p240h.p252w.C11386n.ACTION_FAILED
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Method return does not match required number of output arguments: "
            r0.append(r2)
            int r1 = r1.length
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>((p164h.p165b.p166a.p240h.p252w.C11386n) r7, (java.lang.String) r0)
            goto L_0x00e6
        L_0x00e5:
            throw r6
        L_0x00e6:
            goto L_0x00e5
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p165b.p166a.p240h.p241p.C11233g.mo35693b(h.b.a.h.p.f, java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Object[] mo35716f(C11232f<C11328h> fVar, Method method) {
        C11232f<C11328h> fVar2 = fVar;
        Method method2 = method;
        C11328h g = fVar.mo35700a().mo35859g();
        ArrayList arrayList = new ArrayList();
        C11321b[] c = fVar.mo35700a().mo35855c();
        int length = c.length;
        char c2 = 0;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            C11321b bVar = c[i];
            Class cls = method.getParameterTypes()[i2];
            C11228b<C11328h> e = fVar2.mo35704e(bVar);
            if (!cls.isPrimitive() || !(e == null || e.toString().length() == 0)) {
                if (e == null) {
                    arrayList.add(i2, (Object) null);
                    i2++;
                } else {
                    String nVar = e.toString();
                    if (nVar.length() <= 0 || !g.mo35952s(cls) || cls.isEnum()) {
                        arrayList.add(i2, e.mo35689b());
                        i2++;
                    } else {
                        try {
                            Class[] clsArr = new Class[1];
                            clsArr[c2] = String.class;
                            Constructor constructor = cls.getConstructor(clsArr);
                            Logger logger = f22327d;
                            logger.finer("Creating new input argument value instance with String.class constructor of type: " + cls);
                            Object[] objArr = {nVar};
                            int i3 = i2 + 1;
                            arrayList.add(i2, constructor.newInstance(objArr));
                            i2 = i3;
                        } catch (Exception e2) {
                            Logger logger2 = f22327d;
                            logger2.warning("Error preparing action method call: " + method2);
                            Logger logger3 = f22327d;
                            logger3.warning("Can't convert input argument string to desired type of '" + bVar.mo35869e() + "': " + e2);
                            C11386n nVar2 = C11386n.ARGUMENT_VALUE_INVALID;
                            throw new C11230d(nVar2, "Can't convert input argument string to desired type of '" + bVar.mo35869e() + "': " + e2);
                        }
                    }
                }
                i++;
                c2 = 0;
            } else {
                C11386n nVar3 = C11386n.ARGUMENT_VALUE_INVALID;
                throw new C11230d(nVar3, "Primitive action method argument '" + bVar.mo35869e() + "' requires input value, can't be null or empty string");
            }
        }
        if (method.getParameterTypes().length > 0 && C11343c.class.isAssignableFrom(method.getParameterTypes()[method.getParameterTypes().length - 1])) {
            if (fVar2 instanceof C11235i) {
                C11235i iVar = (C11235i) fVar2;
                if (iVar.mo35719p() != null) {
                    Logger logger4 = f22327d;
                    logger4.finer("Providing remote client info as last action method input argument: " + method2);
                    arrayList.add(i2, iVar.mo35719p());
                }
            }
            arrayList.add(i2, (Object) null);
        }
        return arrayList.toArray(new Object[arrayList.size()]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo35717g(C11232f<C11328h> fVar) {
        for (C11321b bVar : fVar.mo35700a().mo35858f()) {
            if (mo35694c().get(bVar) != null) {
                return true;
            }
        }
        return false;
    }
}
