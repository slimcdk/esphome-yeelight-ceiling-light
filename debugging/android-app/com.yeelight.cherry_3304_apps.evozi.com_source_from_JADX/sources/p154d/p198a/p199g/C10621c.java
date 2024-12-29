package p154d.p198a.p199g;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import p154d.p198a.p199g.p200r.C10677a;
import p154d.p198a.p199g.p200r.C10678b;
import p154d.p198a.p199g.p200r.C10680d;
import p154d.p198a.p199g.p200r.C10681e;

/* renamed from: d.a.g.c */
public final class C10621c extends C10625e {

    /* renamed from: l */
    private static Logger f20306l = Logger.getLogger(C10621c.class.getName());

    /* renamed from: m */
    public static boolean f20307m = true;

    /* renamed from: n */
    private static final char[] f20308n = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: h */
    private final DatagramPacket f20309h;

    /* renamed from: i */
    private final long f20310i;

    /* renamed from: j */
    private final C10623b f20311j;

    /* renamed from: k */
    private int f20312k;

    /* renamed from: d.a.g.c$a */
    static /* synthetic */ class C10622a {

        /* renamed from: a */
        static final /* synthetic */ int[] f20313a;

        /* renamed from: b */
        static final /* synthetic */ int[] f20314b;

        /* renamed from: c */
        static final /* synthetic */ int[] f20315c;

        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|(2:23|24)|25|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|41|42|43|44|45|46|48) */
        /* JADX WARNING: Can't wrap try/catch for region: R(39:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|41|42|43|44|45|46|48) */
        /* JADX WARNING: Can't wrap try/catch for region: R(41:0|1|2|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|37|39|40|41|42|43|44|45|46|48) */
        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|37|39|40|41|42|43|44|45|46|48) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0085 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x008f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00aa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00be */
        static {
            /*
                d.a.g.r.e[] r0 = p154d.p198a.p199g.p200r.C10681e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20315c = r0
                r1 = 1
                d.a.g.r.e r2 = p154d.p198a.p199g.p200r.C10681e.TYPE_A     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f20315c     // Catch:{ NoSuchFieldError -> 0x001d }
                d.a.g.r.e r3 = p154d.p198a.p199g.p200r.C10681e.TYPE_AAAA     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f20315c     // Catch:{ NoSuchFieldError -> 0x0028 }
                d.a.g.r.e r4 = p154d.p198a.p199g.p200r.C10681e.TYPE_CNAME     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f20315c     // Catch:{ NoSuchFieldError -> 0x0033 }
                d.a.g.r.e r5 = p154d.p198a.p199g.p200r.C10681e.TYPE_PTR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f20315c     // Catch:{ NoSuchFieldError -> 0x003e }
                d.a.g.r.e r6 = p154d.p198a.p199g.p200r.C10681e.TYPE_TXT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r5 = f20315c     // Catch:{ NoSuchFieldError -> 0x0049 }
                d.a.g.r.e r6 = p154d.p198a.p199g.p200r.C10681e.TYPE_SRV     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r7 = 6
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r5 = f20315c     // Catch:{ NoSuchFieldError -> 0x0054 }
                d.a.g.r.e r6 = p154d.p198a.p199g.p200r.C10681e.TYPE_HINFO     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7 = 7
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r5 = f20315c     // Catch:{ NoSuchFieldError -> 0x0060 }
                d.a.g.r.e r6 = p154d.p198a.p199g.p200r.C10681e.TYPE_OPT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r7 = 8
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                d.a.g.r.c[] r5 = p154d.p198a.p199g.p200r.C10679c.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f20314b = r5
                d.a.g.r.c r6 = p154d.p198a.p199g.p200r.C10679c.Owner     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                int[] r5 = f20314b     // Catch:{ NoSuchFieldError -> 0x007b }
                d.a.g.r.c r6 = p154d.p198a.p199g.p200r.C10679c.LLQ     // Catch:{ NoSuchFieldError -> 0x007b }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x007b }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x007b }
            L_0x007b:
                int[] r5 = f20314b     // Catch:{ NoSuchFieldError -> 0x0085 }
                d.a.g.r.c r6 = p154d.p198a.p199g.p200r.C10679c.NSID     // Catch:{ NoSuchFieldError -> 0x0085 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0085 }
                r5[r6] = r2     // Catch:{ NoSuchFieldError -> 0x0085 }
            L_0x0085:
                int[] r5 = f20314b     // Catch:{ NoSuchFieldError -> 0x008f }
                d.a.g.r.c r6 = p154d.p198a.p199g.p200r.C10679c.UL     // Catch:{ NoSuchFieldError -> 0x008f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r5[r6] = r3     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r5 = f20314b     // Catch:{ NoSuchFieldError -> 0x0099 }
                d.a.g.r.c r6 = p154d.p198a.p199g.p200r.C10679c.Unknown     // Catch:{ NoSuchFieldError -> 0x0099 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0099 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0099 }
            L_0x0099:
                d.a.g.r.b[] r4 = p154d.p198a.p199g.p200r.C10678b.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f20313a = r4
                d.a.g.r.b r5 = p154d.p198a.p199g.p200r.C10678b.Standard     // Catch:{ NoSuchFieldError -> 0x00aa }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x00aa }
            L_0x00aa:
                int[] r1 = f20313a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                d.a.g.r.b r4 = p154d.p198a.p199g.p200r.C10678b.Compressed     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f20313a     // Catch:{ NoSuchFieldError -> 0x00be }
                d.a.g.r.b r1 = p154d.p198a.p199g.p200r.C10678b.Extended     // Catch:{ NoSuchFieldError -> 0x00be }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00be }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00be }
            L_0x00be:
                int[] r0 = f20313a     // Catch:{ NoSuchFieldError -> 0x00c8 }
                d.a.g.r.b r1 = p154d.p198a.p199g.p200r.C10678b.Unknown     // Catch:{ NoSuchFieldError -> 0x00c8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c8 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x00c8 }
            L_0x00c8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p154d.p198a.p199g.C10621c.C10622a.<clinit>():void");
        }
    }

    /* renamed from: d.a.g.c$b */
    public static class C10623b extends ByteArrayInputStream {

        /* renamed from: b */
        private static Logger f20316b = Logger.getLogger(C10623b.class.getName());

        /* renamed from: a */
        final Map<Integer, String> f20317a;

        public C10623b(byte[] bArr, int i) {
            this(bArr, 0, i);
        }

        public C10623b(byte[] bArr, int i, int i2) {
            super(bArr, i, i2);
            this.f20317a = new HashMap();
        }

        /* renamed from: a */
        public byte[] mo33553a(int i) {
            byte[] bArr = new byte[i];
            read(bArr, 0, i);
            return bArr;
        }

        /* renamed from: b */
        public String mo33554b() {
            HashMap hashMap = new HashMap();
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            while (!z) {
                int read = read();
                if (read == 0) {
                    break;
                }
                int i = C10622a.f20313a[C10678b.m26372b(read).ordinal()];
                if (i == 1) {
                    int i2 = this.pos - 1;
                    String str = mo33556h(read) + ".";
                    sb.append(str);
                    for (StringBuilder append : hashMap.values()) {
                        append.append(str);
                    }
                    hashMap.put(Integer.valueOf(i2), new StringBuilder(str));
                } else if (i == 2) {
                    int c = (C10678b.m26373c(read) << 8) | read();
                    String str2 = this.f20317a.get(Integer.valueOf(c));
                    if (str2 == null) {
                        f20316b.severe("bad domain name: possible circular name detected. Bad offset: 0x" + Integer.toHexString(c) + " at 0x" + Integer.toHexString(this.pos - 2));
                        str2 = "";
                    }
                    sb.append(str2);
                    for (StringBuilder append2 : hashMap.values()) {
                        append2.append(str2);
                    }
                    z = true;
                } else if (i != 3) {
                    f20316b.severe("unsupported dns label type: '" + Integer.toHexString(read & 192) + "'");
                } else {
                    f20316b.severe("Extended label are not currently supported.");
                }
            }
            for (Integer num : hashMap.keySet()) {
                this.f20317a.put(num, ((StringBuilder) hashMap.get(num)).toString());
            }
            return sb.toString();
        }

        /* renamed from: g */
        public String mo33555g() {
            return mo33556h(read());
        }

        /* renamed from: h */
        public String mo33556h(int i) {
            int i2;
            int read;
            StringBuilder sb = new StringBuilder(i);
            int i3 = 0;
            while (i3 < i) {
                int read2 = read();
                switch (read2 >> 4) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        break;
                    case 12:
                    case 13:
                        i2 = (read2 & 31) << 6;
                        read = read() & 63;
                        break;
                    case 14:
                        read2 = ((read2 & 15) << 12) | ((read() & 63) << 6) | (read() & 63);
                        i3++;
                        break;
                    default:
                        i2 = (read2 & 63) << 4;
                        read = read() & 15;
                        break;
                }
                read2 = i2 | read;
                i3++;
                sb.append((char) read2);
                i3++;
            }
            return sb.toString();
        }

        /* renamed from: i */
        public int mo33557i() {
            return (read() << 8) | read();
        }

        public int readInt() {
            return (mo33557i() << 16) | mo33557i();
        }
    }

    private C10621c(int i, int i2, boolean z, DatagramPacket datagramPacket, long j) {
        super(i, i2, z);
        this.f20309h = datagramPacket;
        this.f20311j = new C10623b(datagramPacket.getData(), datagramPacket.getLength());
        this.f20310i = j;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10621c(DatagramPacket datagramPacket) {
        super(0, 0, datagramPacket.getPort() == C10677a.f20461a);
        this.f20309h = datagramPacket;
        InetAddress address = datagramPacket.getAddress();
        this.f20311j = new C10623b(datagramPacket.getData(), datagramPacket.getLength());
        this.f20310i = System.currentTimeMillis();
        this.f20312k = 1460;
        try {
            mo33578s(this.f20311j.mo33557i());
            mo33577r(this.f20311j.mo33557i());
            int i = this.f20311j.mo33557i();
            int i2 = this.f20311j.mo33557i();
            int i3 = this.f20311j.mo33557i();
            int i4 = this.f20311j.mo33557i();
            if (i > 0) {
                for (int i5 = 0; i5 < i; i5++) {
                    this.f20321d.add(m25983A());
                }
            }
            if (i2 > 0) {
                for (int i6 = 0; i6 < i2; i6++) {
                    C10637h z = m25985z(address);
                    if (z != null) {
                        this.f20322e.add(z);
                    }
                }
            }
            if (i3 > 0) {
                for (int i7 = 0; i7 < i3; i7++) {
                    C10637h z2 = m25985z(address);
                    if (z2 != null) {
                        this.f20323f.add(z2);
                    }
                }
            }
            if (i4 > 0) {
                for (int i8 = 0; i8 < i4; i8++) {
                    C10637h z3 = m25985z(address);
                    if (z3 != null) {
                        this.f20324g.add(z3);
                    }
                }
            }
        } catch (Exception e) {
            Logger logger = f20306l;
            Level level = Level.WARNING;
            logger.log(level, "DNSIncoming() dump " + mo33552y(true) + "\n exception ", e);
            IOException iOException = new IOException("DNSIncoming corrupted message");
            iOException.initCause(e);
            throw iOException;
        }
    }

    /* renamed from: A */
    private C10628g m25983A() {
        String b = this.f20311j.mo33554b();
        C10681e b2 = C10681e.m26380b(this.f20311j.mo33557i());
        if (b2 == C10681e.TYPE_IGNORE) {
            Logger logger = f20306l;
            Level level = Level.SEVERE;
            logger.log(level, "Could not find record type: " + mo33552y(true));
        }
        int i = this.f20311j.mo33557i();
        C10680d a = C10680d.m26377a(i);
        return C10628g.m26033A(b, b2, a, a.mo33825c(i));
    }

    /* renamed from: t */
    private String m25984t(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            byte b2 = b & 255;
            sb.append(f20308n[b2 / ParameterInitDefType.ExternalSamplerInit]);
            sb.append(f20308n[b2 % ParameterInitDefType.ExternalSamplerInit]);
        }
        return sb.toString();
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [d.a.g.h] */
    /* JADX WARNING: type inference failed for: r11v1 */
    /* JADX WARNING: type inference failed for: r11v7 */
    /* JADX WARNING: type inference failed for: r2v47, types: [d.a.g.h$c] */
    /* JADX WARNING: type inference failed for: r2v48, types: [d.a.g.h$d] */
    /* JADX WARNING: type inference failed for: r2v49, types: [d.a.g.h$e] */
    /* JADX WARNING: type inference failed for: r2v50, types: [d.a.g.h$g] */
    /* JADX WARNING: type inference failed for: r2v51, types: [d.a.g.h$b] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x00d0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x023f  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p154d.p198a.p199g.C10637h m25985z(java.net.InetAddress r23) {
        /*
            r22 = this;
            r0 = r22
            d.a.g.c$b r1 = r0.f20311j
            java.lang.String r3 = r1.mo33554b()
            d.a.g.c$b r1 = r0.f20311j
            int r1 = r1.mo33557i()
            d.a.g.r.e r1 = p154d.p198a.p199g.p200r.C10681e.m26380b(r1)
            d.a.g.r.e r2 = p154d.p198a.p199g.p200r.C10681e.TYPE_IGNORE
            java.lang.String r4 = "\n"
            r5 = 1
            if (r1 != r2) goto L_0x003b
            java.util.logging.Logger r2 = f20306l
            java.util.logging.Level r6 = java.util.logging.Level.SEVERE
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Could not find record type. domain: "
            r7.append(r8)
            r7.append(r3)
            r7.append(r4)
            java.lang.String r8 = r0.mo33552y(r5)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r2.log(r6, r7)
        L_0x003b:
            d.a.g.c$b r2 = r0.f20311j
            int r2 = r2.mo33557i()
            d.a.g.r.e r6 = p154d.p198a.p199g.p200r.C10681e.TYPE_OPT
            if (r1 != r6) goto L_0x0048
            d.a.g.r.d r6 = p154d.p198a.p199g.p200r.C10680d.CLASS_UNKNOWN
            goto L_0x004c
        L_0x0048:
            d.a.g.r.d r6 = p154d.p198a.p199g.p200r.C10680d.m26377a(r2)
        L_0x004c:
            d.a.g.r.d r7 = p154d.p198a.p199g.p200r.C10680d.CLASS_UNKNOWN
            if (r6 != r7) goto L_0x007e
            d.a.g.r.e r7 = p154d.p198a.p199g.p200r.C10681e.TYPE_OPT
            if (r1 == r7) goto L_0x007e
            java.util.logging.Logger r7 = f20306l
            java.util.logging.Level r8 = java.util.logging.Level.SEVERE
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Could not find record class. domain: "
            r9.append(r10)
            r9.append(r3)
            java.lang.String r10 = " type: "
            r9.append(r10)
            r9.append(r1)
            r9.append(r4)
            java.lang.String r4 = r0.mo33552y(r5)
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            r7.log(r8, r4)
        L_0x007e:
            boolean r7 = r6.mo33825c(r2)
            d.a.g.c$b r4 = r0.f20311j
            int r8 = r4.readInt()
            d.a.g.c$b r4 = r0.f20311j
            int r4 = r4.mo33557i()
            int[] r9 = p154d.p198a.p199g.C10621c.C10622a.f20315c
            int r10 = r1.ordinal()
            r9 = r9[r10]
            java.lang.String r10 = ""
            r12 = 0
            switch(r9) {
                case 1: goto L_0x0398;
                case 2: goto L_0x0387;
                case 3: goto L_0x034f;
                case 4: goto L_0x034f;
                case 5: goto L_0x033d;
                case 6: goto L_0x0309;
                case 7: goto L_0x02ce;
                case 8: goto L_0x00be;
                default: goto L_0x009c;
            }
        L_0x009c:
            java.util.logging.Logger r2 = f20306l
            java.util.logging.Level r3 = java.util.logging.Level.FINER
            boolean r2 = r2.isLoggable(r3)
            if (r2 == 0) goto L_0x03a9
            java.util.logging.Logger r2 = f20306l
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "DNSIncoming() unknown type:"
            r3.append(r5)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.finer(r1)
            goto L_0x03a9
        L_0x00be:
            int r1 = r22.mo33564e()
            d.a.g.r.f r1 = p154d.p198a.p199g.p200r.C10682f.m26382b(r1, r8)
            r3 = 16711680(0xff0000, float:2.3418052E-38)
            r3 = r3 & r8
            r4 = 16
            int r3 = r3 >> r4
            if (r3 != 0) goto L_0x02ac
            r0.f20312k = r2
        L_0x00d0:
            d.a.g.c$b r1 = r0.f20311j
            int r1 = r1.available()
            if (r1 <= 0) goto L_0x03af
            d.a.g.c$b r1 = r0.f20311j
            int r1 = r1.available()
            java.lang.String r2 = "There was a problem reading the OPT record. Ignoring."
            r3 = 2
            if (r1 < r3) goto L_0x02a3
            d.a.g.c$b r1 = r0.f20311j
            int r1 = r1.mo33557i()
            d.a.g.r.c r6 = p154d.p198a.p199g.p200r.C10679c.m26375b(r1)
            d.a.g.c$b r7 = r0.f20311j
            int r7 = r7.available()
            if (r7 < r3) goto L_0x02a3
            d.a.g.c$b r2 = r0.f20311j
            int r2 = r2.mo33557i()
            byte[] r7 = new byte[r12]
            d.a.g.c$b r8 = r0.f20311j
            int r8 = r8.available()
            if (r8 < r2) goto L_0x010b
            d.a.g.c$b r7 = r0.f20311j
            byte[] r7 = r7.mo33553a(r2)
        L_0x010b:
            int[] r2 = p154d.p198a.p199g.C10621c.C10622a.f20314b
            int r8 = r6.ordinal()
            r2 = r2[r8]
            r8 = 5
            r9 = 4
            r13 = 3
            if (r2 == r5) goto L_0x0174
            java.lang.String r14 = " data: "
            if (r2 == r3) goto L_0x0146
            if (r2 == r13) goto L_0x0146
            if (r2 == r9) goto L_0x0146
            if (r2 == r8) goto L_0x0123
            goto L_0x00d0
        L_0x0123:
            java.util.logging.Logger r2 = f20306l
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "There was an OPT answer. Not currently handled. Option code: "
            r6.append(r8)
            r6.append(r1)
            r6.append(r14)
            java.lang.String r1 = r0.m25984t(r7)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            r2.log(r3, r1)
            goto L_0x00d0
        L_0x0146:
            java.util.logging.Logger r1 = f20306l
            java.util.logging.Level r2 = java.util.logging.Level.FINE
            boolean r1 = r1.isLoggable(r2)
            if (r1 == 0) goto L_0x00d0
            java.util.logging.Logger r1 = f20306l
            java.util.logging.Level r2 = java.util.logging.Level.FINE
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "There was an OPT answer. Option code: "
            r3.append(r8)
            r3.append(r6)
            r3.append(r14)
            java.lang.String r6 = r0.m25984t(r7)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            r1.log(r2, r3)
            goto L_0x00d0
        L_0x0174:
            byte r1 = r7[r12]     // Catch:{ Exception -> 0x0216 }
            byte r2 = r7[r5]     // Catch:{ Exception -> 0x0217 }
            r6 = 6
            byte[] r14 = new byte[r6]     // Catch:{ Exception -> 0x0218 }
            byte r15 = r7[r3]     // Catch:{ Exception -> 0x0218 }
            r14[r12] = r15     // Catch:{ Exception -> 0x0218 }
            byte r15 = r7[r13]     // Catch:{ Exception -> 0x0218 }
            r14[r5] = r15     // Catch:{ Exception -> 0x0218 }
            byte r15 = r7[r9]     // Catch:{ Exception -> 0x0218 }
            r14[r3] = r15     // Catch:{ Exception -> 0x0218 }
            byte r15 = r7[r8]     // Catch:{ Exception -> 0x0218 }
            r14[r13] = r15     // Catch:{ Exception -> 0x0218 }
            byte r15 = r7[r6]     // Catch:{ Exception -> 0x0218 }
            r14[r9] = r15     // Catch:{ Exception -> 0x0218 }
            r15 = 7
            byte r16 = r7[r15]     // Catch:{ Exception -> 0x0218 }
            r14[r8] = r16     // Catch:{ Exception -> 0x0218 }
            int r11 = r7.length     // Catch:{ Exception -> 0x0213 }
            r15 = 8
            if (r11 <= r15) goto L_0x01be
            byte[] r11 = new byte[r6]     // Catch:{ Exception -> 0x0213 }
            byte r17 = r7[r15]     // Catch:{ Exception -> 0x0213 }
            r11[r12] = r17     // Catch:{ Exception -> 0x0213 }
            r17 = 9
            byte r17 = r7[r17]     // Catch:{ Exception -> 0x0213 }
            r11[r5] = r17     // Catch:{ Exception -> 0x0213 }
            r17 = 10
            byte r17 = r7[r17]     // Catch:{ Exception -> 0x0213 }
            r11[r3] = r17     // Catch:{ Exception -> 0x0213 }
            r17 = 11
            byte r17 = r7[r17]     // Catch:{ Exception -> 0x0213 }
            r11[r13] = r17     // Catch:{ Exception -> 0x0213 }
            r17 = 12
            byte r17 = r7[r17]     // Catch:{ Exception -> 0x0213 }
            r11[r9] = r17     // Catch:{ Exception -> 0x0213 }
            r17 = 13
            byte r17 = r7[r17]     // Catch:{ Exception -> 0x0213 }
            r11[r8] = r17     // Catch:{ Exception -> 0x0213 }
            goto L_0x01bf
        L_0x01be:
            r11 = r14
        L_0x01bf:
            int r6 = r7.length     // Catch:{ Exception -> 0x0214 }
            r18 = 17
            r19 = 15
            r20 = 14
            r8 = 18
            if (r6 != r8) goto L_0x01dd
            byte[] r6 = new byte[r9]     // Catch:{ Exception -> 0x0214 }
            byte r21 = r7[r20]     // Catch:{ Exception -> 0x0214 }
            r6[r12] = r21     // Catch:{ Exception -> 0x0214 }
            byte r21 = r7[r19]     // Catch:{ Exception -> 0x0214 }
            r6[r5] = r21     // Catch:{ Exception -> 0x0214 }
            byte r21 = r7[r4]     // Catch:{ Exception -> 0x0214 }
            r6[r3] = r21     // Catch:{ Exception -> 0x0214 }
            byte r21 = r7[r18]     // Catch:{ Exception -> 0x0214 }
            r6[r13] = r21     // Catch:{ Exception -> 0x0214 }
            goto L_0x01de
        L_0x01dd:
            r6 = 0
        L_0x01de:
            int r9 = r7.length     // Catch:{ Exception -> 0x021b }
            r8 = 22
            if (r9 != r8) goto L_0x0235
            byte[] r8 = new byte[r15]     // Catch:{ Exception -> 0x021b }
            byte r9 = r7[r20]     // Catch:{ Exception -> 0x021b }
            r8[r12] = r9     // Catch:{ Exception -> 0x021b }
            byte r9 = r7[r19]     // Catch:{ Exception -> 0x021b }
            r8[r5] = r9     // Catch:{ Exception -> 0x021b }
            byte r9 = r7[r4]     // Catch:{ Exception -> 0x021b }
            r8[r3] = r9     // Catch:{ Exception -> 0x021b }
            byte r3 = r7[r18]     // Catch:{ Exception -> 0x021b }
            r8[r13] = r3     // Catch:{ Exception -> 0x021b }
            r3 = 18
            byte r3 = r7[r3]     // Catch:{ Exception -> 0x021b }
            r9 = 4
            r8[r9] = r3     // Catch:{ Exception -> 0x021b }
            r3 = 19
            byte r3 = r7[r3]     // Catch:{ Exception -> 0x021b }
            r9 = 5
            r8[r9] = r3     // Catch:{ Exception -> 0x021b }
            r3 = 20
            byte r3 = r7[r3]     // Catch:{ Exception -> 0x021b }
            r9 = 6
            r8[r9] = r3     // Catch:{ Exception -> 0x021b }
            r3 = 21
            byte r3 = r7[r3]     // Catch:{ Exception -> 0x021b }
            r9 = 7
            r8[r9] = r3     // Catch:{ Exception -> 0x021b }
            r6 = r8
            goto L_0x0235
        L_0x0213:
            r11 = r14
        L_0x0214:
            r6 = 0
            goto L_0x021b
        L_0x0216:
            r1 = 0
        L_0x0217:
            r2 = 0
        L_0x0218:
            r6 = 0
            r11 = 0
            r14 = 0
        L_0x021b:
            java.util.logging.Logger r3 = f20306l
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Malformed OPT answer. Option code: Owner data: "
            r8.append(r9)
            java.lang.String r7 = r0.m25984t(r7)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r3.warning(r7)
        L_0x0235:
            java.util.logging.Logger r3 = f20306l
            java.util.logging.Level r7 = java.util.logging.Level.FINE
            boolean r3 = r3.isLoggable(r7)
            if (r3 == 0) goto L_0x00d0
            java.util.logging.Logger r3 = f20306l
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Unhandled Owner OPT version: "
            r7.append(r8)
            r7.append(r1)
            java.lang.String r1 = " sequence: "
            r7.append(r1)
            r7.append(r2)
            java.lang.String r1 = " MAC address: "
            r7.append(r1)
            java.lang.String r1 = r0.m25984t(r14)
            r7.append(r1)
            if (r11 == r14) goto L_0x027a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " wakeup MAC address: "
            r1.append(r2)
            java.lang.String r2 = r0.m25984t(r11)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L_0x027b
        L_0x027a:
            r1 = r10
        L_0x027b:
            r7.append(r1)
            if (r6 == 0) goto L_0x0296
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " password: "
            r1.append(r2)
            java.lang.String r2 = r0.m25984t(r6)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L_0x0297
        L_0x0296:
            r1 = r10
        L_0x0297:
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            r3.fine(r1)
            goto L_0x00d0
        L_0x02a3:
            java.util.logging.Logger r1 = f20306l
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            r1.log(r3, r2)
            goto L_0x03af
        L_0x02ac:
            java.util.logging.Logger r2 = f20306l
            java.util.logging.Level r4 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "There was an OPT answer. Wrong version number: "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = " result code: "
            r5.append(r3)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r2.log(r4, r1)
            goto L_0x03af
        L_0x02ce:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            d.a.g.c$b r2 = r0.f20311j
            java.lang.String r2 = r2.mo33556h(r4)
            r1.append(r2)
            java.lang.String r2 = " "
            int r2 = r1.indexOf(r2)
            if (r2 <= 0) goto L_0x02e9
            java.lang.String r4 = r1.substring(r12, r2)
            goto L_0x02ed
        L_0x02e9:
            java.lang.String r4 = r1.toString()
        L_0x02ed:
            java.lang.String r9 = r4.trim()
            if (r2 <= 0) goto L_0x02f8
            int r2 = r2 + r5
            java.lang.String r10 = r1.substring(r2)
        L_0x02f8:
            java.lang.String r1 = r10.trim()
            d.a.g.h$b r11 = new d.a.g.h$b
            r2 = r11
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r9
            r8 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x03b0
        L_0x0309:
            d.a.g.c$b r1 = r0.f20311j
            int r1 = r1.mo33557i()
            d.a.g.c$b r2 = r0.f20311j
            int r9 = r2.mo33557i()
            d.a.g.c$b r2 = r0.f20311j
            int r10 = r2.mo33557i()
            boolean r2 = f20307m
            if (r2 == 0) goto L_0x0326
            d.a.g.c$b r2 = r0.f20311j
            java.lang.String r2 = r2.mo33554b()
            goto L_0x032c
        L_0x0326:
            d.a.g.c$b r2 = r0.f20311j
            java.lang.String r2 = r2.mo33555g()
        L_0x032c:
            r11 = r2
            d.a.g.h$f r12 = new d.a.g.h$f
            r2 = r12
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r1
            r8 = r9
            r9 = r10
            r10 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r11 = r12
            goto L_0x03b0
        L_0x033d:
            d.a.g.h$g r11 = new d.a.g.h$g
            d.a.g.c$b r1 = r0.f20311j
            byte[] r1 = r1.mo33553a(r4)
            r2 = r11
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x03b0
        L_0x034f:
            d.a.g.c$b r1 = r0.f20311j
            java.lang.String r1 = r1.mo33554b()
            int r2 = r1.length()
            if (r2 <= 0) goto L_0x0366
            d.a.g.h$e r11 = new d.a.g.h$e
            r2 = r11
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x03b0
        L_0x0366:
            java.util.logging.Logger r1 = f20306l
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "PTR record of class: "
            r4.append(r5)
            r4.append(r6)
            java.lang.String r5 = ", there was a problem reading the service name of the answer for domain:"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r1.log(r2, r3)
            goto L_0x03af
        L_0x0387:
            d.a.g.h$d r11 = new d.a.g.h$d
            d.a.g.c$b r1 = r0.f20311j
            byte[] r1 = r1.mo33553a(r4)
            r2 = r11
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r1
            r2.<init>((java.lang.String) r3, (p154d.p198a.p199g.p200r.C10680d) r4, (boolean) r5, (int) r6, (byte[]) r7)
            goto L_0x03b0
        L_0x0398:
            d.a.g.h$c r11 = new d.a.g.h$c
            d.a.g.c$b r1 = r0.f20311j
            byte[] r1 = r1.mo33553a(r4)
            r2 = r11
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r1
            r2.<init>((java.lang.String) r3, (p154d.p198a.p199g.p200r.C10680d) r4, (boolean) r5, (int) r6, (byte[]) r7)
            goto L_0x03b0
        L_0x03a9:
            d.a.g.c$b r1 = r0.f20311j
            long r2 = (long) r4
            r1.skip(r2)
        L_0x03af:
            r11 = 0
        L_0x03b0:
            if (r11 == 0) goto L_0x03b7
            r1 = r23
            r11.mo33610K(r1)
        L_0x03b7:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p154d.p198a.p199g.C10621c.m25985z(java.net.InetAddress):d.a.g.h");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo33573n() ? "dns[query," : "dns[response,");
        if (this.f20309h.getAddress() != null) {
            sb.append(this.f20309h.getAddress().getHostAddress());
        }
        sb.append(':');
        sb.append(this.f20309h.getPort());
        sb.append(", length=");
        sb.append(this.f20309h.getLength());
        sb.append(", id=0x");
        sb.append(Integer.toHexString(mo33565f()));
        if (mo33564e() != 0) {
            sb.append(", flags=0x");
            sb.append(Integer.toHexString(mo33564e()));
            if ((mo33564e() & 32768) != 0) {
                sb.append(":r");
            }
            if ((mo33564e() & 1024) != 0) {
                sb.append(":aa");
            }
            if ((mo33564e() & 512) != 0) {
                sb.append(":tc");
            }
        }
        if (mo33569j() > 0) {
            sb.append(", questions=");
            sb.append(mo33569j());
        }
        if (mo33567h() > 0) {
            sb.append(", answers=");
            sb.append(mo33567h());
        }
        if (mo33568i() > 0) {
            sb.append(", authorities=");
            sb.append(mo33568i());
        }
        if (mo33566g() > 0) {
            sb.append(", additionals=");
            sb.append(mo33566g());
        }
        if (mo33569j() > 0) {
            sb.append("\nquestions:");
            for (C10628g append : this.f20321d) {
                sb.append("\n\t");
                sb.append(append);
            }
        }
        if (mo33567h() > 0) {
            sb.append("\nanswers:");
            for (C10637h append2 : this.f20322e) {
                sb.append("\n\t");
                sb.append(append2);
            }
        }
        if (mo33568i() > 0) {
            sb.append("\nauthorities:");
            for (C10637h append3 : this.f20323f) {
                sb.append("\n\t");
                sb.append(append3);
            }
        }
        if (mo33566g() > 0) {
            sb.append("\nadditionals:");
            for (C10637h append4 : this.f20324g) {
                sb.append("\n\t");
                sb.append(append4);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo33548u(C10621c cVar) {
        if (!mo33573n() || !mo33574o() || !cVar.mo33573n()) {
            throw new IllegalArgumentException();
        }
        this.f20321d.addAll(cVar.mo33570k());
        this.f20322e.addAll(cVar.mo33562c());
        this.f20323f.addAll(cVar.mo33563d());
        this.f20324g.addAll(cVar.mo33560a());
    }

    /* renamed from: v */
    public C10621c clone() {
        C10621c cVar = new C10621c(mo33564e(), mo33565f(), mo33572m(), this.f20309h, this.f20310i);
        cVar.f20312k = this.f20312k;
        cVar.f20321d.addAll(this.f20321d);
        cVar.f20322e.addAll(this.f20322e);
        cVar.f20323f.addAll(this.f20323f);
        cVar.f20324g.addAll(this.f20324g);
        return cVar;
    }

    /* renamed from: w */
    public int mo33550w() {
        return (int) (System.currentTimeMillis() - this.f20310i);
    }

    /* renamed from: x */
    public int mo33551x() {
        return this.f20312k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public String mo33552y(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(mo33575p());
        if (z) {
            int length = this.f20309h.getLength();
            byte[] bArr = new byte[length];
            System.arraycopy(this.f20309h.getData(), 0, bArr, 0, length);
            sb.append(mo33576q(bArr));
        }
        return sb.toString();
    }
}
