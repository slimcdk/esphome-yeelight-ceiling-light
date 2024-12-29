package com.yeelight.yeelib.device.base;

import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.models.C8308a;
import com.yeelight.yeelib.models.C8327s;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p237z3.C12142b;

/* renamed from: com.yeelight.yeelib.device.base.b */
public class C6092b {

    /* renamed from: a */
    private boolean f12496a;

    /* renamed from: b */
    private boolean f12497b;

    /* renamed from: c */
    private int f12498c;

    /* renamed from: d */
    private int f12499d;

    /* renamed from: e */
    private int f12500e;

    /* renamed from: f */
    private boolean f12501f;

    /* renamed from: g */
    private C8308a f12502g;

    /* renamed from: h */
    protected List<C12142b> f12503h = new CopyOnWriteArrayList();

    /* renamed from: i */
    private DeviceStatusBase.DeviceMode f12504i;

    /* renamed from: a */
    public int mo31662a() {
        return this.f12498c;
    }

    /* renamed from: b */
    public int mo31663b() {
        return this.f12500e;
    }

    /* renamed from: c */
    public int mo31664c() {
        return this.f12499d;
    }

    /* renamed from: d */
    public C8308a mo31665d() {
        return this.f12502g;
    }

    /* renamed from: e */
    public DeviceStatusBase.DeviceMode mo31666e() {
        return this.f12504i;
    }

    /* renamed from: f */
    public boolean mo31667f() {
        return this.f12497b;
    }

    /* renamed from: g */
    public boolean mo31668g() {
        return this.f12501f;
    }

    /* renamed from: h */
    public boolean mo31669h() {
        return this.f12496a;
    }

    /* renamed from: i */
    public void mo31670i(C12142b bVar) {
        if (!this.f12503h.contains(bVar)) {
            this.f12503h.add(bVar);
        }
    }

    /* renamed from: j */
    public void mo31671j(boolean z) {
        this.f12497b = z;
        for (C12142b p : this.f12503h) {
            p.mo30241p(z ? 2097152 : 4194304, this);
        }
    }

    /* renamed from: k */
    public void mo31672k(int i) {
        this.f12498c = i;
        mo31678q(DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE);
        for (C12142b p : this.f12503h) {
            p.mo30241p(8, this);
        }
    }

    /* renamed from: l */
    public void mo31673l(int i) {
        this.f12500e = i;
        mo31678q(DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR);
        for (C12142b p : this.f12503h) {
            p.mo30241p(16, this);
        }
    }

    /* renamed from: m */
    public void mo31674m(int i) {
        this.f12499d = i;
        mo31678q(DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE);
        for (C12142b p : this.f12503h) {
            p.mo30241p(32, this);
        }
    }

    /* renamed from: n */
    public void mo31675n(C8308a aVar) {
        this.f12502g = aVar;
        for (C12142b p : this.f12503h) {
            p.mo30241p(128, this);
        }
    }

    /* renamed from: o */
    public void mo31676o(boolean z) {
        this.f12501f = z;
        for (C12142b p : this.f12503h) {
            p.mo30241p(262144, this);
        }
    }

    /* renamed from: p */
    public void mo31677p(boolean z) {
        this.f12496a = z;
        for (C12142b p : this.f12503h) {
            p.mo30241p(z ? 524288 : 1048576, this);
        }
    }

    /* renamed from: q */
    public void mo31678q(DeviceStatusBase.DeviceMode deviceMode) {
        this.f12504i = deviceMode;
    }

    /* renamed from: r */
    public boolean mo31679r(C8327s sVar) {
        if (sVar.mo35458y()) {
            mo31672k(sVar.mo35439f());
            return false;
        } else if (sVar.mo35417B()) {
            mo31672k(sVar.mo35439f());
            mo31673l(sVar.mo35440g());
            return false;
        } else if (sVar.mo35419D()) {
            mo31672k(sVar.mo35439f());
            mo31674m(sVar.mo35441h());
            return false;
        } else if (!sVar.mo35455v()) {
            return true;
        } else {
            mo31675n(sVar.mo35436c());
            return false;
        }
    }

    /* renamed from: s */
    public void mo31680s(C12142b bVar) {
        if (bVar == null) {
            this.f12503h.clear();
        } else {
            this.f12503h.remove(bVar);
        }
    }
}
