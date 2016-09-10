

public class Kelvin {
  private int temperature;

  public void setTemparature( int temp ) throws BadTemperature {
    if( temp < 0 ) {
      throw new BadTemperature( "Invalid value " + temp );
    }

    this.temperature = temp;
  }

  public static void main( String[] args ) {
    Kelvin kelvin = new Kelvin();

    try {
      kelvin.setTemparature( 50 );
      kelvin.setTemparature( - 1 );
    } catch( BadTemperature badTempExc ) {
      System.out.println( badTempExc.getMessage() );
      badTempExc.printStackTrace();
    } finally {
      System.out.println( "We're done!" );
    }
  }
}

class BadTemperature extends Exception {
  BadTemperature( String reason ) {
    super( reason );
  }
}