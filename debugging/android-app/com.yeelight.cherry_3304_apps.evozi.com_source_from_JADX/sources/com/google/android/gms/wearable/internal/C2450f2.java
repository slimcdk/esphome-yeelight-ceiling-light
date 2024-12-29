package com.google.android.gms.wearable.internal;

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
import com.google.android.gms.common.api.C1399f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1422d;
import com.google.android.gms.common.api.internal.C1445i;
import com.google.android.gms.common.internal.C1550d;
import com.google.android.gms.common.internal.C1564e;
import com.google.android.gms.common.internal.C1572h;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.C2418a;
import com.google.android.gms.wearable.C2420c;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.MessageApi;
import com.google.android.gms.wearable.PutDataRequest;
import com.miot.common.ReturnCode;
import com.yeelight.yeelib.p150c.p183m.C7200r;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* renamed from: com.google.android.gms.wearable.internal.f2 */
public final class C2450f2 extends C1572h<C2504u0> {

    /* renamed from: D */
    private final ExecutorService f4876D;

    /* renamed from: E */
    private final C2510w0<Object> f4877E;

    /* renamed from: F */
    private final C2510w0<Object> f4878F;

    /* renamed from: G */
    private final C2510w0<C2420c> f4879G;

    /* renamed from: H */
    private final C2510w0<DataApi.C2413a> f4880H;

    /* renamed from: I */
    private final C2510w0<MessageApi.C2415a> f4881I;

    /* renamed from: J */
    private final C2510w0<Object> f4882J;

    /* renamed from: K */
    private final C2510w0<Object> f4883K;

    /* renamed from: L */
    private final C2510w0<C2418a> f4884L;

    /* renamed from: M */
    private final C2478m2 f4885M;

    public C2450f2(Context context, Looper looper, C1399f.C1401b bVar, C1399f.C1402c cVar, C1564e eVar) {
        this(context, looper, bVar, cVar, eVar, Executors.newCachedThreadPool(), C2478m2.m8008a(context));
    }

    @VisibleForTesting
    private C2450f2(Context context, Looper looper, C1399f.C1401b bVar, C1399f.C1402c cVar, C1564e eVar, ExecutorService executorService, C2478m2 m2Var) {
        super(context, looper, 14, eVar, bVar, cVar);
        this.f4877E = new C2510w0<>();
        this.f4878F = new C2510w0<>();
        this.f4879G = new C2510w0<>();
        this.f4880H = new C2510w0<>();
        this.f4881I = new C2510w0<>();
        this.f4882J = new C2510w0<>();
        this.f4883K = new C2510w0<>();
        this.f4884L = new C2510w0<>();
        C1609u.m4475k(executorService);
        this.f4876D = executorService;
        this.f4885M = m2Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final String mo11145F() {
        return this.f4885M.mo13348e("com.google.android.wearable.app.cn") ? "com.google.android.wearable.app.cn" : "com.google.android.gms";
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final void mo11149J(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (Log.isLoggable("WearableClient", 2)) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("onPostInitHandler: statusCode ");
            sb.append(i);
            sb.toString();
        }
        if (i == 0) {
            this.f4877E.mo13383a(iBinder);
            this.f4878F.mo13383a(iBinder);
            this.f4879G.mo13383a(iBinder);
            this.f4880H.mo13383a(iBinder);
            this.f4881I.mo13383a(iBinder);
            this.f4882J.mo13383a(iBinder);
            this.f4883K.mo13383a(iBinder);
            this.f4884L.mo13383a(iBinder);
        }
        super.mo11149J(i, iBinder, bundle, i2);
    }

    /* renamed from: h */
    public final void mo11161h(@NonNull C1550d.C1553c cVar) {
        if (!mo11166m()) {
            try {
                Bundle bundle = mo11140A().getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                int i = bundle != null ? bundle.getInt("com.google.android.wearable.api.version", 0) : 0;
                if (i < 8600000) {
                    StringBuilder sb = new StringBuilder(82);
                    sb.append("The Wear OS app is out of date. Requires API version 8600000 but found ");
                    sb.append(i);
                    sb.toString();
                    Context A = mo11140A();
                    Context A2 = mo11140A();
                    Intent intent = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (A2.getPackageManager().resolveActivity(intent, 65536) == null) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
                    }
                    mo11153N(cVar, 6, PendingIntent.getActivity(A, 0, intent, 0));
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                mo11153N(cVar, 16, (PendingIntent) null);
                return;
            }
        }
        super.mo11161h(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final String mo11164k() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final /* synthetic */ IInterface mo11165l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        return queryLocalInterface instanceof C2504u0 ? (C2504u0) queryLocalInterface : new C2507v0(iBinder);
    }

    /* renamed from: m */
    public final boolean mo11166m() {
        return !this.f4885M.mo13348e("com.google.android.wearable.app.cn");
    }

    /* renamed from: n */
    public final int mo11167n() {
        return 8600000;
    }

    /* renamed from: n0 */
    public final void mo13299n0(C1422d<Status> dVar, C2418a aVar) {
        this.f4884L.mo13384b(this, dVar, aVar);
    }

    /* renamed from: o0 */
    public final void mo13300o0(C1422d<Status> dVar, C2418a aVar, C1445i<C2418a> iVar, IntentFilter[] intentFilterArr) {
        this.f4884L.mo13385c(this, dVar, aVar, C2458h2.m7975P0(iVar, intentFilterArr));
    }

    /* renamed from: p0 */
    public final void mo13301p0(C1422d<Status> dVar, DataApi.C2413a aVar) {
        this.f4880H.mo13384b(this, dVar, aVar);
    }

    /* renamed from: q0 */
    public final void mo13302q0(C1422d<Status> dVar, DataApi.C2413a aVar, C1445i<DataApi.C2413a> iVar, IntentFilter[] intentFilterArr) {
        this.f4880H.mo13385c(this, dVar, aVar, C2458h2.m7976e(iVar, intentFilterArr));
    }

    /* renamed from: r0 */
    public final void mo13303r0(C1422d<Status> dVar, MessageApi.C2415a aVar) {
        this.f4881I.mo13384b(this, dVar, aVar);
    }

    /* renamed from: s0 */
    public final void mo13304s0(C1422d<Status> dVar, MessageApi.C2415a aVar, C1445i<MessageApi.C2415a> iVar, IntentFilter[] intentFilterArr) {
        this.f4881I.mo13385c(this, dVar, aVar, C2458h2.m7974O0(iVar, intentFilterArr));
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final String mo11172t() {
        return "com.google.android.gms.wearable.BIND";
    }

    /* renamed from: t0 */
    public final void mo13305t0(C1422d<Object> dVar, PutDataRequest putDataRequest) {
        for (Map.Entry<String, Asset> value : putDataRequest.mo13216u().entrySet()) {
            Asset asset = (Asset) value.getValue();
            if (asset.mo13189h() == null && asset.mo13186S() == null && asset.mo13187T() == null && asset.mo13185M() == null) {
                String valueOf = String.valueOf(putDataRequest.mo13208M());
                String valueOf2 = String.valueOf(asset);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33 + String.valueOf(valueOf2).length());
                sb.append("Put for ");
                sb.append(valueOf);
                sb.append(" contains invalid asset: ");
                sb.append(valueOf2);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        PutDataRequest Z = PutDataRequest.m7861Z(putDataRequest.mo13208M());
        Z.mo13211T(putDataRequest.mo13214h());
        if (putDataRequest.mo13209R()) {
            Z.mo13212V();
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : putDataRequest.mo13216u().entrySet()) {
            Asset asset2 = (Asset) next.getValue();
            if (asset2.mo13189h() != null) {
                try {
                    ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                    if (Log.isLoggable("WearableClient", 3)) {
                        String valueOf3 = String.valueOf(asset2);
                        String valueOf4 = String.valueOf(createPipe[0]);
                        String valueOf5 = String.valueOf(createPipe[1]);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 61 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
                        sb2.append("processAssets: replacing data with FD in asset: ");
                        sb2.append(valueOf3);
                        sb2.append(" read:");
                        sb2.append(valueOf4);
                        sb2.append(" write:");
                        sb2.append(valueOf5);
                        sb2.toString();
                    }
                    Z.mo13210S((String) next.getKey(), Asset.m7842Q(createPipe[0]));
                    FutureTask futureTask = new FutureTask(new C2454g2(this, createPipe[1], asset2.mo13189h()));
                    arrayList.add(futureTask);
                    this.f4876D.submit(futureTask);
                } catch (IOException e) {
                    String valueOf6 = String.valueOf(putDataRequest);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf6).length() + 60);
                    sb3.append("Unable to create ParcelFileDescriptor for asset in request: ");
                    sb3.append(valueOf6);
                    throw new IllegalStateException(sb3.toString(), e);
                }
            } else if (asset2.mo13185M() != null) {
                try {
                    Z.mo13210S((String) next.getKey(), Asset.m7842Q(mo11140A().getContentResolver().openFileDescriptor(asset2.mo13185M(), C7200r.f14712G)));
                } catch (FileNotFoundException unused) {
                    new C2442d2(dVar, arrayList).mo13277n(new zzfu(ReturnCode.E_ACCOUNT_TIMEDIFF, (zzdd) null));
                    String valueOf7 = String.valueOf(asset2.mo13185M());
                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf7).length() + 28);
                    sb4.append("Couldn't resolve asset URI: ");
                    sb4.append(valueOf7);
                    sb4.toString();
                    return;
                }
            } else {
                Z.mo13210S((String) next.getKey(), asset2);
            }
        }
        ((C2504u0) mo11144E()).mo13376e0(new C2442d2(dVar, arrayList), Z);
    }
}
