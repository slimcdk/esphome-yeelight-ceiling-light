package javax.jmdns.impl;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.impl.constants.C9245a;
import javax.jmdns.impl.constants.DNSLabel;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;

/* renamed from: javax.jmdns.impl.c */
public final class C9241c extends C9247e {

    /* renamed from: l */
    private static Logger f17130l = Logger.getLogger(C9241c.class.getName());

    /* renamed from: m */
    public static boolean f17131m = true;

    /* renamed from: n */
    private static final char[] f17132n = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: h */
    private final DatagramPacket f17133h;

    /* renamed from: i */
    private final long f17134i;

    /* renamed from: j */
    private final C9243b f17135j;

    /* renamed from: k */
    private int f17136k;

    /* renamed from: javax.jmdns.impl.c$a */
    static /* synthetic */ class C9242a {

        /* renamed from: a */
        static final /* synthetic */ int[] f17137a;

        /* renamed from: b */
        static final /* synthetic */ int[] f17138b;

        /* renamed from: c */
        static final /* synthetic */ int[] f17139c;

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
                javax.jmdns.impl.constants.DNSRecordType[] r0 = javax.jmdns.impl.constants.DNSRecordType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17139c = r0
                r1 = 1
                javax.jmdns.impl.constants.DNSRecordType r2 = javax.jmdns.impl.constants.DNSRecordType.TYPE_A     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f17139c     // Catch:{ NoSuchFieldError -> 0x001d }
                javax.jmdns.impl.constants.DNSRecordType r3 = javax.jmdns.impl.constants.DNSRecordType.TYPE_AAAA     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f17139c     // Catch:{ NoSuchFieldError -> 0x0028 }
                javax.jmdns.impl.constants.DNSRecordType r4 = javax.jmdns.impl.constants.DNSRecordType.TYPE_CNAME     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f17139c     // Catch:{ NoSuchFieldError -> 0x0033 }
                javax.jmdns.impl.constants.DNSRecordType r5 = javax.jmdns.impl.constants.DNSRecordType.TYPE_PTR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f17139c     // Catch:{ NoSuchFieldError -> 0x003e }
                javax.jmdns.impl.constants.DNSRecordType r6 = javax.jmdns.impl.constants.DNSRecordType.TYPE_TXT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r5 = f17139c     // Catch:{ NoSuchFieldError -> 0x0049 }
                javax.jmdns.impl.constants.DNSRecordType r6 = javax.jmdns.impl.constants.DNSRecordType.TYPE_SRV     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r7 = 6
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r5 = f17139c     // Catch:{ NoSuchFieldError -> 0x0054 }
                javax.jmdns.impl.constants.DNSRecordType r6 = javax.jmdns.impl.constants.DNSRecordType.TYPE_HINFO     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7 = 7
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r5 = f17139c     // Catch:{ NoSuchFieldError -> 0x0060 }
                javax.jmdns.impl.constants.DNSRecordType r6 = javax.jmdns.impl.constants.DNSRecordType.TYPE_OPT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r7 = 8
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                javax.jmdns.impl.constants.DNSOptionCode[] r5 = javax.jmdns.impl.constants.DNSOptionCode.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f17138b = r5
                javax.jmdns.impl.constants.DNSOptionCode r6 = javax.jmdns.impl.constants.DNSOptionCode.Owner     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                int[] r5 = f17138b     // Catch:{ NoSuchFieldError -> 0x007b }
                javax.jmdns.impl.constants.DNSOptionCode r6 = javax.jmdns.impl.constants.DNSOptionCode.LLQ     // Catch:{ NoSuchFieldError -> 0x007b }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x007b }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x007b }
            L_0x007b:
                int[] r5 = f17138b     // Catch:{ NoSuchFieldError -> 0x0085 }
                javax.jmdns.impl.constants.DNSOptionCode r6 = javax.jmdns.impl.constants.DNSOptionCode.NSID     // Catch:{ NoSuchFieldError -> 0x0085 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0085 }
                r5[r6] = r2     // Catch:{ NoSuchFieldError -> 0x0085 }
            L_0x0085:
                int[] r5 = f17138b     // Catch:{ NoSuchFieldError -> 0x008f }
                javax.jmdns.impl.constants.DNSOptionCode r6 = javax.jmdns.impl.constants.DNSOptionCode.UL     // Catch:{ NoSuchFieldError -> 0x008f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r5[r6] = r3     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r5 = f17138b     // Catch:{ NoSuchFieldError -> 0x0099 }
                javax.jmdns.impl.constants.DNSOptionCode r6 = javax.jmdns.impl.constants.DNSOptionCode.Unknown     // Catch:{ NoSuchFieldError -> 0x0099 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0099 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0099 }
            L_0x0099:
                javax.jmdns.impl.constants.DNSLabel[] r4 = javax.jmdns.impl.constants.DNSLabel.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f17137a = r4
                javax.jmdns.impl.constants.DNSLabel r5 = javax.jmdns.impl.constants.DNSLabel.Standard     // Catch:{ NoSuchFieldError -> 0x00aa }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x00aa }
            L_0x00aa:
                int[] r1 = f17137a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                javax.jmdns.impl.constants.DNSLabel r4 = javax.jmdns.impl.constants.DNSLabel.Compressed     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f17137a     // Catch:{ NoSuchFieldError -> 0x00be }
                javax.jmdns.impl.constants.DNSLabel r1 = javax.jmdns.impl.constants.DNSLabel.Extended     // Catch:{ NoSuchFieldError -> 0x00be }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00be }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00be }
            L_0x00be:
                int[] r0 = f17137a     // Catch:{ NoSuchFieldError -> 0x00c8 }
                javax.jmdns.impl.constants.DNSLabel r1 = javax.jmdns.impl.constants.DNSLabel.Unknown     // Catch:{ NoSuchFieldError -> 0x00c8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c8 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x00c8 }
            L_0x00c8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: javax.jmdns.impl.C9241c.C9242a.<clinit>():void");
        }
    }

    /* renamed from: javax.jmdns.impl.c$b */
    public static class C9243b extends ByteArrayInputStream {

        /* renamed from: b */
        private static Logger f17140b = Logger.getLogger(C9243b.class.getName());

        /* renamed from: a */
        final Map<Integer, String> f17141a;

        public C9243b(byte[] bArr, int i) {
            this(bArr, 0, i);
        }

        public C9243b(byte[] bArr, int i, int i2) {
            super(bArr, i, i2);
            this.f17141a = new HashMap();
        }

        /* renamed from: a */
        public byte[] mo37584a(int i) {
            byte[] bArr = new byte[i];
            read(bArr, 0, i);
            return bArr;
        }

        /* renamed from: c */
        public String mo37585c() {
            HashMap hashMap = new HashMap();
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            while (!z) {
                int read = read();
                if (read == 0) {
                    break;
                }
                int i = C9242a.f17137a[DNSLabel.labelForByte(read).ordinal()];
                if (i == 1) {
                    int i2 = this.pos - 1;
                    String str = mo37587f(read) + ".";
                    sb.append(str);
                    for (StringBuilder append : hashMap.values()) {
                        append.append(str);
                    }
                    hashMap.put(Integer.valueOf(i2), new StringBuilder(str));
                } else if (i == 2) {
                    int labelValue = (DNSLabel.labelValue(read) << 8) | read();
                    String str2 = this.f17141a.get(Integer.valueOf(labelValue));
                    if (str2 == null) {
                        f17140b.severe("bad domain name: possible circular name detected. Bad offset: 0x" + Integer.toHexString(labelValue) + " at 0x" + Integer.toHexString(this.pos - 2));
                        str2 = "";
                    }
                    sb.append(str2);
                    for (StringBuilder append2 : hashMap.values()) {
                        append2.append(str2);
                    }
                    z = true;
                } else if (i != 3) {
                    f17140b.severe("unsupported dns label type: '" + Integer.toHexString(read & 192) + "'");
                } else {
                    f17140b.severe("Extended label are not currently supported.");
                }
            }
            for (Integer num : hashMap.keySet()) {
                this.f17141a.put(num, ((StringBuilder) hashMap.get(num)).toString());
            }
            return sb.toString();
        }

        /* renamed from: d */
        public String mo37586d() {
            return mo37587f(read());
        }

        /* renamed from: f */
        public String mo37587f(int i) {
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

        /* renamed from: h */
        public int mo37588h() {
            return (read() << 8) | read();
        }

        public int readInt() {
            return (mo37588h() << 16) | mo37588h();
        }
    }

    private C9241c(int i, int i2, boolean z, DatagramPacket datagramPacket, long j) {
        super(i, i2, z);
        this.f17133h = datagramPacket;
        this.f17135j = new C9243b(datagramPacket.getData(), datagramPacket.getLength());
        this.f17134i = j;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9241c(DatagramPacket datagramPacket) {
        super(0, 0, datagramPacket.getPort() == C9245a.f17144a);
        this.f17133h = datagramPacket;
        InetAddress address = datagramPacket.getAddress();
        C9243b bVar = new C9243b(datagramPacket.getData(), datagramPacket.getLength());
        this.f17135j = bVar;
        this.f17134i = System.currentTimeMillis();
        this.f17136k = 1460;
        try {
            mo37637s(bVar.mo37588h());
            mo37636r(bVar.mo37588h());
            int h = bVar.mo37588h();
            int h2 = bVar.mo37588h();
            int h3 = bVar.mo37588h();
            int h4 = bVar.mo37588h();
            if (h > 0) {
                for (int i = 0; i < h; i++) {
                    this.f17148d.add(m22489A());
                }
            }
            if (h2 > 0) {
                for (int i2 = 0; i2 < h2; i2++) {
                    C9259h z = m22491z(address);
                    if (z != null) {
                        this.f17149e.add(z);
                    }
                }
            }
            if (h3 > 0) {
                for (int i3 = 0; i3 < h3; i3++) {
                    C9259h z2 = m22491z(address);
                    if (z2 != null) {
                        this.f17150f.add(z2);
                    }
                }
            }
            if (h4 > 0) {
                for (int i4 = 0; i4 < h4; i4++) {
                    C9259h z3 = m22491z(address);
                    if (z3 != null) {
                        this.f17151g.add(z3);
                    }
                }
            }
        } catch (Exception e) {
            Logger logger = f17130l;
            Level level = Level.WARNING;
            logger.log(level, "DNSIncoming() dump " + mo37583y(true) + "\n exception ", e);
            IOException iOException = new IOException("DNSIncoming corrupted message");
            iOException.initCause(e);
            throw iOException;
        }
    }

    /* renamed from: A */
    private C9250g m22489A() {
        String c = this.f17135j.mo37585c();
        DNSRecordType typeForIndex = DNSRecordType.typeForIndex(this.f17135j.mo37588h());
        if (typeForIndex == DNSRecordType.TYPE_IGNORE) {
            Logger logger = f17130l;
            Level level = Level.SEVERE;
            logger.log(level, "Could not find record type: " + mo37583y(true));
        }
        int h = this.f17135j.mo37588h();
        DNSRecordClass classForIndex = DNSRecordClass.classForIndex(h);
        return C9250g.m22539A(c, typeForIndex, classForIndex, classForIndex.isUnique(h));
    }

    /* renamed from: t */
    private String m22490t(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            byte b2 = b & 255;
            char[] cArr = f17132n;
            sb.append(cArr[b2 / ParameterInitDefType.ExternalSamplerInit]);
            sb.append(cArr[b2 % ParameterInitDefType.ExternalSamplerInit]);
        }
        return sb.toString();
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [javax.jmdns.impl.h] */
    /* JADX WARNING: type inference failed for: r11v1 */
    /* JADX WARNING: type inference failed for: r11v7 */
    /* JADX WARNING: type inference failed for: r2v46, types: [javax.jmdns.impl.h$c] */
    /* JADX WARNING: type inference failed for: r2v47, types: [javax.jmdns.impl.h$d] */
    /* JADX WARNING: type inference failed for: r2v48, types: [javax.jmdns.impl.h$e] */
    /* JADX WARNING: type inference failed for: r2v49, types: [javax.jmdns.impl.h$g] */
    /* JADX WARNING: type inference failed for: r2v50, types: [javax.jmdns.impl.h$b] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x00ce A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x023b  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private javax.jmdns.impl.C9259h m22491z(java.net.InetAddress r23) {
        /*
            r22 = this;
            r0 = r22
            javax.jmdns.impl.c$b r1 = r0.f17135j
            java.lang.String r3 = r1.mo37585c()
            javax.jmdns.impl.c$b r1 = r0.f17135j
            int r1 = r1.mo37588h()
            javax.jmdns.impl.constants.DNSRecordType r1 = javax.jmdns.impl.constants.DNSRecordType.typeForIndex(r1)
            javax.jmdns.impl.constants.DNSRecordType r2 = javax.jmdns.impl.constants.DNSRecordType.TYPE_IGNORE
            java.lang.String r4 = "\n"
            r5 = 1
            if (r1 != r2) goto L_0x003b
            java.util.logging.Logger r2 = f17130l
            java.util.logging.Level r6 = java.util.logging.Level.SEVERE
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Could not find record type. domain: "
            r7.append(r8)
            r7.append(r3)
            r7.append(r4)
            java.lang.String r8 = r0.mo37583y(r5)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r2.log(r6, r7)
        L_0x003b:
            javax.jmdns.impl.c$b r2 = r0.f17135j
            int r2 = r2.mo37588h()
            javax.jmdns.impl.constants.DNSRecordType r6 = javax.jmdns.impl.constants.DNSRecordType.TYPE_OPT
            if (r1 != r6) goto L_0x0048
            javax.jmdns.impl.constants.DNSRecordClass r7 = javax.jmdns.impl.constants.DNSRecordClass.CLASS_UNKNOWN
            goto L_0x004c
        L_0x0048:
            javax.jmdns.impl.constants.DNSRecordClass r7 = javax.jmdns.impl.constants.DNSRecordClass.classForIndex(r2)
        L_0x004c:
            javax.jmdns.impl.constants.DNSRecordClass r8 = javax.jmdns.impl.constants.DNSRecordClass.CLASS_UNKNOWN
            if (r7 != r8) goto L_0x007c
            if (r1 == r6) goto L_0x007c
            java.util.logging.Logger r6 = f17130l
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
            java.lang.String r4 = r0.mo37583y(r5)
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            r6.log(r8, r4)
        L_0x007c:
            boolean r6 = r7.isUnique(r2)
            javax.jmdns.impl.c$b r4 = r0.f17135j
            int r8 = r4.readInt()
            javax.jmdns.impl.c$b r4 = r0.f17135j
            int r4 = r4.mo37588h()
            int[] r9 = javax.jmdns.impl.C9241c.C9242a.f17139c
            int r10 = r1.ordinal()
            r9 = r9[r10]
            java.lang.String r10 = ""
            r12 = 0
            switch(r9) {
                case 1: goto L_0x0394;
                case 2: goto L_0x0383;
                case 3: goto L_0x034b;
                case 4: goto L_0x034b;
                case 5: goto L_0x0339;
                case 6: goto L_0x0305;
                case 7: goto L_0x02ca;
                case 8: goto L_0x00bc;
                default: goto L_0x009a;
            }
        L_0x009a:
            java.util.logging.Logger r2 = f17130l
            java.util.logging.Level r3 = java.util.logging.Level.FINER
            boolean r2 = r2.isLoggable(r3)
            if (r2 == 0) goto L_0x03a5
            java.util.logging.Logger r2 = f17130l
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "DNSIncoming() unknown type:"
            r3.append(r5)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.finer(r1)
            goto L_0x03a5
        L_0x00bc:
            int r1 = r22.mo37623e()
            javax.jmdns.impl.constants.DNSResultCode r1 = javax.jmdns.impl.constants.DNSResultCode.resultCodeForFlags(r1, r8)
            r3 = 16711680(0xff0000, float:2.3418052E-38)
            r3 = r3 & r8
            r4 = 16
            int r3 = r3 >> r4
            if (r3 != 0) goto L_0x02a8
            r0.f17136k = r2
        L_0x00ce:
            javax.jmdns.impl.c$b r1 = r0.f17135j
            int r1 = r1.available()
            if (r1 <= 0) goto L_0x03ab
            javax.jmdns.impl.c$b r1 = r0.f17135j
            int r1 = r1.available()
            java.lang.String r2 = "There was a problem reading the OPT record. Ignoring."
            r3 = 2
            if (r1 < r3) goto L_0x029f
            javax.jmdns.impl.c$b r1 = r0.f17135j
            int r1 = r1.mo37588h()
            javax.jmdns.impl.constants.DNSOptionCode r6 = javax.jmdns.impl.constants.DNSOptionCode.resultCodeForFlags(r1)
            javax.jmdns.impl.c$b r7 = r0.f17135j
            int r7 = r7.available()
            if (r7 < r3) goto L_0x029f
            javax.jmdns.impl.c$b r2 = r0.f17135j
            int r2 = r2.mo37588h()
            byte[] r7 = new byte[r12]
            javax.jmdns.impl.c$b r8 = r0.f17135j
            int r8 = r8.available()
            if (r8 < r2) goto L_0x0109
            javax.jmdns.impl.c$b r7 = r0.f17135j
            byte[] r7 = r7.mo37584a(r2)
        L_0x0109:
            int[] r2 = javax.jmdns.impl.C9241c.C9242a.f17138b
            int r8 = r6.ordinal()
            r2 = r2[r8]
            r8 = 5
            r9 = 4
            r13 = 3
            if (r2 == r5) goto L_0x0170
            java.lang.String r14 = " data: "
            if (r2 == r3) goto L_0x0144
            if (r2 == r13) goto L_0x0144
            if (r2 == r9) goto L_0x0144
            if (r2 == r8) goto L_0x0121
            goto L_0x00ce
        L_0x0121:
            java.util.logging.Logger r2 = f17130l
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "There was an OPT answer. Not currently handled. Option code: "
            r6.append(r8)
            r6.append(r1)
            r6.append(r14)
            java.lang.String r1 = r0.m22490t(r7)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            r2.log(r3, r1)
            goto L_0x00ce
        L_0x0144:
            java.util.logging.Logger r1 = f17130l
            java.util.logging.Level r2 = java.util.logging.Level.FINE
            boolean r1 = r1.isLoggable(r2)
            if (r1 == 0) goto L_0x00ce
            java.util.logging.Logger r1 = f17130l
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "There was an OPT answer. Option code: "
            r3.append(r8)
            r3.append(r6)
            r3.append(r14)
            java.lang.String r6 = r0.m22490t(r7)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            r1.log(r2, r3)
            goto L_0x00ce
        L_0x0170:
            byte r1 = r7[r12]     // Catch:{ Exception -> 0x0212 }
            byte r2 = r7[r5]     // Catch:{ Exception -> 0x0213 }
            r6 = 6
            byte[] r14 = new byte[r6]     // Catch:{ Exception -> 0x0214 }
            byte r15 = r7[r3]     // Catch:{ Exception -> 0x0214 }
            r14[r12] = r15     // Catch:{ Exception -> 0x0214 }
            byte r15 = r7[r13]     // Catch:{ Exception -> 0x0214 }
            r14[r5] = r15     // Catch:{ Exception -> 0x0214 }
            byte r15 = r7[r9]     // Catch:{ Exception -> 0x0214 }
            r14[r3] = r15     // Catch:{ Exception -> 0x0214 }
            byte r15 = r7[r8]     // Catch:{ Exception -> 0x0214 }
            r14[r13] = r15     // Catch:{ Exception -> 0x0214 }
            byte r15 = r7[r6]     // Catch:{ Exception -> 0x0214 }
            r14[r9] = r15     // Catch:{ Exception -> 0x0214 }
            r15 = 7
            byte r16 = r7[r15]     // Catch:{ Exception -> 0x0214 }
            r14[r8] = r16     // Catch:{ Exception -> 0x0214 }
            int r11 = r7.length     // Catch:{ Exception -> 0x020f }
            r15 = 8
            if (r11 <= r15) goto L_0x01ba
            byte[] r11 = new byte[r6]     // Catch:{ Exception -> 0x020f }
            byte r17 = r7[r15]     // Catch:{ Exception -> 0x020f }
            r11[r12] = r17     // Catch:{ Exception -> 0x020f }
            r17 = 9
            byte r17 = r7[r17]     // Catch:{ Exception -> 0x020f }
            r11[r5] = r17     // Catch:{ Exception -> 0x020f }
            r17 = 10
            byte r17 = r7[r17]     // Catch:{ Exception -> 0x020f }
            r11[r3] = r17     // Catch:{ Exception -> 0x020f }
            r17 = 11
            byte r17 = r7[r17]     // Catch:{ Exception -> 0x020f }
            r11[r13] = r17     // Catch:{ Exception -> 0x020f }
            r17 = 12
            byte r17 = r7[r17]     // Catch:{ Exception -> 0x020f }
            r11[r9] = r17     // Catch:{ Exception -> 0x020f }
            r17 = 13
            byte r17 = r7[r17]     // Catch:{ Exception -> 0x020f }
            r11[r8] = r17     // Catch:{ Exception -> 0x020f }
            goto L_0x01bb
        L_0x01ba:
            r11 = r14
        L_0x01bb:
            int r6 = r7.length     // Catch:{ Exception -> 0x0210 }
            r18 = 17
            r19 = 15
            r20 = 14
            r8 = 18
            if (r6 != r8) goto L_0x01d9
            byte[] r6 = new byte[r9]     // Catch:{ Exception -> 0x0210 }
            byte r21 = r7[r20]     // Catch:{ Exception -> 0x0210 }
            r6[r12] = r21     // Catch:{ Exception -> 0x0210 }
            byte r21 = r7[r19]     // Catch:{ Exception -> 0x0210 }
            r6[r5] = r21     // Catch:{ Exception -> 0x0210 }
            byte r21 = r7[r4]     // Catch:{ Exception -> 0x0210 }
            r6[r3] = r21     // Catch:{ Exception -> 0x0210 }
            byte r21 = r7[r18]     // Catch:{ Exception -> 0x0210 }
            r6[r13] = r21     // Catch:{ Exception -> 0x0210 }
            goto L_0x01da
        L_0x01d9:
            r6 = 0
        L_0x01da:
            int r9 = r7.length     // Catch:{ Exception -> 0x0217 }
            r8 = 22
            if (r9 != r8) goto L_0x0231
            byte[] r8 = new byte[r15]     // Catch:{ Exception -> 0x0217 }
            byte r9 = r7[r20]     // Catch:{ Exception -> 0x0217 }
            r8[r12] = r9     // Catch:{ Exception -> 0x0217 }
            byte r9 = r7[r19]     // Catch:{ Exception -> 0x0217 }
            r8[r5] = r9     // Catch:{ Exception -> 0x0217 }
            byte r9 = r7[r4]     // Catch:{ Exception -> 0x0217 }
            r8[r3] = r9     // Catch:{ Exception -> 0x0217 }
            byte r3 = r7[r18]     // Catch:{ Exception -> 0x0217 }
            r8[r13] = r3     // Catch:{ Exception -> 0x0217 }
            r3 = 18
            byte r3 = r7[r3]     // Catch:{ Exception -> 0x0217 }
            r9 = 4
            r8[r9] = r3     // Catch:{ Exception -> 0x0217 }
            r3 = 19
            byte r3 = r7[r3]     // Catch:{ Exception -> 0x0217 }
            r9 = 5
            r8[r9] = r3     // Catch:{ Exception -> 0x0217 }
            r3 = 20
            byte r3 = r7[r3]     // Catch:{ Exception -> 0x0217 }
            r9 = 6
            r8[r9] = r3     // Catch:{ Exception -> 0x0217 }
            r3 = 21
            byte r3 = r7[r3]     // Catch:{ Exception -> 0x0217 }
            r9 = 7
            r8[r9] = r3     // Catch:{ Exception -> 0x0217 }
            r6 = r8
            goto L_0x0231
        L_0x020f:
            r11 = r14
        L_0x0210:
            r6 = 0
            goto L_0x0217
        L_0x0212:
            r1 = 0
        L_0x0213:
            r2 = 0
        L_0x0214:
            r6 = 0
            r11 = 0
            r14 = 0
        L_0x0217:
            java.util.logging.Logger r3 = f17130l
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Malformed OPT answer. Option code: Owner data: "
            r8.append(r9)
            java.lang.String r7 = r0.m22490t(r7)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r3.warning(r7)
        L_0x0231:
            java.util.logging.Logger r3 = f17130l
            java.util.logging.Level r7 = java.util.logging.Level.FINE
            boolean r3 = r3.isLoggable(r7)
            if (r3 == 0) goto L_0x00ce
            java.util.logging.Logger r3 = f17130l
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
            java.lang.String r1 = r0.m22490t(r14)
            r7.append(r1)
            if (r11 == r14) goto L_0x0276
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " wakeup MAC address: "
            r1.append(r2)
            java.lang.String r2 = r0.m22490t(r11)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L_0x0277
        L_0x0276:
            r1 = r10
        L_0x0277:
            r7.append(r1)
            if (r6 == 0) goto L_0x0292
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " password: "
            r1.append(r2)
            java.lang.String r2 = r0.m22490t(r6)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L_0x0293
        L_0x0292:
            r1 = r10
        L_0x0293:
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            r3.fine(r1)
            goto L_0x00ce
        L_0x029f:
            java.util.logging.Logger r1 = f17130l
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            r1.log(r3, r2)
            goto L_0x03ab
        L_0x02a8:
            java.util.logging.Logger r2 = f17130l
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
            goto L_0x03ab
        L_0x02ca:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            javax.jmdns.impl.c$b r2 = r0.f17135j
            java.lang.String r2 = r2.mo37587f(r4)
            r1.append(r2)
            java.lang.String r2 = " "
            int r2 = r1.indexOf(r2)
            if (r2 <= 0) goto L_0x02e5
            java.lang.String r4 = r1.substring(r12, r2)
            goto L_0x02e9
        L_0x02e5:
            java.lang.String r4 = r1.toString()
        L_0x02e9:
            java.lang.String r9 = r4.trim()
            if (r2 <= 0) goto L_0x02f4
            int r2 = r2 + r5
            java.lang.String r10 = r1.substring(r2)
        L_0x02f4:
            java.lang.String r1 = r10.trim()
            javax.jmdns.impl.h$b r11 = new javax.jmdns.impl.h$b
            r2 = r11
            r4 = r7
            r5 = r6
            r6 = r8
            r7 = r9
            r8 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x03ac
        L_0x0305:
            javax.jmdns.impl.c$b r1 = r0.f17135j
            int r1 = r1.mo37588h()
            javax.jmdns.impl.c$b r2 = r0.f17135j
            int r9 = r2.mo37588h()
            javax.jmdns.impl.c$b r2 = r0.f17135j
            int r10 = r2.mo37588h()
            boolean r2 = f17131m
            if (r2 == 0) goto L_0x0322
            javax.jmdns.impl.c$b r2 = r0.f17135j
            java.lang.String r2 = r2.mo37585c()
            goto L_0x0328
        L_0x0322:
            javax.jmdns.impl.c$b r2 = r0.f17135j
            java.lang.String r2 = r2.mo37586d()
        L_0x0328:
            r11 = r2
            javax.jmdns.impl.h$f r12 = new javax.jmdns.impl.h$f
            r2 = r12
            r4 = r7
            r5 = r6
            r6 = r8
            r7 = r1
            r8 = r9
            r9 = r10
            r10 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r11 = r12
            goto L_0x03ac
        L_0x0339:
            javax.jmdns.impl.h$g r11 = new javax.jmdns.impl.h$g
            javax.jmdns.impl.c$b r1 = r0.f17135j
            byte[] r1 = r1.mo37584a(r4)
            r2 = r11
            r4 = r7
            r5 = r6
            r6 = r8
            r7 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x03ac
        L_0x034b:
            javax.jmdns.impl.c$b r1 = r0.f17135j
            java.lang.String r1 = r1.mo37585c()
            int r2 = r1.length()
            if (r2 <= 0) goto L_0x0362
            javax.jmdns.impl.h$e r11 = new javax.jmdns.impl.h$e
            r2 = r11
            r4 = r7
            r5 = r6
            r6 = r8
            r7 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x03ac
        L_0x0362:
            java.util.logging.Logger r1 = f17130l
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "PTR record of class: "
            r4.append(r5)
            r4.append(r7)
            java.lang.String r5 = ", there was a problem reading the service name of the answer for domain:"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r1.log(r2, r3)
            goto L_0x03ab
        L_0x0383:
            javax.jmdns.impl.h$d r11 = new javax.jmdns.impl.h$d
            javax.jmdns.impl.c$b r1 = r0.f17135j
            byte[] r1 = r1.mo37584a(r4)
            r2 = r11
            r4 = r7
            r5 = r6
            r6 = r8
            r7 = r1
            r2.<init>((java.lang.String) r3, (javax.jmdns.impl.constants.DNSRecordClass) r4, (boolean) r5, (int) r6, (byte[]) r7)
            goto L_0x03ac
        L_0x0394:
            javax.jmdns.impl.h$c r11 = new javax.jmdns.impl.h$c
            javax.jmdns.impl.c$b r1 = r0.f17135j
            byte[] r1 = r1.mo37584a(r4)
            r2 = r11
            r4 = r7
            r5 = r6
            r6 = r8
            r7 = r1
            r2.<init>((java.lang.String) r3, (javax.jmdns.impl.constants.DNSRecordClass) r4, (boolean) r5, (int) r6, (byte[]) r7)
            goto L_0x03ac
        L_0x03a5:
            javax.jmdns.impl.c$b r1 = r0.f17135j
            long r2 = (long) r4
            r1.skip(r2)
        L_0x03ab:
            r11 = 0
        L_0x03ac:
            if (r11 == 0) goto L_0x03b3
            r1 = r23
            r11.mo37670K(r1)
        L_0x03b3:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.jmdns.impl.C9241c.m22491z(java.net.InetAddress):javax.jmdns.impl.h");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo37632n() ? "dns[query," : "dns[response,");
        if (this.f17133h.getAddress() != null) {
            sb.append(this.f17133h.getAddress().getHostAddress());
        }
        sb.append(':');
        sb.append(this.f17133h.getPort());
        sb.append(", length=");
        sb.append(this.f17133h.getLength());
        sb.append(", id=0x");
        sb.append(Integer.toHexString(mo37624f()));
        if (mo37623e() != 0) {
            sb.append(", flags=0x");
            sb.append(Integer.toHexString(mo37623e()));
            if ((mo37623e() & 32768) != 0) {
                sb.append(":r");
            }
            if ((mo37623e() & 1024) != 0) {
                sb.append(":aa");
            }
            if ((mo37623e() & 512) != 0) {
                sb.append(":tc");
            }
        }
        if (mo37628j() > 0) {
            sb.append(", questions=");
            sb.append(mo37628j());
        }
        if (mo37626h() > 0) {
            sb.append(", answers=");
            sb.append(mo37626h());
        }
        if (mo37627i() > 0) {
            sb.append(", authorities=");
            sb.append(mo37627i());
        }
        if (mo37625g() > 0) {
            sb.append(", additionals=");
            sb.append(mo37625g());
        }
        if (mo37628j() > 0) {
            sb.append("\nquestions:");
            for (C9250g append : this.f17148d) {
                sb.append("\n\t");
                sb.append(append);
            }
        }
        if (mo37626h() > 0) {
            sb.append("\nanswers:");
            for (C9259h append2 : this.f17149e) {
                sb.append("\n\t");
                sb.append(append2);
            }
        }
        if (mo37627i() > 0) {
            sb.append("\nauthorities:");
            for (C9259h append3 : this.f17150f) {
                sb.append("\n\t");
                sb.append(append3);
            }
        }
        if (mo37625g() > 0) {
            sb.append("\nadditionals:");
            for (C9259h append4 : this.f17151g) {
                sb.append("\n\t");
                sb.append(append4);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo37579u(C9241c cVar) {
        if (!mo37632n() || !mo37633o() || !cVar.mo37632n()) {
            throw new IllegalArgumentException();
        }
        this.f17148d.addAll(cVar.mo37629k());
        this.f17149e.addAll(cVar.mo37621c());
        this.f17150f.addAll(cVar.mo37622d());
        this.f17151g.addAll(cVar.mo37619a());
    }

    /* renamed from: v */
    public C9241c clone() {
        C9241c cVar = new C9241c(mo37623e(), mo37624f(), mo37631m(), this.f17133h, this.f17134i);
        cVar.f17136k = this.f17136k;
        cVar.f17148d.addAll(this.f17148d);
        cVar.f17149e.addAll(this.f17149e);
        cVar.f17150f.addAll(this.f17150f);
        cVar.f17151g.addAll(this.f17151g);
        return cVar;
    }

    /* renamed from: w */
    public int mo37581w() {
        return (int) (System.currentTimeMillis() - this.f17134i);
    }

    /* renamed from: x */
    public int mo37582x() {
        return this.f17136k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public String mo37583y(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(mo37634p());
        if (z) {
            int length = this.f17133h.getLength();
            byte[] bArr = new byte[length];
            System.arraycopy(this.f17133h.getData(), 0, bArr, 0, length);
            sb.append(mo37635q(bArr));
        }
        return sb.toString();
    }
}
