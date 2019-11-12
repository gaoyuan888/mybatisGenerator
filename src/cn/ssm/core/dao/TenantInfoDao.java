package cn.ssm.core.dao;

import cn.ssm.core.bean.TenantInfo;

public interface TenantInfoDao {
    int deleteByPrimaryKey(Long id);

    int insert(TenantInfo record);

    int insertSelective(TenantInfo record);

    TenantInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TenantInfo record);

    int updateByPrimaryKey(TenantInfo record);
}