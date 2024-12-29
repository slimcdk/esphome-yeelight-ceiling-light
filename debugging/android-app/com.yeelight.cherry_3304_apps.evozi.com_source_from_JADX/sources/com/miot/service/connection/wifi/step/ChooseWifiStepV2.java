package com.miot.service.connection.wifi.step;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.miot.bluetooth.BluetoothConstants;
import com.miot.service.C3602R;
import com.miot.service.common.manager.ServiceManager;
import com.miot.service.common.widget.CustomPullDownRefreshLinearLayout;
import com.miot.service.connection.wifi.AsyncTaskUtils;
import com.miot.service.connection.wifi.ConnectionUtils;
import com.miot.service.connection.wifi.SmartConfigDataProvider;
import com.miot.service.connection.wifi.WebShellActivity;
import com.miot.service.connection.wifi.WifiAccount;
import com.miot.service.connection.wifi.step.SmartConfigStep;
import com.miot.service.manager.discovery.impl.DeviceFactory;
import com.miot.service.view.MLAlertDialog;
import com.miot.service.view.TitleBarUtil;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ChooseWifiStepV2 extends SmartConfigStep {
    public static int SET_LOCATION_CODE = 200;
    /* access modifiers changed from: private */
    public boolean hasAutoRefresh = false;
    /* access modifiers changed from: private */
    public List<ConnectionUtils.KuailianScanResult> mAllScanResults = new ArrayList();
    TextView mCannotFindTips;
    View mChangePasswordView;
    /* access modifiers changed from: private */
    public ConnectionUtils.KuailianScanResult mChooseScanResult;
    /* access modifiers changed from: private */
    public ConnectionUtils.KuailianScanResult mCurrentEditWifi;
    View mDeleteWifiView;
    View mEditWifiViewRoot;
    View mEmptyView;
    /* access modifiers changed from: private */
    public boolean mIsScanning = false;
    private String mModel;
    Button mNextButton;
    /* access modifiers changed from: private */
    public View mOtherListHeader;
    ListView mOtherListView;
    /* access modifiers changed from: private */
    public BaseAdapter mOtherWifiAdapter = new BaseAdapter() {
        public int getCount() {
            return ChooseWifiStepV2.this.mAllScanResults.size() + ChooseWifiStepV2.this.mUnconnectResult.size();
        }

        public Object getItem(int i) {
            List access$1600;
            if (i < ChooseWifiStepV2.this.mAllScanResults.size()) {
                access$1600 = ChooseWifiStepV2.this.mAllScanResults;
            } else {
                access$1600 = ChooseWifiStepV2.this.mUnconnectResult;
                i -= ChooseWifiStepV2.this.mAllScanResults.size();
            }
            return access$1600.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View.OnClickListener onClickListener;
            View view2;
            if (view == null) {
                view = LayoutInflater.from(ChooseWifiStepV2.this.mContext).inflate(C3602R.layout.item_choose_other_wifi_step, viewGroup, false);
                ViewHolder viewHolder = new ViewHolder();
                viewHolder.itemView = view.findViewById(C3602R.C3604id.wifi_item);
                viewHolder.wifiName = (TextView) view.findViewById(C3602R.C3604id.wifi_name);
                viewHolder.wifiDes = (TextView) view.findViewById(C3602R.C3604id.wifi_des);
                viewHolder.rightImage = (ImageView) view.findViewById(C3602R.C3604id.wifi_signal);
                view.setTag(viewHolder);
            }
            ViewHolder viewHolder2 = (ViewHolder) view.getTag();
            final ConnectionUtils.KuailianScanResult kuailianScanResult = (ConnectionUtils.KuailianScanResult) (i < ChooseWifiStepV2.this.mAllScanResults.size() ? ChooseWifiStepV2.this.mAllScanResults.get(i) : ChooseWifiStepV2.this.mUnconnectResult.get(i - ChooseWifiStepV2.this.mAllScanResults.size()));
            viewHolder2.wifiName.setText(kuailianScanResult.scanResult.SSID);
            if (!TextUtils.isEmpty(kuailianScanResult.wifiDes)) {
                viewHolder2.wifiDes.setVisibility(0);
                viewHolder2.wifiDes.setText(kuailianScanResult.wifiDes);
            } else {
                viewHolder2.wifiDes.setVisibility(8);
            }
            if (i < ChooseWifiStepV2.this.mAllScanResults.size()) {
                viewHolder2.rightImage.setVisibility(0);
                viewHolder2.wifiName.setTextColor(ChooseWifiStepV2.this.mContext.getResources().getColor(C3602R.color.mj_color_black));
                viewHolder2.wifiDes.setTextColor(ChooseWifiStepV2.this.mContext.getResources().getColor(C3602R.color.mj_color_gray_lighter));
                viewHolder2.itemView.setEnabled(true);
                viewHolder2.rightImage.setImageResource(ConnectionUtils.getSignalLevel(ConnectionUtils.calculateSignalLevel(kuailianScanResult.scanResult.level, 100)));
                viewHolder2.itemView.setEnabled(true);
                view2 = viewHolder2.itemView;
                onClickListener = new View.OnClickListener() {
                    public void onClick(View view) {
                        if (ConnectionUtils.isContainUnsupportChar(kuailianScanResult.scanResult.SSID)) {
                            new MLAlertDialog.Builder(ChooseWifiStepV2.this.mContext).setTitle(C3602R.string.kuailian_contain_unsupport_char).setMessage(C3602R.string.kuailian_unsafe_wifi_content).setPositiveButton(C3602R.string.confirm_button, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    C37551 r2 = C37551.this;
                                    ChooseWifiStepV2.this.chooseWifi(kuailianScanResult);
                                    SmartConfigDataProvider.getInstance().set(SmartConfigDataProvider.KEY_SMART_CONFIG_MIUI_CLASS, (Object) null);
                                }
                            }).setNegativeButton(C3602R.string.cancel, (DialogInterface.OnClickListener) null).show();
                        } else {
                            ChooseWifiStepV2.this.chooseWifi(kuailianScanResult);
                        }
                    }
                };
            } else {
                viewHolder2.rightImage.setVisibility(8);
                viewHolder2.wifiName.setTextColor(ChooseWifiStepV2.this.mContext.getResources().getColor(C3602R.color.mj_color_wifi_name_disable_text_color));
                viewHolder2.wifiDes.setTextColor(ChooseWifiStepV2.this.mContext.getResources().getColor(C3602R.color.mj_color_wifi_name_disable_text_color));
                view2 = viewHolder2.itemView;
                onClickListener = new View.OnClickListener() {
                    public void onClick(View view) {
                        MLAlertDialog.Builder builder;
                        MLAlertDialog.Builder builder2;
                        DialogInterface.OnClickListener onClickListener;
                        int i;
                        if ((kuailianScanResult.scanResult.frequency <= 5000 || ChooseWifiStepV2.this.mSupport5G) && !kuailianScanResult.scanResult.capabilities.contains("WEP") && !kuailianScanResult.scanResult.capabilities.contains("EAP") && !kuailianScanResult.scanResult.capabilities.contains("WAPI-KEY") && !kuailianScanResult.scanResult.capabilities.contains("WAPI-PSK") && !kuailianScanResult.scanResult.capabilities.contains("WAPI-CERT")) {
                            ScanResult scanResult = kuailianScanResult.scanResult;
                            if (scanResult.level != 0) {
                                if (ConnectionUtils.getSecurity(scanResult) == 0) {
                                    builder2 = new MLAlertDialog.Builder(ChooseWifiStepV2.this.mContext).setTitle(C3602R.string.kuailian_unsafe_wifi).setMessage(C3602R.string.kuailian_unsafe_wifi_no_password);
                                    i = C3602R.string.confirm_button;
                                    onClickListener = new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialogInterface, int i) {
                                            C37572 r2 = C37572.this;
                                            ChooseWifiStepV2.this.saveWifiItem(kuailianScanResult, "");
                                            if (!ChooseWifiStepV2.this.mSavedScanResults.contains(kuailianScanResult)) {
                                                C37572 r22 = C37572.this;
                                                ConnectionUtils.KuailianScanResult unused = ChooseWifiStepV2.this.mChooseScanResult = kuailianScanResult;
                                                ChooseWifiStepV2.this.mSavedScanResults.add(0, kuailianScanResult);
                                                if (!ChooseWifiStepV2.this.mAllScanResults.contains(kuailianScanResult)) {
                                                    ChooseWifiStepV2.this.mAllScanResults.add(kuailianScanResult);
                                                }
                                                if (ChooseWifiStepV2.this.mUnconnectResult.contains(kuailianScanResult)) {
                                                    ChooseWifiStepV2.this.mUnconnectResult.remove(kuailianScanResult);
                                                }
                                                ChooseWifiStepV2 chooseWifiStepV2 = ChooseWifiStepV2.this;
                                                chooseWifiStepV2.sortWifi(chooseWifiStepV2.mAllScanResults);
                                                ChooseWifiStepV2.this.mOtherWifiAdapter.notifyDataSetChanged();
                                                ChooseWifiStepV2.this.mSavedWifiAdapter.notifyDataSetChanged();
                                            }
                                            ChooseWifiStepV2.this.enterSavedWifiView();
                                            SmartConfigDataProvider.getInstance().set(SmartConfigDataProvider.KEY_SMART_CONFIG_MIUI_CLASS, (Object) null);
                                        }
                                    };
                                } else {
                                    builder2 = new MLAlertDialog.Builder(ChooseWifiStepV2.this.mContext).setTitle(C3602R.string.kuailian_unsafe_wifi).setMessage(C3602R.string.kuailian_unsafe_wifi_content_1);
                                    i = C3602R.string.confirm_button;
                                    onClickListener = new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialogInterface, int i) {
                                            C37572 r2 = C37572.this;
                                            ChooseWifiStepV2.this.chooseWifi(kuailianScanResult);
                                            SmartConfigDataProvider.getInstance().set(SmartConfigDataProvider.KEY_SMART_CONFIG_MIUI_CLASS, (Object) null);
                                        }
                                    };
                                }
                                builder = builder2.setPositiveButton(i, onClickListener).setNegativeButton(C3602R.string.cancel, (DialogInterface.OnClickListener) null);
                                builder.show();
                            }
                        }
                        builder = new MLAlertDialog.Builder(ChooseWifiStepV2.this.mContext).setMessage(C3602R.string.kuailian_unconn_reason).setPositiveButton(C3602R.string.confirm_button, (DialogInterface.OnClickListener) null);
                        builder.show();
                    }
                };
            }
            view2.setOnClickListener(onClickListener);
            return view;
        }
    };
    /* access modifiers changed from: private */
    public ConnectionUtils.KuailianScanResult mPhoneWifiInfo;
    View mReturnBt;
    View mSaveWifiViewRoot;
    /* access modifiers changed from: private */
    public View mSavedListHeader;
    ListView mSavedListView;
    /* access modifiers changed from: private */
    public List<ConnectionUtils.KuailianScanResult> mSavedScanResults = new ArrayList();
    /* access modifiers changed from: private */
    public List<ConnectionUtils.KuailianScanResult> mSavedUnconnectResult = new ArrayList();
    /* access modifiers changed from: private */
    public BaseAdapter mSavedWifiAdapter = new BaseAdapter() {
        public int getCount() {
            return ChooseWifiStepV2.this.mSavedScanResults.size() + ChooseWifiStepV2.this.mSavedUnconnectResult.size();
        }

        public Object getItem(int i) {
            List access$1800;
            if (i < ChooseWifiStepV2.this.mSavedScanResults.size()) {
                access$1800 = ChooseWifiStepV2.this.mSavedScanResults;
            } else {
                access$1800 = ChooseWifiStepV2.this.mSavedUnconnectResult;
                i -= ChooseWifiStepV2.this.mSavedScanResults.size();
            }
            return access$1800.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = LayoutInflater.from(ChooseWifiStepV2.this.mContext).inflate(C3602R.layout.item_choose_wifi_step, viewGroup, false);
                ViewHolder viewHolder = new ViewHolder();
                viewHolder.itemView = view.findViewById(C3602R.C3604id.wifi_item);
                viewHolder.wifiName = (TextView) view.findViewById(C3602R.C3604id.wifi_name);
                viewHolder.wifiDes = (TextView) view.findViewById(C3602R.C3604id.wifi_des);
                viewHolder.leftImage = (ImageView) view.findViewById(C3602R.C3604id.wifi_pointer);
                viewHolder.rightImage = (ImageView) view.findViewById(C3602R.C3604id.edit_wifi);
                view.setTag(viewHolder);
            }
            ViewHolder viewHolder2 = (ViewHolder) view.getTag();
            final ConnectionUtils.KuailianScanResult kuailianScanResult = (ConnectionUtils.KuailianScanResult) (i < ChooseWifiStepV2.this.mSavedScanResults.size() ? ChooseWifiStepV2.this.mSavedScanResults.get(i) : ChooseWifiStepV2.this.mSavedUnconnectResult.get(i - ChooseWifiStepV2.this.mSavedScanResults.size()));
            if (kuailianScanResult.isSavePasswd) {
                if (!TextUtils.isEmpty(kuailianScanResult.wifiDes)) {
                    viewHolder2.wifiDes.setVisibility(0);
                    viewHolder2.wifiDes.setText(kuailianScanResult.wifiDes);
                    viewHolder2.wifiDes.setTextColor(viewGroup.getContext().getResources().getColor(C3602R.color.mj_color_gray_lighter));
                } else {
                    viewHolder2.wifiDes.setVisibility(8);
                }
                viewHolder2.wifiName.setText(kuailianScanResult.scanResult.SSID);
                if (i < ChooseWifiStepV2.this.mSavedScanResults.size()) {
                    viewHolder2.rightImage.setVisibility(0);
                    viewHolder2.wifiName.setTextColor(viewGroup.getContext().getResources().getColor(C3602R.color.mj_color_black));
                    viewHolder2.wifiDes.setTextColor(viewGroup.getContext().getResources().getColor(C3602R.color.mj_color_gray_lighter));
                    viewHolder2.itemView.setEnabled(true);
                    viewHolder2.wifiDes.setVisibility(8);
                    viewHolder2.rightImage.setImageResource(C3602R.C3603drawable.edit_wifi_icon);
                    viewHolder2.rightImage.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            ConnectionUtils.KuailianScanResult unused = ChooseWifiStepV2.this.mCurrentEditWifi = kuailianScanResult;
                            ChooseWifiStepV2.this.enterEditWifiView();
                        }
                    });
                    viewHolder2.itemView.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            ConnectionUtils.KuailianScanResult unused = ChooseWifiStepV2.this.mChooseScanResult = kuailianScanResult;
                            C374912.this.notifyDataSetChanged();
                        }
                    });
                    if (ConnectionUtils.calculateSignalLevel(kuailianScanResult.scanResult.level, 100) < 60) {
                        viewHolder2.wifiDes.setVisibility(0);
                        viewHolder2.wifiDes.setText(ChooseWifiStepV2.this.mContext.getString(C3602R.string.wifi_signal_weak));
                    }
                    if (ChooseWifiStepV2.this.mChooseScanResult == null || !kuailianScanResult.scanResult.BSSID.equalsIgnoreCase(ChooseWifiStepV2.this.mChooseScanResult.scanResult.BSSID)) {
                        viewHolder2.leftImage.setVisibility(8);
                    } else {
                        viewHolder2.wifiName.setTextColor(viewGroup.getContext().getResources().getColor(C3602R.color.mj_color_text_blue_bg));
                        viewHolder2.wifiDes.setTextColor(viewGroup.getContext().getResources().getColor(C3602R.color.mj_color_text_blue_bg));
                        viewHolder2.leftImage.setVisibility(0);
                    }
                } else {
                    viewHolder2.rightImage.setVisibility(8);
                    viewHolder2.leftImage.setVisibility(8);
                    viewHolder2.wifiName.setTextColor(ChooseWifiStepV2.this.mContext.getResources().getColor(C3602R.color.mj_color_wifi_name_disable_text_color));
                    viewHolder2.wifiDes.setTextColor(ChooseWifiStepV2.this.mContext.getResources().getColor(C3602R.color.mj_color_wifi_name_disable_text_color));
                    viewHolder2.itemView.setEnabled(false);
                }
            } else {
                viewHolder2.rightImage.setVisibility(0);
                viewHolder2.leftImage.setVisibility(8);
                viewHolder2.wifiName.setTextColor(viewGroup.getContext().getResources().getColor(C3602R.color.mj_color_black));
                viewHolder2.wifiDes.setTextColor(viewGroup.getContext().getResources().getColor(C3602R.color.mj_color_text_blue_bg));
                viewHolder2.itemView.setEnabled(true);
                viewHolder2.wifiName.setText(kuailianScanResult.scanResult.SSID);
                viewHolder2.wifiDes.setVisibility(0);
                viewHolder2.wifiDes.setText(ChooseWifiStepV2.this.mContext.getString(C3602R.string.click_input_password));
                viewHolder2.rightImage.setImageResource(ConnectionUtils.getSignalLevel(ConnectionUtils.calculateSignalLevel(kuailianScanResult.scanResult.level, 100)));
                viewHolder2.rightImage.setOnClickListener((View.OnClickListener) null);
                viewHolder2.itemView.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        ChooseWifiStepV2.this.showInputPasswordDialog(kuailianScanResult, false, new DialogListener() {
                            public void onClickListener(String str) {
                                ChooseWifiStepV2.this.mSavedScanResults.clear();
                                C37523 r0 = C37523.this;
                                ChooseWifiStepV2.this.saveWifiItem(kuailianScanResult, str);
                                C37523 r3 = C37523.this;
                                ConnectionUtils.KuailianScanResult unused = ChooseWifiStepV2.this.mChooseScanResult = kuailianScanResult;
                                ChooseWifiStepV2.this.mSavedScanResults.add(0, kuailianScanResult);
                                ChooseWifiStepV2 chooseWifiStepV2 = ChooseWifiStepV2.this;
                                chooseWifiStepV2.sortWifi(chooseWifiStepV2.mAllScanResults);
                                ChooseWifiStepV2.this.mOtherWifiAdapter.notifyDataSetChanged();
                                ChooseWifiStepV2.this.mSavedWifiAdapter.notifyDataSetChanged();
                                ChooseWifiStepV2.this.setNextButtonState();
                                ((TextView) ChooseWifiStepV2.this.mSavedListHeader.findViewById(C3602R.C3604id.list_title)).setText(ChooseWifiStepV2.this.mContext.getString(C3602R.string.kuailian_save_passwd));
                            }
                        });
                    }
                });
            }
            return view;
        }
    };
    CustomPullDownRefreshLinearLayout mScanResultListRoot;
    ScrollView mScrollWifiList;
    TextView mSubTitle;
    /* access modifiers changed from: private */
    public boolean mSupport5G = false;
    View mTitleBar;
    TextView mTitleTv;
    /* access modifiers changed from: private */
    public List<ConnectionUtils.KuailianScanResult> mUnconnectResult = new ArrayList();
    /* access modifiers changed from: private */
    public WifiManager mWifiManager;

    private interface DialogListener {
        void onClickListener(String str);
    }

    private static class ViewHolder {
        View itemView;
        ImageView leftImage;
        ImageView rightImage;
        TextView wifiDes;
        TextView wifiName;

        private ViewHolder() {
        }
    }

    private int checkPassword(String str) {
        try {
            if (ConnectionUtils.getSecurity(this.mChooseScanResult.scanResult) == 0) {
                return -1;
            }
            Class<?> cls = Class.forName("android.net.wifi.MiuiWifiManager");
            Method method = cls.getMethod("verifyPreSharedKey", new Class[]{WifiConfiguration.class, String.class});
            WifiConfiguration wifiConfiguration = null;
            String str2 = "\"" + this.mChooseScanResult.scanResult.SSID + "\"";
            for (WifiConfiguration next : this.mWifiManager.getConfiguredNetworks()) {
                if (next != null) {
                    if (!TextUtils.isEmpty(next.SSID)) {
                        if (next.SSID.equals(str2)) {
                            wifiConfiguration = next;
                        }
                    }
                }
            }
            if (wifiConfiguration == null) {
                return 1;
            }
            return ((Boolean) method.invoke(cls, new Object[]{wifiConfiguration, str})).booleanValue() ? 1 : 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* access modifiers changed from: private */
    public void chooseWifi(final ConnectionUtils.KuailianScanResult kuailianScanResult) {
        if (this.mSavedScanResults.contains(kuailianScanResult)) {
            this.mChooseScanResult = kuailianScanResult;
            this.mSavedWifiAdapter.notifyDataSetChanged();
            enterSavedWifiView();
            return;
        }
        showInputPasswordDialog(kuailianScanResult, false, new DialogListener() {
            public void onClickListener(String str) {
                ChooseWifiStepV2.this.saveWifiItem(kuailianScanResult, str);
                if (!ChooseWifiStepV2.this.mSavedScanResults.contains(kuailianScanResult)) {
                    ConnectionUtils.KuailianScanResult unused = ChooseWifiStepV2.this.mChooseScanResult = kuailianScanResult;
                    ChooseWifiStepV2.this.mSavedScanResults.add(0, kuailianScanResult);
                    if (!ChooseWifiStepV2.this.mAllScanResults.contains(kuailianScanResult)) {
                        ChooseWifiStepV2.this.mAllScanResults.add(kuailianScanResult);
                    }
                    if (ChooseWifiStepV2.this.mUnconnectResult.contains(kuailianScanResult)) {
                        ChooseWifiStepV2.this.mUnconnectResult.remove(kuailianScanResult);
                    }
                    ChooseWifiStepV2 chooseWifiStepV2 = ChooseWifiStepV2.this;
                    chooseWifiStepV2.sortWifi(chooseWifiStepV2.mAllScanResults);
                    ChooseWifiStepV2.this.mOtherWifiAdapter.notifyDataSetChanged();
                    ChooseWifiStepV2.this.mSavedWifiAdapter.notifyDataSetChanged();
                }
                ChooseWifiStepV2.this.enterSavedWifiView();
            }
        });
    }

    /* access modifiers changed from: private */
    public void deleteWifiItem(ConnectionUtils.KuailianScanResult kuailianScanResult) {
        kuailianScanResult.wifiDes = null;
        kuailianScanResult.isSavePasswd = false;
        ScanResult scanResult = kuailianScanResult.scanResult;
        if (ServiceManager.getInstance().getWifiAccount() != null) {
            ServiceManager.getInstance().getWifiAccount().clearAccount(scanResult.BSSID);
        }
    }

    /* access modifiers changed from: private */
    public void enterEditWifiView() {
        this.mScanResultListRoot.setVisibility(8);
        this.mSaveWifiViewRoot.setVisibility(8);
        this.mEditWifiViewRoot.setVisibility(0);
        this.mTitleTv.setText(C3602R.string.edit_choose_wifi_title);
        this.mSubTitle.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public void enterOtherWifiView() {
        if (!this.hasAutoRefresh) {
            this.hasAutoRefresh = true;
            this.mScanResultListRoot.doRefresh();
        }
        this.mSaveWifiViewRoot.setVisibility(8);
        this.mEditWifiViewRoot.setVisibility(8);
        this.mScanResultListRoot.setVisibility(0);
        this.mTitleTv.setText(C3602R.string.choose_other_wifi_title);
        this.mSubTitle.setVisibility(8);
        this.mOtherWifiAdapter.notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    public void enterSavedWifiView() {
        int i;
        Context context;
        TextView textView;
        ConnectionUtils.KuailianScanResult kuailianScanResult;
        this.mScanResultListRoot.setVisibility(8);
        this.mEditWifiViewRoot.setVisibility(8);
        this.mSaveWifiViewRoot.setVisibility(0);
        setNextButtonState();
        if (this.mSavedScanResults.size() > 0) {
            if (this.mChooseScanResult != null || this.mSavedScanResults.size() != 1 || (kuailianScanResult = this.mPhoneWifiInfo) == null || !kuailianScanResult.scanResult.BSSID.equalsIgnoreCase(this.mSavedScanResults.get(0).scanResult.BSSID)) {
                textView = (TextView) this.mSavedListHeader.findViewById(C3602R.C3604id.list_title);
                context = this.mContext;
                i = C3602R.string.kuailian_save_passwd;
            } else {
                textView = (TextView) this.mSavedListHeader.findViewById(C3602R.C3604id.list_title);
                context = this.mContext;
                i = C3602R.string.current_phone_wifi;
            }
            textView.setText(context.getString(i));
            this.mSavedListHeader.setVisibility(0);
        } else {
            this.mSavedListHeader.setVisibility(8);
        }
        this.mTitleTv.setText(C3602R.string.device_choose_wifi);
        String str = (String) SmartConfigDataProvider.getInstance().get(SmartConfigDataProvider.KEY_DEVICE_NAME);
        if (str == null || str.equals("")) {
            this.mSubTitle.setVisibility(8);
        } else {
            this.mSubTitle.setText(str);
        }
    }

    /* access modifiers changed from: private */
    public void goHelpPage() {
        Intent intent = new Intent(this.mContext, WebShellActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(WebShellActivity.ARGS_KEY_URL, "https://home.mi.com/views/faqDetail.html?question=" + this.mContext.getString(C3602R.string.param_question_choose_wifi_tips));
        intent.putExtras(bundle);
        this.mContext.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public void goNext(boolean z) {
        final ConnectionUtils.KuailianScanResult kuailianScanResult = this.mChooseScanResult;
        if (kuailianScanResult != null && kuailianScanResult.scanResult != null) {
            SmartConfigDataProvider.getInstance().set(SmartConfigDataProvider.KEY_SELECTED_AP, kuailianScanResult.scanResult);
            SmartConfigDataProvider.getInstance().set(SmartConfigDataProvider.KEY_SELECTED_AP_SSID, kuailianScanResult.scanResult.SSID);
            WifiAccount.WifiItem wifiItem = null;
            if (ServiceManager.getInstance().getWifiAccount() != null) {
                wifiItem = ServiceManager.getInstance().getWifiAccount().getAccount(kuailianScanResult.scanResult.BSSID);
            }
            if (wifiItem != null) {
                int checkPassword = checkPassword(wifiItem.passwd);
                if (checkPassword != -1) {
                    if (checkPassword == 0) {
                        showInputPasswordDialog(kuailianScanResult, true, new DialogListener() {
                            public void onClickListener(String str) {
                                ChooseWifiStepV2.this.saveWifiItem(kuailianScanResult, str);
                                SmartConfigDataProvider.getInstance().set(SmartConfigDataProvider.KEY_SELECTED_AP_PASSWD, str);
                                ChooseWifiStepV2.this.finishCurrentStep();
                            }
                        });
                        return;
                    } else if (checkPassword != 1) {
                        return;
                    }
                } else if (z) {
                    return;
                }
                SmartConfigDataProvider.getInstance().set(SmartConfigDataProvider.KEY_SELECTED_AP_PASSWD, wifiItem.passwd);
                finishCurrentStep();
            }
        }
    }

    /* access modifiers changed from: private */
    public boolean isDeviceSupport(ScanResult scanResult) {
        return (scanResult.frequency <= 5000 || this.mSupport5G) && !scanResult.capabilities.contains("WEP") && !scanResult.capabilities.contains("EAP") && !scanResult.capabilities.contains("WAPI-KEY") && !scanResult.capabilities.contains("WAPI-PSK") && !scanResult.capabilities.contains("WAPI-CERT") && ConnectionUtils.getSecurity(scanResult) != 0 && scanResult.level != 0;
    }

    private void restartScanWifi() {
        this.mWifiManager.startScan();
        this.mIsScanning = true;
    }

    /* access modifiers changed from: private */
    public void saveWifiItem(ConnectionUtils.KuailianScanResult kuailianScanResult, String str) {
        Context context = this.mContext;
        if (context != null) {
            kuailianScanResult.isSavePasswd = true;
            kuailianScanResult.wifiDes = context.getString(C3602R.string.kuailian_save_passwd);
            ScanResult scanResult = kuailianScanResult.scanResult;
            WifiAccount.WifiItem wifiItem = new WifiAccount.WifiItem();
            String str2 = scanResult.BSSID;
            wifiItem.bssid = str2;
            if (str2 == null) {
                wifiItem.bssid = "";
            }
            wifiItem.ssid = scanResult.SSID;
            wifiItem.capabilities = scanResult.capabilities;
            wifiItem.passwd = str;
            wifiItem.save = true;
            wifiItem.networkId = this.mWifiManager.getConnectionInfo().getNetworkId();
            if (ServiceManager.getInstance().getWifiAccount() != null) {
                ServiceManager.getInstance().getWifiAccount().saveAccount(wifiItem);
            }
        }
    }

    /* access modifiers changed from: private */
    public void setNextButtonState() {
        int i;
        Resources resources;
        Button button;
        if (this.mChooseScanResult != null) {
            this.mNextButton.setEnabled(true);
            button = this.mNextButton;
            resources = this.mContext.getResources();
            i = C3602R.color.mj_color_white_100_transparent;
        } else {
            this.mNextButton.setEnabled(false);
            button = this.mNextButton;
            resources = this.mContext.getResources();
            i = C3602R.color.mj_color_gray_lighter;
        }
        button.setTextColor(resources.getColor(i));
    }

    /* access modifiers changed from: private */
    @TargetApi(23)
    public void showDeletePasswdDialog() {
        Context context = this.mContext;
        if (context != null && this.mCurrentEditWifi != null) {
            new MLAlertDialog.Builder(context).setMessage((CharSequence) this.mContext.getResources().getString(C3602R.string.sure_delete_wifi)).setPositiveButton(C3602R.string.confirm, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    ConnectionUtils.KuailianScanResult kuailianScanResult;
                    ChooseWifiStepV2 chooseWifiStepV2;
                    if (ChooseWifiStepV2.this.mSavedScanResults.contains(ChooseWifiStepV2.this.mCurrentEditWifi)) {
                        ChooseWifiStepV2.this.mSavedScanResults.remove(ChooseWifiStepV2.this.mCurrentEditWifi);
                        ChooseWifiStepV2 chooseWifiStepV22 = ChooseWifiStepV2.this;
                        chooseWifiStepV22.deleteWifiItem(chooseWifiStepV22.mCurrentEditWifi);
                        if (ChooseWifiStepV2.this.mChooseScanResult != null && ChooseWifiStepV2.this.mCurrentEditWifi.scanResult.BSSID.equalsIgnoreCase(ChooseWifiStepV2.this.mChooseScanResult.scanResult.BSSID)) {
                            if (ChooseWifiStepV2.this.mSavedScanResults.size() > 0) {
                                chooseWifiStepV2 = ChooseWifiStepV2.this;
                                kuailianScanResult = (ConnectionUtils.KuailianScanResult) chooseWifiStepV2.mSavedScanResults.get(0);
                            } else {
                                kuailianScanResult = null;
                                if (ChooseWifiStepV2.this.mPhoneWifiInfo != null && (ChooseWifiStepV2.this.mSupport5G || ChooseWifiStepV2.this.mPhoneWifiInfo.scanResult.frequency <= 5000)) {
                                    ChooseWifiStepV2.this.mSavedScanResults.add(ChooseWifiStepV2.this.mPhoneWifiInfo);
                                }
                                chooseWifiStepV2 = ChooseWifiStepV2.this;
                            }
                            ConnectionUtils.KuailianScanResult unused = chooseWifiStepV2.mChooseScanResult = kuailianScanResult;
                        }
                        ChooseWifiStepV2 chooseWifiStepV23 = ChooseWifiStepV2.this;
                        chooseWifiStepV23.sortWifi(chooseWifiStepV23.mAllScanResults);
                        ChooseWifiStepV2.this.enterSavedWifiView();
                        ChooseWifiStepV2.this.mOtherWifiAdapter.notifyDataSetChanged();
                        ChooseWifiStepV2.this.mSavedWifiAdapter.notifyDataSetChanged();
                    }
                }
            }).setNegativeButton(C3602R.string.cancel, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }).setBtnTextColor(this.mContext.getResources().getColor(C3602R.color.mj_color_text_blue_bg), -1).create().show();
        }
    }

    /* access modifiers changed from: private */
    public void showInputPasswordDialog(ConnectionUtils.KuailianScanResult kuailianScanResult, boolean z, final DialogListener dialogListener) {
        if (kuailianScanResult != null && kuailianScanResult.scanResult != null) {
            View inflate = LayoutInflater.from(this.mContext).inflate(C3602R.layout.dialog_choose_wifi_input, this.mSavedListView, false);
            int i = 8;
            inflate.findViewById(C3602R.C3604id.input_again_root_view).setVisibility(z ? 0 : 8);
            View findViewById = inflate.findViewById(C3602R.C3604id.wifi_name);
            if (!z) {
                i = 0;
            }
            findViewById.setVisibility(i);
            ((TextView) inflate.findViewById(C3602R.C3604id.wifi_name)).setText(kuailianScanResult.scanResult.SSID);
            ((TextView) inflate.findViewById(C3602R.C3604id.input_again_wifi_name)).setText(kuailianScanResult.scanResult.SSID);
            CheckBox checkBox = (CheckBox) inflate.findViewById(C3602R.C3604id.change_password_state);
            final EditText editText = (EditText) inflate.findViewById(C3602R.C3604id.password_input_et);
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    editText.setInputType(z ? BluetoothConstants.MSG_READ_RSSI : 129);
                    EditText editText = editText;
                    editText.setSelection(editText.getText().toString().length());
                }
            });
            checkBox.setChecked(true);
            final Button button = (Button) inflate.findViewById(C3602R.C3604id.right_button);
            button.setEnabled(false);
            final MLAlertDialog create = new MLAlertDialog.Builder(this.mContext).setView(inflate).create();
            create.setCanceledOnTouchOutside(false);
            ((Button) inflate.findViewById(C3602R.C3604id.left_button)).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (create.isShowing()) {
                        create.dismiss();
                    }
                }
            });
            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    DialogListener dialogListener = dialogListener;
                    if (dialogListener != null) {
                        dialogListener.onClickListener(editText.getText().toString());
                    }
                    if (create.isShowing()) {
                        create.dismiss();
                    }
                }
            });
            if (!(ServiceManager.getInstance().getWifiAccount() == null || ServiceManager.getInstance().getWifiAccount().getAccount(kuailianScanResult.scanResult.BSSID) == null)) {
                checkBox.setChecked(false);
                editText.setText("");
                editText.setSelection(editText.getText().toString().length());
            }
            editText.addTextChangedListener(new TextWatcher() {
                public void afterTextChanged(Editable editable) {
                    Button button;
                    int i;
                    Resources resources;
                    if (ChooseWifiStepV2.this.mContext != null) {
                        if (TextUtils.isEmpty(editText.getText().toString().trim())) {
                            button.setEnabled(false);
                            button = button;
                            resources = ChooseWifiStepV2.this.mContext.getResources();
                            i = C3602R.color.mj_color_black_30_transparent;
                        } else {
                            button.setEnabled(true);
                            button = button;
                            resources = ChooseWifiStepV2.this.mContext.getResources();
                            i = C3602R.color.mj_color_text_blue_bg;
                        }
                        button.setTextColor(resources.getColor(i));
                    }
                }

                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }
            });
            create.show();
            inflate.postDelayed(new Runnable() {
                public void run() {
                    InputMethodManager inputMethodManager;
                    Context context = ChooseWifiStepV2.this.mContext;
                    if (context != null && (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) != null) {
                        inputMethodManager.showSoftInput(editText, 0);
                    }
                }
            }, 100);
        }
    }

    /* access modifiers changed from: private */
    public void sortWifi(List<ConnectionUtils.KuailianScanResult> list) {
        Collections.sort(list, new Comparator<ConnectionUtils.KuailianScanResult>() {
            public int compare(ConnectionUtils.KuailianScanResult kuailianScanResult, ConnectionUtils.KuailianScanResult kuailianScanResult2) {
                return ((!kuailianScanResult.isSavePasswd || !kuailianScanResult2.isSavePasswd) && (kuailianScanResult.isSavePasswd || kuailianScanResult2.isSavePasswd)) ? kuailianScanResult.isSavePasswd ? -1 : 1 : kuailianScanResult2.scanResult.level - kuailianScanResult.scanResult.level;
            }
        });
    }

    /* access modifiers changed from: package-private */
    public boolean checkWifiState() {
        int wifiState = this.mWifiManager.getWifiState();
        if (wifiState == 3) {
            this.mIsScanning = true;
            refreshInnerWifi();
        } else if ((wifiState == 4 || wifiState == 1) && wifiState == 1) {
            boolean wifiEnabled = this.mWifiManager.setWifiEnabled(true);
            if (wifiEnabled) {
                this.mIsScanning = true;
                refreshInnerWifi();
            } else {
                this.mCannotFindTips.setVisibility(0);
            }
            return wifiEnabled;
        }
        return true;
    }

    public SmartConfigStep.Step getStep() {
        return SmartConfigStep.Step.STEP_CHOOSE_WIFI;
    }

    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 100 || i == 104) {
            getHandler().removeMessages(100);
            getHandler().removeMessages(104);
            refreshInnerWifi();
        }
    }

    /* access modifiers changed from: protected */
    public void initView(View view) {
        this.mTitleBar = view.findViewById(C3602R.C3604id.title_bar);
        this.mTitleTv = (TextView) view.findViewById(C3602R.C3604id.module_a_3_return_title);
        this.mReturnBt = view.findViewById(C3602R.C3604id.module_a_3_return_btn);
        this.mSavedListView = (ListView) view.findViewById(C3602R.C3604id.saved_wifi_list);
        this.mOtherListView = (ListView) view.findViewById(C3602R.C3604id.other_wifi_list);
        this.mSaveWifiViewRoot = view.findViewById(C3602R.C3604id.saved_wifi_root);
        this.mEditWifiViewRoot = view.findViewById(C3602R.C3604id.edit_wifi_root);
        this.mNextButton = (Button) view.findViewById(C3602R.C3604id.next_btn);
        this.mChangePasswordView = view.findViewById(C3602R.C3604id.change_password);
        this.mDeleteWifiView = view.findViewById(C3602R.C3604id.delete_wifi);
        this.mScanResultListRoot = (CustomPullDownRefreshLinearLayout) view.findViewById(C3602R.C3604id.wifi_refresh_container);
        this.mScrollWifiList = (ScrollView) view.findViewById(C3602R.C3604id.wifi_list_scroll_view);
        this.mSubTitle = (TextView) view.findViewById(C3602R.C3604id.module_a_3_return_subtitle);
        this.mCannotFindTips = (TextView) view.findViewById(C3602R.C3604id.can_not_find_wifi);
        this.mEmptyView = view.findViewById(C3602R.C3604id.empty_mask);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == SET_LOCATION_CODE) {
            finishSmartConfig(true);
        }
    }

    public boolean onBackPressed() {
        if (this.mScanResultListRoot.getVisibility() == 0 || this.mEditWifiViewRoot.getVisibility() == 0) {
            enterSavedWifiView();
            return true;
        }
        finishSmartConfig(false);
        return true;
    }

    public void onCreateStep(Context context) {
        setContentView(context, C3602R.layout.smart_config_choose_wifi);
        TitleBarUtil.setTitleBarPadding(this.mTitleBar);
        this.mTitleTv.setText(C3602R.string.device_choose_wifi);
        String str = (String) SmartConfigDataProvider.getInstance().get(SmartConfigDataProvider.KEY_DEVICE_MODEL);
        this.mModel = str;
        if (str != null && DeviceFactory.isModelSupport5G(str)) {
            this.mSupport5G = true;
        }
        String str2 = (String) SmartConfigDataProvider.getInstance().get(SmartConfigDataProvider.KEY_DEVICE_NAME);
        if (str2 == null || str2.equals("")) {
            this.mSubTitle.setVisibility(8);
        } else {
            this.mSubTitle.setText(str2);
        }
        this.mNextButton.setEnabled(false);
        this.mNextButton.setTextColor(this.mContext.getResources().getColor(C3602R.color.mj_color_gray_lighter));
        this.mReturnBt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ChooseWifiStepV2.this.onBackPressed();
            }
        });
        this.mWifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        if (!checkWifiState()) {
            new MLAlertDialog.Builder(this.mContext).setMessage(C3602R.string.open_wifi_failed).setCancelable(false).setNegativeButton(C3602R.string.confirm, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    ChooseWifiStepV2.this.finishSmartConfig(false);
                }
            }).setCancelable(false).show();
        }
        this.mScanResultListRoot.setScrollView(this.mScrollWifiList);
        this.mScanResultListRoot.setRefreshListener(new CustomPullDownRefreshLinearLayout.OnRefreshListener() {
            public void startRefresh() {
                ChooseWifiStepV2.this.mWifiManager.startScan();
                boolean unused = ChooseWifiStepV2.this.mIsScanning = true;
            }
        });
        LayoutInflater from = LayoutInflater.from(this.mContext);
        View inflate = from.inflate(C3602R.layout.header_choose_wifi_step, this.mSavedListView, false);
        this.mSavedListHeader = inflate.findViewById(C3602R.C3604id.header_wrapper);
        this.mSavedListView.addHeaderView(inflate);
        this.mSavedListHeader.setVisibility(8);
        View inflate2 = from.inflate(C3602R.layout.footer_choose_wifi_step, this.mSavedListView, false);
        this.mSavedListView.addFooterView(inflate2);
        this.mCannotFindTips.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ChooseWifiStepV2.this.goHelpPage();
            }
        });
        inflate2.findViewById(C3602R.C3604id.other_wifi).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ChooseWifiStepV2.this.enterOtherWifiView();
            }
        });
        View inflate3 = from.inflate(C3602R.layout.header_choose_wifi_step, this.mOtherListView, false);
        this.mOtherListHeader = inflate3;
        this.mOtherListView.addHeaderView(inflate3);
        ((TextView) this.mOtherListHeader.findViewById(C3602R.C3604id.list_title)).setText(context.getString(C3602R.string.near_wifi));
        this.mOtherListHeader.setVisibility(8);
        this.mSavedListView.setAdapter(this.mSavedWifiAdapter);
        this.mOtherListView.setAdapter(this.mOtherWifiAdapter);
        this.mNextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ChooseWifiStepV2.this.goNext(false);
            }
        });
        this.mChangePasswordView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ChooseWifiStepV2.this.mCurrentEditWifi != null) {
                    ChooseWifiStepV2 chooseWifiStepV2 = ChooseWifiStepV2.this;
                    chooseWifiStepV2.showInputPasswordDialog(chooseWifiStepV2.mCurrentEditWifi, false, new DialogListener() {
                        public void onClickListener(String str) {
                            ChooseWifiStepV2 chooseWifiStepV2 = ChooseWifiStepV2.this;
                            chooseWifiStepV2.saveWifiItem(chooseWifiStepV2.mCurrentEditWifi, str);
                            ChooseWifiStepV2.this.enterSavedWifiView();
                        }
                    });
                }
            }
        });
        this.mDeleteWifiView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ChooseWifiStepV2.this.showDeletePasswdDialog();
            }
        });
    }

    public void onFinishStep() {
        if (getHandler() != null) {
            getHandler().removeMessages(104);
        }
    }

    public void onPauseStep() {
    }

    public void onResumeStep() {
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"StaticFieldLeak"})
    public void refreshInnerWifi() {
        if (this.mIsScanning) {
            this.mIsScanning = false;
            final ArrayList arrayList = new ArrayList();
            final ArrayList arrayList2 = new ArrayList();
            final ArrayList arrayList3 = new ArrayList();
            final ArrayList arrayList4 = new ArrayList();
            AsyncTaskUtils.exe(new AsyncTask<Void, Void, ScanResult>() {
                /* access modifiers changed from: protected */
                /* JADX WARNING: Code restructure failed: missing block: B:129:0x03f5, code lost:
                    com.miot.service.connection.wifi.step.ChooseWifiStepV2.access$1402(r14.this$0, (com.miot.service.connection.wifi.ConnectionUtils.KuailianScanResult) r6.get(r1));
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:37:0x011b, code lost:
                    if (r9 != false) goto L_0x011d;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:59:0x01ae, code lost:
                    if (r9 != false) goto L_0x01c4;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:64:0x01c2, code lost:
                    if (r9 != false) goto L_0x01c4;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:70:0x01d9, code lost:
                    if (r9 != false) goto L_0x011d;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:97:0x030a, code lost:
                    com.miot.service.connection.wifi.step.ChooseWifiStepV2.access$1302(r14.this$0, (com.miot.service.connection.wifi.ConnectionUtils.KuailianScanResult) r6.get(r1));
                    r1 = true;
                 */
                /* JADX WARNING: Removed duplicated region for block: B:73:0x01eb  */
                /* JADX WARNING: Removed duplicated region for block: B:76:0x0226  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public android.net.wifi.ScanResult doInBackground(java.lang.Void... r15) {
                    /*
                        r14 = this;
                        com.miot.service.connection.wifi.step.ChooseWifiStepV2 r15 = com.miot.service.connection.wifi.step.ChooseWifiStepV2.this
                        android.net.wifi.WifiManager r15 = r15.mWifiManager
                        android.net.wifi.WifiInfo r15 = r15.getConnectionInfo()
                        r0 = 0
                        com.miot.service.connection.wifi.step.ChooseWifiStepV2 r1 = com.miot.service.connection.wifi.step.ChooseWifiStepV2.this     // Catch:{ Exception -> 0x0016 }
                        android.net.wifi.WifiManager r1 = r1.mWifiManager     // Catch:{ Exception -> 0x0016 }
                        java.util.List r1 = r1.getScanResults()     // Catch:{ Exception -> 0x0016 }
                        goto L_0x001b
                    L_0x0016:
                        r1 = move-exception
                        r1.printStackTrace()
                        r1 = r0
                    L_0x001b:
                        if (r1 != 0) goto L_0x002a
                        com.miot.service.connection.wifi.step.ChooseWifiStepV2 r15 = com.miot.service.connection.wifi.step.ChooseWifiStepV2.this
                        android.widget.TextView r15 = r15.mCannotFindTips
                        com.miot.service.connection.wifi.step.ChooseWifiStepV2$10$1 r1 = new com.miot.service.connection.wifi.step.ChooseWifiStepV2$10$1
                        r1.<init>()
                        r15.post(r1)
                        return r0
                    L_0x002a:
                        java.util.HashMap r2 = new java.util.HashMap
                        r2.<init>()
                        java.util.HashMap r3 = new java.util.HashMap
                        r3.<init>()
                        r4 = 0
                        r6 = r0
                        r5 = 0
                    L_0x0037:
                        int r7 = r1.size()
                        r8 = 1
                        if (r5 >= r7) goto L_0x02c1
                        java.lang.Object r7 = r1.get(r5)
                        android.net.wifi.ScanResult r7 = (android.net.wifi.ScanResult) r7
                        java.lang.String r7 = r7.SSID
                        boolean r7 = android.text.TextUtils.isEmpty(r7)
                        if (r7 == 0) goto L_0x004e
                        goto L_0x02bd
                    L_0x004e:
                        java.lang.Object r7 = r1.get(r5)
                        android.net.wifi.ScanResult r7 = (android.net.wifi.ScanResult) r7
                        boolean r7 = com.miot.service.connection.wifi.ConnectionUtils.isMiwifi(r7)
                        com.miot.service.common.manager.ServiceManager r9 = com.miot.service.common.manager.ServiceManager.getInstance()
                        com.miot.service.connection.wifi.WifiAccount r9 = r9.getWifiAccount()
                        if (r9 == 0) goto L_0x0072
                        java.lang.Object r10 = r1.get(r5)
                        android.net.wifi.ScanResult r10 = (android.net.wifi.ScanResult) r10
                        java.lang.String r10 = r10.BSSID
                        com.miot.service.connection.wifi.WifiAccount$WifiItem r9 = r9.getAccount(r10)
                        if (r9 == 0) goto L_0x0072
                        r9 = 1
                        goto L_0x0073
                    L_0x0072:
                        r9 = 0
                    L_0x0073:
                        r10 = 5000(0x1388, float:7.006E-42)
                        if (r15 == 0) goto L_0x00d7
                        java.lang.String r11 = r15.getSSID()
                        java.lang.Object r12 = r1.get(r5)
                        android.net.wifi.ScanResult r12 = (android.net.wifi.ScanResult) r12
                        java.lang.String r12 = r12.SSID
                        boolean r11 = com.miot.service.connection.wifi.ConnectionUtils.isEqualWifi(r11, r12)
                        if (r11 == 0) goto L_0x00d7
                        if (r7 == 0) goto L_0x00d7
                        java.lang.Object r11 = r1.get(r5)
                        android.net.wifi.ScanResult r11 = (android.net.wifi.ScanResult) r11
                        int r11 = r11.frequency
                        if (r11 <= r10) goto L_0x00d7
                        java.lang.Object r6 = r1.get(r5)
                        android.net.wifi.ScanResult r6 = (android.net.wifi.ScanResult) r6
                        java.lang.String r6 = r6.BSSID
                        java.lang.String r11 = "\\:"
                        java.lang.String[] r6 = r6.split(r11)
                        r11 = 6
                        java.lang.Object[] r11 = new java.lang.Object[r11]
                        r12 = r6[r4]
                        r11[r4] = r12
                        r12 = r6[r8]
                        r11[r8] = r12
                        r12 = 2
                        r13 = r6[r12]
                        r11[r12] = r13
                        r12 = 3
                        r13 = r6[r12]
                        r11[r12] = r13
                        r12 = 4
                        r13 = r6[r12]
                        r11[r12] = r13
                        r12 = 5
                        r6 = r6[r12]
                        r13 = 16
                        java.lang.Integer r6 = java.lang.Integer.valueOf(r6, r13)
                        int r6 = r6.intValue()
                        int r6 = r6 - r8
                        java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                        r11[r12] = r6
                        java.lang.String r6 = "%1$s:%2$s:%3$s:%4$s:%5$s:%6$x"
                        java.lang.String r6 = java.lang.String.format(r6, r11)
                    L_0x00d7:
                        com.miot.service.connection.wifi.ConnectionUtils$KuailianScanResult r8 = new com.miot.service.connection.wifi.ConnectionUtils$KuailianScanResult
                        r8.<init>()
                        r8.isXiaomiRouter = r7
                        r8.isSavePasswd = r9
                        java.lang.Object r7 = r1.get(r5)
                        android.net.wifi.ScanResult r7 = (android.net.wifi.ScanResult) r7
                        r8.scanResult = r7
                        com.miot.service.connection.wifi.step.ChooseWifiStepV2 r7 = com.miot.service.connection.wifi.step.ChooseWifiStepV2.this
                        java.lang.Object r11 = r1.get(r5)
                        android.net.wifi.ScanResult r11 = (android.net.wifi.ScanResult) r11
                        boolean r7 = r7.isDeviceSupport(r11)
                        r11 = 100
                        if (r7 != 0) goto L_0x0238
                        java.lang.Object r7 = r1.get(r5)
                        android.net.wifi.ScanResult r7 = (android.net.wifi.ScanResult) r7
                        int r7 = r7.frequency
                        if (r7 <= r10) goto L_0x0124
                        com.miot.service.connection.wifi.step.ChooseWifiStepV2 r7 = com.miot.service.connection.wifi.step.ChooseWifiStepV2.this
                        boolean r7 = r7.mSupport5G
                        if (r7 != 0) goto L_0x0124
                        com.miot.service.connection.wifi.step.ChooseWifiStepV2 r7 = com.miot.service.connection.wifi.step.ChooseWifiStepV2.this
                        boolean r10 = r7.mIsFinished
                        if (r10 == 0) goto L_0x0111
                        return r0
                    L_0x0111:
                        android.content.Context r7 = r7.mContext
                        int r10 = com.miot.service.C3602R.string.not_support_5g
                        java.lang.String r7 = r7.getString(r10)
                        r8.wifiDes = r7
                        if (r9 == 0) goto L_0x01dd
                    L_0x011d:
                        java.util.List r7 = r3
                    L_0x011f:
                        r7.add(r8)
                        goto L_0x01dd
                    L_0x0124:
                        java.lang.Object r7 = r1.get(r5)
                        android.net.wifi.ScanResult r7 = (android.net.wifi.ScanResult) r7
                        int r7 = com.miot.service.connection.wifi.ConnectionUtils.getSecurity((android.net.wifi.ScanResult) r7)
                        if (r7 != 0) goto L_0x013e
                        com.miot.service.connection.wifi.step.ChooseWifiStepV2 r7 = com.miot.service.connection.wifi.step.ChooseWifiStepV2.this
                        android.content.Context r7 = r7.mContext
                        int r9 = com.miot.service.C3602R.string.kuailian_no_passwd
                        java.lang.String r7 = r7.getString(r9)
                        r8.wifiDes = r7
                        goto L_0x01dd
                    L_0x013e:
                        java.lang.Object r7 = r1.get(r5)
                        android.net.wifi.ScanResult r7 = (android.net.wifi.ScanResult) r7
                        java.lang.String r7 = r7.capabilities
                        java.lang.String r10 = "WEP"
                        boolean r7 = r7.contains(r10)
                        if (r7 != 0) goto L_0x01c8
                        java.lang.Object r7 = r1.get(r5)
                        android.net.wifi.ScanResult r7 = (android.net.wifi.ScanResult) r7
                        java.lang.String r7 = r7.capabilities
                        java.lang.String r10 = "EAP"
                        boolean r7 = r7.contains(r10)
                        if (r7 != 0) goto L_0x01c8
                        java.lang.Object r7 = r1.get(r5)
                        android.net.wifi.ScanResult r7 = (android.net.wifi.ScanResult) r7
                        java.lang.String r7 = r7.capabilities
                        java.lang.String r10 = "WAPI-KEY"
                        boolean r7 = r7.contains(r10)
                        if (r7 != 0) goto L_0x01c8
                        java.lang.Object r7 = r1.get(r5)
                        android.net.wifi.ScanResult r7 = (android.net.wifi.ScanResult) r7
                        java.lang.String r7 = r7.capabilities
                        java.lang.String r10 = "WAPI-PSK"
                        boolean r7 = r7.contains(r10)
                        if (r7 != 0) goto L_0x01c8
                        java.lang.Object r7 = r1.get(r5)
                        android.net.wifi.ScanResult r7 = (android.net.wifi.ScanResult) r7
                        java.lang.String r7 = r7.capabilities
                        java.lang.String r10 = "WAPI-CERT"
                        boolean r7 = r7.contains(r10)
                        if (r7 == 0) goto L_0x018f
                        goto L_0x01c8
                    L_0x018f:
                        java.lang.Object r7 = r1.get(r5)
                        android.net.wifi.ScanResult r7 = (android.net.wifi.ScanResult) r7
                        java.lang.String r7 = r7.SSID
                        boolean r7 = com.miot.service.connection.wifi.ConnectionUtils.isContainUnsupportChar(r7)
                        if (r7 == 0) goto L_0x01b1
                        com.miot.service.connection.wifi.step.ChooseWifiStepV2 r7 = com.miot.service.connection.wifi.step.ChooseWifiStepV2.this
                        boolean r10 = r7.mIsFinished
                        if (r10 == 0) goto L_0x01a4
                        return r0
                    L_0x01a4:
                        android.content.Context r7 = r7.mContext
                        int r10 = com.miot.service.C3602R.string.kuailian_contain_unsupport_char
                        java.lang.String r7 = r7.getString(r10)
                        r8.wifiDes = r7
                        if (r9 == 0) goto L_0x01dd
                        goto L_0x01c4
                    L_0x01b1:
                        com.miot.service.connection.wifi.step.ChooseWifiStepV2 r7 = com.miot.service.connection.wifi.step.ChooseWifiStepV2.this
                        boolean r10 = r7.mIsFinished
                        if (r10 == 0) goto L_0x01b8
                        return r0
                    L_0x01b8:
                        android.content.Context r7 = r7.mContext
                        int r10 = com.miot.service.C3602R.string.kuailian_unsafe_wifi
                        java.lang.String r7 = r7.getString(r10)
                        r8.wifiDes = r7
                        if (r9 == 0) goto L_0x01dd
                    L_0x01c4:
                        java.util.List r7 = r4
                        goto L_0x011f
                    L_0x01c8:
                        com.miot.service.connection.wifi.step.ChooseWifiStepV2 r7 = com.miot.service.connection.wifi.step.ChooseWifiStepV2.this
                        boolean r10 = r7.mIsFinished
                        if (r10 == 0) goto L_0x01cf
                        return r0
                    L_0x01cf:
                        android.content.Context r7 = r7.mContext
                        int r10 = com.miot.service.C3602R.string.kuailian_unconn_reason
                        java.lang.String r7 = r7.getString(r10)
                        r8.wifiDes = r7
                        if (r9 == 0) goto L_0x01dd
                        goto L_0x011d
                    L_0x01dd:
                        java.lang.Object r7 = r1.get(r5)
                        android.net.wifi.ScanResult r7 = (android.net.wifi.ScanResult) r7
                        java.lang.String r7 = r7.SSID
                        boolean r7 = r3.containsKey(r7)
                        if (r7 == 0) goto L_0x0226
                        java.lang.Object r7 = r1.get(r5)
                        android.net.wifi.ScanResult r7 = (android.net.wifi.ScanResult) r7
                        int r7 = r7.level
                        int r7 = com.miot.service.connection.wifi.ConnectionUtils.calculateSignalLevel(r7, r11)
                        java.lang.Object r8 = r1.get(r5)
                        android.net.wifi.ScanResult r8 = (android.net.wifi.ScanResult) r8
                        java.lang.String r8 = r8.SSID
                        java.lang.Object r8 = r3.get(r8)
                        com.miot.service.connection.wifi.ConnectionUtils$KuailianScanResult r8 = (com.miot.service.connection.wifi.ConnectionUtils.KuailianScanResult) r8
                        android.net.wifi.ScanResult r8 = r8.scanResult
                        int r8 = r8.level
                        int r8 = com.miot.service.connection.wifi.ConnectionUtils.calculateSignalLevel(r8, r11)
                        if (r7 <= r8) goto L_0x02bd
                        java.lang.Object r7 = r1.get(r5)
                        android.net.wifi.ScanResult r7 = (android.net.wifi.ScanResult) r7
                        java.lang.String r7 = r7.SSID
                        java.lang.Object r7 = r3.get(r7)
                        com.miot.service.connection.wifi.ConnectionUtils$KuailianScanResult r7 = (com.miot.service.connection.wifi.ConnectionUtils.KuailianScanResult) r7
                        java.util.List r8 = r5
                        r8.remove(r7)
                        java.util.List r8 = r5
                        goto L_0x02a9
                    L_0x0226:
                        java.util.List r7 = r5
                        r7.add(r8)
                        java.lang.Object r7 = r1.get(r5)
                        android.net.wifi.ScanResult r7 = (android.net.wifi.ScanResult) r7
                        java.lang.String r7 = r7.SSID
                        r3.put(r7, r8)
                        goto L_0x02bd
                    L_0x0238:
                        if (r9 == 0) goto L_0x0250
                        java.util.List r7 = r4
                        r7.add(r8)
                        com.miot.service.connection.wifi.step.ChooseWifiStepV2 r7 = com.miot.service.connection.wifi.step.ChooseWifiStepV2.this
                        boolean r9 = r7.mIsFinished
                        if (r9 == 0) goto L_0x0246
                        return r0
                    L_0x0246:
                        android.content.Context r7 = r7.mContext
                        int r9 = com.miot.service.C3602R.string.kuailian_save_passwd
                        java.lang.String r7 = r7.getString(r9)
                        r8.wifiDes = r7
                    L_0x0250:
                        java.lang.Object r7 = r1.get(r5)
                        android.net.wifi.ScanResult r7 = (android.net.wifi.ScanResult) r7
                        java.lang.String r7 = r7.SSID
                        boolean r7 = r2.containsKey(r7)
                        if (r7 == 0) goto L_0x02ad
                        java.lang.Object r7 = r1.get(r5)
                        android.net.wifi.ScanResult r7 = (android.net.wifi.ScanResult) r7
                        int r7 = r7.level
                        int r7 = com.miot.service.connection.wifi.ConnectionUtils.calculateSignalLevel(r7, r11)
                        java.lang.Object r9 = r1.get(r5)
                        android.net.wifi.ScanResult r9 = (android.net.wifi.ScanResult) r9
                        java.lang.String r9 = r9.SSID
                        java.lang.Object r9 = r2.get(r9)
                        com.miot.service.connection.wifi.ConnectionUtils$KuailianScanResult r9 = (com.miot.service.connection.wifi.ConnectionUtils.KuailianScanResult) r9
                        android.net.wifi.ScanResult r9 = r9.scanResult
                        int r9 = r9.level
                        int r9 = com.miot.service.connection.wifi.ConnectionUtils.calculateSignalLevel(r9, r11)
                        if (r7 <= r9) goto L_0x02bd
                        java.lang.Object r7 = r1.get(r5)
                        android.net.wifi.ScanResult r7 = (android.net.wifi.ScanResult) r7
                        java.lang.String r7 = r7.SSID
                        java.lang.Object r7 = r2.get(r7)
                        com.miot.service.connection.wifi.ConnectionUtils$KuailianScanResult r7 = (com.miot.service.connection.wifi.ConnectionUtils.KuailianScanResult) r7
                        android.net.wifi.ScanResult r9 = r7.scanResult
                        java.lang.String r9 = r9.SSID
                        r2.remove(r9)
                        java.lang.Object r9 = r1.get(r5)
                        android.net.wifi.ScanResult r9 = (android.net.wifi.ScanResult) r9
                        java.lang.String r9 = r9.SSID
                        r2.put(r9, r8)
                        java.util.List r8 = r6
                        r8.remove(r7)
                        java.util.List r8 = r6
                    L_0x02a9:
                        r8.add(r7)
                        goto L_0x02bd
                    L_0x02ad:
                        java.util.List r7 = r6
                        r7.add(r8)
                        java.lang.Object r7 = r1.get(r5)
                        android.net.wifi.ScanResult r7 = (android.net.wifi.ScanResult) r7
                        java.lang.String r7 = r7.SSID
                        r2.put(r7, r8)
                    L_0x02bd:
                        int r5 = r5 + 1
                        goto L_0x0037
                    L_0x02c1:
                        com.miot.service.connection.wifi.step.ChooseWifiStepV2 r1 = com.miot.service.connection.wifi.step.ChooseWifiStepV2.this
                        java.util.List r2 = r6
                        r1.sortWifi(r2)
                        com.miot.service.connection.wifi.step.ChooseWifiStepV2 r1 = com.miot.service.connection.wifi.step.ChooseWifiStepV2.this
                        java.util.List r2 = r5
                        r1.sortWifi(r2)
                        com.miot.service.connection.wifi.step.ChooseWifiStepV2 r1 = com.miot.service.connection.wifi.step.ChooseWifiStepV2.this
                        java.util.List r2 = r4
                        r1.sortWifi(r2)
                        com.miot.service.connection.wifi.step.ChooseWifiStepV2 r1 = com.miot.service.connection.wifi.step.ChooseWifiStepV2.this
                        java.util.List r2 = r3
                        r1.sortWifi(r2)
                        com.miot.service.connection.wifi.step.ChooseWifiStepV2 r1 = com.miot.service.connection.wifi.step.ChooseWifiStepV2.this
                        com.miot.service.connection.wifi.ConnectionUtils$KuailianScanResult r1 = r1.mChooseScanResult
                        if (r1 == 0) goto L_0x0339
                        r1 = 0
                    L_0x02e6:
                        java.util.List r2 = r6
                        int r2 = r2.size()
                        if (r1 >= r2) goto L_0x032f
                        com.miot.service.connection.wifi.step.ChooseWifiStepV2 r2 = com.miot.service.connection.wifi.step.ChooseWifiStepV2.this
                        com.miot.service.connection.wifi.ConnectionUtils$KuailianScanResult r2 = r2.mChooseScanResult
                        android.net.wifi.ScanResult r2 = r2.scanResult
                        java.lang.String r2 = r2.BSSID
                        java.util.List r3 = r6
                        java.lang.Object r3 = r3.get(r1)
                        com.miot.service.connection.wifi.ConnectionUtils$KuailianScanResult r3 = (com.miot.service.connection.wifi.ConnectionUtils.KuailianScanResult) r3
                        android.net.wifi.ScanResult r3 = r3.scanResult
                        java.lang.String r3 = r3.BSSID
                        boolean r2 = r2.equalsIgnoreCase(r3)
                        if (r2 == 0) goto L_0x0319
                    L_0x030a:
                        com.miot.service.connection.wifi.step.ChooseWifiStepV2 r2 = com.miot.service.connection.wifi.step.ChooseWifiStepV2.this
                        java.util.List r3 = r6
                        java.lang.Object r1 = r3.get(r1)
                        com.miot.service.connection.wifi.ConnectionUtils$KuailianScanResult r1 = (com.miot.service.connection.wifi.ConnectionUtils.KuailianScanResult) r1
                        com.miot.service.connection.wifi.ConnectionUtils.KuailianScanResult unused = r2.mChooseScanResult = r1
                        r1 = 1
                        goto L_0x0330
                    L_0x0319:
                        if (r6 == 0) goto L_0x032c
                        com.miot.service.connection.wifi.step.ChooseWifiStepV2 r2 = com.miot.service.connection.wifi.step.ChooseWifiStepV2.this
                        com.miot.service.connection.wifi.ConnectionUtils$KuailianScanResult r2 = r2.mChooseScanResult
                        android.net.wifi.ScanResult r2 = r2.scanResult
                        java.lang.String r2 = r2.BSSID
                        boolean r2 = r2.equalsIgnoreCase(r6)
                        if (r2 == 0) goto L_0x032c
                        goto L_0x030a
                    L_0x032c:
                        int r1 = r1 + 1
                        goto L_0x02e6
                    L_0x032f:
                        r1 = 0
                    L_0x0330:
                        if (r1 != 0) goto L_0x03ce
                        com.miot.service.connection.wifi.step.ChooseWifiStepV2 r1 = com.miot.service.connection.wifi.step.ChooseWifiStepV2.this
                        com.miot.service.connection.wifi.ConnectionUtils.KuailianScanResult unused = r1.mChooseScanResult = r0
                        goto L_0x03ce
                    L_0x0339:
                        com.miot.service.connection.wifi.SmartConfigDataProvider r1 = com.miot.service.connection.wifi.SmartConfigDataProvider.getInstance()
                        java.lang.String r2 = "target_bssid"
                        java.lang.Object r1 = r1.get(r2)
                        java.lang.String r1 = (java.lang.String) r1
                        boolean r2 = android.text.TextUtils.isEmpty(r1)
                        if (r2 != 0) goto L_0x03ce
                        r2 = 0
                    L_0x034c:
                        java.util.List r3 = r6
                        int r3 = r3.size()
                        if (r2 >= r3) goto L_0x03ce
                        java.util.List r3 = r6
                        java.lang.Object r3 = r3.get(r2)
                        com.miot.service.connection.wifi.ConnectionUtils$KuailianScanResult r3 = (com.miot.service.connection.wifi.ConnectionUtils.KuailianScanResult) r3
                        android.net.wifi.ScanResult r3 = r3.scanResult
                        java.lang.String r3 = r3.BSSID
                        boolean r3 = r1.equalsIgnoreCase(r3)
                        if (r3 == 0) goto L_0x03ca
                        com.miot.service.connection.wifi.step.ChooseWifiStepV2 r1 = com.miot.service.connection.wifi.step.ChooseWifiStepV2.this
                        java.util.List r3 = r6
                        java.lang.Object r2 = r3.get(r2)
                        com.miot.service.connection.wifi.ConnectionUtils$KuailianScanResult r2 = (com.miot.service.connection.wifi.ConnectionUtils.KuailianScanResult) r2
                        com.miot.service.connection.wifi.ConnectionUtils.KuailianScanResult unused = r1.mChooseScanResult = r2
                        com.miot.service.connection.wifi.SmartConfigDataProvider r1 = com.miot.service.connection.wifi.SmartConfigDataProvider.getInstance()
                        java.lang.String r2 = "target_passwd"
                        java.lang.Object r1 = r1.get(r2)
                        if (r1 == 0) goto L_0x03ce
                        com.miot.service.connection.wifi.WifiAccount$WifiItem r1 = new com.miot.service.connection.wifi.WifiAccount$WifiItem
                        r1.<init>()
                        com.miot.service.connection.wifi.step.ChooseWifiStepV2 r3 = com.miot.service.connection.wifi.step.ChooseWifiStepV2.this
                        com.miot.service.connection.wifi.ConnectionUtils$KuailianScanResult r3 = r3.mChooseScanResult
                        android.net.wifi.ScanResult r3 = r3.scanResult
                        java.lang.String r3 = r3.BSSID
                        r1.bssid = r3
                        if (r3 != 0) goto L_0x0396
                        java.lang.String r3 = ""
                        r1.bssid = r3
                    L_0x0396:
                        com.miot.service.connection.wifi.step.ChooseWifiStepV2 r3 = com.miot.service.connection.wifi.step.ChooseWifiStepV2.this
                        com.miot.service.connection.wifi.ConnectionUtils$KuailianScanResult r3 = r3.mChooseScanResult
                        android.net.wifi.ScanResult r3 = r3.scanResult
                        java.lang.String r3 = r3.SSID
                        r1.ssid = r3
                        com.miot.service.connection.wifi.step.ChooseWifiStepV2 r3 = com.miot.service.connection.wifi.step.ChooseWifiStepV2.this
                        com.miot.service.connection.wifi.ConnectionUtils$KuailianScanResult r3 = r3.mChooseScanResult
                        android.net.wifi.ScanResult r3 = r3.scanResult
                        java.lang.String r3 = r3.capabilities
                        r1.capabilities = r3
                        com.miot.service.connection.wifi.SmartConfigDataProvider r3 = com.miot.service.connection.wifi.SmartConfigDataProvider.getInstance()
                        java.lang.Object r2 = r3.get(r2)
                        java.lang.String r2 = (java.lang.String) r2
                        r1.passwd = r2
                        r1.save = r8
                        com.miot.service.common.manager.ServiceManager r2 = com.miot.service.common.manager.ServiceManager.getInstance()
                        com.miot.service.connection.wifi.WifiAccount r2 = r2.getWifiAccount()
                        if (r2 == 0) goto L_0x03ce
                        r2.saveAccount(r1)
                        goto L_0x03ce
                    L_0x03ca:
                        int r2 = r2 + 1
                        goto L_0x034c
                    L_0x03ce:
                        if (r15 == 0) goto L_0x0423
                        java.lang.String r1 = r15.getBSSID()
                        if (r1 == 0) goto L_0x0423
                        r1 = 0
                    L_0x03d7:
                        java.util.List r2 = r6
                        int r2 = r2.size()
                        if (r1 >= r2) goto L_0x041b
                        java.lang.String r2 = r15.getBSSID()
                        java.util.List r3 = r6
                        java.lang.Object r3 = r3.get(r1)
                        com.miot.service.connection.wifi.ConnectionUtils$KuailianScanResult r3 = (com.miot.service.connection.wifi.ConnectionUtils.KuailianScanResult) r3
                        android.net.wifi.ScanResult r3 = r3.scanResult
                        java.lang.String r3 = r3.BSSID
                        boolean r2 = r2.equalsIgnoreCase(r3)
                        if (r2 == 0) goto L_0x0403
                    L_0x03f5:
                        com.miot.service.connection.wifi.step.ChooseWifiStepV2 r2 = com.miot.service.connection.wifi.step.ChooseWifiStepV2.this
                        java.util.List r3 = r6
                        java.lang.Object r1 = r3.get(r1)
                        com.miot.service.connection.wifi.ConnectionUtils$KuailianScanResult r1 = (com.miot.service.connection.wifi.ConnectionUtils.KuailianScanResult) r1
                        com.miot.service.connection.wifi.ConnectionUtils.KuailianScanResult unused = r2.mPhoneWifiInfo = r1
                        goto L_0x041c
                    L_0x0403:
                        if (r6 == 0) goto L_0x0418
                        java.util.List r2 = r6
                        java.lang.Object r2 = r2.get(r1)
                        com.miot.service.connection.wifi.ConnectionUtils$KuailianScanResult r2 = (com.miot.service.connection.wifi.ConnectionUtils.KuailianScanResult) r2
                        android.net.wifi.ScanResult r2 = r2.scanResult
                        java.lang.String r2 = r2.BSSID
                        boolean r2 = r2.equalsIgnoreCase(r6)
                        if (r2 == 0) goto L_0x0418
                        goto L_0x03f5
                    L_0x0418:
                        int r1 = r1 + 1
                        goto L_0x03d7
                    L_0x041b:
                        r8 = 0
                    L_0x041c:
                        if (r8 != 0) goto L_0x0423
                        com.miot.service.connection.wifi.step.ChooseWifiStepV2 r1 = com.miot.service.connection.wifi.step.ChooseWifiStepV2.this
                        com.miot.service.connection.wifi.ConnectionUtils.KuailianScanResult unused = r1.mPhoneWifiInfo = r0
                    L_0x0423:
                        com.miot.service.connection.wifi.step.ChooseWifiStepV2 r1 = com.miot.service.connection.wifi.step.ChooseWifiStepV2.this
                        com.miot.service.connection.wifi.ConnectionUtils$KuailianScanResult r1 = r1.mChooseScanResult
                        if (r1 != 0) goto L_0x0465
                        if (r15 == 0) goto L_0x0465
                        java.util.List r1 = r4
                        java.util.Iterator r1 = r1.iterator()
                    L_0x0433:
                        boolean r2 = r1.hasNext()
                        if (r2 == 0) goto L_0x0491
                        java.lang.Object r2 = r1.next()
                        com.miot.service.connection.wifi.ConnectionUtils$KuailianScanResult r2 = (com.miot.service.connection.wifi.ConnectionUtils.KuailianScanResult) r2
                        android.net.wifi.ScanResult r3 = r2.scanResult
                        java.lang.String r3 = r3.BSSID
                        java.lang.String r5 = r15.getBSSID()
                        boolean r3 = r3.equalsIgnoreCase(r5)
                        if (r3 == 0) goto L_0x0458
                    L_0x044d:
                        java.util.List r15 = r4
                        r15.remove(r2)
                        java.util.List r15 = r4
                        r15.add(r4, r2)
                        goto L_0x0491
                    L_0x0458:
                        if (r6 == 0) goto L_0x0433
                        android.net.wifi.ScanResult r3 = r2.scanResult
                        java.lang.String r3 = r3.BSSID
                        boolean r3 = r3.equalsIgnoreCase(r6)
                        if (r3 == 0) goto L_0x0433
                        goto L_0x044d
                    L_0x0465:
                        com.miot.service.connection.wifi.step.ChooseWifiStepV2 r15 = com.miot.service.connection.wifi.step.ChooseWifiStepV2.this
                        com.miot.service.connection.wifi.ConnectionUtils$KuailianScanResult r15 = r15.mChooseScanResult
                        if (r15 == 0) goto L_0x0491
                        java.util.List r15 = r4
                        com.miot.service.connection.wifi.step.ChooseWifiStepV2 r1 = com.miot.service.connection.wifi.step.ChooseWifiStepV2.this
                        com.miot.service.connection.wifi.ConnectionUtils$KuailianScanResult r1 = r1.mChooseScanResult
                        boolean r15 = r15.contains(r1)
                        if (r15 == 0) goto L_0x0491
                        java.util.List r15 = r4
                        com.miot.service.connection.wifi.step.ChooseWifiStepV2 r1 = com.miot.service.connection.wifi.step.ChooseWifiStepV2.this
                        com.miot.service.connection.wifi.ConnectionUtils$KuailianScanResult r1 = r1.mChooseScanResult
                        r15.remove(r1)
                        java.util.List r15 = r4
                        com.miot.service.connection.wifi.step.ChooseWifiStepV2 r1 = com.miot.service.connection.wifi.step.ChooseWifiStepV2.this
                        com.miot.service.connection.wifi.ConnectionUtils$KuailianScanResult r1 = r1.mChooseScanResult
                        r15.add(r4, r1)
                    L_0x0491:
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.miot.service.connection.wifi.step.ChooseWifiStepV2.C374610.doInBackground(java.lang.Void[]):android.net.wifi.ScanResult");
                }

                /* access modifiers changed from: protected */
                public void onPostExecute(ScanResult scanResult) {
                    ChooseWifiStepV2 chooseWifiStepV2 = ChooseWifiStepV2.this;
                    if (!chooseWifiStepV2.mIsFinished) {
                        chooseWifiStepV2.mAllScanResults.clear();
                        ChooseWifiStepV2.this.mAllScanResults.addAll(arrayList);
                        ChooseWifiStepV2.this.mUnconnectResult.clear();
                        ChooseWifiStepV2.this.mUnconnectResult.addAll(arrayList2);
                        ChooseWifiStepV2.this.mSavedScanResults.clear();
                        ChooseWifiStepV2.this.mSavedScanResults.addAll(arrayList3);
                        ChooseWifiStepV2.this.mSavedUnconnectResult.clear();
                        ChooseWifiStepV2.this.mSavedUnconnectResult.addAll(arrayList4);
                        ChooseWifiStepV2.this.mScanResultListRoot.postRefresh();
                        if (ChooseWifiStepV2.this.mSavedScanResults.size() > 0 || ChooseWifiStepV2.this.mUnconnectResult.size() > 0) {
                            ChooseWifiStepV2.this.mSavedListHeader.setVisibility(0);
                        }
                        if (ChooseWifiStepV2.this.mAllScanResults.size() > 0 || ChooseWifiStepV2.this.mUnconnectResult.size() > 0) {
                            ChooseWifiStepV2.this.mOtherListView.setVisibility(0);
                            ChooseWifiStepV2.this.mOtherListHeader.setVisibility(0);
                            ChooseWifiStepV2.this.mScrollWifiList.setBackgroundColor(Color.parseColor("#f7f7f7"));
                            ChooseWifiStepV2.this.mEmptyView.setVisibility(8);
                        } else if (ChooseWifiStepV2.this.hasAutoRefresh) {
                            ChooseWifiStepV2.this.mOtherListView.setVisibility(8);
                            ChooseWifiStepV2.this.mEmptyView.setVisibility(0);
                            ChooseWifiStepV2.this.mScrollWifiList.setBackgroundColor(-1);
                        }
                        boolean unused = ChooseWifiStepV2.this.mIsScanning = false;
                        ChooseWifiStepV2.this.mCannotFindTips.setVisibility(0);
                        if (ChooseWifiStepV2.this.mSavedScanResults.size() == 0 && (ChooseWifiStepV2.this.mPhoneWifiInfo == null || (!ChooseWifiStepV2.this.mSupport5G && ChooseWifiStepV2.this.mPhoneWifiInfo.scanResult.frequency > 5000))) {
                            ChooseWifiStepV2.this.mSavedListHeader.setVisibility(8);
                            ChooseWifiStepV2.this.mCannotFindTips.setVisibility(0);
                        } else if (ChooseWifiStepV2.this.mSavedScanResults.size() == 0) {
                            ChooseWifiStepV2 chooseWifiStepV22 = ChooseWifiStepV2.this;
                            if (!chooseWifiStepV22.mIsFinished) {
                                ((TextView) chooseWifiStepV22.mSavedListHeader.findViewById(C3602R.C3604id.list_title)).setText(ChooseWifiStepV2.this.mContext.getString(C3602R.string.current_phone_wifi));
                                ChooseWifiStepV2.this.mSavedScanResults.add(ChooseWifiStepV2.this.mPhoneWifiInfo);
                            } else {
                                return;
                            }
                        } else if (ChooseWifiStepV2.this.mChooseScanResult == null) {
                            ChooseWifiStepV2 chooseWifiStepV23 = ChooseWifiStepV2.this;
                            ConnectionUtils.KuailianScanResult unused2 = chooseWifiStepV23.mChooseScanResult = (ConnectionUtils.KuailianScanResult) chooseWifiStepV23.mSavedScanResults.get(0);
                        }
                        ChooseWifiStepV2.this.setNextButtonState();
                        ChooseWifiStepV2.this.mSavedWifiAdapter.notifyDataSetChanged();
                        ChooseWifiStepV2.this.mOtherWifiAdapter.notifyDataSetChanged();
                        ChooseWifiStepV2.this.mScanResultListRoot.postRefresh();
                    }
                }
            }, new Void[0]);
        }
    }
}
