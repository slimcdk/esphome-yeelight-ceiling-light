package com.yeelight.cherry.p177ui.activity;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.annotation.RequiresApi;
import com.google.p107ar.core.HitResult;
import com.google.p107ar.core.Plane;
import com.google.p107ar.sceneform.AnchorNode;
import com.google.p107ar.sceneform.HitTestResult;
import com.google.p107ar.sceneform.NodeParent;
import com.google.p107ar.sceneform.math.Vector3;
import com.google.p107ar.sceneform.p108ux.ArFragment;
import com.google.p107ar.sceneform.p108ux.TransformableNode;
import com.google.p107ar.sceneform.rendering.Material;
import com.google.p107ar.sceneform.rendering.MaterialFactory;
import com.google.p107ar.sceneform.rendering.ModelRenderable;
import com.google.p107ar.sceneform.rendering.ShapeFactory;
import com.google.p107ar.sceneform.rendering.Texture;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.utils.C10547m;

/* renamed from: com.yeelight.cherry.ui.activity.ARCoreDemoActivity */
public class ARCoreDemoActivity extends BaseActivity {

    /* renamed from: b */
    ArFragment f10243b;

    /* renamed from: c */
    Button f10244c;

    /* renamed from: d */
    private ModelRenderable f10245d;

    /* renamed from: e */
    TransformableNode f10246e;

    static {
        Class<ARCoreDemoActivity> cls = ARCoreDemoActivity.class;
    }

    @RequiresApi(api = 24)
    /* renamed from: c0 */
    private void m15918c0() {
        Texture.builder().setSource(BitmapFactory.decodeResource(getResources(), 17170455)).build().thenAccept(new C5680a(this));
    }

    /* renamed from: V */
    public /* synthetic */ void mo26065V(Texture texture) {
        MaterialFactory.makeOpaqueWithTexture(this, texture).thenAccept(new C5700e(this));
    }

    /* renamed from: W */
    public /* synthetic */ void mo26066W(TransformableNode transformableNode, HitTestResult hitTestResult, MotionEvent motionEvent) {
        transformableNode.select();
        this.f10246e = transformableNode;
    }

    /* renamed from: X */
    public /* synthetic */ void mo26067X(Material material) {
        this.f10245d = ShapeFactory.makeSphere(0.1f, new Vector3(0.0f, 0.15f, 0.0f), material);
    }

    /* renamed from: Y */
    public /* synthetic */ void mo26068Y(View view) {
        TransformableNode transformableNode = this.f10246e;
        if (transformableNode != null) {
            transformableNode.setParent((NodeParent) null);
        }
    }

    /* renamed from: Z */
    public /* synthetic */ void mo26069Z(ModelRenderable modelRenderable) {
        this.f10245d = modelRenderable;
    }

    /* renamed from: a0 */
    public /* synthetic */ Void mo26070a0(Throwable th) {
        Toast makeText = Toast.makeText(this, "Unable to load andy renderable", 1);
        makeText.setGravity(17, 0, 0);
        makeText.show();
        return null;
    }

    /* renamed from: b0 */
    public /* synthetic */ void mo26071b0(HitResult hitResult, Plane plane, MotionEvent motionEvent) {
        if (this.f10245d != null) {
            AnchorNode anchorNode = new AnchorNode(hitResult.createAnchor());
            anchorNode.setParent(this.f10243b.getArSceneView().getScene());
            TransformableNode transformableNode = new TransformableNode(this.f10243b.getTransformationSystem());
            transformableNode.setParent(anchorNode);
            transformableNode.setRenderable(this.f10245d);
            transformableNode.getScaleController().setEnabled(false);
            transformableNode.select();
            this.f10246e = transformableNode;
            transformableNode.setOnTapListener(new C5685b(this, transformableNode));
        }
    }

    /* access modifiers changed from: protected */
    @RequiresApi(api = 24)
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_ar_core_demo);
        this.f10243b = (ArFragment) getSupportFragmentManager().findFragmentById(C11745R$id.ux_fragment);
        Button button = (Button) findViewById(C11745R$id.btn_delete_node);
        this.f10244c = button;
        button.setOnClickListener(new C5690c(this));
        ((ModelRenderable.Builder) ModelRenderable.builder().setSource((Context) this, Uri.parse("dysis_small.sfb"))).build().thenAccept(new C5695d(this)).exceptionally(new C5710g(this));
        m15918c0();
        this.f10243b.setOnTapArPlaneListener(new C5705f(this));
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
    }
}
