package com.miot.api;

import android.os.RemoteException;
import com.miot.common.config.AppConfiguration;
import com.miot.common.model.DeviceModel;
import java.util.List;

public class Negotiator {
    private static final String TAG = "Negotiator";
    private INegotiator mINegotiator;

    public Negotiator(INegotiator iNegotiator) {
        this.mINegotiator = iNegotiator;
    }

    public void addDeviceModels(List<DeviceModel> list) {
        INegotiator iNegotiator = this.mINegotiator;
        if (iNegotiator != null) {
            try {
                iNegotiator.addDeviceModels(list);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public void addSpecModels(List<String> list) {
        INegotiator iNegotiator = this.mINegotiator;
        if (iNegotiator != null) {
            try {
                iNegotiator.addSpecModels(list);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public void addSpecUrn(String str, String str2) {
        INegotiator iNegotiator = this.mINegotiator;
        if (iNegotiator != null) {
            try {
                iNegotiator.addSpecUrn(str, str2);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public void setAppConfig(AppConfiguration appConfiguration) {
        INegotiator iNegotiator = this.mINegotiator;
        if (iNegotiator != null) {
            try {
                iNegotiator.setAppConfig(appConfiguration);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public void setINegotiator(INegotiator iNegotiator) {
        this.mINegotiator = iNegotiator;
    }

    public void setMiPushAlias(String str, String str2) {
        INegotiator iNegotiator = this.mINegotiator;
        if (iNegotiator != null) {
            try {
                iNegotiator.setMiPushAlias(str, str2);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean subscribeTopic(String str, String str2) {
        INegotiator iNegotiator = this.mINegotiator;
        if (iNegotiator == null) {
            return false;
        }
        try {
            return iNegotiator.subscribeTopic(str, str2);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void unsetMiPushAlias(String str, String str2) {
        INegotiator iNegotiator = this.mINegotiator;
        if (iNegotiator != null) {
            try {
                iNegotiator.unsetMiPushAlias(str, str2);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean unsubscribeTopic(String str, String str2) {
        INegotiator iNegotiator = this.mINegotiator;
        if (iNegotiator == null) {
            return false;
        }
        try {
            return iNegotiator.unsubscribeTopic(str, str2);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }
}
