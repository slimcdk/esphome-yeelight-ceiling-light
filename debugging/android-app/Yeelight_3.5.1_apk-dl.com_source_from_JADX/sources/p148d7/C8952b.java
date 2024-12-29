package p148d7;

import java.util.concurrent.ExecutorService;
import org.fourthline.cling.model.C10021i;

/* renamed from: d7.b */
public abstract class C8952b implements C8961k {

    /* renamed from: a */
    protected ExecutorService f16457a;

    /* renamed from: b */
    protected int f16458b = 60;

    /* renamed from: c */
    protected int f16459c = 5;

    protected C8952b(ExecutorService executorService) {
        this.f16457a = executorService;
    }

    /* renamed from: a */
    public int mo36783a() {
        return this.f16458b;
    }

    /* renamed from: b */
    public int mo36784b() {
        return this.f16459c;
    }

    /* renamed from: c */
    public ExecutorService mo36785c() {
        return this.f16457a;
    }

    /* renamed from: d */
    public String mo36786d(int i, int i2) {
        return new C10021i(i, i2).toString();
    }
}
