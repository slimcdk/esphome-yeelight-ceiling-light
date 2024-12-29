package org.eclipse.jetty.util;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;

public class MultiException extends Exception {
    private Object nested;

    public MultiException() {
        super("Multiple exceptions");
    }

    public void add(Throwable th) {
        if (th instanceof MultiException) {
            MultiException multiException = (MultiException) th;
            for (int i = 0; i < LazyList.size(multiException.nested); i++) {
                this.nested = LazyList.add(this.nested, LazyList.get(multiException.nested, i));
            }
            return;
        }
        this.nested = LazyList.add(this.nested, th);
    }

    public Throwable getThrowable(int i) {
        return (Throwable) LazyList.get(this.nested, i);
    }

    public List<Throwable> getThrowables() {
        return LazyList.getList(this.nested);
    }

    public void ifExceptionThrow() {
        int size = LazyList.size(this.nested);
        if (size != 0) {
            if (size == 1) {
                Throwable th = (Throwable) LazyList.get(this.nested, 0);
                if (th instanceof Error) {
                    throw ((Error) th);
                } else if (th instanceof Exception) {
                    throw ((Exception) th);
                }
            }
            throw this;
        }
    }

    public void ifExceptionThrowMulti() {
        if (LazyList.size(this.nested) > 0) {
            throw this;
        }
    }

    public void ifExceptionThrowRuntime() {
        int size = LazyList.size(this.nested);
        if (size == 0) {
            return;
        }
        if (size == 1) {
            Throwable th = (Throwable) LazyList.get(this.nested, 0);
            if (th instanceof Error) {
                throw ((Error) th);
            } else if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            } else {
                throw new RuntimeException(th);
            }
        } else {
            throw new RuntimeException(this);
        }
    }

    public void printStackTrace() {
        super.printStackTrace();
        for (int i = 0; i < LazyList.size(this.nested); i++) {
            ((Throwable) LazyList.get(this.nested, i)).printStackTrace();
        }
    }

    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        for (int i = 0; i < LazyList.size(this.nested); i++) {
            ((Throwable) LazyList.get(this.nested, i)).printStackTrace(printStream);
        }
    }

    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        for (int i = 0; i < LazyList.size(this.nested); i++) {
            ((Throwable) LazyList.get(this.nested, i)).printStackTrace(printWriter);
        }
    }

    public int size() {
        return LazyList.size(this.nested);
    }

    public String toString() {
        StringBuilder sb;
        if (LazyList.size(this.nested) > 0) {
            sb = new StringBuilder();
            sb.append(MultiException.class.getSimpleName());
            sb.append(LazyList.getList(this.nested));
        } else {
            sb = new StringBuilder();
            sb.append(MultiException.class.getSimpleName());
            sb.append("[]");
        }
        return sb.toString();
    }
}
