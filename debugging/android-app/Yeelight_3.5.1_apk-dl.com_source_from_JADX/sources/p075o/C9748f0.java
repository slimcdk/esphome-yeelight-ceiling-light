package p075o;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import p075o.C3400m0;

/* renamed from: o.f0 */
public final /* synthetic */ class C9748f0 implements C3400m0.C3402b {

    /* renamed from: a */
    public final /* synthetic */ String f17585a;

    /* renamed from: b */
    public final /* synthetic */ LogEventDropped.Reason f17586b;

    /* renamed from: c */
    public final /* synthetic */ long f17587c;

    public /* synthetic */ C9748f0(String str, LogEventDropped.Reason reason, long j) {
        this.f17585a = str;
        this.f17586b = reason;
        this.f17587c = j;
    }

    public final Object apply(Object obj) {
        return C3400m0.m9337n1(this.f17585a, this.f17586b, this.f17587c, (SQLiteDatabase) obj);
    }
}
