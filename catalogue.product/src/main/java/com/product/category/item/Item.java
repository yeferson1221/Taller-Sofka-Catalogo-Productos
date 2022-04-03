package com.product.category.item;


	import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.product.category.category.download.Download;
import com.product.category.subcategory.SubCategory;
import com.fasterxml.jackson.annotation.JsonBackReference;
	

	import javax.persistence.CascadeType;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.FetchType;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.OneToMany;
	import javax.persistence.ManyToOne;
	import javax.persistence.Table;
	import java.io.Serializable;
	import java.time.Instant;
	import java.util.ArrayList;
	import java.util.List;

	
	@Entity
	@Table(name = "item")
	public class Item implements Serializable{
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
	    @Column(name = "itm_id", nullable = false)
	    private Integer id;

	    @ManyToOne(fetch = FetchType.LAZY, targetEntity = SubCategory.class, optional = false)
	    @JoinColumn(name = "itm_subcategory_id", nullable = false)
	    @JsonBackReference
	    private SubCategory subcategory;

	    @Column(name = "itm_name", nullable = false, length = 80)
	    private String itmName;

	    @Column(name = "itm_created_at", nullable = false)
	    private Instant itmCreatedAt;

	    @OneToMany(
	            fetch = FetchType.EAGER,
	            targetEntity = Download.class,
	            cascade = CascadeType.REMOVE,
	            mappedBy = "item"
	    )
	    @JsonManagedReference
	    private List<Download> downloads = new ArrayList<>();


	
}
