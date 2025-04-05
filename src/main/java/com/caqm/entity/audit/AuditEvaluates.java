package com.caqm.entity.audit;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Data
@Entity
@Table(name = "audit_evaluates")
public class AuditEvaluates {
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
    private String auditName;

    /**
     * 检查单名
     */
    @Column
    private String checklistName;

    /**
     * 检查项名称
     */
    @Column
    private String checklistItemName;

    /**
     * 检查项内容
     */
    @Column
    private String checklistContent;

    /**
     * 审核员
     */
    @Column
    private String auditor;

    /**
     * 不符合项目
     */
    @Column
    private String findingName;

    /**
     * 状态：0-未完成，1-符合，2-文文不符，3-文实不符，4-不适用
     */
    @Column
    private Integer status;

    /**
     * 审核结论
     */
    @Column
    private String summary;

    /**
     * 参考文档
     */
    @Column
    private String fileNames;

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