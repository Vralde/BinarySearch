public class BinarySearch {
//algoritmen til binary search


    public static int BinarySearch(int[] arr, int key, int min, int max){
    //uhm
        int index = -1;
        while(min <= max){
        //while'en her sørger for, at maximum ikke er det laveste tal
            int mid = (min + max) / 2;
            //så laver vi en int, der tager det midterste tal
            if(arr[mid] < key){
            //vi tjekker så om det midterste tal er højere eller lavere
            //end "key", altså det tal der skal findes
                min = mid + 1;
                //hvis midten var lavere, så gør vi minimum 1 højere
                //end det midten lige var, så vi ikke gætter på tal der
                //er lavere end det
            }
            else if(arr[mid] > key){
                max = mid - 1;
                //hvis midten var højere, så gør vi maximum 1 lavere
                //end det midten lige var, så vi ikke gætter på tal der
                //er højere end det
            }
            else if(arr[mid] == key){
                index = mid;
                //hvis midten ramte rigtigt, så sætter vi index til 
                //det samme tal, hvilket vi returner senere
                break;
                //hvorefter vi så "breaker" den while vi er i
            }
        }
        return index;
        //vi returner indexet, så vi senere i koden kan tjekke, om vi
        //overhovedet fik et resultat, eller så ville index være = -1
        //da vi siger den skal være "-1" tidligere i koden
    }
    public static void main(String[] args){
    //"void setup"
        int[] arr = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        //selve arraylisten med tal
        int key = 50;
        //det tal der skal findes
        int min = 0;
        //minimum er sat til 0, da alle arrays første plads, hedder "0"
        int max = arr.length-1;
        //maximum bliver nemt sat til 9, ved at tage længden af arraylisten
        //og trække 1 fra (da listen starter på 0, og ikke 1)
        int index = BinarySearch(arr, key, min, max);
        //her tjekker vi så, om BinarySearch har sat index til enten
        //-1, eller et andet tal
        if(index == -1){
            System.out.println(key+" er ikke med i arraylisten");
            //hvis index = -1, så får vi af vide, at key ikke indgår
            //i selve arraylisten
        }
        else{
            System.out.println(key+" er tallet, og det ligger på plads nr. "+index);
            //ellers får vi af vide hvad tallet er, samt hvilket index(plads)
            //det står på
        }
    }
    
}
