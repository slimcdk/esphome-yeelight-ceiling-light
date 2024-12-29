package com.miot.service.connection.bluetooth;

import android.net.wifi.ScanResult;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import com.inuker.bluetooth.library.Code;
import com.inuker.bluetooth.library.search.SearchRequest;
import com.inuker.bluetooth.library.search.SearchResult;
import com.inuker.bluetooth.library.search.response.SearchResponse;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.inuker.bluetooth.library.utils.Task;
import com.miot.bluetooth.MiotBleClient;
import com.miot.service.manager.discovery.impl.DeviceFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class ComboDeviceManager {
    private static ConcurrentHashMap<String, String> mAddressMap;
    private static List<SearchResult> mComboDevices = new ArrayList();
    private static HashMap<String, Future<String>> mFutureMap = new HashMap<>();

    private static boolean checkFuture(Future<String> future) {
        BluetoothLog.m7332v(String.format("checkFuture %s", new Object[]{future}));
        if (future != null) {
            BluetoothLog.m7332v(String.format(">>> isCanceled = %b", new Object[]{Boolean.valueOf(future.isCancelled())}));
            BluetoothLog.m7332v(String.format(">>> isDone = %b", new Object[]{Boolean.valueOf(future.isDone())}));
        }
        if (future != null && !future.isCancelled()) {
            try {
                if (!future.isDone()) {
                    return true;
                }
                BluetoothLog.m7332v(String.format(">>> result = %s", new Object[]{future.get()}));
                if (!TextUtils.isEmpty(future.get())) {
                    return true;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    private static void findComboMac(final String str, final IFindComboResponse iFindComboResponse) {
        BluetoothLog.m7333w(String.format("BluetoothApi.findComboMac subMac = %s", new Object[]{str}));
        if (str != null && str.length() == 4) {
            String address = ComboCollector.getAddress(str);
            final Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(address)) {
                BluetoothLog.m7333w("findComboMac by BluetoothDeviceSearch");
                bundle.putString("extra.mac", address);
                try {
                    iFindComboResponse.onResponse(0, bundle);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                MiotBleClient.getInstance().search(new SearchRequest.Builder().searchBluetoothLeDevice(6000, 10).build(), new SearchResponse() {
                    public void onDeviceFounded(SearchResult searchResult) {
                        if (!TextUtils.isEmpty(BluetoothBeaconRecognizer.getInstance().recognize(searchResult)) && !TextUtils.isEmpty(ComboCollector.getAddress(str))) {
                            MiotBleClient.getInstance().stopSearch();
                            bundle.putString("extra.mac", searchResult.getAddress());
                            try {
                                iFindComboResponse.onResponse(0, bundle);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }

                    public void onSearchCanceled() {
                        if (!bundle.containsKey("extra.mac")) {
                            try {
                                iFindComboResponse.onResponse(-1, bundle);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }

                    public void onSearchStarted() {
                    }

                    public void onSearchStopped() {
                        if (!bundle.containsKey("extra.mac")) {
                            try {
                                iFindComboResponse.onResponse(-1, bundle);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                });
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r4 = r4.split("\\:");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isComboDevice(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0032
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0032
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0032
            java.lang.String r0 = "\\:"
            java.lang.String[] r4 = r4.split(r0)
            if (r4 == 0) goto L_0x0032
            int r0 = r4.length
            r1 = 6
            if (r0 != r1) goto L_0x0032
            r0 = 4
            r0 = r4[r0]
            boolean r2 = r2.equalsIgnoreCase(r0)
            if (r2 == 0) goto L_0x0032
            r2 = 5
            r2 = r4[r2]
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x0032
            r2 = 1
            return r2
        L_0x0032:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.service.connection.bluetooth.ComboDeviceManager.isComboDevice(java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    public static Future<String> searchComboDeviceAsync(final ScanResult scanResult) {
        Future<String> future = mFutureMap.get(scanResult.BSSID);
        if (checkFuture(future)) {
            return future;
        }
        FutureTask futureTask = new FutureTask(new Callable<String>() {
            public String call() {
                return ComboDeviceManager.searchComboDeviceSync(scanResult);
            }
        });
        mFutureMap.put(scanResult.BSSID, futureTask);
        Task.executeDelayed(futureTask, AsyncTask.THREAD_POOL_EXECUTOR, 500);
        return futureTask;
    }

    /* access modifiers changed from: private */
    public static String searchComboDeviceSync(ScanResult scanResult) {
        String deviceUid = DeviceFactory.getDeviceUid(scanResult);
        BluetoothLog.m7333w("kuailian device uid is " + deviceUid);
        final Bundle bundle = new Bundle();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        findComboMac(deviceUid, new IFindComboResponse() {
            public void onResponse(int i, Bundle bundle) {
                String str = "";
                if (bundle != null) {
                    str = bundle.getString("extra.mac", str);
                }
                BluetoothLog.m7332v(String.format("ComboDeviceManager.searchComboDeviceSync onResponse %s, mac = (%s)", new Object[]{Code.toString(i), str}));
                if (i == 0 && bundle != null) {
                    bundle.putAll(bundle);
                }
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return bundle.getString("extra.mac", "");
    }
}
