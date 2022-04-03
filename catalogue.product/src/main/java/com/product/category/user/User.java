package com.product.category.user;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.product.category.category.download.Download;
import com.product.category.session.Session;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "user")
public class User implements Serializable {
	/**
	 * tenemos los campos
	 *
	 * @author [Yeferson Valencia, alejandro.yandd@gmail.com.
	 *
	 * @since [1.0.0]
	 *
	 */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "use_id", nullable = false)
    private Integer id;

    @Column(name = "use_username", nullable = false, length = 80)
    private String UserName;

    @Column(name = "use_password", nullable = false, length = 32)
    private String Password;

    @Column(name = "use_created_at", nullable = false)
    private Instant useCreatedAt;

    @Column(name = "use_updated_at")
    private Instant useUpdatedAt;

    @OneToMany(
            fetch = FetchType.EAGER,
            targetEntity = Session.class,
            cascade = CascadeType.REMOVE,
            mappedBy = "user"
    )
    @JsonManagedReference
    private List<Session> sessions = new ArrayList<>();


    @OneToMany(
            fetch = FetchType.EAGER,
            targetEntity = Download.class,
            cascade = CascadeType.REMOVE,
            mappedBy = "user"
    )
    @JsonManagedReference
    private List<Download> downloads = new ArrayList<>();

}
