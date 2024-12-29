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
                bleGeneralResponse.onResponse(4, bundle);
            }

            public void onSearchCanceled() {
                bleGeneralResponse.onResponse(3, null);
            }

            public void onSearchStarted() {
                bleGeneralResponse.onResponse(1, null);
            }

            public void onSearchStopped() {
                bleGeneralResponse.onResponse(2, null);
            }
        });
    }

    public static void stopSearch() {
        BluetoothSearchHelper.getInstance().stopSearch();
    }
}
