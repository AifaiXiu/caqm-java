package com.caqm.entity.checklist;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Data
@Entity
@Table(name = "checklist_items")
public class ChecklistItems {
    /**
     * 唯一标识
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    /**
     * 名称
     */
    @Column
    private String name;

    /**
     * 内容
     */
    @Column
    private String details;

    /**
     * 参考文件，多个文件名用逗号分隔
     */
    @Column
    private String fileNames;

    /**
     * 备注
     */
    @Column
    private String remark;

    /**
     * 指南
     */
    @Column
    private String guidance;

    /**
     * 措施
     */
    @Column
    private String actions;

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