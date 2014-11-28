/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.ql.plan.api;



public enum OperatorType implements org.apache.thrift.TEnum {
  JOIN(0),
  MAPJOIN(1),
  EXTRACT(2),
  FILTER(3),
  FORWARD(4),
  GROUPBY(5),
  LIMIT(6),
  SCRIPT(7),
  SELECT(8),
  TABLESCAN(9),
  FILESINK(10),
  REDUCESINK(11),
  UNION(12),
  UDTF(13),
  LATERALVIEWJOIN(14),
  LATERALVIEWFORWARD(15),
  HASHTABLESINK(16),
  HASHTABLEDUMMY(17),
  PTF(18),
  MUX(19),
  DEMUX(20),


  PROJECT(21),
  COALESCE(22),
  CLOSEST(23),
  PAIRCLOSEST(24),
  EXCLUSIVEJOIN(25),
  INTERSECTJOIN(26),
  DISCRETIZE(27),

  VPROJECT(28),
  PAIRLOCATIONCOMP(29);


  private final int value;

  private OperatorType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @param CLOSEST
   * @return null if the value is not found.
   */
  public static OperatorType findByValue(int value) {
    switch (value) {
      case 0:
        return JOIN;
      case 1:
        return MAPJOIN;
      case 2:
        return EXTRACT;
      case 3:
        return FILTER;
      case 4:
        return FORWARD;
      case 5:
        return GROUPBY;
      case 6:
        return LIMIT;
      case 7:
        return SCRIPT;
      case 8:
        return SELECT;
      case 9:
        return TABLESCAN;
      case 10:
        return FILESINK;
      case 11:
        return REDUCESINK;
      case 12:
        return UNION;
      case 13:
        return UDTF;
      case 14:
        return LATERALVIEWJOIN;
      case 15:
        return LATERALVIEWFORWARD;
      case 16:
        return HASHTABLESINK;
      case 17:
        return HASHTABLEDUMMY;
      case 18:
        return PTF;
      case 19:
        return MUX;
      case 20:
        return DEMUX;
      case 21:
        return PROJECT;
      case 22:
        return COALESCE;
      case 23:
        return CLOSEST;
      case 24:
        return PAIRCLOSEST;
      case 25:
        return EXCLUSIVEJOIN;
      case 26:
        return INTERSECTJOIN;
      case 27:
        return DISCRETIZE;
      case 28:
        return VPROJECT;
      case 29:
        return PAIRLOCATIONCOMP;
      default:
        return null;
    }
  }
}
