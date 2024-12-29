package com.inuker.bluetooth.library;

import android.content.Context;
import com.inuker.bluetooth.library.connect.listener.BleConnectStatusListener;
import com.inuker.bluetooth.library.connect.listener.BluetoothStateListener;
import com.inuker.bluetooth.library.connect.options.BleConnectOptions;
import com.inuker.bluetooth.library.connect.response.BleConnectResponse;
import com.inuker.bluetooth.library.connect.response.BleNotifyResponse;
import com.inuker.bluetooth.library.connect.response.BleReadResponse;
import com.inuker.bluetooth.library.connect.response.BleReadRssiResponse;
import com.inuker.bluetooth.library.connect.response.BleUnnotifyResponse;
import com.inuker.bluetooth.library.connect.response.BleWriteResponse;
import com.inuker.bluetooth.library.receiver.listener.BluetoothBondListener;
import com.inuker.bluetooth.library.search.SearchRequest;
import com.inuker.bluetooth.library.search.response.SearchResponse;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.inuker.bluetooth.library.utils.BluetoothUtils;
import com.inuker.bluetooth.library.utils.ByteUtils;
import com.inuker.bluetooth.library.utils.proxy.ProxyUtils;
import java.util.Objects;
import java.util.UUID;

public class BluetoothClient implements IBluetoothClient {
    private IBluetoothClient mClient;

    public BluetoothClient(Context context) {
        Objects.requireNonNull(context, "Context null");
        this.mClient = BluetoothClientImpl.getInstance(context);
    }

    public void clearRequest(String str, int i) {
        this.mClient.clearRequest(str, i);
    }

    public boolean closeBluetooth() {
        return BluetoothUtils.closeBluetooth();
    }

    public void connect(String str, BleConnectOptions bleConnectOptions, BleConnectResponse bleConnectResponse) {
        BluetoothLog.m7332v(String.format("connect %s", new Object[]{str}));
        this.mClient.connect(str, bleConnectOptions, (BleConnectResponse) ProxyUtils.getUIProxy(bleConnectResponse));
    }

    public void connect(String str, BleConnectResponse bleConnectResponse) {
        connect(str, (BleConnectOptions) null, bleConnectResponse);
    }

    public void disconnect(String str) {
        BluetoothLog.m7332v(String.format("disconnect %s", new Object[]{str}));
        this.mClient.disconnect(str);
    }

    public int getConnectStatus(String str) {
        return BluetoothUtils.getConnectStatus(str);
    }

    public void indicate(String str, UUID uuid, UUID uuid2, BleNotifyResponse bleNotifyResponse) {
        BluetoothLog.m7332v(String.format("indicate %s: service = %s, character = %s", new Object[]{str, uuid, uuid2}));
        this.mClient.indicate(str, uuid, uuid2, (BleNotifyResponse) ProxyUtils.getUIProxy(bleNotifyResponse));
    }

    public boolean isBleSupported() {
        return BluetoothUtils.isBleSupported();
    }

    public boolean isBluetoothOpened() {
        return BluetoothUtils.isBluetoothEnabled();
    }

    public void notify(String str, UUID uuid, UUID uuid2, BleNotifyResponse bleNotifyResponse) {
        BluetoothLog.m7332v(String.format("notify %s: service = %s, character = %s", new Object[]{str, uuid, uuid2}));
        this.mClient.notify(str, uuid, uuid2, (BleNotifyResponse) ProxyUtils.getUIProxy(bleNotifyResponse));
    }

    public boolean openBluetooth() {
        return BluetoothUtils.openBluetooth();
    }

    public void read(String str, UUID uuid, UUID uuid2, BleReadResponse bleReadResponse) {
        BluetoothLog.m7332v(String.format("read character for %s: service = %s, character = %s", new Object[]{str, uuid, uuid2}));
        this.mClient.read(str, uuid, uuid2, (BleReadResponse) ProxyUtils.getUIProxy(bleReadResponse));
    }

    public void readDescriptor(String str, UUID uuid, UUID uuid2, UUID uuid3, BleReadResponse bleReadResponse) {
        BluetoothLog.m7332v(String.format("readDescriptor for %s: service = %s, character = %s", new Object[]{str, uuid, uuid2}));
        this.mClient.readDescriptor(str, uuid, uuid2, uuid3, (BleReadResponse) ProxyUtils.getUIProxy(bleReadResponse));
    }

    public void readRssi(String str, BleReadRssiResponse bleReadRssiResponse) {
        BluetoothLog.m7332v(String.format("readRssi %s", new Object[]{str}));
        this.mClient.readRssi(str, (BleReadRssiResponse) ProxyUtils.getUIProxy(bleReadRssiResponse));
    }

    public void registerBluetoothBondListener(BluetoothBondListener bluetoothBondListener) {
        this.mClient.registerBluetoothBondListener(bluetoothBondListener);
    }

    public void registerBluetoothStateListener(BluetoothStateListener bluetoothStateListener) {
        this.mClient.registerBluetoothStateListener(bluetoothStateListener);
    }

    public void registerConnectStatusListener(String str, BleConnectStatusListener bleConnectStatusListener) {
        this.mClient.registerConnectStatusListener(str, bleConnectStatusListener);
    }

    public void search(SearchRequest searchRequest, SearchResponse searchResponse) {
        BluetoothLog.m7332v(String.format("search %s", new Object[]{searchRequest}));
        this.mClient.search(searchRequest, (SearchResponse) ProxyUtils.getUIProxy(searchResponse));
    }

    public void stopSearch() {
        BluetoothLog.m7332v(String.format("stopSearch", new Object[0]));
        this.mClient.stopSearch();
    }

    public void unindicate(String str, UUID uuid, UUID uuid2, BleUnnotifyResponse bleUnnotifyResponse) {
        BluetoothLog.m7332v(String.format("indicate %s: service = %s, character = %s", new Object[]{str, uuid, uuid2}));
        unindicate(str, uuid, uuid2, (BleUnnotifyResponse) ProxyUtils.getUIProxy(bleUnnotifyResponse));
    }

    public void unnotify(String str, UUID uuid, UUID uuid2, BleUnnotifyResponse bleUnnotifyResponse) {
        BluetoothLog.m7332v(String.format("unnotify %s: service = %s, character = %s", new Object[]{str, uuid, uuid2}));
        this.mClient.unnotify(str, uuid, uuid2, (BleUnnotifyResponse) ProxyUtils.getUIProxy(bleUnnotifyResponse));
    }

    public void unregisterBluetoothBondListener(BluetoothBondListener bluetoothBondListener) {
        this.mClient.unregisterBluetoothBondListener(bluetoothBondListener);
    }

    public void unregisterBluetoothStateListener(BluetoothStateListener bluetoothStateListener) {
        this.mClient.unregisterBluetoothStateListener(bluetoothStateListener);
    }

    public void unregisterConnectStatusListener(String str, BleConnectStatusListener bleConnectStatusListener) {
        this.mClient.unregisterConnectStatusListener(str, bleConnectStatusListener);
    }

    public void write(String str, UUID uuid, UUID uuid2, byte[] bArr, BleWriteResponse bleWriteResponse) {
        BluetoothLog.m7332v(String.format("write character for %s: service = %s, character = %s, value = %s", new Object[]{str, uuid, uuid2, ByteUtils.byteToString(bArr)}));
        this.mClient.write(str, uuid, uuid2, bArr, (BleWriteResponse) ProxyUtils.getUIProxy(bleWriteResponse));
    }

    public void writeDescriptor(String str, UUID uuid, UUID uuid2, UUID uuid3, byte[] bArr, BleWriteResponse bleWriteResponse) {
        BluetoothLog.m7332v(String.format("writeDescriptor for %s: service = %s, character = %s", new Object[]{str, uuid, uuid2}));
        this.mClient.writeDescriptor(str, uuid, uuid2, uuid3, bArr, (BleWriteResponse) ProxyUtils.getUIProxy(bleWriteResponse));
    }

    public void writeNoRsp(String str, UUID uuid, UUID uuid2, byte[] bArr, BleWriteResponse bleWriteResponse) {
        BluetoothLog.m7332v(String.format("writeNoRsp %s: service = %s, character = %s, value = %s", new Object[]{str, uuid, uuid2, ByteUtils.byteToString(bArr)}));
        this.mClient.writeNoRsp(str, uuid, uuid2, bArr, (BleWriteResponse) ProxyUtils.getUIProxy(bleWriteResponse));
    }

    public void writeNoRspFast(String str, UUID uuid, UUID uuid2, byte[] bArr, BleWriteResponse bleWriteResponse) {
        BluetoothLog.m7332v(String.format("writeNoRspFast %s: service = %s, character = %s, value = %s", new Object[]{str, uuid, uuid2, ByteUtils.byteToString(bArr)}));
        this.mClient.writeNoRspFast(str, uuid, uuid2, bArr, (BleWriteResponse) ProxyUtils.getUIProxy(bleWriteResponse));
    }
}
