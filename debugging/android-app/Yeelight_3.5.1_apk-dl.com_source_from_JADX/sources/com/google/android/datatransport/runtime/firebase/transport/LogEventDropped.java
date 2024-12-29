package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.C2414b;
import com.google.firebase.encoders.proto.Protobuf;

public final class LogEventDropped {

    /* renamed from: a */
    private final long f437a;

    /* renamed from: b */
    private final Reason f438b;

    public enum Reason implements C2414b {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        
        private final int number_;

        private Reason(int i) {
            this.number_ = i;
        }

        public int getNumber() {
            return this.number_;
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$a */
    public static final class C0692a {

        /* renamed from: a */
        private long f439a = 0;

        /* renamed from: b */
        private Reason f440b = Reason.REASON_UNKNOWN;

        C0692a() {
        }

        /* renamed from: a */
        public LogEventDropped mo11247a() {
            return new LogEventDropped(this.f439a, this.f440b);
        }

        /* renamed from: b */
        public C0692a mo11248b(long j) {
            this.f439a = j;
            return this;
        }

        /* renamed from: c */
        public C0692a mo11249c(Reason reason) {
            this.f440b = reason;
            return this;
        }
    }

    static {
        new C0692a().mo11247a();
    }

    LogEventDropped(long j, Reason reason) {
        this.f437a = j;
        this.f438b = reason;
    }

    /* renamed from: c */
    public static C0692a m538c() {
        return new C0692a();
    }

    @Protobuf(tag = 1)
    /* renamed from: a */
    public long mo11244a() {
        return this.f437a;
    }

    @Protobuf(tag = 3)
    /* renamed from: b */
    public Reason mo11245b() {
        return this.f438b;
    }
}
