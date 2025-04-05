package com.caqm.entity.audit;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Data
@Entity
@Table(name = "audits")
public class Audits {
    /**
     * 唯一标识
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    /**
     * 审计名
     */
    @Column
    private String name;

    /**
     * 受审部门
     */
    @Column
    private String deptName;

    /**
     * 计划开始日期
     */
    @Column
    private LocalDateTime plannedStartDate;

    /**
     * 计划结束日期
     */
    @Column
    private LocalDateTime plannedEndDate;

    /**
     * 实际开始日期
     */
    @Column
    private LocalDateTime realStartDate;

    /**
     * 实际结束日期
     */
    @Column
    private LocalDateTime realEndDate;

    /**
     * 地点
     */
    @Column
    private String aiportName;

    /**
     * 流程
     */
    @Column
    private String processName;

    /**
     * 主审计员
     */
    @Column
    private String mainAuditor;

    /**
     * 其他审计员
     */
    @Column
    private String otherAuditors;

    /**
     * 审计方法
     */
    @Column
    private String methodName;

    /**
     * 状态，0：计划，1：执行，2：取消，3：待关闭，4：已关闭
     */
    @Column
    private Integer status;

    /**
     * 关闭人
     */
    @Column
    private String closeUser;

    /**
     * 备注
     */
    @Column
    private String remark;

    /**
     * 检查单
     */
    @Column
    private String checklistNames;

    /**
     * 不符合项
     */
    @Column
    private String findingNames;

    /**
     * 审计总结
     */
    @Column
    private String summary;

    /**
     * 创建时间
     */
    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    /**
     * 更新时间
     */
    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}