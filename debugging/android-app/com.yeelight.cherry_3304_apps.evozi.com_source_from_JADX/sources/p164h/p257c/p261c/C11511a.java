package p164h.p257c.p261c;

import java.io.InputStream;
import java.io.Reader;
import java.net.URI;
import java.net.URL;
import java.util.Map;
import java.util.logging.Logger;
import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSResourceResolver;

/* renamed from: h.c.c.a */
public class C11511a implements LSResourceResolver {

    /* renamed from: b */
    private static Logger f22876b = Logger.getLogger(C11511a.class.getName());

    /* renamed from: a */
    private final Map<URI, URL> f22877a;

    /* renamed from: h.c.c.a$a */
    private static final class C11512a implements LSInput {

        /* renamed from: a */
        InputStream f22878a;

        public C11512a(InputStream inputStream) {
            this.f22878a = inputStream;
        }

        public String getBaseURI() {
            return null;
        }

        public InputStream getByteStream() {
            return this.f22878a;
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

    public C11511a(Map<URI, URL> map) {
        this.f22877a = map;
    }

    public LSInput resolveResource(String str, String str2, String str3, String str4, String str5) {
        Logger logger = f22876b;
        logger.finest("Trying to resolve system identifier URI in catalog: " + str4);
        URL url = this.f22877a.get(URI.create(str4));
        if (url != null) {
            Logger logger2 = f22876b;
            logger2.finest("Loading catalog resource: " + url);
            try {
                C11512a aVar = new C11512a(url.openStream());
                aVar.setBaseURI(str5);
                aVar.setSystemId(str4);
                aVar.setPublicId(str3);
                return aVar;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            Logger logger3 = f22876b;
            logger3.info("System identifier not found in catalog, continuing with default resolution (this most likely means remote HTTP request!): " + str4);
            return null;
        }
    }
}
