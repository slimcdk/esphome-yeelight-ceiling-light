package com.xiaomi.push;

import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.xiaomi.push.bn */
public class C4540bn implements C4695ge {

    /* renamed from: a */
    public static boolean f8230a = false;

    /* renamed from: a */
    private C4541a f8231a = null;

    /* renamed from: a */
    private C4680fs f8232a = null;

    /* renamed from: a */
    private C4684fv f8233a = null;

    /* renamed from: a */
    private final String f8234a = "[Slim] ";

    /* renamed from: a */
    private SimpleDateFormat f8235a = new SimpleDateFormat("hh:mm:ss aaa");

    /* renamed from: b */
    private C4541a f8236b = null;

    /* renamed from: com.xiaomi.push.bn$a */
    class C4541a implements C4686fx, C4696gf {

        /* renamed from: a */
        String f8238a;

        C4541a(boolean z) {
            this.f8238a = z ? " RCV " : " Sent ";
        }

        /* renamed from: a */
        public void mo24777a(C4673fl flVar) {
            String str;
            StringBuilder sb;
            if (C4540bn.f8230a) {
                sb = new StringBuilder();
                sb.append("[Slim] ");
                sb.append(C4540bn.m13463a(C4540bn.this).format(new Date()));
                sb.append(this.f8238a);
                str = flVar.toString();
            } else {
                sb = new StringBuilder();
                sb.append("[Slim] ");
                sb.append(C4540bn.m13463a(C4540bn.this).format(new Date()));
                sb.append(this.f8238a);
                sb.append(" Blob [");
                sb.append(flVar.mo25112a());
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb.append(flVar.mo25112a());
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb.append(flVar.mo25124e());
                str = "]";
            }
            sb.append(str);
            C3989b.m10680c(sb.toString());
        }

        /* renamed from: a */
        public void mo24778a(C4701gj gjVar) {
            String str;
            StringBuilder sb;
            if (C4540bn.f8230a) {
                sb = new StringBuilder();
                sb.append("[Slim] ");
                sb.append(C4540bn.m13463a(C4540bn.this).format(new Date()));
                sb.append(this.f8238a);
                sb.append(" PKT ");
                str = gjVar.mo25186a();
            } else {
                sb = new StringBuilder();
                sb.append("[Slim] ");
                sb.append(C4540bn.m13463a(C4540bn.this).format(new Date()));
                sb.append(this.f8238a);
                sb.append(" PKT [");
                sb.append(gjVar.mo25215k());
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb.append(gjVar.mo25214j());
                str = "]";
            }
            sb.append(str);
            C3989b.m10680c(sb.toString());
        }

        /* renamed from: a */
        public boolean m13468a(C4701gj gjVar) {
            return true;
        }
    }

    public C4540bn(C4680fs fsVar) {
        this.f8232a = fsVar;
        m13465a();
    }

    /* renamed from: a */
    private void m13465a() {
        this.f8231a = new C4541a(true);
        this.f8236b = new C4541a(false);
        C4680fs fsVar = this.f8232a;
        C4541a aVar = this.f8231a;
        fsVar.mo25147a((C4686fx) aVar, (C4696gf) aVar);
        C4680fs fsVar2 = this.f8232a;
        C4541a aVar2 = this.f8236b;
        fsVar2.mo25153b((C4686fx) aVar2, (C4696gf) aVar2);
        this.f8233a = new C4542bo(this);
    }
}
