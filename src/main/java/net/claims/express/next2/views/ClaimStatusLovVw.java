package net.claims.express.next2.views;


import lombok.Data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Data
@NamedQueries({ @NamedQuery(name = "ClaimStatusLovVw.findAll", query = "select o from ClaimStatusLovVw o") })
@Table(name = "CLAIM_STATUS_LOV_VW")
public class ClaimStatusLovVw implements Serializable {
    private static final long serialVersionUID = 1989208959347721180L;
    @Id
    @Column(nullable = false, length = 128)
    private String code;
    @Column(nullable = false, length = 128)
    private String description;
}
