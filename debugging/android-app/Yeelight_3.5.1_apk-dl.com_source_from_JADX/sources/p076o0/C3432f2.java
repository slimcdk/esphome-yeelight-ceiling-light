package p076o0;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C0736d;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0768e;
import com.google.android.gms.common.api.internal.C0793j;
import com.google.android.gms.common.internal.C0897c;
import com.google.android.gms.common.internal.C0904d;
import com.google.android.gms.common.internal.C0907e;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.internal.wearable.C1443f3;
import com.google.android.gms.internal.wearable.C1501r1;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.internal.C1919j;
import com.google.android.gms.wearable.internal.zzdd;
import com.google.android.gms.wearable.internal.zzge;
import com.miot.common.ReturnCode;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import p069n0.C3355a;
import p069n0.C3357c;
import p069n0.C3364j;
import p069n0.C3372q;
import p223w3.C11627r;

/* renamed from: o0.f2 */
public final class C3432f2 extends C0907e<C3477s0> {

    /* renamed from: S */
    private final ExecutorService f5559S;

    /* renamed from: T */
    private final C3486v0 f5560T = new C3486v0();

    /* renamed from: U */
    private final C3486v0 f5561U = new C3486v0();

    /* renamed from: V */
    private final C3486v0<C3357c> f5562V = new C3486v0<>();

    /* renamed from: W */
    private final C3486v0<DataApi.C1899a> f5563W = new C3486v0<>();

    /* renamed from: X */
    private final C3486v0<C3364j> f5564X = new C3486v0<>();

    /* renamed from: Y */
    private final C3486v0 f5565Y = new C3486v0();

    /* renamed from: Z */
    private final C3486v0 f5566Z = new C3486v0();

    /* renamed from: a0 */
    private final C3486v0 f5567a0 = new C3486v0();

    /* renamed from: b0 */
    private final C3486v0<C3355a> f5568b0 = new C3486v0<>();

    /* renamed from: c0 */
    private final C3436g2 f5569c0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3432f2(Context context, Looper looper, C0736d.C0738b bVar, C0736d.C0739c cVar, C0904d dVar) {
        super(context, looper, 14, dVar, bVar, cVar);
        C1443f3.m3530a();
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        C3436g2 a = C3436g2.m9460a(context);
        this.f5559S = (ExecutorService) C0917i.m1419j(unconfigurableExecutorService);
        this.f5569c0 = a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final String mo12198G() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final String mo12199H() {
        return "com.google.android.gms.wearable.BIND";
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final String mo12200I() {
        return this.f5569c0.mo24267b("com.google.android.wearable.app.cn") ? "com.google.android.wearable.app.cn" : "com.google.android.gms";
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public final void mo12207P(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (Log.isLoggable("WearableClient", 2)) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("onPostInitHandler: statusCode ");
            sb.append(i);
        }
        if (i == 0) {
            this.f5560T.mo24322a(iBinder);
            this.f5561U.mo24322a(iBinder);
            this.f5562V.mo24322a(iBinder);
            this.f5563W.mo24322a(iBinder);
            this.f5564X.mo24322a(iBinder);
            this.f5565Y.mo24322a(iBinder);
            this.f5566Z.mo24322a(iBinder);
            this.f5567a0.mo24322a(iBinder);
            this.f5568b0.mo24322a(iBinder);
            i = 0;
        }
        super.mo12207P(i, iBinder, bundle, i2);
    }

    /* renamed from: U */
    public final boolean mo12212U() {
        return true;
    }

    /* renamed from: f */
    public final void mo12220f(@NonNull C0897c.C0900c cVar) {
        if (!mo12224i()) {
            try {
                Bundle bundle = mo12192A().getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                int i = bundle != null ? bundle.getInt("com.google.android.wearable.api.version", 0) : 0;
                if (i < 8600000) {
                    StringBuilder sb = new StringBuilder(82);
                    sb.append("The Wear OS app is out of date. Requires API version 8600000 but found ");
                    sb.append(i);
                    Context A = mo12192A();
                    Context A2 = mo12192A();
                    Intent intent = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (A2.getPackageManager().resolveActivity(intent, 65536) == null) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
                    }
                    mo12211T(cVar, 6, C1501r1.m3740a(A, 0, intent, C1501r1.f1835a));
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                mo12211T(cVar, 16, (PendingIntent) null);
                return;
            }
        }
        super.mo12220f(cVar);
    }

    /* renamed from: i */
    public final boolean mo12224i() {
        return !this.f5569c0.mo24267b("com.google.android.wearable.app.cn");
    }

    /* renamed from: k */
    public final int mo12226k() {
        return 8600000;
    }

    /* renamed from: n0 */
    public final void mo24256n0(C0768e<Object> eVar, PutDataRequest putDataRequest) {
        C0768e<Object> eVar2 = eVar;
        for (Map.Entry<String, Asset> value : putDataRequest.mo14807A().entrySet()) {
            Asset asset = (Asset) value.getValue();
            if (asset.mo14784f0() == null && asset.mo14781c0() == null && asset.mo14782d0() == null && asset.mo14780T() == null) {
                String valueOf = String.valueOf(putDataRequest.mo14808T());
                String valueOf2 = String.valueOf(asset);
                StringBuilder sb = new StringBuilder(valueOf.length() + 33 + valueOf2.length());
                sb.append("Put for ");
                sb.append(valueOf);
                sb.append(" contains invalid asset: ");
                sb.append(valueOf2);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        PutDataRequest h0 = PutDataRequest.m5035h0(putDataRequest.mo14808T());
        h0.mo14811d0(putDataRequest.mo14814m());
        if (putDataRequest.mo14809W()) {
            h0.mo14812f0();
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : putDataRequest.mo14807A().entrySet()) {
            Asset asset2 = (Asset) next.getValue();
            if (asset2.mo14784f0() != null) {
                try {
                    ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                    if (Log.isLoggable("WearableClient", 3)) {
                        String valueOf3 = String.valueOf(asset2);
                        String valueOf4 = String.valueOf(createPipe[0]);
                        String valueOf5 = String.valueOf(createPipe[1]);
                        int length = valueOf3.length();
                        StringBuilder sb2 = new StringBuilder(length + 61 + valueOf4.length() + valueOf5.length());
                        sb2.append("processAssets: replacing data with FD in asset: ");
                        sb2.append(valueOf3);
                        sb2.append(" read:");
                        sb2.append(valueOf4);
                        sb2.append(" write:");
                        sb2.append(valueOf5);
                    }
                    h0.mo14810c0((String) next.getKey(), Asset.m5019V(createPipe[0]));
                    FutureTask futureTask = new FutureTask(new C3428e2(this, createPipe[1], asset2.mo14784f0()));
                    arrayList.add(futureTask);
                    this.f5559S.submit(futureTask);
                } catch (IOException e) {
                    String valueOf6 = String.valueOf(putDataRequest);
                    StringBuilder sb3 = new StringBuilder(valueOf6.length() + 60);
                    sb3.append("Unable to create ParcelFileDescriptor for asset in request: ");
                    sb3.append(valueOf6);
                    throw new IllegalStateException(sb3.toString(), e);
                }
            } else if (asset2.mo14780T() != null) {
                try {
                    h0.mo14810c0((String) next.getKey(), Asset.m5019V(mo12192A().getContentResolver().openFileDescriptor(asset2.mo14780T(), C11627r.f21359c0)));
                } catch (FileNotFoundException unused) {
                    new C3420c2(eVar2, arrayList).mo24224g0(new zzge(ReturnCode.E_ACCOUNT_TIMEDIFF, (zzdd) null));
                    String valueOf7 = String.valueOf(asset2.mo14780T());
                    StringBuilder sb4 = new StringBuilder(valueOf7.length() + 28);
                    sb4.append("Couldn't resolve asset URI: ");
                    sb4.append(valueOf7);
                    return;
                }
            } else {
                h0.mo14810c0((String) next.getKey(), asset2);
            }
        }
        ((C3477s0) mo12197F()).mo24316f(new C3420c2(eVar2, arrayList), h0);
    }

    /* renamed from: o0 */
    public final void mo24257o0(C0768e<Status> eVar, DataApi.C1899a aVar, C0793j<? extends DataApi.C1899a> jVar, IntentFilter[] intentFilterArr) {
        this.f5563W.mo24323b(this, eVar, aVar, C1919j.m5064e(jVar, intentFilterArr));
    }

    /* renamed from: p0 */
    public final void mo24258p0(C0768e<Status> eVar, C3364j jVar, C0793j<? extends C3364j> jVar2, IntentFilter[] intentFilterArr) {
        this.f5564X.mo24323b(this, eVar, jVar, C1919j.m5065f(jVar2, intentFilterArr));
    }

    /* renamed from: q0 */
    public final void mo24259q0(C0768e<Status> eVar, C3355a aVar, C0793j<? extends C3355a> jVar, IntentFilter[] intentFilterArr) {
        this.f5568b0.mo24323b(this, eVar, aVar, C1919j.m5063T(jVar, intentFilterArr));
    }

    /* renamed from: r0 */
    public final void mo24260r0(C0768e<Status> eVar, DataApi.C1899a aVar) {
        this.f5563W.mo24324c(this, eVar, aVar);
    }

    /* renamed from: s0 */
    public final void mo24261s0(C0768e<Status> eVar, C3364j jVar) {
        this.f5564X.mo24324c(this, eVar, jVar);
    }

    /* renamed from: t0 */
    public final void mo24262t0(C0768e<Status> eVar, C3355a aVar) {
        this.f5568b0.mo24324c(this, eVar, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final /* bridge */ /* synthetic */ IInterface mo12233u(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        return queryLocalInterface instanceof C3477s0 ? (C3477s0) queryLocalInterface : new C3477s0(iBinder);
    }

    /* renamed from: x */
    public final Feature[] mo12236x() {
        return C3372q.f5486e;
    }
}
