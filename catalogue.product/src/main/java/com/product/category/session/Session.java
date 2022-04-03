package com.product.category.session;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.product.category.user.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.Instant;


@Entity
@Table(name = "session")
public class Session implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ses_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = User.class, optional = false)
    @JoinColumn(name = "ses_user_id", nullable = false)
    @JsonBackReference
    private User user;

    @Column(name = "ses_token", nullable = false, length = 32)
    private String Token;

    @Column(name = "ses_created_at", nullable = false)
    private Instant sesCreatedAt;
}

