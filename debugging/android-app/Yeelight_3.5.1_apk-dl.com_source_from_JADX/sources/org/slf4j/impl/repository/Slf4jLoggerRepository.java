package org.slf4j.impl.repository;

import com.google.code.microlog4android.Level;
import com.google.code.microlog4android.repository.C2187b;
import com.google.code.microlog4android.repository.LoggerNamesUtil;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import org.slf4j.impl.MicrologLoggerAdapter;
import p168h7.C9097a;
import p168h7.C9098b;

public enum Slf4jLoggerRepository implements C9097a, C2187b {
    INSTANCE;
    
    private Hashtable<String, C10261a> leafNodeHashtable;
    private C10261a rootNode;

    private C10261a createNewChildNode(String str, C10261a aVar) {
        C10261a aVar2 = new C10261a(str, aVar);
        aVar.mo41724b(aVar2);
        return aVar2;
    }

    /* access modifiers changed from: package-private */
    public void addLogger(MicrologLoggerAdapter micrologLoggerAdapter) {
        String name = micrologLoggerAdapter.getName();
        C10261a aVar = this.rootNode;
        String[] loggerNameComponents = LoggerNamesUtil.getLoggerNameComponents(name);
        for (String str : loggerNameComponents) {
            if (aVar.mo41725c(str) == null) {
                aVar = createNewChildNode(str, aVar);
            }
        }
        if (loggerNameComponents.length > 0) {
            C10261a aVar2 = new C10261a(LoggerNamesUtil.getClassName(loggerNameComponents), micrologLoggerAdapter, aVar);
            aVar.mo41724b(aVar2);
            this.leafNodeHashtable.put(name, aVar2);
        }
    }

    public boolean contains(String str) {
        return this.leafNodeHashtable.containsKey(str);
    }

    public Level getEffectiveLevel(String str) {
        C10261a aVar = this.leafNodeHashtable.get(str);
        Level level = null;
        while (level == null && aVar != null) {
            level = aVar.mo41726d().getMicrologLogger().mo25874j();
            aVar = aVar.mo41727e();
        }
        return level;
    }

    public synchronized C9098b getLogger(String str) {
        MicrologLoggerAdapter micrologLoggerAdapter;
        C10261a aVar = this.leafNodeHashtable.get(str);
        if (aVar == null) {
            micrologLoggerAdapter = new MicrologLoggerAdapter(str);
            addLogger(micrologLoggerAdapter);
        } else {
            micrologLoggerAdapter = aVar.mo41726d();
        }
        return micrologLoggerAdapter;
    }

    public C9098b getRootLogger() {
        return this.rootNode.mo41726d();
    }

    public int numberOfLeafNodes() {
        return this.leafNodeHashtable.size();
    }

    public void reset() {
        this.rootNode.mo41728f();
        this.leafNodeHashtable.clear();
    }

    public void setLevel(String str, Level level) {
        C10261a aVar = this.leafNodeHashtable.get(str);
        if (aVar == null) {
            aVar = this.rootNode;
            for (String str2 : LoggerNamesUtil.getLoggerNameComponents(str)) {
                if (aVar.mo41725c(str2) == null) {
                    aVar = createNewChildNode(str2, aVar);
                }
            }
            if (aVar == null) {
                return;
            }
        }
        aVar.mo41726d().getMicrologLogger().mo25884t(level);
    }

    public void shutdown() {
        Enumeration<C10261a> elements = this.leafNodeHashtable.elements();
        while (elements.hasMoreElements()) {
            MicrologLoggerAdapter d = elements.nextElement().mo41726d();
            if (d != null) {
                try {
                    d.getMicrologLogger().mo25867c();
                } catch (IOException unused) {
                }
            }
        }
    }
}
