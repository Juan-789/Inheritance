public class Guitar extends Instrument{     //son class
    private int numStrings = 6;     //instance

    public static void main(String[] args) {
        Guitar guitarObj = new Guitar();        //creating object
        guitarObj.setName("Torres Rosewood 1869 guitar");   //setting
        guitarObj.setPlayer("Francisco Tárrega");
        guitarObj.setType("String");
        System.out.println(guitarObj.getPlayer()+ " plays a "+ guitarObj.getName()+", which is a "+guitarObj.getType()+" instrument of "+guitarObj.getNumStrings()+" strings.");      //printing
    }
    private int getNumStrings() {       //getter
        return numStrings;
    }
}