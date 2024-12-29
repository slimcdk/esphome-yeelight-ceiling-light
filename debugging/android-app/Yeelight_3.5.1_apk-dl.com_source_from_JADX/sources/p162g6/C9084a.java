package p162g6;

import java.net.Socket;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedKeyManager;
import javax.net.ssl.X509KeyManager;

/* renamed from: g6.a */
public class C9084a extends X509ExtendedKeyManager {

    /* renamed from: a */
    private String f16688a;

    /* renamed from: b */
    private X509KeyManager f16689b;

    public C9084a(String str, X509KeyManager x509KeyManager) {
        this.f16688a = str;
        this.f16689b = x509KeyManager;
    }

    public String chooseClientAlias(String[] strArr, Principal[] principalArr, Socket socket) {
        String str = this.f16688a;
        return str == null ? this.f16689b.chooseClientAlias(strArr, principalArr, socket) : str;
    }

    public String chooseEngineClientAlias(String[] strArr, Principal[] principalArr, SSLEngine sSLEngine) {
        String str = this.f16688a;
        return str == null ? super.chooseEngineClientAlias(strArr, principalArr, sSLEngine) : str;
    }

    public String chooseEngineServerAlias(String str, Principal[] principalArr, SSLEngine sSLEngine) {
        String str2 = this.f16688a;
        return str2 == null ? super.chooseEngineServerAlias(str, principalArr, sSLEngine) : str2;
    }

    public String chooseServerAlias(String str, Principal[] principalArr, Socket socket) {
        String str2 = this.f16688a;
        return str2 == null ? this.f16689b.chooseServerAlias(str, principalArr, socket) : str2;
    }

    public X509Certificate[] getCertificateChain(String str) {
        return this.f16689b.getCertificateChain(str);
    }

    public String[] getClientAliases(String str, Principal[] principalArr) {
        return this.f16689b.getClientAliases(str, principalArr);
    }

    public PrivateKey getPrivateKey(String str) {
        return this.f16689b.getPrivateKey(str);
    }

    public String[] getServerAliases(String str, Principal[] principalArr) {
        return this.f16689b.getServerAliases(str, principalArr);
    }
}
