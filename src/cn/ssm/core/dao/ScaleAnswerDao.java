package cn.ssm.core.dao;

import cn.ssm.core.bean.ScaleAnswer;

public interface ScaleAnswerDao {
    int deleteByPrimaryKey(Long id);

    int insert(ScaleAnswer record);

    int insertSelective(ScaleAnswer record);

    ScaleAnswer selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ScaleAnswer record);

    int updateByPrimaryKey(ScaleAnswer record);
}