package kotlin.text;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p125a5.C3975c;

final class MatcherMatchResult implements C9503f {
    @NotNull

    /* renamed from: a */
    private final Matcher f17351a;
    @NotNull

    /* renamed from: b */
    private final CharSequence f17352b;

    public MatcherMatchResult(@NotNull Matcher matcher, @NotNull CharSequence charSequence) {
        C9424q.m22996e(matcher, "matcher");
        C9424q.m22996e(charSequence, "input");
        this.f17351a = matcher;
        this.f17352b = charSequence;
        new MatcherMatchResult$groups$1(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final MatchResult m23112c() {
        return this.f17351a;
    }

    @NotNull
    /* renamed from: a */
    public C3975c mo38445a() {
        return C9504g.m23131h(m23112c());
    }

    @Nullable
    public C9503f next() {
        int end = m23112c().end() + (m23112c().end() == m23112c().start() ? 1 : 0);
        if (end > this.f17352b.length()) {
            return null;
        }
        Matcher matcher = this.f17351a.pattern().matcher(this.f17352b);
        C9424q.m22995d(matcher, "matcher.pattern().matcher(input)");
        return C9504g.m23129f(matcher, end, this.f17352b);
    }
}
