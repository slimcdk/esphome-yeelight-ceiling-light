package org.seamless.util.dbunit;

import java.util.ArrayList;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.dbunit.database.DatabaseConfig;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.ReplacementDataSet;
import org.dbunit.operation.DatabaseOperation;

public abstract class DBUnitOperations extends ArrayList<C10248a> {
    private static final Logger log = Logger.getLogger(DBUnitOperations.class.getName());

    /* renamed from: org.seamless.util.dbunit.DBUnitOperations$a */
    public static abstract class C10248a {

        /* renamed from: a */
        ReplacementDataSet f19039a;

        /* renamed from: b */
        DatabaseOperation f19040b;

        /* renamed from: a */
        public void mo41579a(IDatabaseConnection iDatabaseConnection) {
            try {
                this.f19040b.execute(iDatabaseConnection, this.f19039a);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void disableReferentialIntegrity(IDatabaseConnection iDatabaseConnection);

    /* access modifiers changed from: protected */
    public void editConfig(DatabaseConfig databaseConfig) {
    }

    /* access modifiers changed from: protected */
    public abstract void enableReferentialIntegrity(IDatabaseConnection iDatabaseConnection);

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e A[SYNTHETIC, Splitter:B:18:0x005e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void execute() {
        /*
            r6 = this;
            java.lang.String r0 = "Failed to close connection after DBUnit operation: "
            java.util.logging.Logger r1 = log
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Executing DBUnit operations: "
            r2.append(r3)
            int r3 = r6.size()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.info(r2)
            org.dbunit.database.IDatabaseConnection r1 = r6.getConnection()     // Catch:{ all -> 0x005a }
            r6.disableReferentialIntegrity(r1)     // Catch:{ all -> 0x0058 }
            java.util.Iterator r2 = r6.iterator()     // Catch:{ all -> 0x0058 }
        L_0x0027:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0058 }
            if (r3 == 0) goto L_0x0037
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0058 }
            org.seamless.util.dbunit.DBUnitOperations$a r3 = (org.seamless.util.dbunit.DBUnitOperations.C10248a) r3     // Catch:{ all -> 0x0058 }
            r3.mo41579a(r1)     // Catch:{ all -> 0x0058 }
            goto L_0x0027
        L_0x0037:
            r6.enableReferentialIntegrity(r1)     // Catch:{ all -> 0x0058 }
            if (r1 == 0) goto L_0x0057
            r1.close()     // Catch:{ Exception -> 0x0040 }
            goto L_0x0057
        L_0x0040:
            r1 = move-exception
            java.util.logging.Logger r2 = log
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = r4.toString()
            r2.log(r3, r0, r1)
        L_0x0057:
            return
        L_0x0058:
            r2 = move-exception
            goto L_0x005c
        L_0x005a:
            r2 = move-exception
            r1 = 0
        L_0x005c:
            if (r1 == 0) goto L_0x0079
            r1.close()     // Catch:{ Exception -> 0x0062 }
            goto L_0x0079
        L_0x0062:
            r1 = move-exception
            java.util.logging.Logger r3 = log
            java.util.logging.Level r4 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = r5.toString()
            r3.log(r4, r0, r1)
        L_0x0079:
            goto L_0x007b
        L_0x007a:
            throw r2
        L_0x007b:
            goto L_0x007a
        */
        throw new UnsupportedOperationException("Method not decompiled: org.seamless.util.dbunit.DBUnitOperations.execute():void");
    }

    /* access modifiers changed from: protected */
    public IDatabaseConnection getConnection() {
        try {
            DatabaseConnection databaseConnection = new DatabaseConnection(getDataSource().getConnection());
            editConfig(databaseConnection.getConfig());
            return databaseConnection;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public abstract DataSource getDataSource();
}
