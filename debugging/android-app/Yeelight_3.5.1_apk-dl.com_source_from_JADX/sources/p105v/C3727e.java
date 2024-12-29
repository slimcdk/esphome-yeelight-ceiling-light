package p105v;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.C0917i;
import java.util.ArrayList;

@KeepForSdk
/* renamed from: v.e */
public abstract class C3727e<T> extends C3723a<T> {

    /* renamed from: b */
    private boolean f6257b = false;

    /* renamed from: c */
    private ArrayList f6258c;

    @KeepForSdk
    protected C3727e(@NonNull DataHolder dataHolder) {
        super(dataHolder);
    }

    /* renamed from: B */
    private final void m10616B() {
        synchronized (this) {
            if (!this.f6257b) {
                int count = ((DataHolder) C0917i.m1419j(this.f6251a)).getCount();
                ArrayList arrayList = new ArrayList();
                this.f6258c = arrayList;
                if (count > 0) {
                    arrayList.add(0);
                    String z = mo24112z();
                    String f0 = this.f6251a.mo12130f0(z, 0, this.f6251a.mo12132g0(0));
                    int i = 1;
                    while (i < count) {
                        int g0 = this.f6251a.mo12132g0(i);
                        String f02 = this.f6251a.mo12130f0(z, i, g0);
                        if (f02 != null) {
                            if (!f02.equals(f0)) {
                                this.f6258c.add(Integer.valueOf(i));
                                f0 = f02;
                            }
                            i++;
                        } else {
                            throw new NullPointerException("Missing value for markerColumn: " + z + ", at row: " + i + ", for window: " + g0);
                        }
                    }
                }
                this.f6257b = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final int mo26153A(int i) {
        if (i >= 0 && i < this.f6258c.size()) {
            return ((Integer) this.f6258c.get(i)).intValue();
        }
        throw new IllegalArgumentException("Position " + i + " is out of bounds for this buffer");
    }

    @NonNull
    @KeepForSdk
    public final T get(int i) {
        m10616B();
        int A = mo26153A(i);
        int i2 = 0;
        if (i >= 0 && i != this.f6258c.size()) {
            int count = (i == this.f6258c.size() + -1 ? ((DataHolder) C0917i.m1419j(this.f6251a)).getCount() : ((Integer) this.f6258c.get(i + 1)).intValue()) - ((Integer) this.f6258c.get(i)).intValue();
            if (count == 1) {
                int A2 = mo26153A(i);
                int g0 = ((DataHolder) C0917i.m1419j(this.f6251a)).mo12132g0(A2);
                String m = mo26154m();
                if (m == null || this.f6251a.mo12130f0(m, A2, g0) != null) {
                    i2 = 1;
                }
            } else {
                i2 = count;
            }
        }
        return mo24111v(A, i2);
    }

    @KeepForSdk
    public int getCount() {
        m10616B();
        return this.f6258c.size();
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    @Nullable
    /* renamed from: m */
    public String mo26154m() {
        return null;
    }

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    /* renamed from: v */
    public abstract T mo24111v(int i, int i2);

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    /* renamed from: z */
    public abstract String mo24112z();
}
