package com.yeelight.yeelib.data;

import android.database.Cursor;
import android.database.CursorWrapper;
import com.yeelight.yeelib.data.C7579c;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p152f.C4257w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/* renamed from: com.yeelight.yeelib.data.g */
public class C7601g extends CursorWrapper {

    /* renamed from: a */
    private Cursor f15456a;

    /* renamed from: b */
    private ArrayList<C7604c> f15457b = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public HashMap<String, C7603b> f15458c = new HashMap<>();

    /* renamed from: d */
    private int f15459d;

    /* renamed from: e */
    public Comparator<C7604c> f15460e;

    /* renamed from: com.yeelight.yeelib.data.g$a */
    class C7602a implements Comparator<C7604c> {
        C7602a() {
        }

        /* renamed from: a */
        public int compare(C7604c cVar, C7604c cVar2) {
            C7603b bVar = (C7603b) C7601g.this.f15458c.get(cVar.f15465a);
            C7603b bVar2 = (C7603b) C7601g.this.f15458c.get(cVar2.f15465a);
            if (bVar == null && bVar2 == null) {
                return 0;
            }
            if (bVar == null && bVar2 != null) {
                return 1;
            }
            if (bVar != null && bVar2 == null) {
                return -1;
            }
            int b = C7601g.this.mo29015b(bVar);
            int b2 = C7601g.this.mo29015b(bVar2);
            if (b != b2) {
                return b < b2 ? -1 : 1;
            }
            if ((!bVar.mo29027b() || bVar2.mo29027b()) && (bVar.mo29027b() || !bVar2.mo29027b())) {
                return 0;
            }
            return bVar.mo29027b() ? -1 : 1;
        }
    }

    /* renamed from: com.yeelight.yeelib.data.g$b */
    public static class C7603b {

        /* renamed from: a */
        private boolean f15462a = false;

        /* renamed from: b */
        private boolean f15463b = false;

        /* renamed from: c */
        private boolean f15464c = false;

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
            if (r4.mo23420r0() == false) goto L_0x004b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
            if (r4.mo23416o0() == false) goto L_0x004b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C7603b(com.yeelight.yeelib.p150c.p151i.C4198d r4) {
            /*
                r3 = this;
                r3.<init>()
                r0 = 0
                r3.f15462a = r0
                r3.f15463b = r0
                r3.f15464c = r0
                boolean r1 = r4 instanceof com.yeelight.yeelib.p150c.C5980c
                r3.f15462a = r1
                boolean r1 = r4 instanceof com.yeelight.yeelib.p150c.p151i.C4200i
                r2 = 1
                if (r1 == 0) goto L_0x0038
                boolean r1 = r4.mo23331k0()
                if (r1 != 0) goto L_0x0022
                boolean r1 = r4.mo23419q0()
                if (r1 == 0) goto L_0x0020
                goto L_0x0022
            L_0x0020:
                r1 = 0
                goto L_0x0023
            L_0x0022:
                r1 = 1
            L_0x0023:
                r3.f15463b = r1
                boolean r1 = r4.mo23333l0()
                if (r1 != 0) goto L_0x004a
                boolean r1 = r4.mo23416o0()
                if (r1 != 0) goto L_0x004a
                boolean r4 = r4.mo23420r0()
                if (r4 == 0) goto L_0x004b
                goto L_0x004a
            L_0x0038:
                boolean r1 = r4.mo23331k0()
                r3.f15463b = r1
                boolean r1 = r4.mo23333l0()
                if (r1 != 0) goto L_0x004a
                boolean r4 = r4.mo23416o0()
                if (r4 == 0) goto L_0x004b
            L_0x004a:
                r0 = 1
            L_0x004b:
                r3.f15464c = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.data.C7601g.C7603b.<init>(com.yeelight.yeelib.c.i.d):void");
        }

        /* renamed from: d */
        public static C7603b m22447d(C4198d dVar) {
            return new C7603b(dVar);
        }

        /* renamed from: a */
        public boolean mo29026a() {
            return this.f15463b;
        }

        /* renamed from: b */
        public boolean mo29027b() {
            return this.f15462a;
        }

        /* renamed from: c */
        public boolean mo29028c() {
            return this.f15464c;
        }
    }

    /* renamed from: com.yeelight.yeelib.data.g$c */
    public class C7604c {

        /* renamed from: a */
        public String f15465a;

        /* renamed from: b */
        public int f15466b;

        public C7604c(C7601g gVar) {
        }
    }

    public C7601g(Cursor cursor) {
        super(cursor);
        int i = 0;
        this.f15459d = 0;
        this.f15460e = new C7602a();
        this.f15456a = cursor;
        for (C4198d next : C4257w.m11947l0().mo23665e0()) {
            this.f15458c.put(next.mo23372G(), C7603b.m22447d(next));
        }
        for (C4198d next2 : C4257w.m11947l0().mo23666f0()) {
            this.f15458c.put(next2.mo23372G(), C7603b.m22447d(next2));
        }
        Cursor cursor2 = this.f15456a;
        if (cursor2 != null && cursor2.getCount() > 0) {
            int columnIndexOrThrow = this.f15456a.getColumnIndexOrThrow(C7579c.C7580a.C7581a.f15372c);
            this.f15456a.moveToFirst();
            while (!this.f15456a.isAfterLast()) {
                C7604c cVar = new C7604c(this);
                cVar.f15465a = this.f15456a.getString(columnIndexOrThrow);
                cVar.f15466b = i;
                this.f15457b.add(cVar);
                this.f15456a.moveToNext();
                i++;
            }
        }
        Collections.sort(this.f15457b, this.f15460e);
    }

    /* renamed from: b */
    public int mo29015b(C7603b bVar) {
        if (bVar.mo29026a()) {
            return 1;
        }
        return bVar.mo29028c() ? 2 : 3;
    }

    public void close() {
        this.f15456a.close();
    }

    public int getPosition() {
        return this.f15459d;
    }

    public boolean move(int i) {
        return moveToPosition(this.f15459d + i);
    }

    public boolean moveToFirst() {
        return moveToPosition(0);
    }

    public boolean moveToLast() {
        return moveToPosition(getCount() - 1);
    }

    public boolean moveToNext() {
        return moveToPosition(this.f15459d + 1);
    }

    public boolean moveToPosition(int i) {
        if (i < 0 || i >= this.f15457b.size()) {
            if (i < 0) {
                this.f15459d = -1;
            }
            if (i >= this.f15457b.size()) {
                this.f15459d = this.f15457b.size();
            }
        } else {
            this.f15459d = i;
            i = this.f15457b.get(i).f15466b;
        }
        return this.f15456a.moveToPosition(i);
    }

    public boolean moveToPrevious() {
        return moveToPosition(this.f15459d - 1);
    }
}
