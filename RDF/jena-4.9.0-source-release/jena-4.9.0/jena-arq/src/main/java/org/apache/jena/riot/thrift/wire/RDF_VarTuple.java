/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.jena.riot.thrift.wire;

@SuppressWarnings("all")
public class RDF_VarTuple implements org.apache.thrift.TBase<RDF_VarTuple, RDF_VarTuple._Fields>, java.io.Serializable, Cloneable, Comparable<RDF_VarTuple> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RDF_VarTuple");

  private static final org.apache.thrift.protocol.TField VARS_FIELD_DESC = new org.apache.thrift.protocol.TField("vars", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new RDF_VarTupleStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new RDF_VarTupleTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<RDF_VAR> vars; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    VARS((short)1, "vars");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // VARS
          return VARS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VARS, new org.apache.thrift.meta_data.FieldMetaData("vars", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RDF_VAR.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RDF_VarTuple.class, metaDataMap);
  }

  public RDF_VarTuple() {
  }

  public RDF_VarTuple(
    java.util.List<RDF_VAR> vars)
  {
    this();
    this.vars = vars;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RDF_VarTuple(RDF_VarTuple other) {
    if (other.isSetVars()) {
      java.util.List<RDF_VAR> __this__vars = new java.util.ArrayList<RDF_VAR>(other.vars.size());
      for (RDF_VAR other_element : other.vars) {
        __this__vars.add(new RDF_VAR(other_element));
      }
      this.vars = __this__vars;
    }
  }

  public RDF_VarTuple deepCopy() {
    return new RDF_VarTuple(this);
  }

  @Override
  public void clear() {
    this.vars = null;
  }

  public int getVarsSize() {
    return (this.vars == null) ? 0 : this.vars.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<RDF_VAR> getVarsIterator() {
    return (this.vars == null) ? null : this.vars.iterator();
  }

  public void addToVars(RDF_VAR elem) {
    if (this.vars == null) {
      this.vars = new java.util.ArrayList<RDF_VAR>();
    }
    this.vars.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<RDF_VAR> getVars() {
    return this.vars;
  }

  public RDF_VarTuple setVars(@org.apache.thrift.annotation.Nullable java.util.List<RDF_VAR> vars) {
    this.vars = vars;
    return this;
  }

  public void unsetVars() {
    this.vars = null;
  }

  /** Returns true if field vars is set (has been assigned a value) and false otherwise */
  public boolean isSetVars() {
    return this.vars != null;
  }

  public void setVarsIsSet(boolean value) {
    if (!value) {
      this.vars = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case VARS:
      if (value == null) {
        unsetVars();
      } else {
        setVars((java.util.List<RDF_VAR>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case VARS:
      return getVars();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case VARS:
      return isSetVars();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof RDF_VarTuple)
      return this.equals((RDF_VarTuple)that);
    return false;
  }

  public boolean equals(RDF_VarTuple that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_vars = true && this.isSetVars();
    boolean that_present_vars = true && that.isSetVars();
    if (this_present_vars || that_present_vars) {
      if (!(this_present_vars && that_present_vars))
        return false;
      if (!this.vars.equals(that.vars))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetVars()) ? 131071 : 524287);
    if (isSetVars())
      hashCode = hashCode * 8191 + vars.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(RDF_VarTuple other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetVars(), other.isSetVars());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVars()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.vars, other.vars);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("RDF_VarTuple(");
    boolean first = true;

    sb.append("vars:");
    if (this.vars == null) {
      sb.append("null");
    } else {
      sb.append(this.vars);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RDF_VarTupleStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RDF_VarTupleStandardScheme getScheme() {
      return new RDF_VarTupleStandardScheme();
    }
  }

  private static class RDF_VarTupleStandardScheme extends org.apache.thrift.scheme.StandardScheme<RDF_VarTuple> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RDF_VarTuple struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // VARS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.vars = new java.util.ArrayList<RDF_VAR>(_list0.size);
                @org.apache.thrift.annotation.Nullable RDF_VAR _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new RDF_VAR();
                  _elem1.read(iprot);
                  struct.vars.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setVarsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, RDF_VarTuple struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.vars != null) {
        oprot.writeFieldBegin(VARS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.vars.size()));
          for (RDF_VAR _iter3 : struct.vars)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RDF_VarTupleTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RDF_VarTupleTupleScheme getScheme() {
      return new RDF_VarTupleTupleScheme();
    }
  }

  private static class RDF_VarTupleTupleScheme extends org.apache.thrift.scheme.TupleScheme<RDF_VarTuple> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RDF_VarTuple struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetVars()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetVars()) {
        {
          oprot.writeI32(struct.vars.size());
          for (RDF_VAR _iter4 : struct.vars)
          {
            _iter4.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RDF_VarTuple struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list5 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.vars = new java.util.ArrayList<RDF_VAR>(_list5.size);
          @org.apache.thrift.annotation.Nullable RDF_VAR _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = new RDF_VAR();
            _elem6.read(iprot);
            struct.vars.add(_elem6);
          }
        }
        struct.setVarsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
