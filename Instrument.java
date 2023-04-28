// Create a simple program that creates instances of the Guitar and Piano classes and demonstrates the use of the methods in each class. 
// name (a string representing the name of the instrument)
// type (a string representing the type of the instrument, e.g. string, wind, percussion)
class Instrument {      //parent 
    String name;         //instances
    String type;
    String player;      //bonus instance of person playing

    public String getName() {           //getters
        return name;
    }
    public String getPlayer() {
        return player;
    }
    public String getType() {
        return type;
    }
    public void setName(String name) {      //setters
        this.name = name;
    }
    public void setPlayer(String player) {
        this.player = player;
    }
    public void setType(String type) {
        this.type = type;
    }
}
