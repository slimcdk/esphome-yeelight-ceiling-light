package com.miot.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.inuker.bluetooth.library.BluetoothContext;
import com.miot.api.IBinderPool;
import com.miot.api.IBluetoothCaller;
import com.miot.api.IDeviceConnection;
import com.miot.api.IDeviceManager;
import com.miot.api.IDeviceManipulator;
import com.miot.api.ILogHelperInterface;
import com.miot.api.INegotiator;
import com.miot.api.IPeopleManager;
import com.miot.api.IVoiceAssistant;
import com.miot.api.bluetooth.BluetoothManager;
import com.miot.common.ReturnCode;
import com.miot.common.config.AppConfiguration;
import com.miot.common.exception.MiotException;
import com.miot.common.model.DeviceModel;
import com.miot.common.people.People;
import com.p022mi.iot.common.abstractdevice.DeviceType;
import com.p022mi.iot.common.urn.UrnType;
import com.p022mi.iot.manager.ControllerManager;
import com.p022mi.iot.manager.IControllerManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class MiotManager {
    public static final int BINDER_BLUETOOTH = 6;
    public static final int BINDER_CONTROLLER_MANAGER = 8;
    public static final int BINDER_DEVICE_CONNECTOR = 2;
    public static final int BINDER_DEVICE_MANAGER = 3;
    public static final int BINDER_DEVICE_MANIPULATOR = 4;
    public static final int BINDER_LOG = 7;
    public static final int BINDER_NEGOTIATOR = 0;
    public static final int BINDER_PEOPLE_MANAGER = 1;
    public static final int BINDER_VOICE_ASSISTANT = 5;
    private static final String TAG = "MiotManager";
    private static ControllerManager mControllerManager;
    private static BluetoothManager sBluetoothManager;
    /* access modifiers changed from: private */
    public static DeviceConnector sDeviceConnector;
    /* access modifiers changed from: private */
    public static DeviceManager sDeviceManager;
    /* access modifiers changed from: private */
    public static DeviceManipulator sDeviceManipulator;
    private static volatile MiotManager sInstance;
    /* access modifiers changed from: private */
    public static Negotiator sNegotiator;
    /* access modifiers changed from: private */
    public static PeopleManager sPeopleManager;
    /* access modifiers changed from: private */
    public static VoiceAssistant sVoiceAssistant;
    private AppConfiguration mAppConfig;
    private BinderPool mBinderPool;
    private Context mContext;
    private List<DeviceModel> mDeviceModels = new ArrayList();
    private Map<UrnType, DeviceType> mDeviceTypes = new HashMap();
    public String mPkgName;
    private List<String> mSpecModels = new ArrayList();

    class BinderPool {
        private ServiceConnection mConnection = new ServiceConnection() {
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                StringBuilder sb = new StringBuilder();
                sb.append("onServiceConnected: ");
                sb.append(componentName);
                IBinderPool unused = BinderPool.this.mIBinderPool = IBinderPool.Stub.asInterface(iBinder);
                try {
                    BinderPool.this.mIBinderPool.asBinder().linkToDeath(BinderPool.this.mDeathRecipient, 0);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
                BinderPool.this.mLatch.countDown();
            }

            public void onServiceDisconnected(ComponentName componentName) {
                StringBuilder sb = new StringBuilder();
                sb.append("onServiceDisconnected: ");
                sb.append(componentName);
            }
        };
        private Context mContext;
        /* access modifiers changed from: private */
        public IBinder.DeathRecipient mDeathRecipient = new IBinder.DeathRecipient() {
            public void binderDied() {
                synchronized (MiotManager.class) {
                    BinderPool.this.mIBinderPool.asBinder().unlinkToDeath(BinderPool.this.mDeathRecipient, 0);
                    IBinderPool unused = BinderPool.this.mIBinderPool = null;
                    MiotManager.sNegotiator.setINegotiator((INegotiator) null);
                    MiotManager.sPeopleManager.setIPeopleManager((IPeopleManager) null);
                    MiotManager.sDeviceConnector.setIDeviceConnection((IDeviceConnection) null);
                    MiotManager.sDeviceManager.setIDeviceManager((IDeviceManager) null);
                    MiotManager.sDeviceManipulator.setIDeviceManipulator((IDeviceManipulator) null);
                    MiotManager.sVoiceAssistant.setIVoiceAssistant((IVoiceAssistant) null);
                    MiotManager.this.open();
                }
            }
        };
        /* access modifiers changed from: private */
        public IBinderPool mIBinderPool;
        /* access modifiers changed from: private */
        public CountDownLatch mLatch = new CountDownLatch(1);

        public BinderPool(Context context) {
            this.mContext = context;
        }

        public synchronized boolean bindService() {
            boolean z;
            Intent intent = new Intent("com.miot.service.action.BIND_SERVICE");
            MiotManager miotManager = MiotManager.this;
            if (miotManager.mPkgName == null) {
                miotManager.mPkgName = this.mContext.getPackageName();
            }
            intent.setComponent(new ComponentName(MiotManager.this.mPkgName, "com.miot.service.MiotService"));
            boolean bindService = this.mContext.bindService(intent, this.mConnection, 1);
            z = false;
            if (bindService && this.mIBinderPool == null) {
                try {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    this.mLatch = countDownLatch;
                    countDownLatch.await(3, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    bindService = false;
                }
            }
            if (this.mIBinderPool != null) {
                z = bindService;
            }
            return z;
        }

        public boolean isBound() {
            return this.mIBinderPool != null;
        }

        public IBinder queryBinder(int i) {
            try {
                IBinderPool iBinderPool = this.mIBinderPool;
                if (iBinderPool != null) {
                    return iBinderPool.queryBinder(i);
                }
                return null;
            } catch (RemoteException e) {
                e.printStackTrace();
                return null;
            }
        }

        public synchronized void unBindService() {
            this.mContext.unbindService(this.mConnection);
        }
    }

    private MiotManager() {
    }

    public static BluetoothManager getBluetoothManager() {
        return sBluetoothManager;
    }

    public static ControllerManager getControllerManager() {
        return mControllerManager;
    }

    public static DeviceConnector getDeviceConnector() {
        return sDeviceConnector;
    }

    public static DeviceManager getDeviceManager() {
        return sDeviceManager;
    }

    public static DeviceManipulator getDeviceManipulator() {
        return sDeviceManipulator;
    }

    public static MiotManager getInstance() {
        if (sInstance == null) {
            synchronized (MiotManager.class) {
                if (sInstance == null) {
                    sInstance = new MiotManager();
                }
            }
        }
        return sInstance;
    }

    public static Negotiator getNegotiator() {
        return sNegotiator;
    }

    public static People getPeople() {
        PeopleManager peopleManager = sPeopleManager;
        if (peopleManager == null) {
            return null;
        }
        return peopleManager.getPeople();
    }

    public static PeopleManager getPeopleManager() {
        return sPeopleManager;
    }

    public static VoiceAssistant getVoiceAssistant() {
        return sVoiceAssistant;
    }

    private void initBinder() {
        sNegotiator = new Negotiator(INegotiator.Stub.asInterface(this.mBinderPool.queryBinder(0)));
        sPeopleManager = new PeopleManager(IPeopleManager.Stub.asInterface(this.mBinderPool.queryBinder(1)));
        sDeviceConnector = new DeviceConnector(IDeviceConnection.Stub.asInterface(this.mBinderPool.queryBinder(2)));
        sDeviceManager = new DeviceManager(IDeviceManager.Stub.asInterface(this.mBinderPool.queryBinder(3)));
        sDeviceManipulator = new DeviceManipulator(IDeviceManipulator.Stub.asInterface(this.mBinderPool.queryBinder(4)));
        sVoiceAssistant = new VoiceAssistant(IVoiceAssistant.Stub.asInterface(this.mBinderPool.queryBinder(5)));
        sBluetoothManager = new BluetoothManager(IBluetoothCaller.Stub.asInterface(this.mBinderPool.queryBinder(6)));
        LogHelper.setBinderInterface(ILogHelperInterface.Stub.asInterface(this.mBinderPool.queryBinder(7)));
        mControllerManager = new ControllerManager(IControllerManager.Stub.asInterface(this.mBinderPool.queryBinder(8)));
    }

    public void addDeviceType(@NonNull DeviceType deviceType) {
        this.mDeviceTypes.put(deviceType.getType(), deviceType);
        String model = deviceType.getModel();
        if (!TextUtils.isEmpty(model) && !this.mSpecModels.contains(model)) {
            this.mSpecModels.add(model);
        }
    }

    public void addModel(@NonNull DeviceModel deviceModel) {
        if (!this.mDeviceModels.contains(deviceModel)) {
            this.mDeviceModels.add(deviceModel);
        }
    }

    public void addModels(List<DeviceModel> list) {
        if (list != null && list.size() != 0) {
            Iterator<DeviceModel> it = list.iterator();
            while (it.hasNext()) {
                DeviceModel next = it.next();
                if (this.mDeviceModels.contains(next)) {
                    it.remove();
                } else {
                    this.mDeviceModels.add(next);
                }
            }
            Negotiator negotiator = sNegotiator;
            if (negotiator != null) {
                negotiator.addDeviceModels(list);
            }
        }
    }

    public int close() {
        this.mBinderPool.unBindService();
        return 0;
    }

    public void enableLog(boolean z) {
        try {
            LogHelper.enableLog(z);
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    public AppConfiguration getAppConfig() {
        return this.mAppConfig;
    }

    public DeviceType getDeviceType(UrnType urnType) {
        return this.mDeviceTypes.get(urnType);
    }

    public DeviceModel getModel(String str) {
        for (DeviceModel next : this.mDeviceModels) {
            if (TextUtils.equals(next.getModel(), str)) {
                return next;
            }
        }
        return null;
    }

    public void initialize(Context context) {
        this.mContext = context;
        this.mBinderPool = new BinderPool(context);
        BluetoothContext.set(this.mContext);
    }

    public boolean isBound() {
        return this.mBinderPool.isBound();
    }

    public int open() {
        int i;
        synchronized (MiotManager.class) {
            i = ReturnCode.E_SERVICE_NOT_BOUND;
            if (this.mBinderPool.bindService()) {
                initBinder();
                AppConfiguration appConfiguration = this.mAppConfig;
                if (appConfiguration != null) {
                    sNegotiator.setAppConfig(appConfiguration);
                }
                sNegotiator.addDeviceModels(this.mDeviceModels);
                sNegotiator.addSpecModels(this.mSpecModels);
                for (DeviceType next : this.mDeviceTypes.values()) {
                    if (!(next == null || next.getType() == null)) {
                        sNegotiator.addSpecUrn(next.getModel(), next.getType().getOriginString());
                    }
                }
                i = 0;
            }
        }
        return i;
    }

    public MiotManager setAppConfig(AppConfiguration appConfiguration) {
        this.mAppConfig = appConfiguration;
        Negotiator negotiator = sNegotiator;
        if (negotiator != null) {
            negotiator.setAppConfig(appConfiguration);
        }
        return this;
    }

    public MiotManager setLocale(AppConfiguration.Locale locale) {
        if (this.mAppConfig == null) {
            this.mAppConfig = new AppConfiguration();
        }
        this.mAppConfig.setLocale(locale);
        Negotiator negotiator = sNegotiator;
        if (negotiator != null) {
            negotiator.setAppConfig(this.mAppConfig);
        }
        return this;
    }

    public void setPkgName(String str) {
        this.mPkgName = str;
    }
}
