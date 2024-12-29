package com.google.p107ar.sceneform.p108ux;

/* renamed from: com.google.ar.sceneform.ux.TransformableNode */
public class TransformableNode extends BaseTransformableNode {
    private final RotationController rotationController;
    private final ScaleController scaleController;
    private final TranslationController translationController;

    public TransformableNode(TransformationSystem transformationSystem) {
        super(transformationSystem);
        TranslationController translationController2 = new TranslationController(this, transformationSystem.getDragRecognizer());
        this.translationController = translationController2;
        addTransformationController(translationController2);
        ScaleController scaleController2 = new ScaleController(this, transformationSystem.getPinchRecognizer());
        this.scaleController = scaleController2;
        addTransformationController(scaleController2);
        RotationController rotationController2 = new RotationController(this, transformationSystem.getTwistRecognizer());
        this.rotationController = rotationController2;
        addTransformationController(rotationController2);
    }

    public RotationController getRotationController() {
        return this.rotationController;
    }

    public ScaleController getScaleController() {
        return this.scaleController;
    }

    public TranslationController getTranslationController() {
        return this.translationController;
    }
}
