package com.yeelight.yeelib.data;

import android.database.Cursor;
import android.database.CursorWrapper;
import com.yeelight.yeelib.data.C6043b;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/* renamed from: com.yeelight.yeelib.data.f */
public class C6065f extends CursorWrapper {

    /* renamed from: a */
    private Cursor f12415a;

    /* renamed from: b */
    private ArrayList<C6068c> f12416b = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public HashMap<String, C6067b> f12417c = new HashMap<>();

    /* renamed from: d */
    private int f12418d;

    /* renamed from: e */
    public Comparator<C6068c> f12419e;

    /* renamed from: com.yeelight.yeelib.data.f$a */
    class C6066a implements Comparator<C6068c> {
        C6066a() {
        }

        /* renamed from: a */
        public int compare(C6068c cVar, C6068c cVar2) {
            C6067b bVar = (C6067b) C6065f.this.f12417c.get(cVar.f12424a);
            C6067b bVar2 = (C6067b) C6065f.this.f12417c.get(cVar2.f12424a);
            if (bVar == null && bVar2 == null) {
                return 0;
            }
            if (bVar == null && bVar2 != null) {
                return 1;
            }
            if (bVar != null && bVar2 == null) {
                return -1;
            }
            int c = C6065f.this.mo31460c(bVar);
            int c2 = C6065f.this.mo31460c(bVar2);
            if (c != c2) {
                return c < c2 ? -1 : 1;
            }
            if ((!bVar.mo31472b() || bVar2.mo31472b()) && (bVar.mo31472b() || !bVar2.mo31472b())) {
                return 0;
            }
            return bVar.mo31472b() ? -1 : 1;
        }
    }

    /* renamed from: com.yeelight.yeelib.data.f$b */
    public static class C6067b {

        /* renamed from: a */
        private boolean f12421a = false;

        /* renamed from: b */
        private boolean f12422b = false;

        /* renamed from: c */
        private boolean f12423c = false;

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
            if (r4.mo23234r0() == false) goto L_0x004b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
            if (r4.mo23230o0() == false) goto L_0x004b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C6067b(com.yeelight.yeelib.device.base.C3010c r4) {
            /*
                r3 = this;
                r3.<init>()
                r0 = 0
                r3.f12421a = r0
                r3.f12422b = r0
                r3.f12423c = r0
                boolean r1 = r4 instanceof com.yeelight.yeelib.device.C6119c
                r3.f12421a = r1
                boolean r1 = r4 instanceof com.yeelight.yeelib.device.base.C3012e
                r2 = 1
                if (r1 == 0) goto L_0x0038
                boolean r1 = r4.mo23145k0()
                if (r1 != 0) goto L_0x0022
                boolean r1 = r4.mo23233q0()
                if (r1 == 0) goto L_0x0020
                goto L_0x0022
            L_0x0020:
                r1 = 0
                goto L_0x0023
            L_0x0022:
                r1 = 1
            L_0x0023:
                r3.f12422b = r1
                boolean r1 = r4.mo23147l0()
                if (r1 != 0) goto L_0x004a
                boolean r1 = r4.mo23230o0()
                if (r1 != 0) goto L_0x004a
                boolean r4 = r4.mo23234r0()
                if (r4 == 0) goto L_0x004b
                goto L_0x004a
            L_0x0038:
                boolean r1 = r4.mo23145k0()
                r3.f12422b = r1
                boolean r1 = r4.mo23147l0()
                if (r1 != 0) goto L_0x004a
                boolean r4 = r4.mo23230o0()
                if (r4 == 0) goto L_0x004b
            L_0x004a:
                r0 = 1
            L_0x004b:
                r3.f12423c = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.data.C6065f.C6067b.<init>(com.yeelight.yeelib.device.base.c):void");
        }

        /* renamed from: d */
        public static C6067b m17668d(C3010c cVar) {
            return new C6067b(cVar);
        }

        /* renamed from: a */
        public boolean mo31471a() {
            return this.f12422b;
        }

        /* renamed from: b */
        public boolean mo31472b() {
            return this.f12421a;
        }

        /* renamed from: c */
        public boolean mo31473c() {
            return this.f12423c;
        }
    }

    /* renamed from: com.yeelight.yeelib.data.f$c */
    public class C6068c {

        /* renamed from: a */
        public String f12424a;

        /* renamed from: b */
        public int f12425b;

        public C6068c(C6065f fVar) {
        }
    }

    public C6065f(Cursor cursor) {
        super(cursor);
        int i = 0;
        this.f12418d = 0;
        this.f12419e = new C6066a();
        this.f12415a = cursor;
        for (C3010c next : YeelightDeviceManager.m7800o0().mo23289g0()) {
            this.f12417c.put(next.mo23185G(), C6067b.m17668d(next));
        }
        for (C3010c next2 : YeelightDeviceManager.m7800o0().mo23292h0()) {
            this.f12417c.put(next2.mo23185G(), C6067b.m17668d(next2));
        }
        Cursor cursor2 = this.f12415a;
        if (cursor2 != null && cursor2.getCount() > 0) {
            int columnIndexOrThrow = this.f12415a.getColumnIndexOrThrow(C6043b.C6044a.C6045a.f12331c);
            this.f12415a.moveToFirst();
            while (!this.f12415a.isAfterLast()) {
                C6068c cVar = new C6068c(this);
                cVar.f12424a = this.f12415a.getString(columnIndexOrThrow);
                cVar.f12425b = i;
                this.f12416b.add(cVar);
                this.f12415a.moveToNext();
                i++;
            }
        }
        Collections.sort(this.f12416b, this.f12419e);
    }

    /* renamed from: c */
    public int mo31460c(C6067b bVar) {
        if (bVar.mo31471a()) {
            return 1;
        }
        return bVar.mo31473c() ? 2 : 3;
    }

    public void close() {
        this.f12415a.close();
    }

    public int getPosition() {
        return this.f12418d;
    }

    public boolean move(int i) {
        return moveToPosition(this.f12418d + i);
    }

    public boolean moveToFirst() {
        return moveToPosition(0);
    }

    public boolean moveToLast() {
        return moveToPosition(getCount() - 1);
    }

    public boolean moveToNext() {
        return moveToPosition(this.f12418d + 1);
    }

    public boolean moveToPosition(int i) {
        if (i < 0 || i >= this.f12416b.size()) {
            if (i < 0) {
                this.f12418d = -1;
            }
            if (i >= this.f12416b.size()) {
                this.f12418d = this.f12416b.size();
            }
        } else {
            this.f12418d = i;
            i = this.f12416b.get(i).f12425b;
        }
        return this.f12415a.moveToPosition(i);
    }

    public boolean moveToPrevious() {
        return moveToPosition(this.f12418d - 1);
    }
}
