/* Generated By:JJTree: Do not edit this line. ASTdeclarationList.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTdeclarationList extends SimpleNode {
  public ASTdeclarationList(int id) {
    super(id);
  }

  public ASTdeclarationList(MyCompiler p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(MyCompilerVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=e9c33aa07ddaf9650cc3f37f3f81dff1 (do not edit this line) */