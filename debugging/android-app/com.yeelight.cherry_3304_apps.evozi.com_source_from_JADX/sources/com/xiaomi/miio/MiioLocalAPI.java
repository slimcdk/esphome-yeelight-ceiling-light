package com.xiaomi.miio;

import com.miot.service.connection.wifi.step.SmartConfigStep;
import com.xiaomi.mipush.sdk.Constants;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MiioLocalAPI {
    public static final String BODY_MIIO_INFO = "{\"id\":1,\"method\":\"miIO.info\",\"params\":\"\"}";
    private static final String CHARSET = "UTF-8";
    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    private static final long FULL_DID = -1;
    private static final int FULL_STAMP = -1;
    private static final byte[] FULL_TOKEN = "ffffffffffffffffffffffffffffffff".getBytes();
    public static final String LOG_TAG = "miio-localapi";
    private static final int MAX_MSG_SIZE = 65535;
    private static final String MC_DA = "224.126.%s.%s";
    private static final int MC_LOOP_CNT = 30;
    private static final int MC_PORT = 5007;
    private static final String MC_TEXT = "miio";
    private static final int TOKEN_SIZE = 32;
    private static final int UDP_PORT = 54321;
    private static final int UDP_RETRY = 3;
    private static final int UDP_TIMEOUT = 700;
    private static final int UDP_TIMEOUT_REQ = 2000;
    private static final byte[] ZERO_TOKEN = "00000000000000000000000000000000".getBytes();
    private static String mDeviceLocal = null;
    private static boolean mStopSmartConfig = false;
    private static final ExecutorService sThreadPool;

    public enum WifiEnc {
        OPEN(1, ""),
        WEP_PSK(2, "[WEP]"),
        WEP_SHARED(3, "[WEP]"),
        WPA_TKIP_PSK(4, "[WPA-PSK-TKIP]"),
        WPA_AES_PSK(5, "[WPA-PSK-CCMP]"),
        WPA2_AES_PSK(6, "[WPA2-PSK-CCMP]"),
        WPA2_TKIP_PSK(7, "[WPA2-PSK-TKIP]"),
        WPA2_MIXED_PSK(8, "[WPA2-PSK-CCMP+TKIP]"),
        WPA2_MIXED_PSK1(8, "[WPA2-PSK-TKIP+CCMP]"),
        WPA_MIXED_PSK(9, "[WPA-PSK-CCMP+TKIP]"),
        WPA_MIXED_PSK1(9, "[WPA-PSK-TKIP+CCMP]");
        
        private String capability;
        private byte type;

        private WifiEnc(int i, String str) {
            this.type = (byte) i;
            this.capability = str;
        }

        public String getCapability() {
            return this.capability;
        }

        public byte getType() {
            return this.type;
        }

        public void setCapability(String str) {
            this.capability = str;
        }

        public void setType(byte b) {
            this.type = b;
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = availableProcessors;
        int i = availableProcessors + 1;
        CORE_POOL_SIZE = i;
        sThreadPool = Executors.newFixedThreadPool(i);
    }

    public static void async_device_detect(final InetAddress inetAddress, final MiioLocalDeviceResponse miioLocalDeviceResponse) {
        sThreadPool.execute(new Runnable() {
            public void run() {
                MiioLocalAPI.device_list_detect(inetAddress, miioLocalDeviceResponse);
            }
        });
    }

    public static void async_device_list(final InetAddress inetAddress, final MiioLocalDeviceListResponse miioLocalDeviceListResponse) {
        sThreadPool.execute(new Runnable() {
            public void run() {
                MiioLocalAPI.device_list(inetAddress, miioLocalDeviceListResponse);
            }
        });
    }

    public static void async_get_token(final String str, final MiioLocalRpcResponse miioLocalRpcResponse, final int i) {
        sThreadPool.execute(new Runnable() {
            public void run() {
                MiioLocalAPI.get_token(str, miioLocalRpcResponse, i);
            }
        });
    }

    public static void async_rpc(String str, String str2, long j, String str3, int i, MiioLocalRpcResponse miioLocalRpcResponse) {
        final String str4 = str;
        final String str5 = str2;
        final long j2 = j;
        final String str6 = str3;
        final int i2 = i;
        final MiioLocalRpcResponse miioLocalRpcResponse2 = miioLocalRpcResponse;
        sThreadPool.execute(new Runnable() {
            public void run() {
                MiioLocalAPI.rpc(str4, str5, j2, str6, i2, miioLocalRpcResponse2);
            }
        });
    }

    public static void async_rpc(String str, String str2, long j, String str3, MiioLocalRpcResponse miioLocalRpcResponse) {
        final String str4 = str;
        final String str5 = str2;
        final long j2 = j;
        final String str6 = str3;
        final MiioLocalRpcResponse miioLocalRpcResponse2 = miioLocalRpcResponse;
        sThreadPool.execute(new Runnable() {
            public void run() {
                MiioLocalAPI.rpc(str4, str5, j2, str6, miioLocalRpcResponse2);
            }
        });
    }

    public static void async_rpc(final String str, final String str2, final MiioLocalRpcResponse miioLocalRpcResponse) {
        sThreadPool.execute(new Runnable() {
            public void run() {
                MiioLocalAPI.rpc(str, str2, miioLocalRpcResponse);
            }
        });
    }

    public static void async_smart_config(String str, String str2, String str3, String str4, MiioLocalResponse miioLocalResponse) {
        mStopSmartConfig = false;
        final String str5 = str;
        final String str6 = str2;
        final String str7 = str3;
        final String str8 = str4;
        final MiioLocalResponse miioLocalResponse2 = miioLocalResponse;
        sThreadPool.execute(new Runnable() {
            public void run() {
                MiioLocalAPI.smart_config(str5, str6, str7, str8, miioLocalResponse2);
            }
        });
    }

    public static void async_smart_config_mac(String str, String str2, String str3, String str4, String str5, MiioLocalResponse miioLocalResponse) {
        mStopSmartConfig = false;
        final String str6 = str;
        final String str7 = str2;
        final String str8 = str3;
        final String str9 = str4;
        final String str10 = str5;
        final MiioLocalResponse miioLocalResponse2 = miioLocalResponse;
        sThreadPool.execute(new Runnable() {
            public void run() {
                MiioLocalAPI.smart_config_mac(str6, str7, str8, str9, str10, miioLocalResponse2);
            }
        });
    }

    public static void async_smart_config_mac_with_uid(String str, String str2, String str3, String str4, String str5, long j, MiioLocalResponse miioLocalResponse) {
        mStopSmartConfig = false;
        final String str6 = str;
        final String str7 = str2;
        final String str8 = str3;
        final String str9 = str4;
        final String str10 = str5;
        final long j2 = j;
        final MiioLocalResponse miioLocalResponse2 = miioLocalResponse;
        sThreadPool.execute(new Runnable() {
            public void run() {
                MiioLocalAPI.smart_config_mac_with_uid(str6, str7, str8, str9, str10, j2, miioLocalResponse2);
            }
        });
    }

    public static void async_smart_config_setupcode(String str, String str2, String str3, String str4, String str5, String str6, MiioLocalResponse miioLocalResponse) {
        mStopSmartConfig = false;
        final String str7 = str;
        final String str8 = str2;
        final String str9 = str3;
        final String str10 = str4;
        final String str11 = str5;
        final String str12 = str6;
        final MiioLocalResponse miioLocalResponse2 = miioLocalResponse;
        sThreadPool.execute(new Runnable() {
            public void run() {
                MiioLocalAPI.smart_config_setupcode(str7, str8, str9, str10, str11, str12, miioLocalResponse2);
            }
        });
    }

    public static void async_smart_config_setupcode_with_uid(String str, String str2, String str3, String str4, String str5, String str6, long j, MiioLocalResponse miioLocalResponse) {
        mStopSmartConfig = false;
        final String str7 = str;
        final String str8 = str2;
        final String str9 = str3;
        final String str10 = str4;
        final String str11 = str5;
        final String str12 = str6;
        final long j2 = j;
        final MiioLocalResponse miioLocalResponse2 = miioLocalResponse;
        sThreadPool.execute(new Runnable() {
            public void run() {
                MiioLocalAPI.smart_config_setupcode_with_uid(str7, str8, str9, str10, str11, str12, j2, miioLocalResponse2);
            }
        });
    }

    public static void async_smart_config_with_uid(String str, String str2, String str3, String str4, long j, MiioLocalResponse miioLocalResponse) {
        mStopSmartConfig = false;
        final String str5 = str;
        final String str6 = str2;
        final String str7 = str3;
        final String str8 = str4;
        final long j2 = j;
        final MiioLocalResponse miioLocalResponse2 = miioLocalResponse;
        sThreadPool.execute(new Runnable() {
            public void run() {
                MiioLocalAPI.smart_config_with_uid(str5, str6, str7, str8, j2, miioLocalResponse2);
            }
        });
    }

    public static void async_trigger(final MiioLocalResponse miioLocalResponse) {
        sThreadPool.execute(new Runnable() {
            public void run() {
                MiioLocalAPI.trigger(miioLocalResponse);
            }
        });
    }

    private static byte capabilities2byte(String str) {
        WifiEnc wifiEnc;
        if (str.contains(WifiEnc.WPA2_MIXED_PSK.getCapability())) {
            wifiEnc = WifiEnc.WPA2_MIXED_PSK;
        } else if (str.contains(WifiEnc.WPA2_MIXED_PSK1.getCapability())) {
            wifiEnc = WifiEnc.WPA2_MIXED_PSK1;
        } else if (str.contains(WifiEnc.WPA2_AES_PSK.getCapability())) {
            wifiEnc = WifiEnc.WPA2_AES_PSK;
        } else if (str.contains(WifiEnc.WPA2_TKIP_PSK.getCapability())) {
            wifiEnc = WifiEnc.WPA2_TKIP_PSK;
        } else if (str.contains(WifiEnc.WPA_MIXED_PSK.getCapability())) {
            wifiEnc = WifiEnc.WPA_MIXED_PSK;
        } else if (str.contains(WifiEnc.WPA_MIXED_PSK1.getCapability())) {
            wifiEnc = WifiEnc.WPA_MIXED_PSK1;
        } else if (str.contains(WifiEnc.WPA_AES_PSK.getCapability())) {
            wifiEnc = WifiEnc.WPA_AES_PSK;
        } else if (str.contains(WifiEnc.WPA_TKIP_PSK.getCapability())) {
            wifiEnc = WifiEnc.WPA_TKIP_PSK;
        } else if (str.contains(WifiEnc.WEP_PSK.getCapability())) {
            wifiEnc = WifiEnc.WEP_PSK;
        } else if (str.contains(WifiEnc.WEP_SHARED.getCapability())) {
            wifiEnc = WifiEnc.WEP_SHARED;
        } else if (str.length() <= 0 || str.replaceAll("\\[WPS\\]", "").replaceAll("\\[ESS\\]", "").length() != 0) {
            return 0;
        } else {
            wifiEnc = WifiEnc.OPEN;
        }
        return wifiEnc.getType();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6 A[Catch:{ all -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void device_list(java.net.InetAddress r11, com.xiaomi.miio.MiioLocalDeviceListResponse r12) {
        /*
            r0 = 0
            java.net.DatagramSocket r1 = new java.net.DatagramSocket     // Catch:{ Exception -> 0x0080 }
            r1.<init>()     // Catch:{ Exception -> 0x0080 }
            r0 = 1
            r1.setReuseAddress(r0)     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
            r1.setBroadcast(r0)     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
            com.xiaomi.miio.JNIBridge$MiioMsg r0 = new com.xiaomi.miio.JNIBridge$MiioMsg     // Catch:{ all -> 0x0061 }
            r3 = -1
            r5 = -1
            byte[] r6 = FULL_TOKEN     // Catch:{ all -> 0x0061 }
            r7 = 0
            r2 = r0
            r2.<init>(r3, r5, r6, r7)     // Catch:{ all -> 0x0061 }
            byte[] r0 = com.xiaomi.miio.JNIBridge.hencrypt(r0)     // Catch:{ all -> 0x0061 }
            udp_send(r1, r11, r0)     // Catch:{ all -> 0x0061 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
            r11.<init>()     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
        L_0x0025:
            r0 = 65535(0xffff, float:9.1834E-41)
            byte[] r0 = new byte[r0]     // Catch:{ SocketTimeoutException -> 0x0050 }
            r2 = 700(0x2bc, float:9.81E-43)
            java.lang.String r10 = udp_receive(r1, r0, r2)     // Catch:{ SocketTimeoutException -> 0x0050 }
            com.xiaomi.miio.JNIBridge$MiioMsg r0 = com.xiaomi.miio.JNIBridge.hdecrypt(r0)     // Catch:{ SocketTimeoutException -> 0x0050 }
            com.xiaomi.miio.MiioLocalRpcResult r2 = new com.xiaomi.miio.MiioLocalRpcResult     // Catch:{ SocketTimeoutException -> 0x0050 }
            com.xiaomi.miio.MiioLocalErrorCode r4 = com.xiaomi.miio.MiioLocalErrorCode.SUCCESS     // Catch:{ SocketTimeoutException -> 0x0050 }
            r5 = 0
            long r6 = r0.did     // Catch:{ SocketTimeoutException -> 0x0050 }
            int r8 = r0.stamp     // Catch:{ SocketTimeoutException -> 0x0050 }
            java.lang.String r3 = new java.lang.String     // Catch:{ SocketTimeoutException -> 0x0050 }
            byte[] r0 = r0.token     // Catch:{ SocketTimeoutException -> 0x0050 }
            r3.<init>(r0)     // Catch:{ SocketTimeoutException -> 0x0050 }
            java.lang.String r9 = r3.toLowerCase()     // Catch:{ SocketTimeoutException -> 0x0050 }
            r3 = r2
            r3.<init>(r4, r5, r6, r8, r9, r10)     // Catch:{ SocketTimeoutException -> 0x0050 }
            r11.add(r2)     // Catch:{ SocketTimeoutException -> 0x0050 }
            goto L_0x0025
        L_0x0050:
            if (r12 == 0) goto L_0x005d
            com.xiaomi.miio.MiioLocalDeviceListResult r0 = new com.xiaomi.miio.MiioLocalDeviceListResult     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
            com.xiaomi.miio.MiioLocalErrorCode r2 = com.xiaomi.miio.MiioLocalErrorCode.SUCCESS     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
            r0.<init>(r2, r11)     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
            r12.onResponse(r0)     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
        L_0x005d:
            r1.close()
            goto L_0x00b5
        L_0x0061:
            r11 = move-exception
            r11.printStackTrace()     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
            r11.toString()     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
            if (r12 == 0) goto L_0x0074
            com.xiaomi.miio.MiioLocalDeviceListResult r11 = new com.xiaomi.miio.MiioLocalDeviceListResult     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
            com.xiaomi.miio.MiioLocalErrorCode r0 = com.xiaomi.miio.MiioLocalErrorCode.EXCEPTION     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
            r11.<init>(r0)     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
            r12.onResponse(r11)     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
        L_0x0074:
            r1.close()
            return
        L_0x0078:
            r11 = move-exception
            r0 = r1
            goto L_0x00b6
        L_0x007b:
            r11 = move-exception
            r0 = r1
            goto L_0x0081
        L_0x007e:
            r11 = move-exception
            goto L_0x00b6
        L_0x0080:
            r11 = move-exception
        L_0x0081:
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch:{ all -> 0x007e }
            r1.<init>()     // Catch:{ all -> 0x007e }
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch:{ all -> 0x007e }
            r2.<init>(r1)     // Catch:{ all -> 0x007e }
            r11.printStackTrace(r2)     // Catch:{ all -> 0x007e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
            r2.<init>()     // Catch:{ all -> 0x007e }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x007e }
            r2.append(r11)     // Catch:{ all -> 0x007e }
            java.lang.String r11 = r1.toString()     // Catch:{ all -> 0x007e }
            r2.append(r11)     // Catch:{ all -> 0x007e }
            r2.toString()     // Catch:{ all -> 0x007e }
            if (r12 == 0) goto L_0x00b0
            com.xiaomi.miio.MiioLocalDeviceListResult r11 = new com.xiaomi.miio.MiioLocalDeviceListResult     // Catch:{ all -> 0x007e }
            com.xiaomi.miio.MiioLocalErrorCode r1 = com.xiaomi.miio.MiioLocalErrorCode.EXCEPTION     // Catch:{ all -> 0x007e }
            r11.<init>(r1)     // Catch:{ all -> 0x007e }
            r12.onResponse(r11)     // Catch:{ all -> 0x007e }
        L_0x00b0:
            if (r0 == 0) goto L_0x00b5
            r0.close()
        L_0x00b5:
            return
        L_0x00b6:
            if (r0 == 0) goto L_0x00bb
            r0.close()
        L_0x00bb:
            goto L_0x00bd
        L_0x00bc:
            throw r11
        L_0x00bd:
            goto L_0x00bc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.miio.MiioLocalAPI.device_list(java.net.InetAddress, com.xiaomi.miio.MiioLocalDeviceListResponse):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0088 A[Catch:{ all -> 0x0060 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void device_list_detect(java.net.InetAddress r10, com.xiaomi.miio.MiioLocalDeviceResponse r11) {
        /*
            r0 = 0
            java.net.DatagramSocket r1 = new java.net.DatagramSocket     // Catch:{ Exception -> 0x0062 }
            r1.<init>()     // Catch:{ Exception -> 0x0062 }
            r0 = 1
            r1.setReuseAddress(r0)     // Catch:{ Exception -> 0x005d, all -> 0x005a }
            r1.setBroadcast(r0)     // Catch:{ Exception -> 0x005d, all -> 0x005a }
            com.xiaomi.miio.JNIBridge$MiioMsg r0 = new com.xiaomi.miio.JNIBridge$MiioMsg     // Catch:{ Exception -> 0x005d, all -> 0x005a }
            r3 = -1
            r5 = -1
            byte[] r6 = FULL_TOKEN     // Catch:{ Exception -> 0x005d, all -> 0x005a }
            r7 = 0
            r2 = r0
            r2.<init>(r3, r5, r6, r7)     // Catch:{ Exception -> 0x005d, all -> 0x005a }
            byte[] r0 = com.xiaomi.miio.JNIBridge.hencrypt(r0)     // Catch:{ Exception -> 0x005d, all -> 0x005a }
            udp_send(r1, r10, r0)     // Catch:{ Exception -> 0x005d, all -> 0x005a }
        L_0x0020:
            r10 = 65535(0xffff, float:9.1834E-41)
            byte[] r10 = new byte[r10]     // Catch:{ SocketTimeoutException -> 0x0049 }
            r0 = 700(0x2bc, float:9.81E-43)
            java.lang.String r9 = udp_receive(r1, r10, r0)     // Catch:{ SocketTimeoutException -> 0x0049 }
            com.xiaomi.miio.JNIBridge$MiioMsg r10 = com.xiaomi.miio.JNIBridge.hdecrypt(r10)     // Catch:{ SocketTimeoutException -> 0x0049 }
            if (r11 == 0) goto L_0x0020
            com.xiaomi.miio.MiioLocalDeviceResult r0 = new com.xiaomi.miio.MiioLocalDeviceResult     // Catch:{ SocketTimeoutException -> 0x0049 }
            com.xiaomi.miio.MiioLocalErrorCode r3 = com.xiaomi.miio.MiioLocalErrorCode.SUCCESS     // Catch:{ SocketTimeoutException -> 0x0049 }
            r4 = 0
            long r5 = r10.did     // Catch:{ SocketTimeoutException -> 0x0049 }
            int r7 = r10.stamp     // Catch:{ SocketTimeoutException -> 0x0049 }
            java.lang.String r8 = new java.lang.String     // Catch:{ SocketTimeoutException -> 0x0049 }
            byte[] r10 = r10.token     // Catch:{ SocketTimeoutException -> 0x0049 }
            r8.<init>(r10)     // Catch:{ SocketTimeoutException -> 0x0049 }
            r2 = r0
            r2.<init>(r3, r4, r5, r7, r8, r9)     // Catch:{ SocketTimeoutException -> 0x0049 }
            r11.onResponse(r0)     // Catch:{ SocketTimeoutException -> 0x0049 }
            goto L_0x0020
        L_0x0049:
            if (r11 == 0) goto L_0x0056
            com.xiaomi.miio.MiioLocalDeviceResult r10 = new com.xiaomi.miio.MiioLocalDeviceResult     // Catch:{ Exception -> 0x005d, all -> 0x005a }
            com.xiaomi.miio.MiioLocalErrorCode r0 = com.xiaomi.miio.MiioLocalErrorCode.TIMEOUT     // Catch:{ Exception -> 0x005d, all -> 0x005a }
            r10.<init>(r0)     // Catch:{ Exception -> 0x005d, all -> 0x005a }
            r11.onResponse(r10)     // Catch:{ Exception -> 0x005d, all -> 0x005a }
        L_0x0056:
            r1.close()
            goto L_0x0097
        L_0x005a:
            r10 = move-exception
            r0 = r1
            goto L_0x0098
        L_0x005d:
            r10 = move-exception
            r0 = r1
            goto L_0x0063
        L_0x0060:
            r10 = move-exception
            goto L_0x0098
        L_0x0062:
            r10 = move-exception
        L_0x0063:
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch:{ all -> 0x0060 }
            r1.<init>()     // Catch:{ all -> 0x0060 }
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch:{ all -> 0x0060 }
            r2.<init>(r1)     // Catch:{ all -> 0x0060 }
            r10.printStackTrace(r2)     // Catch:{ all -> 0x0060 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0060 }
            r2.<init>()     // Catch:{ all -> 0x0060 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0060 }
            r2.append(r10)     // Catch:{ all -> 0x0060 }
            java.lang.String r10 = r1.toString()     // Catch:{ all -> 0x0060 }
            r2.append(r10)     // Catch:{ all -> 0x0060 }
            r2.toString()     // Catch:{ all -> 0x0060 }
            if (r11 == 0) goto L_0x0092
            com.xiaomi.miio.MiioLocalDeviceResult r10 = new com.xiaomi.miio.MiioLocalDeviceResult     // Catch:{ all -> 0x0060 }
            com.xiaomi.miio.MiioLocalErrorCode r1 = com.xiaomi.miio.MiioLocalErrorCode.EXCEPTION     // Catch:{ all -> 0x0060 }
            r10.<init>(r1)     // Catch:{ all -> 0x0060 }
            r11.onResponse(r10)     // Catch:{ all -> 0x0060 }
        L_0x0092:
            if (r0 == 0) goto L_0x0097
            r0.close()
        L_0x0097:
            return
        L_0x0098:
            if (r0 == 0) goto L_0x009d
            r0.close()
        L_0x009d:
            goto L_0x009f
        L_0x009e:
            throw r10
        L_0x009f:
            goto L_0x009e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.miio.MiioLocalAPI.device_list_detect(java.net.InetAddress, com.xiaomi.miio.MiioLocalDeviceResponse):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01a5 A[Catch:{ Exception -> 0x01d6, all -> 0x01d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01b0 A[Catch:{ Exception -> 0x01d6, all -> 0x01d3 }, LOOP:4: B:71:0x01b0->B:75:0x01ba, LOOP_START, PHI: r10 
      PHI: (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:68:0x01a3, B:75:0x01ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01c7 A[Catch:{ Exception -> 0x01d6, all -> 0x01d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0201 A[Catch:{ all -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0213  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void do_smart_config(java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, long r26, long r28, com.xiaomi.miio.MiioLocalResponse r30) {
        /*
            r0 = r25
            r1 = r26
            r3 = r30
            java.lang.String r4 = "UTF-8"
            r5 = 0
            java.net.MulticastSocket r6 = new java.net.MulticastSocket     // Catch:{ Exception -> 0x01db }
            r6.<init>()     // Catch:{ Exception -> 0x01db }
            r5 = r20
            byte[] r5 = r5.getBytes(r4)     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            r7 = r21
            byte[] r7 = r7.getBytes(r4)     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            int r8 = r5.length     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            int r9 = r7.length     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            int r8 = r8 + r9
            r9 = 1
            int r8 = r8 + r9
            r10 = 0
            if (r22 == 0) goto L_0x002c
            if (r23 == 0) goto L_0x002c
            byte r11 = capabilities2byte(r23)     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            if (r11 == 0) goto L_0x002c
            r11 = 1
            goto L_0x002d
        L_0x002c:
            r11 = 0
        L_0x002d:
            int r8 = r8 + 9
            r12 = 0
            int r14 = (r28 > r12 ? 1 : (r28 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x003f
            int r8 = r8 + 6
            boolean r14 = hasLongUidHighBits(r28)     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            if (r14 == 0) goto L_0x003f
            int r8 = r8 + 6
        L_0x003f:
            java.lang.String r14 = mDeviceLocal     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            r15 = 2
            if (r14 == 0) goto L_0x004e
            java.lang.String r14 = mDeviceLocal     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            int r14 = r14.length()     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            if (r14 != r15) goto L_0x004e
            int r8 = r8 + 4
        L_0x004e:
            byte[] r8 = new byte[r8]     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            r14 = 0
        L_0x0051:
            int r12 = r5.length     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            if (r14 >= r12) goto L_0x005b
            byte r12 = r5[r14]     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            r8[r14] = r12     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            int r14 = r14 + 1
            goto L_0x0051
        L_0x005b:
            int r5 = r14 + 1
            r8[r14] = r10     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            r12 = 0
        L_0x0060:
            int r13 = r7.length     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            if (r12 >= r13) goto L_0x006c
            byte r13 = r7[r12]     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            r8[r5] = r13     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            int r12 = r12 + 1
            int r5 = r5 + 1
            goto L_0x0060
        L_0x006c:
            r7 = 6
            r12 = 4
            if (r11 == 0) goto L_0x0094
            int r11 = r5 + 1
            r8[r5] = r10     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            byte[] r5 = mac2byte(r22)     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            r13 = 0
        L_0x0079:
            int r14 = r5.length     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            if (r13 >= r14) goto L_0x0085
            byte r14 = r5[r13]     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            r8[r11] = r14     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            int r13 = r13 + 1
            int r11 = r11 + 1
            goto L_0x0079
        L_0x0085:
            int r5 = r11 + 1
            r8[r11] = r10     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            int r11 = r5 + 1
            byte r13 = capabilities2byte(r23)     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            r8[r5] = r13     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
        L_0x0091:
            r13 = 0
            goto L_0x00be
        L_0x0094:
            int r11 = r5 + 1
            r8[r5] = r10     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            byte[] r5 = new byte[r7]     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            r5[r10] = r10     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            r5[r9] = r10     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            r5[r15] = r10     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            r13 = 3
            r5[r13] = r10     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            r5[r12] = r10     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            r13 = 5
            r5[r13] = r10     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            r13 = 0
        L_0x00a9:
            if (r13 >= r7) goto L_0x00b4
            byte r14 = r5[r13]     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            r8[r11] = r14     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            int r13 = r13 + 1
            int r11 = r11 + 1
            goto L_0x00a9
        L_0x00b4:
            int r5 = r11 + 1
            r8[r11] = r10     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            int r11 = r5 + 1
            r13 = -1
            r8[r5] = r13     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            goto L_0x0091
        L_0x00be:
            int r5 = (r28 > r13 ? 1 : (r28 == r13 ? 0 : -1))
            if (r5 == 0) goto L_0x0138
            int r5 = r11 + 1
            r13 = 16
            r8[r11] = r13     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            int r11 = r5 + 1
            r8[r5] = r7     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            int r5 = r11 + 1
            r14 = 24
            long r16 = r28 >> r14
            r18 = 255(0xff, double:1.26E-321)
            long r9 = r16 & r18
            int r10 = (int) r9     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            byte r9 = (byte) r10     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            r8[r11] = r9     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            int r9 = r5 + 1
            long r10 = r28 >> r13
            long r10 = r10 & r18
            int r11 = (int) r10     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            byte r10 = (byte) r11     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            r8[r5] = r10     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            int r5 = r9 + 1
            r10 = 8
            long r10 = r28 >> r10
            long r10 = r10 & r18
            int r11 = (int) r10     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            byte r10 = (byte) r11     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            r8[r9] = r10     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            int r11 = r5 + 1
            long r9 = r28 & r18
            int r10 = (int) r9     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            byte r9 = (byte) r10     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            r8[r5] = r9     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            boolean r5 = hasLongUidHighBits(r28)     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            if (r5 == 0) goto L_0x0138
            int r5 = r11 + 1
            r9 = 18
            r8[r11] = r9     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            int r9 = r5 + 1
            r8[r5] = r7     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            int r5 = r9 + 1
            r7 = 56
            long r10 = r28 >> r7
            long r10 = r10 & r18
            int r7 = (int) r10     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            byte r7 = (byte) r7     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            r8[r9] = r7     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            int r7 = r5 + 1
            r9 = 48
            long r9 = r28 >> r9
            long r9 = r9 & r18
            int r10 = (int) r9     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            byte r9 = (byte) r10     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            r8[r5] = r9     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            int r5 = r7 + 1
            r9 = 40
            long r9 = r28 >> r9
            long r9 = r9 & r18
            int r10 = (int) r9     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            byte r9 = (byte) r10     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            r8[r7] = r9     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            int r11 = r5 + 1
            r7 = 32
            long r9 = r28 >> r7
            long r9 = r9 & r18
            int r7 = (int) r9     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            byte r7 = (byte) r7     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            r8[r5] = r7     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
        L_0x0138:
            java.lang.String r5 = mDeviceLocal     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            if (r5 == 0) goto L_0x0165
            java.lang.String r5 = mDeviceLocal     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            int r5 = r5.length()     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            if (r5 != r15) goto L_0x0165
            int r5 = r11 + 1
            r7 = 17
            r8[r11] = r7     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            int r7 = r5 + 1
            r8[r5] = r12     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            int r5 = r7 + 1
            java.lang.String r9 = mDeviceLocal     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            r10 = 0
            char r9 = r9.charAt(r10)     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            byte r9 = (byte) r9     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            r8[r7] = r9     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            java.lang.String r7 = mDeviceLocal     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            r9 = 1
            char r7 = r7.charAt(r9)     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            byte r7 = (byte) r7     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            r8[r5] = r7     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            goto L_0x0166
        L_0x0165:
            r10 = 0
        L_0x0166:
            if (r24 == 0) goto L_0x0181
            if (r0 != 0) goto L_0x0181
            int r5 = r24.length()     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            if (r5 != r12) goto L_0x0181
            java.lang.String r0 = r24.toLowerCase()     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            byte[] r0 = r0.getBytes(r4)     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            byte[] r0 = com.xiaomi.miio.JNIBridge.smencryptpk(r8, r1, r0)     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
        L_0x017c:
            java.lang.String r1 = get_b_addr(r24)     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            goto L_0x01a0
        L_0x0181:
            if (r24 == 0) goto L_0x019a
            if (r0 == 0) goto L_0x019a
            int r5 = r24.length()     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            if (r5 != r12) goto L_0x019a
            int r5 = r25.length()     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            if (r5 != r12) goto L_0x019a
            byte[] r0 = r0.getBytes(r4)     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            byte[] r0 = com.xiaomi.miio.JNIBridge.smencryptpk(r8, r1, r0)     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            goto L_0x017c
        L_0x019a:
            byte[] r0 = com.xiaomi.miio.JNIBridge.smencrypt(r8, r1)     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            java.lang.String r1 = "224.126.%s.%s"
        L_0x01a0:
            int r2 = r0.length     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            r4 = 254(0xfe, float:3.56E-43)
            if (r2 <= r4) goto L_0x01b0
            com.xiaomi.miio.MiioLocalResult r0 = new com.xiaomi.miio.MiioLocalResult     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            com.xiaomi.miio.MiioLocalErrorCode r1 = com.xiaomi.miio.MiioLocalErrorCode.MSG_TOO_LONG     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
        L_0x01ac:
            r3.onResponse(r0)     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            goto L_0x01cf
        L_0x01b0:
            int r2 = r10 + 1
            r4 = 30
            if (r10 >= r4) goto L_0x01c5
            boolean r4 = mStopSmartConfig     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            if (r4 != 0) goto L_0x01c5
            r4 = 1
            mc_loop(r1, r6, r0, r4)     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            r7 = 50
            java.lang.Thread.sleep(r7)     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            r10 = r2
            goto L_0x01b0
        L_0x01c5:
            if (r3 == 0) goto L_0x01cf
            com.xiaomi.miio.MiioLocalResult r0 = new com.xiaomi.miio.MiioLocalResult     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            com.xiaomi.miio.MiioLocalErrorCode r1 = com.xiaomi.miio.MiioLocalErrorCode.SUCCESS     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x01d6, all -> 0x01d3 }
            goto L_0x01ac
        L_0x01cf:
            r6.close()
            goto L_0x0210
        L_0x01d3:
            r0 = move-exception
            r5 = r6
            goto L_0x0211
        L_0x01d6:
            r0 = move-exception
            r5 = r6
            goto L_0x01dc
        L_0x01d9:
            r0 = move-exception
            goto L_0x0211
        L_0x01db:
            r0 = move-exception
        L_0x01dc:
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch:{ all -> 0x01d9 }
            r1.<init>()     // Catch:{ all -> 0x01d9 }
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch:{ all -> 0x01d9 }
            r2.<init>(r1)     // Catch:{ all -> 0x01d9 }
            r0.printStackTrace(r2)     // Catch:{ all -> 0x01d9 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d9 }
            r2.<init>()     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01d9 }
            r2.append(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01d9 }
            r2.append(r0)     // Catch:{ all -> 0x01d9 }
            r2.toString()     // Catch:{ all -> 0x01d9 }
            if (r3 == 0) goto L_0x020b
            com.xiaomi.miio.MiioLocalResult r0 = new com.xiaomi.miio.MiioLocalResult     // Catch:{ all -> 0x01d9 }
            com.xiaomi.miio.MiioLocalErrorCode r1 = com.xiaomi.miio.MiioLocalErrorCode.EXCEPTION     // Catch:{ all -> 0x01d9 }
            r0.<init>(r1)     // Catch:{ all -> 0x01d9 }
            r3.onResponse(r0)     // Catch:{ all -> 0x01d9 }
        L_0x020b:
            if (r5 == 0) goto L_0x0210
            r5.close()
        L_0x0210:
            return
        L_0x0211:
            if (r5 == 0) goto L_0x0216
            r5.close()
        L_0x0216:
            goto L_0x0218
        L_0x0217:
            throw r0
        L_0x0218:
            goto L_0x0217
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.miio.MiioLocalAPI.do_smart_config(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long, com.xiaomi.miio.MiioLocalResponse):void");
    }

    private static String get_b_addr(String str) {
        int parseInt = (Integer.parseInt("0000" + str, 16) % SmartConfigStep.MSG_GET_DEVICE_MODEL) + SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT;
        return "224." + parseInt + ".%s.%s";
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0055, code lost:
        if (new java.lang.String(FULL_TOKEN).equals(new java.lang.String(r0.token).toLowerCase()) == false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0057, code lost:
        r0 = new com.xiaomi.miio.MiioLocalRpcResult(com.xiaomi.miio.MiioLocalErrorCode.PERMISSION_DENIED).toAPIString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0062, code lost:
        r1.onResponse(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0066, code lost:
        r0 = new com.xiaomi.miio.MiioLocalRpcResult(com.xiaomi.miio.MiioLocalErrorCode.SUCCESS, "{\"id\":1,\"result\":{\"token\":\"" + new java.lang.String(r0.token).toLowerCase() + "\", \"did\":\"" + r0.did + "\"}}", r0.did, r0.stamp, new java.lang.String(r0.token).toLowerCase(), r14).toAPIString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f5, code lost:
        if (r5 != null) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0138, code lost:
        if (r5 != null) goto L_0x00f7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0140 A[SYNTHETIC, Splitter:B:44:0x0140] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x000d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x000d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void get_token(java.lang.String r15, com.xiaomi.miio.MiioLocalRpcResponse r16, int r17) {
        /*
            r1 = r16
            java.lang.Class<com.xiaomi.miio.MiioLocalAPI> r2 = com.xiaomi.miio.MiioLocalAPI.class
            monitor-enter(r2)
            r3 = 1
            r0 = 0
            r4 = r17
            r5 = r0
            if (r4 >= r3) goto L_0x000d
            r4 = 1
        L_0x000d:
            if (r4 <= 0) goto L_0x0147
            int r4 = r4 + -1
            java.net.DatagramSocket r6 = new java.net.DatagramSocket     // Catch:{ SocketTimeoutException -> 0x0102, Exception -> 0x00bf }
            r6.<init>()     // Catch:{ SocketTimeoutException -> 0x0102, Exception -> 0x00bf }
            r6.setReuseAddress(r3)     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            com.xiaomi.miio.JNIBridge$MiioMsg r0 = new com.xiaomi.miio.JNIBridge$MiioMsg     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            r8 = -1
            r10 = -1
            byte[] r11 = FULL_TOKEN     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            r12 = 0
            r7 = r0
            r7.<init>(r8, r10, r11, r12)     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            byte[] r0 = com.xiaomi.miio.JNIBridge.hencrypt(r0)     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            java.net.InetAddress r5 = java.net.InetAddress.getByName(r15)     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            udp_send(r6, r5, r0)     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            r0 = 65535(0xffff, float:9.1834E-41)
            byte[] r0 = new byte[r0]     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            r5 = 2000(0x7d0, float:2.803E-42)
            java.lang.String r14 = udp_receive(r6, r0, r5)     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            com.xiaomi.miio.JNIBridge$MiioMsg r0 = com.xiaomi.miio.JNIBridge.hdecrypt(r0)     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            java.lang.String r5 = new java.lang.String     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            byte[] r7 = FULL_TOKEN     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            r5.<init>(r7)     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            java.lang.String r7 = new java.lang.String     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            byte[] r8 = r0.token     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            r7.<init>(r8)     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            java.lang.String r7 = r7.toLowerCase()     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            boolean r5 = r5.equals(r7)     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            if (r5 == 0) goto L_0x0066
            com.xiaomi.miio.MiioLocalRpcResult r0 = new com.xiaomi.miio.MiioLocalRpcResult     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            com.xiaomi.miio.MiioLocalErrorCode r5 = com.xiaomi.miio.MiioLocalErrorCode.PERMISSION_DENIED     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            r0.<init>(r5)     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            java.lang.String r0 = r0.toAPIString()     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
        L_0x0062:
            r1.onResponse(r0)     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            goto L_0x00ad
        L_0x0066:
            com.xiaomi.miio.MiioLocalRpcResult r5 = new com.xiaomi.miio.MiioLocalRpcResult     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            com.xiaomi.miio.MiioLocalErrorCode r8 = com.xiaomi.miio.MiioLocalErrorCode.SUCCESS     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            r7.<init>()     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            java.lang.String r9 = "{\"id\":1,\"result\":{\"token\":\""
            r7.append(r9)     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            java.lang.String r9 = new java.lang.String     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            byte[] r10 = r0.token     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            r9.<init>(r10)     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            java.lang.String r9 = r9.toLowerCase()     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            r7.append(r9)     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            java.lang.String r9 = "\", \"did\":\""
            r7.append(r9)     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            long r9 = r0.did     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            r7.append(r9)     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            java.lang.String r9 = "\"}}"
            r7.append(r9)     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            java.lang.String r9 = r7.toString()     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            long r10 = r0.did     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            int r12 = r0.stamp     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            java.lang.String r7 = new java.lang.String     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            byte[] r0 = r0.token     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            r7.<init>(r0)     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            java.lang.String r13 = r7.toLowerCase()     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            r7 = r5
            r7.<init>(r8, r9, r10, r12, r13, r14)     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            java.lang.String r0 = r5.toAPIString()     // Catch:{ SocketTimeoutException -> 0x00b9, Exception -> 0x00b6, all -> 0x00b2 }
            goto L_0x0062
        L_0x00ad:
            r6.close()     // Catch:{ all -> 0x0144 }
            goto L_0x0147
        L_0x00b2:
            r0 = move-exception
            r5 = r6
            goto L_0x013e
        L_0x00b6:
            r0 = move-exception
            r5 = r6
            goto L_0x00c0
        L_0x00b9:
            r0 = move-exception
            r5 = r6
            goto L_0x0103
        L_0x00bc:
            r0 = move-exception
            goto L_0x013e
        L_0x00bf:
            r0 = move-exception
        L_0x00c0:
            java.io.StringWriter r6 = new java.io.StringWriter     // Catch:{ all -> 0x00bc }
            r6.<init>()     // Catch:{ all -> 0x00bc }
            java.io.PrintWriter r7 = new java.io.PrintWriter     // Catch:{ all -> 0x00bc }
            r7.<init>(r6)     // Catch:{ all -> 0x00bc }
            r0.printStackTrace(r7)     // Catch:{ all -> 0x00bc }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bc }
            r7.<init>()     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00bc }
            r7.append(r0)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x00bc }
            r7.append(r0)     // Catch:{ all -> 0x00bc }
            r7.toString()     // Catch:{ all -> 0x00bc }
            if (r1 == 0) goto L_0x00fb
            if (r4 > 0) goto L_0x00fb
            com.xiaomi.miio.MiioLocalRpcResult r0 = new com.xiaomi.miio.MiioLocalRpcResult     // Catch:{ all -> 0x00bc }
            com.xiaomi.miio.MiioLocalErrorCode r3 = com.xiaomi.miio.MiioLocalErrorCode.EXCEPTION     // Catch:{ all -> 0x00bc }
            r0.<init>(r3)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = r0.toAPIString()     // Catch:{ all -> 0x00bc }
            r1.onResponse(r0)     // Catch:{ all -> 0x00bc }
            if (r5 == 0) goto L_0x0147
        L_0x00f7:
            r5.close()     // Catch:{ all -> 0x0144 }
            goto L_0x0147
        L_0x00fb:
            if (r5 == 0) goto L_0x000d
        L_0x00fd:
            r5.close()     // Catch:{ all -> 0x0144 }
            goto L_0x000d
        L_0x0102:
            r0 = move-exception
        L_0x0103:
            java.io.StringWriter r6 = new java.io.StringWriter     // Catch:{ all -> 0x00bc }
            r6.<init>()     // Catch:{ all -> 0x00bc }
            java.io.PrintWriter r7 = new java.io.PrintWriter     // Catch:{ all -> 0x00bc }
            r7.<init>(r6)     // Catch:{ all -> 0x00bc }
            r0.printStackTrace(r7)     // Catch:{ all -> 0x00bc }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bc }
            r7.<init>()     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00bc }
            r7.append(r0)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x00bc }
            r7.append(r0)     // Catch:{ all -> 0x00bc }
            r7.toString()     // Catch:{ all -> 0x00bc }
            if (r1 == 0) goto L_0x013b
            if (r4 > 0) goto L_0x013b
            com.xiaomi.miio.MiioLocalRpcResult r0 = new com.xiaomi.miio.MiioLocalRpcResult     // Catch:{ all -> 0x00bc }
            com.xiaomi.miio.MiioLocalErrorCode r3 = com.xiaomi.miio.MiioLocalErrorCode.TIMEOUT     // Catch:{ all -> 0x00bc }
            r0.<init>(r3)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = r0.toAPIString()     // Catch:{ all -> 0x00bc }
            r1.onResponse(r0)     // Catch:{ all -> 0x00bc }
            if (r5 == 0) goto L_0x0147
            goto L_0x00f7
        L_0x013b:
            if (r5 == 0) goto L_0x000d
            goto L_0x00fd
        L_0x013e:
            if (r5 == 0) goto L_0x0143
            r5.close()     // Catch:{ all -> 0x0144 }
        L_0x0143:
            throw r0     // Catch:{ all -> 0x0144 }
        L_0x0144:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0147:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.miio.MiioLocalAPI.get_token(java.lang.String, com.xiaomi.miio.MiioLocalRpcResponse, int):void");
    }

    private static boolean hasLongUidHighBits(long j) {
        return ((int) ((j >> 32) & -1)) != 0;
    }

    private static byte[] mac2byte(String str) {
        byte[] bArr = new byte[6];
        String[] split = str.toLowerCase().split(Constants.COLON_SEPARATOR);
        int length = split.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            bArr[i2] = (byte) Integer.parseInt(split[i], 16);
            i++;
            i2++;
        }
        return bArr;
    }

    private static void mc_loop(String str, MulticastSocket multicastSocket, byte[] bArr, boolean z) {
        mc_send(multicastSocket, String.format(str, new Object[]{0, Integer.valueOf(bArr.length + 1)}));
        int i = 0;
        while (i < bArr.length) {
            int i2 = i + 1;
            mc_send(multicastSocket, String.format(str, new Object[]{Integer.valueOf(i2), Integer.valueOf(bArr[i] & 255)}));
            if (i != 0 && i % 10 == 0) {
                Thread.sleep(4);
                mc_send(multicastSocket, String.format(str, new Object[]{0, Integer.valueOf(bArr.length + 1)}));
            }
            if (z) {
                Thread.sleep(4);
            }
            i = i2;
        }
    }

    private static void mc_send(MulticastSocket multicastSocket, String str) {
        InetAddress byName = InetAddress.getByName(str);
        multicastSocket.joinGroup(byName);
        multicastSocket.send(new DatagramPacket(MC_TEXT.getBytes(), 4, byName, MC_PORT));
        multicastSocket.leaveGroup(byName);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.net.DatagramSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.net.DatagramSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.net.DatagramSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.net.DatagramSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.net.DatagramSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.net.DatagramSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.net.DatagramSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: java.net.DatagramSocket} */
    /* JADX WARNING: type inference failed for: r3v13, types: [java.lang.String] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c0, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c1, code lost:
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c5, code lost:
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f2, code lost:
        r1.onResponse(new com.xiaomi.miio.MiioLocalRpcResult(com.xiaomi.miio.MiioLocalErrorCode.EXCEPTION).toAPIString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0100, code lost:
        if (r3 == null) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013a, code lost:
        if (r3 == null) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x013e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c0 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:6:0x000c] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c4 A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:6:0x000c] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f2 A[Catch:{ all -> 0x00ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012c A[Catch:{ all -> 0x00ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0141 A[SYNTHETIC, Splitter:B:60:0x0141] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:49:0x0102=Splitter:B:49:0x0102, B:34:0x00bb=Splitter:B:34:0x00bb} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:52:0x0107=Splitter:B:52:0x0107, B:44:0x00cd=Splitter:B:44:0x00cd} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void rpc(java.lang.String r21, java.lang.String r22, long r23, java.lang.String r25, int r26, com.xiaomi.miio.MiioLocalRpcResponse r27) {
        /*
            r1 = r27
            java.lang.Class<com.xiaomi.miio.MiioLocalAPI> r2 = com.xiaomi.miio.MiioLocalAPI.class
            monitor-enter(r2)
            r3 = 0
            java.net.DatagramSocket r4 = new java.net.DatagramSocket     // Catch:{ SocketTimeoutException -> 0x0106, Exception -> 0x00cc }
            r4.<init>()     // Catch:{ SocketTimeoutException -> 0x0106, Exception -> 0x00cc }
            r0 = 1
            r4.setReuseAddress(r0)     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            java.net.InetAddress r5 = java.net.InetAddress.getByName(r21)     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            java.lang.String r0 = "UTF-8"
            r6 = r25
            byte[] r12 = r6.getBytes(r0)     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            int r0 = r12.length     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            r6 = 32
            if (r0 == r6) goto L_0x0033
            com.xiaomi.miio.MiioLocalRpcResult r0 = new com.xiaomi.miio.MiioLocalRpcResult     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            com.xiaomi.miio.MiioLocalErrorCode r3 = com.xiaomi.miio.MiioLocalErrorCode.PERMISSION_DENIED     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            r0.<init>(r3)     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            java.lang.String r0 = r0.toAPIString()     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            r1.onResponse(r0)     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            r4.close()     // Catch:{ all -> 0x0145 }
            monitor-exit(r2)
            return
        L_0x0033:
            com.xiaomi.miio.JNIBridge$MiioMsg r0 = new com.xiaomi.miio.JNIBridge$MiioMsg     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            java.lang.String r6 = "UTF-8"
            r7 = r22
            byte[] r11 = r7.getBytes(r6)     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            r6 = r0
            r7 = r23
            r9 = r26
            r10 = r12
            r6.<init>(r7, r9, r10, r11)     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            byte[] r6 = com.xiaomi.miio.JNIBridge.encrypt(r0)     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            r0 = 65535(0xffff, float:9.1834E-41)
            byte[] r7 = new byte[r0]     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            r0 = 0
            r8 = 0
        L_0x0051:
            r0 = 3
            if (r8 >= r0) goto L_0x0077
            udp_send(r4, r5, r6)     // Catch:{ SocketTimeoutException -> 0x005e, Exception -> 0x00c4, all -> 0x00c0 }
            r0 = 2000(0x7d0, float:2.803E-42)
            java.lang.String r3 = udp_receive(r4, r7, r0)     // Catch:{ SocketTimeoutException -> 0x005e, Exception -> 0x00c4, all -> 0x00c0 }
            goto L_0x0077
        L_0x005e:
            r0 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            r9.<init>()     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            java.lang.String r10 = "rpc data time out, retry "
            r9.append(r10)     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            int r10 = r8 + 1
            r9.append(r10)     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            r9.toString()     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            r9 = 2
            if (r8 == r9) goto L_0x0076
            r8 = r10
            goto L_0x0051
        L_0x0076:
            throw r0     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
        L_0x0077:
            r20 = r3
            com.xiaomi.miio.JNIBridge$MiioMsg r0 = com.xiaomi.miio.JNIBridge.decrypt(r7, r12)     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            byte[] r3 = r0.message     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            if (r3 == 0) goto L_0x00ad
            if (r1 == 0) goto L_0x00ad
            com.xiaomi.miio.MiioLocalRpcResult r3 = new com.xiaomi.miio.MiioLocalRpcResult     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            com.xiaomi.miio.MiioLocalErrorCode r14 = com.xiaomi.miio.MiioLocalErrorCode.SUCCESS     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            java.lang.String r15 = new java.lang.String     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            byte[] r5 = r0.message     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            r15.<init>(r5)     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            long r5 = r0.did     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            int r7 = r0.stamp     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            java.lang.String r8 = new java.lang.String     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            byte[] r0 = r0.token     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            r8.<init>(r0)     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            java.lang.String r19 = r8.toLowerCase()     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            r13 = r3
            r16 = r5
            r18 = r7
            r13.<init>(r14, r15, r16, r18, r19, r20)     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            java.lang.String r0 = r3.toAPIString()     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
        L_0x00a9:
            r1.onResponse(r0)     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            goto L_0x00bb
        L_0x00ad:
            if (r1 == 0) goto L_0x00bb
            com.xiaomi.miio.MiioLocalRpcResult r0 = new com.xiaomi.miio.MiioLocalRpcResult     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            com.xiaomi.miio.MiioLocalErrorCode r3 = com.xiaomi.miio.MiioLocalErrorCode.DEVICE_EXCEPTION     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            r0.<init>(r3)     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            java.lang.String r0 = r0.toAPIString()     // Catch:{ SocketTimeoutException -> 0x00c7, Exception -> 0x00c4, all -> 0x00c0 }
            goto L_0x00a9
        L_0x00bb:
            r4.close()     // Catch:{ all -> 0x0145 }
            goto L_0x013d
        L_0x00c0:
            r0 = move-exception
            r3 = r4
            goto L_0x013f
        L_0x00c4:
            r0 = move-exception
            r3 = r4
            goto L_0x00cd
        L_0x00c7:
            r0 = move-exception
            r3 = r4
            goto L_0x0107
        L_0x00ca:
            r0 = move-exception
            goto L_0x013f
        L_0x00cc:
            r0 = move-exception
        L_0x00cd:
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch:{ all -> 0x00ca }
            r4.<init>()     // Catch:{ all -> 0x00ca }
            java.io.PrintWriter r5 = new java.io.PrintWriter     // Catch:{ all -> 0x00ca }
            r5.<init>(r4)     // Catch:{ all -> 0x00ca }
            r0.printStackTrace(r5)     // Catch:{ all -> 0x00ca }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ca }
            r5.<init>()     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00ca }
            r5.append(r0)     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x00ca }
            r5.append(r0)     // Catch:{ all -> 0x00ca }
            r5.toString()     // Catch:{ all -> 0x00ca }
            if (r1 == 0) goto L_0x0100
            com.xiaomi.miio.MiioLocalRpcResult r0 = new com.xiaomi.miio.MiioLocalRpcResult     // Catch:{ all -> 0x00ca }
            com.xiaomi.miio.MiioLocalErrorCode r4 = com.xiaomi.miio.MiioLocalErrorCode.EXCEPTION     // Catch:{ all -> 0x00ca }
            r0.<init>(r4)     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = r0.toAPIString()     // Catch:{ all -> 0x00ca }
            r1.onResponse(r0)     // Catch:{ all -> 0x00ca }
        L_0x0100:
            if (r3 == 0) goto L_0x013d
        L_0x0102:
            r3.close()     // Catch:{ all -> 0x0145 }
            goto L_0x013d
        L_0x0106:
            r0 = move-exception
        L_0x0107:
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch:{ all -> 0x00ca }
            r4.<init>()     // Catch:{ all -> 0x00ca }
            java.io.PrintWriter r5 = new java.io.PrintWriter     // Catch:{ all -> 0x00ca }
            r5.<init>(r4)     // Catch:{ all -> 0x00ca }
            r0.printStackTrace(r5)     // Catch:{ all -> 0x00ca }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ca }
            r5.<init>()     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00ca }
            r5.append(r0)     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x00ca }
            r5.append(r0)     // Catch:{ all -> 0x00ca }
            r5.toString()     // Catch:{ all -> 0x00ca }
            if (r1 == 0) goto L_0x013a
            com.xiaomi.miio.MiioLocalRpcResult r0 = new com.xiaomi.miio.MiioLocalRpcResult     // Catch:{ all -> 0x00ca }
            com.xiaomi.miio.MiioLocalErrorCode r4 = com.xiaomi.miio.MiioLocalErrorCode.TIMEOUT     // Catch:{ all -> 0x00ca }
            r0.<init>(r4)     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = r0.toAPIString()     // Catch:{ all -> 0x00ca }
            r1.onResponse(r0)     // Catch:{ all -> 0x00ca }
        L_0x013a:
            if (r3 == 0) goto L_0x013d
            goto L_0x0102
        L_0x013d:
            monitor-exit(r2)
            return
        L_0x013f:
            if (r3 == 0) goto L_0x0144
            r3.close()     // Catch:{ all -> 0x0145 }
        L_0x0144:
            throw r0     // Catch:{ all -> 0x0145 }
        L_0x0145:
            r0 = move-exception
            monitor-exit(r2)
            goto L_0x0149
        L_0x0148:
            throw r0
        L_0x0149:
            goto L_0x0148
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.miio.MiioLocalAPI.rpc(java.lang.String, java.lang.String, long, java.lang.String, int, com.xiaomi.miio.MiioLocalRpcResponse):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
        r9 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005f, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0063, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0071, code lost:
        if (r1 != null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009f, code lost:
        r14.onResponse(new com.xiaomi.miio.MiioLocalRpcResult(com.xiaomi.miio.MiioLocalErrorCode.EXCEPTION).toAPIString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e4, code lost:
        if (r1 == null) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005e A[ExcHandler: all (th java.lang.Throwable), Splitter:B:8:0x0010] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062 A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:8:0x0010] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009f A[Catch:{ SocketTimeoutException -> 0x00b0, Exception -> 0x0079, all -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00af A[Catch:{ SocketTimeoutException -> 0x00b0, Exception -> 0x0079, all -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d6 A[Catch:{ SocketTimeoutException -> 0x00b0, Exception -> 0x0079, all -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00eb A[SYNTHETIC, Splitter:B:52:0x00eb] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void rpc(java.lang.String r9, java.lang.String r10, long r11, java.lang.String r13, com.xiaomi.miio.MiioLocalRpcResponse r14) {
        /*
            java.lang.Class<com.xiaomi.miio.MiioLocalAPI> r0 = com.xiaomi.miio.MiioLocalAPI.class
            monitor-enter(r0)
            r1 = 0
            int r2 = com.xiaomi.miio.MiioTimestampCache.getTs(r11)     // Catch:{ SocketTimeoutException -> 0x00b0, Exception -> 0x0079 }
            if (r2 >= 0) goto L_0x0068
            java.net.DatagramSocket r2 = new java.net.DatagramSocket     // Catch:{ SocketTimeoutException -> 0x00b0, Exception -> 0x0079 }
            r2.<init>()     // Catch:{ SocketTimeoutException -> 0x00b0, Exception -> 0x0079 }
            r1 = 1
            r2.setReuseAddress(r1)     // Catch:{ SocketTimeoutException -> 0x0065, Exception -> 0x0062, all -> 0x005e }
            com.xiaomi.miio.JNIBridge$MiioMsg r1 = new com.xiaomi.miio.JNIBridge$MiioMsg     // Catch:{ SocketTimeoutException -> 0x0065, Exception -> 0x0062, all -> 0x005e }
            r4 = -1
            r6 = -1
            byte[] r7 = FULL_TOKEN     // Catch:{ SocketTimeoutException -> 0x0065, Exception -> 0x0062, all -> 0x005e }
            r8 = 0
            r3 = r1
            r3.<init>(r4, r6, r7, r8)     // Catch:{ SocketTimeoutException -> 0x0065, Exception -> 0x0062, all -> 0x005e }
            byte[] r1 = com.xiaomi.miio.JNIBridge.hencrypt(r1)     // Catch:{ SocketTimeoutException -> 0x0065, Exception -> 0x0062, all -> 0x005e }
            r3 = 65535(0xffff, float:9.1834E-41)
            byte[] r3 = new byte[r3]     // Catch:{ SocketTimeoutException -> 0x0065, Exception -> 0x0062, all -> 0x005e }
            r4 = 0
        L_0x0029:
            r5 = 3
            if (r4 >= r5) goto L_0x0052
            java.net.InetAddress r5 = java.net.InetAddress.getByName(r9)     // Catch:{ SocketTimeoutException -> 0x0039, Exception -> 0x0062, all -> 0x005e }
            udp_send(r2, r5, r1)     // Catch:{ SocketTimeoutException -> 0x0039, Exception -> 0x0062, all -> 0x005e }
            r5 = 2000(0x7d0, float:2.803E-42)
            udp_receive(r2, r3, r5)     // Catch:{ SocketTimeoutException -> 0x0039, Exception -> 0x0062, all -> 0x005e }
            goto L_0x0052
        L_0x0039:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0065, Exception -> 0x0062, all -> 0x005e }
            r6.<init>()     // Catch:{ SocketTimeoutException -> 0x0065, Exception -> 0x0062, all -> 0x005e }
            java.lang.String r7 = "rpc timestamp time out, retry "
            r6.append(r7)     // Catch:{ SocketTimeoutException -> 0x0065, Exception -> 0x0062, all -> 0x005e }
            int r7 = r4 + 1
            r6.append(r7)     // Catch:{ SocketTimeoutException -> 0x0065, Exception -> 0x0062, all -> 0x005e }
            r6.toString()     // Catch:{ SocketTimeoutException -> 0x0065, Exception -> 0x0062, all -> 0x005e }
            r6 = 2
            if (r4 == r6) goto L_0x0051
            r4 = r7
            goto L_0x0029
        L_0x0051:
            throw r5     // Catch:{ SocketTimeoutException -> 0x0065, Exception -> 0x0062, all -> 0x005e }
        L_0x0052:
            com.xiaomi.miio.JNIBridge$MiioMsg r1 = com.xiaomi.miio.JNIBridge.hdecrypt(r3)     // Catch:{ SocketTimeoutException -> 0x0065, Exception -> 0x0062, all -> 0x005e }
            int r1 = r1.stamp     // Catch:{ SocketTimeoutException -> 0x0065, Exception -> 0x0062, all -> 0x005e }
            com.xiaomi.miio.MiioTimestampCache.updateTs(r11, r1)     // Catch:{ SocketTimeoutException -> 0x0065, Exception -> 0x0062, all -> 0x005e }
            r7 = r1
            r1 = r2
            goto L_0x0069
        L_0x005e:
            r9 = move-exception
            r1 = r2
            goto L_0x00e9
        L_0x0062:
            r9 = move-exception
            r1 = r2
            goto L_0x007a
        L_0x0065:
            r9 = move-exception
            r1 = r2
            goto L_0x00b1
        L_0x0068:
            r7 = r2
        L_0x0069:
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r13
            r8 = r14
            rpc(r2, r3, r4, r6, r7, r8)     // Catch:{ SocketTimeoutException -> 0x00b0, Exception -> 0x0079 }
            if (r1 == 0) goto L_0x00e7
        L_0x0073:
            r1.close()     // Catch:{ all -> 0x00ef }
            goto L_0x00e7
        L_0x0077:
            r9 = move-exception
            goto L_0x00e9
        L_0x0079:
            r9 = move-exception
        L_0x007a:
            java.io.StringWriter r10 = new java.io.StringWriter     // Catch:{ all -> 0x0077 }
            r10.<init>()     // Catch:{ all -> 0x0077 }
            java.io.PrintWriter r11 = new java.io.PrintWriter     // Catch:{ all -> 0x0077 }
            r11.<init>(r10)     // Catch:{ all -> 0x0077 }
            r9.printStackTrace(r11)     // Catch:{ all -> 0x0077 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0077 }
            r11.<init>()     // Catch:{ all -> 0x0077 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0077 }
            r11.append(r9)     // Catch:{ all -> 0x0077 }
            java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x0077 }
            r11.append(r9)     // Catch:{ all -> 0x0077 }
            r11.toString()     // Catch:{ all -> 0x0077 }
            if (r14 == 0) goto L_0x00ad
            com.xiaomi.miio.MiioLocalRpcResult r9 = new com.xiaomi.miio.MiioLocalRpcResult     // Catch:{ all -> 0x0077 }
            com.xiaomi.miio.MiioLocalErrorCode r10 = com.xiaomi.miio.MiioLocalErrorCode.EXCEPTION     // Catch:{ all -> 0x0077 }
            r9.<init>(r10)     // Catch:{ all -> 0x0077 }
            java.lang.String r9 = r9.toAPIString()     // Catch:{ all -> 0x0077 }
            r14.onResponse(r9)     // Catch:{ all -> 0x0077 }
        L_0x00ad:
            if (r1 == 0) goto L_0x00e7
            goto L_0x0073
        L_0x00b0:
            r9 = move-exception
        L_0x00b1:
            java.io.StringWriter r10 = new java.io.StringWriter     // Catch:{ all -> 0x0077 }
            r10.<init>()     // Catch:{ all -> 0x0077 }
            java.io.PrintWriter r11 = new java.io.PrintWriter     // Catch:{ all -> 0x0077 }
            r11.<init>(r10)     // Catch:{ all -> 0x0077 }
            r9.printStackTrace(r11)     // Catch:{ all -> 0x0077 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0077 }
            r11.<init>()     // Catch:{ all -> 0x0077 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0077 }
            r11.append(r9)     // Catch:{ all -> 0x0077 }
            java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x0077 }
            r11.append(r9)     // Catch:{ all -> 0x0077 }
            r11.toString()     // Catch:{ all -> 0x0077 }
            if (r14 == 0) goto L_0x00e4
            com.xiaomi.miio.MiioLocalRpcResult r9 = new com.xiaomi.miio.MiioLocalRpcResult     // Catch:{ all -> 0x0077 }
            com.xiaomi.miio.MiioLocalErrorCode r10 = com.xiaomi.miio.MiioLocalErrorCode.TIMEOUT     // Catch:{ all -> 0x0077 }
            r9.<init>(r10)     // Catch:{ all -> 0x0077 }
            java.lang.String r9 = r9.toAPIString()     // Catch:{ all -> 0x0077 }
            r14.onResponse(r9)     // Catch:{ all -> 0x0077 }
        L_0x00e4:
            if (r1 == 0) goto L_0x00e7
            goto L_0x0073
        L_0x00e7:
            monitor-exit(r0)
            return
        L_0x00e9:
            if (r1 == 0) goto L_0x00ee
            r1.close()     // Catch:{ all -> 0x00ef }
        L_0x00ee:
            throw r9     // Catch:{ all -> 0x00ef }
        L_0x00ef:
            r9 = move-exception
            monitor-exit(r0)
            goto L_0x00f3
        L_0x00f2:
            throw r9
        L_0x00f3:
            goto L_0x00f2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.miio.MiioLocalAPI.rpc(java.lang.String, java.lang.String, long, java.lang.String, com.xiaomi.miio.MiioLocalRpcResponse):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        r10 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006b, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0098, code lost:
        r12.onResponse(new com.xiaomi.miio.MiioLocalRpcResult(com.xiaomi.miio.MiioLocalErrorCode.EXCEPTION).toAPIString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a6, code lost:
        if (r1 == null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e0, code lost:
        if (r1 == null) goto L_0x00e3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0066 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:6:0x000a] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006a A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:6:0x000a] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0098 A[Catch:{ all -> 0x0070 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d2 A[Catch:{ all -> 0x0070 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e7 A[SYNTHETIC, Splitter:B:46:0x00e7] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:30:0x0073=Splitter:B:30:0x0073, B:38:0x00ad=Splitter:B:38:0x00ad} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void rpc(java.lang.String r10, java.lang.String r11, com.xiaomi.miio.MiioLocalRpcResponse r12) {
        /*
            java.lang.Class<com.xiaomi.miio.MiioLocalAPI> r0 = com.xiaomi.miio.MiioLocalAPI.class
            monitor-enter(r0)
            r1 = 0
            java.net.DatagramSocket r2 = new java.net.DatagramSocket     // Catch:{ SocketTimeoutException -> 0x00ac, Exception -> 0x0072 }
            r2.<init>()     // Catch:{ SocketTimeoutException -> 0x00ac, Exception -> 0x0072 }
            r1 = 1
            r2.setReuseAddress(r1)     // Catch:{ SocketTimeoutException -> 0x006d, Exception -> 0x006a, all -> 0x0066 }
            com.xiaomi.miio.JNIBridge$MiioMsg r1 = new com.xiaomi.miio.JNIBridge$MiioMsg     // Catch:{ SocketTimeoutException -> 0x006d, Exception -> 0x006a, all -> 0x0066 }
            r4 = -1
            r6 = -1
            byte[] r7 = FULL_TOKEN     // Catch:{ SocketTimeoutException -> 0x006d, Exception -> 0x006a, all -> 0x0066 }
            r8 = 0
            r3 = r1
            r3.<init>(r4, r6, r7, r8)     // Catch:{ SocketTimeoutException -> 0x006d, Exception -> 0x006a, all -> 0x0066 }
            byte[] r1 = com.xiaomi.miio.JNIBridge.hencrypt(r1)     // Catch:{ SocketTimeoutException -> 0x006d, Exception -> 0x006a, all -> 0x0066 }
            r3 = 65535(0xffff, float:9.1834E-41)
            byte[] r3 = new byte[r3]     // Catch:{ SocketTimeoutException -> 0x006d, Exception -> 0x006a, all -> 0x0066 }
            r4 = 0
        L_0x0023:
            r5 = 3
            if (r4 >= r5) goto L_0x004c
            java.net.InetAddress r5 = java.net.InetAddress.getByName(r10)     // Catch:{ SocketTimeoutException -> 0x0033, Exception -> 0x006a, all -> 0x0066 }
            udp_send(r2, r5, r1)     // Catch:{ SocketTimeoutException -> 0x0033, Exception -> 0x006a, all -> 0x0066 }
            r5 = 2000(0x7d0, float:2.803E-42)
            udp_receive(r2, r3, r5)     // Catch:{ SocketTimeoutException -> 0x0033, Exception -> 0x006a, all -> 0x0066 }
            goto L_0x004c
        L_0x0033:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x006d, Exception -> 0x006a, all -> 0x0066 }
            r6.<init>()     // Catch:{ SocketTimeoutException -> 0x006d, Exception -> 0x006a, all -> 0x0066 }
            java.lang.String r7 = "rpc timestamp time out, retry "
            r6.append(r7)     // Catch:{ SocketTimeoutException -> 0x006d, Exception -> 0x006a, all -> 0x0066 }
            int r7 = r4 + 1
            r6.append(r7)     // Catch:{ SocketTimeoutException -> 0x006d, Exception -> 0x006a, all -> 0x0066 }
            r6.toString()     // Catch:{ SocketTimeoutException -> 0x006d, Exception -> 0x006a, all -> 0x0066 }
            r6 = 2
            if (r4 == r6) goto L_0x004b
            r4 = r7
            goto L_0x0023
        L_0x004b:
            throw r5     // Catch:{ SocketTimeoutException -> 0x006d, Exception -> 0x006a, all -> 0x0066 }
        L_0x004c:
            com.xiaomi.miio.JNIBridge$MiioMsg r1 = com.xiaomi.miio.JNIBridge.hdecrypt(r3)     // Catch:{ SocketTimeoutException -> 0x006d, Exception -> 0x006a, all -> 0x0066 }
            long r5 = r1.did     // Catch:{ SocketTimeoutException -> 0x006d, Exception -> 0x006a, all -> 0x0066 }
            java.lang.String r7 = new java.lang.String     // Catch:{ SocketTimeoutException -> 0x006d, Exception -> 0x006a, all -> 0x0066 }
            byte[] r3 = r1.token     // Catch:{ SocketTimeoutException -> 0x006d, Exception -> 0x006a, all -> 0x0066 }
            r7.<init>(r3)     // Catch:{ SocketTimeoutException -> 0x006d, Exception -> 0x006a, all -> 0x0066 }
            int r8 = r1.stamp     // Catch:{ SocketTimeoutException -> 0x006d, Exception -> 0x006a, all -> 0x0066 }
            r3 = r10
            r4 = r11
            r9 = r12
            rpc(r3, r4, r5, r7, r8, r9)     // Catch:{ SocketTimeoutException -> 0x006d, Exception -> 0x006a, all -> 0x0066 }
            r2.close()     // Catch:{ all -> 0x00eb }
            goto L_0x00e3
        L_0x0066:
            r10 = move-exception
            r1 = r2
            goto L_0x00e5
        L_0x006a:
            r10 = move-exception
            r1 = r2
            goto L_0x0073
        L_0x006d:
            r10 = move-exception
            r1 = r2
            goto L_0x00ad
        L_0x0070:
            r10 = move-exception
            goto L_0x00e5
        L_0x0072:
            r10 = move-exception
        L_0x0073:
            java.io.StringWriter r11 = new java.io.StringWriter     // Catch:{ all -> 0x0070 }
            r11.<init>()     // Catch:{ all -> 0x0070 }
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch:{ all -> 0x0070 }
            r2.<init>(r11)     // Catch:{ all -> 0x0070 }
            r10.printStackTrace(r2)     // Catch:{ all -> 0x0070 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0070 }
            r2.<init>()     // Catch:{ all -> 0x0070 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0070 }
            r2.append(r10)     // Catch:{ all -> 0x0070 }
            java.lang.String r10 = r11.toString()     // Catch:{ all -> 0x0070 }
            r2.append(r10)     // Catch:{ all -> 0x0070 }
            r2.toString()     // Catch:{ all -> 0x0070 }
            if (r12 == 0) goto L_0x00a6
            com.xiaomi.miio.MiioLocalRpcResult r10 = new com.xiaomi.miio.MiioLocalRpcResult     // Catch:{ all -> 0x0070 }
            com.xiaomi.miio.MiioLocalErrorCode r11 = com.xiaomi.miio.MiioLocalErrorCode.EXCEPTION     // Catch:{ all -> 0x0070 }
            r10.<init>(r11)     // Catch:{ all -> 0x0070 }
            java.lang.String r10 = r10.toAPIString()     // Catch:{ all -> 0x0070 }
            r12.onResponse(r10)     // Catch:{ all -> 0x0070 }
        L_0x00a6:
            if (r1 == 0) goto L_0x00e3
        L_0x00a8:
            r1.close()     // Catch:{ all -> 0x00eb }
            goto L_0x00e3
        L_0x00ac:
            r10 = move-exception
        L_0x00ad:
            java.io.StringWriter r11 = new java.io.StringWriter     // Catch:{ all -> 0x0070 }
            r11.<init>()     // Catch:{ all -> 0x0070 }
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch:{ all -> 0x0070 }
            r2.<init>(r11)     // Catch:{ all -> 0x0070 }
            r10.printStackTrace(r2)     // Catch:{ all -> 0x0070 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0070 }
            r2.<init>()     // Catch:{ all -> 0x0070 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0070 }
            r2.append(r10)     // Catch:{ all -> 0x0070 }
            java.lang.String r10 = r11.toString()     // Catch:{ all -> 0x0070 }
            r2.append(r10)     // Catch:{ all -> 0x0070 }
            r2.toString()     // Catch:{ all -> 0x0070 }
            if (r12 == 0) goto L_0x00e0
            com.xiaomi.miio.MiioLocalRpcResult r10 = new com.xiaomi.miio.MiioLocalRpcResult     // Catch:{ all -> 0x0070 }
            com.xiaomi.miio.MiioLocalErrorCode r11 = com.xiaomi.miio.MiioLocalErrorCode.TIMEOUT     // Catch:{ all -> 0x0070 }
            r10.<init>(r11)     // Catch:{ all -> 0x0070 }
            java.lang.String r10 = r10.toAPIString()     // Catch:{ all -> 0x0070 }
            r12.onResponse(r10)     // Catch:{ all -> 0x0070 }
        L_0x00e0:
            if (r1 == 0) goto L_0x00e3
            goto L_0x00a8
        L_0x00e3:
            monitor-exit(r0)
            return
        L_0x00e5:
            if (r1 == 0) goto L_0x00ea
            r1.close()     // Catch:{ all -> 0x00eb }
        L_0x00ea:
            throw r10     // Catch:{ all -> 0x00eb }
        L_0x00eb:
            r10 = move-exception
            monitor-exit(r0)
            goto L_0x00ef
        L_0x00ee:
            throw r10
        L_0x00ef:
            goto L_0x00ee
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.miio.MiioLocalAPI.rpc(java.lang.String, java.lang.String, com.xiaomi.miio.MiioLocalRpcResponse):void");
    }

    public static void set_device_local(String str) {
        if (str != null && str.length() == 2) {
            mDeviceLocal = str.toLowerCase();
        }
    }

    /* access modifiers changed from: private */
    public static void smart_config(String str, String str2, String str3, String str4, MiioLocalResponse miioLocalResponse) {
        do_smart_config(str, str2, str3, str4, (String) null, (String) null, System.currentTimeMillis(), 0, miioLocalResponse);
    }

    /* access modifiers changed from: private */
    public static void smart_config_mac(String str, String str2, String str3, String str4, String str5, MiioLocalResponse miioLocalResponse) {
        do_smart_config(str, str2, str3, str4, str5, (String) null, 0, 0, miioLocalResponse);
    }

    /* access modifiers changed from: private */
    public static void smart_config_mac_with_uid(String str, String str2, String str3, String str4, String str5, long j, MiioLocalResponse miioLocalResponse) {
        do_smart_config(str, str2, str3, str4, str5, (String) null, 0, j, miioLocalResponse);
    }

    /* access modifiers changed from: private */
    public static void smart_config_setupcode(String str, String str2, String str3, String str4, String str5, String str6, MiioLocalResponse miioLocalResponse) {
        do_smart_config(str, str2, str3, str4, str5, str6, 1, 0, miioLocalResponse);
    }

    /* access modifiers changed from: private */
    public static void smart_config_setupcode_with_uid(String str, String str2, String str3, String str4, String str5, String str6, long j, MiioLocalResponse miioLocalResponse) {
        do_smart_config(str, str2, str3, str4, str5, str6, 1, j, miioLocalResponse);
    }

    /* access modifiers changed from: private */
    public static void smart_config_with_uid(String str, String str2, String str3, String str4, long j, MiioLocalResponse miioLocalResponse) {
        do_smart_config(str, str2, str3, str4, (String) null, (String) null, System.currentTimeMillis(), j, miioLocalResponse);
    }

    public static void stop_smart_config() {
        mStopSmartConfig = true;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b A[Catch:{ all -> 0x0079 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void trigger(com.xiaomi.miio.MiioLocalResponse r8) {
        /*
            r0 = 0
            java.net.MulticastSocket r1 = new java.net.MulticastSocket     // Catch:{ Exception -> 0x0042, all -> 0x0040 }
            r1.<init>()     // Catch:{ Exception -> 0x0042, all -> 0x0040 }
            r0 = 0
            r2 = 0
        L_0x0008:
            int r3 = r2 + 1
            r4 = 30
            if (r2 >= r4) goto L_0x0030
            java.lang.String r2 = "224.126.%s.%s"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x002e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x002e }
            r4[r0] = r5     // Catch:{ Exception -> 0x002e }
            r5 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x002e }
            r4[r5] = r6     // Catch:{ Exception -> 0x002e }
            java.lang.String r2 = java.lang.String.format(r2, r4)     // Catch:{ Exception -> 0x002e }
            mc_send(r1, r2)     // Catch:{ Exception -> 0x002e }
            r4 = 10
            java.lang.Thread.sleep(r4)     // Catch:{ Exception -> 0x002e }
            r2 = r3
            goto L_0x0008
        L_0x002e:
            r0 = move-exception
            goto L_0x0046
        L_0x0030:
            if (r8 == 0) goto L_0x003c
            com.xiaomi.miio.MiioLocalResult r0 = new com.xiaomi.miio.MiioLocalResult     // Catch:{ Exception -> 0x002e }
            com.xiaomi.miio.MiioLocalErrorCode r2 = com.xiaomi.miio.MiioLocalErrorCode.SUCCESS     // Catch:{ Exception -> 0x002e }
            r0.<init>(r2)     // Catch:{ Exception -> 0x002e }
            r8.onResponse(r0)     // Catch:{ Exception -> 0x002e }
        L_0x003c:
            r1.close()
            goto L_0x0078
        L_0x0040:
            r8 = move-exception
            goto L_0x007b
        L_0x0042:
            r1 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
        L_0x0046:
            java.io.StringWriter r2 = new java.io.StringWriter     // Catch:{ all -> 0x0079 }
            r2.<init>()     // Catch:{ all -> 0x0079 }
            java.io.PrintWriter r3 = new java.io.PrintWriter     // Catch:{ all -> 0x0079 }
            r3.<init>(r2)     // Catch:{ all -> 0x0079 }
            r0.printStackTrace(r3)     // Catch:{ all -> 0x0079 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0079 }
            r3.<init>()     // Catch:{ all -> 0x0079 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0079 }
            r3.append(r0)     // Catch:{ all -> 0x0079 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0079 }
            r3.append(r0)     // Catch:{ all -> 0x0079 }
            r3.toString()     // Catch:{ all -> 0x0079 }
            if (r8 == 0) goto L_0x0075
            com.xiaomi.miio.MiioLocalResult r0 = new com.xiaomi.miio.MiioLocalResult     // Catch:{ all -> 0x0079 }
            com.xiaomi.miio.MiioLocalErrorCode r2 = com.xiaomi.miio.MiioLocalErrorCode.EXCEPTION     // Catch:{ all -> 0x0079 }
            r0.<init>(r2)     // Catch:{ all -> 0x0079 }
            r8.onResponse(r0)     // Catch:{ all -> 0x0079 }
        L_0x0075:
            if (r1 == 0) goto L_0x0078
            goto L_0x003c
        L_0x0078:
            return
        L_0x0079:
            r8 = move-exception
            r0 = r1
        L_0x007b:
            if (r0 == 0) goto L_0x0080
            r0.close()
        L_0x0080:
            goto L_0x0082
        L_0x0081:
            throw r8
        L_0x0082:
            goto L_0x0081
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.miio.MiioLocalAPI.trigger(com.xiaomi.miio.MiioLocalResponse):void");
    }

    private static String udp_receive(DatagramSocket datagramSocket, byte[] bArr, int i) {
        DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length);
        datagramSocket.setSoTimeout(i);
        datagramSocket.receive(datagramPacket);
        return datagramPacket.getAddress().getHostAddress();
    }

    private static void udp_send(DatagramSocket datagramSocket, InetAddress inetAddress, byte[] bArr) {
        datagramSocket.send(new DatagramPacket(bArr, bArr.length, inetAddress, 54321));
    }
}
