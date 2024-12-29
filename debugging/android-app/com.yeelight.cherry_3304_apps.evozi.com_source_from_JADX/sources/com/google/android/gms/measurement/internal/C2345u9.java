package com.google.android.gms.measurement.internal;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* renamed from: com.google.android.gms.measurement.internal.u9 */
final class C2345u9 extends SSLSocket {

    /* renamed from: a */
    private final SSLSocket f4651a;

    C2345u9(C2356v9 v9Var, SSLSocket sSLSocket) {
        this.f4651a = sSLSocket;
    }

    public final void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f4651a.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void bind(SocketAddress socketAddress) {
        this.f4651a.bind(socketAddress);
    }

    public final synchronized void close() {
        this.f4651a.close();
    }

    public final void connect(SocketAddress socketAddress) {
        this.f4651a.connect(socketAddress);
    }

    public final void connect(SocketAddress socketAddress, int i) {
        this.f4651a.connect(socketAddress, i);
    }

    public final boolean equals(Object obj) {
        return this.f4651a.equals(obj);
    }

    public final SocketChannel getChannel() {
        return this.f4651a.getChannel();
    }

    public final boolean getEnableSessionCreation() {
        return this.f4651a.getEnableSessionCreation();
    }

    public final String[] getEnabledCipherSuites() {
        return this.f4651a.getEnabledCipherSuites();
    }

    public final String[] getEnabledProtocols() {
        return this.f4651a.getEnabledProtocols();
    }

    public final InetAddress getInetAddress() {
        return this.f4651a.getInetAddress();
    }

    public final InputStream getInputStream() {
        return this.f4651a.getInputStream();
    }

    public final boolean getKeepAlive() {
        return this.f4651a.getKeepAlive();
    }

    public final InetAddress getLocalAddress() {
        return this.f4651a.getLocalAddress();
    }

    public final int getLocalPort() {
        return this.f4651a.getLocalPort();
    }

    public final SocketAddress getLocalSocketAddress() {
        return this.f4651a.getLocalSocketAddress();
    }

    public final boolean getNeedClientAuth() {
        return this.f4651a.getNeedClientAuth();
    }

    public final boolean getOOBInline() {
        return this.f4651a.getOOBInline();
    }

    public final OutputStream getOutputStream() {
        return this.f4651a.getOutputStream();
    }

    public final int getPort() {
        return this.f4651a.getPort();
    }

    public final synchronized int getReceiveBufferSize() {
        return this.f4651a.getReceiveBufferSize();
    }

    public final SocketAddress getRemoteSocketAddress() {
        return this.f4651a.getRemoteSocketAddress();
    }

    public final boolean getReuseAddress() {
        return this.f4651a.getReuseAddress();
    }

    public final synchronized int getSendBufferSize() {
        return this.f4651a.getSendBufferSize();
    }

    public final SSLSession getSession() {
        return this.f4651a.getSession();
    }

    public final int getSoLinger() {
        return this.f4651a.getSoLinger();
    }

    public final synchronized int getSoTimeout() {
        return this.f4651a.getSoTimeout();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f4651a.getSupportedCipherSuites();
    }

    public final String[] getSupportedProtocols() {
        return this.f4651a.getSupportedProtocols();
    }

    public final boolean getTcpNoDelay() {
        return this.f4651a.getTcpNoDelay();
    }

    public final int getTrafficClass() {
        return this.f4651a.getTrafficClass();
    }

    public final boolean getUseClientMode() {
        return this.f4651a.getUseClientMode();
    }

    public final boolean getWantClientAuth() {
        return this.f4651a.getWantClientAuth();
    }

    public final boolean isBound() {
        return this.f4651a.isBound();
    }

    public final boolean isClosed() {
        return this.f4651a.isClosed();
    }

    public final boolean isConnected() {
        return this.f4651a.isConnected();
    }

    public final boolean isInputShutdown() {
        return this.f4651a.isInputShutdown();
    }

    public final boolean isOutputShutdown() {
        return this.f4651a.isOutputShutdown();
    }

    public final void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f4651a.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void sendUrgentData(int i) {
        this.f4651a.sendUrgentData(i);
    }

    public final void setEnableSessionCreation(boolean z) {
        this.f4651a.setEnableSessionCreation(z);
    }

    public final void setEnabledCipherSuites(String[] strArr) {
        this.f4651a.setEnabledCipherSuites(strArr);
    }

    public final void setEnabledProtocols(String[] strArr) {
        if (strArr != null && Arrays.asList(strArr).contains("SSLv3")) {
            ArrayList arrayList = new ArrayList(Arrays.asList(this.f4651a.getEnabledProtocols()));
            if (arrayList.size() > 1) {
                arrayList.remove("SSLv3");
            }
            strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        this.f4651a.setEnabledProtocols(strArr);
    }

    public final void setKeepAlive(boolean z) {
        this.f4651a.setKeepAlive(z);
    }

    public final void setNeedClientAuth(boolean z) {
        this.f4651a.setNeedClientAuth(z);
    }

    public final void setOOBInline(boolean z) {
        this.f4651a.setOOBInline(z);
    }

    public final void setPerformancePreferences(int i, int i2, int i3) {
        this.f4651a.setPerformancePreferences(i, i2, i3);
    }

    public final synchronized void setReceiveBufferSize(int i) {
        this.f4651a.setReceiveBufferSize(i);
    }

    public final void setReuseAddress(boolean z) {
        this.f4651a.setReuseAddress(z);
    }

    public final synchronized void setSendBufferSize(int i) {
        this.f4651a.setSendBufferSize(i);
    }

    public final void setSoLinger(boolean z, int i) {
        this.f4651a.setSoLinger(z, i);
    }

    public final synchronized void setSoTimeout(int i) {
        this.f4651a.setSoTimeout(i);
    }

    public final void setTcpNoDelay(boolean z) {
        this.f4651a.setTcpNoDelay(z);
    }

    public final void setTrafficClass(int i) {
        this.f4651a.setTrafficClass(i);
    }

    public final void setUseClientMode(boolean z) {
        this.f4651a.setUseClientMode(z);
    }

    public final void setWantClientAuth(boolean z) {
        this.f4651a.setWantClientAuth(z);
    }

    public final void shutdownInput() {
        this.f4651a.shutdownInput();
    }

    public final void shutdownOutput() {
        this.f4651a.shutdownOutput();
    }

    public final void startHandshake() {
        this.f4651a.startHandshake();
    }

    public final String toString() {
        return this.f4651a.toString();
    }
}
