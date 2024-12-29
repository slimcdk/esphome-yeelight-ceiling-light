package p154d.p198a.p199g;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.p271io.FilenameUtils;
import org.apache.commons.p271io.IOUtils;

/* renamed from: d.a.g.e */
public abstract class C10625e {

    /* renamed from: a */
    private int f20318a;

    /* renamed from: b */
    boolean f20319b;

    /* renamed from: c */
    private int f20320c;

    /* renamed from: d */
    protected final List<C10628g> f20321d = Collections.synchronizedList(new LinkedList());

    /* renamed from: e */
    protected final List<C10637h> f20322e = Collections.synchronizedList(new LinkedList());

    /* renamed from: f */
    protected final List<C10637h> f20323f = Collections.synchronizedList(new LinkedList());

    /* renamed from: g */
    protected final List<C10637h> f20324g = Collections.synchronizedList(new LinkedList());

    protected C10625e(int i, int i2, boolean z) {
        this.f20320c = i;
        this.f20318a = i2;
        this.f20319b = z;
    }

    /* renamed from: a */
    public Collection<? extends C10637h> mo33560a() {
        return this.f20324g;
    }

    /* renamed from: b */
    public Collection<? extends C10637h> mo33561b() {
        ArrayList arrayList = new ArrayList(this.f20322e.size() + this.f20323f.size() + this.f20324g.size());
        arrayList.addAll(this.f20322e);
        arrayList.addAll(this.f20323f);
        arrayList.addAll(this.f20324g);
        return arrayList;
    }

    /* renamed from: c */
    public Collection<? extends C10637h> mo33562c() {
        return this.f20322e;
    }

    /* renamed from: d */
    public Collection<? extends C10637h> mo33563d() {
        return this.f20323f;
    }

    /* renamed from: e */
    public int mo33564e() {
        return this.f20320c;
    }

    /* renamed from: f */
    public int mo33565f() {
        if (this.f20319b) {
            return 0;
        }
        return this.f20318a;
    }

    /* renamed from: g */
    public int mo33566g() {
        return mo33560a().size();
    }

    /* renamed from: h */
    public int mo33567h() {
        return mo33562c().size();
    }

    /* renamed from: i */
    public int mo33568i() {
        return mo33563d().size();
    }

    /* renamed from: j */
    public int mo33569j() {
        return mo33570k().size();
    }

    /* renamed from: k */
    public Collection<? extends C10628g> mo33570k() {
        return this.f20321d;
    }

    /* renamed from: l */
    public boolean mo33571l() {
        return ((mo33569j() + mo33567h()) + mo33568i()) + mo33566g() == 0;
    }

    /* renamed from: m */
    public boolean mo33572m() {
        return this.f20319b;
    }

    /* renamed from: n */
    public boolean mo33573n() {
        return (this.f20320c & 32768) == 0;
    }

    /* renamed from: o */
    public boolean mo33574o() {
        return (this.f20320c & 512) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public String mo33575p() {
        StringBuffer stringBuffer = new StringBuffer(200);
        stringBuffer.append(toString());
        stringBuffer.append(IOUtils.LINE_SEPARATOR_UNIX);
        for (C10628g append : this.f20321d) {
            stringBuffer.append("\tquestion:      ");
            stringBuffer.append(append);
            stringBuffer.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        for (C10637h append2 : this.f20322e) {
            stringBuffer.append("\tanswer:        ");
            stringBuffer.append(append2);
            stringBuffer.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        for (C10637h append3 : this.f20323f) {
            stringBuffer.append("\tauthoritative: ");
            stringBuffer.append(append3);
            stringBuffer.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        for (C10637h append4 : this.f20324g) {
            stringBuffer.append("\tadditional:    ");
            stringBuffer.append(append4);
            stringBuffer.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        return stringBuffer.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public String mo33576q(byte[] bArr) {
        StringBuilder sb = new StringBuilder(4000);
        int length = bArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int min = Math.min(32, length - i);
            if (i < 16) {
                sb.append(' ');
            }
            if (i < 256) {
                sb.append(' ');
            }
            if (i < 4096) {
                sb.append(' ');
            }
            sb.append(Integer.toHexString(i));
            sb.append(':');
            int i2 = 0;
            while (i2 < min) {
                if (i2 % 8 == 0) {
                    sb.append(' ');
                }
                int i3 = i + i2;
                sb.append(Integer.toHexString((bArr[i3] & 240) >> 4));
                sb.append(Integer.toHexString((bArr[i3] & ParameterInitDefType.CubemapSamplerInit) >> 0));
                i2++;
            }
            if (i2 < 32) {
                while (i2 < 32) {
                    if (i2 % 8 == 0) {
                        sb.append(' ');
                    }
                    sb.append("  ");
                    i2++;
                }
            }
            sb.append("    ");
            for (int i4 = 0; i4 < min; i4++) {
                if (i4 % 8 == 0) {
                    sb.append(' ');
                }
                byte b = bArr[i + i4] & 255;
                sb.append((b <= 32 || b >= Byte.MAX_VALUE) ? FilenameUtils.EXTENSION_SEPARATOR : (char) b);
            }
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            i += 32;
            if (i >= 2048) {
                sb.append("....\n");
                break;
            }
        }
        return sb.toString();
    }

    /* renamed from: r */
    public void mo33577r(int i) {
        this.f20320c = i;
    }

    /* renamed from: s */
    public void mo33578s(int i) {
        this.f20318a = i;
    }
}
