package com.squareup.leakcanary;

import com.squareup.haha.perflib.Instance;
import com.squareup.leakcanary.LeakTraceElement;

final class LeakNode {
    final Exclusion exclusion;
    final Instance instance;
    final LeakNode parent;
    final String referenceName;
    final LeakTraceElement.Type referenceType;

    LeakNode(Exclusion exclusion2, Instance instance2, LeakNode leakNode, String str, LeakTraceElement.Type type) {
        this.exclusion = exclusion2;
        this.instance = instance2;
        this.parent = leakNode;
        this.referenceName = str;
        this.referenceType = type;
    }
}
