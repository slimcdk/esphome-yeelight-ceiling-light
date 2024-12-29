package com.google.p107ar.sceneform;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.p107ar.sceneform.Node;
import com.google.p107ar.sceneform.math.Matrix;
import com.google.p107ar.sceneform.math.Quaternion;
import com.google.p107ar.sceneform.math.Vector3;
import com.google.p107ar.sceneform.rendering.ModelRenderable;
import com.google.p107ar.sceneform.rendering.Renderable;
import com.google.p107ar.sceneform.rendering.RenderableInstance;
import com.google.p107ar.sceneform.rendering.SkeletonRig;
import com.google.p107ar.sceneform.utilities.Preconditions;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;

/* renamed from: com.google.ar.sceneform.SkeletonNode */
public class SkeletonNode extends Node {
    /* access modifiers changed from: private */
    public final HashMap<String, NodeBinding> boneNamesToNodes = new HashMap<>();
    private final Vector3 bonePosition = new Vector3();
    private final Quaternion boneRotation = new Quaternion();
    private final Vector3 boneScale = new Vector3();
    /* access modifiers changed from: private */
    public final Matrix boneTransform = new Matrix();
    /* access modifiers changed from: private */
    public boolean isModifiedSinceLastRender = false;
    @VisibleForTesting
    final SkeletonSkinningModifier skinningModifier = new SkeletonSkinningModifier();

    /* renamed from: com.google.ar.sceneform.SkeletonNode$NodeBinding */
    class NodeBinding implements Node.TransformChangedListener {

        /* renamed from: a */
        final Node f5175a;

        /* renamed from: b */
        boolean f5176b;

        private NodeBinding(Node node) {
            this.f5176b = true;
            this.f5175a = node;
            node.addTransformChangedListener(this);
        }

        /* synthetic */ NodeBinding(SkeletonNode skeletonNode, Node node, byte b) {
            this(node);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m8217a() {
            this.f5175a.removeTransformChangedListener(this);
        }

        public void onTransformChanged(Node node, Node node2) {
            SkeletonNode skeletonNode = SkeletonNode.this;
            if ((node2 != skeletonNode && !skeletonNode.isDescendantOf(node2)) || !node.isDescendantOf(SkeletonNode.this)) {
                this.f5176b = true;
                boolean unused = SkeletonNode.this.isModifiedSinceLastRender = true;
            }
        }
    }

    @VisibleForTesting
    /* renamed from: com.google.ar.sceneform.SkeletonNode$SkeletonSkinningModifier */
    class SkeletonSkinningModifier implements RenderableInstance.SkinningModifier {
        @Nullable

        /* renamed from: a */
        private FloatBuffer f5178a = null;

        /* renamed from: b */
        private final Matrix f5179b = new Matrix();

        SkeletonSkinningModifier() {
        }

        public boolean isModifiedSinceLastRender() {
            return SkeletonNode.this.isModifiedSinceLastRender;
        }

        public FloatBuffer modifyMaterialBoneTransformsBuffer(FloatBuffer floatBuffer) {
            ModelRenderable access$100;
            RenderableInstance renderableInstance;
            Matrix matrix;
            SkeletonNode skeletonNode;
            SkeletonRig skeletonRig = SkeletonNode.this.getSkeletonRig();
            if (skeletonRig == null || (access$100 = SkeletonNode.this.getModelRenderable()) == null) {
                return floatBuffer;
            }
            FloatBuffer floatBuffer2 = null;
            for (int i = 0; i < skeletonRig.getMaterialBoneCount(); i++) {
                int materialBoneIndex = skeletonRig.getMaterialBoneIndex(i);
                NodeBinding nodeBinding = (NodeBinding) SkeletonNode.this.boneNamesToNodes.get(access$100.getBoneName(materialBoneIndex));
                if (nodeBinding != null && nodeBinding.f5175a.isActive() && nodeBinding.f5176b) {
                    if (floatBuffer2 == null) {
                        FloatBuffer floatBuffer3 = this.f5178a;
                        if (floatBuffer3 == null || floatBuffer3.limit() != floatBuffer.limit()) {
                            this.f5178a = ByteBuffer.allocateDirect(floatBuffer.limit() << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
                        }
                        floatBuffer2 = (FloatBuffer) Preconditions.checkNotNull(this.f5178a);
                        floatBuffer2.put(floatBuffer);
                        floatBuffer.rewind();
                    }
                    Node node = nodeBinding.f5175a;
                    SkeletonRig skeletonRig2 = SkeletonNode.this.getSkeletonRig();
                    if (!(skeletonRig2 == null || (renderableInstance = SkeletonNode.this.getRenderableInstance()) == null)) {
                        skeletonRig2.getInverseBindPoseForBone(materialBoneIndex, this.f5179b);
                        Node parent = node.getParent();
                        if (parent == null || parent == (skeletonNode = SkeletonNode.this)) {
                            matrix = node.getLocalModelMatrixInternal();
                        } else {
                            Matrix.multiply(skeletonNode.getWorldModelMatrixInverseInternal(), node.getWorldModelMatrix(), SkeletonNode.this.boneTransform);
                            matrix = SkeletonNode.this.boneTransform;
                        }
                        Matrix relativeTransformInverse = renderableInstance.getRelativeTransformInverse();
                        if (relativeTransformInverse != null) {
                            Matrix.multiply(relativeTransformInverse, matrix, SkeletonNode.this.boneTransform);
                            matrix = SkeletonNode.this.boneTransform;
                        }
                        Matrix.multiply(matrix, this.f5179b, SkeletonNode.this.boneTransform);
                        int i2 = i << 4;
                        if (floatBuffer2.position() != i2) {
                            floatBuffer2.position(i2);
                        }
                        floatBuffer2.put(SkeletonNode.this.boneTransform.data);
                    }
                }
            }
            boolean unused = SkeletonNode.this.isModifiedSinceLastRender = false;
            if (floatBuffer2 != null) {
                floatBuffer2.rewind();
                return floatBuffer2;
            }
            this.f5178a = null;
            return floatBuffer;
        }
    }

    private void applyBoneTransformToNode(int i, NodeBinding nodeBinding) {
        RenderableInstance renderableInstance;
        SkeletonRig skeletonRig = getSkeletonRig();
        if (skeletonRig != null && (renderableInstance = getRenderableInstance()) != null) {
            skeletonRig.getMatrixForBone(i, this.boneTransform);
            Matrix relativeTransform = renderableInstance.getRelativeTransform();
            if (relativeTransform != null) {
                Matrix matrix = this.boneTransform;
                Matrix.multiply(relativeTransform, matrix, matrix);
            }
            Node node = nodeBinding.f5175a;
            Node parent = node.getParent();
            if (!(parent == null || parent == this)) {
                Matrix worldModelMatrix = getWorldModelMatrix();
                Matrix matrix2 = this.boneTransform;
                Matrix.multiply(worldModelMatrix, matrix2, matrix2);
                Matrix worldModelMatrixInverseInternal = parent.getWorldModelMatrixInverseInternal();
                Matrix matrix3 = this.boneTransform;
                Matrix.multiply(worldModelMatrixInverseInternal, matrix3, matrix3);
            }
            this.boneTransform.decomposeTranslation(this.bonePosition);
            this.boneTransform.decomposeScale(this.boneScale);
            this.boneTransform.decomposeRotation(this.boneScale, this.boneRotation);
            boolean z = this.isModifiedSinceLastRender;
            node.setLocalPosition(this.bonePosition);
            node.setLocalRotation(this.boneRotation);
            node.setLocalScale(this.boneScale);
            nodeBinding.f5176b = false;
            this.isModifiedSinceLastRender = z;
        }
    }

    private int getIndexForBoneName(String str) {
        ModelRenderable modelRenderable = getModelRenderable();
        if (modelRenderable == null) {
            return -1;
        }
        for (int i = 0; i < modelRenderable.getBoneCount(); i++) {
            if (modelRenderable.getBoneName(i).equals(str)) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    @Nullable
    public ModelRenderable getModelRenderable() {
        Renderable renderable = getRenderable();
        if (renderable instanceof ModelRenderable) {
            return (ModelRenderable) renderable;
        }
        return null;
    }

    private boolean isAnimating() {
        SkeletonRig skeletonRig;
        ModelRenderable modelRenderable = getModelRenderable();
        if (modelRenderable == null || (skeletonRig = getSkeletonRig()) == null) {
            return false;
        }
        return skeletonRig.isAnimating(modelRenderable);
    }

    private void updateMappedNodes() {
        ModelRenderable modelRenderable = getModelRenderable();
        if (modelRenderable != null && getSkeletonRig() != null) {
            for (int i = 0; i < modelRenderable.getBoneCount(); i++) {
                NodeBinding nodeBinding = this.boneNamesToNodes.get(modelRenderable.getBoneName(i));
                if (nodeBinding != null && nodeBinding.f5175a.isActive()) {
                    applyBoneTransformToNode(i, nodeBinding);
                }
            }
            this.isModifiedSinceLastRender = false;
        }
    }

    @Nullable
    public Node getBoneAttachment(String str) {
        Preconditions.checkNotNull(str, "Parameter \"boneName\" was null.");
        NodeBinding nodeBinding = this.boneNamesToNodes.get(str);
        if (nodeBinding != null) {
            return nodeBinding.f5175a;
        }
        return null;
    }

    public void onUpdate(FrameTime frameTime) {
        if (isAnimating()) {
            updateMappedNodes();
        }
    }

    public void setBoneAttachment(String str, @Nullable Node node) {
        Preconditions.checkNotNull(str, "Parameter \"boneName\" was null.");
        NodeBinding remove = this.boneNamesToNodes.remove(str);
        if (remove != null) {
            remove.m8217a();
        }
        if (node != null) {
            NodeBinding nodeBinding = new NodeBinding(this, node, (byte) 0);
            this.boneNamesToNodes.put(str, nodeBinding);
            int indexForBoneName = getIndexForBoneName(str);
            if (indexForBoneName != -1) {
                applyBoneTransformToNode(indexForBoneName, nodeBinding);
            }
        }
    }

    public void setRenderable(@Nullable Renderable renderable) {
        super.setRenderable(renderable);
        updateMappedNodes();
        RenderableInstance renderableInstance = getRenderableInstance();
        if (renderableInstance != null) {
            renderableInstance.setSkinningModifier(this.skinningModifier);
        }
    }
}
