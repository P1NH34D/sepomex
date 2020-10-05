package com.alchemistscode.sepomex.entity.catalog;

import com.alchemistscode.commons.tools.contract.Reportable;
import com.alchemistscode.commons.tools.label.ColumnTitle;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "c_zone", schema = "sepomex")
public class Zone implements Serializable, Reportable {
  private static final long serialVersionUID = 2754307044601474420L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @ColumnTitle("Zone id")
  @NonNull
  private Integer id;

  @Column(length = 35)
  @ColumnTitle("Zone name")
  private String name;
}
