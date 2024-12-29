package com.yeelight.cherry.p176c;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.RequiresApi;
import com.google.p107ar.core.AugmentedImage;
import com.google.p107ar.sceneform.AnchorNode;
import com.google.p107ar.sceneform.Node;
import com.google.p107ar.sceneform.math.Vector3;
import com.google.p107ar.sceneform.rendering.ModelRenderable;
import java.util.concurrent.CompletableFuture;

/* renamed from: com.yeelight.cherry.c.c */
public class C4963c extends AnchorNode {

    /* renamed from: b */
    private static CompletableFuture<ModelRenderable> f10238b;

    /* renamed from: c */
    private static CompletableFuture<ModelRenderable> f10239c;

    /* renamed from: d */
    private static CompletableFuture<ModelRenderable> f10240d;

    /* renamed from: e */
    private static CompletableFuture<ModelRenderable> f10241e;

    /* renamed from: a */
    private AugmentedImage f10242a;

    @RequiresApi(api = 24)
    public C4963c(Context context) {
        if (f10238b == null) {
            f10238b = ((ModelRenderable.Builder) ModelRenderable.builder().setSource(context, Uri.parse("models/frame_upper_left.sfb"))).build();
            f10239c = ((ModelRenderable.Builder) ModelRenderable.builder().setSource(context, Uri.parse("models/frame_upper_right.sfb"))).build();
            f10241e = ((ModelRenderable.Builder) ModelRenderable.builder().setSource(context, Uri.parse("models/frame_lower_left.sfb"))).build();
            f10240d = ((ModelRenderable.Builder) ModelRenderable.builder().setSource(context, Uri.parse("models/frame_lower_right.sfb"))).build();
        }
    }

    /* renamed from: b */
    static /* synthetic */ Void m15915b(Throwable th) {
        return null;
    }

    /* renamed from: a */
    public /* synthetic */ void mo26063a(AugmentedImage augmentedImage, Void voidR) {
        mo26064c(augmentedImage);
    }

    @RequiresApi(api = 24)
    /* renamed from: c */
    public void mo26064c(AugmentedImage augmentedImage) {
        this.f10242a = augmentedImage;
        if (!f10238b.isDone() || !f10239c.isDone() || !f10241e.isDone() || !f10240d.isDone()) {
            CompletableFuture.allOf(new CompletableFuture[]{f10238b, f10239c, f10241e, f10240d}).thenAccept(new C4961a(this, augmentedImage)).exceptionally(C4962b.f10237a);
        }
        setAnchor(augmentedImage.createAnchor(augmentedImage.getCenterPose()));
        Vector3 vector3 = new Vector3();
        vector3.set(augmentedImage.getExtentX() * -0.5f, 0.0f, augmentedImage.getExtentZ() * -0.5f);
        Node node = new Node();
        node.setParent(this);
        node.setLocalPosition(vector3);
        node.setRenderable(f10238b.getNow((Object) null));
        vector3.set(augmentedImage.getExtentX() * 0.5f, 0.0f, augmentedImage.getExtentZ() * -0.5f);
        Node node2 = new Node();
        node2.setParent(this);
        node2.setLocalPosition(vector3);
        node2.setRenderable(f10239c.getNow((Object) null));
        vector3.set(augmentedImage.getExtentX() * 0.5f, 0.0f, augmentedImage.getExtentZ() * 0.5f);
        Node node3 = new Node();
        node3.setParent(this);
        node3.setLocalPosition(vector3);
        node3.setRenderable(f10240d.getNow((Object) null));
        vector3.set(augmentedImage.getExtentX() * -0.5f, 0.0f, augmentedImage.getExtentZ() * 0.5f);
        Node node4 = new Node();
        node4.setParent(this);
        node4.setLocalPosition(vector3);
        node4.setRenderable(f10241e.getNow((Object) null));
    }
}
