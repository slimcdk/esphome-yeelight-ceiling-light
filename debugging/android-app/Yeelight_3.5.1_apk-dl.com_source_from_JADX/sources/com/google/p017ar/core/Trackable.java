package com.google.p017ar.core;

import java.util.Collection;

/* renamed from: com.google.ar.core.Trackable */
public interface Trackable {
    Anchor createAnchor(Pose pose);

    Collection<Anchor> getAnchors();

    TrackingState getTrackingState();
}
