package cn.ssm.core.dao;

import cn.ssm.core.bean.TicketScaleR;

public interface TicketScaleRDao {
    int deleteByPrimaryKey(Long id);

    int insert(TicketScaleR record);

    int insertSelective(TicketScaleR record);

    TicketScaleR selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TicketScaleR record);

    int updateByPrimaryKey(TicketScaleR record);
}