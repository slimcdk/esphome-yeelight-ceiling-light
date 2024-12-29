package com.miot.service.connection.wifi.step;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.miot.bluetooth.BluetoothConstants;
import com.miot.common.utils.DeviceUtils;
import com.miot.common.utils.DisplayUtils;
import com.miot.service.C3602R;
import com.miot.service.common.manager.ServiceManager;
import com.miot.service.common.widget.CustomPullDownRefreshLinearLayout;
import com.miot.service.common.widget.ResizeLayout;
import com.miot.service.connection.wifi.ConnectionUtils;
import com.miot.service.connection.wifi.SmartConfigDataProvider;
import com.miot.service.connection.wifi.WifiAccount;
import com.miot.service.connection.wifi.step.SmartConfigStep;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class ChooseWifiStep extends SmartConfigStep {
    /* access modifiers changed from: private */
    public List<ScanResult> m5GScanResult = new ArrayList();
    /* access modifiers changed from: private */
    public List<ScanResult> mAllScanResults = new ArrayList();
    /* access modifiers changed from: private */
    public CheckBox mCheckbox;
    /* access modifiers changed from: private */
    public ScanResult mChooseScanResult;
    /* access modifiers changed from: private */
    public BaseAdapter mConnAdapter = new ConnWifiAdapter();
    /* access modifiers changed from: private */
    public ListView mConnectList;
    private ImageView mDeviceIcon;
    private TextView mDeviceInfo;
    /* access modifiers changed from: private */
    public boolean mIsScanning = false;
    /* access modifiers changed from: private */
    public Button mNextBtn;
    /* access modifiers changed from: private */
    public EditText mPasswordEditor;
    /* access modifiers changed from: private */
    public EditText mPasswordEditorAbove;
    /* access modifiers changed from: private */
    public TextView mPasswordToggle;
    private ResizeLayout mResizeLayout;
    private View mReturnBtn;
    /* access modifiers changed from: private */
    public CustomPullDownRefreshLinearLayout mScanResultList;
    /* access modifiers changed from: private */
    public View mScanWifi;
    private ScrollView mScrollWifiList;
    private boolean mShowBlankActivity = false;
    /* access modifiers changed from: private */
    public ImageView mShowScanResultToggle;
    /* access modifiers changed from: private */
    public boolean mSupport5G = false;
    private View mTitleBar;
    /* access modifiers changed from: private */
    public BaseAdapter mUnConnectAdapter = new UnConnWifiAdapter();
    /* access modifiers changed from: private */
    public ListView mUnConnectList;
    /* access modifiers changed from: private */
    public List<ScanResult> mUnconnectResult = new ArrayList();
    /* access modifiers changed from: private */
    public TextView mWifiChooser;
    /* access modifiers changed from: private */
    public WifiManager mWifiManager;
    private View mWifiPassContainer;

    class ConnWifiAdapter extends BaseAdapter {
        ConnWifiAdapter() {
        }

        public int getCount() {
            return ChooseWifiStep.this.mAllScanResults.size();
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(final int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = LayoutInflater.from(ChooseWifiStep.this.mContext).inflate(C3602R.layout.conn_wifi_item, (ViewGroup) null);
                ViewTag viewTag = new ViewTag();
                viewTag.title = (TextView) view.findViewById(C3602R.C3604id.wifi_name);
                viewTag.subTitle = (TextView) view.findViewById(C3602R.C3604id.security_name);
                viewTag.signalLevel = (ImageView) view.findViewById(C3602R.C3604id.wifi_signal_level);
                view.setTag(viewTag);
            }
            ViewTag viewTag2 = (ViewTag) view.getTag();
            viewTag2.title.setText(((ScanResult) ChooseWifiStep.this.mAllScanResults.get(i)).SSID);
            TextView textView = viewTag2.subTitle;
            ChooseWifiStep chooseWifiStep = ChooseWifiStep.this;
            textView.setText(ConnectionUtils.getSecurityString(chooseWifiStep.mContext, (ScanResult) chooseWifiStep.mAllScanResults.get(i)));
            viewTag2.signalLevel.setImageResource(ConnectionUtils.getSignalLevel(ConnectionUtils.calculateSignalLevel(((ScanResult) ChooseWifiStep.this.mAllScanResults.get(i)).level, 100)));
            view.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (ConnectionUtils.getSecurity((ScanResult) ChooseWifiStep.this.mAllScanResults.get(i)) == 0) {
                        new AlertDialog.Builder(ChooseWifiStep.this.mContext).setTitle(C3602R.string.kuailian_unsafe_wifi).setMessage(C3602R.string.kuailian_unsafe_wifi_content).setPositiveButton(C3602R.string.confirm_button, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogInterface, int i) {
                                ChooseWifiStep chooseWifiStep = ChooseWifiStep.this;
                                chooseWifiStep.chooseWifi((ScanResult) chooseWifiStep.mAllScanResults.get(i));
                                SmartConfigDataProvider.getInstance().set(SmartConfigDataProvider.KEY_SMART_CONFIG_MIUI_CLASS, (Object) null);
                                ChooseWifiStep.this.hideWifiList();
                            }
                        }).setNegativeButton(C3602R.string.cancel, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogInterface, int i) {
                            }
                        }).show();
                        return;
                    }
                    ChooseWifiStep chooseWifiStep = ChooseWifiStep.this;
                    chooseWifiStep.chooseWifi((ScanResult) chooseWifiStep.mAllScanResults.get(i));
                    ChooseWifiStep.this.hideWifiList();
                }
            });
            return view;
        }
    }

    class UnConnWifiAdapter extends BaseAdapter {
        UnConnWifiAdapter() {
        }

        public int getCount() {
            return ChooseWifiStep.this.mUnconnectResult.size();
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(final int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = LayoutInflater.from(ChooseWifiStep.this.mContext).inflate(C3602R.layout.conn_wifi_item, (ViewGroup) null);
                ViewTag viewTag = new ViewTag();
                viewTag.title = (TextView) view.findViewById(C3602R.C3604id.wifi_name);
                viewTag.subTitle = (TextView) view.findViewById(C3602R.C3604id.security_name);
                viewTag.signalLevel = (ImageView) view.findViewById(C3602R.C3604id.wifi_signal_level);
                view.setTag(viewTag);
            }
            ViewTag viewTag2 = (ViewTag) view.getTag();
            viewTag2.title.setText(((ScanResult) ChooseWifiStep.this.mUnconnectResult.get(i)).SSID);
            viewTag2.title.setTextColor(ChooseWifiStep.this.mContext.getResources().getColor(C3602R.color.class_text_16));
            viewTag2.signalLevel.setImageResource(ConnectionUtils.getSignalLevel(ConnectionUtils.calculateSignalLevel(((ScanResult) ChooseWifiStep.this.mUnconnectResult.get(i)).level, 100)));
            TextView textView = viewTag2.subTitle;
            ChooseWifiStep chooseWifiStep = ChooseWifiStep.this;
            textView.setText(ConnectionUtils.getSecurityString(chooseWifiStep.mContext, (ScanResult) chooseWifiStep.mUnconnectResult.get(i)));
            view.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    AlertDialog.Builder builder;
                    AlertDialog.Builder builder2;
                    DialogInterface.OnClickListener onClickListener;
                    int i;
                    ScanResult scanResult = (ScanResult) ChooseWifiStep.this.mUnconnectResult.get(i);
                    if (scanResult.frequency > 5000 || scanResult.capabilities.contains("WEP") || scanResult.capabilities.contains("EAP") || scanResult.capabilities.contains("WAPI-KEY") || scanResult.capabilities.contains("WAPI-PSK") || scanResult.capabilities.contains("WAPI-CERT") || scanResult.level == 0 || DeviceUtils.isMiioAP(scanResult) != DeviceUtils.AP_TYPE.AP_NONE) {
                        builder = new AlertDialog.Builder(ChooseWifiStep.this.mContext).setMessage(C3602R.string.kuailian_unconn_reason).setPositiveButton(C3602R.string.confirm_button, (DialogInterface.OnClickListener) null);
                    } else {
                        if (ConnectionUtils.isContainUnsupportChar(((ScanResult) ChooseWifiStep.this.mUnconnectResult.get(i)).SSID)) {
                            builder2 = new AlertDialog.Builder(ChooseWifiStep.this.mContext).setTitle(C3602R.string.kuailian_contain_unsupport_char).setMessage(C3602R.string.kuailian_unsafe_wifi_content).setPositiveButton(C3602R.string.confirm_button, new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    ChooseWifiStep chooseWifiStep = ChooseWifiStep.this;
                                    chooseWifiStep.chooseWifi((ScanResult) chooseWifiStep.mUnconnectResult.get(i));
                                    SmartConfigDataProvider.getInstance().set(SmartConfigDataProvider.KEY_SMART_CONFIG_MIUI_CLASS, (Object) null);
                                    ChooseWifiStep.this.hideWifiList();
                                }
                            });
                            i = C3602R.string.cancel;
                            onClickListener = new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialogInterface, int i) {
                                }
                            };
                        } else {
                            builder2 = new AlertDialog.Builder(ChooseWifiStep.this.mContext).setTitle(C3602R.string.kuailian_unsafe_wifi).setMessage(C3602R.string.kuailian_unsafe_wifi_content_1).setPositiveButton(C3602R.string.confirm_button, new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    ChooseWifiStep chooseWifiStep = ChooseWifiStep.this;
                                    chooseWifiStep.chooseWifi((ScanResult) chooseWifiStep.mUnconnectResult.get(i));
                                    SmartConfigDataProvider.getInstance().set(SmartConfigDataProvider.KEY_SMART_CONFIG_MIUI_CLASS, (Object) null);
                                    ChooseWifiStep.this.hideWifiList();
                                }
                            });
                            i = C3602R.string.cancel;
                            onClickListener = new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialogInterface, int i) {
                                }
                            };
                        }
                        builder = builder2.setNegativeButton(i, onClickListener);
                    }
                    builder.show();
                }
            });
            return view;
        }
    }

    class ViewTag {
        public ImageView signalLevel;
        public TextView subTitle;
        public TextView title;

        ViewTag() {
        }
    }

    /* access modifiers changed from: private */
    public void checkConfirmEnabled() {
        boolean z;
        Button button;
        if (this.mChooseScanResult == null || this.mIsScanning || !(this.mWifiPassContainer.getVisibility() == 8 || this.mPasswordEditorAbove.getVisibility() == 0 || !TextUtils.isEmpty(this.mPasswordEditor.getText().toString()))) {
            button = this.mNextBtn;
            z = false;
        } else {
            button = this.mNextBtn;
            z = true;
        }
        button.setEnabled(z);
    }

    /* access modifiers changed from: private */
    public void checkShowPassword(ScanResult scanResult) {
        if (scanResult == null) {
            this.mWifiPassContainer.setVisibility(8);
            this.mCheckbox.setVisibility(8);
        } else if (ConnectionUtils.getSecurity(scanResult) == 0) {
            this.mWifiPassContainer.setVisibility(8);
            this.mCheckbox.setVisibility(8);
            this.mPasswordToggle.setEnabled(false);
        } else if (ServiceManager.getInstance().getWifiAccount().getAccount(scanResult.BSSID) != null) {
            showOrHidePasswd(false);
        } else {
            showOrHidePasswd(true);
        }
    }

    /* access modifiers changed from: private */
    public void chooseWifi(ScanResult scanResult) {
        if (this.mChooseScanResult != scanResult) {
            this.mPasswordEditor.setText("");
        }
        this.mChooseScanResult = scanResult;
        this.mWifiChooser.setText(scanResult.SSID);
        checkShowPassword(this.mChooseScanResult);
        checkConfirmEnabled();
    }

    /* access modifiers changed from: private */
    public void saveWifiItem(String str) {
        WifiAccount.WifiItem wifiItem = new WifiAccount.WifiItem();
        String str2 = this.mChooseScanResult.BSSID;
        wifiItem.bssid = str2;
        if (str2 == null) {
            wifiItem.bssid = "";
        }
        ScanResult scanResult = this.mChooseScanResult;
        wifiItem.ssid = scanResult.SSID;
        wifiItem.capabilities = scanResult.capabilities;
        wifiItem.passwd = str;
        wifiItem.save = true;
        wifiItem.networkId = this.mWifiManager.getConnectionInfo().getNetworkId();
        ServiceManager.getInstance().getWifiAccount().saveAccount(wifiItem);
    }

    private void showOrHidePasswd(boolean z) {
        this.mWifiPassContainer.setVisibility(0);
        this.mCheckbox.setVisibility(0);
        this.mCheckbox.setChecked(true);
        if (!z) {
            this.mPasswordEditorAbove.setInputType(129);
            this.mPasswordEditorAbove.setText("123456");
            this.mPasswordEditorAbove.setVisibility(0);
            this.mPasswordEditor.setVisibility(8);
            this.mPasswordToggle.setEnabled(false);
            this.mNextBtn.setEnabled(true);
            return;
        }
        this.mPasswordEditor.setVisibility(0);
        this.mPasswordEditorAbove.setVisibility(8);
        this.mPasswordToggle.setEnabled(true);
        this.mNextBtn.setEnabled(false);
        SmartConfigDataProvider.getInstance().cleanValue(SmartConfigDataProvider.KEY_SMART_CONFIG_MIUI_CLASS);
    }

    /* access modifiers changed from: package-private */
    public boolean checkWifiList() {
        if (this.mAllScanResults.size() != 0) {
            return false;
        }
        new AlertDialog.Builder(this.mContext).setMessage(C3602R.string.get_wifi_scan_result_error).setPositiveButton(C3602R.string.wifi_rescan_wifi, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                ChooseWifiStep.this.mScanWifi.setVisibility(0);
                ChooseWifiStep.this.mWifiManager.startScan();
                ChooseWifiStep.this.mPasswordEditor.setEnabled(false);
                ChooseWifiStep.this.mWifiChooser.setEnabled(false);
                ChooseWifiStep.this.mNextBtn.setEnabled(false);
                ChooseWifiStep.this.mPasswordToggle.setEnabled(false);
                boolean unused = ChooseWifiStep.this.mIsScanning = true;
            }
        }).setNegativeButton(C3602R.string.cancel, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                ChooseWifiStep.this.finishCurrentStep(SmartConfigStep.Step.STEP_SMART_CONFIG_STEP);
            }
        }).setCancelable(false).show();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void checkWifiState() {
        int wifiState = this.mWifiManager.getWifiState();
        if (wifiState == 3) {
            this.mWifiManager.startScan();
            getHandler().sendEmptyMessageDelayed(104, 30000);
        } else if ((wifiState == 4 || wifiState == 1) && wifiState == 1) {
            this.mWifiManager.setWifiEnabled(true);
        }
        this.mIsScanning = true;
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

    /* access modifiers changed from: package-private */
    public void hideWifiList() {
        this.mScanResultList.setVisibility(8);
        this.mScanResultList.startAnimation(AnimationUtils.loadAnimation(this.mContext, C3602R.anim.v5_dialog_exit));
    }

    /* access modifiers changed from: protected */
    public void initView(View view) {
        this.mDeviceIcon = (ImageView) view.findViewById(C3602R.C3604id.icon);
        this.mDeviceInfo = (TextView) view.findViewById(C3602R.C3604id.module_a_3_return_title);
        this.mNextBtn = (Button) view.findViewById(C3602R.C3604id.next_btn);
        this.mWifiChooser = (TextView) view.findViewById(C3602R.C3604id.login_wifi_ssid_chooser);
        this.mScanResultList = (CustomPullDownRefreshLinearLayout) view.findViewById(C3602R.C3604id.wifi_refresh_container);
        this.mTitleBar = view.findViewById(C3602R.C3604id.title_bar);
        this.mPasswordEditor = (EditText) view.findViewById(C3602R.C3604id.wifi_password_editor);
        this.mPasswordEditorAbove = (EditText) view.findViewById(C3602R.C3604id.wifi_password_editor_above);
        this.mCheckbox = (CheckBox) view.findViewById(C3602R.C3604id.check_box_save_passwd);
        this.mScanWifi = view.findViewById(C3602R.C3604id.searching_text);
        this.mWifiPassContainer = view.findViewById(C3602R.C3604id.wifi_setting_pass_container);
        this.mConnectList = (ListView) view.findViewById(C3602R.C3604id.conn_wifi_list);
        this.mUnConnectList = (ListView) view.findViewById(C3602R.C3604id.unconn_wifi_list);
        this.mPasswordToggle = (TextView) view.findViewById(C3602R.C3604id.wifi_password_toggle);
        this.mShowScanResultToggle = (ImageView) view.findViewById(C3602R.C3604id.wifi_ssid_toggle);
        this.mResizeLayout = (ResizeLayout) view.findViewById(C3602R.C3604id.choose_wifi_ui);
        this.mScrollWifiList = (ScrollView) view.findViewById(C3602R.C3604id.wifi_list_scroll_view);
        this.mReturnBtn = view.findViewById(C3602R.C3604id.module_a_3_return_btn);
    }

    public boolean onBackPressed() {
        if (this.mScanResultList.getVisibility() == 0) {
            hideWifiList();
            return true;
        }
        finishSmartConfig(false);
        return true;
    }

    public void onCreateStep(Context context) {
        setContentView(context, C3602R.layout.smart_config_wifi_choose_ui);
        this.mWifiManager = (WifiManager) context.getSystemService("wifi");
        this.mNextBtn.setText(C3602R.string.next_button);
        this.mDeviceInfo.setText(String.format(context.getString(C3602R.string.kuailian_main_title_2), new Object[0]));
        this.mReturnBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ChooseWifiStep.this.finishSmartConfig(false);
            }
        });
        this.mResizeLayout.setResizeListener(new ResizeLayout.ResizeListener() {
            public void onSizeChanged(int i, int i2) {
            }
        });
        this.mDeviceIcon.setImageResource(C3602R.C3603drawable.kuailian_wifi_icon);
        checkWifiState();
        this.mWifiChooser.setText("");
        this.mWifiChooser.setEnabled(false);
        this.mScanWifi.setVisibility(0);
        this.mNextBtn.setEnabled(false);
        this.mNextBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                InputMethodManager inputMethodManager = (InputMethodManager) ChooseWifiStep.this.mContext.getSystemService("input_method");
                if (inputMethodManager.isActive()) {
                    Context context = ChooseWifiStep.this.mContext;
                    if ((context instanceof Activity) && ((Activity) context).getCurrentFocus() != null) {
                        inputMethodManager.hideSoftInputFromWindow(((Activity) ChooseWifiStep.this.mContext).getCurrentFocus().getWindowToken(), 2);
                    }
                }
                String obj = ChooseWifiStep.this.mPasswordEditor.getText().toString();
                if (ConnectionUtils.getSecurity(ChooseWifiStep.this.mChooseScanResult) == 0) {
                    ChooseWifiStep.this.saveWifiItem("");
                }
                if (!TextUtils.isEmpty(obj) && ChooseWifiStep.this.mCheckbox.isChecked()) {
                    ChooseWifiStep.this.saveWifiItem(obj);
                }
                SmartConfigDataProvider.getInstance().set(SmartConfigDataProvider.KEY_SELECTED_AP, ChooseWifiStep.this.mChooseScanResult);
                SmartConfigDataProvider.getInstance().set(SmartConfigDataProvider.KEY_SELECTED_AP_SSID, ChooseWifiStep.this.mChooseScanResult.SSID);
                WifiAccount.WifiItem account = ServiceManager.getInstance().getWifiAccount().getAccount(ChooseWifiStep.this.mChooseScanResult.BSSID);
                if (account != null) {
                    SmartConfigDataProvider.getInstance().set(SmartConfigDataProvider.KEY_SELECTED_AP_PASSWD, account.passwd);
                } else if (!TextUtils.isEmpty(obj)) {
                    SmartConfigDataProvider.getInstance().set(SmartConfigDataProvider.KEY_SELECTED_AP_PASSWD, obj);
                }
                ChooseWifiStep.this.finishCurrentStep();
            }
        });
        this.mWifiPassContainer.setVisibility(8);
        this.mCheckbox.setVisibility(8);
        if (Build.VERSION.SDK_INT < 17) {
            CheckBox checkBox = this.mCheckbox;
            checkBox.setPadding(checkBox.getPaddingLeft() + DisplayUtils.dip2px(this.mContext, 18.0f), this.mCheckbox.getPaddingTop(), this.mCheckbox.getPaddingRight(), this.mCheckbox.getPaddingBottom());
        }
        this.mPasswordEditor.setText("");
        String str = (String) SmartConfigDataProvider.getInstance().get(SmartConfigDataProvider.KEY_DEVICE_MODEL);
        if (str != null && str.equals("mijia.camera.v1")) {
            this.mSupport5G = true;
        }
        this.mPasswordEditor.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
                ChooseWifiStep.this.checkConfirmEnabled();
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.mScanResultList.setScrollView(this.mScrollWifiList);
        this.mScanResultList.setRefreshListener(new CustomPullDownRefreshLinearLayout.OnRefreshListener() {
            public void startRefresh() {
                ChooseWifiStep.this.mWifiManager.startScan();
                boolean unused = ChooseWifiStep.this.mIsScanning = true;
            }
        });
        this.mWifiChooser.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ChooseWifiStep.this.mPasswordEditorAbove.clearFocus();
                ChooseWifiStep.this.showWifiList();
                BaseAdapter unused = ChooseWifiStep.this.mConnAdapter = new ConnWifiAdapter();
                ChooseWifiStep.this.mConnectList.setAdapter(ChooseWifiStep.this.mConnAdapter);
                BaseAdapter unused2 = ChooseWifiStep.this.mUnConnectAdapter = new UnConnWifiAdapter();
                ChooseWifiStep.this.mUnConnectList.setAdapter(ChooseWifiStep.this.mUnConnectAdapter);
            }
        });
        this.mPasswordToggle.setEnabled(false);
        this.mPasswordToggle.setSelected(true);
        this.mPasswordToggle.setText(C3602R.string.smart_config_hide_passwd);
        this.mPasswordToggle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int i;
                TextView textView;
                int selectionStart = ChooseWifiStep.this.mPasswordEditor.getSelectionStart();
                if (!ChooseWifiStep.this.mPasswordToggle.isSelected()) {
                    ChooseWifiStep.this.mPasswordEditor.setInputType(BluetoothConstants.MSG_READ_RSSI);
                    ChooseWifiStep.this.mPasswordToggle.setSelected(true);
                    textView = ChooseWifiStep.this.mPasswordToggle;
                    i = C3602R.string.smart_config_hide_passwd;
                } else {
                    ChooseWifiStep.this.mPasswordEditor.setInputType(129);
                    ChooseWifiStep.this.mPasswordToggle.setSelected(false);
                    textView = ChooseWifiStep.this.mPasswordToggle;
                    i = C3602R.string.smart_config_show_passwd;
                }
                textView.setText(i);
                ChooseWifiStep.this.mPasswordEditor.setSelection(selectionStart);
            }
        });
        this.mPasswordEditorAbove.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    ChooseWifiStep.this.mPasswordEditor.setVisibility(0);
                    ChooseWifiStep.this.mPasswordEditorAbove.setVisibility(8);
                    ChooseWifiStep.this.mPasswordEditor.requestFocus();
                    ChooseWifiStep.this.mPasswordToggle.setEnabled(true);
                }
                return true;
            }
        });
        this.mShowScanResultToggle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ChooseWifiStep.this.showWifiList();
                BaseAdapter unused = ChooseWifiStep.this.mConnAdapter = new ConnWifiAdapter();
                ChooseWifiStep.this.mConnectList.setAdapter(ChooseWifiStep.this.mConnAdapter);
                BaseAdapter unused2 = ChooseWifiStep.this.mUnConnectAdapter = new UnConnWifiAdapter();
                ChooseWifiStep.this.mUnConnectList.setAdapter(ChooseWifiStep.this.mUnConnectAdapter);
            }
        });
        this.mShowScanResultToggle.setEnabled(false);
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
    public void refreshInnerWifi() {
        if (this.mIsScanning) {
            this.mIsScanning = false;
            final ArrayList arrayList = new ArrayList();
            final ArrayList arrayList2 = new ArrayList();
            final ArrayList arrayList3 = new ArrayList();
            new AsyncTask<Object, Void, ScanResult>() {
                /* access modifiers changed from: protected */
                public ScanResult doInBackground(Object... objArr) {
                    WifiInfo connectionInfo = ChooseWifiStep.this.mWifiManager.getConnectionInfo();
                    List<ScanResult> scanResults = ChooseWifiStep.this.mWifiManager.getScanResults();
                    if (scanResults == null) {
                        return null;
                    }
                    ChooseWifiStep.this.mAllScanResults.clear();
                    ChooseWifiStep.this.m5GScanResult.clear();
                    ChooseWifiStep.this.mUnconnectResult.clear();
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    int i = 0;
                    String str = null;
                    for (int i2 = 0; i2 < scanResults.size(); i2++) {
                        if (!TextUtils.isEmpty(scanResults.get(i2).SSID) && DeviceUtils.isMiioAP(scanResults.get(i2)) == DeviceUtils.AP_TYPE.AP_NONE) {
                            WifiAccount.WifiItem account = ServiceManager.getInstance().getWifiAccount().getAccount(scanResults.get(i2).BSSID);
                            if (connectionInfo != null && ConnectionUtils.isEqualWifi(connectionInfo.getSSID(), scanResults.get(i2).SSID) && scanResults.get(i2).frequency > 5000) {
                                String[] split = scanResults.get(i2).BSSID.split("\\:");
                                str = String.format("%1$s:%2$s:%3$s:%4$s:%5$s:%6$x", new Object[]{split[0], split[1], split[2], split[3], split[4], Integer.valueOf(Integer.valueOf(split[5], 16).intValue() - 1)});
                            }
                            if ((scanResults.get(i2).frequency > 5000 && !ChooseWifiStep.this.mSupport5G) || scanResults.get(i2).capabilities.contains("WEP") || scanResults.get(i2).capabilities.contains("EAP") || scanResults.get(i2).capabilities.contains("WAPI-KEY") || scanResults.get(i2).capabilities.contains("WAPI-PSK") || scanResults.get(i2).capabilities.contains("WAPI-CERT") || ConnectionUtils.getSecurity(scanResults.get(i2)) == 0 || scanResults.get(i2).level == 0 || ConnectionUtils.isContainUnsupportChar(scanResults.get(i2).SSID)) {
                                if (scanResults.get(i2).frequency > 5000 && !ChooseWifiStep.this.mSupport5G) {
                                    arrayList2.add(scanResults.get(i2));
                                }
                                if (!hashMap2.containsKey(scanResults.get(i2).SSID)) {
                                    arrayList3.add(scanResults.get(i2));
                                    hashMap2.put(scanResults.get(i2).SSID, scanResults.get(i2));
                                } else if (ConnectionUtils.calculateSignalLevel(scanResults.get(i2).level, 100) > ConnectionUtils.calculateSignalLevel(((ScanResult) hashMap2.get(scanResults.get(i2).SSID)).level, 100)) {
                                    ScanResult scanResult = (ScanResult) hashMap2.get(scanResults.get(i2).SSID);
                                    hashMap.remove(scanResult.SSID);
                                    hashMap.put(scanResults.get(i2).SSID, scanResults.get(i2));
                                    arrayList3.remove(scanResult);
                                    arrayList3.add(scanResult);
                                }
                            } else if (!hashMap.containsKey(scanResults.get(i2).SSID)) {
                                arrayList.add(scanResults.get(i2));
                                hashMap.put(scanResults.get(i2).SSID, scanResults.get(i2));
                            } else if (ConnectionUtils.calculateSignalLevel(scanResults.get(i2).level, 100) > ConnectionUtils.calculateSignalLevel(((ScanResult) hashMap.get(scanResults.get(i2).SSID)).level, 100)) {
                                ScanResult scanResult2 = (ScanResult) hashMap.get(scanResults.get(i2).SSID);
                                hashMap.remove(scanResult2.SSID);
                                hashMap.put(scanResults.get(i2).SSID, scanResults.get(i2));
                                arrayList.remove(scanResult2);
                                arrayList3.remove(scanResult2);
                                arrayList3.add(scanResults.get(i2));
                            }
                        }
                    }
                    C37251 r0 = new Comparator<ScanResult>() {
                        public int compare(ScanResult scanResult, ScanResult scanResult2) {
                            return scanResult.SSID.compareTo(scanResult2.SSID);
                        }
                    };
                    Collections.sort(arrayList, r0);
                    Collections.sort(arrayList3, r0);
                    if (ChooseWifiStep.this.mChooseScanResult != null) {
                        while (i < arrayList.size() && !ChooseWifiStep.this.mChooseScanResult.BSSID.equalsIgnoreCase(((ScanResult) arrayList.get(i)).BSSID)) {
                            if (str != null && ChooseWifiStep.this.mChooseScanResult.BSSID.equalsIgnoreCase(str)) {
                                return null;
                            }
                            i++;
                        }
                        return null;
                    } else if (connectionInfo == null || connectionInfo.getBSSID() == null) {
                        return null;
                    } else {
                        while (i < arrayList.size()) {
                            if (connectionInfo.getBSSID().equalsIgnoreCase(((ScanResult) arrayList.get(i)).BSSID) || (str != null && ((ScanResult) arrayList.get(i)).BSSID.equalsIgnoreCase(str))) {
                                return (ScanResult) arrayList.get(i);
                            }
                            i++;
                        }
                        return null;
                    }
                }

                /* access modifiers changed from: protected */
                public void onPostExecute(ScanResult scanResult) {
                    ChooseWifiStep chooseWifiStep = ChooseWifiStep.this;
                    if (!chooseWifiStep.mIsFinished) {
                        chooseWifiStep.mAllScanResults.clear();
                        ChooseWifiStep.this.mAllScanResults.addAll(arrayList);
                        ChooseWifiStep.this.m5GScanResult.clear();
                        ChooseWifiStep.this.m5GScanResult.addAll(arrayList2);
                        ChooseWifiStep.this.mUnconnectResult.clear();
                        ChooseWifiStep.this.mUnconnectResult.addAll(arrayList3);
                        if (!ChooseWifiStep.this.checkWifiList()) {
                            ScanResult unused = ChooseWifiStep.this.mChooseScanResult = scanResult;
                            if (ChooseWifiStep.this.mChooseScanResult == null) {
                                ChooseWifiStep.this.mWifiChooser.setText(C3602R.string.wifi_setting_choose);
                            } else {
                                ChooseWifiStep.this.mWifiChooser.setText(ChooseWifiStep.this.mChooseScanResult.SSID);
                            }
                            ChooseWifiStep.this.mScanWifi.setVisibility(8);
                            boolean unused2 = ChooseWifiStep.this.mIsScanning = false;
                            ChooseWifiStep chooseWifiStep2 = ChooseWifiStep.this;
                            chooseWifiStep2.checkShowPassword(chooseWifiStep2.mChooseScanResult);
                            ChooseWifiStep.this.checkConfirmEnabled();
                            ChooseWifiStep.this.mPasswordEditor.setEnabled(true);
                            ChooseWifiStep.this.mWifiChooser.setEnabled(true);
                            ChooseWifiStep.this.mShowScanResultToggle.setEnabled(true);
                            if (ChooseWifiStep.this.mScanResultList.getVisibility() == 0) {
                                ChooseWifiStep.this.mConnAdapter.notifyDataSetChanged();
                                ChooseWifiStep.this.mUnConnectAdapter.notifyDataSetChanged();
                                ChooseWifiStep.this.mScanResultList.postRefresh();
                            }
                        }
                    }
                }
            }.execute(new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public void showWifiList() {
        this.mScanResultList.setVisibility(0);
        this.mScanResultList.startAnimation(AnimationUtils.loadAnimation(this.mContext, C3602R.anim.v5_dialog_enter));
    }
}
