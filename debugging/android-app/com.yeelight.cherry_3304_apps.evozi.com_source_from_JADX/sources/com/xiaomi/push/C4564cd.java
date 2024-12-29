package com.xiaomi.push;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4557cb;

/* renamed from: com.xiaomi.push.cd */
class C4564cd implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f8295a;

    /* renamed from: a */
    final /* synthetic */ C4557cb.C4558a f8296a;

    C4564cd(C4557cb.C4558a aVar, Context context) {
        this.f8296a = aVar;
        this.f8295a = context;
    }

    public void run() {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase a = this.f8296a.mo24795a();
            if (a != null && a.isOpen()) {
                a.beginTransaction();
                this.f8296a.mo24830a(this.f8295a, a);
                a.setTransactionSuccessful();
            }
            if (a != null) {
                try {
                    a.endTransaction();
                } catch (Exception e) {
                    e = e;
                    C3989b.m10678a((Throwable) e);
                    this.f8296a.mo24829a(this.f8295a);
                }
            }
            if (this.f8296a.f8276a != null) {
                this.f8296a.f8276a.close();
            }
        } catch (Exception e2) {
            C3989b.m10678a((Throwable) e2);
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Exception e3) {
                    e = e3;
                    C3989b.m10678a((Throwable) e);
                    this.f8296a.mo24829a(this.f8295a);
                }
            }
            if (this.f8296a.f8276a != null) {
                this.f8296a.f8276a.close();
            }
        } catch (Throwable th) {
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Exception e4) {
                    C3989b.m10678a((Throwable) e4);
                    this.f8296a.mo24829a(this.f8295a);
                    throw th;
                }
            }
            if (this.f8296a.f8276a != null) {
                this.f8296a.f8276a.close();
            }
            this.f8296a.mo24829a(this.f8295a);
            throw th;
        }
        this.f8296a.mo24829a(this.f8295a);
    }
}
