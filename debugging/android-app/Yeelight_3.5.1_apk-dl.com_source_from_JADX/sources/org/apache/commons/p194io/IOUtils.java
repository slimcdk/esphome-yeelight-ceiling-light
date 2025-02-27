package org.apache.commons.p194io;

import android.support.p004v4.media.session.PlaybackStateCompat;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.CharArrayWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.Selector;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.p194io.output.ByteArrayOutputStream;
import org.apache.commons.p194io.output.StringBuilderWriter;

/* renamed from: org.apache.commons.io.IOUtils */
public class IOUtils {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    public static final char DIR_SEPARATOR = File.separatorChar;
    public static final char DIR_SEPARATOR_UNIX = '/';
    public static final char DIR_SEPARATOR_WINDOWS = '\\';
    private static final int EOF = -1;
    public static final String LINE_SEPARATOR;
    public static final String LINE_SEPARATOR_UNIX = "\n";
    public static final String LINE_SEPARATOR_WINDOWS = "\r\n";
    private static final int SKIP_BUFFER_SIZE = 2048;
    private static byte[] SKIP_BYTE_BUFFER;
    private static char[] SKIP_CHAR_BUFFER;

    static {
        StringBuilderWriter stringBuilderWriter = new StringBuilderWriter(4);
        PrintWriter printWriter = new PrintWriter(stringBuilderWriter);
        printWriter.println();
        LINE_SEPARATOR = stringBuilderWriter.toString();
        printWriter.close();
    }

    public static void close(URLConnection uRLConnection) {
        if (uRLConnection instanceof HttpURLConnection) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void closeQuietly(InputStream inputStream) {
        closeQuietly((Closeable) inputStream);
    }

    public static void closeQuietly(OutputStream outputStream) {
        closeQuietly((Closeable) outputStream);
    }

    public static void closeQuietly(Reader reader) {
        closeQuietly((Closeable) reader);
    }

    public static void closeQuietly(Writer writer) {
        closeQuietly((Closeable) writer);
    }

    public static void closeQuietly(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void closeQuietly(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void closeQuietly(Selector selector) {
        if (selector != null) {
            try {
                selector.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean contentEquals(InputStream inputStream, InputStream inputStream2) {
        int read;
        if (!(inputStream instanceof BufferedInputStream)) {
            inputStream = new BufferedInputStream(inputStream);
        }
        if (!(inputStream2 instanceof BufferedInputStream)) {
            inputStream2 = new BufferedInputStream(inputStream2);
        }
        do {
            read = inputStream.read();
            if (-1 == read) {
                return inputStream2.read() == -1;
            }
        } while (read == inputStream2.read());
        return false;
    }

    public static boolean contentEquals(Reader reader, Reader reader2) {
        int read;
        BufferedReader bufferedReader = toBufferedReader(reader);
        BufferedReader bufferedReader2 = toBufferedReader(reader2);
        do {
            read = bufferedReader.read();
            if (-1 == read) {
                return bufferedReader2.read() == -1;
            }
        } while (read == bufferedReader2.read());
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean contentEqualsIgnoreEOL(java.io.Reader r3, java.io.Reader r4) {
        /*
            java.io.BufferedReader r3 = toBufferedReader(r3)
            java.io.BufferedReader r4 = toBufferedReader(r4)
        L_0x0008:
            java.lang.String r0 = r3.readLine()
            java.lang.String r1 = r4.readLine()
            if (r0 == 0) goto L_0x001b
            if (r1 == 0) goto L_0x001b
            boolean r2 = r0.equals(r1)
            if (r2 == 0) goto L_0x001b
            goto L_0x0008
        L_0x001b:
            if (r0 != 0) goto L_0x0023
            if (r1 != 0) goto L_0x0021
            r3 = 1
            goto L_0x0027
        L_0x0021:
            r3 = 0
            goto L_0x0027
        L_0x0023:
            boolean r3 = r0.equals(r1)
        L_0x0027:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p194io.IOUtils.contentEqualsIgnoreEOL(java.io.Reader, java.io.Reader):boolean");
    }

    public static int copy(InputStream inputStream, OutputStream outputStream) {
        long copyLarge = copyLarge(inputStream, outputStream);
        if (copyLarge > 2147483647L) {
            return -1;
        }
        return (int) copyLarge;
    }

    public static int copy(Reader reader, Writer writer) {
        long copyLarge = copyLarge(reader, writer);
        if (copyLarge > 2147483647L) {
            return -1;
        }
        return (int) copyLarge;
    }

    public static void copy(InputStream inputStream, Writer writer) {
        copy(inputStream, writer, Charset.defaultCharset());
    }

    public static void copy(InputStream inputStream, Writer writer, String str) {
        copy(inputStream, writer, Charsets.toCharset(str));
    }

    public static void copy(InputStream inputStream, Writer writer, Charset charset) {
        copy((Reader) new InputStreamReader(inputStream, Charsets.toCharset(charset)), writer);
    }

    public static void copy(Reader reader, OutputStream outputStream) {
        copy(reader, outputStream, Charset.defaultCharset());
    }

    public static void copy(Reader reader, OutputStream outputStream, String str) {
        copy(reader, outputStream, Charsets.toCharset(str));
    }

    public static void copy(Reader reader, OutputStream outputStream, Charset charset) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, Charsets.toCharset(charset));
        copy(reader, (Writer) outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static long copyLarge(InputStream inputStream, OutputStream outputStream) {
        return copyLarge(inputStream, outputStream, new byte[4096]);
    }

    public static long copyLarge(InputStream inputStream, OutputStream outputStream, long j, long j2) {
        return copyLarge(inputStream, outputStream, j, j2, new byte[4096]);
    }

    public static long copyLarge(InputStream inputStream, OutputStream outputStream, long j, long j2, byte[] bArr) {
        if (j > 0) {
            skipFully(inputStream, j);
        }
        if (j2 == 0) {
            return 0;
        }
        int length = bArr.length;
        int i = (j2 <= 0 || j2 >= ((long) length)) ? length : (int) j2;
        long j3 = 0;
        while (i > 0) {
            int read = inputStream.read(bArr, 0, i);
            if (-1 == read) {
                break;
            }
            outputStream.write(bArr, 0, read);
            j3 += (long) read;
            if (j2 > 0) {
                i = (int) Math.min(j2 - j3, (long) length);
            }
        }
        return j3;
    }

    public static long copyLarge(InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    public static long copyLarge(Reader reader, Writer writer) {
        return copyLarge(reader, writer, new char[4096]);
    }

    public static long copyLarge(Reader reader, Writer writer, long j, long j2) {
        return copyLarge(reader, writer, j, j2, new char[4096]);
    }

    public static long copyLarge(Reader reader, Writer writer, long j, long j2, char[] cArr) {
        if (j > 0) {
            skipFully(reader, j);
        }
        if (j2 == 0) {
            return 0;
        }
        int length = cArr.length;
        if (j2 > 0 && j2 < ((long) cArr.length)) {
            length = (int) j2;
        }
        long j3 = 0;
        while (length > 0) {
            int read = reader.read(cArr, 0, length);
            if (-1 == read) {
                break;
            }
            writer.write(cArr, 0, read);
            j3 += (long) read;
            if (j2 > 0) {
                length = (int) Math.min(j2 - j3, (long) cArr.length);
            }
        }
        return j3;
    }

    public static long copyLarge(Reader reader, Writer writer, char[] cArr) {
        long j = 0;
        while (true) {
            int read = reader.read(cArr);
            if (-1 == read) {
                return j;
            }
            writer.write(cArr, 0, read);
            j += (long) read;
        }
    }

    public static LineIterator lineIterator(InputStream inputStream, String str) {
        return lineIterator(inputStream, Charsets.toCharset(str));
    }

    public static LineIterator lineIterator(InputStream inputStream, Charset charset) {
        return new LineIterator(new InputStreamReader(inputStream, Charsets.toCharset(charset)));
    }

    public static LineIterator lineIterator(Reader reader) {
        return new LineIterator(reader);
    }

    public static int read(InputStream inputStream, byte[] bArr) {
        return read(inputStream, bArr, 0, bArr.length);
    }

    public static int read(InputStream inputStream, byte[] bArr, int i, int i2) {
        if (i2 >= 0) {
            int i3 = i2;
            while (i3 > 0) {
                int read = inputStream.read(bArr, (i2 - i3) + i, i3);
                if (-1 == read) {
                    break;
                }
                i3 -= read;
            }
            return i2 - i3;
        }
        throw new IllegalArgumentException("Length must not be negative: " + i2);
    }

    public static int read(Reader reader, char[] cArr) {
        return read(reader, cArr, 0, cArr.length);
    }

    public static int read(Reader reader, char[] cArr, int i, int i2) {
        if (i2 >= 0) {
            int i3 = i2;
            while (i3 > 0) {
                int read = reader.read(cArr, (i2 - i3) + i, i3);
                if (-1 == read) {
                    break;
                }
                i3 -= read;
            }
            return i2 - i3;
        }
        throw new IllegalArgumentException("Length must not be negative: " + i2);
    }

    public static void readFully(InputStream inputStream, byte[] bArr) {
        readFully(inputStream, bArr, 0, bArr.length);
    }

    public static void readFully(InputStream inputStream, byte[] bArr, int i, int i2) {
        int read = read(inputStream, bArr, i, i2);
        if (read != i2) {
            throw new EOFException("Length to read: " + i2 + " actual: " + read);
        }
    }

    public static void readFully(Reader reader, char[] cArr) {
        readFully(reader, cArr, 0, cArr.length);
    }

    public static void readFully(Reader reader, char[] cArr, int i, int i2) {
        int read = read(reader, cArr, i, i2);
        if (read != i2) {
            throw new EOFException("Length to read: " + i2 + " actual: " + read);
        }
    }

    public static List<String> readLines(InputStream inputStream) {
        return readLines(inputStream, Charset.defaultCharset());
    }

    public static List<String> readLines(InputStream inputStream, String str) {
        return readLines(inputStream, Charsets.toCharset(str));
    }

    public static List<String> readLines(InputStream inputStream, Charset charset) {
        return readLines((Reader) new InputStreamReader(inputStream, Charsets.toCharset(charset)));
    }

    public static List<String> readLines(Reader reader) {
        BufferedReader bufferedReader = toBufferedReader(reader);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return arrayList;
            }
            arrayList.add(readLine);
        }
    }

    public static long skip(InputStream inputStream, long j) {
        if (j >= 0) {
            if (SKIP_BYTE_BUFFER == null) {
                SKIP_BYTE_BUFFER = new byte[2048];
            }
            long j2 = j;
            while (j2 > 0) {
                long read = (long) inputStream.read(SKIP_BYTE_BUFFER, 0, (int) Math.min(j2, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH));
                if (read < 0) {
                    break;
                }
                j2 -= read;
            }
            return j - j2;
        }
        throw new IllegalArgumentException("Skip count must be non-negative, actual: " + j);
    }

    public static long skip(Reader reader, long j) {
        if (j >= 0) {
            if (SKIP_CHAR_BUFFER == null) {
                SKIP_CHAR_BUFFER = new char[2048];
            }
            long j2 = j;
            while (j2 > 0) {
                long read = (long) reader.read(SKIP_CHAR_BUFFER, 0, (int) Math.min(j2, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH));
                if (read < 0) {
                    break;
                }
                j2 -= read;
            }
            return j - j2;
        }
        throw new IllegalArgumentException("Skip count must be non-negative, actual: " + j);
    }

    public static void skipFully(InputStream inputStream, long j) {
        if (j >= 0) {
            long skip = skip(inputStream, j);
            if (skip != j) {
                throw new EOFException("Bytes to skip: " + j + " actual: " + skip);
            }
            return;
        }
        throw new IllegalArgumentException("Bytes to skip must not be negative: " + j);
    }

    public static void skipFully(Reader reader, long j) {
        long skip = skip(reader, j);
        if (skip != j) {
            throw new EOFException("Chars to skip: " + j + " actual: " + skip);
        }
    }

    public static InputStream toBufferedInputStream(InputStream inputStream) {
        return ByteArrayOutputStream.toBufferedInputStream(inputStream);
    }

    public static BufferedReader toBufferedReader(Reader reader) {
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader);
    }

    public static byte[] toByteArray(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copy(inputStream, (OutputStream) byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] toByteArray(InputStream inputStream, int i) {
        if (i >= 0) {
            int i2 = 0;
            if (i == 0) {
                return new byte[0];
            }
            byte[] bArr = new byte[i];
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            if (i2 == i) {
                return bArr;
            }
            throw new IOException("Unexpected readed size. current: " + i2 + ", excepted: " + i);
        }
        throw new IllegalArgumentException("Size must be equal or greater than zero: " + i);
    }

    public static byte[] toByteArray(InputStream inputStream, long j) {
        if (j <= 2147483647L) {
            return toByteArray(inputStream, (int) j);
        }
        throw new IllegalArgumentException("Size cannot be greater than Integer max value: " + j);
    }

    public static byte[] toByteArray(Reader reader) {
        return toByteArray(reader, Charset.defaultCharset());
    }

    public static byte[] toByteArray(Reader reader, String str) {
        return toByteArray(reader, Charsets.toCharset(str));
    }

    public static byte[] toByteArray(Reader reader, Charset charset) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copy(reader, (OutputStream) byteArrayOutputStream, charset);
        return byteArrayOutputStream.toByteArray();
    }

    @Deprecated
    public static byte[] toByteArray(String str) {
        return str.getBytes();
    }

    public static byte[] toByteArray(URI uri) {
        return toByteArray(uri.toURL());
    }

    public static byte[] toByteArray(URL url) {
        URLConnection openConnection = url.openConnection();
        try {
            return toByteArray(openConnection);
        } finally {
            close(openConnection);
        }
    }

    public static byte[] toByteArray(URLConnection uRLConnection) {
        InputStream inputStream = uRLConnection.getInputStream();
        try {
            return toByteArray(inputStream);
        } finally {
            inputStream.close();
        }
    }

    public static char[] toCharArray(InputStream inputStream) {
        return toCharArray(inputStream, Charset.defaultCharset());
    }

    public static char[] toCharArray(InputStream inputStream, String str) {
        return toCharArray(inputStream, Charsets.toCharset(str));
    }

    public static char[] toCharArray(InputStream inputStream, Charset charset) {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        copy(inputStream, (Writer) charArrayWriter, charset);
        return charArrayWriter.toCharArray();
    }

    public static char[] toCharArray(Reader reader) {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        copy(reader, (Writer) charArrayWriter);
        return charArrayWriter.toCharArray();
    }

    public static InputStream toInputStream(CharSequence charSequence) {
        return toInputStream(charSequence, Charset.defaultCharset());
    }

    public static InputStream toInputStream(CharSequence charSequence, String str) {
        return toInputStream(charSequence, Charsets.toCharset(str));
    }

    public static InputStream toInputStream(CharSequence charSequence, Charset charset) {
        return toInputStream(charSequence.toString(), charset);
    }

    public static InputStream toInputStream(String str) {
        return toInputStream(str, Charset.defaultCharset());
    }

    public static InputStream toInputStream(String str, String str2) {
        return new ByteArrayInputStream(str.getBytes(Charsets.toCharset(str2)));
    }

    public static InputStream toInputStream(String str, Charset charset) {
        return new ByteArrayInputStream(str.getBytes(Charsets.toCharset(charset)));
    }

    public static String toString(InputStream inputStream) {
        return toString(inputStream, Charset.defaultCharset());
    }

    public static String toString(InputStream inputStream, String str) {
        return toString(inputStream, Charsets.toCharset(str));
    }

    public static String toString(InputStream inputStream, Charset charset) {
        StringBuilderWriter stringBuilderWriter = new StringBuilderWriter();
        copy(inputStream, (Writer) stringBuilderWriter, charset);
        return stringBuilderWriter.toString();
    }

    public static String toString(Reader reader) {
        StringBuilderWriter stringBuilderWriter = new StringBuilderWriter();
        copy(reader, (Writer) stringBuilderWriter);
        return stringBuilderWriter.toString();
    }

    public static String toString(URI uri) {
        return toString(uri, Charset.defaultCharset());
    }

    public static String toString(URI uri, String str) {
        return toString(uri, Charsets.toCharset(str));
    }

    public static String toString(URI uri, Charset charset) {
        return toString(uri.toURL(), Charsets.toCharset(charset));
    }

    public static String toString(URL url) {
        return toString(url, Charset.defaultCharset());
    }

    public static String toString(URL url, String str) {
        return toString(url, Charsets.toCharset(str));
    }

    public static String toString(URL url, Charset charset) {
        InputStream openStream = url.openStream();
        try {
            return toString(openStream, charset);
        } finally {
            openStream.close();
        }
    }

    @Deprecated
    public static String toString(byte[] bArr) {
        return new String(bArr);
    }

    public static String toString(byte[] bArr, String str) {
        return new String(bArr, Charsets.toCharset(str));
    }

    public static void write(CharSequence charSequence, OutputStream outputStream) {
        write(charSequence, outputStream, Charset.defaultCharset());
    }

    public static void write(CharSequence charSequence, OutputStream outputStream, String str) {
        write(charSequence, outputStream, Charsets.toCharset(str));
    }

    public static void write(CharSequence charSequence, OutputStream outputStream, Charset charset) {
        if (charSequence != null) {
            write(charSequence.toString(), outputStream, charset);
        }
    }

    public static void write(CharSequence charSequence, Writer writer) {
        if (charSequence != null) {
            write(charSequence.toString(), writer);
        }
    }

    public static void write(String str, OutputStream outputStream) {
        write(str, outputStream, Charset.defaultCharset());
    }

    public static void write(String str, OutputStream outputStream, String str2) {
        write(str, outputStream, Charsets.toCharset(str2));
    }

    public static void write(String str, OutputStream outputStream, Charset charset) {
        if (str != null) {
            outputStream.write(str.getBytes(Charsets.toCharset(charset)));
        }
    }

    public static void write(String str, Writer writer) {
        if (str != null) {
            writer.write(str);
        }
    }

    @Deprecated
    public static void write(StringBuffer stringBuffer, OutputStream outputStream) {
        write(stringBuffer, outputStream, (String) null);
    }

    @Deprecated
    public static void write(StringBuffer stringBuffer, OutputStream outputStream, String str) {
        if (stringBuffer != null) {
            outputStream.write(stringBuffer.toString().getBytes(Charsets.toCharset(str)));
        }
    }

    @Deprecated
    public static void write(StringBuffer stringBuffer, Writer writer) {
        if (stringBuffer != null) {
            writer.write(stringBuffer.toString());
        }
    }

    public static void write(byte[] bArr, OutputStream outputStream) {
        if (bArr != null) {
            outputStream.write(bArr);
        }
    }

    public static void write(byte[] bArr, Writer writer) {
        write(bArr, writer, Charset.defaultCharset());
    }

    public static void write(byte[] bArr, Writer writer, String str) {
        write(bArr, writer, Charsets.toCharset(str));
    }

    public static void write(byte[] bArr, Writer writer, Charset charset) {
        if (bArr != null) {
            writer.write(new String(bArr, Charsets.toCharset(charset)));
        }
    }

    public static void write(char[] cArr, OutputStream outputStream) {
        write(cArr, outputStream, Charset.defaultCharset());
    }

    public static void write(char[] cArr, OutputStream outputStream, String str) {
        write(cArr, outputStream, Charsets.toCharset(str));
    }

    public static void write(char[] cArr, OutputStream outputStream, Charset charset) {
        if (cArr != null) {
            outputStream.write(new String(cArr).getBytes(Charsets.toCharset(charset)));
        }
    }

    public static void write(char[] cArr, Writer writer) {
        if (cArr != null) {
            writer.write(cArr);
        }
    }

    public static void writeLines(Collection<?> collection, String str, OutputStream outputStream) {
        writeLines(collection, str, outputStream, Charset.defaultCharset());
    }

    public static void writeLines(Collection<?> collection, String str, OutputStream outputStream, String str2) {
        writeLines(collection, str, outputStream, Charsets.toCharset(str2));
    }

    public static void writeLines(Collection<?> collection, String str, OutputStream outputStream, Charset charset) {
        if (collection != null) {
            if (str == null) {
                str = LINE_SEPARATOR;
            }
            Charset charset2 = Charsets.toCharset(charset);
            for (Object next : collection) {
                if (next != null) {
                    outputStream.write(next.toString().getBytes(charset2));
                }
                outputStream.write(str.getBytes(charset2));
            }
        }
    }

    public static void writeLines(Collection<?> collection, String str, Writer writer) {
        if (collection != null) {
            if (str == null) {
                str = LINE_SEPARATOR;
            }
            for (Object next : collection) {
                if (next != null) {
                    writer.write(next.toString());
                }
                writer.write(str);
            }
        }
    }
}
