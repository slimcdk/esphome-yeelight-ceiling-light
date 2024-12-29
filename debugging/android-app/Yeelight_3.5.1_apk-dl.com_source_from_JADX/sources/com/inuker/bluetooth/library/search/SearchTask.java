package com.inuker.bluetooth.library.search;

import android.os.Parcel;
import android.os.Parcelable;

public class SearchTask implements Parcelable {
    public static final Parcelable.Creator<SearchTask> CREATOR = new Parcelable.Creator<SearchTask>() {
        public SearchTask createFromParcel(Parcel parcel) {
            return new SearchTask(parcel);
        }

        public SearchTask[] newArray(int i) {
            return new SearchTask[i];
        }
    };
    private int searchDuration;
    private int searchType;

    public SearchTask() {
    }

    protected SearchTask(Parcel parcel) {
        this.searchType = parcel.readInt();
        this.searchDuration = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public int getSearchDuration() {
        return this.searchDuration;
    }

    public int getSearchType() {
        return this.searchType;
    }

    public void setSearchDuration(int i) {
        this.searchDuration = i;
    }

    public void setSearchType(int i) {
        this.searchType = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.searchType);
        parcel.writeInt(this.searchDuration);
    }
}
