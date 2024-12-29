package com.yeelight.yeelib.device.base;

import android.database.Cursor;
import com.yeelight.yeelib.data.C6043b;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.device.C6081a;
import com.yeelight.yeelib.models.MeshNetWork;
import java.util.HashMap;

public abstract class PrivateMeshDeviceBase extends C6081a {

    /* renamed from: A */
    protected HashMap<String, Object> f12491A = new HashMap<>();
    /* access modifiers changed from: protected */

    /* renamed from: B */
    public boolean f12492B = false;
    /* access modifiers changed from: protected */

    /* renamed from: C */
    public C6090a f12493C;
    /* access modifiers changed from: protected */

    /* renamed from: z */
    public MeshNetWork f12494z = new MeshNetWork();

    public enum MeshTask {
        TASK_UNKNOWN,
        TASK_LOGIN,
        TASK_RESET,
        TASK_NORMAL
    }

    /* renamed from: com.yeelight.yeelib.device.base.PrivateMeshDeviceBase$a */
    public interface C6090a {
        /* renamed from: b */
        void mo31651b(int i, boolean z, int i2, int i3);

        /* renamed from: e */
        void mo31652e(int i);

        /* renamed from: f */
        void mo31653f();

        /* renamed from: i */
        void mo31654i();
    }

    public PrivateMeshDeviceBase(String str, String str2, DeviceStatusBase deviceStatusBase) {
        super(str, str2, deviceStatusBase);
        MeshTask meshTask = MeshTask.TASK_UNKNOWN;
        Cursor J = DeviceDataProvider.m17597J(this.f4753r);
        if (J != null && J.moveToFirst()) {
            this.f12494z = m17893e2(J);
            StringBuilder sb = new StringBuilder();
            sb.append("get network from db = ");
            sb.append(this.f12494z.toString());
        }
    }

    /* renamed from: e2 */
    private MeshNetWork m17893e2(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(C6043b.C6054f.C6055a.f12380a);
        int columnIndex2 = cursor.getColumnIndex(C6043b.C6054f.C6055a.f12382c);
        int columnIndex3 = cursor.getColumnIndex(C6043b.C6054f.C6055a.f12381b);
        int columnIndex4 = cursor.getColumnIndex(C6043b.C6054f.C6055a.f12383d);
        MeshNetWork meshNetWork = new MeshNetWork();
        meshNetWork.setId(cursor.getInt(columnIndex));
        meshNetWork.setName(cursor.getString(columnIndex2));
        meshNetWork.setNetworkName(cursor.getString(columnIndex3));
        meshNetWork.setPassword(cursor.getString(columnIndex4));
        return meshNetWork;
    }

    /* renamed from: T1 */
    public abstract void mo31633T1();

    /* renamed from: U1 */
    public Object mo31634U1(String str) {
        return this.f12491A.get(str);
    }

    /* renamed from: V1 */
    public MeshNetWork mo31635V1() {
        return this.f12494z;
    }

    /* renamed from: W1 */
    public boolean mo31636W1() {
        return this.f12492B;
    }

    /* renamed from: X1 */
    public abstract boolean mo31637X1();

    /* renamed from: Y1 */
    public abstract void mo31638Y1(String str, String str2);

    /* renamed from: Z1 */
    public abstract boolean mo31639Z1(int i);

    /* renamed from: a2 */
    public abstract boolean mo31640a2(int i);

    /* renamed from: b2 */
    public abstract boolean mo31641b2(int i);

    /* renamed from: c2 */
    public abstract void mo31642c2(byte[] bArr);

    /* renamed from: d2 */
    public abstract void mo31643d2();

    /* renamed from: f2 */
    public abstract void mo31644f2();

    /* renamed from: g2 */
    public void mo31645g2(HashMap<String, Object> hashMap) {
        this.f12491A = hashMap;
        if (hashMap != null && hashMap.get("ADV_MESH_NAME") != null) {
            String str = new String((byte[]) hashMap.get("ADV_MESH_NAME"));
            mo31635V1().setNetworkName(str);
            mo31635V1().setName(str);
            if ("yeelight_ms".equals(str)) {
                mo31647i2(new MeshNetWork());
            }
        }
    }

    /* renamed from: h2 */
    public void mo31646h2(C6090a aVar) {
        this.f12493C = aVar;
    }

    /* renamed from: i2 */
    public void mo31647i2(MeshNetWork meshNetWork) {
        this.f12494z = meshNetWork;
    }

    /* renamed from: j2 */
    public void mo31648j2(String str, Object obj) {
        HashMap<String, Object> hashMap = this.f12491A;
        if (hashMap != null) {
            hashMap.put(str, obj);
        }
    }

    /* renamed from: k2 */
    public abstract void mo31649k2(byte[] bArr);

    /* renamed from: l2 */
    public abstract boolean mo31650l2(String str, String str2);
}
