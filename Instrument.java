import javax.xml.transform.Templates;

//Create a superclass called Instrument with the following attributes:

// name (a string representing the name of the instrument)
// type (a string representing the type of the instrument, e.g. string, wind, percussion)

// The Instrument class should also have the following methods:

// getName() which returns the name of the instrument.
// getType() which returns the type of the instrument.
// Create two subclasses of Instrument called Guitar and Piano.

// The Guitar subclass should have an additional attribute called numStrings which represents the number of strings on the guitar. 
// It should also have the following method:

// getNumStrings() which returns the number of strings on the guitar.
// The Piano subclass should have an additional attribute called numKeys which represents the number of keys on the piano. 
// It should also have the following method:

// getNumKeys() which returns the number of keys on the piano.

// Create a simple program that creates instances of the Guitar and Piano classes and demonstrates the use of the methods in each class. 

public class Instrument {
    String name;
    String type;
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    class Guitar{
        int numStrings;
        public int getNumStrings() {
            return numStrings;
        }
    }
    class Piano{
        int numKeys;
        public int getNumKeys() {
            return numKeys;
        }
    }
}
