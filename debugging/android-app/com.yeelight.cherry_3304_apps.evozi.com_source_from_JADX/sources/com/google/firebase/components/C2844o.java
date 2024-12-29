package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.firebase.components.o */
public class C2844o extends C2845p {
    public C2844o(List<C2825d<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
    }
}
