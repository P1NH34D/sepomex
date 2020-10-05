package com.alchemistscode.sepomex.entity.catalog;

import com.alchemistscode.commons.tools.contract.Reportable;
import com.alchemistscode.commons.tools.label.ColumnTitle;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name = "c_settlement_type", schema = "sepomex")
public class SettlementType implements Serializable, Reportable {
  private static final long serialVersionUID = -5188857502894854026L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(length = 2)
  @ColumnTitle("Settlement type id")
  private Integer id;
  @Column(length = 35)
  @ColumnTitle("Settlement type name")
  private String name;

  public SettlementType(final Integer id) {
    this.id = id;
  }
}
