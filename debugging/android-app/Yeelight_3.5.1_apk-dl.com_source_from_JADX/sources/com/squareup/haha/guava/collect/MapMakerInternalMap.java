package com.squareup.haha.guava.collect;

import androidx.core.location.LocationRequestCompat;
import com.squareup.haha.guava.base.Ascii;
import com.squareup.haha.guava.base.Equivalence;
import com.squareup.haha.guava.base.Ticker;
import com.squareup.haha.guava.collect.MapMaker;
import com.squareup.haha.guava.primitives.Ints;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

class MapMakerInternalMap<K, V> extends AbstractMap<K, V> implements Serializable, ConcurrentMap<K, V> {
    static final Queue<? extends Object> DISCARDING_QUEUE = new AbstractQueue<Object>() {
        public final Iterator<Object> iterator() {
            return Iterators.emptyIterator();
        }

        public final boolean offer(Object obj) {
            return true;
        }

        public final Object peek() {
            return null;
        }

        public final Object poll() {
            return null;
        }

        public final int size() {
            return 0;
        }
    };
    private static ValueReference<Object, Object> UNSET = new ValueReference<Object, Object>() {
        public final void clear$5ca9f1d3() {
        }

        public final ValueReference<Object, Object> copyFor(ReferenceQueue<Object> referenceQueue, @Nullable Object obj, ReferenceEntry<Object, Object> referenceEntry) {
            return this;
        }

        public final Object get() {
            return null;
        }

        public final ReferenceEntry<Object, Object> getEntry() {
            return null;
        }
    };
    static final Logger logger = Logger.getLogger(MapMakerInternalMap.class.getName());
    final transient EntryFactory entryFactory;
    private transient Set<Map.Entry<K, V>> entrySet;
    final long expireAfterAccessNanos;
    final long expireAfterWriteNanos;
    final Equivalence<Object> keyEquivalence;
    private transient Set<K> keySet;
    private Strength keyStrength;
    final int maximumSize;
    final Queue<MapMaker.RemovalNotification<K, V>> removalNotificationQueue;
    private transient int segmentMask;
    private transient int segmentShift;
    final transient Segment<K, V>[] segments;
    final Ticker ticker;
    final Equivalence<Object> valueEquivalence;
    final Strength valueStrength;
    private transient Collection<V> values;

    enum EntryFactory {
        STRONG {
            /* access modifiers changed from: package-private */
            public final <K, V> ReferenceEntry<Object, Object> newEntry(Segment<Object, Object> segment, Object obj, int i, @Nullable ReferenceEntry<Object, Object> referenceEntry) {
                return new StrongEntry(obj, i, referenceEntry);
            }
        },
        STRONG_EXPIRABLE {
            /* access modifiers changed from: package-private */
            public final <K, V> ReferenceEntry<Object, Object> copyEntry(Segment<Object, Object> segment, ReferenceEntry<Object, Object> referenceEntry, ReferenceEntry<Object, Object> referenceEntry2) {
                ReferenceEntry<Object, Object> copyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2);
                EntryFactory.copyExpirableEntry(referenceEntry, copyEntry);
                return copyEntry;
            }

            /* access modifiers changed from: package-private */
            public final <K, V> ReferenceEntry<Object, Object> newEntry(Segment<Object, Object> segment, Object obj, int i, @Nullable ReferenceEntry<Object, Object> referenceEntry) {
                return new StrongExpirableEntry(obj, i, referenceEntry);
            }
        },
        STRONG_EVICTABLE {
            /* access modifiers changed from: package-private */
            public final <K, V> ReferenceEntry<Object, Object> copyEntry(Segment<Object, Object> segment, ReferenceEntry<Object, Object> referenceEntry, ReferenceEntry<Object, Object> referenceEntry2) {
                ReferenceEntry<Object, Object> copyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2);
                EntryFactory.copyEvictableEntry(referenceEntry, copyEntry);
                return copyEntry;
            }

            /* access modifiers changed from: package-private */
            public final <K, V> ReferenceEntry<Object, Object> newEntry(Segment<Object, Object> segment, Object obj, int i, @Nullable ReferenceEntry<Object, Object> referenceEntry) {
                return new StrongEvictableEntry(obj, i, referenceEntry);
            }
        },
        STRONG_EXPIRABLE_EVICTABLE {
            /* access modifiers changed from: package-private */
            public final <K, V> ReferenceEntry<Object, Object> copyEntry(Segment<Object, Object> segment, ReferenceEntry<Object, Object> referenceEntry, ReferenceEntry<Object, Object> referenceEntry2) {
                ReferenceEntry<Object, Object> copyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2);
                EntryFactory.copyExpirableEntry(referenceEntry, copyEntry);
                EntryFactory.copyEvictableEntry(referenceEntry, copyEntry);
                return copyEntry;
            }

            /* access modifiers changed from: package-private */
            public final <K, V> ReferenceEntry<Object, Object> newEntry(Segment<Object, Object> segment, Object obj, int i, @Nullable ReferenceEntry<Object, Object> referenceEntry) {
                return new StrongExpirableEvictableEntry(obj, i, referenceEntry);
            }
        },
        WEAK {
            /* access modifiers changed from: package-private */
            public final <K, V> ReferenceEntry<Object, Object> newEntry(Segment<Object, Object> segment, Object obj, int i, @Nullable ReferenceEntry<Object, Object> referenceEntry) {
                return new WeakEntry(segment.keyReferenceQueue, obj, i, referenceEntry);
            }
        },
        WEAK_EXPIRABLE {
            /* access modifiers changed from: package-private */
            public final <K, V> ReferenceEntry<Object, Object> copyEntry(Segment<Object, Object> segment, ReferenceEntry<Object, Object> referenceEntry, ReferenceEntry<Object, Object> referenceEntry2) {
                ReferenceEntry<Object, Object> copyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2);
                EntryFactory.copyExpirableEntry(referenceEntry, copyEntry);
                return copyEntry;
            }

            /* access modifiers changed from: package-private */
            public final <K, V> ReferenceEntry<Object, Object> newEntry(Segment<Object, Object> segment, Object obj, int i, @Nullable ReferenceEntry<Object, Object> referenceEntry) {
                return new WeakExpirableEntry(segment.keyReferenceQueue, obj, i, referenceEntry);
            }
        },
        WEAK_EVICTABLE {
            /* access modifiers changed from: package-private */
            public final <K, V> ReferenceEntry<Object, Object> copyEntry(Segment<Object, Object> segment, ReferenceEntry<Object, Object> referenceEntry, ReferenceEntry<Object, Object> referenceEntry2) {
                ReferenceEntry<Object, Object> copyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2);
                EntryFactory.copyEvictableEntry(referenceEntry, copyEntry);
                return copyEntry;
            }

            /* access modifiers changed from: package-private */
            public final <K, V> ReferenceEntry<Object, Object> newEntry(Segment<Object, Object> segment, Object obj, int i, @Nullable ReferenceEntry<Object, Object> referenceEntry) {
                return new WeakEvictableEntry(segment.keyReferenceQueue, obj, i, referenceEntry);
            }
        },
        WEAK_EXPIRABLE_EVICTABLE {
            /* access modifiers changed from: package-private */
            public final <K, V> ReferenceEntry<Object, Object> copyEntry(Segment<Object, Object> segment, ReferenceEntry<Object, Object> referenceEntry, ReferenceEntry<Object, Object> referenceEntry2) {
                ReferenceEntry<Object, Object> copyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2);
                EntryFactory.copyExpirableEntry(referenceEntry, copyEntry);
                EntryFactory.copyEvictableEntry(referenceEntry, copyEntry);
                return copyEntry;
            }

            /* access modifiers changed from: package-private */
            public final <K, V> ReferenceEntry<Object, Object> newEntry(Segment<Object, Object> segment, Object obj, int i, @Nullable ReferenceEntry<Object, Object> referenceEntry) {
                return new WeakExpirableEvictableEntry(segment.keyReferenceQueue, obj, i, referenceEntry);
            }
        };

        static {
            STRONG = new EntryFactory("STRONG", 0) {
                /* access modifiers changed from: package-private */
                public final <K, V> ReferenceEntry<Object, Object> newEntry(Segment<Object, Object> segment, Object obj, int i, @Nullable ReferenceEntry<Object, Object> referenceEntry) {
                    return new StrongEntry(obj, i, referenceEntry);
                }
            };
            STRONG_EXPIRABLE = new EntryFactory("STRONG_EXPIRABLE", 1) {
                /* access modifiers changed from: package-private */
                public final <K, V> ReferenceEntry<Object, Object> copyEntry(Segment<Object, Object> segment, ReferenceEntry<Object, Object> referenceEntry, ReferenceEntry<Object, Object> referenceEntry2) {
                    ReferenceEntry<Object, Object> copyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2);
                    EntryFactory.copyExpirableEntry(referenceEntry, copyEntry);
                    return copyEntry;
                }

                /* access modifiers changed from: package-private */
                public final <K, V> ReferenceEntry<Object, Object> newEntry(Segment<Object, Object> segment, Object obj, int i, @Nullable ReferenceEntry<Object, Object> referenceEntry) {
                    return new StrongExpirableEntry(obj, i, referenceEntry);
                }
            };
            STRONG_EVICTABLE = new EntryFactory("STRONG_EVICTABLE", 2) {
                /* access modifiers changed from: package-private */
                public final <K, V> ReferenceEntry<Object, Object> copyEntry(Segment<Object, Object> segment, ReferenceEntry<Object, Object> referenceEntry, ReferenceEntry<Object, Object> referenceEntry2) {
                    ReferenceEntry<Object, Object> copyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2);
                    EntryFactory.copyEvictableEntry(referenceEntry, copyEntry);
                    return copyEntry;
                }

                /* access modifiers changed from: package-private */
                public final <K, V> ReferenceEntry<Object, Object> newEntry(Segment<Object, Object> segment, Object obj, int i, @Nullable ReferenceEntry<Object, Object> referenceEntry) {
                    return new StrongEvictableEntry(obj, i, referenceEntry);
                }
            };
            STRONG_EXPIRABLE_EVICTABLE = new EntryFactory("STRONG_EXPIRABLE_EVICTABLE", 3) {
                /* access modifiers changed from: package-private */
                public final <K, V> ReferenceEntry<Object, Object> copyEntry(Segment<Object, Object> segment, ReferenceEntry<Object, Object> referenceEntry, ReferenceEntry<Object, Object> referenceEntry2) {
                    ReferenceEntry<Object, Object> copyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2);
                    EntryFactory.copyExpirableEntry(referenceEntry, copyEntry);
                    EntryFactory.copyEvictableEntry(referenceEntry, copyEntry);
                    return copyEntry;
                }

                /* access modifiers changed from: package-private */
                public final <K, V> ReferenceEntry<Object, Object> newEntry(Segment<Object, Object> segment, Object obj, int i, @Nullable ReferenceEntry<Object, Object> referenceEntry) {
                    return new StrongExpirableEvictableEntry(obj, i, referenceEntry);
                }
            };
            WEAK = new EntryFactory("WEAK", 4) {
                /* access modifiers changed from: package-private */
                public final <K, V> ReferenceEntry<Object, Object> newEntry(Segment<Object, Object> segment, Object obj, int i, @Nullable ReferenceEntry<Object, Object> referenceEntry) {
                    return new WeakEntry(segment.keyReferenceQueue, obj, i, referenceEntry);
                }
            };
            WEAK_EXPIRABLE = new EntryFactory("WEAK_EXPIRABLE", 5) {
                /* access modifiers changed from: package-private */
                public final <K, V> ReferenceEntry<Object, Object> copyEntry(Segment<Object, Object> segment, ReferenceEntry<Object, Object> referenceEntry, ReferenceEntry<Object, Object> referenceEntry2) {
                    ReferenceEntry<Object, Object> copyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2);
                    EntryFactory.copyExpirableEntry(referenceEntry, copyEntry);
                    return copyEntry;
                }

                /* access modifiers changed from: package-private */
                public final <K, V> ReferenceEntry<Object, Object> newEntry(Segment<Object, Object> segment, Object obj, int i, @Nullable ReferenceEntry<Object, Object> referenceEntry) {
                    return new WeakExpirableEntry(segment.keyReferenceQueue, obj, i, referenceEntry);
                }
            };
            WEAK_EVICTABLE = new EntryFactory("WEAK_EVICTABLE", 6) {
                /* access modifiers changed from: package-private */
                public final <K, V> ReferenceEntry<Object, Object> copyEntry(Segment<Object, Object> segment, ReferenceEntry<Object, Object> referenceEntry, ReferenceEntry<Object, Object> referenceEntry2) {
                    ReferenceEntry<Object, Object> copyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2);
                    EntryFactory.copyEvictableEntry(referenceEntry, copyEntry);
                    return copyEntry;
                }

                /* access modifiers changed from: package-private */
                public final <K, V> ReferenceEntry<Object, Object> newEntry(Segment<Object, Object> segment, Object obj, int i, @Nullable ReferenceEntry<Object, Object> referenceEntry) {
                    return new WeakEvictableEntry(segment.keyReferenceQueue, obj, i, referenceEntry);
                }
            };
            WEAK_EXPIRABLE_EVICTABLE = new EntryFactory("WEAK_EXPIRABLE_EVICTABLE", 7) {
                /* access modifiers changed from: package-private */
                public final <K, V> ReferenceEntry<Object, Object> copyEntry(Segment<Object, Object> segment, ReferenceEntry<Object, Object> referenceEntry, ReferenceEntry<Object, Object> referenceEntry2) {
                    ReferenceEntry<Object, Object> copyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2);
                    EntryFactory.copyExpirableEntry(referenceEntry, copyEntry);
                    EntryFactory.copyEvictableEntry(referenceEntry, copyEntry);
                    return copyEntry;
                }

                /* access modifiers changed from: package-private */
                public final <K, V> ReferenceEntry<Object, Object> newEntry(Segment<Object, Object> segment, Object obj, int i, @Nullable ReferenceEntry<Object, Object> referenceEntry) {
                    return new WeakExpirableEvictableEntry(segment.keyReferenceQueue, obj, i, referenceEntry);
                }
            };
        }

        @GuardedBy("Segment.this")
        static <K, V> void copyEvictableEntry(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            MapMakerInternalMap.connectEvictables(referenceEntry.getPreviousEvictable(), referenceEntry2);
            MapMakerInternalMap.connectEvictables(referenceEntry2, referenceEntry.getNextEvictable());
            MapMakerInternalMap.nullifyEvictable(referenceEntry);
        }

        @GuardedBy("Segment.this")
        static <K, V> void copyExpirableEntry(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            referenceEntry2.setExpirationTime(referenceEntry.getExpirationTime());
            MapMakerInternalMap.connectExpirables(referenceEntry.getPreviousExpirable(), referenceEntry2);
            MapMakerInternalMap.connectExpirables(referenceEntry2, referenceEntry.getNextExpirable());
            MapMakerInternalMap.nullifyExpirable(referenceEntry);
        }

        /* access modifiers changed from: package-private */
        @GuardedBy("Segment.this")
        public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            return newEntry(segment, referenceEntry.getKey(), referenceEntry.getHash(), referenceEntry2);
        }

        /* access modifiers changed from: package-private */
        public abstract <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k, int i, @Nullable ReferenceEntry<K, V> referenceEntry);
    }

    static class Segment<K, V> extends ReentrantLock {
        volatile int count;
        @GuardedBy("Segment.this")
        final Queue<ReferenceEntry<K, V>> evictionQueue;
        @GuardedBy("Segment.this")
        final Queue<ReferenceEntry<K, V>> expirationQueue;
        final ReferenceQueue<K> keyReferenceQueue;
        final MapMakerInternalMap<K, V> map;
        private int maxSegmentSize;
        int modCount;
        final AtomicInteger readCount;
        private Queue<ReferenceEntry<K, V>> recencyQueue;
        volatile AtomicReferenceArray<ReferenceEntry<K, V>> table;
        private int threshold;
        final ReferenceQueue<V> valueReferenceQueue;

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
            r0 = r4.getValueReference();
         */
        @javax.annotation.concurrent.GuardedBy("Segment.this")
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private com.squareup.haha.guava.collect.MapMakerInternalMap.ReferenceEntry<K, V> copyEntry(com.squareup.haha.guava.collect.MapMakerInternalMap.ReferenceEntry<K, V> r4, com.squareup.haha.guava.collect.MapMakerInternalMap.ReferenceEntry<K, V> r5) {
            /*
                r3 = this;
                java.lang.Object r0 = r4.getKey()
                r1 = 0
                if (r0 != 0) goto L_0x0008
                return r1
            L_0x0008:
                com.squareup.haha.guava.collect.MapMakerInternalMap$ValueReference r0 = r4.getValueReference()
                java.lang.Object r2 = r0.get()
                if (r2 != 0) goto L_0x0013
                return r1
            L_0x0013:
                com.squareup.haha.guava.collect.MapMakerInternalMap<K, V> r1 = r3.map
                com.squareup.haha.guava.collect.MapMakerInternalMap$EntryFactory r1 = r1.entryFactory
                com.squareup.haha.guava.collect.MapMakerInternalMap$ReferenceEntry r4 = r1.copyEntry(r3, r4, r5)
                java.lang.ref.ReferenceQueue<V> r5 = r3.valueReferenceQueue
                com.squareup.haha.guava.collect.MapMakerInternalMap$ValueReference r5 = r0.copyFor(r5, r2, r4)
                r4.setValueReference(r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.haha.guava.collect.MapMakerInternalMap.Segment.copyEntry(com.squareup.haha.guava.collect.MapMakerInternalMap$ReferenceEntry, com.squareup.haha.guava.collect.MapMakerInternalMap$ReferenceEntry):com.squareup.haha.guava.collect.MapMakerInternalMap$ReferenceEntry");
        }

        @GuardedBy("Segment.this")
        private void drainRecencyQueue() {
            while (true) {
                ReferenceEntry poll = this.recencyQueue.poll();
                if (poll != null) {
                    if (this.evictionQueue.contains(poll)) {
                        this.evictionQueue.add(poll);
                    }
                    if (this.map.expiresAfterAccess() && this.expirationQueue.contains(poll)) {
                        this.expirationQueue.add(poll);
                    }
                } else {
                    return;
                }
            }
        }

        @GuardedBy("Segment.this")
        private void drainReferenceQueues() {
            int i = 0;
            if (this.map.usesKeyReferences()) {
                int i2 = 0;
                do {
                    Reference<? extends K> poll = this.keyReferenceQueue.poll();
                    if (poll == null) {
                        break;
                    }
                    ReferenceEntry referenceEntry = (ReferenceEntry) poll;
                    MapMakerInternalMap<K, V> mapMakerInternalMap = this.map;
                    int hash = referenceEntry.getHash();
                    mapMakerInternalMap.segmentFor(hash).reclaimKey(referenceEntry, hash);
                    i2++;
                } while (i2 != 16);
            }
            if (this.map.usesValueReferences()) {
                do {
                    Reference<? extends V> poll2 = this.valueReferenceQueue.poll();
                    if (poll2 != null) {
                        ValueReference valueReference = (ValueReference) poll2;
                        MapMakerInternalMap<K, V> mapMakerInternalMap2 = this.map;
                        ReferenceEntry entry = valueReference.getEntry();
                        int hash2 = entry.getHash();
                        mapMakerInternalMap2.segmentFor(hash2).reclaimValue(entry.getKey(), hash2, valueReference);
                        i++;
                    } else {
                        return;
                    }
                } while (i != 16);
            }
        }

        private void enqueueNotification$49a52d44(@Nullable K k, @Nullable V v, MapMaker.RemovalCause removalCause) {
            if (this.map.removalNotificationQueue != MapMakerInternalMap.DISCARDING_QUEUE) {
                this.map.removalNotificationQueue.offer(new MapMaker.RemovalNotification(k, v, removalCause));
            }
        }

        @GuardedBy("Segment.this")
        private boolean evictEntries() {
            if (!(this.map.maximumSize != -1) || this.count < this.maxSegmentSize) {
                return false;
            }
            drainRecencyQueue();
            ReferenceEntry remove = this.evictionQueue.remove();
            if (removeEntry(remove, remove.getHash(), MapMaker.RemovalCause.SIZE)) {
                return true;
            }
            throw new AssertionError();
        }

        @GuardedBy("Segment.this")
        private void expireEntries() {
            ReferenceEntry peek;
            drainRecencyQueue();
            if (!this.expirationQueue.isEmpty()) {
                long read = this.map.ticker.read();
                do {
                    peek = this.expirationQueue.peek();
                    if (peek == null || !MapMakerInternalMap.isExpired(peek, read)) {
                        return;
                    }
                } while (removeEntry(peek, peek.getHash(), MapMaker.RemovalCause.EXPIRED));
                throw new AssertionError();
            }
        }

        private ReferenceEntry<K, V> getEntry(Object obj, int i) {
            if (this.count == 0) {
                return null;
            }
            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
            for (ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i); referenceEntry != null; referenceEntry = referenceEntry.getNext()) {
                if (referenceEntry.getHash() == i) {
                    K key = referenceEntry.getKey();
                    if (key == null) {
                        tryDrainReferenceQueues();
                    } else if (this.map.keyEquivalence.equivalent(obj, key)) {
                        return referenceEntry;
                    }
                }
            }
            return null;
        }

        private ReferenceEntry<K, V> getLiveEntry(Object obj, int i) {
            ReferenceEntry<K, V> entry = getEntry(obj, i);
            if (entry == null) {
                return null;
            }
            if (!this.map.expires() || !this.map.isExpired(entry)) {
                return entry;
            }
            tryExpireEntries();
            return null;
        }

        private static boolean isCollected(ValueReference<K, V> valueReference) {
            return valueReference.get() == null;
        }

        private void recordExpirationTime(ReferenceEntry<K, V> referenceEntry, long j) {
            referenceEntry.setExpirationTime(this.map.ticker.read() + j);
        }

        @GuardedBy("Segment.this")
        private void recordLockedRead(ReferenceEntry<K, V> referenceEntry) {
            this.evictionQueue.add(referenceEntry);
            if (this.map.expiresAfterAccess()) {
                recordExpirationTime(referenceEntry, this.map.expireAfterAccessNanos);
                this.expirationQueue.add(referenceEntry);
            }
        }

        private void removeCollectedEntry(ReferenceEntry<K, V> referenceEntry) {
            enqueueNotification(referenceEntry, MapMaker.RemovalCause.COLLECTED);
            this.evictionQueue.remove(referenceEntry);
            this.expirationQueue.remove(referenceEntry);
        }

        @GuardedBy("Segment.this")
        private boolean removeEntry(ReferenceEntry<K, V> referenceEntry, int i, MapMaker.RemovalCause removalCause) {
            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
            int length = i & (atomicReferenceArray.length() - 1);
            ReferenceEntry<K, V> referenceEntry2 = atomicReferenceArray.get(length);
            for (ReferenceEntry<K, V> referenceEntry3 = referenceEntry2; referenceEntry3 != null; referenceEntry3 = referenceEntry3.getNext()) {
                if (referenceEntry3 == referenceEntry) {
                    this.modCount++;
                    enqueueNotification$49a52d44(referenceEntry3.getKey(), referenceEntry3.getValueReference().get(), removalCause);
                    atomicReferenceArray.set(length, removeFromChain(referenceEntry2, referenceEntry3));
                    this.count--;
                    return true;
                }
            }
            return false;
        }

        @GuardedBy("Segment.this")
        private ReferenceEntry<K, V> removeFromChain(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            this.evictionQueue.remove(referenceEntry2);
            this.expirationQueue.remove(referenceEntry2);
            int i = this.count;
            ReferenceEntry<K, V> next = referenceEntry2.getNext();
            while (referenceEntry != referenceEntry2) {
                ReferenceEntry<K, V> copyEntry = copyEntry(referenceEntry, next);
                if (copyEntry != null) {
                    next = copyEntry;
                } else {
                    removeCollectedEntry(referenceEntry);
                    i--;
                }
                referenceEntry = referenceEntry.getNext();
            }
            this.count = i;
            return next;
        }

        private void runLockedCleanup() {
            if (tryLock()) {
                try {
                    drainReferenceQueues();
                    expireEntries();
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }

        @GuardedBy("Segment.this")
        private void setValue(ReferenceEntry<K, V> referenceEntry, V v) {
            referenceEntry.setValueReference(this.map.valueStrength.referenceValue(this, referenceEntry, v));
            drainRecencyQueue();
            this.evictionQueue.add(referenceEntry);
            if (this.map.expires()) {
                recordExpirationTime(referenceEntry, this.map.expiresAfterAccess() ? this.map.expireAfterAccessNanos : this.map.expireAfterWriteNanos);
                this.expirationQueue.add(referenceEntry);
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean containsKey(Object obj, int i) {
            try {
                boolean z = false;
                if (this.count != 0) {
                    ReferenceEntry liveEntry = getLiveEntry(obj, i);
                    if (liveEntry == null) {
                        return false;
                    }
                    if (liveEntry.getValueReference().get() != null) {
                        z = true;
                    }
                    postReadCleanup();
                    return z;
                }
                postReadCleanup();
                return false;
            } finally {
                postReadCleanup();
            }
        }

        /* access modifiers changed from: package-private */
        public final void enqueueNotification(ReferenceEntry<K, V> referenceEntry, MapMaker.RemovalCause removalCause) {
            enqueueNotification$49a52d44(referenceEntry.getKey(), referenceEntry.getValueReference().get(), removalCause);
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        public final V get(Object obj, int i) {
            try {
                ReferenceEntry liveEntry = getLiveEntry(obj, i);
                if (liveEntry == null) {
                    postReadCleanup();
                    return null;
                }
                V v = liveEntry.getValueReference().get();
                if (v != null) {
                    if (this.map.expiresAfterAccess()) {
                        recordExpirationTime(liveEntry, this.map.expireAfterAccessNanos);
                    }
                    this.recencyQueue.add(liveEntry);
                } else {
                    tryDrainReferenceQueues();
                }
                postReadCleanup();
                return v;
            } catch (Throwable th) {
                postReadCleanup();
                throw th;
            }
        }

        /* access modifiers changed from: package-private */
        public final void postReadCleanup() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                runLockedCleanup();
                runUnlockedCleanup();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b4, code lost:
            r13 = r4.getValueReference().get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bc, code lost:
            if (r13 != null) goto L_0x00d7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00be, code lost:
            r11.modCount++;
            setValue(r4, r14);
            enqueueNotification$49a52d44(r12, r13, com.squareup.haha.guava.collect.MapMaker.RemovalCause.COLLECTED);
            r11.count = r11.count;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d7, code lost:
            if (r15 == false) goto L_0x00e3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
            recordLockedRead(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dc, code lost:
            unlock();
            runUnlockedCleanup();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e2, code lost:
            return r13;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
            r11.modCount++;
            enqueueNotification$49a52d44(r12, r13, com.squareup.haha.guava.collect.MapMaker.RemovalCause.REPLACED);
            setValue(r4, r14);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final V put(K r12, int r13, V r14, boolean r15) {
            /*
                r11 = this;
                r11.lock()
                r11.runLockedCleanup()     // Catch:{ all -> 0x0118 }
                int r0 = r11.count     // Catch:{ all -> 0x0118 }
                int r0 = r0 + 1
                int r1 = r11.threshold     // Catch:{ all -> 0x0118 }
                if (r0 <= r1) goto L_0x008b
                java.util.concurrent.atomic.AtomicReferenceArray<com.squareup.haha.guava.collect.MapMakerInternalMap$ReferenceEntry<K, V>> r0 = r11.table     // Catch:{ all -> 0x0118 }
                int r1 = r0.length()     // Catch:{ all -> 0x0118 }
                r2 = 1073741824(0x40000000, float:2.0)
                if (r1 >= r2) goto L_0x0087
                int r2 = r11.count     // Catch:{ all -> 0x0118 }
                int r3 = r1 << 1
                java.util.concurrent.atomic.AtomicReferenceArray r4 = new java.util.concurrent.atomic.AtomicReferenceArray     // Catch:{ all -> 0x0118 }
                r4.<init>(r3)     // Catch:{ all -> 0x0118 }
                int r3 = r4.length()     // Catch:{ all -> 0x0118 }
                int r3 = r3 * 3
                int r3 = r3 / 4
                r11.threshold = r3     // Catch:{ all -> 0x0118 }
                int r3 = r4.length()     // Catch:{ all -> 0x0118 }
                int r3 = r3 + -1
                r5 = 0
            L_0x0032:
                if (r5 >= r1) goto L_0x0083
                java.lang.Object r6 = r0.get(r5)     // Catch:{ all -> 0x0118 }
                com.squareup.haha.guava.collect.MapMakerInternalMap$ReferenceEntry r6 = (com.squareup.haha.guava.collect.MapMakerInternalMap.ReferenceEntry) r6     // Catch:{ all -> 0x0118 }
                if (r6 == 0) goto L_0x0080
                com.squareup.haha.guava.collect.MapMakerInternalMap$ReferenceEntry r7 = r6.getNext()     // Catch:{ all -> 0x0118 }
                int r8 = r6.getHash()     // Catch:{ all -> 0x0118 }
                r8 = r8 & r3
                if (r7 != 0) goto L_0x004b
                r4.set(r8, r6)     // Catch:{ all -> 0x0118 }
                goto L_0x0080
            L_0x004b:
                r9 = r6
            L_0x004c:
                if (r7 == 0) goto L_0x005c
                int r10 = r7.getHash()     // Catch:{ all -> 0x0118 }
                r10 = r10 & r3
                if (r10 == r8) goto L_0x0057
                r9 = r7
                r8 = r10
            L_0x0057:
                com.squareup.haha.guava.collect.MapMakerInternalMap$ReferenceEntry r7 = r7.getNext()     // Catch:{ all -> 0x0118 }
                goto L_0x004c
            L_0x005c:
                r4.set(r8, r9)     // Catch:{ all -> 0x0118 }
            L_0x005f:
                if (r6 == r9) goto L_0x0080
                int r7 = r6.getHash()     // Catch:{ all -> 0x0118 }
                r7 = r7 & r3
                java.lang.Object r8 = r4.get(r7)     // Catch:{ all -> 0x0118 }
                com.squareup.haha.guava.collect.MapMakerInternalMap$ReferenceEntry r8 = (com.squareup.haha.guava.collect.MapMakerInternalMap.ReferenceEntry) r8     // Catch:{ all -> 0x0118 }
                com.squareup.haha.guava.collect.MapMakerInternalMap$ReferenceEntry r8 = r11.copyEntry(r6, r8)     // Catch:{ all -> 0x0118 }
                if (r8 == 0) goto L_0x0076
                r4.set(r7, r8)     // Catch:{ all -> 0x0118 }
                goto L_0x007b
            L_0x0076:
                r11.removeCollectedEntry(r6)     // Catch:{ all -> 0x0118 }
                int r2 = r2 + -1
            L_0x007b:
                com.squareup.haha.guava.collect.MapMakerInternalMap$ReferenceEntry r6 = r6.getNext()     // Catch:{ all -> 0x0118 }
                goto L_0x005f
            L_0x0080:
                int r5 = r5 + 1
                goto L_0x0032
            L_0x0083:
                r11.table = r4     // Catch:{ all -> 0x0118 }
                r11.count = r2     // Catch:{ all -> 0x0118 }
            L_0x0087:
                int r0 = r11.count     // Catch:{ all -> 0x0118 }
                int r0 = r0 + 1
            L_0x008b:
                java.util.concurrent.atomic.AtomicReferenceArray<com.squareup.haha.guava.collect.MapMakerInternalMap$ReferenceEntry<K, V>> r1 = r11.table     // Catch:{ all -> 0x0118 }
                int r2 = r1.length()     // Catch:{ all -> 0x0118 }
                int r2 = r2 + -1
                r2 = r2 & r13
                java.lang.Object r3 = r1.get(r2)     // Catch:{ all -> 0x0118 }
                com.squareup.haha.guava.collect.MapMakerInternalMap$ReferenceEntry r3 = (com.squareup.haha.guava.collect.MapMakerInternalMap.ReferenceEntry) r3     // Catch:{ all -> 0x0118 }
                r4 = r3
            L_0x009b:
                r5 = 0
                if (r4 == 0) goto L_0x00f7
                java.lang.Object r6 = r4.getKey()     // Catch:{ all -> 0x0118 }
                int r7 = r4.getHash()     // Catch:{ all -> 0x0118 }
                if (r7 != r13) goto L_0x00f2
                if (r6 == 0) goto L_0x00f2
                com.squareup.haha.guava.collect.MapMakerInternalMap<K, V> r7 = r11.map     // Catch:{ all -> 0x0118 }
                com.squareup.haha.guava.base.Equivalence<java.lang.Object> r7 = r7.keyEquivalence     // Catch:{ all -> 0x0118 }
                boolean r6 = r7.equivalent(r12, r6)     // Catch:{ all -> 0x0118 }
                if (r6 == 0) goto L_0x00f2
                com.squareup.haha.guava.collect.MapMakerInternalMap$ValueReference r13 = r4.getValueReference()     // Catch:{ all -> 0x0118 }
                java.lang.Object r13 = r13.get()     // Catch:{ all -> 0x0118 }
                if (r13 != 0) goto L_0x00d7
                int r15 = r11.modCount     // Catch:{ all -> 0x0118 }
                int r15 = r15 + 1
                r11.modCount = r15     // Catch:{ all -> 0x0118 }
                r11.setValue(r4, r14)     // Catch:{ all -> 0x0118 }
                com.squareup.haha.guava.collect.MapMaker$RemovalCause r14 = com.squareup.haha.guava.collect.MapMaker.RemovalCause.COLLECTED     // Catch:{ all -> 0x0118 }
                r11.enqueueNotification$49a52d44(r12, r13, r14)     // Catch:{ all -> 0x0118 }
                int r12 = r11.count     // Catch:{ all -> 0x0118 }
                r11.count = r12     // Catch:{ all -> 0x0118 }
            L_0x00d0:
                r11.unlock()
                r11.runUnlockedCleanup()
                return r5
            L_0x00d7:
                if (r15 == 0) goto L_0x00e3
                r11.recordLockedRead(r4)     // Catch:{ all -> 0x0118 }
            L_0x00dc:
                r11.unlock()
                r11.runUnlockedCleanup()
                return r13
            L_0x00e3:
                int r15 = r11.modCount     // Catch:{ all -> 0x0118 }
                int r15 = r15 + 1
                r11.modCount = r15     // Catch:{ all -> 0x0118 }
                com.squareup.haha.guava.collect.MapMaker$RemovalCause r15 = com.squareup.haha.guava.collect.MapMaker.RemovalCause.REPLACED     // Catch:{ all -> 0x0118 }
                r11.enqueueNotification$49a52d44(r12, r13, r15)     // Catch:{ all -> 0x0118 }
                r11.setValue(r4, r14)     // Catch:{ all -> 0x0118 }
                goto L_0x00dc
            L_0x00f2:
                com.squareup.haha.guava.collect.MapMakerInternalMap$ReferenceEntry r4 = r4.getNext()     // Catch:{ all -> 0x0118 }
                goto L_0x009b
            L_0x00f7:
                int r15 = r11.modCount     // Catch:{ all -> 0x0118 }
                int r15 = r15 + 1
                r11.modCount = r15     // Catch:{ all -> 0x0118 }
                com.squareup.haha.guava.collect.MapMakerInternalMap<K, V> r15 = r11.map     // Catch:{ all -> 0x0118 }
                com.squareup.haha.guava.collect.MapMakerInternalMap$EntryFactory r15 = r15.entryFactory     // Catch:{ all -> 0x0118 }
                com.squareup.haha.guava.collect.MapMakerInternalMap$ReferenceEntry r12 = r15.newEntry(r11, r12, r13, r3)     // Catch:{ all -> 0x0118 }
                r11.setValue(r12, r14)     // Catch:{ all -> 0x0118 }
                r1.set(r2, r12)     // Catch:{ all -> 0x0118 }
                boolean r12 = r11.evictEntries()     // Catch:{ all -> 0x0118 }
                if (r12 == 0) goto L_0x0115
                int r12 = r11.count     // Catch:{ all -> 0x0118 }
                int r0 = r12 + 1
            L_0x0115:
                r11.count = r0     // Catch:{ all -> 0x0118 }
                goto L_0x00d0
            L_0x0118:
                r12 = move-exception
                r11.unlock()
                r11.runUnlockedCleanup()
                goto L_0x0121
            L_0x0120:
                throw r12
            L_0x0121:
                goto L_0x0120
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.haha.guava.collect.MapMakerInternalMap.Segment.put(java.lang.Object, int, java.lang.Object, boolean):java.lang.Object");
        }

        /* access modifiers changed from: package-private */
        public final boolean reclaimKey(ReferenceEntry<K, V> referenceEntry, int i) {
            lock();
            try {
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = i & (atomicReferenceArray.length() - 1);
                ReferenceEntry<K, V> referenceEntry2 = atomicReferenceArray.get(length);
                for (ReferenceEntry<K, V> referenceEntry3 = referenceEntry2; referenceEntry3 != null; referenceEntry3 = referenceEntry3.getNext()) {
                    if (referenceEntry3 == referenceEntry) {
                        this.modCount++;
                        enqueueNotification$49a52d44(referenceEntry3.getKey(), referenceEntry3.getValueReference().get(), MapMaker.RemovalCause.COLLECTED);
                        atomicReferenceArray.set(length, removeFromChain(referenceEntry2, referenceEntry3));
                        this.count--;
                        return true;
                    }
                }
                unlock();
                runUnlockedCleanup();
                return false;
            } finally {
                unlock();
                runUnlockedCleanup();
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean reclaimValue(K k, int i, ValueReference<K, V> valueReference) {
            lock();
            try {
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                ReferenceEntry referenceEntry = atomicReferenceArray.get(length);
                ReferenceEntry referenceEntry2 = referenceEntry;
                while (referenceEntry2 != null) {
                    Object key = referenceEntry2.getKey();
                    if (referenceEntry2.getHash() != i || key == null || !this.map.keyEquivalence.equivalent(k, key)) {
                        referenceEntry2 = referenceEntry2.getNext();
                    } else if (referenceEntry2.getValueReference() == valueReference) {
                        this.modCount++;
                        enqueueNotification$49a52d44(k, valueReference.get(), MapMaker.RemovalCause.COLLECTED);
                        atomicReferenceArray.set(length, removeFromChain(referenceEntry, referenceEntry2));
                        this.count--;
                        return true;
                    } else {
                        unlock();
                        if (!isHeldByCurrentThread()) {
                            runUnlockedCleanup();
                        }
                        return false;
                    }
                }
                unlock();
                if (!isHeldByCurrentThread()) {
                    runUnlockedCleanup();
                }
                return false;
            } finally {
                unlock();
                if (!isHeldByCurrentThread()) {
                    runUnlockedCleanup();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final V remove(Object obj, int i) {
            MapMaker.RemovalCause removalCause;
            lock();
            try {
                runLockedCleanup();
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                ReferenceEntry referenceEntry = atomicReferenceArray.get(length);
                ReferenceEntry referenceEntry2 = referenceEntry;
                while (true) {
                    if (referenceEntry2 == null) {
                        break;
                    }
                    Object key = referenceEntry2.getKey();
                    if (referenceEntry2.getHash() != i || key == null || !this.map.keyEquivalence.equivalent(obj, key)) {
                        referenceEntry2 = referenceEntry2.getNext();
                    } else {
                        ValueReference valueReference = referenceEntry2.getValueReference();
                        V v = valueReference.get();
                        if (v != null) {
                            removalCause = MapMaker.RemovalCause.EXPLICIT;
                        } else if (isCollected(valueReference)) {
                            removalCause = MapMaker.RemovalCause.COLLECTED;
                        }
                        this.modCount++;
                        enqueueNotification$49a52d44(key, v, removalCause);
                        atomicReferenceArray.set(length, removeFromChain(referenceEntry, referenceEntry2));
                        this.count--;
                        return v;
                    }
                }
                unlock();
                runUnlockedCleanup();
                return null;
            } finally {
                unlock();
                runUnlockedCleanup();
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean remove(Object obj, int i, Object obj2) {
            MapMaker.RemovalCause removalCause;
            lock();
            try {
                runLockedCleanup();
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                boolean z = true;
                int length = (atomicReferenceArray.length() - 1) & i;
                ReferenceEntry referenceEntry = atomicReferenceArray.get(length);
                ReferenceEntry referenceEntry2 = referenceEntry;
                while (true) {
                    if (referenceEntry2 == null) {
                        break;
                    }
                    Object key = referenceEntry2.getKey();
                    if (referenceEntry2.getHash() != i || key == null || !this.map.keyEquivalence.equivalent(obj, key)) {
                        referenceEntry2 = referenceEntry2.getNext();
                    } else {
                        ValueReference valueReference = referenceEntry2.getValueReference();
                        Object obj3 = valueReference.get();
                        if (this.map.valueEquivalence.equivalent(obj2, obj3)) {
                            removalCause = MapMaker.RemovalCause.EXPLICIT;
                        } else if (isCollected(valueReference)) {
                            removalCause = MapMaker.RemovalCause.COLLECTED;
                        }
                        this.modCount++;
                        enqueueNotification$49a52d44(key, obj3, removalCause);
                        atomicReferenceArray.set(length, removeFromChain(referenceEntry, referenceEntry2));
                        this.count--;
                        if (removalCause != MapMaker.RemovalCause.EXPLICIT) {
                            z = false;
                        }
                        return z;
                    }
                }
                unlock();
                runUnlockedCleanup();
                return false;
            } finally {
                unlock();
                runUnlockedCleanup();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
            r9 = r3.getValueReference();
            r6 = r9.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
            if (r6 != null) goto L_0x005e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
            if (isCollected(r9) == false) goto L_0x0057;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
            r7.modCount++;
            enqueueNotification$49a52d44(r5, r6, com.squareup.haha.guava.collect.MapMaker.RemovalCause.COLLECTED);
            r0.set(r1, removeFromChain(r2, r3));
            r7.count--;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            r7.modCount++;
            enqueueNotification$49a52d44(r8, r6, com.squareup.haha.guava.collect.MapMaker.RemovalCause.REPLACED);
            setValue(r3, r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
            unlock();
            runUnlockedCleanup();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
            return r6;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final V replace(K r8, int r9, V r10) {
            /*
                r7 = this;
                r7.lock()
                r7.runLockedCleanup()     // Catch:{ all -> 0x0078 }
                java.util.concurrent.atomic.AtomicReferenceArray<com.squareup.haha.guava.collect.MapMakerInternalMap$ReferenceEntry<K, V>> r0 = r7.table     // Catch:{ all -> 0x0078 }
                int r1 = r0.length()     // Catch:{ all -> 0x0078 }
                int r1 = r1 + -1
                r1 = r1 & r9
                java.lang.Object r2 = r0.get(r1)     // Catch:{ all -> 0x0078 }
                com.squareup.haha.guava.collect.MapMakerInternalMap$ReferenceEntry r2 = (com.squareup.haha.guava.collect.MapMakerInternalMap.ReferenceEntry) r2     // Catch:{ all -> 0x0078 }
                r3 = r2
            L_0x0016:
                r4 = 0
                if (r3 == 0) goto L_0x0057
                java.lang.Object r5 = r3.getKey()     // Catch:{ all -> 0x0078 }
                int r6 = r3.getHash()     // Catch:{ all -> 0x0078 }
                if (r6 != r9) goto L_0x0073
                if (r5 == 0) goto L_0x0073
                com.squareup.haha.guava.collect.MapMakerInternalMap<K, V> r6 = r7.map     // Catch:{ all -> 0x0078 }
                com.squareup.haha.guava.base.Equivalence<java.lang.Object> r6 = r6.keyEquivalence     // Catch:{ all -> 0x0078 }
                boolean r6 = r6.equivalent(r8, r5)     // Catch:{ all -> 0x0078 }
                if (r6 == 0) goto L_0x0073
                com.squareup.haha.guava.collect.MapMakerInternalMap$ValueReference r9 = r3.getValueReference()     // Catch:{ all -> 0x0078 }
                java.lang.Object r6 = r9.get()     // Catch:{ all -> 0x0078 }
                if (r6 != 0) goto L_0x005e
                boolean r8 = isCollected(r9)     // Catch:{ all -> 0x0078 }
                if (r8 == 0) goto L_0x0057
                int r8 = r7.modCount     // Catch:{ all -> 0x0078 }
                int r8 = r8 + 1
                r7.modCount = r8     // Catch:{ all -> 0x0078 }
                com.squareup.haha.guava.collect.MapMaker$RemovalCause r8 = com.squareup.haha.guava.collect.MapMaker.RemovalCause.COLLECTED     // Catch:{ all -> 0x0078 }
                r7.enqueueNotification$49a52d44(r5, r6, r8)     // Catch:{ all -> 0x0078 }
                com.squareup.haha.guava.collect.MapMakerInternalMap$ReferenceEntry r8 = r7.removeFromChain(r2, r3)     // Catch:{ all -> 0x0078 }
                int r9 = r7.count     // Catch:{ all -> 0x0078 }
                int r9 = r9 + -1
                r0.set(r1, r8)     // Catch:{ all -> 0x0078 }
                r7.count = r9     // Catch:{ all -> 0x0078 }
            L_0x0057:
                r7.unlock()
                r7.runUnlockedCleanup()
                return r4
            L_0x005e:
                int r9 = r7.modCount     // Catch:{ all -> 0x0078 }
                int r9 = r9 + 1
                r7.modCount = r9     // Catch:{ all -> 0x0078 }
                com.squareup.haha.guava.collect.MapMaker$RemovalCause r9 = com.squareup.haha.guava.collect.MapMaker.RemovalCause.REPLACED     // Catch:{ all -> 0x0078 }
                r7.enqueueNotification$49a52d44(r8, r6, r9)     // Catch:{ all -> 0x0078 }
                r7.setValue(r3, r10)     // Catch:{ all -> 0x0078 }
                r7.unlock()
                r7.runUnlockedCleanup()
                return r6
            L_0x0073:
                com.squareup.haha.guava.collect.MapMakerInternalMap$ReferenceEntry r3 = r3.getNext()     // Catch:{ all -> 0x0078 }
                goto L_0x0016
            L_0x0078:
                r8 = move-exception
                r7.unlock()
                r7.runUnlockedCleanup()
                goto L_0x0081
            L_0x0080:
                throw r8
            L_0x0081:
                goto L_0x0080
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.haha.guava.collect.MapMakerInternalMap.Segment.replace(java.lang.Object, int, java.lang.Object):java.lang.Object");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
            r10 = r4.getValueReference();
            r7 = r10.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
            if (r7 != null) goto L_0x005c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
            if (isCollected(r10) == false) goto L_0x0055;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
            r8.modCount++;
            enqueueNotification$49a52d44(r6, r7, com.squareup.haha.guava.collect.MapMaker.RemovalCause.COLLECTED);
            r0.set(r1, removeFromChain(r3, r4));
            r8.count--;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
            if (r8.map.valueEquivalence.equivalent(r11, r7) == false) goto L_0x007a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0066, code lost:
            r8.modCount++;
            enqueueNotification$49a52d44(r9, r7, com.squareup.haha.guava.collect.MapMaker.RemovalCause.REPLACED);
            setValue(r4, r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
            unlock();
            runUnlockedCleanup();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            recordLockedRead(r4);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean replace(K r9, int r10, V r11, V r12) {
            /*
                r8 = this;
                r8.lock()
                r8.runLockedCleanup()     // Catch:{ all -> 0x0083 }
                java.util.concurrent.atomic.AtomicReferenceArray<com.squareup.haha.guava.collect.MapMakerInternalMap$ReferenceEntry<K, V>> r0 = r8.table     // Catch:{ all -> 0x0083 }
                int r1 = r0.length()     // Catch:{ all -> 0x0083 }
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r10
                java.lang.Object r3 = r0.get(r1)     // Catch:{ all -> 0x0083 }
                com.squareup.haha.guava.collect.MapMakerInternalMap$ReferenceEntry r3 = (com.squareup.haha.guava.collect.MapMakerInternalMap.ReferenceEntry) r3     // Catch:{ all -> 0x0083 }
                r4 = r3
            L_0x0016:
                r5 = 0
                if (r4 == 0) goto L_0x0055
                java.lang.Object r6 = r4.getKey()     // Catch:{ all -> 0x0083 }
                int r7 = r4.getHash()     // Catch:{ all -> 0x0083 }
                if (r7 != r10) goto L_0x007e
                if (r6 == 0) goto L_0x007e
                com.squareup.haha.guava.collect.MapMakerInternalMap<K, V> r7 = r8.map     // Catch:{ all -> 0x0083 }
                com.squareup.haha.guava.base.Equivalence<java.lang.Object> r7 = r7.keyEquivalence     // Catch:{ all -> 0x0083 }
                boolean r7 = r7.equivalent(r9, r6)     // Catch:{ all -> 0x0083 }
                if (r7 == 0) goto L_0x007e
                com.squareup.haha.guava.collect.MapMakerInternalMap$ValueReference r10 = r4.getValueReference()     // Catch:{ all -> 0x0083 }
                java.lang.Object r7 = r10.get()     // Catch:{ all -> 0x0083 }
                if (r7 != 0) goto L_0x005c
                boolean r9 = isCollected(r10)     // Catch:{ all -> 0x0083 }
                if (r9 == 0) goto L_0x0055
                int r9 = r8.modCount     // Catch:{ all -> 0x0083 }
                int r9 = r9 + r2
                r8.modCount = r9     // Catch:{ all -> 0x0083 }
                com.squareup.haha.guava.collect.MapMaker$RemovalCause r9 = com.squareup.haha.guava.collect.MapMaker.RemovalCause.COLLECTED     // Catch:{ all -> 0x0083 }
                r8.enqueueNotification$49a52d44(r6, r7, r9)     // Catch:{ all -> 0x0083 }
                com.squareup.haha.guava.collect.MapMakerInternalMap$ReferenceEntry r9 = r8.removeFromChain(r3, r4)     // Catch:{ all -> 0x0083 }
                int r10 = r8.count     // Catch:{ all -> 0x0083 }
                int r10 = r10 - r2
                r0.set(r1, r9)     // Catch:{ all -> 0x0083 }
                r8.count = r10     // Catch:{ all -> 0x0083 }
            L_0x0055:
                r8.unlock()
                r8.runUnlockedCleanup()
                return r5
            L_0x005c:
                com.squareup.haha.guava.collect.MapMakerInternalMap<K, V> r10 = r8.map     // Catch:{ all -> 0x0083 }
                com.squareup.haha.guava.base.Equivalence<java.lang.Object> r10 = r10.valueEquivalence     // Catch:{ all -> 0x0083 }
                boolean r10 = r10.equivalent(r11, r7)     // Catch:{ all -> 0x0083 }
                if (r10 == 0) goto L_0x007a
                int r10 = r8.modCount     // Catch:{ all -> 0x0083 }
                int r10 = r10 + r2
                r8.modCount = r10     // Catch:{ all -> 0x0083 }
                com.squareup.haha.guava.collect.MapMaker$RemovalCause r10 = com.squareup.haha.guava.collect.MapMaker.RemovalCause.REPLACED     // Catch:{ all -> 0x0083 }
                r8.enqueueNotification$49a52d44(r9, r7, r10)     // Catch:{ all -> 0x0083 }
                r8.setValue(r4, r12)     // Catch:{ all -> 0x0083 }
                r8.unlock()
                r8.runUnlockedCleanup()
                return r2
            L_0x007a:
                r8.recordLockedRead(r4)     // Catch:{ all -> 0x0083 }
                goto L_0x0055
            L_0x007e:
                com.squareup.haha.guava.collect.MapMakerInternalMap$ReferenceEntry r4 = r4.getNext()     // Catch:{ all -> 0x0083 }
                goto L_0x0016
            L_0x0083:
                r9 = move-exception
                r8.unlock()
                r8.runUnlockedCleanup()
                goto L_0x008c
            L_0x008b:
                throw r9
            L_0x008c:
                goto L_0x008b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.haha.guava.collect.MapMakerInternalMap.Segment.replace(java.lang.Object, int, java.lang.Object, java.lang.Object):boolean");
        }

        /* access modifiers changed from: package-private */
        public final void runUnlockedCleanup() {
            if (!isHeldByCurrentThread()) {
                do {
                } while (this.map.removalNotificationQueue.poll() != null);
            }
        }

        /* access modifiers changed from: package-private */
        public final void tryDrainReferenceQueues() {
            if (tryLock()) {
                try {
                    drainReferenceQueues();
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void tryExpireEntries() {
            if (tryLock()) {
                try {
                    expireEntries();
                } finally {
                    unlock();
                }
            }
        }
    }

    static class StrongEntry<K, V> implements ReferenceEntry<K, V> {
        private int hash;
        private K key;
        private ReferenceEntry<K, V> next;
        private volatile ValueReference<K, V> valueReference = MapMakerInternalMap.unset();

        StrongEntry(K k, int i, @Nullable ReferenceEntry<K, V> referenceEntry) {
            this.key = k;
            this.hash = i;
            this.next = referenceEntry;
        }

        public long getExpirationTime() {
            throw new UnsupportedOperationException();
        }

        public final int getHash() {
            return this.hash;
        }

        public final K getKey() {
            return this.key;
        }

        public final ReferenceEntry<K, V> getNext() {
            return this.next;
        }

        public ReferenceEntry<K, V> getNextEvictable() {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getNextExpirable() {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getPreviousEvictable() {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getPreviousExpirable() {
            throw new UnsupportedOperationException();
        }

        public final ValueReference<K, V> getValueReference() {
            return this.valueReference;
        }

        public void setExpirationTime(long j) {
            throw new UnsupportedOperationException();
        }

        public void setNextEvictable(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void setNextExpirable(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousEvictable(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousExpirable(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public final void setValueReference(ValueReference<K, V> valueReference2) {
            ValueReference<K, V> valueReference3 = this.valueReference;
            this.valueReference = valueReference2;
            valueReference3.clear$5ca9f1d3();
        }
    }

    static final class StrongEvictableEntry<K, V> extends StrongEntry<K, V> {
        @GuardedBy("Segment.this")
        private ReferenceEntry<K, V> nextEvictable = MapMakerInternalMap.nullEntry();
        @GuardedBy("Segment.this")
        private ReferenceEntry<K, V> previousEvictable = MapMakerInternalMap.nullEntry();

        StrongEvictableEntry(K k, int i, @Nullable ReferenceEntry<K, V> referenceEntry) {
            super(k, i, referenceEntry);
        }

        public final ReferenceEntry<K, V> getNextEvictable() {
            return this.nextEvictable;
        }

        public final ReferenceEntry<K, V> getPreviousEvictable() {
            return this.previousEvictable;
        }

        public final void setNextEvictable(ReferenceEntry<K, V> referenceEntry) {
            this.nextEvictable = referenceEntry;
        }

        public final void setPreviousEvictable(ReferenceEntry<K, V> referenceEntry) {
            this.previousEvictable = referenceEntry;
        }
    }

    static final class StrongExpirableEntry<K, V> extends StrongEntry<K, V> {
        @GuardedBy("Segment.this")
        private ReferenceEntry<K, V> nextExpirable = MapMakerInternalMap.nullEntry();
        @GuardedBy("Segment.this")
        private ReferenceEntry<K, V> previousExpirable = MapMakerInternalMap.nullEntry();
        private volatile long time = LocationRequestCompat.PASSIVE_INTERVAL;

        StrongExpirableEntry(K k, int i, @Nullable ReferenceEntry<K, V> referenceEntry) {
            super(k, i, referenceEntry);
        }

        public final long getExpirationTime() {
            return this.time;
        }

        public final ReferenceEntry<K, V> getNextExpirable() {
            return this.nextExpirable;
        }

        public final ReferenceEntry<K, V> getPreviousExpirable() {
            return this.previousExpirable;
        }

        public final void setExpirationTime(long j) {
            this.time = j;
        }

        public final void setNextExpirable(ReferenceEntry<K, V> referenceEntry) {
            this.nextExpirable = referenceEntry;
        }

        public final void setPreviousExpirable(ReferenceEntry<K, V> referenceEntry) {
            this.previousExpirable = referenceEntry;
        }
    }

    static final class StrongExpirableEvictableEntry<K, V> extends StrongEntry<K, V> {
        @GuardedBy("Segment.this")
        private ReferenceEntry<K, V> nextEvictable = MapMakerInternalMap.nullEntry();
        @GuardedBy("Segment.this")
        private ReferenceEntry<K, V> nextExpirable = MapMakerInternalMap.nullEntry();
        @GuardedBy("Segment.this")
        private ReferenceEntry<K, V> previousEvictable = MapMakerInternalMap.nullEntry();
        @GuardedBy("Segment.this")
        private ReferenceEntry<K, V> previousExpirable = MapMakerInternalMap.nullEntry();
        private volatile long time = LocationRequestCompat.PASSIVE_INTERVAL;

        StrongExpirableEvictableEntry(K k, int i, @Nullable ReferenceEntry<K, V> referenceEntry) {
            super(k, i, referenceEntry);
        }

        public final long getExpirationTime() {
            return this.time;
        }

        public final ReferenceEntry<K, V> getNextEvictable() {
            return this.nextEvictable;
        }

        public final ReferenceEntry<K, V> getNextExpirable() {
            return this.nextExpirable;
        }

        public final ReferenceEntry<K, V> getPreviousEvictable() {
            return this.previousEvictable;
        }

        public final ReferenceEntry<K, V> getPreviousExpirable() {
            return this.previousExpirable;
        }

        public final void setExpirationTime(long j) {
            this.time = j;
        }

        public final void setNextEvictable(ReferenceEntry<K, V> referenceEntry) {
            this.nextEvictable = referenceEntry;
        }

        public final void setNextExpirable(ReferenceEntry<K, V> referenceEntry) {
            this.nextExpirable = referenceEntry;
        }

        public final void setPreviousEvictable(ReferenceEntry<K, V> referenceEntry) {
            this.previousEvictable = referenceEntry;
        }

        public final void setPreviousExpirable(ReferenceEntry<K, V> referenceEntry) {
            this.previousExpirable = referenceEntry;
        }
    }

    interface ValueReference<K, V> {
        void clear$5ca9f1d3();

        ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, @Nullable V v, ReferenceEntry<K, V> referenceEntry);

        V get();

        ReferenceEntry<K, V> getEntry();
    }

    static class WeakEntry<K, V> extends WeakReference<K> implements ReferenceEntry<K, V> {
        private int hash;
        private ReferenceEntry<K, V> next;
        private volatile ValueReference<K, V> valueReference = MapMakerInternalMap.unset();

        WeakEntry(ReferenceQueue<K> referenceQueue, K k, int i, @Nullable ReferenceEntry<K, V> referenceEntry) {
            super(k, referenceQueue);
            this.hash = i;
            this.next = referenceEntry;
        }

        public long getExpirationTime() {
            throw new UnsupportedOperationException();
        }

        public final int getHash() {
            return this.hash;
        }

        public final K getKey() {
            return get();
        }

        public final ReferenceEntry<K, V> getNext() {
            return this.next;
        }

        public ReferenceEntry<K, V> getNextEvictable() {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getNextExpirable() {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getPreviousEvictable() {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getPreviousExpirable() {
            throw new UnsupportedOperationException();
        }

        public final ValueReference<K, V> getValueReference() {
            return this.valueReference;
        }

        public void setExpirationTime(long j) {
            throw new UnsupportedOperationException();
        }

        public void setNextEvictable(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void setNextExpirable(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousEvictable(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousExpirable(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public final void setValueReference(ValueReference<K, V> valueReference2) {
            ValueReference<K, V> valueReference3 = this.valueReference;
            this.valueReference = valueReference2;
            valueReference3.clear$5ca9f1d3();
        }
    }

    static final class WeakEvictableEntry<K, V> extends WeakEntry<K, V> {
        @GuardedBy("Segment.this")
        private ReferenceEntry<K, V> nextEvictable = MapMakerInternalMap.nullEntry();
        @GuardedBy("Segment.this")
        private ReferenceEntry<K, V> previousEvictable = MapMakerInternalMap.nullEntry();

        WeakEvictableEntry(ReferenceQueue<K> referenceQueue, K k, int i, @Nullable ReferenceEntry<K, V> referenceEntry) {
            super(referenceQueue, k, i, referenceEntry);
        }

        public final ReferenceEntry<K, V> getNextEvictable() {
            return this.nextEvictable;
        }

        public final ReferenceEntry<K, V> getPreviousEvictable() {
            return this.previousEvictable;
        }

        public final void setNextEvictable(ReferenceEntry<K, V> referenceEntry) {
            this.nextEvictable = referenceEntry;
        }

        public final void setPreviousEvictable(ReferenceEntry<K, V> referenceEntry) {
            this.previousEvictable = referenceEntry;
        }
    }

    static final class WeakExpirableEntry<K, V> extends WeakEntry<K, V> {
        @GuardedBy("Segment.this")
        private ReferenceEntry<K, V> nextExpirable = MapMakerInternalMap.nullEntry();
        @GuardedBy("Segment.this")
        private ReferenceEntry<K, V> previousExpirable = MapMakerInternalMap.nullEntry();
        private volatile long time = LocationRequestCompat.PASSIVE_INTERVAL;

        WeakExpirableEntry(ReferenceQueue<K> referenceQueue, K k, int i, @Nullable ReferenceEntry<K, V> referenceEntry) {
            super(referenceQueue, k, i, referenceEntry);
        }

        public final long getExpirationTime() {
            return this.time;
        }

        public final ReferenceEntry<K, V> getNextExpirable() {
            return this.nextExpirable;
        }

        public final ReferenceEntry<K, V> getPreviousExpirable() {
            return this.previousExpirable;
        }

        public final void setExpirationTime(long j) {
            this.time = j;
        }

        public final void setNextExpirable(ReferenceEntry<K, V> referenceEntry) {
            this.nextExpirable = referenceEntry;
        }

        public final void setPreviousExpirable(ReferenceEntry<K, V> referenceEntry) {
            this.previousExpirable = referenceEntry;
        }
    }

    static final class WeakExpirableEvictableEntry<K, V> extends WeakEntry<K, V> {
        @GuardedBy("Segment.this")
        private ReferenceEntry<K, V> nextEvictable = MapMakerInternalMap.nullEntry();
        @GuardedBy("Segment.this")
        private ReferenceEntry<K, V> nextExpirable = MapMakerInternalMap.nullEntry();
        @GuardedBy("Segment.this")
        private ReferenceEntry<K, V> previousEvictable = MapMakerInternalMap.nullEntry();
        @GuardedBy("Segment.this")
        private ReferenceEntry<K, V> previousExpirable = MapMakerInternalMap.nullEntry();
        private volatile long time = LocationRequestCompat.PASSIVE_INTERVAL;

        WeakExpirableEvictableEntry(ReferenceQueue<K> referenceQueue, K k, int i, @Nullable ReferenceEntry<K, V> referenceEntry) {
            super(referenceQueue, k, i, referenceEntry);
        }

        public final long getExpirationTime() {
            return this.time;
        }

        public final ReferenceEntry<K, V> getNextEvictable() {
            return this.nextEvictable;
        }

        public final ReferenceEntry<K, V> getNextExpirable() {
            return this.nextExpirable;
        }

        public final ReferenceEntry<K, V> getPreviousEvictable() {
            return this.previousEvictable;
        }

        public final ReferenceEntry<K, V> getPreviousExpirable() {
            return this.previousExpirable;
        }

        public final void setExpirationTime(long j) {
            this.time = j;
        }

        public final void setNextEvictable(ReferenceEntry<K, V> referenceEntry) {
            this.nextEvictable = referenceEntry;
        }

        public final void setNextExpirable(ReferenceEntry<K, V> referenceEntry) {
            this.nextExpirable = referenceEntry;
        }

        public final void setPreviousEvictable(ReferenceEntry<K, V> referenceEntry) {
            this.previousEvictable = referenceEntry;
        }

        public final void setPreviousExpirable(ReferenceEntry<K, V> referenceEntry) {
            this.previousExpirable = referenceEntry;
        }
    }

    final class WriteThroughEntry extends AbstractMapEntry<K, V> {
        private K key;
        private V value;

        WriteThroughEntry(K k, V v) {
            this.key = k;
            this.value = v;
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return this.key.equals(entry.getKey()) && this.value.equals(entry.getValue());
            }
        }

        public final K getKey() {
            return this.key;
        }

        public final V getValue() {
            return this.value;
        }

        public final int hashCode() {
            return this.key.hashCode() ^ this.value.hashCode();
        }

        public final V setValue(V v) {
            V put = MapMakerInternalMap.this.put(this.key, v);
            this.value = v;
            return put;
        }
    }

    final class EntryIterator extends HashIterator {
        EntryIterator(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        public final /* bridge */ /* synthetic */ Object next() {
            return nextEntry();
        }
    }

    final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        EntrySet() {
        }

        public final void clear() {
            MapMakerInternalMap.this.clear();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
            r0 = r3.this$0.get((r0 = r4.getKey()));
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean contains(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x000f
                return r1
            L_0x000f:
                com.squareup.haha.guava.collect.MapMakerInternalMap r2 = com.squareup.haha.guava.collect.MapMakerInternalMap.this
                java.lang.Object r0 = r2.get(r0)
                if (r0 == 0) goto L_0x0027
                com.squareup.haha.guava.collect.MapMakerInternalMap r2 = com.squareup.haha.guava.collect.MapMakerInternalMap.this
                com.squareup.haha.guava.base.Equivalence<java.lang.Object> r2 = r2.valueEquivalence
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r2.equivalent(r4, r0)
                if (r4 == 0) goto L_0x0027
                r4 = 1
                return r4
            L_0x0027:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.haha.guava.collect.MapMakerInternalMap.EntrySet.contains(java.lang.Object):boolean");
        }

        public final boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new EntryIterator(MapMakerInternalMap.this);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
            r4 = (java.util.Map.Entry) r4;
            r0 = r4.getKey();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean remove(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                if (r0 == 0) goto L_0x001c
                com.squareup.haha.guava.collect.MapMakerInternalMap r2 = com.squareup.haha.guava.collect.MapMakerInternalMap.this
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r2.remove(r0, r4)
                if (r4 == 0) goto L_0x001c
                r4 = 1
                return r4
            L_0x001c:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.haha.guava.collect.MapMakerInternalMap.EntrySet.remove(java.lang.Object):boolean");
        }

        public final int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    abstract class HashIterator<E> implements Iterator<E> {
        private Segment<K, V> currentSegment;
        private AtomicReferenceArray<ReferenceEntry<K, V>> currentTable;
        private WriteThroughEntry lastReturned;
        private ReferenceEntry<K, V> nextEntry;
        private WriteThroughEntry nextExternal;
        private int nextSegmentIndex;
        private int nextTableIndex = -1;

        HashIterator() {
            this.nextSegmentIndex = MapMakerInternalMap.this.segments.length - 1;
            advance();
        }

        private void advance() {
            this.nextExternal = null;
            if (!nextInChain() && !nextInTable()) {
                while (true) {
                    int i = this.nextSegmentIndex;
                    if (i >= 0) {
                        Segment<K, V>[] segmentArr = MapMakerInternalMap.this.segments;
                        this.nextSegmentIndex = i - 1;
                        Segment<K, V> segment = segmentArr[i];
                        this.currentSegment = segment;
                        if (segment.count != 0) {
                            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.currentSegment.table;
                            this.currentTable = atomicReferenceArray;
                            this.nextTableIndex = atomicReferenceArray.length() - 1;
                            if (nextInTable()) {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        /* JADX INFO: finally extract failed */
        private boolean advanceTo(ReferenceEntry<K, V> referenceEntry) {
            try {
                K key = referenceEntry.getKey();
                MapMakerInternalMap mapMakerInternalMap = MapMakerInternalMap.this;
                V v = null;
                if (referenceEntry.getKey() != null) {
                    V v2 = referenceEntry.getValueReference().get();
                    if (v2 != null) {
                        if (!mapMakerInternalMap.expires() || !mapMakerInternalMap.isExpired(referenceEntry)) {
                            v = v2;
                        }
                    }
                }
                if (v != null) {
                    this.nextExternal = new WriteThroughEntry(key, v);
                    this.currentSegment.postReadCleanup();
                    return true;
                }
                this.currentSegment.postReadCleanup();
                return false;
            } catch (Throwable th) {
                this.currentSegment.postReadCleanup();
                throw th;
            }
        }

        private boolean nextInChain() {
            ReferenceEntry<K, V> referenceEntry = this.nextEntry;
            if (referenceEntry == null) {
                return false;
            }
            while (true) {
                this.nextEntry = referenceEntry.getNext();
                ReferenceEntry<K, V> referenceEntry2 = this.nextEntry;
                if (referenceEntry2 == null) {
                    return false;
                }
                if (advanceTo(referenceEntry2)) {
                    return true;
                }
                referenceEntry = this.nextEntry;
            }
        }

        private boolean nextInTable() {
            while (true) {
                int i = this.nextTableIndex;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.currentTable;
                this.nextTableIndex = i - 1;
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(i);
                this.nextEntry = referenceEntry;
                if (referenceEntry != null && (advanceTo(referenceEntry) || nextInChain())) {
                    return true;
                }
            }
        }

        public boolean hasNext() {
            return this.nextExternal != null;
        }

        /* access modifiers changed from: package-private */
        public final WriteThroughEntry nextEntry() {
            WriteThroughEntry writeThroughEntry = this.nextExternal;
            if (writeThroughEntry != null) {
                this.lastReturned = writeThroughEntry;
                advance();
                return this.lastReturned;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            Ascii.checkRemove(this.lastReturned != null);
            MapMakerInternalMap.this.remove(this.lastReturned.getKey());
            this.lastReturned = null;
        }
    }

    final class KeyIterator extends HashIterator {
        KeyIterator(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        public final K next() {
            return nextEntry().getKey();
        }
    }

    final class KeySet extends AbstractSet<K> {
        KeySet() {
        }

        public final void clear() {
            MapMakerInternalMap.this.clear();
        }

        public final boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsKey(obj);
        }

        public final boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        public final Iterator<K> iterator() {
            return new KeyIterator(MapMakerInternalMap.this);
        }

        public final boolean remove(Object obj) {
            return MapMakerInternalMap.this.remove(obj) != null;
        }

        public final int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    enum NullEntry implements ReferenceEntry<Object, Object> {
        INSTANCE;

        static {
            INSTANCE = new NullEntry("INSTANCE", 0);
        }

        public final long getExpirationTime() {
            return 0;
        }

        public final int getHash() {
            return 0;
        }

        public final Object getKey() {
            return null;
        }

        public final ReferenceEntry<Object, Object> getNext() {
            return null;
        }

        public final ReferenceEntry<Object, Object> getNextEvictable() {
            return this;
        }

        public final ReferenceEntry<Object, Object> getNextExpirable() {
            return this;
        }

        public final ReferenceEntry<Object, Object> getPreviousEvictable() {
            return this;
        }

        public final ReferenceEntry<Object, Object> getPreviousExpirable() {
            return this;
        }

        public final ValueReference<Object, Object> getValueReference() {
            return null;
        }

        public final void setExpirationTime(long j) {
        }

        public final void setNextEvictable(ReferenceEntry<Object, Object> referenceEntry) {
        }

        public final void setNextExpirable(ReferenceEntry<Object, Object> referenceEntry) {
        }

        public final void setPreviousEvictable(ReferenceEntry<Object, Object> referenceEntry) {
        }

        public final void setPreviousExpirable(ReferenceEntry<Object, Object> referenceEntry) {
        }

        public final void setValueReference(ValueReference<Object, Object> valueReference) {
        }
    }

    interface ReferenceEntry<K, V> {
        long getExpirationTime();

        int getHash();

        K getKey();

        ReferenceEntry<K, V> getNext();

        ReferenceEntry<K, V> getNextEvictable();

        ReferenceEntry<K, V> getNextExpirable();

        ReferenceEntry<K, V> getPreviousEvictable();

        ReferenceEntry<K, V> getPreviousExpirable();

        ValueReference<K, V> getValueReference();

        void setExpirationTime(long j);

        void setNextEvictable(ReferenceEntry<K, V> referenceEntry);

        void setNextExpirable(ReferenceEntry<K, V> referenceEntry);

        void setPreviousEvictable(ReferenceEntry<K, V> referenceEntry);

        void setPreviousExpirable(ReferenceEntry<K, V> referenceEntry);

        void setValueReference(ValueReference<K, V> valueReference);
    }

    static final class SoftValueReference<K, V> extends SoftReference<V> implements ValueReference<K, V> {
        private ReferenceEntry<K, V> entry;

        SoftValueReference(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            super(v, referenceQueue);
            this.entry = referenceEntry;
        }

        public final void clear$5ca9f1d3() {
            clear();
        }

        public final ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            return new SoftValueReference(referenceQueue, v, referenceEntry);
        }

        public final ReferenceEntry<K, V> getEntry() {
            return this.entry;
        }
    }

    enum Strength {
        STRONG {
            /* access modifiers changed from: package-private */
            public final <K, V> ValueReference<Object, Object> referenceValue(Segment<Object, Object> segment, ReferenceEntry<Object, Object> referenceEntry, Object obj) {
                return new StrongValueReference(obj);
            }
        },
        SOFT {
            /* access modifiers changed from: package-private */
            public final <K, V> ValueReference<Object, Object> referenceValue(Segment<Object, Object> segment, ReferenceEntry<Object, Object> referenceEntry, Object obj) {
                return new SoftValueReference(segment.valueReferenceQueue, obj, referenceEntry);
            }
        },
        WEAK {
            /* access modifiers changed from: package-private */
            public final <K, V> ValueReference<Object, Object> referenceValue(Segment<Object, Object> segment, ReferenceEntry<Object, Object> referenceEntry, Object obj) {
                return new WeakValueReference(segment.valueReferenceQueue, obj, referenceEntry);
            }
        };

        static {
            STRONG = new Strength("STRONG", 0) {
                /* access modifiers changed from: package-private */
                public final <K, V> ValueReference<Object, Object> referenceValue(Segment<Object, Object> segment, ReferenceEntry<Object, Object> referenceEntry, Object obj) {
                    return new StrongValueReference(obj);
                }
            };
            SOFT = new Strength("SOFT", 1) {
                /* access modifiers changed from: package-private */
                public final <K, V> ValueReference<Object, Object> referenceValue(Segment<Object, Object> segment, ReferenceEntry<Object, Object> referenceEntry, Object obj) {
                    return new SoftValueReference(segment.valueReferenceQueue, obj, referenceEntry);
                }
            };
            WEAK = new Strength("WEAK", 2) {
                /* access modifiers changed from: package-private */
                public final <K, V> ValueReference<Object, Object> referenceValue(Segment<Object, Object> segment, ReferenceEntry<Object, Object> referenceEntry, Object obj) {
                    return new WeakValueReference(segment.valueReferenceQueue, obj, referenceEntry);
                }
            };
        }

        /* access modifiers changed from: package-private */
        public abstract <K, V> ValueReference<K, V> referenceValue(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, V v);
    }

    static final class StrongValueReference<K, V> implements ValueReference<K, V> {
        private V referent;

        StrongValueReference(V v) {
            this.referent = v;
        }

        public final void clear$5ca9f1d3() {
        }

        public final ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            return this;
        }

        public final V get() {
            return this.referent;
        }

        public final ReferenceEntry<K, V> getEntry() {
            return null;
        }
    }

    final class ValueIterator extends HashIterator {
        ValueIterator(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        public final V next() {
            return nextEntry().getValue();
        }
    }

    final class Values extends AbstractCollection<V> {
        Values() {
        }

        public final void clear() {
            MapMakerInternalMap.this.clear();
        }

        public final boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsValue(obj);
        }

        public final boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        public final Iterator<V> iterator() {
            return new ValueIterator(MapMakerInternalMap.this);
        }

        public final int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    static final class WeakValueReference<K, V> extends WeakReference<V> implements ValueReference<K, V> {
        private ReferenceEntry<K, V> entry;

        WeakValueReference(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            super(v, referenceQueue);
            this.entry = referenceEntry;
        }

        public final void clear$5ca9f1d3() {
            clear();
        }

        public final ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            return new WeakValueReference(referenceQueue, v, referenceEntry);
        }

        public final ReferenceEntry<K, V> getEntry() {
            return this.entry;
        }
    }

    @GuardedBy("Segment.this")
    static <K, V> void connectEvictables(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        referenceEntry.setNextEvictable(referenceEntry2);
        referenceEntry2.setPreviousEvictable(referenceEntry);
    }

    @GuardedBy("Segment.this")
    static <K, V> void connectExpirables(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        referenceEntry.setNextExpirable(referenceEntry2);
        referenceEntry2.setPreviousExpirable(referenceEntry);
    }

    private int hash(Object obj) {
        int hash = this.keyEquivalence.hash(obj);
        int i = hash + ((hash << 15) ^ -12931);
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    static boolean isExpired(ReferenceEntry<K, V> referenceEntry, long j) {
        return j - referenceEntry.getExpirationTime() > 0;
    }

    static <K, V> ReferenceEntry<K, V> nullEntry() {
        return NullEntry.INSTANCE;
    }

    @GuardedBy("Segment.this")
    static <K, V> void nullifyEvictable(ReferenceEntry<K, V> referenceEntry) {
        NullEntry nullEntry = NullEntry.INSTANCE;
        referenceEntry.setNextEvictable(nullEntry);
        referenceEntry.setPreviousEvictable(nullEntry);
    }

    @GuardedBy("Segment.this")
    static <K, V> void nullifyExpirable(ReferenceEntry<K, V> referenceEntry) {
        NullEntry nullEntry = NullEntry.INSTANCE;
        referenceEntry.setNextExpirable(nullEntry);
        referenceEntry.setPreviousExpirable(nullEntry);
    }

    static <K, V> ValueReference<K, V> unset() {
        return UNSET;
    }

    public void clear() {
        Segment<K, V>[] segmentArr = this.segments;
        int length = segmentArr.length;
        for (int i = 0; i < length; i++) {
            Segment<K, V> segment = segmentArr[i];
            if (segment.count != 0) {
                segment.lock();
                try {
                    AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = segment.table;
                    if (segment.map.removalNotificationQueue != DISCARDING_QUEUE) {
                        for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                            for (ReferenceEntry referenceEntry = atomicReferenceArray.get(i2); referenceEntry != null; referenceEntry = referenceEntry.getNext()) {
                                referenceEntry.getValueReference();
                                segment.enqueueNotification(referenceEntry, MapMaker.RemovalCause.EXPLICIT);
                            }
                        }
                    }
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        atomicReferenceArray.set(i3, (Object) null);
                    }
                    if (segment.map.usesKeyReferences()) {
                        do {
                        } while (segment.keyReferenceQueue.poll() != null);
                    }
                    if (segment.map.usesValueReferences()) {
                        do {
                        } while (segment.valueReferenceQueue.poll() != null);
                    }
                    segment.evictionQueue.clear();
                    segment.expirationQueue.clear();
                    segment.readCount.set(0);
                    segment.modCount++;
                    segment.count = 0;
                } finally {
                    segment.unlock();
                    segment.runUnlockedCleanup();
                }
            }
        }
    }

    public boolean containsKey(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        int hash = hash(obj);
        return segmentFor(hash).containsKey(obj, hash);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0064 A[LOOP:3: B:12:0x0029->B:28:0x0064, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0062 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean containsValue(@javax.annotation.Nullable java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 != 0) goto L_0x0008
            return r2
        L_0x0008:
            com.squareup.haha.guava.collect.MapMakerInternalMap$Segment<K, V>[] r3 = r0.segments
            r4 = -1
            r6 = 0
        L_0x000d:
            r7 = 3
            if (r6 >= r7) goto L_0x007f
            r7 = 0
            int r9 = r3.length
            r10 = 0
        L_0x0014:
            if (r10 >= r9) goto L_0x0076
            r11 = r3[r10]
            int r12 = r11.count
            java.util.concurrent.atomic.AtomicReferenceArray<com.squareup.haha.guava.collect.MapMakerInternalMap$ReferenceEntry<K, V>> r12 = r11.table
            r13 = 0
        L_0x001d:
            int r14 = r12.length()
            if (r13 >= r14) goto L_0x006e
            java.lang.Object r14 = r12.get(r13)
            com.squareup.haha.guava.collect.MapMakerInternalMap$ReferenceEntry r14 = (com.squareup.haha.guava.collect.MapMakerInternalMap.ReferenceEntry) r14
        L_0x0029:
            if (r14 == 0) goto L_0x006a
            java.lang.Object r15 = r14.getKey()
            r16 = 0
            if (r15 != 0) goto L_0x0039
        L_0x0033:
            r11.tryDrainReferenceQueues()
        L_0x0036:
            r15 = r16
            goto L_0x0058
        L_0x0039:
            com.squareup.haha.guava.collect.MapMakerInternalMap$ValueReference r15 = r14.getValueReference()
            java.lang.Object r15 = r15.get()
            if (r15 != 0) goto L_0x0044
            goto L_0x0033
        L_0x0044:
            com.squareup.haha.guava.collect.MapMakerInternalMap<K, V> r2 = r11.map
            boolean r2 = r2.expires()
            if (r2 == 0) goto L_0x0058
            com.squareup.haha.guava.collect.MapMakerInternalMap<K, V> r2 = r11.map
            boolean r2 = r2.isExpired(r14)
            if (r2 == 0) goto L_0x0058
            r11.tryExpireEntries()
            goto L_0x0036
        L_0x0058:
            if (r15 == 0) goto L_0x0064
            com.squareup.haha.guava.base.Equivalence<java.lang.Object> r2 = r0.valueEquivalence
            boolean r2 = r2.equivalent(r1, r15)
            if (r2 == 0) goto L_0x0064
            r1 = 1
            return r1
        L_0x0064:
            com.squareup.haha.guava.collect.MapMakerInternalMap$ReferenceEntry r14 = r14.getNext()
            r2 = 0
            goto L_0x0029
        L_0x006a:
            int r13 = r13 + 1
            r2 = 0
            goto L_0x001d
        L_0x006e:
            int r2 = r11.modCount
            long r11 = (long) r2
            long r7 = r7 + r11
            int r10 = r10 + 1
            r2 = 0
            goto L_0x0014
        L_0x0076:
            int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x007f
            int r6 = r6 + 1
            r4 = r7
            r2 = 0
            goto L_0x000d
        L_0x007f:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.haha.guava.collect.MapMakerInternalMap.containsValue(java.lang.Object):boolean");
    }

    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        EntrySet entrySet2 = new EntrySet();
        this.entrySet = entrySet2;
        return entrySet2;
    }

    /* access modifiers changed from: package-private */
    public final boolean expires() {
        return ((this.expireAfterWriteNanos > 0 ? 1 : (this.expireAfterWriteNanos == 0 ? 0 : -1)) > 0) || expiresAfterAccess();
    }

    /* access modifiers changed from: package-private */
    public final boolean expiresAfterAccess() {
        return this.expireAfterAccessNanos > 0;
    }

    public V get(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        int hash = hash(obj);
        return segmentFor(hash).get(obj, hash);
    }

    public boolean isEmpty() {
        Segment<K, V>[] segmentArr = this.segments;
        long j = 0;
        for (int i = 0; i < segmentArr.length; i++) {
            if (segmentArr[i].count != 0) {
                return false;
            }
            j += (long) segmentArr[i].modCount;
        }
        if (j == 0) {
            return true;
        }
        for (int i2 = 0; i2 < segmentArr.length; i2++) {
            if (segmentArr[i2].count != 0) {
                return false;
            }
            j -= (long) segmentArr[i2].modCount;
        }
        return j == 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean isExpired(ReferenceEntry<K, V> referenceEntry) {
        return isExpired(referenceEntry, this.ticker.read());
    }

    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        KeySet keySet2 = new KeySet();
        this.keySet = keySet2;
        return keySet2;
    }

    public V put(K k, V v) {
        Ascii.checkNotNull(k);
        Ascii.checkNotNull(v);
        int hash = hash(k);
        return segmentFor(hash).put(k, hash, v, false);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public V putIfAbsent(K k, V v) {
        Ascii.checkNotNull(k);
        Ascii.checkNotNull(v);
        int hash = hash(k);
        return segmentFor(hash).put(k, hash, v, true);
    }

    public V remove(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        int hash = hash(obj);
        return segmentFor(hash).remove(obj, hash);
    }

    public boolean remove(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int hash = hash(obj);
        return segmentFor(hash).remove(obj, hash, obj2);
    }

    public V replace(K k, V v) {
        Ascii.checkNotNull(k);
        Ascii.checkNotNull(v);
        int hash = hash(k);
        return segmentFor(hash).replace(k, hash, v);
    }

    public boolean replace(K k, @Nullable V v, V v2) {
        Ascii.checkNotNull(k);
        Ascii.checkNotNull(v2);
        if (v == null) {
            return false;
        }
        int hash = hash(k);
        return segmentFor(hash).replace(k, hash, v, v2);
    }

    /* access modifiers changed from: package-private */
    public final Segment<K, V> segmentFor(int i) {
        return this.segments[(i >>> this.segmentShift) & this.segmentMask];
    }

    public int size() {
        Segment<K, V>[] segmentArr = this.segments;
        long j = 0;
        for (Segment<K, V> segment : segmentArr) {
            j += (long) segment.count;
        }
        return Ints.saturatedCast(j);
    }

    /* access modifiers changed from: package-private */
    public final boolean usesKeyReferences() {
        return this.keyStrength != Strength.STRONG;
    }

    /* access modifiers changed from: package-private */
    public final boolean usesValueReferences() {
        return this.valueStrength != Strength.STRONG;
    }

    public Collection<V> values() {
        Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        Values values2 = new Values();
        this.values = values2;
        return values2;
    }
}
