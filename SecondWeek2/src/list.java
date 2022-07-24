public class list<T>{
    private node<T> first;
    private node<T> current;
    public static class node<T>{
        T data;
        node<T> pre;
        node<T> next;

        public node(T data) {
            this.data = data;
        }
        public node() {
            super();
        }
    }
    public list(){
        this.first = new node<>();
        this.current = new node<>();

        first.next = current;
        first.pre = null;
        current.next = null;
        current.pre = first;
    }
    public void add(T num) {
        node<T> p1 = new node<>(num);
        if (first.next == null) {
            first.next = p1;
            first.next.pre = null;
            first.next.next = null;
            current = first.next;
        } else {
            current.next = p1;
            p1.pre = current;
            current = p1;
        }
    }
    public void del(T num){
        if(first.next==null) System.out.println("链表为空，无法删除");
        else{
            node<T> p3=first.next;
            while(true){
                if(p3.data==num){
                    if(p3.next==null) {
                        p3=null;
                        first.next=null;
                        System.out.println("已删除所有的"+num);
                        return;
                    }else{
                        p3 = p3.next;
                        p3.pre.next=null;
                        p3.pre=null;
                        first.next=p3;
                        continue;
                    }
                }else{
                    while(p3.next!=null){
                        if(p3.data==num){
                            p3.pre.next=p3.next;
                            p3.next.pre = p3.pre;
                            node<T> temp =p3.pre;
                            p3.next=null;
                            p3.pre=null;
                            p3=temp;
                        }
                        p3=p3.next;
                    }
                    if(p3.data==num){
                        p3.pre.next=null;
                        p3.pre=null;
                    }
                    System.out.println("已删除所有的"+num);
                    return;
                }

            }
        }

    }

    public void find(T num){
        if(first.next==null){
            System.out.println("链表为空");
        }else{
            node<T> p2=first.next;
            while(p2!=null) {
                if(p2.data==num) {
                    System.out.println("该链表包含"+num);
                    return;
                }else {
                    p2=p2.next;
                }
            }
            System.out.println("该链表不包含"+num);
        }
    }
    public void all(){
        if(first.next==null) {
            System.out.println("双向链表为空");
        }else {
            node<T> p4 = first.next;
            while(p4.next!=null) {
                System.out.print(p4.data+"<->");
                p4=p4.next;
            }
            System.out.println(p4.data);
        }
    }

    public void turn(){
        node<T> p5=first.next;
        while(p5.next!=null){
            p5=p5.next;
        }
        current=p5;
        if (first.next == current) {
            return;
        }
        node<T> rh = new node<>();
        rh.next = current;
        node<T> cur = first.next;
        node<T> cn;
        while (cur != current) {
            cn = cur.next;
            cur.next = rh.next;
            rh.next.pre = cur;
            cur.pre = rh;
            rh.next = cur;
            cur = cn;
        }

        rh.next.pre = first;
        first.next = rh.next;





    }

}

