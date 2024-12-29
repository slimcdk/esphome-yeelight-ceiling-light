package com.squareup.leakcanary;

import com.squareup.haha.perflib.ArrayInstance;
import com.squareup.haha.perflib.ClassInstance;
import com.squareup.haha.perflib.ClassObj;
import com.squareup.haha.perflib.Field;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.haha.perflib.Instance;
import com.squareup.haha.perflib.RootObj;
import com.squareup.haha.perflib.RootType;
import com.squareup.haha.perflib.Snapshot;
import com.squareup.haha.perflib.Type;
import com.squareup.haha.perflib.p147io.MemoryMappedFileBuffer;
import com.squareup.haha.trove.THashMap;
import com.squareup.haha.trove.TObjectProcedure;
import com.squareup.leakcanary.LeakTraceElement;
import com.squareup.leakcanary.ShortestPathFinder;
import com.xiaomi.mistatistic.sdk.BaseService;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class HeapAnalyzer {
    private static final String ANONYMOUS_CLASS_NAME_PATTERN = "^.+\\$\\d+$";
    private final ExcludedRefs excludedRefs;

    public HeapAnalyzer(ExcludedRefs excludedRefs2) {
        this.excludedRefs = excludedRefs2;
    }

    private LeakTraceElement buildLeakElement(LeakNode leakNode) {
        String str;
        String str2;
        LeakTraceElement.Holder holder;
        LeakTraceElement.Holder holder2;
        LeakNode leakNode2 = leakNode.parent;
        String str3 = null;
        if (leakNode2 == null) {
            return null;
        }
        Instance instance = leakNode2.instance;
        if (instance instanceof RootObj) {
            return null;
        }
        LeakTraceElement.Type type = leakNode.referenceType;
        String str4 = leakNode.referenceName;
        ArrayList arrayList = new ArrayList();
        if (instance instanceof ClassObj) {
            ClassObj classObj = (ClassObj) instance;
            LeakTraceElement.Holder holder3 = LeakTraceElement.Holder.CLASS;
            String className = classObj.getClassName();
            for (Map.Entry next : classObj.getStaticFieldValues().entrySet()) {
                arrayList.add("static " + ((Field) next.getKey()).getName() + " = " + next.getValue());
            }
            str = null;
            str2 = className;
            holder = holder3;
        } else {
            if (instance instanceof ArrayInstance) {
                ArrayInstance arrayInstance = (ArrayInstance) instance;
                LeakTraceElement.Holder holder4 = LeakTraceElement.Holder.ARRAY;
                String className2 = arrayInstance.getClassObj().getClassName();
                if (arrayInstance.getArrayType() == Type.OBJECT) {
                    Object[] values = arrayInstance.getValues();
                    for (int i = 0; i < values.length; i++) {
                        arrayList.add("[" + i + "] = " + values[i]);
                    }
                }
                str = null;
                holder = holder4;
                str2 = className2;
            } else {
                ClassInstance classInstance = (ClassInstance) instance;
                ClassObj classObj2 = instance.getClassObj();
                for (Map.Entry<Field, Object> fieldToString : classObj2.getStaticFieldValues().entrySet()) {
                    arrayList.add("static " + HahaHelper.fieldToString(fieldToString));
                }
                for (ClassInstance.FieldValue fieldToString2 : classInstance.getValues()) {
                    arrayList.add(HahaHelper.fieldToString(fieldToString2));
                }
                String className3 = classObj2.getClassName();
                if (HahaHelper.extendsThread(classObj2)) {
                    LeakTraceElement.Holder holder5 = LeakTraceElement.Holder.THREAD;
                    str = "(named '" + HahaHelper.threadName(instance) + "')";
                    holder = holder5;
                } else {
                    if (className3.matches(ANONYMOUS_CLASS_NAME_PATTERN)) {
                        String className4 = classObj2.getSuperClassObj().getClassName();
                        if (Object.class.getName().equals(className4)) {
                            holder2 = LeakTraceElement.Holder.OBJECT;
                            try {
                                Class[] interfaces = Class.forName(classObj2.getClassName()).getInterfaces();
                                if (interfaces.length > 0) {
                                    Class cls = interfaces[0];
                                    str3 = "(anonymous implementation of " + cls.getName() + ")";
                                } else {
                                    str3 = "(anonymous subclass of java.lang.Object)";
                                }
                            } catch (ClassNotFoundException unused) {
                            }
                        } else {
                            LeakTraceElement.Holder holder6 = LeakTraceElement.Holder.OBJECT;
                            str3 = "(anonymous subclass of " + className4 + ")";
                            holder2 = holder6;
                        }
                    } else {
                        holder2 = LeakTraceElement.Holder.OBJECT;
                    }
                    holder = holder2;
                    str = str3;
                }
                str2 = className3;
            }
        }
        return new LeakTraceElement(str4, type, holder, str2, str, leakNode.exclusion, arrayList);
    }

    private LeakTrace buildLeakTrace(LeakNode leakNode) {
        ArrayList arrayList = new ArrayList();
        LeakNode leakNode2 = new LeakNode((Exclusion) null, (Instance) null, leakNode, (String) null, (LeakTraceElement.Type) null);
        for (leakNode2 = leakNode2.parent; leakNode2 != null; leakNode2 = leakNode2.parent) {
            LeakTraceElement buildLeakElement = buildLeakElement(leakNode2);
            if (buildLeakElement != null) {
                arrayList.add(0, buildLeakElement);
            }
        }
        return new LeakTrace(arrayList);
    }

    private int computeIgnoredBitmapRetainedSize(Snapshot snapshot, Instance instance) {
        ArrayInstance arrayInstance;
        int i = 0;
        for (Instance next : snapshot.findClass("android.graphics.Bitmap").getInstancesList()) {
            if (isIgnoredDominator(instance, next) && (arrayInstance = (ArrayInstance) HahaHelper.fieldValue(HahaHelper.classInstanceValues(next), "mBuffer")) != null) {
                long totalRetainedSize = arrayInstance.getTotalRetainedSize();
                long totalRetainedSize2 = next.getTotalRetainedSize();
                if (totalRetainedSize2 < totalRetainedSize) {
                    totalRetainedSize2 += totalRetainedSize;
                }
                i = (int) (((long) i) + totalRetainedSize2);
            }
        }
        return i;
    }

    private AnalysisResult findLeakTrace(long j, Snapshot snapshot, Instance instance) {
        ShortestPathFinder.Result findPath = new ShortestPathFinder(this.excludedRefs).findPath(snapshot, instance);
        LeakNode leakNode = findPath.leakingNode;
        if (leakNode == null) {
            return AnalysisResult.noLeak(since(j));
        }
        LeakTrace buildLeakTrace = buildLeakTrace(leakNode);
        String className = instance.getClassObj().getClassName();
        snapshot.computeDominators();
        Instance instance2 = findPath.leakingNode.instance;
        return AnalysisResult.leakDetected(findPath.excludingKnownLeaks, className, buildLeakTrace, instance2.getTotalRetainedSize() + ((long) computeIgnoredBitmapRetainedSize(snapshot, instance2)), since(j));
    }

    private Instance findLeakingReference(String str, Snapshot snapshot) {
        ClassObj findClass = snapshot.findClass(KeyedWeakReference.class.getName());
        ArrayList arrayList = new ArrayList();
        for (Instance classInstanceValues : findClass.getInstancesList()) {
            List<ClassInstance.FieldValue> classInstanceValues2 = HahaHelper.classInstanceValues(classInstanceValues);
            String asString = HahaHelper.asString(HahaHelper.fieldValue(classInstanceValues2, BaseService.KEY));
            if (asString.equals(str)) {
                return (Instance) HahaHelper.fieldValue(classInstanceValues2, "referent");
            }
            arrayList.add(asString);
        }
        throw new IllegalStateException("Could not find weak reference with key " + str + " in " + arrayList);
    }

    private String generateRootKey(RootObj rootObj) {
        return String.format("%s@0x%08x", new Object[]{rootObj.getRootType().getName(), Long.valueOf(rootObj.getId())});
    }

    private boolean isIgnoredDominator(Instance instance, Instance instance2) {
        boolean z = false;
        do {
            Instance immediateDominator = instance2.getImmediateDominator();
            if (!(immediateDominator instanceof RootObj) || ((RootObj) immediateDominator).getRootType() != RootType.UNKNOWN) {
                instance2 = immediateDominator;
            } else {
                instance2 = instance2.getNextInstanceToGcRoot();
                z = true;
            }
            if (instance2 == null) {
                return false;
            }
        } while (instance2 != instance);
        return z;
    }

    private long since(long j) {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - j);
    }

    public AnalysisResult checkForLeak(File file, String str) {
        long nanoTime = System.nanoTime();
        if (!file.exists()) {
            return AnalysisResult.failure(new IllegalArgumentException("File does not exist: " + file), since(nanoTime));
        }
        try {
            Snapshot parse = new HprofParser(new MemoryMappedFileBuffer(file)).parse();
            deduplicateGcRoots(parse);
            Instance findLeakingReference = findLeakingReference(str, parse);
            return findLeakingReference == null ? AnalysisResult.noLeak(since(nanoTime)) : findLeakTrace(nanoTime, parse, findLeakingReference);
        } catch (Throwable th) {
            return AnalysisResult.failure(th, since(nanoTime));
        }
    }

    /* access modifiers changed from: package-private */
    public void deduplicateGcRoots(Snapshot snapshot) {
        final THashMap tHashMap = new THashMap();
        final ArrayList<RootObj> arrayList = (ArrayList) snapshot.getGCRoots();
        for (RootObj rootObj : arrayList) {
            String generateRootKey = generateRootKey(rootObj);
            if (!tHashMap.containsKey(generateRootKey)) {
                tHashMap.put(generateRootKey, rootObj);
            }
        }
        arrayList.clear();
        tHashMap.forEach(new TObjectProcedure<String>() {
            public boolean execute(String str) {
                return arrayList.add(tHashMap.get(str));
            }
        });
    }
}
