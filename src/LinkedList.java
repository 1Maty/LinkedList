import javax.sound.sampled.Line;

class LinkedList implements Lista {
    public Node head= null;
     @Override
     public Object get(int position) {
         return null;
     }

     @Override
     public void add(Object value) {

         Node aAñadir = new Node();
         aAñadir.data = value;
         aAñadir.next = null;
         if (head==null){
             head=aAñadir;
         }
         else{
             Node coso=head;
         while (coso.next!= null) {
             coso=coso.next;
         }
         coso.next=aAñadir;
     }}

     @Override
     public void remove(int position) {
         Node coso=head;
         for(int indice=0;coso.next!=null;indice++){
             System.out.println(indice);
             Node elPrimero = null;
             coso=coso.next;
             if (indice==position-1){
                 elPrimero =coso.next;
             }
             if (indice==position){
                 coso.next=elPrimero;
             }

         }


     }
     public static void main(String [] args){
         LinkedList listita = new LinkedList();
         listita.add(1212);
         listita.add(2131);
         listita.add("asdasda");
         listita.remove(1);
         Node coso= listita.head;

         while(coso!=null){

             System.out.println(coso.data);
             coso=coso.next;
         }
     }


 }
