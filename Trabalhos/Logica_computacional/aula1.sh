public static void main(String[] args) {

        Aulinha m = new Aulinha();

        //m.exemploWhile();

        m.aprendendoFor();

    }

    public void exemploWhile(){

        int i = 0;

        while(i < 7){            

            JOptionPane.showMessageDialog(null,i);

            i++;

        }

    }




    public void aprendendoFor(){

        for(int i = 0; i < 25; i++){

            if(i % 2 == 0 || i % 3 == 0){

                JOptionPane.showMessageDialog(null,i);

            }

        }

    }

}
