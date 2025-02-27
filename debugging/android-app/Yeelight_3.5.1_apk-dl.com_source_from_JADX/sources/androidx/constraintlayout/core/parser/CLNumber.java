package androidx.constraintlayout.core.parser;

public class CLNumber extends CLElement {
    float value = Float.NaN;

    public CLNumber(float f) {
        super((char[]) null);
        this.value = f;
    }

    public CLNumber(char[] cArr) {
        super(cArr);
    }

    public static CLElement allocate(char[] cArr) {
        return new CLNumber(cArr);
    }

    public float getFloat() {
        if (Float.isNaN(this.value)) {
            this.value = Float.parseFloat(content());
        }
        return this.value;
    }

    public int getInt() {
        if (Float.isNaN(this.value)) {
            this.value = (float) Integer.parseInt(content());
        }
        return (int) this.value;
    }

    public boolean isInt() {
        float f = getFloat();
        return ((float) ((int) f)) == f;
    }

    public void putValue(float f) {
        this.value = f;
    }

    /* access modifiers changed from: protected */
    public String toFormattedJSON(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        addIndent(sb, i);
        float f = getFloat();
        int i3 = (int) f;
        if (((float) i3) == f) {
            sb.append(i3);
        } else {
            sb.append(f);
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public String toJSON() {
        float f = getFloat();
        int i = (int) f;
        if (((float) i) == f) {
            return "" + i;
        }
        return "" + f;
    }
}
