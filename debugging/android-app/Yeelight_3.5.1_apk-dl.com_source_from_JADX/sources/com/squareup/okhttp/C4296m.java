package com.squareup.okhttp;

import androidx.appcompat.widget.ActivityChooserView;
import com.squareup.okhttp.C4280e;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p123a3.C3949h;
import p231y2.C12033k;

/* renamed from: com.squareup.okhttp.m */
public final class C4296m {

    /* renamed from: a */
    private int f6985a = 64;

    /* renamed from: b */
    private int f6986b = 5;

    /* renamed from: c */
    private ExecutorService f6987c;

    /* renamed from: d */
    private final Deque<C4280e.C4283c> f6988d = new ArrayDeque();

    /* renamed from: e */
    private final Deque<C4280e.C4283c> f6989e = new ArrayDeque();

    /* renamed from: f */
    private final Deque<C4280e> f6990f = new ArrayDeque();

    /* renamed from: g */
    private void m11969g() {
        if (this.f6989e.size() < this.f6985a && !this.f6988d.isEmpty()) {
            Iterator<C4280e.C4283c> it = this.f6988d.iterator();
            while (it.hasNext()) {
                C4280e.C4283c next = it.next();
                if (m11970h(next) < this.f6986b) {
                    it.remove();
                    this.f6989e.add(next);
                    mo27922f().execute(next);
                }
                if (this.f6989e.size() >= this.f6985a) {
                    return;
                }
            }
        }
    }

    /* renamed from: h */
    private int m11970h(C4280e.C4283c cVar) {
        int i = 0;
        for (C4280e.C4283c k : this.f6989e) {
            if (k.mo27859k().equals(cVar.mo27859k())) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public synchronized void mo27917a(Object obj) {
        for (C4280e.C4283c next : this.f6988d) {
            if (C12033k.m31046f(obj, next.mo27860l())) {
                next.mo27857d();
            }
        }
        for (C4280e.C4283c next2 : this.f6989e) {
            if (C12033k.m31046f(obj, next2.mo27860l())) {
                next2.mo27858f().f6940c = true;
                C3949h hVar = next2.mo27858f().f6942e;
                if (hVar != null) {
                    hVar.mo26470l();
                }
            }
        }
        for (C4280e next3 : this.f6990f) {
            if (C12033k.m31046f(obj, next3.mo27855j())) {
                next3.mo27850d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo27918b(C4280e.C4283c cVar) {
        if (this.f6989e.size() >= this.f6985a || m11970h(cVar) >= this.f6986b) {
            this.f6988d.add(cVar);
        } else {
            this.f6989e.add(cVar);
            mo27922f().execute(cVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized void mo27919c(C4280e eVar) {
        this.f6990f.add(eVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void mo27920d(C4280e.C4283c cVar) {
        if (this.f6989e.remove(cVar)) {
            m11969g();
        } else {
            throw new AssertionError("AsyncCall wasn't running!");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized void mo27921e(C4280e eVar) {
        if (!this.f6990f.remove(eVar)) {
            throw new AssertionError("Call wasn't in-flight!");
        }
    }

    /* renamed from: f */
    public synchronized ExecutorService mo27922f() {
        if (this.f6987c == null) {
            this.f6987c = new ThreadPoolExecutor(0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 60, TimeUnit.SECONDS, new SynchronousQueue(), C12033k.m31057q("OkHttp Dispatcher", false));
        }
        return this.f6987c;
    }
}
