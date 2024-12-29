package com.chauthai.swipereveallayout;

import com.chauthai.swipereveallayout.SwipeRevealLayout;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.chauthai.swipereveallayout.a */
public class C1261a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Map<String, Integer> f2245a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b */
    private Map<String, SwipeRevealLayout> f2246b = Collections.synchronizedMap(new HashMap());

    /* renamed from: c */
    private Set<String> f2247c = Collections.synchronizedSet(new HashSet());
    /* access modifiers changed from: private */

    /* renamed from: d */
    public volatile boolean f2248d = false;

    /* renamed from: e */
    private final Object f2249e = new Object();

    /* renamed from: com.chauthai.swipereveallayout.a$a */
    class C1262a implements SwipeRevealLayout.C1259c {

        /* renamed from: a */
        final /* synthetic */ String f2250a;

        /* renamed from: b */
        final /* synthetic */ SwipeRevealLayout f2251b;

        C1262a(String str, SwipeRevealLayout swipeRevealLayout) {
            this.f2250a = str;
            this.f2251b = swipeRevealLayout;
        }

        public void onDragStateChanged(int i) {
            C1261a.this.f2245a.put(this.f2250a, Integer.valueOf(i));
            if (C1261a.this.f2248d) {
                C1261a.this.m3289f(this.f2250a, this.f2251b);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m3289f(String str, SwipeRevealLayout swipeRevealLayout) {
        synchronized (this.f2249e) {
            if (m3290g() > 1) {
                for (Map.Entry next : this.f2245a.entrySet()) {
                    if (!((String) next.getKey()).equals(str)) {
                        next.setValue(0);
                    }
                }
                for (SwipeRevealLayout next2 : this.f2246b.values()) {
                    if (next2 != swipeRevealLayout) {
                        next2.mo10084B(true);
                    }
                }
            }
        }
    }

    /* renamed from: g */
    private int m3290g() {
        int i = 0;
        for (Integer intValue : this.f2245a.values()) {
            int intValue2 = intValue.intValue();
            if (intValue2 == 2 || intValue2 == 3) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: d */
    public void mo10109d(SwipeRevealLayout swipeRevealLayout, String str) {
        if (swipeRevealLayout.mo10087L()) {
            swipeRevealLayout.requestLayout();
        }
        this.f2246b.values().remove(swipeRevealLayout);
        this.f2246b.put(str, swipeRevealLayout);
        swipeRevealLayout.mo10088a();
        swipeRevealLayout.setDragStateChangeListener(new C1262a(str, swipeRevealLayout));
        if (!this.f2245a.containsKey(str)) {
            this.f2245a.put(str, 0);
        } else {
            int intValue = this.f2245a.get(str).intValue();
            if (!(intValue == 0 || intValue == 1 || intValue == 4)) {
                swipeRevealLayout.mo10086I(false);
                swipeRevealLayout.setLockDrag(this.f2247c.contains(str));
            }
        }
        swipeRevealLayout.mo10084B(false);
        swipeRevealLayout.setLockDrag(this.f2247c.contains(str));
    }

    /* renamed from: e */
    public void mo10110e(String str) {
        synchronized (this.f2249e) {
            this.f2245a.put(str, 0);
            if (this.f2246b.containsKey(str)) {
                this.f2246b.get(str).mo10084B(true);
            }
        }
    }

    /* renamed from: h */
    public void mo10111h(boolean z) {
        this.f2248d = z;
    }
}
