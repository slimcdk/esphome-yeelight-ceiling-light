package com.inuker.bluetooth.library.search;

import android.os.Bundle;
import com.inuker.bluetooth.library.Constants;
import com.inuker.bluetooth.library.connect.response.BleGeneralResponse;
import com.inuker.bluetooth.library.search.response.BluetoothSearchResponse;

public class BluetoothSearchManager {
    public static void search(SearchRequest searchRequest, final BleGeneralResponse bleGeneralResponse) {
        BluetoothSearchHelper.getInstance().startSearch(new BluetoothSearchRequest(searchRequest), new BluetoothSearchResponse() {
            public void onDeviceFounded(SearchResult searchResult) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(Constants.EXTRA_SEARCH_RESULT, searchResult);
                BleGeneralResponse.this.onResponse(4, bundle);
            }

            public void onSearchCanceled() {
                BleGeneralResponse.this.onResponse(3, null);
            }

            public void onSearchStarted() {
                BleGeneralResponse.this.onResponse(1, null);
            }

            public void onSearchStopped() {
                BleGeneralResponse.this.onResponse(2, null);
            }
        });
    }

    public static void stopSearch() {
        BluetoothSearchHelper.getInstance().stopSearch();
    }
}
