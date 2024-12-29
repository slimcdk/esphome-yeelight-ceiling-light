package com.google.gson;

public enum LongSerializationPolicy {
    DEFAULT {
        public C2528k serialize(Long l) {
            return new C2531n((Number) l);
        }
    },
    STRING {
        public C2528k serialize(Long l) {
            return new C2531n(String.valueOf(l));
        }
    };

    public abstract C2528k serialize(Long l);
}
