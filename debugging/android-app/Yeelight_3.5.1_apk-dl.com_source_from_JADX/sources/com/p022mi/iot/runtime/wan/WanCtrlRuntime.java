package com.p022mi.iot.runtime.wan;

import android.content.Context;
import android.text.TextUtils;
import com.miot.service.common.manager.ServiceManager;
import com.miot.service.connection.wifi.WebShellActivity;
import com.p022mi.iot.common.error.IotError;
import com.p022mi.iot.common.handler.CommonHandler;
import com.p022mi.iot.common.handler.CompletedHandler;
import com.p022mi.iot.common.handler.WritePropertyHandler;
import com.p022mi.iot.common.instance.Action;
import com.p022mi.iot.common.instance.Device;
import com.p022mi.iot.common.instance.DiscoveryType;
import com.p022mi.iot.common.instance.Property;
import com.p022mi.iot.common.parser.DeviceParser;
import com.p022mi.iot.common.urn.UrnType;
import com.p022mi.iot.runtime.CtrlRuntime;
import com.p022mi.iot.runtime.CtrlRuntimeManager;
import com.p022mi.iot.runtime.wan.http.ApiResponse;
import com.p022mi.iot.runtime.wan.http.IotSpecService;
import com.p022mi.iot.runtime.wan.http.OpenHomeService;
import com.p022mi.iot.runtime.wan.http.RetrofitManager;
import com.p022mi.iot.runtime.wan.http.bean.ActionBean;
import com.p022mi.iot.runtime.wan.http.bean.DeviceBeen;
import com.p022mi.iot.runtime.wan.http.bean.PropertyBeen;
import com.p022mi.iot.runtime.wan.http.bean.SubscribeBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.mi.iot.runtime.wan.WanCtrlRuntime */
public class WanCtrlRuntime implements CtrlRuntime {
    private static final String TAG = "WanCtrlRuntime";
    private Context mContext;
    OpenHomeService mOpenHomeService;
    OpenHomeService mOpenHomeServiceV2;
    IotSpecService mSpecService;
    IotSpecService mSpecServiceV2;

    public void destroy() {
    }

    public void getDeviceList(CommonHandler<List<Device>> commonHandler, int i) {
        String str;
        StringBuilder sb;
        String str2;
        synchronized (WanCtrlRuntime.class) {
            OpenHomeService openHomeService = this.mOpenHomeService;
            if (openHomeService != null) {
                OpenHomeService openHomeService2 = this.mOpenHomeServiceV2;
                if (openHomeService2 != null) {
                    IotSpecService iotSpecService = this.mSpecService;
                    if (i == 2 || i == 20) {
                        iotSpecService = this.mSpecServiceV2;
                        openHomeService = openHomeService2;
                    }
                    ApiResponse<DeviceBeen> devices = openHomeService.getDevices();
                    if (!devices.isSuccessful()) {
                        commonHandler.onFailed(devices.getError());
                        return;
                    }
                    List<String> specModels = ServiceManager.getInstance().getDeviceManager().getSpecModels();
                    Map<String, String> specProfiles = ServiceManager.getInstance().getDeviceManager().getSpecProfiles();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("spec models: ");
                    sb2.append(specModels);
                    ArrayList arrayList = new ArrayList();
                    for (DeviceBeen.DeviceBean next : devices.getResult().deviceBeans) {
                        if (next.type != null) {
                            if (next.deviceId != null) {
                                if (specModels == null || specModels.contains(next.model) || i == 20) {
                                    if (specProfiles == null || !specProfiles.containsKey(next.model)) {
                                        String urn = ServiceManager.getInstance().getDeviceManager().getUrn(next.model);
                                        if (TextUtils.isEmpty(urn)) {
                                            urn = next.type;
                                        }
                                        str = (i == 1 ? iotSpecService.getProfile(urn) : iotSpecService.getProfileV2(urn)).getResult();
                                        specProfiles.put(next.model, str);
                                    } else {
                                        str = specProfiles.get(next.model);
                                    }
                                    if (TextUtils.isEmpty(str)) {
                                        sb = new StringBuilder();
                                        sb.append("profile is empty, model: ");
                                        str2 = next.model;
                                    } else {
                                        Device parseDevice = DeviceParser.parseDevice(str, next.deviceId);
                                        if (parseDevice != null) {
                                            if (!TextUtils.isEmpty(next.type)) {
                                                parseDevice.setDeviceType(UrnType.parse(next.type));
                                            }
                                            parseDevice.setName(next.name);
                                            parseDevice.setOnline(next.online);
                                            parseDevice.setRealID(next.real_did);
                                            parseDevice.setParentDeviceId(next.parentDeviceId);
                                            parseDevice.addDiscoveryType(DiscoveryType.IOT_OVER_CLOUD);
                                            parseDevice.setMac(next.mac);
                                            parseDevice.setIsShared(next.isShared);
                                            arrayList.add(parseDevice);
                                        }
                                    }
                                } else {
                                    sb = new StringBuilder();
                                    sb.append("not contain model: ");
                                    str2 = next.model;
                                }
                                sb.append(str2);
                            }
                        }
                    }
                    commonHandler.onSucceed(arrayList);
                    return;
                }
            }
            IotError iotError = IotError.INTERNAL_NOT_INITIALIZED;
            iotError.setMessage(iotError.getMessage() + ": getDeviceList");
            commonHandler.onFailed(iotError);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0085, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void getProperties(com.p022mi.iot.common.instance.Device r9, java.util.List<com.p022mi.iot.common.instance.Property> r10, com.p022mi.iot.common.handler.CommonHandler<java.util.List<com.p022mi.iot.common.instance.Property>> r11, int r12) {
        /*
            r8 = this;
            java.lang.Class<com.mi.iot.runtime.wan.WanCtrlRuntime> r9 = com.p022mi.iot.runtime.wan.WanCtrlRuntime.class
            monitor-enter(r9)
            com.mi.iot.runtime.wan.http.OpenHomeService r0 = r8.mOpenHomeService     // Catch:{ all -> 0x0189 }
            if (r0 == 0) goto L_0x016a
            com.mi.iot.runtime.wan.http.OpenHomeService r1 = r8.mOpenHomeServiceV2     // Catch:{ all -> 0x0189 }
            if (r1 != 0) goto L_0x000d
            goto L_0x016a
        L_0x000d:
            r2 = 2
            if (r12 != r2) goto L_0x0011
            r0 = r1
        L_0x0011:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0189 }
            r12.<init>()     // Catch:{ all -> 0x0189 }
            java.util.Iterator r1 = r10.iterator()     // Catch:{ all -> 0x0189 }
        L_0x001a:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0189 }
            if (r2 == 0) goto L_0x0035
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0189 }
            com.mi.iot.common.instance.Property r2 = (com.p022mi.iot.common.instance.Property) r2     // Catch:{ all -> 0x0189 }
            if (r2 == 0) goto L_0x001a
            java.lang.String r2 = r2.getPid()     // Catch:{ all -> 0x0189 }
            r12.append(r2)     // Catch:{ all -> 0x0189 }
            java.lang.String r2 = ","
            r12.append(r2)     // Catch:{ all -> 0x0189 }
            goto L_0x001a
        L_0x0035:
            int r1 = r12.length()     // Catch:{ all -> 0x0189 }
            int r1 = r1 + -1
            r2 = 0
            java.lang.String r12 = r12.substring(r2, r1)     // Catch:{ all -> 0x0189 }
            com.mi.iot.runtime.wan.http.ApiResponse r12 = r0.getProperties(r12)     // Catch:{ all -> 0x0189 }
            boolean r0 = r12.isSuccessful()     // Catch:{ all -> 0x0189 }
            if (r0 != 0) goto L_0x0053
            com.mi.iot.common.error.IotError r10 = r12.getError()     // Catch:{ all -> 0x0189 }
            r11.onFailed(r10)     // Catch:{ all -> 0x0189 }
            monitor-exit(r9)     // Catch:{ all -> 0x0189 }
            return
        L_0x0053:
            java.lang.Object r12 = r12.getResult()     // Catch:{ all -> 0x0189 }
            com.mi.iot.runtime.wan.http.bean.PropertyBeen r12 = (com.p022mi.iot.runtime.wan.http.bean.PropertyBeen) r12     // Catch:{ all -> 0x0189 }
            java.util.List<com.mi.iot.runtime.wan.http.bean.PropertyBeen$PropertyBean> r12 = r12.propertyBeans     // Catch:{ all -> 0x0189 }
            if (r12 != 0) goto L_0x0086
            int r12 = r10.size()     // Catch:{ all -> 0x0189 }
            if (r12 != 0) goto L_0x0067
            r11.onSucceed(r10)     // Catch:{ all -> 0x0189 }
            goto L_0x0084
        L_0x0067:
            com.mi.iot.common.error.IotError r10 = com.p022mi.iot.common.error.IotError.SERVER_RESPONSE_ERROR     // Catch:{ all -> 0x0189 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0189 }
            r12.<init>()     // Catch:{ all -> 0x0189 }
            java.lang.String r0 = r10.getMessage()     // Catch:{ all -> 0x0189 }
            r12.append(r0)     // Catch:{ all -> 0x0189 }
            java.lang.String r0 = ": properties is null"
            r12.append(r0)     // Catch:{ all -> 0x0189 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0189 }
            r10.setMessage(r12)     // Catch:{ all -> 0x0189 }
            r11.onFailed(r10)     // Catch:{ all -> 0x0189 }
        L_0x0084:
            monitor-exit(r9)     // Catch:{ all -> 0x0189 }
            return
        L_0x0086:
            int r0 = r12.size()     // Catch:{ all -> 0x0189 }
            int r1 = r10.size()     // Catch:{ all -> 0x0189 }
            if (r0 == r1) goto L_0x00af
            com.mi.iot.common.error.IotError r10 = com.p022mi.iot.common.error.IotError.SERVER_RESPONSE_ERROR     // Catch:{ all -> 0x0189 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0189 }
            r12.<init>()     // Catch:{ all -> 0x0189 }
            java.lang.String r0 = r10.getMessage()     // Catch:{ all -> 0x0189 }
            r12.append(r0)     // Catch:{ all -> 0x0189 }
            java.lang.String r0 = ": properties size error"
            r12.append(r0)     // Catch:{ all -> 0x0189 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0189 }
            r10.setMessage(r12)     // Catch:{ all -> 0x0189 }
            r11.onFailed(r10)     // Catch:{ all -> 0x0189 }
            monitor-exit(r9)     // Catch:{ all -> 0x0189 }
            return
        L_0x00af:
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x0189 }
        L_0x00b3:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0189 }
            if (r0 == 0) goto L_0x0165
            java.lang.Object r0 = r12.next()     // Catch:{ all -> 0x0189 }
            com.mi.iot.runtime.wan.http.bean.PropertyBeen$PropertyBean r0 = (com.p022mi.iot.runtime.wan.http.bean.PropertyBeen.PropertyBean) r0     // Catch:{ all -> 0x0189 }
            if (r0 != 0) goto L_0x00e0
            com.mi.iot.common.error.IotError r12 = com.p022mi.iot.common.error.IotError.SERVER_RESPONSE_ERROR     // Catch:{ all -> 0x0189 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0189 }
            r0.<init>()     // Catch:{ all -> 0x0189 }
            java.lang.String r1 = r12.getMessage()     // Catch:{ all -> 0x0189 }
            r0.append(r1)     // Catch:{ all -> 0x0189 }
            java.lang.String r1 = ": property is null"
            r0.append(r1)     // Catch:{ all -> 0x0189 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0189 }
            r12.setMessage(r0)     // Catch:{ all -> 0x0189 }
            r11.onFailed(r12)     // Catch:{ all -> 0x0189 }
            goto L_0x0165
        L_0x00e0:
            java.util.Iterator r1 = r10.iterator()     // Catch:{ all -> 0x0189 }
        L_0x00e4:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0189 }
            if (r3 == 0) goto L_0x00b3
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0189 }
            com.mi.iot.common.instance.Property r3 = (com.p022mi.iot.common.instance.Property) r3     // Catch:{ all -> 0x0189 }
            if (r3 == 0) goto L_0x00e4
            java.lang.String r4 = r3.getPid()     // Catch:{ all -> 0x0189 }
            java.lang.String r5 = r0.pid     // Catch:{ all -> 0x0189 }
            boolean r4 = android.text.TextUtils.equals(r4, r5)     // Catch:{ all -> 0x0189 }
            if (r4 == 0) goto L_0x00e4
            int r4 = r0.status     // Catch:{ all -> 0x0189 }
            r3.setOpStatus(r4)     // Catch:{ all -> 0x0189 }
            int r4 = r0.status     // Catch:{ all -> 0x0189 }
            if (r4 == 0) goto L_0x010b
            r3.setValueValid(r2)     // Catch:{ all -> 0x0189 }
            goto L_0x00e4
        L_0x010b:
            com.mi.iot.common.instance.PropertyDefinition r4 = r3.getDefinition()     // Catch:{ all -> 0x0189 }
            com.mi.iot.common.instance.DataFormat r4 = r4.getDataFormat()     // Catch:{ all -> 0x0189 }
            java.lang.Object r5 = r0.value     // Catch:{ all -> 0x0189 }
            if (r5 != 0) goto L_0x0118
            goto L_0x013d
        L_0x0118:
            java.lang.Class r6 = r4.getJavaClass()     // Catch:{ all -> 0x0189 }
            java.lang.Class<java.lang.Integer> r7 = java.lang.Integer.class
            if (r6 != r7) goto L_0x012b
            java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ all -> 0x0189 }
            int r4 = r5.intValue()     // Catch:{ all -> 0x0189 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0189 }
            goto L_0x013d
        L_0x012b:
            java.lang.Class r4 = r4.getJavaClass()     // Catch:{ all -> 0x0189 }
            java.lang.Class<java.lang.Long> r6 = java.lang.Long.class
            if (r4 != r6) goto L_0x013d
            java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ all -> 0x0189 }
            long r4 = r5.longValue()     // Catch:{ all -> 0x0189 }
            java.lang.Long r5 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0189 }
        L_0x013d:
            boolean r3 = r3.setValue(r5)     // Catch:{ all -> 0x0189 }
            if (r3 != 0) goto L_0x00e4
            com.mi.iot.common.error.IotError r0 = com.p022mi.iot.common.error.IotError.SERVER_RESPONSE_ERROR     // Catch:{ all -> 0x0189 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0189 }
            r1.<init>()     // Catch:{ all -> 0x0189 }
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x0189 }
            r1.append(r3)     // Catch:{ all -> 0x0189 }
            java.lang.String r3 = ": property value invalid: "
            r1.append(r3)     // Catch:{ all -> 0x0189 }
            r1.append(r5)     // Catch:{ all -> 0x0189 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0189 }
            r0.setMessage(r1)     // Catch:{ all -> 0x0189 }
            r11.onFailed(r0)     // Catch:{ all -> 0x0189 }
            goto L_0x00b3
        L_0x0165:
            r11.onSucceed(r10)     // Catch:{ all -> 0x0189 }
            monitor-exit(r9)     // Catch:{ all -> 0x0189 }
            return
        L_0x016a:
            com.mi.iot.common.error.IotError r10 = com.p022mi.iot.common.error.IotError.INTERNAL_NOT_INITIALIZED     // Catch:{ all -> 0x0189 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0189 }
            r12.<init>()     // Catch:{ all -> 0x0189 }
            java.lang.String r0 = r10.getMessage()     // Catch:{ all -> 0x0189 }
            r12.append(r0)     // Catch:{ all -> 0x0189 }
            java.lang.String r0 = ": getProperties"
            r12.append(r0)     // Catch:{ all -> 0x0189 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0189 }
            r10.setMessage(r12)     // Catch:{ all -> 0x0189 }
            r11.onFailed(r10)     // Catch:{ all -> 0x0189 }
            monitor-exit(r9)     // Catch:{ all -> 0x0189 }
            return
        L_0x0189:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0189 }
            goto L_0x018d
        L_0x018c:
            throw r10
        L_0x018d:
            goto L_0x018c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p022mi.iot.runtime.wan.WanCtrlRuntime.getProperties(com.mi.iot.common.instance.Device, java.util.List, com.mi.iot.common.handler.CommonHandler, int):void");
    }

    public void init(Context context) {
        this.mContext = context;
    }

    public void invokeAction(Action action, CommonHandler<Action> commonHandler, int i) {
        synchronized (WanCtrlRuntime.class) {
            OpenHomeService openHomeService = this.mOpenHomeService;
            if (openHomeService != null) {
                OpenHomeService openHomeService2 = this.mOpenHomeServiceV2;
                if (openHomeService2 != null) {
                    if (i == 2) {
                        openHomeService = openHomeService2;
                    }
                    ActionBean actionBean = new ActionBean();
                    actionBean.aid = action.getAid();
                    for (Property value : action.getArguments()) {
                        actionBean.inArgs.add(value.getValue());
                    }
                    ApiResponse<ActionBean> invokeAction = openHomeService.invokeAction(actionBean);
                    if (!invokeAction.isSuccessful()) {
                        commonHandler.onFailed(invokeAction.getError());
                        return;
                    }
                    invokeAction.getCode();
                    List<Property> results = action.getResults();
                    ActionBean result = invokeAction.getResult();
                    if (result.outArgs != null && results.size() == result.outArgs.size()) {
                        if (result.status == 0) {
                            if (results.size() == 0) {
                                commonHandler.onSucceed(action);
                                return;
                            }
                            for (int i2 = 0; i2 < results.size(); i2++) {
                                Property property = action.getResults().get(i2);
                                Object obj = result.outArgs.get(i2);
                                if (!(property.getValue() instanceof Integer) || !(obj instanceof Double)) {
                                    if (!property.setValue(obj)) {
                                        commonHandler.onFailed(IotError.SERVER_RESPONSE_ERROR);
                                        return;
                                    }
                                } else if (!property.setValue(Integer.valueOf(((Double) obj).intValue()))) {
                                    commonHandler.onFailed(IotError.SERVER_RESPONSE_ERROR);
                                    return;
                                }
                            }
                            commonHandler.onSucceed(action);
                            return;
                        }
                    }
                    commonHandler.onFailed(new IotError(result.status, result.description));
                    return;
                }
            }
            IotError iotError = IotError.INTERNAL_NOT_INITIALIZED;
            iotError.setMessage(iotError.getMessage() + ": invokeAction");
            commonHandler.onFailed(iotError);
        }
    }

    public void pairing(Device device, String str, CompletedHandler completedHandler) {
    }

    public void setProperties(Device device, List<Property> list, WritePropertyHandler writePropertyHandler, int i) {
        synchronized (WanCtrlRuntime.class) {
            OpenHomeService openHomeService = this.mOpenHomeService;
            if (openHomeService != null) {
                OpenHomeService openHomeService2 = this.mOpenHomeServiceV2;
                if (openHomeService2 != null) {
                    if (i == 2) {
                        openHomeService = openHomeService2;
                    }
                    PropertyBeen propertyBeen = new PropertyBeen();
                    for (Property next : list) {
                        if (next != null) {
                            PropertyBeen.PropertyBean propertyBean = new PropertyBeen.PropertyBean();
                            propertyBean.pid = next.getPid();
                            propertyBean.value = next.getValue();
                            propertyBeen.addPropertyBean(propertyBean);
                        }
                    }
                    ApiResponse<PropertyBeen> properties = openHomeService.setProperties(propertyBeen);
                    if (!properties.isSuccessful()) {
                        writePropertyHandler.onFailed(properties.getError());
                        return;
                    }
                    properties.getCode();
                    writePropertyHandler.onSucceed((PropertyBeen) properties.mResult);
                    return;
                }
            }
            IotError iotError = IotError.INTERNAL_NOT_INITIALIZED;
            iotError.setMessage(iotError.getMessage() + ": setProperties");
            writePropertyHandler.onFailed(iotError);
        }
    }

    public void start() {
        synchronized (WanCtrlRuntime.class) {
            RetrofitManager.getInstance().deInit();
            this.mOpenHomeService = RetrofitManager.getInstance().getOpenHomeService();
            this.mSpecService = RetrofitManager.getInstance().getSpecService();
            this.mOpenHomeServiceV2 = RetrofitManager.getInstance().getOpenHomeServiceV2();
            this.mSpecServiceV2 = RetrofitManager.getInstance().getSpecServiceV2();
        }
    }

    public void stop() {
    }

    public void subscribe(Device device, List<Property> list, CommonHandler<List<Property>> commonHandler, int i) {
        synchronized (WanCtrlRuntime.class) {
            OpenHomeService openHomeService = this.mOpenHomeService;
            if (openHomeService != null) {
                OpenHomeService openHomeService2 = this.mOpenHomeServiceV2;
                if (openHomeService2 != null) {
                    if (i == 2) {
                        openHomeService = openHomeService2;
                    }
                    SubscribeBean subscribeBean = new SubscribeBean();
                    subscribeBean.topic = "properties-changed";
                    for (Property next : list) {
                        if (next != null) {
                            subscribeBean.properties.add(next.getPid());
                        }
                    }
                    CtrlRuntimeManager.getInstance().getAppConfig();
                    subscribeBean.type = "mipush-android";
                    subscribeBean.url = WebShellActivity.ARGS_KEY_URL;
                    subscribeBean.identifier = ServiceManager.getInstance().getPushManager().getPushId();
                    ApiResponse<SubscribeBean.Response> subscribe = openHomeService.subscribe(subscribeBean);
                    if (!subscribe.isSuccessful()) {
                        commonHandler.onFailed(subscribe.getError());
                        return;
                    }
                    SubscribeBean.Response result = subscribe.getResult();
                    HashMap hashMap = new HashMap();
                    for (Property next2 : list) {
                        if (next2 != null) {
                            hashMap.put(next2.getPid(), next2);
                        }
                    }
                    for (PropertyBeen.PropertyBean next3 : result.properties) {
                        if (next3.status != 0) {
                            hashMap.remove(next3.pid);
                        }
                    }
                    commonHandler.onSucceed(new ArrayList(hashMap.values()));
                    return;
                }
            }
            IotError iotError = IotError.INTERNAL_NOT_INITIALIZED;
            iotError.setMessage(iotError.getMessage() + ": subscribe");
            commonHandler.onFailed(iotError);
        }
    }

    public void unSubscribe(Device device, List<Property> list, CommonHandler<List<Property>> commonHandler, int i) {
        synchronized (WanCtrlRuntime.class) {
            OpenHomeService openHomeService = this.mOpenHomeService;
            if (openHomeService != null) {
                OpenHomeService openHomeService2 = this.mOpenHomeServiceV2;
                if (openHomeService2 != null) {
                    if (i == 2) {
                        openHomeService = openHomeService2;
                    }
                    SubscribeBean subscribeBean = new SubscribeBean();
                    subscribeBean.topic = "properties-changed";
                    for (Property next : list) {
                        if (next != null) {
                            subscribeBean.properties.add(next.getPid());
                        }
                    }
                    ApiResponse<SubscribeBean.Response> unsubscribe = openHomeService.unsubscribe(subscribeBean);
                    if (!unsubscribe.isSuccessful()) {
                        commonHandler.onFailed(unsubscribe.getError());
                        return;
                    }
                    SubscribeBean.Response result = unsubscribe.getResult();
                    HashMap hashMap = new HashMap();
                    for (Property next2 : list) {
                        if (next2 != null) {
                            hashMap.put(next2.getPid(), next2);
                        }
                    }
                    for (PropertyBeen.PropertyBean next3 : result.properties) {
                        if (next3.status != 0) {
                            hashMap.remove(next3.pid);
                        }
                    }
                    commonHandler.onSucceed(new ArrayList(hashMap.values()));
                    return;
                }
            }
            IotError iotError = IotError.INTERNAL_NOT_INITIALIZED;
            iotError.setMessage(iotError.getMessage() + ": unSubscribe");
            commonHandler.onFailed(iotError);
        }
    }
}
