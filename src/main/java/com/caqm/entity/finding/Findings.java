package com.caqm.entity.finding;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Data
@Entity
@Table(name = "findings")
public class Findings {
    /**
     * 唯一标识
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    /**
     * 来源审计
     */
    @Column
    private String auditName;

    /**
     * 状态：1-开启，0-关闭
     */
    @Column
    private Integer status;

    /**
     * 流程
     */
    @Column
    private String processName;

    /**
     * 地点
     */
    @Column
    private String airportName;

    /**
     * 流程负责人
     */
    @Column
    private String userName;

    /**
     * 目标解决日期
     */
    @Column
    private LocalDateTime targetCloseTime;

    /**
     * 关闭人
     */
    @Column
    private String closer;

    /**
     * 不符合部门
     */
    @Column
    private String detpName;

    /**
     * 不符合类型
     */
    @Column
    private String findingTypeName;

    /**
     * 详细内容
     */
    @Column
    private String evaluateResult;

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