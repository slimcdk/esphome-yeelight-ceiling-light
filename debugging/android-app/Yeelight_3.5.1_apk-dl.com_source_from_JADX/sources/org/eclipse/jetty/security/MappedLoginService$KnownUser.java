package org.eclipse.jetty.security;

import java.io.Serializable;
import org.eclipse.jetty.util.security.Credential;

public class MappedLoginService$KnownUser implements MappedLoginService$UserPrincipal, Serializable {
    private static final long serialVersionUID = -6226920753748399662L;
    private final Credential _credential;
    private final String _name;

    public MappedLoginService$KnownUser(String str, Credential credential) {
        this._name = str;
        this._credential = credential;
    }

    public boolean authenticate(Object obj) {
        Credential credential = this._credential;
        return credential != null && credential.check(obj);
    }

    public String getName() {
        return this._name;
    }

    public boolean isAuthenticated() {
        return true;
    }

    public String toString() {
        return this._name;
    }
}
