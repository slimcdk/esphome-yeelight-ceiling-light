package androidx.constraintlayout.solver;

import java.util.Arrays;

public class SolverVariable {
    private static final boolean INTERNAL_DEBUG = false;
    static final int MAX_STRENGTH = 7;
    public static final int STRENGTH_BARRIER = 7;
    public static final int STRENGTH_EQUALITY = 5;
    public static final int STRENGTH_FIXED = 6;
    public static final int STRENGTH_HIGH = 3;
    public static final int STRENGTH_HIGHEST = 4;
    public static final int STRENGTH_LOW = 1;
    public static final int STRENGTH_MEDIUM = 2;
    public static final int STRENGTH_NONE = 0;
    private static int uniqueConstantId = 1;
    private static int uniqueErrorId = 1;
    private static int uniqueId = 1;
    private static int uniqueSlackId = 1;
    private static int uniqueUnrestrictedId = 1;
    public float computedValue;
    int definitionId = -1;

    /* renamed from: id */
    public int f12id = -1;
    ArrayRow[] mClientEquations = new ArrayRow[8];
    int mClientEquationsCount = 0;
    private String mName;
    Type mType;
    public int strength = 0;
    float[] strengthVector = new float[7];
    public int usageInRowCount = 0;

    /* renamed from: androidx.constraintlayout.solver.SolverVariable$1 */
    static /* synthetic */ class C01351 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.solver.SolverVariable$Type[] r0 = androidx.constraintlayout.solver.SolverVariable.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type = r0
                androidx.constraintlayout.solver.SolverVariable$Type r1 = androidx.constraintlayout.solver.SolverVariable.Type.UNRESTRICTED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.solver.SolverVariable$Type r1 = androidx.constraintlayout.solver.SolverVariable.Type.CONSTANT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.solver.SolverVariable$Type r1 = androidx.constraintlayout.solver.SolverVariable.Type.SLACK     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.solver.SolverVariable$Type r1 = androidx.constraintlayout.solver.SolverVariable.Type.ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.solver.SolverVariable$Type r1 = androidx.constraintlayout.solver.SolverVariable.Type.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.SolverVariable.C01351.<clinit>():void");
        }
    }

    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public SolverVariable(Type type, String str) {
        this.mType = type;
    }

    public SolverVariable(String str, Type type) {
        this.mName = str;
        this.mType = type;
    }

    private static String getUniqueName(Type type, String str) {
        StringBuilder sb;
        int i;
        if (str != null) {
            sb = new StringBuilder();
            sb.append(str);
            i = uniqueErrorId;
        } else {
            int i2 = C01351.$SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type[type.ordinal()];
            if (i2 == 1) {
                sb = new StringBuilder();
                sb.append("U");
                i = uniqueUnrestrictedId + 1;
                uniqueUnrestrictedId = i;
            } else if (i2 == 2) {
                sb = new StringBuilder();
                sb.append("C");
                i = uniqueConstantId + 1;
                uniqueConstantId = i;
            } else if (i2 == 3) {
                sb = new StringBuilder();
                sb.append("S");
                i = uniqueSlackId + 1;
                uniqueSlackId = i;
            } else if (i2 == 4) {
                sb = new StringBuilder();
                sb.append("e");
                i = uniqueErrorId + 1;
                uniqueErrorId = i;
            } else if (i2 == 5) {
                sb = new StringBuilder();
                sb.append("V");
                i = uniqueId + 1;
                uniqueId = i;
            } else {
                throw new AssertionError(type.name());
            }
        }
        sb.append(i);
        return sb.toString();
    }

    static void increaseErrorId() {
        uniqueErrorId++;
    }

    public final void addToRow(ArrayRow arrayRow) {
        int i = 0;
        while (true) {
            int i2 = this.mClientEquationsCount;
            if (i >= i2) {
                ArrayRow[] arrayRowArr = this.mClientEquations;
                if (i2 >= arrayRowArr.length) {
                    this.mClientEquations = (ArrayRow[]) Arrays.copyOf(arrayRowArr, arrayRowArr.length * 2);
                }
                ArrayRow[] arrayRowArr2 = this.mClientEquations;
                int i3 = this.mClientEquationsCount;
                arrayRowArr2[i3] = arrayRow;
                this.mClientEquationsCount = i3 + 1;
                return;
            } else if (this.mClientEquations[i] != arrayRow) {
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void clearStrengths() {
        for (int i = 0; i < 7; i++) {
            this.strengthVector[i] = 0.0f;
        }
    }

    public String getName() {
        return this.mName;
    }

    public final void removeFromRow(ArrayRow arrayRow) {
        int i = this.mClientEquationsCount;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.mClientEquations[i2] == arrayRow) {
                for (int i3 = 0; i3 < (i - i2) - 1; i3++) {
                    ArrayRow[] arrayRowArr = this.mClientEquations;
                    int i4 = i2 + i3;
                    arrayRowArr[i4] = arrayRowArr[i4 + 1];
                }
                this.mClientEquationsCount--;
                return;
            }
        }
    }

    public void reset() {
        this.mName = null;
        this.mType = Type.UNKNOWN;
        this.strength = 0;
        this.f12id = -1;
        this.definitionId = -1;
        this.computedValue = 0.0f;
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setType(Type type, String str) {
        this.mType = type;
    }

    /* access modifiers changed from: package-private */
    public String strengthsToString() {
        StringBuilder sb;
        String str;
        String str2 = this + "[";
        boolean z = false;
        boolean z2 = true;
        for (int i = 0; i < this.strengthVector.length; i++) {
            String str3 = str2 + this.strengthVector[i];
            float[] fArr = this.strengthVector;
            if (fArr[i] > 0.0f) {
                z = false;
            } else if (fArr[i] < 0.0f) {
                z = true;
            }
            if (this.strengthVector[i] != 0.0f) {
                z2 = false;
            }
            if (i < this.strengthVector.length - 1) {
                sb = new StringBuilder();
                sb.append(str3);
                str = ", ";
            } else {
                sb = new StringBuilder();
                sb.append(str3);
                str = "] ";
            }
            sb.append(str);
            str2 = sb.toString();
        }
        if (z) {
            str2 = str2 + " (-)";
        }
        if (!z2) {
            return str2;
        }
        return str2 + " (*)";
    }

    public String toString() {
        return "" + this.mName;
    }

    public final void updateReferencesWithNewDefinition(ArrayRow arrayRow) {
        int i = this.mClientEquationsCount;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayRow[] arrayRowArr = this.mClientEquations;
            arrayRowArr[i2].variables.updateFromRow(arrayRowArr[i2], arrayRow, false);
        }
        this.mClientEquationsCount = 0;
    }
}
