package org.fourthline.cling.model;

import java.util.List;

public class ValidationException extends Exception {
    public List<C10023k> errors;

    public ValidationException(String str) {
        super(str);
    }

    public ValidationException(String str, Throwable th) {
        super(str, th);
    }

    public ValidationException(String str, List<C10023k> list) {
        super(str);
        this.errors = list;
    }

    public List<C10023k> getErrors() {
        return this.errors;
    }
}
