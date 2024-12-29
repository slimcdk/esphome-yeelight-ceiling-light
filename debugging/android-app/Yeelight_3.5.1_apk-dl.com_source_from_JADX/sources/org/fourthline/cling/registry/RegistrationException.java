package org.fourthline.cling.registry;

import java.util.List;
import org.fourthline.cling.model.C10023k;

public class RegistrationException extends RuntimeException {
    public List<C10023k> errors;

    public RegistrationException(String str) {
        super(str);
    }

    public RegistrationException(String str, Throwable th) {
        super(str, th);
    }

    public RegistrationException(String str, List<C10023k> list) {
        super(str);
        this.errors = list;
    }

    public List<C10023k> getErrors() {
        return this.errors;
    }
}
