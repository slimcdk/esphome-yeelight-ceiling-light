package p075o;

import android.database.sqlite.SQLiteDatabase;
import java.util.Map;
import p047j.C3252a;
import p075o.C3400m0;

/* renamed from: o.p */
public final /* synthetic */ class C9760p implements C3400m0.C3402b {

    /* renamed from: a */
    public final /* synthetic */ C3400m0 f17606a;

    /* renamed from: b */
    public final /* synthetic */ String f17607b;

    /* renamed from: c */
    public final /* synthetic */ Map f17608c;

    /* renamed from: d */
    public final /* synthetic */ C3252a.C3253a f17609d;

    public /* synthetic */ C9760p(C3400m0 m0Var, String str, Map map, C3252a.C3253a aVar) {
        this.f17606a = m0Var;
        this.f17607b = str;
        this.f17608c = map;
        this.f17609d = aVar;
    }

    public final Object apply(Object obj) {
        return this.f17606a.m9318b1(this.f17607b, this.f17608c, this.f17609d, (SQLiteDatabase) obj);
    }
}
