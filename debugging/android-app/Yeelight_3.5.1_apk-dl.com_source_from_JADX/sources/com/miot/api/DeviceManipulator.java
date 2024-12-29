package com.miot.api;

import android.os.RemoteException;
import com.miot.api.ICompletionHandler;
import com.miot.api.IInvokeCompletionHandler;
import com.miot.api.IPropertyChangedListener;
import com.miot.api.IReadPropertyCompletionHandler;
import com.miot.common.device.invocation.ActionInfo;
import com.miot.common.device.invocation.PropertyInfo;
import com.miot.common.exception.MiotException;
import com.miot.common.people.People;
import com.miot.common.utils.Logger;

public class DeviceManipulator {
    /* access modifiers changed from: private */
    public static String TAG = "DeviceManipulator";
    private IDeviceManipulator mIDeviceManipulator;

    public interface CompletionHandler {
        void onFailed(int i, String str);

        void onSucceed();
    }

    public interface InvokeCompletionHandler {
        void onFailed(int i, String str);

        void onSucceed(ActionInfo actionInfo);
    }

    public interface PropertyChangedListener {
        void onPropertyChanged(PropertyInfo propertyInfo, String str);
    }

    public interface ReadPropertyCompletionHandler {
        void onFailed(int i, String str);

        void onSucceed(PropertyInfo propertyInfo);
    }

    public DeviceManipulator(IDeviceManipulator iDeviceManipulator) {
        this.mIDeviceManipulator = iDeviceManipulator;
    }

    public void addPropertyChangedListener(PropertyInfo propertyInfo, final CompletionHandler completionHandler, final PropertyChangedListener propertyChangedListener) {
        if (this.mIDeviceManipulator != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                try {
                    this.mIDeviceManipulator.addPropertyChangedListener(people, propertyInfo, new ICompletionHandler.Stub() {
                        public void onFailed(int i, String str) {
                            try {
                                completionHandler.onFailed(i, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        public void onSucceed() {
                            try {
                                completionHandler.onSucceed();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }, new IPropertyChangedListener.Stub() {
                        public void onPropertyChanged(PropertyInfo propertyInfo, String str) {
                            String access$000 = DeviceManipulator.TAG;
                            Logger.m7499d(access$000, "onPropertyChanged: " + str);
                            try {
                                propertyChangedListener.onPropertyChanged(propertyInfo, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (RemoteException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void enableLanCtrl(boolean z) {
        IDeviceManipulator iDeviceManipulator = this.mIDeviceManipulator;
        if (iDeviceManipulator != null) {
            try {
                iDeviceManipulator.enableLanCtrl(z);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void invoke(ActionInfo actionInfo, final InvokeCompletionHandler invokeCompletionHandler) {
        if (this.mIDeviceManipulator != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                try {
                    this.mIDeviceManipulator.invoke(people, actionInfo, new IInvokeCompletionHandler.Stub() {
                        public void onFailed(int i, String str) {
                            try {
                                invokeCompletionHandler.onFailed(i, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        public void onSucceed(ActionInfo actionInfo) {
                            try {
                                invokeCompletionHandler.onSucceed(actionInfo);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public boolean isLanCtrlEnabled() {
        IDeviceManipulator iDeviceManipulator = this.mIDeviceManipulator;
        if (iDeviceManipulator != null) {
            try {
                return iDeviceManipulator.isLanCtrlEnabled();
            } catch (RemoteException e) {
                e.printStackTrace();
                return false;
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void readProperty(PropertyInfo propertyInfo, final ReadPropertyCompletionHandler readPropertyCompletionHandler) {
        if (this.mIDeviceManipulator != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                try {
                    this.mIDeviceManipulator.readProperty(people, propertyInfo, new IReadPropertyCompletionHandler.Stub() {
                        public void onFailed(int i, String str) {
                            try {
                                readPropertyCompletionHandler.onFailed(i, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        public void onSucceed(PropertyInfo propertyInfo) {
                            try {
                                readPropertyCompletionHandler.onSucceed(propertyInfo);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (RemoteException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void removePropertyChangedListener(PropertyInfo propertyInfo, final CompletionHandler completionHandler) {
        if (this.mIDeviceManipulator != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                try {
                    this.mIDeviceManipulator.removePropertyChangedListener(people, propertyInfo, new ICompletionHandler.Stub() {
                        public void onFailed(int i, String str) {
                            try {
                                completionHandler.onFailed(i, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        public void onSucceed() {
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

    public void setIDeviceManipulator(IDeviceManipulator iDeviceManipulator) {
        this.mIDeviceManipulator = iDeviceManipulator;
    }
}
