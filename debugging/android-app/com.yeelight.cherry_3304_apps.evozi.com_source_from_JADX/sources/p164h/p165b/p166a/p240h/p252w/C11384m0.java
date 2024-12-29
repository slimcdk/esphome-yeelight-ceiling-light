package p164h.p165b.p166a.p240h.p252w;

import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import java.util.logging.Logger;

/* renamed from: h.b.a.h.w.m0 */
public abstract class C11384m0 {

    /* renamed from: b */
    private static final Logger f22612b = Logger.getLogger(C11384m0.class.getName());

    /* renamed from: a */
    protected long f22613a;

    /* renamed from: h.b.a.h.w.m0$a */
    public enum C11385a {
        EIGHT(255),
        SIXTEEN(65535),
        TWENTYFOUR(16777215),
        THIRTYTWO(4294967295L);
        

        /* renamed from: a */
        private long f22619a;

        private C11385a(long j) {
            this.f22619a = j;
        }

        /* renamed from: a */
        public long mo36106a() {
            return this.f22619a;
        }
    }

    protected C11384m0() {
    }

    public C11384m0(long j) {
        mo36103f(j);
    }

    public C11384m0(String str) {
        if (str.startsWith(Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
            Logger logger = f22612b;
            logger.warning("Invalid negative integer value '" + str + "', assuming value 0!");
            str = TimerCodec.DISENABLE;
        }
        mo36103f(Long.parseLong(str.trim()));
    }

    /* renamed from: a */
    public abstract C11385a mo36067a();

    /* renamed from: b */
    public int mo36098b() {
        return 0;
    }

    /* renamed from: c */
    public Long mo36099c() {
        return Long.valueOf(this.f22613a);
    }

    /* renamed from: d */
    public C11384m0 mo36100d(boolean z) {
        long j = 1;
        if (this.f22613a + 1 > mo36067a().mo36106a()) {
            if (!z) {
                j = 0;
            }
            this.f22613a = j;
        } else {
            this.f22613a++;
        }
        return this;
    }

    /* renamed from: e */
    public void mo36101e(long j) {
        if (j < ((long) mo36098b()) || j > mo36067a().mo36106a()) {
            throw new NumberFormatException("Value must be between " + mo36098b() + " and " + mo36067a().mo36106a() + ": " + j);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f22613a == ((C11384m0) obj).f22613a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C11384m0 mo36103f(long j) {
        mo36101e(j);
        this.f22613a = j;
        return this;
    }

    public int hashCode() {
        long j = this.f22613a;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return Long.toString(this.f22613a);
    }
}
