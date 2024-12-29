package org.eclipse.jetty.security.authentication;

import java.io.ObjectInputStream;
import java.io.Serializable;
import javax.servlet.http.C9281e;
import javax.servlet.http.C9282f;
import javax.servlet.http.C9284h;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import p152e6.C9001b;
import p152e6.C9003c;
import p234y5.C12080g;
import p234y5.C12084k;
import p239z5.C12159d;
import p239z5.C12193w;

public class SessionAuthentication implements C12159d.C12167h, Serializable, C9282f, C9284h {
    private static final C9003c LOG = C9001b.m21450a(SessionAuthentication.class);
    public static final String __J_AUTHENTICATED = "org.eclipse.jetty.security.UserIdentity";
    private static final long serialVersionUID = -4643200685888258706L;
    private final Object _credentials;
    private final String _method;
    private final String _name;
    private transient C9281e _session;
    private transient C12193w _userIdentity;

    public SessionAuthentication(String str, C12193w wVar, Object obj) {
        this._method = str;
        this._userIdentity = wVar;
        this._name = wVar.mo43187b().getName();
        this._credentials = obj;
    }

    private void doLogout() {
        C12084k Z0 = C12084k.m31190Z0();
        if (Z0 != null) {
            Z0.mo42785c1(this);
        }
        C9281e eVar = this._session;
        if (eVar != null) {
            eVar.mo26628d("org.eclipse.jetty.security.sessionKnownOnlytoAuthenticated");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        C12084k Z0 = C12084k.m31190Z0();
        if (Z0 != null) {
            C12080g F = Z0.mo42738F();
            if (F != null) {
                this._userIdentity = F.mo42762b(this._name, this._credentials);
                LOG.mo36850e("Deserialized and relogged in {}", this);
                return;
            }
            throw new IllegalStateException("!LoginService");
        }
        throw new IllegalStateException("!SecurityHandler");
    }

    public String getAuthMethod() {
        return this._method;
    }

    public C12193w getUserIdentity() {
        return this._userIdentity;
    }

    public boolean isUserInRole(C12193w.C12194a aVar, String str) {
        return this._userIdentity.mo43186a(str, aVar);
    }

    public void logout() {
        C9281e eVar = this._session;
        if (!(eVar == null || eVar.mo26625a(__J_AUTHENTICATED) == null)) {
            this._session.mo26628d(__J_AUTHENTICATED);
        }
        doLogout();
    }

    public void sessionDidActivate(HttpSessionEvent httpSessionEvent) {
        if (this._session == null) {
            this._session = httpSessionEvent.getSession();
        }
    }

    public void sessionWillPassivate(HttpSessionEvent httpSessionEvent) {
    }

    public String toString() {
        return "Session" + super.toString();
    }

    public void valueBound(HttpSessionBindingEvent httpSessionBindingEvent) {
        if (this._session == null) {
            this._session = httpSessionBindingEvent.getSession();
        }
    }

    public void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent) {
        doLogout();
    }
}
