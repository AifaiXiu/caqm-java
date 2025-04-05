package com.caqm.entity.finding;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Data
@Entity
@Table(name = "corrective_measures")
public class CorrectiveMeasures {
    /**
     * 唯一标识
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    /**
     * 不符合项名称
     */
    @Column
    private String findingName;

    /**
     * 责任人
     */
    @Column
    private String dutyMan;

    /**
     * 完成人
     */
    @Column
    private String finisher;

    /**
     * 目标日期
     */
    @Column
    private LocalDateTime targetDate;

    /**
     * 完成日期
     */
    @Column
    private LocalDateTime finishDate;

    /**
     * 详细方法
     */
    @Column
    private String details;

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