package cn.ssm.core.bean;

import java.io.Serializable;
import java.util.Date;

public class TicketScaleR implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 量表id
     */
    private Long scaleId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 量表券id
     */
    private Long ticketId;

    /**
     * 租户id
     */
    private Long tenantId;

    /**
     * 用户所属外部id
     */
    private Long userSourceId;

    /**
     * 总可使用次数
     */
    private Integer totalNum;

    /**
     * 可适用次数
     */
    private Integer availNum;

    /**
     * 创建时间
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

    public Long getScaleId() {
        return scaleId;
    }

    public void setScaleId(Long scaleId) {
        this.scaleId = scaleId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getUserSourceId() {
        return userSourceId;
    }

    public void setUserSourceId(Long userSourceId) {
        this.userSourceId = userSourceId;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getAvailNum() {
        return availNum;
    }

    public void setAvailNum(Integer availNum) {
        this.availNum = availNum;
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
        sb.append(", userId=").append(userId);
        sb.append(", ticketId=").append(ticketId);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", userSourceId=").append(userSourceId);
        sb.append(", totalNum=").append(totalNum);
        sb.append(", availNum=").append(availNum);
        sb.append(", created=").append(created);
        sb.append(", modified=").append(modified);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}