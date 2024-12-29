package p164h.p211a.p212a.p228h.p230b0;

import java.net.Socket;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedKeyManager;
import javax.net.ssl.X509KeyManager;

/* renamed from: h.a.a.h.b0.a */
public class C11101a extends X509ExtendedKeyManager {

    /* renamed from: a */
    private String f21909a;

    /* renamed from: b */
    private X509KeyManager f21910b;

    public C11101a(String str, X509KeyManager x509KeyManager) {
        this.f21909a = str;
        this.f21910b = x509KeyManager;
    }

    public String chooseClientAlias(String[] strArr, Principal[] principalArr, Socket socket) {
        String str = this.f21909a;
        return str == null ? this.f21910b.chooseClientAlias(strArr, principalArr, socket) : str;
    }

    public String chooseEngineClientAlias(String[] strArr, Principal[] principalArr, SSLEngine sSLEngine) {
        String str = this.f21909a;
        return str == null ? super.chooseEngineClientAlias(strArr, principalArr, sSLEngine) : str;
    }

    public String chooseEngineServerAlias(String str, Principal[] principalArr, SSLEngine sSLEngine) {
        String str2 = this.f21909a;
        return str2 == null ? super.chooseEngineServerAlias(str, principalArr, sSLEngine) : str2;
    }

    public String chooseServerAlias(String str, Principal[] principalArr, Socket socket) {
        String str2 = this.f21909a;
        return str2 == null ? this.f21910b.chooseServerAlias(str, principalArr, socket) : str2;
    }

    public X509Certificate[] getCertificateChain(String str) {
        return this.f21910b.getCertificateChain(str);
    }

    public String[] getClientAliases(String str, Principal[] principalArr) {
        return this.f21910b.getClientAliases(str, principalArr);
    }

    public PrivateKey getPrivateKey(String str) {
        return this.f21910b.getPrivateKey(str);
    }

    public String[] getServerAliases(String str, Principal[] principalArr) {
        return this.f21910b.getServerAliases(str, principalArr);
    }
}
