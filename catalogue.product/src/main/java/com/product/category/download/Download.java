package com.product.category.category.download;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.product.category.item.Item;
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
@Table(name = "download")
public class Download implements Serializable {
	/**
	 * tenemos campos
	 *
	 * @author [Yeferson Valencia, alejandro.yandd@gmail.com.
	 *
	 * @since [1.0.0]
	 *
	 */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dwn_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = User.class, optional = false)
    @JoinColumn(name = "dwn_user_id", nullable = false)
    @JsonBackReference
    private User user;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Item.class, optional = false)
    @JoinColumn(name = "dwn_item_id", nullable = false)
    @JsonBackReference
    private Item item;

    @Column(name = "dwn_created_at", nullable = false)
    private Instant dwnCreatedAt;


}
