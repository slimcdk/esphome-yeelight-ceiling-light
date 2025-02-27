package org.apache.commons.p271io.input;

import java.io.InputStream;

/* renamed from: org.apache.commons.io.input.DemuxInputStream */
public class DemuxInputStream extends InputStream {
    private final InheritableThreadLocal<InputStream> m_streams = new InheritableThreadLocal<>();

    public InputStream bindStream(InputStream inputStream) {
        InputStream inputStream2 = (InputStream) this.m_streams.get();
        this.m_streams.set(inputStream);
        return inputStream2;
    }

    public void close() {
        InputStream inputStream = (InputStream) this.m_streams.get();
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public int read() {
        InputStream inputStream = (InputStream) this.m_streams.get();
        if (inputStream != null) {
            return inputStream.read();
        }
        return -1;
    }
}
