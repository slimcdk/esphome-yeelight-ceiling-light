package p208s4;

import java.io.CharConversionException;
import java.io.OutputStream;
import java.text.MessageFormat;
import java.util.ResourceBundle;

/* renamed from: s4.n */
public abstract class C10362n extends OutputStream {

    /* renamed from: a */
    private static ResourceBundle f19446a = ResourceBundle.getBundle("javax.servlet.LocalStrings");

    protected C10362n() {
    }

    /* renamed from: a */
    public void mo39911a(String str) {
        if (str == null) {
            str = "null";
        }
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if ((65280 & charAt) == 0) {
                write(charAt);
                i++;
            } else {
                throw new CharConversionException(MessageFormat.format(f19446a.getString("err.not_iso8859_1"), new Object[]{new Character(charAt)}));
            }
        }
    }
}
