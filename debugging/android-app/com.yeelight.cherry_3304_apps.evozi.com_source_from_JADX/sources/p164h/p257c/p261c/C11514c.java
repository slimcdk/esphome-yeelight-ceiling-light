package p164h.p257c.p261c;

import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.logging.Logger;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Source;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

/* renamed from: h.c.c.c */
public class C11514c {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Logger f22879b = Logger.getLogger(C11514c.class.getName());

    /* renamed from: c */
    public static final URI f22880c = URI.create("http://www.w3.org/2001/xml.xsd");

    /* renamed from: d */
    public static final URL f22881d = Thread.currentThread().getContextClassLoader().getResource("org/seamless/schemas/xml.xsd");

    /* renamed from: a */
    private final XMLReader f22882a;

    /* renamed from: h.c.c.c$a */
    class C11515a extends HashMap<URI, URL> {
        C11515a(C11514c cVar) {
            put(C11514c.f22880c, C11514c.f22881d);
        }
    }

    /* renamed from: h.c.c.c$b */
    public static class C11516b<I> extends DefaultHandler {

        /* renamed from: a */
        protected C11514c f22883a;

        /* renamed from: b */
        protected I f22884b;

        /* renamed from: c */
        protected C11516b f22885c;

        /* renamed from: d */
        protected StringBuilder f22886d;

        public C11516b(I i, C11516b bVar) {
            this(i, bVar.mo36436c(), bVar);
        }

        public C11516b(I i, C11514c cVar) {
            this(i, cVar, (C11516b) null);
        }

        public C11516b(I i, C11514c cVar, C11516b bVar) {
            this.f22886d = new StringBuilder();
            this.f22884b = i;
            this.f22883a = cVar;
            this.f22885c = bVar;
            if (cVar != null) {
                cVar.mo36433g(this);
            }
        }

        /* renamed from: a */
        public String mo36434a() {
            return this.f22886d.toString();
        }

        /* renamed from: b */
        public I mo36435b() {
            return this.f22884b;
        }

        /* renamed from: c */
        public C11514c mo36436c() {
            return this.f22883a;
        }

        public void characters(char[] cArr, int i, int i2) {
            this.f22886d.append(cArr, i, i2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public boolean mo35591d(String str, String str2, String str3) {
            throw null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo36438e() {
            C11516b bVar;
            C11514c cVar = this.f22883a;
            if (cVar != null && (bVar = this.f22885c) != null) {
                cVar.mo36433g(bVar);
            }
        }

        public void endElement(String str, String str2, String str3) {
            if (mo35591d(str, str2, str3)) {
                Logger a = C11514c.f22879b;
                a.finer(getClass().getSimpleName() + ": last element, switching to parent: " + str2);
                mo36438e();
                return;
            }
            Logger a2 = C11514c.f22879b;
            a2.finer(getClass().getSimpleName() + " ending: " + str2);
        }

        public void startElement(String str, String str2, String str3, Attributes attributes) {
            this.f22886d = new StringBuilder();
            new AttributesImpl(attributes);
            Logger a = C11514c.f22879b;
            a.finer(getClass().getSimpleName() + " starting: " + str2);
        }
    }

    /* renamed from: h.c.c.c$c */
    public class C11517c implements ErrorHandler {
        public C11517c(C11514c cVar) {
        }

        public void error(SAXParseException sAXParseException) {
            throw new SAXException(sAXParseException);
        }

        public void fatalError(SAXParseException sAXParseException) {
            throw new SAXException(sAXParseException);
        }

        public void warning(SAXParseException sAXParseException) {
            throw new SAXException(sAXParseException);
        }
    }

    public C11514c() {
        this((DefaultHandler) null);
    }

    public C11514c(DefaultHandler defaultHandler) {
        XMLReader b = mo36428b();
        this.f22882a = b;
        if (defaultHandler != null) {
            b.setContentHandler(defaultHandler);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public XMLReader mo36428b() {
        try {
            if (mo36431e() == null) {
                return XMLReaderFactory.createXMLReader();
            }
            SAXParserFactory newInstance = SAXParserFactory.newInstance();
            newInstance.setNamespaceAware(true);
            newInstance.setSchema(mo36429c(mo36431e()));
            XMLReader xMLReader = newInstance.newSAXParser().getXMLReader();
            xMLReader.setErrorHandler(mo36430d());
            return xMLReader;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Schema mo36429c(Source[] sourceArr) {
        try {
            SchemaFactory newInstance = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
            newInstance.setResourceResolver(new C11511a(new C11515a(this)));
            return newInstance.newSchema(sourceArr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public ErrorHandler mo36430d() {
        return new C11517c(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Source[] mo36431e() {
        return null;
    }

    /* renamed from: f */
    public void mo36432f(InputSource inputSource) {
        try {
            this.f22882a.parse(inputSource);
        } catch (Exception e) {
            throw new C11513b(e);
        }
    }

    /* renamed from: g */
    public void mo36433g(ContentHandler contentHandler) {
        this.f22882a.setContentHandler(contentHandler);
    }
}
