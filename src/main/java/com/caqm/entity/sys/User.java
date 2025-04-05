package com.caqm.entity.sys;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Data
@Entity
@Table(name = "user")
public class User {
    /**
     * 唯一标识
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    /**
     * 用户名
     */
    @Column
    private String username;

    /**
     * 所属部门
     */
    @Column
    private String deptName;

    /**
     * 邮箱号
     */
    @Column
    private String email;

    /**
     * 状态
     */
    @Column
    private Integer status;

    /**
     * 密码
     */
    @Column
    private String passwd;

    /**
     * 角色
     */
    @Column
    private String roleName;

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