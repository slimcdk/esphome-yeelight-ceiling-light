package com.xiaomi.push;

import java.util.Objects;

/* renamed from: com.xiaomi.push.dx */
public final class C4637dx {

    /* renamed from: com.xiaomi.push.dx$a */
    public static final class C4638a extends C4651e {

        /* renamed from: a */
        private int f7850a = 0;

        /* renamed from: a */
        private long f7851a = 0;

        /* renamed from: a */
        private String f7852a = "";

        /* renamed from: a */
        private boolean f7853a;

        /* renamed from: b */
        private int f7854b = 1;

        /* renamed from: b */
        private String f7855b = "";

        /* renamed from: b */
        private boolean f7856b;

        /* renamed from: c */
        private int f7857c = 0;

        /* renamed from: c */
        private String f7858c = "";

        /* renamed from: c */
        private boolean f7859c;

        /* renamed from: d */
        private int f7860d = 0;

        /* renamed from: d */
        private String f7861d = "";

        /* renamed from: d */
        private boolean f7862d;

        /* renamed from: e */
        private int f7863e = -1;

        /* renamed from: e */
        private String f7864e = "";

        /* renamed from: e */
        private boolean f7865e;

        /* renamed from: f */
        private String f7866f = "";

        /* renamed from: f */
        private boolean f7867f;

        /* renamed from: g */
        private boolean f7868g;

        /* renamed from: h */
        private boolean f7869h;

        /* renamed from: i */
        private boolean f7870i;

        /* renamed from: j */
        private boolean f7871j;

        /* renamed from: k */
        private boolean f7872k;

        /* renamed from: a */
        public int mo28924a() {
            if (this.f7863e < 0) {
                mo28930b();
            }
            return this.f7863e;
        }

        /* renamed from: a */
        public long m13386a() {
            return this.f7851a;
        }

        /* renamed from: a */
        public C4638a m13387a() {
            this.f7867f = false;
            this.f7861d = "";
            return this;
        }

        /* renamed from: a */
        public C4638a mo28937a(int i) {
            this.f7853a = true;
            this.f7850a = i;
            return this;
        }

        /* renamed from: a */
        public C4638a mo28938a(long j) {
            this.f7856b = true;
            this.f7851a = j;
            return this;
        }

        /* renamed from: a */
        public C4638a m13392a(C4538b bVar) {
            while (true) {
                int a = bVar.mo28758a();
                switch (a) {
                    case 0:
                        return this;
                    case 8:
                        mo28937a(bVar.mo28761b());
                        break;
                    case 16:
                        mo28938a(bVar.mo28761b());
                        break;
                    case 26:
                        mo28939a(bVar.mo28758a());
                        break;
                    case 34:
                        mo28941b(bVar.mo28758a());
                        break;
                    case 42:
                        mo28944c(bVar.mo28758a());
                        break;
                    case 50:
                        mo28947d(bVar.mo28758a());
                        break;
                    case 58:
                        mo28949e(bVar.mo28758a());
                        break;
                    case 64:
                        mo28940b(bVar.mo28761b());
                        break;
                    case 72:
                        mo28943c(bVar.mo28761b());
                        break;
                    case 80:
                        mo28946d(bVar.mo28761b());
                        break;
                    case 90:
                        mo28951f(bVar.mo28758a());
                        break;
                    default:
                        if (mo29026a(bVar, a)) {
                            break;
                        } else {
                            return this;
                        }
                }
            }
        }

        /* renamed from: a */
        public C4638a mo28939a(String str) {
            this.f7859c = true;
            this.f7852a = str;
            return this;
        }

        /* renamed from: a */
        public String m13393a() {
            return this.f7852a;
        }

        /* renamed from: a */
        public void mo28929a(C4572c cVar) {
            if (mo28924a()) {
                cVar.mo28802a(1, mo28942c());
            }
            if (mo28930b()) {
                cVar.mo28818b(2, mo28924a());
            }
            if (mo28942c()) {
                cVar.mo28806a(3, mo28924a());
            }
            if (mo28945d()) {
                cVar.mo28806a(4, mo28930b());
            }
            if (mo28948e()) {
                cVar.mo28806a(5, mo28942c());
            }
            if (mo28950f()) {
                cVar.mo28806a(6, mo28945d());
            }
            if (mo28952g()) {
                cVar.mo28806a(7, mo28948e());
            }
            if (mo28953h()) {
                cVar.mo28802a(8, mo28945d());
            }
            if (mo28954i()) {
                cVar.mo28802a(9, mo28948e());
            }
            if (mo28955j()) {
                cVar.mo28802a(10, mo28950f());
            }
            if (mo28956k()) {
                cVar.mo28806a(11, mo28950f());
            }
        }

        /* renamed from: a */
        public boolean m13395a() {
            return this.f7853a;
        }

        /* renamed from: b */
        public int mo28930b() {
            int i = 0;
            if (mo28924a()) {
                i = 0 + C4572c.mo28802a(1, mo28942c());
            }
            if (mo28930b()) {
                i += C4572c.mo28818b(2, mo28924a());
            }
            if (mo28942c()) {
                i += C4572c.mo28806a(3, mo28924a());
            }
            if (mo28945d()) {
                i += C4572c.mo28806a(4, mo28930b());
            }
            if (mo28948e()) {
                i += C4572c.mo28806a(5, mo28942c());
            }
            if (mo28950f()) {
                i += C4572c.mo28806a(6, mo28945d());
            }
            if (mo28952g()) {
                i += C4572c.mo28806a(7, mo28948e());
            }
            if (mo28953h()) {
                i += C4572c.mo28802a(8, mo28945d());
            }
            if (mo28954i()) {
                i += C4572c.mo28802a(9, mo28948e());
            }
            if (mo28955j()) {
                i += C4572c.mo28802a(10, mo28950f());
            }
            if (mo28956k()) {
                i += C4572c.mo28806a(11, mo28950f());
            }
            this.f7863e = i;
            return i;
        }

        /* renamed from: b */
        public C4638a mo28940b(int i) {
            this.f7869h = true;
            this.f7854b = i;
            return this;
        }

        /* renamed from: b */
        public C4638a mo28941b(String str) {
            this.f7862d = true;
            this.f7855b = str;
            return this;
        }

        /* renamed from: b */
        public String m13399b() {
            return this.f7855b;
        }

        /* renamed from: b */
        public boolean m13400b() {
            return this.f7856b;
        }

        /* renamed from: c */
        public int mo28942c() {
            return this.f7850a;
        }

        /* renamed from: c */
        public C4638a mo28943c(int i) {
            this.f7870i = true;
            this.f7857c = i;
            return this;
        }

        /* renamed from: c */
        public C4638a mo28944c(String str) {
            this.f7865e = true;
            this.f7858c = str;
            return this;
        }

        /* renamed from: c */
        public String m13404c() {
            return this.f7858c;
        }

        /* renamed from: c */
        public boolean m13405c() {
            return this.f7859c;
        }

        /* renamed from: d */
        public int mo28945d() {
            return this.f7854b;
        }

        /* renamed from: d */
        public C4638a mo28946d(int i) {
            this.f7871j = true;
            this.f7860d = i;
            return this;
        }

        /* renamed from: d */
        public C4638a mo28947d(String str) {
            this.f7867f = true;
            this.f7861d = str;
            return this;
        }

        /* renamed from: d */
        public String m13409d() {
            return this.f7861d;
        }

        /* renamed from: d */
        public boolean m13410d() {
            return this.f7862d;
        }

        /* renamed from: e */
        public int mo28948e() {
            return this.f7857c;
        }

        /* renamed from: e */
        public C4638a mo28949e(String str) {
            this.f7868g = true;
            this.f7864e = str;
            return this;
        }

        /* renamed from: e */
        public String m13413e() {
            return this.f7864e;
        }

        /* renamed from: e */
        public boolean m13414e() {
            return this.f7865e;
        }

        /* renamed from: f */
        public int mo28950f() {
            return this.f7860d;
        }

        /* renamed from: f */
        public C4638a mo28951f(String str) {
            this.f7872k = true;
            this.f7866f = str;
            return this;
        }

        /* renamed from: f */
        public String m13417f() {
            return this.f7866f;
        }

        /* renamed from: f */
        public boolean m13418f() {
            return this.f7867f;
        }

        /* renamed from: g */
        public boolean mo28952g() {
            return this.f7868g;
        }

        /* renamed from: h */
        public boolean mo28953h() {
            return this.f7869h;
        }

        /* renamed from: i */
        public boolean mo28954i() {
            return this.f7870i;
        }

        /* renamed from: j */
        public boolean mo28955j() {
            return this.f7871j;
        }

        /* renamed from: k */
        public boolean mo28956k() {
            return this.f7872k;
        }
    }

    /* renamed from: com.xiaomi.push.dx$b */
    public static final class C4639b extends C4651e {

        /* renamed from: a */
        private int f7873a = 0;

        /* renamed from: a */
        private boolean f7874a;

        /* renamed from: b */
        private int f7875b = 0;

        /* renamed from: b */
        private boolean f7876b = false;

        /* renamed from: c */
        private int f7877c = 0;

        /* renamed from: c */
        private boolean f7878c;

        /* renamed from: d */
        private int f7879d = -1;

        /* renamed from: d */
        private boolean f7880d;

        /* renamed from: e */
        private boolean f7881e;

        /* renamed from: a */
        public static C4639b m13424a(byte[] bArr) {
            return (C4639b) new C4639b().mo29024a(bArr);
        }

        /* renamed from: a */
        public int mo28924a() {
            if (this.f7879d < 0) {
                mo28930b();
            }
            return this.f7879d;
        }

        /* renamed from: a */
        public C4639b mo28957a(int i) {
            this.f7878c = true;
            this.f7873a = i;
            return this;
        }

        /* renamed from: a */
        public C4639b m13429a(C4538b bVar) {
            while (true) {
                int a = bVar.mo28758a();
                if (a == 0) {
                    return this;
                }
                if (a == 8) {
                    mo28958a(bVar.mo28758a());
                } else if (a == 24) {
                    mo28957a(bVar.mo28761b());
                } else if (a == 32) {
                    mo28959b(bVar.mo28761b());
                } else if (a == 40) {
                    mo28961c(bVar.mo28761b());
                } else if (!mo29026a(bVar, a)) {
                    return this;
                }
            }
        }

        /* renamed from: a */
        public C4639b mo28958a(boolean z) {
            this.f7874a = true;
            this.f7876b = z;
            return this;
        }

        /* renamed from: a */
        public void mo28929a(C4572c cVar) {
            if (mo28930b()) {
                cVar.mo28807a(1, mo28924a());
            }
            if (mo28960c()) {
                cVar.mo28802a(3, mo28960c());
            }
            if (mo28962d()) {
                cVar.mo28802a(4, mo28962d());
            }
            if (mo28963e()) {
                cVar.mo28802a(5, mo28963e());
            }
        }

        /* renamed from: a */
        public boolean m13431a() {
            return this.f7876b;
        }

        /* renamed from: b */
        public int mo28930b() {
            int i = 0;
            if (mo28930b()) {
                i = 0 + C4572c.mo28807a(1, mo28924a());
            }
            if (mo28960c()) {
                i += C4572c.mo28802a(3, mo28960c());
            }
            if (mo28962d()) {
                i += C4572c.mo28802a(4, mo28962d());
            }
            if (mo28963e()) {
                i += C4572c.mo28802a(5, mo28963e());
            }
            this.f7879d = i;
            return i;
        }

        /* renamed from: b */
        public C4639b mo28959b(int i) {
            this.f7880d = true;
            this.f7875b = i;
            return this;
        }

        /* renamed from: b */
        public boolean m13434b() {
            return this.f7874a;
        }

        /* renamed from: c */
        public int mo28960c() {
            return this.f7873a;
        }

        /* renamed from: c */
        public C4639b mo28961c(int i) {
            this.f7881e = true;
            this.f7877c = i;
            return this;
        }

        /* renamed from: c */
        public boolean m13437c() {
            return this.f7878c;
        }

        /* renamed from: d */
        public int mo28962d() {
            return this.f7875b;
        }

        /* renamed from: d */
        public boolean m13439d() {
            return this.f7880d;
        }

        /* renamed from: e */
        public int mo28963e() {
            return this.f7877c;
        }

        /* renamed from: e */
        public boolean m13441e() {
            return this.f7881e;
        }
    }

    /* renamed from: com.xiaomi.push.dx$c */
    public static final class C4640c extends C4651e {

        /* renamed from: a */
        private int f7882a = -1;

        /* renamed from: a */
        private String f7883a = "";

        /* renamed from: a */
        private boolean f7884a;

        /* renamed from: b */
        private String f7885b = "";

        /* renamed from: b */
        private boolean f7886b;

        /* renamed from: c */
        private String f7887c = "";

        /* renamed from: c */
        private boolean f7888c;

        /* renamed from: d */
        private String f7889d = "";

        /* renamed from: d */
        private boolean f7890d;

        /* renamed from: e */
        private String f7891e = "";

        /* renamed from: e */
        private boolean f7892e;

        /* renamed from: f */
        private String f7893f = "";

        /* renamed from: f */
        private boolean f7894f;

        /* renamed from: a */
        public int mo28924a() {
            if (this.f7882a < 0) {
                mo28930b();
            }
            return this.f7882a;
        }

        /* renamed from: a */
        public C4640c m13445a(C4538b bVar) {
            while (true) {
                int a = bVar.mo28758a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    mo28964a(bVar.mo28758a());
                } else if (a == 18) {
                    mo28965b(bVar.mo28758a());
                } else if (a == 26) {
                    mo28966c(bVar.mo28758a());
                } else if (a == 34) {
                    mo28968d(bVar.mo28758a());
                } else if (a == 42) {
                    mo28970e(bVar.mo28758a());
                } else if (a == 50) {
                    mo28972f(bVar.mo28758a());
                } else if (!mo29026a(bVar, a)) {
                    return this;
                }
            }
        }

        /* renamed from: a */
        public C4640c mo28964a(String str) {
            this.f7884a = true;
            this.f7883a = str;
            return this;
        }

        /* renamed from: a */
        public String m13446a() {
            return this.f7883a;
        }

        /* renamed from: a */
        public void mo28929a(C4572c cVar) {
            if (mo28924a()) {
                cVar.mo28806a(1, mo28924a());
            }
            if (mo28930b()) {
                cVar.mo28806a(2, mo28930b());
            }
            if (mo28967c()) {
                cVar.mo28806a(3, mo28967c());
            }
            if (mo28969d()) {
                cVar.mo28806a(4, mo28969d());
            }
            if (mo28971e()) {
                cVar.mo28806a(5, mo28971e());
            }
            if (mo28973f()) {
                cVar.mo28806a(6, mo28973f());
            }
        }

        /* renamed from: a */
        public boolean m13448a() {
            return this.f7884a;
        }

        /* renamed from: b */
        public int mo28930b() {
            int i = 0;
            if (mo28924a()) {
                i = 0 + C4572c.mo28806a(1, mo28924a());
            }
            if (mo28930b()) {
                i += C4572c.mo28806a(2, mo28930b());
            }
            if (mo28967c()) {
                i += C4572c.mo28806a(3, mo28967c());
            }
            if (mo28969d()) {
                i += C4572c.mo28806a(4, mo28969d());
            }
            if (mo28971e()) {
                i += C4572c.mo28806a(5, mo28971e());
            }
            if (mo28973f()) {
                i += C4572c.mo28806a(6, mo28973f());
            }
            this.f7882a = i;
            return i;
        }

        /* renamed from: b */
        public C4640c mo28965b(String str) {
            this.f7886b = true;
            this.f7885b = str;
            return this;
        }

        /* renamed from: b */
        public String m13451b() {
            return this.f7885b;
        }

        /* renamed from: b */
        public boolean m13452b() {
            return this.f7886b;
        }

        /* renamed from: c */
        public C4640c mo28966c(String str) {
            this.f7888c = true;
            this.f7887c = str;
            return this;
        }

        /* renamed from: c */
        public String mo28967c() {
            return this.f7887c;
        }

        /* renamed from: c */
        public boolean m13455c() {
            return this.f7888c;
        }

        /* renamed from: d */
        public C4640c mo28968d(String str) {
            this.f7890d = true;
            this.f7889d = str;
            return this;
        }

        /* renamed from: d */
        public String mo28969d() {
            return this.f7889d;
        }

        /* renamed from: d */
        public boolean m13458d() {
            return this.f7890d;
        }

        /* renamed from: e */
        public C4640c mo28970e(String str) {
            this.f7892e = true;
            this.f7891e = str;
            return this;
        }

        /* renamed from: e */
        public String mo28971e() {
            return this.f7891e;
        }

        /* renamed from: e */
        public boolean m13461e() {
            return this.f7892e;
        }

        /* renamed from: f */
        public C4640c mo28972f(String str) {
            this.f7894f = true;
            this.f7893f = str;
            return this;
        }

        /* renamed from: f */
        public String mo28973f() {
            return this.f7893f;
        }

        /* renamed from: f */
        public boolean m13464f() {
            return this.f7894f;
        }
    }

    /* renamed from: com.xiaomi.push.dx$d */
    public static final class C4641d extends C4651e {

        /* renamed from: a */
        private int f7895a = -1;

        /* renamed from: a */
        private String f7896a = "";

        /* renamed from: a */
        private boolean f7897a;

        /* renamed from: b */
        private String f7898b = "";

        /* renamed from: b */
        private boolean f7899b = false;

        /* renamed from: c */
        private String f7900c = "";

        /* renamed from: c */
        private boolean f7901c;

        /* renamed from: d */
        private boolean f7902d;

        /* renamed from: e */
        private boolean f7903e;

        /* renamed from: a */
        public static C4641d m13465a(byte[] bArr) {
            return (C4641d) new C4641d().mo29024a(bArr);
        }

        /* renamed from: a */
        public int mo28924a() {
            if (this.f7895a < 0) {
                mo28930b();
            }
            return this.f7895a;
        }

        /* renamed from: a */
        public C4641d m13470a(C4538b bVar) {
            while (true) {
                int a = bVar.mo28758a();
                if (a == 0) {
                    return this;
                }
                if (a == 8) {
                    mo28975a(bVar.mo28758a());
                } else if (a == 18) {
                    mo28974a(bVar.mo28758a());
                } else if (a == 26) {
                    mo28976b(bVar.mo28758a());
                } else if (a == 34) {
                    mo28977c(bVar.mo28758a());
                } else if (!mo29026a(bVar, a)) {
                    return this;
                }
            }
        }

        /* renamed from: a */
        public C4641d mo28974a(String str) {
            this.f7901c = true;
            this.f7896a = str;
            return this;
        }

        /* renamed from: a */
        public C4641d mo28975a(boolean z) {
            this.f7897a = true;
            this.f7899b = z;
            return this;
        }

        /* renamed from: a */
        public String m13471a() {
            return this.f7896a;
        }

        /* renamed from: a */
        public void mo28929a(C4572c cVar) {
            if (mo28930b()) {
                cVar.mo28807a(1, mo28924a());
            }
            if (mo28978c()) {
                cVar.mo28806a(2, mo28924a());
            }
            if (mo28979d()) {
                cVar.mo28806a(3, mo28930b());
            }
            if (mo28980e()) {
                cVar.mo28806a(4, mo28978c());
            }
        }

        /* renamed from: a */
        public boolean m13473a() {
            return this.f7899b;
        }

        /* renamed from: b */
        public int mo28930b() {
            int i = 0;
            if (mo28930b()) {
                i = 0 + C4572c.mo28807a(1, mo28924a());
            }
            if (mo28978c()) {
                i += C4572c.mo28806a(2, mo28924a());
            }
            if (mo28979d()) {
                i += C4572c.mo28806a(3, mo28930b());
            }
            if (mo28980e()) {
                i += C4572c.mo28806a(4, mo28978c());
            }
            this.f7895a = i;
            return i;
        }

        /* renamed from: b */
        public C4641d mo28976b(String str) {
            this.f7902d = true;
            this.f7898b = str;
            return this;
        }

        /* renamed from: b */
        public String m13476b() {
            return this.f7898b;
        }

        /* renamed from: b */
        public boolean m13477b() {
            return this.f7897a;
        }

        /* renamed from: c */
        public C4641d mo28977c(String str) {
            this.f7903e = true;
            this.f7900c = str;
            return this;
        }

        /* renamed from: c */
        public String mo28978c() {
            return this.f7900c;
        }

        /* renamed from: c */
        public boolean m13480c() {
            return this.f7901c;
        }

        /* renamed from: d */
        public boolean mo28979d() {
            return this.f7902d;
        }

        /* renamed from: e */
        public boolean mo28980e() {
            return this.f7903e;
        }
    }

    /* renamed from: com.xiaomi.push.dx$e */
    public static final class C4642e extends C4651e {

        /* renamed from: a */
        private int f7904a = 0;

        /* renamed from: a */
        private C4639b f7905a = null;

        /* renamed from: a */
        private String f7906a = "";

        /* renamed from: a */
        private boolean f7907a;

        /* renamed from: b */
        private int f7908b = 0;

        /* renamed from: b */
        private String f7909b = "";

        /* renamed from: b */
        private boolean f7910b;

        /* renamed from: c */
        private int f7911c = 0;

        /* renamed from: c */
        private String f7912c = "";

        /* renamed from: c */
        private boolean f7913c;

        /* renamed from: d */
        private int f7914d = -1;

        /* renamed from: d */
        private String f7915d = "";

        /* renamed from: d */
        private boolean f7916d;

        /* renamed from: e */
        private String f7917e = "";

        /* renamed from: e */
        private boolean f7918e;

        /* renamed from: f */
        private String f7919f = "";

        /* renamed from: f */
        private boolean f7920f;

        /* renamed from: g */
        private boolean f7921g;

        /* renamed from: h */
        private boolean f7922h;

        /* renamed from: i */
        private boolean f7923i;

        /* renamed from: j */
        private boolean f7924j;

        /* renamed from: a */
        public int mo28924a() {
            if (this.f7914d < 0) {
                mo28930b();
            }
            return this.f7914d;
        }

        /* renamed from: a */
        public C4639b m13484a() {
            return this.f7905a;
        }

        /* renamed from: a */
        public C4642e mo28981a(int i) {
            this.f7907a = true;
            this.f7904a = i;
            return this;
        }

        /* renamed from: a */
        public C4642e m13489a(C4538b bVar) {
            while (true) {
                int a = bVar.mo28758a();
                switch (a) {
                    case 0:
                        return this;
                    case 8:
                        mo28981a(bVar.mo28763c());
                        break;
                    case 18:
                        mo28983a(bVar.mo28758a());
                        break;
                    case 26:
                        mo28985b(bVar.mo28758a());
                        break;
                    case 34:
                        mo28988c(bVar.mo28758a());
                        break;
                    case 40:
                        mo28984b(bVar.mo28761b());
                        break;
                    case 50:
                        mo28990d(bVar.mo28758a());
                        break;
                    case 58:
                        mo28992e(bVar.mo28758a());
                        break;
                    case 66:
                        mo28993f(bVar.mo28758a());
                        break;
                    case 74:
                        C4639b bVar2 = new C4639b();
                        bVar.mo28760a((C4651e) bVar2);
                        mo28982a(bVar2);
                        break;
                    case 80:
                        mo28987c(bVar.mo28761b());
                        break;
                    default:
                        if (mo29026a(bVar, a)) {
                            break;
                        } else {
                            return this;
                        }
                }
            }
        }

        /* renamed from: a */
        public C4642e mo28982a(C4639b bVar) {
            Objects.requireNonNull(bVar);
            this.f7923i = true;
            this.f7905a = bVar;
            return this;
        }

        /* renamed from: a */
        public C4642e mo28983a(String str) {
            this.f7910b = true;
            this.f7906a = str;
            return this;
        }

        /* renamed from: a */
        public String m13490a() {
            return this.f7906a;
        }

        /* renamed from: a */
        public void mo28929a(C4572c cVar) {
            if (mo28924a()) {
                cVar.mo28817b(1, mo28986c());
            }
            if (mo28930b()) {
                cVar.mo28806a(2, mo28924a());
            }
            if (mo28986c()) {
                cVar.mo28806a(3, mo28930b());
            }
            if (mo28989d()) {
                cVar.mo28806a(4, mo28986c());
            }
            if (mo28991e()) {
                cVar.mo28802a(5, mo28989d());
            }
            if (mo28994f()) {
                cVar.mo28806a(6, mo28989d());
            }
            if (mo28995g()) {
                cVar.mo28806a(7, mo28991e());
            }
            if (mo28996h()) {
                cVar.mo28806a(8, mo28994f());
            }
            if (mo28997i()) {
                cVar.mo28805a(9, (C4651e) mo28924a());
            }
            if (mo28998j()) {
                cVar.mo28802a(10, mo28991e());
            }
        }

        /* renamed from: a */
        public boolean m13492a() {
            return this.f7907a;
        }

        /* renamed from: b */
        public int mo28930b() {
            int i = 0;
            if (mo28924a()) {
                i = 0 + C4572c.mo28817b(1, mo28986c());
            }
            if (mo28930b()) {
                i += C4572c.mo28806a(2, mo28924a());
            }
            if (mo28986c()) {
                i += C4572c.mo28806a(3, mo28930b());
            }
            if (mo28989d()) {
                i += C4572c.mo28806a(4, mo28986c());
            }
            if (mo28991e()) {
                i += C4572c.mo28802a(5, mo28989d());
            }
            if (mo28994f()) {
                i += C4572c.mo28806a(6, mo28989d());
            }
            if (mo28995g()) {
                i += C4572c.mo28806a(7, mo28991e());
            }
            if (mo28996h()) {
                i += C4572c.mo28806a(8, mo28994f());
            }
            if (mo28997i()) {
                i += C4572c.mo28805a(9, (C4651e) mo28924a());
            }
            if (mo28998j()) {
                i += C4572c.mo28802a(10, mo28991e());
            }
            this.f7914d = i;
            return i;
        }

        /* renamed from: b */
        public C4642e mo28984b(int i) {
            this.f7918e = true;
            this.f7908b = i;
            return this;
        }

        /* renamed from: b */
        public C4642e mo28985b(String str) {
            this.f7913c = true;
            this.f7909b = str;
            return this;
        }

        /* renamed from: b */
        public String m13496b() {
            return this.f7909b;
        }

        /* renamed from: b */
        public boolean m13497b() {
            return this.f7910b;
        }

        /* renamed from: c */
        public int mo28986c() {
            return this.f7904a;
        }

        /* renamed from: c */
        public C4642e mo28987c(int i) {
            this.f7924j = true;
            this.f7911c = i;
            return this;
        }

        /* renamed from: c */
        public C4642e mo28988c(String str) {
            this.f7916d = true;
            this.f7912c = str;
            return this;
        }

        /* renamed from: c */
        public String m13501c() {
            return this.f7912c;
        }

        /* renamed from: c */
        public boolean m13502c() {
            return this.f7913c;
        }

        /* renamed from: d */
        public int mo28989d() {
            return this.f7908b;
        }

        /* renamed from: d */
        public C4642e mo28990d(String str) {
            this.f7920f = true;
            this.f7915d = str;
            return this;
        }

        /* renamed from: d */
        public String m13505d() {
            return this.f7915d;
        }

        /* renamed from: d */
        public boolean m13506d() {
            return this.f7916d;
        }

        /* renamed from: e */
        public int mo28991e() {
            return this.f7911c;
        }

        /* renamed from: e */
        public C4642e mo28992e(String str) {
            this.f7921g = true;
            this.f7917e = str;
            return this;
        }

        /* renamed from: e */
        public String m13509e() {
            return this.f7917e;
        }

        /* renamed from: e */
        public boolean m13510e() {
            return this.f7918e;
        }

        /* renamed from: f */
        public C4642e mo28993f(String str) {
            this.f7922h = true;
            this.f7919f = str;
            return this;
        }

        /* renamed from: f */
        public String mo28994f() {
            return this.f7919f;
        }

        /* renamed from: f */
        public boolean m13513f() {
            return this.f7920f;
        }

        /* renamed from: g */
        public boolean mo28995g() {
            return this.f7921g;
        }

        /* renamed from: h */
        public boolean mo28996h() {
            return this.f7922h;
        }

        /* renamed from: i */
        public boolean mo28997i() {
            return this.f7923i;
        }

        /* renamed from: j */
        public boolean mo28998j() {
            return this.f7924j;
        }
    }

    /* renamed from: com.xiaomi.push.dx$f */
    public static final class C4643f extends C4651e {

        /* renamed from: a */
        private int f7925a = -1;

        /* renamed from: a */
        private C4639b f7926a = null;

        /* renamed from: a */
        private String f7927a = "";

        /* renamed from: a */
        private boolean f7928a;

        /* renamed from: b */
        private String f7929b = "";

        /* renamed from: b */
        private boolean f7930b;

        /* renamed from: c */
        private boolean f7931c;

        /* renamed from: a */
        public static C4643f m13518a(byte[] bArr) {
            return (C4643f) new C4643f().mo29024a(bArr);
        }

        /* renamed from: a */
        public int mo28924a() {
            if (this.f7925a < 0) {
                mo28930b();
            }
            return this.f7925a;
        }

        /* renamed from: a */
        public C4639b m13520a() {
            return this.f7926a;
        }

        /* renamed from: a */
        public C4643f m13524a(C4538b bVar) {
            while (true) {
                int a = bVar.mo28758a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    mo29000a(bVar.mo28758a());
                } else if (a == 18) {
                    mo29001b(bVar.mo28758a());
                } else if (a == 26) {
                    C4639b bVar2 = new C4639b();
                    bVar.mo28760a((C4651e) bVar2);
                    mo28999a(bVar2);
                } else if (!mo29026a(bVar, a)) {
                    return this;
                }
            }
        }

        /* renamed from: a */
        public C4643f mo28999a(C4639b bVar) {
            Objects.requireNonNull(bVar);
            this.f7931c = true;
            this.f7926a = bVar;
            return this;
        }

        /* renamed from: a */
        public C4643f mo29000a(String str) {
            this.f7928a = true;
            this.f7927a = str;
            return this;
        }

        /* renamed from: a */
        public String m13525a() {
            return this.f7927a;
        }

        /* renamed from: a */
        public void mo28929a(C4572c cVar) {
            if (mo28924a()) {
                cVar.mo28806a(1, mo28924a());
            }
            if (mo28930b()) {
                cVar.mo28806a(2, mo28930b());
            }
            if (mo29002c()) {
                cVar.mo28805a(3, (C4651e) mo28924a());
            }
        }

        /* renamed from: a */
        public boolean m13527a() {
            return this.f7928a;
        }

        /* renamed from: b */
        public int mo28930b() {
            int i = 0;
            if (mo28924a()) {
                i = 0 + C4572c.mo28806a(1, mo28924a());
            }
            if (mo28930b()) {
                i += C4572c.mo28806a(2, mo28930b());
            }
            if (mo29002c()) {
                i += C4572c.mo28805a(3, (C4651e) mo28924a());
            }
            this.f7925a = i;
            return i;
        }

        /* renamed from: b */
        public C4643f mo29001b(String str) {
            this.f7930b = true;
            this.f7929b = str;
            return this;
        }

        /* renamed from: b */
        public String m13530b() {
            return this.f7929b;
        }

        /* renamed from: b */
        public boolean m13531b() {
            return this.f7930b;
        }

        /* renamed from: c */
        public boolean mo29002c() {
            return this.f7931c;
        }
    }

    /* renamed from: com.xiaomi.push.dx$g */
    public static final class C4644g extends C4651e {

        /* renamed from: a */
        private int f7932a = -1;

        /* renamed from: a */
        private String f7933a = "";

        /* renamed from: a */
        private boolean f7934a;

        /* renamed from: b */
        private String f7935b = "";

        /* renamed from: b */
        private boolean f7936b;

        /* renamed from: c */
        private String f7937c = "";

        /* renamed from: c */
        private boolean f7938c;

        /* renamed from: a */
        public static C4644g m13533a(byte[] bArr) {
            return (C4644g) new C4644g().mo29024a(bArr);
        }

        /* renamed from: a */
        public int mo28924a() {
            if (this.f7932a < 0) {
                mo28930b();
            }
            return this.f7932a;
        }

        /* renamed from: a */
        public C4644g m13537a(C4538b bVar) {
            while (true) {
                int a = bVar.mo28758a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    mo29003a(bVar.mo28758a());
                } else if (a == 18) {
                    mo29004b(bVar.mo28758a());
                } else if (a == 26) {
                    mo29005c(bVar.mo28758a());
                } else if (!mo29026a(bVar, a)) {
                    return this;
                }
            }
        }

        /* renamed from: a */
        public C4644g mo29003a(String str) {
            this.f7934a = true;
            this.f7933a = str;
            return this;
        }

        /* renamed from: a */
        public String m13538a() {
            return this.f7933a;
        }

        /* renamed from: a */
        public void mo28929a(C4572c cVar) {
            if (mo28924a()) {
                cVar.mo28806a(1, mo28924a());
            }
            if (mo28930b()) {
                cVar.mo28806a(2, mo28930b());
            }
            if (mo29006c()) {
                cVar.mo28806a(3, mo29006c());
            }
        }

        /* renamed from: a */
        public boolean m13540a() {
            return this.f7934a;
        }

        /* renamed from: b */
        public int mo28930b() {
            int i = 0;
            if (mo28924a()) {
                i = 0 + C4572c.mo28806a(1, mo28924a());
            }
            if (mo28930b()) {
                i += C4572c.mo28806a(2, mo28930b());
            }
            if (mo29006c()) {
                i += C4572c.mo28806a(3, mo29006c());
            }
            this.f7932a = i;
            return i;
        }

        /* renamed from: b */
        public C4644g mo29004b(String str) {
            this.f7936b = true;
            this.f7935b = str;
            return this;
        }

        /* renamed from: b */
        public String m13543b() {
            return this.f7935b;
        }

        /* renamed from: b */
        public boolean m13544b() {
            return this.f7936b;
        }

        /* renamed from: c */
        public C4644g mo29005c(String str) {
            this.f7938c = true;
            this.f7937c = str;
            return this;
        }

        /* renamed from: c */
        public String mo29006c() {
            return this.f7937c;
        }

        /* renamed from: c */
        public boolean m13547c() {
            return this.f7938c;
        }
    }

    /* renamed from: com.xiaomi.push.dx$h */
    public static final class C4645h extends C4651e {

        /* renamed from: a */
        private int f7939a = 0;

        /* renamed from: a */
        private String f7940a = "";

        /* renamed from: a */
        private boolean f7941a;

        /* renamed from: b */
        private int f7942b = -1;

        /* renamed from: b */
        private boolean f7943b;

        /* renamed from: a */
        public static C4645h m13548a(byte[] bArr) {
            return (C4645h) new C4645h().mo29024a(bArr);
        }

        /* renamed from: a */
        public int mo28924a() {
            if (this.f7942b < 0) {
                mo28930b();
            }
            return this.f7942b;
        }

        /* renamed from: a */
        public C4645h mo29007a(int i) {
            this.f7941a = true;
            this.f7939a = i;
            return this;
        }

        /* renamed from: a */
        public C4645h m13553a(C4538b bVar) {
            while (true) {
                int a = bVar.mo28758a();
                if (a == 0) {
                    return this;
                }
                if (a == 8) {
                    mo29007a(bVar.mo28761b());
                } else if (a == 18) {
                    mo29008a(bVar.mo28758a());
                } else if (!mo29026a(bVar, a)) {
                    return this;
                }
            }
        }

        /* renamed from: a */
        public C4645h mo29008a(String str) {
            this.f7943b = true;
            this.f7940a = str;
            return this;
        }

        /* renamed from: a */
        public String m13554a() {
            return this.f7940a;
        }

        /* renamed from: a */
        public void mo28929a(C4572c cVar) {
            if (mo28924a()) {
                cVar.mo28802a(1, mo29009c());
            }
            if (mo28930b()) {
                cVar.mo28806a(2, mo28924a());
            }
        }

        /* renamed from: a */
        public boolean m13556a() {
            return this.f7941a;
        }

        /* renamed from: b */
        public int mo28930b() {
            int i = 0;
            if (mo28924a()) {
                i = 0 + C4572c.mo28802a(1, mo29009c());
            }
            if (mo28930b()) {
                i += C4572c.mo28806a(2, mo28924a());
            }
            this.f7942b = i;
            return i;
        }

        /* renamed from: b */
        public boolean m13558b() {
            return this.f7943b;
        }

        /* renamed from: c */
        public int mo29009c() {
            return this.f7939a;
        }
    }

    /* renamed from: com.xiaomi.push.dx$i */
    public static final class C4646i extends C4651e {

        /* renamed from: a */
        private int f7944a = -1;

        /* renamed from: a */
        private C4504a f7945a = C4504a.f7531a;

        /* renamed from: a */
        private boolean f7946a;

        /* renamed from: a */
        public static C4646i m13560a(byte[] bArr) {
            return (C4646i) new C4646i().mo29024a(bArr);
        }

        /* renamed from: a */
        public int mo28924a() {
            if (this.f7944a < 0) {
                mo28930b();
            }
            return this.f7944a;
        }

        /* renamed from: a */
        public C4504a m13562a() {
            return this.f7945a;
        }

        /* renamed from: a */
        public C4646i mo29010a(C4504a aVar) {
            this.f7946a = true;
            this.f7945a = aVar;
            return this;
        }

        /* renamed from: a */
        public C4646i m13565a(C4538b bVar) {
            while (true) {
                int a = bVar.mo28758a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    mo29010a(bVar.mo28758a());
                } else if (!mo29026a(bVar, a)) {
                    return this;
                }
            }
        }

        /* renamed from: a */
        public void mo28929a(C4572c cVar) {
            if (mo28924a()) {
                cVar.mo28804a(1, mo28924a());
            }
        }

        /* renamed from: a */
        public boolean m13567a() {
            return this.f7946a;
        }

        /* renamed from: b */
        public int mo28930b() {
            int i = 0;
            if (mo28924a()) {
                i = 0 + C4572c.mo28804a(1, mo28924a());
            }
            this.f7944a = i;
            return i;
        }
    }

    /* renamed from: com.xiaomi.push.dx$j */
    public static final class C4647j extends C4651e {

        /* renamed from: a */
        private int f7947a = -1;

        /* renamed from: a */
        private C4504a f7948a = C4504a.f7531a;

        /* renamed from: a */
        private C4639b f7949a = null;

        /* renamed from: a */
        private boolean f7950a;

        /* renamed from: b */
        private boolean f7951b;

        /* renamed from: a */
        public static C4647j m13569a(byte[] bArr) {
            return (C4647j) new C4647j().mo29024a(bArr);
        }

        /* renamed from: a */
        public int mo28924a() {
            if (this.f7947a < 0) {
                mo28930b();
            }
            return this.f7947a;
        }

        /* renamed from: a */
        public C4504a m13571a() {
            return this.f7948a;
        }

        /* renamed from: a */
        public C4639b m13572a() {
            return this.f7949a;
        }

        /* renamed from: a */
        public C4647j mo29011a(C4504a aVar) {
            this.f7950a = true;
            this.f7948a = aVar;
            return this;
        }

        /* renamed from: a */
        public C4647j m13576a(C4538b bVar) {
            while (true) {
                int a = bVar.mo28758a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    mo29011a(bVar.mo28758a());
                } else if (a == 18) {
                    C4639b bVar2 = new C4639b();
                    bVar.mo28760a((C4651e) bVar2);
                    mo29012a(bVar2);
                } else if (!mo29026a(bVar, a)) {
                    return this;
                }
            }
        }

        /* renamed from: a */
        public C4647j mo29012a(C4639b bVar) {
            Objects.requireNonNull(bVar);
            this.f7951b = true;
            this.f7949a = bVar;
            return this;
        }

        /* renamed from: a */
        public void mo28929a(C4572c cVar) {
            if (mo28924a()) {
                cVar.mo28804a(1, mo28924a());
            }
            if (mo28930b()) {
                cVar.mo28805a(2, (C4651e) mo28924a());
            }
        }

        /* renamed from: a */
        public boolean m13578a() {
            return this.f7950a;
        }

        /* renamed from: b */
        public int mo28930b() {
            int i = 0;
            if (mo28924a()) {
                i = 0 + C4572c.mo28804a(1, mo28924a());
            }
            if (mo28930b()) {
                i += C4572c.mo28805a(2, (C4651e) mo28924a());
            }
            this.f7947a = i;
            return i;
        }

        /* renamed from: b */
        public boolean m13580b() {
            return this.f7951b;
        }
    }

    /* renamed from: com.xiaomi.push.dx$k */
    public static final class C4648k extends C4651e {

        /* renamed from: a */
        private int f7952a = 0;

        /* renamed from: a */
        private long f7953a = 0;

        /* renamed from: a */
        private String f7954a = "";

        /* renamed from: a */
        private boolean f7955a;

        /* renamed from: b */
        private int f7956b = -1;

        /* renamed from: b */
        private long f7957b = 0;

        /* renamed from: b */
        private String f7958b = "";

        /* renamed from: b */
        private boolean f7959b;

        /* renamed from: c */
        private boolean f7960c;

        /* renamed from: d */
        private boolean f7961d;

        /* renamed from: e */
        private boolean f7962e;

        /* renamed from: f */
        private boolean f7963f = false;

        /* renamed from: g */
        private boolean f7964g;

        /* renamed from: a */
        public static C4648k m13581a(byte[] bArr) {
            return (C4648k) new C4648k().mo29024a(bArr);
        }

        /* renamed from: a */
        public int mo28924a() {
            if (this.f7956b < 0) {
                mo28930b();
            }
            return this.f7956b;
        }

        /* renamed from: a */
        public long m13583a() {
            return this.f7953a;
        }

        /* renamed from: a */
        public C4648k mo29013a(int i) {
            this.f7964g = true;
            this.f7952a = i;
            return this;
        }

        /* renamed from: a */
        public C4648k mo29014a(long j) {
            this.f7960c = true;
            this.f7953a = j;
            return this;
        }

        /* renamed from: a */
        public C4648k m13589a(C4538b bVar) {
            while (true) {
                int a = bVar.mo28758a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    mo29015a(bVar.mo28758a());
                } else if (a == 18) {
                    mo29018b(bVar.mo28758a());
                } else if (a == 24) {
                    mo29014a(bVar.mo28758a());
                } else if (a == 32) {
                    mo29017b(bVar.mo28758a());
                } else if (a == 40) {
                    mo29016a(bVar.mo28758a());
                } else if (a == 48) {
                    mo29013a(bVar.mo28761b());
                } else if (!mo29026a(bVar, a)) {
                    return this;
                }
            }
        }

        /* renamed from: a */
        public C4648k mo29015a(String str) {
            this.f7955a = true;
            this.f7954a = str;
            return this;
        }

        /* renamed from: a */
        public C4648k mo29016a(boolean z) {
            this.f7962e = true;
            this.f7963f = z;
            return this;
        }

        /* renamed from: a */
        public String m13590a() {
            return this.f7954a;
        }

        /* renamed from: a */
        public void mo28929a(C4572c cVar) {
            if (mo28924a()) {
                cVar.mo28806a(1, mo28924a());
            }
            if (mo28930b()) {
                cVar.mo28806a(2, mo28930b());
            }
            if (mo29019c()) {
                cVar.mo28803a(3, mo28924a());
            }
            if (mo29020d()) {
                cVar.mo28803a(4, mo28930b());
            }
            if (mo29022f()) {
                cVar.mo28807a(5, mo29021e());
            }
            if (mo29023g()) {
                cVar.mo28802a(6, mo29019c());
            }
        }

        /* renamed from: a */
        public boolean m13592a() {
            return this.f7955a;
        }

        /* renamed from: b */
        public int mo28930b() {
            int i = 0;
            if (mo28924a()) {
                i = 0 + C4572c.mo28806a(1, mo28924a());
            }
            if (mo28930b()) {
                i += C4572c.mo28806a(2, mo28930b());
            }
            if (mo29019c()) {
                i += C4572c.mo28803a(3, mo28924a());
            }
            if (mo29020d()) {
                i += C4572c.mo28803a(4, mo28930b());
            }
            if (mo29022f()) {
                i += C4572c.mo28807a(5, mo29021e());
            }
            if (mo29023g()) {
                i += C4572c.mo28802a(6, mo29019c());
            }
            this.f7956b = i;
            return i;
        }

        /* renamed from: b */
        public long m13594b() {
            return this.f7957b;
        }

        /* renamed from: b */
        public C4648k mo29017b(long j) {
            this.f7961d = true;
            this.f7957b = j;
            return this;
        }

        /* renamed from: b */
        public C4648k mo29018b(String str) {
            this.f7959b = true;
            this.f7958b = str;
            return this;
        }

        /* renamed from: b */
        public String m13597b() {
            return this.f7958b;
        }

        /* renamed from: b */
        public boolean m13598b() {
            return this.f7959b;
        }

        /* renamed from: c */
        public int mo29019c() {
            return this.f7952a;
        }

        /* renamed from: c */
        public boolean m13600c() {
            return this.f7960c;
        }

        /* renamed from: d */
        public boolean mo29020d() {
            return this.f7961d;
        }

        /* renamed from: e */
        public boolean mo29021e() {
            return this.f7963f;
        }

        /* renamed from: f */
        public boolean mo29022f() {
            return this.f7962e;
        }

        /* renamed from: g */
        public boolean mo29023g() {
            return this.f7964g;
        }
    }
}
