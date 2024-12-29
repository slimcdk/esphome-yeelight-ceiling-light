package com.xiaomi.push;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.xiaomi.push.service.C4898ba;
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

/* renamed from: com.xiaomi.push.cj */
public class C4583cj {

    /* renamed from: a */
    private static volatile C4583cj f7700a;

    /* renamed from: a */
    private Context f7701a;

    /* renamed from: a */
    private C4582ci f7702a;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ArrayList<C4584a> f7703a = new ArrayList<>();

    /* renamed from: a */
    private final HashMap<String, C4581ch> f7704a = new HashMap<>();

    /* renamed from: a */
    private ThreadPoolExecutor f7705a = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: com.xiaomi.push.cj$a */
    public static abstract class C4584a implements Runnable {

        /* renamed from: a */
        private int f7706a = 0;

        /* renamed from: a */
        protected C4581ch f7707a = null;

        /* renamed from: a */
        private C4584a f7708a;

        /* renamed from: a */
        private String f7709a;

        /* renamed from: a */
        private WeakReference<Context> f7710a;

        /* renamed from: a */
        private Random f7711a = new Random();

        /* renamed from: b */
        protected String f7712b;

        public C4584a(String str) {
            this.f7709a = str;
        }

        /* renamed from: a */
        public SQLiteDatabase mo28828a() {
            return this.f7707a.getWritableDatabase();
        }

        /* renamed from: a */
        public Object m13163a() {
            return null;
        }

        /* renamed from: a */
        public String m13164a() {
            return this.f7709a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo28837a(Context context) {
            C4584a aVar = this.f7708a;
            if (aVar != null) {
                aVar.mo28826a(context, mo28828a());
            }
            mo28841b(context);
        }

        /* renamed from: a */
        public abstract void mo28838a(Context context, SQLiteDatabase sQLiteDatabase);

        /* renamed from: a */
        public void mo28826a(Context context, Object obj) {
            C4583cj.m13154a(context).mo28833a(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo28839a(C4581ch chVar, Context context) {
            this.f7707a = chVar;
            this.f7712b = chVar.mo28830a();
            this.f7710a = new WeakReference<>(context);
        }

        /* renamed from: a */
        public void mo28840a(C4584a aVar) {
            this.f7708a = aVar;
        }

        /* renamed from: a */
        public boolean m13170a() {
            return this.f7707a == null || TextUtils.isEmpty(this.f7712b) || this.f7710a == null;
        }

        /* renamed from: b */
        public void mo28841b(Context context) {
        }

        public final void run() {
            Context context;
            WeakReference<Context> weakReference = this.f7710a;
            if (weakReference != null && (context = (Context) weakReference.get()) != null && context.getFilesDir() != null && this.f7707a != null && !TextUtils.isEmpty(this.f7709a)) {
                File file = new File(this.f7709a);
                C4998y.m15752a(context, new File(file.getParentFile(), C4560bo.m13040b(file.getAbsolutePath())), new C4590cl(this, context));
            }
        }
    }

    /* renamed from: com.xiaomi.push.cj$b */
    public static abstract class C4585b<T> extends C4584a {

        /* renamed from: a */
        private int f7713a;

        /* renamed from: a */
        private String f7714a;

        /* renamed from: a */
        private List<String> f7715a;

        /* renamed from: a */
        private String[] f7716a;

        /* renamed from: b */
        private List<T> f7717b = new ArrayList();

        /* renamed from: c */
        private String f7718c;

        /* renamed from: d */
        private String f7719d;

        /* renamed from: e */
        private String f7720e;

        public C4585b(String str, List<String> list, String str2, String[] strArr, String str3, String str4, String str5, int i) {
            super(str);
            this.f7715a = list;
            this.f7714a = str2;
            this.f7716a = strArr;
            this.f7718c = str3;
            this.f7719d = str4;
            this.f7720e = str5;
            this.f7713a = i;
        }

        /* renamed from: a */
        public SQLiteDatabase mo28828a() {
            return this.f7707a.getReadableDatabase();
        }

        /* renamed from: a */
        public abstract T mo28827a(Context context, Cursor cursor);

        /* renamed from: a */
        public void mo28838a(Context context, SQLiteDatabase sQLiteDatabase) {
            String[] strArr;
            this.f7717b.clear();
            List<String> list = this.f7715a;
            String str = null;
            if (list == null || list.size() <= 0) {
                strArr = null;
            } else {
                String[] strArr2 = new String[this.f7715a.size()];
                this.f7715a.toArray(strArr2);
                strArr = strArr2;
            }
            int i = this.f7713a;
            if (i > 0) {
                str = String.valueOf(i);
            }
            Cursor query = sQLiteDatabase.query(this.f7712b, strArr, this.f7714a, this.f7716a, this.f7718c, this.f7719d, this.f7720e, str);
            if (query != null && query.moveToFirst()) {
                do {
                    Object a = mo28827a(context, query);
                    if (a != null) {
                        this.f7717b.add(a);
                    }
                } while (query.moveToNext());
                query.close();
            }
            mo28829a(context, this.f7717b);
        }

        /* renamed from: a */
        public abstract void mo28829a(Context context, List<T> list);
    }

    /* renamed from: com.xiaomi.push.cj$c */
    public static class C4586c extends C4584a {

        /* renamed from: a */
        private ArrayList<C4584a> f7721a;

        public C4586c(String str, ArrayList<C4584a> arrayList) {
            super(str);
            ArrayList<C4584a> arrayList2 = new ArrayList<>();
            this.f7721a = arrayList2;
            arrayList2.addAll(arrayList);
        }

        /* renamed from: a */
        public final void mo28837a(Context context) {
            super.mo28837a(context);
            Iterator<C4584a> it = this.f7721a.iterator();
            while (it.hasNext()) {
                C4584a next = it.next();
                if (next != null) {
                    next.mo28837a(context);
                }
            }
        }

        /* renamed from: a */
        public void mo28838a(Context context, SQLiteDatabase sQLiteDatabase) {
            Iterator<C4584a> it = this.f7721a.iterator();
            while (it.hasNext()) {
                C4584a next = it.next();
                if (next != null) {
                    next.mo28838a(context, sQLiteDatabase);
                }
            }
        }
    }

    /* renamed from: com.xiaomi.push.cj$d */
    public static class C4587d extends C4584a {

        /* renamed from: a */
        private String f7722a;

        /* renamed from: a */
        protected String[] f7723a;

        public C4587d(String str, String str2, String[] strArr) {
            super(str);
            this.f7722a = str2;
            this.f7723a = strArr;
        }

        /* renamed from: a */
        public void mo28838a(Context context, SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.delete(this.f7712b, this.f7722a, this.f7723a);
        }
    }

    /* renamed from: com.xiaomi.push.cj$e */
    public static class C4588e extends C4584a {

        /* renamed from: a */
        private ContentValues f7724a;

        public C4588e(String str, ContentValues contentValues) {
            super(str);
            this.f7724a = contentValues;
        }

        /* renamed from: a */
        public void mo28838a(Context context, SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.insert(this.f7712b, (String) null, this.f7724a);
        }
    }

    private C4583cj(Context context) {
        this.f7701a = context;
    }

    /* renamed from: a */
    private C4581ch mo28832a(String str) {
        C4581ch chVar = this.f7704a.get(str);
        if (chVar == null) {
            synchronized (this.f7704a) {
                if (chVar == null) {
                    chVar = this.f7702a.mo28831a(this.f7701a, str);
                    this.f7704a.put(str, chVar);
                }
            }
        }
        return chVar;
    }

    /* renamed from: a */
    public static C4583cj m13154a(Context context) {
        if (f7700a == null) {
            synchronized (C4583cj.class) {
                if (f7700a == null) {
                    f7700a = new C4583cj(context);
                }
            }
        }
        return f7700a;
    }

    /* renamed from: a */
    private void m13156a() {
        C4516al.m12857a(this.f7701a).mo28740b(new C4589ck(this), C4898ba.m15362a(this.f7701a).mo29988a(C4765ho.StatDataProcessFrequency.mo29322a(), 5));
    }

    /* renamed from: a */
    public String m13157a(String str) {
        return mo28832a(str).mo28830a();
    }

    /* renamed from: a */
    public void mo28833a(C4584a aVar) {
        C4581ch chVar;
        if (aVar != null) {
            if (this.f7702a != null) {
                String a = aVar.mo28828a();
                synchronized (this.f7704a) {
                    chVar = this.f7704a.get(a);
                    if (chVar == null) {
                        chVar = this.f7702a.mo28831a(this.f7701a, a);
                        this.f7704a.put(a, chVar);
                    }
                }
                if (!this.f7705a.isShutdown()) {
                    aVar.mo28839a(chVar, this.f7701a);
                    synchronized (this.f7703a) {
                        this.f7703a.add(aVar);
                        m13156a();
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("should exec init method first!");
        }
    }

    /* renamed from: a */
    public void mo28834a(Runnable runnable) {
        if (!this.f7705a.isShutdown()) {
            this.f7705a.execute(runnable);
        }
    }

    /* renamed from: a */
    public void mo28835a(ArrayList<C4584a> arrayList) {
        if (this.f7702a != null) {
            HashMap hashMap = new HashMap();
            if (!this.f7705a.isShutdown()) {
                Iterator<C4584a> it = arrayList.iterator();
                while (it.hasNext()) {
                    C4584a next = it.next();
                    if (next.mo28828a()) {
                        next.mo28839a(mo28832a(next.mo28828a()), this.f7701a);
                    }
                    ArrayList arrayList2 = (ArrayList) hashMap.get(next.mo28828a());
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        hashMap.put(next.mo28828a(), arrayList2);
                    }
                    arrayList2.add(next);
                }
                for (String str : hashMap.keySet()) {
                    ArrayList arrayList3 = (ArrayList) hashMap.get(str);
                    if (arrayList3 != null && arrayList3.size() > 0) {
                        C4586c cVar = new C4586c(str, arrayList3);
                        cVar.mo28839a(((C4584a) arrayList3.get(0)).f7707a, this.f7701a);
                        this.f7705a.execute(cVar);
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("should exec setDbHelperFactory method first!");
    }

    /* renamed from: b */
    public void mo28836b(C4584a aVar) {
        C4581ch chVar;
        if (aVar != null) {
            if (this.f7702a != null) {
                String a = aVar.mo28828a();
                synchronized (this.f7704a) {
                    chVar = this.f7704a.get(a);
                    if (chVar == null) {
                        chVar = this.f7702a.mo28831a(this.f7701a, a);
                        this.f7704a.put(a, chVar);
                    }
                }
                if (!this.f7705a.isShutdown()) {
                    aVar.mo28839a(chVar, this.f7701a);
                    mo28834a((Runnable) aVar);
                    return;
                }
                return;
            }
            throw new IllegalStateException("should exec init method first!");
        }
    }
}
