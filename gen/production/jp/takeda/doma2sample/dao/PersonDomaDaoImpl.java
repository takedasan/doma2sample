package jp.takeda.doma2sample.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "2.19.3" }, date = "2018-11-28T22:47:51.441+0900")
public class PersonDomaDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements jp.takeda.doma2sample.dao.PersonDomaDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.19.3");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.takeda.doma2sample.dao.PersonDomaDao.class, "selectAll");

    /**
     * @param config the config
     */
    public PersonDomaDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public java.util.List<jp.takeda.doma2sample.model.PersonDomaEntity> selectAll() {
        entering("jp.takeda.doma2sample.dao.PersonDomaDaoImpl", "selectAll");
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/jp/takeda/doma2sample/dao/PersonDomaDao/selectAll.sql");
            __query.setEntityType(jp.takeda.doma2sample.model._PersonDomaEntity.getSingletonInternal());
            __query.setCallerClassName("jp.takeda.doma2sample.dao.PersonDomaDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<jp.takeda.doma2sample.model.PersonDomaEntity>> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<jp.takeda.doma2sample.model.PersonDomaEntity>(jp.takeda.doma2sample.model._PersonDomaEntity.getSingletonInternal()));
            java.util.List<jp.takeda.doma2sample.model.PersonDomaEntity> __result = __command.execute();
            __query.complete();
            exiting("jp.takeda.doma2sample.dao.PersonDomaDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.takeda.doma2sample.dao.PersonDomaDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

}
