package android.print;

import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PrintDocumentAdapter;
import java.io.File;

public class PdfPrint {
    private static final String TAG = "PdfPrint";
    private final PrintAttributes printAttributes;

    public interface CallbackPrint {
        void onFailure(String str);

        void success(String str);
    }

    public PdfPrint(PrintAttributes printAttributes2) {
        this.printAttributes = printAttributes2;
    }

    /* access modifiers changed from: private */
    public ParcelFileDescriptor getOutputFile(File file, String str) {
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        try {
            file2.createNewFile();
            return ParcelFileDescriptor.open(file2, 805306368);
        } catch (Exception unused) {
            return null;
        }
    }

    public void print(PrintDocumentAdapter printDocumentAdapter, File file, String str, CallbackPrint callbackPrint) {
        final PrintDocumentAdapter printDocumentAdapter2 = printDocumentAdapter;
        final File file2 = file;
        final String str2 = str;
        final CallbackPrint callbackPrint2 = callbackPrint;
        printDocumentAdapter.onLayout((PrintAttributes) null, this.printAttributes, (CancellationSignal) null, new PrintDocumentAdapter.LayoutResultCallback() {
            public void onLayoutFinished(PrintDocumentInfo printDocumentInfo, boolean z) {
                printDocumentAdapter2.onWrite(new PageRange[]{PageRange.ALL_PAGES}, PdfPrint.this.getOutputFile(file2, str2), new CancellationSignal(), new PrintDocumentAdapter.WriteResultCallback() {
                    public void onWriteFinished(PageRange[] pageRangeArr) {
                        super.onWriteFinished(pageRangeArr);
                        if (pageRangeArr.length > 0) {
                            C00081 r0 = C00081.this;
                            callbackPrint2.success(new File(file2, str2).getAbsolutePath());
                            return;
                        }
                        callbackPrint2.onFailure("Pages length not found");
                    }
                });
            }
        }, (Bundle) null);
    }
}
