package com.inuker.bluetooth.library;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.inuker.bluetooth.library.IBluetoothService;
import com.inuker.bluetooth.library.connect.listener.BleConnectStatusListener;
import com.inuker.bluetooth.library.connect.listener.BluetoothStateListener;
import com.inuker.bluetooth.library.connect.options.BleConnectOptions;
import com.inuker.bluetooth.library.connect.response.BleConnectResponse;
import com.inuker.bluetooth.library.connect.response.BleNotifyResponse;
import com.inuker.bluetooth.library.connect.response.BleReadResponse;
import com.inuker.bluetooth.library.connect.response.BleReadRssiResponse;
import com.inuker.bluetooth.library.connect.response.BleUnnotifyResponse;
import com.inuker.bluetooth.library.connect.response.BleWriteResponse;
import com.inuker.bluetooth.library.connect.response.BluetoothResponse;
import com.inuker.bluetooth.library.receiver.BluetoothReceiver;
import com.inuker.bluetooth.library.receiver.listener.BleCharacterChangeListener;
import com.inuker.bluetooth.library.receiver.listener.BleConnectStatusChangeListener;
import com.inuker.bluetooth.library.receiver.listener.BluetoothBondListener;
import com.inuker.bluetooth.library.receiver.listener.BluetoothBondStateChangeListener;
import com.inuker.bluetooth.library.receiver.listener.BluetoothStateChangeListener;
import com.inuker.bluetooth.library.search.SearchRequest;
import com.inuker.bluetooth.library.search.SearchResult;
import com.inuker.bluetooth.library.search.response.SearchResponse;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.inuker.bluetooth.library.utils.ListUtils;
import com.inuker.bluetooth.library.utils.proxy.ProxyBulk;
import com.inuker.bluetooth.library.utils.proxy.ProxyInterceptor;
import com.inuker.bluetooth.library.utils.proxy.ProxyUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;

public class BluetoothClientImpl implements IBluetoothClient, ProxyInterceptor, Handler.Callback {
    private static final int MSG_INVOKE_PROXY = 1;
    private static final int MSG_REG_RECEIVER = 2;
    private static final String TAG = "BluetoothClientImpl";
    private static IBluetoothClient sInstance;
    private List<BluetoothBondListener> mBluetoothBondListeners;
    /* access modifiers changed from: private */
    public IBluetoothService mBluetoothService;
    private List<BluetoothStateListener> mBluetoothStateListeners;
    private HashMap<String, List<BleConnectStatusListener>> mConnectStatusListeners;
    private final ServiceConnection mConnection = new ServiceConnection() {
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IBluetoothService unused = BluetoothClientImpl.this.mBluetoothService = IBluetoothService.Stub.asInterface(iBinder);
            BluetoothClientImpl.this.notifyBluetoothManagerReady();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            IBluetoothService unused = BluetoothClientImpl.this.mBluetoothService = null;
        }
    };
    private Context mContext;
    private CountDownLatch mCountDownLatch;
    private HashMap<String, HashMap<String, List<BleNotifyResponse>>> mNotifyResponses;
    private Handler mWorkerHandler;
    private HandlerThread mWorkerThread;

    private BluetoothClientImpl(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        BluetoothContext.set(applicationContext);
        HandlerThread handlerThread = new HandlerThread(TAG);
        this.mWorkerThread = handlerThread;
        handlerThread.start();
        this.mWorkerHandler = new Handler(this.mWorkerThread.getLooper(), this);
        this.mNotifyResponses = new HashMap<>();
        this.mConnectStatusListeners = new HashMap<>();
        this.mBluetoothStateListeners = new LinkedList();
        this.mBluetoothBondListeners = new LinkedList();
        this.mWorkerHandler.obtainMessage(2).sendToTarget();
    }

    private void bindServiceSync() {
        checkRuntime(true);
        this.mCountDownLatch = new CountDownLatch(1);
        Intent intent = new Intent();
        intent.setClass(this.mContext, BluetoothService.class);
        if (this.mContext.bindService(intent, this.mConnection, 1)) {
            BluetoothLog.m10338v(String.format("BluetoothService registered", new Object[0]));
            waitBluetoothManagerReady();
            return;
        }
        BluetoothLog.m10338v(String.format("BluetoothService not registered", new Object[0]));
        this.mBluetoothService = BluetoothServiceImpl.getInstance();
    }

    /* access modifiers changed from: private */
    public void checkRuntime(boolean z) {
        if (Looper.myLooper() != (z ? this.mWorkerHandler.getLooper() : Looper.getMainLooper())) {
            throw new RuntimeException();
        }
    }

    /* access modifiers changed from: private */
    public void clearNotifyListener(String str) {
        checkRuntime(true);
        this.mNotifyResponses.remove(str);
    }

    /* access modifiers changed from: private */
    public void dispatchBluetoothStateChanged(int i) {
        checkRuntime(true);
        if (i == 10 || i == 12) {
            for (BluetoothStateListener next : this.mBluetoothStateListeners) {
                Object[] objArr = new Object[1];
                objArr[0] = Boolean.valueOf(i == 12);
                next.invokeSync(objArr);
            }
        }
    }

    /* access modifiers changed from: private */
    public void dispatchBondStateChanged(String str, int i) {
        checkRuntime(true);
        for (BluetoothBondListener invokeSync : this.mBluetoothBondListeners) {
            invokeSync.invokeSync(str, Integer.valueOf(i));
        }
    }

    /* access modifiers changed from: private */
    public void dispatchCharacterNotify(String str, UUID uuid, UUID uuid2, byte[] bArr) {
        List<BleNotifyResponse> list;
        checkRuntime(true);
        HashMap hashMap = this.mNotifyResponses.get(str);
        if (hashMap != null && (list = (List) hashMap.get(generateCharacterKey(uuid, uuid2))) != null) {
            for (BleNotifyResponse onNotify : list) {
                onNotify.onNotify(uuid, uuid2, bArr);
            }
        }
    }

    /* access modifiers changed from: private */
    public void dispatchConnectionStatus(String str, int i) {
        checkRuntime(true);
        List<BleConnectStatusListener> list = this.mConnectStatusListeners.get(str);
        if (!ListUtils.isEmpty(list)) {
            for (BleConnectStatusListener invokeSync : list) {
                invokeSync.invokeSync(str, Integer.valueOf(i));
            }
        }
    }

    private String generateCharacterKey(UUID uuid, UUID uuid2) {
        return String.format("%s_%s", new Object[]{uuid, uuid2});
    }

    private IBluetoothService getBluetoothService() {
        if (this.mBluetoothService == null) {
            bindServiceSync();
        }
        return this.mBluetoothService;
    }

    public static IBluetoothClient getInstance(Context context) {
        if (sInstance == null) {
            synchronized (BluetoothClientImpl.class) {
                if (sInstance == null) {
                    BluetoothClientImpl bluetoothClientImpl = new BluetoothClientImpl(context);
                    sInstance = (IBluetoothClient) ProxyUtils.getProxy(bluetoothClientImpl, IBluetoothClient.class, bluetoothClientImpl);
                }
            }
        }
        return sInstance;
    }

    /* access modifiers changed from: private */
    public void notifyBluetoothManagerReady() {
        CountDownLatch countDownLatch = this.mCountDownLatch;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            this.mCountDownLatch = null;
        }
    }

    private void registerBluetoothReceiver() {
        checkRuntime(true);
        BluetoothReceiver.getInstance().register(new BluetoothStateChangeListener() {
            /* access modifiers changed from: protected */
            public void onBluetoothStateChanged(int i, int i2) {
                BluetoothClientImpl.this.checkRuntime(true);
                BluetoothClientImpl.this.dispatchBluetoothStateChanged(i2);
            }
        });
        BluetoothReceiver.getInstance().register(new BluetoothBondStateChangeListener() {
            /* access modifiers changed from: protected */
            public void onBondStateChanged(String str, int i) {
                BluetoothClientImpl.this.checkRuntime(true);
                BluetoothClientImpl.this.dispatchBondStateChanged(str, i);
            }
        });
        BluetoothReceiver.getInstance().register(new BleConnectStatusChangeListener() {
            /* access modifiers changed from: protected */
            public void onConnectStatusChanged(String str, int i) {
                BluetoothClientImpl.this.checkRuntime(true);
                if (i == 32) {
                    BluetoothClientImpl.this.clearNotifyListener(str);
                }
                BluetoothClientImpl.this.dispatchConnectionStatus(str, i);
            }
        });
        BluetoothReceiver.getInstance().register(new BleCharacterChangeListener() {
            public void onCharacterChanged(String str, UUID uuid, UUID uuid2, byte[] bArr) {
                BluetoothClientImpl.this.checkRuntime(true);
                BluetoothClientImpl.this.dispatchCharacterNotify(str, uuid, uuid2, bArr);
            }
        });
    }

    /* access modifiers changed from: private */
    public void removeNotifyListener(String str, UUID uuid, UUID uuid2) {
        checkRuntime(true);
        HashMap hashMap = this.mNotifyResponses.get(str);
        if (hashMap != null) {
            hashMap.remove(generateCharacterKey(uuid, uuid2));
        }
    }

    private void safeCallBluetoothApi(int i, Bundle bundle, BluetoothResponse bluetoothResponse) {
        checkRuntime(true);
        try {
            IBluetoothService bluetoothService = getBluetoothService();
            if (bluetoothService != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bluetoothService.callBluetoothApi(i, bundle, bluetoothResponse);
                return;
            }
            bluetoothResponse.onResponse(-6, (Bundle) null);
        } catch (Throwable th) {
            BluetoothLog.m10336e(th);
        }
    }

    /* access modifiers changed from: private */
    public void saveNotifyListener(String str, UUID uuid, UUID uuid2, BleNotifyResponse bleNotifyResponse) {
        checkRuntime(true);
        HashMap hashMap = this.mNotifyResponses.get(str);
        if (hashMap == null) {
            hashMap = new HashMap();
            this.mNotifyResponses.put(str, hashMap);
        }
        String generateCharacterKey = generateCharacterKey(uuid, uuid2);
        List list = (List) hashMap.get(generateCharacterKey);
        if (list == null) {
            list = new ArrayList();
            hashMap.put(generateCharacterKey, list);
        }
        list.add(bleNotifyResponse);
    }

    private void waitBluetoothManagerReady() {
        try {
            this.mCountDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clearRequest(String str, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("extra.mac", str);
        bundle.putInt(Constants.EXTRA_TYPE, i);
        safeCallBluetoothApi(20, bundle, (BluetoothResponse) null);
    }

    public void connect(String str, BleConnectOptions bleConnectOptions, final BleConnectResponse bleConnectResponse) {
        Bundle bundle = new Bundle();
        bundle.putString("extra.mac", str);
        bundle.putParcelable(Constants.EXTRA_OPTIONS, bleConnectOptions);
        safeCallBluetoothApi(1, bundle, new BluetoothResponse() {
            /* access modifiers changed from: protected */
            public void onAsyncResponse(int i, Bundle bundle) {
                BluetoothClientImpl.this.checkRuntime(true);
                if (bleConnectResponse != null) {
                    bundle.setClassLoader(C33412.class.getClassLoader());
                    bleConnectResponse.onResponse(i, bundle);
                }
            }
        });
    }

    public void disconnect(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("extra.mac", str);
        safeCallBluetoothApi(2, bundle, (BluetoothResponse) null);
        clearNotifyListener(str);
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ProxyBulk.safeInvoke(message.obj);
        } else if (i == 2) {
            registerBluetoothReceiver();
        }
        return true;
    }

    public void indicate(String str, UUID uuid, UUID uuid2, BleNotifyResponse bleNotifyResponse) {
        Bundle bundle = new Bundle();
        bundle.putString("extra.mac", str);
        bundle.putSerializable("extra.service.uuid", uuid);
        bundle.putSerializable("extra.character.uuid", uuid2);
        final BleNotifyResponse bleNotifyResponse2 = bleNotifyResponse;
        final String str2 = str;
        final UUID uuid3 = uuid;
        final UUID uuid4 = uuid2;
        safeCallBluetoothApi(10, bundle, new BluetoothResponse() {
            /* access modifiers changed from: protected */
            public void onAsyncResponse(int i, Bundle bundle) {
                BluetoothClientImpl.this.checkRuntime(true);
                BleNotifyResponse bleNotifyResponse = bleNotifyResponse2;
                if (bleNotifyResponse != null) {
                    if (i == 0) {
                        BluetoothClientImpl.this.saveNotifyListener(str2, uuid3, uuid4, bleNotifyResponse);
                    }
                    bleNotifyResponse2.onResponse(i);
                }
            }
        });
    }

    public void notify(String str, UUID uuid, UUID uuid2, BleNotifyResponse bleNotifyResponse) {
        Bundle bundle = new Bundle();
        bundle.putString("extra.mac", str);
        bundle.putSerializable("extra.service.uuid", uuid);
        bundle.putSerializable("extra.character.uuid", uuid2);
        final BleNotifyResponse bleNotifyResponse2 = bleNotifyResponse;
        final String str2 = str;
        final UUID uuid3 = uuid;
        final UUID uuid4 = uuid2;
        safeCallBluetoothApi(6, bundle, new BluetoothResponse() {
            /* access modifiers changed from: protected */
            public void onAsyncResponse(int i, Bundle bundle) {
                BluetoothClientImpl.this.checkRuntime(true);
                BleNotifyResponse bleNotifyResponse = bleNotifyResponse2;
                if (bleNotifyResponse != null) {
                    if (i == 0) {
                        BluetoothClientImpl.this.saveNotifyListener(str2, uuid3, uuid4, bleNotifyResponse);
                    }
                    bleNotifyResponse2.onResponse(i);
                }
            }
        });
    }

    public boolean onIntercept(Object obj, Method method, Object[] objArr) {
        this.mWorkerHandler.obtainMessage(1, new ProxyBulk(obj, method, objArr)).sendToTarget();
        return true;
    }

    public void read(String str, UUID uuid, UUID uuid2, final BleReadResponse bleReadResponse) {
        Bundle bundle = new Bundle();
        bundle.putString("extra.mac", str);
        bundle.putSerializable("extra.service.uuid", uuid);
        bundle.putSerializable("extra.character.uuid", uuid2);
        safeCallBluetoothApi(3, bundle, new BluetoothResponse() {
            /* access modifiers changed from: protected */
            public void onAsyncResponse(int i, Bundle bundle) {
                BluetoothClientImpl.this.checkRuntime(true);
                BleReadResponse bleReadResponse = bleReadResponse;
                if (bleReadResponse != null) {
                    bleReadResponse.onResponse(i, bundle.getByteArray("extra.byte.value"));
                }
            }
        });
    }

    public void readDescriptor(String str, UUID uuid, UUID uuid2, UUID uuid3, final BleReadResponse bleReadResponse) {
        Bundle bundle = new Bundle();
        bundle.putString("extra.mac", str);
        bundle.putSerializable("extra.service.uuid", uuid);
        bundle.putSerializable("extra.character.uuid", uuid2);
        bundle.putSerializable(Constants.EXTRA_DESCRIPTOR_UUID, uuid3);
        safeCallBluetoothApi(13, bundle, new BluetoothResponse() {
            /* access modifiers changed from: protected */
            public void onAsyncResponse(int i, Bundle bundle) {
                BluetoothClientImpl.this.checkRuntime(true);
                BleReadResponse bleReadResponse = bleReadResponse;
                if (bleReadResponse != null) {
                    bleReadResponse.onResponse(i, bundle.getByteArray("extra.byte.value"));
                }
            }
        });
    }

    public void readRssi(String str, final BleReadRssiResponse bleReadRssiResponse) {
        Bundle bundle = new Bundle();
        bundle.putString("extra.mac", str);
        safeCallBluetoothApi(8, bundle, new BluetoothResponse() {
            /* access modifiers changed from: protected */
            public void onAsyncResponse(int i, Bundle bundle) {
                BluetoothClientImpl.this.checkRuntime(true);
                BleReadRssiResponse bleReadRssiResponse = bleReadRssiResponse;
                if (bleReadRssiResponse != null) {
                    bleReadRssiResponse.onResponse(i, Integer.valueOf(bundle.getInt(Constants.EXTRA_RSSI, 0)));
                }
            }
        });
    }

    public void registerBluetoothBondListener(BluetoothBondListener bluetoothBondListener) {
        checkRuntime(true);
        if (bluetoothBondListener != null && !this.mBluetoothBondListeners.contains(bluetoothBondListener)) {
            this.mBluetoothBondListeners.add(bluetoothBondListener);
        }
    }

    public void registerBluetoothStateListener(BluetoothStateListener bluetoothStateListener) {
        checkRuntime(true);
        if (bluetoothStateListener != null && !this.mBluetoothStateListeners.contains(bluetoothStateListener)) {
            this.mBluetoothStateListeners.add(bluetoothStateListener);
        }
    }

    public void registerConnectStatusListener(String str, BleConnectStatusListener bleConnectStatusListener) {
        checkRuntime(true);
        List list = this.mConnectStatusListeners.get(str);
        if (list == null) {
            list = new ArrayList();
            this.mConnectStatusListeners.put(str, list);
        }
        if (bleConnectStatusListener != null && !list.contains(bleConnectStatusListener)) {
            list.add(bleConnectStatusListener);
        }
    }

    public void search(SearchRequest searchRequest, final SearchResponse searchResponse) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(Constants.EXTRA_REQUEST, searchRequest);
        safeCallBluetoothApi(11, bundle, new BluetoothResponse() {
            /* access modifiers changed from: protected */
            public void onAsyncResponse(int i, Bundle bundle) {
                BluetoothClientImpl.this.checkRuntime(true);
                if (searchResponse != null) {
                    bundle.setClassLoader(C333613.class.getClassLoader());
                    if (i == 1) {
                        searchResponse.onSearchStarted();
                    } else if (i == 2) {
                        searchResponse.onSearchStopped();
                    } else if (i == 3) {
                        searchResponse.onSearchCanceled();
                    } else if (i == 4) {
                        searchResponse.onDeviceFounded((SearchResult) bundle.getParcelable(Constants.EXTRA_SEARCH_RESULT));
                    } else {
                        throw new IllegalStateException("unknown code");
                    }
                }
            }
        });
    }

    public void stopSearch() {
        safeCallBluetoothApi(12, (Bundle) null, (BluetoothResponse) null);
    }

    public void unindicate(String str, UUID uuid, UUID uuid2, BleUnnotifyResponse bleUnnotifyResponse) {
        unnotify(str, uuid, uuid2, bleUnnotifyResponse);
    }

    public void unnotify(String str, UUID uuid, UUID uuid2, BleUnnotifyResponse bleUnnotifyResponse) {
        Bundle bundle = new Bundle();
        bundle.putString("extra.mac", str);
        bundle.putSerializable("extra.service.uuid", uuid);
        bundle.putSerializable("extra.character.uuid", uuid2);
        final BleUnnotifyResponse bleUnnotifyResponse2 = bleUnnotifyResponse;
        final String str2 = str;
        final UUID uuid3 = uuid;
        final UUID uuid4 = uuid2;
        safeCallBluetoothApi(7, bundle, new BluetoothResponse() {
            /* access modifiers changed from: protected */
            public void onAsyncResponse(int i, Bundle bundle) {
                BluetoothClientImpl.this.checkRuntime(true);
                BleUnnotifyResponse bleUnnotifyResponse = bleUnnotifyResponse2;
                if (bleUnnotifyResponse != null) {
                    bleUnnotifyResponse.onResponse(i);
                }
                if (i == 0) {
                    BluetoothClientImpl.this.removeNotifyListener(str2, uuid3, uuid4);
                }
            }
        });
    }

    public void unregisterBluetoothBondListener(BluetoothBondListener bluetoothBondListener) {
        checkRuntime(true);
        if (bluetoothBondListener != null) {
            this.mBluetoothBondListeners.remove(bluetoothBondListener);
        }
    }

    public void unregisterBluetoothStateListener(BluetoothStateListener bluetoothStateListener) {
        checkRuntime(true);
        if (bluetoothStateListener != null) {
            this.mBluetoothStateListeners.remove(bluetoothStateListener);
        }
    }

    public void unregisterConnectStatusListener(String str, BleConnectStatusListener bleConnectStatusListener) {
        checkRuntime(true);
        List list = this.mConnectStatusListeners.get(str);
        if (bleConnectStatusListener != null && !ListUtils.isEmpty(list)) {
            list.remove(bleConnectStatusListener);
        }
    }

    public void write(String str, UUID uuid, UUID uuid2, byte[] bArr, final BleWriteResponse bleWriteResponse) {
        Bundle bundle = new Bundle();
        bundle.putString("extra.mac", str);
        bundle.putSerializable("extra.service.uuid", uuid);
        bundle.putSerializable("extra.character.uuid", uuid2);
        bundle.putByteArray("extra.byte.value", bArr);
        safeCallBluetoothApi(4, bundle, new BluetoothResponse() {
            /* access modifiers changed from: protected */
            public void onAsyncResponse(int i, Bundle bundle) {
                BluetoothClientImpl.this.checkRuntime(true);
                BleWriteResponse bleWriteResponse = bleWriteResponse;
                if (bleWriteResponse != null) {
                    bleWriteResponse.onResponse(i);
                }
            }
        });
    }

    public void writeDescriptor(String str, UUID uuid, UUID uuid2, UUID uuid3, byte[] bArr, final BleWriteResponse bleWriteResponse) {
        Bundle bundle = new Bundle();
        bundle.putString("extra.mac", str);
        bundle.putSerializable("extra.service.uuid", uuid);
        bundle.putSerializable("extra.character.uuid", uuid2);
        bundle.putSerializable(Constants.EXTRA_DESCRIPTOR_UUID, uuid3);
        bundle.putByteArray("extra.byte.value", bArr);
        safeCallBluetoothApi(14, bundle, new BluetoothResponse() {
            /* access modifiers changed from: protected */
            public void onAsyncResponse(int i, Bundle bundle) {
                BluetoothClientImpl.this.checkRuntime(true);
                BleWriteResponse bleWriteResponse = bleWriteResponse;
                if (bleWriteResponse != null) {
                    bleWriteResponse.onResponse(i);
                }
            }
        });
    }

    public void writeNoRsp(String str, UUID uuid, UUID uuid2, byte[] bArr, final BleWriteResponse bleWriteResponse) {
        Bundle bundle = new Bundle();
        bundle.putString("extra.mac", str);
        bundle.putSerializable("extra.service.uuid", uuid);
        bundle.putSerializable("extra.character.uuid", uuid2);
        bundle.putByteArray("extra.byte.value", bArr);
        safeCallBluetoothApi(5, bundle, new BluetoothResponse() {
            /* access modifiers changed from: protected */
            public void onAsyncResponse(int i, Bundle bundle) {
                BluetoothClientImpl.this.checkRuntime(true);
                BleWriteResponse bleWriteResponse = bleWriteResponse;
                if (bleWriteResponse != null) {
                    bleWriteResponse.onResponse(i);
                }
            }
        });
    }

    public void writeNoRspFast(String str, UUID uuid, UUID uuid2, byte[] bArr, final BleWriteResponse bleWriteResponse) {
        Bundle bundle = new Bundle();
        bundle.putString("extra.mac", str);
        bundle.putSerializable("extra.service.uuid", uuid);
        bundle.putSerializable("extra.character.uuid", uuid2);
        bundle.putByteArray("extra.byte.value", bArr);
        safeCallBluetoothApi(21, bundle, new BluetoothResponse() {
            /* access modifiers changed from: protected */
            public void onAsyncResponse(int i, Bundle bundle) {
                BluetoothClientImpl.this.checkRuntime(true);
                BleWriteResponse bleWriteResponse = bleWriteResponse;
                if (bleWriteResponse != null) {
                    bleWriteResponse.onResponse(i);
                }
            }
        });
    }
}
