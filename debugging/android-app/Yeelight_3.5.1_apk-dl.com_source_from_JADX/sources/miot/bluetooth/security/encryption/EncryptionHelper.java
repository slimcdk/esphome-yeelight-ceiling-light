package miot.bluetooth.security.encryption;

import android.content.SharedPreferences;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EncryptionHelper {
    private boolean encryptKeys;
    private EncryptionAlgorithm encryption;

    public EncryptionHelper(EncryptionAlgorithm encryptionAlgorithm, boolean z) {
        this.encryption = encryptionAlgorithm;
        this.encryptKeys = z;
    }

    private ObjectInputStream createDecodedObjectStream(String str) {
        try {
            return new ObjectInputStream(new ByteArrayInputStream(this.encryption.decrypt(Base64.decode(str, 2))));
        } catch (IOException e) {
            throw new EncryptionException((Throwable) e);
        }
    }

    private ObjectInputStream readDecoded(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(str, (String) null);
        if (string == null) {
            return null;
        }
        try {
            return createDecodedObjectStream(string);
        } catch (EncryptionException e) {
            e.printStackTrace();
            return null;
        }
    }

    public <T> String encode(T t) {
        if (t != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                new ObjectOutputStream(byteArrayOutputStream).writeObject(t);
                return Base64.encodeToString(this.encryption.encrypt(byteArrayOutputStream.toByteArray()), 2);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (EncryptionException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public String getKey(String str) {
        return this.encryptKeys ? encode(str) : str;
    }

    public <T> T readAndDecodeTemplate(SharedPreferences sharedPreferences, String str, T t) {
        ObjectInputStream readDecoded = readDecoded(sharedPreferences, str);
        if (readDecoded == null) {
            return t;
        }
        try {
            return readDecoded.readObject();
        } catch (IOException e) {
            e.printStackTrace();
            return t;
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
            return t;
        }
    }
}
