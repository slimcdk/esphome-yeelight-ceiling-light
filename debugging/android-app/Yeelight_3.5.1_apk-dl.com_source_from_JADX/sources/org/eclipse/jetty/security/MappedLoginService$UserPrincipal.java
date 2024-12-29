package org.eclipse.jetty.security;

import java.io.Serializable;
import java.security.Principal;

public interface MappedLoginService$UserPrincipal extends Principal, Serializable {
    boolean authenticate(Object obj);

    boolean isAuthenticated();
}
