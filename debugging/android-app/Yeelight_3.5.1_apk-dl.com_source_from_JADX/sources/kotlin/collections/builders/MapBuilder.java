package kotlin.collections.builders;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.C9339f0;
import kotlin.jvm.internal.C9422o;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p125a5.C3975c;

public final class MapBuilder<K, V> implements Map<K, V>, Serializable {
    @NotNull
    private static final C9318a Companion = new C9318a((C9422o) null);
    @Deprecated
    private static final int INITIAL_CAPACITY = 8;
    @Deprecated
    private static final int INITIAL_MAX_PROBE_DISTANCE = 2;
    @Deprecated
    private static final int MAGIC = -1640531527;
    @Deprecated
    private static final int TOMBSTONE = -1;
    @Nullable
    private C9328c<K, V> entriesView;
    @NotNull
    private int[] hashArray;
    private int hashShift;
    private boolean isReadOnly;
    /* access modifiers changed from: private */
    @NotNull
    public K[] keysArray;
    @Nullable
    private C9329d<K> keysView;
    /* access modifiers changed from: private */
    public int length;
    private int maxProbeDistance;
    /* access modifiers changed from: private */
    @NotNull
    public int[] presenceArray;
    private int size;
    /* access modifiers changed from: private */
    @Nullable
    public V[] valuesArray;
    @Nullable
    private C9330e<V> valuesView;

    /* renamed from: kotlin.collections.builders.MapBuilder$a */
    private static final class C9318a {
        private C9318a() {
        }

        public /* synthetic */ C9318a(C9422o oVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final int m22825c(int i) {
            return Integer.highestOneBit(C3979f.m11481a(i, 1) * 3);
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final int m22826d(int i) {
            return Integer.numberOfLeadingZeros(i) + 1;
        }
    }

    /* renamed from: kotlin.collections.builders.MapBuilder$b */
    public static final class C9319b<K, V> extends C9321d<K, V> implements Iterator<Map.Entry<K, V>> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9319b(@NotNull MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            C9424q.m22996e(mapBuilder, "map");
        }

        @NotNull
        /* renamed from: g */
        public C9320c<K, V> next() {
            if (mo38108a() < mo38110c().length) {
                int a = mo38108a();
                mo38112e(a + 1);
                mo38113f(a);
                C9320c<K, V> cVar = new C9320c<>(mo38110c(), mo38109b());
                mo38111d();
                return cVar;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: h */
        public final void mo38099h(@NotNull StringBuilder sb) {
            C9424q.m22996e(sb, "sb");
            if (mo38108a() < mo38110c().length) {
                int a = mo38108a();
                mo38112e(a + 1);
                mo38113f(a);
                Object obj = mo38110c().keysArray[mo38109b()];
                if (C9424q.m22992a(obj, mo38110c())) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object[] access$getValuesArray$p = mo38110c().valuesArray;
                C9424q.m22993b(access$getValuesArray$p);
                Object obj2 = access$getValuesArray$p[mo38109b()];
                if (C9424q.m22992a(obj2, mo38110c())) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                mo38111d();
                return;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: i */
        public final int mo38100i() {
            if (mo38108a() < mo38110c().length) {
                int a = mo38108a();
                mo38112e(a + 1);
                mo38113f(a);
                Object obj = mo38110c().keysArray[mo38109b()];
                int i = 0;
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object[] access$getValuesArray$p = mo38110c().valuesArray;
                C9424q.m22993b(access$getValuesArray$p);
                Object obj2 = access$getValuesArray$p[mo38109b()];
                if (obj2 != null) {
                    i = obj2.hashCode();
                }
                int i2 = hashCode ^ i;
                mo38111d();
                return i2;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: kotlin.collections.builders.MapBuilder$c */
    public static final class C9320c<K, V> implements Map.Entry<K, V> {
        @NotNull

        /* renamed from: a */
        private final MapBuilder<K, V> f17251a;

        /* renamed from: b */
        private final int f17252b;

        public C9320c(@NotNull MapBuilder<K, V> mapBuilder, int i) {
            C9424q.m22996e(mapBuilder, "map");
            this.f17251a = mapBuilder;
            this.f17252b = i;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return C9424q.m22992a(entry.getKey(), getKey()) && C9424q.m22992a(entry.getValue(), getValue());
            }
        }

        public K getKey() {
            return this.f17251a.keysArray[this.f17252b];
        }

        public V getValue() {
            V[] access$getValuesArray$p = this.f17251a.valuesArray;
            C9424q.m22993b(access$getValuesArray$p);
            return access$getValuesArray$p[this.f17252b];
        }

        public int hashCode() {
            Object key = getKey();
            int i = 0;
            int hashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            if (value != null) {
                i = value.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            this.f17251a.checkIsMutable$kotlin_stdlib();
            V[] access$allocateValuesArray = this.f17251a.allocateValuesArray();
            int i = this.f17252b;
            V v2 = access$allocateValuesArray[i];
            access$allocateValuesArray[i] = v;
            return v2;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* renamed from: kotlin.collections.builders.MapBuilder$d */
    public static class C9321d<K, V> {
        @NotNull

        /* renamed from: a */
        private final MapBuilder<K, V> f17253a;

        /* renamed from: b */
        private int f17254b;

        /* renamed from: c */
        private int f17255c = -1;

        public C9321d(@NotNull MapBuilder<K, V> mapBuilder) {
            C9424q.m22996e(mapBuilder, "map");
            this.f17253a = mapBuilder;
            mo38111d();
        }

        /* renamed from: a */
        public final int mo38108a() {
            return this.f17254b;
        }

        /* renamed from: b */
        public final int mo38109b() {
            return this.f17255c;
        }

        @NotNull
        /* renamed from: c */
        public final MapBuilder<K, V> mo38110c() {
            return this.f17253a;
        }

        /* renamed from: d */
        public final void mo38111d() {
            while (this.f17254b < this.f17253a.length) {
                int[] access$getPresenceArray$p = this.f17253a.presenceArray;
                int i = this.f17254b;
                if (access$getPresenceArray$p[i] < 0) {
                    this.f17254b = i + 1;
                } else {
                    return;
                }
            }
        }

        /* renamed from: e */
        public final void mo38112e(int i) {
            this.f17254b = i;
        }

        /* renamed from: f */
        public final void mo38113f(int i) {
            this.f17255c = i;
        }

        public final boolean hasNext() {
            return this.f17254b < this.f17253a.length;
        }

        public final void remove() {
            if (this.f17255c != -1) {
                this.f17253a.checkIsMutable$kotlin_stdlib();
                this.f17253a.removeKeyAt(this.f17255c);
                this.f17255c = -1;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    /* renamed from: kotlin.collections.builders.MapBuilder$e */
    public static final class C9322e<K, V> extends C9321d<K, V> implements Iterator<K> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9322e(@NotNull MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            C9424q.m22996e(mapBuilder, "map");
        }

        public K next() {
            if (mo38108a() < mo38110c().length) {
                int a = mo38108a();
                mo38112e(a + 1);
                mo38113f(a);
                K k = mo38110c().keysArray[mo38109b()];
                mo38111d();
                return k;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: kotlin.collections.builders.MapBuilder$f */
    public static final class C9323f<K, V> extends C9321d<K, V> implements Iterator<V> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9323f(@NotNull MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            C9424q.m22996e(mapBuilder, "map");
        }

        public V next() {
            if (mo38108a() < mo38110c().length) {
                int a = mo38108a();
                mo38112e(a + 1);
                mo38113f(a);
                V[] access$getValuesArray$p = mo38110c().valuesArray;
                C9424q.m22993b(access$getValuesArray$p);
                V v = access$getValuesArray$p[mo38109b()];
                mo38111d();
                return v;
            }
            throw new NoSuchElementException();
        }
    }

    public MapBuilder() {
        this(8);
    }

    public MapBuilder(int i) {
        this(C9327b.m22842d(i), (V[]) null, new int[i], new int[Companion.m22825c(i)], 2, 0);
    }

    private MapBuilder(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i, int i2) {
        this.keysArray = kArr;
        this.valuesArray = vArr;
        this.presenceArray = iArr;
        this.hashArray = iArr2;
        this.maxProbeDistance = i;
        this.length = i2;
        this.hashShift = Companion.m22826d(getHashSize());
    }

    /* access modifiers changed from: private */
    public final V[] allocateValuesArray() {
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        V[] d = C9327b.m22842d(getCapacity());
        this.valuesArray = d;
        return d;
    }

    private final void compact() {
        int i;
        V[] vArr = this.valuesArray;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.length;
            if (i2 >= i) {
                break;
            }
            if (this.presenceArray[i2] >= 0) {
                K[] kArr = this.keysArray;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                i3++;
            }
            i2++;
        }
        C9327b.m22845g(this.keysArray, i3, i);
        if (vArr != null) {
            C9327b.m22845g(vArr, i3, this.length);
        }
        this.length = i3;
    }

    private final boolean contentEquals(Map<?, ?> map) {
        return size() == map.size() && containsAllEntries$kotlin_stdlib(map.entrySet());
    }

    private final void ensureCapacity(int i) {
        int i2;
        if (i >= 0) {
            if (i > getCapacity()) {
                int capacity = (getCapacity() * 3) / 2;
                if (i <= capacity) {
                    i = capacity;
                }
                this.keysArray = C9327b.m22843e(this.keysArray, i);
                V[] vArr = this.valuesArray;
                this.valuesArray = vArr != null ? C9327b.m22843e(vArr, i) : null;
                int[] copyOf = Arrays.copyOf(this.presenceArray, i);
                C9424q.m22995d(copyOf, "copyOf(this, newSize)");
                this.presenceArray = copyOf;
                i2 = Companion.m22825c(i);
                if (i2 <= getHashSize()) {
                    return;
                }
            } else if ((this.length + i) - size() > getCapacity()) {
                i2 = getHashSize();
            } else {
                return;
            }
            rehash(i2);
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void ensureExtraCapacity(int i) {
        ensureCapacity(this.length + i);
    }

    private final int findKey(K k) {
        int hash = hash(k);
        int i = this.maxProbeDistance;
        while (true) {
            int i2 = this.hashArray[hash];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (C9424q.m22992a(this.keysArray[i3], k)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            hash = hash == 0 ? getHashSize() - 1 : hash - 1;
        }
    }

    private final int findValue(V v) {
        int i = this.length;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.presenceArray[i] >= 0) {
                V[] vArr = this.valuesArray;
                C9424q.m22993b(vArr);
                if (C9424q.m22992a(vArr[i], v)) {
                    return i;
                }
            }
        }
    }

    private final int getCapacity() {
        return this.keysArray.length;
    }

    private final int getHashSize() {
        return this.hashArray.length;
    }

    private final int hash(K k) {
        return ((k != null ? k.hashCode() : 0) * MAGIC) >>> this.hashShift;
    }

    private final boolean putAllEntries(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        ensureExtraCapacity(collection.size());
        for (Map.Entry putEntry : collection) {
            if (putEntry(putEntry)) {
                z = true;
            }
        }
        return z;
    }

    private final boolean putEntry(Map.Entry<? extends K, ? extends V> entry) {
        int addKey$kotlin_stdlib = addKey$kotlin_stdlib(entry.getKey());
        Object[] allocateValuesArray = allocateValuesArray();
        if (addKey$kotlin_stdlib >= 0) {
            allocateValuesArray[addKey$kotlin_stdlib] = entry.getValue();
            return true;
        }
        int i = (-addKey$kotlin_stdlib) - 1;
        if (C9424q.m22992a(entry.getValue(), allocateValuesArray[i])) {
            return false;
        }
        allocateValuesArray[i] = entry.getValue();
        return true;
    }

    private final boolean putRehash(int i) {
        int hash = hash(this.keysArray[i]);
        int i2 = this.maxProbeDistance;
        while (true) {
            int[] iArr = this.hashArray;
            if (iArr[hash] == 0) {
                iArr[hash] = i + 1;
                this.presenceArray[i] = hash;
                return true;
            }
            i2--;
            if (i2 < 0) {
                return false;
            }
            hash = hash == 0 ? getHashSize() - 1 : hash - 1;
        }
    }

    private final void rehash(int i) {
        if (this.length > size()) {
            compact();
        }
        int i2 = 0;
        if (i != getHashSize()) {
            this.hashArray = new int[i];
            this.hashShift = Companion.m22826d(i);
        } else {
            C9349k.m22881e(this.hashArray, 0, 0, getHashSize());
        }
        while (i2 < this.length) {
            int i3 = i2 + 1;
            if (putRehash(i2)) {
                i2 = i3;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    private final void removeHashAt(int i) {
        int b = C3979f.m11482b(this.maxProbeDistance * 2, getHashSize() / 2);
        int i2 = 0;
        int i3 = i;
        do {
            i = i == 0 ? getHashSize() - 1 : i - 1;
            i2++;
            if (i2 > this.maxProbeDistance) {
                this.hashArray[i3] = 0;
                return;
            }
            int[] iArr = this.hashArray;
            int i4 = iArr[i];
            if (i4 == 0) {
                iArr[i3] = 0;
                return;
            }
            if (i4 < 0) {
                iArr[i3] = -1;
            } else {
                int i5 = i4 - 1;
                if (((hash(this.keysArray[i5]) - i) & (getHashSize() - 1)) >= i2) {
                    this.hashArray[i3] = i4;
                    this.presenceArray[i5] = i3;
                }
                b--;
            }
            i3 = i;
            i2 = 0;
            b--;
        } while (b >= 0);
        this.hashArray[i3] = -1;
    }

    /* access modifiers changed from: private */
    public final void removeKeyAt(int i) {
        C9327b.m22844f(this.keysArray, i);
        removeHashAt(this.presenceArray[i]);
        this.presenceArray[i] = -1;
        this.size = size() - 1;
    }

    private final Object writeReplace() {
        if (this.isReadOnly) {
            return new SerializedMap(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int addKey$kotlin_stdlib(K k) {
        checkIsMutable$kotlin_stdlib();
        while (true) {
            int hash = hash(k);
            int b = C3979f.m11482b(this.maxProbeDistance * 2, getHashSize() / 2);
            int i = 0;
            while (true) {
                int i2 = this.hashArray[hash];
                if (i2 <= 0) {
                    if (this.length >= getCapacity()) {
                        ensureExtraCapacity(1);
                    } else {
                        int i3 = this.length;
                        int i4 = i3 + 1;
                        this.length = i4;
                        this.keysArray[i3] = k;
                        this.presenceArray[i3] = hash;
                        this.hashArray[hash] = i4;
                        this.size = size() + 1;
                        if (i > this.maxProbeDistance) {
                            this.maxProbeDistance = i;
                        }
                        return i3;
                    }
                } else if (C9424q.m22992a(this.keysArray[i2 - 1], k)) {
                    return -i2;
                } else {
                    i++;
                    if (i > b) {
                        rehash(getHashSize() * 2);
                        break;
                    }
                    hash = hash == 0 ? getHashSize() - 1 : hash - 1;
                }
            }
        }
    }

    @NotNull
    public final Map<K, V> build() {
        checkIsMutable$kotlin_stdlib();
        this.isReadOnly = true;
        return this;
    }

    public final void checkIsMutable$kotlin_stdlib() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        checkIsMutable$kotlin_stdlib();
        C9339f0 j = new C3975c(0, this.length - 1).iterator();
        while (j.hasNext()) {
            int a = j.mo26532a();
            int[] iArr = this.presenceArray;
            int i = iArr[a];
            if (i >= 0) {
                this.hashArray[i] = 0;
                iArr[a] = -1;
            }
        }
        C9327b.m22845g(this.keysArray, 0, this.length);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            C9327b.m22845g(vArr, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
    }

    public final boolean containsAllEntries$kotlin_stdlib(@NotNull Collection<?> collection) {
        C9424q.m22996e(collection, "m");
        for (Object next : collection) {
            if (next != null) {
                try {
                    if (!containsEntry$kotlin_stdlib((Map.Entry) next)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean containsEntry$kotlin_stdlib(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        C9424q.m22996e(entry, "entry");
        int findKey = findKey(entry.getKey());
        if (findKey < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        C9424q.m22993b(vArr);
        return C9424q.m22992a(vArr[findKey], entry.getValue());
    }

    public boolean containsKey(Object obj) {
        return findKey(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return findValue(obj) >= 0;
    }

    @NotNull
    public final C9319b<K, V> entriesIterator$kotlin_stdlib() {
        return new C9319b<>(this);
    }

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    public boolean equals(@Nullable Object obj) {
        return obj == this || ((obj instanceof Map) && contentEquals((Map) obj));
    }

    @Nullable
    public V get(Object obj) {
        int findKey = findKey(obj);
        if (findKey < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        C9424q.m22993b(vArr);
        return vArr[findKey];
    }

    @NotNull
    public Set<Map.Entry<K, V>> getEntries() {
        C9328c<K, V> cVar = this.entriesView;
        if (cVar != null) {
            return cVar;
        }
        C9328c<K, V> cVar2 = new C9328c<>(this);
        this.entriesView = cVar2;
        return cVar2;
    }

    @NotNull
    public Set<K> getKeys() {
        C9329d<K> dVar = this.keysView;
        if (dVar != null) {
            return dVar;
        }
        C9329d<K> dVar2 = new C9329d<>(this);
        this.keysView = dVar2;
        return dVar2;
    }

    public int getSize() {
        return this.size;
    }

    @NotNull
    public Collection<V> getValues() {
        C9330e<V> eVar = this.valuesView;
        if (eVar != null) {
            return eVar;
        }
        C9330e<V> eVar2 = new C9330e<>(this);
        this.valuesView = eVar2;
        return eVar2;
    }

    public int hashCode() {
        C9319b entriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i = 0;
        while (entriesIterator$kotlin_stdlib.hasNext()) {
            i += entriesIterator$kotlin_stdlib.mo38100i();
        }
        return i;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public final boolean isReadOnly$kotlin_stdlib() {
        return this.isReadOnly;
    }

    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @NotNull
    public final C9322e<K, V> keysIterator$kotlin_stdlib() {
        return new C9322e<>(this);
    }

    @Nullable
    public V put(K k, V v) {
        checkIsMutable$kotlin_stdlib();
        int addKey$kotlin_stdlib = addKey$kotlin_stdlib(k);
        V[] allocateValuesArray = allocateValuesArray();
        if (addKey$kotlin_stdlib < 0) {
            int i = (-addKey$kotlin_stdlib) - 1;
            V v2 = allocateValuesArray[i];
            allocateValuesArray[i] = v;
            return v2;
        }
        allocateValuesArray[addKey$kotlin_stdlib] = v;
        return null;
    }

    public void putAll(@NotNull Map<? extends K, ? extends V> map) {
        C9424q.m22996e(map, TypedValues.TransitionType.S_FROM);
        checkIsMutable$kotlin_stdlib();
        putAllEntries(map.entrySet());
    }

    @Nullable
    public V remove(Object obj) {
        int removeKey$kotlin_stdlib = removeKey$kotlin_stdlib(obj);
        if (removeKey$kotlin_stdlib < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        C9424q.m22993b(vArr);
        V v = vArr[removeKey$kotlin_stdlib];
        C9327b.m22844f(vArr, removeKey$kotlin_stdlib);
        return v;
    }

    public final boolean removeEntry$kotlin_stdlib(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        C9424q.m22996e(entry, "entry");
        checkIsMutable$kotlin_stdlib();
        int findKey = findKey(entry.getKey());
        if (findKey < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        C9424q.m22993b(vArr);
        if (!C9424q.m22992a(vArr[findKey], entry.getValue())) {
            return false;
        }
        removeKeyAt(findKey);
        return true;
    }

    public final int removeKey$kotlin_stdlib(K k) {
        checkIsMutable$kotlin_stdlib();
        int findKey = findKey(k);
        if (findKey < 0) {
            return -1;
        }
        removeKeyAt(findKey);
        return findKey;
    }

    public final boolean removeValue$kotlin_stdlib(V v) {
        checkIsMutable$kotlin_stdlib();
        int findValue = findValue(v);
        if (findValue < 0) {
            return false;
        }
        removeKeyAt(findValue);
        return true;
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        C9319b entriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i = 0;
        while (entriesIterator$kotlin_stdlib.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            entriesIterator$kotlin_stdlib.mo38099h(sb);
            i++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        C9424q.m22995d(sb2, "sb.toString()");
        return sb2;
    }

    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    @NotNull
    public final C9323f<K, V> valuesIterator$kotlin_stdlib() {
        return new C9323f<>(this);
    }
}
