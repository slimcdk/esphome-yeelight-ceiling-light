package com.yeelight.yeelib.p150c.p151i;

import android.database.Cursor;
import com.yeelight.yeelib.data.C7579c;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.p150c.C5972a;
import com.yeelight.yeelib.p153g.C9850s;
import java.util.HashMap;

/* renamed from: com.yeelight.yeelib.c.i.m */
public abstract class C6047m extends C5972a {

    /* renamed from: A */
    protected HashMap<String, Object> f12855A = new HashMap<>();
    /* access modifiers changed from: protected */

    /* renamed from: B */
    public boolean f12856B = false;
    /* access modifiers changed from: protected */

    /* renamed from: G */
    public C6048a f12857G;
    /* access modifiers changed from: protected */

    /* renamed from: z */
    public C9850s f12858z = new C9850s();

    /* renamed from: com.yeelight.yeelib.c.i.m$a */
    public interface C6048a {
        /* renamed from: b */
        void mo27538b(int i, boolean z, int i2, int i3);

        /* renamed from: e */
        void mo27540e(int i);

        /* renamed from: f */
        void mo27541f();

        /* renamed from: i */
        void mo27545i();
    }

    /* renamed from: com.yeelight.yeelib.c.i.m$b */
    public enum C6049b {
        TASK_UNKNOWN,
        TASK_LOGIN,
        TASK_RESET,
        TASK_NORMAL
    }

    public C6047m(String str, String str2, C6024e eVar) {
        super(str, str2, eVar);
        C6049b bVar = C6049b.TASK_UNKNOWN;
        Cursor J = DeviceDataProvider.m22375J(this.f7255r);
        if (J != null && J.moveToFirst()) {
            this.f12858z = m17987e2(J);
            "get network from db = " + this.f12858z.toString();
        }
    }

    /* renamed from: e2 */
    private C9850s m17987e2(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(C7579c.C7590f.C7591a.f15421a);
        int columnIndex2 = cursor.getColumnIndex(C7579c.C7590f.C7591a.f15423c);
        int columnIndex3 = cursor.getColumnIndex(C7579c.C7590f.C7591a.f15422b);
        int columnIndex4 = cursor.getColumnIndex(C7579c.C7590f.C7591a.f15424d);
        C9850s sVar = new C9850s();
        sVar.mo31824e(cursor.getInt(columnIndex));
        sVar.mo31826f(cursor.getString(columnIndex2));
        sVar.mo31827g(cursor.getString(columnIndex3));
        sVar.mo31828h(cursor.getString(columnIndex4));
        return sVar;
    }

    /* renamed from: T1 */
    public abstract void mo27803T1();

    /* renamed from: U1 */
    public Object mo27804U1(String str) {
        return this.f12855A.get(str);
    }

    /* renamed from: V1 */
    public C9850s mo27805V1() {
        return this.f12858z;
    }

    /* renamed from: W1 */
    public boolean mo27806W1() {
        return this.f12856B;
    }

    /* renamed from: X1 */
    public abstract boolean mo27807X1();

    /* renamed from: Y1 */
    public abstract void mo27808Y1(String str, String str2);

    /* renamed from: Z1 */
    public abstract boolean mo27809Z1(int i);

    /* renamed from: a2 */
    public abstract boolean mo27810a2(int i);

    /* renamed from: b2 */
    public abstract boolean mo27811b2(int i);

    /* renamed from: c2 */
    public abstract void mo27812c2(byte[] bArr);

    /* renamed from: d2 */
    public abstract void mo27813d2();

    /* renamed from: f2 */
    public abstract void mo27814f2();

    /* renamed from: g2 */
    public void mo27815g2(HashMap<String, Object> hashMap) {
        this.f12855A = hashMap;
        if (hashMap != null && hashMap.get("ADV_MESH_NAME") != null) {
            String str = new String((byte[]) hashMap.get("ADV_MESH_NAME"));
            mo27805V1().mo31827g(str);
            mo27805V1().mo31826f(str);
            if ("yeelight_ms".equals(str)) {
                mo27817i2(new C9850s());
            }
        }
    }

    /* renamed from: h2 */
    public void mo27816h2(C6048a aVar) {
        this.f12857G = aVar;
    }

    /* renamed from: i2 */
    public void mo27817i2(C9850s sVar) {
        this.f12858z = sVar;
    }

    /* renamed from: j2 */
    public void mo27818j2(String str, Object obj) {
        HashMap<String, Object> hashMap = this.f12855A;
        if (hashMap != null) {
            hashMap.put(str, obj);
        }
    }

    /* renamed from: k2 */
    public abstract void mo27819k2(byte[] bArr);

    /* renamed from: l2 */
    public abstract boolean mo27820l2(String str, String str2);
}
