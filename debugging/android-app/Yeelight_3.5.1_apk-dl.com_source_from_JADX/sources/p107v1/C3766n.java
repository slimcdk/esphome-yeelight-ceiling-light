package p107v1;

import com.google.gson.C2469e;
import com.google.gson.C2478h;
import com.google.gson.C2528k;
import com.google.gson.C2529l;
import com.google.gson.C2530m;
import com.google.gson.C2531n;
import com.google.gson.C2534q;
import com.google.gson.C2536r;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.C2537a;
import com.google.gson.stream.JsonToken;
import com.yeelight.yeelib.device.status.TimerModel;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.slf4j.Marker;
import p119y1.C3918a;
import p122z1.C3929a;

/* renamed from: v1.n */
public final class C3766n {

    /* renamed from: A */
    public static final C2534q<String> f6327A;

    /* renamed from: B */
    public static final C2534q<BigDecimal> f6328B = new C3782h();

    /* renamed from: C */
    public static final C2534q<BigInteger> f6329C = new C3784i();

    /* renamed from: D */
    public static final C2536r f6330D;

    /* renamed from: E */
    public static final C2534q<StringBuilder> f6331E;

    /* renamed from: F */
    public static final C2536r f6332F;

    /* renamed from: G */
    public static final C2534q<StringBuffer> f6333G;

    /* renamed from: H */
    public static final C2536r f6334H;

    /* renamed from: I */
    public static final C2534q<URL> f6335I;

    /* renamed from: J */
    public static final C2536r f6336J;

    /* renamed from: K */
    public static final C2534q<URI> f6337K;

    /* renamed from: L */
    public static final C2536r f6338L;

    /* renamed from: M */
    public static final C2534q<InetAddress> f6339M;

    /* renamed from: N */
    public static final C2536r f6340N;

    /* renamed from: O */
    public static final C2534q<UUID> f6341O;

    /* renamed from: P */
    public static final C2536r f6342P;

    /* renamed from: Q */
    public static final C2534q<Currency> f6343Q;

    /* renamed from: R */
    public static final C2536r f6344R;

    /* renamed from: S */
    public static final C2536r f6345S = new C3796r();

    /* renamed from: T */
    public static final C2534q<Calendar> f6346T;

    /* renamed from: U */
    public static final C2536r f6347U;

    /* renamed from: V */
    public static final C2534q<Locale> f6348V;

    /* renamed from: W */
    public static final C2536r f6349W;

    /* renamed from: X */
    public static final C2534q<C2528k> f6350X;

    /* renamed from: Y */
    public static final C2536r f6351Y;

    /* renamed from: Z */
    public static final C2536r f6352Z = new C3802w();

    /* renamed from: a */
    public static final C2534q<Class> f6353a;

    /* renamed from: b */
    public static final C2536r f6354b;

    /* renamed from: c */
    public static final C2534q<BitSet> f6355c;

    /* renamed from: d */
    public static final C2536r f6356d;

    /* renamed from: e */
    public static final C2534q<Boolean> f6357e;

    /* renamed from: f */
    public static final C2534q<Boolean> f6358f = new C3777e0();

    /* renamed from: g */
    public static final C2536r f6359g;

    /* renamed from: h */
    public static final C2534q<Number> f6360h;

    /* renamed from: i */
    public static final C2536r f6361i;

    /* renamed from: j */
    public static final C2534q<Number> f6362j;

    /* renamed from: k */
    public static final C2536r f6363k;

    /* renamed from: l */
    public static final C2534q<Number> f6364l;

    /* renamed from: m */
    public static final C2536r f6365m;

    /* renamed from: n */
    public static final C2534q<AtomicInteger> f6366n;

    /* renamed from: o */
    public static final C2536r f6367o;

    /* renamed from: p */
    public static final C2534q<AtomicBoolean> f6368p;

    /* renamed from: q */
    public static final C2536r f6369q;

    /* renamed from: r */
    public static final C2534q<AtomicIntegerArray> f6370r;

    /* renamed from: s */
    public static final C2536r f6371s;

    /* renamed from: t */
    public static final C2534q<Number> f6372t = new C3769b();

    /* renamed from: u */
    public static final C2534q<Number> f6373u = new C3772c();

    /* renamed from: v */
    public static final C2534q<Number> f6374v = new C3774d();

    /* renamed from: w */
    public static final C2534q<Number> f6375w;

    /* renamed from: x */
    public static final C2536r f6376x;

    /* renamed from: y */
    public static final C2534q<Character> f6377y;

    /* renamed from: z */
    public static final C2536r f6378z;

    /* renamed from: v1.n$a */
    static class C3767a extends C2534q<AtomicIntegerArray> {
        C3767a() {
        }

        /* renamed from: e */
        public AtomicIntegerArray mo19209b(C3929a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.mo26170a();
            while (aVar.mo26177n()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.mo26164A()));
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException((Throwable) e);
                }
            }
            aVar.mo26173i();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, AtomicIntegerArray atomicIntegerArray) {
            aVar.mo19425d();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                aVar.mo19419J((long) atomicIntegerArray.get(i));
            }
            aVar.mo19428i();
        }
    }

    /* renamed from: v1.n$a0 */
    static class C3768a0 implements C2536r {

        /* renamed from: a */
        final /* synthetic */ Class f6379a;

        /* renamed from: b */
        final /* synthetic */ Class f6380b;

        /* renamed from: c */
        final /* synthetic */ C2534q f6381c;

        C3768a0(Class cls, Class cls2, C2534q qVar) {
            this.f6379a = cls;
            this.f6380b = cls2;
            this.f6381c = qVar;
        }

        /* renamed from: a */
        public <T> C2534q<T> mo19368a(C2469e eVar, C3918a<T> aVar) {
            Class<? super T> c = aVar.mo26409c();
            if (c == this.f6379a || c == this.f6380b) {
                return this.f6381c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f6379a.getName() + Marker.ANY_NON_NULL_MARKER + this.f6380b.getName() + ",adapter=" + this.f6381c + "]";
        }
    }

    /* renamed from: v1.n$b */
    static class C3769b extends C2534q<Number> {
        C3769b() {
        }

        /* renamed from: e */
        public Number mo19209b(C3929a aVar) {
            if (aVar.mo26169N() == JsonToken.NULL) {
                aVar.mo26167G();
                return null;
            }
            try {
                return Long.valueOf(aVar.mo26165B());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, Number number) {
            aVar.mo19421P(number);
        }
    }

    /* renamed from: v1.n$b0 */
    static class C3770b0 implements C2536r {

        /* renamed from: a */
        final /* synthetic */ Class f6382a;

        /* renamed from: b */
        final /* synthetic */ C2534q f6383b;

        /* renamed from: v1.n$b0$a */
        class C3771a extends C2534q<T1> {

            /* renamed from: a */
            final /* synthetic */ Class f6384a;

            C3771a(Class cls) {
                this.f6384a = cls;
            }

            /* renamed from: b */
            public T1 mo19209b(C3929a aVar) {
                T1 b = C3770b0.this.f6383b.mo19209b(aVar);
                if (b == null || this.f6384a.isInstance(b)) {
                    return b;
                }
                throw new JsonSyntaxException("Expected a " + this.f6384a.getName() + " but was " + b.getClass().getName());
            }

            /* renamed from: d */
            public void mo19210d(C2537a aVar, T1 t1) {
                C3770b0.this.f6383b.mo19210d(aVar, t1);
            }
        }

        C3770b0(Class cls, C2534q qVar) {
            this.f6382a = cls;
            this.f6383b = qVar;
        }

        /* renamed from: a */
        public <T2> C2534q<T2> mo19368a(C2469e eVar, C3918a<T2> aVar) {
            Class<? super T2> c = aVar.mo26409c();
            if (!this.f6382a.isAssignableFrom(c)) {
                return null;
            }
            return new C3771a(c);
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f6382a.getName() + ",adapter=" + this.f6383b + "]";
        }
    }

    /* renamed from: v1.n$c */
    static class C3772c extends C2534q<Number> {
        C3772c() {
        }

        /* renamed from: e */
        public Number mo19209b(C3929a aVar) {
            if (aVar.mo26169N() != JsonToken.NULL) {
                return Float.valueOf((float) aVar.mo26181z());
            }
            aVar.mo26167G();
            return null;
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, Number number) {
            aVar.mo19421P(number);
        }
    }

    /* renamed from: v1.n$c0 */
    static /* synthetic */ class C3773c0 {

        /* renamed from: a */
        static final /* synthetic */ int[] f6386a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.gson.stream.JsonToken[] r0 = com.google.gson.stream.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6386a = r0
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6386a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6386a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f6386a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f6386a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f6386a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f6386a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f6386a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NAME     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f6386a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f6386a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p107v1.C3766n.C3773c0.<clinit>():void");
        }
    }

    /* renamed from: v1.n$d */
    static class C3774d extends C2534q<Number> {
        C3774d() {
        }

        /* renamed from: e */
        public Number mo19209b(C3929a aVar) {
            if (aVar.mo26169N() != JsonToken.NULL) {
                return Double.valueOf(aVar.mo26181z());
            }
            aVar.mo26167G();
            return null;
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, Number number) {
            aVar.mo19421P(number);
        }
    }

    /* renamed from: v1.n$d0 */
    static class C3775d0 extends C2534q<Boolean> {
        C3775d0() {
        }

        /* renamed from: e */
        public Boolean mo19209b(C3929a aVar) {
            JsonToken N = aVar.mo26169N();
            if (N != JsonToken.NULL) {
                return N == JsonToken.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.mo26168I())) : Boolean.valueOf(aVar.mo26180v());
            }
            aVar.mo26167G();
            return null;
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, Boolean bool) {
            aVar.mo19420N(bool);
        }
    }

    /* renamed from: v1.n$e */
    static class C3776e extends C2534q<Number> {
        C3776e() {
        }

        /* renamed from: e */
        public Number mo19209b(C3929a aVar) {
            JsonToken N = aVar.mo26169N();
            int i = C3773c0.f6386a[N.ordinal()];
            if (i == 1 || i == 3) {
                return new LazilyParsedNumber(aVar.mo26168I());
            }
            if (i == 4) {
                aVar.mo26167G();
                return null;
            }
            throw new JsonSyntaxException("Expecting number, got: " + N);
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, Number number) {
            aVar.mo19421P(number);
        }
    }

    /* renamed from: v1.n$e0 */
    static class C3777e0 extends C2534q<Boolean> {
        C3777e0() {
        }

        /* renamed from: e */
        public Boolean mo19209b(C3929a aVar) {
            if (aVar.mo26169N() != JsonToken.NULL) {
                return Boolean.valueOf(aVar.mo26168I());
            }
            aVar.mo26167G();
            return null;
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, Boolean bool) {
            aVar.mo19422T(bool == null ? "null" : bool.toString());
        }
    }

    /* renamed from: v1.n$f */
    static class C3778f extends C2534q<Character> {
        C3778f() {
        }

        /* renamed from: e */
        public Character mo19209b(C3929a aVar) {
            if (aVar.mo26169N() == JsonToken.NULL) {
                aVar.mo26167G();
                return null;
            }
            String I = aVar.mo26168I();
            if (I.length() == 1) {
                return Character.valueOf(I.charAt(0));
            }
            throw new JsonSyntaxException("Expecting character, got: " + I);
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, Character ch) {
            aVar.mo19422T(ch == null ? null : String.valueOf(ch));
        }
    }

    /* renamed from: v1.n$f0 */
    static class C3779f0 extends C2534q<Number> {
        C3779f0() {
        }

        /* renamed from: e */
        public Number mo19209b(C3929a aVar) {
            if (aVar.mo26169N() == JsonToken.NULL) {
                aVar.mo26167G();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.mo26164A());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, Number number) {
            aVar.mo19421P(number);
        }
    }

    /* renamed from: v1.n$g */
    static class C3780g extends C2534q<String> {
        C3780g() {
        }

        /* renamed from: e */
        public String mo19209b(C3929a aVar) {
            JsonToken N = aVar.mo26169N();
            if (N != JsonToken.NULL) {
                return N == JsonToken.BOOLEAN ? Boolean.toString(aVar.mo26180v()) : aVar.mo26168I();
            }
            aVar.mo26167G();
            return null;
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, String str) {
            aVar.mo19422T(str);
        }
    }

    /* renamed from: v1.n$g0 */
    static class C3781g0 extends C2534q<Number> {
        C3781g0() {
        }

        /* renamed from: e */
        public Number mo19209b(C3929a aVar) {
            if (aVar.mo26169N() == JsonToken.NULL) {
                aVar.mo26167G();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.mo26164A());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, Number number) {
            aVar.mo19421P(number);
        }
    }

    /* renamed from: v1.n$h */
    static class C3782h extends C2534q<BigDecimal> {
        C3782h() {
        }

        /* renamed from: e */
        public BigDecimal mo19209b(C3929a aVar) {
            if (aVar.mo26169N() == JsonToken.NULL) {
                aVar.mo26167G();
                return null;
            }
            try {
                return new BigDecimal(aVar.mo26168I());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, BigDecimal bigDecimal) {
            aVar.mo19421P(bigDecimal);
        }
    }

    /* renamed from: v1.n$h0 */
    static class C3783h0 extends C2534q<Number> {
        C3783h0() {
        }

        /* renamed from: e */
        public Number mo19209b(C3929a aVar) {
            if (aVar.mo26169N() == JsonToken.NULL) {
                aVar.mo26167G();
                return null;
            }
            try {
                return Integer.valueOf(aVar.mo26164A());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, Number number) {
            aVar.mo19421P(number);
        }
    }

    /* renamed from: v1.n$i */
    static class C3784i extends C2534q<BigInteger> {
        C3784i() {
        }

        /* renamed from: e */
        public BigInteger mo19209b(C3929a aVar) {
            if (aVar.mo26169N() == JsonToken.NULL) {
                aVar.mo26167G();
                return null;
            }
            try {
                return new BigInteger(aVar.mo26168I());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, BigInteger bigInteger) {
            aVar.mo19421P(bigInteger);
        }
    }

    /* renamed from: v1.n$i0 */
    static class C3785i0 extends C2534q<AtomicInteger> {
        C3785i0() {
        }

        /* renamed from: e */
        public AtomicInteger mo19209b(C3929a aVar) {
            try {
                return new AtomicInteger(aVar.mo26164A());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, AtomicInteger atomicInteger) {
            aVar.mo19419J((long) atomicInteger.get());
        }
    }

    /* renamed from: v1.n$j */
    static class C3786j extends C2534q<StringBuilder> {
        C3786j() {
        }

        /* renamed from: e */
        public StringBuilder mo19209b(C3929a aVar) {
            if (aVar.mo26169N() != JsonToken.NULL) {
                return new StringBuilder(aVar.mo26168I());
            }
            aVar.mo26167G();
            return null;
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, StringBuilder sb) {
            aVar.mo19422T(sb == null ? null : sb.toString());
        }
    }

    /* renamed from: v1.n$j0 */
    static class C3787j0 extends C2534q<AtomicBoolean> {
        C3787j0() {
        }

        /* renamed from: e */
        public AtomicBoolean mo19209b(C3929a aVar) {
            return new AtomicBoolean(aVar.mo26180v());
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, AtomicBoolean atomicBoolean) {
            aVar.mo19423V(atomicBoolean.get());
        }
    }

    /* renamed from: v1.n$k */
    static class C3788k extends C2534q<Class> {
        C3788k() {
        }

        /* renamed from: e */
        public Class mo19209b(C3929a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    /* renamed from: v1.n$k0 */
    private static final class C3789k0<T extends Enum<T>> extends C2534q<T> {

        /* renamed from: a */
        private final Map<String, T> f6387a = new HashMap();

        /* renamed from: b */
        private final Map<T, String> f6388b = new HashMap();

        public C3789k0(Class<T> cls) {
            try {
                for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                    String name = enumR.name();
                    SerializedName serializedName = (SerializedName) cls.getField(name).getAnnotation(SerializedName.class);
                    if (serializedName != null) {
                        name = serializedName.value();
                        for (String put : serializedName.alternate()) {
                            this.f6387a.put(put, enumR);
                        }
                    }
                    this.f6387a.put(name, enumR);
                    this.f6388b.put(enumR, name);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }

        /* renamed from: e */
        public T mo19209b(C3929a aVar) {
            if (aVar.mo26169N() != JsonToken.NULL) {
                return (Enum) this.f6387a.get(aVar.mo26168I());
            }
            aVar.mo26167G();
            return null;
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, T t) {
            aVar.mo19422T(t == null ? null : this.f6388b.get(t));
        }
    }

    /* renamed from: v1.n$l */
    static class C3790l extends C2534q<StringBuffer> {
        C3790l() {
        }

        /* renamed from: e */
        public StringBuffer mo19209b(C3929a aVar) {
            if (aVar.mo26169N() != JsonToken.NULL) {
                return new StringBuffer(aVar.mo26168I());
            }
            aVar.mo26167G();
            return null;
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, StringBuffer stringBuffer) {
            aVar.mo19422T(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* renamed from: v1.n$m */
    static class C3791m extends C2534q<URL> {
        C3791m() {
        }

        /* renamed from: e */
        public URL mo19209b(C3929a aVar) {
            if (aVar.mo26169N() == JsonToken.NULL) {
                aVar.mo26167G();
                return null;
            }
            String I = aVar.mo26168I();
            if ("null".equals(I)) {
                return null;
            }
            return new URL(I);
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, URL url) {
            aVar.mo19422T(url == null ? null : url.toExternalForm());
        }
    }

    /* renamed from: v1.n$n */
    static class C3792n extends C2534q<URI> {
        C3792n() {
        }

        /* renamed from: e */
        public URI mo19209b(C3929a aVar) {
            if (aVar.mo26169N() == JsonToken.NULL) {
                aVar.mo26167G();
                return null;
            }
            try {
                String I = aVar.mo26168I();
                if ("null".equals(I)) {
                    return null;
                }
                return new URI(I);
            } catch (URISyntaxException e) {
                throw new JsonIOException((Throwable) e);
            }
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, URI uri) {
            aVar.mo19422T(uri == null ? null : uri.toASCIIString());
        }
    }

    /* renamed from: v1.n$o */
    static class C3793o extends C2534q<InetAddress> {
        C3793o() {
        }

        /* renamed from: e */
        public InetAddress mo19209b(C3929a aVar) {
            if (aVar.mo26169N() != JsonToken.NULL) {
                return InetAddress.getByName(aVar.mo26168I());
            }
            aVar.mo26167G();
            return null;
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, InetAddress inetAddress) {
            aVar.mo19422T(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* renamed from: v1.n$p */
    static class C3794p extends C2534q<UUID> {
        C3794p() {
        }

        /* renamed from: e */
        public UUID mo19209b(C3929a aVar) {
            if (aVar.mo26169N() != JsonToken.NULL) {
                return UUID.fromString(aVar.mo26168I());
            }
            aVar.mo26167G();
            return null;
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, UUID uuid) {
            aVar.mo19422T(uuid == null ? null : uuid.toString());
        }
    }

    /* renamed from: v1.n$q */
    static class C3795q extends C2534q<Currency> {
        C3795q() {
        }

        /* renamed from: e */
        public Currency mo19209b(C3929a aVar) {
            return Currency.getInstance(aVar.mo26168I());
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, Currency currency) {
            aVar.mo19422T(currency.getCurrencyCode());
        }
    }

    /* renamed from: v1.n$r */
    static class C3796r implements C2536r {

        /* renamed from: v1.n$r$a */
        class C3797a extends C2534q<Timestamp> {

            /* renamed from: a */
            final /* synthetic */ C2534q f6389a;

            C3797a(C3796r rVar, C2534q qVar) {
                this.f6389a = qVar;
            }

            /* renamed from: e */
            public Timestamp mo19209b(C3929a aVar) {
                Date date = (Date) this.f6389a.mo19209b(aVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            /* renamed from: f */
            public void mo19210d(C2537a aVar, Timestamp timestamp) {
                this.f6389a.mo19210d(aVar, timestamp);
            }
        }

        C3796r() {
        }

        /* renamed from: a */
        public <T> C2534q<T> mo19368a(C2469e eVar, C3918a<T> aVar) {
            if (aVar.mo26409c() != Timestamp.class) {
                return null;
            }
            return new C3797a(this, eVar.mo19228k(Date.class));
        }
    }

    /* renamed from: v1.n$s */
    static class C3798s extends C2534q<Calendar> {
        C3798s() {
        }

        /* renamed from: e */
        public Calendar mo19209b(C3929a aVar) {
            if (aVar.mo26169N() == JsonToken.NULL) {
                aVar.mo26167G();
                return null;
            }
            aVar.mo26171c();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (aVar.mo26169N() != JsonToken.END_OBJECT) {
                String D = aVar.mo26166D();
                int A = aVar.mo26164A();
                if ("year".equals(D)) {
                    i = A;
                } else if ("month".equals(D)) {
                    i2 = A;
                } else if ("dayOfMonth".equals(D)) {
                    i3 = A;
                } else if ("hourOfDay".equals(D)) {
                    i4 = A;
                } else if (TimerModel.MINUTE.equals(D)) {
                    i5 = A;
                } else if ("second".equals(D)) {
                    i6 = A;
                }
            }
            aVar.mo26175k();
            return new GregorianCalendar(i, i2, i3, i4, i5, i6);
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, Calendar calendar) {
            if (calendar == null) {
                aVar.mo19434s();
                return;
            }
            aVar.mo19426f();
            aVar.mo19433p("year");
            aVar.mo19419J((long) calendar.get(1));
            aVar.mo19433p("month");
            aVar.mo19419J((long) calendar.get(2));
            aVar.mo19433p("dayOfMonth");
            aVar.mo19419J((long) calendar.get(5));
            aVar.mo19433p("hourOfDay");
            aVar.mo19419J((long) calendar.get(11));
            aVar.mo19433p(TimerModel.MINUTE);
            aVar.mo19419J((long) calendar.get(12));
            aVar.mo19433p("second");
            aVar.mo19419J((long) calendar.get(13));
            aVar.mo19429k();
        }
    }

    /* renamed from: v1.n$t */
    static class C3799t extends C2534q<Locale> {
        C3799t() {
        }

        /* renamed from: e */
        public Locale mo19209b(C3929a aVar) {
            Locale locale;
            String str = null;
            if (aVar.mo26169N() == JsonToken.NULL) {
                aVar.mo26167G();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.mo26168I(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            }
            if (nextToken2 == null && str == null) {
                return new Locale(nextToken);
            }
            if (str == null) {
                return locale;
            }
            locale = new Locale(nextToken, nextToken2, str);
            return locale;
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, Locale locale) {
            aVar.mo19422T(locale == null ? null : locale.toString());
        }
    }

    /* renamed from: v1.n$u */
    static class C3800u extends C2534q<C2528k> {
        C3800u() {
        }

        /* renamed from: e */
        public C2528k mo19209b(C3929a aVar) {
            switch (C3773c0.f6386a[aVar.mo26169N().ordinal()]) {
                case 1:
                    return new C2531n((Number) new LazilyParsedNumber(aVar.mo26168I()));
                case 2:
                    return new C2531n(Boolean.valueOf(aVar.mo26180v()));
                case 3:
                    return new C2531n(aVar.mo26168I());
                case 4:
                    aVar.mo26167G();
                    return C2529l.f4270a;
                case 5:
                    C2478h hVar = new C2478h();
                    aVar.mo26170a();
                    while (aVar.mo26177n()) {
                        hVar.mo19259o(mo19209b(aVar));
                    }
                    aVar.mo26173i();
                    return hVar;
                case 6:
                    C2530m mVar = new C2530m();
                    aVar.mo26171c();
                    while (aVar.mo26177n()) {
                        mVar.mo19396o(aVar.mo26166D(), mo19209b(aVar));
                    }
                    aVar.mo26175k();
                    return mVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, C2528k kVar) {
            if (kVar == null || kVar.mo19387l()) {
                aVar.mo19434s();
            } else if (kVar.mo19389n()) {
                C2531n g = kVar.mo19385g();
                if (g.mo19399A()) {
                    aVar.mo19421P(g.mo19409w());
                } else if (g.mo19411y()) {
                    aVar.mo19423V(g.mo19404o());
                } else {
                    aVar.mo19422T(g.mo19410x());
                }
            } else if (kVar.mo19386j()) {
                aVar.mo19425d();
                Iterator<C2528k> it = kVar.mo19383b().iterator();
                while (it.hasNext()) {
                    mo19210d(aVar, it.next());
                }
                aVar.mo19428i();
            } else if (kVar.mo19388m()) {
                aVar.mo19426f();
                for (Map.Entry next : kVar.mo19384e().entrySet()) {
                    aVar.mo19433p((String) next.getKey());
                    mo19210d(aVar, (C2528k) next.getValue());
                }
                aVar.mo19429k();
            } else {
                throw new IllegalArgumentException("Couldn't write " + kVar.getClass());
            }
        }
    }

    /* renamed from: v1.n$v */
    static class C3801v extends C2534q<BitSet> {
        C3801v() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L_0x0069;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
            if (r8.mo26164A() != 0) goto L_0x0069;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x006e A[SYNTHETIC] */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.BitSet mo19209b(p122z1.C3929a r8) {
            /*
                r7 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.mo26170a()
                com.google.gson.stream.JsonToken r1 = r8.mo26169N()
                r2 = 0
                r3 = 0
            L_0x000e:
                com.google.gson.stream.JsonToken r4 = com.google.gson.stream.JsonToken.END_ARRAY
                if (r1 == r4) goto L_0x0075
                int[] r4 = p107v1.C3766n.C3773c0.f6386a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L_0x0063
                r6 = 2
                if (r4 == r6) goto L_0x005e
                r6 = 3
                if (r4 != r6) goto L_0x0047
                java.lang.String r1 = r8.mo26168I()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0030 }
                if (r1 == 0) goto L_0x002e
                goto L_0x0069
            L_0x002e:
                r5 = 0
                goto L_0x0069
            L_0x0030:
                com.google.gson.JsonSyntaxException r8 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>((java.lang.String) r0)
                throw r8
            L_0x0047:
                com.google.gson.JsonSyntaxException r8 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>((java.lang.String) r0)
                throw r8
            L_0x005e:
                boolean r5 = r8.mo26180v()
                goto L_0x0069
            L_0x0063:
                int r1 = r8.mo26164A()
                if (r1 == 0) goto L_0x002e
            L_0x0069:
                if (r5 == 0) goto L_0x006e
                r0.set(r3)
            L_0x006e:
                int r3 = r3 + 1
                com.google.gson.stream.JsonToken r1 = r8.mo26169N()
                goto L_0x000e
            L_0x0075:
                r8.mo26173i()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p107v1.C3766n.C3801v.mo19209b(z1.a):java.util.BitSet");
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, BitSet bitSet) {
            aVar.mo19425d();
            int length = bitSet.length();
            for (int i = 0; i < length; i++) {
                aVar.mo19419J(bitSet.get(i) ? 1 : 0);
            }
            aVar.mo19428i();
        }
    }

    /* renamed from: v1.n$w */
    static class C3802w implements C2536r {
        C3802w() {
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [y1.a, y1.a<T>] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <T> com.google.gson.C2534q<T> mo19368a(com.google.gson.C2469e r2, p119y1.C3918a<T> r3) {
            /*
                r1 = this;
                java.lang.Class<java.lang.Enum> r2 = java.lang.Enum.class
                java.lang.Class r3 = r3.mo26409c()
                boolean r0 = r2.isAssignableFrom(r3)
                if (r0 == 0) goto L_0x001f
                if (r3 != r2) goto L_0x000f
                goto L_0x001f
            L_0x000f:
                boolean r2 = r3.isEnum()
                if (r2 != 0) goto L_0x0019
                java.lang.Class r3 = r3.getSuperclass()
            L_0x0019:
                v1.n$k0 r2 = new v1.n$k0
                r2.<init>(r3)
                return r2
            L_0x001f:
                r2 = 0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p107v1.C3766n.C3802w.mo19368a(com.google.gson.e, y1.a):com.google.gson.q");
        }
    }

    /* renamed from: v1.n$x */
    static class C3803x implements C2536r {

        /* renamed from: a */
        final /* synthetic */ C3918a f6390a;

        /* renamed from: b */
        final /* synthetic */ C2534q f6391b;

        C3803x(C3918a aVar, C2534q qVar) {
            this.f6390a = aVar;
            this.f6391b = qVar;
        }

        /* renamed from: a */
        public <T> C2534q<T> mo19368a(C2469e eVar, C3918a<T> aVar) {
            if (aVar.equals(this.f6390a)) {
                return this.f6391b;
            }
            return null;
        }
    }

    /* renamed from: v1.n$y */
    static class C3804y implements C2536r {

        /* renamed from: a */
        final /* synthetic */ Class f6392a;

        /* renamed from: b */
        final /* synthetic */ C2534q f6393b;

        C3804y(Class cls, C2534q qVar) {
            this.f6392a = cls;
            this.f6393b = qVar;
        }

        /* renamed from: a */
        public <T> C2534q<T> mo19368a(C2469e eVar, C3918a<T> aVar) {
            if (aVar.mo26409c() == this.f6392a) {
                return this.f6393b;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f6392a.getName() + ",adapter=" + this.f6393b + "]";
        }
    }

    /* renamed from: v1.n$z */
    static class C3805z implements C2536r {

        /* renamed from: a */
        final /* synthetic */ Class f6394a;

        /* renamed from: b */
        final /* synthetic */ Class f6395b;

        /* renamed from: c */
        final /* synthetic */ C2534q f6396c;

        C3805z(Class cls, Class cls2, C2534q qVar) {
            this.f6394a = cls;
            this.f6395b = cls2;
            this.f6396c = qVar;
        }

        /* renamed from: a */
        public <T> C2534q<T> mo19368a(C2469e eVar, C3918a<T> aVar) {
            Class<? super T> c = aVar.mo26409c();
            if (c == this.f6394a || c == this.f6395b) {
                return this.f6396c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f6395b.getName() + Marker.ANY_NON_NULL_MARKER + this.f6394a.getName() + ",adapter=" + this.f6396c + "]";
        }
    }

    static {
        C2534q<Class> a = new C3788k().mo19413a();
        f6353a = a;
        f6354b = m10724a(Class.class, a);
        C2534q<BitSet> a2 = new C3801v().mo19413a();
        f6355c = a2;
        f6356d = m10724a(BitSet.class, a2);
        C3775d0 d0Var = new C3775d0();
        f6357e = d0Var;
        f6359g = m10725b(Boolean.TYPE, Boolean.class, d0Var);
        C3779f0 f0Var = new C3779f0();
        f6360h = f0Var;
        f6361i = m10725b(Byte.TYPE, Byte.class, f0Var);
        C3781g0 g0Var = new C3781g0();
        f6362j = g0Var;
        f6363k = m10725b(Short.TYPE, Short.class, g0Var);
        C3783h0 h0Var = new C3783h0();
        f6364l = h0Var;
        f6365m = m10725b(Integer.TYPE, Integer.class, h0Var);
        C2534q<AtomicInteger> a3 = new C3785i0().mo19413a();
        f6366n = a3;
        f6367o = m10724a(AtomicInteger.class, a3);
        C2534q<AtomicBoolean> a4 = new C3787j0().mo19413a();
        f6368p = a4;
        f6369q = m10724a(AtomicBoolean.class, a4);
        C2534q<AtomicIntegerArray> a5 = new C3767a().mo19413a();
        f6370r = a5;
        f6371s = m10724a(AtomicIntegerArray.class, a5);
        C3776e eVar = new C3776e();
        f6375w = eVar;
        f6376x = m10724a(Number.class, eVar);
        C3778f fVar = new C3778f();
        f6377y = fVar;
        f6378z = m10725b(Character.TYPE, Character.class, fVar);
        C3780g gVar = new C3780g();
        f6327A = gVar;
        f6330D = m10724a(String.class, gVar);
        C3786j jVar = new C3786j();
        f6331E = jVar;
        f6332F = m10724a(StringBuilder.class, jVar);
        C3790l lVar = new C3790l();
        f6333G = lVar;
        f6334H = m10724a(StringBuffer.class, lVar);
        C3791m mVar = new C3791m();
        f6335I = mVar;
        f6336J = m10724a(URL.class, mVar);
        C3792n nVar = new C3792n();
        f6337K = nVar;
        f6338L = m10724a(URI.class, nVar);
        C3793o oVar = new C3793o();
        f6339M = oVar;
        f6340N = m10728e(InetAddress.class, oVar);
        C3794p pVar = new C3794p();
        f6341O = pVar;
        f6342P = m10724a(UUID.class, pVar);
        C2534q<Currency> a6 = new C3795q().mo19413a();
        f6343Q = a6;
        f6344R = m10724a(Currency.class, a6);
        C3798s sVar = new C3798s();
        f6346T = sVar;
        f6347U = m10727d(Calendar.class, GregorianCalendar.class, sVar);
        C3799t tVar = new C3799t();
        f6348V = tVar;
        f6349W = m10724a(Locale.class, tVar);
        C3800u uVar = new C3800u();
        f6350X = uVar;
        f6351Y = m10728e(C2528k.class, uVar);
    }

    /* renamed from: a */
    public static <TT> C2536r m10724a(Class<TT> cls, C2534q<TT> qVar) {
        return new C3804y(cls, qVar);
    }

    /* renamed from: b */
    public static <TT> C2536r m10725b(Class<TT> cls, Class<TT> cls2, C2534q<? super TT> qVar) {
        return new C3805z(cls, cls2, qVar);
    }

    /* renamed from: c */
    public static <TT> C2536r m10726c(C3918a<TT> aVar, C2534q<TT> qVar) {
        return new C3803x(aVar, qVar);
    }

    /* renamed from: d */
    public static <TT> C2536r m10727d(Class<TT> cls, Class<? extends TT> cls2, C2534q<? super TT> qVar) {
        return new C3768a0(cls, cls2, qVar);
    }

    /* renamed from: e */
    public static <T1> C2536r m10728e(Class<T1> cls, C2534q<T1> qVar) {
        return new C3770b0(cls, qVar);
    }
}
