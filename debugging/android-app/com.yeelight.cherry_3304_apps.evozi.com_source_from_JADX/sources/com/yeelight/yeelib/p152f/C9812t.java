package com.yeelight.yeelib.p152f;

import android.database.Cursor;
import com.miot.api.Constants;
import com.yeelight.yeelib.data.C7579c;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.p150c.C6005g;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p152f.C4201a;
import com.yeelight.yeelib.p187h.C9862d;
import com.yeelight.yeelib.p187h.p189h.C9874b;
import com.yeelight.yeelib.p190i.C9875a;
import com.yeelight.yeelib.utils.C4308b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.f.t */
public class C9812t implements C4201a.C4202i {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final String f17760e = "t";

    /* renamed from: f */
    private static C9812t f17761f;

    /* renamed from: a */
    private Map<String, C9875a> f17762a = new HashMap();

    /* renamed from: b */
    private C9819g f17763b;

    /* renamed from: c */
    private boolean f17764c = false;

    /* renamed from: d */
    private int f17765d = 0;

    /* renamed from: com.yeelight.yeelib.f.t$a */
    class C9813a implements C9874b<String> {
        C9813a() {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            try {
                "msg : " + str + ", size = " + str.length();
                if (new JSONObject(str).getInt("code") == 1) {
                    C9812t.this.mo31687n();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
        }
    }

    /* renamed from: com.yeelight.yeelib.f.t$b */
    class C9814b implements C9874b<String> {
        C9814b(C9812t tVar) {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            "Room edit getResponse : " + str;
        }

        public void onFailure(int i, String str) {
        }
    }

    /* renamed from: com.yeelight.yeelib.f.t$c */
    class C9815c implements C9874b<String> {

        /* renamed from: a */
        final /* synthetic */ C9875a f17767a;

        C9815c(C9875a aVar) {
            this.f17767a = aVar;
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            C9812t.this.m23831f(this.f17767a.mo31949i());
            "Delete room getResponse: " + str;
        }

        public void onFailure(int i, String str) {
        }
    }

    /* renamed from: com.yeelight.yeelib.f.t$d */
    class C9816d implements C9874b<String> {
        C9816d() {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            "room lists = " + str;
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getInt("code") == 1) {
                    C9812t.this.m23833t((List) C9875a.m24195k().mo8730b().mo8704i(jSONObject.getString("rooms"), List.class));
                    return;
                }
                "Server return err: " + jSONObject.getString(Constants.EXTRA_PUSH_MESSAGE);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            String unused = C9812t.f17760e;
            "loadRoomInfoFromCloud failure:" + str;
            C9812t.this.mo31690s();
        }
    }

    /* renamed from: com.yeelight.yeelib.f.t$e */
    class C9817e implements C9874b<String> {
        C9817e(C9812t tVar) {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            "Room create GetResponse : " + str;
        }

        public void onFailure(int i, String str) {
        }
    }

    /* renamed from: com.yeelight.yeelib.f.t$f */
    class C9818f implements C9874b<String> {
        C9818f(C9812t tVar) {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            "Room edit getResponse : " + str;
        }

        public void onFailure(int i, String str) {
        }
    }

    /* renamed from: com.yeelight.yeelib.f.t$g */
    public interface C9819g {
        /* renamed from: b */
        void mo27347b();

        /* renamed from: d */
        void mo27348d();
    }

    private C9812t() {
        C4201a.m11607r().mo23444M(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m23831f(List<C4200i> list) {
        if (list != null) {
            for (C4200i Q0 : list) {
                Q0.mo23390Q0((String) null);
            }
        }
    }

    /* renamed from: j */
    public static C9812t m23832j() {
        if (f17761f == null) {
            f17761f = new C9812t();
        }
        return f17761f;
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m23833t(List<C9875a> list) {
        C9875a aVar;
        Class<String> cls = String.class;
        HashMap hashMap = new HashMap();
        for (C9875a next : list) {
            if (!hashMap.containsValue(next) || ((aVar = (C9875a) hashMap.get(next.mo31953n())) != null && next.mo31956q() > aVar.mo31956q())) {
                hashMap.put(next.mo31953n(), next);
            }
        }
        ArrayList<C9875a> arrayList = new ArrayList<>(hashMap.values());
        ArrayList<C9875a> arrayList2 = new ArrayList<>();
        arrayList2.addAll(this.f17762a.values());
        ArrayList<C9875a> arrayList3 = new ArrayList<>();
        ArrayList arrayList4 = new ArrayList();
        ArrayList<C9875a> arrayList5 = new ArrayList<>();
        ArrayList arrayList6 = new ArrayList();
        ArrayList<C9875a> arrayList7 = new ArrayList<>();
        for (C9875a aVar2 : arrayList2) {
            if (arrayList.contains(aVar2)) {
                C9875a aVar3 = (C9875a) arrayList.get(arrayList.indexOf(aVar2));
                aVar2.mo31966z(aVar3.mo31950j());
                aVar3.mo31964x(aVar2.mo31948h());
                if (aVar2.mo31956q() > aVar3.mo31956q()) {
                    arrayList6.add(aVar2);
                } else if (aVar2.mo31956q() < aVar3.mo31956q() || (aVar3.mo31949i().size() != aVar2.mo31949i().size() && !aVar3.mo31959t())) {
                    arrayList5.add(aVar3);
                }
            } else if (aVar2.mo31959t()) {
                arrayList7.add(aVar2);
            } else {
                arrayList4.add(aVar2);
            }
        }
        for (C9875a aVar4 : arrayList) {
            if (!arrayList2.contains(aVar4) && !aVar4.mo31959t()) {
                arrayList3.add(aVar4);
                "Local not contains " + aVar4.mo31954o() + com.xiaomi.mipush.sdk.Constants.COLON_SEPARATOR + aVar4.mo31953n() + " need save  , add to 'needLocalSave' list!";
            }
        }
        if (!arrayList3.isEmpty()) {
            " needLocalSave size = " + arrayList3.size();
            for (C9875a aVar5 : arrayList3) {
                this.f17762a.put(aVar5.mo31953n(), aVar5);
                DeviceDataProvider.m22400e(aVar5);
                C4257w.m11947l0().mo23652P(new C6005g(aVar5));
            }
        }
        if (!arrayList5.isEmpty()) {
            " needLocalUpdate size = " + arrayList5.size();
            ArrayList arrayList8 = new ArrayList();
            ArrayList arrayList9 = new ArrayList();
            for (C9875a aVar6 : arrayList5) {
                this.f17762a.put(aVar6.mo31953n(), aVar6);
                C6005g G0 = C4257w.m11947l0().mo23647G0(aVar6.mo31953n());
                if (aVar6.mo31959t()) {
                    if (G0 != null) {
                        Iterator<C4200i> it = aVar6.mo31949i().iterator();
                        while (it.hasNext()) {
                            it.next().mo23390Q0((String) null);
                        }
                    }
                    arrayList9.add(aVar6);
                } else {
                    if (G0 != null) {
                        G0.mo27556f2(aVar6);
                    }
                    arrayList8.add(aVar6);
                }
            }
            DeviceDataProvider.m22404h(arrayList8);
            DeviceDataProvider.m22403g(arrayList9);
        }
        if (!arrayList7.isEmpty()) {
            " needLocalDelete size = " + arrayList7.size();
            for (C9875a aVar7 : arrayList7) {
                " Delete room from local database, room name: " + aVar7.mo31954o();
                DeviceDataProvider.m22409m(aVar7);
                this.f17762a.remove(aVar7.mo31953n());
            }
        }
        if (!arrayList4.isEmpty()) {
            C9862d.m24138h(C4308b.f7493l + "user/room/create", C9875a.m24195k().mo8730b().mo8713s(arrayList4, List.class), cls, new C9817e(this));
        }
        if (!arrayList6.isEmpty()) {
            C9862d.m24138h(C4308b.f7493l + "user/room/edit", C9875a.m24195k().mo8730b().mo8713s(arrayList6, List.class), cls, new C9818f(this));
        }
        mo31689p();
    }

    /* renamed from: C */
    public void mo23456C(C4201a.C4212k kVar) {
    }

    /* renamed from: H */
    public void mo23457H() {
    }

    /* renamed from: d */
    public void mo23458d() {
    }

    /* renamed from: e */
    public void mo31683e(C9875a aVar) {
        Map<String, C9875a> map = this.f17762a;
        if (map != null) {
            map.put(aVar.mo31953n(), aVar);
        }
        C4257w.m11947l0().mo23652P(new C6005g(aVar));
        DeviceDataProvider.m22400e(aVar);
        C9819g gVar = this.f17763b;
        if (gVar != null) {
            gVar.mo27348d();
        }
        C9862d.m24138h(C4308b.f7493l + "user/room/create", aVar.mo31944E(), String.class, new C9813a());
    }

    /* renamed from: g */
    public void mo23459g() {
        this.f17762a.clear();
        C9819g gVar = this.f17763b;
        if (gVar != null) {
            gVar.mo27348d();
        }
    }

    /* renamed from: h */
    public List<C9875a> mo31684h() {
        ArrayList arrayList = new ArrayList();
        Map<String, C9875a> map = this.f17762a;
        if (map != null) {
            arrayList.addAll(map.values());
        }
        return arrayList;
    }

    /* renamed from: i */
    public void mo23460i() {
    }

    /* renamed from: k */
    public List<C9875a> mo31685k() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, C9875a> value : this.f17762a.entrySet()) {
            C9875a aVar = (C9875a) value.getValue();
            if (!aVar.mo31959t()) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    public void mo23461l() {
    }

    /* renamed from: m */
    public C9875a mo31686m(String str) {
        if (str == null) {
            return null;
        }
        for (Map.Entry<String, C9875a> value : this.f17762a.entrySet()) {
            C9875a aVar = (C9875a) value.getValue();
            if (aVar.mo31953n().equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: n */
    public void mo31687n() {
        if (!this.f17764c) {
            String str = C4308b.f7493l + "user/room/lists";
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("mid", C4201a.m11607r().mo23452v());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C9862d.m24138h(str, jSONObject.toString(), String.class, new C9816d());
        }
    }

    /* renamed from: o */
    public void mo31688o() {
        this.f17762a.clear();
        Cursor E = DeviceDataProvider.m22370E();
        "loadRoomInfoFromDatabase cursor size: : " + E.getCount();
        if (E.moveToFirst()) {
            do {
                String string = E.getString(E.getColumnIndex(C7579c.C7592g.C7593a.f15428b));
                int i = E.getInt(E.getColumnIndex(C7579c.C7592g.C7593a.f15429c));
                String string2 = E.getString(E.getColumnIndex(C7579c.C7592g.C7593a.f15431e));
                long j = E.getLong(E.getColumnIndex(C7579c.C7592g.C7593a.f15432f));
                boolean z = E.getInt(E.getColumnIndex(C7579c.C7592g.C7593a.f15433g)) == 1;
                int i2 = E.getInt(E.getColumnIndex(C7579c.C7592g.C7593a.f15435i));
                String[] strArr = new String[0];
                if (!z) {
                    strArr = DeviceDataProvider.m22382Q(string).split(";");
                }
                String string3 = E.getString(E.getColumnIndex(C7579c.C7592g.C7593a.f15434h));
                C9875a aVar = new C9875a(string, i, string2, j, strArr);
                aVar.mo31941B(string3);
                aVar.mo31965y(z);
                aVar.mo31964x(i2);
                this.f17762a.put(string, aVar);
                "Load room from db: " + aVar.toString();
                if (!z) {
                    C4257w.m11947l0().mo23652P(new C6005g(aVar));
                }
            } while (E.moveToNext());
        }
        E.close();
        C9819g gVar = this.f17763b;
        if (gVar != null) {
            gVar.mo27348d();
        }
        mo31687n();
    }

    /* renamed from: p */
    public void mo31689p() {
        this.f17764c = false;
        this.f17765d = 0;
        C9819g gVar = this.f17763b;
        if (gVar != null) {
            gVar.mo27348d();
        }
    }

    /* renamed from: q */
    public void mo23462q(String str) {
    }

    /* renamed from: r */
    public void mo23463r(String str) {
    }

    /* renamed from: s */
    public void mo31690s() {
        C9819g gVar;
        this.f17764c = false;
        int i = this.f17765d + 1;
        this.f17765d = i;
        if (i > 3 && (gVar = this.f17763b) != null) {
            gVar.mo27347b();
        }
    }

    /* renamed from: u */
    public void mo31691u(String str, String str2) {
        if (this.f17762a.containsKey(str)) {
            C9875a aVar = this.f17762a.get(str);
            aVar.mo31962v(str2);
            aVar.mo31945F();
            mo31694x(aVar);
        }
    }

    /* renamed from: v */
    public void mo31692v(C9875a aVar) {
        "set room to Deleted, room name: " + aVar.mo31954o();
        if (aVar.mo31950j() == null) {
            this.f17762a.remove(aVar.mo31953n());
            C9819g gVar = this.f17763b;
            if (gVar != null) {
                gVar.mo27348d();
            }
            DeviceDataProvider.m22409m(aVar);
            m23831f(aVar.mo31949i());
            return;
        }
        aVar.mo31965y(true);
        C9819g gVar2 = this.f17763b;
        if (gVar2 != null) {
            gVar2.mo27348d();
        }
        C4257w.m11947l0().mo23686r1(aVar.mo31953n());
        DeviceDataProvider.m22391Z(aVar);
        String str = C4308b.f7493l + "user/room/delete";
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mid", C4201a.m11607r().mo23452v());
            jSONObject.put("id", aVar.mo31950j());
            jSONArray.put(jSONObject);
            "Delete room  params: " + jSONArray.toString();
            C9862d.m24138h(str, jSONArray.toString(), String.class, new C9815c(aVar));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: w */
    public void mo31693w(C9819g gVar) {
        this.f17763b = gVar;
    }

    /* renamed from: x */
    public void mo31694x(C9875a aVar) {
        this.f17762a.put(aVar.mo31953n(), aVar);
        DeviceDataProvider.m22401e0(aVar);
        C9819g gVar = this.f17763b;
        if (gVar != null) {
            gVar.mo27348d();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(aVar);
        C9862d.m24138h(C4308b.f7493l + "user/room/edit", C9875a.m24195k().mo8730b().mo8713s(arrayList, List.class), String.class, new C9814b(this));
    }
}
