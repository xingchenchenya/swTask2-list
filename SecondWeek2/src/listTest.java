public class listTest {
    public static void main(String[] args) {
        list<Integer> listT=new list<>();

    try{
        listT.add(30);
        listT.add(20);
        listT.add(50);
        listT.add(30);
        listT.all();
        listT.add(60);
        listT.add(20);
        listT.add(10);
        listT.add(30);
        listT.find(10);
        listT.find(0);
        listT.add(40);
        listT.all();
        listT.del(30);
        listT.del(0);
        listT.all();
        listT.turn();
        listT.all();

    }
    catch(Exception e){
        System.out.println(e);
    }
    }
}
