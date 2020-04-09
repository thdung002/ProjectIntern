/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package connectDB;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-04-09")
public class users implements org.apache.thrift.TBase<users, users._Fields>, java.io.Serializable, Cloneable, Comparable<users> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("users");

  private static final org.apache.thrift.protocol.TField ID_SALE_FIELD_DESC = new org.apache.thrift.protocol.TField("Id_sale", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField USERNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("username", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PASSWORD_FIELD_DESC = new org.apache.thrift.protocol.TField("password", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField FULLNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("Fullname", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField ACCOUNT_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("AccountType", org.apache.thrift.protocol.TType.I32, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new usersStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new usersTupleSchemeFactory();

  public int Id_sale; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String username; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String password; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String Fullname; // required
  public int AccountType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID_SALE((short)1, "Id_sale"),
    USERNAME((short)2, "username"),
    PASSWORD((short)3, "password"),
    FULLNAME((short)4, "Fullname"),
    ACCOUNT_TYPE((short)5, "AccountType");

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
        case 1: // ID_SALE
          return ID_SALE;
        case 2: // USERNAME
          return USERNAME;
        case 3: // PASSWORD
          return PASSWORD;
        case 4: // FULLNAME
          return FULLNAME;
        case 5: // ACCOUNT_TYPE
          return ACCOUNT_TYPE;
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
  private static final int __ID_SALE_ISSET_ID = 0;
  private static final int __ACCOUNTTYPE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID_SALE, new org.apache.thrift.meta_data.FieldMetaData("Id_sale", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.USERNAME, new org.apache.thrift.meta_data.FieldMetaData("username", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PASSWORD, new org.apache.thrift.meta_data.FieldMetaData("password", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FULLNAME, new org.apache.thrift.meta_data.FieldMetaData("Fullname", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ACCOUNT_TYPE, new org.apache.thrift.meta_data.FieldMetaData("AccountType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(users.class, metaDataMap);
  }

  public users() {
  }

  public users(
    int Id_sale,
    java.lang.String username,
    java.lang.String password,
    java.lang.String Fullname,
    int AccountType)
  {
    this();
    this.Id_sale = Id_sale;
    setId_saleIsSet(true);
    this.username = username;
    this.password = password;
    this.Fullname = Fullname;
    this.AccountType = AccountType;
    setAccountTypeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public users(users other) {
    __isset_bitfield = other.__isset_bitfield;
    this.Id_sale = other.Id_sale;
    if (other.isSetUsername()) {
      this.username = other.username;
    }
    if (other.isSetPassword()) {
      this.password = other.password;
    }
    if (other.isSetFullname()) {
      this.Fullname = other.Fullname;
    }
    this.AccountType = other.AccountType;
  }

  public users deepCopy() {
    return new users(this);
  }

  @Override
  public void clear() {
    setId_saleIsSet(false);
    this.Id_sale = 0;
    this.username = null;
    this.password = null;
    this.Fullname = null;
    setAccountTypeIsSet(false);
    this.AccountType = 0;
  }

  public int getId_sale() {
    return this.Id_sale;
  }

  public users setId_sale(int Id_sale) {
    this.Id_sale = Id_sale;
    setId_saleIsSet(true);
    return this;
  }

  public void unsetId_sale() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ID_SALE_ISSET_ID);
  }

  /** Returns true if field Id_sale is set (has been assigned a value) and false otherwise */
  public boolean isSetId_sale() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ID_SALE_ISSET_ID);
  }

  public void setId_saleIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ID_SALE_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getUsername() {
    return this.username;
  }

  public users setUsername(@org.apache.thrift.annotation.Nullable java.lang.String username) {
    this.username = username;
    return this;
  }

  public void unsetUsername() {
    this.username = null;
  }

  /** Returns true if field username is set (has been assigned a value) and false otherwise */
  public boolean isSetUsername() {
    return this.username != null;
  }

  public void setUsernameIsSet(boolean value) {
    if (!value) {
      this.username = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getPassword() {
    return this.password;
  }

  public users setPassword(@org.apache.thrift.annotation.Nullable java.lang.String password) {
    this.password = password;
    return this;
  }

  public void unsetPassword() {
    this.password = null;
  }

  /** Returns true if field password is set (has been assigned a value) and false otherwise */
  public boolean isSetPassword() {
    return this.password != null;
  }

  public void setPasswordIsSet(boolean value) {
    if (!value) {
      this.password = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getFullname() {
    return this.Fullname;
  }

  public users setFullname(@org.apache.thrift.annotation.Nullable java.lang.String Fullname) {
    this.Fullname = Fullname;
    return this;
  }

  public void unsetFullname() {
    this.Fullname = null;
  }

  /** Returns true if field Fullname is set (has been assigned a value) and false otherwise */
  public boolean isSetFullname() {
    return this.Fullname != null;
  }

  public void setFullnameIsSet(boolean value) {
    if (!value) {
      this.Fullname = null;
    }
  }

  public int getAccountType() {
    return this.AccountType;
  }

  public users setAccountType(int AccountType) {
    this.AccountType = AccountType;
    setAccountTypeIsSet(true);
    return this;
  }

  public void unsetAccountType() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ACCOUNTTYPE_ISSET_ID);
  }

  /** Returns true if field AccountType is set (has been assigned a value) and false otherwise */
  public boolean isSetAccountType() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ACCOUNTTYPE_ISSET_ID);
  }

  public void setAccountTypeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ACCOUNTTYPE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ID_SALE:
      if (value == null) {
        unsetId_sale();
      } else {
        setId_sale((java.lang.Integer)value);
      }
      break;

    case USERNAME:
      if (value == null) {
        unsetUsername();
      } else {
        setUsername((java.lang.String)value);
      }
      break;

    case PASSWORD:
      if (value == null) {
        unsetPassword();
      } else {
        setPassword((java.lang.String)value);
      }
      break;

    case FULLNAME:
      if (value == null) {
        unsetFullname();
      } else {
        setFullname((java.lang.String)value);
      }
      break;

    case ACCOUNT_TYPE:
      if (value == null) {
        unsetAccountType();
      } else {
        setAccountType((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID_SALE:
      return getId_sale();

    case USERNAME:
      return getUsername();

    case PASSWORD:
      return getPassword();

    case FULLNAME:
      return getFullname();

    case ACCOUNT_TYPE:
      return getAccountType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID_SALE:
      return isSetId_sale();
    case USERNAME:
      return isSetUsername();
    case PASSWORD:
      return isSetPassword();
    case FULLNAME:
      return isSetFullname();
    case ACCOUNT_TYPE:
      return isSetAccountType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof users)
      return this.equals((users)that);
    return false;
  }

  public boolean equals(users that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_Id_sale = true;
    boolean that_present_Id_sale = true;
    if (this_present_Id_sale || that_present_Id_sale) {
      if (!(this_present_Id_sale && that_present_Id_sale))
        return false;
      if (this.Id_sale != that.Id_sale)
        return false;
    }

    boolean this_present_username = true && this.isSetUsername();
    boolean that_present_username = true && that.isSetUsername();
    if (this_present_username || that_present_username) {
      if (!(this_present_username && that_present_username))
        return false;
      if (!this.username.equals(that.username))
        return false;
    }

    boolean this_present_password = true && this.isSetPassword();
    boolean that_present_password = true && that.isSetPassword();
    if (this_present_password || that_present_password) {
      if (!(this_present_password && that_present_password))
        return false;
      if (!this.password.equals(that.password))
        return false;
    }

    boolean this_present_Fullname = true && this.isSetFullname();
    boolean that_present_Fullname = true && that.isSetFullname();
    if (this_present_Fullname || that_present_Fullname) {
      if (!(this_present_Fullname && that_present_Fullname))
        return false;
      if (!this.Fullname.equals(that.Fullname))
        return false;
    }

    boolean this_present_AccountType = true;
    boolean that_present_AccountType = true;
    if (this_present_AccountType || that_present_AccountType) {
      if (!(this_present_AccountType && that_present_AccountType))
        return false;
      if (this.AccountType != that.AccountType)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + Id_sale;

    hashCode = hashCode * 8191 + ((isSetUsername()) ? 131071 : 524287);
    if (isSetUsername())
      hashCode = hashCode * 8191 + username.hashCode();

    hashCode = hashCode * 8191 + ((isSetPassword()) ? 131071 : 524287);
    if (isSetPassword())
      hashCode = hashCode * 8191 + password.hashCode();

    hashCode = hashCode * 8191 + ((isSetFullname()) ? 131071 : 524287);
    if (isSetFullname())
      hashCode = hashCode * 8191 + Fullname.hashCode();

    hashCode = hashCode * 8191 + AccountType;

    return hashCode;
  }

  @Override
  public int compareTo(users other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetId_sale()).compareTo(other.isSetId_sale());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId_sale()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Id_sale, other.Id_sale);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUsername()).compareTo(other.isSetUsername());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsername()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.username, other.username);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPassword()).compareTo(other.isSetPassword());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPassword()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.password, other.password);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetFullname()).compareTo(other.isSetFullname());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFullname()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Fullname, other.Fullname);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAccountType()).compareTo(other.isSetAccountType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAccountType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.AccountType, other.AccountType);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("users(");
    boolean first = true;

    sb.append("Id_sale:");
    sb.append(this.Id_sale);
    first = false;
    if (!first) sb.append(", ");
    sb.append("username:");
    if (this.username == null) {
      sb.append("null");
    } else {
      sb.append(this.username);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("password:");
    if (this.password == null) {
      sb.append("null");
    } else {
      sb.append(this.password);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("Fullname:");
    if (this.Fullname == null) {
      sb.append("null");
    } else {
      sb.append(this.Fullname);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("AccountType:");
    sb.append(this.AccountType);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class usersStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public usersStandardScheme getScheme() {
      return new usersStandardScheme();
    }
  }

  private static class usersStandardScheme extends org.apache.thrift.scheme.StandardScheme<users> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, users struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID_SALE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.Id_sale = iprot.readI32();
              struct.setId_saleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USERNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.username = iprot.readString();
              struct.setUsernameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PASSWORD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.password = iprot.readString();
              struct.setPasswordIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // FULLNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Fullname = iprot.readString();
              struct.setFullnameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ACCOUNT_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.AccountType = iprot.readI32();
              struct.setAccountTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, users struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_SALE_FIELD_DESC);
      oprot.writeI32(struct.Id_sale);
      oprot.writeFieldEnd();
      if (struct.username != null) {
        oprot.writeFieldBegin(USERNAME_FIELD_DESC);
        oprot.writeString(struct.username);
        oprot.writeFieldEnd();
      }
      if (struct.password != null) {
        oprot.writeFieldBegin(PASSWORD_FIELD_DESC);
        oprot.writeString(struct.password);
        oprot.writeFieldEnd();
      }
      if (struct.Fullname != null) {
        oprot.writeFieldBegin(FULLNAME_FIELD_DESC);
        oprot.writeString(struct.Fullname);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(ACCOUNT_TYPE_FIELD_DESC);
      oprot.writeI32(struct.AccountType);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class usersTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public usersTupleScheme getScheme() {
      return new usersTupleScheme();
    }
  }

  private static class usersTupleScheme extends org.apache.thrift.scheme.TupleScheme<users> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, users struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId_sale()) {
        optionals.set(0);
      }
      if (struct.isSetUsername()) {
        optionals.set(1);
      }
      if (struct.isSetPassword()) {
        optionals.set(2);
      }
      if (struct.isSetFullname()) {
        optionals.set(3);
      }
      if (struct.isSetAccountType()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetId_sale()) {
        oprot.writeI32(struct.Id_sale);
      }
      if (struct.isSetUsername()) {
        oprot.writeString(struct.username);
      }
      if (struct.isSetPassword()) {
        oprot.writeString(struct.password);
      }
      if (struct.isSetFullname()) {
        oprot.writeString(struct.Fullname);
      }
      if (struct.isSetAccountType()) {
        oprot.writeI32(struct.AccountType);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, users struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.Id_sale = iprot.readI32();
        struct.setId_saleIsSet(true);
      }
      if (incoming.get(1)) {
        struct.username = iprot.readString();
        struct.setUsernameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.password = iprot.readString();
        struct.setPasswordIsSet(true);
      }
      if (incoming.get(3)) {
        struct.Fullname = iprot.readString();
        struct.setFullnameIsSet(true);
      }
      if (incoming.get(4)) {
        struct.AccountType = iprot.readI32();
        struct.setAccountTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

