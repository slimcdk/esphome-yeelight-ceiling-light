package com.miot.service.connection.wifi;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiNetworkSpecifier;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.miot.service.C3602R;
import com.miot.service.log.MyLogger;
import java.lang.reflect.Field;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

public class ConnectionUtils {
    public static final int SECURITY_EAP = 3;
    public static final int SECURITY_NONE = 0;
    public static final int SECURITY_PSK = 2;
    public static final int SECURITY_WAPI = 4;
    public static final int SECURITY_WEP = 1;
    private static final String TAG = "ConnectionUtils";

    public static class KuailianScanResult {
        public boolean isSavePasswd;
        public boolean isXiaomiRouter;
        public ScanResult scanResult;
        public String wifiDes;
    }

    enum PskType {
        UNKNOWN,
        WPA,
        WPA2,
        WPA_WPA2
    }

    enum TKIPType {
        TKIP_CCMP,
        TKIP,
        CCMP,
        NONE
    }

    public static int calculateSignalLevel(int i, int i2) {
        if (i <= -100) {
            return 0;
        }
        if (i >= -55) {
            return 100;
        }
        return (int) ((((float) (i - -100)) * ((float) 100)) / ((float) 45));
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x010e A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void connectToAP(android.content.Context r13, android.net.ConnectivityManager r14, android.net.wifi.WifiManager r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, com.miot.service.connection.wifi.QConnectCallback r20, boolean r21, boolean r22) {
        /*
            r7 = r15
            r8 = r16
            r0 = r18
            r1 = r19
            com.miot.service.log.MyLogger r2 = com.miot.service.log.MyLogger.getInstance()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "connectToAP "
            r3.append(r4)
            r3.append(r8)
            java.lang.String r4 = " bssid:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = " security:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "ConnectionUtils"
            r2.log(r4, r3)
            r9 = 0
            boolean r2 = isUseQWifiConnectInterface(r13)     // Catch:{ SecurityException -> 0x0108 }
            if (r2 == 0) goto L_0x004e
            boolean r2 = android.provider.Settings.canDrawOverlays(r13)     // Catch:{ SecurityException -> 0x0108 }
            if (r2 != 0) goto L_0x004e
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r20
            r5 = r21
            r6 = r22
            connectToAPAfterQ(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ SecurityException -> 0x0108 }
            return
        L_0x004e:
            boolean r2 = r15.isWifiEnabled()     // Catch:{ SecurityException -> 0x0108 }
            if (r2 != 0) goto L_0x0055
            return
        L_0x0055:
            java.util.List r2 = r15.getConfiguredNetworks()     // Catch:{ SecurityException -> 0x0108 }
            r3 = 0
            boolean r5 = com.inuker.bluetooth.library.utils.ListUtils.isEmpty(r2)     // Catch:{ SecurityException -> 0x0108 }
            if (r5 != 0) goto L_0x008b
            java.util.Iterator r2 = r2.iterator()     // Catch:{ SecurityException -> 0x0108 }
        L_0x0064:
            boolean r5 = r2.hasNext()     // Catch:{ SecurityException -> 0x0108 }
            if (r5 == 0) goto L_0x008b
            java.lang.Object r5 = r2.next()     // Catch:{ SecurityException -> 0x0108 }
            android.net.wifi.WifiConfiguration r5 = (android.net.wifi.WifiConfiguration) r5     // Catch:{ SecurityException -> 0x0108 }
            java.lang.String r6 = r5.SSID     // Catch:{ SecurityException -> 0x0108 }
            if (r6 == 0) goto L_0x0064
            java.lang.String r6 = r5.SSID     // Catch:{ SecurityException -> 0x0108 }
            java.lang.String r10 = convertToQuotedString(r16)     // Catch:{ SecurityException -> 0x0108 }
            boolean r6 = r6.equals(r10)     // Catch:{ SecurityException -> 0x0108 }
            if (r6 == 0) goto L_0x0064
            int r6 = getAuthType(r5)     // Catch:{ SecurityException -> 0x0108 }
            int r10 = getSecurity((java.lang.String) r19)     // Catch:{ SecurityException -> 0x0108 }
            if (r6 != r10) goto L_0x0064
            r3 = r5
        L_0x008b:
            java.util.List r2 = r15.getScanResults()     // Catch:{ SecurityException -> 0x0108 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ SecurityException -> 0x0108 }
        L_0x0093:
            boolean r5 = r2.hasNext()     // Catch:{ SecurityException -> 0x0108 }
            r6 = 1
            if (r5 == 0) goto L_0x00aa
            java.lang.Object r5 = r2.next()     // Catch:{ SecurityException -> 0x0108 }
            android.net.wifi.ScanResult r5 = (android.net.wifi.ScanResult) r5     // Catch:{ SecurityException -> 0x0108 }
            java.lang.String r5 = r5.SSID     // Catch:{ SecurityException -> 0x0108 }
            boolean r5 = r5.equalsIgnoreCase(r8)     // Catch:{ SecurityException -> 0x0108 }
            if (r5 == 0) goto L_0x0093
            r2 = 1
            goto L_0x00ab
        L_0x00aa:
            r2 = 0
        L_0x00ab:
            com.miot.service.log.MyLogger r5 = com.miot.service.log.MyLogger.getInstance()     // Catch:{ SecurityException -> 0x0108 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x0108 }
            r10.<init>()     // Catch:{ SecurityException -> 0x0108 }
            java.lang.String r11 = "isContain "
            r10.append(r11)     // Catch:{ SecurityException -> 0x0108 }
            r10.append(r8)     // Catch:{ SecurityException -> 0x0108 }
            java.lang.String r11 = " - "
            r10.append(r11)     // Catch:{ SecurityException -> 0x0108 }
            r10.append(r2)     // Catch:{ SecurityException -> 0x0108 }
            java.lang.String r2 = r10.toString()     // Catch:{ SecurityException -> 0x0108 }
            r5.log(r4, r2)     // Catch:{ SecurityException -> 0x0108 }
            if (r3 == 0) goto L_0x00e5
            boolean r0 = r15.disconnect()     // Catch:{ SecurityException -> 0x0108 }
            int r1 = r3.networkId     // Catch:{ SecurityException -> 0x00e2 }
            boolean r1 = r15.enableNetwork(r1, r6)     // Catch:{ SecurityException -> 0x00e2 }
            boolean r2 = r15.reconnect()     // Catch:{ SecurityException -> 0x00df }
            r3 = r17
            r9 = r2
            goto L_0x010c
        L_0x00df:
            r3 = r17
            goto L_0x010c
        L_0x00e2:
            r3 = r17
            goto L_0x010b
        L_0x00e5:
            android.net.wifi.WifiConfiguration r2 = new android.net.wifi.WifiConfiguration     // Catch:{ SecurityException -> 0x0108 }
            r2.<init>()     // Catch:{ SecurityException -> 0x0108 }
            r3 = r17
            setWifiConfig(r2, r8, r3, r1)     // Catch:{ SecurityException -> 0x010a }
            r2.BSSID = r0     // Catch:{ SecurityException -> 0x010a }
            int r0 = r15.addNetwork(r2)     // Catch:{ SecurityException -> 0x010a }
            boolean r1 = r15.disconnect()     // Catch:{ SecurityException -> 0x010a }
            boolean r0 = r15.enableNetwork(r0, r6)     // Catch:{ SecurityException -> 0x0106 }
            boolean r2 = r15.reconnect()     // Catch:{ SecurityException -> 0x0102 }
            r9 = r2
        L_0x0102:
            r12 = r1
            r1 = r0
            r0 = r12
            goto L_0x010c
        L_0x0106:
            r0 = r1
            goto L_0x010b
        L_0x0108:
            r3 = r17
        L_0x010a:
            r0 = 0
        L_0x010b:
            r1 = 0
        L_0x010c:
            if (r0 == 0) goto L_0x0112
            if (r1 == 0) goto L_0x0112
            if (r9 != 0) goto L_0x0127
        L_0x0112:
            boolean r0 = isUseQWifiConnectInterface(r13)
            if (r0 == 0) goto L_0x0127
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r20
            r5 = r21
            r6 = r22
            connectToAPAfterQ(r0, r1, r2, r3, r4, r5, r6)
        L_0x0127:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.service.connection.wifi.ConnectionUtils.connectToAP(android.content.Context, android.net.ConnectivityManager, android.net.wifi.WifiManager, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.miot.service.connection.wifi.QConnectCallback, boolean, boolean):void");
    }

    @RequiresApi(api = 29)
    private static void connectToAPAfterQ(final ConnectivityManager connectivityManager, WifiManager wifiManager, String str, String str2, final QConnectCallback qConnectCallback, boolean z, boolean z2) {
        WifiNetworkSpecifier.Builder builder;
        WifiNetworkSpecifier.Builder builder2;
        if (z && qConnectCallback != null) {
            if (z2) {
                builder2 = builder.setSsid(str).setWpa2Passphrase(str2);
            } else {
                builder = new WifiNetworkSpecifier.Builder();
                builder2 = builder.setSsid(str);
            }
            NetworkRequest build = new NetworkRequest.Builder().addTransportType(1).removeCapability(12).setNetworkSpecifier(builder2.build()).build();
            qConnectCallback.callback = new ConnectivityManager.NetworkCallback() {
                public void onAvailable(@NonNull Network network) {
                    super.onAvailable(network);
                    connectivityManager.bindProcessToNetwork(network);
                    QConnectCallback qConnectCallback = qConnectCallback;
                    if (qConnectCallback != null) {
                        qConnectCallback.onAvailable(network);
                    }
                }

                public void onLost(@NonNull Network network) {
                    super.onLost(network);
                    connectivityManager.unregisterNetworkCallback(this);
                    QConnectCallback qConnectCallback = qConnectCallback;
                    if (qConnectCallback != null) {
                        qConnectCallback.callback = null;
                        qConnectCallback.onLost(network);
                    }
                }

                public void onUnavailable() {
                    super.onUnavailable();
                    connectivityManager.unregisterNetworkCallback(this);
                    QConnectCallback qConnectCallback = qConnectCallback;
                    if (qConnectCallback != null) {
                        qConnectCallback.callback = null;
                        qConnectCallback.onUnavailable();
                    }
                }
            };
            MyLogger instance = MyLogger.getInstance();
            instance.log(TAG, "requestNetwork start: " + str);
            connectivityManager.requestNetwork(build, qConnectCallback.callback);
        }
    }

    public static String convertToQuotedString(String str) {
        return "\"" + str + "\"";
    }

    public static String convertToSSID(String str) {
        return str.startsWith("\"") ? str.substring(1, str.length() - 1) : str;
    }

    public static void disconnectAp(ConnectivityManager connectivityManager, WifiManager wifiManager, String str, QConnectCallback qConnectCallback) {
        ConnectivityManager.NetworkCallback networkCallback;
        WifiConfiguration wifiConfiguration;
        MyLogger.getInstance().log(TAG, "disconnectAp " + str);
        try {
            List<WifiConfiguration> configuredNetworks = wifiManager.getConfiguredNetworks();
            if (configuredNetworks != null) {
                Iterator<WifiConfiguration> it = configuredNetworks.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        wifiConfiguration = null;
                        break;
                    }
                    wifiConfiguration = it.next();
                    if (wifiConfiguration.SSID != null && wifiConfiguration.SSID.equals(convertToQuotedString(str))) {
                        break;
                    }
                }
                if (wifiConfiguration != null) {
                    wifiManager.disableNetwork(wifiConfiguration.networkId);
                    wifiManager.disconnect();
                    wifiManager.removeNetwork(wifiConfiguration.networkId);
                }
                if (qConnectCallback != null && (networkCallback = qConnectCallback.callback) != null) {
                    connectivityManager.unregisterNetworkCallback(networkCallback);
                    qConnectCallback.callback = null;
                }
            }
        } catch (SecurityException unused) {
        }
    }

    public static int getAuthType(WifiConfiguration wifiConfiguration) {
        return wifiConfiguration.allowedKeyManagement.get(1) ? 2 : 0;
    }

    public static PskType getPskType(ScanResult scanResult) {
        boolean contains = scanResult.capabilities.contains("WPA-PSK");
        boolean contains2 = scanResult.capabilities.contains("WPA2-PSK");
        return (!contains2 || !contains) ? contains2 ? PskType.WPA2 : contains ? PskType.WPA : PskType.UNKNOWN : PskType.WPA_WPA2;
    }

    public static int getSecurity(ScanResult scanResult) {
        if (scanResult.capabilities.contains("WEP")) {
            return 1;
        }
        if (scanResult.capabilities.contains("PSK")) {
            return 2;
        }
        if (scanResult.capabilities.contains("EAP")) {
            return 3;
        }
        return scanResult.capabilities.contains("WAPI") ? 4 : 0;
    }

    public static int getSecurity(String str) {
        if (str.contains("WEP")) {
            return 1;
        }
        if (str.contains("PSK")) {
            return 2;
        }
        if (str.contains("EAP")) {
            return 3;
        }
        return str.contains("WAPI") ? 4 : 0;
    }

    public static String getSecurityString(Context context, ScanResult scanResult) {
        StringBuilder sb;
        String format;
        StringBuilder sb2;
        String format2;
        int security = getSecurity(scanResult);
        if (security == 0) {
            sb = new StringBuilder();
            sb.append("");
            format = context.getString(C3602R.string.kuailian_no_passwd);
        } else if (security == 2) {
            PskType pskType = getPskType(scanResult);
            if (pskType == PskType.WPA) {
                sb2 = new StringBuilder();
                sb2.append("");
                format2 = String.format(context.getString(C3602R.string.kuailian_wifi_security_type), new Object[]{"WPA"});
            } else if (pskType == PskType.WPA2) {
                sb2 = new StringBuilder();
                sb2.append("");
                format2 = String.format(context.getString(C3602R.string.kuailian_wifi_security_type), new Object[]{"WPA2"});
            } else if (pskType != PskType.WPA_WPA2) {
                return "";
            } else {
                sb2 = new StringBuilder();
                sb2.append("");
                format2 = String.format(context.getString(C3602R.string.kuailian_wifi_security_type), new Object[]{"WPA_WPA2"});
            }
            sb2.append(format2);
            return sb2.toString();
        } else if (security == 1) {
            sb = new StringBuilder();
            sb.append("");
            format = String.format(context.getString(C3602R.string.kuailian_wifi_security_type), new Object[]{"WEP"});
        } else if (security == 3) {
            sb = new StringBuilder();
            sb.append("");
            format = String.format(context.getString(C3602R.string.kuailian_wifi_security_type), new Object[]{"802.1X"});
        } else if (security != 4) {
            return "";
        } else {
            sb = new StringBuilder();
            sb.append("");
            format = String.format(context.getString(C3602R.string.kuailian_wifi_security_type), new Object[]{"WAPI"});
        }
        sb.append(format);
        return sb.toString();
    }

    public static int getSignalLevel(int i) {
        return i > 80 ? C3602R.C3603drawable.wifi_strength_4 : i > 60 ? C3602R.C3603drawable.wifi_strength_3 : i > 40 ? C3602R.C3603drawable.wifi_strength_2 : i > 20 ? C3602R.C3603drawable.wifi_strength_1 : C3602R.C3603drawable.wifi_strength_0;
    }

    public static TKIPType getTKIPType(ScanResult scanResult) {
        boolean contains = scanResult.capabilities.contains("TKIP");
        boolean contains2 = scanResult.capabilities.contains("CCMP");
        return (!contains || !contains2) ? contains ? TKIPType.TKIP : contains2 ? TKIPType.CCMP : TKIPType.NONE : TKIPType.TKIP_CCMP;
    }

    public static TKIPType getTKIPType(String str) {
        boolean contains = str.contains("TKIP");
        boolean contains2 = str.contains("CCMP");
        return (!contains || !contains2) ? contains ? TKIPType.TKIP : contains2 ? TKIPType.CCMP : TKIPType.NONE : TKIPType.TKIP_CCMP;
    }

    public static boolean isContainUnsupportChar(String str) {
        byte[] bytes = str.getBytes();
        for (byte b : bytes) {
            if ((b & 128) != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isEqualWifi(String str, String str2) {
        if (str.startsWith("\"")) {
            str = str.substring(1, str.length() - 1);
        }
        if (str2.startsWith("\"")) {
            str2 = str2.substring(1, str2.length() - 1);
        }
        return str.equalsIgnoreCase(str2);
    }

    public static boolean isMiwifi(ScanResult scanResult) {
        try {
            Field declaredField = Class.forName(ScanResult.class.getName()).getDeclaredField("isXiaomiRouter");
            if (declaredField != null) {
                return declaredField.getBoolean(scanResult);
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | SecurityException unused) {
            return false;
        }
    }

    public static boolean isTargetSDKVersionAfter29(Context context) {
        if (context == null || context.getApplicationInfo() == null || context.getApplicationInfo().targetSdkVersion < 29) {
            return false;
        }
        MyLogger instance = MyLogger.getInstance();
        instance.log(TAG, "targetSdkVersion " + context.getApplicationInfo().targetSdkVersion);
        return true;
    }

    public static boolean isUseQWifiConnectInterface(Context context) {
        return Build.VERSION.SDK_INT >= 29 && isTargetSDKVersionAfter29(context);
    }

    public static void setWifiConfig(WifiConfiguration wifiConfiguration, ScanResult scanResult, String str) {
        BitSet bitSet;
        int security = getSecurity(scanResult);
        wifiConfiguration.SSID = convertToQuotedString(scanResult.SSID);
        if (security != 0) {
            if (security == 1) {
                wifiConfiguration.hiddenSSID = true;
                String[] strArr = wifiConfiguration.wepKeys;
                strArr[0] = "\"" + str + "\"";
                wifiConfiguration.allowedAuthAlgorithms.set(1);
                wifiConfiguration.allowedGroupCiphers.set(3);
                wifiConfiguration.allowedGroupCiphers.set(2);
                wifiConfiguration.allowedGroupCiphers.set(0);
                wifiConfiguration.allowedGroupCiphers.set(1);
                wifiConfiguration.allowedKeyManagement.set(0);
                wifiConfiguration.wepTxKeyIndex = 0;
            } else if (security != 2) {
                return;
            }
            wifiConfiguration.preSharedKey = "\"" + str + "\"";
            wifiConfiguration.allowedKeyManagement.set(1);
            TKIPType tKIPType = getTKIPType(scanResult);
            if (tKIPType == TKIPType.TKIP_CCMP) {
                wifiConfiguration.allowedGroupCiphers.set(3);
                wifiConfiguration.allowedGroupCiphers.set(2);
                bitSet = wifiConfiguration.allowedPairwiseCiphers;
            } else if (tKIPType == TKIPType.TKIP) {
                bitSet = wifiConfiguration.allowedGroupCiphers;
            } else {
                if (tKIPType == TKIPType.CCMP) {
                    wifiConfiguration.allowedGroupCiphers.set(3);
                    wifiConfiguration.allowedPairwiseCiphers.set(2);
                }
                wifiConfiguration.status = 0;
                return;
            }
            bitSet.set(2);
            wifiConfiguration.allowedPairwiseCiphers.set(1);
            wifiConfiguration.status = 0;
            return;
        }
        wifiConfiguration.allowedKeyManagement.set(0);
    }

    public static void setWifiConfig(WifiConfiguration wifiConfiguration, String str, String str2, String str3) {
        BitSet bitSet;
        int security = getSecurity(str3);
        wifiConfiguration.allowedAuthAlgorithms.clear();
        wifiConfiguration.allowedGroupCiphers.clear();
        wifiConfiguration.allowedKeyManagement.clear();
        wifiConfiguration.allowedPairwiseCiphers.clear();
        wifiConfiguration.allowedProtocols.clear();
        wifiConfiguration.SSID = convertToQuotedString(str);
        if (security != 0) {
            if (security == 1) {
                wifiConfiguration.hiddenSSID = true;
                String[] strArr = wifiConfiguration.wepKeys;
                strArr[0] = "\"" + str2 + "\"";
                wifiConfiguration.allowedAuthAlgorithms.set(1);
                wifiConfiguration.allowedGroupCiphers.set(3);
                wifiConfiguration.allowedGroupCiphers.set(2);
                wifiConfiguration.allowedGroupCiphers.set(0);
                wifiConfiguration.allowedGroupCiphers.set(1);
                wifiConfiguration.allowedKeyManagement.set(0);
                wifiConfiguration.wepTxKeyIndex = 0;
            } else if (security != 2) {
                return;
            }
            wifiConfiguration.preSharedKey = "\"" + str2 + "\"";
            wifiConfiguration.allowedKeyManagement.set(1);
            TKIPType tKIPType = getTKIPType(str3);
            if (tKIPType == TKIPType.TKIP_CCMP) {
                wifiConfiguration.allowedGroupCiphers.set(3);
                wifiConfiguration.allowedGroupCiphers.set(2);
                bitSet = wifiConfiguration.allowedPairwiseCiphers;
            } else if (tKIPType == TKIPType.TKIP) {
                bitSet = wifiConfiguration.allowedGroupCiphers;
            } else {
                if (tKIPType == TKIPType.CCMP) {
                    wifiConfiguration.allowedGroupCiphers.set(3);
                    wifiConfiguration.allowedPairwiseCiphers.set(2);
                }
                wifiConfiguration.status = 0;
                return;
            }
            bitSet.set(2);
            wifiConfiguration.allowedPairwiseCiphers.set(1);
            wifiConfiguration.status = 0;
            return;
        }
        wifiConfiguration.allowedKeyManagement.set(0);
    }
}
