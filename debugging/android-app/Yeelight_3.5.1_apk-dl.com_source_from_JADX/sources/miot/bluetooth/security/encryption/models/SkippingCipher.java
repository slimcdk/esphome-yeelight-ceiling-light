package miot.bluetooth.security.encryption.models;

public interface SkippingCipher {
    long getPosition();

    long seekTo(long j);

    long skip(long j);
}
