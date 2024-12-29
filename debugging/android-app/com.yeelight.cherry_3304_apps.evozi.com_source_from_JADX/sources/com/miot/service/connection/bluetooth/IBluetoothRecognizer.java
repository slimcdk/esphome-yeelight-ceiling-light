package com.miot.service.connection.bluetooth;

import com.inuker.bluetooth.library.search.SearchResult;

public interface IBluetoothRecognizer {
    String recognize(SearchResult searchResult);
}
