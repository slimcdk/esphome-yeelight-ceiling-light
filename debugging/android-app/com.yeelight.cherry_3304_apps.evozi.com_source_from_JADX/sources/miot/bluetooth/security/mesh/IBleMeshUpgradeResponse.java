package miot.bluetooth.security.mesh;

public interface IBleMeshUpgradeResponse {
    void onProgress(int i);

    void onResponse(int i, String str);
}
