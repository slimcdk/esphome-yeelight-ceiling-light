package org.eclipse.jetty.security;

import java.io.Serializable;

public class MappedLoginService$Anonymous implements MappedLoginService$UserPrincipal, Serializable {
    private static final long serialVersionUID = 1097640442553284845L;

    public boolean authenticate(Object obj) {
        return false;
    }

    public String getName() {
        return "Anonymous";
    }

    public boolean isAuthenticated() {
        return false;
    }
}
