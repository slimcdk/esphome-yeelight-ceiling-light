package com.squareup.haha.guava.base;

import javax.annotation.Nullable;

public final class Objects$ToStringHelper {
    private final String className;
    private ValueHolder holderHead;
    private ValueHolder holderTail;
    private boolean omitNullValues;

    static final class ValueHolder {
        String name;
        ValueHolder next;
        Object value;

        private ValueHolder() {
        }

        /* synthetic */ ValueHolder(byte b) {
            this();
        }
    }

    private Objects$ToStringHelper(String str) {
        ValueHolder valueHolder = new ValueHolder((byte) 0);
        this.holderHead = valueHolder;
        this.holderTail = valueHolder;
        this.omitNullValues = false;
        this.className = (String) Ascii.checkNotNull(str);
    }

    public /* synthetic */ Objects$ToStringHelper(String str, byte b) {
        this(str);
    }

    private ValueHolder addHolder() {
        ValueHolder valueHolder = new ValueHolder((byte) 0);
        this.holderTail.next = valueHolder;
        this.holderTail = valueHolder;
        return valueHolder;
    }

    public final Objects$ToStringHelper add(String str, int i) {
        return addHolder(str, String.valueOf(i));
    }

    public Objects$ToStringHelper addHolder(String str, @Nullable Object obj) {
        ValueHolder addHolder = addHolder();
        addHolder.value = obj;
        addHolder.name = (String) Ascii.checkNotNull(str);
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.className);
        sb.append('{');
        ValueHolder valueHolder = this.holderHead.next;
        String str = "";
        while (valueHolder != null) {
            sb.append(str);
            String str2 = valueHolder.name;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            sb.append(valueHolder.value);
            valueHolder = valueHolder.next;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
