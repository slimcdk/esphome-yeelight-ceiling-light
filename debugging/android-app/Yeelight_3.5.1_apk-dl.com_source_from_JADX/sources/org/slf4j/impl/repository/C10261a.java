package org.slf4j.impl.repository;

import com.google.code.microlog4android.Level;
import com.google.code.microlog4android.repository.C2186a;
import java.util.Hashtable;
import org.slf4j.impl.MicrologLoggerAdapter;
import p080p0.C3592a;

/* renamed from: org.slf4j.impl.repository.a */
public class C10261a extends C2186a {

    /* renamed from: b */
    private C10261a f19320b;

    /* renamed from: c */
    private Hashtable<String, C10261a> f19321c = new Hashtable<>(17);

    /* renamed from: d */
    private MicrologLoggerAdapter f19322d;

    public C10261a(String str, MicrologLoggerAdapter micrologLoggerAdapter) {
        this.f3480a = str;
        this.f19322d = micrologLoggerAdapter;
    }

    public C10261a(String str, MicrologLoggerAdapter micrologLoggerAdapter, C10261a aVar) {
        this.f3480a = str;
        this.f19322d = micrologLoggerAdapter;
        this.f19320b = aVar;
    }

    public C10261a(String str, C10261a aVar) {
        this.f3480a = str;
        this.f19320b = aVar;
        this.f19322d = new MicrologLoggerAdapter(new C3592a(str));
    }

    /* renamed from: b */
    public void mo41724b(C10261a aVar) {
        this.f19321c.put(aVar.mo18489a(), aVar);
    }

    /* renamed from: c */
    public C10261a mo41725c(String str) {
        return this.f19321c.get(str);
    }

    /* renamed from: d */
    public MicrologLoggerAdapter mo41726d() {
        return this.f19322d;
    }

    /* renamed from: e */
    public C10261a mo41727e() {
        return this.f19320b;
    }

    /* renamed from: f */
    public void mo41728f() {
        this.f19321c.clear();
        this.f19322d.getMicrologLogger().mo25881q();
        this.f19322d.getMicrologLogger().mo25884t(Level.DEBUG);
    }
}
