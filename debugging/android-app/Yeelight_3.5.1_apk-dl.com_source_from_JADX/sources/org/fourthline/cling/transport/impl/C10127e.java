package org.fourthline.cling.transport.impl;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.p194io.IOUtils;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.model.message.C10028b;
import org.fourthline.cling.model.message.C10029c;
import org.fourthline.cling.model.message.C10032f;
import org.fourthline.cling.model.message.C10033g;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.UpnpResponse;
import p148d7.C8954d;
import p158f7.C9046b;

/* renamed from: org.fourthline.cling.transport.impl.e */
public class C10127e implements C8954d {

    /* renamed from: a */
    private static Logger f18707a = Logger.getLogger(C8954d.class.getName());

    /* renamed from: a */
    public DatagramPacket mo36790a(C10029c cVar) {
        StringBuilder sb = new StringBuilder();
        C10033g k = cVar.mo40404k();
        if (k instanceof UpnpRequest) {
            sb.append(((UpnpRequest) k).mo40415c());
            sb.append(" * ");
            sb.append("HTTP/1.");
            sb.append(k.mo40446a());
        } else if (k instanceof UpnpResponse) {
            UpnpResponse upnpResponse = (UpnpResponse) k;
            sb.append("HTTP/1.");
            sb.append(k.mo40446a());
            sb.append(" ");
            sb.append(upnpResponse.mo40422d());
            sb.append(" ");
            sb.append(upnpResponse.mo40423e());
        } else {
            throw new UnsupportedDataException("Message operation is not request or response, don't know how to process: " + cVar);
        }
        sb.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(sb);
        sb2.append(cVar.mo40403j().toString());
        sb2.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        if (f18707a.isLoggable(Level.FINER)) {
            Logger logger = f18707a;
            logger.finer("Writing message data for: " + cVar);
            f18707a.finer("---------------------------------------------------------------------------------");
            f18707a.finer(sb2.toString().substring(0, sb2.length() + -2));
            f18707a.finer("---------------------------------------------------------------------------------");
        }
        try {
            byte[] bytes = sb2.toString().getBytes("US-ASCII");
            Logger logger2 = f18707a;
            logger2.fine("Writing new datagram packet with " + bytes.length + " bytes for: " + cVar);
            return new DatagramPacket(bytes, bytes.length, cVar.mo40432u(), cVar.mo40433v());
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedDataException("Can't convert message content to US-ASCII: " + e.getMessage(), e, sb2);
        }
    }

    /* renamed from: b */
    public C10028b mo36791b(InetAddress inetAddress, DatagramPacket datagramPacket) {
        try {
            if (f18707a.isLoggable(Level.FINER)) {
                f18707a.finer("===================================== DATAGRAM BEGIN ============================================");
                f18707a.finer(new String(datagramPacket.getData(), "UTF-8"));
                f18707a.finer("-===================================== DATAGRAM END =============================================");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(datagramPacket.getData());
            String[] split = C9046b.m21669h(byteArrayInputStream).split(" ");
            if (split[0].startsWith("HTTP/1.")) {
                return mo40741d(inetAddress, datagramPacket, byteArrayInputStream, Integer.valueOf(split[1]).intValue(), split[2], split[0]);
            }
            return mo40740c(inetAddress, datagramPacket, byteArrayInputStream, split[0], split[2]);
        } catch (Exception e) {
            throw new UnsupportedDataException("Could not parse headers: " + e, e, datagramPacket.getData());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C10028b mo40740c(InetAddress inetAddress, DatagramPacket datagramPacket, ByteArrayInputStream byteArrayInputStream, String str, String str2) {
        C10032f fVar = new C10032f(byteArrayInputStream);
        UpnpRequest upnpRequest = new UpnpRequest(UpnpRequest.Method.getByHttpName(str));
        upnpRequest.mo40447b(str2.toUpperCase(Locale.ROOT).equals("HTTP/1.1") ? 1 : 0);
        C10028b bVar = new C10028b(upnpRequest, datagramPacket.getAddress(), datagramPacket.getPort(), inetAddress);
        bVar.mo40413t(fVar);
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C10028b mo40741d(InetAddress inetAddress, DatagramPacket datagramPacket, ByteArrayInputStream byteArrayInputStream, int i, String str, String str2) {
        C10032f fVar = new C10032f(byteArrayInputStream);
        UpnpResponse upnpResponse = new UpnpResponse(i, str);
        upnpResponse.mo40447b(str2.toUpperCase(Locale.ROOT).equals("HTTP/1.1") ? 1 : 0);
        C10028b bVar = new C10028b(upnpResponse, datagramPacket.getAddress(), datagramPacket.getPort(), inetAddress);
        bVar.mo40413t(fVar);
        return bVar;
    }
}
