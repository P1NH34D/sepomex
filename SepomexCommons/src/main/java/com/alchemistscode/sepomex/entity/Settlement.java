package com.alchemistscode.sepomex.entity;

import com.alchemistscode.sepomex.entity.catalog.SettlementType;
import com.alchemistscode.sepomex.entity.catalog.Zone;
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
public class Settlement implements Serializable {
  private static final long serialVersionUID = -5188857502894854026L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(length = 7)
  private Integer id;
  @Column(length = 75)
  private String name;
  @Column(length = 5)
  private String zipCode;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "municipality", nullable = false, foreignKey = @ForeignKey(name = "fk_settlement_municipality"))
  private Municipality municipality;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "settlementType", nullable = false, foreignKey = @ForeignKey(name = "fk_settlement_settlement_type"))
  private SettlementType settlementType;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "zone", nullable = false, foreignKey = @ForeignKey(name = "fk_settlement_zone"))
  private Zone zone;

}