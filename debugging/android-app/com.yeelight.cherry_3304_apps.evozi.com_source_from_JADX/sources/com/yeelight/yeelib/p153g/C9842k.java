package com.yeelight.yeelib.p153g;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.yeelight.yeelib.g.k */
public class C9842k {

    /* renamed from: a */
    private int f17831a;

    /* renamed from: b */
    private String f17832b;

    /* renamed from: c */
    private String f17833c;

    public C9842k() {
        this.f17831a = 0;
    }

    public C9842k(int i) {
        this.f17831a = i;
    }

    /* renamed from: a */
    public String mo31781a() {
        return this.f17832b;
    }

    /* renamed from: b */
    public String mo31782b() {
        return this.f17833c;
    }

    /* renamed from: c */
    public int mo31783c() {
        return this.f17831a;
    }

    /* renamed from: d */
    public void mo31784d(String str) {
        this.f17832b = str;
    }

    /* renamed from: e */
    public void mo31785e(String str) {
        this.f17833c = str;
        try {
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: f */
    public void mo31786f(long j) {
        if (this.f17833c == null) {
            this.f17833c = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(j));
        }
    }
}
