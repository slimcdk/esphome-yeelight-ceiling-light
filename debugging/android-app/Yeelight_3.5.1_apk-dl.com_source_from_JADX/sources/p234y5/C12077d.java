package p234y5;

import org.eclipse.jetty.security.authentication.C9929a;
import org.eclipse.jetty.security.authentication.C9930b;
import org.eclipse.jetty.security.authentication.C9934d;
import org.eclipse.jetty.security.authentication.C9939f;
import org.eclipse.jetty.security.authentication.DigestAuthenticator;
import org.eclipse.jetty.util.security.Constraint;
import p208s4.C10359k;
import p234y5.C12072a;
import p239z5.C12187r;

/* renamed from: y5.d */
public class C12077d implements C12072a.C12074b {
    /* renamed from: a */
    public C12072a mo42743a(C12187r rVar, C10359k kVar, C12072a.C12073a aVar, C12079f fVar, C12080g gVar) {
        String authMethod = aVar.getAuthMethod();
        return (Constraint.__CERT_AUTH.equalsIgnoreCase(authMethod) || Constraint.__CERT_AUTH2.equalsIgnoreCase(authMethod)) ? new C9930b() : (authMethod == null || Constraint.__BASIC_AUTH.equalsIgnoreCase(authMethod)) ? new C9929a() : Constraint.__DIGEST_AUTH.equalsIgnoreCase(authMethod) ? new DigestAuthenticator() : Constraint.__FORM_AUTH.equalsIgnoreCase(authMethod) ? new C9934d() : Constraint.__SPNEGO_AUTH.equalsIgnoreCase(authMethod) ? new C9939f() : Constraint.__NEGOTIATE_AUTH.equalsIgnoreCase(authMethod) ? new C9939f(Constraint.__NEGOTIATE_AUTH) : null;
    }
}
