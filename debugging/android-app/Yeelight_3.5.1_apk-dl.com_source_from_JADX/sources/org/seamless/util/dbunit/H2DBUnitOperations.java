package org.seamless.util.dbunit;

import org.dbunit.database.DatabaseConfig;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.datatype.DefaultDataTypeFactory;

public abstract class H2DBUnitOperations extends DBUnitOperations {

    /* renamed from: org.seamless.util.dbunit.H2DBUnitOperations$a */
    class C10249a extends DefaultDataTypeFactory {
        C10249a(H2DBUnitOperations h2DBUnitOperations) {
        }
    }

    /* access modifiers changed from: protected */
    public void disableReferentialIntegrity(IDatabaseConnection iDatabaseConnection) {
        try {
            iDatabaseConnection.getConnection().prepareStatement("set referential_integrity FALSE").execute();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    public void editConfig(DatabaseConfig databaseConfig) {
        super.editConfig(databaseConfig);
        databaseConfig.setProperty("http://www.dbunit.org/properties/datatypeFactory", new C10249a(this));
    }

    /* access modifiers changed from: protected */
    public void enableReferentialIntegrity(IDatabaseConnection iDatabaseConnection) {
        try {
            iDatabaseConnection.getConnection().prepareStatement("set referential_integrity TRUE").execute();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
