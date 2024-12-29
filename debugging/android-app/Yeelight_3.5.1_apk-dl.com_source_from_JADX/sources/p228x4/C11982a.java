package p228x4;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.C9418l;
import kotlin.jvm.internal.C9424q;
import kotlin.reflect.C9455c;
import org.jetbrains.annotations.NotNull;

@JvmName(name = "JvmClassMappingKt")
/* renamed from: x4.a */
public final class C11982a {
    @NotNull
    @JvmName(name = "getJavaClass")
    /* renamed from: a */
    public static final <T> Class<T> m30729a(@NotNull C9455c<T> cVar) {
        C9424q.m22996e(cVar, "<this>");
        Class<?> a = ((C9418l) cVar).mo38325a();
        C9424q.m22994c(a, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return a;
    }

    @NotNull
    /* renamed from: b */
    public static final <T> Class<T> m30730b(@NotNull C9455c<T> cVar) {
        C9424q.m22996e(cVar, "<this>");
        Class a = ((C9418l) cVar).mo38325a();
        if (!a.isPrimitive()) {
            C9424q.m22994c(a, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return a;
        }
        String name = a.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    a = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    a = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    a = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    a = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    a = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    a = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals(TypedValues.Custom.S_BOOLEAN)) {
                    a = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals(TypedValues.Custom.S_FLOAT)) {
                    a = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    a = Short.class;
                    break;
                }
                break;
        }
        C9424q.m22994c(a, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return a;
    }
}
