package com.squareup.haha.guava.base;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public final class Joiner$MapJoiner {
    private final Ascii joiner$5f22bbb7;
    private final String keyValueSeparator;

    private Joiner$MapJoiner(Ascii ascii, String str) {
        this.joiner$5f22bbb7 = ascii;
        this.keyValueSeparator = (String) Ascii.checkNotNull(str);
    }

    /* synthetic */ Joiner$MapJoiner(Ascii ascii, String str, byte b) {
        this(ascii, str);
    }

    public final StringBuilder appendTo(StringBuilder sb, Iterator<? extends Map.Entry<?, ?>> it) {
        try {
            Ascii.checkNotNull(sb);
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                sb.append(this.joiner$5f22bbb7.toString(entry.getKey()));
                sb.append(this.keyValueSeparator);
                CharSequence ascii = this.joiner$5f22bbb7.toString(entry.getValue());
                while (true) {
                    sb.append(ascii);
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append(this.joiner$5f22bbb7.separator);
                    Map.Entry entry2 = (Map.Entry) it.next();
                    sb.append(this.joiner$5f22bbb7.toString(entry2.getKey()));
                    sb.append(this.keyValueSeparator);
                    ascii = this.joiner$5f22bbb7.toString(entry2.getValue());
                }
            }
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
