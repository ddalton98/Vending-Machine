/**
*	A coin
*/
public class Coin {
    private double value;
    private String name;

	/**
	*	Constructs a coin with a given value and name
	*	@param value
	*	@param name
	*/
    Coin(double value, String name){
        this.value = value;
        this.name = name;
    }

	/**
	*	Returns the value of the coin
	*	@return value
	*/
    double getValue(){
        return value;
    }

	/**
	*	Overrides the default toString for coin
	* 	returns the name of the coin
	*	@return name
	*/
    public String toString(){
        return name;
    }
}
