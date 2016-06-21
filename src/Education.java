
public class Education {
	
		public String[] setHist(){
			String edHist[] = new String[10];
			for (int i=0;i<10;i++){
				edHist[i]="unknown";
			}
			
			return edHist;
		}
	
		public String toString(){	
			
			System.out.println(setHist());
			return null; 
		}
}
