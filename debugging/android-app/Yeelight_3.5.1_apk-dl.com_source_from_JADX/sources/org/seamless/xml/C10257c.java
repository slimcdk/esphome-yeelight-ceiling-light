package org.seamless.xml;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.URI;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.transform.Source;
import org.seamless.xml.C10256b;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/* renamed from: org.seamless.xml.c */
public abstract class C10257c<D extends C10256b> implements ErrorHandler, EntityResolver {

    /* renamed from: a */
    private static Logger f19315a = Logger.getLogger(C10257c.class.getName());

    /* renamed from: b */
    public static final URL f19316b = Thread.currentThread().getContextClassLoader().getResource("org/seamless/schemas/xml.xsd");

    public C10257c() {
        this((Source[]) null);
    }

    public C10257c(Source[] sourceArr) {
    }

    public void error(SAXParseException sAXParseException) {
        throw new SAXException(new ParserException(sAXParseException));
    }

    public void fatalError(SAXParseException sAXParseException) {
        throw new SAXException(new ParserException(sAXParseException));
    }

    public InputSource resolveEntity(String str, String str2) {
        InputSource inputSource = str2.startsWith("file://") ? new InputSource(new FileInputStream(new File(URI.create(str2)))) : new InputSource(new ByteArrayInputStream(new byte[0]));
        inputSource.setPublicId(str);
        inputSource.setSystemId(str2);
        return inputSource;
    }

    public void warning(SAXParseException sAXParseException) {
        f19315a.warning(sAXParseException.toString());
    }
}
