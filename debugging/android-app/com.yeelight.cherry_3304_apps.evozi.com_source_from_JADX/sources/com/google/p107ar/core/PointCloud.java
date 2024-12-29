package com.google.p107ar.core;

import com.google.p107ar.core.exceptions.DeadlineExceededException;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* renamed from: com.google.ar.core.PointCloud */
public class PointCloud implements Closeable {
    private long nativeHandle;
    private final Session session;

    protected PointCloud() {
        this.nativeHandle = 0;
        this.session = null;
        this.nativeHandle = 0;
    }

    PointCloud(Session session2, long j) {
        this.nativeHandle = 0;
        this.session = session2;
        this.nativeHandle = j;
    }

    private native ByteBuffer nativeGetData(long j, long j2);

    private native ByteBuffer nativeGetIds(long j, long j2);

    private native long nativeGetTimestamp(long j, long j2);

    private native void nativeReleasePointCloud(long j);

    public void close() {
        release();
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeReleasePointCloud(j);
        }
        super.finalize();
    }

    public IntBuffer getIds() {
        long j = this.nativeHandle;
        if (j != 0) {
            return Session.directByteBufferOrDefault(nativeGetIds(this.session.nativeWrapperHandle, j)).asIntBuffer();
        }
        throw new DeadlineExceededException();
    }

    public FloatBuffer getPoints() {
        long j = this.nativeHandle;
        if (j != 0) {
            return Session.directByteBufferOrDefault(nativeGetData(this.session.nativeWrapperHandle, j)).asFloatBuffer();
        }
        throw new DeadlineExceededException();
    }

    public long getTimestamp() {
        long j = this.nativeHandle;
        if (j != 0) {
            return nativeGetTimestamp(this.session.nativeWrapperHandle, j);
        }
        throw new DeadlineExceededException();
    }

    public void release() {
        nativeReleasePointCloud(this.nativeHandle);
        this.nativeHandle = 0;
    }
}
