package p088r0;

import android.content.Context;
import android.content.res.Resources;
import com.google.code.microlog4android.Level;
import com.google.code.microlog4android.repository.C2188c;
import com.google.code.microlog4android.repository.DefaultLoggerRepository;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.StringTokenizer;
import p080p0.C3592a;
import p084q0.C3613b;
import p094s0.C3681a;

/* renamed from: r0.a */
public class C3622a {

    /* renamed from: c */
    public static final String[] f6031c = {"LogCatAppender", "FileAppender"};

    /* renamed from: d */
    public static final String[] f6032d = {"com.google.code.microlog4android.appender.LogCatAppender", "com.google.code.microlog4android.appender.FileAppender"};

    /* renamed from: e */
    public static final String[] f6033e = {"SimpleFormatter", "PatternFormatter"};

    /* renamed from: f */
    public static final String[] f6034f = {"com.google.code.microlog4android.format.SimpleFormatter", "com.google.code.microlog4android.format.PatternFormatter"};

    /* renamed from: g */
    private static final HashMap<String, String> f6035g = new HashMap<>(43);

    /* renamed from: h */
    private static final HashMap<String, String> f6036h = new HashMap<>(21);

    /* renamed from: a */
    private Context f6037a;

    /* renamed from: b */
    private C2188c f6038b;

    private C3622a(Context context) {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f6031c;
            if (i2 >= strArr.length) {
                break;
            }
            f6035g.put(strArr[i2], f6032d[i2]);
            i2++;
        }
        while (true) {
            String[] strArr2 = f6033e;
            if (i < strArr2.length) {
                f6036h.put(strArr2[i], f6034f[i]);
                i++;
            } else {
                this.f6037a = context;
                this.f6038b = DefaultLoggerRepository.INSTANCE;
                return;
            }
        }
    }

    /* renamed from: a */
    private void m10303a(String str) {
        String str2;
        StringBuilder sb;
        C3592a rootLogger = this.f6038b.getRootLogger();
        String str3 = f6035g.get(str);
        if (str3 != null) {
            str = str3;
        }
        try {
            C3613b bVar = (C3613b) Class.forName(str).newInstance();
            if (bVar != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Adding appender ");
                sb2.append(bVar.getClass().getName());
                rootLogger.mo25866a(bVar);
            }
        } catch (ClassNotFoundException e) {
            e = e;
            sb = new StringBuilder();
            str2 = "Failed to find appender class: ";
            sb.append(str2);
            sb.append(e);
        } catch (IllegalAccessException e2) {
            e = e2;
            sb = new StringBuilder();
            str2 = "No access to appender class: ";
            sb.append(str2);
            sb.append(e);
        } catch (InstantiationException e3) {
            e = e3;
            sb = new StringBuilder();
            str2 = "Failed to instantiate appender class: ";
            sb.append(str2);
            sb.append(e);
        } catch (ClassCastException e4) {
            e = e4;
            sb = new StringBuilder();
            str2 = "Specified appender class does not implement the Appender interface: ";
            sb.append(str2);
            sb.append(e);
        }
    }

    /* renamed from: c */
    private void m10304c(Properties properties) {
        m10310i(properties);
        m10308g(m10307f(properties.getProperty("microlog.appender", "LogCatAppender")));
        m10309h(properties);
    }

    /* renamed from: d */
    public static C3622a m10305d(Context context) {
        if (context != null) {
            return new C3622a(context);
        }
        throw new IllegalArgumentException("The context must not be null");
    }

    /* renamed from: e */
    private Properties m10306e(InputStream inputStream) {
        Properties properties = new Properties();
        properties.load(inputStream);
        return properties;
    }

    /* renamed from: f */
    private List<String> m10307f(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ";,");
        ArrayList arrayList = new ArrayList();
        while (stringTokenizer.hasMoreElements()) {
            arrayList.add((String) stringTokenizer.nextElement());
        }
        return arrayList;
    }

    /* renamed from: g */
    private void m10308g(List<String> list) {
        for (String a : list) {
            m10303a(a);
        }
    }

    /* renamed from: h */
    private void m10309h(Properties properties) {
        String str;
        StringBuilder sb;
        String property = properties.getProperty("microlog.formatter", "PatternFormatter");
        String str2 = property != null ? f6036h.get(property) : null;
        if (str2 != null) {
            property = str2;
        }
        try {
            C3681a aVar = (C3681a) Class.forName(property).newInstance();
            if (aVar != null) {
                C3592a rootLogger = this.f6038b.getRootLogger();
                int l = rootLogger.mo25876l();
                for (int i = 0; i < l; i++) {
                    rootLogger.mo25872h(i).mo25916b(aVar);
                }
            }
        } catch (ClassNotFoundException e) {
            e = e;
            sb = new StringBuilder();
            str = "Failed to find Formatter class: ";
            sb.append(str);
            sb.append(e);
        } catch (InstantiationException e2) {
            e = e2;
            sb = new StringBuilder();
            str = "Failed to instantiate formtter: ";
            sb.append(str);
            sb.append(e);
        } catch (IllegalAccessException e3) {
            e = e3;
            sb = new StringBuilder();
            str = "No access to formatter class: ";
            sb.append(str);
            sb.append(e);
        } catch (ClassCastException e4) {
            e = e4;
            sb = new StringBuilder();
            str = "Specified formatter class does not implement the Formatter interface: ";
            sb.append(str);
            sb.append(e);
        }
    }

    /* renamed from: i */
    private void m10310i(Properties properties) {
        Level k = m10312k((String) properties.get("microlog.level"));
        if (k != null) {
            this.f6038b.getRootLogger().mo25884t(k);
            StringBuilder sb = new StringBuilder();
            sb.append("Root level: ");
            sb.append(this.f6038b.getRootLogger().mo25874j());
        }
    }

    /* renamed from: j */
    private void m10311j(Properties properties) {
        if (!properties.containsKey("microlog.rootLogger")) {
            m10304c(properties);
        }
    }

    /* renamed from: k */
    private Level m10312k(String str) {
        return Level.valueOf(str);
    }

    /* renamed from: b */
    public void mo25923b(int i) {
        String str;
        StringBuilder sb;
        try {
            m10311j(m10306e(this.f6037a.getResources().openRawResource(i)));
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
    }
}
