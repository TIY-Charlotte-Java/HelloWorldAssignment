class WhoCouldItBeNow {

// establishes a few names as variables and defines what to print


  public static void main(String[] args) {
    String aName = "Grace Connelly";
    String bName = "Sylvia";
    String cName = whoIsIt(aName, bName);

    System.out.println("It is " + cName);
  }




//method for determining the longer name to know who it really is

  public static String whoIsIt(String a,String b) {
    String itIs;
    if (a.length() > b.length())
	itIs = a;
    else 
        itIs = b;
    return itIs;

 }
}

