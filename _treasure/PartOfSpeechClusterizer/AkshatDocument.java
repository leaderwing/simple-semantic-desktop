 
import java.util.*;

    public class AkshatDocument{
	Hashtable<String,int[]> posCounts;
	String name;
	int tokenCount;
	int index;
	double[] distances;
	AkshatDocument(String a, Hashtable<String,int[]> b, int c, int d){
	    posCounts=b;
	    name=a;
	    tokenCount=c+1;
	    index=d;
	}

	public String toString(){
	    return name;
	}
	public  void setDistances(double[] d){
	    distances=d;
	}
    }