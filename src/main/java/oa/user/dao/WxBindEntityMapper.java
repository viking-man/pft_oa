package oa.user.dao;

import oa.user.entity.WxBindEntity;
import org.springframework.stereotype.Component;

@Component
public interface WxBindEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WxBindEntity record);

    int insertSelective(WxBindEntity record);

    WxBindEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WxBindEntity record);

    int updateByPrimaryKey(WxBindEntity record);
}