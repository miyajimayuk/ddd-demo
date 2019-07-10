package app.infrastructure.dao;

import app.infrastructure.entity.EventEntity;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

@Dao
@ConfigAutowireable
public interface EventEntityDao {
    @Select
    EventEntity selectById(Long id);
}
