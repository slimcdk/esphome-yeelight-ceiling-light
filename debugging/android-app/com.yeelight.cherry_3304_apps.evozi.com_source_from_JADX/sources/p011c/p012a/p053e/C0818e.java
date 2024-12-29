package p011c.p012a.p053e;

import java.util.List;

/* renamed from: c.a.e.e */
public enum C0818e {
    OTHER(Object.class),
    PURE_BARCODE(Void.class),
    POSSIBLE_FORMATS(List.class),
    TRY_HARDER(Void.class),
    CHARACTER_SET(String.class),
    ALLOWED_LENGTHS(r0),
    ASSUME_CODE_39_CHECK_DIGIT(Void.class),
    ASSUME_GS1(Void.class),
    RETURN_CODABAR_START_END(Void.class),
    NEED_RESULT_POINT_CALLBACK(C0830q.class),
    ALLOWED_EAN_EXTENSIONS(r0);
    

    /* renamed from: a */
    private final Class<?> f700a;

    private C0818e(Class<?> cls) {
        this.f700a = cls;
    }

    /* renamed from: a */
    public Class<?> mo8995a() {
        return this.f700a;
    }
}
