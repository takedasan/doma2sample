package jp.takeda.doma2sample.dao;

import jp.takeda.doma2sample.model.PersonDomaEntity;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;

import java.util.List;

@Dao
public interface PersonDomaDao {

    @Select
    List<PersonDomaEntity> selectAll();
}
