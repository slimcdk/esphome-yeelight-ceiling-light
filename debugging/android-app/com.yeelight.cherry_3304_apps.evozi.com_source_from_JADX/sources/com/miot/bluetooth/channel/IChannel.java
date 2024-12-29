package com.miot.bluetooth.channel;

public interface IChannel {
    void onRead(byte[] bArr);

    void onRecv(byte[] bArr, int i);

    void send(byte[] bArr, int i, ChannelCallback channelCallback);

    void write(byte[] bArr, ChannelCallback channelCallback, boolean z);
}
