package inter;

/**
 * 表示语句结点生成
 * */
public class Stmt extends Node {

    public Stmt() {
    }

    public static Stmt Null = new Stmt();

    /**
     * 生成中间代码
     * */
    public void gen(int b, int a) {
    } // called with labels begin and after

    int after = 0;                   // saves label after
    public static Stmt Enclosing = Stmt.Null;  // used for break stmts
}
