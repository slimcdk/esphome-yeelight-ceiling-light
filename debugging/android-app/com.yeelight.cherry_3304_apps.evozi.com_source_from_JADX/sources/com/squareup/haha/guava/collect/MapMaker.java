package com.squareup.haha.guava.collect;

import com.miot.service.manager.timer.TimerCodec;
import com.squareup.haha.guava.base.Objects$ToStringHelper;
import javax.annotation.Nullable;

public final class MapMaker extends GenericMapMaker<Object, Object> {

    enum RemovalCause {
        EXPLICIT {
        },
        REPLACED {
        },
        COLLECTED {
        },
        EXPIRED {
        },
        SIZE {
        };

        static {
            EXPLICIT = new RemovalCause("EXPLICIT", 0) {
            };
            REPLACED = new RemovalCause("REPLACED", 1) {
            };
            COLLECTED = new RemovalCause("COLLECTED", 2) {
            };
            EXPIRED = new RemovalCause("EXPIRED", 3) {
            };
            SIZE = new RemovalCause("SIZE", 4) {
            };
        }
    }

    static final class RemovalNotification<K, V> extends ImmutableEntry<K, V> {
        RemovalNotification(@Nullable K k, @Nullable V v, RemovalCause removalCause) {
            super(k, v);
        }
    }

    public final String toString() {
        String replaceAll = MapMaker.class.getName().replaceAll("\\$[0-9]+", "\\$");
        int lastIndexOf = replaceAll.lastIndexOf(36);
        if (lastIndexOf == -1) {
            lastIndexOf = replaceAll.lastIndexOf(46);
        }
        Objects$ToStringHelper objects$ToStringHelper = new Objects$ToStringHelper(replaceAll.substring(lastIndexOf + 1), (byte) 0);
        objects$ToStringHelper.add("initialCapacity", 0);
        objects$ToStringHelper.add("concurrencyLevel", 0);
        objects$ToStringHelper.add("maximumSize", 0);
        objects$ToStringHelper.addHolder("expireAfterWrite", TimerCodec.DISENABLE + "ns");
        objects$ToStringHelper.addHolder("expireAfterAccess", TimerCodec.DISENABLE + "ns");
        return objects$ToStringHelper.toString();
    }
}
