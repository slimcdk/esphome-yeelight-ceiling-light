package javax.jmdns.impl;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.p194io.FilenameUtils;
import org.apache.commons.p194io.IOUtils;

/* renamed from: javax.jmdns.impl.e */
public abstract class C9247e {

    /* renamed from: a */
    private int f17145a;

    /* renamed from: b */
    boolean f17146b;

    /* renamed from: c */
    private int f17147c;

    /* renamed from: d */
    protected final List<C9250g> f17148d = Collections.synchronizedList(new LinkedList());

    /* renamed from: e */
    protected final List<C9259h> f17149e = Collections.synchronizedList(new LinkedList());

    /* renamed from: f */
    protected final List<C9259h> f17150f = Collections.synchronizedList(new LinkedList());

    /* renamed from: g */
    protected final List<C9259h> f17151g = Collections.synchronizedList(new LinkedList());

    protected C9247e(int i, int i2, boolean z) {
        this.f17147c = i;
        this.f17145a = i2;
        this.f17146b = z;
    }

    /* renamed from: a */
    public Collection<? extends C9259h> mo37619a() {
        return this.f17151g;
    }

    /* renamed from: b */
    public Collection<? extends C9259h> mo37620b() {
        ArrayList arrayList = new ArrayList(this.f17149e.size() + this.f17150f.size() + this.f17151g.size());
        arrayList.addAll(this.f17149e);
        arrayList.addAll(this.f17150f);
        arrayList.addAll(this.f17151g);
        return arrayList;
    }

    /* renamed from: c */
    public Collection<? extends C9259h> mo37621c() {
        return this.f17149e;
    }

    /* renamed from: d */
    public Collection<? extends C9259h> mo37622d() {
        return this.f17150f;
    }

    /* renamed from: e */
    public int mo37623e() {
        return this.f17147c;
    }

    /* renamed from: f */
    public int mo37624f() {
        if (this.f17146b) {
            return 0;
        }
        return this.f17145a;
    }

    /* renamed from: g */
    public int mo37625g() {
        return mo37619a().size();
    }

    /* renamed from: h */
    public int mo37626h() {
        return mo37621c().size();
    }

    /* renamed from: i */
    public int mo37627i() {
        return mo37622d().size();
    }

    /* renamed from: j */
    public int mo37628j() {
        return mo37629k().size();
    }

    /* renamed from: k */
    public Collection<? extends C9250g> mo37629k() {
        return this.f17148d;
    }

    /* renamed from: l */
    public boolean mo37630l() {
        return ((mo37628j() + mo37626h()) + mo37627i()) + mo37625g() == 0;
    }

    /* renamed from: m */
    public boolean mo37631m() {
        return this.f17146b;
    }

    /* renamed from: n */
    public boolean mo37632n() {
        return (this.f17147c & 32768) == 0;
    }

    /* renamed from: o */
    public boolean mo37633o() {
        return (this.f17147c & 512) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public String mo37634p() {
        StringBuffer stringBuffer = new StringBuffer(200);
        stringBuffer.append(toString());
        stringBuffer.append(IOUtils.LINE_SEPARATOR_UNIX);
        for (C9250g append : this.f17148d) {
            stringBuffer.append("\tquestion:      ");
            stringBuffer.append(append);
            stringBuffer.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        for (C9259h append2 : this.f17149e) {
            stringBuffer.append("\tanswer:        ");
            stringBuffer.append(append2);
            stringBuffer.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        for (C9259h append3 : this.f17150f) {
            stringBuffer.append("\tauthoritative: ");
            stringBuffer.append(append3);
            stringBuffer.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        for (C9259h append4 : this.f17151g) {
            stringBuffer.append("\tadditional:    ");
            stringBuffer.append(append4);
            stringBuffer.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        return stringBuffer.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public String mo37635q(byte[] bArr) {
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
    public void mo37636r(int i) {
        this.f17147c = i;
    }

    /* renamed from: s */
    public void mo37637s(int i) {
        this.f17145a = i;
    }
}
