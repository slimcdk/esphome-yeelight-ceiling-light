package com.miot.service.connection.wifi;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.miot.service.common.crypto.rc4coder.Coder;
import com.miot.service.common.crypto.rc4coder.RC4DropCoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WifiAccount {
    private List<WifiItem> mItems = new ArrayList();
    private SharedPreferences mWifiAccount;

    public static class WifiItem {
        public String bssid;
        public String capabilities;
        public int networkId;
        public String passwd;
        public boolean save;
        public String ssid;

        public static WifiItem fromJson(JSONObject jSONObject, RC4DropCoder rC4DropCoder) {
            if (TextUtils.isEmpty(jSONObject.optString("password"))) {
                return null;
            }
            WifiItem wifiItem = new WifiItem();
            wifiItem.networkId = jSONObject.optInt("networkId");
            wifiItem.ssid = jSONObject.optString("ssid");
            wifiItem.passwd = TextUtils.isEmpty(jSONObject.optString("password")) ? "" : rC4DropCoder.decrypt(jSONObject.optString("password"));
            wifiItem.bssid = jSONObject.optString("bssid");
            wifiItem.capabilities = jSONObject.optString("capabilities");
            wifiItem.save = true;
            return wifiItem;
        }

        public static JSONObject toJson(WifiItem wifiItem, RC4DropCoder rC4DropCoder) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("networkId", wifiItem.networkId);
                jSONObject.put("ssid", wifiItem.ssid);
                jSONObject.put("password", TextUtils.isEmpty(wifiItem.passwd) ? "" : rC4DropCoder.encrypt(wifiItem.passwd));
                jSONObject.put("bssid", wifiItem.bssid);
                jSONObject.put("capabilities", wifiItem.capabilities);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
        }
    }

    public WifiAccount(Context context) {
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("wifi_account_setting", 0);
            this.mWifiAccount = sharedPreferences;
            String string = sharedPreferences.getString("wifi_accounts", (String) null);
            if (string != null) {
                setAccountsString(string);
            }
        }
    }

    public void clearAccount(String str) {
        for (WifiItem next : this.mItems) {
            if (next.bssid.equalsIgnoreCase(str)) {
                this.mItems.remove(next);
                return;
            }
        }
        saveAccountsString();
    }

    public WifiItem getAccount(String str) {
        for (WifiItem next : this.mItems) {
            String str2 = next.bssid;
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return next;
            }
        }
        return null;
    }

    public List<WifiItem> getAccounts() {
        return this.mItems;
    }

    public void saveAccount(WifiItem wifiItem) {
        for (WifiItem next : this.mItems) {
            if (next.bssid.equalsIgnoreCase(wifiItem.bssid)) {
                this.mItems.remove(next);
                this.mItems.add(wifiItem);
                return;
            }
        }
        this.mItems.add(wifiItem);
        saveAccountsString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void saveAccountsString() {
        /*
            r4 = this;
            com.miot.service.common.crypto.rc4coder.RC4DropCoder r0 = new com.miot.service.common.crypto.rc4coder.RC4DropCoder     // Catch:{ InvalidKeyException -> 0x001a, SecurityException -> 0x0015, NoSuchAlgorithmException -> 0x0010 }
            java.lang.String r1 = "com.xiaomi.smarthome"
            byte[] r1 = r1.getBytes()     // Catch:{ InvalidKeyException -> 0x001a, SecurityException -> 0x0015, NoSuchAlgorithmException -> 0x0010 }
            byte[] r1 = com.miot.service.common.crypto.rc4coder.Coder.sha256Hash(r1)     // Catch:{ InvalidKeyException -> 0x001a, SecurityException -> 0x0015, NoSuchAlgorithmException -> 0x0010 }
            r0.<init>((byte[]) r1)     // Catch:{ InvalidKeyException -> 0x001a, SecurityException -> 0x0015, NoSuchAlgorithmException -> 0x0010 }
            goto L_0x001f
        L_0x0010:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x001e
        L_0x0015:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x001e
        L_0x001a:
            r0 = move-exception
            r0.printStackTrace()
        L_0x001e:
            r0 = 0
        L_0x001f:
            if (r0 != 0) goto L_0x0022
            return
        L_0x0022:
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            r2 = 0
        L_0x0028:
            java.util.List<com.miot.service.connection.wifi.WifiAccount$WifiItem> r3 = r4.mItems
            int r3 = r3.size()
            if (r2 >= r3) goto L_0x004e
            java.util.List<com.miot.service.connection.wifi.WifiAccount$WifiItem> r3 = r4.mItems
            java.lang.Object r3 = r3.get(r2)
            com.miot.service.connection.wifi.WifiAccount$WifiItem r3 = (com.miot.service.connection.wifi.WifiAccount.WifiItem) r3
            boolean r3 = r3.save
            if (r3 == 0) goto L_0x004b
            java.util.List<com.miot.service.connection.wifi.WifiAccount$WifiItem> r3 = r4.mItems
            java.lang.Object r3 = r3.get(r2)
            com.miot.service.connection.wifi.WifiAccount$WifiItem r3 = (com.miot.service.connection.wifi.WifiAccount.WifiItem) r3
            org.json.JSONObject r3 = com.miot.service.connection.wifi.WifiAccount.WifiItem.toJson(r3, r0)
            r1.put(r3)
        L_0x004b:
            int r2 = r2 + 1
            goto L_0x0028
        L_0x004e:
            android.content.SharedPreferences r0 = r4.mWifiAccount
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "wifi_accounts"
            r0.putString(r2, r1)
            r0.apply()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.service.connection.wifi.WifiAccount.saveAccountsString():void");
    }

    public void setAccountsString(String str) {
        if (str != null) {
            this.mItems.clear();
            RC4DropCoder rC4DropCoder = null;
            try {
                rC4DropCoder = new RC4DropCoder(Coder.sha256Hash("com.xiaomi.smarthome".getBytes()));
            } catch (SecurityException | InvalidKeyException | NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
            if (rC4DropCoder != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        WifiItem fromJson = WifiItem.fromJson((JSONObject) jSONArray.get(i), rC4DropCoder);
                        if (fromJson != null) {
                            this.mItems.add(fromJson);
                        }
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
