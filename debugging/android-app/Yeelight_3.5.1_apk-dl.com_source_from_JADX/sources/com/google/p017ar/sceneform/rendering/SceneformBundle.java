package com.google.p017ar.sceneform.rendering;

import androidx.annotation.Nullable;
import com.google.p017ar.sceneform.collision.Box;
import com.google.p017ar.sceneform.collision.CollisionShape;
import com.google.p017ar.sceneform.collision.Sphere;
import com.google.p017ar.sceneform.math.Vector3;
import com.google.p017ar.schemas.sceneform.SceneformBundleDef;
import com.google.p017ar.schemas.sceneform.SuggestedCollisionShapeDef;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.google.ar.sceneform.rendering.SceneformBundle */
public final class SceneformBundle {
    public static final float RCB_MAJOR_VERSION = 0.54f;
    public static final int RCB_MINOR_VERSION = 2;
    private static final char[] RCB_SIGNATURE = {'R', 'B', 'U', 'N'};
    private static final int SIGNATURE_OFFSET = 4;
    private static final String TAG = "SceneformBundle";

    /* renamed from: com.google.ar.sceneform.rendering.SceneformBundle$VersionException */
    static class VersionException extends Exception {
        public VersionException(String str) {
            super(str);
        }
    }

    public static boolean isSceneformBundle(ByteBuffer byteBuffer) {
        int i = 0;
        while (true) {
            char[] cArr = RCB_SIGNATURE;
            if (i >= cArr.length) {
                return true;
            }
            if (byteBuffer.get(i + 4) != cArr[i]) {
                return false;
            }
            i++;
        }
    }

    public static CollisionShape readCollisionGeometry(SceneformBundleDef sceneformBundleDef) {
        SuggestedCollisionShapeDef suggestedCollisionShape = sceneformBundleDef.suggestedCollisionShape();
        int type = suggestedCollisionShape.type();
        if (type == 0) {
            Box box = new Box();
            box.setCenter(new Vector3(suggestedCollisionShape.center().mo18215x(), suggestedCollisionShape.center().mo18216y(), suggestedCollisionShape.center().mo18217z()));
            box.setSize(new Vector3(suggestedCollisionShape.size().mo18215x(), suggestedCollisionShape.size().mo18216y(), suggestedCollisionShape.size().mo18217z()));
            return box;
        } else if (type == 1) {
            Sphere sphere = new Sphere();
            sphere.setCenter(new Vector3(suggestedCollisionShape.center().mo18215x(), suggestedCollisionShape.center().mo18216y(), suggestedCollisionShape.center().mo18217z()));
            sphere.setRadius(suggestedCollisionShape.size().mo18215x());
            return sphere;
        } else {
            throw new IOException("Invalid collisionCollisionGeometry type.");
        }
    }

    @Nullable
    public static SceneformBundleDef tryLoadSceneformBundle(ByteBuffer byteBuffer) {
        if (!isSceneformBundle(byteBuffer)) {
            return null;
        }
        byteBuffer.rewind();
        SceneformBundleDef rootAsSceneformBundleDef = SceneformBundleDef.getRootAsSceneformBundleDef(byteBuffer);
        float majorVersion = rootAsSceneformBundleDef.version().majorVersion();
        int minorVersion = rootAsSceneformBundleDef.version().minorVersion();
        if (0.54f >= rootAsSceneformBundleDef.version().majorVersion()) {
            return rootAsSceneformBundleDef;
        }
        StringBuilder sb = new StringBuilder(140);
        sb.append("Sceneform bundle (.sfb) version not supported, max version supported is 0.54.X. Version requested for loading is ");
        sb.append(majorVersion);
        sb.append(".");
        sb.append(minorVersion);
        throw new VersionException(sb.toString());
    }
}
