package cn.ssm.core.bean;

import java.io.Serializable;
import java.util.Date;

public class QuestionAnswer implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 量表id
     */
    private Long scaleId;

    /**
     * 量表券id
     */
    private Long ticketId;

    /**
     * 问题id
     */
    private Long questionId;

    /**
     * 答卷id
     */
    private Long scaleAnswerId;

    /**
     * 题目内容(包含题和选项）
     */
    private String questionContent;

    /**
     * 题目序号
     */
    private Integer idx;

    /**
     * 答案内容
     */
    private String content;

    /**
     * 选项ID
     */
    private Long chosen;

    /**
     * 总分数
     */
    private Integer score;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 修改时间
     */
    private Date modified;

    /**
     * 1-使用，0-删除
     */
    private Integer status;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getScaleId() {
        return scaleId;
    }

    public void setScaleId(Long scaleId) {
        this.scaleId = scaleId;
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public Long getScaleAnswerId() {
        return scaleAnswerId;
    }

    public void setScaleAnswerId(Long scaleAnswerId) {
        this.scaleAnswerId = scaleAnswerId;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent == null ? null : questionContent.trim();
    }

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Long getChosen() {
        return chosen;
    }

    public void setChosen(Long chosen) {
        this.chosen = chosen;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", scaleId=").append(scaleId);
        sb.append(", ticketId=").append(ticketId);
        sb.append(", questionId=").append(questionId);
        sb.append(", scaleAnswerId=").append(scaleAnswerId);
        sb.append(", questionContent=").append(questionContent);
        sb.append(", idx=").append(idx);
        sb.append(", content=").append(content);
        sb.append(", chosen=").append(chosen);
        sb.append(", score=").append(score);
        sb.append(", created=").append(created);
        sb.append(", modified=").append(modified);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}