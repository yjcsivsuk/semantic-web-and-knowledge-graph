/* Generated By:JavaCC: Do not edit this line. ShaclCompactParserJJConstants.java */
/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.jena.shacl.compact.reader.parser;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface ShaclCompactParserJJConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int SINGLE_LINE_COMMENT = 52;
  /** RegularExpression Id. */
  int BOM = 53;
  /** RegularExpression Id. */
  int BASE = 54;
  /** RegularExpression Id. */
  int IMPORTS = 55;
  /** RegularExpression Id. */
  int PREFIX = 56;
  /** RegularExpression Id. */
  int SHAPE_CLASS = 57;
  /** RegularExpression Id. */
  int SHAPE = 58;
  /** RegularExpression Id. */
  int TRUE = 59;
  /** RegularExpression Id. */
  int FALSE = 60;
  /** RegularExpression Id. */
  int HEX = 61;
  /** RegularExpression Id. */
  int PLUS = 62;
  /** RegularExpression Id. */
  int MINUS = 63;
  /** RegularExpression Id. */
  int VBAR = 64;
  /** RegularExpression Id. */
  int AT = 65;
  /** RegularExpression Id. */
  int CARAT = 66;
  /** RegularExpression Id. */
  int DOT = 67;
  /** RegularExpression Id. */
  int BANG = 68;
  /** RegularExpression Id. */
  int QMARK = 69;
  /** RegularExpression Id. */
  int SLASH = 70;
  /** RegularExpression Id. */
  int STAR = 71;
  /** RegularExpression Id. */
  int EQUALS = 72;
  /** RegularExpression Id. */
  int LPAREN = 73;
  /** RegularExpression Id. */
  int RPAREN = 74;
  /** RegularExpression Id. */
  int LBRACE = 75;
  /** RegularExpression Id. */
  int RBRACE = 76;
  /** RegularExpression Id. */
  int LBRACKET = 77;
  /** RegularExpression Id. */
  int RBRACKET = 78;
  /** RegularExpression Id. */
  int IRIref = 79;
  /** RegularExpression Id. */
  int PNAME_NS = 80;
  /** RegularExpression Id. */
  int PNAME_LN = 81;
  /** RegularExpression Id. */
  int ATPNAME_NS = 82;
  /** RegularExpression Id. */
  int ATPNAME_LN = 83;
  /** RegularExpression Id. */
  int QUOTE_3D = 84;
  /** RegularExpression Id. */
  int QUOTE_3S = 85;
  /** RegularExpression Id. */
  int ECHAR = 86;
  /** RegularExpression Id. */
  int UCHAR = 87;
  /** RegularExpression Id. */
  int UCHAR4 = 88;
  /** RegularExpression Id. */
  int UCHAR8 = 89;
  /** RegularExpression Id. */
  int STRING_LITERAL1 = 90;
  /** RegularExpression Id. */
  int STRING_LITERAL2 = 91;
  /** RegularExpression Id. */
  int STRING_LITERAL_LONG1 = 92;
  /** RegularExpression Id. */
  int STRING_LITERAL_LONG2 = 93;
  /** RegularExpression Id. */
  int DIGITS = 94;
  /** RegularExpression Id. */
  int INTEGER = 95;
  /** RegularExpression Id. */
  int DECIMAL = 96;
  /** RegularExpression Id. */
  int DOUBLE = 97;
  /** RegularExpression Id. */
  int EXPONENT = 98;
  /** RegularExpression Id. */
  int LANGTAG = 99;
  /** RegularExpression Id. */
  int A2Z = 100;
  /** RegularExpression Id. */
  int A2ZN = 101;
  /** RegularExpression Id. */
  int SURROGATE_PAIR = 102;
  /** RegularExpression Id. */
  int PN_CHARS_BASE = 103;
  /** RegularExpression Id. */
  int PN_CHARS_U = 104;
  /** RegularExpression Id. */
  int PN_CHARS = 105;
  /** RegularExpression Id. */
  int PN_PREFIX = 106;
  /** RegularExpression Id. */
  int PN_LOCAL = 107;
  /** RegularExpression Id. */
  int VARNAME = 108;
  /** RegularExpression Id. */
  int PN_LOCAL_ESC = 109;
  /** RegularExpression Id. */
  int PLX = 110;
  /** RegularExpression Id. */
  int PERCENT = 111;
  /** RegularExpression Id. */
  int UNKNOWN = 112;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\"->\"",
    "\"..\"",
    "\"BlankNode\"",
    "\"IRI\"",
    "\"Literal\"",
    "\"BlankNodeOrIRI\"",
    "\"BlankNodeOrLiteral\"",
    "\"IRIOrLiteral\"",
    "\"targetNode\"",
    "\"targetObjectsOf\"",
    "\"targetSubjectsOf\"",
    "\"targetClass\"",
    "\"deactivated\"",
    "\"severity\"",
    "\"message\"",
    "\"class\"",
    "\"datatype\"",
    "\"nodeKind\"",
    "\"minExclusive\"",
    "\"minInclusive\"",
    "\"maxExclusive\"",
    "\"maxInclusive\"",
    "\"minLength\"",
    "\"maxLength\"",
    "\"pattern\"",
    "\"flags\"",
    "\"languageIn\"",
    "\"equals\"",
    "\"disjoint\"",
    "\"closed\"",
    "\"ignoredProperties\"",
    "\"hasValue\"",
    "\"in\"",
    "\"uniqueLang\"",
    "\"lessThan\"",
    "\"lessThanOrEquals\"",
    "\"qualifiedValueShape\"",
    "\"qualifiedMinCount\"",
    "\"qualifiedMaxCount\"",
    "\"qualifiedValueShapesDisjoint\"",
    "\"group\"",
    "\"order\"",
    "\"name\"",
    "\"description\"",
    "\"defaultValue\"",
    "\"^^\"",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\f\"",
    "<SINGLE_LINE_COMMENT>",
    "\"\\ufeff\"",
    "\"BASE\"",
    "\"IMPORTS\"",
    "\"PREFIX\"",
    "\"shapeClass\"",
    "\"shape\"",
    "\"true\"",
    "\"false\"",
    "<HEX>",
    "\"+\"",
    "\"-\"",
    "\"|\"",
    "\"@\"",
    "\"^\"",
    "\".\"",
    "\"!\"",
    "\"?\"",
    "\"/\"",
    "\"*\"",
    "\"=\"",
    "\"(\"",
    "\")\"",
    "\"{\"",
    "\"}\"",
    "\"[\"",
    "\"]\"",
    "<IRIref>",
    "<PNAME_NS>",
    "<PNAME_LN>",
    "<ATPNAME_NS>",
    "<ATPNAME_LN>",
    "\"\\\"\\\"\\\"\"",
    "\"\\\'\\\'\\\'\"",
    "<ECHAR>",
    "<UCHAR>",
    "<UCHAR4>",
    "<UCHAR8>",
    "<STRING_LITERAL1>",
    "<STRING_LITERAL2>",
    "<STRING_LITERAL_LONG1>",
    "<STRING_LITERAL_LONG2>",
    "<DIGITS>",
    "<INTEGER>",
    "<DECIMAL>",
    "<DOUBLE>",
    "<EXPONENT>",
    "<LANGTAG>",
    "<A2Z>",
    "<A2ZN>",
    "<SURROGATE_PAIR>",
    "<PN_CHARS_BASE>",
    "<PN_CHARS_U>",
    "<PN_CHARS>",
    "<PN_PREFIX>",
    "<PN_LOCAL>",
    "<VARNAME>",
    "<PN_LOCAL_ESC>",
    "<PLX>",
    "<PERCENT>",
    "<UNKNOWN>",
  };

}
