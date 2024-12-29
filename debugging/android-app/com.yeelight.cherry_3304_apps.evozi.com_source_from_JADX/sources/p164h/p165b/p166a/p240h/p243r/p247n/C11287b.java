package p164h.p165b.p166a.p240h.p243r.p247n;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: h.b.a.h.r.n.b */
public class C11287b extends C11296f0<List<URL>> {

    /* renamed from: c */
    private static final Logger f22399c = Logger.getLogger(C11287b.class.getName());

    public C11287b() {
        mo35846e(new ArrayList());
    }

    public C11287b(List<URL> list) {
        this();
        ((List) mo35845b()).addAll(list);
    }

    /* renamed from: a */
    public String mo35841a() {
        StringBuilder sb = new StringBuilder();
        for (URL url : (List) mo35845b()) {
            sb.append("<");
            sb.append(url.toString());
            sb.append(">");
        }
        return sb.toString();
    }

    /* renamed from: d */
    public void mo35842d(String str) {
        if (str.length() != 0) {
            if (!str.contains("<") || !str.contains(">")) {
                throw new C11304k("URLs not in brackets: " + str);
            }
            String replaceAll = str.replaceAll("<", "");
            String[] split = replaceAll.split(">");
            try {
                ArrayList arrayList = new ArrayList();
                for (String trim : split) {
                    String trim2 = trim.trim();
                    if (!trim2.startsWith("http://")) {
                        f22399c.warning("Discarding non-http callback URL: " + trim2);
                    } else {
                        URL url = new URL(trim2);
                        try {
                            url.toURI();
                            arrayList.add(url);
                        } catch (URISyntaxException e) {
                            f22399c.log(Level.WARNING, "Discarding callback URL, not a valid URI on this platform: " + url, e);
                        }
                    }
                }
                mo35846e(arrayList);
            } catch (MalformedURLException e2) {
                throw new C11304k("Can't parse callback URLs from '" + replaceAll + "': " + e2);
            }
        }
    }
}
