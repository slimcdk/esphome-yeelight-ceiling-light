package com.inuker.bluetooth.library.search;

import android.os.Parcel;
import android.os.Parcelable;
import com.inuker.bluetooth.library.utils.BluetoothUtils;
import java.util.ArrayList;
import java.util.List;

public class SearchRequest implements Parcelable {
    public static final Parcelable.Creator<SearchRequest> CREATOR = new Parcelable.Creator<SearchRequest>() {
        public SearchRequest createFromParcel(Parcel parcel) {
            return new SearchRequest(parcel);
        }

        public SearchRequest[] newArray(int i) {
            return new SearchRequest[i];
        }
    };
    private List<SearchTask> tasks;

    public static class Builder {
        private List<SearchTask> tasks = new ArrayList();

        public SearchRequest build() {
            SearchRequest searchRequest = new SearchRequest();
            searchRequest.setTasks(this.tasks);
            return searchRequest;
        }

        public Builder searchBluetoothClassicDevice(int i) {
            SearchTask searchTask = new SearchTask();
            searchTask.setSearchType(1);
            searchTask.setSearchDuration(i);
            this.tasks.add(searchTask);
            return this;
        }

        public Builder searchBluetoothClassicDevice(int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                searchBluetoothClassicDevice(i);
            }
            return this;
        }

        public Builder searchBluetoothLeDevice(int i) {
            if (BluetoothUtils.isBleSupported()) {
                SearchTask searchTask = new SearchTask();
                searchTask.setSearchType(2);
                searchTask.setSearchDuration(i);
                this.tasks.add(searchTask);
            }
            return this;
        }

        public Builder searchBluetoothLeDevice(int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                searchBluetoothLeDevice(i);
            }
            return this;
        }
    }

    public SearchRequest() {
    }

    protected SearchRequest(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.tasks = arrayList;
        parcel.readTypedList(arrayList, SearchTask.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public List<SearchTask> getTasks() {
        return this.tasks;
    }

    public void setTasks(List<SearchTask> list) {
        this.tasks = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.tasks);
    }
}
