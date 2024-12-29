package p033f1;

import java.io.File;
import java.util.Comparator;

/* renamed from: f1.c */
public final /* synthetic */ class C9027c implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C9027c f16537a = new C9027c();

    private /* synthetic */ C9027c() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((File) obj2).getName().compareTo(((File) obj).getName());
    }
}
