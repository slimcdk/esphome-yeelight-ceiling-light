package com.yeelight.yeelib.managers;

import android.database.Cursor;
import android.text.TextUtils;
import android.widget.Toast;
import com.miot.api.Constants;
import com.yeelight.yeelib.data.C6043b;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.device.C6169f;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p129b4.C3988b;
import p134c4.C4007b;
import p145d4.C8937a;

/* renamed from: com.yeelight.yeelib.managers.t */
public class C8293t implements C3051a.C3052i {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final String f14237e = "t";

    /* renamed from: f */
    private static C8293t f14238f;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Map<String, C8937a> f14239a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C8300g f14240b;

    /* renamed from: c */
    private boolean f14241c = false;

    /* renamed from: d */
    private int f14242d = 0;

    /* renamed from: com.yeelight.yeelib.managers.t$a */
    class C8294a implements C4007b<String> {

        /* renamed from: a */
        final /* synthetic */ C8937a f14243a;

        /* renamed from: b */
        final /* synthetic */ C8299f f14244b;

        C8294a(C8937a aVar, C8299f fVar) {
            this.f14243a = aVar;
            this.f14244b = fVar;
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("msg : ");
                sb.append(str);
                sb.append(", size = ");
                sb.append(str.length());
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getInt("code") == 1) {
                    if (C8293t.this.f14239a != null) {
                        C8293t.this.f14239a.put(this.f14243a.mo36722n(), this.f14243a);
                    }
                    YeelightDeviceManager.m7800o0().mo23275Q(new C6169f(this.f14243a));
                    DeviceDataProvider.m17622e(this.f14243a);
                    if (C8293t.this.f14240b != null) {
                        C8293t.this.f14240b.mo31300e();
                    }
                    C8293t.this.mo35257s();
                    this.f14244b.mo30329b();
                    return;
                }
                String optString = jSONObject.optString(Constants.EXTRA_PUSH_MESSAGE);
                if (!TextUtils.isEmpty(optString)) {
                    Toast.makeText(AppUtils.f4984h, optString, 0).show();
                }
                this.f14244b.mo30328a();
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.t$b */
    class C8295b implements C4007b<String> {
        C8295b(C8293t tVar) {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("Room edit getResponse : ");
            sb.append(str);
        }

        public void onFailure(int i, String str) {
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.t$c */
    class C8296c implements C4007b<String> {

        /* renamed from: a */
        final /* synthetic */ C8937a f14246a;

        /* renamed from: b */
        final /* synthetic */ C8299f f14247b;

        C8296c(C8937a aVar, C8299f fVar) {
            this.f14246a = aVar;
            this.f14247b = fVar;
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getInt("code") == 1) {
                    this.f14246a.mo36734y(true);
                    if (C8293t.this.f14240b != null) {
                        C8293t.this.f14240b.mo31300e();
                    }
                    YeelightDeviceManager.m7800o0().mo23320v1(this.f14246a.mo36722n());
                    DeviceDataProvider.m17613Z(this.f14246a);
                    C8293t.this.m19619j(this.f14246a.mo36718i());
                    StringBuilder sb = new StringBuilder();
                    sb.append("Delete room getResponse: ");
                    sb.append(str);
                    this.f14247b.mo30329b();
                    return;
                }
                String optString = jSONObject.optString(Constants.EXTRA_PUSH_MESSAGE);
                if (!TextUtils.isEmpty(optString)) {
                    Toast.makeText(AppUtils.f4984h, optString, 0).show();
                }
                this.f14247b.mo30328a();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.t$d */
    class C8297d implements C4007b<String> {
        C8297d() {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("room lists = ");
            sb.append(str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getInt("code") == 1) {
                    String string = jSONObject.getString("rooms");
                    C8293t.this.m19621w((List) C8937a.m21309k().mo19252b().mo19225h(string, List.class));
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Server return err: ");
                sb2.append(jSONObject.getString(Constants.EXTRA_PUSH_MESSAGE));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            String unused = C8293t.f14237e;
            StringBuilder sb = new StringBuilder();
            sb.append("loadRoomInfoFromCloud failure:");
            sb.append(str);
            C8293t.this.mo35260v();
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.t$e */
    class C8298e implements C4007b<String> {
        C8298e(C8293t tVar) {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("Room edit getResponse : ");
            sb.append(str);
        }

        public void onFailure(int i, String str) {
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.t$f */
    public interface C8299f {
        /* renamed from: a */
        void mo30328a();

        /* renamed from: b */
        void mo30329b();
    }

    /* renamed from: com.yeelight.yeelib.managers.t$g */
    public interface C8300g {
        /* renamed from: d */
        void mo31299d();

        /* renamed from: e */
        void mo31300e();
    }

    private C8293t() {
        C3051a.m7925r().mo23358M(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m19619j(List<C3012e> list) {
        if (list != null) {
            for (C3012e Q0 : list) {
                Q0.mo23203Q0((String) null);
            }
        }
    }

    /* renamed from: n */
    public static C8293t m19620n() {
        if (f14238f == null) {
            f14238f = new C8293t();
        }
        return f14238f;
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m19621w(List<C8937a> list) {
        C8937a aVar;
        HashMap hashMap = new HashMap();
        for (C8937a next : list) {
            if (!hashMap.containsValue(next) || ((aVar = (C8937a) hashMap.get(next.mo36722n())) != null && next.mo36725q() > aVar.mo36725q())) {
                hashMap.put(next.mo36722n(), next);
            }
        }
        ArrayList<C8937a> arrayList = new ArrayList<>(hashMap.values());
        ArrayList<C8937a> arrayList2 = new ArrayList<>();
        arrayList2.addAll(this.f14239a.values());
        ArrayList<C8937a> arrayList3 = new ArrayList<>();
        ArrayList<C8937a> arrayList4 = new ArrayList<>();
        ArrayList arrayList5 = new ArrayList();
        ArrayList<C8937a> arrayList6 = new ArrayList<>();
        for (C8937a aVar2 : arrayList2) {
            if (!arrayList.contains(aVar2)) {
                arrayList6.add(aVar2);
            } else {
                C8937a aVar3 = (C8937a) arrayList.get(arrayList.indexOf(aVar2));
                aVar2.mo36735z(aVar3.mo36719j());
                aVar3.mo36733x(aVar2.mo36717h());
                if (aVar2.mo36725q() > aVar3.mo36725q()) {
                    arrayList5.add(aVar2);
                } else if (aVar2.mo36725q() < aVar3.mo36725q() || (aVar3.mo36718i().size() != aVar2.mo36718i().size() && !aVar3.mo36728t())) {
                    arrayList4.add(aVar3);
                }
            }
        }
        for (C8937a aVar4 : arrayList) {
            if (!arrayList2.contains(aVar4) && !aVar4.mo36728t()) {
                arrayList3.add(aVar4);
                StringBuilder sb = new StringBuilder();
                sb.append("Local not contains ");
                sb.append(aVar4.mo36723o());
                sb.append(com.xiaomi.mipush.sdk.Constants.COLON_SEPARATOR);
                sb.append(aVar4.mo36722n());
                sb.append(" need save  , add to 'needLocalSave' list!");
            }
        }
        if (!arrayList3.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" needLocalSave size = ");
            sb2.append(arrayList3.size());
            for (C8937a aVar5 : arrayList3) {
                this.f14239a.put(aVar5.mo36722n(), aVar5);
                DeviceDataProvider.m17622e(aVar5);
                YeelightDeviceManager.m7800o0().mo23275Q(new C6169f(aVar5));
            }
        }
        if (!arrayList4.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(" needLocalUpdate size = ");
            sb3.append(arrayList4.size());
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            for (C8937a aVar6 : arrayList4) {
                this.f14239a.put(aVar6.mo36722n(), aVar6);
                C6169f J0 = YeelightDeviceManager.m7800o0().mo23268J0(aVar6.mo36722n());
                if (aVar6.mo36728t()) {
                    if (J0 != null) {
                        Iterator<C3012e> it = aVar6.mo36718i().iterator();
                        while (it.hasNext()) {
                            it.next().mo23203Q0((String) null);
                        }
                    }
                    arrayList8.add(aVar6);
                } else {
                    if (J0 != null) {
                        J0.mo31878f2(aVar6);
                    }
                    arrayList7.add(aVar6);
                }
            }
            DeviceDataProvider.m17626h(arrayList7);
            DeviceDataProvider.m17625g(arrayList8);
        }
        if (!arrayList6.isEmpty()) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(" needLocalDelete size = ");
            sb4.append(arrayList6.size());
            for (C8937a aVar7 : arrayList6) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(" Delete room from local database, room name: ");
                sb5.append(aVar7.mo36723o());
                DeviceDataProvider.m17631m(aVar7);
                this.f14239a.remove(aVar7.mo36722n());
            }
        }
        if (!arrayList5.isEmpty()) {
            C3988b.m11572h(AppUtils.f4994r + "user/room/edit", C8937a.m21309k().mo19252b().mo19235s(arrayList5, List.class), String.class, new C8298e(this));
        }
        mo35259u();
    }

    /* renamed from: A */
    public void mo35251A(C8937a aVar) {
        this.f14239a.put(aVar.mo36722n(), aVar);
        DeviceDataProvider.m17623e0(aVar);
        C8300g gVar = this.f14240b;
        if (gVar != null) {
            gVar.mo31300e();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(aVar);
        C3988b.m11572h(AppUtils.f4994r + "user/room/edit", C8937a.m21309k().mo19252b().mo19235s(arrayList, List.class), String.class, new C8295b(this));
    }

    /* renamed from: C */
    public void mo23255C(C3051a.C3062k kVar) {
    }

    /* renamed from: H */
    public void mo23262H() {
    }

    /* renamed from: d */
    public void mo23283d() {
    }

    /* renamed from: g */
    public void mo23288g() {
        this.f14239a.clear();
        C8300g gVar = this.f14240b;
        if (gVar != null) {
            gVar.mo31300e();
        }
    }

    /* renamed from: h */
    public void mo23291h() {
    }

    /* renamed from: i */
    public void mo35252i(C8937a aVar, C8299f fVar) {
        C3988b.m11572h(AppUtils.f4994r + "user/room/create", aVar.mo36713E(), String.class, new C8294a(aVar, fVar));
    }

    /* renamed from: k */
    public void mo35253k() {
        DeviceDataProvider.m17625g(new ArrayList(this.f14239a.values()));
    }

    /* renamed from: l */
    public void mo23300l() {
    }

    /* renamed from: m */
    public List<C8937a> mo35254m() {
        ArrayList arrayList = new ArrayList();
        Map<String, C8937a> map = this.f14239a;
        if (map != null) {
            arrayList.addAll(map.values());
        }
        return arrayList;
    }

    /* renamed from: o */
    public List<C8937a> mo35255o() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, C8937a> value : this.f14239a.entrySet()) {
            C8937a aVar = (C8937a) value.getValue();
            if (!aVar.mo36728t()) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    /* renamed from: p */
    public C8937a mo35256p(String str) {
        if (str == null) {
            return null;
        }
        for (Map.Entry<String, C8937a> value : this.f14239a.entrySet()) {
            C8937a aVar = (C8937a) value.getValue();
            if (aVar.mo36722n().equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: q */
    public void mo23308q(String str) {
    }

    /* renamed from: r */
    public void mo23310r(String str) {
    }

    /* renamed from: s */
    public void mo35257s() {
        if (!this.f14241c) {
            String str = AppUtils.f4994r + "user/room/lists";
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("mid", C3051a.m7925r().mo23366v());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C3988b.m11572h(str, jSONObject.toString(), String.class, new C8297d());
        }
    }

    /* renamed from: t */
    public void mo35258t() {
        this.f14239a.clear();
        Cursor E = DeviceDataProvider.m17592E();
        StringBuilder sb = new StringBuilder();
        sb.append("loadRoomInfoFromDatabase cursor size: : ");
        sb.append(E.getCount());
        if (E.moveToFirst()) {
            do {
                String string = E.getString(E.getColumnIndex(C6043b.C6056g.C6057a.f12387b));
                int i = E.getInt(E.getColumnIndex(C6043b.C6056g.C6057a.f12388c));
                String string2 = E.getString(E.getColumnIndex(C6043b.C6056g.C6057a.f12390e));
                long j = E.getLong(E.getColumnIndex(C6043b.C6056g.C6057a.f12391f));
                boolean z = E.getInt(E.getColumnIndex(C6043b.C6056g.C6057a.f12392g)) == 1;
                int i2 = E.getInt(E.getColumnIndex(C6043b.C6056g.C6057a.f12394i));
                String[] strArr = new String[0];
                if (!z) {
                    strArr = DeviceDataProvider.m17604Q(string).split(";");
                }
                String string3 = E.getString(E.getColumnIndex(C6043b.C6056g.C6057a.f12393h));
                C8937a aVar = new C8937a(string, i, string2, j, strArr);
                aVar.mo36710B(string3);
                aVar.mo36734y(z);
                aVar.mo36733x(i2);
                this.f14239a.put(string, aVar);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Load room from db: ");
                sb2.append(aVar.toString());
                if (!z) {
                    YeelightDeviceManager.m7800o0().mo23275Q(new C6169f(aVar));
                }
            } while (E.moveToNext());
        }
        E.close();
        C8300g gVar = this.f14240b;
        if (gVar != null) {
            gVar.mo31300e();
        }
        mo35257s();
    }

    /* renamed from: u */
    public void mo35259u() {
        this.f14241c = false;
        this.f14242d = 0;
        C8300g gVar = this.f14240b;
        if (gVar != null) {
            gVar.mo31300e();
        }
    }

    /* renamed from: v */
    public void mo35260v() {
        C8300g gVar;
        this.f14241c = false;
        int i = this.f14242d + 1;
        this.f14242d = i;
        if (i > 3 && (gVar = this.f14240b) != null) {
            gVar.mo31299d();
        }
    }

    /* renamed from: x */
    public void mo35261x(String str, String str2) {
        if (this.f14239a.containsKey(str)) {
            C8937a aVar = this.f14239a.get(str);
            aVar.mo36731v(str2);
            aVar.mo36714F();
            mo35251A(aVar);
        }
    }

    /* renamed from: y */
    public void mo35262y(C8937a aVar, C8299f fVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("set room to Deleted, room name: ");
        sb.append(aVar.mo36723o());
        if (aVar.mo36719j() == null) {
            this.f14239a.remove(aVar.mo36722n());
            C8300g gVar = this.f14240b;
            if (gVar != null) {
                gVar.mo31300e();
            }
            DeviceDataProvider.m17631m(aVar);
            m19619j(aVar.mo36718i());
            fVar.mo30329b();
            return;
        }
        String str = AppUtils.f4994r + "user/room/delete";
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mid", C3051a.m7925r().mo23366v());
            jSONObject.put("id", aVar.mo36719j());
            jSONArray.put(jSONObject);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Delete room  params: ");
            sb2.append(jSONArray.toString());
            C3988b.m11572h(str, jSONArray.toString(), String.class, new C8296c(aVar, fVar));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: z */
    public void mo35263z(C8300g gVar) {
        this.f14240b = gVar;
    }
}
