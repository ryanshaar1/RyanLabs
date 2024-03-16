package ryanlabs;
                                                                                                                                      
public class Maarahot4ex1part1 {
	int j = 0;
	int i = 0;
	while (i < 9) {
	    if (Math.abs(a[i] - a[i + 1]) == 1) {
	        b[j] = a[i];
	        j++;
	        b[j] = a[i + 1];
	        j++;
	    }
	    i++;
	}

}
