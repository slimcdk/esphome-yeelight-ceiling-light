package p164h.p165b.p166a.p170k.p171d;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.p271io.IOUtils;
import p164h.p165b.p166a.p170k.p172e.C11484d;
import p164h.p165b.p166a.p240h.C11221k;
import p164h.p165b.p166a.p240h.p243r.C11241b;
import p164h.p165b.p166a.p240h.p243r.C11242c;
import p164h.p165b.p166a.p240h.p243r.C11245f;
import p164h.p165b.p166a.p240h.p243r.C11248h;
import p164h.p165b.p166a.p240h.p243r.C11249i;
import p164h.p165b.p166a.p240h.p243r.C11252j;
import p164h.p257c.p258a.C11494a;

/* renamed from: h.b.a.k.d.f */
public class C11461f implements C11484d {

    /* renamed from: a */
    private static Logger f22801a = Logger.getLogger(C11484d.class.getName());

    /* renamed from: a */
    public DatagramPacket mo36307a(C11242c cVar) {
        StringBuilder sb = new StringBuilder();
        C11248h k = cVar.mo35776k();
        if (k instanceof C11249i) {
            sb.append(((C11249i) k).mo35789c());
            sb.append(" * ");
            sb.append("HTTP/1.");
            sb.append(k.mo35787a());
        } else if (k instanceof C11252j) {
            C11252j jVar = (C11252j) k;
            sb.append("HTTP/1.");
            sb.append(k.mo35787a());
            sb.append(" ");
            sb.append(jVar.mo35796d());
            sb.append(" ");
            sb.append(jVar.mo35797e());
        } else {
            throw new C11221k("Message operation is not request or response, don't know how to process: " + cVar);
        }
        sb.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(sb);
        sb2.append(cVar.mo35747j().toString());
        sb2.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        if (f22801a.isLoggable(Level.FINER)) {
            Logger logger = f22801a;
            logger.finer("Writing message data for: " + cVar);
            f22801a.finer("---------------------------------------------------------------------------------");
            f22801a.finer(sb2.toString().substring(0, sb2.length() + -2));
            f22801a.finer("---------------------------------------------------------------------------------");
        }
        try {
            byte[] bytes = sb2.toString().getBytes("US-ASCII");
            Logger logger2 = f22801a;
            logger2.fine("Writing new datagram packet with " + bytes.length + " bytes for: " + cVar);
            return new DatagramPacket(bytes, bytes.length, cVar.mo35748u(), cVar.mo35749v());
        } catch (UnsupportedEncodingException e) {
            throw new C11221k("Can't convert message content to US-ASCII: " + e.getMessage(), e, sb2);
        }
    }

    /* renamed from: b */
    public C11241b mo36308b(InetAddress inetAddress, DatagramPacket datagramPacket) {
        try {
            if (f22801a.isLoggable(Level.FINER)) {
                f22801a.finer("===================================== DATAGRAM BEGIN ============================================");
                f22801a.finer(new String(datagramPacket.getData(), "UTF-8"));
                f22801a.finer("-===================================== DATAGRAM END =============================================");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(datagramPacket.getData());
            String[] split = C11494a.m30163h(byteArrayInputStream).split(" ");
            if (split[0].startsWith("HTTP/1.")) {
                return mo36310d(inetAddress, datagramPacket, byteArrayInputStream, Integer.valueOf(split[1]).intValue(), split[2], split[0]);
            }
            return mo36309c(inetAddress, datagramPacket, byteArrayInputStream, split[0], split[2]);
        } catch (Exception e) {
            throw new C11221k("Could not parse headers: " + e, e, datagramPacket.getData());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C11241b mo36309c(InetAddress inetAddress, DatagramPacket datagramPacket, ByteArrayInputStream byteArrayInputStream, String str, String str2) {
        C11245f fVar = new C11245f(byteArrayInputStream);
        C11249i iVar = new C11249i(C11249i.C11250a.m29432a(str));
        iVar.mo35788b(str2.toUpperCase(Locale.ROOT).equals("HTTP/1.1") ? 1 : 0);
        C11241b bVar = new C11241b(iVar, datagramPacket.getAddress(), datagramPacket.getPort(), inetAddress);
        bVar.mo35785t(fVar);
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C11241b mo36310d(InetAddress inetAddress, DatagramPacket datagramPacket, ByteArrayInputStream byteArrayInputStream, int i, String str, String str2) {
        C11245f fVar = new C11245f(byteArrayInputStream);
        C11252j jVar = new C11252j(i, str);
        jVar.mo35788b(str2.toUpperCase(Locale.ROOT).equals("HTTP/1.1") ? 1 : 0);
        C11241b bVar = new C11241b(jVar, datagramPacket.getAddress(), datagramPacket.getPort(), inetAddress);
        bVar.mo35785t(fVar);
        return bVar;
    }
}
