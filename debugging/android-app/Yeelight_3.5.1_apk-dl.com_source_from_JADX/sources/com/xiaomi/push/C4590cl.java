package com.xiaomi.push;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4583cj;

/* renamed from: com.xiaomi.push.cl */
class C4590cl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f7726a;

    /* renamed from: a */
    final /* synthetic */ C4583cj.C4584a f7727a;

    C4590cl(C4583cj.C4584a aVar, Context context) {
        this.f7727a = aVar;
        this.f7726a = context;
    }

    public void run() {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase a = this.f7727a.mo28828a();
            if (a != null && a.isOpen()) {
                a.beginTransaction();
                this.f7727a.mo28838a(this.f7726a, a);
                a.setTransactionSuccessful();
            }
            if (a != null) {
                try {
                    a.endTransaction();
                } catch (Exception e) {
                    e = e;
                    C4408b.m12478a((Throwable) e);
                    this.f7727a.mo28837a(this.f7726a);
                }
            }
            C4581ch chVar = this.f7727a.f7707a;
            if (chVar != null) {
                chVar.close();
            }
        } catch (Exception e2) {
            C4408b.m12478a((Throwable) e2);
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Exception e3) {
                    e = e3;
                    C4408b.m12478a((Throwable) e);
                    this.f7727a.mo28837a(this.f7726a);
                }
            }
            C4581ch chVar2 = this.f7727a.f7707a;
            if (chVar2 != null) {
                chVar2.close();
            }
        } catch (Throwable th) {
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Exception e4) {
                    C4408b.m12478a((Throwable) e4);
                    this.f7727a.mo28837a(this.f7726a);
                    throw th;
                }
            }
            C4581ch chVar3 = this.f7727a.f7707a;
            if (chVar3 != null) {
                chVar3.close();
            }
            this.f7727a.mo28837a(this.f7726a);
            throw th;
        }
        this.f7727a.mo28837a(this.f7726a);
    }
}
