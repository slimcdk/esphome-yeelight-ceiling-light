package com.yeelight.yeelib.device.models;

import com.miot.common.device.firmware.MiotFirmware;

/* renamed from: com.yeelight.yeelib.device.models.n0 */
public class C7640n0 extends C7622g {

    /* renamed from: b */
    private MiotFirmware f15629b;

    public C7640n0(MiotFirmware miotFirmware) {
        this.f15629b = miotFirmware;
    }

    /* renamed from: l */
    private int m22555l(String str) {
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
    public boolean mo29038a(int i) {
        return i == 0 || mo29039b() >= i;
    }

    /* renamed from: b */
    public int mo29039b() {
        return m22555l(mo29040c());
    }

    /* renamed from: c */
    public String mo29040c() {
        MiotFirmware miotFirmware = this.f15629b;
        return miotFirmware == null ? "" : miotFirmware.getCurrentVersion();
    }

    /* renamed from: d */
    public String mo29041d() {
        return this.f15629b.getLatestVersion();
    }

    /* renamed from: e */
    public int mo29052e() {
        MiotFirmware miotFirmware = this.f15629b;
        if (miotFirmware == null) {
            return 0;
        }
        return miotFirmware.getOtaProgress();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C7640n0)) {
            return false;
        }
        C7640n0 n0Var = (C7640n0) obj;
        return n0Var.mo29040c().equals(mo29040c()) && n0Var.mo29041d().equals(mo29041d());
    }

    /* renamed from: f */
    public String mo29054f() {
        MiotFirmware miotFirmware = this.f15629b;
        return miotFirmware != null ? miotFirmware.getDescription() : "";
    }

    /* renamed from: g */
    public boolean mo29042g() {
        return m22555l(mo29040c()) < m22555l(mo29041d());
    }

    /* renamed from: h */
    public boolean mo29067h() {
        return this.f15629b.isUpgrading() || this.f15577a;
    }

    /* renamed from: i */
    public void mo29043i() {
    }

    /* renamed from: j */
    public void mo29055j(int i) {
        MiotFirmware miotFirmware = this.f15629b;
        if (miotFirmware != null) {
            miotFirmware.setOtaProgress(i);
        }
    }
}
