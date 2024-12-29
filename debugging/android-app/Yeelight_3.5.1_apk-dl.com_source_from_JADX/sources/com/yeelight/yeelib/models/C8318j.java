package com.yeelight.yeelib.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.yeelight.yeelib.models.j */
public class C8318j {

    /* renamed from: a */
    private int f14290a;

    /* renamed from: b */
    private String f14291b;

    /* renamed from: c */
    private String f14292c;

    public C8318j() {
        this.f14290a = 0;
    }

    public C8318j(int i) {
        this.f14290a = i;
    }

    /* renamed from: a */
    public String mo35368a() {
        return this.f14291b;
    }

    /* renamed from: b */
    public String mo35369b() {
        return this.f14292c;
    }

    /* renamed from: c */
    public int mo35370c() {
        return this.f14290a;
    }

    /* renamed from: d */
    public void mo35371d(String str) {
        this.f14291b = str;
    }

    /* renamed from: e */
    public void mo35372e(String str) {
        this.f14292c = str;
        try {
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: f */
    public void mo35373f(long j) {
        if (this.f14292c == null) {
            this.f14292c = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(j));
        }
    }
}
