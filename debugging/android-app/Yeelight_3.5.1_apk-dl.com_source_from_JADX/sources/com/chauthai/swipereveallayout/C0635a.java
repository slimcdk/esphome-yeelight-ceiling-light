package com.chauthai.swipereveallayout;

import com.chauthai.swipereveallayout.SwipeRevealLayout;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.chauthai.swipereveallayout.a */
public class C0635a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Map<String, Integer> f279a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b */
    private Map<String, SwipeRevealLayout> f280b = Collections.synchronizedMap(new HashMap());

    /* renamed from: c */
    private Set<String> f281c = Collections.synchronizedSet(new HashSet());
    /* access modifiers changed from: private */

    /* renamed from: d */
    public volatile boolean f282d = false;

    /* renamed from: e */
    private final Object f283e = new Object();

    /* renamed from: com.chauthai.swipereveallayout.a$a */
    class C0636a implements SwipeRevealLayout.C0633c {

        /* renamed from: a */
        final /* synthetic */ String f284a;

        /* renamed from: b */
        final /* synthetic */ SwipeRevealLayout f285b;

        C0636a(String str, SwipeRevealLayout swipeRevealLayout) {
            this.f284a = str;
            this.f285b = swipeRevealLayout;
        }

        public void onDragStateChanged(int i) {
            C0635a.this.f279a.put(this.f284a, Integer.valueOf(i));
            if (C0635a.this.f282d) {
                C0635a.this.m305f(this.f284a, this.f285b);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m305f(String str, SwipeRevealLayout swipeRevealLayout) {
        synchronized (this.f283e) {
            if (m306g() > 1) {
                for (Map.Entry next : this.f279a.entrySet()) {
                    if (!((String) next.getKey()).equals(str)) {
                        next.setValue(0);
                    }
                }
                for (SwipeRevealLayout next2 : this.f280b.values()) {
                    if (next2 != swipeRevealLayout) {
                        next2.mo11062B(true);
                    }
                }
            }
        }
    }

    /* renamed from: g */
    private int m306g() {
        int i = 0;
        for (Integer intValue : this.f279a.values()) {
            int intValue2 = intValue.intValue();
            if (intValue2 == 2 || intValue2 == 3) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: d */
    public void mo11087d(SwipeRevealLayout swipeRevealLayout, String str) {
        if (swipeRevealLayout.mo11065L()) {
            swipeRevealLayout.requestLayout();
        }
        this.f280b.values().remove(swipeRevealLayout);
        this.f280b.put(str, swipeRevealLayout);
        swipeRevealLayout.mo11066a();
        swipeRevealLayout.setDragStateChangeListener(new C0636a(str, swipeRevealLayout));
        if (!this.f279a.containsKey(str)) {
            this.f279a.put(str, 0);
        } else {
            int intValue = this.f279a.get(str).intValue();
            if (!(intValue == 0 || intValue == 1 || intValue == 4)) {
                swipeRevealLayout.mo11064I(false);
                swipeRevealLayout.setLockDrag(this.f281c.contains(str));
            }
        }
        swipeRevealLayout.mo11062B(false);
        swipeRevealLayout.setLockDrag(this.f281c.contains(str));
    }

    /* renamed from: e */
    public void mo11088e(String str) {
        synchronized (this.f283e) {
            this.f279a.put(str, 0);
            if (this.f280b.containsKey(str)) {
                this.f280b.get(str).mo11062B(true);
            }
        }
    }

    /* renamed from: h */
    public void mo11089h(boolean z) {
        this.f282d = z;
    }
}
