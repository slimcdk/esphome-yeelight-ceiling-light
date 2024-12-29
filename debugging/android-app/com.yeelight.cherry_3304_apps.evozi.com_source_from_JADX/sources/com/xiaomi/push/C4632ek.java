package com.xiaomi.push;

/* renamed from: com.xiaomi.push.ek */
public final class C4632ek {

    /* renamed from: com.xiaomi.push.ek$a */
    public static final class C4633a extends C4620e {

        /* renamed from: a */
        private int f8462a = 0;

        /* renamed from: a */
        private long f8463a = 0;

        /* renamed from: a */
        private String f8464a = "";

        /* renamed from: a */
        private boolean f8465a;

        /* renamed from: b */
        private int f8466b = 1;

        /* renamed from: b */
        private String f8467b = "";

        /* renamed from: b */
        private boolean f8468b;

        /* renamed from: c */
        private int f8469c = 0;

        /* renamed from: c */
        private String f8470c = "";

        /* renamed from: c */
        private boolean f8471c;

        /* renamed from: d */
        private int f8472d = 0;

        /* renamed from: d */
        private String f8473d = "";

        /* renamed from: d */
        private boolean f8474d;

        /* renamed from: e */
        private int f8475e = -1;

        /* renamed from: e */
        private String f8476e = "";

        /* renamed from: e */
        private boolean f8477e;

        /* renamed from: f */
        private String f8478f = "";

        /* renamed from: f */
        private boolean f8479f;

        /* renamed from: g */
        private boolean f8480g;

        /* renamed from: h */
        private boolean f8481h;

        /* renamed from: i */
        private boolean f8482i;

        /* renamed from: j */
        private boolean f8483j;

        /* renamed from: k */
        private boolean f8484k;

        /* renamed from: a */
        public int mo24930a() {
            if (this.f8475e < 0) {
                mo24936b();
            }
            return this.f8475e;
        }

        /* renamed from: a */
        public long m13854a() {
            return this.f8463a;
        }

        /* renamed from: a */
        public C4633a m13856a() {
            this.f8479f = false;
            this.f8473d = "";
            return this;
        }

        /* renamed from: a */
        public C4633a mo24949a(int i) {
            this.f8465a = true;
            this.f8462a = i;
            return this;
        }

        /* renamed from: a */
        public C4633a mo24950a(long j) {
            this.f8468b = true;
            this.f8463a = j;
            return this;
        }

        /* renamed from: a */
        public C4633a m13859a(C4524b bVar) {
            while (true) {
                int a = bVar.mo24757a();
                switch (a) {
                    case 0:
                        return this;
                    case 8:
                        mo24949a(bVar.mo24760b());
                        break;
                    case 16:
                        mo24950a(bVar.mo24760b());
                        break;
                    case 26:
                        mo24951a(bVar.mo24757a());
                        break;
                    case 34:
                        mo24953b(bVar.mo24757a());
                        break;
                    case 42:
                        mo24956c(bVar.mo24757a());
                        break;
                    case 50:
                        mo24959d(bVar.mo24757a());
                        break;
                    case 58:
                        mo24961e(bVar.mo24757a());
                        break;
                    case 64:
                        mo24952b(bVar.mo24760b());
                        break;
                    case 72:
                        mo24955c(bVar.mo24760b());
                        break;
                    case 80:
                        mo24958d(bVar.mo24760b());
                        break;
                    case 90:
                        mo24963f(bVar.mo24757a());
                        break;
                    default:
                        if (mo24935a(bVar, a)) {
                            break;
                        } else {
                            return this;
                        }
                }
            }
        }

        /* renamed from: a */
        public C4633a mo24951a(String str) {
            this.f8471c = true;
            this.f8464a = str;
            return this;
        }

        /* renamed from: a */
        public String m13861a() {
            return this.f8464a;
        }

        /* renamed from: a */
        public void mo24934a(C4554c cVar) {
            if (mo24930a()) {
                cVar.mo24801a(1, mo24954c());
            }
            if (mo24936b()) {
                cVar.mo24817b(2, mo24930a());
            }
            if (mo24954c()) {
                cVar.mo24805a(3, mo24930a());
            }
            if (mo24957d()) {
                cVar.mo24805a(4, mo24936b());
            }
            if (mo24960e()) {
                cVar.mo24805a(5, mo24954c());
            }
            if (mo24962f()) {
                cVar.mo24805a(6, mo24957d());
            }
            if (mo24964g()) {
                cVar.mo24805a(7, mo24960e());
            }
            if (mo24965h()) {
                cVar.mo24801a(8, mo24957d());
            }
            if (mo24966i()) {
                cVar.mo24801a(9, mo24960e());
            }
            if (mo24967j()) {
                cVar.mo24801a(10, mo24962f());
            }
            if (mo24968k()) {
                cVar.mo24805a(11, mo24962f());
            }
        }

        /* renamed from: a */
        public boolean m13863a() {
            return this.f8465a;
        }

        /* renamed from: b */
        public int mo24936b() {
            int i = 0;
            if (mo24930a()) {
                i = 0 + C4554c.mo24801a(1, mo24954c());
            }
            if (mo24936b()) {
                i += C4554c.mo24817b(2, mo24930a());
            }
            if (mo24954c()) {
                i += C4554c.mo24805a(3, mo24930a());
            }
            if (mo24957d()) {
                i += C4554c.mo24805a(4, mo24936b());
            }
            if (mo24960e()) {
                i += C4554c.mo24805a(5, mo24954c());
            }
            if (mo24962f()) {
                i += C4554c.mo24805a(6, mo24957d());
            }
            if (mo24964g()) {
                i += C4554c.mo24805a(7, mo24960e());
            }
            if (mo24965h()) {
                i += C4554c.mo24801a(8, mo24957d());
            }
            if (mo24966i()) {
                i += C4554c.mo24801a(9, mo24960e());
            }
            if (mo24967j()) {
                i += C4554c.mo24801a(10, mo24962f());
            }
            if (mo24968k()) {
                i += C4554c.mo24805a(11, mo24962f());
            }
            this.f8475e = i;
            return i;
        }

        /* renamed from: b */
        public C4633a mo24952b(int i) {
            this.f8481h = true;
            this.f8466b = i;
            return this;
        }

        /* renamed from: b */
        public C4633a mo24953b(String str) {
            this.f8474d = true;
            this.f8467b = str;
            return this;
        }

        /* renamed from: b */
        public String m13867b() {
            return this.f8467b;
        }

        /* renamed from: b */
        public boolean m13868b() {
            return this.f8468b;
        }

        /* renamed from: c */
        public int mo24954c() {
            return this.f8462a;
        }

        /* renamed from: c */
        public C4633a mo24955c(int i) {
            this.f8482i = true;
            this.f8469c = i;
            return this;
        }

        /* renamed from: c */
        public C4633a mo24956c(String str) {
            this.f8477e = true;
            this.f8470c = str;
            return this;
        }

        /* renamed from: c */
        public String m13872c() {
            return this.f8470c;
        }

        /* renamed from: c */
        public boolean m13873c() {
            return this.f8471c;
        }

        /* renamed from: d */
        public int mo24957d() {
            return this.f8466b;
        }

        /* renamed from: d */
        public C4633a mo24958d(int i) {
            this.f8483j = true;
            this.f8472d = i;
            return this;
        }

        /* renamed from: d */
        public C4633a mo24959d(String str) {
            this.f8479f = true;
            this.f8473d = str;
            return this;
        }

        /* renamed from: d */
        public String m13877d() {
            return this.f8473d;
        }

        /* renamed from: d */
        public boolean m13878d() {
            return this.f8474d;
        }

        /* renamed from: e */
        public int mo24960e() {
            return this.f8469c;
        }

        /* renamed from: e */
        public C4633a mo24961e(String str) {
            this.f8480g = true;
            this.f8476e = str;
            return this;
        }

        /* renamed from: e */
        public String m13881e() {
            return this.f8476e;
        }

        /* renamed from: e */
        public boolean m13882e() {
            return this.f8477e;
        }

        /* renamed from: f */
        public int mo24962f() {
            return this.f8472d;
        }

        /* renamed from: f */
        public C4633a mo24963f(String str) {
            this.f8484k = true;
            this.f8478f = str;
            return this;
        }

        /* renamed from: f */
        public String m13885f() {
            return this.f8478f;
        }

        /* renamed from: f */
        public boolean m13886f() {
            return this.f8479f;
        }

        /* renamed from: g */
        public boolean mo24964g() {
            return this.f8480g;
        }

        /* renamed from: h */
        public boolean mo24965h() {
            return this.f8481h;
        }

        /* renamed from: i */
        public boolean mo24966i() {
            return this.f8482i;
        }

        /* renamed from: j */
        public boolean mo24967j() {
            return this.f8483j;
        }

        /* renamed from: k */
        public boolean mo24968k() {
            return this.f8484k;
        }
    }

    /* renamed from: com.xiaomi.push.ek$b */
    public static final class C4634b extends C4620e {

        /* renamed from: a */
        private int f8485a = 0;

        /* renamed from: a */
        private boolean f8486a;

        /* renamed from: b */
        private int f8487b = 0;

        /* renamed from: b */
        private boolean f8488b = false;

        /* renamed from: c */
        private int f8489c = 0;

        /* renamed from: c */
        private boolean f8490c;

        /* renamed from: d */
        private int f8491d = -1;

        /* renamed from: d */
        private boolean f8492d;

        /* renamed from: e */
        private boolean f8493e;

        /* renamed from: a */
        public static C4634b m13892a(byte[] bArr) {
            return (C4634b) new C4634b().mo24932a(bArr);
        }

        /* renamed from: a */
        public int mo24930a() {
            if (this.f8491d < 0) {
                mo24936b();
            }
            return this.f8491d;
        }

        /* renamed from: a */
        public C4634b mo24969a(int i) {
            this.f8490c = true;
            this.f8485a = i;
            return this;
        }

        /* renamed from: a */
        public C4634b m13896a(C4524b bVar) {
            while (true) {
                int a = bVar.mo24757a();
                if (a == 0) {
                    return this;
                }
                if (a == 8) {
                    mo24970a(bVar.mo24757a());
                } else if (a == 24) {
                    mo24969a(bVar.mo24760b());
                } else if (a == 32) {
                    mo24971b(bVar.mo24760b());
                } else if (a == 40) {
                    mo24973c(bVar.mo24760b());
                } else if (!mo24935a(bVar, a)) {
                    return this;
                }
            }
        }

        /* renamed from: a */
        public C4634b mo24970a(boolean z) {
            this.f8486a = true;
            this.f8488b = z;
            return this;
        }

        /* renamed from: a */
        public void mo24934a(C4554c cVar) {
            if (mo24936b()) {
                cVar.mo24806a(1, mo24930a());
            }
            if (mo24972c()) {
                cVar.mo24801a(3, mo24972c());
            }
            if (mo24974d()) {
                cVar.mo24801a(4, mo24974d());
            }
            if (mo24975e()) {
                cVar.mo24801a(5, mo24975e());
            }
        }

        /* renamed from: a */
        public boolean m13899a() {
            return this.f8488b;
        }

        /* renamed from: b */
        public int mo24936b() {
            int i = 0;
            if (mo24936b()) {
                i = 0 + C4554c.mo24806a(1, mo24930a());
            }
            if (mo24972c()) {
                i += C4554c.mo24801a(3, mo24972c());
            }
            if (mo24974d()) {
                i += C4554c.mo24801a(4, mo24974d());
            }
            if (mo24975e()) {
                i += C4554c.mo24801a(5, mo24975e());
            }
            this.f8491d = i;
            return i;
        }

        /* renamed from: b */
        public C4634b mo24971b(int i) {
            this.f8492d = true;
            this.f8487b = i;
            return this;
        }

        /* renamed from: b */
        public boolean m13902b() {
            return this.f8486a;
        }

        /* renamed from: c */
        public int mo24972c() {
            return this.f8485a;
        }

        /* renamed from: c */
        public C4634b mo24973c(int i) {
            this.f8493e = true;
            this.f8489c = i;
            return this;
        }

        /* renamed from: c */
        public boolean m13905c() {
            return this.f8490c;
        }

        /* renamed from: d */
        public int mo24974d() {
            return this.f8487b;
        }

        /* renamed from: d */
        public boolean m13907d() {
            return this.f8492d;
        }

        /* renamed from: e */
        public int mo24975e() {
            return this.f8489c;
        }

        /* renamed from: e */
        public boolean m13909e() {
            return this.f8493e;
        }
    }

    /* renamed from: com.xiaomi.push.ek$c */
    public static final class C4635c extends C4620e {

        /* renamed from: a */
        private int f8494a = -1;

        /* renamed from: a */
        private String f8495a = "";

        /* renamed from: a */
        private boolean f8496a;

        /* renamed from: b */
        private String f8497b = "";

        /* renamed from: b */
        private boolean f8498b;

        /* renamed from: c */
        private String f8499c = "";

        /* renamed from: c */
        private boolean f8500c;

        /* renamed from: d */
        private String f8501d = "";

        /* renamed from: d */
        private boolean f8502d;

        /* renamed from: e */
        private String f8503e = "";

        /* renamed from: e */
        private boolean f8504e;

        /* renamed from: f */
        private String f8505f = "";

        /* renamed from: f */
        private boolean f8506f;

        /* renamed from: a */
        public int mo24930a() {
            if (this.f8494a < 0) {
                mo24936b();
            }
            return this.f8494a;
        }

        /* renamed from: a */
        public C4635c m13912a(C4524b bVar) {
            while (true) {
                int a = bVar.mo24757a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    mo24976a(bVar.mo24757a());
                } else if (a == 18) {
                    mo24977b(bVar.mo24757a());
                } else if (a == 26) {
                    mo24978c(bVar.mo24757a());
                } else if (a == 34) {
                    mo24980d(bVar.mo24757a());
                } else if (a == 42) {
                    mo24982e(bVar.mo24757a());
                } else if (a == 50) {
                    mo24984f(bVar.mo24757a());
                } else if (!mo24935a(bVar, a)) {
                    return this;
                }
            }
        }

        /* renamed from: a */
        public C4635c mo24976a(String str) {
            this.f8496a = true;
            this.f8495a = str;
            return this;
        }

        /* renamed from: a */
        public String m13914a() {
            return this.f8495a;
        }

        /* renamed from: a */
        public void mo24934a(C4554c cVar) {
            if (mo24930a()) {
                cVar.mo24805a(1, mo24930a());
            }
            if (mo24936b()) {
                cVar.mo24805a(2, mo24936b());
            }
            if (mo24979c()) {
                cVar.mo24805a(3, mo24979c());
            }
            if (mo24981d()) {
                cVar.mo24805a(4, mo24981d());
            }
            if (mo24983e()) {
                cVar.mo24805a(5, mo24983e());
            }
            if (mo24985f()) {
                cVar.mo24805a(6, mo24985f());
            }
        }

        /* renamed from: a */
        public boolean m13916a() {
            return this.f8496a;
        }

        /* renamed from: b */
        public int mo24936b() {
            int i = 0;
            if (mo24930a()) {
                i = 0 + C4554c.mo24805a(1, mo24930a());
            }
            if (mo24936b()) {
                i += C4554c.mo24805a(2, mo24936b());
            }
            if (mo24979c()) {
                i += C4554c.mo24805a(3, mo24979c());
            }
            if (mo24981d()) {
                i += C4554c.mo24805a(4, mo24981d());
            }
            if (mo24983e()) {
                i += C4554c.mo24805a(5, mo24983e());
            }
            if (mo24985f()) {
                i += C4554c.mo24805a(6, mo24985f());
            }
            this.f8494a = i;
            return i;
        }

        /* renamed from: b */
        public C4635c mo24977b(String str) {
            this.f8498b = true;
            this.f8497b = str;
            return this;
        }

        /* renamed from: b */
        public String m13919b() {
            return this.f8497b;
        }

        /* renamed from: b */
        public boolean m13920b() {
            return this.f8498b;
        }

        /* renamed from: c */
        public C4635c mo24978c(String str) {
            this.f8500c = true;
            this.f8499c = str;
            return this;
        }

        /* renamed from: c */
        public String mo24979c() {
            return this.f8499c;
        }

        /* renamed from: c */
        public boolean m13923c() {
            return this.f8500c;
        }

        /* renamed from: d */
        public C4635c mo24980d(String str) {
            this.f8502d = true;
            this.f8501d = str;
            return this;
        }

        /* renamed from: d */
        public String mo24981d() {
            return this.f8501d;
        }

        /* renamed from: d */
        public boolean m13926d() {
            return this.f8502d;
        }

        /* renamed from: e */
        public C4635c mo24982e(String str) {
            this.f8504e = true;
            this.f8503e = str;
            return this;
        }

        /* renamed from: e */
        public String mo24983e() {
            return this.f8503e;
        }

        /* renamed from: e */
        public boolean m13929e() {
            return this.f8504e;
        }

        /* renamed from: f */
        public C4635c mo24984f(String str) {
            this.f8506f = true;
            this.f8505f = str;
            return this;
        }

        /* renamed from: f */
        public String mo24985f() {
            return this.f8505f;
        }

        /* renamed from: f */
        public boolean m13932f() {
            return this.f8506f;
        }
    }

    /* renamed from: com.xiaomi.push.ek$d */
    public static final class C4636d extends C4620e {

        /* renamed from: a */
        private int f8507a = -1;

        /* renamed from: a */
        private String f8508a = "";

        /* renamed from: a */
        private boolean f8509a;

        /* renamed from: b */
        private String f8510b = "";

        /* renamed from: b */
        private boolean f8511b = false;

        /* renamed from: c */
        private String f8512c = "";

        /* renamed from: c */
        private boolean f8513c;

        /* renamed from: d */
        private boolean f8514d;

        /* renamed from: e */
        private boolean f8515e;

        /* renamed from: a */
        public static C4636d m13933a(byte[] bArr) {
            return (C4636d) new C4636d().mo24932a(bArr);
        }

        /* renamed from: a */
        public int mo24930a() {
            if (this.f8507a < 0) {
                mo24936b();
            }
            return this.f8507a;
        }

        /* renamed from: a */
        public C4636d m13936a(C4524b bVar) {
            while (true) {
                int a = bVar.mo24757a();
                if (a == 0) {
                    return this;
                }
                if (a == 8) {
                    mo24987a(bVar.mo24757a());
                } else if (a == 18) {
                    mo24986a(bVar.mo24757a());
                } else if (a == 26) {
                    mo24988b(bVar.mo24757a());
                } else if (a == 34) {
                    mo24989c(bVar.mo24757a());
                } else if (!mo24935a(bVar, a)) {
                    return this;
                }
            }
        }

        /* renamed from: a */
        public C4636d mo24986a(String str) {
            this.f8513c = true;
            this.f8508a = str;
            return this;
        }

        /* renamed from: a */
        public C4636d mo24987a(boolean z) {
            this.f8509a = true;
            this.f8511b = z;
            return this;
        }

        /* renamed from: a */
        public String m13939a() {
            return this.f8508a;
        }

        /* renamed from: a */
        public void mo24934a(C4554c cVar) {
            if (mo24936b()) {
                cVar.mo24806a(1, mo24930a());
            }
            if (mo24990c()) {
                cVar.mo24805a(2, mo24930a());
            }
            if (mo24991d()) {
                cVar.mo24805a(3, mo24936b());
            }
            if (mo24992e()) {
                cVar.mo24805a(4, mo24990c());
            }
        }

        /* renamed from: a */
        public boolean m13941a() {
            return this.f8511b;
        }

        /* renamed from: b */
        public int mo24936b() {
            int i = 0;
            if (mo24936b()) {
                i = 0 + C4554c.mo24806a(1, mo24930a());
            }
            if (mo24990c()) {
                i += C4554c.mo24805a(2, mo24930a());
            }
            if (mo24991d()) {
                i += C4554c.mo24805a(3, mo24936b());
            }
            if (mo24992e()) {
                i += C4554c.mo24805a(4, mo24990c());
            }
            this.f8507a = i;
            return i;
        }

        /* renamed from: b */
        public C4636d mo24988b(String str) {
            this.f8514d = true;
            this.f8510b = str;
            return this;
        }

        /* renamed from: b */
        public String m13944b() {
            return this.f8510b;
        }

        /* renamed from: b */
        public boolean m13945b() {
            return this.f8509a;
        }

        /* renamed from: c */
        public C4636d mo24989c(String str) {
            this.f8515e = true;
            this.f8512c = str;
            return this;
        }

        /* renamed from: c */
        public String mo24990c() {
            return this.f8512c;
        }

        /* renamed from: c */
        public boolean m13948c() {
            return this.f8513c;
        }

        /* renamed from: d */
        public boolean mo24991d() {
            return this.f8514d;
        }

        /* renamed from: e */
        public boolean mo24992e() {
            return this.f8515e;
        }
    }

    /* renamed from: com.xiaomi.push.ek$e */
    public static final class C4637e extends C4620e {

        /* renamed from: a */
        private int f8516a = 0;

        /* renamed from: a */
        private C4634b f8517a = null;

        /* renamed from: a */
        private String f8518a = "";

        /* renamed from: a */
        private boolean f8519a;

        /* renamed from: b */
        private int f8520b = 0;

        /* renamed from: b */
        private String f8521b = "";

        /* renamed from: b */
        private boolean f8522b;

        /* renamed from: c */
        private int f8523c = 0;

        /* renamed from: c */
        private String f8524c = "";

        /* renamed from: c */
        private boolean f8525c;

        /* renamed from: d */
        private int f8526d = -1;

        /* renamed from: d */
        private String f8527d = "";

        /* renamed from: d */
        private boolean f8528d;

        /* renamed from: e */
        private String f8529e = "";

        /* renamed from: e */
        private boolean f8530e;

        /* renamed from: f */
        private String f8531f = "";

        /* renamed from: f */
        private boolean f8532f;

        /* renamed from: g */
        private boolean f8533g;

        /* renamed from: h */
        private boolean f8534h;

        /* renamed from: i */
        private boolean f8535i;

        /* renamed from: j */
        private boolean f8536j;

        /* renamed from: a */
        public int mo24930a() {
            if (this.f8526d < 0) {
                mo24936b();
            }
            return this.f8526d;
        }

        /* renamed from: a */
        public C4634b m13953a() {
            return this.f8517a;
        }

        /* renamed from: a */
        public C4637e mo24993a(int i) {
            this.f8519a = true;
            this.f8516a = i;
            return this;
        }

        /* renamed from: a */
        public C4637e m13955a(C4524b bVar) {
            while (true) {
                int a = bVar.mo24757a();
                switch (a) {
                    case 0:
                        return this;
                    case 8:
                        mo24993a(bVar.mo24762c());
                        break;
                    case 18:
                        mo24995a(bVar.mo24757a());
                        break;
                    case 26:
                        mo24997b(bVar.mo24757a());
                        break;
                    case 34:
                        mo25000c(bVar.mo24757a());
                        break;
                    case 40:
                        mo24996b(bVar.mo24760b());
                        break;
                    case 50:
                        mo25002d(bVar.mo24757a());
                        break;
                    case 58:
                        mo25004e(bVar.mo24757a());
                        break;
                    case 66:
                        mo25005f(bVar.mo24757a());
                        break;
                    case 74:
                        C4634b bVar2 = new C4634b();
                        bVar.mo24759a((C4620e) bVar2);
                        mo24994a(bVar2);
                        break;
                    case 80:
                        mo24999c(bVar.mo24760b());
                        break;
                    default:
                        if (mo24935a(bVar, a)) {
                            break;
                        } else {
                            return this;
                        }
                }
            }
        }

        /* renamed from: a */
        public C4637e mo24994a(C4634b bVar) {
            if (bVar != null) {
                this.f8535i = true;
                this.f8517a = bVar;
                return this;
            }
            throw null;
        }

        /* renamed from: a */
        public C4637e mo24995a(String str) {
            this.f8522b = true;
            this.f8518a = str;
            return this;
        }

        /* renamed from: a */
        public String m13958a() {
            return this.f8518a;
        }

        /* renamed from: a */
        public void mo24934a(C4554c cVar) {
            if (mo24930a()) {
                cVar.mo24816b(1, mo24998c());
            }
            if (mo24936b()) {
                cVar.mo24805a(2, mo24930a());
            }
            if (mo24998c()) {
                cVar.mo24805a(3, mo24936b());
            }
            if (mo25001d()) {
                cVar.mo24805a(4, mo24998c());
            }
            if (mo25003e()) {
                cVar.mo24801a(5, mo25001d());
            }
            if (mo25006f()) {
                cVar.mo24805a(6, mo25001d());
            }
            if (mo25007g()) {
                cVar.mo24805a(7, mo25003e());
            }
            if (mo25008h()) {
                cVar.mo24805a(8, mo25006f());
            }
            if (mo25009i()) {
                cVar.mo24804a(9, (C4620e) mo24930a());
            }
            if (mo25010j()) {
                cVar.mo24801a(10, mo25003e());
            }
        }

        /* renamed from: a */
        public boolean m13960a() {
            return this.f8519a;
        }

        /* renamed from: b */
        public int mo24936b() {
            int i = 0;
            if (mo24930a()) {
                i = 0 + C4554c.mo24816b(1, mo24998c());
            }
            if (mo24936b()) {
                i += C4554c.mo24805a(2, mo24930a());
            }
            if (mo24998c()) {
                i += C4554c.mo24805a(3, mo24936b());
            }
            if (mo25001d()) {
                i += C4554c.mo24805a(4, mo24998c());
            }
            if (mo25003e()) {
                i += C4554c.mo24801a(5, mo25001d());
            }
            if (mo25006f()) {
                i += C4554c.mo24805a(6, mo25001d());
            }
            if (mo25007g()) {
                i += C4554c.mo24805a(7, mo25003e());
            }
            if (mo25008h()) {
                i += C4554c.mo24805a(8, mo25006f());
            }
            if (mo25009i()) {
                i += C4554c.mo24804a(9, (C4620e) mo24930a());
            }
            if (mo25010j()) {
                i += C4554c.mo24801a(10, mo25003e());
            }
            this.f8526d = i;
            return i;
        }

        /* renamed from: b */
        public C4637e mo24996b(int i) {
            this.f8530e = true;
            this.f8520b = i;
            return this;
        }

        /* renamed from: b */
        public C4637e mo24997b(String str) {
            this.f8525c = true;
            this.f8521b = str;
            return this;
        }

        /* renamed from: b */
        public String m13964b() {
            return this.f8521b;
        }

        /* renamed from: b */
        public boolean m13965b() {
            return this.f8522b;
        }

        /* renamed from: c */
        public int mo24998c() {
            return this.f8516a;
        }

        /* renamed from: c */
        public C4637e mo24999c(int i) {
            this.f8536j = true;
            this.f8523c = i;
            return this;
        }

        /* renamed from: c */
        public C4637e mo25000c(String str) {
            this.f8528d = true;
            this.f8524c = str;
            return this;
        }

        /* renamed from: c */
        public String m13969c() {
            return this.f8524c;
        }

        /* renamed from: c */
        public boolean m13970c() {
            return this.f8525c;
        }

        /* renamed from: d */
        public int mo25001d() {
            return this.f8520b;
        }

        /* renamed from: d */
        public C4637e mo25002d(String str) {
            this.f8532f = true;
            this.f8527d = str;
            return this;
        }

        /* renamed from: d */
        public String m13973d() {
            return this.f8527d;
        }

        /* renamed from: d */
        public boolean m13974d() {
            return this.f8528d;
        }

        /* renamed from: e */
        public int mo25003e() {
            return this.f8523c;
        }

        /* renamed from: e */
        public C4637e mo25004e(String str) {
            this.f8533g = true;
            this.f8529e = str;
            return this;
        }

        /* renamed from: e */
        public String m13977e() {
            return this.f8529e;
        }

        /* renamed from: e */
        public boolean m13978e() {
            return this.f8530e;
        }

        /* renamed from: f */
        public C4637e mo25005f(String str) {
            this.f8534h = true;
            this.f8531f = str;
            return this;
        }

        /* renamed from: f */
        public String mo25006f() {
            return this.f8531f;
        }

        /* renamed from: f */
        public boolean m13981f() {
            return this.f8532f;
        }

        /* renamed from: g */
        public boolean mo25007g() {
            return this.f8533g;
        }

        /* renamed from: h */
        public boolean mo25008h() {
            return this.f8534h;
        }

        /* renamed from: i */
        public boolean mo25009i() {
            return this.f8535i;
        }

        /* renamed from: j */
        public boolean mo25010j() {
            return this.f8536j;
        }
    }

    /* renamed from: com.xiaomi.push.ek$f */
    public static final class C4638f extends C4620e {

        /* renamed from: a */
        private int f8537a = -1;

        /* renamed from: a */
        private C4634b f8538a = null;

        /* renamed from: a */
        private String f8539a = "";

        /* renamed from: a */
        private boolean f8540a;

        /* renamed from: b */
        private String f8541b = "";

        /* renamed from: b */
        private boolean f8542b;

        /* renamed from: c */
        private boolean f8543c;

        /* renamed from: a */
        public static C4638f m13986a(byte[] bArr) {
            return (C4638f) new C4638f().mo24932a(bArr);
        }

        /* renamed from: a */
        public int mo24930a() {
            if (this.f8537a < 0) {
                mo24936b();
            }
            return this.f8537a;
        }

        /* renamed from: a */
        public C4634b m13989a() {
            return this.f8538a;
        }

        /* renamed from: a */
        public C4638f m13990a(C4524b bVar) {
            while (true) {
                int a = bVar.mo24757a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    mo25012a(bVar.mo24757a());
                } else if (a == 18) {
                    mo25013b(bVar.mo24757a());
                } else if (a == 26) {
                    C4634b bVar2 = new C4634b();
                    bVar.mo24759a((C4620e) bVar2);
                    mo25011a(bVar2);
                } else if (!mo24935a(bVar, a)) {
                    return this;
                }
            }
        }

        /* renamed from: a */
        public C4638f mo25011a(C4634b bVar) {
            if (bVar != null) {
                this.f8543c = true;
                this.f8538a = bVar;
                return this;
            }
            throw null;
        }

        /* renamed from: a */
        public C4638f mo25012a(String str) {
            this.f8540a = true;
            this.f8539a = str;
            return this;
        }

        /* renamed from: a */
        public String m13993a() {
            return this.f8539a;
        }

        /* renamed from: a */
        public void mo24934a(C4554c cVar) {
            if (mo24930a()) {
                cVar.mo24805a(1, mo24930a());
            }
            if (mo24936b()) {
                cVar.mo24805a(2, mo24936b());
            }
            if (mo25014c()) {
                cVar.mo24804a(3, (C4620e) mo24930a());
            }
        }

        /* renamed from: a */
        public boolean m13995a() {
            return this.f8540a;
        }

        /* renamed from: b */
        public int mo24936b() {
            int i = 0;
            if (mo24930a()) {
                i = 0 + C4554c.mo24805a(1, mo24930a());
            }
            if (mo24936b()) {
                i += C4554c.mo24805a(2, mo24936b());
            }
            if (mo25014c()) {
                i += C4554c.mo24804a(3, (C4620e) mo24930a());
            }
            this.f8537a = i;
            return i;
        }

        /* renamed from: b */
        public C4638f mo25013b(String str) {
            this.f8542b = true;
            this.f8541b = str;
            return this;
        }

        /* renamed from: b */
        public String m13998b() {
            return this.f8541b;
        }

        /* renamed from: b */
        public boolean m13999b() {
            return this.f8542b;
        }

        /* renamed from: c */
        public boolean mo25014c() {
            return this.f8543c;
        }
    }

    /* renamed from: com.xiaomi.push.ek$g */
    public static final class C4639g extends C4620e {

        /* renamed from: a */
        private int f8544a = -1;

        /* renamed from: a */
        private String f8545a = "";

        /* renamed from: a */
        private boolean f8546a;

        /* renamed from: b */
        private String f8547b = "";

        /* renamed from: b */
        private boolean f8548b;

        /* renamed from: c */
        private String f8549c = "";

        /* renamed from: c */
        private boolean f8550c;

        /* renamed from: a */
        public static C4639g m14001a(byte[] bArr) {
            return (C4639g) new C4639g().mo24932a(bArr);
        }

        /* renamed from: a */
        public int mo24930a() {
            if (this.f8544a < 0) {
                mo24936b();
            }
            return this.f8544a;
        }

        /* renamed from: a */
        public C4639g m14004a(C4524b bVar) {
            while (true) {
                int a = bVar.mo24757a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    mo25015a(bVar.mo24757a());
                } else if (a == 18) {
                    mo25016b(bVar.mo24757a());
                } else if (a == 26) {
                    mo25017c(bVar.mo24757a());
                } else if (!mo24935a(bVar, a)) {
                    return this;
                }
            }
        }

        /* renamed from: a */
        public C4639g mo25015a(String str) {
            this.f8546a = true;
            this.f8545a = str;
            return this;
        }

        /* renamed from: a */
        public String m14006a() {
            return this.f8545a;
        }

        /* renamed from: a */
        public void mo24934a(C4554c cVar) {
            if (mo24930a()) {
                cVar.mo24805a(1, mo24930a());
            }
            if (mo24936b()) {
                cVar.mo24805a(2, mo24936b());
            }
            if (mo25018c()) {
                cVar.mo24805a(3, mo25018c());
            }
        }

        /* renamed from: a */
        public boolean m14008a() {
            return this.f8546a;
        }

        /* renamed from: b */
        public int mo24936b() {
            int i = 0;
            if (mo24930a()) {
                i = 0 + C4554c.mo24805a(1, mo24930a());
            }
            if (mo24936b()) {
                i += C4554c.mo24805a(2, mo24936b());
            }
            if (mo25018c()) {
                i += C4554c.mo24805a(3, mo25018c());
            }
            this.f8544a = i;
            return i;
        }

        /* renamed from: b */
        public C4639g mo25016b(String str) {
            this.f8548b = true;
            this.f8547b = str;
            return this;
        }

        /* renamed from: b */
        public String m14011b() {
            return this.f8547b;
        }

        /* renamed from: b */
        public boolean m14012b() {
            return this.f8548b;
        }

        /* renamed from: c */
        public C4639g mo25017c(String str) {
            this.f8550c = true;
            this.f8549c = str;
            return this;
        }

        /* renamed from: c */
        public String mo25018c() {
            return this.f8549c;
        }

        /* renamed from: c */
        public boolean m14015c() {
            return this.f8550c;
        }
    }

    /* renamed from: com.xiaomi.push.ek$h */
    public static final class C4640h extends C4620e {

        /* renamed from: a */
        private int f8551a = 0;

        /* renamed from: a */
        private String f8552a = "";

        /* renamed from: a */
        private boolean f8553a;

        /* renamed from: b */
        private int f8554b = -1;

        /* renamed from: b */
        private boolean f8555b;

        /* renamed from: a */
        public static C4640h m14016a(byte[] bArr) {
            return (C4640h) new C4640h().mo24932a(bArr);
        }

        /* renamed from: a */
        public int mo24930a() {
            if (this.f8554b < 0) {
                mo24936b();
            }
            return this.f8554b;
        }

        /* renamed from: a */
        public C4640h mo25019a(int i) {
            this.f8553a = true;
            this.f8551a = i;
            return this;
        }

        /* renamed from: a */
        public C4640h m14020a(C4524b bVar) {
            while (true) {
                int a = bVar.mo24757a();
                if (a == 0) {
                    return this;
                }
                if (a == 8) {
                    mo25019a(bVar.mo24760b());
                } else if (a == 18) {
                    mo25020a(bVar.mo24757a());
                } else if (!mo24935a(bVar, a)) {
                    return this;
                }
            }
        }

        /* renamed from: a */
        public C4640h mo25020a(String str) {
            this.f8555b = true;
            this.f8552a = str;
            return this;
        }

        /* renamed from: a */
        public String m14022a() {
            return this.f8552a;
        }

        /* renamed from: a */
        public void mo24934a(C4554c cVar) {
            if (mo24930a()) {
                cVar.mo24801a(1, mo25021c());
            }
            if (mo24936b()) {
                cVar.mo24805a(2, mo24930a());
            }
        }

        /* renamed from: a */
        public boolean m14024a() {
            return this.f8553a;
        }

        /* renamed from: b */
        public int mo24936b() {
            int i = 0;
            if (mo24930a()) {
                i = 0 + C4554c.mo24801a(1, mo25021c());
            }
            if (mo24936b()) {
                i += C4554c.mo24805a(2, mo24930a());
            }
            this.f8554b = i;
            return i;
        }

        /* renamed from: b */
        public boolean m14026b() {
            return this.f8555b;
        }

        /* renamed from: c */
        public int mo25021c() {
            return this.f8551a;
        }
    }

    /* renamed from: com.xiaomi.push.ek$i */
    public static final class C4641i extends C4620e {

        /* renamed from: a */
        private int f8556a = -1;

        /* renamed from: a */
        private C4489a f8557a = C4489a.f8138a;

        /* renamed from: a */
        private boolean f8558a;

        /* renamed from: a */
        public static C4641i m14028a(byte[] bArr) {
            return (C4641i) new C4641i().mo24932a(bArr);
        }

        /* renamed from: a */
        public int mo24930a() {
            if (this.f8556a < 0) {
                mo24936b();
            }
            return this.f8556a;
        }

        /* renamed from: a */
        public C4489a m14030a() {
            return this.f8557a;
        }

        /* renamed from: a */
        public C4641i mo25022a(C4489a aVar) {
            this.f8558a = true;
            this.f8557a = aVar;
            return this;
        }

        /* renamed from: a */
        public C4641i m14033a(C4524b bVar) {
            while (true) {
                int a = bVar.mo24757a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    mo25022a(bVar.mo24757a());
                } else if (!mo24935a(bVar, a)) {
                    return this;
                }
            }
        }

        /* renamed from: a */
        public void mo24934a(C4554c cVar) {
            if (mo24930a()) {
                cVar.mo24803a(1, mo24930a());
            }
        }

        /* renamed from: a */
        public boolean m14035a() {
            return this.f8558a;
        }

        /* renamed from: b */
        public int mo24936b() {
            int i = 0;
            if (mo24930a()) {
                i = 0 + C4554c.mo24803a(1, mo24930a());
            }
            this.f8556a = i;
            return i;
        }
    }

    /* renamed from: com.xiaomi.push.ek$j */
    public static final class C4642j extends C4620e {

        /* renamed from: a */
        private int f8559a = -1;

        /* renamed from: a */
        private C4489a f8560a = C4489a.f8138a;

        /* renamed from: a */
        private C4634b f8561a = null;

        /* renamed from: a */
        private boolean f8562a;

        /* renamed from: b */
        private boolean f8563b;

        /* renamed from: a */
        public static C4642j m14037a(byte[] bArr) {
            return (C4642j) new C4642j().mo24932a(bArr);
        }

        /* renamed from: a */
        public int mo24930a() {
            if (this.f8559a < 0) {
                mo24936b();
            }
            return this.f8559a;
        }

        /* renamed from: a */
        public C4489a m14039a() {
            return this.f8560a;
        }

        /* renamed from: a */
        public C4634b m14041a() {
            return this.f8561a;
        }

        /* renamed from: a */
        public C4642j mo25023a(C4489a aVar) {
            this.f8562a = true;
            this.f8560a = aVar;
            return this;
        }

        /* renamed from: a */
        public C4642j m14043a(C4524b bVar) {
            while (true) {
                int a = bVar.mo24757a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    mo25023a(bVar.mo24757a());
                } else if (a == 18) {
                    C4634b bVar2 = new C4634b();
                    bVar.mo24759a((C4620e) bVar2);
                    mo25024a(bVar2);
                } else if (!mo24935a(bVar, a)) {
                    return this;
                }
            }
        }

        /* renamed from: a */
        public C4642j mo25024a(C4634b bVar) {
            if (bVar != null) {
                this.f8563b = true;
                this.f8561a = bVar;
                return this;
            }
            throw null;
        }

        /* renamed from: a */
        public void mo24934a(C4554c cVar) {
            if (mo24930a()) {
                cVar.mo24803a(1, mo24930a());
            }
            if (mo24936b()) {
                cVar.mo24804a(2, (C4620e) mo24930a());
            }
        }

        /* renamed from: a */
        public boolean m14046a() {
            return this.f8562a;
        }

        /* renamed from: b */
        public int mo24936b() {
            int i = 0;
            if (mo24930a()) {
                i = 0 + C4554c.mo24803a(1, mo24930a());
            }
            if (mo24936b()) {
                i += C4554c.mo24804a(2, (C4620e) mo24930a());
            }
            this.f8559a = i;
            return i;
        }

        /* renamed from: b */
        public boolean m14048b() {
            return this.f8563b;
        }
    }

    /* renamed from: com.xiaomi.push.ek$k */
    public static final class C4643k extends C4620e {

        /* renamed from: a */
        private int f8564a = 0;

        /* renamed from: a */
        private long f8565a = 0;

        /* renamed from: a */
        private String f8566a = "";

        /* renamed from: a */
        private boolean f8567a;

        /* renamed from: b */
        private int f8568b = -1;

        /* renamed from: b */
        private long f8569b = 0;

        /* renamed from: b */
        private String f8570b = "";

        /* renamed from: b */
        private boolean f8571b;

        /* renamed from: c */
        private boolean f8572c;

        /* renamed from: d */
        private boolean f8573d;

        /* renamed from: e */
        private boolean f8574e;

        /* renamed from: f */
        private boolean f8575f = false;

        /* renamed from: g */
        private boolean f8576g;

        /* renamed from: a */
        public static C4643k m14049a(byte[] bArr) {
            return (C4643k) new C4643k().mo24932a(bArr);
        }

        /* renamed from: a */
        public int mo24930a() {
            if (this.f8568b < 0) {
                mo24936b();
            }
            return this.f8568b;
        }

        /* renamed from: a */
        public long m14051a() {
            return this.f8565a;
        }

        /* renamed from: a */
        public C4643k mo25025a(int i) {
            this.f8576g = true;
            this.f8564a = i;
            return this;
        }

        /* renamed from: a */
        public C4643k mo25026a(long j) {
            this.f8572c = true;
            this.f8565a = j;
            return this;
        }

        /* renamed from: a */
        public C4643k m14055a(C4524b bVar) {
            while (true) {
                int a = bVar.mo24757a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    mo25027a(bVar.mo24757a());
                } else if (a == 18) {
                    mo25030b(bVar.mo24757a());
                } else if (a == 24) {
                    mo25026a(bVar.mo24757a());
                } else if (a == 32) {
                    mo25029b(bVar.mo24757a());
                } else if (a == 40) {
                    mo25028a(bVar.mo24757a());
                } else if (a == 48) {
                    mo25025a(bVar.mo24760b());
                } else if (!mo24935a(bVar, a)) {
                    return this;
                }
            }
        }

        /* renamed from: a */
        public C4643k mo25027a(String str) {
            this.f8567a = true;
            this.f8566a = str;
            return this;
        }

        /* renamed from: a */
        public C4643k mo25028a(boolean z) {
            this.f8574e = true;
            this.f8575f = z;
            return this;
        }

        /* renamed from: a */
        public String m14058a() {
            return this.f8566a;
        }

        /* renamed from: a */
        public void mo24934a(C4554c cVar) {
            if (mo24930a()) {
                cVar.mo24805a(1, mo24930a());
            }
            if (mo24936b()) {
                cVar.mo24805a(2, mo24936b());
            }
            if (mo25031c()) {
                cVar.mo24802a(3, mo24930a());
            }
            if (mo25032d()) {
                cVar.mo24802a(4, mo24936b());
            }
            if (mo25034f()) {
                cVar.mo24806a(5, mo25033e());
            }
            if (mo25035g()) {
                cVar.mo24801a(6, mo25031c());
            }
        }

        /* renamed from: a */
        public boolean m14060a() {
            return this.f8567a;
        }

        /* renamed from: b */
        public int mo24936b() {
            int i = 0;
            if (mo24930a()) {
                i = 0 + C4554c.mo24805a(1, mo24930a());
            }
            if (mo24936b()) {
                i += C4554c.mo24805a(2, mo24936b());
            }
            if (mo25031c()) {
                i += C4554c.mo24802a(3, mo24930a());
            }
            if (mo25032d()) {
                i += C4554c.mo24802a(4, mo24936b());
            }
            if (mo25034f()) {
                i += C4554c.mo24806a(5, mo25033e());
            }
            if (mo25035g()) {
                i += C4554c.mo24801a(6, mo25031c());
            }
            this.f8568b = i;
            return i;
        }

        /* renamed from: b */
        public long m14062b() {
            return this.f8569b;
        }

        /* renamed from: b */
        public C4643k mo25029b(long j) {
            this.f8573d = true;
            this.f8569b = j;
            return this;
        }

        /* renamed from: b */
        public C4643k mo25030b(String str) {
            this.f8571b = true;
            this.f8570b = str;
            return this;
        }

        /* renamed from: b */
        public String m14065b() {
            return this.f8570b;
        }

        /* renamed from: b */
        public boolean m14066b() {
            return this.f8571b;
        }

        /* renamed from: c */
        public int mo25031c() {
            return this.f8564a;
        }

        /* renamed from: c */
        public boolean m14068c() {
            return this.f8572c;
        }

        /* renamed from: d */
        public boolean mo25032d() {
            return this.f8573d;
        }

        /* renamed from: e */
        public boolean mo25033e() {
            return this.f8575f;
        }

        /* renamed from: f */
        public boolean mo25034f() {
            return this.f8574e;
        }

        /* renamed from: g */
        public boolean mo25035g() {
            return this.f8576g;
        }
    }
}
