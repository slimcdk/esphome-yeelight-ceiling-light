package androidx.constraintlayout.core.parser;

import androidx.core.p007os.EnvironmentCompat;

public class CLParsingException extends Exception {
    private final String mElementClass;
    private final int mLineNumber;
    private final String mReason;

    public CLParsingException(String str, CLElement cLElement) {
        int i;
        this.mReason = str;
        if (cLElement != null) {
            this.mElementClass = cLElement.getStrClass();
            i = cLElement.getLine();
        } else {
            this.mElementClass = EnvironmentCompat.MEDIA_UNKNOWN;
            i = 0;
        }
        this.mLineNumber = i;
    }

    public String reason() {
        return this.mReason + " (" + this.mElementClass + " at line " + this.mLineNumber + ")";
    }

    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + reason();
    }
}
