package com.miot.service.manager;

import android.content.Context;
import android.os.RemoteException;
import com.miot.api.IAddTimerCompletionHandler;
import com.miot.api.ICommonHandler;
import com.miot.api.ICompletionHandler;
import com.miot.api.IDeviceHandler;
import com.miot.api.IDeviceLogHandler;
import com.miot.api.IDeviceManager;
import com.miot.api.IGetUserProfileHandler;
import com.miot.api.IQueryFirmwareHandler;
import com.miot.api.ISceneHandler;
import com.miot.api.IScenesHandler;
import com.miot.api.ISharedRequestsHandler;
import com.miot.api.ISharedUsersHandler;
import com.miot.api.ITimerHandler;
import com.miot.common.device.Device;
import com.miot.common.device.DiscoveryType;
import com.miot.common.devicelog.DeviceLogQueryParams;
import com.miot.common.people.People;
import com.miot.common.scene.SceneBean;
import com.miot.common.share.SharedRequest;
import com.miot.common.timer.Timer;
import com.miot.common.utils.Logger;
import com.miot.service.common.manager.ServiceManager;
import com.miot.service.common.miotcloud.MiotCloud;
import com.miot.service.common.miotcloud.MiotCloudApi;
import com.miot.service.manager.bindkey.BindKeyCheckTask;
import com.miot.service.manager.bindkey.BindKeyGetTask;
import com.miot.service.manager.devicedata.QueryDeviceLogTask;
import com.miot.service.manager.discovery.MiotCacheDevice;
import com.miot.service.manager.discovery.QueryDevicesTask;
import com.miot.service.manager.discovery.ScanDeviceTask;
import com.miot.service.manager.discovery.impl.DeviceFactory;
import com.miot.service.manager.firmware.QueryFirmwareTask;
import com.miot.service.manager.firmware.UpgradeFirmwareTask;
import com.miot.service.manager.modification.RenameDeviceTask;
import com.miot.service.manager.ownership.OwnershipTask;
import com.miot.service.manager.scene.EditSceneTask;
import com.miot.service.manager.scene.EnableSceneTask;
import com.miot.service.manager.scene.QuerySceneTask;
import com.miot.service.manager.scene.QueryScenesTask;
import com.miot.service.manager.scene.RunSceneTask;
import com.miot.service.manager.share.owner.CancelShareTask;
import com.miot.service.manager.share.owner.QuerySharedUsersTask;
import com.miot.service.manager.share.owner.ShareBatchDeviceTask;
import com.miot.service.manager.share.owner.ShareDeviceTask;
import com.miot.service.manager.share.user.QuerySharedRequestsTask;
import com.miot.service.manager.share.user.ReplySharedRequestTask;
import com.miot.service.manager.timer.AddTimerTask;
import com.miot.service.manager.timer.EditTimerTask;
import com.miot.service.manager.timer.QueryTimersTask;
import com.miot.service.manager.timer.RemoveTimerTask;
import com.miot.service.manager.user.GetUserProfileTask;
import com.miot.service.manager.verify.PinCodeCheckTask;
import com.miot.service.manager.verify.PinCodeSetTask;
import com.xiaomi.miio.MiioLocalAPI;
import com.xiaomi.miio.MiioLocalErrorCode;
import com.xiaomi.miio.MiioLocalRpcResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

public class DeviceManagerImpl extends IDeviceManager.Stub {
    private static String TAG = "DeviceManagerImpl";
    private Context mContext;
    private ThreadPoolExecutor mExecutor;
    private ScanDeviceTask mScanTask;

    public DeviceManagerImpl(Context context, ThreadPoolExecutor threadPoolExecutor) {
        this.mContext = context;
        this.mExecutor = threadPoolExecutor;
        this.mScanTask = new ScanDeviceTask(context);
    }

    public void addScene(People people, SceneBean sceneBean, ICompletionHandler iCompletionHandler) {
    }

    public void addTimer(People people, Timer timer, IAddTimerCompletionHandler iAddTimerCompletionHandler) {
        Logger.m7499d(TAG, "addTimer");
        this.mExecutor.execute(new AddTimerTask(people, timer, iAddTimerCompletionHandler));
    }

    public void bindWithBindkey(People people, String str, final ICommonHandler iCommonHandler) {
        MiotCloudApi.bindWithBindkey(people, str, new MiotCloud.ResponseHandler() {
            public void onFailure(int i, String str) {
                try {
                    iCommonHandler.onFailed(i, str);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }

            public void onSuccess(JSONObject jSONObject) {
                try {
                    iCommonHandler.onSucceed(jSONObject.toString());
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void callSmarthomeApi(People people, String str, String str2, ICommonHandler iCommonHandler) {
        String str3 = TAG;
        Logger.m7499d(str3, "callSmarthomeApi: " + str);
        this.mExecutor.execute(new CallApiTask(people, str, str2, iCommonHandler));
    }

    public void cancelShare(People people, Device device, String str, ICompletionHandler iCompletionHandler) {
        this.mExecutor.execute(new CancelShareTask(people, device, str, iCompletionHandler));
    }

    public void checkBindKey(People people, String str, ICommonHandler iCommonHandler) {
        this.mExecutor.execute(new BindKeyCheckTask(people, str, iCommonHandler));
    }

    public void checkPinCode(People people, String str, Device device, ICommonHandler iCommonHandler) {
        this.mExecutor.execute(new PinCodeCheckTask(people, str, device, iCommonHandler));
    }

    public void disclaimOwnership(People people, Device device, ICompletionHandler iCompletionHandler) {
        Logger.m7499d(TAG, "disclaimOwnership");
        this.mExecutor.execute(new OwnershipTask(people, OwnershipTask.Type.disclaim, device, iCompletionHandler));
    }

    public void editScene(People people, SceneBean sceneBean, ICompletionHandler iCompletionHandler) {
        Logger.m7499d(TAG, "editScene");
        this.mExecutor.execute(new EditSceneTask(people, sceneBean, iCompletionHandler));
    }

    public void editTimer(People people, Timer timer, ICompletionHandler iCompletionHandler) {
        Logger.m7499d(TAG, "editTimer");
        this.mExecutor.execute(new EditTimerTask(people, timer, iCompletionHandler));
    }

    public void enableScene(People people, int i, boolean z, ICompletionHandler iCompletionHandler) {
        Logger.m7499d(TAG, "enableScene");
        this.mExecutor.execute(new EnableSceneTask(people, i, z, iCompletionHandler));
    }

    public void getBindKey(People people, ICommonHandler iCommonHandler) {
        this.mExecutor.execute(new BindKeyGetTask(people, iCommonHandler));
    }

    public Device getDevice(String str) {
        return ServiceManager.getInstance().getDevice(str);
    }

    public Device getDevice0(String str, String str2) {
        Device device = ServiceManager.getInstance().getDevice(str);
        if (device != null) {
            return device;
        }
        return DeviceFactory.createFrom(this.mContext, new MiotCacheDevice(str, str2));
    }

    public void getUserProfile(People people, String str, IGetUserProfileHandler iGetUserProfileHandler) {
        Logger.m7499d(TAG, "getUserProfile");
        this.mExecutor.execute(new GetUserProfileTask(people, str, iGetUserProfileHandler));
    }

    public void localPing(String str, final ICompletionHandler iCompletionHandler) {
        MiioLocalAPI.async_get_token(str, new MiioLocalRpcResponse() {
            public void onResponse(String str) {
                try {
                    int optInt = new JSONObject(str).optInt("code");
                    if (optInt != MiioLocalErrorCode.SUCCESS.getCode()) {
                        if (optInt != MiioLocalErrorCode.PERMISSION_DENIED.getCode()) {
                            iCompletionHandler.onFailed(optInt, "");
                            return;
                        }
                    }
                    iCompletionHandler.onSucceed();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, 1);
    }

    public void queryDeviceLog(People people, DeviceLogQueryParams deviceLogQueryParams, IDeviceLogHandler iDeviceLogHandler) {
        String str = TAG;
        Logger.m7499d(str, "queryDeviceLog: " + deviceLogQueryParams.getDid());
        this.mExecutor.execute(new QueryDeviceLogTask(people, deviceLogQueryParams, iDeviceLogHandler));
    }

    public void queryFirmwareInfo(People people, Device device, IQueryFirmwareHandler iQueryFirmwareHandler) {
        Logger.m7499d(TAG, "queryFirmwareInfo");
        this.mExecutor.execute(new QueryFirmwareTask(people, device, iQueryFirmwareHandler));
    }

    public void queryScene(People people, int i, ISceneHandler iSceneHandler) {
        this.mExecutor.execute(new QuerySceneTask(people, i, iSceneHandler));
    }

    public void querySceneList(People people, IScenesHandler iScenesHandler) {
        Logger.m7499d(TAG, "querySceneList");
        this.mExecutor.execute(new QueryScenesTask(people, iScenesHandler));
    }

    public void querySharedRequests(People people, ISharedRequestsHandler iSharedRequestsHandler) {
        this.mExecutor.execute(new QuerySharedRequestsTask(people, this.mContext, iSharedRequestsHandler));
    }

    public void querySharedUsers(People people, Device device, ISharedUsersHandler iSharedUsersHandler) {
        this.mExecutor.execute(new QuerySharedUsersTask(people, device, iSharedUsersHandler));
    }

    public void queryTimerList(People people, String str, ITimerHandler iTimerHandler) {
        String str2 = TAG;
        Logger.m7499d(str2, "queryTimerList: " + str);
        this.mExecutor.execute(new QueryTimersTask(people, str, iTimerHandler));
    }

    public void queryWanDevices(People people, IDeviceHandler iDeviceHandler) {
        Logger.m7499d(TAG, "getRemoteDeviceList");
        this.mExecutor.execute(new QueryDevicesTask(people, this.mContext, iDeviceHandler));
    }

    public void removeScene(People people, int i, ICompletionHandler iCompletionHandler) {
    }

    public void removeTimer(People people, long j, ICompletionHandler iCompletionHandler) {
        String str = TAG;
        Logger.m7499d(str, "removeTimer: " + j);
        this.mExecutor.execute(new RemoveTimerTask(people, j, iCompletionHandler));
    }

    public void renameDevice(People people, Device device, String str, ICompletionHandler iCompletionHandler) {
        String str2 = TAG;
        Logger.m7499d(str2, "renameDevice: " + device.getDeviceId() + "  newName: " + str);
        this.mExecutor.execute(new RenameDeviceTask(people, device, str, iCompletionHandler));
    }

    public void replySharedRequest(People people, SharedRequest sharedRequest, ICompletionHandler iCompletionHandler) {
        this.mExecutor.execute(new ReplySharedRequestTask(people, sharedRequest, iCompletionHandler));
    }

    public void runScene(People people, int i, ICompletionHandler iCompletionHandler) {
        String str = TAG;
        Logger.m7499d(str, "runScene: " + i);
        this.mExecutor.execute(new RunSceneTask(people, i, iCompletionHandler));
    }

    public void setPinCode(People people, String str, String str2, Device device, ICommonHandler iCommonHandler) {
        this.mExecutor.execute(new PinCodeSetTask(people, str, str2, device, iCommonHandler));
    }

    public void shareBatchDevice(People people, List<Device> list, List<String> list2, ICompletionHandler iCompletionHandler) {
        this.mExecutor.execute(new ShareBatchDeviceTask(people, list, list2, iCompletionHandler));
    }

    public void shareDevice(People people, Device device, String str, ICompletionHandler iCompletionHandler) {
        this.mExecutor.execute(new ShareDeviceTask(people, device, str, iCompletionHandler));
    }

    public void startScan(People people, IDeviceHandler iDeviceHandler) {
        this.mScanTask.start(iDeviceHandler);
    }

    public void startScan0(People people, List<String> list, IDeviceHandler iDeviceHandler) {
        ArrayList arrayList = new ArrayList();
        for (String valueOf : list) {
            arrayList.add(DiscoveryType.valueOf(valueOf));
        }
        this.mScanTask.start(arrayList, iDeviceHandler);
    }

    public void startUpgradeFirmware(People people, Device device, ICompletionHandler iCompletionHandler) {
        Logger.m7499d(TAG, "upgradeFirmware");
        this.mExecutor.execute(new UpgradeFirmwareTask(people, device, iCompletionHandler));
    }

    public void stopScan(People people) {
        this.mScanTask.stop();
    }

    public void takeOwnership(People people, Device device, ICompletionHandler iCompletionHandler) {
        Logger.m7499d(TAG, "takeOwnership");
        this.mExecutor.execute(new OwnershipTask(people, OwnershipTask.Type.take, device, iCompletionHandler));
    }
}
