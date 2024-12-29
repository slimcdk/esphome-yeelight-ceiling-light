package p011c.p012a.p019b.p028b.p029a.p030a;

import android.net.Uri;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* renamed from: c.a.b.b.a.a.b */
final class C0559b extends Thread {

    /* renamed from: a */
    private final /* synthetic */ Map f224a;

    C0559b(C0556a aVar, Map map) {
        this.f224a = map;
    }

    public final void run() {
        String message;
        StringBuilder sb;
        String str;
        HttpURLConnection httpURLConnection;
        Map map = this.f224a;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str2 : map.keySet()) {
            buildUpon.appendQueryParameter(str2, (String) map.get(str2));
        }
        String uri = buildUpon.build().toString();
        try {
            httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(uri).length() + 65);
                sb2.append("Received non-success response code ");
                sb2.append(responseCode);
                sb2.append(" from pinging URL: ");
                sb2.append(uri);
                sb2.toString();
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e) {
            message = e.getMessage();
            sb = new StringBuilder(String.valueOf(uri).length() + 32 + String.valueOf(message).length());
            str = "Error while parsing ping URL: ";
            sb.append(str);
            sb.append(uri);
            sb.append(". ");
            sb.append(message);
            sb.toString();
        } catch (IOException | RuntimeException e2) {
            message = e2.getMessage();
            sb = new StringBuilder(String.valueOf(uri).length() + 27 + String.valueOf(message).length());
            str = "Error while pinging URL: ";
            sb.append(str);
            sb.append(uri);
            sb.append(". ");
            sb.append(message);
            sb.toString();
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
