package com.miot.bluetooth.channel;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import com.inuker.bluetooth.library.BluetoothContext;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.inuker.bluetooth.library.utils.ByteUtils;
import com.inuker.bluetooth.library.utils.MessageHandlerThread;
import com.inuker.bluetooth.library.utils.proxy.ProxyBulk;
import com.inuker.bluetooth.library.utils.proxy.ProxyInterceptor;
import com.inuker.bluetooth.library.utils.proxy.ProxyUtils;
import com.miot.bluetooth.channel.Timer;
import com.miot.bluetooth.channel.packet.ACKPacket;
import com.miot.bluetooth.channel.packet.CTRPacket;
import com.miot.bluetooth.channel.packet.DataPacket;
import com.miot.bluetooth.channel.packet.Packet;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.TimeoutException;

public abstract class Channel implements IChannel, ProxyInterceptor {
    public static final boolean DEBUG = true;
    private static final int MSG_WRITE_CALLBACK = 1;
    private static final long TIMEOUT = 6000;
    private static final String TIMER_EXCEPTION = "exception";
    private final ChannelStateBlock[] STATE_MACHINE = {new ChannelStateBlock(ChannelState.READY, ChannelEvent.SEND_CTR, this.mWaitStartACKHandler), new ChannelStateBlock(ChannelState.WAIT_START_ACK, ChannelEvent.RECV_ACK, this.mRecvACKHandler), new ChannelStateBlock(ChannelState.SYNC, ChannelEvent.RECV_ACK, this.mRecvACKHandler), new ChannelStateBlock(ChannelState.IDLE, ChannelEvent.RECV_CTR, this.mRecvCTRHandler), new ChannelStateBlock(ChannelState.READING, ChannelEvent.RECV_DATA, this.mRecvDataHandler), new ChannelStateBlock(ChannelState.SYNC_ACK, ChannelEvent.RECV_DATA, this.mSyncPacketHandler)};
    private byte[] mBytesToWrite;
    private final Handler.Callback mCallback = new Handler.Callback() {
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                ProxyBulk.safeInvoke(message.obj);
                return false;
            }
            ((ChannelCallback) message.obj).onCallback(message.arg1);
            return false;
        }
    };
    private IChannel mChannel = ((IChannel) ProxyUtils.getProxy(this.mChannelImpl, IChannel.class, this));
    private ChannelCallback mChannelCallback;
    private final IChannel mChannelImpl = new IChannel() {
        public void onRead(byte[] bArr) {
            Channel.this.performOnRead(bArr);
        }

        public void onRecv(byte[] bArr, int i) {
            throw new UnsupportedOperationException();
        }

        public void send(byte[] bArr, int i, ChannelCallback channelCallback) {
            Channel.this.performSend(bArr, i, channelCallback);
        }

        public void write(byte[] bArr, ChannelCallback channelCallback, boolean z) {
            throw new UnsupportedOperationException();
        }
    };
    private ChannelState mCurrentState = ChannelState.IDLE;
    /* access modifiers changed from: private */
    public int mCurrentSync;
    /* access modifiers changed from: private */
    public int mFrameCount;
    /* access modifiers changed from: private */
    public int mLastSync;
    /* access modifiers changed from: private */
    public int mPackageType;
    private SparseArray<Packet> mPacketRecv = new SparseArray<>();
    private final IChannelStateHandler mRecvACKHandler = new IChannelStateHandler() {
        public void handleState(Object... objArr) {
            Channel.this.assertRuntime(false);
            ACKPacket aCKPacket = objArr[0];
            int status = aCKPacket.getStatus();
            if (status == 0) {
                Channel.this.onSendCallback(0);
            } else if (status == 1) {
                Channel.this.stopTimer();
                Channel.this.setCurrentState(ChannelState.WRITING);
                Channel.this.sendDataPacket(0, true);
                return;
            } else if (status != 5) {
                Channel.this.onSendCallback(-1);
            } else {
                int seq = aCKPacket.getSeq();
                if (seq >= 1 && seq <= Channel.this.mFrameCount) {
                    Channel.this.sendDataPacket(seq - 1, false);
                    Channel.this.startTimer();
                    return;
                }
                return;
            }
            Channel.this.resetChannelStatus();
        }
    };
    private final IChannelStateHandler mRecvCTRHandler = new IChannelStateHandler() {
        public void handleState(Object... objArr) {
            Channel.this.assertRuntime(false);
            CTRPacket cTRPacket = objArr[0];
            int unused = Channel.this.mFrameCount = cTRPacket.getFrameCount();
            int unused2 = Channel.this.mPackageType = cTRPacket.getPackageType();
            ACKPacket aCKPacket = new ACKPacket(1);
            Channel.this.setCurrentState(ChannelState.READY);
            Channel.this.performWrite(aCKPacket, new ChannelCallback() {
                public void onCallback(int i) {
                    Channel.this.assertRuntime(false);
                    if (i == 0) {
                        Channel.this.startTimer();
                    } else {
                        Channel.this.resetChannelStatus();
                    }
                }
            });
            Channel.this.setCurrentState(ChannelState.READING);
        }
    };
    private final IChannelStateHandler mRecvDataHandler = new IChannelStateHandler() {
        public void handleState(Object... objArr) {
            Channel.this.assertRuntime(false);
            DataPacket dataPacket = objArr[0];
            if (!Channel.this.onDataPacketRecvd(dataPacket)) {
                BluetoothLog.m10339w(String.format("dataPacket repeated!!", new Object[0]));
            } else if (dataPacket.getSeq() == Channel.this.mFrameCount) {
                Channel.this.startSyncPacket();
            } else {
                Channel.this.startTimer(Channel.TIMEOUT, new Timer.TimerCallback("WaitData") {
                    public void onTimerCallback() {
                        Channel.this.startSyncPacket();
                    }

                    public void resetCallback() {
                        Channel.this.mTimer.resetCallback();
                    }
                });
            }
        }
    };
    private final IChannelStateHandler mSyncPacketHandler = new IChannelStateHandler() {
        public void handleState(Object... objArr) {
            Channel.this.assertRuntime(false);
            DataPacket dataPacket = objArr[0];
            if (dataPacket.getSeq() != Channel.this.mCurrentSync) {
                BluetoothLog.m10339w(String.format("sync packet not matched!!", new Object[0]));
            } else if (!Channel.this.onDataPacketRecvd(dataPacket)) {
                BluetoothLog.m10339w(String.format("sync packet repeated!!", new Object[0]));
            } else {
                Channel channel = Channel.this;
                int unused = channel.mLastSync = channel.mCurrentSync;
                int unused2 = Channel.this.mCurrentSync = 0;
                Channel.this.startSyncPacket();
            }
        }
    };
    private final Timer.TimerCallback mTimeoutHandler = new Timer.TimerCallback(getClass().getSimpleName()) {
        public void onTimerCallback() {
            Channel.this.assertRuntime(false);
            Channel.this.onSendCallback(-2);
            Channel.this.resetChannelStatus();
        }

        public void resetCallback() {
            Channel.this.mTimer.resetCallback();
        }
    };
    /* access modifiers changed from: private */
    public Timer mTimer = Timer.newInstance();
    private int mTotalBytes;
    private final IChannelStateHandler mWaitStartACKHandler = new IChannelStateHandler() {
        public void handleState(Object... objArr) {
            Channel.this.assertRuntime(false);
            Channel.this.setCurrentState(ChannelState.WAIT_START_ACK);
            Channel.this.startTimer();
        }
    };
    /* access modifiers changed from: private */
    public Handler mWorkerHandler;

    private class RecvCallback implements Runnable {
        private byte[] bytes;
        private int packageType;

        RecvCallback(byte[] bArr, int i) {
            this.bytes = bArr;
            this.packageType = i;
        }

        public void run() {
            Channel.this.onRecv(this.bytes, this.packageType);
        }
    }

    private class WriteCallback implements ChannelCallback {
        ChannelCallback callback;

        WriteCallback(ChannelCallback channelCallback) {
            this.callback = channelCallback;
        }

        public void onCallback(int i) {
            if (Channel.this.isExceptionTimerOn()) {
                Channel.this.stopTimer();
            }
            Channel.this.mWorkerHandler.obtainMessage(1, i, 0, this.callback).sendToTarget();
        }
    }

    public Channel() {
        MessageHandlerThread messageHandlerThread = new MessageHandlerThread(getClass().getSimpleName());
        messageHandlerThread.start();
        this.mWorkerHandler = new Handler(messageHandlerThread.getLooper(), this.mCallback);
    }

    /* access modifiers changed from: private */
    public void assertRuntime(boolean z) {
        if (Looper.myLooper() != (z ? Looper.getMainLooper() : this.mWorkerHandler.getLooper())) {
            resetOnException();
            throw new RuntimeException();
        }
    }

    private boolean checkCRC32(byte[] bArr, byte[] bArr2) {
        return ByteUtils.equals(bArr2, CRC32.get(bArr));
    }

    /* access modifiers changed from: private */
    public void dispatchOnReceive(byte[] bArr) {
        BluetoothLog.m10338v(String.format(">>> receive: %s", new Object[]{new String(bArr)}));
        BluetoothContext.post(new RecvCallback(bArr, this.mPackageType));
    }

    private int getFrameCount(int i) {
        if (useCrc32Verify()) {
            i += 4;
        }
        return ((i - 1) / 18) + 1;
    }

    private String getLogTag() {
        return String.format("%s.%s", new Object[]{getClass().getSimpleName(), BluetoothContext.getCurrentMethodName()});
    }

    private byte[] getTotalRecvdBytes() {
        String str;
        assertRuntime(false);
        if (this.mPacketRecv.size() == this.mFrameCount) {
            if (useCrc32Verify()) {
                str = String.format("%s: totalBytes = %d (include 4 Bytes crc)", new Object[]{getLogTag(), Integer.valueOf(this.mTotalBytes)});
            } else {
                str = String.format("%s: totalBytes = %d", new Object[]{getLogTag(), Integer.valueOf(this.mTotalBytes)});
            }
            BluetoothLog.m10338v(str);
            ByteBuffer allocate = ByteBuffer.allocate(this.mTotalBytes);
            for (int i = 1; i <= this.mFrameCount; i++) {
                ((DataPacket) this.mPacketRecv.get(i)).fillByteBuffer(allocate);
            }
            if (!useCrc32Verify()) {
                return allocate.array();
            }
            byte[] bArr = {allocate.get(this.mTotalBytes - 4), allocate.get(this.mTotalBytes - 3), allocate.get(this.mTotalBytes - 2), allocate.get(this.mTotalBytes - 1)};
            byte[] bArr2 = new byte[(this.mTotalBytes - 4)];
            System.arraycopy(allocate.array(), 0, bArr2, 0, this.mTotalBytes - 4);
            if (checkCRC32(bArr2, bArr)) {
                return bArr2;
            }
            BluetoothLog.m10335e(String.format("check crc failed!!", new Object[0]));
            return ByteUtils.EMPTY_BYTES;
        }
        resetOnException();
        throw new IllegalStateException();
    }

    /* access modifiers changed from: private */
    public boolean isExceptionTimerOn() {
        return TIMER_EXCEPTION.equals(this.mTimer.getName());
    }

    private boolean isTimerOn() {
        return this.mTimer.isRunning();
    }

    /* access modifiers changed from: private */
    public boolean onDataPacketRecvd(DataPacket dataPacket) {
        assertRuntime(false);
        if (this.mPacketRecv.get(dataPacket.getSeq()) != null) {
            return false;
        }
        this.mPacketRecv.put(dataPacket.getSeq(), dataPacket);
        this.mTotalBytes += dataPacket.getDataLength();
        stopTimer();
        return true;
    }

    private void onPostState(ChannelEvent channelEvent, Object... objArr) {
        assertRuntime(false);
        BluetoothLog.m10338v(String.format("%s: state = %s, event = %s", new Object[]{getLogTag(), this.mCurrentState, channelEvent}));
        for (ChannelStateBlock channelStateBlock : this.STATE_MACHINE) {
            if (channelStateBlock.state == this.mCurrentState && channelStateBlock.event == channelEvent) {
                channelStateBlock.handler.handleState(objArr);
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public void onSendCallback(int i) {
        assertRuntime(false);
        BluetoothLog.m10338v(String.format("%s: code = %d", new Object[]{getLogTag(), Integer.valueOf(i)}));
        ChannelCallback channelCallback = this.mChannelCallback;
        if (channelCallback != null) {
            channelCallback.onCallback(i);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void performOnRead(byte[] r7) {
        /*
            r6 = this;
            r0 = 0
            r6.assertRuntime(r0)
            com.miot.bluetooth.channel.packet.Packet r7 = com.miot.bluetooth.channel.packet.Packet.getPacket(r7)
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = r6.getLogTag()
            r2[r0] = r3
            r3 = 1
            r2[r3] = r7
            java.lang.String r4 = "%s: %s"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            com.inuker.bluetooth.library.utils.BluetoothLog.m10339w((java.lang.String) r2)
            java.lang.String r2 = r7.getName()
            int r4 = r2.hashCode()
            r5 = 96393(0x17889, float:1.35075E-40)
            if (r4 == r5) goto L_0x0049
            r5 = 98849(0x18221, float:1.38517E-40)
            if (r4 == r5) goto L_0x003f
            r5 = 3076010(0x2eefaa, float:4.310408E-39)
            if (r4 == r5) goto L_0x0035
            goto L_0x0053
        L_0x0035:
            java.lang.String r4 = "data"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0053
            r2 = 1
            goto L_0x0054
        L_0x003f:
            java.lang.String r4 = "ctr"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0053
            r2 = 2
            goto L_0x0054
        L_0x0049:
            java.lang.String r4 = "ack"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0053
            r2 = 0
            goto L_0x0054
        L_0x0053:
            r2 = -1
        L_0x0054:
            if (r2 == 0) goto L_0x006f
            if (r2 == r3) goto L_0x0065
            if (r2 == r1) goto L_0x005b
            goto L_0x0078
        L_0x005b:
            com.miot.bluetooth.channel.ChannelEvent r1 = com.miot.bluetooth.channel.ChannelEvent.RECV_CTR
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r2[r0] = r7
            r6.onPostState(r1, r2)
            goto L_0x0078
        L_0x0065:
            com.miot.bluetooth.channel.ChannelEvent r1 = com.miot.bluetooth.channel.ChannelEvent.RECV_DATA
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r2[r0] = r7
            r6.onPostState(r1, r2)
            goto L_0x0078
        L_0x006f:
            com.miot.bluetooth.channel.ChannelEvent r1 = com.miot.bluetooth.channel.ChannelEvent.RECV_ACK
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r2[r0] = r7
            r6.onPostState(r1, r2)
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.bluetooth.channel.Channel.performOnRead(byte[]):void");
    }

    /* access modifiers changed from: private */
    public void performSend(byte[] bArr, int i, ChannelCallback channelCallback) {
        assertRuntime(false);
        if (this.mCurrentState != ChannelState.IDLE) {
            channelCallback.onCallback(-3);
            return;
        }
        this.mPackageType = i;
        this.mCurrentState = ChannelState.READY;
        this.mChannelCallback = (ChannelCallback) ProxyUtils.getUIProxy(channelCallback);
        int length = bArr.length;
        this.mTotalBytes = length;
        this.mFrameCount = getFrameCount(length);
        BluetoothLog.m10338v(String.format("%s: totalBytes = %d, frameCount = %d", new Object[]{getLogTag(), Integer.valueOf(this.mTotalBytes), Integer.valueOf(this.mFrameCount)}));
        if (useCrc32Verify()) {
            this.mBytesToWrite = Arrays.copyOf(bArr, bArr.length + 4);
            System.arraycopy(CRC32.get(bArr), 0, this.mBytesToWrite, bArr.length, 4);
            BluetoothLog.m10338v("performSend CRC32 = " + ByteUtils.byteToString(this.mBytesToWrite));
        } else {
            this.mBytesToWrite = Arrays.copyOf(bArr, bArr.length);
        }
        sendStartFlowPacket(i);
    }

    /* access modifiers changed from: private */
    public void performWrite(Packet packet, ChannelCallback channelCallback) {
        performWrite(packet, channelCallback, false);
    }

    private void performWrite(Packet packet, final ChannelCallback channelCallback, final boolean z) {
        assertRuntime(false);
        if (channelCallback != null) {
            if (!isTimerOn()) {
                startExceptionTimer();
            }
            final byte[] bytes = packet.toBytes();
            BluetoothLog.m10339w(String.format("%s: %s", new Object[]{getLogTag(), packet}));
            BluetoothContext.post(new Runnable() {
                public void run() {
                    Channel channel = Channel.this;
                    channel.write(bytes, new WriteCallback(channelCallback), z);
                }
            });
            return;
        }
        resetOnException();
        throw new NullPointerException("callback can't be null");
    }

    /* access modifiers changed from: private */
    public void resetChannelStatus() {
        assertRuntime(false);
        BluetoothLog.m10338v(getLogTag());
        stopTimer();
        setCurrentState(ChannelState.IDLE);
        this.mBytesToWrite = null;
        this.mFrameCount = 0;
        this.mChannelCallback = null;
        this.mPacketRecv.clear();
        this.mCurrentSync = 0;
        this.mLastSync = 0;
        this.mTotalBytes = 0;
    }

    private void resetOnException() {
        BluetoothLog.m10338v(getLogTag());
        stopTimer();
        this.mCurrentState = ChannelState.IDLE;
        this.mBytesToWrite = null;
        this.mFrameCount = 0;
        this.mChannelCallback = null;
        this.mPacketRecv.clear();
        this.mCurrentSync = 0;
        this.mLastSync = 0;
        this.mTotalBytes = 0;
    }

    /* access modifiers changed from: private */
    public void sendDataPacket(final int i, final boolean z) {
        assertRuntime(false);
        if (i >= this.mFrameCount) {
            BluetoothLog.m10338v(String.format("%s: all packets sended!!", new Object[]{getLogTag()}));
            setCurrentState(ChannelState.SYNC);
            startTimer(18000);
            return;
        }
        int i2 = i + 1;
        BluetoothLog.m10338v(String.format("%s: index = %d, looped = %b", new Object[]{getLogTag(), Integer.valueOf(i2), Boolean.valueOf(z)}));
        int min = Math.min(this.mBytesToWrite.length, i2 * 18);
        performWrite(new DataPacket(i2, this.mBytesToWrite, i * 18, min), new ChannelCallback() {
            public void onCallback(int i) {
                Channel.this.assertRuntime(false);
                if (i != 0) {
                    BluetoothLog.m10339w(String.format(">>> packet %d write failed", new Object[]{Integer.valueOf(i)}));
                }
                boolean z = z;
                if (z) {
                    Channel.this.sendDataPacket(i + 1, z);
                }
            }
        }, true);
    }

    private void sendStartFlowPacket(int i) {
        assertRuntime(false);
        performWrite(new CTRPacket(this.mFrameCount, i), new ChannelCallback() {
            public void onCallback(int i) {
                Channel.this.assertRuntime(false);
                if (i != 0) {
                    Channel.this.onSendCallback(-1);
                    Channel.this.resetChannelStatus();
                }
            }
        });
        onPostState(ChannelEvent.SEND_CTR, new Object[0]);
    }

    /* access modifiers changed from: private */
    public void setCurrentState(ChannelState channelState) {
        assertRuntime(false);
        BluetoothLog.m10338v(String.format("%s: state = %s", new Object[]{getLogTag(), channelState}));
        this.mCurrentState = channelState;
    }

    private void startExceptionTimer() {
        startTimer(TIMEOUT, new Timer.TimerCallback(TIMER_EXCEPTION) {
            public void onTimerCallback() {
                throw new TimeoutException();
            }

            public void resetCallback() {
                Channel.this.mTimer.resetCallback();
            }
        });
    }

    /* access modifiers changed from: private */
    public void startSyncPacket() {
        assertRuntime(false);
        BluetoothLog.m10338v(getLogTag());
        startTimer();
        setCurrentState(ChannelState.SYNC);
        if (!syncLostPacket()) {
            final byte[] totalRecvdBytes = getTotalRecvdBytes();
            if (!ByteUtils.isEmpty(totalRecvdBytes)) {
                performWrite(new ACKPacket(0), new ChannelCallback() {
                    public void onCallback(int i) {
                        Channel.this.assertRuntime(false);
                        Channel.this.resetChannelStatus();
                        if (i == 0) {
                            Channel.this.dispatchOnReceive(totalRecvdBytes);
                        }
                    }
                });
            } else {
                resetChannelStatus();
            }
        }
    }

    /* access modifiers changed from: private */
    public void startTimer() {
        startTimer(TIMEOUT);
    }

    private void startTimer(long j) {
        startTimer(j, this.mTimeoutHandler);
    }

    /* access modifiers changed from: private */
    public void startTimer(long j, Timer.TimerCallback timerCallback) {
        BluetoothLog.m10338v(String.format("%s: duration = %d", new Object[]{getLogTag(), Long.valueOf(j)}));
        this.mTimer.start(timerCallback, j);
    }

    /* access modifiers changed from: private */
    public void stopTimer() {
        BluetoothLog.m10338v(getLogTag());
        this.mTimer.stop();
    }

    private boolean syncLostPacket() {
        assertRuntime(false);
        BluetoothLog.m10338v(getLogTag());
        int i = this.mLastSync + 1;
        while (i <= this.mFrameCount && this.mPacketRecv.get(i) != null) {
            i++;
        }
        if (i > this.mFrameCount) {
            return false;
        }
        this.mCurrentSync = i;
        performWrite(new ACKPacket(5, i), new ChannelCallback() {
            public void onCallback(int i) {
                Channel.this.assertRuntime(false);
                if (i == 0) {
                    Channel.this.startTimer();
                } else {
                    Channel.this.resetChannelStatus();
                }
            }
        });
        setCurrentState(ChannelState.SYNC_ACK);
        return true;
    }

    public boolean onIntercept(Object obj, Method method, Object[] objArr) {
        this.mWorkerHandler.obtainMessage(0, new ProxyBulk(obj, method, objArr)).sendToTarget();
        return true;
    }

    public final void onRead(byte[] bArr) {
        this.mChannel.onRead(bArr);
    }

    public final void send(byte[] bArr, int i, ChannelCallback channelCallback) {
        BluetoothLog.m10338v(String.format(">>> send %s", new Object[]{new String(bArr)}));
        this.mChannel.send(bArr, i, channelCallback);
    }

    public abstract boolean useCrc32Verify();
}
