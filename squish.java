
public class squish{
  public static void main (String [] args){
    double[] inputs = {-1337.1337, -10.5, -5.5, -1.5, -1, -0.3, -0.113, 0, 0.31, 0.76, 1.3, 1.99, 7.4, 160, 1337};
    double[] outputs = new double [inputs.length];
    for (int x=0; x<inputs.length; x++){
      double output = Math.abs (inputs[x]/200);
      if (inputs [x]> 0){
        outputs [x] = 0.5+output;
      }
      else{
        outputs [x] = 0.5-output;
      }
    }
    for (int x=0; x<inputs.length; x++){
      System.out.println ("input: " + inputs[x] + "; output: " + outputs [x]);
    }
  }

}
