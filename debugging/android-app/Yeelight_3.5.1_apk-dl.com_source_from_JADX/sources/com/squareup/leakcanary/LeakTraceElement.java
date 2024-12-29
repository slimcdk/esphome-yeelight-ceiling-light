package com.squareup.leakcanary;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.apache.commons.p194io.IOUtils;

public final class LeakTraceElement implements Serializable {
    public final String className;
    public final Exclusion exclusion;
    public final String extra;
    public final List<String> fields;
    public final Holder holder;
    public final String referenceName;
    public final Type type;

    public enum Holder {
        OBJECT,
        CLASS,
        THREAD,
        ARRAY
    }

    public enum Type {
        INSTANCE_FIELD,
        STATIC_FIELD,
        LOCAL,
        ARRAY_ENTRY
    }

    LeakTraceElement(String str, Type type2, Holder holder2, String str2, String str3, Exclusion exclusion2, List<String> list) {
        this.referenceName = str;
        this.type = type2;
        this.holder = holder2;
        this.className = str2;
        this.extra = str3;
        this.exclusion = exclusion2;
        this.fields = Collections.unmodifiableList(new ArrayList(list));
    }

    public String toDetailedString() {
        StringBuilder sb;
        String str;
        Holder holder2 = this.holder;
        if (holder2 == Holder.ARRAY) {
            sb = new StringBuilder();
            sb.append("* ");
            str = "Array of";
        } else if (holder2 == Holder.CLASS) {
            sb = new StringBuilder();
            sb.append("* ");
            str = "Class";
        } else {
            sb = new StringBuilder();
            sb.append("* ");
            str = "Instance of";
        }
        sb.append(str);
        String str2 = sb.toString() + " " + this.className + IOUtils.LINE_SEPARATOR_UNIX;
        for (String str3 : this.fields) {
            str2 = str2 + "|   " + str3 + IOUtils.LINE_SEPARATOR_UNIX;
        }
        return str2;
    }

    public String toString() {
        StringBuilder sb;
        String str;
        String str2 = "";
        if (this.type == Type.STATIC_FIELD) {
            str2 = str2 + "static ";
        }
        Holder holder2 = this.holder;
        if (holder2 == Holder.ARRAY || holder2 == Holder.THREAD) {
            str2 = str2 + this.holder.name().toLowerCase(Locale.US) + " ";
        }
        String str3 = str2 + this.className;
        if (this.referenceName != null) {
            sb = new StringBuilder();
            sb.append(str3);
            sb.append(".");
            str = this.referenceName;
        } else {
            sb = new StringBuilder();
            sb.append(str3);
            str = " instance";
        }
        sb.append(str);
        String sb2 = sb.toString();
        if (this.extra != null) {
            sb2 = sb2 + " " + this.extra;
        }
        if (this.exclusion == null) {
            return sb2;
        }
        return sb2 + " , matching exclusion " + this.exclusion.matching;
    }
}
