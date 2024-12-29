package com.squareup.haha.perflib;

import com.squareup.haha.perflib.p147io.HprofBuffer;
import com.squareup.haha.trove.TLongObjectHashMap;

public class HprofParser {
    private static final int ALLOC_SITES = 6;
    private static final int CONTROL_SETTINGS = 14;
    private static final int CPU_SAMPLES = 13;
    private static final int END_THREAD = 11;
    private static final int HEAP_DUMP = 12;
    private static final int HEAP_DUMP_END = 44;
    private static final int HEAP_DUMP_SEGMENT = 28;
    private static final int HEAP_SUMMARY = 7;
    private static final int LOAD_CLASS = 2;
    private static final int ROOT_CLASS_DUMP = 32;
    private static final int ROOT_DEBUGGER = 139;
    private static final int ROOT_FINALIZING = 138;
    private static final int ROOT_HEAP_DUMP_INFO = 254;
    private static final int ROOT_INSTANCE_DUMP = 33;
    private static final int ROOT_INTERNED_STRING = 137;
    private static final int ROOT_JAVA_FRAME = 3;
    private static final int ROOT_JNI_GLOBAL = 1;
    private static final int ROOT_JNI_LOCAL = 2;
    private static final int ROOT_JNI_MONITOR = 142;
    private static final int ROOT_MONITOR_USED = 7;
    private static final int ROOT_NATIVE_STACK = 4;
    private static final int ROOT_OBJECT_ARRAY_DUMP = 34;
    private static final int ROOT_PRIMITIVE_ARRAY_DUMP = 35;
    private static final int ROOT_PRIMITIVE_ARRAY_NODATA = 195;
    private static final int ROOT_REFERENCE_CLEANUP = 140;
    private static final int ROOT_STICKY_CLASS = 5;
    private static final int ROOT_THREAD_BLOCK = 6;
    private static final int ROOT_THREAD_OBJECT = 8;
    private static final int ROOT_UNKNOWN = 255;
    private static final int ROOT_UNREACHABLE = 144;
    private static final int ROOT_VM_INTERNAL = 141;
    private static final int STACK_FRAME = 4;
    private static final int STACK_TRACE = 5;
    private static final int START_THREAD = 10;
    private static final int STRING_IN_UTF8 = 1;
    private static final int UNLOAD_CLASS = 3;
    TLongObjectHashMap<String> mClassNames = new TLongObjectHashMap<>();
    int mIdSize;
    private final HprofBuffer mInput;
    Snapshot mSnapshot;
    TLongObjectHashMap<String> mStrings = new TLongObjectHashMap<>();

    public HprofParser(HprofBuffer hprofBuffer) {
        this.mInput = hprofBuffer;
    }

    private int loadBasicObj(RootType rootType) {
        this.mSnapshot.addRoot(new RootObj(rootType, readId()));
        return this.mIdSize;
    }

    private void loadClass() {
        this.mInput.readInt();
        long readId = readId();
        this.mInput.readInt();
        this.mClassNames.put(readId, this.mStrings.get(readId()));
    }

    private int loadClassDump() {
        long readId = readId();
        StackTrace stackTrace = this.mSnapshot.getStackTrace(this.mInput.readInt());
        long readId2 = readId();
        long readId3 = readId();
        readId();
        readId();
        readId();
        readId();
        int readInt = this.mInput.readInt();
        int readUnsignedShort = readUnsignedShort();
        int i = (this.mIdSize * 7) + 4 + 4 + 2;
        for (int i2 = 0; i2 < readUnsignedShort; i2++) {
            readUnsignedShort();
            i += skipValue() + 2;
        }
        ClassObj classObj = r1;
        ClassObj classObj2 = new ClassObj(readId, stackTrace, this.mClassNames.get(readId), this.mInput.position());
        classObj.setSuperClassId(readId2);
        classObj.setClassLoaderId(readId3);
        int readUnsignedShort2 = readUnsignedShort();
        int i3 = i + 2;
        Field[] fieldArr = new Field[readUnsignedShort2];
        for (int i4 = 0; i4 < readUnsignedShort2; i4++) {
            Type type = Type.getType(this.mInput.readByte());
            fieldArr[i4] = new Field(type, this.mStrings.get(readId()));
            skipFully((long) this.mSnapshot.getTypeSize(type));
            i3 += this.mIdSize + 1 + this.mSnapshot.getTypeSize(type);
        }
        classObj.setStaticFields(fieldArr);
        int readUnsignedShort3 = readUnsignedShort();
        int i5 = i3 + 2;
        Field[] fieldArr2 = new Field[readUnsignedShort3];
        for (int i6 = 0; i6 < readUnsignedShort3; i6++) {
            fieldArr2[i6] = new Field(Type.getType(readUnsignedByte()), this.mStrings.get(readId()));
            i5 += this.mIdSize + 1;
        }
        classObj.setFields(fieldArr2);
        classObj.setInstanceSize(readInt);
        this.mSnapshot.addClass(readId, classObj);
        return i5;
    }

    private void loadHeapDump(long j) {
        RootType rootType;
        int i;
        while (j > 0) {
            int readUnsignedByte = readUnsignedByte();
            long j2 = j - 1;
            if (readUnsignedByte == 144) {
                rootType = RootType.UNREACHABLE;
            } else if (readUnsignedByte != ROOT_PRIMITIVE_ARRAY_NODATA) {
                if (readUnsignedByte == ROOT_HEAP_DUMP_INFO) {
                    int readInt = this.mInput.readInt();
                    long readId = readId();
                    this.mSnapshot.setHeapTo(readInt, this.mStrings.get(readId));
                    i = this.mIdSize + 4;
                } else if (readUnsignedByte != 255) {
                    switch (readUnsignedByte) {
                        case 1:
                            j2 -= (long) loadBasicObj(RootType.NATIVE_STATIC);
                            readId();
                            i = this.mIdSize;
                            continue;
                        case 2:
                            i = loadJniLocal();
                            continue;
                        case 3:
                            i = loadJavaFrame();
                            continue;
                        case 4:
                            i = loadNativeStack();
                            continue;
                        case 5:
                            rootType = RootType.SYSTEM_CLASS;
                            break;
                        case 6:
                            i = loadThreadBlock();
                            continue;
                        case 7:
                            rootType = RootType.BUSY_MONITOR;
                            break;
                        case 8:
                            i = loadThreadObject();
                            continue;
                        default:
                            switch (readUnsignedByte) {
                                case 32:
                                    i = loadClassDump();
                                    continue;
                                case 33:
                                    i = loadInstanceDump();
                                    continue;
                                case 34:
                                    i = loadObjectArrayDump();
                                    continue;
                                case 35:
                                    i = loadPrimitiveArrayDump();
                                    continue;
                                default:
                                    switch (readUnsignedByte) {
                                        case ROOT_INTERNED_STRING /*137*/:
                                            rootType = RootType.INTERNED_STRING;
                                            break;
                                        case ROOT_FINALIZING /*138*/:
                                            rootType = RootType.FINALIZING;
                                            break;
                                        case ROOT_DEBUGGER /*139*/:
                                            rootType = RootType.DEBUGGER;
                                            break;
                                        case ROOT_REFERENCE_CLEANUP /*140*/:
                                            rootType = RootType.REFERENCE_CLEANUP;
                                            break;
                                        case ROOT_VM_INTERNAL /*141*/:
                                            rootType = RootType.VM_INTERNAL;
                                            break;
                                        case ROOT_JNI_MONITOR /*142*/:
                                            i = loadJniMonitor();
                                            continue;
                                            continue;
                                            continue;
                                        default:
                                            throw new IllegalArgumentException("loadHeapDump loop with unknown tag " + readUnsignedByte + " with " + this.mInput.remaining() + " bytes possibly remaining");
                                    }
                            }
                    }
                } else {
                    rootType = RootType.UNKNOWN;
                }
                j = j2 - ((long) i);
            } else {
                System.err.println("+--- PRIMITIVE ARRAY NODATA DUMP");
                loadPrimitiveArrayDump();
                throw new IllegalArgumentException("Don't know how to load a nodata array");
            }
            i = loadBasicObj(rootType);
            j = j2 - ((long) i);
        }
    }

    private int loadInstanceDump() {
        long readId = readId();
        StackTrace stackTrace = this.mSnapshot.getStackTrace(this.mInput.readInt());
        long readId2 = readId();
        int readInt = this.mInput.readInt();
        ClassInstance classInstance = new ClassInstance(readId, stackTrace, this.mInput.position());
        classInstance.setClassId(readId2);
        this.mSnapshot.addInstance(readId, classInstance);
        skipFully((long) readInt);
        int i = this.mIdSize;
        return i + 4 + i + 4 + readInt;
    }

    private int loadJavaFrame() {
        long readId = readId();
        int readInt = this.mInput.readInt();
        this.mSnapshot.addRoot(new RootObj(RootType.JAVA_LOCAL, readId, readInt, this.mSnapshot.getStackTraceAtDepth(this.mSnapshot.getThread(readInt).mStackTrace, this.mInput.readInt())));
        return this.mIdSize + 4 + 4;
    }

    private int loadJniLocal() {
        long readId = readId();
        int readInt = this.mInput.readInt();
        this.mSnapshot.addRoot(new RootObj(RootType.NATIVE_LOCAL, readId, readInt, this.mSnapshot.getStackTraceAtDepth(this.mSnapshot.getThread(readInt).mStackTrace, this.mInput.readInt())));
        return this.mIdSize + 4 + 4;
    }

    private int loadJniMonitor() {
        long readId = readId();
        int readInt = this.mInput.readInt();
        this.mSnapshot.addRoot(new RootObj(RootType.NATIVE_MONITOR, readId, readInt, this.mSnapshot.getStackTraceAtDepth(this.mSnapshot.getThread(readInt).mStackTrace, this.mInput.readInt())));
        return this.mIdSize + 4 + 4;
    }

    private int loadNativeStack() {
        long readId = readId();
        int readInt = this.mInput.readInt();
        this.mSnapshot.addRoot(new RootObj(RootType.NATIVE_STACK, readId, readInt, this.mSnapshot.getStackTrace(this.mSnapshot.getThread(readInt).mStackTrace)));
        return this.mIdSize + 4;
    }

    private int loadObjectArrayDump() {
        long readId = readId();
        StackTrace stackTrace = this.mSnapshot.getStackTrace(this.mInput.readInt());
        int readInt = this.mInput.readInt();
        long readId2 = readId();
        ArrayInstance arrayInstance = new ArrayInstance(readId, stackTrace, Type.OBJECT, readInt, this.mInput.position());
        arrayInstance.setClassId(readId2);
        this.mSnapshot.addInstance(readId, arrayInstance);
        int i = readInt * this.mIdSize;
        skipFully((long) i);
        int i2 = this.mIdSize;
        return i2 + 4 + 4 + i2 + i;
    }

    private int loadPrimitiveArrayDump() {
        long readId = readId();
        StackTrace stackTrace = this.mSnapshot.getStackTrace(this.mInput.readInt());
        int readInt = this.mInput.readInt();
        Type type = Type.getType(readUnsignedByte());
        int typeSize = this.mSnapshot.getTypeSize(type);
        this.mSnapshot.addInstance(readId, new ArrayInstance(readId, stackTrace, type, readInt, this.mInput.position()));
        int i = readInt * typeSize;
        skipFully((long) i);
        return this.mIdSize + 4 + 4 + 1 + i;
    }

    private void loadStackFrame() {
        this.mSnapshot.addStackFrame(new StackFrame(readId(), this.mStrings.get(readId()), this.mStrings.get(readId()), this.mStrings.get(readId()), this.mInput.readInt(), this.mInput.readInt()));
    }

    private void loadStackTrace() {
        int readInt = this.mInput.readInt();
        int readInt2 = this.mInput.readInt();
        int readInt3 = this.mInput.readInt();
        StackFrame[] stackFrameArr = new StackFrame[readInt3];
        for (int i = 0; i < readInt3; i++) {
            stackFrameArr[i] = this.mSnapshot.getStackFrame(readId());
        }
        this.mSnapshot.addStackTrace(new StackTrace(readInt, readInt2, stackFrameArr));
    }

    private void loadString(int i) {
        this.mStrings.put(readId(), readUTF8(i));
    }

    private int loadThreadBlock() {
        long readId = readId();
        int readInt = this.mInput.readInt();
        this.mSnapshot.addRoot(new RootObj(RootType.THREAD_BLOCK, readId, readInt, this.mSnapshot.getStackTrace(this.mSnapshot.getThread(readInt).mStackTrace)));
        return this.mIdSize + 4;
    }

    private int loadThreadObject() {
        long readId = readId();
        int readInt = this.mInput.readInt();
        this.mSnapshot.addThread(new ThreadObj(readId, this.mInput.readInt()), readInt);
        return this.mIdSize + 4 + 4;
    }

    private long readId() {
        int i = this.mIdSize;
        if (i == 1) {
            return (long) this.mInput.readByte();
        }
        if (i == 2) {
            return (long) this.mInput.readShort();
        }
        if (i == 4) {
            return (long) this.mInput.readInt();
        }
        if (i == 8) {
            return this.mInput.readLong();
        }
        throw new IllegalArgumentException("ID Length must be 1, 2, 4, or 8");
    }

    private String readNullTerminatedString() {
        StringBuilder sb = new StringBuilder();
        while (true) {
            byte readByte = this.mInput.readByte();
            if (readByte == 0) {
                return sb.toString();
            }
            sb.append((char) readByte);
        }
    }

    private String readUTF8(int i) {
        byte[] bArr = new byte[i];
        this.mInput.read(bArr);
        return new String(bArr, "utf-8");
    }

    private int readUnsignedByte() {
        return this.mInput.readByte() & 255;
    }

    private long readUnsignedInt() {
        return ((long) this.mInput.readInt()) & 4294967295L;
    }

    private int readUnsignedShort() {
        return this.mInput.readShort() & 65535;
    }

    private void skipFully(long j) {
        HprofBuffer hprofBuffer = this.mInput;
        hprofBuffer.setPosition(hprofBuffer.position() + j);
    }

    private int skipValue() {
        int typeSize = this.mSnapshot.getTypeSize(Type.getType(readUnsignedByte()));
        skipFully((long) typeSize);
        return typeSize + 1;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|(4:5|(2:7|(2:9|(2:11|(4:13|(2:15|(2:17|32)(1:18))(1:20)|19|33)(2:21|34))(2:22|35))(2:23|36))(2:24|37)|31|3)|26|27|29|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        r1.printStackTrace();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0070 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.squareup.haha.perflib.Snapshot parse() {
        /*
            r5 = this;
            com.squareup.haha.perflib.Snapshot r0 = new com.squareup.haha.perflib.Snapshot
            com.squareup.haha.perflib.io.HprofBuffer r1 = r5.mInput
            r0.<init>(r1)
            r5.mSnapshot = r0
            r5.readNullTerminatedString()     // Catch:{ EOFException -> 0x0070 }
            com.squareup.haha.perflib.io.HprofBuffer r1 = r5.mInput     // Catch:{ EOFException -> 0x0070 }
            int r1 = r1.readInt()     // Catch:{ EOFException -> 0x0070 }
            r5.mIdSize = r1     // Catch:{ EOFException -> 0x0070 }
            com.squareup.haha.perflib.Snapshot r2 = r5.mSnapshot     // Catch:{ EOFException -> 0x0070 }
            r2.setIdSize(r1)     // Catch:{ EOFException -> 0x0070 }
            com.squareup.haha.perflib.io.HprofBuffer r1 = r5.mInput     // Catch:{ EOFException -> 0x0070 }
            r1.readLong()     // Catch:{ EOFException -> 0x0070 }
        L_0x001e:
            com.squareup.haha.perflib.io.HprofBuffer r1 = r5.mInput     // Catch:{ EOFException -> 0x0070 }
            boolean r1 = r1.hasRemaining()     // Catch:{ EOFException -> 0x0070 }
            if (r1 == 0) goto L_0x0070
            int r1 = r5.readUnsignedByte()     // Catch:{ EOFException -> 0x0070 }
            com.squareup.haha.perflib.io.HprofBuffer r2 = r5.mInput     // Catch:{ EOFException -> 0x0070 }
            r2.readInt()     // Catch:{ EOFException -> 0x0070 }
            long r2 = r5.readUnsignedInt()     // Catch:{ EOFException -> 0x0070 }
            r4 = 1
            if (r1 == r4) goto L_0x0066
            r4 = 2
            if (r1 == r4) goto L_0x0062
            r4 = 4
            if (r1 == r4) goto L_0x005e
            r4 = 5
            if (r1 == r4) goto L_0x005a
            r4 = 12
            if (r1 == r4) goto L_0x0054
            r4 = 28
            if (r1 == r4) goto L_0x004b
            r5.skipFully(r2)     // Catch:{ EOFException -> 0x0070 }
            goto L_0x001e
        L_0x004b:
            r5.loadHeapDump(r2)     // Catch:{ EOFException -> 0x0070 }
            com.squareup.haha.perflib.Snapshot r1 = r5.mSnapshot     // Catch:{ EOFException -> 0x0070 }
        L_0x0050:
            r1.setToDefaultHeap()     // Catch:{ EOFException -> 0x0070 }
            goto L_0x001e
        L_0x0054:
            r5.loadHeapDump(r2)     // Catch:{ EOFException -> 0x0070 }
            com.squareup.haha.perflib.Snapshot r1 = r5.mSnapshot     // Catch:{ EOFException -> 0x0070 }
            goto L_0x0050
        L_0x005a:
            r5.loadStackTrace()     // Catch:{ EOFException -> 0x0070 }
            goto L_0x001e
        L_0x005e:
            r5.loadStackFrame()     // Catch:{ EOFException -> 0x0070 }
            goto L_0x001e
        L_0x0062:
            r5.loadClass()     // Catch:{ EOFException -> 0x0070 }
            goto L_0x001e
        L_0x0066:
            int r1 = (int) r2     // Catch:{ EOFException -> 0x0070 }
            int r2 = r5.mIdSize     // Catch:{ EOFException -> 0x0070 }
            int r1 = r1 - r2
            r5.loadString(r1)     // Catch:{ EOFException -> 0x0070 }
            goto L_0x001e
        L_0x006e:
            r1 = move-exception
            goto L_0x007b
        L_0x0070:
            com.squareup.haha.perflib.Snapshot r1 = r5.mSnapshot     // Catch:{ Exception -> 0x006e }
            r1.resolveClasses()     // Catch:{ Exception -> 0x006e }
            com.squareup.haha.perflib.Snapshot r1 = r5.mSnapshot     // Catch:{ Exception -> 0x006e }
            r1.resolveReferences()     // Catch:{ Exception -> 0x006e }
            goto L_0x007e
        L_0x007b:
            r1.printStackTrace()
        L_0x007e:
            com.squareup.haha.trove.TLongObjectHashMap<java.lang.String> r1 = r5.mClassNames
            r1.clear()
            com.squareup.haha.trove.TLongObjectHashMap<java.lang.String> r1 = r5.mStrings
            r1.clear()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.haha.perflib.HprofParser.parse():com.squareup.haha.perflib.Snapshot");
    }
}
