package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.proto.Protobuf;
import java.lang.annotation.Annotation;

public final class AtProtobuf {

    /* renamed from: a */
    private int f4044a;

    /* renamed from: b */
    private Protobuf.IntEncoding f4045b = Protobuf.IntEncoding.DEFAULT;

    private static final class ProtobufImpl implements Protobuf {
        private final Protobuf.IntEncoding intEncoding;
        private final int tag;

        ProtobufImpl(int i, Protobuf.IntEncoding intEncoding2) {
            this.tag = i;
            this.intEncoding = intEncoding2;
        }

        public Class<? extends Annotation> annotationType() {
            return Protobuf.class;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Protobuf)) {
                return false;
            }
            Protobuf protobuf = (Protobuf) obj;
            return this.tag == protobuf.tag() && this.intEncoding.equals(protobuf.intEncoding());
        }

        public int hashCode() {
            return (this.tag ^ 14552422) + (this.intEncoding.hashCode() ^ 2041407134);
        }

        public Protobuf.IntEncoding intEncoding() {
            return this.intEncoding;
        }

        public int tag() {
            return this.tag;
        }

        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf" + '(' + "tag=" + this.tag + "intEncoding=" + this.intEncoding + ')';
        }
    }

    /* renamed from: b */
    public static AtProtobuf m6419b() {
        return new AtProtobuf();
    }

    /* renamed from: a */
    public Protobuf mo18997a() {
        return new ProtobufImpl(this.f4044a, this.f4045b);
    }

    /* renamed from: c */
    public AtProtobuf mo18998c(int i) {
        this.f4044a = i;
        return this;
    }
}
