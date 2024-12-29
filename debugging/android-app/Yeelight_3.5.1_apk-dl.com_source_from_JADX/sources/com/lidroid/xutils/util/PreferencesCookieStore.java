package com.lidroid.xutils.util;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.cookie.BasicClientCookie;

public class PreferencesCookieStore implements CookieStore {

    public class SerializableCookie implements Serializable {
        private static final long serialVersionUID = 6374381828722046732L;
        private transient BasicClientCookie clientCookie;
        private final transient Cookie cookie;
        final /* synthetic */ PreferencesCookieStore this$0;

        public SerializableCookie(PreferencesCookieStore preferencesCookieStore, Cookie cookie2) {
            this.cookie = cookie2;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            BasicClientCookie basicClientCookie = new BasicClientCookie((String) objectInputStream.readObject(), (String) objectInputStream.readObject());
            this.clientCookie = basicClientCookie;
            basicClientCookie.setComment((String) objectInputStream.readObject());
            this.clientCookie.setDomain((String) objectInputStream.readObject());
            this.clientCookie.setExpiryDate((Date) objectInputStream.readObject());
            this.clientCookie.setPath((String) objectInputStream.readObject());
            this.clientCookie.setVersion(objectInputStream.readInt());
            this.clientCookie.setSecure(objectInputStream.readBoolean());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.writeObject(this.cookie.getName());
            objectOutputStream.writeObject(this.cookie.getValue());
            objectOutputStream.writeObject(this.cookie.getComment());
            objectOutputStream.writeObject(this.cookie.getDomain());
            objectOutputStream.writeObject(this.cookie.getExpiryDate());
            objectOutputStream.writeObject(this.cookie.getPath());
            objectOutputStream.writeInt(this.cookie.getVersion());
            objectOutputStream.writeBoolean(this.cookie.isSecure());
        }

        public Cookie getCookie() {
            Cookie cookie2 = this.cookie;
            Cookie cookie3 = this.clientCookie;
            return cookie3 != null ? cookie3 : cookie2;
        }
    }
}
