package p125a5;

import java.util.NoSuchElementException;
import kotlin.collections.C9339f0;

/* renamed from: a5.b */
public final class C3974b extends C9339f0 {

    /* renamed from: a */
    private final int f6720a;

    /* renamed from: b */
    private final int f6721b;

    /* renamed from: c */
    private boolean f6722c;

    /* renamed from: d */
    private int f6723d;

    public C3974b(int i, int i2, int i3) {
        this.f6720a = i3;
        this.f6721b = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f6722c = z;
        this.f6723d = !z ? i2 : i;
    }

    /* renamed from: a */
    public int mo26532a() {
        int i = this.f6723d;
        if (i != this.f6721b) {
            this.f6723d = this.f6720a + i;
        } else if (this.f6722c) {
            this.f6722c = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    public boolean hasNext() {
        return this.f6722c;
    }
}
