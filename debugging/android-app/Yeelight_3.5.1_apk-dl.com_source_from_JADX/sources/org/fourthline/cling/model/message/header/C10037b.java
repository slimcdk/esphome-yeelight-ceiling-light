package org.fourthline.cling.model.message.header;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: org.fourthline.cling.model.message.header.b */
public class C10037b extends UpnpHeader<List<URL>> {

    /* renamed from: c */
    private static final Logger f18538c = Logger.getLogger(C10037b.class.getName());

    public C10037b() {
        mo40451e(new ArrayList());
    }

    public C10037b(List<URL> list) {
        this();
        ((List) mo40449b()).addAll(list);
    }

    /* renamed from: a */
    public String mo40448a() {
        StringBuilder sb = new StringBuilder();
        for (URL url : (List) mo40449b()) {
            sb.append("<");
            sb.append(url.toString());
            sb.append(">");
        }
        return sb.toString();
    }

    /* renamed from: d */
    public void mo40450d(String str) {
        if (str.length() != 0) {
            if (!str.contains("<") || !str.contains(">")) {
                throw new InvalidHeaderException("URLs not in brackets: " + str);
            }
            String replaceAll = str.replaceAll("<", "");
            String[] split = replaceAll.split(">");
            try {
                ArrayList arrayList = new ArrayList();
                for (String trim : split) {
                    String trim2 = trim.trim();
                    if (!trim2.startsWith("http://")) {
                        f18538c.warning("Discarding non-http callback URL: " + trim2);
                    } else {
                        URL url = new URL(trim2);
                        try {
                            url.toURI();
                            arrayList.add(url);
                        } catch (URISyntaxException e) {
                            f18538c.log(Level.WARNING, "Discarding callback URL, not a valid URI on this platform: " + url, e);
                        }
                    }
                }
                mo40451e(arrayList);
            } catch (MalformedURLException e2) {
                throw new InvalidHeaderException("Can't parse callback URLs from '" + replaceAll + "': " + e2);
            }
        }
    }
}
