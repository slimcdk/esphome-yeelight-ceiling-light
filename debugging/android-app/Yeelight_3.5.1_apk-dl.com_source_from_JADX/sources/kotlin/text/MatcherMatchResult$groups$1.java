package kotlin.text;

import java.util.Iterator;
import kotlin.collections.AbstractCollection;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p125a5.C3975c;

public final class MatcherMatchResult$groups$1 extends AbstractCollection<C9502e> {

    /* renamed from: a */
    final /* synthetic */ MatcherMatchResult f17353a;

    MatcherMatchResult$groups$1(MatcherMatchResult matcherMatchResult) {
        this.f17353a = matcherMatchResult;
    }

    /* renamed from: b */
    public int mo37904b() {
        return this.f17353a.m23112c().groupCount() + 1;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj == null ? true : obj instanceof C9502e)) {
            return false;
        }
        return mo38447e((C9502e) obj);
    }

    /* renamed from: e */
    public /* bridge */ boolean mo38447e(C9502e eVar) {
        return super.contains(eVar);
    }

    @Nullable
    /* renamed from: g */
    public C9502e mo38448g(int i) {
        C3975c d = C9504g.m23132i(this.f17353a.m23112c(), i);
        if (d.mo26536o().intValue() < 0) {
            return null;
        }
        String group = this.f17353a.m23112c().group(i);
        C9424q.m22995d(group, "matchResult.group(index)");
        return new C9502e(group, d);
    }

    public boolean isEmpty() {
        return false;
    }

    @NotNull
    public Iterator<C9502e> iterator() {
        return C9490j.m23102g(C9309a0.m22808n(C9366s.m22924e(this)), new MatcherMatchResult$groups$1$iterator$1(this)).iterator();
    }
}
