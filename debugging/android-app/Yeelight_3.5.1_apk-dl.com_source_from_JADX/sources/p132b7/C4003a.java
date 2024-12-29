package p132b7;

import java.net.InetAddress;
import java.util.List;
import org.fourthline.cling.C10011c;
import org.fourthline.cling.model.C10020h;
import org.fourthline.cling.model.message.C10028b;
import org.fourthline.cling.model.message.C10029c;
import org.fourthline.cling.model.message.C10030d;
import org.fourthline.cling.model.message.C10031e;
import p148d7.C8963m;
import p230x6.C12004a;

/* renamed from: b7.a */
public interface C4003a {
    /* renamed from: a */
    void mo24966a(C10029c cVar);

    /* renamed from: b */
    void mo24967b(C10028b bVar);

    /* renamed from: c */
    List<C10020h> mo24968c(InetAddress inetAddress);

    /* renamed from: d */
    C10031e mo24969d(C10030d dVar);

    /* renamed from: e */
    boolean mo24970e();

    /* renamed from: f */
    void mo24971f(C8963m mVar);

    C10011c getConfiguration();

    C12004a getProtocolFactory();

    void shutdown();
}
