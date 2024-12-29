package com.squareup.haha.guava.base;

import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public final class Predicates {
    /* access modifiers changed from: private */
    public static final Ascii COMMA_JOINER$5f22bbb7 = new Ascii(Constants.ACCEPT_TIME_SEPARATOR_SP);

    static class AndPredicate<T> implements Predicate<T>, Serializable {
        private final List<? extends Predicate<? super T>> components;

        private AndPredicate(List<? extends Predicate<? super T>> list) {
            this.components = list;
        }

        /* synthetic */ AndPredicate(List list, byte b) {
            this(list);
        }

        public final boolean apply(@Nullable T t) {
            for (int i = 0; i < this.components.size(); i++) {
                if (!((Predicate) this.components.get(i)).apply(t)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj instanceof AndPredicate) {
                return this.components.equals(((AndPredicate) obj).components);
            }
            return false;
        }

        public final int hashCode() {
            return this.components.hashCode() + 306654252;
        }

        public final String toString() {
            return "Predicates.and(" + Predicates.COMMA_JOINER$5f22bbb7.join((Iterable<?>) this.components) + ")";
        }
    }

    static class CompositionPredicate<A, B> implements Predicate<A>, Serializable {

        /* renamed from: f */
        private Function<A, ? extends B> f4702f;

        /* renamed from: p */
        private Predicate<B> f4703p;

        private CompositionPredicate(Predicate<B> predicate, Function<A, ? extends B> function) {
            this.f4703p = (Predicate) Ascii.checkNotNull(predicate);
            this.f4702f = (Function) Ascii.checkNotNull(function);
        }

        /* synthetic */ CompositionPredicate(Predicate predicate, Function function, byte b) {
            this(predicate, function);
        }

        public final boolean apply(@Nullable A a) {
            return this.f4703p.apply(this.f4702f.apply(a));
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj instanceof CompositionPredicate) {
                CompositionPredicate compositionPredicate = (CompositionPredicate) obj;
                return this.f4702f.equals(compositionPredicate.f4702f) && this.f4703p.equals(compositionPredicate.f4703p);
            }
        }

        public final int hashCode() {
            return this.f4702f.hashCode() ^ this.f4703p.hashCode();
        }

        public final String toString() {
            return this.f4703p.toString() + "(" + this.f4702f.toString() + ")";
        }
    }

    static class InPredicate<T> implements Predicate<T>, Serializable {
        private final Collection<?> target;

        private InPredicate(Collection<?> collection) {
            this.target = (Collection) Ascii.checkNotNull(collection);
        }

        /* synthetic */ InPredicate(Collection collection, byte b) {
            this(collection);
        }

        public final boolean apply(@Nullable T t) {
            try {
                return this.target.contains(t);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj instanceof InPredicate) {
                return this.target.equals(((InPredicate) obj).target);
            }
            return false;
        }

        public final int hashCode() {
            return this.target.hashCode();
        }

        public final String toString() {
            return "Predicates.in(" + this.target + ")";
        }
    }

    static class IsEqualToPredicate<T> implements Predicate<T>, Serializable {
        private final T target;

        private IsEqualToPredicate(T t) {
            this.target = t;
        }

        /* synthetic */ IsEqualToPredicate(Object obj, byte b) {
            this(obj);
        }

        public final boolean apply(T t) {
            return this.target.equals(t);
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj instanceof IsEqualToPredicate) {
                return this.target.equals(((IsEqualToPredicate) obj).target);
            }
            return false;
        }

        public final int hashCode() {
            return this.target.hashCode();
        }

        public final String toString() {
            return "Predicates.equalTo(" + this.target + ")";
        }
    }

    static class NotPredicate<T> implements Predicate<T>, Serializable {
        private Predicate<T> predicate;

        NotPredicate(Predicate<T> predicate2) {
            this.predicate = (Predicate) Ascii.checkNotNull(predicate2);
        }

        public final boolean apply(@Nullable T t) {
            return !this.predicate.apply(t);
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj instanceof NotPredicate) {
                return this.predicate.equals(((NotPredicate) obj).predicate);
            }
            return false;
        }

        public final int hashCode() {
            return this.predicate.hashCode() ^ -1;
        }

        public final String toString() {
            return "Predicates.not(" + this.predicate.toString() + ")";
        }
    }

    enum ObjectPredicate implements Predicate<Object> {
        ALWAYS_TRUE {
            public final boolean apply(@Nullable Object obj) {
                return true;
            }

            public final String toString() {
                return "Predicates.alwaysTrue()";
            }
        },
        ALWAYS_FALSE {
            public final boolean apply(@Nullable Object obj) {
                return false;
            }

            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        },
        IS_NULL {
            public final boolean apply(@Nullable Object obj) {
                return obj == null;
            }

            public final String toString() {
                return "Predicates.isNull()";
            }
        },
        NOT_NULL {
            public final boolean apply(@Nullable Object obj) {
                return obj != null;
            }

            public final String toString() {
                return "Predicates.notNull()";
            }
        };

        static {
            ALWAYS_TRUE = new ObjectPredicate("ALWAYS_TRUE", 0) {
                public final boolean apply(@Nullable Object obj) {
                    return true;
                }

                public final String toString() {
                    return "Predicates.alwaysTrue()";
                }
            };
            ALWAYS_FALSE = new ObjectPredicate("ALWAYS_FALSE", 1) {
                public final boolean apply(@Nullable Object obj) {
                    return false;
                }

                public final String toString() {
                    return "Predicates.alwaysFalse()";
                }
            };
            IS_NULL = new ObjectPredicate("IS_NULL", 2) {
                public final boolean apply(@Nullable Object obj) {
                    return obj == null;
                }

                public final String toString() {
                    return "Predicates.isNull()";
                }
            };
            NOT_NULL = new ObjectPredicate("NOT_NULL", 3) {
                public final boolean apply(@Nullable Object obj) {
                    return obj != null;
                }

                public final String toString() {
                    return "Predicates.notNull()";
                }
            };
        }
    }

    public static <T> Predicate<T> and(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return new AndPredicate(Arrays.asList(new Predicate[]{(Predicate) Ascii.checkNotNull(predicate), (Predicate) Ascii.checkNotNull(predicate2)}), (byte) 0);
    }

    public static <A, B> Predicate<A> compose(Predicate<B> predicate, Function<A, ? extends B> function) {
        return new CompositionPredicate(predicate, function, (byte) 0);
    }

    public static <T> Predicate<T> equalTo(@Nullable T t) {
        return t == null ? ObjectPredicate.IS_NULL : new IsEqualToPredicate(t, (byte) 0);
    }

    /* renamed from: in */
    public static <T> Predicate<T> m7501in(Collection<? extends T> collection) {
        return new InPredicate(collection, (byte) 0);
    }

    public static <T> Predicate<T> not(Predicate<T> predicate) {
        return new NotPredicate(predicate);
    }
}
