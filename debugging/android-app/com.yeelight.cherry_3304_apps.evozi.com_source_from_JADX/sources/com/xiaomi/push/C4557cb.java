package com.xiaomi.push;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.xiaomi.push.service.C4854ak;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.xiaomi.push.cb */
public class C4557cb {

    /* renamed from: a */
    private static volatile C4557cb f8269a;

    /* renamed from: a */
    private Context f8270a;

    /* renamed from: a */
    private C4556ca f8271a;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ArrayList<C4558a> f8272a = new ArrayList<>();

    /* renamed from: a */
    private final HashMap<String, C4553bz> f8273a = new HashMap<>();

    /* renamed from: a */
    private ThreadPoolExecutor f8274a = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: com.xiaomi.push.cb$a */
    public static abstract class C4558a implements Runnable {

        /* renamed from: a */
        private int f8275a = 0;

        /* renamed from: a */
        protected C4553bz f8276a = null;

        /* renamed from: a */
        private C4558a f8277a;

        /* renamed from: a */
        private String f8278a;

        /* renamed from: a */
        private WeakReference<Context> f8279a;

        /* renamed from: a */
        private Random f8280a = new Random();

        /* renamed from: b */
        protected String f8281b;

        public C4558a(String str) {
            this.f8278a = str;
        }

        /* renamed from: a */
        public SQLiteDatabase mo24795a() {
            return this.f8276a.getWritableDatabase();
        }

        /* renamed from: a */
        public Object m13561a() {
            return null;
        }

        /* renamed from: a */
        public String m13562a() {
            return this.f8278a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo24829a(Context context) {
            C4558a aVar = this.f8277a;
            if (aVar != null) {
                aVar.mo24793a(context, mo24795a());
            }
            mo24833b(context);
        }

        /* renamed from: a */
        public abstract void mo24830a(Context context, SQLiteDatabase sQLiteDatabase);

        /* renamed from: a */
        public void mo24793a(Context context, Object obj) {
            C4557cb.m13552a(context).mo24825a(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo24831a(C4553bz bzVar, Context context) {
            this.f8276a = bzVar;
            this.f8281b = bzVar.mo24797a();
            this.f8279a = new WeakReference<>(context);
        }

        /* renamed from: a */
        public void mo24832a(C4558a aVar) {
            this.f8277a = aVar;
        }

        /* renamed from: a */
        public boolean m13568a() {
            return this.f8276a == null || TextUtils.isEmpty(this.f8281b) || this.f8279a == null;
        }

        /* renamed from: b */
        public void mo24833b(Context context) {
        }

        public final void run() {
            Context context;
            WeakReference<Context> weakReference = this.f8279a;
            if (weakReference != null && (context = (Context) weakReference.get()) != null && context.getFilesDir() != null && this.f8276a != null && !TextUtils.isEmpty(this.f8278a)) {
                File file = new File(this.f8278a);
                C4939v.m15879a(context, new File(file.getParentFile(), C4531be.m13429b(file.getAbsolutePath())), new C4564cd(this, context));
            }
        }
    }

    /* renamed from: com.xiaomi.push.cb$b */
    public static abstract class C4559b<T> extends C4558a {

        /* renamed from: a */
        private int f8282a;

        /* renamed from: a */
        private String f8283a;

        /* renamed from: a */
        private List<String> f8284a;

        /* renamed from: a */
        private String[] f8285a;

        /* renamed from: b */
        private List<T> f8286b = new ArrayList();

        /* renamed from: c */
        private String f8287c;

        /* renamed from: d */
        private String f8288d;

        /* renamed from: e */
        private String f8289e;

        public C4559b(String str, List<String> list, String str2, String[] strArr, String str3, String str4, String str5, int i) {
            super(str);
            this.f8284a = list;
            this.f8283a = str2;
            this.f8285a = strArr;
            this.f8287c = str3;
            this.f8288d = str4;
            this.f8289e = str5;
            this.f8282a = i;
        }

        /* renamed from: a */
        public SQLiteDatabase mo24795a() {
            return this.f8276a.getReadableDatabase();
        }

        /* renamed from: a */
        public abstract T mo24794a(Context context, Cursor cursor);

        /* renamed from: a */
        public void mo24830a(Context context, SQLiteDatabase sQLiteDatabase) {
            String[] strArr;
            this.f8286b.clear();
            List<String> list = this.f8284a;
            String str = null;
            if (list == null || list.size() <= 0) {
                strArr = null;
            } else {
                String[] strArr2 = new String[this.f8284a.size()];
                this.f8284a.toArray(strArr2);
                strArr = strArr2;
            }
            int i = this.f8282a;
            if (i > 0) {
                str = String.valueOf(i);
            }
            Cursor query = sQLiteDatabase.query(this.f8281b, strArr, this.f8283a, this.f8285a, this.f8287c, this.f8288d, this.f8289e, str);
            if (query != null && query.moveToFirst()) {
                do {
                    Object a = mo24794a(context, query);
                    if (a != null) {
                        this.f8286b.add(a);
                    }
                } while (query.moveToNext());
                query.close();
            }
            mo24796a(context, this.f8286b);
        }

        /* renamed from: a */
        public abstract void mo24796a(Context context, List<T> list);
    }

    /* renamed from: com.xiaomi.push.cb$c */
    public static class C4560c extends C4558a {

        /* renamed from: a */
        private ArrayList<C4558a> f8290a;

        public C4560c(String str, ArrayList<C4558a> arrayList) {
            super(str);
            ArrayList<C4558a> arrayList2 = new ArrayList<>();
            this.f8290a = arrayList2;
            arrayList2.addAll(arrayList);
        }

        /* renamed from: a */
        public final void mo24829a(Context context) {
            super.mo24829a(context);
            Iterator<C4558a> it = this.f8290a.iterator();
            while (it.hasNext()) {
                C4558a next = it.next();
                if (next != null) {
                    next.mo24829a(context);
                }
            }
        }

        /* renamed from: a */
        public void mo24830a(Context context, SQLiteDatabase sQLiteDatabase) {
            Iterator<C4558a> it = this.f8290a.iterator();
            while (it.hasNext()) {
                C4558a next = it.next();
                if (next != null) {
                    next.mo24830a(context, sQLiteDatabase);
                }
            }
        }
    }

    /* renamed from: com.xiaomi.push.cb$d */
    public static class C4561d extends C4558a {

        /* renamed from: a */
        private String f8291a;

        /* renamed from: a */
        protected String[] f8292a;

        public C4561d(String str, String str2, String[] strArr) {
            super(str);
            this.f8291a = str2;
            this.f8292a = strArr;
        }

        /* renamed from: a */
        public void mo24830a(Context context, SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.delete(this.f8281b, this.f8291a, this.f8292a);
        }
    }

    /* renamed from: com.xiaomi.push.cb$e */
    public static class C4562e extends C4558a {

        /* renamed from: a */
        private ContentValues f8293a;

        public C4562e(String str, ContentValues contentValues) {
            super(str);
            this.f8293a = contentValues;
        }

        /* renamed from: a */
        public void mo24830a(Context context, SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.insert(this.f8281b, (String) null, this.f8293a);
        }
    }

    private C4557cb(Context context) {
        this.f8270a = context;
    }

    /* renamed from: a */
    private C4553bz mo24824a(String str) {
        C4553bz bzVar = this.f8273a.get(str);
        if (bzVar == null) {
            synchronized (this.f8273a) {
                if (bzVar == null) {
                    bzVar = this.f8271a.mo24823a(this.f8270a, str);
                    this.f8273a.put(str, bzVar);
                }
            }
        }
        return bzVar;
    }

    /* renamed from: a */
    public static C4557cb m13552a(Context context) {
        if (f8269a == null) {
            synchronized (C4557cb.class) {
                if (f8269a == null) {
                    f8269a = new C4557cb(context);
                }
            }
        }
        return f8269a;
    }

    /* renamed from: a */
    private void m13554a() {
        C4498ai.m13271a(this.f8270a).mo24731b(new C4563cc(this), C4854ak.m15568a(this.f8270a).mo25906a(C4744hr.StatDataProcessFrequency.mo25291a(), 5));
    }

    /* renamed from: a */
    public String m13555a(String str) {
        return mo24824a(str).mo24797a();
    }

    /* renamed from: a */
    public void mo24825a(C4558a aVar) {
        C4553bz bzVar;
        if (aVar != null) {
            if (this.f8271a != null) {
                String a = aVar.mo24795a();
                synchronized (this.f8273a) {
                    bzVar = this.f8273a.get(a);
                    if (bzVar == null) {
                        bzVar = this.f8271a.mo24823a(this.f8270a, a);
                        this.f8273a.put(a, bzVar);
                    }
                }
                if (!this.f8274a.isShutdown()) {
                    aVar.mo24831a(bzVar, this.f8270a);
                    synchronized (this.f8272a) {
                        this.f8272a.add(aVar);
                        m13554a();
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("should exec init method first!");
        }
    }

    /* renamed from: a */
    public void mo24826a(Runnable runnable) {
        if (!this.f8274a.isShutdown()) {
            this.f8274a.execute(runnable);
        }
    }

    /* renamed from: a */
    public void mo24827a(ArrayList<C4558a> arrayList) {
        if (this.f8271a != null) {
            HashMap hashMap = new HashMap();
            if (!this.f8274a.isShutdown()) {
                Iterator<C4558a> it = arrayList.iterator();
                while (it.hasNext()) {
                    C4558a next = it.next();
                    if (next.mo24795a()) {
                        next.mo24831a(mo24824a(next.mo24795a()), this.f8270a);
                    }
                    ArrayList arrayList2 = (ArrayList) hashMap.get(next.mo24795a());
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        hashMap.put(next.mo24795a(), arrayList2);
                    }
                    arrayList2.add(next);
                }
                for (String str : hashMap.keySet()) {
                    ArrayList arrayList3 = (ArrayList) hashMap.get(str);
                    if (arrayList3 != null && arrayList3.size() > 0) {
                        C4560c cVar = new C4560c(str, arrayList3);
                        cVar.mo24831a(((C4558a) arrayList3.get(0)).f8276a, this.f8270a);
                        this.f8274a.execute(cVar);
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("should exec setDbHelperFactory method first!");
    }

    /* renamed from: b */
    public void mo24828b(C4558a aVar) {
        C4553bz bzVar;
        if (aVar != null) {
            if (this.f8271a != null) {
                String a = aVar.mo24795a();
                synchronized (this.f8273a) {
                    bzVar = this.f8273a.get(a);
                    if (bzVar == null) {
                        bzVar = this.f8271a.mo24823a(this.f8270a, a);
                        this.f8273a.put(a, bzVar);
                    }
                }
                if (!this.f8274a.isShutdown()) {
                    aVar.mo24831a(bzVar, this.f8270a);
                    mo24826a((Runnable) aVar);
                    return;
                }
                return;
            }
            throw new IllegalStateException("should exec init method first!");
        }
    }
}
