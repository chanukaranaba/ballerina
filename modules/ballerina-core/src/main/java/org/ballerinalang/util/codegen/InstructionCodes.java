/*
*  Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing,
*  software distributed under the License is distributed on an
*  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
*  KIND, either express or implied.  See the License for the
*  specific language governing permissions and limitations
*  under the License.
*/
package org.ballerinalang.util.codegen;

/**
 * Bytecode instructions of a Ballerina compiled program.
 *
 * @since 0.87
 */
public interface InstructionCodes {
    
    int NOP = 0;
    int ICONST = 2;
    int FCONST = 3;
    int SCONST = 4;
    int ICONST_0 = 5;
    int ICONST_1 = 6;
    int ICONST_2 = 7;
    int ICONST_3 = 8;
    int ICONST_4 = 9;
    int ICONST_5 = 10;
    int FCONST_0 = 11;
    int FCONST_1 = 12;
    int FCONST_2 = 13;
    int FCONST_3 = 14;
    int FCONST_4 = 15;
    int FCONST_5 = 16;
    int BCONST_0 = 17;
    int BCONST_1 = 18;
    int RCONST_NULL = 19;

    int ILOAD = 22;
    int FLOAD = 23;
    int SLOAD = 24;
    int BLOAD = 25;
    int RLOAD = 26;
    int LLOAD = 27;
    int IALOAD = 28;
    int FALOAD = 29;
    int SALOAD = 30;
    int BALOAD = 31;
    int RALOAD = 32;
    int LALOAD = 33;
    int JSONALOAD = 34;
    int IGLOAD = 35;
    int FGLOAD = 36;
    int SGLOAD = 37;
    int BGLOAD = 38;
    int RGLOAD = 39;
    int LGLOAD = 40;

    int ISTORE = 41;
    int FSTORE = 42;
    int SSTORE = 43;
    int BSTORE = 44;
    int RSTORE = 45;
    int LSTORE = 46;
    int IASTORE = 47;
    int FASTORE = 48;
    int SASTORE = 49;
    int BASTORE = 50;
    int RASTORE = 51;
    int LASTORE = 52;
    int JSONASTORE = 53;
    int IGSTORE = 54;
    int FGSTORE = 55;
    int SGSTORE = 56;
    int BGSTORE = 57;
    int RGSTORE = 58;
    int LGSTORE = 59;

    int IFIELDLOAD = 60;
    int FFIELDLOAD = 61;
    int SFIELDLOAD = 62;
    int BFIELDLOAD = 63;
    int RFIELDLOAD = 64;
    int LFIELDLOAD = 65;

    int IFIELDSTORE = 66;
    int FFIELDSTORE = 67;
    int SFIELDSTORE = 68;
    int BFIELDSTORE = 69;
    int RFIELDSTORE = 70;
    int LFIELDSTORE = 71;

    // mapload map_reg_index key value_reg_index
    int MAPLOAD = 72;
    // mapstore map_reg_index key value_reg_index
    int MAPSTORE = 73;

    // jsonload json_reg_index key json_value_reg_index
    int JSONLOAD = 74;
    int JSONSTORE = 75;

    int IADD = 76;
    int FADD = 77;
    int SADD = 78;
    int ISUB = 79;
    int FSUB = 80;
    int IMUL = 81;
    int FMUL = 82;
    int IDIV = 83;
    int FDIV = 84;
    int IMOD = 85;
    int FMOD = 86;
    int INEG = 87;
    int FNEG = 88;
    int NOT = 89;

    int ICMP = 100;
    int FCMP = 101;
    int SCMP = 102;
    int BCMP = 103;
    int IFEQ = 110;
    int IFNE = 111;
    int IFLT = 112;
    int IFGE = 113;
    int IFGT = 114;
    int IFLE = 115;

    int GOTO = 119;
    int CALL = 120;
    int NCALL = 121;
    int ACALL = 122;
    int NACALL = 123;
    int RET = 124;
    int REP = 125;
    int THROW = 126;
    int ERRSTORE = 127;

    // Type Cast/Conversion related instructions
    int I2F = 130;
    int I2S = 131;
    int I2B = 132;
    int I2ANY = 133;
    int I2JSON = 134;
    int F2I = 135;
    int F2S = 136;
    int F2B = 137;
    int F2ANY = 138;
    int F2JSON = 139;
    int S2I = 140;
    int S2F = 141;
    int S2B = 142;
    int S2ANY = 143;
    int S2JSON = 144;
    int B2I = 145;
    int B2F = 146;
    int B2S = 147;
    int B2ANY = 148;
    int B2JSON = 149;
    int JSON2I = 150;
    int JSON2F = 151;
    int JSON2S = 152;
    int JSON2B = 153;

    // Type cast
    int ANY2I = 155;
    int ANY2F = 156;
    int ANY2S = 157;
    int ANY2B = 158;
    int ANY2JSON = 159;
    int ANY2T = 160;
    int ANY2MAP = 161;
    int NULL2JSON = 162;
    int CHECKCAST = 163;
    int ANY2MSG = 164;

    int WRKINVOKE = 190;
    int WRKREPLY = 191;

    int INEWARRAY = 200;
    int FNEWARRAY = 201;
    int SNEWARRAY = 202;
    int BNEWARRAY = 203;
    int RNEWARRAY = 204;
    int LNEWARRAY = 205;
    int JSONNEWARRAY = 206;
    int ARRAYLEN = 207;

    int NEWSTRUCT = 210;
    int NEWCONNECTOR = 211;
    int NEWMAP = 212;
    int NEWJSON = 213;
    int NEWMESSAGE = 214;
    int NEWDATATABLE = 215;

    int INSTRUCTION_CODE_COUNT = 216;
}
