package cn.ssm.core.dao;

import cn.ssm.core.bean.QuestionAnswer;

public interface QuestionAnswerDao {
    int deleteByPrimaryKey(Long id);

    int insert(QuestionAnswer record);

    int insertSelective(QuestionAnswer record);

    QuestionAnswer selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(QuestionAnswer record);

    int updateByPrimaryKey(QuestionAnswer record);
}