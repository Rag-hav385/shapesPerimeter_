import edu.duke.*;
/**
 * Write a description of PerimeterRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PerimeterRunner {
    
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0;
        //Start with prevPt = the last point
        Point prevPt = s.getLastPoint();
        // Foreach point currPt in the shape
        for( Point currPt : s.getPoints()){
            
            //Find distance from prevPt pt to current point
            double distance = prevPt.distance(currPt);
            //update totalPerim = totalPerim + distance
            totalPerim = totalPerim + distance;
            //update prevpt to be currPt.
            prevPt =  currPt;
        }
        
        //TotalPerim is my answer
        return totalPerim;
      
  }

    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        System.out.println("perimeter = " + length);
    }

    public static void main (String[] args) {
        PerimeterRunner pr = new PerimeterRunner();
        pr.testPerimeter();
    }
}


