package miot.bluetooth.security;

import com.miot.bluetooth.BleSecurityConnectResponse;

public interface ISecurityConnect {
    void connect(BleSecurityConnectResponse bleSecurityConnectResponse);

    void disconnect();
}
