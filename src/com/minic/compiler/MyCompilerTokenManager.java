package src.com.minic.compiler;

import src.com.minic.constants.MyCompilerConstants;

/**
 * @author: 陈健航
 * @description: 单词管理器
 * @since: 2020/4/1 12:21
 * @version: 1.0
 */
@SuppressWarnings("ALL")
public class MyCompilerTokenManager implements MyCompilerConstants {

    /**
     * 令牌文字值
     */
    public static final String[] jjstrLiteralImages = {
            "", null, null, null, null, null, null, "\151\146", "\145\154\163\145",
            "\167\150\151\154\145", "\151\156\164", "\162\145\164\165\162\156", "\166\157\151\144",
            "\157\165\164\160\165\164", "\151\156\160\165\164", null, null, null, null, "\73", "\75\75", "\41\75",
            "\75", "\53", "\55", "\52", "\57", "\54", "\50", "\51", "\133", "\135", null, "\173",
            "\175", "\74", "\76", "\74\75", "\76\75",};
    /**
     * Lexer状态名称。
     */
    public static final String[] lexStateNames = {
            "DEFAULT",
    };
    static final long[] jjbitVec0 = {
            0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
    };
    static final int[] jjnextStates = {
            3, 4, 6, 2, 7, 10, 12, 14, 15, 16,
    };
    static final long[] jjtoToken = {
            0x7ffffd7f81L,
    };
    static final long[] jjtoSkip = {
            0x7eL,
    };
    private final int[] jjrounds = new int[17];
    private final int[] jjstateSet = new int[34];
    /**
     * 调试输出。
     */
    public java.io.PrintStream debugStream = System.out;
    protected SimpleCharStream input_stream;
    protected char curChar;
    int curLexState = 0;
    int defaultLexState = 0;
    int jjnewStateCnt;
    int jjround;
    int jjmatchedPos;
    int jjmatchedKind;

    /**
     * 构造函数。
     */
    public MyCompilerTokenManager(SimpleCharStream stream) {
        if (SimpleCharStream.staticFlag) {
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
        }
        input_stream = stream;
    }

    /**
     * 构造函数。
     */
    public MyCompilerTokenManager(SimpleCharStream stream, int lexState) {
        this(stream);
        SwitchTo(lexState);
    }

    /**
     * 设置调试输出。
     */
    public void setDebugStream(java.io.PrintStream ds) {
        debugStream = ds;
    }

    private final int jjStopStringLiteralDfa_0(int pos, long active0) {
        switch (pos) {
            case 0:
                if ((active0 & 0x7f80L) != 0L) {
                    jjmatchedKind = 16;
                    return 17;
                }
                if ((active0 & 0x4000000L) != 0L) {
                    return 2;
                }
                return -1;
            case 1:
                if ((active0 & 0x7f00L) != 0L) {
                    jjmatchedKind = 16;
                    jjmatchedPos = 1;
                    return 17;
                }
                if ((active0 & 0x80L) != 0L) {
                    return 17;
                }
                return -1;
            case 2:
                if ((active0 & 0x400L) != 0L) {
                    return 17;
                }
                if ((active0 & 0x7b00L) != 0L) {
                    jjmatchedKind = 16;
                    jjmatchedPos = 2;
                    return 17;
                }
                return -1;
            case 3:
                if ((active0 & 0x1100L) != 0L) {
                    return 17;
                }
                if ((active0 & 0x6a00L) != 0L) {
                    jjmatchedKind = 16;
                    jjmatchedPos = 3;
                    return 17;
                }
                return -1;
            case 4:
                if ((active0 & 0x2800L) != 0L) {
                    jjmatchedKind = 16;
                    jjmatchedPos = 4;
                    return 17;
                }
                if ((active0 & 0x4200L) != 0L) {
                    return 17;
                }
                return -1;
            default:
                return -1;
        }
    }

    private final int jjStartNfa_0(int pos, long active0) {
        return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
    }

    private int jjStopAtPos(int pos, int kind) {
        jjmatchedKind = kind;
        jjmatchedPos = pos;
        return pos + 1;
    }

    private int jjMoveStringLiteralDfa0_0() {
        switch (curChar) {
            case 33:
                return jjMoveStringLiteralDfa1_0(0x200000L);
            case 40:
                return jjStopAtPos(0, 28);
            case 41:
                return jjStopAtPos(0, 29);
            case 42:
                return jjStopAtPos(0, 25);
            case 43:
                return jjStopAtPos(0, 23);
            case 44:
                return jjStopAtPos(0, 27);
            case 45:
                return jjStopAtPos(0, 24);
            case 47:
                return jjStartNfaWithStates_0(0, 26, 2);
            case 59:
                return jjStopAtPos(0, 19);
            case 60:
                jjmatchedKind = 35;
                return jjMoveStringLiteralDfa1_0(0x2000000000L);
            case 61:
                jjmatchedKind = 22;
                return jjMoveStringLiteralDfa1_0(0x100000L);
            case 62:
                jjmatchedKind = 36;
                return jjMoveStringLiteralDfa1_0(0x4000000000L);
            case 91:
                return jjStopAtPos(0, 30);
            case 93:
                return jjStopAtPos(0, 31);
            case 101:
                return jjMoveStringLiteralDfa1_0(0x100L);
            case 105:
                return jjMoveStringLiteralDfa1_0(0x4480L);
            case 111:
                return jjMoveStringLiteralDfa1_0(0x2000L);
            case 114:
                return jjMoveStringLiteralDfa1_0(0x800L);
            case 118:
                return jjMoveStringLiteralDfa1_0(0x1000L);
            case 119:
                return jjMoveStringLiteralDfa1_0(0x200L);
            case 123:
                return jjStopAtPos(0, 33);
            case 125:
                return jjStopAtPos(0, 34);
            default:
                return jjMoveNfa_0(1, 0);
        }
    }

    private int jjMoveStringLiteralDfa1_0(long active0) {
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_0(0, active0);
            return 1;
        }
        switch (curChar) {
            case 61:
                if ((active0 & 0x100000L) != 0L) {
                    return jjStopAtPos(1, 20);
                } else if ((active0 & 0x200000L) != 0L) {
                    return jjStopAtPos(1, 21);
                } else if ((active0 & 0x2000000000L) != 0L) {
                    return jjStopAtPos(1, 37);
                } else if ((active0 & 0x4000000000L) != 0L) {
                    return jjStopAtPos(1, 38);
                }
                break;
            case 101:
                return jjMoveStringLiteralDfa2_0(active0, 0x800L);
            case 102:
                if ((active0 & 0x80L) != 0L) {
                    return jjStartNfaWithStates_0(1, 7, 17);
                }
                break;
            case 104:
                return jjMoveStringLiteralDfa2_0(active0, 0x200L);
            case 108:
                return jjMoveStringLiteralDfa2_0(active0, 0x100L);
            case 110:
                return jjMoveStringLiteralDfa2_0(active0, 0x4400L);
            case 111:
                return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
            case 117:
                return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
            default:
                break;
        }
        return jjStartNfa_0(0, active0);
    }

    private int jjMoveStringLiteralDfa2_0(long old0, long active0) {
        if (((active0 &= old0)) == 0L) {
            return jjStartNfa_0(0, old0);
        }
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_0(1, active0);
            return 2;
        }
        switch (curChar) {
            case 105:
                return jjMoveStringLiteralDfa3_0(active0, 0x1200L);
            case 112:
                return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
            case 115:
                return jjMoveStringLiteralDfa3_0(active0, 0x100L);
            case 116:
                if ((active0 & 0x400L) != 0L) {
                    return jjStartNfaWithStates_0(2, 10, 17);
                }
                return jjMoveStringLiteralDfa3_0(active0, 0x2800L);
            default:
                break;
        }
        return jjStartNfa_0(1, active0);
    }

    private int jjMoveStringLiteralDfa3_0(long old0, long active0) {
        if (((active0 &= old0)) == 0L) {
            return jjStartNfa_0(1, old0);
        }
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_0(2, active0);
            return 3;
        }
        switch (curChar) {
            case 100:
                if ((active0 & 0x1000L) != 0L) {
                    return jjStartNfaWithStates_0(3, 12, 17);
                }
                break;
            case 101:
                if ((active0 & 0x100L) != 0L) {
                    return jjStartNfaWithStates_0(3, 8, 17);
                }
                break;
            case 108:
                return jjMoveStringLiteralDfa4_0(active0, 0x200L);
            case 112:
                return jjMoveStringLiteralDfa4_0(active0, 0x2000L);
            case 117:
                return jjMoveStringLiteralDfa4_0(active0, 0x4800L);
            default:
                break;
        }
        return jjStartNfa_0(2, active0);
    }

    private int jjMoveStringLiteralDfa4_0(long old0, long active0) {
        if (((active0 &= old0)) == 0L) {
            return jjStartNfa_0(2, old0);
        }
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_0(3, active0);
            return 4;
        }
        switch (curChar) {
            case 101:
                if ((active0 & 0x200L) != 0L) {
                    return jjStartNfaWithStates_0(4, 9, 17);
                }
                break;
            case 114:
                return jjMoveStringLiteralDfa5_0(active0, 0x800L);
            case 116:
                if ((active0 & 0x4000L) != 0L) {
                    return jjStartNfaWithStates_0(4, 14, 17);
                }
                break;
            case 117:
                return jjMoveStringLiteralDfa5_0(active0, 0x2000L);
            default:
                break;
        }
        return jjStartNfa_0(3, active0);
    }

    private int jjMoveStringLiteralDfa5_0(long old0, long active0) {
        if (((active0 &= old0)) == 0L) {
            return jjStartNfa_0(3, old0);
        }
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_0(4, active0);
            return 5;
        }
        switch (curChar) {
            case 110:
                if ((active0 & 0x800L) != 0L) {
                    return jjStartNfaWithStates_0(5, 11, 17);
                }
                break;
            case 116:
                if ((active0 & 0x2000L) != 0L) {
                    return jjStartNfaWithStates_0(5, 13, 17);
                }
                break;
            default:
                break;
        }
        return jjStartNfa_0(4, active0);
    }

    private int jjStartNfaWithStates_0(int pos, int kind, int state) {
        jjmatchedKind = kind;
        jjmatchedPos = pos;
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            return pos + 1;
        }
        return jjMoveNfa_0(state, pos + 1);
    }

    private int jjMoveNfa_0(int startState, int curPos) {
        int startsAt = 0;
        jjnewStateCnt = 17;
        int i = 1;
        jjstateSet[0] = startState;
        int kind = 0x7fffffff;
        for (; ; ) {
            if (++jjround == 0x7fffffff) {
                ReInitRounds();
            }
            if (curChar < 64) {
                long l = 1L << curChar;
                do {
                    switch (jjstateSet[--i]) {
                        case 2:
                            if (curChar == 42) {
                                jjCheckNAddTwoStates(8, 9);
                            } else if (curChar == 47) {
                                jjCheckNAddStates(0, 2);
                            }
                            break;
                        case 1:
                            if ((0x3ff000000000000L & l) != 0L) {
                                if (kind > 18) {
                                    kind = 18;
                                }
                                jjCheckNAdd(0);
                            } else if (curChar == 47) {
                                jjAddStates(3, 4);
                            }
                            break;
                        case 0:
                            if ((0x3ff000000000000L & l) == 0L) {
                                break;
                            }
                            if (kind > 18) {
                                kind = 18;
                            }
                            jjCheckNAdd(0);
                            break;
                        case 3:
                            if ((0xffffffffffffdbffL & l) != 0L) {
                                jjCheckNAddStates(0, 2);
                            }
                            break;
                        case 4:
                            if ((0x2400L & l) != 0L && kind > 5) {
                                kind = 5;
                            }
                            break;
                        case 5:
                            if (curChar == 10 && kind > 5) {
                                kind = 5;
                            }
                            break;
                        case 6:
                            if (curChar == 13) {
                                jjstateSet[jjnewStateCnt++] = 5;
                            }
                            break;
                        case 7:
                            if (curChar == 42) {
                                jjCheckNAddTwoStates(8, 9);
                            }
                            break;
                        case 8:
                            if ((0xfffffbffffffffffL & l) != 0L) {
                                jjCheckNAddTwoStates(8, 9);
                            }
                            break;
                        case 9:
                            if (curChar == 42) {
                                jjAddStates(5, 6);
                            }
                            break;
                        case 10:
                            if ((0xffff7fffffffffffL & l) != 0L) {
                                jjCheckNAddTwoStates(11, 9);
                            }
                            break;
                        case 11:
                            if ((0xfffffbffffffffffL & l) != 0L) {
                                jjCheckNAddTwoStates(11, 9);
                            }
                            break;
                        case 12:
                            if (curChar == 47 && kind > 6) {
                                kind = 6;
                            }
                            break;
                        default:
                            break;
                    }
                } while (i != startsAt);
            } else if (curChar < 128) {
                long l = 1L << (curChar & 077);
                do {
                    switch (jjstateSet[--i]) {
                        case 17:
                            if ((0x7fffffe07fffffeL & l) != 0L) {
                                jjCheckNAddTwoStates(15, 16);
                            } else if (curChar == 91) {
                                if (kind > 32) {
                                    kind = 32;
                                }
                            }
                            if ((0x7fffffe07fffffeL & l) != 0L) {
                                if (kind > 16) {
                                    kind = 16;
                                }
                                jjCheckNAdd(14);
                            }
                            break;
                        case 1:
                            if ((0x7fffffe07fffffeL & l) == 0L) {
                                break;
                            }
                            if (kind > 16) {
                                kind = 16;
                            }
                            jjCheckNAddStates(7, 9);
                            break;
                        case 3:
                            jjAddStates(0, 2);
                            break;
                        case 8:
                            jjCheckNAddTwoStates(8, 9);
                            break;
                        case 10:
                        case 11:
                            jjCheckNAddTwoStates(11, 9);
                            break;
                        case 14:
                            if ((0x7fffffe07fffffeL & l) == 0L) {
                                break;
                            }
                            if (kind > 16) {
                                kind = 16;
                            }
                            jjCheckNAdd(14);
                            break;
                        case 15:
                            if ((0x7fffffe07fffffeL & l) != 0L) {
                                jjCheckNAddTwoStates(15, 16);
                            }
                            break;
                        case 16:
                            if (curChar == 91 && kind > 32) {
                                kind = 32;
                            }
                            break;
                        default:
                            break;
                    }
                } while (i != startsAt);
            } else {
                int i2 = (curChar & 0xff) >> 6;
                long l2 = 1L << (curChar & 077);
                do {
                    switch (jjstateSet[--i]) {
                        case 3:
                            if ((jjbitVec0[i2] & l2) != 0L) {
                                jjAddStates(0, 2);
                            }
                            break;
                        case 8:
                            if ((jjbitVec0[i2] & l2) != 0L) {
                                jjCheckNAddTwoStates(8, 9);
                            }
                            break;
                        case 10:
                        case 11:
                            if ((jjbitVec0[i2] & l2) != 0L) {
                                jjCheckNAddTwoStates(11, 9);
                            }
                            break;
                        default:
                            break;
                    }
                } while (i != startsAt);
            }
            if (kind != 0x7fffffff) {
                jjmatchedKind = kind;
                jjmatchedPos = curPos;
                kind = 0x7fffffff;
            }
            ++curPos;
            if ((i = jjnewStateCnt) == (startsAt = 17 - (jjnewStateCnt = startsAt))) {
                return curPos;
            }
            try {
                curChar = input_stream.readChar();
            } catch (java.io.IOException e) {
                return curPos;
            }
        }
    }

    /**
     * 重新初始化解析器。
     */
    public void ReInit(SimpleCharStream stream) {
        jjmatchedPos = jjnewStateCnt = 0;
        curLexState = defaultLexState;
        input_stream = stream;
        ReInitRounds();
    }

    private void ReInitRounds() {
        int i;
        jjround = 0x80000001;
        for (i = 17; i-- > 0; ) {
            jjrounds[i] = 0x80000000;
        }
    }

    /**
     * 重新初始化解析器。
     */
    public void ReInit(SimpleCharStream stream, int lexState) {
        ReInit(stream);
        SwitchTo(lexState);
    }

    /**
     * 切换到指定的lex状态。
     */
    public void SwitchTo(int lexState) {
        if (lexState >= 1 || lexState < 0) {
            throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
        } else {
            curLexState = lexState;
        }
    }

    protected Token jjFillToken() {
        final Token t;
        final String curTokenImage;
        final int beginLine;
        final int endLine;
        final int beginColumn;
        final int endColumn;
        String im = jjstrLiteralImages[jjmatchedKind];
        curTokenImage = (im == null) ? input_stream.GetImage() : im;
        beginLine = input_stream.getBeginLine();
        beginColumn = input_stream.getBeginColumn();
        endLine = input_stream.getEndLine();
        endColumn = input_stream.getEndColumn();
        t = Token.newToken(jjmatchedKind, curTokenImage);

        t.beginLine = beginLine;
        t.endLine = endLine;
        t.beginColumn = beginColumn;
        t.endColumn = endColumn;

        return t;
    }

    /**
     * 获取下一个令牌。
     */
    public Token getNextToken() {
        Token matchedToken;
        int curPos = 0;

        EOFLoop:
        for (; ; ) {
            try {
                curChar = input_stream.BeginToken();
            } catch (java.io.IOException e) {
                jjmatchedKind = 0;
                matchedToken = jjFillToken();
                return matchedToken;
            }

            try {
                input_stream.backup(0);
                while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L) {
                    curChar = input_stream.BeginToken();
                }
            } catch (java.io.IOException e1) {
                continue EOFLoop;
            }
            jjmatchedKind = 0x7fffffff;
            jjmatchedPos = 0;
            curPos = jjMoveStringLiteralDfa0_0();
            if (jjmatchedKind != 0x7fffffff) {
                if (jjmatchedPos + 1 < curPos) {
                    input_stream.backup(curPos - jjmatchedPos - 1);
                }
                if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L) {
                    matchedToken = jjFillToken();
                    return matchedToken;
                } else {
                    continue EOFLoop;
                }
            }
            int error_line = input_stream.getEndLine();
            int error_column = input_stream.getEndColumn();
            String error_after = null;
            boolean EOFSeen = false;
            try {
                input_stream.readChar();
                input_stream.backup(1);
            } catch (java.io.IOException e1) {
                EOFSeen = true;
                error_after = curPos <= 1 ? "" : input_stream.GetImage();
                if (curChar == '\n' || curChar == '\r') {
                    error_line++;
                    error_column = 0;
                } else {
                    error_column++;
                }
            }
            if (!EOFSeen) {
                input_stream.backup(1);
                error_after = curPos <= 1 ? "" : input_stream.GetImage();
            }
            throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
        }
    }

    private void jjCheckNAdd(int state) {
        if (jjrounds[state] != jjround) {
            jjstateSet[jjnewStateCnt++] = state;
            jjrounds[state] = jjround;
        }
    }

    private void jjAddStates(int start, int end) {
        do {
            jjstateSet[jjnewStateCnt++] = jjnextStates[start];
        } while (start++ != end);
    }

    private void jjCheckNAddTwoStates(int state1, int state2) {
        jjCheckNAdd(state1);
        jjCheckNAdd(state2);
    }

    private void jjCheckNAddStates(int start, int end) {
        do {
            jjCheckNAdd(jjnextStates[start]);
        } while (start++ != end);
    }

}
