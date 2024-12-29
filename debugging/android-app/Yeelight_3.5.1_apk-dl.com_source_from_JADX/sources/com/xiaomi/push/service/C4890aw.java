package com.xiaomi.push.service;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4505aa;
import com.xiaomi.push.C4506ab;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.xiaomi.push.service.aw */
public class C4890aw {

    /* renamed from: a */
    private static long f9490a;

    /* renamed from: com.xiaomi.push.service.aw$a */
    public static class C4891a {

        /* renamed from: a */
        int f9491a;

        /* renamed from: a */
        byte[] f9492a;

        public C4891a(byte[] bArr, int i) {
            this.f9492a = bArr;
            this.f9491a = i;
        }
    }

    /* renamed from: com.xiaomi.push.service.aw$b */
    public static class C4892b {

        /* renamed from: a */
        public long f9493a;

        /* renamed from: a */
        public Bitmap f9494a;

        public C4892b(Bitmap bitmap, long j) {
            this.f9494a = bitmap;
            this.f9493a = j;
        }
    }

    /* renamed from: a */
    private static int m15306a(Context context, InputStream inputStream) {
        int i;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, (Rect) null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            C4408b.m12464a("decode dimension failed for bitmap.");
            return 1;
        }
        int round = Math.round((((float) context.getResources().getDisplayMetrics().densityDpi) / 160.0f) * 48.0f);
        int i2 = options.outWidth;
        if (i2 <= round || (i = options.outHeight) <= round) {
            return 1;
        }
        return Math.min(i2 / round, i / round);
    }

    /* renamed from: a */
    public static Bitmap m15307a(Context context, String str) {
        InputStream inputStream;
        InputStream inputStream2;
        int a;
        Uri parse = Uri.parse(str);
        InputStream inputStream3 = null;
        try {
            inputStream = context.getContentResolver().openInputStream(parse);
            try {
                a = m15306a(context, inputStream);
                inputStream2 = context.getContentResolver().openInputStream(parse);
            } catch (IOException e) {
                e = e;
                inputStream2 = null;
                try {
                    C4408b.m12478a((Throwable) e);
                    C4506ab.m12831a((Closeable) inputStream2);
                    C4506ab.m12831a((Closeable) inputStream);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    inputStream3 = inputStream2;
                    C4506ab.m12831a((Closeable) inputStream3);
                    C4506ab.m12831a((Closeable) inputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                C4506ab.m12831a((Closeable) inputStream3);
                C4506ab.m12831a((Closeable) inputStream);
                throw th;
            }
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = a;
                Bitmap decodeStream = BitmapFactory.decodeStream(inputStream2, (Rect) null, options);
                C4506ab.m12831a((Closeable) inputStream2);
                C4506ab.m12831a((Closeable) inputStream);
                return decodeStream;
            } catch (IOException e2) {
                e = e2;
                C4408b.m12478a((Throwable) e);
                C4506ab.m12831a((Closeable) inputStream2);
                C4506ab.m12831a((Closeable) inputStream);
                return null;
            }
        } catch (IOException e3) {
            e = e3;
            inputStream2 = null;
            inputStream = null;
            C4408b.m12478a((Throwable) e);
            C4506ab.m12831a((Closeable) inputStream2);
            C4506ab.m12831a((Closeable) inputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            C4506ab.m12831a((Closeable) inputStream3);
            C4506ab.m12831a((Closeable) inputStream);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d5, code lost:
        if (r1 == null) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d7, code lost:
        r1.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f4, code lost:
        if (r1 == null) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f7, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00dd */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ff  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:55:0x00dd=Splitter:B:55:0x00dd, B:48:0x00cf=Splitter:B:48:0x00cf} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.xiaomi.push.service.C4890aw.C4891a m15308a(java.lang.String r10, boolean r11) {
        /*
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ SocketTimeoutException -> 0x00db, IOException -> 0x00cc, all -> 0x00c9 }
            r1.<init>(r10)     // Catch:{ SocketTimeoutException -> 0x00db, IOException -> 0x00cc, all -> 0x00c9 }
            java.net.URLConnection r1 = r1.openConnection()     // Catch:{ SocketTimeoutException -> 0x00db, IOException -> 0x00cc, all -> 0x00c9 }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ SocketTimeoutException -> 0x00db, IOException -> 0x00cc, all -> 0x00c9 }
            r2 = 8000(0x1f40, float:1.121E-41)
            r1.setConnectTimeout(r2)     // Catch:{ SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c2 }
            r2 = 20000(0x4e20, float:2.8026E-41)
            r1.setReadTimeout(r2)     // Catch:{ SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c2 }
            java.lang.String r2 = "User-agent"
            java.lang.String r3 = "Mozilla/5.0 (Linux; U;) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/71.0.3578.141 Mobile Safari/537.36 XiaoMi/MiuiBrowser"
            r1.setRequestProperty(r2, r3)     // Catch:{ SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c2 }
            r1.connect()     // Catch:{ SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c2 }
            int r2 = r1.getContentLength()     // Catch:{ SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c2 }
            r3 = 102400(0x19000, float:1.43493E-40)
            if (r11 == 0) goto L_0x004e
            if (r2 <= r3) goto L_0x004e
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c2 }
            r11.<init>()     // Catch:{ SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c2 }
            java.lang.String r3 = "Bitmap size is too big, max size is 102400  contentLen size is "
            r11.append(r3)     // Catch:{ SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c2 }
            r11.append(r2)     // Catch:{ SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c2 }
            java.lang.String r2 = " from url "
            r11.append(r2)     // Catch:{ SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c2 }
            r11.append(r10)     // Catch:{ SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c2 }
            java.lang.String r11 = r11.toString()     // Catch:{ SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c2 }
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r11)     // Catch:{ SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c2 }
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r0)
            r1.disconnect()
            return r0
        L_0x004e:
            int r2 = r1.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c2 }
            r4 = 200(0xc8, float:2.8E-43)
            if (r2 == r4) goto L_0x0076
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c2 }
            r11.<init>()     // Catch:{ SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c2 }
            java.lang.String r3 = "Invalid Http Response Code "
            r11.append(r3)     // Catch:{ SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c2 }
            r11.append(r2)     // Catch:{ SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c2 }
            java.lang.String r2 = " received"
            r11.append(r2)     // Catch:{ SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c2 }
            java.lang.String r11 = r11.toString()     // Catch:{ SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c2 }
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r11)     // Catch:{ SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c2 }
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r0)
            r1.disconnect()
            return r0
        L_0x0076:
            java.io.InputStream r2 = r1.getInputStream()     // Catch:{ SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c2 }
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ SocketTimeoutException -> 0x00dd, IOException -> 0x00c0 }
            r4.<init>()     // Catch:{ SocketTimeoutException -> 0x00dd, IOException -> 0x00c0 }
            if (r11 == 0) goto L_0x0085
            r11 = 102400(0x19000, float:1.43493E-40)
            goto L_0x0088
        L_0x0085:
            r11 = 2048000(0x1f4000, float:2.869859E-39)
        L_0x0088:
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r5]     // Catch:{ SocketTimeoutException -> 0x00dd, IOException -> 0x00c0 }
        L_0x008c:
            if (r11 <= 0) goto L_0x009c
            r7 = 0
            int r8 = r2.read(r6, r7, r5)     // Catch:{ SocketTimeoutException -> 0x00dd, IOException -> 0x00c0 }
            r9 = -1
            if (r8 != r9) goto L_0x0097
            goto L_0x009c
        L_0x0097:
            int r11 = r11 - r8
            r4.write(r6, r7, r8)     // Catch:{ SocketTimeoutException -> 0x00dd, IOException -> 0x00c0 }
            goto L_0x008c
        L_0x009c:
            if (r11 > 0) goto L_0x00af
            java.lang.String r11 = "length 102400 exhausted."
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r11)     // Catch:{ SocketTimeoutException -> 0x00dd, IOException -> 0x00c0 }
            com.xiaomi.push.service.aw$a r11 = new com.xiaomi.push.service.aw$a     // Catch:{ SocketTimeoutException -> 0x00dd, IOException -> 0x00c0 }
            r11.<init>(r0, r3)     // Catch:{ SocketTimeoutException -> 0x00dd, IOException -> 0x00c0 }
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r2)
            r1.disconnect()
            return r11
        L_0x00af:
            byte[] r11 = r4.toByteArray()     // Catch:{ SocketTimeoutException -> 0x00dd, IOException -> 0x00c0 }
            com.xiaomi.push.service.aw$a r3 = new com.xiaomi.push.service.aw$a     // Catch:{ SocketTimeoutException -> 0x00dd, IOException -> 0x00c0 }
            int r4 = r11.length     // Catch:{ SocketTimeoutException -> 0x00dd, IOException -> 0x00c0 }
            r3.<init>(r11, r4)     // Catch:{ SocketTimeoutException -> 0x00dd, IOException -> 0x00c0 }
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r2)
            r1.disconnect()
            return r3
        L_0x00c0:
            r10 = move-exception
            goto L_0x00cf
        L_0x00c2:
            r10 = move-exception
            goto L_0x00fa
        L_0x00c4:
            r10 = move-exception
            r2 = r0
            goto L_0x00cf
        L_0x00c7:
            r2 = r0
            goto L_0x00dd
        L_0x00c9:
            r10 = move-exception
            r1 = r0
            goto L_0x00fa
        L_0x00cc:
            r10 = move-exception
            r1 = r0
            r2 = r1
        L_0x00cf:
            com.xiaomi.channel.commonutils.logger.C4408b.m12478a((java.lang.Throwable) r10)     // Catch:{ all -> 0x00f8 }
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r2)
            if (r1 == 0) goto L_0x00f7
        L_0x00d7:
            r1.disconnect()
            goto L_0x00f7
        L_0x00db:
            r1 = r0
            r2 = r1
        L_0x00dd:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f8 }
            r11.<init>()     // Catch:{ all -> 0x00f8 }
            java.lang.String r3 = "Connect timeout to "
            r11.append(r3)     // Catch:{ all -> 0x00f8 }
            r11.append(r10)     // Catch:{ all -> 0x00f8 }
            java.lang.String r10 = r11.toString()     // Catch:{ all -> 0x00f8 }
            com.xiaomi.channel.commonutils.logger.C4408b.m12483d(r10)     // Catch:{ all -> 0x00f8 }
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r2)
            if (r1 == 0) goto L_0x00f7
            goto L_0x00d7
        L_0x00f7:
            return r0
        L_0x00f8:
            r10 = move-exception
            r0 = r2
        L_0x00fa:
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r0)
            if (r1 == 0) goto L_0x0102
            r1.disconnect()
        L_0x0102:
            goto L_0x0104
        L_0x0103:
            throw r10
        L_0x0104:
            goto L_0x0103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4890aw.m15308a(java.lang.String, boolean):com.xiaomi.push.service.aw$a");
    }

    /* renamed from: a */
    public static C4892b m15309a(Context context, String str, boolean z) {
        ByteArrayInputStream byteArrayInputStream = null;
        C4892b bVar = new C4892b((Bitmap) null, 0);
        Bitmap b = m15312b(context, str);
        if (b != null) {
            bVar.f9494a = b;
            return bVar;
        }
        try {
            C4891a a = m15308a(str, z);
            if (a == null) {
                C4506ab.m12831a((Closeable) null);
                return bVar;
            }
            bVar.f9493a = (long) a.f9491a;
            byte[] bArr = a.f9492a;
            if (bArr != null) {
                if (z) {
                    ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr);
                    try {
                        int a2 = m15306a(context, (InputStream) byteArrayInputStream2);
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inSampleSize = a2;
                        bVar.f9494a = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                        byteArrayInputStream = byteArrayInputStream2;
                    } catch (Exception e) {
                        e = e;
                        byteArrayInputStream = byteArrayInputStream2;
                        try {
                            C4408b.m12478a((Throwable) e);
                            C4506ab.m12831a((Closeable) byteArrayInputStream);
                            return bVar;
                        } catch (Throwable th) {
                            th = th;
                            C4506ab.m12831a((Closeable) byteArrayInputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        byteArrayInputStream = byteArrayInputStream2;
                        C4506ab.m12831a((Closeable) byteArrayInputStream);
                        throw th;
                    }
                } else {
                    bVar.f9494a = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                }
            }
            m15311a(context, a.f9492a, str);
            C4506ab.m12831a((Closeable) byteArrayInputStream);
            return bVar;
        } catch (Exception e2) {
            e = e2;
            C4408b.m12478a((Throwable) e);
            C4506ab.m12831a((Closeable) byteArrayInputStream);
            return bVar;
        }
    }

    /* renamed from: a */
    private static void m15310a(Context context) {
        File file = new File(context.getCacheDir().getPath() + File.separator + "mipush_icon");
        if (file.exists()) {
            if (f9490a == 0) {
                f9490a = C4505aa.m12829a(file);
            }
            if (f9490a > 15728640) {
                try {
                    File[] listFiles = file.listFiles();
                    for (int i = 0; i < listFiles.length; i++) {
                        if (!listFiles[i].isDirectory() && Math.abs(System.currentTimeMillis() - listFiles[i].lastModified()) > 1209600) {
                            listFiles[i].delete();
                        }
                    }
                } catch (Exception e) {
                    C4408b.m12478a((Throwable) e);
                }
                f9490a = 0;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m15311a(android.content.Context r5, byte[] r6, java.lang.String r7) {
        /*
            if (r6 != 0) goto L_0x0008
            java.lang.String r5 = "cannot save small icon cause bitmap is null"
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r5)
            return
        L_0x0008:
            m15310a(r5)
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.io.File r2 = r5.getCacheDir()
            java.lang.String r2 = r2.getPath()
            r1.append(r2)
            java.lang.String r2 = java.io.File.separator
            r1.append(r2)
            java.lang.String r2 = "mipush_icon"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x0037
            r0.mkdirs()
        L_0x0037:
            java.io.File r1 = new java.io.File
            java.lang.String r7 = com.xiaomi.push.C4561bp.m13042a((java.lang.String) r7)
            r1.<init>(r0, r7)
            r7 = 0
            boolean r0 = r1.exists()     // Catch:{ Exception -> 0x0069, all -> 0x0066 }
            if (r0 != 0) goto L_0x004a
            r1.createNewFile()     // Catch:{ Exception -> 0x0069, all -> 0x0066 }
        L_0x004a:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0069, all -> 0x0066 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0069, all -> 0x0066 }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x0064 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0064 }
            r3.write(r6)     // Catch:{ Exception -> 0x0061, all -> 0x005e }
            r3.flush()     // Catch:{ Exception -> 0x0061, all -> 0x005e }
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r3)
            goto L_0x0071
        L_0x005e:
            r5 = move-exception
            r7 = r3
            goto L_0x00aa
        L_0x0061:
            r6 = move-exception
            r7 = r3
            goto L_0x006b
        L_0x0064:
            r6 = move-exception
            goto L_0x006b
        L_0x0066:
            r5 = move-exception
            r0 = r7
            goto L_0x00aa
        L_0x0069:
            r6 = move-exception
            r0 = r7
        L_0x006b:
            com.xiaomi.channel.commonutils.logger.C4408b.m12478a((java.lang.Throwable) r6)     // Catch:{ all -> 0x00a9 }
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r7)
        L_0x0071:
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r0)
            long r6 = f9490a
            r3 = 0
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00a8
            java.io.File r6 = new java.io.File
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.io.File r5 = r5.getCacheDir()
            java.lang.String r5 = r5.getPath()
            r7.append(r5)
            java.lang.String r5 = java.io.File.separator
            r7.append(r5)
            r7.append(r2)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            long r5 = com.xiaomi.push.C4505aa.m12829a(r6)
            long r0 = r1.length()
            long r5 = r5 + r0
            f9490a = r5
        L_0x00a8:
            return
        L_0x00a9:
            r5 = move-exception
        L_0x00aa:
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r7)
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4890aw.m15311a(android.content.Context, byte[], java.lang.String):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.io.FileInputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m15312b(android.content.Context r4, java.lang.String r5) {
        /*
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.io.File r4 = r4.getCacheDir()
            java.lang.String r4 = r4.getPath()
            r1.append(r4)
            java.lang.String r4 = java.io.File.separator
            r1.append(r4)
            java.lang.String r4 = "mipush_icon"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r5 = com.xiaomi.push.C4561bp.m13042a((java.lang.String) r5)
            r0.<init>(r4, r5)
            boolean r4 = r0.exists()
            r5 = 0
            if (r4 != 0) goto L_0x002f
            return r5
        L_0x002f:
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x004f }
            r4.<init>(r0)     // Catch:{ Exception -> 0x004f }
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r4)     // Catch:{ Exception -> 0x0045, all -> 0x0043 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0045, all -> 0x0043 }
            r0.setLastModified(r1)     // Catch:{ Exception -> 0x0045, all -> 0x0043 }
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r4)
            goto L_0x0058
        L_0x0043:
            r5 = move-exception
            goto L_0x0059
        L_0x0045:
            r0 = move-exception
            r3 = r5
            r5 = r4
            r4 = r3
            goto L_0x0051
        L_0x004a:
            r4 = move-exception
            r3 = r5
            r5 = r4
            r4 = r3
            goto L_0x0059
        L_0x004f:
            r0 = move-exception
            r4 = r5
        L_0x0051:
            com.xiaomi.channel.commonutils.logger.C4408b.m12478a((java.lang.Throwable) r0)     // Catch:{ all -> 0x004a }
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r5)
            r5 = r4
        L_0x0058:
            return r5
        L_0x0059:
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4890aw.m15312b(android.content.Context, java.lang.String):android.graphics.Bitmap");
    }
}
