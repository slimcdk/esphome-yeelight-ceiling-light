package org.fourthline.cling.model.types;

import java.net.URI;
import java.net.URISyntaxException;

/* renamed from: org.fourthline.cling.model.types.a0 */
public class C10074a0 extends C10073a<URI> {
    /* renamed from: i */
    public URI mo40561f(String str) {
        if (str.equals("")) {
            return null;
        }
        try {
            return new URI(str);
        } catch (URISyntaxException e) {
            throw new InvalidValueException(e.getMessage(), e);
        }
    }
}
