package com.p146mi.iot.runtime;

import android.content.Context;
import androidx.annotation.NonNull;
import com.miot.common.config.AppConfiguration;
import com.miot.common.utils.Logger;
import com.p146mi.iot.common.error.IotError;
import com.p146mi.iot.common.exception.IotException;
import com.p146mi.iot.common.handler.CommonHandler;
import com.p146mi.iot.common.handler.WritePropertyHandler;
import com.p146mi.iot.common.instance.Action;
import com.p146mi.iot.common.instance.Device;
import com.p146mi.iot.common.instance.DiscoveryType;
import com.p146mi.iot.common.instance.Property;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.mi.iot.runtime.CtrlRuntimeManager */
public class CtrlRuntimeManager {
    public static final int SPEC_V1 = 1;
    public static final int SPEC_V2 = 2;
    public static final int SPEC_V2_EXT = 20;
    private static final String TAG = "ControllerRuntimeMgr";
    private static CtrlRuntimeManager sInstance = new CtrlRuntimeManager();
    private AppConfiguration mAppConfig;
    private Map<String, String> mAuth = new HashMap();
    private boolean mInitialized;
    private Map<DiscoveryType, CtrlRuntime> mRuntimes = new HashMap();

    private CtrlRuntimeManager() {
    }

    private void checkInitialized() {
        if (!this.mInitialized) {
            throw new IotException(IotError.INTERNAL, "Not mInitialized");
        }
    }

    @NonNull
    private CtrlRuntime createInstance(CtrlRuntimeClass ctrlRuntimeClass) {
        Class<?> clazz = ctrlRuntimeClass.getClazz();
        if (clazz != null) {
            try {
                Object newInstance = clazz.newInstance();
                if (newInstance instanceof CtrlRuntime) {
                    return (CtrlRuntime) newInstance;
                }
                throw new IotException(IotError.INTERNAL, "runtime is not instanceof ControllerRuntime");
            } catch (IllegalAccessException | InstantiationException e) {
                e.printStackTrace();
                throw new IotException(IotError.INTERNAL, "runtime not found");
            }
        } else {
            "ControllerRuntime class is null: " + ctrlRuntimeClass.getType();
            throw null;
        }
    }

    public static CtrlRuntimeManager getInstance() {
        return sInstance;
    }

    @NonNull
    private CtrlRuntime getMatchedRuntime(Device device) {
        if (device == null || device.getDiscoveryTypes().contains(DiscoveryType.IOT_OVER_CLOUD)) {
            return getRuntime(DiscoveryType.IOT_OVER_CLOUD);
        }
        throw new IotException(IotError.INTERNAL, "ControllerRuntime not found");
    }

    @NonNull
    private CtrlRuntime getMatchedRuntime(DiscoveryType discoveryType) {
        DiscoveryType discoveryType2 = DiscoveryType.IOT_OVER_CLOUD;
        if (discoveryType == discoveryType2) {
            return getRuntime(discoveryType2);
        }
        throw new IotException(IotError.INTERNAL, "ControllerRuntime not found");
    }

    @NonNull
    private CtrlRuntime getRuntime(DiscoveryType discoveryType) {
        CtrlRuntime ctrlRuntime = this.mRuntimes.get(discoveryType);
        if (ctrlRuntime != null) {
            return ctrlRuntime;
        }
        IotError iotError = IotError.INTERNAL;
        throw new IotException(iotError, "ControllerRuntime not found: " + discoveryType);
    }

    private void initRuntime(Context context, List<CtrlRuntimeClass> list) {
        for (CtrlRuntimeClass next : list) {
            String.format("init: %s -> %s", new Object[]{next.getType().toString(), next.getClazz().getSimpleName()});
            this.mRuntimes.put(next.getType(), createInstance(next));
        }
        for (CtrlRuntime init : this.mRuntimes.values()) {
            init.init(context);
        }
    }

    public void addAuth(String str, String str2) {
        this.mAuth.put(str, str2);
    }

    public synchronized void destroy() {
        checkInitialized();
        for (CtrlRuntime destroy : this.mRuntimes.values()) {
            destroy.destroy();
        }
        this.mRuntimes.clear();
        this.mInitialized = false;
    }

    public AppConfiguration getAppConfig() {
        return this.mAppConfig;
    }

    public Map<String, String> getAuth() {
        return this.mAuth;
    }

    public void getDeviceList(CommonHandler<List<Device>> commonHandler, int i) {
        checkInitialized();
        getMatchedRuntime(DiscoveryType.IOT_OVER_CLOUD).getDeviceList(commonHandler, i);
    }

    public synchronized void getProperties(Device device, List<Property> list, CommonHandler<List<Property>> commonHandler, int i) {
        checkInitialized();
        getMatchedRuntime(device).getProperties(device, list, commonHandler, i);
    }

    public synchronized void init(Context context, List<CtrlRuntimeClass> list) {
        if (!this.mInitialized) {
            initRuntime(context, list);
            this.mInitialized = true;
        }
    }

    public synchronized void invokeAction(Device device, Action action, CommonHandler<Action> commonHandler, int i) {
        checkInitialized();
        getMatchedRuntime(device).invokeAction(action, commonHandler, i);
    }

    public void setAuth(Map<String, String> map) {
        this.mAuth = map;
    }

    public synchronized void setProperties(Device device, List<Property> list, WritePropertyHandler writePropertyHandler, int i) {
        checkInitialized();
        getMatchedRuntime(device).setProperties(device, list, writePropertyHandler, i);
    }

    public synchronized void start(AppConfiguration appConfiguration) {
        checkInitialized();
        this.mAppConfig = appConfiguration;
        Logger.m10629d(TAG, "appconfig=" + appConfiguration);
        for (CtrlRuntime start : this.mRuntimes.values()) {
            start.start();
        }
    }

    public synchronized void stop() {
        checkInitialized();
        for (CtrlRuntime stop : this.mRuntimes.values()) {
            stop.stop();
        }
    }

    public synchronized void subscribe(Device device, List<Property> list, CommonHandler<List<Property>> commonHandler, int i) {
        checkInitialized();
        getMatchedRuntime(device).subscribe(device, list, commonHandler, i);
    }

    public synchronized void unsubscribe(Device device, List<Property> list, CommonHandler<List<Property>> commonHandler, int i) {
        checkInitialized();
        getMatchedRuntime(device).unSubscribe(device, list, commonHandler, i);
    }
}
