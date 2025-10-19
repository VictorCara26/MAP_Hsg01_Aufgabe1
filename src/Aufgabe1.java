public class Aufgabe1 {

    public int[] aufrunden(int noten[]){

        for(int note : noten){

            if(note > 100) note = 100;

            if(note < 0) note = 0;

            if(note >= 38){
                int x = 40;

                while(x < note){
                    x += 5;
                }

                if(x - note < 3) note = x;
            }

        }

        return noten;
    }

}
