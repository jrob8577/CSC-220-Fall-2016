String fileName = "data.txt";
Scanner fromFile = null;

System.out.println( "The file " + fileName + " contains the following lines:" );

try {
  fromFile = new Scanner( new File( fileName ));
} catch( FileNotFoundException e ) {
  System.out.println( "Error opening the file " + fileName );
  System.exit( 0 );
}

while( fromFile.hasNextLine() ) {
  String line = fromFile.nextLine();
  System.out.println( line );
}

fromFile.close()