package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import com.miot.service.connection.wifi.step.SmartConfigStep;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import p049j1.C3265b;
import p049j1.C3268c;
import p049j1.C3269d;
import p049j1.C3270e;

/* renamed from: com.google.firebase.encoders.proto.d */
final class C2416d implements C3269d {

    /* renamed from: f */
    private static final Charset f4048f = Charset.forName("UTF-8");

    /* renamed from: g */
    private static final C3265b f4049g = C3265b.m8753a("key").mo23835b(AtProtobuf.m6419b().mo18998c(1).mo18997a()).mo23834a();

    /* renamed from: h */
    private static final C3265b f4050h = C3265b.m8753a("value").mo23835b(AtProtobuf.m6419b().mo18998c(2).mo18997a()).mo23834a();

    /* renamed from: i */
    private static final C3268c<Map.Entry<Object, Object>> f4051i = C2415c.f4047a;

    /* renamed from: a */
    private OutputStream f4052a;

    /* renamed from: b */
    private final Map<Class<?>, C3268c<?>> f4053b;

    /* renamed from: c */
    private final Map<Class<?>, C3270e<?>> f4054c;

    /* renamed from: d */
    private final C3268c<Object> f4055d;

    /* renamed from: e */
    private final C2421g f4056e = new C2421g(this);

    /* renamed from: com.google.firebase.encoders.proto.d$a */
    static /* synthetic */ class C2417a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4057a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.google.firebase.encoders.proto.Protobuf$IntEncoding[] r0 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4057a = r0
                com.google.firebase.encoders.proto.Protobuf$IntEncoding r1 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4057a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.encoders.proto.Protobuf$IntEncoding r1 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.SIGNED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4057a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.encoders.proto.Protobuf$IntEncoding r1 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.FIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.encoders.proto.C2416d.C2417a.<clinit>():void");
        }
    }

    C2416d(OutputStream outputStream, Map<Class<?>, C3268c<?>> map, Map<Class<?>, C3270e<?>> map2, C3268c<Object> cVar) {
        this.f4052a = outputStream;
        this.f4053b = map;
        this.f4054c = map2;
        this.f4055d = cVar;
    }

    /* renamed from: o */
    private static ByteBuffer m6425o(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: p */
    private <T> long m6426p(C3268c<T> cVar, T t) {
        OutputStream outputStream;
        C2413a aVar = new C2413a();
        try {
            outputStream = this.f4052a;
            this.f4052a = aVar;
            cVar.mo11147a(t, this);
            this.f4052a = outputStream;
            long a = aVar.mo19005a();
            aVar.close();
            return a;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: q */
    private <T> C2416d m6427q(C3268c<T> cVar, C3265b bVar, T t, boolean z) {
        long p = m6426p(cVar, t);
        if (z && p == 0) {
            return this;
        }
        m6432w((m6430u(bVar) << 3) | 2);
        m6433x(p);
        cVar.mo11147a(t, this);
        return this;
    }

    /* renamed from: r */
    private <T> C2416d m6428r(C3270e<T> eVar, C3265b bVar, T t, boolean z) {
        this.f4056e.mo19031d(bVar, z);
        eVar.mo23836a(t, this.f4056e);
        return this;
    }

    /* renamed from: t */
    private static Protobuf m6429t(C3265b bVar) {
        Protobuf protobuf = (Protobuf) bVar.mo23830c(Protobuf.class);
        if (protobuf != null) {
            return protobuf;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: u */
    private static int m6430u(C3265b bVar) {
        Protobuf protobuf = (Protobuf) bVar.mo23830c(Protobuf.class);
        if (protobuf != null) {
            return protobuf.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static /* synthetic */ void m6431v(Map.Entry entry, C3269d dVar) {
        dVar.mo19009a(f4049g, entry.getKey());
        dVar.mo19009a(f4050h, entry.getValue());
    }

    /* renamed from: w */
    private void m6432w(int i) {
        while (true) {
            int i2 = (((long) (i & -128)) > 0 ? 1 : (((long) (i & -128)) == 0 ? 0 : -1));
            OutputStream outputStream = this.f4052a;
            if (i2 != 0) {
                outputStream.write((i & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT) | 128);
                i >>>= 7;
            } else {
                outputStream.write(i & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT);
                return;
            }
        }
    }

    /* renamed from: x */
    private void m6433x(long j) {
        while (true) {
            int i = ((-128 & j) > 0 ? 1 : ((-128 & j) == 0 ? 0 : -1));
            OutputStream outputStream = this.f4052a;
            if (i != 0) {
                outputStream.write((((int) j) & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT) | 128);
                j >>>= 7;
            } else {
                outputStream.write(((int) j) & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT);
                return;
            }
        }
    }

    @NonNull
    /* renamed from: a */
    public C3269d mo19009a(@NonNull C3265b bVar, @Nullable Object obj) {
        return mo19021n(bVar, obj, true);
    }

    @NonNull
    /* renamed from: c */
    public C2416d mo19012e(@NonNull C3265b bVar, int i) {
        return mo19014g(bVar, i, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C2416d mo19014g(@NonNull C3265b bVar, int i, boolean z) {
        if (z && i == 0) {
            return this;
        }
        Protobuf t = m6429t(bVar);
        int i2 = C2417a.f4057a[t.intEncoding().ordinal()];
        if (i2 == 1) {
            m6432w(t.tag() << 3);
            m6432w(i);
        } else if (i2 == 2) {
            m6432w(t.tag() << 3);
            m6432w((i << 1) ^ (i >> 31));
        } else if (i2 == 3) {
            m6432w((t.tag() << 3) | 5);
            this.f4052a.write(m6425o(4).putInt(i).array());
        }
        return this;
    }

    @NonNull
    /* renamed from: h */
    public C2416d mo19011d(@NonNull C3265b bVar, long j) {
        return mo19016i(bVar, j, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C2416d mo19016i(@NonNull C3265b bVar, long j, boolean z) {
        if (z && j == 0) {
            return this;
        }
        Protobuf t = m6429t(bVar);
        int i = C2417a.f4057a[t.intEncoding().ordinal()];
        if (i == 1) {
            m6432w(t.tag() << 3);
            m6433x(j);
        } else if (i == 2) {
            m6432w(t.tag() << 3);
            m6433x((j >> 63) ^ (j << 1));
        } else if (i == 3) {
            m6432w((t.tag() << 3) | 1);
            this.f4052a.write(m6425o(8).putLong(j).array());
        }
        return this;
    }

    @NonNull
    /* renamed from: j */
    public C2416d mo19013f(@NonNull C3265b bVar, boolean z) {
        return mo19018k(bVar, z, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C2416d mo19018k(@NonNull C3265b bVar, boolean z, boolean z2) {
        return mo19014g(bVar, z ? 1 : 0, z2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C3269d mo19019l(@NonNull C3265b bVar, double d, boolean z) {
        if (z && d == 0.0d) {
            return this;
        }
        m6432w((m6430u(bVar) << 3) | 1);
        this.f4052a.write(m6425o(8).putDouble(d).array());
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public C3269d mo19020m(@NonNull C3265b bVar, float f, boolean z) {
        if (z && f == 0.0f) {
            return this;
        }
        m6432w((m6430u(bVar) << 3) | 5);
        this.f4052a.write(m6425o(4).putFloat(f).array());
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C3269d mo19021n(@NonNull C3265b bVar, @Nullable Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m6432w((m6430u(bVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f4048f);
            m6432w(bytes.length);
            this.f4052a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object n : (Collection) obj) {
                mo19021n(bVar, n, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry q : ((Map) obj).entrySet()) {
                m6427q(f4051i, bVar, q, false);
            }
            return this;
        } else if (obj instanceof Double) {
            return mo19019l(bVar, ((Double) obj).doubleValue(), z);
        } else {
            if (obj instanceof Float) {
                return mo19020m(bVar, ((Float) obj).floatValue(), z);
            }
            if (obj instanceof Number) {
                return mo19016i(bVar, ((Number) obj).longValue(), z);
            }
            if (obj instanceof Boolean) {
                return mo19018k(bVar, ((Boolean) obj).booleanValue(), z);
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z && bArr.length == 0) {
                    return this;
                }
                m6432w((m6430u(bVar) << 3) | 2);
                m6432w(bArr.length);
                this.f4052a.write(bArr);
                return this;
            }
            C3268c cVar = this.f4053b.get(obj.getClass());
            if (cVar != null) {
                return m6427q(cVar, bVar, obj, z);
            }
            C3270e eVar = this.f4054c.get(obj.getClass());
            return eVar != null ? m6428r(eVar, bVar, obj, z) : obj instanceof C2414b ? mo19012e(bVar, ((C2414b) obj).getNumber()) : obj instanceof Enum ? mo19012e(bVar, ((Enum) obj).ordinal()) : m6427q(this.f4055d, bVar, obj, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C2416d mo19022s(@Nullable Object obj) {
        if (obj == null) {
            return this;
        }
        C3268c cVar = this.f4053b.get(obj.getClass());
        if (cVar != null) {
            cVar.mo11147a(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }
}
