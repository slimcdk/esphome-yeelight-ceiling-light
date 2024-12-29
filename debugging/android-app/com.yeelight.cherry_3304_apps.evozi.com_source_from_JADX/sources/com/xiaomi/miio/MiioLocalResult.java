package com.xiaomi.miio;

public class MiioLocalResult {
    public MiioLocalErrorCode code;

    public MiioLocalResult(MiioLocalErrorCode miioLocalErrorCode) {
        this.code = miioLocalErrorCode;
    }
}
