package com.yeelight.yeelib.managers;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.yeelight.yeelib.managers.C3064h;
import com.yeelight.yeelib.models.C8320l;
import java.io.File;
import java.util.HashMap;

/* renamed from: com.yeelight.yeelib.managers.w */
public class C3106w {

    /* renamed from: c */
    public static C3106w f4947c;

    /* renamed from: a */
    private DownloadManager f4948a = ((DownloadManager) C3108x.f4951e.getSystemService("download"));
    /* access modifiers changed from: private */

    /* renamed from: b */
    public HashMap<Long, Object> f4949b = new HashMap<>();

    /* renamed from: com.yeelight.yeelib.managers.w$a */
    class C3107a extends BroadcastReceiver {
        C3107a() {
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            long longExtra = intent.getLongExtra("extra_download_id", -1);
            StringBuilder sb = new StringBuilder();
            sb.append("Download intent action: ");
            sb.append(action);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Download id: ");
            sb2.append(longExtra);
            C3106w.this.f4949b.remove(Long.valueOf(longExtra));
        }
    }

    public C3106w() {
        new HashMap();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE");
        C3108x.f4951e.registerReceiver(new C3107a(), intentFilter);
    }

    /* renamed from: g */
    public static C3106w m8214g() {
        if (f4947c == null) {
            f4947c = new C3106w();
        }
        return f4947c;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a2, code lost:
        if (r0.equals("yeelink.light.spot1") == false) goto L_0x0063;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23531b(java.lang.Object r7) {
        /*
            r6 = this;
            android.content.Context r0 = com.yeelight.yeelib.managers.C3108x.f4951e     // Catch:{ IllegalArgumentException -> 0x00f6 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ IllegalArgumentException -> 0x00f6 }
            java.lang.String r1 = "com.android.providers.downloads"
            int r0 = r0.getApplicationEnabledSetting(r1)     // Catch:{ IllegalArgumentException -> 0x00f6 }
            r1 = 2
            if (r0 == r1) goto L_0x00f6
            r2 = 3
            if (r0 != r2) goto L_0x0014
            goto L_0x00f6
        L_0x0014:
            boolean r0 = r7 instanceof com.yeelight.yeelib.managers.C3064h.C3069d
            if (r0 == 0) goto L_0x00d0
            com.yeelight.yeelib.managers.h$d r7 = (com.yeelight.yeelib.managers.C3064h.C3069d) r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "download firmware for model: "
            r0.append(r3)
            java.lang.String r3 = r7.mo23419b()
            r0.append(r3)
            java.lang.String r0 = r7.mo23419b()
            java.util.HashMap<java.lang.Long, java.lang.Object> r3 = r6.f4949b
            java.util.Collection r3 = r3.values()
            java.util.Iterator r3 = r3.iterator()
        L_0x0039:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0054
            java.lang.Object r4 = r3.next()
            boolean r5 = r4 instanceof com.yeelight.yeelib.managers.C3064h.C3069d
            if (r5 == 0) goto L_0x0039
            com.yeelight.yeelib.managers.h$d r4 = (com.yeelight.yeelib.managers.C3064h.C3069d) r4
            java.lang.String r4 = r4.mo23419b()
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0039
            return
        L_0x0054:
            java.lang.String r0 = r7.mo23419b()
            r0.hashCode()
            r3 = -1
            int r4 = r0.hashCode()
            switch(r4) {
                case -1400275319: goto L_0x00b0;
                case -1199119278: goto L_0x00a5;
                case -443031172: goto L_0x009c;
                case 1201766335: goto L_0x0091;
                case 1201766336: goto L_0x0086;
                case 2102612488: goto L_0x007b;
                case 2102612489: goto L_0x0070;
                case 2146130361: goto L_0x0065;
                default: goto L_0x0063;
            }
        L_0x0063:
            r1 = -1
            goto L_0x00ba
        L_0x0065:
            java.lang.String r1 = "yeelink.light.dnlight2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x006e
            goto L_0x0063
        L_0x006e:
            r1 = 7
            goto L_0x00ba
        L_0x0070:
            java.lang.String r1 = "yeelink.light.meshbulb2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0079
            goto L_0x0063
        L_0x0079:
            r1 = 6
            goto L_0x00ba
        L_0x007b:
            java.lang.String r1 = "yeelink.light.meshbulb1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0084
            goto L_0x0063
        L_0x0084:
            r1 = 5
            goto L_0x00ba
        L_0x0086:
            java.lang.String r1 = "yeelink.light.ml2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x008f
            goto L_0x0063
        L_0x008f:
            r1 = 4
            goto L_0x00ba
        L_0x0091:
            java.lang.String r1 = "yeelink.light.ml1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x009a
            goto L_0x0063
        L_0x009a:
            r1 = 3
            goto L_0x00ba
        L_0x009c:
            java.lang.String r2 = "yeelink.light.spot1"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x00ba
            goto L_0x0063
        L_0x00a5:
            java.lang.String r1 = "yeelink.light.gingko"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00ae
            goto L_0x0063
        L_0x00ae:
            r1 = 1
            goto L_0x00ba
        L_0x00b0:
            java.lang.String r1 = "yeelink.light.ble1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00b9
            goto L_0x0063
        L_0x00b9:
            r1 = 0
        L_0x00ba:
            switch(r1) {
                case 0: goto L_0x00ca;
                case 1: goto L_0x00c4;
                case 2: goto L_0x00be;
                case 3: goto L_0x00be;
                case 4: goto L_0x00be;
                case 5: goto L_0x00be;
                case 6: goto L_0x00be;
                case 7: goto L_0x00be;
                default: goto L_0x00bd;
            }
        L_0x00bd:
            goto L_0x00f6
        L_0x00be:
            com.yeelight.yeelib.managers.h$f r7 = (com.yeelight.yeelib.managers.C3064h.C3071f) r7
            r6.mo23535f(r7)
            goto L_0x00f6
        L_0x00c4:
            com.yeelight.yeelib.managers.h$e r7 = (com.yeelight.yeelib.managers.C3064h.C3070e) r7
            r6.mo23533d(r7)
            goto L_0x00f6
        L_0x00ca:
            com.yeelight.yeelib.managers.h$c r7 = (com.yeelight.yeelib.managers.C3064h.C3068c) r7
            r6.mo23532c(r7)
            goto L_0x00f6
        L_0x00d0:
            boolean r0 = r7 instanceof com.yeelight.yeelib.models.C8320l
            if (r0 == 0) goto L_0x00f6
            com.yeelight.yeelib.models.l r7 = (com.yeelight.yeelib.models.C8320l) r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "download launch page: "
            r0.append(r1)
            java.lang.String r1 = r7.mo35385d()
            r0.append(r1)
            java.lang.String r1 = ", title: "
            r0.append(r1)
            java.lang.String r1 = r7.mo35390i()
            r0.append(r1)
            r6.mo23534e(r7)
        L_0x00f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.managers.C3106w.mo23531b(java.lang.Object):void");
    }

    /* renamed from: c */
    public void mo23532c(C3064h.C3068c cVar) {
        File externalFilesDir = C3108x.f4951e.getExternalFilesDir((String) null);
        if (externalFilesDir != null) {
            String str = externalFilesDir.getAbsolutePath() + "/cherry/" + cVar.mo23418a();
            StringBuilder sb = new StringBuilder();
            sb.append("Download cherry firmware, firmware storage path: ");
            sb.append(str);
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(cVar.mo23412h()));
            Uri fromFile = Uri.fromFile(new File(str + "/app1.bin"));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Download cherry firmware, app1 url: ");
            sb2.append(cVar.mo23412h());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Download cherry firmware, app1 destination uri: ");
            sb3.append(fromFile.toString());
            request.setDestinationUri(fromFile);
            if (ContextCompat.checkSelfPermission(C3108x.f4951e, "android.permission.DOWNLOAD_WITHOUT_NOTIFICATION") == 0) {
                request.setNotificationVisibility(2);
            }
            request.setVisibleInDownloadsUi(false);
            long enqueue = this.f4948a.enqueue(request);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Download request enqueued, download id: ");
            sb4.append(enqueue);
            this.f4949b.put(Long.valueOf(enqueue), cVar);
            DownloadManager.Request request2 = new DownloadManager.Request(Uri.parse(cVar.mo23415k()));
            Uri fromFile2 = Uri.fromFile(new File(str + "/app2.bin"));
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Download cherry firmware, app2 url: ");
            sb5.append(cVar.mo23415k());
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Download cherry firmware, app2 destination uri: ");
            sb6.append(fromFile2.toString());
            request2.setDestinationUri(fromFile2);
            if (ContextCompat.checkSelfPermission(C3108x.f4951e, "android.permission.DOWNLOAD_WITHOUT_NOTIFICATION") == 0) {
                request2.setNotificationVisibility(2);
            }
            request2.setVisibleInDownloadsUi(false);
            long enqueue2 = this.f4948a.enqueue(request2);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Download request enqueued, download id: ");
            sb7.append(enqueue2);
            this.f4949b.put(Long.valueOf(enqueue2), cVar);
            DownloadManager.Request request3 = new DownloadManager.Request(Uri.parse(cVar.mo23408e()));
            Uri fromFile3 = Uri.fromFile(new File(str + "/app2541.bin"));
            StringBuilder sb8 = new StringBuilder();
            sb8.append("Download cherry firmware, app2541 url: ");
            sb8.append(cVar.mo23408e());
            StringBuilder sb9 = new StringBuilder();
            sb9.append("Download cherry firmware, app2541 destination uri: ");
            sb9.append(fromFile3.toString());
            request3.setDestinationUri(fromFile3);
            if (ContextCompat.checkSelfPermission(C3108x.f4951e, "android.permission.DOWNLOAD_WITHOUT_NOTIFICATION") == 0) {
                request3.setNotificationVisibility(2);
            }
            request3.setVisibleInDownloadsUi(false);
            long enqueue3 = this.f4948a.enqueue(request3);
            StringBuilder sb10 = new StringBuilder();
            sb10.append("Download request enqueued, download id: ");
            sb10.append(enqueue3);
            this.f4949b.put(Long.valueOf(enqueue3), cVar);
        }
    }

    /* renamed from: d */
    public void mo23533d(C3064h.C3070e eVar) {
        File externalFilesDir = C3108x.f4951e.getExternalFilesDir((String) null);
        if (externalFilesDir != null) {
            String str = externalFilesDir.getAbsolutePath() + "/gingko";
            StringBuilder sb = new StringBuilder();
            sb.append("Download gingko firmware, download url: ");
            sb.append(eVar.mo23422e());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Download gingko firmware, firmware storage path: ");
            sb2.append(str);
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(eVar.mo23422e()));
            Uri fromFile = Uri.fromFile(new File(str + MiotCloudImpl.COOKIE_PATH + eVar.mo23423f() + ".bin"));
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Download ginkgo firmware, destination uri: ");
            sb3.append(fromFile.toString());
            request.setDestinationUri(fromFile);
            if (ContextCompat.checkSelfPermission(C3108x.f4951e, "android.permission.DOWNLOAD_WITHOUT_NOTIFICATION") == 0) {
                request.setNotificationVisibility(2);
            }
            request.setVisibleInDownloadsUi(false);
            long enqueue = this.f4948a.enqueue(request);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Download request enqueued, download id: ");
            sb4.append(enqueue);
            this.f4949b.put(Long.valueOf(enqueue), eVar);
        }
    }

    /* renamed from: e */
    public void mo23534e(C8320l lVar) {
        File externalFilesDir = C3108x.f4951e.getExternalFilesDir((String) null);
        if (externalFilesDir != null) {
            String str = externalFilesDir.getAbsolutePath() + "/launch/" + lVar.mo35385d();
            StringBuilder sb = new StringBuilder();
            sb.append("Download launch page, download url: ");
            sb.append(lVar.mo35386e());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Download launch page, storage path: ");
            sb2.append(str);
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(lVar.mo35386e()));
            Uri fromFile = Uri.fromFile(new File(str + MiotCloudImpl.COOKIE_PATH + "pic.png"));
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Download launch page, destination uri: ");
            sb3.append(fromFile.toString());
            request.setDestinationUri(fromFile);
            if (ContextCompat.checkSelfPermission(C3108x.f4951e, "android.permission.DOWNLOAD_WITHOUT_NOTIFICATION") == 0) {
                request.setNotificationVisibility(2);
            }
            request.setVisibleInDownloadsUi(false);
            this.f4949b.put(Long.valueOf(this.f4948a.enqueue(request)), lVar);
        }
    }

    /* renamed from: f */
    public void mo23535f(C3064h.C3071f fVar) {
        File externalFilesDir;
        if (!TextUtils.isEmpty(fVar.mo23428e()) && (externalFilesDir = C3108x.f4951e.getExternalFilesDir((String) null)) != null) {
            String str = externalFilesDir.getAbsolutePath() + MiotCloudImpl.COOKIE_PATH + mo23536h(fVar.mo23419b());
            StringBuilder sb = new StringBuilder();
            sb.append("Download ");
            sb.append(fVar.mo23419b());
            sb.append(" firmware, download url: ");
            sb.append(fVar.mo23428e());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Download ");
            sb2.append(fVar.mo23419b());
            sb2.append(" firmware, firmware storage path: ");
            sb2.append(str);
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(fVar.mo23428e()));
            Uri fromFile = Uri.fromFile(new File(str + MiotCloudImpl.COOKIE_PATH + fVar.mo23429f() + ".bin"));
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Download ");
            sb3.append(fVar.mo23419b());
            sb3.append(" firmware, destination uri: ");
            sb3.append(fromFile.toString());
            request.setDestinationUri(fromFile);
            if (ContextCompat.checkSelfPermission(C3108x.f4951e, "android.permission.DOWNLOAD_WITHOUT_NOTIFICATION") == 0) {
                request.setNotificationVisibility(2);
            }
            request.setVisibleInDownloadsUi(false);
            long enqueue = this.f4948a.enqueue(request);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Download request enqueued, download id: ");
            sb4.append(enqueue);
            this.f4949b.put(Long.valueOf(enqueue), fVar);
        }
    }

    /* renamed from: h */
    public String mo23536h(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -443031172:
                if (str.equals("yeelink.light.spot1")) {
                    c = 0;
                    break;
                }
                break;
            case 1201766335:
                if (str.equals("yeelink.light.ml1")) {
                    c = 1;
                    break;
                }
                break;
            case 1201766336:
                if (str.equals("yeelink.light.ml2")) {
                    c = 2;
                    break;
                }
                break;
            case 2102612488:
                if (str.equals("yeelink.light.meshbulb1")) {
                    c = 3;
                    break;
                }
                break;
            case 2102612489:
                if (str.equals("yeelink.light.meshbulb2")) {
                    c = 4;
                    break;
                }
                break;
            case 2146130361:
                if (str.equals("yeelink.light.dnlight2")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "spot1";
            case 1:
                return "ml1";
            case 2:
                return "ml2";
            case 3:
                return "meshbulb1";
            case 4:
                return "meshbulb2";
            case 5:
                return "downlight2";
            default:
                return "";
        }
    }

    /* renamed from: i */
    public boolean mo23537i(String str) {
        for (Object next : this.f4949b.values()) {
            if ((next instanceof C8320l) && ((C8320l) next).mo35385d().equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public void mo23538j() {
        this.f4949b.keySet().toArray(new Long[0]);
    }
}
