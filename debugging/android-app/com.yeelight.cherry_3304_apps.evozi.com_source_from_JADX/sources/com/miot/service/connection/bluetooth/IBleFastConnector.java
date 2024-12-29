package com.miot.service.connection.bluetooth;

import com.miot.service.connection.bluetooth.BLEBytesWriter;
import com.miot.service.connection.bluetooth.BleFastConnector;

public interface IBleFastConnector {
    void connect(BleFastConnector.BleFastConnectResponse bleFastConnectResponse);

    void sendRestoreCommand(BLEBytesWriter.BLEBytesWriteResponse bLEBytesWriteResponse);

    void sendRetryCommand(BLEBytesWriter.BLEBytesWriteResponse bLEBytesWriteResponse);
}
