package cn.ssm.core.bean;

import java.io.Serializable;
import java.util.Date;

public class ScaleAnswer implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 答卷id
     */
    private Long scaleAnswerId;

    /**
     * 量表id
     */
    private Long scaleId;

    /**
     * 量表券id
     */
    private Long ticketId;

    /**
     * 用户id
     */
    private Long userSourceId;

    /**
     * 第几次使用
     */
    private Integer ticketNum;

    /**
     *  创建时间
     */
    private Date created;

    /**
     * 修改时间
     */
    private Date modified;

    /**
     * 0-删除，1-使用
     */
    private Integer status;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getScaleAnswerId() {
        return scaleAnswerId;
    }

    public void setScaleAnswerId(Long scaleAnswerId) {
        this.scaleAnswerId = scaleAnswerId;
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

    public Long getUserSourceId() {
        return userSourceId;
    }

    public void setUserSourceId(Long userSourceId) {
        this.userSourceId = userSourceId;
    }

    public Integer getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(Integer ticketNum) {
        this.ticketNum = ticketNum;
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
        sb.append(", scaleAnswerId=").append(scaleAnswerId);
        sb.append(", scaleId=").append(scaleId);
        sb.append(", ticketId=").append(ticketId);
        sb.append(", userSourceId=").append(userSourceId);
        sb.append(", ticketNum=").append(ticketNum);
        sb.append(", created=").append(created);
        sb.append(", modified=").append(modified);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}