package com.google.android.gms.internal.wearable;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class zzcr<K, V> extends LinkedHashMap<K, V> {
    private static final zzcr zzb;
    private boolean zza = true;

    static {
        zzcr zzcr = new zzcr();
        zzb = zzcr;
        zzcr.zza = false;
    }

    private zzcr() {
    }

    private zzcr(Map<K, V> map) {
        super(map);
    }

    public static <K, V> zzcr<K, V> zza() {
        return zzb;
    }

    private static int zzf(Object obj) {
        if (obj instanceof byte[]) {
            return C1524w0.m3863g((byte[]) obj);
        }
        if (!(obj instanceof C1490p0)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    private final void zzg() {
        if (!this.zza) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        zzg();
        super.clear();
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                z = value.equals(obj2);
                continue;
            } else {
                z = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += zzf(entry.getValue()) ^ zzf(entry.getKey());
        }
        return i;
    }

    public final V put(K k, V v) {
        zzg();
        C1524w0.m3857a(k);
        C1524w0.m3857a(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        zzg();
        for (Object next : map.keySet()) {
            C1524w0.m3857a(next);
            C1524w0.m3857a(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        zzg();
        return super.remove(obj);
    }

    public final void zzb(zzcr<K, V> zzcr) {
        zzg();
        if (!zzcr.isEmpty()) {
            putAll(zzcr);
        }
    }

    public final zzcr<K, V> zzc() {
        return isEmpty() ? new zzcr<>() : new zzcr<>(this);
    }

    public final void zzd() {
        this.zza = false;
    }

    public final boolean zze() {
        return this.zza;
    }
}
