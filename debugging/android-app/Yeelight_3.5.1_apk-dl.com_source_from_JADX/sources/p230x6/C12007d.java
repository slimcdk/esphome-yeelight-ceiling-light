package p230x6;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.C10010b;
import org.fourthline.cling.model.message.C10030d;
import org.fourthline.cling.model.message.C10031e;
import org.fourthline.cling.model.message.C10032f;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.meta.C10068c;
import org.fourthline.cling.model.meta.C10070e;
import org.fourthline.cling.model.meta.RemoteService;
import org.fourthline.cling.model.types.C10098s;
import org.fourthline.cling.model.types.C10105z;
import org.fourthline.cling.transport.RouterException;
import p214t6.C10407g;
import p214t6.C10408h;
import p214t6.C10409i;

/* renamed from: x6.d */
public class C12007d implements Runnable {

    /* renamed from: d */
    private static final Logger f21984d = Logger.getLogger(C12007d.class.getName());

    /* renamed from: e */
    private static final Set<URL> f21985e = new CopyOnWriteArraySet();

    /* renamed from: a */
    private final C10010b f21986a;

    /* renamed from: b */
    private C10407g f21987b;

    /* renamed from: c */
    protected List<C10105z> f21988c = new ArrayList();

    public C12007d(C10010b bVar, C10407g gVar) {
        this.f21986a = bVar;
        this.f21987b = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo42609b() {
        if (mo42614g().getRouter() == null) {
            f21984d.warning("Router not yet initialized");
            return;
        }
        try {
            C10030d dVar = new C10030d(UpnpRequest.Method.GET, ((C10408h) this.f21987b.mo40506p()).mo42097d());
            C10032f descriptorRetrievalHeaders = mo42614g().getConfiguration().getDescriptorRetrievalHeaders((C10408h) this.f21987b.mo40506p());
            if (descriptorRetrievalHeaders != null) {
                dVar.mo40403j().putAll(descriptorRetrievalHeaders);
            }
            Logger logger = f21984d;
            logger.fine("Sending device descriptor retrieval message: " + dVar);
            C10031e d = mo42614g().getRouter().mo24969d(dVar);
            if (d == null) {
                logger.warning("Device descriptor retrieval failed, no response: " + ((C10408h) this.f21987b.mo40506p()).mo42097d());
            } else if (((UpnpResponse) d.mo40404k()).mo40424f()) {
                logger.warning("Device descriptor retrieval failed: " + ((C10408h) this.f21987b.mo40506p()).mo42097d() + ", " + ((UpnpResponse) d.mo40404k()).mo40421c());
            } else {
                if (!d.mo40410q()) {
                    logger.fine("Received device descriptor without or with invalid Content-Type: " + ((C10408h) this.f21987b.mo40506p()).mo42097d());
                }
                String c = d.mo40397c();
                if (c == null || c.length() == 0) {
                    logger.warning("Received empty device descriptor:" + ((C10408h) this.f21987b.mo40506p()).mo42097d());
                    return;
                }
                logger.fine("Received root device descriptor: " + d);
                mo42610c(c);
            }
        } catch (IllegalArgumentException e) {
            Logger logger2 = f21984d;
            logger2.warning("Device descriptor retrieval failed: " + ((C10408h) this.f21987b.mo40506p()).mo42097d() + ", possibly invalid URL: " + e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: org.fourthline.cling.registry.RegistrationException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: org.fourthline.cling.registry.RegistrationException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: org.fourthline.cling.registry.RegistrationException} */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.lang.Exception] */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo42610c(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Cause was: "
            r1 = 0
            r2 = 0
            org.fourthline.cling.b r3 = r7.mo42614g()     // Catch:{ ValidationException -> 0x0156, DescriptorBindingException -> 0x011f, RegistrationException -> 0x00dc }
            org.fourthline.cling.c r3 = r3.getConfiguration()     // Catch:{ ValidationException -> 0x0156, DescriptorBindingException -> 0x011f, RegistrationException -> 0x00dc }
            m6.a r3 = r3.getDeviceDescriptorBinderUDA10()     // Catch:{ ValidationException -> 0x0156, DescriptorBindingException -> 0x011f, RegistrationException -> 0x00dc }
            t6.g r4 = r7.f21987b     // Catch:{ ValidationException -> 0x0156, DescriptorBindingException -> 0x011f, RegistrationException -> 0x00dc }
            org.fourthline.cling.model.meta.b r8 = r3.mo38534a(r4, r8)     // Catch:{ ValidationException -> 0x0156, DescriptorBindingException -> 0x011f, RegistrationException -> 0x00dc }
            t6.g r8 = (p214t6.C10407g) r8     // Catch:{ ValidationException -> 0x0156, DescriptorBindingException -> 0x011f, RegistrationException -> 0x00dc }
            java.util.logging.Logger r2 = f21984d     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            r3.<init>()     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            java.lang.String r4 = "Remote device described (without services) notifying listeners: "
            r3.append(r4)     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            r3.append(r8)     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            java.lang.String r3 = r3.toString()     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            r2.fine(r3)     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            org.fourthline.cling.b r3 = r7.mo42614g()     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            a7.b r3 = r3.getRegistry()     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            boolean r1 = r3.mo24959v(r8)     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            r3.<init>()     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            java.lang.String r4 = "Hydrating described device's services: "
            r3.append(r4)     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            r3.append(r8)     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            java.lang.String r3 = r3.toString()     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            r2.fine(r3)     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            t6.g r3 = r7.mo42612e(r8)     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            if (r3 != 0) goto L_0x00b3
            java.util.List<org.fourthline.cling.model.types.z> r3 = r7.f21988c     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            t6.g r4 = r7.f21987b     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            t6.b r4 = r4.mo40506p()     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            t6.h r4 = (p214t6.C10408h) r4     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            org.fourthline.cling.model.types.z r4 = r4.mo42058b()     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            boolean r3 = r3.contains(r4)     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            java.lang.String r4 = "Device service description failed: "
            if (r3 != 0) goto L_0x008f
            java.util.List<org.fourthline.cling.model.types.z> r3 = r7.f21988c     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            t6.g r5 = r7.f21987b     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            t6.b r5 = r5.mo40506p()     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            t6.h r5 = (p214t6.C10408h) r5     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            org.fourthline.cling.model.types.z r5 = r5.mo42058b()     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            r3.add(r5)     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            r3.<init>()     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            r3.append(r4)     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            t6.g r5 = r7.f21987b     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            r3.append(r5)     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            java.lang.String r3 = r3.toString()     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            r2.warning(r3)     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
        L_0x008f:
            if (r1 == 0) goto L_0x00b2
            org.fourthline.cling.b r2 = r7.mo42614g()     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            a7.b r2 = r2.getRegistry()     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            org.fourthline.cling.binding.xml.DescriptorBindingException r3 = new org.fourthline.cling.binding.xml.DescriptorBindingException     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            r5.<init>()     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            r5.append(r4)     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            t6.g r4 = r7.f21987b     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            r5.append(r4)     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            java.lang.String r4 = r5.toString()     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            r3.<init>(r4)     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            r2.mo24938c(r8, r3)     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
        L_0x00b2:
            return
        L_0x00b3:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            r4.<init>()     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            java.lang.String r5 = "Adding fully hydrated remote device to registry: "
            r4.append(r5)     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            r4.append(r3)     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            java.lang.String r4 = r4.toString()     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            r2.fine(r4)     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            org.fourthline.cling.b r2 = r7.mo42614g()     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            a7.b r2 = r2.getRegistry()     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            r2.mo24961x(r3)     // Catch:{ ValidationException -> 0x00d8, DescriptorBindingException -> 0x00d6, RegistrationException -> 0x00d4 }
            goto L_0x01c1
        L_0x00d4:
            r2 = move-exception
            goto L_0x00e0
        L_0x00d6:
            r2 = move-exception
            goto L_0x0123
        L_0x00d8:
            r0 = move-exception
            r2 = r8
            goto L_0x0157
        L_0x00dc:
            r8 = move-exception
            r6 = r2
            r2 = r8
            r8 = r6
        L_0x00e0:
            java.util.logging.Logger r3 = f21984d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Adding hydrated device to registry failed: "
            r4.append(r5)
            t6.g r5 = r7.f21987b
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.warning(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = r2.toString()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.warning(r0)
            if (r8 == 0) goto L_0x01c1
            if (r1 == 0) goto L_0x01c1
        L_0x0112:
            org.fourthline.cling.b r0 = r7.mo42614g()
            a7.b r0 = r0.getRegistry()
            r0.mo24938c(r8, r2)
            goto L_0x01c1
        L_0x011f:
            r8 = move-exception
            r6 = r2
            r2 = r8
            r8 = r6
        L_0x0123:
            java.util.logging.Logger r3 = f21984d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Could not hydrate device or its services from descriptor: "
            r4.append(r5)
            t6.g r5 = r7.f21987b
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.warning(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.Throwable r0 = org.seamless.util.C10243a.m25753a(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.warning(r0)
            if (r8 == 0) goto L_0x01c1
            if (r1 == 0) goto L_0x01c1
            goto L_0x0112
        L_0x0156:
            r0 = move-exception
        L_0x0157:
            java.util.List<org.fourthline.cling.model.types.z> r8 = r7.f21988c
            t6.g r3 = r7.f21987b
            t6.b r3 = r3.mo40506p()
            t6.h r3 = (p214t6.C10408h) r3
            org.fourthline.cling.model.types.z r3 = r3.mo42058b()
            boolean r8 = r8.contains(r3)
            if (r8 != 0) goto L_0x01c1
            java.util.List<org.fourthline.cling.model.types.z> r8 = r7.f21988c
            t6.g r3 = r7.f21987b
            t6.b r3 = r3.mo40506p()
            t6.h r3 = (p214t6.C10408h) r3
            org.fourthline.cling.model.types.z r3 = r3.mo42058b()
            r8.add(r3)
            java.util.logging.Logger r8 = f21984d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Could not validate device model: "
            r3.append(r4)
            t6.g r4 = r7.f21987b
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r8.warning(r3)
            java.util.List r8 = r0.getErrors()
            java.util.Iterator r8 = r8.iterator()
        L_0x019c:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x01b2
            java.lang.Object r3 = r8.next()
            org.fourthline.cling.model.k r3 = (org.fourthline.cling.model.C10023k) r3
            java.util.logging.Logger r4 = f21984d
            java.lang.String r3 = r3.toString()
            r4.warning(r3)
            goto L_0x019c
        L_0x01b2:
            if (r2 == 0) goto L_0x01c1
            if (r1 == 0) goto L_0x01c1
            org.fourthline.cling.b r8 = r7.mo42614g()
            a7.b r8 = r8.getRegistry()
            r8.mo24938c(r2, r0)
        L_0x01c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p230x6.C12007d.mo42610c(java.lang.String):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C10409i mo42611d(C10409i iVar) {
        try {
            URL N = ((C10407g) iVar.mo40531d()).mo42094N(iVar.mo42101o());
            C10030d dVar = new C10030d(UpnpRequest.Method.GET, N);
            C10032f descriptorRetrievalHeaders = mo42614g().getConfiguration().getDescriptorRetrievalHeaders((C10408h) ((C10407g) iVar.mo40531d()).mo40506p());
            if (descriptorRetrievalHeaders != null) {
                dVar.mo40403j().putAll(descriptorRetrievalHeaders);
            }
            Logger logger = f21984d;
            logger.fine("Sending service descriptor retrieval message: " + dVar);
            C10031e d = mo42614g().getRouter().mo24969d(dVar);
            if (d == null) {
                logger.warning("Could not retrieve service descriptor, no response: " + iVar);
                return null;
            } else if (((UpnpResponse) d.mo40404k()).mo40424f()) {
                logger.warning("Service descriptor retrieval failed: " + N + ", " + ((UpnpResponse) d.mo40404k()).mo40421c());
                return null;
            } else {
                if (!d.mo40410q()) {
                    logger.fine("Received service descriptor without or with invalid Content-Type: " + N);
                }
                String c = d.mo40397c();
                if (c == null || c.length() == 0) {
                    logger.warning("Received empty service descriptor:" + N);
                    return null;
                }
                logger.fine("Received service descriptor, hydrating service model: " + d);
                return (C10409i) mo42614g().getConfiguration().getServiceDescriptorBinderUDA10().mo38540a(iVar, c);
            }
        } catch (IllegalArgumentException unused) {
            Logger logger2 = f21984d;
            logger2.warning("Could not normalize service descriptor URL: " + iVar.mo42101o());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C10407g mo42612e(C10407g gVar) {
        C10407g e;
        ArrayList arrayList = new ArrayList();
        if (gVar.mo40515x()) {
            for (C10409i next : mo42613f(gVar.mo40509s())) {
                C10409i d = mo42611d(next);
                if (d != null) {
                    arrayList.add(d);
                } else {
                    f21984d.warning("Skipping invalid service '" + next + "' of: " + gVar);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (gVar.mo40513v()) {
            for (C10407g gVar2 : gVar.mo40504n()) {
                if (!(gVar2 == null || (e = mo42612e(gVar2)) == null)) {
                    arrayList2.add(e);
                }
            }
        }
        C10068c[] cVarArr = new C10068c[gVar.mo40505o().length];
        for (int i = 0; i < gVar.mo40505o().length; i++) {
            cVarArr[i] = gVar.mo40505o()[i].mo40517a();
        }
        return gVar.mo40483A(((C10408h) gVar.mo40506p()).mo42058b(), gVar.mo40512u(), gVar.mo40510t(), gVar.mo40502l(), cVarArr, gVar.mo42096P(arrayList), arrayList2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public List<C10409i> mo42613f(RemoteService[] remoteServiceArr) {
        C10098s[] exclusiveServiceTypes = mo42614g().getConfiguration().getExclusiveServiceTypes();
        if (exclusiveServiceTypes == null || exclusiveServiceTypes.length == 0) {
            return Arrays.asList(remoteServiceArr);
        }
        ArrayList arrayList = new ArrayList();
        for (C10070e eVar : remoteServiceArr) {
            for (C10098s sVar : exclusiveServiceTypes) {
                if (eVar.mo40534g().mo40646d(sVar)) {
                    f21984d.fine("Including exclusive service: " + eVar);
                    arrayList.add(eVar);
                } else {
                    f21984d.fine("Excluding unwanted service: " + sVar);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public C10010b mo42614g() {
        return this.f21986a;
    }

    public void run() {
        Logger logger;
        StringBuilder sb;
        String str;
        URL d = ((C10408h) this.f21987b.mo40506p()).mo42097d();
        Set<URL> set = f21985e;
        if (set.contains(d)) {
            logger = f21984d;
            sb = new StringBuilder();
            str = "Exiting early, active retrieval for URL already in progress: ";
        } else if (mo42614g().getRegistry().mo24954r(((C10408h) this.f21987b.mo40506p()).mo42058b(), true) != null) {
            logger = f21984d;
            sb = new StringBuilder();
            str = "Exiting early, already discovered: ";
        } else {
            try {
                set.add(d);
                mo42609b();
            } catch (RouterException e) {
                Logger logger2 = f21984d;
                Level level = Level.WARNING;
                logger2.log(level, "Descriptor retrieval failed: " + d, e);
                set = f21985e;
            } catch (Throwable th) {
                f21985e.remove(d);
                throw th;
            }
            set.remove(d);
            return;
        }
        sb.append(str);
        sb.append(d);
        logger.finer(sb.toString());
    }
}
