package org.fourthline.cling.protocol;

public class ProtocolCreationException extends Exception {
    public ProtocolCreationException(String str) {
        super(str);
    }

    public ProtocolCreationException(String str, Throwable th) {
        super(str, th);
    }
}
