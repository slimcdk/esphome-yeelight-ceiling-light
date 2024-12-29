package com.google.p107ar.sceneform.rendering;

import androidx.annotation.Nullable;
import com.google.p107ar.sceneform.collision.Box;
import com.google.p107ar.sceneform.collision.CollisionShape;
import com.google.p107ar.sceneform.collision.Sphere;
import com.google.p107ar.sceneform.math.Vector3;
import com.google.p107ar.schemas.sceneform.SceneformBundleDef;
import com.google.p107ar.schemas.sceneform.SuggestedCollisionShapeDef;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.google.ar.sceneform.rendering.SceneformBundle */
public final class SceneformBundle {
    public static final float RCB_MAJOR_VERSION = 0.54f;
    public static final int RCB_MINOR_VERSION = 2;
    private static final char[] RCB_SIGNATURE = {'R', 'B', 'U', 'N'};
    private static final int SIGNATURE_OFFSET = 4;
    private static final String TAG = "SceneformBundle";

    /* renamed from: com.google.ar.sceneform.rendering.SceneformBundle$a */
    static class C2729a extends Exception {
        public C2729a(String str) {
            super(str);
        }
    }

    public static boolean isSceneformBundle(ByteBuffer byteBuffer) {
        for (int i = 0; i < RCB_SIGNATURE.length; i++) {
            if (byteBuffer.get(i + 4) != RCB_SIGNATURE[i]) {
                return false;
            }
        }
        return true;
    }

    public static CollisionShape readCollisionGeometry(SceneformBundleDef sceneformBundleDef) {
        SuggestedCollisionShapeDef suggestedCollisionShape = sceneformBundleDef.suggestedCollisionShape();
        int type = suggestedCollisionShape.type();
        if (type == 0) {
            Box box = new Box();
            box.setCenter(new Vector3(suggestedCollisionShape.center().mo16783x(), suggestedCollisionShape.center().mo16784y(), suggestedCollisionShape.center().mo16785z()));
            box.setSize(new Vector3(suggestedCollisionShape.size().mo16783x(), suggestedCollisionShape.size().mo16784y(), suggestedCollisionShape.size().mo16785z()));
            return box;
        } else if (type == 1) {
            Sphere sphere = new Sphere();
            sphere.setCenter(new Vector3(suggestedCollisionShape.center().mo16783x(), suggestedCollisionShape.center().mo16784y(), suggestedCollisionShape.center().mo16785z()));
            sphere.setRadius(suggestedCollisionShape.size().mo16783x());
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
        throw new C2729a(sb.toString());
    }
}
