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

        return Math.floor(sum / noten.length * 100) / 100;
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
        int max_note = -1;

        noten = aufrunden(noten);

        for(int note : noten){
                if(note > max_note) max_note = note;
            }

        return max_note;
    }
}


void main() {
    int[] noten = {29, 37, 38, 41, 84, 67};


    for(int note : noten){
        System.out.print(note);
        System.out.print(' ');
    }

    Aufgabe1 aufgabe1 = new Aufgabe1();

    int[] failnoten = aufgabe1.fail_noten(noten);

    System.out.print('\n');
    for(int note : failnoten){
        if(note != 0){
            System.out.print(note);
            System.out.print(' ');
        }
    }

    System.out.print('\n');
    System.out.println(aufgabe1.durchschnitt(noten));

    int[] abgerundet = aufgabe1.aufrunden(noten);

    for(int note : abgerundet){
        if(note != 0){
            System.out.print(note);
            System.out.print(' ');
        }
    }

    System.out.print('\n');
    System.out.println(aufgabe1.max_aufrunden_note(noten));



}