package org.seamless.xml;

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

public class SAXParser {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Logger f19303b = Logger.getLogger(SAXParser.class.getName());

    /* renamed from: c */
    public static final URI f19304c = URI.create("http://www.w3.org/2001/xml.xsd");

    /* renamed from: d */
    public static final URL f19305d = Thread.currentThread().getContextClassLoader().getResource("org/seamless/schemas/xml.xsd");

    /* renamed from: a */
    private final XMLReader f19306a;

    /* renamed from: org.seamless.xml.SAXParser$a */
    public static class C10252a<I> extends DefaultHandler {

        /* renamed from: a */
        protected SAXParser f19307a;

        /* renamed from: b */
        protected I f19308b;

        /* renamed from: c */
        protected C10252a f19309c;

        /* renamed from: d */
        protected StringBuilder f19310d;

        public C10252a(I i, C10252a aVar) {
            this(i, aVar.mo41612c(), aVar);
        }

        public C10252a(I i, SAXParser sAXParser) {
            this(i, sAXParser, (C10252a) null);
        }

        public C10252a(I i, SAXParser sAXParser, C10252a aVar) {
            this.f19310d = new StringBuilder();
            this.f19308b = i;
            this.f19307a = sAXParser;
            this.f19309c = aVar;
            if (sAXParser != null) {
                sAXParser.mo41609g(this);
            }
        }

        /* renamed from: a */
        public String mo41610a() {
            return this.f19310d.toString();
        }

        /* renamed from: b */
        public I mo41611b() {
            return this.f19308b;
        }

        /* renamed from: c */
        public SAXParser mo41612c() {
            return this.f19307a;
        }

        public void characters(char[] cArr, int i, int i2) {
            this.f19310d.append(cArr, i, i2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public boolean mo38576d(String str, String str2, String str3) {
            throw null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo41614e() {
            C10252a aVar;
            SAXParser sAXParser = this.f19307a;
            if (sAXParser != null && (aVar = this.f19309c) != null) {
                sAXParser.mo41609g(aVar);
            }
        }

        public void endElement(String str, String str2, String str3) {
            if (mo38576d(str, str2, str3)) {
                Logger a = SAXParser.f19303b;
                a.finer(getClass().getSimpleName() + ": last element, switching to parent: " + str2);
                mo41614e();
                return;
            }
            Logger a2 = SAXParser.f19303b;
            a2.finer(getClass().getSimpleName() + " ending: " + str2);
        }

        public void startElement(String str, String str2, String str3, Attributes attributes) {
            this.f19310d = new StringBuilder();
            new AttributesImpl(attributes);
            Logger a = SAXParser.f19303b;
            a.finer(getClass().getSimpleName() + " starting: " + str2);
        }
    }

    /* renamed from: org.seamless.xml.SAXParser$b */
    public class C10253b implements ErrorHandler {
        public C10253b(SAXParser sAXParser) {
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

    public SAXParser() {
        this((DefaultHandler) null);
    }

    public SAXParser(DefaultHandler defaultHandler) {
        XMLReader b = mo41604b();
        this.f19306a = b;
        if (defaultHandler != null) {
            b.setContentHandler(defaultHandler);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public XMLReader mo41604b() {
        try {
            if (mo41607e() == null) {
                return XMLReaderFactory.createXMLReader();
            }
            SAXParserFactory newInstance = SAXParserFactory.newInstance();
            newInstance.setNamespaceAware(true);
            newInstance.setSchema(mo41605c(mo41607e()));
            XMLReader xMLReader = newInstance.newSAXParser().getXMLReader();
            xMLReader.setErrorHandler(mo41606d());
            return xMLReader;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Schema mo41605c(Source[] sourceArr) {
        try {
            SchemaFactory newInstance = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
            newInstance.setResourceResolver(new C10254a(new HashMap<URI, URL>() {
                {
                    put(SAXParser.f19304c, SAXParser.f19305d);
                }
            }));
            return newInstance.newSchema(sourceArr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public ErrorHandler mo41606d() {
        return new C10253b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Source[] mo41607e() {
        return null;
    }

    /* renamed from: f */
    public void mo41608f(InputSource inputSource) {
        try {
            this.f19306a.parse(inputSource);
        } catch (Exception e) {
            throw new ParserException((Throwable) e);
        }
    }

    /* renamed from: g */
    public void mo41609g(ContentHandler contentHandler) {
        this.f19306a.setContentHandler(contentHandler);
    }
}
