package org.apache.commons.p194io.output;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/* renamed from: org.apache.commons.io.output.WriterOutputStream */
public class WriterOutputStream extends OutputStream {
    private static final int DEFAULT_BUFFER_SIZE = 1024;
    private final CharsetDecoder decoder;
    private final ByteBuffer decoderIn;
    private final CharBuffer decoderOut;
    private final boolean writeImmediately;
    private final Writer writer;

    public WriterOutputStream(Writer writer2) {
        this(writer2, Charset.defaultCharset(), 1024, false);
    }

    public WriterOutputStream(Writer writer2, String str) {
        this(writer2, str, 1024, false);
    }

    public WriterOutputStream(Writer writer2, String str, int i, boolean z) {
        this(writer2, Charset.forName(str), i, z);
    }

    public WriterOutputStream(Writer writer2, Charset charset) {
        this(writer2, charset, 1024, false);
    }

    public WriterOutputStream(Writer writer2, Charset charset, int i, boolean z) {
        this(writer2, charset.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).replaceWith("?"), i, z);
    }

    public WriterOutputStream(Writer writer2, CharsetDecoder charsetDecoder) {
        this(writer2, charsetDecoder, 1024, false);
    }

    public WriterOutputStream(Writer writer2, CharsetDecoder charsetDecoder, int i, boolean z) {
        this.decoderIn = ByteBuffer.allocate(128);
        this.writer = writer2;
        this.decoder = charsetDecoder;
        this.writeImmediately = z;
        this.decoderOut = CharBuffer.allocate(i);
    }

    private void flushOutput() {
        if (this.decoderOut.position() > 0) {
            this.writer.write(this.decoderOut.array(), 0, this.decoderOut.position());
            this.decoderOut.rewind();
        }
    }

    private void processInput(boolean z) {
        CoderResult decode;
        this.decoderIn.flip();
        while (true) {
            decode = this.decoder.decode(this.decoderIn, this.decoderOut, z);
            if (!decode.isOverflow()) {
                break;
            }
            flushOutput();
        }
        if (decode.isUnderflow()) {
            this.decoderIn.compact();
            return;
        }
        throw new IOException("Unexpected coder result");
    }

    public void close() {
        processInput(true);
        flushOutput();
        this.writer.close();
    }

    public void flush() {
        flushOutput();
        this.writer.flush();
    }

    public void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            int min = Math.min(i2, this.decoderIn.remaining());
            this.decoderIn.put(bArr, i, min);
            processInput(false);
            i2 -= min;
            i += min;
        }
        if (this.writeImmediately) {
            flushOutput();
        }
    }
}
