package kotlin.text;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import p125a5.C3975c;

/* renamed from: kotlin.text.g */
public final class C9504g {
    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final C9503f m23129f(Matcher matcher, int i, CharSequence charSequence) {
        if (!matcher.find(i)) {
            return null;
        }
        return new MatcherMatchResult(matcher, charSequence);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final C9503f m23130g(Matcher matcher, CharSequence charSequence) {
        if (!matcher.matches()) {
            return null;
        }
        return new MatcherMatchResult(matcher, charSequence);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final C3975c m23131h(MatchResult matchResult) {
        return C3979f.m11484d(matchResult.start(), matchResult.end());
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final C3975c m23132i(MatchResult matchResult, int i) {
        return C3979f.m11484d(matchResult.start(i), matchResult.end(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final int m23133j(Iterable<? extends C9501d> iterable) {
        int i = 0;
        for (C9501d value : iterable) {
            i |= value.getValue();
        }
        return i;
    }
}
