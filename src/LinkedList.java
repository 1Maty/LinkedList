
    class LinkedList implements Lista {
        public Node head= null;
        @Override
        public Object get(int position) {
            Node coso=head;
            Node respuesta=null;
            for(int indice=0;coso!=null;indice++){
            if(indice==position){
                 respuesta=coso;
            }
                coso=coso.next;
            }
            return  respuesta;
        }


        @Override
        public void add(int value) {

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
            if(position==0){
                head=head.next;
            }
            else{
            for(int indice=0;coso!=null;indice++){
                if (indice==position-1){
                    coso.next=coso.next.next;
                    break;
                }
                coso=coso.next;

            }


        }}
        public boolean seEncuentra(int data){
            Node coso = head;
            boolean esta=false;
            while(coso!=null){
                if(coso.data==data){
                    esta=true;
                }
                coso=coso.next;
            }
            return esta;
        }
        public void addFirst(int value){
            Node nuevo= new Node();
            nuevo.data= value;
            nuevo.next=head;
            head=nuevo;
        }
        public void addLast(int value){
            Node ultimo= new Node();
            ultimo.data=value;
            ultimo.next=null;
            Node coso=head;
            while(coso!=null){
                if(coso.next==null){
                    coso.next=ultimo;
                    break;
                }
                coso=coso.next;
            }
        }
        public static void main(String [] args){
            LinkedList listita = new LinkedList();
            listita.add(1212);
            listita.add(2131);
            listita.add(3434);
            listita.remove(1);
            System.out.println(listita.get(0));
            System.out.println(listita.seEncuentra(3434));
            listita.addFirst(6767);
            listita.addLast(9090);
            Node coso= listita.head;
            while(coso!=null){

                System.out.println(coso.data);
                coso=coso.next;
            }
        }


    }

