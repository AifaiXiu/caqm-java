package com.caqm.entity.finding;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Data
@Entity
@Table(name = "risk_analyze_evaluates")
public class RiskAnalyzeEvaluates {
    /**
     * 唯一标识
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    /**
     * 来源
     */
    @Column
    private String findingName;

    /**
     * 根源分析
     */
    @Column
    private String rootName;

    /**
     * 部门
     */
    @Column
    private String riskRelatedDeptName;

    /**
     * 责任人
     */
    @Column
    private String dutyMan;

    /**
     * 可能性
     */
    @Column
    private Integer possibility;

    /**
     * 严重性
     */
    @Column
    private Integer severity;

    /**
     * 风险
     */
    @Column
    private Integer riskValue;

    /**
     * 是否是安全事件
     */
    @Column
    private Integer isSecure;

    /**
     * 事件描述
     */
    @Column
    private String eventDiscribe;

    /**
     * 实施日期
     */
    @Column
    private LocalDateTime excuteDate;

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