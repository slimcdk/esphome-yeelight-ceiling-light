package org.apache.commons.p271io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

/* renamed from: org.apache.commons.io.comparator.LastModifiedFileComparator */
public class LastModifiedFileComparator extends AbstractFileComparator implements Serializable {
    public static final Comparator<File> LASTMODIFIED_COMPARATOR;
    public static final Comparator<File> LASTMODIFIED_REVERSE;

    static {
        LastModifiedFileComparator lastModifiedFileComparator = new LastModifiedFileComparator();
        LASTMODIFIED_COMPARATOR = lastModifiedFileComparator;
        LASTMODIFIED_REVERSE = new ReverseComparator(lastModifiedFileComparator);
    }

    public int compare(File file, File file2) {
        long lastModified = file.lastModified() - file2.lastModified();
        if (lastModified < 0) {
            return -1;
        }
        return lastModified > 0 ? 1 : 0;
    }

    public /* bridge */ /* synthetic */ List sort(List list) {
        return super.sort((List<File>) list);
    }

    public /* bridge */ /* synthetic */ File[] sort(File[] fileArr) {
        return super.sort(fileArr);
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
