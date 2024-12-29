package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.jvm.internal.C9422o;
import kotlin.jvm.internal.C9424q;
import org.apache.commons.p194io.FilenameUtils;
import org.jetbrains.annotations.NotNull;

final class SerializedMap implements Externalizable {
    @NotNull
    public static final C9325a Companion = new C9325a((C9422o) null);
    private static final long serialVersionUID = 0;
    @NotNull
    private Map<?, ?> map;

    /* renamed from: kotlin.collections.builders.SerializedMap$a */
    public static final class C9325a {
        private C9325a() {
        }

        public /* synthetic */ C9325a(C9422o oVar) {
            this();
        }
    }

    public SerializedMap() {
        this(C9350k0.m22883f());
    }

    public SerializedMap(@NotNull Map<?, ?> map2) {
        C9424q.m22996e(map2, "map");
        this.map = map2;
    }

    private final Object readResolve() {
        return this.map;
    }

    public void readExternal(@NotNull ObjectInput objectInput) {
        C9424q.m22996e(objectInput, "input");
        byte readByte = objectInput.readByte();
        if (readByte == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                Map b = C9348j0.m22874b(readInt);
                for (int i = 0; i < readInt; i++) {
                    b.put(objectInput.readObject(), objectInput.readObject());
                }
                this.map = C9348j0.m22873a(b);
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + FilenameUtils.EXTENSION_SEPARATOR);
        }
        throw new InvalidObjectException("Unsupported flags value: " + readByte);
    }

    public void writeExternal(@NotNull ObjectOutput objectOutput) {
        C9424q.m22996e(objectOutput, "output");
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.map.size());
        for (Map.Entry next : this.map.entrySet()) {
            objectOutput.writeObject(next.getKey());
            objectOutput.writeObject(next.getValue());
        }
    }
}
