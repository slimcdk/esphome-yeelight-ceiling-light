package com.xiaomi.push;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.commons.p271io.IOUtils;

/* renamed from: com.xiaomi.push.cn */
class C4574cn {

    /* renamed from: a */
    private File f8314a;

    /* renamed from: a */
    private StringBuilder f8315a;

    /* renamed from: a */
    public void mo24847a() {
        try {
            FileWriter fileWriter = new FileWriter(this.f8314a, true);
            fileWriter.write(this.f8315a.toString());
            fileWriter.flush();
            fileWriter.close();
            this.f8315a.delete(0, this.f8315a.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo24848a(C4573cm cmVar) {
        StringBuilder sb = this.f8315a;
        sb.append(cmVar.f8311a + "\t");
        StringBuilder sb2 = this.f8315a;
        sb2.append(cmVar.f8312a + "\t" + cmVar.f8313b);
        this.f8315a.append(IOUtils.LINE_SEPARATOR_WINDOWS);
    }
}
