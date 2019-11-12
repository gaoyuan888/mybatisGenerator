package cn.ssm.core.dao;

import cn.ssm.core.bean.TicketInfo;

public interface TicketInfoDao {
    int deleteByPrimaryKey(Long id);

    int insert(TicketInfo record);

    int insertSelective(TicketInfo record);

    TicketInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TicketInfo record);

    int updateByPrimaryKey(TicketInfo record);
}