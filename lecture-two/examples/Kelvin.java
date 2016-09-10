

public class Kelvin {
  private int temperature;

  public void setTemparature( int temp ) throws BadTemperature {
    if( temp < 0 ) {
      throw new BadTemperature( "Invalid value " + temp );
    }

    this.temperature = temp;
  }

  public static void main( String[] args ) throws BadTemperature {
    Kelvin kelvin = new Kelvin();

    kelvin.setTemparature( 50 );
    kelvin.setTemparature( - 1 );
  }
}

class BadTemperature extends Exception {
  BadTemperature( String reason ) {
    super( reason );
  }
}