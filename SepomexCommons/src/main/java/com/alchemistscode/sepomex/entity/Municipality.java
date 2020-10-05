package com.alchemistscode.sepomex.entity;

import com.alchemistscode.commons.tools.contract.Reportable;
import com.alchemistscode.commons.tools.label.ColumnTitle;
import com.alchemistscode.sepomex.entity.catalog.State;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(schema = "sepomex")
public class Municipality implements Serializable, Reportable {
  private static final long serialVersionUID = -5188857502894854026L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(length = 5)
  @ColumnTitle("Municipality Id")
  private Integer id;
  @Column(length = 75)
  @ColumnTitle("Municipality name")
  private String name;

  @ManyToOne(fetch = FetchType.EAGER, optional = false)
  @JoinColumn(name = "state", nullable = false, foreignKey = @ForeignKey(name = "fk_municipality_state"))
  @ColumnTitle("State")
  private State state;

  public Municipality(final Integer id) {
    this.id = id;
  }

  public Municipality(final String name, final Integer state) {
    this.name = name;
    this.state = new State(state);
  }
}
