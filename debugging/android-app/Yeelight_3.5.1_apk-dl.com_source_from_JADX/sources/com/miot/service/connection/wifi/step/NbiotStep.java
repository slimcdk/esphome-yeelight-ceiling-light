package com.miot.service.connection.wifi.step;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Message;
import android.widget.TextView;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.miot.service.C2875R;
import com.miot.service.connection.wifi.SmartConfigDataProvider;
import com.miot.service.connection.wifi.step.ConfigStep;
import com.miot.service.connection.wifi.step.SmartConfigStep;
import com.miot.service.qrcode.QrCodeParser;
import com.miot.service.view.MLAlertDialog;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class NbiotStep extends ConfigStep {
    private static final byte ERROR_BINDKEY = 1;
    private static final byte ERROR_BIND_ACCOUNT_TIMEOUT = 4;
    private static final byte ERROR_BIND_SAMEDEVICE = 7;
    private static final byte ERROR_BIND_SECURITY_FAIL = 2;
    private static final byte ERROR_BIND_SECURITY_TIMEOUT = 3;
    private static final byte ERROR_DID = 6;
    private static final byte ERROR_SIGN = 5;
    private static final int MSG_GET_BINDDEVICE_RETRY = 264;
    private static final int MSG_GET_BINDKEY_RETRY = 263;
    private static final int SCAN_NEW_DEVICE_INDEX = 0;
    private static final String TAG = "NbiotStep";
    private String mBindKey;
    private int mCurrentIndex;
    private byte mError;
    private int mGetBindKeyRetrys;
    private QrCodeParser qrCodeParser;

    private void getDeviceInfo(String str) {
        BluetoothLog.m7332v(String.format("getDeviceInfo did = %s", new Object[]{str}));
    }

    private void requestBindDevice(String str, QrCodeParser qrCodeParser2) {
        byte[] bArr;
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(new SecretKeySpec(qrCodeParser2.getIdKey().getBytes(), "HmacSHA256"));
            bArr = instance.doFinal(str.getBytes());
        } catch (Exception | NoSuchAlgorithmException unused) {
            bArr = null;
        }
        if (bArr == null || bArr.length == 0) {
            this.mError = 5;
            triggerTimeoutNow();
        }
    }

    private void requestBindKey(QrCodeParser qrCodeParser2) {
        StringBuilder sb = new StringBuilder();
        sb.append("response requestBindKey:");
        sb.append(qrCodeParser2);
    }

    public ArrayList<ConfigStep.ConfigTime> getAllConfigStages() {
        ArrayList<ConfigStep.ConfigTime> arrayList = new ArrayList<>();
        ConfigStep.ConfigTime configTime = new ConfigStep.ConfigTime();
        configTime.index = 0;
        configTime.time = 30000;
        arrayList.add(configTime);
        return arrayList;
    }

    public int getCurrentStageIndex() {
        BluetoothLog.m7332v(String.format("getCurrentStageIndex return 0", new Object[0]));
        return 0;
    }

    public SmartConfigStep.Step getStep() {
        return null;
    }

    public void handleMessage(Message message) {
        int i = message.what;
        if (i == MSG_GET_BINDKEY_RETRY) {
            requestBindKey(this.qrCodeParser);
        } else if (i != MSG_GET_BINDDEVICE_RETRY) {
            super.handleMessage(message);
        } else {
            requestBindDevice(this.mBindKey, this.qrCodeParser);
        }
    }

    public boolean onBackPressed() {
        try {
            new MLAlertDialog.Builder(this.mContext).setTitle((CharSequence) this.mContext.getString(C2875R.string.stop_connect_device_title)).setMessage((CharSequence) this.mContext.getString(C2875R.string.stop_connect_device_message)).setPositiveButton((CharSequence) this.mContext.getString(C2875R.string.confirm), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    NbiotStep.this.finishSmartConfig(false);
                }
            }).setNegativeButton((CharSequence) this.mContext.getString(C2875R.string.cancel), (DialogInterface.OnClickListener) null).setBtnTextColor(this.mContext.getResources().getColor(C2875R.color.std_dialog_button_red), -1).show();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public void onCreateStep(Context context) {
        BluetoothLog.m7332v("NbiotStep is onCreateStep");
        this.qrCodeParser = new QrCodeParser((String) SmartConfigDataProvider.getInstance().get(SmartConfigDataProvider.KEY_SCAN_QR_CODE));
        super.onCreateStep(context);
    }

    public void onFinishStep() {
        BluetoothLog.m7332v(String.format("onFinishStep QRCodeStep", new Object[0]));
        getHandler().removeMessages(124);
        super.onFinishStep();
    }

    public SmartConfigStep.Step onStageTimeOut(int i) {
        BluetoothLog.m7332v(String.format("onStageTimeOut index = %d", new Object[]{Integer.valueOf(i)}));
        return null;
    }

    public void setMainTitle(TextView textView) {
    }

    public void setSubMainTitle(TextView textView) {
    }

    public void startConnection(int i) {
        this.mCurrentIndex = i;
        if (i == 0) {
            if (this.qrCodeParser.getType() == QrCodeParser.QrCodeType.NBIOT) {
                requestBindKey(this.qrCodeParser);
            } else {
                finishSmartConfig(false);
            }
        }
    }
}
