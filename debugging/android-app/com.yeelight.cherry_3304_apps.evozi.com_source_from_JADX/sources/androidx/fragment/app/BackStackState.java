package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.BackStackRecord;
import java.util.ArrayList;

final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new Parcelable.Creator<BackStackState>() {
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        public BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }
    };
    final int mBreadCrumbShortTitleRes;
    final CharSequence mBreadCrumbShortTitleText;
    final int mBreadCrumbTitleRes;
    final CharSequence mBreadCrumbTitleText;
    final int mIndex;
    final String mName;
    final int[] mOps;
    final boolean mReorderingAllowed;
    final ArrayList<String> mSharedElementSourceNames;
    final ArrayList<String> mSharedElementTargetNames;
    final int mTransition;
    final int mTransitionStyle;

    public BackStackState(Parcel parcel) {
        this.mOps = parcel.createIntArray();
        this.mTransition = parcel.readInt();
        this.mTransitionStyle = parcel.readInt();
        this.mName = parcel.readString();
        this.mIndex = parcel.readInt();
        this.mBreadCrumbTitleRes = parcel.readInt();
        this.mBreadCrumbTitleText = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mBreadCrumbShortTitleRes = parcel.readInt();
        this.mBreadCrumbShortTitleText = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mSharedElementSourceNames = parcel.createStringArrayList();
        this.mSharedElementTargetNames = parcel.createStringArrayList();
        this.mReorderingAllowed = parcel.readInt() != 0;
    }

    public BackStackState(BackStackRecord backStackRecord) {
        int size = backStackRecord.mOps.size();
        this.mOps = new int[(size * 6)];
        if (backStackRecord.mAddToBackStack) {
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                BackStackRecord.C0209Op op = backStackRecord.mOps.get(i2);
                int[] iArr = this.mOps;
                int i3 = i + 1;
                iArr[i] = op.cmd;
                int i4 = i3 + 1;
                Fragment fragment = op.fragment;
                iArr[i3] = fragment != null ? fragment.mIndex : -1;
                int[] iArr2 = this.mOps;
                int i5 = i4 + 1;
                iArr2[i4] = op.enterAnim;
                int i6 = i5 + 1;
                iArr2[i5] = op.exitAnim;
                int i7 = i6 + 1;
                iArr2[i6] = op.popEnterAnim;
                i = i7 + 1;
                iArr2[i7] = op.popExitAnim;
            }
            this.mTransition = backStackRecord.mTransition;
            this.mTransitionStyle = backStackRecord.mTransitionStyle;
            this.mName = backStackRecord.mName;
            this.mIndex = backStackRecord.mIndex;
            this.mBreadCrumbTitleRes = backStackRecord.mBreadCrumbTitleRes;
            this.mBreadCrumbTitleText = backStackRecord.mBreadCrumbTitleText;
            this.mBreadCrumbShortTitleRes = backStackRecord.mBreadCrumbShortTitleRes;
            this.mBreadCrumbShortTitleText = backStackRecord.mBreadCrumbShortTitleText;
            this.mSharedElementSourceNames = backStackRecord.mSharedElementSourceNames;
            this.mSharedElementTargetNames = backStackRecord.mSharedElementTargetNames;
            this.mReorderingAllowed = backStackRecord.mReorderingAllowed;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public int describeContents() {
        return 0;
    }

    public BackStackRecord instantiate(FragmentManagerImpl fragmentManagerImpl) {
        BackStackRecord backStackRecord = new BackStackRecord(fragmentManagerImpl);
        int i = 0;
        int i2 = 0;
        while (i < this.mOps.length) {
            BackStackRecord.C0209Op op = new BackStackRecord.C0209Op();
            int i3 = i + 1;
            op.cmd = this.mOps[i];
            if (FragmentManagerImpl.DEBUG) {
                "Instantiate " + backStackRecord + " op #" + i2 + " base fragment #" + this.mOps[i3];
            }
            int i4 = i3 + 1;
            int i5 = this.mOps[i3];
            op.fragment = i5 >= 0 ? fragmentManagerImpl.mActive.get(i5) : null;
            int[] iArr = this.mOps;
            int i6 = i4 + 1;
            int i7 = iArr[i4];
            op.enterAnim = i7;
            int i8 = i6 + 1;
            int i9 = iArr[i6];
            op.exitAnim = i9;
            int i10 = i8 + 1;
            int i11 = iArr[i8];
            op.popEnterAnim = i11;
            int i12 = iArr[i10];
            op.popExitAnim = i12;
            backStackRecord.mEnterAnim = i7;
            backStackRecord.mExitAnim = i9;
            backStackRecord.mPopEnterAnim = i11;
            backStackRecord.mPopExitAnim = i12;
            backStackRecord.addOp(op);
            i2++;
            i = i10 + 1;
        }
        backStackRecord.mTransition = this.mTransition;
        backStackRecord.mTransitionStyle = this.mTransitionStyle;
        backStackRecord.mName = this.mName;
        backStackRecord.mIndex = this.mIndex;
        backStackRecord.mAddToBackStack = true;
        backStackRecord.mBreadCrumbTitleRes = this.mBreadCrumbTitleRes;
        backStackRecord.mBreadCrumbTitleText = this.mBreadCrumbTitleText;
        backStackRecord.mBreadCrumbShortTitleRes = this.mBreadCrumbShortTitleRes;
        backStackRecord.mBreadCrumbShortTitleText = this.mBreadCrumbShortTitleText;
        backStackRecord.mSharedElementSourceNames = this.mSharedElementSourceNames;
        backStackRecord.mSharedElementTargetNames = this.mSharedElementTargetNames;
        backStackRecord.mReorderingAllowed = this.mReorderingAllowed;
        backStackRecord.bumpBackStackNesting(1);
        return backStackRecord;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.mOps);
        parcel.writeInt(this.mTransition);
        parcel.writeInt(this.mTransitionStyle);
        parcel.writeString(this.mName);
        parcel.writeInt(this.mIndex);
        parcel.writeInt(this.mBreadCrumbTitleRes);
        TextUtils.writeToParcel(this.mBreadCrumbTitleText, parcel, 0);
        parcel.writeInt(this.mBreadCrumbShortTitleRes);
        TextUtils.writeToParcel(this.mBreadCrumbShortTitleText, parcel, 0);
        parcel.writeStringList(this.mSharedElementSourceNames);
        parcel.writeStringList(this.mSharedElementTargetNames);
        parcel.writeInt(this.mReorderingAllowed ? 1 : 0);
    }
}
