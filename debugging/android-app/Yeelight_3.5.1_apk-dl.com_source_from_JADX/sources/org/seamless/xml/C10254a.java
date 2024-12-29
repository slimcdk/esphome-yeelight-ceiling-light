package org.seamless.xml;

import java.io.InputStream;
import java.io.Reader;
import java.net.URI;
import java.net.URL;
import java.util.Map;
import java.util.logging.Logger;
import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSResourceResolver;

/* renamed from: org.seamless.xml.a */
public class C10254a implements LSResourceResolver {

    /* renamed from: b */
    private static Logger f19311b = Logger.getLogger(C10254a.class.getName());

    /* renamed from: a */
    private final Map<URI, URL> f19312a;

    /* renamed from: org.seamless.xml.a$a */
    private static final class C10255a implements LSInput {

        /* renamed from: a */
        InputStream f19313a;

        public C10255a(InputStream inputStream) {
            this.f19313a = inputStream;
        }

        public String getBaseURI() {
            return null;
        }

        public InputStream getByteStream() {
            return this.f19313a;
        }

        public boolean getCertifiedText() {
            return false;
        }

        public Reader getCharacterStream() {
            return null;
        }

        public String getEncoding() {
            return null;
        }

        public String getPublicId() {
            return null;
        }

        public String getStringData() {
            return null;
        }

        public String getSystemId() {
            return null;
        }

        public void setBaseURI(String str) {
        }

        public void setByteStream(InputStream inputStream) {
        }

        public void setCertifiedText(boolean z) {
        }

        public void setCharacterStream(Reader reader) {
        }

        public void setEncoding(String str) {
        }

        public void setPublicId(String str) {
        }

        public void setStringData(String str) {
        }

        public void setSystemId(String str) {
        }
    }

    public C10254a(Map<URI, URL> map) {
        this.f19312a = map;
    }

    public LSInput resolveResource(String str, String str2, String str3, String str4, String str5) {
        Logger logger = f19311b;
        logger.finest("Trying to resolve system identifier URI in catalog: " + str4);
        URL url = this.f19312a.get(URI.create(str4));
        if (url != null) {
            Logger logger2 = f19311b;
            logger2.finest("Loading catalog resource: " + url);
            try {
                C10255a aVar = new C10255a(url.openStream());
                aVar.setBaseURI(str5);
                aVar.setSystemId(str4);
                aVar.setPublicId(str3);
                return aVar;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            Logger logger3 = f19311b;
            logger3.info("System identifier not found in catalog, continuing with default resolution (this most likely means remote HTTP request!): " + str4);
            return null;
        }
    }
}
