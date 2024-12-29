package org.fourthline.cling.model.types;

import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import java.util.logging.Logger;

public abstract class UnsignedVariableInteger {

    /* renamed from: b */
    private static final Logger f18601b = Logger.getLogger(UnsignedVariableInteger.class.getName());

    /* renamed from: a */
    protected long f18602a;

    public enum Bits {
        EIGHT(255),
        SIXTEEN(65535),
        TWENTYFOUR(16777215),
        THIRTYTWO(4294967295L);
        
        private long maxValue;

        private Bits(long j) {
            this.maxValue = j;
        }

        public long getMaxValue() {
            return this.maxValue;
        }
    }

    protected UnsignedVariableInteger() {
    }

    public UnsignedVariableInteger(long j) {
        mo40576f(j);
    }

    public UnsignedVariableInteger(String str) {
        if (str.startsWith(Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
            Logger logger = f18601b;
            logger.warning("Invalid negative integer value '" + str + "', assuming value 0!");
            str = TimerCodec.DISENABLE;
        }
        mo40576f(Long.parseLong(str.trim()));
    }

    /* renamed from: a */
    public abstract Bits mo40570a();

    /* renamed from: b */
    public int mo40571b() {
        return 0;
    }

    /* renamed from: c */
    public Long mo40572c() {
        return Long.valueOf(this.f18602a);
    }

    /* renamed from: d */
    public UnsignedVariableInteger mo40573d(boolean z) {
        long j = 1;
        if (this.f18602a + 1 > mo40570a().getMaxValue()) {
            if (!z) {
                j = 0;
            }
            this.f18602a = j;
        } else {
            this.f18602a++;
        }
        return this;
    }

    /* renamed from: e */
    public void mo40574e(long j) {
        if (j < ((long) mo40571b()) || j > mo40570a().getMaxValue()) {
            throw new NumberFormatException("Value must be between " + mo40571b() + " and " + mo40570a().getMaxValue() + ": " + j);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f18602a == ((UnsignedVariableInteger) obj).f18602a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public UnsignedVariableInteger mo40576f(long j) {
        mo40574e(j);
        this.f18602a = j;
        return this;
    }

    public int hashCode() {
        long j = this.f18602a;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return Long.toString(this.f18602a);
    }
}
