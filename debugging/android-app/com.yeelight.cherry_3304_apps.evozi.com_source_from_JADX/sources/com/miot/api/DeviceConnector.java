package com.miot.api;

import android.os.RemoteException;
import com.miot.api.ICommonHandler;
import com.miot.api.ICompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.exception.MiotException;
import com.miot.common.people.People;
import com.miot.common.utils.Logger;

public class DeviceConnector {
    /* access modifiers changed from: private */
    public static String TAG = "DeviceConnector";
    private IDeviceConnection mIDeviceConnection;

    public DeviceConnector(IDeviceConnection iDeviceConnection) {
        this.mIDeviceConnection = iDeviceConnection;
    }

    public void connectToCloud(final AbstractDevice abstractDevice, final CompletionHandler completionHandler) {
        if (this.mIDeviceConnection != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                try {
                    this.mIDeviceConnection.connectToCloud(people, abstractDevice.getDevice(), new ICompletionHandler.Stub() {
                        public void onFailed(int i, String str) {
                            Logger.m10630e(DeviceConnector.TAG, String.format("%s connectToCloud onFailed: %d %s", new Object[]{abstractDevice.getDeviceModel(), Integer.valueOf(i), str}));
                            try {
                                completionHandler.onFailed(i, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        public void onSucceed() {
                            Logger.m10629d(DeviceConnector.TAG, String.format("%s connectToCloud onSucceed", new Object[]{abstractDevice.getDeviceModel()}));
                            try {
                                completionHandler.onSucceed();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void enableHttpLog() {
        try {
            this.mIDeviceConnection.enableHttpLog();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void getQrCode(String str, String str2, final CommonHandler<String> commonHandler) {
        try {
            People people = MiotManager.getPeople();
            String str3 = str;
            this.mIDeviceConnection.getQrCode(str3, MiotManager.getInstance().getAppConfig().getLocale().name(), str2, people, new ICommonHandler.Stub() {
                public void onFailed(int i, String str) {
                    CommonHandler commonHandler = commonHandler;
                    if (commonHandler != null) {
                        commonHandler.onFailed(i, str);
                    }
                }

                public void onSucceed(String str) {
                    CommonHandler commonHandler = commonHandler;
                    if (commonHandler != null) {
                        commonHandler.onSucceed(str);
                    }
                }
            });
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void setHttpUserAgent(String str) {
        try {
            this.mIDeviceConnection.setHttpUserAgent(str);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void setIDeviceConnection(IDeviceConnection iDeviceConnection) {
        this.mIDeviceConnection = iDeviceConnection;
    }
}
