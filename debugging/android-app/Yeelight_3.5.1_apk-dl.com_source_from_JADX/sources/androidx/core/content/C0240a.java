package androidx.core.content;

/* renamed from: androidx.core.content.a */
public final /* synthetic */ class C0240a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ UnusedAppRestrictionsBackportServiceConnection f84a;

    public /* synthetic */ C0240a(UnusedAppRestrictionsBackportServiceConnection unusedAppRestrictionsBackportServiceConnection) {
        this.f84a = unusedAppRestrictionsBackportServiceConnection;
    }

    public final void run() {
        this.f84a.disconnectFromService();
    }
}
