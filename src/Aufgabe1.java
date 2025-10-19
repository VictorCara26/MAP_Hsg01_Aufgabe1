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



}


void main() {
    int[] noten = {84,100,38,20,60,65,62};

    for(int note : noten){
        System.out.print(note);
        System.out.print(' ');
    }
    Aufgabe1 aufgabe1 = new Aufgabe1();
    noten = aufgabe1.fail_noten(noten);
    System.out.println();

    for(int note : noten){
        if(note != 0){
            System.out.print(note);
            System.out.print(' ');
        }
    }


}