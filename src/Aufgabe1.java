public static class Aufgabe1 {


    public int[] fail_noten(int[] noten){
        int[] new_noten = new int[noten.length];
        int ct = 0;

        for(int note : noten){
            if(note < 40){
                new_noten[ct++] = note;
            }
        }

        return new_noten;
    }
    public double durchschnitt(int[] noten) {
        double sum = 0;

        for(int note : noten){
            sum += note;
        }

        return sum / noten.length;
    }

    public int[] aufrunden(int[] noten){

        for(int i = 0; i < noten.length; i++){
            if(noten[i] > 100) noten[i] = 100;

            if(noten[i] < 0) noten[i] = 0;

            if(noten[i] >= 38){
                int x = 40;

                while(x < noten[i]){
                    x += 5;
                }

                if(x - noten[i] < 3) noten[i] = x;
            }

        }

        return noten;
    }

    public int max_aufrunden_note(int[] noten){
        int max_note = noten[0], aufrundung = 0;


        for(int i = 0; i < noten.length; i++){
            if(noten[i] > 100) noten[i] = 100;

            if(noten[i] < 0) noten[i] = 0;

            if(noten[i] >= 38){
                int x = 40;
                while(x < noten[i]){
                    x += 5;
                }

                if(x - noten[i] < 3) {
                    if(aufrundung < x - noten[i]){
                        aufrundung = x - noten[i];
                        max_note = noten[i];
                    }
                    noten[i] = x;
                }
            }

        }

        return max_note;
    }
}


void main() {
    int[] noten = {84,100,38,20,60,65,62};


//    for(int note : noten){
//        System.out.print(note);
//        System.out.print(' ');
//    }

    Aufgabe1 aufgabe1 = new Aufgabe1();

    System.out.println(aufgabe1.durchschnitt(noten));
    noten = aufgabe1.fail_noten(noten);

    for(int note : noten){
        if(note != 0){
            System.out.print(note);
            System.out.print(' ');
        }
    }

    System.out.println(aufgabe1.max_aufrunden_note(noten));



}