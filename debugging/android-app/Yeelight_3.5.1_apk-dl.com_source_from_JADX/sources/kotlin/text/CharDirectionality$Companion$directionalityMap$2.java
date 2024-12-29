package kotlin.text;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p233y4.C12049a;

final class CharDirectionality$Companion$directionalityMap$2 extends Lambda implements C12049a<Map<Integer, ? extends CharDirectionality>> {
    public static final CharDirectionality$Companion$directionalityMap$2 INSTANCE = new CharDirectionality$Companion$directionalityMap$2();

    CharDirectionality$Companion$directionalityMap$2() {
        super(0);
    }

    @NotNull
    public final Map<Integer, CharDirectionality> invoke() {
        CharDirectionality[] values = CharDirectionality.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C3979f.m11481a(C9348j0.m22875c(values.length), 16));
        for (CharDirectionality charDirectionality : values) {
            linkedHashMap.put(Integer.valueOf(charDirectionality.getValue()), charDirectionality);
        }
        return linkedHashMap;
    }
}
