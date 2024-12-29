package p227x3;

import com.miot.common.device.firmware.MiotFirmware;

/* renamed from: x3.q */
public class C11981q extends C11969f {

    /* renamed from: b */
    private MiotFirmware f21881b;

    public C11981q(MiotFirmware miotFirmware) {
        this.f21881b = miotFirmware;
    }

    /* renamed from: l */
    private int m30718l(String str) {
        try {
            if (str.isEmpty()) {
                return 0;
            }
            if (str.contains("_")) {
                return Integer.parseInt(str.substring(str.lastIndexOf("_") + 1, str.length()));
            }
            String[] split = str.split("\\.");
            if (split.length > 0) {
                return Integer.parseInt(split[split.length - 1]);
            }
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public boolean mo42509a(int i) {
        return i == 0 || mo42510b() >= i;
    }

    /* renamed from: b */
    public int mo42510b() {
        return m30718l(mo42511c());
    }

    /* renamed from: c */
    public String mo42511c() {
        MiotFirmware miotFirmware = this.f21881b;
        return miotFirmware == null ? "" : miotFirmware.getCurrentVersion();
    }

    /* renamed from: d */
    public String mo42512d() {
        return this.f21881b.getLatestVersion();
    }

    /* renamed from: e */
    public int mo42523e() {
        MiotFirmware miotFirmware = this.f21881b;
        if (miotFirmware == null) {
            return 0;
        }
        return miotFirmware.getOtaProgress();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C11981q)) {
            return false;
        }
        C11981q qVar = (C11981q) obj;
        return qVar.mo42511c().equals(mo42511c()) && qVar.mo42512d().equals(mo42512d());
    }

    /* renamed from: f */
    public String mo42525f() {
        MiotFirmware miotFirmware = this.f21881b;
        return miotFirmware != null ? miotFirmware.getDescription() : "";
    }

    /* renamed from: g */
    public boolean mo42513g() {
        return m30718l(mo42511c()) < m30718l(mo42512d());
    }

    /* renamed from: h */
    public boolean mo42538h() {
        return this.f21881b.isUpgrading() || this.f21863a;
    }

    /* renamed from: i */
    public void mo42514i() {
    }

    /* renamed from: j */
    public void mo42526j(int i) {
        MiotFirmware miotFirmware = this.f21881b;
        if (miotFirmware != null) {
            miotFirmware.setOtaProgress(i);
        }
    }
}
