package com.google.firebase.crashlytics.p110c.p112g;

import android.os.Looper;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p011c.p012a.p019b.p028b.p038e.C0608a;
import p011c.p012a.p019b.p028b.p038e.C0619h;
import p011c.p012a.p019b.p028b.p038e.C0620i;

/* renamed from: com.google.firebase.crashlytics.c.g.h0 */
public final class C2887h0 {

    /* renamed from: a */
    private static final FilenameFilter f5572a = new C2888a();

    /* renamed from: b */
    private static final ExecutorService f5573b = C2950t.m9046c("awaitEvenIfOnMainThread task continuation executor");

    /* renamed from: com.google.firebase.crashlytics.c.g.h0$a */
    class C2888a implements FilenameFilter {
        C2888a() {
        }

        public boolean accept(File file, String str) {
            return true;
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.h0$b */
    class C2889b implements C0608a<T, Void> {

        /* renamed from: a */
        final /* synthetic */ C0620i f5574a;

        C2889b(C0620i iVar) {
            this.f5574a = iVar;
        }

        /* renamed from: b */
        public Void mo8634a(@NonNull C0619h<T> hVar) {
            if (hVar.mo8654o()) {
                this.f5574a.mo8670e(hVar.mo8650k());
                return null;
            }
            this.f5574a.mo8669d(hVar.mo8649j());
            return null;
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.h0$c */
    class C2890c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Callable f5575a;

        /* renamed from: b */
        final /* synthetic */ C0620i f5576b;

        /* renamed from: com.google.firebase.crashlytics.c.g.h0$c$a */
        class C2891a implements C0608a<T, Void> {
            C2891a() {
            }

            /* renamed from: b */
            public Void mo8634a(@NonNull C0619h<T> hVar) {
                if (hVar.mo8654o()) {
                    C2890c.this.f5576b.mo8668c(hVar.mo8650k());
                    return null;
                }
                C2890c.this.f5576b.mo8667b(hVar.mo8649j());
                return null;
            }
        }

        C2890c(Callable callable, C0620i iVar) {
            this.f5575a = callable;
            this.f5576b = iVar;
        }

        public void run() {
            try {
                ((C0619h) this.f5575a.call()).mo8646g(new C2891a());
            } catch (Exception e) {
                this.f5576b.mo8667b(e);
            }
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.h0$d */
    class C2892d implements C0608a<T, Object> {

        /* renamed from: a */
        final /* synthetic */ CountDownLatch f5578a;

        C2892d(CountDownLatch countDownLatch) {
            this.f5578a = countDownLatch;
        }

        /* renamed from: a */
        public Object mo8634a(@NonNull C0619h<T> hVar) {
            this.f5578a.countDown();
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m8832a(C0619h<T> hVar) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        hVar.mo8647h(f5573b, new C2892d(countDownLatch));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(4, TimeUnit.SECONDS);
        } else {
            countDownLatch.await();
        }
        if (hVar.mo8653n()) {
            return hVar.mo8650k();
        }
        throw new TimeoutException();
    }

    /* renamed from: b */
    public static <T> C0619h<T> m8833b(Executor executor, Callable<C0619h<T>> callable) {
        C0620i iVar = new C0620i();
        executor.execute(new C2890c(callable, iVar));
        return iVar.mo8666a();
    }

    /* renamed from: c */
    static int m8834c(File file, int i, Comparator<File> comparator) {
        return m8835d(file, f5572a, i, comparator);
    }

    /* renamed from: d */
    static int m8835d(File file, FilenameFilter filenameFilter, int i, Comparator<File> comparator) {
        File[] listFiles = file.listFiles(filenameFilter);
        if (listFiles == null) {
            return 0;
        }
        return m8836e(Arrays.asList(listFiles), i, comparator);
    }

    /* renamed from: e */
    static int m8836e(List<File> list, int i, Comparator<File> comparator) {
        int size = list.size();
        Collections.sort(list, comparator);
        for (File next : list) {
            if (size <= i) {
                return size;
            }
            m8839h(next);
            size--;
        }
        return size;
    }

    /* renamed from: f */
    static int m8837f(File file, File file2, int i, Comparator<File> comparator) {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file.listFiles();
        File[] listFiles2 = file2.listFiles(f5572a);
        if (listFiles == null) {
            listFiles = new File[0];
        }
        if (listFiles2 == null) {
            listFiles2 = new File[0];
        }
        arrayList.addAll(Arrays.asList(listFiles));
        arrayList.addAll(Arrays.asList(listFiles2));
        return m8836e(arrayList, i, comparator);
    }

    /* renamed from: g */
    public static <T> C0619h<T> m8838g(C0619h<T> hVar, C0619h<T> hVar2) {
        C0620i iVar = new C0620i();
        C2889b bVar = new C2889b(iVar);
        hVar.mo8646g(bVar);
        hVar2.mo8646g(bVar);
        return iVar.mo8666a();
    }

    /* renamed from: h */
    private static void m8839h(File file) {
        if (file.isDirectory()) {
            for (File h : file.listFiles()) {
                m8839h(h);
            }
        }
        file.delete();
    }
}
