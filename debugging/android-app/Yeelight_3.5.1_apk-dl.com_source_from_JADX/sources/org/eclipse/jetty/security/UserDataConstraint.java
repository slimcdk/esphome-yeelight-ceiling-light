package org.eclipse.jetty.security;

public enum UserDataConstraint {
    None,
    Integral,
    Confidential;

    public static UserDataConstraint get(int i) {
        if (i >= -1 && i <= 2) {
            return i == -1 ? None : values()[i];
        }
        throw new IllegalArgumentException("Expected -1, 0, 1, or 2, not: " + i);
    }

    public UserDataConstraint combine(UserDataConstraint userDataConstraint) {
        return compareTo(userDataConstraint) < 0 ? this : userDataConstraint;
    }
}
