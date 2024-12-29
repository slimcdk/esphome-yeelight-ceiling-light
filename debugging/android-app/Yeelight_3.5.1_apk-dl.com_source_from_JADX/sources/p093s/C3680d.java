package p093s;

import androidx.annotation.WorkerThread;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import p036g0.C3215i;

/* renamed from: s.d */
public final class C3680d {
    @WorkerThread
    /* renamed from: a */
    public static final void m10522a(String str) {
        HttpURLConnection httpURLConnection;
        try {
            C3215i.m8645b(263);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
                sb.append("Received non-success response code ");
                sb.append(responseCode);
                sb.append(" from pinging URL: ");
                sb.append(str);
            }
            httpURLConnection.disconnect();
            C3215i.m8644a();
        } catch (IndexOutOfBoundsException e) {
            String message = e.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message).length());
            sb2.append("Error while parsing ping URL: ");
            sb2.append(str);
            sb2.append(". ");
            sb2.append(message);
            C3215i.m8644a();
        } catch (IOException | RuntimeException e2) {
            try {
                String message2 = e2.getMessage();
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message2).length());
                sb3.append("Error while pinging URL: ");
                sb3.append(str);
                sb3.append(". ");
                sb3.append(message2);
            } finally {
                C3215i.m8644a();
            }
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
