/*
Author: Sierra Andersen
Date: 01 Feb 2023

Description: This program sorts an array of Geometric Objects.
*/
import java.util.Comparator;

public class Exercise20_21 {
  public static void main(String[] args) {
    GeometricObject[] list = {new Circle(5), new Rectangle(4, 5),
        new Circle(5.5), new Rectangle(2.4, 5), new Circle(0.5), 
        new Rectangle(4, 65), new Circle(4.5), new Rectangle(4.4, 1),
        new Circle(6.5), new Rectangle(4, 5)};

    Circle[] list1 = {new Circle(2), new Circle(3), new Circle(2),
      new Circle(5), new Circle(6), new Circle(1), new Circle(2),
      new Circle(3), new Circle(14), new Circle(12)};
    
    selectionSort(list1, new GeometricObjectComparator());
    for (int i = 0; i < list1.length; i++)
      System.out.println(list1[i].getArea() + " ");
  }
  
  public static <E> void selectionSort(E[] list, Comparator<? super E> comparator) {
	  for (int i = 0; i<list.length; i++) {
		  E currentMin = list[i];
		  int currentMinIndex = i;
		  
		  for(int j = i+1; j<list.length; j++ ) {
			  if(comparator.compare(list[i], list[j]) > 0){
				  currentMin = list[j];
				  currentMinIndex = j;
			  }
		  }
		  list[currentMinIndex] = list[i];
		  list[i] = currentMin;
	  }
  }
}