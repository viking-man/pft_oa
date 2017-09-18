package oa.user.user.dao;

import oa.user.user.entity.WxBindEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface WxBindDao {
    int deleteByPrimaryKey(Long id);

    int deleteByUseridAndWxuserid(@Param("userid") Long userid, @Param("wxuserid") String wxuserid);

    int insert(WxBindEntity record);

    int insertSelective(WxBindEntity record);

    WxBindEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WxBindEntity record);

    int updateByPrimaryKey(WxBindEntity record);
}