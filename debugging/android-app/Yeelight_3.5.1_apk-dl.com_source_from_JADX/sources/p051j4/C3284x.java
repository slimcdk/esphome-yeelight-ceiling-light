package p051j4;

import android.content.Context;
import android.os.Vibrator;

/* renamed from: j4.x */
public class C3284x {

    /* renamed from: a */
    private static Vibrator f5299a;

    /* renamed from: a */
    public static void m8851a(Context context) {
        f5299a = (Vibrator) context.getSystemService("vibrator");
    }

    /* renamed from: b */
    public static void m8852b() {
        Vibrator vibrator = f5299a;
        if (vibrator != null && vibrator.hasVibrator()) {
            f5299a.vibrate(100);
        }
    }
}
