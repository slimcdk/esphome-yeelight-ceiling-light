package kotlin.text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.ExperimentalStdlibApi;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.coroutines.C9378a;
import kotlin.jvm.internal.C9422o;
import kotlin.jvm.internal.C9424q;
import kotlin.sequences.C9482c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233y4.C12060l;

public final class Regex implements Serializable {
    @NotNull
    public static final C9497a Companion = new C9497a((C9422o) null);
    @Nullable
    private Set<? extends RegexOption> _options;
    /* access modifiers changed from: private */
    @NotNull
    public final Pattern nativePattern;

    private static final class Serialized implements Serializable {
        @NotNull
        public static final C9496a Companion = new C9496a((C9422o) null);
        private static final long serialVersionUID = 0;
        private final int flags;
        @NotNull
        private final String pattern;

        /* renamed from: kotlin.text.Regex$Serialized$a */
        public static final class C9496a {
            private C9496a() {
            }

            public /* synthetic */ C9496a(C9422o oVar) {
                this();
            }
        }

        public Serialized(@NotNull String str, int i) {
            C9424q.m22996e(str, "pattern");
            this.pattern = str;
            this.flags = i;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.pattern, this.flags);
            C9424q.m22995d(compile, "compile(pattern, flags)");
            return new Regex(compile);
        }

        public final int getFlags() {
            return this.flags;
        }

        @NotNull
        public final String getPattern() {
            return this.pattern;
        }
    }

    /* renamed from: kotlin.text.Regex$a */
    public static final class C9497a {
        private C9497a() {
        }

        public /* synthetic */ C9497a(C9422o oVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final int m23118b(int i) {
            return (i & 2) != 0 ? i | 64 : i;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Regex(@org.jetbrains.annotations.NotNull java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.C9424q.m22996e(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            kotlin.jvm.internal.C9424q.m22995d(r2, r0)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Regex(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.util.Set<? extends kotlin.text.RegexOption> r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.C9424q.m22996e(r2, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.C9424q.m22996e(r3, r0)
            kotlin.text.Regex$a r0 = Companion
            int r3 = kotlin.text.C9504g.m23133j(r3)
            int r3 = r0.m23118b(r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(pattern, ensureU…odeCase(options.toInt()))"
            kotlin.jvm.internal.C9424q.m22995d(r2, r3)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String, java.util.Set):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Regex(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.text.RegexOption r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.C9424q.m22996e(r2, r0)
            java.lang.String r0 = "option"
            kotlin.jvm.internal.C9424q.m22996e(r3, r0)
            kotlin.text.Regex$a r0 = Companion
            int r3 = r3.getValue()
            int r3 = r0.m23118b(r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(pattern, ensureUnicodeCase(option.value))"
            kotlin.jvm.internal.C9424q.m22995d(r2, r3)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String, kotlin.text.RegexOption):void");
    }

    @PublishedApi
    public Regex(@NotNull Pattern pattern) {
        C9424q.m22996e(pattern, "nativePattern");
        this.nativePattern = pattern;
    }

    public static /* synthetic */ C9503f find$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.find(charSequence, i);
    }

    public static /* synthetic */ C9482c findAll$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.findAll(charSequence, i);
    }

    public static /* synthetic */ List split$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.split(charSequence, i);
    }

    public static /* synthetic */ C9482c splitToSequence$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.splitToSequence(charSequence, i);
    }

    private final Object writeReplace() {
        String pattern = this.nativePattern.pattern();
        C9424q.m22995d(pattern, "nativePattern.pattern()");
        return new Serialized(pattern, this.nativePattern.flags());
    }

    public final boolean containsMatchIn(@NotNull CharSequence charSequence) {
        C9424q.m22996e(charSequence, "input");
        return this.nativePattern.matcher(charSequence).find();
    }

    @Nullable
    public final C9503f find(@NotNull CharSequence charSequence, int i) {
        C9424q.m22996e(charSequence, "input");
        Matcher matcher = this.nativePattern.matcher(charSequence);
        C9424q.m22995d(matcher, "nativePattern.matcher(input)");
        return C9504g.m23129f(matcher, i, charSequence);
    }

    @NotNull
    public final C9482c<C9503f> findAll(@NotNull CharSequence charSequence, int i) {
        C9424q.m22996e(charSequence, "input");
        if (i >= 0 && i <= charSequence.length()) {
            return SequencesKt__SequencesKt.m23080d(new Regex$findAll$1(this, charSequence, i), Regex$findAll$2.INSTANCE);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i + ", input length: " + charSequence.length());
    }

    @NotNull
    public final Set<RegexOption> getOptions() {
        Set<? extends RegexOption> set = this._options;
        if (set != null) {
            return set;
        }
        int flags = this.nativePattern.flags();
        EnumSet<E> allOf = EnumSet.allOf(RegexOption.class);
        C9424q.m22995d(allOf, "");
        boolean unused = C9372x.m22933m(allOf, new Regex$special$$inlined$fromInt$1(flags));
        Set<? extends RegexOption> unmodifiableSet = Collections.unmodifiableSet(allOf);
        C9424q.m22995d(unmodifiableSet, "unmodifiableSet(EnumSet.…mask == it.value }\n    })");
        this._options = unmodifiableSet;
        return unmodifiableSet;
    }

    @NotNull
    public final String getPattern() {
        String pattern = this.nativePattern.pattern();
        C9424q.m22995d(pattern, "nativePattern.pattern()");
        return pattern;
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public final C9503f matchAt(@NotNull CharSequence charSequence, int i) {
        C9424q.m22996e(charSequence, "input");
        Matcher region = this.nativePattern.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i, charSequence.length());
        if (!region.lookingAt()) {
            return null;
        }
        C9424q.m22995d(region, "this");
        return new MatcherMatchResult(region, charSequence);
    }

    @Nullable
    public final C9503f matchEntire(@NotNull CharSequence charSequence) {
        C9424q.m22996e(charSequence, "input");
        Matcher matcher = this.nativePattern.matcher(charSequence);
        C9424q.m22995d(matcher, "nativePattern.matcher(input)");
        return C9504g.m23130g(matcher, charSequence);
    }

    public final boolean matches(@NotNull CharSequence charSequence) {
        C9424q.m22996e(charSequence, "input");
        return this.nativePattern.matcher(charSequence).matches();
    }

    @SinceKotlin(version = "1.7")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public final boolean matchesAt(@NotNull CharSequence charSequence, int i) {
        C9424q.m22996e(charSequence, "input");
        return this.nativePattern.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i, charSequence.length()).lookingAt();
    }

    @NotNull
    public final String replace(@NotNull CharSequence charSequence, @NotNull String str) {
        C9424q.m22996e(charSequence, "input");
        C9424q.m22996e(str, "replacement");
        String replaceAll = this.nativePattern.matcher(charSequence).replaceAll(str);
        C9424q.m22995d(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    @NotNull
    public final String replace(@NotNull CharSequence charSequence, @NotNull C12060l<? super C9503f, ? extends CharSequence> lVar) {
        C9424q.m22996e(charSequence, "input");
        C9424q.m22996e(lVar, "transform");
        int i = 0;
        C9503f find$default = find$default(this, charSequence, 0, 2, (Object) null);
        if (find$default == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(charSequence, i, find$default.mo38445a().mo26536o().intValue());
            sb.append((CharSequence) lVar.invoke(find$default));
            i = find$default.mo38445a().mo26535n().intValue() + 1;
            find$default = find$default.next();
            if (i >= length) {
                break;
            }
        } while (find$default != null);
        if (i < length) {
            sb.append(charSequence, i, length);
        }
        String sb2 = sb.toString();
        C9424q.m22995d(sb2, "sb.toString()");
        return sb2;
    }

    @NotNull
    public final String replaceFirst(@NotNull CharSequence charSequence, @NotNull String str) {
        C9424q.m22996e(charSequence, "input");
        C9424q.m22996e(str, "replacement");
        String replaceFirst = this.nativePattern.matcher(charSequence).replaceFirst(str);
        C9424q.m22995d(replaceFirst, "nativePattern.matcher(in…replaceFirst(replacement)");
        return replaceFirst;
    }

    @NotNull
    public final List<String> split(@NotNull CharSequence charSequence, int i) {
        C9424q.m22996e(charSequence, "input");
        C9515r.m23160w(i);
        Matcher matcher = this.nativePattern.matcher(charSequence);
        if (i == 1 || !matcher.find()) {
            return C9364r.m22922c(charSequence.toString());
        }
        int i2 = 10;
        if (i > 0) {
            i2 = C3979f.m11482b(i, 10);
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = 0;
        int i4 = i - 1;
        do {
            arrayList.add(charSequence.subSequence(i3, matcher.start()).toString());
            i3 = matcher.end();
            if ((i4 >= 0 && arrayList.size() == i4) || !matcher.find()) {
                arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i3, matcher.start()).toString());
            i3 = matcher.end();
            break;
        } while (!matcher.find());
        arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
        return arrayList;
    }

    @SinceKotlin(version = "1.6")
    @NotNull
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public final C9482c<String> splitToSequence(@NotNull CharSequence charSequence, int i) {
        C9424q.m22996e(charSequence, "input");
        C9515r.m23160w(i);
        return C9486g.m23099b(new Regex$splitToSequence$1(this, charSequence, i, (C9378a<? super Regex$splitToSequence$1>) null));
    }

    @NotNull
    public final Pattern toPattern() {
        return this.nativePattern;
    }

    @NotNull
    public String toString() {
        String pattern = this.nativePattern.toString();
        C9424q.m22995d(pattern, "nativePattern.toString()");
        return pattern;
    }
}
