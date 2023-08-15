//User Defined Code : Real Time Example : AppStore - : Name, noDownloading, Rating

import java.util.*;

class AppStore {
    
	String appName = null;
    	double userDownload = 0.0;      //Downloads in Cr+
	float appRating = 0.0f;         // 10 out off
    	
    	AppStore(String appName, double userDownload, float appRating) {
        
	    	this.appName = appName;
		this.userDownload = userDownload;
		this.appRating = appRating;
	}

    	public String toString() {
        	
		return " { " + appName + " : "+userDownload+" : "+appRating+" } ";
    	}
}

class SortByAppName implements Comparator {
    
	public int compare(Object obj1, Object obj2) {
        
		return ((AppStore)obj1).appName.compareTo(((AppStore)obj2).appName);
    	}
}

class SortByDownload implements Comparator {
    
	public int compare(Object obj1, Object obj2) {
        
		return (int)((((AppStore)obj1).userDownload)-(((AppStore)obj2).userDownload));
    	}
}

class SortByRating implements Comparator {
    
	public int compare(Object obj1, Object obj2) {
        
		return (int)(((((AppStore)obj1).appRating) - ((AppStore)obj2).appRating));
    	}
}

class AppSort {

    	public static void main(String[] args) {
        	
		ArrayList al = new ArrayList();

        	al.add(new AppStore("Instagram",200.0,8.3f));
        	al.add(new AppStore("Facebook",280.0,9.1f));
        	al.add(new AppStore("WhatsApp", 400.0,7.1f));

        	System.out.println("Unsorted List:");
        	System.out.println(al);

        	System.out.println("\nSorted By Application Name:");
        	Collections.sort(al, new SortByAppName());
        	System.out.println(al);

       		System.out.println("\nSorted By User Download:");
        	Collections.sort(al, new SortByDownload());
        	System.out.println(al);

        	System.out.println("\nSorted By App Rating:");
        	Collections.sort(al, new SortByRating());
        	System.out.println(al);
    	
	}
}

