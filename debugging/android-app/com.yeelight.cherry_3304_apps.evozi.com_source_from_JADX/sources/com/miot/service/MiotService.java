package com.miot.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;
import com.miot.api.IBinderPool;
import com.miot.service.bluetooth.MiotBluetoothImpl;
import com.miot.service.common.manager.ServiceManager;
import com.miot.service.connection.DeviceConnectionImpl;
import com.miot.service.log.LogHelperImp;
import com.miot.service.log.MyLogger;
import com.miot.service.manager.DeviceManagerImpl;
import com.miot.service.manipulator.DeviceManipulatorImpl;
import com.miot.service.negotiator.NegotiatorImpl;
import com.miot.service.people.PeopleManagerImpl;
import com.miot.service.voice.VoiceAssistantImpl;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MiotService extends Service {
    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    private static final int KEEPALIVE_TIME = 90;
    private static final int MAX_POOL_SIZE = ((CPU_COUNT * 2) + 1);
    private static final int MAX_QUEUE = 256;
    private static final String TAG = "MiotService";
    private BinderPoolImpl mBinderPool;
    /* access modifiers changed from: private */
    public ControllerManagerImpl mControllerManagerImpl;
    /* access modifiers changed from: private */
    public DeviceConnectionImpl mDeviceConnectionImpl;
    /* access modifiers changed from: private */
    public DeviceManagerImpl mDeviceManagerImpl;
    /* access modifiers changed from: private */
    public DeviceManipulatorImpl mDeviceManipulatorImpl;
    private ThreadPoolExecutor mExecutor;
    /* access modifiers changed from: private */
    public LogHelperImp mLogHelperImp;
    /* access modifiers changed from: private */
    public MiotBluetoothImpl mMiotBluetoothImpl;
    /* access modifiers changed from: private */
    public NegotiatorImpl mNegotiatorImpl;
    /* access modifiers changed from: private */
    public PeopleManagerImpl mPeopleManagerImpl;
    /* access modifiers changed from: private */
    public VoiceAssistantImpl mVoiceAssistantImpl;

    public class BinderPoolImpl extends IBinderPool.Stub {
        public BinderPoolImpl() {
        }

        public IBinder queryBinder(int i) {
            switch (i) {
                case 0:
                    return MiotService.this.mNegotiatorImpl;
                case 1:
                    return MiotService.this.mPeopleManagerImpl;
                case 2:
                    return MiotService.this.mDeviceConnectionImpl;
                case 3:
                    return MiotService.this.mDeviceManagerImpl;
                case 4:
                    return MiotService.this.mDeviceManipulatorImpl;
                case 5:
                    return MiotService.this.mVoiceAssistantImpl;
                case 6:
                    return MiotService.this.mMiotBluetoothImpl;
                case 7:
                    return MiotService.this.mLogHelperImp;
                case 8:
                    return MiotService.this.mControllerManagerImpl;
                default:
                    return null;
            }
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = availableProcessors;
        CORE_POOL_SIZE = Math.max(2, Math.min(availableProcessors - 1, 4));
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        return this.mBinderPool;
    }

    public void onCreate() {
        super.onCreate();
        this.mBinderPool = new BinderPoolImpl();
        MyLogger.getInstance().init(this);
        this.mExecutor = new ThreadPoolExecutor(CORE_POOL_SIZE, MAX_POOL_SIZE, 90, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(256));
        ServiceManager.getInstance().init(this, this.mExecutor);
        this.mNegotiatorImpl = new NegotiatorImpl(this);
        PeopleManagerImpl peopleManagerImpl = new PeopleManagerImpl(this, this.mExecutor);
        this.mPeopleManagerImpl = peopleManagerImpl;
        peopleManagerImpl.registerPeople();
        this.mDeviceConnectionImpl = new DeviceConnectionImpl(this);
        this.mDeviceManagerImpl = new DeviceManagerImpl(this, this.mExecutor);
        this.mDeviceManipulatorImpl = new DeviceManipulatorImpl(this, this.mExecutor);
        this.mVoiceAssistantImpl = new VoiceAssistantImpl(this, this.mExecutor);
        this.mMiotBluetoothImpl = new MiotBluetoothImpl(this);
        this.mLogHelperImp = new LogHelperImp();
        this.mControllerManagerImpl = new ControllerManagerImpl(this);
    }

    public void onDestroy() {
        super.onDestroy();
        PeopleManagerImpl peopleManagerImpl = this.mPeopleManagerImpl;
        if (peopleManagerImpl != null) {
            peopleManagerImpl.unregisterPeople();
        }
    }

    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }
}
