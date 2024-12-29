package com.squareup.leakcanary;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.p194io.IOUtils;

public final class LeakTrace implements Serializable {
    public final List<LeakTraceElement> elements;

    LeakTrace(List<LeakTraceElement> list) {
        this.elements = Collections.unmodifiableList(new ArrayList(list));
    }

    public String toDetailedString() {
        String str = "";
        for (LeakTraceElement detailedString : this.elements) {
            str = str + detailedString.toDetailedString();
        }
        return str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < this.elements.size()) {
            LeakTraceElement leakTraceElement = this.elements.get(i);
            sb.append("* ");
            sb.append(i == 0 ? "GC ROOT " : i == this.elements.size() + -1 ? "leaks " : "references ");
            sb.append(leakTraceElement);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            i++;
        }
        return sb.toString();
    }
}
