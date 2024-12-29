package org.eclipse.jetty.security;

import java.io.Serializable;
import java.security.Principal;

public class MappedLoginService$RolePrincipal implements Principal, Serializable {
    private static final long serialVersionUID = 2998397924051854402L;
    private final String _roleName;

    public MappedLoginService$RolePrincipal(String str) {
        this._roleName = str;
    }

    public String getName() {
        return this._roleName;
    }
}
