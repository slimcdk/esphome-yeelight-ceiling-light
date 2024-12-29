package com.p022mi.iot.manager;

import android.os.RemoteException;
import com.miot.api.CompletionHandler;
import com.miot.api.DeviceManager;
import com.miot.api.MiotManager;
import com.miot.common.exception.MiotException;
import com.p022mi.iot.common.abstractdevice.AbstractDevice;
import com.p022mi.iot.common.abstractdevice.AbstractDeviceFactory;
import com.p022mi.iot.common.error.IotError;
import com.p022mi.iot.common.exception.IotException;
import com.p022mi.iot.common.handler.CommonHandler;
import com.p022mi.iot.common.handler.CompletedHandler;
import com.p022mi.iot.common.handler.ModifyPropertyHandler;
import com.p022mi.iot.common.handler.PropertiesChangedListener;
import com.p022mi.iot.common.instance.Action;
import com.p022mi.iot.common.instance.Device;
import com.p022mi.iot.common.instance.Property;
import com.p022mi.iot.manager.handler.IControlHandler;
import com.p022mi.iot.manager.handler.IInvokeHandler;
import com.p022mi.iot.manager.listener.IDeviceListener;
import com.p022mi.iot.manager.listener.IPropertiesChangedListener;
import com.squareup.okhttp.C4310u;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mi.iot.manager.ControllerManager */
public class ControllerManager {
    private static final String TAG = "ControllerManager";
    C4310u mClient;
    private IControllerManager mIControllerManager;

    /* renamed from: com.mi.iot.manager.ControllerManager$DeviceExtListener */
    private class DeviceExtListener extends IDeviceListener.Stub {
        List<Device> devices = new ArrayList();
        private CommonHandler<List<Device>> mHandler;

        public DeviceExtListener(CommonHandler<List<Device>> commonHandler) {
            this.mHandler = commonHandler;
        }

        public void onFailed(IotError iotError) {
            try {
                this.mHandler.onFailed(iotError);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onSucceed(Device device, int i, int i2) {
            if (device != null) {
                this.devices.add(device);
            }
            if (i2 == 0 || i + 1 == i2) {
                try {
                    this.mHandler.onSucceed(new ArrayList(this.devices));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.mi.iot.manager.ControllerManager$DeviceListener */
    private class DeviceListener extends IDeviceListener.Stub {
        List<AbstractDevice> abstractDevices = new ArrayList();
        private CommonHandler<List<AbstractDevice>> mHandler;

        public DeviceListener(CommonHandler<List<AbstractDevice>> commonHandler) {
            this.mHandler = commonHandler;
        }

        public void onFailed(IotError iotError) {
            try {
                this.mHandler.onFailed(iotError);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onSucceed(Device device, int i, int i2) {
            if (device != null) {
                AbstractDevice createDevice = AbstractDeviceFactory.createDevice(device, MiotManager.getInstance().getDeviceType(device.getDeviceType()));
                if (createDevice != null) {
                    this.abstractDevices.add(createDevice);
                }
            }
            if (i2 == 0 || i + 1 == i2) {
                try {
                    this.mHandler.onSucceed(new ArrayList(this.abstractDevices));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public ControllerManager(IControllerManager iControllerManager) {
        C4310u uVar = new C4310u();
        this.mClient = uVar;
        this.mIControllerManager = iControllerManager;
        uVar.mo27987E().add(new OkHttpLogingInterceptor());
    }

    private synchronized void check() {
        if (this.mIControllerManager == null) {
            throw new IotException(IotError.INTERNAL, "not bind");
        }
    }

    private void startScarBarcode() {
        check();
        try {
            this.mIControllerManager.startScanBarcode();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void getDeviceListV2(CommonHandler<List<AbstractDevice>> commonHandler) {
        check();
        try {
            this.mIControllerManager.getDeviceListV2(new DeviceListener(commonHandler));
        } catch (RemoteException e) {
            e.printStackTrace();
            throw new IotException((Throwable) e);
        }
    }

    public void getDeviceListV2Ext(CommonHandler<List<Device>> commonHandler) {
        check();
        try {
            this.mIControllerManager.getDeviceListExtV2(new DeviceExtListener(commonHandler));
        } catch (RemoteException e) {
            e.printStackTrace();
            throw new IotException((Throwable) e);
        }
    }

    public void getPropertiesV2(Device device, List<Property> list, final CommonHandler<List<Property>> commonHandler) {
        check();
        try {
            this.mIControllerManager.getPropertiesV2(device, list, new IControlHandler.Stub() {
                public void onError(IotError iotError) {
                    try {
                        commonHandler.onFailed(iotError);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                public void onResult(List<Property> list) {
                    try {
                        commonHandler.onSucceed(list);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        } catch (RemoteException e) {
            e.printStackTrace();
            throw new IotException((Throwable) e);
        }
    }

    public void getPropertiesV2(List<Property> list, CommonHandler<List<Property>> commonHandler) {
        getPropertiesV2((Device) null, list, commonHandler);
    }

    public void invokeActionV2(Device device, Action action, final CommonHandler<Action> commonHandler) {
        check();
        try {
            this.mIControllerManager.invokeActionV2(device, action, new IInvokeHandler.Stub() {
                public void onError(IotError iotError) {
                    try {
                        commonHandler.onFailed(iotError);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                public void onResult(Action action) {
                    try {
                        commonHandler.onSucceed(action);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void renameDevice(Device device, String str, final CompletedHandler completedHandler) {
        if (device == null) {
            completedHandler.onFailed(new IotError(-1, "unbindDevice [device] is null"));
            return;
        }
        com.miot.common.device.Device device2 = new com.miot.common.device.Device();
        device2.setDeviceId(device.getRealID());
        com.miot.common.abstractdevice.AbstractDevice abstractDevice = new com.miot.common.abstractdevice.AbstractDevice();
        abstractDevice.setDevice(device2);
        try {
            MiotManager.getDeviceManager().renameDevice(abstractDevice, str, new CompletionHandler() {
                public void onFailed(int i, String str) {
                    completedHandler.onFailed(new IotError(i, str));
                }

                public void onSucceed() {
                    completedHandler.onSucceed();
                }
            });
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    public void setPropertiesV2(Device device, List<Property> list, final ModifyPropertyHandler modifyPropertyHandler) {
        check();
        try {
            this.mIControllerManager.setPropertiesV2(device, list, new IControlHandler.Stub() {
                public void onError(IotError iotError) {
                    try {
                        modifyPropertyHandler.onFail(iotError);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                public void onResult(List<Property> list) {
                    if (list != null) {
                        try {
                            if (!list.isEmpty()) {
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                for (Property next : list) {
                                    if (next.writeSuccess()) {
                                        arrayList.add(next);
                                    } else {
                                        String.format("setPropertyV2: propertyID %s modify fail,detail :value %s,  desc %s", new Object[]{next.getPid(), String.valueOf(next.getValue()), next.getWriteErrorDesc()});
                                        arrayList2.add(next);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    modifyPropertyHandler.onModifySuccess(arrayList);
                                }
                                if (!arrayList2.isEmpty()) {
                                    modifyPropertyHandler.onModifyFail(arrayList2);
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        } catch (RemoteException e) {
            e.printStackTrace();
            throw new IotException((Throwable) e);
        }
    }

    public void setPropertiesV2(List<Property> list, ModifyPropertyHandler modifyPropertyHandler) {
        setPropertiesV2((Device) null, list, modifyPropertyHandler);
    }

    public void subscribeV2(Device device, List<Property> list, final CommonHandler<List<Property>> commonHandler, final PropertiesChangedListener propertiesChangedListener) {
        check();
        if (list.size() != 0) {
            try {
                this.mIControllerManager.subscribeV2(device, list, new IControlHandler.Stub() {
                    public void onError(IotError iotError) {
                        try {
                            commonHandler.onFailed(iotError);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                    public void onResult(List<Property> list) {
                        try {
                            commonHandler.onSucceed(list);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }, new IPropertiesChangedListener.Stub() {
                    public void onChanged(List<Property> list) {
                        try {
                            propertiesChangedListener.onChanged(list);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            } catch (RemoteException e) {
                e.printStackTrace();
                throw new IotException(IotError.INTERNAL, "subscribe failed: RemoteException");
            }
        } else {
            throw new IotException(IotError.INTERNAL, "properties size is 0");
        }
    }

    public void subscribeV2(List<Property> list, CommonHandler<List<Property>> commonHandler, PropertiesChangedListener propertiesChangedListener) {
        subscribeV2((Device) null, list, commonHandler, propertiesChangedListener);
    }

    public void unbind(final Device device, final CompletedHandler completedHandler) {
        try {
            MiotManager.getDeviceManager().getRemoteDeviceList(new DeviceManager.DeviceHandler() {
                public void onFailed(int i, String str) {
                    CompletedHandler completedHandler = completedHandler;
                    if (completedHandler != null) {
                        completedHandler.onFailed(new IotError(i, str));
                    }
                }

                public void onSucceed(List<com.miot.common.abstractdevice.AbstractDevice> list) {
                    for (com.miot.common.abstractdevice.AbstractDevice next : list) {
                        if (next.getDeviceId().equals(device.getRealID())) {
                            try {
                                MiotManager.getDeviceManager().disclaimOwnership(next, new CompletionHandler() {
                                    public void onFailed(int i, String str) {
                                        CompletedHandler completedHandler = completedHandler;
                                        if (completedHandler != null) {
                                            completedHandler.onFailed(new IotError(i, str));
                                        }
                                    }

                                    public void onSucceed() {
                                        CompletedHandler completedHandler = completedHandler;
                                        if (completedHandler != null) {
                                            completedHandler.onSucceed();
                                        }
                                    }
                                });
                                return;
                            } catch (MiotException e) {
                                e.printStackTrace();
                                return;
                            }
                        }
                    }
                }
            });
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    public void unsubscribeV2(Device device, List<Property> list, final CommonHandler<List<Property>> commonHandler) {
        check();
        if (list.size() != 0) {
            try {
                this.mIControllerManager.unsubscribeV2(device, list, new IControlHandler.Stub() {
                    public void onError(IotError iotError) {
                        try {
                            commonHandler.onFailed(iotError);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                    public void onResult(List<Property> list) {
                        try {
                            commonHandler.onSucceed(list);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            } catch (RemoteException e) {
                e.printStackTrace();
                throw new IotException(IotError.INTERNAL, "unsubscribe failed: RemoteException");
            }
        } else {
            throw new IotException(IotError.INTERNAL, "properties size is 0");
        }
    }

    public void unsubscribeV2(List<Property> list, CommonHandler<List<Property>> commonHandler) {
        unsubscribeV2((Device) null, list, commonHandler);
    }
}
