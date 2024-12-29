package com.miot.service;

import android.content.Context;
import android.content.Intent;
import com.miot.service.common.manager.ServiceManager;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.p146mi.iot.common.instance.Action;
import com.p146mi.iot.common.instance.Device;
import com.p146mi.iot.common.instance.Property;
import com.p146mi.iot.manager.IControllerManager;
import com.p146mi.iot.manager.handler.ICompletedHandler;
import com.p146mi.iot.manager.handler.IControlHandler;
import com.p146mi.iot.manager.handler.IInvokeHandler;
import com.p146mi.iot.manager.listener.IDeviceListener;
import com.p146mi.iot.manager.listener.IPropertiesChangedListener;
import java.util.List;

public class ControllerManagerImpl extends IControllerManager.Stub {
    private Context mContext;

    public ControllerManagerImpl(Context context) {
        this.mContext = context;
    }

    public void changeName(Device device, String str, ICompletedHandler iCompletedHandler) {
        ServiceManager.getInstance().getControllerManager().changeName(device, str, iCompletedHandler);
    }

    public void getDeviceList(IDeviceListener iDeviceListener) {
        ServiceManager.getInstance().getControllerManager().getDeviceList(iDeviceListener, 1);
    }

    public void getDeviceListExtV2(IDeviceListener iDeviceListener) {
        ServiceManager.getInstance().getControllerManager().getDeviceList(iDeviceListener, 20);
    }

    public void getDeviceListV2(IDeviceListener iDeviceListener) {
        ServiceManager.getInstance().getControllerManager().getDeviceList(iDeviceListener, 2);
    }

    public void getProperties(Device device, List<Property> list, IControlHandler iControlHandler) {
        ServiceManager.getInstance().getControllerManager().getProperties(device, list, iControlHandler, 1);
    }

    public void getPropertiesV2(Device device, List<Property> list, IControlHandler iControlHandler) {
        ServiceManager.getInstance().getControllerManager().getProperties(device, list, iControlHandler, 2);
    }

    public void invokeAction(Device device, Action action, IInvokeHandler iInvokeHandler) {
        ServiceManager.getInstance().getControllerManager().invokeAction(device, action, iInvokeHandler, 1);
    }

    public void invokeActionV2(Device device, Action action, IInvokeHandler iInvokeHandler) {
        ServiceManager.getInstance().getControllerManager().invokeAction(device, action, iInvokeHandler, 2);
    }

    public void pairing(Device device, String str, ICompletedHandler iCompletedHandler) {
        ServiceManager.getInstance().getControllerManager().pairing(device, str, iCompletedHandler);
    }

    public void setProperties(Device device, List<Property> list, IControlHandler iControlHandler) {
        ServiceManager.getInstance().getControllerManager().setProperties(device, list, iControlHandler, 1);
    }

    public void setPropertiesV2(Device device, List<Property> list, IControlHandler iControlHandler) {
        ServiceManager.getInstance().getControllerManager().setProperties(device, list, iControlHandler, 2);
    }

    public void startScanBarcode() {
        if (this.mContext != null) {
            Intent intent = new Intent(this.mContext, ScanBarcodeActivity.class);
            intent.putExtra("from", 200);
            this.mContext.startActivity(intent);
        }
    }

    public void subscribe(Device device, List<Property> list, IControlHandler iControlHandler, IPropertiesChangedListener iPropertiesChangedListener) {
        ServiceManager.getInstance().getControllerManager().subscribe(device, list, iControlHandler, iPropertiesChangedListener, 1);
    }

    public void subscribeV2(Device device, List<Property> list, IControlHandler iControlHandler, IPropertiesChangedListener iPropertiesChangedListener) {
        ServiceManager.getInstance().getControllerManager().subscribe(device, list, iControlHandler, iPropertiesChangedListener, 2);
    }

    public void unpairing(Device device, ICompletedHandler iCompletedHandler) {
        ServiceManager.getInstance().getControllerManager().unpairing(device, iCompletedHandler);
    }

    public void unsubscribe(Device device, List<Property> list, IControlHandler iControlHandler) {
        ServiceManager.getInstance().getControllerManager().unsubscribe(device, list, iControlHandler, 1);
    }

    public void unsubscribeV2(Device device, List<Property> list, IControlHandler iControlHandler) {
        ServiceManager.getInstance().getControllerManager().unsubscribe(device, list, iControlHandler, 2);
    }
}
