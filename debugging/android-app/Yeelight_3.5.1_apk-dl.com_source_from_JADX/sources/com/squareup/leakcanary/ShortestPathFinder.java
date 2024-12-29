package com.squareup.leakcanary;

import com.squareup.haha.perflib.ArrayInstance;
import com.squareup.haha.perflib.ClassInstance;
import com.squareup.haha.perflib.ClassObj;
import com.squareup.haha.perflib.Field;
import com.squareup.haha.perflib.HahaSpy;
import com.squareup.haha.perflib.Instance;
import com.squareup.haha.perflib.RootObj;
import com.squareup.haha.perflib.RootType;
import com.squareup.haha.perflib.Snapshot;
import com.squareup.haha.perflib.Type;
import com.squareup.leakcanary.LeakTraceElement;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

final class ShortestPathFinder {
    private boolean canIgnoreStrings;
    private final ExcludedRefs excludedRefs;
    private final Queue<LeakNode> toVisitIfNoPathQueue = new LinkedList();
    private final LinkedHashSet<Instance> toVisitIfNoPathSet = new LinkedHashSet<>();
    private final Queue<LeakNode> toVisitQueue = new LinkedList();
    private final LinkedHashSet<Instance> toVisitSet = new LinkedHashSet<>();
    private final LinkedHashSet<Instance> visitedSet = new LinkedHashSet<>();

    /* renamed from: com.squareup.leakcanary.ShortestPathFinder$1 */
    static /* synthetic */ class C42551 {
        static final /* synthetic */ int[] $SwitchMap$com$squareup$haha$perflib$RootType;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.squareup.haha.perflib.RootType[] r0 = com.squareup.haha.perflib.RootType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$squareup$haha$perflib$RootType = r0
                com.squareup.haha.perflib.RootType r1 = com.squareup.haha.perflib.RootType.JAVA_LOCAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$squareup$haha$perflib$RootType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.squareup.haha.perflib.RootType r1 = com.squareup.haha.perflib.RootType.INTERNED_STRING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$squareup$haha$perflib$RootType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.squareup.haha.perflib.RootType r1 = com.squareup.haha.perflib.RootType.DEBUGGER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$squareup$haha$perflib$RootType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.squareup.haha.perflib.RootType r1 = com.squareup.haha.perflib.RootType.INVALID_TYPE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$squareup$haha$perflib$RootType     // Catch:{ NoSuchFieldError -> 0x003e }
                com.squareup.haha.perflib.RootType r1 = com.squareup.haha.perflib.RootType.UNREACHABLE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$squareup$haha$perflib$RootType     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.squareup.haha.perflib.RootType r1 = com.squareup.haha.perflib.RootType.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$squareup$haha$perflib$RootType     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.squareup.haha.perflib.RootType r1 = com.squareup.haha.perflib.RootType.FINALIZING     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$com$squareup$haha$perflib$RootType     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.squareup.haha.perflib.RootType r1 = com.squareup.haha.perflib.RootType.SYSTEM_CLASS     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$com$squareup$haha$perflib$RootType     // Catch:{ NoSuchFieldError -> 0x006c }
                com.squareup.haha.perflib.RootType r1 = com.squareup.haha.perflib.RootType.VM_INTERNAL     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = $SwitchMap$com$squareup$haha$perflib$RootType     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.squareup.haha.perflib.RootType r1 = com.squareup.haha.perflib.RootType.NATIVE_LOCAL     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = $SwitchMap$com$squareup$haha$perflib$RootType     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.squareup.haha.perflib.RootType r1 = com.squareup.haha.perflib.RootType.NATIVE_STATIC     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = $SwitchMap$com$squareup$haha$perflib$RootType     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.squareup.haha.perflib.RootType r1 = com.squareup.haha.perflib.RootType.THREAD_BLOCK     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = $SwitchMap$com$squareup$haha$perflib$RootType     // Catch:{ NoSuchFieldError -> 0x009c }
                com.squareup.haha.perflib.RootType r1 = com.squareup.haha.perflib.RootType.BUSY_MONITOR     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = $SwitchMap$com$squareup$haha$perflib$RootType     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.squareup.haha.perflib.RootType r1 = com.squareup.haha.perflib.RootType.NATIVE_MONITOR     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = $SwitchMap$com$squareup$haha$perflib$RootType     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.squareup.haha.perflib.RootType r1 = com.squareup.haha.perflib.RootType.REFERENCE_CLEANUP     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = $SwitchMap$com$squareup$haha$perflib$RootType     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.squareup.haha.perflib.RootType r1 = com.squareup.haha.perflib.RootType.NATIVE_STACK     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = $SwitchMap$com$squareup$haha$perflib$RootType     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.squareup.haha.perflib.RootType r1 = com.squareup.haha.perflib.RootType.JAVA_STATIC     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.leakcanary.ShortestPathFinder.C42551.<clinit>():void");
        }
    }

    static final class Result {
        final boolean excludingKnownLeaks;
        final LeakNode leakingNode;

        Result(LeakNode leakNode, boolean z) {
            this.leakingNode = leakNode;
            this.excludingKnownLeaks = z;
        }
    }

    ShortestPathFinder(ExcludedRefs excludedRefs2) {
        this.excludedRefs = excludedRefs2;
    }

    private boolean checkSeen(LeakNode leakNode) {
        return !this.visitedSet.add(leakNode.instance);
    }

    private void clearState() {
        this.toVisitQueue.clear();
        this.toVisitIfNoPathQueue.clear();
        this.toVisitSet.clear();
        this.toVisitIfNoPathSet.clear();
        this.visitedSet.clear();
    }

    private void enqueue(Exclusion exclusion, LeakNode leakNode, Instance instance, String str, LeakTraceElement.Type type) {
        Queue<LeakNode> queue;
        if (instance != null && !HahaHelper.isPrimitiveOrWrapperArray(instance) && !HahaHelper.isPrimitiveWrapper(instance) && !this.toVisitSet.contains(instance)) {
            boolean z = exclusion == null;
            if (!z && this.toVisitIfNoPathSet.contains(instance)) {
                return;
            }
            if ((!this.canIgnoreStrings || !isString(instance)) && !this.visitedSet.contains(instance)) {
                LeakNode leakNode2 = new LeakNode(exclusion, instance, leakNode, str, type);
                if (z) {
                    this.toVisitSet.add(instance);
                    queue = this.toVisitQueue;
                } else {
                    this.toVisitIfNoPathSet.add(instance);
                    queue = this.toVisitIfNoPathQueue;
                }
                queue.add(leakNode2);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void enqueueGcRoots(com.squareup.haha.perflib.Snapshot r8) {
        /*
            r7 = this;
            java.util.Collection r8 = r8.getGCRoots()
            java.util.Iterator r8 = r8.iterator()
        L_0x0008:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0062
            java.lang.Object r0 = r8.next()
            r4 = r0
            com.squareup.haha.perflib.RootObj r4 = (com.squareup.haha.perflib.RootObj) r4
            int[] r0 = com.squareup.leakcanary.ShortestPathFinder.C42551.$SwitchMap$com$squareup$haha$perflib$RootType
            com.squareup.haha.perflib.RootType r1 = r4.getRootType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L_0x0048;
                case 2: goto L_0x0008;
                case 3: goto L_0x0008;
                case 4: goto L_0x0008;
                case 5: goto L_0x0008;
                case 6: goto L_0x0008;
                case 7: goto L_0x0008;
                case 8: goto L_0x003f;
                case 9: goto L_0x003f;
                case 10: goto L_0x003f;
                case 11: goto L_0x003f;
                case 12: goto L_0x003f;
                case 13: goto L_0x003f;
                case 14: goto L_0x003f;
                case 15: goto L_0x003f;
                case 16: goto L_0x003f;
                case 17: goto L_0x003f;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown root type:"
            r0.append(r1)
            com.squareup.haha.perflib.RootType r1 = r4.getRootType()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L_0x003f:
            r2 = 0
        L_0x0040:
            r3 = 0
            r5 = 0
            r6 = 0
            r1 = r7
            r1.enqueue(r2, r3, r4, r5, r6)
            goto L_0x0008
        L_0x0048:
            com.squareup.haha.perflib.Instance r0 = com.squareup.haha.perflib.HahaSpy.allocatingThread(r4)
            java.lang.String r0 = com.squareup.leakcanary.HahaHelper.threadName(r0)
            com.squareup.leakcanary.ExcludedRefs r1 = r7.excludedRefs
            java.util.Map<java.lang.String, com.squareup.leakcanary.Exclusion> r1 = r1.threadNames
            java.lang.Object r0 = r1.get(r0)
            r2 = r0
            com.squareup.leakcanary.Exclusion r2 = (com.squareup.leakcanary.Exclusion) r2
            if (r2 == 0) goto L_0x0040
            boolean r0 = r2.alwaysExclude
            if (r0 != 0) goto L_0x0008
            goto L_0x0040
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.leakcanary.ShortestPathFinder.enqueueGcRoots(com.squareup.haha.perflib.Snapshot):void");
    }

    private boolean isString(Instance instance) {
        return instance.getClassObj() != null && instance.getClassObj().getClassName().equals(String.class.getName());
    }

    private Exclusion rootSuperClassAlwaysIgnored(Instance instance) {
        Exclusion exclusion = null;
        if (instance == null) {
            return null;
        }
        for (ClassObj classObj = instance.getClassObj(); classObj != null; classObj = classObj.getSuperClassObj()) {
            Exclusion exclusion2 = this.excludedRefs.rootClassNames.get(classObj.getClassName());
            if (exclusion2 != null && (exclusion == null || !exclusion.alwaysExclude)) {
                exclusion = exclusion2;
            }
        }
        return exclusion;
    }

    private void visitArrayInstance(LeakNode leakNode) {
        ArrayInstance arrayInstance = (ArrayInstance) leakNode.instance;
        if (arrayInstance.getArrayType() == Type.OBJECT) {
            Object[] values = arrayInstance.getValues();
            for (int i = 0; i < values.length; i++) {
                enqueue((Exclusion) null, leakNode, (Instance) values[i], "[" + i + "]", LeakTraceElement.Type.ARRAY_ENTRY);
            }
        }
    }

    private void visitClassInstance(LeakNode leakNode) {
        ClassInstance classInstance = (ClassInstance) leakNode.instance;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Exclusion exclusion = null;
        for (ClassObj classObj = classInstance.getClassObj(); classObj != null; classObj = classObj.getSuperClassObj()) {
            Exclusion exclusion2 = this.excludedRefs.classNames.get(classObj.getClassName());
            if (exclusion2 != null && (exclusion == null || !exclusion.alwaysExclude)) {
                exclusion = exclusion2;
            }
            Map map = this.excludedRefs.fieldNameByClassName.get(classObj.getClassName());
            if (map != null) {
                linkedHashMap.putAll(map);
            }
        }
        if (exclusion == null || !exclusion.alwaysExclude) {
            for (ClassInstance.FieldValue next : classInstance.getValues()) {
                Field field = next.getField();
                if (field.getType() == Type.OBJECT) {
                    Instance instance = (Instance) next.getValue();
                    String name = field.getName();
                    Exclusion exclusion3 = (Exclusion) linkedHashMap.get(name);
                    enqueue((exclusion3 == null || (exclusion != null && (!exclusion3.alwaysExclude || exclusion.alwaysExclude))) ? exclusion : exclusion3, leakNode, instance, name, LeakTraceElement.Type.INSTANCE_FIELD);
                }
            }
        }
    }

    private void visitClassObj(LeakNode leakNode) {
        Exclusion exclusion;
        ClassObj classObj = (ClassObj) leakNode.instance;
        Map map = this.excludedRefs.staticFieldNameByClassName.get(classObj.getClassName());
        for (Map.Entry next : classObj.getStaticFieldValues().entrySet()) {
            Field field = (Field) next.getKey();
            if (field.getType() == Type.OBJECT) {
                String name = field.getName();
                if (!name.equals("$staticOverhead")) {
                    Instance instance = (Instance) next.getValue();
                    boolean z = true;
                    if (!(map == null || (exclusion = (Exclusion) map.get(name)) == null)) {
                        z = false;
                        if (!exclusion.alwaysExclude) {
                            enqueue(exclusion, leakNode, instance, name, LeakTraceElement.Type.STATIC_FIELD);
                        }
                    }
                    if (z) {
                        enqueue((Exclusion) null, leakNode, instance, name, LeakTraceElement.Type.STATIC_FIELD);
                    }
                }
            }
        }
    }

    private void visitRootObj(LeakNode leakNode) {
        LeakTraceElement.Type type;
        String str;
        LeakNode leakNode2;
        ShortestPathFinder shortestPathFinder;
        RootObj rootObj = (RootObj) leakNode.instance;
        Instance referredInstance = rootObj.getReferredInstance();
        Exclusion rootSuperClassAlwaysIgnored = rootSuperClassAlwaysIgnored(referredInstance);
        if (rootSuperClassAlwaysIgnored == null || !rootSuperClassAlwaysIgnored.alwaysExclude) {
            if (rootObj.getRootType() == RootType.JAVA_LOCAL) {
                leakNode2 = new LeakNode((Exclusion) null, HahaSpy.allocatingThread(rootObj), (LeakNode) null, (String) null, (LeakTraceElement.Type) null);
                Exclusion exclusion = leakNode.exclusion;
                if (exclusion != null) {
                    rootSuperClassAlwaysIgnored = exclusion;
                }
                type = LeakTraceElement.Type.LOCAL;
                str = "<Java Local>";
                shortestPathFinder = this;
            } else {
                str = null;
                type = null;
                shortestPathFinder = this;
                leakNode2 = leakNode;
            }
            shortestPathFinder.enqueue(rootSuperClassAlwaysIgnored, leakNode2, referredInstance, str, type);
        }
    }

    /* access modifiers changed from: package-private */
    public Result findPath(Snapshot snapshot, Instance instance) {
        LeakNode leakNode;
        clearState();
        this.canIgnoreStrings = !isString(instance);
        enqueueGcRoots(snapshot);
        boolean z = false;
        LeakNode leakNode2 = null;
        while (true) {
            if (this.toVisitQueue.isEmpty() && this.toVisitIfNoPathQueue.isEmpty()) {
                break;
            }
            if (!this.toVisitQueue.isEmpty()) {
                leakNode = this.toVisitQueue.poll();
            } else {
                leakNode = this.toVisitIfNoPathQueue.poll();
                if (leakNode.exclusion != null) {
                    z = true;
                } else {
                    throw new IllegalStateException("Expected node to have an exclusion " + leakNode);
                }
            }
            if (leakNode.instance == instance) {
                leakNode2 = leakNode;
                break;
            } else if (!checkSeen(leakNode)) {
                Instance instance2 = leakNode.instance;
                if (instance2 instanceof RootObj) {
                    visitRootObj(leakNode);
                } else if (instance2 instanceof ClassObj) {
                    visitClassObj(leakNode);
                } else if (instance2 instanceof ClassInstance) {
                    visitClassInstance(leakNode);
                } else if (instance2 instanceof ArrayInstance) {
                    visitArrayInstance(leakNode);
                } else {
                    throw new IllegalStateException("Unexpected type for " + leakNode.instance);
                }
            }
        }
        return new Result(leakNode2, z);
    }
}
