package androidx.constraintlayout.core.parser;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;

public class CLKey extends CLContainer {
    private static ArrayList<String> sections;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        sections = arrayList;
        arrayList.add("ConstraintSets");
        sections.add("Variables");
        sections.add("Generate");
        sections.add(TypedValues.TransitionType.NAME);
        sections.add("KeyFrames");
        sections.add(TypedValues.AttributesType.NAME);
        sections.add("KeyPositions");
        sections.add("KeyCycles");
    }

    public CLKey(char[] cArr) {
        super(cArr);
    }

    public static CLElement allocate(String str, CLElement cLElement) {
        CLKey cLKey = new CLKey(str.toCharArray());
        cLKey.setStart(0);
        cLKey.setEnd((long) (str.length() - 1));
        cLKey.set(cLElement);
        return cLKey;
    }

    public static CLElement allocate(char[] cArr) {
        return new CLKey(cArr);
    }

    public String getName() {
        return content();
    }

    public CLElement getValue() {
        if (this.mElements.size() > 0) {
            return this.mElements.get(0);
        }
        return null;
    }

    public void set(CLElement cLElement) {
        if (this.mElements.size() > 0) {
            this.mElements.set(0, cLElement);
        } else {
            this.mElements.add(cLElement);
        }
    }

    /* access modifiers changed from: protected */
    public String toFormattedJSON(int i, int i2) {
        StringBuilder sb = new StringBuilder(getDebugName());
        addIndent(sb, i);
        String content = content();
        if (this.mElements.size() > 0) {
            sb.append(content);
            sb.append(": ");
            if (sections.contains(content)) {
                i2 = 3;
            }
            if (i2 <= 0) {
                String json = this.mElements.get(0).toJSON();
                if (json.length() + i < CLElement.MAX_LINE) {
                    sb.append(json);
                    return sb.toString();
                }
            }
            sb.append(this.mElements.get(0).toFormattedJSON(i, i2 - 1));
            return sb.toString();
        }
        return content + ": <> ";
    }

    /* access modifiers changed from: protected */
    public String toJSON() {
        StringBuilder sb;
        String str;
        if (this.mElements.size() > 0) {
            sb = new StringBuilder();
            sb.append(getDebugName());
            sb.append(content());
            sb.append(": ");
            str = this.mElements.get(0).toJSON();
        } else {
            sb = new StringBuilder();
            sb.append(getDebugName());
            sb.append(content());
            str = ": <> ";
        }
        sb.append(str);
        return sb.toString();
    }
}
