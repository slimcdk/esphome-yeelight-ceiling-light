package com.google.code.microlog4android.repository;

import com.google.code.microlog4android.Level;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import p080p0.C3592a;

public enum DefaultLoggerRepository implements C2188c, C2187b {
    INSTANCE;
    
    private static final String TAG = "Microlog.DefaultLoggerRepository";
    private Hashtable<String, C2189d> leafNodeHashtable;
    private C2189d rootNode;

    private C2189d createNewChildNode(String str, C2189d dVar) {
        C2189d dVar2 = new C2189d(str, dVar);
        dVar.mo18490b(dVar2);
        return dVar2;
    }

    /* access modifiers changed from: package-private */
    public void addLogger(C3592a aVar) {
        String k = aVar.mo25875k();
        C2189d dVar = this.rootNode;
        String[] loggerNameComponents = LoggerNamesUtil.getLoggerNameComponents(k);
        for (String str : loggerNameComponents) {
            if (dVar.mo18491c(str) == null) {
                dVar = createNewChildNode(str, dVar);
            }
        }
        if (loggerNameComponents.length > 0) {
            C2189d dVar2 = new C2189d(LoggerNamesUtil.getClassName(loggerNameComponents), aVar, dVar);
            dVar.mo18490b(dVar2);
            this.leafNodeHashtable.put(k, dVar2);
        }
    }

    public boolean contains(String str) {
        return this.leafNodeHashtable.containsKey(str);
    }

    public Level getEffectiveLevel(String str) {
        C2189d dVar = this.leafNodeHashtable.get(str);
        Level level = null;
        while (level == null && dVar != null) {
            level = dVar.mo18492d().mo25874j();
            dVar = dVar.mo18493e();
        }
        return level;
    }

    public synchronized C3592a getLogger(String str) {
        C3592a aVar;
        C2189d dVar = this.leafNodeHashtable.get(str);
        if (dVar == null) {
            aVar = new C3592a(str, this);
            addLogger(aVar);
        } else {
            aVar = dVar.mo18492d();
        }
        return aVar;
    }

    public C3592a getRootLogger() {
        return this.rootNode.mo18492d();
    }

    public int numberOfLeafNodes() {
        return this.leafNodeHashtable.size();
    }

    public void reset() {
        this.rootNode.mo18494f();
        this.leafNodeHashtable.clear();
    }

    public void setLevel(String str, Level level) {
        C2189d dVar = this.leafNodeHashtable.get(str);
        if (dVar == null) {
            dVar = this.rootNode;
            for (String str2 : LoggerNamesUtil.getLoggerNameComponents(str)) {
                if (dVar.mo18491c(str2) == null) {
                    dVar = createNewChildNode(str2, dVar);
                }
            }
            if (dVar == null) {
                return;
            }
        }
        dVar.mo18492d().mo25884t(level);
    }

    public void shutdown() {
        Enumeration<C2189d> elements = this.leafNodeHashtable.elements();
        while (elements.hasMoreElements()) {
            C3592a d = elements.nextElement().mo18492d();
            if (d != null) {
                try {
                    d.mo25867c();
                } catch (IOException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to close logger ");
                    sb.append(d.mo25875k());
                }
            }
        }
    }
}
