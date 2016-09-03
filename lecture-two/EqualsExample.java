// override equal for Name
public boolean equals( Object other )  {
  // check for special cases : short-circuit evaluation
  if( ( other == null ) || ( getClass() != other.getClass() ) {
    return false;
  } else {
    // need to cast it
    Name otherName = (Name) other;

    return ( this.first.equals( otherName.first ) &&
      this.last.equals( otherName.last ) );
  }
}