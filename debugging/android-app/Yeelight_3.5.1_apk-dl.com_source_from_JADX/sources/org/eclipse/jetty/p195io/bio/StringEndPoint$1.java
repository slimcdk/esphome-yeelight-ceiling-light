package org.eclipse.jetty.p195io.bio;

/* renamed from: org.eclipse.jetty.io.bio.StringEndPoint$1 */
class StringEndPoint$1 extends IllegalStateException {
    final /* synthetic */ C9923c this$0;
    final /* synthetic */ Exception val$e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StringEndPoint$1(C9923c cVar, String str, Exception exc) {
        super(str);
        this.val$e = exc;
        initCause(exc);
    }
}
