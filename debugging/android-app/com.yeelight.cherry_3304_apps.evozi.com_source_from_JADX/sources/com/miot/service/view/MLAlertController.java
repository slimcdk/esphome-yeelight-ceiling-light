package com.miot.service.view;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.miot.service.C3602R;
import com.miot.service.view.MLAlertDialog;
import java.lang.ref.WeakReference;

public class MLAlertController {
    private static final int BIT_BUTTON_NEGATIVE = 2;
    private static final int BIT_BUTTON_NEUTRAL = 4;
    private static final int BIT_BUTTON_POSITIVE = 1;
    /* access modifiers changed from: private */
    public ListAdapter mAdapter;
    private int mAlertDialogLayout;
    /* access modifiers changed from: private */
    public boolean mAutoDismiss;
    View.OnClickListener mButtonHandler;
    /* access modifiers changed from: private */
    public Button mButtonNegative;
    /* access modifiers changed from: private */
    public Message mButtonNegativeMessage;
    private CharSequence mButtonNegativeText;
    private int mButtonNegativeTextColor;
    /* access modifiers changed from: private */
    public Button mButtonNeutral;
    /* access modifiers changed from: private */
    public Message mButtonNeutralMessage;
    private CharSequence mButtonNeutralText;
    private int mButtonNeutralTextColor;
    /* access modifiers changed from: private */
    public Button mButtonPositive;
    /* access modifiers changed from: private */
    public Message mButtonPositiveMessage;
    private CharSequence mButtonPositiveText;
    private int mButtonPositiveTextColor;
    /* access modifiers changed from: private */
    public int mCheckedItem;
    private final Context mContext;
    private boolean mCustomBgTransplant;
    private View mCustomTitleView;
    /* access modifiers changed from: private */
    public final DialogInterface mDialogInterface;
    private boolean mForceInverseBackground;
    /* access modifiers changed from: private */
    public int mGravity;
    /* access modifiers changed from: private */
    public Handler mHandler;
    private Drawable mIcon;
    private int mIconId;
    private ImageView mIconView;
    /* access modifiers changed from: private */
    public int mListItemLayout;
    /* access modifiers changed from: private */
    public int mListLayout;
    /* access modifiers changed from: private */
    public int mListLayoutWithTitle;
    /* access modifiers changed from: private */
    public ListView mListView;
    private CharSequence mMessage;
    private SpannableStringBuilder mMessageBuilder;
    private TextView mMessageView;
    /* access modifiers changed from: private */
    public int mMultiChoiceItemLayout;
    private ScrollView mScrollView;
    /* access modifiers changed from: private */
    public int mSingleChoiceItemLayout;
    private CharSequence mTitle;
    private TextView mTitleView;
    /* access modifiers changed from: private */
    public boolean mTransplantBg;
    /* access modifiers changed from: private */
    public View mView;
    private int mViewSpacingBottom;
    private int mViewSpacingLeft;
    private int mViewSpacingRight;
    private boolean mViewSpacingSpecified;
    private int mViewSpacingTop;
    private final Window mWindow;

    public static class AlertParams {
        public ListAdapter mAdapter;
        public boolean mAutoDismiss = true;
        public int mButtonNegativeTextColor = -1;
        public int mButtonNeutralTextColor = -1;
        public int mButtonPositiveTextColor = -1;
        public boolean mCancelable;
        public int mCheckedItem = -1;
        public boolean[] mCheckedItems;
        public final Context mContext;
        public Cursor mCursor;
        public boolean mCustomBgTransplant = false;
        public CharSequence mCustomTitle;
        public View mCustomTitleView;
        public MLAlertDialog.DismissCallBack mDismissCallBack;
        public boolean mForceInverseBackground;
        public Drawable mIcon;
        public int mIconId = 0;
        public final LayoutInflater mInflater;
        public String mIsCheckedColumn;
        public boolean mIsMultiChoice;
        public boolean mIsSingleChoice;
        public CharSequence[] mItems;
        public String mLabelColumn;
        public SpannableStringBuilder mMesageBuilder;
        public CharSequence mMessage;
        public DialogInterface.OnClickListener mNegativeButtonListener;
        public CharSequence mNegativeButtonText;
        public DialogInterface.OnClickListener mNeutralButtonListener;
        public CharSequence mNeutralButtonText;
        public DialogInterface.OnCancelListener mOnCancelListener;
        public DialogInterface.OnMultiChoiceClickListener mOnCheckboxClickListener;
        public DialogInterface.OnClickListener mOnClickListener;
        public AdapterView.OnItemSelectedListener mOnItemSelectedListener;
        public DialogInterface.OnKeyListener mOnKeyListener;
        public OnPrepareListViewListener mOnPrepareListViewListener;
        public DialogInterface.OnClickListener mPositiveButtonListener;
        public CharSequence mPositiveButtonText;
        public boolean mRecycleOnMeasure = true;
        public CharSequence mTitle;
        public View mView;
        public int mViewSpacingBottom;
        public int mViewSpacingLeft;
        public int mViewSpacingRight;
        public boolean mViewSpacingSpecified = false;
        public int mViewSpacingTop;

        public interface OnPrepareListViewListener {
            void onPrepareListView(ListView listView);
        }

        public AlertParams(Context context) {
            this.mContext = context;
            this.mCancelable = true;
            this.mInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0083  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x008a  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0095  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void createCenterListView(final com.miot.service.view.MLAlertController r12) {
            /*
                r11 = this;
                android.view.LayoutInflater r0 = r11.mInflater
                int r1 = r12.mListLayoutWithTitle
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                int r1 = com.miot.service.C3602R.C3604id.select_dialog_listview
                android.view.View r1 = r0.findViewById(r1)
                com.miot.service.view.MLAlertController$RecycleListView r1 = (com.miot.service.view.MLAlertController.RecycleListView) r1
                int r4 = com.miot.service.C3602R.layout.ml_center_item
                android.database.Cursor r2 = r11.mCursor
                r8 = 1
                if (r2 != 0) goto L_0x002d
                android.widget.ListAdapter r2 = r11.mAdapter
                if (r2 == 0) goto L_0x0021
                goto L_0x0045
            L_0x0021:
                android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
                android.content.Context r3 = r11.mContext
                int r5 = com.miot.service.C3602R.C3604id.text1
                java.lang.CharSequence[] r6 = r11.mItems
                r2.<init>(r3, r4, r5, r6)
                goto L_0x0045
            L_0x002d:
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r11.mContext
                android.database.Cursor r5 = r11.mCursor
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r2 = r11.mLabelColumn
                r7 = 0
                r6[r7] = r2
                int[] r10 = new int[r8]
                int r2 = com.miot.service.C3602R.C3604id.text1
                r10[r7] = r2
                r2 = r9
                r7 = r10
                r2.<init>(r3, r4, r5, r6, r7)
            L_0x0045:
                java.lang.CharSequence r3 = r11.mCustomTitle
                if (r3 == 0) goto L_0x0056
                int r3 = com.miot.service.C3602R.C3604id.title
                android.view.View r3 = r0.findViewById(r3)
                android.widget.TextView r3 = (android.widget.TextView) r3
                java.lang.CharSequence r4 = r11.mCustomTitle
                r3.setText(r4)
            L_0x0056:
                com.miot.service.view.MLAlertController$AlertParams$OnPrepareListViewListener r3 = r11.mOnPrepareListViewListener
                if (r3 == 0) goto L_0x005d
                r3.onPrepareListView(r1)
            L_0x005d:
                android.widget.ListAdapter unused = r12.mAdapter = r2
                r1.setAdapter(r2)
                int r2 = r11.mCheckedItem
                int unused = r12.mCheckedItem = r2
                android.content.DialogInterface$OnClickListener r2 = r11.mOnClickListener
                if (r2 == 0) goto L_0x0075
                com.miot.service.view.MLAlertController$AlertParams$1 r2 = new com.miot.service.view.MLAlertController$AlertParams$1
                r2.<init>(r12)
            L_0x0071:
                r1.setOnItemClickListener(r2)
                goto L_0x007f
            L_0x0075:
                android.content.DialogInterface$OnMultiChoiceClickListener r2 = r11.mOnCheckboxClickListener
                if (r2 == 0) goto L_0x007f
                com.miot.service.view.MLAlertController$AlertParams$2 r2 = new com.miot.service.view.MLAlertController$AlertParams$2
                r2.<init>(r1, r12)
                goto L_0x0071
            L_0x007f:
                android.widget.AdapterView$OnItemSelectedListener r2 = r11.mOnItemSelectedListener
                if (r2 == 0) goto L_0x0086
                r1.setOnItemSelectedListener(r2)
            L_0x0086:
                android.widget.AdapterView$OnItemSelectedListener r2 = r11.mOnItemSelectedListener
                if (r2 == 0) goto L_0x008d
                r1.setOnItemSelectedListener(r2)
            L_0x008d:
                boolean r2 = r11.mIsSingleChoice
                if (r2 == 0) goto L_0x0095
                r1.setChoiceMode(r8)
                goto L_0x009d
            L_0x0095:
                boolean r2 = r11.mIsMultiChoice
                if (r2 == 0) goto L_0x009d
                r2 = 2
                r1.setChoiceMode(r2)
            L_0x009d:
                boolean r2 = r11.mRecycleOnMeasure
                r1.mRecycleOnMeasure = r2
                android.view.View unused = r12.mView = r0
                boolean unused = r12.mTransplantBg = r8
                boolean r0 = r11.mCustomBgTransplant
                r12.setCustomTransplant(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.miot.service.view.MLAlertController.AlertParams.createCenterListView(com.miot.service.view.MLAlertController):void");
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v2 */
        /* JADX WARNING: type inference failed for: r2v6, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v27, types: [com.miot.service.view.MLAlertController$AlertParams$4] */
        /* JADX WARNING: type inference failed for: r1v28, types: [com.miot.service.view.MLAlertController$AlertParams$3] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00a4  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00a8  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void createListView(final com.miot.service.view.MLAlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.mInflater
                int r1 = r11.mListLayout
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                com.miot.service.view.MLAlertController$RecycleListView r0 = (com.miot.service.view.MLAlertController.RecycleListView) r0
                boolean r1 = r10.mIsMultiChoice
                r8 = 1
                if (r1 == 0) goto L_0x0038
                android.database.Cursor r1 = r10.mCursor
                if (r1 != 0) goto L_0x0029
                com.miot.service.view.MLAlertController$AlertParams$3 r9 = new com.miot.service.view.MLAlertController$AlertParams$3
                android.content.Context r3 = r10.mContext
                int r4 = r11.mMultiChoiceItemLayout
                int r5 = com.miot.service.C3602R.C3604id.text1
                java.lang.CharSequence[] r6 = r10.mItems
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x0073
            L_0x0029:
                com.miot.service.view.MLAlertController$AlertParams$4 r9 = new com.miot.service.view.MLAlertController$AlertParams$4
                android.content.Context r3 = r10.mContext
                android.database.Cursor r4 = r10.mCursor
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x0073
            L_0x0038:
                boolean r1 = r10.mIsSingleChoice
                if (r1 == 0) goto L_0x0041
                int r1 = r11.mSingleChoiceItemLayout
                goto L_0x0045
            L_0x0041:
                int r1 = r11.mListItemLayout
            L_0x0045:
                r4 = r1
                android.database.Cursor r1 = r10.mCursor
                if (r1 != 0) goto L_0x005c
                android.widget.ListAdapter r1 = r10.mAdapter
                if (r1 == 0) goto L_0x004f
                goto L_0x005a
            L_0x004f:
                android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
                android.content.Context r2 = r10.mContext
                int r3 = com.miot.service.C3602R.C3604id.text1
                java.lang.CharSequence[] r5 = r10.mItems
                r1.<init>(r2, r4, r3, r5)
            L_0x005a:
                r9 = r1
                goto L_0x0073
            L_0x005c:
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.mContext
                android.database.Cursor r5 = r10.mCursor
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.mLabelColumn
                r2 = 0
                r6[r2] = r1
                int[] r7 = new int[r8]
                int r1 = com.miot.service.C3602R.C3604id.text1
                r7[r2] = r1
                r2 = r9
                r2.<init>(r3, r4, r5, r6, r7)
            L_0x0073:
                com.miot.service.view.MLAlertController$AlertParams$OnPrepareListViewListener r1 = r10.mOnPrepareListViewListener
                if (r1 == 0) goto L_0x007a
                r1.onPrepareListView(r0)
            L_0x007a:
                android.widget.ListAdapter unused = r11.mAdapter = r9
                int r1 = r10.mCheckedItem
                int unused = r11.mCheckedItem = r1
                android.content.DialogInterface$OnClickListener r1 = r10.mOnClickListener
                if (r1 == 0) goto L_0x008f
                com.miot.service.view.MLAlertController$AlertParams$5 r1 = new com.miot.service.view.MLAlertController$AlertParams$5
                r1.<init>(r11)
            L_0x008b:
                r0.setOnItemClickListener(r1)
                goto L_0x0099
            L_0x008f:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.mOnCheckboxClickListener
                if (r1 == 0) goto L_0x0099
                com.miot.service.view.MLAlertController$AlertParams$6 r1 = new com.miot.service.view.MLAlertController$AlertParams$6
                r1.<init>(r0, r11)
                goto L_0x008b
            L_0x0099:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.mOnItemSelectedListener
                if (r1 == 0) goto L_0x00a0
                r0.setOnItemSelectedListener(r1)
            L_0x00a0:
                boolean r1 = r10.mIsSingleChoice
                if (r1 == 0) goto L_0x00a8
                r0.setChoiceMode(r8)
                goto L_0x00b0
            L_0x00a8:
                boolean r1 = r10.mIsMultiChoice
                if (r1 == 0) goto L_0x00b0
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00b0:
                boolean r1 = r10.mRecycleOnMeasure
                r0.mRecycleOnMeasure = r1
                android.widget.ListView unused = r11.mListView = r0
                boolean r0 = r10.mCustomBgTransplant
                r11.setCustomTransplant(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.miot.service.view.MLAlertController.AlertParams.createListView(com.miot.service.view.MLAlertController):void");
        }

        public void apply(MLAlertController mLAlertController) {
            View view = this.mCustomTitleView;
            if (view != null) {
                mLAlertController.setCustomTitle(view);
            } else {
                CharSequence charSequence = this.mTitle;
                if (charSequence != null) {
                    mLAlertController.setTitle(charSequence);
                }
                Drawable drawable = this.mIcon;
                if (drawable != null) {
                    mLAlertController.setIcon(drawable);
                }
                int i = this.mIconId;
                if (i >= 0) {
                    mLAlertController.setIcon(i);
                }
            }
            CharSequence charSequence2 = this.mMessage;
            if (charSequence2 != null) {
                mLAlertController.setMessage(charSequence2);
            }
            SpannableStringBuilder spannableStringBuilder = this.mMesageBuilder;
            if (spannableStringBuilder != null) {
                mLAlertController.setMessage(spannableStringBuilder);
            }
            CharSequence charSequence3 = this.mPositiveButtonText;
            if (charSequence3 != null) {
                mLAlertController.setButton(-1, charSequence3, this.mPositiveButtonListener, (Message) null);
            }
            CharSequence charSequence4 = this.mNegativeButtonText;
            if (charSequence4 != null) {
                mLAlertController.setButton(-2, charSequence4, this.mNegativeButtonListener, (Message) null);
            }
            CharSequence charSequence5 = this.mNeutralButtonText;
            if (charSequence5 != null) {
                mLAlertController.setButton(-3, charSequence5, this.mNeutralButtonListener, (Message) null);
            }
            if (this.mForceInverseBackground) {
                mLAlertController.setInverseBackgroundForced(true);
            }
            boolean unused = mLAlertController.mTransplantBg = false;
            if (!(this.mItems == null && this.mCursor == null && this.mAdapter == null)) {
                if (mLAlertController.mGravity == 17) {
                    createCenterListView(mLAlertController);
                } else {
                    createListView(mLAlertController);
                }
            }
            View view2 = this.mView;
            if (view2 != null) {
                if (this.mViewSpacingSpecified) {
                    mLAlertController.setView(view2, this.mViewSpacingLeft, this.mViewSpacingTop, this.mViewSpacingRight, this.mViewSpacingBottom);
                } else {
                    mLAlertController.setView(view2);
                }
            }
            mLAlertController.setAudoDismiss(this.mAutoDismiss);
            mLAlertController.setCustomTransplant(this.mCustomBgTransplant);
            int i2 = this.mButtonPositiveTextColor;
            if (i2 != -1) {
                mLAlertController.setBtnTextColor(-1, i2);
            }
            if (this.mButtonNegativeTextColor != -1) {
                mLAlertController.setBtnTextColor(-2, this.mButtonPositiveTextColor);
            }
            if (this.mButtonNeutralTextColor != -1) {
                mLAlertController.setBtnTextColor(-3, this.mButtonPositiveTextColor);
            }
        }
    }

    private static final class ButtonHandler extends Handler {
        private static final int MSG_DISMISS_DIALOG = 1;
        private WeakReference<DialogInterface> mDialog;

        public ButtonHandler(DialogInterface dialogInterface) {
            this.mDialog = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.mDialog.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class RecycleListView extends ListView {
        boolean mRecycleOnMeasure = true;

        public RecycleListView(Context context) {
            super(context);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public RecycleListView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }

        /* access modifiers changed from: protected */
        public boolean recycleOnMeasure() {
            return this.mRecycleOnMeasure;
        }
    }

    public MLAlertController(Context context, DialogInterface dialogInterface, Window window) {
        this(context, dialogInterface, window, 80);
    }

    public MLAlertController(Context context, DialogInterface dialogInterface, Window window, int i) {
        this.mViewSpacingSpecified = false;
        this.mButtonPositiveTextColor = -1;
        this.mButtonNegativeTextColor = -1;
        this.mButtonNeutralTextColor = -1;
        this.mIconId = -1;
        this.mCheckedItem = -1;
        this.mTransplantBg = false;
        this.mAutoDismiss = true;
        this.mCustomBgTransplant = false;
        this.mButtonHandler = new View.OnClickListener() {
            /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x0057  */
            /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onClick(android.view.View r3) {
                /*
                    r2 = this;
                    com.miot.service.view.MLAlertController r0 = com.miot.service.view.MLAlertController.this
                    android.widget.Button r0 = r0.mButtonPositive
                    if (r3 != r0) goto L_0x001b
                    com.miot.service.view.MLAlertController r0 = com.miot.service.view.MLAlertController.this
                    android.os.Message r0 = r0.mButtonPositiveMessage
                    if (r0 == 0) goto L_0x001b
                    com.miot.service.view.MLAlertController r3 = com.miot.service.view.MLAlertController.this
                    android.os.Message r3 = r3.mButtonPositiveMessage
                L_0x0016:
                    android.os.Message r3 = android.os.Message.obtain(r3)
                    goto L_0x004a
                L_0x001b:
                    com.miot.service.view.MLAlertController r0 = com.miot.service.view.MLAlertController.this
                    android.widget.Button r0 = r0.mButtonNegative
                    if (r3 != r0) goto L_0x0032
                    com.miot.service.view.MLAlertController r0 = com.miot.service.view.MLAlertController.this
                    android.os.Message r0 = r0.mButtonNegativeMessage
                    if (r0 == 0) goto L_0x0032
                    com.miot.service.view.MLAlertController r3 = com.miot.service.view.MLAlertController.this
                    android.os.Message r3 = r3.mButtonNegativeMessage
                    goto L_0x0016
                L_0x0032:
                    com.miot.service.view.MLAlertController r0 = com.miot.service.view.MLAlertController.this
                    android.widget.Button r0 = r0.mButtonNeutral
                    if (r3 != r0) goto L_0x0049
                    com.miot.service.view.MLAlertController r3 = com.miot.service.view.MLAlertController.this
                    android.os.Message r3 = r3.mButtonNeutralMessage
                    if (r3 == 0) goto L_0x0049
                    com.miot.service.view.MLAlertController r3 = com.miot.service.view.MLAlertController.this
                    android.os.Message r3 = r3.mButtonNeutralMessage
                    goto L_0x0016
                L_0x0049:
                    r3 = 0
                L_0x004a:
                    if (r3 == 0) goto L_0x004f
                    r3.sendToTarget()
                L_0x004f:
                    com.miot.service.view.MLAlertController r3 = com.miot.service.view.MLAlertController.this
                    boolean r3 = r3.mAutoDismiss
                    if (r3 == 0) goto L_0x006b
                    com.miot.service.view.MLAlertController r3 = com.miot.service.view.MLAlertController.this
                    android.os.Handler r3 = r3.mHandler
                    r0 = 1
                    com.miot.service.view.MLAlertController r1 = com.miot.service.view.MLAlertController.this
                    android.content.DialogInterface r1 = r1.mDialogInterface
                    android.os.Message r3 = r3.obtainMessage(r0, r1)
                    r3.sendToTarget()
                L_0x006b:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.miot.service.view.MLAlertController.C38151.onClick(android.view.View):void");
            }
        };
        this.mContext = context;
        this.mDialogInterface = dialogInterface;
        this.mWindow = window;
        this.mHandler = new ButtonHandler(dialogInterface);
        this.mAlertDialogLayout = C3602R.layout.ml_alert_dialog_layout;
        this.mListLayout = C3602R.layout.ml_select_dialog;
        this.mListLayoutWithTitle = C3602R.layout.ml_select_dialog_center;
        this.mMultiChoiceItemLayout = C3602R.layout.ml_select_dialog_multichoice;
        this.mSingleChoiceItemLayout = C3602R.layout.ml_select_dialog_singlechoice;
        this.mListItemLayout = C3602R.layout.ml_select_dialog_item;
        this.mGravity = i;
    }

    static boolean canTextInput(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (canTextInput(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void centerButton(TextView textView) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        textView.setLayoutParams(layoutParams);
        textView.setBackgroundResource(C3602R.C3603drawable.dialog_btn_selector);
    }

    private void setBackground(LinearLayout linearLayout, LinearLayout linearLayout2, View view, boolean z, boolean z2, View view2) {
        ListAdapter listAdapter;
        int i;
        if (this.mTransplantBg) {
            int color = this.mContext.getResources().getColor(17170445);
            int color2 = this.mContext.getResources().getColor(17170445);
            int color3 = this.mContext.getResources().getColor(17170445);
            int color4 = this.mContext.getResources().getColor(17170445);
            int color5 = this.mContext.getResources().getColor(17170445);
            int color6 = this.mContext.getResources().getColor(17170445);
            int color7 = this.mContext.getResources().getColor(17170445);
            int color8 = this.mContext.getResources().getColor(17170445);
            int color9 = this.mContext.getResources().getColor(17170445);
            View[] viewArr = new View[4];
            boolean[] zArr = new boolean[4];
            if (z2) {
                viewArr[0] = linearLayout;
                zArr[0] = false;
                i = 1;
            } else {
                i = 0;
            }
            viewArr[i] = linearLayout2.getVisibility() == 8 ? null : linearLayout2;
            zArr[i] = this.mListView != null;
            int i2 = i + 1;
            if (view != null) {
                viewArr[i2] = view;
                zArr[i2] = this.mForceInverseBackground;
                i2++;
            }
            if (z) {
                viewArr[i2] = view2;
                zArr[i2] = true;
            }
            View view3 = null;
            boolean z3 = false;
            boolean z4 = false;
            for (int i3 = 0; i3 < 4; i3++) {
                View view4 = viewArr[i3];
                if (view4 != null) {
                    if (view3 != null) {
                        view3.setBackgroundResource(!z4 ? z3 ? color6 : color2 : z3 ? color7 : color3);
                        z4 = true;
                    }
                    z3 = zArr[i3];
                    view3 = view4;
                }
            }
            if (view3 != null) {
                if (z4) {
                    if (z3) {
                        color4 = z ? color9 : color8;
                    }
                    view3.setBackgroundResource(color4);
                } else {
                    if (z3) {
                        color = color5;
                    }
                    view3.setBackgroundResource(color);
                }
            }
        }
        ListView listView = this.mListView;
        if (listView != null && (listAdapter = this.mAdapter) != null) {
            listView.setAdapter(listAdapter);
            int i4 = this.mCheckedItem;
            if (i4 > -1) {
                this.mListView.setItemChecked(i4, true);
                this.mListView.setSelection(this.mCheckedItem);
            }
        }
    }

    private boolean setupButtons() {
        int i;
        Button button;
        Button button2 = (Button) this.mWindow.findViewById(C3602R.C3604id.button1);
        this.mButtonPositive = button2;
        button2.setOnClickListener(this.mButtonHandler);
        if (TextUtils.isEmpty(this.mButtonPositiveText)) {
            this.mButtonPositive.setVisibility(8);
            i = 0;
        } else {
            this.mButtonPositive.setText(this.mButtonPositiveText);
            this.mButtonPositive.setVisibility(0);
            int i2 = this.mButtonPositiveTextColor;
            if (i2 != -1) {
                this.mButtonPositive.setTextColor(i2);
            }
            i = 1;
        }
        Button button3 = (Button) this.mWindow.findViewById(C3602R.C3604id.button2);
        this.mButtonNegative = button3;
        button3.setOnClickListener(this.mButtonHandler);
        if (TextUtils.isEmpty(this.mButtonNegativeText)) {
            this.mButtonNegative.setVisibility(8);
        } else {
            this.mButtonNegative.setText(this.mButtonNegativeText);
            this.mButtonNegative.setVisibility(0);
            i |= 2;
            int i3 = this.mButtonNegativeTextColor;
            if (i3 != -1) {
                this.mButtonNegative.setTextColor(i3);
            }
        }
        Button button4 = (Button) this.mWindow.findViewById(C3602R.C3604id.button3);
        this.mButtonNeutral = button4;
        button4.setOnClickListener(this.mButtonHandler);
        if (TextUtils.isEmpty(this.mButtonNeutralText)) {
            this.mButtonNeutral.setVisibility(8);
        } else {
            this.mButtonNeutral.setText(this.mButtonNeutralText);
            this.mButtonNeutral.setVisibility(0);
            i |= 4;
            int i4 = this.mButtonNeutralTextColor;
            if (i4 != -1) {
                this.mButtonNeutral.setTextColor(i4);
            }
        }
        if (shouldCenterSingleButton(i)) {
            if (i == 1) {
                button = this.mButtonPositive;
            } else if (i == 2) {
                button = this.mButtonNegative;
            } else if (i == 4) {
                button = this.mButtonNeutral;
            }
            centerButton(button);
        }
        return i != 0;
    }

    private void setupContent(LinearLayout linearLayout) {
        ScrollView scrollView = (ScrollView) this.mWindow.findViewById(C3602R.C3604id.scrollView);
        this.mScrollView = scrollView;
        scrollView.setFocusable(false);
        TextView textView = (TextView) this.mWindow.findViewById(C3602R.C3604id.message);
        this.mMessageView = textView;
        if (textView != null) {
            CharSequence charSequence = this.mMessage;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            SpannableStringBuilder spannableStringBuilder = this.mMessageBuilder;
            if (spannableStringBuilder != null) {
                textView.setText(spannableStringBuilder);
                this.mMessageView.setHighlightColor(0);
                this.mMessageView.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            }
            textView.setVisibility(8);
            this.mScrollView.removeView(this.mMessageView);
            if (this.mListView != null) {
                linearLayout.removeView(this.mWindow.findViewById(C3602R.C3604id.scrollView));
                linearLayout.addView(this.mListView, new LinearLayout.LayoutParams(-1, -1));
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
                return;
            }
            linearLayout.setVisibility(8);
        }
    }

    private boolean setupTitle(LinearLayout linearLayout) {
        if (this.mCustomTitleView != null) {
            linearLayout.addView(this.mCustomTitleView, 0, new LinearLayout.LayoutParams(-1, -2));
            this.mWindow.findViewById(C3602R.C3604id.title_template).setVisibility(8);
        } else {
            boolean z = !TextUtils.isEmpty(this.mTitle);
            this.mIconView = (ImageView) this.mWindow.findViewById(C3602R.C3604id.icon);
            if (z) {
                TextView textView = (TextView) this.mWindow.findViewById(C3602R.C3604id.alertTitle);
                this.mTitleView = textView;
                textView.setText(this.mTitle);
                int i = this.mIconId;
                if (i > 0) {
                    this.mIconView.setImageResource(i);
                } else {
                    Drawable drawable = this.mIcon;
                    if (drawable != null) {
                        this.mIconView.setImageDrawable(drawable);
                    } else if (i == 0) {
                        this.mTitleView.setPadding(this.mIconView.getPaddingLeft(), this.mIconView.getPaddingTop(), this.mIconView.getPaddingRight(), this.mIconView.getPaddingBottom());
                        this.mIconView.setVisibility(8);
                    }
                }
            } else {
                this.mWindow.findViewById(C3602R.C3604id.title_template).setVisibility(8);
                this.mIconView.setVisibility(8);
                linearLayout.setVisibility(8);
                return false;
            }
        }
        return true;
    }

    private void setupView() {
        LinearLayout linearLayout = (LinearLayout) this.mWindow.findViewById(C3602R.C3604id.contentPanel);
        setupContent(linearLayout);
        boolean z = setupButtons();
        LinearLayout linearLayout2 = (LinearLayout) this.mWindow.findViewById(C3602R.C3604id.topPanel);
        boolean z2 = setupTitle(linearLayout2);
        View findViewById = this.mWindow.findViewById(C3602R.C3604id.buttonPanel);
        if (!z) {
            findViewById.setVisibility(8);
        }
        FrameLayout frameLayout = (FrameLayout) this.mWindow.findViewById(C3602R.C3604id.customPanel);
        if (this.mView != null) {
            FrameLayout frameLayout2 = (FrameLayout) this.mWindow.findViewById(C3602R.C3604id.custom);
            frameLayout2.addView(this.mView);
            if (this.mViewSpacingSpecified) {
                frameLayout2.setPadding(this.mViewSpacingLeft, this.mViewSpacingTop, this.mViewSpacingRight, this.mViewSpacingBottom);
                if (this.mCustomBgTransplant) {
                    this.mTransplantBg = true;
                }
            }
            if (this.mListView != null) {
                ((LinearLayout.LayoutParams) frameLayout.getLayoutParams()).weight = 0.0f;
            }
        } else {
            frameLayout.setVisibility(8);
        }
        if (this.mTransplantBg) {
            this.mWindow.findViewById(C3602R.C3604id.parentPanel).setBackgroundColor(this.mContext.getResources().getColor(17170445));
        }
        if (this.mListView != null) {
            this.mWindow.findViewById(C3602R.C3604id.title_divider_line).setVisibility(0);
        } else {
            this.mWindow.findViewById(C3602R.C3604id.title_divider_line).setVisibility(8);
            this.mWindow.findViewById(C3602R.C3604id.title_divider_line_bottom).setVisibility(8);
        }
        if (linearLayout2.getVisibility() == 8 && linearLayout.getVisibility() == 8 && frameLayout.getVisibility() == 8 && z) {
            findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingBottom(), findViewById.getPaddingRight(), findViewById.getPaddingBottom());
        }
        setBackground(linearLayout2, linearLayout, frameLayout, z, z2, findViewById);
        if (TextUtils.isEmpty(this.mTitle) && TextUtils.isEmpty(this.mMessage) && this.mMessageBuilder == null) {
            this.mWindow.findViewById(C3602R.C3604id.empty_view).setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.mTitle) && TextUtils.isEmpty(this.mMessage) && this.mMessageBuilder == null && frameLayout.getVisibility() == 8 && z) {
            ((LinearLayout.LayoutParams) findViewById.getLayoutParams()).topMargin = 0;
        }
    }

    private static boolean shouldCenterSingleButton(int i) {
        return i == 1 || i == 2 || i == 4;
    }

    public Button getButton(int i) {
        if (i == -3) {
            return this.mButtonNeutral;
        }
        if (i == -2) {
            return this.mButtonNegative;
        }
        if (i != -1) {
            return null;
        }
        return this.mButtonPositive;
    }

    public ListView getListView() {
        return this.mListView;
    }

    public View getView() {
        return this.mView;
    }

    public void installContent() {
        this.mWindow.requestFeature(1);
        this.mWindow.setGravity(this.mGravity);
        View view = this.mView;
        if (view == null || !canTextInput(view)) {
            this.mWindow.setFlags(131072, 131072);
        }
        this.mWindow.setContentView(this.mAlertDialogLayout);
        setupView();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListView listView;
        if (i == 82 && (listView = this.mListView) != null && listView.getVisibility() == 0) {
            this.mDialogInterface.dismiss();
        }
        ScrollView scrollView = this.mScrollView;
        return scrollView != null && scrollView.executeKeyEvent(keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        ScrollView scrollView = this.mScrollView;
        return scrollView != null && scrollView.executeKeyEvent(keyEvent);
    }

    public void sendDismissMessage() {
        this.mHandler.obtainMessage(1, this.mDialogInterface).sendToTarget();
    }

    public void setAudoDismiss(boolean z) {
        this.mAutoDismiss = z;
    }

    public void setBtnTextColor(int i, int i2) {
        if (i == -3) {
            this.mButtonNeutralTextColor = i2;
        } else if (i == -2) {
            this.mButtonNegativeTextColor = i2;
        } else if (i == -1) {
            this.mButtonPositiveTextColor = i2;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    public void setButton(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message) {
        if (message == null && onClickListener != null) {
            message = this.mHandler.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.mButtonNeutralText = charSequence;
            this.mButtonNeutralMessage = message;
        } else if (i == -2) {
            this.mButtonNegativeText = charSequence;
            this.mButtonNegativeMessage = message;
        } else if (i == -1) {
            this.mButtonPositiveText = charSequence;
            this.mButtonPositiveMessage = message;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    public void setCustomTitle(View view) {
        this.mCustomTitleView = view;
    }

    public void setCustomTransplant(boolean z) {
        this.mCustomBgTransplant = z;
    }

    public void setIcon(int i) {
        this.mIconId = i;
        ImageView imageView = this.mIconView;
        if (imageView == null) {
            return;
        }
        if (i > 0) {
            imageView.setImageResource(i);
        } else if (i == 0) {
            imageView.setVisibility(8);
        }
    }

    public void setIcon(Drawable drawable) {
        this.mIcon = drawable;
        ImageView imageView = this.mIconView;
        if (imageView != null && drawable != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public void setInverseBackgroundForced(boolean z) {
        this.mForceInverseBackground = z;
    }

    public void setMessage(SpannableStringBuilder spannableStringBuilder) {
        this.mMessageBuilder = spannableStringBuilder;
        TextView textView = this.mMessageView;
        if (textView != null) {
            textView.setText(spannableStringBuilder);
            this.mMessageView.setHighlightColor(0);
            this.mMessageView.setText(spannableStringBuilder);
            this.mMessageView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public void setMessage(CharSequence charSequence) {
        this.mMessage = charSequence;
        TextView textView = this.mMessageView;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.mTitle = charSequence;
        TextView textView = this.mTitleView;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void setView(View view) {
        this.mView = view;
        this.mViewSpacingSpecified = false;
    }

    public void setView(View view, int i, int i2, int i3, int i4) {
        this.mView = view;
        this.mViewSpacingSpecified = true;
        this.mViewSpacingLeft = i;
        this.mViewSpacingTop = i2;
        this.mViewSpacingRight = i3;
        this.mViewSpacingBottom = i4;
    }
}
