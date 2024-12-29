package com.miot.bluetooth.channel.manager;

import android.os.Bundle;
import android.os.RemoteException;
import com.inuker.bluetooth.library.IResponse;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.miot.bluetooth.channel.Channel;
import com.miot.bluetooth.channel.ChannelCallback;
import com.xiaomi.smarthome.core.server.bluetooth.IBleChannelReader;
import com.xiaomi.smarthome.core.server.bluetooth.IBleChannelWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public abstract class ChannelManager {
    private ConcurrentMap<String, BleChannel> mChannels = new ConcurrentHashMap();

    public static class BleChannel extends Channel {
        private ChannelManager channelManager;
        private String mac;
        private List<IBleChannelReader> readers = new ArrayList();
        private boolean useCrc32;
        /* access modifiers changed from: private */
        public IBleChannelWriter writer = new IBleChannelWriter.Stub() {
            public void write(byte[] bArr, int i, final IResponse iResponse) {
                BleChannel.this.send(bArr, i, new ChannelCallback() {
                    public void onCallback(int i) {
                        try {
                            if (iResponse != null) {
                                iResponse.onResponse(i, (Bundle) null);
                            }
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        };

        BleChannel(String str, ChannelManager channelManager2, boolean z) {
            this.mac = str;
            this.channelManager = channelManager2;
            this.useCrc32 = z;
        }

        /* access modifiers changed from: package-private */
        public void addReader(IBleChannelReader iBleChannelReader) {
            if (iBleChannelReader != null) {
                Iterator<IBleChannelReader> it = this.readers.iterator();
                while (it.hasNext()) {
                    IBleChannelReader next = it.next();
                    if (next != null && next.asBinder() != null && next.asBinder().equals(iBleChannelReader.asBinder())) {
                        return;
                    }
                    if (next == null || next.asBinder() == null) {
                        it.remove();
                    }
                }
                this.readers.add(iBleChannelReader);
            }
        }

        public void onRecv(byte[] bArr, int i) {
            for (IBleChannelReader next : this.readers) {
                if (next != null) {
                    try {
                        next.onRead(this.mac, bArr, i);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void removeReader(IBleChannelReader iBleChannelReader) {
            if (iBleChannelReader != null) {
                this.readers.remove(iBleChannelReader);
            }
        }

        public boolean useCrc32Verify() {
            return this.useCrc32;
        }

        public void write(byte[] bArr, ChannelCallback channelCallback, boolean z) {
            this.channelManager.writeBle(this.mac, bArr, channelCallback, z);
        }
    }

    public static abstract class BleChannelReader extends IBleChannelReader.Stub {
    }

    public synchronized BleChannel getChannel(String str) {
        return (BleChannel) this.mChannels.get(str);
    }

    public synchronized IBleChannelWriter getWriter(String str) {
        BleChannel bleChannel = (BleChannel) this.mChannels.get(str);
        if (bleChannel == null) {
            return null;
        }
        return bleChannel.writer;
    }

    public synchronized IBleChannelWriter registerChannelReader(String str, IBleChannelReader iBleChannelReader) {
        BleChannel bleChannel;
        BluetoothLog.m10338v(String.format("registerChannelReader mac = ", new Object[]{str}));
        bleChannel = (BleChannel) this.mChannels.get(str);
        if (bleChannel == null) {
            bleChannel = new BleChannel(str, this, useCrc32Verify());
            this.mChannels.put(str, bleChannel);
        }
        bleChannel.addReader(iBleChannelReader);
        return bleChannel.writer;
    }

    public synchronized void unregisterChannelReader(String str, IBleChannelReader iBleChannelReader) {
        BleChannel bleChannel = (BleChannel) this.mChannels.get(str);
        if (bleChannel != null) {
            bleChannel.removeReader(iBleChannelReader);
        }
    }

    public abstract boolean useCrc32Verify();

    public abstract void writeBle(String str, byte[] bArr, ChannelCallback channelCallback, boolean z);
}
