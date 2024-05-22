public class Area {
   private double length;
   private double breadth;
 
   // Default constructor
   public Area() {
       this.length = 0;
       this.breadth = 0;
   }
 
   // Method to set dimensions
   public void setDim(double length, double breadth) {
       this.length = length;
       this.breadth = breadth;
   }
 
   // Method to calculate area
   public double getArea() {
       return length * breadth;
   }
 
   // Main method to demonstrate usage
   public static void main(String[] args) {
       Area rectangle = new Area();
       rectangle.setDim(5, 4);
       System.out.println("Area of the rectangle: " + rectangle.getArea());
   }
}
