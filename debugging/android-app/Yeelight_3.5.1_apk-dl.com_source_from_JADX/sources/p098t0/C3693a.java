package p098t0;

import com.google.code.microlog4android.Level;
import com.google.code.microlog4android.format.command.util.StringUtil;
import java.io.PrintStream;

/* renamed from: t0.a */
public class C3693a implements C3696d {

    /* renamed from: a */
    private int f6211a = 1;

    /* renamed from: a */
    public String mo26104a(String str, String str2, long j, Level level, Object obj, Throwable th) {
        if (str2 == null) {
            return "";
        }
        int i = this.f6211a;
        return i == -1 ? str2 : StringUtil.extractPartialClassName(str2, i);
    }

    /* renamed from: b */
    public void mo26105b(String str) {
        try {
            this.f6211a = Integer.parseInt(str);
            PrintStream printStream = System.out;
            printStream.println("Precision specifier for %c is " + this.f6211a);
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to parse the specifier for the %c pattern ");
            sb.append(e);
        }
    }
}
