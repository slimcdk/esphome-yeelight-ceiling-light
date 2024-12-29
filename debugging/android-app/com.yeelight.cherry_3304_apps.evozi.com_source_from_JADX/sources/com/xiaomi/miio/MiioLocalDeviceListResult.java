package com.xiaomi.miio;

import java.util.List;

public class MiioLocalDeviceListResult {
    public MiioLocalErrorCode code;
    public List<MiioLocalRpcResult> list;

    public MiioLocalDeviceListResult(MiioLocalErrorCode miioLocalErrorCode) {
        this.code = miioLocalErrorCode;
    }

    public MiioLocalDeviceListResult(MiioLocalErrorCode miioLocalErrorCode, List<MiioLocalRpcResult> list2) {
        this.code = miioLocalErrorCode;
        this.list = list2;
    }
}
