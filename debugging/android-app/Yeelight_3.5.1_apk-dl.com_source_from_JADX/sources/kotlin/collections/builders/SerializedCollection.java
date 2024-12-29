package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C9422o;
import kotlin.jvm.internal.C9424q;
import org.apache.commons.p194io.FilenameUtils;
import org.jetbrains.annotations.NotNull;

public final class SerializedCollection implements Externalizable {
    @NotNull
    public static final C9324a Companion = new C9324a((C9422o) null);
    private static final long serialVersionUID = 0;
    public static final int tagList = 0;
    public static final int tagSet = 1;
    @NotNull
    private Collection<?> collection;
    private final int tag;

    /* renamed from: kotlin.collections.builders.SerializedCollection$a */
    public static final class C9324a {
        private C9324a() {
        }

        public /* synthetic */ C9324a(C9422o oVar) {
            this();
        }
    }

    public SerializedCollection() {
        this(C9366s.m22923d(), 0);
    }

    public SerializedCollection(@NotNull Collection<?> collection2, int i) {
        C9424q.m22996e(collection2, "collection");
        this.collection = collection2;
        this.tag = i;
    }

    private final Object readResolve() {
        return this.collection;
    }

    public void readExternal(@NotNull ObjectInput objectInput) {
        Collection<?> collection2;
        C9424q.m22996e(objectInput, "input");
        byte readByte = objectInput.readByte();
        byte b = readByte & 1;
        if ((readByte & -2) == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                int i = 0;
                if (b == 0) {
                    List b2 = C9364r.m22921b(readInt);
                    while (i < readInt) {
                        b2.add(objectInput.readObject());
                        i++;
                    }
                    collection2 = C9364r.m22920a(b2);
                } else if (b == 1) {
                    Set b3 = C9361p0.m22905b(readInt);
                    while (i < readInt) {
                        b3.add(objectInput.readObject());
                        i++;
                    }
                    collection2 = C9361p0.m22904a(b3);
                } else {
                    throw new InvalidObjectException("Unsupported collection type tag: " + b + FilenameUtils.EXTENSION_SEPARATOR);
                }
                this.collection = collection2;
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + FilenameUtils.EXTENSION_SEPARATOR);
        }
        throw new InvalidObjectException("Unsupported flags value: " + readByte + FilenameUtils.EXTENSION_SEPARATOR);
    }

    public void writeExternal(@NotNull ObjectOutput objectOutput) {
        C9424q.m22996e(objectOutput, "output");
        objectOutput.writeByte(this.tag);
        objectOutput.writeInt(this.collection.size());
        for (Object writeObject : this.collection) {
            objectOutput.writeObject(writeObject);
        }
    }
}
