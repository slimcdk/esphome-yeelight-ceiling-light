package com.yeelight.yeelib.p152f;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.yeelight.yeelib.p152f.C4214g;
import com.yeelight.yeelib.p153g.C9846o;
import java.io.File;
import java.util.HashMap;

/* renamed from: com.yeelight.yeelib.f.x */
public class C4295x {

    /* renamed from: c */
    public static C4295x f7452c;

    /* renamed from: a */
    private DownloadManager f7453a = ((DownloadManager) C4297y.f7456e.getSystemService("download"));
    /* access modifiers changed from: private */

    /* renamed from: b */
    public HashMap<Long, Object> f7454b = new HashMap<>();

    /* renamed from: com.yeelight.yeelib.f.x$a */
    class C4296a extends BroadcastReceiver {
        C4296a() {
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            long longExtra = intent.getLongExtra("extra_download_id", -1);
            "Download intent action: " + action;
            "Download id: " + longExtra;
            C4295x.this.f7454b.remove(Long.valueOf(longExtra));
        }
    }

    public C4295x() {
        new HashMap();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE");
        C4297y.f7456e.registerReceiver(new C4296a(), intentFilter);
    }

    /* renamed from: g */
    public static C4295x m12055g() {
        if (f7452c == null) {
            f7452c = new C4295x();
        }
        return f7452c;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
        if (r0.equals("yeelink.light.dnlight2") != false) goto L_0x00b4;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23721b(java.lang.Object r7) {
        /*
            r6 = this;
            android.content.Context r0 = com.yeelight.yeelib.p152f.C4297y.f7456e     // Catch:{ IllegalArgumentException -> 0x00f3 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ IllegalArgumentException -> 0x00f3 }
            java.lang.String r1 = "com.android.providers.downloads"
            int r0 = r0.getApplicationEnabledSetting(r1)     // Catch:{ IllegalArgumentException -> 0x00f3 }
            r1 = 2
            if (r0 == r1) goto L_0x00f3
            r2 = 3
            if (r0 != r2) goto L_0x0014
            goto L_0x00f3
        L_0x0014:
            boolean r0 = r7 instanceof com.yeelight.yeelib.p152f.C4214g.C4219d
            if (r0 == 0) goto L_0x00ca
            com.yeelight.yeelib.f.g$d r7 = (com.yeelight.yeelib.p152f.C4214g.C4219d) r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "download firmware for model: "
            r0.append(r3)
            java.lang.String r3 = r7.mo23520b()
            r0.append(r3)
            r0.toString()
            java.lang.String r0 = r7.mo23520b()
            java.util.HashMap<java.lang.Long, java.lang.Object> r3 = r6.f7454b
            java.util.Collection r3 = r3.values()
            java.util.Iterator r3 = r3.iterator()
        L_0x003c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0057
            java.lang.Object r4 = r3.next()
            boolean r5 = r4 instanceof com.yeelight.yeelib.p152f.C4214g.C4219d
            if (r5 == 0) goto L_0x003c
            com.yeelight.yeelib.f.g$d r4 = (com.yeelight.yeelib.p152f.C4214g.C4219d) r4
            java.lang.String r4 = r4.mo23520b()
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x003c
            return
        L_0x0057:
            java.lang.String r0 = r7.mo23520b()
            r3 = -1
            int r4 = r0.hashCode()
            switch(r4) {
                case -1400275319: goto L_0x00a9;
                case -1199119278: goto L_0x009f;
                case -443031172: goto L_0x0095;
                case 1201766335: goto L_0x008b;
                case 1201766336: goto L_0x0081;
                case 2102612488: goto L_0x0077;
                case 2102612489: goto L_0x006d;
                case 2146130361: goto L_0x0064;
                default: goto L_0x0063;
            }
        L_0x0063:
            goto L_0x00b3
        L_0x0064:
            java.lang.String r2 = "yeelink.light.dnlight2"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00b3
            goto L_0x00b4
        L_0x006d:
            java.lang.String r1 = "yeelink.light.meshbulb2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b3
            r1 = 4
            goto L_0x00b4
        L_0x0077:
            java.lang.String r1 = "yeelink.light.meshbulb1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b3
            r1 = 3
            goto L_0x00b4
        L_0x0081:
            java.lang.String r1 = "yeelink.light.ml2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b3
            r1 = 7
            goto L_0x00b4
        L_0x008b:
            java.lang.String r1 = "yeelink.light.ml1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b3
            r1 = 6
            goto L_0x00b4
        L_0x0095:
            java.lang.String r1 = "yeelink.light.spot1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b3
            r1 = 5
            goto L_0x00b4
        L_0x009f:
            java.lang.String r1 = "yeelink.light.gingko"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b3
            r1 = 1
            goto L_0x00b4
        L_0x00a9:
            java.lang.String r1 = "yeelink.light.ble1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b3
            r1 = 0
            goto L_0x00b4
        L_0x00b3:
            r1 = -1
        L_0x00b4:
            switch(r1) {
                case 0: goto L_0x00c4;
                case 1: goto L_0x00be;
                case 2: goto L_0x00b8;
                case 3: goto L_0x00b8;
                case 4: goto L_0x00b8;
                case 5: goto L_0x00b8;
                case 6: goto L_0x00b8;
                case 7: goto L_0x00b8;
                default: goto L_0x00b7;
            }
        L_0x00b7:
            goto L_0x00f3
        L_0x00b8:
            com.yeelight.yeelib.f.g$f r7 = (com.yeelight.yeelib.p152f.C4214g.C4221f) r7
            r6.mo23725f(r7)
            goto L_0x00f3
        L_0x00be:
            com.yeelight.yeelib.f.g$e r7 = (com.yeelight.yeelib.p152f.C4214g.C4220e) r7
            r6.mo23723d(r7)
            goto L_0x00f3
        L_0x00c4:
            com.yeelight.yeelib.f.g$c r7 = (com.yeelight.yeelib.p152f.C4214g.C4218c) r7
            r6.mo23722c(r7)
            goto L_0x00f3
        L_0x00ca:
            boolean r0 = r7 instanceof com.yeelight.yeelib.p153g.C9846o
            if (r0 == 0) goto L_0x00f3
            com.yeelight.yeelib.g.o r7 = (com.yeelight.yeelib.p153g.C9846o) r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "download launch page: "
            r0.append(r1)
            java.lang.String r1 = r7.mo31798d()
            r0.append(r1)
            java.lang.String r1 = ", title: "
            r0.append(r1)
            java.lang.String r1 = r7.mo31803i()
            r0.append(r1)
            r0.toString()
            r6.mo23724e(r7)
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p152f.C4295x.mo23721b(java.lang.Object):void");
    }

    /* renamed from: c */
    public void mo23722c(C4214g.C4218c cVar) {
        File externalFilesDir = C4297y.f7456e.getExternalFilesDir((String) null);
        if (externalFilesDir != null) {
            String str = externalFilesDir.getAbsolutePath() + "/cherry/" + cVar.mo23519a();
            "Download cherry firmware, firmware storage path: " + str;
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(cVar.mo23513h()));
            Uri fromFile = Uri.fromFile(new File(str + "/app1.bin"));
            "Download cherry firmware, app1 url: " + cVar.mo23513h();
            "Download cherry firmware, app1 destination uri: " + fromFile.toString();
            request.setDestinationUri(fromFile);
            if (ContextCompat.checkSelfPermission(C4297y.f7456e, "android.permission.DOWNLOAD_WITHOUT_NOTIFICATION") == 0) {
                request.setNotificationVisibility(2);
            }
            request.setVisibleInDownloadsUi(false);
            long enqueue = this.f7453a.enqueue(request);
            "Download request enqueued, download id: " + enqueue;
            this.f7454b.put(Long.valueOf(enqueue), cVar);
            DownloadManager.Request request2 = new DownloadManager.Request(Uri.parse(cVar.mo23516k()));
            Uri fromFile2 = Uri.fromFile(new File(str + "/app2.bin"));
            "Download cherry firmware, app2 url: " + cVar.mo23516k();
            "Download cherry firmware, app2 destination uri: " + fromFile2.toString();
            request2.setDestinationUri(fromFile2);
            if (ContextCompat.checkSelfPermission(C4297y.f7456e, "android.permission.DOWNLOAD_WITHOUT_NOTIFICATION") == 0) {
                request2.setNotificationVisibility(2);
            }
            request2.setVisibleInDownloadsUi(false);
            long enqueue2 = this.f7453a.enqueue(request2);
            "Download request enqueued, download id: " + enqueue2;
            this.f7454b.put(Long.valueOf(enqueue2), cVar);
            DownloadManager.Request request3 = new DownloadManager.Request(Uri.parse(cVar.mo23509e()));
            Uri fromFile3 = Uri.fromFile(new File(str + "/app2541.bin"));
            "Download cherry firmware, app2541 url: " + cVar.mo23509e();
            "Download cherry firmware, app2541 destination uri: " + fromFile3.toString();
            request3.setDestinationUri(fromFile3);
            if (ContextCompat.checkSelfPermission(C4297y.f7456e, "android.permission.DOWNLOAD_WITHOUT_NOTIFICATION") == 0) {
                request3.setNotificationVisibility(2);
            }
            request3.setVisibleInDownloadsUi(false);
            long enqueue3 = this.f7453a.enqueue(request3);
            "Download request enqueued, download id: " + enqueue3;
            this.f7454b.put(Long.valueOf(enqueue3), cVar);
        }
    }

    /* renamed from: d */
    public void mo23723d(C4214g.C4220e eVar) {
        File externalFilesDir = C4297y.f7456e.getExternalFilesDir((String) null);
        if (externalFilesDir != null) {
            String str = externalFilesDir.getAbsolutePath() + "/gingko";
            "Download gingko firmware, download url: " + eVar.mo23523e();
            "Download gingko firmware, firmware storage path: " + str;
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(eVar.mo23523e()));
            Uri fromFile = Uri.fromFile(new File(str + MiotCloudImpl.COOKIE_PATH + eVar.mo23524f() + ".bin"));
            StringBuilder sb = new StringBuilder();
            sb.append("Download ginkgo firmware, destination uri: ");
            sb.append(fromFile.toString());
            sb.toString();
            request.setDestinationUri(fromFile);
            if (ContextCompat.checkSelfPermission(C4297y.f7456e, "android.permission.DOWNLOAD_WITHOUT_NOTIFICATION") == 0) {
                request.setNotificationVisibility(2);
            }
            request.setVisibleInDownloadsUi(false);
            long enqueue = this.f7453a.enqueue(request);
            "Download request enqueued, download id: " + enqueue;
            this.f7454b.put(Long.valueOf(enqueue), eVar);
        }
    }

    /* renamed from: e */
    public void mo23724e(C9846o oVar) {
        File externalFilesDir = C4297y.f7456e.getExternalFilesDir((String) null);
        if (externalFilesDir != null) {
            String str = externalFilesDir.getAbsolutePath() + "/launch/" + oVar.mo31798d();
            "Download launch page, download url: " + oVar.mo31799e();
            "Download launch page, storage path: " + str;
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(oVar.mo31799e()));
            Uri fromFile = Uri.fromFile(new File(str + MiotCloudImpl.COOKIE_PATH + "pic.png"));
            StringBuilder sb = new StringBuilder();
            sb.append("Download launch page, destination uri: ");
            sb.append(fromFile.toString());
            sb.toString();
            request.setDestinationUri(fromFile);
            if (ContextCompat.checkSelfPermission(C4297y.f7456e, "android.permission.DOWNLOAD_WITHOUT_NOTIFICATION") == 0) {
                request.setNotificationVisibility(2);
            }
            request.setVisibleInDownloadsUi(false);
            this.f7454b.put(Long.valueOf(this.f7453a.enqueue(request)), oVar);
        }
    }

    /* renamed from: f */
    public void mo23725f(C4214g.C4221f fVar) {
        File externalFilesDir;
        if (!TextUtils.isEmpty(fVar.mo23529e()) && (externalFilesDir = C4297y.f7456e.getExternalFilesDir((String) null)) != null) {
            String str = externalFilesDir.getAbsolutePath() + MiotCloudImpl.COOKIE_PATH + mo23726h(fVar.mo23520b());
            "Download " + fVar.mo23520b() + " firmware, download url: " + fVar.mo23529e();
            "Download " + fVar.mo23520b() + " firmware, firmware storage path: " + str;
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(fVar.mo23529e()));
            Uri fromFile = Uri.fromFile(new File(str + MiotCloudImpl.COOKIE_PATH + fVar.mo23530f() + ".bin"));
            "Download " + fVar.mo23520b() + " firmware, destination uri: " + fromFile.toString();
            request.setDestinationUri(fromFile);
            if (ContextCompat.checkSelfPermission(C4297y.f7456e, "android.permission.DOWNLOAD_WITHOUT_NOTIFICATION") == 0) {
                request.setNotificationVisibility(2);
            }
            request.setVisibleInDownloadsUi(false);
            long enqueue = this.f7453a.enqueue(request);
            "Download request enqueued, download id: " + enqueue;
            this.f7454b.put(Long.valueOf(enqueue), fVar);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo23726h(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = r7.hashCode()
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r0) {
                case -443031172: goto L_0x003f;
                case 1201766335: goto L_0x0035;
                case 1201766336: goto L_0x002b;
                case 2102612488: goto L_0x0021;
                case 2102612489: goto L_0x0017;
                case 2146130361: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0049
        L_0x000d:
            java.lang.String r0 = "yeelink.light.dnlight2"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0049
            r7 = 0
            goto L_0x004a
        L_0x0017:
            java.lang.String r0 = "yeelink.light.meshbulb2"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0049
            r7 = 2
            goto L_0x004a
        L_0x0021:
            java.lang.String r0 = "yeelink.light.meshbulb1"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0049
            r7 = 1
            goto L_0x004a
        L_0x002b:
            java.lang.String r0 = "yeelink.light.ml2"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0049
            r7 = 5
            goto L_0x004a
        L_0x0035:
            java.lang.String r0 = "yeelink.light.ml1"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0049
            r7 = 4
            goto L_0x004a
        L_0x003f:
            java.lang.String r0 = "yeelink.light.spot1"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0049
            r7 = 3
            goto L_0x004a
        L_0x0049:
            r7 = -1
        L_0x004a:
            if (r7 == 0) goto L_0x0068
            if (r7 == r5) goto L_0x0065
            if (r7 == r4) goto L_0x0062
            if (r7 == r3) goto L_0x005f
            if (r7 == r2) goto L_0x005c
            if (r7 == r1) goto L_0x0059
            java.lang.String r7 = ""
            return r7
        L_0x0059:
            java.lang.String r7 = "ml2"
            return r7
        L_0x005c:
            java.lang.String r7 = "ml1"
            return r7
        L_0x005f:
            java.lang.String r7 = "spot1"
            return r7
        L_0x0062:
            java.lang.String r7 = "meshbulb2"
            return r7
        L_0x0065:
            java.lang.String r7 = "meshbulb1"
            return r7
        L_0x0068:
            java.lang.String r7 = "downlight2"
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p152f.C4295x.mo23726h(java.lang.String):java.lang.String");
    }

    /* renamed from: i */
    public boolean mo23727i(String str) {
        for (Object next : this.f7454b.values()) {
            if ((next instanceof C9846o) && ((C9846o) next).mo31798d().equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public void mo23728j() {
        this.f7454b.keySet().toArray(new Long[0]);
    }
}
