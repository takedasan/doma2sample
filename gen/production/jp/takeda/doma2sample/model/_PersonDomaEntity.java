package jp.takeda.doma2sample.model;

/** */
@javax.annotation.Generated(value = { "Doma", "2.19.3" }, date = "2018-11-28T22:47:51.316+0900")
public final class _PersonDomaEntity extends org.seasar.doma.jdbc.entity.AbstractEntityType<jp.takeda.doma2sample.model.PersonDomaEntity> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.19.3");
    }

    private static final _PersonDomaEntity __singleton = new _PersonDomaEntity();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator();

    /** the id */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, jp.takeda.doma2sample.model.PersonDomaEntity, java.lang.Integer, Object> $id = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<>(jp.takeda.doma2sample.model.PersonDomaEntity.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "id", "", __namingType, false, __idGenerator);

    /** the name */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, jp.takeda.doma2sample.model.PersonDomaEntity, java.lang.String, Object> $name = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(jp.takeda.doma2sample.model.PersonDomaEntity.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "name", "", __namingType, true, true, false);

    /** the age */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, jp.takeda.doma2sample.model.PersonDomaEntity, java.lang.Integer, Object> $age = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(jp.takeda.doma2sample.model.PersonDomaEntity.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "age", "", __namingType, true, true, false);

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<jp.takeda.doma2sample.model.PersonDomaEntity>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.takeda.doma2sample.model.PersonDomaEntity, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.takeda.doma2sample.model.PersonDomaEntity, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<jp.takeda.doma2sample.model.PersonDomaEntity, ?>> __entityPropertyTypeMap;

    private _PersonDomaEntity() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "PersonDomaEntity";
        __catalogName = "";
        __schemaName = "";
        __tableName = "";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.takeda.doma2sample.model.PersonDomaEntity, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.takeda.doma2sample.model.PersonDomaEntity, ?>> __list = new java.util.ArrayList<>(3);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<jp.takeda.doma2sample.model.PersonDomaEntity, ?>> __map = new java.util.HashMap<>(3);
        __idList.add($id);
        __list.add($id);
        __map.put("id", $id);
        __list.add($name);
        __map.put("name", $name);
        __list.add($age);
        __map.put("age", $age);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return getTableName(org.seasar.doma.jdbc.Naming.DEFAULT::apply);
    }

    @Override
    public String getTableName(java.util.function.BiFunction<org.seasar.doma.jdbc.entity.NamingType, String, String> namingFunction) {
        if (__tableName.isEmpty()) {
            return namingFunction.apply(__namingType, __name);
        }
        return __tableName;
    }

    @Override
    public boolean isQuoteRequired() {
        return __isQuoteRequired;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preInsert(jp.takeda.doma2sample.model.PersonDomaEntity entity, org.seasar.doma.jdbc.entity.PreInsertContext<jp.takeda.doma2sample.model.PersonDomaEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(jp.takeda.doma2sample.model.PersonDomaEntity entity, org.seasar.doma.jdbc.entity.PreUpdateContext<jp.takeda.doma2sample.model.PersonDomaEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(jp.takeda.doma2sample.model.PersonDomaEntity entity, org.seasar.doma.jdbc.entity.PreDeleteContext<jp.takeda.doma2sample.model.PersonDomaEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(jp.takeda.doma2sample.model.PersonDomaEntity entity, org.seasar.doma.jdbc.entity.PostInsertContext<jp.takeda.doma2sample.model.PersonDomaEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(jp.takeda.doma2sample.model.PersonDomaEntity entity, org.seasar.doma.jdbc.entity.PostUpdateContext<jp.takeda.doma2sample.model.PersonDomaEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(jp.takeda.doma2sample.model.PersonDomaEntity entity, org.seasar.doma.jdbc.entity.PostDeleteContext<jp.takeda.doma2sample.model.PersonDomaEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.takeda.doma2sample.model.PersonDomaEntity, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<jp.takeda.doma2sample.model.PersonDomaEntity, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.takeda.doma2sample.model.PersonDomaEntity, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, jp.takeda.doma2sample.model.PersonDomaEntity, ?, ?> getGeneratedIdPropertyType() {
        return $id;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, jp.takeda.doma2sample.model.PersonDomaEntity, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<java.lang.Object, jp.takeda.doma2sample.model.PersonDomaEntity, ?, ?> getTenantIdPropertyType() {
        return null;
    }

    @Override
    public jp.takeda.doma2sample.model.PersonDomaEntity newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<jp.takeda.doma2sample.model.PersonDomaEntity, ?>> __args) {
        jp.takeda.doma2sample.model.PersonDomaEntity entity = new jp.takeda.doma2sample.model.PersonDomaEntity();
        if (__args.get("id") != null) __args.get("id").save(entity);
        if (__args.get("name") != null) __args.get("name").save(entity);
        if (__args.get("age") != null) __args.get("age").save(entity);
        return entity;
    }

    @Override
    public Class<jp.takeda.doma2sample.model.PersonDomaEntity> getEntityClass() {
        return jp.takeda.doma2sample.model.PersonDomaEntity.class;
    }

    @Override
    public jp.takeda.doma2sample.model.PersonDomaEntity getOriginalStates(jp.takeda.doma2sample.model.PersonDomaEntity __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(jp.takeda.doma2sample.model.PersonDomaEntity __entity) {
    }

    /**
     * @return the singleton
     */
    public static _PersonDomaEntity getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _PersonDomaEntity newInstance() {
        return new _PersonDomaEntity();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<jp.takeda.doma2sample.model.PersonDomaEntity> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
