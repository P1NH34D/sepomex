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
@Table(name = "c_state", schema = "sepomex")
public class State implements Serializable, Reportable {
  private static final long serialVersionUID = 8939247060408518040L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @ColumnTitle("State id")
  private Integer id;
  @Column(length = 35)
  @ColumnTitle("State name")
  private String name;
  @Column(name = "state_key", length = 6)
  @ColumnTitle("State key")
  private String key;

  public State(final Integer id) {
    this.id = id;
  }
}
