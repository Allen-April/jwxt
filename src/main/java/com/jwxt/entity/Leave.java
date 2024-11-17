package com.jwxt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * (Leave)实体类
 *
 * @author makejava
 * @since 2024-06-25 09:51:29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Leave {
    

    private Integer leaveId;

    private Integer studentId;

    private Integer classId;

    private String reason;

    private Date startDate;

    private Date endDate;

    private Integer approvalId;

    private String approvalComment;

    private Date approvalDate;

    private Date createdAt;

    private Date updatedAt;

    private String studentName;

    public Integer getLeavesId() {
        return leaveId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public Integer getClassId() {
        return classId;
    }

    public String getReason() {
        return reason;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Integer getApproverId() {
        return approvalId;
    }

    public String getApprovalComment() {
        return approvalComment;
    }

    public Date getApprovalDate() {
        return approvalDate;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public String getStudentName() {
        return studentName;
    }
}

