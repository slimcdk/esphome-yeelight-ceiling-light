package kotlin.text;

import java.util.Map;
import kotlin.C9396d;
import kotlin.jvm.internal.C9422o;
import org.jetbrains.annotations.NotNull;

public enum CharDirectionality {
    UNDEFINED(-1),
    LEFT_TO_RIGHT(0),
    RIGHT_TO_LEFT(1),
    RIGHT_TO_LEFT_ARABIC(2),
    EUROPEAN_NUMBER(3),
    EUROPEAN_NUMBER_SEPARATOR(4),
    EUROPEAN_NUMBER_TERMINATOR(5),
    ARABIC_NUMBER(6),
    COMMON_NUMBER_SEPARATOR(7),
    NONSPACING_MARK(8),
    BOUNDARY_NEUTRAL(9),
    PARAGRAPH_SEPARATOR(10),
    SEGMENT_SEPARATOR(11),
    WHITESPACE(12),
    OTHER_NEUTRALS(13),
    LEFT_TO_RIGHT_EMBEDDING(14),
    LEFT_TO_RIGHT_OVERRIDE(15),
    RIGHT_TO_LEFT_EMBEDDING(16),
    RIGHT_TO_LEFT_OVERRIDE(17),
    POP_DIRECTIONAL_FORMAT(18);
    
    @NotNull
    public static final C9495a Companion = null;
    /* access modifiers changed from: private */
    @NotNull
    public static final C9396d<Map<Integer, CharDirectionality>> directionalityMap$delegate = null;
    private final int value;

    /* renamed from: kotlin.text.CharDirectionality$a */
    public static final class C9495a {
        private C9495a() {
        }

        public /* synthetic */ C9495a(C9422o oVar) {
            this();
        }
    }

    static {
        Companion = new C9495a((C9422o) null);
        directionalityMap$delegate = C9398f.m22952a(CharDirectionality$Companion$directionalityMap$2.INSTANCE);
    }

    private CharDirectionality(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
