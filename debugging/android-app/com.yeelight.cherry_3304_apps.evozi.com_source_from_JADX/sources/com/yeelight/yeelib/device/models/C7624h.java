package com.yeelight.yeelib.device.models;

import com.miot.service.manager.timer.TimerCodec;

/* renamed from: com.yeelight.yeelib.device.models.h */
public class C7624h extends C7622g {

    /* renamed from: b */
    private String f15578b = TimerCodec.DISENABLE;

    /* renamed from: c */
    private String f15579c;

    /* renamed from: d */
    private String f15580d = TimerCodec.DISENABLE;

    /* renamed from: e */
    private String f15581e = "";

    /* renamed from: f */
    private String f15582f = "";

    public C7624h(String str) {
        this.f15578b = str;
    }

    /* renamed from: m */
    private int m22512m(String str) {
        try {
            return Integer.parseInt(str.replace(".", ""));
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public boolean mo29038a(int i) {
        return mo29039b() >= i;
    }

    /* renamed from: b */
    public int mo29039b() {
        return m22512m(this.f15578b);
    }

    /* renamed from: c */
    public String mo29040c() {
        return this.f15578b;
    }

    /* renamed from: d */
    public String mo29041d() {
        return this.f15580d;
    }

    /* renamed from: e */
    public int mo29052e() {
        return 0;
    }

    /* renamed from: f */
    public String mo29054f() {
        return this.f15579c;
    }

    /* renamed from: g */
    public boolean mo29042g() {
        return mo29069l() > mo29039b();
    }

    /* renamed from: i */
    public void mo29043i() {
    }

    /* renamed from: j */
    public void mo29055j(int i) {
    }

    /* renamed from: l */
    public int mo29069l() {
        return m22512m(this.f15580d);
    }

    public String toString() {
        return "GingkoFirmware{mCurrentVersion='" + this.f15578b + '\'' + ", mReleaseNote='" + this.f15579c + '\'' + ", mLatestVersion='" + this.f15580d + '\'' + ", mLatestFileMd5='" + this.f15581e + '\'' + ", mLatestFileUrl='" + this.f15582f + '\'' + '}';
    }
}
