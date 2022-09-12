public class TestMemberOuter {
    public void show(){
        System.out.println(" Show Method");
        Inner inner = new Inner();
        inner.msg();

    {
       private void msg(){
        System.out.println("Inner method");
    }
    }
    public static void main(String[] args){
        TestMemberOuter tmo = new TestMemberOuter();
        tmo.show();

        TestMemberOuter.Inner ino = tmo.new Inner();
        ino.msg();
    }


}
