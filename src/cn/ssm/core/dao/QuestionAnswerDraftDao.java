package cn.ssm.core.dao;

import cn.ssm.core.bean.QuestionAnswerDraft;

public interface QuestionAnswerDraftDao {
    int deleteByPrimaryKey(Long id);

    int insert(QuestionAnswerDraft record);

    int insertSelective(QuestionAnswerDraft record);

    QuestionAnswerDraft selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(QuestionAnswerDraft record);

    int updateByPrimaryKey(QuestionAnswerDraft record);
}