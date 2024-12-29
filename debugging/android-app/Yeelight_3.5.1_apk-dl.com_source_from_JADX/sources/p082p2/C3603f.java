package p082p2;

import com.google.zxing.qrcode.decoder.C2627g;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;

/* renamed from: p2.f */
public final class C3603f {

    /* renamed from: a */
    private Mode f6009a;

    /* renamed from: b */
    private ErrorCorrectionLevel f6010b;

    /* renamed from: c */
    private C2627g f6011c;

    /* renamed from: d */
    private int f6012d = -1;

    /* renamed from: e */
    private C3598b f6013e;

    /* renamed from: b */
    public static boolean m10248b(int i) {
        return i >= 0 && i < 8;
    }

    /* renamed from: a */
    public C3598b mo25906a() {
        return this.f6013e;
    }

    /* renamed from: c */
    public void mo25907c(ErrorCorrectionLevel errorCorrectionLevel) {
        this.f6010b = errorCorrectionLevel;
    }

    /* renamed from: d */
    public void mo25908d(int i) {
        this.f6012d = i;
    }

    /* renamed from: e */
    public void mo25909e(C3598b bVar) {
        this.f6013e = bVar;
    }

    /* renamed from: f */
    public void mo25910f(Mode mode) {
        this.f6009a = mode;
    }

    /* renamed from: g */
    public void mo25911g(C2627g gVar) {
        this.f6011c = gVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.f6009a);
        sb.append("\n ecLevel: ");
        sb.append(this.f6010b);
        sb.append("\n version: ");
        sb.append(this.f6011c);
        sb.append("\n maskPattern: ");
        sb.append(this.f6012d);
        if (this.f6013e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.f6013e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
