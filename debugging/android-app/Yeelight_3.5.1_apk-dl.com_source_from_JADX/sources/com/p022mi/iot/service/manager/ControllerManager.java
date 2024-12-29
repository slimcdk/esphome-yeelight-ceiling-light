package com.p022mi.iot.service.manager;

import android.content.Context;
import com.miot.common.config.AppConfiguration;
import com.miot.common.people.People;
import com.miot.service.common.manager.ServiceManager;
import com.p022mi.iot.common.exception.IotException;
import com.p022mi.iot.common.instance.Action;
import com.p022mi.iot.common.instance.Device;
import com.p022mi.iot.common.instance.DiscoveryType;
import com.p022mi.iot.common.instance.Property;
import com.p022mi.iot.manager.handler.ICompletedHandler;
import com.p022mi.iot.manager.handler.IControlHandler;
import com.p022mi.iot.manager.handler.IInvokeHandler;
import com.p022mi.iot.manager.listener.IDeviceListener;
import com.p022mi.iot.manager.listener.IPropertiesChangedListener;
import com.p022mi.iot.runtime.CtrlRuntimeClass;
import com.p022mi.iot.runtime.CtrlRuntimeManager;
import com.p022mi.iot.runtime.wan.WanCtrlRuntime;
import com.p022mi.iot.service.task.GetDeviceListTask;
import com.p022mi.iot.service.task.GetPropertiesTask;
import com.p022mi.iot.service.task.InvokeActionTask;
import com.p022mi.iot.service.task.SetPropertiesTask;
import com.p022mi.iot.service.task.SubscribeTask;
import com.p022mi.iot.service.task.UnsubscribeTask;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.mi.iot.service.manager.ControllerManager */
public class ControllerManager {
    private static final int CORE_POOL_SIZE = 1;
    private static final int KEEPALIVE_TIME = 90;
    private static final int MAX_POOL_SIZE = 5;
    private static final int MAX_QUEUE = 256;
    private Context mContext;
    private ThreadPoolExecutor mExecutor;
    private boolean mIsStarted;
    private CtrlRuntimeManager mRuntimeManager = CtrlRuntimeManager.getInstance();

    public ControllerManager(Context context) {
        this.mContext = context;
        init();
    }

    private Map<String, String> getAuth() {
        HashMap hashMap = new HashMap();
        AppConfiguration appConfig = ServiceManager.getInstance().getAppConfig();
        People people = ServiceManager.getInstance().getPeople();
        hashMap.put("App-Id", String.valueOf(appConfig.getAppId()));
        hashMap.put("Access-Token", people.getAccessToken());
        hashMap.put("User-Id", people.getUserId());
        return hashMap;
    }

    private void init() {
        this.mExecutor = new ThreadPoolExecutor(1, 5, 90, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(256));
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new CtrlRuntimeClass(DiscoveryType.IOT_OVER_CLOUD, WanCtrlRuntime.class));
            this.mRuntimeManager.init(this.mContext, arrayList);
        } catch (IotException e) {
            e.printStackTrace();
        }
    }

    public void changeName(Device device, String str, ICompletedHandler iCompletedHandler) {
    }

    public synchronized void destroy() {
        try {
            this.mRuntimeManager.destroy();
        } catch (IotException e) {
            e.printStackTrace();
        }
        this.mExecutor.shutdown();
    }

    public void getDeviceList(IDeviceListener iDeviceListener, int i) {
        this.mExecutor.execute(new GetDeviceListTask(iDeviceListener, i));
    }

    public void getProperties(Device device, List<Property> list, IControlHandler iControlHandler, int i) {
        this.mExecutor.execute(new GetPropertiesTask(device, list, iControlHandler, i));
    }

    public void invokeAction(Device device, Action action, IInvokeHandler iInvokeHandler, int i) {
        this.mExecutor.execute(new InvokeActionTask(device, action, iInvokeHandler, i));
    }

    public void pairing(Device device, String str, ICompletedHandler iCompletedHandler) {
    }

    public void setProperties(Device device, List<Property> list, IControlHandler iControlHandler, int i) {
        this.mExecutor.execute(new SetPropertiesTask(device, list, iControlHandler, i));
    }

    public void start(AppConfiguration appConfiguration) {
        if (!this.mIsStarted) {
            if (ServiceManager.getInstance().getPeople() != null) {
                this.mRuntimeManager.setAuth(getAuth());
            }
            try {
                this.mRuntimeManager.start(appConfiguration);
            } catch (IotException e) {
                e.printStackTrace();
            }
            this.mIsStarted = true;
        }
    }

    public void stop() {
        if (this.mIsStarted) {
            try {
                this.mRuntimeManager.stop();
            } catch (IotException e) {
                e.printStackTrace();
            }
            this.mIsStarted = false;
        }
    }

    public void subscribe(Device device, List<Property> list, IControlHandler iControlHandler, IPropertiesChangedListener iPropertiesChangedListener, int i) {
        this.mExecutor.execute(new SubscribeTask(device, list, iControlHandler, iPropertiesChangedListener, i));
    }

    public void unpairing(Device device, ICompletedHandler iCompletedHandler) {
    }

    public void unsubscribe(Device device, List<Property> list, IControlHandler iControlHandler, int i) {
        this.mExecutor.execute(new UnsubscribeTask(device, list, iControlHandler, i));
    }
}
