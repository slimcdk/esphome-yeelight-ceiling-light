package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;
import p110w0.C3870d;

public class DependencyCycleException extends DependencyException {
    private final List<C3870d<?>> componentsInCycle;

    public DependencyCycleException(List<C3870d<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.componentsInCycle = list;
    }

    public List<C3870d<?>> getComponentsInCycle() {
        return this.componentsInCycle;
    }
}
