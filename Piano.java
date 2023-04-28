class Piano extends Instrument{     //son piano
    private int numKeys = 88;       //instance

    public static void main(String[] args) {
        Piano pianoObj = new Piano();       //creating object
        pianoObj.setName("Pleyel Grand Piano");     //setting values
        pianoObj.setPlayer("Frédéric Chopin");
        pianoObj.setType("Chordophone");
        System.out.println(pianoObj.getPlayer()+ " plays a "+ pianoObj.getName()+ " "+ pianoObj.getType()+", which is a "+pianoObj.getType()+" instrument of " +pianoObj.getNumKeys()+" keys.");     //printing
    }
    private int getNumKeys() {      //getter
        return numKeys;
    }
}