package kotlin.text;

/* renamed from: kotlin.text.c */
class C9500c extends C9499b {
    /* renamed from: c */
    public static final boolean m23122c(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
