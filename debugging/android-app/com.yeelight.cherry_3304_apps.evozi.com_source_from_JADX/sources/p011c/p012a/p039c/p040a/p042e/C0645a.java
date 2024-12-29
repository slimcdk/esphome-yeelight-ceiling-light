package p011c.p012a.p039c.p040a.p042e;

import android.content.Context;
import android.content.res.Resources;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.StringTokenizer;
import p011c.p012a.p039c.p040a.C0641a;
import p011c.p012a.p039c.p040a.C0642b;
import p011c.p012a.p039c.p040a.p041d.C0644a;
import p011c.p012a.p039c.p040a.p044g.C0647a;
import p011c.p012a.p039c.p040a.p045h.C0650c;
import p011c.p012a.p039c.p040a.p045h.C0651d;

/* renamed from: c.a.c.a.e.a */
public class C0645a {

    /* renamed from: c */
    public static final String[] f361c = {"LogCatAppender", "FileAppender"};

    /* renamed from: d */
    public static final String[] f362d = {"com.google.code.microlog4android.appender.LogCatAppender", "com.google.code.microlog4android.appender.FileAppender"};

    /* renamed from: e */
    public static final String[] f363e = {"SimpleFormatter", "PatternFormatter"};

    /* renamed from: f */
    public static final String[] f364f = {"com.google.code.microlog4android.format.SimpleFormatter", "com.google.code.microlog4android.format.PatternFormatter"};

    /* renamed from: g */
    private static final HashMap<String, String> f365g = new HashMap<>(43);

    /* renamed from: h */
    private static final HashMap<String, String> f366h = new HashMap<>(21);

    /* renamed from: a */
    private Context f367a;

    /* renamed from: b */
    private C0651d f368b;

    private C0645a(Context context) {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f361c;
            if (i2 >= strArr.length) {
                break;
            }
            f365g.put(strArr[i2], f362d[i2]);
            i2++;
        }
        while (true) {
            String[] strArr2 = f363e;
            if (i < strArr2.length) {
                f366h.put(strArr2[i], f364f[i]);
                i++;
            } else {
                this.f367a = context;
                this.f368b = C0650c.INSTANCE;
                return;
            }
        }
    }

    /* renamed from: a */
    private void m581a(String str) {
        String str2;
        StringBuilder sb;
        C0642b a = this.f368b.mo8692a();
        String str3 = f365g.get(str);
        if (str3 != null) {
            str = str3;
        }
        try {
            C0644a aVar = (C0644a) Class.forName(str).newInstance();
            if (aVar != null) {
                "Adding appender " + aVar.getClass().getName();
                a.mo8683a(aVar);
            }
        } catch (ClassNotFoundException e) {
            e = e;
            sb = new StringBuilder();
            str2 = "Failed to find appender class: ";
            sb.append(str2);
            sb.append(e);
            sb.toString();
        } catch (IllegalAccessException e2) {
            e = e2;
            sb = new StringBuilder();
            str2 = "No access to appender class: ";
            sb.append(str2);
            sb.append(e);
            sb.toString();
        } catch (InstantiationException e3) {
            e = e3;
            sb = new StringBuilder();
            str2 = "Failed to instantiate appender class: ";
            sb.append(str2);
            sb.append(e);
            sb.toString();
        } catch (ClassCastException e4) {
            e = e4;
            sb = new StringBuilder();
            str2 = "Specified appender class does not implement the Appender interface: ";
            sb.append(str2);
            sb.append(e);
            sb.toString();
        }
    }

    /* renamed from: c */
    private void m582c(Properties properties) {
        m588i(properties);
        m586g(m585f(properties.getProperty("microlog.appender", "LogCatAppender")));
        m587h(properties);
    }

    /* renamed from: d */
    public static C0645a m583d(Context context) {
        if (context != null) {
            return new C0645a(context);
        }
        throw new IllegalArgumentException("The context must not be null");
    }

    /* renamed from: e */
    private Properties m584e(InputStream inputStream) {
        Properties properties = new Properties();
        properties.load(inputStream);
        return properties;
    }

    /* renamed from: f */
    private List<String> m585f(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ";,");
        ArrayList arrayList = new ArrayList();
        while (stringTokenizer.hasMoreElements()) {
            arrayList.add((String) stringTokenizer.nextElement());
        }
        return arrayList;
    }

    /* renamed from: g */
    private void m586g(List<String> list) {
        for (String a : list) {
            m581a(a);
        }
    }

    /* renamed from: h */
    private void m587h(Properties properties) {
        String str;
        StringBuilder sb;
        String property = properties.getProperty("microlog.formatter", "PatternFormatter");
        String str2 = property != null ? f366h.get(property) : null;
        if (str2 != null) {
            property = str2;
        }
        try {
            C0647a aVar = (C0647a) Class.forName(property).newInstance();
            if (aVar != null) {
                C0642b a = this.f368b.mo8692a();
                int d = a.mo8686d();
                for (int i = 0; i < d; i++) {
                    a.mo8684b(i).mo8690a(aVar);
                }
            }
        } catch (ClassNotFoundException e) {
            e = e;
            sb = new StringBuilder();
            str = "Failed to find Formatter class: ";
            sb.append(str);
            sb.append(e);
            sb.toString();
        } catch (InstantiationException e2) {
            e = e2;
            sb = new StringBuilder();
            str = "Failed to instantiate formtter: ";
            sb.append(str);
            sb.append(e);
            sb.toString();
        } catch (IllegalAccessException e3) {
            e = e3;
            sb = new StringBuilder();
            str = "No access to formatter class: ";
            sb.append(str);
            sb.append(e);
            sb.toString();
        } catch (ClassCastException e4) {
            e = e4;
            sb = new StringBuilder();
            str = "Specified formatter class does not implement the Formatter interface: ";
            sb.append(str);
            sb.append(e);
            sb.toString();
        }
    }

    /* renamed from: i */
    private void m588i(Properties properties) {
        C0641a k = m590k((String) properties.get("microlog.level"));
        if (k != null) {
            this.f368b.mo8692a().mo8688f(k);
            "Root level: " + this.f368b.mo8692a().mo8685c();
        }
    }

    /* renamed from: j */
    private void m589j(Properties properties) {
        if (!properties.containsKey("microlog.rootLogger")) {
            m582c(properties);
        }
    }

    /* renamed from: k */
    private C0641a m590k(String str) {
        return C0641a.valueOf(str);
    }

    /* renamed from: b */
    public void mo8691b(int i) {
        String str;
        StringBuilder sb;
        try {
            m589j(m584e(this.f367a.getResources().openRawResource(i)));
            return;
        } catch (Resources.NotFoundException e) {
            e = e;
            sb = new StringBuilder();
            str = "Did not find the microlog properties resource. Hint: this should be in the /res/raw directory ";
        } catch (IOException e2) {
            e = e2;
            sb = new StringBuilder();
            str = "Failed to read the microlog properties resource.";
        }
        sb.append(str);
        sb.append(e);
        sb.toString();
    }
}
